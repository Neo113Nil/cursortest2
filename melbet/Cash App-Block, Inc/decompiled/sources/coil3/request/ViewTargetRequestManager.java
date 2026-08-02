package coil3.request;

import android.graphics.Bitmap;
import android.os.Looper;
import android.view.View;
import coil3.disk.DiskLruCache$launchCleanup$1;
import coil3.util.Utils_androidKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DeferredCoroutine;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* loaded from: classes3.dex */
public final class ViewTargetRequestManager implements View.OnAttachStateChangeListener {
    public ViewTargetDisposable currentDisposable;
    public ViewTargetRequestDelegate currentRequest;
    public boolean isRestart;
    public StandaloneCoroutine pendingClear;
    public final View view;

    public ViewTargetRequestManager(View view) {
        this.view = view;
    }

    public final synchronized void dispose() {
        try {
            StandaloneCoroutine standaloneCoroutine = this.pendingClear;
            Continuation continuation = null;
            if (standaloneCoroutine != null) {
                standaloneCoroutine.cancel(null);
            }
            GlobalScope globalScope = GlobalScope.INSTANCE;
            DefaultScheduler defaultScheduler = Dispatchers.Default;
            this.pendingClear = JobKt.launch$default(globalScope, MainDispatcherLoader.dispatcher.immediate, null, new DiskLruCache$launchCleanup$1(this, continuation, 24), 2);
            this.currentDisposable = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized ViewTargetDisposable getDisposable(DeferredCoroutine deferredCoroutine) {
        ViewTargetDisposable viewTargetDisposable = this.currentDisposable;
        if (viewTargetDisposable != null) {
            Bitmap.Config[] configArr = Utils_androidKt.VALID_TRANSFORMATION_CONFIGS;
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper()) && this.isRestart) {
                this.isRestart = false;
                viewTargetDisposable.job = deferredCoroutine;
                return viewTargetDisposable;
            }
        }
        StandaloneCoroutine standaloneCoroutine = this.pendingClear;
        if (standaloneCoroutine != null) {
            standaloneCoroutine.cancel(null);
        }
        this.pendingClear = null;
        ViewTargetDisposable viewTargetDisposable2 = new ViewTargetDisposable(this.view, deferredCoroutine);
        this.currentDisposable = viewTargetDisposable2;
        return viewTargetDisposable2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.currentRequest;
        if (viewTargetRequestDelegate == null) {
            return;
        }
        this.isRestart = true;
        viewTargetRequestDelegate.imageLoader.enqueue(viewTargetRequestDelegate.initialRequest);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.currentRequest;
        if (viewTargetRequestDelegate != null) {
            viewTargetRequestDelegate.dispose();
        }
    }
}

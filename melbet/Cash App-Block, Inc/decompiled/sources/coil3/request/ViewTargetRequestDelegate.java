package coil3.request;

import android.widget.ImageView;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import coil3.RealImageLoader;
import coil3.RealImageLoader$execute$3;
import coil3.target.ImageViewTarget;
import coil3.util.LifecyclesKt;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.Job;

/* loaded from: classes3.dex */
public final class ViewTargetRequestDelegate implements RequestDelegate, DefaultLifecycleObserver {
    public final RealImageLoader imageLoader;
    public final ImageRequest initialRequest;
    public final Job job;
    public final Lifecycle lifecycle;
    public final ImageViewTarget target;

    public ViewTargetRequestDelegate(RealImageLoader realImageLoader, ImageRequest imageRequest, ImageViewTarget imageViewTarget, Lifecycle lifecycle, Job job) {
        this.imageLoader = realImageLoader;
        this.initialRequest = imageRequest;
        this.target = imageViewTarget;
        this.lifecycle = lifecycle;
        this.job = job;
    }

    @Override // coil3.request.RequestDelegate
    public final void assertActive() {
        ImageView imageView = this.target.view;
        if (imageView.isAttachedToWindow()) {
            return;
        }
        ViewTargetRequestManager requestManager = ViewTargetRequestManagerKt.getRequestManager(imageView);
        ViewTargetRequestDelegate viewTargetRequestDelegate = requestManager.currentRequest;
        if (viewTargetRequestDelegate != null) {
            viewTargetRequestDelegate.dispose();
        }
        requestManager.currentRequest = this;
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    @Override // coil3.request.RequestDelegate
    public final Object awaitStarted(RealImageLoader$execute$3 realImageLoader$execute$3) {
        Object awaitStarted;
        Lifecycle lifecycle = this.lifecycle;
        return (lifecycle == null || (awaitStarted = LifecyclesKt.awaitStarted(lifecycle, realImageLoader$execute$3)) != CoroutineSingletons.COROUTINE_SUSPENDED) ? Unit.INSTANCE : awaitStarted;
    }

    public final void dispose() {
        this.job.cancel(null);
        ImageViewTarget imageViewTarget = this.target;
        boolean z = imageViewTarget instanceof LifecycleObserver;
        Lifecycle lifecycle = this.lifecycle;
        if (z && lifecycle != null) {
            lifecycle.removeObserver(imageViewTarget);
        }
        if (lifecycle != null) {
            lifecycle.removeObserver(this);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        ViewTargetRequestManagerKt.getRequestManager(this.target.view).dispose();
    }

    @Override // coil3.request.RequestDelegate
    public final void start() {
        Lifecycle lifecycle = this.lifecycle;
        if (lifecycle != null) {
            lifecycle.addObserver(this);
        }
        ImageViewTarget imageViewTarget = this.target;
        if ((imageViewTarget instanceof LifecycleObserver) && lifecycle != null) {
            ImageViewTarget imageViewTarget2 = imageViewTarget;
            lifecycle.removeObserver(imageViewTarget2);
            lifecycle.addObserver(imageViewTarget2);
        }
        ViewTargetRequestManager requestManager = ViewTargetRequestManagerKt.getRequestManager(imageViewTarget.view);
        ViewTargetRequestDelegate viewTargetRequestDelegate = requestManager.currentRequest;
        if (viewTargetRequestDelegate != null) {
            viewTargetRequestDelegate.dispose();
        }
        requestManager.currentRequest = this;
    }
}

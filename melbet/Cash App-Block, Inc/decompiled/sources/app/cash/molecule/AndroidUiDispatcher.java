package app.cash.molecule;

import android.os.Handler;
import android.view.Choreographer;
import bo.app.u4$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes.dex */
public final class AndroidUiDispatcher extends CoroutineDispatcher {
    public static final Lazy Main$delegate = LazyKt.lazy(new u4$$ExternalSyntheticLambda0(14));
    public final Choreographer choreographer;
    public final AndroidUiFrameClock frameClock;
    public final Handler handler;
    public boolean scheduledFrameDispatch;
    public boolean scheduledTrampolineDispatch;
    public final Object lock = new Object();
    public final ArrayDeque toRunTrampolined = new ArrayDeque();
    public ArrayList toRunOnFrame = new ArrayList();
    public ArrayList spareToRunOnFrame = new ArrayList();
    public final AndroidUiDispatcher$dispatchCallback$1 dispatchCallback = new AndroidUiDispatcher$dispatchCallback$1(this, 0);

    public AndroidUiDispatcher(Choreographer choreographer, Handler handler) {
        this.choreographer = choreographer;
        this.handler = handler;
        this.frameClock = new AndroidUiFrameClock(choreographer);
    }

    public static final void access$performTrampolineDispatch(AndroidUiDispatcher androidUiDispatcher) {
        Runnable runnable;
        boolean z;
        do {
            synchronized (androidUiDispatcher.lock) {
                runnable = (Runnable) androidUiDispatcher.toRunTrampolined.removeFirstOrNull();
            }
            while (runnable != null) {
                runnable.run();
                synchronized (androidUiDispatcher.lock) {
                    runnable = (Runnable) androidUiDispatcher.toRunTrampolined.removeFirstOrNull();
                }
            }
            synchronized (androidUiDispatcher.lock) {
                if (androidUiDispatcher.toRunTrampolined.isEmpty()) {
                    z = false;
                    androidUiDispatcher.scheduledTrampolineDispatch = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        coroutineContext.getClass();
        runnable.getClass();
        synchronized (this.lock) {
            this.toRunTrampolined.addLast(runnable);
            if (!this.scheduledTrampolineDispatch) {
                this.scheduledTrampolineDispatch = true;
                this.handler.post(this.dispatchCallback);
                if (!this.scheduledFrameDispatch) {
                    this.scheduledFrameDispatch = true;
                    this.choreographer.postFrameCallback(this.dispatchCallback);
                }
            }
        }
    }
}

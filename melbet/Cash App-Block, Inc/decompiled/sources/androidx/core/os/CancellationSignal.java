package androidx.core.os;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import androidx.transition.Transition;

/* loaded from: classes3.dex */
public final class CancellationSignal {
    public boolean mCancelInProgress;
    public boolean mIsCanceled;
    public Object mOnCancelListener;

    public void cancel() {
        synchronized (this) {
            try {
                if (this.mIsCanceled) {
                    return;
                }
                this.mIsCanceled = true;
                this.mCancelInProgress = true;
                PreviewView$1$$ExternalSyntheticLambda2 previewView$1$$ExternalSyntheticLambda2 = (PreviewView$1$$ExternalSyntheticLambda2) this.mOnCancelListener;
                if (previewView$1$$ExternalSyntheticLambda2 != null) {
                    try {
                        Runnable runnable = (Runnable) previewView$1$$ExternalSyntheticLambda2.f$0;
                        Transition transition = (Transition) previewView$1$$ExternalSyntheticLambda2.f$1;
                        Runnable runnable2 = (Runnable) previewView$1$$ExternalSyntheticLambda2.f$2;
                        if (runnable == null) {
                            transition.cancel();
                            runnable2.run();
                        } else {
                            runnable.run();
                        }
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.mCancelInProgress = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                synchronized (this) {
                    this.mCancelInProgress = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }
}

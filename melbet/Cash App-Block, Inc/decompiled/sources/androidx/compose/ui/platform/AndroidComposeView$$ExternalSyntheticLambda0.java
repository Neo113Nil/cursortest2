package androidx.compose.ui.platform;

import android.os.Trace;
import android.view.MotionEvent;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class AndroidComposeView$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AndroidComposeView f$0;

    public /* synthetic */ AndroidComposeView$$ExternalSyntheticLambda0(AndroidComposeView androidComposeView, int i) {
        this.$r8$classId = i;
        this.f$0 = androidComposeView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        AndroidComposeView androidComposeView = this.f$0;
        switch (i) {
            case 0:
                ArrayDeque arrayDeque = androidComposeView.outOfFrameQueue;
                Class cls = AndroidComposeView.systemPropertiesClass;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!arrayDeque.isEmpty()) {
                    try {
                        ((Function0) arrayDeque.removeLast()).invoke();
                    } finally {
                        Trace.endSection();
                    }
                }
                return;
            default:
                androidComposeView.hoverExitReceived = false;
                MotionEvent motionEvent = androidComposeView.previousMotionEvent;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    androidComposeView.m921sendMotionEvent8iAsVTc(motionEvent);
                    return;
                } else {
                    a$$ExternalSyntheticBUOutline0.m$1("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
        }
    }
}

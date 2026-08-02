package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class pe0 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ AndroidComposeView s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pe0(AndroidComposeView androidComposeView, int i) {
        super(0);
        this.r = i;
        this.s = androidComposeView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int actionMasked;
        ie0 ie0Var;
        switch (this.r) {
            case 0:
                return new hqe(ghh.n(this.s));
            case 1:
                AndroidComposeView androidComposeView = this.s;
                MotionEvent motionEvent = androidComposeView.X0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    androidComposeView.Y0 = SystemClock.uptimeMillis();
                    androidComposeView.post(androidComposeView.b1);
                }
                return Unit.a;
            default:
                ie0Var = this.s.get_viewTreeOwners();
                return ie0Var;
        }
    }
}

package defpackage;

import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class jj0 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ oj0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jj0(oj0 oj0Var, int i) {
        super(1);
        this.r = i;
        this.s = oj0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean dispatchTouchEvent;
        switch (this.r) {
            case 0:
                uzj uzjVar = (uzj) obj;
                AndroidComposeView androidComposeView = uzjVar instanceof AndroidComposeView ? (AndroidComposeView) uzjVar : null;
                oj0 oj0Var = this.s;
                if (androidComposeView != null) {
                    ha0 ha0Var = new ha0(4, androidComposeView, oj0Var);
                    gpi gpiVar = androidComposeView.a1;
                    if (gpiVar.f(ha0Var) < 0) {
                        gpiVar.a(ha0Var);
                    }
                }
                oj0Var.removeAllViewsInLayout();
                return Unit.a;
            default:
                MotionEvent motionEvent = (MotionEvent) obj;
                int actionMasked = motionEvent.getActionMasked();
                oj0 oj0Var2 = this.s;
                switch (actionMasked) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        dispatchTouchEvent = oj0Var2.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        dispatchTouchEvent = oj0Var2.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(dispatchTouchEvent);
        }
    }
}

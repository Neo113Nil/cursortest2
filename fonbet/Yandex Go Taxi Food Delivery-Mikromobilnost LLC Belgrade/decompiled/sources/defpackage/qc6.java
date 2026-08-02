package defpackage;

import android.view.View;
import com.yandex.go.payments.cards.ui.LoyaltyProgramView;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class qc6 extends wys {
    public static final /* synthetic */ int T = 0;
    public static final /* synthetic */ int U = 0;
    public static final /* synthetic */ int V = 0;
    public final /* synthetic */ int R;
    public final Object S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc6(yss0 yss0Var) {
        super(yss0Var.asView());
        this.R = 1;
        this.S = yss0Var;
    }

    @Override // defpackage.wys
    public boolean X() {
        switch (this.R) {
            case 0:
                return false;
            default:
                return super.X();
        }
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        int i = this.R;
        Object obj2 = this.S;
        switch (i) {
            case 0:
                bd6 bd6Var = (bd6) obj;
                RobotoTextView robotoTextView = (RobotoTextView) obj2;
                robotoTextView.setText(bd6Var.a);
                int i2 = mrg0.go_design_m_space;
                View view = this.a;
                xw31.E(robotoTextView, Integer.valueOf(c.d(i2, view)), Integer.valueOf(tje.u(bd6Var.b, view.getContext())), Integer.valueOf(tje.r(mrg0.go_design_m_space, view.getContext())), Integer.valueOf(tje.u(bd6Var.c, view.getContext())));
                break;
            case 1:
                ((yss0) obj2).render(((rx1) obj).a, false, new uz1(0));
                break;
            default:
                ((LoyaltyProgramView) obj2).bind((kvz) obj);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qc6(View view, int i) {
        super(view);
        this.R = i;
        this.S = view;
    }
}

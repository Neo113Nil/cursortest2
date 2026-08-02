package defpackage;

import android.view.View;
import com.yandex.go.superapp.orders.card.OrderCardView;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.ui.orders.card.base.a;

/* loaded from: classes14.dex */
public class v501 extends wys implements co70 {
    public final OrderCardView R;
    public final w301 S;
    public final hbp0 T;
    public String U;

    public v501(View view, pav pavVar, wn70 wn70Var, f2z f2zVar, OrderCardView orderCardView, w301 w301Var) {
        super(view);
        this.R = orderCardView;
        this.S = w301Var;
        String d = qoi0.a(getClass()).d();
        hbp0 hbp0Var = new hbp0(new czo0(15), d == null ? "" : d, null);
        this.T = hbp0Var;
        orderCardView.init(wn70Var, hbp0Var, pavVar, new jhu0(this), new a(this, f2zVar));
        orderCardView.setState(xn70.a);
    }

    @Override // defpackage.wys
    public void Y() {
        super.Y();
        this.T.b();
        this.U = null;
    }

    @Override // defpackage.xwy0, defpackage.nwy0
    public final void applyTheme(ThemeType themeType) {
        xvy0.b(this.a, themeType, true, new x5s0(17, this));
    }

    @Override // defpackage.wys
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public void c(zb5 zb5Var) {
        this.U = zb5Var.getId();
        hbp0 hbp0Var = this.T;
        if (!hbp0Var.d()) {
            hbp0Var.a();
        }
        this.R.setState(zb5Var.l());
    }
}

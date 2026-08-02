package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ru.yandex.taxi.cashback.sdk.c0;
import ru.yandex.taxi.cashback.view.a;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.plaque.PlaqueView;
import ru.yandex.taxi.plus.sdk.micro_widget.composite.b;

/* loaded from: classes14.dex */
public final class q49 extends qgb1 {
    public final PlaqueView a;
    public final hy60 b;
    public final /* synthetic */ a c;

    public q49(a aVar) {
        this.c = aVar;
        fkd fkdVar = aVar.d;
        View view = aVar.a;
        Context context = view.getContext();
        String str = aVar.c;
        lb7 lb7Var = aVar.g;
        wf8 wf8Var = fkdVar.a;
        PlaqueView plaqueView = new b(context, lb7Var, (qmc0) wf8Var.a.get(), str, (xe20) wf8Var.b.get(), (c2d0) wf8Var.c.get(), (ru.yandex.taxi.plus.sdk.micro_widget.repository.a) wf8Var.d.get(), (c0) wf8Var.e.get(), (tt2) wf8Var.f.get(), (ljz0) wf8Var.g.get()).h;
        this.a = plaqueView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int d = c.d(mrg0.go_design_m_space, view);
        int d2 = c.d(mrg0.go_design_m_space, view);
        int r = tje.r(mrg0.go_design_s_space, view.getContext());
        int r2 = tje.r(hsg0.plus_badge_bottom_margin, view.getContext());
        layoutParams.setMarginStart(d);
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = d2;
        layoutParams.setMarginEnd(r);
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = r2;
        plaqueView.setLayoutParams(layoutParams);
        this.b = new hy60(new ky7(14, aVar, this));
    }

    @Override // defpackage.qgb1
    public final void c(ViewGroup viewGroup) {
        hy60 hy60Var = this.b;
        PlaqueView plaqueView = this.a;
        plaqueView.removePlaqueStateListener(hy60Var);
        this.c.b.setTouchDelegate(null);
        viewGroup.removeView(plaqueView);
    }

    public final void d(ViewGroup viewGroup) {
        PlaqueView plaqueView = this.a;
        viewGroup.addView(plaqueView);
        plaqueView.addPlaqueStateListener(this.b);
    }
}

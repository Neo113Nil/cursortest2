package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes13.dex */
public final class zrj extends trj {
    public final pav O;
    public final cqj P;
    public g18 Q;

    public zrj(ViewGroup viewGroup, pav pavVar, cqj cqjVar) {
        super(oo31.f(viewGroup, dvh0.promocode_referral_item, viewGroup, false));
        this.O = pavVar;
        this.P = cqjVar;
    }

    @Override // defpackage.trj
    public final void W(fqj fqjVar) {
        jqj jqjVar = (jqj) fqjVar;
        cqj cqjVar = this.P;
        View view = this.a;
        c.z(cqjVar, view);
        ListItemComponent listItemComponent = (ListItemComponent) ((FrameLayout) this.N).getChildAt(1);
        listItemComponent.setDividers(DividerPosition.TOP, DividerType.ICON_MARGIN);
        if (jqjVar.b != null) {
            nac nacVar = (nac) this.O.a(listItemComponent.getLeadImageView());
            nacVar.e(m3h0.ic_gift_stroke);
            this.Q = nacVar.c(jqjVar.b);
        } else {
            listItemComponent.setLeadImage(m3h0.ic_gift_stroke);
        }
        listItemComponent.setTitle(jqjVar.a);
        listItemComponent.setTrailMode(2);
        z750 navigationIconParams = listItemComponent.getNavigationIconParams();
        navigationIconParams.b = new cdc(qje.t(xng0.textMain, view.getContext()));
        navigationIconParams.a();
    }

    @Override // defpackage.trj
    public final void X() {
        this.a.setOnClickListener(null);
        g18 g18Var = this.Q;
        if (g18Var != null) {
            g18Var.cancel();
        }
    }
}

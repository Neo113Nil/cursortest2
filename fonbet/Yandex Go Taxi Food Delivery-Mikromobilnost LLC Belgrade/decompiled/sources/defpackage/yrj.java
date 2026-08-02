package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;

/* loaded from: classes13.dex */
public final class yrj extends trj {
    public final pav O;
    public final dqj P;
    public final ListItemComponent Q;
    public g18 R;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public yrj(ViewGroup viewGroup, pav pavVar, dqj dqjVar) {
        super(r3);
        View f = oo31.f(viewGroup, dvh0.discounts_promo_link_item, viewGroup, false);
        this.O = pavVar;
        this.P = dqjVar;
        ListItemComponent listItemComponent = (ListItemComponent) f.findViewById(y6h0.promo_link_layout);
        this.Q = listItemComponent;
        listItemComponent.setDividers(DividerPosition.TOP, DividerType.ICON_MARGIN);
    }

    @Override // defpackage.trj
    public final void W(fqj fqjVar) {
        iqj iqjVar = (iqj) fqjVar;
        ListItemComponent listItemComponent = this.Q;
        nac nacVar = (nac) this.O.a(listItemComponent.getLeadImageView());
        nacVar.e(m3h0.ic_promo_code_default);
        this.R = nacVar.c(iqjVar.b);
        listItemComponent.setTitle(iqjVar.a);
        listItemComponent.setDebounceClickListener(new wqj(1, this, iqjVar));
    }

    @Override // defpackage.trj
    public final void X() {
        this.Q.clearTrailView();
        ((FrameLayout) this.N).setOnClickListener(null);
        g18 g18Var = this.R;
        if (g18Var != null) {
            g18Var.cancel();
        }
        this.R = null;
    }
}

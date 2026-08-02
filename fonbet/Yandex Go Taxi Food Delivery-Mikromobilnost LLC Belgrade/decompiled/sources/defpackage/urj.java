package defpackage;

import android.view.ViewGroup;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;

/* loaded from: classes13.dex */
public final class urj extends trj {
    public final cqj O;

    public urj(ViewGroup viewGroup, cqj cqjVar) {
        super(oo31.f(viewGroup, dvh0.promocode_add_coupon_item, viewGroup, false));
        this.O = cqjVar;
    }

    @Override // defpackage.trj
    public final void W(fqj fqjVar) {
        ListItemComponent listItemComponent = (ListItemComponent) this.N;
        listItemComponent.setDividers(DividerPosition.NONE, DividerType.NONE);
        listItemComponent.setTrailMode(2);
        z750 navigationIconParams = listItemComponent.getNavigationIconParams();
        navigationIconParams.b = new cdc(qje.t(xng0.textMain, this.a.getContext()));
        navigationIconParams.a();
        listItemComponent.setDebounceClickListener(new h60(23, this.O));
    }

    @Override // defpackage.trj
    public final void X() {
        ((ListItemComponent) this.N).setDebounceClickListener(null);
    }
}

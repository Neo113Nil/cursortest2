package ru.yandex.taxi.summary.requirements.list.recycler;

import android.view.View;
import defpackage.i3y;
import defpackage.iij0;
import defpackage.k1c;
import defpackage.l1c;
import defpackage.sls;
import defpackage.tij0;
import defpackage.v891;
import defpackage.xng0;
import defpackage.xw31;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.summary.requirements.list.recycler.n;

/* loaded from: classes6.dex */
public final class n extends l1c {
    public static final /* synthetic */ int Z = 0;
    public final ru.yandex.taxi.widget.utils.e U;
    public final i3y V;
    public final i3y W;

    public n(ListItemComponent listItemComponent, tij0 tij0Var, ru.yandex.taxi.widget.utils.e eVar) {
        super(listItemComponent, new TransferV2ViewHolder$1(1, tij0Var, tij0.class, "onTrailClick", "onTrailClick(Lru/yandex/taxi/summary/requirements/list/recycler/RequirementItem;)V", 0));
        this.U = eVar;
        final int i = 0;
        this.V = kotlin.a.a(new sls(this) { // from class: iu01
            public final /* synthetic */ n b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                n nVar = this.b;
                switch (i2) {
                    case 0:
                        return Float.valueOf(c.d(usg0.toggle_buttons_corner_radius, nVar.a));
                    default:
                        return Integer.valueOf(c.h(8, nVar.a));
                }
            }
        });
        final int i2 = 1;
        this.W = kotlin.a.a(new sls(this) { // from class: iu01
            public final /* synthetic */ n b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                n nVar = this.b;
                switch (i22) {
                    case 0:
                        return Float.valueOf(c.d(usg0.toggle_buttons_corner_radius, nVar.a));
                    default:
                        return Integer.valueOf(c.h(8, nVar.a));
                }
            }
        });
    }

    @Override // defpackage.l1c
    public final void c0(k1c k1cVar) {
        iij0 iij0Var = (iij0) k1cVar;
        View view = (View) this.R;
        boolean z = iij0Var.g;
        boolean z2 = iij0Var.f;
        ((ListItemComponent) view).setDividers(z ? DividerPosition.NONE : DividerPosition.BOTTOM, DividerType.ICON_HALF_MARGIN);
        i3y i3yVar = this.V;
        float floatValue = z2 ? ((Number) i3yVar.getValue()).floatValue() : 0.0f;
        float floatValue2 = z ? ((Number) i3yVar.getValue()).floatValue() : 0.0f;
        v891.h((ListItemComponent) view, ru.yandex.taxi.design.utils.c.c(xng0.bgMinor, view), floatValue, floatValue, floatValue2, floatValue2);
        i3y i3yVar2 = this.W;
        xw31.E(view, null, Integer.valueOf(z2 ? ((Number) i3yVar2.getValue()).intValue() : 0), null, Integer.valueOf(z ? ((Number) i3yVar2.getValue()).intValue() : 0));
        ((ListItemComponent) view).setTitle(iij0Var.a);
        ((ListItemComponent) view).setSubtitle(iij0Var.b);
    }

    @Override // defpackage.l1c
    public final void d0(k1c k1cVar) {
        b0(new TransferV2ViewHolder$bindLead$1((iij0) k1cVar, this, null));
    }
}

package ru.yandex.taxi.summary.requirements.list.recycler;

import android.view.View;
import defpackage.bij0;
import defpackage.cw70;
import defpackage.i3y;
import defpackage.k1c;
import defpackage.l1c;
import defpackage.p0h0;
import defpackage.sls;
import defpackage.tij0;
import defpackage.v891;
import defpackage.xng0;
import defpackage.xw31;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.summary.requirements.list.recycler.g;

/* loaded from: classes6.dex */
public final class g extends l1c {
    public static final /* synthetic */ int W = 0;
    public final i3y U;
    public final i3y V;

    public g(ListItemComponent listItemComponent, tij0 tij0Var) {
        super(listItemComponent, new OrderForOtherV2ViewHolder$1(1, tij0Var, tij0.class, "onTrailClick", "onTrailClick(Lru/yandex/taxi/summary/requirements/list/recycler/RequirementItem;)V", 0));
        final int i = 1;
        ((ListItemComponent) ((View) this.R)).setSubtitleMaxLines(1);
        final int i2 = 0;
        this.U = kotlin.a.a(new sls(this) { // from class: dw70
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i2;
                g gVar = this.b;
                switch (i3) {
                    case 0:
                        return Float.valueOf(c.d(usg0.toggle_buttons_corner_radius, gVar.a));
                    default:
                        return Integer.valueOf(c.h(8, gVar.a));
                }
            }
        });
        this.V = kotlin.a.a(new sls(this) { // from class: dw70
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i;
                g gVar = this.b;
                switch (i3) {
                    case 0:
                        return Float.valueOf(c.d(usg0.toggle_buttons_corner_radius, gVar.a));
                    default:
                        return Integer.valueOf(c.h(8, gVar.a));
                }
            }
        });
    }

    @Override // defpackage.l1c
    public final void c0(k1c k1cVar) {
        bij0 bij0Var = (bij0) k1cVar;
        View view = (View) this.R;
        ListItemComponent listItemComponent = (ListItemComponent) view;
        cw70 cw70Var = bij0Var.a;
        boolean z = bij0Var.c;
        listItemComponent.setTitle(cw70Var.a);
        listItemComponent.setSubtitle(bij0Var.a.b);
        boolean z2 = bij0Var.d;
        listItemComponent.setDividers(z2 ? DividerPosition.NONE : DividerPosition.BOTTOM, DividerType.ICON_HALF_MARGIN);
        i3y i3yVar = this.U;
        float floatValue = z ? ((Number) i3yVar.getValue()).floatValue() : 0.0f;
        float floatValue2 = z2 ? ((Number) i3yVar.getValue()).floatValue() : 0.0f;
        v891.h((ListItemComponent) view, ru.yandex.taxi.design.utils.c.c(xng0.bgMinor, view), floatValue, floatValue, floatValue2, floatValue2);
        i3y i3yVar2 = this.V;
        xw31.E(view, null, Integer.valueOf(z ? ((Number) i3yVar2.getValue()).intValue() : 0), null, Integer.valueOf(z2 ? ((Number) i3yVar2.getValue()).intValue() : 0));
    }

    @Override // defpackage.l1c
    public final void d0(k1c k1cVar) {
        ((ListItemComponent) ((View) this.R)).getLeadImageView().setImageResource(p0h0.ic_user_add_outline_24);
    }
}

package ru.yandex.taxi.summary.requirements.list.recycler;

import android.view.View;
import defpackage.aij0;
import defpackage.f1h0;
import defpackage.i3y;
import defpackage.ioj0;
import defpackage.k1c;
import defpackage.l1c;
import defpackage.p0h0;
import defpackage.sls;
import defpackage.tij0;
import defpackage.u1c;
import defpackage.v891;
import defpackage.xng0;
import defpackage.xw31;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.summary.requirements.list.recycler.e;

/* loaded from: classes6.dex */
public final class e extends l1c {
    public static final /* synthetic */ int Z = 0;
    public final ru.yandex.taxi.widget.utils.e U;
    public final i3y V;
    public final i3y W;

    public e(ListItemComponent listItemComponent, tij0 tij0Var, ru.yandex.taxi.widget.utils.e eVar) {
        super(listItemComponent, new OrderDueV2ViewHolder$1(1, tij0Var, tij0.class, "onTrailClick", "onTrailClick(Lru/yandex/taxi/summary/requirements/list/recycler/RequirementItem;)V", 0));
        this.U = eVar;
        final int i = 0;
        this.V = kotlin.a.a(new sls(this) { // from class: uu70
            public final /* synthetic */ e b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                e eVar2 = this.b;
                switch (i2) {
                    case 0:
                        return Float.valueOf(c.d(usg0.toggle_buttons_corner_radius, eVar2.a));
                    default:
                        return Integer.valueOf(c.h(8, eVar2.a));
                }
            }
        });
        final int i2 = 1;
        this.W = kotlin.a.a(new sls(this) { // from class: uu70
            public final /* synthetic */ e b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                e eVar2 = this.b;
                switch (i22) {
                    case 0:
                        return Float.valueOf(c.d(usg0.toggle_buttons_corner_radius, eVar2.a));
                    default:
                        return Integer.valueOf(c.h(8, eVar2.a));
                }
            }
        });
    }

    @Override // defpackage.l1c
    public final void c0(k1c k1cVar) {
        aij0 aij0Var = (aij0) k1cVar;
        View view = (View) this.R;
        ListItemComponent listItemComponent = (ListItemComponent) view;
        ioj0 ioj0Var = aij0Var.a;
        boolean z = aij0Var.c;
        boolean z2 = aij0Var.d;
        listItemComponent.setEnabled(!ioj0Var.e);
        ioj0 ioj0Var2 = aij0Var.a;
        listItemComponent.setContentAlpha(ioj0Var2.e ? 0.4f : 1.0f);
        listItemComponent.setTitle(ioj0Var2.a);
        listItemComponent.setSubtitle(ioj0Var2.b);
        listItemComponent.setDividers(z2 ? DividerPosition.NONE : DividerPosition.BOTTOM, DividerType.ICON_HALF_MARGIN);
        i3y i3yVar = this.V;
        float floatValue = z ? ((Number) i3yVar.getValue()).floatValue() : 0.0f;
        float floatValue2 = z2 ? ((Number) i3yVar.getValue()).floatValue() : 0.0f;
        v891.h((ListItemComponent) view, ru.yandex.taxi.design.utils.c.c(xng0.bgMinor, view), floatValue, floatValue, floatValue2, floatValue2);
        i3y i3yVar2 = this.W;
        xw31.E(view, null, Integer.valueOf(z ? ((Number) i3yVar2.getValue()).intValue() : 0), null, Integer.valueOf(z2 ? ((Number) i3yVar2.getValue()).intValue() : 0));
    }

    @Override // defpackage.l1c
    public final void d0(k1c k1cVar) {
        String str = ((aij0) k1cVar).a.f;
        if (str == null || str.length() == 0) {
            ((ListItemComponent) ((View) this.R)).getLeadImageView().setImageResource(p0h0.ic_time_outline_24);
        } else {
            b0(new OrderDueV2ViewHolder$bindLead$1(this, str, null));
        }
    }

    @Override // defpackage.l1c
    public final void e0(k1c k1cVar) {
        aij0 aij0Var = (aij0) k1cVar;
        ioj0 ioj0Var = aij0Var.a;
        String str = ioj0Var.f;
        boolean z = ioj0Var.c;
        u1c u1cVar = this.S;
        if (z) {
            u1cVar.a(aij0Var, aij0Var.b);
        } else if (str == null || str.length() == 0 || !aij0Var.a.d) {
            u1cVar.b(null);
        } else {
            u1cVar.b(ru.yandex.taxi.design.utils.c.k(f1h0.ic_schedule_clock, this.a));
        }
    }
}

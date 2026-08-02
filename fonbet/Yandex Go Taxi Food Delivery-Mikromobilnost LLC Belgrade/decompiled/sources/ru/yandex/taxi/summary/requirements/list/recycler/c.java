package ru.yandex.taxi.summary.requirements.list.recycler;

import android.view.View;
import defpackage.g9w;
import defpackage.i3y;
import defpackage.k1c;
import defpackage.l1c;
import defpackage.sls;
import defpackage.tij0;
import defpackage.v891;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.zhj0;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.summary.requirements.list.recycler.c;

/* loaded from: classes6.dex */
public final class c extends l1c {
    public static final /* synthetic */ int Z = 0;
    public final ru.yandex.taxi.widget.utils.e U;
    public final i3y V;
    public final i3y W;

    public c(ListItemComponent listItemComponent, tij0 tij0Var, ru.yandex.taxi.widget.utils.e eVar) {
        super(listItemComponent, new IntercityContactV2ViewHolder$1(1, tij0Var, tij0.class, "onTrailClick", "onTrailClick(Lru/yandex/taxi/summary/requirements/list/recycler/RequirementItem;)V", 0));
        this.U = eVar;
        final int i = 1;
        ((ListItemComponent) ((View) this.R)).setSubtitleMaxLines(1);
        final int i2 = 0;
        this.V = kotlin.a.a(new sls(this) { // from class: h9w
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i2;
                c cVar = this.b;
                switch (i3) {
                    case 0:
                        return Float.valueOf(ru.yandex.taxi.design.utils.c.d(usg0.toggle_buttons_corner_radius, cVar.a));
                    default:
                        return Integer.valueOf(ru.yandex.taxi.design.utils.c.h(8, cVar.a));
                }
            }
        });
        this.W = kotlin.a.a(new sls(this) { // from class: h9w
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i;
                c cVar = this.b;
                switch (i3) {
                    case 0:
                        return Float.valueOf(ru.yandex.taxi.design.utils.c.d(usg0.toggle_buttons_corner_radius, cVar.a));
                    default:
                        return Integer.valueOf(ru.yandex.taxi.design.utils.c.h(8, cVar.a));
                }
            }
        });
    }

    @Override // defpackage.l1c
    public final void c0(k1c k1cVar) {
        zhj0 zhj0Var = (zhj0) k1cVar;
        View view = (View) this.R;
        ListItemComponent listItemComponent = (ListItemComponent) view;
        g9w g9wVar = zhj0Var.a;
        boolean z = zhj0Var.c;
        listItemComponent.setTitle(g9wVar.a);
        listItemComponent.setSubtitle(zhj0Var.a.b);
        boolean z2 = zhj0Var.d;
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
        b0(new IntercityContactV2ViewHolder$bindLead$1((zhj0) k1cVar, this, null));
    }
}

package ru.yandex.taxi.summary.requirements.list.recycler;

import android.view.View;
import defpackage.aij0;
import defpackage.f1h0;
import defpackage.ioj0;
import defpackage.k1c;
import defpackage.l1c;
import defpackage.tij0;
import defpackage.u1c;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;

/* loaded from: classes6.dex */
public final class f extends l1c {
    public static final /* synthetic */ int V = 0;
    public final ru.yandex.taxi.widget.utils.e U;

    public f(ListItemComponent listItemComponent, tij0 tij0Var, ru.yandex.taxi.widget.utils.e eVar) {
        super(listItemComponent, new OrderDueViewHolder$1(1, tij0Var, tij0.class, "onTrailClick", "onTrailClick(Lru/yandex/taxi/summary/requirements/list/recycler/RequirementItem;)V", 0));
        this.U = eVar;
    }

    @Override // defpackage.l1c
    public final void c0(k1c k1cVar) {
        aij0 aij0Var = (aij0) k1cVar;
        ListItemComponent listItemComponent = (ListItemComponent) ((View) this.R);
        listItemComponent.setEnabled(!aij0Var.a.e);
        ioj0 ioj0Var = aij0Var.a;
        listItemComponent.setContentAlpha(ioj0Var.e ? 0.4f : 1.0f);
        listItemComponent.setTitle(ioj0Var.a);
        listItemComponent.setSubtitle(ioj0Var.b);
        listItemComponent.setDividers(aij0Var.d ? DividerPosition.NONE : DividerPosition.BOTTOM, DividerType.MARGIN);
    }

    @Override // defpackage.l1c
    public final void d0(k1c k1cVar) {
        b0(new OrderDueViewHolder$bindLead$1(this, (aij0) k1cVar, null));
    }

    @Override // defpackage.l1c
    public final void e0(k1c k1cVar) {
        aij0 aij0Var = (aij0) k1cVar;
        ioj0 ioj0Var = aij0Var.a;
        boolean z = ioj0Var.c;
        u1c u1cVar = this.S;
        if (z) {
            u1cVar.a(aij0Var, aij0Var.b);
        } else if (ioj0Var.d) {
            u1cVar.b(ru.yandex.taxi.design.utils.c.k(f1h0.ic_schedule_clock, this.a));
        } else {
            u1cVar.b(null);
        }
    }
}

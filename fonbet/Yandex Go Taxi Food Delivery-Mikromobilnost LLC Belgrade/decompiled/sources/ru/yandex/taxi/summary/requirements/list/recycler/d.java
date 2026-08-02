package ru.yandex.taxi.summary.requirements.list.recycler;

import android.view.View;
import defpackage.k1c;
import defpackage.l1c;
import defpackage.tij0;
import defpackage.zhj0;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;

/* loaded from: classes6.dex */
public final class d extends l1c {
    public static final /* synthetic */ int V = 0;
    public final ru.yandex.taxi.widget.utils.e U;

    public d(ListItemComponent listItemComponent, tij0 tij0Var, ru.yandex.taxi.widget.utils.e eVar) {
        super(listItemComponent, new IntercityContactViewHolder$1(1, tij0Var, tij0.class, "onTrailClick", "onTrailClick(Lru/yandex/taxi/summary/requirements/list/recycler/RequirementItem;)V", 0));
        this.U = eVar;
        ((ListItemComponent) ((View) this.R)).setSubtitleMaxLines(1);
    }

    @Override // defpackage.l1c
    public final void c0(k1c k1cVar) {
        zhj0 zhj0Var = (zhj0) k1cVar;
        ListItemComponent listItemComponent = (ListItemComponent) ((View) this.R);
        listItemComponent.setTitle(zhj0Var.a.a);
        listItemComponent.setSubtitle(zhj0Var.a.b);
        listItemComponent.setDividers(zhj0Var.d ? DividerPosition.NONE : DividerPosition.BOTTOM, DividerType.MARGIN);
    }

    @Override // defpackage.l1c
    public final void d0(k1c k1cVar) {
        b0(new IntercityContactViewHolder$bindLead$1(this, (zhj0) k1cVar, null));
    }
}

package ru.yandex.taxi.summary.requirements.list.recycler;

import android.view.View;
import defpackage.tij0;
import defpackage.tls;
import defpackage.x4p;
import defpackage.xu01;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes6.dex */
public final /* synthetic */ class b implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tij0 b;

    public /* synthetic */ b(tij0 tij0Var, int i) {
        this.a = i;
        this.b = tij0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ListItemComponent listItemComponent = (ListItemComponent) obj;
        switch (this.a) {
            case 0:
                return new x4p(listItemComponent, new ExtraPhoneViewHolder$1(1, this.b, tij0.class, "onTrailClick", "onTrailClick(Lru/yandex/taxi/summary/requirements/list/recycler/RequirementItem;)V", 0), 0);
            case 1:
                x4p x4pVar = new x4p(listItemComponent, new OrderForOtherViewHolder$1(1, this.b, tij0.class, "onTrailClick", "onTrailClick(Lru/yandex/taxi/summary/requirements/list/recycler/RequirementItem;)V", 0), 1);
                ((ListItemComponent) ((View) x4pVar.R)).setSubtitleMaxLines(1);
                return x4pVar;
            default:
                return new xu01(listItemComponent, new TransferViewHolder$1(1, this.b, tij0.class, "onTrailClick", "onTrailClick(Lru/yandex/taxi/summary/requirements/list/recycler/RequirementItem;)V", 0));
        }
    }
}

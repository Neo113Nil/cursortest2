package ru.yandex.taxi.costcenters.fields;

import android.view.ViewGroup;
import defpackage.dfs0;
import defpackage.kr31;
import defpackage.nwe;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes5.dex */
public final class c extends dfs0 {
    public final /* synthetic */ CostCenterFieldsModalView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CostCenterFieldsModalView costCenterFieldsModalView, ViewGroup viewGroup) {
        super(viewGroup, CostCenterFieldsModalView$CostCentersListAdapter$1.b);
        this.f = costCenterFieldsModalView;
    }

    @Override // defpackage.dfs0
    public final kr31 a(ViewGroup viewGroup, Object obj) {
        ListItemComponent createSelectView;
        CostCenterFieldsModalView costCenterFieldsModalView = this.f;
        createSelectView = costCenterFieldsModalView.createSelectView();
        return new nwe(costCenterFieldsModalView, createSelectView);
    }
}

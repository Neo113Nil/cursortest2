package com.squareup.cash.money.disclosure;

import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.core.ids.SectionId;
import com.squareup.cash.money.viewmodels.api.Section;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;

/* loaded from: classes6.dex */
public final class DisclosureSection implements Section {
    public final List items;

    public DisclosureSection(DisclosureItemModel disclosureItemModel, RealRouter realRouter, MoneyAnalyticsService moneyAnalyticsService) {
        disclosureItemModel.getClass();
        realRouter.getClass();
        this.items = CollectionsKt__CollectionsJVMKt.listOf(new DisclosureItem(disclosureItemModel, realRouter, moneyAnalyticsService));
    }

    @Override // com.squareup.cash.money.viewmodels.api.Section
    public final SectionId getId() {
        return SectionId.DISCLOSURE;
    }

    @Override // com.squareup.cash.money.viewmodels.api.Section
    public final Section.Layout getLayout() {
        return new Section.Layout.VerticalStack(null, null, 7);
    }

    @Override // com.squareup.cash.money.viewmodels.api.Section
    public final List items() {
        return this.items;
    }
}

package com.squareup.cash.money.banners.presenters;

import com.squareup.cash.money.core.ids.SectionId;
import com.squareup.cash.money.viewmodels.api.Section;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;

/* loaded from: classes6.dex */
public final class BannerSection implements Section {
    public final KybBannerItem item;
    public final SectionId id = SectionId.BANNERS;
    public final Section.Layout.VerticalStack layout = new Section.Layout.VerticalStack(null, null, 7);

    public BannerSection(KybBannerItem kybBannerItem) {
        this.item = kybBannerItem;
    }

    @Override // com.squareup.cash.money.viewmodels.api.Section
    public final SectionId getId() {
        return this.id;
    }

    @Override // com.squareup.cash.money.viewmodels.api.Section
    public final Section.Layout getLayout() {
        return this.layout;
    }

    @Override // com.squareup.cash.money.viewmodels.api.Section
    public final List items() {
        return CollectionsKt__CollectionsJVMKt.listOf(this.item);
    }
}

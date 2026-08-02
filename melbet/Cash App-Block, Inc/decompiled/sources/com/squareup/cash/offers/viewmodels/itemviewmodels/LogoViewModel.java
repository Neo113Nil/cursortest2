package com.squareup.cash.offers.viewmodels.itemviewmodels;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.offers.backend.api.OffersAnalyticsEventSpec;
import com.squareup.cash.offers.backend.api.OffersItemToken;
import com.squareup.cash.offers.viewmodels.ImpressionReportable;
import com.squareup.protos.cash.shop.rendering.api.StyledText;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import okhttp3.internal.Tags;

/* loaded from: classes6.dex */
public final class LogoViewModel implements ImpressionReportable {
    public final LegacyOffersAvatarViewModel avatar;
    public final String id;
    public final OffersAnalyticsEventSpec impressionEventSpec;
    public final ImmutableList impressionEventSpecs;
    public final boolean isActiveBoost;
    public final OffersItemToken itemToken;
    public final String tapActionUrl;
    public final ImmutableList tapEventSpecs;
    public final StyledText title;

    public LogoViewModel(OffersAnalyticsEventSpec offersAnalyticsEventSpec, String str, OffersItemToken offersItemToken, LegacyOffersAvatarViewModel legacyOffersAvatarViewModel, StyledText styledText, String str2, ImmutableList immutableList, boolean z) {
        styledText.getClass();
        immutableList.getClass();
        this.impressionEventSpec = offersAnalyticsEventSpec;
        this.id = str;
        this.itemToken = offersItemToken;
        this.avatar = legacyOffersAvatarViewModel;
        this.title = styledText;
        this.tapActionUrl = str2;
        this.tapEventSpecs = immutableList;
        this.isActiveBoost = z;
        this.impressionEventSpecs = Tags.toImmutableList(CollectionsKt__CollectionsKt.listOfNotNull(offersAnalyticsEventSpec));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogoViewModel)) {
            return false;
        }
        LogoViewModel logoViewModel = (LogoViewModel) obj;
        return Intrinsics.areEqual(this.impressionEventSpec, logoViewModel.impressionEventSpec) && Intrinsics.areEqual(this.id, logoViewModel.id) && Intrinsics.areEqual(this.itemToken, logoViewModel.itemToken) && Intrinsics.areEqual(this.avatar, logoViewModel.avatar) && Intrinsics.areEqual(this.title, logoViewModel.title) && Intrinsics.areEqual(this.tapActionUrl, logoViewModel.tapActionUrl) && Intrinsics.areEqual(this.tapEventSpecs, logoViewModel.tapEventSpecs) && this.isActiveBoost == logoViewModel.isActiveBoost;
    }

    @Override // com.squareup.cash.offers.viewmodels.ImpressionReportable
    public final ImmutableList getImpressionEventSpecs() {
        return this.impressionEventSpecs;
    }

    public final int hashCode() {
        OffersAnalyticsEventSpec offersAnalyticsEventSpec = this.impressionEventSpec;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((offersAnalyticsEventSpec == null ? 0 : offersAnalyticsEventSpec.hashCode()) * 31, 31, this.id);
        OffersItemToken offersItemToken = this.itemToken;
        return Boolean.hashCode(this.isActiveBoost) + BalanceFeedKt$$ExternalSyntheticOutline0.m(this.tapEventSpecs, JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.title.hashCode() + ((this.avatar.hashCode() + ((m + (offersItemToken != null ? offersItemToken.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.tapActionUrl), 31);
    }

    public final String toString() {
        return "LogoViewModel(impressionEventSpec=" + this.impressionEventSpec + ", id=" + this.id + ", itemToken=" + this.itemToken + ", avatar=" + this.avatar + ", title=" + this.title + ", tapActionUrl=" + this.tapActionUrl + ", tapEventSpecs=" + this.tapEventSpecs + ", isActiveBoost=" + this.isActiveBoost + ")";
    }
}

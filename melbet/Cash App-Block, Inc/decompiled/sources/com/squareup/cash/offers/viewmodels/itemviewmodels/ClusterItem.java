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
public interface ClusterItem extends ImpressionReportable {

    public final class CLOClusterItemViewModel implements ClusterItem {
        public final String actionUrl;
        public final LegacyOffersAvatarViewModel avatar;
        public final String boostToken;
        public final OffersAnalyticsEventSpec impressionEventSpec;
        public final ImmutableList impressionEventSpecs;
        public final OffersItemToken itemToken;
        public final String offerToken;
        public final OffersSaleChipViewModel saleChip;
        public final boolean selected;
        public final StyledText subTitle;
        public final ImmutableList tapEventSpecs;
        public final StyledText title;

        public CLOClusterItemViewModel(LegacyOffersAvatarViewModel legacyOffersAvatarViewModel, StyledText styledText, StyledText styledText2, String str, String str2, OffersItemToken offersItemToken, OffersSaleChipViewModel offersSaleChipViewModel, ImmutableList immutableList, OffersAnalyticsEventSpec offersAnalyticsEventSpec, String str3, boolean z) {
            str2.getClass();
            immutableList.getClass();
            str3.getClass();
            this.avatar = legacyOffersAvatarViewModel;
            this.title = styledText;
            this.subTitle = styledText2;
            this.actionUrl = str;
            this.offerToken = str2;
            this.itemToken = offersItemToken;
            this.saleChip = offersSaleChipViewModel;
            this.tapEventSpecs = immutableList;
            this.impressionEventSpec = offersAnalyticsEventSpec;
            this.boostToken = str3;
            this.selected = z;
            this.impressionEventSpecs = Tags.toImmutableList(CollectionsKt__CollectionsKt.listOfNotNull(offersAnalyticsEventSpec));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CLOClusterItemViewModel)) {
                return false;
            }
            CLOClusterItemViewModel cLOClusterItemViewModel = (CLOClusterItemViewModel) obj;
            return this.avatar.equals(cLOClusterItemViewModel.avatar) && Intrinsics.areEqual(this.title, cLOClusterItemViewModel.title) && Intrinsics.areEqual(this.subTitle, cLOClusterItemViewModel.subTitle) && this.actionUrl.equals(cLOClusterItemViewModel.actionUrl) && Intrinsics.areEqual(this.offerToken, cLOClusterItemViewModel.offerToken) && Intrinsics.areEqual(this.itemToken, cLOClusterItemViewModel.itemToken) && Intrinsics.areEqual(this.saleChip, cLOClusterItemViewModel.saleChip) && Intrinsics.areEqual(this.tapEventSpecs, cLOClusterItemViewModel.tapEventSpecs) && Intrinsics.areEqual(this.impressionEventSpec, cLOClusterItemViewModel.impressionEventSpec) && Intrinsics.areEqual(this.boostToken, cLOClusterItemViewModel.boostToken) && this.selected == cLOClusterItemViewModel.selected;
        }

        @Override // com.squareup.cash.offers.viewmodels.itemviewmodels.ClusterItem
        public final String getActionUrl() {
            return this.actionUrl;
        }

        @Override // com.squareup.cash.offers.viewmodels.itemviewmodels.ClusterItem
        public final LegacyOffersAvatarViewModel getAvatar() {
            return this.avatar;
        }

        @Override // com.squareup.cash.offers.viewmodels.ImpressionReportable
        public final ImmutableList getImpressionEventSpecs() {
            return this.impressionEventSpecs;
        }

        @Override // com.squareup.cash.offers.viewmodels.itemviewmodels.ClusterItem
        public final OffersItemToken getItemToken() {
            return this.itemToken;
        }

        @Override // com.squareup.cash.offers.viewmodels.itemviewmodels.ClusterItem
        public final StyledText getSubTitle() {
            return this.subTitle;
        }

        @Override // com.squareup.cash.offers.viewmodels.itemviewmodels.ClusterItem
        public final ImmutableList getTapEventSpecs() {
            return this.tapEventSpecs;
        }

        @Override // com.squareup.cash.offers.viewmodels.itemviewmodels.ClusterItem
        public final StyledText getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int hashCode = this.avatar.hashCode() * 31;
            StyledText styledText = this.title;
            int hashCode2 = (hashCode + (styledText == null ? 0 : styledText.hashCode())) * 31;
            StyledText styledText2 = this.subTitle;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (styledText2 == null ? 0 : styledText2.hashCode())) * 31, 31, this.actionUrl), 31, this.offerToken);
            OffersItemToken offersItemToken = this.itemToken;
            int hashCode3 = (m + (offersItemToken == null ? 0 : offersItemToken.hashCode())) * 31;
            OffersSaleChipViewModel offersSaleChipViewModel = this.saleChip;
            int m2 = BalanceFeedKt$$ExternalSyntheticOutline0.m(this.tapEventSpecs, (hashCode3 + (offersSaleChipViewModel == null ? 0 : offersSaleChipViewModel.hashCode())) * 31, 31);
            OffersAnalyticsEventSpec offersAnalyticsEventSpec = this.impressionEventSpec;
            return Boolean.hashCode(this.selected) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m2 + (offersAnalyticsEventSpec != null ? offersAnalyticsEventSpec.hashCode() : 0)) * 31, 31, this.boostToken);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CLOClusterItemViewModel(avatar=");
            sb.append(this.avatar);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", subTitle=");
            sb.append(this.subTitle);
            sb.append(", actionUrl=");
            sb.append(this.actionUrl);
            sb.append(", offerToken=");
            sb.append(this.offerToken);
            sb.append(", itemToken=");
            sb.append(this.itemToken);
            sb.append(", saleChip=");
            sb.append(this.saleChip);
            sb.append(", tapEventSpecs=");
            sb.append(this.tapEventSpecs);
            sb.append(", impressionEventSpec=");
            sb.append(this.impressionEventSpec);
            sb.append(", boostToken=");
            sb.append(this.boostToken);
            sb.append(", selected=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.selected, ")");
        }
    }

    public final class ClusterItemViewModel implements ClusterItem {
        public final String actionUrl;
        public final LegacyOffersAvatarViewModel avatar;
        public final String boostToken;
        public final OffersAnalyticsEventSpec impressionEventSpec;
        public final ImmutableList impressionEventSpecs;
        public final OffersItemToken itemToken;
        public final String offerToken;
        public final OffersSaleChipViewModel saleChip;
        public final boolean selected;
        public final StyledText subTitle;
        public final ImmutableList tapEventSpecs;
        public final StyledText title;

        public ClusterItemViewModel(LegacyOffersAvatarViewModel legacyOffersAvatarViewModel, StyledText styledText, StyledText styledText2, String str, String str2, OffersItemToken offersItemToken, OffersSaleChipViewModel offersSaleChipViewModel, ImmutableList immutableList, OffersAnalyticsEventSpec offersAnalyticsEventSpec, String str3, boolean z) {
            str2.getClass();
            immutableList.getClass();
            this.avatar = legacyOffersAvatarViewModel;
            this.title = styledText;
            this.subTitle = styledText2;
            this.actionUrl = str;
            this.offerToken = str2;
            this.itemToken = offersItemToken;
            this.saleChip = offersSaleChipViewModel;
            this.tapEventSpecs = immutableList;
            this.impressionEventSpec = offersAnalyticsEventSpec;
            this.boostToken = str3;
            this.selected = z;
            this.impressionEventSpecs = Tags.toImmutableList(CollectionsKt__CollectionsKt.listOfNotNull(offersAnalyticsEventSpec));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClusterItemViewModel)) {
                return false;
            }
            ClusterItemViewModel clusterItemViewModel = (ClusterItemViewModel) obj;
            return this.avatar.equals(clusterItemViewModel.avatar) && Intrinsics.areEqual(this.title, clusterItemViewModel.title) && Intrinsics.areEqual(this.subTitle, clusterItemViewModel.subTitle) && this.actionUrl.equals(clusterItemViewModel.actionUrl) && Intrinsics.areEqual(this.offerToken, clusterItemViewModel.offerToken) && Intrinsics.areEqual(this.itemToken, clusterItemViewModel.itemToken) && Intrinsics.areEqual(this.saleChip, clusterItemViewModel.saleChip) && Intrinsics.areEqual(this.tapEventSpecs, clusterItemViewModel.tapEventSpecs) && Intrinsics.areEqual(this.impressionEventSpec, clusterItemViewModel.impressionEventSpec) && Intrinsics.areEqual(this.boostToken, clusterItemViewModel.boostToken) && this.selected == clusterItemViewModel.selected;
        }

        @Override // com.squareup.cash.offers.viewmodels.itemviewmodels.ClusterItem
        public final String getActionUrl() {
            return this.actionUrl;
        }

        @Override // com.squareup.cash.offers.viewmodels.itemviewmodels.ClusterItem
        public final LegacyOffersAvatarViewModel getAvatar() {
            return this.avatar;
        }

        @Override // com.squareup.cash.offers.viewmodels.ImpressionReportable
        public final ImmutableList getImpressionEventSpecs() {
            return this.impressionEventSpecs;
        }

        @Override // com.squareup.cash.offers.viewmodels.itemviewmodels.ClusterItem
        public final OffersItemToken getItemToken() {
            return this.itemToken;
        }

        @Override // com.squareup.cash.offers.viewmodels.itemviewmodels.ClusterItem
        public final StyledText getSubTitle() {
            return this.subTitle;
        }

        @Override // com.squareup.cash.offers.viewmodels.itemviewmodels.ClusterItem
        public final ImmutableList getTapEventSpecs() {
            return this.tapEventSpecs;
        }

        @Override // com.squareup.cash.offers.viewmodels.itemviewmodels.ClusterItem
        public final StyledText getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int hashCode = this.avatar.hashCode() * 31;
            StyledText styledText = this.title;
            int hashCode2 = (hashCode + (styledText == null ? 0 : styledText.hashCode())) * 31;
            StyledText styledText2 = this.subTitle;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (styledText2 == null ? 0 : styledText2.hashCode())) * 31, 31, this.actionUrl), 31, this.offerToken);
            OffersItemToken offersItemToken = this.itemToken;
            int hashCode3 = (m + (offersItemToken == null ? 0 : offersItemToken.hashCode())) * 31;
            OffersSaleChipViewModel offersSaleChipViewModel = this.saleChip;
            int m2 = BalanceFeedKt$$ExternalSyntheticOutline0.m(this.tapEventSpecs, (hashCode3 + (offersSaleChipViewModel == null ? 0 : offersSaleChipViewModel.hashCode())) * 31, 31);
            OffersAnalyticsEventSpec offersAnalyticsEventSpec = this.impressionEventSpec;
            int hashCode4 = (m2 + (offersAnalyticsEventSpec == null ? 0 : offersAnalyticsEventSpec.hashCode())) * 31;
            String str = this.boostToken;
            return Boolean.hashCode(this.selected) + ((hashCode4 + (str != null ? str.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ClusterItemViewModel(avatar=");
            sb.append(this.avatar);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", subTitle=");
            sb.append(this.subTitle);
            sb.append(", actionUrl=");
            sb.append(this.actionUrl);
            sb.append(", offerToken=");
            sb.append(this.offerToken);
            sb.append(", itemToken=");
            sb.append(this.itemToken);
            sb.append(", saleChip=");
            sb.append(this.saleChip);
            sb.append(", tapEventSpecs=");
            sb.append(this.tapEventSpecs);
            sb.append(", impressionEventSpec=");
            sb.append(this.impressionEventSpec);
            sb.append(", boostToken=");
            sb.append(this.boostToken);
            sb.append(", selected=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.selected, ")");
        }
    }

    String getActionUrl();

    LegacyOffersAvatarViewModel getAvatar();

    OffersItemToken getItemToken();

    StyledText getSubTitle();

    ImmutableList getTapEventSpecs();

    StyledText getTitle();
}

package com.squareup.cash.offers.viewmodels.itemviewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.offers.backend.api.OffersAnalyticsEventSpec;
import com.squareup.cash.offers.backend.api.OffersItemToken;
import com.squareup.cash.offers.viewmodels.ImpressionReportable;
import com.squareup.cash.offers.viewmodels.OfferCountdownTemplateViewModel;
import com.squareup.protos.cash.shop.rendering.api.HeroSection;
import com.squareup.protos.cash.shop.rendering.api.StyledText;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import okhttp3.internal.Tags;

/* loaded from: classes6.dex */
public interface OffersHomeListItemViewModel {

    public final class CategoryPillsSectionViewModel implements OffersHomeListItemViewModel, ImpressionReportable {
        public final String id;
        public final OffersAnalyticsEventSpec impressionEventSpec;
        public final ImmutableList impressionEventSpecs;
        public final AbstractPersistentList models;

        public CategoryPillsSectionViewModel(String str, OffersAnalyticsEventSpec offersAnalyticsEventSpec, AbstractPersistentList abstractPersistentList) {
            str.getClass();
            abstractPersistentList.getClass();
            this.id = str;
            this.impressionEventSpec = offersAnalyticsEventSpec;
            this.models = abstractPersistentList;
            this.impressionEventSpecs = Tags.toImmutableList(CollectionsKt__CollectionsJVMKt.listOf(offersAnalyticsEventSpec));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CategoryPillsSectionViewModel)) {
                return false;
            }
            CategoryPillsSectionViewModel categoryPillsSectionViewModel = (CategoryPillsSectionViewModel) obj;
            return Intrinsics.areEqual(this.id, categoryPillsSectionViewModel.id) && this.impressionEventSpec.equals(categoryPillsSectionViewModel.impressionEventSpec) && Intrinsics.areEqual(this.models, categoryPillsSectionViewModel.models);
        }

        @Override // com.squareup.cash.offers.viewmodels.ImpressionReportable
        public final ImmutableList getImpressionEventSpecs() {
            return this.impressionEventSpecs;
        }

        public final int hashCode() {
            return this.models.hashCode() + ((this.impressionEventSpec.hashCode() + (this.id.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "CategoryPillsSectionViewModel(id=" + this.id + ", impressionEventSpec=" + this.impressionEventSpec + ", models=" + this.models + ")";
        }
    }

    public final class CategoryTilesSectionViewModel implements OffersHomeListItemViewModel, ImpressionReportable {
        public final String browseFlowToken;
        public final OffersHeaderViewModel header;
        public final String id;
        public final OffersAnalyticsEventSpec impressionEventSpec;
        public final ImmutableList impressionEventSpecs;
        public final AbstractPersistentList tiles;

        public CategoryTilesSectionViewModel(String str, String str2, OffersAnalyticsEventSpec offersAnalyticsEventSpec, OffersHeaderViewModel offersHeaderViewModel, AbstractPersistentList abstractPersistentList) {
            str.getClass();
            abstractPersistentList.getClass();
            this.id = str;
            this.browseFlowToken = str2;
            this.impressionEventSpec = offersAnalyticsEventSpec;
            this.header = offersHeaderViewModel;
            this.tiles = abstractPersistentList;
            this.impressionEventSpecs = Tags.toImmutableList(CollectionsKt__CollectionsKt.listOfNotNull(offersAnalyticsEventSpec));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CategoryTilesSectionViewModel)) {
                return false;
            }
            CategoryTilesSectionViewModel categoryTilesSectionViewModel = (CategoryTilesSectionViewModel) obj;
            return Intrinsics.areEqual(this.id, categoryTilesSectionViewModel.id) && this.browseFlowToken.equals(categoryTilesSectionViewModel.browseFlowToken) && Intrinsics.areEqual(this.impressionEventSpec, categoryTilesSectionViewModel.impressionEventSpec) && this.header.equals(categoryTilesSectionViewModel.header) && Intrinsics.areEqual(this.tiles, categoryTilesSectionViewModel.tiles);
        }

        @Override // com.squareup.cash.offers.viewmodels.ImpressionReportable
        public final ImmutableList getImpressionEventSpecs() {
            return this.impressionEventSpecs;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.browseFlowToken);
            OffersAnalyticsEventSpec offersAnalyticsEventSpec = this.impressionEventSpec;
            return this.tiles.hashCode() + ((this.header.hashCode() + ((m + (offersAnalyticsEventSpec == null ? 0 : offersAnalyticsEventSpec.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CategoryTilesSectionViewModel(id=", this.id, ", browseFlowToken=", this.browseFlowToken, ", impressionEventSpec=");
            m.append(this.impressionEventSpec);
            m.append(", header=");
            m.append(this.header);
            m.append(", tiles=");
            m.append(this.tiles);
            m.append(")");
            return m.toString();
        }
    }

    public interface ClusterSection extends OffersHomeListItemViewModel, ImpressionReportable {

        public final class CLOClusterSectionViewModel implements ClusterSection {
            public final String browseFlowToken;
            public final String id;
            public final OffersAnalyticsEventSpec impressionEventSpec;
            public final ImmutableList impressionEventSpecs;
            public final InfoTileViewModel infoItem;
            public final AbstractPersistentList offersList;

            public CLOClusterSectionViewModel(String str, InfoTileViewModel infoTileViewModel, AbstractPersistentList abstractPersistentList, String str2, OffersAnalyticsEventSpec offersAnalyticsEventSpec) {
                str.getClass();
                abstractPersistentList.getClass();
                this.id = str;
                this.infoItem = infoTileViewModel;
                this.offersList = abstractPersistentList;
                this.browseFlowToken = str2;
                this.impressionEventSpec = offersAnalyticsEventSpec;
                this.impressionEventSpecs = Tags.toImmutableList(CollectionsKt__CollectionsJVMKt.listOf(offersAnalyticsEventSpec));
            }

            public static CLOClusterSectionViewModel copy$default(CLOClusterSectionViewModel cLOClusterSectionViewModel, AbstractPersistentList abstractPersistentList, String str, int i) {
                String str2 = cLOClusterSectionViewModel.id;
                InfoTileViewModel infoTileViewModel = cLOClusterSectionViewModel.infoItem;
                if ((i & 4) != 0) {
                    abstractPersistentList = cLOClusterSectionViewModel.offersList;
                }
                AbstractPersistentList abstractPersistentList2 = abstractPersistentList;
                if ((i & 8) != 0) {
                    str = cLOClusterSectionViewModel.browseFlowToken;
                }
                OffersAnalyticsEventSpec offersAnalyticsEventSpec = cLOClusterSectionViewModel.impressionEventSpec;
                str2.getClass();
                abstractPersistentList2.getClass();
                return new CLOClusterSectionViewModel(str2, infoTileViewModel, abstractPersistentList2, str, offersAnalyticsEventSpec);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CLOClusterSectionViewModel)) {
                    return false;
                }
                CLOClusterSectionViewModel cLOClusterSectionViewModel = (CLOClusterSectionViewModel) obj;
                return Intrinsics.areEqual(this.id, cLOClusterSectionViewModel.id) && this.infoItem.equals(cLOClusterSectionViewModel.infoItem) && Intrinsics.areEqual(this.offersList, cLOClusterSectionViewModel.offersList) && this.browseFlowToken.equals(cLOClusterSectionViewModel.browseFlowToken) && this.impressionEventSpec.equals(cLOClusterSectionViewModel.impressionEventSpec);
            }

            @Override // com.squareup.cash.offers.viewmodels.itemviewmodels.OffersHomeListItemViewModel.ClusterSection
            public final String getBrowseFlowToken() {
                return this.browseFlowToken;
            }

            @Override // com.squareup.cash.offers.viewmodels.ImpressionReportable
            public final ImmutableList getImpressionEventSpecs() {
                return this.impressionEventSpecs;
            }

            @Override // com.squareup.cash.offers.viewmodels.itemviewmodels.OffersHomeListItemViewModel.ClusterSection
            public final InfoTileViewModel getInfoItem() {
                return this.infoItem;
            }

            @Override // com.squareup.cash.offers.viewmodels.itemviewmodels.OffersHomeListItemViewModel.ClusterSection
            public final AbstractPersistentList getOffersList() {
                return this.offersList;
            }

            public final int hashCode() {
                return this.impressionEventSpec.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.offersList.hashCode() + ((this.infoItem.hashCode() + (this.id.hashCode() * 31)) * 31)) * 31, 31, this.browseFlowToken);
            }

            public final String toString() {
                return "CLOClusterSectionViewModel(id=" + this.id + ", infoItem=" + this.infoItem + ", offersList=" + this.offersList + ", browseFlowToken=" + this.browseFlowToken + ", impressionEventSpec=" + this.impressionEventSpec + ")";
            }
        }

        public final class ClusterSectionViewModel implements ClusterSection {
            public final String browseFlowToken;
            public final String id;
            public final OffersAnalyticsEventSpec impressionEventSpec;
            public final ImmutableList impressionEventSpecs;
            public final InfoTileViewModel infoItem;
            public final AbstractPersistentList offersList;

            public ClusterSectionViewModel(String str, InfoTileViewModel infoTileViewModel, AbstractPersistentList abstractPersistentList, String str2, OffersAnalyticsEventSpec offersAnalyticsEventSpec) {
                str.getClass();
                abstractPersistentList.getClass();
                this.id = str;
                this.infoItem = infoTileViewModel;
                this.offersList = abstractPersistentList;
                this.browseFlowToken = str2;
                this.impressionEventSpec = offersAnalyticsEventSpec;
                this.impressionEventSpecs = Tags.toImmutableList(CollectionsKt__CollectionsJVMKt.listOf(offersAnalyticsEventSpec));
            }

            public static ClusterSectionViewModel copy$default(ClusterSectionViewModel clusterSectionViewModel, AbstractPersistentList abstractPersistentList, String str, int i) {
                String str2 = clusterSectionViewModel.id;
                InfoTileViewModel infoTileViewModel = clusterSectionViewModel.infoItem;
                if ((i & 4) != 0) {
                    abstractPersistentList = clusterSectionViewModel.offersList;
                }
                AbstractPersistentList abstractPersistentList2 = abstractPersistentList;
                if ((i & 8) != 0) {
                    str = clusterSectionViewModel.browseFlowToken;
                }
                OffersAnalyticsEventSpec offersAnalyticsEventSpec = clusterSectionViewModel.impressionEventSpec;
                str2.getClass();
                abstractPersistentList2.getClass();
                return new ClusterSectionViewModel(str2, infoTileViewModel, abstractPersistentList2, str, offersAnalyticsEventSpec);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ClusterSectionViewModel)) {
                    return false;
                }
                ClusterSectionViewModel clusterSectionViewModel = (ClusterSectionViewModel) obj;
                return Intrinsics.areEqual(this.id, clusterSectionViewModel.id) && this.infoItem.equals(clusterSectionViewModel.infoItem) && Intrinsics.areEqual(this.offersList, clusterSectionViewModel.offersList) && this.browseFlowToken.equals(clusterSectionViewModel.browseFlowToken) && this.impressionEventSpec.equals(clusterSectionViewModel.impressionEventSpec);
            }

            @Override // com.squareup.cash.offers.viewmodels.itemviewmodels.OffersHomeListItemViewModel.ClusterSection
            public final String getBrowseFlowToken() {
                return this.browseFlowToken;
            }

            @Override // com.squareup.cash.offers.viewmodels.ImpressionReportable
            public final ImmutableList getImpressionEventSpecs() {
                return this.impressionEventSpecs;
            }

            @Override // com.squareup.cash.offers.viewmodels.itemviewmodels.OffersHomeListItemViewModel.ClusterSection
            public final InfoTileViewModel getInfoItem() {
                return this.infoItem;
            }

            @Override // com.squareup.cash.offers.viewmodels.itemviewmodels.OffersHomeListItemViewModel.ClusterSection
            public final AbstractPersistentList getOffersList() {
                return this.offersList;
            }

            public final int hashCode() {
                return this.impressionEventSpec.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.offersList.hashCode() + ((this.infoItem.hashCode() + (this.id.hashCode() * 31)) * 31)) * 31, 31, this.browseFlowToken);
            }

            public final String toString() {
                return "ClusterSectionViewModel(id=" + this.id + ", infoItem=" + this.infoItem + ", offersList=" + this.offersList + ", browseFlowToken=" + this.browseFlowToken + ", impressionEventSpec=" + this.impressionEventSpec + ")";
            }
        }

        String getBrowseFlowToken();

        InfoTileViewModel getInfoItem();

        AbstractPersistentList getOffersList();
    }

    public abstract class HeroOffersTileViewModel implements OffersHomeListItemViewModel {

        public final class CurrentTile extends HeroOffersTileViewModel implements ImpressionReportable {
            public final LegacyOffersAvatarViewModel avatar;
            public final Color backgroundColor;
            public final String boostToken;
            public final OfferCountdownTemplateViewModel countdownTemplate;
            public final boolean dimmerEnabled;
            public final HeroSection.HeroTile.DisplayStyle displayStyle;
            public final Image heroImage;
            public final Icon icon;
            public final ImmutableList impressionEventSpecs;
            public final OffersItemToken itemToken;
            public final String offerToken;
            public final boolean showActiveBoostAvatarBadge;
            public final StyledText subtitle;
            public final String tapActionUrl;
            public final ImmutableList tapEventSpecs;
            public final StyledText title;

            public CurrentTile(ImmutableList immutableList, String str, OffersItemToken offersItemToken, String str2, Image image, HeroSection.HeroTile.DisplayStyle displayStyle, LegacyOffersAvatarViewModel legacyOffersAvatarViewModel, boolean z, StyledText styledText, StyledText styledText2, OfferCountdownTemplateViewModel offerCountdownTemplateViewModel, Color color, boolean z2, String str3, AbstractPersistentList abstractPersistentList, Icon icon) {
                immutableList.getClass();
                str.getClass();
                image.getClass();
                str3.getClass();
                abstractPersistentList.getClass();
                this.impressionEventSpecs = immutableList;
                this.offerToken = str;
                this.itemToken = offersItemToken;
                this.boostToken = str2;
                this.heroImage = image;
                this.displayStyle = displayStyle;
                this.avatar = legacyOffersAvatarViewModel;
                this.showActiveBoostAvatarBadge = z;
                this.title = styledText;
                this.subtitle = styledText2;
                this.countdownTemplate = offerCountdownTemplateViewModel;
                this.backgroundColor = color;
                this.dimmerEnabled = z2;
                this.tapActionUrl = str3;
                this.tapEventSpecs = abstractPersistentList;
                this.icon = icon;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CurrentTile)) {
                    return false;
                }
                CurrentTile currentTile = (CurrentTile) obj;
                return Intrinsics.areEqual(this.impressionEventSpecs, currentTile.impressionEventSpecs) && Intrinsics.areEqual(this.offerToken, currentTile.offerToken) && Intrinsics.areEqual(this.itemToken, currentTile.itemToken) && Intrinsics.areEqual(this.boostToken, currentTile.boostToken) && Intrinsics.areEqual(this.heroImage, currentTile.heroImage) && this.displayStyle == currentTile.displayStyle && Intrinsics.areEqual(this.avatar, currentTile.avatar) && this.showActiveBoostAvatarBadge == currentTile.showActiveBoostAvatarBadge && Intrinsics.areEqual(this.title, currentTile.title) && Intrinsics.areEqual(this.subtitle, currentTile.subtitle) && Intrinsics.areEqual(this.countdownTemplate, currentTile.countdownTemplate) && Intrinsics.areEqual(this.backgroundColor, currentTile.backgroundColor) && this.dimmerEnabled == currentTile.dimmerEnabled && Intrinsics.areEqual(this.tapActionUrl, currentTile.tapActionUrl) && Intrinsics.areEqual(this.tapEventSpecs, currentTile.tapEventSpecs) && Intrinsics.areEqual(this.icon, currentTile.icon);
            }

            @Override // com.squareup.cash.offers.viewmodels.ImpressionReportable
            public final ImmutableList getImpressionEventSpecs() {
                return this.impressionEventSpecs;
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.impressionEventSpecs.hashCode() * 31, 31, this.offerToken);
                OffersItemToken offersItemToken = this.itemToken;
                int hashCode = (m + (offersItemToken == null ? 0 : offersItemToken.hashCode())) * 31;
                String str = this.boostToken;
                int hashCode2 = (this.displayStyle.hashCode() + ((this.heroImage.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
                LegacyOffersAvatarViewModel legacyOffersAvatarViewModel = this.avatar;
                int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (legacyOffersAvatarViewModel == null ? 0 : legacyOffersAvatarViewModel.hashCode())) * 31, 31, this.showActiveBoostAvatarBadge);
                StyledText styledText = this.title;
                int hashCode3 = (m2 + (styledText == null ? 0 : styledText.hashCode())) * 31;
                StyledText styledText2 = this.subtitle;
                int hashCode4 = (hashCode3 + (styledText2 == null ? 0 : styledText2.hashCode())) * 31;
                OfferCountdownTemplateViewModel offerCountdownTemplateViewModel = this.countdownTemplate;
                int hashCode5 = (hashCode4 + (offerCountdownTemplateViewModel == null ? 0 : offerCountdownTemplateViewModel.hashCode())) * 961;
                Color color = this.backgroundColor;
                int m3 = BalanceFeedKt$$ExternalSyntheticOutline0.m(this.tapEventSpecs, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode5 + (color == null ? 0 : color.hashCode())) * 31, 31, this.dimmerEnabled), 31, this.tapActionUrl), 31);
                Icon icon = this.icon;
                return m3 + (icon != null ? icon.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("CurrentTile(impressionEventSpecs=");
                sb.append(this.impressionEventSpecs);
                sb.append(", offerToken=");
                sb.append(this.offerToken);
                sb.append(", itemToken=");
                sb.append(this.itemToken);
                sb.append(", boostToken=");
                sb.append(this.boostToken);
                sb.append(", heroImage=");
                sb.append(this.heroImage);
                sb.append(", displayStyle=");
                sb.append(this.displayStyle);
                sb.append(", avatar=");
                sb.append(this.avatar);
                sb.append(", showActiveBoostAvatarBadge=");
                sb.append(this.showActiveBoostAvatarBadge);
                sb.append(", title=");
                sb.append(this.title);
                sb.append(", subtitle=");
                sb.append(this.subtitle);
                sb.append(", countdownTemplate=");
                sb.append(this.countdownTemplate);
                sb.append(", formattedDetailViewModel=null, backgroundColor=");
                sb.append(this.backgroundColor);
                sb.append(", dimmerEnabled=");
                NavAction$$ExternalSyntheticOutline0.m(sb, this.dimmerEnabled, ", tapActionUrl=", this.tapActionUrl, ", tapEventSpecs=");
                sb.append(this.tapEventSpecs);
                sb.append(", icon=");
                sb.append(this.icon);
                sb.append(")");
                return sb.toString();
            }
        }

        public final class Placeholder extends HeroOffersTileViewModel {
            public static final Placeholder INSTANCE = new Placeholder();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Placeholder);
            }

            public final int hashCode() {
                return 1063541831;
            }

            public final String toString() {
                return "Placeholder";
            }
        }
    }
}

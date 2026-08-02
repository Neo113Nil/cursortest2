package com.squareup.cash.offers.viewmodels.itemviewmodels;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.offers.backend.api.OffersAnalyticsEventSpec;
import com.squareup.cash.offers.viewmodels.ImpressionReportable;
import com.squareup.protos.cash.shop.rendering.api.StyledText;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import okhttp3.internal.Tags;

/* loaded from: classes6.dex */
public interface CategoryOffersTileViewModel extends ImpressionReportable {

    public final class CategoryIconTileViewModel implements CategoryOffersTileViewModel {
        public final Color backgroundColor;
        public final Image icon;
        public final OffersAnalyticsEventSpec impressionEventSpec;
        public final ImmutableList impressionEventSpecs;
        public final String tapActionUrl;
        public final ImmutableList tapEventSpecs;
        public final StyledText title;

        public CategoryIconTileViewModel(OffersAnalyticsEventSpec offersAnalyticsEventSpec, StyledText styledText, String str, AbstractPersistentList abstractPersistentList, Image image, Color color) {
            styledText.getClass();
            abstractPersistentList.getClass();
            this.impressionEventSpec = offersAnalyticsEventSpec;
            this.title = styledText;
            this.tapActionUrl = str;
            this.tapEventSpecs = abstractPersistentList;
            this.icon = image;
            this.backgroundColor = color;
            this.impressionEventSpecs = Tags.toImmutableList(CollectionsKt__CollectionsJVMKt.listOf(offersAnalyticsEventSpec));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CategoryIconTileViewModel)) {
                return false;
            }
            CategoryIconTileViewModel categoryIconTileViewModel = (CategoryIconTileViewModel) obj;
            return this.impressionEventSpec.equals(categoryIconTileViewModel.impressionEventSpec) && Intrinsics.areEqual(this.title, categoryIconTileViewModel.title) && this.tapActionUrl.equals(categoryIconTileViewModel.tapActionUrl) && Intrinsics.areEqual(this.tapEventSpecs, categoryIconTileViewModel.tapEventSpecs) && this.icon.equals(categoryIconTileViewModel.icon) && this.backgroundColor.equals(categoryIconTileViewModel.backgroundColor);
        }

        @Override // com.squareup.cash.offers.viewmodels.ImpressionReportable
        public final ImmutableList getImpressionEventSpecs() {
            return this.impressionEventSpecs;
        }

        @Override // com.squareup.cash.offers.viewmodels.itemviewmodels.CategoryOffersTileViewModel
        public final String getTapActionUrl() {
            return this.tapActionUrl;
        }

        @Override // com.squareup.cash.offers.viewmodels.itemviewmodels.CategoryOffersTileViewModel
        public final ImmutableList getTapEventSpecs() {
            return this.tapEventSpecs;
        }

        public final int hashCode() {
            return this.backgroundColor.hashCode() + ((this.icon.hashCode() + BalanceFeedKt$$ExternalSyntheticOutline0.m(this.tapEventSpecs, JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.title.hashCode() + (this.impressionEventSpec.hashCode() * 31)) * 961, 31, this.tapActionUrl), 31)) * 31);
        }

        public final String toString() {
            return "CategoryIconTileViewModel(impressionEventSpec=" + this.impressionEventSpec + ", title=" + this.title + ", subtitle=null, tapActionUrl=" + this.tapActionUrl + ", tapEventSpecs=" + this.tapEventSpecs + ", icon=" + this.icon + ", backgroundColor=" + this.backgroundColor + ")";
        }
    }

    public final class CategoryImageTileViewModel implements CategoryOffersTileViewModel {
        public final Image backgroundImage;
        public final OffersAnalyticsEventSpec impressionEventSpec;
        public final ImmutableList impressionEventSpecs;
        public final String tapActionUrl;
        public final ImmutableList tapEventSpecs;
        public final StyledText title;

        public CategoryImageTileViewModel(OffersAnalyticsEventSpec offersAnalyticsEventSpec, StyledText styledText, String str, AbstractPersistentList abstractPersistentList, Image image) {
            styledText.getClass();
            abstractPersistentList.getClass();
            image.getClass();
            this.impressionEventSpec = offersAnalyticsEventSpec;
            this.title = styledText;
            this.tapActionUrl = str;
            this.tapEventSpecs = abstractPersistentList;
            this.backgroundImage = image;
            this.impressionEventSpecs = Tags.toImmutableList(CollectionsKt__CollectionsJVMKt.listOf(offersAnalyticsEventSpec));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CategoryImageTileViewModel)) {
                return false;
            }
            CategoryImageTileViewModel categoryImageTileViewModel = (CategoryImageTileViewModel) obj;
            return this.impressionEventSpec.equals(categoryImageTileViewModel.impressionEventSpec) && Intrinsics.areEqual(this.title, categoryImageTileViewModel.title) && this.tapActionUrl.equals(categoryImageTileViewModel.tapActionUrl) && Intrinsics.areEqual(this.tapEventSpecs, categoryImageTileViewModel.tapEventSpecs) && Intrinsics.areEqual(this.backgroundImage, categoryImageTileViewModel.backgroundImage);
        }

        @Override // com.squareup.cash.offers.viewmodels.ImpressionReportable
        public final ImmutableList getImpressionEventSpecs() {
            return this.impressionEventSpecs;
        }

        @Override // com.squareup.cash.offers.viewmodels.itemviewmodels.CategoryOffersTileViewModel
        public final String getTapActionUrl() {
            return this.tapActionUrl;
        }

        @Override // com.squareup.cash.offers.viewmodels.itemviewmodels.CategoryOffersTileViewModel
        public final ImmutableList getTapEventSpecs() {
            return this.tapEventSpecs;
        }

        public final int hashCode() {
            return this.backgroundImage.hashCode() + BalanceFeedKt$$ExternalSyntheticOutline0.m(this.tapEventSpecs, JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.title.hashCode() + (this.impressionEventSpec.hashCode() * 31)) * 961, 31, this.tapActionUrl), 31);
        }

        public final String toString() {
            return "CategoryImageTileViewModel(impressionEventSpec=" + this.impressionEventSpec + ", title=" + this.title + ", subtitle=null, tapActionUrl=" + this.tapActionUrl + ", tapEventSpecs=" + this.tapEventSpecs + ", backgroundImage=" + this.backgroundImage + ")";
        }
    }

    String getTapActionUrl();

    ImmutableList getTapEventSpecs();
}

package com.squareup.cash.offers.viewmodels.itemviewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.offers.backend.api.OffersAnalyticsEventSpec;
import com.squareup.cash.offers.viewmodels.ImpressionReportable;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import okhttp3.internal.Tags;

/* loaded from: classes6.dex */
public interface OffersSearchListItemViewModel {

    public final class OffersSearchFilterRowViewModel implements OffersSearchListItemViewModel, ImpressionReportable {
        public final String filterToken;
        public final String id;
        public final ImmutableList impressionEventSpecs;
        public final OffersRowViewModel rowViewModel;

        public OffersSearchFilterRowViewModel(String str, ImmutableList immutableList, String str2, OffersRowViewModel offersRowViewModel) {
            immutableList.getClass();
            this.id = str;
            this.impressionEventSpecs = immutableList;
            this.filterToken = str2;
            this.rowViewModel = offersRowViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OffersSearchFilterRowViewModel)) {
                return false;
            }
            OffersSearchFilterRowViewModel offersSearchFilterRowViewModel = (OffersSearchFilterRowViewModel) obj;
            return this.id.equals(offersSearchFilterRowViewModel.id) && Intrinsics.areEqual(this.impressionEventSpecs, offersSearchFilterRowViewModel.impressionEventSpecs) && this.filterToken.equals(offersSearchFilterRowViewModel.filterToken) && this.rowViewModel.equals(offersSearchFilterRowViewModel.rowViewModel);
        }

        @Override // com.squareup.cash.offers.viewmodels.itemviewmodels.OffersSearchListItemViewModel
        public final String getId() {
            return this.id;
        }

        @Override // com.squareup.cash.offers.viewmodels.ImpressionReportable
        public final ImmutableList getImpressionEventSpecs() {
            return this.impressionEventSpecs;
        }

        public final int hashCode() {
            return this.rowViewModel.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(BalanceFeedKt$$ExternalSyntheticOutline0.m(this.impressionEventSpecs, this.id.hashCode() * 31, 31), 31, this.filterToken);
        }

        public final String toString() {
            return "OffersSearchFilterRowViewModel(id=" + this.id + ", impressionEventSpecs=" + this.impressionEventSpecs + ", filterToken=" + this.filterToken + ", rowViewModel=" + this.rowViewModel + ")";
        }
    }

    public final class RecentlyViewedSectionViewModel implements OffersSearchListItemViewModel, ImpressionReportable {
        public final String id;
        public final OffersAnalyticsEventSpec impressionEventSpec;
        public final ImmutableList impressionEventSpecs;
        public final List models;

        public RecentlyViewedSectionViewModel(String str, OffersAnalyticsEventSpec offersAnalyticsEventSpec, List list) {
            str.getClass();
            list.getClass();
            this.id = str;
            this.impressionEventSpec = offersAnalyticsEventSpec;
            this.models = list;
            this.impressionEventSpecs = Tags.toImmutableList(CollectionsKt__CollectionsKt.listOfNotNull(offersAnalyticsEventSpec));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RecentlyViewedSectionViewModel)) {
                return false;
            }
            RecentlyViewedSectionViewModel recentlyViewedSectionViewModel = (RecentlyViewedSectionViewModel) obj;
            return Intrinsics.areEqual(this.id, recentlyViewedSectionViewModel.id) && Intrinsics.areEqual(this.impressionEventSpec, recentlyViewedSectionViewModel.impressionEventSpec) && Intrinsics.areEqual(this.models, recentlyViewedSectionViewModel.models);
        }

        @Override // com.squareup.cash.offers.viewmodels.itemviewmodels.OffersSearchListItemViewModel
        public final String getId() {
            return this.id;
        }

        @Override // com.squareup.cash.offers.viewmodels.ImpressionReportable
        public final ImmutableList getImpressionEventSpecs() {
            return this.impressionEventSpecs;
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode() * 31;
            OffersAnalyticsEventSpec offersAnalyticsEventSpec = this.impressionEventSpec;
            return this.models.hashCode() + ((hashCode + (offersAnalyticsEventSpec == null ? 0 : offersAnalyticsEventSpec.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RecentlyViewedSectionViewModel(id=");
            sb.append(this.id);
            sb.append(", impressionEventSpec=");
            sb.append(this.impressionEventSpec);
            sb.append(", models=");
            return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.models, ")");
        }
    }

    String getId();
}

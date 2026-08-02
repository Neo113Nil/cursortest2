package com.squareup.cash.offers.viewmodels.viewevents;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.offers.backend.api.OffersItemToken;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* loaded from: classes6.dex */
public interface OffersHomeViewEvent {

    public final class ErrorRetryClicked implements OffersHomeViewEvent {
        public static final ErrorRetryClicked INSTANCE = new ErrorRetryClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ErrorRetryClicked);
        }

        public final int hashCode() {
            return -1350786686;
        }

        public final String toString() {
            return "ErrorRetryClicked";
        }
    }

    public final class LegalUrlClicked implements OffersHomeViewEvent {
        public final String url;

        public LegalUrlClicked(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LegalUrlClicked) && Intrinsics.areEqual(this.url, ((LegalUrlClicked) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LegalUrlClicked(url=", this.url, ")");
        }
    }

    public final class OffersCategoryTileClicked implements OffersHomeViewEvent, OffersAnalyticsViewEvent {
        public final String actionUrl;
        public final List analyticsActionEventSpecs;

        public OffersCategoryTileClicked(String str, ImmutableList immutableList) {
            str.getClass();
            immutableList.getClass();
            this.actionUrl = str;
            this.analyticsActionEventSpecs = immutableList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OffersCategoryTileClicked)) {
                return false;
            }
            OffersCategoryTileClicked offersCategoryTileClicked = (OffersCategoryTileClicked) obj;
            return Intrinsics.areEqual(this.actionUrl, offersCategoryTileClicked.actionUrl) && Intrinsics.areEqual(this.analyticsActionEventSpecs, offersCategoryTileClicked.analyticsActionEventSpecs);
        }

        @Override // com.squareup.cash.offers.viewmodels.viewevents.OffersAnalyticsViewEvent
        public final List getAnalyticsActionEventSpecs() {
            return this.analyticsActionEventSpecs;
        }

        public final int hashCode() {
            return this.analyticsActionEventSpecs.hashCode() + (this.actionUrl.hashCode() * 31);
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("OffersCategoryTileClicked(actionUrl=", this.actionUrl, ", analyticsActionEventSpecs=", ")", this.analyticsActionEventSpecs);
        }
    }

    public final class OffersClusterInfoItemClicked implements OffersHomeViewEvent, OffersAnalyticsViewEvent {
        public final String actionUrl;
        public final List analyticsActionEventSpecs;

        public OffersClusterInfoItemClicked(String str, ImmutableList immutableList) {
            immutableList.getClass();
            this.actionUrl = str;
            this.analyticsActionEventSpecs = immutableList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OffersClusterInfoItemClicked)) {
                return false;
            }
            OffersClusterInfoItemClicked offersClusterInfoItemClicked = (OffersClusterInfoItemClicked) obj;
            return this.actionUrl.equals(offersClusterInfoItemClicked.actionUrl) && Intrinsics.areEqual(this.analyticsActionEventSpecs, offersClusterInfoItemClicked.analyticsActionEventSpecs);
        }

        @Override // com.squareup.cash.offers.viewmodels.viewevents.OffersAnalyticsViewEvent
        public final List getAnalyticsActionEventSpecs() {
            return this.analyticsActionEventSpecs;
        }

        public final int hashCode() {
            return this.analyticsActionEventSpecs.hashCode() + (this.actionUrl.hashCode() * 31);
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("OffersClusterInfoItemClicked(actionUrl=", this.actionUrl, ", analyticsActionEventSpecs=", ")", this.analyticsActionEventSpecs);
        }
    }

    public final class OffersClusterItemClicked implements OffersHomeViewEvent, OffersAnalyticsViewEvent {
        public final String actionUrl;
        public final List analyticsActionEventSpecs;
        public final OffersItemToken itemToken;

        public OffersClusterItemClicked(String str, OffersItemToken offersItemToken, ImmutableList immutableList) {
            str.getClass();
            immutableList.getClass();
            this.actionUrl = str;
            this.itemToken = offersItemToken;
            this.analyticsActionEventSpecs = immutableList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OffersClusterItemClicked)) {
                return false;
            }
            OffersClusterItemClicked offersClusterItemClicked = (OffersClusterItemClicked) obj;
            return Intrinsics.areEqual(this.actionUrl, offersClusterItemClicked.actionUrl) && Intrinsics.areEqual(this.itemToken, offersClusterItemClicked.itemToken) && Intrinsics.areEqual(this.analyticsActionEventSpecs, offersClusterItemClicked.analyticsActionEventSpecs);
        }

        @Override // com.squareup.cash.offers.viewmodels.viewevents.OffersAnalyticsViewEvent
        public final List getAnalyticsActionEventSpecs() {
            return this.analyticsActionEventSpecs;
        }

        public final int hashCode() {
            int hashCode = this.actionUrl.hashCode() * 31;
            OffersItemToken offersItemToken = this.itemToken;
            return this.analyticsActionEventSpecs.hashCode() + ((hashCode + (offersItemToken == null ? 0 : offersItemToken.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OffersClusterItemClicked(actionUrl=");
            sb.append(this.actionUrl);
            sb.append(", itemToken=");
            sb.append(this.itemToken);
            sb.append(", analyticsActionEventSpecs=");
            return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.analyticsActionEventSpecs, ")");
        }
    }

    public final class OffersHeroTileClicked implements OffersHomeViewEvent, OffersAnalyticsViewEvent {
        public final String actionUrl;
        public final List analyticsActionEventSpecs;
        public final OffersItemToken itemToken;

        public OffersHeroTileClicked(String str, OffersItemToken offersItemToken, List list) {
            str.getClass();
            list.getClass();
            this.actionUrl = str;
            this.itemToken = offersItemToken;
            this.analyticsActionEventSpecs = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OffersHeroTileClicked)) {
                return false;
            }
            OffersHeroTileClicked offersHeroTileClicked = (OffersHeroTileClicked) obj;
            return Intrinsics.areEqual(this.actionUrl, offersHeroTileClicked.actionUrl) && Intrinsics.areEqual(this.itemToken, offersHeroTileClicked.itemToken) && Intrinsics.areEqual(this.analyticsActionEventSpecs, offersHeroTileClicked.analyticsActionEventSpecs);
        }

        @Override // com.squareup.cash.offers.viewmodels.viewevents.OffersAnalyticsViewEvent
        public final List getAnalyticsActionEventSpecs() {
            return this.analyticsActionEventSpecs;
        }

        public final int hashCode() {
            int hashCode = this.actionUrl.hashCode() * 31;
            OffersItemToken offersItemToken = this.itemToken;
            return this.analyticsActionEventSpecs.hashCode() + ((hashCode + (offersItemToken == null ? 0 : offersItemToken.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OffersHeroTileClicked(actionUrl=");
            sb.append(this.actionUrl);
            sb.append(", itemToken=");
            sb.append(this.itemToken);
            sb.append(", analyticsActionEventSpecs=");
            return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.analyticsActionEventSpecs, ")");
        }
    }

    public final class OffersHomePillClicked implements OffersHomeViewEvent, OffersAnalyticsViewEvent {
        public final String actionUrl;
        public final List analyticsActionEventSpecs;

        public OffersHomePillClicked(String str, List list) {
            str.getClass();
            list.getClass();
            this.actionUrl = str;
            this.analyticsActionEventSpecs = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OffersHomePillClicked)) {
                return false;
            }
            OffersHomePillClicked offersHomePillClicked = (OffersHomePillClicked) obj;
            return Intrinsics.areEqual(this.actionUrl, offersHomePillClicked.actionUrl) && Intrinsics.areEqual(this.analyticsActionEventSpecs, offersHomePillClicked.analyticsActionEventSpecs);
        }

        @Override // com.squareup.cash.offers.viewmodels.viewevents.OffersAnalyticsViewEvent
        public final List getAnalyticsActionEventSpecs() {
            return this.analyticsActionEventSpecs;
        }

        public final int hashCode() {
            return this.analyticsActionEventSpecs.hashCode() + (this.actionUrl.hashCode() * 31);
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("OffersHomePillClicked(actionUrl=", this.actionUrl, ", analyticsActionEventSpecs=", ")", this.analyticsActionEventSpecs);
        }
    }

    public final class OffersPullDownToRefresh implements OffersHomeViewEvent {
        public static final OffersPullDownToRefresh INSTANCE = new OffersPullDownToRefresh();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OffersPullDownToRefresh);
        }

        public final int hashCode() {
            return 633588989;
        }

        public final String toString() {
            return "OffersPullDownToRefresh";
        }
    }

    public final class OnSearchBarFocusAcquired implements OffersHomeViewEvent {
        public static final OnSearchBarFocusAcquired INSTANCE = new OnSearchBarFocusAcquired();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnSearchBarFocusAcquired);
        }

        public final int hashCode() {
            return -1443149537;
        }

        public final String toString() {
            return "OnSearchBarFocusAcquired";
        }
    }

    public final class SearchBarBackButtonClicked implements OffersHomeViewEvent {
        public static final SearchBarBackButtonClicked INSTANCE = new SearchBarBackButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SearchBarBackButtonClicked);
        }

        public final int hashCode() {
            return -931177400;
        }

        public final String toString() {
            return "SearchBarBackButtonClicked";
        }
    }

    public final class SystemBackPressed implements OffersHomeViewEvent {
        public static final SystemBackPressed INSTANCE = new SystemBackPressed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SystemBackPressed);
        }

        public final int hashCode() {
            return -1732534649;
        }

        public final String toString() {
            return "SystemBackPressed";
        }
    }

    public final class ViewBackEvent implements OffersHomeViewEvent {
        public static final ViewBackEvent INSTANCE = new ViewBackEvent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ViewBackEvent);
        }

        public final int hashCode() {
            return 1315785033;
        }

        public final String toString() {
            return "ViewBackEvent";
        }
    }
}

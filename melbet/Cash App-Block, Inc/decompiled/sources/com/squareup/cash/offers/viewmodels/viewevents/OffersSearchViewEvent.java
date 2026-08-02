package com.squareup.cash.offers.viewmodels.viewevents;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface OffersSearchViewEvent {

    public final class ErrorRetryClicked implements OffersSearchViewEvent {
        public static final ErrorRetryClicked INSTANCE = new ErrorRetryClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ErrorRetryClicked);
        }

        public final int hashCode() {
            return 1137588825;
        }

        public final String toString() {
            return "ErrorRetryClicked";
        }
    }

    public final class FilterGroupApplied implements OffersSearchViewEvent {
        public final int filterGroupIndex;
        public final String selectedFilterToken;

        public FilterGroupApplied(int i, String str) {
            this.filterGroupIndex = i;
            this.selectedFilterToken = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FilterGroupApplied)) {
                return false;
            }
            FilterGroupApplied filterGroupApplied = (FilterGroupApplied) obj;
            return this.filterGroupIndex == filterGroupApplied.filterGroupIndex && Intrinsics.areEqual(this.selectedFilterToken, filterGroupApplied.selectedFilterToken);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.filterGroupIndex) * 31;
            String str = this.selectedFilterToken;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "FilterGroupApplied(filterGroupIndex=" + this.filterGroupIndex + ", selectedFilterToken=" + this.selectedFilterToken + ")";
        }
    }

    public final class FilterGroupClicked implements OffersSearchViewEvent {
        public final int filterGroupIndex;

        public FilterGroupClicked(int i) {
            this.filterGroupIndex = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FilterGroupClicked) && this.filterGroupIndex == ((FilterGroupClicked) obj).filterGroupIndex;
        }

        public final int hashCode() {
            return Integer.hashCode(this.filterGroupIndex);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.filterGroupIndex, "FilterGroupClicked(filterGroupIndex=", ")");
        }
    }

    public final class FilterRowClicked implements OffersSearchViewEvent, OffersAnalyticsViewEvent {
        public final List analyticsActionEventSpecs;
        public final String filterToken;

        public FilterRowClicked(String str, List list) {
            str.getClass();
            list.getClass();
            this.filterToken = str;
            this.analyticsActionEventSpecs = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FilterRowClicked)) {
                return false;
            }
            FilterRowClicked filterRowClicked = (FilterRowClicked) obj;
            return Intrinsics.areEqual(this.filterToken, filterRowClicked.filterToken) && Intrinsics.areEqual(this.analyticsActionEventSpecs, filterRowClicked.analyticsActionEventSpecs);
        }

        @Override // com.squareup.cash.offers.viewmodels.viewevents.OffersAnalyticsViewEvent
        public final List getAnalyticsActionEventSpecs() {
            return this.analyticsActionEventSpecs;
        }

        public final int hashCode() {
            return this.analyticsActionEventSpecs.hashCode() + (this.filterToken.hashCode() * 31);
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("FilterRowClicked(filterToken=", this.filterToken, ", analyticsActionEventSpecs=", ")", this.analyticsActionEventSpecs);
        }
    }

    public final class ResetSearch implements OffersSearchViewEvent {
        public static final ResetSearch INSTANCE = new ResetSearch();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ResetSearch);
        }

        public final int hashCode() {
            return 388457769;
        }

        public final String toString() {
            return "ResetSearch";
        }
    }

    public final class SearchTextChanged implements OffersSearchViewEvent {
        public final String searchText;

        public SearchTextChanged(String str) {
            str.getClass();
            this.searchText = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SearchTextChanged) && Intrinsics.areEqual(this.searchText, ((SearchTextChanged) obj).searchText);
        }

        public final int hashCode() {
            return this.searchText.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SearchTextChanged(searchText=", this.searchText, ")");
        }
    }
}

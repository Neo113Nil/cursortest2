package com.squareup.cash.offers.viewmodels.viewevents;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface OffersFilterGroupSheetViewEvent {

    public final class FilterApplied implements OffersFilterGroupSheetViewEvent, OffersAnalyticsViewEvent {
        public final List analyticsActionEventSpecs;

        public FilterApplied(List list) {
            list.getClass();
            this.analyticsActionEventSpecs = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FilterApplied) && Intrinsics.areEqual(this.analyticsActionEventSpecs, ((FilterApplied) obj).analyticsActionEventSpecs);
        }

        @Override // com.squareup.cash.offers.viewmodels.viewevents.OffersAnalyticsViewEvent
        public final List getAnalyticsActionEventSpecs() {
            return this.analyticsActionEventSpecs;
        }

        public final int hashCode() {
            return this.analyticsActionEventSpecs.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("FilterApplied(analyticsActionEventSpecs=", ")", this.analyticsActionEventSpecs);
        }
    }

    public final class FilterGroupCleared implements OffersFilterGroupSheetViewEvent {
        public static final FilterGroupCleared INSTANCE = new FilterGroupCleared();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FilterGroupCleared);
        }

        public final int hashCode() {
            return -1100397565;
        }

        public final String toString() {
            return "FilterGroupCleared";
        }
    }

    public final class FilterSelected implements OffersFilterGroupSheetViewEvent, OffersAnalyticsViewEvent {
        public final List analyticsActionEventSpecs;
        public final String filterToken;

        public FilterSelected(String str, List list) {
            str.getClass();
            list.getClass();
            this.filterToken = str;
            this.analyticsActionEventSpecs = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FilterSelected)) {
                return false;
            }
            FilterSelected filterSelected = (FilterSelected) obj;
            return Intrinsics.areEqual(this.filterToken, filterSelected.filterToken) && Intrinsics.areEqual(this.analyticsActionEventSpecs, filterSelected.analyticsActionEventSpecs);
        }

        @Override // com.squareup.cash.offers.viewmodels.viewevents.OffersAnalyticsViewEvent
        public final List getAnalyticsActionEventSpecs() {
            return this.analyticsActionEventSpecs;
        }

        public final int hashCode() {
            return this.analyticsActionEventSpecs.hashCode() + (this.filterToken.hashCode() * 31);
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("FilterSelected(filterToken=", this.filterToken, ", analyticsActionEventSpecs=", ")", this.analyticsActionEventSpecs);
        }
    }
}

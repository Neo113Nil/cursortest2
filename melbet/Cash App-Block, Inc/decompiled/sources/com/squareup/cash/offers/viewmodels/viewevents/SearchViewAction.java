package com.squareup.cash.offers.viewmodels.viewevents;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class SearchViewAction {

    public final class FilterRowClick extends SearchViewAction {
        public final String filterToken;
        public final List onTapAnalyticsEventSpecs;

        public FilterRowClick(String str, List list) {
            str.getClass();
            list.getClass();
            this.filterToken = str;
            this.onTapAnalyticsEventSpecs = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FilterRowClick)) {
                return false;
            }
            FilterRowClick filterRowClick = (FilterRowClick) obj;
            return Intrinsics.areEqual(this.filterToken, filterRowClick.filterToken) && Intrinsics.areEqual(this.onTapAnalyticsEventSpecs, filterRowClick.onTapAnalyticsEventSpecs);
        }

        public final int hashCode() {
            return this.onTapAnalyticsEventSpecs.hashCode() + (this.filterToken.hashCode() * 31);
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("FilterRowClick(filterToken=", this.filterToken, ", onTapAnalyticsEventSpecs=", ")", this.onTapAnalyticsEventSpecs);
        }
    }

    public final class Reset extends SearchViewAction {
        public static final Reset INSTANCE = new Reset();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Reset);
        }

        public final int hashCode() {
            return -128946438;
        }

        public final String toString() {
            return "Reset";
        }
    }

    public final class SearchTextChange extends SearchViewAction {
        public static final SearchTextChange INSTANCE = new SearchTextChange();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SearchTextChange);
        }

        public final int hashCode() {
            return 1848427642;
        }

        public final String toString() {
            return "SearchTextChange";
        }
    }
}

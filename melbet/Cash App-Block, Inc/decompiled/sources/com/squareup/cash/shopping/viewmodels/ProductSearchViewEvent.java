package com.squareup.cash.shopping.viewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface ProductSearchViewEvent {

    public final class FilterClick implements ProductSearchViewEvent {
        public static final FilterClick INSTANCE = new FilterClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FilterClick);
        }

        public final int hashCode() {
            return -1480970197;
        }

        public final String toString() {
            return "FilterClick";
        }
    }

    public final class NavigateUpClick implements ProductSearchViewEvent {
        public static final NavigateUpClick INSTANCE = new NavigateUpClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateUpClick);
        }

        public final int hashCode() {
            return 183801527;
        }

        public final String toString() {
            return "NavigateUpClick";
        }
    }

    public final class RestoreState implements ProductSearchViewEvent {
        public final boolean hasAppliedFilters;
        public final boolean hasSearchResults;
        public final boolean showFilters;

        public RestoreState(boolean z, boolean z2, boolean z3) {
            this.hasSearchResults = z;
            this.hasAppliedFilters = z2;
            this.showFilters = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RestoreState)) {
                return false;
            }
            RestoreState restoreState = (RestoreState) obj;
            return this.hasSearchResults == restoreState.hasSearchResults && this.hasAppliedFilters == restoreState.hasAppliedFilters && this.showFilters == restoreState.showFilters;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.showFilters) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.hasSearchResults) * 31, 31, this.hasAppliedFilters);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m("RestoreState(hasSearchResults=", ", hasAppliedFilters=", ", showFilters=", this.hasSearchResults, this.hasAppliedFilters), this.showFilters, ")");
        }
    }

    public final class RetrySearchClick implements ProductSearchViewEvent {
        public static final RetrySearchClick INSTANCE = new RetrySearchClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RetrySearchClick);
        }

        public final int hashCode() {
            return -159148387;
        }

        public final String toString() {
            return "RetrySearchClick";
        }
    }

    public final class SearchTextChange implements ProductSearchViewEvent {
        public final String searchText;

        public SearchTextChange(String str) {
            str.getClass();
            this.searchText = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SearchTextChange) && Intrinsics.areEqual(this.searchText, ((SearchTextChange) obj).searchText);
        }

        public final int hashCode() {
            return this.searchText.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SearchTextChange(searchText=", this.searchText, ")");
        }
    }
}

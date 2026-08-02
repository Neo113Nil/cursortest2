package com.squareup.cash.shopping.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface BrandsSearchViewEvent {

    public final class NavigateUpClick implements BrandsSearchViewEvent {
        public static final NavigateUpClick INSTANCE = new NavigateUpClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateUpClick);
        }

        public final int hashCode() {
            return -788273212;
        }

        public final String toString() {
            return "NavigateUpClick";
        }
    }

    public final class RetrySearchClick implements BrandsSearchViewEvent {
        public static final RetrySearchClick INSTANCE = new RetrySearchClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RetrySearchClick);
        }

        public final int hashCode() {
            return -228694224;
        }

        public final String toString() {
            return "RetrySearchClick";
        }
    }

    public final class SearchTextChange implements BrandsSearchViewEvent {
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

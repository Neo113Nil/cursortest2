package com.squareup.cash.shopping.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class ProductSearchViewModel {

    public final class Loaded extends ProductSearchViewModel {
        public final Error error;
        public final boolean filtersApplied;
        public final List items;
        public final String searchText;
        public final boolean shouldShowFilters;

        public final class Error {
            public final String message;

            public Error(String str) {
                this.message = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.areEqual(this.message, ((Error) obj).message);
            }

            public final int hashCode() {
                String str = this.message;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Error(message=", this.message, ")");
            }
        }

        public Loaded(String str, boolean z, boolean z2, List list, Error error) {
            str.getClass();
            list.getClass();
            this.searchText = str;
            this.filtersApplied = z;
            this.shouldShowFilters = z2;
            this.items = list;
            this.error = error;
        }

        public static Loaded copy$default(Loaded loaded, boolean z) {
            String str = loaded.searchText;
            boolean z2 = loaded.filtersApplied;
            List list = loaded.items;
            Error error = loaded.error;
            str.getClass();
            list.getClass();
            return new Loaded(str, z2, z, list, error);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return Intrinsics.areEqual(this.searchText, loaded.searchText) && this.filtersApplied == loaded.filtersApplied && this.shouldShowFilters == loaded.shouldShowFilters && Intrinsics.areEqual(this.items, loaded.items) && Intrinsics.areEqual(this.error, loaded.error);
        }

        @Override // com.squareup.cash.shopping.viewmodels.ProductSearchViewModel
        public final boolean getFiltersApplied() {
            return this.filtersApplied;
        }

        @Override // com.squareup.cash.shopping.viewmodels.ProductSearchViewModel
        public final String getSearchText() {
            return this.searchText;
        }

        @Override // com.squareup.cash.shopping.viewmodels.ProductSearchViewModel
        public final boolean getShouldShowFilters() {
            return this.shouldShowFilters;
        }

        public final int hashCode() {
            int m = Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.searchText.hashCode() * 31, 31, this.filtersApplied), 31, this.shouldShowFilters), 31, this.items);
            Error error = this.error;
            return m + (error == null ? 0 : error.hashCode());
        }

        public final String toString() {
            StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("Loaded(searchText=", this.searchText, ", filtersApplied=", ", shouldShowFilters=", this.filtersApplied);
            m1540m.append(this.shouldShowFilters);
            m1540m.append(", items=");
            m1540m.append(this.items);
            m1540m.append(", error=");
            m1540m.append(this.error);
            m1540m.append(")");
            return m1540m.toString();
        }
    }

    public final class Loading extends ProductSearchViewModel {
        public final boolean filtersApplied;
        public final String searchText;
        public final boolean shouldShowFilters;

        public Loading(String str, boolean z, boolean z2) {
            str.getClass();
            this.searchText = str;
            this.filtersApplied = z;
            this.shouldShowFilters = z2;
        }

        public static Loading copy$default(Loading loading, boolean z) {
            String str = loading.searchText;
            boolean z2 = loading.filtersApplied;
            str.getClass();
            return new Loading(str, z2, z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loading)) {
                return false;
            }
            Loading loading = (Loading) obj;
            return Intrinsics.areEqual(this.searchText, loading.searchText) && this.filtersApplied == loading.filtersApplied && this.shouldShowFilters == loading.shouldShowFilters;
        }

        @Override // com.squareup.cash.shopping.viewmodels.ProductSearchViewModel
        public final boolean getFiltersApplied() {
            return this.filtersApplied;
        }

        @Override // com.squareup.cash.shopping.viewmodels.ProductSearchViewModel
        public final String getSearchText() {
            return this.searchText;
        }

        @Override // com.squareup.cash.shopping.viewmodels.ProductSearchViewModel
        public final boolean getShouldShowFilters() {
            return this.shouldShowFilters;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.shouldShowFilters) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.searchText.hashCode() * 31, 31, this.filtersApplied);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Request$Priority$EnumUnboxingLocalUtility.m1540m("Loading(searchText=", this.searchText, ", filtersApplied=", ", shouldShowFilters=", this.filtersApplied), this.shouldShowFilters, ")");
        }
    }

    public abstract boolean getFiltersApplied();

    public abstract String getSearchText();

    public abstract boolean getShouldShowFilters();
}

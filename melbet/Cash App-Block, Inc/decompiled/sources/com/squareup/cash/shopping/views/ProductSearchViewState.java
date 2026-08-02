package com.squareup.cash.shopping.views;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.shopping.settings.screens.ErrorScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ProductSearchViewState implements Parcelable {
    public static final Parcelable.Creator<ProductSearchViewState> CREATOR = new ErrorScreen.Creator(23);
    public final boolean hasAppliedFilters;
    public final boolean hasSearchResults;
    public final boolean isInitialState;
    public final String searchText;
    public final boolean showFilters;

    public ProductSearchViewState(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        str.getClass();
        this.searchText = str;
        this.isInitialState = z;
        this.hasSearchResults = z2;
        this.hasAppliedFilters = z3;
        this.showFilters = z4;
    }

    public static ProductSearchViewState copy$default(ProductSearchViewState productSearchViewState, String str, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            str = productSearchViewState.searchText;
        }
        String str2 = str;
        boolean z4 = (i & 2) != 0 ? productSearchViewState.isInitialState : false;
        if ((i & 4) != 0) {
            z = productSearchViewState.hasSearchResults;
        }
        boolean z5 = z;
        if ((i & 8) != 0) {
            z2 = productSearchViewState.hasAppliedFilters;
        }
        boolean z6 = z2;
        if ((i & 16) != 0) {
            z3 = productSearchViewState.showFilters;
        }
        productSearchViewState.getClass();
        str2.getClass();
        return new ProductSearchViewState(str2, z4, z5, z6, z3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductSearchViewState)) {
            return false;
        }
        ProductSearchViewState productSearchViewState = (ProductSearchViewState) obj;
        return Intrinsics.areEqual(this.searchText, productSearchViewState.searchText) && this.isInitialState == productSearchViewState.isInitialState && this.hasSearchResults == productSearchViewState.hasSearchResults && this.hasAppliedFilters == productSearchViewState.hasAppliedFilters && this.showFilters == productSearchViewState.showFilters;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.showFilters) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.searchText.hashCode() * 31, 31, this.isInitialState), 31, this.hasSearchResults), 31, this.hasAppliedFilters);
    }

    public final String toString() {
        StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("ProductSearchViewState(searchText=", this.searchText, ", isInitialState=", ", hasSearchResults=", this.isInitialState);
        re$$ExternalSyntheticOutline0.m(m1540m, this.hasSearchResults, ", hasAppliedFilters=", this.hasAppliedFilters, ", showFilters=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m1540m, this.showFilters, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.searchText);
        parcel.writeInt(this.isInitialState ? 1 : 0);
        parcel.writeInt(this.hasSearchResults ? 1 : 0);
        parcel.writeInt(this.hasAppliedFilters ? 1 : 0);
        parcel.writeInt(this.showFilters ? 1 : 0);
    }
}

package com.squareup.cash.offers.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.nearby.viewmodels.ListSection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class OffersFilterGroupSheetResult implements Parcelable {
    public static final Parcelable.Creator<OffersFilterGroupSheetResult> CREATOR = new ListSection.Creator(4);
    public final int filterGroupIndex;
    public final String selectedFilterToken;

    public OffersFilterGroupSheetResult(int i, String str) {
        this.filterGroupIndex = i;
        this.selectedFilterToken = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersFilterGroupSheetResult)) {
            return false;
        }
        OffersFilterGroupSheetResult offersFilterGroupSheetResult = (OffersFilterGroupSheetResult) obj;
        return this.filterGroupIndex == offersFilterGroupSheetResult.filterGroupIndex && Intrinsics.areEqual(this.selectedFilterToken, offersFilterGroupSheetResult.selectedFilterToken);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.filterGroupIndex) * 31;
        String str = this.selectedFilterToken;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "OffersFilterGroupSheetResult(filterGroupIndex=" + this.filterGroupIndex + ", selectedFilterToken=" + this.selectedFilterToken + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.filterGroupIndex);
        parcel.writeString(this.selectedFilterToken);
    }
}

package com.squareup.cash.offers.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.BottomSheetScreen;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.nearby.viewmodels.ListSection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class OffersScreen$OffersFilterGroupSheetScreen implements Screen, BottomSheetScreen {
    public static final Parcelable.Creator<OffersScreen$OffersFilterGroupSheetScreen> CREATOR = new ListSection.Creator(7);
    public final int filterGroupIndex;
    public final String selectedFilterToken;

    public OffersScreen$OffersFilterGroupSheetScreen(int i, String str) {
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
        if (!(obj instanceof OffersScreen$OffersFilterGroupSheetScreen)) {
            return false;
        }
        OffersScreen$OffersFilterGroupSheetScreen offersScreen$OffersFilterGroupSheetScreen = (OffersScreen$OffersFilterGroupSheetScreen) obj;
        return this.filterGroupIndex == offersScreen$OffersFilterGroupSheetScreen.filterGroupIndex && Intrinsics.areEqual(this.selectedFilterToken, offersScreen$OffersFilterGroupSheetScreen.selectedFilterToken);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.filterGroupIndex) * 31;
        String str = this.selectedFilterToken;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "OffersFilterGroupSheetScreen(filterGroupIndex=" + this.filterGroupIndex + ", selectedFilterToken=" + this.selectedFilterToken + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.filterGroupIndex);
        parcel.writeString(this.selectedFilterToken);
    }
}

package com.squareup.cash.family.requestsponsorship.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.family.familyhub.screens.FamilyHome;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class SelectSponsorErrorScreen implements BlockersScreens, Screen, OnlyOneOverlayTreatment {
    public static final Parcelable.Creator<SelectSponsorErrorScreen> CREATOR = new FamilyHome.Creator(27);
    public final BlockersData blockersData;
    public final String message;

    public SelectSponsorErrorScreen(BlockersData blockersData, String str) {
        blockersData.getClass();
        str.getClass();
        this.blockersData = blockersData;
        this.message = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectSponsorErrorScreen)) {
            return false;
        }
        SelectSponsorErrorScreen selectSponsorErrorScreen = (SelectSponsorErrorScreen) obj;
        return Intrinsics.areEqual(this.blockersData, selectSponsorErrorScreen.blockersData) && Intrinsics.areEqual(this.message, selectSponsorErrorScreen.message);
    }

    @Override // com.squareup.cash.blockers.screens.BlockersScreens
    public final BlockersData getBlockersData() {
        return this.blockersData;
    }

    public final int hashCode() {
        return this.message.hashCode() + (this.blockersData.hashCode() * 31);
    }

    public final String toString() {
        return "SelectSponsorErrorScreen(blockersData=" + this.blockersData + ", message=" + this.message + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.blockersData, i);
        parcel.writeString(this.message);
    }
}

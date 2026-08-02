package com.squareup.cash.family.requestsponsorship.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.family.familyhub.screens.FamilyHome;
import com.squareup.protos.franklin.api.SponsorSelectionDetailsBlocker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class SponsorSelectionDetailsScreen implements BlockersScreens {
    public static final Parcelable.Creator<SponsorSelectionDetailsScreen> CREATOR = new FamilyHome.Creator(28);
    public final SponsorSelectionDetailsBlocker blocker;
    public final BlockersData blockersData;

    public SponsorSelectionDetailsScreen(BlockersData blockersData, SponsorSelectionDetailsBlocker sponsorSelectionDetailsBlocker) {
        blockersData.getClass();
        sponsorSelectionDetailsBlocker.getClass();
        this.blockersData = blockersData;
        this.blocker = sponsorSelectionDetailsBlocker;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SponsorSelectionDetailsScreen)) {
            return false;
        }
        SponsorSelectionDetailsScreen sponsorSelectionDetailsScreen = (SponsorSelectionDetailsScreen) obj;
        return Intrinsics.areEqual(this.blockersData, sponsorSelectionDetailsScreen.blockersData) && Intrinsics.areEqual(this.blocker, sponsorSelectionDetailsScreen.blocker);
    }

    @Override // com.squareup.cash.blockers.screens.BlockersScreens
    public final BlockersData getBlockersData() {
        return this.blockersData;
    }

    public final int hashCode() {
        return this.blocker.hashCode() + (this.blockersData.hashCode() * 31);
    }

    public final String toString() {
        return "SponsorSelectionDetailsScreen(blockersData=" + this.blockersData + ", blocker=" + this.blocker + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.blockersData, i);
        parcel.writeParcelable(this.blocker, i);
    }
}

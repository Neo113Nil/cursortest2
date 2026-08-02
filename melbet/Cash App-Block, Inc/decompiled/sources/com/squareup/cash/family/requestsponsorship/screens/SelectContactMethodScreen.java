package com.squareup.cash.family.requestsponsorship.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.family.familyhub.screens.FamilyHome;
import com.squareup.cash.recipients.data.Recipient;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class SelectContactMethodScreen implements BlockersScreens {
    public static final Parcelable.Creator<SelectContactMethodScreen> CREATOR = new FamilyHome.Creator(26);
    public final BlockersData blockersData;
    public final boolean isRecommended;
    public final Recipient recipient;

    public SelectContactMethodScreen(BlockersData blockersData, Recipient recipient, boolean z) {
        blockersData.getClass();
        recipient.getClass();
        this.blockersData = blockersData;
        this.recipient = recipient;
        this.isRecommended = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectContactMethodScreen)) {
            return false;
        }
        SelectContactMethodScreen selectContactMethodScreen = (SelectContactMethodScreen) obj;
        return Intrinsics.areEqual(this.blockersData, selectContactMethodScreen.blockersData) && Intrinsics.areEqual(this.recipient, selectContactMethodScreen.recipient) && this.isRecommended == selectContactMethodScreen.isRecommended;
    }

    @Override // com.squareup.cash.blockers.screens.BlockersScreens
    public final BlockersData getBlockersData() {
        return this.blockersData;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isRecommended) + ((this.recipient.hashCode() + (this.blockersData.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SelectContactMethodScreen(blockersData=" + this.blockersData + ", recipient=██, isRecommended=" + this.isRecommended + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.blockersData, i);
        parcel.writeParcelable(this.recipient, i);
        parcel.writeInt(this.isRecommended ? 1 : 0);
    }
}

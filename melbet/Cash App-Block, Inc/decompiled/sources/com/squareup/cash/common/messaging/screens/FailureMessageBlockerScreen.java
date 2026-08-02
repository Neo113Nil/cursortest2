package com.squareup.cash.common.messaging.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.clientrouting.data.RoutingParams;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class FailureMessageBlockerScreen implements BlockersScreens.BlockersDialogScreens {
    public static final Parcelable.Creator<FailureMessageBlockerScreen> CREATOR = new RoutingParams.Creator(20);
    public final BlockersData blockersData;
    public final String message;
    public final String title;

    public /* synthetic */ FailureMessageBlockerScreen(BlockersData blockersData, String str, String str2, int i) {
        this(blockersData, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FailureMessageBlockerScreen)) {
            return false;
        }
        FailureMessageBlockerScreen failureMessageBlockerScreen = (FailureMessageBlockerScreen) obj;
        return Intrinsics.areEqual(this.blockersData, failureMessageBlockerScreen.blockersData) && Intrinsics.areEqual(this.message, failureMessageBlockerScreen.message) && Intrinsics.areEqual(this.title, failureMessageBlockerScreen.title);
    }

    @Override // com.squareup.cash.blockers.screens.BlockersScreens
    public final BlockersData getBlockersData() {
        return this.blockersData;
    }

    public final int hashCode() {
        int hashCode = this.blockersData.hashCode() * 31;
        String str = this.message;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return Matcher$$ExternalSyntheticOutline0.m(this.blockersData, "FailureMessageBlockerScreen(blockersData=", ", message=██, title=██)");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.blockersData, i);
        parcel.writeString(this.message);
        parcel.writeString(this.title);
    }

    public FailureMessageBlockerScreen(BlockersData blockersData, String str, String str2) {
        blockersData.getClass();
        this.blockersData = blockersData;
        this.message = str;
        this.title = str2;
    }
}

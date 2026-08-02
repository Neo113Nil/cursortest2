package com.squareup.cash.common.messaging.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.clientrouting.data.RoutingParams;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class FailureMessageBlockerFullScreen implements BlockersScreens {
    public static final Parcelable.Creator<FailureMessageBlockerFullScreen> CREATOR = new RoutingParams.Creator(19);
    public final BlockersData blockersData;
    public final boolean finishAppOnDismiss;
    public final String message;
    public final String title;

    public FailureMessageBlockerFullScreen(BlockersData blockersData, String str, String str2, boolean z) {
        blockersData.getClass();
        str.getClass();
        str2.getClass();
        this.blockersData = blockersData;
        this.title = str;
        this.message = str2;
        this.finishAppOnDismiss = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FailureMessageBlockerFullScreen)) {
            return false;
        }
        FailureMessageBlockerFullScreen failureMessageBlockerFullScreen = (FailureMessageBlockerFullScreen) obj;
        return Intrinsics.areEqual(this.blockersData, failureMessageBlockerFullScreen.blockersData) && Intrinsics.areEqual(this.title, failureMessageBlockerFullScreen.title) && Intrinsics.areEqual(this.message, failureMessageBlockerFullScreen.message) && this.finishAppOnDismiss == failureMessageBlockerFullScreen.finishAppOnDismiss;
    }

    @Override // com.squareup.cash.blockers.screens.BlockersScreens
    public final BlockersData getBlockersData() {
        return this.blockersData;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.finishAppOnDismiss) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.blockersData.hashCode() * 31, 31, this.title), 31, this.message);
    }

    public final String toString() {
        return "FailureMessageBlockerFullScreen(blockersData=" + this.blockersData + ", title=██, message=██, finishAppOnDismiss=" + this.finishAppOnDismiss + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.blockersData, i);
        parcel.writeString(this.title);
        parcel.writeString(this.message);
        parcel.writeInt(this.finishAppOnDismiss ? 1 : 0);
    }
}

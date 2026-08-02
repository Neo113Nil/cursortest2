package com.squareup.cash.buynowpaylater.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.borrow.screens.BorrowLimitHub;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AfterPayOrderDetailsScreen implements AfterPayScreen {
    public static final Parcelable.Creator<AfterPayOrderDetailsScreen> CREATOR = new BorrowLimitHub.Creator(10);
    public final boolean isBlockerExitScreen;
    public final String orderId;

    public AfterPayOrderDetailsScreen(String str, boolean z) {
        str.getClass();
        this.orderId = str;
        this.isBlockerExitScreen = z;
    }

    public static AfterPayOrderDetailsScreen copy$default(AfterPayOrderDetailsScreen afterPayOrderDetailsScreen) {
        String str = afterPayOrderDetailsScreen.orderId;
        afterPayOrderDetailsScreen.getClass();
        str.getClass();
        return new AfterPayOrderDetailsScreen(str, true);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AfterPayOrderDetailsScreen)) {
            return false;
        }
        AfterPayOrderDetailsScreen afterPayOrderDetailsScreen = (AfterPayOrderDetailsScreen) obj;
        return Intrinsics.areEqual(this.orderId, afterPayOrderDetailsScreen.orderId) && this.isBlockerExitScreen == afterPayOrderDetailsScreen.isBlockerExitScreen;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isBlockerExitScreen) + (this.orderId.hashCode() * 31);
    }

    @Override // com.squareup.cash.buynowpaylater.screens.AfterPayScreen
    public final boolean isBlockerExitScreen() {
        return this.isBlockerExitScreen;
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("AfterPayOrderDetailsScreen(orderId=", this.orderId, ", isBlockerExitScreen=", ")", this.isBlockerExitScreen);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.orderId);
        parcel.writeInt(this.isBlockerExitScreen ? 1 : 0);
    }
}

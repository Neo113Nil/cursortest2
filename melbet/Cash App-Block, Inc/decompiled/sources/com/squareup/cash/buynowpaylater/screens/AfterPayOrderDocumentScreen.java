package com.squareup.cash.buynowpaylater.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.borrow.screens.BorrowLimitHub;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AfterPayOrderDocumentScreen implements AfterPayScreen {
    public static final Parcelable.Creator<AfterPayOrderDocumentScreen> CREATOR = new BorrowLimitHub.Creator(11);
    public final boolean isBlockerExitScreen;
    public final String orderId;

    public AfterPayOrderDocumentScreen(String str, boolean z) {
        str.getClass();
        this.orderId = str;
        this.isBlockerExitScreen = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AfterPayOrderDocumentScreen)) {
            return false;
        }
        AfterPayOrderDocumentScreen afterPayOrderDocumentScreen = (AfterPayOrderDocumentScreen) obj;
        return Intrinsics.areEqual(this.orderId, afterPayOrderDocumentScreen.orderId) && this.isBlockerExitScreen == afterPayOrderDocumentScreen.isBlockerExitScreen;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isBlockerExitScreen) + (this.orderId.hashCode() * 31);
    }

    @Override // com.squareup.cash.buynowpaylater.screens.AfterPayScreen
    public final boolean isBlockerExitScreen() {
        return this.isBlockerExitScreen;
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("AfterPayOrderDocumentScreen(orderId=", this.orderId, ", isBlockerExitScreen=", ")", this.isBlockerExitScreen);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.orderId);
        parcel.writeInt(this.isBlockerExitScreen ? 1 : 0);
    }
}

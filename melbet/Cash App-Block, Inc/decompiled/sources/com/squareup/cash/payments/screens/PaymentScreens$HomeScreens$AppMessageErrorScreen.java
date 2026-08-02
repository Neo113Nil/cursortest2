package com.squareup.cash.payments.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.DialogScreen;
import com.squareup.cash.payments.screens.NearbyPayer;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public final class PaymentScreens$HomeScreens$AppMessageErrorScreen extends PaymentScreens implements DialogScreen {
    public static final Parcelable.Creator<PaymentScreens$HomeScreens$AppMessageErrorScreen> CREATOR = new NearbyPayer.Creator(25);
    public final int messageRes;

    public PaymentScreens$HomeScreens$AppMessageErrorScreen(int i) {
        super(0);
        this.messageRes = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaymentScreens$HomeScreens$AppMessageErrorScreen) && this.messageRes == ((PaymentScreens$HomeScreens$AppMessageErrorScreen) obj).messageRes;
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final int hashCode() {
        return Integer.hashCode(this.messageRes);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.messageRes, "AppMessageErrorScreen(messageRes=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.messageRes);
    }
}

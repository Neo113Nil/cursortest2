package com.squareup.cash.bitcoin.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.cash.screens.MainScreens;

/* loaded from: classes.dex */
public final class BitcoinDependentWelcomeScreen extends MainScreens {
    public static final Parcelable.Creator<BitcoinDependentWelcomeScreen> CREATOR = new BitcoinHome.Creator(3);
    public final boolean checkDependentStatus;

    public BitcoinDependentWelcomeScreen(boolean z) {
        super(1);
        this.checkDependentStatus = z;
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
        return (obj instanceof BitcoinDependentWelcomeScreen) && this.checkDependentStatus == ((BitcoinDependentWelcomeScreen) obj).checkDependentStatus;
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final int hashCode() {
        return Boolean.hashCode(this.checkDependentStatus);
    }

    public final String toString() {
        return Fragment$5$$ExternalSyntheticOutline0.m("BitcoinDependentWelcomeScreen(checkDependentStatus=", ")", this.checkDependentStatus);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.checkDependentStatus ? 1 : 0);
    }
}

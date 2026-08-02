package com.squareup.cash.merchant.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.screen.SingleInstanceScreen;
import com.squareup.cash.limits.screens.LimitsScreen;

/* loaded from: classes.dex */
public final class MerchantScreen$MerchantBlockingScreen implements Screen, SingleInstanceScreen {
    public static final Parcelable.Creator<MerchantScreen$MerchantBlockingScreen> CREATOR = new LimitsScreen.Creator(9);
    public final boolean isNuxVisible;

    public MerchantScreen$MerchantBlockingScreen(boolean z) {
        this.isNuxVisible = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MerchantScreen$MerchantBlockingScreen) && this.isNuxVisible == ((MerchantScreen$MerchantBlockingScreen) obj).isNuxVisible;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isNuxVisible);
    }

    public final String toString() {
        return Fragment$5$$ExternalSyntheticOutline0.m("MerchantBlockingScreen(isNuxVisible=", ")", this.isNuxVisible);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.isNuxVisible ? 1 : 0);
    }
}

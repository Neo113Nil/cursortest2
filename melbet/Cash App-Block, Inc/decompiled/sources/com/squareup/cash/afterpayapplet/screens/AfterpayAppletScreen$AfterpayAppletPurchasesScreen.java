package com.squareup.cash.afterpayapplet.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.screen.SingleInstanceScreen;
import com.squareup.cash.activity.screens.ActivityScreen;

/* loaded from: classes.dex */
public final class AfterpayAppletScreen$AfterpayAppletPurchasesScreen implements Screen, SingleInstanceScreen {
    public static final AfterpayAppletScreen$AfterpayAppletPurchasesScreen INSTANCE = new AfterpayAppletScreen$AfterpayAppletPurchasesScreen();
    public static final Parcelable.Creator<AfterpayAppletScreen$AfterpayAppletPurchasesScreen> CREATOR = new ActivityScreen.Creator(14);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof AfterpayAppletScreen$AfterpayAppletPurchasesScreen);
    }

    public final int hashCode() {
        return 1591400633;
    }

    public final String toString() {
        return "AfterpayAppletPurchasesScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}

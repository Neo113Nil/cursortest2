package com.squareup.cash.benefits.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.appmessages.SheetAppMessage;

/* loaded from: classes.dex */
public final class GreenEligibleTransactionsScreen implements BenefitsScreen {
    public static final GreenEligibleTransactionsScreen INSTANCE = new GreenEligibleTransactionsScreen();
    public static final Parcelable.Creator<GreenEligibleTransactionsScreen> CREATOR = new SheetAppMessage.Creator(26);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof GreenEligibleTransactionsScreen);
    }

    public final int hashCode() {
        return -1277069708;
    }

    public final String toString() {
        return "GreenEligibleTransactionsScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}

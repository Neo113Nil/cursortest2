package com.squareup.cash.benefits.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.appmessages.SheetAppMessage;

/* loaded from: classes.dex */
public final class BenefitsHomeScreen implements BenefitsScreen {
    public static final BenefitsHomeScreen INSTANCE = new BenefitsHomeScreen();
    public static final Parcelable.Creator<BenefitsHomeScreen> CREATOR = new SheetAppMessage.Creator(24);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof BenefitsHomeScreen);
    }

    public final int hashCode() {
        return 881155246;
    }

    public final String toString() {
        return "BenefitsHomeScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}

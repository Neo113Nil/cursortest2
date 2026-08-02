package com.squareup.cash.benefits.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.appmessages.SheetAppMessage;

/* loaded from: classes.dex */
public final class BenefitsHubScreen implements BenefitsScreen {
    public static final BenefitsHubScreen INSTANCE = new BenefitsHubScreen();
    public static final Parcelable.Creator<BenefitsHubScreen> CREATOR = new SheetAppMessage.Creator(25);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof BenefitsHubScreen);
    }

    public final int hashCode() {
        return 1053915870;
    }

    public final String toString() {
        return "BenefitsHubScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}

package com.squareup.cash.benefits.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.NeverInBackStackScreen;
import com.squareup.cash.appmessages.SheetAppMessage;

/* loaded from: classes.dex */
public final class BankingBenefitsBookletScreen implements BenefitsScreen, NeverInBackStackScreen {
    public static final BankingBenefitsBookletScreen INSTANCE = new BankingBenefitsBookletScreen();
    public static final Parcelable.Creator<BankingBenefitsBookletScreen> CREATOR = new SheetAppMessage.Creator(21);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof BankingBenefitsBookletScreen);
    }

    public final int hashCode() {
        return 527159715;
    }

    public final String toString() {
        return "BankingBenefitsBookletScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}

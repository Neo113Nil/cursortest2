package com.squareup.cash.benefits.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.NeverInBackStackScreen;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.appmessages.SheetAppMessage;

/* loaded from: classes.dex */
public final class PdsaBenefitsExplainerScreen implements Screen, OnlyOneOverlayTreatment, NeverInBackStackScreen {
    public static final PdsaBenefitsExplainerScreen INSTANCE = new PdsaBenefitsExplainerScreen();
    public static final Parcelable.Creator<PdsaBenefitsExplainerScreen> CREATOR = new SheetAppMessage.Creator(27);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof PdsaBenefitsExplainerScreen);
    }

    public final int hashCode() {
        return 2129524395;
    }

    public final String toString() {
        return "PdsaBenefitsExplainerScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}

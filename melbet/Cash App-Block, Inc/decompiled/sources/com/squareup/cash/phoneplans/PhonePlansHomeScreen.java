package com.squareup.cash.phoneplans;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.RestoringScreen;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.pdf.screen.PdfScreen;

/* loaded from: classes.dex */
public final class PhonePlansHomeScreen implements Screen, RestoringScreen {
    public static final PhonePlansHomeScreen INSTANCE = new PhonePlansHomeScreen();
    public static final Parcelable.Creator<PhonePlansHomeScreen> CREATOR = new PdfScreen.Creator(2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof PhonePlansHomeScreen);
    }

    public final int hashCode() {
        return -1131933369;
    }

    public final String toString() {
        return "PhonePlansHomeScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}

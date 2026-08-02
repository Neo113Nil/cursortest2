package com.squareup.cash.qrcodes.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Question;
import com.squareup.cash.profile.viewmodels.Alias;

/* loaded from: classes7.dex */
public final class CashtagQrScanQuestion implements Question {
    public static final CashtagQrScanQuestion INSTANCE = new CashtagQrScanQuestion();
    public static final Parcelable.Creator<CashtagQrScanQuestion> CREATOR = new Alias.Creator(29);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof CashtagQrScanQuestion);
    }

    public final int hashCode() {
        return -1402712151;
    }

    public final String toString() {
        return "CashtagQrScanQuestion";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}

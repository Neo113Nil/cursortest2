package com.squareup.cash.qrcodes.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.profile.viewmodels.Alias;

/* loaded from: classes.dex */
public final class CashQrShortcutsOnboardingSheet implements Screen, OnlyOneOverlayTreatment {
    public static final CashQrShortcutsOnboardingSheet INSTANCE = new CashQrShortcutsOnboardingSheet();
    public static final Parcelable.Creator<CashQrShortcutsOnboardingSheet> CREATOR = new Alias.Creator(28);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof CashQrShortcutsOnboardingSheet);
    }

    public final int hashCode() {
        return -262072339;
    }

    public final String toString() {
        return "CashQrShortcutsOnboardingSheet";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}

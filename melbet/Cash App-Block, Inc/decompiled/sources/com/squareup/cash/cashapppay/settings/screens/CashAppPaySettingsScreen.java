package com.squareup.cash.cashapppay.settings.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.checks.screens.CheckCaptureQuestion;

/* loaded from: classes.dex */
public final class CashAppPaySettingsScreen implements Screen {
    public static final CashAppPaySettingsScreen INSTANCE = new CashAppPaySettingsScreen();
    public static final Parcelable.Creator<CashAppPaySettingsScreen> CREATOR = new CheckCaptureQuestion.Creator(18);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}

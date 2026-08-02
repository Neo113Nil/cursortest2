package com.squareup.cash.onboarding.accountpicker.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.nearby.viewmodels.ListSection;

/* loaded from: classes.dex */
public final class OnboardingAccountPickerScreen implements Screen {
    public static final OnboardingAccountPickerScreen INSTANCE = new OnboardingAccountPickerScreen();
    public static final Parcelable.Creator<OnboardingAccountPickerScreen> CREATOR = new ListSection.Creator(24);

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

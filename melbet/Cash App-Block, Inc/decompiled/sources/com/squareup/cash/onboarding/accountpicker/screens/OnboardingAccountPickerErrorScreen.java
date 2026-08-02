package com.squareup.cash.onboarding.accountpicker.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.DialogScreen;
import com.squareup.cash.nearby.viewmodels.ListSection;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class OnboardingAccountPickerErrorScreen implements DialogScreen {
    public static final Parcelable.Creator<OnboardingAccountPickerErrorScreen> CREATOR = new ListSection.Creator(21);
    public final String errorMessage;

    public OnboardingAccountPickerErrorScreen(String str) {
        str.getClass();
        this.errorMessage = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnboardingAccountPickerErrorScreen) && Intrinsics.areEqual(this.errorMessage, ((OnboardingAccountPickerErrorScreen) obj).errorMessage);
    }

    public final int hashCode() {
        return this.errorMessage.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OnboardingAccountPickerErrorScreen(errorMessage=", this.errorMessage, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.errorMessage);
    }
}

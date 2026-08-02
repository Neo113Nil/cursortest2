package com.squareup.cash.family.familyhub.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.DialogScreen;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.earnings.screens.AddPayerCustomersScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ControlErrorScreen implements DialogScreen {
    public static final Parcelable.Creator<ControlErrorScreen> CREATOR = new AddPayerCustomersScreen.Creator(26);
    public final String buttonText;
    public final String message;
    public final String title;

    public ControlErrorScreen(String str, String str2, String str3) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.title = str;
        this.message = str2;
        this.buttonText = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ControlErrorScreen)) {
            return false;
        }
        ControlErrorScreen controlErrorScreen = (ControlErrorScreen) obj;
        return Intrinsics.areEqual(this.title, controlErrorScreen.title) && Intrinsics.areEqual(this.message, controlErrorScreen.message) && Intrinsics.areEqual(this.buttonText, controlErrorScreen.buttonText);
    }

    public final int hashCode() {
        return this.buttonText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.message);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ControlErrorScreen(title=", this.title, ", message=", this.message, ", buttonText="), this.buttonText, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.title);
        parcel.writeString(this.message);
        parcel.writeString(this.buttonText);
    }
}

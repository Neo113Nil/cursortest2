package com.squareup.cash.family.familyhub.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.family.familyhub.screens.FamilyHome;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class SetDependentCustomLimitErrorScreen implements Screen, OnlyOneOverlayTreatment {
    public static final Parcelable.Creator<SetDependentCustomLimitErrorScreen> CREATOR = new FamilyHome.Creator(10);
    public final String message;
    public final String positiveButtonText;
    public final String title;

    public SetDependentCustomLimitErrorScreen(String str, String str2, String str3) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.title = str;
        this.message = str2;
        this.positiveButtonText = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetDependentCustomLimitErrorScreen)) {
            return false;
        }
        SetDependentCustomLimitErrorScreen setDependentCustomLimitErrorScreen = (SetDependentCustomLimitErrorScreen) obj;
        return Intrinsics.areEqual(this.title, setDependentCustomLimitErrorScreen.title) && Intrinsics.areEqual(this.message, setDependentCustomLimitErrorScreen.message) && Intrinsics.areEqual(this.positiveButtonText, setDependentCustomLimitErrorScreen.positiveButtonText);
    }

    public final int hashCode() {
        return this.positiveButtonText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.message);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SetDependentCustomLimitErrorScreen(title=", this.title, ", message=", this.message, ", positiveButtonText="), this.positiveButtonText, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.title);
        parcel.writeString(this.message);
        parcel.writeString(this.positiveButtonText);
    }
}

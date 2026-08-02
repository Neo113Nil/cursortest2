package com.squareup.cash.family.familyhub.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.DialogScreen;
import com.squareup.cash.family.familyhub.screens.FamilyHome;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class DependentDetailIntroductionDialog implements DialogScreen {
    public static final Parcelable.Creator<DependentDetailIntroductionDialog> CREATOR = new FamilyHome.Creator(3);
    public final String dismissButtonLabel;
    public final Image image;
    public final String message;
    public final String title;

    public DependentDetailIntroductionDialog(Image image, String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        image.getClass();
        this.title = str;
        this.message = str2;
        this.dismissButtonLabel = str3;
        this.image = image;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DependentDetailIntroductionDialog)) {
            return false;
        }
        DependentDetailIntroductionDialog dependentDetailIntroductionDialog = (DependentDetailIntroductionDialog) obj;
        return Intrinsics.areEqual(this.title, dependentDetailIntroductionDialog.title) && Intrinsics.areEqual(this.message, dependentDetailIntroductionDialog.message) && Intrinsics.areEqual(this.dismissButtonLabel, dependentDetailIntroductionDialog.dismissButtonLabel) && Intrinsics.areEqual(this.image, dependentDetailIntroductionDialog.image);
    }

    public final int hashCode() {
        return this.image.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.message), 31, this.dismissButtonLabel);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DependentDetailIntroductionDialog(title=", this.title, ", message=", this.message, ", dismissButtonLabel=");
        m.append(this.dismissButtonLabel);
        m.append(", image=");
        m.append(this.image);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.title);
        parcel.writeString(this.message);
        parcel.writeString(this.dismissButtonLabel);
        parcel.writeParcelable(this.image, i);
    }
}

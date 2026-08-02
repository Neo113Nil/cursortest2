package com.squareup.cash.profile.screens;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.profile.screens.OpenSourceScreen;
import com.squareup.cash.profile.screens.ProfileScreens;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class GenericConfirmDialog extends ProfileScreens.ProfileDialogScreens {
    public static final Parcelable.Creator<GenericConfirmDialog> CREATOR = new OpenSourceScreen.Creator(28);
    public final String confirmButtonText;
    public final String message;
    public final String title;

    public GenericConfirmDialog(String str, String str2, String str3) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.title = str;
        this.message = str2;
        this.confirmButtonText = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenericConfirmDialog)) {
            return false;
        }
        GenericConfirmDialog genericConfirmDialog = (GenericConfirmDialog) obj;
        return Intrinsics.areEqual(this.title, genericConfirmDialog.title) && Intrinsics.areEqual(this.message, genericConfirmDialog.message) && Intrinsics.areEqual(this.confirmButtonText, genericConfirmDialog.confirmButtonText);
    }

    public final int hashCode() {
        return this.confirmButtonText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.message);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("GenericConfirmDialog(title=", this.title, ", message=", this.message, ", confirmButtonText="), this.confirmButtonText, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.title);
        parcel.writeString(this.message);
        parcel.writeString(this.confirmButtonText);
    }
}

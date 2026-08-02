package com.squareup.cash.family.requestsponsorship.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.family.familyhub.screens.FamilyHome;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ContactPermissionDialogScreen implements Screen, OnlyOneOverlayTreatment {
    public static final Parcelable.Creator<ContactPermissionDialogScreen> CREATOR = new FamilyHome.Creator(25);
    public final String addContactButtonTitle;
    public final String body;
    public final String dismissButtonTitle;
    public final String title;

    public ContactPermissionDialogScreen(String str, String str2, String str3, String str4) {
        this.title = str;
        this.body = str2;
        this.addContactButtonTitle = str3;
        this.dismissButtonTitle = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactPermissionDialogScreen)) {
            return false;
        }
        ContactPermissionDialogScreen contactPermissionDialogScreen = (ContactPermissionDialogScreen) obj;
        return Intrinsics.areEqual(this.title, contactPermissionDialogScreen.title) && Intrinsics.areEqual(this.body, contactPermissionDialogScreen.body) && Intrinsics.areEqual(this.addContactButtonTitle, contactPermissionDialogScreen.addContactButtonTitle) && Intrinsics.areEqual(this.dismissButtonTitle, contactPermissionDialogScreen.dismissButtonTitle);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.body;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.addContactButtonTitle;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.dismissButtonTitle;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ContactPermissionDialogScreen(title=", this.title, ", body=", this.body, ", addContactButtonTitle="), this.addContactButtonTitle, ", dismissButtonTitle=", this.dismissButtonTitle, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.title);
        parcel.writeString(this.body);
        parcel.writeString(this.addContactButtonTitle);
        parcel.writeString(this.dismissButtonTitle);
    }
}

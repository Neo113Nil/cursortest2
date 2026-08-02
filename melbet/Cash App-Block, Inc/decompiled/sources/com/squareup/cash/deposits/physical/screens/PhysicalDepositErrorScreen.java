package com.squareup.cash.deposits.physical.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.screen.DialogScreen;
import app.cash.broadway.screen.Screen;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.db.contacts.Recipient;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class PhysicalDepositErrorScreen implements DialogScreen, Screen {
    public static final Parcelable.Creator<PhysicalDepositErrorScreen> CREATOR = new Recipient.Creator(25);
    public final String actionNegativeText;
    public final Parcelable actionPositiveResult;
    public final String actionPositiveText;
    public final String details;
    public final String title;

    public PhysicalDepositErrorScreen(String str, String str2, String str3, String str4, Parcelable parcelable) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str4);
        this.title = str;
        this.details = str2;
        this.actionNegativeText = str3;
        this.actionPositiveText = str4;
        this.actionPositiveResult = parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhysicalDepositErrorScreen)) {
            return false;
        }
        PhysicalDepositErrorScreen physicalDepositErrorScreen = (PhysicalDepositErrorScreen) obj;
        return Intrinsics.areEqual(this.title, physicalDepositErrorScreen.title) && Intrinsics.areEqual(this.details, physicalDepositErrorScreen.details) && Intrinsics.areEqual(this.actionNegativeText, physicalDepositErrorScreen.actionNegativeText) && Intrinsics.areEqual(this.actionPositiveText, physicalDepositErrorScreen.actionPositiveText) && Intrinsics.areEqual(this.actionPositiveResult, physicalDepositErrorScreen.actionPositiveResult);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.details);
        String str = this.actionNegativeText;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.actionPositiveText);
        Parcelable parcelable = this.actionPositiveResult;
        return m2 + (parcelable != null ? parcelable.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PhysicalDepositErrorScreen(title=", this.title, ", details=", this.details, ", actionNegativeText=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.actionNegativeText, ", actionPositiveText=", this.actionPositiveText, ", actionPositiveResult=");
        m.append(this.actionPositiveResult);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.title);
        parcel.writeString(this.details);
        parcel.writeString(this.actionNegativeText);
        parcel.writeString(this.actionPositiveText);
        parcel.writeParcelable(this.actionPositiveResult, i);
    }
}

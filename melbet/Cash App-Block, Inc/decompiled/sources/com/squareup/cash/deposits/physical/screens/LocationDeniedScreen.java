package com.squareup.cash.deposits.physical.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.screen.DialogScreen;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.db.contacts.Recipient;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class LocationDeniedScreen implements DialogScreen {
    public static final Parcelable.Creator<LocationDeniedScreen> CREATOR = new Recipient.Creator(16);
    public final String blockerId;
    public final String clientScenario;
    public final String detailsText;
    public final String flowToken;
    public final String ignoreText;
    public final String titleText;
    public final String updatePermissionsText;

    public LocationDeniedScreen(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.titleText = str;
        this.detailsText = str2;
        this.updatePermissionsText = str3;
        this.ignoreText = str4;
        this.blockerId = str5;
        this.clientScenario = str6;
        this.flowToken = str7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationDeniedScreen)) {
            return false;
        }
        LocationDeniedScreen locationDeniedScreen = (LocationDeniedScreen) obj;
        return Intrinsics.areEqual(this.titleText, locationDeniedScreen.titleText) && Intrinsics.areEqual(this.detailsText, locationDeniedScreen.detailsText) && Intrinsics.areEqual(this.updatePermissionsText, locationDeniedScreen.updatePermissionsText) && Intrinsics.areEqual(this.ignoreText, locationDeniedScreen.ignoreText) && Intrinsics.areEqual(this.blockerId, locationDeniedScreen.blockerId) && Intrinsics.areEqual(this.clientScenario, locationDeniedScreen.clientScenario) && Intrinsics.areEqual(this.flowToken, locationDeniedScreen.flowToken);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.titleText.hashCode() * 31, 31, this.detailsText), 31, this.updatePermissionsText);
        String str = this.ignoreText;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.blockerId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.clientScenario;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.flowToken;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LocationDeniedScreen(titleText=", this.titleText, ", detailsText=", this.detailsText, ", updatePermissionsText=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.updatePermissionsText, ", ignoreText=", this.ignoreText, ", blockerId=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.blockerId, ", clientScenario=", this.clientScenario, ", flowToken=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.flowToken, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.titleText);
        parcel.writeString(this.detailsText);
        parcel.writeString(this.updatePermissionsText);
        parcel.writeString(this.ignoreText);
        parcel.writeString(this.blockerId);
        parcel.writeString(this.clientScenario);
        parcel.writeString(this.flowToken);
    }
}

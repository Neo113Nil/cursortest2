package com.squareup.cash.family.familyhub.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.family.familyhub.screens.FamilyHome;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class DependentTeenQrCodeShareSheetScreen implements Screen, OnlyOneOverlayTreatment {
    public static final Parcelable.Creator<DependentTeenQrCodeShareSheetScreen> CREATOR = new FamilyHome.Creator(6);
    public final String cashtagUrl;
    public final String currencySymbol;
    public final String dependentCustomerToken;
    public final String qrCodeImageUrl;

    public DependentTeenQrCodeShareSheetScreen(String str, String str2, String str3, String str4) {
        Request$Priority$EnumUnboxingLocalUtility.m(str, str2, str3, str4);
        this.cashtagUrl = str;
        this.qrCodeImageUrl = str2;
        this.dependentCustomerToken = str3;
        this.currencySymbol = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DependentTeenQrCodeShareSheetScreen)) {
            return false;
        }
        DependentTeenQrCodeShareSheetScreen dependentTeenQrCodeShareSheetScreen = (DependentTeenQrCodeShareSheetScreen) obj;
        return Intrinsics.areEqual(this.cashtagUrl, dependentTeenQrCodeShareSheetScreen.cashtagUrl) && Intrinsics.areEqual(this.qrCodeImageUrl, dependentTeenQrCodeShareSheetScreen.qrCodeImageUrl) && Intrinsics.areEqual(this.dependentCustomerToken, dependentTeenQrCodeShareSheetScreen.dependentCustomerToken) && Intrinsics.areEqual(this.currencySymbol, dependentTeenQrCodeShareSheetScreen.currencySymbol);
    }

    public final int hashCode() {
        return this.currencySymbol.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.cashtagUrl.hashCode() * 31, 31, this.qrCodeImageUrl), 31, this.dependentCustomerToken);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DependentTeenQrCodeShareSheetScreen(cashtagUrl=", this.cashtagUrl, ", qrCodeImageUrl=", this.qrCodeImageUrl, ", dependentCustomerToken="), this.dependentCustomerToken, ", currencySymbol=", this.currencySymbol, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.cashtagUrl);
        parcel.writeString(this.qrCodeImageUrl);
        parcel.writeString(this.dependentCustomerToken);
        parcel.writeString(this.currencySymbol);
    }
}

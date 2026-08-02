package com.squareup.cash.merchant.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.limits.screens.LimitsScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class MerchantScreen$MerchantInfoFeedbackBottomSheetScreen implements Screen, OnlyOneOverlayTreatment {
    public static final Parcelable.Creator<MerchantScreen$MerchantInfoFeedbackBottomSheetScreen> CREATOR = new LimitsScreen.Creator(10);
    public final String address;
    public final String merchantToken;
    public final String transactionToken;

    public MerchantScreen$MerchantInfoFeedbackBottomSheetScreen(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.merchantToken = str;
        this.transactionToken = str2;
        this.address = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MerchantScreen$MerchantInfoFeedbackBottomSheetScreen)) {
            return false;
        }
        MerchantScreen$MerchantInfoFeedbackBottomSheetScreen merchantScreen$MerchantInfoFeedbackBottomSheetScreen = (MerchantScreen$MerchantInfoFeedbackBottomSheetScreen) obj;
        return Intrinsics.areEqual(this.merchantToken, merchantScreen$MerchantInfoFeedbackBottomSheetScreen.merchantToken) && Intrinsics.areEqual(this.transactionToken, merchantScreen$MerchantInfoFeedbackBottomSheetScreen.transactionToken) && Intrinsics.areEqual(this.address, merchantScreen$MerchantInfoFeedbackBottomSheetScreen.address);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.merchantToken.hashCode() * 31, 31, this.transactionToken);
        String str = this.address;
        return m + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MerchantInfoFeedbackBottomSheetScreen(merchantToken=", this.merchantToken, ", transactionToken=", this.transactionToken, ", address="), this.address, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.merchantToken);
        parcel.writeString(this.transactionToken);
        parcel.writeString(this.address);
    }
}

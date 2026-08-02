package com.squareup.cash.afterpayapplet.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.BottomSheetScreen;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.activity.screens.ActivityScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AfterpayAppletScreen$AfterpayAppletMerchantSheetScreen implements Screen, BottomSheetScreen {
    public static final Parcelable.Creator<AfterpayAppletScreen$AfterpayAppletMerchantSheetScreen> CREATOR = new ActivityScreen.Creator(12);
    public final String fromScreen;
    public final String fromSection;
    public final String merchantToken;
    public final String referrerToken;

    public AfterpayAppletScreen$AfterpayAppletMerchantSheetScreen(String str, String str2, String str3, String str4) {
        str4.getClass();
        this.referrerToken = str;
        this.fromScreen = str2;
        this.fromSection = str3;
        this.merchantToken = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AfterpayAppletScreen$AfterpayAppletMerchantSheetScreen)) {
            return false;
        }
        AfterpayAppletScreen$AfterpayAppletMerchantSheetScreen afterpayAppletScreen$AfterpayAppletMerchantSheetScreen = (AfterpayAppletScreen$AfterpayAppletMerchantSheetScreen) obj;
        return Intrinsics.areEqual(this.referrerToken, afterpayAppletScreen$AfterpayAppletMerchantSheetScreen.referrerToken) && Intrinsics.areEqual(this.fromScreen, afterpayAppletScreen$AfterpayAppletMerchantSheetScreen.fromScreen) && Intrinsics.areEqual(this.fromSection, afterpayAppletScreen$AfterpayAppletMerchantSheetScreen.fromSection) && Intrinsics.areEqual(this.merchantToken, afterpayAppletScreen$AfterpayAppletMerchantSheetScreen.merchantToken);
    }

    public final int hashCode() {
        String str = this.referrerToken;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fromScreen;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fromSection;
        return this.merchantToken.hashCode() + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AfterpayAppletMerchantSheetScreen(referrerToken=", this.referrerToken, ", fromScreen=", this.fromScreen, ", fromSection="), this.fromSection, ", merchantToken=", this.merchantToken, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.referrerToken);
        parcel.writeString(this.fromScreen);
        parcel.writeString(this.fromSection);
        parcel.writeString(this.merchantToken);
    }
}

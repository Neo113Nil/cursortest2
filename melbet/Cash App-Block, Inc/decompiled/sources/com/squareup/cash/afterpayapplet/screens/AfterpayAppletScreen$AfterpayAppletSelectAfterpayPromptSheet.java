package com.squareup.cash.afterpayapplet.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.BottomSheetScreen;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.activity.screens.ActivityScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AfterpayAppletScreen$AfterpayAppletSelectAfterpayPromptSheet implements Screen, BottomSheetScreen {
    public static final Parcelable.Creator<AfterpayAppletScreen$AfterpayAppletSelectAfterpayPromptSheet> CREATOR = new ActivityScreen.Creator(15);
    public final String fromSection;
    public final String merchantName;
    public final String merchantToken;

    public AfterpayAppletScreen$AfterpayAppletSelectAfterpayPromptSheet(String str, String str2, String str3) {
        this.merchantToken = str;
        this.merchantName = str2;
        this.fromSection = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AfterpayAppletScreen$AfterpayAppletSelectAfterpayPromptSheet)) {
            return false;
        }
        AfterpayAppletScreen$AfterpayAppletSelectAfterpayPromptSheet afterpayAppletScreen$AfterpayAppletSelectAfterpayPromptSheet = (AfterpayAppletScreen$AfterpayAppletSelectAfterpayPromptSheet) obj;
        return Intrinsics.areEqual(this.merchantToken, afterpayAppletScreen$AfterpayAppletSelectAfterpayPromptSheet.merchantToken) && Intrinsics.areEqual(this.merchantName, afterpayAppletScreen$AfterpayAppletSelectAfterpayPromptSheet.merchantName) && Intrinsics.areEqual(this.fromSection, afterpayAppletScreen$AfterpayAppletSelectAfterpayPromptSheet.fromSection);
    }

    public final int hashCode() {
        String str = this.merchantToken;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.merchantName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fromSection;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AfterpayAppletSelectAfterpayPromptSheet(merchantToken=", this.merchantToken, ", merchantName=", this.merchantName, ", fromSection="), this.fromSection, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.merchantToken);
        parcel.writeString(this.merchantName);
        parcel.writeString(this.fromSection);
    }
}

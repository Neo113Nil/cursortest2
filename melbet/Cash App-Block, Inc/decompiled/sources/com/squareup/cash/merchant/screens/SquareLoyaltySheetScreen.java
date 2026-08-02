package com.squareup.cash.merchant.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.BottomSheetScreen;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.limits.screens.LimitsScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class SquareLoyaltySheetScreen implements Screen, BottomSheetScreen {
    public static final Parcelable.Creator<SquareLoyaltySheetScreen> CREATOR = new LimitsScreen.Creator(13);
    public final String gteContext;
    public final String merchantToken;
    public final String referrerFlowToken;

    public SquareLoyaltySheetScreen(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.merchantToken = str;
        this.gteContext = str2;
        this.referrerFlowToken = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SquareLoyaltySheetScreen)) {
            return false;
        }
        SquareLoyaltySheetScreen squareLoyaltySheetScreen = (SquareLoyaltySheetScreen) obj;
        return Intrinsics.areEqual(this.merchantToken, squareLoyaltySheetScreen.merchantToken) && Intrinsics.areEqual(this.gteContext, squareLoyaltySheetScreen.gteContext) && Intrinsics.areEqual(this.referrerFlowToken, squareLoyaltySheetScreen.referrerFlowToken);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.merchantToken.hashCode() * 31, 31, this.gteContext);
        String str = this.referrerFlowToken;
        return m + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SquareLoyaltySheetScreen(merchantToken=", this.merchantToken, ", gteContext=", this.gteContext, ", referrerFlowToken="), this.referrerFlowToken, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.merchantToken);
        parcel.writeString(this.gteContext);
        parcel.writeString(this.referrerFlowToken);
    }
}

package com.squareup.cash.merchant.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.limits.screens.LimitsScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class SquareLoyaltyDetailsScreen implements Screen {
    public static final Parcelable.Creator<SquareLoyaltyDetailsScreen> CREATOR = new LimitsScreen.Creator(12);
    public final boolean alwaysShowToolbarTitle;
    public final String gteContext;
    public final String merchantToken;
    public final String offerToken;
    public final String referrerFlowToken;

    public SquareLoyaltyDetailsScreen(String str, String str2, String str3, String str4, boolean z) {
        str.getClass();
        str2.getClass();
        this.merchantToken = str;
        this.gteContext = str2;
        this.referrerFlowToken = str3;
        this.offerToken = str4;
        this.alwaysShowToolbarTitle = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SquareLoyaltyDetailsScreen)) {
            return false;
        }
        SquareLoyaltyDetailsScreen squareLoyaltyDetailsScreen = (SquareLoyaltyDetailsScreen) obj;
        return Intrinsics.areEqual(this.merchantToken, squareLoyaltyDetailsScreen.merchantToken) && Intrinsics.areEqual(this.gteContext, squareLoyaltyDetailsScreen.gteContext) && Intrinsics.areEqual(this.referrerFlowToken, squareLoyaltyDetailsScreen.referrerFlowToken) && Intrinsics.areEqual(this.offerToken, squareLoyaltyDetailsScreen.offerToken) && this.alwaysShowToolbarTitle == squareLoyaltyDetailsScreen.alwaysShowToolbarTitle;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.merchantToken.hashCode() * 31, 31, this.gteContext);
        String str = this.referrerFlowToken;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.offerToken;
        return Boolean.hashCode(this.alwaysShowToolbarTitle) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SquareLoyaltyDetailsScreen(merchantToken=", this.merchantToken, ", gteContext=", this.gteContext, ", referrerFlowToken=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.referrerFlowToken, ", offerToken=", this.offerToken, ", alwaysShowToolbarTitle=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.alwaysShowToolbarTitle, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.merchantToken);
        parcel.writeString(this.gteContext);
        parcel.writeString(this.referrerFlowToken);
        parcel.writeString(this.offerToken);
        parcel.writeInt(this.alwaysShowToolbarTitle ? 1 : 0);
    }

    public /* synthetic */ SquareLoyaltyDetailsScreen(String str, String str2, int i) {
        this(str, str2, null, null, (i & 16) == 0);
    }
}

package com.squareup.cash.afterpayapplet.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.screen.SingleInstanceScreen;
import com.squareup.cash.activity.screens.ActivityScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AfterpayAppletScreen$AfterpaySearchScreen implements Screen, SingleInstanceScreen {
    public static final Parcelable.Creator<AfterpayAppletScreen$AfterpaySearchScreen> CREATOR = new ActivityScreen.Creator(19);
    public final String filterTokens;
    public final String fromScreen;
    public final String fromSection;
    public final String referrerToken;
    public final String searchText;

    public AfterpayAppletScreen$AfterpaySearchScreen(String str, String str2, String str3, String str4, String str5) {
        this.referrerToken = str;
        this.fromScreen = str2;
        this.fromSection = str3;
        this.searchText = str4;
        this.filterTokens = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AfterpayAppletScreen$AfterpaySearchScreen)) {
            return false;
        }
        AfterpayAppletScreen$AfterpaySearchScreen afterpayAppletScreen$AfterpaySearchScreen = (AfterpayAppletScreen$AfterpaySearchScreen) obj;
        return Intrinsics.areEqual(this.referrerToken, afterpayAppletScreen$AfterpaySearchScreen.referrerToken) && Intrinsics.areEqual(this.fromScreen, afterpayAppletScreen$AfterpaySearchScreen.fromScreen) && Intrinsics.areEqual(this.fromSection, afterpayAppletScreen$AfterpaySearchScreen.fromSection) && Intrinsics.areEqual(this.searchText, afterpayAppletScreen$AfterpaySearchScreen.searchText) && Intrinsics.areEqual(this.filterTokens, afterpayAppletScreen$AfterpaySearchScreen.filterTokens);
    }

    public final int hashCode() {
        String str = this.referrerToken;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fromScreen;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fromSection;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.searchText;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.filterTokens;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AfterpaySearchScreen(referrerToken=", this.referrerToken, ", fromScreen=", this.fromScreen, ", fromSection=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.fromSection, ", searchText=", this.searchText, ", filterTokens=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.filterTokens, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.referrerToken);
        parcel.writeString(this.fromScreen);
        parcel.writeString(this.fromSection);
        parcel.writeString(this.searchText);
        parcel.writeString(this.filterTokens);
    }
}

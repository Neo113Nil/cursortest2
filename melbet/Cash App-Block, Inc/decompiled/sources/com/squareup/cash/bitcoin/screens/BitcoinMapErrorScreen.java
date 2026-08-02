package com.squareup.cash.bitcoin.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.DialogScreen;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.cash.screens.MainScreens;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class BitcoinMapErrorScreen extends MainScreens implements DialogScreen {
    public static final Parcelable.Creator<BitcoinMapErrorScreen> CREATOR = new BitcoinHome.Creator(18);
    public final String actionNegativeText;
    public final String actionPositiveText;
    public final AskedQuestion askedQuestion;
    public final String details;
    public final String title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitcoinMapErrorScreen(String str, String str2, String str3, String str4, AskedQuestion askedQuestion) {
        super(1);
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.title = str;
        this.details = str2;
        this.actionPositiveText = str3;
        this.actionNegativeText = str4;
        this.askedQuestion = askedQuestion;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitcoinMapErrorScreen)) {
            return false;
        }
        BitcoinMapErrorScreen bitcoinMapErrorScreen = (BitcoinMapErrorScreen) obj;
        return Intrinsics.areEqual(this.title, bitcoinMapErrorScreen.title) && Intrinsics.areEqual(this.details, bitcoinMapErrorScreen.details) && Intrinsics.areEqual(this.actionPositiveText, bitcoinMapErrorScreen.actionPositiveText) && Intrinsics.areEqual(this.actionNegativeText, bitcoinMapErrorScreen.actionNegativeText) && Intrinsics.areEqual(this.askedQuestion, bitcoinMapErrorScreen.askedQuestion);
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.details), 31, this.actionPositiveText);
        String str = this.actionNegativeText;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        AskedQuestion askedQuestion = this.askedQuestion;
        return hashCode + (askedQuestion != null ? askedQuestion.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BitcoinMapErrorScreen(title=", this.title, ", details=", this.details, ", actionPositiveText=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.actionPositiveText, ", actionNegativeText=", this.actionNegativeText, ", askedQuestion=");
        m.append(this.askedQuestion);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.title);
        parcel.writeString(this.details);
        parcel.writeString(this.actionPositiveText);
        parcel.writeString(this.actionNegativeText);
        parcel.writeParcelable(this.askedQuestion, i);
    }
}

package com.squareup.cash.earnings.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.earnings.screens.AddPayerCustomersScreen;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class PayerTaggingPromptSheet implements Screen, OnlyOneOverlayTreatment {
    public static final Parcelable.Creator<PayerTaggingPromptSheet> CREATOR = new AddPayerCustomersScreen.Creator(13);
    public final Color accentColor;
    public final Money amount;
    public final String displayName;
    public final String imageUrl;
    public final Character monogram;
    public final String payerToken;

    public PayerTaggingPromptSheet(String str, String str2, Character ch, Color color, String str3, Money money) {
        str.getClass();
        str2.getClass();
        money.getClass();
        this.payerToken = str;
        this.displayName = str2;
        this.monogram = ch;
        this.accentColor = color;
        this.imageUrl = str3;
        this.amount = money;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayerTaggingPromptSheet)) {
            return false;
        }
        PayerTaggingPromptSheet payerTaggingPromptSheet = (PayerTaggingPromptSheet) obj;
        return Intrinsics.areEqual(this.payerToken, payerTaggingPromptSheet.payerToken) && Intrinsics.areEqual(this.displayName, payerTaggingPromptSheet.displayName) && Intrinsics.areEqual(this.monogram, payerTaggingPromptSheet.monogram) && Intrinsics.areEqual(this.accentColor, payerTaggingPromptSheet.accentColor) && Intrinsics.areEqual(this.imageUrl, payerTaggingPromptSheet.imageUrl) && Intrinsics.areEqual(this.amount, payerTaggingPromptSheet.amount);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.payerToken.hashCode() * 31, 31, this.displayName);
        Character ch = this.monogram;
        int hashCode = (m + (ch == null ? 0 : ch.hashCode())) * 31;
        Color color = this.accentColor;
        int hashCode2 = (hashCode + (color == null ? 0 : color.hashCode())) * 31;
        String str = this.imageUrl;
        return this.amount.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PayerTaggingPromptSheet(payerToken=", this.payerToken, ", displayName=", this.displayName, ", monogram=");
        m.append(this.monogram);
        m.append(", accentColor=");
        m.append(this.accentColor);
        m.append(", imageUrl=");
        m.append(this.imageUrl);
        m.append(", amount=");
        m.append(this.amount);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        char charValue;
        parcel.getClass();
        parcel.writeString(this.payerToken);
        parcel.writeString(this.displayName);
        Character ch = this.monogram;
        if (ch == null) {
            charValue = 0;
        } else {
            parcel.writeInt(1);
            charValue = ch.charValue();
        }
        parcel.writeInt(charValue);
        parcel.writeParcelable(this.accentColor, i);
        parcel.writeString(this.imageUrl);
        parcel.writeParcelable(this.amount, i);
    }
}

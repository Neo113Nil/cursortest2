package com.squareup.cash.moneybot.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Question;
import com.squareup.cash.music.screens.MusicScreen;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MoneybotAmountInputQuestion implements Question {
    public static final Parcelable.Creator<MoneybotAmountInputQuestion> CREATOR = new MusicScreen.Creator(1);
    public final String cta;
    public final Money initialAmount;
    public final Money maxAmount;
    public final Money minAmount;
    public final String subtitle;
    public final String title;

    public MoneybotAmountInputQuestion(Money money, Money money2, Money money3, String str, String str2, String str3) {
        money.getClass();
        this.initialAmount = money;
        this.minAmount = money2;
        this.maxAmount = money3;
        this.title = str;
        this.subtitle = str2;
        this.cta = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneybotAmountInputQuestion)) {
            return false;
        }
        MoneybotAmountInputQuestion moneybotAmountInputQuestion = (MoneybotAmountInputQuestion) obj;
        return Intrinsics.areEqual(this.initialAmount, moneybotAmountInputQuestion.initialAmount) && Intrinsics.areEqual(this.minAmount, moneybotAmountInputQuestion.minAmount) && Intrinsics.areEqual(this.maxAmount, moneybotAmountInputQuestion.maxAmount) && Intrinsics.areEqual(this.title, moneybotAmountInputQuestion.title) && Intrinsics.areEqual(this.subtitle, moneybotAmountInputQuestion.subtitle) && Intrinsics.areEqual(this.cta, moneybotAmountInputQuestion.cta);
    }

    public final int hashCode() {
        int hashCode = this.initialAmount.hashCode() * 31;
        Money money = this.minAmount;
        int hashCode2 = (hashCode + (money == null ? 0 : money.hashCode())) * 31;
        Money money2 = this.maxAmount;
        int hashCode3 = (hashCode2 + (money2 == null ? 0 : money2.hashCode())) * 31;
        String str = this.title;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cta;
        return hashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoneybotAmountInputQuestion(initialAmount=");
        sb.append(this.initialAmount);
        sb.append(", minAmount=");
        sb.append(this.minAmount);
        sb.append(", maxAmount=");
        sb.append(this.maxAmount);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.subtitle, ", cta=", this.cta, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.initialAmount, i);
        parcel.writeParcelable(this.minAmount, i);
        parcel.writeParcelable(this.maxAmount, i);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.cta);
    }
}

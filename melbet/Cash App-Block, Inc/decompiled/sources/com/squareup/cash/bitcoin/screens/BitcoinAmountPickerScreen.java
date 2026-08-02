package com.squareup.cash.bitcoin.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.AskedQuestion;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.cash.screens.MainScreens;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class BitcoinAmountPickerScreen extends MainScreens {
    public static final Parcelable.Creator<BitcoinAmountPickerScreen> CREATOR = new BitcoinHome.Creator(1);
    public final AskedQuestion askedQuestion;
    public final Money initialAmount;
    public final String note;
    public final AmountPickerPurpose purpose;
    public final boolean useSendVerbInLimitMessages;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public final class AmountPickerPurpose {
        public static final /* synthetic */ AmountPickerPurpose[] $VALUES;
        public static final AmountPickerPurpose DEPOSIT;
        public static final AmountPickerPurpose WITHDRAWAL;

        static {
            AmountPickerPurpose amountPickerPurpose = new AmountPickerPurpose("WITHDRAWAL", 0);
            WITHDRAWAL = amountPickerPurpose;
            AmountPickerPurpose amountPickerPurpose2 = new AmountPickerPurpose("DEPOSIT", 1);
            DEPOSIT = amountPickerPurpose2;
            $VALUES = new AmountPickerPurpose[]{amountPickerPurpose, amountPickerPurpose2};
        }

        public static AmountPickerPurpose valueOf(String str) {
            return (AmountPickerPurpose) Enum.valueOf(AmountPickerPurpose.class, str);
        }

        public static AmountPickerPurpose[] values() {
            return (AmountPickerPurpose[]) $VALUES.clone();
        }
    }

    public /* synthetic */ BitcoinAmountPickerScreen(AmountPickerPurpose amountPickerPurpose, Money money, String str, AskedQuestion askedQuestion, boolean z, int i) {
        this(amountPickerPurpose, (i & 2) != 0 ? null : money, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : askedQuestion, (i & 16) != 0 ? true : z);
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
        if (!(obj instanceof BitcoinAmountPickerScreen)) {
            return false;
        }
        BitcoinAmountPickerScreen bitcoinAmountPickerScreen = (BitcoinAmountPickerScreen) obj;
        return this.purpose == bitcoinAmountPickerScreen.purpose && Intrinsics.areEqual(this.initialAmount, bitcoinAmountPickerScreen.initialAmount) && Intrinsics.areEqual(this.note, bitcoinAmountPickerScreen.note) && Intrinsics.areEqual(this.askedQuestion, bitcoinAmountPickerScreen.askedQuestion) && this.useSendVerbInLimitMessages == bitcoinAmountPickerScreen.useSendVerbInLimitMessages;
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final int hashCode() {
        int hashCode = this.purpose.hashCode() * 31;
        Money money = this.initialAmount;
        int hashCode2 = (hashCode + (money == null ? 0 : money.hashCode())) * 31;
        String str = this.note;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        AskedQuestion askedQuestion = this.askedQuestion;
        return Boolean.hashCode(this.useSendVerbInLimitMessages) + ((hashCode3 + (askedQuestion != null ? askedQuestion.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitcoinAmountPickerScreen(purpose=");
        sb.append(this.purpose);
        sb.append(", initialAmount=");
        sb.append(this.initialAmount);
        sb.append(", note=");
        sb.append(this.note);
        sb.append(", askedQuestion=");
        sb.append(this.askedQuestion);
        sb.append(", useSendVerbInLimitMessages=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.useSendVerbInLimitMessages, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.purpose.name());
        parcel.writeParcelable(this.initialAmount, i);
        parcel.writeString(this.note);
        parcel.writeParcelable(this.askedQuestion, i);
        parcel.writeInt(this.useSendVerbInLimitMessages ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitcoinAmountPickerScreen(AmountPickerPurpose amountPickerPurpose, Money money, String str, AskedQuestion askedQuestion, boolean z) {
        super(1);
        amountPickerPurpose.getClass();
        this.purpose = amountPickerPurpose;
        this.initialAmount = money;
        this.note = str;
        this.askedQuestion = askedQuestion;
        this.useSendVerbInLimitMessages = z;
    }
}

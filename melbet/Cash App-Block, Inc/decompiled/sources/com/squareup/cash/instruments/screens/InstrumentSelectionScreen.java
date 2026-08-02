package com.squareup.cash.instruments.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Screen;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.instruments.common.SelectPaymentInstrumentType;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class InstrumentSelectionScreen implements Screen {
    public static final Parcelable.Creator<InstrumentSelectionScreen> CREATOR = new Instrument.Creator(8);
    public final Money amount;
    public final boolean includeBankAccounts;
    public final boolean includeCreditCards;
    public final boolean includeDebitCards;
    public final boolean includeGooglePay;
    public final String pageTitle;
    public final AskedQuestion question;
    public final List recipients;
    public final SelectPaymentInstrumentType selectInstrumentType;
    public final String selectedInstrumentToken;

    public /* synthetic */ InstrumentSelectionScreen(Money money, AskedQuestion askedQuestion, String str, List list, boolean z, boolean z2, String str2, int i) {
        this(money, askedQuestion, str, list, z, true, false, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? null : str2, (i & 512) != 0 ? SelectPaymentInstrumentType.SELECT_FROM_TYPES : SelectPaymentInstrumentType.SELECT_FROM_ALL);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstrumentSelectionScreen)) {
            return false;
        }
        InstrumentSelectionScreen instrumentSelectionScreen = (InstrumentSelectionScreen) obj;
        return Intrinsics.areEqual(this.amount, instrumentSelectionScreen.amount) && Intrinsics.areEqual(this.question, instrumentSelectionScreen.question) && Intrinsics.areEqual(this.selectedInstrumentToken, instrumentSelectionScreen.selectedInstrumentToken) && Intrinsics.areEqual(this.recipients, instrumentSelectionScreen.recipients) && this.includeCreditCards == instrumentSelectionScreen.includeCreditCards && this.includeDebitCards == instrumentSelectionScreen.includeDebitCards && this.includeBankAccounts == instrumentSelectionScreen.includeBankAccounts && this.includeGooglePay == instrumentSelectionScreen.includeGooglePay && Intrinsics.areEqual(this.pageTitle, instrumentSelectionScreen.pageTitle) && this.selectInstrumentType == instrumentSelectionScreen.selectInstrumentType;
    }

    public final int hashCode() {
        int hashCode = (this.question.hashCode() + (this.amount.hashCode() * 31)) * 31;
        String str = this.selectedInstrumentToken;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.recipients), 31, this.includeCreditCards), 31, this.includeDebitCards), 31, this.includeBankAccounts), 31, this.includeGooglePay);
        String str2 = this.pageTitle;
        return this.selectInstrumentType.hashCode() + ((m + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstrumentSelectionScreen(amount=");
        sb.append(this.amount);
        sb.append(", question=");
        sb.append(this.question);
        sb.append(", selectedInstrumentToken=");
        NavAction$$ExternalSyntheticOutline0.m(this.selectedInstrumentToken, ", recipients=", ", includeCreditCards=", sb, this.recipients);
        re$$ExternalSyntheticOutline0.m(sb, this.includeCreditCards, ", includeDebitCards=", this.includeDebitCards, ", includeBankAccounts=");
        re$$ExternalSyntheticOutline0.m(sb, this.includeBankAccounts, ", includeGooglePay=", this.includeGooglePay, ", pageTitle=");
        sb.append(this.pageTitle);
        sb.append(", selectInstrumentType=");
        sb.append(this.selectInstrumentType);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.amount, i);
        parcel.writeParcelable(this.question, i);
        parcel.writeString(this.selectedInstrumentToken);
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.recipients, parcel);
        while (m.hasNext()) {
            parcel.writeParcelable((Parcelable) m.next(), i);
        }
        parcel.writeInt(this.includeCreditCards ? 1 : 0);
        parcel.writeInt(this.includeDebitCards ? 1 : 0);
        parcel.writeInt(this.includeBankAccounts ? 1 : 0);
        parcel.writeInt(this.includeGooglePay ? 1 : 0);
        parcel.writeString(this.pageTitle);
        parcel.writeString(this.selectInstrumentType.name());
    }

    public InstrumentSelectionScreen(Money money, AskedQuestion askedQuestion, String str, List list, boolean z, boolean z2, boolean z3, boolean z4, String str2, SelectPaymentInstrumentType selectPaymentInstrumentType) {
        money.getClass();
        askedQuestion.getClass();
        list.getClass();
        selectPaymentInstrumentType.getClass();
        this.amount = money;
        this.question = askedQuestion;
        this.selectedInstrumentToken = str;
        this.recipients = list;
        this.includeCreditCards = z;
        this.includeDebitCards = z2;
        this.includeBankAccounts = z3;
        this.includeGooglePay = z4;
        this.pageTitle = str2;
        this.selectInstrumentType = selectPaymentInstrumentType;
    }
}

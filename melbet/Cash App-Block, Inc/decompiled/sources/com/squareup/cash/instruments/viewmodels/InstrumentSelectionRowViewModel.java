package com.squareup.cash.instruments.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.InstrumentSelection;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InstrumentSelectionRowViewModel implements Parcelable {
    public static final Parcelable.Creator<InstrumentSelectionRowViewModel> CREATOR = new Instrument.Creator(29);
    public final String actionText;
    public final String balance;
    public final String bankName;
    public final CashInstrumentType cashInstrumentType;
    public final String creditCardFee;
    public final InstrumentAvatarViewModel instrumentAvatarViewModel;
    public final InstrumentSelection instrumentSelection;
    public final boolean isActionEnabled;
    public final boolean isInstrumentSectionTappable;
    public final boolean isInstrumentSelectionOpen;
    public final String subtitle;

    public InstrumentSelectionRowViewModel(String str, String str2, boolean z, boolean z2, InstrumentAvatarViewModel instrumentAvatarViewModel, String str3, String str4, String str5, boolean z3, InstrumentSelection instrumentSelection, CashInstrumentType cashInstrumentType) {
        str.getClass();
        this.subtitle = str;
        this.creditCardFee = str2;
        this.isInstrumentSelectionOpen = z;
        this.isActionEnabled = z2;
        this.instrumentAvatarViewModel = instrumentAvatarViewModel;
        this.balance = str3;
        this.bankName = str4;
        this.actionText = str5;
        this.isInstrumentSectionTappable = z3;
        this.instrumentSelection = instrumentSelection;
        this.cashInstrumentType = cashInstrumentType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstrumentSelectionRowViewModel)) {
            return false;
        }
        InstrumentSelectionRowViewModel instrumentSelectionRowViewModel = (InstrumentSelectionRowViewModel) obj;
        return Intrinsics.areEqual(this.subtitle, instrumentSelectionRowViewModel.subtitle) && Intrinsics.areEqual(this.creditCardFee, instrumentSelectionRowViewModel.creditCardFee) && this.isInstrumentSelectionOpen == instrumentSelectionRowViewModel.isInstrumentSelectionOpen && this.isActionEnabled == instrumentSelectionRowViewModel.isActionEnabled && Intrinsics.areEqual(this.instrumentAvatarViewModel, instrumentSelectionRowViewModel.instrumentAvatarViewModel) && Intrinsics.areEqual(this.balance, instrumentSelectionRowViewModel.balance) && Intrinsics.areEqual(this.bankName, instrumentSelectionRowViewModel.bankName) && Intrinsics.areEqual(this.actionText, instrumentSelectionRowViewModel.actionText) && this.isInstrumentSectionTappable == instrumentSelectionRowViewModel.isInstrumentSectionTappable && Intrinsics.areEqual(this.instrumentSelection, instrumentSelectionRowViewModel.instrumentSelection) && this.cashInstrumentType == instrumentSelectionRowViewModel.cashInstrumentType;
    }

    public final int hashCode() {
        int hashCode = this.subtitle.hashCode() * 31;
        String str = this.creditCardFee;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isInstrumentSelectionOpen), 31, this.isActionEnabled);
        InstrumentAvatarViewModel instrumentAvatarViewModel = this.instrumentAvatarViewModel;
        int hashCode2 = (m + (instrumentAvatarViewModel == null ? 0 : instrumentAvatarViewModel.hashCode())) * 31;
        String str2 = this.balance;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bankName;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.actionText;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.isInstrumentSectionTappable);
        InstrumentSelection instrumentSelection = this.instrumentSelection;
        int hashCode5 = (m2 + (instrumentSelection == null ? 0 : instrumentSelection.hashCode())) * 31;
        CashInstrumentType cashInstrumentType = this.cashInstrumentType;
        return hashCode5 + (cashInstrumentType != null ? cashInstrumentType.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InstrumentSelectionRowViewModel(subtitle=", this.subtitle, ", creditCardFee=", this.creditCardFee, ", isInstrumentSelectionOpen=");
        re$$ExternalSyntheticOutline0.m(m, this.isInstrumentSelectionOpen, ", isActionEnabled=", this.isActionEnabled, ", instrumentAvatarViewModel=");
        m.append(this.instrumentAvatarViewModel);
        m.append(", balance=");
        m.append(this.balance);
        m.append(", bankName=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.bankName, ", actionText=", this.actionText, ", isInstrumentSectionTappable=");
        m.append(this.isInstrumentSectionTappable);
        m.append(", instrumentSelection=");
        m.append(this.instrumentSelection);
        m.append(", cashInstrumentType=");
        m.append(this.cashInstrumentType);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.subtitle);
        parcel.writeString(this.creditCardFee);
        parcel.writeInt(this.isInstrumentSelectionOpen ? 1 : 0);
        parcel.writeInt(this.isActionEnabled ? 1 : 0);
        InstrumentAvatarViewModel instrumentAvatarViewModel = this.instrumentAvatarViewModel;
        if (instrumentAvatarViewModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            instrumentAvatarViewModel.writeToParcel(parcel, i);
        }
        parcel.writeString(this.balance);
        parcel.writeString(this.bankName);
        parcel.writeString(this.actionText);
        parcel.writeInt(this.isInstrumentSectionTappable ? 1 : 0);
        parcel.writeParcelable(this.instrumentSelection, i);
        CashInstrumentType cashInstrumentType = this.cashInstrumentType;
        if (cashInstrumentType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(cashInstrumentType.name());
        }
    }
}

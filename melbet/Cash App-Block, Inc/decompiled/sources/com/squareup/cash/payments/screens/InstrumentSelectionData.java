package com.squareup.cash.payments.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.payments.common.PaymentRecipient;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.instrument.InstrumentType;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.InstrumentSelection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InstrumentSelectionData implements Parcelable {
    public static final Parcelable.Creator<InstrumentSelectionData> CREATOR = new PaymentRecipient.Creator(28);
    public final InstrumentType brand;
    public final Money creditCardFee;
    public final String token;

    /* renamed from: type, reason: collision with root package name */
    public final CashInstrumentType f1183type;

    public InstrumentSelectionData(String str, InstrumentType instrumentType, CashInstrumentType cashInstrumentType, Money money) {
        str.getClass();
        this.token = str;
        this.brand = instrumentType;
        this.f1183type = cashInstrumentType;
        this.creditCardFee = money;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstrumentSelectionData)) {
            return false;
        }
        InstrumentSelectionData instrumentSelectionData = (InstrumentSelectionData) obj;
        return Intrinsics.areEqual(this.token, instrumentSelectionData.token) && this.brand == instrumentSelectionData.brand && this.f1183type == instrumentSelectionData.f1183type && Intrinsics.areEqual(this.creditCardFee, instrumentSelectionData.creditCardFee);
    }

    public final int hashCode() {
        int hashCode = this.token.hashCode() * 31;
        InstrumentType instrumentType = this.brand;
        int hashCode2 = (hashCode + (instrumentType == null ? 0 : instrumentType.hashCode())) * 31;
        CashInstrumentType cashInstrumentType = this.f1183type;
        int hashCode3 = (hashCode2 + (cashInstrumentType == null ? 0 : cashInstrumentType.hashCode())) * 31;
        Money money = this.creditCardFee;
        return hashCode3 + (money != null ? money.hashCode() : 0);
    }

    public final InstrumentSelection toSelectionProto() {
        CashInstrumentType cashInstrumentType = CashInstrumentType.GOOGLE_PAY;
        CashInstrumentType cashInstrumentType2 = this.f1183type;
        return new InstrumentSelection(cashInstrumentType2 == cashInstrumentType ? null : this.token, this.creditCardFee, cashInstrumentType2 == cashInstrumentType ? cashInstrumentType2 : null, 8);
    }

    public final String toString() {
        return "InstrumentSelectionData(token=" + this.token + ", brand=" + this.brand + ", type=" + this.f1183type + ", creditCardFee=" + this.creditCardFee + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.token);
        InstrumentType instrumentType = this.brand;
        if (instrumentType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(instrumentType.name());
        }
        CashInstrumentType cashInstrumentType = this.f1183type;
        if (cashInstrumentType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(cashInstrumentType.name());
        }
        parcel.writeParcelable(this.creditCardFee, i);
    }
}

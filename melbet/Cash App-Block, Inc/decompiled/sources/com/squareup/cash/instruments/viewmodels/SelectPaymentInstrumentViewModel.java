package com.squareup.cash.instruments.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.investing.primitives.FilterToken;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.CashInstrumentType;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SelectPaymentInstrumentViewModel implements Parcelable {
    public static final Parcelable.Creator<SelectPaymentInstrumentViewModel> CREATOR = new FilterToken.Creator(1);
    public final List instruments;
    public final int selectedInstrumentIndex;
    public final String title;

    public abstract class PaymentInstrument implements Parcelable {

        public final class ExistingCashBalance extends PaymentInstrument {
            public static final Parcelable.Creator<ExistingCashBalance> CREATOR = new FilterToken.Creator(2);
            public final Money acceptedAmount;
            public final String amountExceededMessage;
            public final BalanceSnapshot balance;
            public final String details;
            public final boolean enabled;
            public final String fee;
            public final InstrumentAvatarViewModel instrumentAvatarViewModel;
            public final String name;

            public ExistingCashBalance(String str, String str2, boolean z, BalanceSnapshot balanceSnapshot, Money money, String str3, String str4, InstrumentAvatarViewModel instrumentAvatarViewModel) {
                str.getClass();
                balanceSnapshot.getClass();
                this.name = str;
                this.details = str2;
                this.enabled = z;
                this.balance = balanceSnapshot;
                this.acceptedAmount = money;
                this.fee = str3;
                this.amountExceededMessage = str4;
                this.instrumentAvatarViewModel = instrumentAvatarViewModel;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ExistingCashBalance)) {
                    return false;
                }
                ExistingCashBalance existingCashBalance = (ExistingCashBalance) obj;
                return Intrinsics.areEqual(this.name, existingCashBalance.name) && Intrinsics.areEqual(this.details, existingCashBalance.details) && this.enabled == existingCashBalance.enabled && Intrinsics.areEqual(this.balance, existingCashBalance.balance) && Intrinsics.areEqual(this.acceptedAmount, existingCashBalance.acceptedAmount) && Intrinsics.areEqual(this.fee, existingCashBalance.fee) && Intrinsics.areEqual(this.amountExceededMessage, existingCashBalance.amountExceededMessage) && Intrinsics.areEqual(this.instrumentAvatarViewModel, existingCashBalance.instrumentAvatarViewModel);
            }

            @Override // com.squareup.cash.instruments.viewmodels.SelectPaymentInstrumentViewModel.PaymentInstrument
            public final String getAmountExceededMessage() {
                return this.amountExceededMessage;
            }

            @Override // com.squareup.cash.instruments.viewmodels.SelectPaymentInstrumentViewModel.PaymentInstrument
            public final String getName() {
                return this.name;
            }

            public final int hashCode() {
                int hashCode = this.name.hashCode() * 31;
                String str = this.details;
                int hashCode2 = (this.balance.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.enabled)) * 31;
                Money money = this.acceptedAmount;
                int hashCode3 = (hashCode2 + (money == null ? 0 : money.hashCode())) * 31;
                String str2 = this.fee;
                int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.amountExceededMessage;
                int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
                InstrumentAvatarViewModel instrumentAvatarViewModel = this.instrumentAvatarViewModel;
                return hashCode5 + (instrumentAvatarViewModel != null ? instrumentAvatarViewModel.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ExistingCashBalance(name=", this.name, ", details=", this.details, ", enabled=");
                m.append(this.enabled);
                m.append(", balance=");
                m.append(this.balance);
                m.append(", acceptedAmount=");
                m.append(this.acceptedAmount);
                m.append(", fee=");
                m.append(this.fee);
                m.append(", amountExceededMessage=");
                m.append(this.amountExceededMessage);
                m.append(", instrumentAvatarViewModel=");
                m.append(this.instrumentAvatarViewModel);
                m.append(")");
                return m.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.name);
                parcel.writeString(this.details);
                parcel.writeInt(this.enabled ? 1 : 0);
                parcel.writeParcelable(this.balance, i);
                parcel.writeParcelable(this.acceptedAmount, i);
                parcel.writeString(this.fee);
                parcel.writeString(this.amountExceededMessage);
                InstrumentAvatarViewModel instrumentAvatarViewModel = this.instrumentAvatarViewModel;
                if (instrumentAvatarViewModel == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    instrumentAvatarViewModel.writeToParcel(parcel, i);
                }
            }
        }

        public final class ExistingInstrument extends PaymentInstrument {
            public static final Parcelable.Creator<ExistingInstrument> CREATOR = new FilterToken.Creator(3);
            public final Money acceptedAmount;
            public final String amountExceededMessage;
            public final String details;
            public final boolean enabled;
            public final String fee;
            public final Instrument instrument;
            public final InstrumentAvatarViewModel instrumentAvatarViewModel;
            public final String name;

            public ExistingInstrument(String str, String str2, boolean z, Instrument instrument, Money money, InstrumentAvatarViewModel instrumentAvatarViewModel, String str3, String str4) {
                str.getClass();
                instrument.getClass();
                this.name = str;
                this.details = str2;
                this.enabled = z;
                this.instrument = instrument;
                this.acceptedAmount = money;
                this.instrumentAvatarViewModel = instrumentAvatarViewModel;
                this.fee = str3;
                this.amountExceededMessage = str4;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ExistingInstrument)) {
                    return false;
                }
                ExistingInstrument existingInstrument = (ExistingInstrument) obj;
                return Intrinsics.areEqual(this.name, existingInstrument.name) && Intrinsics.areEqual(this.details, existingInstrument.details) && this.enabled == existingInstrument.enabled && Intrinsics.areEqual(this.instrument, existingInstrument.instrument) && Intrinsics.areEqual(this.acceptedAmount, existingInstrument.acceptedAmount) && Intrinsics.areEqual(this.instrumentAvatarViewModel, existingInstrument.instrumentAvatarViewModel) && Intrinsics.areEqual(this.fee, existingInstrument.fee) && Intrinsics.areEqual(this.amountExceededMessage, existingInstrument.amountExceededMessage);
            }

            @Override // com.squareup.cash.instruments.viewmodels.SelectPaymentInstrumentViewModel.PaymentInstrument
            public final String getAmountExceededMessage() {
                return this.amountExceededMessage;
            }

            @Override // com.squareup.cash.instruments.viewmodels.SelectPaymentInstrumentViewModel.PaymentInstrument
            public final String getName() {
                return this.name;
            }

            public final int hashCode() {
                int hashCode = this.name.hashCode() * 31;
                String str = this.details;
                int hashCode2 = (this.instrument.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.enabled)) * 31;
                Money money = this.acceptedAmount;
                int hashCode3 = (hashCode2 + (money == null ? 0 : money.hashCode())) * 31;
                InstrumentAvatarViewModel instrumentAvatarViewModel = this.instrumentAvatarViewModel;
                int hashCode4 = (hashCode3 + (instrumentAvatarViewModel == null ? 0 : instrumentAvatarViewModel.hashCode())) * 31;
                String str2 = this.fee;
                int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.amountExceededMessage;
                return hashCode5 + (str3 != null ? str3.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ExistingInstrument(name=", this.name, ", details=", this.details, ", enabled=");
                m.append(this.enabled);
                m.append(", instrument=");
                m.append(this.instrument);
                m.append(", acceptedAmount=");
                m.append(this.acceptedAmount);
                m.append(", instrumentAvatarViewModel=");
                m.append(this.instrumentAvatarViewModel);
                m.append(", fee=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.fee, ", amountExceededMessage=", this.amountExceededMessage, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.name);
                parcel.writeString(this.details);
                parcel.writeInt(this.enabled ? 1 : 0);
                parcel.writeParcelable(this.instrument, i);
                parcel.writeParcelable(this.acceptedAmount, i);
                InstrumentAvatarViewModel instrumentAvatarViewModel = this.instrumentAvatarViewModel;
                if (instrumentAvatarViewModel == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    instrumentAvatarViewModel.writeToParcel(parcel, i);
                }
                parcel.writeString(this.fee);
                parcel.writeString(this.amountExceededMessage);
            }
        }

        public final class NewInstrument extends PaymentInstrument {
            public static final Parcelable.Creator<NewInstrument> CREATOR = new FilterToken.Creator(4);
            public final String amountExceededMessage;
            public final String details;
            public final boolean enabled;
            public final String fee;
            public final InstrumentAvatarViewModel instrumentAvatarViewModel;
            public final String name;

            /* renamed from: type, reason: collision with root package name */
            public final CashInstrumentType f1148type;

            public NewInstrument(String str, String str2, CashInstrumentType cashInstrumentType, InstrumentAvatarViewModel instrumentAvatarViewModel, String str3, String str4, boolean z) {
                str.getClass();
                this.name = str;
                this.details = str2;
                this.f1148type = cashInstrumentType;
                this.instrumentAvatarViewModel = instrumentAvatarViewModel;
                this.fee = str3;
                this.amountExceededMessage = str4;
                this.enabled = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NewInstrument)) {
                    return false;
                }
                NewInstrument newInstrument = (NewInstrument) obj;
                return Intrinsics.areEqual(this.name, newInstrument.name) && Intrinsics.areEqual(this.details, newInstrument.details) && this.f1148type == newInstrument.f1148type && Intrinsics.areEqual(this.instrumentAvatarViewModel, newInstrument.instrumentAvatarViewModel) && Intrinsics.areEqual(this.fee, newInstrument.fee) && Intrinsics.areEqual(this.amountExceededMessage, newInstrument.amountExceededMessage) && this.enabled == newInstrument.enabled;
            }

            @Override // com.squareup.cash.instruments.viewmodels.SelectPaymentInstrumentViewModel.PaymentInstrument
            public final String getAmountExceededMessage() {
                return this.amountExceededMessage;
            }

            @Override // com.squareup.cash.instruments.viewmodels.SelectPaymentInstrumentViewModel.PaymentInstrument
            public final String getName() {
                return this.name;
            }

            public final int hashCode() {
                int hashCode = this.name.hashCode() * 31;
                String str = this.details;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                CashInstrumentType cashInstrumentType = this.f1148type;
                int hashCode3 = (hashCode2 + (cashInstrumentType == null ? 0 : cashInstrumentType.hashCode())) * 31;
                InstrumentAvatarViewModel instrumentAvatarViewModel = this.instrumentAvatarViewModel;
                int hashCode4 = (hashCode3 + (instrumentAvatarViewModel == null ? 0 : instrumentAvatarViewModel.hashCode())) * 31;
                String str2 = this.fee;
                int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.amountExceededMessage;
                return Boolean.hashCode(this.enabled) + ((hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("NewInstrument(name=", this.name, ", details=", this.details, ", type=");
                m.append(this.f1148type);
                m.append(", instrumentAvatarViewModel=");
                m.append(this.instrumentAvatarViewModel);
                m.append(", fee=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.fee, ", amountExceededMessage=", this.amountExceededMessage, ", enabled=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.enabled, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.name);
                parcel.writeString(this.details);
                CashInstrumentType cashInstrumentType = this.f1148type;
                if (cashInstrumentType == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(cashInstrumentType.name());
                }
                InstrumentAvatarViewModel instrumentAvatarViewModel = this.instrumentAvatarViewModel;
                if (instrumentAvatarViewModel == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    instrumentAvatarViewModel.writeToParcel(parcel, i);
                }
                parcel.writeString(this.fee);
                parcel.writeString(this.amountExceededMessage);
                parcel.writeInt(this.enabled ? 1 : 0);
            }
        }

        public abstract String getAmountExceededMessage();

        public abstract String getName();
    }

    public SelectPaymentInstrumentViewModel(String str, List list, int i) {
        list.getClass();
        this.title = str;
        this.instruments = list;
        this.selectedInstrumentIndex = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectPaymentInstrumentViewModel)) {
            return false;
        }
        SelectPaymentInstrumentViewModel selectPaymentInstrumentViewModel = (SelectPaymentInstrumentViewModel) obj;
        return Intrinsics.areEqual(this.title, selectPaymentInstrumentViewModel.title) && Intrinsics.areEqual(this.instruments, selectPaymentInstrumentViewModel.instruments) && this.selectedInstrumentIndex == selectPaymentInstrumentViewModel.selectedInstrumentIndex;
    }

    public final int hashCode() {
        String str = this.title;
        return Integer.hashCode(this.selectedInstrumentIndex) + Recorder$$ExternalSyntheticOutline2.m((str == null ? 0 : str.hashCode()) * 31, 31, this.instruments);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.selectedInstrumentIndex, ")", NavAction$$ExternalSyntheticOutline0.m("SelectPaymentInstrumentViewModel(title=", this.title, ", instruments=", ", selectedInstrumentIndex=", this.instruments));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.title);
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.instruments, parcel);
        while (m.hasNext()) {
            parcel.writeParcelable((Parcelable) m.next(), i);
        }
        parcel.writeInt(this.selectedInstrumentIndex);
    }
}

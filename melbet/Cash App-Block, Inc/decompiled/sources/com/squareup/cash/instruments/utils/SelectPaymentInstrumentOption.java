package com.squareup.cash.instruments.utils;

import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.CashInstrumentType;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes6.dex */
public abstract class SelectPaymentInstrumentOption {

    public abstract class ExistingOption extends SelectPaymentInstrumentOption {

        public final class ExistingCashBalance extends ExistingOption {
            public final BalanceSnapshot balance;
            public final boolean enabled;

            /* renamed from: type, reason: collision with root package name */
            public final CashInstrumentType f1145type;

            public ExistingCashBalance(BalanceSnapshot balanceSnapshot, boolean z) {
                CashInstrumentType cashInstrumentType = CashInstrumentType.CASH_BALANCE;
                balanceSnapshot.getClass();
                cashInstrumentType.getClass();
                this.balance = balanceSnapshot;
                this.enabled = z;
                this.f1145type = cashInstrumentType;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ExistingCashBalance)) {
                    return false;
                }
                ExistingCashBalance existingCashBalance = (ExistingCashBalance) obj;
                return Intrinsics.areEqual(this.balance, existingCashBalance.balance) && this.enabled == existingCashBalance.enabled && this.f1145type == existingCashBalance.f1145type;
            }

            @Override // com.squareup.cash.instruments.utils.SelectPaymentInstrumentOption
            public final boolean getEnabled() {
                return this.enabled;
            }

            @Override // com.squareup.cash.instruments.utils.SelectPaymentInstrumentOption
            public final CashInstrumentType getType() {
                return this.f1145type;
            }

            public final int hashCode() {
                return this.f1145type.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.balance.hashCode() * 31, 31, this.enabled);
            }

            public final String toString() {
                return "ExistingCashBalance(balance=" + this.balance + ", enabled=" + this.enabled + ", type=" + this.f1145type + ")";
            }
        }

        public final class ExistingInstrument extends ExistingOption {
            public final Money creditCardFee;
            public final Instrument instrument;

            /* renamed from: type, reason: collision with root package name */
            public final CashInstrumentType f1146type;

            public ExistingInstrument(Instrument instrument, Money money, int i) {
                money = (i & 2) != 0 ? null : money;
                CashInstrumentType cashInstrumentType = instrument.cashInstrumentType;
                instrument.getClass();
                cashInstrumentType.getClass();
                this.instrument = instrument;
                this.creditCardFee = money;
                this.f1146type = cashInstrumentType;
                CashInstrumentType cashInstrumentType2 = instrument.cashInstrumentType;
                if (cashInstrumentType2 == CashInstrumentType.CREDIT_CARD || money == null) {
                    return;
                }
                Path$$ExternalSyntheticBUOutline0.m$3(cashInstrumentType2, "Can't specify credit card fee for ");
                throw null;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ExistingInstrument)) {
                    return false;
                }
                ExistingInstrument existingInstrument = (ExistingInstrument) obj;
                return Intrinsics.areEqual(this.instrument, existingInstrument.instrument) && Intrinsics.areEqual(this.creditCardFee, existingInstrument.creditCardFee) && this.f1146type == existingInstrument.f1146type;
            }

            @Override // com.squareup.cash.instruments.utils.SelectPaymentInstrumentOption
            public final boolean getEnabled() {
                return true;
            }

            @Override // com.squareup.cash.instruments.utils.SelectPaymentInstrumentOption
            public final CashInstrumentType getType() {
                return this.f1146type;
            }

            public final int hashCode() {
                int hashCode = this.instrument.hashCode() * 31;
                Money money = this.creditCardFee;
                return this.f1146type.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (money == null ? 0 : money.hashCode())) * 31, 31, true);
            }

            public final String toString() {
                return "ExistingInstrument(instrument=" + this.instrument + ", creditCardFee=" + this.creditCardFee + ", enabled=true, type=" + this.f1146type + ")";
            }
        }
    }

    public final class NewInstrument extends SelectPaymentInstrumentOption {
        public final long creditCardBps;
        public final boolean enabled;

        /* renamed from: type, reason: collision with root package name */
        public final CashInstrumentType f1147type;

        public NewInstrument(CashInstrumentType cashInstrumentType, long j) {
            this.f1147type = cashInstrumentType;
            this.creditCardBps = j;
            if (cashInstrumentType == CashInstrumentType.CREDIT_CARD || j == 0) {
                this.enabled = true;
            } else {
                Path$$ExternalSyntheticBUOutline0.m$3(cashInstrumentType, "Can't specify credit card fee bps for ");
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewInstrument)) {
                return false;
            }
            NewInstrument newInstrument = (NewInstrument) obj;
            return this.f1147type == newInstrument.f1147type && this.creditCardBps == newInstrument.creditCardBps;
        }

        @Override // com.squareup.cash.instruments.utils.SelectPaymentInstrumentOption
        public final boolean getEnabled() {
            return this.enabled;
        }

        @Override // com.squareup.cash.instruments.utils.SelectPaymentInstrumentOption
        public final CashInstrumentType getType() {
            throw null;
        }

        public final int hashCode() {
            return Long.hashCode(this.creditCardBps) + (this.f1147type.hashCode() * 31);
        }

        public final String toString() {
            return "NewInstrument(type=" + this.f1147type + ", creditCardBps=" + this.creditCardBps + ")";
        }
    }

    public abstract boolean getEnabled();

    public abstract CashInstrumentType getType();
}

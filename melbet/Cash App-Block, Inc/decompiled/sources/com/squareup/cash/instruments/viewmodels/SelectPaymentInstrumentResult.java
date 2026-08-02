package com.squareup.cash.instruments.viewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.instrument.InstrumentType;
import com.squareup.protos.franklin.api.CashInstrumentType;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SelectPaymentInstrumentResult {
    public final Money acceptedAmount;
    public final InstrumentType cardBrand;
    public final CashInstrumentType linkType;
    public final CashInstrumentType selectedInstrumentType;
    public final boolean sendingToBusiness;
    public final Status status;
    public final String suffix;
    public final String token;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Status {
        public static final /* synthetic */ Status[] $VALUES;
        public static final Status LINK_CARD;
        public static final Status SUCCESS;

        static {
            Status status = new Status("SUCCESS", 0);
            SUCCESS = status;
            Status status2 = new Status("LINK_CARD", 1);
            LINK_CARD = status2;
            $VALUES = new Status[]{status, status2};
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public SelectPaymentInstrumentResult(Status status, CashInstrumentType cashInstrumentType, InstrumentType instrumentType, String str, String str2, CashInstrumentType cashInstrumentType2, Money money, boolean z, int i) {
        cashInstrumentType = (i & 2) != 0 ? null : cashInstrumentType;
        instrumentType = (i & 4) != 0 ? null : instrumentType;
        str = (i & 8) != 0 ? null : str;
        str2 = (i & 16) != 0 ? null : str2;
        cashInstrumentType2 = (i & 32) != 0 ? null : cashInstrumentType2;
        money = (i & 64) != 0 ? Moneys.zero(CurrencyCode.USD) : money;
        this.status = status;
        this.selectedInstrumentType = cashInstrumentType;
        this.cardBrand = instrumentType;
        this.suffix = str;
        this.token = str2;
        this.linkType = cashInstrumentType2;
        this.acceptedAmount = money;
        this.sendingToBusiness = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectPaymentInstrumentResult)) {
            return false;
        }
        SelectPaymentInstrumentResult selectPaymentInstrumentResult = (SelectPaymentInstrumentResult) obj;
        return this.status == selectPaymentInstrumentResult.status && this.selectedInstrumentType == selectPaymentInstrumentResult.selectedInstrumentType && this.cardBrand == selectPaymentInstrumentResult.cardBrand && Intrinsics.areEqual(this.suffix, selectPaymentInstrumentResult.suffix) && Intrinsics.areEqual(this.token, selectPaymentInstrumentResult.token) && this.linkType == selectPaymentInstrumentResult.linkType && Intrinsics.areEqual(this.acceptedAmount, selectPaymentInstrumentResult.acceptedAmount) && this.sendingToBusiness == selectPaymentInstrumentResult.sendingToBusiness;
    }

    public final Money getAcceptedAmount() {
        return this.acceptedAmount;
    }

    public final InstrumentType getCardBrand() {
        return this.cardBrand;
    }

    public final CashInstrumentType getLinkType() {
        return this.linkType;
    }

    public final boolean getSendingToBusiness() {
        return this.sendingToBusiness;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final String getSuffix() {
        return this.suffix;
    }

    public final String getToken() {
        return this.token;
    }

    public final int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        CashInstrumentType cashInstrumentType = this.selectedInstrumentType;
        int hashCode2 = (hashCode + (cashInstrumentType == null ? 0 : cashInstrumentType.hashCode())) * 31;
        InstrumentType instrumentType = this.cardBrand;
        int hashCode3 = (hashCode2 + (instrumentType == null ? 0 : instrumentType.hashCode())) * 31;
        String str = this.suffix;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.token;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CashInstrumentType cashInstrumentType2 = this.linkType;
        return Boolean.hashCode(this.sendingToBusiness) + NavAction$$ExternalSyntheticOutline0.m(this.acceptedAmount, (hashCode5 + (cashInstrumentType2 != null ? cashInstrumentType2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "SelectPaymentInstrumentResult(status=" + this.status + ", selectedInstrumentType=" + this.selectedInstrumentType + ", cardBrand=" + this.cardBrand + ", suffix=" + this.suffix + ", token=" + this.token + ", linkType=" + this.linkType + ", acceptedAmount=" + this.acceptedAmount + ", sendingToBusiness=" + this.sendingToBusiness + ")";
    }
}

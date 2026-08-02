package com.squareup.cash.bitcoin.presenters;

import androidx.compose.ui.autofill.AndroidAutofill_androidKt;
import com.squareup.protos.common.CurrencyCode;

/* loaded from: classes5.dex */
public final class BitcoinDepositsPresenter$DisplayAmounts$AmountsNotReady extends AndroidAutofill_androidKt {
    public static final BitcoinDepositsPresenter$DisplayAmounts$AmountsNotReady INSTANCE = new BitcoinDepositsPresenter$DisplayAmounts$AmountsNotReady();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof BitcoinDepositsPresenter$DisplayAmounts$AmountsNotReady);
    }

    @Override // androidx.compose.ui.autofill.AndroidAutofill_androidKt
    public final CurrencyCode getCurrencyCode() {
        throw new Exception("no currency code available");
    }

    public final int hashCode() {
        return -651876018;
    }

    public final String toString() {
        return "AmountsNotReady";
    }
}

package com.squareup.cash.paymentpad.viewmodels;

import app.cash.versioned.Versioned;
import com.squareup.protos.common.CurrencyCode;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class LitePaymentPadViewModel {
    public final Versioned amountErrorTrigger;
    public final CurrencyCode currencyCode;
    public final String errorMessage;
    public final ExchangeRatePreview exchangeRatePreview;
    public final String rawAmount;

    public LitePaymentPadViewModel(CurrencyCode currencyCode, String str, Versioned versioned, String str2, ExchangeRatePreview exchangeRatePreview) {
        currencyCode.getClass();
        str.getClass();
        this.currencyCode = currencyCode;
        this.rawAmount = str;
        this.amountErrorTrigger = versioned;
        this.errorMessage = str2;
        this.exchangeRatePreview = exchangeRatePreview;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LitePaymentPadViewModel)) {
            return false;
        }
        LitePaymentPadViewModel litePaymentPadViewModel = (LitePaymentPadViewModel) obj;
        return this.currencyCode == litePaymentPadViewModel.currencyCode && Intrinsics.areEqual(this.rawAmount, litePaymentPadViewModel.rawAmount) && Intrinsics.areEqual(this.amountErrorTrigger, litePaymentPadViewModel.amountErrorTrigger) && Intrinsics.areEqual(this.errorMessage, litePaymentPadViewModel.errorMessage) && Intrinsics.areEqual(this.exchangeRatePreview, litePaymentPadViewModel.exchangeRatePreview);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.currencyCode.hashCode() * 31, 31, this.rawAmount);
        Versioned versioned = this.amountErrorTrigger;
        int hashCode = (m + (versioned == null ? 0 : versioned.hashCode())) * 31;
        String str = this.errorMessage;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ExchangeRatePreview exchangeRatePreview = this.exchangeRatePreview;
        return hashCode2 + (exchangeRatePreview != null ? exchangeRatePreview.hashCode() : 0);
    }

    public final String toString() {
        return "LitePaymentPadViewModel(currencyCode=" + this.currencyCode + ", rawAmount=" + this.rawAmount + ", amountErrorTrigger=" + this.amountErrorTrigger + ", errorMessage=" + this.errorMessage + ", exchangeRatePreview=" + this.exchangeRatePreview + ")";
    }
}

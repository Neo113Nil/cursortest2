package com.squareup.cash.crypto.navigation;

import com.squareup.cash.cdf.crypto.ContentType;
import com.squareup.cash.cdf.crypto.CryptoSendComplete;
import com.squareup.cash.crypto.navigation.CryptoPayment;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinPayments;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes6.dex */
public final class RealCryptoAnalytics {
    public final Analytics analytics;

    public RealCryptoAnalytics(Analytics analytics) {
        this.analytics = analytics;
    }

    public final void trackSubmitPayment(CryptoPayment cryptoPayment, boolean z, String str, Boolean bool) {
        ContentType contentType;
        cryptoPayment.getClass();
        str.getClass();
        if (cryptoPayment instanceof CryptoPayment.InvoicePayment) {
            BitcoinPayments bitcoinPayments = ((CryptoPayment.InvoicePayment) cryptoPayment).invoice;
            contentType = bitcoinPayments instanceof BitcoinPayments.Lightning ? ContentType.LIGHTNING : ((bitcoinPayments instanceof BitcoinPayments.Bitcoin) && ((BitcoinPayments.Bitcoin) bitcoinPayments).bitcoinPayment.lightningInvoice == null) ? ContentType.BITCOIN : ContentType.UNIFIED;
        } else if (cryptoPayment instanceof CryptoPayment.InvoiceIdPayment) {
            contentType = ContentType.SHARE_INVOICE;
        } else {
            if (!(cryptoPayment instanceof CryptoPayment.TokenPayment)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            contentType = ContentType.TRANSFER;
        }
        this.analytics.track(new CryptoSendComplete(str, contentType, z ? CryptoSendComplete.CryptoSendCompleteResult.START_PAYMENT_BLOCKER_FLOW : CryptoSendComplete.CryptoSendCompleteResult.SHOW_PAYMENT_BLOCKER_FLOW_FAILURE, bool), null);
    }
}

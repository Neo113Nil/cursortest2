package com.squareup.cash.bitcoin.presenters;

import com.squareup.cash.crypto.primitives.CryptoPaymentOrigin;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class BitcoinDepositsPresenter$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[CryptoPaymentOrigin.values().length];
        try {
            CryptoPaymentOrigin cryptoPaymentOrigin = CryptoPaymentOrigin.BITCOIN_TAB;
            iArr[4] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            CryptoPaymentOrigin cryptoPaymentOrigin2 = CryptoPaymentOrigin.BITCOIN_TAB;
            iArr[2] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}

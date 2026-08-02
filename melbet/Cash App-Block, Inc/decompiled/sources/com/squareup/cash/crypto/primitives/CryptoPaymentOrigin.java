package com.squareup.cash.crypto.primitives;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class CryptoPaymentOrigin {
    public static final /* synthetic */ CryptoPaymentOrigin[] $VALUES;
    public static final CryptoPaymentOrigin BITCOIN_LOCATION;
    public static final CryptoPaymentOrigin BITCOIN_MAP;
    public static final CryptoPaymentOrigin BITCOIN_TAB;
    public static final CryptoPaymentOrigin DEPOSIT_REVERSAL;
    public static final CryptoPaymentOrigin MAIN_QR_SCANNER;
    public static final CryptoPaymentOrigin STABLECOIN_DEMO;

    static {
        CryptoPaymentOrigin cryptoPaymentOrigin = new CryptoPaymentOrigin("BITCOIN_TAB", 0);
        BITCOIN_TAB = cryptoPaymentOrigin;
        CryptoPaymentOrigin cryptoPaymentOrigin2 = new CryptoPaymentOrigin("MAIN_QR_SCANNER", 1);
        MAIN_QR_SCANNER = cryptoPaymentOrigin2;
        CryptoPaymentOrigin cryptoPaymentOrigin3 = new CryptoPaymentOrigin("MAIN_PAYMENT_PAD", 2);
        CryptoPaymentOrigin cryptoPaymentOrigin4 = new CryptoPaymentOrigin("DEPOSIT_REVERSAL", 3);
        DEPOSIT_REVERSAL = cryptoPaymentOrigin4;
        CryptoPaymentOrigin cryptoPaymentOrigin5 = new CryptoPaymentOrigin("ACCOUNT_QR", 4);
        CryptoPaymentOrigin cryptoPaymentOrigin6 = new CryptoPaymentOrigin("STABLECOIN_DEMO", 5);
        STABLECOIN_DEMO = cryptoPaymentOrigin6;
        CryptoPaymentOrigin cryptoPaymentOrigin7 = new CryptoPaymentOrigin("BITCOIN_MAP", 6);
        BITCOIN_MAP = cryptoPaymentOrigin7;
        CryptoPaymentOrigin cryptoPaymentOrigin8 = new CryptoPaymentOrigin("BITCOIN_LOCATION", 7);
        BITCOIN_LOCATION = cryptoPaymentOrigin8;
        $VALUES = new CryptoPaymentOrigin[]{cryptoPaymentOrigin, cryptoPaymentOrigin2, cryptoPaymentOrigin3, cryptoPaymentOrigin4, cryptoPaymentOrigin5, cryptoPaymentOrigin6, cryptoPaymentOrigin7, cryptoPaymentOrigin8};
    }

    public static CryptoPaymentOrigin valueOf(String str) {
        return (CryptoPaymentOrigin) Enum.valueOf(CryptoPaymentOrigin.class, str);
    }

    public static CryptoPaymentOrigin[] values() {
        return (CryptoPaymentOrigin[]) $VALUES.clone();
    }
}

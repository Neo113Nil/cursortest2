package com.squareup.cash.crypto.navigation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class CryptoPaymentSource {
    public static final /* synthetic */ CryptoPaymentSource[] $VALUES;
    public static final CryptoPaymentSource CRYPTO_RECIPIENT_SELECTOR_FOR_AMOUNT;
    public static final CryptoPaymentSource CRYPTO_SCANNER_MANUAL_PASTE;
    public static final CryptoPaymentSource CRYPTO_SCANNER_QR_CODE;
    public static final CryptoPaymentSource DEEP_LINK;
    public static final CryptoPaymentSource MAIN_KEYPAD_SCANNER_QR_CODE;
    public static final CryptoPaymentSource NFC_SCAN;

    static {
        CryptoPaymentSource cryptoPaymentSource = new CryptoPaymentSource("DEEP_LINK", 0);
        DEEP_LINK = cryptoPaymentSource;
        CryptoPaymentSource cryptoPaymentSource2 = new CryptoPaymentSource("NFC_SCAN", 1);
        NFC_SCAN = cryptoPaymentSource2;
        CryptoPaymentSource cryptoPaymentSource3 = new CryptoPaymentSource("MAIN_KEYPAD_SCANNER_QR_CODE", 2);
        MAIN_KEYPAD_SCANNER_QR_CODE = cryptoPaymentSource3;
        CryptoPaymentSource cryptoPaymentSource4 = new CryptoPaymentSource("CRYPTO_SCANNER_QR_CODE", 3);
        CRYPTO_SCANNER_QR_CODE = cryptoPaymentSource4;
        CryptoPaymentSource cryptoPaymentSource5 = new CryptoPaymentSource("CRYPTO_SCANNER_MANUAL_PASTE", 4);
        CRYPTO_SCANNER_MANUAL_PASTE = cryptoPaymentSource5;
        CryptoPaymentSource cryptoPaymentSource6 = new CryptoPaymentSource("CRYPTO_RECIPIENT_SELECTOR_FOR_AMOUNT", 5);
        CRYPTO_RECIPIENT_SELECTOR_FOR_AMOUNT = cryptoPaymentSource6;
        $VALUES = new CryptoPaymentSource[]{cryptoPaymentSource, cryptoPaymentSource2, cryptoPaymentSource3, cryptoPaymentSource4, cryptoPaymentSource5, cryptoPaymentSource6, new CryptoPaymentSource("CRYPTO_AMOUNT_FOR_RECIPIENT", 6)};
    }

    public static CryptoPaymentSource valueOf(String str) {
        return (CryptoPaymentSource) Enum.valueOf(CryptoPaymentSource.class, str);
    }

    public static CryptoPaymentSource[] values() {
        return (CryptoPaymentSource[]) $VALUES.clone();
    }
}

package com.squareup.cash.bitcoin.navigation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class CryptoScannerSource {
    public static final /* synthetic */ CryptoScannerSource[] $VALUES;
    public static final CryptoScannerSource BITCOIN_AMOUNT_ENTRY;
    public static final CryptoScannerSource BITCOIN_TAB;

    static {
        CryptoScannerSource cryptoScannerSource = new CryptoScannerSource("BITCOIN_TAB", 0);
        BITCOIN_TAB = cryptoScannerSource;
        CryptoScannerSource cryptoScannerSource2 = new CryptoScannerSource("BITCOIN_AMOUNT_ENTRY", 1);
        BITCOIN_AMOUNT_ENTRY = cryptoScannerSource2;
        $VALUES = new CryptoScannerSource[]{cryptoScannerSource, cryptoScannerSource2};
    }

    public static CryptoScannerSource valueOf(String str) {
        return (CryptoScannerSource) Enum.valueOf(CryptoScannerSource.class, str);
    }

    public static CryptoScannerSource[] values() {
        return (CryptoScannerSource[]) $VALUES.clone();
    }
}

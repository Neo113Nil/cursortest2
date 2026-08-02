package com.squareup.cash.cdf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class CryptoTradeSide {
    public static final /* synthetic */ CryptoTradeSide[] $VALUES;
    public static final CryptoTradeSide BUY;
    public static final CryptoTradeSide SELL;

    static {
        CryptoTradeSide cryptoTradeSide = new CryptoTradeSide("BUY", 0);
        BUY = cryptoTradeSide;
        CryptoTradeSide cryptoTradeSide2 = new CryptoTradeSide("SELL", 1);
        SELL = cryptoTradeSide2;
        $VALUES = new CryptoTradeSide[]{cryptoTradeSide, cryptoTradeSide2};
    }

    public static CryptoTradeSide valueOf(String str) {
        return (CryptoTradeSide) Enum.valueOf(CryptoTradeSide.class, str);
    }

    public static CryptoTradeSide[] values() {
        return (CryptoTradeSide[]) $VALUES.clone();
    }
}

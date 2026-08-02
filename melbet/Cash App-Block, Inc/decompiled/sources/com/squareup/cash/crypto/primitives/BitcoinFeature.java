package com.squareup.cash.crypto.primitives;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class BitcoinFeature {
    public static final /* synthetic */ BitcoinFeature[] $VALUES;
    public static final BitcoinFeature DEPOSIT;
    public static final BitcoinFeature FEATURE_UNSPECIFIED;
    public static final BitcoinFeature LN_DEPOSIT;

    static {
        BitcoinFeature bitcoinFeature = new BitcoinFeature("FEATURE_UNSPECIFIED", 0);
        FEATURE_UNSPECIFIED = bitcoinFeature;
        BitcoinFeature bitcoinFeature2 = new BitcoinFeature("P2P_SEND", 1);
        BitcoinFeature bitcoinFeature3 = new BitcoinFeature("P2P_RECEIVE", 2);
        BitcoinFeature bitcoinFeature4 = new BitcoinFeature("WITHDRAW", 3);
        BitcoinFeature bitcoinFeature5 = new BitcoinFeature("DEPOSIT", 4);
        DEPOSIT = bitcoinFeature5;
        BitcoinFeature bitcoinFeature6 = new BitcoinFeature("LN_WITHDRAW", 5);
        BitcoinFeature bitcoinFeature7 = new BitcoinFeature("LN_DEPOSIT", 6);
        LN_DEPOSIT = bitcoinFeature7;
        $VALUES = new BitcoinFeature[]{bitcoinFeature, bitcoinFeature2, bitcoinFeature3, bitcoinFeature4, bitcoinFeature5, bitcoinFeature6, bitcoinFeature7, new BitcoinFeature("BUY", 7), new BitcoinFeature("SELL", 8)};
    }

    public static BitcoinFeature valueOf(String str) {
        return (BitcoinFeature) Enum.valueOf(BitcoinFeature.class, str);
    }

    public static BitcoinFeature[] values() {
        return (BitcoinFeature[]) $VALUES.clone();
    }
}

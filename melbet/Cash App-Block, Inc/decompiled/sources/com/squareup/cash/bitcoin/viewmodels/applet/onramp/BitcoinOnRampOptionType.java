package com.squareup.cash.bitcoin.viewmodels.applet.onramp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class BitcoinOnRampOptionType {
    public static final /* synthetic */ BitcoinOnRampOptionType[] $VALUES;
    public static final BitcoinOnRampOptionType AUTO_WITHDRAW;
    public static final BitcoinOnRampOptionType PAY_IN_USD;
    public static final BitcoinOnRampOptionType PAY_WITH_BITCOIN;
    public static final BitcoinOnRampOptionType WALLET_ADDRESS;

    static {
        BitcoinOnRampOptionType bitcoinOnRampOptionType = new BitcoinOnRampOptionType("WALLET_ADDRESS", 0);
        WALLET_ADDRESS = bitcoinOnRampOptionType;
        BitcoinOnRampOptionType bitcoinOnRampOptionType2 = new BitcoinOnRampOptionType("PAY_WITH_BITCOIN", 1);
        PAY_WITH_BITCOIN = bitcoinOnRampOptionType2;
        BitcoinOnRampOptionType bitcoinOnRampOptionType3 = new BitcoinOnRampOptionType("PAY_IN_USD", 2);
        PAY_IN_USD = bitcoinOnRampOptionType3;
        BitcoinOnRampOptionType bitcoinOnRampOptionType4 = new BitcoinOnRampOptionType("AUTO_WITHDRAW", 3);
        AUTO_WITHDRAW = bitcoinOnRampOptionType4;
        $VALUES = new BitcoinOnRampOptionType[]{bitcoinOnRampOptionType, bitcoinOnRampOptionType2, bitcoinOnRampOptionType3, bitcoinOnRampOptionType4};
    }

    public static BitcoinOnRampOptionType valueOf(String str) {
        return (BitcoinOnRampOptionType) Enum.valueOf(BitcoinOnRampOptionType.class, str);
    }

    public static BitcoinOnRampOptionType[] values() {
        return (BitcoinOnRampOptionType[]) $VALUES.clone();
    }
}

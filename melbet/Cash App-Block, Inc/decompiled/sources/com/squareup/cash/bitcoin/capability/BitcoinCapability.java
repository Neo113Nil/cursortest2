package com.squareup.cash.bitcoin.capability;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class BitcoinCapability {
    public static final /* synthetic */ BitcoinCapability[] $VALUES;
    public static final BitcoinCapability BITCOIN;
    public static final BitcoinCapability BITCOIN_BOOSTS;
    public static final BitcoinCapability BITCOIN_BUY_MARKET;
    public static final BitcoinCapability BITCOIN_PAYROLL;
    public static final BitcoinCapability BITCOIN_SELL_MARKET;

    static {
        BitcoinCapability bitcoinCapability = new BitcoinCapability("BITCOIN", 0);
        BITCOIN = bitcoinCapability;
        BitcoinCapability bitcoinCapability2 = new BitcoinCapability("BITCOIN_AUTO_INVEST_BUY", 1);
        BitcoinCapability bitcoinCapability3 = new BitcoinCapability("BITCOIN_BOOSTS", 2);
        BITCOIN_BOOSTS = bitcoinCapability3;
        BitcoinCapability bitcoinCapability4 = new BitcoinCapability("BITCOIN_BUY_CUSTOM", 3);
        BitcoinCapability bitcoinCapability5 = new BitcoinCapability("BITCOIN_BUY_MARKET", 4);
        BITCOIN_BUY_MARKET = bitcoinCapability5;
        BitcoinCapability bitcoinCapability6 = new BitcoinCapability("BITCOIN_DEPOSIT", 5);
        BitcoinCapability bitcoinCapability7 = new BitcoinCapability("BITCOIN_GIFTING", 6);
        BitcoinCapability bitcoinCapability8 = new BitcoinCapability("BITCOIN_LIGHTNING_DEPOSIT", 7);
        BitcoinCapability bitcoinCapability9 = new BitcoinCapability("BITCOIN_LIGHTNING_WITHDRAW", 8);
        BitcoinCapability bitcoinCapability10 = new BitcoinCapability("BITCOIN_P2P", 9);
        BitcoinCapability bitcoinCapability11 = new BitcoinCapability("BITCOIN_PAYROLL", 10);
        BITCOIN_PAYROLL = bitcoinCapability11;
        BitcoinCapability bitcoinCapability12 = new BitcoinCapability("BITCOIN_ROUNDUP", 11);
        BitcoinCapability bitcoinCapability13 = new BitcoinCapability("BITCOIN_SELL_CUSTOM", 12);
        BitcoinCapability bitcoinCapability14 = new BitcoinCapability("BITCOIN_SELL_MARKET", 13);
        BITCOIN_SELL_MARKET = bitcoinCapability14;
        $VALUES = new BitcoinCapability[]{bitcoinCapability, bitcoinCapability2, bitcoinCapability3, bitcoinCapability4, bitcoinCapability5, bitcoinCapability6, bitcoinCapability7, bitcoinCapability8, bitcoinCapability9, bitcoinCapability10, bitcoinCapability11, bitcoinCapability12, bitcoinCapability13, bitcoinCapability14, new BitcoinCapability("BITCOIN_WITHDRAW", 14)};
    }

    public static BitcoinCapability valueOf(String str) {
        return (BitcoinCapability) Enum.valueOf(BitcoinCapability.class, str);
    }

    public static BitcoinCapability[] values() {
        return (BitcoinCapability[]) $VALUES.clone();
    }
}

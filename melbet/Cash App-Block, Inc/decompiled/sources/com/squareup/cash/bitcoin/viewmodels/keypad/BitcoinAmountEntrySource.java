package com.squareup.cash.bitcoin.viewmodels.keypad;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class BitcoinAmountEntrySource {
    public static final /* synthetic */ BitcoinAmountEntrySource[] $VALUES;
    public static final BitcoinAmountEntrySource BITCOIN_SEND_AMOUNT;
    public static final BitcoinAmountEntrySource BITCOIN_SEND_TO_ADDRESS;

    static {
        BitcoinAmountEntrySource bitcoinAmountEntrySource = new BitcoinAmountEntrySource("BITCOIN_SEND_AMOUNT", 0);
        BITCOIN_SEND_AMOUNT = bitcoinAmountEntrySource;
        BitcoinAmountEntrySource bitcoinAmountEntrySource2 = new BitcoinAmountEntrySource("BITCOIN_SEND_TO_ADDRESS", 1);
        BITCOIN_SEND_TO_ADDRESS = bitcoinAmountEntrySource2;
        $VALUES = new BitcoinAmountEntrySource[]{bitcoinAmountEntrySource, bitcoinAmountEntrySource2, new BitcoinAmountEntrySource("MAIN_PAYMENT_PAD", 2)};
    }

    public static BitcoinAmountEntrySource valueOf(String str) {
        return (BitcoinAmountEntrySource) Enum.valueOf(BitcoinAmountEntrySource.class, str);
    }

    public static BitcoinAmountEntrySource[] values() {
        return (BitcoinAmountEntrySource[]) $VALUES.clone();
    }
}

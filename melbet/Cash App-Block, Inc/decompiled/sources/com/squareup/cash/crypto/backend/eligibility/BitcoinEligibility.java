package com.squareup.cash.crypto.backend.eligibility;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class BitcoinEligibility {
    public static final /* synthetic */ BitcoinEligibility[] $VALUES;
    public static final BitcoinEligibility DEPOSIT;
    public static final BitcoinEligibility LIGHTNING_WITHDRAW;
    public static final BitcoinEligibility WITHDRAW;

    /* JADX INFO: Fake field, exist only in values array */
    BitcoinEligibility EF0;

    static {
        BitcoinEligibility bitcoinEligibility = new BitcoinEligibility("P2P_SEND", 0);
        BitcoinEligibility bitcoinEligibility2 = new BitcoinEligibility("P2P_RECEIVE", 1);
        BitcoinEligibility bitcoinEligibility3 = new BitcoinEligibility("WITHDRAW", 2);
        WITHDRAW = bitcoinEligibility3;
        BitcoinEligibility bitcoinEligibility4 = new BitcoinEligibility("DEPOSIT", 3);
        DEPOSIT = bitcoinEligibility4;
        BitcoinEligibility bitcoinEligibility5 = new BitcoinEligibility("LIGHTNING_WITHDRAW", 4);
        LIGHTNING_WITHDRAW = bitcoinEligibility5;
        $VALUES = new BitcoinEligibility[]{bitcoinEligibility, bitcoinEligibility2, bitcoinEligibility3, bitcoinEligibility4, bitcoinEligibility5, new BitcoinEligibility("LIGHTNING_DEPOSIT", 5)};
    }

    public static BitcoinEligibility valueOf(String str) {
        return (BitcoinEligibility) Enum.valueOf(BitcoinEligibility.class, str);
    }

    public static BitcoinEligibility[] values() {
        return (BitcoinEligibility[]) $VALUES.clone();
    }
}

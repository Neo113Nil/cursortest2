package com.squareup.cash.bitcoin.screens;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class BitcoinMapErrorSelectedAction {
    public static final /* synthetic */ BitcoinMapErrorSelectedAction[] $VALUES;
    public static final BitcoinMapErrorSelectedAction NEGATIVE;
    public static final BitcoinMapErrorSelectedAction POSITIVE;

    static {
        BitcoinMapErrorSelectedAction bitcoinMapErrorSelectedAction = new BitcoinMapErrorSelectedAction("POSITIVE", 0);
        POSITIVE = bitcoinMapErrorSelectedAction;
        BitcoinMapErrorSelectedAction bitcoinMapErrorSelectedAction2 = new BitcoinMapErrorSelectedAction("NEGATIVE", 1);
        NEGATIVE = bitcoinMapErrorSelectedAction2;
        $VALUES = new BitcoinMapErrorSelectedAction[]{bitcoinMapErrorSelectedAction, bitcoinMapErrorSelectedAction2};
    }

    public static BitcoinMapErrorSelectedAction valueOf(String str) {
        return (BitcoinMapErrorSelectedAction) Enum.valueOf(BitcoinMapErrorSelectedAction.class, str);
    }

    public static BitcoinMapErrorSelectedAction[] values() {
        return (BitcoinMapErrorSelectedAction[]) $VALUES.clone();
    }
}

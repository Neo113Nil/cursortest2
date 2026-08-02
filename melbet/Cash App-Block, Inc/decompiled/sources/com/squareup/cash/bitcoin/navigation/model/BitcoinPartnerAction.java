package com.squareup.cash.bitcoin.navigation.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class BitcoinPartnerAction {
    public static final /* synthetic */ BitcoinPartnerAction[] $VALUES;
    public static final BitcoinPartnerAction SELL;

    /* JADX INFO: Fake field, exist only in values array */
    BitcoinPartnerAction EF0;

    static {
        BitcoinPartnerAction bitcoinPartnerAction = new BitcoinPartnerAction("BUY", 0);
        BitcoinPartnerAction bitcoinPartnerAction2 = new BitcoinPartnerAction("SELL", 1);
        SELL = bitcoinPartnerAction2;
        $VALUES = new BitcoinPartnerAction[]{bitcoinPartnerAction, bitcoinPartnerAction2, new BitcoinPartnerAction("TRANSFER", 2)};
    }

    public static BitcoinPartnerAction valueOf(String str) {
        return (BitcoinPartnerAction) Enum.valueOf(BitcoinPartnerAction.class, str);
    }

    public static BitcoinPartnerAction[] values() {
        return (BitcoinPartnerAction[]) $VALUES.clone();
    }
}

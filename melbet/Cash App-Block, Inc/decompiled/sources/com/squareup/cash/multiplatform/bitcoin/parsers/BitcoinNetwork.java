package com.squareup.cash.multiplatform.bitcoin.parsers;

import kotlin.enums.EnumEntriesList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class BitcoinNetwork {
    public static final /* synthetic */ EnumEntriesList $ENTRIES;
    public static final /* synthetic */ BitcoinNetwork[] $VALUES;
    public static final BitcoinNetwork MAINNET;
    public static final BitcoinNetwork REGTEST;
    public static final BitcoinNetwork TESTNET;
    public final String prefix;

    static {
        BitcoinNetwork bitcoinNetwork = new BitcoinNetwork("MAINNET", 0, "bc");
        MAINNET = bitcoinNetwork;
        BitcoinNetwork bitcoinNetwork2 = new BitcoinNetwork("TESTNET", 1, "tb");
        TESTNET = bitcoinNetwork2;
        BitcoinNetwork bitcoinNetwork3 = new BitcoinNetwork("REGTEST", 2, "bcrt");
        REGTEST = bitcoinNetwork3;
        BitcoinNetwork[] bitcoinNetworkArr = {bitcoinNetwork, bitcoinNetwork2, bitcoinNetwork3};
        $VALUES = bitcoinNetworkArr;
        $ENTRIES = new EnumEntriesList(bitcoinNetworkArr);
    }

    public BitcoinNetwork(String str, int i, String str2) {
        this.prefix = str2;
    }

    public static BitcoinNetwork valueOf(String str) {
        return (BitcoinNetwork) Enum.valueOf(BitcoinNetwork.class, str);
    }

    public static BitcoinNetwork[] values() {
        return (BitcoinNetwork[]) $VALUES.clone();
    }
}

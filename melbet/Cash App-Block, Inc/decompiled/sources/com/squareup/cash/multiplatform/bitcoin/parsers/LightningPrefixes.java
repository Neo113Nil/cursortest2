package com.squareup.cash.multiplatform.bitcoin.parsers;

import kotlin.enums.EnumEntriesList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class LightningPrefixes {
    public static final /* synthetic */ EnumEntriesList $ENTRIES;
    public static final /* synthetic */ LightningPrefixes[] $VALUES;
    public static final LightningPrefixes BTC_MAINNET;
    public final String prefix;

    static {
        LightningPrefixes lightningPrefixes = new LightningPrefixes("BTC_MAINNET", 0, "lnbc");
        BTC_MAINNET = lightningPrefixes;
        LightningPrefixes[] lightningPrefixesArr = {lightningPrefixes, new LightningPrefixes("BTC_TESTNET", 1, "lntb"), new LightningPrefixes("BTC_SIGNET", 2, "lntbs"), new LightningPrefixes("BTC_REGTEST", 3, "lnbcrt"), new LightningPrefixes("LN_URL", 4, "lnurl")};
        $VALUES = lightningPrefixesArr;
        $ENTRIES = new EnumEntriesList(lightningPrefixesArr);
    }

    public LightningPrefixes(String str, int i, String str2) {
        this.prefix = str2;
    }

    public static LightningPrefixes valueOf(String str) {
        return (LightningPrefixes) Enum.valueOf(LightningPrefixes.class, str);
    }

    public static LightningPrefixes[] values() {
        return (LightningPrefixes[]) $VALUES.clone();
    }
}

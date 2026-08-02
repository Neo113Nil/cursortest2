package com.squareup.cash.stablecoin.capability.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class StablecoinCapability {
    public static final /* synthetic */ StablecoinCapability[] $VALUES;
    public static final StablecoinCapability BITCOIN_TO_STABLECOIN_MARKET_CONVERT;
    public static final StablecoinCapability FIAT_TO_STABLECOIN_MARKET_BUY;
    public static final StablecoinCapability STABLECOIN;
    public static final StablecoinCapability STABLECOIN_TO_BITCOIN_MARKET_CONVERT;

    static {
        StablecoinCapability stablecoinCapability = new StablecoinCapability("STABLECOIN", 0);
        STABLECOIN = stablecoinCapability;
        StablecoinCapability stablecoinCapability2 = new StablecoinCapability("FIAT_TO_STABLECOIN_MARKET_BUY", 1);
        FIAT_TO_STABLECOIN_MARKET_BUY = stablecoinCapability2;
        StablecoinCapability stablecoinCapability3 = new StablecoinCapability("BITCOIN_TO_STABLECOIN_MARKET_CONVERT", 2);
        BITCOIN_TO_STABLECOIN_MARKET_CONVERT = stablecoinCapability3;
        StablecoinCapability stablecoinCapability4 = new StablecoinCapability("STABLECOIN_TO_BITCOIN_MARKET_CONVERT", 3);
        STABLECOIN_TO_BITCOIN_MARKET_CONVERT = stablecoinCapability4;
        $VALUES = new StablecoinCapability[]{stablecoinCapability, stablecoinCapability2, stablecoinCapability3, stablecoinCapability4, new StablecoinCapability("STABLECOIN_TO_FIAT_MARKET_SELL", 4)};
    }

    public static StablecoinCapability valueOf(String str) {
        return (StablecoinCapability) Enum.valueOf(StablecoinCapability.class, str);
    }

    public static StablecoinCapability[] values() {
        return (StablecoinCapability[]) $VALUES.clone();
    }
}

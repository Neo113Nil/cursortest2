package com.squareup.cash.marketcapabilities;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class MarketCapabilityAvailability {
    public static final /* synthetic */ MarketCapabilityAvailability[] $VALUES;
    public static final MarketCapabilityAvailability AVAILABLE;
    public static final MarketCapabilityAvailability UNAVAILABLE;

    static {
        MarketCapabilityAvailability marketCapabilityAvailability = new MarketCapabilityAvailability("UNAVAILABLE", 0);
        UNAVAILABLE = marketCapabilityAvailability;
        MarketCapabilityAvailability marketCapabilityAvailability2 = new MarketCapabilityAvailability("AVAILABLE", 1);
        AVAILABLE = marketCapabilityAvailability2;
        $VALUES = new MarketCapabilityAvailability[]{marketCapabilityAvailability, marketCapabilityAvailability2};
    }

    public static MarketCapabilityAvailability valueOf(String str) {
        return (MarketCapabilityAvailability) Enum.valueOf(MarketCapabilityAvailability.class, str);
    }

    public static MarketCapabilityAvailability[] values() {
        return (MarketCapabilityAvailability[]) $VALUES.clone();
    }

    public final boolean isAvailable() {
        return this == AVAILABLE;
    }
}

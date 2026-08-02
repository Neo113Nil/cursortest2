package com.squareup.cash.offers.backend.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class OffersTabRepository$SearchSource {
    public static final /* synthetic */ OffersTabRepository$SearchSource[] $VALUES;
    public static final OffersTabRepository$SearchSource ALWAYS_REMOTE;
    public static final OffersTabRepository$SearchSource FROM_CACHE;

    static {
        OffersTabRepository$SearchSource offersTabRepository$SearchSource = new OffersTabRepository$SearchSource("FROM_CACHE", 0);
        FROM_CACHE = offersTabRepository$SearchSource;
        OffersTabRepository$SearchSource offersTabRepository$SearchSource2 = new OffersTabRepository$SearchSource("ALWAYS_REMOTE", 1);
        ALWAYS_REMOTE = offersTabRepository$SearchSource2;
        $VALUES = new OffersTabRepository$SearchSource[]{offersTabRepository$SearchSource, offersTabRepository$SearchSource2};
    }

    public static OffersTabRepository$SearchSource valueOf(String str) {
        return (OffersTabRepository$SearchSource) Enum.valueOf(OffersTabRepository$SearchSource.class, str);
    }

    public static OffersTabRepository$SearchSource[] values() {
        return (OffersTabRepository$SearchSource[]) $VALUES.clone();
    }
}

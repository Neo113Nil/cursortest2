package com.squareup.cash.cdf.growtools;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class Origin {
    public static final /* synthetic */ Origin[] $VALUES;
    public static final Origin BITCOIN;
    public static final Origin CARD;
    public static final Origin SAVINGS;
    public static final Origin STOCKS;
    public static final Origin UNSPECIFIED;

    static {
        Origin origin = new Origin("BITCOIN", 0);
        BITCOIN = origin;
        Origin origin2 = new Origin("CARD", 1);
        CARD = origin2;
        Origin origin3 = new Origin("SAVINGS", 2);
        SAVINGS = origin3;
        Origin origin4 = new Origin("STOCKS", 3);
        STOCKS = origin4;
        Origin origin5 = new Origin("UNSPECIFIED", 4);
        UNSPECIFIED = origin5;
        $VALUES = new Origin[]{origin, origin2, origin3, origin4, origin5};
    }

    public static Origin valueOf(String str) {
        return (Origin) Enum.valueOf(Origin.class, str);
    }

    public static Origin[] values() {
        return (Origin[]) $VALUES.clone();
    }
}

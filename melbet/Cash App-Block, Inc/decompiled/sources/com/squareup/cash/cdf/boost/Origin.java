package com.squareup.cash.cdf.boost;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class Origin {
    public static final /* synthetic */ Origin[] $VALUES = {new Origin("Browser", 0), new Origin("Card", 1), new Origin("DiscoverSearch", 2), new Origin("DiscoverBrowse", 3), new Origin("OffersDetail", 4), new Origin("OffersCollection", 5)};

    /* JADX INFO: Fake field, exist only in values array */
    Origin EF5;

    public static Origin valueOf(String str) {
        return (Origin) Enum.valueOf(Origin.class, str);
    }

    public static Origin[] values() {
        return (Origin[]) $VALUES.clone();
    }
}

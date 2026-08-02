package com.squareup.cash.offers.views.home.collectionCluster;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ItemDirection {
    public static final /* synthetic */ ItemDirection[] $VALUES;
    public static final ItemDirection Horizontal;
    public static final ItemDirection Vertical;

    static {
        ItemDirection itemDirection = new ItemDirection("Horizontal", 0);
        Horizontal = itemDirection;
        ItemDirection itemDirection2 = new ItemDirection("Vertical", 1);
        Vertical = itemDirection2;
        $VALUES = new ItemDirection[]{itemDirection, itemDirection2};
    }

    public static ItemDirection valueOf(String str) {
        return (ItemDirection) Enum.valueOf(ItemDirection.class, str);
    }

    public static ItemDirection[] values() {
        return (ItemDirection[]) $VALUES.clone();
    }
}

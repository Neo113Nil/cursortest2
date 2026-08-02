package com.squareup.cash.cdf.browser;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class EntityType {
    public static final /* synthetic */ EntityType[] $VALUES;
    public static final EntityType Product;
    public static final EntityType Store;

    static {
        EntityType entityType = new EntityType("Store", 0);
        Store = entityType;
        EntityType entityType2 = new EntityType("Product", 1);
        Product = entityType2;
        $VALUES = new EntityType[]{entityType, entityType2, new EntityType("Category", 2), new EntityType("Collection", 3), new EntityType("Merchant", 4), new EntityType("Business", 5)};
    }

    public static EntityType valueOf(String str) {
        return (EntityType) Enum.valueOf(EntityType.class, str);
    }

    public static EntityType[] values() {
        return (EntityType[]) $VALUES.clone();
    }
}

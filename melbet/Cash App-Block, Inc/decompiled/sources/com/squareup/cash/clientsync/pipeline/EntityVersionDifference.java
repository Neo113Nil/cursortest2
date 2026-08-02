package com.squareup.cash.clientsync.pipeline;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class EntityVersionDifference {
    public static final /* synthetic */ EntityVersionDifference[] $VALUES;
    public static final EntityVersionDifference Downgrade;
    public static final EntityVersionDifference Equal;
    public static final EntityVersionDifference Upgrade;

    static {
        EntityVersionDifference entityVersionDifference = new EntityVersionDifference("Upgrade", 0);
        Upgrade = entityVersionDifference;
        EntityVersionDifference entityVersionDifference2 = new EntityVersionDifference("Equal", 1);
        Equal = entityVersionDifference2;
        EntityVersionDifference entityVersionDifference3 = new EntityVersionDifference("Downgrade", 2);
        Downgrade = entityVersionDifference3;
        $VALUES = new EntityVersionDifference[]{entityVersionDifference, entityVersionDifference2, entityVersionDifference3};
    }

    public static EntityVersionDifference valueOf(String str) {
        return (EntityVersionDifference) Enum.valueOf(EntityVersionDifference.class, str);
    }

    public static EntityVersionDifference[] values() {
        return (EntityVersionDifference[]) $VALUES.clone();
    }
}

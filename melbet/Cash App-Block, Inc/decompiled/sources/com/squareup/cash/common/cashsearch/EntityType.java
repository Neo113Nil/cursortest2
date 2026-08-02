package com.squareup.cash.common.cashsearch;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class EntityType {
    public static final /* synthetic */ EntityType[] $VALUES;
    public static final EntityType CUSTOMER;
    public static final EntityType LOAN_ACTIVITY;
    public static final EntityType MERCHANT;
    public static final EntityType PAYMENT;
    public static final EntityType SPONSORED_ACCOUNT;
    public static final EntityType TRANSACTION;
    public static final EntityType TRANSFER;

    static {
        EntityType entityType = new EntityType("PAYMENT", 0);
        PAYMENT = entityType;
        EntityType entityType2 = new EntityType("CUSTOMER", 1);
        CUSTOMER = entityType2;
        EntityType entityType3 = new EntityType("TRANSFER", 2);
        TRANSFER = entityType3;
        EntityType entityType4 = new EntityType("TRANSACTION", 3);
        TRANSACTION = entityType4;
        EntityType entityType5 = new EntityType("MERCHANT", 4);
        MERCHANT = entityType5;
        EntityType entityType6 = new EntityType("LOAN_ACTIVITY", 5);
        LOAN_ACTIVITY = entityType6;
        EntityType entityType7 = new EntityType("SPONSORED_ACCOUNT", 6);
        SPONSORED_ACCOUNT = entityType7;
        $VALUES = new EntityType[]{entityType, entityType2, entityType3, entityType4, entityType5, entityType6, entityType7};
    }

    public static EntityType valueOf(String str) {
        return (EntityType) Enum.valueOf(EntityType.class, str);
    }

    public static EntityType[] values() {
        return (EntityType[]) $VALUES.clone();
    }
}

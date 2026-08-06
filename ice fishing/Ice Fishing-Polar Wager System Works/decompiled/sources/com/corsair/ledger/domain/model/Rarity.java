package com.corsair.ledger.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class Rarity {
    private static final /* synthetic */ defpackage.fu $ENTRIES;
    private static final /* synthetic */ com.corsair.ledger.domain.model.Rarity[] $VALUES;
    public static final com.corsair.ledger.domain.model.Rarity COMMON;
    public static final com.corsair.ledger.domain.model.Rarity EPIC;
    public static final com.corsair.ledger.domain.model.Rarity LEGENDARY;
    public static final com.corsair.ledger.domain.model.Rarity RARE;
    private final int craftCost;
    private final java.lang.String label;
    private final int lootWeight;
    private final int scrapShards;
    private final int sellPrice;

    static {
        com.corsair.ledger.domain.model.Rarity rarity = new com.corsair.ledger.domain.model.Rarity("COMMON", 0, "Common", 60, 5, 20, 15);
        COMMON = rarity;
        com.corsair.ledger.domain.model.Rarity rarity2 = new com.corsair.ledger.domain.model.Rarity("RARE", 1, "Rare", 28, 10, 40, 45);
        RARE = rarity2;
        com.corsair.ledger.domain.model.Rarity rarity3 = new com.corsair.ledger.domain.model.Rarity("EPIC", 2, "Epic", 9, 20, 80, 120);
        EPIC = rarity3;
        com.corsair.ledger.domain.model.Rarity rarity4 = new com.corsair.ledger.domain.model.Rarity("LEGENDARY", 3, "Legendary", 3, 40, 160, 400);
        LEGENDARY = rarity4;
        com.corsair.ledger.domain.model.Rarity[] rarityArr = {rarity, rarity2, rarity3, rarity4};
        $VALUES = rarityArr;
        $ENTRIES = new defpackage.gu(rarityArr);
    }

    public Rarity(java.lang.String str, int i, java.lang.String str2, int i2, int i3, int i4, int i5) {
        this.label = str2;
        this.lootWeight = i2;
        this.scrapShards = i3;
        this.craftCost = i4;
        this.sellPrice = i5;
    }

    public static defpackage.fu oh6vYeIP() {
        return $ENTRIES;
    }

    public static com.corsair.ledger.domain.model.Rarity valueOf(java.lang.String str) {
        return (com.corsair.ledger.domain.model.Rarity) java.lang.Enum.valueOf(com.corsair.ledger.domain.model.Rarity.class, str);
    }

    public static com.corsair.ledger.domain.model.Rarity[] values() {
        return (com.corsair.ledger.domain.model.Rarity[]) $VALUES.clone();
    }

    public final int AARZUJiTa() {
        return this.sellPrice;
    }

    public final int F7NU4MC0GW() {
        return this.lootWeight;
    }

    public final int IHQe1A4L2xu() {
        return this.craftCost;
    }

    public final com.corsair.ledger.domain.model.Rarity adDC3e2L() {
        return (com.corsair.ledger.domain.model.Rarity) defpackage.td.sJNB7mCer5(ordinal() + 1, $ENTRIES);
    }

    public final java.lang.String r1MBDhnF() {
        return this.label;
    }

    public final int xiZrDbcSW0() {
        return this.scrapShards;
    }
}

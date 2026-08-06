package com.corsair.ledger.data.local.entity;

/* loaded from: classes.dex */
public final class ShardEntity {
    public static final int $stable = 0;
    private final int amount;
    private final java.lang.String rarity;

    public ShardEntity(java.lang.String str, int i) {
        str.getClass();
        this.rarity = str;
        this.amount = i;
    }

    public static /* synthetic */ com.corsair.ledger.data.local.entity.ShardEntity copy$default(com.corsair.ledger.data.local.entity.ShardEntity shardEntity, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = shardEntity.rarity;
        }
        if ((i2 & 2) != 0) {
            i = shardEntity.amount;
        }
        return shardEntity.copy(str, i);
    }

    public final java.lang.String component1() {
        return this.rarity;
    }

    public final int component2() {
        return this.amount;
    }

    public final com.corsair.ledger.data.local.entity.ShardEntity copy(java.lang.String str, int i) {
        str.getClass();
        return new com.corsair.ledger.data.local.entity.ShardEntity(str, i);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.corsair.ledger.data.local.entity.ShardEntity)) {
            return false;
        }
        com.corsair.ledger.data.local.entity.ShardEntity shardEntity = (com.corsair.ledger.data.local.entity.ShardEntity) obj;
        return defpackage.x70.QoRHpC4k(this.rarity, shardEntity.rarity) && this.amount == shardEntity.amount;
    }

    public final int getAmount() {
        return this.amount;
    }

    public final java.lang.String getRarity() {
        return this.rarity;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.amount) + (this.rarity.hashCode() * 31);
    }

    public java.lang.String toString() {
        return "ShardEntity(rarity=" + this.rarity + ", amount=" + this.amount + ")";
    }
}

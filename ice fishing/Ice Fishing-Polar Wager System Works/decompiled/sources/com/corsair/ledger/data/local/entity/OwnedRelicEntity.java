package com.corsair.ledger.data.local.entity;

/* loaded from: classes.dex */
public final class OwnedRelicEntity {
    public static final int $stable = 0;
    private final int count;
    private final java.lang.String relicId;

    public OwnedRelicEntity(java.lang.String str, int i) {
        str.getClass();
        this.relicId = str;
        this.count = i;
    }

    public static /* synthetic */ com.corsair.ledger.data.local.entity.OwnedRelicEntity copy$default(com.corsair.ledger.data.local.entity.OwnedRelicEntity ownedRelicEntity, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = ownedRelicEntity.relicId;
        }
        if ((i2 & 2) != 0) {
            i = ownedRelicEntity.count;
        }
        return ownedRelicEntity.copy(str, i);
    }

    public final java.lang.String component1() {
        return this.relicId;
    }

    public final int component2() {
        return this.count;
    }

    public final com.corsair.ledger.data.local.entity.OwnedRelicEntity copy(java.lang.String str, int i) {
        str.getClass();
        return new com.corsair.ledger.data.local.entity.OwnedRelicEntity(str, i);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.corsair.ledger.data.local.entity.OwnedRelicEntity)) {
            return false;
        }
        com.corsair.ledger.data.local.entity.OwnedRelicEntity ownedRelicEntity = (com.corsair.ledger.data.local.entity.OwnedRelicEntity) obj;
        return defpackage.x70.QoRHpC4k(this.relicId, ownedRelicEntity.relicId) && this.count == ownedRelicEntity.count;
    }

    public final int getCount() {
        return this.count;
    }

    public final java.lang.String getRelicId() {
        return this.relicId;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.count) + (this.relicId.hashCode() * 31);
    }

    public java.lang.String toString() {
        return "OwnedRelicEntity(relicId=" + this.relicId + ", count=" + this.count + ")";
    }
}

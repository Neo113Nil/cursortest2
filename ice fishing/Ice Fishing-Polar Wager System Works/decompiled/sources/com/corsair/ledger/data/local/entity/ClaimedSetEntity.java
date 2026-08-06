package com.corsair.ledger.data.local.entity;

/* loaded from: classes.dex */
public final class ClaimedSetEntity {
    public static final int $stable = 0;
    private final java.lang.String setId;

    public ClaimedSetEntity(java.lang.String str) {
        str.getClass();
        this.setId = str;
    }

    public static /* synthetic */ com.corsair.ledger.data.local.entity.ClaimedSetEntity copy$default(com.corsair.ledger.data.local.entity.ClaimedSetEntity claimedSetEntity, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = claimedSetEntity.setId;
        }
        return claimedSetEntity.copy(str);
    }

    public final java.lang.String component1() {
        return this.setId;
    }

    public final com.corsair.ledger.data.local.entity.ClaimedSetEntity copy(java.lang.String str) {
        str.getClass();
        return new com.corsair.ledger.data.local.entity.ClaimedSetEntity(str);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.corsair.ledger.data.local.entity.ClaimedSetEntity) && defpackage.x70.QoRHpC4k(this.setId, ((com.corsair.ledger.data.local.entity.ClaimedSetEntity) obj).setId);
    }

    public final java.lang.String getSetId() {
        return this.setId;
    }

    public int hashCode() {
        return this.setId.hashCode();
    }

    public java.lang.String toString() {
        return defpackage.fx0.ez2rX8ReCYw("ClaimedSetEntity(setId=", this.setId, ")");
    }
}

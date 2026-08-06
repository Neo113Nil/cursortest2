package com.corsair.ledger.data.local.entity;

/* loaded from: classes.dex */
public final class DigSessionEntity {
    public static final int $stable = 0;
    public static final com.corsair.ledger.data.local.entity.DigSessionEntity.Companion Companion = new com.corsair.ledger.data.local.entity.DigSessionEntity.Companion(null);
    public static final int SINGLETON_ID = 0;
    private final boolean finished;
    private final int id;
    private final java.lang.String islandId;
    private final int movesLeft;
    private final java.lang.String revealedCsv;
    private final long seed;

    public DigSessionEntity(int i, java.lang.String str, long j, int i2, java.lang.String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.id = i;
        this.islandId = str;
        this.seed = j;
        this.movesLeft = i2;
        this.revealedCsv = str2;
        this.finished = z;
    }

    public static /* synthetic */ com.corsair.ledger.data.local.entity.DigSessionEntity copy$default(com.corsair.ledger.data.local.entity.DigSessionEntity digSessionEntity, int i, java.lang.String str, long j, int i2, java.lang.String str2, boolean z, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = digSessionEntity.id;
        }
        if ((i3 & 2) != 0) {
            str = digSessionEntity.islandId;
        }
        if ((i3 & 4) != 0) {
            j = digSessionEntity.seed;
        }
        if ((i3 & 8) != 0) {
            i2 = digSessionEntity.movesLeft;
        }
        if ((i3 & 16) != 0) {
            str2 = digSessionEntity.revealedCsv;
        }
        if ((i3 & 32) != 0) {
            z = digSessionEntity.finished;
        }
        boolean z2 = z;
        int i4 = i2;
        long j2 = j;
        return digSessionEntity.copy(i, str, j2, i4, str2, z2);
    }

    public final int component1() {
        return this.id;
    }

    public final java.lang.String component2() {
        return this.islandId;
    }

    public final long component3() {
        return this.seed;
    }

    public final int component4() {
        return this.movesLeft;
    }

    public final java.lang.String component5() {
        return this.revealedCsv;
    }

    public final boolean component6() {
        return this.finished;
    }

    public final com.corsair.ledger.data.local.entity.DigSessionEntity copy(int i, java.lang.String str, long j, int i2, java.lang.String str2, boolean z) {
        str.getClass();
        str2.getClass();
        return new com.corsair.ledger.data.local.entity.DigSessionEntity(i, str, j, i2, str2, z);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.corsair.ledger.data.local.entity.DigSessionEntity)) {
            return false;
        }
        com.corsair.ledger.data.local.entity.DigSessionEntity digSessionEntity = (com.corsair.ledger.data.local.entity.DigSessionEntity) obj;
        return this.id == digSessionEntity.id && defpackage.x70.QoRHpC4k(this.islandId, digSessionEntity.islandId) && this.seed == digSessionEntity.seed && this.movesLeft == digSessionEntity.movesLeft && defpackage.x70.QoRHpC4k(this.revealedCsv, digSessionEntity.revealedCsv) && this.finished == digSessionEntity.finished;
    }

    public final boolean getFinished() {
        return this.finished;
    }

    public final int getId() {
        return this.id;
    }

    public final java.lang.String getIslandId() {
        return this.islandId;
    }

    public final int getMovesLeft() {
        return this.movesLeft;
    }

    public final java.lang.String getRevealedCsv() {
        return this.revealedCsv;
    }

    public final long getSeed() {
        return this.seed;
    }

    public int hashCode() {
        return java.lang.Boolean.hashCode(this.finished) + defpackage.fx0.F7NU4MC0GW(defpackage.fx0.oh6vYeIP(this.movesLeft, defpackage.fx0.r1MBDhnF(defpackage.fx0.F7NU4MC0GW(java.lang.Integer.hashCode(this.id) * 31, 31, this.islandId), 31, this.seed), 31), 31, this.revealedCsv);
    }

    public java.lang.String toString() {
        return "DigSessionEntity(id=" + this.id + ", islandId=" + this.islandId + ", seed=" + this.seed + ", movesLeft=" + this.movesLeft + ", revealedCsv=" + this.revealedCsv + ", finished=" + this.finished + ")";
    }

    public static final class Companion {
        public /* synthetic */ Companion(defpackage.jm jmVar) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ DigSessionEntity(int i, java.lang.String str, long j, int i2, java.lang.String str2, boolean z, int i3, defpackage.jm jmVar) {
        this((i3 & 1) != 0 ? 0 : i, str, j, i2, str2, z);
    }
}

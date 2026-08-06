package com.corsair.ledger.data.local.entity;

/* loaded from: classes.dex */
public final class PlayerEntity {
    public static final int $stable = 0;
    public static final com.corsair.ledger.data.local.entity.PlayerEntity.Companion Companion = new com.corsair.ledger.data.local.entity.PlayerEntity.Companion(null);
    public static final int SINGLETON_ID = 0;
    private final int cellsDug;
    private final int craftCount;
    private final int cursedHits;
    private final int doubloons;
    private final int duplicatesSold;
    private final long energyAnchorMs;
    private final int id;
    private final long lastChestMs;
    private final int legendariesFound;
    private final int peakDoubloons;
    private final int relicsFound;
    private final int storedEnergy;
    private final int tradeCount;
    private final boolean victorySeen;

    public /* synthetic */ PlayerEntity(int i, int i2, int i3, long j, long j2, boolean z, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, defpackage.jm jmVar) {
        this((i12 & 1) != 0 ? 0 : i, i2, i3, j, j2, z, i4, i5, i6, i7, i8, i9, i10, i11);
    }

    public final int component1() {
        return this.id;
    }

    public final int component10() {
        return this.craftCount;
    }

    public final int component11() {
        return this.cursedHits;
    }

    public final int component12() {
        return this.tradeCount;
    }

    public final int component13() {
        return this.duplicatesSold;
    }

    public final int component14() {
        return this.peakDoubloons;
    }

    public final int component2() {
        return this.doubloons;
    }

    public final int component3() {
        return this.storedEnergy;
    }

    public final long component4() {
        return this.energyAnchorMs;
    }

    public final long component5() {
        return this.lastChestMs;
    }

    public final boolean component6() {
        return this.victorySeen;
    }

    public final int component7() {
        return this.cellsDug;
    }

    public final int component8() {
        return this.relicsFound;
    }

    public final int component9() {
        return this.legendariesFound;
    }

    public final com.corsair.ledger.data.local.entity.PlayerEntity copy(int i, int i2, int i3, long j, long j2, boolean z, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        return new com.corsair.ledger.data.local.entity.PlayerEntity(i, i2, i3, j, j2, z, i4, i5, i6, i7, i8, i9, i10, i11);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.corsair.ledger.data.local.entity.PlayerEntity)) {
            return false;
        }
        com.corsair.ledger.data.local.entity.PlayerEntity playerEntity = (com.corsair.ledger.data.local.entity.PlayerEntity) obj;
        return this.id == playerEntity.id && this.doubloons == playerEntity.doubloons && this.storedEnergy == playerEntity.storedEnergy && this.energyAnchorMs == playerEntity.energyAnchorMs && this.lastChestMs == playerEntity.lastChestMs && this.victorySeen == playerEntity.victorySeen && this.cellsDug == playerEntity.cellsDug && this.relicsFound == playerEntity.relicsFound && this.legendariesFound == playerEntity.legendariesFound && this.craftCount == playerEntity.craftCount && this.cursedHits == playerEntity.cursedHits && this.tradeCount == playerEntity.tradeCount && this.duplicatesSold == playerEntity.duplicatesSold && this.peakDoubloons == playerEntity.peakDoubloons;
    }

    public final int getCellsDug() {
        return this.cellsDug;
    }

    public final int getCraftCount() {
        return this.craftCount;
    }

    public final int getCursedHits() {
        return this.cursedHits;
    }

    public final int getDoubloons() {
        return this.doubloons;
    }

    public final int getDuplicatesSold() {
        return this.duplicatesSold;
    }

    public final long getEnergyAnchorMs() {
        return this.energyAnchorMs;
    }

    public final int getId() {
        return this.id;
    }

    public final long getLastChestMs() {
        return this.lastChestMs;
    }

    public final int getLegendariesFound() {
        return this.legendariesFound;
    }

    public final int getPeakDoubloons() {
        return this.peakDoubloons;
    }

    public final int getRelicsFound() {
        return this.relicsFound;
    }

    public final int getStoredEnergy() {
        return this.storedEnergy;
    }

    public final int getTradeCount() {
        return this.tradeCount;
    }

    public final boolean getVictorySeen() {
        return this.victorySeen;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.peakDoubloons) + defpackage.fx0.oh6vYeIP(this.duplicatesSold, defpackage.fx0.oh6vYeIP(this.tradeCount, defpackage.fx0.oh6vYeIP(this.cursedHits, defpackage.fx0.oh6vYeIP(this.craftCount, defpackage.fx0.oh6vYeIP(this.legendariesFound, defpackage.fx0.oh6vYeIP(this.relicsFound, defpackage.fx0.oh6vYeIP(this.cellsDug, defpackage.fx0.adDC3e2L(defpackage.fx0.r1MBDhnF(defpackage.fx0.r1MBDhnF(defpackage.fx0.oh6vYeIP(this.storedEnergy, defpackage.fx0.oh6vYeIP(this.doubloons, java.lang.Integer.hashCode(this.id) * 31, 31), 31), 31, this.energyAnchorMs), 31, this.lastChestMs), 31, this.victorySeen), 31), 31), 31), 31), 31), 31), 31);
    }

    public java.lang.String toString() {
        int i = this.id;
        int i2 = this.doubloons;
        int i3 = this.storedEnergy;
        long j = this.energyAnchorMs;
        long j2 = this.lastChestMs;
        boolean z = this.victorySeen;
        int i4 = this.cellsDug;
        int i5 = this.relicsFound;
        int i6 = this.legendariesFound;
        int i7 = this.craftCount;
        int i8 = this.cursedHits;
        int i9 = this.tradeCount;
        int i10 = this.duplicatesSold;
        int i11 = this.peakDoubloons;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PlayerEntity(id=");
        sb.append(i);
        sb.append(", doubloons=");
        sb.append(i2);
        sb.append(", storedEnergy=");
        sb.append(i3);
        sb.append(", energyAnchorMs=");
        sb.append(j);
        sb.append(", lastChestMs=");
        sb.append(j2);
        sb.append(", victorySeen=");
        sb.append(z);
        sb.append(", cellsDug=");
        sb.append(i4);
        sb.append(", relicsFound=");
        defpackage.fx0.EgCjBq0SZwJ(sb, i5, ", legendariesFound=", i6, ", craftCount=");
        defpackage.fx0.EgCjBq0SZwJ(sb, i7, ", cursedHits=", i8, ", tradeCount=");
        defpackage.fx0.EgCjBq0SZwJ(sb, i9, ", duplicatesSold=", i10, ", peakDoubloons=");
        sb.append(i11);
        sb.append(")");
        return sb.toString();
    }

    public static final class Companion {
        public /* synthetic */ Companion(defpackage.jm jmVar) {
            this();
        }

        private Companion() {
        }
    }

    public PlayerEntity(int i, int i2, int i3, long j, long j2, boolean z, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        this.id = i;
        this.doubloons = i2;
        this.storedEnergy = i3;
        this.energyAnchorMs = j;
        this.lastChestMs = j2;
        this.victorySeen = z;
        this.cellsDug = i4;
        this.relicsFound = i5;
        this.legendariesFound = i6;
        this.craftCount = i7;
        this.cursedHits = i8;
        this.tradeCount = i9;
        this.duplicatesSold = i10;
        this.peakDoubloons = i11;
    }
}

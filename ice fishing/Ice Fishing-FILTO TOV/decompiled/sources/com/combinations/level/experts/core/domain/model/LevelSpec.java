package com.combinations.level.experts.core.domain.model;

import defpackage.mr0;
import defpackage.o30;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class LevelSpec {
    public static final int $stable = 0;
    private final int height;
    private final int index;
    private final Sector sector;
    private final long seed;
    private final int width;

    public LevelSpec(int i, Sector sector, int i2, int i3, long j) {
        sector.getClass();
        this.index = i;
        this.sector = sector;
        this.width = i2;
        this.height = i3;
        this.seed = j;
    }

    public static /* synthetic */ LevelSpec copy$default(LevelSpec levelSpec, int i, Sector sector, int i2, int i3, long j, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = levelSpec.index;
        }
        if ((i4 & 2) != 0) {
            sector = levelSpec.sector;
        }
        if ((i4 & 4) != 0) {
            i2 = levelSpec.width;
        }
        if ((i4 & 8) != 0) {
            i3 = levelSpec.height;
        }
        if ((i4 & 16) != 0) {
            j = levelSpec.seed;
        }
        long j2 = j;
        return levelSpec.copy(i, sector, i2, i3, j2);
    }

    public final int component1() {
        return this.index;
    }

    public final Sector component2() {
        return this.sector;
    }

    public final int component3() {
        return this.width;
    }

    public final int component4() {
        return this.height;
    }

    public final long component5() {
        return this.seed;
    }

    public final LevelSpec copy(int i, Sector sector, int i2, int i3, long j) {
        sector.getClass();
        return new LevelSpec(i, sector, i2, i3, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LevelSpec)) {
            return false;
        }
        LevelSpec levelSpec = (LevelSpec) obj;
        return this.index == levelSpec.index && o30.rQPn8YBR(this.sector, levelSpec.sector) && this.width == levelSpec.width && this.height == levelSpec.height && this.seed == levelSpec.seed;
    }

    public final int getDisplayNumber() {
        return this.index + 1;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getIndex() {
        return this.index;
    }

    public final Sector getSector() {
        return this.sector;
    }

    public final long getSeed() {
        return this.seed;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Long.hashCode(this.seed) + mr0.Yi7zF1RB1(this.height, mr0.Yi7zF1RB1(this.width, (this.sector.hashCode() + (Integer.hashCode(this.index) * 31)) * 31, 31), 31);
    }

    public String toString() {
        return "LevelSpec(index=" + this.index + ", sector=" + this.sector + ", width=" + this.width + ", height=" + this.height + ", seed=" + this.seed + ")";
    }
}

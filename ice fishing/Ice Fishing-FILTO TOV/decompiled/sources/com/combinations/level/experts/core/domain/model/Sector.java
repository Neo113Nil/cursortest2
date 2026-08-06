package com.combinations.level.experts.core.domain.model;

import defpackage.mr0;
import defpackage.o30;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class Sector {
    public static final int $stable = 0;
    private final int firstLevel;
    private final int id;
    private final int largestGrid;
    private final int levelCount;
    private final String name;
    private final int smallestGrid;

    public Sector(int i, String str, int i2, int i3, int i4, int i5) {
        str.getClass();
        this.id = i;
        this.name = str;
        this.firstLevel = i2;
        this.levelCount = i3;
        this.smallestGrid = i4;
        this.largestGrid = i5;
    }

    public static /* synthetic */ Sector copy$default(Sector sector, int i, String str, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = sector.id;
        }
        if ((i6 & 2) != 0) {
            str = sector.name;
        }
        if ((i6 & 4) != 0) {
            i2 = sector.firstLevel;
        }
        if ((i6 & 8) != 0) {
            i3 = sector.levelCount;
        }
        if ((i6 & 16) != 0) {
            i4 = sector.smallestGrid;
        }
        if ((i6 & 32) != 0) {
            i5 = sector.largestGrid;
        }
        int i7 = i4;
        int i8 = i5;
        return sector.copy(i, str, i2, i3, i7, i8);
    }

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final int component3() {
        return this.firstLevel;
    }

    public final int component4() {
        return this.levelCount;
    }

    public final int component5() {
        return this.smallestGrid;
    }

    public final int component6() {
        return this.largestGrid;
    }

    public final boolean contains(int i) {
        return i <= getLastLevel() && this.firstLevel <= i;
    }

    public final Sector copy(int i, String str, int i2, int i3, int i4, int i5) {
        str.getClass();
        return new Sector(i, str, i2, i3, i4, i5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Sector)) {
            return false;
        }
        Sector sector = (Sector) obj;
        return this.id == sector.id && o30.rQPn8YBR(this.name, sector.name) && this.firstLevel == sector.firstLevel && this.levelCount == sector.levelCount && this.smallestGrid == sector.smallestGrid && this.largestGrid == sector.largestGrid;
    }

    public final int getFirstLevel() {
        return this.firstLevel;
    }

    public final int getId() {
        return this.id;
    }

    public final int getLargestGrid() {
        return this.largestGrid;
    }

    public final int getLastLevel() {
        return (this.firstLevel + this.levelCount) - 1;
    }

    public final int getLevelCount() {
        return this.levelCount;
    }

    public final String getName() {
        return this.name;
    }

    public final int getSmallestGrid() {
        return this.smallestGrid;
    }

    public int hashCode() {
        return Integer.hashCode(this.largestGrid) + mr0.Yi7zF1RB1(this.smallestGrid, mr0.Yi7zF1RB1(this.levelCount, mr0.Yi7zF1RB1(this.firstLevel, (this.name.hashCode() + (Integer.hashCode(this.id) * 31)) * 31, 31), 31), 31);
    }

    public String toString() {
        return "Sector(id=" + this.id + ", name=" + this.name + ", firstLevel=" + this.firstLevel + ", levelCount=" + this.levelCount + ", smallestGrid=" + this.smallestGrid + ", largestGrid=" + this.largestGrid + ")";
    }
}

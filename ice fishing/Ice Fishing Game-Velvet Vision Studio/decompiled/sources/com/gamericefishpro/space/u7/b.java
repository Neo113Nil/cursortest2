package com.gamericefishpro.space.u7;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements com.gamericefishpro.space.b7.a {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public b(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + com.gamericefishpro.space.m5.a.t(this.d, com.gamericefishpro.space.m5.a.t(this.c, com.gamericefishpro.space.m5.a.t(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "StatisticsUiState(totalLevelsCompleted=" + this.a + ", totalStars=" + this.b + ", totalCoins=" + this.c + ", highestLevel=" + this.d + ", threeStarLevels=" + this.e + ")";
    }
}

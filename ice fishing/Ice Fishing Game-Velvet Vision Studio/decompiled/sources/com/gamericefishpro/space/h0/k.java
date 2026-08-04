package com.gamericefishpro.space.h0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    public final int a;
    public final int b;

    public k(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (!(i >= 0)) {
            com.gamericefishpro.space.c0.a.a("negative start index");
        }
        if (i2 >= i) {
            return;
        }
        com.gamericefishpro.space.c0.a.a("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.a == kVar.a && this.b == kVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Interval(start=");
        sb.append(this.a);
        sb.append(", end=");
        return com.gamericefishpro.space.m5.a.i(sb, this.b, ')');
    }
}

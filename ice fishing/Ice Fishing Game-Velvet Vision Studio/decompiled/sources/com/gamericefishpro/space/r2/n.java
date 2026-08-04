package com.gamericefishpro.space.r2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class n {
    public final com.gamericefishpro.space.y2.c a;
    public final int b;
    public final int c;

    public n(com.gamericefishpro.space.y2.c cVar, int i, int i2) {
        this.a = cVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.a.equals(nVar.a) && this.b == nVar.b && this.c == nVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + com.gamericefishpro.space.m5.a.t(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        return com.gamericefishpro.space.m5.a.i(sb, this.c, ')');
    }
}

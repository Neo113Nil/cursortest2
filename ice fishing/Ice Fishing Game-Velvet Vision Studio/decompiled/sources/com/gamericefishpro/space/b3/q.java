package com.gamericefishpro.space.b3;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class q {
    public static final q c = new q(com.gamericefishpro.space.hj.c.C(0), com.gamericefishpro.space.hj.c.C(0));
    public final long a;
    public final long b;

    public q(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return com.gamericefishpro.space.c3.n.a(this.a, qVar.a) && com.gamericefishpro.space.c3.n.a(this.b, qVar.b);
    }

    public final int hashCode() {
        com.gamericefishpro.space.c3.o[] oVarArr = com.gamericefishpro.space.c3.n.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) com.gamericefishpro.space.c3.n.d(this.a)) + ", restLine=" + ((Object) com.gamericefishpro.space.c3.n.d(this.b)) + ')';
    }
}

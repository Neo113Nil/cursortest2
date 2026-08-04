package com.gamericefishpro.space.r2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {
    public static final long b = a0.b(0, 0);
    public static final /* synthetic */ int c = 0;
    public final long a;

    public final boolean equals(Object obj) {
        if (obj instanceof h0) {
            return this.a == ((h0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextRange(");
        long j = this.a;
        sb.append((int) (j >> 32));
        sb.append(", ");
        return com.gamericefishpro.space.m5.a.i(sb, (int) (j & 4294967295L), ')');
    }
}

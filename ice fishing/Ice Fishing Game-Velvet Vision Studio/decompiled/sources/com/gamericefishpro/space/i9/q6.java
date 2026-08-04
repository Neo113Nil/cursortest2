package com.gamericefishpro.space.i9;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class q6 extends s6 {
    @Override // com.gamericefishpro.space.i9.s6
    public final void a(Object obj, long j, byte b) {
        if (t6.g) {
            t6.c(obj, j, b);
        } else {
            t6.d(obj, j, b);
        }
    }

    @Override // com.gamericefishpro.space.i9.s6
    public final boolean b(long j, Object obj) {
        return t6.g ? t6.n(j, obj) : t6.o(j, obj);
    }

    @Override // com.gamericefishpro.space.i9.s6
    public final void c(Object obj, long j, boolean z) {
        if (t6.g) {
            t6.c(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            t6.d(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.gamericefishpro.space.i9.s6
    public final float d(long j, Object obj) {
        return Float.intBitsToFloat(this.a.getInt(obj, j));
    }

    @Override // com.gamericefishpro.space.i9.s6
    public final void e(Object obj, long j, float f) {
        this.a.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.gamericefishpro.space.i9.s6
    public final double f(long j, Object obj) {
        return Double.longBitsToDouble(this.a.getLong(obj, j));
    }

    @Override // com.gamericefishpro.space.i9.s6
    public final void g(Object obj, long j, double d) {
        this.a.putLong(obj, j, Double.doubleToLongBits(d));
    }
}

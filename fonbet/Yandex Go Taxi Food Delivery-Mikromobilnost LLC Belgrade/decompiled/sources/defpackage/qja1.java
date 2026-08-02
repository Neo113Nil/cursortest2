package defpackage;

/* loaded from: classes.dex */
public final class qja1 extends xja1 {
    @Override // defpackage.xja1
    public final double a(long j, Object obj) {
        return Double.longBitsToDouble(this.a.getLong(obj, j));
    }

    @Override // defpackage.xja1
    public final float c(long j, Object obj) {
        return Float.intBitsToFloat(this.a.getInt(obj, j));
    }

    @Override // defpackage.xja1
    public final void e(Object obj, long j, boolean z) {
        if (eka1.g) {
            eka1.c(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            eka1.d(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.xja1
    public final void g(Object obj, long j, byte b) {
        if (eka1.g) {
            eka1.c(obj, j, b);
        } else {
            eka1.d(obj, j, b);
        }
    }

    @Override // defpackage.xja1
    public final void h(Object obj, long j, double d) {
        this.a.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.xja1
    public final void k(Object obj, long j, float f) {
        this.a.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.xja1
    public final boolean m(long j, Object obj) {
        return eka1.g ? eka1.m(j, obj) : eka1.n(j, obj);
    }
}

package defpackage;

/* loaded from: classes.dex */
public final class xnx extends wex {
    @Override // defpackage.wex
    public final double a(long j, Object obj) {
        return Double.longBitsToDouble(this.a.getLong(obj, j));
    }

    @Override // defpackage.wex
    public final float b(long j, Object obj) {
        return Float.intBitsToFloat(this.a.getInt(obj, j));
    }

    @Override // defpackage.wex
    public final void c(Object obj, long j, boolean z) {
        if (ynx.g) {
            ynx.c(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            ynx.d(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.wex
    public final void d(Object obj, long j, byte b) {
        if (ynx.g) {
            ynx.c(obj, j, b);
        } else {
            ynx.d(obj, j, b);
        }
    }

    @Override // defpackage.wex
    public final void e(Object obj, long j, double d) {
        this.a.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.wex
    public final void f(Object obj, long j, float f) {
        this.a.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.wex
    public final boolean g(long j, Object obj) {
        return ynx.g ? ynx.m(j, obj) : ynx.n(j, obj);
    }
}

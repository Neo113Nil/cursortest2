package defpackage;

import sun.misc.Unsafe;

/* loaded from: classes11.dex */
public final class w9b1 extends xja1 {
    public w9b1(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // defpackage.xja1
    public final void b(Object obj, long j, byte b) {
        if (jab1.g) {
            jab1.c(obj, j, b);
        } else {
            jab1.d(obj, j, b);
        }
    }

    @Override // defpackage.xja1
    public final boolean d(long j, Object obj) {
        return jab1.g ? jab1.n(j, obj) : jab1.o(j, obj);
    }

    @Override // defpackage.xja1
    public final void e(Object obj, long j, boolean z) {
        if (jab1.g) {
            jab1.c(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            jab1.d(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.xja1
    public final float f(long j, Object obj) {
        return Float.intBitsToFloat(this.a.getInt(obj, j));
    }

    @Override // defpackage.xja1
    public final void i(Object obj, long j, float f) {
        this.a.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.xja1
    public final double j(long j, Object obj) {
        return Double.longBitsToDouble(this.a.getLong(obj, j));
    }

    @Override // defpackage.xja1
    public final void l(Object obj, long j, double d) {
        this.a.putLong(obj, j, Double.doubleToLongBits(d));
    }
}

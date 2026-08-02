package defpackage;

/* loaded from: classes.dex */
public final class r321 extends x321 {
    @Override // defpackage.x321
    public final boolean c(long j, Object obj) {
        return a421.g ? a421.b(j, obj) : a421.c(j, obj);
    }

    @Override // defpackage.x321
    public final double d(long j, Object obj) {
        return Double.longBitsToDouble(g(j, obj));
    }

    @Override // defpackage.x321
    public final float e(long j, Object obj) {
        return Float.intBitsToFloat(f(j, obj));
    }

    @Override // defpackage.x321
    public final void j(Object obj, long j, boolean z) {
        if (a421.g) {
            a421.k(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            a421.l(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.x321
    public final void k(Object obj, long j, byte b) {
        if (a421.g) {
            a421.k(obj, j, b);
        } else {
            a421.l(obj, j, b);
        }
    }

    @Override // defpackage.x321
    public final void l(Object obj, long j, double d) {
        o(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.x321
    public final void m(Object obj, long j, float f) {
        n(j, obj, Float.floatToIntBits(f));
    }

    @Override // defpackage.x321
    public final boolean r() {
        return false;
    }
}

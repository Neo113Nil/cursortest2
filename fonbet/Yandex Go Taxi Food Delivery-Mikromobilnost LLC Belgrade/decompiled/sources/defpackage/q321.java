package defpackage;

/* loaded from: classes.dex */
public final class q321 extends w321 {
    @Override // defpackage.w321
    public final void c(long j, byte[] bArr, long j2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.w321
    public final boolean d(long j, Object obj) {
        return z321.h ? z321.h(j, obj) != 0 : z321.i(j, obj) != 0;
    }

    @Override // defpackage.w321
    public final byte e(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.w321
    public final byte f(long j, Object obj) {
        return z321.h ? z321.h(j, obj) : z321.i(j, obj);
    }

    @Override // defpackage.w321
    public final double g(long j, Object obj) {
        return Double.longBitsToDouble(j(j, obj));
    }

    @Override // defpackage.w321
    public final float h(long j, Object obj) {
        return Float.intBitsToFloat(i(j, obj));
    }

    @Override // defpackage.w321
    public final void m(Object obj, long j, boolean z) {
        if (z321.h) {
            z321.l(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            z321.m(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.w321
    public final void n(Object obj, long j, byte b) {
        if (z321.h) {
            z321.l(obj, j, b);
        } else {
            z321.m(obj, j, b);
        }
    }

    @Override // defpackage.w321
    public final void o(Object obj, long j, double d) {
        r(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.w321
    public final void p(Object obj, long j, float f) {
        q(j, obj, Float.floatToIntBits(f));
    }

    @Override // defpackage.w321
    public final boolean u() {
        return false;
    }
}

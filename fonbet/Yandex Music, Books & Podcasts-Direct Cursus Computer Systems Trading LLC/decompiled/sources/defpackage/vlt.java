package defpackage;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class vlt extends bmt {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vlt(Unsafe unsafe, int i) {
        super(unsafe);
        this.b = i;
    }

    @Override // defpackage.bmt
    public final boolean c(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (!emt.g) {
                    break;
                } else {
                    break;
                }
            default:
                if (!emt.g) {
                    break;
                } else {
                    break;
                }
        }
        return emt.c(j, obj);
    }

    @Override // defpackage.bmt
    public final double d(long j, Object obj) {
        switch (this.b) {
        }
        return Double.longBitsToDouble(g(j, obj));
    }

    @Override // defpackage.bmt
    public final float e(long j, Object obj) {
        switch (this.b) {
        }
        return Float.intBitsToFloat(f(j, obj));
    }

    @Override // defpackage.bmt
    public final void j(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (!emt.g) {
                    emt.l(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    emt.k(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!emt.g) {
                    emt.l(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    emt.k(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // defpackage.bmt
    public final void k(Object obj, long j, byte b) {
        switch (this.b) {
            case 0:
                if (!emt.g) {
                    emt.l(obj, j, b);
                    break;
                } else {
                    emt.k(obj, j, b);
                    break;
                }
            default:
                if (!emt.g) {
                    emt.l(obj, j, b);
                    break;
                } else {
                    emt.k(obj, j, b);
                    break;
                }
        }
    }

    @Override // defpackage.bmt
    public final void l(Object obj, long j, double d) {
        switch (this.b) {
            case 0:
                o(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                o(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // defpackage.bmt
    public final void m(Object obj, long j, float f) {
        switch (this.b) {
            case 0:
                n(j, obj, Float.floatToIntBits(f));
                break;
            default:
                n(j, obj, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // defpackage.bmt
    public final boolean r() {
        switch (this.b) {
        }
        return false;
    }
}

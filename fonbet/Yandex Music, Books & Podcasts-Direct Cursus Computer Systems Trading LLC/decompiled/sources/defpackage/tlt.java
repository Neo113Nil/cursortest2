package defpackage;

import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public final class tlt extends zlt {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tlt(Unsafe unsafe, int i) {
        super(unsafe);
        this.b = i;
    }

    @Override // defpackage.zlt
    public final boolean c(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (cmt.h) {
                    if (cmt.g(j, obj) == 0) {
                    }
                } else if (cmt.h(j, obj) == 0) {
                }
                break;
            default:
                if (cmt.h) {
                    if (cmt.g(j, obj) == 0) {
                    }
                } else if (cmt.h(j, obj) == 0) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.zlt
    public final byte d(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (!cmt.h) {
                    break;
                } else {
                    break;
                }
            default:
                if (!cmt.h) {
                    break;
                } else {
                    break;
                }
        }
        return cmt.h(j, obj);
    }

    @Override // defpackage.zlt
    public final double e(long j, Object obj) {
        switch (this.b) {
        }
        return Double.longBitsToDouble(h(j, obj));
    }

    @Override // defpackage.zlt
    public final float f(long j, Object obj) {
        switch (this.b) {
        }
        return Float.intBitsToFloat(g(j, obj));
    }

    @Override // defpackage.zlt
    public final void k(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (!cmt.h) {
                    cmt.l(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    cmt.k(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!cmt.h) {
                    cmt.l(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    cmt.k(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // defpackage.zlt
    public final void l(Object obj, long j, byte b) {
        switch (this.b) {
            case 0:
                if (!cmt.h) {
                    cmt.l(obj, j, b);
                    break;
                } else {
                    cmt.k(obj, j, b);
                    break;
                }
            default:
                if (!cmt.h) {
                    cmt.l(obj, j, b);
                    break;
                } else {
                    cmt.k(obj, j, b);
                    break;
                }
        }
    }

    @Override // defpackage.zlt
    public final void m(Object obj, long j, double d) {
        switch (this.b) {
            case 0:
                p(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                p(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // defpackage.zlt
    public final void n(Object obj, long j, float f) {
        switch (this.b) {
            case 0:
                o(j, obj, Float.floatToIntBits(f));
                break;
            default:
                o(j, obj, Float.floatToIntBits(f));
                break;
        }
    }
}

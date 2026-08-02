package defpackage;

import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public final class ult extends amt {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ult(Unsafe unsafe, int i) {
        super(unsafe);
        this.b = i;
    }

    @Override // defpackage.amt
    public final void c(long j, byte[] bArr, long j2) {
        switch (this.b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.amt
    public final boolean d(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (dmt.h) {
                    if (dmt.h(j, obj) == 0) {
                    }
                } else if (dmt.i(j, obj) == 0) {
                }
                break;
            default:
                if (dmt.h) {
                    if (dmt.h(j, obj) == 0) {
                    }
                } else if (dmt.i(j, obj) == 0) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.amt
    public final byte e(long j) {
        switch (this.b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.amt
    public final byte f(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (!dmt.h) {
                    break;
                } else {
                    break;
                }
            default:
                if (!dmt.h) {
                    break;
                } else {
                    break;
                }
        }
        return dmt.i(j, obj);
    }

    @Override // defpackage.amt
    public final double g(long j, Object obj) {
        switch (this.b) {
        }
        return Double.longBitsToDouble(j(j, obj));
    }

    @Override // defpackage.amt
    public final float h(long j, Object obj) {
        switch (this.b) {
        }
        return Float.intBitsToFloat(i(j, obj));
    }

    @Override // defpackage.amt
    public final void m(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (!dmt.h) {
                    dmt.m(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    dmt.l(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!dmt.h) {
                    dmt.m(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    dmt.l(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // defpackage.amt
    public final void n(Object obj, long j, byte b) {
        switch (this.b) {
            case 0:
                if (!dmt.h) {
                    dmt.m(obj, j, b);
                    break;
                } else {
                    dmt.l(obj, j, b);
                    break;
                }
            default:
                if (!dmt.h) {
                    dmt.m(obj, j, b);
                    break;
                } else {
                    dmt.l(obj, j, b);
                    break;
                }
        }
    }

    @Override // defpackage.amt
    public final void o(Object obj, long j, double d) {
        switch (this.b) {
            case 0:
                r(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                r(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // defpackage.amt
    public final void p(Object obj, long j, float f) {
        switch (this.b) {
            case 0:
                q(j, obj, Float.floatToIntBits(f));
                break;
            default:
                q(j, obj, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // defpackage.amt
    public final boolean u() {
        switch (this.b) {
        }
        return false;
    }
}

package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class tc1 extends vc1 {
    public final /* synthetic */ int Yi7zF1RB1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tc1(Unsafe unsafe, int i) {
        super(unsafe);
        this.Yi7zF1RB1 = i;
    }

    @Override // defpackage.vc1
    public final void E7jCp8Ls(Object obj, long j, double d) {
        switch (this.Yi7zF1RB1) {
            case 0:
                iwATDS1i01k(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                iwATDS1i01k(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // defpackage.vc1
    public final void JFJ3QoxA(Object obj, long j, boolean z) {
        switch (this.Yi7zF1RB1) {
            case 0:
                if (!wc1.AvO7iQsrTN) {
                    wc1.E7jCp8Ls(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    wc1.rQPn8YBR(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!wc1.AvO7iQsrTN) {
                    wc1.E7jCp8Ls(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    wc1.rQPn8YBR(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // defpackage.vc1
    public final boolean Mjvvu5DE() {
        switch (this.Yi7zF1RB1) {
        }
        return false;
    }

    @Override // defpackage.vc1
    public final float OOA6hdeuvCS(long j, Object obj) {
        switch (this.Yi7zF1RB1) {
        }
        return Float.intBitsToFloat(EljAMC1QTz(j, obj));
    }

    @Override // defpackage.vc1
    public final boolean X1lG3V04pd(long j, Object obj) {
        switch (this.Yi7zF1RB1) {
            case 0:
                if (!wc1.AvO7iQsrTN) {
                    break;
                } else {
                    break;
                }
            default:
                if (!wc1.AvO7iQsrTN) {
                    break;
                } else {
                    break;
                }
        }
        return wc1.X1lG3V04pd(j, obj);
    }

    @Override // defpackage.vc1
    public final void XnEVoBF0td1l(Object obj, long j, float f) {
        switch (this.Yi7zF1RB1) {
            case 0:
                uFEq9NpZ(obj, j, Float.floatToIntBits(f));
                break;
            default:
                uFEq9NpZ(obj, j, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // defpackage.vc1
    public final void rQPn8YBR(Object obj, long j, byte b) {
        switch (this.Yi7zF1RB1) {
            case 0:
                if (!wc1.AvO7iQsrTN) {
                    wc1.E7jCp8Ls(obj, j, b);
                    break;
                } else {
                    wc1.rQPn8YBR(obj, j, b);
                    break;
                }
            default:
                if (!wc1.AvO7iQsrTN) {
                    wc1.E7jCp8Ls(obj, j, b);
                    break;
                } else {
                    wc1.rQPn8YBR(obj, j, b);
                    break;
                }
        }
    }

    @Override // defpackage.vc1
    public final double xqGvceK5x(long j, Object obj) {
        switch (this.Yi7zF1RB1) {
        }
        return Double.longBitsToDouble(AvO7iQsrTN(j, obj));
    }
}

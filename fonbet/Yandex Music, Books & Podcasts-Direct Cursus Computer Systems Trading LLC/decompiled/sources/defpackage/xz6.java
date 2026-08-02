package defpackage;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class xz6 extends s0 implements y0 {
    public static final y b = new y(3, xz6.class);
    public final byte[] a;

    public xz6(String str) {
        this.a = fxf.Z(str);
    }

    public static xz6 B(Object obj) {
        if (obj == null || (obj instanceof xz6)) {
            return (xz6) obj;
        }
        if (obj instanceof d0) {
            s0 n = ((d0) obj).n();
            if (n instanceof xz6) {
                return (xz6) n;
            }
        }
        if (!(obj instanceof byte[])) {
            xq0.x("illegal object in getInstance: ".concat(obj.getClass().getName()));
            return null;
        }
        try {
            return (xz6) b.c((byte[]) obj);
        } catch (Exception e) {
            tiu.h(e, "encoding error in getInstance: ");
            return null;
        }
    }

    @Override // defpackage.s0, defpackage.k0
    public final int hashCode() {
        return j66.e0(this.a);
    }

    @Override // defpackage.y0
    public final String o() {
        return fxf.B(this.a);
    }

    @Override // defpackage.s0
    public final boolean t(s0 s0Var) {
        if (s0Var instanceof xz6) {
            return Arrays.equals(this.a, ((xz6) s0Var).a);
        }
        return false;
    }

    public final String toString() {
        return fxf.B(this.a);
    }

    @Override // defpackage.s0
    public final void u(qxp qxpVar, boolean z) {
        qxpVar.v(22, z, this.a);
    }

    @Override // defpackage.s0
    public final boolean v() {
        return false;
    }

    @Override // defpackage.s0
    public final int w(boolean z) {
        return qxp.n(this.a.length, z);
    }

    public xz6(byte[] bArr) {
        this.a = bArr;
    }
}

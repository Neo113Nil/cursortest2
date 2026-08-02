package defpackage;

import java.util.Arrays;

/* loaded from: classes9.dex */
public final class wpf extends a3 implements p3 {
    public static final h2 b = new h2(0, wpf.class);
    public final byte[] a;

    public wpf(String str) {
        this.a = ruu0.b(str);
    }

    public static wpf p(Object obj) {
        if (obj == null || (obj instanceof wpf)) {
            return (wpf) obj;
        }
        if (obj instanceof z1) {
            a3 aSN1Primitive = ((z1) obj).toASN1Primitive();
            if (aSN1Primitive instanceof wpf) {
                return (wpf) aSN1Primitive;
            }
        }
        if (!(obj instanceof byte[])) {
            ny61.g(qv10.n(obj, "illegal object in getInstance: "));
            return null;
        }
        try {
            return (wpf) b.c((byte[]) obj);
        } catch (Exception e) {
            xfo.l(e);
            return null;
        }
    }

    @Override // defpackage.p3
    public final String f() {
        return ruu0.a(this.a);
    }

    @Override // defpackage.a3
    public final boolean h(a3 a3Var) {
        if (a3Var instanceof wpf) {
            return Arrays.equals(this.a, ((wpf) a3Var).a);
        }
        return false;
    }

    @Override // defpackage.a3, defpackage.n2
    public final int hashCode() {
        return ffx.T(this.a);
    }

    @Override // defpackage.a3
    public final void i(g191 g191Var, boolean z) {
        g191Var.Y(22, this.a, z);
    }

    @Override // defpackage.a3
    public final boolean j() {
        return false;
    }

    @Override // defpackage.a3
    public final int k(boolean z) {
        return g191.M(this.a.length, z);
    }

    public final String toString() {
        return ruu0.a(this.a);
    }

    public wpf(byte[] bArr) {
        this.a = bArr;
    }
}

package defpackage;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class xpf extends b3 implements q3 {
    public static final p1 b = new p1(8, xpf.class);
    public final byte[] a;

    public xpf(String str) {
        this.a = quu0.b(str);
    }

    public static xpf u(Object obj) {
        if (obj == null || (obj instanceof xpf)) {
            return (xpf) obj;
        }
        if (obj instanceof a2) {
            b3 aSN1Primitive = ((a2) obj).toASN1Primitive();
            if (aSN1Primitive instanceof xpf) {
                return (xpf) aSN1Primitive;
            }
        }
        if (!(obj instanceof byte[])) {
            ny61.g(qv10.n(obj, "illegal object in getInstance: "));
            return null;
        }
        try {
            return (xpf) b.Eg((byte[]) obj);
        } catch (Exception e) {
            xfo.l(e);
            return null;
        }
    }

    @Override // defpackage.q3
    public final String f() {
        return quu0.a(this.a);
    }

    @Override // defpackage.b3, defpackage.o2
    public final int hashCode() {
        return rza1.e(this.a);
    }

    @Override // defpackage.b3
    public final boolean m(b3 b3Var) {
        if (b3Var instanceof xpf) {
            return Arrays.equals(this.a, ((xpf) b3Var).a);
        }
        return false;
    }

    @Override // defpackage.b3
    public final void n(ryh ryhVar, boolean z) {
        ryhVar.I(22, this.a, z);
    }

    @Override // defpackage.b3
    public final boolean o() {
        return false;
    }

    @Override // defpackage.b3
    public final int p(boolean z) {
        return ryh.w(this.a.length, z);
    }

    public final String toString() {
        return quu0.a(this.a);
    }

    public xpf(byte[] bArr) {
        this.a = bArr;
    }
}

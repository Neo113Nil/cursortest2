package defpackage;

/* loaded from: classes5.dex */
public final class b0 extends s0 {
    public static final b0 b;
    public static final b0 c;
    public final byte a;

    static {
        new y(1, b0.class);
        b = new b0((byte) 0);
        c = new b0((byte) -1);
    }

    public b0(byte b2) {
        this.a = b2;
    }

    public static b0 B(byte[] bArr) {
        if (bArr.length == 1) {
            byte b2 = bArr[0];
            return b2 != -1 ? b2 != 0 ? new b0(b2) : b : c;
        }
        xq0.x("BOOLEAN value should have 1 byte in it");
        return null;
    }

    public final boolean D() {
        return this.a != 0;
    }

    @Override // defpackage.s0, defpackage.k0
    public final int hashCode() {
        return D() ? 1 : 0;
    }

    @Override // defpackage.s0
    public final boolean t(s0 s0Var) {
        return (s0Var instanceof b0) && D() == ((b0) s0Var).D();
    }

    public final String toString() {
        return D() ? "TRUE" : "FALSE";
    }

    @Override // defpackage.s0
    public final void u(qxp qxpVar, boolean z) {
        qxpVar.A(1, z);
        qxpVar.t(1);
        qxpVar.q(this.a);
    }

    @Override // defpackage.s0
    public final boolean v() {
        return false;
    }

    @Override // defpackage.s0
    public final int w(boolean z) {
        return qxp.n(1, z);
    }

    @Override // defpackage.s0
    public final s0 z() {
        return D() ? c : b;
    }
}

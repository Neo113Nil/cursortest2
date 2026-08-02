package defpackage;

/* loaded from: classes4.dex */
public final class v1 extends a3 {
    public static final q1 b = new q1(1, v1.class);
    public static final v1 c = new v1((byte) 0);
    public static final v1 w = new v1((byte) -1);
    public final byte a;

    public v1(byte b2) {
        this.a = b2;
    }

    public static v1 p(byte[] bArr) {
        if (bArr.length == 1) {
            byte b2 = bArr[0];
            return b2 != -1 ? b2 != 0 ? new v1(b2) : c : w;
        }
        ny61.g("BOOLEAN value should have 1 byte in it");
        return null;
    }

    @Override // defpackage.a3
    public final boolean h(a3 a3Var) {
        return (a3Var instanceof v1) && q() == ((v1) a3Var).q();
    }

    @Override // defpackage.a3, defpackage.n2
    public final int hashCode() {
        return q() ? 1 : 0;
    }

    @Override // defpackage.a3
    public final void i(g191 g191Var, boolean z) {
        g191Var.c0(1, z);
        g191Var.W(1);
        g191Var.U(this.a);
    }

    @Override // defpackage.a3
    public final boolean j() {
        return false;
    }

    @Override // defpackage.a3
    public final int k(boolean z) {
        return g191.M(1, z);
    }

    @Override // defpackage.a3
    public final a3 n() {
        return q() ? w : c;
    }

    public final boolean q() {
        return this.a != 0;
    }

    public final String toString() {
        return q() ? "TRUE" : "FALSE";
    }
}

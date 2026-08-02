package defpackage;

import java.io.IOException;

/* loaded from: classes4.dex */
public final class w1 extends b3 {
    public static final p1 b = new p1(2, w1.class);
    public static final w1 c = new w1((byte) 0);
    public static final w1 w = new w1((byte) -1);
    public final byte a;

    public w1(byte b2) {
        this.a = b2;
    }

    public static w1 u(byte[] bArr) {
        if (bArr.length == 1) {
            byte b2 = bArr[0];
            return b2 != -1 ? b2 != 0 ? new w1(b2) : c : w;
        }
        ny61.g("BOOLEAN value should have 1 byte in it");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static w1 x(a2 a2Var) {
        String concat;
        if (a2Var == 0 || (a2Var instanceof w1)) {
            return (w1) a2Var;
        }
        if (a2Var instanceof byte[]) {
            try {
                return (w1) b.Eg((byte[]) a2Var);
            } catch (IOException e) {
                concat = x4e.d(e, new StringBuilder("failed to construct boolean from byte[]: "));
            }
        } else {
            concat = "illegal object in getInstance: ".concat(a2Var.getClass().getName());
        }
        ny61.g(concat);
        return null;
    }

    @Override // defpackage.b3, defpackage.o2
    public final int hashCode() {
        return y() ? 1 : 0;
    }

    @Override // defpackage.b3
    public final boolean m(b3 b3Var) {
        return (b3Var instanceof w1) && y() == ((w1) b3Var).y();
    }

    @Override // defpackage.b3
    public final void n(ryh ryhVar, boolean z) {
        ryhVar.M(1, z);
        ryhVar.G(1);
        ryhVar.E(this.a);
    }

    @Override // defpackage.b3
    public final boolean o() {
        return false;
    }

    @Override // defpackage.b3
    public final int p(boolean z) {
        return ryh.w(1, z);
    }

    @Override // defpackage.b3
    public final b3 s() {
        return y() ? w : c;
    }

    public final String toString() {
        return y() ? "TRUE" : "FALSE";
    }

    public final boolean y() {
        return this.a != 0;
    }
}

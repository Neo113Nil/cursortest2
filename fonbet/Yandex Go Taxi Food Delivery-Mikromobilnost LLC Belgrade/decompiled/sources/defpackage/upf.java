package defpackage;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class upf extends a3 implements p3 {
    public final byte[] a;

    static {
        new q1(2, upf.class);
    }

    public upf(byte[] bArr) {
        if (bArr != null) {
            this.a = bArr;
        } else {
            ny61.t("'contents' cannot be null");
            throw null;
        }
    }

    public static upf p(byte[] bArr) {
        return new upf(bArr);
    }

    @Override // defpackage.p3
    public final String f() {
        return ruu0.a(this.a);
    }

    @Override // defpackage.a3
    public final boolean h(a3 a3Var) {
        if (a3Var instanceof upf) {
            return Arrays.equals(this.a, ((upf) a3Var).a);
        }
        return false;
    }

    @Override // defpackage.a3, defpackage.n2
    public final int hashCode() {
        return ffx.T(this.a);
    }

    @Override // defpackage.a3
    public final void i(g191 g191Var, boolean z) {
        g191Var.Y(25, this.a, z);
    }

    @Override // defpackage.a3
    public final boolean j() {
        return false;
    }

    @Override // defpackage.a3
    public final int k(boolean z) {
        return g191.M(this.a.length, z);
    }
}

package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class r34 extends cg4 {
    public final Iterable a;
    public final byte[] b;

    public r34(byte[] bArr, Iterable iterable) {
        this.a = iterable;
        this.b = bArr;
    }

    @Override // defpackage.cg4
    public final Iterable a() {
        return this.a;
    }

    @Override // defpackage.cg4
    public final byte[] b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cg4)) {
            return false;
        }
        cg4 cg4Var = (cg4) obj;
        if (this.a.equals(cg4Var.a())) {
            return Arrays.equals(this.b, cg4Var instanceof r34 ? ((r34) cg4Var).b : cg4Var.b());
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "BackendRequest{events=" + this.a + ", extras=" + Arrays.toString(this.b) + "}";
    }
}

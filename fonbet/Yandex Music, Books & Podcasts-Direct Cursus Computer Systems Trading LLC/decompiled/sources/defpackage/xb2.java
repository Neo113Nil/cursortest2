package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class xb2 extends sp6 {
    public final String a;
    public final byte[] b;

    public xb2(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sp6)) {
            return false;
        }
        sp6 sp6Var = (sp6) obj;
        xb2 xb2Var = (xb2) sp6Var;
        if (this.a.equals(xb2Var.a)) {
            return Arrays.equals(this.b, sp6Var instanceof xb2 ? ((xb2) sp6Var).b : xb2Var.b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "File{filename=" + this.a + ", contents=" + Arrays.toString(this.b) + "}";
    }
}

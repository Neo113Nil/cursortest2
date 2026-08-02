package defpackage;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class m38 {
    public final k38 a;
    public final l38 b;
    public final byte[] c;

    public m38(k38 k38Var, l38 l38Var, byte[] bArr) {
        this.a = k38Var;
        this.b = l38Var;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m38.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        m38 m38Var = (m38) obj;
        return this.a == m38Var.a && this.b == m38Var.b && Arrays.equals(this.c, m38Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DigitallySigned(hashAlgorithm=" + this.a + ", signatureAlgorithm=" + this.b + ", signature=" + Arrays.toString(this.c) + ')';
    }
}

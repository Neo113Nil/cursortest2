package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class m03 extends qae {
    public final byte[] b;

    public m03(String str, byte[] bArr) {
        super(str);
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m03.class != obj.getClass()) {
            return false;
        }
        m03 m03Var = (m03) obj;
        return this.a.equals(m03Var.a) && Arrays.equals(this.b, m03Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + k5r.c(527, 31, this.a);
    }
}

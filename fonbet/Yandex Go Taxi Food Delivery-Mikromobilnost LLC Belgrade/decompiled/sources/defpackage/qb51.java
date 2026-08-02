package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class qb51 {
    public final int a;
    public final String b;

    public qb51(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public static qb51 a(qb51 qb51Var, String str) {
        int i = qb51Var.a;
        qb51Var.getClass();
        return new qb51(i, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qb51)) {
            return false;
        }
        qb51 qb51Var = (qb51) obj;
        return this.a == qb51Var.a && this.b.equals(qb51Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return oyr.l(this.a, "WriteBlocks(block=", ", value=", this.b, Extension.C_BRAKE);
    }
}

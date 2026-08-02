package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class w6i0 {
    public final long a;
    public final long b;
    public final String c;
    public int d;

    public w6i0(String str, long j, long j2) {
        this.c = str == null ? "" : str;
        this.a = j;
        this.b = j2;
    }

    public final w6i0 a(w6i0 w6i0Var, String str) {
        String i = m4m0.i(str, this.c);
        if (w6i0Var == null) {
            return null;
        }
        long j = w6i0Var.b;
        if (!i.equals(m4m0.i(str, w6i0Var.c))) {
            return null;
        }
        long j2 = this.b;
        if (j2 != -1) {
            long j3 = this.a;
            if (j3 + j2 == w6i0Var.a) {
                return new w6i0(i, j3, j != -1 ? j2 + j : -1L);
            }
        }
        if (j == -1) {
            return null;
        }
        long j4 = w6i0Var.a;
        if (j4 + j == this.a) {
            return new w6i0(i, j4, j2 != -1 ? j + j2 : -1L);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w6i0.class != obj.getClass()) {
            return false;
        }
        w6i0 w6i0Var = (w6i0) obj;
        return this.a == w6i0Var.a && this.b == w6i0Var.b && this.c.equals(w6i0Var.c);
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.c.hashCode() + ((((527 + ((int) this.a)) * 31) + ((int) this.b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RangedUri(referenceUri=");
        sb.append(this.c);
        sb.append(", start=");
        sb.append(this.a);
        sb.append(", length=");
        return oyr.n(this.b, Extension.C_BRAKE, sb);
    }
}

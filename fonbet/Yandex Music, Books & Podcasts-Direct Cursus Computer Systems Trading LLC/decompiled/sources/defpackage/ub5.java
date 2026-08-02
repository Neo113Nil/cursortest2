package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class ub5 extends qae {
    public final String b;
    public final String c;
    public final String d;

    public ub5(String str, String str2, String str3) {
        super("COMM");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ub5.class != obj.getClass()) {
            return false;
        }
        ub5 ub5Var = (ub5) obj;
        return this.c.equals(ub5Var.c) && this.b.equals(ub5Var.b) && Objects.equals(this.d, ub5Var.d);
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c(527, 31, this.b), 31, this.c);
        String str = this.d;
        return c + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.qae
    public final String toString() {
        return this.a + ": language=" + this.b + ", description=" + this.c + ", text=" + this.d;
    }
}

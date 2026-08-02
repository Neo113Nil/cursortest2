package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class p08 {
    public static final p08 e = new n8n(0).c();
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public final int a;
    public final int b;
    public final int c;
    public final String d;

    static {
        int i2 = dvt.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        i = Integer.toString(3, 36);
    }

    public p08(n8n n8nVar) {
        this.a = n8nVar.b;
        this.b = n8nVar.c;
        this.c = n8nVar.d;
        this.d = (String) n8nVar.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p08)) {
            return false;
        }
        p08 p08Var = (p08) obj;
        return this.a == p08Var.a && this.b == p08Var.b && this.c == p08Var.c && Objects.equals(this.d, p08Var.d);
    }

    public final int hashCode() {
        int i2 = (((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31;
        String str = this.d;
        return i2 + (str == null ? 0 : str.hashCode());
    }
}

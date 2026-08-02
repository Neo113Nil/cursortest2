package defpackage;

/* loaded from: classes3.dex */
public final class ox7 {
    public final m5n a;
    public final int b;
    public final int c;

    public ox7(m5n m5nVar, int i, int i2) {
        v3g.w(m5nVar, "Null dependency anInterface.");
        this.a = m5nVar;
        this.b = i;
        this.c = i2;
    }

    public static ox7 a(m5n m5nVar) {
        return new ox7(m5nVar, 1, 0);
    }

    public static ox7 b(Class cls) {
        return new ox7(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ox7)) {
            return false;
        }
        ox7 ox7Var = (ox7) obj;
        return this.a.equals(ox7Var.a) && this.b == ox7Var.b && this.c == ox7Var.c;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i2 = this.c;
        if (i2 == 0) {
            str = "direct";
        } else if (i2 == 1) {
            str = "provider";
        } else {
            if (i2 != 2) {
                xq0.w(k5r.i(i2, "Unsupported injection: "));
                return null;
            }
            str = "deferred";
        }
        return su4.o(sb, str, "}");
    }

    public ox7(int i, int i2, Class cls) {
        this(m5n.a(cls), i, i2);
    }
}

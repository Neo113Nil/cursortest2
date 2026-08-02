package defpackage;

/* loaded from: classes.dex */
public final class u0t {
    public static final u0t d = new u0t(new t0t());
    public static final String e;
    public static final String f;
    public static final String g;
    public final int a;
    public final boolean b;
    public final boolean c;

    static {
        int i = dvt.a;
        e = Integer.toString(1, 36);
        f = Integer.toString(2, 36);
        g = Integer.toString(3, 36);
    }

    public u0t(t0t t0tVar) {
        this.a = t0tVar.a;
        this.b = t0tVar.b;
        this.c = t0tVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u0t.class == obj.getClass()) {
            u0t u0tVar = (u0t) obj;
            if (this.a == u0tVar.a && this.b == u0tVar.b && this.c == u0tVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a + 31) * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0);
    }
}

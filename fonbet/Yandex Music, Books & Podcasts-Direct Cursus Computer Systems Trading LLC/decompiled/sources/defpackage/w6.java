package defpackage;

/* loaded from: classes5.dex */
public abstract class w6 implements Comparable {
    public abstract rk4 b();

    public abstract long c();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        w6 w6Var = (w6) obj;
        if (this == w6Var) {
            return 0;
        }
        long c = w6Var.c();
        long c2 = c();
        if (c2 == c) {
            return 0;
        }
        return c2 < c ? -1 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w6) {
                w6 w6Var = (w6) obj;
                if (c() == w6Var.c()) {
                    rk4 b = b();
                    rk4 b2 = w6Var.b();
                    if (b == b2 ? true : (b == null || b2 == null) ? false : b.equals(b2)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return b().hashCode() + ((int) (c() ^ (c() >>> 32)));
    }

    public String toString() {
        return v9e.E.a(this);
    }
}

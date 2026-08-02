package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class lc2 extends bq6 {
    public final String a;
    public final int b;
    public final List c;

    public lc2(String str, List list, int i) {
        this.a = str;
        this.b = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bq6) {
            lc2 lc2Var = (lc2) ((bq6) obj);
            if (this.a.equals(lc2Var.a) && this.b == lc2Var.b && this.c.equals(lc2Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Thread{name=");
        sb.append(this.a);
        sb.append(", importance=");
        sb.append(this.b);
        sb.append(", frames=");
        return vz1.u(sb, this.c, "}");
    }
}

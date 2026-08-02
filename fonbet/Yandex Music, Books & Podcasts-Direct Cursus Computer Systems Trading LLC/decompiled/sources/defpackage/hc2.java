package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class hc2 extends cq6 {
    public final List a;
    public final yp6 b;
    public final qp6 c;
    public final kc2 d;
    public final List e;

    public hc2(List list, jc2 jc2Var, qp6 qp6Var, kc2 kc2Var, List list2) {
        this.a = list;
        this.b = jc2Var;
        this.c = qp6Var;
        this.d = kc2Var;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cq6)) {
            return false;
        }
        cq6 cq6Var = (cq6) obj;
        List list = this.a;
        if (list == null) {
            if (((hc2) cq6Var).a != null) {
                return false;
            }
        } else if (!list.equals(((hc2) cq6Var).a)) {
            return false;
        }
        yp6 yp6Var = this.b;
        if (yp6Var == null) {
            if (((hc2) cq6Var).b != null) {
                return false;
            }
        } else if (!yp6Var.equals(((hc2) cq6Var).b)) {
            return false;
        }
        qp6 qp6Var = this.c;
        if (qp6Var == null) {
            if (((hc2) cq6Var).c != null) {
                return false;
            }
        } else if (!qp6Var.equals(((hc2) cq6Var).c)) {
            return false;
        }
        hc2 hc2Var = (hc2) cq6Var;
        return this.d.equals(hc2Var.d) && this.e.equals(hc2Var.e);
    }

    public final int hashCode() {
        List list = this.a;
        int hashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        yp6 yp6Var = this.b;
        int hashCode2 = (hashCode ^ (yp6Var == null ? 0 : yp6Var.hashCode())) * 1000003;
        qp6 qp6Var = this.c;
        return (((((qp6Var != null ? qp6Var.hashCode() : 0) ^ hashCode2) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Execution{threads=");
        sb.append(this.a);
        sb.append(", exception=");
        sb.append(this.b);
        sb.append(", appExitInfo=");
        sb.append(this.c);
        sb.append(", signal=");
        sb.append(this.d);
        sb.append(", binaries=");
        return vz1.u(sb, this.e, "}");
    }
}

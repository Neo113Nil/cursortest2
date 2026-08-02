package defpackage;

import java.util.List;

/* loaded from: classes10.dex */
public final class u84 extends unw0 {
    public final enw0 a;
    public final List b;

    public u84(enw0 enw0Var, List list) {
        if (enw0Var == null) {
            ny61.t("Null surfaceEdge");
            throw null;
        }
        this.a = enw0Var;
        if (list != null) {
            this.b = list;
        } else {
            ny61.t("Null outConfigs");
            throw null;
        }
    }

    @Override // defpackage.unw0
    public final List a() {
        return this.b;
    }

    @Override // defpackage.unw0
    public final enw0 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof unw0)) {
            return false;
        }
        unw0 unw0Var = (unw0) obj;
        return this.a.equals(unw0Var.b()) && this.b.equals(unw0Var.a());
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{surfaceEdge=");
        sb.append(this.a);
        sb.append(", outConfigs=");
        return ly3.s(sb, this.b, "}");
    }
}

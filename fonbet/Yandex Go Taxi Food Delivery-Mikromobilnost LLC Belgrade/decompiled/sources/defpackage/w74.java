package defpackage;

import java.util.List;

/* loaded from: classes10.dex */
public final class w74 {
    public final hkn a;
    public final hkn b;
    public final int c;
    public final List d;

    public w74(hkn hknVar, hkn hknVar2, int i, List list) {
        this.a = hknVar;
        this.b = hknVar2;
        this.c = i;
        if (list != null) {
            this.d = list;
        } else {
            ny61.t("Null outputFormats");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w74)) {
            return false;
        }
        w74 w74Var = (w74) obj;
        return this.a.equals(w74Var.a) && this.b.equals(w74Var.b) && this.c == w74Var.c && this.d.equals(w74Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{edge=");
        sb.append(this.a);
        sb.append(", postviewEdge=");
        sb.append(this.b);
        sb.append(", inputFormat=");
        sb.append(this.c);
        sb.append(", outputFormats=");
        return ly3.s(sb, this.d, "}");
    }
}

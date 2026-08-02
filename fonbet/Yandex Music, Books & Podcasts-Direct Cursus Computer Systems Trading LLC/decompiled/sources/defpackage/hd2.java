package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class hd2 {
    public final String a;
    public final ArrayList b;

    public hd2(String str, ArrayList arrayList) {
        if (str == null) {
            jj4.j("Null userAgent");
            throw null;
        }
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hd2)) {
            return false;
        }
        hd2 hd2Var = (hd2) obj;
        return this.a.equals(hd2Var.a) && this.b.equals(hd2Var.b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeartBeatResult{userAgent=");
        sb.append(this.a);
        sb.append(", usedDates=");
        return vz1.t(sb, this.b, "}");
    }
}

package defpackage;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class dnk {
    public final c01 a;
    public final ArrayList b;
    public final ArrayList c;

    public dnk(c01 c01Var, ArrayList arrayList, ArrayList arrayList2) {
        this.a = c01Var;
        this.b = arrayList;
        this.c = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnk)) {
            return false;
        }
        dnk dnkVar = (dnk) obj;
        return this.a.equals(dnkVar.a) && this.b.equals(dnkVar.b) && this.c.equals(dnkVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dfi.b(this.b, this.a.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhonotekaArtistInfo(artist=");
        sb.append(this.a);
        sb.append(", albums=");
        sb.append(this.b);
        sb.append(", tracks=");
        return vz1.t(sb, this.c, ")");
    }
}

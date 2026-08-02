package defpackage;

/* loaded from: classes3.dex */
public final class khf {
    public final ogf a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public khf(ogf ogfVar, boolean z, boolean z2) {
        ogfVar.getClass();
        this.a = ogfVar;
        this.b = z;
        this.c = z2;
        this.d = (!z && ogfVar == ogf.c) || (!z2 && ogfVar == ogf.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof khf)) {
            return false;
        }
        khf khfVar = (khf) obj;
        return this.a == khfVar.a && this.b == khfVar.b && this.c == khfVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k5r.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TracksSortConfig(sortType=");
        sb.append(this.a);
        sb.append(", isNeedSongsSort=");
        sb.append(this.b);
        sb.append(", isNeedEpisodesSort=");
        return ouj.r(sb, this.c, ")");
    }
}

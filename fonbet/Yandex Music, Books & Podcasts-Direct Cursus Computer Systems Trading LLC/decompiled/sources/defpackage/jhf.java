package defpackage;

/* loaded from: classes3.dex */
public final class jhf {
    public final yfa a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public jhf(yfa yfaVar, boolean z, boolean z2) {
        yfaVar.getClass();
        this.a = yfaVar;
        this.b = z;
        this.c = z2;
        this.d = (!z && yfaVar == yfa.c) || (!z2 && yfaVar == yfa.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhf)) {
            return false;
        }
        jhf jhfVar = (jhf) obj;
        return this.a == jhfVar.a && this.b == jhfVar.b && this.c == jhfVar.c;
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

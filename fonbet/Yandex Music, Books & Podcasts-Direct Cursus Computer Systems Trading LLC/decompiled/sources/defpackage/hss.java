package defpackage;

/* loaded from: classes4.dex */
public final class hss {
    public final gss a;
    public final int b;
    public final o5n c;

    public hss(gss gssVar, int i, o5n o5nVar) {
        this.a = gssVar;
        this.b = i;
        this.c = o5nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hss)) {
            return false;
        }
        hss hssVar = (hss) obj;
        return this.a == hssVar.a && this.b == hssVar.b && this.c == hssVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + f1d.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "TrackTechInfo(codec=" + this.a + ", bitrate=" + this.b + ", realQuality=" + this.c + ")";
    }
}

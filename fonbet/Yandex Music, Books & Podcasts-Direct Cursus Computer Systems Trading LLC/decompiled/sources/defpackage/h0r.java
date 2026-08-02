package defpackage;

/* loaded from: classes4.dex */
public final class h0r {
    public final mqs a;
    public final long b;
    public final qvs c;
    public final jyr d = btf.b(new eyq(5, this));

    public h0r(mqs mqsVar, long j, qvs qvsVar) {
        this.a = mqsVar;
        this.b = j;
        this.c = qvsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0r)) {
            return false;
        }
        h0r h0rVar = (h0r) obj;
        return this.a.equals(h0rVar.a) && this.b == h0rVar.b && this.c.equals(h0rVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + tlm.c(this.b, this.a.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "SmartPreview(originalTrack=" + this.a + ", duration=" + this.b + ", fade=" + this.c + ")";
    }
}

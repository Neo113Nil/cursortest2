package defpackage;

/* loaded from: classes3.dex */
public final class b3n {
    public final m a;
    public final boolean b;
    public final bve c;

    public b3n(m mVar, boolean z, bve bveVar) {
        this.a = mVar;
        this.b = z;
        this.c = bveVar;
    }

    public final boolean a(bve bveVar) {
        bveVar.getClass();
        return this.b && this.c.equals(bveVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3n)) {
            return false;
        }
        b3n b3nVar = (b3n) obj;
        return this.a.equals(b3nVar.a) && this.b == b3nVar.b && this.c.equals(b3nVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "DisclaimerState(text=" + this.a + ", isOneClickDisclaimer=" + this.b + ", offer=" + this.c + ")";
    }
}

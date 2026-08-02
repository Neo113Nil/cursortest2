package defpackage;

/* loaded from: classes4.dex */
public final class b2h {
    public final xwr a;
    public final zd5 b;

    public b2h(xwr xwrVar, zd5 zd5Var) {
        this.a = xwrVar;
        this.b = zd5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2h)) {
            return false;
        }
        b2h b2hVar = (b2h) obj;
        return this.a.equals(b2hVar.a) && this.b.equals(b2hVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LyricsConfig(syncSizes=" + this.a + ", commonSizes=" + this.b + ")";
    }
}

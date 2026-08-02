package defpackage;

/* loaded from: classes4.dex */
public final class wnu implements znu, vnu {
    public final jyr a;
    public final int b;

    public wnu(jyr jyrVar, int i) {
        this.a = jyrVar;
        this.b = i;
    }

    @Override // defpackage.znu
    public final int c() {
        return this.b;
    }

    public final s9p e() {
        return (s9p) this.a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wnu)) {
            return false;
        }
        wnu wnuVar = (wnu) obj;
        return this.a.equals(wnuVar.a) && this.b == wnuVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WithSeedsOnly(expectedSeedsLazy=" + this.a + ", phonotekaOnlyId=" + v5g.T(this.b) + ")";
    }
}

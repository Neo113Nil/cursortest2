package defpackage;

/* loaded from: classes4.dex */
public final class nlf implements vlf {
    public final ulf a;
    public final jlf b;

    public nlf(ulf ulfVar, jlf jlfVar) {
        this.a = ulfVar;
        this.b = jlfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nlf)) {
            return false;
        }
        nlf nlfVar = (nlf) obj;
        return this.a.equals(nlfVar.a) && this.b.equals(nlfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowWaveButtonOld(waveButtonState=" + this.a + ", contextState=" + this.b + ")";
    }
}

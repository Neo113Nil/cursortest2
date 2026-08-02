package defpackage;

/* loaded from: classes4.dex */
public final class c3w {
    public final qwv a;
    public final bwv b;
    public final b2w c;
    public final jxv d;
    public final kzv e;
    public final uzv f;
    public final dtv g;
    public final dsv h;
    public final esv i;
    public final r2w j;

    public c3w(qwv qwvVar, bwv bwvVar, b2w b2wVar, jxv jxvVar, kzv kzvVar, uzv uzvVar, dtv dtvVar, dsv dsvVar, esv esvVar, r2w r2wVar) {
        this.a = qwvVar;
        this.b = bwvVar;
        this.c = b2wVar;
        this.d = jxvVar;
        this.e = kzvVar;
        this.f = uzvVar;
        this.g = dtvVar;
        this.h = dsvVar;
        this.i = esvVar;
        this.j = r2wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3w)) {
            return false;
        }
        c3w c3wVar = (c3w) obj;
        return this.a.equals(c3wVar.a) && this.b.equals(c3wVar.b) && this.c.equals(c3wVar.c) && this.d.equals(c3wVar.d) && this.e.equals(c3wVar.e) && this.f.equals(c3wVar.f) && this.g.equals(c3wVar.g) && this.h.equals(c3wVar.h) && this.i.equals(c3wVar.i) && this.j.equals(c3wVar.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + tlm.d(this.f.a, tlm.d(this.e.a, tlm.d(this.d.a, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31), 31), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "WizardTypography(header=" + this.a + ", footer=" + this.b + ", search=" + this.c + ", likedArtists=" + this.d + ", onboarding=" + this.e + ", outboarding=" + this.f + ", artistListItem=" + this.g + ", artistBlockDefault=" + this.h + ", artistBlockDetails=" + this.i + ", skipDialog=" + this.j + ")";
    }
}

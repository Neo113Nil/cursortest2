package defpackage;

/* loaded from: classes4.dex */
public final class ktv implements ctv {
    public final String b;
    public final String c;
    public final String d;
    public final yrv e;
    public final boolean f;
    public final String g;
    public final jtv h;
    public final boolean i;

    public ktv(String str, String str2, String str3, yrv yrvVar, boolean z, String str4, jtv jtvVar, boolean z2) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = yrvVar;
        this.f = z;
        this.g = str4;
        this.h = jtvVar;
        this.i = z2;
    }

    @Override // defpackage.ctv
    public final String a() {
        return this.d;
    }

    @Override // defpackage.ctv
    public final xrv b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ktv)) {
            return false;
        }
        ktv ktvVar = (ktv) obj;
        return this.b.equals(ktvVar.b) && this.c.equals(ktvVar.c) && this.d.equals(ktvVar.d) && this.e.equals(ktvVar.e) && this.f == ktvVar.f && this.g.equals(ktvVar.g) && this.h.equals(ktvVar.h) && this.i == ktvVar.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ((this.h.hashCode() + k5r.c(k5r.e((this.e.hashCode() + k5r.c(k5r.c(this.b.hashCode() * 31, 31, this.c), 31, this.d)) * 31, 31, this.f), 31, this.g)) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("WizardArtistUiData(id=", this.b, ", name=", this.c, ", imageUrl=");
        m.append(this.d);
        m.append(", domainInfo=");
        m.append(this.e);
        m.append(", isLiked=");
        m.append(this.f);
        m.append(", zoomedImageUrl=");
        m.append(this.g);
        m.append(", coordinates=");
        m.append(this.h);
        m.append(", isRecommended=");
        m.append(this.i);
        m.append(")");
        return m.toString();
    }
}

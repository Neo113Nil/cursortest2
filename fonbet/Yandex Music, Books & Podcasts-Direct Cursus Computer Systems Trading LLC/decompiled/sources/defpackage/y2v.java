package defpackage;

/* loaded from: classes4.dex */
public final class y2v implements a3v {
    public final String a;
    public final String b;
    public final u2v c;

    public y2v(String str, String str2, u2v u2vVar) {
        this.a = str;
        this.b = str2;
        this.c = u2vVar;
    }

    @Override // defpackage.a3v
    public final x2v a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2v)) {
            return false;
        }
        y2v y2vVar = (y2v) obj;
        return this.a.equals(y2vVar.a) && this.b.equals(y2vVar.b) && this.c.equals(y2vVar.c);
    }

    @Override // defpackage.a3v
    public final String getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.a.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder m = f1d.m("CutoutArtist(title=", this.a, ", imageUrl=", this.b, ", domainEntity=");
        m.append(this.c);
        m.append(")");
        return m.toString();
    }
}

package defpackage;

/* loaded from: classes4.dex */
public final class b0w {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final a0w f;

    public b0w(String str, int i, int i2, int i3, int i4, a0w a0wVar) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = a0wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0w)) {
            return false;
        }
        b0w b0wVar = (b0w) obj;
        return this.a.equals(b0wVar.a) && this.b == b0wVar.b && this.c == b0wVar.c && this.d == b0wVar.d && this.e == b0wVar.e && this.f == b0wVar.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + f1d.a(this.e, f1d.a(this.d, f1d.a(this.c, f1d.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder l = f1d.l(this.b, "WizardProgress(text=", this.a, ", minArtistsForPassedWizard=", ", countOfLikedArtists=");
        hrg.w(this.c, this.d, ", upperBoundOfLikes=", ", passBoundOfLikes=", l);
        l.append(this.e);
        l.append(", type=");
        l.append(this.f);
        l.append(")");
        return l.toString();
    }
}

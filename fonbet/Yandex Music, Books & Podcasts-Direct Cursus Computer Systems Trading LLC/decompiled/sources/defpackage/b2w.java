package defpackage;

/* loaded from: classes4.dex */
public final class b2w {
    public final ges a;
    public final ges b;
    public final ges c;
    public final ges d;
    public final ges e;

    public b2w(ges gesVar, ges gesVar2, ges gesVar3, ges gesVar4, ges gesVar5) {
        this.a = gesVar;
        this.b = gesVar2;
        this.c = gesVar3;
        this.d = gesVar4;
        this.e = gesVar5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2w)) {
            return false;
        }
        b2w b2wVar = (b2w) obj;
        return this.a.equals(b2wVar.a) && this.b.equals(b2wVar.b) && this.c.equals(b2wVar.c) && this.d.equals(b2wVar.d) && this.e.equals(b2wVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + tlm.d(this.d, tlm.d(this.c, tlm.d(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WizardSearchScreenTypography(placeholder=");
        sb.append(this.a);
        sb.append(", popularArtists=");
        sb.append(this.b);
        sb.append(", emptyTitle=");
        eta.t(sb, this.c, ", emptySubtitle=", this.d, ", searchField=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}

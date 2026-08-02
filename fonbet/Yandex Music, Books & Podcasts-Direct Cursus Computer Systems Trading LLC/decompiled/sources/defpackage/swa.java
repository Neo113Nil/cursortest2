package defpackage;

/* loaded from: classes3.dex */
public final class swa {
    public final ges a;
    public final ges b;
    public final ges c;
    public final ges d;
    public final ges e;
    public final ges f;

    public swa(ges gesVar, ges gesVar2, ges gesVar3, ges gesVar4, ges gesVar5, ges gesVar6) {
        this.a = gesVar;
        this.b = gesVar2;
        this.c = gesVar3;
        this.d = gesVar4;
        this.e = gesVar5;
        this.f = gesVar6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof swa)) {
            return false;
        }
        swa swaVar = (swa) obj;
        return this.a.equals(swaVar.a) && this.b.equals(swaVar.b) && this.c.equals(swaVar.c) && this.d.equals(swaVar.d) && this.e.equals(swaVar.e) && this.f.equals(swaVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + tlm.d(this.e, tlm.d(this.d, tlm.d(this.c, tlm.d(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DynamicOverlayTypography(headerTextStyle=");
        sb.append(this.a);
        sb.append(", bigHeaderTextStyle=");
        sb.append(this.b);
        sb.append(", subtitleTextStyle=");
        eta.t(sb, this.c, ", buttonTextStyle=", this.d, ", disclaimerTextStyle=");
        sb.append(this.e);
        sb.append(", learnMoreTextStyle=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}

package defpackage;

/* loaded from: classes3.dex */
public final class otb {
    public final boolean a;
    public final tbl b;
    public final float c;
    public final float d;
    public final boolean e;

    public otb(boolean z, tbl tblVar, float f, float f2, boolean z2) {
        this.a = z;
        this.b = tblVar;
        this.c = f;
        this.d = f2;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof otb)) {
            return false;
        }
        otb otbVar = (otb) obj;
        return this.a == otbVar.a && this.b == otbVar.b && cma.a(this.c, otbVar.c) && cma.a(this.d, otbVar.d) && this.e == otbVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + eta.a(eta.a((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31, this.c, 31), this.d, 31);
    }

    public final String toString() {
        String b = cma.b(this.c);
        String b2 = cma.b(this.d);
        StringBuilder sb = new StringBuilder("ExpandedPlayerContentScopeImpl(showCoverInTrackInfo=");
        sb.append(this.a);
        sb.append(", controlsSize=");
        sb.append(this.b);
        sb.append(", portraitCoverPadding=");
        su4.v(sb, b, ", availableWidth=", b2, ", lyricsSettingAvailable=");
        return ouj.r(sb, this.e, ")");
    }
}

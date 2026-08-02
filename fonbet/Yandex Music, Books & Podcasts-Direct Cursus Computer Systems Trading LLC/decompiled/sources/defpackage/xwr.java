package defpackage;

/* loaded from: classes4.dex */
public final class xwr {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final iz2 e;
    public final float f;
    public final boolean g;

    public xwr(float f, float f2, float f3, float f4, iz2 iz2Var, float f5, boolean z) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = iz2Var;
        this.f = f5;
        this.g = z;
    }

    public final ges a(hq5 hq5Var) {
        ges d;
        oq5 oq5Var = (oq5) hq5Var;
        if (this.g) {
            oq5Var.Z(-1161289126);
            d = nu0.b();
        } else {
            oq5Var.Z(-1161288003);
            d = nu0.d();
        }
        oq5Var.p(false);
        return d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xwr)) {
            return false;
        }
        xwr xwrVar = (xwr) obj;
        return cma.a(this.a, xwrVar.a) && cma.a(this.b, xwrVar.b) && cma.a(this.c, xwrVar.c) && cma.a(this.d, xwrVar.d) && this.e.equals(xwrVar.e) && Float.compare(this.f, xwrVar.f) == 0 && this.g == xwrVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + eta.a((this.e.hashCode() + eta.a(eta.a(eta.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31)) * 31, this.f, 31);
    }

    public final String toString() {
        String b = cma.b(this.a);
        String b2 = cma.b(this.b);
        String b3 = cma.b(this.c);
        String b4 = cma.b(this.d);
        StringBuilder m = f1d.m("SyncLyricsSizes(verticalContentPadding=", b, ", singleItemHorizontalPadding=", b2, ", singleItemVerticalPadding=");
        su4.v(m, b3, ", loadingIndicatorTopPadding=", b4, ", loadingIndicatorAlign=");
        m.append(this.e);
        m.append(", currentLineMaxTextScale=");
        m.append(this.f);
        m.append(", isSmallTextStyle=");
        return ouj.r(m, this.g, ")");
    }
}

package defpackage;

/* loaded from: classes4.dex */
public final class evb implements gvb {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final boolean e;

    public evb(float f, float f2, float f3, float f4, boolean z) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = z;
    }

    @Override // defpackage.gvb
    public final float a() {
        return this.b;
    }

    @Override // defpackage.gvb
    public final float b() {
        return this.a;
    }

    @Override // defpackage.gvb
    public final float c() {
        return this.a;
    }

    @Override // defpackage.gvb
    public final float d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof evb)) {
            return false;
        }
        evb evbVar = (evb) obj;
        return cma.a(this.a, evbVar.a) && cma.a(this.b, evbVar.b) && cma.a(this.c, evbVar.c) && Float.compare(this.d, evbVar.d) == 0 && this.e == evbVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + eta.a(eta.a(eta.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31);
    }

    public final String toString() {
        String b = cma.b(this.a);
        String b2 = cma.b(this.b);
        String b3 = cma.b(this.c);
        StringBuilder m = f1d.m("Vertical(contentWidth=", b, ", availableWidth=", b2, ", availableHeight=");
        m.append(b3);
        m.append(", multiplierForFlexiblePadding=");
        m.append(this.d);
        m.append(", compactSpaceBetweenHeaderAndMainPlayer=");
        return ouj.r(m, this.e, ")");
    }
}

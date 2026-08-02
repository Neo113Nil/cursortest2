package defpackage;

/* loaded from: classes4.dex */
public final class fvb implements gvb {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final lkv e;

    public fvb(float f, float f2, float f3, float f4, lkv lkvVar) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = lkvVar;
    }

    @Override // defpackage.gvb
    public final float a() {
        return this.b;
    }

    @Override // defpackage.gvb
    public final float b() {
        return this.d;
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
        if (!(obj instanceof fvb)) {
            return false;
        }
        fvb fvbVar = (fvb) obj;
        return cma.a(this.a, fvbVar.a) && cma.a(this.b, fvbVar.b) && cma.a(this.c, fvbVar.c) && cma.a(this.d, fvbVar.d) && this.e.equals(fvbVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + eta.a(eta.a(eta.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31);
    }

    public final String toString() {
        String b = cma.b(this.a);
        String b2 = cma.b(this.b);
        String b3 = cma.b(this.c);
        String b4 = cma.b(this.d);
        StringBuilder m = f1d.m("Wide(contentWidth=", b, ", availableWidth=", b2, ", availableHeight=");
        su4.v(m, b3, ", sizeCover=", b4, ", paddings=");
        m.append(this.e);
        m.append(")");
        return m.toString();
    }
}

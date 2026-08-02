package defpackage;

/* loaded from: classes4.dex */
public final class fwq implements ewq {
    public final xdr a = ydr.a(Boolean.TRUE);
    public final x0q b;
    public zsq c;
    public final x0q d;

    public fwq() {
        x0q b = y0q.b(0, 1, oi3.b, 1);
        this.b = b;
        this.d = b;
    }

    @Override // defpackage.ewq
    public final void a(zsq zsqVar) {
        zsqVar.getClass();
        this.c = zsqVar;
    }

    @Override // defpackage.ewq
    public final xdr b() {
        return this.a;
    }

    @Override // defpackage.ewq
    public final pjc c() {
        return this.d;
    }

    @Override // defpackage.ewq
    public final void d() {
        zsq zsqVar = this.c;
        if (zsqVar == null) {
            return;
        }
        xdr xdrVar = this.a;
        boolean z = !((Boolean) xdrVar.getValue()).booleanValue();
        v3w.n(z, xdrVar, null);
        this.b.a(new m3r(z, zsqVar));
    }
}

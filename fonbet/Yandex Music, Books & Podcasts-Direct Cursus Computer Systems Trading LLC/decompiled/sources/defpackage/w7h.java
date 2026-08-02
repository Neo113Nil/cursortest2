package defpackage;

/* loaded from: classes5.dex */
public final class w7h extends aeg {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public w7h(Throwable th) {
        sgr h = sgr.n.i("Panic! This is a bug!").h(th);
        xdg xdgVar = xdg.e;
        o2g.J("drop status shouldn't be OK", !h.g());
        this.b = new xdg(null, null, h, true);
    }

    @Override // defpackage.aeg
    public final xdg a(dsk dskVar) {
        switch (this.a) {
            case 0:
                return (xdg) this.b;
            default:
                return xdg.a((sgr) this.b);
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                z0j z0jVar = new z0j(w7h.class.getSimpleName());
                z0jVar.q((xdg) this.b, "panicPickResult");
                return z0jVar.toString();
            default:
                return super.toString();
        }
    }

    public w7h(sgr sgrVar) {
        this.b = sgrVar;
    }
}

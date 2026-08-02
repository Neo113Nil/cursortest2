package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class aqw extends hqw {
    public final fpw f;
    public final eaq g;
    public final rjq h;
    public final um6 i;
    public final jyr j;

    public aqw(diw diwVar, fpw fpwVar, eaq eaqVar) {
        super(diwVar, eaqVar);
        this.f = fpwVar;
        this.g = eaqVar;
        rjq b = hyf.b();
        this.h = b;
        this.i = hld.s(b, dm6.b());
        this.j = diwVar.b(hag.I(hiw.class), true);
    }

    @Override // defpackage.hqw
    public final void c(vpw vpwVar) {
        this.h.g();
        ox6.B(zsd.M0(new ypw(vpwVar, 0), new j0v((Continuation) null, this, 8)), this.i, new lot(28, this));
    }

    @Override // defpackage.hqw
    public final void d() {
        this.h.V();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!aqw.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        aqw aqwVar = (aqw) obj;
        return this.f.e.d == aqwVar.f.e.d && this.g.l().d == aqwVar.g.l().d;
    }

    public final int hashCode() {
        return Long.hashCode(this.g.l().d) + (Long.hashCode(this.f.e.d) * 31);
    }
}

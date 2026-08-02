package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class wu6 implements c8t {
    public final z8t a;
    public final sce b;
    public final int c;

    public wu6(z8t z8tVar, sce sceVar, int i) {
        this.a = z8tVar;
        this.b = sceVar;
        this.c = i;
        if (i > 0) {
            return;
        }
        xq0.x("durationMillis must be > 0.");
        throw null;
    }

    @Override // defpackage.c8t
    public final void a() {
        z8t z8tVar = this.a;
        Drawable q = z8tVar.q();
        sce sceVar = this.b;
        boolean z = sceVar instanceof bqr;
        ku6 ku6Var = new ku6(q, sceVar.a(), sceVar.b().z, this.c, (z && ((bqr) sceVar).g) ? false : true);
        if (z) {
            z8tVar.f(ku6Var);
        } else if (sceVar instanceof pgb) {
            z8tVar.p(ku6Var);
        }
    }
}

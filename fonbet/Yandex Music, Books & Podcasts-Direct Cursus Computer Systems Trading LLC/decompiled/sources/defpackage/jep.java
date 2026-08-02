package defpackage;

/* loaded from: classes.dex */
public final class jep implements has {
    public long a = 0;
    public long b = 0;
    public final /* synthetic */ hep c;
    public final /* synthetic */ bfp d;
    public final /* synthetic */ long e;

    public jep(hep hepVar, bfp bfpVar, long j) {
        this.c = hepVar;
        this.d = bfpVar;
        this.e = j;
    }

    @Override // defpackage.has
    public final void b(long j) {
        wof wofVar = (wof) this.c.invoke();
        bfp bfpVar = this.d;
        if (wofVar != null) {
            if (!wofVar.d()) {
                return;
            }
            zdp zdpVar = o6c.p;
            lh0 lh0Var = bfpVar.f;
            if (lh0Var != null) {
                lh0Var.invoke(Boolean.TRUE, wofVar, new enj(j), zdpVar);
            }
            this.a = j;
        }
        if (cfp.a(bfpVar, this.e)) {
            this.b = 0L;
        }
    }

    @Override // defpackage.has
    public final void d(long j) {
        wof wofVar = (wof) this.c.invoke();
        if (wofVar == null || !wofVar.d()) {
            return;
        }
        bfp bfpVar = this.d;
        if (cfp.a(bfpVar, this.e)) {
            long h = enj.h(this.b, j);
            this.b = h;
            long h2 = enj.h(this.a, h);
            if (bfpVar.b(wofVar, h2, this.a, o6c.p, true)) {
                this.a = h2;
                this.b = 0L;
            }
        }
    }

    @Override // defpackage.has
    public final void onCancel() {
        dep depVar;
        long j = this.e;
        bfp bfpVar = this.d;
        if (!cfp.a(bfpVar, j) || (depVar = bfpVar.h) == null) {
            return;
        }
        depVar.invoke();
    }

    @Override // defpackage.has
    public final void onStop() {
        dep depVar;
        long j = this.e;
        bfp bfpVar = this.d;
        if (!cfp.a(bfpVar, j) || (depVar = bfpVar.h) == null) {
            return;
        }
        depVar.invoke();
    }

    @Override // defpackage.has
    public final void a() {
    }

    @Override // defpackage.has
    public final void c() {
    }
}

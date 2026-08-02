package defpackage;

/* loaded from: classes4.dex */
public final class stv implements nvv, rnq, wmm {
    public static final /* synthetic */ s9f[] k;
    public final ptv a;
    public final rmb b;
    public volatile boolean c;
    public kzp d;
    public final xdr e;
    public final rtv f;
    public final jyr g;
    public final jyr h;
    public final jyr i;
    public final xdr j;

    static {
        opi opiVar = new opi(stv.class, "interactor", "getInteractor()Lcom/yandex/music/shared/wizard/entry/api/WizardEntryPointInteractor;", 0);
        ern.a.getClass();
        k = new s9f[]{opiVar};
    }

    public stv(ptv ptvVar, rmb rmbVar) {
        ptvVar.getClass();
        this.a = ptvVar;
        this.b = rmbVar;
        this.e = ydr.a(Boolean.FALSE);
        this.f = new rtv(null);
        bdt I = hag.I(nuv.class);
        l18 l18Var = l18.b;
        this.g = l18Var.b(I, true);
        this.h = l18Var.b(hag.I(mvv.class), true);
        jyr b = btf.b(new jvu(25, this));
        this.i = b;
        this.j = ydr.a((ivv) b.getValue());
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.a;
    }

    @Override // defpackage.nvv
    public final void b() {
        Boolean bool = Boolean.TRUE;
        xdr xdrVar = this.e;
        xdrVar.getClass();
        xdrVar.m(null, bool);
    }

    @Override // defpackage.wmm
    public final void cancel() {
        ssg.a(3, "Skeleton:WizardEntryBlock", hrg.q("Block cancel[", this.a.a.a, "]"), null);
        s9f[] s9fVarArr = k;
        s9f s9fVar = s9fVarArr[0];
        rtv rtvVar = this.f;
        yuv yuvVar = (yuv) rtvVar.getValue(this, s9fVar);
        if (yuvVar != null) {
            yuvVar.f.setValue(yuvVar, yuv.g[0], null);
        }
        rtvVar.setValue(this, s9fVarArr[0], null);
    }

    @Override // defpackage.wmm
    public final void h() {
        ssg.a(3, "Skeleton:WizardEntryBlock", vz1.p("Block reset[", this.a.a.a, "]: ready=", m()), null);
        cancel();
        this.c = true;
    }

    @Override // defpackage.wmm
    public final void k(kzp kzpVar) {
        this.d = kzpVar;
    }

    @Override // defpackage.wmm
    public final void l(mm6 mm6Var) {
        r2f r2fVar;
        rtv rtvVar = this.f;
        s9f[] s9fVarArr = k;
        yuv yuvVar = (yuv) rtvVar.getValue(this, s9fVarArr[0]);
        if (yuvVar == null || (r2fVar = (r2f) yuvVar.f.getValue(yuvVar, yuv.g[0])) == null || !r2fVar.b()) {
            String str = this.a.a.a;
            boolean z = this.c;
            boolean m = m();
            StringBuilder h = v3w.h("Block load[", str, "]: force=", " ready=", z);
            h.append(m);
            ssg.a(3, "Skeleton:WizardEntryBlock", h.toString(), null);
            if (!m()) {
                this.j.l((ivv) this.i.getValue());
            }
            nuv nuvVar = (nuv) this.g.getValue();
            ptv ptvVar = this.a;
            ouv ouvVar = new ouv(ptvVar.b.a, men.G(ptvVar.a));
            xdr xdrVar = this.e;
            nuvVar.getClass();
            xdrVar.getClass();
            yuv yuvVar2 = new yuv(ouvVar, (cq4) mm6Var, xdrVar, nuvVar.a);
            yuvVar2.a(this.c, new vlv(1, this, stv.class, "submitResult", "submitResult(Lcom/yandex/music/shared/network/api/converter/ConvertedResult;)V", 0, 2));
            this.f.setValue(this, s9fVarArr[0], yuvVar2);
        }
    }

    public final boolean m() {
        kvv kvvVar = (kvv) this.j.getValue();
        if (kvvVar instanceof jvv) {
            return true;
        }
        if ((kvvVar instanceof hvv) || (kvvVar instanceof ivv)) {
            return false;
        }
        b6e.s();
        return false;
    }

    @Override // defpackage.nvv
    public final void onStop() {
        Boolean bool = Boolean.FALSE;
        xdr xdrVar = this.e;
        xdrVar.getClass();
        xdrVar.m(null, bool);
    }

    @Override // defpackage.nvv
    public final xdr u() {
        return this.j;
    }
}

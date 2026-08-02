package defpackage;

/* loaded from: classes3.dex */
public final class lmj implements jmj {
    public final mm6 a;
    public final int b;
    public final tmb c;
    public final pmj d;
    public final emj e;
    public final kef f;
    public qkb g;
    public thj h;
    public rmb i;

    public lmj(mm6 mm6Var, int i, tmb tmbVar, pmj pmjVar, emj emjVar, kef kefVar) {
        pmjVar.getClass();
        this.a = mm6Var;
        this.b = i;
        this.c = tmbVar;
        this.d = pmjVar;
        this.e = emjVar;
        this.f = kefVar;
        qkb qkbVar = ((mmj) ((fkn) pmjVar.H()).a.getValue()).c ? qkb.OfflineMode : qkb.NoInternet;
        this.g = qkbVar;
        this.h = h(qkbVar);
        this.i = g(this.g);
        if (tmbVar != null) {
            ox6.B(zsd.b0(new kvh(pmjVar.H(), 22)), mm6Var, new fmi(10, this));
        }
    }

    public static thj h(qkb qkbVar) {
        return new thj(pkb.Shortcut, qkbVar.a, 1, 1, "");
    }

    @Override // defpackage.jmj
    public final void a(String str, boolean z) {
        str.getClass();
        rmb rmbVar = this.i;
        if (rmbVar != null) {
            weo.H(rmbVar, this.h, z, str, null);
        }
    }

    @Override // defpackage.jmj
    public final void b() {
        rmb rmbVar = this.i;
        if (rmbVar != null) {
            rmb.j(rmbVar, ((mmj) ((fkn) this.d.H()).a.getValue()).c ? wjb.CollectionLandingScreen : wjb.DownloadedContentScreen, this.h, null, 12);
        }
        this.e.o();
    }

    @Override // defpackage.jmj
    public final void c() {
        vnb vnbVar;
        tmb tmbVar = this.c;
        if (tmbVar != null && (vnbVar = (vnb) tmbVar.h.getValue()) != null) {
            vnbVar.a(xjb.Offline, false);
        }
        x97.y(this.a, null, null, new m1i(this, null, 19), 3);
    }

    @Override // defpackage.jmj
    public final void d() {
        rmb rmbVar = this.i;
        if (rmbVar != null) {
            rmb.j(rmbVar, wjb.SettingsAutoDownloadScreen, this.h, null, 12);
        }
        this.e.l();
    }

    @Override // defpackage.jmj
    public final void e() {
        rmb rmbVar = this.i;
        if (rmbVar != null) {
            rmb.a(rmbVar, sjb.Refresh, this.h, null, 10);
        }
        this.f.invoke(Boolean.TRUE);
    }

    @Override // defpackage.jmj
    public final void f() {
        rmb rmbVar = this.i;
        if (rmbVar != null) {
            rmb.j(rmbVar, wjb.MainScreen, this.h, null, 12);
        }
        this.e.s();
    }

    public final rmb g(qkb qkbVar) {
        tmb tmbVar = this.c;
        if (tmbVar == null) {
            return null;
        }
        qkbVar.getClass();
        return tmbVar.a(new jab(qkbVar, 1, this.b, 0), null);
    }

    @Override // defpackage.jmj
    public final vdr getState() {
        return this.d.H();
    }
}

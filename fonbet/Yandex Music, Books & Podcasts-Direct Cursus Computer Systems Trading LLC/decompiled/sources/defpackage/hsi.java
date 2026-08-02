package defpackage;

import androidx.fragment.app.y;

/* loaded from: classes3.dex */
public final class hsi implements esi {
    public final oq a;
    public final x0 b;
    public final fkn c;
    public final fkn d;

    public hsi(oq oqVar, mm6 mm6Var, zri zriVar, x0 x0Var) {
        this.a = oqVar;
        this.b = x0Var;
        oq7 oq7Var = zriVar.b;
        this.c = zsd.F0(new kvh(zsd.b0(new njf(oq7Var.a.c, oqVar, 10)), 8), mm6Var, new hdr(0L, Long.MAX_VALUE), lzs.a);
        this.d = zsd.F0(new njf(zsd.b0(new njf(oq7Var.a.c, oqVar, 10)), this, 13), mm6Var, new hdr(0L, Long.MAX_VALUE), new zcj(""));
    }

    @Override // defpackage.esi
    public final void a() {
        String t = weo.t();
        x0 x0Var = this.b;
        t1f t1fVar = (t1f) x0Var.c;
        pui puiVar = (pui) t1fVar.b;
        puiVar.getClass();
        t.getClass();
        z5l b = puiVar.b();
        oq oqVar = this.a;
        String str = oqVar.a;
        if (b.b(str)) {
            puiVar.b().i(false);
        } else {
            asq.t(puiVar.b().d(puiVar.a(oqVar, null, t).b(), true, uyk.a), puiVar.a, new p1n(8));
        }
        pgf pgfVar = (pgf) t1fVar.d;
        int i = x0Var.b;
        o70 o70Var = (o70) x0Var.d;
        nmb nmbVar = pgfVar.b;
        wjb wjbVar = wjb.MyShelfScreen;
        String G = pgfVar.a.G();
        String str2 = o70Var.a;
        String str3 = o70Var.b;
        pkb pkbVar = pkb.Audiobook;
        nmb.z(nmbVar, G, wjbVar, null, null, null, null, 0, false, str2, str3, 0, "audiobook", str, i + 1, t, 19708);
    }

    @Override // defpackage.esi
    public final vdr c() {
        return this.c;
    }

    @Override // defpackage.esi
    public final boolean d() {
        pui puiVar = (pui) ((t1f) this.b.c).b;
        puiVar.getClass();
        oq oqVar = this.a;
        lt B = lxe.B(oqVar);
        y supportFragmentManager = puiVar.a.getSupportFragmentManager();
        supportFragmentManager.getClass();
        rre.Y(B, supportFragmentManager, puiVar.a, puiVar.c, puiVar.b, oqVar, true);
        return true;
    }

    @Override // defpackage.esi
    public final void e() {
        pui puiVar = (pui) ((t1f) this.b.c).b;
        puiVar.getClass();
        oq oqVar = this.a;
        lt B = lxe.B(oqVar);
        y supportFragmentManager = puiVar.a.getSupportFragmentManager();
        supportFragmentManager.getClass();
        rre.Y(B, supportFragmentManager, puiVar.a, puiVar.c, puiVar.b, oqVar, true);
    }

    @Override // defpackage.esi
    public final vdr g() {
        return this.d;
    }
}

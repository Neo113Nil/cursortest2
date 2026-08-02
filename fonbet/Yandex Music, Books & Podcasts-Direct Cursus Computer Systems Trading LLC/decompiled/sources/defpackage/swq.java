package defpackage;

import com.yandex.music.shared.slides.ui.music.logic.impl.network.SlidesHttpApi;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class swq extends qwq {
    public final nnd k;
    public final tmb l;
    public final zvq m;
    public final atn n;
    public final boolean o;
    public final pdp p;
    public final rjp q;
    public final fwq r;
    public final x26 s;
    public final sfm t;
    public final x3n u;
    public final rdk v;
    public final sfm w;
    public final xdr x;
    public final xdr y;

    public swq(nnd nndVar, tmb tmbVar, pjc pjcVar, zvq zvqVar, atn atnVar, cc7 cc7Var, frt frtVar, i0j i0jVar, z66 z66Var, boolean z) {
        pjcVar.getClass();
        cc7Var.getClass();
        frtVar.getClass();
        i0jVar.getClass();
        z66Var.getClass();
        this.k = nndVar;
        this.l = tmbVar;
        this.m = zvqVar;
        this.n = atnVar;
        this.o = z;
        pdp pdpVar = new pdp(ot0.F(this), cc7Var, frtVar);
        this.p = pdpVar;
        rjp rjpVar = new rjp();
        rjpVar.a = ydr.a(c5b.a);
        rjpVar.b = new LinkedHashMap();
        this.q = rjpVar;
        fwq fwqVar = new fwq();
        this.r = fwqVar;
        this.s = new x26();
        cq4 F = ot0.F(this);
        sfm sfmVar = new sfm();
        sfmVar.a = pdpVar;
        sfmVar.b = new ConcurrentHashMap();
        sfmVar.c = new ovn();
        x97.y(F, null, null, new glp(sfmVar, null, 10), 3);
        this.t = sfmVar;
        fkn u0 = lg3.u0(pjcVar, ot0.F(this), new v5t(false, false));
        x3n x3nVar = new x3n();
        x3nVar.a = nndVar;
        x3nVar.b = ydr.a(0);
        x3nVar.d = ydr.a(c5b.a);
        this.u = x3nVar;
        this.v = new rdk(fwqVar, u0);
        SlidesHttpApi slidesHttpApi = (SlidesHttpApi) i0j.a(i0jVar, null, new xnq(16), new nrq(3), null, 51).a.b(SlidesHttpApi.class);
        slidesHttpApi.getClass();
        z66Var.getClass();
        sfm sfmVar2 = new sfm();
        sfmVar2.a = slidesHttpApi;
        sfmVar2.b = z66Var;
        sfmVar2.c = atnVar;
        this.w = sfmVar2;
        xdr a = ydr.a(jwq.a);
        this.x = a;
        this.y = a;
        R();
    }

    @Override // defpackage.qwq
    public final ccg G() {
        return this.k;
    }

    @Override // defpackage.qwq
    public final pdp H() {
        return this.p;
    }

    @Override // defpackage.qwq
    public final rjp J() {
        return this.q;
    }

    @Override // defpackage.qwq
    public final x26 K() {
        return this.s;
    }

    @Override // defpackage.qwq
    public final fwq L() {
        return this.r;
    }

    @Override // defpackage.qwq
    public final xdr M() {
        return this.y;
    }

    @Override // defpackage.qwq
    public final rdk N() {
        return this.v;
    }

    @Override // defpackage.qwq
    public final sfm O() {
        return this.t;
    }

    @Override // defpackage.qwq
    public final x3n P() {
        return this.u;
    }

    @Override // defpackage.qwq
    public final void R() {
        xdr xdrVar = this.x;
        xdrVar.getClass();
        xdrVar.m(null, jwq.a);
        x97.y(ot0.F(this), null, null, new fpq(this, (Continuation) null, 3), 3);
    }
}

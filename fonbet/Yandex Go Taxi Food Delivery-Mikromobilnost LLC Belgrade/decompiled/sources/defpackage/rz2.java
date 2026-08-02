package defpackage;

import android.content.Context;
import com.yandex.go.address.position_confirmation.j;
import com.yandex.go.address.search.common.domain.interactor.a;
import ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.d;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.am.f0;
import ru.yandex.taxi.design.utils.b;
import ru.yandex.taxi.preorder.source.domain.u;
import ru.yandex.taxi.preorder.source.mode.interactor.e;
import ru.yandex.taxi.preorder.suggested.i;
import ru.yandex.taxi.search.c;
import ru.yandex.taxi.summary.ui.SummaryStateTracker;

/* loaded from: classes6.dex */
public final class rz2 implements v7p {
    public final xvf0 A;
    public final /* synthetic */ int a = 0;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;
    public final xvf0 h;
    public final xvf0 i;
    public final xvf0 j;
    public final xvf0 k;
    public final xvf0 l;
    public final xvf0 m;
    public final xvf0 n;
    public final xvf0 o;
    public final xvf0 p;
    public final xvf0 q;
    public final xvf0 r;
    public final xvf0 s;
    public final xvf0 t;
    public final xvf0 u;
    public final xvf0 v;
    public final xvf0 w;
    public final xvf0 x;
    public final v7p y;
    public final xvf0 z;

    public rz2(t0g t0gVar, xvf0 xvf0Var, nup0 nup0Var, v0g v0gVar, b1g b1gVar, w0g w0gVar, w0g w0gVar2, x0g x0gVar, kpp0 kpp0Var, xvf0 xvf0Var2, gpx0 gpx0Var, v0g v0gVar2, v0g v0gVar3, u0g u0gVar, u0g u0gVar2, z0g z0gVar, v0g v0gVar4, u0g u0gVar3, xvf0 xvf0Var3, v0g v0gVar5, xvf0 xvf0Var4, g0g g0gVar, t0g t0gVar2, rct0 rct0Var, u0g u0gVar4, a1g a1gVar) {
        this.p = t0gVar;
        this.b = xvf0Var;
        this.c = nup0Var;
        this.d = v0gVar;
        this.e = b1gVar;
        this.q = w0gVar;
        this.f = w0gVar2;
        this.g = x0gVar;
        this.h = kpp0Var;
        this.i = xvf0Var2;
        this.r = gpx0Var;
        this.s = v0gVar2;
        this.t = v0gVar3;
        this.j = u0gVar;
        this.k = u0gVar2;
        this.u = z0gVar;
        this.v = v0gVar4;
        this.w = u0gVar3;
        this.l = xvf0Var3;
        this.m = v0gVar5;
        this.n = xvf0Var4;
        this.x = g0gVar;
        this.o = t0gVar2;
        this.y = rct0Var;
        this.z = u0gVar4;
        this.A = a1gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        v7p v7pVar = this.y;
        xvf0 xvf0Var = this.o;
        xvf0 xvf0Var2 = this.x;
        xvf0 xvf0Var3 = this.n;
        xvf0 xvf0Var4 = this.m;
        xvf0 xvf0Var5 = this.l;
        xvf0 xvf0Var6 = this.v;
        xvf0 xvf0Var7 = this.u;
        xvf0 xvf0Var8 = this.k;
        xvf0 xvf0Var9 = this.j;
        xvf0 xvf0Var10 = this.t;
        xvf0 xvf0Var11 = this.s;
        xvf0 xvf0Var12 = this.r;
        xvf0 xvf0Var13 = this.h;
        xvf0 xvf0Var14 = this.g;
        xvf0 xvf0Var15 = this.f;
        xvf0 xvf0Var16 = this.q;
        xvf0 xvf0Var17 = this.e;
        xvf0 xvf0Var18 = this.d;
        xvf0 xvf0Var19 = this.c;
        xvf0 xvf0Var20 = this.b;
        xvf0 xvf0Var21 = this.p;
        switch (i) {
            case 0:
                b bVar = (b) ((kpp0) xvf0Var21).get();
                i iVar = (i) ((k51) xvf0Var16).get();
                v7b0 v7b0Var = (v7b0) ((q150) xvf0Var12).get();
                mav0 mav0Var = (mav0) ((sit0) xvf0Var11).get();
                mbv0 mbv0Var = (mbv0) ((m580) xvf0Var10).get();
                a aVar = (a) ((im21) xvf0Var7).get();
                oxg oxgVar = (oxg) ((wif) xvf0Var6).get();
                fhf fhfVar = (fhf) ((zfa) this.w).get();
                rwp0 rwp0Var = (rwp0) ((lk) xvf0Var2).get();
                s3o s3oVar = (s3o) xvf0Var20.get();
                f3o f3oVar = (f3o) ((oti) v7pVar).get();
                w4l0 w4l0Var = (w4l0) xvf0Var19.get();
                c cVar = (c) xvf0Var18.get();
                return new qz2(bVar, iVar, v7b0Var, mav0Var, mbv0Var, aVar, oxgVar, fhfVar, rwp0Var, s3oVar, f3oVar, w4l0Var, (nbv0) xvf0Var17.get(), cVar, (h51) xvf0Var15.get(), (prj0) xvf0Var14.get(), (qoi) xvf0Var13.get(), this.i, (oep0) xvf0Var9.get(), (d6v0) xvf0Var8.get(), (h4v0) xvf0Var5.get(), (dkv0) xvf0Var4.get(), (SourcePicker) ((s51) this.z).get(), (mxb) xvf0Var3.get(), (pav0) xvf0Var.get(), (com.yandex.go.address.search.perf.c) ((vyf) this.A).get());
            case 1:
                dqe0 dqe0Var = (dqe0) xvf0Var20.get();
                nzb0 nzb0Var = (nzb0) xvf0Var19.get();
                oep0 oep0Var = (oep0) xvf0Var18.get();
                e eVar = (e) xvf0Var17.get();
                wiq0 wiq0Var = (wiq0) xvf0Var15.get();
                com.yandex.go.route.interactor.c cVar2 = (com.yandex.go.route.interactor.c) xvf0Var14.get();
                tit0 tit0Var = (tit0) xvf0Var13.get();
                com.yandex.go.navigation.screen.c cVar3 = (com.yandex.go.navigation.screen.c) this.i.get();
                c9l0 c9l0Var = (c9l0) xvf0Var9.get();
                AddressResolveRepository addressResolveRepository = (AddressResolveRepository) xvf0Var8.get();
                agt0 agt0Var = (agt0) xvf0Var5.get();
                ru.yandex.taxi.e eVar2 = (ru.yandex.taxi.e) xvf0Var4.get();
                q4 q4Var = (q4) xvf0Var3.get();
                return new xvw(dqe0Var, nzb0Var, oep0Var, eVar, wiq0Var, cVar2, tit0Var, cVar3, c9l0Var, addressResolveRepository, agt0Var, eVar2, q4Var, (biv0) xvf0Var21.get(), (lgv0) xvf0Var16.get(), (hp0) xvf0Var12.get(), (ru.yandex.taxi.routeselector.a) xvf0Var11.get(), (jev0) xvf0Var10.get(), (avd0) xvf0Var7.get(), (j) xvf0Var6.get(), (ru.yandex.taxi.preorder.source.data.c) this.w.get(), (rei) xvf0Var2.get(), (u) ((pp0) v7pVar).get(), (mzb) this.z.get(), (com.yandex.go.taxi.summary.map.walkingroute.e) ((qd21) this.A).get());
            case 2:
                return new ru.yandex.logistics.sdk.cargo_form.impl.domain.c((st2) xvf0Var20.get(), (xhp0) xvf0Var19.get(), (dv8) xvf0Var18.get(), (p6s) xvf0Var17.get(), (r61) ((gc) xvf0Var21).get(), (mrj) ((s90) xvf0Var16).get(), (boj0) ((ncb) xvf0Var12).get(), (ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.a) ((zs0) xvf0Var11).get(), (q4g) ((qrb) xvf0Var10).get(), (u1n) ((k0n) xvf0Var7).get(), i5m.a((wvq) xvf0Var6), (x230) xvf0Var15.get(), (aye0) ((upk0) this.w).get(), (o5s) xvf0Var14.get(), (p1f) xvf0Var13.get(), (r3s) this.i.get(), (mv8) xvf0Var9.get(), (com.yandex.delivery.utils.storage.impl.c) xvf0Var8.get(), (ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.j) ((gc) xvf0Var2).get(), i5m.a(xvf0Var5), (z3s) xvf0Var4.get(), (h0w) ((p4) v7pVar).get(), (d) ((sb1) this.z).get(), (ddf) ((c1) this.A).get(), (q1f) xvf0Var3.get(), (kw8) xvf0Var.get());
            case 3:
                return new mkx0((i130) xvf0Var20.get(), (Context) ((t0g) xvf0Var21).get(), (gkx0) ((n3w) xvf0Var16).a, (i1g) xvf0Var19.get(), (h1g) xvf0Var18.get(), (vev0) xvf0Var17.get(), (c4r0) xvf0Var15.get(), (z880) xvf0Var14.get(), (com.yandex.go.route.interactor.c) xvf0Var13.get(), (wiq0) ((w0g) xvf0Var12).get(), (rf5) this.i.get(), i5m.a(xvf0Var9), (set0) xvf0Var8.get(), (rft0) xvf0Var5.get(), (dqe0) ((w0g) xvf0Var11).get(), (rgt0) xvf0Var4.get(), (n3o) ((k0n) xvf0Var10).get(), (noe) xvf0Var3.get(), (com.yandex.go.route.interactor.b) xvf0Var.get(), (ah00) xvf0Var7.get(), (suh) xvf0Var6.get(), this.w, (fwu0) xvf0Var2.get(), (lcv0) ((fat0) v7pVar).get(), (xcv0) this.z.get(), (SummaryStateTracker) this.A.get());
            default:
                Context context = (Context) ((t0g) xvf0Var21).get();
                crg crgVar = (crg) xvf0Var20.get();
                jtq0 jtq0Var = (jtq0) xvf0Var19.get();
                j5z j5zVar = (j5z) xvf0Var18.get();
                exu0 exu0Var = (exu0) xvf0Var17.get();
                dqe0 dqe0Var2 = (dqe0) ((w0g) xvf0Var16).get();
                zuj0 zuj0Var = (zuj0) xvf0Var15.get();
                pwy0 pwy0Var = (pwy0) xvf0Var14.get();
                b bVar2 = (b) xvf0Var13.get();
                ru.yandex.taxi.widget.utils.e eVar3 = (ru.yandex.taxi.widget.utils.e) this.i.get();
                com.yandex.go.transfer_requirement.transferapi.a aVar2 = (com.yandex.go.transfer_requirement.transferapi.a) ((gpx0) xvf0Var12).get();
                ru.yandex.taxi.styling.c cVar4 = (ru.yandex.taxi.styling.c) ((v0g) xvf0Var11).get();
                aw70 aw70Var = (aw70) ((v0g) xvf0Var10).get();
                ru.yandex.taxi.widget.c cVar5 = (ru.yandex.taxi.widget.c) xvf0Var9.get();
                pho phoVar = (pho) xvf0Var8.get();
                f0 f0Var = (f0) ((z0g) xvf0Var7).get();
                ru.yandex.taxi.orderforanother.repository.a aVar3 = (ru.yandex.taxi.orderforanother.repository.a) ((v0g) xvf0Var6).get();
                rqo rqoVar = (rqo) ((u0g) this.w).get();
                gvz0 gvz0Var = (gvz0) xvf0Var5.get();
                i130 i130Var = (i130) xvf0Var4.get();
                vp01 vp01Var = (vp01) xvf0Var3.get();
                tu tuVar = (tu) ((g0g) xvf0Var2).get();
                k1a k1aVar = (k1a) ((rct0) v7pVar).get();
                return new e6g(context, crgVar, jtq0Var, j5zVar, exu0Var, dqe0Var2, zuj0Var, pwy0Var, bVar2, eVar3, aVar2, cVar4, aw70Var, cVar5, phoVar, f0Var, aVar3, rqoVar, gvz0Var, i130Var, vp01Var, tuVar, k1aVar);
        }
    }

    public rz2(xvf0 xvf0Var, xvf0 xvf0Var2, eqh eqhVar, eqh eqhVar2, xvf0 xvf0Var3, qxu0 qxu0Var, xvf0 xvf0Var4, xvf0 xvf0Var5, eqh eqhVar3, n3w n3wVar, wjr0 wjr0Var, xvf0 xvf0Var6, c1 c1Var, sb1 sb1Var, xvf0 xvf0Var7, dk dkVar, x xVar, eqh eqhVar4, xvf0 xvf0Var8, g970 g970Var, eqh eqhVar5, xvf0 xvf0Var9, fwc fwcVar, pp0 pp0Var, nzb nzbVar, qd21 qd21Var) {
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = eqhVar;
        this.e = eqhVar2;
        this.f = xvf0Var3;
        this.g = qxu0Var;
        this.h = xvf0Var4;
        this.i = xvf0Var5;
        this.j = eqhVar3;
        this.k = n3wVar;
        this.l = wjr0Var;
        this.m = xvf0Var6;
        this.n = c1Var;
        this.o = sb1Var;
        this.p = xvf0Var7;
        this.q = dkVar;
        this.r = xVar;
        this.s = eqhVar4;
        this.t = xvf0Var8;
        this.u = g970Var;
        this.v = eqhVar5;
        this.w = xvf0Var9;
        this.x = fwcVar;
        this.y = pp0Var;
        this.z = nzbVar;
        this.A = qd21Var;
    }

    public rz2(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, gc gcVar, s90 s90Var, ncb ncbVar, zs0 zs0Var, qrb qrbVar, k0n k0nVar, wvq wvqVar, xvf0 xvf0Var5, upk0 upk0Var, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, gc gcVar2, xvf0 xvf0Var11, xvf0 xvf0Var12, p4 p4Var, sb1 sb1Var, c1 c1Var, xvf0 xvf0Var13, xvf0 xvf0Var14) {
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.p = gcVar;
        this.q = s90Var;
        this.r = ncbVar;
        this.s = zs0Var;
        this.t = qrbVar;
        this.u = k0nVar;
        this.v = wvqVar;
        this.f = xvf0Var5;
        this.w = upk0Var;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
        this.i = xvf0Var8;
        this.j = xvf0Var9;
        this.k = xvf0Var10;
        this.x = gcVar2;
        this.l = xvf0Var11;
        this.m = xvf0Var12;
        this.y = p4Var;
        this.z = sb1Var;
        this.A = c1Var;
        this.n = xvf0Var13;
        this.o = xvf0Var14;
    }

    public rz2(kpp0 kpp0Var, k51 k51Var, q150 q150Var, sit0 sit0Var, m580 m580Var, im21 im21Var, wif wifVar, zfa zfaVar, lk lkVar, xvf0 xvf0Var, oti otiVar, n3w n3wVar, k220 k220Var, l9t0 l9t0Var, rxf rxfVar, zni0 zni0Var, vyf vyfVar, vyf vyfVar2, vyf vyfVar3, vyf vyfVar4, pmn0 pmn0Var, vyf vyfVar5, s51 s51Var, rxf rxfVar2, xvf0 xvf0Var2, vyf vyfVar6) {
        this.p = kpp0Var;
        this.q = k51Var;
        this.r = q150Var;
        this.s = sit0Var;
        this.t = m580Var;
        this.u = im21Var;
        this.v = wifVar;
        this.w = zfaVar;
        this.x = lkVar;
        this.b = xvf0Var;
        this.y = otiVar;
        this.c = n3wVar;
        this.d = k220Var;
        this.e = l9t0Var;
        this.f = rxfVar;
        this.g = zni0Var;
        this.h = vyfVar;
        this.i = vyfVar2;
        this.j = vyfVar3;
        this.k = vyfVar4;
        this.l = pmn0Var;
        this.m = vyfVar5;
        this.z = s51Var;
        this.n = rxfVar2;
        this.o = xvf0Var2;
        this.A = vyfVar6;
    }

    public rz2(v0g v0gVar, t0g t0gVar, n3w n3wVar, f1g f1gVar, f1g f1gVar2, n3w n3wVar2, a1g a1gVar, eqh eqhVar, b1g b1gVar, w0g w0gVar, g0g g0gVar, b1g b1gVar2, a1g a1gVar2, a1g a1gVar3, w0g w0gVar2, a1g a1gVar4, k0n k0nVar, g0g g0gVar2, w0g w0gVar3, y0g y0gVar, xvf0 xvf0Var, g0g g0gVar3, nwf nwfVar, fat0 fat0Var, vrt0 vrt0Var, xvf0 xvf0Var2) {
        this.b = v0gVar;
        this.p = t0gVar;
        this.q = n3wVar;
        this.c = f1gVar;
        this.d = f1gVar2;
        this.e = n3wVar2;
        this.f = a1gVar;
        this.g = eqhVar;
        this.h = b1gVar;
        this.r = w0gVar;
        this.i = g0gVar;
        this.j = b1gVar2;
        this.k = a1gVar2;
        this.l = a1gVar3;
        this.s = w0gVar2;
        this.m = a1gVar4;
        this.t = k0nVar;
        this.n = g0gVar2;
        this.o = w0gVar3;
        this.u = y0gVar;
        this.v = xvf0Var;
        this.w = g0gVar3;
        this.x = nwfVar;
        this.y = fat0Var;
        this.z = vrt0Var;
        this.A = xvf0Var2;
    }
}

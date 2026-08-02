package defpackage;

import android.app.Application;
import android.content.Context;
import com.yandex.go.masstransit.sdk.core.MasstransitSdkEnvironment;
import com.yandex.go.masstransit.sdk.payment.spec.MasstransitSdkSpecException;
import com.yandex.go.payments.data.k;
import com.yandex.go.payments.experiments.g;
import com.yandex.go.payments.menu.domain.c;
import com.yandex.go.payments.shared.a;
import ru.yandex.taxi.deeplinks.b;
import ru.yandex.taxi.logistics.sdk.o;
import ru.yandex.taxi.widget.d;

/* loaded from: classes.dex */
public final class q2p implements v7p {
    public final /* synthetic */ int a;
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

    public /* synthetic */ q2p(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, xvf0 xvf0Var11, xvf0 xvf0Var12, xvf0 xvf0Var13, v7p v7pVar, v7p v7pVar2, xvf0 xvf0Var14, xvf0 xvf0Var15, xvf0 xvf0Var16, xvf0 xvf0Var17, xvf0 xvf0Var18, xvf0 xvf0Var19, xvf0 xvf0Var20, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
        this.i = xvf0Var8;
        this.j = xvf0Var9;
        this.k = xvf0Var10;
        this.l = xvf0Var11;
        this.m = xvf0Var12;
        this.n = xvf0Var13;
        this.o = v7pVar;
        this.p = v7pVar2;
        this.q = xvf0Var14;
        this.r = xvf0Var15;
        this.s = xvf0Var16;
        this.t = xvf0Var17;
        this.u = xvf0Var18;
        this.v = xvf0Var19;
        this.w = xvf0Var20;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.v;
        xvf0 xvf0Var3 = this.r;
        xvf0 xvf0Var4 = this.p;
        xvf0 xvf0Var5 = this.o;
        xvf0 xvf0Var6 = this.n;
        xvf0 xvf0Var7 = this.m;
        xvf0 xvf0Var8 = this.l;
        xvf0 xvf0Var9 = this.k;
        xvf0 xvf0Var10 = this.j;
        xvf0 xvf0Var11 = this.i;
        xvf0 xvf0Var12 = this.f;
        xvf0 xvf0Var13 = this.e;
        xvf0 xvf0Var14 = this.d;
        xvf0 xvf0Var15 = this.w;
        xvf0 xvf0Var16 = this.u;
        xvf0 xvf0Var17 = this.t;
        xvf0 xvf0Var18 = this.s;
        xvf0 xvf0Var19 = this.q;
        xvf0 xvf0Var20 = this.h;
        xvf0 xvf0Var21 = this.b;
        switch (i) {
            case 0:
                return new p2p((i6r) xvf0Var21.get(), this.c, this.d, this.e, this.f, this.g, (yi7) xvf0Var20.get(), this.i, this.j, this.k, this.l, i5m.a(xvf0Var7), this.n, this.o, this.p, (kdn) xvf0Var19.get(), this.r, (rit) xvf0Var18.get(), (kwq0) xvf0Var17.get(), (b) xvf0Var16.get(), this.v, (edn) ((upj) xvf0Var15).get());
            case 1:
                return new o((Application) xvf0Var21.get(), i5m.a(xvf0Var), i5m.a(xvf0Var14), i5m.a(xvf0Var13), i5m.a(xvf0Var12), i5m.a(this.g), (tt2) xvf0Var20.get(), (jtq0) xvf0Var11.get(), (ip11) xvf0Var10.get(), i5m.a(xvf0Var9), i5m.a(xvf0Var8), i5m.a(xvf0Var7), i5m.a(xvf0Var6), i5m.a(xvf0Var5), (bni) xvf0Var4.get(), (fva0) xvf0Var19.get(), i5m.a(xvf0Var3), i5m.a(xvf0Var18), (vp21) xvf0Var17.get(), i5m.a(xvf0Var16), i5m.a(xvf0Var2), i5m.a(xvf0Var15));
            case 2:
                return new com.yandex.go.payments.menu.navigation.b((xku0) xvf0Var21.get(), this.c, (vj4) xvf0Var14.get(), (o8h) xvf0Var13.get(), (qmp) xvf0Var12.get(), this.g, (c750) xvf0Var20.get(), (com.yandex.go.payments.superapp.payment.b) xvf0Var11.get(), i5m.a(xvf0Var10), (ryz) xvf0Var9.get(), i5m.a(xvf0Var8), this.m, (raa0) xvf0Var6.get(), (a) xvf0Var5.get(), (c) ((b900) xvf0Var16).get(), i5m.a(xvf0Var4), i5m.a((bvx) xvf0Var2), i5m.a(xvf0Var19), i5m.a(xvf0Var3), (k) xvf0Var18.get(), (g) ((ec80) xvf0Var15).get(), (f9y0) xvf0Var17.get());
            case 3:
                Context context = (Context) xvf0Var21.get();
                u02 u02Var = (u02) xvf0Var.get();
                ru.yandex.taxi.am.g gVar = (ru.yandex.taxi.am.g) xvf0Var14.get();
                ru.yandex.taxi.am.token.a aVar = (ru.yandex.taxi.am.token.a) xvf0Var13.get();
                on2 on2Var = (on2) xvf0Var12.get();
                Object obj = (tt2) this.g.get();
                hit hitVar = (hit) xvf0Var20.get();
                pav pavVar = (pav) xvf0Var11.get();
                d dVar = (d) xvf0Var10.get();
                k7x0 k7x0Var = (k7x0) xvf0Var9.get();
                eyu0 eyu0Var = (eyu0) xvf0Var8.get();
                yp2 yp2Var = (yp2) xvf0Var7.get();
                yqg yqgVar = (yqg) xvf0Var6.get();
                pwy0 pwy0Var = (pwy0) xvf0Var5.get();
                cot cotVar = (cot) ((e4f) xvf0Var16).get();
                zuj0 zuj0Var = (zuj0) xvf0Var4.get();
                ru.yandex.taxi.widget.c cVar = (ru.yandex.taxi.widget.c) xvf0Var19.get();
                o370 o370Var = (o370) ((fpp0) xvf0Var2).get();
                o370 o370Var2 = (o370) ((n6o0) xvf0Var15).get();
                wnt wntVar = (wnt) xvf0Var3.get();
                eex eexVar = (eex) xvf0Var18.get();
                ru.yandex.taxi.stories.domain.b bVar = (ru.yandex.taxi.stories.domain.b) xvf0Var17.get();
                kj Ig = gVar.a.Ig();
                String c = aVar.c();
                u02Var.getClass();
                MasstransitSdkEnvironment masstransitSdkEnvironment = MasstransitSdkEnvironment.PRODUCTION;
                gl21 gl21Var = new gl21(Ig != null ? String.valueOf(Ig.a) : null, c, 4);
                lf10 lf10Var = new lf10(pavVar, dVar, k7x0Var, eyu0Var, yp2Var, zuj0Var, cVar, pwy0Var);
                dnt dntVar = new dnt();
                lf10Var.invoke(dntVar);
                new a6z();
                qc20 qc20Var = new qc20(hitVar);
                if (obj == null) {
                    obj = i410.a;
                }
                Object obj2 = obj;
                pav pavVar2 = dntVar.a;
                if (pavVar2 == null) {
                    throw new MasstransitSdkSpecException("ImageLoader not provided");
                }
                d dVar2 = dntVar.b;
                if (dVar2 == null) {
                    throw new MasstransitSdkSpecException("LottieAnimationLoader not provided");
                }
                k7x0 k7x0Var2 = dntVar.c;
                if (k7x0Var2 == null) {
                    throw new MasstransitSdkSpecException("TagUrlFormatter not provided");
                }
                if (dntVar.d == null) {
                    throw new MasstransitSdkSpecException("StyleProvider not provided");
                }
                yp2 yp2Var2 = dntVar.e;
                if (yp2Var2 == null) {
                    throw new MasstransitSdkSpecException("AppColorConverter not provided");
                }
                zuj0 zuj0Var2 = dntVar.f;
                if (zuj0Var2 == null) {
                    throw new MasstransitSdkSpecException("ResourcesProxy not provided");
                }
                ru.yandex.taxi.widget.c cVar2 = dntVar.h;
                if (cVar2 == null) {
                    throw new MasstransitSdkSpecException("FormattedTextConverter not provided");
                }
                Object obj3 = dntVar.g;
                if (obj3 == null) {
                    obj3 = ify.a;
                }
                n1d n1dVar = new n1d(pavVar2, dVar2, k7x0Var2, yp2Var2, obj3, cVar2, zuj0Var2);
                if (yqgVar == null) {
                    throw new MasstransitSdkSpecException("DateFormatter not provided");
                }
                au50 au50Var = new au50(yqgVar, cotVar);
                if (wntVar == null) {
                    ny61.g("Required value was null.");
                } else if (eexVar == null) {
                    ny61.g("Required value was null.");
                } else {
                    if (bVar != null) {
                        return new h410(new hhw(new j410(context, masstransitSdkEnvironment, gl21Var, on2Var, obj2, qc20Var, n1dVar, au50Var, o370Var, o370Var2, wntVar, eexVar, bVar)));
                    }
                    ny61.g("Required value was null.");
                }
                return null;
            default:
                Context context2 = (Context) xvf0Var21.get();
                pho phoVar = (pho) xvf0Var14.get();
                yi7 yi7Var = (yi7) xvf0Var13.get();
                pg7 pg7Var = (pg7) xvf0Var12.get();
                xdf xdfVar = (xdf) this.g.get();
                nf7 nf7Var = (nf7) xvf0Var20.get();
                pav pavVar3 = (pav) xvf0Var11.get();
                jgv jgvVar = (jgv) xvf0Var10.get();
                sgu0 sgu0Var = (sgu0) xvf0Var9.get();
                k7x0 k7x0Var3 = (k7x0) xvf0Var8.get();
                jim jimVar = (jim) xvf0Var7.get();
                k48 k48Var = (k48) xvf0Var6.get();
                iqz iqzVar = (iqz) xvf0Var3.get();
                ((nma) xvf0Var15).get();
                return new tx70(context2, phoVar, yi7Var, pg7Var, xdfVar, nf7Var, pavVar3, jgvVar, sgu0Var, k7x0Var3, jimVar, k48Var, iqzVar);
        }
    }

    public q2p(n3w n3wVar, xvf0 xvf0Var, eqh eqhVar, eqh eqhVar2, eqh eqhVar3, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, e4f e4fVar, xvf0 xvf0Var9, e4f e4fVar2, xvf0 xvf0Var10, xvf0 xvf0Var11, fpp0 fpp0Var, n6o0 n6o0Var, xvf0 xvf0Var12, etx etxVar, uq2 uq2Var) {
        this.a = 3;
        this.b = n3wVar;
        this.c = xvf0Var;
        this.d = eqhVar;
        this.e = eqhVar2;
        this.f = eqhVar3;
        this.g = xvf0Var2;
        this.h = xvf0Var3;
        this.i = xvf0Var4;
        this.j = xvf0Var5;
        this.k = xvf0Var6;
        this.l = xvf0Var7;
        this.m = xvf0Var8;
        this.n = e4fVar;
        this.o = xvf0Var9;
        this.u = e4fVar2;
        this.p = xvf0Var10;
        this.q = xvf0Var11;
        this.v = fpp0Var;
        this.w = n6o0Var;
        this.r = xvf0Var12;
        this.s = etxVar;
        this.t = uq2Var;
    }

    public q2p(awp0 awp0Var, qxu0 qxu0Var, sx2 sx2Var, uq2 uq2Var, xvf0 xvf0Var, tc tcVar, xvf0 xvf0Var2, le30 le30Var, c7c0 c7c0Var, xvf0 xvf0Var3, jc60 jc60Var, xcz xczVar, ec80 ec80Var, o10 o10Var, b900 b900Var, xvf0 xvf0Var4, bvx bvxVar, xvf0 xvf0Var5, ec80 ec80Var2, kpp0 kpp0Var, ec80 ec80Var3, n3w n3wVar) {
        this.a = 2;
        this.b = awp0Var;
        this.c = qxu0Var;
        this.d = sx2Var;
        this.e = uq2Var;
        this.f = xvf0Var;
        this.g = tcVar;
        this.h = xvf0Var2;
        this.i = le30Var;
        this.j = c7c0Var;
        this.k = xvf0Var3;
        this.l = jc60Var;
        this.m = xczVar;
        this.n = ec80Var;
        this.o = o10Var;
        this.u = b900Var;
        this.p = xvf0Var4;
        this.v = bvxVar;
        this.q = xvf0Var5;
        this.r = ec80Var2;
        this.s = kpp0Var;
        this.w = ec80Var3;
        this.t = n3wVar;
    }
}

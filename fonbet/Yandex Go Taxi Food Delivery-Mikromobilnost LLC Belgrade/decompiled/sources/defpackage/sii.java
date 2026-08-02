package defpackage;

import android.app.Application;
import android.content.Context;
import android.view.ViewGroup;
import com.yandex.go.intentprocessor.i;
import com.yandex.go.order.external.b;
import com.yandex.go.order.external.tracking.h;
import com.yandex.go.splash.dynamic.c;
import com.yandex.go.taxi.order.multi.a;
import com.yandex.passport.sloth.ui.dependencies.m;
import ru.yandex.taxi.deeplinks.f;
import ru.yandex.taxi.settings.activity.MenuRouterStateChangeListener;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes9.dex */
public final class sii implements v7p {
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

    public sii(xvf0 xvf0Var, eqh eqhVar, tc tcVar, le30 le30Var, eqh eqhVar2, ec80 ec80Var, e8b0 e8b0Var, eqh eqhVar3, gga0 gga0Var, xvf0 xvf0Var2, c8w c8wVar, y500 y500Var, xvf0 xvf0Var3) {
        this.a = 9;
        this.b = xvf0Var;
        this.c = eqhVar;
        this.d = le30Var;
        this.e = eqhVar2;
        this.f = ec80Var;
        this.g = e8b0Var;
        this.h = eqhVar3;
        this.i = gga0Var;
        this.j = xvf0Var2;
        this.k = c8wVar;
        this.l = y500Var;
        this.m = xvf0Var3;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.k;
        xvf0 xvf0Var2 = this.i;
        xvf0 xvf0Var3 = this.h;
        xvf0 xvf0Var4 = this.f;
        xvf0 xvf0Var5 = this.m;
        xvf0 xvf0Var6 = this.l;
        xvf0 xvf0Var7 = this.j;
        xvf0 xvf0Var8 = this.g;
        xvf0 xvf0Var9 = this.e;
        xvf0 xvf0Var10 = this.d;
        xvf0 xvf0Var11 = this.c;
        xvf0 xvf0Var12 = this.b;
        switch (i) {
            case 0:
                return new rii();
            case 1:
                return new c((jtq0) xvf0Var12.get(), (pav) xvf0Var11.get(), (dne0) xvf0Var10.get(), (tt2) xvf0Var9.get(), (e9n) xvf0Var4.get(), (gqt0) xvf0Var8.get(), (f9n) xvf0Var3.get(), (e2t) xvf0Var2.get(), (bg5) xvf0Var7.get(), (po21) xvf0Var.get(), (xv11) xvf0Var6.get(), (nbj) xvf0Var5.get());
            case 2:
                return new fn6((Context) xvf0Var12.get(), (on2) xvf0Var11.get(), (ah00) xvf0Var10.get(), (tt2) xvf0Var9.get(), (ky2) xvf0Var4.get(), (e) xvf0Var8.get(), (czf0) xvf0Var3.get(), (lx4) xvf0Var2.get(), (pwy0) xvf0Var7.get(), (ru.yandex.taxi.widget.c) xvf0Var.get(), (po21) xvf0Var6.get(), (rqo) xvf0Var5.get());
            case 3:
                return new h(i5m.a(xvf0Var12), (jy11) xvf0Var11.get(), (ky11) xvf0Var10.get(), (tt2) xvf0Var9.get(), (x2p) xvf0Var4.get(), i5m.a(xvf0Var8), (ru.yandex.taxi.launch.c) xvf0Var3.get(), (f3p) xvf0Var2.get(), (v1p) xvf0Var7.get(), (b) xvf0Var.get(), (r3p) xvf0Var6.get(), (y7u) xvf0Var5.get());
            case 4:
                return new i((arv0) xvf0Var12.get(), (com.yandex.go.blockeduser.data.c) xvf0Var11.get(), (q4l0) xvf0Var10.get(), (k40) xvf0Var9.get(), (z0j) xvf0Var4.get(), (p2y0) xvf0Var8.get(), (z9z) xvf0Var3.get(), this.i, i5m.a(xvf0Var7), (oep0) xvf0Var.get(), (a) xvf0Var6.get(), (com.yandex.go.navigation.screen.c) xvf0Var5.get());
            case 5:
                return new a400((ViewGroup) xvf0Var12.get(), (tse) xvf0Var11.get(), (q3u0) xvf0Var10.get(), (tj60) xvf0Var9.get(), (ru.yandex.taxi.banners.c) xvf0Var4.get(), (tj60) xvf0Var8.get(), (jc00) xvf0Var3.get(), (y4k0) xvf0Var2.get(), (mj10) xvf0Var7.get(), (ffe) xvf0Var.get(), (MenuRouterStateChangeListener) xvf0Var6.get(), (ru.yandex.taxi.statebar.controller.b) xvf0Var5.get());
            case 6:
                return new xk60((Application) xvf0Var12.get(), (f) xvf0Var11.get(), (zuj0) xvf0Var10.get(), (y72) xvf0Var9.get(), i5m.a(xvf0Var4), (y72) xvf0Var8.get(), (ng60) xvf0Var3.get(), (k0b0) xvf0Var2.get(), (ej60) xvf0Var7.get(), (p0g0) xvf0Var.get(), (kuq) xvf0Var6.get(), (pw2) xvf0Var5.get());
            case 7:
                Context context = (Context) xvf0Var12.get();
                tt2 tt2Var = (tt2) xvf0Var10.get();
                pg7 pg7Var = (pg7) xvf0Var8.get();
                pwy0 pwy0Var = (pwy0) xvf0Var3.get();
                return new wrr(context, tt2Var, pg7Var, pwy0Var, (uk70) xvf0Var.get(), (yiz0) xvf0Var6.get(), (pho) xvf0Var5.get(), 14);
            case 8:
                pho phoVar = (pho) xvf0Var11.get();
                tt2 tt2Var2 = (tt2) xvf0Var10.get();
                pdc pdcVar = (pdc) xvf0Var9.get();
                xdf xdfVar = (xdf) xvf0Var4.get();
                pav pavVar = (pav) xvf0Var8.get();
                return new m(phoVar, tt2Var2, pdcVar, xdfVar, pavVar, (z0a0) xvf0Var2.get(), (o8a0) xvf0Var7.get(), (oxu0) xvf0Var.get(), (k7x0) xvf0Var6.get(), (lg21) xvf0Var5.get());
            case 9:
                return new com.yandex.go.payments.paymentlist.navigation.deeplink.a((y50) xvf0Var12.get(), (oep0) xvf0Var11.get(), (g8a0) xvf0Var10.get(), (n20) xvf0Var9.get(), this.f, (ycq0) xvf0Var8.get(), this.h, i5m.a(xvf0Var2), (ru.yandex.taxi.deeplinks.b) xvf0Var7.get(), this.k, (b600) xvf0Var6.get(), (hga0) xvf0Var5.get());
            case 10:
                qid0 qid0Var = (qid0) xvf0Var12.get();
                x1d0 x1d0Var = (x1d0) xvf0Var11.get();
                x2d0 x2d0Var = (x2d0) xvf0Var10.get();
                c2d0 c2d0Var = (c2d0) xvf0Var9.get();
                return new u2d0(qid0Var, x1d0Var, x2d0Var, c2d0Var.a, c2d0Var.b, (d3d0) xvf0Var4.get(), (ru.yandex.taxi.plus.sdk.prefetch.a) xvf0Var8.get(), (ru.yandex.taxi.plus.repository.c) xvf0Var3.get(), (r0v0) xvf0Var2.get(), (u3d0) xvf0Var7.get(), (cqd0) xvf0Var.get(), (zqg) xvf0Var6.get(), (kgz) xvf0Var5.get(), new uyi(3, x2d0Var));
            case 11:
                return new com.yandex.go.settings.domain.b((tt2) xvf0Var12.get(), (xdr0) xvf0Var11.get(), (zuj0) xvf0Var10.get(), (j5z) xvf0Var9.get(), (ru.yandex.taxi.startup.launch.h) xvf0Var4.get(), (as21) xvf0Var8.get(), (qqt0) xvf0Var3.get(), (aba0) xvf0Var2.get(), (yaa0) xvf0Var7.get(), (ru.yandex.taxi.utils.b) xvf0Var.get(), (n8z) xvf0Var6.get(), (hiy0) xvf0Var5.get());
            default:
                Context context2 = (Context) xvf0Var12.get();
                ysg ysgVar = (ysg) xvf0Var10.get();
                p2y0 p2y0Var = (p2y0) xvf0Var9.get();
                com.yandex.go.taxi.order.tipssuggest.domain.a aVar = (com.yandex.go.taxi.order.tipssuggest.domain.a) xvf0Var4.get();
                tgz0 tgz0Var = (tgz0) xvf0Var8.get();
                dm21 dm21Var = (dm21) xvf0Var3.get();
                rgz0 rgz0Var = (rgz0) xvf0Var2.get();
                return new sbm0(context2, ysgVar, p2y0Var, aVar, tgz0Var, dm21Var, rgz0Var, (e) xvf0Var6.get(), (pho) xvf0Var5.get());
        }
    }

    public /* synthetic */ sii(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, xvf0 xvf0Var11, xvf0 xvf0Var12, int i) {
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
    }
}

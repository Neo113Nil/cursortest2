package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.about.domain.c;
import com.yandex.go.account.upgrade.f;
import com.yandex.go.address.address_map_picker.panorama.d;
import com.yandex.go.address.address_map_picker.ui.state.a;
import com.yandex.go.preload.e;
import com.yandex.go.superapp.order.multi.old.provider.g;
import com.yandex.go.taxi.order.api.OrderApi;
import com.yandex.go.user_profile.fullscreen.models.l;
import com.yandex.go.user_profile.settings.profile.data.b;
import com.yandex.messaging.internal.v;
import ru.yandex.taxi.am.k;
import ru.yandex.taxi.am.m;
import ru.yandex.taxi.deeplinks.ExternalSchemesInteractor;

/* loaded from: classes.dex */
public final class x4 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;

    public x4(xvf0 xvf0Var, ea0 ea0Var, r10 r10Var, xvf0 xvf0Var2, axy axyVar, xvf0 xvf0Var3) {
        this.a = 10;
        this.b = xvf0Var;
        this.f = ea0Var;
        this.g = r10Var;
        this.c = xvf0Var2;
        this.d = axyVar;
        this.e = xvf0Var3;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.d;
        xvf0 xvf0Var2 = this.b;
        xvf0 xvf0Var3 = this.c;
        xvf0 xvf0Var4 = this.e;
        xvf0 xvf0Var5 = this.g;
        xvf0 xvf0Var6 = this.f;
        switch (i) {
            case 0:
                return new c((kb20) xvf0Var2.get(), (k) xvf0Var3.get(), (w8h) xvf0Var.get(), (s66) ((kgn) xvf0Var5).get(), (rs2) xvf0Var4.get(), (bpt) xvf0Var6.get());
            case 1:
                return new f((k) xvf0Var2.get(), (u02) xvf0Var3.get(), (ep90) xvf0Var.get(), (y0s) ((cer) xvf0Var5).get(), (m) xvf0Var4.get(), (j921) xvf0Var6.get());
            case 2:
                return new b((tse) xvf0Var2.get(), (tt2) xvf0Var3.get(), (g) xvf0Var.get(), (ru.yandex.taxi.am.g) xvf0Var4.get(), (l) ((im21) xvf0Var6).get(), (au50) ((bwy) xvf0Var5).get());
            case 3:
                return new pi0(this.b, this.c, this.d, (lf0) xvf0Var6, (fx60) xvf0Var4.get(), (vd) xvf0Var5);
            case 4:
                return new a((g21) xvf0Var2.get(), (zuj0) xvf0Var3.get(), (ru.yandex.taxi.address.clarification.impl.repo.a) xvf0Var.get(), (d) ((dk) xvf0Var5).get(), (mob0) xvf0Var4.get(), (j11) xvf0Var6.get());
            case 5:
                return new com.yandex.go.agreement.domain.a((e) xvf0Var2.get(), (oep0) xvf0Var3.get(), (Lifecycle) xvf0Var.get(), (tse) xvf0Var4.get(), (jk0) xvf0Var5, (com.yandex.go.agreement.repository.g) xvf0Var6.get());
            case 6:
                return new v920((ru.yandex.taxi.altpins.source.modal.a) xvf0Var2.get(), (pwy0) xvf0Var3.get(), (ru.yandex.taxi.altpins.source.modal.e) ((y1u) xvf0Var4).get(), (kr0) xvf0Var.get(), (tg9) ((oj) xvf0Var6).get(), (yfa) ((gw7) xvf0Var5).get());
            case 7:
                return new ru.yandex.taxi.vendor_api.push.a(i5m.a(xvf0Var2), i5m.a((icc0) xvf0Var5), i5m.a(xvf0Var3), i5m.a(xvf0Var), i5m.a(xvf0Var4), i5m.a(xvf0Var6));
            case 8:
                return new jn3((xqi0) xvf0Var2.get(), (k020) xvf0Var3.get(), (x22) xvf0Var.get(), (wff0) xvf0Var4.get(), (com.yandex.messaging.data.e) xvf0Var6.get(), (v) ((mwq) xvf0Var5).get());
            case 9:
                return new ru.yandex.taxi.communications.a((y50) xvf0Var2.get(), (ltc) xvf0Var3.get(), (tse) xvf0Var.get(), (oep0) xvf0Var4.get(), i5m.a((o10) xvf0Var6), (wg21) ((on11) xvf0Var5).get());
            case 10:
                return new com.yandex.go.beginners.flow.b((jj3) xvf0Var2.get(), (ea0) xvf0Var6, (r10) xvf0Var5, (rqo) xvf0Var3.get(), (ru.yandex.taxi.am.internal.d) xvf0Var.get(), (dbn) xvf0Var4.get());
            case 11:
                return new dm5((Context) xvf0Var2.get(), (b1) ((x) xvf0Var4).get(), (com.yandex.go.benefits_center.activation.domain.a) xvf0Var3.get(), (w030) xvf0Var.get(), (pm5) ((gd) xvf0Var6).get(), (rm5) ((bi4) xvf0Var5).get());
            case 12:
                return new ru.yandex.taxi.layers.source.factory.componentfactory.m((Context) ((m2g) xvf0Var2).get(), (tt2) ((m2g) xvf0Var3).get(), (ru.yandex.taxi.map_common.map.utils.a) ((n2g) xvf0Var).get(), (sxx) ((etx) xvf0Var4).get(), (w76) ((nf) xvf0Var6).get(), (pwy0) ((n2g) xvf0Var5).get());
            case 13:
                return new qw7((tse) xvf0Var2.get(), (OrderApi) xvf0Var3.get(), (c6e) xvf0Var.get(), (wnt) xvf0Var4.get(), (com.yandex.go.taxi.order.factory.a) ((xkw) xvf0Var5).get(), (po21) xvf0Var6.get());
            case 14:
                v88 v88Var = (v88) xvf0Var4.get();
                com.yandex.go.payments.cards.experiments.a aVar = (com.yandex.go.payments.cards.experiments.a) xvf0Var6.get();
                return new lj8(this.b, this.c, this.d, (pw) xvf0Var5, v88Var, aVar);
            case 15:
                return new zu8((dqe0) xvf0Var2.get(), (xk2) ((of7) xvf0Var).get(), (ev8) ((of7) xvf0Var4).get(), (xk2) ((of7) xvf0Var6).get(), (aw8) ((of7) xvf0Var5).get(), (y9y0) xvf0Var3.get());
            case 16:
                return new com.yandex.go.taxi.order.promotions.notification.ui.a((ru.yandex.taxi.widget.utils.e) xvf0Var2.get(), (pdc) xvf0Var3.get(), (ru.yandex.taxi.widget.c) xvf0Var.get(), (n3h) xvf0Var4.get(), (ru.yandex.taxi.communications.data.a) xvf0Var6.get(), (nw70) ((f870) xvf0Var5).get());
            case 17:
                return new fug((on2) xvf0Var2.get(), (tt2) xvf0Var3.get(), (dqe0) xvf0Var.get(), (qea0) xvf0Var4.get(), (lw90) ((zw30) xvf0Var5).get(), (tea0) xvf0Var6.get());
            case 18:
                return new ru.yandex.taxi.deeplinks.f((m6i0) xvf0Var2.get(), (q0h) xvf0Var3.get(), (h1h) xvf0Var.get(), (y72) ((z72) xvf0Var5).get(), (ExternalSchemesInteractor) xvf0Var4.get(), (jfb) xvf0Var6.get());
            case 19:
                return new ru.yandex.taxi.logistics.sdk.management.localstate.e((igu) xvf0Var2.get(), (aci) xvf0Var3.get(), (jwh) xvf0Var.get(), (sfi) xvf0Var4.get(), (st2) xvf0Var6.get(), (Context) ((w8g) xvf0Var5).get());
            case 20:
                return new com.yandex.go.payments.delivery.navigation.a(this.b, (ere0) ((npe0) xvf0Var4).get(), (com.yandex.go.payments.delivery.domain.d) ((zth) xvf0Var6).get(), (mii) ((fr3) xvf0Var5).get(), (vj4) xvf0Var3.get(), (f9y0) xvf0Var.get());
            case 21:
                return new com.yandex.go.performance_class.a((yhp) ((bea0) xvf0Var3).get(), (obj) ((qii) xvf0Var).get(), i5m.a((lf) xvf0Var4), i5m.a((zzg) xvf0Var6), i5m.a((gw7) xvf0Var5), (tt2) xvf0Var2.get());
            case 22:
                return new tpj((o61) ((kqz) xvf0Var).get(), (u8w) ((sp00) xvf0Var4).get(), (co40) ((edf0) xvf0Var6).get(), (u8w) ((n4g0) xvf0Var5).get(), (ru.yandex.taxi.profile.a) xvf0Var2.get(), (ru.yandex.taxi.am.g) xvf0Var3.get());
            case 23:
                return new com.yandex.go.drive.sdkintegration.domain.session.e((tfm) xvf0Var2.get(), (kfm) xvf0Var3.get(), (iy11) xvf0Var.get(), i5m.a((bt2) xvf0Var6), i5m.a((dby0) xvf0Var5), (com.yandex.go.drive.delegates.b) xvf0Var4.get());
            case 24:
                return new mim((k3c) xvf0Var2.get(), (tj60) xvf0Var3.get(), (woe) ((kyd) xvf0Var4).get(), (Context) xvf0Var.get(), (x770) ((f870) xvf0Var6).get(), (bjm) ((upj) xvf0Var5).get());
            case 25:
                return new ru.yandex.taxi.shortcuts.router.a((com.yandex.go.route.interactor.b) xvf0Var2.get(), (ru.yandex.taxi.shortcuts.interactors.a) xvf0Var3.get(), (com.yandex.go.mainscreen.superapp.impl.foundation.domain.g) xvf0Var.get(), (com.yandex.go.mainscreen.superapp.impl.foundation.domain.e) xvf0Var4.get(), (s870) ((b900) xvf0Var5).get(), (tiv0) xvf0Var6.get());
            case 26:
                return new xfp((com.yandex.go.mainscreen.superapp.impl.fragment.a) xvf0Var2.get(), (bip) xvf0Var3.get(), (xsi) xvf0Var5, this.d, (l01) xvf0Var4.get(), (eqe) xvf0Var6.get());
            case 27:
                return new com.yandex.messaging.domain.organizations.c((kse) xvf0Var2.get(), (v) xvf0Var3.get(), (w5t) xvf0Var.get(), (com.yandex.messaging.domain.chatlist.c) ((r2i) xvf0Var4).get(), (com.yandex.messaging.domain.threads.c) ((r2i) xvf0Var6).get(), (com.yandex.messaging.domain.unreadcount.d) ((mwq) xvf0Var5).get());
            case 28:
                return new pit((ci70) xvf0Var2.get(), (com.yandex.go.taxi.order.provider.a) xvf0Var3.get(), i5m.a(xvf0Var), i5m.a(xvf0Var4), (xdf) xvf0Var6.get(), (t8u0) ((yvr0) xvf0Var5).get());
            default:
                return new j4a((Activity) xvf0Var2.get(), (gku) xvf0Var3.get(), (tj60) xvf0Var.get(), (r1s) ((mwq) xvf0Var6).get(), (bu0) ((gb0) xvf0Var5).get(), (w030) xvf0Var4.get(), 1);
        }
    }

    public /* synthetic */ x4(v7p v7pVar, xvf0 xvf0Var, v7p v7pVar2, xvf0 xvf0Var2, v7p v7pVar3, v7p v7pVar4, int i) {
        this.a = i;
        this.b = v7pVar;
        this.c = xvf0Var;
        this.e = v7pVar2;
        this.d = xvf0Var2;
        this.f = v7pVar3;
        this.g = v7pVar4;
    }

    public /* synthetic */ x4(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, v7p v7pVar, xvf0 xvf0Var4, xvf0 xvf0Var5, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.g = v7pVar;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
    }

    public /* synthetic */ x4(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, v7p v7pVar, xvf0 xvf0Var5, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.g = v7pVar;
        this.f = xvf0Var5;
    }

    public /* synthetic */ x4(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
    }

    public /* synthetic */ x4(int i, v7p v7pVar, v7p v7pVar2, v7p v7pVar3, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3) {
        this.a = i;
        this.b = xvf0Var;
        this.c = v7pVar;
        this.d = xvf0Var2;
        this.f = v7pVar2;
        this.g = v7pVar3;
        this.e = xvf0Var3;
    }

    public x4(jk0 jk0Var, gd gdVar, id0 id0Var, lf0 lf0Var, g430 g430Var, vd vdVar) {
        this.a = 3;
        this.b = jk0Var;
        this.c = gdVar;
        this.d = id0Var;
        this.f = lf0Var;
        this.e = g430Var;
        this.g = vdVar;
    }

    public x4(kqz kqzVar, sp00 sp00Var, edf0 edf0Var, n4g0 n4g0Var, xvf0 xvf0Var, eqh eqhVar) {
        this.a = 22;
        this.d = kqzVar;
        this.e = sp00Var;
        this.f = edf0Var;
        this.g = n4g0Var;
        this.b = xvf0Var;
        this.c = eqhVar;
    }

    public x4(xvf0 xvf0Var, of7 of7Var, of7 of7Var2, of7 of7Var3, of7 of7Var4, jwx0 jwx0Var) {
        this.a = 15;
        this.b = xvf0Var;
        this.d = of7Var;
        this.e = of7Var2;
        this.f = of7Var3;
        this.g = of7Var4;
        this.c = jwx0Var;
    }

    public x4(tc tcVar, npe0 npe0Var, zth zthVar, fr3 fr3Var, sx2 sx2Var, n3w n3wVar) {
        this.a = 20;
        this.b = tcVar;
        this.e = npe0Var;
        this.f = zthVar;
        this.g = fr3Var;
        this.c = sx2Var;
        this.d = n3wVar;
    }

    public x4(eqh eqhVar, xvf0 xvf0Var, xsi xsiVar, gb0 gb0Var, gd gdVar, xvf0 xvf0Var2) {
        this.a = 26;
        this.b = eqhVar;
        this.c = xvf0Var;
        this.g = xsiVar;
        this.d = gb0Var;
        this.e = gdVar;
        this.f = xvf0Var2;
    }

    public x4(eqh eqhVar, icc0 icc0Var, eqh eqhVar2, xvf0 xvf0Var, xvf0 xvf0Var2, eqf0 eqf0Var) {
        this.a = 7;
        this.b = eqhVar;
        this.g = icc0Var;
        this.c = eqhVar2;
        this.d = xvf0Var;
        this.e = xvf0Var2;
        this.f = eqf0Var;
    }

    public x4(bea0 bea0Var, qii qiiVar, lf lfVar, zzg zzgVar, gw7 gw7Var, xvf0 xvf0Var) {
        this.a = 21;
        this.c = bea0Var;
        this.d = qiiVar;
        this.e = lfVar;
        this.f = zzgVar;
        this.g = gw7Var;
        this.b = xvf0Var;
    }

    public x4(xvf0 xvf0Var, x xVar, aj0 aj0Var, eqh eqhVar, gd gdVar, bi4 bi4Var) {
        this.a = 11;
        this.b = xvf0Var;
        this.e = xVar;
        this.c = aj0Var;
        this.d = eqhVar;
        this.f = gdVar;
        this.g = bi4Var;
    }
}

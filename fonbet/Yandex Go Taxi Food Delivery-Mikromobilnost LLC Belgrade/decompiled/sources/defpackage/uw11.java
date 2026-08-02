package defpackage;

import android.content.Context;
import com.yandex.go.navigation.screen.c;
import com.yandex.go.universal_qr_scanner.domain.camera.image.analyze.qr.a;
import com.yandex.go.universal_qr_scanner.domain.camera.image.analyze.qr.b;
import com.yandex.messaging.MessengerEnvironment;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.requirements.interactor.u;
import ru.yandex.taxi.requirements.interactor.x;

/* loaded from: classes12.dex */
public final class uw11 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;

    public uw11(sag sagVar, sag sagVar2, sag sagVar3, usx0 usx0Var, xvf0 xvf0Var, mg11 mg11Var) {
        this.a = 1;
        this.c = sagVar;
        this.d = sagVar2;
        this.e = sagVar3;
        this.f = usx0Var;
        this.b = xvf0Var;
        this.g = mg11Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.g;
        xvf0 xvf0Var2 = this.f;
        xvf0 xvf0Var3 = this.e;
        xvf0 xvf0Var4 = this.d;
        xvf0 xvf0Var5 = this.c;
        xvf0 xvf0Var6 = this.b;
        switch (i) {
            case 0:
                return new ggi((pw11) xvf0Var6.get(), (z880) xvf0Var5.get(), (hqj0) xvf0Var4.get(), (u) ((q150) xvf0Var3).get(), (kdd0) ((vfg0) xvf0Var2).get(), (c) ((t0g) xvf0Var).get(), 1);
            case 1:
                return new b((tst) ((sag) xvf0Var5).get(), (k421) ((sag) xvf0Var4).get(), (aye0) ((sag) xvf0Var3).get(), (a) ((usx0) xvf0Var2).get(), (lz11) xvf0Var6.get(), (kcz0) ((mg11) xvf0Var).get());
            case 2:
                return new com.ybsdk.screens.upgrade.domain.interactors.c((db21) xvf0Var6.get(), (k03) xvf0Var5.get(), (des0) ((oto0) xvf0Var3).get(), (nbp0) xvf0Var4.get(), (AppAnalyticsReporter) xvf0Var2.get(), (na21) xvf0Var.get());
            case 3:
                return new uio0((x) xvf0Var6.get(), (yfx0) xvf0Var5.get(), (gym) ((xat) xvf0Var3).get(), (wiq0) ((w0g) xvf0Var2).get(), (ijj0) ((npe0) xvf0Var).get(), (iev0) xvf0Var4.get());
            case 4:
                return new qv21((tt2) xvf0Var6.get(), (ijj0) ((npe0) xvf0Var3).get(), (x) xvf0Var5.get(), (pwy0) xvf0Var4.get(), (iev0) xvf0Var2.get(), (wiq0) xvf0Var.get());
            case 5:
                return new az21((Context) ((t0g) xvf0Var5).get(), (a201) ((mg11) xvf0Var4).get(), (s0g) xvf0Var3, (djj0) xvf0Var6.get(), (z880) ((eqh) xvf0Var2).get(), (oep0) ((a1g) xvf0Var).get());
            case 6:
                return new ru.yandex.taxi.preorder.summary.tariffpage.data.vertical.a((jgv) xvf0Var6.get(), i5m.a((ut) xvf0Var3), (dqe0) ((w0g) xvf0Var2).get(), (xc11) xvf0Var5.get(), (ru.yandex.taxi.preorder.summary.tariffpage.experiment.a) ((q02) xvf0Var).get(), (viv0) xvf0Var4.get());
            case 7:
                return new vmn0((Context) ((jcg) xvf0Var6).get(), (zuj0) ((pcg) xvf0Var5).get(), (zzi) ((jcg) xvf0Var4).get(), (pwy0) ((pcg) xvf0Var3).get(), (a640) ((jv21) xvf0Var2).get(), (g) ((jcg) xvf0Var).get());
            default:
                return new fk51((o1b0) xvf0Var6.get(), (MessengerEnvironment) xvf0Var5.get(), (ik51) xvf0Var4.get(), (ml21) xvf0Var3.get(), (at2) xvf0Var2.get(), (ck51) ((y101) xvf0Var).get());
        }
    }

    public /* synthetic */ uw11(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, v7p v7pVar, xvf0 xvf0Var5, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = v7pVar;
        this.g = xvf0Var5;
    }

    public uw11(xvf0 xvf0Var, xvf0 xvf0Var2, oto0 oto0Var, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5) {
        this.a = 2;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.e = oto0Var;
        this.d = xvf0Var3;
        this.f = xvf0Var4;
        this.g = xvf0Var5;
    }

    public uw11(t0g t0gVar, mg11 mg11Var, s0g s0gVar, cta0 cta0Var, eqh eqhVar, a1g a1gVar) {
        this.a = 5;
        this.c = t0gVar;
        this.d = mg11Var;
        this.e = s0gVar;
        this.b = cta0Var;
        this.f = eqhVar;
        this.g = a1gVar;
    }

    public uw11(jpf0 jpf0Var, uzu0 uzu0Var, xat xatVar, w0g w0gVar, npe0 npe0Var, y0g y0gVar) {
        this.a = 3;
        this.b = jpf0Var;
        this.c = uzu0Var;
        this.e = xatVar;
        this.f = w0gVar;
        this.g = npe0Var;
        this.d = y0gVar;
    }

    public uw11(xvf0 xvf0Var, npe0 npe0Var, jpf0 jpf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4) {
        this.a = 4;
        this.b = xvf0Var;
        this.e = npe0Var;
        this.c = jpf0Var;
        this.d = xvf0Var2;
        this.f = xvf0Var3;
        this.g = xvf0Var4;
    }

    public uw11(y0g y0gVar, ut utVar, w0g w0gVar, c1g c1gVar, q02 q02Var, b1g b1gVar) {
        this.a = 6;
        this.b = y0gVar;
        this.e = utVar;
        this.f = w0gVar;
        this.c = c1gVar;
        this.g = q02Var;
        this.d = b1gVar;
    }
}

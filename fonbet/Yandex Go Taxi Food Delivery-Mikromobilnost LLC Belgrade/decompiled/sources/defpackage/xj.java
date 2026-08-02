package defpackage;

import android.app.Activity;
import android.app.AlarmManager;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.squareup.moshi.Moshi;
import com.yandex.go.chargers.data.q;
import com.yandex.go.payments.experiments.i;
import com.yandex.go.scooters.domain.p;
import com.yandex.go.shortcuts.impl.interactors.m;
import ru.yandex.taxi.am.e;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.am.internal.b;
import ru.yandex.taxi.am.internal.c;
import ru.yandex.taxi.h;
import ru.yandex.taxi.linked_order.provider.d;
import ru.yandex.taxi.service.a;
import ru.yandex.taxi.superapp.knownOrder.u;
import ru.yandex.taxi.ui.MainUiAvailabilityMonitor;

/* loaded from: classes9.dex */
public final class xj implements v7p {
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

    public /* synthetic */ xj(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, xvf0 xvf0Var11, int i) {
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
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.h;
        xvf0 xvf0Var2 = this.e;
        xvf0 xvf0Var3 = this.j;
        xvf0 xvf0Var4 = this.g;
        xvf0 xvf0Var5 = this.f;
        xvf0 xvf0Var6 = this.d;
        xvf0 xvf0Var7 = this.c;
        xvf0 xvf0Var8 = this.l;
        xvf0 xvf0Var9 = this.k;
        xvf0 xvf0Var10 = this.i;
        xvf0 xvf0Var11 = this.b;
        switch (i) {
            case 0:
                return new e((ckf0) xvf0Var11.get(), (y50) xvf0Var7.get(), (g) xvf0Var6.get(), (b) xvf0Var2.get(), (no90) xvf0Var5.get(), (c) xvf0Var4.get(), (fhz) xvf0Var.get(), (im51) xvf0Var10.get(), (tse) xvf0Var3.get(), (ep90) xvf0Var9.get(), (r660) xvf0Var8.get());
            case 1:
                return new k83((i130) xvf0Var11.get(), (g51) xvf0Var7.get(), (zuj0) xvf0Var6.get(), this.e, (com.yandex.go.route.interactor.c) xvf0Var5.get(), (ah00) xvf0Var4.get(), this.h, (rjt0) xvf0Var10.get(), (yv0) xvf0Var3.get(), (y9y0) xvf0Var9.get(), (y4k0) xvf0Var8.get());
            case 2:
                return new st0((Context) xvf0Var11.get(), (w030) xvf0Var7.get(), (on2) xvf0Var6.get(), (rqo) xvf0Var2.get(), (k7x0) xvf0Var5.get(), (pav) xvf0Var4.get(), (pwy0) xvf0Var.get(), (tj60) xvf0Var10.get(), (hit) xvf0Var3.get(), (tt2) xvf0Var9.get(), (zuj0) xvf0Var8.get());
            case 3:
                return new com.yandex.go.overdraft.domain.g((on2) xvf0Var11.get(), (ru.yandex.taxi.launch.c) xvf0Var7.get(), i5m.a(xvf0Var6), i5m.a(xvf0Var2), (hd) xvf0Var5.get(), (yvq) xvf0Var4.get(), (hit) xvf0Var.get(), (sz80) xvf0Var10.get(), i5m.a(xvf0Var3), i5m.a(xvf0Var9), (Lifecycle) xvf0Var8.get());
            case 4:
                return new com.yandex.go.external_service.router.b((a) xvf0Var11.get(), this.c, this.d, i5m.a(xvf0Var2), this.f, (rit) xvf0Var4.get(), (f1p) xvf0Var.get(), (ru.yandex.taxi.deeplinks.b) xvf0Var10.get(), (ru.yandex.taxi.superapp.e) xvf0Var3.get(), (edn) xvf0Var9.get(), (bdn) xvf0Var8.get());
            case 5:
                q6v q6vVar = (q6v) xvf0Var11.get();
                x22 x22Var = (x22) xvf0Var7.get();
                String str = (String) xvf0Var6.get();
                String str2 = (String) xvf0Var2.get();
                Moshi moshi = (Moshi) xvf0Var5.get();
                return new ouu(q6vVar, x22Var, str, str2, moshi, (jwa0) xvf0Var.get(), (v1r0) xvf0Var10.get(), (com.yandex.messaging.data.e) xvf0Var3.get(), (lqo) xvf0Var9.get(), (gsu) xvf0Var8.get());
            case 6:
                return new u((tse) xvf0Var11.get(), (n20) xvf0Var7.get(), (com.yandex.go.drive.sdkintegration.domain.session.e) xvf0Var6.get(), (x2p) xvf0Var2.get(), (d) xvf0Var5.get(), (p) xvf0Var4.get(), (q) xvf0Var.get(), (ru.yandex.taxi.logistics.deliveries.multiorder.d) xvf0Var10.get(), (kmx) xvf0Var3.get(), (tt2) xvf0Var9.get(), (com.yandex.go.navigator.order.c) xvf0Var8.get());
            case 7:
                return new ru.yandex.taxi.logistics.deliveries.multiorder.c((fjz) xvf0Var11.get(), (yi7) xvf0Var7.get(), (ru.yandex.taxi.logistics.deliveries.multiorder.d) xvf0Var6.get(), (zuj0) xvf0Var2.get(), (tse) xvf0Var5.get(), (whz) xvf0Var4.get(), this.h, (Context) xvf0Var10.get(), (v7j0) xvf0Var3.get(), (y50) xvf0Var9.get(), (oep0) xvf0Var8.get());
            case 8:
                return new k020((Context) xvf0Var11.get(), (at2) xvf0Var7.get(), i5m.a(xvf0Var6), i5m.a(xvf0Var2), i5m.a(xvf0Var5), (q8g) xvf0Var4.get(), this.h, i5m.a(xvf0Var10), (ouf0) xvf0Var3.get(), (com.yandex.messaging.data.e) xvf0Var9.get(), i5m.a(xvf0Var8));
            case 9:
                return new u480((Context) xvf0Var11.get(), (tse) xvf0Var7.get(), (o280) xvf0Var6.get(), (r8h) xvf0Var2.get(), (jtq0) xvf0Var5.get(), (v480) xvf0Var4.get(), (y180) xvf0Var.get(), (AlarmManager) xvf0Var10.get(), (zuj0) xvf0Var3.get(), (crg) xvf0Var9.get(), (com.yandex.go.taxi.order.provider.a) xvf0Var8.get());
            case 10:
                return new com.yandex.go.payments.sbp.domain.b((Lifecycle) xvf0Var11.get(), (tse) xvf0Var7.get(), (tt2) xvf0Var6.get(), (qyz) xvf0Var2.get(), (com.yandex.go.payments.sbp.data.e) xvf0Var5.get(), (ycq0) xvf0Var4.get(), (hga0) xvf0Var.get(), (n20) xvf0Var10.get(), (y50) xvf0Var3.get(), (o3h) xvf0Var9.get(), (i) xvf0Var8.get());
            case 11:
                return new m(i5m.a(xvf0Var11), (m8f0) xvf0Var7.get(), (s680) xvf0Var6.get(), (qmp) xvf0Var2.get(), (itx) xvf0Var5.get(), (q9f0) xvf0Var4.get(), (o3s0) xvf0Var.get(), (maf0) xvf0Var10.get(), (abf0) xvf0Var3.get(), (hof0) xvf0Var9.get(), (tt2) xvf0Var8.get());
            case 12:
                return new ugf0((pav) xvf0Var11.get(), (exu0) xvf0Var7.get(), (irs0) xvf0Var6.get(), (xdf) xvf0Var2.get(), (ru.yandex.taxi.widget.utils.e) xvf0Var5.get(), (pwy0) xvf0Var4.get(), (pho) xvf0Var.get(), (yu11) xvf0Var10.get(), (com.yandex.go.ultima_mode.action.a) xvf0Var3.get(), (tv11) xvf0Var9.get(), (com.yandex.go.ultima_mode.preferences.a) xvf0Var8.get());
            case 13:
                return new ru.yandex.taxi.panorama.ridecard.d((tt2) xvf0Var11.get(), (a8y0) xvf0Var7.get(), (ru.yandex.taxi.utils.d) xvf0Var6.get(), (i8y0) xvf0Var2.get(), (c9y0) xvf0Var5.get(), this.g, (e8y0) xvf0Var.get(), (oep0) xvf0Var10.get(), (pwy0) xvf0Var3.get(), (ac20) xvf0Var9.get(), (vyx0) xvf0Var8.get());
            case 14:
                return new nrt0((hrt0) xvf0Var11.get(), (com.yandex.go.splash.domain.b) xvf0Var7.get(), (com.yandex.go.splash.domain.c) xvf0Var6.get(), (rrt0) xvf0Var2.get(), (prt0) xvf0Var5.get(), (ftc) xvf0Var4.get(), (FragmentActivity) xvf0Var.get(), (c2x0) xvf0Var10.get(), (MainUiAvailabilityMonitor) xvf0Var3.get(), (ru.yandex.taxi.zalogin.d) xvf0Var9.get(), i5m.a(xvf0Var8));
            case 15:
                Context context = (Context) xvf0Var11.get();
                ru.yandex.taxi.widget.utils.e eVar = (ru.yandex.taxi.widget.utils.e) xvf0Var2.get();
                pdc pdcVar = (pdc) xvf0Var5.get();
                pwy0 pwy0Var = (pwy0) xvf0Var.get();
                oxu0 oxu0Var = (oxu0) xvf0Var10.get();
                return new z4m0(context, eVar, pdcVar, pwy0Var, oxu0Var, (wsc) xvf0Var9.get(), (ru.yandex.taxi.design.utils.b) xvf0Var8.get(), 4);
            case 16:
                return new com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing.b((a850) xvf0Var11.get(), (cyx) xvf0Var7.get(), i5m.a(xvf0Var6), this.e, (k42) xvf0Var5.get(), (a2w0) xvf0Var4.get(), (q1w0) xvf0Var.get(), (vc00) xvf0Var10.get(), this.j, (ru.yandex.taxi.search.suggest.i) xvf0Var9.get(), (com.yandex.go.mainscreen.superapp.impl.fragment.a) xvf0Var8.get());
            default:
                Context context2 = (Context) xvf0Var11.get();
                Activity activity = (Activity) xvf0Var7.get();
                ru.yandex.taxi.activity.g gVar = (ru.yandex.taxi.activity.g) xvf0Var5.get();
                h hVar = (h) xvf0Var.get();
                tst tstVar = (tst) xvf0Var10.get();
                rs2 rs2Var = (rs2) xvf0Var3.get();
                return new yuf0(context2, activity, gVar, hVar, tstVar, rs2Var);
        }
    }
}

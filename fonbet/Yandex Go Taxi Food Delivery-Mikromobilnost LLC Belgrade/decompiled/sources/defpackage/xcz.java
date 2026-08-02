package defpackage;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.Lifecycle;
import com.squareup.moshi.Moshi;
import com.yandex.go.flex.main_screen.experiments.j;
import com.yandex.go.multimodal_route.interactors.g;
import com.yandex.go.payments.domain.y;
import com.yandex.go.sdk.source_providers.a;
import com.yandex.go.yb.data.u;
import java.util.List;
import ru.yandex.taxi.activity.i;
import ru.yandex.taxi.layers.presentation.mapnotification.c;
import ru.yandex.taxi.layers.presentation.mapnotification.d;
import ru.yandex.taxi.locationsdk.core.time.TimestampSelector;
import ru.yandex.taxi.maas.impl.ride.b;
import ru.yandex.taxi.masstransit.domain.q;
import ru.yandex.taxi.masstransit.experiment.d0;
import ru.yandex.taxi.masstransit.overlay.e;

/* loaded from: classes.dex */
public final class xcz implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;

    public xcz(axy axyVar, xvf0 xvf0Var, jc60 jc60Var, xvf0 xvf0Var2) {
        this.a = 24;
        this.d = axyVar;
        this.b = xvf0Var;
        this.e = jc60Var;
        this.c = xvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.b;
        xvf0 xvf0Var3 = this.e;
        xvf0 xvf0Var4 = this.d;
        switch (i) {
            case 0:
                c7z c7zVar = (c7z) xvf0Var2.get();
                dyv dyvVar = (dyv) xvf0Var.get();
                h3y a = i5m.a(xvf0Var4);
                h3y a2 = i5m.a((eqh) xvf0Var3);
                TimestampSelector timestampSelector = ucz.a;
                return new a(dyvVar, a2, a, c7zVar);
            case 1:
                List list = (List) xvf0Var2.get();
                jdt0 jdt0Var = (jdt0) ((bwy) xvf0Var).get();
                jdt0 jdt0Var2 = (jdt0) ((bwy) xvf0Var4).get();
                jdt0 jdt0Var3 = (jdt0) ((bwy) xvf0Var3).get();
                TimestampSelector timestampSelector2 = ucz.a;
                return kotlin.collections.a.o0(kotlin.collections.a.o0(kotlin.collections.a.o0(list, jdt0Var), jdt0Var2), jdt0Var3);
            case 2:
                return new b((ru.yandex.taxi.maas.impl.ride.common.a) xvf0Var2.get(), i5m.a(xvf0Var), xvf0Var4, (bhx) xvf0Var3);
            case 3:
                return new com.yandex.go.flex.main_screen.jason_state.a((Context) ((y2g) xvf0Var2).get(), (k6x) ((z2g) xvf0Var).get(), (tse) ((n2g) xvf0Var4).get(), (com.yandex.go.flex.common.utils.a) ((z2g) xvf0Var3).get());
            case 4:
                return new al00((ont) ((y500) xvf0Var4).get(), (vit) ((y500) xvf0Var3).get(), (hit) xvf0Var2.get(), (el00) xvf0Var.get());
            case 5:
                return new d((Context) ((m2g) xvf0Var).get(), (tse) ((m2g) xvf0Var4).get(), (tj60) ((n2g) xvf0Var3).get(), (c) xvf0Var2.get());
            case 6:
                return new xy00((h010) xvf0Var2.get(), (x111) xvf0Var.get(), xvf0Var4, (dt00) xvf0Var3);
            case 7:
                return new m010((ah00) xvf0Var2.get(), (vy00) xvf0Var.get(), (e) ((egx0) xvf0Var4).get(), (y9x0) ((awp0) xvf0Var3).get());
            case 8:
                return new ru.yandex.taxi.settings.info.interactor.a(i5m.a((y1u) xvf0Var3), i5m.a(xvf0Var2), i5m.a(xvf0Var), (qmp) xvf0Var4.get());
            case 9:
                return new ks10((lqo) xvf0Var2.get(), (vw10) ((gk10) xvf0Var4).get(), (sm1) ((qy0) xvf0Var3).get(), (Moshi) xvf0Var.get());
            case 10:
                return new yz10((s320) xvf0Var2.get(), (u8g) ((o8g) xvf0Var3).get(), (lqo) xvf0Var.get(), (rcy0) xvf0Var4.get());
            case 11:
                return new com.yandex.go.ads.mobile_ads_sdk.a((tt2) xvf0Var2.get(), (tse) xvf0Var.get(), (com.yandex.go.ads.mobile_ads_sdk.data.a) xvf0Var4.get(), i5m.a((gk10) xvf0Var3));
            case 12:
                return new cg30((ru.yandex.taxi.masstransit.datasource.routing.a) xvf0Var2.get(), (lf0) xvf0Var4, (d0) xvf0Var.get(), (ru.yandex.taxi.masstransit.trains.config.a) ((d701) xvf0Var3).get());
            case 13:
                return new ru.yandex.taxi.masstransit.datasource.schedule.a((x210) xvf0Var2.get(), (tt2) xvf0Var.get(), (yy30) ((s730) xvf0Var4).get(), (ru.yandex.taxi.masstransit.datasource.schedule.b) ((i020) xvf0Var3).get());
            case 14:
                return new ru.yandex.taxi.masstransit.repository.a((on2) xvf0Var2.get(), (tu30) xvf0Var.get(), (ah00) xvf0Var4.get(), (ru.yandex.taxi.masstransit.promo.b) ((xkw) xvf0Var3).get());
            case 15:
                return new ru.yandex.taxi.masstransit.threadschedule.e((Lifecycle) xvf0Var2.get(), (d0) xvf0Var.get(), (a640) ((i020) xvf0Var3).get(), (q) xvf0Var4.get());
            case 16:
                return new m640((c8w) xvf0Var4, (gb0) xvf0Var3, (zuj0) xvf0Var2.get(), (a3v) xvf0Var.get());
            case 17:
                return new g((uu40) ((tm40) xvf0Var3).get(), (qt40) xvf0Var2.get(), (wiq0) xvf0Var.get(), (tt2) xvf0Var4.get());
            case 18:
                return new n450((Context) xvf0Var2.get(), (oqt0) xvf0Var.get(), (pav) xvf0Var4.get(), (icc0) xvf0Var3);
            case 19:
                return new dt20((ComponentActivity) xvf0Var2.get(), (i) xvf0Var.get(), (q760) ((zw30) xvf0Var3).get(), (rqo) xvf0Var4.get());
            case 20:
                return new com.yandex.go.lifecycle.processor.c(i5m.a((y2r0) xvf0Var4), (tt2) xvf0Var2.get(), (hit) xvf0Var.get(), (au50) ((mt2) xvf0Var3).get());
            case 21:
                return new od80((tse) ((n2g) xvf0Var).get(), (qc20) ((g430) xvf0Var4).get(), (lhw0) ((a3g) xvf0Var3).get(), (j) xvf0Var2.get());
            case 22:
                return new cl80((tj70) xvf0Var3, (dl80) xvf0Var2.get(), xvf0Var, (rs2) xvf0Var4.get());
            case 23:
                com.yandex.go.parks.interactor.a aVar = (com.yandex.go.parks.interactor.a) ((le30) xvf0Var3).get();
                return new le90(aVar, (com.yandex.go.mainscreen.superapp.impl.fragment.a) xvf0Var4.get());
            case 24:
                return new el90((dl90) ((axy) xvf0Var4).get(), (as21) xvf0Var2.get(), (ol90) ((jc60) xvf0Var3).get(), (tse) xvf0Var.get());
            case 25:
                return new vo90((u02) xvf0Var2.get(), (hqe) xvf0Var.get(), (go90) ((tj70) xvf0Var3).get(), (im51) xvf0Var4.get());
            case 26:
                return new ru.yandex.taxi.delivery.experiments.e((wfi) xvf0Var2.get(), (ut90) ((ec80) xvf0Var3).get(), (ru.yandex.taxi.preorder.repositories.g) xvf0Var.get(), (wiq0) xvf0Var4.get());
            case 27:
                return new oca0((Context) xvf0Var2.get(), (w030) xvf0Var.get(), (x770) ((bea0) xvf0Var3).get(), (y) xvf0Var4.get());
            case 28:
                return new cxq0((u) xvf0Var2.get(), (ao51) xvf0Var.get(), (com.yandex.go.loyalty.impl.common.data.c) xvf0Var4.get(), (y) ((jc60) xvf0Var3).get(), 29);
            default:
                return new dt20((n20) xvf0Var.get(), (a441) ((yn51) xvf0Var4).get(), i5m.a((r10) xvf0Var3), (cda0) xvf0Var2.get(), 21);
        }
    }

    public /* synthetic */ xcz(xvf0 xvf0Var, v7p v7pVar, xvf0 xvf0Var2, v7p v7pVar2, int i) {
        this.a = i;
        this.d = v7pVar;
        this.e = v7pVar2;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }

    public /* synthetic */ xcz(xvf0 xvf0Var, xvf0 xvf0Var2, v7p v7pVar, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.e = v7pVar;
        this.d = xvf0Var3;
    }

    public /* synthetic */ xcz(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
    }

    public /* synthetic */ xcz(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i, byte b) {
        this.a = i;
        this.b = xvf0Var;
        this.e = xvf0Var2;
        this.c = xvf0Var3;
        this.d = xvf0Var4;
    }

    public /* synthetic */ xcz(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i, boolean z) {
        this.a = i;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.e = xvf0Var3;
        this.b = xvf0Var4;
    }

    public /* synthetic */ xcz(v7p v7pVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.e = v7pVar;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
    }

    public xcz(h420 h420Var, gk10 gk10Var, qy0 qy0Var, xvf0 xvf0Var) {
        this.a = 9;
        this.b = h420Var;
        this.d = gk10Var;
        this.e = qy0Var;
        this.c = xvf0Var;
    }

    public xcz(i020 i020Var, lf0 lf0Var, d701 d701Var, d701 d701Var2) {
        this.a = 12;
        this.b = i020Var;
        this.d = lf0Var;
        this.c = d701Var;
        this.e = d701Var2;
    }

    public xcz(y2r0 y2r0Var, xvf0 xvf0Var, xvf0 xvf0Var2, mt2 mt2Var) {
        this.a = 20;
        this.d = y2r0Var;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.e = mt2Var;
    }
}

package defpackage;

import android.content.Context;
import com.yandex.go.eboks.objects.data.EboksObjectsApi;
import com.yandex.go.eboks.objects.data.c;
import com.yandex.go.explorer.impl.experiments.g;
import com.yandex.go.explorer.impl.ui.map.l;
import com.yandex.go.taxi.summary.mobilityhub.mapper.d;
import com.yandex.messaging.MessengerEnvironment;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.di.modules.features.h;
import com.ybsdk.di.modules.features.i;
import ru.yandex.logistics.sdk.cargo_form.core.impl.order.b;
import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e;
import ru.yandex.taxi.logistics.sdk.tracking.impl.domain.a;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.dynamic_timeline.f;

/* loaded from: classes5.dex */
public final class z9n implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;

    public z9n(ugn ugnVar, kzf kzfVar, kzf kzfVar2, n3w n3wVar, hbn hbnVar) {
        this.a = 1;
        this.b = kzfVar;
        this.c = kzfVar2;
        this.d = n3wVar;
        this.e = hbnVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.e;
        xvf0 xvf0Var2 = this.c;
        xvf0 xvf0Var3 = this.d;
        xvf0 xvf0Var4 = this.b;
        switch (i) {
            case 0:
                return new f((e) ((mzf) xvf0Var4).get(), (s9n) ((t9n) xvf0Var2).get(), (a) xvf0Var3.get(), (x9n) xvf0Var.get());
            case 1:
                return ((Boolean) ((qqo) ((yn3) ((hbn) xvf0Var).get()).a.getValue()).b()).booleanValue() ? new com.yandex.go.eboks.objects.analytics.a((czf0) ((kzf) xvf0Var4).get(), (lx4) ((kzf) xvf0Var2).get(), (dhn) ((n3w) xvf0Var3).a) : new cin();
            case 2:
                return new c((EboksObjectsApi) ((hbn) xvf0Var4).get(), (po21) ((kzf) xvf0Var2).get(), (dhn) ((n3w) xvf0Var).a, (din) xvf0Var3.get());
            case 3:
                return new com.ybsdk.feature.educations.internal.domain.a((h) ((byf) xvf0Var4).get(), (i) ((byf) xvf0Var2).get(), (gym) ((byf) xvf0Var3).get(), (com.ybsdk.common.a) ((byf) xvf0Var).get());
            case 4:
                return new kn3((u0g) xvf0Var4, (ru.yandex.taxi.settings.email.a) ((s0g) xvf0Var2).get(), (n3a) ((q02) xvf0Var).get(), (oep0) xvf0Var3.get(), 2);
            case 5:
                return new a7o((qcp0) ((ozf) xvf0Var4).get(), (e7o) xvf0Var3.get(), (z6o) ((nzf) xvf0Var2).get(), (c7o) ((nzf) xvf0Var).get());
            case 6:
                return new e7o((y30) ((ozf) xvf0Var4).get(), (hwy0) ((ozf) xvf0Var2).get(), (dci) ((ozf) xvf0Var).get(), (g7o) xvf0Var3.get());
            case 7:
                return new com.yandex.go.explorer.impl.ui.map.c((Context) ((jzf) xvf0Var4).get(), (l) xvf0Var3.get(), (et00) ((jzf) xvf0Var2).get(), (ah00) xvf0Var.get());
            case 8:
                return new l((com.yandex.go.explorer.impl.data.repositories.a) ((jzf) xvf0Var4).get(), (com.yandex.go.explorer.impl.domain.interactors.a) ((k0n) xvf0Var2).get(), (ah00) ((jzf) xvf0Var3).get(), (g) ((hro) xvf0Var).get());
            case 9:
                return new bwo((qcp0) ((qzf) xvf0Var4).get(), (kwo) xvf0Var3.get(), (jwo) ((rzf) xvf0Var2).get(), (hwo) ((rzf) xvf0Var).get());
            case 10:
                return new com.yandex.messaging.ui.settings.folder.a((t7t) ((wrh) xvf0Var4).get(), (vzi0) xvf0Var3.get(), (krh) xvf0Var.get(), (com.yandex.messaging.internal.backendconfig.a) xvf0Var2.get());
            case 11:
                return new b((String) xvf0Var3.get(), (up21) ((m1g) xvf0Var4).get(), (l6s) xvf0Var.get(), (a6s) xvf0Var2.get());
            case 12:
                return new v5s(i5m.a(xvf0Var3), (w5s) ((c0j) xvf0Var4).get(), (y5s) ((cto) xvf0Var2).get(), (ru.yandex.taxi.logistics.address.g) ((n1g) xvf0Var).get());
            case 13:
                return new ru.yandex.logistics.sdk.cargo_form.core.impl.interactor.c((ru.yandex.logistics.sdk.cargo_form.core.impl.datastore.e) ((cuo) xvf0Var4).get(), (r6s) xvf0Var3.get(), (ru.yandex.taxi.logistics.sdk.management.f) xvf0Var.get(), (b6s) xvf0Var2.get());
            case 14:
                return new com.ybsdk.feature.savings.internal.interactors.a((com.ybsdk.feature.savings.internal.data.b) ((q150) xvf0Var4).get(), (com.ybsdk.utils.poller.b) ((g7g) xvf0Var2).get(), (aye0) ((k6g) xvf0Var3).get(), (npk) ((g7g) xvf0Var).get());
            case 15:
                return new com.ybsdk.feature.futurepayments.internal.screens.a((com.ybsdk.feature.futurepayments.internal.data.a) ((njp) xvf0Var4).get(), (tw51) ((n3w) xvf0Var2).a, (AppAnalyticsReporter) ((byf) xvf0Var).get(), (nqs) xvf0Var3.get());
            case 16:
                return new com.yandex.go.navigator.gas_stations.pins_layer.a((com.yandex.go.navigator.gas_stations.pins_layer.h) ((qx4) xvf0Var4).get(), (ah00) ((v1g) xvf0Var2).get(), (tts) ((v1g) xvf0Var).get(), (com.yandex.go.navigator.gas_stations.providers.a) xvf0Var3.get());
            case 17:
                return new u5t((w5t) xvf0Var3.get(), (com.yandex.messaging.domain.unreadcount.b) ((wrh) xvf0Var4).get(), (lqo) xvf0Var.get(), (kse) xvf0Var2.get());
            case 18:
                return new com.yandex.messaging.domain.user.a((w5t) xvf0Var3.get(), (com.yandex.messaging.domain.user.b) xvf0Var.get(), (h2t) ((xat) xvf0Var4).get(), (kse) xvf0Var2.get());
            case 19:
                return new wjm((mqv0) xvf0Var3.get(), (bg4) ((s90) xvf0Var4).get(), (wiq0) xvf0Var.get(), (ru.yandex.taxi.widget.c) xvf0Var2.get(), 13);
            case 20:
                return new tft((kse) xvf0Var3.get(), i5m.a((zo0) xvf0Var4), i5m.a((f9t) xvf0Var2), i5m.a(xvf0Var));
            case 21:
                return new wlu((k020) xvf0Var3.get(), i5m.a((eu0) xvf0Var4), i5m.a(xvf0Var), (dvg) xvf0Var2.get());
            case 22:
                return new jtu((w030) xvf0Var3.get(), (etu) xvf0Var.get(), (itu) ((n3w) xvf0Var4).a, (ru.yandex.taxi.favorites.experiment.e) ((c7n) xvf0Var2).get());
            case 23:
                return new com.yandex.go.taxi.summary.mobilityhub.interactor.g((cyu) xvf0Var3.get(), (uc31) xvf0Var.get(), (d) ((lok0) xvf0Var4).get(), (v0v) xvf0Var2.get());
            case 24:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.image.b((u3s) ((n3w) xvf0Var4).a, (ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.image.a) ((a9i) xvf0Var2).get(), (hwy0) ((gxf) xvf0Var3).get(), (sae) ((srb) xvf0Var).get());
            case 25:
                return new y4c0((k4a) xvf0Var4, i5m.a(xvf0Var3), (eb50) xvf0Var.get(), (h4g) xvf0Var2, 7);
            case 26:
                pkb0 pkb0Var = (pkb0) ((exf) xvf0Var4).get();
                s5s s5sVar = (s5s) xvf0Var3.get();
                ru.yandex.taxi.logistics.photocomment.c cVar = (ru.yandex.taxi.logistics.photocomment.c) ((fxf) xvf0Var2).get();
                ds0 ds0Var = (ds0) ((hbn) xvf0Var).get();
                y4a0 y4a0Var = new y4a0(s5sVar, cVar, false, 8);
                pzf pzfVar = pkb0Var.a;
                pzfVar.getClass();
                return new wwf(pzfVar, y4a0Var, (ekb0) ds0Var).c();
            case 27:
                return new com.yandex.go.intercity.flex.dashboard.point_selection.a((w030) xvf0Var3.get(), (sae) ((ywf) xvf0Var4).get(), (dow) ((f2g) xvf0Var2).get(), (ru.yandex.taxi.layers.b) ((f2g) xvf0Var).get());
            case 28:
                return new n9x((x22) xvf0Var3.get(), (sk7) ((f2b) xvf0Var4).get(), (key0) xvf0Var.get(), (MessengerEnvironment) xvf0Var2.get());
            default:
                return new wjm(i5m.a((amy) xvf0Var4), (ul00) xvf0Var3.get(), (ru.yandex.taxi.linked_order.map.utils.a) ((k1w) xvf0Var2).get(), (lly) ((rut) xvf0Var).get(), 22);
        }
    }

    public /* synthetic */ z9n(xvf0 xvf0Var, xvf0 xvf0Var2, v7p v7pVar, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.d = xvf0Var;
        this.e = xvf0Var2;
        this.b = v7pVar;
        this.c = xvf0Var3;
    }

    public /* synthetic */ z9n(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
    }

    public /* synthetic */ z9n(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i, byte b) {
        this.a = i;
        this.b = xvf0Var;
        this.d = xvf0Var2;
        this.c = xvf0Var3;
        this.e = xvf0Var4;
    }

    public /* synthetic */ z9n(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i, char c) {
        this.a = i;
        this.d = xvf0Var;
        this.b = xvf0Var2;
        this.e = xvf0Var3;
        this.c = xvf0Var4;
    }

    public /* synthetic */ z9n(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i, int i2) {
        this.a = i;
        this.d = xvf0Var;
        this.b = xvf0Var2;
        this.c = xvf0Var3;
        this.e = xvf0Var4;
    }

    public /* synthetic */ z9n(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i, boolean z) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.e = xvf0Var3;
        this.d = xvf0Var4;
    }

    public /* synthetic */ z9n(v7p v7pVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = v7pVar;
        this.d = xvf0Var;
        this.e = xvf0Var2;
        this.c = xvf0Var3;
    }
}

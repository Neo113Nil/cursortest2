package defpackage;

import android.app.Activity;
import android.content.Context;
import com.squareup.moshi.Moshi;
import com.yandex.go.chargers.data.f;
import com.yandex.go.chargers.offer.passes.data.g;
import com.yandex.go.chargers.offer.passes.domain.a;
import com.yandex.go.chargers.offer.plus_dvizh.data.api.ChargersPlusDvizhPurchaseApi;
import com.yandex.go.chargers.station.data.mapper.b;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.authorized.sync.d;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import ru.yandex.taxi.widget.c;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes15.dex */
public final class zfa implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;

    public /* synthetic */ zfa(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.d;
        xvf0 xvf0Var2 = this.c;
        xvf0 xvf0Var3 = this.b;
        switch (i) {
            case 0:
                return new uv6((Context) xvf0Var3.get(), (w030) xvf0Var2.get(), (fga) xvf0Var.get());
            case 1:
                return new a((e2e0) xvf0Var3.get(), (g) xvf0Var2.get(), (com.yandex.go.chargers.payments.data.a) xvf0Var.get());
            case 2:
                return new com.yandex.go.chargers.offer.plus_dvizh.data.a((wnt) xvf0Var3.get(), (ChargersPlusDvizhPurchaseApi) xvf0Var2.get(), (f) xvf0Var.get());
            case 3:
                return new com.yandex.go.chargers.offer.plus_dvizh.domain.a((e2e0) xvf0Var3.get(), (com.yandex.go.chargers.offer.plus_dvizh.data.f) xvf0Var2.get(), (com.yandex.go.chargers.payments.data.a) xvf0Var.get());
            case 4:
                return new b((k7x0) xvf0Var3.get(), (c) xvf0Var2.get(), (com.yandex.go.chargers.domain.mapper.a) xvf0Var.get());
            case 5:
                return new kxa((nxa) xvf0Var3.get(), (Context) xvf0Var2.get(), (w030) xvf0Var.get());
            case 6:
                return new o0b((ouu) xvf0Var3.get(), (nk21) xvf0Var2.get(), (Moshi) xvf0Var.get());
            case 7:
                return new i6b((o1b0) xvf0Var3.get(), (h6b) xvf0Var2.get(), (w220) xvf0Var.get());
            case 8:
                return new com.yandex.messaging.domain.chat.a((q6b) xvf0Var3.get(), (com.yandex.messaging.internal.authorized.chat.b) xvf0Var2.get(), (Moshi) xvf0Var.get());
            case 9:
                return new rbb((o1b0) xvf0Var3.get(), (k020) xvf0Var2.get(), (oab) xvf0Var.get());
            case 10:
                return new com.yandex.messaging.internal.translator.a((com.yandex.messaging.internal.authorized.chat.b) xvf0Var3.get(), (mdb) xvf0Var2.get(), (kse) xvf0Var.get());
            case 11:
                return new com.yandex.messaging.internal.displayname.a((Activity) xvf0Var3.get(), (j4t) xvf0Var2.get(), (com.yandex.messaging.domain.chat.g) xvf0Var.get());
            case 12:
                return new pfb((ck31) xvf0Var3.get(), (dqe0) xvf0Var2.get(), (com.yandex.go.route.interactor.c) xvf0Var.get());
            case 13:
                return new com.yandex.go.taxi.summary.map.clarify_source_point.interactor.a((rqo) xvf0Var3.get(), (tt2) xvf0Var2.get(), (e) xvf0Var.get());
            case 14:
                return new v0c((o1b0) xvf0Var3.get(), (n5t0) xvf0Var2.get(), (k020) xvf0Var.get());
            case 15:
                return new w0c((com.yandex.messaging.internal.authorized.chat.b) xvf0Var3.get(), (k020) xvf0Var2.get(), (xdf0) xvf0Var.get());
            case 16:
                return new poc(7, (Context) xvf0Var3.get(), (noy0) xvf0Var2.get(), (ij10) xvf0Var.get());
            case 17:
                return new com.ybsdk.common.a((AppAnalyticsReporter) xvf0Var3.get(), (com.ybsdk.common.repositiories.auth.g) xvf0Var2.get(), (mu31) xvf0Var.get());
            case 18:
                return new sk7((ijj0) xvf0Var3.get(), (h580) xvf0Var2.get(), (dqe0) xvf0Var.get());
            case 19:
                return new com.yandex.messaging.ui.settings.contacts.c((com.yandex.messaging.domain.contacts.a) xvf0Var3.get(), (d) xvf0Var2.get(), (x22) xvf0Var.get());
            case 20:
                return new com.yandex.go.navigator.utils.a((com.yandex.go.navigator.gas_stations.experiment.c) xvf0Var3.get(), (ipv) xvf0Var2.get(), (com.yandex.go.navigator.share.experiment.c) xvf0Var.get());
            case 21:
                return new ru.yandex.taxi.summary.requirements.list.interactors.d(i5m.a(xvf0Var3), (wiq0) xvf0Var2.get(), (g580) xvf0Var.get());
            case 22:
                return new fhf((w6r) xvf0Var3.get(), (zuj0) xvf0Var2.get(), (com.yandex.go.route.interactor.c) xvf0Var.get());
            case 23:
                return new ljf((nz2) xvf0Var3.get(), (cr00) xvf0Var2.get(), (o2y0) xvf0Var.get());
            case 24:
                return new glf((com.yandex.messaging.domain.statuses.b) xvf0Var3.get(), i5m.a(xvf0Var2), (dlf) xvf0Var.get());
            case 25:
                return new wwf((ru.yandex.taxi.communications.data.a) xvf0Var3.get(), (n3h) xvf0Var2.get(), (ipf0) xvf0Var.get());
            case 26:
                return new com.ybsdk.screens.initial.deeplink.b((nbp0) xvf0Var3.get(), (com.ybsdk.feature.banners.api.interactors.a) xvf0Var2.get(), (AppAnalyticsReporter) xvf0Var.get());
            case 27:
                return new ghh((y50) xvf0Var3.get(), (ney) xvf0Var2.get(), (v7j0) xvf0Var.get());
            case 28:
                return new mrh((Activity) xvf0Var3.get(), (com.yandex.messaging.chat.a) xvf0Var2.get(), (doc) xvf0Var.get());
            default:
                com.yandex.messaging.internal.authorized.chat.b bVar = (com.yandex.messaging.internal.authorized.chat.b) xvf0Var3.get();
                return new com.yandex.messaging.chat.a((kse) xvf0Var.get(), (ChatRequest) xvf0Var2.get(), bVar);
        }
    }
}

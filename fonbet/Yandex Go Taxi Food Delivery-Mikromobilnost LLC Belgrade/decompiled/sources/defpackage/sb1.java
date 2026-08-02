package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import com.squareup.moshi.Moshi;
import com.yandex.fintechsdk.entities.environment.DefaultEnvironment;
import com.yandex.fintechsdk.entities.region.Region;
import com.yandex.fintechsdk.flows.applink.payment.internal.model.payment.PayboxScenario;
import com.yandex.go.call_order_fallback.c;
import com.yandex.go.call_order_fallback.domain.e;
import com.yandex.go.route.interactor.b;
import com.yandex.go.taxi.order.promotions.interactor.h;
import com.yandex.go.zone.repository.o;
import com.yandex.mapkit.navigation.automotive.layer.styling.UserPlacemarkStyleProvider;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.authorized.sync.d;
import com.yandex.messaging.internal.translator.g;
import com.yandex.messaging.internal.translator.k;
import com.yandex.payment.sdk.core.data.ConsoleLoggingMode;
import com.yandex.payment.sdk.core.data.Merchant;
import com.yandex.payment.sdk.core.data.PaymentSdkEnvironment;
import com.yandex.xplat.payment.sdk.ClientPlatform;
import java.net.URL;
import java.util.HashMap;
import java.util.Optional;
import java.util.Set;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.preorder.source.domain.r;
import ru.yandex.taxi.preorder.source.domain.v;
import ru.yandex.taxi.preorder.source.pickup.a;
import ru.yandex.taxi.requirements.interactor.e0;
import ru.yandex.taxi.requirements.repository.RequirementsChangedNotifier;

/* loaded from: classes12.dex */
public final class sb1 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;
    public final xvf0 h;

    public sb1(ox4 ox4Var, n3w n3wVar, xvf0 xvf0Var, n3w n3wVar2, n3w n3wVar3, n3w n3wVar4, n3w n3wVar5, n3w n3wVar6) {
        this.a = 2;
        this.b = n3wVar;
        this.c = xvf0Var;
        this.d = n3wVar2;
        this.e = n3wVar3;
        this.f = n3wVar4;
        this.g = n3wVar5;
        this.h = n3wVar6;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        String str;
        int i = this.a;
        xvf0 xvf0Var = this.g;
        xvf0 xvf0Var2 = this.f;
        xvf0 xvf0Var3 = this.h;
        xvf0 xvf0Var4 = this.e;
        xvf0 xvf0Var5 = this.d;
        xvf0 xvf0Var6 = this.c;
        xvf0 xvf0Var7 = this.b;
        switch (i) {
            case 0:
                return new j4n((a) xvf0Var7.get(), (dqe0) xvf0Var6.get(), (o) xvf0Var5.get(), (b) xvf0Var4.get(), (v) xvf0Var2.get(), (r) xvf0Var.get(), (kr0) xvf0Var3.get());
            case 1:
                return new com.yandex.fintechsdk.core.analytics.impl.internal.a((kkl0) xvf0Var7.get(), (Context) xvf0Var6.get(), (DefaultEnvironment) xvf0Var5.get(), (x05) xvf0Var4.get(), (mv2) xvf0Var2.get(), (b6o) xvf0Var.get(), (Optional) xvf0Var3.get());
            case 2:
                Merchant merchant = (Merchant) xvf0Var7.get();
                pcy pcyVar = (pcy) xvf0Var6.get();
                ConsoleLoggingMode consoleLoggingMode = (ConsoleLoggingMode) xvf0Var5.get();
                vv50 vv50Var = (vv50) xvf0Var4.get();
                rwo rwoVar = (rwo) xvf0Var2.get();
                String str2 = (String) xvf0Var3.get();
                PaymentSdkEnvironment paymentSdkEnvironment = pcyVar.a;
                int i2 = 0;
                gq50 gq50Var = new gq50(consoleLoggingMode.isConsoleLoggingEnabled(paymentSdkEnvironment), bwa1.a(paymentSdkEnvironment == PaymentSdkEnvironment.TESTING), EmptyList.a);
                int i3 = ocy.a[paymentSdkEnvironment.ordinal()];
                int i4 = 3;
                int i5 = 2;
                if (i3 == 1) {
                    str = "https://mobpayment-test.yandex-team.ru/";
                } else if (i3 == 2) {
                    str = "http://127.0.0.1:8080/nspk/";
                } else if (i3 == 3) {
                    str = "https://testing.crowdtest.mobpayment.yandex.ru/";
                } else if (i3 == 4) {
                    str = "https://mobpayment-test-mimino.yandex-team.ru/";
                } else {
                    if (i3 != 5) {
                        w511.b();
                        return null;
                    }
                    str = "https://mobpayment.yandex-net.ru/";
                }
                kfh kfhVar = new kfh(new URL(str), gq50Var, new qdh(), new h1(rwoVar, i5), new i1(i5, rwoVar));
                qdh qdhVar = new qdh();
                ClientPlatform clientPlatform = ClientPlatform.f102android;
                return new kl60(new e100(26, new xv50(kfhVar, lu91.a(scc.i(vv50Var, new f7j0()), scc.i(new pl60(merchant.getServiceToken(), i2), new mu2(i4, clientPlatform), new pl60(str2, i4)))), qdhVar, new ll60()));
            case 3:
                return new h25((Context) xvf0Var7.get(), (Set) xvf0Var6.get(), (ko10) xvf0Var5.get(), (ar10) xvf0Var4.get(), (PayboxScenario) xvf0Var2.get(), (Region) xvf0Var.get(), (rzq0) xvf0Var3.get());
            case 4:
                return new c((uj7) xvf0Var7.get(), (sj7) xvf0Var6.get(), (Context) xvf0Var5.get(), (w030) xvf0Var4.get(), (tt2) xvf0Var2.get(), (e) xvf0Var.get(), (com.yandex.go.call_order_fallback.analytics.a) xvf0Var3.get());
            case 5:
                return new ru.yandex.taxi.map.a((Context) xvf0Var7.get(), (pav) xvf0Var6.get(), (k7x0) xvf0Var5.get(), (sp2) xvf0Var4.get(), (ru.yandex.taxi.preorder.source.cars.a) xvf0Var2.get(), (tt2) xvf0Var.get(), (rqo) xvf0Var3.get());
            case 6:
                q99 q99Var = new q99();
                new HashMap();
                return q99Var;
            case 7:
                o0b o0bVar = (o0b) xvf0Var7.get();
                o1b0 o1b0Var = (o1b0) xvf0Var6.get();
                k020 k020Var = (k020) xvf0Var5.get();
                com.yandex.messaging.data.e eVar = (com.yandex.messaging.data.e) xvf0Var4.get();
                kse kseVar = (kse) xvf0Var2.get();
                return new com.yandex.messaging.domain.chat.b(o0bVar, o1b0Var, k020Var, eVar, kseVar);
            case 8:
                return new h9b((kse) xvf0Var7.get(), (l8g) xvf0Var6.get(), (k020) xvf0Var5.get(), (p1b0) xvf0Var4.get(), i5m.a(xvf0Var2), (wff0) xvf0Var.get(), (m3b) xvf0Var3.get());
            case 9:
                naz0 naz0Var = (naz0) xvf0Var7.get();
                k020 k020Var2 = (k020) xvf0Var6.get();
                n5t0 n5t0Var = (n5t0) xvf0Var5.get();
                i5m.a(xvf0Var4);
                return new cbb(naz0Var, k020Var2, n5t0Var, i5m.a(xvf0Var2), (fbb) xvf0Var.get(), (x22) xvf0Var3.get());
            case 10:
                return new com.yandex.messaging.internal.view.chat.e((Activity) xvf0Var7.get(), (mdb) xvf0Var6.get(), (ChatRequest) xvf0Var5.get(), (k) xvf0Var4.get(), (gzw) xvf0Var2.get(), (com.yandex.messaging.internal.translator.b) xvf0Var.get(), i5m.a(xvf0Var3));
            case 11:
                return new com.yandex.messaging.contacts.sync.a((to3) xvf0Var7.get(), (kse) xvf0Var6.get(), (com.yandex.messaging.contacts.sync.b) xvf0Var5.get(), (at2) xvf0Var4.get(), (com.yandex.messaging.internal.storage.contacts.a) xvf0Var2.get(), (k020) xvf0Var.get(), (d) xvf0Var3.get());
            case 12:
                return new com.yandex.messaging.domain.statuses.b((k020) xvf0Var7.get(), (sb7) xvf0Var6.get(), (dlf) xvf0Var5.get(), (xdf0) xvf0Var4.get(), (to3) xvf0Var2.get(), (at2) xvf0Var.get(), (SharedPreferences) xvf0Var3.get());
            case 13:
                return new evr((cvr) xvf0Var7.get(), (rjt0) xvf0Var6.get(), (lgv0) xvf0Var5.get(), (ru.yandex.taxi.preorder.source.mode.interactor.e) xvf0Var4.get(), (ru.yandex.taxi.layers.presentation.walkroute.simple.b) xvf0Var2.get(), (com.yandex.go.route.interactor.c) xvf0Var.get(), (tit0) xvf0Var3.get());
            case 14:
                return new ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.d((cv8) xvf0Var7.get(), (ru.yandex.logistics.sdk.cargo_form.core.impl.order.a) xvf0Var6.get(), (dv8) xvf0Var5.get(), (z4s) xvf0Var4.get(), (p6s) xvf0Var2.get(), (ue11) xvf0Var.get(), (b6s) xvf0Var3.get());
            case 15:
                return new com.yandex.messaging.input.c((ChatRequest) xvf0Var7.get(), (com.yandex.messaging.internal.e) xvf0Var6.get(), (com.yandex.messaging.navigation.c) xvf0Var5.get(), (jn3) xvf0Var4.get(), (eyj0) xvf0Var2.get(), (ryv) xvf0Var.get(), (mdb) xvf0Var3.get());
            case 16:
                return new rsx((Looper) xvf0Var7.get(), (n5t0) xvf0Var6.get(), (k020) xvf0Var5.get(), (naz0) xvf0Var4.get(), (oab) xvf0Var2.get(), (x22) xvf0Var.get(), (wff0) xvf0Var3.get());
            case 17:
                return new exy((naz0) xvf0Var7.get(), (n5t0) xvf0Var6.get(), (Looper) xvf0Var5.get(), (k020) xvf0Var4.get(), (o1b0) xvf0Var2.get(), (fbb) xvf0Var.get(), (x22) xvf0Var3.get());
            case 18:
                return new com.yandex.go.navigator.main_screen.k((n3h) xvf0Var7.get(), (m901) xvf0Var6.get(), (com.yandex.go.navigator.map_interactions.parkings.c) xvf0Var5.get(), (po21) xvf0Var4.get(), (com.yandex.go.navigator.repository.o) xvf0Var2.get(), (com.yandex.go.navigator.analitycs.a) xvf0Var.get(), (com.yandex.go.navigator.driving.analytics.a) xvf0Var3.get());
            case 19:
                return new com.yandex.messaging.internal.view.timeline.translations.e((Lifecycle) xvf0Var7.get(), (ChatRequest) xvf0Var6.get(), (com.yandex.messaging.internal.authorized.chat.b) xvf0Var5.get(), (kse) xvf0Var4.get(), (g) xvf0Var2.get(), (com.yandex.messaging.internal.translator.b) xvf0Var.get(), (bcb) xvf0Var3.get());
            case 20:
                return new py10((Handler) xvf0Var7.get(), i5m.a(xvf0Var6), (h9b) xvf0Var5.get(), (k020) xvf0Var4.get(), (c370) xvf0Var2.get(), (x22) xvf0Var.get(), (wff0) xvf0Var3.get());
            case 21:
                return new ga50((Context) xvf0Var7.get(), (m901) xvf0Var6.get(), (zuj0) xvf0Var5.get(), (oc50) xvf0Var4.get(), (UserPlacemarkStyleProvider) xvf0Var2.get(), (com.yandex.go.navigator.domain.v) xvf0Var.get(), (z950) xvf0Var3.get());
            case 22:
                return new jg50((w030) xvf0Var7.get(), (jv1) xvf0Var6.get(), (fv1) xvf0Var5.get(), (re50) xvf0Var4.get(), this.f, this.g, (eb50) xvf0Var3.get());
            case 23:
                return new mi60((ki60) xvf0Var7.get(), (ttq0) xvf0Var6.get(), (o1b0) xvf0Var5.get(), (at2) xvf0Var4.get(), (k020) xvf0Var2.get(), (iv21) xvf0Var.get(), (z5z) xvf0Var3.get());
            case 24:
                return new com.yandex.messaging.ui.settings.b((SharedPreferences) xvf0Var7.get(), (Handler) xvf0Var6.get(), (yi60) xvf0Var5.get(), i5m.a(xvf0Var4), (com.yandex.messaging.domain.statuses.c) xvf0Var2.get(), i5m.a(xvf0Var), (wi60) xvf0Var3.get());
            case 25:
                return new h((a480) xvf0Var7.get(), (ru.yandex.taxi.communications.data.a) xvf0Var6.get(), (wc80) xvf0Var5.get(), (hit) xvf0Var4.get(), (n20) xvf0Var2.get(), (wsc) xvf0Var.get(), (tt2) xvf0Var3.get());
            case 26:
                return new com.yandex.messaging.domain.poll.c((at2) xvf0Var7.get(), (Moshi) xvf0Var6.get(), (y2e0) xvf0Var5.get(), (wff0) xvf0Var4.get(), (k020) xvf0Var2.get(), (kse) xvf0Var.get(), (vse) xvf0Var3.get());
            case 27:
                return new s400();
            case 28:
                return new e0((com.yandex.go.taxi.tariffs.repository.g) xvf0Var7.get(), (RequirementsChangedNotifier) xvf0Var6.get(), (wiq0) xvf0Var5.get(), (dqe0) xvf0Var4.get(), (axm) xvf0Var2.get(), (ru.yandex.taxi.orderforanother.repository.a) xvf0Var.get(), (tt2) xvf0Var3.get());
            default:
                return new com.yandex.go.taxi.order.details.v2.state.elements.progress_bar.a((irs0) xvf0Var7.get(), (com.yandex.go.timer.k) xvf0Var6.get(), (jgv) xvf0Var5.get(), (lnk0) xvf0Var4.get(), (pdc) xvf0Var2.get(), (sqs0) xvf0Var.get(), (crg) xvf0Var3.get());
        }
    }

    public /* synthetic */ sb1(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
    }
}

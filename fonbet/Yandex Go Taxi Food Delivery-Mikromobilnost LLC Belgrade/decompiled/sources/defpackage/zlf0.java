package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.Lifecycle;
import com.squareup.moshi.Moshi;
import com.yandex.go.payments.domain.l;
import com.yandex.go.promocodes.base.impl.promo_codes.domain.interactors.a;
import com.yandex.go.promocodes.base.impl.promo_codes.domain.interactors.c;
import com.yandex.go.promocodes.e;
import com.yandex.go.quark.impl.dependencies.b;
import com.yandex.go.zone.repository.r;
import com.yandex.messaging.internal.authorized.j;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.qr.api.data.QrResolvingRulesApi;
import java.util.List;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.search.suggest.i;

/* loaded from: classes8.dex */
public final class zlf0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public /* synthetic */ zlf0(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.b;
        switch (i) {
            case 0:
                return new a((c) xvf0Var2.get(), (com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.c) xvf0Var.get());
            case 1:
                return new amf0((com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.c) xvf0Var2.get(), (r) xvf0Var.get());
            case 2:
                return new imf0((k7x0) xvf0Var2.get(), (l) xvf0Var.get());
            case 3:
                return new mmf0((g) xvf0Var2.get(), (com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.c) xvf0Var.get());
            case 4:
                return new oy80(29, (com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.c) xvf0Var2.get(), (smf0) xvf0Var.get());
            case 5:
                return new zmf0((tt2) xvf0Var.get(), (rqo) xvf0Var2.get());
            case 6:
                return new gof0((abf0) xvf0Var2.get(), (hof0) xvf0Var.get());
            case 7:
                return new e((w030) xvf0Var.get(), (Context) xvf0Var2.get());
            case 8:
                psf0 psf0Var = new psf0();
                new d82(1);
                return psf0Var;
            case 9:
                return new fuf0((Lifecycle) xvf0Var2.get(), (n9) xvf0Var.get());
            case 10:
                return new avf0((ouf0) xvf0Var2.get(), (Moshi) xvf0Var.get());
            case 11:
                return new mxf0((fxf0) xvf0Var2.get(), (List) xvf0Var.get());
            case 12:
                return new y4g0((z4g0) xvf0Var2.get(), (j2g0) xvf0Var.get());
            case 13:
                return new com.ybsdk.feature.qr.api.domain.a((QrResolvingRulesApi) xvf0Var2.get(), (cpp0) xvf0Var.get());
            case 14:
                return new com.yandex.go.quark.impl.dependencies.a(i5m.a(xvf0Var2), i5m.a(xvf0Var));
            case 15:
                return new b((tse) xvf0Var2.get(), (v7j0) xvf0Var.get());
            case 16:
                return new nai0((SharedPreferences) xvf0Var2.get(), (w3c) xvf0Var.get());
            case 17:
                return new tei0((oei0) xvf0Var2.get(), (dei0) xvf0Var.get());
            case 18:
                return new com.yandex.go.promocodes.referral.impl.ui.b((xni0) xvf0Var2.get(), (ru.yandex.taxi.utils.c) xvf0Var.get());
            case 19:
                return new o8g0((a1g0) xvf0Var2.get(), (z4g0) xvf0Var.get());
            case 20:
                return new p6j0((dqe0) xvf0Var2.get(), (i) xvf0Var.get());
            case 21:
                return new j7j0((z9s0) xvf0Var2.get(), (dne0) xvf0Var.get());
            case 22:
                return new srj0((dqe0) xvf0Var2.get(), (pte0) xvf0Var.get());
            case 23:
                return new com.yandex.messaging.domain.inviteLink.b((kse) xvf0Var2.get(), (j) xvf0Var.get());
            case 24:
                return new u0k0((AppAnalyticsReporter) xvf0Var2.get(), (y8j0) xvf0Var.get());
            case 25:
                return new x7k0((wiq0) xvf0Var2.get(), (y4k0) xvf0Var.get());
            case 26:
                return new iok0((zuj0) xvf0Var2.get(), (tse) xvf0Var.get());
            case 27:
                return new ru.yandex.taxi.data.a(i5m.a(xvf0Var2), (g) xvf0Var.get());
            case 28:
                return new g191((Context) xvf0Var2.get(), (dh60) xvf0Var.get());
            default:
                return new yxf0((ru.yandex.taxi.masstransit.datasource.routing.a) xvf0Var2.get(), (zuj0) xvf0Var.get());
        }
    }
}

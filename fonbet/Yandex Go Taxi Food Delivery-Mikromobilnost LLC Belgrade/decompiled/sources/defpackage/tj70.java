package defpackage;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.overdraft.domain.i;
import com.yandex.go.overdraft.domain.r;
import com.yandex.go.payments.data.f;
import com.yandex.go.payments.paymentlist.details.d;
import com.yandex.go.taxi.order.cancel.v2.data.b;
import com.yandex.go.taxi.order.cancel.v2.data.c;
import com.yandex.go.taxi.order.y;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.passport.impl.a;
import kotlin.InitializedLazyImpl;
import ru.yandex.taxi.am.k;
import ru.yandex.taxi.order.l;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes8.dex */
public final class tj70 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public /* synthetic */ tj70(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        a aVar;
        boolean z = false;
        switch (this.a) {
            case 0:
                return new b((e) this.b.get(), (pwy0) this.c.get());
            case 1:
                return new c((e) this.b.get(), (pwy0) this.c.get());
            case 2:
                return new xq70((pw2) this.b.get(), (y5w0) this.c.get());
            case 3:
                return new qt70((ovd0) this.b.get(), (b2a0) this.c.get());
            case 4:
                return new u380((iu6) this.b.get(), (wiq0) this.c.get());
            case 5:
                e680 e680Var = new e680((Context) this.b.get(), (za90) this.c.get());
                e680Var.w = false;
                return e680Var;
            case 6:
                return new l880((y) this.b.get(), (n20) this.c.get());
            case 7:
                return new u880((zuj0) this.b.get(), (xdf) this.c.get());
            case 8:
                return new v880((igh) this.b.get(), (rqo) this.c.get());
            case 9:
                return new l((Lifecycle) this.b.get(), (tse) this.c.get());
            case 10:
                return new ru.yandex.taxi.order.analytics.marknotify.b((wnt) this.c.get(), (dne0) this.b.get());
            case 11:
                return new bd80((ysg) this.b.get(), (k) this.c.get());
            case 12:
                return new ai80((x22) this.b.get(), (com.yandex.messaging.data.e) this.c.get());
            case 13:
                return new uva(8, i5m.a(this.b), i5m.a(this.c));
            case 14:
                com.ybsdk.adapters.passportsdk.impl.a aVar2 = (com.ybsdk.adapters.passportsdk.impl.a) this.b.get();
                InitializedLazyImpl initializedLazyImpl = new InitializedLazyImpl((AppAnalyticsReporter) this.c.get());
                synchronized (wwg.d) {
                    aVar = wwg.c;
                    if (aVar == null) {
                        aVar = new a(aVar2, initializedLazyImpl);
                        wwg.c = aVar;
                    }
                }
                return aVar;
            case 15:
                return new go90((u02) this.b.get(), (to90) this.c.get());
            case 16:
                return new r((com.yandex.go.lifecycle.a) this.b.get(), i5m.a(this.c));
            case 17:
                return new oy80(4, (wt90) this.b.get(), (ru.yandex.taxi.delivery.experiments.e) this.c.get());
            case 18:
                return e991.a((Context) this.b.get(), (u02) this.c.get());
            case 19:
                return new xx90((i) this.b.get(), (zuj0) this.c.get());
            case 20:
                return new f((wnt) this.b.get(), (dne0) this.c.get());
            case 21:
                return new i9a0((g9a0) this.b.get(), (j9a0) this.c.get());
            case 22:
                return new n9a0((wnt) this.b.get(), (dne0) this.c.get());
            case 23:
                return new d((tt2) this.b.get(), (n9a0) this.c.get());
            case 24:
                return new com.yandex.go.payments.promo.d((pdc) this.b.get(), (k7x0) this.c.get());
            case 25:
                return new yea0((ycq0) this.b.get(), (drd) this.c.get());
            case 26:
                return new xga0((w030) this.b.get(), (Context) this.c.get());
            case 27:
                return new sha0((lx4) this.b.get(), (arv0) this.c.get());
            case 28:
                return new uma0((eq4) this.b.get(), (se8) this.c.get());
            default:
                return new y4a0((cda0) this.c.get(), (com.yandex.go.zone.interactors.a) this.b.get(), z, 3);
        }
    }
}

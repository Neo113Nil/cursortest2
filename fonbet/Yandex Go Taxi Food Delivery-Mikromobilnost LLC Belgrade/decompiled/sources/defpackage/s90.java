package defpackage;

import android.content.Context;
import com.yandex.go.ai_widget.data.a;
import com.yandex.go.places.models.data.mappers.c;
import com.yandex.go.route.interactor.b;
import com.yandex.go.taxi.order.change.source.data.e;
import com.yandex.go.zone.repository.o;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import java.text.SimpleDateFormat;
import java.util.Locale;
import ru.yandex.taxi.preorder.repositories.g;
import ru.yandex.taxi.preorder.summary.solid.interactors.l;

/* loaded from: classes14.dex */
public final class s90 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;

    public /* synthetic */ s90(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
    }

    public static s90 a(c1 c1Var, js0 js0Var, c1 c1Var2) {
        return new s90(c1Var, js0Var, c1Var2, 6);
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        int i2 = 5;
        xvf0 xvf0Var = this.d;
        xvf0 xvf0Var2 = this.c;
        xvf0 xvf0Var3 = this.b;
        switch (i) {
            case 0:
                return new r90((k1x0) xvf0Var3.get(), (ria0) xvf0Var2.get(), (AppAnalyticsReporter) xvf0Var.get());
            case 1:
                return new sn0((tt2) xvf0Var3.get(), (atd0) xvf0Var2.get(), (b) xvf0Var.get());
            case 2:
                return new mrj(i2, (wb1) xvf0Var3.get(), (hp0) xvf0Var2.get(), (svw) xvf0Var.get());
            case 3:
                return new mrj(6, (f4l0) xvf0Var3.get(), (p6s) xvf0Var2.get(), (zqb0) xvf0Var.get());
            case 4:
                return new ru.yandex.taxi.logistics.sdk.address_details.api.b((gzh) xvf0Var3.get(), (ts0) xvf0Var2.get(), (tt0) xvf0Var.get());
            case 5:
                return new wa1((lx4) xvf0Var3.get(), (o) xvf0Var2.get(), (wiq0) xvf0Var.get());
            case 6:
                return new a(xvf0Var3, (com.yandex.go.ai_widget.data.b) xvf0Var2.get(), (po1) xvf0Var.get());
            case 7:
                return new l((tt2) xvf0Var3.get(), (wiq0) xvf0Var2.get(), (g) xvf0Var.get());
            case 8:
                return new va3((com.yandex.messaging.internal.authorized.chat.b) xvf0Var3.get(), (oy31) xvf0Var2.get(), (b00) xvf0Var.get());
            case 9:
                return new ic3(i5m.a(xvf0Var3), (r6e) xvf0Var2.get(), (Context) xvf0Var.get());
            case 10:
                return new com.yandex.messaging.chat.attachments.b(i5m.a(xvf0Var3), (com.yandex.messaging.chat.attachments.a) xvf0Var2.get(), (ic3) xvf0Var.get());
            case 11:
                return new com.yandex.go.taxi.order.change.source.interactor.a((e) xvf0Var3.get(), (pdc) xvf0Var2.get(), (Context) xvf0Var.get());
            case 12:
                return new bg4((zuj0) xvf0Var3.get(), (rqo) xvf0Var2.get(), (ynm0) xvf0Var.get());
            case 13:
                return new com.yandex.go.taxi.order.util.slot.a((ru.yandex.taxi.widget.utils.e) xvf0Var3.get(), (ndk0) xvf0Var2.get(), (zuj0) xvf0Var.get());
            case 14:
                return new z45((rwo) xvf0Var3.get(), (y22) xvf0Var2.get(), (vv50) xvf0Var.get());
            case 15:
                return new y22(scc.i((ve51) xvf0Var.get(), (u870) xvf0Var3.get()), (km0) xvf0Var2.get());
            case 16:
                return new gb6((o1b0) xvf0Var3.get(), i5m.a(xvf0Var2), i5m.a(xvf0Var));
            case 17:
                return new ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.bottom_dashboard.a((ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.b) xvf0Var3.get(), (ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.completed_state_widgets.a) xvf0Var2.get(), (d2q0) xvf0Var.get());
            case 18:
                return new c((pdc) xvf0Var3.get(), (com.yandex.go.places.models.data.mappers.a) xvf0Var2.get(), (ru.yandex.taxi.widget.c) xvf0Var.get());
            case 19:
                x22 x22Var = (x22) xvf0Var3.get();
                ml21 ml21Var = (ml21) xvf0Var2.get();
                String str = (String) xvf0Var.get();
                m2v m2vVar = new m2v();
                m2vVar.a = x22Var;
                m2vVar.b = ml21Var;
                m2vVar.c = str;
                m2vVar.w = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);
                return m2vVar;
            case 20:
                return new l68((com.yandex.go.navigator.map_interactions.parkings.c) xvf0Var3.get(), (m901) xvf0Var2.get(), (com.yandex.go.navigator.analitycs.a) xvf0Var.get());
            case 21:
                return new yb8((rwo) xvf0Var3.get(), (nhj) xvf0Var2.get(), (pcy) xvf0Var.get());
            case 22:
                r59 r59Var = (r59) ((kg51) xvf0Var3.get()).A.invoke((tw51) xvf0Var2.get(), (p59) xvf0Var.get());
                q5z.i(r59Var);
                return r59Var;
            case 23:
                return new r99((com.yandex.messaging.internal.authorized.chat.b) xvf0Var3.get(), (k020) xvf0Var2.get(), (xdf0) xvf0Var.get());
            case 24:
                return new da9(xvf0Var3, (oep0) xvf0Var2.get(), (b) xvf0Var.get());
            case 25:
                return new com.yandex.go.chargers.subscription.domain.a(i5m.a(xvf0Var3), (gua) xvf0Var2.get(), (zl9) xvf0Var.get());
            case 26:
                return new zsa(i2, xvf0Var3, xvf0Var2, xvf0Var);
            case 27:
                return new com.yandex.go.chargers.subscription.domain.c((po21) xvf0Var3.get(), (com.yandex.go.chargers.error.data.a) xvf0Var2.get(), i5m.a(xvf0Var));
            case 28:
                return new com.yandex.go.chargers.multiorder.ui.g((pdc) xvf0Var3.get(), (k7x0) xvf0Var2.get(), (ru.yandex.taxi.widget.c) xvf0Var.get());
            default:
                return new t((dea) xvf0Var3.get(), (Context) xvf0Var2.get(), (w030) xvf0Var.get());
        }
    }

    public /* synthetic */ s90(Object obj, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
    }
}

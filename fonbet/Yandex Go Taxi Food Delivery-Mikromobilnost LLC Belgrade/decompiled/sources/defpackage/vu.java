package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.yandex.go.places.map.data.repositories.h;
import com.yandex.go.scooters.driver_license_notification.domain.c;
import com.yandex.go.taxi.order.map.overlay.recenter.b;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.ui.imageviewer.a;
import java.util.Set;
import ru.yandex.taxi.logistics.sdk.tracking.uuid_store.d;
import ru.yandex.taxi.map.overlay.order.OrderMapOverlayComponent$Mode;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$FlowOrigin;

/* loaded from: classes12.dex */
public final class vu implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final n3w c;
    public final xvf0 d;

    public /* synthetic */ vu(n3w n3wVar, xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.c = n3wVar;
        this.b = xvf0Var;
        this.d = xvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        int i2 = 2;
        n3w n3wVar = this.c;
        xvf0 xvf0Var = this.d;
        xvf0 xvf0Var2 = this.b;
        switch (i) {
            case 0:
                return new uu((k7x0) xvf0Var2.get(), (i130) xvf0Var.get(), (iuv) n3wVar.a);
            case 1:
                return new ej1((x4a) xvf0Var2.get(), (a5a) n3wVar.a, (w030) xvf0Var.get(), 1);
            case 2:
                return new zya((w030) xvf0Var2.get(), xvf0Var, (gza) n3wVar.a);
            case 3:
                return new c3b((ViewGroup) n3wVar.a, (mp11) xvf0Var2.get(), (kse) xvf0Var.get());
            case 4:
                return new ej1((jzc) xvf0Var2.get(), (fzc) n3wVar.a, (w030) xvf0Var.get(), i2);
            case 5:
                return new ej1(4, (w030) xvf0Var2.get(), (o8o) xvf0Var.get(), (j8o) n3wVar.a);
            case 6:
                return new iai((uci) xvf0Var2.get(), (ozt0) n3wVar.a, (iii) xvf0Var.get());
            case 7:
                return new y1j((w030) xvf0Var2.get(), (Context) xvf0Var.get(), (q741) n3wVar.a);
            case 8:
                return new da0((sus) xvf0Var2.get(), (ous) n3wVar.a, (w030) xvf0Var.get());
            case 9:
                return new a((Activity) n3wVar.a, (xav) xvf0Var2.get(), (x22) xvf0Var.get());
            case 10:
                yaq0 yaq0Var = (yaq0) xvf0Var2.get();
                i6r i6rVar = (i6r) xvf0Var.get();
                k6x k6xVar = (k6x) n3wVar.a;
                yaq0Var.getClass();
                c0g c0gVar = (c0g) i6rVar;
                return new com.yandex.go.flex.common.actions.select_contact.di.a(yaq0Var, c0gVar, new taq0((vp21) c0gVar.z.a0.get(), c0gVar.N2()), new qgn0(12, k6xVar));
            case 11:
                return new ej1(9, (w030) xvf0Var2.get(), (eew) xvf0Var.get(), (zdw) n3wVar.a);
            case 12:
                return new qmw((umw) xvf0Var2.get(), (Context) xvf0Var.get(), (String) n3wVar.a);
            case 13:
                return new zq00((z501) xvf0Var.get(), (c701) n3wVar.a, (d) xvf0Var2.get());
            case 14:
                return new xus(xvf0Var2, (g2v) xvf0Var.get(), (f2v) n3wVar.a);
            case 15:
                return new xf40((b611) xvf0Var2.get(), (cg40) xvf0Var.get(), (TransportRouteAnalytics$FlowOrigin) n3wVar.a);
            case 16:
                return new lb60((w030) xvf0Var2.get(), (kb60) xvf0Var.get(), (hb60) n3wVar.a);
            case 17:
                cgi0 cgi0Var = (b) xvf0Var2.get();
                cgi0 cgi0Var2 = (com.yandex.go.taxi.order.map.overlay.recenter.a) xvf0Var.get();
                if (((OrderMapOverlayComponent$Mode) n3wVar.a) == OrderMapOverlayComponent$Mode.MULTIPLE) {
                    cgi0Var = cgi0Var2;
                }
                q5z.i(cgi0Var);
                return cgi0Var;
            case 18:
                return new yh80((Set) xvf0Var2.get(), (l770) xvf0Var.get(), (zg80) n3wVar.a);
            case 19:
                return new i7c0((uuv0) xvf0Var2.get(), (l7c0) xvf0Var.get(), (n7c0) n3wVar.a);
            case 20:
                return new h((tt2) xvf0Var2.get(), (tse) n3wVar.a, (yac0) xvf0Var.get());
            case 21:
                return new q6c0(22, (ChatRequest) xvf0Var2.get(), (com.yandex.messaging.internal.authorized.chat.b) xvf0Var.get(), (LocalMessageRef) n3wVar.a);
            case 22:
                return new zsa(27, (zmk0) xvf0Var2.get(), (gnk0) n3wVar.a, (com.yandex.go.taxi.order.details.v2.analytics.perf.a) xvf0Var.get());
            case 23:
                return new ej1((zcl0) xvf0Var2.get(), (kdl0) n3wVar.a, (w030) xvf0Var.get(), 16);
            case 24:
                return new aul0((ztl0) xvf0Var2.get(), (ltl0) n3wVar.a, (w030) xvf0Var.get());
            case 25:
                return new w1n0((w030) xvf0Var2.get(), (fva0) xvf0Var.get(), (t1n0) n3wVar.a);
            case 26:
                return new da0(20, (w030) xvf0Var2.get(), (fva0) xvf0Var.get(), (d4n0) n3wVar.a);
            case 27:
                return new c((com.yandex.go.scooters.promotions.domain.a) xvf0Var2.get(), (yin0) n3wVar.a, (com.yandex.go.scooters.driver_license.data.a) xvf0Var.get());
            case 28:
                return new com.yandex.go.scooters.offers.v2.details.d((w030) xvf0Var2.get(), (l3o0) xvf0Var.get(), (i3o0) n3wVar.a);
            default:
                return new ra9((dmo0) xvf0Var.get(), (w030) xvf0Var2.get(), (bmo0) n3wVar.a, i2);
        }
    }

    public /* synthetic */ vu(xvf0 xvf0Var, n3w n3wVar, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = n3wVar;
        this.d = xvf0Var2;
    }

    public /* synthetic */ vu(xvf0 xvf0Var, xvf0 xvf0Var2, n3w n3wVar, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.d = xvf0Var2;
        this.c = n3wVar;
    }
}

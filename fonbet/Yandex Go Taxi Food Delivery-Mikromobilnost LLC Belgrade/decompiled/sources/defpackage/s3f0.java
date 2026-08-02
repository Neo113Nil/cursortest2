package defpackage;

import android.content.Context;
import com.yandex.go.preorder.lifecycle.e;
import com.yandex.go.taxi.order.details.v2.state.elements.accordion.b;
import com.yandex.go.taxi.order.queue.interactor.c;
import com.yandex.go.taxi.order.queue.interactor.d;
import com.yandex.go.zone.repository.o;
import com.yandex.messaging.internal.storage.contacts.a;
import java.util.LinkedList;
import ru.yandex.taxi.layers.presentation.mapnotification.MapNotificationsMuteRepository;
import ru.yandex.taxi.scooters.data.ScootersHistoryApi;
import ru.yandex.taxi.scooters.data.w;
import ru.yandex.taxi.scooters.domain.q;
import ru.yandex.taxi.scooters.presentation.feedback.data.ScootersFeedbackApi;
import ru.yandex.taxi.summary.solid.interactor.s;

/* loaded from: classes13.dex */
public final class s3f0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;

    public /* synthetic */ s3f0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
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
                r3f0 r3f0Var = new r3f0();
                new LinkedList();
                return r3f0Var;
            case 1:
                return new e((o) xvf0Var3.get(), (g3g0) xvf0Var2.get(), (q3g0) xvf0Var.get());
            case 2:
                return new q6c0(16, (Context) xvf0Var3.get(), (xdf0) xvf0Var2.get(), (wi60) xvf0Var.get());
            case 3:
                return new c((p2y0) xvf0Var3.get(), (com.yandex.go.navigation.screen.c) xvf0Var2.get(), (d) xvf0Var.get());
            case 4:
                return new pai0((xav) xvf0Var3.get(), (gsu) xvf0Var2.get(), (zxo) xvf0Var.get());
            case 5:
                return new rmi0((naz0) xvf0Var3.get(), (k020) xvf0Var2.get(), (xdf0) xvf0Var.get());
            case 6:
                a aVar = (a) xvf0Var3.get();
                return new gui0((x22) xvf0Var.get(), (at2) xvf0Var2.get(), aVar);
            case 7:
                return new com.yandex.go.summary.mapper.a((xdf) xvf0Var2.get(), (zuj0) xvf0Var3.get(), (ru.yandex.taxi.widget.c) xvf0Var.get());
            case 8:
                return new q6c0(27, (f580) xvf0Var3.get(), (xcv0) xvf0Var2.get(), (roj0) xvf0Var.get());
            case 9:
                return new s((hqj0) xvf0Var3.get(), (amc) xvf0Var2.get(), (g580) xvf0Var.get());
            case 10:
                return new ru.yandex.taxi.requirements.repository.e((on2) xvf0Var3.get(), (tt2) xvf0Var2.get(), (wnt) xvf0Var.get());
            case 11:
                return new b((com.yandex.go.taxi.order.details.v2.state.elements.generic.a) xvf0Var3.get(), (xjk0) xvf0Var2.get(), (v8k0) xvf0Var.get());
            case 12:
                return new com.yandex.go.taxi.order.details.v2.state.elements.cost_center.c((o2y0) xvf0Var3.get(), (cda0) xvf0Var2.get(), (com.yandex.go.taxi.order.details.v2.state.elements.generic.a) xvf0Var.get());
            case 13:
                return new mkk0((o2y0) xvf0Var3.get(), (com.yandex.go.taxi.order.details.v2.domain.feedback.a) xvf0Var2.get(), (qzc) xvf0Var.get());
            case 14:
                return new gpk0((tt2) xvf0Var3.get(), (ru.yandex.taxi.widget.utils.e) xvf0Var2.get(), (ytz) xvf0Var.get());
            case 15:
                return new opk0((xdf) xvf0Var3.get(), (zuj0) xvf0Var2.get(), (rck0) xvf0Var.get());
            case 16:
                return new com.yandex.go.taxi.order.details.v2.core.d((tse) xvf0Var3.get(), i5m.a(xvf0Var2), i5m.a(xvf0Var));
            case 17:
                return new x1l0((zuj0) xvf0Var3.get(), (mg50) xvf0Var2.get(), (wsk0) xvf0Var.get());
            case 18:
                ru.yandex.taxi.preorder.source.points.a aVar2 = (ru.yandex.taxi.preorder.source.points.a) xvf0Var3.get();
                h3y a = i5m.a(xvf0Var2);
                hbm hbmVar = (hbm) xvf0Var.get();
                kdd0 kdd0Var = new kdd0();
                kdd0Var.a = aVar2;
                kdd0Var.b = a;
                kdd0Var.c = hbmVar;
                kdd0Var.d = u0c0.d;
                return kdd0Var;
            case 19:
                return new gdm0((j3h) xvf0Var.get(), (tfl0) xvf0Var3.get(), (np41) xvf0Var2.get());
            case 20:
                return new ru.yandex.taxi.scooters.presentation.arbitrary_destination.domain.a((po21) xvf0Var3.get(), (huo0) xvf0Var2.get(), (bym0) xvf0Var.get());
            case 21:
                return new iym0((MapNotificationsMuteRepository) xvf0Var3.get(), xvf0Var2, xvf0Var);
            case 22:
                return new i0n0((ljr) xvf0Var3.get(), (com.yandex.div.core.expression.variables.a) xvf0Var2.get(), (x0n0) xvf0Var.get());
            case 23:
                return new com.yandex.go.scooters.domain.c((qwo0) xvf0Var3.get(), (ukn0) xvf0Var2.get(), (yun0) xvf0Var.get());
            case 24:
                return new com.yandex.go.scooters.ble.domain.ninebot.a((dso0) xvf0Var3.get(), (com.yandex.go.scooters.ble.data.ninebot.a) xvf0Var2.get(), (p1n0) xvf0Var.get());
            case 25:
                return new ru.yandex.taxi.scooters.domain.d((ru.yandex.taxi.jobs.b) xvf0Var3.get(), (w) xvf0Var2.get(), (h8n0) xvf0Var.get());
            case 26:
                return new com.yandex.go.scooters.driver_license.domain.a((q) xvf0Var3.get(), (ru.yandex.taxi.am.o) xvf0Var2.get(), (com.yandex.go.scooters.driver_license.data.a) xvf0Var.get());
            case 27:
                return new ru.yandex.taxi.scooters.presentation.feedback.data.a((ScootersFeedbackApi) xvf0Var3.get(), (ru.yandex.taxi.scooters.presentation.feedback.data.mapper.a) xvf0Var2.get(), (ru.yandex.taxi.scooters.data.a) xvf0Var.get());
            case 28:
                return new ru.yandex.taxi.scooters.data.o((ScootersHistoryApi) xvf0Var3.get(), (ru.yandex.taxi.scooters.data.mapper.d) xvf0Var2.get(), (ru.yandex.taxi.scooters.data.a) xvf0Var.get());
            default:
                return new com.yandex.go.scooters.ignition.panel.e((zuj0) xvf0Var3.get(), (yp2) xvf0Var2.get(), (ru.yandex.taxi.widget.c) xvf0Var.get());
        }
    }
}

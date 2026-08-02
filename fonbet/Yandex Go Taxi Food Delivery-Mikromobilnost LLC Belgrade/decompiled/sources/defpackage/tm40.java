package defpackage;

import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import com.yandex.go.multimodal_route.interactors.c;
import com.yandex.go.navigator.di.a;
import com.yandex.go.payments.shared.data.CoopAccountApi;
import com.yandex.go.payments.shared.v;
import com.yandex.go.taxi.tariffs.interactor.g;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.di.modules.f;
import com.ybsdk.rconfig.b;
import com.ybsdk.screens.initial.deeplink.e;
import ru.yandex.taxi.experiments.i;
import ru.yandex.taxi.logistics.experiments.k;
import ru.yandex.taxi.map_common.map.r;

/* loaded from: classes9.dex */
public final class tm40 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public /* synthetic */ tm40(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
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
                return new sm40((i) xvf0Var2.get(), (qmp) xvf0Var.get());
            case 1:
                return new kjz(8, (pdc) xvf0Var2.get(), (yp2) xvf0Var.get());
            case 2:
                return new cq40((po40) xvf0Var2.get(), (tp40) xvf0Var.get());
            case 3:
                return new c((r) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 4:
                return new yu40((wnt) xvf0Var.get(), (dne0) xvf0Var2.get());
            case 5:
                return new d350(i5m.a(xvf0Var2), i5m.a(xvf0Var));
            case 6:
                return new p450((b) xvf0Var2.get(), (qpi0) xvf0Var.get());
            case 7:
                return new com.yandex.go.navigator.order.c((vd50) xvf0Var2.get(), (r341) xvf0Var.get());
            case 8:
                return new sb50((Context) xvf0Var2.get(), (wsk0) xvf0Var.get());
            case 9:
                return new kc50(xvf0Var2, (oep0) xvf0Var.get());
            case 10:
                return new vd50((zuj0) xvf0Var2.get(), (lf50) xvf0Var.get());
            case 11:
                return new mg50((zuj0) xvf0Var.get(), (Context) xvf0Var2.get());
            case 12:
                return new a((cb50) xvf0Var2.get(), (tse) xvf0Var.get());
            case 13:
                return new ru.yandex.taxi.logistics.ndd_map.domain.c((g) xvf0Var2.get(), (k) xvf0Var.get());
            case 14:
                return new ru.yandex.taxi.favorites.address.impl.factory.a((ru.yandex.taxi.favorites.address.impl.data.a) xvf0Var2.get(), (ru.yandex.taxi.favorites.address.api.experiment.a) xvf0Var.get());
            case 15:
                return new lm50((kse) xvf0Var.get(), i5m.a(xvf0Var2));
            case 16:
                return new com.yandex.go.network_metrics.experiment.a((tt2) xvf0Var2.get(), (rqo) xvf0Var.get());
            case 17:
                return ((cx50) xvf0Var.get()).a(((w4o) xvf0Var2.get()).b);
            case 18:
                return new ej3(new f(xvf0Var2), (AppAnalyticsReporter) xvf0Var.get());
            case 19:
                return new dj4((w4o) xvf0Var2.get(), new bx50((b) xvf0Var.get(), 1));
            case 20:
                return ((cx50) xvf0Var.get()).a(((w4o) xvf0Var2.get()).a);
            case 21:
                q960 q960Var = (q960) ((kg51) xvf0Var.get()).g.invoke((dnp0) xvf0Var2.get());
                q5z.i(q960Var);
                return q960Var;
            case 22:
                Context context = (Context) xvf0Var2.get();
                x22 x22Var = (x22) xvf0Var.get();
                dh60 dh60Var = new dh60();
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager == null) {
                    x22Var.reportError("There are no NotificationManager", new Throwable());
                } else {
                    String string = context.getString(oyh0.notification_channels_group_new);
                    NotificationChannelGroup notificationChannelGroup = new NotificationChannelGroup("messenger_notifications_group", string);
                    notificationChannelGroup.setDescription(string);
                    notificationManager.createNotificationChannelGroup(notificationChannelGroup);
                }
                return dh60Var;
            case 23:
                return new ru.yandex.taxi.notifications.f(i5m.a(xvf0Var2), (jyn) xvf0Var.get());
            case 24:
                return new com.yandex.go.payments.shared.c((CoopAccountApi) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 25:
                return new po60((dne0) xvf0Var2.get(), (ru11) xvf0Var.get());
            case 26:
                return new e270((lx4) xvf0Var2.get(), (ru.yandex.taxi.perf.b) xvf0Var.get());
            case 27:
                return new ru.yandex.taxi.costcenters.ride.c((cda0) xvf0Var2.get(), (zuj0) xvf0Var.get());
            case 28:
                return new e((b) xvf0Var2.get(), (vop0) xvf0Var.get());
            default:
                return new com.yandex.go.payments.shared.f((cda0) xvf0Var2.get(), (v) xvf0Var.get());
        }
    }

    public /* synthetic */ tm40(Object obj, xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }
}

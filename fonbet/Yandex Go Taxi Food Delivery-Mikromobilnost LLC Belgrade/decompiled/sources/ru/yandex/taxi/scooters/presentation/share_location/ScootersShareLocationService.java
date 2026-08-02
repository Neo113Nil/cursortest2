package ru.yandex.taxi.scooters.presentation.share_location;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.location.LocationManager;
import android.os.IBinder;
import androidx.core.app.e;
import androidx.core.app.v;
import com.yandex.go.scooters.domain.model.ScootersNotificationType;
import defpackage.avj0;
import defpackage.cjm0;
import defpackage.e3n;
import defpackage.ehn0;
import defpackage.f8y;
import defpackage.h6r;
import defpackage.hbp0;
import defpackage.hvo0;
import defpackage.i3y;
import defpackage.kp50;
import defpackage.ky2;
import defpackage.kyh0;
import defpackage.m2o0;
import defpackage.nmx;
import defpackage.o2o0;
import defpackage.o430;
import defpackage.on2;
import defpackage.po21;
import defpackage.pzt0;
import defpackage.q5z;
import defpackage.qgn0;
import defpackage.rqo;
import defpackage.svo0;
import defpackage.tt2;
import defpackage.wwg;
import defpackage.zuj0;
import defpackage.zzf;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.time.DurationUnit;
import ru.yandex.taxi.network.api.models.GoApiName;
import ru.yandex.taxi.scooters.data.g;
import ru.yandex.taxi.scooters.presentation.share_location.data.ScootersShareLocationApi;
import ru.yandex.taxi.scooters.presentation.share_location.data.b;
import ru.yandex.taxi.scooters.presentation.share_location.domain.d;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u0003J)\u0010\u000e\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0003R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/scooters/presentation/share_location/ScootersShareLocationService;", "Landroid/app/Service;", "<init>", "()V", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "Lzy11;", "onCreate", "", "flags", "startId", "onStartCommand", "(Landroid/content/Intent;II)I", "onDestroy", "Lru/yandex/taxi/scooters/presentation/share_location/a;", "scootersShareLocationPresenter$delegate", "Li3y;", "getScootersShareLocationPresenter", "()Lru/yandex/taxi/scooters/presentation/share_location/a;", "scootersShareLocationPresenter", "qgn0", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersShareLocationService extends Service {
    public static final int $stable = 8;

    /* renamed from: scootersShareLocationPresenter$delegate, reason: from kotlin metadata */
    private final i3y scootersShareLocationPresenter = kotlin.a.a(new ehn0(24, this));

    private final a getScootersShareLocationPresenter() {
        return (a) this.scootersShareLocationPresenter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a scootersShareLocationPresenter_delegate$lambda$0(ScootersShareLocationService scootersShareLocationService) {
        zzf zzfVar = (zzf) ((h6r) wwg.e(scootersShareLocationService, h6r.class));
        tt2 tt2Var = (tt2) zzfVar.n.get();
        ky2 ky2Var = (ky2) zzfVar.b0.get();
        o2o0 q1 = zzfVar.q1();
        f8y f8yVar = (f8y) zzfVar.nc.get();
        tt2 tt2Var2 = (tt2) zzfVar.n.get();
        LocationManager locationManager = (LocationManager) zzfVar.O2.get();
        po21 po21Var = (po21) zzfVar.Y1.get();
        tt2 tt2Var3 = (tt2) zzfVar.n.get();
        nmx nmxVar = (nmx) zzfVar.Ab.get();
        on2 on2Var = (on2) zzfVar.w0.get();
        on2Var.getClass();
        ScootersShareLocationApi scootersShareLocationApi = (ScootersShareLocationApi) on2Var.a(GoApiName.TaxiV4, ScootersShareLocationApi.class);
        q5z.i(scootersShareLocationApi);
        return new a(tt2Var, ky2Var, q1, new d(f8yVar, tt2Var2, locationManager, po21Var, new b(tt2Var3, nmxVar, scootersShareLocationApi), new hvo0((rqo) zzfVar.C.get())), new cjm0(13, (zuj0) zzfVar.W.get(), zzfVar.q1()), (g) zzfVar.gb.get(), (svo0) zzfVar.Oi.get());
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        a scootersShareLocationPresenter = getScootersShareLocationPresenter();
        scootersShareLocationPresenter.j = new qgn0(7, this);
        scootersShareLocationPresenter.h.a();
        scootersShareLocationPresenter.g.Fg(Boolean.TRUE);
        scootersShareLocationPresenter.b.k(ScootersShareLocationService.class);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        a scootersShareLocationPresenter = getScootersShareLocationPresenter();
        scootersShareLocationPresenter.g.Fg(Boolean.FALSE);
        scootersShareLocationPresenter.b.m(ScootersShareLocationService.class);
        scootersShareLocationPresenter.c.c.i.a(421541876, null);
        scootersShareLocationPresenter.h.b();
        scootersShareLocationPresenter.j = null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        a scootersShareLocationPresenter = getScootersShareLocationPresenter();
        o2o0 o2o0Var = scootersShareLocationPresenter.c;
        cjm0 cjm0Var = scootersShareLocationPresenter.e;
        o2o0 o2o0Var2 = (o2o0) cjm0Var.c;
        v a = m2o0.a(o2o0Var2, ScootersNotificationType.SYSTEM, ((avj0) ((zuj0) cjm0Var.b)).h(kyh0.scooters_share_location_notification_title), 4);
        a.h = o2o0Var2.d(null);
        a.h(2, true);
        a.h(16, false);
        a.n = false;
        a.h(8, true);
        a.x = Constants.KEY_SERVICE;
        a.A = 1;
        o430 o430Var = e3n.b;
        a.H = e3n.e(kp50.U(30, DurationUnit.MINUTES));
        Notification f = o2o0Var.f(421541876, a);
        qgn0 qgn0Var = scootersShareLocationPresenter.j;
        if (qgn0Var != null) {
            e.m((ScootersShareLocationService) qgn0Var.b, 421541876, f, 8);
        }
        pzt0 pzt0Var = scootersShareLocationPresenter.i;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        scootersShareLocationPresenter.i = hbp0.e(scootersShareLocationPresenter.h, null, null, new ScootersShareLocationPresenter$listenAndSendLocation$1(scootersShareLocationPresenter, null), 3);
        return 2;
    }
}

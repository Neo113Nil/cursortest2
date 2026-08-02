package defpackage;

import android.content.Context;
import android.hardware.SensorManager;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import com.squareup.moshi.Moshi;
import com.yandex.go.payments_widgets.yandex_bank.RotationDetectorListener;
import com.yandex.go.route.interactor.b;
import com.yandex.go.scooters.domain.i0;
import com.yandex.go.scooters.domain.j0;
import com.yandex.go.scooters.domain.u;
import com.yandex.go.scooters.domain.v;
import com.yandex.go.superapp.order.multi.old.provider.g;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.messaging.internal.storage.i;
import com.yandex.messaging.profile.c;
import com.yandex.messaging.profile.d;
import com.yandex.messaging.profile.e;
import com.yandex.messaging.profile.h;
import com.ybsdk.common.DeviceIdProvider;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.persistence.api.StorageType;
import java.io.File;
import ru.yandex.taxi.am.o;
import ru.yandex.taxi.cashback.sdk.c0;
import ru.yandex.taxi.panorama.l;
import ru.yandex.taxi.statebar.a;
import ru.yandex.taxi.yaplus.YaPlusStatusRepository;

/* loaded from: classes8.dex */
public final class ure0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;
    public final xvf0 h;
    public final xvf0 i;

    public /* synthetic */ ure0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
        this.i = xvf0Var8;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.f;
        xvf0 xvf0Var2 = this.e;
        xvf0 xvf0Var3 = this.g;
        xvf0 xvf0Var4 = this.c;
        xvf0 xvf0Var5 = this.b;
        xvf0 xvf0Var6 = this.i;
        xvf0 xvf0Var7 = this.h;
        xvf0 xvf0Var8 = this.d;
        switch (i) {
            case 0:
                return new tre0((dqe0) xvf0Var5.get(), (jjv0) xvf0Var4.get(), (g) xvf0Var8.get(), (q4l0) xvf0Var2.get(), (b) xvf0Var.get(), i5m.a(xvf0Var3), i5m.a(xvf0Var7), (icv0) xvf0Var6.get());
            case 1:
                return new e((vse) xvf0Var5.get(), (d) xvf0Var4.get(), (c) xvf0Var8.get(), (vef0) xvf0Var2.get(), (m120) xvf0Var.get(), (za51) xvf0Var3.get(), (h) xvf0Var7.get(), (i) xvf0Var6.get());
            case 2:
                return new hdf0((kse) xvf0Var4.get(), new dff0((File) xvf0Var8.get(), (Context) xvf0Var5.get(), (Moshi) xvf0Var2.get(), (x22) xvf0Var.get(), (cvg) xvf0Var3.get(), (Looper) xvf0Var7.get(), i5m.a(xvf0Var6)));
            case 3:
                return new z3g0((tse) xvf0Var5.get(), (tj60) xvf0Var4.get(), (g3g0) xvf0Var8.get(), (v2g0) xvf0Var2.get(), (j2g0) xvf0Var.get(), (jae0) xvf0Var3.get(), (x500) xvf0Var7.get(), (x1g0) xvf0Var6.get());
            case 4:
                return new RotationDetectorListener((SensorManager) xvf0Var5.get(), (mxk0) xvf0Var4.get(), (Context) xvf0Var8.get(), (Lifecycle) xvf0Var2.get(), (jv51) xvf0Var.get(), (u2w0) xvf0Var3.get(), (hea0) xvf0Var7.get(), (yaa0) xvf0Var6.get());
            case 5:
                return new dwn0(scc.g((ebn0) xvf0Var5.get(), (zxn0) xvf0Var4.get(), (i0) xvf0Var8.get(), (v7n0) xvf0Var2.get(), (j0) xvf0Var.get(), (oyn0) xvf0Var3.get(), (v) xvf0Var7.get(), (u) xvf0Var6.get()));
            case 6:
                Context context = (Context) xvf0Var5.get();
                kg51 kg51Var = (kg51) xvf0Var4.get();
                return new DeviceIdProvider(context, kg51Var.n, (ppp0) xvf0Var8.get(), (com.ybsdk.rconfig.b) xvf0Var2.get(), this.f, (Moshi) xvf0Var3.get(), ((c1b0) ((a1b0) xvf0Var6.get())).a(StorageType.DEVICE_ID), (AppAnalyticsReporter) xvf0Var7.get());
            case 7:
                return new ru.yandex.taxi.i((tse) xvf0Var5.get(), (Lifecycle) xvf0Var4.get(), (a) xvf0Var8.get(), (kf4) xvf0Var2.get(), (ru.yandex.taxi.linked_order.a) xvf0Var.get(), (com.yandex.go.overdraft.ui.g) xvf0Var3.get(), (ru.yandex.taxi.statebar.controller.a) xvf0Var7.get(), (ru.yandex.taxi.inapp_calls.a) xvf0Var6.get());
            case 8:
                return new f9a(this.b, this.c, (com.yandex.go.mainscreen.superapp.impl.foundation.domain.g) xvf0Var8.get(), this.e, this.f, this.g, (dqe0) xvf0Var7.get(), (com.yandex.go.route.interactor.c) xvf0Var6.get());
            case 9:
                return new dcw0((en10) xvf0Var5.get(), (tt2) xvf0Var4.get(), (f600) xvf0Var8.get(), this.e, (y9y0) xvf0Var.get(), (ibw0) xvf0Var3.get(), (kpr) xvf0Var7.get(), (oep0) xvf0Var6.get());
            case 10:
                return new com.yandex.go.insets.e((tse) xvf0Var5.get(), (Lifecycle) xvf0Var4.get(), (c2x0) xvf0Var8.get(), (mhf) xvf0Var2.get(), (a) xvf0Var.get(), (y3u0) xvf0Var3.get(), (g2x0) xvf0Var7.get(), (pwy0) xvf0Var6.get());
            case 11:
                return new k((dqe0) xvf0Var5.get(), (jnx0) xvf0Var4.get(), (urw) xvf0Var8.get(), (qrw) xvf0Var2.get(), (rg70) xvf0Var.get(), (ekq0) xvf0Var3.get(), (yox0) xvf0Var7.get(), (maj0) xvf0Var6.get());
            case 12:
                return new c0((alc0) xvf0Var5.get(), (n20) xvf0Var4.get(), (ru.yandex.taxi.cashback.sdk.k) xvf0Var8.get(), (j49) xvf0Var2.get(), (bxx0) xvf0Var.get(), (cda0) xvf0Var3.get(), (com.yandex.go.chargers.payments.domain.c) xvf0Var7.get(), (com.yandex.go.scooters.domain.i) xvf0Var6.get());
            case 13:
                return new l((a8y0) xvf0Var5.get(), (pav) xvf0Var4.get(), (rpb0) xvf0Var8.get(), (i8y0) xvf0Var2.get(), (c9y0) xvf0Var.get(), (zuj0) xvf0Var3.get(), (ac20) xvf0Var7.get(), (pwy0) xvf0Var6.get());
            case 14:
                return new ru.yandex.taxi.userinfo.a((on2) xvf0Var5.get(), (rqo) xvf0Var4.get(), (ru.yandex.taxi.am.g) xvf0Var8.get(), (n9) xvf0Var2.get(), (fva0) xvf0Var.get(), (zl60) xvf0Var3.get(), (kb20) xvf0Var7.get(), (hit) xvf0Var6.get());
            default:
                return new ru.yandex.taxi.yaplus.e((tt2) xvf0Var5.get(), (ru.yandex.taxi.utils.c) xvf0Var4.get(), (k7x0) xvf0Var8.get(), (o) xvf0Var2.get(), (kk51) xvf0Var.get(), (qmp) xvf0Var3.get(), (YaPlusStatusRepository) xvf0Var7.get(), (com.yandex.go.zone.repository.o) xvf0Var6.get());
        }
    }

    public /* synthetic */ ure0(Object obj, v7p v7pVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, int i) {
        this.a = i;
        this.b = v7pVar;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.e = xvf0Var3;
        this.f = xvf0Var4;
        this.g = xvf0Var5;
        this.h = xvf0Var6;
        this.i = xvf0Var7;
    }
}

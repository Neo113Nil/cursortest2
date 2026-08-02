package defpackage;

import android.os.Handler;
import com.yandex.go.navigator.domain.v;
import com.yandex.go.pickup_from_photo.domain.t;
import com.yandex.go.repositories.e;
import com.yandex.go.superapp.order.multi.old.provider.g;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.messaging.MessengerEnvironment;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.transactions.impl.data.b;
import com.ybsdk.feature.transactions.impl.domain.interactors.a;
import com.ybsdk.rconfig.SimpleIdValidation;
import ru.yandex.taxi.am.f0;
import ru.yandex.taxi.multiorder.tracked.c;
import ru.yandex.taxi.orderforanother.interactor.f;
import ru.yandex.taxi.preorder.summary.solid.interactors.q0;

/* loaded from: classes14.dex */
public final class y101 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;

    public /* synthetic */ y101(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
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
                return new c((g) xvf0Var3.get(), (cm40) xvf0Var2.get(), (l551) xvf0Var.get());
            case 1:
                return new a((b) xvf0Var3.get(), (sf01) xvf0Var2.get(), (AppAnalyticsReporter) xvf0Var.get());
            case 2:
                return new jz01((o1b0) xvf0Var3.get(), (x0j0) xvf0Var2.get(), (kse) xvf0Var.get());
            case 3:
                return new aq11((o1b0) xvf0Var3.get(), (Handler) xvf0Var2.get(), (w3c) xvf0Var.get());
            case 4:
                return new c521((wiq0) xvf0Var3.get(), (axm) xvf0Var2.get(), (ibn) xvf0Var.get());
            case 5:
                return new com.yandex.go.taxi.tariffs.internal.interactor.c((tt2) xvf0Var3.get(), (com.yandex.go.taxi.tariffs.repository.g) xvf0Var2.get(), (k) xvf0Var.get());
            case 6:
                return new ba21((des0) xvf0Var3.get(), (SimpleIdValidation) xvf0Var2.get(), (dyp0) xvf0Var.get());
            case 7:
                return new t((sgb0) xvf0Var3.get(), (com.yandex.go.pickup_from_photo.data.c) xvf0Var2.get(), (bjb0) xvf0Var.get());
            case 8:
                return new jl21((fjs) xvf0Var3.get(), (ml21) xvf0Var2.get(), (at2) xvf0Var.get());
            case 9:
                return new ru.yandex.taxi.masstransit.userlocation.b((po21) xvf0Var3.get(), (qwc) xvf0Var2.get(), (ney) xvf0Var.get());
            case 10:
                return new zr21((oc50) xvf0Var3.get(), (v) xvf0Var2.get(), (yr21) xvf0Var.get());
            case 11:
                return new cjw0((o2y0) xvf0Var3.get(), (noe) xvf0Var2.get(), (k0b0) xvf0Var.get());
            case 12:
                return new qh31((ah00) xvf0Var3.get(), (a3v) xvf0Var2.get(), (hi31) xvf0Var.get());
            case 13:
                return new ti31((zuj0) xvf0Var3.get(), (jgv) xvf0Var2.get(), (qj31) xvf0Var.get());
            case 14:
                return new vz41((ru.yandex.taxi.orderforanother.repository.a) xvf0Var3.get(), (qv70) xvf0Var2.get(), (kr0) xvf0Var.get());
            case 15:
                return new f((e) xvf0Var3.get(), (f0) xvf0Var2.get(), (zuj0) xvf0Var.get());
            case 16:
                return new ab51((at2) xvf0Var3.get(), (xqi0) xvf0Var2.get(), (yef0) xvf0Var.get());
            case 17:
                return new wd51((doc) xvf0Var3.get(), (kse) xvf0Var2.get(), (xw50) xvf0Var.get());
            case 18:
                return new mj31(9, (yo3) xvf0Var3.get(), (ouu) xvf0Var2.get(), (bbj) xvf0Var.get());
            case 19:
                return new yj51((vj51) xvf0Var3.get(), (nk21) xvf0Var2.get(), (x22) xvf0Var.get());
            case 20:
                return new ck51((x22) xvf0Var3.get(), (ik51) xvf0Var2.get(), (MessengerEnvironment) xvf0Var.get());
            default:
                return new q0((com.yandex.go.yb.domain.b) xvf0Var3.get(), i5m.a(xvf0Var2), i5m.a(xvf0Var));
        }
    }
}

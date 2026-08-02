package defpackage;

import android.content.Context;
import com.yandex.go.personal_goals_v2.data.a;
import com.yandex.go.pickup_from_photo.experiment.p;
import com.yandex.go.pickuppoints.impl.l;
import com.yandex.go.places.experiments.map.j;
import com.yandex.go.places.experiments.map.social_pin.b;
import ru.yandex.taxi.activity.g;
import ru.yandex.taxi.common_models.net.SimplePersistentBooleanExperiment;
import ru.yandex.taxi.experiments.i;
import ru.yandex.taxi.f;
import ru.yandex.taxi.logistics.photocomment.c;
import ru.yandex.taxi.plaque.api.dependencies.PlaqueEnvironment;

/* loaded from: classes9.dex */
public final class qta0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public /* synthetic */ qta0(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        PlaqueEnvironment plaqueEnvironment;
        int i = this.a;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.b;
        switch (i) {
            case 0:
                return new i((dlw0) xvf0Var2.get(), (rqo) xvf0Var.get());
            case 1:
                return new jwa0((c370) xvf0Var2.get(), (wff0) xvf0Var.get());
            case 2:
                return new a((pav) xvf0Var2.get(), (k7x0) xvf0Var.get());
            case 3:
                return new f4b0((tj60) xvf0Var.get(), (Context) xvf0Var2.get());
            case 4:
                return new s7b0((b8r) xvf0Var2.get(), (c8r) xvf0Var.get());
            case 5:
                rqo rqoVar = (rqo) xvf0Var2.get();
                im51 im51Var = (im51) xvf0Var.get();
                fgb0 fgb0Var = new fgb0();
                ((jbh) rqoVar).f(SimplePersistentBooleanExperiment.NO_MORE_PHONISH);
                im51Var.getClass();
                return fgb0Var;
            case 6:
                return new c((y50) xvf0Var2.get(), (g) xvf0Var.get());
            case 7:
                return new hjb0((oep0) xvf0Var2.get(), (gf41) xvf0Var.get());
            case 8:
                return new umb0((nhb0) xvf0Var2.get(), (vmb0) xvf0Var.get());
            case 9:
                return new p((rqo) xvf0Var.get(), (k7x0) xvf0Var2.get());
            case 10:
                return new cqb0((ouw) xvf0Var2.get(), (lp00) xvf0Var.get());
            case 11:
                return new crb0((l) xvf0Var2.get(), (ah00) xvf0Var.get());
            case 12:
                return new f((eub0) xvf0Var2.get(), (r0c0) xvf0Var.get());
            case 13:
                return new r0c0((pdc) xvf0Var.get(), (Context) xvf0Var2.get());
            case 14:
                return new j((rqo) xvf0Var2.get(), (k7x0) xvf0Var.get());
            case 15:
                return new b((Context) xvf0Var2.get(), (rqo) xvf0Var.get());
            case 16:
                return new com.yandex.go.places.impl.navigation.deeplink.helpers.a((com.yandex.go.lifecycle.a) xvf0Var2.get(), (rfc0) xvf0Var.get());
            case 17:
                return new u0d0((on2) xvf0Var2.get(), (zv60) xvf0Var.get());
            case 18:
                return new o2d0((wnt) xvf0Var2.get(), i5m.a(xvf0Var), 0);
            case 19:
                return new s5d0(xvf0Var2, (oep0) xvf0Var.get());
            case 20:
                return new y5d0((zuj0) xvf0Var2.get(), (d29) xvf0Var.get());
            case 21:
                return new d6d0((rqo) xvf0Var2.get(), (p2y0) xvf0Var.get());
            case 22:
                return new iid0((dne0) xvf0Var2.get(), (rs2) xvf0Var.get());
            case 23:
                return new gk4((ru.yandex.taxi.plus.repository.c) xvf0Var2.get(), (v0r0) xvf0Var.get());
            case 24:
                return new e29((ru.yandex.taxi.plus.repository.c) xvf0Var2.get(), (hld0) xvf0Var.get());
            case 25:
                return new f29((d29) xvf0Var2.get(), (cda0) xvf0Var.get());
            case 26:
                return new k0k((hld0) xvf0Var2.get(), ((c2d0) xvf0Var.get()).u);
            case 27:
                c2d0 c2d0Var = (c2d0) xvf0Var2.get();
                return new zv60(c2d0Var.q, (yjd0) xvf0Var.get());
            case 28:
                c2d0 c2d0Var2 = (c2d0) xvf0Var2.get();
                hjc0 hjc0Var = (hjc0) xvf0Var.get();
                Context context = c2d0Var2.a;
                int i2 = wkd0.a[c2d0Var2.d.ordinal()];
                if (i2 == 1) {
                    plaqueEnvironment = PlaqueEnvironment.TESTING;
                } else {
                    if (i2 != 2) {
                        w511.b();
                        return null;
                    }
                    plaqueEnvironment = PlaqueEnvironment.PRODUCTION;
                }
                return new qmc0(context, plaqueEnvironment, hjc0Var, qmc0.h);
            default:
                return new ru.yandex.taxi.plus.sdk.domain.a((ru.yandex.taxi.plus.repository.c) xvf0Var2.get(), (ru.yandex.taxi.plus.sdk.cache.c) xvf0Var.get());
        }
    }
}

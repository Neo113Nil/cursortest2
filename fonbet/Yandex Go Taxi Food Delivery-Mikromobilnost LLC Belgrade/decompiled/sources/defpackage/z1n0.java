package defpackage;

import android.content.Context;
import com.yandex.go.scooters.ignition.domain.l;
import com.yandex.go.scooters.passes.d;
import com.yandex.go.scooters.passes.data.b;
import com.yandex.go.scooters.passes.domain.h;
import com.yandex.go.scooters.subscription.data.ScootersSubscriptionPurchaseApi;
import java.util.Collections;
import ru.yandex.taxi.network.api.models.GoApiName;
import ru.yandex.taxi.scooters.data.x;
import ru.yandex.taxi.scooters.data.z;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.domain.a;

/* loaded from: classes13.dex */
public final class z1n0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ z1n0(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new y1n0((u8w) ((yxm0) xvf0Var).get());
            case 1:
                return new s6n0((f6n0) ((ahu) xvf0Var).get());
            case 2:
                return new a((d3a) ((ivo0) xvf0Var).get());
            case 3:
                return new ban0((x770) ((mbo0) xvf0Var).get());
            case 4:
                return new scn0((v920) ((q150) xvf0Var).get());
            case 5:
                return new pfn0((x770) ((mbo0) xvf0Var).get());
            case 6:
                return new sin0((n5o0) ((n0k0) xvf0Var).get());
            case 7:
                return new qnn0((a22) ((qzm0) xvf0Var).get());
            case 8:
                return new l((jsn0) ((rxm0) xvf0Var).get());
            case 9:
                return new zsn0((co40) ((qzm0) xvf0Var).get());
            case 10:
                return new com.yandex.go.scooters.insurance.data.a((eex) ((j7g) xvf0Var).get());
            case 11:
                return new p4o0((dyx) ((j7g) xvf0Var).get());
            case 12:
                return new pgk0(11, (ndl0) ((mbo0) xvf0Var).get());
            case 13:
                return new dwn0(Collections.singletonList((h) ((vo3) xvf0Var).get()));
            case 14:
                return (d) ((mam0) xvf0Var).get();
            case 15:
                return new b((ywm0) ((l7g) xvf0Var).get());
            case 16:
                return new cio0((zgf) ((i7g) xvf0Var).get());
            case 17:
                return (cio0) ((z1n0) xvf0Var).get();
            case 18:
                return new d3a((rqo) ((j7g) xvf0Var).get(), 9);
            case 19:
                return new boo0((dei0) ((l7g) xvf0Var).get());
            case 20:
                return new too0((x770) ((mbo0) xvf0Var).get());
            case 21:
                return new z((x) ((g1n0) xvf0Var).get());
            case 22:
                ScootersSubscriptionPurchaseApi scootersSubscriptionPurchaseApi = (ScootersSubscriptionPurchaseApi) ((on2) ((j7g) xvf0Var).get()).a(GoApiName.TaxiV4, ScootersSubscriptionPurchaseApi.class);
                q5z.i(scootersSubscriptionPurchaseApi);
                return scootersSubscriptionPurchaseApi;
            case 23:
                return new wyo0(0, (k4) xvf0Var);
            case 24:
                return new cjm0(15, (co40) ((ivo0) xvf0Var).get());
            case 25:
                return new ru.yandex.taxi.scooters.presentation.detailed_order.v2.data.d((tt2) ((e7g) xvf0Var).get());
            case 26:
                return new hcp0((Context) ((icg) xvf0Var).get());
            case 27:
                return new ktp0((jtp0) ((ltp0) xvf0Var).get());
            case 28:
                return new ndl0(22, (i2f) ((f2b) xvf0Var).get());
            default:
                return new dyp0((gr51) ((nb11) xvf0Var).get());
        }
    }

    public /* synthetic */ z1n0(Object obj, v7p v7pVar, int i) {
        this.a = i;
        this.b = v7pVar;
    }
}

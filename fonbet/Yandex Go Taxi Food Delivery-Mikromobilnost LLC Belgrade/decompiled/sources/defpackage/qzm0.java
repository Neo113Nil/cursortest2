package defpackage;

import android.content.Context;
import com.yandex.go.scooters.bdui.data.a;
import com.yandex.go.scooters.driver_license.data.ScootersDriverLicenseApi;
import com.yandex.go.scooters.misc.attention.domain.c;
import defpackage.b2e0;
import defpackage.v1n0;
import defpackage.zy11;
import ru.yandex.taxi.network.api.models.GoApiName;

/* loaded from: classes13.dex */
public final class qzm0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public qzm0(ajn0 ajn0Var, xvf0 xvf0Var) {
        this.a = 19;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new pzm0((c) xvf0Var.get());
            case 1:
                return new a((j0n0) xvf0Var.get());
            case 2:
                return new x770((pho) xvf0Var.get());
            case 3:
                return new y3n0((pho) xvf0Var.get());
            case 4:
                return new z3n0((pho) xvf0Var.get());
            case 5:
                return new i5n0((q4o0) xvf0Var.get());
            case 6:
                return new i7n0((n5o0) xvf0Var.get());
            case 7:
                return new e8n0((ah00) xvf0Var.get());
            case 8:
                return new a9n0((k7x0) xvf0Var.get());
            case 9:
                return new d3a((rqo) xvf0Var.get(), 6);
            case 10:
                return new aan0((Context) xvf0Var.get());
            case 11:
                return new jcn0((icn0) xvf0Var.get());
            case 12:
                return new xcn0((pho) xvf0Var.get());
            case 13:
                return new pgk0(10, (sfn0) xvf0Var.get());
            case 14:
                return new ndl0(12, (n5o0) xvf0Var.get());
            case 15:
                return new qgn0(0, (n5o0) xvf0Var.get());
            case 16:
                return new i47((zuj0) xvf0Var.get(), 5);
            case 17:
                return new co40((pho) xvf0Var.get());
            case 18:
                on2 on2Var = (on2) xvf0Var.get();
                on2Var.getClass();
                ScootersDriverLicenseApi scootersDriverLicenseApi = (ScootersDriverLicenseApi) on2Var.a(GoApiName.TaxiV4, ScootersDriverLicenseApi.class);
                q5z.i(scootersDriverLicenseApi);
                return scootersDriverLicenseApi;
            case 19:
                final com.yandex.go.scooters.driver_license.data.a aVar = (com.yandex.go.scooters.driver_license.data.a) xvf0Var.get();
                return hz91.b("driver_license", 3000L, new tls() { // from class: com.yandex.go.scooters.driver_license.data.polling.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        b2e0 b2e0Var = (b2e0) obj;
                        b2e0Var.a = new ScootersDriverLicenseVerificationPollingContractKt$driverLicenseVerificationPollingContract$1$1(com.yandex.go.scooters.driver_license.data.a.this, null);
                        b2e0Var.b = new v1n0(20);
                        b2e0Var.d = new v1n0(21);
                        return zy11.a;
                    }
                });
            case 20:
                return new dln0((pho) xvf0Var.get());
            case 21:
                return new qgn0(2, (com.yandex.go.scooters.promotions.domain.a) xvf0Var.get());
            case 22:
                return new gnn0((n5o0) xvf0Var.get());
            case 23:
                return new lnn0((zuj0) xvf0Var.get());
            case 24:
                return new a22((zuj0) xvf0Var.get());
            case 25:
                return new xnn0((rqo) xvf0Var.get());
            case 26:
                return new ynn0((rqo) xvf0Var.get());
            case 27:
                return new co40((pho) xvf0Var.get());
            case 28:
                return new com.yandex.go.scooters.insurance.data.c((eex) xvf0Var.get());
            default:
                return new bvn0((q4o0) xvf0Var.get());
        }
    }

    public /* synthetic */ qzm0(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }
}

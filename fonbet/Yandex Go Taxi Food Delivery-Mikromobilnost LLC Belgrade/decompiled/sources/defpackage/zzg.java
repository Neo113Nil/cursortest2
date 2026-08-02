package defpackage;

import android.content.Context;
import com.yandex.go.pin.repository.a;
import com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.c;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.logistics.sdk.deliveries.api.source.DeliveriesApi;
import ru.yandex.taxi.logistics.sdk.management.deliveries.h;

/* loaded from: classes9.dex */
public final class zzg implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ zzg(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new rj9(1, (y50) xvf0Var.get());
            case 1:
                return new t61((pho) xvf0Var.get());
            case 2:
                return new p3h((xsv0) xvf0Var.get());
            case 3:
                return new dah((crs) xvf0Var.get());
            case 4:
                return new a((f1c0) xvf0Var.get());
            case 5:
                return new vlh((slh) xvf0Var.get());
            case 6:
                return new me0((Context) xvf0Var.get(), (byte) 0);
            case 7:
                return new zf((pho) xvf0Var.get());
            case 8:
                return new t61((pho) xvf0Var.get());
            case 9:
                return new ru.yandex.taxi.favorites.rides.delete_modal.data.a((on2) xvf0Var.get());
            case 10:
                return new qnh((syw) xvf0Var.get());
            case 11:
                return y891.e((t0k0) xvf0Var.get());
            case 12:
                return new auh((com.yandex.go.delivery.tracking.map_overlay.a) xvf0Var.get());
            case 13:
                return new huh((qr50) xvf0Var.get());
            case 14:
                return (DeliveriesApi) ((t0k0) xvf0Var.get()).b(DeliveriesApi.class);
            case 15:
                return new h(i5m.a(xvf0Var));
            case 16:
                return new zuh((rqo) xvf0Var.get());
            case 17:
                return new gvh((zuh) xvf0Var.get());
            case 18:
                return new jwh((j) xvf0Var.get());
            case 19:
                return new vwh((rqo) xvf0Var.get());
            case 20:
                return new ru.yandex.taxi.logistics.care.impl.experiments.a((rqo) xvf0Var.get());
            case 21:
                return new com.yandex.go.logistics.cargo_flow.form.repository.a((c) xvf0Var.get());
            case 22:
                return new s2i((y72) xvf0Var.get());
            case 23:
                return h991.a((t0k0) xvf0Var.get());
            case 24:
                return h991.b((t0k0) xvf0Var.get());
            case 25:
                return new yzh((k3i) xvf0Var.get());
            case 26:
                return new s3i((pwy0) xvf0Var.get());
            case 27:
                return new o4i((rqo) xvf0Var.get());
            case 28:
                return new b5i((dne0) xvf0Var.get());
            default:
                return new l5i(xvf0Var);
        }
    }
}

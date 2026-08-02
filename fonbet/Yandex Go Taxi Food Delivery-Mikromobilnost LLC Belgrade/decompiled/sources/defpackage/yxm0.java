package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.go.scooters.ignition.data.ScootersIgnitionApi;
import com.yandex.go.scooters.payments.domain.a;
import com.yandex.go.scooters.zones.data.ScootersPolygonInfoApi;
import ru.yandex.taxi.banners.c;
import ru.yandex.taxi.scooters.data.ScootersControlApi;
import ru.yandex.taxi.scooters.data.ScootersEvolvingApi;
import ru.yandex.taxi.scooters.data.ScootersSessionsCurrentApi;
import ru.yandex.taxi.scooters.data.ScootersUserStateApi;
import ru.yandex.taxi.scooters.data.k;

/* loaded from: classes8.dex */
public final class yxm0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ yxm0(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        int i2 = 0;
        int i3 = 1;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new ewn0(new l0b(i5m.a(xvf0Var), 4));
            case 1:
                ScootersControlApi b = d1b1.b((on2) xvf0Var.get());
                q5z.i(b);
                return b;
            case 2:
                ScootersEvolvingApi c = d1b1.c((on2) xvf0Var.get());
                q5z.i(c);
                return c;
            case 3:
                ScootersIgnitionApi d = d1b1.d((on2) xvf0Var.get());
                q5z.i(d);
                return d;
            case 4:
                ScootersSessionsCurrentApi e = d1b1.e((on2) xvf0Var.get());
                q5z.i(e);
                return e;
            case 5:
                ScootersUserStateApi f = d1b1.f((on2) xvf0Var.get());
                q5z.i(f);
                return f;
            case 6:
                return new hd30(i3, (c) xvf0Var.get());
            case 7:
                return new b0n0((Context) xvf0Var.get(), i2);
            case 8:
                return new c1n0((Context) xvf0Var.get());
            case 9:
                return new u8w((pho) xvf0Var.get());
            case 10:
                return new m7n0((rqo) xvf0Var.get());
            case 11:
                return new yo40((a) xvf0Var.get());
            case 12:
                return new sdn0((pho) xvf0Var.get());
            case 13:
                return new tdn0((rqo) xvf0Var.get());
            case 14:
                return new u8w((pho) xvf0Var.get());
            case 15:
                return new k((eex) xvf0Var.get());
            case 16:
                return new hgn0((ign0) xvf0Var.get());
            case 17:
                return new ukn0((rqo) xvf0Var.get());
            case 18:
                return new brn0((rqo) xvf0Var.get());
            case 19:
                return new tsn0((qwo0) xvf0Var.get());
            case 20:
                return new cvn0(i2, (dvn0) xvf0Var.get());
            case 21:
                return new rwn0((rqo) xvf0Var.get());
            case 22:
                return new vwn0(i5m.a(xvf0Var));
            case 23:
                return new krl0((Activity) xvf0Var.get());
            case 24:
                return new ewn0(new l0b(i5m.a(xvf0Var), 5));
            case 25:
                ScootersPolygonInfoApi c2 = p2b1.c((on2) xvf0Var.get());
                q5z.i(c2);
                return c2;
            case 26:
                return new zxn0((bt00) xvf0Var.get());
            case 27:
                return new h0o0((q0o0) xvf0Var.get());
            case 28:
                return new q0o0((pho) xvf0Var.get());
            default:
                return new b0n0((Context) xvf0Var.get(), i3);
        }
    }

    public /* synthetic */ yxm0(Object obj, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }
}

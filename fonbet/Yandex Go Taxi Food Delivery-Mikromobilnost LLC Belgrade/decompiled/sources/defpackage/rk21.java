package defpackage;

import com.yandex.go.payments.data.r;
import com.yandex.go.payments.data.u;
import com.yandex.go.superapp.tracking.data.e;
import com.yandex.go.wallet.deeplink.a;
import ru.yandex.taxi.security.c;
import ru.yandex.taxi.widgets.domain.d;

/* loaded from: classes8.dex */
public final class rk21 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public /* synthetic */ rk21(xvf0 xvf0Var, v7p v7pVar, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = v7pVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        xvf0 xvf0Var2 = this.c;
        switch (i) {
            case 0:
                return new u((r) ((on11) xvf0Var2).get(), (hit) xvf0Var.get());
            case 1:
                return new c((rqo) xvf0Var.get(), (d701) xvf0Var2);
            case 2:
                return new ur21(i5m.a((u5g) xvf0Var2), i5m.a((i5g) xvf0Var));
            case 3:
                return new a((g931) xvf0Var2, (ofa0) ((dqx0) xvf0Var).get());
            case 4:
                return new uva(14, xvf0Var, (l3e) xvf0Var2);
            case 5:
                return new d((ru.yandex.taxi.widgets.domain.c) ((jqz0) xvf0Var2).get(), (ru.yandex.taxi.widgets.domain.a) ((nf) xvf0Var).get());
            case 6:
                return new ru.yandex.taxi.widgets.data.repository.widget_models.c((lv6) ((q9g) xvf0Var2).get(), (d) ((rk21) xvf0Var).get());
            case 7:
                r551 a = ((q551) ((d441) xvf0Var2).get()).a(new l4s0(), new m551(), new z451(false), (e) xvf0Var.get());
                q5z.i(a);
                return a;
            case 8:
                return new rfw0((zuj0) ((q9g) xvf0Var2).get(), (z451) ((n3w) xvf0Var).a);
            case 9:
                return new q551((j551) ((dqx0) xvf0Var2).get(), (d551) xvf0Var.get());
            default:
                return new com.yandex.go.zone.repository.d((rfw0) ((zd51) xvf0Var2).get(), (rqo) xvf0Var.get());
        }
    }

    public /* synthetic */ rk21(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.c = xvf0Var;
        this.b = xvf0Var2;
    }
}

package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.go.navigation.screen.c;
import com.yandex.go.navigator.events.g;
import com.yandex.go.route.interactor.b;
import com.yandex.go.taxi.summary.rida_summary.repository.i;
import ru.yandex.taxi.data.api.RideHistoryApi;

/* loaded from: classes8.dex */
public final class xpj0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ xpj0(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new wpj0((ypj0) xvf0Var.get());
            case 1:
                return new ypj0((dne0) xvf0Var.get());
            case 2:
                return new hqj0((rqo) xvf0Var.get());
            case 3:
                return new irj0((Context) xvf0Var.get());
            case 4:
                return new yuj0((Context) xvf0Var.get());
            case 5:
                return new o0k0(xvf0Var, 0);
            case 6:
                return new f5k0((dne0) xvf0Var.get());
            case 7:
                return new q5k0((Activity) xvf0Var.get());
            case 8:
                return new i((wiq0) xvf0Var.get());
            case 9:
                return new aye0(18, (b) xvf0Var.get());
            case 10:
                return new g8k0((f8k0) xvf0Var.get());
            case 11:
                return new f8k0((pho) xvf0Var.get());
            case 12:
                return new d3a((rqo) xvf0Var.get(), 3);
            case 13:
                return new d3a((rqo) xvf0Var.get(), 4);
            case 14:
                return new clk0((rqo) xvf0Var.get());
            case 15:
                RideHistoryApi a = wpk0.a((on2) xvf0Var.get());
                q5z.i(a);
                return a;
            case 16:
                zwm n = bei.n((axm) xvf0Var.get());
                q5z.i(n);
                return n;
            case 17:
                return new com.yandex.go.payments.experiments.i((rqo) xvf0Var.get());
            case 18:
                return new g((el00) xvf0Var.get());
            case 19:
                return new a3l0((rqo) xvf0Var.get());
            case 20:
                return new i4l0((com.yandex.go.intentprocessor.i) xvf0Var.get());
            case 21:
                return new j4l0((tse) xvf0Var.get());
            case 22:
                return new w810((wiq0) xvf0Var.get());
            case 23:
                return new jc4((pho) xvf0Var.get());
            case 24:
                return new zal0((lx4) xvf0Var.get());
            case 25:
                return new o370((c) xvf0Var.get());
            case 26:
                return new qbl0(i5m.a(xvf0Var));
            case 27:
                return new tdl0((sdl0) xvf0Var.get());
            case 28:
                return new del0((rqo) xvf0Var.get());
            default:
                return new jel0((vlm) xvf0Var.get());
        }
    }
}

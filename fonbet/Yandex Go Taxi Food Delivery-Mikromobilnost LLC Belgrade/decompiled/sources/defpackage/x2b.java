package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.clarify_address.e;
import com.yandex.go.order.external.tracking.h;
import com.ybsdk.common.repositiories.payment.a;
import com.ybsdk.network.Api;
import com.ybsdk.rconfig.b;
import ru.yandex.taxi.search.suggest.i;

/* loaded from: classes8.dex */
public final class x2b implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public x2b(n3w n3wVar, xvf0 xvf0Var, xvf0 xvf0Var2) {
        this.a = 15;
        this.b = n3wVar;
        this.c = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.b;
        switch (i) {
            case 0:
                return new omy0();
            case 1:
                return new a((Api) xvf0Var2.get(), (b) xvf0Var.get());
            case 2:
                return new svb((w030) xvf0Var.get(), (Context) xvf0Var2.get());
            case 3:
                return new ru.yandex.taxi.intercity.deeplink.a((fx60) xvf0Var2.get(), xvf0Var);
            case 4:
                return new e((tse) xvf0Var2.get(), (rqo) xvf0Var.get());
            case 5:
                return new i1c((x2p) xvf0Var2.get(), (h) xvf0Var.get());
            case 6:
                return new com.yandex.go.order.external.a((z5c) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 7:
                return new ubc((ru.yandex.taxi.polling.a) xvf0Var2.get(), (Lifecycle) xvf0Var.get());
            case 8:
                return new amc((dqe0) xvf0Var2.get(), (wiq0) xvf0Var.get());
            case 9:
                return new doc((eil0) xvf0Var2.get(), (x22) xvf0Var.get());
            case 10:
                return new vbb((w030) xvf0Var2.get(), (y030) xvf0Var.get());
            case 11:
                return new p1b((as21) xvf0Var2.get(), (spc) xvf0Var.get());
            case 12:
                return new wsc((xcv0) xvf0Var2.get(), (g8k0) xvf0Var.get());
            case 13:
                return new ru.yandex.taxi.communications.data.b((po21) xvf0Var2.get(), (com.yandex.go.route.interactor.b) xvf0Var.get());
            case 14:
                return new seu(19);
            case 15:
                return new kgd((Context) xvf0Var2.get(), xvf0Var);
            case 16:
                return new c6e((Context) xvf0Var2.get(), i5m.a(xvf0Var));
            case 17:
                return new r6e((Context) xvf0Var2.get(), (SharedPreferences) xvf0Var.get());
            case 18:
                return new cae((k020) xvf0Var2.get(), (x22) xvf0Var.get());
            case 19:
                return new p1b((y50) xvf0Var2.get(), (jde) xvf0Var.get());
            case 20:
                return new zoy0();
            case 21:
                return new eke((Context) xvf0Var2.get(), (x22) xvf0Var.get());
            case 22:
                i iVar = (i) xvf0Var2.get();
                return new ru.yandex.taxi.superapp.address.a(iVar);
            case 23:
                return new bqe((pae) xvf0Var2.get(), (as21) xvf0Var.get());
            case 24:
                return new hqe(i5m.a(xvf0Var2), (im51) xvf0Var.get());
            case 25:
                return new rre((zuj0) xvf0Var2.get(), (mqv0) xvf0Var.get());
            case 26:
                return new kse((Looper) xvf0Var2.get(), (Looper) xvf0Var.get());
            case 27:
                return new com.yandex.go.payments.shared.business.accountcreation.corp.create_navigator.domain.a((on2) xvf0Var2.get(), (ru.yandex.taxi.startup.launch.h) xvf0Var.get());
            case 28:
                Api api = (Api) xvf0Var2.get();
                return new sue(api);
            default:
                return new pve((due) xvf0Var2.get(), (ic4) xvf0Var.get());
        }
    }

    public /* synthetic */ x2b(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }
}

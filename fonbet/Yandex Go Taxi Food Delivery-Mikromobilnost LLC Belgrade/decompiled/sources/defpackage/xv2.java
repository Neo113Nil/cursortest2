package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Looper;
import com.yandex.go.appshortcuts.a;
import com.ybsdk.persistence.b;
import ru.yandex.taxi.activity.h;
import ru.yandex.taxi.am.r;
import ru.yandex.taxi.am.t;

/* loaded from: classes.dex */
public final class xv2 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ xv2(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new cot(5, (Application) xvf0Var.get());
            case 1:
                return new lv2((lx4) xvf0Var.get());
            case 2:
                return new kw2((lw2) xvf0Var.get());
            case 3:
                return new lw2((dne0) xvf0Var.get());
            case 4:
                return new rx2((pho) xvf0Var.get());
            case 5:
                return new a((qx2) xvf0Var.get());
            case 6:
                return new dy2((b) xvf0Var.get());
            case 7:
                return new ey2((ky2) xvf0Var.get());
            case 8:
                return new zz2((pho) xvf0Var.get());
            case 9:
                return new m03((y72) xvf0Var.get());
            case 10:
                return new com.yandex.delivery.utils.auth.api.network.a(i5m.a(xvf0Var));
            case 11:
                return new vj3((pho) xvf0Var.get());
            case 12:
                return new ql3((com.yandex.go.payments.di.a) xvf0Var.get());
            case 13:
                return new vl3((jj3) xvf0Var.get());
            case 14:
                return new yn3((rqo) xvf0Var.get(), 0);
            case 15:
                return new t((r) xvf0Var.get());
            case 16:
                return new ru.yandex.taxi.logistics.sdk.management.storage.b((Context) xvf0Var.get());
            case 17:
                return new au50((rqo) xvf0Var.get(), 6);
            case 18:
                return new b34((rqo) xvf0Var.get());
            case 19:
                return new t94((lx4) xvf0Var.get());
            case 20:
                return new w94((y50) xvf0Var.get());
            case 21:
                return new za4((Context) xvf0Var.get());
            case 22:
                return new com.yandex.go.taxi.tariffs.interactor.b((ck31) xvf0Var.get());
            case 23:
                return new dc4((ah00) xvf0Var.get());
            case 24:
                return new o61((pho) xvf0Var.get());
            case 25:
                return new jc4((pho) xvf0Var.get());
            case 26:
                return new rx2((pho) xvf0Var.get());
            case 27:
                return new b1((pho) xvf0Var.get());
            case 28:
                return new h((tse) xvf0Var.get());
            default:
                return new qf4((Looper) xvf0Var.get());
        }
    }
}

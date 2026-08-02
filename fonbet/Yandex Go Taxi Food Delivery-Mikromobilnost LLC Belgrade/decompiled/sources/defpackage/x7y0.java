package defpackage;

import android.os.HandlerThread;
import android.os.Looper;
import com.yandex.go.multimodal_route.store.a;
import com.yandex.go.payments.cards.data.g;
import com.yandex.go.payments.cards.data.h;
import com.yandex.go.taxi.order.chat.experiments.b;

/* loaded from: classes8.dex */
public final class x7y0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ x7y0(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        int i2 = 3;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new b((d3a) ((w7y0) xvf0Var).get());
            case 1:
                return new a8y0((u8w) ((ec80) xvf0Var).get());
            case 2:
                return new b8y0((dqt) ((o0t) xvf0Var).get());
            case 3:
                return new vby0((xv11) ((d701) xvf0Var).get());
            case 4:
                return new zby0((eg01) ((a3g) xvf0Var).get());
            case 5:
                if (!((lqo) ((h420) xvf0Var).get()).a(tz10.g)) {
                    return Looper.getMainLooper();
                }
                HandlerThread handlerThread = new HandlerThread("Db");
                handlerThread.start();
                return handlerThread.getLooper();
            case 6:
                return new p2z0((tfw) xvf0Var);
            case 7:
                return new z501((pzf) ((o01) xvf0Var).get());
            case 8:
                return new g601((yvr0) xvf0Var);
            case 9:
                return new x601((kcz0) ((d701) xvf0Var).get());
            case 10:
                return new x111((cug) ((c660) xvf0Var).get());
            case 11:
                return new v311((a) ((axy) xvf0Var).get());
            case 12:
                return new h((g) ((rsn0) xvf0Var).get());
            case 13:
                return new ng11((a201) ((jqz0) xvf0Var).get());
            case 14:
                return new gzm0(4, (rg11) ((ci3) xvf0Var).get());
            case 15:
                return l9e.h((avy0) ((w8g) xvf0Var).get());
            case 16:
                return (zbh) ((nma) xvf0Var).get();
            case 17:
                return new ku11((yuf0) ((xj) xvf0Var).get());
            case 18:
                return new hbp(i2, (tv11) ((y0y0) xvf0Var).get());
            case 19:
                return new c1x0((u8w) ((kqz) xvf0Var).get());
            case 20:
                return new xn5((x7y0) xvf0Var);
            case 21:
                return new k721((gw) ((x7y0) xvf0Var).get());
            case 22:
                return new gw(2, (dd00) ((z2g) xvf0Var).get());
            case 23:
                return new d821((b1) ((ig7) xvf0Var).get());
            case 24:
                return new w821((gw) ((x7y0) xvf0Var).get());
            case 25:
                return new gw(3, (ucw0) ((a3g) xvf0Var).get());
            case 26:
                return new fj21((nw70) ((g970) xvf0Var).get());
            case 27:
                return new ru.yandex.taxi.persuggest.fingerprint.a((ru.yandex.taxi.persuggest.fingerprint.b) ((kxl0) xvf0Var).get());
            case 28:
                return new ru.yandex.logistics.sdk.order_validation.impl.interactor.a((ru.yandex.logistics.sdk.order_validation.impl.data.a) ((y0y0) xvf0Var).get());
            default:
                return new c331((im21) xvf0Var);
        }
    }
}

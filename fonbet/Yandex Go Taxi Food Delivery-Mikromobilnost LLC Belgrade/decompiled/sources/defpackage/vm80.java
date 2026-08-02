package defpackage;

import android.content.Context;
import android.os.Looper;
import com.yandex.fintechsdk.entities.environment.PayEnvironment;
import com.yandex.go.navigator.domain.b0;
import com.yandex.go.pickup_from_photo.domain.i;
import com.yandex.go.pickup_from_photo.domain.t;
import com.yandex.go.places.impl.domain.interactors.organizations.g;
import com.yandex.go.places.impl.ui.main.map.filters.overlay.a;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.domain.unreadcount.d;
import com.yandex.messaging.internal.authorized.chat.b;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes13.dex */
public final class vm80 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public vm80(i3d0 i3d0Var, n3w n3wVar, n3w n3wVar2) {
        this.a = 16;
        this.b = n3wVar;
        this.c = n3wVar2;
    }

    public static vm80 a(eqh eqhVar, xvf0 xvf0Var) {
        return new vm80(eqhVar, xvf0Var, 10);
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.b;
        switch (i) {
            case 0:
                return new um80((g) xvf0Var2.get(), (jm80) xvf0Var.get());
            case 1:
                return new wq80((ChatRequest) xvf0Var.get(), (b) xvf0Var2.get());
            case 2:
                return new yb90((zb90) xvf0Var2.get(), (kgt0) xvf0Var.get());
            case 3:
                ChatRequest chatRequest = (ChatRequest) xvf0Var2.get();
                b bVar = (b) xvf0Var.get();
                wg90 wg90Var = new wg90();
                wg90Var.a = chatRequest;
                wg90Var.b = bVar;
                return wg90Var;
            case 4:
                return new hu90((vif) xvf0Var2.get(), (PayEnvironment) xvf0Var.get());
            case 5:
                return new gta0((Looper) xvf0Var2.get(), (h9b) xvf0Var.get());
            case 6:
                return new oy80(8, (kta0) xvf0Var2.get(), (b) xvf0Var.get());
            case 7:
                return new uva0((z22) xvf0Var2.get(), (yi10) xvf0Var.get());
            case 8:
                return new oy80(9, (vse) xvf0Var2.get(), (d) xvf0Var.get());
            case 9:
                return new s5b0((v5b0) xvf0Var2.get(), i5m.a(xvf0Var));
            case 10:
                return new w6b0((lx4) xvf0Var2.get(), i5m.a(xvf0Var));
            case 11:
                return new i((t) xvf0Var2.get(), (com.yandex.go.pickup_from_photo.data.b) xvf0Var.get());
            case 12:
                return new d6c0((a) xvf0Var2.get(), (ah00) xvf0Var.get());
            case 13:
                return new com.yandex.go.places.impl.domain.interactors.nearby.b((wnt) xvf0Var2.get(), (e2t) xvf0Var.get());
            case 14:
                return new tdc0((a3c0) xvf0Var2.get(), (com.yandex.go.places.map.data.repositories.i) xvf0Var.get());
            case 15:
                return new nfc0((jio) xvf0Var2.get(), (cn80) xvf0Var.get());
            case 16:
                kg51 kg51Var = (kg51) xvf0Var2.get();
                g3d0 g3d0Var = (g3d0) kg51Var.f.invoke((tw51) xvf0Var.get());
                q5z.i(g3d0Var);
                return g3d0Var;
            case 17:
                return new tte0((ru.yandex.taxi.preorder.source.domain.a) xvf0Var2.get(), (so0) xvf0Var.get());
            case 18:
                return new f1f0((e) xvf0Var2.get(), (pav) xvf0Var.get());
            case 19:
                return new r100();
            case 20:
                return new q4f0((wgr) xvf0Var2.get(), (z231) xvf0Var.get());
            case 21:
                return new v5f0((Context) xvf0Var2.get(), (u5f0) xvf0Var.get());
            case 22:
                return new fub((ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.ui.e) xvf0Var2.get(), (lw) xvf0Var.get());
            case 23:
                return new whf0((gd3) xvf0Var2.get(), (w590) xvf0Var.get());
            case 24:
                return new wpf0((dei0) xvf0Var2.get(), (ypf0) xvf0Var.get());
            case 25:
                return new ypf0((gei0) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 26:
                return new i1g0((f1g0) xvf0Var2.get(), (xk60) xvf0Var.get());
            case 27:
                return new ru.yandex.taxi.settings.domain.b((ru.yandex.taxi.settings.domain.d) xvf0Var2.get(), (b3g0) xvf0Var.get());
            case 28:
                return new w4g0((q3g0) xvf0Var2.get(), (o4g0) xvf0Var.get());
            default:
                return new com.yandex.go.navigator.rate_route.a((par) xvf0Var2.get(), (b0) xvf0Var.get());
        }
    }

    public /* synthetic */ vm80(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }
}

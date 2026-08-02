package defpackage;

import android.content.Context;
import android.os.Looper;
import com.yandex.go.navigator.address.b;
import com.yandex.go.navigator.main_screen.experiement.e;
import com.yandex.go.navigator.utils.a;
import com.yandex.go.taxi.order.domain.interactors.h;
import com.yandex.go.taxi.order.provider.l;
import com.yandex.messaging.MessengerEnvironment;
import ru.yandex.taxi.perf.screen.c;

/* loaded from: classes14.dex */
public final class uc50 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public /* synthetic */ uc50(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        int i2 = 0;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.b;
        switch (i) {
            case 0:
                return new e((rqo) xvf0Var2.get(), (a) xvf0Var.get());
            case 1:
                return new b((ru.yandex.taxi.deeplinks.e) xvf0Var2.get(), (com.yandex.go.route.interactor.b) xvf0Var.get());
            case 2:
                return new ki50(i2, (pai) xvf0Var2.get(), (pei) xvf0Var.get());
            case 3:
                return new ra60();
            case 4:
                return new p860((q960) xvf0Var2.get(), (qa60) xvf0Var.get());
            case 5:
                return new at20((Looper) xvf0Var2.get(), (at2) xvf0Var.get());
            case 6:
                return new yj60((Context) xvf0Var2.get(), (w3c) xvf0Var.get());
            case 7:
                return new mk60((rz10) xvf0Var2.get(), (com.yandex.messaging.utils.b) xvf0Var.get());
            case 8:
                return new ru.yandex.taxi.preorder.summary.tariffpage.data.holder.a((tt2) xvf0Var2.get(), (tw60) xvf0Var.get());
            case 9:
                return new py60((goe) xvf0Var2.get(), (a2y) xvf0Var.get());
            case 10:
                return new at20((c4r0) xvf0Var2.get(), (pev0) xvf0Var.get());
            case 11:
                return new v470((x470) xvf0Var2.get(), (com.yandex.go.places.impl.domain.interactors.a) xvf0Var.get(), i2);
            case 12:
                return new v470((j670) xvf0Var2.get(), (com.yandex.go.places.impl.domain.interactors.a) xvf0Var.get(), 1);
            case 13:
                return new v470((r670) xvf0Var2.get(), (com.yandex.go.places.impl.domain.interactors.a) xvf0Var.get(), 2);
            case 14:
                return new at20((sfl0) xvf0Var2.get(), (MessengerEnvironment) xvf0Var.get());
            case 15:
                return new d870(i2, (tuv0) xvf0Var2.get(), (f5w0) xvf0Var.get());
            case 16:
                return new v470((m870) xvf0Var2.get(), (com.yandex.go.places.impl.domain.interactors.a) xvf0Var.get(), 3);
            case 17:
                return new zi70((c) xvf0Var2.get(), (com.yandex.go.taxi.summary.shared.lifecycle.a) xvf0Var.get());
            case 18:
                return new cj70((pdc) xvf0Var2.get(), (yp2) xvf0Var.get());
            case 19:
                ci70 ci70Var = (ci70) xvf0Var2.get();
                return new my70(ci70Var);
            case 20:
                return new bz70((com.yandex.go.taxi.order.provider.a) xvf0Var2.get(), (zfm) xvf0Var.get());
            case 21:
                return new gz70((pdc) xvf0Var.get(), (Context) xvf0Var2.get());
            case 22:
                return new h((l) xvf0Var2.get(), (a080) xvf0Var.get());
            case 23:
                return new com.yandex.go.taxi.order.popup.a((n20) xvf0Var2.get(), (x980) xvf0Var.get());
            case 24:
                return ((uxr0) xvf0Var2.get()).a((ghf) xvf0Var.get());
            case 25:
                return new ru.yandex.taxi.logistics.sdk.tracking.impl.ui.order_state.a((ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.b) xvf0Var2.get(), (ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.complete_buttons.b) xvf0Var.get());
            case 26:
                return new w880((o2y0) xvf0Var2.get(), (as21) xvf0Var.get());
            case 27:
                return new m980((Context) xvf0Var2.get(), (com.yandex.go.taxi.order.interactors.b) xvf0Var.get());
            case 28:
                return new gb80((zuj0) xvf0Var2.get(), (com.yandex.go.superapp.tracking.data.e) xvf0Var.get());
            default:
                return new com.yandex.go.taxi.order.altpin.a((n20) xvf0Var2.get(), (d2y0) xvf0Var.get());
        }
    }
}

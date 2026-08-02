package defpackage;

import android.content.Context;
import android.os.Looper;
import com.yandex.go.summary.interactor.anchored.state.y;
import com.yandex.go.zone.repository.o;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.input.g;
import com.yandex.messaging.internal.view.chat.input.InputTextController;
import ru.yandex.taxi.launch.c;
import ru.yandex.taxi.masstransit.geopayment.stopselector.e;
import ru.yandex.taxi.net.taxi.NearestDriversApi;
import ru.yandex.taxi.single.b;
import ru.yandex.taxi.summary.solid.preview_card.data.a;
import ru.yandex.taxi.summary.solid.preview_card.interactor.d;
import ru.yandex.taxi.surge.interactor.p;
import ru.yandex.taxi.systemrequeirements.location.n;

/* loaded from: classes6.dex */
public final class sit0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;

    public sit0(pcz0 pcz0Var, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3) {
        this.a = 25;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
    }

    public static sit0 a(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3) {
        return new sit0(xvf0Var, xvf0Var2, xvf0Var3, 14);
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.d;
        xvf0 xvf0Var2 = this.c;
        xvf0 xvf0Var3 = this.b;
        switch (i) {
            case 0:
                return new rit0((y3u0) xvf0Var3.get(), (a3v) xvf0Var2.get(), (zuj0) xvf0Var.get());
            case 1:
                return new a0u0((u4t) xvf0Var3.get(), i5m.a(xvf0Var2), (vse) xvf0Var.get());
            case 2:
                return new b((NearestDriversApi) xvf0Var3.get(), (c) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 3:
                return new ldu0((Looper) xvf0Var3.get(), (pcu0) xvf0Var2.get(), (to3) xvf0Var.get());
            case 4:
                return new e((Context) xvf0Var3.get(), (ru.yandex.taxi.widget.c) xvf0Var2.get(), (zuj0) xvf0Var.get());
            case 5:
                return new e7v0((ChatRequest) xvf0Var3.get(), (x22) xvf0Var2.get(), (com.yandex.messaging.internal.authorized.chat.b) xvf0Var.get());
            case 6:
                return new mav0((com.yandex.go.route.interactor.b) xvf0Var3.get(), (l0j) xvf0Var2.get(), (com.yandex.go.route.interactor.c) xvf0Var.get());
            case 7:
                return new vdv0((pev0) xvf0Var3.get(), (ldv0) xvf0Var2.get(), (ggv0) xvf0Var.get());
            case 8:
                return new d((a) xvf0Var3.get(), (wiq0) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 9:
                return new amp0((wiq0) xvf0Var3.get(), (tt2) xvf0Var2.get(), (pei) xvf0Var.get());
            case 10:
                return new amp0(i5m.a(xvf0Var3), i5m.a(xvf0Var2), (xcv0) xvf0Var.get());
            case 11:
                return new vpv0((Context) xvf0Var3.get(), (wiq0) xvf0Var2.get(), (tu) xvf0Var.get());
            case 12:
                return new kqv0(i5m.a(xvf0Var3), (lqv0) xvf0Var2.get(), (zuj0) xvf0Var.get());
            case 13:
                return new com.yandex.go.preorder.summary.c((com.yandex.go.route.interactor.b) xvf0Var3.get(), (com.yandex.go.zone.interactors.b) xvf0Var2.get(), (o) xvf0Var.get());
            case 14:
                return new com.yandex.go.flex.main_screen.presentation.divkit.azimuth.e((qwc) xvf0Var3.get(), (n) xvf0Var2.get(), (tse) xvf0Var.get());
            case 15:
                return new p((tt2) xvf0Var3.get(), (pwy0) xvf0Var2.get(), (ru.yandex.taxi.widget.utils.e) xvf0Var.get());
            case 16:
                return new yix0((l8u0) xvf0Var3.get(), (pwy0) xvf0Var2.get(), (viv0) xvf0Var.get());
            case 17:
                return new llx0((jlx0) xvf0Var3.get(), (nlx0) xvf0Var2.get(), (c4r0) xvf0Var.get());
            case 18:
                return new omx0((com.yandex.go.route.interactor.c) xvf0Var3.get(), (biv0) xvf0Var2.get(), (xj0) xvf0Var.get());
            case 19:
                return new ru.yandex.taxi.summary.topnotification.tariff_unavailable.presentation.a((pav) xvf0Var3.get(), (k7x0) xvf0Var2.get(), (y50) xvf0Var.get());
            case 20:
                return new hrx0((d49) xvf0Var3.get(), (t49) xvf0Var2.get(), (gvz0) xvf0Var.get());
            case 21:
                return jey0.a;
            case 22:
                return new ooy0((nkh) xvf0Var3.get(), (by00) xvf0Var2.get(), (lqo) xvf0Var.get());
            case 23:
                return new kty0((g) xvf0Var3.get(), (InputTextController) xvf0Var2.get(), (com.yandex.messaging.internal.view.chat.input.textsuggest.d) xvf0Var.get());
            case 24:
                return new vxy0((p4t) xvf0Var3.get(), (com.yandex.messaging.domain.personal.mentions.a) xvf0Var2.get(), (vse) xvf0Var.get());
            case 25:
                return ((zy01) i5m.a(xvf0Var3).get()).c ? (ww10) i5m.a(xvf0Var).get() : (ww10) i5m.a(xvf0Var2).get();
            case 26:
                return new com.yandex.messaging.internal.view.timeline.common.a((com.yandex.messaging.domain.unreadcount.d) xvf0Var3.get(), (ChatRequest) xvf0Var2.get(), (vse) xvf0Var.get());
            case 27:
                return new zfz0((bgz0) xvf0Var3.get(), (xdf) xvf0Var2.get(), (orq) xvf0Var.get());
            case 28:
                return new y((fgv0) xvf0Var3.get(), (ru.yandex.taxi.multiorder.e) xvf0Var2.get(), (zuj0) xvf0Var.get());
            default:
                return new cjw0((ru.yandex.taxi.tooltips.repository.b) xvf0Var3.get(), (t49) xvf0Var2.get(), (nex0) xvf0Var.get());
        }
    }

    public /* synthetic */ sit0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
    }
}

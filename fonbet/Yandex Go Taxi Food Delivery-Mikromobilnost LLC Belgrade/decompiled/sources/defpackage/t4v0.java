package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.squareup.moshi.Moshi;
import com.yandex.go.tariffcard.ui.f;
import com.yandex.go.taxi.order.chat.experiments.b;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.authorized.g;
import com.yandex.messaging.internal.translator.k;
import com.yandex.messaging.internal.v;
import com.yandex.messaging.internal.view.timeline.g0;
import kotlin.time.DurationUnit;
import ru.yandex.taxi.map_common.map.p;
import ru.yandex.taxi.order.d;
import ru.yandex.taxi.search.suggest.i;
import ru.yandex.taxi.summary.promotions.interactor.a;
import ru.yandex.taxi.summary.solid.interactor.t;
import ru.yandex.taxi.surge.interactor.r;
import ru.yandex.taxi.widget.c;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes6.dex */
public final class t4v0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;

    public /* synthetic */ t4v0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
    }

    public static t4v0 a(xvf0 xvf0Var, xvf0 xvf0Var2, b8w b8wVar, xvf0 xvf0Var3) {
        return new t4v0(xvf0Var, xvf0Var2, b8wVar, xvf0Var3, 5);
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.e;
        xvf0 xvf0Var2 = this.d;
        xvf0 xvf0Var3 = this.c;
        xvf0 xvf0Var4 = this.b;
        switch (i) {
            case 0:
                to3 to3Var = (to3) xvf0Var4.get();
                k020 k020Var = (k020) xvf0Var3.get();
                kse kseVar = (kse) xvf0Var2.get();
                return new g(to3Var, k020Var, kseVar);
            case 1:
                return new bdv0((xcv0) xvf0Var4.get(), (ucv0) xvf0Var3.get(), (wiq0) xvf0Var2.get(), (viv0) xvf0Var.get());
            case 2:
                return new a((e) xvf0Var4.get(), (pdc) xvf0Var3.get(), (mnv0) xvf0Var2.get(), (yp2) xvf0Var.get());
            case 3:
                return new t((c6l0) xvf0Var4.get(), (mkv0) xvf0Var3.get(), (npv0) xvf0Var2.get(), (yj0) xvf0Var.get());
            case 4:
                return new atv0((tt2) xvf0Var4.get(), (i) xvf0Var3.get(), (btv0) xvf0Var2.get(), (i6w0) xvf0Var.get());
            case 5:
                return new ks20((com.yandex.go.flex.main_screen.presentation.divkit.azimuth.e) xvf0Var4.get(), (pav) xvf0Var3.get(), (ytz) xvf0Var2.get(), (yqq) xvf0Var.get(), 1);
            case 6:
                return new r((tt2) xvf0Var4.get(), (wiq0) xvf0Var3.get(), (e) xvf0Var2.get(), (ru.yandex.taxi.surge.repository.a) xvf0Var.get());
            case 7:
                return new w1x0((at2) xvf0Var4.get(), (cce) xvf0Var3.get(), (com.yandex.messaging.internal.storage.contacts.a) xvf0Var2.get(), (x22) xvf0Var.get());
            case 8:
                return new f((zuj0) xvf0Var4.get(), (xdf) xvf0Var3.get(), (e) xvf0Var2.get(), (c) xvf0Var.get());
            case 9:
                return new zyx0((ah00) xvf0Var4.get(), (izx0) xvf0Var3.get(), (s350) xvf0Var2.get(), (b) xvf0Var.get());
            case 10:
                v vVar = (v) xvf0Var4.get();
                idy0 idy0Var = new idy0();
                zy11 zy11Var = zy11.a;
                tpr t = kotlinx.coroutines.flow.e.t(new acu(vVar.a(zy11Var), 27));
                k5c a = ds31.a(idy0Var);
                wsr0 wsr0Var = xsr0.a;
                o430 o430Var = e3n.b;
                kotlinx.coroutines.flow.e.R(t, a, jx81.a(2, kp50.U(5, DurationUnit.SECONDS)), Boolean.TRUE);
                tpr t2 = kotlinx.coroutines.flow.e.t(new acu(vVar.a(zy11Var), 28));
                k5c a2 = ds31.a(idy0Var);
                wsr0Var.getClass();
                kotlinx.coroutines.flow.e.R(t2, a2, wsr0.b, Boolean.FALSE);
                return idy0Var;
            case 11:
                return new jzy0((k020) xvf0Var4.get(), i5m.a(xvf0Var3), i5m.a(xvf0Var2), (dvg) xvf0Var.get());
            case 12:
                return new g0((b00) xvf0Var4.get(), (ChatRequest) xvf0Var3.get(), (Lifecycle) xvf0Var2.get(), (k) xvf0Var.get());
            case 13:
                return new lcz0((h9b) xvf0Var4.get(), (at2) xvf0Var3.get(), (k020) xvf0Var2.get(), (x22) xvf0Var.get());
            case 14:
                return new wcz0("timeline_scroll_framerate", (Activity) xvf0Var4.get(), (x22) xvf0Var3.get(), (String) xvf0Var2.get(), (o5e) xvf0Var.get());
            case 15:
                return new ru.yandex.taxi.orderbutton.toll_roads.interactors.a((ru.yandex.taxi.preorder.tollroad.data.e) xvf0Var4.get(), (opz0) xvf0Var3.get(), (gqz0) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 16:
                return new com.yandex.fintechsdk.features.bdui.internal.presentation.action.card.pay.topup.a((iee) xvf0Var4.get(), (rbs) xvf0Var3.get(), (ns31) xvf0Var2.get(), (fp51) xvf0Var.get());
            case 17:
                return new tp21((w3c) xvf0Var4.get(), (x0j0) xvf0Var3.get(), (a5e) xvf0Var2.get(), (g370) xvf0Var.get());
            case 18:
                return new ru.yandex.taxi.order.location.a((Lifecycle) xvf0Var4.get(), (l1t) xvf0Var3.get(), (d) xvf0Var2.get(), (no21) xvf0Var.get());
            case 19:
                return new yr21((Context) xvf0Var4.get(), (com.yandex.go.navigator.user_placemark.c) xvf0Var3.get(), (r4v) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 20:
                return new com.yandex.go.navigator.settings.language_settings.b((tt2) xvf0Var4.get(), (com.yandex.go.navigator.settings.network.repository.a) xvf0Var3.get(), (hzw) xvf0Var2.get(), (dz31) xvf0Var.get());
            case 21:
                return new e241((ney) xvf0Var4.get(), (com.yandex.go.walking.navigation.impl.navigation_core.b) xvf0Var3.get(), (p) xvf0Var2.get(), (g241) xvf0Var.get());
            case 22:
                return new gg41((w030) xvf0Var4.get(), (fva0) xvf0Var3.get(), (vf41) xvf0Var2.get(), (zf41) xvf0Var.get());
            default:
                return new s421((yj41) xvf0Var4.get(), (c370) xvf0Var3.get(), (com.yandex.messaging.internal.net.a) xvf0Var2.get(), (Moshi) xvf0Var.get(), 13);
        }
    }
}

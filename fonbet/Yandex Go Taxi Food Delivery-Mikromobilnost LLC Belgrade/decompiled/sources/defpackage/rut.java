package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter;
import com.yandex.go.route.interactor.b;
import com.yandex.go.taxi.summary.interactor.g;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.grid_layout_widget.a;
import ru.yandex.taxi.widget.c;

/* loaded from: classes12.dex */
public final class rut implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public /* synthetic */ rut(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.b;
        switch (i) {
            case 0:
                return new zrm(27, (FlexAdapter) xvf0Var2.get(), (bvt) ((twf) xvf0Var).get());
            case 1:
                return new a((ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.shortcut_widget.a) ((z8n0) xvf0Var2).get(), (ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a) ((eqh) xvf0Var).get());
            case 2:
                return new u1n(28, (dv8) ((fxf) xvf0Var2).get(), (htg) ((exf) xvf0Var).get());
            case 3:
                return new u1n(29, (r1s) ((jdu) xvf0Var).get(), (viv0) xvf0Var2.get());
            case 4:
                return new i4u((g) ((so4) xvf0Var2).get(), (wiq0) ((w0g) xvf0Var).get());
            case 5:
                return new dxu((x1v) ((h3g) xvf0Var2).get(), (b) ((l3g) xvf0Var).get());
            case 6:
                return new r4v((pav) xvf0Var2.get(), (k7x0) ((l4g) xvf0Var).get());
            case 7:
                return new yov((com.yandex.go.navigator.events.g) ((l4g) xvf0Var).get(), (zuj0) xvf0Var2.get());
            case 8:
                smp smpVar = (smp) ((d2g) xvf0Var).get();
                Set set = (Set) xvf0Var2.get();
                ArrayList arrayList = new ArrayList(tcc.n(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(((i231) it.next()).create());
                }
                com.yandex.div.core.expression.variables.a a = smpVar.a();
                c231[] c231VarArr = (c231[]) arrayList.toArray(new c231[0]);
                a.i((c231[]) Arrays.copyOf(c231VarArr, c231VarArr.length));
                return a;
            case 9:
                ocw ocwVar = (ocw) xvf0Var2.get();
                mir mirVar = (mir) ((d2g) xvf0Var).get();
                ocwVar.getClass();
                ncw ncwVar = new ncw(0, ocwVar);
                g0p a2 = ocwVar.a.a();
                hpq hpqVar = ocwVar.g;
                Context context = ocwVar.b;
                hdi hdiVar = new hdi(1, ocwVar);
                hpqVar.getClass();
                return mirVar.a(new vlr("IntercityDashboard", ncwVar, null, a2, new nfh(context, hdiVar, new vbh(false)), null, null, null, null, kotlin.collections.a.J0(ocwVar.e), ocwVar.d, null, null, null, null, null, null, null, null, 1045322));
            case 10:
                return new kdw((h2t) ((d2g) xvf0Var2).get(), (o61) ((h1t) xvf0Var).get());
            case 11:
                return new jgw((boj0) ((wvq) xvf0Var).get(), (kgw) xvf0Var2.get());
            case 12:
                return new zc(9, (r8w) ((e2g) xvf0Var2).get(), (w030) ((e2g) xvf0Var).get());
            case 13:
                return new tyw((ah00) ((v1g) xvf0Var2).get(), (zuj0) ((w1g) xvf0Var).get());
            case 14:
                return new ely((oep0) xvf0Var2.get(), (gf41) ((d441) xvf0Var).get());
            case 15:
                return new lly((tse) xvf0Var2.get(), (ru.yandex.taxi.linked_order.map.utils.a) ((k1w) xvf0Var).get());
            case 16:
                return new ru.yandex.taxi.linked_order.focus.a((tse) xvf0Var2.get(), (n6w0) ((t4g) xvf0Var).get());
            case 17:
                return new hdu(i5m.a((amy) xvf0Var), i5m.a(xvf0Var2));
            case 18:
                return new xoy(i5m.a(xvf0Var2), (hdu) ((rut) xvf0Var).get());
            case 19:
                return new hdu((pj) ((tl3) xvf0Var2).get(), (ih01) ((nb11) xvf0Var).get());
            case 20:
                return new h8z((o8z) xvf0Var2.get(), (epf) xvf0Var);
            case 21:
                return new tmz((n20) ((i9g) xvf0Var2).get(), (o61) ((h1t) xvf0Var).get());
            case 22:
                return new com.yandex.go.lootbox.impl.data.mapper.action.a((c) xvf0Var2.get(), (com.yandex.go.lootbox.impl.data.mapper.button.a) ((h0z) xvf0Var).get());
            case 23:
                return new dqz((uq1) ((s2g) xvf0Var).get(), (zuj0) xvf0Var2.get());
            case 24:
                return new c9v(21, (ef00) ((ff00) xvf0Var2).get(), (z501) ((ibg) xvf0Var).get());
            case 25:
                return new ij00((Activity) xvf0Var2.get(), i5m.a((c1) xvf0Var));
            case 26:
                return new ru.yandex.taxi.search.overlay.legacy.animations.a((ah00) ((i9g) xvf0Var2).get(), (ney) ((i9g) xvf0Var).get());
            case 27:
                ((g3g) xvf0Var).get();
                return new i2s0((com.yandex.div.core.expression.variables.a) xvf0Var2.get());
            case 28:
                return new a410((ru.yandex.taxi.masstransit.main.router.a) ((n3w) xvf0Var2).a, (q210) ((sp00) xvf0Var).get());
            default:
                return new l04((Context) ((qbg) xvf0Var).get(), (AppAnalyticsReporter) ((hag) xvf0Var2).get());
        }
    }

    public /* synthetic */ rut(xvf0 xvf0Var, xvf0 xvf0Var2, int i, boolean z) {
        this.a = i;
        this.c = xvf0Var;
        this.b = xvf0Var2;
    }
}

package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.compose.material.e;
import androidx.compose.ui.semantics.f;
import com.yandex.go.quark.dynamic.c;
import com.yandex.go.superapp.api.loading_tracker.GlobalLoadingEvent;
import com.yandex.go.superapp.searchbar.impl.ui.SuperappSearchbarContainerView;
import com.yandex.go.tariffcard.modal.TariffOptionsCardModalView;
import com.yandex.go.tariffcard.ui.TariffOptionsCardView;
import com.yandex.go.taxi.order.change.destinations.navigation.a;
import com.yandex.go.taxi.order.communications.analytics.PromoPlaqueAnalytics$Screen;
import com.yandex.go.taxi.order.models.api.TaxiOrderPendingChanges;
import com.yandex.go.taxi.order.models.api.l;
import com.yandex.go.taxi.order.multi.tracking.TaxiOrderTrackingView;
import com.yandex.go.taxi.order.network.d;
import com.yandex.go.taxi.order.superapp.orders.ui.b;
import com.yandex.go.taxi.order.support.ui.details.SupportDetailsModalView;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.jl40;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.Result;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.taxi.eatskit.dto.PaymentMethodType;
import ru.yandex.taxi.preorder.summary.selector.ui.ribbon.TariffsRibbonView;
import ru.yandex.taxi.themes.g;
import ru.yandex.taxi.widget.MaskedShimmeringBar;

/* loaded from: classes14.dex */
public final /* synthetic */ class s5w0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s5w0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        boolean _init_$lambda$0;
        rdb rdbVar;
        zy11 insetsType$lambda$0;
        boolean insetsCancellable$lambda$0;
        zy11 onCreate$lambda$4;
        boolean _init_$lambda$02;
        int i = this.a;
        int i2 = 16;
        int i3 = 2;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                ((gcn) obj2).a(new ck7((str == null || str.length() == 0) ? null : new d4a0(str, PaymentMethodType.CARD, null, null, null), null));
                return zy11.a;
            case 1:
                y4c0 y4c0Var = (y4c0) obj2;
                Result result = (Result) obj;
                Object value = result.getValue();
                if (!(value instanceof Result.Failure)) {
                    ((rit) y4c0Var.H).a(GlobalLoadingEvent.NATIVE_AUTH_FINISH);
                    y4c0Var.r(new oxv0(6));
                }
                Throwable a = Result.a(result.getValue());
                if (a != null) {
                    y4c0Var.r(new yux(i3, a));
                }
                return zy11.a;
            case 2:
                aaw0 aaw0Var = (aaw0) obj2;
                ywl ywlVar = (ywl) obj;
                if (!jl40.l(aaw0Var.a, ywlVar)) {
                    aaw0Var.a = ywlVar;
                    u1m u1mVar = aaw0Var.b;
                    if (ywlVar != null && u1mVar != null) {
                        aaw0Var.c = new hhs0(i2, ywlVar, u1mVar);
                    }
                }
                return zy11.a;
            case 3:
                tdw0 tdw0Var = (tdw0) obj2;
                Float f = (Float) obj;
                if (jl40.l(tdw0Var, sdw0.a)) {
                    return new Pair(Float.valueOf(f != null ? f.floatValue() : 1.0f), Float.valueOf(0.0f));
                }
                if (jl40.l(tdw0Var, rdw0.a)) {
                    return new Pair(Float.valueOf(f != null ? f.floatValue() : 0.0f), Float.valueOf(1.0f));
                }
                w511.b();
                return null;
            case 4:
                _init_$lambda$0 = SuperappSearchbarContainerView._init_$lambda$0((SuperappSearchbarContainerView) obj2, (t1w) obj);
                return Boolean.valueOf(_init_$lambda$0);
            case 5:
                noh nohVar = (noh) obj2;
                Throwable th = (Throwable) obj;
                zy11 zy11Var = zy11.a;
                if (th == null && nohVar.k0() && (rdbVar = (rdb) nohVar.c()) != null) {
                    ((c) rdbVar).a();
                }
                return zy11Var;
            case 6:
                yfw0 yfw0Var = (yfw0) obj2;
                t1w t1wVar = (t1w) obj;
                Integer num = t1wVar.e;
                yfw0Var.n(Math.max(num != null ? num.intValue() : 0, t1wVar.d));
                return Boolean.FALSE;
            case 7:
                SupportDetailsModalView supportDetailsModalView = ((xiw0) obj2).a;
                yiw0 access$getBinding = SupportDetailsModalView.access$getBinding(supportDetailsModalView);
                xw31.E(access$getBinding.e, null, Integer.valueOf(tje.u(8, supportDetailsModalView.getContext())), null, null);
                MaskedShimmeringBar maskedShimmeringBar = (MaskedShimmeringBar) SupportDetailsModalView.access$getBinding(supportDetailsModalView).b.b;
                if (maskedShimmeringBar.getVisibility() == 0) {
                    cma1.L(maskedShimmeringBar);
                }
                m2y m2yVar = access$getBinding.b;
                ImageView imageView = (ImageView) m2yVar.e;
                ImageView imageView2 = (ImageView) m2yVar.d;
                if (imageView.getVisibility() != 0) {
                    cma1.J(imageView);
                }
                if (imageView2.getVisibility() != 0) {
                    cma1.J(imageView2);
                }
                return zy11.a;
            case 8:
                e eVar = (e) obj2;
                float floatValue = ((Float) obj).floatValue();
                tx40 tx40Var = eVar.f;
                float floatValue2 = tx40Var.getFloatValue() + floatValue;
                float c = y6i0.c(floatValue2, eVar.j, eVar.k);
                eVar.d.setFloatValue(c + 0.0f);
                eVar.e.setFloatValue(floatValue2 - c);
                tx40Var.setFloatValue(floatValue2);
                return zy11.a;
            case 9:
                d6z0 d6z0Var = (d6z0) obj2;
                f.l((mnq0) obj, d6z0Var.b + " " + d6z0Var.a);
                return zy11.a;
            case 10:
                mnq0 mnq0Var = (mnq0) obj;
                f.j(mnq0Var, new hcc(((cex0) obj2).d.a.size(), 1));
                f.v(mnq0Var);
                f.w(mnq0Var, 1.0f);
                return zy11.a;
            case 11:
                insetsType$lambda$0 = TariffOptionsCardModalView.insetsType$lambda$0((TariffOptionsCardModalView) obj2, (t1w) obj);
                return insetsType$lambda$0;
            case 12:
                insetsCancellable$lambda$0 = TariffOptionsCardView.insetsCancellable$lambda$0((TariffOptionsCardView) obj2, (t1w) obj);
                return Boolean.valueOf(insetsCancellable$lambda$0);
            case 13:
                ((mkx0) obj2).U.a((String) obj);
                return zy11.a;
            case 14:
                f.j((mnq0) obj, new hcc(1, ((vnx0) obj2).b.a.size()));
                return zy11.a;
            case 15:
                return (TariffsRibbonView) ((jsx0) ((znx0) obj2).d.getValue()).a.get();
            case 16:
                onCreate$lambda$4 = TarifficatorScenarioActivity.onCreate$lambda$4((TarifficatorScenarioActivity) obj2, (mx60) obj);
                return onCreate$lambda$4;
            case 17:
                a aVar = (a) obj2;
                yfd yfdVar = (yfd) obj;
                ((agd) yfdVar).c = (gci0) aVar.H.c;
                lzu0 lzu0Var = new lzu0(22, aVar, yfdVar);
                agd agdVar = (agd) yfdVar;
                agdVar.e = lzu0Var;
                fed.a.getClass();
                agdVar.g = fed.b;
                return zy11.a;
            case 18:
                ((d) obj2).e.b("orderDraft", (Throwable) obj, new mpx0(i2));
                return zy11.a;
            case 19:
                com.yandex.go.taxi.order.models.api.e eVar2 = (com.yandex.go.taxi.order.models.api.e) obj2;
                com.yandex.go.taxi.order.models.api.e eVar3 = (com.yandex.go.taxi.order.models.api.e) obj;
                l lVar = TaxiOrderPendingChanges.Companion;
                return Boolean.valueOf(jl40.l(eVar3 != null ? eVar3.getA() : null, eVar2.getA()));
            case 20:
                z30 z30Var = (z30) obj2;
                ((k5y0) obj).h1(z30Var != null ? z30Var.b : null);
                return zy11.a;
            case 21:
                i6y0 i6y0Var = ((com.yandex.go.taxi.order.perf.session.a) obj2).c;
                cfs cfsVar = i6y0Var.b;
                if (cfsVar != null) {
                    cfsVar.a();
                }
                i6y0Var.b = null;
                i6y0Var.d.l(null);
                return zy11.a;
            case 22:
                _init_$lambda$02 = TaxiOrderTrackingView._init_$lambda$0((TaxiOrderTrackingView) obj2, (t1w) obj);
                return Boolean.valueOf(_init_$lambda$02);
            case 23:
                ((b) obj2).i0.a((fpf0) obj, PromoPlaqueAnalytics$Screen.MULTI_ORDER);
                return zy11.a;
            case 24:
                ((blk0) obj2).a = (alk0) obj;
                return zy11.a;
            case 25:
                g gVar = (g) obj2;
                final tls tlsVar = (tls) obj;
                BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: ru.yandex.taxi.themes.TaxiThemeChangeInteractor$systemTimeChangedFlow$1$receiver$1
                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        if (jl40.l(intent.getAction(), "android.intent.action.TIME_SET")) {
                            tls.this.invoke(zy11.a);
                        }
                    }
                };
                qke.z(gVar.a, broadcastReceiver, new IntentFilter("android.intent.action.TIME_SET"), 2);
                return new y7x0(17, gVar, broadcastReceiver);
            case 26:
                Drawable drawable = (Drawable) obj2;
                qam qamVar = (qam) obj;
                i28 q = qamVar.N().q();
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (qamVar.c() >> 32)), (int) Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
                Canvas canvas = t72.a;
                drawable.draw(((s72) q).a);
                return zy11.a;
            case 27:
                ((tls) obj).invoke((xky0) obj2);
                return zy11.a;
            case 28:
                yny0 yny0Var = (yny0) obj2;
                float floatValue3 = ((Float) obj).floatValue();
                tx40 tx40Var2 = yny0Var.a;
                float floatValue4 = tx40Var2.getFloatValue() + floatValue3;
                tx40 tx40Var3 = yny0Var.b;
                if (floatValue4 > tx40Var3.getFloatValue()) {
                    floatValue3 = tx40Var3.getFloatValue() - tx40Var2.getFloatValue();
                } else if (floatValue4 < 0.0f) {
                    floatValue3 = -tx40Var2.getFloatValue();
                }
                tx40Var2.setFloatValue(tx40Var2.getFloatValue() + floatValue3);
                return Float.valueOf(floatValue3);
            default:
                f530 f530Var = (f530) obj;
                y7m y7mVar = ((muy0) obj2).d;
                if (y7mVar != null) {
                    return ljs0.e(f530Var, y7mVar.a);
                }
                ny61.g("Required value was null.");
                return null;
        }
    }
}

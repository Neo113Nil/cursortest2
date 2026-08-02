package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.Editable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.yandex.fintechsdk.flows.applink.payment.internal.activity.paymentform.ApplinkPaymentFragment;
import com.yandex.fintechsdk.flows.applink.payment.internal.activity.paymentform.a;
import com.yandex.go.navigator.domain.t;
import com.yandex.go.payments.acceptance.domain.c;
import com.yandex.go.preorder.navigation.ModalsVisibility;
import com.yandex.go.preorder.source.altpins.Alternatives;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.yandex.pay.core.models.ShortPersonalizationToken;
import com.yandex.pay.payment.YPayResult;
import com.ybsdk.core.utils.text.d;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.altpins.models.b;
import ru.yandex.taxi.fragment.preorder.AddressMapFragment;
import ru.yandex.taxi.fragment.preorder.e;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;
import ru.yandex.taxi.preorder.repositories.g;
import ru.yandex.taxi.preorder.summary.solid.interactors.l;
import ru.yandex.taxi.search.b;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.view.AddFavoritesModalView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class x5 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        de0 binding;
        cxu0 a;
        sd6 sd6Var;
        a viewModel;
        a viewModel2;
        z13 component;
        String str;
        t1l0 t1l0Var;
        Object value;
        Object value2;
        int i = 0;
        String str2 = null;
        int i2 = 1;
        switch (this.a) {
            case 0:
                qas0 qas0Var = (qas0) obj;
                if (qas0Var instanceof a6) {
                    Context context = (Context) this.b;
                    Toast.makeText(context, d.a(context, ((a6) qas0Var).a).toString(), 1).show();
                }
                return zy11.a;
            case 1:
                ((wb) this.b).close();
                return zy11.a;
            case 2:
                pe peVar = (pe) obj;
                zy11 zy11Var = zy11.a;
                me meVar = (me) ((com.yandex.go.payments.acceptance.domain.d) this.b).e.get(peVar.a);
                if (meVar != null) {
                    ve veVar = peVar.b;
                    if (jl40.l(veVar, ue.a)) {
                        sls slsVar = meVar.a;
                        if (slsVar != null) {
                            slsVar.invoke();
                        }
                    } else {
                        if (!jl40.l(veVar, te.a)) {
                            w511.b();
                            return null;
                        }
                        sls slsVar2 = meVar.b;
                        if (slsVar2 != null) {
                            slsVar2.invoke();
                        }
                    }
                }
                return zy11Var;
            case 3:
                we weVar = (we) obj;
                com.yandex.go.payments.acceptance.navigation.a aVar = (com.yandex.go.payments.acceptance.navigation.a) this.b;
                if (weVar == null && aVar.u()) {
                    aVar.r(new qu(9));
                }
                return zy11.a;
            case 4:
                TaxiOrder taxiOrder = (TaxiOrder) obj;
                if (taxiOrder.h.getB() == DriveState.COMPLETE) {
                    ((c) ((com.yandex.go.taxi.order.details.v2.domain.a) this.b).a).k(taxiOrder.a);
                }
                return zy11.a;
            case 5:
                w7w w7wVar = (w7w) obj;
                ((com.yandex.go.platform.sdk.activity.a) this.b).startActivityForResult(w7wVar.a, w7wVar.b);
                return zy11.a;
            case 6:
                int X = rzo.X(((ldc) obj).a);
                com.yandex.go.design.compose.text.a aVar2 = (com.yandex.go.design.compose.text.a) this.b;
                RobotoTextView robotoTextView = aVar2.H;
                if (robotoTextView != null) {
                    robotoTextView.setTextColor(X);
                }
                RobotoTextView robotoTextView2 = aVar2.H;
                if (robotoTextView2 != null) {
                    robotoTextView2.setTextLinkColor(X);
                }
                return zy11.a;
            case 7:
                if (((Editable) obj).length() > 0) {
                    AddFavoritesModalView addFavoritesModalView = (AddFavoritesModalView) this.b;
                    binding = addFavoritesModalView.getBinding();
                    addFavoritesModalView.hideView(binding.d);
                }
                return zy11.a;
            case 8:
                ((ae0) this.b).updateAddFavoritesModalViewState((ge0) obj);
                return zy11.a;
            case 9:
                sp0 sp0Var = (sp0) this.b;
                int i3 = yp0.a[((ModalsVisibility) obj).ordinal()];
                if (i3 == 1) {
                    sp0Var.updateVisibility(true);
                } else {
                    if (i3 != 2) {
                        w511.b();
                        return null;
                    }
                    sp0Var.updateVisibility(false);
                }
                return zy11.a;
            case 10:
                zp0 zp0Var = (zp0) this.b;
                zp0Var.M = (String) obj;
                ThemeType themeType = zp0Var.K.getThemeType();
                exu0 exu0Var = zp0Var.I;
                String str3 = zp0Var.M;
                if (str3 == null || (a = ((nrt) exu0Var).b(themeType, str3)) == null) {
                    a = exu0Var.a(themeType);
                }
                ((sp0) zp0Var.Dg()).applyModalTheme(a.b, themeType);
                return zy11.a;
            case 11:
                ((b) this.b).a.render((ru.yandex.taxi.address.experiment.a) obj);
                return zy11.a;
            case 12:
                ((AddressMapFragment) this.b).applyOrderPrice((pex0) obj);
                return zy11.a;
            case 13:
                e.a((e) this.b, (pv0) obj, PositionInitAction.GEO);
                return zy11.a;
            case 14:
                ((ru.yandex.taxi.address.clarification.impl.ui.d) this.b).I.e((pv0) obj);
                return zy11.a;
            case 15:
                ((z31) this.b).Lg((lgl0) obj);
                return zy11.a;
            case 16:
                ((com.yandex.go.route.analytics.e) this.b).k = ((dbl0) obj).a;
                return zy11.a;
            case 17:
                w51 w51Var = (w51) this.b;
                ((ntj0) obj).c(new u51((j61) w51Var.Dg(), 0)).b(new v51(i, w51Var)).a(new v51(i2, new j1(2, w51Var)));
                return zy11.a;
            case 18:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                com.yandex.go.navigator.alt_select.e eVar = (com.yandex.go.navigator.alt_select.e) this.b;
                l050 Dg = eVar.Dg();
                zuj0 zuj0Var = eVar.J;
                hv1 hv1Var = (hv1) Dg;
                if (booleanValue) {
                    sd6Var = new ksy(f1h0.ic_exclamation, ((avj0) zuj0Var).h(kyh0.navigator_notification_active_ride_title), ((avj0) zuj0Var).h(kyh0.navigator_notification_active_ride_subtitle));
                } else {
                    if (booleanValue) {
                        w511.b();
                        return null;
                    }
                    sd6Var = vc60.a;
                }
                hv1Var.render(new nv1(sd6Var));
                return zy11.a;
            case 19:
                ((dx1) this.b).render((b.a) obj);
                return zy11.a;
            case 20:
                Alternatives.AlternativePaymentMethod alternativePaymentMethod = ((xu1) obj).b;
                b4a0 b4a0Var = PaymentMethod$Type.Companion;
                String str4 = alternativePaymentMethod.a;
                b4a0Var.getClass();
                PaymentMethod$Type a2 = b4a0.a(str4);
                if (a2 != null) {
                    g gVar = ((l) this.b).c;
                    kv90 kv90Var = lv90.Companion;
                    String str5 = alternativePaymentMethod.b;
                    kv90Var.getClass();
                    gVar.g(kv90.b(str5, a2), true);
                }
                return zy11.a;
            case 21:
                h0w h0wVar = (h0w) ((g0w) this.b);
                if (Build.VERSION.SDK_INT >= 34) {
                    h0wVar.l().startStylusHandwriting((View) h0wVar.b);
                } else {
                    h0wVar.getClass();
                }
                return zy11.a;
            case 22:
                YPayResult yPayResult = (YPayResult) obj;
                viewModel = ((ApplinkPaymentFragment) this.b).getViewModel();
                z22 z22Var = viewModel.b;
                if (yPayResult instanceof YPayResult.Success) {
                    ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(du90.c);
                } else if (yPayResult instanceof YPayResult.Cancelled) {
                    ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(us90.c);
                } else {
                    if (!(yPayResult instanceof YPayResult.Failure)) {
                        w511.b();
                        return null;
                    }
                    ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(dt90.c);
                }
                viewModel2 = ((ApplinkPaymentFragment) this.b).getViewModel();
                String str6 = (String) viewModel2.y.a.a.getValue();
                if (str6 != null) {
                    i8b0 i8b0Var = viewModel2.A.a;
                    synchronized (i8b0Var) {
                        str = (String) i8b0Var.a.get(str6);
                    }
                    if (str != null) {
                        str2 = ShortPersonalizationToken.m326constructorimpl(str);
                    }
                }
                component = ((ApplinkPaymentFragment) this.b).getComponent();
                Map map = ((w13) ((lwf) component).R.get()).c;
                Intent intent = new Intent();
                intent.putExtra("result_key", say.a(yPayResult));
                if (str2 != null) {
                    intent.putExtra("user_token", ShortPersonalizationToken.m325boximpl(str2));
                }
                if (map != null) {
                    intent.putExtra("enriched_url_params", new HashMap(map));
                }
                ((ApplinkPaymentFragment) this.b).requireActivity().setResult(1, intent);
                ((ApplinkPaymentFragment) this.b).requireActivity().finish();
                return zy11.a;
            case 23:
                com.ybsdk.feature.autotopup.internal.presentation.saver.a aVar3 = (com.ybsdk.feature.autotopup.internal.presentation.saver.a) this.b;
                if (((qx3) aVar3.X()).c.b() == null) {
                    aVar3.Z(ux3.a);
                } else {
                    aVar3.Z(ay3.a);
                }
                return zy11.a;
            case 24:
                com.yandex.go.navigator.domain.a aVar4 = (com.yandex.go.navigator.domain.a) this.b;
                r0 r0Var = aVar4.h;
                t tVar = aVar4.b;
                if (!aVar4.a()) {
                    l7z l7zVar = (l7z) aVar4.a.e.getValue();
                    if (aVar4.c.a()) {
                        if (!aVar4.d.c || ((com.yandex.go.drive.sdkintegration.domain.session.e) aVar4.f.get()).c()) {
                            if (((l7zVar == null || (t1l0Var = l7zVar.c) == null) ? 50.0d : t1l0Var.a) < 50.0d || ((Boolean) r0Var.getValue()).booleanValue()) {
                                aVar4.i = true;
                                if (((Boolean) r0Var.getValue()).booleanValue() || ((k19) aVar4.e.get()).a() == null) {
                                    tVar.f(true);
                                }
                            }
                        } else {
                            tVar.f(true);
                        }
                    }
                }
                return zy11.a;
            case 25:
                ((com.yandex.messaging.internal.backendconfig.a) this.b).b.l((BackendConfig) obj);
                return zy11.a;
            case 26:
                ((lb6) this.b).e(((Number) obj).intValue());
                return zy11.a;
            case 27:
                List list = (List) obj;
                ru.yandex.taxi.preorder.summary.tariffpage.data.d dVar = (ru.yandex.taxi.preorder.summary.tariffpage.data.d) this.b;
                LinearLayout linearLayout = dVar.a;
                dkx0 dkx0Var = dVar.d;
                if (list.isEmpty()) {
                    dVar.b(linearLayout, list);
                } else {
                    if (!dkx0Var.g) {
                        fva0.f(dkx0Var.a, "TariffPagerBadges.Render", PerformanceAnalytics$Type.Bind, 0L, 4);
                    }
                    dVar.b(linearLayout, list);
                    if (!dkx0Var.g) {
                        fva0.b(dkx0Var.a, "TariffPagerBadges.Render", PerformanceAnalytics$Type.Bind, null, 4);
                        dkx0Var.g = true;
                    }
                }
                return zy11.a;
            case 28:
                zrf0 zrf0Var = (zrf0) obj;
                r0 r0Var2 = ((ru.yandex.taxi.logistics.sdk.promotions.api.a) this.b).c;
                do {
                    value = r0Var2.getValue();
                    ((Boolean) value).getClass();
                } while (!r0Var2.k(value, Boolean.valueOf(!zrf0Var.a.isEmpty())));
                return zy11.a;
            default:
                zrf0 zrf0Var2 = (zrf0) obj;
                r0 r0Var3 = ((ru.yandex.taxi.logistics.sdk.promotions.impl.ui.b) this.b).h;
                do {
                    value2 = r0Var3.getValue();
                } while (!r0Var3.k(value2, zrf0Var2));
                return zy11.a;
        }
    }
}

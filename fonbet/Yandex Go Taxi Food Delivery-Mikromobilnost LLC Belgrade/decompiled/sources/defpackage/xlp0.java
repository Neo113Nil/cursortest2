package defpackage;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.view.View;
import com.yandex.go.address.models.Address;
import com.yandex.go.design.compose.haptic.HapticEffect;
import com.yandex.go.dto.response.q1;
import com.yandex.go.mainscreen.superapp.analytics.SuperappMainAnalytics$SearchBarTapSource;
import com.yandex.go.mainscreen.superapp.impl.header.presentation.header.SuperAppMainScreenHeader;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.payments.api.preorder.SuitabilityCheckType;
import com.yandex.go.search.model.DecideLaterConfig;
import com.yandex.go.slot.ui.view.SlotItemViewComponent;
import com.yandex.go.superapp.discovery.map.impl.ui.main.SuperAppDiscoveryMapModalView;
import com.yandex.go.superapp.searchbar.impl.ui.searchbar.SuperappSearchbarView;
import com.yandex.plus.home.feature.webviews.internalapi.WebViewType;
import com.ybsdk.core.common.domain.entities.CommunicationType;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.deeplink.api.DeeplinkNavigation;
import com.ybsdk.feature.deeplink.api.a;
import com.ybsdk.feature.transfer.version2.internal.screens.result.TransferMainResultFragment;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import com.ybsdk.screens.modal.SpoilerOnboardingBottomSheet;
import com.ybsdk.utils.b;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$BooleanRef;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.communications.model.widgets.ActionButton;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.order.view.TopCircleButtonsView;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.preorder.source.domain.p;
import ru.yandex.taxi.preorder.summary.solid.SolidSummaryView;
import ru.yandex.taxi.preorder.summary.tariffpage.badge.j;
import ru.yandex.taxi.search.address.view.CompositeAddressSearchView;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.summary.promotions.analytics.SummaryPromotionsAnalytics$SummaryState;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;
import ru.yandex.taxi.web.modal.WebContainerModalView;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes6.dex */
public final /* synthetic */ class xlp0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ xlp0(int[] iArr, float[] fArr, ges0 ges0Var) {
        this.a = 4;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        this.b = iArr;
        this.c = fArr;
        this.w = ges0Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 actionInternal$lambda$0;
        zy11 renderTrailInternal$lambda$7;
        ah00 ah00Var;
        boolean isOpened;
        oep0 oep0Var;
        yvf0 yvf0Var;
        buv0 mapCategoryFiltersAdapter_delegate$lambda$0;
        zy11 initButton$lambda$1$0;
        zy11 initHint$lambda$0$0;
        wls wlsVar;
        zy11 bindCircleButton$lambda$1;
        zy11 renderComment$lambda$18$lambda$16$lambda$15;
        zy11 renderButton$lambda$26$lambda$24$lambda$23;
        int i = this.a;
        int i2 = 14;
        int i3 = 20;
        zy11 zy11Var = zy11.a;
        Object obj = this.w;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((ylp0) obj3).b((vmn0) obj2, (Runnable) obj);
                return zy11Var;
            case 1:
                juq0 juq0Var = (juq0) obj3;
                xtq0 xtq0Var = (xtq0) obj2;
                huq0 huq0Var = (huq0) obj;
                h791.e(juq0Var.c.a, xtq0Var.a, false, null, 14);
                String str = xtq0Var.a;
                z94 z94Var = juq0Var.b.j0;
                LinkedHashMap t = x4e.t(4, "tooltip_id", huq0Var.a, "view_id", huq0Var.b);
                t.put(MetaDataField.SCREEN_FIELD, "PRODUCTS");
                if (str != null) {
                    t.put("action", str);
                }
                z94Var.a.a("small_tooltip_notification.click", t);
                return zy11Var;
            case 2:
                juq0 juq0Var2 = (juq0) obj3;
                huq0 huq0Var2 = (huq0) obj;
                kuq0 kuq0Var = juq0Var2.c;
                auq0 auq0Var = ((fuq0) obj2).b;
                String str2 = auq0Var.b;
                ((l3h) kuq0Var.a).d(a.a(new DeeplinkAction.MarkEventAsRead(str2, str2), DeeplinkNavigation.Add.INSTANCE));
                juq0Var2.d.c(new btc(auq0Var.b, auq0Var.c, nfp0.b, CommunicationType.SMALL_TOOLTIP));
                z94 z94Var2 = juq0Var2.b.j0;
                LinkedHashMap t2 = x4e.t(3, "tooltip_id", huq0Var2.a, "view_id", huq0Var2.b);
                t2.put(MetaDataField.SCREEN_FIELD, "PRODUCTS");
                z94Var2.a.a("small_tooltip_notification.shown", t2);
                return zy11Var;
            case 3:
                r0s0 r0s0Var = (r0s0) obj3;
                SourcePicker sourcePicker = (SourcePicker) obj2;
                PointType pointType = (PointType) obj;
                ljd ljdVar = r0s0Var.d;
                i61 i61Var = r0s0Var.c;
                y4k0 y4k0Var = r0s0Var.j;
                y4k0Var.getClass();
                y4k0Var.getClass();
                Address d = ljdVar.b.d();
                String str3 = ljdVar.c.b() == Screen.MAIN_V4 ? "superapp_main" : "pickup_location";
                uio0 uio0Var = ljdVar.a;
                Address address = d;
                dsd dsdVar = (dsd) uio0Var.a;
                SourcePicker b = sourcePicker.b(true);
                tjt0 tjt0Var = (tjt0) uio0Var.e;
                ujt0 ujt0Var = new ujt0(true);
                ddf ddfVar = new ddf(11, new rwp0(RoutePointType.POINT_A, false));
                DecideLaterConfig decideLaterConfig = DecideLaterConfig.a;
                r51 r51Var = new r51(b, decideLaterConfig, null);
                m3o m3oVar = new m3o(((l3o) uio0Var.b).a(false));
                y9y0 y9y0Var = (y9y0) uio0Var.c;
                cag c = fh4.c(r51Var, ddfVar, m3oVar, tjt0Var.a, new aye0(i3, y9y0Var), ujt0Var);
                SourcePicker b2 = sourcePicker.b(false);
                kzi kziVar = kzi.a;
                apf a = uub1.a(new p1b(c, ((g0j) uio0Var.f).a(new h0j(kziVar, address, str3, true, true), new ddf(11, new rwp0(uio0Var.c(kziVar, address), false)), new r51(b2, decideLaterConfig, null), m3o.b, (y9y0) uio0Var.c)), dsdVar.a, y9y0Var);
                CompositeAddressSearchView.Companion.getClass();
                fjd fjdVar = new fjd(a);
                fjdVar.n = i61Var;
                fjdVar.j = wch0.addresses_picker;
                fjdVar.k = true;
                fjdVar.p = pointType;
                return new CompositeAddressSearchView(fjdVar, null);
            case 4:
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.5f, 0.0f, -0.5f, (int[]) obj3, (float[]) obj2, Shader.TileMode.REPEAT);
                linearGradient.setLocalMatrix(((ges0) obj).x);
                return linearGradient;
            case 5:
                ((oz40) obj3).setValue(Boolean.TRUE);
                ((tls) obj2).invoke(((aps0) obj).g);
                return zy11Var;
            case 6:
                actionInternal$lambda$0 = SlotItemViewComponent.setActionInternal$lambda$0((rqs0) obj3, (nqs0) obj2, (View) obj);
                return actionInternal$lambda$0;
            case 7:
                renderTrailInternal$lambda$7 = SlotItemViewComponent.renderTrailInternal$lambda$7((rqs0) obj3, (nqs0) obj2, (ListItemComponent) obj);
                return renderTrailInternal$lambda$7;
            case 8:
                tls tlsVar = (tls) obj3;
                ivs0 ivs0Var = (ivs0) obj2;
                oz40 oz40Var = (oz40) obj;
                tlsVar.invoke(ivs0Var.f);
                if (ivs0Var.b) {
                    oz40Var.setValue(Boolean.TRUE);
                } else {
                    tlsVar.invoke(ivs0Var.c);
                }
                return zy11Var;
            case 9:
                ((tx40) obj2).setFloatValue(1.0f);
                ((oz40) obj).setValue(new wu60(0L));
                ((tls) obj3).invoke(eys0.a);
                return zy11Var;
            case 10:
                szs0 szs0Var = (szs0) obj3;
                return new com.yandex.plus.home.feature.webviews.internal.smart.contract.a(szs0Var.e(), szs0Var.f(), szs0Var.c, szs0Var.w, szs0Var.H, szs0Var.x, szs0Var.y, szs0Var.z, szs0Var.A, szs0Var.B, szs0Var.C, szs0Var.D, szs0Var.E, (zqc) obj2, szs0Var.F, szs0Var.G, (WebViewType) obj, szs0Var.J, szs0Var.I);
            case 11:
                Address address2 = (Address) obj3;
                SolidSummaryView solidSummaryView = (SolidSummaryView) obj2;
                SourcePicker sourcePicker2 = (SourcePicker) obj;
                ah00Var = solidSummaryView.mapController;
                zzs b3 = ((gh00) ah00Var).e.b();
                isOpened = solidSummaryView.isOpened();
                c83 a2 = k0b1.a(address2, b3, sourcePicker2, isOpened ? ModalViewOrigin.SUMMARY : ModalViewOrigin.HOME, solidSummaryView.addressOnTop(), new e83(2, solidSummaryView));
                oep0Var = solidSummaryView.screenStackNavigator;
                yvf0Var = solidSummaryView.askNewStopRouterLazy;
                ((pep0) oep0Var).f((m950) yvf0Var.get(), a2, hxx.a);
                return zy11Var;
            case 12:
                String str4 = (String) obj2;
                String str5 = (String) obj;
                q8t0 q8t0Var = (q8t0) ((v8t0) obj3).x.b;
                if (str4 == null || str4.length() == 0) {
                    ((a60) ((y50) q8t0Var.H.get())).c(str5, v770.c);
                } else if (q8t0Var.G.i(WebContainerModalView.class) == null) {
                    yu41 yu41Var = q8t0Var.L;
                    yu41Var.getClass();
                    xu41 xu41Var = new xu41(yu41Var, str4);
                    xu41Var.b();
                    xu41Var.c("order_id");
                    String uri = xu41Var.a().build().toString();
                    String b4 = q8t0Var.K.b();
                    CoreWebViewConfig.a aVar = new CoreWebViewConfig.a();
                    aVar.b = uri;
                    aVar.e = false;
                    aVar.c = b4;
                    UiWebViewConfig uiWebViewConfig = new UiWebViewConfig(aVar.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
                    uiWebViewConfig.setHasTitleFromWeb(true);
                    uiWebViewConfig.setShouldUseCached(false);
                    ((pep0) q8t0Var.J).f((m950) q8t0Var.I.get(), new dg41(uiWebViewConfig, null, null, null, null, null, null, 254), hxx.a);
                }
                return zy11Var;
            case 13:
                rpt0 rpt0Var = (rpt0) obj3;
                Screen screen = (Screen) obj2;
                g18 g18Var = (g18) obj;
                LinkedList linkedList = rpt0Var.e.a;
                nft0.a.getClass();
                linkedList.removeFirstOccurrence(nft0.b);
                p pVar = rpt0Var.f;
                aq80 aq80Var = pVar.q;
                aq80Var.getClass();
                if (screen != Screen.SUMMARY) {
                    if (((icv0) aq80Var.a).a(new SuitabilityCheckType[0])) {
                        pVar.c(bov0.e);
                    } else {
                        ((xit0) pVar.s.get()).a();
                        ((uet0) pVar.o.get()).a();
                    }
                }
                ((dgt0) rpt0Var.c).b(null);
                rpt0Var.j = null;
                g18Var.cancel();
                return zy11Var;
            case 14:
                BottomSheetDialogView bottomSheetDialogView = (BottomSheetDialogView) obj3;
                b bVar = (b) obj2;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj;
                SpoilerOnboardingBottomSheet spoilerOnboardingBottomSheet = new SpoilerOnboardingBottomSheet(bottomSheetDialogView.getContext(), null, 0, 6, null);
                spoilerOnboardingBottomSheet.render(new xvt0(fob1.b(bVar.h.getImage())));
                spoilerOnboardingBottomSheet.setButtonsListeners(new lxo0(i3, ref$BooleanRef, bVar, bottomSheetDialogView));
                bottomSheetDialogView.onDismiss(new scs0(i2, bVar, ref$BooleanRef));
                return spoilerOnboardingBottomSheet;
            case 15:
                ((ru.yandex.taxi.stories.domain.notifications.a) obj3).b.remove((String) obj2, (x5s0) obj);
                return zy11Var;
            case 16:
                w0s w0sVar = (w0s) obj2;
                return (((Boolean) ((m3u0) obj3).getValue()).booleanValue() || w0sVar == null) ? (w0s) obj : w0sVar;
            case 17:
                ((j) obj3).b.b((zkv0) obj2, SummaryPromotionsAnalytics$SummaryState.EXPANDED, (ActionButton) obj);
                return zy11Var;
            case 18:
                mapCategoryFiltersAdapter_delegate$lambda$0 = SuperAppDiscoveryMapModalView.mapCategoryFiltersAdapter_delegate$lambda$0((tt2) obj3, (SuperAppDiscoveryMapModalView) obj2, (e) obj);
                return mapCategoryFiltersAdapter_delegate$lambda$0;
            case 19:
                initButton$lambda$1$0 = SuperAppMainScreenHeader.initButton$lambda$1$0((com.yandex.go.mainscreen.superapp.impl.clarifyaddress.presentation.b) obj3, (x27) obj2, (pwz0) obj);
                return initButton$lambda$1$0;
            case 20:
                initHint$lambda$0$0 = SuperAppMainScreenHeader.initHint$lambda$0$0((com.yandex.go.mainscreen.superapp.impl.clarifyaddress.presentation.b) obj3, (wju) obj2, (pwz0) obj);
                return initHint$lambda$0$0;
            case 21:
                SuperappSearchbarView superappSearchbarView = (SuperappSearchbarView) obj2;
                SuperappMainAnalytics$SearchBarTapSource superappMainAnalytics$SearchBarTapSource = (SuperappMainAnalytics$SearchBarTapSource) obj;
                q1 q1Var = ((iew0) obj3).c;
                if (q1Var != null) {
                    wlsVar = superappSearchbarView.actionHandler;
                    wlsVar.invoke(q1Var, superappMainAnalytics$SearchBarTapSource);
                }
                return zy11Var;
            case 22:
                ((but0) ((f9a) obj3).I).invoke((o2y0) obj2, (String) obj);
                return zy11Var;
            case 23:
                ((tls) obj3).invoke(new yh31((uox0) obj2, ((Boolean) ((m3u0) obj).getValue()).booleanValue()));
                return zy11Var;
            case 24:
                ((tls) obj3).invoke(new emq0((ej31) obj2));
                ((fgd) obj).a(HapticEffect.Tick);
                return zy11Var;
            case 25:
                String str6 = (String) obj2;
                uqx0 uqx0Var = ((com.yandex.plus.pay.graphql.analytics.b) obj3).a;
                String str7 = (String) ((ymd) obj).e.a();
                uqx0Var.getClass();
                Map e = gw00.e(new Pair("target", str7));
                bt90 bt90Var = uqx0Var.a;
                if (str6 == null) {
                    str6 = "no_value";
                }
                sbx sbxVar = uqx0Var.b;
                sbxVar.getClass();
                auu0 auu0Var = auu0.a;
                LinkedHashMap y = g8e.y("requestId", str6, "additionalData", sbxVar.c(e, new k8u(auu0Var, qke.n(auu0Var), 1)));
                y.put("_meta", bt90.b(new HashMap()));
                bt90Var.c("Error.Subscription.Tarifficator.OfferDetails.InvalidWidgetUrl", y);
                return zy11Var;
            case 26:
                ((tls) obj3).invoke(((r3z0) obj2).d);
                ((oz40) obj).setValue(Boolean.FALSE);
                return zy11Var;
            case 27:
                bindCircleButton$lambda$1 = TopCircleButtonsView.bindCircleButton$lambda$1((TopCircleButtonsView) obj3, (String) obj2, (xw) obj);
                return bindCircleButton$lambda$1;
            case 28:
                renderComment$lambda$18$lambda$16$lambda$15 = TransferMainResultFragment.renderComment$lambda$18$lambda$16$lambda$15((w961) obj3, (Text) obj2, (TransferMainResultFragment) obj);
                return renderComment$lambda$18$lambda$16$lambda$15;
            default:
                renderButton$lambda$26$lambda$24$lambda$23 = TransferMainResultFragment.renderButton$lambda$26$lambda$24$lambda$23((w961) obj3, (YbButtonViewGroup.b) obj2, (TransferMainResultFragment) obj);
                return renderButton$lambda$26$lambda$24$lambda$23;
        }
    }

    public /* synthetic */ xlp0(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }
}

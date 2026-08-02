package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import coil.compose.d;
import com.yandex.go.platform.deeplink.a;
import com.yandex.go.platform.web_api.data.c;
import com.yandex.go.scooters.offers.v2.g;
import com.yandex.go.superapp.order.multi.old.view.l;
import com.yandex.go.taxi.order.models.api.response.SearchOverlayType;
import com.ybsdk.common.InternalSdkState;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountCloseAccountResultResult;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountCloseAccountResultType;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.feature.qr.internal.screens.reader.presentation.QrReaderFragment;
import com.ybsdk.feature.savings.api.SavingsActionStatus;
import com.ybsdk.navigation.NavigationFragment;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.plus.sdk.micro_widget.composite.b;
import ru.yandex.video.m3.BuildConfig;

/* loaded from: classes13.dex */
public final /* synthetic */ class v41 implements vpr, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v41(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        r0 r0Var;
        Object value;
        float floatValue;
        Float f;
        dvq0 dvq0Var;
        Float f2;
        Object obj2;
        Object onViewCreated$subscribeBoundary;
        r0 r0Var2;
        Object value2;
        YbButtonViewGroup.b bVar;
        YbButtonView.a aVar;
        int i = this.a;
        int i2 = 0;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((CopyOnWriteArraySet) obj3).add((String) obj);
                return zy11Var;
            case 1:
                tls tlsVar = d.N;
                ((d) obj3).l((ha3) obj);
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                return zy11Var;
            case 2:
                ((r0) obj3).emit((noh) obj, continuation);
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                return zy11Var;
            case 3:
                ((ay7) obj3).applyStyle((String) obj);
                return zy11Var;
            case 4:
                ((moa) obj3).M9((uoa) obj);
                return zy11Var;
            case 5:
                we20 we20Var = (we20) obj;
                ((b) obj3).h.show(we20Var.a, 300L, we20Var.c);
                return zy11Var;
            case 6:
                Intent intent = (Intent) obj;
                a aVar2 = (a) obj3;
                aVar2.d.getClass();
                Uri data = intent.getData();
                if (data != null) {
                    String host = data.getHost();
                    if (host != null && host.hashCode() == 3052376 && host.equals("chat")) {
                        data.getQueryParameter("chat_id");
                    } else {
                        intent.setData(null);
                        aVar2.a(data, false);
                    }
                } else {
                    String stringExtra = intent.getStringExtra("payload");
                    if (stringExtra != null) {
                        aVar2.b((c) sbx.d.b(xu90.d, stringExtra));
                    }
                }
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                return zy11Var;
            case 7:
                ((xqz) obj3).eb((jrz) obj);
                return zy11Var;
            case 8:
                ((bl10) obj3).wd((al10) obj);
                return zy11Var;
            case 9:
                String str = (String) obj;
                com.ybsdk.feature.merchant.offers.internal.screens.testSearch.a aVar3 = (com.ybsdk.feature.merchant.offers.internal.screens.testSearch.a) obj3;
                pz40 Y = aVar3.Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, new pq10(new t8j0(), str)));
                aVar3.b0();
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                return zy11Var;
            case 10:
                ((NavigationFragment) obj3).processInternalState((InternalSdkState) obj);
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                return zy11Var;
            case 11:
                ((vk70) obj3).mc((vl70) obj);
                return zy11Var;
            case 12:
                ((qr70) obj3).O3((vr70) obj);
                return zy11Var;
            case 13:
                com.yandex.go.order.ui.order_list_modal_height.presentation.a aVar4 = (com.yandex.go.order.ui.order_list_modal_height.presentation.a) obj3;
                aVar4.getClass();
                ArrayList arrayList = new ArrayList();
                for (x101 x101Var : (List) obj) {
                    y8i0 y8i0Var = aVar4.f;
                    if (y8i0Var != null) {
                        Iterator it = y8i0Var.a.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj2 = it.next();
                                if (jl40.l(((dvq0) obj2).a, x101Var.a)) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        dvq0Var = (dvq0) obj2;
                    } else {
                        dvq0Var = null;
                    }
                    if (dvq0Var == null || (f2 = (Float) dvq0Var.b.get(x101Var.b)) == null) {
                        f2 = dvq0Var != null ? (Float) dvq0Var.b.get("default") : null;
                    }
                    if (f2 != null) {
                        arrayList.add(f2);
                    }
                }
                Float i0 = kotlin.collections.a.i0(arrayList);
                if (i0 != null) {
                    floatValue = i0.floatValue();
                } else {
                    y8i0 y8i0Var2 = aVar4.f;
                    floatValue = (y8i0Var2 == null || (f = y8i0Var2.b) == null) ? 0.5f : f.floatValue();
                }
                float c = floatValue < 0.85f ? y6i0.c(floatValue, 0.2f, 1.0f) : 1.0f;
                r0 r0Var3 = aVar4.e;
                Float valueOf = Float.valueOf(c);
                r0Var3.getClass();
                r0Var3.m(null, valueOf);
                return zy11Var;
            case 14:
                ((e080) obj3).V7((List) obj);
                return zy11Var;
            case 15:
                ((weu) obj3).invoke((c5d0) obj);
                return zy11Var;
            case 16:
                ((wxf0) obj3).P5((SearchOverlayType) obj);
                return zy11Var;
            case 17:
                onViewCreated$subscribeBoundary = QrReaderFragment.onViewCreated$subscribeBoundary((QrReaderFragment) obj3, (View) obj, continuation);
                return onViewCreated$subscribeBoundary == CoroutineSingletons.COROUTINE_SUSPENDED ? onViewCreated$subscribeBoundary : zy11Var;
            case 18:
                return l.a((l) obj3, (o2y0) obj, continuation);
            case 19:
                ((ru.yandex.taxi.preorder.summary.altchoice.ui.c) obj3).b((List) obj);
                return zy11Var;
            case 20:
                w9m0 w9m0Var = (w9m0) obj;
                q3m0 q3m0Var = (q3m0) obj3;
                w3m0 w3m0Var = q3m0Var.G;
                AppAnalyticsReporter appAnalyticsReporter = q3m0Var.D;
                SavingsActionStatus savingsActionStatus = w9m0Var.a;
                Throwable th = w9m0Var.b;
                int i3 = p3m0.a[savingsActionStatus.ordinal()];
                if (i3 == 1) {
                    appAnalyticsReporter.f0.H(null, SavingsEvents$SavingsAccountCloseAccountResultResult.OK, SavingsEvents$SavingsAccountCloseAccountResultType.DEPOSIT);
                    ((gdm0) q3m0Var.F).b();
                } else if (i3 == 2) {
                    if (th != null) {
                        q3m0Var.W("IDEMPOTENCY_KEY_FOR_CLOSING", th);
                    }
                    appAnalyticsReporter.f0.H(th != null ? th.getLocalizedMessage() : null, SavingsEvents$SavingsAccountCloseAccountResultResult.ERROR, SavingsEvents$SavingsAccountCloseAccountResultType.DEPOSIT);
                } else if (i3 != 3) {
                    w511.b();
                    return null;
                }
                boolean z = w9m0Var.a == SavingsActionStatus.IN_PROGRESS;
                pz40 Y2 = q3m0Var.Y();
                do {
                    r0Var2 = (r0) Y2;
                    value2 = r0Var2.getValue();
                } while (!r0Var2.k(value2, new g3m0(((g3m0) value2).a, z)));
                BottomSheetDialogView.State state = q3m0Var.I;
                YbButtonViewGroup.b bVar2 = state.b;
                if (bVar2 != null) {
                    YbButtonView.a aVar5 = bVar2.b;
                    YbButtonView.a a = aVar5 != null ? YbButtonView.a.a(aVar5, null, null, false, z, BuildConfig.VERSION_CODE) : null;
                    YbButtonView.a aVar6 = bVar2.c;
                    if (aVar6 != null) {
                        w3m0Var.getClass();
                        aVar = YbButtonView.a.a(aVar6, z ? new ColorModel.Attr(ung0.ybColor_button_disabled) : new ColorModel.Attr(ung0.ybColor_button_secondaryNormal), z ? new ColorModel.Attr(ung0.ybColor_textIcon_quaternary) : new ColorModel.Attr(ung0.ybColor_textIcon_primary), false, false, 4071);
                    } else {
                        aVar = null;
                    }
                    bVar = YbButtonViewGroup.b.a(bVar2, a, aVar, 9);
                } else {
                    bVar = null;
                }
                q3m0Var.Z(new o3m0(BottomSheetDialogView.State.a(state, null, bVar, 65533)));
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                return zy11Var;
            case 21:
                ((com.ybsdk.feature.savings.internal.screens.dashboard.v4.c) obj3).c0((lam0) obj);
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                return zy11Var;
            case 22:
                ((min0) obj3).we(((Boolean) obj).booleanValue());
                return zy11Var;
            case 23:
                u3o0 u3o0Var = (u3o0) obj;
                com.yandex.go.scooters.offer_on_camera.b bVar3 = (com.yandex.go.scooters.offer_on_camera.b) obj3;
                bVar3.getClass();
                if (jl40.l(u3o0Var, s3o0.a)) {
                    g gVar = bVar3.L;
                    if (gVar != null) {
                        bVar3.L = null;
                        bVar3.j(new epb(gVar));
                    }
                } else {
                    if (!(u3o0Var instanceof t3o0)) {
                        w511.b();
                        return null;
                    }
                    pz40 pz40Var = ((t3o0) u3o0Var).a;
                    bVar3.K.a.b("Perf.ScootersCardV2Router.Launch");
                    g gVar2 = bVar3.L;
                    if (gVar2 == null) {
                        gVar2 = (g) bVar3.E.get();
                        bVar3.L = gVar2;
                    }
                    bVar3.A(gVar2, new o6n0(pz40Var), new x3o0(bVar3, i2));
                }
                return zy11Var;
            case 24:
                return ru.yandex.taxi.scooters.domain.l.a((ru.yandex.taxi.scooters.domain.l) obj3, (zuo0) obj, continuation);
            case 25:
                ((cmo0) obj3).s9((Throwable) obj);
                return zy11Var;
            case 26:
                ((gcr0) obj3).ea((scr0) obj);
                return zy11Var;
            case 27:
                ((kbu0) obj3).ed((nbu0) obj);
                return zy11Var;
            case 28:
                zgv0 zgv0Var = (zgv0) obj;
                com.yandex.go.taxi.summary.ui.d dVar = (com.yandex.go.taxi.summary.ui.d) obj3;
                zxs0 zxs0Var = dVar.h;
                ListItemComponent listItemComponent = dVar.e;
                g18 g18Var = dVar.g;
                if (g18Var != null) {
                    g18Var.cancel();
                }
                dVar.g = null;
                if (jl40.l(zgv0Var, wgv0.a)) {
                    listItemComponent.setVisibility(8);
                } else if (zgv0Var instanceof xgv0) {
                    listItemComponent.setVisibility(0);
                    listItemComponent.setMinHeight(tje.u(46, listItemComponent.getContext()));
                    xw31.E(listItemComponent, null, Integer.valueOf(tje.u(8, listItemComponent.getContext())), null, null);
                    xgv0 xgv0Var = (xgv0) zgv0Var;
                    listItemComponent.setTitle(xgv0Var.a);
                    ip11 ip11Var = dVar.c;
                    listItemComponent.getContext();
                    listItemComponent.setTitleTypeface(((zmh) ip11Var).d());
                    listItemComponent.setTitleTextSizePx(tje.u(30, listItemComponent.getContext()));
                    listItemComponent.clearLeadView();
                    zxs0Var.u(xgv0Var.b);
                } else {
                    if (!(zgv0Var instanceof ygv0)) {
                        w511.b();
                        return null;
                    }
                    listItemComponent.setVisibility(0);
                    listItemComponent.setMinHeight(tje.u(56, listItemComponent.getContext()));
                    xw31.E(listItemComponent, null, 0, null, null);
                    ygv0 ygv0Var = (ygv0) zgv0Var;
                    int i4 = ygv0Var.c;
                    String str2 = ygv0Var.b;
                    listItemComponent.setTitle(ygv0Var.a);
                    listItemComponent.setTitleTypeface(3);
                    listItemComponent.setTitleTextSizePx(tje.u(24, listItemComponent.getContext()));
                    if (str2 == null || str2.length() == 0) {
                        listItemComponent.setLeadImage(i4);
                    } else {
                        nac nacVar = (nac) dVar.d.a(listItemComponent.getLeadImageView());
                        nacVar.e(i4);
                        dVar.g = nacVar.c(str2);
                    }
                    listItemComponent.getLeadImageView().setMinimumWidth(tje.u(56, listItemComponent.getContext()));
                    listItemComponent.setContentDescription(ygv0Var.e);
                    zxs0Var.u(ygv0Var.d);
                }
                return zy11Var;
            default:
                ((f6t0) obj3).a((g6t0) obj);
                return zy11Var;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 2:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 3:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 4:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 5:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 6:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 7:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 8:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 9:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 10:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 11:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 12:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 13:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 14:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 15:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 16:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 17:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 18:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 19:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 20:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 21:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 22:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 23:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 24:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 25:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 26:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 27:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 28:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new AdaptedFunctionReference(2, (CopyOnWriteArraySet) obj, CopyOnWriteArraySet.class, "add", "add(Ljava/lang/Object;)Z", 12);
            case 1:
                return new AdaptedFunctionReference(2, (d) obj, d.class, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V", 4);
            case 2:
                return new FunctionReferenceImpl(2, (r0) obj, pz40.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            case 3:
                return new AdaptedFunctionReference(2, (ay7) obj, ay7.class, "applyStyle", "applyStyle(Ljava/lang/String;)V", 4);
            case 4:
                return new AdaptedFunctionReference(2, (moa) obj, moa.class, "render", "render(Lcom/yandex/go/chargers/qr/ChargersQrUiState;)V", 4);
            case 5:
                return new AdaptedFunctionReference(2, (b) obj, b.class, "renderPlaque", "renderPlaque(Lru/yandex/taxi/plus/sdk/micro_widget/composite/MicroWidgetBadgeInteractor$ShownBadgeModel;)V", 4);
            case 6:
                return new AdaptedFunctionReference(2, (a) obj, a.class, "processDeeplinkFromIntent", "processDeeplinkFromIntent(Landroid/content/Intent;)V", 4);
            case 7:
                return new AdaptedFunctionReference(2, (xqz) obj, xqz.class, "render", "render(Lcom/yandex/go/safety/center/lost_item/modal/ui/LostItemModalViewState;)V", 4);
            case 8:
                return new AdaptedFunctionReference(2, (bl10) obj, bl10.class, "render", "render(Lru/yandex/taxi/settings/info/model/MenuInfoModel;)V", 4);
            case 9:
                return new AdaptedFunctionReference(2, (com.ybsdk.feature.merchant.offers.internal.screens.testSearch.a) obj, com.ybsdk.feature.merchant.offers.internal.screens.testSearch.a.class, "onSearchQueryInputChanged", "onSearchQueryInputChanged(Ljava/lang/String;)V", 4);
            case 10:
                return new AdaptedFunctionReference(2, (NavigationFragment) obj, NavigationFragment.class, "processInternalState", "processInternalState(Lcom/ybsdk/common/InternalSdkState;)V", 4);
            case 11:
                return new AdaptedFunctionReference(2, (vk70) obj, vk70.class, "render", "render(Lcom/yandex/go/taxi/order/cancel/v2/domain/models/OrderCancelUiState;)V", 4);
            case 12:
                return new AdaptedFunctionReference(2, (qr70) obj, qr70.class, "render", "render(Lcom/yandex/go/taxi/order/promotions/modal_default/model/OrderDefaultModalUiState;)V", 4);
            case 13:
                return new AdaptedFunctionReference(2, (com.yandex.go.order.ui.order_list_modal_height.presentation.a) obj, com.yandex.go.order.ui.order_list_modal_height.presentation.a.class, "onActiveOrderListChanged", "onActiveOrderListChanged(Ljava/util/List;)V", 4);
            case 14:
                return new AdaptedFunctionReference(2, (e080) obj, e080.class, "renderMapObjects", "renderMapObjects(Ljava/util/List;)V", 4);
            case 15:
                return new FunctionReferenceImpl(2, (weu) obj, cvw.class, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Lcom/yandex/plus/home/api/info/PlusInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            case 16:
                return new AdaptedFunctionReference(2, (wxf0) obj, wxf0.class, "showCoverSearchType", "showCoverSearchType(Lcom/yandex/go/taxi/order/models/api/response/SearchOverlayType;)V", 4);
            case 17:
                return new AdaptedFunctionReference(2, (QrReaderFragment) obj, QrReaderFragment.class, "subscribeBoundary", "subscribeBoundary(Landroid/view/View;)V", 4);
            case 18:
                return new FunctionReferenceImpl(2, (l) obj, l.class, "onOrderCompleted", "onOrderCompleted(Lcom/yandex/go/taxi/order/models/api/TaxiOrderHolder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            case 19:
                return new AdaptedFunctionReference(2, (ru.yandex.taxi.preorder.summary.altchoice.ui.c) obj, ru.yandex.taxi.preorder.summary.altchoice.ui.c.class, "bind", "bind(Ljava/util/List;)V", 4);
            case 20:
                return new AdaptedFunctionReference(2, (q3m0) obj, q3m0.class, "onClosingActionChange", "onClosingActionChange(Lcom/ybsdk/feature/savings/api/SavingsAction$Close;)V", 4);
            case 21:
                return new AdaptedFunctionReference(2, (com.ybsdk.feature.savings.internal.screens.dashboard.v4.c) obj, com.ybsdk.feature.savings.internal.screens.dashboard.v4.c.class, "applyNewState", "applyNewState(Lcom/ybsdk/feature/savings/internal/entities/v4/SavingsDashboardDataEntityV4;)V", 4);
            case 22:
                return new AdaptedFunctionReference(2, (min0) obj, min0.class, "setActiveOrdersButtonVisibility", "setActiveOrdersButtonVisibility(Z)V", 4);
            case 23:
                return new AdaptedFunctionReference(2, (com.yandex.go.scooters.offer_on_camera.b) obj, com.yandex.go.scooters.offer_on_camera.b.class, "handleOfferOnCameraAction", "handleOfferOnCameraAction(Lcom/yandex/go/scooters/offer_on_camera/domain/ScootersOfferOnCameraInteractor$OfferOnCameraAction;)V", 4);
            case 24:
                return new FunctionReferenceImpl(2, (ru.yandex.taxi.scooters.domain.l) obj, ru.yandex.taxi.scooters.domain.l.class, "handleSessionDisappearance", "handleSessionDisappearance(Lcom/yandex/go/scooters/api/domain/model/ScootersSessionState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            case 25:
                return new AdaptedFunctionReference(2, (cmo0) obj, cmo0.class, "onErrorHappened", "onErrorHappened(Ljava/lang/Throwable;)V", 4);
            case 26:
                return new AdaptedFunctionReference(2, (gcr0) obj, gcr0.class, "render", "render(Lcom/yandex/go/user_profile/settings/profile/presentation/SettingsProfileUiState;)V", 4);
            case 27:
                return new AdaptedFunctionReference(2, (kbu0) obj, kbu0.class, "render", "render(Lru/yandex/taxi/communications/stepsinstructions/model/StepsInstructionsState;)V", 4);
            case 28:
                return new AdaptedFunctionReference(2, (com.yandex.go.taxi.summary.ui.d) obj, com.yandex.go.taxi.summary.ui.d.class, "renderState", "renderState(Lcom/yandex/go/taxi/summary/models/SummaryHeaderUIState;)V", 4);
            default:
                return new AdaptedFunctionReference(2, (f6t0) obj, f6t0.class, "renderButton", "renderButton(Lru/yandex/taxi/orderbutton/summary/solid/ui/SolidSummaryButtonModel;)V", 4);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}

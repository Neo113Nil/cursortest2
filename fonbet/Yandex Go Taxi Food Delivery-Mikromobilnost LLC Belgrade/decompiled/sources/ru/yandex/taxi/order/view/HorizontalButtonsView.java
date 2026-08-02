package ru.yandex.taxi.order.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.yandex.go.taxi.order.details.v1.elements.live_location.DetailsCardLiveLocationUiState;
import com.yandex.go.taxi.order.details.v1.elements.user_requirements.d;
import com.yandex.go.taxi.order.details.v1.ui.DetailsCardListItem;
import com.yandex.go.taxi.order.models.api.objects.FreightageRideItem;
import com.yandex.go.taxi.order.models.api.response.TravelCompanionPoint;
import defpackage.bdp;
import defpackage.czg0;
import defpackage.dhs0;
import defpackage.ejp;
import defpackage.evu0;
import defpackage.f1h0;
import defpackage.f7j;
import defpackage.fxx0;
import defpackage.g18;
import defpackage.g1a0;
import defpackage.g7j;
import defpackage.gqu;
import defpackage.iqz0;
import defpackage.jl40;
import defpackage.jqz0;
import defpackage.k7x0;
import defpackage.koz0;
import defpackage.kqu;
import defpackage.kqz0;
import defpackage.kyh0;
import defpackage.m7x0;
import defpackage.mqk0;
import defpackage.mqu;
import defpackage.n0g;
import defpackage.n470;
import defpackage.n5j;
import defpackage.nac;
import defpackage.nqu;
import defpackage.nwy0;
import defpackage.o2y0;
import defpackage.o7j;
import defpackage.oqk0;
import defpackage.oqu;
import defpackage.p4j;
import defpackage.p8h0;
import defpackage.pav;
import defpackage.pho;
import defpackage.pwf0;
import defpackage.q5z;
import defpackage.qje;
import defpackage.qpo;
import defpackage.r6j;
import defpackage.reu;
import defpackage.rp31;
import defpackage.s9k0;
import defpackage.t0a0;
import defpackage.t6j;
import defpackage.tt2;
import defpackage.v6j;
import defpackage.vng;
import defpackage.vs21;
import defpackage.vsn;
import defpackage.w030;
import defpackage.w511;
import defpackage.w7y0;
import defpackage.ws21;
import defpackage.xng0;
import defpackage.xqz0;
import defpackage.xvf0;
import defpackage.yun;
import defpackage.ywf;
import defpackage.z0a0;
import defpackage.zkh0;
import defpackage.zuj0;
import defpackage.zxf0;
import defpackage.zy11;
import defpackage.zzf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.reprov.x509.CRLDistributionPointsExtension;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.costcenters.ride.OpenCostCenterListItem;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListItemSwitchComponent;
import ru.yandex.taxi.order.view.HorizontalButtonsView;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.tollroad.alert.item.TollRoadRideInfoView;
import ru.yandex.taxi.widget.dialog.AlertDialog;

@Metadata(d1 = {"\u0000\u0088\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u0090\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0091\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\f2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\f2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\f2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\f2\u0006\u0010*\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\f2\u0006\u0010*\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\f2\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\f2\u0006\u0010*\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\f2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\fH\u0016¢\u0006\u0004\b>\u0010\u0018J\u001d\u0010B\u001a\u00020\f2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020@0?H\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\bD\u0010\u000eJ\u0017\u0010E\u001a\u00020\f2\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\bE\u0010=J\u0017\u0010F\u001a\u00020\f2\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\bF\u0010=J\u000f\u0010G\u001a\u00020\fH\u0002¢\u0006\u0004\bG\u0010\u0018R\"\u0010I\u001a\u00020H8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010P\u001a\u00020O8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010W\u001a\u00020V8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010^\u001a\u00020]8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\"\u0010e\u001a\u00020d8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u0014\u0010l\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010n\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010mR\u0014\u0010p\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010r\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010qR\u0014\u0010s\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010mR\u0014\u0010t\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010qR\u0014\u0010u\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010qR\u0014\u0010w\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010y\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010qR\u0014\u0010{\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0014\u0010~\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0018\u0010\u0081\u0001\u001a\u00030\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0016\u0010\u0083\u0001\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010mR\u0017\u0010\u0084\u0001\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0018\u0010\u0087\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0019\u0010\u0089\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R+\u0010\u008e\u0001\u001a\u0016\u0012\u0005\u0012\u00030\u008c\u00010\u008b\u0001j\n\u0012\u0005\u0012\u00030\u008c\u0001`\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001¨\u0006\u0092\u0001"}, d2 = {"Lru/yandex/taxi/order/view/HorizontalButtonsView;", "Landroid/widget/LinearLayout;", "Lgqu;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lfxx0;", "component", "Lzy11;", "init", "(Lfxx0;)V", "Lkqu;", "delegate", "setUiDelegate", "(Lkqu;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "onDetachedFromWindow", "()V", "Lo7j;", "detailsCardSourceUiState", "renderSourceState", "(Lo7j;)V", "Lg7j;", "detailsCardRoutePointsUiState", "renderRoutePointsState", "(Lg7j;)V", "Ln5j;", "detailsCardDestinationUiState", "renderDestinationState", "(Ln5j;)V", "Lws21;", "userRequirementsUiState", "renderUserRequirementState", "(Lws21;)V", "Lv6j;", ClidProvider.STATE, "renderPaymentState", "(Lv6j;)V", "Loqk0;", "renderRideSupportState", "(Loqk0;)V", "Lt6j;", "renderInfoState", "(Lt6j;)V", "Ln470;", "viewModel", "setCostCenterState", "(Ln470;)V", "Lcom/yandex/go/taxi/order/details/v1/elements/live_location/DetailsCardLiveLocationUiState;", "setLiveLocationState", "(Lcom/yandex/go/taxi/order/details/v1/elements/live_location/DetailsCardLiveLocationUiState;)V", "Lcom/yandex/go/taxi/order/models/api/objects/FreightageRideItem;", "freightageRideItem", "showFreightageRideBlock", "(Lcom/yandex/go/taxi/order/models/api/objects/FreightageRideItem;)V", "hideFreightageRideBlock", "", "Lcom/yandex/go/taxi/order/models/api/response/TravelCompanionPoint;", CRLDistributionPointsExtension.POINTS, "showTravelCompanionPoints", "(Ljava/util/List;)V", "initTollRoadInfo", "setClickListenerByDescription", "showFreightageRideDialog", "cancelTravelCompanionImageTasks", "Lpav;", "imageLoader", "Lpav;", "getImageLoader", "()Lpav;", "setImageLoader", "(Lpav;)V", "Lk7x0;", "tagUrlFormatter", "Lk7x0;", "getTagUrlFormatter", "()Lk7x0;", "setTagUrlFormatter", "(Lk7x0;)V", "Landroid/app/Activity;", "activity", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "setActivity", "(Landroid/app/Activity;)V", "Lz0a0;", "paymentIconLoader", "Lz0a0;", "getPaymentIconLoader", "()Lz0a0;", "setPaymentIconLoader", "(Lz0a0;)V", "Lp4j;", "buttonsAnalytics", "Lp4j;", "getButtonsAnalytics", "()Lp4j;", "setButtonsAnalytics", "(Lp4j;)V", "Landroid/view/ViewGroup;", "rideGroup", "Landroid/view/ViewGroup;", "optionsGroup", "Lcom/yandex/go/taxi/order/details/v1/ui/DetailsCardListItem;", "source", "Lcom/yandex/go/taxi/order/details/v1/ui/DetailsCardListItem;", "destination", "routePoints", "paymentMethod", "rideSupport", "Lru/yandex/taxi/costcenters/ride/OpenCostCenterListItem;", "costCenter", "Lru/yandex/taxi/costcenters/ride/OpenCostCenterListItem;", "infoItem", "Lru/yandex/taxi/design/ListItemSwitchComponent;", "liveLocation", "Lru/yandex/taxi/design/ListItemSwitchComponent;", "Landroid/widget/FrameLayout;", "tollRoadRideInfoContainer", "Landroid/widget/FrameLayout;", "Lru/yandex/taxi/design/ListItemComponent;", "freightageRideBlock", "Lru/yandex/taxi/design/ListItemComponent;", "travelCompanionPoints", "userRequirements", "Landroid/widget/LinearLayout;", "Lcom/yandex/go/taxi/order/details/v1/elements/user_requirements/d;", "userRequirementAdapter", "Lcom/yandex/go/taxi/order/details/v1/elements/user_requirements/d;", "uiDelegate", "Lkqu;", "Ljava/util/ArrayList;", "Lg18;", "Lkotlin/collections/ArrayList;", "travelCompanionImageTasks", "Ljava/util/ArrayList;", "Companion", "nqu", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class HorizontalButtonsView extends LinearLayout implements gqu, nwy0 {
    public static final int $stable = 8;
    public static final nqu Companion = new nqu();
    private static final int SHIMMERING_DURATION = 800;
    public Activity activity;
    public p4j buttonsAnalytics;
    private final OpenCostCenterListItem costCenter;
    private final DetailsCardListItem destination;
    private final ListItemComponent freightageRideBlock;
    public pav imageLoader;
    private final DetailsCardListItem infoItem;
    private final ListItemSwitchComponent liveLocation;
    private final ViewGroup optionsGroup;
    public z0a0 paymentIconLoader;
    private final DetailsCardListItem paymentMethod;
    private final ViewGroup rideGroup;
    private final DetailsCardListItem rideSupport;
    private final ViewGroup routePoints;
    private final DetailsCardListItem source;
    public k7x0 tagUrlFormatter;
    private final FrameLayout tollRoadRideInfoContainer;
    private final ArrayList<g18> travelCompanionImageTasks;
    private final ViewGroup travelCompanionPoints;
    private kqu uiDelegate;
    private final d userRequirementAdapter;
    private final LinearLayout userRequirements;

    public HorizontalButtonsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ru.yandex.taxi.design.utils.c.q(this, zkh0.horizontal_buttons_view, true);
        int i = p8h0.route_block;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.rideGroup = (ViewGroup) ((View) rp31.d(this, i));
        this.optionsGroup = (ViewGroup) ((View) rp31.d(this, p8h0.options_block));
        this.source = (DetailsCardListItem) ((View) rp31.d(this, p8h0.source));
        this.destination = (DetailsCardListItem) ((View) rp31.d(this, p8h0.destination));
        this.routePoints = (ViewGroup) ((View) rp31.d(this, p8h0.route_points_block));
        this.paymentMethod = (DetailsCardListItem) ((View) rp31.d(this, p8h0.payment_method));
        this.rideSupport = (DetailsCardListItem) ((View) rp31.d(this, p8h0.ride_support));
        this.costCenter = (OpenCostCenterListItem) ((View) rp31.d(this, p8h0.cost_center));
        this.infoItem = (DetailsCardListItem) ((View) rp31.d(this, p8h0.details));
        this.liveLocation = (ListItemSwitchComponent) ((View) rp31.d(this, p8h0.live_location));
        this.tollRoadRideInfoContainer = (FrameLayout) ((View) rp31.d(this, p8h0.toll_road_info));
        this.freightageRideBlock = (ListItemComponent) ((View) rp31.d(this, p8h0.freightage_ride_block));
        this.travelCompanionPoints = (ViewGroup) ((View) rp31.d(this, p8h0.travel_companion_points));
        LinearLayout linearLayout = (LinearLayout) ((View) rp31.d(this, p8h0.user_requirements));
        this.userRequirements = linearLayout;
        this.userRequirementAdapter = new d(linearLayout);
        this.uiDelegate = (kqu) ((zxf0) pwf0.c(kqu.class));
        this.travelCompanionImageTasks = new ArrayList<>();
    }

    private final void cancelTravelCompanionImageTasks() {
        Iterator<T> it = this.travelCompanionImageTasks.iterator();
        while (it.hasNext()) {
            ((g18) it.next()).cancel();
        }
        this.travelCompanionImageTasks.clear();
    }

    private final void initTollRoadInfo(fxx0 component) {
        FrameLayout frameLayout = this.tollRoadRideInfoContainer;
        reu reuVar = new reu(1, this);
        component.getClass();
        xvf0 a = dhs0.a(new jqz0(dhs0.a(new w7y0(new ywf(17, component), 29)), 0));
        n0g n0gVar = (n0g) component;
        Context context = (Context) n0gVar.c.U.get();
        q5z.h(context);
        o2y0 o2y0Var = n0gVar.f.a.a;
        q5z.i(o2y0Var);
        zzf zzfVar = n0gVar.b;
        tt2 tt2Var = (tt2) zzfVar.n.get();
        q5z.h(tt2Var);
        kqz0 kqz0Var = new kqz0(tt2Var, o2y0Var);
        zuj0 zuj0Var = (zuj0) zzfVar.W.get();
        q5z.h(zuj0Var);
        ru.yandex.taxi.widget.c cVar = (ru.yandex.taxi.widget.c) zzfVar.Ze.get();
        q5z.h(cVar);
        xqz0 xqz0Var = new xqz0(kqz0Var, new ru.yandex.taxi.tollroad.alert.item.c(zuj0Var, cVar), (iqz0) a.get());
        w030 w030Var = (w030) n0gVar.d.o.get();
        q5z.h(w030Var);
        pho phoVar = (pho) zzfVar.d0.get();
        q5z.h(phoVar);
        frameLayout.addView(new TollRoadRideInfoView(context, xqz0Var, w030Var, reuVar, new koz0(phoVar)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderDestinationState$lambda$0(HorizontalButtonsView horizontalButtonsView, n5j n5jVar) {
        horizontalButtonsView.uiDelegate.m3(n5jVar.h);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderInfoState$lambda$0(t6j t6jVar) {
        ((r6j) t6jVar).e.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderPaymentState$lambda$0(HorizontalButtonsView horizontalButtonsView, v6j v6jVar, View view) {
        horizontalButtonsView.uiDelegate.m3(v6jVar.h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderRideSupportState$lambda$0(HorizontalButtonsView horizontalButtonsView, oqk0 oqk0Var) {
        horizontalButtonsView.uiDelegate.m3(((mqk0) oqk0Var).d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderRoutePointsState$lambda$0(HorizontalButtonsView horizontalButtonsView, f7j f7jVar) {
        horizontalButtonsView.uiDelegate.m3(f7jVar.g);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderSourceState$lambda$0(HorizontalButtonsView horizontalButtonsView, o7j o7jVar) {
        horizontalButtonsView.uiDelegate.m3(o7jVar.e);
        return zy11.a;
    }

    private final void setClickListenerByDescription(FreightageRideItem freightageRideItem) {
        boolean z = freightageRideItem.c.length() > 0;
        this.freightageRideBlock.setClickable(z);
        if (z) {
            this.freightageRideBlock.setOnClickListener(new vsn(11, this, freightageRideItem));
        }
        if (z) {
            return;
        }
        this.freightageRideBlock.setBackground(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setLiveLocationState$lambda$0(HorizontalButtonsView horizontalButtonsView, View view) {
        horizontalButtonsView.uiDelegate.Ub(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setLiveLocationState$lambda$1(HorizontalButtonsView horizontalButtonsView, View view) {
        horizontalButtonsView.uiDelegate.Ub(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setLiveLocationState$lambda$2(HorizontalButtonsView horizontalButtonsView, View view) {
        horizontalButtonsView.uiDelegate.gf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showFreightageRideDialog(FreightageRideItem freightageRideItem) {
        new AlertDialog(getActivity()).setTitle(freightageRideItem.a).setMessage(freightageRideItem.c).setPositiveButton(kyh0.dialog_common_ok).show();
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        setBackgroundColor(qje.t(xng0.cardDivider, getContext()));
        this.rideGroup.setBackground(vng.t(f1h0.round_section_bg, getContext()));
        this.optionsGroup.setBackground(vng.t(f1h0.round_section_bg, getContext()));
        this.costCenter.setLeadImage(czg0.ic_cost_center);
        this.userRequirements.setBackground(vng.t(f1h0.round_section_bg_bottom, getContext()));
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public final Activity getActivity() {
        Activity activity = this.activity;
        if (activity != null) {
            return activity;
        }
        return null;
    }

    public final p4j getButtonsAnalytics() {
        p4j p4jVar = this.buttonsAnalytics;
        if (p4jVar != null) {
            return p4jVar;
        }
        return null;
    }

    public final pav getImageLoader() {
        pav pavVar = this.imageLoader;
        if (pavVar != null) {
            return pavVar;
        }
        return null;
    }

    public final z0a0 getPaymentIconLoader() {
        z0a0 z0a0Var = this.paymentIconLoader;
        if (z0a0Var != null) {
            return z0a0Var;
        }
        return null;
    }

    public final k7x0 getTagUrlFormatter() {
        k7x0 k7x0Var = this.tagUrlFormatter;
        if (k7x0Var != null) {
            return k7x0Var;
        }
        return null;
    }

    @Override // defpackage.gqu
    public void hideFreightageRideBlock() {
        this.freightageRideBlock.setOnClickListener(null);
        this.freightageRideBlock.setVisibility(8);
    }

    public final void init(fxx0 component) {
        n0g n0gVar = (n0g) component;
        zzf zzfVar = n0gVar.b;
        this.imageLoader = (pav) zzfVar.p3.get();
        this.tagUrlFormatter = (k7x0) zzfVar.M3.get();
        this.activity = n0gVar.c.w;
        this.paymentIconLoader = (z0a0) zzfVar.fi.get();
        this.buttonsAnalytics = (p4j) n0gVar.h.get();
        initTollRoadInfo(component);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cancelTravelCompanionImageTasks();
    }

    @Override // defpackage.gqu
    public void renderDestinationState(n5j detailsCardDestinationUiState) {
        boolean z = detailsCardDestinationUiState.e;
        this.destination.setVisibility(z ? 0 : 8);
        if (z) {
            boolean z2 = detailsCardDestinationUiState.f;
            this.destination.setEnabled(!z2);
            DetailsCardListItem detailsCardListItem = this.destination;
            if (z2) {
                detailsCardListItem.startProgressAnimation(800);
            } else {
                detailsCardListItem.stopProgressAnimation();
            }
            this.destination.setTitle(detailsCardDestinationUiState.a);
            this.destination.setSubtitle(detailsCardDestinationUiState.b);
            this.destination.setLeadImage(detailsCardDestinationUiState.c.getDrawable());
            this.destination.applyStyle(detailsCardDestinationUiState.d);
            this.destination.setClickActionListener(new bdp(28, this, detailsCardDestinationUiState));
        }
    }

    @Override // defpackage.gqu
    public void renderInfoState(t6j state) {
        boolean z = state instanceof r6j;
        DetailsCardListItem detailsCardListItem = this.infoItem;
        if (!z) {
            detailsCardListItem.setVisibility(8);
            return;
        }
        r6j r6jVar = (r6j) state;
        detailsCardListItem.setTitle(r6jVar.a);
        this.infoItem.setSubtitle(r6jVar.b);
        this.infoItem.setLeadImage(r6jVar.d);
        this.infoItem.applyStyle(r6jVar.c);
        this.infoItem.setDebounceClickListener(new ejp(24, state));
        this.infoItem.setVisibility(0);
    }

    @Override // defpackage.gqu
    public void renderPaymentState(v6j state) {
        DetailsCardListItem detailsCardListItem = this.paymentMethod;
        boolean z = state.a;
        t0a0 t0a0Var = state.f;
        detailsCardListItem.setVisibility(z ? 0 : 8);
        this.paymentMethod.setTitle(state.d);
        this.paymentMethod.setSubtitle(state.e);
        if (t0a0Var != null) {
            ((g1a0) getPaymentIconLoader()).b(this.paymentMethod.getLeadImageView(), t0a0Var);
        }
        boolean z2 = state.c;
        DetailsCardListItem detailsCardListItem2 = this.paymentMethod;
        if (z2) {
            detailsCardListItem2.startProgressAnimation(800);
            this.paymentMethod.setOnClickListener(null);
            return;
        }
        detailsCardListItem2.stopProgressAnimation();
        this.paymentMethod.applyStyle(state.g);
        boolean z3 = state.b;
        DetailsCardListItem detailsCardListItem3 = this.paymentMethod;
        if (z3) {
            detailsCardListItem3.setOnClickListener(new vsn(10, this, state));
        } else {
            detailsCardListItem3.setOnClickListener(null);
        }
    }

    @Override // defpackage.gqu
    public void renderRideSupportState(oqk0 state) {
        boolean z = state instanceof mqk0;
        DetailsCardListItem detailsCardListItem = this.rideSupport;
        if (!z) {
            detailsCardListItem.setVisibility(8);
            return;
        }
        mqk0 mqk0Var = (mqk0) state;
        detailsCardListItem.setTitle(mqk0Var.a);
        this.rideSupport.setLeadImage(mqk0Var.c);
        this.rideSupport.applyStyle(mqk0Var.b);
        this.rideSupport.setDebounceClickListener(new qpo(27, this, state));
        this.rideSupport.setVisibility(0);
        getButtonsAnalytics().b("SupportSuggests");
    }

    @Override // defpackage.gqu
    public void renderRoutePointsState(g7j detailsCardRoutePointsUiState) {
        this.routePoints.removeAllViews();
        for (f7j f7jVar : detailsCardRoutePointsUiState.a) {
            DetailsCardListItem detailsCardListItem = new DetailsCardListItem(getContext(), null, 0, 6, null);
            boolean z = f7jVar.e;
            detailsCardListItem.setEnabled(!z);
            if (z) {
                detailsCardListItem.startProgressAnimation(800);
            } else {
                detailsCardListItem.stopProgressAnimation();
            }
            detailsCardListItem.setTitle(f7jVar.a);
            detailsCardListItem.setSubtitle(f7jVar.b);
            detailsCardListItem.setLeadImage(f7jVar.c.getDrawable());
            detailsCardListItem.applyStyle(f7jVar.d);
            detailsCardListItem.setClickActionListener(new bdp(29, this, f7jVar));
            this.routePoints.addView(detailsCardListItem);
        }
    }

    @Override // defpackage.gqu
    public void renderSourceState(o7j detailsCardSourceUiState) {
        boolean z = detailsCardSourceUiState.f;
        int i = 0;
        this.source.setVisibility(z ? 0 : 8);
        if (z) {
            this.source.setTitle(detailsCardSourceUiState.a);
            this.source.setSubtitle(detailsCardSourceUiState.b);
            this.source.setLeadImage(detailsCardSourceUiState.c.getDrawable());
            this.source.applyStyle(detailsCardSourceUiState.d);
            this.source.setClickActionListener(new mqu(i, this, detailsCardSourceUiState));
            boolean z2 = detailsCardSourceUiState.g;
            DetailsCardListItem detailsCardListItem = this.source;
            if (z2) {
                detailsCardListItem.startProgressAnimation();
                this.source.setClickable(false);
            } else {
                detailsCardListItem.stopProgressAnimation();
                this.source.setClickable(true);
            }
            if (jl40.l(detailsCardSourceUiState.e, s9k0.a)) {
                this.source.setClickable(false);
            }
        }
    }

    @Override // defpackage.gqu
    public void renderUserRequirementState(ws21 userRequirementsUiState) {
        boolean z = userRequirementsUiState instanceof yun;
        LinearLayout linearLayout = this.userRequirements;
        if (z) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
            this.userRequirementAdapter.b(((vs21) userRequirementsUiState).a);
        }
    }

    public final void setActivity(Activity activity) {
        this.activity = activity;
    }

    public final void setButtonsAnalytics(p4j p4jVar) {
        this.buttonsAnalytics = p4jVar;
    }

    @Override // defpackage.gqu
    public void setCostCenterState(n470 viewModel) {
        this.costCenter.setState(viewModel);
    }

    public final void setImageLoader(pav pavVar) {
        this.imageLoader = pavVar;
    }

    @Override // defpackage.gqu
    public void setLiveLocationState(DetailsCardLiveLocationUiState state) {
        int i = oqu.a[state.ordinal()];
        if (i == 1) {
            this.liveLocation.setVisibility(0);
            this.liveLocation.setCheckedWithAnimation(true);
            this.liveLocation.setLeadImage(f1h0.ic_order_card_live_location);
            this.liveLocation.setTitleTextColor(qje.t(xng0.textMain, getContext()));
            final int i2 = 0;
            this.liveLocation.setOnClickListener(new View.OnClickListener(this) { // from class: lqu
                public final /* synthetic */ HorizontalButtonsView b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i3 = i2;
                    HorizontalButtonsView horizontalButtonsView = this.b;
                    switch (i3) {
                        case 0:
                            HorizontalButtonsView.setLiveLocationState$lambda$0(horizontalButtonsView, view);
                            break;
                        case 1:
                            HorizontalButtonsView.setLiveLocationState$lambda$1(horizontalButtonsView, view);
                            break;
                        default:
                            HorizontalButtonsView.setLiveLocationState$lambda$2(horizontalButtonsView, view);
                            break;
                    }
                }
            });
            return;
        }
        if (i == 2) {
            this.liveLocation.setVisibility(0);
            this.liveLocation.setCheckedWithAnimation(false);
            this.liveLocation.setLeadImage(f1h0.ic_order_card_live_location);
            this.liveLocation.setTitleTextColor(qje.t(xng0.textMain, getContext()));
            final int i3 = 1;
            this.liveLocation.setOnClickListener(new View.OnClickListener(this) { // from class: lqu
                public final /* synthetic */ HorizontalButtonsView b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i32 = i3;
                    HorizontalButtonsView horizontalButtonsView = this.b;
                    switch (i32) {
                        case 0:
                            HorizontalButtonsView.setLiveLocationState$lambda$0(horizontalButtonsView, view);
                            break;
                        case 1:
                            HorizontalButtonsView.setLiveLocationState$lambda$1(horizontalButtonsView, view);
                            break;
                        default:
                            HorizontalButtonsView.setLiveLocationState$lambda$2(horizontalButtonsView, view);
                            break;
                    }
                }
            });
            return;
        }
        if (i != 3) {
            if (i != 4) {
                w511.b();
                return;
            } else {
                this.liveLocation.setVisibility(8);
                this.liveLocation.setOnClickListener(null);
                return;
            }
        }
        this.liveLocation.setVisibility(0);
        this.liveLocation.setCheckedWithAnimation(false);
        this.liveLocation.setLeadImage(f1h0.ic_order_card_live_location_unavailable);
        this.liveLocation.setTitleTextColor(qje.t(xng0.textMinor, getContext()));
        final int i4 = 2;
        this.liveLocation.setOnClickListener(new View.OnClickListener(this) { // from class: lqu
            public final /* synthetic */ HorizontalButtonsView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i4;
                HorizontalButtonsView horizontalButtonsView = this.b;
                switch (i32) {
                    case 0:
                        HorizontalButtonsView.setLiveLocationState$lambda$0(horizontalButtonsView, view);
                        break;
                    case 1:
                        HorizontalButtonsView.setLiveLocationState$lambda$1(horizontalButtonsView, view);
                        break;
                    default:
                        HorizontalButtonsView.setLiveLocationState$lambda$2(horizontalButtonsView, view);
                        break;
                }
            }
        });
    }

    public final void setPaymentIconLoader(z0a0 z0a0Var) {
        this.paymentIconLoader = z0a0Var;
    }

    public final void setTagUrlFormatter(k7x0 k7x0Var) {
        this.tagUrlFormatter = k7x0Var;
    }

    public final void setUiDelegate(kqu delegate) {
        if (delegate == null) {
            delegate = (kqu) ((zxf0) pwf0.c(kqu.class));
        }
        this.uiDelegate = delegate;
    }

    @Override // defpackage.gqu
    public void showFreightageRideBlock(FreightageRideItem freightageRideItem) {
        this.freightageRideBlock.setTitle(freightageRideItem.a);
        setClickListenerByDescription(freightageRideItem);
        String str = freightageRideItem.b;
        if (str != null) {
            ((nac) getImageLoader().a(this.freightageRideBlock.getLeadImageView())).c(((m7x0) getTagUrlFormatter()).a(str));
        }
        this.freightageRideBlock.setVisibility(0);
    }

    @Override // defpackage.gqu
    public void showTravelCompanionPoints(List<TravelCompanionPoint> points) {
        cancelTravelCompanionImageTasks();
        this.travelCompanionPoints.removeAllViews();
        for (TravelCompanionPoint travelCompanionPoint : points) {
            String str = travelCompanionPoint.a;
            String str2 = travelCompanionPoint.c;
            if (str != null && !evu0.J(str) && str2 != null && !evu0.J(str2)) {
                ListItemComponent listItemComponent = new ListItemComponent(getContext(), null, 0, 6, null);
                listItemComponent.setTitle(travelCompanionPoint.a);
                listItemComponent.setSubtitle(travelCompanionPoint.b);
                this.travelCompanionImageTasks.add(((nac) getImageLoader().a(listItemComponent.getLeadImageView())).c(((m7x0) getTagUrlFormatter()).a(str2)));
                this.travelCompanionPoints.addView(listItemComponent);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HorizontalButtonsView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ HorizontalButtonsView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}

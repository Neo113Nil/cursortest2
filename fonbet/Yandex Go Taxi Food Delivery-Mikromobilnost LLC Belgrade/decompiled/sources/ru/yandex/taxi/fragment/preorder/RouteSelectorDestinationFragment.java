package ru.yandex.taxi.fragment.preorder;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.address.models.Address;
import com.yandex.go.pickuppoints.impl.ClarifyPointsScreenStrategyConfigurationExperiment;
import com.yandex.go.pickuppoints.impl.l;
import com.yandex.go.zone.repository.o;
import defpackage.a3v;
import defpackage.a9l0;
import defpackage.a9y0;
import defpackage.ab20;
import defpackage.ah00;
import defpackage.atd0;
import defpackage.awi;
import defpackage.ay0;
import defpackage.b1;
import defpackage.b7l0;
import defpackage.b9l0;
import defpackage.brb0;
import defpackage.bwi;
import defpackage.c0g;
import defpackage.c9y0;
import defpackage.cma1;
import defpackage.crb0;
import defpackage.cwi;
import defpackage.d0g;
import defpackage.d7g0;
import defpackage.df4;
import defpackage.drb0;
import defpackage.e0g;
import defpackage.eai;
import defpackage.el00;
import defpackage.eov0;
import defpackage.et00;
import defpackage.ezi;
import defpackage.f7r;
import defpackage.fif;
import defpackage.fu00;
import defpackage.g18;
import defpackage.gh00;
import defpackage.hbp0;
import defpackage.hoi0;
import defpackage.hpr0;
import defpackage.hyb;
import defpackage.i8y0;
import defpackage.iqz0;
import defpackage.j741;
import defpackage.jl40;
import defpackage.jst;
import defpackage.k9l0;
import defpackage.kr0;
import defpackage.l56;
import defpackage.l9l0;
import defpackage.leh;
import defpackage.lr00;
import defpackage.lx4;
import defpackage.o8k0;
import defpackage.oep0;
import defpackage.opz0;
import defpackage.p2c0;
import defpackage.pho;
import defpackage.po21;
import defpackage.pv0;
import defpackage.qq60;
import defpackage.qtb1;
import defpackage.qx0;
import defpackage.qx60;
import defpackage.rjt0;
import defpackage.rni0;
import defpackage.rqo;
import defpackage.s31;
import defpackage.s6v;
import defpackage.sgu0;
import defpackage.si00;
import defpackage.sls;
import defpackage.t31;
import defpackage.t3g;
import defpackage.t8l0;
import defpackage.t9l0;
import defpackage.tje;
import defpackage.tt2;
import defpackage.tx0;
import defpackage.u0j;
import defpackage.udh0;
import defpackage.uo21;
import defpackage.v7j0;
import defpackage.v9l0;
import defpackage.vfc0;
import defpackage.vtb0;
import defpackage.w6r;
import defpackage.w8l0;
import defpackage.wpb0;
import defpackage.x31;
import defpackage.x8l0;
import defpackage.x9l0;
import defpackage.xi00;
import defpackage.xw31;
import defpackage.y0j;
import defpackage.y4;
import defpackage.y50;
import defpackage.y9x0;
import defpackage.ysd0;
import defpackage.yzi;
import defpackage.z8l0;
import defpackage.z9x0;
import defpackage.zuj0;
import defpackage.zy11;
import defpackage.zzf;
import defpackage.zzs;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.fragment.preorder.RouteSelectorDestinationFragment;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.routeselector.overlay.RouteSelectorOverlay$resume$$inlined$safeCollectIn$1;
import ru.yandex.taxi.routeselector.overlay.RouteSelectorOverlay$resume$$inlined$safeCollectIn$2;
import ru.yandex.taxi.routeselector.view.RouteSelectorModalView;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

@Metadata(d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 h2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001iB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0005J\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0005J!\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0019\u0010\u0018J\r\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u0005J\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u0005J\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u0005J\u000f\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u0005J!\u0010\"\u001a\u00020\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\bH\u0014¢\u0006\u0004\b$\u0010\u0005J\u000f\u0010%\u001a\u00020\bH\u0014¢\u0006\u0004\b%\u0010\u0005J\u000f\u0010&\u001a\u00020\u0016H\u0016¢\u0006\u0004\b&\u0010\u0018J\u000f\u0010'\u001a\u00020\bH\u0014¢\u0006\u0004\b'\u0010\u0005J\u000f\u0010(\u001a\u00020\bH\u0014¢\u0006\u0004\b(\u0010\u0005J\u000f\u0010)\u001a\u00020\bH\u0014¢\u0006\u0004\b)\u0010\u0005J\u000f\u0010+\u001a\u00020*H\u0014¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\b2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0016H\u0014¢\u0006\u0004\b1\u0010\u0018J\u000f\u00102\u001a\u00020\u0016H\u0014¢\u0006\u0004\b2\u0010\u0018J\u000f\u00103\u001a\u00020\u0016H\u0016¢\u0006\u0004\b3\u0010\u0018J\u000f\u00104\u001a\u00020\u0016H\u0014¢\u0006\u0004\b4\u0010\u0018J\u000f\u00106\u001a\u000205H\u0002¢\u0006\u0004\b6\u00107R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010E\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010K\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010N\u001a\u0004\u0018\u00010M8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010Q\u001a\u0004\u0018\u00010P8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010T\u001a\u0004\u0018\u00010S8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010W\u001a\u0004\u0018\u00010V8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010Z\u001a\u0004\u0018\u00010Y8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010]\u001a\u0004\u0018\u00010\\8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010`\u001a\u0004\u0018\u00010_8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010c\u001a\u0004\u0018\u00010b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0018\u0010f\u001a\u0004\u0018\u00010e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bf\u0010g¨\u0006j"}, d2 = {"Lru/yandex/taxi/fragment/preorder/RouteSelectorDestinationFragment;", "Lru/yandex/taxi/fragment/preorder/AbstractAddressMapPickerFragment;", "Le0g;", "Ldf4;", "<init>", "()V", "Landroid/content/Context;", "context", "Lzy11;", "onAttach", "(Landroid/content/Context;)V", "onDetach", "Lru/yandex/taxi/search/address/view/PointType;", "addressPointType", "()Lru/yandex/taxi/search/address/view/PointType;", "onStart", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "isShowTopEndButtons", "()Z", "isShowBlockedZoneBeforeUpdate", "setupInitialCameraPosition", "onResume", "onPause", "onDestroyView", "Lzzs;", "geoPoint", "Lqx0;", "callback", "onMapTapped", "(Lzzs;Lqx0;)Z", "bindViewsInFields", "unbindViewsInFields", "onBackPressed", "requestFocusRect", "hideControls", "showControls", "Ll56;", "blockedZonesHandler", "()Ll56;", "Lpv0;", "addressInfo", "addressPicked", "(Lpv0;)V", "hasPickupPointsOnMap", "shouldDrawPickupPoints", "isClarifyMode", "canHandlePoiTap", "Lru/yandex/taxi/routeselector/view/RouteSelectorModalView$a;", "createModalViewDelegate", "()Lru/yandex/taxi/routeselector/view/RouteSelectorModalView$a;", "Lb9l0;", ClidProvider.STATE, "Lb9l0;", "Lru/yandex/taxi/routeselector/view/RouteSelectorModalView;", "routeSelectorModalView", "Lru/yandex/taxi/routeselector/view/RouteSelectorModalView;", "Landroid/view/ViewGroup;", "container", "Landroid/view/ViewGroup;", "Ly0j;", "referralGiftHolder", "Ly0j;", "Lg18;", "serviceModeSubscription", "Lg18;", "Luo21;", "userLocationOverlay", "Luo21;", "Lt9l0;", "routeSelectorOverlay", "Lt9l0;", "Lyzi;", "destinationPickerRouter", "Lyzi;", "Lrni0;", "referralGiftFactory", "Lrni0;", "Ly9x0;", "tappableController", "Ly9x0;", "Lqx60;", "onBackPressedDispatcher", "Lqx60;", "Ll9l0;", "routeSelectorModalViewFactory", "Ll9l0;", "Lfif;", "currentZoneModeRepository", "Lfif;", "Ldrb0;", "pickupPointsZoomLevelRepository", "Ldrb0;", "Lbrb0;", "pickupPointsWrapCameraPositionInteractor", "Lbrb0;", "Lawi;", "deliveryZoneModeInterceptor", "Lawi;", "Companion", "z8l0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RouteSelectorDestinationFragment extends AbstractAddressMapPickerFragment<e0g> implements df4 {
    public static final z8l0 Companion = new z8l0();
    private ViewGroup container;
    public fif currentZoneModeRepository;
    public awi deliveryZoneModeInterceptor;
    public yzi destinationPickerRouter;
    public qx60 onBackPressedDispatcher;
    public brb0 pickupPointsWrapCameraPositionInteractor;
    public drb0 pickupPointsZoomLevelRepository;
    public rni0 referralGiftFactory;
    private y0j referralGiftHolder;
    private RouteSelectorModalView routeSelectorModalView;
    public l9l0 routeSelectorModalViewFactory;
    public t9l0 routeSelectorOverlay;
    private g18 serviceModeSubscription;
    private b9l0 state;
    public y9x0 tappableController;
    public uo21 userLocationOverlay;

    private final RouteSelectorModalView.a createModalViewDelegate() {
        return new a9l0(this);
    }

    public static final RouteSelectorDestinationFragment newInstance(b9l0 b9l0Var) {
        Companion.getClass();
        RouteSelectorDestinationFragment routeSelectorDestinationFragment = new RouteSelectorDestinationFragment();
        routeSelectorDestinationFragment.state = b9l0Var;
        return routeSelectorDestinationFragment;
    }

    private static final g18 onAttach$lambda$0$0(RouteSelectorDestinationFragment routeSelectorDestinationFragment, String str) {
        fif fifVar = routeSelectorDestinationFragment.currentZoneModeRepository;
        return fifVar != null ? fifVar.c(new eai(str, 1)) : new w8l0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onAttach$lambda$0$0$0(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttach$lambda$0$0$1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onAttach$lambda$2(RouteSelectorDestinationFragment routeSelectorDestinationFragment, zzs zzsVar) {
        AddressMapFragment.moveToPoint$default(routeSelectorDestinationFragment, zzsVar, null, 2, null);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onAttach$lambda$3(RouteSelectorDestinationFragment routeSelectorDestinationFragment, zzs zzsVar) {
        routeSelectorDestinationFragment.onMapTapped(zzsVar, new d7g0(14));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onAttach$lambda$3$0() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onAttach$lambda$6() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupInitialCameraPosition$lambda$0(RouteSelectorDestinationFragment routeSelectorDestinationFragment, zzs zzsVar) {
        Float f;
        brb0 brb0Var = routeSelectorDestinationFragment.pickupPointsWrapCameraPositionInteractor;
        if (brb0Var != null) {
            List b = routeSelectorDestinationFragment.getPickupPointsController().a.o.b();
            crb0 crb0Var = (crb0) brb0Var;
            ClarifyPointsScreenStrategyConfigurationExperiment.PointConfigurationDto pointConfigurationDto = crb0Var.a.b;
            crb0Var.a(zzsVar, b, (pointConfigurationDto == null || (f = pointConfigurationDto.b) == null) ? 13.0f : f.floatValue(), null);
        }
        return zy11.a;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public void addressPicked(pv0 addressInfo) {
        setAddressInfo(addressInfo);
        changeAddressInfo(addressInfo);
        si00 si00Var = (si00) this.callback;
        if (si00Var != null) {
            si00Var.j(addressInfo);
        }
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public PointType addressPointType() {
        return PointType.DESTINATION;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AbstractAddressMapPickerFragment, ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public void bindViewsInFields() {
        super.bindViewsInFields();
        this.container = (ViewGroup) nonNullViewById(udh0.modal_view_container);
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public l56 blockedZonesHandler() {
        b9l0 b9l0Var = this.state;
        if (b9l0Var == null) {
            b9l0Var = null;
        }
        l56 l56Var = b9l0Var.b;
        Objects.requireNonNull(l56Var);
        return l56Var;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public boolean canHandlePoiTap() {
        if (this.tappableController != null) {
            return !((com.yandex.go.tappable_poi.experiments.f) ((z9x0) r0).c).a.c.isEmpty();
        }
        return false;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public boolean hasPickupPointsOnMap() {
        return true;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public void hideControls() {
        RouteSelectorModalView routeSelectorModalView = this.routeSelectorModalView;
        if (routeSelectorModalView != null) {
            cma1.M(routeSelectorModalView);
        }
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public boolean isClarifyMode() {
        return getMode() instanceof ezi;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public boolean isShowBlockedZoneBeforeUpdate() {
        return true;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public boolean isShowTopEndButtons() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.yandex.taxi.fragment.MapFragment, ru.yandex.taxi.fragment.YandexTaxiFragment, ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        SourcePicker sourcePicker;
        g18 g18Var;
        super.onAttach(context);
        e0g e0gVar = (e0g) injector();
        zzf zzfVar = e0gVar.b;
        this.receiverProvider = zzfVar.Yp;
        c0g c0gVar = e0gVar.c;
        setPin((com.yandex.go.pin.api.a) c0gVar.Ub.get());
        setAnalyticsManager((lx4) zzfVar.Y.get());
        setUserLocationInteractor((po21) zzfVar.Y1.get());
        setMapController((ah00) c0gVar.Vb.get());
        setActivityRouter((y50) c0gVar.n0.get());
        setPositionAlertRouterFactory(c0gVar.cp);
        setZoomRepository((fu00) c0gVar.ap.get());
        setObserverForCurrentTariff((qq60) zzfVar.gr.get());
        setPickupPointsControllerFactory((t31) e0gVar.g.a);
        setAppDispatchers((tt2) zzfVar.n.get());
        setPinStyleProvider(c0gVar.T5());
        setPointAddressDecoder((atd0) c0gVar.Ac.get());
        setFocusCoordinator((a3v) c0gVar.Wb.get());
        setMetricaActionInteractor(e0gVar.g());
        setMetricaActionStateHolder((ab20) zzfVar.hr.get());
        setRequestPermissionInteractor((v7j0) c0gVar.L0.get());
        setPinAlertAnimationInteractor((vtb0) c0gVar.Bn.get());
        setIdleIconRepository(new s6v());
        setPinStyleMapper(c0gVar.G2());
        setAddressClarificationInteractor((kr0) c0gVar.Ec.get());
        setMassTransitStopsInteractor(c0gVar.z5());
        setResourcesProxy((zuj0) zzfVar.W.get());
        setTaxiPanoramaInteractor(c0gVar.Y());
        setTaxiPanoramaLogger(new i8y0());
        setTaxiPanoramaExperimentRepository(c0gVar.a3());
        setFinalSuggestScreenRepository((w6r) c0gVar.vc.get());
        setTaxiPanoramaTooltipRepository((c9y0) c0gVar.so.get());
        setTaxiPanoramaRouter((a9y0) c0gVar.Ko.get());
        setScreenStackNavigator((oep0) c0gVar.T.get());
        setSharedPinDataHolder((hpr0) c0gVar.Tb.get());
        setMapHost((xi00) c0gVar.Rb.get());
        setAddressMapInteractor(e0gVar.a());
        setPinWithStanExperimentRepository((p2c0) zzfVar.ar.get());
        setDebouncingMapListenerDelegate(e0gVar.d());
        setBlockedZoneControllerFactory((ay0) e0gVar.i.a);
        setAddressMapFragmentAddressControllerFactory((tx0) e0gVar.j.a);
        setPointActionRouterConsumer((ysd0) c0gVar.wd.get());
        setFinalizeAddressByGravityRouterFactory((f7r) c0gVar.Nv.a);
        setAddressMapPresenterFactory((x31) e0gVar.k.a);
        this.userLocationOverlay = c0gVar.D6();
        this.routeSelectorOverlay = new t9l0(zzfVar.A1(), (ru.yandex.taxi.sdc.route.presentation.f) e0gVar.t.get(), (j741) c0gVar.Ae.get(), (Context) c0gVar.U.get(), (ah00) c0gVar.Vb.get(), zzfVar.W0(), (o) zzfVar.q2.get(), (el00) zzfVar.Dc.get(), e0gVar.a, c0gVar.Z5(), (leh) zzfVar.um.get(), (sgu0) c0gVar.lh.get(), (lr00) c0gVar.oh.get(), (tt2) zzfVar.n.get(), (et00) c0gVar.ph.get(), (rqo) zzfVar.C.get(), (opz0) zzfVar.Lb.get(), (iqz0) c0gVar.Ru.get(), (rjt0) zzfVar.Ch.get());
        this.destinationPickerRouter = new yzi(e0gVar.h(), zzfVar.A1(), zzfVar.n1());
        d0g d0gVar = c0gVar.a;
        this.referralGiftFactory = (rni0) d0gVar.o5.get();
        this.tappableController = (y9x0) c0gVar.sv.get();
        this.onBackPressedDispatcher = (qx60) c0gVar.ep.get();
        this.routeSelectorModalViewFactory = new l9l0(new hyb(new b1((pho) zzfVar.d0.get())), new b1((pho) zzfVar.d0.get()), c0gVar);
        this.currentZoneModeRepository = (fif) zzfVar.y8.get();
        this.pickupPointsZoomLevelRepository = (drb0) zzfVar.Ho.get();
        this.pickupPointsWrapCameraPositionInteractor = new crb0((l) d0gVar.a.Ho.get(), (ah00) d0gVar.b.Vb.get());
        awi awiVar = (awi) c0gVar.Ph.get();
        this.deliveryZoneModeInterceptor = awiVar;
        b9l0 b9l0Var = this.state;
        RouteSelectorModalView routeSelectorModalView = null;
        if (b9l0Var == null) {
            b9l0Var = null;
        }
        String str = b9l0Var.h;
        final int i = 0;
        if (str != null) {
            if (awiVar != null) {
                cwi cwiVar = (cwi) awiVar;
                if (str.equals(TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY)) {
                    cwiVar.b();
                    g18Var = new bwi(i, cwiVar);
                } else {
                    g18Var = onAttach$lambda$0$0(this, str);
                }
            } else {
                g18Var = null;
            }
            this.serviceModeSubscription = g18Var;
        }
        yzi yziVar = this.destinationPickerRouter;
        if (yziVar != null) {
            yziVar.c = this;
            zzs initialPoint = getInitialPoint();
            Iterator it = yziVar.b.c().b.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                } else if (jl40.l(((Address) it.next()).B(), initialPoint)) {
                    break;
                } else {
                    i2++;
                }
            }
            yziVar.d = i2;
        }
        l9l0 l9l0Var = this.routeSelectorModalViewFactory;
        int i3 = 3;
        final int i4 = 1;
        if (l9l0Var != null) {
            RouteSelectorModalView.a createModalViewDelegate = createModalViewDelegate();
            AddressResolveRepository addressResolveRepository = getAddressResolveRepository();
            b9l0 b9l0Var2 = this.state;
            b9l0 b9l0Var3 = b9l0Var2 != null ? b9l0Var2 : null;
            yzi yziVar2 = this.destinationPickerRouter;
            int i5 = yziVar2 != null ? yziVar2.d : 0;
            ModalViewOrigin modalViewOrigin = b9l0Var3.a;
            u0j u0jVar = b9l0Var3.d;
            int i6 = k9l0.a[modalViewOrigin.ordinal()];
            if (i6 == 1 || i6 == 2) {
                sourcePicker = SourcePicker.B_FROM_HOME;
            } else if (i6 == 3) {
                sourcePicker = SourcePicker.B_FROM_SUMMARY;
            } else if (i6 != 4) {
                jst.e.k(new IllegalArgumentException(), "Unknown modal view origin");
                sourcePicker = SourcePicker.NONE;
            } else {
                sourcePicker = SourcePicker.B_FROM_ORDER;
            }
            v9l0 v9l0Var = new v9l0(createModalViewDelegate);
            v9l0Var.b = sourcePicker;
            String str2 = b9l0Var3.i;
            v9l0Var.d = 0;
            v9l0Var.e = str2;
            v9l0Var.g = b9l0Var3.c;
            v9l0Var.k = b9l0Var3.f;
            boolean z = u0jVar instanceof ezi;
            v9l0Var.h = z;
            v9l0Var.l = i5;
            v9l0Var.f = b9l0Var3.g;
            v9l0Var.o = b9l0Var3.e;
            x9l0 x9l0Var = new x9l0(v9l0Var);
            t8l0 eov0Var = z ? l9l0Var.a : new eov0(l9l0Var.b, b9l0Var3.a);
            c0g c0gVar2 = l9l0Var.c;
            addressResolveRepository.getClass();
            routeSelectorModalView = new t3g(c0gVar2, x9l0Var, eov0Var, addressResolveRepository).a();
            routeSelectorModalView.setDismissOnBackPressed(true);
        }
        this.routeSelectorModalView = routeSelectorModalView;
        y9x0 y9x0Var = this.tappableController;
        if (y9x0Var != null) {
            ((z9x0) y9x0Var).a(qtb1.j(new x8l0(this, i), new x8l0(this, i4), new sls(this) { // from class: y8l0
                public final /* synthetic */ RouteSelectorDestinationFragment b;

                {
                    this.b = this;
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    PointType addressPointType;
                    boolean isClarifyMode;
                    int i7 = i;
                    RouteSelectorDestinationFragment routeSelectorDestinationFragment = this.b;
                    switch (i7) {
                        case 0:
                            addressPointType = routeSelectorDestinationFragment.addressPointType();
                            return addressPointType;
                        default:
                            isClarifyMode = routeSelectorDestinationFragment.isClarifyMode();
                            return Boolean.valueOf(isClarifyMode);
                    }
                }
            }, new sls(this) { // from class: y8l0
                public final /* synthetic */ RouteSelectorDestinationFragment b;

                {
                    this.b = this;
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    PointType addressPointType;
                    boolean isClarifyMode;
                    int i7 = i4;
                    RouteSelectorDestinationFragment routeSelectorDestinationFragment = this.b;
                    switch (i7) {
                        case 0:
                            addressPointType = routeSelectorDestinationFragment.addressPointType();
                            return addressPointType;
                        default:
                            isClarifyMode = routeSelectorDestinationFragment.isClarifyMode();
                            return Boolean.valueOf(isClarifyMode);
                    }
                }
            }, new b7l0(i3), null, null, 224));
        }
    }

    @Override // defpackage.df4
    public boolean onBackPressed() {
        si00 si00Var = (si00) this.callback;
        if (si00Var == null) {
            return false;
        }
        si00Var.d();
        return false;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment, ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        uo21 uo21Var = this.userLocationOverlay;
        if (uo21Var != null) {
            uo21Var.detach();
        }
        t9l0 t9l0Var = this.routeSelectorOverlay;
        if (t9l0Var != null) {
            t9l0Var.detach();
        }
        yzi yziVar = this.destinationPickerRouter;
        if (yziVar != null) {
            yziVar.c = null;
        }
        y9x0 y9x0Var = this.tappableController;
        if (y9x0Var != null) {
            ((z9x0) y9x0Var).b();
        }
    }

    @Override // ru.yandex.taxi.fragment.MapFragment, ru.yandex.taxi.fragment.YandexTaxiFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        g18 g18Var = this.serviceModeSubscription;
        if (g18Var != null) {
            g18Var.cancel();
        }
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public boolean onMapTapped(zzs geoPoint, qx0 callback) {
        RouteSelectorModalView routeSelectorModalView;
        if (geoPoint != null && hasPickupPointsOnMap() && (routeSelectorModalView = this.routeSelectorModalView) != null) {
            s31 pickupPointsController = getPickupPointsController();
            wpb0 h = pickupPointsController.a.h(pickupPointsController.f, geoPoint, true);
            if (h != null) {
                routeSelectorModalView.onPickupPointTapped(h);
            }
        }
        return super.onMapTapped(geoPoint, callback);
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment, ru.yandex.taxi.fragment.YandexTaxiFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        t9l0 t9l0Var = this.routeSelectorOverlay;
        if (t9l0Var != null) {
            t9l0Var.a0.b();
            ((ru.yandex.taxi.map.c) t9l0Var.Z).a();
        }
        y0j y0jVar = this.referralGiftHolder;
        if (y0jVar != null) {
            com.yandex.go.promocodes.referral.impl.ui.b bVar = (com.yandex.go.promocodes.referral.impl.ui.b) ((vfc0) y0jVar).b;
            View view = bVar.m;
            if (view != null) {
                xw31.a(view);
            }
            bVar.g = null;
            this.referralGiftHolder = null;
        }
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment, ru.yandex.taxi.fragment.YandexTaxiFragment, ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        t9l0 t9l0Var = this.routeSelectorOverlay;
        vfc0 vfc0Var = null;
        if (t9l0Var != null) {
            hbp0 hbp0Var = t9l0Var.a0;
            hbp0Var.a();
            t9l0Var.W.c(hbp0Var);
            tje.N(hbp0Var, null, null, new RouteSelectorOverlay$resume$$inlined$safeCollectIn$1(new ru.yandex.taxi.routeselector.overlay.b(t9l0Var.Ng(), t9l0Var), null, t9l0Var), 3);
            tje.N(hbp0Var, null, null, new RouteSelectorOverlay$resume$$inlined$safeCollectIn$2(new ru.yandex.taxi.routeselector.overlay.d(t9l0Var.V.f(), t9l0Var), null, t9l0Var), 3);
        }
        if (hasView()) {
            rni0 rni0Var = this.referralGiftFactory;
            if (rni0Var != null) {
                ViewGroup rootView = getRootView();
                hoi0 hoi0Var = (hoi0) rni0Var;
                hoi0Var.c.g();
                com.yandex.go.promocodes.referral.impl.ui.b bVar = new com.yandex.go.promocodes.referral.impl.ui.b(hoi0Var.a, hoi0Var.b);
                bVar.f();
                bVar.g = (ViewGroup) rootView.getParent();
                vfc0Var = new vfc0(13, bVar);
            }
            this.referralGiftHolder = vfc0Var;
        }
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment, ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        RouteSelectorModalView routeSelectorModalView = this.routeSelectorModalView;
        if (routeSelectorModalView != null) {
            routeSelectorModalView.updateFocusRect();
        }
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment, ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        RouteSelectorModalView routeSelectorModalView;
        super.onViewCreated(view, savedInstanceState);
        setupInitialCameraPosition();
        super.hideControls();
        ViewGroup viewGroup = this.container;
        if (viewGroup != null && (routeSelectorModalView = this.routeSelectorModalView) != null) {
            routeSelectorModalView.show(viewGroup, 0.0f);
        }
        t9l0 t9l0Var = this.routeSelectorOverlay;
        if (t9l0Var != null) {
            t9l0Var.attach();
        }
        uo21 uo21Var = this.userLocationOverlay;
        if (uo21Var != null) {
            uo21Var.attach();
        }
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public void requestFocusRect() {
    }

    public final void setupInitialCameraPosition() {
        brb0 brb0Var;
        zzs initialPoint = getInitialPoint();
        if (initialPoint == null || (brb0Var = this.pickupPointsWrapCameraPositionInteractor) == null || ((crb0) brb0Var).a.b == null) {
            ((gh00) getAddressMapInteractor().a).J(17.0f);
            return;
        }
        s31 pickupPointsController = getPickupPointsController();
        o8k0 o8k0Var = new o8k0(12, this, initialPoint);
        pickupPointsController.a.p.add(new y4(22, o8k0Var));
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public boolean shouldDrawPickupPoints() {
        Float f;
        drb0 drb0Var = this.pickupPointsZoomLevelRepository;
        if (drb0Var == null) {
            return true;
        }
        ClarifyPointsScreenStrategyConfigurationExperiment.PointConfigurationDto pointConfigurationDto = ((l) drb0Var).b;
        return ((gh00) getMapController()).j() >= ((pointConfigurationDto == null || (f = pointConfigurationDto.a) == null) ? 13.0f : f.floatValue());
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public void showControls() {
        RouteSelectorModalView routeSelectorModalView = this.routeSelectorModalView;
        if (routeSelectorModalView != null) {
            cma1.J(routeSelectorModalView);
        }
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public void unbindViewsInFields() {
        super.unbindViewsInFields();
        this.container = null;
    }
}

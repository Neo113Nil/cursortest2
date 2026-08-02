package ru.yandex.taxi.favorites.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.yandex.go.destination_picker.ChooseAddressMode;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.CameraUpdateReason;
import defpackage.a3v;
import defpackage.a9y0;
import defpackage.ab20;
import defpackage.ah00;
import defpackage.atd0;
import defpackage.ay0;
import defpackage.b01;
import defpackage.c0g;
import defpackage.c9y0;
import defpackage.e0g;
import defpackage.f7r;
import defpackage.faq0;
import defpackage.fif;
import defpackage.fu00;
import defpackage.g18;
import defpackage.gh00;
import defpackage.hpr0;
import defpackage.hr7;
import defpackage.i8y0;
import defpackage.ihf;
import defpackage.kr0;
import defpackage.kyh0;
import defpackage.l56;
import defpackage.lx4;
import defpackage.oep0;
import defpackage.p2c0;
import defpackage.po21;
import defpackage.qq60;
import defpackage.qx0;
import defpackage.s6v;
import defpackage.si00;
import defpackage.t31;
import defpackage.tt2;
import defpackage.tx0;
import defpackage.v7j0;
import defpackage.vtb0;
import defpackage.w6r;
import defpackage.wdt0;
import defpackage.wpb0;
import defpackage.x31;
import defpackage.xi00;
import defpackage.y50;
import defpackage.ydf;
import defpackage.ysd0;
import defpackage.zdp;
import defpackage.zuj0;
import defpackage.zzf;
import defpackage.zzs;
import kotlin.Metadata;
import ru.yandex.taxi.analytics.EditPointOnMapAnalytics$ActionV2;
import ru.yandex.taxi.analytics.EditPointOnMapAnalytics$PointTypeV2;
import ru.yandex.taxi.design.AddressInputComponent;
import ru.yandex.taxi.fragment.preorder.AddressMapFragment;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.preorder.source.pickup.a;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.styling.f;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 T2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001UB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0006J\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0006J!\u0010\u0019\u001a\u00020\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001e\u0010\u0006J\u000f\u0010\u001f\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010 J\u000f\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0014¢\u0006\u0004\b&\u0010'R\"\u0010#\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b#\u0010(\u001a\u0004\b)\u0010$\"\u0004\b*\u0010+R\"\u0010-\u001a\u00020,8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00104\u001a\u0002038\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010;\u001a\u00020:8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010B\u001a\u00020A8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0016\u0010I\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0017\u0010L\u001a\u00020K8\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0016\u0010S\u001a\u0004\u0018\u00010P8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010R¨\u0006V"}, d2 = {"Lru/yandex/taxi/favorites/fragment/FavoriteAddressPickerMapFragment;", "Lru/yandex/taxi/fragment/preorder/AddressMapFragment;", "Lsi00;", "Le0g;", "Lihf;", "<init>", "()V", "Landroid/content/Context;", "context", "Lzy11;", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onPause", "Lzzs;", "geoPoint", "Lqx0;", "callback", "", "onMapTapped", "(Lzzs;Lqx0;)Z", "Lru/yandex/taxi/search/address/view/PointType;", "addressPointType", "()Lru/yandex/taxi/search/address/view/PointType;", "onDismissingStart", "hasPickupPointsOnMap", "()Z", "hasSettings", "Ll56;", "blockedZonesHandler", "()Ll56;", "Lru/yandex/taxi/persuggest/domain/model/RoutePointType;", "pointType", "()Lru/yandex/taxi/persuggest/domain/model/RoutePointType;", "Ll56;", "getBlockedZonesHandler", "setBlockedZonesHandler", "(Ll56;)V", "Lwdt0;", "drawableFactory", "Lwdt0;", "getDrawableFactory", "()Lwdt0;", "setDrawableFactory", "(Lwdt0;)V", "Lfif;", "modeRepository", "Lfif;", "getModeRepository", "()Lfif;", "setModeRepository", "(Lfif;)V", "Lfaq0;", "selectAddressAnalytics", "Lfaq0;", "getSelectAddressAnalytics", "()Lfaq0;", "setSelectAddressAnalytics", "(Lfaq0;)V", "Lru/yandex/taxi/preorder/source/pickup/a;", "pickupHelper", "Lru/yandex/taxi/preorder/source/pickup/a;", "getPickupHelper", "()Lru/yandex/taxi/preorder/source/pickup/a;", "setPickupHelper", "(Lru/yandex/taxi/preorder/source/pickup/a;)V", "Lg18;", "serviceModeSubscription", "Lg18;", "Lhr7;", "cameraListener", "Lhr7;", "getCameraListener", "()Lhr7;", "Lcom/yandex/go/navigation/screen/api/Screen;", "getTrackedScreen", "()Lcom/yandex/go/navigation/screen/api/Screen;", "trackedScreen", "Companion", "zdp", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public class FavoriteAddressPickerMapFragment extends AddressMapFragment<si00, e0g> implements ihf {
    public static final int $stable = 8;
    public static final zdp Companion = new zdp();
    public l56 blockedZonesHandler;
    public wdt0 drawableFactory;
    public fif modeRepository;
    public a pickupHelper;
    public faq0 selectAddressAnalytics;
    private g18 serviceModeSubscription = g18.u1;
    private final hr7 cameraListener = new b01(7, this);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cameraListener$lambda$0(FavoriteAddressPickerMapFragment favoriteAddressPickerMapFragment, CameraPosition cameraPosition, CameraUpdateReason cameraUpdateReason, boolean z) {
        if (cameraUpdateReason == CameraUpdateReason.GESTURES && z) {
            Point target = cameraPosition.getTarget();
            EditPointOnMapAnalytics$PointTypeV2 editPointOnMapAnalytics$PointTypeV2 = EditPointOnMapAnalytics$PointTypeV2.Favorite;
            faq0 selectAddressAnalytics = favoriteAddressPickerMapFragment.getSelectAddressAnalytics();
            double latitude = target.getLatitude();
            double longitude = target.getLongitude();
            selectAddressAnalytics.getClass();
            selectAddressAnalytics.c(EditPointOnMapAnalytics$ActionV2.MapDragging, latitude, longitude, editPointOnMapAnalytics$PointTypeV2, null, null);
        }
    }

    public static final FavoriteAddressPickerMapFragment newInstance() {
        Companion.getClass();
        FavoriteAddressPickerMapFragment favoriteAddressPickerMapFragment = new FavoriteAddressPickerMapFragment();
        favoriteAddressPickerMapFragment.setChooseAddressMode(ChooseAddressMode.OTHER);
        return favoriteAddressPickerMapFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onViewCreated$lambda$0() {
        return "";
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public PointType addressPointType() {
        return PointType.DESTINATION;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public l56 blockedZonesHandler() {
        return getBlockedZonesHandler();
    }

    public final l56 getBlockedZonesHandler() {
        l56 l56Var = this.blockedZonesHandler;
        if (l56Var != null) {
            return l56Var;
        }
        return null;
    }

    public final hr7 getCameraListener() {
        return this.cameraListener;
    }

    public final wdt0 getDrawableFactory() {
        wdt0 wdt0Var = this.drawableFactory;
        if (wdt0Var != null) {
            return wdt0Var;
        }
        return null;
    }

    public final fif getModeRepository() {
        fif fifVar = this.modeRepository;
        if (fifVar != null) {
            return fifVar;
        }
        return null;
    }

    public final a getPickupHelper() {
        a aVar = this.pickupHelper;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    public final faq0 getSelectAddressAnalytics() {
        faq0 faq0Var = this.selectAddressAnalytics;
        if (faq0Var != null) {
            return faq0Var;
        }
        return null;
    }

    @Override // defpackage.ihf
    /* renamed from: getTrackedScreen */
    public Screen getScreen() {
        return Screen.FAVORITES;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public boolean hasPickupPointsOnMap() {
        return false;
    }

    @Override // ru.yandex.taxi.fragment.MapFragment, ru.yandex.taxi.fragment.YandexTaxiFragment
    public boolean hasSettings() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.yandex.taxi.fragment.MapFragment, ru.yandex.taxi.fragment.YandexTaxiFragment, ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
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
        this.blockedZonesHandler = c0gVar.A1();
        this.drawableFactory = c0gVar.g6();
        this.modeRepository = (fif) zzfVar.y8.get();
        this.selectAddressAnalytics = e0gVar.i();
        this.pickupHelper = (a) zzfVar.jn.get();
    }

    @Override // ru.yandex.taxi.fragment.BaseFragment
    public void onDismissingStart() {
        this.serviceModeSubscription.cancel();
        super.onDismissingStart();
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public boolean onMapTapped(zzs geoPoint, qx0 callback) {
        wpb0 h;
        if (geoPoint != null && (h = getPickupHelper().h(getMapController(), geoPoint, true)) != null) {
            faq0 selectAddressAnalytics = getSelectAddressAnalytics();
            EditPointOnMapAnalytics$PointTypeV2 editPointOnMapAnalytics$PointTypeV2 = EditPointOnMapAnalytics$PointTypeV2.Favorite;
            selectAddressAnalytics.getClass();
            EditPointOnMapAnalytics$ActionV2 editPointOnMapAnalytics$ActionV2 = EditPointOnMapAnalytics$ActionV2.PickupPointTap;
            zzs zzsVar = h.b;
            selectAddressAnalytics.c(editPointOnMapAnalytics$ActionV2, zzsVar.a, zzsVar.b, editPointOnMapAnalytics$PointTypeV2, null, h.a);
        }
        return super.onMapTapped(geoPoint, callback);
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment, ru.yandex.taxi.fragment.YandexTaxiFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        ((gh00) getMapController()).u(this.cameraListener);
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment, ru.yandex.taxi.fragment.YandexTaxiFragment, ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ((gh00) getMapController()).e(this.cameraListener);
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment, ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        AddressInputComponent addressInitialPointComponent = getAddressInitialPointComponent();
        if (addressInitialPointComponent != null) {
            addressInitialPointComponent.setMode(AddressInputComponent.Mode.VIEW);
        }
        AddressInputComponent addressInitialPointComponent2 = getAddressInitialPointComponent();
        if (addressInitialPointComponent2 != null) {
            addressInitialPointComponent2.setLeadImage(getDrawableFactory().a(((f) getPinStyleProvider()).b(false).c));
        }
        AddressInputComponent addressInitialPointComponent3 = getAddressInitialPointComponent();
        if (addressInitialPointComponent3 != null) {
            addressInitialPointComponent3.setComponentEnabled(false);
        }
        AddressInputComponent addressInitialPointComponent4 = getAddressInitialPointComponent();
        if (addressInitialPointComponent4 != null) {
            addressInitialPointComponent4.setHint(kyh0.select_address_to);
        }
        this.serviceModeSubscription = getModeRepository().c(new ydf(2));
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public RoutePointType pointType() {
        return RoutePointType.FAVORITE;
    }

    public final void setBlockedZonesHandler(l56 l56Var) {
        this.blockedZonesHandler = l56Var;
    }

    public final void setDrawableFactory(wdt0 wdt0Var) {
        this.drawableFactory = wdt0Var;
    }

    public final void setModeRepository(fif fifVar) {
        this.modeRepository = fifVar;
    }

    public final void setPickupHelper(a aVar) {
        this.pickupHelper = aVar;
    }

    public final void setSelectAddressAnalytics(faq0 faq0Var) {
        this.selectAddressAnalytics = faq0Var;
    }
}

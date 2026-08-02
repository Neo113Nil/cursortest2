package ru.yandex.taxi.fragment;

import android.content.Context;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.FavoriteAddress;
import com.yandex.mapkit.geometry.Point;
import com.yandex.passport.sloth.ui.dependencies.m;
import defpackage.a3v;
import defpackage.a9y0;
import defpackage.ab20;
import defpackage.abv0;
import defpackage.ah00;
import defpackage.atd0;
import defpackage.ay0;
import defpackage.b1c0;
import defpackage.bvv;
import defpackage.c0g;
import defpackage.c9y0;
import defpackage.co40;
import defpackage.d0g;
import defpackage.df4;
import defpackage.e0g;
import defpackage.ee0;
import defpackage.f1h0;
import defpackage.f7r;
import defpackage.fu00;
import defpackage.g7r;
import defpackage.gh00;
import defpackage.he0;
import defpackage.hpr0;
import defpackage.i3y;
import defpackage.i7r;
import defpackage.i8y0;
import defpackage.jbh;
import defpackage.jdp;
import defpackage.kdp;
import defpackage.kr0;
import defpackage.l56;
import defpackage.l91;
import defpackage.lx4;
import defpackage.m621;
import defpackage.me0;
import defpackage.mrj;
import defpackage.n621;
import defpackage.oep0;
import defpackage.ogu0;
import defpackage.p2c0;
import defpackage.pho;
import defpackage.po21;
import defpackage.pv0;
import defpackage.qd0;
import defpackage.qmp;
import defpackage.qq60;
import defpackage.rqo;
import defpackage.s6v;
import defpackage.si00;
import defpackage.t31;
import defpackage.tj60;
import defpackage.tje;
import defpackage.tt2;
import defpackage.tx0;
import defpackage.u500;
import defpackage.u8b1;
import defpackage.ud0;
import defpackage.v0m0;
import defpackage.v7j0;
import defpackage.vtb0;
import defpackage.w6r;
import defpackage.x31;
import defpackage.x770;
import defpackage.xi00;
import defpackage.xj0;
import defpackage.xm00;
import defpackage.y50;
import defpackage.ysd0;
import defpackage.z81;
import defpackage.ze0;
import defpackage.zuj0;
import defpackage.zzf;
import defpackage.zzs;
import kotlin.Metadata;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.common_models.net.map_object.s;
import ru.yandex.taxi.fragment.preorder.AbstractAddressMapPickerFragment;
import ru.yandex.taxi.map_common.b;
import ru.yandex.taxi.pin.c;
import ru.yandex.taxi.search.address.view.PointType;

@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 `2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001aB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0005J\u000f\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\tH\u0014¢\u0006\u0004\b \u0010\u000bJ\u000f\u0010!\u001a\u00020\u0011H\u0014¢\u0006\u0004\b!\u0010\u0005J\u000f\u0010\"\u001a\u00020\tH\u0016¢\u0006\u0004\b\"\u0010\u000bJ\u000f\u0010#\u001a\u00020\u0011H\u0016¢\u0006\u0004\b#\u0010\u0005J\u000f\u0010$\u001a\u00020\u0011H\u0002¢\u0006\u0004\b$\u0010\u0005J\u0017\u0010'\u001a\u00020\u00112\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0011H\u0002¢\u0006\u0004\b)\u0010\u0005J\u0017\u0010*\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b*\u0010\u0013R\"\u0010,\u001a\u00020+8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00103\u001a\u0002028\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010:\u001a\u0002098\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010A\u001a\u00020@8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\r\u0010G\u001a\u0004\bH\u0010\u000e\"\u0004\bI\u0010JR(\u0010L\u001a\u00020K8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\bL\u0010M\u0012\u0004\bR\u0010\u0005\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001b\u0010X\u001a\u00020S8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010YR\u0016\u0010[\u001a\u00020Z8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010^\u001a\u00020]8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b^\u0010_¨\u0006b"}, d2 = {"Lru/yandex/taxi/fragment/SuggestedFavoritesFragment;", "Lru/yandex/taxi/fragment/preorder/AbstractAddressMapPickerFragment;", "Le0g;", "Ldf4;", "<init>", "()V", "Lru/yandex/taxi/search/address/view/PointType;", "addressPointType", "()Lru/yandex/taxi/search/address/view/PointType;", "", "hasPickupPointsOnMap", "()Z", "Ll56;", "blockedZonesHandler", "()Ll56;", "Landroid/content/Context;", "context", "Lzy11;", "onAttach", "(Landroid/content/Context;)V", "Lhe0;", "navigator", "setNavigator", "(Lhe0;)V", "onDetach", "Lb1c0;", "setupPinV2DataRepository", "()Lb1c0;", "Lpv0;", "addressInfo", "onPreResult", "(Lpv0;)V", "isControlVisible", "requestFocusRect", "onBackPressed", "onMapDragged", "initCallback", "Lzzs;", "geoPoint", "moveToGeoPoint", "(Lzzs;)V", "openSuggestedFavoritesModalView", "addPickupPoint", "Lxj0;", "addToFavoritesMapOverlayHolder", "Lxj0;", "getAddToFavoritesMapOverlayHolder", "()Lxj0;", "setAddToFavoritesMapOverlayHolder", "(Lxj0;)V", "Lee0;", "addFavoritesModalViewFactory", "Lee0;", "getAddFavoritesModalViewFactory", "()Lee0;", "setAddFavoritesModalViewFactory", "(Lee0;)V", "Lm621;", "updateAddressRepository", "Lm621;", "getUpdateAddressRepository", "()Lm621;", "setUpdateAddressRepository", "(Lm621;)V", "Ljdp;", "newUiUpdateAddressRepository", "Ljdp;", "getNewUiUpdateAddressRepository", "()Ljdp;", "setNewUiUpdateAddressRepository", "(Ljdp;)V", "Ll56;", "getBlockedZonesHandler", "setBlockedZonesHandler", "(Ll56;)V", "Lze0;", "addFavoritesScreenConfigProvider", "Lze0;", "getAddFavoritesScreenConfigProvider", "()Lze0;", "setAddFavoritesScreenConfigProvider", "(Lze0;)V", "getAddFavoritesScreenConfigProvider$annotations", "Lg7r;", "finalizeAddressByGravityRouter$delegate", "Li3y;", "getFinalizeAddressByGravityRouter", "()Lg7r;", "finalizeAddressByGravityRouter", "Lhe0;", "Lbvv;", "initDataForAddFavoritesScreen", "Lbvv;", "Lxm00;", "mapObjectCollection", "Lxm00;", "Companion", "abv0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SuggestedFavoritesFragment extends AbstractAddressMapPickerFragment<e0g> implements df4 {
    public static final abv0 Companion = new abv0();
    private static final int DIFF_BETWEEN_INIT_AND_CURRENT_ADDRESS_IN_PIXELS = 80;
    private static final float DURATION_MS = 300.0f;
    public ee0 addFavoritesModalViewFactory;
    public ze0 addFavoritesScreenConfigProvider;
    public xj0 addToFavoritesMapOverlayHolder;
    public l56 blockedZonesHandler;

    /* renamed from: finalizeAddressByGravityRouter$delegate, reason: from kotlin metadata */
    private final i3y finalizeAddressByGravityRouter = kotlin.a.a(new ogu0(8, this));
    private bvv initDataForAddFavoritesScreen;
    private xm00 mapObjectCollection;
    private he0 navigator;
    public jdp newUiUpdateAddressRepository;
    public m621 updateAddressRepository;

    private final void addPickupPoint(Context context) {
        bvv bvvVar = this.initDataForAddFavoritesScreen;
        if (bvvVar == null) {
            bvvVar = null;
        }
        Point F = ru.yandex.taxi.map.utils.a.F(bvvVar.a);
        xm00 xm00Var = this.mapObjectCollection;
        (xm00Var != null ? xm00Var : null).r(F).x(u8b1.h(f1h0.route_selected_dest_point, context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g7r finalizeAddressByGravityRouter_delegate$lambda$0(SuggestedFavoritesFragment suggestedFavoritesFragment) {
        return ((i7r) suggestedFavoritesFragment.getFinalizeAddressByGravityRouterFactory()).a(suggestedFavoritesFragment.getAddressResolveRepository());
    }

    public static /* synthetic */ void getAddFavoritesScreenConfigProvider$annotations() {
    }

    private final g7r getFinalizeAddressByGravityRouter() {
        return (g7r) this.finalizeAddressByGravityRouter.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [C, ru.yandex.taxi.fragment.a] */
    private final void initCallback() {
        if (this.callback == 0) {
            this.callback = new a(this);
        }
    }

    private final void moveToGeoPoint(zzs geoPoint) {
        ((gh00) getMapController()).D(ru.yandex.taxi.map.utils.a.F(geoPoint), 17.0f, DURATION_MS, null);
    }

    private final void openSuggestedFavoritesModalView() {
        getAddToFavoritesMapOverlayHolder().a.Hg();
        bvv bvvVar = this.initDataForAddFavoritesScreen;
        if (bvvVar == null) {
            bvvVar = null;
        }
        moveToGeoPoint(bvvVar.a);
        tje.N(getLifecycleScope(), null, null, new SuggestedFavoritesFragment$openSuggestedFavoritesModalView$1(this, null), 3);
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public PointType addressPointType() {
        return PointType.DESTINATION;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public l56 blockedZonesHandler() {
        return getBlockedZonesHandler();
    }

    public final ee0 getAddFavoritesModalViewFactory() {
        ee0 ee0Var = this.addFavoritesModalViewFactory;
        if (ee0Var != null) {
            return ee0Var;
        }
        return null;
    }

    public final ze0 getAddFavoritesScreenConfigProvider() {
        ze0 ze0Var = this.addFavoritesScreenConfigProvider;
        if (ze0Var != null) {
            return ze0Var;
        }
        return null;
    }

    public final xj0 getAddToFavoritesMapOverlayHolder() {
        xj0 xj0Var = this.addToFavoritesMapOverlayHolder;
        if (xj0Var != null) {
            return xj0Var;
        }
        return null;
    }

    public final l56 getBlockedZonesHandler() {
        l56 l56Var = this.blockedZonesHandler;
        if (l56Var != null) {
            return l56Var;
        }
        return null;
    }

    public final jdp getNewUiUpdateAddressRepository() {
        jdp jdpVar = this.newUiUpdateAddressRepository;
        if (jdpVar != null) {
            return jdpVar;
        }
        return null;
    }

    public final m621 getUpdateAddressRepository() {
        m621 m621Var = this.updateAddressRepository;
        if (m621Var != null) {
            return m621Var;
        }
        return null;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public boolean hasPickupPointsOnMap() {
        return false;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public boolean isControlVisible() {
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
        this.addToFavoritesMapOverlayHolder = (xj0) e0gVar.r.get();
        d0g d0gVar = c0gVar.a;
        zzf zzfVar2 = d0gVar.a;
        zuj0 zuj0Var = (zuj0) zzfVar2.W.get();
        c0g c0gVar2 = d0gVar.b;
        zzf zzfVar3 = c0gVar2.z;
        rqo rqoVar = (rqo) zzfVar3.C.get();
        qd0.Companion.getClass();
        ((jbh) rqoVar).c(qd0.f);
        this.addFavoritesModalViewFactory = new ru.yandex.taxi.factories.a(new m(zuj0Var, (n621) d0gVar.i5.get(), (atd0) c0gVar2.Ac.get(), (ru.yandex.taxi.favorites.data.repo.a) zzfVar2.W7.get(), (u500) c0gVar2.b9.get(), new mrj(4, new x770((pho) zzfVar2.d0.get()), new co40((pho) zzfVar2.d0.get()), new x770((pho) zzfVar2.d0.get())), (tj60) c0gVar2.t7.get(), (qmp) zzfVar2.D.get(), (tt2) zzfVar2.n.get(), (Context) c0gVar2.U.get()), c0gVar2.f3());
        this.updateAddressRepository = (m621) d0gVar.i5.get();
        this.newUiUpdateAddressRepository = (jdp) c0gVar.Uo.get();
        this.blockedZonesHandler = c0gVar.A1();
        v0m0 v0m0Var = new v0m0(new ud0((rqo) zzfVar3.C.get(), (zuj0) zzfVar3.W.get()), 0);
        v0m0Var.c = "save_suggested_favorites";
        this.addFavoritesScreenConfigProvider = v0m0Var;
        this.mapObjectCollection = ((gh00) getMapController()).i.p();
        initCallback();
        openSuggestedFavoritesModalView();
        addPickupPoint(context);
        ((b) getPointActionRouterConsumer()).a(s.class, getFinalizeAddressByGravityRouter());
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

    @Override // ru.yandex.taxi.fragment.MapFragment, ru.yandex.taxi.fragment.YandexTaxiFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        ((b) getPointActionRouterConsumer()).c(s.class, getFinalizeAddressByGravityRouter());
        xm00 xm00Var = ((gh00) getMapController()).i;
        xm00 xm00Var2 = this.mapObjectCollection;
        if (xm00Var2 == null) {
            xm00Var2 = null;
        }
        xm00Var.o(xm00Var2);
        xm00 xm00Var3 = this.mapObjectCollection;
        (xm00Var3 != null ? xm00Var3 : null).m();
        super.onDetach();
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment, defpackage.qt00
    public void onMapDragged() {
        super.onMapDragged();
        r0 r0Var = ((n621) getUpdateAddressRepository()).b;
        Boolean bool = Boolean.TRUE;
        r0Var.getClass();
        r0Var.m(null, bool);
    }

    public final void onPreResult(pv0 addressInfo) {
        ah00 mapController = getMapController();
        bvv bvvVar = this.initDataForAddFavoritesScreen;
        if (bvvVar == null) {
            bvvVar = null;
        }
        zzs zzsVar = bvvVar.a;
        Address address = addressInfo.a;
        zzs B = address.B();
        gh00 gh00Var = (gh00) mapController;
        gh00Var.getClass();
        boolean z = gh00Var.f(ru.yandex.taxi.map.utils.a.F(zzsVar), ru.yandex.taxi.map.utils.a.F(B)) < 80.0d;
        if (z) {
            bvv bvvVar2 = this.initDataForAddFavoritesScreen;
            if (bvvVar2 == null) {
                bvvVar2 = null;
            }
            moveToGeoPoint(bvvVar2.a);
        }
        m621 updateAddressRepository = getUpdateAddressRepository();
        l91 l91Var = new l91(address, z);
        r0 r0Var = ((n621) updateAddressRepository).a;
        r0Var.getClass();
        r0Var.m(null, l91Var);
        r0 r0Var2 = ((n621) getUpdateAddressRepository()).b;
        Boolean bool = Boolean.FALSE;
        r0Var2.getClass();
        r0Var2.m(null, bool);
        jdp newUiUpdateAddressRepository = getNewUiUpdateAddressRepository();
        FavoriteAddress h = z81.h(address, null);
        r0 r0Var3 = ((kdp) newUiUpdateAddressRepository).a;
        r0Var3.getClass();
        r0Var3.m(null, h);
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public void requestFocusRect() {
    }

    public final void setAddFavoritesModalViewFactory(ee0 ee0Var) {
        this.addFavoritesModalViewFactory = ee0Var;
    }

    public final void setAddFavoritesScreenConfigProvider(ze0 ze0Var) {
        this.addFavoritesScreenConfigProvider = ze0Var;
    }

    public final void setAddToFavoritesMapOverlayHolder(xj0 xj0Var) {
        this.addToFavoritesMapOverlayHolder = xj0Var;
    }

    public final void setBlockedZonesHandler(l56 l56Var) {
        this.blockedZonesHandler = l56Var;
    }

    public final void setNavigator(he0 navigator) {
        this.navigator = navigator;
    }

    public final void setNewUiUpdateAddressRepository(jdp jdpVar) {
        this.newUiUpdateAddressRepository = jdpVar;
    }

    public final void setUpdateAddressRepository(m621 m621Var) {
        this.updateAddressRepository = m621Var;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public b1c0 setupPinV2DataRepository() {
        return new c(new me0(requireContext(), (byte) 0), getAddressResolveRepository(), getPinWithStanExperimentRepository());
    }
}

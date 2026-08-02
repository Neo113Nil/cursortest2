package ru.yandex.taxi.masstransit.address.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import com.yandex.go.pin.api.a;
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
import defpackage.c7p;
import defpackage.c9y0;
import defpackage.cma1;
import defpackage.df4;
import defpackage.e0g;
import defpackage.f7r;
import defpackage.faq0;
import defpackage.fbz;
import defpackage.fu00;
import defpackage.gh00;
import defpackage.hc30;
import defpackage.hpr0;
import defpackage.hr7;
import defpackage.i8y0;
import defpackage.ic30;
import defpackage.ip11;
import defpackage.jc30;
import defpackage.kr0;
import defpackage.kyh0;
import defpackage.l56;
import defpackage.lx4;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.p0c0;
import defpackage.p2c0;
import defpackage.pj;
import defpackage.po21;
import defpackage.pv0;
import defpackage.qq60;
import defpackage.s6v;
import defpackage.si00;
import defpackage.t31;
import defpackage.tt2;
import defpackage.tx0;
import defpackage.v7j0;
import defpackage.vtb0;
import defpackage.w511;
import defpackage.w6r;
import defpackage.x31;
import defpackage.xi00;
import defpackage.y50;
import defpackage.ysd0;
import defpackage.zmh;
import defpackage.zuj0;
import defpackage.zzf;
import defpackage.zzi;
import defpackage.zzs;
import java.util.HashMap;
import kotlin.Metadata;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.AddressInputComponent;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.fragment.preorder.AbstractAddressMapPickerFragment;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.styling.f;
import ru.yandex.video.m3.player.ugc_live.UgcLiveVideoData;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 W2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001XB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0005J\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0010\u0010\u0005J\u000f\u0010\u0011\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0011\u0010\u0005J\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010 \u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\bH\u0014¢\u0006\u0004\b\"\u0010\u0005J\u000f\u0010#\u001a\u00020\bH\u0014¢\u0006\u0004\b#\u0010\u0005J\u000f\u0010$\u001a\u00020\u0015H\u0014¢\u0006\u0004\b$\u0010\u0017J\u000f\u0010&\u001a\u00020%H\u0014¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0015H\u0014¢\u0006\u0004\b(\u0010\u0017J\u000f\u0010)\u001a\u00020\u0015H\u0016¢\u0006\u0004\b)\u0010\u0017J\u000f\u0010*\u001a\u00020\u0015H\u0014¢\u0006\u0004\b*\u0010\u0017J\u000f\u0010,\u001a\u00020+H\u0014¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0015H\u0014¢\u0006\u0004\b.\u0010\u0017J\u000f\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b0\u00101J'\u00107\u001a\u00020\b2\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020\u0015H\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020/H\u0002¢\u0006\u0004\b9\u00101R\"\u0010;\u001a\u00020:8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010B\u001a\u00020A8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010I\u001a\u00020H8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010OR\u0016\u0010P\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010R\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010V¨\u0006Y"}, d2 = {"Lru/yandex/taxi/masstransit/address/ui/MtAddressMapPickerFragment;", "Lru/yandex/taxi/fragment/preorder/AbstractAddressMapPickerFragment;", "Le0g;", "Ldf4;", "<init>", "()V", "Landroid/content/Context;", "context", "Lzy11;", "onAttach", "(Landroid/content/Context;)V", "onResume", "onPause", "Lru/yandex/taxi/search/address/view/PointType;", "addressPointType", "()Lru/yandex/taxi/search/address/view/PointType;", "bindViewsInFields", "unbindViewsInFields", "Lru/yandex/taxi/persuggest/domain/model/RoutePointType;", "pointType", "()Lru/yandex/taxi/persuggest/domain/model/RoutePointType;", "", "hasPickupPointsOnMap", "()Z", "Lc7p;", ClidProvider.STATE, "changeAutoLocateButtonState", "(Lc7p;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "hideControls", "showControls", "reactOnUnsupportedAddress", "Ll56;", "blockedZonesHandler", "()Ll56;", "blockedZonesEnabled", "onBackPressed", "isBackButtonVisible", "", "autoPaddingGravity", "()I", "shouldShowStateBarMessage", "", "screenForAnalytics", "()Ljava/lang/String;", "Lcom/yandex/mapkit/map/CameraPosition;", "position", "Lcom/yandex/mapkit/map/CameraUpdateReason;", CRLReasonCodeExtension.REASON, UgcLiveVideoData.UgcLiveStatus.FINISHED, "onMapDragging", "(Lcom/yandex/mapkit/map/CameraPosition;Lcom/yandex/mapkit/map/CameraUpdateReason;Z)V", "pointTypeForAnalytics", "Lzzi;", "drawableFactory", "Lzzi;", "getDrawableFactory", "()Lzzi;", "setDrawableFactory", "(Lzzi;)V", "Lfaq0;", "selectAddressAnalytics", "Lfaq0;", "getSelectAddressAnalytics", "()Lfaq0;", "setSelectAddressAnalytics", "(Lfaq0;)V", "Lip11;", "typefaceDelegate", "Lip11;", "getTypefaceDelegate", "()Lip11;", "setTypefaceDelegate", "(Lip11;)V", "Lru/yandex/taxi/search/address/view/PointType;", "isAutolocateVisible", "Z", "titleResId", "Ljava/lang/Integer;", "Lhr7;", "cameraListener", "Lhr7;", "Companion", "hc30", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MtAddressMapPickerFragment extends AbstractAddressMapPickerFragment<e0g> implements df4 {
    public static final int $stable = 8;
    public static final hc30 Companion = new hc30();
    public zzi drawableFactory;
    private PointType pointType;
    public faq0 selectAddressAnalytics;
    private Integer titleResId;
    public ip11 typefaceDelegate;
    private boolean isAutolocateVisible = true;
    private final hr7 cameraListener = new b01(17, this);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindViewsInFields$lambda$0(MtAddressMapPickerFragment mtAddressMapPickerFragment) {
        mtAddressMapPickerFragment.requireActivity().onBackPressed();
    }

    public static final MtAddressMapPickerFragment newInstance(PointType pointType, pv0 pv0Var, zzs zzsVar) {
        Companion.getClass();
        return hc30.a(pointType, pv0Var, zzsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onMapDragging(CameraPosition position, CameraUpdateReason reason, boolean finished) {
        if (this.pointType != null && reason == CameraUpdateReason.GESTURES && finished) {
            faq0 selectAddressAnalytics = getSelectAddressAnalytics();
            double latitude = position.getTarget().getLatitude();
            double longitude = position.getTarget().getLongitude();
            String pointTypeForAnalytics = pointTypeForAnalytics();
            String screenForAnalytics = screenForAnalytics();
            pj pjVar = selectAddressAnalytics.a;
            Double valueOf = Double.valueOf(latitude);
            Double valueOf2 = Double.valueOf(longitude);
            pjVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("action", "map_dragging");
            hashMap.put("lat", valueOf);
            hashMap.put("lon", valueOf2);
            if (screenForAnalytics != null) {
                hashMap.put(MetaDataField.SCREEN_FIELD, screenForAnalytics);
            }
            if (pointTypeForAnalytics != null) {
                hashMap.put("type", pointTypeForAnalytics);
            }
            pjVar.a.a("EditPointOnMap", hashMap, 1, new HashMap());
        }
    }

    private final String pointTypeForAnalytics() {
        PointType pointType = this.pointType;
        int i = pointType == null ? -1 : ic30.a[pointType.ordinal()];
        if (i == -1) {
            return "";
        }
        if (i == 1) {
            return "source";
        }
        if (i == 2) {
            return "destination";
        }
        w511.b();
        return null;
    }

    private final String screenForAnalytics() {
        return "masstransit";
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public PointType addressPointType() {
        PointType pointType = this.pointType;
        return pointType == null ? PointType.DESTINATION : pointType;
    }

    @Override // ru.yandex.taxi.fragment.MapFragment, ru.yandex.taxi.fragment.BaseFragment
    public int autoPaddingGravity() {
        return 48;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AbstractAddressMapPickerFragment, ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public void bindViewsInFields() {
        super.bindViewsInFields();
        FloatButtonIconComponent floatButtonIconComponent = this.backButton;
        if (floatButtonIconComponent != null) {
            floatButtonIconComponent.setDebounceClickListener(new fbz(28, this));
        }
        Integer num = this.titleResId;
        if (num != null) {
            int intValue = num.intValue();
            ListItemComponent listItemComponent = this.addressTitleItem;
            if (listItemComponent != null) {
                listItemComponent.setTitle(intValue);
            }
            ListItemComponent listItemComponent2 = this.addressTitleItem;
            if (listItemComponent2 != null) {
                listItemComponent2.setVisibility(0);
            }
        }
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public boolean blockedZonesEnabled() {
        return false;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public l56 blockedZonesHandler() {
        return new jc30();
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public void changeAutoLocateButtonState(c7p state) {
        if (this.isAutolocateVisible) {
            super.changeAutoLocateButtonState(state);
        } else {
            super.changeAutoLocateButtonState(new c7p(false, false));
        }
    }

    public final zzi getDrawableFactory() {
        zzi zziVar = this.drawableFactory;
        if (zziVar != null) {
            return zziVar;
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

    public final ip11 getTypefaceDelegate() {
        ip11 ip11Var = this.typefaceDelegate;
        if (ip11Var != null) {
            return ip11Var;
        }
        return null;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public boolean hasPickupPointsOnMap() {
        return false;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public void hideControls() {
        super.hideControls();
        FloatButtonIconComponent floatButtonIconComponent = this.backButton;
        if (floatButtonIconComponent != null) {
            cma1.b(0.0f, floatButtonIconComponent);
        } else {
            ny61.g("Required value was null.");
        }
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public boolean isBackButtonVisible() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.yandex.taxi.fragment.MapFragment, ru.yandex.taxi.fragment.YandexTaxiFragment, ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        e0g e0gVar = (e0g) injector();
        zzf zzfVar = e0gVar.b;
        this.receiverProvider = zzfVar.Yp;
        c0g c0gVar = e0gVar.c;
        setPin((a) c0gVar.Ub.get());
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
        this.drawableFactory = c0gVar.O1();
        this.selectAddressAnalytics = e0gVar.i();
        this.typefaceDelegate = (ip11) zzfVar.uf.get();
    }

    @Override // defpackage.df4
    public boolean onBackPressed() {
        si00 si00Var = (si00) this.callback;
        if (si00Var == null) {
            return true;
        }
        si00Var.d();
        return true;
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

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment, ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onViewCreated(View view, Bundle savedInstanceState) {
        p0c0 b;
        AddressInputComponent addressInitialPointComponent;
        ListItemComponent listItemComponent;
        super.onViewCreated(view, savedInstanceState);
        AddressInputComponent addressInitialPointComponent2 = getAddressInitialPointComponent();
        if (addressInitialPointComponent2 != null) {
            addressInitialPointComponent2.setMode(AddressInputComponent.Mode.VIEW);
            addressInitialPointComponent2.setComponentEnabled(false);
            addressInitialPointComponent2.setHint(kyh0.select_address_to);
        }
        PointType pointType = this.pointType;
        int i = pointType == null ? -1 : ic30.a[pointType.ordinal()];
        if (i != -1) {
            if (i == 1) {
                b = ((f) getPinStyleProvider()).b(true);
                Drawable a = getDrawableFactory().a(b.a);
                addressInitialPointComponent = getAddressInitialPointComponent();
                if (addressInitialPointComponent != null) {
                    addressInitialPointComponent.setLeadImage(a);
                }
                listItemComponent = this.addressTitleItem;
                if (listItemComponent == null) {
                    ip11 typefaceDelegate = getTypefaceDelegate();
                    requireContext();
                    listItemComponent.setTitleTypeface(((zmh) typefaceDelegate).d());
                    return;
                }
                return;
            }
            if (i != 2) {
                w511.b();
                return;
            }
        }
        b = ((f) getPinStyleProvider()).b(false);
        Drawable a2 = getDrawableFactory().a(b.a);
        addressInitialPointComponent = getAddressInitialPointComponent();
        if (addressInitialPointComponent != null) {
        }
        listItemComponent = this.addressTitleItem;
        if (listItemComponent == null) {
        }
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public RoutePointType pointType() {
        PointType pointType = this.pointType;
        int i = pointType == null ? -1 : ic30.a[pointType.ordinal()];
        if (i != -1) {
            if (i == 1) {
                return RoutePointType.TRANSPORT_A;
            }
            if (i != 2) {
                w511.b();
                return null;
            }
        }
        return RoutePointType.TRANSPORT_B;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public boolean reactOnUnsupportedAddress() {
        return false;
    }

    public final void setDrawableFactory(zzi zziVar) {
        this.drawableFactory = zziVar;
    }

    public final void setSelectAddressAnalytics(faq0 faq0Var) {
        this.selectAddressAnalytics = faq0Var;
    }

    public final void setTypefaceDelegate(ip11 ip11Var) {
        this.typefaceDelegate = ip11Var;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public boolean shouldShowStateBarMessage() {
        return false;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public void showControls() {
        super.showControls();
        FloatButtonIconComponent floatButtonIconComponent = this.backButton;
        if (floatButtonIconComponent != null) {
            cma1.b(1.0f, floatButtonIconComponent);
        } else {
            ny61.g("Required value was null.");
        }
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public void unbindViewsInFields() {
        super.unbindViewsInFields();
        FloatButtonIconComponent floatButtonIconComponent = this.backButton;
        if (floatButtonIconComponent != null) {
            floatButtonIconComponent.setDebounceClickListener(null);
        }
        this.backButton = null;
        this.addressTitleItem = null;
    }
}

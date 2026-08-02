package ru.yandex.taxi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.yandex.go.address.models.Address;
import com.yandex.go.analytics.ChangePointInActiveOrderAnalytics$ButtonNameV2;
import com.yandex.go.taxi.order.analytics.DetailsOpenReason;
import com.yandex.go.taxi.order.api.details.TaxiCardNavigationAction;
import com.yandex.go.taxi.order.change.source.experiment.ChangeSourcePointExperiment;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Circle;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.map.Map;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.a3v;
import defpackage.a9y0;
import defpackage.ab20;
import defpackage.ac9;
import defpackage.ah00;
import defpackage.atd0;
import defpackage.ay0;
import defpackage.b1c0;
import defpackage.ba9;
import defpackage.bc9;
import defpackage.c0g;
import defpackage.c7p;
import defpackage.c9y0;
import defpackage.cx7;
import defpackage.d6z;
import defpackage.df4;
import defpackage.e0g;
import defpackage.evu0;
import defpackage.f7r;
import defpackage.fu00;
import defpackage.gh00;
import defpackage.hpr0;
import defpackage.hxx;
import defpackage.i85;
import defpackage.i8y0;
import defpackage.ig9;
import defpackage.kdc;
import defpackage.kr0;
import defpackage.kyh0;
import defpackage.l56;
import defpackage.lx4;
import defpackage.m810;
import defpackage.mbe0;
import defpackage.me0;
import defpackage.mrg0;
import defpackage.oep0;
import defpackage.p2c0;
import defpackage.pav;
import defpackage.pep0;
import defpackage.po21;
import defpackage.pv0;
import defpackage.q5z;
import defpackage.qq60;
import defpackage.r870;
import defpackage.s6v;
import defpackage.s8o;
import defpackage.s90;
import defpackage.si00;
import defpackage.srb1;
import defpackage.t31;
import defpackage.tt2;
import defpackage.tx0;
import defpackage.ub9;
import defpackage.uo21;
import defpackage.v7j0;
import defpackage.vb9;
import defpackage.vf9;
import defpackage.vng;
import defpackage.vtb0;
import defpackage.vub;
import defpackage.w3i;
import defpackage.w6r;
import defpackage.wa4;
import defpackage.wb9;
import defpackage.wdt0;
import defpackage.we8;
import defpackage.wf9;
import defpackage.x31;
import defpackage.xb9;
import defpackage.xi00;
import defpackage.xm00;
import defpackage.xng0;
import defpackage.xvf0;
import defpackage.xw31;
import defpackage.y50;
import defpackage.yn5;
import defpackage.ysd0;
import defpackage.yvf0;
import defpackage.z2e;
import defpackage.zb9;
import defpackage.zuj0;
import defpackage.zy11;
import defpackage.zyg0;
import defpackage.zzf;
import defpackage.zzs;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.AddressInputComponent;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.fragment.preorder.AbstractAddressMapPickerFragment;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.search.address.view.PointType;

@Metadata(d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u0092\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0002\u0093\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0010\u0010\u0006J!\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0006J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\"\u0010\tJ\u000f\u0010$\u001a\u00020#H\u0014¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b&\u0010\u001eJ\u000f\u0010'\u001a\u00020\fH\u0016¢\u0006\u0004\b'\u0010\u0006J\u000f\u0010)\u001a\u00020(H\u0014¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0007H\u0016¢\u0006\u0004\b+\u0010\tJ\u0017\u0010.\u001a\u00020\f2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J-\u00105\u001a\u00020\f2\b\u00101\u001a\u0004\u0018\u0001002\b\u00102\u001a\u0004\u0018\u0001002\b\u00104\u001a\u0004\u0018\u000103H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\fH\u0016¢\u0006\u0004\b7\u0010\u0006J\u0017\u0010:\u001a\u00020\f2\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\f2\u0006\u00109\u001a\u00020<H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b?\u0010\u001eJ\u000f\u0010@\u001a\u00020\fH\u0016¢\u0006\u0004\b@\u0010\u0006J\u0017\u0010D\u001a\u00020C2\u0006\u0010B\u001a\u00020AH\u0014¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u00020\f2\u0006\u0010F\u001a\u00020\u0007H\u0016¢\u0006\u0004\bG\u0010\u001aJ\u0017\u0010H\u001a\u00020\f2\u0006\u0010F\u001a\u00020\u0007H\u0016¢\u0006\u0004\bH\u0010\u001aJ\u0017\u0010J\u001a\u00020\f2\u0006\u0010I\u001a\u00020CH\u0016¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\u0007H\u0014¢\u0006\u0004\bL\u0010\tJ\u0011\u0010M\u001a\u0004\u0018\u00010CH\u0014¢\u0006\u0004\bM\u0010NJ\u0017\u0010Q\u001a\u00020\f2\u0006\u0010P\u001a\u00020OH\u0016¢\u0006\u0004\bQ\u0010RJ\u000f\u0010T\u001a\u00020SH\u0014¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020\u0007H\u0014¢\u0006\u0004\bV\u0010\tJ\u000f\u0010W\u001a\u00020\fH\u0002¢\u0006\u0004\bW\u0010\u0006J\u000f\u0010X\u001a\u00020\fH\u0002¢\u0006\u0004\bX\u0010\u0006J\u000f\u0010Y\u001a\u00020\fH\u0002¢\u0006\u0004\bY\u0010\u0006R\"\u0010$\u001a\u00020#8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b$\u0010Z\u001a\u0004\b[\u0010%\"\u0004\b\\\u0010]R\"\u0010_\u001a\u00020^8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\"\u0010f\u001a\u00020e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\"\u0010m\u001a\u00020l8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\"\u0010t\u001a\u00020s8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR*\u0010|\u001a\b\u0012\u0004\u0012\u00020{0z8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001a\u0010\u0083\u0001\u001a\u00030\u0082\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001a\u0010\u0086\u0001\u001a\u00030\u0085\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001a\u0010\u0089\u0001\u001a\u00030\u0088\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0018\u0010\u008c\u0001\u001a\u00030\u008b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0018\u0010\u0091\u0001\u001a\u00030\u008e\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001¨\u0006\u0094\u0001"}, d2 = {"Lru/yandex/taxi/ChangeOrderSourceAddressFragment;", "Lru/yandex/taxi/fragment/preorder/AbstractAddressMapPickerFragment;", "Le0g;", "Ldf4;", "Lac9;", "<init>", "()V", "", "isShowPanoramaButton", "()Z", "Landroid/content/Context;", "context", "Lzy11;", "onAttach", "(Landroid/content/Context;)V", "bindViewsInFields", "unbindViewsInFields", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "requestLocation", "onLocationClick", "(Z)V", "Lpv0;", "addressInfo", "onAddressChanged", "(Lpv0;)V", "Lru/yandex/taxi/search/address/view/PointType;", "addressPointType", "()Lru/yandex/taxi/search/address/view/PointType;", "hasPickupPointsOnMap", "Ll56;", "blockedZonesHandler", "()Ll56;", "addressPicked", "onDetach", "Lb1c0;", "setupPinV2DataRepository", "()Lb1c0;", "onBackPressed", "Lwa4;", "circleData", "showAvailableCircle", "(Lwa4;)V", "Lkdc;", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "iconColor", "Landroid/graphics/Bitmap;", "icon", "showIcon", "(Lkdc;Lkdc;Landroid/graphics/Bitmap;)V", "showDefaultIcon", "Lz2e;", ClidProvider.STATE, "updateConfirmButton", "(Lz2e;)V", "Lvf9;", "changePinState", "(Lvf9;)V", "onSourceAddressChanged", "onBack", "Lcom/yandex/go/address/models/Address;", "address", "", "getAddressTitle", "(Lcom/yandex/go/address/models/Address;)Ljava/lang/String;", "isVisible", "changeBackButtonVisibility", "changeAutoLocateButtonVisibility", "porchNumber", "changePorchNumber", "(Ljava/lang/String;)V", "isBackButtonVisible", "forcedCurrentMode", "()Ljava/lang/String;", "Lcom/yandex/go/taxi/order/change/source/experiment/ChangeSourcePointExperiment;", "experiment", "updateTitles", "(Lcom/yandex/go/taxi/order/change/source/experiment/ChangeSourcePointExperiment;)V", "Lru/yandex/taxi/persuggest/domain/model/RoutePointType;", "pointType", "()Lru/yandex/taxi/persuggest/domain/model/RoutePointType;", "blockedZonesAlertsEnabled", "openEntranceInput", "initCallback", "setStartPosition", "Ll56;", "getBlockedZonesHandler", "setBlockedZonesHandler", "(Ll56;)V", "Luo21;", "userLocationOverlay", "Luo21;", "getUserLocationOverlay", "()Luo21;", "setUserLocationOverlay", "(Luo21;)V", "Lxb9;", "presenterFactory", "Lxb9;", "getPresenterFactory", "()Lxb9;", "setPresenterFactory", "(Lxb9;)V", "Lwdt0;", "drawableFactory", "Lwdt0;", "getDrawableFactory", "()Lwdt0;", "setDrawableFactory", "(Lwdt0;)V", "Lr870;", "openTaxiOrderRouter", "Lr870;", "getOpenTaxiOrderRouter", "()Lr870;", "setOpenTaxiOrderRouter", "(Lr870;)V", "Lyvf0;", "Li85;", "basePorchNumberInputRouter", "Lyvf0;", "getBasePorchNumberInputRouter", "()Lyvf0;", "setBasePorchNumberInputRouter", "(Lyvf0;)V", "Lbc9;", "changeOrderSourcePointInitData", "Lbc9;", "Lxm00;", "mapObjectCollection", "Lxm00;", "Lcom/yandex/go/taxi/order/change/source/mvp/d;", "presenter", "Lcom/yandex/go/taxi/order/change/source/mvp/d;", "Lig9;", "changeSourcePointPinStateRepository", "Lig9;", "Lru/yandex/taxi/design/ButtonComponent;", "getPorchButton", "()Lru/yandex/taxi/design/ButtonComponent;", "porchButton", "Companion", "vb9", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ChangeOrderSourceAddressFragment extends AbstractAddressMapPickerFragment<e0g> implements df4, ac9 {
    public static final int $stable = 8;
    public static final vb9 Companion = new vb9();
    private static final double RADIUS_COEF = 1.2d;
    public yvf0 basePorchNumberInputRouter;
    public l56 blockedZonesHandler;
    private bc9 changeOrderSourcePointInitData;
    private final ig9 changeSourcePointPinStateRepository = new ig9(getAddressResolveRepository());
    public wdt0 drawableFactory;
    private xm00 mapObjectCollection;
    public r870 openTaxiOrderRouter;
    private com.yandex.go.taxi.order.change.source.mvp.d presenter;
    public xb9 presenterFactory;
    public uo21 userLocationOverlay;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _get_porchButton_$lambda$0(ChangeOrderSourceAddressFragment changeOrderSourceAddressFragment) {
        com.yandex.go.taxi.order.change.source.mvp.d dVar = changeOrderSourceAddressFragment.presenter;
        if (dVar == null) {
            dVar = null;
        }
        dVar.Mg(ChangePointInActiveOrderAnalytics$ButtonNameV2.Entrance);
        changeOrderSourceAddressFragment.openEntranceInput();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindViewsInFields$lambda$0(ChangeOrderSourceAddressFragment changeOrderSourceAddressFragment) {
        com.yandex.go.taxi.order.change.source.mvp.d dVar = changeOrderSourceAddressFragment.presenter;
        if (dVar == null) {
            dVar = null;
        }
        dVar.Mg(ChangePointInActiveOrderAnalytics$ButtonNameV2.Back);
        changeOrderSourceAddressFragment.onBack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindViewsInFields$lambda$2$0(ChangeOrderSourceAddressFragment changeOrderSourceAddressFragment) {
        com.yandex.go.taxi.order.change.source.mvp.d dVar = changeOrderSourceAddressFragment.presenter;
        if (dVar == null) {
            dVar = null;
        }
        dVar.Mg(ChangePointInActiveOrderAnalytics$ButtonNameV2.Done);
        com.yandex.go.taxi.order.change.source.mvp.d dVar2 = changeOrderSourceAddressFragment.presenter;
        (dVar2 != null ? dVar2 : null).f();
    }

    private final ButtonComponent getPorchButton() {
        ButtonComponent buttonComponent = new ButtonComponent(requireContext(), null, 0, 6, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMarginEnd(ru.yandex.taxi.design.utils.c.d(mrg0.go_design_m_space, asView()));
        buttonComponent.setLayoutParams(layoutParams);
        buttonComponent.setButtonSize(0);
        buttonComponent.setRoundedCornersRadius(ru.yandex.taxi.design.utils.c.h(100, asView()));
        buttonComponent.setButtonBackground(ru.yandex.taxi.design.utils.c.c(xng0.controlMinor, asView()));
        buttonComponent.setButtonTitleColor(ru.yandex.taxi.design.utils.c.c(xng0.textOnControlMinor, asView()));
        buttonComponent.setTextSize(0, ru.yandex.taxi.design.utils.c.d(mrg0.component_text_size_caption, asView()));
        buttonComponent.setText(ru.yandex.taxi.design.utils.c.G(kyh0.summary_porch_button_label, asView()));
        buttonComponent.setVisibility(this.callback == 0 ? 8 : 0);
        buttonComponent.setDebounceClickListener(new ub9(this, 0));
        return buttonComponent;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [C, wb9] */
    private final void initCallback() {
        this.callback = new wb9((si00) this.callback, this);
    }

    private static final zy11 onViewCreated$lambda$0(ChangeOrderSourceAddressFragment changeOrderSourceAddressFragment) {
        changeOrderSourceAddressFragment.setStartPosition();
        return zy11.a;
    }

    private final void openEntranceInput() {
        Address address;
        oep0 screenStackNavigator = getScreenStackNavigator();
        yn5 yn5Var = new yn5(6, (i85) getBasePorchNumberInputRouter().get(), new cx7(29, this));
        pv0 addressInfo = getAddressInfo();
        ((pep0) screenStackNavigator).f(yn5Var, new mbe0((addressInfo == null || (address = addressInfo.a) == null) ? null : address.J1(), false), hxx.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 openEntranceInput$lambda$0(ChangeOrderSourceAddressFragment changeOrderSourceAddressFragment, String str) {
        pv0 addressInfo = changeOrderSourceAddressFragment.getAddressInfo();
        if (addressInfo != null) {
            addressInfo.a.v0(str);
            changeOrderSourceAddressFragment.changeAddressInfo(addressInfo);
        }
        com.yandex.go.taxi.order.change.source.mvp.d dVar = changeOrderSourceAddressFragment.presenter;
        if (dVar == null) {
            dVar = null;
        }
        dVar.K = str;
        return zy11.a;
    }

    private final void setStartPosition() {
        bc9 bc9Var = this.changeOrderSourcePointInitData;
        zzs zzsVar = (bc9Var == null ? null : bc9Var).c;
        if (bc9Var == null) {
            bc9Var = null;
        }
        double d = bc9Var.d * RADIUS_COEF;
        zzs e = srb1.e(zzsVar, d);
        zzs f = srb1.f(zzsVar, d);
        ah00 mapController = getMapController();
        Polyline polyline = ru.yandex.taxi.map.utils.a.b;
        ((gh00) mapController).B(new BoundingBox(new Point(f.a, f.b), new Point(e.a, e.b)), null, 300.0f, null);
        onMapDragged();
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
        return PointType.SOURCE;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AbstractAddressMapPickerFragment, ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public void bindViewsInFields() {
        super.bindViewsInFields();
        FloatButtonIconComponent floatButtonIconComponent = this.backButton;
        if (floatButtonIconComponent != null) {
            floatButtonIconComponent.setDebounceClickListener(new ub9(this, 1));
        }
        ListItemComponent listItemComponent = this.addressTitleItem;
        if (listItemComponent != null) {
            listItemComponent.setTitleTypeface(5);
            listItemComponent.setSubtitleTextSizePx(ru.yandex.taxi.design.utils.c.d(mrg0.component_text_size_body, asView()));
            listItemComponent.setVisibility(0);
            listItemComponent.clearTrailView();
        }
        ButtonComponent confirm = getConfirm();
        if (confirm != null) {
            xw31.A(m810.b(confirm.getResources().getDimension(mrg0.go_design_s_space)), confirm);
            confirm.setDebounceClickListener(new ub9(this, 2));
        }
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public boolean blockedZonesAlertsEnabled() {
        return false;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public l56 blockedZonesHandler() {
        return getBlockedZonesHandler();
    }

    @Override // defpackage.ac9
    public void changeAutoLocateButtonVisibility(boolean isVisible) {
        changeAutoLocateButtonState(new c7p(isVisible, true));
    }

    @Override // defpackage.ac9
    public void changeBackButtonVisibility(boolean isVisible) {
        changeBackButtonState(new c7p(isVisible, true));
    }

    @Override // defpackage.ac9
    public void changePinState(vf9 state) {
        this.changeSourcePointPinStateRepository.b.l(state);
    }

    @Override // defpackage.ac9
    public void changePorchNumber(String porchNumber) {
        onBack();
        si00 si00Var = (si00) this.callback;
        if (si00Var != null) {
            si00Var.h(porchNumber);
        }
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public String forcedCurrentMode() {
        return "change_taxi_source";
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public String getAddressTitle(Address address) {
        String t = q5z.t(requireContext(), address);
        if (t == null || evu0.J(t)) {
            t = null;
        }
        return t == null ? super.getAddressTitle(address) : t;
    }

    public final yvf0 getBasePorchNumberInputRouter() {
        yvf0 yvf0Var = this.basePorchNumberInputRouter;
        if (yvf0Var != null) {
            return yvf0Var;
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

    public final wdt0 getDrawableFactory() {
        wdt0 wdt0Var = this.drawableFactory;
        if (wdt0Var != null) {
            return wdt0Var;
        }
        return null;
    }

    public final r870 getOpenTaxiOrderRouter() {
        r870 r870Var = this.openTaxiOrderRouter;
        if (r870Var != null) {
            return r870Var;
        }
        return null;
    }

    public final xb9 getPresenterFactory() {
        xb9 xb9Var = this.presenterFactory;
        if (xb9Var != null) {
            return xb9Var;
        }
        return null;
    }

    public final uo21 getUserLocationOverlay() {
        uo21 uo21Var = this.userLocationOverlay;
        if (uo21Var != null) {
            return uo21Var;
        }
        return null;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public boolean hasPickupPointsOnMap() {
        return true;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public boolean isBackButtonVisible() {
        return true;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public boolean isShowPanoramaButton() {
        return true;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment, defpackage.iy0
    public void onAddressChanged(pv0 addressInfo) {
        super.onAddressChanged(addressInfo);
        AddressInputComponent addressInitialPointComponent = getAddressInitialPointComponent();
        if (addressInitialPointComponent == null || addressInfo == null) {
            return;
        }
        addressInitialPointComponent.setSubtitle(q5z.D(addressInfo.a));
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
        this.userLocationOverlay = c0gVar.D6();
        this.presenterFactory = (xb9) e0gVar.l.a;
        this.drawableFactory = c0gVar.g6();
        this.openTaxiOrderRouter = (r870) c0gVar.Ym.get();
        this.basePorchNumberInputRouter = c0gVar.Fo;
        this.mapObjectCollection = ((gh00) getMapController()).i.p();
        initCallback();
        xb9 presenterFactory = getPresenterFactory();
        bc9 bc9Var = this.changeOrderSourcePointInitData;
        if (bc9Var == null) {
            bc9Var = null;
        }
        w3i w3iVar = ((zb9) presenterFactory).a;
        com.yandex.go.taxi.order.change.source.mvp.d dVar = new com.yandex.go.taxi.order.change.source.mvp.d(bc9Var, (com.yandex.go.taxi.order.change.source.interactor.a) ((s90) w3iVar.b).get(), (ru.yandex.taxi.search.c) ((xvf0) w3iVar.c).get(), (com.yandex.go.taxi.order.change.source.interactor.c) ((xvf0) w3iVar.w).get(), (tt2) ((xvf0) w3iVar.x).get(), (pav) ((xvf0) w3iVar.y).get(), (com.yandex.go.taxi.order.change.source.interactor.e) ((xvf0) w3iVar.z).get(), (com.yandex.go.taxi.order.change.common.domain.d) ((xvf0) w3iVar.A).get(), (wf9) ((ba9) w3iVar.B).get());
        this.presenter = dVar;
        dVar.Kg(this);
        getUserLocationOverlay().attach();
    }

    @Override // defpackage.ac9
    public void onBack() {
        requireActivity().onBackPressed();
    }

    @Override // defpackage.df4
    public boolean onBackPressed() {
        si00 si00Var = (si00) this.callback;
        if (si00Var != null) {
            si00Var.d();
        }
        r870 openTaxiOrderRouter = getOpenTaxiOrderRouter();
        bc9 bc9Var = this.changeOrderSourcePointInitData;
        if (bc9Var == null) {
            bc9Var = null;
        }
        ((com.yandex.go.superapp.impl.router.a) openTaxiOrderRouter).b(bc9Var.a.b(), true, DetailsOpenReason.AUTO, TaxiCardNavigationAction.EMPTY, new we8(29));
        return false;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment, ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        getAddressMapInteractor().e.getClass();
    }

    @Override // ru.yandex.taxi.fragment.MapFragment, ru.yandex.taxi.fragment.YandexTaxiFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        getUserLocationOverlay().detach();
        xm00 xm00Var = ((gh00) getMapController()).i;
        xm00 xm00Var2 = this.mapObjectCollection;
        if (xm00Var2 == null) {
            xm00Var2 = null;
        }
        xm00Var.o(xm00Var2);
        xm00 xm00Var3 = this.mapObjectCollection;
        if (xm00Var3 == null) {
            xm00Var3 = null;
        }
        xm00Var3.m();
        com.yandex.go.taxi.order.change.source.mvp.d dVar = this.presenter;
        if (dVar == null) {
            dVar = null;
        }
        dVar.Cg();
        AddressInputComponent addressInitialPointComponent = getAddressInitialPointComponent();
        if (addressInitialPointComponent != null) {
            addressInitialPointComponent.setLeadBackground(null);
        }
        super.onDetach();
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public void onLocationClick(boolean requestLocation) {
        com.yandex.go.taxi.order.change.source.mvp.d dVar = this.presenter;
        if (dVar == null) {
            dVar = null;
        }
        dVar.Mg(ChangePointInActiveOrderAnalytics$ButtonNameV2.Geo);
        super.onLocationClick(requestLocation);
    }

    @Override // defpackage.ac9
    public void onSourceAddressChanged(pv0 addressInfo) {
        si00 si00Var = (si00) this.callback;
        if (si00Var != null) {
            si00Var.c(addressInfo);
        }
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment, ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getAddressMapInteractor().e.getClass();
        getAddressMapInteractor().e.getClass();
        AddressInputComponent addressInitialPointComponent = getAddressInitialPointComponent();
        if (addressInitialPointComponent != null) {
            addressInitialPointComponent.setMode(AddressInputComponent.Mode.VIEW);
            addressInitialPointComponent.setComponentEnabled(false);
            addressInitialPointComponent.setTrailView(getPorchButton());
            addressInitialPointComponent.setLeadIconSize(ru.yandex.taxi.design.utils.c.h(40, asView()));
        }
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public RoutePointType pointType() {
        return RoutePointType.POINT_A;
    }

    public final void setBasePorchNumberInputRouter(yvf0 yvf0Var) {
        this.basePorchNumberInputRouter = yvf0Var;
    }

    public final void setBlockedZonesHandler(l56 l56Var) {
        this.blockedZonesHandler = l56Var;
    }

    public final void setDrawableFactory(wdt0 wdt0Var) {
        this.drawableFactory = wdt0Var;
    }

    public final void setOpenTaxiOrderRouter(r870 r870Var) {
        this.openTaxiOrderRouter = r870Var;
    }

    public final void setPresenterFactory(xb9 xb9Var) {
        this.presenterFactory = xb9Var;
    }

    public final void setUserLocationOverlay(uo21 uo21Var) {
        this.userLocationOverlay = uo21Var;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public b1c0 setupPinV2DataRepository() {
        return new com.yandex.go.taxi.order.change.source.analytics.pin.e(new me0(requireContext(), (byte) 0), this.changeSourcePointPinStateRepository, getPinWithStanExperimentRepository());
    }

    @Override // defpackage.ac9
    public void showAvailableCircle(wa4 circleData) {
        zzs zzsVar = circleData.a;
        vub vubVar = new vub(new Circle(new Point(zzsVar.a, zzsVar.b), circleData.d));
        vubVar.r(circleData.b);
        vubVar.u(circleData.c);
        vubVar.p(2.0f);
        Map map = ((gh00) getMapController()).b;
        if (map != null) {
            map.setBuildingsHeightScale(0.0f, 0.0f);
        }
        xm00 xm00Var = this.mapObjectCollection;
        if (xm00Var == null) {
            xm00Var = null;
        }
        xm00Var.getClass();
        vubVar.b(xm00Var);
    }

    @Override // defpackage.ac9
    public void showDefaultIcon() {
        AddressInputComponent addressInitialPointComponent = getAddressInitialPointComponent();
        if (addressInitialPointComponent != null) {
            addressInitialPointComponent.setLeadImage(getDrawableFactory().a(((ru.yandex.taxi.styling.f) getPinStyleProvider()).b(true).a));
        }
    }

    @Override // defpackage.ac9
    public void showIcon(kdc backgroundColor, kdc iconColor, Bitmap icon) {
        AddressInputComponent addressInitialPointComponent = getAddressInitialPointComponent();
        if (addressInitialPointComponent != null) {
            if (backgroundColor != null) {
                Drawable t = vng.t(zyg0.address_item_icon_background, requireContext());
                if (t != null) {
                    t.setTint(s8o.m(backgroundColor, requireContext()));
                    addressInitialPointComponent.setLeadBackground(t);
                }
            }
            addressInitialPointComponent.setLeadMargins(m810.b(addressInitialPointComponent.getResources().getDimension(mrg0.go_design_s_space)));
            addressInitialPointComponent.setLeadImage(icon);
            if (iconColor != null) {
                addressInitialPointComponent.setLeadImageTint(s8o.m(iconColor, requireContext()));
            }
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

    @Override // defpackage.ac9
    public void updateConfirmButton(z2e state) {
        changeConfirmButtonState(state);
    }

    @Override // defpackage.ac9
    public void updateTitles(ChangeSourcePointExperiment experiment) {
        ListItemComponent listItemComponent = this.addressTitleItem;
        if (listItemComponent != null) {
            listItemComponent.setTitle(d6z.Y(experiment, experiment.d.b));
        }
        ListItemComponent listItemComponent2 = this.addressTitleItem;
        if (listItemComponent2 != null) {
            listItemComponent2.setSubtitle(d6z.Y(experiment, experiment.d.a));
        }
    }
}

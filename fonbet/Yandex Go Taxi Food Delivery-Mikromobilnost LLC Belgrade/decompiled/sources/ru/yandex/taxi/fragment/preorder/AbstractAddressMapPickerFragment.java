package ru.yandex.taxi.fragment.preorder;

import android.view.View;
import com.yandex.go.navigation.screen.api.Screen;
import defpackage.a41;
import defpackage.c7p;
import defpackage.f1h0;
import defpackage.ihf;
import defpackage.jcs;
import defpackage.kzi;
import defpackage.ny61;
import defpackage.si00;
import defpackage.u0j;
import defpackage.udh0;
import defpackage.xw31;
import defpackage.yph0;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.preorder.source.pickup.PickupPointAnalytics$PointType;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0011\u001a\u00020\u0010H\u0015¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0014¢\u0006\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0004@\u0004X\u0085\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0004@\u0004X\u0085\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\"\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010\n\"\u0004\b'\u0010\u000eR\u0014\u0010+\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lru/yandex/taxi/fragment/preorder/AbstractAddressMapPickerFragment;", "Ljcs;", CA20Status.STATUS_USER_I, "Lru/yandex/taxi/fragment/preorder/AddressMapFragment;", "Lsi00;", "Lihf;", "<init>", "()V", "Lu0j;", "getEditMode", "()Lu0j;", "mode", "Lzy11;", "setEditMode", "(Lu0j;)V", "bindViewsInFields", "", "getLayoutId", "()I", "La41;", "uiState", "renderUiState", "(La41;)V", "", "hasSettings", "()Z", "getPickupPointAnchoredDrawableResId", "()Ljava/lang/Integer;", "Lru/yandex/taxi/preorder/source/pickup/PickupPointAnalytics$PointType;", "getPickupPointType", "()Lru/yandex/taxi/preorder/source/pickup/PickupPointAnalytics$PointType;", "Lru/yandex/taxi/design/ListItemComponent;", "addressTitleItem", "Lru/yandex/taxi/design/ListItemComponent;", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "backButton", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "Lu0j;", "getMode", "setMode", "", "getBusinessName", "()Ljava/lang/String;", "businessName", "Lcom/yandex/go/navigation/screen/api/Screen;", "getTrackedScreen", "()Lcom/yandex/go/navigation/screen/api/Screen;", "trackedScreen", "map_fragment"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class AbstractAddressMapPickerFragment<I extends jcs> extends AddressMapFragment<si00, I> implements ihf {
    protected ListItemComponent addressTitleItem;
    protected FloatButtonIconComponent backButton;
    private u0j mode = kzi.a;

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public void bindViewsInFields() {
        View asView;
        int i;
        super.bindViewsInFields();
        FloatButtonIconComponent floatButtonIconComponent = (FloatButtonIconComponent) nonNullViewById(udh0.back_button);
        this.backButton = floatButtonIconComponent;
        if (floatButtonIconComponent == null) {
            ny61.r("backButton must be bound");
            return;
        }
        if (xw31.n(requireContext())) {
            asView = asView();
            i = 12;
        } else {
            asView = asView();
            i = -12;
        }
        floatButtonIconComponent.setTranslationX(ru.yandex.taxi.design.utils.c.j(i, asView));
        this.addressTitleItem = (ListItemComponent) nonNullViewById(udh0.component_route_point_address_title);
    }

    @Override // ru.yandex.taxi.fragment.BaseFragment
    public String getBusinessName() {
        return "dest_location";
    }

    /* renamed from: getEditMode, reason: from getter */
    public final u0j getMode() {
        return this.mode;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public int getLayoutId() {
        return yph0.common_address_on_map_picker_fragment;
    }

    public final u0j getMode() {
        return this.mode;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public Integer getPickupPointAnchoredDrawableResId() {
        return Integer.valueOf(f1h0.route_selected_dest_point);
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public PickupPointAnalytics$PointType getPickupPointType() {
        return PickupPointAnalytics$PointType.DESTINATION;
    }

    /* renamed from: getTrackedScreen */
    public Screen getScreen() {
        return Screen.CHOOSE_B;
    }

    @Override // ru.yandex.taxi.fragment.MapFragment, ru.yandex.taxi.fragment.YandexTaxiFragment
    public boolean hasSettings() {
        return false;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment, defpackage.iy0
    public void renderUiState(a41 uiState) {
        super.renderUiState(uiState);
        c7p c7pVar = uiState.a;
        updateViewVisibility(this.backButton, c7pVar.a);
        FloatButtonIconComponent floatButtonIconComponent = this.backButton;
        if (floatButtonIconComponent != null) {
            floatButtonIconComponent.setEnabled(c7pVar.b);
        } else {
            ny61.r("backButton must be bound");
        }
    }

    public final void setEditMode(u0j mode) {
        this.mode = mode;
    }

    public final void setMode(u0j u0jVar) {
        this.mode = u0jVar;
    }
}

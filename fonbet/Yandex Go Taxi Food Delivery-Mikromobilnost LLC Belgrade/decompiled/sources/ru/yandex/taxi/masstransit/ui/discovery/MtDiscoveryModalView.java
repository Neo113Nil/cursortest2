package ru.yandex.taxi.masstransit.ui.discovery;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.ce0;
import defpackage.dwc;
import defpackage.eg3;
import defpackage.ft20;
import defpackage.gh00;
import defpackage.gzr0;
import defpackage.mmw;
import defpackage.mo21;
import defpackage.mqg0;
import defpackage.mrg0;
import defpackage.ni30;
import defpackage.ny61;
import defpackage.qdb1;
import defpackage.qje;
import defpackage.rwj;
import defpackage.sf30;
import defpackage.t1w;
import defpackage.tf30;
import defpackage.tje;
import defpackage.uf30;
import defpackage.uqh0;
import defpackage.w130;
import defpackage.wwj;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.xwj;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.ArrowsView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.floatbuttonholder.FloatButtonHolderLayout;
import ru.yandex.taxi.widget.floatbuttonholder.RotatableFloatButton;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001QB9\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001dH\u0014¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b$\u0010%J\u001d\u0010)\u001a\u00020\u001d2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&H\u0014¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u001dH\u0014¢\u0006\u0004\b+\u0010!J\u000f\u0010,\u001a\u00020\u001dH\u0014¢\u0006\u0004\b,\u0010!J\u0017\u00100\u001a\u00020/2\u0006\u0010.\u001a\u00020-H\u0017¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\"H\u0014¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u001dH\u0014¢\u0006\u0004\b4\u0010!J\u0017\u00107\u001a\u00020\u001d2\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020\u001d2\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u001dH\u0016¢\u0006\u0004\b=\u0010!J!\u0010A\u001a\u00020\u001d2\u0006\u0010?\u001a\u00020>2\b\u0010@\u001a\u0004\u0018\u00010>H\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u001dH\u0016¢\u0006\u0004\bC\u0010!J\u000f\u0010D\u001a\u00020\u001dH\u0016¢\u0006\u0004\bD\u0010!J\u000f\u0010E\u001a\u00020\u001dH\u0016¢\u0006\u0004\bE\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010FR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010GR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010HR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010M\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020\"8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bO\u00103¨\u0006R"}, d2 = {"Lru/yandex/taxi/masstransit/ui/discovery/MtDiscoveryModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lni30;", "Lrwj;", "Landroid/content/Context;", "context", "Lru/yandex/taxi/discovery/a;", "discoveryPresenter", "Lru/yandex/taxi/layers/presentation/optimalview/c;", "mapObservationPresenter", "Lwwj;", "discoveryUserLocationOverlay", "Ldwc;", "compassButtonPresenter", "Lgzr0;", "shortcutGridView", "<init>", "(Landroid/content/Context;Lru/yandex/taxi/discovery/a;Lru/yandex/taxi/layers/presentation/optimalview/c;Lwwj;Ldwc;Lgzr0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lni30;", "Lw130;", "insetsType", "()Lw130;", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "Lzy11;", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "onAttachedToWindow", "()V", "", "contentTop", "onModalViewAppear", "(I)V", "Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;", "Landroid/view/View;", "bottomSheetBehavior", "setInitialBehaviorState", "(Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;)V", "onDetachedFromWindow", "onSlideOut", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "animateDismissBackground", "Lmo21;", "userLocation", "updateUserLocation", "(Lmo21;)V", "", "azimuth", "updateAzimuth", "(F)V", "showError", "", "title", "subtitle", "showMessage", "(Ljava/lang/String;Ljava/lang/String;)V", "hideMessage", "showFirstUsageHint", "hideFirstUsageHint", "Lru/yandex/taxi/discovery/a;", "Lru/yandex/taxi/layers/presentation/optimalview/c;", "Lwwj;", "Ldwc;", "Lru/yandex/taxi/widget/floatbuttonholder/RotatableFloatButton;", "compassButton", "Lru/yandex/taxi/widget/floatbuttonholder/RotatableFloatButton;", "navBarScrimView", "Landroid/view/View;", "getCornerRadius", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "uf30", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MtDiscoveryModalView extends SlideableBindingModalView<ni30> implements rwj {
    public static final int $stable = 8;
    private final RotatableFloatButton compassButton;
    private final dwc compassButtonPresenter;
    private final ru.yandex.taxi.discovery.a discoveryPresenter;
    private final wwj discoveryUserLocationOverlay;
    private final ru.yandex.taxi.layers.presentation.optimalview.c mapObservationPresenter;
    private final View navBarScrimView;

    public MtDiscoveryModalView(Context context, ru.yandex.taxi.discovery.a aVar, ru.yandex.taxi.layers.presentation.optimalview.c cVar, wwj wwjVar, dwc dwcVar, gzr0 gzr0Var) {
        super(context);
        this.discoveryPresenter = aVar;
        this.mapObservationPresenter = cVar;
        this.discoveryUserLocationOverlay = wwjVar;
        this.compassButtonPresenter = dwcVar;
        View view = new View(context);
        view.setBackgroundColor(qje.t(xng0.bgMain, view.getContext()));
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0, 80));
        this.navBarScrimView = view;
        setDismissOnTouchOutside(false);
        cVar.E = Mode.INTERCITY;
        int i = 1;
        cVar.D = true;
        cVar.Ng(getModalScreenName());
        getBinding().a.addView(gzr0Var.getView(), new FrameLayout.LayoutParams(-1, -2));
        refreshNestedScrollView(gzr0Var.getView());
        qdb1.b(this, new sf30(i, this));
        FloatButtonHolderLayout c = eg3.c(this, 12);
        this.compassButton = eg3.a(c, new tf30(dwcVar, i));
        eg3.d(c, new mmw(aVar, i));
        setArrowState(ArrowsView.State.GONE);
        getBottomSheetBehavior().W = false;
        getBottomSheetBehavior().Z = false;
        addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 insetsType$lambda$0(MtDiscoveryModalView mtDiscoveryModalView, t1w t1wVar) {
        ((FrameLayout.LayoutParams) mtDiscoveryModalView.navBarScrimView.getLayoutParams()).height = t1wVar.d;
        mtDiscoveryModalView.navBarScrimView.requestLayout();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$0$onCompassButtonClicked(dwc dwcVar) {
        ((gh00) dwcVar.x).w();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismissBackground() {
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        this.navBarScrimView.setBackgroundColor(qje.t(xng0.bgMain, getContext()));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.transparent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public ni30 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(uqh0.mt_discovery_modal_view, parent, false);
        if (inflate != null) {
            return new ni30((GoFrameLayout) inflate);
        }
        ny61.t("rootView");
        return null;
    }

    @Override // defpackage.mq00
    public /* bridge */ void collapseForZoom() {
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: getCornerRadius */
    public int getCornersRadius() {
        return tje.r(mrg0.modal_view_corner_radius_huge, getContext());
    }

    @Override // defpackage.mq00
    public void hideFirstUsageHint() {
    }

    @Override // defpackage.mq00
    public void hideMessage() {
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public w130 insetsType() {
        return new w130(1, new ft20(14, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.discoveryPresenter.Mg(this);
        this.mapObservationPresenter.Lg(this);
        wwj wwjVar = this.discoveryUserLocationOverlay;
        if (wwjVar != null) {
            ((xwj) wwjVar).a.attach();
        }
        this.compassButtonPresenter.Kg(new uf30(this, 1));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.discoveryPresenter.Cg();
        this.mapObservationPresenter.Cg();
        wwj wwjVar = this.discoveryUserLocationOverlay;
        if (wwjVar != null) {
            ((xwj) wwjVar).a.detach();
        }
        this.compassButtonPresenter.Cg();
        post(new ce0(this, 15));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView
    public void onModalViewAppear(int contentTop) {
        super.onModalViewAppear(contentTop);
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService(AccessibilityManager.class);
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        getBottomSheetBehavior().O(3);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onSlideOut() {
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (xw31.o(getRootView(), getCardContentView(), event)) {
            return super.onTouchEvent(event);
        }
        return false;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void setInitialBehaviorState(AnchorBottomSheetBehavior<View> bottomSheetBehavior) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService(AccessibilityManager.class);
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.setInitialBehaviorState(bottomSheetBehavior);
        } else {
            bottomSheetBehavior.O(3);
        }
    }

    public void showError() {
    }

    @Override // defpackage.mq00
    public void showFirstUsageHint() {
    }

    @Override // defpackage.mq00
    public void showMessage(String title, String subtitle) {
    }

    @Override // defpackage.rwj
    public void updateAzimuth(float azimuth) {
        wwj wwjVar = this.discoveryUserLocationOverlay;
        if (wwjVar != null) {
            ((xwj) wwjVar).a.updateAzimuth(azimuth);
        }
    }

    @Override // defpackage.rwj
    public /* bridge */ void updateBadgeCount(int i) {
    }

    @Override // defpackage.rwj
    public void updateUserLocation(mo21 userLocation) {
        wwj wwjVar = this.discoveryUserLocationOverlay;
        if (wwjVar != null) {
            ((xwj) wwjVar).a(userLocation);
        }
    }
}

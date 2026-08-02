package ru.yandex.taxi.masstransit.ui.route.modal;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.b;
import defpackage.a2i0;
import defpackage.cta1;
import defpackage.dwh0;
import defpackage.e0h0;
import defpackage.e230;
import defpackage.f1h0;
import defpackage.ft20;
import defpackage.ii30;
import defpackage.jx30;
import defpackage.kyh0;
import defpackage.m020;
import defpackage.ndh0;
import defpackage.nx30;
import defpackage.ny61;
import defpackage.od8;
import defpackage.ox30;
import defpackage.px30;
import defpackage.rp31;
import defpackage.sf30;
import defpackage.su30;
import defpackage.t1w;
import defpackage.tje;
import defpackage.uqh0;
import defpackage.vng;
import defpackage.vx30;
import defpackage.w130;
import defpackage.wtb1;
import defpackage.xng0;
import defpackage.yln;
import defpackage.zy11;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.animation.LogarithmicInterpolator;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.design.BackButtonIconComponent;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.masstransit.analytic.MtDetailRouteCardCloseReason;
import ru.yandex.taxi.masstransit.analytic.MtDetailRouteCardOpenReason;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardSource;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardType;
import ru.yandex.taxi.masstransit.ui.route.modal.MtRoutesModalView;
import ru.yandex.taxi.masstransit.ui.route.modal.collapsed.MtCollapsedRoutesView;
import ru.yandex.taxi.masstransit.ui.route.modal.expanded.MtExpandedRoutesView;
import ru.yandex.taxi.widget.ArrowsView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \\2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002M]B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0019\u0010\u0011J\u000f\u0010\u001a\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\"\u001a\u00020\u000f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0014¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u001cH\u0014¢\u0006\u0004\b&\u0010'J\u001f\u0010+\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020(H\u0014¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020(2\u0006\u0010.\u001a\u00020(H\u0014¢\u0006\u0004\b/\u0010,J\u0019\u00102\u001a\u00020\u000f2\b\b\u0001\u00101\u001a\u000200H\u0014¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\u000f2\u0006\u00105\u001a\u000204H\u0014¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u000fH\u0014¢\u0006\u0004\b8\u0010\u0011J\u000f\u0010:\u001a\u000209H\u0014¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u001cH\u0014¢\u0006\u0004\b<\u0010\u001eJ\u0017\u0010?\u001a\u00020\u001c2\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u000fH\u0002¢\u0006\u0004\bC\u0010\u0011J\u0017\u0010E\u001a\u00020\u000f2\u0006\u0010D\u001a\u00020\u001cH\u0002¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020\u000f2\u0006\u0010G\u001a\u00020\u0005H\u0002¢\u0006\u0004\bH\u0010IR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010JR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010KR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010LR\u0018\u0010N\u001a\u00060MR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010RR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010W\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[¨\u0006^"}, d2 = {"Lru/yandex/taxi/masstransit/ui/route/modal/MtRoutesModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lpx30;", "Landroid/content/Context;", "context", "", "initialState", "Ljx30;", "presenter", "Lru/yandex/taxi/masstransit/ui/route/modal/collapsed/MtCollapsedRoutesView;", "collapsedView", "Lru/yandex/taxi/masstransit/ui/route/modal/expanded/MtExpandedRoutesView;", "expandedView", "<init>", "(Landroid/content/Context;ILjx30;Lru/yandex/taxi/masstransit/ui/route/modal/collapsed/MtCollapsedRoutesView;Lru/yandex/taxi/masstransit/ui/route/modal/expanded/MtExpandedRoutesView;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lpx30;", "onSlideOut", "getTopPadding", "()I", "", "canDragToExpandFromAnchored", "()Z", "Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;", "Landroid/view/View;", "behavior", "initBehavior", "(Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;)V", "newState", "movedByUser", "onBehaviorStateChanged", "(IZ)V", "Ljava/lang/Runnable;", "onAnimateShowStartAction", "onAnimateShowEndAction", "animateShow", "(Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "startAction", "endAction", "animateDismiss", "", "newOffset", "onDialogSlide", "(F)V", "", "duration", "animateShowBackground", "(J)V", "animateDismissBackground", "Le230;", "insetsType", "()Le230;", "hasCustomBackground", "Landroid/view/MotionEvent;", "ev", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "attachClickCatcher", "(Landroid/content/Context;)V", "actualizeAnchorOffset", "isAnchored", "updateContainersZ", "(Z)V", "count", "updateBadgeCount", "(I)V", "Ljx30;", "Lru/yandex/taxi/masstransit/ui/route/modal/collapsed/MtCollapsedRoutesView;", "Lru/yandex/taxi/masstransit/ui/route/modal/expanded/MtExpandedRoutesView;", "Lox30;", "inner", "Lox30;", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "focusRouteButton", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "backButton", "Lru/yandex/taxi/widget/ArrowsView;", "arrowsView", "Lru/yandex/taxi/widget/ArrowsView;", "lastSlide", "F", "Lru/yandex/taxi/animation/LogarithmicInterpolator;", "alphaInterpolator", "Lru/yandex/taxi/animation/LogarithmicInterpolator;", "Companion", "nx30", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MtRoutesModalView extends SlideableBindingModalView<px30> {
    public static final int $stable = 8;
    private static final float BOTTOM_CONTENT_Z_INDEX = 1.0f;
    private static final float CLICK_CATCHER_Z_INDEX = 2.0f;
    private static final nx30 Companion = new nx30();
    private static final float SELECTOR_APPEARANCE_EDGE = 0.3f;
    private static final float TOP_CONTENT_Z_INDEX = 3.0f;
    private final LogarithmicInterpolator alphaInterpolator;
    private final ArrowsView arrowsView;
    private final FloatButtonIconComponent backButton;
    private final MtCollapsedRoutesView collapsedView;
    private final MtExpandedRoutesView expandedView;
    private final FloatButtonIconComponent focusRouteButton;
    private final ox30 inner;
    private float lastSlide;
    private final jx30 presenter;

    /* JADX WARN: Multi-variable type inference failed */
    public MtRoutesModalView(Context context, int i, final jx30 jx30Var, MtCollapsedRoutesView mtCollapsedRoutesView, MtExpandedRoutesView mtExpandedRoutesView) {
        super(context, i);
        this.presenter = jx30Var;
        this.collapsedView = mtCollapsedRoutesView;
        this.expandedView = mtExpandedRoutesView;
        this.inner = new ox30(this);
        final int i2 = 0;
        Runnable runnable = new Runnable() { // from class: mx30
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                jx30 jx30Var2 = jx30Var;
                switch (i3) {
                    case 0:
                        MtRoutesModalView.focusRouteButton$onFocusRoute(jx30Var2);
                        break;
                    default:
                        MtRoutesModalView.backButton$backPressed(jx30Var2);
                        break;
                }
            }
        };
        int i3 = f1h0.ic_route;
        FloatButtonIconComponent floatButtonIconComponent = new FloatButtonIconComponent(getContext(), null, 0, a2i0.FloatButtonIconStyle, 4, null);
        floatButtonIconComponent.setDebounceClickListener(runnable);
        floatButtonIconComponent.setLayoutParams(new ViewGroup.LayoutParams(-2, tje.u(90, floatButtonIconComponent.getContext())));
        floatButtonIconComponent.setIcon(i3);
        focusRouteButton$lambda$0(floatButtonIconComponent);
        addFloatButton(floatButtonIconComponent, 8388613);
        this.focusRouteButton = floatButtonIconComponent;
        final int i4 = 1;
        Runnable runnable2 = new Runnable() { // from class: mx30
            @Override // java.lang.Runnable
            public final void run() {
                int i32 = i4;
                jx30 jx30Var2 = jx30Var;
                switch (i32) {
                    case 0:
                        MtRoutesModalView.focusRouteButton$onFocusRoute(jx30Var2);
                        break;
                    default:
                        MtRoutesModalView.backButton$backPressed(jx30Var2);
                        break;
                }
            }
        };
        Object[] objArr = 0 == true ? 1 : 0;
        BackButtonIconComponent backButtonIconComponent = new BackButtonIconComponent(getContext(), objArr, 0, a2i0.FloatButtonIconStyle, 4, null);
        backButtonIconComponent.setDebounceClickListener(runnable2);
        backButtonIconComponent.setLayoutParams(new ViewGroup.LayoutParams(-2, tje.u(90, backButtonIconComponent.getContext())));
        backButton$lambda$0(backButtonIconComponent);
        addFloatButton(backButtonIconComponent, 8388611);
        this.backButton = backButtonIconComponent;
        int i5 = ndh0.slideable_modal_view_arrows;
        WeakHashMap weakHashMap = b.a;
        ArrowsView arrowsView = (ArrowsView) ((View) rp31.d(this, i5));
        this.arrowsView = arrowsView;
        this.lastSlide = -1.0f;
        this.alphaInterpolator = new LogarithmicInterpolator(0.2f, 1.0f);
        setCardMode(SlideableModalView.CardMode.SLIDEABLE_CARD);
        setClickable(false);
        setClipToPadding(false);
        setClipChildren(false);
        getBottomSheet().setBackground(vng.t(e0h0.bg_round_modal_view_radius_big, getContext()));
        getBottomSheet().setClipChildren(false);
        getBottomSheet().addOnLayoutChangeListener(new yln(4, this));
        c.z(new m020(27, this), arrowsView);
        attachClickCatcher(context);
        ((px30) getBinding()).a.addView(mtCollapsedRoutesView, -1, -2);
        ((px30) getBinding()).a.addView(mtExpandedRoutesView, -1, -1);
        updateContainersZ(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$1(MtRoutesModalView mtRoutesModalView) {
        if (mtRoutesModalView.isAnchored()) {
            jx30 jx30Var = mtRoutesModalView.presenter;
            jx30Var.getClass();
            MtDetailRouteCardOpenReason mtDetailRouteCardOpenReason = MtDetailRouteCardOpenReason.HANDLER_TAP;
            su30 d = jx30Var.E.d();
            if (d != null) {
                jx30Var.C.a(cta1.e(d), wtb1.e(mtDetailRouteCardOpenReason), wtb1.f(mtDetailRouteCardOpenReason), wtb1.d(d.a));
            }
            MtRoutesModalView mtRoutesModalView2 = ((vx30) jx30Var.x.a).U;
            if (mtRoutesModalView2 != null) {
                mtRoutesModalView2.expand();
            }
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void actualizeAnchorOffset() {
        Object value;
        Rect rect;
        int max = Math.max(getHeight() - this.collapsedView.getHeight(), 0);
        AnchorBottomSheetBehavior<View> bottomSheetBehavior = getBottomSheetBehavior();
        if (bottomSheetBehavior.w(bottomSheetBehavior.x) != max) {
            getBottomSheetBehavior().M(this.collapsedView.getHeight(), false);
            getBottomSheetBehavior().G(max, false);
            jx30 jx30Var = this.presenter;
            int height = this.collapsedView.getHeight();
            r0 r0Var = jx30Var.y.a;
            do {
                value = r0Var.getValue();
                rect = (Rect) value;
            } while (!r0Var.k(value, new Rect(rect.left, rect.top, rect.right, height)));
        }
    }

    private final void attachClickCatcher(Context context) {
        View view = new View(context);
        view.setZ(2.0f);
        view.setOnClickListener(new od8(5));
        view.setImportantForAccessibility(2);
        getBinding().a.addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachClickCatcher$lambda$0$0(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void backButton$backPressed(jx30 jx30Var) {
        ((vx30) jx30Var.x.a).T();
    }

    private static final zy11 backButton$lambda$0(FloatButtonIconComponent floatButtonIconComponent) {
        floatButtonIconComponent.setBadgeBackgroundColor(c.c(xng0.controlMain, floatButtonIconComponent));
        floatButtonIconComponent.setBadgeTextColorAttr(xng0.textOnControl);
        c.y(floatButtonIconComponent, true);
        return zy11.a;
    }

    private static final zy11 focusRouteButton$lambda$0(FloatButtonIconComponent floatButtonIconComponent) {
        floatButtonIconComponent.setContentDescription(c.G(kyh0.summory_route_show_description, floatButtonIconComponent));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void focusRouteButton$onFocusRoute(jx30 jx30Var) {
        jx30Var.D.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 insetsType$lambda$0(MtRoutesModalView mtRoutesModalView, t1w t1wVar) {
        mtRoutesModalView.setTopSystemWindowInset(t1wVar.b);
        mtRoutesModalView.collapsedView.applyInsets(t1wVar);
        mtRoutesModalView.expandedView.applyInsets(t1wVar);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(MtRoutesModalView mtRoutesModalView) {
        if (mtRoutesModalView.getBottomSheetBehavior().y() == 3) {
            mtRoutesModalView.collapse();
        } else {
            ((vx30) mtRoutesModalView.presenter.x.a).T();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateBadgeCount(int count) {
        FloatButtonIconComponent floatButtonIconComponent = this.backButton;
        if (count <= 0) {
            floatButtonIconComponent.setBadgeText(null);
            floatButtonIconComponent.setBadgeContentDescription(null);
        } else {
            floatButtonIconComponent.setBadgeText(String.valueOf(count));
            floatButtonIconComponent.setBadgeContentDescription(c.v(floatButtonIconComponent, dwh0.active_orders_counter_content_description, kyh0.active_orders_counter_one_content_description, count, Integer.valueOf(count)));
        }
    }

    private final void updateContainersZ(boolean isAnchored) {
        this.collapsedView.setZ(isAnchored ? 3.0f : 1.0f);
        this.expandedView.setZ(isAnchored ? 1.0f : 3.0f);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismiss(Runnable startAction, Runnable endAction) {
        startAction.run();
        endAction.run();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismissBackground() {
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateShow(Runnable onAnimateShowStartAction, Runnable onAnimateShowEndAction) {
        onAnimateShowStartAction.run();
        onAnimateShowEndAction.run();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateShowBackground(long duration) {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public px30 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(uqh0.mt_routes_modal_view, parent, false);
        if (inflate != null) {
            return new px30((FrameLayout) inflate);
        }
        ny61.t("rootView");
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: canDragToExpandFromAnchored */
    public boolean getCanDragToExpandedState() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getTopPadding() {
        return 0;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: hasCustomBackground */
    public boolean getHasCustomBackgroundColor() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void initBehavior(AnchorBottomSheetBehavior<View> behavior) {
        super.initBehavior(behavior);
        getBottomSheetBehavior().W = false;
        getBottomSheetBehavior().Z = false;
        getBottomSheetBehavior().J(true);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new w130(1, new ft20(25, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setDismissOnTouchOutside(false);
        setDismissOnBackPressed(false);
        int i = 4;
        setOnBackPressedListener(new sf30(i, this));
        setOnTouchOutsideListener(null);
        jx30 jx30Var = this.presenter;
        ox30 ox30Var = this.inner;
        jx30Var.Bg(ox30Var);
        tje.N(jx30Var.Jg(), null, null, new MtRoutesModalPresenter$attachView$1(jx30Var, null), 3);
        tje.N(jx30Var.Jg(), null, null, new MtRoutesModalPresenter$attachView$$inlined$safeCollectIn$1(e.t(e.n(e.d(jx30Var.E.i), e.d(jx30Var.D.c.a), jx30Var.z.a(), new MtRoutesModalPresenter$attachView$2(4, null))), null, ox30Var), 3);
        this.expandedView.onExpandChange(getBottomSheetBehavior().E == 3);
        OneShotPreDrawListener.add(this, new ii30(i, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onBehaviorStateChanged(int newState, boolean movedByUser) {
        super.onBehaviorStateChanged(newState, movedByUser);
        if (isExpanded() && movedByUser) {
            jx30 jx30Var = this.presenter;
            jx30Var.getClass();
            MtDetailRouteCardOpenReason mtDetailRouteCardOpenReason = MtDetailRouteCardOpenReason.PULL;
            su30 d = jx30Var.E.d();
            if (d != null) {
                jx30Var.C.a(cta1.e(d), wtb1.e(mtDetailRouteCardOpenReason), wtb1.f(mtDetailRouteCardOpenReason), wtb1.d(d.a));
            }
        }
        if (isAnchored() && movedByUser) {
            this.presenter.B.a(MtDetailRouteCardCloseReason.PULL, TransportRouteAnalytics$DetailCardSource.Transport, TransportRouteAnalytics$DetailCardType.Horizontal);
        }
        this.expandedView.onExpandChange(isExpanded());
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onDialogSlide(float newOffset) {
        float interpolation;
        float f;
        super.onDialogSlide(newOffset);
        float x = getBottomSheetBehavior().x();
        float max = Float.compare(x, 1.0f) == 0 ? 0.0f : Math.max(0.0f, (newOffset - x) / (1.0f - x));
        if (Float.compare(newOffset, x) > 0 && Float.compare(x, 1.0f) == 0) {
            max = 1.0f;
        }
        if (Float.compare(this.lastSlide, max) == 0) {
            return;
        }
        this.lastSlide = max;
        int compare = Float.compare(max, 0.3f);
        LogarithmicInterpolator logarithmicInterpolator = this.alphaInterpolator;
        if (compare == 1) {
            f = logarithmicInterpolator.getInterpolation((max - 0.3f) / 0.7f);
            interpolation = 0.0f;
        } else {
            interpolation = logarithmicInterpolator.getInterpolation(1.0f - (max / 0.3f));
            f = 0.0f;
        }
        if (Float.compare(max, 0.0f) == 0) {
            updateContainersZ(true);
        } else if (Float.compare(max, 0.0f) == 1) {
            updateContainersZ(false);
        }
        if (Float.compare(max, 1.0f) == 0) {
            refreshNestedScrollView(this.expandedView);
        } else if (Float.compare(max, 0.0f) == 0) {
            refreshNestedScrollView(this.collapsedView);
        }
        boolean z = Float.compare(max, 1.0f) == 0;
        this.arrowsView.setVisibility(z ? 8 : 0);
        this.collapsedView.setAlpha(z ? 0.0f : 1.0f - f);
        this.expandedView.setAlpha(f);
        this.expandedView.updateContentVisibility(z);
        this.collapsedView.onSlide((getRootView().getHeight() - getBottomSheetBehavior().a) * newOffset, interpolation);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        int actionMasked = ev.getActionMasked();
        if (actionMasked == 0) {
            this.presenter.C.b = true;
        } else if (actionMasked == 1) {
            this.presenter.C.b = false;
        }
        return super.onInterceptTouchEvent(ev);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onSlideOut() {
    }
}

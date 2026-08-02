package ru.yandex.taxi.logistics.dashboard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.aoi;
import defpackage.c2x0;
import defpackage.ceh0;
import defpackage.cma1;
import defpackage.d2x0;
import defpackage.e4i;
import defpackage.f4i;
import defpackage.g18;
import defpackage.gqh0;
import defpackage.hc00;
import defpackage.ic00;
import defpackage.j4i;
import defpackage.j73;
import defpackage.k4i;
import defpackage.kc00;
import defpackage.mqg0;
import defpackage.ny61;
import defpackage.qcp0;
import defpackage.qoi0;
import defpackage.tje;
import defpackage.uxh;
import defpackage.v130;
import defpackage.v52;
import defpackage.v8e;
import defpackage.xni;
import defpackage.xw31;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.logistics.dashboard.analytics.DeliveryDashboardOnScrollChangeListener;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001AB3\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u0015H\u0014¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00152\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u001cH\u0016¢\u0006\u0004\b-\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010.R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lru/yandex/taxi/logistics/dashboard/DeliveryDashboardCard;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lf4i;", "Landroid/content/Context;", "context", "Lj4i;", "presenter", "Lc2x0;", "systemBarsCoordinator", "Lru/yandex/taxi/logistics/dashboard/analytics/DeliveryDashboardOnScrollChangeListener;", "deliveryDashboardOnScrollChangeListener", "Lk4i;", "deliveryDashboardEngineFactory", "<init>", "(Landroid/content/Context;Lj4i;Lc2x0;Lru/yandex/taxi/logistics/dashboard/analytics/DeliveryDashboardOnScrollChangeListener;Lk4i;)V", "Lv130;", "insetsType", "()Lv130;", "", "screenName", "()Ljava/lang/String;", "", "canHandleScreenTracking", "()Z", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "newState", "movedByUser", "onBehaviorStateChanged", "(IZ)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lf4i;", "Landroid/view/MotionEvent;", "ev", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "getTopPadding", "Lj4i;", "Lc2x0;", "Lxni;", "engine", "Lxni;", "Landroid/view/View;", "scrollingChild", "Landroid/view/View;", "initialY", CA20Status.STATUS_USER_I, "", "tmpIntArray", "[I", "Lg18;", "coordinatorListenerCancellable", "Lg18;", "Lv52;", "clampPositionVerticalDelegate", "Lv52;", "e4i", "delivery_dashboard"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliveryDashboardCard extends SlideableBindingModalView<f4i> {
    private final v52 clampPositionVerticalDelegate;
    private g18 coordinatorListenerCancellable;
    private final xni engine;
    private int initialY;
    private final j4i presenter;
    private View scrollingChild;
    private final c2x0 systemBarsCoordinator;
    private final int[] tmpIntArray;

    public DeliveryDashboardCard(Context context, j4i j4iVar, c2x0 c2x0Var, DeliveryDashboardOnScrollChangeListener deliveryDashboardOnScrollChangeListener, k4i k4iVar) {
        super(context);
        this.presenter = j4iVar;
        this.systemBarsCoordinator = c2x0Var;
        qcp0 qcp0Var = k4iVar.a;
        this.engine = new aoi(k4iVar.b, k4iVar.c, k4iVar.d);
        this.tmpIntArray = new int[2];
        this.clampPositionVerticalDelegate = new v8e(15, this);
        getBinding().b.setOnScrollChangeListener(deliveryDashboardOnScrollChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer clampPositionVerticalDelegate$lambda$0(DeliveryDashboardCard deliveryDashboardCard, int i, int i2) {
        View view = deliveryDashboardCard.scrollingChild;
        boolean z = (view == null || view.canScrollVertically(-1)) ? false : true;
        deliveryDashboardCard.getBottomSheet().getLocationOnScreen(deliveryDashboardCard.tmpIntArray);
        boolean z2 = tje.u(164, deliveryDashboardCard.getContext()) + deliveryDashboardCard.tmpIntArray[1] > deliveryDashboardCard.initialY;
        if (i2 <= 0) {
            return null;
        }
        if (z && z2) {
            return null;
        }
        return Integer.valueOf(Math.min(i, j73.N(deliveryDashboardCard.getBottomSheetBehavior().w)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(DeliveryDashboardCard deliveryDashboardCard) {
        deliveryDashboardCard.scrollingChild = c.o(deliveryDashboardCard.getCardContentView());
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        ic00 ic00Var = ((kc00) this.presenter.x).a;
        ic00Var.getClass();
        return ic00Var instanceof hc00 ? mqg0.component_ever_back : mqg0.component_black_opacity_45;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public f4i bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        LayoutInflater from = LayoutInflater.from(getContext());
        ViewGroup cardContentContainer = getCardContentContainer();
        if (cardContentContainer == null) {
            ny61.t("parent");
            return null;
        }
        from.inflate(gqh0.delivery_dashboard_card, cardContentContainer);
        int i = ceh0.delivery_dashboard_content;
        FrameLayout frameLayout = (FrameLayout) cma1.O(i, cardContentContainer);
        if (frameLayout != null) {
            return new f4i(cardContentContainer, frameLayout);
        }
        ny61.t("Missing required view with ID: ".concat(cardContentContainer.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    public boolean canHandleScreenTracking() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getTopPadding() {
        return 0;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public v130 insetsType() {
        return new v130(3);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getBottomSheetBehavior().q0 = this.clampPositionVerticalDelegate;
        this.presenter.Bg(new e4i());
        this.engine.b(getBinding().b);
        post(new uxh(5, this));
        ((d2x0) this.systemBarsCoordinator).a(0, qoi0.a(DeliveryDashboardCard.class), false);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onBehaviorStateChanged(int newState, boolean movedByUser) {
        super.onBehaviorStateChanged(newState, movedByUser);
        if (newState == 6) {
            xw31.w(getBinding().b);
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        g18 g18Var = this.coordinatorListenerCancellable;
        if (g18Var != null) {
            g18Var.cancel();
        }
        this.engine.a();
        this.presenter.Cg();
        super.onDetachedFromWindow();
        ((d2x0) this.systemBarsCoordinator).b(qoi0.a(DeliveryDashboardCard.class));
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if (ev.getAction() == 0) {
            this.initialY = (int) ev.getY();
        }
        return super.onInterceptTouchEvent(ev);
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    /* renamed from: screenName */
    public String getModalScreenName() {
        return "cargo_toolbar";
    }
}

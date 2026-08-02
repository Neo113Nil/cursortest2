package ru.yandex.taxi.logistics.care.impl.router;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.c2x0;
import defpackage.cma1;
import defpackage.d2x0;
import defpackage.dqh0;
import defpackage.j73;
import defpackage.mqg0;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.sls;
import defpackage.sxh;
import defpackage.tje;
import defpackage.uxh;
import defpackage.v130;
import defpackage.v52;
import defpackage.v8e;
import defpackage.ydh0;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.widget.ArrowsView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001;B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\nH\u0014¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\nH\u0014¢\u0006\u0004\b%\u0010$J\u0017\u0010(\u001a\u00020\u00192\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010*R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010+R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001c\u00109\u001a\b\u0018\u000108R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lru/yandex/taxi/logistics/care/impl/router/DeliveryCareSlideableView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lsxh;", "Landroid/content/Context;", "context", "Landroid/view/View;", "webViewContent", "Lc2x0;", "systemBarsCoordinator", "Lkotlin/Function0;", "Lzy11;", "onSwipeDismiss", "<init>", "(Landroid/content/Context;Landroid/view/View;Lc2x0;Lsls;)V", "Lv130;", "insetsType", "()Lv130;", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;", "behavior", "initBehavior", "(Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;)V", "newState", "", "movedByUser", "onBehaviorStateChanged", "(IZ)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lsxh;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroid/view/MotionEvent;", "ev", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/view/View;", "Lc2x0;", "Lsls;", "", "swipeZonePx", "F", "initialY", CA20Status.STATUS_USER_I, "", "tmpIntArray", "[I", "Lv52;", "clampPositionVerticalDelegate", "Lv52;", "Lru/yandex/taxi/logistics/care/impl/router/DeliveryCareSlideableView$DragHandleView;", "dragHandleView", "Lru/yandex/taxi/logistics/care/impl/router/DeliveryCareSlideableView$DragHandleView;", "DragHandleView", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliveryCareSlideableView extends SlideableBindingModalView<sxh> {
    private final v52 clampPositionVerticalDelegate;
    private DragHandleView dragHandleView;
    private int initialY;
    private final sls onSwipeDismiss;
    private final float swipeZonePx;
    private final c2x0 systemBarsCoordinator;
    private final int[] tmpIntArray;
    private final View webViewContent;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/logistics/care/impl/router/DeliveryCareSlideableView$DragHandleView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Lru/yandex/taxi/logistics/care/impl/router/DeliveryCareSlideableView;Landroid/content/Context;)V", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lzy11;", "onDetachedFromWindow", "()V", "", "touchSlop", CA20Status.STATUS_USER_I, "downEvent", "Landroid/view/MotionEvent;", "isDragging", "Z", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public final class DragHandleView extends View {
        private MotionEvent downEvent;
        private boolean isDragging;
        private final int touchSlop;

        public DragHandleView(Context context) {
            super(context);
            this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            setLayoutParams(new FrameLayout.LayoutParams(-1, (int) DeliveryCareSlideableView.this.swipeZonePx));
        }

        @Override // android.view.View
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            MotionEvent motionEvent = this.downEvent;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
            this.downEvent = null;
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent event) {
            int actionMasked = event.getActionMasked();
            if (actionMasked == 0) {
                MotionEvent motionEvent = this.downEvent;
                if (motionEvent != null) {
                    motionEvent.recycle();
                }
                this.downEvent = MotionEvent.obtain(event);
                this.isDragging = false;
                return true;
            }
            if (actionMasked == 1) {
                if (!this.isDragging) {
                    MotionEvent motionEvent2 = this.downEvent;
                    if (motionEvent2 != null) {
                        DeliveryCareSlideableView.this.webViewContent.dispatchTouchEvent(motionEvent2);
                    }
                    DeliveryCareSlideableView.this.webViewContent.dispatchTouchEvent(event);
                }
                MotionEvent motionEvent3 = this.downEvent;
                if (motionEvent3 != null) {
                    motionEvent3.recycle();
                }
                this.downEvent = null;
                return true;
            }
            if (actionMasked == 2) {
                MotionEvent motionEvent4 = this.downEvent;
                if (motionEvent4 != null && !this.isDragging && Math.abs(event.getY() - motionEvent4.getY()) > this.touchSlop) {
                    this.isDragging = true;
                }
                return true;
            }
            if (actionMasked != 3) {
                return false;
            }
            MotionEvent motionEvent5 = this.downEvent;
            if (motionEvent5 != null) {
                motionEvent5.recycle();
            }
            this.downEvent = null;
            return true;
        }
    }

    public DeliveryCareSlideableView(Context context, View view, c2x0 c2x0Var, sls slsVar) {
        super(context, 4);
        this.webViewContent = view;
        this.systemBarsCoordinator = c2x0Var;
        this.onSwipeDismiss = slsVar;
        this.swipeZonePx = tje.x(context, 64.0f);
        this.tmpIntArray = new int[2];
        this.clampPositionVerticalDelegate = new v8e(13, this);
        setDismissOnBackPressed(false);
        setDismissOnTouchOutside(false);
        setArrowState(ArrowsView.State.GONE);
        setEnableBackgroundOnAppearing(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer clampPositionVerticalDelegate$lambda$0(DeliveryCareSlideableView deliveryCareSlideableView, int i, int i2) {
        deliveryCareSlideableView.getBottomSheet().getLocationOnScreen(deliveryCareSlideableView.tmpIntArray);
        boolean z = deliveryCareSlideableView.tmpIntArray[1] + ((int) deliveryCareSlideableView.swipeZonePx) > deliveryCareSlideableView.initialY;
        if (i2 <= 0 || z) {
            return null;
        }
        return Integer.valueOf(Math.min(i, j73.N(deliveryCareSlideableView.getBottomSheetBehavior().w)));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.component_ever_back;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public sxh bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        if (parent == null) {
            ny61.t("parent");
            return null;
        }
        inflater.inflate(dqh0.delivery_care_layout, parent);
        int i = ydh0.delivery_care_content;
        FrameLayout frameLayout = (FrameLayout) cma1.O(i, parent);
        if (frameLayout != null) {
            return new sxh(parent, frameLayout);
        }
        ny61.t("Missing required view with ID: ".concat(parent.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void initBehavior(AnchorBottomSheetBehavior<View> behavior) {
        super.initBehavior(behavior);
        behavior.C = false;
        behavior.K(0, true);
        behavior.c0 = true;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public v130 insetsType() {
        return new v130(3);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getBinding().b.addView(this.webViewContent);
        DragHandleView dragHandleView = new DragHandleView(getContext());
        getBinding().b.addView(dragHandleView);
        this.dragHandleView = dragHandleView;
        getBottomSheetBehavior().q0 = this.clampPositionVerticalDelegate;
        ((d2x0) this.systemBarsCoordinator).a(0, qoi0.a(DeliveryCareSlideableView.class), false);
        post(new uxh(0, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onBehaviorStateChanged(int newState, boolean movedByUser) {
        if (newState == 4 && movedByUser) {
            this.onSwipeDismiss.invoke();
        } else {
            super.onBehaviorStateChanged(newState, movedByUser);
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getBinding().b.removeView(this.webViewContent);
        DragHandleView dragHandleView = this.dragHandleView;
        if (dragHandleView != null) {
            getBinding().b.removeView(dragHandleView);
        }
        this.dragHandleView = null;
        ((d2x0) this.systemBarsCoordinator).b(qoi0.a(DeliveryCareSlideableView.class));
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if (ev.getAction() == 0) {
            this.initialY = (int) ev.getY();
        }
        return super.onInterceptTouchEvent(ev);
    }
}

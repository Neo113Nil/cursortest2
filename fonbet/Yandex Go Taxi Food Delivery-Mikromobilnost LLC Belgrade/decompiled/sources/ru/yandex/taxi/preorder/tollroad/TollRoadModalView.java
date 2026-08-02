package ru.yandex.taxi.preorder.tollroad;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.a2i0;
import defpackage.a3v;
import defpackage.g8e;
import defpackage.gci0;
import defpackage.gfh0;
import defpackage.gk1;
import defpackage.hrh0;
import defpackage.mqg0;
import defpackage.ndh0;
import defpackage.ntk0;
import defpackage.ons0;
import defpackage.otk0;
import defpackage.pxy0;
import defpackage.qpz0;
import defpackage.qqz0;
import defpackage.rp31;
import defpackage.rqz0;
import defpackage.teh;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wsr0;
import defpackage.x770;
import defpackage.xsr0;
import defpackage.zy11;
import java.util.HashMap;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.design.BackButtonIconComponent;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.button.OrderButtonComponent;
import ru.yandex.taxi.preorder.tollroad.analytics.TollRoadDialogAnalytics$Button;
import ru.yandex.taxi.preorder.tollroad.analytics.TollRoadDialogAnalytics$CloseReason;
import ru.yandex.taxi.preorder.tollroad.analytics.TollRoadDialogAnalytics$RoadType;
import ru.yandex.taxi.preorder.tollroad.analytics.TollRoadDialogAnalytics$ScrollDirection;
import ru.yandex.taxi.preorder.tollroad.analytics.TollRoadSetReason;
import ru.yandex.taxi.preorder.tollroad.data.RoadRestriction;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u00016B#\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0015\u0010\fJ\u000f\u0010\u0016\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0016\u0010\fJ\u000f\u0010\u0017\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0017\u0010\fJ\u000f\u0010\u0018\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0018\u0010\fJ\u000f\u0010\u0019\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0019\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u00020\u000f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u0014¨\u00067"}, d2 = {"Lru/yandex/taxi/preorder/tollroad/TollRoadModalView;", "Lru/yandex/taxi/widget/SlideableModalView;", "Landroid/content/Context;", "context", "Lqpz0;", "presenter", "La3v;", "focusCoordinator", "<init>", "(Landroid/content/Context;Lqpz0;La3v;)V", "Lzy11;", "setupRootView", "()V", "onAttachedToWindow", "onDetachedFromWindow", "", "contentTop", "onModalViewAppear", "(I)V", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "onDismissManually", "onArrowClick", "onSlideOut", "onBackPressed", "onTouchOutside", "Lqpz0;", "La3v;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "shimmering", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/yandex/taxi/design/ListItemComponent;", "titleView", "Lru/yandex/taxi/design/ListItemComponent;", "Lru/yandex/taxi/widget/RobotoTextView;", "descriptionView", "Lru/yandex/taxi/widget/RobotoTextView;", "Lru/yandex/taxi/design/button/OrderButtonComponent;", "orderButtonView", "Lru/yandex/taxi/design/button/OrderButtonComponent;", "Landroidx/core/widget/NestedScrollView;", "rootViewGroup", "Landroidx/core/widget/NestedScrollView;", "Landroid/view/ViewGroup;", "paidOptionsGroup", "Landroid/view/ViewGroup;", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "backButton", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "Lotk0;", "roadOptionsAdapter", "Lotk0;", "getCardContentViewLayoutRes", "cardContentViewLayoutRes", "rqz0", "dialog"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TollRoadModalView extends SlideableModalView {
    public static final int $stable = 8;
    private final FloatButtonIconComponent backButton;
    private final RobotoTextView descriptionView;
    private final a3v focusCoordinator;
    private final OrderButtonComponent orderButtonView;
    private final ViewGroup paidOptionsGroup;
    private final qpz0 presenter;
    private final otk0 roadOptionsAdapter;
    private final NestedScrollView rootViewGroup;
    private final ConstraintLayout shimmering;
    private final ListItemComponent titleView;

    public TollRoadModalView(Context context, qpz0 qpz0Var, a3v a3vVar) {
        super(context);
        this.presenter = qpz0Var;
        this.focusCoordinator = a3vVar;
        int i = gfh0.shimmering;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.shimmering = (ConstraintLayout) ((View) rp31.d(this, i));
        this.titleView = (ListItemComponent) ((View) rp31.d(this, gfh0.toll_road_title));
        this.descriptionView = (RobotoTextView) ((View) rp31.d(this, gfh0.toll_road_description));
        OrderButtonComponent orderButtonComponent = (OrderButtonComponent) ((View) rp31.d(this, gfh0.toll_road_order_button));
        this.orderButtonView = orderButtonComponent;
        this.rootViewGroup = (NestedScrollView) ((View) rp31.d(this, gfh0.toll_road_root));
        ViewGroup viewGroup = (ViewGroup) ((View) rp31.d(this, gfh0.toll_road_options_group));
        this.paidOptionsGroup = viewGroup;
        qqz0 qqz0Var = new qqz0(this, 1);
        BackButtonIconComponent backButtonIconComponent = new BackButtonIconComponent(getContext(), null, 0, a2i0.FloatButtonIconStyle, 4, null);
        backButtonIconComponent.setDebounceClickListener(qqz0Var);
        backButtonIconComponent.setLayoutParams(new ViewGroup.LayoutParams(-2, tje.u(90, backButtonIconComponent.getContext())));
        backButton$lambda$1(backButtonIconComponent);
        addFloatButton(backButtonIconComponent, 8388611);
        this.backButton = backButtonIconComponent;
        this.roadOptionsAdapter = new otk0(viewGroup, new pxy0(7, this));
        setDismissOnTouchOutside(true);
        setArrowDefaultColor(getContext().getColor(mqg0.black_alpha20));
        setupRootView();
        addOnLayoutChangeListener(new ons0(10, this));
        orderButtonComponent.setDebounceClickListener(new qqz0(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(TollRoadModalView tollRoadModalView, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        tollRoadModalView.focusCoordinator.Td(tollRoadModalView.getContentHeight(), TollRoadModalView.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(TollRoadModalView tollRoadModalView) {
        qpz0 qpz0Var = tollRoadModalView.presenter;
        teh tehVar = qpz0Var.x;
        tehVar.getClass();
        tehVar.u(TollRoadDialogAnalytics$Button.DONE);
        tehVar.s(TollRoadDialogAnalytics$CloseReason.DONE);
        qpz0Var.y.n();
        tollRoadModalView.dismiss();
    }

    private static final zy11 backButton$lambda$1(FloatButtonIconComponent floatButtonIconComponent) {
        floatButtonIconComponent.setId(ndh0.back);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onModalViewAppear$lambda$0(TollRoadModalView tollRoadModalView) {
        tollRoadModalView.backButton.performAccessibilityAction(64, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 roadOptionsAdapter$lambda$0(TollRoadModalView tollRoadModalView, ntk0 ntk0Var) {
        qpz0 qpz0Var = tollRoadModalView.presenter;
        teh tehVar = qpz0Var.x;
        o oVar = qpz0Var.z;
        if (!ntk0Var.b) {
            oVar.getClass();
            ru.yandex.taxi.preorder.tollroad.data.e eVar = oVar.b;
            eVar.e(ntk0Var.a == 1, TollRoadSetReason.OPTION_SELECTED);
            tehVar.z(eVar.f());
            tehVar.u(TollRoadDialogAnalytics$Button.SELECT_ROUTE);
        }
        return zy11.a;
    }

    private final void setupRootView() {
        this.rootViewGroup.setOnScrollChangeListener(new gk1(10, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupRootView$lambda$0(TollRoadModalView tollRoadModalView, View view, int i, int i2, int i3, int i4) {
        qpz0 qpz0Var = tollRoadModalView.presenter;
        boolean z = i2 > i4;
        teh tehVar = qpz0Var.x;
        tehVar.getClass();
        TollRoadDialogAnalytics$ScrollDirection tollRoadDialogAnalytics$ScrollDirection = z ? TollRoadDialogAnalytics$ScrollDirection.DOWN : TollRoadDialogAnalytics$ScrollDirection.UP;
        if (tollRoadDialogAnalytics$ScrollDirection == ((TollRoadDialogAnalytics$ScrollDirection) tehVar.y)) {
            return;
        }
        ((x770) tehVar.x).a.a("RoadSelectionCard.Scrolled", g8e.u("direction_scroll", tollRoadDialogAnalytics$ScrollDirection.getValue(), "road_type", ((TollRoadDialogAnalytics$RoadType) tehVar.A).getValue()), 1, new HashMap());
        tehVar.y = tollRoadDialogAnalytics$ScrollDirection;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.transparent;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        return hrh0.toll_road_modal_view;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onArrowClick() {
        qpz0 qpz0Var = this.presenter;
        if (!qpz0Var.C) {
            qpz0Var.C = true;
            qpz0Var.y.o();
        }
        super.onArrowClick();
        this.presenter.x.s(TollRoadDialogAnalytics$CloseReason.MAP_TAPPED);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0067, code lost:
    
        if (r7.a().size() > 1) goto L9;
     */
    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        qpz0 qpz0Var = this.presenter;
        rqz0 rqz0Var = new rqz0(this);
        qpz0Var.Bg(rqz0Var);
        o oVar = qpz0Var.z;
        tpr h = oVar.h();
        tse Jg = qpz0Var.Jg();
        xsr0.a.getClass();
        gci0 R = kotlinx.coroutines.flow.e.R(h, Jg, wsr0.c, EmptyList.a);
        tje.N(qpz0Var.Jg(), null, null, new TollRoadDialogPresenter$attachView$1(R, qpz0Var, rqz0Var, null), 3);
        tje.N(qpz0Var.Jg(), null, null, new TollRoadDialogPresenter$attachView$2(qpz0Var, null), 3);
        tje.N(qpz0Var.Jg(), null, null, new TollRoadDialogPresenter$attachView$3(R, qpz0Var, rqz0Var, null), 3);
        teh tehVar = qpz0Var.x;
        ru.yandex.taxi.preorder.tollroad.data.e eVar = oVar.b;
        tehVar.z(eVar.f());
        boolean z = eVar.b() == RoadRestriction.NONE;
        tehVar.x(z);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
        teh tehVar = this.presenter.x;
        tehVar.getClass();
        tehVar.u(TollRoadDialogAnalytics$Button.ANDROID_BACK_BUTTON);
        tehVar.s(TollRoadDialogAnalytics$CloseReason.ANDROID_BACK_BUTTON);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.presenter.Cg();
        this.focusCoordinator.Lc(TollRoadModalView.class, null);
        super.onDetachedFromWindow();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onDismissManually() {
        super.onDismissManually();
        qpz0 qpz0Var = this.presenter;
        if (qpz0Var.C) {
            return;
        }
        qpz0Var.C = true;
        qpz0Var.y.o();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView
    public void onModalViewAppear(int contentTop) {
        super.onModalViewAppear(contentTop);
        post(new qqz0(this, 0));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onSlideOut() {
        qpz0 qpz0Var = this.presenter;
        if (!qpz0Var.C) {
            qpz0Var.C = true;
            qpz0Var.y.o();
        }
        super.onSlideOut();
        this.presenter.x.s(TollRoadDialogAnalytics$CloseReason.ROLL_OFF);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onTouchOutside() {
        super.onTouchOutside();
        this.presenter.x.s(TollRoadDialogAnalytics$CloseReason.MAP_TAPPED);
    }
}

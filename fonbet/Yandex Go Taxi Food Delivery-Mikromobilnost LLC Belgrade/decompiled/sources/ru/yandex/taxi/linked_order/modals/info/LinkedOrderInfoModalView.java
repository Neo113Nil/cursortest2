package ru.yandex.taxi.linked_order.modals.info;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.a2i0;
import defpackage.aj7;
import defpackage.c9v;
import defpackage.cma1;
import defpackage.cqh0;
import defpackage.dai;
import defpackage.dhv;
import defpackage.dny;
import defpackage.f1h0;
import defpackage.f58;
import defpackage.g18;
import defpackage.g58;
import defpackage.gny;
import defpackage.hny;
import defpackage.ike;
import defpackage.iny;
import defpackage.jny;
import defpackage.kf00;
import defpackage.kny;
import defpackage.lny;
import defpackage.m25;
import defpackage.mqg0;
import defpackage.nac;
import defpackage.nny;
import defpackage.ny61;
import defpackage.o22;
import defpackage.obv;
import defpackage.ony;
import defpackage.ptw;
import defpackage.qi11;
import defpackage.qu;
import defpackage.s9e0;
import defpackage.t1w;
import defpackage.tje;
import defpackage.v8e0;
import defpackage.w130;
import defpackage.x4e;
import defpackage.xdh0;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.z0a0;
import defpackage.zy11;
import java.util.HashMap;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.design.BackButtonIconComponent;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.CircleButtonsPanelComponent;
import ru.yandex.taxi.design.ClickableImageView;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.PreviewHeadComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.linked_order.interactor.h;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.buttons.IconCircleButton;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0087\u0001BM\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001fH\u0014¢\u0006\u0004\b$\u0010!J\u000f\u0010%\u001a\u00020\u001fH\u0014¢\u0006\u0004\b%\u0010!J\u001d\u0010*\u001a\u00020)2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&H\u0014¢\u0006\u0004\b*\u0010+J7\u00101\u001a\u00020)2\u0006\u0010,\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020\u001f2\u0006\u00100\u001a\u00020\u001fH\u0014¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\u000e2\u0006\u00104\u001a\u000203H\u0017¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020)H\u0014¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020)H\u0014¢\u0006\u0004\b9\u00108J\u000f\u0010:\u001a\u00020)H\u0015¢\u0006\u0004\b:\u00108J\u0017\u0010=\u001a\u00020)2\u0006\u0010<\u001a\u00020;H\u0014¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020)H\u0014¢\u0006\u0004\b?\u00108J\u000f\u0010@\u001a\u00020)H\u0014¢\u0006\u0004\b@\u00108J\u000f\u0010A\u001a\u00020)H\u0014¢\u0006\u0004\bA\u00108J\u001f\u0010D\u001a\u00020)2\u0006\u0010B\u001a\u00020\u001f2\u0006\u0010C\u001a\u00020\u000eH\u0014¢\u0006\u0004\bD\u0010EJ\u0017\u0010H\u001a\u00020)2\u0006\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020)H\u0002¢\u0006\u0004\bJ\u00108J\u001f\u0010O\u001a\u00020)2\u0006\u0010L\u001a\u00020K2\u0006\u0010N\u001a\u00020MH\u0002¢\u0006\u0004\bO\u0010PR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010QR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010RR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010SR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010TR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010UR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010VR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010WR\u0014\u0010Y\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\\\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010^\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010a\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010c\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010_R\u0014\u0010d\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010_R\u0014\u0010e\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010_R\u0014\u0010f\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010_R\u0014\u0010g\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010i\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010_R\u0014\u0010j\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010hR\u0014\u0010k\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010_R\u0014\u0010l\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010hR\u0014\u0010n\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0018\u0010q\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010s\u001a\u00020M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0016\u0010v\u001a\u00020u8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0016\u0010x\u001a\u00020M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010tR\u0016\u0010y\u001a\u00020u8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010wR\u0016\u0010z\u001a\u00020M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010tR\u0016\u0010{\u001a\u00020u8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010wR\u0014\u0010}\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0014\u0010\u007f\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u007f\u0010~R\u0018\u0010\u0081\u0001\u001a\u00030\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0019\u0010\u0083\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0016\u0010\u0086\u0001\u001a\u00020\u001f8TX\u0094\u0004¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010!¨\u0006\u0088\u0001"}, d2 = {"Lru/yandex/taxi/linked_order/modals/info/LinkedOrderInfoModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Llny;", "Landroid/content/Context;", "context", "Lony;", "presenter", "Lv8e0;", "popupDrawableFactory", "Lm25;", "baseImageProvider", "Lgny;", "infoModalCallback", "Ljava/util/function/Consumer;", "", "closeCallback", "Lg58;", "carImageAndPlateViewHolderBindInteractor", "Lz0a0;", "paymentImageLoader", "<init>", "(Landroid/content/Context;Lony;Lv8e0;Lm25;Lgny;Ljava/util/function/Consumer;Lg58;Lz0a0;)V", "Lw130;", "insetsType", "()Lw130;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Llny;", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "canDragToExpandFromAnchored", "()Z", "getMaxAnchoredHeight", "anchoredHeight", "Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;", "Landroid/view/View;", "bottomSheetBehavior", "Lzy11;", "setInitialBehaviorState", "(Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;)V", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "onAttachedToWindow", "()V", "onDetachedFromWindow", "onBackPressed", "Ljava/lang/Runnable;", "onAnimationEnd", "dismissInternal", "(Ljava/lang/Runnable;)V", "dismissInternalWithoutAnimation", "onArrowClick", "onSlideOut", "newState", "movedByUser", "onBehaviorStateChanged", "(IZ)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "updateBottomPosition", "Lru/yandex/taxi/design/ListItemComponent;", "linkedOrderDetails", "", "iconTag", "loadDetailsIcon", "(Lru/yandex/taxi/design/ListItemComponent;Ljava/lang/String;)V", "Lony;", "Lv8e0;", "Lm25;", "Lgny;", "Ljava/util/function/Consumer;", "Lg58;", "Lz0a0;", "Landroid/widget/FrameLayout;", "buttonWrapper", "Landroid/widget/FrameLayout;", "Landroid/widget/ImageView;", "scrollIndicator", "Landroid/widget/ImageView;", "additionalInfo", "Lru/yandex/taxi/design/ListItemComponent;", "Lru/yandex/taxi/design/PreviewHeadComponent;", "titleItem", "Lru/yandex/taxi/design/PreviewHeadComponent;", "sourceItem", "destinationItem", "destinationApartment", "destinationDoorCode", "destinationDoorCodeDivider", "Landroid/view/View;", "destinationFloor", "destinationFloorDivider", "destinationPorch", "destinationPorchDivider", "Lnny;", "mvpView", "Lnny;", "Ls9e0;", "popupIconProvider", "Ls9e0;", "lastLoadedIconTag", "Ljava/lang/String;", "Lg18;", "loadIconCancelable", "Lg18;", "lastLoadedDetailsIconTag", "loadDetailsIconCancelable", "lastLoadedInfoItemIconTag", "loadInfoItemIconCancellable", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "returnToRouteButton", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "backButton", "Lf58;", "carImageAndPlateViewHolder", "Lf58;", "isExpandedFromRender", "Z", "getCornerRadius", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "kny", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkedOrderInfoModalView extends SlideableBindingModalView<lny> {
    public static final int $stable = 8;
    private final ListItemComponent additionalInfo;
    private final FloatButtonIconComponent backButton;
    private final m25 baseImageProvider;
    private final FrameLayout buttonWrapper;
    private final f58 carImageAndPlateViewHolder;
    private final g58 carImageAndPlateViewHolderBindInteractor;
    private final Consumer<Boolean> closeCallback;
    private final ListItemComponent destinationApartment;
    private final ListItemComponent destinationDoorCode;
    private final View destinationDoorCodeDivider;
    private final ListItemComponent destinationFloor;
    private final View destinationFloorDivider;
    private final ListItemComponent destinationItem;
    private final ListItemComponent destinationPorch;
    private final View destinationPorchDivider;
    private final gny infoModalCallback;
    private boolean isExpandedFromRender;
    private String lastLoadedDetailsIconTag;
    private String lastLoadedIconTag;
    private String lastLoadedInfoItemIconTag;
    private g18 loadDetailsIconCancelable;
    private g18 loadIconCancelable;
    private g18 loadInfoItemIconCancellable;
    private final nny mvpView;
    private final z0a0 paymentImageLoader;
    private final v8e0 popupDrawableFactory;
    private s9e0 popupIconProvider;
    private final ony presenter;
    private final FloatButtonIconComponent returnToRouteButton;
    private final ImageView scrollIndicator;
    private final ListItemComponent sourceItem;
    private final PreviewHeadComponent titleItem;

    public LinkedOrderInfoModalView(Context context, ony onyVar, v8e0 v8e0Var, m25 m25Var, gny gnyVar, Consumer<Boolean> consumer, g58 g58Var, z0a0 z0a0Var) {
        super(context);
        this.presenter = onyVar;
        this.popupDrawableFactory = v8e0Var;
        this.baseImageProvider = m25Var;
        this.infoModalCallback = gnyVar;
        this.closeCallback = consumer;
        this.carImageAndPlateViewHolderBindInteractor = g58Var;
        this.paymentImageLoader = z0a0Var;
        this.buttonWrapper = ((lny) getBinding()).c;
        this.scrollIndicator = ((lny) getBinding()).A;
        this.additionalInfo = ((lny) getBinding()).b;
        PreviewHeadComponent previewHeadComponent = ((lny) getBinding()).y;
        this.titleItem = previewHeadComponent;
        this.sourceItem = ((lny) getBinding()).x;
        this.destinationItem = ((lny) getBinding()).l;
        this.destinationApartment = ((lny) getBinding()).m;
        this.destinationDoorCode = ((lny) getBinding()).n;
        this.destinationDoorCodeDivider = ((lny) getBinding()).o;
        this.destinationFloor = ((lny) getBinding()).p;
        this.destinationFloorDivider = ((lny) getBinding()).q;
        this.destinationPorch = ((lny) getBinding()).s;
        this.destinationPorchDivider = ((lny) getBinding()).t;
        this.mvpView = new kny(this);
        this.lastLoadedIconTag = "";
        dai daiVar = g18.u1;
        this.loadIconCancelable = daiVar;
        this.lastLoadedDetailsIconTag = "";
        this.loadDetailsIconCancelable = daiVar;
        this.lastLoadedInfoItemIconTag = "";
        this.loadInfoItemIconCancellable = daiVar;
        hny hnyVar = new hny(onyVar, 0);
        int i = 4;
        DefaultConstructorMarker defaultConstructorMarker = null;
        AttributeSet attributeSet = null;
        int i2 = 0;
        BackButtonIconComponent backButtonIconComponent = new BackButtonIconComponent(getContext(), attributeSet, i2, a2i0.FloatButtonIconStyle, i, defaultConstructorMarker);
        backButtonIconComponent.setDebounceClickListener(hnyVar);
        backButtonIconComponent.setLayoutParams(new ViewGroup.LayoutParams(-2, tje.u(90, backButtonIconComponent.getContext())));
        _init_$lambda$0(backButtonIconComponent);
        addFloatButton(backButtonIconComponent, 8388611);
        this.backButton = backButtonIconComponent;
        hny hnyVar2 = new hny(onyVar, 1);
        int i3 = f1h0.ic_route_24;
        FloatButtonIconComponent floatButtonIconComponent = new FloatButtonIconComponent(getContext(), attributeSet, i2, a2i0.FloatButtonIconStyle, i, defaultConstructorMarker);
        floatButtonIconComponent.setDebounceClickListener(hnyVar2);
        floatButtonIconComponent.setLayoutParams(new ViewGroup.LayoutParams(-2, tje.u(90, floatButtonIconComponent.getContext())));
        floatButtonIconComponent.setIcon(i3);
        addFloatButton(floatButtonIconComponent, 8388661);
        this.returnToRouteButton = floatButtonIconComponent;
        floatButtonIconComponent.setVisibility(8);
        ((lny) getBinding()).k.setDebounceClickListener(new hny(onyVar, 2));
        ((lny) getBinding()).e.setDebounceClickListener(new hny(onyVar, 3));
        ((lny) getBinding()).d.setDebounceClickListener(new hny(onyVar, 4));
        setArrowDefaultColor(getContext().getColor(mqg0.black_alpha20));
        this.carImageAndPlateViewHolder = new f58(previewHeadComponent);
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(new dhv(24, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$backToMapClicked(ony onyVar) {
        onyVar.Kg();
        c9v c9vVar = onyVar.B;
        ((kf00) c9vVar.b).a(null);
        c9vVar.x(onyVar.F, "back_button");
        ((nny) onyVar.Dg()).td(onyVar.G);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$callButtonClicked(ony onyVar) {
        dny dnyVar = onyVar.F;
        if (dnyVar != null) {
            onyVar.B.p(dnyVar, "call");
            ((aj7) onyVar.A).b(dnyVar.i, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$callTrustingContactButtonClicked(ony onyVar) {
        qi11 qi11Var;
        dny dnyVar = onyVar.F;
        if (dnyVar == null || (qi11Var = dnyVar.G) == null) {
            return;
        }
        ((aj7) onyVar.A).b(qi11Var.b, false);
        onyVar.B.p(null, "trustingContactCall");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$doneOrderClicked(ony onyVar) {
        onyVar.Kg();
        c9v c9vVar = onyVar.B;
        c9vVar.p(onyVar.F, "done");
        c9vVar.x(onyVar.F, "done_button");
        tje.N(onyVar.Jg(), null, null, new LinkedOrderInfoPresenter$doneOrderClicked$1(onyVar, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$focusToCurrentOrder(ony onyVar) {
        kf00 kf00Var = (kf00) onyVar.B.b;
        kf00Var.a.a("Map.RouteButton.Tapped", x4e.p("mode", "shared_order"), 1, new HashMap());
        r0 r0Var = onyVar.y.c.D;
        Boolean bool = Boolean.TRUE;
        r0Var.getClass();
        r0Var.m(null, bool);
    }

    private static final zy11 _init_$lambda$0(FloatButtonIconComponent floatButtonIconComponent) {
        floatButtonIconComponent.setBadgeBackgroundColor(c.c(xng0.controlMain, floatButtonIconComponent));
        floatButtonIconComponent.setBadgeTextColorAttr(xng0.textOnControl);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 insetsType$lambda$0(LinkedOrderInfoModalView linkedOrderInfoModalView, t1w t1wVar) {
        linkedOrderInfoModalView.setPadding(linkedOrderInfoModalView.getPaddingLeft(), t1wVar.b, linkedOrderInfoModalView.getPaddingRight(), linkedOrderInfoModalView.getPaddingBottom());
        View view = linkedOrderInfoModalView.getBinding().B;
        int i = t1wVar.d;
        c.D(view.getLayoutParams().width, i, view);
        FrameLayout frameLayout = linkedOrderInfoModalView.buttonWrapper;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), frameLayout.getPaddingTop(), frameLayout.getPaddingRight(), i);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadDetailsIcon(ListItemComponent linkedOrderDetails, String iconTag) {
        this.lastLoadedDetailsIconTag = iconTag;
        this.loadDetailsIconCancelable.cancel();
        m25 m25Var = this.baseImageProvider;
        ClickableImageView leadImageView = linkedOrderDetails.getLeadImageView();
        int i = 0;
        obv obvVar = new obv(iconTag, null, 6, i);
        jny jnyVar = new jny(this, i);
        qu quVar = new qu(14);
        nac nacVar = (nac) ((ru.yandex.taxi.utils.c) m25Var).a.a(leadImageView);
        nacVar.h = quVar;
        nacVar.i = jnyVar;
        this.loadDetailsIconCancelable = nacVar.b(obvVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 loadDetailsIcon$lambda$0(LinkedOrderInfoModalView linkedOrderInfoModalView) {
        linkedOrderInfoModalView.lastLoadedDetailsIconTag = "";
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateBottomPosition() {
        if (this.buttonWrapper.getVisibility() != 0) {
            this.scrollIndicator.setVisibility(8);
            return;
        }
        float height = (getContent().getHeight() - getBottomSheet().getTop()) - this.buttonWrapper.getHeight();
        boolean z = getSlideOffset() == 1.0f;
        boolean canScrollVertically = getBinding().z.canScrollVertically(1);
        this.buttonWrapper.setY(height);
        this.scrollIndicator.setY(height - r5.getHeight());
        this.scrollIndicator.setVisibility((!z || canScrollVertically) ? 0 : 8);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int anchoredHeight() {
        AnchorBottomSheetBehavior<View> bottomSheetBehavior = getBottomSheetBehavior();
        return getContent().getHeight() - bottomSheetBehavior.w[bottomSheetBehavior.x];
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        ListItemComponent listItemComponent = this.sourceItem;
        s9e0 s9e0Var = this.popupIconProvider;
        listItemComponent.setLeadImage(s9e0Var != null ? s9e0Var.source() : null);
        ListItemComponent listItemComponent2 = this.destinationItem;
        s9e0 s9e0Var2 = this.popupIconProvider;
        listItemComponent2.setLeadImage(s9e0Var2 != null ? s9e0Var2.a() : null);
        loadDetailsIcon(getBinding().i, this.lastLoadedDetailsIconTag);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return (isTransiting() || behaviourState() == 6) ? mqg0.transparent : super.getBackgroundColor();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public lny bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View O;
        View O2;
        View O3;
        View O4;
        View O5;
        View O6;
        View O7;
        View inflate = inflater.inflate(cqh0.linked_order_info_modal_view, parent, false);
        int i = xdh0.linked_order_additional_info;
        ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
        if (listItemComponent != null) {
            i = xdh0.linked_order_button_wrapper;
            FrameLayout frameLayout = (FrameLayout) cma1.O(i, inflate);
            if (frameLayout != null) {
                i = xdh0.linked_order_call_trusting_contact;
                IconCircleButton iconCircleButton = (IconCircleButton) cma1.O(i, inflate);
                if (iconCircleButton != null) {
                    i = xdh0.linked_order_circle_button_call;
                    IconCircleButton iconCircleButton2 = (IconCircleButton) cma1.O(i, inflate);
                    if (iconCircleButton2 != null) {
                        i = xdh0.linked_order_circle_buttons_group;
                        Group group = (Group) cma1.O(i, inflate);
                        if (group != null) {
                            i = xdh0.linked_order_circle_buttons_panel;
                            CircleButtonsPanelComponent circleButtonsPanelComponent = (CircleButtonsPanelComponent) cma1.O(i, inflate);
                            if (circleButtonsPanelComponent != null && (O = cma1.O((i = xdh0.linked_order_circle_buttons_panel_divider), inflate)) != null) {
                                i = xdh0.linked_order_details;
                                ListItemComponent listItemComponent2 = (ListItemComponent) cma1.O(i, inflate);
                                if (listItemComponent2 != null && (O2 = cma1.O((i = xdh0.linked_order_details_divider), inflate)) != null) {
                                    i = xdh0.linked_order_finish_button;
                                    ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
                                    if (buttonComponent != null) {
                                        i = xdh0.linked_order_info_destination;
                                        ListItemComponent listItemComponent3 = (ListItemComponent) cma1.O(i, inflate);
                                        if (listItemComponent3 != null) {
                                            i = xdh0.linked_order_info_destination_apartment;
                                            ListItemComponent listItemComponent4 = (ListItemComponent) cma1.O(i, inflate);
                                            if (listItemComponent4 != null) {
                                                i = xdh0.linked_order_info_destination_door_code;
                                                ListItemComponent listItemComponent5 = (ListItemComponent) cma1.O(i, inflate);
                                                if (listItemComponent5 != null && (O3 = cma1.O((i = xdh0.linked_order_info_destination_door_code_divider), inflate)) != null) {
                                                    i = xdh0.linked_order_info_destination_floor;
                                                    ListItemComponent listItemComponent6 = (ListItemComponent) cma1.O(i, inflate);
                                                    if (listItemComponent6 != null && (O4 = cma1.O((i = xdh0.linked_order_info_destination_floor_divider), inflate)) != null) {
                                                        i = xdh0.linked_order_info_destination_layout;
                                                        ConstraintLayout constraintLayout = (ConstraintLayout) cma1.O(i, inflate);
                                                        if (constraintLayout != null) {
                                                            i = xdh0.linked_order_info_destination_porch;
                                                            ListItemComponent listItemComponent7 = (ListItemComponent) cma1.O(i, inflate);
                                                            if (listItemComponent7 != null && (O5 = cma1.O((i = xdh0.linked_order_info_destination_porch_divider), inflate)) != null) {
                                                                i = xdh0.linked_order_info_item;
                                                                ListItemComponent listItemComponent8 = (ListItemComponent) cma1.O(i, inflate);
                                                                if (listItemComponent8 != null && (O6 = cma1.O((i = xdh0.linked_order_info_item_divider), inflate)) != null) {
                                                                    i = xdh0.linked_order_info_payment;
                                                                    ListItemComponent listItemComponent9 = (ListItemComponent) cma1.O(i, inflate);
                                                                    if (listItemComponent9 != null) {
                                                                        i = xdh0.linked_order_info_source;
                                                                        ListItemComponent listItemComponent10 = (ListItemComponent) cma1.O(i, inflate);
                                                                        if (listItemComponent10 != null) {
                                                                            i = xdh0.linked_order_info_title;
                                                                            PreviewHeadComponent previewHeadComponent = (PreviewHeadComponent) cma1.O(i, inflate);
                                                                            if (previewHeadComponent != null) {
                                                                                i = xdh0.linked_order_scroll;
                                                                                NestedScrollView nestedScrollView = (NestedScrollView) cma1.O(i, inflate);
                                                                                if (nestedScrollView != null) {
                                                                                    i = xdh0.linked_order_scroll_container;
                                                                                    if (((ConstraintLayout) cma1.O(i, inflate)) != null) {
                                                                                        i = xdh0.linked_order_scroll_indicator;
                                                                                        ImageView imageView = (ImageView) cma1.O(i, inflate);
                                                                                        if (imageView != null && (O7 = cma1.O((i = xdh0.linked_order_scroll_navigation_bar_holder), inflate)) != null) {
                                                                                            return new lny((ConstraintLayout) inflate, listItemComponent, frameLayout, iconCircleButton, iconCircleButton2, group, circleButtonsPanelComponent, O, listItemComponent2, O2, buttonComponent, listItemComponent3, listItemComponent4, listItemComponent5, O3, listItemComponent6, O4, constraintLayout, listItemComponent7, O5, listItemComponent8, O6, listItemComponent9, listItemComponent10, previewHeadComponent, nestedScrollView, imageView, O7);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: canDragToExpandFromAnchored */
    public boolean getCanDragToExpandedState() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void dismissInternal(Runnable onAnimationEnd) {
        super.dismissInternal(onAnimationEnd);
        ony onyVar = this.presenter;
        onyVar.y.Ig();
        h hVar = onyVar.x;
        hVar.e.b = null;
        hVar.f.a = null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void dismissInternalWithoutAnimation() {
        super.dismissInternalWithoutAnimation();
        ony onyVar = this.presenter;
        onyVar.y.Ig();
        h hVar = onyVar.x;
        hVar.e.b = null;
        hVar.f.a = null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: getCornerRadius */
    public int getCornersRadius() {
        return tje.u(24, getContext());
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getMaxAnchoredHeight() {
        lny binding = getBinding();
        int height = binding.y.getHeight();
        CircleButtonsPanelComponent circleButtonsPanelComponent = binding.g;
        int height2 = circleButtonsPanelComponent.getHeight() + height;
        ViewGroup.LayoutParams layoutParams = circleButtonsPanelComponent.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return binding.B.getHeight() + binding.j.getHeight() + binding.l.getHeight() + binding.x.getHeight() + binding.v.getHeight() + binding.u.getHeight() + binding.h.getHeight() + height2 + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public w130 insetsType() {
        return new w130(1, new ptw(14, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onArrowClick() {
        if (get_cardMode() == SlideableModalView.CardMode.FIXED_CARD) {
            return;
        }
        int behaviourState = behaviourState();
        ony onyVar = this.presenter;
        if (behaviourState != 6) {
            onyVar.B.u(onyVar.F, "tap");
            setBehaviorState(6);
        } else {
            onyVar.B.w(onyVar.F, "tap");
            expand();
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ony onyVar = this.presenter;
        nny nnyVar = this.mvpView;
        onyVar.Bg(nnyVar);
        onyVar.F = null;
        onyVar.H = false;
        onyVar.G = false;
        h hVar = onyVar.x;
        o22 o22Var = hVar.e;
        String str = hVar.a.b;
        o22Var.b = str;
        hVar.f.a = str;
        onyVar.y.Hg(new LinkedOrderInfoPresenter$attachView$1(1, nnyVar, nny.class, "showReturnToRouteButton", "showReturnToRouteButton(Z)V", 0));
        hVar.a((ike) onyVar.Jg(), new LinkedOrderInfoPresenter$attachView$2(1, onyVar, ony.class, "handleOrder", "handleOrder(Lru/yandex/taxi/linked_order/models/data/LinkedOrder;)V", 0), new LinkedOrderInfoPresenter$attachView$3(1, onyVar, ony.class, "handleOrderInfo", "handleOrderInfo(Lru/yandex/taxi/linked_order/models/data/LinkedOrderInfoData;)V", 0));
        tje.N(onyVar.Jg(), null, null, new LinkedOrderInfoPresenter$attachView$$inlined$safeCollectIn$1(hVar.b(), null, onyVar), 3);
        tje.N(onyVar.Jg(), null, null, new LinkedOrderInfoPresenter$attachView$$inlined$safeCollectIn$2(onyVar.C.b(), null, nnyVar), 3);
        getCardContentView().getViewTreeObserver().addOnDrawListener(new iny(this, 1));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        ony onyVar = this.presenter;
        onyVar.Kg();
        c9v c9vVar = onyVar.B;
        ((kf00) c9vVar.b).a(null);
        c9vVar.x(onyVar.F, "android_back_button");
        ((nny) onyVar.Dg()).td(onyVar.G);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onBehaviorStateChanged(int newState, boolean movedByUser) {
        super.onBehaviorStateChanged(newState, movedByUser);
        if (movedByUser) {
            if (newState != 3) {
                if (newState == 4) {
                    if (get_cardMode() == SlideableModalView.CardMode.FIXED_CARD) {
                        expand();
                        return;
                    }
                    return;
                } else if (newState == 6) {
                    ony onyVar = this.presenter;
                    onyVar.B.u(onyVar.F, "pull");
                    return;
                } else if (newState != 7) {
                    return;
                }
            }
            ony onyVar2 = this.presenter;
            onyVar2.B.w(onyVar2.F, "pull");
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
        this.infoModalCallback.a();
        getCardContentView().getViewTreeObserver().removeOnDrawListener(new iny(this, 0));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        getBottomSheetBehavior().M(getBinding().y.getHeight() + getCurrentInsets().d, true);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onSlideOut() {
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (xw31.l((int) event.getX(), (int) event.getY(), 0, getCardContentView())) {
            return super.onTouchEvent(event);
        }
        return false;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void setInitialBehaviorState(AnchorBottomSheetBehavior<View> bottomSheetBehavior) {
        super.setInitialBehaviorState(bottomSheetBehavior);
        bottomSheetBehavior.C = false;
        bottomSheetBehavior.W = true;
    }
}

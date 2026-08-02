package ru.yandex.taxi.search.address.view;

import android.graphics.Bitmap;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import com.adjust.sdk.Constants;
import com.yandex.go.address.models.Address;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.c8v0;
import defpackage.d8v0;
import defpackage.dk1;
import defpackage.fjd;
import defpackage.fz2;
import defpackage.gyc;
import defpackage.io9;
import defpackage.k4o;
import defpackage.mrg0;
import defpackage.ndh0;
import defpackage.oxf0;
import defpackage.pwf0;
import defpackage.r7v0;
import defpackage.t030;
import defpackage.tid;
import defpackage.tje;
import defpackage.u90;
import defpackage.uid;
import defpackage.vid;
import defpackage.wid;
import defpackage.xid;
import defpackage.xw31;
import defpackage.y700;
import defpackage.z700;
import defpackage.zph0;
import defpackage.zxf0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.animation.AnimUtils$AnimationStartEndListener;
import ru.yandex.taxi.mainscreen.analytics.MainScreenAnalyticsScreenMode;
import ru.yandex.taxi.perf.screen.ElementPerformanceState;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.search.view.BaseAddressSearchModalView;
import ru.yandex.taxi.widget.modalview.ModalViewProcessing$ProcessingState;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 \u0085\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\b\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001B#\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u000fJ\u000f\u0010\u001c\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001c\u0010\u000fJ\u000f\u0010\u001d\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\u0015H\u0016¢\u0006\u0004\b \u0010\u001eJ\u0017\u0010#\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u0018H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0014¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0015H\u0014¢\u0006\u0004\b+\u0010\u001eJ\u000f\u0010,\u001a\u00020\u0015H\u0014¢\u0006\u0004\b,\u0010\u001eJ\u0019\u0010/\u001a\u00020\u00152\b\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b/\u00100J\u0011\u00102\u001a\u0004\u0018\u000101H\u0014¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0015H\u0014¢\u0006\u0004\b4\u0010\u001eJ\u000f\u00105\u001a\u00020\u0015H\u0014¢\u0006\u0004\b5\u0010\u001eJ\u0017\u00107\u001a\u00020\u00152\u0006\u00106\u001a\u00020\u0010H\u0014¢\u0006\u0004\b7\u0010\u0017J\u000f\u00108\u001a\u00020\u0015H\u0014¢\u0006\u0004\b8\u0010\u001eJ\u0017\u00109\u001a\u00020\u00152\u0006\u0010.\u001a\u00020-H\u0014¢\u0006\u0004\b9\u00100J\u0017\u0010<\u001a\u00020\r2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\r2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b>\u0010=J\u000f\u00106\u001a\u00020\u0010H\u0016¢\u0006\u0004\b6\u0010\u0012J\u000f\u0010?\u001a\u00020\u0015H\u0014¢\u0006\u0004\b?\u0010\u001eJ\u000f\u0010@\u001a\u00020\u0015H\u0014¢\u0006\u0004\b@\u0010\u001eJ\u000f\u0010A\u001a\u00020\u0015H\u0014¢\u0006\u0004\bA\u0010\u001eJ\u0017\u0010D\u001a\u00020\u00152\u0006\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010D\u001a\u00020\u00152\u0006\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bD\u0010HJ\u000f\u0010I\u001a\u00020\u0015H\u0016¢\u0006\u0004\bI\u0010\u001eJ\u0019\u0010L\u001a\u00020\u00152\b\u0010K\u001a\u0004\u0018\u00010JH\u0016¢\u0006\u0004\bL\u0010MJ\u001f\u0010P\u001a\u00020\u00152\u0006\u0010N\u001a\u00020-2\u0006\u0010O\u001a\u00020-H\u0014¢\u0006\u0004\bP\u0010QJ\u0017\u0010S\u001a\u00020\u00152\u0006\u0010R\u001a\u00020!H\u0014¢\u0006\u0004\bS\u0010$J\u001f\u0010V\u001a\u00020\u00152\u0006\u0010T\u001a\u00020\u00102\u0006\u0010U\u001a\u00020\rH\u0014¢\u0006\u0004\bV\u0010WJ\u001f\u0010\\\u001a\u00020\u00152\u0006\u0010Y\u001a\u00020X2\u0006\u0010[\u001a\u00020ZH\u0002¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020\u0015H\u0002¢\u0006\u0004\b^\u0010\u001eJ\u000f\u0010_\u001a\u00020\u0015H\u0002¢\u0006\u0004\b_\u0010\u001eJ\u0019\u0010`\u001a\u00020\u00152\b\u0010K\u001a\u0004\u0018\u00010JH\u0002¢\u0006\u0004\b`\u0010MJ\u000f\u0010a\u001a\u00020\u0015H\u0002¢\u0006\u0004\ba\u0010\u001eJ\u0017\u0010b\u001a\u00020\u00152\u0006\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\bb\u0010ER\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010cR\u0014\u0010e\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u001a\u0010g\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\f\n\u0004\bg\u0010h\u0012\u0004\bi\u0010\u001eR\u0014\u0010j\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u00105\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010lR\u0014\u0010m\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010kR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010kR\u0014\u0010n\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010hR\u0014\u0010o\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010hR\u0014\u0010p\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010hR\u0014\u0010q\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010hR\u0014\u0010s\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR \u0010v\u001a\u000e\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020-0u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010y\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010{\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0016\u0010}\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010kR\u0016\u0010~\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010kR\u0015\u0010\u0080\u0001\u001a\u00020\u00108TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u007f\u0010\u0012R\u0016\u0010\u0082\u0001\u001a\u00020\u00108TX\u0094\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010\u0012R\u0016\u0010\u0083\u0001\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010\u000fR\u0016\u0010\u0084\u0001\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010\u000f¨\u0006\u008a\u0001"}, d2 = {"Lru/yandex/taxi/search/address/view/CompositeAddressSearchModalView;", "Lru/yandex/taxi/search/view/BaseAddressSearchModalView;", "Lfjd;", "Lru/yandex/taxi/search/address/view/CompositeAddressSearchView;", "Ly700;", "Lxid;", "viewBuilder", "Lru/yandex/taxi/search/address/view/CompositeAddressSearchModalView$a;", "modalViewBuilder", "Lc8v0;", "suggestPerformanceInteractor", "<init>", "(Lfjd;Lru/yandex/taxi/search/address/view/CompositeAddressSearchModalView$a;Lc8v0;)V", "", "isFullscreen", "()Z", "", "getTopPadding", "()I", "isArrowsPermanentlyHidden", "maxShownSuggests", "Lzy11;", "updatePeekHeight", "(I)V", "Lru/yandex/taxi/widget/modalview/ModalViewProcessing$ProcessingState;", "getProcessingState", "()Lru/yandex/taxi/widget/modalview/ModalViewProcessing$ProcessingState;", "isProcessing", "isStickOut", "expand", "()V", "collapse", "forceCollapse", "", "scale", "setDefaultHorizontalScaleX", "(F)V", "processingState", "setProcessingState", "(Lru/yandex/taxi/widget/modalview/ModalViewProcessing$ProcessingState;)V", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "getPreDrawListener", "()Landroid/view/ViewTreeObserver$OnPreDrawListener;", "onAttachedToWindow", "onDetachedFromWindow", "Ljava/lang/Runnable;", "onAnimationEnd", "dismissWithAction", "(Ljava/lang/Runnable;)V", "Landroid/view/View;", "getFocusedForAccessibilityViewOnAppear", "()Landroid/view/View;", "animateDismissBackground", "onDismissManually", "contentTop", "onModalViewAppear", "onModalViewDisappear", "dismissInternal", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "onTouchEvent", "onTouchOutside", "onBackPressed", "onArrowClick", "Lru/yandex/taxi/search/address/view/PointType;", "pointType", "showEditAddress", "(Lru/yandex/taxi/search/address/view/PointType;)V", "Landroid/net/Uri;", Constants.DEEPLINK, "(Landroid/net/Uri;)V", "proceed", "Lcom/yandex/go/address/models/Address;", "sourceAddress", "setSourceAddress", "(Lcom/yandex/go/address/models/Address;)V", "onAnimateShowStartAction", "onAnimateShowEndAction", "animateShow", "(Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "slideOffset", "onDialogSlide", "newState", "movedByUser", "onBehaviorStateChanged", "(IZ)V", "Lru/yandex/taxi/search/address/view/CompositeAddressSearchModalView$OnStateChangedKey;", "key", "Loxf0;", "action", "doOnStateChanged", "(Lru/yandex/taxi/search/address/view/CompositeAddressSearchModalView$OnStateChangedKey;Loxf0;)V", "invalidateBehaviorOffsets", "reportModalViewLcpIfNeeded", "onSourceAddressChanged", "cancelAppearAnimation", "setActivePoint", "Lc8v0;", "Lz700;", "listener", "Lz700;", "initialState", CA20Status.STATUS_USER_I, "getInitialState$annotations", "hasCollapsedState", "Z", "Ljava/lang/Runnable;", "showInFullMode", "reducedAdditionalPeekOffset", "reducedMarginOffset", "oneSuggestPeekOffset", "defaultProcessingHeight", "Landroid/view/View$OnLayoutChangeListener;", "layoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "", "onStateChanged", "Ljava/util/Map;", "Lt030;", "modalViewCompatibleDelegate", "Lt030;", "onPreDrawListener", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "bottomOffsetChanged", "hasAppeared", "getCardContentViewLayoutRes", "cardContentViewLayoutRes", "getCornerRadius", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "isModalViewExpanded", "isModalViewCollapsed", "Companion", "gyc", "OnStateChangedKey", "a", "ru/yandex/taxi/search/address/view/b", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CompositeAddressSearchModalView extends BaseAddressSearchModalView<fjd, CompositeAddressSearchView> implements y700, xid {
    public static final b Companion = new b();
    private boolean bottomOffsetChanged;
    private final int defaultProcessingHeight;
    private boolean hasAppeared;
    private final boolean hasCollapsedState;
    private final int initialState;
    private final boolean isFullscreen;
    private final View.OnLayoutChangeListener layoutChangeListener;
    private final z700 listener;
    private final t030 modalViewCompatibleDelegate;
    private final Runnable onDismissManually;
    private final ViewTreeObserver.OnPreDrawListener onPreDrawListener;
    private final Map<OnStateChangedKey, Runnable> onStateChanged;
    private final int oneSuggestPeekOffset;
    private final int reducedAdditionalPeekOffset;
    private final int reducedMarginOffset;
    private final boolean showInFullMode;
    private final c8v0 suggestPerformanceInteractor;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/search/address/view/CompositeAddressSearchModalView$OnStateChangedKey;", "", "UPDATE_BEHAVIOR_OFFSETS", "EXPAND_COLLAPSE", "SOURCE_ADDRESS_CHANGED", "EDIT_ROUTE_STOPS", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class OnStateChangedKey {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ OnStateChangedKey[] $VALUES;
        public static final OnStateChangedKey EDIT_ROUTE_STOPS;
        public static final OnStateChangedKey EXPAND_COLLAPSE;
        public static final OnStateChangedKey SOURCE_ADDRESS_CHANGED;
        public static final OnStateChangedKey UPDATE_BEHAVIOR_OFFSETS;

        static {
            OnStateChangedKey onStateChangedKey = new OnStateChangedKey("UPDATE_BEHAVIOR_OFFSETS", 0);
            UPDATE_BEHAVIOR_OFFSETS = onStateChangedKey;
            OnStateChangedKey onStateChangedKey2 = new OnStateChangedKey("EXPAND_COLLAPSE", 1);
            EXPAND_COLLAPSE = onStateChangedKey2;
            OnStateChangedKey onStateChangedKey3 = new OnStateChangedKey("SOURCE_ADDRESS_CHANGED", 2);
            SOURCE_ADDRESS_CHANGED = onStateChangedKey3;
            OnStateChangedKey onStateChangedKey4 = new OnStateChangedKey("EDIT_ROUTE_STOPS", 3);
            EDIT_ROUTE_STOPS = onStateChangedKey4;
            OnStateChangedKey[] onStateChangedKeyArr = {onStateChangedKey, onStateChangedKey2, onStateChangedKey3, onStateChangedKey4};
            $VALUES = onStateChangedKeyArr;
            $ENTRIES = kotlin.enums.a.a(onStateChangedKeyArr);
        }

        public static OnStateChangedKey valueOf(String str) {
            return (OnStateChangedKey) Enum.valueOf(OnStateChangedKey.class, str);
        }

        public static OnStateChangedKey[] values() {
            return (OnStateChangedKey[]) $VALUES.clone();
        }
    }

    public static final class a {
        public z700 a = (z700) ((zxf0) pwf0.c(z700.class));
        public int b = 6;
        public Runnable c = pwf0.c;
        public boolean d;

        public a() {
            ModalViewOrigin modalViewOrigin = ModalViewOrigin.HOME;
        }
    }

    private CompositeAddressSearchModalView(fjd fjdVar, a aVar, c8v0 c8v0Var) {
        super(fjdVar, aVar.b);
        this.suggestPerformanceInteractor = c8v0Var;
        this.listener = aVar.a;
        int i = aVar.b;
        this.initialState = i;
        this.hasCollapsedState = false;
        this.onDismissManually = aVar.c;
        this.showInFullMode = aVar.d;
        this.isFullscreen = false;
        int r = tje.r(mrg0.list_item_component_min_height, getContext());
        this.reducedAdditionalPeekOffset = r;
        this.reducedMarginOffset = tje.r(mrg0.go_design_s_space, getContext());
        this.oneSuggestPeekOffset = r;
        this.defaultProcessingHeight = tje.r(mrg0.go_design_m_space, getContext());
        this.onStateChanged = new HashMap();
        this.modalViewCompatibleDelegate = new gyc(this);
        this.onPreDrawListener = new uid(0, this);
        this.layoutChangeListener = new u90(17, this);
        refreshTopPadding();
        setDismissOnBackPressed(true);
        setDismissOnTouchOutside(false);
        onBehaviorStateChanged(i, false);
        updateCurrentBackground();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(CompositeAddressSearchModalView compositeAddressSearchModalView, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        compositeAddressSearchModalView.listener.ag(compositeAddressSearchModalView.peekHeight(), false);
    }

    public static final a builder() {
        Companion.getClass();
        return new a();
    }

    private final void cancelAppearAnimation() {
        Object tag = getTag(ndh0.appear_animation_helper);
        fz2 fz2Var = tag instanceof fz2 ? (fz2) tag : null;
        if (fz2Var == null) {
            fz2Var = new fz2(this);
            setTag(ndh0.appear_animation_helper, fz2Var);
        }
        fz2Var.a();
    }

    private final void doOnStateChanged(OnStateChangedKey key, oxf0 action) {
        this.onStateChanged.put(key, pwf0.e(oxf0.class, action));
    }

    private static /* synthetic */ void getInitialState$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getPreDrawListener$lambda$0(CompositeAddressSearchModalView compositeAddressSearchModalView, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        String filter = compositeAddressSearchModalView.getAddressSearchView().getFilter(compositeAddressSearchModalView.getAddressSearchView().activePoint());
        if ((filter == null || filter.length() == 0) && compositeAddressSearchModalView.initialState == 6) {
            compositeAddressSearchModalView.getAddressSearchView().activeInput().requestFocus();
        }
        return onPreDrawListener.onPreDraw();
    }

    private final void invalidateBehaviorOffsets() {
        int behaviourState = behaviourState();
        if (behaviourState != 1 && behaviourState != 2) {
            getAddressSearchView().onUpdateOffsets();
        } else {
            doOnStateChanged(OnStateChangedKey.UPDATE_BEHAVIOR_OFFSETS, new vid(2, getAddressSearchView()));
        }
    }

    public static final CompositeAddressSearchModalView of(fjd fjdVar, a aVar, c8v0 c8v0Var) {
        Companion.getClass();
        return new CompositeAddressSearchModalView(fjdVar, aVar, c8v0Var, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onPreDrawListener$lambda$0(CompositeAddressSearchModalView compositeAddressSearchModalView) {
        c8v0 c8v0Var = compositeAddressSearchModalView.suggestPerformanceInteractor;
        if (c8v0Var == null) {
            return true;
        }
        ((d8v0) c8v0Var).a.i(new r7v0(ElementPerformanceState.FIRST_CONTENTFUL_PAINT));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSourceAddressChanged(Address sourceAddress) {
        getAddressSearchView().onSourceAddressChanged(sourceAddress);
        if (this.hasCollapsedState) {
            if (isCollapsed()) {
                getAddressSearchView().invalidateActivePoint();
            }
            invalidateBehaviorOffsets();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportModalViewLcpIfNeeded() {
        c8v0 c8v0Var = this.suggestPerformanceInteractor;
        if (c8v0Var != null) {
            ((d8v0) c8v0Var).a.i(new r7v0(ElementPerformanceState.LARGEST_CONTENTFUL_PAINT));
        }
    }

    private final void setActivePoint(PointType pointType) {
        getAddressSearchView().setActivePoint(pointType, behaviourState() == 6 || behaviourState() == 3);
    }

    @Override // defpackage.y700
    public /* bridge */ void addLocateButton() {
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismissBackground() {
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateShow(Runnable onAnimateShowStartAction, Runnable onAnimateShowEndAction) {
        if (!this.hasCollapsedState) {
            super.animateShow(onAnimateShowStartAction, onAnimateShowEndAction);
            return;
        }
        AnimUtils$AnimationStartEndListener animUtils$AnimationStartEndListener = new AnimUtils$AnimationStartEndListener(onAnimateShowStartAction, onAnimateShowEndAction);
        Object tag = getTag(ndh0.appear_animation_helper);
        fz2 fz2Var = tag instanceof fz2 ? (fz2) tag : null;
        if (fz2Var == null) {
            fz2Var = new fz2(this);
            setTag(ndh0.appear_animation_helper, fz2Var);
        }
        fz2Var.f(animUtils$AnimationStartEndListener);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, defpackage.y700
    public void collapse() {
        if (this.hasCollapsedState) {
            int behaviourState = behaviourState();
            if (behaviourState == 2) {
                doOnStateChanged(OnStateChangedKey.EXPAND_COLLAPSE, new vid(0, this));
            } else if (behaviourState != 1) {
                setBehaviorState(4);
            }
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.y700
    public int contentTop() {
        return peekHeight();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void dismissInternal(Runnable onAnimationEnd) {
        super.dismissInternal(onAnimationEnd);
        getAddressSearchView().onParentDismiss();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.u45
    public void dismissWithAction(Runnable onAnimationEnd) {
        getAddressSearchView().setOnKeyboardListener(null);
        super.dismissWithAction(onAnimationEnd);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent event) {
        if (getAddressSearchView().getProcessingState() == ModalViewProcessing$ProcessingState.DONE || !xw31.o(this, getCardContentView(), event)) {
            return super.dispatchTouchEvent(event);
        }
        return true;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void expand() {
        int behaviourState = behaviourState();
        if (behaviourState == 2) {
            doOnStateChanged(OnStateChangedKey.EXPAND_COLLAPSE, new vid(1, this));
        } else if (behaviourState != 1) {
            setBehaviorState(6);
        }
    }

    @Override // defpackage.y700
    public void forceCollapse() {
        collapse();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        return zph0.address_search_composite_modal_view;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: getCornerRadius */
    public int getCornersRadius() {
        if (this.isFullscreen) {
            return 0;
        }
        return super.getCornersRadius();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public View getFocusedForAccessibilityViewOnAppear() {
        return getAddressSearchView().activeInput();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView
    public ViewTreeObserver.OnPreDrawListener getPreDrawListener() {
        return new dk1(this, super.getPreDrawListener(), 1);
    }

    @Override // defpackage.y700
    public ModalViewProcessing$ProcessingState getProcessingState() {
        return getAddressSearchView().getProcessingState();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getTopPadding() {
        if (this.isFullscreen) {
            return 0;
        }
        return this.showInFullMode ? this.topSystemWindowInset : super.getTopPadding();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isArrowsPermanentlyHidden */
    public boolean getWithCloseButton() {
        if (this.isFullscreen) {
            return true;
        }
        return super.getWithCloseButton();
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchModalView
    /* renamed from: isFullscreen, reason: from getter */
    public boolean getIsFullscreen() {
        return this.isFullscreen;
    }

    public boolean isModalViewCollapsed() {
        return isCollapsed();
    }

    @Override // defpackage.y700
    public boolean isModalViewExpanded() {
        return isExpanded();
    }

    @Override // defpackage.y700
    public boolean isProcessing() {
        return getProcessingState() != ModalViewProcessing$ProcessingState.DONE;
    }

    @Override // defpackage.y700
    public boolean isStickOut() {
        return getProcessingState() == ModalViewProcessing$ProcessingState.STICK_OUT;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onArrowClick() {
        if (!this.hasCollapsedState) {
            super.onArrowClick();
        } else {
            if (isProcessing()) {
                return;
            }
            if (behaviourState() == 4) {
                expand();
            } else {
                collapse();
            }
        }
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        getViewTreeObserver().addOnPreDrawListener(this.onPreDrawListener);
        super.onAttachedToWindow();
        getAddressSearchView().setOnKeyboardListener(new wid(this));
        getAddressSearchView().setSuggestsListener(new io9(this));
        getAddressSearchView().setModalViewCompatibleDelegate(this.modalViewCompatibleDelegate);
        addOnLayoutChangeListener(this.layoutChangeListener);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
        collapse();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onBehaviorStateChanged(int newState, boolean movedByUser) {
        if (!this.hasCollapsedState) {
            super.onBehaviorStateChanged(newState, movedByUser);
            return;
        }
        setInterceptOnBackPress(newState != 4);
        if (newState == 1 || newState == 2) {
            setClickable(true);
            return;
        }
        if (newState != 3) {
            if (newState == 4) {
                onDialogSlide(0.0f);
                getAddressSearchView().onCollapse(getProcessingState(), false, movedByUser);
                setClickable(false);
                setBackground(null);
                z700 z700Var = this.listener;
                peekHeight();
                z700Var.u3();
                Iterator<T> it = this.onStateChanged.values().iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                return;
            }
            if (newState != 6 && newState != 7) {
                return;
            }
        }
        onDialogSlide(1.0f);
        setClickable(true);
        this.listener.qa();
        Iterator<T> it2 = this.onStateChanged.values().iterator();
        while (it2.hasNext()) {
            ((Runnable) it2.next()).run();
        }
        getAddressSearchView().onExpand(MainScreenAnalyticsScreenMode.COMPOSITE);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (this.hasAppeared) {
            onModalViewDisappear();
        }
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this.onPreDrawListener);
        getAddressSearchView().setSuggestsListener(null);
        getAddressSearchView().setModalViewCompatibleDelegate(null);
        removeOnLayoutChangeListener(this.layoutChangeListener);
        cancelAppearAnimation();
        this.onStateChanged.clear();
    }

    @Override // ru.yandex.taxi.search.view.BaseAddressSearchModalView, ru.yandex.taxi.widget.SlideableModalView
    public void onDialogSlide(float slideOffset) {
        super.onDialogSlide(slideOffset);
        if (this.hasCollapsedState) {
            this.listener.onSlide(slideOffset);
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onDismissManually() {
        super.onDismissManually();
        getAddressSearchView().onParentDismiss();
        getAddressSearchView().onParentDismissManually();
        this.onDismissManually.run();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView
    public void onModalViewAppear(int contentTop) {
        this.hasAppeared = true;
        super.onModalViewAppear(contentTop);
        this.listener.e1();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onModalViewDisappear() {
        this.hasAppeared = false;
        super.onModalViewDisappear();
        this.listener.Ac();
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (isCollapsed()) {
            return false;
        }
        return super.onTouchEvent(event);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onTouchOutside() {
        getAddressSearchView().onTouchOutside();
        super.onTouchOutside();
        collapse();
    }

    @Override // defpackage.y700
    public void proceed() {
        getAddressSearchView().onRouteConfirmed();
    }

    @Override // defpackage.y700
    public /* bridge */ void removeLocateButton() {
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void setDefaultHorizontalScaleX(float scale) {
        if (this.hasCollapsedState) {
            super.setDefaultHorizontalScaleX(scale);
        }
    }

    @Override // defpackage.y700
    public void setProcessingState(ModalViewProcessing$ProcessingState processingState) {
        if (!this.hasCollapsedState || processingState == getAddressSearchView().getProcessingState()) {
            return;
        }
        getAddressSearchView().applyProcessingState(processingState);
        invalidateBehaviorOffsets();
    }

    @Override // defpackage.y700
    public void setSourceAddress(Address sourceAddress) {
        if (sourceAddress == null || !sourceAddress.X1()) {
            int behaviourState = behaviourState();
            if (behaviourState == 1 || behaviourState == 2) {
                doOnStateChanged(OnStateChangedKey.SOURCE_ADDRESS_CHANGED, new tid(this, sourceAddress, 0));
            } else {
                onSourceAddressChanged(sourceAddress);
            }
        }
    }

    public void showEditAddress(Uri deeplink) {
        expand();
        getAddressSearchView().processDeeplink(deeplink);
    }

    public Bitmap takeScreenshot() {
        return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
    }

    @Override // defpackage.y700
    public /* bridge */ void tryRenderPanoramaButton(Address address) {
    }

    public final void updatePeekHeight(int maxShownSuggests) {
        int suggestViewTopOffset;
        if (!this.hasCollapsedState) {
            suggestViewTopOffset = 0;
        } else if (getAddressSearchView().getProcessingState() == ModalViewProcessing$ProcessingState.MINIMIZED) {
            int i = this.defaultProcessingHeight;
            suggestViewTopOffset = Math.max(i, (int) (i * 0.19999999f));
        } else {
            suggestViewTopOffset = ((int) ((this.oneSuggestPeekOffset * maxShownSuggests) - this.reducedMarginOffset)) + suggestViewTopOffset();
        }
        if (suggestViewTopOffset != peekHeight()) {
            setBehaviorPeekHeight(suggestViewTopOffset);
            this.listener.ag(suggestViewTopOffset, this.bottomOffsetChanged);
            this.bottomOffsetChanged = false;
        }
    }

    public static final CompositeAddressSearchModalView of(fjd fjdVar, a aVar) {
        Companion.getClass();
        return b.b(fjdVar, aVar);
    }

    @Override // defpackage.y700
    public void showEditAddress(PointType pointType) {
        expand();
        setActivePoint(pointType);
    }

    public /* synthetic */ CompositeAddressSearchModalView(fjd fjdVar, a aVar, c8v0 c8v0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(fjdVar, aVar, c8v0Var);
    }
}

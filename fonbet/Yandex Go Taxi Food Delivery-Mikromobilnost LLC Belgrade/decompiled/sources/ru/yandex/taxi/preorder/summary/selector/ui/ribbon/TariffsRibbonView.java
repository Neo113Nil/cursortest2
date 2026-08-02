package ru.yandex.taxi.preorder.summary.selector.ui.ribbon;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.core.view.b;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b1;
import androidx.recyclerview.widget.x0;
import com.yandex.go.yb.api.domain.model.YbScreenSource;
import defpackage.asx0;
import defpackage.bbx0;
import defpackage.bsx0;
import defpackage.but0;
import defpackage.cma1;
import defpackage.csx0;
import defpackage.czo0;
import defpackage.dsx0;
import defpackage.elx0;
import defpackage.esx0;
import defpackage.ffx;
import defpackage.fsx0;
import defpackage.fva0;
import defpackage.gis0;
import defpackage.gsx0;
import defpackage.hbp0;
import defpackage.hpo0;
import defpackage.hsx0;
import defpackage.igx0;
import defpackage.jhx0;
import defpackage.jl40;
import defpackage.jst;
import defpackage.l8x;
import defpackage.leq0;
import defpackage.lz40;
import defpackage.mr31;
import defpackage.n2v0;
import defpackage.nex0;
import defpackage.o400;
import defpackage.oeq0;
import defpackage.p8f;
import defpackage.pvz0;
import defpackage.qox0;
import defpackage.qr31;
import defpackage.qsg0;
import defpackage.rp31;
import defpackage.sb5;
import defpackage.scc;
import defpackage.sjh;
import defpackage.sjp0;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.ufr0;
import defpackage.unr0;
import defpackage.ux31;
import defpackage.uyj;
import defpackage.vf2;
import defpackage.vfh0;
import defpackage.vrh0;
import defpackage.vrx0;
import defpackage.vx31;
import defpackage.w511;
import defpackage.wls;
import defpackage.wrx0;
import defpackage.xrx0;
import defpackage.xw31;
import defpackage.yp7;
import defpackage.yrx0;
import defpackage.yx00;
import defpackage.zrx0;
import defpackage.zy11;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.appdelegates.SummaryUiDelegate$TariffCardStyle;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.preorder.summary.selector.ui.TariffsViewPositionHandler$onLaidOut$$inlined$doOnLayout$1;
import ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.a;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;
import ru.yandex.taxi.tooltips.manager.TooltipPlacement;
import ru.yandex.taxi.widget.recycler.PositionLayoutManager;

@Metadata(d1 = {"\u0000\u0092\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 £\u00012\u00020\u0001:\u0004¤\u0001¥\u0001BK\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010 \u001a\u00020\u001f2\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!J'\u0010%\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00102\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u0010¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u001fH\u0014¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u001fH\u0014¢\u0006\u0004\b0\u0010/J\u0017\u00102\u001a\u0004\u0018\u00010\u00142\u0006\u00101\u001a\u00020\u0017¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\u001f2\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b6\u00107J#\u0010;\u001a\u00020\u001f2\b\u00108\u001a\u0004\u0018\u00010\u00142\b\u0010:\u001a\u0004\u0018\u000109H\u0002¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u00020\u001f2\u0006\u0010=\u001a\u00020\u0010H\u0002¢\u0006\u0004\b>\u0010-J\u0017\u0010@\u001a\u00020\u001f2\u0006\u0010?\u001a\u00020\u0017H\u0002¢\u0006\u0004\b@\u0010AJ\u0017\u0010D\u001a\u00020\u001f2\u0006\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\bD\u0010EJ!\u0010G\u001a\u00020\u001f2\b\u0010F\u001a\u0004\u0018\u00010\u00142\u0006\u00101\u001a\u00020\u0017H\u0002¢\u0006\u0004\bG\u0010HJ\u0017\u0010K\u001a\u00020\u001f2\u0006\u0010J\u001a\u00020IH\u0002¢\u0006\u0004\bK\u0010LJ\u001f\u0010N\u001a\u00020\u001f2\u0006\u00101\u001a\u00020\u00172\u0006\u0010M\u001a\u00020\u0017H\u0002¢\u0006\u0004\bN\u0010OJ\u001f\u0010P\u001a\u00020\u001f2\u0006\u00101\u001a\u00020\u00172\u0006\u0010M\u001a\u00020\u0017H\u0002¢\u0006\u0004\bP\u0010OJ\u0017\u0010S\u001a\u00020\u001f2\u0006\u0010R\u001a\u00020QH\u0002¢\u0006\u0004\bS\u0010TJ\u0017\u0010U\u001a\u00020\u001f2\u0006\u00101\u001a\u00020\u0017H\u0002¢\u0006\u0004\bU\u0010AJ%\u0010[\u001a\u00020\u001f2\f\u0010X\u001a\b\u0012\u0004\u0012\u00020W0V2\u0006\u0010Z\u001a\u00020YH\u0002¢\u0006\u0004\b[\u0010\\J\u0017\u0010^\u001a\u00020\u00102\u0006\u0010]\u001a\u00020\u0017H\u0002¢\u0006\u0004\b^\u0010_J\u0017\u0010a\u001a\u00020\u001f2\u0006\u0010`\u001a\u00020\u0017H\u0002¢\u0006\u0004\ba\u0010AJ'\u0010b\u001a\u00020\u00102\u0006\u0010`\u001a\u00020\u00172\u0006\u0010M\u001a\u00020\u00172\u0006\u0010Z\u001a\u00020YH\u0002¢\u0006\u0004\bb\u0010cJ\u0017\u0010d\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u0017H\u0002¢\u0006\u0004\bd\u0010_J\u000f\u0010e\u001a\u00020\u001fH\u0002¢\u0006\u0004\be\u0010/R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0003\u0010f\u0012\u0004\bg\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010hR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010iR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010jR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010kR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010lR\u0014\u0010n\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010q\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010t\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0017\u0010w\u001a\u00020v8\u0006¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010zR\u0014\u0010{\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0014\u0010~\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0018\u0010\u0081\u0001\u001a\u00030\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0084\u0001\u001a\u00030\u0083\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0018\u0010\u0087\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008a\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0018\u0010\u008d\u0001\u001a\u00030\u008c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001e\u0010\u0090\u0001\u001a\t\u0012\u0004\u0012\u00020Q0\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001c\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0092\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001c\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0092\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0094\u0001R\u001c\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0096\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0018\u0010\u0099\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0099\u0001\u0010|R\u0016\u0010+\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010lR\u0018\u0010\u009a\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009a\u0001\u0010|R\u0018\u0010\u009b\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009b\u0001\u0010|R\u0018\u0010\u009c\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009c\u0001\u0010|R\u0018\u0010\u009d\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009d\u0001\u0010|R\u0018\u0010\u009e\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009e\u0001\u0010|R\u001c\u0010 \u0001\u001a\u0005\u0018\u00010\u009f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u0018\u0010¢\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¢\u0001\u0010l¨\u0006¦\u0001"}, d2 = {"Lru/yandex/taxi/preorder/summary/selector/ui/ribbon/TariffsRibbonView;", "Lru/yandex/taxi/preorder/summary/selector/ui/ribbon/SeveralTariffsView;", "Landroid/content/Context;", "context", "Lxrx0;", "presenter", "Lwrx0;", "tariffAdapterFactory", "Lru/yandex/taxi/preorder/summary/selector/ui/tariffselector/a$a;", "listener", "Lnex0;", "tariffCellsAnalytics", "Lbbx0;", "tariffAppearanceConfig", "Lqr31;", "bubbleContainer", "", "isOuterSelector", "<init>", "(Landroid/content/Context;Lxrx0;Lwrx0;Lru/yandex/taxi/preorder/summary/selector/ui/tariffselector/a$a;Lnex0;Lbbx0;Lqr31;Z)V", "Landroid/view/View;", "child", "target", "", "nestedScrollAxes", "onStartNestedScroll", "(Landroid/view/View;Landroid/view/View;I)Z", "dx", "dy", "", "consumed", "Lzy11;", "onNestedPreScroll", "(Landroid/view/View;II[I)V", "", "velocityX", "velocityY", "onNestedPreFling", "(Landroid/view/View;FF)Z", "Landroid/view/MotionEvent;", "ev", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "processVerticalFirstSelection", "setProcessVerticalFirstSelection", "(Z)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "position", "getCashbackTooltipAnchorViewByPosition", "(I)Landroid/view/View;", "Lru/yandex/taxi/appdelegates/SummaryUiDelegate$TariffCardStyle;", "style", "updateTariffCardStyle", "(Lru/yandex/taxi/appdelegates/SummaryUiDelegate$TariffCardStyle;)V", "anchor", "Lmr31;", "tooltip", "showTooltip", "(Landroid/view/View;Lmr31;)V", "shown", "updateTooltipVisibility", "selected", "onTariffsSetAndPositioned", "(I)V", "Lsb5;", "viewHolder", "onViewHolderClicked", "(Lsb5;)V", "targetView", "moveItemToPosition", "(Landroid/view/View;I)V", "Ljava/lang/Runnable;", "action", "doOnScrollStop", "(Ljava/lang/Runnable;)V", "compoundPosition", "scrollToItem", "(II)V", "scrollToItemInternal", "Lux31;", "visibleState", "invalidateVisibleState", "(Lux31;)V", "onHighlightedAppear", "", "Lelx0;", "tariffModels", "Lru/yandex/taxi/tariffs/model/PriceUpdate$PriceLoadingState;", "priceLoadingState", "invalidateTariffs", "(Ljava/util/List;Lru/yandex/taxi/tariffs/model/PriceUpdate$PriceLoadingState;)V", "prevSelected", "isFirstSelection", "(I)Z", "selectedPosition", "processFirstSelection", "shouldScrollToSelected", "(IILru/yandex/taxi/tariffs/model/PriceUpdate$PriceLoadingState;)Z", "itemVisible", "onSelectorCellsChanged", "Landroid/content/Context;", "getContext$annotations", "Lxrx0;", "Lru/yandex/taxi/preorder/summary/selector/ui/tariffselector/a$a;", "Lnex0;", "Lqr31;", "Z", "Lhbp0;", "mainScope", "Lhbp0;", "Lvrx0;", "tariffAdapter", "Lvrx0;", "Lsjp0;", "scrollWithoutSelectListener", "Lsjp0;", "Landroidx/recyclerview/widget/RecyclerView;", "tariffsRibbon", "Landroidx/recyclerview/widget/RecyclerView;", "getTariffsRibbon", "()Landroidx/recyclerview/widget/RecyclerView;", "allowVerticalScrollThreshold", CA20Status.STATUS_USER_I, "Ljhx0;", "spaceAndBackgroundDecoration", "Ljhx0;", "Lqox0;", "tooltipDecoration", "Lqox0;", "Lru/yandex/taxi/widget/recycler/PositionLayoutManager;", "layout", "Lru/yandex/taxi/widget/recycler/PositionLayoutManager;", "Lvx31;", "visibleStateListener", "Lvx31;", "Lru/yandex/taxi/preorder/summary/selector/ui/a;", "tariffsViewPositionHandler", "Lru/yandex/taxi/preorder/summary/selector/ui/a;", "Lufr0;", "innerView", "Lufr0;", "Llz40;", "visibleStateSharedFlow", "Llz40;", "Ll8x;", "invalidateJob", "Ll8x;", "selectJob", "Landroidx/recyclerview/widget/RecyclerView$g;", "onScrollStopListener", "Landroidx/recyclerview/widget/RecyclerView$g;", "lastSelected", "scrollPointerId", "initialTouchX", "initialTouchY", "scrollDx", "scrollDy", "Landroid/animation/Animator;", "tooltipExpandAnimator", "Landroid/animation/Animator;", "tooltipShown", "Companion", "dsx0", "csx0", "selector"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TariffsRibbonView extends SeveralTariffsView {
    private static final csx0 Companion = new csx0();
    private static final float SCROLL_ROUND = 0.5f;
    private final int allowVerticalScrollThreshold;
    private final qr31 bubbleContainer;
    private final Context context;
    private int initialTouchX;
    private int initialTouchY;
    private final ufr0 innerView;
    private l8x invalidateJob;
    private final boolean isOuterSelector;
    private int lastSelected;
    private final PositionLayoutManager layout;
    private final a.InterfaceC0113a listener;
    private final hbp0 mainScope;
    private RecyclerView.g onScrollStopListener;
    private final xrx0 presenter;
    private boolean processVerticalFirstSelection;
    private int scrollDx;
    private int scrollDy;
    private int scrollPointerId;
    private final sjp0 scrollWithoutSelectListener;
    private l8x selectJob;
    private final jhx0 spaceAndBackgroundDecoration;
    private final vrx0 tariffAdapter;
    private final nex0 tariffCellsAnalytics;
    private final RecyclerView tariffsRibbon;
    private final ru.yandex.taxi.preorder.summary.selector.ui.a tariffsViewPositionHandler;
    private final qox0 tooltipDecoration;
    private Animator tooltipExpandAnimator;
    private boolean tooltipShown;
    private final vx31 visibleStateListener;
    private final lz40 visibleStateSharedFlow;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.preorder.summary.selector.ui.ribbon.TariffsRibbonView$1, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements wls {
        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            ((TariffsRibbonView) this.receiver).showTooltip((View) obj, (mr31) obj2);
            return zy11.a;
        }
    }

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.preorder.summary.selector.ui.ribbon.TariffsRibbonView$5, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass5 extends FunctionReferenceImpl implements sls {
        @Override // defpackage.sls
        public final Object invoke() {
            ((xrx0) this.receiver).E.a();
            return zy11.a;
        }
    }

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.preorder.summary.selector.ui.ribbon.TariffsRibbonView$6, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass6 extends FunctionReferenceImpl implements tls {
        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            xrx0 xrx0Var = (xrx0) this.receiver;
            xrx0Var.getClass();
            pvz0 pvz0Var = ((mr31) obj).j;
            if (pvz0Var != null) {
                xrx0Var.K.a.b(pvz0Var);
            }
            return zy11.a;
        }
    }

    public TariffsRibbonView(Context context, xrx0 xrx0Var, wrx0 wrx0Var, a.InterfaceC0113a interfaceC0113a, nex0 nex0Var, bbx0 bbx0Var, qr31 qr31Var, boolean z) {
        super(context);
        this.context = context;
        this.presenter = xrx0Var;
        this.listener = interfaceC0113a;
        this.tariffCellsAnalytics = nex0Var;
        this.bubbleContainer = qr31Var;
        this.isOuterSelector = z;
        hbp0 hbp0Var = new hbp0(new czo0(14), "", null);
        this.mainScope = hbp0Var;
        vrx0 vrx0Var = new vrx0(wrx0Var.a, wrx0Var.b, wrx0Var.c, wrx0Var.d, hbp0Var);
        this.tariffAdapter = vrx0Var;
        this.scrollWithoutSelectListener = new sjp0(xw31.n(context), new hsx0(nex0Var));
        this.innerView = new dsx0(this);
        this.visibleStateSharedFlow = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
        this.lastSelected = -1;
        this.processVerticalFirstSelection = true;
        this.scrollPointerId = -1;
        c.q(this, vrh0.tariffs_ribbon, true);
        int i = vfh0.tariffs_ribbon;
        WeakHashMap weakHashMap = b.a;
        RecyclerView recyclerView = (RecyclerView) ((View) rp31.d(this, i));
        this.tariffsRibbon = recyclerView;
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(vrx0Var);
        this.allowVerticalScrollThreshold = ViewConfiguration.get(context).getScaledTouchSlop();
        int i2 = -bbx0Var.i.left;
        jhx0 jhx0Var = new jhx0(context, i2, i2, 0, 0, (Drawable) bbx0Var.f.invoke());
        this.spaceAndBackgroundDecoration = jhx0Var;
        qox0 qox0Var = new qox0(new AnonymousClass1(2, this, TariffsRibbonView.class, "showTooltip", "showTooltip(Landroid/view/View;Lru/yandex/taxi/tooltips/viewgrouptooltip/ViewGroupTooltip;)V", 0));
        this.tooltipDecoration = qox0Var;
        vrx0Var.E = new but0(12, this);
        recyclerView.addItemDecoration(jhx0Var);
        recyclerView.addItemDecoration(qox0Var);
        updateTariffCardStyle(bbx0Var.a);
        recyclerView.setItemAnimator(new igx0());
        PositionLayoutManager positionLayoutManager = new PositionLayoutManager(context);
        this.layout = positionLayoutManager;
        positionLayoutManager.Z = 3;
        recyclerView.setLayoutManager(positionLayoutManager);
        RecyclerView.c itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator instanceof b1) {
            ((b1) itemAnimator).g = false;
        }
        this.visibleStateListener = new vx31(positionLayoutManager);
        positionLayoutManager.d0 = new n2v0(13, this);
        this.tariffsViewPositionHandler = new ru.yandex.taxi.preorder.summary.selector.ui.a(vrx0Var, recyclerView, positionLayoutManager, new asx0(this));
        qr31Var.f = new AnonymousClass5(0, xrx0Var, xrx0.class, "onTooltipClicked", "onTooltipClicked()V", 0);
        qr31Var.g = new AnonymousClass6(1, xrx0Var, xrx0.class, "onTooltipDismissed", "onTooltipDismissed(Lru/yandex/taxi/tooltips/viewgrouptooltip/ViewGroupTooltip;)V", 0);
        b.p(recyclerView, new bsx0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$0(TariffsRibbonView tariffsRibbonView, int i, mr31 mr31Var) {
        qox0 qox0Var = tariffsRibbonView.tooltipDecoration;
        qox0Var.b = i;
        qox0Var.c = !jl40.l(mr31Var, qox0Var.w);
        qox0Var.w = mr31Var;
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oeq0 _init_$lambda$1(TariffsRibbonView tariffsRibbonView, int i) {
        oeq0 oeq0Var;
        elx0 item = tariffsRibbonView.tariffAdapter.getItem(i);
        return (item == null || (oeq0Var = item.L) == null) ? leq0.a : oeq0Var;
    }

    private final void doOnScrollStop(Runnable action) {
        this.tariffsRibbon.removeOnScrollListener(this.scrollWithoutSelectListener);
        RecyclerView.g gVar = this.onScrollStopListener;
        if (gVar != null) {
            this.tariffsRibbon.removeOnScrollListener(gVar);
        }
        fsx0 fsx0Var = new fsx0(action, this);
        this.tariffsRibbon.addOnScrollListener(fsx0Var);
        this.onScrollStopListener = fsx0Var;
    }

    private static /* synthetic */ void getContext$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateTariffs(List<elx0> tariffModels, PriceUpdate$PriceLoadingState priceLoadingState) {
        l8x l8xVar = this.invalidateJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.invalidateJob = this.layout.i2(new hpo0(8, tariffModels, this, priceLoadingState));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invalidateTariffs$lambda$0(List list, TariffsRibbonView tariffsRibbonView, PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState) {
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = 0;
        for (Object obj : list) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                scc.m();
                throw null;
            }
            elx0 elx0Var = (elx0) obj;
            if (elx0Var.u) {
                i3 = i4;
            } else if (elx0Var.w) {
                i2 = i4;
            }
            i4 = i5;
        }
        if (i2 == -1) {
            tariffsRibbonView.spaceAndBackgroundDecoration.f(-1, -1);
        } else {
            tariffsRibbonView.spaceAndBackgroundDecoration.f(i2, i3);
        }
        boolean j = tariffsRibbonView.tariffAdapter.j(list);
        int i6 = tariffsRibbonView.lastSelected;
        tariffsRibbonView.lastSelected = i3;
        if (j || tariffsRibbonView.shouldScrollToSelected(i2, i3, priceUpdate$PriceLoadingState)) {
            tariffsRibbonView.tariffsRibbon.postOnAnimation(new yp7(tariffsRibbonView, i3, i2, 5));
        } else {
            ru.yandex.taxi.preorder.summary.selector.ui.a aVar = tariffsRibbonView.tariffsViewPositionHandler;
            yrx0 yrx0Var = new yrx0(tariffsRibbonView, i3, i);
            RecyclerView recyclerView = aVar.b;
            WeakHashMap weakHashMap = b.a;
            if (!recyclerView.isLaidOut() || recyclerView.isLayoutRequested()) {
                recyclerView.addOnLayoutChangeListener(new TariffsViewPositionHandler$onLaidOut$$inlined$doOnLayout$1(yrx0Var));
            } else {
                yrx0Var.run();
            }
        }
        if (tariffsRibbonView.isFirstSelection(i6) && tariffsRibbonView.processVerticalFirstSelection) {
            tariffsRibbonView.tariffsRibbon.postOnAnimation(new zrx0(tariffsRibbonView, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invalidateTariffs$lambda$0$2(TariffsRibbonView tariffsRibbonView, int i) {
        tariffsRibbonView.tariffsViewPositionHandler.e.g(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invalidateTariffs$lambda$0$3(TariffsRibbonView tariffsRibbonView) {
        tariffsRibbonView.processFirstSelection(tariffsRibbonView.lastSelected);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateVisibleState(ux31 visibleState) {
        ((a.InterfaceC0113a) getListeners().c).i(visibleState);
    }

    private final boolean isFirstSelection(int prevSelected) {
        return prevSelected == -1 && prevSelected != this.lastSelected;
    }

    private final boolean itemVisible(int position) {
        return position >= this.layout.H1() && position <= this.layout.L1();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void moveItemToPosition(View targetView, int position) {
        int i;
        elx0 elx0Var;
        vrx0 vrx0Var = this.tariffAdapter;
        if (position < 0) {
            vrx0Var.getClass();
        } else if (position < vrx0Var.k().size()) {
            elx0 elx0Var2 = (elx0) vrx0Var.k().get(position);
            if (elx0Var2.w) {
                i = elx0Var2.v ? position - 1 : position + 1;
                if (i < 0) {
                    this.layout.j2(this.tariffsRibbon, position, i);
                } else {
                    this.tariffsRibbon.smoothScrollToPosition(position);
                }
                vrx0 vrx0Var2 = this.tariffAdapter;
                vrx0Var2.j(((ru.yandex.taxi.preorder.summary.selector.model.vertical.a) this.presenter.y.get()).a(position, vrx0Var2.k()));
                doOnScrollStop(new zrx0(this, 1));
                if (targetView != null) {
                    animateViewBackgroundAppearing(targetView);
                }
                vrx0 vrx0Var3 = this.tariffAdapter;
                elx0Var = (elx0) kotlin.collections.a.S(vrx0Var3.l(), vrx0Var3.k());
                if (elx0Var == null) {
                    ((a.InterfaceC0113a) getListeners().c).Xf(elx0Var.d, elx0Var.a, !elx0Var.e.isEmpty());
                    return;
                } else {
                    unr0.D(new Object[]{Integer.valueOf(position)}, 1, "Not found tariff in '%s' position", jst.e, new IllegalStateException("Strange tariff selected"));
                    return;
                }
            }
        }
        i = -1;
        if (i < 0) {
        }
        vrx0 vrx0Var22 = this.tariffAdapter;
        vrx0Var22.j(((ru.yandex.taxi.preorder.summary.selector.model.vertical.a) this.presenter.y.get()).a(position, vrx0Var22.k()));
        doOnScrollStop(new zrx0(this, 1));
        if (targetView != null) {
        }
        vrx0 vrx0Var32 = this.tariffAdapter;
        elx0Var = (elx0) kotlin.collections.a.S(vrx0Var32.l(), vrx0Var32.k());
        if (elx0Var == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onHighlightedAppear(int position) {
        this.tariffsViewPositionHandler.e.g(Integer.valueOf(position));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSelectorCellsChanged() {
        xrx0 xrx0Var = this.presenter;
        xrx0Var.z.b(this.tariffsViewPositionHandler.b(), jl40.l(xrx0Var.B.a(), ""));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTariffsSetAndPositioned(int selected) {
        elx0 item = this.tariffAdapter.getItem(selected);
        if (item == null) {
            return;
        }
        onSelectorCellsChanged();
        ((a.InterfaceC0113a) getListeners().c).Z6(selected, item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onViewHolderClicked(sb5 viewHolder) {
        int G = viewHolder.G();
        fva0.f(this.presenter.C, "TariffSelector.Change", PerformanceAnalytics$Type.Animation, 0L, 4);
        elx0 elx0Var = (elx0) this.tariffAdapter.k().get(G);
        vrx0 vrx0Var = this.tariffAdapter;
        elx0 elx0Var2 = (elx0) kotlin.collections.a.S(vrx0Var.l(), vrx0Var.k());
        if (elx0Var != null && (elx0Var.c instanceof p8f)) {
            if (jl40.l(elx0Var.b, elx0Var2 != null ? elx0Var2.b : null) && jl40.l(elx0Var.a, elx0Var2.a)) {
                xrx0 xrx0Var = this.presenter;
                xrx0Var.F.a(YbScreenSource.SUMMARY, null, new n2v0(12, xrx0Var));
                return;
            }
        }
        if (elx0Var != null && (elx0Var.c instanceof yx00)) {
            if (jl40.l(elx0Var.b, elx0Var2 != null ? elx0Var2.b : null) && jl40.l(elx0Var.a, elx0Var2.a)) {
                xrx0 xrx0Var2 = this.presenter;
                tje.N(xrx0Var2.Jg(), null, null, new TariffsRibbonPresenter$onMarketplaceAltClicked$1(xrx0Var2, null), 3);
                return;
            }
        }
        if (G != this.tariffAdapter.l() || elx0Var2 == null || elx0Var2.k) {
            moveItemToPosition(viewHolder.a, G);
        } else {
            ((a.InterfaceC0113a) getListeners().c).u0(elx0Var2.d);
        }
    }

    private final void processFirstSelection(int selectedPosition) {
        elx0 item = this.tariffAdapter.getItem(selectedPosition);
        if (item == null || item.e.isEmpty()) {
            return;
        }
        ((a.InterfaceC0113a) getListeners().c).u0(item.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scrollToItem(int position, int compoundPosition) {
        l8x l8xVar = this.selectJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        if (this.tariffsRibbon.isComputingLayout()) {
            this.selectJob = tje.N(this.mainScope, null, null, new TariffsRibbonView$scrollToItem$$inlined$safeCollectIn$1(e.T(e.c(this.layout.b0), 1), null, this, position, compoundPosition, position), 3);
        } else {
            this.tariffsRibbon.stopScroll();
            scrollToItemInternal(position, compoundPosition);
        }
    }

    private final void scrollToItemInternal(int position, int compoundPosition) {
        if (compoundPosition == -1) {
            this.tariffsRibbon.smoothScrollToPosition(position);
        } else if (Math.abs(position - compoundPosition) <= 1) {
            this.layout.j2(this.tariffsRibbon, position, compoundPosition);
        } else {
            unr0.z(jst.e, "compound position should be close to target");
        }
        doOnScrollStop(new yrx0(this, position, 1));
    }

    private final boolean shouldScrollToSelected(int selectedPosition, int compoundPosition, PriceUpdate$PriceLoadingState priceLoadingState) {
        if (selectedPosition == -1 || priceLoadingState != PriceUpdate$PriceLoadingState.LOADED) {
            return false;
        }
        if (itemVisible(selectedPosition)) {
            return (compoundPosition == -1 || itemVisible(compoundPosition)) ? false : true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showTooltip(View anchor, mr31 tooltip) {
        if (anchor == null || tooltip == null || !this.bubbleContainer.d(anchor, tooltip, TooltipPlacement.SUMMARY_TARIFF_SELECTOR)) {
            this.bubbleContainer.a();
            updateTooltipVisibility(false);
        } else {
            this.tariffCellsAnalytics.d(tooltip.b);
            updateTooltipVisibility(true);
        }
    }

    private final void updateTariffCardStyle(SummaryUiDelegate$TariffCardStyle style) {
        int i = esx0.a[style.ordinal()];
        if (i == 1) {
            this.tariffsRibbon.setLayoutParams(new FrameLayout.LayoutParams(-1, tje.r(qsg0.tariffs_selector_height, getContext())));
            this.tariffsRibbon.addItemDecoration(new gis0());
        } else if (i == 2) {
            this.tariffsRibbon.setLayoutParams(new FrameLayout.LayoutParams(-1, tje.r(qsg0.high_tariffs_selector_height, getContext())));
        } else {
            w511.b();
        }
    }

    private final void updateTooltipVisibility(boolean shown) {
        if (shown == this.tooltipShown) {
            return;
        }
        this.tooltipShown = shown;
        Animator animator = this.tooltipExpandAnimator;
        if (animator != null && animator.isRunning()) {
            animator.cancel();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.tariffsRibbon.getLayoutParams();
        ValueAnimator f = cma1.f(layoutParams.topMargin, shown ? tje.u(24, getContext()) : 0, new vf2(21, layoutParams, this));
        f.setInterpolator(new FastOutSlowInInterpolator());
        f.setDuration(300L);
        f.start();
        this.tooltipExpandAnimator = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateTooltipVisibility$lambda$0(FrameLayout.LayoutParams layoutParams, TariffsRibbonView tariffsRibbonView, ValueAnimator valueAnimator) {
        layoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        tariffsRibbonView.tariffsRibbon.setLayoutParams(layoutParams);
    }

    public final View getCashbackTooltipAnchorViewByPosition(int position) {
        x0 findViewHolderForAdapterPosition = this.tariffsRibbon.findViewHolderForAdapterPosition(position);
        if (findViewHolderForAdapterPosition instanceof sb5) {
            return ((sb5) findViewHolderForAdapterPosition).Y();
        }
        return null;
    }

    public final RecyclerView getTariffsRibbon() {
        return this.tariffsRibbon;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mainScope.a();
        xrx0 xrx0Var = this.presenter;
        xrx0Var.Bg(this.innerView);
        tse Jg = xrx0Var.Jg();
        sjh sjhVar = uyj.a;
        tje.N(Jg, o400.a.x, null, new TariffsRibbonPresenter$attachView$1(xrx0Var, null), 2);
        this.tariffsRibbon.addOnScrollListener(this.scrollWithoutSelectListener);
        this.tariffsRibbon.addOnScrollListener(this.visibleStateListener);
        this.tariffAdapter.B = new gsx0(this);
        this.visibleStateListener.a(this.visibleStateSharedFlow);
        tje.N(this.mainScope, null, null, new TariffsRibbonView$onAttachedToWindow$$inlined$safeCollectIn$1(this.visibleStateSharedFlow, null, this), 3);
        attachListener(this.listener);
        this.tariffsViewPositionHandler.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mainScope.b();
        this.presenter.Cg();
        this.visibleStateListener.a(null);
        this.tariffsRibbon.clearOnScrollListeners();
        this.tariffAdapter.B = null;
        detachListeners();
        this.tariffsViewPositionHandler.f.b();
        this.bubbleContainer.a();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        int findPointerIndex;
        if (!this.isOuterSelector) {
            if (xw31.l((int) ev.getRawX(), (int) ev.getRawY(), 0, this.tariffsRibbon)) {
                int actionMasked = ev.getActionMasked();
                if (actionMasked == 0) {
                    this.scrollPointerId = ev.getPointerId(0);
                    this.initialTouchX = (int) (ev.getX() + 0.5f);
                    this.initialTouchY = (int) (ev.getY() + 0.5f);
                } else if (actionMasked == 1) {
                    this.scrollDx = 0;
                    this.scrollDy = 0;
                } else if (actionMasked == 2 && (findPointerIndex = ev.findPointerIndex(this.scrollPointerId)) >= 0) {
                    int x = (int) (ev.getX(findPointerIndex) + 0.5f);
                    int y = (int) (ev.getY(findPointerIndex) + 0.5f);
                    this.scrollDx = Math.abs(this.initialTouchX - x);
                    this.scrollDy = Math.abs(this.initialTouchY - y);
                }
                int i = this.scrollDx;
                int i2 = this.scrollDy;
                getParent().requestDisallowInterceptTouchEvent(i >= i2 || i2 < this.allowVerticalScrollThreshold);
                return super.onInterceptTouchEvent(ev);
            }
        }
        return super.onInterceptTouchEvent(ev);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View target, float velocityX, float velocityY) {
        if (this.isOuterSelector) {
            return super.onNestedPreFling(target, velocityX, velocityY);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View target, int dx, int dy, int[] consumed) {
        if (this.isOuterSelector || Math.abs(this.scrollDy) <= Math.abs(this.scrollDx)) {
            return;
        }
        getParent().requestDisallowInterceptTouchEvent(false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View child, View target, int nestedScrollAxes) {
        return !this.isOuterSelector;
    }

    public final void setProcessVerticalFirstSelection(boolean processVerticalFirstSelection) {
        this.processVerticalFirstSelection = processVerticalFirstSelection;
    }
}

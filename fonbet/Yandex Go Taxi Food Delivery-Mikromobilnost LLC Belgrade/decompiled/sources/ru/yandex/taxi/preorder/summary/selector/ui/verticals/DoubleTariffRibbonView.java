package ru.yandex.taxi.preorder.summary.selector.ui.verticals;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.x0;
import androidx.viewpager2.widget.ViewPager2;
import androidx.viewpager2.widget.i;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.taxi.analytics.HubOpenReason;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.aub;
import defpackage.cma1;
import defpackage.ei;
import defpackage.elx0;
import defpackage.jl40;
import defpackage.k6m;
import defpackage.kk31;
import defpackage.kp50;
import defpackage.kw00;
import defpackage.lk31;
import defpackage.loj;
import defpackage.m6m;
import defpackage.mr31;
import defpackage.mrg0;
import defpackage.n6m;
import defpackage.nex0;
import defpackage.nwy0;
import defpackage.ny61;
import defpackage.o400;
import defpackage.o6m;
import defpackage.ob31;
import defpackage.og20;
import defpackage.q6m;
import defpackage.qf31;
import defpackage.qr31;
import defpackage.sb5;
import defpackage.sf31;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.vfh0;
import defpackage.vrh0;
import defpackage.xw31;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.preorder.summary.selector.analytics.VerticalSelectorAnalytics$SelectionChangeReason;
import ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.a;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.tooltips.manager.TooltipPlacement;

@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002:\u0002MXBC\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001b\u001a\u00020\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b$\u0010#J\u0017\u0010&\u001a\u00020\u00132\u0006\u0010%\u001a\u00020!H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0013H\u0002¢\u0006\u0004\b(\u0010\u0015J\u000f\u0010)\u001a\u00020\u0013H\u0002¢\u0006\u0004\b)\u0010\u0015JC\u00103\u001a\u00020\u00132\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0*2\u0006\u0010/\u001a\u00020\u00172\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020!H\u0002¢\u0006\u0004\b3\u00104J!\u00107\u001a\u00020\u00132\u0006\u00105\u001a\u00020\u00172\b\b\u0002\u00106\u001a\u00020!H\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0013H\u0002¢\u0006\u0004\b9\u0010\u0015J\u000f\u0010:\u001a\u00020\u0013H\u0002¢\u0006\u0004\b:\u0010\u0015J\u000f\u0010;\u001a\u00020\u0013H\u0002¢\u0006\u0004\b;\u0010\u0015R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010<R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010=R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010>R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010?R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010N\u001a\u00060MR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010S\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010=R\u0016\u0010T\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010V\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010W¨\u0006Y"}, d2 = {"Lru/yandex/taxi/preorder/summary/selector/ui/verticals/DoubleTariffRibbonView;", "Landroid/widget/FrameLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "Llk31;", "verticalsViewFactory", "Lsf31;", "verticalPagerAdapter", "Lru/yandex/taxi/preorder/summary/selector/ui/tariffselector/a$a;", "originalListener", "Lk6m;", "presenter", "Lqr31;", "bubbleContainer", "Lnex0;", "cellsAnalytics", "<init>", "(Landroid/content/Context;Llk31;Lsf31;Lru/yandex/taxi/preorder/summary/selector/ui/tariffselector/a$a;Lk6m;Lqr31;Lnex0;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", "margin", "setTopMargin", "(I)V", "position", "Landroid/view/View;", "getCashbackTooltipAnchorViewByPosition", "(I)Landroid/view/View;", "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "dispatchTouchEvent", "disallowIntercept", "requestDisallowInterceptTouchEvent", "(Z)V", "setupAccessibility", "cleanOldRenderedItems", "", "Lob31;", "headerModels", "Lelx0;", "verticalModels", "selectedVertical", "Lru/yandex/taxi/tariffs/model/PriceUpdate$PriceLoadingState;", "priceLoadingState", "isSwipeVerticalEnabled", "renderUiContent", "(Ljava/util/List;Ljava/util/List;ILru/yandex/taxi/tariffs/model/PriceUpdate$PriceLoadingState;Z)V", Constants.KEY_PAGE, "animate", "updateCurrentPage", "(IZ)V", "refreshBubbleState", "refreshTariffSelectorMargin", "setupTooltip", "Lsf31;", "Lru/yandex/taxi/preorder/summary/selector/ui/tariffselector/a$a;", "Lk6m;", "Lqr31;", "Lnex0;", "Lq6m;", "binding", "Lq6m;", "Lkk31;", "verticalsView", "Lkk31;", "Landroidx/viewpager2/widget/ViewPager2;", "verticalsViewPager", "Landroidx/viewpager2/widget/ViewPager2;", "Lcom/yandex/go/design/view/GoConstraintLayout;", "container", "Lcom/yandex/go/design/view/GoConstraintLayout;", "Ln6m;", "mvpView", "Ln6m;", "Lo6m;", "touchHelper", "Lo6m;", "currentListener", "isVerticalPageScrolling", "Z", "targetSelectedPage", CA20Status.STATUS_USER_I, "ru/yandex/taxi/preorder/summary/selector/ui/verticals/a", "selector"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DoubleTariffRibbonView extends FrameLayout implements nwy0 {
    private final q6m binding;
    private final qr31 bubbleContainer;
    private final nex0 cellsAnalytics;
    private final GoConstraintLayout container;
    private a.InterfaceC0113a currentListener;
    private boolean isVerticalPageScrolling;
    private final n6m mvpView;
    private final a.InterfaceC0113a originalListener;
    private final k6m presenter;
    private int targetSelectedPage;
    private final o6m touchHelper;
    private final sf31 verticalPagerAdapter;
    private final kk31 verticalsView;
    private final ViewPager2 verticalsViewPager;

    public DoubleTariffRibbonView(Context context, lk31 lk31Var, sf31 sf31Var, a.InterfaceC0113a interfaceC0113a, k6m k6mVar, qr31 qr31Var, nex0 nex0Var) {
        super(context);
        this.verticalPagerAdapter = sf31Var;
        this.originalListener = interfaceC0113a;
        this.presenter = k6mVar;
        this.bubbleContainer = qr31Var;
        this.cellsAnalytics = nex0Var;
        View inflate = LayoutInflater.from(context).inflate(vrh0.double_tariff_selector_view, (ViewGroup) this, false);
        addView(inflate);
        int i = vfh0.tariff_selector_viewpager;
        ViewPager2 viewPager2 = (ViewPager2) cma1.O(i, inflate);
        if (viewPager2 != null) {
            i = vfh0.tariff_selector_viewpager_anchor;
            Space space = (Space) cma1.O(i, inflate);
            if (space != null) {
                GoConstraintLayout goConstraintLayout = (GoConstraintLayout) inflate;
                i = vfh0.vertical_selector_recycler_stub;
                View O = cma1.O(i, inflate);
                if (O != null) {
                    this.binding = new q6m(goConstraintLayout, viewPager2, space, goConstraintLayout, O);
                    kk31 a = lk31Var.a(new loj(2, this));
                    this.verticalsView = a;
                    this.verticalsViewPager = viewPager2;
                    this.container = goConstraintLayout;
                    this.mvpView = new n6m(this);
                    this.touchHelper = new o6m();
                    this.targetSelectedPage = -1;
                    c.w(O, a.asView());
                    sf31Var.I = new a(this);
                    viewPager2.setAdapter(sf31Var);
                    viewPager2.setPageTransformer(new kw00(tje.r(mrg0.go_design_m_space, getContext()), 0));
                    viewPager2.registerOnPageChangeCallback(new m6m(this));
                    setupAccessibility();
                    setupTooltip();
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }

    private final void cleanOldRenderedItems() {
        PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState = PriceUpdate$PriceLoadingState.LOADED;
        EmptyList emptyList = EmptyList.a;
        renderUiContent(emptyList, emptyList, -1, priceUpdate$PriceLoadingState, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshBubbleState() {
        qf31 qf31Var = (qf31) i.a(this.verticalsViewPager, this.targetSelectedPage);
        View pageTooltipTarget = qf31Var != null ? qf31Var.N.pageTooltipTarget() : null;
        mr31 pageTooltip = qf31Var != null ? qf31Var.N.pageTooltip() : null;
        if (pageTooltipTarget == null || pageTooltip == null || !this.bubbleContainer.d(pageTooltipTarget, pageTooltip, TooltipPlacement.SUMMARY_TARIFF_SELECTOR)) {
            this.bubbleContainer.a();
        } else {
            this.cellsAnalytics.d(pageTooltip.b);
        }
        refreshTariffSelectorMargin();
    }

    private final void refreshTariffSelectorMargin() {
        int u = this.bubbleContainer.h != null ? tje.u(20, getContext()) : this.verticalsView.asView().getVisibility() == 0 ? tje.u(40, getContext()) : tje.u(28, getContext());
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.binding.b.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin != u) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = u;
            this.binding.b.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderUiContent(List<ob31> headerModels, List<elx0> verticalModels, int selectedVertical, PriceUpdate$PriceLoadingState priceLoadingState, boolean isSwipeVerticalEnabled) {
        this.verticalsViewPager.setUserInputEnabled(isSwipeVerticalEnabled);
        this.verticalsView.render(headerModels);
        sf31 sf31Var = this.verticalPagerAdapter;
        androidx.recyclerview.widget.i f = kp50.f(new og20(sf31Var.G, verticalModels, new aub(24)), false);
        sf31Var.G = verticalModels;
        sf31Var.H = priceLoadingState;
        f.b(sf31Var);
        if (selectedVertical >= 0 && selectedVertical < this.verticalPagerAdapter.G.size() && !this.isVerticalPageScrolling) {
            if (this.targetSelectedPage != selectedVertical) {
                updateCurrentPage(selectedVertical, false);
                this.verticalsView.updateHeaderState(selectedVertical, 0.0f);
                refreshBubbleState();
            }
            this.verticalsView.smoothScrollToPosition(selectedVertical);
        }
        setMinimumHeight(0);
        refreshTariffSelectorMargin();
    }

    private final void setupAccessibility() {
        androidx.core.view.b.p(this.verticalsViewPager, new ei(6));
    }

    private final void setupTooltip() {
        this.bubbleContainer.f = new DoubleTariffRibbonView$setupTooltip$1(0, this.presenter, k6m.class, "onTooltipClicked", "onTooltipClicked()V", 0);
        this.bubbleContainer.g = new DoubleTariffRibbonView$setupTooltip$2(1, this.presenter, k6m.class, "onTooltipDismissed", "onTooltipDismissed(Lru/yandex/taxi/tooltips/viewgrouptooltip/ViewGroupTooltip;)V", 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCurrentPage(int page, boolean animate) {
        this.targetSelectedPage = page;
        this.verticalsViewPager.setCurrentItem(page, animate);
    }

    public static /* synthetic */ void updateCurrentPage$default(DoubleTariffRibbonView doubleTariffRibbonView, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        doubleTariffRibbonView.updateCurrentPage(i, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 verticalsView$lambda$0(DoubleTariffRibbonView doubleTariffRibbonView, int i, ob31 ob31Var) {
        updateCurrentPage$default(doubleTariffRibbonView, i, false, 2, null);
        k6m k6mVar = doubleTariffRibbonView.presenter;
        String str = ob31Var.a;
        if (!jl40.l(((k) k6mVar.y).h(), str)) {
            k6mVar.P = true;
            k6mVar.Kg(str, VerticalSelectorAnalytics$SelectionChangeReason.Tap);
            k6mVar.K.a(HubOpenReason.TAP);
        }
        k6mVar.F.a(str);
        doubleTariffRibbonView.refreshBubbleState();
        return zy11.a;
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public /* bridge */ void applyTheme(ThemeType themeType) {
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent ev) {
        o6m o6mVar = this.touchHelper;
        o6mVar.getClass();
        if (ev.getAction() == 0) {
            o6mVar.a = ev.getX();
            o6mVar.b = ev.getY();
            o6mVar.c = 0.0f;
            o6mVar.d = 0.0f;
        }
        if (ev.getAction() == 2) {
            o6mVar.c = ev.getX() - o6mVar.a;
            o6mVar.d = ev.getY() - o6mVar.b;
        }
        return super.dispatchTouchEvent(ev);
    }

    public final View getCashbackTooltipAnchorViewByPosition(int position) {
        x0 a = i.a(this.verticalsViewPager, this.targetSelectedPage);
        qf31 qf31Var = a instanceof qf31 ? (qf31) a : null;
        if (qf31Var != null) {
            x0 tariffViewHolderByPosition = qf31Var.N.getTariffViewHolderByPosition(position);
            sb5 sb5Var = tariffViewHolderByPosition instanceof sb5 ? (sb5) tariffViewHolderByPosition : null;
            if (sb5Var != null) {
                return sb5Var.Y();
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        k6m k6mVar = this.presenter;
        k6mVar.Bg(this.mvpView);
        tse Jg = k6mVar.Jg();
        sjh sjhVar = uyj.a;
        tje.N(Jg, o400.a.x, null, new DoubleTariffRibbonPresenter$attachView$1(k6mVar, null), 2);
        this.currentListener = this.originalListener;
        this.verticalPagerAdapter.L.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
        cleanOldRenderedItems();
        this.currentListener = null;
        this.verticalPagerAdapter.L.b();
        this.bubbleContainer.a();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        o6m o6mVar = this.touchHelper;
        o6mVar.getClass();
        if (ev.getAction() == 2) {
            float f = o6mVar.c;
            if (f != 0.0f) {
                float f2 = o6mVar.d;
                if (f2 != 0.0f && Math.abs(f2) <= Math.abs(f)) {
                    requestDisallowInterceptTouchEvent(true);
                }
            }
        }
        return super.onInterceptTouchEvent(ev);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        o6m o6mVar = this.touchHelper;
        if (disallowIntercept) {
            o6mVar.getClass();
        } else {
            float f = o6mVar.c;
            if (f != 0.0f) {
                float f2 = o6mVar.d;
                if (f2 != 0.0f) {
                    disallowIntercept = Math.abs(f2) <= Math.abs(f);
                }
            }
        }
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }

    public final void setTopMargin(int margin) {
        xw31.L(margin, this.container);
    }
}

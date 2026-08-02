package ru.yandex.taxi.preorder.summary.tariffpage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.taxi.summary.shared.expanded.SummaryExpandedView$ScrollingState;
import defpackage.akx0;
import defpackage.ckx0;
import defpackage.cma1;
import defpackage.d2u0;
import defpackage.efv0;
import defpackage.enx0;
import defpackage.gfv0;
import defpackage.jst;
import defpackage.ktg;
import defpackage.lkx0;
import defpackage.n2v0;
import defpackage.ny61;
import defpackage.okx0;
import defpackage.p81;
import defpackage.pkx0;
import defpackage.qke;
import defpackage.qkx0;
import defpackage.qsg0;
import defpackage.rkx0;
import defpackage.tje;
import defpackage.vev0;
import defpackage.w7t0;
import defpackage.wvr;
import defpackage.xkx0;
import defpackage.xrh0;
import defpackage.xw31;
import defpackage.yfh0;
import defpackage.yjx0;
import kotlin.Metadata;
import ru.yandex.taxi.HapticController$Effect;
import ru.yandex.taxi.design.DotsIndicatorComponent;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.recycler.LockableLinearLayoutManager;

@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 O2\u00020\u00012\u00020\u0002:\u0002PQB7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00142\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0014H\u0014¢\u0006\u0004\b'\u0010\u0016J\u000f\u0010(\u001a\u00020\u0014H\u0014¢\u0006\u0004\b(\u0010\u0016J\u0017\u0010+\u001a\u00020\u00142\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0014H\u0016¢\u0006\u0004\b0\u0010\u0016J\u000f\u00101\u001a\u00020\u0014H\u0016¢\u0006\u0004\b1\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00102R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00103R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00104R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010E\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010J\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010FR\u0014\u0010L\u001a\u00020$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u0010&R\u0016\u0010N\u001a\u0004\u0018\u00010-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010/¨\u0006R"}, d2 = {"Lru/yandex/taxi/preorder/summary/tariffpage/TariffPagerView;", "Landroid/widget/FrameLayout;", "Lefv0;", "Landroid/content/Context;", "context", "Llkx0;", "presenter", "Lckx0;", "adapter", "Lgfv0;", "listener", "Lru/yandex/taxi/design/DotsIndicatorComponent;", "dotsIndicatorComponent", "Lvev0;", "summaryConfig", "<init>", "(Landroid/content/Context;Llkx0;Lckx0;Lgfv0;Lru/yandex/taxi/design/DotsIndicatorComponent;Lvev0;)V", "Landroidx/recyclerview/widget/LinearLayoutManager;", "initTariffPager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "Lzy11;", "setupExternalScrollLock", "()V", "Landroidx/recyclerview/widget/RecyclerView$g;", "getTariffPageScrollChangedListener", "()Landroidx/recyclerview/widget/RecyclerView$g;", "Lakx0;", "getTariffPageIndicatorController", "()Lakx0;", "Lenx0;", "getTariffScrollListener", "()Lenx0;", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "", "allowTraverse", "()Z", "onAttachedToWindow", "onDetachedFromWindow", "Lcom/yandex/go/taxi/summary/shared/expanded/SummaryExpandedView$ScrollingState;", "scrollingState", "setScrollingState", "(Lcom/yandex/go/taxi/summary/shared/expanded/SummaryExpandedView$ScrollingState;)V", "Landroid/view/View;", "asView", "()Landroid/view/View;", "onGoingToExpand", "onGoingToHide", "Llkx0;", "Lckx0;", "Lgfv0;", "Lru/yandex/taxi/design/DotsIndicatorComponent;", "Lw7t0;", "binding", "Lw7t0;", "Landroidx/recyclerview/widget/RecyclerView;", "tariffPager", "Landroidx/recyclerview/widget/RecyclerView;", "Lktg;", "tariffSelectionDebouncer", "Lktg;", "onTariffPageScrollChangedListener", "Landroidx/recyclerview/widget/RecyclerView$g;", "tariffPageIndicatorController", "Lakx0;", "tariffScrollListener", "Lenx0;", "addressOnTop", "Z", "Ld2u0;", "snapHelper", "Ld2u0;", "isScrollExternallyLocked", "getShowDotsIndicator", "showDotsIndicator", "getFocusedView", "focusedView", "Companion", "qkx0", "pkx0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TariffPagerView extends FrameLayout implements efv0 {
    private static final pkx0 Companion = new pkx0();

    @Deprecated
    public static final long PAGE_SCROLL_DELAY = 100;
    private final ckx0 adapter;
    private final boolean addressOnTop;
    private final w7t0 binding;
    private final DotsIndicatorComponent dotsIndicatorComponent;
    private final boolean isScrollExternallyLocked;
    private final gfv0 listener;
    private final RecyclerView.g onTariffPageScrollChangedListener;
    private final lkx0 presenter;
    private d2u0 snapHelper;
    private final akx0 tariffPageIndicatorController;
    private final RecyclerView tariffPager;
    private final enx0 tariffScrollListener;
    private final ktg tariffSelectionDebouncer;

    public TariffPagerView(Context context, lkx0 lkx0Var, ckx0 ckx0Var, gfv0 gfv0Var, DotsIndicatorComponent dotsIndicatorComponent, vev0 vev0Var) {
        super(context);
        this.presenter = lkx0Var;
        this.adapter = ckx0Var;
        this.listener = gfv0Var;
        this.dotsIndicatorComponent = dotsIndicatorComponent;
        LayoutInflater.from(context).inflate(xrh0.solid_tariffs_pager_view, this);
        int i = yfh0.cards_view_pager;
        RecyclerView recyclerView = (RecyclerView) cma1.O(i, this);
        if (recyclerView == null) {
            ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
            throw null;
        }
        this.binding = new w7t0(this, recyclerView);
        this.tariffPager = recyclerView;
        this.tariffSelectionDebouncer = new ktg();
        this.onTariffPageScrollChangedListener = getTariffPageScrollChangedListener();
        this.tariffPageIndicatorController = getTariffPageIndicatorController();
        this.tariffScrollListener = getTariffScrollListener();
        this.addressOnTop = vev0Var.a instanceof p81;
        this.isScrollExternallyLocked = vev0Var.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getShowDotsIndicator() {
        return (this.isScrollExternallyLocked || this.addressOnTop) ? false : true;
    }

    private final akx0 getTariffPageIndicatorController() {
        return new akx0(this.dotsIndicatorComponent, new n2v0(11, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yjx0 getTariffPageIndicatorController$lambda$0(TariffPagerView tariffPagerView) {
        int i = wvr.a(tariffPagerView.tariffPager).b;
        return new yjx0(i, i != -1);
    }

    private final RecyclerView.g getTariffPageScrollChangedListener() {
        return new rkx0(this);
    }

    private final enx0 getTariffScrollListener() {
        return new enx0(initTariffPager(), xw31.n(getContext()), tje.r(qsg0.tariff_big_card_items_offset, getContext()));
    }

    private final LinearLayoutManager initTariffPager() {
        xkx0 xkx0Var = new xkx0(this.presenter, this.listener);
        ckx0 ckx0Var = this.adapter;
        ckx0Var.b = xkx0Var;
        ckx0Var.c = xkx0Var;
        LockableLinearLayoutManager lockableLinearLayoutManager = new LockableLinearLayoutManager(getContext(), 0, false);
        lockableLinearLayoutManager.Z = 3;
        RecyclerView recyclerView = this.tariffPager;
        recyclerView.setLayoutManager(lockableLinearLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(null);
        recyclerView.setItemViewCacheSize(10);
        recyclerView.getRecycledViewPool().e(yfh0.card_type_regular, Integer.MAX_VALUE);
        recyclerView.getRecycledViewPool().e(yfh0.card_type_vertical, Integer.MAX_VALUE);
        return lockableLinearLayoutManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(TariffPagerView tariffPagerView) {
        qke.w(tariffPagerView.getContext(), HapticController$Effect.TICK, true, false);
    }

    private final void setupExternalScrollLock() {
        if (this.isScrollExternallyLocked) {
            LockableLinearLayoutManager lockableLinearLayoutManager = (LockableLinearLayoutManager) this.tariffPager.getLayoutManager();
            if (lockableLinearLayoutManager == null) {
                jst.e.w(new IllegalStateException("Missed layout manager"));
            } else {
                this.dotsIndicatorComponent.setVisibility(8);
                lockableLinearLayoutManager.b0 = true;
            }
        }
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public boolean getIsTrackingsRedesignEnabled() {
        return false;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        this.adapter.applyTheme(themeType);
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    @Override // defpackage.efv0
    public View asView() {
        return this;
    }

    @Override // defpackage.efv0
    public View getFocusedView() {
        return (View) wvr.a(this.tariffPager).c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.tariffPager.setAdapter(this.adapter);
        d2u0 d2u0Var = new d2u0();
        this.snapHelper = d2u0Var;
        d2u0Var.b(this.tariffPager);
        d2u0 d2u0Var2 = this.snapHelper;
        if (d2u0Var2 != null) {
            d2u0Var2.h = new okx0(this, 0);
        }
        this.tariffPager.addOnScrollListener(this.onTariffPageScrollChangedListener);
        this.tariffPager.addOnScrollListener(this.tariffPageIndicatorController.c);
        this.tariffPager.addOnScrollListener(this.tariffScrollListener);
        setupExternalScrollLock();
        lkx0 lkx0Var = this.presenter;
        qkx0 qkx0Var = new qkx0(this);
        lkx0Var.Bg(qkx0Var);
        tje.N(lkx0Var.Jg(), null, null, new TariffPagerPresenter$attachView$1(lkx0Var, qkx0Var, null), 3);
        lkx0Var.I.g.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.tariffPager.setAdapter(null);
        this.tariffPager.removeOnScrollListener(this.tariffScrollListener);
        this.tariffPager.removeOnScrollListener(this.tariffPageIndicatorController.c);
        this.tariffPager.removeOnScrollListener(this.onTariffPageScrollChangedListener);
        this.presenter.Cg();
        d2u0 d2u0Var = this.snapHelper;
        if (d2u0Var != null) {
            d2u0Var.h = null;
            d2u0Var.b(null);
            this.snapHelper = null;
        }
    }

    @Override // defpackage.efv0
    public void onGoingToExpand() {
    }

    @Override // defpackage.efv0
    public void onGoingToHide() {
    }

    @Override // defpackage.efv0
    public void setScrollingState(SummaryExpandedView$ScrollingState scrollingState) {
        LockableLinearLayoutManager lockableLinearLayoutManager = (LockableLinearLayoutManager) this.tariffPager.getLayoutManager();
        if (lockableLinearLayoutManager == null) {
            jst.e.w(new IllegalStateException("Missed layout manager"));
        } else if (this.isScrollExternallyLocked || scrollingState == SummaryExpandedView$ScrollingState.LOCKED) {
            lockableLinearLayoutManager.b0 = true;
        } else {
            lockableLinearLayoutManager.b0 = false;
        }
    }
}

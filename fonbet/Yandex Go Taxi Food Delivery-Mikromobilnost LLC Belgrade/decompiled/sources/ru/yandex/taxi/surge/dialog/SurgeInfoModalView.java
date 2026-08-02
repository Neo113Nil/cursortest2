package ru.yandex.taxi.surge.dialog;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoFrameLayout;
import defpackage.a0b;
import defpackage.adp;
import defpackage.arm0;
import defpackage.b0b;
import defpackage.bdc;
import defpackage.c230;
import defpackage.c57;
import defpackage.c6r0;
import defpackage.cau;
import defpackage.cma1;
import defpackage.cyt;
import defpackage.d4j;
import defpackage.eru;
import defpackage.f4j;
import defpackage.g0b;
import defpackage.g0c;
import defpackage.g4j;
import defpackage.gtq0;
import defpackage.gvz0;
import defpackage.h0b;
import defpackage.he7;
import defpackage.hgr0;
import defpackage.hhs0;
import defpackage.hk1;
import defpackage.hru;
import defpackage.io4;
import defpackage.iws;
import defpackage.l7n;
import defpackage.lki;
import defpackage.lky0;
import defpackage.lo4;
import defpackage.mr31;
import defpackage.mrg0;
import defpackage.mt6;
import defpackage.nni;
import defpackage.nrq0;
import defpackage.ny61;
import defpackage.o2j;
import defpackage.oew0;
import defpackage.pdc;
import defpackage.pm5;
import defpackage.psw0;
import defpackage.q3q0;
import defpackage.qha;
import defpackage.qje;
import defpackage.qoi0;
import defpackage.qr31;
import defpackage.qsw0;
import defpackage.rji0;
import defpackage.rsw0;
import defpackage.scc;
import defpackage.sdd;
import defpackage.sg0;
import defpackage.tje;
import defpackage.tyo0;
import defpackage.uiy0;
import defpackage.upw0;
import defpackage.w9r0;
import defpackage.wnf0;
import defpackage.xfe;
import defpackage.xng0;
import defpackage.xsw0;
import defpackage.xv1;
import defpackage.xw31;
import defpackage.yrh0;
import defpackage.zbd;
import defpackage.zfh0;
import defpackage.zow0;
import defpackage.zxs;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.design.utils.RecyclerShadowController$Type;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewTopRounded$1;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.tooltips.SummaryTooltipAlignment;
import ru.yandex.taxi.tooltips.manager.TooltipPlacement;
import ru.yandex.taxi.widget.ArrowsView;
import ru.yandex.taxi.widget.ButtonsView;
import ru.yandex.taxi.widget.PlaceholderView;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000·\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001O\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001IB=\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001c\u0010\u0013J\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0014¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\"H\u0014¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\"H\u0014¢\u0006\u0004\b-\u0010,J\u000f\u0010.\u001a\u00020\"H\u0014¢\u0006\u0004\b.\u0010,J\u0017\u00101\u001a\u00020\u00112\u0006\u00100\u001a\u00020/H\u0014¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0011H\u0014¢\u0006\u0004\b3\u0010\u0013J\u000f\u00104\u001a\u00020\u0011H\u0014¢\u0006\u0004\b4\u0010\u0013J\u0017\u00107\u001a\u00020\u00112\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u001f\u0010=\u001a\u00020\u00022\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010?R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010@R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010AR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010F\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010H\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010GR\u0018\u0010J\u001a\u00060IR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020S0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010U¨\u0006V"}, d2 = {"Lru/yandex/taxi/surge/dialog/SurgeInfoModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lrsw0;", "Landroid/content/Context;", "context", "Lru/yandex/taxi/design/utils/a;", "shadowUtil", "Lxsw0;", "presenter", "Ld4j;", "detailedPriceViewFactory", "Lpdc;", "colorConverter", "Lgvz0;", "tooltipPlacementRepository", "<init>", "(Landroid/content/Context;Lru/yandex/taxi/design/utils/a;Lxsw0;Ld4j;Lpdc;Lgvz0;)V", "Lzy11;", "refreshBackground", "()V", "setupShadow", "(Landroid/content/Context;)V", "Landroid/view/View;", "anchor", "", "text", "showTooltip", "(Landroid/view/View;Ljava/lang/String;)V", "hideTooltip", "Lupw0;", "createAdapter", "()Lupw0;", "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lc230;", "insetsType", "()Lc230;", "", "getTopPadding", "()I", "hasCustomBackground", "()Z", "isArrowsPermanentlyHidden", "isApplyShadow", "", "newOffset", "onDialogSlide", "(F)V", "onAttachedToWindow", "onDetachedFromWindow", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lrsw0;", "Lru/yandex/taxi/design/utils/a;", "Lxsw0;", "Ld4j;", "Lpdc;", "Lrji0;", "shadowController", "Lrji0;", "mainSectionAdapter", "Lupw0;", "bottomSectionAdapter", "Lpsw0;", "mvp", "Lpsw0;", "Lqr31;", "viewGroupTooltipContainer", "Lqr31;", "qsw0", "dismissTooltipPopupScrollListener", "Lqsw0;", "Lc57;", "Llow0;", "actionButtons", "Lc57;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SurgeInfoModalView extends SlideableBindingModalView<rsw0> {
    private final c57 actionButtons;
    private final upw0 bottomSectionAdapter;
    private final pdc colorConverter;
    private final d4j detailedPriceViewFactory;
    private final qsw0 dismissTooltipPopupScrollListener;
    private final upw0 mainSectionAdapter;
    private final psw0 mvp;
    private final xsw0 presenter;
    private final rji0 shadowController;
    private final ru.yandex.taxi.design.utils.a shadowUtil;
    private final qr31 viewGroupTooltipContainer;

    public SurgeInfoModalView(Context context, ru.yandex.taxi.design.utils.a aVar, xsw0 xsw0Var, d4j d4jVar, pdc pdcVar, gvz0 gvz0Var) {
        super(context);
        this.shadowUtil = aVar;
        this.presenter = xsw0Var;
        this.detailedPriceViewFactory = d4jVar;
        this.colorConverter = pdcVar;
        this.shadowController = new rji0(RecyclerShadowController$Type.BOTTOM);
        upw0 createAdapter = createAdapter();
        this.mainSectionAdapter = createAdapter;
        upw0 createAdapter2 = createAdapter();
        this.bottomSectionAdapter = createAdapter2;
        this.mvp = new psw0(this);
        this.viewGroupTooltipContainer = new qr31(getBinding().i, gvz0Var);
        this.dismissTooltipPopupScrollListener = new qsw0(this);
        c57 buttonsContract = getBinding().b.buttonsContract();
        this.actionButtons = buttonsContract;
        setupShadow(context);
        RecyclerView recyclerView = getBinding().f;
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        recyclerView.setAdapter(createAdapter);
        recyclerView.setItemAnimator(null);
        RecyclerView recyclerView2 = getBinding().c;
        recyclerView2.setLayoutManager(new LinearLayoutManager(context, 1, false));
        recyclerView2.setAdapter(createAdapter2);
        recyclerView2.setItemAnimator(null);
        getBottomSheet().setBackground(null);
        ((pm5) buttonsContract).f(new hk1(xsw0Var, 5));
        refreshBackground();
        ConstraintLayout constraintLayout = getBinding().g;
        constraintLayout.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewTopRounded$1(getCornersRadius()));
        constraintLayout.setClipToOutline(true);
        LinearLayout linearLayout = getBinding().d;
        linearLayout.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewTopRounded$1(tje.r(mrg0.go_design_card_divider_radius, getContext())));
        linearLayout.setClipToOutline(true);
        setArrowState(ArrowsView.State.PLAIN);
    }

    private final upw0 createAdapter() {
        d4j d4jVar = this.detailedPriceViewFactory;
        SurgeInfoModalView$createAdapter$1 surgeInfoModalView$createAdapter$1 = new SurgeInfoModalView$createAdapter$1(1, this.presenter, xsw0.class, "howToDeepLinkClick", "howToDeepLinkClick(Ljava/lang/String;)V", 0);
        SurgeInfoModalView$createAdapter$2 surgeInfoModalView$createAdapter$2 = new SurgeInfoModalView$createAdapter$2(1, this.presenter, xsw0.class, "gradientComponentClick", "gradientComponentClick(Ljava/lang/String;)V", 0);
        SurgeInfoModalView$createAdapter$3 surgeInfoModalView$createAdapter$3 = new SurgeInfoModalView$createAdapter$3(1, this.presenter, xsw0.class, "onSelectorClick", "onSelectorClick(Lru/yandex/taxi/surge/dialog/TextBlockItemTrail$SelectorTrail;)V", 0);
        SurgeInfoModalView$createAdapter$4 surgeInfoModalView$createAdapter$4 = new SurgeInfoModalView$createAdapter$4(1, this.presenter, xsw0.class, "onShortcutItemClick", "onShortcutItemClick(Lru/yandex/taxi/surge/dialog/HorizontalShortcuts$ShortcutItem;)V", 0);
        SurgeInfoModalView$createAdapter$5 surgeInfoModalView$createAdapter$5 = new SurgeInfoModalView$createAdapter$5(2, this, SurgeInfoModalView.class, "showTooltip", "showTooltip(Landroid/view/View;Ljava/lang/String;)V", 0);
        SurgeInfoModalView$createAdapter$6 surgeInfoModalView$createAdapter$6 = new SurgeInfoModalView$createAdapter$6(1, this.presenter, xsw0.class, "onTextBlockClick", "onTextBlockClick(Lru/yandex/taxi/surge/dialog/TextBlockAction;)V", 0);
        int i = 12;
        lki lkiVar = new lki(i);
        int i2 = xv1.V;
        g0c a = qoi0.a(cau.class);
        sg0 sg0Var = new sg0(11, surgeInfoModalView$createAdapter$1);
        Class a2 = a.a();
        EmptyList emptyList = EmptyList.a;
        zxs zxsVar = new zxs(a2, 0, null, emptyList, null, sg0Var);
        int i3 = b0b.e0;
        g0c a3 = qoi0.a(nrq0.class);
        zxs zxsVar2 = new zxs(a3.a(), 0, null, emptyList, null, new arm0(25));
        int i4 = lo4.U;
        g0c a4 = qoi0.a(io4.class);
        zxs zxsVar3 = new zxs(a4.a(), 0, null, emptyList, null, new zbd(26));
        int i5 = h0b.S;
        g0c a5 = qoi0.a(g0b.class);
        zxs zxsVar4 = new zxs(a5.a(), 0, null, emptyList, null, new qha(9));
        int i6 = b0b.e0;
        g0c a6 = qoi0.a(a0b.class);
        zxs zxsVar5 = new zxs(a6.a(), 0, null, emptyList, null, new qha(8));
        int i7 = b0b.e0;
        g0c a7 = qoi0.a(xfe.class);
        zxs zxsVar6 = new zxs(a7.a(), 0, null, emptyList, null, new sdd(27));
        int i8 = c6r0.T;
        g0c a8 = qoi0.a(lky0.class);
        int i9 = 1;
        zxs zxsVar7 = new zxs(a8.a(), 0, new wnf0(surgeInfoModalView$createAdapter$6, surgeInfoModalView$createAdapter$3, 5), emptyList, new he7(i9, new uiy0(2)), null);
        int i10 = hru.T;
        g0c a9 = qoi0.a(eru.class);
        zxs zxsVar8 = new zxs(a9.a(), 0, null, emptyList, null, new sg0(i, surgeInfoModalView$createAdapter$4));
        int i11 = w9r0.S;
        g0c a10 = qoi0.a(q3q0.class);
        zxs zxsVar9 = new zxs(a10.a(), 0, new tyo0(17), emptyList, new he7(i9, new tyo0(19)), null);
        int i12 = g4j.W;
        g0c a11 = qoi0.a(o2j.class);
        zxs zxsVar10 = new zxs(a11.a(), 0, new nni(13), emptyList, new he7(i9, new f4j(d4jVar, surgeInfoModalView$createAdapter$5, 0)), null);
        int i13 = mt6.Z;
        g0c a12 = qoi0.a(cyt.class);
        return new upw0(lkiVar, scc.g(zxsVar, zxsVar2, zxsVar3, zxsVar4, zxsVar5, zxsVar6, zxsVar7, zxsVar8, zxsVar9, zxsVar10, new zxs(a12.a(), 0, new iws(7), emptyList, new he7(i9, new adp(4, surgeInfoModalView$createAdapter$2)), null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideTooltip() {
        this.viewGroupTooltipContainer.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(SurgeInfoModalView surgeInfoModalView) {
        return surgeInfoModalView.getBinding().d;
    }

    private final void refreshBackground() {
        getBinding().g.setBackgroundColor(qje.t(xng0.bgMain, getContext()));
    }

    private final void setupShadow(Context context) {
        NinePatchDrawable x = gtq0.x(this.shadowUtil, context, tje.u(24, getContext()), new hgr0(0.0f, tje.w(-4, context), tje.w(20, context), qje.u(context.getTheme(), xng0.effectShadowTop)));
        Rect rect = new Rect();
        x.getPadding(rect);
        AppCompatImageView appCompatImageView = getBinding().e;
        appCompatImageView.setBackground(x);
        xw31.E(appCompatImageView, Integer.valueOf(-rect.left), Integer.valueOf(-rect.top), Integer.valueOf(-rect.right), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showTooltip(View anchor, String text) {
        this.viewGroupTooltipContainer.d(anchor, new mr31(text, "", true, Integer.MAX_VALUE, 1, new bdc(xng0.bgInvert), SummaryTooltipAlignment.CENTER, null, 7808), TooltipPlacement.SURGE_INFO_MODAL);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        refreshBackground();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public rsw0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View O;
        View inflate = inflater.inflate(yrh0.surge_info_modal_view, parent, false);
        parent.addView(inflate);
        int i = zfh0.buttons_view;
        ButtonsView buttonsView = (ButtonsView) cma1.O(i, inflate);
        if (buttonsView != null) {
            i = zfh0.surge_info_bottom_container;
            RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
            if (recyclerView != null) {
                i = zfh0.surge_info_bottom_content;
                LinearLayout linearLayout = (LinearLayout) cma1.O(i, inflate);
                if (linearLayout != null) {
                    i = zfh0.surge_info_bottom_shadow;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
                    if (appCompatImageView != null) {
                        i = zfh0.surge_info_content;
                        RecyclerView recyclerView2 = (RecyclerView) cma1.O(i, inflate);
                        if (recyclerView2 != null) {
                            i = zfh0.surge_info_content_container;
                            ConstraintLayout constraintLayout = (ConstraintLayout) cma1.O(i, inflate);
                            if (constraintLayout != null && (O = cma1.O((i = zfh0.surge_info_loading), inflate)) != null) {
                                int i2 = zfh0.surge_info_loading_1;
                                if (((PlaceholderView) cma1.O(i2, O)) != null) {
                                    i2 = zfh0.surge_info_loading_2;
                                    if (((PlaceholderView) cma1.O(i2, O)) != null) {
                                        i2 = zfh0.surge_info_loading_3;
                                        if (((PlaceholderView) cma1.O(i2, O)) != null) {
                                            i2 = zfh0.surge_info_loading_4;
                                            if (((PlaceholderView) cma1.O(i2, O)) != null) {
                                                i2 = zfh0.surge_info_loading_5;
                                                if (((PlaceholderView) cma1.O(i2, O)) != null) {
                                                    i2 = zfh0.surge_info_loading_6;
                                                    if (((PlaceholderView) cma1.O(i2, O)) != null) {
                                                        l7n l7nVar = new l7n((ConstraintLayout) O, 4);
                                                        i = zfh0.tooltip_container;
                                                        GoFrameLayout goFrameLayout = (GoFrameLayout) cma1.O(i, inflate);
                                                        if (goFrameLayout != null) {
                                                            return new rsw0((LinearLayout) inflate, buttonsView, recyclerView, linearLayout, appCompatImageView, recyclerView2, constraintLayout, l7nVar, goFrameLayout);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                ny61.t("Missing required view with ID: ".concat(O.getResources().getResourceName(i2)));
                                return null;
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
    public int getTopPadding() {
        return this.topSystemWindowInset;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: hasCustomBackground */
    public boolean getHasCustomBackgroundColor() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public c230 insetsType() {
        return new c230(0, new oew0(4, this), false);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isApplyShadow */
    public boolean getIsCollapsable() {
        return false;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isArrowsPermanentlyHidden */
    public boolean getWithCloseButton() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.shadowController.a(getBinding().e, getBinding().f);
        xsw0 xsw0Var = this.presenter;
        psw0 psw0Var = this.mvp;
        xsw0Var.Bg(psw0Var);
        tje.N(xsw0Var.Jg(), null, null, new SurgeInfoPresenter$attachView$1(xsw0Var, psw0Var, null), 3);
        hhs0 hhs0Var = xsw0Var.E;
        zow0 zow0Var = (zow0) hhs0Var.b;
        String str = (String) hhs0Var.c;
        zow0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("open_reason", str);
        zow0Var.a.a("SurgeCard.Shown", hashMap, 1, new HashMap());
        getBinding().f.addOnScrollListener(this.dismissTooltipPopupScrollListener);
        getBinding().c.addOnScrollListener(this.dismissTooltipPopupScrollListener);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.shadowController.c();
        this.presenter.Cg();
        getBinding().f.removeOnScrollListener(this.dismissTooltipPopupScrollListener);
        getBinding().c.removeOnScrollListener(this.dismissTooltipPopupScrollListener);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onDialogSlide(float newOffset) {
        super.onDialogSlide(newOffset);
        hideTooltip();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if (ev != null && ev.getAction() == 1) {
            hideTooltip();
        }
        return super.onInterceptTouchEvent(ev);
    }
}

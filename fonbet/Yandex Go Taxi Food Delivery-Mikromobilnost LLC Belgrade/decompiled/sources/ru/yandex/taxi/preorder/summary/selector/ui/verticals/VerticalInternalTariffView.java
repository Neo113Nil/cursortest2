package ru.yandex.taxi.preorder.summary.selector.ui.verticals;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b1;
import androidx.recyclerview.widget.x0;
import defpackage.b64;
import defpackage.bbx0;
import defpackage.bh11;
import defpackage.bmq0;
import defpackage.czo0;
import defpackage.el11;
import defpackage.elx0;
import defpackage.f1f0;
import defpackage.ffx;
import defpackage.fva0;
import defpackage.h3y;
import defpackage.hay;
import defpackage.hbp0;
import defpackage.hpo0;
import defpackage.igx0;
import defpackage.jhx0;
import defpackage.jl40;
import defpackage.jst;
import defpackage.k051;
import defpackage.l8x;
import defpackage.leq0;
import defpackage.lqx0;
import defpackage.lz40;
import defpackage.mr31;
import defpackage.nex0;
import defpackage.nwy0;
import defpackage.oeq0;
import defpackage.p8f;
import defpackage.pav;
import defpackage.pf31;
import defpackage.qox0;
import defpackage.qsg0;
import defpackage.re31;
import defpackage.rp31;
import defpackage.sb5;
import defpackage.scc;
import defpackage.se31;
import defpackage.sjp0;
import defpackage.te31;
import defpackage.tje;
import defpackage.tls;
import defpackage.u0h;
import defpackage.ue31;
import defpackage.unr0;
import defpackage.unx0;
import defpackage.ux31;
import defpackage.ve31;
import defpackage.vfh0;
import defpackage.vrh0;
import defpackage.vx31;
import defpackage.w511;
import defpackage.we31;
import defpackage.wu1;
import defpackage.xby;
import defpackage.xe31;
import defpackage.xw31;
import defpackage.yp7;
import defpackage.yx00;
import defpackage.zy11;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.perf.screen.c;
import ru.yandex.taxi.preorder.summary.selector.ui.TariffsViewPositionHandler$onLaidOut$$inlined$doOnLayout$1;
import ru.yandex.taxi.preorder.summary.selector.ui.ribbon.SeveralTariffsView;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.recycler.PositionLayoutManager;

@Metadata(d1 = {"\u0000¬\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001>B\u0087\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0014¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020$H\u0014¢\u0006\u0004\b'\u0010&J\u0017\u0010*\u001a\u00020$2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b0\u00101J#\u00107\u001a\u00020$2\f\u00104\u001a\b\u0012\u0004\u0012\u000203022\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J\u0017\u0010<\u001a\u0004\u0018\u00010;2\u0006\u0010:\u001a\u000209¢\u0006\u0004\b<\u0010=J\u0015\u0010@\u001a\u00020$2\u0006\u0010?\u001a\u00020>¢\u0006\u0004\b@\u0010AJ\u0017\u0010D\u001a\u00020C2\u0006\u0010B\u001a\u000209H\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010F\u001a\u00020C2\u0006\u0010B\u001a\u000209H\u0016¢\u0006\u0004\bF\u0010EJ\u0017\u0010G\u001a\u00020$2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\bG\u0010HJ%\u0010I\u001a\u00020$2\f\u00104\u001a\b\u0012\u0004\u0012\u000203022\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\bI\u00108J'\u0010L\u001a\u00020C2\u0006\u0010J\u001a\u0002092\u0006\u0010K\u001a\u0002092\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u00020C2\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\bN\u0010EJ\u001f\u0010O\u001a\u00020$2\u0006\u0010:\u001a\u0002092\u0006\u0010J\u001a\u000209H\u0002¢\u0006\u0004\bO\u0010PJ\u001f\u0010Q\u001a\u00020$2\u0006\u0010:\u001a\u0002092\u0006\u0010J\u001a\u000209H\u0002¢\u0006\u0004\bQ\u0010PJ\u0017\u0010S\u001a\u00020$2\u0006\u0010R\u001a\u000209H\u0002¢\u0006\u0004\bS\u0010TJ\u0017\u0010W\u001a\u00020$2\u0006\u0010V\u001a\u00020UH\u0002¢\u0006\u0004\bW\u0010XJ\u0017\u0010Y\u001a\u00020$2\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\bY\u0010TJ\u0017\u0010\\\u001a\u00020$2\u0006\u0010[\u001a\u00020ZH\u0002¢\u0006\u0004\b\\\u0010]J\u0017\u0010`\u001a\u00020$2\u0006\u0010_\u001a\u00020^H\u0002¢\u0006\u0004\b`\u0010aJ!\u0010c\u001a\u00020$2\b\u0010b\u001a\u0004\u0018\u00010/2\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\bc\u0010dJ\u000f\u0010e\u001a\u00020$H\u0002¢\u0006\u0004\be\u0010&R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010fR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010gR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010hR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010iR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010jR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010kR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010lR\u0016\u0010!\u001a\u0004\u0018\u00010 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010mR\u0014\u0010n\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010q\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u001a\u0010t\u001a\b\u0012\u0004\u0012\u00020Z0s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010w\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010z\u001a\u00020y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0014\u0010}\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0017\u0010\u0080\u0001\u001a\u00020\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0018\u0010\u0083\u0001\u001a\u00030\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0086\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0017\u0010?\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b?\u0010\u0088\u0001R\u001c\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0089\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001c\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001c\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u008f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001c\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u008f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0091\u0001¨\u0006\u0093\u0001"}, d2 = {"Lru/yandex/taxi/preorder/summary/selector/ui/verticals/VerticalInternalTariffView;", "Lru/yandex/taxi/preorder/summary/selector/ui/ribbon/SeveralTariffsView;", "Lnwy0;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Lh3y;", "Lru/yandex/taxi/preorder/summary/selector/appearance/a;", "tariffAppearanceConfigFactory", "Landroidx/recyclerview/widget/RecyclerView$h;", "recycledViewPool", "Lru/yandex/taxi/preorder/summary/selector/model/vertical/a;", "presentationModelMapper", "Lnex0;", "tariffCellsAnalytics", "Lfva0;", "performanceAnalytics", "Lk051;", "wideTariffHolderAnalytics", "Lunx0;", "tariffSelectorSessionStorage", "Lbbx0;", "appearanceConfig", "Lbmq0;", "selectorTouchRepository", "Lf1f0;", "priceViewHolderDependencies", "Lhbp0;", "scopeDelegate", "Lru/yandex/taxi/perf/screen/c;", "perfScreenRepository", "Lcom/yandex/go/taxi/summary/shared/lifecycle/a;", "largestContentfulProcessor", "<init>", "(Landroid/content/Context;Lpav;Lh3y;Landroidx/recyclerview/widget/RecyclerView$h;Lru/yandex/taxi/preorder/summary/selector/model/vertical/a;Lnex0;Lfva0;Lk051;Lunx0;Lbbx0;Lbmq0;Lf1f0;Lhbp0;Lru/yandex/taxi/perf/screen/c;Lcom/yandex/go/taxi/summary/shared/lifecycle/a;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lmr31;", "pageTooltip", "()Lmr31;", "Landroid/view/View;", "pageTooltipTarget", "()Landroid/view/View;", "", "Lelx0;", "models", "Lru/yandex/taxi/tariffs/model/PriceUpdate$PriceLoadingState;", "priceLoadingState", "updateVerticalItems", "(Ljava/util/List;Lru/yandex/taxi/tariffs/model/PriceUpdate$PriceLoadingState;)V", "", "position", "Landroidx/recyclerview/widget/x0;", "getTariffViewHolderByPosition", "(I)Landroidx/recyclerview/widget/x0;", "Lve31;", "listener", "setInternalTariffViewListener", "(Lve31;)V", "direction", "", "canScrollHorizontally", "(I)Z", "canScrollVertically", "applyAppearanceConfig", "(Lbbx0;)V", "internalUpdateVerticalItems", "compoundPosition", "selectedPosition", "shouldScrollToSelected", "(IILru/yandex/taxi/tariffs/model/PriceUpdate$PriceLoadingState;)Z", "itemVisible", "scrollToItem", "(II)V", "scrollToItemInternal", "selectedTariff", "onTariffsSetAndPositioned", "(I)V", "Ljava/lang/Runnable;", "action", "doOnScrollStop", "(Ljava/lang/Runnable;)V", "onHighlightedAppear", "Lux31;", "visibleState", "invalidateVisibleState", "(Lux31;)V", "Lsb5;", "holder", "onInternalViewHolderClicked", "(Lsb5;)V", "targetView", "moveItemToPosition", "(Landroid/view/View;I)V", "onSelectorCellsChanged", "Lpav;", "Lh3y;", "Lru/yandex/taxi/preorder/summary/selector/model/vertical/a;", "Lnex0;", "Lk051;", "Lf1f0;", "Lru/yandex/taxi/perf/screen/c;", "Lcom/yandex/go/taxi/summary/shared/lifecycle/a;", "mainScope", "Lhbp0;", "Lru/yandex/taxi/widget/recycler/PositionLayoutManager;", "layout", "Lru/yandex/taxi/widget/recycler/PositionLayoutManager;", "Llz40;", "selectedTariffVisibleStateSharedFlow", "Llz40;", "Landroidx/recyclerview/widget/RecyclerView;", "tariffsInternalView", "Landroidx/recyclerview/widget/RecyclerView;", "Lsjp0;", "scrollWithoutSelectListener", "Lsjp0;", "Lvx31;", "visibleStateListener", "Lvx31;", "Lpf31;", "pageInternalAdapter", "Lpf31;", "Lqox0;", "tooltipDecoration", "Lqox0;", "Lru/yandex/taxi/preorder/summary/selector/ui/a;", "tariffsViewPositionSetter", "Lru/yandex/taxi/preorder/summary/selector/ui/a;", "Lve31;", "Ljhx0;", "spaceAndBackgroundDecoration", "Ljhx0;", "Landroidx/recyclerview/widget/RecyclerView$g;", "onScrollStopListener", "Landroidx/recyclerview/widget/RecyclerView$g;", "Ll8x;", "invalidateJob", "Ll8x;", "selectJob", "selector"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VerticalInternalTariffView extends SeveralTariffsView implements nwy0 {
    private final pav imageLoader;
    private l8x invalidateJob;
    private final com.yandex.go.taxi.summary.shared.lifecycle.a largestContentfulProcessor;
    private final PositionLayoutManager layout;
    private ve31 listener;
    private final hbp0 mainScope;
    private RecyclerView.g onScrollStopListener;
    private final pf31 pageInternalAdapter;
    private final c perfScreenRepository;
    private final ru.yandex.taxi.preorder.summary.selector.model.vertical.a presentationModelMapper;
    private final f1f0 priceViewHolderDependencies;
    private final sjp0 scrollWithoutSelectListener;
    private l8x selectJob;
    private final lz40 selectedTariffVisibleStateSharedFlow;
    private jhx0 spaceAndBackgroundDecoration;
    private final h3y tariffAppearanceConfigFactory;
    private final nex0 tariffCellsAnalytics;
    private final RecyclerView tariffsInternalView;
    private final ru.yandex.taxi.preorder.summary.selector.ui.a tariffsViewPositionSetter;
    private final qox0 tooltipDecoration;
    private final vx31 visibleStateListener;
    private final k051 wideTariffHolderAnalytics;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.preorder.summary.selector.ui.verticals.VerticalInternalTariffView$4, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass4 extends FunctionReferenceImpl implements tls {
        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            ((VerticalInternalTariffView) this.receiver).onInternalViewHolderClicked((sb5) obj);
            return zy11.a;
        }
    }

    public VerticalInternalTariffView(Context context, pav pavVar, h3y h3yVar, RecyclerView.h hVar, ru.yandex.taxi.preorder.summary.selector.model.vertical.a aVar, nex0 nex0Var, fva0 fva0Var, k051 k051Var, unx0 unx0Var, bbx0 bbx0Var, bmq0 bmq0Var, f1f0 f1f0Var, hbp0 hbp0Var, c cVar, com.yandex.go.taxi.summary.shared.lifecycle.a aVar2) {
        super(context);
        this.imageLoader = pavVar;
        this.tariffAppearanceConfigFactory = h3yVar;
        this.presentationModelMapper = aVar;
        this.tariffCellsAnalytics = nex0Var;
        this.wideTariffHolderAnalytics = k051Var;
        this.priceViewHolderDependencies = f1f0Var;
        this.perfScreenRepository = cVar;
        this.largestContentfulProcessor = aVar2;
        this.mainScope = new hbp0(new czo0(14), "", null);
        PositionLayoutManager positionLayoutManager = new PositionLayoutManager(context);
        this.layout = positionLayoutManager;
        n0 b = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
        this.selectedTariffVisibleStateSharedFlow = b;
        this.listener = new hay(17);
        ru.yandex.taxi.design.utils.c.q(this, vrh0.vertical_inner_tariff_view, true);
        sjp0 sjp0Var = new sjp0(xw31.n(context), new te31(nex0Var));
        this.scrollWithoutSelectListener = sjp0Var;
        vx31 vx31Var = new vx31(positionLayoutManager);
        vx31Var.a(b);
        this.visibleStateListener = vx31Var;
        int i = vfh0.vertical_inner_recycler;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        RecyclerView recyclerView = (RecyclerView) ((View) rp31.d(this, i));
        recyclerView.setLayoutManager(positionLayoutManager);
        recyclerView.setRecycledViewPool(hVar);
        recyclerView.setHasFixedSize(true);
        recyclerView.addOnScrollListener(sjp0Var);
        this.tariffsInternalView = recyclerView;
        applyAppearanceConfig(bbx0Var);
        pf31 pf31Var = new pf31(new lqx0(bbx0Var, pavVar, false, k051Var, f1f0Var, cVar, aVar2), fva0Var, unx0Var, bmq0Var, hbp0Var);
        this.pageInternalAdapter = pf31Var;
        pf31Var.y = new AnonymousClass4(1, this, VerticalInternalTariffView.class, "onInternalViewHolderClicked", "onInternalViewHolderClicked(Lru/yandex/taxi/preorder/summary/selector/ui/ribbon/holder/BaseTariffViewHolder;)V", 0);
        recyclerView.setItemAnimator(new igx0());
        qox0 qox0Var = new qox0(new se31(this, 0));
        this.tooltipDecoration = qox0Var;
        recyclerView.addItemDecoration(qox0Var);
        pf31Var.C = new se31(this, 1);
        RecyclerView.c itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator instanceof b1) {
            ((b1) itemAnimator).g = false;
        }
        positionLayoutManager.d0 = new el11(11, this);
        this.tariffsViewPositionSetter = new ru.yandex.taxi.preorder.summary.selector.ui.a(pf31Var, recyclerView, positionLayoutManager, new ue31(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$2(VerticalInternalTariffView verticalInternalTariffView, View view, mr31 mr31Var) {
        verticalInternalTariffView.listener.o();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$3(VerticalInternalTariffView verticalInternalTariffView, int i, mr31 mr31Var) {
        qox0 qox0Var = verticalInternalTariffView.tooltipDecoration;
        qox0Var.b = i;
        qox0Var.c = !jl40.l(mr31Var, qox0Var.w);
        qox0Var.w = mr31Var;
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oeq0 _init_$lambda$4(VerticalInternalTariffView verticalInternalTariffView, int i) {
        oeq0 oeq0Var;
        elx0 item = verticalInternalTariffView.pageInternalAdapter.getItem(i);
        return (item == null || (oeq0Var = item.L) == null) ? leq0.a : oeq0Var;
    }

    private final void applyAppearanceConfig(bbx0 appearanceConfig) {
        int i;
        int i2;
        Rect rect = appearanceConfig.i;
        jhx0 jhx0Var = this.spaceAndBackgroundDecoration;
        if (jhx0Var != null) {
            i = jhx0Var.A;
            i2 = jhx0Var.B;
            this.tariffsInternalView.removeItemDecoration(jhx0Var);
        } else {
            i = -1;
            i2 = -1;
        }
        Context context = getContext();
        int i3 = -rect.left;
        int i4 = -appearanceConfig.l;
        jhx0 jhx0Var2 = new jhx0(context, i3, i3, i4, i4, (Drawable) appearanceConfig.f.invoke());
        this.tariffsInternalView.addItemDecoration(jhx0Var2);
        jhx0Var2.f(i, i2);
        this.spaceAndBackgroundDecoration = jhx0Var2;
        int i5 = we31.a[appearanceConfig.a.ordinal()];
        if (i5 == 1) {
            this.tariffsInternalView.setLayoutParams(new FrameLayout.LayoutParams(-1, tje.r(qsg0.tariffs_selector_height, getContext())));
        } else if (i5 == 2) {
            this.tariffsInternalView.setLayoutParams(new FrameLayout.LayoutParams(-1, tje.r(qsg0.high_tariffs_selector_height, getContext())));
        } else {
            w511.b();
        }
    }

    private final void doOnScrollStop(Runnable action) {
        this.tariffsInternalView.removeOnScrollListener(this.scrollWithoutSelectListener);
        RecyclerView.g gVar = this.onScrollStopListener;
        if (gVar != null) {
            this.tariffsInternalView.removeOnScrollListener(gVar);
        }
        xe31 xe31Var = new xe31(action, this);
        this.tariffsInternalView.addOnScrollListener(xe31Var);
        this.onScrollStopListener = xe31Var;
    }

    private final void internalUpdateVerticalItems(List<elx0> models, PriceUpdate$PriceLoadingState priceLoadingState) {
        l8x l8xVar = this.invalidateJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.invalidateJob = this.layout.i2(new hpo0(19, models, this, priceLoadingState));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void internalUpdateVerticalItems$lambda$0(List list, VerticalInternalTariffView verticalInternalTariffView, PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState) {
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
        jhx0 jhx0Var = verticalInternalTariffView.spaceAndBackgroundDecoration;
        if (jhx0Var != null) {
            if (i2 == -1) {
                jhx0Var.f(-1, -1);
            } else {
                jhx0Var.f(i2, i3);
            }
        }
        if (verticalInternalTariffView.pageInternalAdapter.f(list) || verticalInternalTariffView.shouldScrollToSelected(i2, i3, priceUpdate$PriceLoadingState)) {
            verticalInternalTariffView.tariffsInternalView.postOnAnimation(new yp7(verticalInternalTariffView, i3, i2, 6));
            return;
        }
        ru.yandex.taxi.preorder.summary.selector.ui.a aVar = verticalInternalTariffView.tariffsViewPositionSetter;
        re31 re31Var = new re31(verticalInternalTariffView, i3, i);
        RecyclerView recyclerView = aVar.b;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        if (!recyclerView.isLaidOut() || recyclerView.isLayoutRequested()) {
            recyclerView.addOnLayoutChangeListener(new TariffsViewPositionHandler$onLaidOut$$inlined$doOnLayout$1(re31Var));
        } else {
            re31Var.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void internalUpdateVerticalItems$lambda$0$3(VerticalInternalTariffView verticalInternalTariffView, int i) {
        verticalInternalTariffView.tariffsViewPositionSetter.e.g(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateVisibleState(ux31 visibleState) {
        this.listener.i(visibleState);
    }

    private final boolean itemVisible(int position) {
        return position >= this.layout.H1() && position <= this.layout.L1();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void moveItemToPosition(View targetView, int position) {
        int i;
        elx0 item;
        pf31 pf31Var = this.pageInternalAdapter;
        if (position < 0) {
            pf31Var.getClass();
        } else if (position < pf31Var.B.size()) {
            elx0 elx0Var = (elx0) pf31Var.B.get(position);
            if (elx0Var.w) {
                i = elx0Var.v ? position - 1 : position + 1;
                if (i < 0) {
                    this.layout.j2(this.tariffsInternalView, position, i);
                } else {
                    this.tariffsInternalView.smoothScrollToPosition(position);
                }
                pf31 pf31Var2 = this.pageInternalAdapter;
                pf31Var2.f(this.presentationModelMapper.a(position, pf31Var2.B));
                doOnScrollStop(new bh11(20, this));
                if (targetView != null) {
                    animateViewBackgroundAppearing(targetView);
                }
                pf31 pf31Var3 = this.pageInternalAdapter;
                item = pf31Var3.getItem(pf31Var3.g());
                if (item == null) {
                    this.listener.r(item, false, position);
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
        pf31 pf31Var22 = this.pageInternalAdapter;
        pf31Var22.f(this.presentationModelMapper.a(position, pf31Var22.B));
        doOnScrollStop(new bh11(20, this));
        if (targetView != null) {
        }
        pf31 pf31Var32 = this.pageInternalAdapter;
        item = pf31Var32.getItem(pf31Var32.g());
        if (item == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onHighlightedAppear(int position) {
        this.tariffsViewPositionSetter.e.g(Integer.valueOf(position));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onInternalViewHolderClicked(sb5 holder) {
        Object obj;
        int F = holder.F();
        boolean z = F == this.pageInternalAdapter.g();
        List list = this.pageInternalAdapter.B;
        if (F < 0 || F >= list.size()) {
            xby.l(jst.e, "SHORTCUTS:TaxiExpectedDestination:ACTION_FAILED", null, null, b64.d(F, this.pageInternalAdapter.B.size(), "Not found tariff in ", " position in ", " size array"), 6);
            obj = null;
        } else {
            obj = list.get(F);
        }
        elx0 elx0Var = (elx0) obj;
        pf31 pf31Var = this.pageInternalAdapter;
        elx0 item = pf31Var.getItem(pf31Var.g());
        if (elx0Var != null && (elx0Var.c instanceof p8f)) {
            if (jl40.l(elx0Var.b, item != null ? item.b : null) && jl40.l(elx0Var.a, item.a)) {
                this.listener.k();
                return;
            }
        }
        if (elx0Var != null) {
            wu1 wu1Var = elx0Var.c;
            if (wu1Var instanceof u0h) {
                if (jl40.l(elx0Var.b, item != null ? item.b : null) && jl40.l(elx0Var.a, item.a)) {
                    ve31 ve31Var = this.listener;
                    u0h u0hVar = wu1Var instanceof u0h ? (u0h) wu1Var : null;
                    String str = u0hVar != null ? u0hVar.b : null;
                    if (str == null) {
                        str = "";
                    }
                    ve31Var.j(str);
                    return;
                }
            }
        }
        if (elx0Var != null && (elx0Var.c instanceof yx00)) {
            if (jl40.l(elx0Var.b, item != null ? item.b : null) && jl40.l(elx0Var.a, item.a)) {
                this.listener.l();
                return;
            }
        }
        if (!z || item == null) {
            moveItemToPosition(holder.a, F);
        } else {
            this.listener.r(item, true, F);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSelectorCellsChanged() {
        this.tariffCellsAnalytics.b(this.tariffsViewPositionSetter.b(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTariffsSetAndPositioned(int selectedTariff) {
        x0 findViewHolderForAdapterPosition = this.tariffsInternalView.findViewHolderForAdapterPosition(selectedTariff);
        elx0 item = this.pageInternalAdapter.getItem(selectedTariff);
        if (findViewHolderForAdapterPosition != null && item != null) {
            this.listener.n(findViewHolderForAdapterPosition, item);
        }
        onSelectorCellsChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scrollToItem(int position, int compoundPosition) {
        l8x l8xVar = this.selectJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        if (this.tariffsInternalView.isComputingLayout()) {
            this.selectJob = tje.N(this.mainScope, null, null, new VerticalInternalTariffView$scrollToItem$$inlined$safeCollectIn$1(e.T(e.c(this.layout.b0), 1), null, this, position, compoundPosition, position), 3);
        } else {
            this.tariffsInternalView.stopScroll();
            scrollToItemInternal(position, compoundPosition);
        }
    }

    private final void scrollToItemInternal(int position, int compoundPosition) {
        if (compoundPosition == -1) {
            this.tariffsInternalView.smoothScrollToPosition(position);
        } else if (Math.abs(position - compoundPosition) <= 1) {
            this.layout.j2(this.tariffsInternalView, position, compoundPosition);
        } else {
            unr0.z(jst.e, "compound position should be close to target");
        }
        doOnScrollStop(new re31(this, position, 1));
    }

    private final boolean shouldScrollToSelected(int compoundPosition, int selectedPosition, PriceUpdate$PriceLoadingState priceLoadingState) {
        if (selectedPosition == -1 || priceLoadingState != PriceUpdate$PriceLoadingState.LOADED) {
            return false;
        }
        if (itemVisible(selectedPosition)) {
            return (compoundPosition == -1 || itemVisible(compoundPosition)) ? false : true;
        }
        return true;
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        bbx0 b = ((ru.yandex.taxi.preorder.summary.selector.appearance.a) this.tariffAppearanceConfigFactory.get()).b();
        applyAppearanceConfig(b);
        lqx0 lqx0Var = new lqx0(b, this.imageLoader, false, this.wideTariffHolderAnalytics, this.priceViewHolderDependencies, this.perfScreenRepository, this.largestContentfulProcessor);
        pf31 pf31Var = this.pageInternalAdapter;
        pf31Var.a = lqx0Var;
        this.tariffsInternalView.setAdapter(pf31Var);
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int direction) {
        return this.tariffsInternalView.canScrollHorizontally(direction);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int direction) {
        return this.tariffsInternalView.canScrollVertically(direction);
    }

    public final x0 getTariffViewHolderByPosition(int position) {
        return this.tariffsInternalView.findViewHolderForAdapterPosition(position);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mainScope.a();
        this.tariffsInternalView.addOnScrollListener(this.visibleStateListener);
        tje.N(this.mainScope, null, null, new VerticalInternalTariffView$onAttachedToWindow$$inlined$safeCollectIn$1(this.selectedTariffVisibleStateSharedFlow, null, this), 3);
        this.tariffsInternalView.setAdapter(this.pageInternalAdapter);
        this.tariffsViewPositionSetter.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.tariffsInternalView.setAdapter(null);
        this.visibleStateListener.a(null);
        this.mainScope.b();
        this.tariffsViewPositionSetter.f.b();
    }

    public final mr31 pageTooltip() {
        return this.tooltipDecoration.w;
    }

    public final View pageTooltipTarget() {
        return this.tooltipDecoration.x;
    }

    public final void setInternalTariffViewListener(ve31 listener) {
        this.listener = listener;
    }

    public final void updateVerticalItems(List<elx0> models, PriceUpdate$PriceLoadingState priceLoadingState) {
        internalUpdateVerticalItems(models, priceLoadingState);
    }
}

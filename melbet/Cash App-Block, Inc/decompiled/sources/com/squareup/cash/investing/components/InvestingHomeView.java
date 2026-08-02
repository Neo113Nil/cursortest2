package com.squareup.cash.investing.components;

import android.content.Context;
import android.view.View;
import android.view.WindowInsets;
import android.widget.LinearLayout;
import androidx.camera.video.VideoCapture;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.WindowCompat$Api35Impl;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.OpReorderer;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.ui.Ui;
import coil3.RealImageLoader;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.ColorsDarkKt;
import com.squareup.cash.arcade.ColorsLightKt;
import com.squareup.cash.arcade.treehouse.QrCodeScannerBinding$$ExternalSyntheticLambda0;
import com.squareup.cash.composable.adapter.ComposableAdapter;
import com.squareup.cash.composable.adapter.ComposableAdapter.Observer;
import com.squareup.cash.composable.adapter.SingleRowAdapter;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.investing.components.categories.MooncakeInvestingCategoryCarouselView$Factory$Impl;
import com.squareup.cash.investing.components.news.InvestingNewsCarouselView$ViewFactory$Impl;
import com.squareup.cash.investing.components.welcome.StocksWelcomeAdapter;
import com.squareup.cash.investing.viewmodels.InvestingHomeViewModel;
import com.squareup.cash.keystore.RealKeyStoreProvider$load$2;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.portfolio.graphs.views.GraphAdapter;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda3;
import com.squareup.cash.ui.CashInsets;
import com.squareup.cash.ui.CashInsetsListener;
import com.squareup.cash.ui.InsetsCollector;
import com.squareup.cash.ui.widget.recycler.CashRecyclerView;
import com.squareup.kotterknife.KotterKnifeKt;
import com.squareup.kotterknife.Lazy;
import com.squareup.util.android.coroutines.ViewKt;
import com.squareup.util.coroutines.ThrottleLatestKt$throttleLatest$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.ChannelFlowBuilder;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes6.dex */
public final class InvestingHomeView extends LinearLayout implements CashInsetsListener, Ui {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {new PropertyReference1Impl(InvestingHomeView.class, "content", "getContent$components()Lcom/squareup/cash/ui/widget/recycler/CashRecyclerView;", 0), new PropertyReference1Impl(InvestingHomeView.class, "searchBar", "getSearchBar()Landroidx/compose/ui/platform/ComposeView;", 0), new PropertyReference1Impl(InvestingHomeView.class, "titleBar", "getTitleBar()Landroidx/compose/ui/platform/ComposeView;", 0)};
    public final AccountTransferStatusAdapter accountTransferStatusAdapter;
    public final ComposableAdapter adapter;
    public final Lazy content$delegate;
    public List currentAdaptersData;
    public final DependentDisabledStateAdapter dependentDisabledStateAdapter;
    public final DisclosuresAdapter disclosureAdapter;
    public final DiscoverStockAdapter discoverStockAdapter;
    public Ui.EventReceiver eventReceiver;
    public final GraphAdapter graphAdapter;
    public final InvestingHomeRowAdapter holdingsAdapter;
    public final InsetsCollector insetsCollector;
    public final KybRestrictionBannerAdapter kybRestrictionBannerAdapter;
    public final MyFirstStockAdapter myFirstConfigurationAdapter;
    public final MyInvestmentsAdapter myInvestmentsAdapter;
    public final NewsCarouselAdapter newsCarouselAdapter;
    public final ChannelFlowBuilder onScrollFlow;
    public final PendingTradesAdapter pendingTradesAdapter;
    public final PlaceHolderGraphAdapter placeHolderGraphAdapter;
    public final PortfolioHeroAdapter portfolioHeroAdapter;
    public final Lazy searchBar$delegate;
    public final StocksWelcomeAdapter stocksWelcomeAdapter;
    public final Lazy titleBar$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingHomeView(Context context, StocksWelcomeAdapter stocksWelcomeAdapter, RealImageLoader realImageLoader, MooncakeInvestingCategoryCarouselView$Factory$Impl mooncakeInvestingCategoryCarouselView$Factory$Impl, InvestingNewsCarouselView$ViewFactory$Impl investingNewsCarouselView$ViewFactory$Impl, MyFirstConfigurationView$Factory$Impl myFirstConfigurationView$Factory$Impl, MooncakeInvestingStockRowView$Factory$Impl mooncakeInvestingStockRowView$Factory$Impl) {
        super(context);
        Colors.Semantic.Background background;
        context.getClass();
        this.stocksWelcomeAdapter = stocksWelcomeAdapter;
        this.content$delegate = KotterKnifeKt.bindView(this, R.id.content);
        Lazy bindView = KotterKnifeKt.bindView(this, R.id.search_bar);
        this.searchBar$delegate = bindView;
        this.titleBar$delegate = KotterKnifeKt.bindView(this, R.id.title_bar);
        ThemeInfo themeInfo = ThemeHelpersKt.themeInfo(this);
        WindowInsets windowInsets = InsetsCollector.CONSUMED;
        InsetsCollector attachedTo = WindowCompat$Api35Impl.attachedTo(this);
        this.insetsCollector = attachedTo;
        ComposableAdapter composableAdapter = new ComposableAdapter();
        this.adapter = composableAdapter;
        this.holdingsAdapter = new InvestingHomeRowAdapter(context, true, mooncakeInvestingCategoryCarouselView$Factory$Impl, mooncakeInvestingStockRowView$Factory$Impl, realImageLoader);
        int i = 1;
        this.portfolioHeroAdapter = new PortfolioHeroAdapter(2, true);
        this.graphAdapter = new GraphAdapter();
        this.myInvestmentsAdapter = new MyInvestmentsAdapter(new InvestingHomeView$$ExternalSyntheticLambda2(this, 0));
        this.myFirstConfigurationAdapter = new MyFirstStockAdapter(myFirstConfigurationView$Factory$Impl, new InvestingHomeView$$ExternalSyntheticLambda3(this, 0));
        this.accountTransferStatusAdapter = new AccountTransferStatusAdapter(new InvestingHomeView$$ExternalSyntheticLambda2(this, 4));
        this.disclosureAdapter = new DisclosuresAdapter(9, true);
        this.discoverStockAdapter = new DiscoverStockAdapter(new InvestingHomeView$$ExternalSyntheticLambda2(this, 5));
        this.newsCarouselAdapter = new NewsCarouselAdapter(investingNewsCarouselView$ViewFactory$Impl, new InvestingHomeView$$ExternalSyntheticLambda2(this, 6));
        this.pendingTradesAdapter = new PendingTradesAdapter(new InvestingHomeView$$ExternalSyntheticLambda2(this, 7));
        this.placeHolderGraphAdapter = new PlaceHolderGraphAdapter(new InvestingHomeView$$ExternalSyntheticLambda2(this, 8));
        this.kybRestrictionBannerAdapter = new KybRestrictionBannerAdapter(17, false);
        this.dependentDisabledStateAdapter = new DependentDisabledStateAdapter(new InvestingHomeView$$ExternalSyntheticLambda2(this, 9));
        Continuation continuation = null;
        this.onScrollFlow = FlowKt.channelFlow(new ThrottleLatestKt$throttleLatest$1(FlowKt.callbackFlow(new InvestingHomeView$onScrollFlow$1(this, null)), 100L, null));
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setId(R.id.investing_components_home);
        setOrientation(1);
        View.inflate(context, R.layout.investing_components_investing_home, this);
        CashRecyclerView content$components = getContent$components();
        content$components.getClass();
        attachedTo.setInsetsDispatcher(new VideoCapture.AnonymousClass3((View) this, true, new AlertBannerKt$$ExternalSyntheticLambda3(content$components, 4)));
        int ordinal = themeInfo.theme.ordinal();
        if (ordinal == 0) {
            background = ColorsLightKt.colorsLight.semantic.background;
        } else {
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                throw null;
            }
            background = ColorsDarkKt.colorsDark.semantic.background;
        }
        setBackgroundColor(ColorKt.m694toArgb8_81llA(background.f1047app));
        composableAdapter.setHasStableIds(true);
        getContent$components().setAdapter(composableAdapter);
        getContent$components().setLayoutManager(new LinearLayoutManager(context));
        CashRecyclerView content$components2 = getContent$components();
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.mSupportsChangeAnimations = false;
        content$components2.setItemAnimator(defaultItemAnimator);
        getContent$components().addItemDecoration(new SpacingBetweenItemsDecoration(getResources().getDimensionPixelOffset(R.dimen.investing_components_tile_vertical_margin) * 2, 1));
        getContent$components().setClipChildren(false);
        getContent$components().setClipToPadding(false);
        ViewKt.whileEachAttached(this, EmptyCoroutineContext.INSTANCE, new RealKeyStoreProvider$load$2(this, continuation, 16));
        ((ComposeView) bindView.getValue(this, $$delegatedProperties[1])).setContent(new ComposableLambdaImpl(new InvestingHomeView$$ExternalSyntheticLambda3(this, i), true, -1819215743));
        this.currentAdaptersData = EmptyList.INSTANCE;
    }

    public final CashRecyclerView getContent$components() {
        return (CashRecyclerView) this.content$delegate.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.squareup.cash.ui.CashInsetsListener
    public final void onApplyCashInsets(CashInsets cashInsets) {
        this.insetsCollector.onApplyCashInsets(cashInsets);
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
        this.disclosureAdapter.onLinkClick = new GpsConfigQueries$$ExternalSyntheticLambda2(eventReceiver, 22);
        QrCodeScannerBinding$$ExternalSyntheticLambda0 qrCodeScannerBinding$$ExternalSyntheticLambda0 = new QrCodeScannerBinding$$ExternalSyntheticLambda0(eventReceiver, 1);
        GraphAdapter graphAdapter = this.graphAdapter;
        graphAdapter.getClass();
        graphAdapter.eventReceiver = qrCodeScannerBinding$$ExternalSyntheticLambda0;
        InvestingHomeRowAdapter investingHomeRowAdapter = this.holdingsAdapter;
        investingHomeRowAdapter.getClass();
        investingHomeRowAdapter.eventReceiver = eventReceiver;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.squareup.cash.composable.adapter.SingleRowAdapter, com.squareup.cash.investing.components.MyFirstStockAdapter] */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.squareup.cash.composable.adapter.SingleRowAdapter, com.squareup.cash.investing.components.MyInvestmentsAdapter] */
    /* JADX WARN: Type inference failed for: r11v1, types: [com.squareup.cash.composable.adapter.SingleRowAdapter, com.squareup.cash.investing.components.DependentDisabledStateAdapter] */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.squareup.cash.composable.adapter.SingleRowAdapter, com.squareup.cash.investing.components.NewsCarouselAdapter] */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.squareup.cash.investing.components.PortfolioHeroAdapter] */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.squareup.cash.composable.adapter.SingleRowAdapter, com.squareup.cash.investing.components.welcome.StocksWelcomeAdapter] */
    /* JADX WARN: Type inference failed for: r15v0, types: [com.squareup.cash.composable.adapter.SingleRowAdapter, com.squareup.cash.investing.components.PendingTradesAdapter] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.squareup.cash.composable.adapter.SingleRowAdapter, com.squareup.cash.investing.components.PlaceHolderGraphAdapter] */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.squareup.cash.investing.components.KybRestrictionBannerAdapter] */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.squareup.cash.composable.adapter.SingleRowAdapter, com.squareup.cash.investing.components.DiscoverStockAdapter] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.squareup.cash.portfolio.graphs.views.GraphAdapter] */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.recyclerview.widget.RecyclerView$Adapter, com.squareup.cash.investing.components.InvestingHomeRowAdapter, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.squareup.cash.investing.components.AccountTransferStatusAdapter] */
    @Override // app.cash.broadway.ui.Ui
    public void setModel(InvestingHomeViewModel investingHomeViewModel) {
        SingleRowAdapter singleRowAdapter;
        GraphAdapter graphAdapter;
        SingleRowAdapter singleRowAdapter2;
        SingleRowAdapter singleRowAdapter3;
        investingHomeViewModel.getClass();
        Set modules = investingHomeViewModel.getModules();
        final ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(modules, 10));
        Iterator it = modules.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            DisclosuresAdapter disclosuresAdapter = this.disclosureAdapter;
            ?? r6 = this.discoverStockAdapter;
            ?? r7 = this.graphAdapter;
            ?? r8 = this.holdingsAdapter;
            ?? r9 = this.accountTransferStatusAdapter;
            ?? r10 = this.myFirstConfigurationAdapter;
            ?? r11 = this.myInvestmentsAdapter;
            ?? r12 = this.newsCarouselAdapter;
            ?? r13 = this.portfolioHeroAdapter;
            ?? r14 = this.stocksWelcomeAdapter;
            ?? r15 = this.pendingTradesAdapter;
            Iterator it2 = it;
            ?? r2 = this.placeHolderGraphAdapter;
            ?? r4 = this.kybRestrictionBannerAdapter;
            ?? r112 = this.dependentDisabledStateAdapter;
            if (!hasNext) {
                if (Intrinsics.areEqual(this.currentAdaptersData, arrayList)) {
                    singleRowAdapter = r4;
                    graphAdapter = r7;
                    singleRowAdapter2 = r9;
                    singleRowAdapter3 = r13;
                } else {
                    this.currentAdaptersData = arrayList;
                    final ComposableAdapter composableAdapter = this.adapter;
                    composableAdapter.getClass();
                    singleRowAdapter2 = r9;
                    ArrayList arrayList2 = composableAdapter.observers;
                    graphAdapter = r7;
                    int i = 0;
                    SingleRowAdapter singleRowAdapter4 = r13;
                    for (Object obj : composableAdapter.adapters) {
                        int i2 = i + 1;
                        if (i < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        ((RecyclerView.Adapter) obj).unregisterAdapterDataObserver((RecyclerView.AdapterDataObserver) arrayList2.get(i));
                        i = i2;
                        singleRowAdapter4 = singleRowAdapter4;
                    }
                    singleRowAdapter3 = singleRowAdapter4;
                    arrayList2.clear();
                    composableAdapter.adapterForViewType.clear();
                    Iterator it3 = arrayList.iterator();
                    int i3 = 0;
                    SingleRowAdapter singleRowAdapter5 = r4;
                    while (it3.hasNext()) {
                        Iterator it4 = it3;
                        RecyclerView.Adapter adapter = (RecyclerView.Adapter) it3.next();
                        SingleRowAdapter singleRowAdapter6 = singleRowAdapter5;
                        ComposableAdapter.Observer observer = composableAdapter.new Observer(i3);
                        adapter.registerAdapterDataObserver(observer);
                        arrayList2.add(observer);
                        i3 += adapter.getItemCount();
                        singleRowAdapter5 = singleRowAdapter6;
                        it3 = it4;
                    }
                    singleRowAdapter = singleRowAdapter5;
                    final List list = composableAdapter.adapters;
                    composableAdapter.adapters = arrayList;
                    DiffUtil.calculateDiff(new DiffUtil.Callback() { // from class: com.squareup.cash.composable.adapter.ComposableAdapter$adapters$3
                        @Override // androidx.recyclerview.widget.DiffUtil.Callback
                        public final boolean areContentsTheSame(int i4, int i5) {
                            return areItemsTheSame(i4, i5);
                        }

                        @Override // androidx.recyclerview.widget.DiffUtil.Callback
                        public final boolean areItemsTheSame(int i4, int i5) {
                            List list2 = list;
                            ComposableAdapter composableAdapter2 = ComposableAdapter.this;
                            ComposableAdapter.InnerAdapter access$adapterForPosition = ComposableAdapter.access$adapterForPosition(composableAdapter2, list2, i4);
                            int i6 = access$adapterForPosition.preceedingItems;
                            RecyclerView.Adapter adapter2 = access$adapterForPosition.adapter;
                            ComposableAdapter.InnerAdapter access$adapterForPosition2 = ComposableAdapter.access$adapterForPosition(composableAdapter2, arrayList, i5);
                            int i7 = access$adapterForPosition2.preceedingItems;
                            RecyclerView.Adapter adapter3 = access$adapterForPosition2.adapter;
                            int i8 = i4 - i6;
                            int i9 = i5 - i7;
                            return (adapter2.hasStableIds() && adapter3.hasStableIds()) ? adapter2.getItemViewType(i8) == adapter3.getItemViewType(i9) && adapter2.getItemId(i8) == adapter3.getItemId(i9) : adapter2.equals(adapter3) && i8 == i9;
                        }

                        @Override // androidx.recyclerview.widget.DiffUtil.Callback
                        public final Object getChangePayload(int i4, int i5) {
                            return Integer.valueOf(i5);
                        }

                        @Override // androidx.recyclerview.widget.DiffUtil.Callback
                        public final int getNewListSize() {
                            Iterator it5 = arrayList.iterator();
                            int i4 = 0;
                            while (it5.hasNext()) {
                                i4 += ((RecyclerView.Adapter) it5.next()).getItemCount();
                            }
                            return i4;
                        }

                        @Override // androidx.recyclerview.widget.DiffUtil.Callback
                        public final int getOldListSize() {
                            Iterator it5 = list.iterator();
                            int i4 = 0;
                            while (it5.hasNext()) {
                                i4 += ((RecyclerView.Adapter) it5.next()).getItemCount();
                            }
                            return i4;
                        }
                    }).dispatchUpdatesTo(new OpReorderer(composableAdapter));
                }
                KProperty[] kPropertyArr = $$delegatedProperties;
                ((ComposeView) this.titleBar$delegate.getValue(this, kPropertyArr[2])).setContent(new ComposableLambdaImpl(new InvestingHomeView$$ExternalSyntheticLambda11(investingHomeViewModel, this, 0), true, 1748502919));
                ((ComposeView) this.searchBar$delegate.getValue(this, kPropertyArr[1])).setVisibility(investingHomeViewModel.getShowSearchBar() ? 0 : 8);
                if (investingHomeViewModel instanceof InvestingHomeViewModel.InitialLoading) {
                    return;
                }
                if (investingHomeViewModel instanceof InvestingHomeViewModel.Discovery) {
                    InvestingHomeViewModel.Discovery discovery = (InvestingHomeViewModel.Discovery) investingHomeViewModel;
                    List list2 = discovery.discoverySections;
                    r8.getClass();
                    list2.getClass();
                    r8.data = list2;
                    r8.notifyDataSetChanged();
                    r14.setData(discovery.welcome);
                    r6.setData(discovery.discoverStockButtonLabel);
                    r2.setData(discovery.placeholderGraph);
                    r15.setData(discovery.pendingTrades);
                    r10.setData(discovery.myFirstStockConfiguration);
                    r12.setData(discovery.newsViewModel);
                    disclosuresAdapter.setData(discovery.disclosureModel);
                    singleRowAdapter.setData(discovery.kybRestrictionModel);
                    return;
                }
                SingleRowAdapter singleRowAdapter7 = singleRowAdapter;
                if (!(investingHomeViewModel instanceof InvestingHomeViewModel.Portfolio)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                InvestingHomeViewModel.Portfolio portfolio = (InvestingHomeViewModel.Portfolio) investingHomeViewModel;
                ArrayList plus = CollectionsKt.plus((Iterable) portfolio.discovery, (Collection) portfolio.holdings);
                r8.getClass();
                r8.data = plus;
                r8.notifyDataSetChanged();
                singleRowAdapter3.setData(portfolio.header);
                GraphAdapter graphAdapter2 = graphAdapter;
                InvestingHomeViewModel.Portfolio portfolio2 = graphAdapter2.data;
                graphAdapter2.data = portfolio;
                if (portfolio2 == null) {
                    graphAdapter2.notifyItemInserted(0);
                } else if (!portfolio2.equals(portfolio)) {
                    graphAdapter2.notifyItemChanged(0);
                }
                singleRowAdapter2.setData(portfolio.showStocksTransferStatus ? Unit.INSTANCE : null);
                r15.setData(portfolio.pendingTrades);
                r11.setData(portfolio.myInvestmentsModel);
                r10.setData(portfolio.myFirstStockConfiguration);
                r12.setData(portfolio.newsViewModel);
                disclosuresAdapter.setData(portfolio.disclosureModel);
                singleRowAdapter7.setData(portfolio.kybRestrictionModel);
                r112.setData(portfolio.dependentDisabledStateModel);
                return;
            }
            switch (((InvestingHomeViewModel.Module) it2.next()).ordinal()) {
                case 0:
                    break;
                case 1:
                    disclosuresAdapter = r6;
                    break;
                case 2:
                    disclosuresAdapter = r7;
                    break;
                case 3:
                    disclosuresAdapter = r8;
                    break;
                case 4:
                    disclosuresAdapter = r9;
                    break;
                case 5:
                    disclosuresAdapter = r10;
                    break;
                case 6:
                    disclosuresAdapter = r11;
                    break;
                case 7:
                    disclosuresAdapter = r12;
                    break;
                case 8:
                    disclosuresAdapter = r13;
                    break;
                case 9:
                    disclosuresAdapter = r14;
                    break;
                case 10:
                    disclosuresAdapter = r15;
                    break;
                case 11:
                    disclosuresAdapter = r2;
                    break;
                case 12:
                    disclosuresAdapter = r4;
                    break;
                case 13:
                    disclosuresAdapter = r112;
                    break;
                default:
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
            }
            arrayList.add(disclosuresAdapter);
            it = it2;
        }
    }
}

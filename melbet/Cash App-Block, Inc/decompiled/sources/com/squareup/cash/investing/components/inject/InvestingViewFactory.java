package com.squareup.cash.investing.components.inject;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.Ui;
import app.cash.broadway.ui.UiFactory;
import app.cash.broadway.ui.ViewFactory;
import app.cash.broadway.ui.XmlFactory;
import coil3.RealImageLoader;
import com.google.android.gms.internal.measurement.zzlj;
import com.squareup.cash.R;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.formview.components.FormElementViewBuilder$Factory$Impl;
import com.squareup.cash.investing.components.ArcadeBordersKt;
import com.squareup.cash.investing.components.InvestingHomeView;
import com.squareup.cash.investing.components.InvestingHomeView$Factory$Impl;
import com.squareup.cash.investing.components.InvestingMetricView$Factory$Impl;
import com.squareup.cash.investing.components.InvestingStockSelectionView$Factory$Impl;
import com.squareup.cash.investing.components.MooncakeInvestingExplanatoryDialogView;
import com.squareup.cash.investing.components.MooncakeInvestingStockRowView$Factory$Impl;
import com.squareup.cash.investing.components.MyFirstConfigurationView$Factory$Impl;
import com.squareup.cash.investing.components.autoinvest.InvestingCancelRecurringPurchaseScreen;
import com.squareup.cash.investing.components.categories.InvestingFilterCategoriesView;
import com.squareup.cash.investing.components.categories.InvestingFilterSubFiltersView;
import com.squareup.cash.investing.components.categories.MooncakeInvestingCategoryCarouselView$Factory$Impl;
import com.squareup.cash.investing.components.dependent.DependentWelcomeNullStateView;
import com.squareup.cash.investing.components.drip.DividendReinvestmentLearnMoreSheetView;
import com.squareup.cash.investing.components.drip.DividendReinvestmentLearnMoreSheetViewV2;
import com.squareup.cash.investing.components.drip.DividendReinvestmentSettingView;
import com.squareup.cash.investing.components.drip.DividendReinvestmentWelcomeView;
import com.squareup.cash.investing.components.news.InvestingNewsCarouselView$ViewFactory$Impl;
import com.squareup.cash.investing.components.ordertype.autoinvest.DependentAutoInvestInfoBottomSheetView;
import com.squareup.cash.investing.components.search.InvestingSearchView$Factory$Impl;
import com.squareup.cash.investing.components.settings.InvestingSettingsView;
import com.squareup.cash.investing.components.stockmetric.ComposableStockMetricTypePickerSheet;
import com.squareup.cash.investing.components.teengraduation.StocksTransferEtaFullScreenView;
import com.squareup.cash.investing.components.teengraduation.StocksTransferEtaFullScreenView$Factory$Impl;
import com.squareup.cash.investing.components.teengraduation.StocksTransferEtaSheetView;
import com.squareup.cash.investing.components.welcome.StocksWelcomeAdapter;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.screen.keys.InvestingSheets;
import com.squareup.cash.p2pblocking.views.P2PListView;
import com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda41;
import com.squareup.cash.storage.RealSandboxer;
import com.squareup.cash.ui.OutsideTapCloses;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.InstanceFactory;
import kotlin.jvm.internal.Reflection;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public final class InvestingViewFactory implements ViewFactory {
    public final InvestingHomeView$Factory$Impl home;
    public final RealImageLoader imageLoader;
    public final InvestingMetricView$Factory$Impl metricViewFactory;
    public final InvestingSearchView$Factory$Impl searchFactory;
    public final InvestingStockSelectionView$Factory$Impl stockSelection;
    public final StocksTransferEtaFullScreenView$Factory$Impl stocksTransferEta;

    public InvestingViewFactory(InvestingHomeView$Factory$Impl investingHomeView$Factory$Impl, InvestingStockSelectionView$Factory$Impl investingStockSelectionView$Factory$Impl, InvestingSearchView$Factory$Impl investingSearchView$Factory$Impl, InvestingMetricView$Factory$Impl investingMetricView$Factory$Impl, RealImageLoader realImageLoader, StocksTransferEtaFullScreenView$Factory$Impl stocksTransferEtaFullScreenView$Factory$Impl) {
        this.home = investingHomeView$Factory$Impl;
        this.stockSelection = investingStockSelectionView$Factory$Impl;
        this.searchFactory = investingSearchView$Factory$Impl;
        this.metricViewFactory = investingMetricView$Factory$Impl;
        this.imageLoader = realImageLoader;
        this.stocksTransferEta = stocksTransferEtaFullScreenView$Factory$Impl;
    }

    @Override // app.cash.broadway.ui.ViewFactory, app.cash.broadway.ui.UiFactory
    public final UiFactory.ScreenUi createUi(Screen screen, Context context, ViewGroup viewGroup) {
        context.getClass();
        return screen instanceof InvestingScreens.StockDetails ? new UiFactory.ComposeUi(new ComposableLambdaImpl(new PoolDetailsViewKt$$ExternalSyntheticLambda41(1, this, screen), true, -2132423107)) : super.createUi(screen, context, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v30, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r13v51 */
    /* JADX WARN: Type inference failed for: r13v52 */
    @Override // app.cash.broadway.ui.ViewFactory
    public final ViewFactory.ScreenView createView(Screen screen, Context context, ViewGroup viewGroup) {
        Context context2;
        View view;
        View inflate;
        View view2;
        context.getClass();
        InvestingScreens investingScreens = screen instanceof InvestingScreens ? (InvestingScreens) screen : null;
        if (investingScreens instanceof InvestingScreens.DependentWelcomeScreen) {
            context2 = context;
            view = new DependentWelcomeNullStateView(context);
        } else if (investingScreens instanceof InvestingScreens.InvestingHome) {
            zzlj zzljVar = this.home.delegateFactory;
            StocksWelcomeAdapter stocksWelcomeAdapter = (StocksWelcomeAdapter) ((RealSandboxer.MetroFactory) zzljVar.zza).invoke();
            RealImageLoader realImageLoader = (RealImageLoader) ((Provider) zzljVar.zzb).invoke();
            MooncakeInvestingCategoryCarouselView$Factory$Impl mooncakeInvestingCategoryCarouselView$Factory$Impl = (MooncakeInvestingCategoryCarouselView$Factory$Impl) ((InstanceFactory) zzljVar.zzc).value;
            InvestingNewsCarouselView$ViewFactory$Impl investingNewsCarouselView$ViewFactory$Impl = (InvestingNewsCarouselView$ViewFactory$Impl) ((InstanceFactory) zzljVar.zze).value;
            MyFirstConfigurationView$Factory$Impl myFirstConfigurationView$Factory$Impl = (MyFirstConfigurationView$Factory$Impl) ((InstanceFactory) zzljVar.zzd).value;
            MooncakeInvestingStockRowView$Factory$Impl mooncakeInvestingStockRowView$Factory$Impl = (MooncakeInvestingStockRowView$Factory$Impl) ((InstanceFactory) zzljVar.zzf).value;
            realImageLoader.getClass();
            mooncakeInvestingCategoryCarouselView$Factory$Impl.getClass();
            investingNewsCarouselView$ViewFactory$Impl.getClass();
            myFirstConfigurationView$Factory$Impl.getClass();
            mooncakeInvestingStockRowView$Factory$Impl.getClass();
            context2 = context;
            view = new InvestingHomeView(context2, stocksWelcomeAdapter, realImageLoader, mooncakeInvestingCategoryCarouselView$Factory$Impl, investingNewsCarouselView$ViewFactory$Impl, myFirstConfigurationView$Factory$Impl, mooncakeInvestingStockRowView$Factory$Impl);
        } else {
            context2 = context;
            if (investingScreens instanceof InvestingScreens.FilterCategoriesScreen) {
                view = new InvestingFilterCategoriesView(context2);
            } else if (investingScreens instanceof InvestingScreens.FilterSubFiltersScreen) {
                view = new InvestingFilterSubFiltersView(context2);
            } else if (investingScreens instanceof InvestingScreens.InvestingExplanatoryDialogScreen) {
                view = new MooncakeInvestingExplanatoryDialogView(context2);
            } else if (investingScreens instanceof InvestingScreens.StockMetricTypePicker) {
                view = new ComposableStockMetricTypePickerSheet(context2);
            } else if (investingScreens instanceof InvestingScreens.DividendReinvestmentSettingScreen) {
                view = new DividendReinvestmentSettingView(context2);
            } else if (investingScreens instanceof InvestingScreens.DividendReinvestmentLearnMoreSheet) {
                view = new DividendReinvestmentLearnMoreSheetView(context2);
            } else if (investingScreens instanceof InvestingScreens.DividendReinvestmentLearnMoreSheetV2) {
                view = new DividendReinvestmentLearnMoreSheetViewV2(context2);
            } else if (investingScreens instanceof InvestingScreens.DividendReinvestmentWelcomeScreen) {
                view = new DividendReinvestmentWelcomeView(context2);
            } else if (investingScreens instanceof InvestingScreens.CancelRecurringPurchase) {
                view = new InvestingCancelRecurringPurchaseScreen(context2);
            } else {
                if (!(investingScreens instanceof InvestingScreens.InvestingSearch)) {
                    if (!(investingScreens instanceof InvestingScreens.StockDetails)) {
                        if (investingScreens instanceof InvestingScreens.InvestingSettingsScreen) {
                            view = new InvestingSettingsView(context2);
                        } else if (investingScreens instanceof InvestingScreens.StocksTransferEtaScreen) {
                            RealRouter.MetroFactory metroFactory = this.stocksTransferEta.delegateFactory;
                            Activity activity = (Activity) metroFactory.urlRouterFactory.value;
                            FormElementViewBuilder$Factory$Impl formElementViewBuilder$Factory$Impl = (FormElementViewBuilder$Factory$Impl) metroFactory.clientRouteRouterFactory.invoke();
                            activity.getClass();
                            formElementViewBuilder$Factory$Impl.getClass();
                            view = new StocksTransferEtaFullScreenView(activity, context2, formElementViewBuilder$Factory$Impl);
                        } else if (investingScreens instanceof InvestingScreens.StocksTransferEtaSheet) {
                            view = new StocksTransferEtaSheetView(context2);
                        } else if (investingScreens instanceof InvestingScreens.TransferStock) {
                            view = ArcadeBordersKt.investingCryptoExchangeView(context2, (InvestingScreens.TransferStock) investingScreens);
                        } else if (investingScreens instanceof InvestingScreens.DependentAutoInvestBottomSheet) {
                            view = new DependentAutoInvestInfoBottomSheetView(context2);
                        } else if (investingScreens instanceof InvestingScreens.CancelScheduledOrderScreen) {
                            inflate = XmlFactory.inflate(context2, R.layout.investing_components_cancel_scheduled_order_confirmation, viewGroup, null);
                            view = inflate;
                        } else {
                            view = null;
                        }
                    }
                    return null;
                }
                RealImageLoader realImageLoader2 = (RealImageLoader) this.searchFactory.delegateFactory.sandboxer.invoke();
                realImageLoader2.getClass();
                view = new P2PListView(realImageLoader2, context2, 17);
            }
        }
        if (view != null) {
            view2 = view;
            if (screen instanceof InvestingSheets) {
                boolean z = view instanceof OutsideTapCloses;
                view2 = view;
                if (!z) {
                    Path$$ExternalSyntheticBUOutline0.m((Object) Recorder$$ExternalSyntheticOutline2.m$1(Reflection.factory.getOrCreateKotlinClass(view.getClass()).getSimpleName(), " doesn't implement OutsideTapCloses"));
                    return null;
                }
            }
        } else {
            view2 = null;
        }
        Ui ui = view2;
        if (screen instanceof BlockersScreens.StockSelectionBlockerScreen) {
            RealImageLoader realImageLoader3 = (RealImageLoader) this.stockSelection.delegateFactory.sandboxer.invoke();
            realImageLoader3.getClass();
            ui = new P2PListView(context2, realImageLoader3, 16);
        }
        if (ui != 0) {
            return new ViewFactory.ScreenView(ui, ui instanceof Ui ? ui : null);
        }
        return null;
    }
}

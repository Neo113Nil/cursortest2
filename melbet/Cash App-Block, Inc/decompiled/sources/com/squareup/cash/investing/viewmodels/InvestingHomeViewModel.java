package com.squareup.cash.investing.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.investing.viewmodels.families.DependentActivityViewModel;
import com.squareup.cash.investing.viewmodels.families.DependentAutoInvestViewModel;
import com.squareup.cash.investing.viewmodels.families.DependentDisabledStateViewModel;
import com.squareup.cash.investing.viewmodels.market.hours.InvestingPendingTradesTileWidgetViewModel;
import com.squareup.cash.investing.viewmodels.market.hours.InvestingPlaceholderGraphViewModel;
import com.squareup.cash.investingcrypto.viewmodels.ColoredLearnMoreConfigurationModel;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsViewModel;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingHomePortfolioHeaderContentModel;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class InvestingHomeViewModel {

    public final class Discovery extends InvestingHomeViewModel {
        public final String disclosureModel;
        public final String discoverStockButtonLabel;
        public final List discoverySections;
        public final UiCallbackModel kybRestrictionModel;
        public final MenuIcon.Settings menuIcon;
        public final Set modules;
        public final ColoredLearnMoreConfigurationModel myFirstStockConfiguration;
        public final InvestingCryptoNewsViewModel newsViewModel;
        public final InvestingPendingTradesTileWidgetViewModel pendingTrades;
        public final InvestingPlaceholderGraphViewModel placeholderGraph;
        public final String toolbarTitle;
        public final StocksWelcome welcome;

        public Discovery(StocksWelcome stocksWelcome, InvestingPlaceholderGraphViewModel investingPlaceholderGraphViewModel, List list, ColoredLearnMoreConfigurationModel coloredLearnMoreConfigurationModel, String str, InvestingCryptoNewsViewModel investingCryptoNewsViewModel, String str2, InvestingPendingTradesTileWidgetViewModel investingPendingTradesTileWidgetViewModel, UiCallbackModel uiCallbackModel, String str3, MenuIcon.Settings settings, Set set) {
            list.getClass();
            investingCryptoNewsViewModel.getClass();
            str2.getClass();
            str3.getClass();
            this.welcome = stocksWelcome;
            this.placeholderGraph = investingPlaceholderGraphViewModel;
            this.discoverySections = list;
            this.myFirstStockConfiguration = coloredLearnMoreConfigurationModel;
            this.discoverStockButtonLabel = str;
            this.newsViewModel = investingCryptoNewsViewModel;
            this.disclosureModel = str2;
            this.pendingTrades = investingPendingTradesTileWidgetViewModel;
            this.kybRestrictionModel = uiCallbackModel;
            this.toolbarTitle = str3;
            this.menuIcon = settings;
            this.modules = set;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Discovery)) {
                return false;
            }
            Discovery discovery = (Discovery) obj;
            return this.welcome.equals(discovery.welcome) && this.placeholderGraph.equals(discovery.placeholderGraph) && Intrinsics.areEqual(this.discoverySections, discovery.discoverySections) && Intrinsics.areEqual(this.myFirstStockConfiguration, discovery.myFirstStockConfiguration) && this.discoverStockButtonLabel.equals(discovery.discoverStockButtonLabel) && Intrinsics.areEqual(this.newsViewModel, discovery.newsViewModel) && Intrinsics.areEqual(this.disclosureModel, discovery.disclosureModel) && Intrinsics.areEqual(this.pendingTrades, discovery.pendingTrades) && this.kybRestrictionModel.equals(discovery.kybRestrictionModel) && Intrinsics.areEqual(this.toolbarTitle, discovery.toolbarTitle) && this.menuIcon.equals(discovery.menuIcon) && this.modules.equals(discovery.modules);
        }

        @Override // com.squareup.cash.investing.viewmodels.InvestingHomeViewModel
        public final MenuIcon getMenuIcon() {
            return this.menuIcon;
        }

        @Override // com.squareup.cash.investing.viewmodels.InvestingHomeViewModel
        public final Set getModules() {
            return this.modules;
        }

        @Override // com.squareup.cash.investing.viewmodels.InvestingHomeViewModel
        public final boolean getShowSearchBar() {
            return true;
        }

        @Override // com.squareup.cash.investing.viewmodels.InvestingHomeViewModel
        public final String getToolbarTitle() {
            return this.toolbarTitle;
        }

        public final int hashCode() {
            int m = Recorder$$ExternalSyntheticOutline2.m((this.placeholderGraph.hashCode() + (this.welcome.hashCode() * 31)) * 31, 31, this.discoverySections);
            ColoredLearnMoreConfigurationModel coloredLearnMoreConfigurationModel = this.myFirstStockConfiguration;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.newsViewModel.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (coloredLearnMoreConfigurationModel == null ? 0 : coloredLearnMoreConfigurationModel.hashCode())) * 31, 31, this.discoverStockButtonLabel)) * 31, 31, this.disclosureModel);
            InvestingPendingTradesTileWidgetViewModel investingPendingTradesTileWidgetViewModel = this.pendingTrades;
            return this.modules.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.kybRestrictionModel.hashCode() + ((m2 + (investingPendingTradesTileWidgetViewModel != null ? investingPendingTradesTileWidgetViewModel.hashCode() : 0)) * 31)) * 31, 31, this.toolbarTitle), 31, this.menuIcon.title);
        }

        public final String toString() {
            return "Discovery(welcome=" + this.welcome + ", placeholderGraph=" + this.placeholderGraph + ", discoverySections=" + this.discoverySections + ", myFirstStockConfiguration=" + this.myFirstStockConfiguration + ", discoverStockButtonLabel=" + this.discoverStockButtonLabel + ", newsViewModel=" + this.newsViewModel + ", disclosureModel=" + this.disclosureModel + ", pendingTrades=" + this.pendingTrades + ", kybRestrictionModel=" + this.kybRestrictionModel + ", toolbarTitle=" + this.toolbarTitle + ", menuIcon=" + this.menuIcon + ", modules=" + this.modules + ")";
        }
    }

    public final class InitialLoading extends InvestingHomeViewModel {
        public static final InitialLoading INSTANCE = new InitialLoading();
        public static final EmptySet modules = EmptySet.INSTANCE;

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InitialLoading);
        }

        @Override // com.squareup.cash.investing.viewmodels.InvestingHomeViewModel
        public final /* bridge */ /* synthetic */ MenuIcon getMenuIcon() {
            return MenuIcon.Hidden.INSTANCE;
        }

        @Override // com.squareup.cash.investing.viewmodels.InvestingHomeViewModel
        public final Set getModules() {
            return modules;
        }

        @Override // com.squareup.cash.investing.viewmodels.InvestingHomeViewModel
        public final boolean getShowSearchBar() {
            return false;
        }

        @Override // com.squareup.cash.investing.viewmodels.InvestingHomeViewModel
        public final String getToolbarTitle() {
            return null;
        }

        public final int hashCode() {
            return 1651569154;
        }

        public final String toString() {
            return "InitialLoading";
        }
    }

    public interface MenuIcon {

        public final class Hidden implements MenuIcon {
            public static final Hidden INSTANCE = new Hidden();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Hidden);
            }

            public final int hashCode() {
                return 1315392150;
            }

            public final String toString() {
                return "Hidden";
            }
        }

        public final class Settings implements MenuIcon {
            public final String title;

            public Settings(String str) {
                str.getClass();
                this.title = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Settings) && Intrinsics.areEqual(this.title, ((Settings) obj).title);
            }

            public final int hashCode() {
                return this.title.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Settings(title=", this.title, ")");
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Module {
        public static final /* synthetic */ Module[] $VALUES;
        public static final Module ACCOUNT_TRANSFER_STATUS;
        public static final Module DEPENDENT_DISABLED_STATE;
        public static final Module DISCLOSURE;
        public static final Module DISCOVER_STOCK;
        public static final Module GRAPH;
        public static final Module HOLDINGS;
        public static final Module KYB_RESTRICTION;
        public static final Module MY_FIRST_CONFIGURATION;
        public static final Module MY_INVESTMENTS;
        public static final Module NEWS_CAROUSEL;
        public static final Module PENDING_TRADES;
        public static final Module PLACEHOLDER_GRAPH;
        public static final Module PORTFOLIO_HERO;
        public static final Module STOCKS_WELCOME;

        static {
            Module module = new Module("DISCLOSURE", 0);
            DISCLOSURE = module;
            Module module2 = new Module("DISCOVER_STOCK", 1);
            DISCOVER_STOCK = module2;
            Module module3 = new Module("GRAPH", 2);
            GRAPH = module3;
            Module module4 = new Module("HOLDINGS", 3);
            HOLDINGS = module4;
            Module module5 = new Module("ACCOUNT_TRANSFER_STATUS", 4);
            ACCOUNT_TRANSFER_STATUS = module5;
            Module module6 = new Module("MY_FIRST_CONFIGURATION", 5);
            MY_FIRST_CONFIGURATION = module6;
            Module module7 = new Module("MY_INVESTMENTS", 6);
            MY_INVESTMENTS = module7;
            Module module8 = new Module("NEWS_CAROUSEL", 7);
            NEWS_CAROUSEL = module8;
            Module module9 = new Module("PORTFOLIO_HERO", 8);
            PORTFOLIO_HERO = module9;
            Module module10 = new Module("STOCKS_WELCOME", 9);
            STOCKS_WELCOME = module10;
            Module module11 = new Module("PENDING_TRADES", 10);
            PENDING_TRADES = module11;
            Module module12 = new Module("PLACEHOLDER_GRAPH", 11);
            PLACEHOLDER_GRAPH = module12;
            Module module13 = new Module("KYB_RESTRICTION", 12);
            KYB_RESTRICTION = module13;
            Module module14 = new Module("DEPENDENT_DISABLED_STATE", 13);
            DEPENDENT_DISABLED_STATE = module14;
            $VALUES = new Module[]{module, module2, module3, module4, module5, module6, module7, module8, module9, module10, module11, module12, module13, module14};
        }

        public static Module valueOf(String str) {
            return (Module) Enum.valueOf(Module.class, str);
        }

        public static Module[] values() {
            return (Module[]) $VALUES.clone();
        }
    }

    public final class Portfolio extends InvestingHomeViewModel {
        public final DependentDisabledStateViewModel dependentDisabledStateModel;
        public final String disclosureModel;
        public final ArrayList discovery;
        public final InvestingGraphContentModel graphContentModel;
        public final InvestingHomePortfolioHeaderContentModel header;
        public final ArrayList holdings;
        public final UiCallbackModel kybRestrictionModel;
        public final MenuIcon menuIcon;
        public final Set modules;
        public final ColoredLearnMoreConfigurationModel myFirstStockConfiguration;
        public final MyInvestmentsContentModel myInvestmentsModel;
        public final InvestingCryptoNewsViewModel newsViewModel;
        public final InvestingPendingTradesTileWidgetViewModel pendingTrades;
        public final HistoricalRange selectedRange;
        public final boolean showSearchBar;
        public final boolean showStocksTransferStatus;
        public final String toolbarTitle;

        public Portfolio(InvestingHomePortfolioHeaderContentModel investingHomePortfolioHeaderContentModel, InvestingGraphContentModel investingGraphContentModel, HistoricalRange historicalRange, ArrayList arrayList, MyInvestmentsContentModel myInvestmentsContentModel, ArrayList arrayList2, ColoredLearnMoreConfigurationModel coloredLearnMoreConfigurationModel, InvestingCryptoNewsViewModel investingCryptoNewsViewModel, String str, boolean z, InvestingPendingTradesTileWidgetViewModel investingPendingTradesTileWidgetViewModel, UiCallbackModel uiCallbackModel, DependentDisabledStateViewModel dependentDisabledStateViewModel, String str2, MenuIcon menuIcon, Set set, boolean z2) {
            historicalRange.getClass();
            uiCallbackModel.getClass();
            str2.getClass();
            this.header = investingHomePortfolioHeaderContentModel;
            this.graphContentModel = investingGraphContentModel;
            this.selectedRange = historicalRange;
            this.holdings = arrayList;
            this.myInvestmentsModel = myInvestmentsContentModel;
            this.discovery = arrayList2;
            this.myFirstStockConfiguration = coloredLearnMoreConfigurationModel;
            this.newsViewModel = investingCryptoNewsViewModel;
            this.disclosureModel = str;
            this.showStocksTransferStatus = z;
            this.pendingTrades = investingPendingTradesTileWidgetViewModel;
            this.kybRestrictionModel = uiCallbackModel;
            this.dependentDisabledStateModel = dependentDisabledStateViewModel;
            this.toolbarTitle = str2;
            this.menuIcon = menuIcon;
            this.modules = set;
            this.showSearchBar = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Portfolio)) {
                return false;
            }
            Portfolio portfolio = (Portfolio) obj;
            return this.header.equals(portfolio.header) && this.graphContentModel.equals(portfolio.graphContentModel) && this.selectedRange == portfolio.selectedRange && this.holdings.equals(portfolio.holdings) && this.myInvestmentsModel.equals(portfolio.myInvestmentsModel) && this.discovery.equals(portfolio.discovery) && Intrinsics.areEqual(this.myFirstStockConfiguration, portfolio.myFirstStockConfiguration) && Intrinsics.areEqual(this.newsViewModel, portfolio.newsViewModel) && Intrinsics.areEqual(this.disclosureModel, portfolio.disclosureModel) && this.showStocksTransferStatus == portfolio.showStocksTransferStatus && Intrinsics.areEqual(this.pendingTrades, portfolio.pendingTrades) && Intrinsics.areEqual(this.kybRestrictionModel, portfolio.kybRestrictionModel) && Intrinsics.areEqual(this.dependentDisabledStateModel, portfolio.dependentDisabledStateModel) && Intrinsics.areEqual(this.toolbarTitle, portfolio.toolbarTitle) && this.menuIcon.equals(portfolio.menuIcon) && this.modules.equals(portfolio.modules) && this.showSearchBar == portfolio.showSearchBar;
        }

        @Override // com.squareup.cash.investing.viewmodels.InvestingHomeViewModel
        public final MenuIcon getMenuIcon() {
            return this.menuIcon;
        }

        @Override // com.squareup.cash.investing.viewmodels.InvestingHomeViewModel
        public final Set getModules() {
            return this.modules;
        }

        @Override // com.squareup.cash.investing.viewmodels.InvestingHomeViewModel
        public final boolean getShowSearchBar() {
            return this.showSearchBar;
        }

        @Override // com.squareup.cash.investing.viewmodels.InvestingHomeViewModel
        public final String getToolbarTitle() {
            return this.toolbarTitle;
        }

        public final int hashCode() {
            int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.discovery, (this.myInvestmentsModel.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.holdings, (this.selectedRange.hashCode() + ((this.graphContentModel.hashCode() + (this.header.hashCode() * 31)) * 31)) * 31, 31)) * 31, 31);
            ColoredLearnMoreConfigurationModel coloredLearnMoreConfigurationModel = this.myFirstStockConfiguration;
            int hashCode = (m + (coloredLearnMoreConfigurationModel == null ? 0 : coloredLearnMoreConfigurationModel.hashCode())) * 31;
            InvestingCryptoNewsViewModel investingCryptoNewsViewModel = this.newsViewModel;
            int hashCode2 = (hashCode + (investingCryptoNewsViewModel == null ? 0 : investingCryptoNewsViewModel.hashCode())) * 31;
            String str = this.disclosureModel;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.showStocksTransferStatus);
            InvestingPendingTradesTileWidgetViewModel investingPendingTradesTileWidgetViewModel = this.pendingTrades;
            int hashCode3 = (this.kybRestrictionModel.hashCode() + ((m2 + (investingPendingTradesTileWidgetViewModel == null ? 0 : investingPendingTradesTileWidgetViewModel.hashCode())) * 31)) * 31;
            DependentDisabledStateViewModel dependentDisabledStateViewModel = this.dependentDisabledStateModel;
            return Boolean.hashCode(this.showSearchBar) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.menuIcon.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (dependentDisabledStateViewModel != null ? dependentDisabledStateViewModel.hashCode() : 0)) * 31, 31, this.toolbarTitle)) * 31, 31, this.modules);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Portfolio(header=");
            sb.append(this.header);
            sb.append(", graphContentModel=");
            sb.append(this.graphContentModel);
            sb.append(", selectedRange=");
            sb.append(this.selectedRange);
            sb.append(", holdings=");
            sb.append(this.holdings);
            sb.append(", myInvestmentsModel=");
            sb.append(this.myInvestmentsModel);
            sb.append(", discovery=");
            sb.append(this.discovery);
            sb.append(", myFirstStockConfiguration=");
            sb.append(this.myFirstStockConfiguration);
            sb.append(", newsViewModel=");
            sb.append(this.newsViewModel);
            sb.append(", disclosureModel=");
            NavAction$$ExternalSyntheticOutline0.m(sb, this.disclosureModel, ", showStocksTransferStatus=", this.showStocksTransferStatus, ", pendingTrades=");
            sb.append(this.pendingTrades);
            sb.append(", kybRestrictionModel=");
            sb.append(this.kybRestrictionModel);
            sb.append(", dependentDisabledStateModel=");
            sb.append(this.dependentDisabledStateModel);
            sb.append(", toolbarTitle=");
            sb.append(this.toolbarTitle);
            sb.append(", menuIcon=");
            sb.append(this.menuIcon);
            sb.append(", modules=");
            sb.append(this.modules);
            sb.append(", showSearchBar=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.showSearchBar, ")");
        }
    }

    public final class StocksWelcome {
        public final String subtitle;
        public final String title;

        public StocksWelcome(String str, String str2) {
            this.title = str;
            this.subtitle = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StocksWelcome)) {
                return false;
            }
            StocksWelcome stocksWelcome = (StocksWelcome) obj;
            return this.title.equals(stocksWelcome.title) && this.subtitle.equals(stocksWelcome.subtitle);
        }

        public final int hashCode() {
            return this.subtitle.hashCode() + (this.title.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("StocksWelcome(title=", this.title, ", subtitle=", this.subtitle, ")");
        }
    }

    public abstract MenuIcon getMenuIcon();

    public abstract Set getModules();

    public abstract boolean getShowSearchBar();

    public abstract String getToolbarTitle();

    public abstract class InvestingHomeRow {

        public final class CategoryCarousel extends InvestingHomeRow {
            public final ArrayList tiles;

            public CategoryCarousel(ArrayList arrayList) {
                this.tiles = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CategoryCarousel) && this.tiles.equals(((CategoryCarousel) obj).tiles);
            }

            @Override // com.squareup.cash.investing.viewmodels.InvestingHomeViewModel.InvestingHomeRow
            public final long getId() {
                return -4L;
            }

            public final int hashCode() {
                return this.tiles.hashCode();
            }

            public final String toString() {
                return Request$Priority$EnumUnboxingLocalUtility.m("CategoryCarousel(tiles=", ")", this.tiles);
            }
        }

        public final class DependentActivity extends InvestingHomeRow {
            public final DependentActivityViewModel activityModel;

            public DependentActivity(DependentActivityViewModel dependentActivityViewModel) {
                dependentActivityViewModel.getClass();
                this.activityModel = dependentActivityViewModel;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DependentActivity) && Intrinsics.areEqual(this.activityModel, ((DependentActivity) obj).activityModel);
            }

            @Override // com.squareup.cash.investing.viewmodels.InvestingHomeViewModel.InvestingHomeRow
            public final long getId() {
                return -5L;
            }

            public final int hashCode() {
                return Long.hashCode(-5L) + (this.activityModel.hashCode() * 31);
            }

            public final String toString() {
                return "DependentActivity(activityModel=" + this.activityModel + ", id=-5)";
            }
        }

        public final class DependentAutoInvest extends InvestingHomeRow {
            public final DependentAutoInvestViewModel model;

            public DependentAutoInvest(DependentAutoInvestViewModel dependentAutoInvestViewModel) {
                dependentAutoInvestViewModel.getClass();
                this.model = dependentAutoInvestViewModel;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DependentAutoInvest) && Intrinsics.areEqual(this.model, ((DependentAutoInvest) obj).model);
            }

            @Override // com.squareup.cash.investing.viewmodels.InvestingHomeViewModel.InvestingHomeRow
            public final long getId() {
                return -6L;
            }

            public final int hashCode() {
                return Long.hashCode(-6L) + (this.model.hashCode() * 31);
            }

            public final String toString() {
                return "DependentAutoInvest(model=" + this.model + ", id=-6)";
            }
        }

        public abstract class Stock extends InvestingHomeRow {

            public final class Discovery extends Stock {
                public final StockContentModel contentModel;
                public final long id;
                public final String sectionHeader;

                public Discovery(StockContentModel stockContentModel, long j, String str) {
                    str.getClass();
                    this.contentModel = stockContentModel;
                    this.id = j;
                    this.sectionHeader = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Discovery)) {
                        return false;
                    }
                    Discovery discovery = (Discovery) obj;
                    return this.contentModel.equals(discovery.contentModel) && this.id == discovery.id && Intrinsics.areEqual(this.sectionHeader, discovery.sectionHeader);
                }

                @Override // com.squareup.cash.investing.viewmodels.InvestingHomeViewModel.InvestingHomeRow.Stock
                public final StockContentModel getContentModel() {
                    return this.contentModel;
                }

                @Override // com.squareup.cash.investing.viewmodels.InvestingHomeViewModel.InvestingHomeRow
                public final long getId() {
                    return this.id;
                }

                public final int hashCode() {
                    return this.sectionHeader.hashCode() + Recorder$$ExternalSyntheticOutline2.m(this.contentModel.hashCode() * 31, 31, this.id);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Discovery(contentModel=");
                    sb.append(this.contentModel);
                    sb.append(", id=");
                    sb.append(this.id);
                    return Recorder$$ExternalSyntheticOutline2.m(sb, ", sectionHeader=", this.sectionHeader, ")");
                }
            }

            public final class Following extends Stock {
                public final StockContentModel contentModel;
                public final long id;

                public Following(StockContentModel stockContentModel, long j) {
                    this.contentModel = stockContentModel;
                    this.id = j;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Following)) {
                        return false;
                    }
                    Following following = (Following) obj;
                    return this.contentModel.equals(following.contentModel) && this.id == following.id;
                }

                @Override // com.squareup.cash.investing.viewmodels.InvestingHomeViewModel.InvestingHomeRow.Stock
                public final StockContentModel getContentModel() {
                    return this.contentModel;
                }

                @Override // com.squareup.cash.investing.viewmodels.InvestingHomeViewModel.InvestingHomeRow
                public final long getId() {
                    return this.id;
                }

                public final int hashCode() {
                    return Long.hashCode(this.id) + (this.contentModel.hashCode() * 31);
                }

                public final String toString() {
                    return "Following(contentModel=" + this.contentModel + ", id=" + this.id + ")";
                }
            }

            public final class Portfolio extends Stock {
                public final StockContentModel contentModel;
                public final long id;

                public Portfolio(StockContentModel stockContentModel, long j) {
                    this.contentModel = stockContentModel;
                    this.id = j;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Portfolio)) {
                        return false;
                    }
                    Portfolio portfolio = (Portfolio) obj;
                    return this.contentModel.equals(portfolio.contentModel) && this.id == portfolio.id;
                }

                @Override // com.squareup.cash.investing.viewmodels.InvestingHomeViewModel.InvestingHomeRow.Stock
                public final StockContentModel getContentModel() {
                    return this.contentModel;
                }

                @Override // com.squareup.cash.investing.viewmodels.InvestingHomeViewModel.InvestingHomeRow
                public final long getId() {
                    return this.id;
                }

                public final int hashCode() {
                    return Long.hashCode(this.id) + (this.contentModel.hashCode() * 31);
                }

                public final String toString() {
                    return "Portfolio(contentModel=" + this.contentModel + ", id=" + this.id + ")";
                }
            }

            public abstract StockContentModel getContentModel();
        }

        public final class StockCarousel extends InvestingHomeRow {
            public final long id;
            public final ArrayList pages;

            public final class Page {
                public final List rows;

                public Page(List list) {
                    list.getClass();
                    this.rows = list;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Page) && Intrinsics.areEqual(this.rows, ((Page) obj).rows);
                }

                public final int hashCode() {
                    return this.rows.hashCode();
                }

                public final String toString() {
                    return CameraState$Type$EnumUnboxingLocalUtility.m("Page(rows=", ")", this.rows);
                }
            }

            public StockCarousel(ArrayList arrayList, long j) {
                this.pages = arrayList;
                this.id = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof StockCarousel)) {
                    return false;
                }
                StockCarousel stockCarousel = (StockCarousel) obj;
                return this.pages.equals(stockCarousel.pages) && this.id == stockCarousel.id;
            }

            @Override // com.squareup.cash.investing.viewmodels.InvestingHomeViewModel.InvestingHomeRow
            public final long getId() {
                return this.id;
            }

            public final int hashCode() {
                return Long.hashCode(this.id) + (this.pages.hashCode() * 31);
            }

            public final String toString() {
                return "StockCarousel(pages=" + this.pages + ", id=" + this.id + ")";
            }
        }

        public abstract long getId();

        public final class Header extends InvestingHomeRow {
            public final HeaderAction action;
            public final String description;
            public final HeaderDescriptionColor descriptionColor;
            public final long id;
            public final String title;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class HeaderAction {
                public static final /* synthetic */ HeaderAction[] $VALUES;
                public static final HeaderAction CHANGE_SORTING_ORDER;

                static {
                    HeaderAction headerAction = new HeaderAction("CHANGE_SORTING_ORDER", 0);
                    CHANGE_SORTING_ORDER = headerAction;
                    $VALUES = new HeaderAction[]{headerAction, new HeaderAction("SHOW_PERFORMANCE", 1)};
                }

                public static HeaderAction valueOf(String str) {
                    return (HeaderAction) Enum.valueOf(HeaderAction.class, str);
                }

                public static HeaderAction[] values() {
                    return (HeaderAction[]) $VALUES.clone();
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class HeaderDescriptionColor {
                public static final /* synthetic */ HeaderDescriptionColor[] $VALUES;
                public static final HeaderDescriptionColor Secondary;
                public static final HeaderDescriptionColor Tertiary;

                static {
                    HeaderDescriptionColor headerDescriptionColor = new HeaderDescriptionColor("Secondary", 0);
                    Secondary = headerDescriptionColor;
                    HeaderDescriptionColor headerDescriptionColor2 = new HeaderDescriptionColor("Tertiary", 1);
                    Tertiary = headerDescriptionColor2;
                    $VALUES = new HeaderDescriptionColor[]{headerDescriptionColor, headerDescriptionColor2};
                }

                public static HeaderDescriptionColor valueOf(String str) {
                    return (HeaderDescriptionColor) Enum.valueOf(HeaderDescriptionColor.class, str);
                }

                public static HeaderDescriptionColor[] values() {
                    return (HeaderDescriptionColor[]) $VALUES.clone();
                }
            }

            public /* synthetic */ Header(int i, String str, String str2, long j) {
                this(str, str2, (i & 4) != 0 ? null : HeaderAction.CHANGE_SORTING_ORDER, j, HeaderDescriptionColor.Secondary);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Header)) {
                    return false;
                }
                Header header = (Header) obj;
                return Intrinsics.areEqual(this.title, header.title) && Intrinsics.areEqual(this.description, header.description) && this.action == header.action && this.id == header.id && this.descriptionColor == header.descriptionColor;
            }

            @Override // com.squareup.cash.investing.viewmodels.InvestingHomeViewModel.InvestingHomeRow
            public final long getId() {
                return this.id;
            }

            public final int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                String str = this.description;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                HeaderAction headerAction = this.action;
                return this.descriptionColor.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (headerAction != null ? headerAction.hashCode() : 0)) * 31, 31, this.id);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Header(title=", this.title, ", description=", this.description, ", action=");
                m.append(this.action);
                m.append(", id=");
                m.append(this.id);
                m.append(", descriptionColor=");
                m.append(this.descriptionColor);
                m.append(")");
                return m.toString();
            }

            public Header(String str, String str2, HeaderAction headerAction, long j, HeaderDescriptionColor headerDescriptionColor) {
                str.getClass();
                this.title = str;
                this.description = str2;
                this.action = headerAction;
                this.id = j;
                this.descriptionColor = headerDescriptionColor;
            }
        }
    }
}

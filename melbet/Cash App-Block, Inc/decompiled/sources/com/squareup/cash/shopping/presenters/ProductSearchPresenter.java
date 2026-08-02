package com.squareup.cash.shopping.presenters;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.emoji2.text.EmojiExclusions;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.directory.data.Directory$Section;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientroutes.RealClientRouteParser;
import com.squareup.cash.clientrouting.ClientRouteParserKt;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda1;
import com.squareup.cash.pools.presenters.PoolsListPresenter$models$2$2;
import com.squareup.cash.qrcodes.presenters.RealQrCodesPresenter$models$1$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda9;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda3;
import com.squareup.cash.shopping.backend.analytics.ShopHubAnalyticsHelper$Flow;
import com.squareup.cash.shopping.backend.api.SearchQuery;
import com.squareup.cash.shopping.backend.api.SearchResults;
import com.squareup.cash.shopping.backend.real.RealProductSearchRepository;
import com.squareup.cash.shopping.backend.real.RealRecentSearchManager;
import com.squareup.cash.shopping.backend.real.RealShopHubAnalyticsHelper;
import com.squareup.cash.shopping.screens.ShoppingScreen$Filter;
import com.squareup.cash.shopping.screens.ShoppingScreen$ProductSearchScreen;
import com.squareup.cash.shopping.viewmodels.ProductSearchViewModel;
import com.squareup.cash.shopping.viewmodels.ShopHubResultsListItem;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda10;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.customersearch.api.Filter;
import com.squareup.protos.cash.customersearch.api.Filter$Option$PriceRange;
import com.squareup.protos.cash.customersearch.api.Filter$Option$SelectionList;
import com.squareup.protos.cash.customersearch.api.Filter$Option$Toggle;
import com.squareup.protos.cash.customersearch.api.PriceRange;
import com.squareup.protos.cash.customersearch.api.SearchCommonMessageSection;
import com.squareup.protos.cash.customersearch.api.SearchCommonPlaceholderSection;
import com.squareup.protos.cash.customersearch.api.SelectionList;
import com.squareup.protos.cash.discover.api.app.v1.model.Button;
import com.squareup.protos.cash.discover.api.app.v1.model.EmbeddedImageSection;
import com.squareup.protos.cash.discover.api.app.v1.model.PlaceholderSection;
import com.squareup.protos.cash.discover.api.app.v1.model.Section;
import com.squareup.protos.cash.discover.api.app.v1.model.TapAction;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import com.squareup.protos.cash.discover.api.app.v1.model.TileSection;
import com.squareup.protos.cash.ui.Color;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class ProductSearchPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final RealShopHubAnalyticsHelper analyticsHelper;
    public final ShoppingScreen$ProductSearchScreen args;
    public final RealClientRouteParser clientRouteParser;
    public final AndroidClock clock;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealRecentSearchManager recentSearchManager;
    public final RealProductSearchRepository repository;
    public final RealRouter router;
    public final long searchInputDelay;
    public final AndroidStringManager stringManager;

    public final class State {
        public final List filters;
        public final boolean hasSavedResults;
        public final boolean isInitialQuery;
        public final boolean isInitialState;
        public final boolean isLoadingNextPage;
        public final boolean isRestoringState;
        public final boolean isRetrying;
        public final int retryCount;
        public final SearchResults searchResults;
        public final String searchText;
        public final ProductSearchViewModel viewModel;

        public State(ProductSearchViewModel productSearchViewModel, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, String str, SearchResults searchResults) {
            list.getClass();
            str.getClass();
            this.viewModel = productSearchViewModel;
            this.filters = list;
            this.isInitialState = z;
            this.isInitialQuery = z2;
            this.isRestoringState = z3;
            this.hasSavedResults = z4;
            this.isLoadingNextPage = z5;
            this.isRetrying = z6;
            this.retryCount = i;
            this.searchText = str;
            this.searchResults = searchResults;
        }

        public static State copy$default(State state, ProductSearchViewModel productSearchViewModel, List list, boolean z, boolean z2, boolean z3, boolean z4, int i, String str, SearchResults searchResults, int i2) {
            if ((i2 & 1) != 0) {
                productSearchViewModel = state.viewModel;
            }
            ProductSearchViewModel productSearchViewModel2 = productSearchViewModel;
            List list2 = (i2 & 2) != 0 ? state.filters : list;
            boolean z5 = (i2 & 4) != 0 ? state.isInitialState : false;
            boolean z6 = (i2 & 8) != 0 ? state.isInitialQuery : false;
            boolean z7 = (i2 & 16) != 0 ? state.isRestoringState : z;
            boolean z8 = (i2 & 32) != 0 ? state.hasSavedResults : z2;
            boolean z9 = (i2 & 64) != 0 ? state.isLoadingNextPage : z3;
            boolean z10 = (i2 & 128) != 0 ? state.isRetrying : z4;
            int i3 = (i2 & 256) != 0 ? state.retryCount : i;
            String str2 = (i2 & 512) != 0 ? state.searchText : str;
            SearchResults searchResults2 = (i2 & 1024) != 0 ? state.searchResults : searchResults;
            state.getClass();
            productSearchViewModel2.getClass();
            list2.getClass();
            str2.getClass();
            searchResults2.getClass();
            return new State(productSearchViewModel2, list2, z5, z6, z7, z8, z9, z10, i3, str2, searchResults2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return this.viewModel.equals(state.viewModel) && Intrinsics.areEqual(this.filters, state.filters) && this.isInitialState == state.isInitialState && this.isInitialQuery == state.isInitialQuery && this.isRestoringState == state.isRestoringState && this.hasSavedResults == state.hasSavedResults && this.isLoadingNextPage == state.isLoadingNextPage && this.isRetrying == state.isRetrying && this.retryCount == state.retryCount && Intrinsics.areEqual(this.searchText, state.searchText) && this.searchResults.equals(state.searchResults);
        }

        public final int hashCode() {
            return this.searchResults.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.retryCount, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(this.viewModel.hashCode() * 31, 31, this.filters), 31, this.isInitialState), 31, this.isInitialQuery), 31, this.isRestoringState), 31, this.hasSavedResults), 31, this.isLoadingNextPage), 31, this.isRetrying), 31), 31, this.searchText);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State(viewModel=");
            sb.append(this.viewModel);
            sb.append(", filters=");
            sb.append(this.filters);
            sb.append(", isInitialState=");
            re$$ExternalSyntheticOutline0.m(sb, this.isInitialState, ", isInitialQuery=", this.isInitialQuery, ", isRestoringState=");
            re$$ExternalSyntheticOutline0.m(sb, this.isRestoringState, ", hasSavedResults=", this.hasSavedResults, ", isLoadingNextPage=");
            re$$ExternalSyntheticOutline0.m(sb, this.isLoadingNextPage, ", isRetrying=", this.isRetrying, ", retryCount=");
            sb.append(this.retryCount);
            sb.append(", searchText=");
            sb.append(this.searchText);
            sb.append(", searchResults=");
            sb.append(this.searchResults);
            sb.append(")");
            return sb.toString();
        }
    }

    public ProductSearchPresenter(ShoppingScreen$ProductSearchScreen shoppingScreen$ProductSearchScreen, RealProductSearchRepository realProductSearchRepository, AndroidStringManager androidStringManager, long j, BetterNavigator.ScreenNavigator screenNavigator, RealClientRouteParser realClientRouteParser, RealRouter$Factory$Impl realRouter$Factory$Impl, AndroidClock androidClock, RealRecentSearchManager realRecentSearchManager, Analytics analytics, RealShopHubAnalyticsHelper realShopHubAnalyticsHelper) {
        shoppingScreen$ProductSearchScreen.getClass();
        this.args = shoppingScreen$ProductSearchScreen;
        this.repository = realProductSearchRepository;
        this.stringManager = androidStringManager;
        this.searchInputDelay = j;
        this.navigator = screenNavigator;
        this.clientRouteParser = realClientRouteParser;
        this.clock = androidClock;
        this.recentSearchManager = realRecentSearchManager;
        this.analytics = analytics;
        this.analyticsHelper = realShopHubAnalyticsHelper;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0085, code lost:
    
        if (r3 == r6) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$performSearch(ProductSearchPresenter productSearchPresenter, State state, List list, ContinuationImpl continuationImpl) {
        ProductSearchPresenter$performSearch$1 productSearchPresenter$performSearch$1;
        Object obj;
        int i;
        SearchResults searchResults;
        Object search;
        SearchResults searchResults2;
        SearchResults searchResults3;
        State state2;
        SearchResults searchResults4;
        SearchResults searchResults5;
        State state3;
        State state4 = state;
        RealShopHubAnalyticsHelper realShopHubAnalyticsHelper = productSearchPresenter.analyticsHelper;
        RealProductSearchRepository realProductSearchRepository = productSearchPresenter.repository;
        if (continuationImpl instanceof ProductSearchPresenter$performSearch$1) {
            productSearchPresenter$performSearch$1 = (ProductSearchPresenter$performSearch$1) continuationImpl;
            int i2 = productSearchPresenter$performSearch$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                productSearchPresenter$performSearch$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = productSearchPresenter$performSearch$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = productSearchPresenter$performSearch$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    searchResults = state4.searchResults;
                    SearchQuery searchQuery = new SearchQuery(state4.searchText, realShopHubAnalyticsHelper.getFlowToken(ShopHubAnalyticsHelper$Flow.SHOP), realShopHubAnalyticsHelper.getFlowToken(ShopHubAnalyticsHelper$Flow.SEARCH));
                    String str = searchResults.paginationToken;
                    productSearchPresenter$performSearch$1.L$0 = state4;
                    productSearchPresenter$performSearch$1.L$2 = searchResults;
                    productSearchPresenter$performSearch$1.label = 1;
                    search = realProductSearchRepository.search(searchQuery, list, str, productSearchPresenter$performSearch$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SearchResults searchResults6 = productSearchPresenter$performSearch$1.L$4;
                            State state5 = productSearchPresenter$performSearch$1.L$0;
                            SafeTrace.throwOnFailure(obj2);
                            searchResults5 = searchResults6;
                            state3 = state5;
                            return State.copy$default(state3, (ProductSearchViewModel.Loaded) obj2, null, false, false, false, false, 0, null, searchResults5, 958);
                        }
                        searchResults4 = productSearchPresenter$performSearch$1.L$4;
                        searchResults2 = productSearchPresenter$performSearch$1.L$3;
                        state2 = productSearchPresenter$performSearch$1.L$0;
                        SafeTrace.throwOnFailure(obj2);
                        boolean z = (state2.isLoadingNextPage || searchResults2.errorMessage == null) ? false : true;
                        productSearchPresenter$performSearch$1.L$0 = state2;
                        productSearchPresenter$performSearch$1.L$2 = null;
                        productSearchPresenter$performSearch$1.L$3 = null;
                        productSearchPresenter$performSearch$1.L$4 = searchResults4;
                        productSearchPresenter$performSearch$1.label = 3;
                        obj2 = productSearchPresenter.toViewModel(state2, searchResults4, z, productSearchPresenter$performSearch$1);
                        if (obj2 != obj) {
                            searchResults5 = searchResults4;
                            state3 = state2;
                            return State.copy$default(state3, (ProductSearchViewModel.Loaded) obj2, null, false, false, false, false, 0, null, searchResults5, 958);
                        }
                        return obj;
                    }
                    SearchResults searchResults7 = productSearchPresenter$performSearch$1.L$2;
                    State state6 = productSearchPresenter$performSearch$1.L$0;
                    SafeTrace.throwOnFailure(obj2);
                    searchResults = searchResults7;
                    state4 = state6;
                    search = obj2;
                }
                searchResults2 = (SearchResults) search;
                if (state4.isLoadingNextPage) {
                    searchResults3 = null;
                    searchResults = searchResults2;
                } else {
                    Directory$Section directory$Section = (Directory$Section) CollectionsKt.lastOrNull(searchResults.sections);
                    if (directory$Section == null) {
                        searchResults = searchResults2;
                    } else {
                        Directory$Section.Type type2 = directory$Section.f908type;
                        Directory$Section directory$Section2 = (Directory$Section) CollectionsKt.lastOrNull(searchResults2.sections);
                        if (directory$Section2 != null) {
                            Directory$Section.Type type3 = directory$Section2.f908type;
                            if (type2 != type3) {
                                Path$$ExternalSyntheticBUOutline0.m$1("Cannot merge sections with different types: ", type2, " - ", type3);
                                return null;
                            }
                            String str2 = searchResults2.paginationToken;
                            ArrayList plus = CollectionsKt.plus((Iterable) directory$Section2.items, (Collection) directory$Section.items);
                            String str3 = directory$Section.id;
                            String str4 = directory$Section.serverId;
                            Text text = directory$Section.eyebrow;
                            Text text2 = directory$Section.title;
                            Text text3 = directory$Section.subtitle;
                            Text text4 = directory$Section.headerText;
                            searchResults3 = null;
                            String str5 = directory$Section.headerActionUrl;
                            Button button = directory$Section.headerButton;
                            Button button2 = directory$Section.footerButton;
                            TapAction tapAction = directory$Section.tapAction;
                            PlaceholderSection placeholderSection = directory$Section.placeholderSection;
                            EmbeddedImageSection embeddedImageSection = directory$Section.embeddedImageSection;
                            SearchCommonPlaceholderSection searchCommonPlaceholderSection = directory$Section.searchCommonPlaceholderSection;
                            SearchCommonMessageSection searchCommonMessageSection = directory$Section.searchMessageSection;
                            TileSection tileSection = directory$Section.tileSection;
                            Long l = directory$Section.maxDisplayItems;
                            Section.Layout layout = directory$Section.layout;
                            Color color = directory$Section.backgroundColor;
                            boolean z2 = directory$Section.isMultiPathGroup;
                            Boolean bool = directory$Section.renderSectionDivider;
                            str3.getClass();
                            type2.getClass();
                            List listOf = CollectionsKt__CollectionsJVMKt.listOf(new Directory$Section(str3, str4, text, text2, text3, plus, type2, text4, str5, button, button2, tapAction, placeholderSection, embeddedImageSection, searchCommonPlaceholderSection, searchCommonMessageSection, tileSection, l, layout, color, z2, bool));
                            String str6 = searchResults.errorMessage;
                            listOf.getClass();
                            searchResults = new SearchResults(listOf, str6, str2);
                        }
                    }
                    searchResults3 = null;
                }
                productSearchPresenter$performSearch$1.L$0 = state4;
                productSearchPresenter$performSearch$1.L$2 = searchResults3;
                productSearchPresenter$performSearch$1.L$3 = searchResults2;
                productSearchPresenter$performSearch$1.L$4 = searchResults;
                productSearchPresenter$performSearch$1.label = 2;
                RewardSlotQueries rewardSlotQueries = realProductSearchRepository.productsSearchQueries;
                rewardSlotQueries.transactionWithWrapper(new BottomSheet$$ExternalSyntheticLambda3(5, rewardSlotQueries, searchResults));
                if (Unit.INSTANCE != obj) {
                    state2 = state4;
                    searchResults4 = searchResults;
                    if (state2.isLoadingNextPage) {
                    }
                    productSearchPresenter$performSearch$1.L$0 = state2;
                    productSearchPresenter$performSearch$1.L$2 = null;
                    productSearchPresenter$performSearch$1.L$3 = null;
                    productSearchPresenter$performSearch$1.L$4 = searchResults4;
                    productSearchPresenter$performSearch$1.label = 3;
                    obj2 = productSearchPresenter.toViewModel(state2, searchResults4, z, productSearchPresenter$performSearch$1);
                    if (obj2 != obj) {
                    }
                }
                return obj;
            }
        }
        productSearchPresenter$performSearch$1 = new ProductSearchPresenter$performSearch$1(productSearchPresenter, continuationImpl);
        Object obj22 = productSearchPresenter$performSearch$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = productSearchPresenter$performSearch$1.label;
        if (i != 0) {
        }
        searchResults2 = (SearchResults) search;
        if (state4.isLoadingNextPage) {
        }
        productSearchPresenter$performSearch$1.L$0 = state4;
        productSearchPresenter$performSearch$1.L$2 = searchResults3;
        productSearchPresenter$performSearch$1.L$3 = searchResults2;
        productSearchPresenter$performSearch$1.L$4 = searchResults;
        productSearchPresenter$performSearch$1.label = 2;
        RewardSlotQueries rewardSlotQueries2 = realProductSearchRepository.productsSearchQueries;
        rewardSlotQueries2.transactionWithWrapper(new BottomSheet$$ExternalSyntheticLambda3(5, rewardSlotQueries2, searchResults));
        if (Unit.INSTANCE != obj) {
        }
        return obj;
    }

    public static final boolean access$tryRoute(ProductSearchPresenter productSearchPresenter, String str) {
        ClientRoute tryParse;
        if (str == null || (tryParse = ClientRouteParserKt.tryParse(productSearchPresenter.clientRouteParser, str)) == null) {
            return false;
        }
        if (tryParse instanceof ClientRoute.ViewShopSearchFilters) {
            return true;
        }
        return productSearchPresenter.router.route(new RoutingParams(productSearchPresenter.args, null, null, null, null, null, 510), str);
    }

    public static ArrayList toFiltersProto(List list) {
        Filter filter;
        List<ShoppingScreen$Filter> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (ShoppingScreen$Filter shoppingScreen$Filter : list2) {
            if (shoppingScreen$Filter instanceof ShoppingScreen$Filter.PriceRange) {
                ShoppingScreen$Filter.PriceRange priceRange = (ShoppingScreen$Filter.PriceRange) shoppingScreen$Filter;
                String str = priceRange.name;
                IntRange intRange = priceRange.selectedRange;
                filter = new Filter(str, new Filter$Option$PriceRange(new PriceRange(intRange.first, intRange.last, ByteString.EMPTY)));
            } else if (shoppingScreen$Filter instanceof ShoppingScreen$Filter.Selections) {
                ShoppingScreen$Filter.Selections selections = (ShoppingScreen$Filter.Selections) shoppingScreen$Filter;
                filter = new Filter(selections.name, new Filter$Option$SelectionList(new SelectionList(CollectionsKt.toList(selections.selectedOptions), ByteString.EMPTY)));
            } else {
                if (!(shoppingScreen$Filter instanceof ShoppingScreen$Filter.Toggle)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                ShoppingScreen$Filter.Toggle toggle = (ShoppingScreen$Filter.Toggle) shoppingScreen$Filter;
                filter = new Filter(toggle.name, new Filter$Option$Toggle(toggle.toggled));
            }
            arrayList.add(filter);
        }
        return arrayList;
    }

    public final void ProductSearchEffect(State state, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(619874045);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(this) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Boolean valueOf = Boolean.valueOf(state.isInitialState);
            String str = state.searchText;
            Integer valueOf2 = Integer.valueOf(state.retryCount);
            boolean changedInstance = gapComposer.changedInstance(state) | ((i2 & 112) == 32) | gapComposer.changedInstance(this);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ProductSearchPresenter$ProductSearchEffect$1$1(state, this, function1, null);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(valueOf, str, valueOf2, (Function2) rememberedValue, gapComposer);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda9((Object) this, (Object) state, function1, i, 28);
        }
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        ProductSearchPresenter productSearchPresenter = this;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1742716440);
        Object rememberedValue = gapComposer.rememberedValue();
        String str = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        Object obj = Composer.Companion.Empty;
        Object obj2 = rememberedValue;
        if (rememberedValue == obj) {
            ShoppingScreen$ProductSearchScreen shoppingScreen$ProductSearchScreen = productSearchPresenter.args;
            Object mutableStateOf$default = Updater.mutableStateOf$default(new State(new ProductSearchViewModel.Loading(shoppingScreen$ProductSearchScreen.searchText, !shoppingScreen$ProductSearchScreen.filters.isEmpty(), true), shoppingScreen$ProductSearchScreen.filters, true, true, false, false, false, false, 0, shoppingScreen$ProductSearchScreen.searchText, new SearchResults(6, str, z3 ? 1 : 0, EmptyList.INSTANCE)));
            gapComposer.updateRememberedValue(mutableStateOf$default);
            obj2 = mutableStateOf$default;
        }
        MutableState mutableState = (MutableState) obj2;
        Object rememberedValue2 = gapComposer.rememberedValue();
        Object obj3 = rememberedValue2;
        if (rememberedValue2 == obj) {
            Object derivedStateOf = Updater.derivedStateOf(new OverlayKt$$ExternalSyntheticLambda1(productSearchPresenter, mutableState));
            gapComposer.updateRememberedValue(derivedStateOf);
            obj3 = derivedStateOf;
        }
        androidx.compose.runtime.State state = (androidx.compose.runtime.State) obj3;
        Updater.LaunchedEffect(gapComposer, flow, new RealQrCodesPresenter$models$1$1(flow, (Continuation) (z2 ? 1 : 0), (Object) productSearchPresenter, (Object) mutableState, 26));
        Boolean valueOf = Boolean.valueOf(((State) mutableState.getValue()).isLoadingNextPage);
        boolean changedInstance = gapComposer.changedInstance(productSearchPresenter);
        Object rememberedValue3 = gapComposer.rememberedValue();
        ProductSearchPresenter productSearchPresenter2 = productSearchPresenter;
        if (changedInstance || rememberedValue3 == obj) {
            Object realQrCodesPresenter$models$1$1 = new RealQrCodesPresenter$models$1$1(27, mutableState, state, (MoleculePresenter) productSearchPresenter, (Continuation) (z ? 1 : 0));
            productSearchPresenter2 = productSearchPresenter;
            gapComposer.updateRememberedValue(realQrCodesPresenter$models$1$1);
            rememberedValue3 = realQrCodesPresenter$models$1$1;
        }
        Updater.LaunchedEffect(gapComposer, valueOf, (Function2) rememberedValue3);
        Boolean valueOf2 = Boolean.valueOf(((State) mutableState.getValue()).isRestoringState);
        boolean changedInstance2 = gapComposer.changedInstance(productSearchPresenter2);
        Object rememberedValue4 = gapComposer.rememberedValue();
        Object obj4 = rememberedValue4;
        if (changedInstance2 || rememberedValue4 == obj) {
            Object poolsListPresenter$models$2$2 = new PoolsListPresenter$models$2$2(productSearchPresenter2, mutableState, null);
            gapComposer.updateRememberedValue(poolsListPresenter$models$2$2);
            obj4 = poolsListPresenter$models$2$2;
        }
        Updater.LaunchedEffect(gapComposer, valueOf2, (Function2) obj4);
        State state2 = (State) mutableState.getValue();
        Object rememberedValue5 = gapComposer.rememberedValue();
        Object obj5 = rememberedValue5;
        if (rememberedValue5 == obj) {
            Object tabToolbarsKt$$ExternalSyntheticLambda10 = new TabToolbarsKt$$ExternalSyntheticLambda10(8, mutableState);
            gapComposer.updateRememberedValue(tabToolbarsKt$$ExternalSyntheticLambda10);
            obj5 = tabToolbarsKt$$ExternalSyntheticLambda10;
        }
        productSearchPresenter2.ProductSearchEffect(state2, (Function1) obj5, gapComposer, ((i << 3) & 896) | 48);
        ProductSearchViewModel productSearchViewModel = ((State) mutableState.getValue()).viewModel;
        gapComposer.end(false);
        return productSearchViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object toViewModel(State state, SearchResults searchResults, boolean z, ContinuationImpl continuationImpl) {
        ProductSearchPresenter$toViewModel$1 productSearchPresenter$toViewModel$1;
        int i;
        boolean z2;
        String str;
        SearchResults searchResults2;
        int i2;
        if (continuationImpl instanceof ProductSearchPresenter$toViewModel$1) {
            productSearchPresenter$toViewModel$1 = (ProductSearchPresenter$toViewModel$1) continuationImpl;
            int i3 = productSearchPresenter$toViewModel$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                productSearchPresenter$toViewModel$1.label = i3 - PKIFailureInfo.systemUnavail;
                ProductSearchPresenter$toViewModel$1 productSearchPresenter$toViewModel$12 = productSearchPresenter$toViewModel$1;
                Object obj = productSearchPresenter$toViewModel$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = productSearchPresenter$toViewModel$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str2 = state.searchText;
                    int i4 = !state.filters.isEmpty() ? 1 : 0;
                    boolean shouldShowFilters = state.viewModel.getShouldShowFilters();
                    String str3 = searchResults.paginationToken;
                    ShopHubResultsListItem.ProgressIndicator progressIndicator = ((str3 == null || StringsKt.isBlank(str3)) == true || z) ? null : ShopHubResultsListItem.ProgressIndicator.INSTANCE;
                    productSearchPresenter$toViewModel$12.L$1 = searchResults;
                    productSearchPresenter$toViewModel$12.L$2 = str2;
                    productSearchPresenter$toViewModel$12.I$0 = i4;
                    productSearchPresenter$toViewModel$12.Z$1 = shouldShowFilters;
                    productSearchPresenter$toViewModel$12.label = 1;
                    Serializable mapSections = EmojiExclusions.mapSections(searchResults, this.stringManager, true, this.recentSearchManager, progressIndicator, productSearchPresenter$toViewModel$12);
                    if (mapSections == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    z2 = shouldShowFilters;
                    str = str2;
                    searchResults2 = searchResults;
                    i2 = i4;
                    obj = mapSections;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z3 = productSearchPresenter$toViewModel$12.Z$1;
                    i2 = productSearchPresenter$toViewModel$12.I$0;
                    String str4 = productSearchPresenter$toViewModel$12.L$2;
                    SearchResults searchResults3 = productSearchPresenter$toViewModel$12.L$1;
                    SafeTrace.throwOnFailure(obj);
                    z2 = z3;
                    str = str4;
                    searchResults2 = searchResults3;
                }
                List list = (List) obj;
                String str5 = searchResults2.errorMessage;
                return new ProductSearchViewModel.Loaded(str, i2 == 0, z2, list, str5 != null ? new ProductSearchViewModel.Loaded.Error(str5) : null);
            }
        }
        productSearchPresenter$toViewModel$1 = new ProductSearchPresenter$toViewModel$1(this, continuationImpl);
        ProductSearchPresenter$toViewModel$1 productSearchPresenter$toViewModel$122 = productSearchPresenter$toViewModel$1;
        Object obj2 = productSearchPresenter$toViewModel$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = productSearchPresenter$toViewModel$122.label;
        if (i != 0) {
        }
        List list2 = (List) obj2;
        String str52 = searchResults2.errorMessage;
        return new ProductSearchViewModel.Loaded(str, i2 == 0, z2, list2, str52 != null ? new ProductSearchViewModel.Loaded.Error(str52) : null);
    }
}

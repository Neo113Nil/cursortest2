package com.squareup.cash.investing.presenters.search;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.navigation.compose.NavHostKt$NavHost$33$1;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.cdf.stock.ScreenSource;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.profile.RealProfileManager$profileOrNull$2;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.backend.real.RealInvestmentEntities;
import com.squareup.cash.investing.backend.real.analytics.RealInvestingAnalytics;
import com.squareup.cash.investing.backend.real.categories.RealCategoryBackend;
import com.squareup.cash.investing.presenters.FilterConfigurationCacheMap;
import com.squareup.cash.investing.primitives.CategoryToken;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.search.FilterGroupCarousel;
import com.squareup.cash.investing.viewmodels.search.InvestingSearchViewEvent;
import com.squareup.cash.investing.viewmodels.search.InvestingSearchViewModel;
import com.squareup.cash.invitations.InviteContactsPresenter$special$$inlined$map$1;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.moneybot.genie.GenieViewKt$GenieView$1$1;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter$models$6$1;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.nearby.views.DotGridKt$DotGrid$3$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.cache.Cache;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__CollectionKt;
import kotlinx.coroutines.flow.StartedLazily$command$$inlined$unsafeFlow$1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class InvestingSearchPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final RealCategoryBackend categoryBackend;
    public final FilterConfigurationCacheMap categoryFilterConfigurationCacheMap;
    public final CategoryToken categoryToken;
    public final CashAccountDatabaseImpl database;
    public final Cache filterConfigurationCache;
    public final RealInvestingAnalytics investingAnalytics;
    public final RealInvestmentEntities investmentEntities;
    public final CoroutineContext ioDispatcher;
    public final IntentLauncher launcher;
    public final MoneyFormatter moneyFormatter;
    public final BetterNavigator.ScreenNavigator navigator;
    public final boolean showKeypad;
    public final AndroidStringManager stringManager;

    public InvestingSearchPresenter(Cache cache, FilterConfigurationCacheMap filterConfigurationCacheMap, RealCategoryBackend realCategoryBackend, AndroidStringManager androidStringManager, RealInvestingAnalytics realInvestingAnalytics, Analytics analytics, RealInvestmentEntities realInvestmentEntities, CashAccountDatabaseImpl cashAccountDatabaseImpl, IntentLauncher intentLauncher, LocalizedMoneyFormatter.Factory factory, CoroutineContext coroutineContext, CategoryToken categoryToken, BetterNavigator.ScreenNavigator screenNavigator, boolean z) {
        this.categoryFilterConfigurationCacheMap = filterConfigurationCacheMap;
        this.categoryBackend = realCategoryBackend;
        this.stringManager = androidStringManager;
        this.investingAnalytics = realInvestingAnalytics;
        this.analytics = analytics;
        this.investmentEntities = realInvestmentEntities;
        this.database = cashAccountDatabaseImpl;
        this.launcher = intentLauncher;
        this.ioDispatcher = coroutineContext;
        this.categoryToken = categoryToken;
        this.navigator = screenNavigator;
        this.showKeypad = z;
        this.moneyFormatter = factory.create(MoneyFormatterConfig.COMPACT);
        this.filterConfigurationCache = categoryToken != null ? filterConfigurationCacheMap.getCache(categoryToken) : cache;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$filterGroupCarousels(InvestingSearchPresenter investingSearchPresenter, Collection collection, Collection collection2, ColorModel colorModel, ContinuationImpl continuationImpl) {
        InvestingSearchPresenter$filterGroupCarousels$1 investingSearchPresenter$filterGroupCarousels$1;
        int i;
        if (continuationImpl instanceof InvestingSearchPresenter$filterGroupCarousels$1) {
            investingSearchPresenter$filterGroupCarousels$1 = (InvestingSearchPresenter$filterGroupCarousels$1) continuationImpl;
            int i2 = investingSearchPresenter$filterGroupCarousels$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                investingSearchPresenter$filterGroupCarousels$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = investingSearchPresenter$filterGroupCarousels$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = investingSearchPresenter$filterGroupCarousels$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (collection.isEmpty()) {
                        return new FilterGroupCarousel(EmptyList.INSTANCE);
                    }
                    RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 flatMapConcat = FlowKt.flatMapConcat(new DotGridKt$DotGrid$3$1(collection2, investingSearchPresenter, colorModel, (Continuation) null, 13), new StartedLazily$command$$inlined$unsafeFlow$1(collection, 3));
                    investingSearchPresenter$filterGroupCarousels$1.label = 1;
                    obj = FlowKt__CollectionKt.toCollection(flatMapConcat, new ArrayList(), investingSearchPresenter$filterGroupCarousels$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return new FilterGroupCarousel((List) obj);
            }
        }
        investingSearchPresenter$filterGroupCarousels$1 = new InvestingSearchPresenter$filterGroupCarousels$1(investingSearchPresenter, continuationImpl);
        Object obj2 = investingSearchPresenter$filterGroupCarousels$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = investingSearchPresenter$filterGroupCarousels$1.label;
        if (i != 0) {
        }
        return new FilterGroupCarousel((List) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$handleCategoryClicked(InvestingSearchPresenter investingSearchPresenter, InvestingSearchViewEvent.CategoryClicked categoryClicked, ContinuationImpl continuationImpl) {
        InvestingSearchPresenter$handleCategoryClicked$1 investingSearchPresenter$handleCategoryClicked$1;
        int i;
        if (continuationImpl instanceof InvestingSearchPresenter$handleCategoryClicked$1) {
            investingSearchPresenter$handleCategoryClicked$1 = (InvestingSearchPresenter$handleCategoryClicked$1) continuationImpl;
            int i2 = investingSearchPresenter$handleCategoryClicked$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                investingSearchPresenter$handleCategoryClicked$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = investingSearchPresenter$handleCategoryClicked$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = investingSearchPresenter$handleCategoryClicked$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealInvestingAnalytics realInvestingAnalytics = investingSearchPresenter.investingAnalytics;
                    CategoryToken categoryToken = categoryClicked.token;
                    ScreenSource screenSource = ScreenSource.INVEST_SEARCH;
                    investingSearchPresenter$handleCategoryClicked$1.L$0 = categoryClicked;
                    investingSearchPresenter$handleCategoryClicked$1.label = 1;
                    if (realInvestingAnalytics.trackStockSelectCategory(categoryToken, screenSource, null, investingSearchPresenter$handleCategoryClicked$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    categoryClicked = investingSearchPresenter$handleCategoryClicked$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                investingSearchPresenter.navigator.goTo(new InvestingScreens.CategoryDetailScreen(categoryClicked.token));
                return Unit.INSTANCE;
            }
        }
        investingSearchPresenter$handleCategoryClicked$1 = new InvestingSearchPresenter$handleCategoryClicked$1(investingSearchPresenter, continuationImpl);
        Object obj2 = investingSearchPresenter$handleCategoryClicked$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = investingSearchPresenter$handleCategoryClicked$1.label;
        if (i != 0) {
        }
        investingSearchPresenter.navigator.goTo(new InvestingScreens.CategoryDetailScreen(categoryClicked.token));
        return Unit.INSTANCE;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final InvestingSearchViewModel models(Flow flow, Composer composer, int i) {
        GapComposer gapComposer;
        MutableState mutableState;
        flow.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startReplaceGroup(1808998493);
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Continuation continuation = null;
        CategoryToken categoryToken = this.categoryToken;
        if (categoryToken == null) {
            gapComposer2.startReplaceGroup(-1375410884);
            boolean changedInstance = gapComposer2.changedInstance(this);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new RealProfileManager$profileOrNull$2(this, continuation, 29);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer2, this, (Function2) rememberedValue);
            gapComposer2.end(false);
        } else {
            gapComposer2.startReplaceGroup(-1375248475);
            gapComposer2.end(false);
        }
        Object obj = ColorModel.Investing.INSTANCE;
        if (categoryToken == null) {
            gapComposer2.startReplaceGroup(-1374981627);
            gapComposer2.end(false);
            gapComposer = gapComposer2;
        } else {
            gapComposer2.startReplaceGroup(-1374935499);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = FlowKt.distinctUntilChanged(new InviteContactsPresenter$special$$inlined$map$1(FlowKt.take(this.categoryBackend.categoryDetails(categoryToken), 1), this, 11));
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            gapComposer = gapComposer2;
            obj = (ColorModel) Updater.collectAsState((Flow) rememberedValue2, obj, null, gapComposer2, 0, 2).getValue();
            gapComposer.end(false);
        }
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            EmptyList emptyList = EmptyList.INSTANCE;
            rememberedValue3 = Updater.mutableStateOf$default(new InvestingSearchViewModel("", new FilterGroupCarousel(emptyList), emptyList, this.showKeypad));
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState2 = (MutableState) rememberedValue3;
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = Updater.mutableStateOf$default("");
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState mutableState3 = (MutableState) rememberedValue4;
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == neverEqualPolicy) {
            Object obj2 = (Map) this.filterConfigurationCache.cache;
            if (obj2 == null) {
                obj2 = EmptyMap.INSTANCE;
                obj2.getClass();
            }
            rememberedValue5 = Updater.mutableStateOf$default(obj2);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        MutableState mutableState4 = (MutableState) rememberedValue5;
        Map map = (Map) mutableState4.getValue();
        boolean changedInstance2 = gapComposer.changedInstance(this);
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue6 == neverEqualPolicy) {
            rememberedValue6 = new GenieViewKt$GenieView$1$1(this, mutableState4, continuation, 3);
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        Updater.LaunchedEffect(gapComposer, map, (Function2) rememberedValue6);
        Object obj3 = obj;
        Updater.LaunchedEffect(gapComposer, flow, new MoneybotChatPresenter$models$6$1(flow, (Continuation) null, this, mutableState4, mutableState3, obj3, 11));
        Map map2 = (Map) mutableState4.getValue();
        String str = (String) mutableState3.getValue();
        boolean changedInstance3 = gapComposer.changedInstance(this) | gapComposer.changed(obj3);
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (changedInstance3 || rememberedValue7 == neverEqualPolicy) {
            mutableState = mutableState2;
            NavHostKt$NavHost$33$1 navHostKt$NavHost$33$1 = new NavHostKt$NavHost$33$1(this, mutableState4, obj3, mutableState3, mutableState, (Continuation) null, 11);
            gapComposer.updateRememberedValue(navHostKt$NavHost$33$1);
            rememberedValue7 = navHostKt$NavHost$33$1;
        } else {
            mutableState = mutableState2;
        }
        Updater.LaunchedEffect(map2, str, obj3, (Function2) rememberedValue7, gapComposer);
        InvestingSearchViewModel investingSearchViewModel = (InvestingSearchViewModel) mutableState.getValue();
        gapComposer.end(false);
        return investingSearchViewModel;
    }
}

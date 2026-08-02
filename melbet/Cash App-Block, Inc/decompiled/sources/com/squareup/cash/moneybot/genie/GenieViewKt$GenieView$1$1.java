package com.squareup.cash.moneybot.genie;

import androidx.camera.camera2.pipe.AeMode;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.text.MultiParagraph$$ExternalSyntheticLambda0;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.sqldelight.db.QueryResult;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.cdf.app.AppNavigateOpenSpace;
import com.squareup.cash.cdf.limits.LimitsBrowseScreen;
import com.squareup.cash.cdf.money.MoneySelectAction;
import com.squareup.cash.cdf.stock.StockViewViewCategory;
import com.squareup.cash.common.messaging.screens.FailureMessageScreen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.db2.contacts.ContactQueries;
import com.squareup.cash.genie.backend.real.GenieLogger;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.backend.api.data.Category;
import com.squareup.cash.investing.backend.real.analytics.RealInvestingAnalytics;
import com.squareup.cash.investing.db.Investing_news_article;
import com.squareup.cash.investing.presenters.search.InvestingSearchPresenter;
import com.squareup.cash.investing.presenters.teengraduation.StocksTransferEtaSheetPresenter;
import com.squareup.cash.investing.primitives.CategoryToken;
import com.squareup.cash.investing.primitives.InvestingState;
import com.squareup.cash.investing.primitives.NewsKind;
import com.squareup.cash.investingcrypto.presenters.news.DuplicateNewsKeyError;
import com.squareup.cash.marketing.components.TooltipState;
import com.squareup.cash.marketing.components.TooltipState$hide$1;
import com.squareup.cash.merchant.backend.api.BlockedBusinessesUiConfig;
import com.squareup.cash.merchant.screens.MerchantScreen$MerchantBlockingScreen;
import com.squareup.cash.merchant.views.MerchantBlockingViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.money.analytics.MoneyAnalyticsItem;
import com.squareup.cash.money.analytics.MoneyAnalyticsSection;
import com.squareup.cash.money.analytics.MoneyAnalyticsSectionItem;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.analytics.RealMoneyAnalyticsContext;
import com.squareup.cash.money.analytics.RealMoneyAnalyticsService;
import com.squareup.cash.money.applets.sections.AppletTileItem;
import com.squareup.cash.money.applets.sections.AppletTilePresentation;
import com.squareup.cash.money.applets.sections.AppletTileSectionProvider;
import com.squareup.cash.money.applets.sections.PromotedAppletValidationError;
import com.squareup.cash.money.applets.sections.RealMoneyContentSpanTrackingService;
import com.squareup.cash.money.core.ids.AppletId;
import com.squareup.cash.money.core.ids.AppletTileUninstallationSectionId;
import com.squareup.cash.money.core.ids.ItemId;
import com.squareup.cash.money.core.ids.SectionId;
import com.squareup.cash.money.presenters.MoneyTabPresenter;
import com.squareup.cash.money.presenters.MoneyTabPresenter$models$7$1;
import com.squareup.cash.money.viewmodels.MoneyTabEvent;
import com.squareup.cash.money.viewmodels.api.Item;
import com.squareup.cash.money.viewmodels.api.Section;
import com.squareup.cash.money.viewmodels.api.ViewModel;
import com.squareup.cash.moneybot.backend.api.managers.ChatSession;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter;
import com.squareup.cash.moneybot.presenters.MoneybotHomePresenter;
import com.squareup.cash.moneybot.viewmodels.MoneybotHomeViewModel;
import com.squareup.cash.moneybot.viewmodels.RecentChatHistoryViewModel$Loaded;
import com.squareup.cash.moneybot.viewmodels.chat.MemoryTooltip;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewEvent;
import com.squareup.cash.moneybot.viewmodels.chat.ProcessingIndicator;
import com.squareup.cash.moneybot.viewmodels.plugins.PromptButtonListViewEvent;
import com.squareup.cash.moneybot.widgets.KeyboardState;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.music.presenters.MusicPresenter$models$2$1;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.offers.backend.api.BusinessToken;
import com.squareup.cash.offers.backend.api.OffersItemToken;
import com.squareup.cash.offers.backend.api.OffersTabRepository$SearchSource;
import com.squareup.cash.offers.backend.real.RealOffersSheetRepository;
import com.squareup.cash.offers.backend.real.RealOffersTabRefresher;
import com.squareup.cash.offers.backend.real.RealOffersTabRepository;
import com.squareup.cash.offers.db.OffersHomeQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.offers.db.OffersItemTokenType;
import com.squareup.cash.offers.presenters.RealOffersAnalytics;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import com.squareup.protos.cash.cashsuggest.api.OffersTabCollectionResponse;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.OfferType;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import papa.SafeTrace;
import xyz.block.genie.GenieLogLevel;
import xyz.block.protos.genie.ViewPlan;

/* loaded from: classes6.dex */
public final class GenieViewKt$GenieView$1$1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object $logger;
    public final /* synthetic */ Object $plan;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenieViewKt$GenieView$1$1(Result result, GenieLogger genieLogger, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 16;
        this.$plan = result;
        this.$logger = genieLogger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$plan;
        switch (i) {
            case 0:
                return new GenieViewKt$GenieView$1$1((GenieLogger) this.$logger, (ViewPlan) obj2, continuation, 0);
            case 1:
                return new GenieViewKt$GenieView$1$1((DisclosurePresenter) this.$logger, (Category) obj2, continuation, 1);
            case 2:
                return new GenieViewKt$GenieView$1$1((CardStudioPresenter) this.$logger, (Screen) obj2, continuation, 2);
            case 3:
                return new GenieViewKt$GenieView$1$1((InvestingSearchPresenter) this.$logger, (MutableState) obj2, continuation, 3);
            case 4:
                return new GenieViewKt$GenieView$1$1((StocksTransferEtaSheetPresenter) this.$logger, (InvestingState.Content.BrokerageAccountState) obj2, continuation, 4);
            case 5:
                return new GenieViewKt$GenieView$1$1((StocksTransferEtaSheetPresenter) this.$logger, (InvestingState.Content.BrokerageAccountState) obj2, continuation, 5);
            case 6:
                GenieViewKt$GenieView$1$1 genieViewKt$GenieView$1$1 = new GenieViewKt$GenieView$1$1((MoneybotHomePresenter) obj2, continuation, 6);
                genieViewKt$GenieView$1$1.$logger = obj;
                return genieViewKt$GenieView$1$1;
            case 7:
                return new GenieViewKt$GenieView$1$1((EglCore) this.$logger, (List) obj2, continuation, 7);
            case 8:
                return new GenieViewKt$GenieView$1$1((LimitsBrowseScreen.ScreenType) this.$logger, (MusicPresenter) obj2, continuation, 8);
            case 9:
                return new GenieViewKt$GenieView$1$1((MutableState) this.$logger, (LocalCashBalancePresenter) obj2, continuation, 9);
            case 10:
                return new GenieViewKt$GenieView$1$1((AppletTileSectionProvider) this.$logger, (AppletId) obj2, continuation, 10);
            case 11:
                return new GenieViewKt$GenieView$1$1((List) this.$logger, (ErrorReporter) obj2, continuation, 11);
            case 12:
                return new GenieViewKt$GenieView$1$1((MoneyTabPresenter) this.$logger, (List) obj2, continuation, 12);
            case 13:
                GenieViewKt$GenieView$1$1 genieViewKt$GenieView$1$12 = new GenieViewKt$GenieView$1$1((MoneyTabPresenter) obj2, continuation, 13);
                genieViewKt$GenieView$1$12.$logger = obj;
                return genieViewKt$GenieView$1$12;
            case 14:
                return new GenieViewKt$GenieView$1$1((MoneyTabPresenter) this.$logger, (MutableState) obj2, continuation, 14);
            case 15:
                return new GenieViewKt$GenieView$1$1((MoneyTabPresenter) this.$logger, (MoneyTabEvent) obj2, continuation, 15);
            case 16:
                return new GenieViewKt$GenieView$1$1((Result) obj2, (GenieLogger) this.$logger, continuation);
            case 17:
                GenieViewKt$GenieView$1$1 genieViewKt$GenieView$1$13 = new GenieViewKt$GenieView$1$1((MoneybotChatPresenter) obj2, continuation, 17);
                genieViewKt$GenieView$1$13.$logger = obj;
                return genieViewKt$GenieView$1$13;
            case 18:
                return new GenieViewKt$GenieView$1$1((KeyboardState) this.$logger, (Function1) obj2, continuation, 18);
            case 19:
                return new GenieViewKt$GenieView$1$1((MoneybotHomeViewModel.WidgetCard) this.$logger, (Function1) obj2, continuation, 19);
            case 20:
                return new GenieViewKt$GenieView$1$1((MoneybotHomeViewModel.NextBestAction) this.$logger, (Function1) obj2, continuation, 20);
            case 21:
                return new GenieViewKt$GenieView$1$1((RecentChatHistoryViewModel$Loaded) this.$logger, (MutableState) obj2, continuation, 21);
            case 22:
                return new GenieViewKt$GenieView$1$1((MemoryTooltip) this.$logger, (TooltipState) obj2, continuation, 22);
            case 23:
                return new GenieViewKt$GenieView$1$1((Function1) this.$logger, (PromptButtonListViewEvent) obj2, continuation, 23);
            case 24:
                return new GenieViewKt$GenieView$1$1((ProcessingIndicator) this.$logger, (MutableState) obj2, continuation, 24);
            case 25:
                return new GenieViewKt$GenieView$1$1((RealObservabilityManager) this.$logger, (Map) obj2, continuation, 25);
            case 26:
                return new GenieViewKt$GenieView$1$1((RealOffersSheetRepository) this.$logger, (OfferType) obj2, continuation, 26);
            case 27:
                return new GenieViewKt$GenieView$1$1((RealOffersTabRefresher) this.$logger, (OffersTabRepository$SearchSource) obj2, continuation, 27);
            case 28:
                return new GenieViewKt$GenieView$1$1((RealOffersTabRepository) this.$logger, (OffersItemToken) obj2, continuation, 28);
            default:
                return new GenieViewKt$GenieView$1$1((MutableState) this.$logger, (LocalCashBalancePresenter) obj2, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((GenieViewKt$GenieView$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:310:0x067c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0663  */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r18v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v29, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v15, types: [com.squareup.cash.money.core.ids.ItemId, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17, types: [int] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        BlockedBusinessesUiConfig.ErrorMessage errorMessage;
        boolean z;
        boolean z2;
        int i;
        int i2;
        boolean z3;
        AppletTileItem appletTileItem;
        List list;
        Throwable m4120exceptionOrNullimpl;
        OffersItemTokenType offersItemTokenType;
        OffersTabCollectionResponse offersTabCollectionResponse;
        AnalyticsEvent analyticsEvent;
        boolean z4 = false;
        boolean z5 = true;
        Continuation continuation = null;
        switch (this.$r8$classId) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (((GenieLogger) this.$logger) != null) {
                    GenieLogger.log(GenieLogLevel.ERROR, "Initial view slug `" + ((ViewPlan) this.$plan).initial_view_slug + "` was not found in ViewPlan.view_entries. Nothing will be rendered.");
                }
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                DisclosurePresenter disclosurePresenter = (DisclosurePresenter) this.$logger;
                RealInvestingAnalytics realInvestingAnalytics = (RealInvestingAnalytics) disclosurePresenter.stringManager;
                CategoryToken categoryToken = (CategoryToken) disclosurePresenter.launcher;
                String str = ((Category) this.$plan).name;
                categoryToken.getClass();
                str.getClass();
                realInvestingAnalytics.analytics.track(new StockViewViewCategory(str), null);
                return Unit.INSTANCE;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((BetterNavigator.ScreenNavigator) ((CardStudioPresenter) this.$logger).navigator).goTo((Screen) this.$plan);
                return Unit.INSTANCE;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((InvestingSearchPresenter) this.$logger).filterConfigurationCache.set((Map) ((MutableState) this.$plan).getValue());
                return Unit.INSTANCE;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                AndroidDateFormatManager androidDateFormatManager = ((StocksTransferEtaSheetPresenter) this.$logger).dateFormatter;
                return androidDateFormatManager.getDateFormat("EEEE, MMMM d", androidDateFormatManager.clock.timeZone()).formatter.format(((InvestingState.Content.BrokerageAccountState.TransferInProgress) ((InvestingState.Content.BrokerageAccountState) this.$plan)).willCompleteAtUtc);
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                AndroidDateFormatManager androidDateFormatManager2 = ((StocksTransferEtaSheetPresenter) this.$logger).dateFormatter;
                return androidDateFormatManager2.getDateFormat("EEEE, MMMM d", androidDateFormatManager2.clock.timeZone()).formatter.format(((InvestingState.Content.BrokerageAccountState.TransferInProgress) ((InvestingState.Content.BrokerageAccountState) this.$plan)).willCompleteAtUtc);
            case 6:
                MoneybotHomePresenter moneybotHomePresenter = (MoneybotHomePresenter) this.$plan;
                NewsKind newsKind = (NewsKind) moneybotHomePresenter.failedToLoadHome$delegate;
                List list2 = (List) this.$logger;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                List<Investing_news_article> list3 = list2;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                for (Investing_news_article investing_news_article : list3) {
                    investing_news_article.getClass();
                    arrayList.add("provider=" + investing_news_article.provider + "-url=" + investing_news_article.url);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    String str2 = (String) next;
                    Object obj2 = linkedHashMap.get(str2);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap.put(str2, obj2);
                    }
                    ((List) obj2).add(next);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (((List) entry.getValue()).size() > 1) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                Set keySet = linkedHashMap2.keySet();
                if (!keySet.isEmpty()) {
                    moneybotHomePresenter.errorReporter.report(new DuplicateNewsKeyError(newsKind, keySet, Intrinsics.areEqual(newsKind, NewsKind.BitcoinPortfolio.INSTANCE) ? ErrorFeature.Bitcoin.INSTANCE : ErrorFeature.Investing.INSTANCE), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                }
                return Unit.INSTANCE;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                EglCore eglCore = (EglCore) this.$logger;
                ContactQueries contactQueries = (ContactQueries) eglCore.eglConfig;
                MerchantBlockingViewKt$$ExternalSyntheticLambda15 merchantBlockingViewKt$$ExternalSyntheticLambda15 = new MerchantBlockingViewKt$$ExternalSyntheticLambda15(27, (List) this.$plan, eglCore);
                contactQueries.getClass();
                contactQueries.transactionWithWrapper(merchantBlockingViewKt$$ExternalSyntheticLambda15);
                return Unit.INSTANCE;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                LimitsBrowseScreen.ScreenType screenType = (LimitsBrowseScreen.ScreenType) this.$logger;
                if (screenType != null) {
                    ((Analytics) ((MusicPresenter) this.$plan).musicPlayer).track(new LimitsBrowseScreen(screenType), null);
                }
                return Unit.INSTANCE;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState = (MutableState) this.$logger;
                BlockedBusinessesUiConfig blockedBusinessesUiConfig = (BlockedBusinessesUiConfig) mutableState.getValue();
                if (blockedBusinessesUiConfig != null && (errorMessage = blockedBusinessesUiConfig.errorMessage) != null) {
                    LocalCashBalancePresenter localCashBalancePresenter = (LocalCashBalancePresenter) this.$plan;
                    ((BetterNavigator.ScreenNavigator) localCashBalancePresenter.navigator).goTo(new FailureMessageScreen(errorMessage.title, errorMessage.message, errorMessage.buttonTitle, (MerchantScreen$MerchantBlockingScreen) localCashBalancePresenter.service, null, 16));
                    mutableState.setValue(null);
                }
                return Unit.INSTANCE;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealMoneyContentSpanTrackingService realMoneyContentSpanTrackingService = ((AppletTileSectionProvider) this.$logger).appletSpanTrackingService;
                AppletId appletId = (AppletId) this.$plan;
                appletId.getClass();
                realMoneyContentSpanTrackingService.startSpan(appletId, RealMoneyContentSpanTrackingService.AppletTileOperation.INSTALLATION_LOAD);
                return Unit.INSTANCE;
            case 11:
                ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
                ErrorReporter errorReporter = (ErrorReporter) this.$plan;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                List list4 = (List) this.$logger;
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    CollectionsKt__MutableCollectionsKt.addAll((Iterable) ((Pair) it2.next()).second, arrayList2);
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    Object next2 = it3.next();
                    if (((AppletTileItem) next2).presentation == AppletTilePresentation.Promoted) {
                        arrayList3.add(next2);
                    }
                }
                if (arrayList3.size() > 1) {
                    ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(((AppletTileItem) it4.next()).appletId);
                    }
                    errorReporter.report(new PromotedAppletValidationError("Multiple promoted applets found: " + arrayList4), defaultSamplingStrategy);
                }
                ArrayList arrayList5 = new ArrayList();
                for (Object obj3 : list4) {
                    if (((Pair) obj3).first == AppletTileUninstallationSectionId.DEFAULT) {
                        arrayList5.add(obj3);
                    }
                }
                ArrayList arrayList6 = new ArrayList();
                Iterator it5 = arrayList5.iterator();
                while (it5.hasNext()) {
                    CollectionsKt__MutableCollectionsKt.addAll((Iterable) ((Pair) it5.next()).second, arrayList6);
                }
                if (!arrayList6.isEmpty()) {
                    Iterator it6 = arrayList6.iterator();
                    while (it6.hasNext()) {
                        if (((AppletTileItem) it6.next()).appletId == AppletId.BANKING_BENEFITS) {
                            z = true;
                            if (!arrayList6.isEmpty()) {
                                Iterator it7 = arrayList6.iterator();
                                while (it7.hasNext()) {
                                    if (((AppletTileItem) it7.next()).appletId == AppletId.PROMOTED_BANKING_BENEFITS) {
                                        z2 = true;
                                        if (z && z2) {
                                            errorReporter.report(new PromotedAppletValidationError("BANKING_BENEFITS and PROMOTED_BANKING_BENEFITS both appear in DEFAULT section"), defaultSamplingStrategy);
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }
                            }
                            z2 = false;
                            if (z) {
                                errorReporter.report(new PromotedAppletValidationError("BANKING_BENEFITS and PROMOTED_BANKING_BENEFITS both appear in DEFAULT section"), defaultSamplingStrategy);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                }
                z = false;
                if (!arrayList6.isEmpty()) {
                }
                z2 = false;
                if (z) {
                }
                return Unit.INSTANCE;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealMoneyAnalyticsContext realMoneyAnalyticsContext = ((MoneyTabPresenter) this.$logger).moneyAnalyticsContentCache;
                List list5 = (List) this.$plan;
                ArrayList arrayList7 = new ArrayList(list5.size());
                int size = list5.size();
                int i3 = 0;
                while (i3 < size) {
                    Section section = (Section) list5.get(i3);
                    SectionId id = section.getId();
                    ?? viewModels = AeMode.Companion.viewModels(section);
                    ArrayList arrayList8 = new ArrayList(viewModels.size());
                    int size2 = ((Collection) viewModels).size();
                    ?? r7 = continuation;
                    for (?? r14 = z4; r14 < size2; r14++) {
                        ViewModel viewModel = (ViewModel) viewModels.get(r14);
                        boolean z6 = z5;
                        if (viewModel instanceof ViewModel.HeaderModel) {
                            list = CollectionsKt__CollectionsJVMKt.listOf(new MoneyAnalyticsSectionItem(r7, z4));
                            z3 = z4;
                            appletTileItem = r7;
                        } else {
                            if (!(viewModel instanceof ViewModel.ItemList)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return r7;
                            }
                            ?? r6 = ((ViewModel.ItemList) viewModel).items;
                            z3 = z4;
                            ArrayList arrayList9 = new ArrayList(r6.size());
                            int size3 = ((Collection) r6).size();
                            appletTileItem = r7;
                            for (?? r72 = z3; r72 < size3; r72++) {
                                Item item = (Item) r6.get(r72);
                                List list6 = list5;
                                ItemId id2 = item.getId();
                                int i4 = size3;
                                AppletTileItem appletTileItem2 = item instanceof AppletTileItem ? (AppletTileItem) item : appletTileItem;
                                arrayList9.add(new MoneyAnalyticsSectionItem(id2, (appletTileItem2 != null ? appletTileItem2.presentation : appletTileItem) == AppletTilePresentation.Promoted ? z6 : z3));
                                list5 = list6;
                                size3 = i4;
                            }
                            list = arrayList9;
                        }
                        List list7 = list5;
                        CollectionsKt__MutableCollectionsKt.addAll(list, arrayList8);
                        list5 = list7;
                        z5 = z6;
                        z4 = z3;
                        r7 = appletTileItem;
                    }
                    arrayList7.add(new MoneyAnalyticsSection(id, arrayList8));
                    i3++;
                    list5 = list5;
                    continuation = r7;
                }
                boolean z7 = z4;
                boolean z8 = z5;
                ?? r18 = continuation;
                synchronized (realMoneyAnalyticsContext) {
                    try {
                        ArrayList arrayList10 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList7, 10));
                        Iterator it8 = arrayList7.iterator();
                        while (it8.hasNext()) {
                            arrayList10.add(((MoneyAnalyticsSection) it8.next()).id);
                        }
                        realMoneyAnalyticsContext.sectionIds = arrayList10;
                        int size4 = arrayList7.size();
                        ArrayList arrayList11 = new ArrayList(size4);
                        for (int i5 = z7 ? 1 : 0; i5 < size4; i5++) {
                            arrayList11.add(Integer.valueOf(z7 ? 1 : 0));
                        }
                        Iterator it9 = arrayList7.iterator();
                        int i6 = z7 ? 1 : 0;
                        while (it9.hasNext()) {
                            Object next3 = it9.next();
                            int i7 = i6 + 1;
                            if (i6 < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                                throw r18;
                            }
                            if (i6 > 0) {
                                int i8 = i6 - 1;
                                int intValue = ((Number) arrayList11.get(i8)).intValue();
                                ArrayList arrayList12 = ((MoneyAnalyticsSection) arrayList7.get(i8)).items;
                                if (arrayList12.isEmpty()) {
                                    i2 = z7 ? 1 : 0;
                                } else {
                                    Iterator it10 = arrayList12.iterator();
                                    i2 = z7 ? 1 : 0;
                                    while (it10.hasNext()) {
                                        if (((MoneyAnalyticsSectionItem) it10.next()).id != null && (i2 = i2 + 1) < 0) {
                                            CollectionsKt__CollectionsKt.throwCountOverflow();
                                            throw r18;
                                        }
                                    }
                                }
                                arrayList11.set(i6, Integer.valueOf(intValue + i2));
                            }
                            i6 = i7;
                        }
                        realMoneyAnalyticsContext.sectionItemOffsets = arrayList11;
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        Iterator it11 = arrayList7.iterator();
                        int i9 = z7 ? 1 : 0;
                        int i10 = i9;
                        while (it11.hasNext()) {
                            Object next4 = it11.next();
                            int i11 = i9 + 1;
                            if (i9 < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                                throw r18;
                            }
                            if (i9 > 0) {
                                i10 += ((MoneyAnalyticsSection) arrayList7.get(i9 - 1)).items.size();
                            }
                            ArrayList arrayList13 = ((MoneyAnalyticsSection) arrayList7.get(i9)).items;
                            int i12 = z7 ? 1 : 0;
                            while (i12 >= 0 && i12 < arrayList13.size()) {
                                ItemId itemId = ((MoneyAnalyticsSectionItem) arrayList13.get(i12)).id;
                                if (itemId == null) {
                                    i12++;
                                } else {
                                    int i13 = i12 + 1;
                                    MoneyAnalyticsSectionItem moneyAnalyticsSectionItem = (MoneyAnalyticsSectionItem) CollectionsKt.getOrNull(i13, arrayList13);
                                    ItemId itemId2 = moneyAnalyticsSectionItem != null ? moneyAnalyticsSectionItem.id : r18;
                                    if (((MoneyAnalyticsSection) arrayList7.get(i9)).id == SectionId.APPLET_UNINSTALLED_EXPLORE_BUSINESS || ((MoneyAnalyticsSection) arrayList7.get(i9)).id == SectionId.APPLET_UNINSTALLED_EXPLORE) {
                                        ItemId[] itemIdArr = new ItemId[2];
                                        itemIdArr[z7 ? 1 : 0] = itemId;
                                        itemIdArr[z8 ? 1 : 0] = itemId2;
                                        List filterNotNull = ArraysKt___ArraysKt.filterNotNull(itemIdArr);
                                        linkedHashMap3.put(Integer.valueOf(i12 + i10), filterNotNull);
                                        if (((ArrayList) filterNotNull).size() == 2) {
                                            i12 = i13;
                                        }
                                    } else {
                                        linkedHashMap3.put(Integer.valueOf(i12 + i10), CollectionsKt__CollectionsJVMKt.listOf(itemId));
                                    }
                                    i12++;
                                }
                            }
                            i9 = i11;
                        }
                        realMoneyAnalyticsContext.itemIdsByIndexes = linkedHashMap3;
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                        Iterator it12 = arrayList7.iterator();
                        int i14 = z7 ? 1 : 0;
                        while (it12.hasNext()) {
                            Object next5 = it12.next();
                            int i15 = i14 + 1;
                            if (i14 < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                                throw r18;
                            }
                            int i16 = z7 ? 1 : 0;
                            for (MoneyAnalyticsSectionItem moneyAnalyticsSectionItem2 : ((MoneyAnalyticsSection) next5).items) {
                                ItemId itemId3 = moneyAnalyticsSectionItem2.id;
                                if (itemId3 != null) {
                                    linkedHashMap4.put(itemId3, new MoneyAnalyticsItem(itemId3, i16, i14, moneyAnalyticsSectionItem2.isPromoted));
                                    i16++;
                                }
                            }
                            i14 = i15;
                        }
                        realMoneyAnalyticsContext.itemsByIds = linkedHashMap4;
                        ArrayList arrayList14 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList7, 10));
                        Iterator it13 = arrayList7.iterator();
                        while (it13.hasNext()) {
                            ArrayList arrayList15 = ((MoneyAnalyticsSection) it13.next()).items;
                            if (arrayList15.isEmpty()) {
                                i = z7 ? 1 : 0;
                            } else {
                                Iterator it14 = arrayList15.iterator();
                                i = z7 ? 1 : 0;
                                while (it14.hasNext()) {
                                    if (((MoneyAnalyticsSectionItem) it14.next()).id != null && (i = i + 1) < 0) {
                                        CollectionsKt__CollectionsKt.throwCountOverflow();
                                        throw r18;
                                    }
                                }
                            }
                            arrayList14.add(Integer.valueOf(i));
                        }
                        realMoneyAnalyticsContext.sectionTotals = arrayList14;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return Unit.INSTANCE;
            case 13:
                CoroutineScope coroutineScope = (CoroutineScope) this.$logger;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MoneyTabPresenter moneyTabPresenter = (MoneyTabPresenter) this.$plan;
                JobKt.launch$default(coroutineScope, null, null, new MoneyTabPresenter$models$7$1(moneyTabPresenter, continuation, true ? 1 : 0), 3);
                RealMoneyAnalyticsService realMoneyAnalyticsService = (RealMoneyAnalyticsService) moneyTabPresenter.moneyAnalyticsService;
                realMoneyAnalyticsService.flowToken = re$$ExternalSyntheticOutline0.m();
                realMoneyAnalyticsService.viewItemsSet.clear();
                return Unit.INSTANCE;
            case 14:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MoneyAnalyticsService moneyAnalyticsService = ((MoneyTabPresenter) this.$logger).moneyAnalyticsService;
                MutableState mutableState2 = (MutableState) this.$plan;
                ((RealMoneyAnalyticsService) moneyAnalyticsService).analytics.track(new AppNavigateOpenSpace(((Boolean) mutableState2.getValue()).booleanValue() ? AppNavigateOpenSpace.Source.SWIPE : null, null, AppNavigateOpenSpace.Space.BANKING, null, EnumC0170g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE), null);
                mutableState2.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 15:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MoneyTabPresenter moneyTabPresenter2 = (MoneyTabPresenter) this.$logger;
                ((RealMoneyAnalyticsService) moneyTabPresenter2.moneyAnalyticsService).submitSelectItemEvent(ItemId.CARD.INSTANCE, null, MoneySelectAction.SWIPE);
                moneyTabPresenter2.navigator.goTo(new WalletHomeScreen(5, ((MoneyTabEvent.NavigateToWallet) ((MoneyTabEvent) this.$plan)).initialPaymentDevicePage, (String) null));
                return Unit.INSTANCE;
            case 16:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Result result = (Result) this.$plan;
                if (result != null && (m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(result.value)) != null && ((GenieLogger) this.$logger) != null) {
                    GenieLogger.log(GenieLogLevel.ERROR, "Failed to decode ViewSpec.view_node: " + m4120exceptionOrNullimpl);
                }
                return Unit.INSTANCE;
            case 17:
                ChatSession chatSession = (ChatSession) this.$logger;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (chatSession.getChat() != null) {
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState = ((MoneybotChatPresenter) this.$plan).heldKickoffMessages$delegate;
                    if (!((List) parcelableSnapshotMutableState.getValue()).isEmpty()) {
                        parcelableSnapshotMutableState.setValue(EmptyList.INSTANCE);
                    }
                }
                return Unit.INSTANCE;
            case 18:
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (((KeyboardState) this.$logger) == KeyboardState.Open) {
                    ((Function1) this.$plan).invoke(MoneybotChatViewEvent.KeyboardOpened.INSTANCE);
                }
                return Unit.INSTANCE;
            case 19:
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((Function1) this.$plan).invoke(((MoneybotHomeViewModel.WidgetCard) this.$logger).viewedEvent);
                return Unit.INSTANCE;
            case 20:
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((Function1) this.$plan).invoke(((MoneybotHomeViewModel.NextBestAction) this.$logger).viewedEvent);
                return Unit.INSTANCE;
            case 21:
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (((RecentChatHistoryViewModel$Loaded) this.$logger).loadingNextPage) {
                    ((MutableState) this.$plan).setValue(Boolean.FALSE);
                }
                return Unit.INSTANCE;
            case 22:
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (((MemoryTooltip) this.$logger) != null) {
                    TooltipState tooltipState = (TooltipState) this.$plan;
                    JobKt.launch$default(tooltipState.scope, null, null, new TooltipState$hide$1(tooltipState, continuation, true ? 1 : 0), 3);
                }
                return Unit.INSTANCE;
            case 23:
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((Function1) this.$logger).invoke((PromptButtonListViewEvent) this.$plan);
                return Unit.INSTANCE;
            case 24:
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((MutableState) this.$plan).setValue(((ProcessingIndicator) this.$logger).text);
                return Unit.INSTANCE;
            case 25:
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((RealObservabilityManager) this.$logger).addViewAttributes((Map) this.$plan);
                return Unit.INSTANCE;
            case 26:
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                GpsConfigQueries gpsConfigQueries = ((RealOffersSheetRepository) this.$logger).cashDatabase.offersSheetQueries;
                QueryResult execute = gpsConfigQueries.driver.execute(null, re$$ExternalSyntheticOutline0.m("\n        |DELETE FROM offersSheet\n        |WHERE offer_type ", "=", " ?\n        "), new MusicViewKt$$ExternalSyntheticLambda6(19, (OfferType) this.$plan, gpsConfigQueries));
                gpsConfigQueries.notifyQueries(-2106094185, new OffersHomeQueries$$ExternalSyntheticLambda1(24));
                return execute;
            case 27:
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealOffersTabRefresher realOffersTabRefresher = (RealOffersTabRefresher) this.$logger;
                StandaloneCoroutine standaloneCoroutine = realOffersTabRefresher.searchNullStateRefreshJob;
                if (standaloneCoroutine != null) {
                    standaloneCoroutine.cancel(null);
                }
                realOffersTabRefresher.searchNullStateRefreshJob = JobKt.launch$default(realOffersTabRefresher.scope, realOffersTabRefresher.dispatcher, null, new MusicPresenter$models$2$1(realOffersTabRefresher, (OffersTabRepository$SearchSource) this.$plan, continuation, 28), 2);
                return Unit.INSTANCE;
            case 28:
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealOffersTabRepository realOffersTabRepository = (RealOffersTabRepository) this.$logger;
                GpsConfigQueries gpsConfigQueries2 = realOffersTabRepository.cashDatabase.offersRecentlyViewedQueries;
                OffersItemToken offersItemToken = (OffersItemToken) this.$plan;
                String token = offersItemToken.getToken();
                long millis = realOffersTabRepository.clock.millis();
                if (offersItemToken instanceof BusinessToken) {
                    offersItemTokenType = OffersItemTokenType.BUSINESS;
                } else {
                    if (!(offersItemToken instanceof com.squareup.cash.offers.backend.api.CategoryToken)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    offersItemTokenType = OffersItemTokenType.CATEGORY;
                }
                OffersItemTokenType offersItemTokenType2 = offersItemTokenType;
                gpsConfigQueries2.getClass();
                token.getClass();
                QueryResult execute2 = gpsConfigQueries2.driver.execute(1175404129, "INSERT OR REPLACE INTO offersRecentlyViewed(token, type, last_updated)\nVALUES (?, ?, ?)", new MultiParagraph$$ExternalSyntheticLambda0(token, gpsConfigQueries2, offersItemTokenType2, millis, 3));
                gpsConfigQueries2.notifyQueries(1175404129, new OffersHomeQueries$$ExternalSyntheticLambda1(21));
                return execute2;
            default:
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ApiResult apiResult = (ApiResult) ((MutableState) this.$logger).getValue();
                ApiResult.Success success = apiResult instanceof ApiResult.Success ? (ApiResult.Success) apiResult : null;
                if (success == null || (offersTabCollectionResponse = (OffersTabCollectionResponse) success.response) == null || (analyticsEvent = offersTabCollectionResponse.analytics_view_event) == null) {
                    return Unit.INSTANCE;
                }
                RealOffersAnalytics.trackGenericAnalyticsEvent$default((RealOffersAnalytics) ((LocalCashBalancePresenter) this.$plan).timestampFormatter, ShadowKt.toOffersAnalyticsEventSpec(analyticsEvent));
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GenieViewKt$GenieView$1$1(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$logger = obj;
        this.$plan = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GenieViewKt$GenieView$1$1(MoleculePresenter moleculePresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$plan = moleculePresenter;
    }
}

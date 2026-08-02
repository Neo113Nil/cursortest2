package com.squareup.cash.investing.backend.real.metrics;

import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.data.profile.JurisdictionConfigManager$JurisdictionConfig;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.investing.backend.api.AutoInvestPreference;
import com.squareup.cash.investing.backend.api.DiscoveryHeader;
import com.squareup.cash.investing.backend.api.PolledData;
import com.squareup.cash.investing.backend.api.data.Category;
import com.squareup.cash.investing.backend.api.data.CategoryDetails;
import com.squareup.cash.investing.backend.api.data.FilterDetails;
import com.squareup.cash.investing.backend.api.data.FilterGroup;
import com.squareup.cash.investing.backend.api.data.SearchResult;
import com.squareup.cash.investing.backend.api.model.InvestingSecurityTileContent;
import com.squareup.cash.investing.backend.real.PersistentEntityPriceCache$transform$1$1$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.cash.investing.backend.real.PersistentHistoricalDataCache$bitcoinPortfolio$$inlined$map$1$2$1;
import com.squareup.cash.investing.backend.real.PersistentHistoricalDataCache$stocksPortfolio$$inlined$map$1$2$1;
import com.squareup.cash.investing.backend.real.RealBitcoinHistoricalDataRepo$polledBitcoinDataFlow$$inlined$mapNotNull$1$2$1;
import com.squareup.cash.investing.backend.real.RealDocumentsDisclosureTextProvider$documentsDisclosureText$$inlined$map$1$2$1;
import com.squareup.cash.investing.backend.real.RealEntityPriceRefresher$autoRefresh$$inlined$map$1$2$1;
import com.squareup.cash.investing.backend.real.RealEntityPriceRefresher$autoRefresh$$inlined$map$2$2$1;
import com.squareup.cash.investing.backend.real.RealInvestingHistoricalData$bitcoin$lambda$0$$inlined$filter$1$2$1;
import com.squareup.cash.investing.backend.real.RealInvestingHistoricalData$bitcoin$lambda$0$$inlined$map$2$2$1;
import com.squareup.cash.investing.backend.real.RealInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.investing.backend.real.RealInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$map$2$2$1;
import com.squareup.cash.investing.backend.real.RealInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.investing.backend.real.RealInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$map$2$2$1;
import com.squareup.cash.investing.backend.real.RealInvestmentEntities$discoverySearchCategoryStocks$$inlined$map$1$2$1;
import com.squareup.cash.investing.backend.real.RealInvestmentEntitiesKt;
import com.squareup.cash.investing.backend.real.autoinvest.RealAutoInvestRepo$preference$$inlined$map$1$2$1;
import com.squareup.cash.investing.backend.real.autoinvest.RealAutoInvestRepo$preference$$inlined$map$2$2$1;
import com.squareup.cash.investing.backend.real.categories.RealCategoryBackend$categoryDetails$$inlined$map$1$2$1;
import com.squareup.cash.investing.backend.real.categories.RealCategoryBackend$filterDetails$$inlined$map$1$2$1;
import com.squareup.cash.investing.backend.real.categories.RealCategoryBackend$performSearch$$inlined$map$1$2$1;
import com.squareup.cash.investing.components.EventRepeater$observe$1$1$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.cash.investing.db.Investing_bitcoin_portfolio_graph_cache;
import com.squareup.cash.investing.db.Investing_entity_price_cache;
import com.squareup.cash.investing.db.Investing_settings;
import com.squareup.cash.investing.db.Investing_stocks_portfolio_graph_cache;
import com.squareup.cash.investing.db.SelectDiscoveries;
import com.squareup.cash.investing.db.categories.CategoryForToken;
import com.squareup.cash.investing.db.categories.FilterGroupForToken;
import com.squareup.cash.investing.presenters.InvestingDiscoveryPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.investing.presenters.InvestingDiscoveryPresenter$models$lambda$2$$inlined$map$1$2$1;
import com.squareup.cash.investing.presenters.InvestingDiscoveryPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.investing.presenters.InvestingHomePresenter$models$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.investing.presenters.InvestingHomePresenter$models$lambda$2$$inlined$map$1$2$1;
import com.squareup.cash.investing.presenters.InvestingPortfolioPresenter$isDataStale$$inlined$map$1$2$1;
import com.squareup.cash.investing.presenters.InvestingPortfolioPresenter$models$lambda$10$$inlined$filterIsInstance$1$2$1;
import com.squareup.cash.investing.presenters.InvestingPortfolioPresenter$models$lambda$10$$inlined$map$1$2$1;
import com.squareup.cash.investing.primitives.CategoryToken;
import com.squareup.cash.investing.primitives.FilterToken;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.investing.viewmodels.InvestingHomeViewEvent;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsViewEvent;
import com.squareup.cash.lifecycle.ActivityEvent;
import com.squareup.protos.cash.marketdata.server.GetETFDetailsRequest;
import com.squareup.protos.cash.marketdata.server.GetETFDetailsResponse;
import com.squareup.protos.cash.marketdata.server.GetInvestingMetricsRequest;
import com.squareup.protos.cash.marketdata.server.GetInvestingMetricsResponse;
import com.squareup.protos.cash.marketdata.server.InvestingMetricsService;
import com.squareup.protos.cash.marketprices.CurrentPrice;
import com.squareup.protos.cash.marketprices.service.GetCurrentPricesResponse;
import com.squareup.protos.cash.portfolios.GetPortfoliosHistoricalDataResponse;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.app.GetHistoricalExchangeDataResponse;
import com.squareup.protos.franklin.common.SyncInvestmentCategory;
import com.squareup.protos.franklin.common.SyncRecurringPreference;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import com.squareup.protos.repeatedly.common.ScheduledTransactionPreference;
import com.squareup.util.cash.ColorsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SafeFlow;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealInvestingMetrics$createMetricsFlow$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ InvestmentEntityToken $entityToken;
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ RealInvestingMetrics this$0;

    /* renamed from: com.squareup.cash.investing.backend.real.metrics.RealInvestingMetrics$createMetricsFlow$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public final /* synthetic */ FlowCollector $$this$flow;
        public final /* synthetic */ InvestmentEntityToken $entityToken;
        public final /* synthetic */ int $r8$classId;
        public long J$0;
        public int label;
        public final /* synthetic */ RealInvestingMetrics this$0;

        /* renamed from: com.squareup.cash.investing.backend.real.metrics.RealInvestingMetrics$createMetricsFlow$1$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00621 implements FlowCollector {
            public final /* synthetic */ FlowCollector $$this$flow;
            public final /* synthetic */ int $r8$classId;

            public /* synthetic */ C00621(FlowCollector flowCollector, int i) {
                this.$r8$classId = i;
                this.$$this$flow = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:108:0x0187  */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
            /* JADX WARN: Removed duplicated region for block: B:114:0x0192  */
            /* JADX WARN: Removed duplicated region for block: B:128:0x01c4  */
            /* JADX WARN: Removed duplicated region for block: B:134:0x01cf  */
            /* JADX WARN: Removed duplicated region for block: B:146:0x0202  */
            /* JADX WARN: Removed duplicated region for block: B:152:0x020d  */
            /* JADX WARN: Removed duplicated region for block: B:166:0x023f  */
            /* JADX WARN: Removed duplicated region for block: B:172:0x024a  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
            /* JADX WARN: Removed duplicated region for block: B:189:0x028c  */
            /* JADX WARN: Removed duplicated region for block: B:195:0x0297  */
            /* JADX WARN: Removed duplicated region for block: B:212:0x02ec  */
            /* JADX WARN: Removed duplicated region for block: B:218:0x02f9  */
            /* JADX WARN: Removed duplicated region for block: B:253:0x03cc  */
            /* JADX WARN: Removed duplicated region for block: B:260:0x03da  */
            /* JADX WARN: Removed duplicated region for block: B:288:0x0477  */
            /* JADX WARN: Removed duplicated region for block: B:299:0x049a  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
            /* JADX WARN: Removed duplicated region for block: B:306:0x04a6  */
            /* JADX WARN: Removed duplicated region for block: B:323:0x0503  */
            /* JADX WARN: Removed duplicated region for block: B:329:0x050e  */
            /* JADX WARN: Removed duplicated region for block: B:341:0x0541  */
            /* JADX WARN: Removed duplicated region for block: B:348:0x054e  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x007e  */
            /* JADX WARN: Removed duplicated region for block: B:373:0x05dc  */
            /* JADX WARN: Removed duplicated region for block: B:379:0x05e7  */
            /* JADX WARN: Removed duplicated region for block: B:391:0x061f  */
            /* JADX WARN: Removed duplicated region for block: B:398:0x062b  */
            /* JADX WARN: Removed duplicated region for block: B:415:0x066a  */
            /* JADX WARN: Removed duplicated region for block: B:421:0x0675  */
            /* JADX WARN: Removed duplicated region for block: B:433:0x06ad  */
            /* JADX WARN: Removed duplicated region for block: B:440:0x06b9  */
            /* JADX WARN: Removed duplicated region for block: B:457:0x06f8  */
            /* JADX WARN: Removed duplicated region for block: B:463:0x0703  */
            /* JADX WARN: Removed duplicated region for block: B:475:0x073b  */
            /* JADX WARN: Removed duplicated region for block: B:482:0x0747  */
            /* JADX WARN: Removed duplicated region for block: B:499:0x0785  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x00b0  */
            /* JADX WARN: Removed duplicated region for block: B:506:0x0791  */
            /* JADX WARN: Removed duplicated region for block: B:526:0x07f7  */
            /* JADX WARN: Removed duplicated region for block: B:533:0x0803  */
            /* JADX WARN: Removed duplicated region for block: B:550:0x0841  */
            /* JADX WARN: Removed duplicated region for block: B:556:0x084c  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x00bb  */
            /* JADX WARN: Removed duplicated region for block: B:572:0x0883  */
            /* JADX WARN: Removed duplicated region for block: B:579:0x088f  */
            /* JADX WARN: Removed duplicated region for block: B:596:0x08ca  */
            /* JADX WARN: Removed duplicated region for block: B:602:0x08d5  */
            /* JADX WARN: Removed duplicated region for block: B:614:0x0910  */
            /* JADX WARN: Removed duplicated region for block: B:620:0x091b  */
            /* JADX WARN: Removed duplicated region for block: B:632:0x0954  */
            /* JADX WARN: Removed duplicated region for block: B:639:0x0960  */
            /* JADX WARN: Removed duplicated region for block: B:72:0x0101  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x010c  */
            /* JADX WARN: Removed duplicated region for block: B:90:0x0143  */
            /* JADX WARN: Removed duplicated region for block: B:96:0x014e  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                PersistentEntityPriceCache$transform$1$1$invokeSuspend$$inlined$map$1$2$1 persistentEntityPriceCache$transform$1$1$invokeSuspend$$inlined$map$1$2$1;
                int i;
                PersistentHistoricalDataCache$bitcoinPortfolio$$inlined$map$1$2$1 persistentHistoricalDataCache$bitcoinPortfolio$$inlined$map$1$2$1;
                int i2;
                PersistentHistoricalDataCache$stocksPortfolio$$inlined$map$1$2$1 persistentHistoricalDataCache$stocksPortfolio$$inlined$map$1$2$1;
                int i3;
                RealBitcoinHistoricalDataRepo$polledBitcoinDataFlow$$inlined$mapNotNull$1$2$1 realBitcoinHistoricalDataRepo$polledBitcoinDataFlow$$inlined$mapNotNull$1$2$1;
                int i4;
                RealDocumentsDisclosureTextProvider$documentsDisclosureText$$inlined$map$1$2$1 realDocumentsDisclosureTextProvider$documentsDisclosureText$$inlined$map$1$2$1;
                int i5;
                RealEntityPriceRefresher$autoRefresh$$inlined$map$1$2$1 realEntityPriceRefresher$autoRefresh$$inlined$map$1$2$1;
                int i6;
                RealEntityPriceRefresher$autoRefresh$$inlined$map$2$2$1 realEntityPriceRefresher$autoRefresh$$inlined$map$2$2$1;
                int i7;
                RealInvestingHistoricalData$bitcoin$lambda$0$$inlined$filter$1$2$1 realInvestingHistoricalData$bitcoin$lambda$0$$inlined$filter$1$2$1;
                int i8;
                RealInvestingHistoricalData$bitcoin$lambda$0$$inlined$map$2$2$1 realInvestingHistoricalData$bitcoin$lambda$0$$inlined$map$2$2$1;
                int i9;
                RealInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$filter$1$2$1 realInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$filter$1$2$1;
                int i10;
                RealInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$map$2$2$1 realInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$map$2$2$1;
                int i11;
                RealInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$filter$1$2$1 realInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$filter$1$2$1;
                int i12;
                RealInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$map$2$2$1 realInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$map$2$2$1;
                int i13;
                RealInvestmentEntities$discoverySearchCategoryStocks$$inlined$map$1$2$1 realInvestmentEntities$discoverySearchCategoryStocks$$inlined$map$1$2$1;
                int i14;
                RealAutoInvestRepo$preference$$inlined$map$1$2$1 realAutoInvestRepo$preference$$inlined$map$1$2$1;
                int i15;
                RealAutoInvestRepo$preference$$inlined$map$2$2$1 realAutoInvestRepo$preference$$inlined$map$2$2$1;
                int i16;
                AutoInvestPreference autoInvestPreference;
                RealCategoryBackend$categoryDetails$$inlined$map$1$2$1 realCategoryBackend$categoryDetails$$inlined$map$1$2$1;
                int i17;
                CategoryDetails categoryDetails;
                Color color;
                RealCategoryBackend$filterDetails$$inlined$map$1$2$1 realCategoryBackend$filterDetails$$inlined$map$1$2$1;
                int i18;
                Object categories;
                int i19;
                Color color2;
                String str;
                RealCategoryBackend$performSearch$$inlined$map$1$2$1 realCategoryBackend$performSearch$$inlined$map$1$2$1;
                int i20;
                EventRepeater$observe$1$1$invokeSuspend$$inlined$map$1$2$1 eventRepeater$observe$1$1$invokeSuspend$$inlined$map$1$2$1;
                int i21;
                InvestingDiscoveryPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1 investingDiscoveryPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1;
                int i22;
                InvestingDiscoveryPresenter$models$lambda$2$$inlined$map$1$2$1 investingDiscoveryPresenter$models$lambda$2$$inlined$map$1$2$1;
                int i23;
                InvestingDiscoveryPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1 investingDiscoveryPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1;
                int i24;
                InvestingHomePresenter$models$lambda$0$$inlined$map$1$2$1 investingHomePresenter$models$lambda$0$$inlined$map$1$2$1;
                int i25;
                InvestingHomePresenter$models$lambda$2$$inlined$map$1$2$1 investingHomePresenter$models$lambda$2$$inlined$map$1$2$1;
                int i26;
                InvestingPortfolioPresenter$isDataStale$$inlined$map$1$2$1 investingPortfolioPresenter$isDataStale$$inlined$map$1$2$1;
                int i27;
                InvestingPortfolioPresenter$models$lambda$10$$inlined$filterIsInstance$1$2$1 investingPortfolioPresenter$models$lambda$10$$inlined$filterIsInstance$1$2$1;
                int i28;
                InvestingPortfolioPresenter$models$lambda$10$$inlined$map$1$2$1 investingPortfolioPresenter$models$lambda$10$$inlined$map$1$2$1;
                int i29;
                int i30 = this.$r8$classId;
                FlowCollector flowCollector = this.$$this$flow;
                switch (i30) {
                    case 0:
                        Object emit = flowCollector.emit((GetInvestingMetricsResponse) obj, continuation);
                        if (emit != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            break;
                        }
                        break;
                    case 1:
                        if (continuation instanceof PersistentEntityPriceCache$transform$1$1$invokeSuspend$$inlined$map$1$2$1) {
                            persistentEntityPriceCache$transform$1$1$invokeSuspend$$inlined$map$1$2$1 = (PersistentEntityPriceCache$transform$1$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                            int i31 = persistentEntityPriceCache$transform$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                            if ((i31 & PKIFailureInfo.systemUnavail) != 0) {
                                persistentEntityPriceCache$transform$1$1$invokeSuspend$$inlined$map$1$2$1.label = i31 - PKIFailureInfo.systemUnavail;
                                Object obj2 = persistentEntityPriceCache$transform$1$1$invokeSuspend$$inlined$map$1$2$1.result;
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i = persistentEntityPriceCache$transform$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                                if (i != 0) {
                                    SafeTrace.throwOnFailure(obj2);
                                    List<Investing_entity_price_cache> list = (List) obj;
                                    int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                                    LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity >= 16 ? mapCapacity : 16);
                                    for (Investing_entity_price_cache investing_entity_price_cache : list) {
                                        linkedHashMap.put(new InvestmentEntityToken(investing_entity_price_cache.token), investing_entity_price_cache.price);
                                    }
                                    persistentEntityPriceCache$transform$1$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                                    if (flowCollector.emit(linkedHashMap, persistentEntityPriceCache$transform$1$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
                                        break;
                                    }
                                } else if (i != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                } else {
                                    SafeTrace.throwOnFailure(obj2);
                                }
                                break;
                            }
                        }
                        persistentEntityPriceCache$transform$1$1$invokeSuspend$$inlined$map$1$2$1 = new PersistentEntityPriceCache$transform$1$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                        Object obj22 = persistentEntityPriceCache$transform$1$1$invokeSuspend$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = persistentEntityPriceCache$transform$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                        if (i != 0) {
                        }
                    case 2:
                        if (continuation instanceof PersistentHistoricalDataCache$bitcoinPortfolio$$inlined$map$1$2$1) {
                            persistentHistoricalDataCache$bitcoinPortfolio$$inlined$map$1$2$1 = (PersistentHistoricalDataCache$bitcoinPortfolio$$inlined$map$1$2$1) continuation;
                            int i32 = persistentHistoricalDataCache$bitcoinPortfolio$$inlined$map$1$2$1.label;
                            if ((i32 & PKIFailureInfo.systemUnavail) != 0) {
                                persistentHistoricalDataCache$bitcoinPortfolio$$inlined$map$1$2$1.label = i32 - PKIFailureInfo.systemUnavail;
                                Object obj3 = persistentHistoricalDataCache$bitcoinPortfolio$$inlined$map$1$2$1.result;
                                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i2 = persistentHistoricalDataCache$bitcoinPortfolio$$inlined$map$1$2$1.label;
                                if (i2 != 0) {
                                    SafeTrace.throwOnFailure(obj3);
                                    GetHistoricalExchangeDataResponse getHistoricalExchangeDataResponse = new GetHistoricalExchangeDataResponse(((Investing_bitcoin_portfolio_graph_cache) obj).data_, 2);
                                    persistentHistoricalDataCache$bitcoinPortfolio$$inlined$map$1$2$1.label = 1;
                                    if (flowCollector.emit(getHistoricalExchangeDataResponse, persistentHistoricalDataCache$bitcoinPortfolio$$inlined$map$1$2$1) == coroutineSingletons3) {
                                        break;
                                    }
                                } else if (i2 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                } else {
                                    SafeTrace.throwOnFailure(obj3);
                                }
                                break;
                            }
                        }
                        persistentHistoricalDataCache$bitcoinPortfolio$$inlined$map$1$2$1 = new PersistentHistoricalDataCache$bitcoinPortfolio$$inlined$map$1$2$1(this, continuation);
                        Object obj32 = persistentHistoricalDataCache$bitcoinPortfolio$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = persistentHistoricalDataCache$bitcoinPortfolio$$inlined$map$1$2$1.label;
                        if (i2 != 0) {
                        }
                    case 3:
                        if (continuation instanceof PersistentHistoricalDataCache$stocksPortfolio$$inlined$map$1$2$1) {
                            persistentHistoricalDataCache$stocksPortfolio$$inlined$map$1$2$1 = (PersistentHistoricalDataCache$stocksPortfolio$$inlined$map$1$2$1) continuation;
                            int i33 = persistentHistoricalDataCache$stocksPortfolio$$inlined$map$1$2$1.label;
                            if ((i33 & PKIFailureInfo.systemUnavail) != 0) {
                                persistentHistoricalDataCache$stocksPortfolio$$inlined$map$1$2$1.label = i33 - PKIFailureInfo.systemUnavail;
                                Object obj4 = persistentHistoricalDataCache$stocksPortfolio$$inlined$map$1$2$1.result;
                                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i3 = persistentHistoricalDataCache$stocksPortfolio$$inlined$map$1$2$1.label;
                                if (i3 != 0) {
                                    SafeTrace.throwOnFailure(obj4);
                                    GetPortfoliosHistoricalDataResponse getPortfoliosHistoricalDataResponse = new GetPortfoliosHistoricalDataResponse(((Investing_stocks_portfolio_graph_cache) obj).data_, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    persistentHistoricalDataCache$stocksPortfolio$$inlined$map$1$2$1.label = 1;
                                    if (flowCollector.emit(getPortfoliosHistoricalDataResponse, persistentHistoricalDataCache$stocksPortfolio$$inlined$map$1$2$1) == coroutineSingletons4) {
                                        break;
                                    }
                                } else if (i3 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                } else {
                                    SafeTrace.throwOnFailure(obj4);
                                }
                                break;
                            }
                        }
                        persistentHistoricalDataCache$stocksPortfolio$$inlined$map$1$2$1 = new PersistentHistoricalDataCache$stocksPortfolio$$inlined$map$1$2$1(this, continuation);
                        Object obj42 = persistentHistoricalDataCache$stocksPortfolio$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i3 = persistentHistoricalDataCache$stocksPortfolio$$inlined$map$1$2$1.label;
                        if (i3 != 0) {
                        }
                    case 4:
                        if (continuation instanceof RealBitcoinHistoricalDataRepo$polledBitcoinDataFlow$$inlined$mapNotNull$1$2$1) {
                            realBitcoinHistoricalDataRepo$polledBitcoinDataFlow$$inlined$mapNotNull$1$2$1 = (RealBitcoinHistoricalDataRepo$polledBitcoinDataFlow$$inlined$mapNotNull$1$2$1) continuation;
                            int i34 = realBitcoinHistoricalDataRepo$polledBitcoinDataFlow$$inlined$mapNotNull$1$2$1.label;
                            if ((i34 & PKIFailureInfo.systemUnavail) != 0) {
                                realBitcoinHistoricalDataRepo$polledBitcoinDataFlow$$inlined$mapNotNull$1$2$1.label = i34 - PKIFailureInfo.systemUnavail;
                                Object obj5 = realBitcoinHistoricalDataRepo$polledBitcoinDataFlow$$inlined$mapNotNull$1$2$1.result;
                                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i4 = realBitcoinHistoricalDataRepo$polledBitcoinDataFlow$$inlined$mapNotNull$1$2$1.label;
                                if (i4 != 0) {
                                    SafeTrace.throwOnFailure(obj5);
                                    JurisdictionConfigManager$JurisdictionConfig jurisdictionConfigManager$JurisdictionConfig = (JurisdictionConfigManager$JurisdictionConfig) obj;
                                    CurrencyCode currencyCode = jurisdictionConfigManager$JurisdictionConfig != null ? jurisdictionConfigManager$JurisdictionConfig.defaultCurrency : null;
                                    if (currencyCode != null) {
                                        realBitcoinHistoricalDataRepo$polledBitcoinDataFlow$$inlined$mapNotNull$1$2$1.label = 1;
                                        if (flowCollector.emit(currencyCode, realBitcoinHistoricalDataRepo$polledBitcoinDataFlow$$inlined$mapNotNull$1$2$1) == coroutineSingletons5) {
                                            break;
                                        }
                                    }
                                } else if (i4 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                } else {
                                    SafeTrace.throwOnFailure(obj5);
                                }
                                break;
                            }
                        }
                        realBitcoinHistoricalDataRepo$polledBitcoinDataFlow$$inlined$mapNotNull$1$2$1 = new RealBitcoinHistoricalDataRepo$polledBitcoinDataFlow$$inlined$mapNotNull$1$2$1(this, continuation);
                        Object obj52 = realBitcoinHistoricalDataRepo$polledBitcoinDataFlow$$inlined$mapNotNull$1$2$1.result;
                        CoroutineSingletons coroutineSingletons52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i4 = realBitcoinHistoricalDataRepo$polledBitcoinDataFlow$$inlined$mapNotNull$1$2$1.label;
                        if (i4 != 0) {
                        }
                    case 5:
                        if (continuation instanceof RealDocumentsDisclosureTextProvider$documentsDisclosureText$$inlined$map$1$2$1) {
                            realDocumentsDisclosureTextProvider$documentsDisclosureText$$inlined$map$1$2$1 = (RealDocumentsDisclosureTextProvider$documentsDisclosureText$$inlined$map$1$2$1) continuation;
                            int i35 = realDocumentsDisclosureTextProvider$documentsDisclosureText$$inlined$map$1$2$1.label;
                            if ((i35 & PKIFailureInfo.systemUnavail) != 0) {
                                realDocumentsDisclosureTextProvider$documentsDisclosureText$$inlined$map$1$2$1.label = i35 - PKIFailureInfo.systemUnavail;
                                Object obj6 = realDocumentsDisclosureTextProvider$documentsDisclosureText$$inlined$map$1$2$1.result;
                                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i5 = realDocumentsDisclosureTextProvider$documentsDisclosureText$$inlined$map$1$2$1.label;
                                if (i5 != 0) {
                                    SafeTrace.throwOnFailure(obj6);
                                    Investing_settings investing_settings = (Investing_settings) obj;
                                    String str2 = investing_settings != null ? investing_settings.documents_disclosure_text : null;
                                    realDocumentsDisclosureTextProvider$documentsDisclosureText$$inlined$map$1$2$1.label = 1;
                                    if (flowCollector.emit(str2, realDocumentsDisclosureTextProvider$documentsDisclosureText$$inlined$map$1$2$1) == coroutineSingletons6) {
                                        break;
                                    }
                                } else if (i5 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                } else {
                                    SafeTrace.throwOnFailure(obj6);
                                }
                                break;
                            }
                        }
                        realDocumentsDisclosureTextProvider$documentsDisclosureText$$inlined$map$1$2$1 = new RealDocumentsDisclosureTextProvider$documentsDisclosureText$$inlined$map$1$2$1(this, continuation);
                        Object obj62 = realDocumentsDisclosureTextProvider$documentsDisclosureText$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons62 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i5 = realDocumentsDisclosureTextProvider$documentsDisclosureText$$inlined$map$1$2$1.label;
                        if (i5 != 0) {
                        }
                    case 6:
                        if (continuation instanceof RealEntityPriceRefresher$autoRefresh$$inlined$map$1$2$1) {
                            realEntityPriceRefresher$autoRefresh$$inlined$map$1$2$1 = (RealEntityPriceRefresher$autoRefresh$$inlined$map$1$2$1) continuation;
                            int i36 = realEntityPriceRefresher$autoRefresh$$inlined$map$1$2$1.label;
                            if ((i36 & PKIFailureInfo.systemUnavail) != 0) {
                                realEntityPriceRefresher$autoRefresh$$inlined$map$1$2$1.label = i36 - PKIFailureInfo.systemUnavail;
                                Object obj7 = realEntityPriceRefresher$autoRefresh$$inlined$map$1$2$1.result;
                                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i6 = realEntityPriceRefresher$autoRefresh$$inlined$map$1$2$1.label;
                                if (i6 != 0) {
                                    SafeTrace.throwOnFailure(obj7);
                                    ApiResult apiResult = (ApiResult) obj;
                                    Object obj8 = apiResult instanceof ApiResult.Success ? ((ApiResult.Success) apiResult).response : null;
                                    realEntityPriceRefresher$autoRefresh$$inlined$map$1$2$1.label = 1;
                                    if (flowCollector.emit(obj8, realEntityPriceRefresher$autoRefresh$$inlined$map$1$2$1) == coroutineSingletons7) {
                                        break;
                                    }
                                } else if (i6 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                } else {
                                    SafeTrace.throwOnFailure(obj7);
                                }
                                break;
                            }
                        }
                        realEntityPriceRefresher$autoRefresh$$inlined$map$1$2$1 = new RealEntityPriceRefresher$autoRefresh$$inlined$map$1$2$1(this, continuation);
                        Object obj72 = realEntityPriceRefresher$autoRefresh$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons72 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i6 = realEntityPriceRefresher$autoRefresh$$inlined$map$1$2$1.label;
                        if (i6 != 0) {
                        }
                    case 7:
                        if (continuation instanceof RealEntityPriceRefresher$autoRefresh$$inlined$map$2$2$1) {
                            realEntityPriceRefresher$autoRefresh$$inlined$map$2$2$1 = (RealEntityPriceRefresher$autoRefresh$$inlined$map$2$2$1) continuation;
                            int i37 = realEntityPriceRefresher$autoRefresh$$inlined$map$2$2$1.label;
                            if ((i37 & PKIFailureInfo.systemUnavail) != 0) {
                                realEntityPriceRefresher$autoRefresh$$inlined$map$2$2$1.label = i37 - PKIFailureInfo.systemUnavail;
                                Object obj9 = realEntityPriceRefresher$autoRefresh$$inlined$map$2$2$1.result;
                                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i7 = realEntityPriceRefresher$autoRefresh$$inlined$map$2$2$1.label;
                                if (i7 != 0) {
                                    SafeTrace.throwOnFailure(obj9);
                                    List list2 = ((GetCurrentPricesResponse) obj).prices;
                                    int mapCapacity2 = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(mapCapacity2 >= 16 ? mapCapacity2 : 16);
                                    for (Object obj10 : list2) {
                                        String str3 = ((CurrentPrice) obj10).investment_entity_token;
                                        str3.getClass();
                                        linkedHashMap2.put(new InvestmentEntityToken(str3), obj10);
                                    }
                                    realEntityPriceRefresher$autoRefresh$$inlined$map$2$2$1.label = 1;
                                    if (flowCollector.emit(linkedHashMap2, realEntityPriceRefresher$autoRefresh$$inlined$map$2$2$1) == coroutineSingletons8) {
                                        break;
                                    }
                                } else if (i7 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                } else {
                                    SafeTrace.throwOnFailure(obj9);
                                }
                                break;
                            }
                        }
                        realEntityPriceRefresher$autoRefresh$$inlined$map$2$2$1 = new RealEntityPriceRefresher$autoRefresh$$inlined$map$2$2$1(this, continuation);
                        Object obj92 = realEntityPriceRefresher$autoRefresh$$inlined$map$2$2$1.result;
                        CoroutineSingletons coroutineSingletons82 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i7 = realEntityPriceRefresher$autoRefresh$$inlined$map$2$2$1.label;
                        if (i7 != 0) {
                        }
                    case 8:
                        if (continuation instanceof RealInvestingHistoricalData$bitcoin$lambda$0$$inlined$filter$1$2$1) {
                            realInvestingHistoricalData$bitcoin$lambda$0$$inlined$filter$1$2$1 = (RealInvestingHistoricalData$bitcoin$lambda$0$$inlined$filter$1$2$1) continuation;
                            int i38 = realInvestingHistoricalData$bitcoin$lambda$0$$inlined$filter$1$2$1.label;
                            if ((i38 & PKIFailureInfo.systemUnavail) != 0) {
                                realInvestingHistoricalData$bitcoin$lambda$0$$inlined$filter$1$2$1.label = i38 - PKIFailureInfo.systemUnavail;
                                Object obj11 = realInvestingHistoricalData$bitcoin$lambda$0$$inlined$filter$1$2$1.result;
                                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i8 = realInvestingHistoricalData$bitcoin$lambda$0$$inlined$filter$1$2$1.label;
                                if (i8 != 0) {
                                    SafeTrace.throwOnFailure(obj11);
                                    ApiResult apiResult2 = (ApiResult) obj;
                                    if ((apiResult2 instanceof ApiResult.Success ? ((ApiResult.Success) apiResult2).response : null) != null) {
                                        realInvestingHistoricalData$bitcoin$lambda$0$$inlined$filter$1$2$1.label = 1;
                                        if (flowCollector.emit(obj, realInvestingHistoricalData$bitcoin$lambda$0$$inlined$filter$1$2$1) == coroutineSingletons9) {
                                            break;
                                        }
                                    }
                                } else if (i8 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                } else {
                                    SafeTrace.throwOnFailure(obj11);
                                }
                                break;
                            }
                        }
                        realInvestingHistoricalData$bitcoin$lambda$0$$inlined$filter$1$2$1 = new RealInvestingHistoricalData$bitcoin$lambda$0$$inlined$filter$1$2$1(this, continuation);
                        Object obj112 = realInvestingHistoricalData$bitcoin$lambda$0$$inlined$filter$1$2$1.result;
                        CoroutineSingletons coroutineSingletons92 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i8 = realInvestingHistoricalData$bitcoin$lambda$0$$inlined$filter$1$2$1.label;
                        if (i8 != 0) {
                        }
                    case 9:
                        if (continuation instanceof RealInvestingHistoricalData$bitcoin$lambda$0$$inlined$map$2$2$1) {
                            realInvestingHistoricalData$bitcoin$lambda$0$$inlined$map$2$2$1 = (RealInvestingHistoricalData$bitcoin$lambda$0$$inlined$map$2$2$1) continuation;
                            int i39 = realInvestingHistoricalData$bitcoin$lambda$0$$inlined$map$2$2$1.label;
                            if ((i39 & PKIFailureInfo.systemUnavail) != 0) {
                                realInvestingHistoricalData$bitcoin$lambda$0$$inlined$map$2$2$1.label = i39 - PKIFailureInfo.systemUnavail;
                                Object obj12 = realInvestingHistoricalData$bitcoin$lambda$0$$inlined$map$2$2$1.result;
                                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i9 = realInvestingHistoricalData$bitcoin$lambda$0$$inlined$map$2$2$1.label;
                                if (i9 != 0) {
                                    SafeTrace.throwOnFailure(obj12);
                                    ApiResult apiResult3 = (ApiResult) obj;
                                    apiResult3.getClass();
                                    Object obj13 = ((ApiResult.Success) apiResult3).response;
                                    realInvestingHistoricalData$bitcoin$lambda$0$$inlined$map$2$2$1.label = 1;
                                    if (flowCollector.emit(obj13, realInvestingHistoricalData$bitcoin$lambda$0$$inlined$map$2$2$1) == coroutineSingletons10) {
                                        break;
                                    }
                                } else if (i9 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                } else {
                                    SafeTrace.throwOnFailure(obj12);
                                }
                                break;
                            }
                        }
                        realInvestingHistoricalData$bitcoin$lambda$0$$inlined$map$2$2$1 = new RealInvestingHistoricalData$bitcoin$lambda$0$$inlined$map$2$2$1(this, continuation);
                        Object obj122 = realInvestingHistoricalData$bitcoin$lambda$0$$inlined$map$2$2$1.result;
                        CoroutineSingletons coroutineSingletons102 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i9 = realInvestingHistoricalData$bitcoin$lambda$0$$inlined$map$2$2$1.label;
                        if (i9 != 0) {
                        }
                    case 10:
                        if (continuation instanceof RealInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$filter$1$2$1) {
                            realInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$filter$1$2$1 = (RealInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                            int i40 = realInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                            if ((i40 & PKIFailureInfo.systemUnavail) != 0) {
                                realInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$filter$1$2$1.label = i40 - PKIFailureInfo.systemUnavail;
                                Object obj14 = realInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$filter$1$2$1.result;
                                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i10 = realInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                                if (i10 != 0) {
                                    SafeTrace.throwOnFailure(obj14);
                                    ApiResult apiResult4 = (ApiResult) obj;
                                    if ((apiResult4 instanceof ApiResult.Success ? ((ApiResult.Success) apiResult4).response : null) != null) {
                                        realInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                        if (flowCollector.emit(obj, realInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons11) {
                                            break;
                                        }
                                    }
                                } else if (i10 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                } else {
                                    SafeTrace.throwOnFailure(obj14);
                                }
                                break;
                            }
                        }
                        realInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$filter$1$2$1 = new RealInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                        Object obj142 = realInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$filter$1$2$1.result;
                        CoroutineSingletons coroutineSingletons112 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i10 = realInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if (i10 != 0) {
                        }
                    case 11:
                        if (continuation instanceof RealInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$map$2$2$1) {
                            realInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$map$2$2$1 = (RealInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$map$2$2$1) continuation;
                            int i41 = realInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$map$2$2$1.label;
                            if ((i41 & PKIFailureInfo.systemUnavail) != 0) {
                                realInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$map$2$2$1.label = i41 - PKIFailureInfo.systemUnavail;
                                Object obj15 = realInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$map$2$2$1.result;
                                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i11 = realInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$map$2$2$1.label;
                                if (i11 != 0) {
                                    SafeTrace.throwOnFailure(obj15);
                                    ApiResult apiResult5 = (ApiResult) obj;
                                    apiResult5.getClass();
                                    Object obj16 = ((ApiResult.Success) apiResult5).response;
                                    realInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$map$2$2$1.label = 1;
                                    if (flowCollector.emit(obj16, realInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$map$2$2$1) == coroutineSingletons12) {
                                        break;
                                    }
                                } else if (i11 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                } else {
                                    SafeTrace.throwOnFailure(obj15);
                                }
                                break;
                            }
                        }
                        realInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$map$2$2$1 = new RealInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$map$2$2$1(this, continuation);
                        Object obj152 = realInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$map$2$2$1.result;
                        CoroutineSingletons coroutineSingletons122 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i11 = realInvestingHistoricalData$entity$1$1$invokeSuspend$$inlined$map$2$2$1.label;
                        if (i11 != 0) {
                        }
                    case 12:
                        if (continuation instanceof RealInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$filter$1$2$1) {
                            realInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$filter$1$2$1 = (RealInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                            int i42 = realInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                            if ((i42 & PKIFailureInfo.systemUnavail) != 0) {
                                realInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$filter$1$2$1.label = i42 - PKIFailureInfo.systemUnavail;
                                Object obj17 = realInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$filter$1$2$1.result;
                                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i12 = realInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                                if (i12 != 0) {
                                    SafeTrace.throwOnFailure(obj17);
                                    ApiResult apiResult6 = (ApiResult) obj;
                                    if ((apiResult6 instanceof ApiResult.Success ? ((ApiResult.Success) apiResult6).response : null) != null) {
                                        realInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                        if (flowCollector.emit(obj, realInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons13) {
                                            break;
                                        }
                                    }
                                } else if (i12 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                } else {
                                    SafeTrace.throwOnFailure(obj17);
                                }
                                break;
                            }
                        }
                        realInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$filter$1$2$1 = new RealInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                        Object obj172 = realInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$filter$1$2$1.result;
                        CoroutineSingletons coroutineSingletons132 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i12 = realInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if (i12 != 0) {
                        }
                    case 13:
                        if (continuation instanceof RealInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$map$2$2$1) {
                            realInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$map$2$2$1 = (RealInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$map$2$2$1) continuation;
                            int i43 = realInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$map$2$2$1.label;
                            if ((i43 & PKIFailureInfo.systemUnavail) != 0) {
                                realInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$map$2$2$1.label = i43 - PKIFailureInfo.systemUnavail;
                                Object obj18 = realInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$map$2$2$1.result;
                                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i13 = realInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$map$2$2$1.label;
                                if (i13 != 0) {
                                    SafeTrace.throwOnFailure(obj18);
                                    ApiResult apiResult7 = (ApiResult) obj;
                                    apiResult7.getClass();
                                    Object obj19 = ((ApiResult.Success) apiResult7).response;
                                    realInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$map$2$2$1.label = 1;
                                    if (flowCollector.emit(obj19, realInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$map$2$2$1) == coroutineSingletons14) {
                                        break;
                                    }
                                } else if (i13 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                } else {
                                    SafeTrace.throwOnFailure(obj18);
                                }
                                break;
                            }
                        }
                        realInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$map$2$2$1 = new RealInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$map$2$2$1(this, continuation);
                        Object obj182 = realInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$map$2$2$1.result;
                        CoroutineSingletons coroutineSingletons142 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i13 = realInvestingHistoricalData$portfolio$1$1$invokeSuspend$$inlined$map$2$2$1.label;
                        if (i13 != 0) {
                        }
                    case 14:
                        if (continuation instanceof RealInvestmentEntities$discoverySearchCategoryStocks$$inlined$map$1$2$1) {
                            realInvestmentEntities$discoverySearchCategoryStocks$$inlined$map$1$2$1 = (RealInvestmentEntities$discoverySearchCategoryStocks$$inlined$map$1$2$1) continuation;
                            int i44 = realInvestmentEntities$discoverySearchCategoryStocks$$inlined$map$1$2$1.label;
                            if ((i44 & PKIFailureInfo.systemUnavail) != 0) {
                                realInvestmentEntities$discoverySearchCategoryStocks$$inlined$map$1$2$1.label = i44 - PKIFailureInfo.systemUnavail;
                                Object obj20 = realInvestmentEntities$discoverySearchCategoryStocks$$inlined$map$1$2$1.result;
                                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i14 = realInvestmentEntities$discoverySearchCategoryStocks$$inlined$map$1$2$1.label;
                                if (i14 != 0) {
                                    SafeTrace.throwOnFailure(obj20);
                                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                    for (SelectDiscoveries selectDiscoveries : (List) obj) {
                                        DiscoveryHeader discoveryHeader = new DiscoveryHeader(selectDiscoveries.category_index, selectDiscoveries.category, selectDiscoveries.category_description);
                                        Object obj21 = linkedHashMap3.get(discoveryHeader);
                                        if (obj21 == null) {
                                            obj21 = new ArrayList();
                                            linkedHashMap3.put(discoveryHeader, obj21);
                                        }
                                        List list3 = (List) obj21;
                                        Image image = selectDiscoveries.icon;
                                        image.getClass();
                                        String str4 = selectDiscoveries.display_name;
                                        String str5 = selectDiscoveries.symbol;
                                        Color color3 = selectDiscoveries.entity_color;
                                        if (color3 == null) {
                                            String str6 = selectDiscoveries.color;
                                            str6.getClass();
                                            color3 = ColorsKt.toColor(str6);
                                        }
                                        list3.add(new InvestingSecurityTileContent(image, str4, str5, color3, new InvestmentEntityToken(selectDiscoveries.token)));
                                    }
                                    realInvestmentEntities$discoverySearchCategoryStocks$$inlined$map$1$2$1.label = 1;
                                    if (flowCollector.emit(linkedHashMap3, realInvestmentEntities$discoverySearchCategoryStocks$$inlined$map$1$2$1) == coroutineSingletons15) {
                                        break;
                                    }
                                } else if (i14 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                } else {
                                    SafeTrace.throwOnFailure(obj20);
                                }
                                break;
                            }
                        }
                        realInvestmentEntities$discoverySearchCategoryStocks$$inlined$map$1$2$1 = new RealInvestmentEntities$discoverySearchCategoryStocks$$inlined$map$1$2$1(this, continuation);
                        Object obj202 = realInvestmentEntities$discoverySearchCategoryStocks$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons152 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i14 = realInvestmentEntities$discoverySearchCategoryStocks$$inlined$map$1$2$1.label;
                        if (i14 != 0) {
                        }
                    case 15:
                        if (continuation instanceof RealAutoInvestRepo$preference$$inlined$map$1$2$1) {
                            realAutoInvestRepo$preference$$inlined$map$1$2$1 = (RealAutoInvestRepo$preference$$inlined$map$1$2$1) continuation;
                            int i45 = realAutoInvestRepo$preference$$inlined$map$1$2$1.label;
                            if ((i45 & PKIFailureInfo.systemUnavail) != 0) {
                                realAutoInvestRepo$preference$$inlined$map$1$2$1.label = i45 - PKIFailureInfo.systemUnavail;
                                Object obj23 = realAutoInvestRepo$preference$$inlined$map$1$2$1.result;
                                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i15 = realAutoInvestRepo$preference$$inlined$map$1$2$1.label;
                                if (i15 != 0) {
                                    SafeTrace.throwOnFailure(obj23);
                                    ScheduledTransactionPreference scheduledTransactionPreference = ((SyncRecurringPreference) obj).preference;
                                    realAutoInvestRepo$preference$$inlined$map$1$2$1.label = 1;
                                    if (flowCollector.emit(scheduledTransactionPreference, realAutoInvestRepo$preference$$inlined$map$1$2$1) == coroutineSingletons16) {
                                        break;
                                    }
                                } else if (i15 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                } else {
                                    SafeTrace.throwOnFailure(obj23);
                                }
                                break;
                            }
                        }
                        realAutoInvestRepo$preference$$inlined$map$1$2$1 = new RealAutoInvestRepo$preference$$inlined$map$1$2$1(this, continuation);
                        Object obj232 = realAutoInvestRepo$preference$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons162 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i15 = realAutoInvestRepo$preference$$inlined$map$1$2$1.label;
                        if (i15 != 0) {
                        }
                    case 16:
                        if (continuation instanceof RealAutoInvestRepo$preference$$inlined$map$2$2$1) {
                            realAutoInvestRepo$preference$$inlined$map$2$2$1 = (RealAutoInvestRepo$preference$$inlined$map$2$2$1) continuation;
                            int i46 = realAutoInvestRepo$preference$$inlined$map$2$2$1.label;
                            if ((i46 & PKIFailureInfo.systemUnavail) != 0) {
                                realAutoInvestRepo$preference$$inlined$map$2$2$1.label = i46 - PKIFailureInfo.systemUnavail;
                                Object obj24 = realAutoInvestRepo$preference$$inlined$map$2$2$1.result;
                                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i16 = realAutoInvestRepo$preference$$inlined$map$2$2$1.label;
                                if (i16 != 0) {
                                    SafeTrace.throwOnFailure(obj24);
                                    ScheduledTransactionPreference scheduledTransactionPreference2 = (ScheduledTransactionPreference) obj;
                                    if (scheduledTransactionPreference2 != null) {
                                        Boolean bool = scheduledTransactionPreference2.enabled;
                                        bool.getClass();
                                        boolean booleanValue = bool.booleanValue();
                                        Money money = scheduledTransactionPreference2.amount;
                                        money.getClass();
                                        RecurringSchedule recurringSchedule = scheduledTransactionPreference2.recurring_schedule;
                                        recurringSchedule.getClass();
                                        ScheduledTransactionPreference.Type type2 = scheduledTransactionPreference2.type;
                                        type2.getClass();
                                        autoInvestPreference = new AutoInvestPreference(booleanValue, money, recurringSchedule, type2, scheduledTransactionPreference2.next_reload_at, scheduledTransactionPreference2.investment_entity_token);
                                    } else {
                                        autoInvestPreference = null;
                                    }
                                    realAutoInvestRepo$preference$$inlined$map$2$2$1.label = 1;
                                    if (flowCollector.emit(autoInvestPreference, realAutoInvestRepo$preference$$inlined$map$2$2$1) == coroutineSingletons17) {
                                        break;
                                    }
                                } else if (i16 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                } else {
                                    SafeTrace.throwOnFailure(obj24);
                                }
                                break;
                            }
                        }
                        realAutoInvestRepo$preference$$inlined$map$2$2$1 = new RealAutoInvestRepo$preference$$inlined$map$2$2$1(this, continuation);
                        Object obj242 = realAutoInvestRepo$preference$$inlined$map$2$2$1.result;
                        CoroutineSingletons coroutineSingletons172 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i16 = realAutoInvestRepo$preference$$inlined$map$2$2$1.label;
                        if (i16 != 0) {
                        }
                    case 17:
                        if (continuation instanceof RealCategoryBackend$categoryDetails$$inlined$map$1$2$1) {
                            realCategoryBackend$categoryDetails$$inlined$map$1$2$1 = (RealCategoryBackend$categoryDetails$$inlined$map$1$2$1) continuation;
                            int i47 = realCategoryBackend$categoryDetails$$inlined$map$1$2$1.label;
                            if ((i47 & PKIFailureInfo.systemUnavail) != 0) {
                                realCategoryBackend$categoryDetails$$inlined$map$1$2$1.label = i47 - PKIFailureInfo.systemUnavail;
                                Object obj25 = realCategoryBackend$categoryDetails$$inlined$map$1$2$1.result;
                                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i17 = realCategoryBackend$categoryDetails$$inlined$map$1$2$1.label;
                                if (i17 != 0) {
                                    SafeTrace.throwOnFailure(obj25);
                                    List list4 = (List) obj;
                                    CategoryForToken categoryForToken = (CategoryForToken) list4.get(0);
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj26 : list4) {
                                        CategoryForToken categoryForToken2 = (CategoryForToken) obj26;
                                        if (categoryForToken2.filter_token != null && categoryForToken2.filterName != null) {
                                            arrayList.add(obj26);
                                        }
                                    }
                                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        CategoryForToken categoryForToken3 = (CategoryForToken) it.next();
                                        String str7 = categoryForToken3.filter_token;
                                        str7.getClass();
                                        FilterToken filterToken = new FilterToken(str7);
                                        String str8 = categoryForToken3.filterName;
                                        str8.getClass();
                                        arrayList2.add(new FilterGroup(filterToken, str8, categoryForToken3.filterNamePlural));
                                    }
                                    long j = categoryForToken.id;
                                    CategoryToken categoryToken = categoryForToken.token;
                                    String str9 = categoryForToken.categoryName;
                                    String str10 = categoryForToken.image_url;
                                    Color color4 = categoryForToken.category_color;
                                    if (color4 == null) {
                                        String str11 = categoryForToken.accent_color;
                                        if (str11 == null) {
                                            color = null;
                                            categoryDetails = new CategoryDetails(new Category(j, categoryToken, str9, str10, color, categoryForToken.description, categoryForToken.filter_description, categoryForToken.prefix_icon), arrayList2);
                                            realCategoryBackend$categoryDetails$$inlined$map$1$2$1.label = 1;
                                            if (flowCollector.emit(categoryDetails, realCategoryBackend$categoryDetails$$inlined$map$1$2$1) == coroutineSingletons18) {
                                                break;
                                            }
                                        } else {
                                            color4 = ColorsKt.toColor(str11);
                                        }
                                    }
                                    color = color4;
                                    categoryDetails = new CategoryDetails(new Category(j, categoryToken, str9, str10, color, categoryForToken.description, categoryForToken.filter_description, categoryForToken.prefix_icon), arrayList2);
                                    realCategoryBackend$categoryDetails$$inlined$map$1$2$1.label = 1;
                                    if (flowCollector.emit(categoryDetails, realCategoryBackend$categoryDetails$$inlined$map$1$2$1) == coroutineSingletons18) {
                                    }
                                } else if (i17 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                } else {
                                    SafeTrace.throwOnFailure(obj25);
                                }
                                break;
                            }
                        }
                        realCategoryBackend$categoryDetails$$inlined$map$1$2$1 = new RealCategoryBackend$categoryDetails$$inlined$map$1$2$1(this, continuation);
                        Object obj252 = realCategoryBackend$categoryDetails$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons182 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i17 = realCategoryBackend$categoryDetails$$inlined$map$1$2$1.label;
                        if (i17 != 0) {
                        }
                        break;
                    case 18:
                        if (continuation instanceof RealCategoryBackend$filterDetails$$inlined$map$1$2$1) {
                            realCategoryBackend$filterDetails$$inlined$map$1$2$1 = (RealCategoryBackend$filterDetails$$inlined$map$1$2$1) continuation;
                            int i48 = realCategoryBackend$filterDetails$$inlined$map$1$2$1.label;
                            if ((i48 & PKIFailureInfo.systemUnavail) != 0) {
                                realCategoryBackend$filterDetails$$inlined$map$1$2$1.label = i48 - PKIFailureInfo.systemUnavail;
                                Object obj27 = realCategoryBackend$filterDetails$$inlined$map$1$2$1.result;
                                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i18 = realCategoryBackend$filterDetails$$inlined$map$1$2$1.label;
                                if (i18 != 0) {
                                    SafeTrace.throwOnFailure(obj27);
                                    List list5 = (List) obj;
                                    FilterGroupForToken filterGroupForToken = (FilterGroupForToken) list5.get(0);
                                    List list6 = filterGroupForToken.subfilters;
                                    FilterToken filterToken2 = filterGroupForToken.filterToken;
                                    SyncInvestmentCategory.CategoryType categoryType = filterGroupForToken.f1155type;
                                    List list7 = list6;
                                    if (list7 == null || list7.isEmpty()) {
                                        String str12 = filterGroupForToken.filterName;
                                        categoryType.getClass();
                                        List list8 = list5;
                                        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list8, 10));
                                        Iterator it2 = list8.iterator();
                                        while (it2.hasNext()) {
                                            FilterGroupForToken filterGroupForToken2 = (FilterGroupForToken) it2.next();
                                            Long l = filterGroupForToken2.categoryId;
                                            l.getClass();
                                            long longValue = l.longValue();
                                            String str13 = filterGroupForToken2.categoryName;
                                            str13.getClass();
                                            CategoryToken categoryToken2 = filterGroupForToken2.categoryToken;
                                            categoryToken2.getClass();
                                            String str14 = filterGroupForToken2.image_url;
                                            String str15 = filterGroupForToken2.description;
                                            String str16 = filterGroupForToken2.filter_description;
                                            SyncInvestmentCategory.PrefixIcon prefixIcon = filterGroupForToken2.prefix_icon;
                                            Iterator it3 = it2;
                                            Color color5 = filterGroupForToken2.category_color;
                                            if (color5 == null) {
                                                String str17 = filterGroupForToken2.accent_color;
                                                if (str17 != null) {
                                                    color5 = ColorsKt.toColor(str17);
                                                } else {
                                                    str = str15;
                                                    color2 = null;
                                                    arrayList3.add(new Category(longValue, categoryToken2, str13, str14, color2, str, str16, prefixIcon));
                                                    it2 = it3;
                                                }
                                            }
                                            color2 = color5;
                                            str = str15;
                                            arrayList3.add(new Category(longValue, categoryToken2, str13, str14, color2, str, str16, prefixIcon));
                                            it2 = it3;
                                        }
                                        categories = new FilterDetails.Categories(filterToken2, str12, categoryType, arrayList3);
                                        i19 = 1;
                                    } else {
                                        String str18 = filterGroupForToken.filterName;
                                        if (categoryType == null) {
                                            categoryType = SyncInvestmentCategory.CategoryType.TOP_LEVEL_UI;
                                        }
                                        List list9 = filterGroupForToken.subfilters;
                                        list9.getClass();
                                        List list10 = filterGroupForToken.category_map;
                                        list10.getClass();
                                        categories = new FilterDetails.Subfilters(filterToken2, str18, categoryType, list9, list10);
                                        i19 = 1;
                                    }
                                    realCategoryBackend$filterDetails$$inlined$map$1$2$1.label = i19;
                                    if (flowCollector.emit(categories, realCategoryBackend$filterDetails$$inlined$map$1$2$1) == coroutineSingletons19) {
                                        break;
                                    }
                                } else if (i18 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                } else {
                                    SafeTrace.throwOnFailure(obj27);
                                }
                                break;
                            }
                        }
                        realCategoryBackend$filterDetails$$inlined$map$1$2$1 = new RealCategoryBackend$filterDetails$$inlined$map$1$2$1(this, continuation);
                        Object obj272 = realCategoryBackend$filterDetails$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons192 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i18 = realCategoryBackend$filterDetails$$inlined$map$1$2$1.label;
                        if (i18 != 0) {
                        }
                        break;
                    case 19:
                        if (continuation instanceof RealCategoryBackend$performSearch$$inlined$map$1$2$1) {
                            realCategoryBackend$performSearch$$inlined$map$1$2$1 = (RealCategoryBackend$performSearch$$inlined$map$1$2$1) continuation;
                            int i49 = realCategoryBackend$performSearch$$inlined$map$1$2$1.label;
                            if ((i49 & PKIFailureInfo.systemUnavail) != 0) {
                                realCategoryBackend$performSearch$$inlined$map$1$2$1.label = i49 - PKIFailureInfo.systemUnavail;
                                Object obj28 = realCategoryBackend$performSearch$$inlined$map$1$2$1.result;
                                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i20 = realCategoryBackend$performSearch$$inlined$map$1$2$1.label;
                                if (i20 != 0) {
                                    SafeTrace.throwOnFailure(obj28);
                                    List list11 = (List) obj;
                                    ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list11, 10));
                                    Iterator it4 = list11.iterator();
                                    while (it4.hasNext()) {
                                        arrayList4.add(new SearchResult.CategorySearchResult((Category) it4.next()));
                                    }
                                    realCategoryBackend$performSearch$$inlined$map$1$2$1.label = 1;
                                    if (flowCollector.emit(arrayList4, realCategoryBackend$performSearch$$inlined$map$1$2$1) == coroutineSingletons20) {
                                        break;
                                    }
                                } else if (i20 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                } else {
                                    SafeTrace.throwOnFailure(obj28);
                                }
                                break;
                            }
                        }
                        realCategoryBackend$performSearch$$inlined$map$1$2$1 = new RealCategoryBackend$performSearch$$inlined$map$1$2$1(this, continuation);
                        Object obj282 = realCategoryBackend$performSearch$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons202 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i20 = realCategoryBackend$performSearch$$inlined$map$1$2$1.label;
                        if (i20 != 0) {
                        }
                    case 20:
                        Object emit2 = flowCollector.emit((GetETFDetailsResponse) obj, continuation);
                        if (emit2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            break;
                        }
                        break;
                    case 21:
                        if (continuation instanceof EventRepeater$observe$1$1$invokeSuspend$$inlined$map$1$2$1) {
                            eventRepeater$observe$1$1$invokeSuspend$$inlined$map$1$2$1 = (EventRepeater$observe$1$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                            int i50 = eventRepeater$observe$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                            if ((i50 & PKIFailureInfo.systemUnavail) != 0) {
                                eventRepeater$observe$1$1$invokeSuspend$$inlined$map$1$2$1.label = i50 - PKIFailureInfo.systemUnavail;
                                Object obj29 = eventRepeater$observe$1$1$invokeSuspend$$inlined$map$1$2$1.result;
                                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i21 = eventRepeater$observe$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                                if (i21 != 0) {
                                    SafeTrace.throwOnFailure(obj29);
                                    Unit unit = Unit.INSTANCE;
                                    eventRepeater$observe$1$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                                    if (flowCollector.emit(unit, eventRepeater$observe$1$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons21) {
                                        break;
                                    }
                                } else if (i21 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                } else {
                                    SafeTrace.throwOnFailure(obj29);
                                }
                                break;
                            }
                        }
                        eventRepeater$observe$1$1$invokeSuspend$$inlined$map$1$2$1 = new EventRepeater$observe$1$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                        Object obj292 = eventRepeater$observe$1$1$invokeSuspend$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons212 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i21 = eventRepeater$observe$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                        if (i21 != 0) {
                        }
                    case 22:
                        if (continuation instanceof InvestingDiscoveryPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1) {
                            investingDiscoveryPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1 = (InvestingDiscoveryPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1) continuation;
                            int i51 = investingDiscoveryPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1.label;
                            if ((i51 & PKIFailureInfo.systemUnavail) != 0) {
                                investingDiscoveryPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1.label = i51 - PKIFailureInfo.systemUnavail;
                                Object obj30 = investingDiscoveryPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1.result;
                                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i22 = investingDiscoveryPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1.label;
                                if (i22 != 0) {
                                    SafeTrace.throwOnFailure(obj30);
                                    if (obj instanceof InvestingHomeViewEvent.NewsEvent) {
                                        investingDiscoveryPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1.label = 1;
                                        if (flowCollector.emit(obj, investingDiscoveryPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1) == coroutineSingletons22) {
                                            break;
                                        }
                                    }
                                } else if (i22 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                } else {
                                    SafeTrace.throwOnFailure(obj30);
                                }
                                break;
                            }
                        }
                        investingDiscoveryPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1 = new InvestingDiscoveryPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1(this, continuation);
                        Object obj302 = investingDiscoveryPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i22 = investingDiscoveryPresenter$models$lambda$2$$inlined$filterIsInstance$1$2$1.label;
                        if (i22 != 0) {
                        }
                    case 23:
                        if (continuation instanceof InvestingDiscoveryPresenter$models$lambda$2$$inlined$map$1$2$1) {
                            investingDiscoveryPresenter$models$lambda$2$$inlined$map$1$2$1 = (InvestingDiscoveryPresenter$models$lambda$2$$inlined$map$1$2$1) continuation;
                            int i52 = investingDiscoveryPresenter$models$lambda$2$$inlined$map$1$2$1.label;
                            if ((i52 & PKIFailureInfo.systemUnavail) != 0) {
                                investingDiscoveryPresenter$models$lambda$2$$inlined$map$1$2$1.label = i52 - PKIFailureInfo.systemUnavail;
                                Object obj31 = investingDiscoveryPresenter$models$lambda$2$$inlined$map$1$2$1.result;
                                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i23 = investingDiscoveryPresenter$models$lambda$2$$inlined$map$1$2$1.label;
                                if (i23 != 0) {
                                    SafeTrace.throwOnFailure(obj31);
                                    InvestingCryptoNewsViewEvent investingCryptoNewsViewEvent = ((InvestingHomeViewEvent.NewsEvent) obj).event;
                                    investingDiscoveryPresenter$models$lambda$2$$inlined$map$1$2$1.label = 1;
                                    if (flowCollector.emit(investingCryptoNewsViewEvent, investingDiscoveryPresenter$models$lambda$2$$inlined$map$1$2$1) == coroutineSingletons23) {
                                        break;
                                    }
                                } else if (i23 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                } else {
                                    SafeTrace.throwOnFailure(obj31);
                                }
                                break;
                            }
                        }
                        investingDiscoveryPresenter$models$lambda$2$$inlined$map$1$2$1 = new InvestingDiscoveryPresenter$models$lambda$2$$inlined$map$1$2$1(this, continuation);
                        Object obj312 = investingDiscoveryPresenter$models$lambda$2$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons232 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i23 = investingDiscoveryPresenter$models$lambda$2$$inlined$map$1$2$1.label;
                        if (i23 != 0) {
                        }
                    case 24:
                        if (continuation instanceof InvestingDiscoveryPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1) {
                            investingDiscoveryPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1 = (InvestingDiscoveryPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1) continuation;
                            int i53 = investingDiscoveryPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1.label;
                            if ((i53 & PKIFailureInfo.systemUnavail) != 0) {
                                investingDiscoveryPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1.label = i53 - PKIFailureInfo.systemUnavail;
                                Object obj33 = investingDiscoveryPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1.result;
                                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i24 = investingDiscoveryPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1.label;
                                if (i24 != 0) {
                                    SafeTrace.throwOnFailure(obj33);
                                    if (obj instanceof InvestingHomeViewEvent.SelectHistoricalRange) {
                                        investingDiscoveryPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1.label = 1;
                                        if (flowCollector.emit(obj, investingDiscoveryPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1) == coroutineSingletons24) {
                                            break;
                                        }
                                    }
                                } else if (i24 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                } else {
                                    SafeTrace.throwOnFailure(obj33);
                                }
                                break;
                            }
                        }
                        investingDiscoveryPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1 = new InvestingDiscoveryPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1(this, continuation);
                        Object obj332 = investingDiscoveryPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons242 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i24 = investingDiscoveryPresenter$models$lambda$5$$inlined$filterIsInstance$1$2$1.label;
                        if (i24 != 0) {
                        }
                    case 25:
                        if (continuation instanceof InvestingHomePresenter$models$lambda$0$$inlined$map$1$2$1) {
                            investingHomePresenter$models$lambda$0$$inlined$map$1$2$1 = (InvestingHomePresenter$models$lambda$0$$inlined$map$1$2$1) continuation;
                            int i54 = investingHomePresenter$models$lambda$0$$inlined$map$1$2$1.label;
                            if ((i54 & PKIFailureInfo.systemUnavail) != 0) {
                                investingHomePresenter$models$lambda$0$$inlined$map$1$2$1.label = i54 - PKIFailureInfo.systemUnavail;
                                Object obj34 = investingHomePresenter$models$lambda$0$$inlined$map$1$2$1.result;
                                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i25 = investingHomePresenter$models$lambda$0$$inlined$map$1$2$1.label;
                                if (i25 != 0) {
                                    SafeTrace.throwOnFailure(obj34);
                                    Boolean valueOf = Boolean.valueOf(((FeatureFlag$EnabledDisabledFeatureFlag$Options) obj).enabled());
                                    investingHomePresenter$models$lambda$0$$inlined$map$1$2$1.label = 1;
                                    if (flowCollector.emit(valueOf, investingHomePresenter$models$lambda$0$$inlined$map$1$2$1) == coroutineSingletons25) {
                                        break;
                                    }
                                } else if (i25 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                } else {
                                    SafeTrace.throwOnFailure(obj34);
                                }
                                break;
                            }
                        }
                        investingHomePresenter$models$lambda$0$$inlined$map$1$2$1 = new InvestingHomePresenter$models$lambda$0$$inlined$map$1$2$1(this, continuation);
                        Object obj342 = investingHomePresenter$models$lambda$0$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons252 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i25 = investingHomePresenter$models$lambda$0$$inlined$map$1$2$1.label;
                        if (i25 != 0) {
                        }
                    case 26:
                        if (continuation instanceof InvestingHomePresenter$models$lambda$2$$inlined$map$1$2$1) {
                            investingHomePresenter$models$lambda$2$$inlined$map$1$2$1 = (InvestingHomePresenter$models$lambda$2$$inlined$map$1$2$1) continuation;
                            int i55 = investingHomePresenter$models$lambda$2$$inlined$map$1$2$1.label;
                            if ((i55 & PKIFailureInfo.systemUnavail) != 0) {
                                investingHomePresenter$models$lambda$2$$inlined$map$1$2$1.label = i55 - PKIFailureInfo.systemUnavail;
                                Object obj35 = investingHomePresenter$models$lambda$2$$inlined$map$1$2$1.result;
                                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i26 = investingHomePresenter$models$lambda$2$$inlined$map$1$2$1.label;
                                if (i26 != 0) {
                                    SafeTrace.throwOnFailure(obj35);
                                    Boolean valueOf2 = Boolean.valueOf(((ActivityEvent) obj).started);
                                    investingHomePresenter$models$lambda$2$$inlined$map$1$2$1.label = 1;
                                    if (flowCollector.emit(valueOf2, investingHomePresenter$models$lambda$2$$inlined$map$1$2$1) == coroutineSingletons26) {
                                        break;
                                    }
                                } else if (i26 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                } else {
                                    SafeTrace.throwOnFailure(obj35);
                                }
                                break;
                            }
                        }
                        investingHomePresenter$models$lambda$2$$inlined$map$1$2$1 = new InvestingHomePresenter$models$lambda$2$$inlined$map$1$2$1(this, continuation);
                        Object obj352 = investingHomePresenter$models$lambda$2$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons262 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i26 = investingHomePresenter$models$lambda$2$$inlined$map$1$2$1.label;
                        if (i26 != 0) {
                        }
                    case 27:
                        if (continuation instanceof InvestingPortfolioPresenter$isDataStale$$inlined$map$1$2$1) {
                            investingPortfolioPresenter$isDataStale$$inlined$map$1$2$1 = (InvestingPortfolioPresenter$isDataStale$$inlined$map$1$2$1) continuation;
                            int i56 = investingPortfolioPresenter$isDataStale$$inlined$map$1$2$1.label;
                            if ((i56 & PKIFailureInfo.systemUnavail) != 0) {
                                investingPortfolioPresenter$isDataStale$$inlined$map$1$2$1.label = i56 - PKIFailureInfo.systemUnavail;
                                Object obj36 = investingPortfolioPresenter$isDataStale$$inlined$map$1$2$1.result;
                                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i27 = investingPortfolioPresenter$isDataStale$$inlined$map$1$2$1.label;
                                if (i27 != 0) {
                                    SafeTrace.throwOnFailure(obj36);
                                    Pair pair = (Pair) obj;
                                    Boolean valueOf3 = Boolean.valueOf(((PolledData) pair.first).isStale || ((PolledData) pair.second).isStale);
                                    investingPortfolioPresenter$isDataStale$$inlined$map$1$2$1.label = 1;
                                    if (flowCollector.emit(valueOf3, investingPortfolioPresenter$isDataStale$$inlined$map$1$2$1) == coroutineSingletons27) {
                                        break;
                                    }
                                } else if (i27 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                } else {
                                    SafeTrace.throwOnFailure(obj36);
                                }
                                break;
                            }
                        }
                        investingPortfolioPresenter$isDataStale$$inlined$map$1$2$1 = new InvestingPortfolioPresenter$isDataStale$$inlined$map$1$2$1(this, continuation);
                        Object obj362 = investingPortfolioPresenter$isDataStale$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons272 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i27 = investingPortfolioPresenter$isDataStale$$inlined$map$1$2$1.label;
                        if (i27 != 0) {
                        }
                        break;
                    case 28:
                        if (continuation instanceof InvestingPortfolioPresenter$models$lambda$10$$inlined$filterIsInstance$1$2$1) {
                            investingPortfolioPresenter$models$lambda$10$$inlined$filterIsInstance$1$2$1 = (InvestingPortfolioPresenter$models$lambda$10$$inlined$filterIsInstance$1$2$1) continuation;
                            int i57 = investingPortfolioPresenter$models$lambda$10$$inlined$filterIsInstance$1$2$1.label;
                            if ((i57 & PKIFailureInfo.systemUnavail) != 0) {
                                investingPortfolioPresenter$models$lambda$10$$inlined$filterIsInstance$1$2$1.label = i57 - PKIFailureInfo.systemUnavail;
                                Object obj37 = investingPortfolioPresenter$models$lambda$10$$inlined$filterIsInstance$1$2$1.result;
                                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i28 = investingPortfolioPresenter$models$lambda$10$$inlined$filterIsInstance$1$2$1.label;
                                if (i28 != 0) {
                                    SafeTrace.throwOnFailure(obj37);
                                    if (obj instanceof InvestingHomeViewEvent.NewsEvent) {
                                        investingPortfolioPresenter$models$lambda$10$$inlined$filterIsInstance$1$2$1.label = 1;
                                        if (flowCollector.emit(obj, investingPortfolioPresenter$models$lambda$10$$inlined$filterIsInstance$1$2$1) == coroutineSingletons28) {
                                            break;
                                        }
                                    }
                                } else if (i28 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                } else {
                                    SafeTrace.throwOnFailure(obj37);
                                }
                                break;
                            }
                        }
                        investingPortfolioPresenter$models$lambda$10$$inlined$filterIsInstance$1$2$1 = new InvestingPortfolioPresenter$models$lambda$10$$inlined$filterIsInstance$1$2$1(this, continuation);
                        Object obj372 = investingPortfolioPresenter$models$lambda$10$$inlined$filterIsInstance$1$2$1.result;
                        CoroutineSingletons coroutineSingletons282 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i28 = investingPortfolioPresenter$models$lambda$10$$inlined$filterIsInstance$1$2$1.label;
                        if (i28 != 0) {
                        }
                    default:
                        if (continuation instanceof InvestingPortfolioPresenter$models$lambda$10$$inlined$map$1$2$1) {
                            investingPortfolioPresenter$models$lambda$10$$inlined$map$1$2$1 = (InvestingPortfolioPresenter$models$lambda$10$$inlined$map$1$2$1) continuation;
                            int i58 = investingPortfolioPresenter$models$lambda$10$$inlined$map$1$2$1.label;
                            if ((i58 & PKIFailureInfo.systemUnavail) != 0) {
                                investingPortfolioPresenter$models$lambda$10$$inlined$map$1$2$1.label = i58 - PKIFailureInfo.systemUnavail;
                                Object obj38 = investingPortfolioPresenter$models$lambda$10$$inlined$map$1$2$1.result;
                                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i29 = investingPortfolioPresenter$models$lambda$10$$inlined$map$1$2$1.label;
                                if (i29 != 0) {
                                    SafeTrace.throwOnFailure(obj38);
                                    InvestingCryptoNewsViewEvent investingCryptoNewsViewEvent2 = ((InvestingHomeViewEvent.NewsEvent) obj).event;
                                    investingPortfolioPresenter$models$lambda$10$$inlined$map$1$2$1.label = 1;
                                    if (flowCollector.emit(investingCryptoNewsViewEvent2, investingPortfolioPresenter$models$lambda$10$$inlined$map$1$2$1) == coroutineSingletons29) {
                                        break;
                                    }
                                } else if (i29 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                } else {
                                    SafeTrace.throwOnFailure(obj38);
                                }
                                break;
                            }
                        }
                        investingPortfolioPresenter$models$lambda$10$$inlined$map$1$2$1 = new InvestingPortfolioPresenter$models$lambda$10$$inlined$map$1$2$1(this, continuation);
                        Object obj382 = investingPortfolioPresenter$models$lambda$10$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons292 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i29 = investingPortfolioPresenter$models$lambda$10$$inlined$map$1$2$1.label;
                        if (i29 != 0) {
                        }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(InvestmentEntityToken investmentEntityToken, RealInvestingMetrics realInvestingMetrics, FlowCollector flowCollector, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.$entityToken = investmentEntityToken;
            this.this$0 = realInvestingMetrics;
            this.$$this$flow = flowCollector;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            switch (this.$r8$classId) {
                case 0:
                    return new AnonymousClass1(this.$entityToken, this.this$0, this.$$this$flow, continuation, 0);
                default:
                    return new AnonymousClass1(this.$entityToken, this.this$0, this.$$this$flow, continuation, 1);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            CoroutineScope coroutineScope = (CoroutineScope) obj;
            Continuation continuation = (Continuation) obj2;
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x00a2, code lost:
        
            if (r3.collect(r13, r12) == r0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
        
            if (kotlinx.coroutines.JobKt.delay(r1, r12) != r0) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x004e, code lost:
        
            if (r13 == r0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x013a, code lost:
        
            if (r5.collect(r13, r12) == r0) goto L65;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x011f, code lost:
        
            if (kotlinx.coroutines.JobKt.m4182delayVtjQ1oo(r10, r12) != r0) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x00e5, code lost:
        
            if (r13 == r0) goto L65;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            long j;
            long j2;
            int i = this.$r8$classId;
            InvestmentEntityToken investmentEntityToken = this.$entityToken;
            RealInvestingMetrics realInvestingMetrics = this.this$0;
            FlowCollector flowCollector = this.$$this$flow;
            int i2 = 1;
            Continuation continuation = null;
            switch (i) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.label;
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        GetInvestingMetricsRequest getInvestingMetricsRequest = new GetInvestingMetricsRequest(investmentEntityToken.value, ByteString.EMPTY);
                        InvestingMetricsService investingMetricsService = realInvestingMetrics.service;
                        this.label = 1;
                        obj = investingMetricsService.getInvestingMetrics(getInvestingMetricsRequest, this);
                        break;
                    } else if (i3 == 1) {
                        SafeTrace.throwOnFailure(obj);
                    } else if (i3 == 2) {
                        j = this.J$0;
                        SafeTrace.throwOnFailure(obj);
                        Duration.Companion companion = Duration.Companion;
                        long duration = DurationKt.toDuration(j, DurationUnit.MILLISECONDS);
                        this.J$0 = j;
                        this.label = 3;
                        break;
                    } else if (i3 == 3) {
                        j = this.J$0;
                        SafeTrace.throwOnFailure(obj);
                        int i4 = 0;
                        SafeFlow safeFlow = new SafeFlow(new RealInvestingMetrics$createMetricsFlow$1(i4, realInvestingMetrics, investmentEntityToken, continuation));
                        C00621 c00621 = new C00621(flowCollector, i4);
                        this.J$0 = j;
                        this.label = 4;
                        break;
                    } else if (i3 != 4) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        break;
                    }
                    ApiResult apiResult = (ApiResult) obj;
                    if (apiResult instanceof ApiResult.Success) {
                        GetInvestingMetricsResponse getInvestingMetricsResponse = (GetInvestingMetricsResponse) ((ApiResult.Success) apiResult).response;
                        Long l = getInvestingMetricsResponse.next_refresh_ms;
                        long longValue = l != null ? l.longValue() : Duration.m4167getInWholeMillisecondsimpl(RealInvestmentEntitiesKt.INVESTING_LIVE_INTERVAL);
                        this.J$0 = longValue;
                        this.label = 2;
                        if (flowCollector.emit(getInvestingMetricsResponse, this) != coroutineSingletons) {
                            j = longValue;
                            Duration.Companion companion2 = Duration.Companion;
                            long duration2 = DurationKt.toDuration(j, DurationUnit.MILLISECONDS);
                            this.J$0 = j;
                            this.label = 3;
                        }
                        break;
                    }
                default:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i5 = this.label;
                    if (i5 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        GetETFDetailsRequest getETFDetailsRequest = new GetETFDetailsRequest(investmentEntityToken.value, ByteString.EMPTY);
                        InvestingMetricsService investingMetricsService2 = realInvestingMetrics.service;
                        this.label = 1;
                        obj = investingMetricsService2.getETFDetails(getETFDetailsRequest, this);
                        break;
                    } else if (i5 == 1) {
                        SafeTrace.throwOnFailure(obj);
                    } else if (i5 == 2) {
                        j2 = this.J$0;
                        SafeTrace.throwOnFailure(obj);
                        this.J$0 = j2;
                        this.label = 3;
                        break;
                    } else if (i5 == 3) {
                        j2 = this.J$0;
                        SafeTrace.throwOnFailure(obj);
                        SafeFlow safeFlow2 = new SafeFlow(new RealInvestingMetrics$createMetricsFlow$1(i2, realInvestingMetrics, investmentEntityToken, continuation));
                        C00621 c006212 = new C00621(flowCollector, 20);
                        this.J$0 = j2;
                        this.label = 4;
                        break;
                    } else if (i5 != 4) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        break;
                    }
                    ApiResult apiResult2 = (ApiResult) obj;
                    if (apiResult2 instanceof ApiResult.Success) {
                        GetETFDetailsResponse getETFDetailsResponse = (GetETFDetailsResponse) ((ApiResult.Success) apiResult2).response;
                        Long l2 = getETFDetailsResponse.next_refresh_mins;
                        long millis = l2 != null ? TimeUnit.MINUTES.toMillis(l2.longValue()) : Duration.m4167getInWholeMillisecondsimpl(RealInvestmentEntitiesKt.INVESTING_ETF_LIVE_INTERVAL);
                        this.J$0 = millis;
                        this.label = 2;
                        if (flowCollector.emit(getETFDetailsResponse, this) != coroutineSingletons2) {
                            j2 = millis;
                            this.J$0 = j2;
                            this.label = 3;
                        }
                        break;
                    }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealInvestingMetrics$createMetricsFlow$1(int i, RealInvestingMetrics realInvestingMetrics, InvestmentEntityToken investmentEntityToken, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$entityToken = investmentEntityToken;
        this.this$0 = realInvestingMetrics;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        RealInvestingMetrics realInvestingMetrics = this.this$0;
        InvestmentEntityToken investmentEntityToken = this.$entityToken;
        switch (i) {
            case 0:
                RealInvestingMetrics$createMetricsFlow$1 realInvestingMetrics$createMetricsFlow$1 = new RealInvestingMetrics$createMetricsFlow$1(0, realInvestingMetrics, investmentEntityToken, continuation);
                realInvestingMetrics$createMetricsFlow$1.L$0 = obj;
                return realInvestingMetrics$createMetricsFlow$1;
            default:
                RealInvestingMetrics$createMetricsFlow$1 realInvestingMetrics$createMetricsFlow$12 = new RealInvestingMetrics$createMetricsFlow$1(1, realInvestingMetrics, investmentEntityToken, continuation);
                realInvestingMetrics$createMetricsFlow$12.L$0 = obj;
                return realInvestingMetrics$createMetricsFlow$12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        FlowCollector flowCollector = (FlowCollector) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealInvestingMetrics$createMetricsFlow$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$entityToken, this.this$0, flowCollector, null, 0);
                    this.L$0 = null;
                    this.label = 1;
                    if (JobKt.coroutineScope(anonymousClass1, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AnonymousClass1 anonymousClass12 = new AnonymousClass1(this.$entityToken, this.this$0, flowCollector2, null, 1);
                    this.L$0 = null;
                    this.label = 1;
                    if (JobKt.coroutineScope(anonymousClass12, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

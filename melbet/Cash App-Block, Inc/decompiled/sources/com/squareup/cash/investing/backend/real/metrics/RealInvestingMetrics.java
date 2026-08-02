package com.squareup.cash.investing.backend.real.metrics;

import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.history.presenters.CheckStatusPresenter;
import com.squareup.cash.investing.backend.real.RealEntityPriceRefresher;
import com.squareup.cash.investing.backend.real.RealInvestmentEntitiesKt;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.sharesheet.RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.marketdata.server.GetETFDetailsResponse;
import com.squareup.protos.cash.marketdata.server.GetInvestingMetricsResponse;
import com.squareup.protos.cash.marketdata.server.InvestingMetricsService;
import com.squareup.protos.invest.ui.ClientDriven;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1;
import kotlinx.coroutines.flow.ReadonlySharedFlow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.StartedWhileSubscribed;

/* loaded from: classes6.dex */
public final class RealInvestingMetrics {
    public final AndroidClock clock;
    public final RealEntityPriceRefresher entityPriceRefresher;
    public final CoroutineContext ioDispatcher;
    public final MoneyFormatter moneyFormatter;
    public final CoroutineScope scope;
    public final InvestingMetricsService service;
    public final LinkedHashMap metricsResponses = new LinkedHashMap();
    public final LinkedHashMap etfDetailsResponses = new LinkedHashMap();
    public final LinkedHashMap activeMetricStreams = new LinkedHashMap();
    public final LinkedHashMap activeETFDetailsStreams = new LinkedHashMap();

    public final class CachedETFDetailsResponse {
        public final GetETFDetailsResponse response;
        public final long timeReceived;

        public CachedETFDetailsResponse(GetETFDetailsResponse getETFDetailsResponse, long j) {
            getETFDetailsResponse.getClass();
            this.response = getETFDetailsResponse;
            this.timeReceived = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CachedETFDetailsResponse)) {
                return false;
            }
            CachedETFDetailsResponse cachedETFDetailsResponse = (CachedETFDetailsResponse) obj;
            return Intrinsics.areEqual(this.response, cachedETFDetailsResponse.response) && this.timeReceived == cachedETFDetailsResponse.timeReceived;
        }

        public final int hashCode() {
            return Long.hashCode(this.timeReceived) + (this.response.hashCode() * 31);
        }

        public final String toString() {
            return "CachedETFDetailsResponse(response=" + this.response + ", timeReceived=" + this.timeReceived + ")";
        }
    }

    public final class CachedMetricsResponse {
        public final GetInvestingMetricsResponse response;
        public final long timeReceived;

        public CachedMetricsResponse(GetInvestingMetricsResponse getInvestingMetricsResponse, long j) {
            getInvestingMetricsResponse.getClass();
            this.response = getInvestingMetricsResponse;
            this.timeReceived = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CachedMetricsResponse)) {
                return false;
            }
            CachedMetricsResponse cachedMetricsResponse = (CachedMetricsResponse) obj;
            return Intrinsics.areEqual(this.response, cachedMetricsResponse.response) && this.timeReceived == cachedMetricsResponse.timeReceived;
        }

        public final int hashCode() {
            return Long.hashCode(this.timeReceived) + (this.response.hashCode() * 31);
        }

        public final String toString() {
            return "CachedMetricsResponse(response=" + this.response + ", timeReceived=" + this.timeReceived + ")";
        }
    }

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClientDriven.values().length];
            try {
                ClientDriven.Companion companion = ClientDriven.Companion;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RealInvestingMetrics(LocalizedMoneyFormatter.Factory factory, InvestingMetricsService investingMetricsService, AndroidClock androidClock, RealEntityPriceRefresher realEntityPriceRefresher, CoroutineContext coroutineContext, CoroutineScope coroutineScope) {
        this.service = investingMetricsService;
        this.clock = androidClock;
        this.entityPriceRefresher = realEntityPriceRefresher;
        this.ioDispatcher = coroutineContext;
        this.scope = coroutineScope;
        this.moneyFormatter = factory.create(MoneyFormatterConfig.STANDARD);
    }

    public final Flow getETFMetrics(InvestmentEntityToken investmentEntityToken) {
        long m4167getInWholeMillisecondsimpl;
        investmentEntityToken.getClass();
        synchronized (this.activeETFDetailsStreams) {
            try {
                Flow flow = (Flow) this.activeETFDetailsStreams.get(investmentEntityToken);
                if (flow != null) {
                    return flow;
                }
                int i = 1;
                Continuation continuation = null;
                FlowKt__MergeKt$flatMapConcat$$inlined$map$1 flowKt__MergeKt$flatMapConcat$$inlined$map$1 = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new FlowKt__MergeKt$flatMapMerge$$inlined$map$1(4, new SafeFlow(new RealInvestingMetrics$createMetricsFlow$1(i, this, investmentEntityToken, continuation)), new RealInvestingMetrics$getMetrics$1$stream$1(i, this, investmentEntityToken, continuation)), new RealInvestingMetrics$getMetrics$1$stream$3(i, this, investmentEntityToken, continuation), 3);
                CachedETFDetailsResponse cachedETFDetailsResponse = (CachedETFDetailsResponse) this.etfDetailsResponses.get(investmentEntityToken);
                if (cachedETFDetailsResponse != null) {
                    Long l = cachedETFDetailsResponse.response.next_refresh_mins;
                    if (l != null) {
                        m4167getInWholeMillisecondsimpl = TimeUnit.MINUTES.toMillis(l.longValue());
                    } else {
                        m4167getInWholeMillisecondsimpl = Duration.m4167getInWholeMillisecondsimpl(RealInvestmentEntitiesKt.INVESTING_ETF_LIVE_INTERVAL);
                    }
                    long millis = (cachedETFDetailsResponse.timeReceived + m4167getInWholeMillisecondsimpl) - this.clock.millis();
                    if (millis > 0) {
                        flowKt__MergeKt$flatMapConcat$$inlined$map$1 = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new RealInvestingMetrics$getMetrics$1$2$1(millis, continuation, i), flowKt__MergeKt$flatMapConcat$$inlined$map$1);
                    }
                    flowKt__MergeKt$flatMapConcat$$inlined$map$1 = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new CheckStatusPresenter.AnonymousClass1(cachedETFDetailsResponse, continuation, 12), flowKt__MergeKt$flatMapConcat$$inlined$map$1);
                }
                ReadonlySharedFlow shareIn = FlowKt.shareIn(flowKt__MergeKt$flatMapConcat$$inlined$map$1, JobKt.plus(this.ioDispatcher, this.scope), new StartedWhileSubscribed(0L, Long.MAX_VALUE), 1);
                this.activeETFDetailsStreams.put(investmentEntityToken, shareIn);
                return shareIn;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Flow getMetrics(InvestmentEntityToken investmentEntityToken) {
        investmentEntityToken.getClass();
        synchronized (this.activeMetricStreams) {
            try {
                Flow flow = (Flow) this.activeMetricStreams.get(investmentEntityToken);
                if (flow != null) {
                    return flow;
                }
                int i = 0;
                Continuation continuation = null;
                FlowKt__MergeKt$flatMapConcat$$inlined$map$1 flowKt__MergeKt$flatMapConcat$$inlined$map$1 = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(FlowKt.transformLatest(new FlowKt__MergeKt$flatMapMerge$$inlined$map$1(4, new SafeFlow(new RealInvestingMetrics$createMetricsFlow$1(i, this, investmentEntityToken, continuation)), new RealInvestingMetrics$getMetrics$1$stream$1(i, this, investmentEntityToken, continuation)), new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1(continuation, this, investmentEntityToken, 16)), new RealInvestingMetrics$getMetrics$1$stream$3(i, this, investmentEntityToken, continuation), 3);
                CachedMetricsResponse cachedMetricsResponse = (CachedMetricsResponse) this.metricsResponses.get(investmentEntityToken);
                if (cachedMetricsResponse != null) {
                    Long l = cachedMetricsResponse.response.next_refresh_ms;
                    long longValue = (cachedMetricsResponse.timeReceived + (l != null ? l.longValue() : Duration.m4167getInWholeMillisecondsimpl(RealInvestmentEntitiesKt.INVESTING_LIVE_INTERVAL))) - this.clock.millis();
                    if (longValue > 0) {
                        flowKt__MergeKt$flatMapConcat$$inlined$map$1 = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new RealInvestingMetrics$getMetrics$1$2$1(longValue, continuation, i), flowKt__MergeKt$flatMapConcat$$inlined$map$1);
                    }
                    flowKt__MergeKt$flatMapConcat$$inlined$map$1 = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new CheckStatusPresenter.AnonymousClass1(cachedMetricsResponse, continuation, 13), flowKt__MergeKt$flatMapConcat$$inlined$map$1);
                }
                ReadonlySharedFlow shareIn = FlowKt.shareIn(flowKt__MergeKt$flatMapConcat$$inlined$map$1, JobKt.plus(this.ioDispatcher, this.scope), new StartedWhileSubscribed(0L, Long.MAX_VALUE), 1);
                this.activeMetricStreams.put(investmentEntityToken, shareIn);
                return shareIn;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package com.squareup.cash.earningstracker.backend.real;

import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzhx;
import com.squareup.cash.cdf.earningstracker.EarningsTrackerFetchAttempt;
import com.squareup.cash.cdf.earningstracker.EarningsTrackerFetchSuccess;
import com.squareup.cash.cdf.earningstracker.Timeframe;
import com.squareup.cash.datefilterbar.backend.api.DateFilter;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.C4BClientService;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.EarningsTrackerDataRequest;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.LinkedHashMap;
import kotlin.Triple;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealEarningsTrackerRepository {
    public final LinkedHashMap cache = new LinkedHashMap();
    public final AndroidClock clock;
    public final RealEarningsTrackerAnalytics earningsTrackerAnalytics;
    public final C4BClientService service;

    public RealEarningsTrackerRepository(C4BClientService c4BClientService, RealEarningsTrackerAnalytics realEarningsTrackerAnalytics, AndroidClock androidClock) {
        this.service = c4BClientService;
        this.earningsTrackerAnalytics = realEarningsTrackerAnalytics;
        this.clock = androidClock;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$loadEarningsTrackerDataFromNetwork(RealEarningsTrackerRepository realEarningsTrackerRepository, DateFilter dateFilter, ContinuationImpl continuationImpl) {
        RealEarningsTrackerRepository$loadEarningsTrackerDataFromNetwork$1 realEarningsTrackerRepository$loadEarningsTrackerDataFromNetwork$1;
        int i;
        EarningsTrackerDataRequest earningsTrackerDataRequest;
        long elapsedRealtime;
        ApiResult apiResult;
        DateFilter dateFilter2 = dateFilter;
        RealEarningsTrackerAnalytics realEarningsTrackerAnalytics = realEarningsTrackerRepository.earningsTrackerAnalytics;
        Analytics analytics = realEarningsTrackerAnalytics.analytics;
        AndroidClock androidClock = realEarningsTrackerRepository.clock;
        if (continuationImpl instanceof RealEarningsTrackerRepository$loadEarningsTrackerDataFromNetwork$1) {
            realEarningsTrackerRepository$loadEarningsTrackerDataFromNetwork$1 = (RealEarningsTrackerRepository$loadEarningsTrackerDataFromNetwork$1) continuationImpl;
            int i2 = realEarningsTrackerRepository$loadEarningsTrackerDataFromNetwork$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realEarningsTrackerRepository$loadEarningsTrackerDataFromNetwork$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realEarningsTrackerRepository$loadEarningsTrackerDataFromNetwork$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realEarningsTrackerRepository$loadEarningsTrackerDataFromNetwork$1.label;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                Object[] objArr3 = 0;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (dateFilter2 instanceof DateFilter.Monthly) {
                        DateFilter.Monthly monthly = (DateFilter.Monthly) dateFilter2;
                        earningsTrackerDataRequest = new EarningsTrackerDataRequest(new Integer(monthly.month), new Integer(monthly.year), 12);
                    } else if (dateFilter2 instanceof DateFilter.Yearly) {
                        earningsTrackerDataRequest = new EarningsTrackerDataRequest(objArr3 == true ? 1 : 0, new Integer(((DateFilter.Yearly) dateFilter2).year), 13);
                    } else {
                        if (!(dateFilter2 instanceof DateFilter.AllTime)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        earningsTrackerDataRequest = new EarningsTrackerDataRequest(objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, 15);
                    }
                    elapsedRealtime = androidClock.elapsedRealtime();
                    dateFilter2.getClass();
                    Triple analyticsTimeframeData = zzhx.toAnalyticsTimeframeData(dateFilter2);
                    analytics.track(new EarningsTrackerFetchAttempt((Timeframe) analyticsTimeframeData.first, (Integer) analyticsTimeframeData.second, (Integer) analyticsTimeframeData.third), null);
                    C4BClientService c4BClientService = realEarningsTrackerRepository.service;
                    realEarningsTrackerRepository$loadEarningsTrackerDataFromNetwork$1.L$0 = dateFilter2;
                    realEarningsTrackerRepository$loadEarningsTrackerDataFromNetwork$1.J$0 = elapsedRealtime;
                    realEarningsTrackerRepository$loadEarningsTrackerDataFromNetwork$1.label = 1;
                    obj = c4BClientService.getEarningsTrackerData(earningsTrackerDataRequest, realEarningsTrackerRepository$loadEarningsTrackerDataFromNetwork$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j = realEarningsTrackerRepository$loadEarningsTrackerDataFromNetwork$1.J$0;
                    DateFilter dateFilter3 = realEarningsTrackerRepository$loadEarningsTrackerDataFromNetwork$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    elapsedRealtime = j;
                    dateFilter2 = dateFilter3;
                }
                apiResult = (ApiResult) obj;
                int elapsedRealtime2 = (int) (androidClock.elapsedRealtime() - elapsedRealtime);
                if (!(apiResult instanceof ApiResult.Success)) {
                    dateFilter2.getClass();
                    Triple analyticsTimeframeData2 = zzhx.toAnalyticsTimeframeData(dateFilter2);
                    analytics.track(new EarningsTrackerFetchSuccess((Timeframe) analyticsTimeframeData2.first, (Integer) analyticsTimeframeData2.second, (Integer) analyticsTimeframeData2.third, Integer.valueOf(elapsedRealtime2)), null);
                    return apiResult;
                }
                if (!(apiResult instanceof ApiResult.Failure)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                String obj2 = apiResult.toString();
                ApiResult.Failure failure = (ApiResult.Failure) apiResult;
                ApiResult.Failure.HttpFailure httpFailure = failure instanceof ApiResult.Failure.HttpFailure ? (ApiResult.Failure.HttpFailure) failure : null;
                realEarningsTrackerAnalytics.trackFetchError(dateFilter2, elapsedRealtime2, obj2, httpFailure != null ? String.valueOf(httpFailure.code) : null, false);
                return apiResult;
            }
        }
        realEarningsTrackerRepository$loadEarningsTrackerDataFromNetwork$1 = new RealEarningsTrackerRepository$loadEarningsTrackerDataFromNetwork$1(realEarningsTrackerRepository, continuationImpl);
        Object obj3 = realEarningsTrackerRepository$loadEarningsTrackerDataFromNetwork$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realEarningsTrackerRepository$loadEarningsTrackerDataFromNetwork$1.label;
        Object[] objArr4 = 0;
        Object[] objArr22 = 0;
        Object[] objArr32 = 0;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj3;
        int elapsedRealtime22 = (int) (androidClock.elapsedRealtime() - elapsedRealtime);
        if (!(apiResult instanceof ApiResult.Success)) {
        }
    }
}

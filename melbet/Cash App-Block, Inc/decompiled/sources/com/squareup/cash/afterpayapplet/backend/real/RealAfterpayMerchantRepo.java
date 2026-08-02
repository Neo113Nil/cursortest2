package com.squareup.cash.afterpayapplet.backend.real;

import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.afterpayapplet.backend.AfterpayMerchantRepo$SearchResult;
import com.squareup.cash.afterpayapplet.db.AfterpayRecentlyViewedMerchant;
import com.squareup.cash.aiedge.MLKitTitleGenerator$1;
import com.squareup.cash.aiedge.MLKitTitleGenerator$prepareModel$1;
import com.squareup.cash.arcade.treehouse.SearchBarBinding$Content$1$1;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletSearchRequest;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletSearchResponse;
import com.squareup.protos.cash.cashsuggest.api.CashSuggestClientService;
import com.squareup.protos.cash.shop.rendering.api.EngagedItemToken;
import com.squareup.protos.cash.shop.rendering.api.EngagedItemToken$Token$CategoryToken;
import com.squareup.protos.cash.shop.rendering.api.EngagedItemToken$Token$MerchantToken;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.sync.MutexImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import squareup.cash.earnings.EarningsTimeFrame;

/* loaded from: classes5.dex */
public final class RealAfterpayMerchantRepo {
    public final CashSuggestClientService appService;
    public final AndroidClock clock;
    public final MutexImpl emptyQueryParamsMutex = new MutexImpl();
    public AfterpayAppletSearchResponse emptyQueryParamsResponse;
    public final CoroutineContext ioContext;
    public final SessionQueries queries;
    public final CoroutineScope scope;

    public RealAfterpayMerchantRepo(CashSuggestClientService cashSuggestClientService, AndroidClock androidClock, CashAccountDatabaseImpl cashAccountDatabaseImpl, CoroutineContext coroutineContext, CoroutineScope coroutineScope) {
        this.appService = cashSuggestClientService;
        this.clock = androidClock;
        this.ioContext = coroutineContext;
        this.scope = coroutineScope;
        this.queries = cashAccountDatabaseImpl.afterpayRecentlyViewedMerchantsQueries;
    }

    public final void addToRecentlyViewed(EngagedItemToken engagedItemToken) {
        engagedItemToken.getClass();
        JobKt.launch$default(this.scope, null, null, new MLKitTitleGenerator$prepareModel$1(this, engagedItemToken, null, 2), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x008b  */
    /* JADX WARN: Type inference failed for: r8v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object internalUpdate(String str, List list, ContinuationImpl continuationImpl) {
        RealAfterpayMerchantRepo$internalUpdate$1 realAfterpayMerchantRepo$internalUpdate$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        CoroutineContext coroutineContext;
        int i2;
        Continuation continuation;
        List list2;
        String str2;
        MutexImpl mutexImpl;
        AfterpayAppletSearchResponse afterpayAppletSearchResponse;
        List list3;
        String str3;
        Long l;
        String str4;
        ApiResult apiResult;
        Object obj2;
        List list4;
        String str5;
        List list5;
        ApiResult apiResult2;
        try {
            if (continuationImpl instanceof RealAfterpayMerchantRepo$internalUpdate$1) {
                realAfterpayMerchantRepo$internalUpdate$1 = (RealAfterpayMerchantRepo$internalUpdate$1) continuationImpl;
                int i3 = realAfterpayMerchantRepo$internalUpdate$1.label;
                if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                    realAfterpayMerchantRepo$internalUpdate$1.label = i3 - PKIFailureInfo.systemUnavail;
                    obj = realAfterpayMerchantRepo$internalUpdate$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realAfterpayMerchantRepo$internalUpdate$1.label;
                    coroutineContext = this.ioContext;
                    MutexImpl mutexImpl2 = this.emptyQueryParamsMutex;
                    i2 = 4;
                    continuation = null;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        realAfterpayMerchantRepo$internalUpdate$1.L$0 = str;
                        realAfterpayMerchantRepo$internalUpdate$1.L$1 = list;
                        realAfterpayMerchantRepo$internalUpdate$1.L$2 = mutexImpl2;
                        realAfterpayMerchantRepo$internalUpdate$1.label = 1;
                        if (mutexImpl2.lock(realAfterpayMerchantRepo$internalUpdate$1) != coroutineSingletons) {
                            list2 = list;
                            str2 = str;
                            mutexImpl = mutexImpl2;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i == 2) {
                            list3 = realAfterpayMerchantRepo$internalUpdate$1.L$1;
                            str3 = realAfterpayMerchantRepo$internalUpdate$1.L$0;
                            SafeTrace.throwOnFailure(obj);
                            Iterable<AfterpayRecentlyViewedMerchant> iterable = (Iterable) obj;
                            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
                            for (AfterpayRecentlyViewedMerchant afterpayRecentlyViewedMerchant : iterable) {
                                boolean areEqual = Intrinsics.areEqual(afterpayRecentlyViewedMerchant.is_merchant_token, Boolean.TRUE);
                                String str6 = afterpayRecentlyViewedMerchant.token;
                                arrayList.add(new AfterpayAppletSearchRequest.RecentlyViewed(afterpayRecentlyViewedMerchant.last_updated_at_ms, new EngagedItemToken(areEqual ? new EngagedItemToken$Token$MerchantToken(str6) : new EngagedItemToken$Token$CategoryToken(str6)), ByteString.EMPTY));
                            }
                            AfterpayAppletSearchRequest afterpayAppletSearchRequest = new AfterpayAppletSearchRequest(str3, list3, arrayList, ByteString.EMPTY);
                            realAfterpayMerchantRepo$internalUpdate$1.L$0 = str3;
                            realAfterpayMerchantRepo$internalUpdate$1.L$1 = list3;
                            realAfterpayMerchantRepo$internalUpdate$1.L$2 = null;
                            realAfterpayMerchantRepo$internalUpdate$1.label = 3;
                            obj = this.appService.afterpayAppletSearch(afterpayAppletSearchRequest, realAfterpayMerchantRepo$internalUpdate$1);
                            if (obj != coroutineSingletons) {
                                str4 = str3;
                                apiResult = (ApiResult) obj;
                                if (apiResult instanceof ApiResult.Success) {
                                }
                            }
                            return coroutineSingletons;
                        }
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                mutexImpl2 = realAfterpayMerchantRepo$internalUpdate$1.L$5;
                                apiResult2 = realAfterpayMerchantRepo$internalUpdate$1.L$4;
                                List list6 = realAfterpayMerchantRepo$internalUpdate$1.L$1;
                                SafeTrace.throwOnFailure(obj);
                                try {
                                    this.emptyQueryParamsResponse = (AfterpayAppletSearchResponse) ((ApiResult.Success) apiResult2).response;
                                    mutexImpl2.unlock(null);
                                    apiResult = apiResult2;
                                    return new AfterpayMerchantRepo$SearchResult.Success((AfterpayAppletSearchResponse) ((ApiResult.Success) apiResult).response);
                                } finally {
                                }
                            }
                            ApiResult apiResult3 = realAfterpayMerchantRepo$internalUpdate$1.L$4;
                            list4 = realAfterpayMerchantRepo$internalUpdate$1.L$1;
                            str5 = realAfterpayMerchantRepo$internalUpdate$1.L$0;
                            SafeTrace.throwOnFailure(obj);
                            apiResult = apiResult3;
                            if (str5.length() == 0 && list4.isEmpty()) {
                                realAfterpayMerchantRepo$internalUpdate$1.L$0 = null;
                                realAfterpayMerchantRepo$internalUpdate$1.L$1 = null;
                                realAfterpayMerchantRepo$internalUpdate$1.L$2 = null;
                                realAfterpayMerchantRepo$internalUpdate$1.L$4 = apiResult;
                                realAfterpayMerchantRepo$internalUpdate$1.L$5 = mutexImpl2;
                                realAfterpayMerchantRepo$internalUpdate$1.label = 5;
                                if (mutexImpl2.lock(realAfterpayMerchantRepo$internalUpdate$1) != coroutineSingletons) {
                                    apiResult2 = apiResult;
                                    this.emptyQueryParamsResponse = (AfterpayAppletSearchResponse) ((ApiResult.Success) apiResult2).response;
                                    mutexImpl2.unlock(null);
                                    apiResult = apiResult2;
                                }
                                return coroutineSingletons;
                            }
                            return new AfterpayMerchantRepo$SearchResult.Success((AfterpayAppletSearchResponse) ((ApiResult.Success) apiResult).response);
                        }
                        list3 = realAfterpayMerchantRepo$internalUpdate$1.L$1;
                        str4 = realAfterpayMerchantRepo$internalUpdate$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        apiResult = (ApiResult) obj;
                        if (apiResult instanceof ApiResult.Success) {
                            return AfterpayMerchantRepo$SearchResult.Failure.INSTANCE;
                        }
                        AfterpayAppletSearchResponse afterpayAppletSearchResponse2 = (AfterpayAppletSearchResponse) ((ApiResult.Success) apiResult).response;
                        realAfterpayMerchantRepo$internalUpdate$1.L$0 = str4;
                        realAfterpayMerchantRepo$internalUpdate$1.L$1 = list3;
                        realAfterpayMerchantRepo$internalUpdate$1.L$2 = null;
                        realAfterpayMerchantRepo$internalUpdate$1.L$4 = apiResult;
                        realAfterpayMerchantRepo$internalUpdate$1.label = 4;
                        if (afterpayAppletSearchResponse2 == null || (list5 = afterpayAppletSearchResponse2.invalid_recently_viewed_engaged_tokens) == null) {
                            obj2 = EmptyList.INSTANCE;
                        } else {
                            obj2 = new ArrayList();
                            Iterator it = list5.iterator();
                            while (it.hasNext()) {
                                String access$getDatabaseToken = EarningsTimeFrame.TimeFrame.access$getDatabaseToken((EngagedItemToken) it.next());
                                if (access$getDatabaseToken != null) {
                                    obj2.add(access$getDatabaseToken);
                                }
                            }
                        }
                        Object withContext = JobKt.withContext(coroutineContext, new SearchBarBinding$Content$1$1(obj2, this, continuation, 11), realAfterpayMerchantRepo$internalUpdate$1);
                        if (withContext != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            withContext = Unit.INSTANCE;
                        }
                        if (withContext != coroutineSingletons) {
                            list4 = list3;
                            str5 = str4;
                            if (str5.length() == 0) {
                                realAfterpayMerchantRepo$internalUpdate$1.L$0 = null;
                                realAfterpayMerchantRepo$internalUpdate$1.L$1 = null;
                                realAfterpayMerchantRepo$internalUpdate$1.L$2 = null;
                                realAfterpayMerchantRepo$internalUpdate$1.L$4 = apiResult;
                                realAfterpayMerchantRepo$internalUpdate$1.L$5 = mutexImpl2;
                                realAfterpayMerchantRepo$internalUpdate$1.label = 5;
                                if (mutexImpl2.lock(realAfterpayMerchantRepo$internalUpdate$1) != coroutineSingletons) {
                                }
                            }
                            return new AfterpayMerchantRepo$SearchResult.Success((AfterpayAppletSearchResponse) ((ApiResult.Success) apiResult).response);
                        }
                        return coroutineSingletons;
                    }
                    mutexImpl = realAfterpayMerchantRepo$internalUpdate$1.L$2;
                    list2 = realAfterpayMerchantRepo$internalUpdate$1.L$1;
                    str2 = realAfterpayMerchantRepo$internalUpdate$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    afterpayAppletSearchResponse = this.emptyQueryParamsResponse;
                    if (afterpayAppletSearchResponse == null && str2.length() == 0 && list2.isEmpty() && (l = afterpayAppletSearchResponse.expire_at_ms) != null && this.clock.millis() < l.longValue()) {
                        return new AfterpayMerchantRepo$SearchResult.Success(afterpayAppletSearchResponse);
                    }
                    MLKitTitleGenerator$1 mLKitTitleGenerator$1 = new MLKitTitleGenerator$1(this, continuation, i2);
                    realAfterpayMerchantRepo$internalUpdate$1.L$0 = str2;
                    realAfterpayMerchantRepo$internalUpdate$1.L$1 = list2;
                    realAfterpayMerchantRepo$internalUpdate$1.L$2 = null;
                    realAfterpayMerchantRepo$internalUpdate$1.label = 2;
                    obj = JobKt.withContext(coroutineContext, mLKitTitleGenerator$1, realAfterpayMerchantRepo$internalUpdate$1);
                    if (obj != coroutineSingletons) {
                        list3 = list2;
                        str3 = str2;
                        Iterable<AfterpayRecentlyViewedMerchant> iterable2 = (Iterable) obj;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable2, 10));
                        while (r1.hasNext()) {
                        }
                        AfterpayAppletSearchRequest afterpayAppletSearchRequest2 = new AfterpayAppletSearchRequest(str3, list3, arrayList2, ByteString.EMPTY);
                        realAfterpayMerchantRepo$internalUpdate$1.L$0 = str3;
                        realAfterpayMerchantRepo$internalUpdate$1.L$1 = list3;
                        realAfterpayMerchantRepo$internalUpdate$1.L$2 = null;
                        realAfterpayMerchantRepo$internalUpdate$1.label = 3;
                        obj = this.appService.afterpayAppletSearch(afterpayAppletSearchRequest2, realAfterpayMerchantRepo$internalUpdate$1);
                        if (obj != coroutineSingletons) {
                        }
                    }
                    return coroutineSingletons;
                }
            }
            afterpayAppletSearchResponse = this.emptyQueryParamsResponse;
            if (afterpayAppletSearchResponse == null) {
            }
            MLKitTitleGenerator$1 mLKitTitleGenerator$12 = new MLKitTitleGenerator$1(this, continuation, i2);
            realAfterpayMerchantRepo$internalUpdate$1.L$0 = str2;
            realAfterpayMerchantRepo$internalUpdate$1.L$1 = list2;
            realAfterpayMerchantRepo$internalUpdate$1.L$2 = null;
            realAfterpayMerchantRepo$internalUpdate$1.label = 2;
            obj = JobKt.withContext(coroutineContext, mLKitTitleGenerator$12, realAfterpayMerchantRepo$internalUpdate$1);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        } finally {
        }
        realAfterpayMerchantRepo$internalUpdate$1 = new RealAfterpayMerchantRepo$internalUpdate$1(this, continuationImpl);
        obj = realAfterpayMerchantRepo$internalUpdate$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realAfterpayMerchantRepo$internalUpdate$1.label;
        coroutineContext = this.ioContext;
        MutexImpl mutexImpl22 = this.emptyQueryParamsMutex;
        i2 = 4;
        continuation = null;
        if (i != 0) {
        }
    }
}

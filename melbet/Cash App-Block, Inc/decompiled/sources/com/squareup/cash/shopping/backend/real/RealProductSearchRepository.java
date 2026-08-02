package com.squareup.cash.shopping.backend.real;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.customview.widget.FocusStrategy;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.shopping.backend.api.FiltersResults;
import com.squareup.cash.shopping.backend.api.SearchQuery;
import com.squareup.cash.shopping.backend.api.SearchResults;
import com.squareup.cash.shopping.web.ShoppingWebBridge$loadUrl$1;
import com.squareup.protos.cash.customersearch.api.CustomerSearchClientService;
import com.squareup.protos.cash.customersearch.api.SearchCommonSection;
import com.squareup.protos.cash.customersearch.api.ShopSearchProductsRequest;
import com.squareup.protos.cash.customersearch.api.ShopSearchProductsResponse;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DeferredCoroutine;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealProductSearchRepository {
    public final CoroutineScope coroutineScope;
    public DeferredCoroutine filtersJob;
    public final CoroutineContext ioDispatcher;
    public SearchQuery lastSearchQuery;
    public final MutexImpl mutex = new MutexImpl();
    public final RewardSlotQueries productsSearchQueries;
    public final CustomerSearchClientService service;

    public RealProductSearchRepository(CustomerSearchClientService customerSearchClientService, CashAccountDatabaseImpl cashAccountDatabaseImpl, CoroutineScope coroutineScope, CoroutineContext coroutineContext) {
        this.service = customerSearchClientService;
        this.coroutineScope = coroutineScope;
        this.ioDispatcher = coroutineContext;
        this.productsSearchQueries = cashAccountDatabaseImpl.shopProductsSearchQueries;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(8:(2:3|(9:5|6|7|(1:(1:(1:(5:12|13|14|15|16)(2:18|19))(5:20|21|22|15|16))(1:23))(1:42)|24|25|(2:35|(4:37|14|15|16))(2:29|(4:31|22|15|16))|32|33))|24|25|(1:27)|35|(0)|32|33)|45|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x005f, code lost:
    
        if (r10.lock(r0) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0031, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r2v3, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.squareup.cash.shopping.backend.real.RealProductSearchRepository] */
    /* JADX WARN: Type inference failed for: r8v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object awaitFilters(SearchQuery searchQuery, ContinuationImpl continuationImpl) {
        RealProductSearchRepository$awaitFilters$1 realProductSearchRepository$awaitFilters$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        MutexImpl mutexImpl;
        int i2;
        Object awaitInternal;
        Mutex mutex;
        DeferredCoroutine deferredCoroutine;
        FiltersResults filtersResults;
        try {
            if (continuationImpl instanceof RealProductSearchRepository$awaitFilters$1) {
                realProductSearchRepository$awaitFilters$1 = (RealProductSearchRepository$awaitFilters$1) continuationImpl;
                int i3 = realProductSearchRepository$awaitFilters$1.label;
                if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                    realProductSearchRepository$awaitFilters$1.label = i3 - PKIFailureInfo.systemUnavail;
                    Object obj = realProductSearchRepository$awaitFilters$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realProductSearchRepository$awaitFilters$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        realProductSearchRepository$awaitFilters$1.L$0 = searchQuery;
                        mutexImpl = this.mutex;
                        realProductSearchRepository$awaitFilters$1.L$1 = mutexImpl;
                        i2 = 0;
                        realProductSearchRepository$awaitFilters$1.I$0 = 0;
                        realProductSearchRepository$awaitFilters$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                mutex = realProductSearchRepository$awaitFilters$1.L$1;
                                SafeTrace.throwOnFailure(obj);
                                filtersResults = (FiltersResults) obj;
                                mutex.unlock(null);
                                return filtersResults;
                            }
                            if (i != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            mutex = realProductSearchRepository$awaitFilters$1.L$1;
                            SafeTrace.throwOnFailure(obj);
                            filtersResults = (FiltersResults) obj;
                            mutex.unlock(null);
                            return filtersResults;
                        }
                        int i4 = realProductSearchRepository$awaitFilters$1.I$0;
                        ?? r2 = realProductSearchRepository$awaitFilters$1.L$1;
                        SearchQuery searchQuery2 = realProductSearchRepository$awaitFilters$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        mutexImpl = r2;
                        i2 = i4;
                        searchQuery = searchQuery2;
                    }
                    if (Intrinsics.areEqual(this.lastSearchQuery, searchQuery) || (deferredCoroutine = this.filtersJob) == null) {
                        loadFiltersAsync(searchQuery);
                        DeferredCoroutine deferredCoroutine2 = this.filtersJob;
                        deferredCoroutine2.getClass();
                        realProductSearchRepository$awaitFilters$1.L$0 = null;
                        realProductSearchRepository$awaitFilters$1.L$1 = mutexImpl;
                        realProductSearchRepository$awaitFilters$1.I$0 = i2;
                        realProductSearchRepository$awaitFilters$1.label = 3;
                        awaitInternal = deferredCoroutine2.awaitInternal(realProductSearchRepository$awaitFilters$1);
                        if (awaitInternal != coroutineSingletons) {
                            MutexImpl mutexImpl2 = mutexImpl;
                            obj = awaitInternal;
                            mutex = mutexImpl2;
                            filtersResults = (FiltersResults) obj;
                            mutex.unlock(null);
                            return filtersResults;
                        }
                    } else {
                        realProductSearchRepository$awaitFilters$1.L$0 = null;
                        realProductSearchRepository$awaitFilters$1.L$1 = mutexImpl;
                        realProductSearchRepository$awaitFilters$1.I$0 = i2;
                        realProductSearchRepository$awaitFilters$1.label = 2;
                        Object awaitInternal2 = deferredCoroutine.awaitInternal(realProductSearchRepository$awaitFilters$1);
                        if (awaitInternal2 != coroutineSingletons) {
                            MutexImpl mutexImpl3 = mutexImpl;
                            obj = awaitInternal2;
                            mutex = mutexImpl3;
                            filtersResults = (FiltersResults) obj;
                            mutex.unlock(null);
                            return filtersResults;
                        }
                    }
                    return coroutineSingletons;
                }
            }
            if (Intrinsics.areEqual(this.lastSearchQuery, searchQuery)) {
            }
            loadFiltersAsync(searchQuery);
            DeferredCoroutine deferredCoroutine22 = this.filtersJob;
            deferredCoroutine22.getClass();
            realProductSearchRepository$awaitFilters$1.L$0 = null;
            realProductSearchRepository$awaitFilters$1.L$1 = mutexImpl;
            realProductSearchRepository$awaitFilters$1.I$0 = i2;
            realProductSearchRepository$awaitFilters$1.label = 3;
            awaitInternal = deferredCoroutine22.awaitInternal(realProductSearchRepository$awaitFilters$1);
            if (awaitInternal != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th) {
            th = th;
            this = mutexImpl;
            this.unlock(null);
            throw th;
        }
        realProductSearchRepository$awaitFilters$1 = new RealProductSearchRepository$awaitFilters$1(this, continuationImpl);
        Object obj2 = realProductSearchRepository$awaitFilters$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realProductSearchRepository$awaitFilters$1.label;
        if (i != 0) {
        }
    }

    public final void loadFiltersAsync(SearchQuery searchQuery) {
        this.lastSearchQuery = searchQuery;
        DeferredCoroutine deferredCoroutine = this.filtersJob;
        if (deferredCoroutine != null) {
            deferredCoroutine.cancel(null);
        }
        this.filtersJob = JobKt.async$default(this.coroutineScope, this.ioDispatcher, null, new ShoppingWebBridge$loadUrl$1(this, searchQuery, null, 7), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object refreshFiltersInBackground(SearchQuery searchQuery, ContinuationImpl continuationImpl) {
        RealProductSearchRepository$refreshFiltersInBackground$1 realProductSearchRepository$refreshFiltersInBackground$1;
        int i;
        MutexImpl mutexImpl;
        try {
            if (continuationImpl instanceof RealProductSearchRepository$refreshFiltersInBackground$1) {
                realProductSearchRepository$refreshFiltersInBackground$1 = (RealProductSearchRepository$refreshFiltersInBackground$1) continuationImpl;
                int i2 = realProductSearchRepository$refreshFiltersInBackground$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    realProductSearchRepository$refreshFiltersInBackground$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = realProductSearchRepository$refreshFiltersInBackground$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realProductSearchRepository$refreshFiltersInBackground$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        realProductSearchRepository$refreshFiltersInBackground$1.L$0 = searchQuery;
                        mutexImpl = this.mutex;
                        realProductSearchRepository$refreshFiltersInBackground$1.L$1 = mutexImpl;
                        realProductSearchRepository$refreshFiltersInBackground$1.label = 1;
                        if (mutexImpl.lock(realProductSearchRepository$refreshFiltersInBackground$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        MutexImpl mutexImpl2 = realProductSearchRepository$refreshFiltersInBackground$1.L$1;
                        SearchQuery searchQuery2 = realProductSearchRepository$refreshFiltersInBackground$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        mutexImpl = mutexImpl2;
                        searchQuery = searchQuery2;
                    }
                    loadFiltersAsync(searchQuery);
                    return Unit.INSTANCE;
                }
            }
            loadFiltersAsync(searchQuery);
            return Unit.INSTANCE;
        } finally {
            mutexImpl.unlock(null);
        }
        realProductSearchRepository$refreshFiltersInBackground$1 = new RealProductSearchRepository$refreshFiltersInBackground$1(this, continuationImpl);
        Object obj2 = realProductSearchRepository$refreshFiltersInBackground$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realProductSearchRepository$refreshFiltersInBackground$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object search(SearchQuery searchQuery, List list, String str, ContinuationImpl continuationImpl) {
        RealProductSearchRepository$search$1 realProductSearchRepository$search$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealProductSearchRepository$search$1) {
            realProductSearchRepository$search$1 = (RealProductSearchRepository$search$1) continuationImpl;
            int i2 = realProductSearchRepository$search$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realProductSearchRepository$search$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realProductSearchRepository$search$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realProductSearchRepository$search$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ShopSearchProductsRequest shopSearchProductsRequest = new ShopSearchProductsRequest(searchQuery.searchText, searchQuery.shopFlowToken, searchQuery.searchFlowToken, str, list, ByteString.EMPTY);
                    realProductSearchRepository$search$1.label = 1;
                    obj = this.service.shopSearchProducts(shopSearchProductsRequest, realProductSearchRepository$search$1);
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
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Failure.HttpFailure)) {
                    List list2 = Collections.EMPTY_LIST;
                    list2.getClass();
                    return new SearchResults(4, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(((ApiResult.Failure.HttpFailure) apiResult).code, "Error: "), null, list2);
                }
                if (apiResult instanceof ApiResult.Failure.NetworkFailure) {
                    List list3 = Collections.EMPTY_LIST;
                    list3.getClass();
                    return new SearchResults(4, Recorder$$ExternalSyntheticOutline2.m("Error: ", ((ApiResult.Failure.NetworkFailure) apiResult).error.getLocalizedMessage()), null, list3);
                }
                if (!(apiResult instanceof ApiResult.Success)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                ShopSearchProductsResponse shopSearchProductsResponse = (ShopSearchProductsResponse) ((ApiResult.Success) apiResult).response;
                shopSearchProductsResponse.getClass();
                List list4 = shopSearchProductsResponse.sections;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    arrayList.add(FocusStrategy.transform((SearchCommonSection) it.next()));
                }
                return new SearchResults(2, null, shopSearchProductsResponse.pagination_token, arrayList);
            }
        }
        realProductSearchRepository$search$1 = new RealProductSearchRepository$search$1(this, continuationImpl);
        Object obj2 = realProductSearchRepository$search$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realProductSearchRepository$search$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Failure.HttpFailure)) {
        }
    }
}

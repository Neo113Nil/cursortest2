package com.squareup.cash.offers.backend.real;

import androidx.compose.ui.geometry.GeometryUtilsKt;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.invitations.InviteErrorPresenter$models$1$1;
import com.squareup.cash.keystore.RealKeyStoreProvider$setEntry$2;
import com.squareup.cash.mri.android.RealMRIFactory$sign$2;
import com.squareup.cash.offers.backend.api.BusinessToken;
import com.squareup.cash.offers.backend.api.CategoryToken;
import com.squareup.cash.offers.backend.api.HomeResult;
import com.squareup.cash.offers.backend.api.OffersCollectionTrackingAction;
import com.squareup.cash.offers.backend.api.OffersItemToken;
import com.squareup.cash.offers.backend.api.OffersSpanAction;
import com.squareup.cash.offers.backend.api.OffersTabRepository$SearchSource;
import com.squareup.cash.offers.backend.api.RecentlyViewed;
import com.squareup.cash.offers.backend.api.TrackingAction;
import com.squareup.cash.offers.db.OffersSearch;
import com.squareup.cash.offers.presenters.RealOffersSearchPresenter$$ExternalSyntheticLambda4;
import com.squareup.cash.overlays.Overlay$$ExternalSyntheticLambda0;
import com.squareup.cash.score.views.ScoreSummaryKt$$ExternalSyntheticLambda1;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.util.network.impl.RealNetworkInfo;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$rotateDragFlow$2;
import com.squareup.protos.cash.cashsuggest.api.CashSuggestClientService;
import com.squareup.protos.cash.cashsuggest.api.OffersTabCollectionRequest;
import com.squareup.protos.cash.cashsuggest.api.OffersTabHomeRequest;
import com.squareup.protos.cash.cashsuggest.api.OffersTabHomeResponse;
import com.squareup.protos.cash.cashsuggest.api.OffersTabSearchRequest;
import com.squareup.protos.cash.shop.rendering.api.EngagedItemToken;
import com.squareup.protos.cash.shop.rendering.api.EngagedItemToken$Token$CategoryToken;
import com.squareup.protos.cash.shop.rendering.api.EngagedItemToken$Token$MerchantToken;
import com.squareup.util.task.RepeatOnIntervalTaskRunner$repeatOn$2;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
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
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealOffersTabRepository {
    public final CashSuggestClientService appService;
    public final CashAccountDatabaseImpl cashDatabase;
    public final AndroidClock clock;
    public final CoroutineContext ioDispatcher;
    public final RealNetworkInfo networkInfo;

    public RealOffersTabRepository(CashSuggestClientService cashSuggestClientService, CashAccountDatabaseImpl cashAccountDatabaseImpl, AndroidClock androidClock, RealNetworkInfo realNetworkInfo, CoroutineContext coroutineContext) {
        this.appService = cashSuggestClientService;
        this.cashDatabase = cashAccountDatabaseImpl;
        this.clock = androidClock;
        this.networkInfo = realNetworkInfo;
        this.ioDispatcher = coroutineContext;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
    
        if (r10 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$fetchCollectionResponseFromNetwork(RealOffersTabRepository realOffersTabRepository, String str, Overlay$$ExternalSyntheticLambda0 overlay$$ExternalSyntheticLambda0, ContinuationImpl continuationImpl) {
        RealOffersTabRepository$fetchCollectionResponseFromNetwork$1 realOffersTabRepository$fetchCollectionResponseFromNetwork$1;
        int i;
        if (continuationImpl instanceof RealOffersTabRepository$fetchCollectionResponseFromNetwork$1) {
            realOffersTabRepository$fetchCollectionResponseFromNetwork$1 = (RealOffersTabRepository$fetchCollectionResponseFromNetwork$1) continuationImpl;
            int i2 = realOffersTabRepository$fetchCollectionResponseFromNetwork$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realOffersTabRepository$fetchCollectionResponseFromNetwork$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realOffersTabRepository$fetchCollectionResponseFromNetwork$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realOffersTabRepository$fetchCollectionResponseFromNetwork$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (overlay$$ExternalSyntheticLambda0 != null) {
                        overlay$$ExternalSyntheticLambda0.invoke(OffersCollectionTrackingAction.StartNetworking.INSTANCE);
                    }
                    CashSuggestClientService cashSuggestClientService = realOffersTabRepository.appService;
                    OffersTabCollectionRequest offersTabCollectionRequest = new OffersTabCollectionRequest(str, ByteString.EMPTY);
                    realOffersTabRepository$fetchCollectionResponseFromNetwork$1.L$0 = str;
                    realOffersTabRepository$fetchCollectionResponseFromNetwork$1.L$1 = overlay$$ExternalSyntheticLambda0;
                    realOffersTabRepository$fetchCollectionResponseFromNetwork$1.label = 1;
                    obj = cashSuggestClientService.offersTabCollection(offersTabCollectionRequest, realOffersTabRepository$fetchCollectionResponseFromNetwork$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    overlay$$ExternalSyntheticLambda0 = realOffersTabRepository$fetchCollectionResponseFromNetwork$1.L$1;
                    str = realOffersTabRepository$fetchCollectionResponseFromNetwork$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                ApiResult apiResult = (ApiResult) obj;
                if (overlay$$ExternalSyntheticLambda0 != null) {
                    overlay$$ExternalSyntheticLambda0.invoke(OffersCollectionTrackingAction.EndNetworking.INSTANCE);
                }
                RealMRIFactory$sign$2 realMRIFactory$sign$2 = new RealMRIFactory$sign$2(realOffersTabRepository, str, continuation, 8);
                realOffersTabRepository$fetchCollectionResponseFromNetwork$1.L$0 = null;
                realOffersTabRepository$fetchCollectionResponseFromNetwork$1.L$1 = null;
                realOffersTabRepository$fetchCollectionResponseFromNetwork$1.label = 2;
                Object handleOffersResponse = GeometryUtilsKt.handleOffersResponse(apiResult, realMRIFactory$sign$2, realOffersTabRepository$fetchCollectionResponseFromNetwork$1);
                return handleOffersResponse != coroutineSingletons ? coroutineSingletons : handleOffersResponse;
            }
        }
        realOffersTabRepository$fetchCollectionResponseFromNetwork$1 = new RealOffersTabRepository$fetchCollectionResponseFromNetwork$1(realOffersTabRepository, continuationImpl);
        Object obj2 = realOffersTabRepository$fetchCollectionResponseFromNetwork$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realOffersTabRepository$fetchCollectionResponseFromNetwork$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        ApiResult apiResult2 = (ApiResult) obj2;
        if (overlay$$ExternalSyntheticLambda0 != null) {
        }
        RealMRIFactory$sign$2 realMRIFactory$sign$22 = new RealMRIFactory$sign$2(realOffersTabRepository, str, continuation2, 8);
        realOffersTabRepository$fetchCollectionResponseFromNetwork$1.L$0 = null;
        realOffersTabRepository$fetchCollectionResponseFromNetwork$1.L$1 = null;
        realOffersTabRepository$fetchCollectionResponseFromNetwork$1.label = 2;
        Object handleOffersResponse2 = GeometryUtilsKt.handleOffersResponse(apiResult2, realMRIFactory$sign$22, realOffersTabRepository$fetchCollectionResponseFromNetwork$1);
        if (handleOffersResponse2 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (r7.emit(r6, r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0042, code lost:
    
        if (r9 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$refreshHomeOrEmitError(RealOffersTabRepository realOffersTabRepository, FlowCollector flowCollector, Overlay$$ExternalSyntheticLambda0 overlay$$ExternalSyntheticLambda0, ContinuationImpl continuationImpl) {
        RealOffersTabRepository$refreshHomeOrEmitError$1 realOffersTabRepository$refreshHomeOrEmitError$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealOffersTabRepository$refreshHomeOrEmitError$1) {
            realOffersTabRepository$refreshHomeOrEmitError$1 = (RealOffersTabRepository$refreshHomeOrEmitError$1) continuationImpl;
            int i2 = realOffersTabRepository$refreshHomeOrEmitError$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realOffersTabRepository$refreshHomeOrEmitError$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realOffersTabRepository$refreshHomeOrEmitError$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realOffersTabRepository$refreshHomeOrEmitError$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realOffersTabRepository$refreshHomeOrEmitError$1.L$0 = flowCollector;
                    realOffersTabRepository$refreshHomeOrEmitError$1.label = 1;
                    obj = realOffersTabRepository.refreshHome(overlay$$ExternalSyntheticLambda0, realOffersTabRepository$refreshHomeOrEmitError$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    flowCollector = realOffersTabRepository$refreshHomeOrEmitError$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Failure) {
                    if (apiResult instanceof ApiResult.Success) {
                        return Unit.INSTANCE;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                HomeResult.HomeError homeError = new HomeResult.HomeError((ApiResult.Failure) apiResult);
                realOffersTabRepository$refreshHomeOrEmitError$1.L$0 = null;
                realOffersTabRepository$refreshHomeOrEmitError$1.label = 2;
            }
        }
        realOffersTabRepository$refreshHomeOrEmitError$1 = new RealOffersTabRepository$refreshHomeOrEmitError$1(realOffersTabRepository, continuationImpl);
        Object obj3 = realOffersTabRepository$refreshHomeOrEmitError$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realOffersTabRepository$refreshHomeOrEmitError$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj3;
        if (apiResult instanceof ApiResult.Failure) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object refreshHome(Function1 function1, ContinuationImpl continuationImpl) {
        RealOffersTabRepository$refreshHome$1 realOffersTabRepository$refreshHome$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealOffersTabRepository$refreshHome$1) {
            realOffersTabRepository$refreshHome$1 = (RealOffersTabRepository$refreshHome$1) continuationImpl;
            int i2 = realOffersTabRepository$refreshHome$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realOffersTabRepository$refreshHome$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realOffersTabRepository$refreshHome$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realOffersTabRepository$refreshHome$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (function1 != null) {
                        function1.invoke(new OffersSpanAction.StartNetworking("offers_browse_networking_span"));
                    }
                    OffersTabHomeRequest offersTabHomeRequest = new OffersTabHomeRequest(ByteString.EMPTY);
                    realOffersTabRepository$refreshHome$1.L$0 = function1;
                    realOffersTabRepository$refreshHome$1.label = 1;
                    obj = this.appService.offersTabHome(offersTabHomeRequest, realOffersTabRepository$refreshHome$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ApiResult.Success success = realOffersTabRepository$refreshHome$1.L$2;
                        SafeTrace.throwOnFailure(obj);
                        return success;
                    }
                    function1 = realOffersTabRepository$refreshHome$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (function1 != null) {
                    function1.invoke(OffersSpanAction.EndNetworking.INSTANCE);
                }
                if (apiResult instanceof ApiResult.Success) {
                    ApiResult.Success success2 = (ApiResult.Success) apiResult;
                    OffersTabHomeResponse offersTabHomeResponse = (OffersTabHomeResponse) success2.response;
                    realOffersTabRepository$refreshHome$1.L$0 = null;
                    realOffersTabRepository$refreshHome$1.L$2 = success2;
                    realOffersTabRepository$refreshHome$1.label = 2;
                    if (JobKt.coroutineScope(new RealKeyStoreProvider$setEntry$2(offersTabHomeResponse, this, continuation, 18), realOffersTabRepository$refreshHome$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return apiResult;
            }
        }
        realOffersTabRepository$refreshHome$1 = new RealOffersTabRepository$refreshHome$1(this, continuationImpl);
        Object obj2 = realOffersTabRepository$refreshHome$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realOffersTabRepository$refreshHome$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (function1 != null) {
        }
        if (apiResult instanceof ApiResult.Success) {
        }
        return apiResult;
    }

    public final Object saveSheetPreload(List list, SuspendLambda suspendLambda) {
        Object withContext = JobKt.withContext(this.ioDispatcher, new RealOffersTabRepository$saveSheetPreload$2(list, this, (Continuation) null), suspendLambda);
        return withContext == CoroutineSingletons.COROUTINE_SUSPENDED ? withContext : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0210, code lost:
    
        if (r0 == r7) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01e5, code lost:
    
        if (r0 != r7) goto L89;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.squareup.cash.score.views.ScoreSummaryKt$$ExternalSyntheticLambda1, java.lang.String, kotlin.coroutines.Continuation] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object search(String str, String str2, OffersTabRepository$SearchSource offersTabRepository$SearchSource, ScoreSummaryKt$$ExternalSyntheticLambda1 scoreSummaryKt$$ExternalSyntheticLambda1, RealOffersSearchPresenter$$ExternalSyntheticLambda4 realOffersSearchPresenter$$ExternalSyntheticLambda4, ContinuationImpl continuationImpl) {
        RealOffersTabRepository$search$1 realOffersTabRepository$search$1;
        RealOffersTabRepository$search$1 realOffersTabRepository$search$12;
        CoroutineSingletons coroutineSingletons;
        int i;
        CoroutineContext coroutineContext;
        long j;
        String str3;
        ?? r4;
        ScoreSummaryKt$$ExternalSyntheticLambda1 scoreSummaryKt$$ExternalSyntheticLambda12;
        int i2;
        String str4;
        Function1 function1;
        boolean z;
        long j2;
        Object obj;
        Object withContext;
        CashSuggestClientService cashSuggestClientService;
        String str5;
        String str6;
        Function1 function12;
        OffersSearch offersSearch;
        Long expire_at_ms;
        BusinessToken businessToken;
        Iterator it;
        Function1 function13;
        if (continuationImpl instanceof RealOffersTabRepository$search$1) {
            realOffersTabRepository$search$1 = (RealOffersTabRepository$search$1) continuationImpl;
            int i3 = realOffersTabRepository$search$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                realOffersTabRepository$search$1.label = i3 - PKIFailureInfo.systemUnavail;
                realOffersTabRepository$search$12 = realOffersTabRepository$search$1;
                Object obj2 = realOffersTabRepository$search$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realOffersTabRepository$search$12.label;
                coroutineContext = this.ioDispatcher;
                TrackingAction.TerminateTracking terminateTracking = TrackingAction.TerminateTracking.INSTANCE;
                boolean z2 = true;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    int i4 = (str.length() == 0 && str2.length() == 0) ? 1 : 0;
                    j = i4 != 0 ? 2L : 1L;
                    str3 = str;
                    if (offersTabRepository$SearchSource == OffersTabRepository$SearchSource.FROM_CACHE) {
                        realOffersTabRepository$search$12.L$0 = str3;
                        realOffersTabRepository$search$12.L$1 = str2;
                        realOffersTabRepository$search$12.L$3 = scoreSummaryKt$$ExternalSyntheticLambda1;
                        realOffersTabRepository$search$12.L$4 = realOffersSearchPresenter$$ExternalSyntheticLambda4;
                        realOffersTabRepository$search$12.I$0 = i4;
                        realOffersTabRepository$search$12.J$0 = j;
                        realOffersTabRepository$search$12.label = 1;
                        z = false;
                        Object withContext2 = JobKt.withContext(coroutineContext, new Hero3DCardViewKt$rotateDragFlow$2(this, j, false ? 1 : 0, 7), realOffersTabRepository$search$12);
                        if (withContext2 != coroutineSingletons) {
                            j2 = j;
                            i2 = i4;
                            str4 = str2;
                            function1 = realOffersSearchPresenter$$ExternalSyntheticLambda4;
                            obj = withContext2;
                            scoreSummaryKt$$ExternalSyntheticLambda12 = scoreSummaryKt$$ExternalSyntheticLambda1;
                        }
                        return coroutineSingletons;
                    }
                    r4 = 0;
                    scoreSummaryKt$$ExternalSyntheticLambda12 = scoreSummaryKt$$ExternalSyntheticLambda1;
                    i2 = i4;
                    str4 = str2;
                    function1 = realOffersSearchPresenter$$ExternalSyntheticLambda4;
                    if (scoreSummaryKt$$ExternalSyntheticLambda12 != null) {
                        scoreSummaryKt$$ExternalSyntheticLambda12.invoke();
                    }
                    if (function1 != null) {
                        function1.invoke(TrackingAction.StartApi.INSTANCE);
                    }
                    realOffersTabRepository$search$12.L$0 = r4;
                    realOffersTabRepository$search$12.L$1 = r4;
                    realOffersTabRepository$search$12.L$3 = r4;
                    realOffersTabRepository$search$12.L$4 = function1;
                    CashSuggestClientService cashSuggestClientService2 = this.appService;
                    realOffersTabRepository$search$12.L$5 = cashSuggestClientService2;
                    realOffersTabRepository$search$12.L$6 = str3;
                    realOffersTabRepository$search$12.L$7 = str4;
                    realOffersTabRepository$search$12.I$0 = i2;
                    realOffersTabRepository$search$12.J$0 = j;
                    realOffersTabRepository$search$12.label = 2;
                    withContext = JobKt.withContext(coroutineContext, new InviteErrorPresenter$models$1$1(this, r4, 7), realOffersTabRepository$search$12);
                    if (withContext != coroutineSingletons) {
                        cashSuggestClientService = cashSuggestClientService2;
                        obj2 = withContext;
                        str5 = str4;
                        str6 = str3;
                        function12 = function1;
                        businessToken = r4;
                        Iterable iterable = (Iterable) obj2;
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
                        it = iterable.iterator();
                        BusinessToken businessToken2 = businessToken;
                        while (it.hasNext()) {
                        }
                        OffersTabSearchRequest offersTabSearchRequest = new OffersTabSearchRequest(str6, null, null, EmptyList.INSTANCE, arrayList, str5, null, ByteString.EMPTY);
                        realOffersTabRepository$search$12.L$0 = null;
                        realOffersTabRepository$search$12.L$1 = null;
                        realOffersTabRepository$search$12.L$3 = null;
                        realOffersTabRepository$search$12.L$4 = function12;
                        realOffersTabRepository$search$12.L$5 = null;
                        realOffersTabRepository$search$12.L$6 = null;
                        realOffersTabRepository$search$12.L$7 = null;
                        realOffersTabRepository$search$12.I$0 = i2;
                        realOffersTabRepository$search$12.J$0 = j;
                        realOffersTabRepository$search$12.label = 3;
                        obj2 = cashSuggestClientService.offersTabSearch(offersTabSearchRequest, realOffersTabRepository$search$12);
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    long j3 = realOffersTabRepository$search$12.J$0;
                    i2 = realOffersTabRepository$search$12.I$0;
                    function1 = realOffersTabRepository$search$12.L$4;
                    ScoreSummaryKt$$ExternalSyntheticLambda1 scoreSummaryKt$$ExternalSyntheticLambda13 = realOffersTabRepository$search$12.L$3;
                    str4 = realOffersTabRepository$search$12.L$1;
                    str3 = realOffersTabRepository$search$12.L$0;
                    SafeTrace.throwOnFailure(obj2);
                    j2 = j3;
                    obj = obj2;
                    scoreSummaryKt$$ExternalSyntheticLambda12 = scoreSummaryKt$$ExternalSyntheticLambda13;
                    z = false;
                } else if (i == 2) {
                    j = realOffersTabRepository$search$12.J$0;
                    i2 = realOffersTabRepository$search$12.I$0;
                    String str7 = realOffersTabRepository$search$12.L$7;
                    String str8 = realOffersTabRepository$search$12.L$6;
                    cashSuggestClientService = realOffersTabRepository$search$12.L$5;
                    Function1 function14 = realOffersTabRepository$search$12.L$4;
                    SafeTrace.throwOnFailure(obj2);
                    str5 = str7;
                    str6 = str8;
                    function12 = function14;
                    businessToken = null;
                    Iterable iterable2 = (Iterable) obj2;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable2, 10));
                    it = iterable2.iterator();
                    BusinessToken businessToken22 = businessToken;
                    while (it.hasNext()) {
                        RecentlyViewed recentlyViewed = (RecentlyViewed) it.next();
                        OffersItemToken itemToken = recentlyViewed.getItemToken();
                        BusinessToken businessToken3 = itemToken instanceof BusinessToken ? (BusinessToken) itemToken : businessToken22;
                        String token = businessToken3 != null ? businessToken3.getToken() : businessToken22;
                        OffersItemToken itemToken2 = recentlyViewed.getItemToken();
                        OffersItemToken offersItemToken = itemToken2 instanceof CategoryToken ? (CategoryToken) itemToken2 : businessToken22;
                        String token2 = offersItemToken != null ? offersItemToken.getToken() : businessToken22;
                        arrayList2.add(new OffersTabSearchRequest.RecentlyViewed(token, new Long(recentlyViewed.getLastUpdatedMillis()), token != null ? new EngagedItemToken(new EngagedItemToken$Token$MerchantToken(token)) : token2 != null ? new EngagedItemToken(new EngagedItemToken$Token$CategoryToken(token2)) : null));
                        it = it;
                        businessToken22 = null;
                    }
                    OffersTabSearchRequest offersTabSearchRequest2 = new OffersTabSearchRequest(str6, null, null, EmptyList.INSTANCE, arrayList2, str5, null, ByteString.EMPTY);
                    realOffersTabRepository$search$12.L$0 = null;
                    realOffersTabRepository$search$12.L$1 = null;
                    realOffersTabRepository$search$12.L$3 = null;
                    realOffersTabRepository$search$12.L$4 = function12;
                    realOffersTabRepository$search$12.L$5 = null;
                    realOffersTabRepository$search$12.L$6 = null;
                    realOffersTabRepository$search$12.L$7 = null;
                    realOffersTabRepository$search$12.I$0 = i2;
                    realOffersTabRepository$search$12.J$0 = j;
                    realOffersTabRepository$search$12.label = 3;
                    obj2 = cashSuggestClientService.offersTabSearch(offersTabSearchRequest2, realOffersTabRepository$search$12);
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        function13 = realOffersTabRepository$search$12.L$4;
                        SafeTrace.throwOnFailure(obj2);
                        ApiResult apiResult = (ApiResult) obj2;
                        if ((apiResult instanceof ApiResult.Failure) && function13 != null) {
                            function13.invoke(terminateTracking);
                        }
                        return apiResult;
                    }
                    j = realOffersTabRepository$search$12.J$0;
                    i2 = realOffersTabRepository$search$12.I$0;
                    function12 = realOffersTabRepository$search$12.L$4;
                    SafeTrace.throwOnFailure(obj2);
                    Function1 function15 = function12;
                    RepeatOnIntervalTaskRunner$repeatOn$2 repeatOnIntervalTaskRunner$repeatOn$2 = new RepeatOnIntervalTaskRunner$repeatOn$2(function15, this, j, (Continuation) null);
                    function13 = function15;
                    realOffersTabRepository$search$12.L$0 = null;
                    realOffersTabRepository$search$12.L$1 = null;
                    realOffersTabRepository$search$12.L$3 = null;
                    realOffersTabRepository$search$12.L$4 = function13;
                    realOffersTabRepository$search$12.I$0 = i2;
                    realOffersTabRepository$search$12.J$0 = j;
                    realOffersTabRepository$search$12.label = 4;
                    obj2 = GeometryUtilsKt.handleOffersResponse((ApiResult) obj2, repeatOnIntervalTaskRunner$repeatOn$2, realOffersTabRepository$search$12);
                }
                offersSearch = (OffersSearch) obj;
                if (i2 != 0) {
                    if (((offersSearch == null || (expire_at_ms = offersSearch.getExpire_at_ms()) == null) ? 0L : expire_at_ms.longValue()) <= this.clock.millis()) {
                        z2 = false;
                    }
                }
                if (offersSearch == null && z2) {
                    if (function1 != null) {
                        function1.invoke(terminateTracking);
                    }
                    return new ApiResult.Success(offersSearch.getOffers_search_response());
                }
                j = j2;
                r4 = z;
                if (scoreSummaryKt$$ExternalSyntheticLambda12 != null) {
                }
                if (function1 != null) {
                }
                realOffersTabRepository$search$12.L$0 = r4;
                realOffersTabRepository$search$12.L$1 = r4;
                realOffersTabRepository$search$12.L$3 = r4;
                realOffersTabRepository$search$12.L$4 = function1;
                CashSuggestClientService cashSuggestClientService22 = this.appService;
                realOffersTabRepository$search$12.L$5 = cashSuggestClientService22;
                realOffersTabRepository$search$12.L$6 = str3;
                realOffersTabRepository$search$12.L$7 = str4;
                realOffersTabRepository$search$12.I$0 = i2;
                realOffersTabRepository$search$12.J$0 = j;
                realOffersTabRepository$search$12.label = 2;
                withContext = JobKt.withContext(coroutineContext, new InviteErrorPresenter$models$1$1(this, r4, 7), realOffersTabRepository$search$12);
                if (withContext != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
        }
        realOffersTabRepository$search$1 = new RealOffersTabRepository$search$1(this, continuationImpl);
        realOffersTabRepository$search$12 = realOffersTabRepository$search$1;
        Object obj22 = realOffersTabRepository$search$12.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realOffersTabRepository$search$12.label;
        coroutineContext = this.ioDispatcher;
        TrackingAction.TerminateTracking terminateTracking2 = TrackingAction.TerminateTracking.INSTANCE;
        boolean z22 = true;
        if (i != 0) {
        }
        offersSearch = (OffersSearch) obj;
        if (i2 != 0) {
        }
        if (offersSearch == null) {
        }
        j = j2;
        r4 = z;
        if (scoreSummaryKt$$ExternalSyntheticLambda12 != null) {
        }
        if (function1 != null) {
        }
        realOffersTabRepository$search$12.L$0 = r4;
        realOffersTabRepository$search$12.L$1 = r4;
        realOffersTabRepository$search$12.L$3 = r4;
        realOffersTabRepository$search$12.L$4 = function1;
        CashSuggestClientService cashSuggestClientService222 = this.appService;
        realOffersTabRepository$search$12.L$5 = cashSuggestClientService222;
        realOffersTabRepository$search$12.L$6 = str3;
        realOffersTabRepository$search$12.L$7 = str4;
        realOffersTabRepository$search$12.I$0 = i2;
        realOffersTabRepository$search$12.J$0 = j;
        realOffersTabRepository$search$12.label = 2;
        withContext = JobKt.withContext(coroutineContext, new InviteErrorPresenter$models$1$1(this, r4, 7), realOffersTabRepository$search$12);
        if (withContext != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}

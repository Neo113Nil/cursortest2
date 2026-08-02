package com.squareup.cash.history.payments.presenters;

import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.investing.presenters.stockdetails.InvestingStockDetailsActivityRequestHandler$requestPage$1;
import com.squareup.protos.cash.activity.api.v1.ActivityClientService;
import com.squareup.protos.cash.activity.api.v1.ActivityOffset;
import com.squareup.protos.cash.activity.api.v1.ActivityPageThreadedFeedRequest;
import com.squareup.protos.cash.activity.api.v1.ActivityPageThreadedFeedResponse;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CounterpartyPageRequestHandler implements ActivitiesManager.ActivityPageHandler {
    public final /* synthetic */ int $r8$classId;
    public final ActivityClientService appService;
    public final String counterpartyToken;

    public CounterpartyPageRequestHandler(ActivityClientService activityClientService, String str, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.appService = activityClientService;
                this.counterpartyToken = str;
                break;
            default:
                str.getClass();
                this.appService = activityClientService;
                this.counterpartyToken = str;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a8  */
    @Override // com.squareup.cash.activity.backend.loader.ActivitiesManager.ActivityPageHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object requestPage(ActivitiesManager.ActivityContext activityContext, ActivitiesManager.ActivityPage.PageOffset pageOffset, Continuation continuation) {
        CounterpartyPageRequestHandler$requestPage$1 counterpartyPageRequestHandler$requestPage$1;
        int i;
        ActivityPageThreadedFeedResponse activityPageThreadedFeedResponse;
        InvestingStockDetailsActivityRequestHandler$requestPage$1 investingStockDetailsActivityRequestHandler$requestPage$1;
        int i2;
        ActivityPageThreadedFeedResponse activityPageThreadedFeedResponse2;
        int i3 = this.$r8$classId;
        ActivityClientService activityClientService = this.appService;
        switch (i3) {
            case 0:
                if (continuation instanceof CounterpartyPageRequestHandler$requestPage$1) {
                    counterpartyPageRequestHandler$requestPage$1 = (CounterpartyPageRequestHandler$requestPage$1) continuation;
                    int i4 = counterpartyPageRequestHandler$requestPage$1.label;
                    if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                        counterpartyPageRequestHandler$requestPage$1.label = i4 - PKIFailureInfo.systemUnavail;
                        Object obj = counterpartyPageRequestHandler$requestPage$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = counterpartyPageRequestHandler$requestPage$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj);
                            if (StringsKt.isBlank(this.counterpartyToken)) {
                                return new ActivitiesManager.ActivityPage(EmptyList.INSTANCE, false, null);
                            }
                            ActivityPageThreadedFeedRequest activityPageThreadedFeedRequest = new ActivityPageThreadedFeedRequest(pageOffset != null ? new ActivityOffset(pageOffset.offset) : null, activityContext.activityScope, activityContext.activityToken, this.counterpartyToken, 25);
                            counterpartyPageRequestHandler$requestPage$1.label = 1;
                            obj = activityClientService.activityPageThreadedFeed(activityPageThreadedFeedRequest, counterpartyPageRequestHandler$requestPage$1);
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
                        ApiResult apiResult = (ApiResult) obj;
                        activityPageThreadedFeedResponse = (ActivityPageThreadedFeedResponse) (!(apiResult instanceof ApiResult.Success) ? ((ApiResult.Success) apiResult).response : null);
                        if (activityPageThreadedFeedResponse == null) {
                            return ActivitiesManager.ActivityPage.Companion.toActivityPage(activityPageThreadedFeedResponse);
                        }
                        return null;
                    }
                }
                counterpartyPageRequestHandler$requestPage$1 = new CounterpartyPageRequestHandler$requestPage$1(this, (ContinuationImpl) continuation);
                Object obj2 = counterpartyPageRequestHandler$requestPage$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = counterpartyPageRequestHandler$requestPage$1.label;
                if (i != 0) {
                }
                ApiResult apiResult2 = (ApiResult) obj2;
                activityPageThreadedFeedResponse = (ActivityPageThreadedFeedResponse) (!(apiResult2 instanceof ApiResult.Success) ? ((ApiResult.Success) apiResult2).response : null);
                if (activityPageThreadedFeedResponse == null) {
                }
            default:
                if (continuation instanceof InvestingStockDetailsActivityRequestHandler$requestPage$1) {
                    investingStockDetailsActivityRequestHandler$requestPage$1 = (InvestingStockDetailsActivityRequestHandler$requestPage$1) continuation;
                    int i5 = investingStockDetailsActivityRequestHandler$requestPage$1.label;
                    if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                        investingStockDetailsActivityRequestHandler$requestPage$1.label = i5 - PKIFailureInfo.systemUnavail;
                        Object obj3 = investingStockDetailsActivityRequestHandler$requestPage$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = investingStockDetailsActivityRequestHandler$requestPage$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj3);
                            ActivityPageThreadedFeedRequest activityPageThreadedFeedRequest2 = new ActivityPageThreadedFeedRequest(pageOffset != null ? new ActivityOffset(pageOffset.offset) : null, activityContext.activityScope, activityContext.activityToken, this.counterpartyToken, 25);
                            investingStockDetailsActivityRequestHandler$requestPage$1.label = 1;
                            obj3 = activityClientService.activityPageThreadedFeed(activityPageThreadedFeedRequest2, investingStockDetailsActivityRequestHandler$requestPage$1);
                            if (obj3 == coroutineSingletons3) {
                                return coroutineSingletons3;
                            }
                        } else {
                            if (i2 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj3);
                        }
                        ApiResult apiResult3 = (ApiResult) obj3;
                        activityPageThreadedFeedResponse2 = (ActivityPageThreadedFeedResponse) (!(apiResult3 instanceof ApiResult.Success) ? ((ApiResult.Success) apiResult3).response : null);
                        if (activityPageThreadedFeedResponse2 == null) {
                            return ActivitiesManager.ActivityPage.Companion.toActivityPage(activityPageThreadedFeedResponse2);
                        }
                        return null;
                    }
                }
                investingStockDetailsActivityRequestHandler$requestPage$1 = new InvestingStockDetailsActivityRequestHandler$requestPage$1(this, (ContinuationImpl) continuation);
                Object obj32 = investingStockDetailsActivityRequestHandler$requestPage$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = investingStockDetailsActivityRequestHandler$requestPage$1.label;
                if (i2 != 0) {
                }
                ApiResult apiResult32 = (ApiResult) obj32;
                activityPageThreadedFeedResponse2 = (ActivityPageThreadedFeedResponse) (!(apiResult32 instanceof ApiResult.Success) ? ((ApiResult.Success) apiResult32).response : null);
                if (activityPageThreadedFeedResponse2 == null) {
                }
        }
    }
}

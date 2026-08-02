package com.squareup.cash.paychecks.presenters;

import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.backend.loader.ActivityData;
import com.squareup.cash.activity.backend.loader.FormattedPaymentHistoryActivityData;
import com.squareup.cash.activity.backend.loader.FormattingFailedPaymentHistoryActivityData;
import com.squareup.cash.activity.backend.loader.OrderActivityData;
import com.squareup.cash.activity.backend.loader.PaycheckActivityData;
import com.squareup.cash.activity.backend.loader.PaymentHistoryActivityData;
import com.squareup.cash.db.WireAdapter;
import com.squareup.protos.cash.activity.api.v1.ActivityClientService;
import com.squareup.protos.cash.activity.api.v1.ActivityItemGlobalId;
import com.squareup.protos.cash.activity.api.v1.ActivityPageRequest;
import com.squareup.protos.cash.activity.api.v1.ActivityPageResponse;
import com.squareup.protos.cash.activity.api.v1.ActivityRowSection;
import com.squareup.protos.cash.paychecks.api.v1.PaychecksAppService;
import com.squareup.protos.cash.paychecks.api.v1.PaychecksAugmentedActivityPageResponse;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import squareup.cash.paychecks.CalendarMonthPaychecksAggregation;
import squareup.cash.paychecks.Paycheck;
import squareup.cash.paychecks.TimeBoundedPaychecksAggregation;

/* loaded from: classes5.dex */
public final class PaychecksAugmentedActivityRequestHandler extends WireAdapter {
    public final PaychecksAppService service;

    public PaychecksAugmentedActivityRequestHandler(PaychecksAppService paychecksAppService, ActivityClientService activityClientService) {
        super(activityClientService);
        this.service = paychecksAppService;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.squareup.cash.db.WireAdapter, com.squareup.cash.activity.backend.loader.ActivitiesManager.ActivityPageHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object requestPage(ActivitiesManager.ActivityContext activityContext, ActivitiesManager.ActivityPage.PageOffset pageOffset, Continuation continuation) {
        PaychecksAugmentedActivityRequestHandler$requestPage$1 paychecksAugmentedActivityRequestHandler$requestPage$1;
        int i;
        PaychecksAugmentedActivityPageResponse paychecksAugmentedActivityPageResponse;
        ActivityPageResponse activityPageResponse;
        List list;
        Object obj;
        if (continuation instanceof PaychecksAugmentedActivityRequestHandler$requestPage$1) {
            paychecksAugmentedActivityRequestHandler$requestPage$1 = (PaychecksAugmentedActivityRequestHandler$requestPage$1) continuation;
            int i2 = paychecksAugmentedActivityRequestHandler$requestPage$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                paychecksAugmentedActivityRequestHandler$requestPage$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = paychecksAugmentedActivityRequestHandler$requestPage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paychecksAugmentedActivityRequestHandler$requestPage$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    ActivityPageRequest buildPageRequest = WireAdapter.buildPageRequest(activityContext, pageOffset);
                    paychecksAugmentedActivityRequestHandler$requestPage$1.label = 1;
                    obj2 = this.service.getActivityPage(buildPageRequest, paychecksAugmentedActivityRequestHandler$requestPage$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj2);
                }
                ApiResult apiResult = (ApiResult) obj2;
                paychecksAugmentedActivityPageResponse = (PaychecksAugmentedActivityPageResponse) (!(apiResult instanceof ApiResult.Success) ? ((ApiResult.Success) apiResult).response : null);
                if (paychecksAugmentedActivityPageResponse == null || (activityPageResponse = paychecksAugmentedActivityPageResponse.response) == null) {
                    return null;
                }
                ActivitiesManager.ActivityPage activityPage = ActivitiesManager.ActivityPage.Companion.toActivityPage(activityPageResponse);
                list = paychecksAugmentedActivityPageResponse.monthly_aggregations;
                if (!list.isEmpty()) {
                    return activityPage;
                }
                List<ActivityData> list2 = activityPage.activities;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                for (ActivityData activityData : list2) {
                    if (!(activityData instanceof PaymentHistoryActivityData) && !(activityData instanceof FormattedPaymentHistoryActivityData) && !(activityData instanceof FormattingFailedPaymentHistoryActivityData) && !(activityData instanceof OrderActivityData)) {
                        if (!(activityData instanceof PaycheckActivityData)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            CalendarMonthPaychecksAggregation calendarMonthPaychecksAggregation = (CalendarMonthPaychecksAggregation) obj;
                            TimeBoundedPaychecksAggregation timeBoundedPaychecksAggregation = calendarMonthPaychecksAggregation.aggregation;
                            timeBoundedPaychecksAggregation.getClass();
                            Long l = timeBoundedPaychecksAggregation.start_date;
                            l.getClass();
                            long longValue = l.longValue();
                            TimeBoundedPaychecksAggregation timeBoundedPaychecksAggregation2 = calendarMonthPaychecksAggregation.aggregation;
                            timeBoundedPaychecksAggregation2.getClass();
                            Long l2 = timeBoundedPaychecksAggregation2.end_date;
                            l2.getClass();
                            long longValue2 = l2.longValue();
                            Paycheck.SettlementDate settlementDate = ((PaycheckActivityData) activityData).paycheck.settlement_date;
                            settlementDate.getClass();
                            Long l3 = settlementDate.date;
                            l3.getClass();
                            long longValue3 = l3.longValue();
                            if (longValue <= longValue3 && longValue3 <= longValue2) {
                                break;
                            }
                        }
                        PaycheckActivityData paycheckActivityData = (PaycheckActivityData) activityData;
                        Paycheck paycheck = paycheckActivityData.paycheck;
                        ActivityItemGlobalId activityItemGlobalId = paycheckActivityData.activityItemGlobalId;
                        long j = paycheckActivityData.version;
                        String str = paycheckActivityData.rowId;
                        ActivityRowSection activityRowSection = paycheckActivityData.section;
                        Set set = paycheckActivityData.productClassifiers;
                        ActivityItemGlobalId activityItemGlobalId2 = paycheckActivityData.referenceItemId;
                        paycheck.getClass();
                        activityItemGlobalId.getClass();
                        str.getClass();
                        set.getClass();
                        activityData = new PaycheckActivityData(paycheck, activityItemGlobalId, j, (CalendarMonthPaychecksAggregation) obj, str, activityRowSection, set, activityItemGlobalId2);
                    }
                    arrayList.add(activityData);
                }
                return ActivitiesManager.ActivityPage.copy$default(activityPage, arrayList);
            }
        }
        paychecksAugmentedActivityRequestHandler$requestPage$1 = new PaychecksAugmentedActivityRequestHandler$requestPage$1(this, (ContinuationImpl) continuation);
        Object obj22 = paychecksAugmentedActivityRequestHandler$requestPage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paychecksAugmentedActivityRequestHandler$requestPage$1.label;
        if (i != 0) {
        }
        ApiResult apiResult2 = (ApiResult) obj22;
        paychecksAugmentedActivityPageResponse = (PaychecksAugmentedActivityPageResponse) (!(apiResult2 instanceof ApiResult.Success) ? ((ApiResult.Success) apiResult2).response : null);
        if (paychecksAugmentedActivityPageResponse == null) {
            ActivitiesManager.ActivityPage activityPage2 = ActivitiesManager.ActivityPage.Companion.toActivityPage(activityPageResponse);
            list = paychecksAugmentedActivityPageResponse.monthly_aggregations;
            if (!list.isEmpty()) {
            }
        }
        return null;
    }
}

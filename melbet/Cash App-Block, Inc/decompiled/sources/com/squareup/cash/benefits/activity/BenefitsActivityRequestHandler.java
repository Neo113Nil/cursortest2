package com.squareup.cash.benefits.activity;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.backend.loader.DefaultSearchPageRequestHandler;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda2;
import com.squareup.cash.benefits.utils.GeneralBankingBenefitsError;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.protos.cash.activity.api.v1.ActivityClientService;
import com.squareup.protos.cash.activity.api.v1.ActivitySearchFilter;
import com.squareup.protos.cash.activity.api.v1.ActivitySearchFilterGroup;
import com.squareup.protos.cash.activity.api.v1.DateSearchFilter;
import com.squareup.protos.cash.activity.api.v1.SearchFilterComparison;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class BenefitsActivityRequestHandler extends DefaultSearchPageRequestHandler {
    public final ErrorReporter errorReporter;
    public final Long periodEndAt;
    public final Long periodStartAt;

    public BenefitsActivityRequestHandler(ActivityClientService activityClientService, ErrorReporter errorReporter, Long l, Long l2) {
        super(activityClientService, new ActivitySearchFilter[0]);
        this.errorReporter = errorReporter;
        this.periodStartAt = l;
        this.periodEndAt = l2;
    }

    @Override // com.squareup.cash.activity.backend.loader.DefaultSearchPageRequestHandler
    public final List getFilterGroups() {
        ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        createListBuilder.add(BenefitsActivityRequestHandlerKt.INCLUDE_PRODUCT_SEARCH_FILTER);
        createListBuilder.add(BenefitsActivityRequestHandlerKt.EXCLUDE_PRODUCT_SEARCH_FILTER);
        createListBuilder.add(BenefitsActivityRequestHandlerKt.SENDER_CANCELED_PAYMENT_STATE_SEARCH_FILTER);
        createListBuilder.add(BenefitsActivityRequestHandlerKt.FAILED_PAYMENT_STATE_SEARCH_FILTER);
        Long l = this.periodStartAt;
        if (l != null) {
            createListBuilder.add(new ActivitySearchFilter(new ActivitySearchFilter.SearchFilter.Date(new DateSearchFilter(Long.valueOf(l.longValue()), SearchFilterComparison.GREATER_THAN_OR_EQUAL_TO))));
        }
        Long l2 = this.periodEndAt;
        if (l2 != null) {
            createListBuilder.add(new ActivitySearchFilter(new ActivitySearchFilter.SearchFilter.Date(new DateSearchFilter(Long.valueOf(l2.longValue()), SearchFilterComparison.LESS_THAN_OR_EQUAL_TO))));
        }
        return CollectionsKt__CollectionsJVMKt.listOf(new ActivitySearchFilterGroup(CollectionsKt__CollectionsJVMKt.build(createListBuilder)));
    }

    @Override // com.squareup.cash.activity.backend.loader.DefaultSearchPageRequestHandler
    public final Function1 getPageSize() {
        return new AvatarsKt$$ExternalSyntheticLambda2(29);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // com.squareup.cash.activity.backend.loader.DefaultSearchPageRequestHandler, com.squareup.cash.activity.backend.loader.ActivitiesManager.ActivityPageHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object requestPage(ActivitiesManager.ActivityContext activityContext, ActivitiesManager.ActivityPage.PageOffset pageOffset, Continuation continuation) {
        BenefitsActivityRequestHandler$requestPage$1 benefitsActivityRequestHandler$requestPage$1;
        int i;
        boolean z;
        ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy;
        ErrorReporter errorReporter;
        if (continuation instanceof BenefitsActivityRequestHandler$requestPage$1) {
            benefitsActivityRequestHandler$requestPage$1 = (BenefitsActivityRequestHandler$requestPage$1) continuation;
            int i2 = benefitsActivityRequestHandler$requestPage$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                benefitsActivityRequestHandler$requestPage$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = benefitsActivityRequestHandler$requestPage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = benefitsActivityRequestHandler$requestPage$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    benefitsActivityRequestHandler$requestPage$1.L$1 = pageOffset;
                    benefitsActivityRequestHandler$requestPage$1.label = 1;
                    obj = DefaultSearchPageRequestHandler.requestPage$suspendImpl(this, activityContext, pageOffset, benefitsActivityRequestHandler$requestPage$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pageOffset = benefitsActivityRequestHandler$requestPage$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                ActivitiesManager.ActivityPage activityPage = (ActivitiesManager.ActivityPage) obj;
                z = (pageOffset == null ? pageOffset.offset : null) != null;
                List list = activityPage != null ? activityPage.activities : null;
                boolean z2 = list != null || list.isEmpty();
                defaultSamplingStrategy = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
                errorReporter = this.errorReporter;
                if (z && z2 && activityPage != null && activityPage.hasNextPage) {
                    errorReporter.report(new GeneralBankingBenefitsError("First benefits activity page is empty but response indicates there are more pages.\n Search made with filters: " + getFilterGroups() + " and page size " + ((Object) 50)), defaultSamplingStrategy);
                }
                if (!z && z2) {
                    errorReporter.report(new GeneralBankingBenefitsError("Benefits activity page is empty but is not the first page.\n Search made with filters: " + getFilterGroups() + " and page size " + ((Object) 50)), defaultSamplingStrategy);
                }
                return obj;
            }
        }
        benefitsActivityRequestHandler$requestPage$1 = new BenefitsActivityRequestHandler$requestPage$1(this, (ContinuationImpl) continuation);
        Object obj2 = benefitsActivityRequestHandler$requestPage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = benefitsActivityRequestHandler$requestPage$1.label;
        if (i != 0) {
        }
        ActivitiesManager.ActivityPage activityPage2 = (ActivitiesManager.ActivityPage) obj2;
        if ((pageOffset == null ? pageOffset.offset : null) != null) {
        }
        List list2 = activityPage2 != null ? activityPage2.activities : null;
        if (list2 != null) {
        }
        defaultSamplingStrategy = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
        errorReporter = this.errorReporter;
        if (z) {
            errorReporter.report(new GeneralBankingBenefitsError("First benefits activity page is empty but response indicates there are more pages.\n Search made with filters: " + getFilterGroups() + " and page size " + ((Object) 50)), defaultSamplingStrategy);
        }
        if (!z) {
            errorReporter.report(new GeneralBankingBenefitsError("Benefits activity page is empty but is not the first page.\n Search made with filters: " + getFilterGroups() + " and page size " + ((Object) 50)), defaultSamplingStrategy);
        }
        return obj2;
    }
}

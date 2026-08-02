package com.squareup.cash.card.spendinginsights.activity;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda10;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.backend.loader.DefaultSearchPageRequestHandler;
import com.squareup.cash.card.spendinginsights.backend.api.GeneralSpendingInsightsError;
import com.squareup.cash.card.spendinginsights.backend.api.model.SpendingInsightsConfig;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.protos.cash.activity.api.v1.ActivityClientService;
import com.squareup.protos.cash.activity.api.v1.ActivityProductClassifier;
import com.squareup.protos.cash.activity.api.v1.ActivitySearchFilter;
import com.squareup.protos.cash.activity.api.v1.ActivitySearchFilterGroup;
import com.squareup.protos.cash.activity.api.v1.ProductClassifierAnyOfSearchFilter;
import com.squareup.protos.cash.activity.api.v1.ProductClassifierSearchFilter;
import com.squareup.protos.cash.activity.api.v1.SearchFilterContains;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class SpendingInsightsActivityRequestHandler extends DefaultSearchPageRequestHandler {
    public final SpendingInsightsConfig.ActivitySection config;
    public final ErrorReporter errorReporter;

    public SpendingInsightsActivityRequestHandler(ActivityClientService activityClientService, ErrorReporter errorReporter, SpendingInsightsConfig.ActivitySection activitySection) {
        super(activityClientService, new ActivitySearchFilter[0]);
        this.errorReporter = errorReporter;
        this.config = activitySection;
    }

    @Override // com.squareup.cash.activity.backend.loader.DefaultSearchPageRequestHandler
    public final List getFilterGroups() {
        SpendingInsightsConfig.ActivitySection activitySection = this.config;
        if (activitySection != null) {
            SpendingInsightsConfig.ActivitySection.ActivityFilter activityFilter = activitySection.activityFilter;
            List list = activityFilter.exclude;
            List list2 = activityFilter.include;
            if (list2.isEmpty() && list.isEmpty()) {
                return EmptyList.INSTANCE;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                ActivityProductClassifier mapProductClassifier = mapProductClassifier((String) it.next());
                if (mapProductClassifier != null) {
                    arrayList.add(mapProductClassifier);
                }
            }
            Collection listOf = arrayList.isEmpty() ? EmptyList.INSTANCE : CollectionsKt__CollectionsJVMKt.listOf(new ActivitySearchFilter(new ActivitySearchFilter.SearchFilter.ProductClassifiersAnyOf(new ProductClassifierAnyOfSearchFilter(arrayList))));
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ActivityProductClassifier mapProductClassifier2 = mapProductClassifier((String) it2.next());
                if (mapProductClassifier2 != null) {
                    arrayList2.add(mapProductClassifier2);
                }
            }
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(new ActivitySearchFilter(new ActivitySearchFilter.SearchFilter.ProductClassifier(new ProductClassifierSearchFilter((ActivityProductClassifier) it3.next(), SearchFilterContains.DOES_NOT_CONTAIN, 4))));
            }
            List listOf2 = CollectionsKt__CollectionsJVMKt.listOf(new ActivitySearchFilterGroup(CollectionsKt.plus((Iterable) arrayList3, listOf)));
            if (listOf2 != null) {
                return listOf2;
            }
        }
        return EmptyList.INSTANCE;
    }

    @Override // com.squareup.cash.activity.backend.loader.DefaultSearchPageRequestHandler
    public final Function1 getPageSize() {
        Integer num;
        SpendingInsightsConfig.ActivitySection activitySection = this.config;
        if (activitySection == null || (num = activitySection.pageSize) == null) {
            return null;
        }
        return new DatePickerKt$$ExternalSyntheticLambda10(num.intValue(), 8);
    }

    public final ActivityProductClassifier mapProductClassifier(String str) {
        try {
            return ActivityProductClassifier.valueOf(str);
        } catch (IllegalArgumentException e) {
            this.errorReporter.report(new GeneralSpendingInsightsError(Recorder$$ExternalSyntheticOutline2.m("Invalid product classifier name: ", str), e), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.squareup.cash.activity.backend.loader.DefaultSearchPageRequestHandler, com.squareup.cash.activity.backend.loader.ActivitiesManager.ActivityPageHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object requestPage(ActivitiesManager.ActivityContext activityContext, ActivitiesManager.ActivityPage.PageOffset pageOffset, Continuation continuation) {
        SpendingInsightsActivityRequestHandler$requestPage$1 spendingInsightsActivityRequestHandler$requestPage$1;
        int i;
        boolean z;
        ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy;
        ErrorReporter errorReporter;
        if (continuation instanceof SpendingInsightsActivityRequestHandler$requestPage$1) {
            spendingInsightsActivityRequestHandler$requestPage$1 = (SpendingInsightsActivityRequestHandler$requestPage$1) continuation;
            int i2 = spendingInsightsActivityRequestHandler$requestPage$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                spendingInsightsActivityRequestHandler$requestPage$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = spendingInsightsActivityRequestHandler$requestPage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = spendingInsightsActivityRequestHandler$requestPage$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    spendingInsightsActivityRequestHandler$requestPage$1.L$1 = pageOffset;
                    spendingInsightsActivityRequestHandler$requestPage$1.label = 1;
                    obj = DefaultSearchPageRequestHandler.requestPage$suspendImpl(this, activityContext, pageOffset, spendingInsightsActivityRequestHandler$requestPage$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pageOffset = spendingInsightsActivityRequestHandler$requestPage$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                ActivitiesManager.ActivityPage activityPage = (ActivitiesManager.ActivityPage) obj;
                z = (pageOffset == null ? pageOffset.offset : null) != null;
                List list = activityPage == null ? activityPage.activities : null;
                boolean z2 = list != null || list.isEmpty();
                defaultSamplingStrategy = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
                errorReporter = this.errorReporter;
                if (z && z2 && activityPage != null && activityPage.hasNextPage) {
                    List filterGroups = getFilterGroups();
                    Function1 pageSize = getPageSize();
                    errorReporter.report(new GeneralSpendingInsightsError("First card activity page is empty but response indicates there are more pages.\n Search made with filters: " + filterGroups + " and page size " + (pageSize == null ? Integer.valueOf(((DatePickerKt$$ExternalSyntheticLambda10) pageSize).f$0) : null)), defaultSamplingStrategy);
                }
                if (!z && z2) {
                    List filterGroups2 = getFilterGroups();
                    Function1 pageSize2 = getPageSize();
                    errorReporter.report(new GeneralSpendingInsightsError("Card activity page is empty but is not the first page.\n Search made with filters: " + filterGroups2 + " and page size " + (pageSize2 != null ? Integer.valueOf(((DatePickerKt$$ExternalSyntheticLambda10) pageSize2).f$0) : null)), defaultSamplingStrategy);
                }
                return obj;
            }
        }
        spendingInsightsActivityRequestHandler$requestPage$1 = new SpendingInsightsActivityRequestHandler$requestPage$1(this, (ContinuationImpl) continuation);
        Object obj2 = spendingInsightsActivityRequestHandler$requestPage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = spendingInsightsActivityRequestHandler$requestPage$1.label;
        if (i != 0) {
        }
        ActivitiesManager.ActivityPage activityPage2 = (ActivitiesManager.ActivityPage) obj2;
        if ((pageOffset == null ? pageOffset.offset : null) != null) {
        }
        List list2 = activityPage2 == null ? activityPage2.activities : null;
        if (list2 != null) {
        }
        defaultSamplingStrategy = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
        errorReporter = this.errorReporter;
        if (z) {
            List filterGroups3 = getFilterGroups();
            Function1 pageSize3 = getPageSize();
            if (pageSize3 == null) {
            }
            errorReporter.report(new GeneralSpendingInsightsError("First card activity page is empty but response indicates there are more pages.\n Search made with filters: " + filterGroups3 + " and page size " + (pageSize3 == null ? Integer.valueOf(((DatePickerKt$$ExternalSyntheticLambda10) pageSize3).f$0) : null)), defaultSamplingStrategy);
        }
        if (!z) {
            List filterGroups22 = getFilterGroups();
            Function1 pageSize22 = getPageSize();
            if (pageSize22 != null) {
            }
            errorReporter.report(new GeneralSpendingInsightsError("Card activity page is empty but is not the first page.\n Search made with filters: " + filterGroups22 + " and page size " + (pageSize22 != null ? Integer.valueOf(((DatePickerKt$$ExternalSyntheticLambda10) pageSize22).f$0) : null)), defaultSamplingStrategy);
        }
        return obj2;
    }
}

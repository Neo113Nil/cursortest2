package com.squareup.cash.paychecks.presenters;

import androidx.compose.ui.platform.WindowInfoImpl;
import com.squareup.cash.activity.backend.ActivityFeedGroup;
import com.squareup.cash.activity.backend.ActivityFeedProducer;
import com.squareup.cash.activity.backend.ActivityGrouping;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.backend.loader.Activities;
import com.squareup.cash.activity.backend.loader.PaycheckActivityData;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.ReportedError;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.paychecks.backend.api.model.PaychecksUiState;
import com.squareup.cash.paychecks.presenters.util.UtilsKt;
import com.squareup.cash.paychecks.viewmodels.PaycheckSectionAggregation;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import squareup.cash.paychecks.CalendarMonthPaychecksAggregation;

/* loaded from: classes6.dex */
public final class PaychecksActivityFeedProducer implements ActivityFeedProducer, HasObservability {
    public final MoneyFormatter amountFormatter;
    public final ErrorReporter errorReporter;
    public final SampleStrategy oneErrorPerAppSessionStrategy;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/squareup/cash/paychecks/presenters/PaychecksActivityFeedProducer$PaychecksAggregationError", "Lcom/squareup/cash/observability/types/ReportedError;", "presenters"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class PaychecksAggregationError extends ReportedError {
        public final Set features = ArraysKt___ArraysKt.toSet(new ErrorFeature[]{ErrorFeature.Paychecks.INSTANCE, ErrorFeature.Activity.INSTANCE});
        public final String message = "Paychecks aggregation is missing. Dropping items from the feed!";

        @Override // com.squareup.cash.observability.types.FeatureError
        public final Set getFeatures() {
            return this.features;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.message;
        }
    }

    public PaychecksActivityFeedProducer(ErrorReporter errorReporter, SampleStrategy sampleStrategy, LocalizedMoneyFormatter.Factory factory) {
        this.errorReporter = errorReporter;
        this.oneErrorPerAppSessionStrategy = sampleStrategy;
        this.amountFormatter = factory.create(MoneyFormatterConfig.STANDARD);
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final ErrorReporter getErrorReporter() {
        return this.errorReporter;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final SampleStrategy getOneErrorPerAppSessionStrategy() {
        return this.oneErrorPerAppSessionStrategy;
    }

    @Override // com.squareup.cash.activity.backend.ActivityFeedProducer
    public final ArrayList produceFeed(Activities activities, List list, int i) {
        ActivityFeedGroup activityFeedGroup;
        ActivityFeedGroup activityFeedGroup2;
        Iterable iterable = activities.recentActivities;
        if (iterable == null) {
            iterable = EmptyList.INSTANCE;
        }
        List take = CollectionsKt.take(iterable, i);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = take.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            ActivityItem activityItem = (ActivityItem) next;
            PaycheckActivityData paycheckActivityData = activityItem instanceof PaycheckActivityData ? (PaycheckActivityData) activityItem : null;
            CalendarMonthPaychecksAggregation calendarMonthPaychecksAggregation = paycheckActivityData != null ? paycheckActivityData.aggregation : null;
            Object obj = linkedHashMap.get(calendarMonthPaychecksAggregation);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(calendarMonthPaychecksAggregation, obj);
            }
            ((List) obj).add(next);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            CalendarMonthPaychecksAggregation calendarMonthPaychecksAggregation2 = (CalendarMonthPaychecksAggregation) entry.getKey();
            List list2 = (List) entry.getValue();
            if (calendarMonthPaychecksAggregation2 == null) {
                this.errorReporter.report(new PaychecksAggregationError(), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                activityFeedGroup2 = null;
            } else {
                PaychecksUiState.CalendarMonthPaychecksAggregation calendarMonthPaychecksAggregation3 = WindowInfoImpl.Companion.toCalendarMonthPaychecksAggregation(this, calendarMonthPaychecksAggregation2);
                TimeZone timeZone = UtilsKt.paycheckTimeZone;
                LocalDate atDay = YearMonth.of((int) calendarMonthPaychecksAggregation3.year, (int) calendarMonthPaychecksAggregation3.monthInYear).atDay(1);
                atDay.getClass();
                activityFeedGroup2 = new ActivityFeedGroup(new ActivityGrouping.ByOtherMonth(atDay), list2, new PaycheckSectionAggregation(this.amountFormatter.format(com.squareup.cash.paychecks.common.presenters.UtilsKt.getTotalAmount(calendarMonthPaychecksAggregation3.aggregation)), calendarMonthPaychecksAggregation3));
            }
            if (activityFeedGroup2 != null) {
                arrayList.add(activityFeedGroup2);
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            ActivityGrouping activityGrouping = ((ActivityFeedGroup) next2).grouping;
            Object obj2 = linkedHashMap2.get(activityGrouping);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap2.put(activityGrouping, obj2);
            }
            ((List) obj2).add(next2);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap2.size());
        Iterator it3 = linkedHashMap2.entrySet().iterator();
        while (it3.hasNext()) {
            List list3 = (List) ((Map.Entry) it3.next()).getValue();
            if (list3.size() == 1) {
                activityFeedGroup = (ActivityFeedGroup) CollectionsKt.first(list3);
            } else {
                ActivityGrouping activityGrouping2 = ((ActivityFeedGroup) CollectionsKt.first(list3)).grouping;
                ArrayList arrayList3 = new ArrayList();
                Iterator it4 = list3.iterator();
                while (it4.hasNext()) {
                    CollectionsKt__MutableCollectionsKt.addAll(((ActivityFeedGroup) it4.next()).items, arrayList3);
                }
                activityFeedGroup = new ActivityFeedGroup(activityGrouping2, arrayList3, ((ActivityFeedGroup) CollectionsKt.first(list3)).aggregation);
            }
            arrayList2.add(activityFeedGroup);
        }
        return arrayList2;
    }
}

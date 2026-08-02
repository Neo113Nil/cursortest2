package com.squareup.cash.afterpayapplet.presenters;

import app.cash.broadway.navigation.Navigator;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmh;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.backend.OrderActivityItem;
import com.squareup.cash.activity.backend.loader.OrderActivityData;
import com.squareup.cash.activity.presenters.ActivityItemEventHandler;
import com.squareup.cash.activity.viewmodels.ActivityItemViewEvent;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletAnalytics;
import com.squareup.cash.cdf.OrderState;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.payments.backend.api.PaymentManager;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.protos.cash.activity.api.v1.OrderRow;
import com.squareup.protos.cash.pay.CashAppPayLoanSummaryRenderData;
import com.squareup.protos.cash.pay.CashAppPayOrderRenderData;
import com.squareup.protos.cash.pay.CashAppPayPaymentScheduleRenderData;
import com.squareup.protos.common.Money;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.Instant;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SafeFlow;

/* loaded from: classes5.dex */
public final class OrderItemEventHandler implements ActivityItemEventHandler {
    public final RealAfterpayAppletAnalytics afterpayAppletAnalytics;
    public final AndroidDateFormatManager dateFormatManager;
    public final FeatureFlagManager featureFlagManager;
    public final Function1 feedCallback;
    public final FlowStarter flowStarter;
    public final Navigator navigator;
    public final PaymentManager paymentManager;
    public final RealRouter$Factory$Impl routerFactory;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderRow.OrderRowLoanUiState.values().length];
            try {
                iArr[OrderRow.OrderRowLoanUiState.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderRow.OrderRowLoanUiState.DUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderRow.OrderRowLoanUiState.COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OrderRow.OrderRowLoanUiState.OVERDUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OrderRow.OrderRowLoanUiState.REFUNDED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OrderRow.OrderRowLoanUiState.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public OrderItemEventHandler(Navigator navigator, Function1 function1, FeatureFlagManager featureFlagManager, RealRouter$Factory$Impl realRouter$Factory$Impl, FlowStarter flowStarter, RealAfterpayAppletAnalytics realAfterpayAppletAnalytics, AndroidDateFormatManager androidDateFormatManager, PaymentManager paymentManager, RealUuidGenerator realUuidGenerator) {
        navigator.getClass();
        this.navigator = navigator;
        this.feedCallback = function1;
        this.featureFlagManager = featureFlagManager;
        this.routerFactory = realRouter$Factory$Impl;
        this.flowStarter = flowStarter;
        this.afterpayAppletAnalytics = realAfterpayAppletAnalytics;
        this.dateFormatManager = androidDateFormatManager;
        this.paymentManager = paymentManager;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Long amountDisplayed(OrderActivityItem orderActivityItem) {
        Object obj;
        CashAppPayOrderRenderData.OrderAggregations.MoneyAggregations moneyAggregations;
        Money money = null;
        switch (WhenMappings.$EnumSwitchMapping$0[((OrderActivityData) orderActivityItem).orderRowState.ordinal()]) {
            case 1:
                return null;
            case 2:
                CashAppPayOrderRenderData cashAppPayOrderRenderData = ((OrderActivityData) orderActivityItem).orderRenderData;
                List list = cashAppPayOrderRenderData.payment_schedules;
                CashAppPayOrderRenderData.OrderAggregations orderAggregations = cashAppPayOrderRenderData.order_aggregations;
                orderAggregations.getClass();
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (Intrinsics.areEqual(((CashAppPayPaymentScheduleRenderData) obj).payment_schedule_id, orderAggregations.next_upcoming_payment_schedule_id)) {
                        }
                    } else {
                        obj = null;
                    }
                }
                CashAppPayPaymentScheduleRenderData cashAppPayPaymentScheduleRenderData = (CashAppPayPaymentScheduleRenderData) obj;
                if (cashAppPayPaymentScheduleRenderData != null) {
                    Money money2 = cashAppPayPaymentScheduleRenderData.owed_money;
                    if (money2 != null) {
                        return money2.amount;
                    }
                } else {
                    a$$ExternalSyntheticBUOutline0.m$1("Active order must have upcoming payment");
                }
                return null;
            case 3:
                CashAppPayOrderRenderData cashAppPayOrderRenderData2 = ((OrderActivityData) orderActivityItem).orderRenderData;
                CashAppPayOrderRenderData.OrderAggregations orderAggregations2 = cashAppPayOrderRenderData2.order_aggregations;
                if (orderAggregations2 != null && (moneyAggregations = orderAggregations2.money_aggregations) != null) {
                    money = moneyAggregations.total_loan_paid_money;
                }
                Money money3 = cashAppPayOrderRenderData2.order_total_money;
                money3.getClass();
                if (money == null) {
                    money = money3;
                }
                return money.amount;
            case 4:
                CashAppPayOrderRenderData.OrderAggregations orderAggregations3 = ((OrderActivityData) orderActivityItem).orderRenderData.order_aggregations;
                orderAggregations3.getClass();
                CashAppPayOrderRenderData.OrderAggregations.MoneyAggregations moneyAggregations2 = orderAggregations3.money_aggregations;
                moneyAggregations2.getClass();
                Money money4 = moneyAggregations2.total_loan_overdue_money;
                money4.getClass();
                return money4.amount;
            case 5:
            case 6:
                Money money5 = ((OrderActivityData) orderActivityItem).orderRenderData.order_total_money;
                if (money5 != null) {
                    return money5.amount;
                }
                return null;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }

    public static String getOrderPaymentPlanReceiptUrl(CashAppPayOrderRenderData cashAppPayOrderRenderData) {
        Object obj;
        Iterator it = cashAppPayOrderRenderData.loan_summaries.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((CashAppPayLoanSummaryRenderData) obj).payment_plan_flow_url != null) {
                break;
            }
        }
        CashAppPayLoanSummaryRenderData cashAppPayLoanSummaryRenderData = (CashAppPayLoanSummaryRenderData) obj;
        if (cashAppPayLoanSummaryRenderData != null) {
            return cashAppPayLoanSummaryRenderData.payment_plan_flow_url;
        }
        return null;
    }

    public static Long nextPayment(OrderActivityItem orderActivityItem) {
        switch (WhenMappings.$EnumSwitchMapping$0[((OrderActivityData) orderActivityItem).orderRowState.ordinal()]) {
            case 1:
            case 3:
            case 5:
            case 6:
                return null;
            case 2:
            case 4:
                return amountDisplayed(orderActivityItem);
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }

    public static Integer numberOfPaymentsRemaining(OrderActivityItem orderActivityItem) {
        Object obj;
        Object obj2;
        switch (WhenMappings.$EnumSwitchMapping$0[((OrderActivityData) orderActivityItem).orderRowState.ordinal()]) {
            case 2:
                CashAppPayOrderRenderData cashAppPayOrderRenderData = ((OrderActivityData) orderActivityItem).orderRenderData;
                List list = cashAppPayOrderRenderData.payment_schedules;
                CashAppPayOrderRenderData.OrderAggregations orderAggregations = cashAppPayOrderRenderData.order_aggregations;
                orderAggregations.getClass();
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (Intrinsics.areEqual(((CashAppPayPaymentScheduleRenderData) obj).payment_schedule_id, orderAggregations.next_upcoming_payment_schedule_id)) {
                        }
                    } else {
                        obj = null;
                    }
                }
                CashAppPayPaymentScheduleRenderData cashAppPayPaymentScheduleRenderData = (CashAppPayPaymentScheduleRenderData) obj;
                if (cashAppPayPaymentScheduleRenderData != null) {
                    Integer num = cashAppPayPaymentScheduleRenderData.installment_sequence_number;
                    return Integer.valueOf((list.size() - (num != null ? num.intValue() : list.indexOf(cashAppPayPaymentScheduleRenderData) + 1)) + 1);
                }
                a$$ExternalSyntheticBUOutline0.m$1("Active order must have upcoming payment");
            case 1:
            case 3:
            case 5:
            case 6:
                return null;
            case 4:
                CashAppPayOrderRenderData cashAppPayOrderRenderData2 = ((OrderActivityData) orderActivityItem).orderRenderData;
                List list2 = cashAppPayOrderRenderData2.payment_schedules;
                CashAppPayOrderRenderData.OrderAggregations orderAggregations2 = cashAppPayOrderRenderData2.order_aggregations;
                orderAggregations2.getClass();
                Iterator it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        if (Intrinsics.areEqual(((CashAppPayPaymentScheduleRenderData) obj2).payment_schedule_id, orderAggregations2.oldest_overdue_payment_schedule_id)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                CashAppPayPaymentScheduleRenderData cashAppPayPaymentScheduleRenderData2 = (CashAppPayPaymentScheduleRenderData) obj2;
                if (cashAppPayPaymentScheduleRenderData2 != null) {
                    return Integer.valueOf((list2.size() - (list2.indexOf(cashAppPayPaymentScheduleRenderData2) + 1)) + 1);
                }
                a$$ExternalSyntheticBUOutline0.m$1("Overdue order must have an overdue payment");
                return null;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }

    public static OrderState toCdfOrderState(OrderRow.OrderRowLoanUiState orderRowLoanUiState) {
        switch (WhenMappings.$EnumSwitchMapping$0[orderRowLoanUiState.ordinal()]) {
            case 1:
                return OrderState.UNKNOWN;
            case 2:
                return OrderState.DUE;
            case 3:
                return OrderState.COMPLETED;
            case 4:
                return OrderState.OVERDUE;
            case 5:
                return OrderState.REFUNDED;
            case 6:
                return OrderState.CANCELLED;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }

    @Override // com.squareup.cash.activity.presenters.ActivityItemEventHandler
    public final Flow handleEvent(ActivityItemViewModel activityItemViewModel, ActivityItemViewEvent activityItemViewEvent, ActivityItem activityItem) {
        activityItemViewModel.getClass();
        activityItemViewEvent.getClass();
        activityItem.getClass();
        return new SafeFlow(new zzmh(activityItem, activityItemViewEvent, this, activityItemViewModel, null, 15));
    }

    public final String nextPaymentDue(OrderActivityItem orderActivityItem) {
        Object obj;
        int i = WhenMappings.$EnumSwitchMapping$0[((OrderActivityData) orderActivityItem).orderRowState.ordinal()];
        AndroidDateFormatManager androidDateFormatManager = this.dateFormatManager;
        switch (i) {
            case 1:
            case 3:
            case 5:
            case 6:
                return null;
            case 2:
                String format2 = androidDateFormatManager.getDateFormat("yyyy-MM-dd'T'HH:mm:ssZZZZZ", androidDateFormatManager.clock.timeZone()).formatter.format(Instant.ofEpochMilli(((OrderActivityData) orderActivityItem).activityItemDisplayDateMs));
                format2.getClass();
                return format2;
            case 4:
                CashAppPayOrderRenderData cashAppPayOrderRenderData = ((OrderActivityData) orderActivityItem).orderRenderData;
                List list = cashAppPayOrderRenderData.payment_schedules;
                CashAppPayOrderRenderData.OrderAggregations orderAggregations = cashAppPayOrderRenderData.order_aggregations;
                orderAggregations.getClass();
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (Intrinsics.areEqual(((CashAppPayPaymentScheduleRenderData) obj).payment_schedule_id, orderAggregations.oldest_overdue_payment_schedule_id)) {
                        }
                    } else {
                        obj = null;
                    }
                }
                CashAppPayPaymentScheduleRenderData cashAppPayPaymentScheduleRenderData = (CashAppPayPaymentScheduleRenderData) obj;
                if (cashAppPayPaymentScheduleRenderData == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("Overdue order must have an overdue payment");
                    return null;
                }
                Long l = cashAppPayPaymentScheduleRenderData.schedule_due_at;
                l.getClass();
                String format3 = androidDateFormatManager.getDateFormat("yyyy-MM-dd'T'HH:mm:ssZZZZZ", androidDateFormatManager.clock.timeZone()).formatter.format(Instant.ofEpochMilli(l.longValue()));
                format3.getClass();
                return format3;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }
}

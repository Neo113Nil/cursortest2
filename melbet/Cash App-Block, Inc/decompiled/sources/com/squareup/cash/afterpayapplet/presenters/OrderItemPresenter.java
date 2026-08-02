package com.squareup.cash.afterpayapplet.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.compose.internal.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.backend.OrderActivityItem;
import com.squareup.cash.activity.backend.loader.OrderActivityData;
import com.squareup.cash.activity.presenters.ActivityItemPresenter;
import com.squareup.cash.activity.viewmodels.ActivityItemPresentationContext;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.activity.viewmodels.ItemAccessory;
import com.squareup.cash.activity.viewmodels.ReactionsState;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda4;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.common.viewmodels.AvatarBadgeViewModel;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.datetimeformatter.api.TodayDateTimeFormatter$FormatOptions;
import com.squareup.cash.datetimeformatter.real.RealTodayDateTimeFormatter;
import com.squareup.cash.history.presenters.OrderActivityDataFormattingError;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.protos.cash.activity.api.v1.OrderRow;
import com.squareup.protos.cash.pay.CashAppPayLoanSummaryRenderData;
import com.squareup.protos.cash.pay.CashAppPayMerchantRenderData;
import com.squareup.protos.cash.pay.CashAppPayOrderRenderData;
import com.squareup.protos.cash.pay.CashAppPayPaymentScheduleRenderData;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.ui.MerchantData;
import com.squareup.protos.franklin.ui.PaymentHistoryData;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.util.cash.ColorsKt;
import com.squareup.wire.MoshiJsonIntegration;
import designsystem.arcade.ArcadeColors;
import java.time.Instant;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes5.dex */
public final class OrderItemPresenter implements ActivityItemPresenter {
    public final OrderActivityItem activityItem;
    public final MoneyFormatter amountFormatter;
    public final ErrorReporter errorReporter;
    public final Lazy eventHandler$delegate;
    public final ActivityItemPresentationContext presentationContext;
    public final AndroidStringManager stringManager;
    public final RealTodayDateTimeFormatter todayDateTimeFormatter;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderRow.OrderRowLoanUiState.values().length];
            try {
                iArr[OrderRow.OrderRowLoanUiState.DUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderRow.OrderRowLoanUiState.COMPLETED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderRow.OrderRowLoanUiState.OVERDUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OrderRow.OrderRowLoanUiState.REFUNDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OrderRow.OrderRowLoanUiState.CANCELLED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OrderRow.OrderRowLoanUiState.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public OrderItemPresenter(Navigator navigator, ActivityItem activityItem, ActivityItemPresentationContext activityItemPresentationContext, Function1 function1, ErrorReporter errorReporter, AndroidStringManager androidStringManager, LocalizedMoneyFormatter.Factory factory, RealTodayDateTimeFormatter realTodayDateTimeFormatter, OrderItemEventHandler$Factory$Impl orderItemEventHandler$Factory$Impl) {
        navigator.getClass();
        activityItem.getClass();
        this.presentationContext = activityItemPresentationContext;
        this.errorReporter = errorReporter;
        this.stringManager = androidStringManager;
        this.todayDateTimeFormatter = realTodayDateTimeFormatter;
        this.activityItem = (OrderActivityItem) activityItem;
        this.amountFormatter = factory.create(MoneyFormatterConfig.STANDARD);
        this.eventHandler$delegate = LazyKt.lazy(new CopyCodeKt$$ExternalSyntheticLambda4(orderItemEventHandler$Factory$Impl, navigator, function1, 3));
    }

    public static String createDotFormattedLabel(String str, String str2) {
        return Recorder$$ExternalSyntheticOutline2.m(str, " · ", str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final StackedAvatarViewModel.Single avatar(OrderActivityItem orderActivityItem) {
        Image image;
        CashAppPayMerchantRenderData.LogoUrls logoUrls;
        String str;
        Image image2;
        UiCustomer uiCustomer;
        String str2;
        boolean z;
        CashAppPayMerchantRenderData cashAppPayMerchantRenderData;
        Character ch;
        String str3;
        Character firstOrNull;
        String str4;
        MerchantData merchantData;
        Boolean bool;
        MerchantData merchantData2;
        Boolean bool2;
        Color color;
        UiCustomer uiCustomer2 = ((OrderActivityData) orderActivityItem).orderDisplayUiCustomer;
        if (uiCustomer2 == null || (image2 = uiCustomer2.photo) == null) {
            OrderActivityData orderActivityData = (OrderActivityData) orderActivityItem;
            UiCustomer uiCustomer3 = orderActivityData.orderDisplayUiCustomer;
            if (uiCustomer3 == null || (str = uiCustomer3.photo_url) == null) {
                CashAppPayMerchantRenderData cashAppPayMerchantRenderData2 = orderActivityData.orderRenderData.merchant;
                if (cashAppPayMerchantRenderData2 == null || (logoUrls = cashAppPayMerchantRenderData2.logo_urls) == null) {
                    image = null;
                } else {
                    String str5 = logoUrls.light_theme_url;
                    if (str5 == null) {
                        str5 = logoUrls.default_url;
                    }
                    String str6 = logoUrls.dark_theme_url;
                    if (str6 == null) {
                        str6 = str5;
                    }
                    image = new Image(str5, str6, 4);
                }
                OrderActivityData orderActivityData2 = (OrderActivityData) orderActivityItem;
                uiCustomer = orderActivityData2.orderDisplayUiCustomer;
                ColorModel accented = (uiCustomer != null || (color = uiCustomer.themed_accent_color) == null) ? (uiCustomer != null || (str2 = uiCustomer.accent_color) == null) ? ColorModel.Background.INSTANCE : new ColorModel.Accented(ColorsKt.toColor(str2)) : new ColorModel.Accented(color);
                z = false;
                boolean booleanValue = (uiCustomer != null || (merchantData2 = uiCustomer.merchant_data) == null || (bool2 = merchantData2.should_colorize_avatar) == null) ? false : bool2.booleanValue();
                if (uiCustomer != null && (merchantData = uiCustomer.merchant_data) != null && (bool = merchantData.should_fill_background) != null) {
                    z = bool.booleanValue();
                }
                if (uiCustomer != null || (str4 = uiCustomer.full_name) == null || (firstOrNull = StringsKt___StringsKt.firstOrNull(str4)) == null) {
                    cashAppPayMerchantRenderData = orderActivityData2.orderRenderData.merchant;
                    if (cashAppPayMerchantRenderData != null || (str3 = cashAppPayMerchantRenderData.display_name) == null) {
                        ch = null;
                        if (image == null && ch == null) {
                            IllegalStateException illegalStateException = new IllegalStateException("Order activity data contains null avatar data");
                            OrderActivityItem orderActivityItem2 = this.activityItem;
                            this.errorReporter.report(new OrderActivityDataFormattingError(illegalStateException, !(orderActivityItem2 instanceof OrderActivityData) ? (OrderActivityData) orderActivityItem2 : null), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                        }
                        return new StackedAvatarViewModel.Single(new StackedAvatarViewModel.Avatar(accented, ch, null, image, null, null, booleanValue ? MoshiJsonIntegration.toModel$default(ArcadeColors.IconInverse) : null, z ? accented : null, false, false, null, false, null, null, 129140));
                    }
                    firstOrNull = StringsKt___StringsKt.firstOrNull(str3);
                }
                ch = firstOrNull;
                if (image == null) {
                    IllegalStateException illegalStateException2 = new IllegalStateException("Order activity data contains null avatar data");
                    OrderActivityItem orderActivityItem22 = this.activityItem;
                    this.errorReporter.report(new OrderActivityDataFormattingError(illegalStateException2, !(orderActivityItem22 instanceof OrderActivityData) ? (OrderActivityData) orderActivityItem22 : null), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                }
                return new StackedAvatarViewModel.Single(new StackedAvatarViewModel.Avatar(accented, ch, null, image, null, null, booleanValue ? MoshiJsonIntegration.toModel$default(ArcadeColors.IconInverse) : null, z ? accented : null, false, false, null, false, null, null, 129140));
            }
            image2 = new Image(str, str, 4);
        }
        image = image2;
        OrderActivityData orderActivityData22 = (OrderActivityData) orderActivityItem;
        uiCustomer = orderActivityData22.orderDisplayUiCustomer;
        ColorModel accented2 = (uiCustomer != null || (color = uiCustomer.themed_accent_color) == null) ? (uiCustomer != null || (str2 = uiCustomer.accent_color) == null) ? ColorModel.Background.INSTANCE : new ColorModel.Accented(ColorsKt.toColor(str2)) : new ColorModel.Accented(color);
        z = false;
        if (uiCustomer != null) {
        }
        if (uiCustomer != null) {
            z = bool.booleanValue();
        }
        if (uiCustomer != null) {
        }
        cashAppPayMerchantRenderData = orderActivityData22.orderRenderData.merchant;
        if (cashAppPayMerchantRenderData != null) {
        }
        ch = null;
        if (image == null) {
        }
        return new StackedAvatarViewModel.Single(new StackedAvatarViewModel.Avatar(accented2, ch, null, image, null, null, booleanValue ? MoshiJsonIntegration.toModel$default(ArcadeColors.IconInverse) : null, z ? accented2 : null, false, false, null, false, null, null, 129140));
    }

    public final ActivityItemViewModel createActiveOrderItemViewModel() {
        Object obj;
        Object obj2;
        String format2;
        Long l;
        AndroidStringManager androidStringManager = this.stringManager;
        Resources resources = androidStringManager.resources;
        OrderActivityItem orderActivityItem = this.activityItem;
        OrderActivityData orderActivityData = (OrderActivityData) orderActivityItem;
        CashAppPayOrderRenderData cashAppPayOrderRenderData = orderActivityData.orderRenderData;
        List list = cashAppPayOrderRenderData.payment_schedules;
        List list2 = cashAppPayOrderRenderData.loan_summaries;
        CashAppPayOrderRenderData.OrderAggregations orderAggregations = cashAppPayOrderRenderData.order_aggregations;
        orderAggregations.getClass();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((CashAppPayPaymentScheduleRenderData) obj).payment_schedule_id, orderAggregations.next_upcoming_payment_schedule_id)) {
                break;
            }
        }
        CashAppPayPaymentScheduleRenderData cashAppPayPaymentScheduleRenderData = (CashAppPayPaymentScheduleRenderData) obj;
        if (cashAppPayPaymentScheduleRenderData == null) {
            a$$ExternalSyntheticBUOutline0.m$1("Active order must have upcoming payment");
            return null;
        }
        Money money = cashAppPayPaymentScheduleRenderData.owed_money;
        money.getClass();
        String format3 = this.amountFormatter.format(money);
        String formatDateMillisDisplayLabel = formatDateMillisDisplayLabel(orderActivityData.activityItemDisplayDateMs);
        Integer num = cashAppPayPaymentScheduleRenderData.installment_sequence_number;
        int intValue = num != null ? num.intValue() : list.indexOf(cashAppPayPaymentScheduleRenderData) + 1;
        String str = orderAggregations.active_loan_id;
        Iterator it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (Intrinsics.areEqual(((CashAppPayLoanSummaryRenderData) obj2).loan_id, str)) {
                break;
            }
        }
        CashAppPayLoanSummaryRenderData cashAppPayLoanSummaryRenderData = (CashAppPayLoanSummaryRenderData) obj2;
        int size = (cashAppPayLoanSummaryRenderData == null || (l = cashAppPayLoanSummaryRenderData.total_number_of_installments) == null) ? list.size() : (int) l.longValue();
        if (size > 0) {
            Object[] objArr = {Integer.valueOf(intValue), Integer.valueOf(size)};
            resources.getClass();
            format2 = new MessageFormat(resources.getString(R.string.activity_orders_payment_number_with_total)).format(objArr);
            format2.getClass();
        } else {
            this.errorReporter.report(new OrderActivityDataFormattingError(new IllegalStateException("Active orders must have an active loan or payment schedules"), orderActivityItem instanceof OrderActivityData ? (OrderActivityData) orderActivityItem : null), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
            Object[] objArr2 = {Integer.valueOf(intValue)};
            resources.getClass();
            format2 = new MessageFormat(resources.getString(R.string.activity_orders_payment_number)).format(objArr2);
            format2.getClass();
        }
        return new ActivityItemViewModel(orderActivityData.rowId, merchantTitle(orderActivityItem), format2, createDotFormattedLabel(formatDateMillisDisplayLabel, format3), (ItemAccessory) new ItemAccessory.Button(androidStringManager.get(R.string.activity_orders_action_pay), null, PaymentHistoryData.InlineButtonProminence.PROMINENT, null), (StackedAvatarViewModel) avatar(orderActivityItem), (AvatarBadgeViewModel) null, false, this.presentationContext, (Icons) null, (ReactionsState) null, "", 5632);
    }

    public final ActivityItemViewModel createCanceledOrderItemViewModel() {
        OrderActivityItem orderActivityItem = this.activityItem;
        OrderActivityData orderActivityData = (OrderActivityData) orderActivityItem;
        Money money = orderActivityData.orderRenderData.order_total_money;
        money.getClass();
        String createDotFormattedLabel = createDotFormattedLabel(formatDateMillisDisplayLabel(orderActivityData.activityItemDisplayDateMs), this.stringManager.get(R.string.activity_orders_canceled));
        return new ActivityItemViewModel(orderActivityData.rowId, merchantTitle(orderActivityItem), createDotFormattedLabel, (String) null, (ItemAccessory) new ItemAccessory.Amount(this.amountFormatter.format(money), PaymentHistoryData.AmountTreatment.STRIKETHROUGH), (StackedAvatarViewModel) avatar(orderActivityItem), (AvatarBadgeViewModel) null, false, this.presentationContext, (Icons) null, (ReactionsState) null, "", 5632);
    }

    public final ActivityItemViewModel createCompletedOrderItemViewModel() {
        CashAppPayOrderRenderData.OrderAggregations.MoneyAggregations moneyAggregations;
        OrderActivityItem orderActivityItem = this.activityItem;
        OrderActivityData orderActivityData = (OrderActivityData) orderActivityItem;
        CashAppPayOrderRenderData cashAppPayOrderRenderData = orderActivityData.orderRenderData;
        CashAppPayOrderRenderData.OrderAggregations orderAggregations = cashAppPayOrderRenderData.order_aggregations;
        Money money = (orderAggregations == null || (moneyAggregations = orderAggregations.money_aggregations) == null) ? null : moneyAggregations.total_loan_paid_money;
        Money money2 = cashAppPayOrderRenderData.order_total_money;
        money2.getClass();
        if (money == null) {
            money = money2;
        }
        return new ActivityItemViewModel(orderActivityData.rowId, merchantTitle(orderActivityItem), formatDateMillisDisplayLabel(orderActivityData.activityItemDisplayDateMs), (String) null, (ItemAccessory) new ItemAccessory.Amount(this.amountFormatter.format(money), PaymentHistoryData.AmountTreatment.STANDARD), (StackedAvatarViewModel) avatar(orderActivityItem), (AvatarBadgeViewModel) null, false, this.presentationContext, (Icons) null, (ReactionsState) null, "", 5632);
    }

    public final ActivityItemViewModel createOverdueOrderItemViewModel() {
        Object obj;
        OrderActivityItem orderActivityItem = this.activityItem;
        OrderActivityData orderActivityData = (OrderActivityData) orderActivityItem;
        CashAppPayOrderRenderData cashAppPayOrderRenderData = orderActivityData.orderRenderData;
        List list = cashAppPayOrderRenderData.payment_schedules;
        CashAppPayOrderRenderData.OrderAggregations orderAggregations = cashAppPayOrderRenderData.order_aggregations;
        orderAggregations.getClass();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((CashAppPayPaymentScheduleRenderData) obj).payment_schedule_id, orderAggregations.oldest_overdue_payment_schedule_id)) {
                break;
            }
        }
        CashAppPayPaymentScheduleRenderData cashAppPayPaymentScheduleRenderData = (CashAppPayPaymentScheduleRenderData) obj;
        if (cashAppPayPaymentScheduleRenderData == null) {
            a$$ExternalSyntheticBUOutline0.m$1("Overdue order must have an overdue payment");
            return null;
        }
        AndroidStringManager androidStringManager = this.stringManager;
        String str = androidStringManager.get(R.string.activity_orders_overdue);
        Long l = cashAppPayPaymentScheduleRenderData.schedule_due_at;
        l.getClass();
        String formatDateMillisDisplayLabel = formatDateMillisDisplayLabel(l.longValue());
        CashAppPayOrderRenderData.OrderAggregations.MoneyAggregations moneyAggregations = orderAggregations.money_aggregations;
        moneyAggregations.getClass();
        Money money = moneyAggregations.total_loan_overdue_money;
        money.getClass();
        return new ActivityItemViewModel(orderActivityData.rowId, merchantTitle(orderActivityItem), str, createDotFormattedLabel(formatDateMillisDisplayLabel, this.amountFormatter.format(money)), (ItemAccessory) new ItemAccessory.Button(androidStringManager.get(R.string.activity_orders_action_pay), null, PaymentHistoryData.InlineButtonProminence.PROMINENT, null), (StackedAvatarViewModel) avatar(orderActivityItem), (AvatarBadgeViewModel) null, false, this.presentationContext, (Icons) null, (ReactionsState) null, "", 5632);
    }

    public final ActivityItemViewModel createRefundedOrderItemViewModel() {
        OrderActivityItem orderActivityItem = this.activityItem;
        OrderActivityData orderActivityData = (OrderActivityData) orderActivityItem;
        Money money = orderActivityData.orderRenderData.order_total_money;
        money.getClass();
        String createDotFormattedLabel = createDotFormattedLabel(formatDateMillisDisplayLabel(orderActivityData.activityItemDisplayDateMs), this.stringManager.get(R.string.activity_orders_refunded));
        return new ActivityItemViewModel(orderActivityData.rowId, merchantTitle(orderActivityItem), createDotFormattedLabel, (String) null, (ItemAccessory) new ItemAccessory.Amount(this.amountFormatter.format(money), PaymentHistoryData.AmountTreatment.STRIKETHROUGH), (StackedAvatarViewModel) avatar(orderActivityItem), (AvatarBadgeViewModel) null, false, this.presentationContext, (Icons) null, (ReactionsState) null, "", 5632);
    }

    public final String formatDateMillisDisplayLabel(long j) {
        Instant ofEpochMilli = Instant.ofEpochMilli(j);
        ofEpochMilli.getClass();
        return this.todayDateTimeFormatter.formatDate(ofEpochMilli, new TodayDateTimeFormatter$FormatOptions(27, null, null, null, false, false));
    }

    public final String merchantTitle(OrderActivityItem orderActivityItem) {
        String str;
        UiCustomer uiCustomer = ((OrderActivityData) orderActivityItem).orderDisplayUiCustomer;
        if (uiCustomer != null && (str = uiCustomer.full_name) != null) {
            return str;
        }
        CashAppPayMerchantRenderData cashAppPayMerchantRenderData = ((OrderActivityData) orderActivityItem).orderRenderData.merchant;
        String str2 = cashAppPayMerchantRenderData != null ? cashAppPayMerchantRenderData.display_name : null;
        return str2 == null ? this.stringManager.get(R.string.activity_orders_primary_label_error) : str2;
    }

    @Override // com.squareup.cash.activity.presenters.ActivityItemPresenter
    public final UiCallbackModel models(Composer composer) {
        ActivityItemViewModel activityItemViewModel;
        ActivityItemViewModel activityItemViewModel2;
        OrderActivityItem orderActivityItem = this.activityItem;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1878201847);
        try {
            switch (WhenMappings.$EnumSwitchMapping$0[((OrderActivityData) orderActivityItem).orderRowState.ordinal()]) {
                case 1:
                    activityItemViewModel = createActiveOrderItemViewModel();
                    break;
                case 2:
                    activityItemViewModel = createCompletedOrderItemViewModel();
                    break;
                case 3:
                    activityItemViewModel = createOverdueOrderItemViewModel();
                    break;
                case 4:
                    activityItemViewModel = createRefundedOrderItemViewModel();
                    break;
                case 5:
                    activityItemViewModel = createCanceledOrderItemViewModel();
                    break;
                case 6:
                    throw new IllegalStateException("Order Activity Row State unknown");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e) {
            this.errorReporter.report(new OrderActivityDataFormattingError(e, orderActivityItem instanceof OrderActivityData ? (OrderActivityData) orderActivityItem : null), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
            activityItemViewModel = null;
        }
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
        if (activityItemViewModel == null) {
            String str = ((OrderActivityData) orderActivityItem).rowId;
            AndroidStringManager androidStringManager = this.stringManager;
            activityItemViewModel2 = new ActivityItemViewModel(str, androidStringManager.get(R.string.activity_orders_primary_label_error), androidStringManager.get(R.string.activity_orders_secondary_label_error), (String) null, (ItemAccessory) new ItemAccessory.Amount("", PaymentHistoryData.AmountTreatment.STANDARD), (StackedAvatarViewModel) new StackedAvatarViewModel.Single(new StackedAvatarViewModel.Avatar(null, null, null, null, null, null, null, null, false, false, null, false, null, null, 131071)), (AvatarBadgeViewModel) null, false, this.presentationContext, (Icons) null, (ReactionsState) null, "", 5632);
        } else {
            activityItemViewModel2 = activityItemViewModel;
        }
        boolean changedInstance = gapComposer.changedInstance(activityItemViewModel) | gapComposer.changedInstance(coroutineScope) | gapComposer.changed(this);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new UtilsKt$$ExternalSyntheticLambda0(19, activityItemViewModel, coroutineScope, this);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        UiCallbackModel uiCallbackModel = new UiCallbackModel((Function1) rememberedValue2, activityItemViewModel2);
        gapComposer.end(false);
        return uiCallbackModel;
    }
}

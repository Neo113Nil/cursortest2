package com.squareup.cash.activity.presenters;

import androidx.biometric.CryptoObjectUtils;
import com.google.mlkit.vision.text.internal.zzr;
import com.squareup.cash.activity.analytics.ActivityAnalyticsService;
import com.squareup.cash.activity.analytics.ActivityCdfMappingsKt;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.backend.ActivityItemKt;
import com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem;
import com.squareup.cash.activity.backend.PaymentHistoryActivityItem;
import com.squareup.cash.activity.backend.RealActivityAnalyticsService;
import com.squareup.cash.activity.presenters.ActivityItemCallbackEvent;
import com.squareup.cash.activity.viewmodels.ActivityItemPresentationContext;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.cdf.ActivityItemOrigin;
import com.squareup.cash.cdf.PaymentOrientation;
import com.squareup.cash.cdf.PaymentRole;
import com.squareup.cash.cdf.RetroEligibilityStatus;
import com.squareup.cash.cdf.TransactionType;
import com.squareup.cash.cdf.activityhistory.ActivityHistoryViewItem;
import com.squareup.cash.cdf.activityrecord.ActivityRecordViewComplete;
import com.squareup.cash.cdf.activityrecord.ActivityRecordViewOpen;
import com.squareup.cash.cdf.activityrecord.ActivityRecordViewOpenLink;
import com.squareup.cash.cdf.activityrecord.LinkType;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.protos.cash.activity.api.v1.ActivityItemType;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.ui.PaymentHistoryButton;
import com.squareup.protos.franklin.ui.PaymentState;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class ActivityTabItemEventDecorator$decorate$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ActivityItem $activityItem;
    public final /* synthetic */ ActivityItemViewModel $viewModel;
    public /* synthetic */ Object L$0;
    public final /* synthetic */ zzr this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityTabItemEventDecorator$decorate$1(ActivityItem activityItem, ActivityItemViewModel activityItemViewModel, zzr zzrVar, Continuation continuation) {
        super(2, continuation);
        this.$activityItem = activityItem;
        this.$viewModel = activityItemViewModel;
        this.this$0 = zzrVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ActivityTabItemEventDecorator$decorate$1 activityTabItemEventDecorator$decorate$1 = new ActivityTabItemEventDecorator$decorate$1(this.$activityItem, this.$viewModel, this.this$0, continuation);
        activityTabItemEventDecorator$decorate$1.L$0 = obj;
        return activityTabItemEventDecorator$decorate$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ActivityTabItemEventDecorator$decorate$1) create((ActivityItemCallbackEvent) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TransactionType transactionType;
        LinkType linkType;
        LinkType linkType2;
        TransactionType transactionType2;
        Long l;
        String str;
        RetroEligibilityStatus retroEligibilityStatus;
        RetroEligibilityStatus retroEligibilityStatus2;
        List split$default;
        ActivityItemViewModel activityItemViewModel = this.$viewModel;
        boolean z = activityItemViewModel.isBadged;
        ActivityAnalyticsService activityAnalyticsService = (ActivityAnalyticsService) this.this$0.zza;
        ActivityItemCallbackEvent activityItemCallbackEvent = (ActivityItemCallbackEvent) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        if (!(activityItemCallbackEvent instanceof ActivityItemCallbackEvent.AnalyticsEvent)) {
            return Unit.INSTANCE;
        }
        ActivityItem activityItem = this.$activityItem;
        if (!(activityItem instanceof FormattedPaymentHistoryActivityItem)) {
            return Unit.INSTANCE;
        }
        ActivityItemPresentationContext activityItemPresentationContext = activityItemViewModel.presentationContext;
        switch (((ActivityItemCallbackEvent.AnalyticsEvent) activityItemCallbackEvent).ordinal()) {
            case 0:
                ((RealActivityAnalyticsService) activityAnalyticsService).trackItemTap((PaymentHistoryActivityItem) activityItem, activityItemPresentationContext.origin, activityItemPresentationContext.rowIndex, ActivityAnalyticsService.TapElement.AVATAR);
                break;
            case 1:
                ((RealActivityAnalyticsService) activityAnalyticsService).trackItemTap((PaymentHistoryActivityItem) activityItem, activityItemPresentationContext.origin, activityItemPresentationContext.rowIndex, ActivityAnalyticsService.TapElement.ACTION_BUTTON);
                break;
            case 2:
                ((RealActivityAnalyticsService) activityAnalyticsService).trackItemTap((PaymentHistoryActivityItem) activityItem, activityItemPresentationContext.origin, activityItemPresentationContext.rowIndex, ActivityAnalyticsService.TapElement.ROW);
                break;
            case 3:
                PaymentHistoryActivityItem paymentHistoryActivityItem = (PaymentHistoryActivityItem) activityItem;
                ActivityItemOrigin activityItemOrigin = activityItemPresentationContext.origin;
                RealActivityAnalyticsService realActivityAnalyticsService = (RealActivityAnalyticsService) activityAnalyticsService;
                Analytics analytics = realActivityAnalyticsService.analyticsService;
                String itemId = ActivityItemKt.getItemId(paymentHistoryActivityItem);
                boolean isPending = CryptoObjectUtils.isPending(paymentHistoryActivityItem);
                PaymentState state = paymentHistoryActivityItem.getState();
                com.squareup.cash.cdf.PaymentState cdfPaymentState = state != null ? ActivityCdfMappingsKt.toCdfPaymentState(state) : null;
                Orientation orientation = paymentHistoryActivityItem.getUiPayment().orientation;
                PaymentOrientation cdfPaymentOrientation = orientation != null ? ActivityCdfMappingsKt.toCdfPaymentOrientation(orientation) : null;
                Role role = paymentHistoryActivityItem.getUiPayment().role;
                PaymentRole cdfPaymentRole = role != null ? ActivityCdfMappingsKt.toCdfPaymentRole(role) : null;
                String activityFlowToken = realActivityAnalyticsService.getActivityFlowToken();
                String str2 = realActivityAnalyticsService.searchFlowToken;
                String str3 = realActivityAnalyticsService.queryToken;
                ActivityItemType itemType = ActivityItemKt.getItemType(paymentHistoryActivityItem);
                analytics.track(new ActivityRecordViewOpen(itemId, Boolean.valueOf(z), Boolean.valueOf(isPending), activityItemOrigin, cdfPaymentRole, cdfPaymentOrientation, cdfPaymentState, activityFlowToken, str2, str3, CryptoObjectUtils.getUiCounterparty(paymentHistoryActivityItem).id, itemType != null ? itemType.toString() : null, CollectionsKt.joinToString$default(CollectionsKt.sorted(paymentHistoryActivityItem.getProductClassifiers()), ",", null, null, 0, null, null, 62), 245888), null);
                break;
            case 4:
                PaymentHistoryButton paymentHistoryButton = ((FormattedPaymentHistoryActivityItem) activityItem).getPaymentHistoryData().inline_button;
                if (paymentHistoryButton != null) {
                    PaymentHistoryActivityItem paymentHistoryActivityItem2 = (PaymentHistoryActivityItem) activityItem;
                    String str4 = paymentHistoryButton.text;
                    PaymentHistoryButton.UrlType urlType = paymentHistoryButton.url_type;
                    RealActivityAnalyticsService realActivityAnalyticsService2 = (RealActivityAnalyticsService) activityAnalyticsService;
                    Analytics analytics2 = realActivityAnalyticsService2.analyticsService;
                    com.squareup.protos.franklin.ui.TransactionType transactionType3 = paymentHistoryActivityItem2.getTransactionType();
                    if (transactionType3 != null) {
                        int i = ActivityCdfMappingsKt.WhenMappings.$EnumSwitchMapping$3[transactionType3.ordinal()];
                        if (i == 1) {
                            transactionType2 = TransactionType.SAVINGS_INTEREST;
                        } else if (i == 2) {
                            transactionType2 = TransactionType.SAVINGS_INTEREST_ESTIMATED;
                        } else if (i == 3) {
                            transactionType2 = TransactionType.CASH_IN;
                        } else {
                            if (i != 4) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            transactionType2 = TransactionType.CASH_OUT;
                        }
                        transactionType = transactionType2;
                    } else {
                        transactionType = null;
                    }
                    if (urlType != null) {
                        int i2 = ActivityCdfMappingsKt.WhenMappings.$EnumSwitchMapping$4[urlType.ordinal()];
                        if (i2 == 1) {
                            linkType2 = LinkType.BLOCK_EXPLORER;
                        } else {
                            if (i2 != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            linkType2 = LinkType.RECEIPT_UPSELL;
                        }
                        linkType = linkType2;
                    } else {
                        linkType = null;
                    }
                    String activityFlowToken2 = realActivityAnalyticsService2.getActivityFlowToken();
                    String str5 = realActivityAnalyticsService2.searchFlowToken;
                    String str6 = realActivityAnalyticsService2.queryToken;
                    String str7 = paymentHistoryActivityItem2.getUiPayment().token;
                    if (str7 == null) {
                        str7 = "";
                    }
                    String str8 = str7;
                    ActivityItemType itemType2 = ActivityItemKt.getItemType(paymentHistoryActivityItem2);
                    analytics2.track(new ActivityRecordViewOpenLink(transactionType, linkType, str4, activityFlowToken2, str5, str6, str8, itemType2 != null ? itemType2.toString() : null, CryptoObjectUtils.getUiCounterparty(paymentHistoryActivityItem2).id, Boolean.valueOf(CryptoObjectUtils.isPending(paymentHistoryActivityItem2))), null);
                    break;
                } else {
                    return Unit.INSTANCE;
                }
            case 5:
                FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem = (FormattedPaymentHistoryActivityItem) activityItem;
                int i3 = activityItemPresentationContext.rowIndex;
                ActivityItemOrigin activityItemOrigin2 = activityItemPresentationContext.origin;
                RealActivityAnalyticsService realActivityAnalyticsService3 = (RealActivityAnalyticsService) activityAnalyticsService;
                activityItemOrigin2.getClass();
                Analytics analytics3 = realActivityAnalyticsService3.analyticsService;
                String itemId2 = ActivityItemKt.getItemId(formattedPaymentHistoryActivityItem);
                boolean isPending2 = CryptoObjectUtils.isPending(formattedPaymentHistoryActivityItem);
                PaymentState state2 = formattedPaymentHistoryActivityItem.getState();
                com.squareup.cash.cdf.PaymentState cdfPaymentState2 = state2 != null ? ActivityCdfMappingsKt.toCdfPaymentState(state2) : null;
                Orientation orientation2 = formattedPaymentHistoryActivityItem.getUiPayment().orientation;
                PaymentOrientation cdfPaymentOrientation2 = orientation2 != null ? ActivityCdfMappingsKt.toCdfPaymentOrientation(orientation2) : null;
                Role role2 = formattedPaymentHistoryActivityItem.getUiPayment().role;
                PaymentRole cdfPaymentRole2 = role2 != null ? ActivityCdfMappingsKt.toCdfPaymentRole(role2) : null;
                String activityFlowToken3 = realActivityAnalyticsService3.getActivityFlowToken();
                String str9 = realActivityAnalyticsService3.searchFlowToken;
                String str10 = realActivityAnalyticsService3.queryToken;
                ActivityItemType itemType3 = ActivityItemKt.getItemType(formattedPaymentHistoryActivityItem);
                if (itemType3 != null) {
                    l = null;
                    str = itemType3.toString();
                } else {
                    l = null;
                    str = null;
                }
                String str11 = CryptoObjectUtils.getUiCounterparty(formattedPaymentHistoryActivityItem).id;
                com.squareup.protos.franklin.ui.RetroEligibilityStatus retroEligibilityStatus3 = formattedPaymentHistoryActivityItem.getPaymentHistoryData().retro_eligibility_status;
                if (retroEligibilityStatus3 != null) {
                    int i4 = ActivityCdfMappingsKt.WhenMappings.$EnumSwitchMapping$5[retroEligibilityStatus3.ordinal()];
                    if (i4 == 1) {
                        retroEligibilityStatus2 = RetroEligibilityStatus.ELIGIBLE;
                    } else if (i4 == 2) {
                        retroEligibilityStatus2 = RetroEligibilityStatus.INELIGIBLE;
                    } else {
                        if (i4 != 3) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return l;
                        }
                        retroEligibilityStatus2 = RetroEligibilityStatus.CONVERTED;
                    }
                    retroEligibilityStatus = retroEligibilityStatus2;
                } else {
                    retroEligibilityStatus = l;
                }
                analytics3.track(new ActivityHistoryViewItem(itemId2, Boolean.valueOf(isPending2), Boolean.valueOf(z), cdfPaymentRole2, cdfPaymentOrientation2, cdfPaymentState2, activityItemOrigin2, activityFlowToken3, str9, str10, str, str11, Integer.valueOf(i3), retroEligibilityStatus, CollectionsKt.joinToString$default(CollectionsKt.sorted(formattedPaymentHistoryActivityItem.getProductClassifiers()), ",", null, null, 0, null, null, 62)), l);
                break;
            case 6:
                PaymentHistoryActivityItem paymentHistoryActivityItem3 = (PaymentHistoryActivityItem) activityItem;
                RealActivityAnalyticsService realActivityAnalyticsService4 = (RealActivityAnalyticsService) activityAnalyticsService;
                split$default = StringsKt__StringsKt.split$default(ActivityItemKt.getItemId(paymentHistoryActivityItem3), new String[]{"_"}, false, 0, 6, null);
                String str12 = split$default.size() > 1 ? (String) CollectionsKt.first(split$default) : null;
                Analytics analytics4 = realActivityAnalyticsService4.analyticsService;
                String itemId3 = ActivityItemKt.getItemId(paymentHistoryActivityItem3);
                Boolean valueOf = Boolean.valueOf(paymentHistoryActivityItem3.isBadged());
                Boolean valueOf2 = Boolean.valueOf(CryptoObjectUtils.isPending(paymentHistoryActivityItem3));
                Role role3 = paymentHistoryActivityItem3.getUiPayment().role;
                PaymentRole cdfPaymentRole3 = role3 != null ? ActivityCdfMappingsKt.toCdfPaymentRole(role3) : null;
                String activityFlowToken4 = realActivityAnalyticsService4.getActivityFlowToken();
                String str13 = realActivityAnalyticsService4.searchFlowToken;
                String str14 = realActivityAnalyticsService4.queryToken;
                ActivityItemType itemType4 = ActivityItemKt.getItemType(paymentHistoryActivityItem3);
                analytics4.track(new ActivityRecordViewComplete(itemId3, str12, valueOf, valueOf2, cdfPaymentRole3, activityFlowToken4, str13, str14, itemType4 != null ? itemType4.toString() : null, CryptoObjectUtils.getUiCounterparty(paymentHistoryActivityItem3).id), null);
                break;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
        return Unit.INSTANCE;
    }
}

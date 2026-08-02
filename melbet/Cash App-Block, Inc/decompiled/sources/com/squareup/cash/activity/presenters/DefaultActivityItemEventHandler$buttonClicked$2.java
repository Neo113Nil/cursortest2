package com.squareup.cash.activity.presenters;

import androidx.biometric.CryptoObjectUtils;
import androidx.compose.ui.text.android.LayoutCompat_androidKt;
import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzms;
import com.squareup.cash.activity.backend.ActivityItemKt;
import com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem;
import com.squareup.cash.activity.presenters.ActivityItemCallbackEvent;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.payments.backend.api.PaymentAction;
import com.squareup.cash.payments.backend.api.PaymentManager;
import com.squareup.cash.payments.backend.real.RealPaymentManager;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import com.squareup.protos.franklin.ui.PaymentHistoryButton;
import com.squareup.protos.franklin.ui.PaymentHistoryData;
import com.squareup.util.coroutines.StateFlowKt;
import java.util.Collections;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class DefaultActivityItemEventHandler$buttonClicked$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ FormattedPaymentHistoryActivityItem $activityItem;
    public final /* synthetic */ PaymentHistoryButton $button;
    public final /* synthetic */ ProducerScope $callback;
    public final /* synthetic */ ActivityItemViewModel $viewModel;
    public int I$0;
    public DefaultActivityItemEventHandler L$0;
    public String L$1;
    public int label;
    public final /* synthetic */ DefaultActivityItemEventHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultActivityItemEventHandler$buttonClicked$2(DefaultActivityItemEventHandler defaultActivityItemEventHandler, FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem, PaymentHistoryButton paymentHistoryButton, ActivityItemViewModel activityItemViewModel, ProducerScope producerScope, Continuation continuation) {
        super(2, continuation);
        this.this$0 = defaultActivityItemEventHandler;
        this.$activityItem = formattedPaymentHistoryActivityItem;
        this.$button = paymentHistoryButton;
        this.$viewModel = activityItemViewModel;
        this.$callback = producerScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DefaultActivityItemEventHandler$buttonClicked$2(this.this$0, this.$activityItem, this.$button, this.$viewModel, this.$callback, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultActivityItemEventHandler$buttonClicked$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0202, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.collect(r5, r18) != r1) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String generateToken;
        DefaultActivityItemEventHandler defaultActivityItemEventHandler;
        int i;
        String str;
        DefaultActivityItemEventHandler defaultActivityItemEventHandler2;
        int i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            SafeTrace.throwOnFailure(obj);
            BlockersData.Flow.INSTANCE.getClass();
            generateToken = BlockersData.Flow.Companion.generateToken();
            defaultActivityItemEventHandler = this.this$0;
            PaymentManager paymentManager = defaultActivityItemEventHandler.paymentManager;
            FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem = this.$activityItem;
            String removePrefix = StringsKt.removePrefix("P_", ActivityItemKt.getItemId(formattedPaymentHistoryActivityItem));
            String str2 = formattedPaymentHistoryActivityItem.getUiPayment().token;
            ScenarioPlan scenarioPlan = formattedPaymentHistoryActivityItem.getPaymentHistoryData().scenario_plan;
            String theirId = CryptoObjectUtils.getTheirId(formattedPaymentHistoryActivityItem);
            Money money = formattedPaymentHistoryActivityItem.getUiPayment().amount;
            if (money == null) {
                money = new Money((Long) null, (CurrencyCode) null, 7);
            }
            String str3 = formattedPaymentHistoryActivityItem.getPaymentHistoryData().confirm_cancellation_text;
            PaymentHistoryData paymentHistoryData = formattedPaymentHistoryActivityItem.getPaymentHistoryData();
            Screen screen = this.$viewModel.presentationContext.screen;
            RealPaymentManager realPaymentManager = (RealPaymentManager) paymentManager;
            generateToken.getClass();
            PaymentHistoryButton paymentHistoryButton = this.$button;
            PaymentHistoryButton.ButtonAction buttonAction = paymentHistoryButton.action;
            buttonAction.getClass();
            MapsKt__MapsKt.mutableMapOf(new Pair("payment_id", removePrefix), new Pair("action", buttonAction.name()));
            PaymentHistoryButton.ButtonAction buttonAction2 = paymentHistoryButton.action;
            buttonAction2.getClass();
            switch (RealPaymentManager.WhenMappings.$EnumSwitchMapping$0[buttonAction2.ordinal()]) {
                case 1:
                    realPaymentManager.confirm(generateToken, removePrefix);
                    if (!CollectionsKt.contains(DefaultActivityItemEventHandler.ActionsForCompletion, paymentHistoryButton.action)) {
                        i = 0;
                        FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 = new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(defaultActivityItemEventHandler.paymentActionCompletionDispatcher.completedPaymentActions, new zzms(generateToken, null, 1), 0);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.I$0 = i;
                        this.label = 2;
                        break;
                    } else {
                        ActivityItemCallbackEvent.AnalyticsEvent analyticsEvent = ActivityItemCallbackEvent.AnalyticsEvent.ItemComplete;
                        this.L$0 = defaultActivityItemEventHandler;
                        this.L$1 = generateToken;
                        this.I$0 = 0;
                        this.label = 1;
                        if (((ProducerCoroutine) this.$callback)._channel.send(analyticsEvent, this) != coroutineSingletons) {
                            str = generateToken;
                            defaultActivityItemEventHandler2 = defaultActivityItemEventHandler;
                            i2 = 0;
                            break;
                        }
                        return coroutineSingletons;
                    }
                case 2:
                    LayoutCompat_androidKt.access$toListOfCustomers();
                    realPaymentManager.cancel$real(generateToken, removePrefix, money, Collections.EMPTY_LIST);
                    if (!CollectionsKt.contains(DefaultActivityItemEventHandler.ActionsForCompletion, paymentHistoryButton.action)) {
                    }
                    break;
                case 3:
                    realPaymentManager.passcode$real(generateToken, removePrefix);
                    if (!CollectionsKt.contains(DefaultActivityItemEventHandler.ActionsForCompletion, paymentHistoryButton.action)) {
                    }
                    break;
                case 4:
                    realPaymentManager.linkCard$real(generateToken, removePrefix);
                    if (!CollectionsKt.contains(DefaultActivityItemEventHandler.ActionsForCompletion, paymentHistoryButton.action)) {
                    }
                    break;
                case 5:
                    PaymentHistoryButton.Dialog dialog = paymentHistoryButton.dialog;
                    dialog.getClass();
                    StateFlowKt.emitOrThrow(realPaymentManager.paymentActions, new PaymentAction.OpenDialogAction(generateToken, removePrefix, dialog));
                    if (!CollectionsKt.contains(DefaultActivityItemEventHandler.ActionsForCompletion, paymentHistoryButton.action)) {
                    }
                    break;
                case 6:
                    String str4 = paymentHistoryButton.url;
                    str4.getClass();
                    realPaymentManager.openUrl$real(generateToken, removePrefix, str4, screen);
                    if (!CollectionsKt.contains(DefaultActivityItemEventHandler.ActionsForCompletion, paymentHistoryButton.action)) {
                    }
                    break;
                case 7:
                    if (screen == null) {
                        a$$ExternalSyntheticBUOutline0.m$3("exitScreen expected");
                        return null;
                    }
                    realPaymentManager.reportProblem$real(generateToken, removePrefix, paymentHistoryData, screen);
                    if (!CollectionsKt.contains(DefaultActivityItemEventHandler.ActionsForCompletion, paymentHistoryButton.action)) {
                    }
                    break;
                case 8:
                    String str5 = paymentHistoryButton.tel_number;
                    str5.getClass();
                    realPaymentManager.callNumber$real(generateToken, removePrefix, str5);
                    if (!CollectionsKt.contains(DefaultActivityItemEventHandler.ActionsForCompletion, paymentHistoryButton.action)) {
                    }
                    break;
                case 9:
                    realPaymentManager.completeScenarioPlan(generateToken, removePrefix, scenarioPlan, null);
                    if (!CollectionsKt.contains(DefaultActivityItemEventHandler.ActionsForCompletion, paymentHistoryButton.action)) {
                    }
                    break;
                case 10:
                    realPaymentManager.completeScenarioPlan(generateToken, removePrefix, scenarioPlan, null);
                    if (!CollectionsKt.contains(DefaultActivityItemEventHandler.ActionsForCompletion, paymentHistoryButton.action)) {
                    }
                    break;
                case 11:
                    realPaymentManager.refund$real(generateToken, removePrefix);
                    if (!CollectionsKt.contains(DefaultActivityItemEventHandler.ActionsForCompletion, paymentHistoryButton.action)) {
                    }
                    break;
                case 12:
                    realPaymentManager.reportAbuse(generateToken, removePrefix, theirId, paymentHistoryButton.url, paymentHistoryButton.dialog);
                    if (!CollectionsKt.contains(DefaultActivityItemEventHandler.ActionsForCompletion, paymentHistoryButton.action)) {
                    }
                    break;
                case 13:
                    realPaymentManager.unreportAbuse(generateToken, removePrefix, theirId, paymentHistoryButton.url, paymentHistoryButton.dialog);
                    if (!CollectionsKt.contains(DefaultActivityItemEventHandler.ActionsForCompletion, paymentHistoryButton.action)) {
                    }
                    break;
                case 14:
                    realPaymentManager.completeClientScenario$real(paymentHistoryButton.client_scenario, generateToken, removePrefix);
                    if (!CollectionsKt.contains(DefaultActivityItemEventHandler.ActionsForCompletion, paymentHistoryButton.action)) {
                    }
                    break;
                case 15:
                    Timber.Forest.e(new AssertionError("Unexpected button action: $button.action"));
                    if (!CollectionsKt.contains(DefaultActivityItemEventHandler.ActionsForCompletion, paymentHistoryButton.action)) {
                    }
                    break;
                case 16:
                    Timber.Forest.e(new AssertionError("Unexpected button action: $button.action"));
                    if (!CollectionsKt.contains(DefaultActivityItemEventHandler.ActionsForCompletion, paymentHistoryButton.action)) {
                    }
                    break;
                case 17:
                    LayoutCompat_androidKt.access$toListOfCustomers();
                    realPaymentManager.checkStatus$real(generateToken, removePrefix, money, Collections.EMPTY_LIST);
                    if (!CollectionsKt.contains(DefaultActivityItemEventHandler.ActionsForCompletion, paymentHistoryButton.action)) {
                    }
                    break;
                case 18:
                    if (screen == null) {
                        a$$ExternalSyntheticBUOutline0.m$3("Required an exit screen for deposit reversal");
                        return null;
                    }
                    realPaymentManager.reverseDeposit$real(screen, generateToken, removePrefix);
                    if (!CollectionsKt.contains(DefaultActivityItemEventHandler.ActionsForCompletion, paymentHistoryButton.action)) {
                    }
                    break;
                case 19:
                    a$$ExternalSyntheticBUOutline0.m$3("ButtonAction.ADD_REACTION not a supported action.");
                    return null;
                case 20:
                    str3.getClass();
                    realPaymentManager.cancelInvestmentOrder$real(generateToken, removePrefix, str3);
                    if (!CollectionsKt.contains(DefaultActivityItemEventHandler.ActionsForCompletion, paymentHistoryButton.action)) {
                    }
                    break;
                case 21:
                    str3.getClass();
                    realPaymentManager.cancelCryptoOrder$real(generateToken, removePrefix, str3);
                    if (!CollectionsKt.contains(DefaultActivityItemEventHandler.ActionsForCompletion, paymentHistoryButton.action)) {
                    }
                    break;
                case 22:
                    String str6 = paymentHistoryButton.support_flow_node;
                    if (screen == null) {
                        a$$ExternalSyntheticBUOutline0.m$3("exitScreen expected");
                        return null;
                    }
                    realPaymentManager.startSupportFlow$real(generateToken, str6, removePrefix, paymentHistoryData, screen);
                    if (!CollectionsKt.contains(DefaultActivityItemEventHandler.ActionsForCompletion, paymentHistoryButton.action)) {
                    }
                    break;
                case 23:
                    realPaymentManager.makeLoanPayment$real(money, generateToken, removePrefix, paymentHistoryButton.opaque_data);
                    if (!CollectionsKt.contains(DefaultActivityItemEventHandler.ActionsForCompletion, paymentHistoryButton.action)) {
                    }
                    break;
                case 24:
                    if (str2 != null) {
                        removePrefix = str2;
                    }
                    realPaymentManager.skipLoanPayment$real(generateToken, removePrefix);
                    if (!CollectionsKt.contains(DefaultActivityItemEventHandler.ActionsForCompletion, paymentHistoryButton.action)) {
                    }
                    break;
                case 25:
                    realPaymentManager.acceptCryptoPayment$real(generateToken, removePrefix);
                    if (!CollectionsKt.contains(DefaultActivityItemEventHandler.ActionsForCompletion, paymentHistoryButton.action)) {
                    }
                    break;
                case 26:
                    throw null;
                case 27:
                    realPaymentManager.showPaymentDetailView$real(generateToken, removePrefix, false);
                    if (!CollectionsKt.contains(DefaultActivityItemEventHandler.ActionsForCompletion, paymentHistoryButton.action)) {
                    }
                    break;
                case 28:
                    PaymentHistoryButton.ShareSheetDetails shareSheetDetails = paymentHistoryButton.share_sheet_details;
                    shareSheetDetails.getClass();
                    realPaymentManager.openShareSheet$real(generateToken, shareSheetDetails);
                    if (!CollectionsKt.contains(DefaultActivityItemEventHandler.ActionsForCompletion, paymentHistoryButton.action)) {
                    }
                    break;
                default:
                    if (!CollectionsKt.contains(DefaultActivityItemEventHandler.ActionsForCompletion, paymentHistoryButton.action)) {
                    }
                    break;
            }
        } else {
            if (i3 != 1) {
                if (i3 == 2) {
                    SafeTrace.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = this.I$0;
            str = this.L$1;
            defaultActivityItemEventHandler2 = this.L$0;
            SafeTrace.throwOnFailure(obj);
        }
        i = i2;
        defaultActivityItemEventHandler = defaultActivityItemEventHandler2;
        generateToken = str;
        FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$12 = new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(defaultActivityItemEventHandler.paymentActionCompletionDispatcher.completedPaymentActions, new zzms(generateToken, null, 1), 0);
        this.L$0 = null;
        this.L$1 = null;
        this.I$0 = i;
        this.label = 2;
    }
}

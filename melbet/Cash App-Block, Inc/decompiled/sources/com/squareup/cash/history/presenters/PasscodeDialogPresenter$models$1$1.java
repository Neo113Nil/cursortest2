package com.squareup.cash.history.presenters;

import android.content.Intent;
import androidx.compose.runtime.MutableState;
import androidx.core.text.TextUtilsCompat;
import app.cash.api.ApiResult;
import app.cash.broadway.navigation.Navigator;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.RealBrandFollowPresenter$models$2$1$1;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.passcode.presenters.EndAppLockPresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.banking.presenters.TransfersPresenter;
import com.squareup.cash.blockers.screens.InstrumentSelectionBlockerScreen;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.cashapplite.presenters.LiteActivityPresenter;
import com.squareup.cash.cdf.stock.StockTradeCancelOrderResult;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda5;
import com.squareup.cash.checks.VerifyCheckDialogPresenter;
import com.squareup.cash.core.navigationcontainer.PaymentActionResult;
import com.squareup.cash.crypto.backend.balance.CryptoBalanceRepoKt$asMoney$$inlined$map$1;
import com.squareup.cash.google.pay.payments.api.GooglePayPaymentsClient;
import com.squareup.cash.google.pay.payments.real.RealGooglePayPaymentsClient;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.history.navigation.PaymentActionHandler;
import com.squareup.cash.history.presenters.CheckStatusPresenter;
import com.squareup.cash.history.viewmodels.PasscodeDialogViewEvent;
import com.squareup.cash.initialscreenloader.backend.RealColdStartIntegrityChecker;
import com.squareup.cash.instruments.presenters.InstrumentSelectionBlockerPresenter;
import com.squareup.cash.instruments.screens.InstrumentSelectionScreen;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.intent.RealIntentHandler;
import com.squareup.cash.investing.backend.real.PersistentEntityPriceCache;
import com.squareup.cash.investing.backend.real.RealEntityPriceRefresher;
import com.squareup.cash.investing.components.InvestingHomeView$2$1;
import com.squareup.cash.investing.components.RepeatClicksOnLongPress$attachTo$2$1;
import com.squareup.cash.launcher.IntentLauncher$$ExternalSyntheticLambda0;
import com.squareup.cash.onboarding.check.IntegrityCheck;
import com.squareup.cash.payments.backend.api.PaymentAction;
import com.squareup.cash.payments.backend.api.PaymentManager;
import com.squareup.cash.payments.backend.real.RealPaymentManager;
import com.squareup.cash.profile.presenters.AddAliasPresenter;
import com.squareup.preferences.PreferenceFlow;
import com.squareup.protos.cash.investcrypto.server.CancelOrderRequest;
import com.squareup.protos.cash.investcrypto.server.CancelOrderResponse;
import com.squareup.protos.cash.investcrypto.server.TradingService;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.investing.CancelInvestmentOrderRequest;
import com.squareup.protos.franklin.investing.CancelInvestmentOrderResponse;
import com.squareup.protos.franklin.investing.InvestingService;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import okio.ByteString;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class PasscodeDialogPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $event;
    public final /* synthetic */ int $r8$classId;
    public Object $viewModel$delegate;
    public int label;
    public /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasscodeDialogPresenter$models$1$1(TransfersPresenter transfersPresenter, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 24;
        this.this$0 = transfersPresenter;
        this.$event = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$event;
        switch (i) {
            case 0:
                return new PasscodeDialogPresenter$models$1$1((TransfersPresenter) this.this$0, (PasscodeDialogViewEvent) obj2, (MutableState) this.$viewModel$delegate, continuation, 0);
            case 1:
                PasscodeDialogPresenter$models$1$1 passcodeDialogPresenter$models$1$1 = new PasscodeDialogPresenter$models$1$1((PaymentActionHandler) obj2, (PaymentAction.SendCancelCryptoOrderAction) this.$viewModel$delegate, continuation, 1);
                passcodeDialogPresenter$models$1$1.this$0 = obj;
                return passcodeDialogPresenter$models$1$1;
            case 2:
                PasscodeDialogPresenter$models$1$1 passcodeDialogPresenter$models$1$12 = new PasscodeDialogPresenter$models$1$1((PaymentActionHandler) obj2, (PaymentAction.SendCancelInvestmentOrderAction) this.$viewModel$delegate, continuation, 2);
                passcodeDialogPresenter$models$1$12.this$0 = obj;
                return passcodeDialogPresenter$models$1$12;
            case 3:
                PasscodeDialogPresenter$models$1$1 passcodeDialogPresenter$models$1$13 = new PasscodeDialogPresenter$models$1$1((PaymentActionHandler) obj2, (PaymentAction) this.$viewModel$delegate, continuation, 3);
                passcodeDialogPresenter$models$1$13.this$0 = obj;
                return passcodeDialogPresenter$models$1$13;
            case 4:
                PasscodeDialogPresenter$models$1$1 passcodeDialogPresenter$models$1$14 = new PasscodeDialogPresenter$models$1$1((Flow) obj2, continuation, (CardStudioPresenter) this.$viewModel$delegate, 4);
                passcodeDialogPresenter$models$1$14.this$0 = obj;
                return passcodeDialogPresenter$models$1$14;
            case 5:
                PasscodeDialogPresenter$models$1$1 passcodeDialogPresenter$models$1$15 = new PasscodeDialogPresenter$models$1$1((Flow) obj2, continuation, (LocalEditorialPresenter) this.$viewModel$delegate, 5);
                passcodeDialogPresenter$models$1$15.this$0 = obj;
                return passcodeDialogPresenter$models$1$15;
            case 6:
                PasscodeDialogPresenter$models$1$1 passcodeDialogPresenter$models$1$16 = new PasscodeDialogPresenter$models$1$1((Flow) obj2, continuation, (CheckStatusPresenter) this.$viewModel$delegate, 6);
                passcodeDialogPresenter$models$1$16.this$0 = obj;
                return passcodeDialogPresenter$models$1$16;
            case 7:
                PasscodeDialogPresenter$models$1$1 passcodeDialogPresenter$models$1$17 = new PasscodeDialogPresenter$models$1$1((Flow) obj2, continuation, (VerifyCheckDialogPresenter) this.$viewModel$delegate, 7);
                passcodeDialogPresenter$models$1$17.this$0 = obj;
                return passcodeDialogPresenter$models$1$17;
            case 8:
                PasscodeDialogPresenter$models$1$1 passcodeDialogPresenter$models$1$18 = new PasscodeDialogPresenter$models$1$1((Flow) obj2, continuation, (LiteActivityPresenter) this.$viewModel$delegate, 8);
                passcodeDialogPresenter$models$1$18.this$0 = obj;
                return passcodeDialogPresenter$models$1$18;
            case 9:
                PasscodeDialogPresenter$models$1$1 passcodeDialogPresenter$models$1$19 = new PasscodeDialogPresenter$models$1$1((Flow) obj2, continuation, (AddAliasPresenter) this.$viewModel$delegate, 9);
                passcodeDialogPresenter$models$1$19.this$0 = obj;
                return passcodeDialogPresenter$models$1$19;
            case 10:
                PasscodeDialogPresenter$models$1$1 passcodeDialogPresenter$models$1$110 = new PasscodeDialogPresenter$models$1$1((Flow) obj2, continuation, (AddAliasPresenter) this.$viewModel$delegate, 10);
                passcodeDialogPresenter$models$1$110.this$0 = obj;
                return passcodeDialogPresenter$models$1$110;
            case 11:
                return new PasscodeDialogPresenter$models$1$1((TransfersPresenter) this.this$0, (String) obj2, (MutableState) this.$viewModel$delegate, continuation, 11);
            case 12:
                PasscodeDialogPresenter$models$1$1 passcodeDialogPresenter$models$1$111 = new PasscodeDialogPresenter$models$1$1((Flow) obj2, continuation, (PaymentReceiptDialogPresenter) this.$viewModel$delegate, 12);
                passcodeDialogPresenter$models$1$111.this$0 = obj;
                return passcodeDialogPresenter$models$1$111;
            case 13:
                PasscodeDialogPresenter$models$1$1 passcodeDialogPresenter$models$1$112 = new PasscodeDialogPresenter$models$1$1((Flow) obj2, continuation, (CardStudioPresenter) this.$viewModel$delegate, 13);
                passcodeDialogPresenter$models$1$112.this$0 = obj;
                return passcodeDialogPresenter$models$1$112;
            case 14:
                PasscodeDialogPresenter$models$1$1 passcodeDialogPresenter$models$1$113 = new PasscodeDialogPresenter$models$1$1((Flow) obj2, continuation, (LocalPosCheckInPresenter) this.$viewModel$delegate, 14);
                passcodeDialogPresenter$models$1$113.this$0 = obj;
                return passcodeDialogPresenter$models$1$113;
            case 15:
                PasscodeDialogPresenter$models$1$1 passcodeDialogPresenter$models$1$114 = new PasscodeDialogPresenter$models$1$1((Flow) obj2, continuation, this.$viewModel$delegate, 15);
                passcodeDialogPresenter$models$1$114.this$0 = obj;
                return passcodeDialogPresenter$models$1$114;
            case 16:
                PasscodeDialogPresenter$models$1$1 passcodeDialogPresenter$models$1$115 = new PasscodeDialogPresenter$models$1$1((Set) obj2, (RealColdStartIntegrityChecker) this.$viewModel$delegate, continuation, 16);
                passcodeDialogPresenter$models$1$115.this$0 = obj;
                return passcodeDialogPresenter$models$1$115;
            case 17:
                PasscodeDialogPresenter$models$1$1 passcodeDialogPresenter$models$1$116 = new PasscodeDialogPresenter$models$1$1((Flow) obj2, continuation, (LocalEditorialPresenter) this.$viewModel$delegate, 17);
                passcodeDialogPresenter$models$1$116.this$0 = obj;
                return passcodeDialogPresenter$models$1$116;
            case 18:
                PasscodeDialogPresenter$models$1$1 passcodeDialogPresenter$models$1$117 = new PasscodeDialogPresenter$models$1$1((Flow) obj2, continuation, (EndAppLockPresenter) this.$viewModel$delegate, 18);
                passcodeDialogPresenter$models$1$117.this$0 = obj;
                return passcodeDialogPresenter$models$1$117;
            case 19:
                PasscodeDialogPresenter$models$1$1 passcodeDialogPresenter$models$1$118 = new PasscodeDialogPresenter$models$1$1((Flow) obj2, continuation, (AddAliasPresenter) this.$viewModel$delegate, 19);
                passcodeDialogPresenter$models$1$118.this$0 = obj;
                return passcodeDialogPresenter$models$1$118;
            case 20:
                PasscodeDialogPresenter$models$1$1 passcodeDialogPresenter$models$1$119 = new PasscodeDialogPresenter$models$1$1((Flow) obj2, continuation, (AddAliasPresenter) this.$viewModel$delegate, 20);
                passcodeDialogPresenter$models$1$119.this$0 = obj;
                return passcodeDialogPresenter$models$1$119;
            case 21:
                return new PasscodeDialogPresenter$models$1$1((InstrumentSelectionBlockerPresenter) this.this$0, (InstrumentSelectionBlockerScreen.InstrumentAction) obj2, (MutableState) this.$viewModel$delegate, continuation, 21);
            case 22:
                return new PasscodeDialogPresenter$models$1$1((InstrumentSelectionBlockerPresenter) this.this$0, (InstrumentSelectionBlockerScreen.InstrumentOption) obj2, (MutableState) this.$viewModel$delegate, continuation, 22);
            case 23:
                PasscodeDialogPresenter$models$1$1 passcodeDialogPresenter$models$1$120 = new PasscodeDialogPresenter$models$1$1((Flow) obj2, continuation, (DisclosurePresenter) this.$viewModel$delegate, 23);
                passcodeDialogPresenter$models$1$120.this$0 = obj;
                return passcodeDialogPresenter$models$1$120;
            case 24:
                return new PasscodeDialogPresenter$models$1$1((TransfersPresenter) this.this$0, (MutableState) obj2, continuation);
            case 25:
                PasscodeDialogPresenter$models$1$1 passcodeDialogPresenter$models$1$121 = new PasscodeDialogPresenter$models$1$1((Flow) obj2, continuation, (LocalCashBalancePresenter) this.$viewModel$delegate, 25);
                passcodeDialogPresenter$models$1$121.this$0 = obj;
                return passcodeDialogPresenter$models$1$121;
            case 26:
                return new PasscodeDialogPresenter$models$1$1((RealIntentHandler) this.this$0, (Navigator) obj2, (Intent) this.$viewModel$delegate, continuation, 26);
            case 27:
                PasscodeDialogPresenter$models$1$1 passcodeDialogPresenter$models$1$122 = new PasscodeDialogPresenter$models$1$1((Flow) obj2, continuation, (LocalHomePresenter) this.$viewModel$delegate, 27);
                passcodeDialogPresenter$models$1$122.this$0 = obj;
                return passcodeDialogPresenter$models$1$122;
            case 28:
                return new PasscodeDialogPresenter$models$1$1((CryptoBalanceRepoKt$asMoney$$inlined$map$1) this.this$0, (PersistentEntityPriceCache) obj2, (GpsConfigQueries) this.$viewModel$delegate, continuation, 28);
            default:
                PasscodeDialogPresenter$models$1$1 passcodeDialogPresenter$models$1$123 = new PasscodeDialogPresenter$models$1$1((RealEntityPriceRefresher) obj2, (List) this.$viewModel$delegate, continuation, 29);
                passcodeDialogPresenter$models$1$123.this$0 = obj;
                return passcodeDialogPresenter$models$1$123;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((PasscodeDialogPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((PasscodeDialogPresenter$models$1$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((PasscodeDialogPresenter$models$1$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((PasscodeDialogPresenter$models$1$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 4:
                return ((PasscodeDialogPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 5:
                return ((PasscodeDialogPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 6:
                return ((PasscodeDialogPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 7:
                return ((PasscodeDialogPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 8:
                return ((PasscodeDialogPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 9:
                return ((PasscodeDialogPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 10:
                return ((PasscodeDialogPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 11:
                return ((PasscodeDialogPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 12:
                return ((PasscodeDialogPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 13:
                return ((PasscodeDialogPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 14:
                return ((PasscodeDialogPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 15:
                return ((PasscodeDialogPresenter$models$1$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 16:
                return ((PasscodeDialogPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 17:
                return ((PasscodeDialogPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 18:
                return ((PasscodeDialogPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 19:
                return ((PasscodeDialogPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 20:
                return ((PasscodeDialogPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 21:
                return ((PasscodeDialogPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 22:
                return ((PasscodeDialogPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 23:
                return ((PasscodeDialogPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 24:
                return ((PasscodeDialogPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 25:
                return ((PasscodeDialogPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 26:
                return ((PasscodeDialogPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 27:
                return ((PasscodeDialogPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 28:
                return ((PasscodeDialogPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((PasscodeDialogPresenter$models$1$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
    
        if (kotlin.TuplesKt.awaitClose(r2, r4, r31) == r3) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        if (r4.emit(r5, r31) == r3) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x069e, code lost:
    
        if (r6.emit(null, r31) == r7) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x0611, code lost:
    
        if (r2 == r7) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x0765, code lost:
    
        if (r2.emit(null, r31) == r5) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0705, code lost:
    
        if (r6 == r5) goto L354;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object cancelOrder;
        Object cancelInvestmentOrder;
        CancelInvestmentOrderResponse cancelInvestmentOrderResponse;
        MutableState mutableState;
        Object isReadyToPay;
        int i = this.$r8$classId;
        int i2 = 10;
        int i3 = 23;
        int i4 = 24;
        int i5 = 4;
        int i6 = 21;
        Object obj2 = this.$event;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    TransfersPresenter transfersPresenter = (TransfersPresenter) this.this$0;
                    String str = ((PasscodeDialogViewEvent.Submit) ((PasscodeDialogViewEvent) obj2)).passcode;
                    RealBrandFollowPresenter$models$2$1$1 realBrandFollowPresenter$models$2$1$1 = new RealBrandFollowPresenter$models$2$1$1(i6, (MutableState) this.$viewModel$delegate);
                    this.label = 1;
                    if (TransfersPresenter.access$verifyPasscode(transfersPresenter, str, null, realBrandFollowPresenter$models$2$1$1, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i7 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                PaymentActionHandler paymentActionHandler = (PaymentActionHandler) obj2;
                PaymentAction.SendCancelCryptoOrderAction sendCancelCryptoOrderAction = (PaymentAction.SendCancelCryptoOrderAction) this.$viewModel$delegate;
                FlowCollector flowCollector = (FlowCollector) this.this$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    TradingService tradingService = paymentActionHandler.tradingService;
                    String str2 = sendCancelCryptoOrderAction.flowToken;
                    String str3 = sendCancelCryptoOrderAction.orderToken;
                    CancelOrderRequest cancelOrderRequest = new CancelOrderRequest(new RequestContext(null, CollectionsKt__CollectionsJVMKt.listOf(str3), null, null, null, null, null, null, 8175), str3, ByteString.EMPTY);
                    this.this$0 = flowCollector;
                    this.label = 1;
                    cancelOrder = tradingService.cancelOrder(str2, cancelOrderRequest, this);
                    break;
                } else if (i8 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    cancelOrder = obj;
                } else if (i8 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                ApiResult apiResult = (ApiResult) cancelOrder;
                if (!(apiResult instanceof ApiResult.Success)) {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        Timber.Forest.e(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to cancel order (", sendCancelCryptoOrderAction.orderToken, ")"), new Object[0]);
                        ((RealPaymentManager) paymentActionHandler.paymentManager).error(sendCancelCryptoOrderAction.flowToken, TextUtilsCompat.errorMessaging(paymentActionHandler.stringManager, (ApiResult.Failure) apiResult, new Integer(R.string.custom_order_cancel_error_message)).message);
                    }
                } else {
                    ResponseContext responseContext = ((CancelOrderResponse) ((ApiResult.Success) apiResult).response).response_context;
                    if ((responseContext != null ? responseContext.dialog_message : null) != null) {
                        PaymentManager paymentManager = paymentActionHandler.paymentManager;
                        String str4 = sendCancelCryptoOrderAction.flowToken;
                        responseContext.getClass();
                        ((RealPaymentManager) paymentManager).error(str4, responseContext.dialog_message);
                    }
                }
                this.this$0 = null;
                this.label = 2;
                break;
            case 2:
                PaymentActionHandler paymentActionHandler2 = (PaymentActionHandler) obj2;
                PaymentAction.SendCancelInvestmentOrderAction sendCancelInvestmentOrderAction = (PaymentAction.SendCancelInvestmentOrderAction) this.$viewModel$delegate;
                FlowCollector flowCollector2 = (FlowCollector) this.this$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    InvestingService investingService = paymentActionHandler2.investingService;
                    String str5 = sendCancelInvestmentOrderAction.flowToken;
                    String str6 = sendCancelInvestmentOrderAction.orderToken;
                    CancelInvestmentOrderRequest cancelInvestmentOrderRequest = new CancelInvestmentOrderRequest(new RequestContext(null, CollectionsKt__CollectionsJVMKt.listOf(str6), null, null, null, null, null, null, 8175), str6, ByteString.EMPTY);
                    this.this$0 = flowCollector2;
                    this.label = 1;
                    cancelInvestmentOrder = investingService.cancelInvestmentOrder(str5, cancelInvestmentOrderRequest, this);
                    break;
                } else if (i9 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    cancelInvestmentOrder = obj;
                } else if (i9 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                ApiResult apiResult2 = (ApiResult) cancelInvestmentOrder;
                Analytics analytics = paymentActionHandler2.analytics;
                PaymentManager paymentManager2 = paymentActionHandler2.paymentManager;
                String str7 = sendCancelInvestmentOrderAction.flowToken;
                String str8 = sendCancelInvestmentOrderAction.flowToken;
                String str9 = sendCancelInvestmentOrderAction.orderToken;
                boolean z = apiResult2 instanceof ApiResult.Success;
                ApiResult.Success success = z ? (ApiResult.Success) apiResult2 : null;
                analytics.track(new StockTradeCancelOrderResult(str7, str9, Boolean.valueOf(((success == null || (cancelInvestmentOrderResponse = (CancelInvestmentOrderResponse) success.response) == null) ? null : cancelInvestmentOrderResponse.status) == CancelInvestmentOrderResponse.Status.SUCCESS)), null);
                if (!z) {
                    if (!(apiResult2 instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        Timber.Forest.e(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to cancel order (", str9, ")"), new Object[0]);
                        ((RealPaymentManager) paymentManager2).error(str8, TextUtilsCompat.errorMessaging(paymentActionHandler2.stringManager, (ApiResult.Failure) apiResult2, new Integer(R.string.custom_order_cancel_error_message)).message);
                    }
                } else {
                    ResponseContext responseContext2 = ((CancelInvestmentOrderResponse) ((ApiResult.Success) apiResult2).response).response_context;
                    if ((responseContext2 != null ? responseContext2.dialog_message : null) != null) {
                        responseContext2.getClass();
                        ((RealPaymentManager) paymentManager2).error(str8, responseContext2.dialog_message);
                    }
                }
                this.this$0 = null;
                this.label = 2;
                break;
            case 3:
                FlowCollector flowCollector3 = (FlowCollector) this.this$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PaymentActionHandler paymentActionHandler3 = (PaymentActionHandler) obj2;
                    PaymentAction.CompleteScenarioPlanAction completeScenarioPlanAction = (PaymentAction.CompleteScenarioPlanAction) ((PaymentAction) this.$viewModel$delegate);
                    paymentActionHandler3.getClass();
                    PaymentActionResult completeScenarioPlan = paymentActionHandler3.completeScenarioPlan(completeScenarioPlanAction.flowToken, completeScenarioPlanAction.paymentToken, completeScenarioPlanAction.scenarioPlan, null, null);
                    this.this$0 = null;
                    this.label = 1;
                    if (flowCollector3.emit(completeScenarioPlan, this) == coroutineSingletons4) {
                        break;
                    }
                } else if (i10 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 4:
                CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    InvestingHomeView$2$1 investingHomeView$2$1 = new InvestingHomeView$2$1(coroutineScope, (CardStudioPresenter) this.$viewModel$delegate, 7);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj2).collect(investingHomeView$2$1, this) == coroutineSingletons5) {
                        break;
                    }
                } else if (i11 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 5:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    InvestingHomeView$2$1 investingHomeView$2$12 = new InvestingHomeView$2$1(coroutineScope2, (LocalEditorialPresenter) this.$viewModel$delegate, 8);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj2).collect(investingHomeView$2$12, this) == coroutineSingletons6) {
                        break;
                    }
                } else if (i12 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 6:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601 c00601 = new AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601(29, coroutineScope3, (CheckStatusPresenter) this.$viewModel$delegate);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj2).collect(c00601, this) == coroutineSingletons7) {
                        break;
                    }
                } else if (i13 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 7:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    InvestingHomeView$2$1 investingHomeView$2$13 = new InvestingHomeView$2$1(coroutineScope4, (VerifyCheckDialogPresenter) this.$viewModel$delegate, 9);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj2).collect(investingHomeView$2$13, this) == coroutineSingletons8) {
                        break;
                    }
                } else if (i14 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 8:
                CoroutineScope coroutineScope5 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    InvestingHomeView$2$1 investingHomeView$2$14 = new InvestingHomeView$2$1(coroutineScope5, (LiteActivityPresenter) this.$viewModel$delegate, i2);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj2).collect(investingHomeView$2$14, this) == coroutineSingletons9) {
                        break;
                    }
                } else if (i15 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 9:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    InvestingHomeView$2$1 investingHomeView$2$15 = new InvestingHomeView$2$1(coroutineScope6, (AddAliasPresenter) this.$viewModel$delegate, 11);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj2).collect(investingHomeView$2$15, this) == coroutineSingletons10) {
                        break;
                    }
                } else if (i16 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 10:
                CoroutineScope coroutineScope7 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    InvestingHomeView$2$1 investingHomeView$2$16 = new InvestingHomeView$2$1(coroutineScope7, (AddAliasPresenter) this.$viewModel$delegate, 12);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj2).collect(investingHomeView$2$16, this) == coroutineSingletons11) {
                        break;
                    }
                } else if (i17 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CaptureCheckFaceKt$$ExternalSyntheticLambda5 captureCheckFaceKt$$ExternalSyntheticLambda5 = new CaptureCheckFaceKt$$ExternalSyntheticLambda5(i6, (MutableState) this.$viewModel$delegate);
                    this.label = 1;
                    if (TransfersPresenter.access$verifyPasscode((TransfersPresenter) this.this$0, null, (String) obj2, captureCheckFaceKt$$ExternalSyntheticLambda5, this) == coroutineSingletons12) {
                        break;
                    }
                } else if (i18 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 12:
                CoroutineScope coroutineScope8 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    InvestingHomeView$2$1 investingHomeView$2$17 = new InvestingHomeView$2$1(coroutineScope8, (PaymentReceiptDialogPresenter) this.$viewModel$delegate, 13);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj2).collect(investingHomeView$2$17, this) == coroutineSingletons13) {
                        break;
                    }
                } else if (i19 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 13:
                CoroutineScope coroutineScope9 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    InvestingHomeView$2$1 investingHomeView$2$18 = new InvestingHomeView$2$1(coroutineScope9, (CardStudioPresenter) this.$viewModel$delegate, 14);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj2).collect(investingHomeView$2$18, this) == coroutineSingletons14) {
                        break;
                    }
                } else if (i20 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 14:
                CoroutineScope coroutineScope10 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    InvestingHomeView$2$1 investingHomeView$2$19 = new InvestingHomeView$2$1(coroutineScope10, (LocalPosCheckInPresenter) this.$viewModel$delegate, 15);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj2).collect(investingHomeView$2$19, this) == coroutineSingletons15) {
                        break;
                    }
                } else if (i21 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 15:
                FlowCollector flowCollector4 = (FlowCollector) this.this$0;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RepeatClicksOnLongPress$attachTo$2$1 repeatClicksOnLongPress$attachTo$2$1 = new RepeatClicksOnLongPress$attachTo$2$1(i5, flowCollector4, (CheckStatusPresenter.AnonymousClass1.C00611) this.$viewModel$delegate);
                    this.this$0 = null;
                    this.label = 1;
                    if (((PreferenceFlow) obj2).collect(repeatClicksOnLongPress$attachTo$2$1, this) == coroutineSingletons16) {
                        break;
                    }
                } else if (i22 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 16:
                CoroutineScope coroutineScope11 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Set set = (Set) obj2;
                    RealColdStartIntegrityChecker realColdStartIntegrityChecker = (RealColdStartIntegrityChecker) this.$viewModel$delegate;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10));
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        arrayList.add(JobKt.launch$default(coroutineScope11, null, null, new CheckStatusPresenter.AnonymousClass1((IntegrityCheck) it.next(), realColdStartIntegrityChecker, continuation, 5), 3));
                    }
                    this.this$0 = null;
                    this.label = 1;
                    if (AwaitKt.joinAll(arrayList, this) == coroutineSingletons17) {
                        break;
                    }
                } else if (i23 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 17:
                CoroutineScope coroutineScope12 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    InvestingHomeView$2$1 investingHomeView$2$110 = new InvestingHomeView$2$1(coroutineScope12, (LocalEditorialPresenter) this.$viewModel$delegate, 17);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj2).collect(investingHomeView$2$110, this) == coroutineSingletons18) {
                        break;
                    }
                } else if (i24 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 18:
                CoroutineScope coroutineScope13 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    InvestingHomeView$2$1 investingHomeView$2$111 = new InvestingHomeView$2$1(coroutineScope13, (EndAppLockPresenter) this.$viewModel$delegate, 18);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj2).collect(investingHomeView$2$111, this) == coroutineSingletons19) {
                        break;
                    }
                } else if (i25 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 19:
                CoroutineScope coroutineScope14 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    InvestingHomeView$2$1 investingHomeView$2$112 = new InvestingHomeView$2$1(coroutineScope14, (AddAliasPresenter) this.$viewModel$delegate, 19);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj2).collect(investingHomeView$2$112, this) == coroutineSingletons20) {
                        break;
                    }
                } else if (i26 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 20:
                CoroutineScope coroutineScope15 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    InvestingHomeView$2$1 investingHomeView$2$113 = new InvestingHomeView$2$1(coroutineScope15, (AddAliasPresenter) this.$viewModel$delegate, 20);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj2).collect(investingHomeView$2$113, this) == coroutineSingletons21) {
                        break;
                    }
                } else if (i27 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 21:
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealBrandFollowPresenter$models$2$1$1 realBrandFollowPresenter$models$2$1$12 = new RealBrandFollowPresenter$models$2$1$1(i3, (MutableState) this.$viewModel$delegate);
                    this.label = 1;
                    if (InstrumentSelectionBlockerPresenter.access$submitAction((InstrumentSelectionBlockerPresenter) this.this$0, (InstrumentSelectionBlockerScreen.InstrumentAction) obj2, realBrandFollowPresenter$models$2$1$12, this) == coroutineSingletons22) {
                        break;
                    }
                } else if (i28 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 22:
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    InstrumentSelectionBlockerPresenter instrumentSelectionBlockerPresenter = (InstrumentSelectionBlockerPresenter) this.this$0;
                    InstrumentSelectionBlockerScreen.InstrumentAction instrumentAction = ((InstrumentSelectionBlockerScreen.InstrumentOption) obj2).action;
                    RealBrandFollowPresenter$models$2$1$1 realBrandFollowPresenter$models$2$1$13 = new RealBrandFollowPresenter$models$2$1$1(i4, (MutableState) this.$viewModel$delegate);
                    this.label = 1;
                    if (InstrumentSelectionBlockerPresenter.access$submitAction(instrumentSelectionBlockerPresenter, instrumentAction, realBrandFollowPresenter$models$2$1$13, this) == coroutineSingletons23) {
                        break;
                    }
                } else if (i29 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 23:
                CoroutineScope coroutineScope16 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    InvestingHomeView$2$1 investingHomeView$2$114 = new InvestingHomeView$2$1(coroutineScope16, (DisclosurePresenter) this.$viewModel$delegate, i6);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj2).collect(investingHomeView$2$114, this) == coroutineSingletons24) {
                        break;
                    }
                } else if (i30 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 24:
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    TransfersPresenter transfersPresenter2 = (TransfersPresenter) this.this$0;
                    if (((InstrumentSelectionScreen) transfersPresenter2.initialTab).includeGooglePay) {
                        mutableState = (MutableState) obj2;
                        GooglePayPaymentsClient googlePayPaymentsClient = (GooglePayPaymentsClient) transfersPresenter2.blockersHelper;
                        this.$viewModel$delegate = mutableState;
                        this.label = 1;
                        isReadyToPay = ((RealGooglePayPaymentsClient) googlePayPaymentsClient).isReadyToPay(this);
                        if (isReadyToPay == coroutineSingletons25) {
                            break;
                        }
                    }
                    break;
                } else if (i31 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    MutableState mutableState2 = (MutableState) this.$viewModel$delegate;
                    SafeTrace.throwOnFailure(obj);
                    mutableState = mutableState2;
                    isReadyToPay = obj;
                }
                Boolean bool = (Boolean) isReadyToPay;
                bool.getClass();
                mutableState.setValue(bool);
            case 25:
                CoroutineScope coroutineScope17 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    InvestingHomeView$2$1 investingHomeView$2$115 = new InvestingHomeView$2$1(coroutineScope17, (LocalCashBalancePresenter) this.$viewModel$delegate, 22);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj2).collect(investingHomeView$2$115, this) == coroutineSingletons26) {
                        break;
                    }
                } else if (i32 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 26:
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.label;
                if (i33 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Intent intent = (Intent) this.$viewModel$delegate;
                    this.label = 1;
                    Object access$handleCryptoIntent = RealIntentHandler.access$handleCryptoIntent((RealIntentHandler) this.this$0, (Navigator) obj2, intent, this);
                    if (access$handleCryptoIntent != coroutineSingletons27) {
                        break;
                    } else {
                        break;
                    }
                } else if (i33 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
            case 27:
                CoroutineScope coroutineScope18 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.label;
                if (i34 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    InvestingHomeView$2$1 investingHomeView$2$116 = new InvestingHomeView$2$1(coroutineScope18, (LocalHomePresenter) this.$viewModel$delegate, i3);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj2).collect(investingHomeView$2$116, this) == coroutineSingletons28) {
                        break;
                    }
                } else if (i34 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 28:
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.label;
                if (i35 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flowOn = FlowKt.flowOn((CryptoBalanceRepoKt$asMoney$$inlined$map$1) this.this$0, ((PersistentEntityPriceCache) obj2).ioDispatcher);
                    InvestingHomeView$2$1 investingHomeView$2$117 = new InvestingHomeView$2$1((GpsConfigQueries) this.$viewModel$delegate, i4);
                    this.label = 1;
                    if (flowOn.collect(investingHomeView$2$117, this) == coroutineSingletons29) {
                        break;
                    }
                } else if (i35 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                List list = (List) this.$viewModel$delegate;
                RealEntityPriceRefresher realEntityPriceRefresher = (RealEntityPriceRefresher) obj2;
                ProducerScope producerScope = (ProducerScope) this.this$0;
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i36 = this.label;
                if (i36 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SharedFlowImpl sharedFlowImpl = realEntityPriceRefresher.tokenOperations;
                    RealEntityPriceRefresher.TokenOperation.AddAll addAll = new RealEntityPriceRefresher.TokenOperation.AddAll(list);
                    this.this$0 = producerScope;
                    this.label = 1;
                    break;
                } else if (i36 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i36 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                IntentLauncher$$ExternalSyntheticLambda0 intentLauncher$$ExternalSyntheticLambda0 = new IntentLauncher$$ExternalSyntheticLambda0(i5, realEntityPriceRefresher, list);
                this.this$0 = null;
                this.label = 2;
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PasscodeDialogPresenter$models$1$1(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$event = obj2;
        this.$viewModel$delegate = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PasscodeDialogPresenter$models$1$1(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$event = obj;
        this.$viewModel$delegate = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PasscodeDialogPresenter$models$1$1(Flow flow, Continuation continuation, Object obj, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$event = flow;
        this.$viewModel$delegate = obj;
    }
}

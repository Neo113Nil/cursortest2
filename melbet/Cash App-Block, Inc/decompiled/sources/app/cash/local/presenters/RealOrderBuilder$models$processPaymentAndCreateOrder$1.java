package app.cash.local.presenters;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.emoji2.text.MetadataRepo;
import app.cash.broadway.navigation.Navigator;
import app.cash.local.google.pay.payments.LoadPaymentResult;
import app.cash.local.presenters.internal.LocalsKt;
import app.cash.local.primitives.Cart;
import app.cash.local.primitives.ComputedOrderSummary;
import app.cash.local.primitives.ComputedOrderSummaryKt;
import app.cash.local.primitives.LocalMoney;
import app.cash.local.screens.app.LocalExplanatoryDialog;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.protos.cash.local.client.v1.OrderWorkflow;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;
import sqip.GooglePay;
import sqip.GooglePayNonceResult;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final class RealOrderBuilder$models$processPaymentAndCreateOrder$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ State $cart$delegate;
    public final /* synthetic */ State $computedOrderSummary$delegate;
    public final /* synthetic */ State $estimatedEarnings$delegate;
    public final /* synthetic */ State $fulfillment$delegate;
    public final /* synthetic */ MutableState $loadingResponse$delegate;
    public final /* synthetic */ OrderWorkflow $orderWorkflow;
    public final /* synthetic */ MutableState $selectedPaymentMethod$delegate;
    public int label;
    public final /* synthetic */ RealOrderBuilder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealOrderBuilder$models$processPaymentAndCreateOrder$1(RealOrderBuilder realOrderBuilder, OrderWorkflow orderWorkflow, State state, State state2, MutableState mutableState, State state3, State state4, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = realOrderBuilder;
        this.$orderWorkflow = orderWorkflow;
        this.$computedOrderSummary$delegate = state;
        this.$cart$delegate = state2;
        this.$loadingResponse$delegate = mutableState;
        this.$estimatedEarnings$delegate = state3;
        this.$fulfillment$delegate = state4;
        this.$selectedPaymentMethod$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RealOrderBuilder$models$processPaymentAndCreateOrder$1(this.this$0, this.$orderWorkflow, this.$computedOrderSummary$delegate, this.$cart$delegate, this.$loadingResponse$delegate, this.$estimatedEarnings$delegate, this.$fulfillment$delegate, this.$selectedPaymentMethod$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RealOrderBuilder$models$processPaymentAndCreateOrder$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0090, code lost:
    
        if (app.cash.local.presenters.RealOrderBuilder.models$createOrder(r0, r13.$loadingResponse$delegate, r13.$cart$delegate, r13.$computedOrderSummary$delegate, r13.$estimatedEarnings$delegate, r13.$fulfillment$delegate, r13.$selectedPaymentMethod$delegate, r13.$orderWorkflow, true, r13) == r10) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0092, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0057, code lost:
    
        if (r14 == r10) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        LocalMoney localMoney;
        ComputedOrderSummary.Row grandTotalRow;
        RealOrderBuilder realOrderBuilder = this.this$0;
        Navigator navigator = realOrderBuilder.navigator;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        MutableState mutableState = this.$loadingResponse$delegate;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            ComputedOrderSummary computedOrderSummary = (ComputedOrderSummary) this.$computedOrderSummary$delegate.getValue();
            if (computedOrderSummary == null || (grandTotalRow = ComputedOrderSummaryKt.getGrandTotalRow(computedOrderSummary)) == null || (localMoney = grandTotalRow.amount) == null) {
                localMoney = ((Cart) this.$cart$delegate.getValue()).total;
            }
            MetadataRepo metadataRepo = realOrderBuilder.googlePayPaymentsClient;
            String prettyPrint$default = LocalsKt.prettyPrint$default(localMoney, false, null, 6);
            String name = localMoney.currencyCode.name();
            this.label = 1;
            obj = metadataRepo.loadPaymentData(prettyPrint$default, name, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                RealOrderBuilder.models$lambda$25(mutableState, false);
                return Unit.INSTANCE;
            }
            SafeTrace.throwOnFailure(obj);
        }
        LoadPaymentResult loadPaymentResult = (LoadPaymentResult) obj;
        if (loadPaymentResult instanceof LoadPaymentResult.Success) {
            GooglePayNonceResult execute = GooglePay.requestGooglePayNonce(((LoadPaymentResult.Success) loadPaymentResult).paymentData).execute();
            if (execute instanceof GooglePayNonceResult.Success) {
                realOrderBuilder.nonce = ((GooglePayNonceResult.Success) execute).getNonce();
                this.label = 2;
            } else {
                if (!(execute instanceof GooglePayNonceResult.Error)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                String str = "Not able to get a nonce. " + execute;
                Timber.Forest.e(str, new Object[0]);
                navigator.goTo(new LocalExplanatoryDialog(CollectionsKt__CollectionsJVMKt.listOf(str)));
                RealOrderBuilder.models$lambda$25(mutableState, false);
            }
        } else if (loadPaymentResult instanceof LoadPaymentResult.GooglePayFailure) {
            Timber.Forest.e(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(((LoadPaymentResult.GooglePayFailure) loadPaymentResult).failureReason, "Google pay failed to complete, google pay error code: "), new Object[0]);
            RealOrderBuilder.models$lambda$25(mutableState, false);
        } else if (Intrinsics.areEqual(loadPaymentResult, LoadPaymentResult.UnexpectedFailure.INSTANCE)) {
            Timber.Forest.e("Google pay failed to complete, no failure error code given", new Object[0]);
            navigator.goTo(new LocalExplanatoryDialog(CollectionsKt__CollectionsJVMKt.listOf("Google pay failed to complete, no failure error code given")));
            RealOrderBuilder.models$lambda$25(mutableState, false);
        } else {
            if (!Intrinsics.areEqual(loadPaymentResult, LoadPaymentResult.Cancelled.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            Timber.Forest.d("Google pay cancelled, no failure error code given", new Object[0]);
            navigator.goTo(new LocalExplanatoryDialog(CollectionsKt__CollectionsJVMKt.listOf("Google pay cancelled, no failure error code given")));
            RealOrderBuilder.models$lambda$25(mutableState, false);
        }
        RealOrderBuilder.models$lambda$25(mutableState, false);
        return Unit.INSTANCE;
    }
}

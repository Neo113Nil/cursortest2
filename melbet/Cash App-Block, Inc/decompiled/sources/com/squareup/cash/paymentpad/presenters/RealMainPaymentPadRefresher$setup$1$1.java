package com.squareup.cash.paymentpad.presenters;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.crypto.backend.transaction.CryptoTransactionAction$InitiateTransactionAction;
import com.squareup.cash.featureflags.RealFeatureFlagManager$values$$inlined$map$1;
import com.squareup.cash.payments.backend.api.PaymentAction;
import com.squareup.cash.payments.backend.real.RealPaymentManager;
import com.squareup.cash.pools.backend.api.PoolAction$CreatePoolAction;
import com.squareup.cash.taptopay.backend.api.TapToPayAction$InitiateTapToPayAction;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlowImpl;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealMainPaymentPadRefresher$setup$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ RealMainPaymentPadRefresher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealMainPaymentPadRefresher$setup$1$1(RealMainPaymentPadRefresher realMainPaymentPadRefresher, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = realMainPaymentPadRefresher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        RealMainPaymentPadRefresher realMainPaymentPadRefresher = this.this$0;
        switch (i) {
            case 0:
                return new RealMainPaymentPadRefresher$setup$1$1(realMainPaymentPadRefresher, continuation, 0);
            case 1:
                return new RealMainPaymentPadRefresher$setup$1$1(realMainPaymentPadRefresher, continuation, 1);
            case 2:
                return new RealMainPaymentPadRefresher$setup$1$1(realMainPaymentPadRefresher, continuation, 2);
            default:
                return new RealMainPaymentPadRefresher$setup$1$1(realMainPaymentPadRefresher, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealMainPaymentPadRefresher$setup$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        final RealMainPaymentPadRefresher realMainPaymentPadRefresher = this.this$0;
        final int i2 = 1;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 != 0) {
                    if (i3 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                SharedFlowImpl sharedFlowImpl = ((RealPaymentManager) realMainPaymentPadRefresher.paymentManager).paymentActions;
                final int i4 = 0;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.squareup.cash.paymentpad.presenters.RealMainPaymentPadRefresher$setup$1$1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        int i5 = i4;
                        RealMainPaymentPadRefresher realMainPaymentPadRefresher2 = realMainPaymentPadRefresher;
                        switch (i5) {
                            case 0:
                                RealMainPaymentPadRefresher.access$onTransactionInitiated(realMainPaymentPadRefresher2, ((PaymentAction.InitiatePaymentPendingAction) obj2).getPaymentToken());
                                break;
                            case 1:
                                RealMainPaymentPadRefresher.access$onTransactionInitiated(realMainPaymentPadRefresher2, ((CryptoTransactionAction$InitiateTransactionAction) obj2).getExternalId());
                                break;
                            case 2:
                                RealMainPaymentPadRefresher.access$onTransactionInitiated(realMainPaymentPadRefresher2, ((PoolAction$CreatePoolAction) obj2).getExternalId());
                                break;
                            default:
                                RealMainPaymentPadRefresher.access$onTransactionInitiated(realMainPaymentPadRefresher2, ((TapToPayAction$InitiateTapToPayAction) obj2).getExternalId());
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                sharedFlowImpl.collect(new RealFeatureFlagManager$values$$inlined$map$1.AnonymousClass2(flowCollector, 22), this);
                return coroutineSingletons;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 != 0) {
                    if (i5 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                SharedFlowImpl sharedFlowImpl2 = realMainPaymentPadRefresher.cryptoTransactionActionManager.transactionActions;
                FlowCollector flowCollector2 = new FlowCollector() { // from class: com.squareup.cash.paymentpad.presenters.RealMainPaymentPadRefresher$setup$1$1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        int i52 = i2;
                        RealMainPaymentPadRefresher realMainPaymentPadRefresher2 = realMainPaymentPadRefresher;
                        switch (i52) {
                            case 0:
                                RealMainPaymentPadRefresher.access$onTransactionInitiated(realMainPaymentPadRefresher2, ((PaymentAction.InitiatePaymentPendingAction) obj2).getPaymentToken());
                                break;
                            case 1:
                                RealMainPaymentPadRefresher.access$onTransactionInitiated(realMainPaymentPadRefresher2, ((CryptoTransactionAction$InitiateTransactionAction) obj2).getExternalId());
                                break;
                            case 2:
                                RealMainPaymentPadRefresher.access$onTransactionInitiated(realMainPaymentPadRefresher2, ((PoolAction$CreatePoolAction) obj2).getExternalId());
                                break;
                            default:
                                RealMainPaymentPadRefresher.access$onTransactionInitiated(realMainPaymentPadRefresher2, ((TapToPayAction$InitiateTapToPayAction) obj2).getExternalId());
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                sharedFlowImpl2.collect(new RealFeatureFlagManager$values$$inlined$map$1.AnonymousClass2(flowCollector2, 23), this);
                return coroutineSingletons2;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 != 0) {
                    if (i6 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                SharedFlowImpl sharedFlowImpl3 = realMainPaymentPadRefresher.poolActionManager.poolActions;
                final int i7 = 2;
                FlowCollector flowCollector3 = new FlowCollector() { // from class: com.squareup.cash.paymentpad.presenters.RealMainPaymentPadRefresher$setup$1$1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        int i52 = i7;
                        RealMainPaymentPadRefresher realMainPaymentPadRefresher2 = realMainPaymentPadRefresher;
                        switch (i52) {
                            case 0:
                                RealMainPaymentPadRefresher.access$onTransactionInitiated(realMainPaymentPadRefresher2, ((PaymentAction.InitiatePaymentPendingAction) obj2).getPaymentToken());
                                break;
                            case 1:
                                RealMainPaymentPadRefresher.access$onTransactionInitiated(realMainPaymentPadRefresher2, ((CryptoTransactionAction$InitiateTransactionAction) obj2).getExternalId());
                                break;
                            case 2:
                                RealMainPaymentPadRefresher.access$onTransactionInitiated(realMainPaymentPadRefresher2, ((PoolAction$CreatePoolAction) obj2).getExternalId());
                                break;
                            default:
                                RealMainPaymentPadRefresher.access$onTransactionInitiated(realMainPaymentPadRefresher2, ((TapToPayAction$InitiateTapToPayAction) obj2).getExternalId());
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                sharedFlowImpl3.collect(new RealFeatureFlagManager$values$$inlined$map$1.AnonymousClass2(flowCollector3, 24), this);
                return coroutineSingletons3;
            default:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 != 0) {
                    if (i8 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                SharedFlowImpl sharedFlowImpl4 = realMainPaymentPadRefresher.tapToPayActionManager.tapToPayActions;
                final int i9 = 3;
                FlowCollector flowCollector4 = new FlowCollector() { // from class: com.squareup.cash.paymentpad.presenters.RealMainPaymentPadRefresher$setup$1$1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        int i52 = i9;
                        RealMainPaymentPadRefresher realMainPaymentPadRefresher2 = realMainPaymentPadRefresher;
                        switch (i52) {
                            case 0:
                                RealMainPaymentPadRefresher.access$onTransactionInitiated(realMainPaymentPadRefresher2, ((PaymentAction.InitiatePaymentPendingAction) obj2).getPaymentToken());
                                break;
                            case 1:
                                RealMainPaymentPadRefresher.access$onTransactionInitiated(realMainPaymentPadRefresher2, ((CryptoTransactionAction$InitiateTransactionAction) obj2).getExternalId());
                                break;
                            case 2:
                                RealMainPaymentPadRefresher.access$onTransactionInitiated(realMainPaymentPadRefresher2, ((PoolAction$CreatePoolAction) obj2).getExternalId());
                                break;
                            default:
                                RealMainPaymentPadRefresher.access$onTransactionInitiated(realMainPaymentPadRefresher2, ((TapToPayAction$InitiateTapToPayAction) obj2).getExternalId());
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                sharedFlowImpl4.collect(new RealFeatureFlagManager$values$$inlined$map$1.AnonymousClass2(flowCollector4, 25), this);
                return coroutineSingletons4;
        }
    }
}

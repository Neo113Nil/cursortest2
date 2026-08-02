package com.squareup.cash.card.onboarding;

import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda12;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class PaymentDeviceCustomizationPresenter$models$3$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PaymentDeviceCustomizationPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PaymentDeviceCustomizationPresenter$models$3$1$1(PaymentDeviceCustomizationPresenter paymentDeviceCustomizationPresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = paymentDeviceCustomizationPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        PaymentDeviceCustomizationPresenter paymentDeviceCustomizationPresenter = this.this$0;
        switch (i) {
            case 0:
                return new PaymentDeviceCustomizationPresenter$models$3$1$1(paymentDeviceCustomizationPresenter, continuation, 0);
            case 1:
                return new PaymentDeviceCustomizationPresenter$models$3$1$1(paymentDeviceCustomizationPresenter, continuation, 1);
            default:
                return new PaymentDeviceCustomizationPresenter$models$3$1$1(paymentDeviceCustomizationPresenter, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((PaymentDeviceCustomizationPresenter$models$3$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        PaymentDeviceCustomizationPresenter paymentDeviceCustomizationPresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return paymentDeviceCustomizationPresenter.cardStudioQueries.deleteTemporaryState();
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                paymentDeviceCustomizationPresenter.cashDatabase.transactionWithWrapper(new CaptureCheckFaceKt$$ExternalSyntheticLambda12(paymentDeviceCustomizationPresenter, 1));
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return paymentDeviceCustomizationPresenter.cardStudioQueries.select$2().executeAsOneOrNull();
        }
    }
}

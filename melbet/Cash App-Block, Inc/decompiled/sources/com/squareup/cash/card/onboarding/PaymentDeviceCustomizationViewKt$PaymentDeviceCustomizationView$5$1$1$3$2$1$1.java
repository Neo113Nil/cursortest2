package com.squareup.cash.card.onboarding;

import com.squareup.cash.card.onboarding.PaymentDeviceCustomizationViewEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class PaymentDeviceCustomizationViewKt$PaymentDeviceCustomizationView$5$1$1$3$2$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Function1 $onEvent;
    public final /* synthetic */ ProductDetailsPageViewModel $pdpModel;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PaymentDeviceCustomizationViewKt$PaymentDeviceCustomizationView$5$1$1$3$2$1$1(Function1 function1, ProductDetailsPageViewModel productDetailsPageViewModel, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$onEvent = function1;
        this.$pdpModel = productDetailsPageViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        ProductDetailsPageViewModel productDetailsPageViewModel = this.$pdpModel;
        Function1 function1 = this.$onEvent;
        switch (i) {
            case 0:
                return new PaymentDeviceCustomizationViewKt$PaymentDeviceCustomizationView$5$1$1$3$2$1$1(function1, productDetailsPageViewModel, continuation, 0);
            default:
                return new PaymentDeviceCustomizationViewKt$PaymentDeviceCustomizationView$5$1$1$3$2$1$1(function1, productDetailsPageViewModel, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((PaymentDeviceCustomizationViewKt$PaymentDeviceCustomizationView$5$1$1$3$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        ProductDetailsPageViewModel productDetailsPageViewModel = this.$pdpModel;
        Function1 function1 = this.$onEvent;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(new PaymentDeviceCustomizationViewEvent.ProductDetailsPageShown(productDetailsPageViewModel.paymentDeviceId));
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(new PaymentDeviceCustomizationViewEvent.ProductDetailsPageShown(productDetailsPageViewModel.paymentDeviceId));
                break;
        }
        return Unit.INSTANCE;
    }
}

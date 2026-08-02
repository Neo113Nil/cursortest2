package com.squareup.cash.card.onboarding;

import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.card.onboarding.PaymentDeviceCustomizationViewEvent;
import com.squareup.cash.cdf.minthype.MintHypeOptInComplete;
import com.squareup.preferences.KeyValue;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class PaymentDeviceCustomizationPresenter$models$2$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ PaymentDeviceCustomizationViewEvent $event;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ PaymentDeviceCustomizationPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PaymentDeviceCustomizationPresenter$models$2$2(PaymentDeviceCustomizationPresenter paymentDeviceCustomizationPresenter, PaymentDeviceCustomizationViewEvent paymentDeviceCustomizationViewEvent, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = paymentDeviceCustomizationPresenter;
        this.$event = paymentDeviceCustomizationViewEvent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        PaymentDeviceCustomizationViewEvent paymentDeviceCustomizationViewEvent = this.$event;
        PaymentDeviceCustomizationPresenter paymentDeviceCustomizationPresenter = this.this$0;
        switch (i) {
            case 0:
                return new PaymentDeviceCustomizationPresenter$models$2$2(paymentDeviceCustomizationPresenter, paymentDeviceCustomizationViewEvent, continuation, 0);
            default:
                return new PaymentDeviceCustomizationPresenter$models$2$2(paymentDeviceCustomizationPresenter, paymentDeviceCustomizationViewEvent, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((PaymentDeviceCustomizationPresenter$models$2$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        PaymentDeviceCustomizationPresenter paymentDeviceCustomizationPresenter = this.this$0;
        PaymentDeviceCustomizationViewEvent paymentDeviceCustomizationViewEvent = this.$event;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str = ((PaymentDeviceCustomizationViewEvent.TapProductDetailsPageButton) paymentDeviceCustomizationViewEvent).paymentDeviceId;
                    this.label = 1;
                    if (PaymentDeviceCustomizationPresenter.access$submitBlocker(paymentDeviceCustomizationPresenter, str, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PaymentDeviceCustomizationViewEvent.TapProductDetailsPageButton tapProductDetailsPageButton = (PaymentDeviceCustomizationViewEvent.TapProductDetailsPageButton) paymentDeviceCustomizationViewEvent;
                    paymentDeviceCustomizationPresenter.analytics.track(new MintHypeOptInComplete(tapProductDetailsPageButton.paymentDeviceId, PlatformKt.activeAccountTokenOrNull(paymentDeviceCustomizationPresenter.sessionManager)), null);
                    PdpNotifiedPreference pdpNotifiedPreference = paymentDeviceCustomizationPresenter.pdpNotifiedPreference;
                    String str2 = tapProductDetailsPageButton.paymentDeviceId;
                    this.label = 1;
                    Object obj2 = ((KeyValue) pdpNotifiedPreference.keyValueFactory.invoke(str2)).set(Boolean.TRUE, this);
                    if (obj2 != coroutineSingletons2) {
                        obj2 = Unit.INSTANCE;
                    }
                    if (obj2 == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

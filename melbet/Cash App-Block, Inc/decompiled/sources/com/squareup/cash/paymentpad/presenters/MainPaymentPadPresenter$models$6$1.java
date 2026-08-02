package com.squareup.cash.paymentpad.presenters;

import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.taptopay.ScreenID;
import com.squareup.cash.taptopay.backend.real.RealTapToPayAnalyticsHelper;
import com.squareup.preferences.KeyValue;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class MainPaymentPadPresenter$models$6$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ MainPaymentPadPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MainPaymentPadPresenter$models$6$1(MainPaymentPadPresenter mainPaymentPadPresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = mainPaymentPadPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MainPaymentPadPresenter mainPaymentPadPresenter = this.this$0;
        switch (i) {
            case 0:
                return new MainPaymentPadPresenter$models$6$1(mainPaymentPadPresenter, continuation, 0);
            default:
                return new MainPaymentPadPresenter$models$6$1(mainPaymentPadPresenter, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((MainPaymentPadPresenter$models$6$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
    
        if (com.squareup.cash.taptopay.backend.real.RealTapToPayAnalyticsHelper.submitSelectEvent$default(r0, null, null, r6, "Start", "Icon", r11, 7) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006a, code lost:
    
        if (r12 == r1) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MainPaymentPadPresenter mainPaymentPadPresenter = this.this$0;
        switch (i) {
            case 0:
                RealTapToPayAnalyticsHelper realTapToPayAnalyticsHelper = mainPaymentPadPresenter.tapToPayAnalyticsHelper;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    String m = re$$ExternalSyntheticOutline0.m();
                    realTapToPayAnalyticsHelper.preferences.edit().putString("TAP_TO_PAY_FLOW_KEY", m).apply();
                    break;
                } else if (i2 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i2 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                ScreenID screenID = ScreenID.CashPad;
                this.label = 2;
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    KeyValue keyValue = mainPaymentPadPresenter.hypeAnimationLastShownTimestamp;
                    Long l = new Long(mainPaymentPadPresenter.clock.millis());
                    this.label = 1;
                    if (keyValue.set(l, this) == coroutineSingletons2) {
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

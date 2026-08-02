package com.squareup.cash.payments.presenters;

import com.squareup.cash.cdf.nearbypayment.NearbyPaymentNuxScreenLand;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.payments.screens.PaymentScreens;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class NearbyPermissionsPromptSheetPresenter$models$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ NearbyPermissionsPromptSheetPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NearbyPermissionsPromptSheetPresenter$models$2$1(NearbyPermissionsPromptSheetPresenter nearbyPermissionsPromptSheetPresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = nearbyPermissionsPromptSheetPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        NearbyPermissionsPromptSheetPresenter nearbyPermissionsPromptSheetPresenter = this.this$0;
        switch (i) {
            case 0:
                return new NearbyPermissionsPromptSheetPresenter$models$2$1(nearbyPermissionsPromptSheetPresenter, continuation, 0);
            default:
                return new NearbyPermissionsPromptSheetPresenter$models$2$1(nearbyPermissionsPromptSheetPresenter, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((NearbyPermissionsPromptSheetPresenter$models$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        NearbyPermissionsPromptSheetPresenter nearbyPermissionsPromptSheetPresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                nearbyPermissionsPromptSheetPresenter.navigator.goTo(new PaymentScreens.NearbyPayRequest(nearbyPermissionsPromptSheetPresenter.args.flowToken));
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Analytics analytics = nearbyPermissionsPromptSheetPresenter.analytics;
                String str = nearbyPermissionsPromptSheetPresenter.args.flowToken;
                str.getClass();
                analytics.track(new NearbyPaymentNuxScreenLand(str), null);
                break;
        }
        return Unit.INSTANCE;
    }
}

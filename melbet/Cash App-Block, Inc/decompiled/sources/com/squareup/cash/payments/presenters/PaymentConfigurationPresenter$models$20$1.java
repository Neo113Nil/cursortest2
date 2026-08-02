package com.squareup.cash.payments.presenters;

import com.squareup.cash.cdf.asset.AssetRequestViewInputNoteScreen;
import com.squareup.cash.cdf.asset.AssetRequestViewLoadingScreen;
import com.squareup.cash.cdf.asset.AssetRequestViewShareOptionsScreen;
import com.squareup.cash.cdf.asset.AssetSendViewAmountEntry;
import com.squareup.cash.cdf.asset.AssetSendViewInputNoteScreen;
import com.squareup.cash.cdf.asset.AssetSendViewLoadingScreen;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.payments.presenters.AnalyticsHelperKt;
import com.squareup.cash.payments.screens.PaymentConfigurationFlow;
import com.squareup.protos.franklin.common.Orientation;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class PaymentConfigurationPresenter$models$20$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PaymentConfigurationPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PaymentConfigurationPresenter$models$20$1(PaymentConfigurationPresenter paymentConfigurationPresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = paymentConfigurationPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        PaymentConfigurationPresenter paymentConfigurationPresenter = this.this$0;
        switch (i) {
            case 0:
                return new PaymentConfigurationPresenter$models$20$1(paymentConfigurationPresenter, continuation, 0);
            case 1:
                return new PaymentConfigurationPresenter$models$20$1(paymentConfigurationPresenter, continuation, 1);
            case 2:
                return new PaymentConfigurationPresenter$models$20$1(paymentConfigurationPresenter, continuation, 2);
            default:
                return new PaymentConfigurationPresenter$models$20$1(paymentConfigurationPresenter, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((PaymentConfigurationPresenter$models$20$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        PaymentConfigurationPresenter paymentConfigurationPresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                paymentConfigurationPresenter.analytics.track(new AssetSendViewAmountEntry(paymentConfigurationPresenter.flowToken), null);
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Analytics analytics = paymentConfigurationPresenter.analytics;
                Orientation orientation = paymentConfigurationPresenter.args.orientation;
                String uuid = paymentConfigurationPresenter.paymentToken.toString();
                uuid.getClass();
                String str = paymentConfigurationPresenter.flowToken;
                orientation.getClass();
                int i2 = AnalyticsHelperKt.WhenMappings.$EnumSwitchMapping$1[orientation.ordinal()];
                if (i2 == 1) {
                    analytics.track(new AssetSendViewInputNoteScreen(uuid, str), null);
                } else if (i2 != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    analytics.track(new AssetRequestViewInputNoteScreen(uuid, str), null);
                }
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Analytics analytics2 = paymentConfigurationPresenter.analytics;
                String uuid2 = paymentConfigurationPresenter.paymentToken.toString();
                uuid2.getClass();
                String str2 = paymentConfigurationPresenter.flowToken;
                PaymentConfigurationFlow paymentConfigurationFlow = paymentConfigurationPresenter.args.paymentConfigurationFlow;
                analytics2.track(new AssetRequestViewShareOptionsScreen(uuid2, str2, Boolean.valueOf((paymentConfigurationFlow instanceof PaymentConfigurationFlow.PayLink) && ((PaymentConfigurationFlow.PayLink) paymentConfigurationFlow).link != null)), null);
                break;
            default:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Analytics analytics3 = paymentConfigurationPresenter.analytics;
                Orientation orientation2 = paymentConfigurationPresenter.args.orientation;
                String uuid3 = paymentConfigurationPresenter.paymentToken.toString();
                uuid3.getClass();
                String str3 = paymentConfigurationPresenter.flowToken;
                orientation2.getClass();
                int i3 = AnalyticsHelperKt.WhenMappings.$EnumSwitchMapping$1[orientation2.ordinal()];
                if (i3 == 1) {
                    analytics3.track(new AssetSendViewLoadingScreen(uuid3, str3), null);
                } else if (i3 != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    analytics3.track(new AssetRequestViewLoadingScreen(uuid3, str3), null);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

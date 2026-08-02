package com.squareup.cash.payments.presenters;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.squareup.cash.cdf.asset.AssetRequestStart;
import com.squareup.cash.cdf.asset.AssetSendStart;
import com.squareup.cash.cdf.asset.ExperienceType;
import com.squareup.cash.cdf.asset.Origin;
import com.squareup.cash.cdf.contact.ContactAccessViewPermissionUpsell;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.payments.presenters.AnalyticsHelperKt;
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
public final class PaymentConfigurationPresenter$models$13$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ State $contactsPermissionGranted$delegate;
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ MutableState $startEventLogged$delegate;
    public final /* synthetic */ PaymentConfigurationPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentConfigurationPresenter$models$13$1(PaymentConfigurationPresenter paymentConfigurationPresenter, MutableState mutableState, State state, Continuation continuation) {
        super(2, continuation);
        this.this$0 = paymentConfigurationPresenter;
        this.$startEventLogged$delegate = mutableState;
        this.$contactsPermissionGranted$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$startEventLogged$delegate;
        State state = this.$contactsPermissionGranted$delegate;
        PaymentConfigurationPresenter paymentConfigurationPresenter = this.this$0;
        switch (i) {
            case 0:
                return new PaymentConfigurationPresenter$models$13$1(paymentConfigurationPresenter, mutableState, state, continuation);
            default:
                return new PaymentConfigurationPresenter$models$13$1(paymentConfigurationPresenter, state, mutableState, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((PaymentConfigurationPresenter$models$13$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        State state = this.$contactsPermissionGranted$delegate;
        MutableState mutableState = this.$startEventLogged$delegate;
        PaymentConfigurationPresenter paymentConfigurationPresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (!((Boolean) mutableState.getValue()).booleanValue()) {
                    mutableState.setValue(Boolean.TRUE);
                    Analytics analytics = paymentConfigurationPresenter.analytics;
                    Orientation orientation = paymentConfigurationPresenter.args.orientation;
                    String uuid = paymentConfigurationPresenter.paymentToken.toString();
                    uuid.getClass();
                    boolean models$lambda$1 = PaymentConfigurationPresenter.models$lambda$1(state);
                    String str = paymentConfigurationPresenter.flowToken;
                    Origin origin = paymentConfigurationPresenter.analyticsOrigin;
                    orientation.getClass();
                    origin.getClass();
                    int i2 = AnalyticsHelperKt.WhenMappings.$EnumSwitchMapping$1[orientation.ordinal()];
                    if (i2 == 1) {
                        analytics.track(new AssetSendStart(null, null, uuid, null, origin, null, null, null, null, null, null, null, null, Boolean.valueOf(!models$lambda$1), ExperienceType.BOTTOM_SHEET, str, 65515), null);
                    } else if (i2 != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        analytics.track(new AssetRequestStart(null, null, uuid, null, origin, null, null, null, null, null, null, null, null, Boolean.valueOf(!models$lambda$1), ExperienceType.BOTTOM_SHEET, str, 8171), null);
                    }
                    break;
                } else {
                    break;
                }
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (((Boolean) state.getValue()).booleanValue() && !((Boolean) mutableState.getValue()).booleanValue()) {
                    paymentConfigurationPresenter.analytics.track(new ContactAccessViewPermissionUpsell(paymentConfigurationPresenter.flowToken), null);
                    mutableState.setValue(Boolean.TRUE);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentConfigurationPresenter$models$13$1(PaymentConfigurationPresenter paymentConfigurationPresenter, State state, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.this$0 = paymentConfigurationPresenter;
        this.$contactsPermissionGranted$delegate = state;
        this.$startEventLogged$delegate = mutableState;
    }
}

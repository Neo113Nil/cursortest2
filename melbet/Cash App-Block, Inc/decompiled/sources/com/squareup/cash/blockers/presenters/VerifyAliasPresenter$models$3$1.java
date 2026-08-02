package com.squareup.cash.blockers.presenters;

import androidx.compose.runtime.MutableState;
import app.cash.local.presenters.RealBrandFollowPresenter$models$2$1$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.presenters.VerifyAliasPresenter;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.VerifyAliasViewEvent;
import com.squareup.cash.cdf.alias.AliasVerifyResend;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.maps.views.CashMapViewKt$CashMapView$3$1;
import com.squareup.cash.onboarding.util.AliasRegistrar$Args;
import com.squareup.cash.overlays.OverlayKt;
import com.squareup.protos.franklin.api.HelpItem;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class VerifyAliasPresenter$models$3$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ VerifyAliasViewEvent $event;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState $state$delegate;
    public int label;
    public final /* synthetic */ VerifyAliasPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VerifyAliasPresenter$models$3$1(VerifyAliasPresenter verifyAliasPresenter, VerifyAliasViewEvent verifyAliasViewEvent, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = verifyAliasPresenter;
        this.$event = verifyAliasViewEvent;
        this.$state$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new VerifyAliasPresenter$models$3$1(this.this$0, this.$event, this.$state$delegate, continuation, 0);
            case 1:
                return new VerifyAliasPresenter$models$3$1(this.this$0, this.$event, this.$state$delegate, continuation, 1);
            default:
                return new VerifyAliasPresenter$models$3$1(this.this$0, this.$event, this.$state$delegate, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((VerifyAliasPresenter$models$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AliasRegistrar$Args.DeliveryMechanism deliveryMechanism;
        int i = this.$r8$classId;
        VerifyAliasViewEvent verifyAliasViewEvent = this.$event;
        VerifyAliasPresenter verifyAliasPresenter = this.this$0;
        MutableState mutableState = this.$state$delegate;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str = ((VerifyAliasViewEvent.SubmitCode) verifyAliasViewEvent).verificationCode;
                    RealBrandFollowPresenter$models$2$1$1 realBrandFollowPresenter$models$2$1$1 = new RealBrandFollowPresenter$models$2$1$1(16, mutableState);
                    this.label = 1;
                    if (VerifyAliasPresenter.access$verify(verifyAliasPresenter, str, realBrandFollowPresenter$models$2$1$1, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealBlockersHelper realBlockersHelper = verifyAliasPresenter.blockersHelper;
                    HelpItem helpItem = ((VerifyAliasViewEvent.HelpItemSelected) verifyAliasViewEvent).helpItem;
                    BlockersScreens.VerifyAliasScreen verifyAliasScreen = verifyAliasPresenter.args;
                    CashMapViewKt$CashMapView$3$1 cashMapViewKt$CashMapView$3$1 = new CashMapViewKt$CashMapView$3$1(mutableState, continuation, 4);
                    this.label = 1;
                    if (realBlockersHelper.performHelpAction(helpItem, verifyAliasScreen, null, cashMapViewKt$CashMapView$3$1, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ((VerifyAliasViewEvent.ResendCode) verifyAliasViewEvent).getClass();
                    VerifyAliasViewEvent.ResendCode.Source source = VerifyAliasViewEvent.ResendCode.Source.TOP_LEVEL;
                    RealBrandFollowPresenter$models$2$1$1 realBrandFollowPresenter$models$2$1$12 = new RealBrandFollowPresenter$models$2$1$1(17, mutableState);
                    this.label = 1;
                    Analytics analytics = verifyAliasPresenter.analytics;
                    BlockersScreens.VerifyAliasScreen verifyAliasScreen2 = verifyAliasPresenter.args;
                    BlockersScreens.VerifyAliasScreen.AliasType aliasType = verifyAliasScreen2.aliasType;
                    analytics.track(new AliasVerifyResend(OverlayKt.access$toCdfAliasType(aliasType), verifyAliasScreen2.blockersData.flowToken, AliasVerifyResend.Source.TOP_LEVEL), null);
                    int ordinal = aliasType.ordinal();
                    if (ordinal == 0) {
                        deliveryMechanism = AliasRegistrar$Args.DeliveryMechanism.EMAIL;
                    } else if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        deliveryMechanism = AliasRegistrar$Args.DeliveryMechanism.SMS;
                    }
                    Object reregister = verifyAliasPresenter.reregister(deliveryMechanism, realBrandFollowPresenter$models$2$1$12, this);
                    if (reregister != coroutineSingletons3) {
                        reregister = Unit.INSTANCE;
                    }
                    if (reregister == coroutineSingletons3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                mutableState.setValue(VerifyAliasPresenter.State.copy$default((VerifyAliasPresenter.State) mutableState.getValue(), null, false, false, null, false, verifyAliasPresenter.resendCodeButtonDelaySeconds, 15));
                break;
        }
        return Unit.INSTANCE;
    }
}

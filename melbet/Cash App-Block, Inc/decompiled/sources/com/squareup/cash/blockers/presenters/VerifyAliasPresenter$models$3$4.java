package com.squareup.cash.blockers.presenters;

import androidx.compose.runtime.MutableState;
import app.cash.local.presenters.RealBrandFollowPresenter$models$2$1$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.views.PasscodeViewKt$Passcode$3$1$1$1$2;
import com.squareup.cash.card.onboarding.InteractiveCardView$flingTo$1;
import com.squareup.cash.card.ui.CashCardKt$$ExternalSyntheticLambda0;
import com.squareup.cash.cdf.alias.AliasVerifyCallPhoneNumber;
import com.squareup.cash.onboarding.util.AliasRegistrar$Args;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import papa.Handlers$$ExternalSyntheticBUOutline0;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class VerifyAliasPresenter$models$3$4 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState $state$delegate;
    public int label;
    public final /* synthetic */ VerifyAliasPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VerifyAliasPresenter$models$3$4(VerifyAliasPresenter verifyAliasPresenter, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = verifyAliasPresenter;
        this.$state$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$state$delegate;
        VerifyAliasPresenter verifyAliasPresenter = this.this$0;
        switch (i) {
            case 0:
                return new VerifyAliasPresenter$models$3$4(verifyAliasPresenter, mutableState, continuation, 0);
            default:
                return new VerifyAliasPresenter$models$3$4(verifyAliasPresenter, mutableState, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((VerifyAliasPresenter$models$3$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        int i = this.$r8$classId;
        MutableState mutableState = this.$state$delegate;
        VerifyAliasPresenter verifyAliasPresenter = this.this$0;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealBrandFollowPresenter$models$2$1$1 realBrandFollowPresenter$models$2$1$1 = new RealBrandFollowPresenter$models$2$1$1(18, mutableState);
                    this.label = 1;
                    BlockersScreens.VerifyAliasScreen verifyAliasScreen = verifyAliasPresenter.args;
                    BlockersScreens.VerifyAliasScreen.AliasType aliasType = verifyAliasScreen.aliasType;
                    if (aliasType != BlockersScreens.VerifyAliasScreen.AliasType.SMS) {
                        Handlers$$ExternalSyntheticBUOutline0.m(aliasType, "Can't call ");
                        return null;
                    }
                    verifyAliasPresenter.analytics.track(new AliasVerifyCallPhoneNumber(verifyAliasScreen.blockersData.flowToken), null);
                    Object reregister = verifyAliasPresenter.reregister(AliasRegistrar$Args.DeliveryMechanism.VOICE, realBrandFollowPresenter$models$2$1$1, this);
                    if (reregister != coroutineSingletons) {
                        reregister = Unit.INSTANCE;
                    }
                    if (reregister == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CashCardKt$$ExternalSyntheticLambda0 cashCardKt$$ExternalSyntheticLambda0 = new CashCardKt$$ExternalSyntheticLambda0(9, mutableState);
                    this.label = 1;
                    if (verifyAliasPresenter.args.aliasType == BlockersScreens.VerifyAliasScreen.AliasType.EMAIL) {
                        obj2 = verifyAliasPresenter.pendingEmailVerification.codesFlow.collect(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1.AnonymousClass2(new PasscodeViewKt$Passcode$3$1$1$1$2(22, verifyAliasPresenter, cashCardKt$$ExternalSyntheticLambda0), new InteractiveCardView$flingTo$1.AnonymousClass2(cashCardKt$$ExternalSyntheticLambda0, continuation, 13), 1), this);
                        if (obj2 != coroutineSingletons2) {
                            obj2 = Unit.INSTANCE;
                        }
                        if (obj2 != coroutineSingletons2) {
                            obj2 = Unit.INSTANCE;
                        }
                    } else {
                        obj2 = Unit.INSTANCE;
                    }
                    if (obj2 == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }
}

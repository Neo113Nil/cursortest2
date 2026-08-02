package com.squareup.cash.banking.presenters;

import androidx.compose.runtime.MutableState;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.banking.viewmodels.OverdraftInvalidToggleStateError;
import com.squareup.cash.cdf.overdraftcoverage.OverdraftCoverageManageToggleEnabled;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.money.booklet.MoneyTabBookletKt;
import com.squareup.cash.mooncake.compose_ui.ComposeUtilsKt;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.overdraftly.api.v1_0.app.ToggleOverdraftRequest;
import com.squareup.protos.cash.overdraftly.OverdraftlyService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;
import squareup.cash.overdraft.OverdraftStatus;
import squareup.cash.overdraft.OverdraftStatus$Action$Action$ActivateOverdraftAction;

/* loaded from: classes5.dex */
public final class BetterOverdraftPresenter$models$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $overdraftStatus$delegate;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ LocalHomePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BetterOverdraftPresenter$models$2$1(LocalHomePresenter localHomePresenter, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = localHomePresenter;
        this.$overdraftStatus$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$overdraftStatus$delegate;
        LocalHomePresenter localHomePresenter = this.this$0;
        switch (i) {
            case 0:
                return new BetterOverdraftPresenter$models$2$1(localHomePresenter, mutableState, continuation, 0);
            default:
                return new BetterOverdraftPresenter$models$2$1(localHomePresenter, mutableState, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((BetterOverdraftPresenter$models$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0106  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        OverdraftStatus.Action.ActivateOverdraftAction activateOverdraftAction;
        Object obj2;
        OverdraftStatus.ToggleButton toggleButton;
        OverdraftStatus.Action action;
        MoneyTabBookletKt moneyTabBookletKt;
        OverdraftStatus.ToggleButton toggleButton2;
        Object obj3;
        OverdraftStatus.State_ state_;
        OverdraftStatus.ToggleButton toggleButton3;
        int i = this.$r8$classId;
        ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
        boolean z = false;
        MutableState mutableState = this.$overdraftStatus$delegate;
        LocalHomePresenter localHomePresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    OverdraftStatus overdraftStatus = (OverdraftStatus) mutableState.getValue();
                    overdraftStatus.getClass();
                    OverdraftStatus.State_ state_2 = overdraftStatus.State;
                    this.label = 1;
                    if (state_2 != null) {
                        OverdraftStatus.State_.Disabled disabled = state_2 instanceof OverdraftStatus.State_.Disabled ? (OverdraftStatus.State_.Disabled) state_2 : null;
                        OverdraftStatus.Disabled disabled2 = disabled != null ? disabled.value : null;
                        if (disabled2 != null && (toggleButton2 = disabled2.toggle_button) != null) {
                            z = Intrinsics.areEqual(toggleButton2.is_user_interaction_enabled, Boolean.TRUE);
                        }
                    }
                    if (state_2 != null) {
                        OverdraftStatus.State_.Eligible eligible = state_2 instanceof OverdraftStatus.State_.Eligible ? (OverdraftStatus.State_.Eligible) state_2 : null;
                        OverdraftStatus.Eligible eligible2 = eligible != null ? eligible.value : null;
                        if (eligible2 != null && (toggleButton = eligible2.toggle_button) != null && (action = toggleButton.action) != null && (moneyTabBookletKt = action.action) != null) {
                            OverdraftStatus$Action$Action$ActivateOverdraftAction overdraftStatus$Action$Action$ActivateOverdraftAction = moneyTabBookletKt instanceof OverdraftStatus$Action$Action$ActivateOverdraftAction ? (OverdraftStatus$Action$Action$ActivateOverdraftAction) moneyTabBookletKt : null;
                            if (overdraftStatus$Action$Action$ActivateOverdraftAction != null) {
                                activateOverdraftAction = overdraftStatus$Action$Action$ActivateOverdraftAction.value;
                                if (activateOverdraftAction == null) {
                                    ((RealRouter) localHomePresenter.neighborhoodsTabContentEnabled$delegate).route(new RoutingParams(null, null, null, null, null, null, 511), activateOverdraftAction.client_route_url);
                                } else if (z) {
                                    ((Analytics) localHomePresenter.localHomeGeoPresenterFactory).track(new OverdraftCoverageManageToggleEnabled(OverdraftCoverageManageToggleEnabled.Enabled.True), null);
                                    obj2 = ((OverdraftlyService) localHomePresenter.syncer).toggleOverdraft(ComposeUtilsKt.ToggleOverdraftRequest$default(new ToggleOverdraftRequest.Enable(), null, 14), this);
                                    if (obj2 != coroutineSingletons) {
                                        obj2 = Unit.INSTANCE;
                                    }
                                    if (obj2 == coroutineSingletons) {
                                        break;
                                    }
                                } else {
                                    ((ErrorReporter) localHomePresenter.featureFlagManager).report(new OverdraftInvalidToggleStateError(overdraftStatus), defaultSamplingStrategy);
                                }
                                obj2 = Unit.INSTANCE;
                                if (obj2 == coroutineSingletons) {
                                }
                            }
                        }
                    }
                    activateOverdraftAction = null;
                    if (activateOverdraftAction == null) {
                    }
                    obj2 = Unit.INSTANCE;
                    if (obj2 == coroutineSingletons) {
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
                    OverdraftStatus overdraftStatus2 = (OverdraftStatus) mutableState.getValue();
                    this.label = 1;
                    if (overdraftStatus2 != null && (state_ = overdraftStatus2.State) != null) {
                        OverdraftStatus.State_.Activated activated = state_ instanceof OverdraftStatus.State_.Activated ? (OverdraftStatus.State_.Activated) state_ : null;
                        OverdraftStatus.Activated activated2 = activated != null ? activated.value : null;
                        if (activated2 != null && (toggleButton3 = activated2.toggle_button) != null) {
                            z = Intrinsics.areEqual(toggleButton3.is_user_interaction_enabled, Boolean.TRUE);
                        }
                    }
                    if (z) {
                        ((Analytics) localHomePresenter.localHomeGeoPresenterFactory).track(new OverdraftCoverageManageToggleEnabled(OverdraftCoverageManageToggleEnabled.Enabled.False), null);
                        obj3 = ((OverdraftlyService) localHomePresenter.syncer).toggleOverdraft(ComposeUtilsKt.ToggleOverdraftRequest$default(null, new ToggleOverdraftRequest.Disable(), 13), this);
                        if (obj3 != coroutineSingletons2) {
                            obj3 = Unit.INSTANCE;
                        }
                    } else {
                        ((ErrorReporter) localHomePresenter.featureFlagManager).report(new OverdraftInvalidToggleStateError(overdraftStatus2), defaultSamplingStrategy);
                        obj3 = Unit.INSTANCE;
                    }
                    if (obj3 == coroutineSingletons2) {
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

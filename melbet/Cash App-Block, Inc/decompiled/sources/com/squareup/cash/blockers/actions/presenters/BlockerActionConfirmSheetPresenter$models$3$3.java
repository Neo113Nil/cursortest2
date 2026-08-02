package com.squareup.cash.blockers.actions.presenters;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.blockers.actions.viewevents.BlockerActionConfirmSheetResult$SubmitActionResult;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.screens.Finish;
import com.squareup.protos.franklin.api.BlockerAction;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class BlockerActionConfirmSheetPresenter$models$3$3 extends SuspendLambda implements Function2 {
    public int label;
    public final /* synthetic */ BlockerActionConfirmSheetPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockerActionConfirmSheetPresenter$models$3$3(BlockerActionConfirmSheetPresenter blockerActionConfirmSheetPresenter, Continuation continuation) {
        super(2, continuation);
        this.this$0 = blockerActionConfirmSheetPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BlockerActionConfirmSheetPresenter$models$3$3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BlockerActionConfirmSheetPresenter$models$3$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            BlockerActionConfirmSheetPresenter blockerActionConfirmSheetPresenter = this.this$0;
            BlockersScreens.BlockerActionConfirmSheetScreen blockerActionConfirmSheetScreen = blockerActionConfirmSheetPresenter.args;
            BlockerAction blockerAction = blockerActionConfirmSheetScreen.positiveAction;
            if (blockerAction.action instanceof BlockerAction.Action.SubmitAction) {
                blockerActionConfirmSheetPresenter.navigator.goTo(new Finish(new BlockerActionConfirmSheetResult$SubmitActionResult(blockerAction)));
            } else {
                RealBlockersHelper realBlockersHelper = blockerActionConfirmSheetPresenter.blockersHelper;
                this.label = 1;
                if (BlockersHelper.handleBlockerAction$default(realBlockersHelper, blockerAction, blockerActionConfirmSheetScreen, null, null, false, null, null, this, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}

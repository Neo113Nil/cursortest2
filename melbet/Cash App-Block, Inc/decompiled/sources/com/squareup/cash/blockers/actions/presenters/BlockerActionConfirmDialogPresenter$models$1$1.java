package com.squareup.cash.blockers.actions.presenters;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.amountslider.AmountPickerCondensedView;
import com.squareup.cash.blockers.actions.viewevents.BlockerActionConfirmDialogResult$Positive;
import com.squareup.cash.blockers.actions.viewevents.BlockerActionConfirmDialogResult$SubmitActionResult;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.screens.Finish;
import com.squareup.protos.franklin.api.BlockerAction;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class BlockerActionConfirmDialogPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ BlockerActionConfirmDialogPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockerActionConfirmDialogPresenter$models$1$1(BlockerActionConfirmDialogPresenter blockerActionConfirmDialogPresenter, Continuation continuation) {
        super(2, continuation);
        this.this$0 = blockerActionConfirmDialogPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BlockerActionConfirmDialogPresenter$models$1$1 blockerActionConfirmDialogPresenter$models$1$1 = new BlockerActionConfirmDialogPresenter$models$1$1(this.this$0, continuation);
        blockerActionConfirmDialogPresenter$models$1$1.L$0 = obj;
        return blockerActionConfirmDialogPresenter$models$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BlockerActionConfirmDialogPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        BlockerActionConfirmDialogPresenter blockerActionConfirmDialogPresenter = this.this$0;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            StandaloneCoroutine launch$default = JobKt.launch$default(coroutineScope, null, null, new AmountPickerCondensedView.AnonymousClass14(blockerActionConfirmDialogPresenter, null, 23), 3);
            this.L$0 = null;
            this.label = 1;
            if (launch$default.join(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        BlockerAction blockerAction = blockerActionConfirmDialogPresenter.args.positiveAction;
        boolean z = blockerAction.action instanceof BlockerAction.Action.SubmitAction;
        BetterNavigator.ScreenNavigator screenNavigator = blockerActionConfirmDialogPresenter.navigator;
        if (z) {
            screenNavigator.goTo(new Finish(new BlockerActionConfirmDialogResult$SubmitActionResult(blockerAction)));
        } else {
            screenNavigator.goTo(new Finish(BlockerActionConfirmDialogResult$Positive.INSTANCE));
        }
        return Unit.INSTANCE;
    }
}

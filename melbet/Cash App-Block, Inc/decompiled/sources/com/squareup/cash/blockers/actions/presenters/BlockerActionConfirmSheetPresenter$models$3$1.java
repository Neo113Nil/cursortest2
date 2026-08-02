package com.squareup.cash.blockers.actions.presenters;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.protos.franklin.api.BlockerAction;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class BlockerActionConfirmSheetPresenter$models$3$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ BlockerAction $action;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ BlockerActionConfirmSheetPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BlockerActionConfirmSheetPresenter$models$3$1(BlockerActionConfirmSheetPresenter blockerActionConfirmSheetPresenter, BlockerAction blockerAction, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = blockerActionConfirmSheetPresenter;
        this.$action = blockerAction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        BlockerAction blockerAction = this.$action;
        BlockerActionConfirmSheetPresenter blockerActionConfirmSheetPresenter = this.this$0;
        switch (i) {
            case 0:
                return new BlockerActionConfirmSheetPresenter$models$3$1(blockerActionConfirmSheetPresenter, blockerAction, continuation, 0);
            default:
                return new BlockerActionConfirmSheetPresenter$models$3$1(blockerActionConfirmSheetPresenter, blockerAction, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((BlockerActionConfirmSheetPresenter$models$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        BlockerActionConfirmSheetPresenter blockerActionConfirmSheetPresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealBlockersHelper realBlockersHelper = blockerActionConfirmSheetPresenter.blockersHelper;
                    BlockersScreens.BlockerActionConfirmSheetScreen blockerActionConfirmSheetScreen = blockerActionConfirmSheetPresenter.args;
                    this.label = 1;
                    if (BlockersHelper.handleBlockerAction$default(realBlockersHelper, this.$action, blockerActionConfirmSheetScreen, null, null, false, null, null, this, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE) == coroutineSingletons) {
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
                    RealBlockersHelper realBlockersHelper2 = blockerActionConfirmSheetPresenter.blockersHelper;
                    BlockersScreens.BlockerActionConfirmSheetScreen blockerActionConfirmSheetScreen2 = blockerActionConfirmSheetPresenter.args;
                    this.label = 1;
                    if (BlockersHelper.handleBlockerAction$default(realBlockersHelper2, this.$action, blockerActionConfirmSheetScreen2, null, null, false, null, null, this, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE) == coroutineSingletons2) {
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

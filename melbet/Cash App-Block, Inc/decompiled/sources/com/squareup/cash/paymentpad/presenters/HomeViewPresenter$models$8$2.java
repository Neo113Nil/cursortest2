package com.squareup.cash.paymentpad.presenters;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.paymentpad.viewmodels.HomeViewEvent;
import com.squareup.cash.paymentpad.viewmodels.MainPaymentPadViewEvent;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.SharedFlowImpl;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class HomeViewPresenter$models$8$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ HomeViewEvent $event;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ HomeViewPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HomeViewPresenter$models$8$2(HomeViewPresenter homeViewPresenter, HomeViewEvent homeViewEvent, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = homeViewPresenter;
        this.$event = homeViewEvent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        HomeViewEvent homeViewEvent = this.$event;
        HomeViewPresenter homeViewPresenter = this.this$0;
        switch (i) {
            case 0:
                return new HomeViewPresenter$models$8$2(homeViewPresenter, homeViewEvent, continuation, 0);
            default:
                return new HomeViewPresenter$models$8$2(homeViewPresenter, homeViewEvent, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((HomeViewPresenter$models$8$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        HomeViewEvent homeViewEvent = this.$event;
        HomeViewPresenter homeViewPresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BufferedChannel bufferedChannel = homeViewPresenter.paymentPadChannel;
                    MainPaymentPadViewEvent mainPaymentPadViewEvent = ((HomeViewEvent.MainPaymentPadEvent) homeViewEvent).event;
                    this.label = 1;
                    if (bufferedChannel.send(mainPaymentPadViewEvent, this) == coroutineSingletons) {
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
                    SharedFlowImpl sharedFlowImpl = homeViewPresenter.toolbarEvents;
                    TabToolbarInternalViewEvent tabToolbarInternalViewEvent = ((HomeViewEvent.TabToolbarEvent) homeViewEvent).event;
                    this.label = 1;
                    if (sharedFlowImpl.emit(tabToolbarInternalViewEvent, this) == coroutineSingletons2) {
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

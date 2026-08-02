package com.squareup.cash.activity.presenters;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.viewmodels.ActivityEmbeddedViewEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlowImpl;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class RealActivityEmbeddedPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $isReloadingFirstPage$delegate;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ RealActivityEmbeddedPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealActivityEmbeddedPresenter$models$1$1(RealActivityEmbeddedPresenter realActivityEmbeddedPresenter, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = realActivityEmbeddedPresenter;
        this.$isReloadingFirstPage$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$isReloadingFirstPage$delegate;
        RealActivityEmbeddedPresenter realActivityEmbeddedPresenter = this.this$0;
        switch (i) {
            case 0:
                return new RealActivityEmbeddedPresenter$models$1$1(realActivityEmbeddedPresenter, mutableState, continuation, 0);
            default:
                return new RealActivityEmbeddedPresenter$models$1$1(realActivityEmbeddedPresenter, mutableState, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealActivityEmbeddedPresenter$models$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        RealActivityEmbeddedPresenter realActivityEmbeddedPresenter = this.this$0;
        MutableState mutableState = this.$isReloadingFirstPage$delegate;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState.setValue(Boolean.TRUE);
                    ActivitiesManager activitiesManager = realActivityEmbeddedPresenter.activitiesManager;
                    ActivitiesManager.LoadMode loadMode = ActivitiesManager.LoadMode.RELOAD_FIRST_PAGE;
                    this.label = 1;
                    if (activitiesManager.load(loadMode, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                mutableState.setValue(Boolean.FALSE);
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ActivityEmbeddedPresenter$RefreshMode activityEmbeddedPresenter$RefreshMode = realActivityEmbeddedPresenter.configuration.refreshMode;
                    if (activityEmbeddedPresenter$RefreshMode == ActivityEmbeddedPresenter$RefreshMode.AlwaysOnBack || (activityEmbeddedPresenter$RefreshMode == ActivityEmbeddedPresenter$RefreshMode.FirstLoadOnly && ((Boolean) mutableState.getValue()).booleanValue())) {
                        SharedFlowImpl sharedFlowImpl = realActivityEmbeddedPresenter.refreshTrigger;
                        this.label = 1;
                        if (sharedFlowImpl.emit(ActivityEmbeddedViewEvent.Refresh.INSTANCE, this) == coroutineSingletons2) {
                            break;
                        }
                    }
                    break;
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                mutableState.setValue(Boolean.FALSE);
                break;
        }
        return Unit.INSTANCE;
    }
}

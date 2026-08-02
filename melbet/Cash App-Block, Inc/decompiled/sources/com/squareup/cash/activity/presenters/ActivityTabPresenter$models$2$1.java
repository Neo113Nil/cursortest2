package com.squareup.cash.activity.presenters;

import androidx.paging.compose.LazyPagingItems$collectLoadState$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.preferences.KeyValue;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1;
import kotlinx.coroutines.flow.ReadonlySharedFlow;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class ActivityTabPresenter$models$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ ActivityTabPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ActivityTabPresenter$models$2$1(ActivityTabPresenter activityTabPresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = activityTabPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        ActivityTabPresenter activityTabPresenter = this.this$0;
        switch (i) {
            case 0:
                return new ActivityTabPresenter$models$2$1(activityTabPresenter, continuation, 0);
            case 1:
                return new ActivityTabPresenter$models$2$1(activityTabPresenter, continuation, 1);
            case 2:
                return new ActivityTabPresenter$models$2$1(activityTabPresenter, continuation, 2);
            default:
                return new ActivityTabPresenter$models$2$1(activityTabPresenter, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((ActivityTabPresenter$models$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        ActivityTabPresenter activityTabPresenter = this.this$0;
        Continuation continuation = null;
        int i2 = 1;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = activityTabPresenter.pendingPopupAppMessages;
                    LazyPagingItems$collectLoadState$2 lazyPagingItems$collectLoadState$2 = new LazyPagingItems$collectLoadState$2(activityTabPresenter, 20);
                    this.label = 1;
                    Object collect = flow.collect(new FlowKt__MergeKt$flattenConcat$1$1(lazyPagingItems$collectLoadState$2, 16), this);
                    if (collect != coroutineSingletons) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ActivitiesManager activitiesManager = activityTabPresenter.activitiesManager;
                    ActivitiesManager.LoadMode loadMode = ActivitiesManager.LoadMode.RELOAD_FIRST_PAGE;
                    this.label = 1;
                    if (activitiesManager.load(loadMode, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ReadonlySharedFlow readonlySharedFlow = activityTabPresenter.activityUpdatesNotifierRelay.notifications;
                    ActivityTabPresenter$models$2$1 activityTabPresenter$models$2$1 = new ActivityTabPresenter$models$2$1(activityTabPresenter, continuation, i2);
                    this.label = 1;
                    if (FlowKt.collectLatest(readonlySharedFlow, activityTabPresenter$models$2$1, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    KeyValue keyValue = activityTabPresenter.inlineMessageV2TooltipViewed;
                    Boolean bool = Boolean.TRUE;
                    this.label = 1;
                    if (keyValue.set(bool, this) == coroutineSingletons4) {
                        break;
                    }
                } else if (i6 != 1) {
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

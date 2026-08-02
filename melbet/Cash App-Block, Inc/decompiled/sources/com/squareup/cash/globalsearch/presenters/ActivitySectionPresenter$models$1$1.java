package com.squareup.cash.globalsearch.presenters;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.globalsearch.backend.real.RealGlobalSearchRepository;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class ActivitySectionPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $itemToRefreshOnReturn$delegate;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ ActivitySectionPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ActivitySectionPresenter$models$1$1(ActivitySectionPresenter activitySectionPresenter, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = activitySectionPresenter;
        this.$itemToRefreshOnReturn$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$itemToRefreshOnReturn$delegate;
        ActivitySectionPresenter activitySectionPresenter = this.this$0;
        switch (i) {
            case 0:
                return new ActivitySectionPresenter$models$1$1(activitySectionPresenter, mutableState, continuation, 0);
            default:
                return new ActivitySectionPresenter$models$1$1(activitySectionPresenter, mutableState, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((ActivitySectionPresenter$models$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r9.loadMore(r8) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002d, code lost:
    
        if (com.squareup.cash.globalsearch.presenters.ActivitySectionPresenter.access$trackLoadMoreSelectAnalytics(r3, r8) == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        ActivitySectionPresenter activitySectionPresenter = this.this$0;
        MutableState mutableState = this.$itemToRefreshOnReturn$delegate;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str = (String) mutableState.getValue();
                    if (str != null) {
                        RealGlobalSearchRepository.RealSectionHandle realSectionHandle = activitySectionPresenter.sectionHandle;
                        this.label = 1;
                        if (realSectionHandle.tryUpdateItem(str, this) == coroutineSingletons) {
                            break;
                        }
                    }
                    break;
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                mutableState.setValue(null);
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    break;
                } else if (i3 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i3 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    mutableState.setValue(Boolean.FALSE);
                    break;
                }
                mutableState.setValue(Boolean.TRUE);
                RealGlobalSearchRepository.RealSectionHandle realSectionHandle2 = activitySectionPresenter.sectionHandle;
                this.label = 2;
                break;
        }
        return Unit.INSTANCE;
    }
}

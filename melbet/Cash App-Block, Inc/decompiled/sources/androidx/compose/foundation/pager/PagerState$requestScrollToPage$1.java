package androidx.compose.foundation.pager;

import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.paging.CachedPagingDataKt$cachedIn$4;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class PagerState$requestScrollToPage$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ PagerState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PagerState$requestScrollToPage$1(int i, PagerState pagerState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = pagerState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new PagerState$requestScrollToPage$1(0, this.this$0, continuation);
            case 1:
                return new PagerState$requestScrollToPage$1(1, this.this$0, continuation);
            case 2:
                return new PagerState$requestScrollToPage$1(2, this.this$0, continuation);
            case 3:
                return new PagerState$requestScrollToPage$1(3, this.this$0, continuation);
            default:
                return new PagerState$requestScrollToPage$1(4, this.this$0, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((PagerState$requestScrollToPage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        Object animateScrollToPage;
        Object animateScrollToPage2;
        int i = this.$r8$classId;
        PagerState pagerState = this.this$0;
        switch (i) {
            case 0:
                Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    MutatePriority mutatePriority = MutatePriority.Default;
                    CachedPagingDataKt$cachedIn$4 cachedPagingDataKt$cachedIn$4 = new CachedPagingDataKt$cachedIn$4(2, null, 2);
                    pagerState.getClass();
                    Object scroll$suspendImpl = PagerState.scroll$suspendImpl(pagerState, mutatePriority, cachedPagingDataKt$cachedIn$4, this);
                    if (scroll$suspendImpl != obj4) {
                        scroll$suspendImpl = Unit.INSTANCE;
                    }
                    if (scroll$suspendImpl == obj4) {
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
                Object obj5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    PagerStateKt$UnitDensity$1 pagerStateKt$UnitDensity$1 = PagerStateKt.UnitDensity;
                    if (((ParcelableSnapshotMutableIntState) pagerState.scrollPosition.elementTypes).getIntValue() - 1 >= 0) {
                        obj2 = pagerState.animateScrollToPage(((ParcelableSnapshotMutableIntState) pagerState.scrollPosition.elementTypes).getIntValue() - 1, RecyclerView.DECELERATION_RATE, AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, null, 7), this);
                        if (obj2 != obj5) {
                            obj2 = Unit.INSTANCE;
                        }
                    } else {
                        obj2 = Unit.INSTANCE;
                    }
                    if (obj2 == obj5) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 2:
                Object obj6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    PagerStateKt$UnitDensity$1 pagerStateKt$UnitDensity$12 = PagerStateKt.UnitDensity;
                    if (((ParcelableSnapshotMutableIntState) pagerState.scrollPosition.elementTypes).getIntValue() + 1 < pagerState.getPageCount()) {
                        obj3 = pagerState.animateScrollToPage(((ParcelableSnapshotMutableIntState) pagerState.scrollPosition.elementTypes).getIntValue() + 1, RecyclerView.DECELERATION_RATE, AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, null, 7), this);
                        if (obj3 != obj6) {
                            obj3 = Unit.INSTANCE;
                        }
                    } else {
                        obj3 = Unit.INSTANCE;
                    }
                    if (obj3 == obj6) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 3:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    int intValue = ((ParcelableSnapshotMutableIntState) pagerState.scrollPosition.elementTypes).getIntValue() + 1;
                    this.label = 1;
                    animateScrollToPage = pagerState.animateScrollToPage(intValue, RecyclerView.DECELERATION_RATE, AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, null, 7), this);
                    if (animateScrollToPage == coroutineSingletons) {
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
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    int intValue2 = ((ParcelableSnapshotMutableIntState) pagerState.scrollPosition.elementTypes).getIntValue() - 1;
                    this.label = 1;
                    animateScrollToPage2 = pagerState.animateScrollToPage(intValue2, RecyclerView.DECELERATION_RATE, AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, null, 7), this);
                    if (animateScrollToPage2 == coroutineSingletons2) {
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

package com.squareup.cash.score.views;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.work.impl.WorkLauncherImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.withpersona.sdk2.camera.GovernmentIdFeed$analyze$5;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class ScoreSummaryKt$ScoreDigit$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ int $scoreIndex;
    public final /* synthetic */ LazyListState $state;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScoreSummaryKt$ScoreDigit$1$1(LazyListState lazyListState, int i, int i2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 1;
        this.$state = lazyListState;
        this.label = i;
        this.$scoreIndex = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        int i2 = this.$scoreIndex;
        LazyListState lazyListState = this.$state;
        switch (i) {
            case 0:
                return new ScoreSummaryKt$ScoreDigit$1$1(lazyListState, i2, continuation, 0);
            case 1:
                return new ScoreSummaryKt$ScoreDigit$1$1(lazyListState, this.label, i2, continuation);
            default:
                return new ScoreSummaryKt$ScoreDigit$1$1(lazyListState, i2, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((ScoreSummaryKt$ScoreDigit$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((ScoreSummaryKt$ScoreDigit$1$1) create((ScrollScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((ScoreSummaryKt$ScoreDigit$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
    
        if (r6.animateScrollToItem(r4, 0, r9) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0079, code lost:
    
        if (r6.scroll(androidx.compose.foundation.MutatePriority.Default, r2, r9) == r0) goto L32;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        int i2 = this.$scoreIndex;
        LazyListState lazyListState = this.$state;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    GovernmentIdFeed$analyze$5 governmentIdFeed$analyze$5 = new GovernmentIdFeed$analyze$5(lazyListState, i2, new Ref$FloatRef(), (Continuation) null);
                    this.label = 1;
                    break;
                } else if (i3 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i3 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                this.label = 2;
                WorkLauncherImpl workLauncherImpl = LazyListState.Saver;
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                lazyListState.snapToItemIndexInternal$foundation(this.label, i2);
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!lazyListState.scrollableState.isScrollInProgress() && lazyListState.scrollPosition.index$delegate.getIntValue() != i2) {
                        this.label = 1;
                        if (lazyListState.scrollToItem(i2, 0, this) == coroutineSingletons3) {
                            break;
                        }
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ScoreSummaryKt$ScoreDigit$1$1(LazyListState lazyListState, int i, Continuation continuation, int i2) {
        super(2, continuation);
        this.$r8$classId = i2;
        this.$state = lazyListState;
        this.$scoreIndex = i;
    }
}

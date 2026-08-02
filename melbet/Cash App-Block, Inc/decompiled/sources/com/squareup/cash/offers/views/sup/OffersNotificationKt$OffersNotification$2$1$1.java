package com.squareup.cash.offers.views.sup;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.AnchoredDraggableKt$snapTo$2;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class OffersNotificationKt$OffersNotification$2$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ long $it;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AnchoredDraggableState $state;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OffersNotificationKt$OffersNotification$2$1$1(long j, AnchoredDraggableState anchoredDraggableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$it = j;
        this.$state = anchoredDraggableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new OffersNotificationKt$OffersNotification$2$1$1(this.$it, this.$state, continuation, 0);
            default:
                return new OffersNotificationKt$OffersNotification$2$1$1(this.$it, this.$state, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((OffersNotificationKt$OffersNotification$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        if (androidx.compose.foundation.gestures.Draggable2DKt.animateTo$default(r1, r10, r9) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002d, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(r2, r9) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
    
        if (r9 == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005e, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(r2, r9) == r0) goto L34;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        AnchoredDraggableState anchoredDraggableState = this.$state;
        long j = this.$it;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    break;
                } else if (i2 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i2 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                SwipeState swipeState = SwipeState.UP;
                this.label = 2;
                Object anchoredDrag = anchoredDraggableState.anchoredDrag(swipeState, MutatePriority.Default, new AnchoredDraggableKt$snapTo$2(4, continuation, 0), this);
                if (anchoredDrag != coroutineSingletons) {
                    anchoredDrag = Unit.INSTANCE;
                    break;
                }
                break;
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
                    break;
                }
                com.squareup.cash.afterpayapplet.views.SwipeState swipeState2 = com.squareup.cash.afterpayapplet.views.SwipeState.UP;
                this.label = 2;
                break;
        }
        return Unit.INSTANCE;
    }
}

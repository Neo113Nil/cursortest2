package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$LongRef;

/* loaded from: classes3.dex */
public final class TapGestureDetectorKt$awaitSecondDown$2 extends RestrictedSuspendLambda implements Function2 {
    public final /* synthetic */ Object $firstUp;
    public final /* synthetic */ int $r8$classId = 1;
    public long J$0;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$awaitSecondDown$2(long j, Ref$LongRef ref$LongRef, Continuation continuation) {
        super(2, continuation);
        this.J$0 = j;
        this.$firstUp = ref$LongRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$firstUp;
        switch (i) {
            case 0:
                TapGestureDetectorKt$awaitSecondDown$2 tapGestureDetectorKt$awaitSecondDown$2 = new TapGestureDetectorKt$awaitSecondDown$2((PointerInputChange) obj2, continuation);
                tapGestureDetectorKt$awaitSecondDown$2.L$0 = obj;
                return tapGestureDetectorKt$awaitSecondDown$2;
            default:
                TapGestureDetectorKt$awaitSecondDown$2 tapGestureDetectorKt$awaitSecondDown$22 = new TapGestureDetectorKt$awaitSecondDown$2(this.J$0, (Ref$LongRef) obj2, continuation);
                tapGestureDetectorKt$awaitSecondDown$22.L$0 = obj;
                return tapGestureDetectorKt$awaitSecondDown$22;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine = (SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((TapGestureDetectorKt$awaitSecondDown$2) create(pointerEventHandlerCoroutine, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00ab -> B:27:0x00af). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.$r8$classId
            r1 = 0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r3 = 1
            java.lang.Object r4 = r8.$firstUp
            switch(r0) {
                case 0: goto L73;
                default: goto Lb;
            }
        Lb:
            kotlin.jvm.internal.Ref$LongRef r4 = (kotlin.jvm.internal.Ref$LongRef) r4
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r5 = r8.label
            if (r5 == 0) goto L21
            if (r5 != r3) goto L1d
            java.lang.Object r8 = r8.L$0
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r8 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) r8
            papa.SafeTrace.throwOnFailure(r9)
            goto L40
        L1d:
            bo.app.a$$ExternalSyntheticBUOutline0.m$1(r2)
            goto L72
        L21:
            papa.SafeTrace.throwOnFailure(r9)
            java.lang.Object r9 = r8.L$0
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r9 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) r9
            long r1 = r8.J$0
            androidx.paging.HintHandler$$ExternalSyntheticLambda0 r5 = new androidx.paging.HintHandler$$ExternalSyntheticLambda0
            r6 = 10
            r5.<init>(r4, r6)
            r8.L$0 = r9
            r8.label = r3
            java.lang.Object r8 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m208awaitTouchSlopOrCancellationjO51t88(r9, r1, r5, r8)
            if (r8 != r0) goto L3d
            r1 = r0
            goto L72
        L3d:
            r7 = r9
            r9 = r8
            r8 = r7
        L40:
            androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.ui.input.pointer.PointerInputChange) r9
            if (r9 == 0) goto L58
            long r0 = r4.element
            r2 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r0 = r0 & r2
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 == 0) goto L58
            androidx.compose.foundation.text.selection.DownResolution r1 = androidx.compose.foundation.text.selection.DownResolution.Drag
            goto L72
        L58:
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl r8 = androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.this
            androidx.compose.ui.input.pointer.PointerEvent r8 = r8.currentEvent
            java.util.List r8 = r8.changes
            java.lang.Object r8 = kotlin.collections.CollectionsKt.first(r8)
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            boolean r9 = androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r8)
            if (r9 == 0) goto L70
            r8.consume()
            androidx.compose.foundation.text.selection.DownResolution r1 = androidx.compose.foundation.text.selection.DownResolution.Up
            goto L72
        L70:
            androidx.compose.foundation.text.selection.DownResolution r1 = androidx.compose.foundation.text.selection.DownResolution.Cancel
        L72:
            return r1
        L73:
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r5 = r8.label
            if (r5 == 0) goto L89
            if (r5 != r3) goto L85
            long r1 = r8.J$0
            java.lang.Object r4 = r8.L$0
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r4 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) r4
            papa.SafeTrace.throwOnFailure(r9)
            goto Laf
        L85:
            bo.app.a$$ExternalSyntheticBUOutline0.m$1(r2)
            goto Lb8
        L89:
            papa.SafeTrace.throwOnFailure(r9)
            java.lang.Object r9 = r8.L$0
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r9 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) r9
            androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.ui.input.pointer.PointerInputChange) r4
            long r1 = r4.uptimeMillis
            androidx.compose.ui.platform.ViewConfiguration r4 = r9.getViewConfiguration()
            r4.getClass()
            r4 = 40
            long r4 = r4 + r1
            r1 = r4
            r4 = r9
        La0:
            r8.L$0 = r4
            r8.J$0 = r1
            r8.label = r3
            r9 = 3
            java.lang.Object r9 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r4, r8, r9)
            if (r9 != r0) goto Laf
            r1 = r0
            goto Lb8
        Laf:
            androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.ui.input.pointer.PointerInputChange) r9
            long r5 = r9.uptimeMillis
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 < 0) goto La0
            r1 = r9
        Lb8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$awaitSecondDown$2(PointerInputChange pointerInputChange, Continuation continuation) {
        super(2, continuation);
        this.$firstUp = pointerInputChange;
    }
}

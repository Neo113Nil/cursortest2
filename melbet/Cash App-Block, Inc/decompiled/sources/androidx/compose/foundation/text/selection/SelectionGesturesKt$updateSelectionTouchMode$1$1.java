package androidx.compose.foundation.text.selection;

import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class SelectionGesturesKt$updateSelectionTouchMode$1$1 extends RestrictedSuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 $updateTouchMode;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SelectionGesturesKt$updateSelectionTouchMode$1$1(Function1 function1, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$updateTouchMode = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Function1 function1 = this.$updateTouchMode;
        switch (i) {
            case 0:
                SelectionGesturesKt$updateSelectionTouchMode$1$1 selectionGesturesKt$updateSelectionTouchMode$1$1 = new SelectionGesturesKt$updateSelectionTouchMode$1$1(function1, continuation, 0);
                selectionGesturesKt$updateSelectionTouchMode$1$1.L$0 = obj;
                return selectionGesturesKt$updateSelectionTouchMode$1$1;
            case 1:
                SelectionGesturesKt$updateSelectionTouchMode$1$1 selectionGesturesKt$updateSelectionTouchMode$1$12 = new SelectionGesturesKt$updateSelectionTouchMode$1$1(function1, continuation, 1);
                selectionGesturesKt$updateSelectionTouchMode$1$12.L$0 = obj;
                return selectionGesturesKt$updateSelectionTouchMode$1$12;
            default:
                SelectionGesturesKt$updateSelectionTouchMode$1$1 selectionGesturesKt$updateSelectionTouchMode$1$13 = new SelectionGesturesKt$updateSelectionTouchMode$1$1(function1, continuation, 2);
                selectionGesturesKt$updateSelectionTouchMode$1$13.L$0 = obj;
                return selectionGesturesKt$updateSelectionTouchMode$1$13;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine = (SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
            case 0:
                ((SelectionGesturesKt$updateSelectionTouchMode$1$1) create(pointerEventHandlerCoroutine, continuation)).invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
            case 1:
                return ((SelectionGesturesKt$updateSelectionTouchMode$1$1) create(pointerEventHandlerCoroutine, continuation)).invokeSuspend(Unit.INSTANCE);
            default:
                ((SelectionGesturesKt$updateSelectionTouchMode$1$1) create(pointerEventHandlerCoroutine, continuation)).invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00b3 -> B:36:0x00b7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x002c -> B:7:0x0030). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.$r8$classId
            kotlin.jvm.functions.Function1 r1 = r9.$updateTouchMode
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r3 = 1
            r4 = 0
            switch(r0) {
                case 0: goto L8d;
                case 1: goto L36;
                default: goto Lb;
            }
        Lb:
            java.lang.Object r0 = r9.L$0
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r5 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r6 = r9.label
            if (r6 == 0) goto L1f
            if (r6 != r3) goto L1b
            papa.SafeTrace.throwOnFailure(r10)
            goto L30
        L1b:
            bo.app.a$$ExternalSyntheticBUOutline0.m$1(r2)
            goto L2f
        L1f:
            papa.SafeTrace.throwOnFailure(r10)
        L22:
            r9.L$0 = r0
            r9.label = r3
            androidx.compose.ui.input.pointer.PointerEventPass r10 = androidx.compose.ui.input.pointer.PointerEventPass.Main
            java.lang.Object r10 = r0.awaitPointerEvent(r10, r9)
            if (r10 != r5) goto L30
            r4 = r5
        L2f:
            return r4
        L30:
            com.squareup.cash.blockers.actions.viewevents.BlockerActionConfirmSheetViewEvent$InteractionEvent r10 = com.squareup.cash.blockers.actions.viewevents.BlockerActionConfirmSheetViewEvent.InteractionEvent.INSTANCE
            r1.invoke(r10)
            goto L22
        L36:
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r5 = r9.label
            r6 = 2
            if (r5 == 0) goto L51
            if (r5 == r3) goto L49
            if (r5 != r6) goto L45
            papa.SafeTrace.throwOnFailure(r10)
            goto L83
        L45:
            bo.app.a$$ExternalSyntheticBUOutline0.m$1(r2)
            goto L8c
        L49:
            java.lang.Object r2 = r9.L$0
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r2 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) r2
            papa.SafeTrace.throwOnFailure(r10)
            goto L64
        L51:
            papa.SafeTrace.throwOnFailure(r10)
            java.lang.Object r10 = r9.L$0
            r2 = r10
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r2 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) r2
            r9.L$0 = r2
            r9.label = r3
            java.lang.Object r10 = com.google.android.gms.internal.mlkit_genai_prompt.zzade.access$awaitFirstRightClickDown(r2, r9)
            if (r10 != r0) goto L64
            goto L81
        L64:
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.ui.input.pointer.PointerInputChange) r10
            r10.consume()
            long r7 = r10.position
            androidx.compose.ui.geometry.Offset r10 = new androidx.compose.ui.geometry.Offset
            r10.<init>(r7)
            r1.invoke(r10)
            r9.L$0 = r4
            r9.label = r6
            androidx.paging.CachedPagingDataKt$cachedIn$5 r10 = androidx.compose.foundation.gestures.TapGestureDetectorKt.NoPressGesture
            androidx.compose.ui.input.pointer.PointerEventPass r10 = androidx.compose.ui.input.pointer.PointerEventPass.Main
            java.lang.Object r10 = androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation(r2, r10, r9)
            if (r10 != r0) goto L83
        L81:
            r4 = r0
            goto L8c
        L83:
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.ui.input.pointer.PointerInputChange) r10
            if (r10 == 0) goto L8a
            r10.consume()
        L8a:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L8c:
            return r4
        L8d:
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r5 = r9.label
            if (r5 == 0) goto La1
            if (r5 != r3) goto L9d
            java.lang.Object r2 = r9.L$0
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r2 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) r2
            papa.SafeTrace.throwOnFailure(r10)
            goto Lb7
        L9d:
            bo.app.a$$ExternalSyntheticBUOutline0.m$1(r2)
            goto Lb6
        La1:
            papa.SafeTrace.throwOnFailure(r10)
            java.lang.Object r10 = r9.L$0
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r10 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) r10
            r2 = r10
        La9:
            androidx.compose.ui.input.pointer.PointerEventPass r10 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
            r9.L$0 = r2
            r9.label = r3
            java.lang.Object r10 = r2.awaitPointerEvent(r10, r9)
            if (r10 != r0) goto Lb7
            r4 = r0
        Lb6:
            return r4
        Lb7:
            androidx.compose.ui.input.pointer.PointerEvent r10 = (androidx.compose.ui.input.pointer.PointerEvent) r10
            boolean r10 = androidx.compose.foundation.text.selection.SelectionGestures_androidKt.isMouseOrTouchPad(r10)
            r10 = r10 ^ r3
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r1.invoke(r10)
            goto La9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

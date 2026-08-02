package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class DragGestureDetectorKt$awaitLongPressOrCancellation$2 extends RestrictedSuspendLambda implements Function2 {
    public final /* synthetic */ Ref$ObjectRef $currentDown;
    public final /* synthetic */ Ref$BooleanRef $deepPress;
    public final /* synthetic */ Ref$ObjectRef $longPress;
    public int I$0;
    public /* synthetic */ Object L$0;
    public PointerEvent L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$awaitLongPressOrCancellation$2(Ref$BooleanRef ref$BooleanRef, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Continuation continuation) {
        super(2, continuation);
        this.$deepPress = ref$BooleanRef;
        this.$currentDown = ref$ObjectRef;
        this.$longPress = ref$ObjectRef2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DragGestureDetectorKt$awaitLongPressOrCancellation$2 dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new DragGestureDetectorKt$awaitLongPressOrCancellation$2(this.$deepPress, this.$currentDown, this.$longPress, continuation);
        dragGestureDetectorKt$awaitLongPressOrCancellation$2.L$0 = obj;
        return dragGestureDetectorKt$awaitLongPressOrCancellation$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DragGestureDetectorKt$awaitLongPressOrCancellation$2) create((SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004a, code lost:
    
        if (r8 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d7 A[EDGE_INSN: B:70:0x00d7->B:13:0x00d7 BREAK  A[LOOP:0: B:7:0x00c4->B:10:0x00d4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00c6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00b5 -> B:6:0x00b8). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine;
        int i;
        Object obj2;
        int i2;
        Object awaitPointerEvent;
        SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine2;
        PointerEvent pointerEvent;
        int size;
        int i3;
        boolean m211isPointerUpDmW0f2w;
        Object obj3;
        Object obj4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.label;
        PointerEvent pointerEvent2 = null;
        int i5 = 2;
        int i6 = 1;
        if (i4 == 0) {
            SafeTrace.throwOnFailure(obj);
            pointerEventHandlerCoroutine = (SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) this.L$0;
            i = 0;
            if (i == 0) {
            }
        } else {
            if (i4 == 1) {
                i = this.I$0;
                pointerEventHandlerCoroutine = (SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) this.L$0;
                SafeTrace.throwOnFailure(obj);
                obj2 = obj;
                PointerEvent pointerEvent3 = (PointerEvent) obj2;
                List list = pointerEvent3.changes;
                int size2 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size2) {
                        i = i6;
                        break;
                    }
                    if (!PointerEventKt.changedToUpIgnoreConsumed((PointerInputChange) list.get(i7))) {
                        break;
                    }
                    i7++;
                }
                List list2 = pointerEvent3.changes;
                int size3 = list2.size();
                for (int i8 = 0; i8 < size3; i8++) {
                    PointerInputChange pointerInputChange = (PointerInputChange) list2.get(i8);
                    if (pointerInputChange.isConsumed() || PointerEventKt.m807isOutOfBoundsjwHxaWs(pointerInputChange, SuspendingPointerInputModifierNodeImpl.this.boundsSize, pointerEventHandlerCoroutine.m831getExtendedTouchPaddingNHjbRc())) {
                        break;
                    }
                }
                if (pointerEvent3.classification == i5) {
                    i2 = 1;
                    this.$deepPress.element = true;
                    i = 1;
                } else {
                    i2 = 1;
                }
                PointerEventPass pointerEventPass = PointerEventPass.Final;
                this.L$0 = pointerEventHandlerCoroutine;
                this.L$1 = pointerEvent3;
                this.I$0 = i;
                this.label = i5;
                awaitPointerEvent = pointerEventHandlerCoroutine.awaitPointerEvent(pointerEventPass, this);
                if (awaitPointerEvent != coroutineSingletons) {
                    pointerEventHandlerCoroutine2 = pointerEventHandlerCoroutine;
                    pointerEvent = pointerEvent3;
                    List list3 = ((PointerEvent) awaitPointerEvent).changes;
                    size = list3.size();
                    i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                        }
                        i3++;
                    }
                    Ref$ObjectRef ref$ObjectRef = this.$currentDown;
                    m211isPointerUpDmW0f2w = DragGestureDetectorKt.m211isPointerUpDmW0f2w(pointerEvent, ((PointerInputChange) ref$ObjectRef.element).id);
                    List list4 = pointerEvent.changes;
                    Ref$ObjectRef ref$ObjectRef2 = this.$longPress;
                    if (m211isPointerUpDmW0f2w) {
                    }
                    pointerEventHandlerCoroutine = pointerEventHandlerCoroutine2;
                    pointerEvent2 = null;
                    i5 = 2;
                    i6 = 1;
                    if (i == 0) {
                    }
                }
                return coroutineSingletons;
            }
            if (i4 != 2) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$0;
            pointerEvent = this.L$1;
            pointerEventHandlerCoroutine2 = (SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) this.L$0;
            SafeTrace.throwOnFailure(obj);
            i2 = 1;
            awaitPointerEvent = obj;
            List list32 = ((PointerEvent) awaitPointerEvent).changes;
            size = list32.size();
            i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break;
                }
                if (((PointerInputChange) list32.get(i3)).isConsumed()) {
                    i = i2;
                    break;
                }
                i3++;
            }
            Ref$ObjectRef ref$ObjectRef3 = this.$currentDown;
            m211isPointerUpDmW0f2w = DragGestureDetectorKt.m211isPointerUpDmW0f2w(pointerEvent, ((PointerInputChange) ref$ObjectRef3.element).id);
            List list42 = pointerEvent.changes;
            Ref$ObjectRef ref$ObjectRef22 = this.$longPress;
            if (m211isPointerUpDmW0f2w) {
                int size4 = list42.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size4) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list42.get(i9);
                    if (PointerId.m812equalsimpl0(((PointerInputChange) obj3).id, ((PointerInputChange) ref$ObjectRef3.element).id)) {
                        break;
                    }
                    i9++;
                }
                ref$ObjectRef22.element = obj3;
            } else {
                int size5 = list42.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size5) {
                        obj4 = pointerEvent2;
                        break;
                    }
                    obj4 = list42.get(i10);
                    if (((PointerInputChange) obj4).pressed) {
                        break;
                    }
                    i10++;
                }
                PointerInputChange pointerInputChange2 = (PointerInputChange) obj4;
                if (pointerInputChange2 != null) {
                    ref$ObjectRef3.element = pointerInputChange2;
                    ref$ObjectRef22.element = pointerInputChange2;
                } else {
                    i = i2;
                    i6 = i;
                    pointerEventHandlerCoroutine = pointerEventHandlerCoroutine2;
                    if (i == 0) {
                        return Unit.INSTANCE;
                    }
                    PointerEventPass pointerEventPass2 = PointerEventPass.Main;
                    this.L$0 = pointerEventHandlerCoroutine;
                    this.L$1 = pointerEvent2;
                    this.I$0 = i;
                    this.label = i6;
                    obj2 = pointerEventHandlerCoroutine.awaitPointerEvent(pointerEventPass2, this);
                }
            }
            pointerEventHandlerCoroutine = pointerEventHandlerCoroutine2;
            pointerEvent2 = null;
            i5 = 2;
            i6 = 1;
            if (i == 0) {
            }
        }
    }
}

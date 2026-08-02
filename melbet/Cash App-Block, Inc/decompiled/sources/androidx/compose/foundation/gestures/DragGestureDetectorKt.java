package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.SuspendAnimationKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.BorderKt$$ExternalSyntheticLambda1;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.paging.HintHandler$$ExternalSyntheticLambda0;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda10;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda6;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.Size$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import okhttp3.internal.http1.HeadersReader;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public abstract class DragGestureDetectorKt {
    public static final float mouseToTouchSlopRatio = 0.125f / 18.0f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0089 -> B:10:0x0094). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitAllPointersUpWithSlopDetection(SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine, PointerInputChange pointerInputChange, PointerEventPass pointerEventPass, BaseContinuationImpl baseContinuationImpl) {
        DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1 dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;
        int i;
        Ref$LongRef ref$LongRef;
        HeadersReader headersReader;
        int i2;
        PointerEventPass pointerEventPass2;
        DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1 dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12;
        float f;
        SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine2;
        Object awaitPointerEvent;
        DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1 dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$13;
        Object obj;
        int i3;
        int size;
        int i4;
        Object obj2;
        PointerInputChange pointerInputChange2;
        int size2;
        int i5;
        if (baseContinuationImpl instanceof DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1) {
            dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1 = (DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1) baseContinuationImpl;
            int i6 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.label;
            if ((i6 & PKIFailureInfo.systemUnavail) != 0) {
                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.label = i6 - PKIFailureInfo.systemUnavail;
                Object obj3 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.label;
                Orientation orientation = null;
                int i7 = 1;
                if (i == 0) {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    float f2 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.F$0;
                    int i8 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.I$0;
                    HeadersReader headersReader2 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.L$3;
                    Ref$LongRef ref$LongRef2 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.L$2;
                    PointerEventPass pointerEventPass3 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.L$1;
                    SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine3 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.L$0;
                    SafeTrace.throwOnFailure(obj3);
                    DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1 dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$14 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;
                    f = f2;
                    pointerEventHandlerCoroutine2 = pointerEventHandlerCoroutine3;
                    Ref$LongRef ref$LongRef3 = ref$LongRef2;
                    headersReader = headersReader2;
                    DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1 dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$15 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$14;
                    List list = ((PointerEvent) obj3).changes;
                    int size3 = list.size();
                    int i9 = 0;
                    while (true) {
                        if (i9 < size3) {
                            dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$13 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$15;
                            obj = null;
                            break;
                        }
                        obj = list.get(i9);
                        dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$13 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$15;
                        if (PointerId.m812equalsimpl0(((PointerInputChange) obj).id, ref$LongRef3.element)) {
                            break;
                        }
                        i9++;
                        dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$15 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$13;
                    }
                    PointerInputChange pointerInputChange3 = (PointerInputChange) obj;
                    if (pointerInputChange3 != null || PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                        i3 = 1;
                        size = list.size();
                        i4 = 0;
                        while (true) {
                            if (i4 < size) {
                                obj2 = null;
                                break;
                            }
                            obj2 = list.get(i4);
                            if (((PointerInputChange) obj2).pressed) {
                                break;
                            }
                            i4++;
                        }
                        pointerInputChange2 = (PointerInputChange) obj2;
                        if (pointerInputChange2 != null) {
                            return Boolean.valueOf(i8 != 0);
                        }
                        ref$LongRef3.element = pointerInputChange2.id;
                    } else {
                        i3 = 1;
                        if ((headersReader.m4323getPostSlopOffsetqto3Fdw(f, PointerEventKt.positionChangeInternal(pointerInputChange3, true), true) & 9223372034707292159L) != 9205357640488583168L) {
                            i2 = 1;
                            size2 = list.size();
                            for (i5 = 0; i5 < size2; i5++) {
                                if (((PointerInputChange) list.get(i5)).pressed) {
                                    dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$13;
                                    pointerEventPass2 = pointerEventPass3;
                                    ref$LongRef = ref$LongRef3;
                                    i7 = i3;
                                    dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.L$0 = pointerEventHandlerCoroutine2;
                                    dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.L$1 = pointerEventPass2;
                                    dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.L$2 = ref$LongRef;
                                    dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.L$3 = headersReader;
                                    dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.I$0 = i2;
                                    dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.F$0 = f;
                                    dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.label = i7;
                                    awaitPointerEvent = pointerEventHandlerCoroutine2.awaitPointerEvent(pointerEventPass2, dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12);
                                    if (awaitPointerEvent != coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    Ref$LongRef ref$LongRef4 = ref$LongRef;
                                    pointerEventPass3 = pointerEventPass2;
                                    obj3 = awaitPointerEvent;
                                    ref$LongRef3 = ref$LongRef4;
                                    int i10 = i2;
                                    dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$15 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12;
                                    i8 = i10;
                                    List list2 = ((PointerEvent) obj3).changes;
                                    int size32 = list2.size();
                                    int i92 = 0;
                                    while (true) {
                                        if (i92 < size32) {
                                        }
                                        i92++;
                                        dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$15 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$13;
                                    }
                                    PointerInputChange pointerInputChange32 = (PointerInputChange) obj;
                                    if (pointerInputChange32 != null) {
                                    }
                                    i3 = 1;
                                    size = list2.size();
                                    i4 = 0;
                                    while (true) {
                                        if (i4 < size) {
                                        }
                                        i4++;
                                    }
                                    pointerInputChange2 = (PointerInputChange) obj2;
                                    if (pointerInputChange2 != null) {
                                    }
                                }
                            }
                            return Boolean.valueOf(i2 == 0 ? i3 : 0);
                        }
                    }
                    i2 = i8;
                    size2 = list2.size();
                    while (i5 < size2) {
                    }
                    return Boolean.valueOf(i2 == 0 ? i3 : 0);
                }
                SafeTrace.throwOnFailure(obj3);
                if (Draggable2DKt.allPointersUp(pointerEventHandlerCoroutine)) {
                    return Boolean.FALSE;
                }
                Ref$LongRef ref$LongRef5 = new Ref$LongRef();
                ref$LongRef5.element = pointerInputChange.id;
                float m212pointerSlopE8SPZFQ = m212pointerSlopE8SPZFQ(pointerEventHandlerCoroutine.getViewConfiguration(), pointerInputChange.f859type);
                ref$LongRef = ref$LongRef5;
                headersReader = new HeadersReader(orientation, 3);
                i2 = 0;
                pointerEventPass2 = pointerEventPass;
                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;
                f = m212pointerSlopE8SPZFQ;
                pointerEventHandlerCoroutine2 = pointerEventHandlerCoroutine;
                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.L$0 = pointerEventHandlerCoroutine2;
                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.L$1 = pointerEventPass2;
                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.L$2 = ref$LongRef;
                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.L$3 = headersReader;
                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.I$0 = i2;
                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.F$0 = f;
                dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12.label = i7;
                awaitPointerEvent = pointerEventHandlerCoroutine2.awaitPointerEvent(pointerEventPass2, dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$12);
                if (awaitPointerEvent != coroutineSingletons) {
                }
            }
        }
        dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1 = new DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1(baseContinuationImpl);
        Object obj32 = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1.label;
        Orientation orientation2 = null;
        int i72 = 1;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bd, code lost:
    
        if (androidx.compose.ui.input.pointer.PointerEventKt.positionChangedIgnoreConsumed(r11) != false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x005e -> B:10:0x0063). Please report as a decompilation issue!!! */
    /* renamed from: awaitDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m206awaitDragOrCancellationrnUCldI(SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine, long j, ContinuationImpl continuationImpl) {
        DragGestureDetectorKt$awaitDragOrCancellation$1 dragGestureDetectorKt$awaitDragOrCancellation$1;
        int i;
        SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine2;
        Ref$LongRef ref$LongRef;
        Object awaitPointerEvent;
        Object obj;
        Object obj2;
        if (continuationImpl instanceof DragGestureDetectorKt$awaitDragOrCancellation$1) {
            dragGestureDetectorKt$awaitDragOrCancellation$1 = (DragGestureDetectorKt$awaitDragOrCancellation$1) continuationImpl;
            int i2 = dragGestureDetectorKt$awaitDragOrCancellation$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                dragGestureDetectorKt$awaitDragOrCancellation$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj3 = dragGestureDetectorKt$awaitDragOrCancellation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dragGestureDetectorKt$awaitDragOrCancellation$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj3);
                    pointerEventHandlerCoroutine2 = pointerEventHandlerCoroutine;
                    if (!m211isPointerUpDmW0f2w(SuspendingPointerInputModifierNodeImpl.this.currentEvent, j)) {
                        Ref$LongRef ref$LongRef2 = new Ref$LongRef();
                        ref$LongRef2.element = j;
                        ref$LongRef = ref$LongRef2;
                        dragGestureDetectorKt$awaitDragOrCancellation$1.L$0 = pointerEventHandlerCoroutine2;
                        dragGestureDetectorKt$awaitDragOrCancellation$1.L$1 = ref$LongRef;
                        dragGestureDetectorKt$awaitDragOrCancellation$1.label = 1;
                        awaitPointerEvent = pointerEventHandlerCoroutine2.awaitPointerEvent(PointerEventPass.Main, dragGestureDetectorKt$awaitDragOrCancellation$1);
                        if (awaitPointerEvent != coroutineSingletons) {
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ref$LongRef = dragGestureDetectorKt$awaitDragOrCancellation$1.L$1;
                SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine3 = dragGestureDetectorKt$awaitDragOrCancellation$1.L$0;
                SafeTrace.throwOnFailure(obj3);
                PointerEvent pointerEvent = (PointerEvent) obj3;
                List list = pointerEvent.changes;
                int size = list.size();
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i4 < size) {
                        obj = null;
                        break;
                    }
                    obj = list.get(i4);
                    if (PointerId.m812equalsimpl0(((PointerInputChange) obj).id, ref$LongRef.element)) {
                        break;
                    }
                    i4++;
                }
                PointerInputChange pointerInputChange = (PointerInputChange) obj;
                if (pointerInputChange == null) {
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                        List list2 = pointerEvent.changes;
                        int size2 = list2.size();
                        while (true) {
                            if (i3 >= size2) {
                                obj2 = null;
                                break;
                            }
                            obj2 = list2.get(i3);
                            if (((PointerInputChange) obj2).pressed) {
                                break;
                            }
                            i3++;
                        }
                        PointerInputChange pointerInputChange2 = (PointerInputChange) obj2;
                        if (pointerInputChange2 != null) {
                            ref$LongRef.element = pointerInputChange2.id;
                            pointerEventHandlerCoroutine2 = pointerEventHandlerCoroutine3;
                            dragGestureDetectorKt$awaitDragOrCancellation$1.L$0 = pointerEventHandlerCoroutine2;
                            dragGestureDetectorKt$awaitDragOrCancellation$1.L$1 = ref$LongRef;
                            dragGestureDetectorKt$awaitDragOrCancellation$1.label = 1;
                            awaitPointerEvent = pointerEventHandlerCoroutine2.awaitPointerEvent(PointerEventPass.Main, dragGestureDetectorKt$awaitDragOrCancellation$1);
                            if (awaitPointerEvent != coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine4 = pointerEventHandlerCoroutine2;
                            obj3 = awaitPointerEvent;
                            pointerEventHandlerCoroutine3 = pointerEventHandlerCoroutine4;
                        }
                    }
                    PointerEvent pointerEvent2 = (PointerEvent) obj3;
                    List list3 = pointerEvent2.changes;
                    int size3 = list3.size();
                    int i32 = 0;
                    int i42 = 0;
                    while (true) {
                        if (i42 < size3) {
                        }
                        i42++;
                    }
                    PointerInputChange pointerInputChange3 = (PointerInputChange) obj;
                    if (pointerInputChange3 == null) {
                        pointerInputChange3 = null;
                    }
                }
                if (pointerInputChange3 == null || pointerInputChange3.isConsumed()) {
                    return null;
                }
                return pointerInputChange3;
            }
        }
        dragGestureDetectorKt$awaitDragOrCancellation$1 = new DragGestureDetectorKt$awaitDragOrCancellation$1(continuationImpl);
        Object obj32 = dragGestureDetectorKt$awaitDragOrCancellation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dragGestureDetectorKt$awaitDragOrCancellation$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009f A[Catch: PointerEventTimeoutCancellationException -> 0x00a8, TRY_LEAVE, TryCatch #0 {PointerEventTimeoutCancellationException -> 0x00a8, blocks: (B:11:0x002a, B:12:0x009b, B:14:0x009f, B:34:0x0081), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r10v3, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* renamed from: awaitLongPressOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m207awaitLongPressOrCancellationrnUCldI(SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine, long j, ContinuationImpl continuationImpl) {
        DragGestureDetectorKt$awaitLongPressOrCancellation$1 dragGestureDetectorKt$awaitLongPressOrCancellation$1;
        int i;
        Object obj;
        PointerInputChange pointerInputChange;
        Ref$BooleanRef ref$BooleanRef;
        try {
            if (continuationImpl instanceof DragGestureDetectorKt$awaitLongPressOrCancellation$1) {
                dragGestureDetectorKt$awaitLongPressOrCancellation$1 = (DragGestureDetectorKt$awaitLongPressOrCancellation$1) continuationImpl;
                int i2 = dragGestureDetectorKt$awaitLongPressOrCancellation$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    dragGestureDetectorKt$awaitLongPressOrCancellation$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj2 = dragGestureDetectorKt$awaitLongPressOrCancellation$1.result;
                    Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = dragGestureDetectorKt$awaitLongPressOrCancellation$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj2);
                        if (!m211isPointerUpDmW0f2w(SuspendingPointerInputModifierNodeImpl.this.currentEvent, j)) {
                            List list = SuspendingPointerInputModifierNodeImpl.this.currentEvent.changes;
                            int size = list.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size) {
                                    obj = null;
                                    break;
                                }
                                obj = list.get(i3);
                                if (PointerId.m812equalsimpl0(((PointerInputChange) obj).id, j)) {
                                    break;
                                }
                                i3++;
                            }
                            pointerInputChange = (PointerInputChange) obj;
                            if (pointerInputChange != null) {
                                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                                Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                                ref$ObjectRef2.element = pointerInputChange;
                                long longPressTimeoutMillis = pointerEventHandlerCoroutine.getViewConfiguration().getLongPressTimeoutMillis();
                                Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                                Function2 dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new DragGestureDetectorKt$awaitLongPressOrCancellation$2(ref$BooleanRef2, ref$ObjectRef2, ref$ObjectRef, null);
                                dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$0 = pointerInputChange;
                                dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$1 = ref$ObjectRef;
                                dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$2 = ref$BooleanRef2;
                                dragGestureDetectorKt$awaitLongPressOrCancellation$1.label = 1;
                                if (pointerEventHandlerCoroutine.withTimeout(longPressTimeoutMillis, dragGestureDetectorKt$awaitLongPressOrCancellation$2, dragGestureDetectorKt$awaitLongPressOrCancellation$1) == obj3) {
                                    return obj3;
                                }
                                ref$BooleanRef = ref$BooleanRef2;
                                j = ref$ObjectRef;
                            }
                        }
                        return null;
                    }
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ref$BooleanRef = dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$2;
                    Ref$ObjectRef ref$ObjectRef3 = dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$1;
                    pointerInputChange = dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$0;
                    SafeTrace.throwOnFailure(obj2);
                    j = ref$ObjectRef3;
                    if (ref$BooleanRef.element) {
                        PointerInputChange pointerInputChange2 = (PointerInputChange) j.element;
                        return pointerInputChange2 == null ? pointerInputChange : pointerInputChange2;
                    }
                    return null;
                }
            }
            if (i != 0) {
            }
            if (ref$BooleanRef.element) {
            }
            return null;
        } catch (PointerEventTimeoutCancellationException unused) {
            PointerInputChange pointerInputChange3 = (PointerInputChange) j.element;
            return pointerInputChange3 == null ? pointerInputChange : pointerInputChange3;
        }
        dragGestureDetectorKt$awaitLongPressOrCancellation$1 = new DragGestureDetectorKt$awaitLongPressOrCancellation$1(continuationImpl);
        Object obj22 = dragGestureDetectorKt$awaitLongPressOrCancellation$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dragGestureDetectorKt$awaitLongPressOrCancellation$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0165 -> B:11:0x016b). Please report as a decompilation issue!!! */
    /* renamed from: awaitTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m208awaitTouchSlopOrCancellationjO51t88(SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine, long j, Function2 function2, BaseContinuationImpl baseContinuationImpl) {
        DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
        int i;
        SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine2;
        float touchSlop;
        Ref$LongRef ref$LongRef;
        HeadersReader headersReader;
        Function2 function22;
        Ref$LongRef ref$LongRef2;
        SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine3;
        Ref$LongRef ref$LongRef3;
        int size;
        PointerInputChange pointerInputChange;
        int i2;
        Object obj;
        PointerInputChange pointerInputChange2;
        Object obj2;
        Object awaitPointerEvent;
        if (baseContinuationImpl instanceof DragGestureDetectorKt$awaitTouchSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$1 = (DragGestureDetectorKt$awaitTouchSlopOrCancellation$1) baseContinuationImpl;
            int i3 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj3 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label;
                long j2 = 0;
                int i4 = 1;
                PointerInputChange pointerInputChange3 = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj3);
                    pointerEventHandlerCoroutine2 = pointerEventHandlerCoroutine;
                    if (m211isPointerUpDmW0f2w(SuspendingPointerInputModifierNodeImpl.this.currentEvent, j)) {
                        return null;
                    }
                    touchSlop = pointerEventHandlerCoroutine2.getViewConfiguration().getTouchSlop();
                    ref$LongRef = new Ref$LongRef();
                    ref$LongRef.element = j;
                    headersReader = new HeadersReader(pointerInputChange3, j2, i4);
                    function22 = function2;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$0 = function22;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$1 = pointerEventHandlerCoroutine2;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$2 = ref$LongRef;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$3 = headersReader;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$4 = pointerInputChange3;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.F$0 = touchSlop;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label = i4;
                    awaitPointerEvent = pointerEventHandlerCoroutine2.awaitPointerEvent(PointerEventPass.Main, dragGestureDetectorKt$awaitTouchSlopOrCancellation$1);
                    if (awaitPointerEvent != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    float f = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.F$0;
                    headersReader = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$3;
                    Ref$LongRef ref$LongRef4 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$2;
                    pointerEventHandlerCoroutine3 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$1;
                    Function2 function23 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$0;
                    SafeTrace.throwOnFailure(obj3);
                    ref$LongRef2 = ref$LongRef4;
                    touchSlop = f;
                    function22 = function23;
                    ref$LongRef3 = ref$LongRef2;
                    PointerEvent pointerEvent = (PointerEvent) obj3;
                    List list = pointerEvent.changes;
                    size = list.size();
                    pointerInputChange = pointerInputChange3;
                    i2 = 0;
                    while (true) {
                        if (i2 < size) {
                        }
                        i2++;
                    }
                    pointerInputChange2 = (PointerInputChange) obj;
                    if (pointerInputChange2 != null) {
                        return pointerInputChange;
                    }
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                    }
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$0 = function22;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$1 = pointerEventHandlerCoroutine2;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$2 = ref$LongRef;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$3 = headersReader;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$4 = pointerInputChange3;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.F$0 = touchSlop;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label = i4;
                    awaitPointerEvent = pointerEventHandlerCoroutine2.awaitPointerEvent(PointerEventPass.Main, dragGestureDetectorKt$awaitTouchSlopOrCancellation$1);
                    if (awaitPointerEvent != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                float f2 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.F$0;
                PointerInputChange pointerInputChange4 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$4;
                HeadersReader headersReader2 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$3;
                Ref$LongRef ref$LongRef5 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$2;
                SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine4 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$1;
                Function2 function24 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$0;
                SafeTrace.throwOnFailure(obj3);
                ref$LongRef3 = ref$LongRef5;
                pointerEventHandlerCoroutine3 = pointerEventHandlerCoroutine4;
                char c = 2;
                int i5 = 1;
                pointerInputChange = null;
                long j3 = 0;
                float f3 = f2;
                function22 = function24;
                if (!pointerInputChange4.isConsumed()) {
                    return pointerInputChange;
                }
                pointerInputChange3 = pointerInputChange;
                i4 = i5;
                headersReader = headersReader2;
                touchSlop = f3;
                pointerEventHandlerCoroutine2 = pointerEventHandlerCoroutine3;
                ref$LongRef = ref$LongRef3;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$0 = function22;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$1 = pointerEventHandlerCoroutine2;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$2 = ref$LongRef;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$3 = headersReader;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$4 = pointerInputChange3;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.F$0 = touchSlop;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label = i4;
                awaitPointerEvent = pointerEventHandlerCoroutine2.awaitPointerEvent(PointerEventPass.Main, dragGestureDetectorKt$awaitTouchSlopOrCancellation$1);
                if (awaitPointerEvent != coroutineSingletons) {
                    ref$LongRef2 = ref$LongRef;
                    pointerEventHandlerCoroutine3 = pointerEventHandlerCoroutine2;
                    obj3 = awaitPointerEvent;
                    ref$LongRef3 = ref$LongRef2;
                    PointerEvent pointerEvent2 = (PointerEvent) obj3;
                    List list2 = pointerEvent2.changes;
                    size = list2.size();
                    pointerInputChange = pointerInputChange3;
                    i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            obj = pointerInputChange;
                            break;
                        }
                        obj = list2.get(i2);
                        if (PointerId.m812equalsimpl0(((PointerInputChange) obj).id, ref$LongRef3.element)) {
                            break;
                        }
                        i2++;
                    }
                    pointerInputChange2 = (PointerInputChange) obj;
                    if (pointerInputChange2 != null || pointerInputChange2.isConsumed()) {
                        return pointerInputChange;
                    }
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                        i5 = 1;
                        long m4323getPostSlopOffsetqto3Fdw = headersReader.m4323getPostSlopOffsetqto3Fdw(touchSlop, PointerEventKt.positionChangeInternal(pointerInputChange2, true), true);
                        if ((9223372034707292159L & m4323getPostSlopOffsetqto3Fdw) != 9205357640488583168L) {
                            function22.invoke(pointerInputChange2, new Offset(m4323getPostSlopOffsetqto3Fdw));
                            if (pointerInputChange2.isConsumed()) {
                                return pointerInputChange2;
                            }
                            headersReader.headerLimit = 0L;
                            pointerInputChange3 = pointerInputChange;
                            i4 = 1;
                            pointerEventHandlerCoroutine2 = pointerEventHandlerCoroutine3;
                            ref$LongRef = ref$LongRef3;
                        } else {
                            j3 = 0;
                            PointerEventPass pointerEventPass = PointerEventPass.Final;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$0 = function22;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$1 = pointerEventHandlerCoroutine3;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$2 = ref$LongRef3;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$3 = headersReader;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$4 = pointerInputChange2;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.F$0 = touchSlop;
                            c = 2;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label = 2;
                            if (pointerEventHandlerCoroutine3.awaitPointerEvent(pointerEventPass, dragGestureDetectorKt$awaitTouchSlopOrCancellation$1) != coroutineSingletons) {
                                float f4 = touchSlop;
                                headersReader2 = headersReader;
                                pointerInputChange4 = pointerInputChange2;
                                f3 = f4;
                                if (!pointerInputChange4.isConsumed()) {
                                }
                            }
                        }
                    } else {
                        List list3 = pointerEvent2.changes;
                        int size2 = list3.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size2) {
                                obj2 = pointerInputChange;
                                break;
                            }
                            obj2 = list3.get(i6);
                            if (((PointerInputChange) obj2).pressed) {
                                break;
                            }
                            i6++;
                        }
                        PointerInputChange pointerInputChange5 = (PointerInputChange) obj2;
                        if (pointerInputChange5 == null) {
                            return pointerInputChange;
                        }
                        ref$LongRef3.element = pointerInputChange5.id;
                        pointerInputChange3 = pointerInputChange;
                        i4 = 1;
                        pointerEventHandlerCoroutine2 = pointerEventHandlerCoroutine3;
                        ref$LongRef = ref$LongRef3;
                    }
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$0 = function22;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$1 = pointerEventHandlerCoroutine2;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$2 = ref$LongRef;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$3 = headersReader;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$4 = pointerInputChange3;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.F$0 = touchSlop;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label = i4;
                    awaitPointerEvent = pointerEventHandlerCoroutine2.awaitPointerEvent(PointerEventPass.Main, dragGestureDetectorKt$awaitTouchSlopOrCancellation$1);
                    if (awaitPointerEvent != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        dragGestureDetectorKt$awaitTouchSlopOrCancellation$1 = new DragGestureDetectorKt$awaitTouchSlopOrCancellation$1(baseContinuationImpl);
        Object obj32 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label;
        long j22 = 0;
        int i42 = 1;
        PointerInputChange pointerInputChange32 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a3, code lost:
    
        if (r2 == r4) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x016b -> B:11:0x0172). Please report as a decompilation issue!!! */
    /* renamed from: awaitVerticalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m209awaitVerticalPointerSlopOrCancellationgDDlDlE(SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine, long j, int i, HintHandler$$ExternalSyntheticLambda0 hintHandler$$ExternalSyntheticLambda0, BaseContinuationImpl baseContinuationImpl) {
        DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
        int i2;
        SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine2;
        float m212pointerSlopE8SPZFQ;
        Ref$LongRef ref$LongRef;
        HeadersReader headersReader;
        Function2 function2;
        PointerInputChange pointerInputChange;
        Object obj;
        int i3;
        long j2;
        char c;
        HeadersReader headersReader2;
        PointerInputChange pointerInputChange2;
        Ref$LongRef ref$LongRef2;
        SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine3;
        Object obj2;
        if (baseContinuationImpl instanceof DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = (DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1) baseContinuationImpl;
            int i4 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label = i4 - PKIFailureInfo.systemUnavail;
                Object obj3 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label;
                long j3 = 0;
                int i5 = 1;
                PointerInputChange pointerInputChange3 = null;
                if (i2 != 0) {
                    SafeTrace.throwOnFailure(obj3);
                    Orientation orientation = Orientation.Vertical;
                    pointerEventHandlerCoroutine2 = pointerEventHandlerCoroutine;
                    if (m211isPointerUpDmW0f2w(SuspendingPointerInputModifierNodeImpl.this.currentEvent, j)) {
                        return null;
                    }
                    m212pointerSlopE8SPZFQ = m212pointerSlopE8SPZFQ(pointerEventHandlerCoroutine2.getViewConfiguration(), i);
                    ref$LongRef = new Ref$LongRef();
                    ref$LongRef.element = j;
                    headersReader = new HeadersReader(orientation, j3, i5);
                    function2 = hintHandler$$ExternalSyntheticLambda0;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0 = function2;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1 = pointerEventHandlerCoroutine2;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2 = ref$LongRef;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3 = headersReader;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$4 = pointerInputChange3;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0 = m212pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label = i5;
                    obj3 = pointerEventHandlerCoroutine2.awaitPointerEvent(PointerEventPass.Main, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1);
                } else if (i2 == 1) {
                    float f = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0;
                    headersReader = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3;
                    Ref$LongRef ref$LongRef3 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2;
                    SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine4 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1;
                    Function2 function22 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0;
                    SafeTrace.throwOnFailure(obj3);
                    m212pointerSlopE8SPZFQ = f;
                    function2 = function22;
                    ref$LongRef = ref$LongRef3;
                    pointerEventHandlerCoroutine2 = pointerEventHandlerCoroutine4;
                    PointerEvent pointerEvent = (PointerEvent) obj3;
                    List list = pointerEvent.changes;
                    int size = list.size();
                    pointerInputChange = pointerInputChange3;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size) {
                            obj = pointerInputChange;
                            break;
                        }
                        obj = list.get(i6);
                        if (PointerId.m812equalsimpl0(((PointerInputChange) obj).id, ref$LongRef.element)) {
                            break;
                        }
                        i6++;
                    }
                    PointerInputChange pointerInputChange4 = (PointerInputChange) obj;
                    if (pointerInputChange4 == null || pointerInputChange4.isConsumed()) {
                        return pointerInputChange;
                    }
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange4)) {
                        List list2 = pointerEvent.changes;
                        int size2 = list2.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size2) {
                                obj2 = pointerInputChange;
                                break;
                            }
                            obj2 = list2.get(i7);
                            if (((PointerInputChange) obj2).pressed) {
                                break;
                            }
                            i7++;
                        }
                        PointerInputChange pointerInputChange5 = (PointerInputChange) obj2;
                        if (pointerInputChange5 == null) {
                            return pointerInputChange;
                        }
                        ref$LongRef.element = pointerInputChange5.id;
                        pointerInputChange3 = pointerInputChange;
                        i5 = 1;
                    } else {
                        i3 = 1;
                        long m4323getPostSlopOffsetqto3Fdw = headersReader.m4323getPostSlopOffsetqto3Fdw(m212pointerSlopE8SPZFQ, PointerEventKt.positionChangeInternal(pointerInputChange4, true), true);
                        if ((9223372034707292159L & m4323getPostSlopOffsetqto3Fdw) == 9205357640488583168L) {
                            j2 = 0;
                            PointerEventPass pointerEventPass = PointerEventPass.Final;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0 = function2;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1 = pointerEventHandlerCoroutine2;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2 = ref$LongRef;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3 = headersReader;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$4 = pointerInputChange4;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0 = m212pointerSlopE8SPZFQ;
                            c = 2;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label = 2;
                            if (pointerEventHandlerCoroutine2.awaitPointerEvent(pointerEventPass, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1) != coroutineSingletons) {
                                SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine5 = pointerEventHandlerCoroutine2;
                                headersReader2 = headersReader;
                                pointerInputChange2 = pointerInputChange4;
                                ref$LongRef2 = ref$LongRef;
                                pointerEventHandlerCoroutine3 = pointerEventHandlerCoroutine5;
                                if (!pointerInputChange2.isConsumed()) {
                                }
                            }
                            return coroutineSingletons;
                        }
                        function2.invoke(pointerInputChange4, new Float(Float.intBitsToFloat((int) (m4323getPostSlopOffsetqto3Fdw & BodyPartID.bodyIdMax))));
                        if (pointerInputChange4.isConsumed()) {
                            return pointerInputChange4;
                        }
                        headersReader.headerLimit = 0L;
                        pointerInputChange3 = pointerInputChange;
                        i5 = 1;
                    }
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0 = function2;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1 = pointerEventHandlerCoroutine2;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2 = ref$LongRef;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3 = headersReader;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$4 = pointerInputChange3;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0 = m212pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label = i5;
                    obj3 = pointerEventHandlerCoroutine2.awaitPointerEvent(PointerEventPass.Main, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1);
                } else {
                    if (i2 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    float f2 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0;
                    pointerInputChange2 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$4;
                    headersReader2 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3;
                    Ref$LongRef ref$LongRef4 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2;
                    pointerEventHandlerCoroutine3 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1;
                    Function2 function23 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0;
                    SafeTrace.throwOnFailure(obj3);
                    c = 2;
                    i3 = 1;
                    pointerInputChange = null;
                    j2 = 0;
                    ref$LongRef2 = ref$LongRef4;
                    m212pointerSlopE8SPZFQ = f2;
                    function2 = function23;
                    if (!pointerInputChange2.isConsumed()) {
                        return pointerInputChange;
                    }
                    pointerInputChange3 = pointerInputChange;
                    i5 = i3;
                    headersReader = headersReader2;
                    pointerEventHandlerCoroutine2 = pointerEventHandlerCoroutine3;
                    ref$LongRef = ref$LongRef2;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0 = function2;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1 = pointerEventHandlerCoroutine2;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2 = ref$LongRef;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3 = headersReader;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$4 = pointerInputChange3;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0 = m212pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label = i5;
                    obj3 = pointerEventHandlerCoroutine2.awaitPointerEvent(PointerEventPass.Main, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1);
                }
            }
        }
        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = new DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1(baseContinuationImpl);
        Object obj32 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label;
        long j32 = 0;
        int i52 = 1;
        PointerInputChange pointerInputChange32 = null;
        if (i2 != 0) {
        }
    }

    public static final Object detectDragGestures(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation) {
        int i = 1;
        Object awaitEachGesture = Draggable2DKt.awaitEachGesture(pointerInputScope, new TapGestureDetectorKt$detectTapAndPress$2$1(new Size$$ExternalSyntheticLambda0(20), new BrandSheetViewKt$$ExternalSyntheticLambda6(i, function1), function2, function02, new LocalMapKt$$ExternalSyntheticLambda10(i, function0), null, 1), continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (awaitEachGesture != coroutineSingletons) {
            awaitEachGesture = Unit.INSTANCE;
        }
        return awaitEachGesture == coroutineSingletons ? awaitEachGesture : Unit.INSTANCE;
    }

    public static /* synthetic */ Object detectDragGestures$default(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function2 function2, Continuation continuation, int i) {
        if ((i & 1) != 0) {
            function1 = new BorderKt$$ExternalSyntheticLambda1(21);
        }
        Function1 function12 = function1;
        if ((i & 2) != 0) {
            function0 = new Size$$ExternalSyntheticLambda0(18);
        }
        return detectDragGestures(pointerInputScope, function12, function0, new Size$$ExternalSyntheticLambda0(19), function2, continuation);
    }

    public static Object detectVerticalDragGestures$default(PointerInputScope pointerInputScope, Function2 function2, Continuation continuation) {
        int i = 22;
        Object awaitEachGesture = Draggable2DKt.awaitEachGesture(pointerInputScope, new TapGestureDetectorKt$detectTapAndPress$2$1(new BorderKt$$ExternalSyntheticLambda1(i), function2, new Size$$ExternalSyntheticLambda0(21), new Size$$ExternalSyntheticLambda0(i), (Continuation) null, 2), continuation);
        return awaitEachGesture == CoroutineSingletons.COROUTINE_SUSPENDED ? awaitEachGesture : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0041 -> B:10:0x0044). Please report as a decompilation issue!!! */
    /* renamed from: drag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m210dragjO51t88(SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine, long j, Function1 function1, BaseContinuationImpl baseContinuationImpl) {
        DragGestureDetectorKt$drag$1 dragGestureDetectorKt$drag$1;
        int i;
        PointerInputChange pointerInputChange;
        if (baseContinuationImpl instanceof DragGestureDetectorKt$drag$1) {
            dragGestureDetectorKt$drag$1 = (DragGestureDetectorKt$drag$1) baseContinuationImpl;
            int i2 = dragGestureDetectorKt$drag$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                dragGestureDetectorKt$drag$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = dragGestureDetectorKt$drag$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dragGestureDetectorKt$drag$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    dragGestureDetectorKt$drag$1.L$0 = pointerEventHandlerCoroutine;
                    dragGestureDetectorKt$drag$1.L$1 = function1;
                    dragGestureDetectorKt$drag$1.label = 1;
                    obj = m206awaitDragOrCancellationrnUCldI(pointerEventHandlerCoroutine, j, dragGestureDetectorKt$drag$1);
                    if (obj == coroutineSingletons) {
                    }
                    pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange == null) {
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Function1 function12 = dragGestureDetectorKt$drag$1.L$1;
                    SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine2 = dragGestureDetectorKt$drag$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    function1 = function12;
                    pointerEventHandlerCoroutine = pointerEventHandlerCoroutine2;
                    pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange == null) {
                        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                            return Boolean.TRUE;
                        }
                        function1.invoke(pointerInputChange);
                        j = pointerInputChange.id;
                        dragGestureDetectorKt$drag$1.L$0 = pointerEventHandlerCoroutine;
                        dragGestureDetectorKt$drag$1.L$1 = function1;
                        dragGestureDetectorKt$drag$1.label = 1;
                        obj = m206awaitDragOrCancellationrnUCldI(pointerEventHandlerCoroutine, j, dragGestureDetectorKt$drag$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        pointerInputChange = (PointerInputChange) obj;
                        if (pointerInputChange == null) {
                            return Boolean.FALSE;
                        }
                    }
                }
            }
        }
        dragGestureDetectorKt$drag$1 = new DragGestureDetectorKt$drag$1(baseContinuationImpl);
        Object obj2 = dragGestureDetectorKt$drag$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dragGestureDetectorKt$drag$1.label;
        if (i != 0) {
        }
    }

    /* renamed from: isPointerUp-DmW0f2w, reason: not valid java name */
    public static final boolean m211isPointerUpDmW0f2w(PointerEvent pointerEvent, long j) {
        Object obj;
        List list = pointerEvent.changes;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (PointerId.m812equalsimpl0(((PointerInputChange) obj).id, j)) {
                break;
            }
            i++;
        }
        PointerInputChange pointerInputChange = (PointerInputChange) obj;
        if (pointerInputChange != null && pointerInputChange.pressed) {
            z = true;
        }
        return true ^ z;
    }

    /* renamed from: pointerSlop-E8SPZFQ, reason: not valid java name */
    public static final float m212pointerSlopE8SPZFQ(ViewConfiguration viewConfiguration, int i) {
        return i == 2 ? viewConfiguration.getTouchSlop() * mouseToTouchSlopRatio : viewConfiguration.getTouchSlop();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x05bb -> B:70:0x05c3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:130:0x059e -> B:56:0x05a6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:147:0x0235 -> B:140:0x0236). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:159:0x02cf -> B:140:0x0236). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:178:0x0329 -> B:141:0x0391). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:182:0x037d -> B:137:0x0386). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x061f -> B:12:0x0622). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x041b -> B:77:0x03c9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x0459 -> B:70:0x05c3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x0463 -> B:58:0x0479). Please report as a decompilation issue!!! */
    public static final java.lang.Object processDragGesture(androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine r26, androidx.compose.ui.input.pointer.PointerInputChange r27, defpackage.Size$$ExternalSyntheticLambda0 r28, app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda6 r29, kotlin.jvm.functions.Function2 r30, kotlin.jvm.functions.Function0 r31, app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda10 r32, kotlin.coroutines.jvm.internal.BaseContinuationImpl r33) {
        /*
            Method dump skipped, instructions count: 1778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.processDragGesture(androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine, androidx.compose.ui.input.pointer.PointerInputChange, Size$$ExternalSyntheticLambda0, app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda6, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda10, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0101, code lost:
    
        if (r0 == androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0078 -> B:10:0x007e). Please report as a decompilation issue!!! */
    /* renamed from: verticalDrag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m213verticalDragjO51t88(SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine, long j, SuspendAnimationKt$$ExternalSyntheticLambda0 suspendAnimationKt$$ExternalSyntheticLambda0, BaseContinuationImpl baseContinuationImpl) {
        DragGestureDetectorKt$verticalDrag$1 dragGestureDetectorKt$verticalDrag$1;
        int i;
        SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine2;
        long j2;
        DragGestureDetectorKt$verticalDrag$1 dragGestureDetectorKt$verticalDrag$12;
        Orientation orientation;
        SuspendAnimationKt$$ExternalSyntheticLambda0 suspendAnimationKt$$ExternalSyntheticLambda02;
        int i2;
        Ref$LongRef ref$LongRef;
        Orientation orientation2;
        SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine3;
        Object awaitPointerEvent;
        SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine4;
        Object obj;
        float intBitsToFloat;
        Object obj2;
        if (baseContinuationImpl instanceof DragGestureDetectorKt$verticalDrag$1) {
            dragGestureDetectorKt$verticalDrag$1 = (DragGestureDetectorKt$verticalDrag$1) baseContinuationImpl;
            int i3 = dragGestureDetectorKt$verticalDrag$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                dragGestureDetectorKt$verticalDrag$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj3 = dragGestureDetectorKt$verticalDrag$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dragGestureDetectorKt$verticalDrag$1.label;
                PointerInputChange pointerInputChange = null;
                int i4 = 1;
                if (i == 0) {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Ref$LongRef ref$LongRef2 = dragGestureDetectorKt$verticalDrag$1.L$4;
                    pointerEventHandlerCoroutine3 = dragGestureDetectorKt$verticalDrag$1.L$3;
                    orientation2 = dragGestureDetectorKt$verticalDrag$1.L$2;
                    SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine5 = dragGestureDetectorKt$verticalDrag$1.L$1;
                    Function1 function1 = dragGestureDetectorKt$verticalDrag$1.L$0;
                    SafeTrace.throwOnFailure(obj3);
                    Ref$LongRef ref$LongRef3 = ref$LongRef2;
                    pointerEventHandlerCoroutine2 = pointerEventHandlerCoroutine5;
                    ?? r10 = function1;
                    PointerEvent pointerEvent = (PointerEvent) obj3;
                    List list = pointerEvent.changes;
                    int size = list.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 < size) {
                            pointerEventHandlerCoroutine4 = pointerEventHandlerCoroutine3;
                            obj = null;
                            break;
                        }
                        obj = list.get(i5);
                        pointerEventHandlerCoroutine4 = pointerEventHandlerCoroutine3;
                        if (PointerId.m812equalsimpl0(((PointerInputChange) obj).id, ref$LongRef3.element)) {
                            break;
                        }
                        i5++;
                        pointerEventHandlerCoroutine3 = pointerEventHandlerCoroutine4;
                    }
                    PointerInputChange pointerInputChange2 = (PointerInputChange) obj;
                    if (pointerInputChange2 == null) {
                        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                            List list2 = pointerEvent.changes;
                            int size2 = list2.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 >= size2) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = list2.get(i6);
                                if (((PointerInputChange) obj2).pressed) {
                                    break;
                                }
                                i6++;
                            }
                            PointerInputChange pointerInputChange3 = (PointerInputChange) obj2;
                            if (pointerInputChange3 != null) {
                                ref$LongRef3.element = pointerInputChange3.id;
                                i2 = 1;
                            }
                        } else {
                            i2 = 1;
                            long positionChangeInternal = PointerEventKt.positionChangeInternal(pointerInputChange2, true);
                            if (orientation2 != null) {
                                intBitsToFloat = Float.intBitsToFloat((int) (orientation2 == Orientation.Vertical ? positionChangeInternal & BodyPartID.bodyIdMax : positionChangeInternal >> 32));
                            } else {
                                intBitsToFloat = Offset.m623getDistanceimpl(positionChangeInternal);
                            }
                        }
                        pointerEventHandlerCoroutine3 = pointerEventHandlerCoroutine4;
                        suspendAnimationKt$$ExternalSyntheticLambda02 = r10;
                        i4 = i2;
                        ref$LongRef = ref$LongRef3;
                        dragGestureDetectorKt$verticalDrag$1.L$0 = suspendAnimationKt$$ExternalSyntheticLambda02;
                        dragGestureDetectorKt$verticalDrag$1.L$1 = pointerEventHandlerCoroutine2;
                        dragGestureDetectorKt$verticalDrag$1.L$2 = orientation2;
                        dragGestureDetectorKt$verticalDrag$1.L$3 = pointerEventHandlerCoroutine3;
                        dragGestureDetectorKt$verticalDrag$1.L$4 = ref$LongRef;
                        dragGestureDetectorKt$verticalDrag$1.label = i4;
                        awaitPointerEvent = pointerEventHandlerCoroutine3.awaitPointerEvent(PointerEventPass.Main, dragGestureDetectorKt$verticalDrag$1);
                        if (awaitPointerEvent == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        Ref$LongRef ref$LongRef4 = ref$LongRef;
                        r10 = suspendAnimationKt$$ExternalSyntheticLambda02;
                        obj3 = awaitPointerEvent;
                        ref$LongRef3 = ref$LongRef4;
                        PointerEvent pointerEvent2 = (PointerEvent) obj3;
                        List list3 = pointerEvent2.changes;
                        int size3 = list3.size();
                        int i52 = 0;
                        while (true) {
                            if (i52 < size3) {
                            }
                            i52++;
                            pointerEventHandlerCoroutine3 = pointerEventHandlerCoroutine4;
                        }
                        PointerInputChange pointerInputChange22 = (PointerInputChange) obj;
                        if (pointerInputChange22 == null) {
                            pointerInputChange22 = null;
                        }
                    }
                    i2 = 1;
                    if (pointerInputChange22 == null || pointerInputChange22.isConsumed()) {
                        pointerInputChange = null;
                    } else if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange22)) {
                        pointerInputChange = pointerInputChange22;
                    } else {
                        r10.invoke(pointerInputChange22);
                        dragGestureDetectorKt$verticalDrag$12 = dragGestureDetectorKt$verticalDrag$1;
                        orientation = orientation2;
                        suspendAnimationKt$$ExternalSyntheticLambda02 = r10;
                        i4 = i2;
                        j2 = pointerInputChange22.id;
                        ref$LongRef = new Ref$LongRef();
                        ref$LongRef.element = j2;
                        orientation2 = orientation;
                        dragGestureDetectorKt$verticalDrag$1 = dragGestureDetectorKt$verticalDrag$12;
                        pointerEventHandlerCoroutine3 = pointerEventHandlerCoroutine2;
                        dragGestureDetectorKt$verticalDrag$1.L$0 = suspendAnimationKt$$ExternalSyntheticLambda02;
                        dragGestureDetectorKt$verticalDrag$1.L$1 = pointerEventHandlerCoroutine2;
                        dragGestureDetectorKt$verticalDrag$1.L$2 = orientation2;
                        dragGestureDetectorKt$verticalDrag$1.L$3 = pointerEventHandlerCoroutine3;
                        dragGestureDetectorKt$verticalDrag$1.L$4 = ref$LongRef;
                        dragGestureDetectorKt$verticalDrag$1.label = i4;
                        awaitPointerEvent = pointerEventHandlerCoroutine3.awaitPointerEvent(PointerEventPass.Main, dragGestureDetectorKt$verticalDrag$1);
                        if (awaitPointerEvent == coroutineSingletons) {
                        }
                    }
                    return Boolean.valueOf((boolean) (pointerInputChange == null ? i2 : 0));
                }
                SafeTrace.throwOnFailure(obj3);
                Orientation orientation3 = Orientation.Vertical;
                pointerEventHandlerCoroutine2 = pointerEventHandlerCoroutine;
                j2 = j;
                if (m211isPointerUpDmW0f2w(SuspendingPointerInputModifierNodeImpl.this.currentEvent, j2)) {
                    i2 = 1;
                    return Boolean.valueOf((boolean) (pointerInputChange == null ? i2 : 0));
                }
                dragGestureDetectorKt$verticalDrag$12 = dragGestureDetectorKt$verticalDrag$1;
                orientation = orientation3;
                suspendAnimationKt$$ExternalSyntheticLambda02 = suspendAnimationKt$$ExternalSyntheticLambda0;
                ref$LongRef = new Ref$LongRef();
                ref$LongRef.element = j2;
                orientation2 = orientation;
                dragGestureDetectorKt$verticalDrag$1 = dragGestureDetectorKt$verticalDrag$12;
                pointerEventHandlerCoroutine3 = pointerEventHandlerCoroutine2;
                dragGestureDetectorKt$verticalDrag$1.L$0 = suspendAnimationKt$$ExternalSyntheticLambda02;
                dragGestureDetectorKt$verticalDrag$1.L$1 = pointerEventHandlerCoroutine2;
                dragGestureDetectorKt$verticalDrag$1.L$2 = orientation2;
                dragGestureDetectorKt$verticalDrag$1.L$3 = pointerEventHandlerCoroutine3;
                dragGestureDetectorKt$verticalDrag$1.L$4 = ref$LongRef;
                dragGestureDetectorKt$verticalDrag$1.label = i4;
                awaitPointerEvent = pointerEventHandlerCoroutine3.awaitPointerEvent(PointerEventPass.Main, dragGestureDetectorKt$verticalDrag$1);
                if (awaitPointerEvent == coroutineSingletons) {
                }
            }
        }
        dragGestureDetectorKt$verticalDrag$1 = new DragGestureDetectorKt$verticalDrag$1(baseContinuationImpl);
        Object obj32 = dragGestureDetectorKt$verticalDrag$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dragGestureDetectorKt$verticalDrag$1.label;
        PointerInputChange pointerInputChange4 = null;
        int i42 = 1;
        if (i == 0) {
        }
    }
}

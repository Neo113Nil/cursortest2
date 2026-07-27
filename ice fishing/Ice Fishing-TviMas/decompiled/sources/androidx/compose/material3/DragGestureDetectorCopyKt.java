package androidx.compose.material3;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: DragGestureDetectorCopy.kt */
@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aa\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f26\u0010\r\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\u000eH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001aW\u0010\u0016\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00130\u000e2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00050\u0018H\u0082Hø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001e\u0010\u001c\u001a\u00020\u001d*\u00020\u001e2\u0006\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u001e\u0010!\u001a\u00020\u0005*\u00020\"2\u0006\u0010\u000b\u001a\u00020\fH\u0000ø\u0001\u0000¢\u0006\u0004\b#\u0010$\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"defaultTouchSlop", "Landroidx/compose/ui/unit/Dp;", "F", "mouseSlop", "mouseToTouchSlopRatio", "", "awaitHorizontalPointerSlopOrCancellation", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "pointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerType", "Landroidx/compose/ui/input/pointer/PointerType;", "onPointerSlopReached", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "change", "overSlop", "", "awaitHorizontalPointerSlopOrCancellation-gDDlDlE", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitPointerSlopOrCancellation", "getDragDirectionValue", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "awaitPointerSlopOrCancellation-pn7EDYM", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isPointerUp", "", "Landroidx/compose/ui/input/pointer/PointerEvent;", "isPointerUp-DmW0f2w", "(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z", "pointerSlop", "Landroidx/compose/ui/platform/ViewConfiguration;", "pointerSlop-E8SPZFQ", "(Landroidx/compose/ui/platform/ViewConfiguration;I)F", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DragGestureDetectorCopyKt {
    private static final float defaultTouchSlop;
    private static final float mouseSlop;
    private static final float mouseToTouchSlopRatio;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x011c -> B:17:0x0166). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x015a -> B:11:0x015c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0180 -> B:17:0x0166). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1527awaitHorizontalPointerSlopOrCancellationgDDlDlE(AwaitPointerEventScope awaitPointerEventScope, long j, int i, Function2<? super PointerInputChange, ? super Float, Unit> function2, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;
        int i2;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function2<? super PointerInputChange, ? super Float, Unit> function22;
        Ref.LongRef longRef;
        DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12;
        float f;
        float f2;
        Ref.LongRef longRef2;
        DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13;
        float f3;
        float f4;
        int size;
        int i3;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        Object awaitPointerEvent$default;
        if (continuation instanceof DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1) {
            dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 = (DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1) continuation;
            if ((dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.label -= Integer.MIN_VALUE;
                Object obj = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.label;
                int i4 = 1;
                PointerEventPass pointerEventPass = null;
                if (i2 == 0) {
                    if (i2 == 1) {
                        float f5 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.F$1;
                        float f6 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.F$0;
                        Ref.LongRef longRef3 = (Ref.LongRef) dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.L$2;
                        AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.L$1;
                        Function2<? super PointerInputChange, ? super Float, Unit> function23 = (Function2) dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$14 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;
                        f4 = f5;
                        awaitPointerEventScope2 = awaitPointerEventScope3;
                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$14;
                        f3 = f6;
                        function22 = function23;
                        longRef2 = longRef3;
                        PointerEvent pointerEvent = (PointerEvent) obj;
                        List<PointerInputChange> changes = pointerEvent.getChanges();
                        size = changes.size();
                        int i5 = 0;
                        i3 = 0;
                        while (true) {
                            if (i3 < size) {
                            }
                            i3++;
                        }
                        Intrinsics.checkNotNull(pointerInputChange);
                        pointerInputChange2 = pointerInputChange;
                        if (!pointerInputChange2.isConsumed()) {
                        }
                        return null;
                    }
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    float f7 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.F$1;
                    float f8 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.F$0;
                    PointerInputChange pointerInputChange4 = (PointerInputChange) dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.L$3;
                    Ref.LongRef longRef4 = (Ref.LongRef) dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.L$2;
                    AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.L$1;
                    Function2<? super PointerInputChange, ? super Float, Unit> function24 = (Function2) dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    f2 = f7;
                    awaitPointerEventScope2 = awaitPointerEventScope4;
                    longRef2 = longRef4;
                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;
                    f = f8;
                    function22 = function24;
                    if (!pointerInputChange4.isConsumed()) {
                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13;
                        longRef = longRef2;
                        i4 = 1;
                        pointerEventPass = null;
                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.L$0 = function22;
                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.L$2 = longRef;
                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.L$3 = pointerEventPass;
                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.F$0 = f;
                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.F$1 = f2;
                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.label = i4;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12, i4, pointerEventPass);
                        if (awaitPointerEvent$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        float f9 = f;
                        f4 = f2;
                        obj = awaitPointerEvent$default;
                        longRef2 = longRef;
                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12;
                        f3 = f9;
                        PointerEvent pointerEvent2 = (PointerEvent) obj;
                        List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                        size = changes2.size();
                        int i52 = 0;
                        i3 = 0;
                        while (true) {
                            if (i3 < size) {
                                pointerInputChange = null;
                                break;
                            }
                            pointerInputChange = changes2.get(i3);
                            if (PointerId.m4534equalsimpl0(pointerInputChange.getId(), longRef2.element)) {
                                break;
                            }
                            i3++;
                        }
                        Intrinsics.checkNotNull(pointerInputChange);
                        pointerInputChange2 = pointerInputChange;
                        if (!pointerInputChange2.isConsumed()) {
                            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                                List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                                int size2 = changes3.size();
                                while (true) {
                                    if (i52 >= size2) {
                                        pointerInputChange3 = null;
                                        break;
                                    }
                                    pointerInputChange3 = changes3.get(i52);
                                    if (pointerInputChange3.getPressed()) {
                                        break;
                                    }
                                    i52++;
                                }
                                PointerInputChange pointerInputChange5 = pointerInputChange3;
                                if (pointerInputChange5 != null) {
                                    longRef2.element = pointerInputChange5.getId();
                                    f2 = f4;
                                    f = f3;
                                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13;
                                    longRef = longRef2;
                                }
                            } else {
                                f2 = (Offset.m3166getXimpl(pointerInputChange2.getPosition()) - Offset.m3166getXimpl(pointerInputChange2.getPreviousPosition())) + f4;
                                if (Math.abs(f2) < f3) {
                                    PointerEventPass pointerEventPass2 = PointerEventPass.Final;
                                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13.L$0 = function22;
                                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13.L$1 = awaitPointerEventScope2;
                                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13.L$2 = longRef2;
                                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13.L$3 = pointerInputChange2;
                                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13.F$0 = f3;
                                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13.F$1 = f2;
                                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13.label = 2;
                                    if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    f = f3;
                                    pointerInputChange4 = pointerInputChange2;
                                    if (!pointerInputChange4.isConsumed()) {
                                    }
                                } else {
                                    function22.invoke(pointerInputChange2, Boxing.boxFloat(f2 - (Math.signum(f2) * f3)));
                                    if (pointerInputChange2.isConsumed()) {
                                        return pointerInputChange2;
                                    }
                                    f = f3;
                                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13;
                                    longRef = longRef2;
                                    f2 = 0.0f;
                                }
                            }
                            i4 = 1;
                            pointerEventPass = null;
                            dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.L$0 = function22;
                            dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                            dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.L$2 = longRef;
                            dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.L$3 = pointerEventPass;
                            dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.F$0 = f;
                            dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.F$1 = f2;
                            dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.label = i4;
                            awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12, i4, pointerEventPass);
                            if (awaitPointerEvent$default == coroutine_suspended) {
                            }
                        }
                    }
                    return null;
                }
                ResultKt.throwOnFailure(obj);
                if (m1529isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                float m1530pointerSlopE8SPZFQ = m1530pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
                Ref.LongRef longRef5 = new Ref.LongRef();
                longRef5.element = j;
                awaitPointerEventScope2 = awaitPointerEventScope;
                function22 = function2;
                longRef = longRef5;
                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;
                f = m1530pointerSlopE8SPZFQ;
                f2 = 0.0f;
                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.L$0 = function22;
                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.L$2 = longRef;
                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.L$3 = pointerEventPass;
                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.F$0 = f;
                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.F$1 = f2;
                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.label = i4;
                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12, i4, pointerEventPass);
                if (awaitPointerEvent$default == coroutine_suspended) {
                }
            }
        }
        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 = new DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1(continuation);
        Object obj2 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.label;
        int i42 = 1;
        PointerEventPass pointerEventPass3 = null;
        if (i2 == 0) {
        }
    }

    /* renamed from: awaitPointerSlopOrCancellation-pn7EDYM, reason: not valid java name */
    private static final Object m1528awaitPointerSlopOrCancellationpn7EDYM(AwaitPointerEventScope awaitPointerEventScope, long j, int i, Function2<? super PointerInputChange, ? super Float, Unit> function2, Function1<? super Offset, Float> function1, Continuation<? super PointerInputChange> continuation) {
        float f;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        if (m1529isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
            return null;
        }
        float m1530pointerSlopE8SPZFQ = m1530pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = j;
        float f2 = 0.0f;
        while (true) {
            InlineMarker.mark(0);
            Object awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, continuation, 1, null);
            InlineMarker.mark(1);
            PointerEvent pointerEvent = (PointerEvent) awaitPointerEvent$default;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    f = f2;
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i2);
                f = f2;
                if (Boolean.valueOf(PointerId.m4534equalsimpl0(pointerInputChange.getId(), longRef.element)).booleanValue()) {
                    break;
                }
                i2++;
                f2 = f;
            }
            Intrinsics.checkNotNull(pointerInputChange);
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3.isConsumed()) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        pointerInputChange2 = null;
                        break;
                    }
                    pointerInputChange2 = changes2.get(i3);
                    if (Boolean.valueOf(pointerInputChange2.getPressed()).booleanValue()) {
                        break;
                    }
                    i3++;
                }
                PointerInputChange pointerInputChange4 = pointerInputChange2;
                if (pointerInputChange4 == null) {
                    return null;
                }
                longRef.element = pointerInputChange4.getId();
            } else {
                float floatValue = f + (function1.invoke(Offset.m3155boximpl(pointerInputChange3.getPosition())).floatValue() - function1.invoke(Offset.m3155boximpl(pointerInputChange3.getPreviousPosition())).floatValue());
                if (Math.abs(floatValue) < m1530pointerSlopE8SPZFQ) {
                    PointerEventPass pointerEventPass = PointerEventPass.Final;
                    InlineMarker.mark(0);
                    awaitPointerEventScope.awaitPointerEvent(pointerEventPass, continuation);
                    InlineMarker.mark(1);
                    if (pointerInputChange3.isConsumed()) {
                        return null;
                    }
                    f = floatValue;
                } else {
                    function2.invoke(pointerInputChange3, Float.valueOf(floatValue - (Math.signum(floatValue) * m1530pointerSlopE8SPZFQ)));
                    if (pointerInputChange3.isConsumed()) {
                        return pointerInputChange3;
                    }
                    f = 0.0f;
                    f2 = f;
                }
            }
            f2 = f;
        }
    }

    /* renamed from: isPointerUp-DmW0f2w, reason: not valid java name */
    private static final boolean m1529isPointerUpDmW0f2w(PointerEvent pointerEvent, long j) {
        PointerInputChange pointerInputChange;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                pointerInputChange = null;
                break;
            }
            pointerInputChange = changes.get(i);
            if (PointerId.m4534equalsimpl0(pointerInputChange.getId(), j)) {
                break;
            }
            i++;
        }
        PointerInputChange pointerInputChange2 = pointerInputChange;
        if (pointerInputChange2 != null && pointerInputChange2.getPressed()) {
            z = true;
        }
        return true ^ z;
    }

    /* renamed from: pointerSlop-E8SPZFQ, reason: not valid java name */
    public static final float m1530pointerSlopE8SPZFQ(ViewConfiguration viewConfiguration, int i) {
        return PointerType.m4624equalsimpl0(i, PointerType.INSTANCE.m4629getMouseT8wyACA()) ? viewConfiguration.getTouchSlop() * mouseToTouchSlopRatio : viewConfiguration.getTouchSlop();
    }

    static {
        float m5734constructorimpl = Dp.m5734constructorimpl((float) 0.125d);
        mouseSlop = m5734constructorimpl;
        float m5734constructorimpl2 = Dp.m5734constructorimpl(18);
        defaultTouchSlop = m5734constructorimpl2;
        mouseToTouchSlopRatio = m5734constructorimpl / m5734constructorimpl2;
    }
}

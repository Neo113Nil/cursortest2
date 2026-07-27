package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* compiled from: DragGestureDetector.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5", f = "DragGestureDetector.kt", i = {0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {175, 884, 926, 192}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down", "overSlop", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointerDirectionConfig$iv", "pointer$iv", "touchSlop$iv", "totalPositionChange$iv", "$this$awaitEachGesture", "down", "overSlop", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointerDirectionConfig$iv", "pointer$iv", "dragEvent$iv", "touchSlop$iv", "totalPositionChange$iv"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "F$0", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "F$0", "J$0"})
/* loaded from: classes.dex */
final class DragGestureDetectorKt$detectDragGestures$5 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<PointerInputChange, Offset, Unit> $onDrag;
    final /* synthetic */ Function0<Unit> $onDragCancel;
    final /* synthetic */ Function0<Unit> $onDragEnd;
    final /* synthetic */ Function1<Offset, Unit> $onDragStart;
    float F$0;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DragGestureDetectorKt$detectDragGestures$5(Function1<? super Offset, Unit> function1, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Function0<Unit> function0, Function0<Unit> function02, Continuation<? super DragGestureDetectorKt$detectDragGestures$5> continuation) {
        super(2, continuation);
        this.$onDragStart = function1;
        this.$onDrag = function2;
        this.$onDragCancel = function0;
        this.$onDragEnd = function02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DragGestureDetectorKt$detectDragGestures$5 dragGestureDetectorKt$detectDragGestures$5 = new DragGestureDetectorKt$detectDragGestures$5(this.$onDragStart, this.$onDrag, this.$onDragCancel, this.$onDragEnd, continuation);
        dragGestureDetectorKt$detectDragGestures$5.L$0 = obj;
        return dragGestureDetectorKt$detectDragGestures$5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
        return ((DragGestureDetectorKt$detectDragGestures$5) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0115 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ea  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00d8 -> B:21:0x020c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0157 -> B:21:0x020c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0190 -> B:29:0x00f8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x01dd -> B:18:0x01df). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0209 -> B:21:0x020c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0275 -> B:29:0x00f8). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AwaitPointerEventScope awaitPointerEventScope;
        Object awaitFirstDown$default;
        PointerInputChange pointerInputChange;
        Ref.LongRef longRef;
        Object obj2;
        Ref.LongRef longRef2;
        PointerDirectionConfig pointerDirectionConfig;
        float f;
        Ref.LongRef longRef3;
        long j;
        PointerInputChange pointerInputChange2;
        AwaitPointerEventScope awaitPointerEventScope2;
        List<PointerInputChange> changes;
        int size;
        int i;
        Object obj3;
        AwaitPointerEventScope awaitPointerEventScope3;
        PointerInputChange pointerInputChange3;
        PointerInputChange pointerInputChange4;
        Object obj4;
        char c;
        PointerInputChange pointerInputChange5;
        List<PointerInputChange> list;
        long id;
        Object m348dragjO51t88;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        char c2 = 3;
        int i3 = 2;
        int i4 = 1;
        PointerInputChange pointerInputChange6 = null;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
            this.L$0 = awaitPointerEventScope;
            this.label = 1;
            awaitFirstDown$default = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, null, this, 2, null);
            if (awaitFirstDown$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i2 == 1) {
            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            awaitFirstDown$default = obj;
        } else {
            if (i2 == 2) {
                long j2 = this.J$0;
                float f2 = this.F$0;
                Ref.LongRef longRef4 = (Ref.LongRef) this.L$5;
                PointerDirectionConfig pointerDirectionConfig2 = (PointerDirectionConfig) this.L$4;
                AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) this.L$3;
                Ref.LongRef longRef5 = (Ref.LongRef) this.L$2;
                PointerInputChange pointerInputChange7 = (PointerInputChange) this.L$1;
                AwaitPointerEventScope awaitPointerEventScope5 = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                obj2 = obj;
                f = f2;
                pointerInputChange2 = pointerInputChange7;
                pointerDirectionConfig = pointerDirectionConfig2;
                longRef2 = longRef4;
                j = j2;
                awaitPointerEventScope = awaitPointerEventScope4;
                longRef3 = longRef5;
                awaitPointerEventScope2 = awaitPointerEventScope5;
                PointerEvent pointerEvent = (PointerEvent) obj2;
                changes = pointerEvent.getChanges();
                size = changes.size();
                i = 0;
                while (true) {
                    if (i < size) {
                    }
                    i++;
                    changes = list;
                    coroutine_suspended = obj3;
                    awaitPointerEventScope = awaitPointerEventScope3;
                }
                pointerInputChange4 = pointerInputChange3;
                if (pointerInputChange4 != null) {
                }
                awaitPointerEventScope = awaitPointerEventScope2;
                pointerInputChange = pointerInputChange2;
                longRef = longRef3;
                obj4 = obj3;
                pointerInputChange4 = null;
                c = 3;
                if (pointerInputChange4 == null) {
                }
                if (pointerInputChange4 != null) {
                }
                return Unit.INSTANCE;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                m348dragjO51t88 = obj;
                if (((Boolean) m348dragjO51t88).booleanValue()) {
                    this.$onDragCancel.invoke();
                } else {
                    this.$onDragEnd.invoke();
                }
                return Unit.INSTANCE;
            }
            long j3 = this.J$0;
            float f3 = this.F$0;
            PointerInputChange pointerInputChange8 = (PointerInputChange) this.L$6;
            Ref.LongRef longRef6 = (Ref.LongRef) this.L$5;
            PointerDirectionConfig pointerDirectionConfig3 = (PointerDirectionConfig) this.L$4;
            AwaitPointerEventScope awaitPointerEventScope6 = (AwaitPointerEventScope) this.L$3;
            Ref.LongRef longRef7 = (Ref.LongRef) this.L$2;
            PointerInputChange pointerInputChange9 = (PointerInputChange) this.L$1;
            awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            obj4 = coroutine_suspended;
            f = f3;
            awaitPointerEventScope = awaitPointerEventScope6;
            pointerDirectionConfig = pointerDirectionConfig3;
            c = 3;
            long m3171plusMKHz9U = j3;
            pointerInputChange2 = pointerInputChange9;
            longRef2 = longRef6;
            longRef3 = longRef7;
            if (!pointerInputChange8.isConsumed()) {
                awaitPointerEventScope = awaitPointerEventScope2;
                pointerInputChange = pointerInputChange2;
                longRef = longRef3;
                pointerInputChange4 = null;
                if (pointerInputChange4 == null && !pointerInputChange4.isConsumed()) {
                    coroutine_suspended = obj4;
                    c2 = c;
                    i3 = 2;
                    i4 = 1;
                    pointerInputChange6 = null;
                    id = pointerInputChange.getId();
                    int type = pointerInputChange.getType();
                    PointerDirectionConfig bidirectionalPointerDirectionConfig = DragGestureDetectorKt.getBidirectionalPointerDirectionConfig();
                    if (!DragGestureDetectorKt.m350isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), id)) {
                        obj4 = coroutine_suspended;
                        c = c2;
                        pointerInputChange4 = pointerInputChange6;
                        if (pointerInputChange4 == null) {
                        }
                        if (pointerInputChange4 != null) {
                        }
                        return Unit.INSTANCE;
                    }
                    float m351pointerSlopE8SPZFQ = DragGestureDetectorKt.m351pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), type);
                    Ref.LongRef longRef8 = new Ref.LongRef();
                    longRef8.element = id;
                    j = Offset.INSTANCE.m3182getZeroF1C5BW0();
                    longRef2 = longRef8;
                    pointerDirectionConfig = bidirectionalPointerDirectionConfig;
                    f = m351pointerSlopE8SPZFQ;
                    longRef3 = longRef;
                    pointerInputChange2 = pointerInputChange;
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    PointerEventPass pointerEventPass = pointerInputChange6;
                    this.L$0 = awaitPointerEventScope2;
                    this.L$1 = pointerInputChange2;
                    this.L$2 = longRef3;
                    this.L$3 = awaitPointerEventScope;
                    this.L$4 = pointerDirectionConfig;
                    this.L$5 = longRef2;
                    this.L$6 = pointerEventPass;
                    this.F$0 = f;
                    this.J$0 = j;
                    this.label = i3;
                    obj2 = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, pointerEventPass, this, i4, pointerEventPass);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    PointerEvent pointerEvent2 = (PointerEvent) obj2;
                    changes = pointerEvent2.getChanges();
                    size = changes.size();
                    i = 0;
                    while (true) {
                        if (i < size) {
                            obj3 = coroutine_suspended;
                            awaitPointerEventScope3 = awaitPointerEventScope;
                            pointerInputChange3 = null;
                            break;
                        }
                        pointerInputChange3 = changes.get(i);
                        list = changes;
                        obj3 = coroutine_suspended;
                        awaitPointerEventScope3 = awaitPointerEventScope;
                        if (PointerId.m4534equalsimpl0(pointerInputChange3.getId(), longRef2.element)) {
                            break;
                        }
                        i++;
                        changes = list;
                        coroutine_suspended = obj3;
                        awaitPointerEventScope = awaitPointerEventScope3;
                    }
                    pointerInputChange4 = pointerInputChange3;
                    if (pointerInputChange4 != null && !pointerInputChange4.isConsumed()) {
                        if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange4)) {
                            List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                            int size2 = changes2.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size2) {
                                    pointerInputChange5 = null;
                                    break;
                                }
                                pointerInputChange5 = changes2.get(i5);
                                if (pointerInputChange5.getPressed()) {
                                    break;
                                }
                                i5++;
                            }
                            PointerInputChange pointerInputChange10 = pointerInputChange5;
                            if (pointerInputChange10 != null) {
                                longRef2.element = pointerInputChange10.getId();
                                coroutine_suspended = obj3;
                                awaitPointerEventScope = awaitPointerEventScope3;
                                i3 = 2;
                                i4 = 1;
                                pointerEventPass = 0;
                            }
                        } else {
                            m3171plusMKHz9U = Offset.m3171plusMKHz9U(j, Offset.m3170minusMKHz9U(pointerInputChange4.getPosition(), pointerInputChange4.getPreviousPosition()));
                            if (pointerDirectionConfig.mo353calculateDeltaChangek4lQ0M(m3171plusMKHz9U) < f) {
                                this.L$0 = awaitPointerEventScope2;
                                this.L$1 = pointerInputChange2;
                                this.L$2 = longRef3;
                                AwaitPointerEventScope awaitPointerEventScope7 = awaitPointerEventScope3;
                                this.L$3 = awaitPointerEventScope7;
                                this.L$4 = pointerDirectionConfig;
                                this.L$5 = longRef2;
                                this.L$6 = pointerInputChange4;
                                this.F$0 = f;
                                this.J$0 = m3171plusMKHz9U;
                                c = 3;
                                this.label = 3;
                                obj4 = obj3;
                                if (awaitPointerEventScope7.awaitPointerEvent(PointerEventPass.Final, this) == obj4) {
                                    return obj4;
                                }
                                pointerInputChange8 = pointerInputChange4;
                                awaitPointerEventScope = awaitPointerEventScope7;
                                if (!pointerInputChange8.isConsumed()) {
                                    coroutine_suspended = obj4;
                                    i4 = 1;
                                    pointerEventPass = 0;
                                    j = m3171plusMKHz9U;
                                    i3 = 2;
                                }
                            } else {
                                obj4 = obj3;
                                AwaitPointerEventScope awaitPointerEventScope8 = awaitPointerEventScope3;
                                c = 3;
                                long mo354calculatePostSlopOffset8S9VItk = pointerDirectionConfig.mo354calculatePostSlopOffset8S9VItk(m3171plusMKHz9U, f);
                                pointerInputChange4.consume();
                                longRef3.element = mo354calculatePostSlopOffset8S9VItk;
                                if (pointerInputChange4.isConsumed()) {
                                    awaitPointerEventScope = awaitPointerEventScope2;
                                    pointerInputChange = pointerInputChange2;
                                    longRef = longRef3;
                                    if (pointerInputChange4 == null) {
                                    }
                                    if (pointerInputChange4 != null) {
                                    }
                                    return Unit.INSTANCE;
                                }
                                i3 = 2;
                                coroutine_suspended = obj4;
                                awaitPointerEventScope = awaitPointerEventScope8;
                                pointerEventPass = 0;
                                i4 = 1;
                                j = Offset.INSTANCE.m3182getZeroF1C5BW0();
                            }
                        }
                        this.L$0 = awaitPointerEventScope2;
                        this.L$1 = pointerInputChange2;
                        this.L$2 = longRef3;
                        this.L$3 = awaitPointerEventScope;
                        this.L$4 = pointerDirectionConfig;
                        this.L$5 = longRef2;
                        this.L$6 = pointerEventPass;
                        this.F$0 = f;
                        this.J$0 = j;
                        this.label = i3;
                        obj2 = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, pointerEventPass, this, i4, pointerEventPass);
                        if (obj2 == coroutine_suspended) {
                        }
                        PointerEvent pointerEvent22 = (PointerEvent) obj2;
                        changes = pointerEvent22.getChanges();
                        size = changes.size();
                        i = 0;
                        while (true) {
                            if (i < size) {
                            }
                            i++;
                            changes = list;
                            coroutine_suspended = obj3;
                            awaitPointerEventScope = awaitPointerEventScope3;
                        }
                        pointerInputChange4 = pointerInputChange3;
                        if (pointerInputChange4 != null) {
                            if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange4)) {
                            }
                            this.L$0 = awaitPointerEventScope2;
                            this.L$1 = pointerInputChange2;
                            this.L$2 = longRef3;
                            this.L$3 = awaitPointerEventScope;
                            this.L$4 = pointerDirectionConfig;
                            this.L$5 = longRef2;
                            this.L$6 = pointerEventPass;
                            this.F$0 = f;
                            this.J$0 = j;
                            this.label = i3;
                            obj2 = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, pointerEventPass, this, i4, pointerEventPass);
                            if (obj2 == coroutine_suspended) {
                            }
                            PointerEvent pointerEvent222 = (PointerEvent) obj2;
                            changes = pointerEvent222.getChanges();
                            size = changes.size();
                            i = 0;
                            while (true) {
                                if (i < size) {
                                }
                                i++;
                                changes = list;
                                coroutine_suspended = obj3;
                                awaitPointerEventScope = awaitPointerEventScope3;
                            }
                            pointerInputChange4 = pointerInputChange3;
                            if (pointerInputChange4 != null) {
                            }
                        }
                    }
                    awaitPointerEventScope = awaitPointerEventScope2;
                    pointerInputChange = pointerInputChange2;
                    longRef = longRef3;
                    obj4 = obj3;
                    pointerInputChange4 = null;
                    c = 3;
                    if (pointerInputChange4 == null) {
                    }
                    if (pointerInputChange4 != null) {
                    }
                    return Unit.INSTANCE;
                }
                if (pointerInputChange4 != null) {
                    this.$onDragStart.invoke(Offset.m3155boximpl(pointerInputChange4.getPosition()));
                    this.$onDrag.invoke(pointerInputChange4, Offset.m3155boximpl(longRef.element));
                    long id2 = pointerInputChange4.getId();
                    final Function2<PointerInputChange, Offset, Unit> function2 = this.$onDrag;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.label = 4;
                    m348dragjO51t88 = DragGestureDetectorKt.m348dragjO51t88(awaitPointerEventScope, id2, new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange11) {
                            invoke2(pointerInputChange11);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(PointerInputChange pointerInputChange11) {
                            function2.invoke(pointerInputChange11, Offset.m3155boximpl(PointerEventKt.positionChange(pointerInputChange11)));
                            pointerInputChange11.consume();
                        }
                    }, this);
                    if (m348dragjO51t88 == obj4) {
                        return obj4;
                    }
                    if (((Boolean) m348dragjO51t88).booleanValue()) {
                    }
                }
                return Unit.INSTANCE;
            }
        }
        pointerInputChange = (PointerInputChange) awaitFirstDown$default;
        longRef = new Ref.LongRef();
        longRef.element = Offset.INSTANCE.m3182getZeroF1C5BW0();
        id = pointerInputChange.getId();
        int type2 = pointerInputChange.getType();
        PointerDirectionConfig bidirectionalPointerDirectionConfig2 = DragGestureDetectorKt.getBidirectionalPointerDirectionConfig();
        if (!DragGestureDetectorKt.m350isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), id)) {
        }
    }
}

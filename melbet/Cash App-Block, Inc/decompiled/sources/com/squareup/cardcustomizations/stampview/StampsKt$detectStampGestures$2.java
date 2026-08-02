package com.squareup.cardcustomizations.stampview;

import androidx.compose.foundation.gestures.Draggable2DKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$LongRef;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class StampsKt$detectStampGestures$2 extends RestrictedSuspendLambda implements Function2 {
    public final /* synthetic */ Function2 $onEndGesture;
    public final /* synthetic */ Function5 $onGesture;
    public final /* synthetic */ Function1 $onStartGesture;
    public float F$0;
    public float F$1;
    public float F$2;
    public int I$0;
    public int I$1;
    public long J$0;
    public /* synthetic */ Object L$0;
    public Ref$LongRef L$1;
    public Ref$IntRef L$2;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StampsKt$detectStampGestures$2(Function1 function1, Function5 function5, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.$onStartGesture = function1;
        this.$onGesture = function5;
        this.$onEndGesture = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        StampsKt$detectStampGestures$2 stampsKt$detectStampGestures$2 = new StampsKt$detectStampGestures$2(this.$onStartGesture, this.$onGesture, this.$onEndGesture, continuation);
        stampsKt$detectStampGestures$2.L$0 = obj;
        return stampsKt$detectStampGestures$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((StampsKt$detectStampGestures$2) create((SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00af, code lost:
    
        if (r4 != r2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00f2, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x00af -> B:6:0x00b2). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        float touchSlop;
        Ref$LongRef ref$LongRef;
        Ref$IntRef ref$IntRef;
        float f;
        long j;
        float f2;
        int i;
        int i2;
        int i3;
        Ref$LongRef ref$LongRef2;
        float f3;
        float f4;
        float f5;
        Ref$IntRef ref$IntRef2;
        long j2;
        float f6;
        Object awaitPointerEvent;
        SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine;
        CoroutineSingletons coroutineSingletons;
        int i4;
        List<PointerInputChange> list;
        boolean z;
        Ref$LongRef ref$LongRef3;
        float f7;
        long j3;
        float f8;
        float f9;
        SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine2 = (SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) this.L$0;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = this.label;
        float f10 = RecyclerView.DECELERATION_RATE;
        float f11 = 1.0f;
        if (i5 == 0) {
            SafeTrace.throwOnFailure(obj);
            touchSlop = pointerEventHandlerCoroutine2.getViewConfiguration().getTouchSlop();
            ref$LongRef = new Ref$LongRef();
            ref$LongRef.element = 0L;
            ref$IntRef = new Ref$IntRef();
            this.L$0 = pointerEventHandlerCoroutine2;
            this.L$1 = ref$LongRef;
            this.L$2 = ref$IntRef;
            this.F$0 = RecyclerView.DECELERATION_RATE;
            this.F$1 = 1.0f;
            this.J$0 = 0L;
            this.I$0 = 0;
            this.F$2 = touchSlop;
            this.I$1 = 1;
            this.label = 1;
            if (TapGestureDetectorKt.awaitFirstDown$default(pointerEventHandlerCoroutine2, this, 2) != coroutineSingletons2) {
                f = 0.0f;
                j = 0;
                f2 = 1.0f;
                i = 1;
                i2 = 0;
            }
            return coroutineSingletons2;
        }
        if (i5 != 1) {
            if (i5 != 2) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$1;
            f4 = this.F$2;
            i3 = this.I$0;
            j2 = this.J$0;
            f3 = this.F$1;
            f5 = this.F$0;
            ref$IntRef2 = this.L$2;
            ref$LongRef2 = this.L$1;
            SafeTrace.throwOnFailure(obj);
            f6 = 0.0f;
            awaitPointerEvent = obj;
            PointerEvent pointerEvent = (PointerEvent) awaitPointerEvent;
            float f12 = f11;
            if (i != 0) {
                this.$onStartGesture.invoke(new Offset(Draggable2DKt.calculateCentroid(pointerEvent, true)));
                i = 0;
            }
            List list2 = pointerEvent.changes;
            List list3 = list2;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    if (((PointerInputChange) it.next()).isConsumed()) {
                        break;
                    }
                }
            }
            boolean z2 = false;
            if (z2) {
                pointerEventHandlerCoroutine = pointerEventHandlerCoroutine2;
                coroutineSingletons = coroutineSingletons2;
                i4 = i;
                list = list2;
                z = z2;
                ref$LongRef3 = ref$LongRef2;
                f7 = f4;
                j3 = 0;
            } else {
                float calculateZoom = Draggable2DKt.calculateZoom(pointerEvent);
                pointerEventHandlerCoroutine = pointerEventHandlerCoroutine2;
                float calculateRotation = Draggable2DKt.calculateRotation(pointerEvent);
                coroutineSingletons = coroutineSingletons2;
                i4 = i;
                long calculatePan = Draggable2DKt.calculatePan(pointerEvent);
                float f13 = f5;
                int size = list2.size();
                z = z2;
                f7 = f4;
                int i6 = 0;
                int i7 = 0;
                while (i7 < size) {
                    int i8 = size;
                    PointerInputChange pointerInputChange = (PointerInputChange) list2.get(i7);
                    List list4 = list2;
                    i6 += (pointerInputChange.previousPressed && pointerInputChange.pressed) ? 1 : 0;
                    i7++;
                    list2 = list4;
                    size = i8;
                }
                list = list2;
                if (i3 == 0) {
                    f3 *= calculateZoom;
                    f8 = f13 + calculateRotation;
                    j2 = Offset.m626plusMKHz9U(j2, calculatePan);
                    float calculateCentroidSize = Draggable2DKt.calculateCentroidSize(pointerEvent, false);
                    float abs = Math.abs(f12 - f3) * calculateCentroidSize;
                    float abs2 = Math.abs(((3.1415927f * f8) * calculateCentroidSize) / 180.0f);
                    float m623getDistanceimpl = Offset.m623getDistanceimpl(j2);
                    if (abs > f7 || abs2 > f7 || m623getDistanceimpl > f7) {
                        i3 = 1;
                    }
                } else {
                    f8 = f13;
                }
                if (i3 == 0) {
                    f9 = f8;
                } else {
                    if (calculateRotation == f6 && calculateZoom == f12) {
                        f9 = f8;
                        if (Offset.m622equalsimpl0(calculatePan, 0L)) {
                            for (PointerInputChange pointerInputChange2 : list) {
                                Ref$LongRef ref$LongRef4 = ref$LongRef2;
                                if (!Offset.m622equalsimpl0(PointerEventKt.positionChangeInternal(pointerInputChange2, false), 0L)) {
                                    ref$LongRef4.element = pointerInputChange2.position;
                                    ref$IntRef2.element = i6;
                                    pointerInputChange2.consume();
                                }
                                ref$LongRef2 = ref$LongRef4;
                            }
                        }
                    } else {
                        f9 = f8;
                    }
                    this.$onGesture.invoke(new Offset(calculatePan), new Float(calculateZoom), new Float(calculateRotation), new Offset(Draggable2DKt.calculateCentroid(pointerEvent, true)), new Integer(i6));
                    while (r1.hasNext()) {
                    }
                }
                ref$LongRef3 = ref$LongRef2;
                j3 = 0;
                f5 = f9;
            }
            if (!z) {
                List list5 = list;
                if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                    Iterator it2 = list5.iterator();
                    while (it2.hasNext()) {
                        if (((PointerInputChange) it2.next()).pressed) {
                            ref$LongRef2 = ref$LongRef3;
                            pointerEventHandlerCoroutine2 = pointerEventHandlerCoroutine;
                            f10 = f6;
                            f11 = f12;
                            coroutineSingletons2 = coroutineSingletons;
                            i = i4;
                            f4 = f7;
                            this.L$0 = pointerEventHandlerCoroutine2;
                            this.L$1 = ref$LongRef2;
                            this.L$2 = ref$IntRef2;
                            this.F$0 = f5;
                            this.F$1 = f3;
                            this.J$0 = j2;
                            this.I$0 = i3;
                            this.F$2 = f4;
                            this.I$1 = i;
                            f6 = f10;
                            this.label = 2;
                            awaitPointerEvent = pointerEventHandlerCoroutine2.awaitPointerEvent(PointerEventPass.Main, this);
                        }
                    }
                }
            }
            this.$onEndGesture.invoke(new Offset(ref$LongRef3.element), new Integer(ref$IntRef2.element));
            return Unit.INSTANCE;
        }
        i = this.I$1;
        touchSlop = this.F$2;
        i2 = this.I$0;
        j = this.J$0;
        f2 = this.F$1;
        f = this.F$0;
        ref$IntRef = this.L$2;
        ref$LongRef = this.L$1;
        SafeTrace.throwOnFailure(obj);
        float f14 = f2;
        i3 = i2;
        ref$LongRef2 = ref$LongRef;
        f3 = f14;
        long j4 = j;
        f4 = touchSlop;
        f5 = f;
        ref$IntRef2 = ref$IntRef;
        j2 = j4;
        this.L$0 = pointerEventHandlerCoroutine2;
        this.L$1 = ref$LongRef2;
        this.L$2 = ref$IntRef2;
        this.F$0 = f5;
        this.F$1 = f3;
        this.J$0 = j2;
        this.I$0 = i3;
        this.F$2 = f4;
        this.I$1 = i;
        f6 = f10;
        this.label = 2;
        awaitPointerEvent = pointerEventHandlerCoroutine2.awaitPointerEvent(PointerEventPass.Main, this);
    }
}

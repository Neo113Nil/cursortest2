package com.squareup.cash.payments.views.personalization;

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
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelResult;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class TransformableKt$transformable$3$block$1$1$1$1 extends RestrictedSuspendLambda implements Function2 {
    public final /* synthetic */ CoroutineScope $$this$coroutineScope;
    public final /* synthetic */ Channel $channel;
    public final /* synthetic */ Function1 $onGestureFailed;
    public final /* synthetic */ Function0 $onTap;
    public float F$0;
    public float F$1;
    public int I$0;
    public long J$0;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableKt$transformable$3$block$1$1$1$1(Channel channel, Function0 function0, CoroutineScope coroutineScope, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.$channel = channel;
        this.$onTap = function0;
        this.$$this$coroutineScope = coroutineScope;
        this.$onGestureFailed = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TransformableKt$transformable$3$block$1$1$1$1 transformableKt$transformable$3$block$1$1$1$1 = new TransformableKt$transformable$3$block$1$1$1$1(this.$channel, this.$onTap, this.$$this$coroutineScope, this.$onGestureFailed, continuation);
        transformableKt$transformable$3$block$1$1$1$1.L$0 = obj;
        return transformableKt$transformable$3$block$1$1$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TransformableKt$transformable$3$block$1$1$1$1) create((SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0227, code lost:
    
        if ((r0 instanceof kotlinx.coroutines.channels.ChannelResult.Failed) != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x022c, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a5 A[Catch: all -> 0x0034, CancellationException -> 0x0037, TryCatch #1 {CancellationException -> 0x0037, blocks: (B:7:0x0026, B:10:0x0092, B:12:0x00a5, B:18:0x00b9, B:20:0x00cb, B:22:0x00fe, B:24:0x010a, B:31:0x0136, B:34:0x0143, B:36:0x0150, B:37:0x0157, B:39:0x0161, B:41:0x0176, B:43:0x0179, B:48:0x0198, B:50:0x019e, B:52:0x01aa, B:54:0x01c2, B:56:0x01d9, B:58:0x01e3, B:60:0x01ed, B:65:0x0073, B:79:0x0116, B:81:0x0120, B:14:0x00b3, B:91:0x0049, B:95:0x0056), top: B:2:0x0018, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b9 A[Catch: all -> 0x0034, CancellationException -> 0x0037, TryCatch #1 {CancellationException -> 0x0037, blocks: (B:7:0x0026, B:10:0x0092, B:12:0x00a5, B:18:0x00b9, B:20:0x00cb, B:22:0x00fe, B:24:0x010a, B:31:0x0136, B:34:0x0143, B:36:0x0150, B:37:0x0157, B:39:0x0161, B:41:0x0176, B:43:0x0179, B:48:0x0198, B:50:0x019e, B:52:0x01aa, B:54:0x01c2, B:56:0x01d9, B:58:0x01e3, B:60:0x01ed, B:65:0x0073, B:79:0x0116, B:81:0x0120, B:14:0x00b3, B:91:0x0049, B:95:0x0056), top: B:2:0x0018, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0161 A[Catch: all -> 0x0034, CancellationException -> 0x0037, TryCatch #1 {CancellationException -> 0x0037, blocks: (B:7:0x0026, B:10:0x0092, B:12:0x00a5, B:18:0x00b9, B:20:0x00cb, B:22:0x00fe, B:24:0x010a, B:31:0x0136, B:34:0x0143, B:36:0x0150, B:37:0x0157, B:39:0x0161, B:41:0x0176, B:43:0x0179, B:48:0x0198, B:50:0x019e, B:52:0x01aa, B:54:0x01c2, B:56:0x01d9, B:58:0x01e3, B:60:0x01ed, B:65:0x0073, B:79:0x0116, B:81:0x0120, B:14:0x00b3, B:91:0x0049, B:95:0x0056), top: B:2:0x0018, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e3 A[Catch: all -> 0x0034, CancellationException -> 0x0037, TryCatch #1 {CancellationException -> 0x0037, blocks: (B:7:0x0026, B:10:0x0092, B:12:0x00a5, B:18:0x00b9, B:20:0x00cb, B:22:0x00fe, B:24:0x010a, B:31:0x0136, B:34:0x0143, B:36:0x0150, B:37:0x0157, B:39:0x0161, B:41:0x0176, B:43:0x0179, B:48:0x0198, B:50:0x019e, B:52:0x01aa, B:54:0x01c2, B:56:0x01d9, B:58:0x01e3, B:60:0x01ed, B:65:0x0073, B:79:0x0116, B:81:0x0120, B:14:0x00b3, B:91:0x0049, B:95:0x0056), top: B:2:0x0018, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0089 -> B:9:0x002f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        float f;
        float f2;
        int i;
        long j2;
        float f3;
        Object awaitPointerEvent;
        int i2;
        SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine;
        CoroutineSingletons coroutineSingletons;
        int i3;
        long j3;
        long j4;
        int size;
        int i4;
        TransformationState$TransformationStopped transformationState$TransformationStopped = TransformationState$TransformationStopped.INSTANCE;
        SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine2 = (SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) this.L$0;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = this.label;
        float f4 = RecyclerView.DECELERATION_RATE;
        float f5 = 1.0f;
        Function1 function1 = this.$onGestureFailed;
        Channel channel = this.$channel;
        int i6 = 0;
        try {
            try {
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = pointerEventHandlerCoroutine2;
                    this.F$0 = RecyclerView.DECELERATION_RATE;
                    this.F$1 = 1.0f;
                    this.J$0 = 0L;
                    this.I$0 = 0;
                    this.label = 1;
                    if (TapGestureDetectorKt.awaitFirstDown$default(pointerEventHandlerCoroutine2, this, 2) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                    j = 0;
                    f = 0.0f;
                    f2 = 1.0f;
                    i = 0;
                } else if (i5 == 1) {
                    int i7 = this.I$0;
                    long j5 = this.J$0;
                    float f6 = this.F$1;
                    float f7 = this.F$0;
                    SafeTrace.throwOnFailure(obj);
                    f = f7;
                    j = j5;
                    f2 = f6;
                    i = i7;
                } else {
                    if (i5 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i8 = this.I$0;
                    long j6 = this.J$0;
                    float f8 = this.F$1;
                    float f9 = this.F$0;
                    SafeTrace.throwOnFailure(obj);
                    awaitPointerEvent = obj;
                    long j7 = j6;
                    float f10 = f8;
                    float f11 = f4;
                    long j8 = j7;
                    PointerEvent pointerEvent = (PointerEvent) awaitPointerEvent;
                    List list = pointerEvent.changes;
                    float f12 = f5;
                    int size2 = list.size();
                    int i9 = i6;
                    while (true) {
                        if (i9 >= size2) {
                            i2 = i6;
                            break;
                        }
                        if (((PointerInputChange) list.get(i9)).isConsumed()) {
                            i2 = 1;
                            break;
                        }
                        i9++;
                    }
                    if (i2 != 0) {
                        float calculateZoom = Draggable2DKt.calculateZoom(pointerEvent);
                        float calculateRotation = Draggable2DKt.calculateRotation(pointerEvent);
                        coroutineSingletons = coroutineSingletons2;
                        i3 = i8;
                        long calculatePan = Draggable2DKt.calculatePan(pointerEvent);
                        if (i3 == 0) {
                            f10 *= calculateZoom;
                            f9 += calculateRotation;
                            j8 = Offset.m626plusMKHz9U(j8, calculatePan);
                            pointerEventHandlerCoroutine = pointerEventHandlerCoroutine2;
                            float calculateCentroidSize = Draggable2DKt.calculateCentroidSize(pointerEvent, false);
                            float abs = Math.abs(f12 - f10) * calculateCentroidSize;
                            float abs2 = Math.abs(((3.1415927f * f9) * calculateCentroidSize) / 180.0f);
                            float m623getDistanceimpl = Offset.m623getDistanceimpl(j8);
                            if (abs > pointerEventHandlerCoroutine.getViewConfiguration().getTouchSlop() || abs2 > pointerEventHandlerCoroutine.getViewConfiguration().getTouchSlop() || m623getDistanceimpl > pointerEventHandlerCoroutine.getViewConfiguration().getTouchSlop()) {
                                Object mo1159trySendJP2dKIU = channel.mo1159trySendJP2dKIU(TransformationState$TransformationStarted.INSTANCE);
                                if (mo1159trySendJP2dKIU instanceof ChannelResult.Failed) {
                                    function1.invoke(ChannelResult.m4190exceptionOrNullimpl(mo1159trySendJP2dKIU));
                                }
                                i3 = 1;
                            }
                        } else {
                            pointerEventHandlerCoroutine = pointerEventHandlerCoroutine2;
                        }
                        if (i3 == 0) {
                            j4 = j8;
                        } else {
                            if (calculateRotation == f11 && calculateZoom == f12) {
                                j4 = j8;
                                if (!Offset.m622equalsimpl0(calculatePan, 0L)) {
                                }
                                size = list.size();
                                i4 = 0;
                                while (i4 < size) {
                                    PointerInputChange pointerInputChange = (PointerInputChange) list.get(i4);
                                    int i10 = i4;
                                    if (!Offset.m622equalsimpl0(PointerEventKt.positionChangeInternal(pointerInputChange, false), 0L)) {
                                        pointerInputChange.consume();
                                    }
                                    i4 = i10 + 1;
                                }
                            } else {
                                j4 = j8;
                            }
                            Object mo1159trySendJP2dKIU2 = channel.mo1159trySendJP2dKIU(new TransformationState$TransformationOccurred(calculateZoom, calculateRotation, calculatePan));
                            if (mo1159trySendJP2dKIU2 instanceof ChannelResult.Failed) {
                                function1.invoke(ChannelResult.m4190exceptionOrNullimpl(mo1159trySendJP2dKIU2));
                            }
                            size = list.size();
                            i4 = 0;
                            while (i4 < size) {
                            }
                        }
                        float f13 = f10;
                        f3 = f9;
                        f2 = f13;
                        j8 = j4;
                    } else {
                        pointerEventHandlerCoroutine = pointerEventHandlerCoroutine2;
                        coroutineSingletons = coroutineSingletons2;
                        i3 = i8;
                        float f14 = f10;
                        f3 = f9;
                        f2 = f14;
                    }
                    if (CollectionsKt.firstOrNull(list) == null && PointerEventKt.changedToUp((PointerInputChange) CollectionsKt.first(list))) {
                        j3 = j8;
                        if (Offset.m622equalsimpl0(((PointerInputChange) CollectionsKt.first(list)).position, ((PointerInputChange) CollectionsKt.first(list)).previousPosition) && ((PointerInputChange) CollectionsKt.first(list)).uptimeMillis - ((PointerInputChange) CollectionsKt.first(list)).previousUptimeMillis > 15) {
                            this.$onTap.invoke();
                        }
                    } else {
                        j3 = j8;
                    }
                    if (i2 == 0) {
                        int size3 = list.size();
                        for (int i11 = 0; i11 < size3; i11++) {
                            if (((PointerInputChange) list.get(i11)).pressed) {
                                f4 = f11;
                                f5 = f12;
                                coroutineSingletons2 = coroutineSingletons;
                                i = i3;
                                pointerEventHandlerCoroutine2 = pointerEventHandlerCoroutine;
                                j2 = j3;
                                i6 = 0;
                                this.L$0 = pointerEventHandlerCoroutine2;
                                this.F$0 = f3;
                                this.F$1 = f2;
                                this.J$0 = j2;
                                this.I$0 = i;
                                this.label = 2;
                                awaitPointerEvent = pointerEventHandlerCoroutine2.awaitPointerEvent(PointerEventPass.Main, this);
                                if (awaitPointerEvent != coroutineSingletons2) {
                                    float f15 = f3;
                                    f10 = f2;
                                    f9 = f15;
                                    j7 = j2;
                                    i8 = i;
                                    float f112 = f4;
                                    long j82 = j7;
                                    PointerEvent pointerEvent2 = (PointerEvent) awaitPointerEvent;
                                    List list2 = pointerEvent2.changes;
                                    float f122 = f5;
                                    int size22 = list2.size();
                                    int i92 = i6;
                                    while (true) {
                                        if (i92 >= size22) {
                                        }
                                        i92++;
                                    }
                                    if (i2 != 0) {
                                    }
                                    if (CollectionsKt.firstOrNull(list2) == null) {
                                    }
                                    j3 = j82;
                                    if (i2 == 0) {
                                    }
                                }
                                return coroutineSingletons2;
                            }
                        }
                    }
                }
                j2 = j;
                f3 = f;
                this.L$0 = pointerEventHandlerCoroutine2;
                this.F$0 = f3;
                this.F$1 = f2;
                this.J$0 = j2;
                this.I$0 = i;
                this.label = 2;
                awaitPointerEvent = pointerEventHandlerCoroutine2.awaitPointerEvent(PointerEventPass.Main, this);
                if (awaitPointerEvent != coroutineSingletons2) {
                }
                return coroutineSingletons2;
            } catch (CancellationException e) {
                if (!JobKt.isActive(this.$$this$coroutineScope)) {
                    throw e;
                }
                Object mo1159trySendJP2dKIU3 = channel.mo1159trySendJP2dKIU(transformationState$TransformationStopped);
            }
        } finally {
            Object mo1159trySendJP2dKIU4 = channel.mo1159trySendJP2dKIU(transformationState$TransformationStopped);
            if (mo1159trySendJP2dKIU4 instanceof ChannelResult.Failed) {
                function1.invoke(ChannelResult.m4190exceptionOrNullimpl(mo1159trySendJP2dKIU4));
            }
        }
    }
}

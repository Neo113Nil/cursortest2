package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.input.pointer.util.VelocityTrackerKt;
import androidx.compose.ui.unit.Velocity;
import com.appsflyer.AppsFlyerProperties;
import com.facebook.internal.ServerProtocol;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.SendChannel;

/* compiled from: Draggable.kt */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u001a!\u0010\b\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0002\u0010\t\u001aR\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b*\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0082@¢\u0006\u0002\u0010\u0017\u001aY\u0010\u0018\u001a\u00020\u0010*\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u00102\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001aÉ\u0001\u0010\"\u001a\u00020#*\u00020#2\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020\u00102\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\b\b\u0002\u0010\u0011\u001a\u00020\u00102>\b\u0002\u0010*\u001a8\b\u0001\u0012\u0004\u0012\u00020,\u0012\u0013\u0012\u00110\r¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000700\u0012\u0006\u0012\u0004\u0018\u0001010+¢\u0006\u0002\b22>\b\u0002\u00103\u001a8\b\u0001\u0012\u0004\u0012\u00020,\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(4\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000700\u0012\u0006\u0012\u0004\u0018\u0001010+¢\u0006\u0002\b22\b\b\u0002\u0010\u001e\u001a\u00020\u0010¢\u0006\u0002\u00105\u001aG\u00106\u001a\u00020\u0010*\u00020\u000e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u00052\u0006\u00107\u001a\u0002082\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b:\u0010;\u001a\u001e\u0010<\u001a\u00020\u0006*\u00020\r2\u0006\u0010%\u001a\u00020&H\u0002ø\u0001\u0000¢\u0006\u0004\b=\u0010>\u001a\u001e\u0010<\u001a\u00020\u0006*\u00020?2\u0006\u0010%\u001a\u00020&H\u0002ø\u0001\u0000¢\u0006\u0004\b@\u0010>\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006A"}, d2 = {"NoOpDragScope", "Landroidx/compose/foundation/gestures/DragScope;", "DraggableState", "Landroidx/compose/foundation/gestures/DraggableState;", "onDelta", "Lkotlin/Function1;", "", "", "rememberDraggableState", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/DraggableState;", "awaitDownAndSlop", "Lkotlin/Pair;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "canDrag", "", "startDragImmediately", "Lkotlin/Function0;", "velocityTracker", "Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "pointerDirectionConfig", "Landroidx/compose/foundation/gestures/PointerDirectionConfig;", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/input/pointer/util/VelocityTracker;Landroidx/compose/foundation/gestures/PointerDirectionConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitDrag", "startEvent", "initialDelta", AppsFlyerProperties.CHANNEL, "Lkotlinx/coroutines/channels/SendChannel;", "Landroidx/compose/foundation/gestures/DragEvent;", "reverseDirection", "hasDragged", "awaitDrag-Su4bsnU", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerInputChange;JLandroidx/compose/ui/input/pointer/util/VelocityTracker;Lkotlinx/coroutines/channels/SendChannel;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "draggable", "Landroidx/compose/ui/Modifier;", ServerProtocol.DIALOG_PARAM_STATE, "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "onDragStarted", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/ParameterName;", "name", "startedPosition", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "onDragStopped", "velocity", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Z)Landroidx/compose/ui/Modifier;", "onDragOrUp", "pointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "onDrag", "onDragOrUp-Axegvzg", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/jvm/functions/Function1;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toFloat", "toFloat-3MmeM6k", "(JLandroidx/compose/foundation/gestures/Orientation;)F", "Landroidx/compose/ui/unit/Velocity;", "toFloat-sF-c-tU", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DraggableKt {
    private static final DragScope NoOpDragScope = new DragScope() { // from class: androidx.compose.foundation.gestures.DraggableKt$NoOpDragScope$1
        @Override // androidx.compose.foundation.gestures.DragScope
        public void dragBy(float pixels) {
        }
    };

    public static final DraggableState DraggableState(Function1<? super Float, Unit> function1) {
        return new DefaultDraggableState(function1);
    }

    public static final DraggableState rememberDraggableState(Function1<? super Float, Unit> function1, Composer composer, int i) {
        composer.startReplaceableGroup(-183245213);
        ComposerKt.sourceInformation(composer, "C(rememberDraggableState)142@6209L29,143@6250L61:Draggable.kt#8bwon0");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-183245213, i, -1, "androidx.compose.foundation.gestures.rememberDraggableState (Draggable.kt:141)");
        }
        final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composer, i & 14);
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = DraggableState(new Function1<Float, Unit>() { // from class: androidx.compose.foundation.gestures.DraggableKt$rememberDraggableState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                    invoke(f.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(float f) {
                    rememberUpdatedState.getValue().invoke(Float.valueOf(f));
                }
            });
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DraggableState draggableState = (DraggableState) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return draggableState;
    }

    public static final Modifier draggable(Modifier modifier, DraggableState draggableState, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, final boolean z2, Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, Function3<? super CoroutineScope, ? super Float, ? super Continuation<? super Unit>, ? extends Object> function32, boolean z3) {
        return modifier.then(new DraggableElement(draggableState, new Function1<PointerInputChange, Boolean>() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$3
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(PointerInputChange pointerInputChange) {
                return true;
            }
        }, orientation, z, mutableInteractionSource, new Function0<Boolean>() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(z2);
            }
        }, function3, new DraggableKt$draggable$5(function32, orientation, null), z3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x028b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0190 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0204 -> B:22:0x0178). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x024e -> B:13:0x0257). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x028d -> B:22:0x0178). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitDownAndSlop(AwaitPointerEventScope awaitPointerEventScope, Function1<? super PointerInputChange, Boolean> function1, Function0<Boolean> function0, VelocityTracker velocityTracker, PointerDirectionConfig pointerDirectionConfig, Continuation<? super Pair<PointerInputChange, Offset>> continuation) {
        DraggableKt$awaitDownAndSlop$1 draggableKt$awaitDownAndSlop$1;
        int i;
        Function0<Boolean> function02;
        AwaitPointerEventScope awaitPointerEventScope2;
        PointerDirectionConfig pointerDirectionConfig2;
        Function1<? super PointerInputChange, Boolean> function12;
        final VelocityTracker velocityTracker2;
        PointerInputChange pointerInputChange;
        AwaitPointerEventScope awaitPointerEventScope3;
        final Ref.LongRef longRef;
        Function2<PointerInputChange, Offset, Unit> function2;
        long id;
        float m351pointerSlopE8SPZFQ;
        Ref.LongRef longRef2;
        long m3182getZeroF1C5BW0;
        PointerInputChange pointerInputChange2;
        DraggableKt$awaitDownAndSlop$1 draggableKt$awaitDownAndSlop$12;
        long j;
        Ref.LongRef longRef3;
        Ref.LongRef longRef4;
        float f;
        int size;
        AwaitPointerEventScope awaitPointerEventScope4;
        PointerInputChange pointerInputChange3;
        PointerInputChange pointerInputChange4;
        int i2;
        Object awaitPointerEvent$default;
        if (continuation instanceof DraggableKt$awaitDownAndSlop$1) {
            draggableKt$awaitDownAndSlop$1 = (DraggableKt$awaitDownAndSlop$1) continuation;
            if ((draggableKt$awaitDownAndSlop$1.label & Integer.MIN_VALUE) != 0) {
                draggableKt$awaitDownAndSlop$1.label -= Integer.MIN_VALUE;
                Object obj = draggableKt$awaitDownAndSlop$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = draggableKt$awaitDownAndSlop$1.label;
                int i3 = 3;
                int i4 = 0;
                int i5 = 1;
                PointerEventPass pointerEventPass = null;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    PointerEventPass pointerEventPass2 = PointerEventPass.Initial;
                    draggableKt$awaitDownAndSlop$1.L$0 = awaitPointerEventScope;
                    draggableKt$awaitDownAndSlop$1.L$1 = function1;
                    function02 = function0;
                    draggableKt$awaitDownAndSlop$1.L$2 = function02;
                    draggableKt$awaitDownAndSlop$1.L$3 = velocityTracker;
                    draggableKt$awaitDownAndSlop$1.L$4 = pointerDirectionConfig;
                    draggableKt$awaitDownAndSlop$1.label = 1;
                    obj = TapGestureDetectorKt.awaitFirstDown(awaitPointerEventScope, false, pointerEventPass2, draggableKt$awaitDownAndSlop$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    pointerDirectionConfig2 = pointerDirectionConfig;
                    function12 = function1;
                    velocityTracker2 = velocityTracker;
                } else if (i == 1) {
                    pointerDirectionConfig2 = (PointerDirectionConfig) draggableKt$awaitDownAndSlop$1.L$4;
                    velocityTracker2 = (VelocityTracker) draggableKt$awaitDownAndSlop$1.L$3;
                    function02 = (Function0) draggableKt$awaitDownAndSlop$1.L$2;
                    function12 = (Function1) draggableKt$awaitDownAndSlop$1.L$1;
                    awaitPointerEventScope2 = (AwaitPointerEventScope) draggableKt$awaitDownAndSlop$1.L$0;
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    pointerDirectionConfig2 = (PointerDirectionConfig) draggableKt$awaitDownAndSlop$1.L$2;
                    velocityTracker2 = (VelocityTracker) draggableKt$awaitDownAndSlop$1.L$1;
                    awaitPointerEventScope3 = (AwaitPointerEventScope) draggableKt$awaitDownAndSlop$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    PointerInputChange pointerInputChange5 = (PointerInputChange) obj;
                    VelocityTrackerKt.addPointerInputChange(velocityTracker2, pointerInputChange5);
                    longRef = new Ref.LongRef();
                    longRef.element = Offset.INSTANCE.m3182getZeroF1C5BW0();
                    function2 = new Function2<PointerInputChange, Offset, Unit>() { // from class: androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$postPointerSlop$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange6, Offset offset) {
                            m370invokeUv8p0NA(pointerInputChange6, offset.getPackedValue());
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
                        public final void m370invokeUv8p0NA(PointerInputChange pointerInputChange6, long j2) {
                            VelocityTrackerKt.addPointerInputChange(VelocityTracker.this, pointerInputChange6);
                            pointerInputChange6.consume();
                            longRef.element = j2;
                        }
                    };
                    id = pointerInputChange5.getId();
                    int type = pointerInputChange5.getType();
                    if (DragGestureDetectorKt.m350isPointerUpDmW0f2w(awaitPointerEventScope3.getCurrentEvent(), id)) {
                        m351pointerSlopE8SPZFQ = DragGestureDetectorKt.m351pointerSlopE8SPZFQ(awaitPointerEventScope3.getViewConfiguration(), type);
                        longRef2 = new Ref.LongRef();
                        longRef2.element = id;
                        m3182getZeroF1C5BW0 = Offset.INSTANCE.m3182getZeroF1C5BW0();
                        draggableKt$awaitDownAndSlop$1.L$0 = pointerDirectionConfig2;
                        draggableKt$awaitDownAndSlop$1.L$1 = longRef;
                        draggableKt$awaitDownAndSlop$1.L$2 = function2;
                        draggableKt$awaitDownAndSlop$1.L$3 = awaitPointerEventScope3;
                        draggableKt$awaitDownAndSlop$1.L$4 = longRef2;
                        draggableKt$awaitDownAndSlop$1.L$5 = pointerEventPass;
                        draggableKt$awaitDownAndSlop$1.F$0 = m351pointerSlopE8SPZFQ;
                        draggableKt$awaitDownAndSlop$1.J$0 = m3182getZeroF1C5BW0;
                        draggableKt$awaitDownAndSlop$1.label = i3;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, draggableKt$awaitDownAndSlop$1, i5, pointerEventPass);
                        if (awaitPointerEvent$default != coroutine_suspended) {
                        }
                    } else {
                        pointerInputChange2 = null;
                        if (pointerInputChange2 == null) {
                        }
                    }
                } else if (i == 3) {
                    long j2 = draggableKt$awaitDownAndSlop$1.J$0;
                    float f2 = draggableKt$awaitDownAndSlop$1.F$0;
                    longRef4 = (Ref.LongRef) draggableKt$awaitDownAndSlop$1.L$4;
                    AwaitPointerEventScope awaitPointerEventScope5 = (AwaitPointerEventScope) draggableKt$awaitDownAndSlop$1.L$3;
                    Function2<PointerInputChange, Offset, Unit> function22 = (Function2) draggableKt$awaitDownAndSlop$1.L$2;
                    longRef3 = (Ref.LongRef) draggableKt$awaitDownAndSlop$1.L$1;
                    PointerDirectionConfig pointerDirectionConfig3 = (PointerDirectionConfig) draggableKt$awaitDownAndSlop$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    draggableKt$awaitDownAndSlop$12 = draggableKt$awaitDownAndSlop$1;
                    f = f2;
                    pointerDirectionConfig2 = pointerDirectionConfig3;
                    j = j2;
                    awaitPointerEventScope3 = awaitPointerEventScope5;
                    function2 = function22;
                    DraggableKt$awaitDownAndSlop$1 draggableKt$awaitDownAndSlop$13 = draggableKt$awaitDownAndSlop$12;
                    PointerEvent pointerEvent = (PointerEvent) obj;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    size = changes.size();
                    while (true) {
                        if (i4 < size) {
                        }
                        i4++;
                        size = i2;
                        awaitPointerEventScope3 = awaitPointerEventScope4;
                    }
                    pointerInputChange2 = pointerInputChange3;
                    if (pointerInputChange2 != null) {
                        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                        }
                        draggableKt$awaitDownAndSlop$1.L$0 = pointerDirectionConfig2;
                        draggableKt$awaitDownAndSlop$1.L$1 = longRef;
                        draggableKt$awaitDownAndSlop$1.L$2 = function2;
                        draggableKt$awaitDownAndSlop$1.L$3 = awaitPointerEventScope3;
                        draggableKt$awaitDownAndSlop$1.L$4 = longRef2;
                        draggableKt$awaitDownAndSlop$1.L$5 = pointerEventPass;
                        draggableKt$awaitDownAndSlop$1.F$0 = m351pointerSlopE8SPZFQ;
                        draggableKt$awaitDownAndSlop$1.J$0 = m3182getZeroF1C5BW0;
                        draggableKt$awaitDownAndSlop$1.label = i3;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, draggableKt$awaitDownAndSlop$1, i5, pointerEventPass);
                        if (awaitPointerEvent$default != coroutine_suspended) {
                        }
                    }
                    longRef = longRef3;
                    pointerInputChange2 = null;
                    if (pointerInputChange2 == null) {
                    }
                } else {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j3 = draggableKt$awaitDownAndSlop$1.J$0;
                    float f3 = draggableKt$awaitDownAndSlop$1.F$0;
                    PointerInputChange pointerInputChange6 = (PointerInputChange) draggableKt$awaitDownAndSlop$1.L$5;
                    Ref.LongRef longRef5 = (Ref.LongRef) draggableKt$awaitDownAndSlop$1.L$4;
                    AwaitPointerEventScope awaitPointerEventScope6 = (AwaitPointerEventScope) draggableKt$awaitDownAndSlop$1.L$3;
                    Function2<PointerInputChange, Offset, Unit> function23 = (Function2) draggableKt$awaitDownAndSlop$1.L$2;
                    Ref.LongRef longRef6 = (Ref.LongRef) draggableKt$awaitDownAndSlop$1.L$1;
                    PointerDirectionConfig pointerDirectionConfig4 = (PointerDirectionConfig) draggableKt$awaitDownAndSlop$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    m351pointerSlopE8SPZFQ = f3;
                    pointerDirectionConfig2 = pointerDirectionConfig4;
                    long j4 = j3;
                    awaitPointerEventScope3 = awaitPointerEventScope6;
                    function2 = function23;
                    longRef3 = longRef6;
                    if (!pointerInputChange6.isConsumed()) {
                        longRef2 = longRef5;
                        longRef = longRef3;
                        i3 = 3;
                        pointerEventPass = null;
                        m3182getZeroF1C5BW0 = j4;
                        i4 = 0;
                        i5 = 1;
                        draggableKt$awaitDownAndSlop$1.L$0 = pointerDirectionConfig2;
                        draggableKt$awaitDownAndSlop$1.L$1 = longRef;
                        draggableKt$awaitDownAndSlop$1.L$2 = function2;
                        draggableKt$awaitDownAndSlop$1.L$3 = awaitPointerEventScope3;
                        draggableKt$awaitDownAndSlop$1.L$4 = longRef2;
                        draggableKt$awaitDownAndSlop$1.L$5 = pointerEventPass;
                        draggableKt$awaitDownAndSlop$1.F$0 = m351pointerSlopE8SPZFQ;
                        draggableKt$awaitDownAndSlop$1.J$0 = m3182getZeroF1C5BW0;
                        draggableKt$awaitDownAndSlop$1.label = i3;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, draggableKt$awaitDownAndSlop$1, i5, pointerEventPass);
                        if (awaitPointerEvent$default != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        draggableKt$awaitDownAndSlop$12 = draggableKt$awaitDownAndSlop$1;
                        f = m351pointerSlopE8SPZFQ;
                        obj = awaitPointerEvent$default;
                        j = m3182getZeroF1C5BW0;
                        longRef3 = longRef;
                        longRef4 = longRef2;
                        DraggableKt$awaitDownAndSlop$1 draggableKt$awaitDownAndSlop$132 = draggableKt$awaitDownAndSlop$12;
                        PointerEvent pointerEvent2 = (PointerEvent) obj;
                        List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                        size = changes2.size();
                        while (true) {
                            if (i4 < size) {
                                awaitPointerEventScope4 = awaitPointerEventScope3;
                                pointerInputChange3 = null;
                                break;
                            }
                            pointerInputChange3 = changes2.get(i4);
                            awaitPointerEventScope4 = awaitPointerEventScope3;
                            i2 = size;
                            if (PointerId.m4534equalsimpl0(pointerInputChange3.getId(), longRef4.element)) {
                                break;
                            }
                            i4++;
                            size = i2;
                            awaitPointerEventScope3 = awaitPointerEventScope4;
                        }
                        pointerInputChange2 = pointerInputChange3;
                        if (pointerInputChange2 != null && !pointerInputChange2.isConsumed()) {
                            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                                Ref.LongRef longRef7 = longRef4;
                                long m3171plusMKHz9U = Offset.m3171plusMKHz9U(j, Offset.m3170minusMKHz9U(pointerInputChange2.getPosition(), pointerInputChange2.getPreviousPosition()));
                                if (pointerDirectionConfig2.mo353calculateDeltaChangek4lQ0M(m3171plusMKHz9U) < f) {
                                    PointerEventPass pointerEventPass3 = PointerEventPass.Final;
                                    draggableKt$awaitDownAndSlop$132.L$0 = pointerDirectionConfig2;
                                    draggableKt$awaitDownAndSlop$132.L$1 = longRef3;
                                    draggableKt$awaitDownAndSlop$132.L$2 = function2;
                                    AwaitPointerEventScope awaitPointerEventScope7 = awaitPointerEventScope4;
                                    draggableKt$awaitDownAndSlop$132.L$3 = awaitPointerEventScope7;
                                    draggableKt$awaitDownAndSlop$132.L$4 = longRef7;
                                    draggableKt$awaitDownAndSlop$132.L$5 = pointerInputChange2;
                                    draggableKt$awaitDownAndSlop$132.F$0 = f;
                                    draggableKt$awaitDownAndSlop$132.J$0 = m3171plusMKHz9U;
                                    draggableKt$awaitDownAndSlop$132.label = 4;
                                    if (awaitPointerEventScope7.awaitPointerEvent(pointerEventPass3, draggableKt$awaitDownAndSlop$132) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    longRef5 = longRef7;
                                    m351pointerSlopE8SPZFQ = f;
                                    draggableKt$awaitDownAndSlop$1 = draggableKt$awaitDownAndSlop$132;
                                    pointerInputChange6 = pointerInputChange2;
                                    awaitPointerEventScope3 = awaitPointerEventScope7;
                                    j4 = m3171plusMKHz9U;
                                    if (!pointerInputChange6.isConsumed()) {
                                    }
                                } else {
                                    AwaitPointerEventScope awaitPointerEventScope8 = awaitPointerEventScope4;
                                    function2.invoke(pointerInputChange2, Offset.m3155boximpl(pointerDirectionConfig2.mo354calculatePostSlopOffset8S9VItk(m3171plusMKHz9U, f)));
                                    if (pointerInputChange2.isConsumed()) {
                                        longRef = longRef3;
                                        if (pointerInputChange2 == null) {
                                            return TuplesKt.to(pointerInputChange2, Offset.m3155boximpl(longRef.element));
                                        }
                                        return null;
                                    }
                                    longRef = longRef3;
                                    i4 = 0;
                                    pointerEventPass = null;
                                    m3182getZeroF1C5BW0 = Offset.INSTANCE.m3182getZeroF1C5BW0();
                                    awaitPointerEventScope3 = awaitPointerEventScope8;
                                    i3 = 3;
                                    i5 = 1;
                                    longRef2 = longRef7;
                                    m351pointerSlopE8SPZFQ = f;
                                    draggableKt$awaitDownAndSlop$1 = draggableKt$awaitDownAndSlop$132;
                                }
                            } else {
                                List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                                int size2 = changes3.size();
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= size2) {
                                        pointerInputChange4 = null;
                                        break;
                                    }
                                    pointerInputChange4 = changes3.get(i6);
                                    if (pointerInputChange4.getPressed()) {
                                        break;
                                    }
                                    i6++;
                                }
                                PointerInputChange pointerInputChange7 = pointerInputChange4;
                                if (pointerInputChange7 != null) {
                                    longRef4.element = pointerInputChange7.getId();
                                    m351pointerSlopE8SPZFQ = f;
                                    draggableKt$awaitDownAndSlop$1 = draggableKt$awaitDownAndSlop$132;
                                    longRef2 = longRef4;
                                    longRef = longRef3;
                                    m3182getZeroF1C5BW0 = j;
                                    awaitPointerEventScope3 = awaitPointerEventScope4;
                                    i3 = 3;
                                    i4 = 0;
                                    i5 = 1;
                                    pointerEventPass = null;
                                }
                            }
                            draggableKt$awaitDownAndSlop$1.L$0 = pointerDirectionConfig2;
                            draggableKt$awaitDownAndSlop$1.L$1 = longRef;
                            draggableKt$awaitDownAndSlop$1.L$2 = function2;
                            draggableKt$awaitDownAndSlop$1.L$3 = awaitPointerEventScope3;
                            draggableKt$awaitDownAndSlop$1.L$4 = longRef2;
                            draggableKt$awaitDownAndSlop$1.L$5 = pointerEventPass;
                            draggableKt$awaitDownAndSlop$1.F$0 = m351pointerSlopE8SPZFQ;
                            draggableKt$awaitDownAndSlop$1.J$0 = m3182getZeroF1C5BW0;
                            draggableKt$awaitDownAndSlop$1.label = i3;
                            awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, draggableKt$awaitDownAndSlop$1, i5, pointerEventPass);
                            if (awaitPointerEvent$default != coroutine_suspended) {
                            }
                        }
                    }
                    longRef = longRef3;
                    pointerInputChange2 = null;
                    if (pointerInputChange2 == null) {
                    }
                }
                pointerInputChange = (PointerInputChange) obj;
                if (function12.invoke(pointerInputChange).booleanValue()) {
                    return null;
                }
                if (function02.invoke().booleanValue()) {
                    pointerInputChange.consume();
                    VelocityTrackerKt.addPointerInputChange(velocityTracker2, pointerInputChange);
                    return TuplesKt.to(pointerInputChange, Offset.m3155boximpl(Offset.INSTANCE.m3182getZeroF1C5BW0()));
                }
                draggableKt$awaitDownAndSlop$1.L$0 = awaitPointerEventScope2;
                draggableKt$awaitDownAndSlop$1.L$1 = velocityTracker2;
                draggableKt$awaitDownAndSlop$1.L$2 = pointerDirectionConfig2;
                draggableKt$awaitDownAndSlop$1.L$3 = null;
                draggableKt$awaitDownAndSlop$1.L$4 = null;
                draggableKt$awaitDownAndSlop$1.label = 2;
                obj = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope2, false, null, draggableKt$awaitDownAndSlop$1, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                awaitPointerEventScope3 = awaitPointerEventScope2;
                PointerInputChange pointerInputChange52 = (PointerInputChange) obj;
                VelocityTrackerKt.addPointerInputChange(velocityTracker2, pointerInputChange52);
                longRef = new Ref.LongRef();
                longRef.element = Offset.INSTANCE.m3182getZeroF1C5BW0();
                function2 = new Function2<PointerInputChange, Offset, Unit>() { // from class: androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$postPointerSlop$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange62, Offset offset) {
                        m370invokeUv8p0NA(pointerInputChange62, offset.getPackedValue());
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
                    public final void m370invokeUv8p0NA(PointerInputChange pointerInputChange62, long j22) {
                        VelocityTrackerKt.addPointerInputChange(VelocityTracker.this, pointerInputChange62);
                        pointerInputChange62.consume();
                        longRef.element = j22;
                    }
                };
                id = pointerInputChange52.getId();
                int type2 = pointerInputChange52.getType();
                if (DragGestureDetectorKt.m350isPointerUpDmW0f2w(awaitPointerEventScope3.getCurrentEvent(), id)) {
                }
            }
        }
        draggableKt$awaitDownAndSlop$1 = new DraggableKt$awaitDownAndSlop$1(continuation);
        Object obj2 = draggableKt$awaitDownAndSlop$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = draggableKt$awaitDownAndSlop$1.label;
        int i32 = 3;
        int i42 = 0;
        int i52 = 1;
        PointerEventPass pointerEventPass4 = null;
        if (i != 0) {
        }
        pointerInputChange = (PointerInputChange) obj2;
        if (function12.invoke(pointerInputChange).booleanValue()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: awaitDrag-Su4bsnU, reason: not valid java name */
    public static final Object m366awaitDragSu4bsnU(AwaitPointerEventScope awaitPointerEventScope, PointerInputChange pointerInputChange, long j, final VelocityTracker velocityTracker, final SendChannel<? super DragEvent> sendChannel, final boolean z, Function1<? super PointerInputChange, Boolean> function1, Continuation<? super Boolean> continuation) {
        sendChannel.mo7744trySendJP2dKIU(new DragEvent.DragStarted(Offset.m3170minusMKHz9U(pointerInputChange.getPosition(), OffsetKt.Offset(Offset.m3166getXimpl(j) * Math.signum(Offset.m3166getXimpl(pointerInputChange.getPosition())), Offset.m3167getYimpl(j) * Math.signum(Offset.m3167getYimpl(pointerInputChange.getPosition())))), null));
        sendChannel.mo7744trySendJP2dKIU(new DragEvent.DragDelta(z ? Offset.m3173timestuRUvjQ(j, -1.0f) : j, null));
        return m367onDragOrUpAxegvzg(awaitPointerEventScope, function1, pointerInputChange.getId(), new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.foundation.gestures.DraggableKt$awaitDrag$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange2) {
                invoke2(pointerInputChange2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PointerInputChange pointerInputChange2) {
                VelocityTrackerKt.addPointerInputChange(VelocityTracker.this, pointerInputChange2);
                if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                    return;
                }
                long positionChange = PointerEventKt.positionChange(pointerInputChange2);
                pointerInputChange2.consume();
                SendChannel<DragEvent> sendChannel2 = sendChannel;
                if (z) {
                    positionChange = Offset.m3173timestuRUvjQ(positionChange, -1.0f);
                }
                sendChannel2.mo7744trySendJP2dKIU(new DragEvent.DragDelta(positionChange, null));
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f8, code lost:
    
        if (r1.invoke(r14).booleanValue() != false) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0087 -> B:10:0x008c). Please report as a decompilation issue!!! */
    /* renamed from: onDragOrUp-Axegvzg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m367onDragOrUpAxegvzg(AwaitPointerEventScope awaitPointerEventScope, Function1<? super PointerInputChange, Boolean> function1, long j, Function1<? super PointerInputChange, Unit> function12, Continuation<? super Boolean> continuation) {
        DraggableKt$onDragOrUp$1 draggableKt$onDragOrUp$1;
        int i;
        long j2;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function1<? super PointerInputChange, Unit> function13;
        DraggableKt$onDragOrUp$1 draggableKt$onDragOrUp$12;
        Function1<? super PointerInputChange, Boolean> function14;
        PointerInputChange pointerInputChange;
        Ref.LongRef longRef;
        AwaitPointerEventScope awaitPointerEventScope3;
        Object awaitPointerEvent$default;
        Unit unit;
        AwaitPointerEventScope awaitPointerEventScope4;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        if (continuation instanceof DraggableKt$onDragOrUp$1) {
            draggableKt$onDragOrUp$1 = (DraggableKt$onDragOrUp$1) continuation;
            if ((draggableKt$onDragOrUp$1.label & Integer.MIN_VALUE) != 0) {
                draggableKt$onDragOrUp$1.label -= Integer.MIN_VALUE;
                Object obj = draggableKt$onDragOrUp$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = draggableKt$onDragOrUp$1.label;
                int i2 = 1;
                PointerEventPass pointerEventPass = null;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Ref.LongRef longRef2 = (Ref.LongRef) draggableKt$onDragOrUp$1.L$4;
                    awaitPointerEventScope3 = (AwaitPointerEventScope) draggableKt$onDragOrUp$1.L$3;
                    AwaitPointerEventScope awaitPointerEventScope5 = (AwaitPointerEventScope) draggableKt$onDragOrUp$1.L$2;
                    Function1<? super PointerInputChange, Unit> function15 = (Function1) draggableKt$onDragOrUp$1.L$1;
                    Function1<? super PointerInputChange, Boolean> function16 = (Function1) draggableKt$onDragOrUp$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    draggableKt$onDragOrUp$12 = draggableKt$onDragOrUp$1;
                    function14 = function16;
                    longRef = longRef2;
                    function13 = function15;
                    PointerEvent pointerEvent = (PointerEvent) obj;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    int size = changes.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            awaitPointerEventScope4 = awaitPointerEventScope3;
                            pointerInputChange2 = null;
                            break;
                        }
                        pointerInputChange2 = changes.get(i3);
                        awaitPointerEventScope4 = awaitPointerEventScope3;
                        if (PointerId.m4534equalsimpl0(pointerInputChange2.getId(), longRef.element)) {
                            break;
                        }
                        i3++;
                        awaitPointerEventScope3 = awaitPointerEventScope4;
                    }
                    pointerInputChange = pointerInputChange2;
                    if (pointerInputChange == null) {
                        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                            List<PointerInputChange> changes2 = pointerEvent.getChanges();
                            int size2 = changes2.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 >= size2) {
                                    pointerInputChange3 = null;
                                    break;
                                }
                                pointerInputChange3 = changes2.get(i4);
                                if (pointerInputChange3.getPressed()) {
                                    break;
                                }
                                i4++;
                            }
                            PointerInputChange pointerInputChange4 = pointerInputChange3;
                            if (pointerInputChange4 != null) {
                                longRef.element = pointerInputChange4.getId();
                                awaitPointerEventScope3 = awaitPointerEventScope4;
                                awaitPointerEventScope2 = awaitPointerEventScope5;
                                i2 = 1;
                                pointerEventPass = null;
                                draggableKt$onDragOrUp$12.L$0 = function14;
                                draggableKt$onDragOrUp$12.L$1 = function13;
                                draggableKt$onDragOrUp$12.L$2 = awaitPointerEventScope2;
                                draggableKt$onDragOrUp$12.L$3 = awaitPointerEventScope3;
                                draggableKt$onDragOrUp$12.L$4 = longRef;
                                draggableKt$onDragOrUp$12.label = i2;
                                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, draggableKt$onDragOrUp$12, i2, pointerEventPass);
                                if (awaitPointerEvent$default == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                awaitPointerEventScope5 = awaitPointerEventScope2;
                                obj = awaitPointerEvent$default;
                            }
                        }
                        PointerEvent pointerEvent2 = (PointerEvent) obj;
                        List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size3 = changes3.size();
                        int i32 = 0;
                        while (true) {
                            if (i32 < size3) {
                            }
                            i32++;
                            awaitPointerEventScope3 = awaitPointerEventScope4;
                        }
                        pointerInputChange = pointerInputChange2;
                        if (pointerInputChange == null) {
                            pointerInputChange = null;
                        }
                    }
                    if (pointerInputChange == null || pointerInputChange.isConsumed()) {
                        pointerInputChange = null;
                    } else if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                        function13.invoke(pointerInputChange);
                        awaitPointerEventScope2 = awaitPointerEventScope5;
                        pointerEventPass = null;
                        j2 = pointerInputChange.getId();
                        i2 = 1;
                        longRef = new Ref.LongRef();
                        longRef.element = j2;
                        awaitPointerEventScope3 = awaitPointerEventScope2;
                        draggableKt$onDragOrUp$12.L$0 = function14;
                        draggableKt$onDragOrUp$12.L$1 = function13;
                        draggableKt$onDragOrUp$12.L$2 = awaitPointerEventScope2;
                        draggableKt$onDragOrUp$12.L$3 = awaitPointerEventScope3;
                        draggableKt$onDragOrUp$12.L$4 = longRef;
                        draggableKt$onDragOrUp$12.label = i2;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, draggableKt$onDragOrUp$12, i2, pointerEventPass);
                        if (awaitPointerEvent$default == coroutine_suspended) {
                        }
                    }
                    if (pointerInputChange == null) {
                        function13.invoke(pointerInputChange);
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    return Boxing.boxBoolean(unit == null);
                }
                ResultKt.throwOnFailure(obj);
                j2 = j;
                if (DragGestureDetectorKt.m350isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j2)) {
                    function13 = function12;
                    pointerInputChange = null;
                    if (pointerInputChange == null) {
                    }
                    return Boxing.boxBoolean(unit == null);
                }
                awaitPointerEventScope2 = awaitPointerEventScope;
                function13 = function12;
                draggableKt$onDragOrUp$12 = draggableKt$onDragOrUp$1;
                function14 = function1;
                longRef = new Ref.LongRef();
                longRef.element = j2;
                awaitPointerEventScope3 = awaitPointerEventScope2;
                draggableKt$onDragOrUp$12.L$0 = function14;
                draggableKt$onDragOrUp$12.L$1 = function13;
                draggableKt$onDragOrUp$12.L$2 = awaitPointerEventScope2;
                draggableKt$onDragOrUp$12.L$3 = awaitPointerEventScope3;
                draggableKt$onDragOrUp$12.L$4 = longRef;
                draggableKt$onDragOrUp$12.label = i2;
                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, draggableKt$onDragOrUp$12, i2, pointerEventPass);
                if (awaitPointerEvent$default == coroutine_suspended) {
                }
            }
        }
        draggableKt$onDragOrUp$1 = new DraggableKt$onDragOrUp$1(continuation);
        Object obj2 = draggableKt$onDragOrUp$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = draggableKt$onDragOrUp$1.label;
        int i22 = 1;
        PointerEventPass pointerEventPass2 = null;
        if (i == 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toFloat-3MmeM6k, reason: not valid java name */
    public static final float m368toFloat3MmeM6k(long j, Orientation orientation) {
        return orientation == Orientation.Vertical ? Offset.m3167getYimpl(j) : Offset.m3166getXimpl(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toFloat-sF-c-tU, reason: not valid java name */
    public static final float m369toFloatsFctU(long j, Orientation orientation) {
        return orientation == Orientation.Vertical ? Velocity.m5970getYimpl(j) : Velocity.m5969getXimpl(j);
    }
}

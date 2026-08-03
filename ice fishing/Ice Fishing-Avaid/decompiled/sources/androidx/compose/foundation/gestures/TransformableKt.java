package androidx.compose.foundation.gestures;

import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.foundation.gestures.TransformEvent;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.HistoricalChange;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.PointerEvent_androidKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelResult;

/* compiled from: Transformable.kt */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a&\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u001a:\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u001a(\u0010\f\u001a\u00020\r*\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0082@¢\u0006\u0002\u0010\u0014\u001a\u001e\u0010\u0015\u001a\u0004\u0018\u00010\t*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u0013H\u0002\u001a\u0016\u0010\u0019\u001a\u0004\u0018\u00010\t*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002\u001a\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u000b*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002¢\u0006\u0002\u0010\u001b\u001a<\u0010\u001c\u001a\u00020\r*\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\bH\u0082@¢\u0006\u0002\u0010\u001e\"\u000e\u0010\n\u001a\u00020\u000bX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"transformable", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/gestures/TransformableState;", "lockRotationOnZoomPan", "", "enabled", "canPan", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "SCROLL_FACTOR", "", "detectNonTouchGestures", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "channel", "Lkotlinx/coroutines/channels/Channel;", "Landroidx/compose/foundation/gestures/TransformEvent;", "scrollConfig", "Landroidx/compose/foundation/gestures/ScrollConfig;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlinx/coroutines/channels/Channel;Landroidx/compose/foundation/gestures/ScrollConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consumePointerEventAsCtrlScrollOrNull", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "pointer", "Landroidx/compose/ui/input/pointer/PointerEvent;", "consumePointerEventAsPanOrNull", "consumePointerEventAsScaleOrNull", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEvent;)Ljava/lang/Float;", "detectZoom", "panZoomLock", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLkotlinx/coroutines/channels/Channel;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class TransformableKt {
    public static final float SCROLL_FACTOR = 545.0f;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean transformable$lambda$0(Offset offset) {
        return true;
    }

    public static /* synthetic */ Modifier transformable$default(Modifier modifier, TransformableState transformableState, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        return transformable(modifier, transformableState, z, z2);
    }

    public static final Modifier transformable(Modifier modifier, TransformableState transformableState, boolean z, boolean z2) {
        return transformable(modifier, transformableState, new Function1() { // from class: androidx.compose.foundation.gestures.TransformableKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean transformable$lambda$0;
                transformable$lambda$0 = TransformableKt.transformable$lambda$0((Offset) obj);
                return Boolean.valueOf(transformable$lambda$0);
            }
        }, z, z2);
    }

    public static /* synthetic */ Modifier transformable$default(Modifier modifier, TransformableState transformableState, Function1 function1, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = true;
        }
        return transformable(modifier, transformableState, function1, z, z2);
    }

    public static final Modifier transformable(Modifier modifier, TransformableState transformableState, Function1<? super Offset, Boolean> function1, boolean z, boolean z2) {
        return modifier.then(new TransformableElement(transformableState, function1, z, z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Offset consumePointerEventAsCtrlScrollOrNull(AwaitPointerEventScope awaitPointerEventScope, PointerEvent pointerEvent, ScrollConfig scrollConfig) {
        long m6535getZeroF1C5BW0;
        if (!PointerEvent_androidKt.m8114isCtrlPressed5xRPYO0(pointerEvent.getKeyboardModifiers()) || (!PointerEventType.m8090equalsimpl0(pointerEvent.getType(), PointerEventType.INSTANCE.m8105getScroll7fucELk()) && !PointerEventType.m8090equalsimpl0(pointerEvent.getType(), PointerEventType.INSTANCE.m8099getPanStart7fucELk()) && !PointerEventType.m8090equalsimpl0(pointerEvent.getType(), PointerEventType.INSTANCE.m8098getPanMove7fucELk()) && !PointerEventType.m8090equalsimpl0(pointerEvent.getType(), PointerEventType.INSTANCE.m8097getPanEnd7fucELk()))) {
            return null;
        }
        long mo557calculateMouseWheelScroll8xgXZGE = scrollConfig.mo557calculateMouseWheelScroll8xgXZGE(awaitPointerEventScope, pointerEvent, awaitPointerEventScope.mo8021getSizeYbymL2g());
        if (ComposeFoundationFlags.isTrackpadGestureHandlingEnabled) {
            PointerInputChange pointerInputChange = (PointerInputChange) CollectionsKt.firstOrNull((List) pointerEvent.getChanges());
            if (pointerInputChange == null) {
                m6535getZeroF1C5BW0 = Offset.INSTANCE.m6535getZeroF1C5BW0();
            } else {
                long m6511constructorimpl = Offset.m6511constructorimpl(pointerInputChange.getPanOffset() ^ (-9223372034707292160L));
                List<HistoricalChange> historical = pointerInputChange.getHistorical();
                Offset m6508boximpl = Offset.m6508boximpl(Offset.INSTANCE.m6535getZeroF1C5BW0());
                int size = historical.size();
                for (int i = 0; i < size; i++) {
                    m6508boximpl = Offset.m6508boximpl(Offset.m6523minusMKHz9U(m6508boximpl.m6529unboximpl(), historical.get(i).getPanOffset()));
                }
                m6535getZeroF1C5BW0 = Offset.m6524plusMKHz9U(m6511constructorimpl, m6508boximpl.m6529unboximpl());
            }
        } else {
            m6535getZeroF1C5BW0 = Offset.INSTANCE.m6535getZeroF1C5BW0();
        }
        long m6524plusMKHz9U = Offset.m6524plusMKHz9U(mo557calculateMouseWheelScroll8xgXZGE, m6535getZeroF1C5BW0);
        if (Offset.m6516equalsimpl0(m6524plusMKHz9U, Offset.INSTANCE.m6535getZeroF1C5BW0())) {
            return null;
        }
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size2 = changes.size();
        for (int i2 = 0; i2 < size2; i2++) {
            changes.get(i2).consume();
        }
        return Offset.m6508boximpl(m6524plusMKHz9U);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Offset consumePointerEventAsPanOrNull(AwaitPointerEventScope awaitPointerEventScope, PointerEvent pointerEvent) {
        long m6535getZeroF1C5BW0;
        if (!ComposeFoundationFlags.isTrackpadGestureHandlingEnabled || (!PointerEventType.m8090equalsimpl0(pointerEvent.getType(), PointerEventType.INSTANCE.m8099getPanStart7fucELk()) && !PointerEventType.m8090equalsimpl0(pointerEvent.getType(), PointerEventType.INSTANCE.m8098getPanMove7fucELk()) && !PointerEventType.m8090equalsimpl0(pointerEvent.getType(), PointerEventType.INSTANCE.m8097getPanEnd7fucELk()))) {
            return null;
        }
        PointerInputChange pointerInputChange = (PointerInputChange) CollectionsKt.firstOrNull((List) pointerEvent.getChanges());
        if (pointerInputChange == null) {
            m6535getZeroF1C5BW0 = Offset.INSTANCE.m6535getZeroF1C5BW0();
        } else {
            long m6511constructorimpl = Offset.m6511constructorimpl(pointerInputChange.getPanOffset() ^ (-9223372034707292160L));
            List<HistoricalChange> historical = pointerInputChange.getHistorical();
            Offset m6508boximpl = Offset.m6508boximpl(Offset.INSTANCE.m6535getZeroF1C5BW0());
            int size = historical.size();
            for (int i = 0; i < size; i++) {
                m6508boximpl = Offset.m6508boximpl(Offset.m6523minusMKHz9U(m6508boximpl.m6529unboximpl(), historical.get(i).getPanOffset()));
            }
            m6535getZeroF1C5BW0 = Offset.m6524plusMKHz9U(m6511constructorimpl, m6508boximpl.m6529unboximpl());
        }
        if (Offset.m6516equalsimpl0(m6535getZeroF1C5BW0, Offset.INSTANCE.m6535getZeroF1C5BW0())) {
            return null;
        }
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size2 = changes.size();
        for (int i2 = 0; i2 < size2; i2++) {
            changes.get(i2).consume();
        }
        return Offset.m6508boximpl(m6535getZeroF1C5BW0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float consumePointerEventAsScaleOrNull(AwaitPointerEventScope awaitPointerEventScope, PointerEvent pointerEvent) {
        if (!ComposeFoundationFlags.isTrackpadGestureHandlingEnabled || (!PointerEventType.m8090equalsimpl0(pointerEvent.getType(), PointerEventType.INSTANCE.m8104getScaleStart7fucELk()) && !PointerEventType.m8090equalsimpl0(pointerEvent.getType(), PointerEventType.INSTANCE.m8102getScaleChange7fucELk()) && !PointerEventType.m8090equalsimpl0(pointerEvent.getType(), PointerEventType.INSTANCE.m8103getScaleEnd7fucELk()))) {
            return null;
        }
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        float f = 1.0f;
        for (int i = 0; i < size; i++) {
            PointerInputChange pointerInputChange = changes.get(i);
            f *= pointerInputChange.getScaleFactor();
            List<HistoricalChange> historical = pointerInputChange.getHistorical();
            int size2 = historical.size();
            for (int i2 = 0; i2 < size2; i2++) {
                f *= historical.get(i2).getScaleFactor();
            }
        }
        if (f == 1.0f) {
            return null;
        }
        List<PointerInputChange> changes2 = pointerEvent.getChanges();
        int size3 = changes2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            changes2.get(i3).consume();
        }
        return Float.valueOf(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0193, code lost:
    
        if (androidx.compose.ui.input.pointer.PointerEventType.m8090equalsimpl0(r0.getType(), androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m8104getScaleStart7fucELk()) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01a3, code lost:
    
        if (androidx.compose.ui.input.pointer.PointerEventType.m8090equalsimpl0(r0.getType(), androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m8102getScaleChange7fucELk()) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01b3, code lost:
    
        if (androidx.compose.ui.input.pointer.PointerEventType.m8090equalsimpl0(r0.getType(), androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m8103getScaleEnd7fucELk()) == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01b7, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x032d, code lost:
    
        if (r6 != 0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x032f, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01b5, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0277, code lost:
    
        if (r13.invoke(androidx.compose.ui.geometry.Offset.m6508boximpl(r9)).booleanValue() != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0153, code lost:
    
        if (androidx.compose.foundation.ComposeFoundationFlags.isTrackpadGestureHandlingEnabled == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0163, code lost:
    
        if (androidx.compose.ui.input.pointer.PointerEventType.m8090equalsimpl0(r0.getType(), androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m8099getPanStart7fucELk()) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0173, code lost:
    
        if (androidx.compose.ui.input.pointer.PointerEventType.m8090equalsimpl0(r0.getType(), androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m8098getPanMove7fucELk()) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0183, code lost:
    
        if (androidx.compose.ui.input.pointer.PointerEventType.m8090equalsimpl0(r0.getType(), androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m8097getPanEnd7fucELk()) == false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0334 A[EDGE_INSN: B:112:0x0334->B:111:0x0334 BREAK  A[LOOP:0: B:13:0x031f->B:16:0x0331], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0151 A[EDGE_INSN: B:90:0x0151->B:91:0x0151 BREAK  A[LOOP:2: B:33:0x013f->B:36:0x014e], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0301 -> B:12:0x030e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object detectZoom(AwaitPointerEventScope awaitPointerEventScope, boolean z, Channel<TransformEvent> channel, Function1<? super Offset, Boolean> function1, Continuation<? super Unit> continuation) {
        TransformableKt$detectZoom$1 transformableKt$detectZoom$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        Channel<TransformEvent> channel2;
        Function1<? super Offset, Boolean> function12;
        boolean z2;
        float f;
        long j;
        int i2;
        int i3;
        float f2;
        float f3;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function1<? super Offset, Boolean> function13;
        AwaitPointerEventScope awaitPointerEventScope3;
        float f4;
        float f5;
        Channel<TransformEvent> channel3;
        int size;
        int i4;
        int i5;
        TransformableKt$detectZoom$1 transformableKt$detectZoom$12;
        float f6;
        long j2;
        int i6;
        int i7;
        TransformableKt$detectZoom$1 transformableKt$detectZoom$13;
        Object awaitPointerEvent;
        float f7;
        int i8;
        int i9;
        Channel<TransformEvent> channel4;
        AwaitPointerEventScope awaitPointerEventScope4;
        PointerEvent pointerEvent;
        float f8;
        float f9;
        long j3;
        int size2;
        int i10;
        int size3;
        int i11;
        int size4;
        int i12;
        if (continuation instanceof TransformableKt$detectZoom$1) {
            transformableKt$detectZoom$1 = (TransformableKt$detectZoom$1) continuation;
            if ((transformableKt$detectZoom$1.label & Integer.MIN_VALUE) != 0) {
                transformableKt$detectZoom$1.label -= Integer.MIN_VALUE;
                TransformableKt$detectZoom$1 transformableKt$detectZoom$14 = transformableKt$detectZoom$1;
                obj = transformableKt$detectZoom$14.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = transformableKt$detectZoom$14.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    long m6535getZeroF1C5BW0 = Offset.INSTANCE.m6535getZeroF1C5BW0();
                    float touchSlop = awaitPointerEventScope.getViewConfiguration().getTouchSlop();
                    transformableKt$detectZoom$14.L$0 = awaitPointerEventScope;
                    channel2 = channel;
                    transformableKt$detectZoom$14.L$1 = channel2;
                    function12 = function1;
                    transformableKt$detectZoom$14.L$2 = function12;
                    z2 = z;
                    transformableKt$detectZoom$14.Z$0 = z2;
                    transformableKt$detectZoom$14.F$0 = 0.0f;
                    transformableKt$detectZoom$14.F$1 = 1.0f;
                    transformableKt$detectZoom$14.J$0 = m6535getZeroF1C5BW0;
                    transformableKt$detectZoom$14.I$0 = 0;
                    transformableKt$detectZoom$14.F$2 = touchSlop;
                    transformableKt$detectZoom$14.I$1 = 0;
                    transformableKt$detectZoom$14.label = 1;
                    if (TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, null, transformableKt$detectZoom$14, 2, null) != coroutine_suspended) {
                        f = touchSlop;
                        j = m6535getZeroF1C5BW0;
                        i2 = 0;
                        i3 = 0;
                        f2 = 1.0f;
                        f3 = 0.0f;
                        awaitPointerEventScope2 = awaitPointerEventScope;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i5 = transformableKt$detectZoom$14.I$2;
                        i8 = transformableKt$detectZoom$14.I$1;
                        f7 = transformableKt$detectZoom$14.F$2;
                        i9 = transformableKt$detectZoom$14.I$0;
                        j2 = transformableKt$detectZoom$14.J$0;
                        float f10 = transformableKt$detectZoom$14.F$1;
                        f3 = transformableKt$detectZoom$14.F$0;
                        boolean z3 = transformableKt$detectZoom$14.Z$0;
                        pointerEvent = (PointerEvent) transformableKt$detectZoom$14.L$3;
                        Function1<? super Offset, Boolean> function14 = (Function1) transformableKt$detectZoom$14.L$2;
                        Channel<TransformEvent> channel5 = (Channel) transformableKt$detectZoom$14.L$1;
                        AwaitPointerEventScope awaitPointerEventScope5 = (AwaitPointerEventScope) transformableKt$detectZoom$14.L$0;
                        ResultKt.throwOnFailure(obj);
                        f2 = f10;
                        channel4 = channel5;
                        awaitPointerEventScope4 = awaitPointerEventScope5;
                        function12 = function14;
                        z2 = z3;
                        transformableKt$detectZoom$13 = transformableKt$detectZoom$14;
                        awaitPointerEvent = obj;
                        List<PointerInputChange> changes = ((PointerEvent) awaitPointerEvent).getChanges();
                        size3 = changes.size();
                        Object obj2 = coroutine_suspended;
                        i11 = 0;
                        while (true) {
                            if (i11 >= size3) {
                                break;
                            }
                            if (changes.get(i11).isConsumed()) {
                                break;
                            }
                            i11++;
                        }
                        boolean z4 = false;
                        if (i5 == 0 && !z4) {
                            List<PointerInputChange> changes2 = pointerEvent.getChanges();
                            size4 = changes2.size();
                            for (i12 = 0; i12 < size4; i12++) {
                                if (changes2.get(i12).getPressed()) {
                                    i2 = i8;
                                    f = f7;
                                    i3 = i9;
                                    transformableKt$detectZoom$14 = transformableKt$detectZoom$13;
                                    awaitPointerEventScope2 = awaitPointerEventScope4;
                                    coroutine_suspended = obj2;
                                    channel2 = channel4;
                                    j = j2;
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    i2 = transformableKt$detectZoom$14.I$1;
                    f = transformableKt$detectZoom$14.F$2;
                    i3 = transformableKt$detectZoom$14.I$0;
                    j = transformableKt$detectZoom$14.J$0;
                    float f11 = transformableKt$detectZoom$14.F$1;
                    float f12 = transformableKt$detectZoom$14.F$0;
                    boolean z5 = transformableKt$detectZoom$14.Z$0;
                    Function1<? super Offset, Boolean> function15 = (Function1) transformableKt$detectZoom$14.L$2;
                    Channel<TransformEvent> channel6 = (Channel) transformableKt$detectZoom$14.L$1;
                    AwaitPointerEventScope awaitPointerEventScope6 = (AwaitPointerEventScope) transformableKt$detectZoom$14.L$0;
                    ResultKt.throwOnFailure(obj);
                    f5 = f11;
                    channel3 = channel6;
                    z2 = z5;
                    f4 = f12;
                    function13 = function15;
                    awaitPointerEventScope3 = awaitPointerEventScope6;
                    PointerEvent pointerEvent2 = (PointerEvent) obj;
                    List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                    size = changes3.size();
                    int i13 = i2;
                    i4 = 0;
                    while (true) {
                        if (i4 >= size) {
                            break;
                        }
                        if (changes3.get(i4).isConsumed()) {
                            break;
                        }
                        i4++;
                    }
                    if (i5 != 0) {
                        float calculateZoom = TransformGestureDetectorKt.calculateZoom(pointerEvent2);
                        float calculateRotation = TransformGestureDetectorKt.calculateRotation(pointerEvent2);
                        float f13 = f5;
                        float f14 = f4;
                        long calculatePan = TransformGestureDetectorKt.calculatePan(pointerEvent2);
                        if (i3 == 0) {
                            float f15 = f13 * calculateZoom;
                            float f16 = f14 + calculateRotation;
                            long m6524plusMKHz9U = Offset.m6524plusMKHz9U(j, calculatePan);
                            int i14 = i3;
                            float calculateCentroidSize = TransformGestureDetectorKt.calculateCentroidSize(pointerEvent2, false);
                            float abs = Math.abs(1 - f15) * calculateCentroidSize;
                            float abs2 = Math.abs(((3.1415927f * f16) * calculateCentroidSize) / 180.0f);
                            float m6517getDistanceimpl = Offset.m6517getDistanceimpl(m6524plusMKHz9U);
                            if (abs > f || abs2 > f || (m6517getDistanceimpl > f && function13.invoke(Offset.m6508boximpl(calculatePan)).booleanValue())) {
                                i7 = (!z2 || abs2 >= f) ? 0 : 1;
                                channel3.mo11990trySendJP2dKIU(TransformEvent.TransformStarted.INSTANCE);
                                i6 = 1;
                                f8 = f15;
                                f9 = f16;
                            } else {
                                i7 = i13;
                                f8 = f15;
                                f9 = f16;
                                i6 = i14;
                            }
                            j3 = m6524plusMKHz9U;
                        } else {
                            f8 = f13;
                            f9 = f14;
                            j3 = j;
                            i6 = i3;
                            i7 = i13;
                        }
                        if (i6 != 0) {
                            long calculateCentroid = TransformGestureDetectorKt.calculateCentroid(pointerEvent2, false);
                            float f17 = i7 != 0 ? 0.0f : calculateRotation;
                            if (f17 != 0.0f) {
                                transformableKt$detectZoom$12 = transformableKt$detectZoom$14;
                            } else if (calculateZoom == 1.0f) {
                                transformableKt$detectZoom$12 = transformableKt$detectZoom$14;
                                if (!Offset.m6516equalsimpl0(calculatePan, Offset.INSTANCE.m6535getZeroF1C5BW0())) {
                                }
                                List<PointerInputChange> changes4 = pointerEvent2.getChanges();
                                size2 = changes4.size();
                                for (i10 = 0; i10 < size2; i10++) {
                                    PointerInputChange pointerInputChange = changes4.get(i10);
                                    if (PointerEventKt.positionChanged(pointerInputChange)) {
                                        pointerInputChange.consume();
                                    }
                                }
                            } else {
                                transformableKt$detectZoom$12 = transformableKt$detectZoom$14;
                            }
                            channel3.mo11990trySendJP2dKIU(new TransformEvent.TransformDelta(calculateCentroid, calculateZoom, calculatePan, f17, null));
                            List<PointerInputChange> changes42 = pointerEvent2.getChanges();
                            size2 = changes42.size();
                            while (i10 < size2) {
                            }
                        } else {
                            transformableKt$detectZoom$12 = transformableKt$detectZoom$14;
                        }
                        j2 = j3;
                        f6 = f8;
                        f3 = f9;
                    } else {
                        int i15 = i3;
                        transformableKt$detectZoom$12 = transformableKt$detectZoom$14;
                        ChannelResult.m12005boximpl(channel3.mo11990trySendJP2dKIU(TransformEvent.TransformStopped.INSTANCE));
                        f6 = f5;
                        f3 = f4;
                        j2 = j;
                        i6 = i15;
                        i7 = i13;
                    }
                    PointerEventPass pointerEventPass = PointerEventPass.Final;
                    transformableKt$detectZoom$13 = transformableKt$detectZoom$12;
                    transformableKt$detectZoom$13.L$0 = awaitPointerEventScope3;
                    transformableKt$detectZoom$13.L$1 = channel3;
                    transformableKt$detectZoom$13.L$2 = function13;
                    transformableKt$detectZoom$13.L$3 = pointerEvent2;
                    transformableKt$detectZoom$13.Z$0 = z2;
                    transformableKt$detectZoom$13.F$0 = f3;
                    transformableKt$detectZoom$13.F$1 = f6;
                    transformableKt$detectZoom$13.J$0 = j2;
                    transformableKt$detectZoom$13.I$0 = i6;
                    transformableKt$detectZoom$13.F$2 = f;
                    transformableKt$detectZoom$13.I$1 = i7;
                    transformableKt$detectZoom$13.I$2 = i5;
                    transformableKt$detectZoom$13.label = 3;
                    awaitPointerEvent = awaitPointerEventScope3.awaitPointerEvent(pointerEventPass, transformableKt$detectZoom$13);
                    if (awaitPointerEvent != coroutine_suspended) {
                        float f18 = f6;
                        f7 = f;
                        i8 = i7;
                        i9 = i6;
                        channel4 = channel3;
                        f2 = f18;
                        awaitPointerEventScope4 = awaitPointerEventScope3;
                        function12 = function13;
                        pointerEvent = pointerEvent2;
                        List<PointerInputChange> changes5 = ((PointerEvent) awaitPointerEvent).getChanges();
                        size3 = changes5.size();
                        Object obj22 = coroutine_suspended;
                        i11 = 0;
                        while (true) {
                            if (i11 >= size3) {
                            }
                            i11++;
                        }
                        boolean z42 = false;
                        if (i5 == 0) {
                            List<PointerInputChange> changes22 = pointerEvent.getChanges();
                            size4 = changes22.size();
                            while (i12 < size4) {
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
                i2 = transformableKt$detectZoom$14.I$1;
                f = transformableKt$detectZoom$14.F$2;
                i3 = transformableKt$detectZoom$14.I$0;
                j = transformableKt$detectZoom$14.J$0;
                f2 = transformableKt$detectZoom$14.F$1;
                f3 = transformableKt$detectZoom$14.F$0;
                boolean z6 = transformableKt$detectZoom$14.Z$0;
                function12 = (Function1) transformableKt$detectZoom$14.L$2;
                Channel<TransformEvent> channel7 = (Channel) transformableKt$detectZoom$14.L$1;
                awaitPointerEventScope2 = (AwaitPointerEventScope) transformableKt$detectZoom$14.L$0;
                ResultKt.throwOnFailure(obj);
                z2 = z6;
                channel2 = channel7;
                transformableKt$detectZoom$14.L$0 = awaitPointerEventScope2;
                transformableKt$detectZoom$14.L$1 = channel2;
                transformableKt$detectZoom$14.L$2 = function12;
                transformableKt$detectZoom$14.L$3 = null;
                transformableKt$detectZoom$14.Z$0 = z2;
                transformableKt$detectZoom$14.F$0 = f3;
                transformableKt$detectZoom$14.F$1 = f2;
                transformableKt$detectZoom$14.J$0 = j;
                transformableKt$detectZoom$14.I$0 = i3;
                transformableKt$detectZoom$14.F$2 = f;
                transformableKt$detectZoom$14.I$1 = i2;
                transformableKt$detectZoom$14.label = 2;
                obj = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, null, transformableKt$detectZoom$14, 1, null);
                if (obj != coroutine_suspended) {
                    float f19 = f3;
                    f5 = f2;
                    channel3 = channel2;
                    f4 = f19;
                    AwaitPointerEventScope awaitPointerEventScope7 = awaitPointerEventScope2;
                    function13 = function12;
                    awaitPointerEventScope3 = awaitPointerEventScope7;
                    PointerEvent pointerEvent22 = (PointerEvent) obj;
                    List<PointerInputChange> changes32 = pointerEvent22.getChanges();
                    size = changes32.size();
                    int i132 = i2;
                    i4 = 0;
                    while (true) {
                        if (i4 >= size) {
                        }
                        i4++;
                    }
                    if (i5 != 0) {
                    }
                    PointerEventPass pointerEventPass2 = PointerEventPass.Final;
                    transformableKt$detectZoom$13 = transformableKt$detectZoom$12;
                    transformableKt$detectZoom$13.L$0 = awaitPointerEventScope3;
                    transformableKt$detectZoom$13.L$1 = channel3;
                    transformableKt$detectZoom$13.L$2 = function13;
                    transformableKt$detectZoom$13.L$3 = pointerEvent22;
                    transformableKt$detectZoom$13.Z$0 = z2;
                    transformableKt$detectZoom$13.F$0 = f3;
                    transformableKt$detectZoom$13.F$1 = f6;
                    transformableKt$detectZoom$13.J$0 = j2;
                    transformableKt$detectZoom$13.I$0 = i6;
                    transformableKt$detectZoom$13.F$2 = f;
                    transformableKt$detectZoom$13.I$1 = i7;
                    transformableKt$detectZoom$13.I$2 = i5;
                    transformableKt$detectZoom$13.label = 3;
                    awaitPointerEvent = awaitPointerEventScope3.awaitPointerEvent(pointerEventPass2, transformableKt$detectZoom$13);
                    if (awaitPointerEvent != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        transformableKt$detectZoom$1 = new TransformableKt$detectZoom$1(continuation);
        TransformableKt$detectZoom$1 transformableKt$detectZoom$142 = transformableKt$detectZoom$1;
        obj = transformableKt$detectZoom$142.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = transformableKt$detectZoom$142.label;
        if (i != 0) {
        }
        transformableKt$detectZoom$142.L$0 = awaitPointerEventScope2;
        transformableKt$detectZoom$142.L$1 = channel2;
        transformableKt$detectZoom$142.L$2 = function12;
        transformableKt$detectZoom$142.L$3 = null;
        transformableKt$detectZoom$142.Z$0 = z2;
        transformableKt$detectZoom$142.F$0 = f3;
        transformableKt$detectZoom$142.F$1 = f2;
        transformableKt$detectZoom$142.J$0 = j;
        transformableKt$detectZoom$142.I$0 = i3;
        transformableKt$detectZoom$142.F$2 = f;
        transformableKt$detectZoom$142.I$1 = i2;
        transformableKt$detectZoom$142.label = 2;
        obj = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, null, transformableKt$detectZoom$142, 1, null);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object detectNonTouchGestures(PointerInputScope pointerInputScope, Channel<TransformEvent> channel, ScrollConfig scrollConfig, Continuation<? super Unit> continuation) {
        Object awaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new TransformableKt$detectNonTouchGestures$2(continuation.getContext(), scrollConfig, channel, null), continuation);
        return awaitPointerEventScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitPointerEventScope : Unit.INSTANCE;
    }
}

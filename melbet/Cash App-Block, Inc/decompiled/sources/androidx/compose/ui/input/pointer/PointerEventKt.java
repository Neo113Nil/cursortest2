package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.ui.geometry.Offset;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.TraceParser$parse$1;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public abstract class PointerEventKt {
    public static final StackTraceElement[] EmptyStackTraceElements = new StackTraceElement[0];

    public static final int ProcessResult(boolean z, boolean z2, boolean z3) {
        return (z ? 1 : 0) | ((z2 ? 1 : 0) << 1) | ((z3 ? 1 : 0) << 2);
    }

    public static final boolean changedToDown(PointerInputChange pointerInputChange) {
        return (pointerInputChange.isConsumed() || pointerInputChange.previousPressed || !pointerInputChange.pressed) ? false : true;
    }

    public static final boolean changedToDownIgnoreConsumed(PointerInputChange pointerInputChange) {
        return !pointerInputChange.previousPressed && pointerInputChange.pressed;
    }

    public static final boolean changedToUp(PointerInputChange pointerInputChange) {
        return (pointerInputChange.isConsumed() || !pointerInputChange.previousPressed || pointerInputChange.pressed) ? false : true;
    }

    public static final boolean changedToUpIgnoreConsumed(PointerInputChange pointerInputChange) {
        return pointerInputChange.previousPressed && !pointerInputChange.pressed;
    }

    public static final void emptyCancelMotionEventScope(long j, PointerInteropFilter$pointerInputFilter$1$onCancel$1 pointerInteropFilter$pointerInputFilter$1$onCancel$1) {
        MotionEvent obtain = MotionEvent.obtain(j, j, 3, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 0);
        obtain.setSource(0);
        pointerInteropFilter$pointerInputFilter$1$onCancel$1.invoke(obtain);
        obtain.recycle();
    }

    /* renamed from: isOutOfBounds-O0kMr_c, reason: not valid java name */
    public static final boolean m806isOutOfBoundsO0kMr_c(long j, PointerInputChange pointerInputChange) {
        long j2 = pointerInputChange.position;
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax));
        int i = (int) (j >> 32);
        int i2 = (int) (j & BodyPartID.bodyIdMax);
        return (intBitsToFloat2 < RecyclerView.DECELERATION_RATE) | (intBitsToFloat > ((float) i)) | (intBitsToFloat < RecyclerView.DECELERATION_RATE) | (intBitsToFloat2 > ((float) i2));
    }

    /* renamed from: isOutOfBounds-jwHxaWs, reason: not valid java name */
    public static final boolean m807isOutOfBoundsjwHxaWs(PointerInputChange pointerInputChange, long j, long j2) {
        int i = pointerInputChange.f859type == 1 ? 1 : 0;
        long j3 = pointerInputChange.position;
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & BodyPartID.bodyIdMax));
        float f = i;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32)) * f;
        float f2 = ((int) (j >> 32)) + intBitsToFloat3;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)) * f;
        return (intBitsToFloat > f2) | (intBitsToFloat < (-intBitsToFloat3)) | (intBitsToFloat2 < (-intBitsToFloat4)) | (intBitsToFloat2 > ((int) (j & BodyPartID.bodyIdMax)) + intBitsToFloat4);
    }

    public static final long positionChange(PointerInputChange pointerInputChange) {
        return positionChangeInternal(pointerInputChange, false);
    }

    public static final long positionChangeIgnoreConsumed(PointerInputChange pointerInputChange) {
        return positionChangeInternal(pointerInputChange, true);
    }

    public static final long positionChangeInternal(PointerInputChange pointerInputChange, boolean z) {
        long m625minusMKHz9U = Offset.m625minusMKHz9U(pointerInputChange.position, pointerInputChange.previousPosition);
        if (z || !pointerInputChange.isConsumed()) {
            return m625minusMKHz9U;
        }
        return 0L;
    }

    public static final boolean positionChangedIgnoreConsumed(PointerInputChange pointerInputChange) {
        return !Offset.m622equalsimpl0(positionChangeInternal(pointerInputChange, true), 0L);
    }

    /* renamed from: toCancelMotionEventScope-d-4ec7I, reason: not valid java name */
    public static final void m808toCancelMotionEventScoped4ec7I(PointerEvent pointerEvent, long j, PointerInteropFilter$pointerInputFilter$1$onCancel$1 pointerInteropFilter$pointerInputFilter$1$onCancel$1) {
        m810toMotionEventScopeubNVwUQ(pointerEvent, j, pointerInteropFilter$pointerInputFilter$1$onCancel$1, true);
    }

    /* renamed from: toMotionEventScope-d-4ec7I, reason: not valid java name */
    public static final void m809toMotionEventScoped4ec7I(PointerEvent pointerEvent, long j, TraceParser$parse$1 traceParser$parse$1) {
        m810toMotionEventScopeubNVwUQ(pointerEvent, j, traceParser$parse$1, false);
    }

    /* renamed from: toMotionEventScope-ubNVwUQ, reason: not valid java name */
    public static final void m810toMotionEventScopeubNVwUQ(PointerEvent pointerEvent, long j, Function1 function1, boolean z) {
        MotionEvent motionEvent = pointerEvent.getMotionEvent();
        if (motionEvent == null) {
            a$$ExternalSyntheticBUOutline0.m$3("The PointerEvent receiver cannot have a null MotionEvent.");
            return;
        }
        int action = motionEvent.getAction();
        if (z) {
            motionEvent.setAction(3);
        }
        int i = (int) (j >> 32);
        float f = -Float.intBitsToFloat(i);
        int i2 = (int) (j & BodyPartID.bodyIdMax);
        motionEvent.offsetLocation(f, -Float.intBitsToFloat(i2));
        function1.invoke(motionEvent);
        motionEvent.offsetLocation(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        motionEvent.setAction(action);
    }

    /* renamed from: toRawOffset-dBAh8RU, reason: not valid java name */
    public static long m811toRawOffsetdBAh8RU(MotionEvent motionEvent, int i) {
        float rawX = motionEvent.getRawX(i);
        float rawY = motionEvent.getRawY(i);
        return (Float.floatToRawIntBits(rawY) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(rawX) << 32);
    }
}

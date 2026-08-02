package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public final class PointerInputChange {
    public final List _historical;
    public PointerInputChange consumedDelegate;
    public boolean downChange;
    public final long id;
    public final long originalEventPosition;
    public final long panOffset;
    public final long position;
    public boolean positionChange;
    public final boolean pressed;
    public final float pressure;
    public final long previousPosition;
    public final boolean previousPressed;
    public final long previousUptimeMillis;
    public final float scaleFactor;
    public final long scrollDelta;

    /* renamed from: type, reason: collision with root package name */
    public final int f859type;
    public final long uptimeMillis;

    public PointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f2, long j7) {
        this.id = j;
        this.uptimeMillis = j2;
        this.position = j3;
        this.pressed = z;
        this.pressure = f;
        this.previousUptimeMillis = j4;
        this.previousPosition = j5;
        this.previousPressed = z2;
        this.f859type = i;
        this.scrollDelta = j6;
        this.scaleFactor = f2;
        this.panOffset = j7;
        this.originalEventPosition = 0L;
        this.downChange = z3;
        this.positionChange = z3;
    }

    /* renamed from: copy-OHpmEuE$default, reason: not valid java name */
    public static PointerInputChange m814copyOHpmEuE$default(PointerInputChange pointerInputChange, long j, long j2, ArrayList arrayList) {
        PointerInputChange pointerInputChange2 = pointerInputChange;
        PointerInputChange pointerInputChange3 = new PointerInputChange(pointerInputChange2.id, pointerInputChange2.uptimeMillis, j, pointerInputChange2.pressed, pointerInputChange2.pressure, pointerInputChange2.previousUptimeMillis, j2, pointerInputChange2.previousPressed, pointerInputChange2.f859type, arrayList, pointerInputChange2.scrollDelta, pointerInputChange2.scaleFactor, pointerInputChange2.panOffset, pointerInputChange2.originalEventPosition);
        PointerInputChange pointerInputChange4 = pointerInputChange2.consumedDelegate;
        if (pointerInputChange4 == null) {
            pointerInputChange4 = pointerInputChange2;
        }
        pointerInputChange3.consumedDelegate = pointerInputChange4;
        PointerInputChange pointerInputChange5 = pointerInputChange2.consumedDelegate;
        if (pointerInputChange5 != null) {
            pointerInputChange2 = pointerInputChange5;
        }
        pointerInputChange3.consumedDelegate = pointerInputChange2;
        return pointerInputChange3;
    }

    public final void consume() {
        PointerInputChange pointerInputChange = this.consumedDelegate;
        if (pointerInputChange == null) {
            this.downChange = true;
            this.positionChange = true;
        } else if (pointerInputChange != null) {
            pointerInputChange.consume();
        }
    }

    public final List getHistorical() {
        List list = this._historical;
        return list == null ? EmptyList.INSTANCE : list;
    }

    /* renamed from: getId-J3iCeTQ, reason: not valid java name */
    public final long m815getIdJ3iCeTQ() {
        return this.id;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m816getPositionF1C5BW0() {
        return this.position;
    }

    public final boolean getPressed() {
        return this.pressed;
    }

    public final float getPressure() {
        return this.pressure;
    }

    /* renamed from: getPreviousPosition-F1C5BW0, reason: not valid java name */
    public final long m817getPreviousPositionF1C5BW0() {
        return this.previousPosition;
    }

    public final boolean getPreviousPressed() {
        return this.previousPressed;
    }

    /* renamed from: getType-T8wyACA, reason: not valid java name */
    public final int m818getTypeT8wyACA() {
        return this.f859type;
    }

    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public final boolean isConsumed() {
        PointerInputChange pointerInputChange = this.consumedDelegate;
        return pointerInputChange != null ? pointerInputChange.isConsumed() : this.downChange || this.positionChange;
    }

    public final String toString() {
        return "PointerInputChange(id=" + ((Object) PointerId.m813toStringimpl(this.id)) + ", uptimeMillis=" + this.uptimeMillis + ", position=" + ((Object) Offset.m628toStringimpl(this.position)) + ", pressed=" + this.pressed + ", pressure=" + this.pressure + ", previousUptimeMillis=" + this.previousUptimeMillis + ", previousPosition=" + ((Object) Offset.m628toStringimpl(this.previousPosition)) + ", previousPressed=" + this.previousPressed + ", isConsumed=" + isConsumed() + ", type=" + ((Object) PointerType.m829toStringimpl(this.f859type)) + ", historical=" + getHistorical() + ", scrollDelta=" + ((Object) Offset.m628toStringimpl(this.scrollDelta)) + ", scaleFactor=" + this.scaleFactor + ", panOffset=" + ((Object) Offset.m628toStringimpl(this.panOffset)) + ')';
    }

    public /* synthetic */ PointerInputChange(long j, long j2, long j3, float f, long j4, long j5, boolean z, boolean z2, int i) {
        this(j, j2, j3, false, f, j4, j5, z, z2, i, 0L, 1.0f, 0L);
    }

    public PointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, List list, long j6, float f2, long j7, long j8) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6, f2, j7);
        this._historical = list;
        this.originalEventPosition = j8;
    }
}

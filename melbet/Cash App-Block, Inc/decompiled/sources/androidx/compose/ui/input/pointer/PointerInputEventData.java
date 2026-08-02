package androidx.compose.ui.input.pointer;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.geometry.Offset;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class PointerInputEventData {
    public final boolean activeHover;
    public final boolean down;
    public final ArrayList historical;
    public final long id;
    public final long originalEventPosition;
    public final long panGestureOffset;
    public final long position;
    public final long positionOnScreen;
    public final float pressure;
    public final float scaleGestureFactor;
    public final long scrollDelta;

    /* renamed from: type, reason: collision with root package name */
    public final int f860type;
    public final long uptime;

    public PointerInputEventData(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, float f2, long j6, long j7) {
        this.id = j;
        this.uptime = j2;
        this.positionOnScreen = j3;
        this.position = j4;
        this.down = z;
        this.pressure = f;
        this.f860type = i;
        this.activeHover = z2;
        this.historical = arrayList;
        this.scrollDelta = j5;
        this.scaleGestureFactor = f2;
        this.panGestureOffset = j6;
        this.originalEventPosition = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerInputEventData)) {
            return false;
        }
        PointerInputEventData pointerInputEventData = (PointerInputEventData) obj;
        return PointerId.m812equalsimpl0(this.id, pointerInputEventData.id) && this.uptime == pointerInputEventData.uptime && Offset.m622equalsimpl0(this.positionOnScreen, pointerInputEventData.positionOnScreen) && Offset.m622equalsimpl0(this.position, pointerInputEventData.position) && this.down == pointerInputEventData.down && Float.compare(this.pressure, pointerInputEventData.pressure) == 0 && this.f860type == pointerInputEventData.f860type && this.activeHover == pointerInputEventData.activeHover && this.historical.equals(pointerInputEventData.historical) && Offset.m622equalsimpl0(this.scrollDelta, pointerInputEventData.scrollDelta) && Float.compare(this.scaleGestureFactor, pointerInputEventData.scaleGestureFactor) == 0 && Offset.m622equalsimpl0(this.panGestureOffset, pointerInputEventData.panGestureOffset) && Offset.m622equalsimpl0(this.originalEventPosition, pointerInputEventData.originalEventPosition);
    }

    public final boolean getActiveHover() {
        return this.activeHover;
    }

    public final boolean getDown() {
        return this.down;
    }

    public final List getHistorical() {
        return this.historical;
    }

    /* renamed from: getId-J3iCeTQ, reason: not valid java name */
    public final long m820getIdJ3iCeTQ() {
        return this.id;
    }

    /* renamed from: getOriginalEventPosition-F1C5BW0, reason: not valid java name */
    public final long m821getOriginalEventPositionF1C5BW0() {
        return this.originalEventPosition;
    }

    /* renamed from: getPanGestureOffset-F1C5BW0, reason: not valid java name */
    public final long m822getPanGestureOffsetF1C5BW0() {
        return this.panGestureOffset;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m823getPositionF1C5BW0() {
        return this.position;
    }

    /* renamed from: getPositionOnScreen-F1C5BW0, reason: not valid java name */
    public final long m824getPositionOnScreenF1C5BW0() {
        return this.positionOnScreen;
    }

    public final float getPressure() {
        return this.pressure;
    }

    public final float getScaleGestureFactor() {
        return this.scaleGestureFactor;
    }

    /* renamed from: getScrollDelta-F1C5BW0, reason: not valid java name */
    public final long m825getScrollDeltaF1C5BW0() {
        return this.scrollDelta;
    }

    /* renamed from: getType-T8wyACA, reason: not valid java name */
    public final int m826getTypeT8wyACA() {
        return this.f860type;
    }

    public final long getUptime() {
        return this.uptime;
    }

    public final int hashCode() {
        return Long.hashCode(this.originalEventPosition) + Recorder$$ExternalSyntheticOutline2.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.scaleGestureFactor, Recorder$$ExternalSyntheticOutline2.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.historical, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.f860type, CameraState$Type$EnumUnboxingLocalUtility.m(this.pressure, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.id) * 31, 31, this.uptime), 31, this.positionOnScreen), 31, this.position), 31, this.down), 31), 31), 31, this.activeHover), 31), 31, this.scrollDelta), 31), 31, this.panGestureOffset);
    }

    public final String toString() {
        return "PointerInputEventData(id=" + ((Object) PointerId.m813toStringimpl(this.id)) + ", uptime=" + this.uptime + ", positionOnScreen=" + ((Object) Offset.m628toStringimpl(this.positionOnScreen)) + ", position=" + ((Object) Offset.m628toStringimpl(this.position)) + ", down=" + this.down + ", pressure=" + this.pressure + ", type=" + ((Object) PointerType.m829toStringimpl(this.f860type)) + ", activeHover=" + this.activeHover + ", historical=" + this.historical + ", scrollDelta=" + ((Object) Offset.m628toStringimpl(this.scrollDelta)) + ", scaleGestureFactor=" + this.scaleGestureFactor + ", panGestureOffset=" + ((Object) Offset.m628toStringimpl(this.panGestureOffset)) + ", originalEventPosition=" + ((Object) Offset.m628toStringimpl(this.originalEventPosition)) + ')';
    }
}

package androidx.compose.ui.input.indirect;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerId;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class IndirectPointerInputChange {
    public final long id;
    public boolean isConsumed;
    public final long position;
    public final boolean pressed;
    public final float pressure;
    public final long previousPosition;
    public final boolean previousPressed;
    public final long previousUptimeMillis;
    public final long uptimeMillis;

    public IndirectPointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2) {
        this.id = j;
        this.uptimeMillis = j2;
        this.position = j3;
        this.pressed = z;
        this.pressure = f;
        this.previousUptimeMillis = j4;
        this.previousPosition = j5;
        this.previousPressed = z2;
    }

    public final void consume() {
        this.isConsumed = true;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m770getPositionF1C5BW0() {
        return this.position;
    }

    public final boolean getPressed() {
        return this.pressed;
    }

    public final boolean getPreviousPressed() {
        return this.previousPressed;
    }

    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public final boolean isConsumed() {
        return this.isConsumed;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IndirectPointerInputChange(id=");
        sb.append((Object) PointerId.m813toStringimpl(this.id));
        sb.append(", uptimeMillis=");
        sb.append(this.uptimeMillis);
        sb.append(", position=");
        sb.append((Object) Offset.m628toStringimpl(this.position));
        sb.append(", pressed=");
        sb.append(this.pressed);
        sb.append(", pressure=");
        sb.append(this.pressure);
        sb.append(", previousUptimeMillis=");
        sb.append(this.previousUptimeMillis);
        sb.append(", previousPosition=");
        sb.append((Object) Offset.m628toStringimpl(this.previousPosition));
        sb.append(", previousPressed=");
        sb.append(this.previousPressed);
        sb.append(", isConsumed=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isConsumed, ')');
    }
}

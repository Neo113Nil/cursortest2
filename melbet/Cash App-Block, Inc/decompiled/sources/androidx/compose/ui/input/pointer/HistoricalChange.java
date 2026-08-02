package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;

/* loaded from: classes3.dex */
public final class HistoricalChange {
    public final long originalEventPosition;
    public final long panOffset;
    public final long position;
    public final float scaleFactor;
    public final long uptimeMillis;

    public HistoricalChange(long j, long j2, float f, long j3, long j4) {
        this.uptimeMillis = j;
        this.position = j2;
        this.scaleFactor = f;
        this.panOffset = j3;
        this.originalEventPosition = j4;
    }

    /* renamed from: getOriginalEventPosition-F1C5BW0$ui, reason: not valid java name */
    public final long m794getOriginalEventPositionF1C5BW0$ui() {
        return this.originalEventPosition;
    }

    /* renamed from: getPanOffset-F1C5BW0, reason: not valid java name */
    public final long m795getPanOffsetF1C5BW0() {
        return this.panOffset;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m796getPositionF1C5BW0() {
        return this.position;
    }

    public final float getScaleFactor() {
        return this.scaleFactor;
    }

    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public final String toString() {
        return "HistoricalChange(uptimeMillis=" + this.uptimeMillis + ", position=" + ((Object) Offset.m628toStringimpl(this.position)) + ", scaleFactor=" + this.scaleFactor + ", panOffset=" + ((Object) Offset.m628toStringimpl(this.panOffset)) + ')';
    }
}

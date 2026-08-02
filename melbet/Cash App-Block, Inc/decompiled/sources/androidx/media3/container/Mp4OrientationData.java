package androidx.media3.container;

import androidx.media3.common.Metadata;
import androidx.tracing.Trace;

/* loaded from: classes3.dex */
public final class Mp4OrientationData implements Metadata.Entry {
    public final int orientation;

    public Mp4OrientationData(int i) {
        Trace.checkArgument("Unsupported orientation", i == 0 || i == 90 || i == 180 || i == 270);
        this.orientation = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Mp4OrientationData) && this.orientation == ((Mp4OrientationData) obj).orientation;
    }

    public final int hashCode() {
        return Integer.hashCode(this.orientation) + 527;
    }

    public final String toString() {
        return "Orientation= " + this.orientation;
    }
}

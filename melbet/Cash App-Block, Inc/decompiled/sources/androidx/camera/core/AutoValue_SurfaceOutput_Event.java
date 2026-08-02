package androidx.camera.core;

import androidx.camera.core.processing.SurfaceOutputImpl;

/* loaded from: classes3.dex */
public final class AutoValue_SurfaceOutput_Event {
    public final SurfaceOutputImpl surfaceOutput;

    public AutoValue_SurfaceOutput_Event(SurfaceOutputImpl surfaceOutputImpl) {
        this.surfaceOutput = surfaceOutputImpl;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof AutoValue_SurfaceOutput_Event) && this.surfaceOutput == ((AutoValue_SurfaceOutput_Event) obj).surfaceOutput;
    }

    public final int hashCode() {
        return this.surfaceOutput.hashCode() ^ (-721379959);
    }

    public final String toString() {
        return "Event{eventCode=0, surfaceOutput=" + this.surfaceOutput + "}";
    }
}

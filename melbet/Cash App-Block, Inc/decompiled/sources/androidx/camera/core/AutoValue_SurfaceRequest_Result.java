package androidx.camera.core;

import android.view.Surface;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class AutoValue_SurfaceRequest_Result {
    public final int resultCode;
    public final Surface surface;

    public AutoValue_SurfaceRequest_Result(int i, Surface surface) {
        this.resultCode = i;
        if (surface != null) {
            this.surface = surface;
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("Null surface");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_SurfaceRequest_Result)) {
            return false;
        }
        AutoValue_SurfaceRequest_Result autoValue_SurfaceRequest_Result = (AutoValue_SurfaceRequest_Result) obj;
        return this.resultCode == autoValue_SurfaceRequest_Result.resultCode && this.surface.equals(autoValue_SurfaceRequest_Result.surface);
    }

    public final int hashCode() {
        return this.surface.hashCode() ^ ((this.resultCode ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "Result{resultCode=" + this.resultCode + ", surface=" + this.surface + "}";
    }
}

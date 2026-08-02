package androidx.camera.core.processing;

import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;

/* loaded from: classes3.dex */
public final class AutoValue_DefaultSurfaceProcessor_PendingSnapshot {
    public final CallbackToFutureAdapter$Completer completer;
    public final int jpegQuality;
    public final int rotationDegrees;

    public AutoValue_DefaultSurfaceProcessor_PendingSnapshot(int i, int i2, CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer) {
        this.jpegQuality = i;
        this.rotationDegrees = i2;
        this.completer = callbackToFutureAdapter$Completer;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutoValue_DefaultSurfaceProcessor_PendingSnapshot) {
            AutoValue_DefaultSurfaceProcessor_PendingSnapshot autoValue_DefaultSurfaceProcessor_PendingSnapshot = (AutoValue_DefaultSurfaceProcessor_PendingSnapshot) obj;
            return this.jpegQuality == autoValue_DefaultSurfaceProcessor_PendingSnapshot.jpegQuality && this.rotationDegrees == autoValue_DefaultSurfaceProcessor_PendingSnapshot.rotationDegrees && this.completer == autoValue_DefaultSurfaceProcessor_PendingSnapshot.completer;
        }
        return false;
    }

    public final int hashCode() {
        return this.completer.hashCode() ^ ((((this.jpegQuality ^ 1000003) * 1000003) ^ this.rotationDegrees) * 1000003);
    }

    public final String toString() {
        return "PendingSnapshot{jpegQuality=" + this.jpegQuality + ", rotationDegrees=" + this.rotationDegrees + ", completer=" + this.completer + "}";
    }
}

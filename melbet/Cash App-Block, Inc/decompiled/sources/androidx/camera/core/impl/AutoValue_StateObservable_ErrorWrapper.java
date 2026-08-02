package androidx.camera.core.impl;

import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class AutoValue_StateObservable_ErrorWrapper {
    public final Throwable error;

    public AutoValue_StateObservable_ErrorWrapper(Throwable th) {
        if (th != null) {
            this.error = th;
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("Null error");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutoValue_StateObservable_ErrorWrapper) {
            return this.error.equals(((AutoValue_StateObservable_ErrorWrapper) obj).error);
        }
        return false;
    }

    public final int hashCode() {
        return this.error.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ErrorWrapper{error=" + this.error + "}";
    }
}

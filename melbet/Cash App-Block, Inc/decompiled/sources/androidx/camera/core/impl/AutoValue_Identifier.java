package androidx.camera.core.impl;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;

/* loaded from: classes3.dex */
public final class AutoValue_Identifier {
    public final Object value;

    public AutoValue_Identifier(Object obj) {
        this.value = obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof AutoValue_Identifier) && this.value == ((AutoValue_Identifier) obj).value;
    }

    public final int hashCode() {
        return this.value.hashCode() ^ 1000003;
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline1.m(new StringBuilder("Identifier{value="), this.value, "}");
    }
}

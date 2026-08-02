package androidx.camera.camera2.pipe;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class AudioRestrictionMode {
    public final int value;

    public final boolean equals(Object obj) {
        if (obj instanceof AudioRestrictionMode) {
            return this.value == ((AudioRestrictionMode) obj).value;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.value);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AudioRestrictionMode(value=", this.value, ')');
    }
}

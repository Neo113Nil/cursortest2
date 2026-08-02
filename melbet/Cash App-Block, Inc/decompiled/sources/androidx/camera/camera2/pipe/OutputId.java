package androidx.camera.camera2.pipe;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class OutputId {
    public final int value;

    public /* synthetic */ OutputId(int i) {
        this.value = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof OutputId) {
            return this.value == ((OutputId) obj).value;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.value);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.value, "Output-");
    }
}

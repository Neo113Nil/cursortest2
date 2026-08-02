package androidx.camera.camera2.pipe;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class Lock3ABehavior {
    public final int value;

    public final boolean equals(Object obj) {
        if (obj instanceof Lock3ABehavior) {
            return this.value == ((Lock3ABehavior) obj).value;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.value);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Lock3ABehavior(value=", this.value, ')');
    }
}

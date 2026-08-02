package androidx.camera.camera2.pipe;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class OutputStatus {
    public final int value;

    public final boolean equals(Object obj) {
        if (obj instanceof OutputStatus) {
            return this.value == ((OutputStatus) obj).value;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.value);
    }

    public final String toString() {
        int i = this.value;
        if (i == 0) {
            return "PENDING";
        }
        if (i == 1) {
            return "AVAILABLE";
        }
        if (i == 2) {
            return "UNAVAILABLE";
        }
        switch (i) {
            case 10:
                return "ERROR_OUTPUT_FAILED";
            case 11:
                return "ERROR_OUTPUT_ABORTED";
            case 12:
                return "ERROR_OUTPUT_MISSING";
            case 13:
                return "ERROR_OUTPUT_DROPPED";
            default:
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OutputStatus(value=", i, ')');
        }
    }
}

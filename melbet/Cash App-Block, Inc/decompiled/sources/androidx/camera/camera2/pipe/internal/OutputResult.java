package androidx.camera.camera2.pipe.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class OutputResult {
    public final Object result;

    public final boolean equals(Object obj) {
        if (obj instanceof OutputResult) {
            return Intrinsics.areEqual(this.result, ((OutputResult) obj).result);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.result;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "OutputResult(result=" + this.result + ')';
    }
}

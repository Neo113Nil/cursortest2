package androidx.camera.camera2.pipe;

import androidx.camera.camera2.pipe.compat.AndroidFrameMetadata;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Result3A {
    public final AndroidFrameMetadata frameMetadata;
    public final int status;

    public Result3A(int i, AndroidFrameMetadata androidFrameMetadata) {
        this.status = i;
        this.frameMetadata = androidFrameMetadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Result3A)) {
            return false;
        }
        Result3A result3A = (Result3A) obj;
        return this.status == result3A.status && Intrinsics.areEqual(this.frameMetadata, result3A.frameMetadata);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.status) * 31;
        AndroidFrameMetadata androidFrameMetadata = this.frameMetadata;
        return hashCode + (androidFrameMetadata == null ? 0 : androidFrameMetadata.hashCode());
    }

    public final String toString() {
        return "Result3A(status=" + ((Object) ("Status(value=" + this.status + ')')) + ", frameMetadata=" + this.frameMetadata + ')';
    }
}

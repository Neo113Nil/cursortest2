package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.FrameNumber;
import androidx.camera.camera2.pipe.RequestFailure;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* loaded from: classes3.dex */
public final class ExtensionRequestFailure implements RequestFailure {
    public final long frameNumber;
    public final RequestMetadata requestMetadata;

    public ExtensionRequestFailure(RequestMetadata requestMetadata, long j) {
        requestMetadata.getClass();
        this.requestMetadata = requestMetadata;
        this.frameNumber = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ExtensionRequestFailure) {
            ExtensionRequestFailure extensionRequestFailure = (ExtensionRequestFailure) obj;
            return Intrinsics.areEqual(this.requestMetadata, extensionRequestFailure.requestMetadata) && this.frameNumber == extensionRequestFailure.frameNumber;
        }
        return false;
    }

    @Override // androidx.camera.camera2.pipe.RequestFailure
    public final int getReason() {
        return 0;
    }

    @Override // androidx.camera.camera2.pipe.RequestFailure
    public final boolean getWasImageCaptured() {
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.requestMetadata.hashCode() * 31, 31, false), 31, this.frameNumber);
    }

    public final String toString() {
        return "ExtensionRequestFailure(requestMetadata=" + this.requestMetadata + ", wasImageCaptured=false, frameNumber=" + ((Object) FrameNumber.m47toStringimpl(this.frameNumber)) + ", reason=0)";
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public final Object unwrapAs(KClass kClass) {
        kClass.getClass();
        return null;
    }
}

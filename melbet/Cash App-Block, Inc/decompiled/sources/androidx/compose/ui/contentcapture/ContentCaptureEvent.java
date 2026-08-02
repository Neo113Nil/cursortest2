package androidx.compose.ui.contentcapture;

import androidx.biometric.BiometricPrompt;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ContentCaptureEvent {
    public final int id;
    public final BiometricPrompt structureCompat;
    public final long timestamp;

    /* renamed from: type, reason: collision with root package name */
    public final ContentCaptureEventType f856type;

    public ContentCaptureEvent(int i, long j, ContentCaptureEventType contentCaptureEventType, BiometricPrompt biometricPrompt) {
        this.id = i;
        this.timestamp = j;
        this.f856type = contentCaptureEventType;
        this.structureCompat = biometricPrompt;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentCaptureEvent)) {
            return false;
        }
        ContentCaptureEvent contentCaptureEvent = (ContentCaptureEvent) obj;
        return this.id == contentCaptureEvent.id && this.timestamp == contentCaptureEvent.timestamp && this.f856type == contentCaptureEvent.f856type && Intrinsics.areEqual(this.structureCompat, contentCaptureEvent.structureCompat);
    }

    public final int getId() {
        return this.id;
    }

    public final BiometricPrompt getStructureCompat() {
        return this.structureCompat;
    }

    public final ContentCaptureEventType getType() {
        return this.f856type;
    }

    public final int hashCode() {
        int hashCode = (this.f856type.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Integer.hashCode(this.id) * 31, 31, this.timestamp)) * 31;
        BiometricPrompt biometricPrompt = this.structureCompat;
        return hashCode + (biometricPrompt == null ? 0 : biometricPrompt.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.id + ", timestamp=" + this.timestamp + ", type=" + this.f856type + ", structureCompat=" + this.structureCompat + ')';
    }
}

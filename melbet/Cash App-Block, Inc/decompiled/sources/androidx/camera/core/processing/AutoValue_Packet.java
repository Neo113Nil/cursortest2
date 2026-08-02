package androidx.camera.core.processing;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.utils.Exif;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class AutoValue_Packet {
    public final CameraCaptureResult cameraCaptureResult;
    public final Rect cropRect;
    public final Object data;
    public final Exif exif;

    /* renamed from: format, reason: collision with root package name */
    public final int f846format;
    public final int rotationDegrees;
    public final Matrix sensorToBufferTransform;
    public final Size size;

    public AutoValue_Packet(Object obj, Exif exif, int i, Size size, Rect rect, int i2, Matrix matrix, CameraCaptureResult cameraCaptureResult) {
        if (obj == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null data");
            throw null;
        }
        this.data = obj;
        this.exif = exif;
        this.f846format = i;
        this.size = size;
        if (rect == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null cropRect");
            throw null;
        }
        this.cropRect = rect;
        this.rotationDegrees = i2;
        if (matrix == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null sensorToBufferTransform");
            throw null;
        }
        this.sensorToBufferTransform = matrix;
        if (cameraCaptureResult != null) {
            this.cameraCaptureResult = cameraCaptureResult;
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("Null cameraCaptureResult");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r0 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutoValue_Packet) {
            AutoValue_Packet autoValue_Packet = (AutoValue_Packet) obj;
            if (this.data.equals(autoValue_Packet.data)) {
                Exif exif = autoValue_Packet.exif;
                Exif exif2 = this.exif;
                if (exif2 != null) {
                    if (exif2 != exif) {
                        return false;
                    }
                }
                if (this.f846format == autoValue_Packet.f846format && this.size.equals(autoValue_Packet.size) && this.cropRect.equals(autoValue_Packet.cropRect) && this.rotationDegrees == autoValue_Packet.rotationDegrees && this.sensorToBufferTransform.equals(autoValue_Packet.sensorToBufferTransform) && this.cameraCaptureResult.equals(autoValue_Packet.cameraCaptureResult)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.data.hashCode() ^ 1000003) * 1000003;
        Exif exif = this.exif;
        return this.cameraCaptureResult.hashCode() ^ ((((((((((((hashCode ^ (exif == null ? 0 : exif.hashCode())) * 1000003) ^ this.f846format) * 1000003) ^ this.size.hashCode()) * 1000003) ^ this.cropRect.hashCode()) * 1000003) ^ this.rotationDegrees) * 1000003) ^ this.sensorToBufferTransform.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Packet{data=" + this.data + ", exif=" + this.exif + ", format=" + this.f846format + ", size=" + this.size + ", cropRect=" + this.cropRect + ", rotationDegrees=" + this.rotationDegrees + ", sensorToBufferTransform=" + this.sensorToBufferTransform + ", cameraCaptureResult=" + this.cameraCaptureResult + "}";
    }
}

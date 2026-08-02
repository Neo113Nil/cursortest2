package androidx.camera.core;

import android.graphics.Matrix;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.impl.utils.ExifData;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class AutoValue_ImmutableImageInfo implements ImageInfo {
    public final int flashState;
    public final int rotationDegrees;
    public final Matrix sensorToBufferTransformMatrix;
    public final TagBundle tagBundle;
    public final long timestamp;

    public AutoValue_ImmutableImageInfo(TagBundle tagBundle, long j, int i, Matrix matrix, int i2) {
        if (tagBundle == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null tagBundle");
            throw null;
        }
        this.tagBundle = tagBundle;
        this.timestamp = j;
        this.rotationDegrees = i;
        if (matrix == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null sensorToBufferTransformMatrix");
            throw null;
        }
        this.sensorToBufferTransformMatrix = matrix;
        this.flashState = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutoValue_ImmutableImageInfo) {
            AutoValue_ImmutableImageInfo autoValue_ImmutableImageInfo = (AutoValue_ImmutableImageInfo) obj;
            if (this.tagBundle.equals(autoValue_ImmutableImageInfo.tagBundle) && this.timestamp == autoValue_ImmutableImageInfo.timestamp && this.rotationDegrees == autoValue_ImmutableImageInfo.rotationDegrees && this.sensorToBufferTransformMatrix.equals(autoValue_ImmutableImageInfo.sensorToBufferTransformMatrix) && this.flashState == autoValue_ImmutableImageInfo.flashState) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.ImageInfo
    public final int getFlashState() {
        return this.flashState;
    }

    @Override // androidx.camera.core.ImageInfo
    public final int getRotationDegrees() {
        return this.rotationDegrees;
    }

    @Override // androidx.camera.core.ImageInfo
    public final TagBundle getTagBundle() {
        return this.tagBundle;
    }

    @Override // androidx.camera.core.ImageInfo
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final int hashCode() {
        int hashCode = (this.tagBundle.hashCode() ^ 1000003) * 1000003;
        long j = this.timestamp;
        return this.flashState ^ ((((((hashCode ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.rotationDegrees) * 1000003) ^ this.sensorToBufferTransformMatrix.hashCode()) * 1000003);
    }

    @Override // androidx.camera.core.ImageInfo
    public final void populateExifData(ExifData.Builder builder) {
        builder.setOrientationDegrees(this.rotationDegrees);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableImageInfo{tagBundle=");
        sb.append(this.tagBundle);
        sb.append(", timestamp=");
        sb.append(this.timestamp);
        sb.append(", rotationDegrees=");
        sb.append(this.rotationDegrees);
        sb.append(", sensorToBufferTransformMatrix=");
        sb.append(this.sensorToBufferTransformMatrix);
        sb.append(", flashState=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.flashState, "}", sb);
    }
}

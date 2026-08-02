package androidx.camera.core.processing.util;

import android.graphics.Rect;
import android.util.Size;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class AutoValue_OutConfig {
    public final Rect getCropRect;
    public final int getFormat;
    public final int getRotationDegrees;
    public final Size getSize;
    public final int getTargets;
    public final UUID getUuid;
    public final boolean isMirroring;

    public AutoValue_OutConfig(UUID uuid, int i, int i2, Rect rect, Size size, int i3, boolean z) {
        if (uuid == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null getUuid");
            throw null;
        }
        this.getUuid = uuid;
        this.getTargets = i;
        this.getFormat = i2;
        if (rect == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null getCropRect");
            throw null;
        }
        this.getCropRect = rect;
        if (size == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null getSize");
            throw null;
        }
        this.getSize = size;
        this.getRotationDegrees = i3;
        this.isMirroring = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_OutConfig)) {
            return false;
        }
        AutoValue_OutConfig autoValue_OutConfig = (AutoValue_OutConfig) obj;
        return this.getUuid.equals(autoValue_OutConfig.getUuid) && this.getTargets == autoValue_OutConfig.getTargets && this.getFormat == autoValue_OutConfig.getFormat && this.getCropRect.equals(autoValue_OutConfig.getCropRect) && this.getSize.equals(autoValue_OutConfig.getSize) && this.getRotationDegrees == autoValue_OutConfig.getRotationDegrees && this.isMirroring == autoValue_OutConfig.isMirroring;
    }

    public final int hashCode() {
        return (((this.isMirroring ? 1231 : 1237) ^ ((((((((((((this.getUuid.hashCode() ^ 1000003) * 1000003) ^ this.getTargets) * 1000003) ^ this.getFormat) * 1000003) ^ this.getCropRect.hashCode()) * 1000003) ^ this.getSize.hashCode()) * 1000003) ^ this.getRotationDegrees) * 1000003)) * 1000003) ^ 1237;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutConfig{getUuid=");
        sb.append(this.getUuid);
        sb.append(", getTargets=");
        sb.append(this.getTargets);
        sb.append(", getFormat=");
        sb.append(this.getFormat);
        sb.append(", getCropRect=");
        sb.append(this.getCropRect);
        sb.append(", getSize=");
        sb.append(this.getSize);
        sb.append(", getRotationDegrees=");
        sb.append(this.getRotationDegrees);
        sb.append(", isMirroring=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isMirroring, ", shouldRespectInputCropRect=false}");
    }
}

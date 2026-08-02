package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.DynamicRange;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;

/* loaded from: classes3.dex */
public final class AutoValue_AttachedSurfaceInfo {
    public final List captureTypes;
    public final int customMaxFrameRate;
    public final DynamicRange dynamicRange;
    public final int imageFormat;
    public final Config implementationOptions;
    public final int sessionType;
    public final Size size;
    public final boolean strictFrameRateRequired;
    public final SurfaceConfig surfaceConfig;
    public final Range targetFrameRate;

    public AutoValue_AttachedSurfaceInfo(SurfaceConfig surfaceConfig, int i, Size size, DynamicRange dynamicRange, List list, Config config, int i2, Range range, boolean z, int i3) {
        this.surfaceConfig = surfaceConfig;
        this.imageFormat = i;
        this.size = size;
        if (dynamicRange == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null dynamicRange");
            throw null;
        }
        this.dynamicRange = dynamicRange;
        if (list == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null captureTypes");
            throw null;
        }
        this.captureTypes = list;
        this.implementationOptions = config;
        this.sessionType = i2;
        if (range == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null targetFrameRate");
            throw null;
        }
        this.targetFrameRate = range;
        this.strictFrameRateRequired = z;
        this.customMaxFrameRate = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_AttachedSurfaceInfo)) {
            return false;
        }
        AutoValue_AttachedSurfaceInfo autoValue_AttachedSurfaceInfo = (AutoValue_AttachedSurfaceInfo) obj;
        if (!this.surfaceConfig.equals(autoValue_AttachedSurfaceInfo.surfaceConfig) || this.imageFormat != autoValue_AttachedSurfaceInfo.imageFormat || !this.size.equals(autoValue_AttachedSurfaceInfo.size) || !this.dynamicRange.equals(autoValue_AttachedSurfaceInfo.dynamicRange) || !this.captureTypes.equals(autoValue_AttachedSurfaceInfo.captureTypes)) {
            return false;
        }
        Config config = autoValue_AttachedSurfaceInfo.implementationOptions;
        Config config2 = this.implementationOptions;
        if (config2 == null) {
            if (config != null) {
                return false;
            }
        } else if (!config2.equals(config)) {
            return false;
        }
        return this.sessionType == autoValue_AttachedSurfaceInfo.sessionType && this.targetFrameRate.equals(autoValue_AttachedSurfaceInfo.targetFrameRate) && this.strictFrameRateRequired == autoValue_AttachedSurfaceInfo.strictFrameRateRequired && this.customMaxFrameRate == autoValue_AttachedSurfaceInfo.customMaxFrameRate;
    }

    public final int hashCode() {
        int hashCode = (((((((((this.surfaceConfig.hashCode() ^ 1000003) * 1000003) ^ this.imageFormat) * 1000003) ^ this.size.hashCode()) * 1000003) ^ this.dynamicRange.hashCode()) * 1000003) ^ this.captureTypes.hashCode()) * 1000003;
        Config config = this.implementationOptions;
        return this.customMaxFrameRate ^ ((((((((hashCode ^ (config == null ? 0 : config.hashCode())) * 1000003) ^ this.sessionType) * 1000003) ^ this.targetFrameRate.hashCode()) * 1000003) ^ (this.strictFrameRateRequired ? 1231 : 1237)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttachedSurfaceInfo{surfaceConfig=");
        sb.append(this.surfaceConfig);
        sb.append(", imageFormat=");
        sb.append(this.imageFormat);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", dynamicRange=");
        sb.append(this.dynamicRange);
        sb.append(", captureTypes=");
        sb.append(this.captureTypes);
        sb.append(", implementationOptions=");
        sb.append(this.implementationOptions);
        sb.append(", sessionType=");
        sb.append(this.sessionType);
        sb.append(", targetFrameRate=");
        sb.append(this.targetFrameRate);
        sb.append(", strictFrameRateRequired=");
        sb.append(this.strictFrameRateRequired);
        sb.append(", customMaxFrameRate=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.customMaxFrameRate, "}", sb);
    }
}

package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.DynamicRange;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.workflow1.internal.SubtreeManager;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class AutoValue_StreamSpec {
    public static final Range FRAME_RATE_RANGE_UNSPECIFIED = new Range(0, 0);
    public final DynamicRange dynamicRange;
    public final Range expectedFrameRateRange;
    public final Config implementationOptions;
    public final Size originalConfiguredResolution;
    public final Size resolution;
    public final int sessionType;
    public final boolean zslDisabled;

    public AutoValue_StreamSpec(Size size, Size size2, DynamicRange dynamicRange, int i, Range range, Config config, boolean z) {
        this.resolution = size;
        this.originalConfiguredResolution = size2;
        this.dynamicRange = dynamicRange;
        this.sessionType = i;
        this.expectedFrameRateRange = range;
        this.implementationOptions = config;
        this.zslDisabled = z;
    }

    public static SubtreeManager builder(Size size) {
        SubtreeManager subtreeManager = new SubtreeManager();
        if (size == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null resolution");
            return null;
        }
        subtreeManager.snapshotCache = size;
        subtreeManager.contextForChildren = size;
        subtreeManager.workflowSession = 0;
        Range range = FRAME_RATE_RANGE_UNSPECIFIED;
        if (range == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null expectedFrameRateRange");
            return null;
        }
        subtreeManager.interceptor = range;
        subtreeManager.emitActionToParent = DynamicRange.SDR;
        subtreeManager.children = Boolean.FALSE;
        return subtreeManager;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutoValue_StreamSpec) {
            AutoValue_StreamSpec autoValue_StreamSpec = (AutoValue_StreamSpec) obj;
            if (this.resolution.equals(autoValue_StreamSpec.resolution) && this.originalConfiguredResolution.equals(autoValue_StreamSpec.originalConfiguredResolution) && this.dynamicRange.equals(autoValue_StreamSpec.dynamicRange) && this.sessionType == autoValue_StreamSpec.sessionType && this.expectedFrameRateRange.equals(autoValue_StreamSpec.expectedFrameRateRange)) {
                Config config = autoValue_StreamSpec.implementationOptions;
                Config config2 = this.implementationOptions;
                if (config2 != null ? config2.equals(config) : config == null) {
                    if (this.zslDisabled == autoValue_StreamSpec.zslDisabled) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((((this.resolution.hashCode() ^ 1000003) * 1000003) ^ this.originalConfiguredResolution.hashCode()) * 1000003) ^ this.dynamicRange.hashCode()) * 1000003) ^ this.sessionType) * 1000003) ^ this.expectedFrameRateRange.hashCode()) * 1000003;
        Config config = this.implementationOptions;
        return (this.zslDisabled ? 1231 : 1237) ^ ((hashCode ^ (config == null ? 0 : config.hashCode())) * 1000003);
    }

    public final SubtreeManager toBuilder() {
        SubtreeManager subtreeManager = new SubtreeManager();
        subtreeManager.snapshotCache = this.resolution;
        subtreeManager.contextForChildren = this.originalConfiguredResolution;
        subtreeManager.emitActionToParent = this.dynamicRange;
        subtreeManager.workflowSession = Integer.valueOf(this.sessionType);
        subtreeManager.interceptor = this.expectedFrameRateRange;
        subtreeManager.idCounter = this.implementationOptions;
        subtreeManager.children = Boolean.valueOf(this.zslDisabled);
        return subtreeManager;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamSpec{resolution=");
        sb.append(this.resolution);
        sb.append(", originalConfiguredResolution=");
        sb.append(this.originalConfiguredResolution);
        sb.append(", dynamicRange=");
        sb.append(this.dynamicRange);
        sb.append(", sessionType=");
        sb.append(this.sessionType);
        sb.append(", expectedFrameRateRange=");
        sb.append(this.expectedFrameRateRange);
        sb.append(", implementationOptions=");
        sb.append(this.implementationOptions);
        sb.append(", zslDisabled=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.zslDisabled, "}");
    }
}

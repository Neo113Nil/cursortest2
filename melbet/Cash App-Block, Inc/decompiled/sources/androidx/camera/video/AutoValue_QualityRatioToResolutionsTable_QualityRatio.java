package androidx.camera.video;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class AutoValue_QualityRatioToResolutionsTable_QualityRatio {
    public final int aspectRatio;
    public final AutoValue_Quality_ConstantQuality quality;

    public AutoValue_QualityRatioToResolutionsTable_QualityRatio(AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality, int i) {
        if (autoValue_Quality_ConstantQuality == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null quality");
            throw null;
        }
        this.quality = autoValue_Quality_ConstantQuality;
        this.aspectRatio = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutoValue_QualityRatioToResolutionsTable_QualityRatio) {
            AutoValue_QualityRatioToResolutionsTable_QualityRatio autoValue_QualityRatioToResolutionsTable_QualityRatio = (AutoValue_QualityRatioToResolutionsTable_QualityRatio) obj;
            if (this.quality.equals(autoValue_QualityRatioToResolutionsTable_QualityRatio.quality) && this.aspectRatio == autoValue_QualityRatioToResolutionsTable_QualityRatio.aspectRatio) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.aspectRatio ^ ((this.quality.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QualityRatio{quality=");
        sb.append(this.quality);
        sb.append(", aspectRatio=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.aspectRatio, "}", sb);
    }
}

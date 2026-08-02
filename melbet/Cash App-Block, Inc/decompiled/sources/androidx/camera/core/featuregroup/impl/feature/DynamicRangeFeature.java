package androidx.camera.core.featuregroup.impl.feature;

import androidx.camera.core.DynamicRange;
import androidx.camera.core.LegacySessionConfig;
import androidx.camera.core.UseCase;
import androidx.camera.core.featuregroup.GroupableFeature;
import androidx.camera.core.impl.CameraInfoInternal;
import java.util.List;
import java.util.Set;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class DynamicRangeFeature extends GroupableFeature {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final DynamicRange dynamicRange = DynamicRange.HLG_10_BIT;
    public final FeatureTypeInternal featureTypeInternal = FeatureTypeInternal.DYNAMIC_RANGE;

    @Override // androidx.camera.core.featuregroup.GroupableFeature
    public final FeatureTypeInternal getFeatureTypeInternal() {
        return this.featureTypeInternal;
    }

    @Override // androidx.camera.core.featuregroup.GroupableFeature
    public final boolean isSupportedIndividually(LegacySessionConfig legacySessionConfig, CameraInfoInternal cameraInfoInternal) {
        Set supportedDynamicRanges = cameraInfoInternal.getSupportedDynamicRanges();
        supportedDynamicRanges.getClass();
        StringUtilsKt.d("DynamicRangeFeature", "isSupportedIndividually: cameraInfoSupportedDynamicRanges = " + supportedDynamicRanges + ", this = " + this);
        DynamicRange dynamicRange = this.dynamicRange;
        if (!supportedDynamicRanges.contains(dynamicRange)) {
            return false;
        }
        for (UseCase useCase : (List) legacySessionConfig.useCases) {
            Set supportedDynamicRanges2 = useCase.getSupportedDynamicRanges(cameraInfoInternal);
            StringUtilsKt.d("DynamicRangeFeature", "isSupportedIndividually: useCaseSupportedDynamicRanges = " + supportedDynamicRanges2 + ", this = " + this + ", useCases = " + useCase);
            if (supportedDynamicRanges2 != null && !supportedDynamicRanges2.contains(dynamicRange)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return "DynamicRangeFeature(dynamicRange=" + this.dynamicRange + ')';
    }
}

package androidx.camera.core.featuregroup.impl.feature;

import android.util.Range;
import androidx.camera.core.featuregroup.GroupableFeature;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class FpsRangeFeature extends GroupableFeature {
    public static final Range DEFAULT_FPS_RANGE = new Range(30, 30);
    public final int minFps = 60;
    public final int maxFps = 60;
    public final FeatureTypeInternal featureTypeInternal = FeatureTypeInternal.FPS_RANGE;

    @Override // androidx.camera.core.featuregroup.GroupableFeature
    public final FeatureTypeInternal getFeatureTypeInternal() {
        return this.featureTypeInternal;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FpsRangeFeature(minFps=");
        sb.append(this.minFps);
        sb.append(", maxFps=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.maxFps, ')');
    }
}

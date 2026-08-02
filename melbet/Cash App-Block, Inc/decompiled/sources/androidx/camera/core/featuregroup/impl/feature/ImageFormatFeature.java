package androidx.camera.core.featuregroup.impl.feature;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.core.featuregroup.GroupableFeature;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class ImageFormatFeature extends GroupableFeature {
    public final int imageCaptureOutputFormat = 1;
    public final FeatureTypeInternal featureTypeInternal = FeatureTypeInternal.IMAGE_FORMAT;

    @Override // androidx.camera.core.featuregroup.GroupableFeature
    public final FeatureTypeInternal getFeatureTypeInternal() {
        return this.featureTypeInternal;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageFormatFeature(imageCaptureOutputFormat=");
        int i = this.imageCaptureOutputFormat;
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, i != 0 ? i != 1 ? JsonLogicResult$Success$$ExternalSyntheticOutline0.m("UNDEFINED(", i, ')') : "JPEG_R" : "JPEG", ')');
    }
}

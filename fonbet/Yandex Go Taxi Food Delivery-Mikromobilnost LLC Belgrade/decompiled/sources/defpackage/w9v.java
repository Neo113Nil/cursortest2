package defpackage;

import androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal;

/* loaded from: classes10.dex */
public final class w9v extends b3u {
    public final int a = 1;
    public final FeatureTypeInternal b = FeatureTypeInternal.IMAGE_FORMAT;

    @Override // defpackage.b3u
    public final FeatureTypeInternal a() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageFormatFeature(imageCaptureOutputFormat=");
        int i = this.a;
        return b64.p(sb, i != 0 ? i != 1 ? oyr.e(')', i, "UNDEFINED(") : "JPEG_R" : "JPEG", ')');
    }
}

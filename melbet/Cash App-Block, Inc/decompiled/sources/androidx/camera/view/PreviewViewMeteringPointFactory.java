package androidx.camera.view;

import android.graphics.PointF;
import android.graphics.Rect;
import androidx.credentials.Credential;

/* loaded from: classes3.dex */
public final class PreviewViewMeteringPointFactory extends Credential {
    public final PreviewTransformation mPreviewTransformation;
    public Rect mSensorRect;

    static {
        new PointF(2.0f, 2.0f);
    }

    public PreviewViewMeteringPointFactory(PreviewTransformation previewTransformation) {
        super(1);
        this.mSensorRect = null;
        this.mPreviewTransformation = previewTransformation;
    }
}

package androidx.camera.core;

import android.view.Display;
import androidx.credentials.Credential;

/* loaded from: classes3.dex */
public final class DisplayOrientedMeteringPointFactory extends Credential {
    public final CameraInfo mCameraInfo;
    public final Display mDisplay;
    public final float mHeight;
    public final float mWidth;

    public DisplayOrientedMeteringPointFactory(Display display, CameraInfo cameraInfo, float f, float f2) {
        super(1);
        this.mWidth = f;
        this.mHeight = f2;
        this.mDisplay = display;
        this.mCameraInfo = cameraInfo;
    }
}

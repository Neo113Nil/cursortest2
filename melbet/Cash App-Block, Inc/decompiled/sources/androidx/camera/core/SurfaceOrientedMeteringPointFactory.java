package androidx.camera.core;

import androidx.credentials.Credential;

/* loaded from: classes3.dex */
public final class SurfaceOrientedMeteringPointFactory extends Credential {
    public final float mHeight;
    public final float mWidth;

    public SurfaceOrientedMeteringPointFactory(float f, float f2) {
        super(1);
        this.mWidth = f;
        this.mHeight = f2;
    }
}

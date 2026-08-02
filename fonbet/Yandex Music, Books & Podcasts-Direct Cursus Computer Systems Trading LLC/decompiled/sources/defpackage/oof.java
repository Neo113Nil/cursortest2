package defpackage;

import android.media.ImageReader;

/* loaded from: classes.dex */
public final class oof implements ImageReader.OnImageAvailableListener {
    public final /* synthetic */ zt3 a;

    public oof(zt3 zt3Var) {
        this.a = zt3Var;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        r7o r7oVar = z7o.b;
        this.a.resumeWith(imageReader.acquireLatestImage());
    }
}

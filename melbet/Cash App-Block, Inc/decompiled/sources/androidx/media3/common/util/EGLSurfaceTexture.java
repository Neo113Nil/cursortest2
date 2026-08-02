package androidx.media3.common.util;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* loaded from: classes3.dex */
public final class EGLSurfaceTexture implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static final int[] EGL_CONFIG_ATTRIBUTES = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    public EGLContext context;
    public EGLDisplay display;
    public final Handler handler;
    public EGLSurface surface;
    public SurfaceTexture texture;
    public final int[] textureIdHolder = new int[1];

    public EGLSurfaceTexture(Handler handler) {
        this.handler = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.texture;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}

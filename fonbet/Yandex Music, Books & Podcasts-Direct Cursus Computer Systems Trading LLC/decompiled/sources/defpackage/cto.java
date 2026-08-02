package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.GLES20;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class cto implements zau, ft3 {
    public final AtomicBoolean a = new AtomicBoolean();
    public final AtomicBoolean b = new AtomicBoolean(true);
    public final f4m c = new f4m(2, false);
    public final z0j d = new z0j(12);
    public final lis e = new lis(0);
    public final lis f = new lis(0);
    public final float[] g = new float[16];
    public final float[] h = new float[16];
    public int i;
    public SurfaceTexture j;

    public final SurfaceTexture a() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            ot0.v();
            this.c.v();
            ot0.v();
        } catch (zcd e) {
            tt0.B("Failed to initialize the renderer", e);
        }
        if (yut.a(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT)) {
            throw new zcd("No current context");
        }
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        ot0.v();
        int i = iArr[0];
        ot0.t(36197, i);
        this.i = i;
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.i);
        this.j = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new bto(0, this));
        return this.j;
    }
}

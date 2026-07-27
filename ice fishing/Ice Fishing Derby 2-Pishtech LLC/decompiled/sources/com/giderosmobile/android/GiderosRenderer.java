package com.giderosmobile.android;

import android.opengl.GLSurfaceView;
import com.giderosmobile.android.player.GiderosApplication;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: ifd2Activity.java */
/* loaded from: classes.dex */
class GiderosRenderer implements GLSurfaceView.Renderer {
    GiderosRenderer() {
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GiderosApplication.getInstance().onSurfaceCreated(null);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GiderosApplication.getInstance().onSurfaceChanged(i, i2, null);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        GiderosApplication giderosApplication = GiderosApplication.getInstance();
        if (giderosApplication != null) {
            giderosApplication.onDrawFrame(false);
            ifd2Activity.dismisSplash();
        }
    }
}

package com.giderosmobile.android.player;

import android.opengl.GLSurfaceView;
import android.util.Log;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

/* loaded from: classes.dex */
public class GiderosConfigChooser implements GLSurfaceView.EGLConfigChooser {
    private static final String kTag = "Gideros";
    private int[] mValue;
    int numConfigs = 64;

    @Override // android.opengl.GLSurfaceView.EGLConfigChooser
    public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
        int i;
        GiderosConfigChooser giderosConfigChooser = this;
        int[] iArr = new int[1];
        giderosConfigChooser.mValue = iArr;
        int i2 = giderosConfigChooser.numConfigs;
        EGLConfig[] eGLConfigArr = new EGLConfig[i2];
        if (!egl10.eglChooseConfig(eGLDisplay, new int[]{12324, 5, 12323, 6, 12322, 5, 12321, 0, 12325, 0, 12326, 0, 12352, 4, 12344}, eGLConfigArr, i2, iArr)) {
            throw new IllegalArgumentException("data eglChooseConfig failed");
        }
        giderosConfigChooser.numConfigs = giderosConfigChooser.mValue[0];
        Log.d(kTag, "eglChooseConfig returned " + giderosConfigChooser.numConfigs + "configuraions");
        int i3 = -1;
        int i4 = 0;
        for (int i5 = 0; i5 < giderosConfigChooser.numConfigs; i5++) {
            int findConfigAttrib = giderosConfigChooser.findConfigAttrib(egl10, eGLDisplay, eGLConfigArr[i5], 12324, 0);
            int findConfigAttrib2 = findConfigAttrib(egl10, eGLDisplay, eGLConfigArr[i5], 12323, 0);
            int findConfigAttrib3 = findConfigAttrib(egl10, eGLDisplay, eGLConfigArr[i5], 12322, 0);
            int findConfigAttrib4 = findConfigAttrib(egl10, eGLDisplay, eGLConfigArr[i5], 12321, 0);
            int findConfigAttrib5 = findConfigAttrib(egl10, eGLDisplay, eGLConfigArr[i5], 12325, 0);
            giderosConfigChooser = this;
            int findConfigAttrib6 = giderosConfigChooser.findConfigAttrib(egl10, eGLDisplay, eGLConfigArr[i5], 12326, 0);
            Log.i(kTag, "config " + i5 + " R:" + findConfigAttrib + " G:" + findConfigAttrib2 + " B:" + findConfigAttrib3 + " A:" + findConfigAttrib4 + " D:" + findConfigAttrib5 + " S:" + findConfigAttrib6);
            int i6 = ((findConfigAttrib6 + findConfigAttrib5) * 100) + findConfigAttrib4;
            if (i6 > i4) {
                Log.i(kTag, "Choosing config " + i5 + " Quality:" + i6);
                i4 = i6;
                i3 = i5;
            }
        }
        if (i3 == -1) {
            Log.w(kTag, "Did not find sane config, using first (possibly 3D and Path2D won't work)");
            i = 0;
        } else {
            i = i3;
        }
        EGLConfig eGLConfig = giderosConfigChooser.numConfigs > 0 ? eGLConfigArr[i] : null;
        if (eGLConfig != null) {
            return eGLConfig;
        }
        throw new IllegalArgumentException("No config chosen");
    }

    private int findConfigAttrib(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
        return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.mValue) ? this.mValue[0] : i2;
    }
}

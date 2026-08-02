package com.squareup.cash.graphics.backend.gl.core;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class WindowSurface {
    public final EglCore eglCore;
    public EGLSurface eglSurface;

    public WindowSurface(SurfaceTexture surfaceTexture) {
        surfaceTexture.getClass();
        EglCore eglCore = new EglCore(0);
        eglCore.eglDisplay = EGL14.EGL_NO_DISPLAY;
        eglCore.eglContext = EGL14.EGL_NO_CONTEXT;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        eglCore.eglDisplay = eglGetDisplay;
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            OptionalProvider$$ExternalSyntheticLambda0.m$1("Failed to get EGL14 display");
            throw null;
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            eglCore.eglDisplay = null;
            OptionalProvider$$ExternalSyntheticLambda0.m$1("Failed to initialize EGL14");
            throw null;
        }
        EGLConfig config = eglCore.getConfig(3);
        if (config != null) {
            EGLContext eglCreateContext = EGL14.eglCreateContext((EGLDisplay) eglCore.eglDisplay, config, EGL14.EGL_NO_CONTEXT, new int[]{12440, 3, 12344}, 0);
            if (EGL14.eglGetError() == 12288) {
                eglCore.eglConfig = config;
                eglCore.eglContext = eglCreateContext;
            }
        }
        if (((EGLContext) eglCore.eglContext) == EGL14.EGL_NO_CONTEXT) {
            EGLConfig config2 = eglCore.getConfig(2);
            if (config2 == null) {
                OptionalProvider$$ExternalSyntheticLambda0.m$1("Unable to find a suitable EGLConfig");
                throw null;
            }
            EGLContext eglCreateContext2 = EGL14.eglCreateContext((EGLDisplay) eglCore.eglDisplay, config2, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
            EglCore.checkEglError("eglCreateContext");
            eglCore.eglConfig = config2;
            eglCore.eglContext = eglCreateContext2;
        }
        int[] iArr2 = new int[1];
        EGL14.eglQueryContext((EGLDisplay) eglCore.eglDisplay, (EGLContext) eglCore.eglContext, 12440, iArr2, 0);
        Timber.Forest.d(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(iArr2[0], "EGLContext created, client version "), new Object[0]);
        this.eglCore = eglCore;
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface((EGLDisplay) eglCore.eglDisplay, (EGLConfig) eglCore.eglConfig, surfaceTexture, new int[]{12344}, 0);
        EglCore.checkEglError("eglCreateWindowSurface");
        if (eglCreateWindowSurface != null) {
            this.eglSurface = eglCreateWindowSurface;
        } else {
            OptionalProvider$$ExternalSyntheticLambda0.m$1("surface was null");
            throw null;
        }
    }

    public final void release() {
        EGLSurface eGLSurface = this.eglSurface;
        EglCore eglCore = this.eglCore;
        eglCore.getClass();
        eGLSurface.getClass();
        EGL14.eglDestroySurface((EGLDisplay) eglCore.eglDisplay, eGLSurface);
        EGLDisplay eGLDisplay = (EGLDisplay) eglCore.eglDisplay;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext((EGLDisplay) eglCore.eglDisplay, (EGLContext) eglCore.eglContext);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate((EGLDisplay) eglCore.eglDisplay);
        }
        eglCore.eglDisplay = EGL14.EGL_NO_DISPLAY;
        eglCore.eglContext = EGL14.EGL_NO_CONTEXT;
        eglCore.eglConfig = null;
        EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
        eGLSurface3.getClass();
        this.eglSurface = eGLSurface3;
    }

    public final void swapBuffers() {
        EGLSurface eGLSurface = this.eglSurface;
        EglCore eglCore = this.eglCore;
        eglCore.getClass();
        eGLSurface.getClass();
        if (EGL14.eglSwapBuffers((EGLDisplay) eglCore.eglDisplay, eGLSurface)) {
            return;
        }
        Timber.Forest.w("swapBuffers failed", new Object[0]);
    }
}

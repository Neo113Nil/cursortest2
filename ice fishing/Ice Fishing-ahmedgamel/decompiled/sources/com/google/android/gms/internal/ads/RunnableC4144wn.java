package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.wn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC4144wn implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f35654z = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: n, reason: collision with root package name */
    public final Handler f35655n;

    /* renamed from: u, reason: collision with root package name */
    public final int[] f35656u = new int[1];

    /* renamed from: v, reason: collision with root package name */
    public EGLDisplay f35657v;

    /* renamed from: w, reason: collision with root package name */
    public EGLContext f35658w;

    /* renamed from: x, reason: collision with root package name */
    public EGLSurface f35659x;

    /* renamed from: y, reason: collision with root package name */
    public SurfaceTexture f35660y;

    public RunnableC4144wn(Handler handler) {
        this.f35655n = handler;
    }

    public final void a(int i) {
        EGLSurface eglCreatePbufferSurface;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        AbstractC2792Sd.z("eglGetDisplay failed", eglGetDisplay != null);
        int[] iArr = new int[2];
        AbstractC2792Sd.z("eglInitialize failed", EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1));
        this.f35657v = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, f35654z, 0, eGLConfigArr, 0, 1, iArr2, 0);
        boolean z6 = eglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null;
        Object[] objArr = {Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]};
        String str = AbstractC3182eu.f30782a;
        AbstractC2792Sd.z(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z6);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = EGL14.eglCreateContext(this.f35657v, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        AbstractC2792Sd.z("eglCreateContext failed", eglCreateContext != null);
        this.f35658w = eglCreateContext;
        EGLDisplay eGLDisplay = this.f35657v;
        if (i == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            AbstractC2792Sd.z("eglCreatePbufferSurface failed", eglCreatePbufferSurface != null);
        }
        AbstractC2792Sd.z("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext));
        this.f35659x = eglCreatePbufferSurface;
        int[] iArr3 = this.f35656u;
        GLES20.glGenTextures(1, iArr3, 0);
        StringBuilder sb = new StringBuilder();
        MA.q(4, "initialCapacity");
        Object[] objArr2 = new Object[4];
        boolean z9 = false;
        int i4 = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z9) {
                sb.append('\n');
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = "error code: 0x".concat(String.valueOf(Integer.toHexString(glGetError)));
            }
            sb.append("glError: ");
            sb.append(gluErrorString);
            Integer valueOf = Integer.valueOf(glGetError);
            int length = objArr2.length;
            int i6 = i4 + 1;
            int d9 = MB.d(length, i6);
            if (d9 > length) {
                objArr2 = Arrays.copyOf(objArr2, d9);
            }
            objArr2[i4] = valueOf;
            i4 = i6;
            z9 = true;
        }
        if (z9) {
            throw new C2598Gn(sb.toString(), RB.p(objArr2, i4));
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr3[0]);
        this.f35660y = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    public final void b() {
        this.f35655n.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f35660y;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f35656u, 0);
            }
            EGLDisplay eGLDisplay = this.f35657v;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f35657v;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f35659x;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f35657v, this.f35659x);
            }
            EGLContext eGLContext = this.f35658w;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f35657v, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = this.f35657v;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f35657v);
            }
            this.f35657v = null;
            this.f35658w = null;
            this.f35659x = null;
            this.f35660y = null;
        } catch (Throwable th) {
            EGLDisplay eGLDisplay4 = this.f35657v;
            if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay5 = this.f35657v;
                EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay5, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface4 = this.f35659x;
            if (eGLSurface4 != null && !eGLSurface4.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f35657v, this.f35659x);
            }
            EGLContext eGLContext2 = this.f35658w;
            if (eGLContext2 != null) {
                EGL14.eglDestroyContext(this.f35657v, eGLContext2);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay6 = this.f35657v;
            if (eGLDisplay6 != null && !eGLDisplay6.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f35657v);
            }
            this.f35657v = null;
            this.f35658w = null;
            this.f35659x = null;
            this.f35660y = null;
            throw th;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f35655n.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f35660y;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}

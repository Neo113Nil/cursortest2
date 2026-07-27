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

/* renamed from: com.google.android.gms.internal.ads.vn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC4067vn implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f34735z = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: n, reason: collision with root package name */
    public final Handler f34736n;

    /* renamed from: u, reason: collision with root package name */
    public final int[] f34737u = new int[1];

    /* renamed from: v, reason: collision with root package name */
    public EGLDisplay f34738v;

    /* renamed from: w, reason: collision with root package name */
    public EGLContext f34739w;

    /* renamed from: x, reason: collision with root package name */
    public EGLSurface f34740x;

    /* renamed from: y, reason: collision with root package name */
    public SurfaceTexture f34741y;

    public RunnableC4067vn(Handler handler) {
        this.f34736n = handler;
    }

    public final void a(int i) {
        EGLSurface eglCreatePbufferSurface;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        AbstractC2772Sd.z("eglGetDisplay failed", eglGetDisplay != null);
        int[] iArr = new int[2];
        AbstractC2772Sd.z("eglInitialize failed", EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1));
        this.f34738v = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, f34735z, 0, eGLConfigArr, 0, 1, iArr2, 0);
        boolean z3 = eglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null;
        Object[] objArr = {Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]};
        String str = AbstractC3159eu.f29993a;
        AbstractC2772Sd.z(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z3);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = EGL14.eglCreateContext(this.f34738v, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        AbstractC2772Sd.z("eglCreateContext failed", eglCreateContext != null);
        this.f34739w = eglCreateContext;
        EGLDisplay eGLDisplay = this.f34738v;
        if (i == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            AbstractC2772Sd.z("eglCreatePbufferSurface failed", eglCreatePbufferSurface != null);
        }
        AbstractC2772Sd.z("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext));
        this.f34740x = eglCreatePbufferSurface;
        int[] iArr3 = this.f34737u;
        GLES20.glGenTextures(1, iArr3, 0);
        StringBuilder sb = new StringBuilder();
        MA.q(4, "initialCapacity");
        Object[] objArr2 = new Object[4];
        boolean z6 = false;
        int i6 = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z6) {
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
            int i9 = i6 + 1;
            int d2 = MB.d(length, i9);
            if (d2 > length) {
                objArr2 = Arrays.copyOf(objArr2, d2);
            }
            objArr2[i6] = valueOf;
            i6 = i9;
            z6 = true;
        }
        if (z6) {
            throw new C2561Fn(sb.toString(), RB.p(objArr2, i6));
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr3[0]);
        this.f34741y = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    public final void b() {
        this.f34736n.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f34741y;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f34737u, 0);
            }
            EGLDisplay eGLDisplay = this.f34738v;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f34738v;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f34740x;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f34738v, this.f34740x);
            }
            EGLContext eGLContext = this.f34739w;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f34738v, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = this.f34738v;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f34738v);
            }
            this.f34738v = null;
            this.f34739w = null;
            this.f34740x = null;
            this.f34741y = null;
        } catch (Throwable th) {
            EGLDisplay eGLDisplay4 = this.f34738v;
            if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay5 = this.f34738v;
                EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay5, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface4 = this.f34740x;
            if (eGLSurface4 != null && !eGLSurface4.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f34738v, this.f34740x);
            }
            EGLContext eGLContext2 = this.f34739w;
            if (eGLContext2 != null) {
                EGL14.eglDestroyContext(this.f34738v, eGLContext2);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay6 = this.f34738v;
            if (eGLDisplay6 != null && !eGLDisplay6.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f34738v);
            }
            this.f34738v = null;
            this.f34739w = null;
            this.f34740x = null;
            this.f34741y = null;
            throw th;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f34736n.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f34741y;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}

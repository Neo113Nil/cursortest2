package com.anythink.basead.exoplayer.k;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class g implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public static final int f8389a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f8390b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f8391c = 2;

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f8392d = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: e, reason: collision with root package name */
    private static final int f8393e = 12992;

    /* renamed from: f, reason: collision with root package name */
    private final Handler f8394f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f8395g = new int[1];

    /* renamed from: h, reason: collision with root package name */
    private EGLDisplay f8396h;
    private EGLContext i;

    /* renamed from: j, reason: collision with root package name */
    private EGLSurface f8397j;

    /* renamed from: k, reason: collision with root package name */
    private SurfaceTexture f8398k;

    public static final class a extends RuntimeException {
        public /* synthetic */ a(String str, byte b9) {
            this(str);
        }

        private a(String str) {
            super(str);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public g(Handler handler) {
        this.f8394f = handler;
    }

    private static EGLDisplay c() {
        byte b9 = 0;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay == null) {
            throw new a("eglGetDisplay failed", b9);
        }
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            return eglGetDisplay;
        }
        throw new a("eglInitialize failed", b9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        this.f8394f.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f8398k;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f8395g, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f8396h;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f8396h;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f8397j;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f8396h, this.f8397j);
            }
            EGLContext eGLContext = this.i;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f8396h, eGLContext);
            }
            if (af.f8346a >= 19) {
                EGL14.eglReleaseThread();
            }
            this.f8396h = null;
            this.i = null;
            this.f8397j = null;
            this.f8398k = null;
        }
    }

    public final SurfaceTexture b() {
        return (SurfaceTexture) com.anythink.basead.exoplayer.k.a.a(this.f8398k);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f8394f.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f8398k;
        if (surfaceTexture != null) {
            surfaceTexture.updateTexImage();
        }
    }

    private static EGLConfig a(EGLDisplay eGLDisplay) {
        EGLConfig eGLConfig;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f8392d, 0, eGLConfigArr, 0, 1, iArr, 0);
        byte b9 = 0;
        if (!eglChooseConfig || iArr[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
            throw new a(af.a("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]), b9);
        }
        return eGLConfig;
    }

    private static EGLContext a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        int[] iArr;
        byte b9 = 0;
        if (i == 0) {
            iArr = new int[]{12440, 2, 12344};
        } else {
            iArr = new int[]{12440, 2, f8393e, 1, 12344};
        }
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
        if (eglCreateContext != null) {
            return eglCreateContext;
        }
        throw new a("eglCreateContext failed", b9);
    }

    private static EGLSurface a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i) {
        int[] iArr;
        EGLSurface eglCreatePbufferSurface;
        byte b9 = 0;
        if (i == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            if (i == 2) {
                iArr = new int[]{12375, 1, 12374, 1, f8393e, 1, 12344};
            } else {
                iArr = new int[]{12375, 1, 12374, 1, 12344};
            }
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, iArr, 0);
            if (eglCreatePbufferSurface == null) {
                throw new a("eglCreatePbufferSurface failed", b9);
            }
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eGLContext)) {
            return eglCreatePbufferSurface;
        }
        throw new a("eglMakeCurrent failed", b9);
    }

    private static void a(int[] iArr) {
        byte b9 = 0;
        GLES20.glGenTextures(1, iArr, 0);
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        throw new a("glGenTextures failed. Error: " + Integer.toHexString(glGetError), b9);
    }

    public final void a(int i) {
        EGLConfig eGLConfig;
        int[] iArr;
        int[] iArr2;
        EGLSurface eglCreatePbufferSurface;
        byte b9 = 0;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            int[] iArr3 = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr3, 0, iArr3, 1)) {
                this.f8396h = eglGetDisplay;
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr4 = new int[1];
                boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, f8392d, 0, eGLConfigArr, 0, 1, iArr4, 0);
                if (eglChooseConfig && iArr4[0] > 0 && (eGLConfig = eGLConfigArr[0]) != null) {
                    EGLDisplay eGLDisplay = this.f8396h;
                    if (i == 0) {
                        iArr = new int[]{12440, 2, 12344};
                    } else {
                        iArr = new int[]{12440, 2, f8393e, 1, 12344};
                    }
                    EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
                    if (eglCreateContext != null) {
                        this.i = eglCreateContext;
                        EGLDisplay eGLDisplay2 = this.f8396h;
                        if (i == 1) {
                            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
                        } else {
                            if (i == 2) {
                                iArr2 = new int[]{12375, 1, 12374, 1, f8393e, 1, 12344};
                            } else {
                                iArr2 = new int[]{12375, 1, 12374, 1, 12344};
                            }
                            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay2, eGLConfig, iArr2, 0);
                            if (eglCreatePbufferSurface == null) {
                                throw new a("eglCreatePbufferSurface failed", b9);
                            }
                        }
                        if (EGL14.eglMakeCurrent(eGLDisplay2, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext)) {
                            this.f8397j = eglCreatePbufferSurface;
                            GLES20.glGenTextures(1, this.f8395g, 0);
                            int glGetError = GLES20.glGetError();
                            if (glGetError == 0) {
                                SurfaceTexture surfaceTexture = new SurfaceTexture(this.f8395g[0]);
                                this.f8398k = surfaceTexture;
                                surfaceTexture.setOnFrameAvailableListener(this);
                                return;
                            } else {
                                throw new a("glGenTextures failed. Error: " + Integer.toHexString(glGetError), b9);
                            }
                        }
                        throw new a("eglMakeCurrent failed", b9);
                    }
                    throw new a("eglCreateContext failed", b9);
                }
                throw new a(af.a("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr4[0]), eGLConfigArr[0]), b9);
            }
            throw new a("eglInitialize failed", b9);
        }
        throw new a("eglGetDisplay failed", b9);
    }
}

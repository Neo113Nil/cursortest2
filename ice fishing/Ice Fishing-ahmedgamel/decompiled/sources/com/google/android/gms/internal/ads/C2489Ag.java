package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.HandlerThread;
import android.util.Log;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.Ag, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2489Ag extends Thread implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: U, reason: collision with root package name */
    public static final float[] f24470U = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};

    /* renamed from: A, reason: collision with root package name */
    public final float[] f24471A;

    /* renamed from: B, reason: collision with root package name */
    public float f24472B;

    /* renamed from: C, reason: collision with root package name */
    public float f24473C;

    /* renamed from: D, reason: collision with root package name */
    public float f24474D;

    /* renamed from: E, reason: collision with root package name */
    public int f24475E;

    /* renamed from: F, reason: collision with root package name */
    public int f24476F;

    /* renamed from: G, reason: collision with root package name */
    public SurfaceTexture f24477G;

    /* renamed from: H, reason: collision with root package name */
    public SurfaceTexture f24478H;

    /* renamed from: I, reason: collision with root package name */
    public int f24479I;
    public int J;

    /* renamed from: K, reason: collision with root package name */
    public int f24480K;

    /* renamed from: L, reason: collision with root package name */
    public final FloatBuffer f24481L;

    /* renamed from: M, reason: collision with root package name */
    public final CountDownLatch f24482M;

    /* renamed from: N, reason: collision with root package name */
    public final Object f24483N;

    /* renamed from: O, reason: collision with root package name */
    public EGL10 f24484O;

    /* renamed from: P, reason: collision with root package name */
    public EGLDisplay f24485P;

    /* renamed from: Q, reason: collision with root package name */
    public EGLContext f24486Q;

    /* renamed from: R, reason: collision with root package name */
    public EGLSurface f24487R;

    /* renamed from: S, reason: collision with root package name */
    public volatile boolean f24488S;

    /* renamed from: T, reason: collision with root package name */
    public volatile boolean f24489T;

    /* renamed from: n, reason: collision with root package name */
    public final C4299zg f24490n;

    /* renamed from: u, reason: collision with root package name */
    public final float[] f24491u;

    /* renamed from: v, reason: collision with root package name */
    public final float[] f24492v;

    /* renamed from: w, reason: collision with root package name */
    public final float[] f24493w;

    /* renamed from: x, reason: collision with root package name */
    public final float[] f24494x;

    /* renamed from: y, reason: collision with root package name */
    public final float[] f24495y;

    /* renamed from: z, reason: collision with root package name */
    public final float[] f24496z;

    public C2489Ag(Context context) {
        super("SphericalVideoProcessor");
        float[] fArr = f24470U;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f24481L = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        this.f24491u = new float[9];
        this.f24492v = new float[9];
        this.f24493w = new float[9];
        this.f24494x = new float[9];
        this.f24495y = new float[9];
        this.f24496z = new float[9];
        this.f24471A = new float[9];
        this.f24472B = Float.NaN;
        C4299zg c4299zg = new C4299zg(context);
        this.f24490n = c4299zg;
        c4299zg.f36151h = this;
        this.f24482M = new CountDownLatch(1);
        this.f24483N = new Object();
    }

    public static final void e(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder sb = new StringBuilder(str.length() + 10 + String.valueOf(glGetError).length());
            sb.append(str);
            sb.append(": glError ");
            sb.append(glGetError);
            Log.e("SphericalVideoRenderer", sb.toString());
        }
    }

    public static final void f(float[] fArr, float[] fArr2, float[] fArr3) {
        float f2 = fArr2[0] * fArr3[0];
        float f9 = fArr2[1];
        float f10 = fArr3[3];
        float f11 = fArr2[2];
        float f12 = fArr3[6];
        fArr[0] = f2 + (f9 * f10) + (f11 * f12);
        float f13 = fArr2[0];
        float f14 = fArr3[1] * f13;
        float f15 = fArr3[4];
        float f16 = fArr3[7];
        fArr[1] = f14 + (f9 * f15) + (f11 * f16);
        float f17 = f13 * fArr3[2];
        float f18 = fArr2[1];
        float f19 = fArr3[5];
        float f20 = fArr3[8];
        fArr[2] = f17 + (f18 * f19) + (f11 * f20);
        float f21 = fArr2[3];
        float f22 = fArr3[0];
        float f23 = fArr2[4];
        float f24 = fArr2[5];
        fArr[3] = (f21 * f22) + (f10 * f23) + (f24 * f12);
        float f25 = fArr2[3];
        float f26 = fArr3[1];
        fArr[4] = (f25 * f26) + (f23 * f15) + (f24 * f16);
        float f27 = fArr3[2];
        fArr[5] = (f25 * f27) + (fArr2[4] * f19) + (f24 * f20);
        float f28 = fArr2[6] * f22;
        float f29 = fArr2[7];
        float f30 = fArr3[3] * f29;
        float f31 = fArr2[8];
        fArr[6] = f28 + f30 + (f12 * f31);
        float f32 = fArr2[6];
        float f33 = f16 * f31;
        fArr[7] = f33 + (f29 * fArr3[4]) + (f26 * f32);
        fArr[8] = (f32 * f27) + (fArr2[7] * fArr3[5]) + (f31 * f20);
    }

    public static final void g(float[] fArr, float f2) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d9 = f2;
        fArr[4] = (float) Math.cos(d9);
        fArr[5] = (float) (-Math.sin(d9));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d9);
        fArr[8] = (float) Math.cos(d9);
    }

    public static final void h(float[] fArr, float f2) {
        double d9 = f2;
        fArr[0] = (float) Math.cos(d9);
        fArr[1] = (float) (-Math.sin(d9));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d9);
        fArr[4] = (float) Math.cos(d9);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    public static final int i(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        e("createShader");
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            e("shaderSource");
            GLES20.glCompileShader(glCreateShader);
            e("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            e("getShaderiv");
            if (iArr[0] == 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 26);
                sb.append("Could not compile shader ");
                sb.append(i);
                sb.append(":");
                Log.e("SphericalVideoRenderer", sb.toString());
                Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(glCreateShader));
                GLES20.glDeleteShader(glCreateShader);
                e("deleteShader");
                return 0;
            }
        }
        return glCreateShader;
    }

    public final void a(int i, int i4) {
        Object obj = this.f24483N;
        synchronized (obj) {
            this.f24476F = i;
            this.f24475E = i4;
            this.f24488S = true;
            obj.notifyAll();
        }
    }

    public final void b() {
        Object obj = this.f24483N;
        synchronized (obj) {
            this.f24489T = true;
            this.f24478H = null;
            obj.notifyAll();
        }
    }

    public final void c(float f2, float f9) {
        int i = this.f24476F;
        int i4 = this.f24475E;
        if (i <= i4) {
            i = i4;
        }
        float f10 = i;
        this.f24473C -= (f2 * 1.7453293f) / f10;
        float f11 = this.f24474D - ((f9 * 1.7453293f) / f10);
        this.f24474D = f11;
        if (f11 < -1.5707964f) {
            this.f24474D = -1.5707964f;
            f11 = -1.5707964f;
        }
        if (f11 > 1.5707964f) {
            this.f24474D = 1.5707964f;
        }
    }

    public final void d() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.f24487R;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            this.f24484O.eglMakeCurrent(this.f24485P, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f24484O.eglDestroySurface(this.f24485P, this.f24487R);
            this.f24487R = null;
        }
        EGLContext eGLContext = this.f24486Q;
        if (eGLContext != null) {
            this.f24484O.eglDestroyContext(this.f24485P, eGLContext);
            this.f24486Q = null;
        }
        EGLDisplay eGLDisplay = this.f24485P;
        if (eGLDisplay != null) {
            this.f24484O.eglTerminate(eGLDisplay);
            this.f24485P = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f24480K++;
        Object obj = this.f24483N;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x01c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00b0  */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z6;
        int i;
        int glCreateProgram;
        char c9 = 2;
        int i4 = 3;
        char c10 = '\b';
        float f2 = 0.0f;
        if (this.f24478H == null) {
            int i6 = w2.z.f41712b;
            x2.i.c("SphericalVideoProcessor started with no output texture.");
            this.f24482M.countDown();
            return;
        }
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f24484O = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f24485P = eglGetDisplay;
        if (eglGetDisplay != EGL10.EGL_NO_DISPLAY) {
            if (this.f24484O.eglInitialize(eglGetDisplay, new int[2])) {
                int[] iArr = new int[1];
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                EGLConfig eGLConfig = (this.f24484O.eglChooseConfig(this.f24485P, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344}, eGLConfigArr, 1, iArr) && iArr[0] > 0) ? eGLConfigArr[0] : null;
                if (eGLConfig != null) {
                    EGL10 egl102 = this.f24484O;
                    EGLDisplay eGLDisplay = this.f24485P;
                    EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
                    EGLContext eglCreateContext = egl102.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, new int[]{12440, 2, 12344});
                    this.f24486Q = eglCreateContext;
                    if (eglCreateContext != null && eglCreateContext != eGLContext) {
                        EGLSurface eglCreateWindowSurface = this.f24484O.eglCreateWindowSurface(this.f24485P, eGLConfig, this.f24478H, null);
                        this.f24487R = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE && this.f24484O.eglMakeCurrent(this.f24485P, eglCreateWindowSurface, eglCreateWindowSurface, this.f24486Q)) {
                            z6 = true;
                            C3324ha c3324ha = AbstractC3592ma.R1;
                            s2.r rVar = s2.r.f40506e;
                            i = i(35633, ((String) rVar.f40509c.a(c3324ha)).equals(c3324ha.c()) ? (String) rVar.f40509c.a(c3324ha) : "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}");
                            if (i != 0) {
                                C3324ha c3324ha2 = AbstractC3592ma.f32904S1;
                                int i9 = i(35632, !((String) rVar.f40509c.a(c3324ha2)).equals(c3324ha2.c()) ? (String) rVar.f40509c.a(c3324ha2) : "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}");
                                if (i9 != 0) {
                                    glCreateProgram = GLES20.glCreateProgram();
                                    e("createProgram");
                                    if (glCreateProgram != 0) {
                                        GLES20.glAttachShader(glCreateProgram, i);
                                        e("attachShader");
                                        GLES20.glAttachShader(glCreateProgram, i9);
                                        e("attachShader");
                                        GLES20.glLinkProgram(glCreateProgram);
                                        e("linkProgram");
                                        int[] iArr2 = new int[1];
                                        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr2, 0);
                                        e("getProgramiv");
                                        if (iArr2[0] != 1) {
                                            Log.e("SphericalVideoRenderer", "Could not link program: ");
                                            Log.e("SphericalVideoRenderer", GLES20.glGetProgramInfoLog(glCreateProgram));
                                            GLES20.glDeleteProgram(glCreateProgram);
                                            e("deleteProgram");
                                        } else {
                                            GLES20.glValidateProgram(glCreateProgram);
                                            e("validateProgram");
                                        }
                                    }
                                    this.f24479I = glCreateProgram;
                                    GLES20.glUseProgram(glCreateProgram);
                                    e("useProgram");
                                    int glGetAttribLocation = GLES20.glGetAttribLocation(this.f24479I, "aPosition");
                                    GLES20.glVertexAttribPointer(glGetAttribLocation, 3, 5126, false, 12, (Buffer) this.f24481L);
                                    e("vertexAttribPointer");
                                    GLES20.glEnableVertexAttribArray(glGetAttribLocation);
                                    e("enableVertexAttribArray");
                                    int[] iArr3 = new int[1];
                                    GLES20.glGenTextures(1, iArr3, 0);
                                    e("genTextures");
                                    int i10 = iArr3[0];
                                    GLES20.glBindTexture(36197, i10);
                                    e("bindTextures");
                                    GLES20.glTexParameteri(36197, 10240, 9729);
                                    e("texParameteri");
                                    GLES20.glTexParameteri(36197, 10241, 9729);
                                    e("texParameteri");
                                    GLES20.glTexParameteri(36197, 10242, 33071);
                                    e("texParameteri");
                                    GLES20.glTexParameteri(36197, 10243, 33071);
                                    e("texParameteri");
                                    int glGetUniformLocation = GLES20.glGetUniformLocation(this.f24479I, "uVMat");
                                    this.J = glGetUniformLocation;
                                    GLES20.glUniformMatrix3fv(glGetUniformLocation, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
                                    int i11 = this.f24479I;
                                    if (z6 || i11 == 0) {
                                        String valueOf = String.valueOf(GLUtils.getEGLErrorString(this.f24484O.eglGetError()));
                                        int i12 = w2.z.f41712b;
                                        String concat = "EGL initialization failed: ".concat(valueOf);
                                        x2.i.c(concat);
                                        C4906k.f40186C.f40196h.d("SphericalVideoProcessor.run.1", new Throwable(concat));
                                        d();
                                        this.f24482M.countDown();
                                    }
                                    SurfaceTexture surfaceTexture = new SurfaceTexture(i10);
                                    this.f24477G = surfaceTexture;
                                    surfaceTexture.setOnFrameAvailableListener(this);
                                    this.f24482M.countDown();
                                    C4299zg c4299zg = this.f24490n;
                                    if (c4299zg.f36150g == null) {
                                        SensorManager sensorManager = c4299zg.f36144a;
                                        Sensor defaultSensor = sensorManager.getDefaultSensor(11);
                                        if (defaultSensor == null) {
                                            int i13 = w2.z.f41712b;
                                            x2.i.c("No Sensor of TYPE_ROTATION_VECTOR");
                                        } else {
                                            HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
                                            handlerThread.start();
                                            c3.e eVar = new c3.e(handlerThread.getLooper(), 1);
                                            c4299zg.f36150g = eVar;
                                            if (!sensorManager.registerListener(c4299zg, defaultSensor, 0, eVar)) {
                                                int i14 = w2.z.f41712b;
                                                x2.i.c("SensorManager.registerListener failed.");
                                                c4299zg.b();
                                            }
                                        }
                                    }
                                    try {
                                        try {
                                            try {
                                                this.f24488S = true;
                                                while (!this.f24489T) {
                                                    while (this.f24480K > 0) {
                                                        this.f24477G.updateTexImage();
                                                        this.f24480K--;
                                                    }
                                                    float[] fArr = this.f24491u;
                                                    if (c4299zg.c(fArr)) {
                                                        if (Float.isNaN(this.f24472B)) {
                                                            float[] fArr2 = new float[i4];
                                                            // fill-array-data instruction
                                                            fArr2[0] = 0.0f;
                                                            fArr2[1] = 1.0f;
                                                            fArr2[2] = 0.0f;
                                                            float f9 = fArr[0];
                                                            float f10 = fArr2[0];
                                                            float f11 = fArr[1];
                                                            float f12 = fArr2[1];
                                                            float f13 = (fArr[c9] * f2) + (f11 * f12) + (f9 * f10);
                                                            float f14 = (fArr[5] * f2) + (fArr[i4] * f10) + (fArr[4] * f12);
                                                            float f15 = (fArr[c10] * f2) + (fArr[6] * f10) + (fArr[7] * f12);
                                                            float[] fArr3 = new float[i4];
                                                            fArr3[0] = f13;
                                                            fArr3[1] = f14;
                                                            fArr3[c9] = f15;
                                                            this.f24472B = -(((float) Math.atan2(fArr3[1], fArr3[0])) - 1.5707964f);
                                                        }
                                                        h(this.f24496z, this.f24472B + this.f24473C);
                                                    } else {
                                                        g(fArr, -1.5707964f);
                                                        h(this.f24496z, this.f24473C);
                                                    }
                                                    float[] fArr4 = this.f24492v;
                                                    g(fArr4, 1.5707964f);
                                                    float[] fArr5 = this.f24493w;
                                                    f(fArr5, this.f24496z, fArr4);
                                                    float[] fArr6 = this.f24494x;
                                                    f(fArr6, fArr, fArr5);
                                                    float[] fArr7 = this.f24495y;
                                                    g(fArr7, this.f24474D);
                                                    float[] fArr8 = this.f24471A;
                                                    f(fArr8, fArr7, fArr6);
                                                    GLES20.glUniformMatrix3fv(this.J, 1, false, fArr8, 0);
                                                    GLES20.glDrawArrays(5, 0, 4);
                                                    e("drawArrays");
                                                    GLES20.glFinish();
                                                    this.f24484O.eglSwapBuffers(this.f24485P, this.f24487R);
                                                    if (this.f24488S) {
                                                        GLES20.glViewport(0, 0, this.f24476F, this.f24475E);
                                                        e("viewport");
                                                        int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.f24479I, "uFOVx");
                                                        int glGetUniformLocation3 = GLES20.glGetUniformLocation(this.f24479I, "uFOVy");
                                                        int i15 = this.f24476F;
                                                        int i16 = this.f24475E;
                                                        if (i15 > i16) {
                                                            GLES20.glUniform1f(glGetUniformLocation2, 0.87266463f);
                                                            GLES20.glUniform1f(glGetUniformLocation3, (this.f24475E * 0.87266463f) / this.f24476F);
                                                        } else {
                                                            GLES20.glUniform1f(glGetUniformLocation2, (i15 * 0.87266463f) / i16);
                                                            GLES20.glUniform1f(glGetUniformLocation3, 0.87266463f);
                                                        }
                                                        this.f24488S = false;
                                                    }
                                                    try {
                                                        Object obj = this.f24483N;
                                                        synchronized (obj) {
                                                            try {
                                                                if (!this.f24489T && !this.f24488S && this.f24480K == 0) {
                                                                    obj.wait();
                                                                }
                                                            } catch (Throwable th) {
                                                                throw th;
                                                            }
                                                        }
                                                    } catch (InterruptedException unused) {
                                                    }
                                                    c9 = 2;
                                                    i4 = 3;
                                                    c10 = '\b';
                                                    f2 = 0.0f;
                                                }
                                            } catch (Throwable th2) {
                                                this.f24490n.b();
                                                this.f24477G.setOnFrameAvailableListener(null);
                                                this.f24477G = null;
                                                d();
                                                throw th2;
                                            }
                                        } catch (IllegalStateException unused2) {
                                            int i17 = w2.z.f41712b;
                                            x2.i.f("SphericalVideoProcessor halted unexpectedly.");
                                        }
                                    } catch (Throwable th3) {
                                        int i18 = w2.z.f41712b;
                                        x2.i.d("SphericalVideoProcessor died.", th3);
                                        C4906k.f40186C.f40196h.d("SphericalVideoProcessor.run.2", th3);
                                    }
                                    this.f24490n.b();
                                    this.f24477G.setOnFrameAvailableListener(null);
                                    this.f24477G = null;
                                    d();
                                    return;
                                }
                            }
                            glCreateProgram = 0;
                            this.f24479I = glCreateProgram;
                            GLES20.glUseProgram(glCreateProgram);
                            e("useProgram");
                            int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.f24479I, "aPosition");
                            GLES20.glVertexAttribPointer(glGetAttribLocation2, 3, 5126, false, 12, (Buffer) this.f24481L);
                            e("vertexAttribPointer");
                            GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
                            e("enableVertexAttribArray");
                            int[] iArr32 = new int[1];
                            GLES20.glGenTextures(1, iArr32, 0);
                            e("genTextures");
                            int i102 = iArr32[0];
                            GLES20.glBindTexture(36197, i102);
                            e("bindTextures");
                            GLES20.glTexParameteri(36197, 10240, 9729);
                            e("texParameteri");
                            GLES20.glTexParameteri(36197, 10241, 9729);
                            e("texParameteri");
                            GLES20.glTexParameteri(36197, 10242, 33071);
                            e("texParameteri");
                            GLES20.glTexParameteri(36197, 10243, 33071);
                            e("texParameteri");
                            int glGetUniformLocation4 = GLES20.glGetUniformLocation(this.f24479I, "uVMat");
                            this.J = glGetUniformLocation4;
                            GLES20.glUniformMatrix3fv(glGetUniformLocation4, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
                            int i112 = this.f24479I;
                            if (z6) {
                            }
                            String valueOf2 = String.valueOf(GLUtils.getEGLErrorString(this.f24484O.eglGetError()));
                            int i122 = w2.z.f41712b;
                            String concat2 = "EGL initialization failed: ".concat(valueOf2);
                            x2.i.c(concat2);
                            C4906k.f40186C.f40196h.d("SphericalVideoProcessor.run.1", new Throwable(concat2));
                            d();
                            this.f24482M.countDown();
                        }
                    }
                }
            }
        }
        z6 = false;
        C3324ha c3324ha3 = AbstractC3592ma.R1;
        s2.r rVar2 = s2.r.f40506e;
        i = i(35633, ((String) rVar2.f40509c.a(c3324ha3)).equals(c3324ha3.c()) ? (String) rVar2.f40509c.a(c3324ha3) : "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}");
        if (i != 0) {
        }
        glCreateProgram = 0;
        this.f24479I = glCreateProgram;
        GLES20.glUseProgram(glCreateProgram);
        e("useProgram");
        int glGetAttribLocation22 = GLES20.glGetAttribLocation(this.f24479I, "aPosition");
        GLES20.glVertexAttribPointer(glGetAttribLocation22, 3, 5126, false, 12, (Buffer) this.f24481L);
        e("vertexAttribPointer");
        GLES20.glEnableVertexAttribArray(glGetAttribLocation22);
        e("enableVertexAttribArray");
        int[] iArr322 = new int[1];
        GLES20.glGenTextures(1, iArr322, 0);
        e("genTextures");
        int i1022 = iArr322[0];
        GLES20.glBindTexture(36197, i1022);
        e("bindTextures");
        GLES20.glTexParameteri(36197, 10240, 9729);
        e("texParameteri");
        GLES20.glTexParameteri(36197, 10241, 9729);
        e("texParameteri");
        GLES20.glTexParameteri(36197, 10242, 33071);
        e("texParameteri");
        GLES20.glTexParameteri(36197, 10243, 33071);
        e("texParameteri");
        int glGetUniformLocation42 = GLES20.glGetUniformLocation(this.f24479I, "uVMat");
        this.J = glGetUniformLocation42;
        GLES20.glUniformMatrix3fv(glGetUniformLocation42, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
        int i1122 = this.f24479I;
        if (z6) {
        }
        String valueOf22 = String.valueOf(GLUtils.getEGLErrorString(this.f24484O.eglGetError()));
        int i1222 = w2.z.f41712b;
        String concat22 = "EGL initialization failed: ".concat(valueOf22);
        x2.i.c(concat22);
        C4906k.f40186C.f40196h.d("SphericalVideoProcessor.run.1", new Throwable(concat22));
        d();
        this.f24482M.countDown();
    }
}

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
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.Ag, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2469Ag extends Thread implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: U, reason: collision with root package name */
    public static final float[] f23688U = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};

    /* renamed from: A, reason: collision with root package name */
    public final float[] f23689A;

    /* renamed from: B, reason: collision with root package name */
    public float f23690B;

    /* renamed from: C, reason: collision with root package name */
    public float f23691C;

    /* renamed from: D, reason: collision with root package name */
    public float f23692D;

    /* renamed from: E, reason: collision with root package name */
    public int f23693E;

    /* renamed from: F, reason: collision with root package name */
    public int f23694F;

    /* renamed from: G, reason: collision with root package name */
    public SurfaceTexture f23695G;

    /* renamed from: H, reason: collision with root package name */
    public SurfaceTexture f23696H;

    /* renamed from: I, reason: collision with root package name */
    public int f23697I;
    public int J;

    /* renamed from: K, reason: collision with root package name */
    public int f23698K;

    /* renamed from: L, reason: collision with root package name */
    public final FloatBuffer f23699L;

    /* renamed from: M, reason: collision with root package name */
    public final CountDownLatch f23700M;

    /* renamed from: N, reason: collision with root package name */
    public final Object f23701N;

    /* renamed from: O, reason: collision with root package name */
    public EGL10 f23702O;

    /* renamed from: P, reason: collision with root package name */
    public EGLDisplay f23703P;

    /* renamed from: Q, reason: collision with root package name */
    public EGLContext f23704Q;

    /* renamed from: R, reason: collision with root package name */
    public EGLSurface f23705R;

    /* renamed from: S, reason: collision with root package name */
    public volatile boolean f23706S;

    /* renamed from: T, reason: collision with root package name */
    public volatile boolean f23707T;

    /* renamed from: n, reason: collision with root package name */
    public final C4276zg f23708n;

    /* renamed from: u, reason: collision with root package name */
    public final float[] f23709u;

    /* renamed from: v, reason: collision with root package name */
    public final float[] f23710v;

    /* renamed from: w, reason: collision with root package name */
    public final float[] f23711w;

    /* renamed from: x, reason: collision with root package name */
    public final float[] f23712x;

    /* renamed from: y, reason: collision with root package name */
    public final float[] f23713y;

    /* renamed from: z, reason: collision with root package name */
    public final float[] f23714z;

    public C2469Ag(Context context) {
        super("SphericalVideoProcessor");
        float[] fArr = f23688U;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f23699L = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        this.f23709u = new float[9];
        this.f23710v = new float[9];
        this.f23711w = new float[9];
        this.f23712x = new float[9];
        this.f23713y = new float[9];
        this.f23714z = new float[9];
        this.f23689A = new float[9];
        this.f23690B = Float.NaN;
        C4276zg c4276zg = new C4276zg(context);
        this.f23708n = c4276zg;
        c4276zg.f35378h = this;
        this.f23700M = new CountDownLatch(1);
        this.f23701N = new Object();
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
        float f3 = fArr2[0] * fArr3[0];
        float f9 = fArr2[1];
        float f10 = fArr3[3];
        float f11 = fArr2[2];
        float f12 = fArr3[6];
        fArr[0] = f3 + (f9 * f10) + (f11 * f12);
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

    public static final void g(float[] fArr, float f3) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d2 = f3;
        fArr[4] = (float) Math.cos(d2);
        fArr[5] = (float) (-Math.sin(d2));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d2);
        fArr[8] = (float) Math.cos(d2);
    }

    public static final void h(float[] fArr, float f3) {
        double d2 = f3;
        fArr[0] = (float) Math.cos(d2);
        fArr[1] = (float) (-Math.sin(d2));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d2);
        fArr[4] = (float) Math.cos(d2);
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

    public final void a(int i, int i6) {
        Object obj = this.f23701N;
        synchronized (obj) {
            this.f23694F = i;
            this.f23693E = i6;
            this.f23706S = true;
            obj.notifyAll();
        }
    }

    public final void b() {
        Object obj = this.f23701N;
        synchronized (obj) {
            this.f23707T = true;
            this.f23696H = null;
            obj.notifyAll();
        }
    }

    public final void c(float f3, float f9) {
        int i = this.f23694F;
        int i6 = this.f23693E;
        if (i <= i6) {
            i = i6;
        }
        float f10 = i;
        this.f23691C -= (f3 * 1.7453293f) / f10;
        float f11 = this.f23692D - ((f9 * 1.7453293f) / f10);
        this.f23692D = f11;
        if (f11 < -1.5707964f) {
            this.f23692D = -1.5707964f;
            f11 = -1.5707964f;
        }
        if (f11 > 1.5707964f) {
            this.f23692D = 1.5707964f;
        }
    }

    public final void d() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.f23705R;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            this.f23702O.eglMakeCurrent(this.f23703P, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f23702O.eglDestroySurface(this.f23703P, this.f23705R);
            this.f23705R = null;
        }
        EGLContext eGLContext = this.f23704Q;
        if (eGLContext != null) {
            this.f23702O.eglDestroyContext(this.f23703P, eGLContext);
            this.f23704Q = null;
        }
        EGLDisplay eGLDisplay = this.f23703P;
        if (eGLDisplay != null) {
            this.f23702O.eglTerminate(eGLDisplay);
            this.f23703P = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f23698K++;
        Object obj = this.f23701N;
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
        boolean z3;
        int i;
        int glCreateProgram;
        char c9 = 2;
        int i6 = 3;
        char c10 = '\b';
        float f3 = 0.0f;
        if (this.f23696H == null) {
            int i9 = u2.z.f41322b;
            v2.i.c("SphericalVideoProcessor started with no output texture.");
            this.f23700M.countDown();
            return;
        }
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f23702O = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f23703P = eglGetDisplay;
        if (eglGetDisplay != EGL10.EGL_NO_DISPLAY) {
            if (this.f23702O.eglInitialize(eglGetDisplay, new int[2])) {
                int[] iArr = new int[1];
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                EGLConfig eGLConfig = (this.f23702O.eglChooseConfig(this.f23703P, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344}, eGLConfigArr, 1, iArr) && iArr[0] > 0) ? eGLConfigArr[0] : null;
                if (eGLConfig != null) {
                    EGL10 egl102 = this.f23702O;
                    EGLDisplay eGLDisplay = this.f23703P;
                    EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
                    EGLContext eglCreateContext = egl102.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, new int[]{12440, 2, 12344});
                    this.f23704Q = eglCreateContext;
                    if (eglCreateContext != null && eglCreateContext != eGLContext) {
                        EGLSurface eglCreateWindowSurface = this.f23702O.eglCreateWindowSurface(this.f23703P, eGLConfig, this.f23696H, null);
                        this.f23705R = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE && this.f23702O.eglMakeCurrent(this.f23703P, eglCreateWindowSurface, eglCreateWindowSurface, this.f23704Q)) {
                            z3 = true;
                            C3301ha c3301ha = AbstractC3569ma.f32116R1;
                            q2.r rVar = q2.r.f40207e;
                            i = i(35633, ((String) rVar.f40210c.a(c3301ha)).equals(c3301ha.c()) ? (String) rVar.f40210c.a(c3301ha) : "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}");
                            if (i != 0) {
                                C3301ha c3301ha2 = AbstractC3569ma.f32125S1;
                                int i10 = i(35632, !((String) rVar.f40210c.a(c3301ha2)).equals(c3301ha2.c()) ? (String) rVar.f40210c.a(c3301ha2) : "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}");
                                if (i10 != 0) {
                                    glCreateProgram = GLES20.glCreateProgram();
                                    e("createProgram");
                                    if (glCreateProgram != 0) {
                                        GLES20.glAttachShader(glCreateProgram, i);
                                        e("attachShader");
                                        GLES20.glAttachShader(glCreateProgram, i10);
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
                                    this.f23697I = glCreateProgram;
                                    GLES20.glUseProgram(glCreateProgram);
                                    e("useProgram");
                                    int glGetAttribLocation = GLES20.glGetAttribLocation(this.f23697I, "aPosition");
                                    GLES20.glVertexAttribPointer(glGetAttribLocation, 3, 5126, false, 12, (Buffer) this.f23699L);
                                    e("vertexAttribPointer");
                                    GLES20.glEnableVertexAttribArray(glGetAttribLocation);
                                    e("enableVertexAttribArray");
                                    int[] iArr3 = new int[1];
                                    GLES20.glGenTextures(1, iArr3, 0);
                                    e("genTextures");
                                    int i11 = iArr3[0];
                                    GLES20.glBindTexture(36197, i11);
                                    e("bindTextures");
                                    GLES20.glTexParameteri(36197, 10240, 9729);
                                    e("texParameteri");
                                    GLES20.glTexParameteri(36197, 10241, 9729);
                                    e("texParameteri");
                                    GLES20.glTexParameteri(36197, 10242, 33071);
                                    e("texParameteri");
                                    GLES20.glTexParameteri(36197, 10243, 33071);
                                    e("texParameteri");
                                    int glGetUniformLocation = GLES20.glGetUniformLocation(this.f23697I, "uVMat");
                                    this.J = glGetUniformLocation;
                                    GLES20.glUniformMatrix3fv(glGetUniformLocation, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
                                    int i12 = this.f23697I;
                                    if (z3 || i12 == 0) {
                                        String valueOf = String.valueOf(GLUtils.getEGLErrorString(this.f23702O.eglGetError()));
                                        int i13 = u2.z.f41322b;
                                        String concat = "EGL initialization failed: ".concat(valueOf);
                                        v2.i.c(concat);
                                        C4835j.f39733C.f39743h.d("SphericalVideoProcessor.run.1", new Throwable(concat));
                                        d();
                                        this.f23700M.countDown();
                                    }
                                    SurfaceTexture surfaceTexture = new SurfaceTexture(i11);
                                    this.f23695G = surfaceTexture;
                                    surfaceTexture.setOnFrameAvailableListener(this);
                                    this.f23700M.countDown();
                                    C4276zg c4276zg = this.f23708n;
                                    if (c4276zg.f35377g == null) {
                                        SensorManager sensorManager = c4276zg.f35371a;
                                        Sensor defaultSensor = sensorManager.getDefaultSensor(11);
                                        if (defaultSensor == null) {
                                            int i14 = u2.z.f41322b;
                                            v2.i.c("No Sensor of TYPE_ROTATION_VECTOR");
                                        } else {
                                            HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
                                            handlerThread.start();
                                            a3.e eVar = new a3.e(handlerThread.getLooper(), 3);
                                            c4276zg.f35377g = eVar;
                                            if (!sensorManager.registerListener(c4276zg, defaultSensor, 0, eVar)) {
                                                int i15 = u2.z.f41322b;
                                                v2.i.c("SensorManager.registerListener failed.");
                                                c4276zg.b();
                                            }
                                        }
                                    }
                                    try {
                                        try {
                                            try {
                                                this.f23706S = true;
                                                while (!this.f23707T) {
                                                    while (this.f23698K > 0) {
                                                        this.f23695G.updateTexImage();
                                                        this.f23698K--;
                                                    }
                                                    float[] fArr = this.f23709u;
                                                    if (c4276zg.c(fArr)) {
                                                        if (Float.isNaN(this.f23690B)) {
                                                            float[] fArr2 = new float[i6];
                                                            // fill-array-data instruction
                                                            fArr2[0] = 0.0f;
                                                            fArr2[1] = 1.0f;
                                                            fArr2[2] = 0.0f;
                                                            float f9 = fArr[0];
                                                            float f10 = fArr2[0];
                                                            float f11 = fArr[1];
                                                            float f12 = fArr2[1];
                                                            float f13 = (fArr[c9] * f3) + (f11 * f12) + (f9 * f10);
                                                            float f14 = (fArr[5] * f3) + (fArr[i6] * f10) + (fArr[4] * f12);
                                                            float f15 = (fArr[c10] * f3) + (fArr[6] * f10) + (fArr[7] * f12);
                                                            float[] fArr3 = new float[i6];
                                                            fArr3[0] = f13;
                                                            fArr3[1] = f14;
                                                            fArr3[c9] = f15;
                                                            this.f23690B = -(((float) Math.atan2(fArr3[1], fArr3[0])) - 1.5707964f);
                                                        }
                                                        h(this.f23714z, this.f23690B + this.f23691C);
                                                    } else {
                                                        g(fArr, -1.5707964f);
                                                        h(this.f23714z, this.f23691C);
                                                    }
                                                    float[] fArr4 = this.f23710v;
                                                    g(fArr4, 1.5707964f);
                                                    float[] fArr5 = this.f23711w;
                                                    f(fArr5, this.f23714z, fArr4);
                                                    float[] fArr6 = this.f23712x;
                                                    f(fArr6, fArr, fArr5);
                                                    float[] fArr7 = this.f23713y;
                                                    g(fArr7, this.f23692D);
                                                    float[] fArr8 = this.f23689A;
                                                    f(fArr8, fArr7, fArr6);
                                                    GLES20.glUniformMatrix3fv(this.J, 1, false, fArr8, 0);
                                                    GLES20.glDrawArrays(5, 0, 4);
                                                    e("drawArrays");
                                                    GLES20.glFinish();
                                                    this.f23702O.eglSwapBuffers(this.f23703P, this.f23705R);
                                                    if (this.f23706S) {
                                                        GLES20.glViewport(0, 0, this.f23694F, this.f23693E);
                                                        e("viewport");
                                                        int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.f23697I, "uFOVx");
                                                        int glGetUniformLocation3 = GLES20.glGetUniformLocation(this.f23697I, "uFOVy");
                                                        int i16 = this.f23694F;
                                                        int i17 = this.f23693E;
                                                        if (i16 > i17) {
                                                            GLES20.glUniform1f(glGetUniformLocation2, 0.87266463f);
                                                            GLES20.glUniform1f(glGetUniformLocation3, (this.f23693E * 0.87266463f) / this.f23694F);
                                                        } else {
                                                            GLES20.glUniform1f(glGetUniformLocation2, (i16 * 0.87266463f) / i17);
                                                            GLES20.glUniform1f(glGetUniformLocation3, 0.87266463f);
                                                        }
                                                        this.f23706S = false;
                                                    }
                                                    try {
                                                        Object obj = this.f23701N;
                                                        synchronized (obj) {
                                                            try {
                                                                if (!this.f23707T && !this.f23706S && this.f23698K == 0) {
                                                                    obj.wait();
                                                                }
                                                            } catch (Throwable th) {
                                                                throw th;
                                                            }
                                                        }
                                                    } catch (InterruptedException unused) {
                                                    }
                                                    c9 = 2;
                                                    i6 = 3;
                                                    c10 = '\b';
                                                    f3 = 0.0f;
                                                }
                                            } catch (Throwable th2) {
                                                this.f23708n.b();
                                                this.f23695G.setOnFrameAvailableListener(null);
                                                this.f23695G = null;
                                                d();
                                                throw th2;
                                            }
                                        } catch (IllegalStateException unused2) {
                                            int i18 = u2.z.f41322b;
                                            v2.i.f("SphericalVideoProcessor halted unexpectedly.");
                                        }
                                    } catch (Throwable th3) {
                                        int i19 = u2.z.f41322b;
                                        v2.i.d("SphericalVideoProcessor died.", th3);
                                        C4835j.f39733C.f39743h.d("SphericalVideoProcessor.run.2", th3);
                                    }
                                    this.f23708n.b();
                                    this.f23695G.setOnFrameAvailableListener(null);
                                    this.f23695G = null;
                                    d();
                                    return;
                                }
                            }
                            glCreateProgram = 0;
                            this.f23697I = glCreateProgram;
                            GLES20.glUseProgram(glCreateProgram);
                            e("useProgram");
                            int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.f23697I, "aPosition");
                            GLES20.glVertexAttribPointer(glGetAttribLocation2, 3, 5126, false, 12, (Buffer) this.f23699L);
                            e("vertexAttribPointer");
                            GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
                            e("enableVertexAttribArray");
                            int[] iArr32 = new int[1];
                            GLES20.glGenTextures(1, iArr32, 0);
                            e("genTextures");
                            int i112 = iArr32[0];
                            GLES20.glBindTexture(36197, i112);
                            e("bindTextures");
                            GLES20.glTexParameteri(36197, 10240, 9729);
                            e("texParameteri");
                            GLES20.glTexParameteri(36197, 10241, 9729);
                            e("texParameteri");
                            GLES20.glTexParameteri(36197, 10242, 33071);
                            e("texParameteri");
                            GLES20.glTexParameteri(36197, 10243, 33071);
                            e("texParameteri");
                            int glGetUniformLocation4 = GLES20.glGetUniformLocation(this.f23697I, "uVMat");
                            this.J = glGetUniformLocation4;
                            GLES20.glUniformMatrix3fv(glGetUniformLocation4, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
                            int i122 = this.f23697I;
                            if (z3) {
                            }
                            String valueOf2 = String.valueOf(GLUtils.getEGLErrorString(this.f23702O.eglGetError()));
                            int i132 = u2.z.f41322b;
                            String concat2 = "EGL initialization failed: ".concat(valueOf2);
                            v2.i.c(concat2);
                            C4835j.f39733C.f39743h.d("SphericalVideoProcessor.run.1", new Throwable(concat2));
                            d();
                            this.f23700M.countDown();
                        }
                    }
                }
            }
        }
        z3 = false;
        C3301ha c3301ha3 = AbstractC3569ma.f32116R1;
        q2.r rVar2 = q2.r.f40207e;
        i = i(35633, ((String) rVar2.f40210c.a(c3301ha3)).equals(c3301ha3.c()) ? (String) rVar2.f40210c.a(c3301ha3) : "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}");
        if (i != 0) {
        }
        glCreateProgram = 0;
        this.f23697I = glCreateProgram;
        GLES20.glUseProgram(glCreateProgram);
        e("useProgram");
        int glGetAttribLocation22 = GLES20.glGetAttribLocation(this.f23697I, "aPosition");
        GLES20.glVertexAttribPointer(glGetAttribLocation22, 3, 5126, false, 12, (Buffer) this.f23699L);
        e("vertexAttribPointer");
        GLES20.glEnableVertexAttribArray(glGetAttribLocation22);
        e("enableVertexAttribArray");
        int[] iArr322 = new int[1];
        GLES20.glGenTextures(1, iArr322, 0);
        e("genTextures");
        int i1122 = iArr322[0];
        GLES20.glBindTexture(36197, i1122);
        e("bindTextures");
        GLES20.glTexParameteri(36197, 10240, 9729);
        e("texParameteri");
        GLES20.glTexParameteri(36197, 10241, 9729);
        e("texParameteri");
        GLES20.glTexParameteri(36197, 10242, 33071);
        e("texParameteri");
        GLES20.glTexParameteri(36197, 10243, 33071);
        e("texParameteri");
        int glGetUniformLocation42 = GLES20.glGetUniformLocation(this.f23697I, "uVMat");
        this.J = glGetUniformLocation42;
        GLES20.glUniformMatrix3fv(glGetUniformLocation42, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
        int i1222 = this.f23697I;
        if (z3) {
        }
        String valueOf22 = String.valueOf(GLUtils.getEGLErrorString(this.f23702O.eglGetError()));
        int i1322 = u2.z.f41322b;
        String concat22 = "EGL initialization failed: ".concat(valueOf22);
        v2.i.c(concat22);
        C4835j.f39733C.f39743h.d("SphericalVideoProcessor.run.1", new Throwable(concat22));
        d();
        this.f23700M.countDown();
    }
}

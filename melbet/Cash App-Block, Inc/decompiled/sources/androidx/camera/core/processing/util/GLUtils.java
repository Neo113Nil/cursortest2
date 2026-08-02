package androidx.camera.core.processing.util;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import android.view.Surface;
import androidx.camera.core.DynamicRange;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.TransactorKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import papa.Handlers$$ExternalSyntheticBUOutline0;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public abstract class GLUtils {
    public static final String DEFAULT_VERTEX_SHADER;
    public static final String HDR_VERTEX_SHADER;
    public static final AutoValue_OutputSurface NO_OUTPUT_SURFACE;
    public static final AnonymousClass1 SHADER_PROVIDER_DEFAULT;
    public static final AnonymousClass1 SHADER_PROVIDER_HDR_DEFAULT;
    public static final AnonymousClass1 SHADER_PROVIDER_HDR_YUV;
    public static final FloatBuffer TEX_BUF;
    public static final FloatBuffer VERTEX_BUF;
    public static final int[] EMPTY_ATTRIBS = {12344};
    public static final int[] HLG_SURFACE_ATTRIBS = {12445, 13632, 12344};

    /* renamed from: androidx.camera.core.processing.util.GLUtils$1, reason: invalid class name */
    public final class AnonymousClass1 {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ AnonymousClass1(int i) {
            this.$r8$classId = i;
        }
    }

    public final class BlankShaderProgram extends Program2D {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class InputFormat {
        public static final /* synthetic */ InputFormat[] $VALUES;
        public static final InputFormat DEFAULT;
        public static final InputFormat UNKNOWN;
        public static final InputFormat YUV;

        static {
            InputFormat inputFormat = new InputFormat("UNKNOWN", 0);
            UNKNOWN = inputFormat;
            InputFormat inputFormat2 = new InputFormat("DEFAULT", 1);
            DEFAULT = inputFormat2;
            InputFormat inputFormat3 = new InputFormat("YUV", 2);
            YUV = inputFormat3;
            $VALUES = new InputFormat[]{inputFormat, inputFormat2, inputFormat3};
        }

        public static InputFormat valueOf(String str) {
            return (InputFormat) Enum.valueOf(InputFormat.class, str);
        }

        public static InputFormat[] values() {
            return (InputFormat[]) $VALUES.clone();
        }
    }

    public abstract class Program2D {
        public final int mProgramHandle;
        public int mTransMatrixLoc = -1;
        public int mAlphaScaleLoc = -1;
        public int mPositionLoc = -1;

        /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Program2D(String str, String str2) {
            int i;
            int i2;
            int i3;
            try {
                i = GLUtils.loadShader(35633, str);
            } catch (IllegalArgumentException | IllegalStateException e) {
                e = e;
                i = -1;
                i2 = -1;
            }
            try {
                i2 = GLUtils.loadShader(35632, str2);
                try {
                    i3 = GLES20.glCreateProgram();
                    try {
                        GLUtils.checkGlErrorOrThrow("glCreateProgram");
                        GLES20.glAttachShader(i3, i);
                        GLUtils.checkGlErrorOrThrow("glAttachShader");
                        GLES20.glAttachShader(i3, i2);
                        GLUtils.checkGlErrorOrThrow("glAttachShader");
                        GLES20.glLinkProgram(i3);
                        int[] iArr = new int[1];
                        GLES20.glGetProgramiv(i3, 35714, iArr, 0);
                        if (iArr[0] == 1) {
                            this.mProgramHandle = i3;
                            loadLocations$1();
                        } else {
                            throw new IllegalStateException("Could not link program: " + GLES20.glGetProgramInfoLog(i3));
                        }
                    } catch (IllegalArgumentException | IllegalStateException e2) {
                        e = e2;
                        if (i != -1) {
                            GLES20.glDeleteShader(i);
                        }
                        if (i2 != -1) {
                            GLES20.glDeleteShader(i2);
                        }
                        if (i3 != -1) {
                            GLES20.glDeleteProgram(i3);
                        }
                        throw e;
                    }
                } catch (IllegalArgumentException | IllegalStateException e3) {
                    e = e3;
                    i3 = -1;
                }
            } catch (IllegalArgumentException | IllegalStateException e4) {
                e = e4;
                i2 = -1;
                i3 = i2;
                if (i != -1) {
                }
                if (i2 != -1) {
                }
                if (i3 != -1) {
                }
                throw e;
            }
        }

        public final void loadLocations$1() {
            int i = this.mProgramHandle;
            int glGetAttribLocation = GLES20.glGetAttribLocation(i, "aPosition");
            this.mPositionLoc = glGetAttribLocation;
            GLUtils.checkLocationOrThrow(glGetAttribLocation, "aPosition");
            int glGetUniformLocation = GLES20.glGetUniformLocation(i, "uTransMatrix");
            this.mTransMatrixLoc = glGetUniformLocation;
            GLUtils.checkLocationOrThrow(glGetUniformLocation, "uTransMatrix");
            int glGetUniformLocation2 = GLES20.glGetUniformLocation(i, "uAlphaScale");
            this.mAlphaScaleLoc = glGetUniformLocation2;
            GLUtils.checkLocationOrThrow(glGetUniformLocation2, "uAlphaScale");
        }

        public void use() {
            GLES20.glUseProgram(this.mProgramHandle);
            GLUtils.checkGlErrorOrThrow("glUseProgram");
            GLES20.glEnableVertexAttribArray(this.mPositionLoc);
            GLUtils.checkGlErrorOrThrow("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(this.mPositionLoc, 2, 5126, false, 0, (Buffer) GLUtils.VERTEX_BUF);
            GLUtils.checkGlErrorOrThrow("glVertexAttribPointer");
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            GLES20.glUniformMatrix4fv(this.mTransMatrixLoc, 1, false, fArr, 0);
            GLUtils.checkGlErrorOrThrow("glUniformMatrix4fv");
            GLES20.glUniform1f(this.mAlphaScaleLoc, 1.0f);
            GLUtils.checkGlErrorOrThrow("glUniform1f");
        }
    }

    static {
        Locale locale = Locale.US;
        DEFAULT_VERTEX_SHADER = "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        HDR_VERTEX_SHADER = "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        SHADER_PROVIDER_DEFAULT = new AnonymousClass1(0);
        SHADER_PROVIDER_HDR_DEFAULT = new AnonymousClass1(1);
        SHADER_PROVIDER_HDR_YUV = new AnonymousClass1(2);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        asFloatBuffer.position(0);
        VERTEX_BUF = asFloatBuffer;
        float[] fArr = {RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f, 1.0f, 1.0f};
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        asFloatBuffer2.put(fArr);
        asFloatBuffer2.position(0);
        TEX_BUF = asFloatBuffer2;
        NO_OUTPUT_SURFACE = new AutoValue_OutputSurface(EGL14.EGL_NO_SURFACE, 0, 0);
    }

    public static void checkEglErrorOrThrow(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1(Recorder$$ExternalSyntheticOutline1.m(eglGetError, Recorder$$ExternalSyntheticOutline2.m108m(str, ": EGL error: 0x")));
    }

    public static void checkGlErrorOrThrow(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1(Recorder$$ExternalSyntheticOutline1.m(glGetError, Recorder$$ExternalSyntheticOutline2.m108m(str, ": GL error 0x")));
    }

    public static void checkGlThreadOrThrow(Thread thread) {
        TransactorKt.checkState("Method call must be called on the GL thread.", thread == Thread.currentThread());
    }

    public static void checkInitializedOrThrow(AtomicBoolean atomicBoolean, boolean z) {
        TransactorKt.checkState(z ? "OpenGlRenderer is not initialized" : "OpenGlRenderer is already initialized", z == atomicBoolean.get());
    }

    public static void checkLocationOrThrow(int i, String str) {
        if (i >= 0) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Unable to locate '", str, "' in program"));
    }

    public static int[] chooseSurfaceAttrib(String str, DynamicRange dynamicRange) {
        int i = dynamicRange.mEncoding;
        int[] iArr = EMPTY_ATTRIBS;
        if (i == 3) {
            if (str.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                return HLG_SURFACE_ATTRIBS;
            }
            StringUtilsKt.w("GLUtils", "Dynamic range uses HLG encoding, but device does not support EGL_EXT_gl_colorspace_bt2020_hlg.Fallback to default colorspace.");
        }
        return iArr;
    }

    public static HashMap createPrograms(DynamicRange dynamicRange) {
        Object samplerShaderProgram;
        InputFormat inputFormat;
        Map map = Collections.EMPTY_MAP;
        HashMap hashMap = new HashMap();
        InputFormat[] values = InputFormat.values();
        int length = values.length;
        for (int i = 0; i < length; i++) {
            InputFormat inputFormat2 = values[i];
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) map.get(inputFormat2);
            if (anonymousClass1 != null) {
                samplerShaderProgram = new SamplerShaderProgram(dynamicRange, anonymousClass1);
            } else if (inputFormat2 == InputFormat.YUV || inputFormat2 == (inputFormat = InputFormat.DEFAULT)) {
                samplerShaderProgram = new SamplerShaderProgram(dynamicRange, inputFormat2);
            } else {
                TransactorKt.checkState("Unhandled input format: " + inputFormat2, inputFormat2 == InputFormat.UNKNOWN);
                if (dynamicRange.is10BitHdr()) {
                    samplerShaderProgram = new BlankShaderProgram("uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n", "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n");
                } else {
                    AnonymousClass1 anonymousClass12 = (AnonymousClass1) map.get(inputFormat);
                    samplerShaderProgram = anonymousClass12 != null ? new SamplerShaderProgram(dynamicRange, anonymousClass12) : new SamplerShaderProgram(dynamicRange, inputFormat);
                }
            }
            Log.d("GLUtils", "Shader program for input format " + inputFormat2 + " created: " + samplerShaderProgram);
            hashMap.put(inputFormat2, samplerShaderProgram);
        }
        return hashMap;
    }

    public static int createTexture() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        checkGlErrorOrThrow("glGenTextures");
        int i = iArr[0];
        GLES20.glBindTexture(36197, i);
        checkGlErrorOrThrow("glBindTexture " + i);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        checkGlErrorOrThrow("glTexParameter");
        return i;
    }

    public static EGLSurface createWindowSurface(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Surface surface, int[] iArr) {
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
        checkEglErrorOrThrow("eglCreateWindowSurface");
        if (eglCreateWindowSurface != null) {
            return eglCreateWindowSurface;
        }
        a$$ExternalSyntheticBUOutline0.m$1("surface was null");
        return null;
    }

    public static String getGlVersionNumber() {
        Matcher matcher = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(GLES20.glGetString(7938));
        if (!matcher.find()) {
            return "0.0";
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        group2.getClass();
        return Recorder$$ExternalSyntheticOutline2.m(group, ".", group2);
    }

    public static int loadShader(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        checkGlErrorOrThrow("glCreateShader type=" + i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        StringUtilsKt.w("GLUtils", "Could not compile shader: " + str);
        String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        throw new IllegalStateException("Could not compile shader type " + i + ":" + glGetShaderInfoLog);
    }

    public final class SamplerShaderProgram extends Program2D {
        public final int mSamplerLoc;
        public final int mTexCoordLoc;
        public final int mTexMatrixLoc;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public SamplerShaderProgram(DynamicRange dynamicRange, AnonymousClass1 anonymousClass1) {
            super(r3, r4);
            String str;
            String str2 = dynamicRange.is10BitHdr() ? GLUtils.HDR_VERTEX_SHADER : GLUtils.DEFAULT_VERTEX_SHADER;
            try {
                switch (anonymousClass1.$r8$classId) {
                    case 0:
                        Locale locale = Locale.US;
                        str = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaScale;\nvoid main() {\n    vec4 src = texture2D(sTexture, vTextureCoord);\n    gl_FragColor = vec4(src.rgb, src.a * uAlphaScale);\n}\n";
                        break;
                    case 1:
                        Locale locale2 = Locale.US;
                        str = "#version 300 es\n#extension GL_OES_EGL_image_external_essl3 : require\nprecision mediump float;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaScale;\nin vec2 vTextureCoord;\nout vec4 outColor;\n\nvoid main() {\n  vec4 src = texture(sTexture, vTextureCoord);\n  outColor = vec4(src.rgb, src.a * uAlphaScale);\n}";
                        break;
                    default:
                        Locale locale3 = Locale.US;
                        str = "#version 300 es\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT sTexture;\nuniform float uAlphaScale;\nin vec2 vTextureCoord;\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorMat = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorMat * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture(sTexture, vTextureCoord).xyz;\n  vec3 srcRgb = yuvToRgb(srcYuv);\n  outColor = vec4(srcRgb, uAlphaScale);\n}";
                        break;
                }
                if (!str.contains("vTextureCoord") || !str.contains("sTexture")) {
                    throw new IllegalArgumentException("Invalid fragment shader");
                }
                this.mSamplerLoc = -1;
                this.mTexMatrixLoc = -1;
                this.mTexCoordLoc = -1;
                loadLocations$1();
                int i = this.mProgramHandle;
                int glGetUniformLocation = GLES20.glGetUniformLocation(i, "sTexture");
                this.mSamplerLoc = glGetUniformLocation;
                GLUtils.checkLocationOrThrow(glGetUniformLocation, "sTexture");
                int glGetAttribLocation = GLES20.glGetAttribLocation(i, "aTextureCoord");
                this.mTexCoordLoc = glGetAttribLocation;
                GLUtils.checkLocationOrThrow(glGetAttribLocation, "aTextureCoord");
                int glGetUniformLocation2 = GLES20.glGetUniformLocation(i, "uTexMatrix");
                this.mTexMatrixLoc = glGetUniformLocation2;
                GLUtils.checkLocationOrThrow(glGetUniformLocation2, "uTexMatrix");
            } catch (Throwable th) {
                if (th instanceof IllegalArgumentException) {
                    throw th;
                }
                Handlers$$ExternalSyntheticBUOutline0.m("Unable retrieve fragment shader source", th);
                throw null;
            }
        }

        @Override // androidx.camera.core.processing.util.GLUtils.Program2D
        public final void use() {
            super.use();
            GLES20.glUniform1i(this.mSamplerLoc, 0);
            GLES20.glEnableVertexAttribArray(this.mTexCoordLoc);
            GLUtils.checkGlErrorOrThrow("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(this.mTexCoordLoc, 2, 5126, false, 0, (Buffer) GLUtils.TEX_BUF);
            GLUtils.checkGlErrorOrThrow("glVertexAttribPointer");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public SamplerShaderProgram(DynamicRange dynamicRange, InputFormat inputFormat) {
            this(dynamicRange, r5);
            AnonymousClass1 anonymousClass1;
            if (dynamicRange.is10BitHdr()) {
                TransactorKt.checkArgument("No default sampler shader available for" + inputFormat, inputFormat != InputFormat.UNKNOWN);
                if (inputFormat == InputFormat.YUV) {
                    anonymousClass1 = GLUtils.SHADER_PROVIDER_HDR_YUV;
                } else {
                    anonymousClass1 = GLUtils.SHADER_PROVIDER_HDR_DEFAULT;
                }
            } else {
                anonymousClass1 = GLUtils.SHADER_PROVIDER_DEFAULT;
            }
        }
    }
}

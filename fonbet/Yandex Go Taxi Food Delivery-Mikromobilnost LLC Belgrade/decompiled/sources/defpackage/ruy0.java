package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;

/* loaded from: classes10.dex */
public final class ruy0 {
    public static final float[] g;
    public static final float[] h;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    static {
        float[] fArr = new float[16];
        g = fArr;
        Matrix.setIdentityM(fArr, 0);
        float[] fArr2 = new float[16];
        h = fArr2;
        Matrix.setIdentityM(fArr2, 0);
        Matrix.translateM(fArr2, 0, 0.0f, 1.0f, 0.0f);
        Matrix.scaleM(fArr2, 0, 1.0f, -1.0f, 1.0f);
    }

    public static void a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        StringBuilder v = oyr.v(str, ": glError 0x");
        v.append(Integer.toHexString(glGetError));
        String sb = v.toString();
        Log.e("Texture2dProgram", sb);
        kbs.g(sb);
    }

    public static void b(int i, String str) {
        if (i >= 0) {
            return;
        }
        kbs.g(oyr.p("Unable to locate '", str, "' in program"));
    }

    public static int c(String str) {
        int d;
        int d2 = d(35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n");
        if (d2 == 0 || (d = d(35632, str)) == 0) {
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        a("glCreateProgram");
        if (glCreateProgram == 0) {
            Log.e("Texture2dProgram", "Could not create program");
        }
        GLES20.glAttachShader(glCreateProgram, d2);
        a("glAttachShader");
        GLES20.glAttachShader(glCreateProgram, d);
        a("glAttachShader");
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return glCreateProgram;
        }
        Log.e("Texture2dProgram", "Could not link program: ");
        Log.e("Texture2dProgram", GLES20.glGetProgramInfoLog(glCreateProgram));
        GLES20.glDeleteProgram(glCreateProgram);
        return 0;
    }

    public static int d(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        a("glCreateShader type=" + i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        Log.e("Texture2dProgram", "Could not compile shader " + i + ":");
        StringBuilder sb = new StringBuilder(" ");
        sb.append(GLES20.glGetShaderInfoLog(glCreateShader));
        Log.e("Texture2dProgram", sb.toString());
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }
}

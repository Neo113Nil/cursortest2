package com.google.common.math;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.tracing.Trace;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.graphics.backend.engine.TextureType;
import com.withpersona.sdk2.inquiry.workflows.WorkflowWorker;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public abstract class DoubleUtils {
    public static final void checkGlError(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        OptionalProvider$$ExternalSyntheticLambda0.m$1(Recorder$$ExternalSyntheticOutline2.m(str, " : glError 0x", Integer.toHexString(glGetError)));
    }

    public static final void checkLocation(int i, String str) {
        str.getClass();
        if (i >= 0) {
            return;
        }
        OptionalProvider$$ExternalSyntheticLambda0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Unable to locate '", str, "' in program"));
    }

    public static final int createProgram(int i, int i2) {
        int glCreateProgram = GLES20.glCreateProgram();
        checkGlError("glCreateProgram");
        GLES20.glAttachShader(glCreateProgram, i);
        checkGlError("glAttachShader");
        GLES20.glAttachShader(glCreateProgram, i2);
        checkGlError("glAttachShader");
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return glCreateProgram;
        }
        String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(glCreateProgram);
        GLES20.glDeleteProgram(glCreateProgram);
        OptionalProvider$$ExternalSyntheticLambda0.m$1(Recorder$$ExternalSyntheticOutline2.m("Could not link program: ", glGetProgramInfoLog));
        return 0;
    }

    public static boolean doesSameWorkAs(WorkflowWorker workflowWorker, WorkflowWorker workflowWorker2) {
        workflowWorker2.getClass();
        return workflowWorker2.getClass() == workflowWorker.getClass();
    }

    public static long getSignificand(double d) {
        Trace.checkArgument("not a normal value", isFinite(d));
        int exponent = Math.getExponent(d);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        return exponent == -1023 ? doubleToRawLongBits << 1 : doubleToRawLongBits | 4503599627370496L;
    }

    public static boolean isFinite(double d) {
        return Math.getExponent(d) <= 1023;
    }

    public static final int loadShader(int i, String str) {
        str.getClass();
        int glCreateShader = GLES20.glCreateShader(i);
        checkGlError("glCreateShader type=" + i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        OptionalProvider$$ExternalSyntheticLambda0.m$1(Recorder$$ExternalSyntheticOutline2.m("Could not compile shader: ", glGetShaderInfoLog));
        return 0;
    }

    public static final void updateTexture(int i, Bitmap bitmap, TextureType textureType) {
        int i2;
        bitmap.getClass();
        int ordinal = textureType.ordinal();
        if (ordinal == 0) {
            i2 = 9729;
        } else {
            if (ordinal != 1 && ordinal != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            i2 = 9728;
        }
        GLES20.glBindTexture(3553, i);
        GLES20.glTexParameteri(3553, 10241, i2);
        GLES20.glTexParameteri(3553, 10240, i2);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        checkGlError("texImage2D");
    }
}

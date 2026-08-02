package com.squareup.cash.graphics.swampgl.components;

import android.graphics.Color;
import android.opengl.GLES20;
import java.util.LinkedHashMap;

/* loaded from: classes6.dex */
public final class RealUniformBinder {
    public final LinkedHashMap locationCache = new LinkedHashMap();
    public final int maxAutoTextureUnit = 10;
    public int nextTextureUnit;
    public final int shaderProgram;

    public RealUniformBinder(int i) {
        this.shaderProgram = i;
    }

    public final void bindTexture(int i, String str) {
        int i2 = this.nextTextureUnit;
        if (i2 > this.maxAutoTextureUnit) {
            return;
        }
        this.nextTextureUnit = i2 + 1;
        GLES20.glActiveTexture(33984 + i2);
        GLES20.glBindTexture(3553, i);
        setInt(i2, str);
    }

    public final int getUniformLocation(String str) {
        LinkedHashMap linkedHashMap = this.locationCache;
        Object obj = linkedHashMap.get(str);
        if (obj == null) {
            obj = Integer.valueOf(GLES20.glGetUniformLocation(this.shaderProgram, str));
            linkedHashMap.put(str, obj);
        }
        return ((Number) obj).intValue();
    }

    public final void setColorRGB(int i, String str) {
        setFloat3(str, Color.red(i) / 255.0f, Color.green(i) / 255.0f, Color.blue(i) / 255.0f);
    }

    public final void setFloat(String str, float f) {
        int uniformLocation = getUniformLocation(str);
        if (uniformLocation >= 0) {
            GLES20.glUniform1f(uniformLocation, f);
        }
    }

    public final void setFloat3(String str, float f, float f2, float f3) {
        int uniformLocation = getUniformLocation(str);
        if (uniformLocation >= 0) {
            GLES20.glUniform3f(uniformLocation, f, f2, f3);
        }
    }

    public final void setFloat4(String str, float f, float f2, float f3, float f4) {
        int uniformLocation = getUniformLocation(str);
        if (uniformLocation >= 0) {
            GLES20.glUniform4f(uniformLocation, f, f2, f3, f4);
        }
    }

    public final void setInt(int i, String str) {
        int uniformLocation = getUniformLocation(str);
        if (uniformLocation >= 0) {
            GLES20.glUniform1i(uniformLocation, i);
        }
    }
}

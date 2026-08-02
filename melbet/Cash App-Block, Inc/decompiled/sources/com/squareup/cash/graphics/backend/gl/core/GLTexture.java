package com.squareup.cash.graphics.backend.gl.core;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.google.common.math.DoubleUtils;
import com.squareup.cash.graphics.backend.engine.TextureType;

/* loaded from: classes6.dex */
public final class GLTexture {
    public final int texture;

    public GLTexture(Bitmap bitmap, TextureType textureType) {
        bitmap.getClass();
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        DoubleUtils.checkGlError("glGenTextures");
        int i = iArr[0];
        DoubleUtils.updateTexture(i, bitmap, textureType);
        this.texture = i;
    }
}

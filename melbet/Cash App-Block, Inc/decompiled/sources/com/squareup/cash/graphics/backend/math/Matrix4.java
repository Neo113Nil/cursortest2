package com.squareup.cash.graphics.backend.math;

import android.opengl.Matrix;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class Matrix4 {
    public final float[] matrix;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Matrix4() {
        this(r0);
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Matrix4.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return Arrays.equals(this.matrix, ((Matrix4) obj).matrix);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.matrix);
    }

    public final Matrix4 times(Matrix4 matrix4) {
        matrix4.getClass();
        Matrix4 matrix42 = new Matrix4();
        Matrix.multiplyMM(matrix42.matrix, 0, this.matrix, 0, matrix4.matrix, 0);
        return matrix42;
    }

    public Matrix4(float[] fArr) {
        fArr.getClass();
        this.matrix = fArr;
    }
}

package com.squareup.cash.graphics.backend.math;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class Vector4 {
    public final float[] vector;

    public Vector4(float f, float f2, float f3, float f4) {
        this.vector = new float[]{f, f2, f3, f4};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Vector4.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return Arrays.equals(this.vector, ((Vector4) obj).vector);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.vector);
    }

    public final Vector4 times(Vector4 vector4) {
        vector4.getClass();
        float[] fArr = this.vector;
        float f = fArr[0];
        float[] fArr2 = vector4.vector;
        return new Vector4(f * fArr2[0], fArr[1] * fArr2[1], fArr[2] * fArr2[2], fArr[3] * fArr2[3]);
    }

    public Vector4(float[] fArr) {
        this.vector = fArr;
    }

    public /* synthetic */ Vector4() {
        this(new float[4]);
    }

    public Vector4(float f, float f2) {
        this(RecyclerView.DECELERATION_RATE, f, f2, 1.0f);
    }
}

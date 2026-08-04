package com.gamericefishpro.space.t9;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final LinearInterpolator a = new LinearInterpolator();
    public static final com.gamericefishpro.space.x4.a b = new com.gamericefishpro.space.x4.a(com.gamericefishpro.space.x4.a.d);
    public static final com.gamericefishpro.space.x4.a c = new com.gamericefishpro.space.x4.a();
    public static final com.gamericefishpro.space.x4.a d = new com.gamericefishpro.space.x4.a(com.gamericefishpro.space.x4.a.e);

    static {
        new DecelerateInterpolator();
    }

    public static float a(float f, float f2, float f3) {
        return ((f2 - f) * f3) + f;
    }

    public static float b(float f, float f2, float f3, float f4, float f5) {
        if (f5 <= f3) {
            return f;
        }
        return f5 >= f4 ? f2 : a(f, f2, (f5 - f3) / (f4 - f3));
    }

    public static int c(float f, int i, int i2) {
        return Math.round(f * (i2 - i)) + i;
    }
}

package com.gamericefishpro.space.i6;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {
    public static final y a;
    public static final b b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new z();
        } else {
            a = new y();
        }
        b = new b(Float.class, "translationAlpha", 5);
        new b(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        a.T(view, i, i2, i3, i4);
    }

    public static void b(View view, int i) {
        a.O(view, i);
    }
}

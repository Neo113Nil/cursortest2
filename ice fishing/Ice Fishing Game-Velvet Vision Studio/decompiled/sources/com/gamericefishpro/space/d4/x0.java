package com.gamericefishpro.space.d4;

import android.os.Build;
import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 {
    public w0 a;

    public x0(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new v0(com.appsflyer.internal.o.j(i, interpolator, j));
        } else {
            this.a = new t0(i, interpolator, j);
        }
    }
}

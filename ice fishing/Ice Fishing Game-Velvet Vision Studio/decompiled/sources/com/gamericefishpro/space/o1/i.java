package com.gamericefishpro.space.o1;

import android.graphics.PathMeasure;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public final PathMeasure a;

    public i(PathMeasure pathMeasure) {
        this.a = pathMeasure;
    }

    public final boolean a(float f, float f2, h hVar) {
        if (hVar == null) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        return this.a.getSegment(f, f2, hVar.a, true);
    }
}

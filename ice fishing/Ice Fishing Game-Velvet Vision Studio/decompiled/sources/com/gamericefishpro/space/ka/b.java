package com.gamericefishpro.space.ka;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements d {
    public final d a;
    public final float b;

    public b(float f, d dVar) {
        while (dVar instanceof b) {
            dVar = ((b) dVar).a;
            f += ((b) dVar).b;
        }
        this.a = dVar;
        this.b = f;
    }

    @Override // com.gamericefishpro.space.ka.d
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a.equals(bVar.a) && this.b == bVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}

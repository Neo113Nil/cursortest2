package com.gamericefishpro.space.o1;

import android.graphics.RenderEffect;
import com.gamericefishpro.space.t0.y0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class n {
    public RenderEffect a;
    public final float b;
    public final float c;
    public final int d;

    public n(float f, float f2, int i) {
        this.b = f;
        this.c = f2;
        this.d = i;
    }

    public final RenderEffect a() {
        RenderEffect renderEffectCreateOffsetEffect = this.a;
        if (renderEffectCreateOffsetEffect == null) {
            float f = this.b;
            float f2 = this.c;
            renderEffectCreateOffsetEffect = (f == 0.0f && f2 == 0.0f) ? RenderEffect.createOffsetEffect(0.0f, 0.0f) : RenderEffect.createBlurEffect(f, f2, o.x(this.d));
            this.a = renderEffectCreateOffsetEffect;
        }
        return renderEffectCreateOffsetEffect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.b == nVar.b && this.c == nVar.c && this.d == nVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + y0.a(this.c, Float.hashCode(this.b) * 31, 31);
    }

    public final String toString() {
        return "BlurEffect(renderEffect=null, radiusX=" + this.b + ", radiusY=" + this.c + ", edgeTreatment=" + ((Object) o.D(this.d)) + ')';
    }
}

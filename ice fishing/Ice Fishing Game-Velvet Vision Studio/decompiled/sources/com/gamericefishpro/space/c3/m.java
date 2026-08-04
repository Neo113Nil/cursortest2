package com.gamericefishpro.space.c3;

import com.gamericefishpro.space.t0.y0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements com.gamericefishpro.space.d3.a {
    public final float a;

    public m(float f) {
        this.a = f;
    }

    @Override // com.gamericefishpro.space.d3.a
    public final float a(float f) {
        return f / this.a;
    }

    @Override // com.gamericefishpro.space.d3.a
    public final float b(float f) {
        return f * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Float.compare(this.a, ((m) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return y0.h(new StringBuilder("LinearFontScaleConverter(fontScale="), this.a, ')');
    }
}

package com.gamericefishpro.space.u1;

import com.gamericefishpro.space.t0.y0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends b0 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public w(float f, float f2, float f3, float f4) {
        super(1);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Float.compare(this.c, wVar.c) == 0 && Float.compare(this.d, wVar.d) == 0 && Float.compare(this.e, wVar.e) == 0 && Float.compare(this.f, wVar.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + y0.a(this.e, y0.a(this.d, Float.hashCode(this.c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeQuadTo(dx1=");
        sb.append(this.c);
        sb.append(", dy1=");
        sb.append(this.d);
        sb.append(", dx2=");
        sb.append(this.e);
        sb.append(", dy2=");
        return y0.h(sb, this.f, ')');
    }
}

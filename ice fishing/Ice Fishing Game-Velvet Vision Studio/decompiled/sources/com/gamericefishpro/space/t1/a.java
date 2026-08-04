package com.gamericefishpro.space.t1;

import com.gamericefishpro.space.c3.i;
import com.gamericefishpro.space.d9.h;
import com.gamericefishpro.space.o1.f;
import com.gamericefishpro.space.o1.k;
import com.gamericefishpro.space.q1.d;
import com.gamericefishpro.space.t0.y0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends b {
    public final f e;
    public final long f;
    public final int g;
    public final long h;
    public float i;
    public k j;

    public a(f fVar) {
        int i;
        int i2;
        long width = (((long) fVar.a.getWidth()) << 32) | (((long) fVar.a.getHeight()) & 4294967295L);
        this.e = fVar;
        this.f = width;
        this.g = 1;
        if (((int) 0) < 0 || ((int) 0) < 0 || (i = (int) (width >> 32)) < 0 || (i2 = (int) (width & 4294967295L)) < 0 || i > fVar.a.getWidth() || i2 > fVar.a.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.h = width;
        this.i = 1.0f;
    }

    @Override // com.gamericefishpro.space.t1.b
    public final void a(float f) {
        this.i = f;
    }

    @Override // com.gamericefishpro.space.t1.b
    public final void b(k kVar) {
        this.j = kVar;
    }

    @Override // com.gamericefishpro.space.t1.b
    public final long d() {
        return h.Q(this.h);
    }

    @Override // com.gamericefishpro.space.t1.b
    public final void e(d dVar) {
        int iRound = Math.round(Float.intBitsToFloat((int) (dVar.c() >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (dVar.c() & 4294967295L)));
        float f = this.i;
        k kVar = this.j;
        int i = this.g;
        d.A(dVar, this.e, this.f, (((long) iRound) << 32) | (((long) iRound2) & 4294967295L), f, kVar, i, 328);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.a(this.e, aVar.e) && i.a(0L, 0L) && com.gamericefishpro.space.c3.k.a(this.f, aVar.f) && this.g == aVar.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + y0.b(y0.b(this.e.hashCode() * 31, 31, 0L), 31, this.f);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.e);
        sb.append(", srcOffset=");
        sb.append((Object) i.d(0L));
        sb.append(", srcSize=");
        sb.append((Object) com.gamericefishpro.space.c3.k.b(this.f));
        sb.append(", filterQuality=");
        int i = this.g;
        if (i == 0) {
            str = "None";
        } else if (i == 1) {
            str = "Low";
        } else if (i == 2) {
            str = "Medium";
        } else {
            str = i == 3 ? "High" : "Unknown";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}

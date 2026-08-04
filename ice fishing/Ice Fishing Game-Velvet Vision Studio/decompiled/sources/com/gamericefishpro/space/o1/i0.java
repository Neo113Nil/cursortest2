package com.gamericefishpro.space.o1;

import android.graphics.Paint;
import android.graphics.Shader;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i0 extends o {
    public com.gamericefishpro.space.m.d f;
    public long g = 9205357640488583168L;

    public abstract Shader H(long j);

    @Override // com.gamericefishpro.space.o1.o
    public final void g(float f, long j, com.gamericefishpro.space.r8.m mVar) {
        Paint paint = (Paint) mVar.b;
        com.gamericefishpro.space.m.d dVar = this.f;
        if (dVar == null || !com.gamericefishpro.space.n1.e.a(this.g, j)) {
            if (com.gamericefishpro.space.n1.e.c(j)) {
                this.f = null;
                this.g = 9205357640488583168L;
                dVar = null;
            } else {
                dVar = this.f;
                if (dVar == null) {
                    dVar = new com.gamericefishpro.space.m.d(15);
                    this.f = dVar;
                }
                dVar.e = H(j);
                this.f = dVar;
                this.g = j;
            }
        }
        long jB = o.b(paint.getColor());
        long j2 = s.b;
        if (!s.d(jB, j2)) {
            mVar.c(j2);
        }
        if (!Intrinsics.a((Shader) mVar.c, dVar != null ? (Shader) dVar.e : null)) {
            Shader shader = dVar != null ? (Shader) dVar.e : null;
            mVar.c = shader;
            paint.setShader(shader);
        }
        if (paint.getAlpha() / 255.0f == f) {
            return;
        }
        mVar.a(f);
    }
}

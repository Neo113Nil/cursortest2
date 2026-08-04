package com.gamericefishpro.space.t1;

import com.gamericefishpro.space.c3.l;
import com.gamericefishpro.space.h2.h0;
import com.gamericefishpro.space.m.d;
import com.gamericefishpro.space.o1.k;
import com.gamericefishpro.space.r8.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public m a;
    public k b;
    public float c = 1.0f;
    public l d = l.d;

    public abstract void a(float f);

    public abstract void b(k kVar);

    public final void c(h0 h0Var, long j, float f, k kVar) {
        com.gamericefishpro.space.q1.b bVar = h0Var.d;
        if (this.c != f) {
            a(f);
            this.c = f;
        }
        if (!Intrinsics.a(this.b, kVar)) {
            b(kVar);
            this.b = kVar;
        }
        l layoutDirection = h0Var.getLayoutDirection();
        if (this.d != layoutDirection) {
            this.d = layoutDirection;
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (bVar.c() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (bVar.c() & 4294967295L)) - Float.intBitsToFloat(i2);
        ((d) bVar.e.e).v(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    e(h0Var);
                }
            } finally {
                ((d) bVar.e.e).v(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
            }
        }
    }

    public abstract long d();

    public abstract void e(com.gamericefishpro.space.q1.d dVar);
}

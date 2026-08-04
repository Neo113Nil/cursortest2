package com.gamericefishpro.space.y;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.z.p1;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l {
    public final com.gamericefishpro.space.c3.c a;
    public long b = 9205357640488583168L;
    public final f0 c;
    public final com.gamericefishpro.space.t0.f1 d;
    public final boolean e;
    public boolean f;
    public long g;
    public long h;
    public final com.gamericefishpro.space.h2.j i;

    public l(Context context, com.gamericefishpro.space.c3.c cVar, long j, com.gamericefishpro.space.d0.u0 u0Var) {
        this.a = cVar;
        f0 f0Var = new f0(context, com.gamericefishpro.space.o1.o.y(j));
        this.c = f0Var;
        this.d = new com.gamericefishpro.space.t0.f1(Unit.a, com.gamericefishpro.space.t0.f.v);
        this.e = true;
        this.g = 0L;
        this.h = -1L;
        k kVar = new k(this);
        com.gamericefishpro.space.b2.h hVar = com.gamericefishpro.space.b2.b0.a;
        com.gamericefishpro.space.b2.f0 f0Var2 = new com.gamericefishpro.space.b2.f0(null, null, kVar);
        this.i = Build.VERSION.SDK_INT >= 31 ? new j0(f0Var2, this, f0Var) : new j0(f0Var2, this, f0Var, u0Var);
    }

    public final void a() {
        boolean z;
        f0 f0Var = this.c;
        EdgeEffect edgeEffect = f0Var.d;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = f0Var.e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = f0Var.f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = f0Var.g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        if (r4.invokeSuspend(kotlin.Unit.a) == r6) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x013a, code lost:
    
        if (r4 == r6) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, p1 p1Var, com.gamericefishpro.space.vh.c cVar) {
        i iVar;
        float fC;
        float fC2;
        long jD;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i = iVar.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                iVar.v = i - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object objInvokeSuspend = iVar.e;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i2 = iVar.v;
        f0 f0Var = this.c;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(objInvokeSuspend);
            if (com.gamericefishpro.space.n1.e.c(this.g)) {
                iVar.v = 1;
                p1Var.getClass();
                p1 p1Var2 = new p1(p1Var.v, iVar);
                p1Var2.i = j;
            } else {
                boolean zG = f0.g(f0Var.f);
                com.gamericefishpro.space.c3.c cVar2 = this.a;
                if (!zG || com.gamericefishpro.space.c3.p.b(j) >= 0.0f) {
                    fC = (!f0.g(f0Var.g) || com.gamericefishpro.space.c3.p.b(j) <= 0.0f) ? 0.0f : -q.c(f0Var.d(), -com.gamericefishpro.space.c3.p.b(j), Float.intBitsToFloat((int) (this.g >> 32)), cVar2);
                } else {
                    fC = q.c(f0Var.c(), com.gamericefishpro.space.c3.p.b(j), Float.intBitsToFloat((int) (this.g >> 32)), cVar2);
                }
                if (!f0.g(f0Var.d) || com.gamericefishpro.space.c3.p.c(j) >= 0.0f) {
                    fC2 = (!f0.g(f0Var.e) || com.gamericefishpro.space.c3.p.c(j) <= 0.0f) ? 0.0f : -q.c(f0Var.b(), -com.gamericefishpro.space.c3.p.c(j), Float.intBitsToFloat((int) (this.g & 4294967295L)), cVar2);
                } else {
                    fC2 = q.c(f0Var.e(), com.gamericefishpro.space.c3.p.c(j), Float.intBitsToFloat((int) (this.g & 4294967295L)), cVar2);
                }
                long j2 = y3.j(fC, fC2);
                if (j2 != 0) {
                    d();
                }
                jD = com.gamericefishpro.space.c3.p.d(j, j2);
                iVar.d = jD;
                iVar.v = 2;
                p1Var.getClass();
                p1 p1Var3 = new p1(p1Var.v, iVar);
                p1Var3.i = jD;
                objInvokeSuspend = p1Var3.invokeSuspend(Unit.a);
            }
            return aVar;
        }
        if (i2 == 1) {
            com.gamericefishpro.space.wa.b.P(objInvokeSuspend);
            return Unit.a;
        }
        if (i2 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        jD = iVar.d;
        com.gamericefishpro.space.wa.b.P(objInvokeSuspend);
        long jD2 = com.gamericefishpro.space.c3.p.d(jD, ((com.gamericefishpro.space.c3.p) objInvokeSuspend).a);
        this.f = false;
        if (com.gamericefishpro.space.c3.p.b(jD2) > 0.0f) {
            EdgeEffect edgeEffectC = f0Var.c();
            int iA = com.gamericefishpro.space.gi.c.a(com.gamericefishpro.space.c3.p.b(jD2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectC.isFinished()) {
                edgeEffectC.onAbsorb(iA);
            }
        } else if (com.gamericefishpro.space.c3.p.b(jD2) < 0.0f) {
            EdgeEffect edgeEffectD = f0Var.d();
            int i3 = -com.gamericefishpro.space.gi.c.a(com.gamericefishpro.space.c3.p.b(jD2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectD.isFinished()) {
                edgeEffectD.onAbsorb(i3);
            }
        }
        if (com.gamericefishpro.space.c3.p.c(jD2) > 0.0f) {
            EdgeEffect edgeEffectE = f0Var.e();
            int iA2 = com.gamericefishpro.space.gi.c.a(com.gamericefishpro.space.c3.p.c(jD2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectE.isFinished()) {
                edgeEffectE.onAbsorb(iA2);
            }
        } else if (com.gamericefishpro.space.c3.p.c(jD2) < 0.0f) {
            EdgeEffect edgeEffectB = f0Var.b();
            int i4 = -com.gamericefishpro.space.gi.c.a(com.gamericefishpro.space.c3.p.c(jD2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectB.isFinished()) {
                edgeEffectB.onAbsorb(i4);
            }
        }
        a();
        return Unit.a;
    }

    public final long c() {
        long jV = this.b;
        if ((9223372034707292159L & jV) == 9205357640488583168L) {
            jV = com.gamericefishpro.space.wa.b.v(this.g);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jV >> 32)) / Float.intBitsToFloat((int) (this.g >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jV & 4294967295L)) / Float.intBitsToFloat((int) (this.g & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public final void d() {
        if (this.e) {
            this.d.setValue(Unit.a);
        }
    }

    public final float e(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect edgeEffectB = this.c.b();
        float fC = -fIntBitsToFloat2;
        float f = 1 - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fC = o.c(edgeEffectB, fC, f);
        } else {
            edgeEffectB.onPull(fC, f);
        }
        return (i2 >= 31 ? o.b(edgeEffectB) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.g)) * (-fC) : Float.intBitsToFloat(i);
    }

    public final float f(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect edgeEffectC = this.c.c();
        float f = 1 - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = o.c(edgeEffectC, fIntBitsToFloat2, f);
        } else {
            edgeEffectC.onPull(fIntBitsToFloat2, f);
        }
        return (i2 >= 31 ? o.b(edgeEffectC) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final float g(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect edgeEffectD = this.c.d();
        float fC = -fIntBitsToFloat2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fC = o.c(edgeEffectD, fC, fIntBitsToFloat);
        } else {
            edgeEffectD.onPull(fC, fIntBitsToFloat);
        }
        return (i2 >= 31 ? o.b(edgeEffectD) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * (-fC) : Float.intBitsToFloat(i);
    }

    public final float h(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect edgeEffectE = this.c.e();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = o.c(edgeEffectE, fIntBitsToFloat2, fIntBitsToFloat);
        } else {
            edgeEffectE.onPull(fIntBitsToFloat2, fIntBitsToFloat);
        }
        return (i2 >= 31 ? o.b(edgeEffectE) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g & 4294967295L)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final void i(long j) {
        boolean zA = com.gamericefishpro.space.n1.e.a(this.g, 0L);
        boolean zA2 = com.gamericefishpro.space.n1.e.a(j, this.g);
        this.g = j;
        if (!zA2) {
            int iA = com.gamericefishpro.space.gi.c.a(Float.intBitsToFloat((int) (j >> 32)));
            long jA = (((long) com.gamericefishpro.space.gi.c.a(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iA) << 32);
            f0 f0Var = this.c;
            f0Var.c = jA;
            EdgeEffect edgeEffect = f0Var.d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jA >> 32), (int) (jA & 4294967295L));
            }
            EdgeEffect edgeEffect2 = f0Var.e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jA >> 32), (int) (jA & 4294967295L));
            }
            EdgeEffect edgeEffect3 = f0Var.f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jA & 4294967295L), (int) (jA >> 32));
            }
            EdgeEffect edgeEffect4 = f0Var.g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jA & 4294967295L), (int) (jA >> 32));
            }
            EdgeEffect edgeEffect5 = f0Var.h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jA >> 32), (int) (jA & 4294967295L));
            }
            EdgeEffect edgeEffect6 = f0Var.i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jA >> 32), (int) (jA & 4294967295L));
            }
            EdgeEffect edgeEffect7 = f0Var.j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jA & 4294967295L), (int) (jA >> 32));
            }
            EdgeEffect edgeEffect8 = f0Var.k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jA), (int) (jA >> 32));
            }
        }
        if (zA || zA2) {
            return;
        }
        a();
    }
}

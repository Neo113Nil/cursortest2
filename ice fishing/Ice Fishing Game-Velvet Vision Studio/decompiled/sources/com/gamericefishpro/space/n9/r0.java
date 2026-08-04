package com.gamericefishpro.space.n9;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r0 implements com.gamericefishpro.space.r9.d {
    public final /* synthetic */ int d;
    public long e;
    public Object i;

    public /* synthetic */ r0(Object obj, long j, int i) {
        this.d = i;
        this.i = obj;
        this.e = j;
    }

    public long a(long j, long j2, float f) {
        long jE = com.gamericefishpro.space.n1.b.e(this.e, com.gamericefishpro.space.n1.b.d(j, j2));
        this.e = jE;
        if ((((com.gamericefishpro.space.z.v0) this.i) == null ? com.gamericefishpro.space.n1.b.c(jE) : Math.abs(h(jE))) < f) {
            return 9205357640488583168L;
        }
        if (((com.gamericefishpro.space.z.v0) this.i) == null) {
            long j3 = this.e;
            float fC = com.gamericefishpro.space.n1.b.c(j3);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) / fC;
            return com.gamericefishpro.space.n1.b.d(this.e, com.gamericefishpro.space.n1.b.f((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 & 4294967295L)) / fC)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32), f));
        }
        float fH = h(this.e) - (Math.signum(h(this.e)) * f);
        long j4 = this.e;
        com.gamericefishpro.space.z.v0 v0Var = (com.gamericefishpro.space.z.v0) this.i;
        com.gamericefishpro.space.z.v0 v0Var2 = com.gamericefishpro.space.z.v0.e;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (v0Var == v0Var2 ? j4 & 4294967295L : j4 >> 32));
        if (((com.gamericefishpro.space.z.v0) this.i) == v0Var2) {
            return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fH)) << 32);
        }
        return (((long) Float.floatToRawIntBits(fH)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32);
    }

    public void b(int i) {
        if (i < 64) {
            this.e &= ~(1 << i);
            return;
        }
        r0 r0Var = (r0) this.i;
        if (r0Var != null) {
            r0Var.b(i - 64);
        }
    }

    public int c(int i) {
        r0 r0Var = (r0) this.i;
        if (r0Var == null) {
            return i >= 64 ? Long.bitCount(this.e) : Long.bitCount(this.e & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.e & ((1 << i) - 1));
        }
        return Long.bitCount(this.e) + r0Var.c(i - 64);
    }

    @Override // com.gamericefishpro.space.r9.d
    public void d(Exception exc) {
        com.gamericefishpro.space.s8.b bVar;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((AtomicLong) ((com.gamericefishpro.space.a8.c) this.i).v).set(this.e);
                break;
            default:
                com.gamericefishpro.space.o8.e eVar = (com.gamericefishpro.space.o8.e) this.i;
                long j = this.e;
                eVar.getClass();
                "getting error as ".concat(String.valueOf(exc.getMessage()));
                if ((exc instanceof com.gamericefishpro.space.t8.d) && (bVar = ((com.gamericefishpro.space.t8.d) exc).d.v) != null && bVar.e == 24) {
                    eVar.b.set(j);
                    break;
                }
                break;
        }
    }

    public void e() {
        if (((r0) this.i) == null) {
            this.i = new r0();
        }
    }

    public boolean f(int i) {
        if (i < 64) {
            return (this.e & (1 << i)) != 0;
        }
        e();
        return ((r0) this.i).f(i - 64);
    }

    public void g(int i, boolean z) {
        if (i >= 64) {
            e();
            ((r0) this.i).g(i - 64, z);
            return;
        }
        long j = this.e;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.e = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            k(i);
        } else {
            b(i);
        }
        if (z2 || ((r0) this.i) != null) {
            e();
            ((r0) this.i).g(0, z2);
        }
    }

    public float h(long j) {
        return Float.intBitsToFloat((int) (((com.gamericefishpro.space.z.v0) this.i) == com.gamericefishpro.space.z.v0.e ? j >> 32 : j & 4294967295L));
    }

    public boolean i(int i) {
        if (i >= 64) {
            e();
            return ((r0) this.i).i(i - 64);
        }
        long j = 1 << i;
        long j2 = this.e;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.e = j3;
        long j4 = j - 1;
        this.e = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        r0 r0Var = (r0) this.i;
        if (r0Var != null) {
            if (r0Var.f(0)) {
                k(63);
            }
            ((r0) this.i).i(0);
        }
        return z;
    }

    public void j() {
        this.e = 0L;
        r0 r0Var = (r0) this.i;
        if (r0Var != null) {
            r0Var.j();
        }
    }

    public void k(int i) {
        if (i < 64) {
            this.e |= 1 << i;
        } else {
            e();
            ((r0) this.i).k(i - 64);
        }
    }

    public String toString() {
        switch (this.d) {
            case 3:
                if (((r0) this.i) == null) {
                    return Long.toBinaryString(this.e);
                }
                return ((r0) this.i).toString() + "xx" + Long.toBinaryString(this.e);
            default:
                return super.toString();
        }
    }

    public r0(com.gamericefishpro.space.z8.a aVar) {
        this.d = 1;
        com.gamericefishpro.space.v8.c0.g(aVar);
        this.i = aVar;
    }

    public r0() {
        this.d = 3;
        this.e = 0L;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(com.gamericefishpro.space.z.v0 v0Var) {
        this(v0Var, 0L, 4);
        this.d = 4;
    }
}

package defpackage;

import androidx.compose.foundation.lazy.layout.b;
import java.util.List;

/* loaded from: classes.dex */
public final class cvf implements vtf {
    public final int a;
    public final List b;
    public final boolean c;
    public final gz2 d;
    public final hz2 e;
    public final xof f;
    public final boolean g;
    public final int h;
    public final int i;
    public final int j;
    public final long k;
    public final Object l;
    public final Object m;
    public final b n;
    public final long o;
    public int p;
    public final int q;
    public final int r;
    public final int s;
    public boolean t;
    public int u = Integer.MIN_VALUE;
    public int v;
    public int w;
    public final int[] x;

    public cvf(int i, List list, boolean z, gz2 gz2Var, hz2 hz2Var, xof xofVar, boolean z2, int i2, int i3, int i4, long j, Object obj, Object obj2, b bVar, long j2) {
        this.a = i;
        this.b = list;
        this.c = z;
        this.d = gz2Var;
        this.e = hz2Var;
        this.f = xofVar;
        this.g = z2;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = j;
        this.l = obj;
        this.m = obj2;
        this.n = bVar;
        this.o = j2;
        int size = list.size();
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            ksk kskVar = (ksk) list.get(i7);
            boolean z3 = this.c;
            i5 += z3 ? kskVar.b : kskVar.a;
            i6 = Math.max(i6, !z3 ? kskVar.b : kskVar.a);
        }
        this.q = i5;
        int i8 = i5 + this.j;
        this.r = i8 >= 0 ? i8 : 0;
        this.s = i6;
        this.x = new int[this.b.size() * 2];
    }

    @Override // defpackage.vtf
    public final void a(int i, int i2, int i3, int i4) {
        m(i, i3, i4);
    }

    @Override // defpackage.vtf
    public final int b() {
        return this.b.size();
    }

    @Override // defpackage.vtf
    public final int c() {
        return 1;
    }

    @Override // defpackage.vtf
    public final long d() {
        return this.o;
    }

    @Override // defpackage.vtf
    public final boolean e() {
        return this.c;
    }

    @Override // defpackage.vtf
    public final int f() {
        return this.r;
    }

    @Override // defpackage.vtf
    public final Object g(int i) {
        return ((ksk) this.b.get(i)).n();
    }

    @Override // defpackage.vtf
    public final int getIndex() {
        return this.a;
    }

    @Override // defpackage.vtf
    public final Object getKey() {
        return this.l;
    }

    @Override // defpackage.vtf
    public final void h() {
        this.t = true;
    }

    @Override // defpackage.vtf
    public final long i(int i) {
        int i2 = i * 2;
        int[] iArr = this.x;
        return (iArr[i2] << 32) | (iArr[i2 + 1] & 4294967295L);
    }

    @Override // defpackage.vtf
    public final int j() {
        return 0;
    }

    public final int k(long j) {
        return (int) (this.c ? j & 4294967295L : j >> 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(jsk jskVar, boolean z) {
        List list;
        int i;
        int i2;
        long j;
        if (this.u == Integer.MIN_VALUE) {
            vme.a("position() should be called first");
        }
        List list2 = this.b;
        int i3 = 0;
        for (int size = list2.size(); i3 < size; size = i) {
            ksk kskVar = (ksk) list2.get(i3);
            int i4 = this.v;
            boolean z2 = this.c;
            int i5 = i4 - (z2 ? kskVar.b : kskVar.a);
            int i6 = this.w;
            long i7 = i(i3);
            ltf a = this.n.a(i3, this.l);
            xod xodVar = null;
            Object[] objArr = 0;
            if (a != null) {
                if (z) {
                    a.r = i7;
                    list = list2;
                    i = size;
                } else {
                    list = list2;
                    i = size;
                    if (!wpe.b(a.r, ltf.s)) {
                        i7 = a.r;
                    }
                    long d = wpe.d(i7, ((wpe) a.q.getValue()).a);
                    if (((k(i7) <= i5 && k(d) <= i5) || (k(i7) >= i6 && k(d) >= i6)) && ((Boolean) a.h.getValue()).booleanValue()) {
                        x97.y(a.a, null, null, new jtf(a, objArr == true ? 1 : 0, 1), 3);
                    }
                    i7 = d;
                }
                xodVar = a.n;
            } else {
                list = list2;
                i = size;
            }
            if (this.g) {
                int i8 = this.u;
                if (z2) {
                    i2 = i3;
                    j = (((int) (i7 >> 32)) << 32) | (((i8 - ((int) (i7 & 4294967295L))) - (z2 ? kskVar.b : kskVar.a)) & 4294967295L);
                } else {
                    i2 = i3;
                    j = (((int) (i7 & 4294967295L)) & 4294967295L) | (((i8 - ((int) (i7 >> 32))) - (z2 ? kskVar.b : kskVar.a)) << 32);
                }
                i7 = j;
            } else {
                i2 = i3;
            }
            long d2 = wpe.d(i7, this.k);
            if (!z && a != null) {
                a.m = d2;
            }
            if (z2) {
                if (xodVar != null) {
                    jskVar.getClass();
                    jsk.a(jskVar, kskVar);
                    kskVar.p0(wpe.d(d2, kskVar.e), 0.0f, xodVar);
                } else {
                    jsk.m(jskVar, kskVar, d2);
                }
            } else if (xodVar == null) {
                jsk.k(jskVar, kskVar, d2);
            } else if (jskVar.b() == xof.a || jskVar.c() == 0) {
                jsk.a(jskVar, kskVar);
                kskVar.p0(wpe.d(d2, kskVar.e), 0.0f, xodVar);
            } else {
                int c = (jskVar.c() - kskVar.a) - ((int) (d2 >> 32));
                jsk.a(jskVar, kskVar);
                kskVar.p0(wpe.d((c << 32) | (4294967295L & ((int) (d2 & 4294967295L))), kskVar.e), 0.0f, xodVar);
            }
            i3 = i2 + 1;
            list2 = list;
        }
    }

    public final void m(int i, int i2, int i3) {
        int i4;
        this.p = i;
        boolean z = this.c;
        this.u = z ? i3 : i2;
        List list = this.b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            ksk kskVar = (ksk) list.get(i5);
            int i6 = i5 * 2;
            int[] iArr = this.x;
            if (z) {
                gz2 gz2Var = this.d;
                if (gz2Var == null) {
                    vme.b("null horizontalAlignment when isVertical == true");
                    rj7.f();
                    return;
                } else {
                    iArr[i6] = gz2Var.a(kskVar.a, i2, this.f);
                    iArr[i6 + 1] = i;
                    i4 = kskVar.b;
                }
            } else {
                iArr[i6] = i;
                int i7 = i6 + 1;
                hz2 hz2Var = this.e;
                if (hz2Var == null) {
                    vme.b("null verticalAlignment when isVertical == false");
                    rj7.f();
                    return;
                } else {
                    iArr[i7] = hz2Var.a(kskVar.b, i3);
                    i4 = kskVar.a;
                }
            }
            i += i4;
        }
        this.v = -this.h;
        this.w = this.u + this.i;
    }
}

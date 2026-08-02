package defpackage;

import androidx.compose.foundation.lazy.layout.b;
import java.util.List;

/* loaded from: classes.dex */
public final class lsf implements vtf {
    public final int a;
    public final Object b;
    public final int c;
    public final xof d;
    public final int e;
    public final int f;
    public final List g;
    public final long h;
    public final Object i;
    public final b j;
    public final long k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public int p = Integer.MIN_VALUE;
    public int q;
    public int r;
    public final long s;
    public long t;
    public int u;
    public int v;
    public boolean w;

    public lsf(int i, Object obj, int i2, int i3, xof xofVar, int i4, int i5, List list, long j, Object obj2, b bVar, long j2, int i6, int i7) {
        this.a = i;
        this.b = obj;
        this.c = i2;
        this.d = xofVar;
        this.e = i4;
        this.f = i5;
        this.g = list;
        this.h = j;
        this.i = obj2;
        this.j = bVar;
        this.k = j2;
        this.l = i6;
        this.m = i7;
        int size = list.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 = Math.max(i8, ((ksk) list.get(i9)).b);
        }
        this.n = i8;
        int i10 = i3 + i8;
        this.o = i10 >= 0 ? i10 : 0;
        this.s = (this.c << 32) | (i8 & 4294967295L);
        this.t = 0L;
        this.u = -1;
        this.v = -1;
    }

    @Override // defpackage.vtf
    public final void a(int i, int i2, int i3, int i4) {
        l(i, i2, i3, i4, -1, -1);
    }

    @Override // defpackage.vtf
    public final int b() {
        return this.g.size();
    }

    @Override // defpackage.vtf
    public final int c() {
        return this.m;
    }

    @Override // defpackage.vtf
    public final long d() {
        return this.k;
    }

    @Override // defpackage.vtf
    public final boolean e() {
        return true;
    }

    @Override // defpackage.vtf
    public final int f() {
        return this.o;
    }

    @Override // defpackage.vtf
    public final Object g(int i) {
        return ((ksk) this.g.get(i)).n();
    }

    @Override // defpackage.vtf
    public final int getIndex() {
        return this.a;
    }

    @Override // defpackage.vtf
    public final Object getKey() {
        return this.b;
    }

    @Override // defpackage.vtf
    public final void h() {
        this.w = true;
    }

    @Override // defpackage.vtf
    public final long i(int i) {
        return this.t;
    }

    @Override // defpackage.vtf
    public final int j() {
        return this.l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(jsk jskVar, boolean z) {
        if (this.p == Integer.MIN_VALUE) {
            vme.a("position() should be called first");
        }
        List list = this.g;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ksk kskVar = (ksk) list.get(i);
            int i2 = this.q - kskVar.b;
            int i3 = this.r;
            long j = this.t;
            ltf a = this.j.a(i, this.b);
            xod xodVar = null;
            Object[] objArr = 0;
            if (a != null) {
                if (z) {
                    a.r = j;
                } else {
                    long d = wpe.d(!wpe.b(a.r, ltf.s) ? a.r : j, ((wpe) a.q.getValue()).a);
                    int i4 = (int) (j & 4294967295L);
                    if (((i4 <= i2 && ((int) (d & 4294967295L)) <= i2) || (i4 >= i3 && ((int) (d & 4294967295L)) >= i3)) && ((Boolean) a.h.getValue()).booleanValue()) {
                        x97.y(a.a, null, null, new jtf(a, objArr == true ? 1 : 0, 1), 3);
                    }
                    j = d;
                }
                xodVar = a.n;
            }
            long d2 = wpe.d(j, this.h);
            if (!z && a != null) {
                a.m = d2;
            }
            if (xodVar != null) {
                jskVar.getClass();
                jsk.a(jskVar, kskVar);
                kskVar.p0(wpe.d(d2, kskVar.e), 0.0f, xodVar);
            } else {
                jsk.m(jskVar, kskVar, d2);
            }
        }
    }

    public final void l(int i, int i2, int i3, int i4, int i5, int i6) {
        this.p = i4;
        if (this.d == xof.b) {
            i2 = (i3 - i2) - this.c;
        }
        this.t = (i2 << 32) | (i & 4294967295L);
        this.u = i5;
        this.v = i6;
        this.q = -this.e;
        this.r = i4 + this.f;
    }
}

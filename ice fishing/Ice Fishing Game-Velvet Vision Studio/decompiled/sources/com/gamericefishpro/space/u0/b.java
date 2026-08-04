package com.gamericefishpro.space.u0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final com.gamericefishpro.space.t0.r a;
    public a b;
    public boolean c;
    public int f;
    public int g;
    public int l;
    public final com.gamericefishpro.space.h2.r d = new com.gamericefishpro.space.h2.r();
    public boolean e = true;
    public final ArrayList h = new ArrayList();
    public int i = -1;
    public int j = -1;
    public int k = -1;

    public b(com.gamericefishpro.space.t0.r rVar, a aVar) {
        this.a = rVar;
        this.b = aVar;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            this.g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void b() {
        int i = this.g;
        if (i > 0) {
            l0 l0Var = this.b.c;
            l0Var.w0(h0.c);
            l0Var.e[l0Var.f - l0Var.c[l0Var.d - 1].a] = i;
            this.g = 0;
        }
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return;
        }
        a aVar = this.b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        aVar.getClass();
        if (size != 0) {
            l0 l0Var2 = aVar.c;
            l0Var2.w0(k.c);
            com.gamericefishpro.space.i.a.M(l0Var2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void c() {
        int i = this.l;
        if (i > 0) {
            int i2 = this.i;
            if (i2 >= 0) {
                b();
                l0 l0Var = this.b.c;
                l0Var.w0(z.c);
                int i3 = l0Var.f - l0Var.c[l0Var.d - 1].a;
                int[] iArr = l0Var.e;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.i = -1;
            } else {
                int i4 = this.k;
                int i5 = this.j;
                b();
                l0 l0Var2 = this.b.c;
                l0Var2.w0(v.c);
                int i6 = l0Var2.f - l0Var2.c[l0Var2.d - 1].a;
                int[] iArr2 = l0Var2.e;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.j = -1;
                this.k = -1;
            }
            this.l = 0;
        }
    }

    public final void d(boolean z) {
        com.gamericefishpro.space.t0.r rVar = this.a;
        int i = z ? rVar.G.i : rVar.G.g;
        int i2 = i - this.f;
        if (i2 < 0) {
            com.gamericefishpro.space.t0.s.a("Tried to seek backward");
        }
        if (i2 > 0) {
            l0 l0Var = this.b.c;
            l0Var.w0(d.c);
            l0Var.e[l0Var.f - l0Var.c[l0Var.d - 1].a] = i2;
            this.f = i;
        }
    }

    public final void e(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                com.gamericefishpro.space.t0.s.a("Invalid remove index " + i);
            }
            if (this.i == i) {
                this.l += i2;
                return;
            }
            c();
            this.i = i;
            this.l = i2;
        }
    }
}

package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class nfh {
    public final int a;
    public final List b;
    public final long c;
    public final Object d;
    public final gz2 e;
    public final hz2 f;
    public final xof g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final int[] k;
    public int l;
    public int m;

    public nfh(int i, int i2, List list, long j, Object obj, bxj bxjVar, gz2 gz2Var, hz2 hz2Var, xof xofVar, boolean z) {
        this.a = i;
        this.b = list;
        this.c = j;
        this.d = obj;
        this.e = gz2Var;
        this.f = hz2Var;
        this.g = xofVar;
        this.h = z;
        this.i = bxjVar == bxj.a;
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            ksk kskVar = (ksk) list.get(i4);
            i3 = Math.max(i3, !this.i ? kskVar.b : kskVar.a);
        }
        this.j = i3;
        this.k = new int[this.b.size() * 2];
        this.m = Integer.MIN_VALUE;
    }

    public final void a(int i) {
        this.l += i;
        int[] iArr = this.k;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            boolean z = this.i;
            if ((z && i2 % 2 == 1) || (!z && i2 % 2 == 0)) {
                iArr[i2] = iArr[i2] + i;
            }
        }
    }

    public final void b(int i, int i2, int i3) {
        int i4;
        this.l = i;
        boolean z = this.i;
        this.m = z ? i3 : i2;
        List list = this.b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            ksk kskVar = (ksk) list.get(i5);
            int i6 = i5 * 2;
            int[] iArr = this.k;
            if (z) {
                gz2 gz2Var = this.e;
                if (gz2Var == null) {
                    vme.b("null horizontalAlignment");
                    rj7.f();
                    return;
                } else {
                    iArr[i6] = gz2Var.a(kskVar.a, i2, this.g);
                    iArr[i6 + 1] = i;
                    i4 = kskVar.b;
                }
            } else {
                iArr[i6] = i;
                int i7 = i6 + 1;
                hz2 hz2Var = this.f;
                if (hz2Var == null) {
                    vme.b("null verticalAlignment");
                    rj7.f();
                    return;
                } else {
                    iArr[i7] = hz2Var.a(kskVar.b, i3);
                    i4 = kskVar.a;
                }
            }
            i += i4;
        }
    }
}

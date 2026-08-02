package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class bvf implements lfh {
    public final cvf a;
    public final int b;
    public final boolean c;
    public final float d;
    public final lfh e;
    public final float f;
    public final boolean g;
    public final mm6 h;
    public final jx7 i;
    public final long j;
    public final List k;
    public final int l;
    public final int m;
    public final int n;
    public final boolean o;
    public final bxj p;
    public final int q;
    public final int r;

    public bvf(cvf cvfVar, int i, boolean z, float f, lfh lfhVar, float f2, boolean z2, mm6 mm6Var, jx7 jx7Var, long j, List list, int i2, int i3, int i4, boolean z3, bxj bxjVar, int i5, int i6) {
        this.a = cvfVar;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = lfhVar;
        this.f = f2;
        this.g = z2;
        this.h = mm6Var;
        this.i = jx7Var;
        this.j = j;
        this.k = list;
        this.l = i2;
        this.m = i3;
        this.n = i4;
        this.o = z3;
        this.p = bxjVar;
        this.q = i5;
        this.r = i6;
    }

    @Override // defpackage.lfh
    public final int a() {
        return this.e.a();
    }

    @Override // defpackage.lfh
    public final Map b() {
        return this.e.b();
    }

    @Override // defpackage.lfh
    public final int c() {
        return this.e.c();
    }

    @Override // defpackage.lfh
    public final void d() {
        this.e.d();
    }

    @Override // defpackage.lfh
    public final Function1 e() {
        return this.e.e();
    }

    public final bvf f(int i, boolean z) {
        cvf cvfVar;
        int i2;
        int i3;
        int i4;
        if (this.g) {
            return null;
        }
        List list = this.k;
        if (list.isEmpty() || (cvfVar = this.a) == null) {
            return null;
        }
        int i5 = cvfVar.r;
        int i6 = this.b - i;
        if (i6 < 0 || i6 >= i5) {
            return null;
        }
        cvf cvfVar2 = (cvf) CollectionsKt.Q(list);
        cvf cvfVar3 = (cvf) CollectionsKt.Y(list);
        if (cvfVar2.t || cvfVar3.t) {
            return null;
        }
        int i7 = cvfVar2.p;
        int i8 = this.m;
        int i9 = this.l;
        if (i < 0) {
            if (Math.min((i7 + cvfVar2.r) - i9, (cvfVar3.p + cvfVar3.r) - i8) <= (-i)) {
                return null;
            }
        } else if (Math.min(i9 - i7, i8 - cvfVar3.p) <= i) {
            return null;
        }
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            cvf cvfVar4 = (cvf) list.get(i10);
            boolean z2 = cvfVar4.c;
            int[] iArr = cvfVar4.x;
            if (!cvfVar4.t) {
                cvfVar4.p += i;
                int length = iArr.length;
                for (int i11 = 0; i11 < length; i11++) {
                    int i12 = i11 & 1;
                    if ((z2 && i12 != 0) || (!z2 && i12 == 0)) {
                        iArr[i11] = iArr[i11] + i;
                    }
                }
                if (z) {
                    int size2 = cvfVar4.b.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        ltf a = cvfVar4.n.a(i13, cvfVar4.l);
                        if (a != null) {
                            long j = a.l;
                            if (z2) {
                                i2 = i10;
                                i3 = (int) (j >> 32);
                                i4 = ((int) (j & 4294967295L)) + i;
                            } else {
                                i2 = i10;
                                i3 = ((int) (j >> 32)) + i;
                                i4 = (int) (j & 4294967295L);
                            }
                            a.l = (i4 & 4294967295L) | (i3 << 32);
                        } else {
                            i2 = i10;
                        }
                        i13++;
                        i10 = i2;
                    }
                }
            }
            i10++;
        }
        return new bvf(this.a, i6, this.c || i > 0, i, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r);
    }

    public final long g() {
        lfh lfhVar = this.e;
        return (lfhVar.c() << 32) | (lfhVar.a() & 4294967295L);
    }
}

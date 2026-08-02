package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class y2k implements lfh {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final bxj e;
    public final int f;
    public final int g;
    public final int h;
    public final nfh i;
    public final nfh j;
    public final float k;
    public final int l;
    public final boolean m;
    public final z1r n;
    public final lfh o;
    public final boolean p;
    public final List q;
    public final List r;
    public final mm6 s;

    public y2k(List list, int i, int i2, int i3, bxj bxjVar, int i4, int i5, int i6, nfh nfhVar, nfh nfhVar2, float f, int i7, boolean z, z1r z1rVar, lfh lfhVar, boolean z2, List list2, List list3, mm6 mm6Var) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = bxjVar;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = nfhVar;
        this.j = nfhVar2;
        this.k = f;
        this.l = i7;
        this.m = z;
        this.n = z1rVar;
        this.o = lfhVar;
        this.p = z2;
        this.q = list2;
        this.r = list3;
        this.s = mm6Var;
    }

    @Override // defpackage.lfh
    public final int a() {
        return this.o.a();
    }

    @Override // defpackage.lfh
    public final Map b() {
        return this.o.b();
    }

    @Override // defpackage.lfh
    public final int c() {
        return this.o.c();
    }

    @Override // defpackage.lfh
    public final void d() {
        this.o.d();
    }

    @Override // defpackage.lfh
    public final Function1 e() {
        return this.o.e();
    }

    public final y2k f(int i) {
        int i2;
        int i3 = this.b + this.c;
        if (this.p) {
            return null;
        }
        List list = this.a;
        if (list.isEmpty() || this.i == null || (i2 = this.l - i) < 0 || i2 >= i3) {
            return null;
        }
        float f = this.k - (i3 != 0 ? i / i3 : 0.0f);
        if (this.j == null || f >= 0.5f || f <= -0.5f) {
            return null;
        }
        nfh nfhVar = (nfh) CollectionsKt.Q(list);
        nfh nfhVar2 = (nfh) CollectionsKt.Y(list);
        int i4 = this.g;
        int i5 = this.f;
        if (i < 0) {
            if (Math.min((nfhVar.l + i3) - i5, (nfhVar2.l + i3) - i4) <= (-i)) {
                return null;
            }
        } else if (Math.min(i5 - nfhVar.l, i4 - nfhVar2.l) <= i) {
            return null;
        }
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((nfh) list.get(i6)).a(i);
        }
        List list2 = this.q;
        int size2 = list2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            ((nfh) list2.get(i7)).a(i);
        }
        List list3 = this.r;
        int size3 = list3.size();
        for (int i8 = 0; i8 < size3; i8++) {
            ((nfh) list3.get(i8)).a(i);
        }
        return new y2k(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, f, i2, this.m || i > 0, this.n, this.o, this.p, this.q, this.r, this.s);
    }

    public final long g() {
        lfh lfhVar = this.o;
        return (lfhVar.c() << 32) | (lfhVar.a() & 4294967295L);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public y2k(c5b c5bVar, int i, int i2, int i3, bxj bxjVar, int i4, int i5, int i6, z1r z1rVar, lfh lfhVar, mm6 mm6Var) {
        this(c5bVar, i, i2, i3, bxjVar, i4, i5, i6, null, null, 0.0f, 0, false, z1rVar, lfhVar, false, r17, r17, mm6Var);
        c5b c5bVar2 = c5b.a;
    }
}

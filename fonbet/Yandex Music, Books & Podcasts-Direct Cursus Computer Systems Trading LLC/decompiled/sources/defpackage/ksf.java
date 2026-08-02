package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ksf implements lfh {
    public final msf a;
    public final int b;
    public final boolean c;
    public final float d;
    public final lfh e;
    public final float f;
    public final boolean g;
    public final mm6 h;
    public final jx7 i;
    public final int j;
    public final uif k;
    public final List l;
    public final int m;
    public final int n;
    public final int o;
    public final bxj p;
    public final int q;
    public final int r;

    /* JADX WARN: Multi-variable type inference failed */
    public ksf(msf msfVar, int i, boolean z, float f, lfh lfhVar, float f2, boolean z2, mm6 mm6Var, jx7 jx7Var, int i2, Function1 function1, List list, int i3, int i4, int i5, bxj bxjVar, int i6, int i7) {
        this.a = msfVar;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = lfhVar;
        this.f = f2;
        this.g = z2;
        this.h = mm6Var;
        this.i = jx7Var;
        this.j = i2;
        this.k = (uif) function1;
        this.l = list;
        this.m = i3;
        this.n = i4;
        this.o = i5;
        this.p = bxjVar;
        this.q = i6;
        this.r = i7;
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

    /* JADX WARN: Type inference failed for: r1v9, types: [kotlin.jvm.functions.Function1, uif] */
    public final ksf f(int i, boolean z) {
        msf msfVar;
        int i2;
        long j;
        int i3;
        if (this.g) {
            return null;
        }
        List list = this.l;
        if (list.isEmpty() || (msfVar = this.a) == null) {
            return null;
        }
        int i4 = msfVar.g;
        int i5 = this.b - i;
        if (i5 < 0 || i5 >= i4) {
            return null;
        }
        lsf lsfVar = (lsf) CollectionsKt.Q(list);
        lsf lsfVar2 = (lsf) CollectionsKt.Y(list);
        if (lsfVar.w || lsfVar2.w) {
            return null;
        }
        int i6 = this.n;
        int i7 = this.m;
        bxj bxjVar = this.p;
        if (i < 0) {
            if (Math.min((qwp.h0(lsfVar, bxjVar) + lsfVar.o) - i7, (qwp.h0(lsfVar2, bxjVar) + lsfVar2.o) - i6) <= (-i)) {
                return null;
            }
        } else if (Math.min(i7 - qwp.h0(lsfVar, bxjVar), i6 - qwp.h0(lsfVar2, bxjVar)) <= i) {
            return null;
        }
        int size = list.size();
        int i8 = 0;
        while (i8 < size) {
            lsf lsfVar3 = (lsf) list.get(i8);
            lsfVar3.getClass();
            if (lsfVar3.w) {
                i2 = i8;
            } else {
                long j2 = lsfVar3.t;
                long j3 = 4294967295L;
                int i9 = i8;
                char c = ' ';
                lsfVar3.t = (((int) (j2 >> 32)) << 32) | ((((int) (j2 & 4294967295L)) + i) & 4294967295L);
                if (z) {
                    int size2 = lsfVar3.g.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        ltf a = lsfVar3.j.a(i10, lsfVar3.b);
                        if (a != null) {
                            long j4 = a.l;
                            j = j3;
                            i3 = i9;
                            a.l = (((int) (j4 >> r14)) << c) | ((((int) (j4 & j)) + i) & j);
                        } else {
                            j = j3;
                            i3 = i9;
                        }
                        i10++;
                        i9 = i3;
                        j3 = j;
                        c = ' ';
                    }
                }
                i2 = i9;
            }
            i8 = i2 + 1;
        }
        return new ksf(this.a, i5, this.c || i > 0, i, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, bxjVar, this.q, this.r);
    }

    public final long g() {
        lfh lfhVar = this.e;
        return (lfhVar.c() << 32) | (lfhVar.a() & 4294967295L);
    }
}

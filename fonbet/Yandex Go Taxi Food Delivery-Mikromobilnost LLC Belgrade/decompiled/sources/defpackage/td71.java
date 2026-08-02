package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;

/* loaded from: classes7.dex */
public final class td71 {
    public final Object a;
    public final Object b;
    public final dg81[] c;
    public boolean d;
    public boolean e;
    public xj71 f;
    public boolean g;
    public final boolean[] h;
    public final gy61[] i;
    public final kr81 j;
    public final ov81 k;
    public td71 l;
    public wx71 m;
    public lu81 n;
    public long o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [oh71] */
    public td71(gy61[] gy61VarArr, long j, kr81 kr81Var, xi71 xi71Var, ov81 ov81Var, xj71 xj71Var, lu81 lu81Var) {
        this.i = gy61VarArr;
        this.o = j;
        this.j = kr81Var;
        this.k = ov81Var;
        v281 v281Var = xj71Var.a;
        Object obj = v281Var.a;
        this.b = obj;
        this.f = xj71Var;
        this.m = wx71.w;
        this.n = lu81Var;
        this.c = new dg81[gy61VarArr.length];
        this.h = new boolean[gy61VarArr.length];
        long j2 = xj71Var.b;
        long j3 = xj71Var.d;
        ov81Var.getClass();
        int i = ii81.E;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        v281 b = v281Var.b(pair.second);
        vs81 vs81Var = (vs81) ov81Var.d.get(obj2);
        vs81Var.getClass();
        HashSet hashSet = ov81Var.i;
        hashSet.add(vs81Var);
        HashMap hashMap = ov81Var.h;
        qp81 qp81Var = (qp81) hashMap.get(vs81Var);
        if (qp81Var != null) {
            qp81Var.a.b(qp81Var.b);
        }
        vs81Var.c.add(b);
        sp71 a = vs81Var.a.a(b, xi71Var, j2);
        ov81Var.c.put(a, vs81Var);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            vs81 vs81Var2 = (vs81) it.next();
            if (vs81Var2.c.isEmpty()) {
                qp81 qp81Var2 = (qp81) hashMap.get(vs81Var2);
                if (qp81Var2 != null) {
                    qp81Var2.a.a(qp81Var2.b);
                }
                it.remove();
            }
        }
        this.a = j3 != -9223372036854775807L ? new oh71(a, true, 0L, j3) : a;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, ra71] */
    public final long a(lu81 lu81Var, long j, boolean z, boolean[] zArr) {
        gk71[] gk71VarArr;
        gy61[] gy61VarArr;
        dg81[] dg81VarArr;
        lu81 lu81Var2;
        int i = 0;
        while (true) {
            int i2 = lu81Var.a;
            gk71VarArr = lu81Var.c;
            boolean z2 = true;
            if (i >= i2) {
                break;
            }
            if (z || (lu81Var2 = this.n) == null || !rf71.o(lu81Var.b[i], lu81Var2.b[i]) || !rf71.o(gk71VarArr[i], lu81Var2.c[i])) {
                z2 = false;
            }
            this.h[i] = z2;
            i++;
        }
        int i3 = 0;
        while (true) {
            gy61VarArr = this.i;
            int length = gy61VarArr.length;
            dg81VarArr = this.c;
            if (i3 >= length) {
                break;
            }
            if (gy61VarArr[i3].b == -2) {
                dg81VarArr[i3] = null;
            }
            i3++;
        }
        b();
        this.n = lu81Var;
        if (this.l == null) {
            int i4 = 0;
            while (true) {
                lu81 lu81Var3 = this.n;
                if (i4 >= lu81Var3.a) {
                    break;
                }
                boolean a = lu81Var3.a(i4);
                gk71 gk71Var = this.n.c[i4];
                if (a && gk71Var != null) {
                    gk71Var.a();
                }
                i4++;
            }
        }
        long J = this.a.J(lu81Var.c, this.h, this.c, zArr, j);
        for (int i5 = 0; i5 < gy61VarArr.length; i5++) {
            if (gy61VarArr[i5].b == -2 && this.n.a(i5)) {
                dg81VarArr[i5] = new t581();
            }
        }
        this.e = false;
        for (int i6 = 0; i6 < dg81VarArr.length; i6++) {
            if (dg81VarArr[i6] != null) {
                if (!lu81Var.a(i6)) {
                    ny61.k();
                    return 0L;
                }
                if (gy61VarArr[i6].b != -2) {
                    this.e = true;
                }
            } else if (gk71VarArr[i6] != null) {
                ny61.k();
                return 0L;
            }
        }
        return J;
    }

    public final void b() {
        if (this.l != null) {
            return;
        }
        int i = 0;
        while (true) {
            lu81 lu81Var = this.n;
            if (i >= lu81Var.a) {
                return;
            }
            boolean a = lu81Var.a(i);
            gk71 gk71Var = this.n.c[i];
            if (a && gk71Var != null) {
                gk71Var.b();
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ra71] */
    public final void c() {
        b();
        ?? r0 = this.a;
        try {
            boolean z = r0 instanceof oh71;
            ov81 ov81Var = this.k;
            if (!z) {
                IdentityHashMap identityHashMap = ov81Var.c;
                HashMap hashMap = ov81Var.h;
                HashSet hashSet = ov81Var.i;
                vs81 vs81Var = (vs81) identityHashMap.remove(r0);
                vs81Var.getClass();
                ArrayList arrayList = vs81Var.c;
                vs81Var.a.a((ra71) r0);
                arrayList.remove(((sp71) r0).a);
                if (!ov81Var.c.isEmpty()) {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        vs81 vs81Var2 = (vs81) it.next();
                        if (vs81Var2.c.isEmpty()) {
                            qp81 qp81Var = (qp81) hashMap.get(vs81Var2);
                            if (qp81Var != null) {
                                qp81Var.a.a(qp81Var.b);
                            }
                            it.remove();
                        }
                    }
                }
                if (vs81Var.e && arrayList.isEmpty()) {
                    qp81 qp81Var2 = (qp81) hashMap.remove(vs81Var);
                    qp81Var2.getClass();
                    cr71 cr71Var = qp81Var2.c;
                    qv81 qv81Var = qp81Var2.a;
                    qv81Var.c(qp81Var2.b);
                    qv81Var.a((sf81) cr71Var);
                    qv81Var.a((cz71) cr71Var);
                    hashSet.remove(vs81Var);
                    return;
                }
                return;
            }
            ra71 ra71Var = ((oh71) r0).a;
            IdentityHashMap identityHashMap2 = ov81Var.c;
            HashMap hashMap2 = ov81Var.h;
            HashSet hashSet2 = ov81Var.i;
            vs81 vs81Var3 = (vs81) identityHashMap2.remove(ra71Var);
            vs81Var3.getClass();
            ArrayList arrayList2 = vs81Var3.c;
            vs81Var3.a.a(ra71Var);
            arrayList2.remove(((sp71) ra71Var).a);
            if (!ov81Var.c.isEmpty()) {
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    vs81 vs81Var4 = (vs81) it2.next();
                    if (vs81Var4.c.isEmpty()) {
                        qp81 qp81Var3 = (qp81) hashMap2.get(vs81Var4);
                        if (qp81Var3 != null) {
                            qp81Var3.a.a(qp81Var3.b);
                        }
                        it2.remove();
                    }
                }
            }
            if (vs81Var3.e && arrayList2.isEmpty()) {
                qp81 qp81Var4 = (qp81) hashMap2.remove(vs81Var3);
                qp81Var4.getClass();
                cr71 cr71Var2 = qp81Var4.c;
                qv81 qv81Var2 = qp81Var4.a;
                qv81Var2.c(qp81Var4.b);
                qv81Var2.a((sf81) cr71Var2);
                qv81Var2.a((cz71) cr71Var2);
                hashSet2.remove(vs81Var3);
            }
        } catch (RuntimeException e) {
            nba1.c("MediaPeriodHolder", nba1.b("Period release failed.", e));
        }
    }
}

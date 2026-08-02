package defpackage;

import android.util.Pair;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;

/* loaded from: classes.dex */
public final class xoh {
    public final Object a;
    public final Object b;
    public final aoo[] c;
    public boolean d;
    public boolean e;
    public boolean f;
    public yoh g;
    public boolean h;
    public final boolean[] i;
    public final at2[] j;
    public final ct7 k;
    public final nwh l;
    public xoh m;
    public yvs n;
    public c1t o;
    public long p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [np4] */
    public xoh(at2[] at2VarArr, long j, ct7 ct7Var, zi7 zi7Var, nwh nwhVar, yoh yohVar, c1t c1tVar) {
        this.j = at2VarArr;
        this.p = j;
        this.k = ct7Var;
        this.l = nwhVar;
        uvh uvhVar = yohVar.a;
        this.b = uvhVar.a;
        this.g = yohVar;
        this.n = yvs.d;
        this.o = c1tVar;
        this.c = new aoo[at2VarArr.length];
        this.i = new boolean[at2VarArr.length];
        long j2 = yohVar.b;
        long j3 = yohVar.d;
        boolean z = yohVar.f;
        nwhVar.getClass();
        Object obj = uvhVar.a;
        int i = h1m.n;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        uvh a = uvhVar.a(pair.second);
        mwh mwhVar = (mwh) ((HashMap) nwhVar.e).get(obj2);
        mwhVar.getClass();
        ((HashSet) nwhVar.h).add(mwhVar);
        lwh lwhVar = (lwh) ((HashMap) nwhVar.f).get(mwhVar);
        if (lwhVar != null) {
            lwhVar.a.j(lwhVar.b);
        }
        mwhVar.c.add(a);
        ech n = mwhVar.a.n(a, zi7Var, j2);
        ((IdentityHashMap) nwhVar.d).put(n, mwhVar);
        nwhVar.h();
        this.a = j3 != -9223372036854775807L ? new np4(n, !z, 0L, j3) : n;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, woh] */
    public final long a(c1t c1tVar, long j, boolean z, boolean[] zArr) {
        at2[] at2VarArr;
        aoo[] aooVarArr;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= c1tVar.b) {
                break;
            }
            if (z || !c1tVar.q(this.o, i)) {
                z2 = false;
            }
            this.i[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            at2VarArr = this.j;
            int length = at2VarArr.length;
            aooVarArr = this.c;
            if (i2 >= length) {
                break;
            }
            if (at2VarArr[i2].b == -2) {
                aooVarArr[i2] = null;
            }
            i2++;
        }
        b();
        this.o = c1tVar;
        c();
        long a = this.a.a((zsb[]) c1tVar.d, this.i, this.c, zArr, j);
        for (int i3 = 0; i3 < at2VarArr.length; i3++) {
            if (at2VarArr[i3].b == -2 && this.o.r(i3)) {
                aooVarArr[i3] = new i5b();
            }
        }
        this.f = false;
        for (int i4 = 0; i4 < aooVarArr.length; i4++) {
            if (aooVarArr[i4] != null) {
                vq1.A(c1tVar.r(i4));
                if (at2VarArr[i4].b != -2) {
                    this.f = true;
                }
            } else {
                vq1.A(((zsb[]) c1tVar.d)[i4] == null);
            }
        }
        return a;
    }

    public final void b() {
        if (this.m != null) {
            return;
        }
        int i = 0;
        while (true) {
            c1t c1tVar = this.o;
            if (i >= c1tVar.b) {
                return;
            }
            boolean r = c1tVar.r(i);
            zsb zsbVar = ((zsb[]) this.o.d)[i];
            if (r && zsbVar != null) {
                zsbVar.g();
            }
            i++;
        }
    }

    public final void c() {
        if (this.m != null) {
            return;
        }
        int i = 0;
        while (true) {
            c1t c1tVar = this.o;
            if (i >= c1tVar.b) {
                return;
            }
            boolean r = c1tVar.r(i);
            zsb zsbVar = ((zsb[]) this.o.d)[i];
            if (r && zsbVar != null) {
                zsbVar.q();
            }
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [ahp, java.lang.Object] */
    public final long d() {
        if (!this.e) {
            return this.g.b;
        }
        long r = this.f ? this.a.r() : Long.MIN_VALUE;
        return r == Long.MIN_VALUE ? this.g.e : r;
    }

    public final long e() {
        return this.g.b + this.p;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, woh] */
    public final void f(float f, sis sisVar, boolean z) {
        this.e = true;
        this.n = this.a.m();
        c1t j = j(f, sisVar, z);
        yoh yohVar = this.g;
        long j2 = yohVar.b;
        long j3 = yohVar.e;
        if (j3 != -9223372036854775807L && j2 >= j3) {
            j2 = Math.max(0L, j3 - 1);
        }
        long a = a(j, j2, false, new boolean[this.j.length]);
        long j4 = this.p;
        yoh yohVar2 = this.g;
        this.p = (yohVar2.b - a) + j4;
        this.g = yohVar2.b(a);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [ahp, java.lang.Object] */
    public final boolean g() {
        if (this.e) {
            return !this.f || this.a.r() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean h() {
        if (this.e) {
            return g() || d() - this.g.b >= -9223372036854775807L;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, woh] */
    public final void i() {
        b();
        ?? r0 = this.a;
        try {
            boolean z = r0 instanceof np4;
            nwh nwhVar = this.l;
            if (z) {
                nwhVar.u(((np4) r0).a);
            } else {
                nwhVar.u(r0);
            }
        } catch (RuntimeException e) {
            vq1.L("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final c1t j(float f, sis sisVar, boolean z) {
        yvs yvsVar = this.n;
        uvh uvhVar = this.g.a;
        ct7 ct7Var = this.k;
        at2[] at2VarArr = this.j;
        c1t i = ct7Var.i(at2VarArr, yvsVar, uvhVar, sisVar);
        zsb[] zsbVarArr = (zsb[]) i.d;
        for (int i2 = 0; i2 < i.b; i2++) {
            if (i.r(i2)) {
                if (zsbVarArr[i2] == null && at2VarArr[i2].b != -2) {
                    r5 = false;
                }
                vq1.A(r5);
            } else {
                vq1.A(zsbVarArr[i2] == null);
            }
        }
        for (zsb zsbVar : zsbVarArr) {
            if (zsbVar != null) {
                zsbVar.i(f);
                zsbVar.p(z);
            }
        }
        return i;
    }

    public final void k() {
        Object obj = this.a;
        if (obj instanceof np4) {
            long j = this.g.d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            np4 np4Var = (np4) obj;
            np4Var.e = 0L;
            np4Var.f = j;
        }
    }
}

package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.v;

/* loaded from: classes10.dex */
public class r001 {
    public static final r001 v = new r001(new q001());
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final ImmutableList i;
    public final ImmutableList j;
    public final ImmutableList k;
    public final int l;
    public final int m;
    public final ImmutableList n;
    public final p001 o;
    public final ImmutableList p;
    public final boolean q;
    public final int r;
    public final boolean s;
    public final ImmutableMap t;
    public final ImmutableSet u;

    static {
        x4e.x(1, 2, 3, 4, 5);
        x4e.x(6, 7, 8, 9, 10);
        x4e.x(11, 12, 13, 14, 15);
        x4e.x(16, 17, 18, 19, 20);
        x4e.x(21, 22, 23, 24, 25);
        x4e.x(26, 27, 28, 29, 30);
        tw21.Q(31);
        tw21.Q(32);
        tw21.Q(33);
        tw21.Q(34);
    }

    public r001(q001 q001Var) {
        this.a = q001Var.a;
        this.b = q001Var.b;
        this.c = q001Var.c;
        this.d = q001Var.d;
        this.e = q001Var.e;
        this.f = q001Var.f;
        this.g = q001Var.g;
        this.h = q001Var.h;
        this.i = q001Var.i;
        this.j = q001Var.j;
        this.k = q001Var.k;
        this.l = q001Var.l;
        this.m = q001Var.m;
        this.n = q001Var.n;
        this.o = q001Var.o;
        this.p = q001Var.p;
        this.q = q001Var.q;
        this.r = q001Var.r;
        this.s = q001Var.s;
        this.t = ImmutableMap.a(q001Var.t);
        this.u = ImmutableSet.m(q001Var.u);
    }

    public q001 a() {
        q001 q001Var = new q001();
        q001Var.c(this);
        return q001Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        r001 r001Var = (r001) obj;
        if (this.a != r001Var.a || this.b != r001Var.b || this.c != r001Var.c || this.d != r001Var.d || this.h != r001Var.h || this.e != r001Var.e || this.f != r001Var.f || this.g != r001Var.g || !this.i.equals(r001Var.i) || !this.j.equals(r001Var.j) || !this.k.equals(r001Var.k) || this.l != r001Var.l || this.m != r001Var.m || !this.n.equals(r001Var.n) || !this.o.equals(r001Var.o) || !this.p.equals(r001Var.p) || this.q != r001Var.q || this.r != r001Var.r || this.s != r001Var.s) {
            return false;
        }
        ImmutableMap immutableMap = r001Var.t;
        ImmutableMap immutableMap2 = this.t;
        immutableMap2.getClass();
        return v.b(immutableMap, immutableMap2) && this.u.equals(r001Var.u);
    }

    public int hashCode() {
        int hashCode = (this.n.hashCode() + ((((((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((((((((((((((((this.a + 31) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 28629151) + (this.h ? 1 : 0)) * 31) + this.e) * 31) + this.f) * 31) + (this.g ? 1 : 0)) * 31)) * 31)) * 961)) * 961) + this.l) * 31) + this.m) * 31)) * 31;
        this.o.getClass();
        return this.u.hashCode() + ((this.t.hashCode() + ((((((((this.p.hashCode() + ((hashCode + 29791) * 31)) * 961) + (this.q ? 1 : 0)) * 31) + this.r) * 923521) + (this.s ? 1 : 0)) * 31)) * 31);
    }
}

package defpackage;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s4w {
    public final String a;
    public final c4w b;
    public final q97 c;
    public final long d;
    public final long e;
    public final long f;
    public final fa6 g;
    public final int h;
    public final bk2 i;
    public final long j;
    public final long k;
    public final int l;
    public final int m;
    public final long n;
    public final int o;
    public final List p;
    public final List q;

    public s4w(String str, c4w c4wVar, q97 q97Var, long j, long j2, long j3, fa6 fa6Var, int i, bk2 bk2Var, long j4, long j5, int i2, int i3, long j6, int i4, List list, List list2) {
        str.getClass();
        q97Var.getClass();
        list.getClass();
        list2.getClass();
        this.a = str;
        this.b = c4wVar;
        this.c = q97Var;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = fa6Var;
        this.h = i;
        this.i = bk2Var;
        this.j = j4;
        this.k = j5;
        this.l = i2;
        this.m = i3;
        this.n = j6;
        this.o = i4;
        this.p = list;
        this.q = list2;
    }

    public final d4w a() {
        int i;
        long j;
        long j2;
        List list = this.q;
        q97 q97Var = !list.isEmpty() ? (q97) list.get(0) : q97.b;
        UUID fromString = UUID.fromString(this.a);
        fromString.getClass();
        HashSet hashSet = new HashSet(this.p);
        long j3 = this.e;
        b4w b4wVar = j3 != 0 ? new b4w(j3, this.f) : null;
        c4w c4wVar = c4w.a;
        c4w c4wVar2 = this.b;
        int i2 = this.h;
        long j4 = this.d;
        if (c4wVar2 == c4wVar) {
            String str = t4w.z;
            j = j4;
            j2 = wyf.v(c4wVar2 == c4wVar && i2 > 0, i2, this.i, this.j, this.k, this.l, j3 != 0, j, this.f, j3, this.n);
            i = i2;
        } else {
            i = i2;
            j = j4;
            j2 = Long.MAX_VALUE;
        }
        return new d4w(fromString, c4wVar2, hashSet, this.c, q97Var, i, this.m, this.g, j, b4wVar, j2, this.o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4w)) {
            return false;
        }
        s4w s4wVar = (s4w) obj;
        return Intrinsics.d(this.a, s4wVar.a) && this.b == s4wVar.b && Intrinsics.d(this.c, s4wVar.c) && this.d == s4wVar.d && this.e == s4wVar.e && this.f == s4wVar.f && this.g.equals(s4wVar.g) && this.h == s4wVar.h && this.i == s4wVar.i && this.j == s4wVar.j && this.k == s4wVar.k && this.l == s4wVar.l && this.m == s4wVar.m && this.n == s4wVar.n && this.o == s4wVar.o && Intrinsics.d(this.p, s4wVar.p) && Intrinsics.d(this.q, s4wVar.q);
    }

    public final int hashCode() {
        return this.q.hashCode() + k5r.d(f1d.a(this.o, tlm.c(this.n, f1d.a(this.m, f1d.a(this.l, tlm.c(this.k, tlm.c(this.j, (this.i.hashCode() + f1d.a(this.h, (this.g.hashCode() + tlm.c(this.f, tlm.c(this.e, tlm.c(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31), 31), 31)) * 31, 31)) * 31, 31), 31), 31), 31), 31), 31), 31, this.p);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkInfoPojo(id=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", output=");
        sb.append(this.c);
        sb.append(", initialDelay=");
        sb.append(this.d);
        sb.append(", intervalDuration=");
        sb.append(this.e);
        sb.append(", flexDuration=");
        sb.append(this.f);
        sb.append(", constraints=");
        sb.append(this.g);
        sb.append(", runAttemptCount=");
        sb.append(this.h);
        sb.append(", backoffPolicy=");
        sb.append(this.i);
        sb.append(", backoffDelayDuration=");
        sb.append(this.j);
        sb.append(", lastEnqueueTime=");
        sb.append(this.k);
        sb.append(", periodCount=");
        sb.append(this.l);
        sb.append(", generation=");
        sb.append(this.m);
        sb.append(", nextScheduleTimeOverride=");
        sb.append(this.n);
        sb.append(", stopReason=");
        sb.append(this.o);
        sb.append(", tags=");
        sb.append(this.p);
        sb.append(", progress=");
        return eta.h(sb, this.q, ')');
    }
}

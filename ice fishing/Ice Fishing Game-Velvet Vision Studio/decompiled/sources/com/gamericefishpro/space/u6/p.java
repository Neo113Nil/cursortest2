package com.gamericefishpro.space.u6;

import com.gamericefishpro.space.l6.x;
import com.gamericefishpro.space.l6.y;
import com.gamericefishpro.space.t0.y0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class p {
    public final String a;
    public y b;
    public final String c;
    public String d;
    public com.gamericefishpro.space.l6.g e;
    public final com.gamericefishpro.space.l6.g f;
    public long g;
    public final long h;
    public final long i;
    public com.gamericefishpro.space.l6.e j;
    public final int k;
    public final com.gamericefishpro.space.l6.a l;
    public final long m;
    public long n;
    public final long o;
    public final long p;
    public boolean q;
    public final x r;
    public final int s;
    public final int t;

    static {
        Intrinsics.checkNotNullExpressionValue(com.gamericefishpro.space.l6.q.d("WorkSpec"), "tagWithPrefix(\"WorkSpec\")");
    }

    public p(String id, y state, String workerClassName, String str, com.gamericefishpro.space.l6.g input, com.gamericefishpro.space.l6.g output, long j, long j2, long j3, com.gamericefishpro.space.l6.e constraints, int i, com.gamericefishpro.space.l6.a backoffPolicy, long j4, long j5, long j6, long j7, boolean z, x outOfQuotaPolicy, int i2, int i3) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        Intrinsics.checkNotNullParameter(outOfQuotaPolicy, "outOfQuotaPolicy");
        this.a = id;
        this.b = state;
        this.c = workerClassName;
        this.d = str;
        this.e = input;
        this.f = output;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = constraints;
        this.k = i;
        this.l = backoffPolicy;
        this.m = j4;
        this.n = j5;
        this.o = j6;
        this.p = j7;
        this.q = z;
        this.r = outOfQuotaPolicy;
        this.s = i2;
        this.t = i3;
    }

    public final long a() {
        int i;
        if (this.b == y.d && (i = this.k) > 0) {
            com.gamericefishpro.space.l6.a aVar = this.l;
            com.gamericefishpro.space.l6.a aVar2 = com.gamericefishpro.space.l6.a.e;
            long j = this.m;
            long jScalb = aVar == aVar2 ? j * ((long) i) : (long) Math.scalb(j, i - 1);
            long j2 = this.n;
            if (jScalb > 18000000) {
                jScalb = 18000000;
            }
            return j2 + jScalb;
        }
        if (!c()) {
            long jCurrentTimeMillis = this.n;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + this.g;
        }
        int i2 = this.s;
        long j3 = this.n;
        if (i2 == 0) {
            j3 += this.g;
        }
        long j4 = this.i;
        long j5 = this.h;
        if (j4 != j5) {
            return j3 + j5 + (i2 == 0 ? ((long) (-1)) * j4 : 0L);
        }
        return j3 + (i2 != 0 ? j5 : 0L);
    }

    public final boolean b() {
        return !Intrinsics.a(com.gamericefishpro.space.l6.e.i, this.j);
    }

    public final boolean c() {
        return this.h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.a(this.a, pVar.a) && this.b == pVar.b && Intrinsics.a(this.c, pVar.c) && Intrinsics.a(this.d, pVar.d) && Intrinsics.a(this.e, pVar.e) && Intrinsics.a(this.f, pVar.f) && this.g == pVar.g && this.h == pVar.h && this.i == pVar.i && Intrinsics.a(this.j, pVar.j) && this.k == pVar.k && this.l == pVar.l && this.m == pVar.m && this.n == pVar.n && this.o == pVar.o && this.p == pVar.p && this.q == pVar.q && this.r == pVar.r && this.s == pVar.s && this.t == pVar.t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [int] */
    /* JADX WARN: Type inference failed for: r2v26, types: [int] */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v33 */
    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        int iB = y0.b(y0.b(y0.b(y0.b((this.l.hashCode() + com.gamericefishpro.space.m5.a.t(this.k, (this.j.hashCode() + y0.b(y0.b(y0.b((this.f.hashCode() + ((this.e.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31, this.g), 31, this.h), 31, this.i)) * 31, 31)) * 31, 31, this.m), 31, this.n), 31, this.o), 31, this.p);
        boolean z = this.q;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return Integer.hashCode(this.t) + com.gamericefishpro.space.m5.a.t(this.s, (this.r.hashCode() + ((iB + r2) * 31)) * 31, 31);
    }

    public final String toString() {
        return y0.i(new StringBuilder("{WorkSpec: "), this.a, '}');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ p(String str, y yVar, String str2, String str3, com.gamericefishpro.space.l6.g gVar, com.gamericefishpro.space.l6.g gVar2, long j, long j2, long j3, com.gamericefishpro.space.l6.e eVar, int i, com.gamericefishpro.space.l6.a aVar, long j4, long j5, long j6, long j7, boolean z, x xVar, int i2, int i3, int i4) {
        com.gamericefishpro.space.l6.g gVar3;
        com.gamericefishpro.space.l6.g gVar4;
        y yVar2 = (i3 & 2) != 0 ? y.d : yVar;
        String str4 = (i3 & 8) != 0 ? null : str3;
        if ((i3 & 16) != 0) {
            com.gamericefishpro.space.l6.g EMPTY = com.gamericefishpro.space.l6.g.c;
            Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
            gVar3 = EMPTY;
        } else {
            gVar3 = gVar;
        }
        if ((i3 & 32) != 0) {
            com.gamericefishpro.space.l6.g EMPTY2 = com.gamericefishpro.space.l6.g.c;
            Intrinsics.checkNotNullExpressionValue(EMPTY2, "EMPTY");
            gVar4 = EMPTY2;
        } else {
            gVar4 = gVar2;
        }
        this(str, yVar2, str2, str4, gVar3, gVar4, (i3 & 64) != 0 ? 0L : j, (i3 & 128) != 0 ? 0L : j2, (i3 & 256) != 0 ? 0L : j3, (i3 & 512) != 0 ? com.gamericefishpro.space.l6.e.i : eVar, (i3 & 1024) != 0 ? 0 : i, (i3 & 2048) != 0 ? com.gamericefishpro.space.l6.a.d : aVar, (i3 & 4096) != 0 ? 30000L : j4, (i3 & 8192) != 0 ? 0L : j5, (i3 & 16384) != 0 ? 0L : j6, (32768 & i3) != 0 ? -1L : j7, (65536 & i3) != 0 ? false : z, (131072 & i3) != 0 ? x.d : xVar, (i3 & 262144) != 0 ? 0 : i2, 0);
    }
}

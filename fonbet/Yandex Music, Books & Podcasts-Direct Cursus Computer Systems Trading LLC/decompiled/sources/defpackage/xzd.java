package defpackage;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class xzd extends i0e {
    public final int d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public final int j;
    public final long k;
    public final int l;
    public final long m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final pqa q;
    public final yde r;
    public final yde s;
    public final cee t;
    public final long u;
    public final wzd v;
    public final yde w;

    public xzd(int i, String str, List list, long j, boolean z, long j2, boolean z2, int i2, long j3, int i3, long j4, long j5, boolean z3, boolean z4, boolean z5, pqa pqaVar, List list2, List list3, wzd wzdVar, Map map, List list4) {
        super(str, list, z3);
        this.d = i;
        this.h = j2;
        this.g = z;
        this.i = z2;
        this.j = i2;
        this.k = j3;
        this.l = i3;
        this.m = j4;
        this.n = j5;
        this.o = z4;
        this.p = z5;
        this.q = pqaVar;
        this.r = yde.v(list2);
        this.s = yde.v(list3);
        this.t = cee.a(map);
        this.w = yde.v(list4);
        if (!list3.isEmpty()) {
            szd szdVar = (szd) ild.x(list3);
            this.u = szdVar.e + szdVar.c;
        } else if (list2.isEmpty()) {
            this.u = 0L;
        } else {
            uzd uzdVar = (uzd) ild.x(list2);
            this.u = uzdVar.e + uzdVar.c;
        }
        long j6 = -9223372036854775807L;
        if (j != -9223372036854775807L) {
            long j7 = this.u;
            j6 = j >= 0 ? Math.min(j7, j) : Math.max(0L, j7 + j);
        }
        this.e = j6;
        this.f = j >= 0;
        this.v = wzdVar;
    }

    @Override // defpackage.icc
    public final Object a(List list) {
        return this;
    }
}

package defpackage;

import androidx.media3.common.DrmInitData;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class unu extends znu {
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
    public final DrmInitData q;
    public final ImmutableList r;
    public final ImmutableList s;
    public final ImmutableMap t;
    public final long u;
    public final tnu v;
    public final ImmutableList w;

    public unu(int i, String str, List list, long j, boolean z, long j2, boolean z2, int i2, long j3, int i3, long j4, long j5, boolean z3, boolean z4, boolean z5, DrmInitData drmInitData, List list2, List list3, tnu tnuVar, Map map, List list4) {
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
        this.q = drmInitData;
        this.r = ImmutableList.l(list2);
        this.s = ImmutableList.l(list3);
        this.t = ImmutableMap.a(map);
        this.w = ImmutableList.l(list4);
        if (!list3.isEmpty()) {
            pnu pnuVar = (pnu) eab1.c(list3);
            this.u = pnuVar.x + pnuVar.c;
        } else if (list2.isEmpty()) {
            this.u = 0L;
        } else {
            rnu rnuVar = (rnu) eab1.c(list2);
            this.u = rnuVar.x + rnuVar.c;
        }
        long j6 = -9223372036854775807L;
        if (j != -9223372036854775807L) {
            long j7 = this.u;
            j6 = j >= 0 ? Math.min(j7, j) : Math.max(0L, j7 + j);
        }
        this.e = j6;
        this.f = j >= 0;
        this.v = tnuVar;
    }

    @Override // defpackage.o5r
    public final Object copy(List list) {
        return this;
    }
}

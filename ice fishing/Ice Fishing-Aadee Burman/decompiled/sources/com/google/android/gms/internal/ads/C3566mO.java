package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.mO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3566mO {

    /* renamed from: t, reason: collision with root package name */
    public static final C3676oQ f31947t = new C3676oQ(-1, new Object());

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC3604n8 f31948a;

    /* renamed from: b, reason: collision with root package name */
    public final C3676oQ f31949b;

    /* renamed from: c, reason: collision with root package name */
    public final long f31950c;

    /* renamed from: d, reason: collision with root package name */
    public final long f31951d;

    /* renamed from: e, reason: collision with root package name */
    public final int f31952e;

    /* renamed from: f, reason: collision with root package name */
    public final DN f31953f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f31954g;

    /* renamed from: h, reason: collision with root package name */
    public final PQ f31955h;
    public final C3918t i;

    /* renamed from: j, reason: collision with root package name */
    public final List f31956j;

    /* renamed from: k, reason: collision with root package name */
    public final C3676oQ f31957k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f31958l;

    /* renamed from: m, reason: collision with root package name */
    public final int f31959m;

    /* renamed from: n, reason: collision with root package name */
    public final int f31960n;

    /* renamed from: o, reason: collision with root package name */
    public final C3924t5 f31961o;

    /* renamed from: p, reason: collision with root package name */
    public volatile long f31962p;

    /* renamed from: q, reason: collision with root package name */
    public volatile long f31963q;

    /* renamed from: r, reason: collision with root package name */
    public volatile long f31964r;

    /* renamed from: s, reason: collision with root package name */
    public volatile long f31965s;

    public C3566mO(AbstractC3604n8 abstractC3604n8, C3676oQ c3676oQ, long j6, long j9, int i, DN dn, boolean z3, PQ pq, C3918t c3918t, List list, C3676oQ c3676oQ2, boolean z6, int i6, int i9, C3924t5 c3924t5, long j10, long j11, long j12, long j13) {
        this.f31948a = abstractC3604n8;
        this.f31949b = c3676oQ;
        this.f31950c = j6;
        this.f31951d = j9;
        this.f31952e = i;
        this.f31953f = dn;
        this.f31954g = z3;
        this.f31955h = pq;
        this.i = c3918t;
        this.f31956j = list;
        this.f31957k = c3676oQ2;
        this.f31958l = z6;
        this.f31959m = i6;
        this.f31960n = i9;
        this.f31961o = c3924t5;
        this.f31962p = j10;
        this.f31963q = j11;
        this.f31964r = j12;
        this.f31965s = j13;
    }

    public static C3566mO a(C3918t c3918t) {
        C3980u7 c3980u7 = AbstractC3604n8.f32690a;
        C3676oQ c3676oQ = f31947t;
        return new C3566mO(c3980u7, c3676oQ, com.anythink.basead.exoplayer.b.f6382b, 0L, 1, null, false, PQ.f26818d, c3918t, C3500lC.f31745x, c3676oQ, false, 1, 0, C3924t5.f34215d, 0L, 0L, 0L, 0L);
    }

    public final C3566mO b(C3676oQ c3676oQ, long j6, long j9, long j10, long j11, PQ pq, C3918t c3918t, List list) {
        C3676oQ c3676oQ2 = this.f31957k;
        boolean z3 = this.f31958l;
        int i = this.f31959m;
        int i6 = this.f31960n;
        C3924t5 c3924t5 = this.f31961o;
        long j12 = this.f31962p;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        return new C3566mO(this.f31948a, c3676oQ, j9, j10, this.f31952e, this.f31953f, this.f31954g, pq, c3918t, list, c3676oQ2, z3, i, i6, c3924t5, j12, j11, j6, elapsedRealtime);
    }

    public final C3566mO c(AbstractC3604n8 abstractC3604n8) {
        return new C3566mO(abstractC3604n8, this.f31949b, this.f31950c, this.f31951d, this.f31952e, this.f31953f, this.f31954g, this.f31955h, this.i, this.f31956j, this.f31957k, this.f31958l, this.f31959m, this.f31960n, this.f31961o, this.f31962p, this.f31963q, this.f31964r, this.f31965s);
    }

    public final C3566mO d(int i) {
        return new C3566mO(this.f31948a, this.f31949b, this.f31950c, this.f31951d, i, this.f31953f, this.f31954g, this.f31955h, this.i, this.f31956j, this.f31957k, this.f31958l, this.f31959m, this.f31960n, this.f31961o, this.f31962p, this.f31963q, this.f31964r, this.f31965s);
    }

    public final C3566mO e(DN dn) {
        return new C3566mO(this.f31948a, this.f31949b, this.f31950c, this.f31951d, this.f31952e, dn, this.f31954g, this.f31955h, this.i, this.f31956j, this.f31957k, this.f31958l, this.f31959m, this.f31960n, this.f31961o, this.f31962p, this.f31963q, this.f31964r, this.f31965s);
    }

    public final C3566mO f(boolean z3) {
        return new C3566mO(this.f31948a, this.f31949b, this.f31950c, this.f31951d, this.f31952e, this.f31953f, z3, this.f31955h, this.i, this.f31956j, this.f31957k, this.f31958l, this.f31959m, this.f31960n, this.f31961o, this.f31962p, this.f31963q, this.f31964r, this.f31965s);
    }

    public final C3566mO g(C3676oQ c3676oQ) {
        return new C3566mO(this.f31948a, this.f31949b, this.f31950c, this.f31951d, this.f31952e, this.f31953f, this.f31954g, this.f31955h, this.i, this.f31956j, c3676oQ, this.f31958l, this.f31959m, this.f31960n, this.f31961o, this.f31962p, this.f31963q, this.f31964r, this.f31965s);
    }

    public final C3566mO h(int i, int i6, boolean z3) {
        return new C3566mO(this.f31948a, this.f31949b, this.f31950c, this.f31951d, this.f31952e, this.f31953f, this.f31954g, this.f31955h, this.i, this.f31956j, this.f31957k, z3, i, i6, this.f31961o, this.f31962p, this.f31963q, this.f31964r, this.f31965s);
    }

    public final boolean i() {
        return this.f31952e == 3 && this.f31958l && this.f31960n == 0;
    }
}

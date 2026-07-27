package com.anythink.basead.exoplayer.h;

import com.anythink.basead.exoplayer.ae;
import com.anythink.basead.exoplayer.h.s;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e extends f<Void> {

    /* renamed from: a, reason: collision with root package name */
    private final s f7602a;

    /* renamed from: b, reason: collision with root package name */
    private final long f7603b;

    /* renamed from: c, reason: collision with root package name */
    private final long f7604c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f7605d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f7606e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f7607f;

    /* renamed from: g, reason: collision with root package name */
    private final ArrayList<d> f7608g;

    /* renamed from: h, reason: collision with root package name */
    private final ae.b f7609h;
    private Object i;

    /* renamed from: j, reason: collision with root package name */
    private a f7610j;

    /* renamed from: k, reason: collision with root package name */
    private b f7611k;

    /* renamed from: l, reason: collision with root package name */
    private long f7612l;

    /* renamed from: m, reason: collision with root package name */
    private long f7613m;

    public static final class b extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public static final int f7618a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f7619b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f7620c = 2;

        /* renamed from: d, reason: collision with root package name */
        public final int f7621d;

        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public b(int i) {
            super("Illegal clipping: ".concat(i != 0 ? i != 1 ? i != 2 ? com.anythink.core.common.v.m.f16809e : "start exceeds end" : "not seekable to start" : "invalid period count"));
            this.f7621d = i;
        }

        private static String a(int i) {
            return i != 0 ? i != 1 ? i != 2 ? com.anythink.core.common.v.m.f16809e : "start exceeds end" : "not seekable to start" : "invalid period count";
        }
    }

    private e(s sVar, long j6, long j9) {
        this(sVar, j6, j9, true, false);
    }

    @Override // com.anythink.basead.exoplayer.h.f, com.anythink.basead.exoplayer.h.c
    public final void a(com.anythink.basead.exoplayer.h hVar, boolean z3) {
        super.a(hVar, z3);
        a((e) null, this.f7602a);
    }

    @Override // com.anythink.basead.exoplayer.h.f, com.anythink.basead.exoplayer.h.s
    public final void b() {
        b bVar = this.f7611k;
        if (bVar != null) {
            throw bVar;
        }
        super.b();
    }

    @Deprecated
    private e(s sVar, long j6, long j9, boolean z3) {
        this(sVar, j6, j9, z3, false);
    }

    private e(s sVar, long j6) {
        this(sVar, 0L, j6, true, true);
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final r a(s.a aVar, com.anythink.basead.exoplayer.j.b bVar) {
        d dVar = new d(this.f7602a.a(aVar, bVar), this.f7605d, this.f7612l, this.f7613m);
        this.f7608g.add(dVar);
        return dVar;
    }

    private e(s sVar, long j6, long j9, boolean z3, boolean z6) {
        com.anythink.basead.exoplayer.k.a.a(j6 >= 0);
        this.f7602a = (s) com.anythink.basead.exoplayer.k.a.a(sVar);
        this.f7603b = j6;
        this.f7604c = j9;
        this.f7605d = z3;
        this.f7606e = false;
        this.f7607f = z6;
        this.f7608g = new ArrayList<>();
        this.f7609h = new ae.b();
    }

    private void b(com.anythink.basead.exoplayer.ae aeVar, Object obj) {
        if (this.f7611k != null) {
            return;
        }
        this.i = obj;
        a(aeVar);
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final void a(r rVar) {
        com.anythink.basead.exoplayer.k.a.b(this.f7608g.remove(rVar));
        this.f7602a.a(((d) rVar).f7593a);
        if (!this.f7608g.isEmpty() || this.f7606e) {
            return;
        }
        a(this.f7610j.f7759b);
    }

    private long b(long j6) {
        if (j6 == com.anythink.basead.exoplayer.b.f6382b) {
            return com.anythink.basead.exoplayer.b.f6382b;
        }
        long a9 = com.anythink.basead.exoplayer.b.a(this.f7603b);
        long max = Math.max(0L, j6 - a9);
        long j9 = this.f7604c;
        return j9 != Long.MIN_VALUE ? Math.min(com.anythink.basead.exoplayer.b.a(j9) - a9, max) : max;
    }

    @Override // com.anythink.basead.exoplayer.h.f, com.anythink.basead.exoplayer.h.c
    public final void a() {
        super.a();
        this.f7611k = null;
        this.f7610j = null;
    }

    private void a(com.anythink.basead.exoplayer.ae aeVar) {
        long j6;
        long j9;
        long j10;
        aeVar.a(0, this.f7609h, false);
        long j11 = this.f7609h.f6356j;
        if (this.f7610j != null && !this.f7608g.isEmpty() && !this.f7606e) {
            long j12 = this.f7612l - j11;
            j10 = this.f7604c != Long.MIN_VALUE ? this.f7613m - j11 : Long.MIN_VALUE;
            j9 = j12;
        } else {
            long j13 = this.f7603b;
            long j14 = this.f7604c;
            if (this.f7607f) {
                long j15 = this.f7609h.f6355h;
                j13 += j15;
                j6 = j15 + j14;
            } else {
                j6 = j14;
            }
            this.f7612l = j11 + j13;
            this.f7613m = j14 != Long.MIN_VALUE ? j11 + j6 : Long.MIN_VALUE;
            int size = this.f7608g.size();
            for (int i = 0; i < size; i++) {
                this.f7608g.get(i).a(this.f7612l, this.f7613m);
            }
            j9 = j13;
            j10 = j6;
        }
        try {
            a aVar = new a(aeVar, j9, j10);
            this.f7610j = aVar;
            a(aVar, this.i);
        } catch (b e9) {
            this.f7611k = e9;
        }
    }

    public static final class a extends p {

        /* renamed from: c, reason: collision with root package name */
        private final long f7614c;

        /* renamed from: d, reason: collision with root package name */
        private final long f7615d;

        /* renamed from: e, reason: collision with root package name */
        private final long f7616e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f7617f;

        public a(com.anythink.basead.exoplayer.ae aeVar, long j6, long j9) {
            super(aeVar);
            boolean z3 = false;
            if (aeVar.c() != 1) {
                throw new b(0);
            }
            ae.b a9 = aeVar.a(0, new ae.b(), false);
            long max = Math.max(0L, j6);
            long max2 = j9 == Long.MIN_VALUE ? a9.i : Math.max(0L, j9);
            long j10 = a9.i;
            if (j10 != com.anythink.basead.exoplayer.b.f6382b) {
                max2 = max2 > j10 ? j10 : max2;
                if (max != 0 && !a9.f6351d) {
                    throw new b(1);
                }
                if (max > max2) {
                    throw new b(2);
                }
            }
            this.f7614c = max;
            this.f7615d = max2;
            this.f7616e = max2 == com.anythink.basead.exoplayer.b.f6382b ? -9223372036854775807L : max2 - max;
            if (a9.f6352e && (max2 == com.anythink.basead.exoplayer.b.f6382b || (j10 != com.anythink.basead.exoplayer.b.f6382b && max2 == j10))) {
                z3 = true;
            }
            this.f7617f = z3;
        }

        @Override // com.anythink.basead.exoplayer.h.p, com.anythink.basead.exoplayer.ae
        public final ae.b a(int i, ae.b bVar, boolean z3, long j6) {
            this.f7759b.a(0, bVar, z3, 0L);
            long j9 = bVar.f6356j;
            long j10 = this.f7614c;
            bVar.f6356j = j9 + j10;
            bVar.i = this.f7616e;
            bVar.f6352e = this.f7617f;
            long j11 = bVar.f6355h;
            if (j11 != com.anythink.basead.exoplayer.b.f6382b) {
                long max = Math.max(j11, j10);
                bVar.f6355h = max;
                long j12 = this.f7615d;
                if (j12 != com.anythink.basead.exoplayer.b.f6382b) {
                    max = Math.min(max, j12);
                }
                bVar.f6355h = max - this.f7614c;
            }
            long a9 = com.anythink.basead.exoplayer.b.a(this.f7614c);
            long j13 = bVar.f6349b;
            if (j13 != com.anythink.basead.exoplayer.b.f6382b) {
                bVar.f6349b = j13 + a9;
            }
            long j14 = bVar.f6350c;
            if (j14 != com.anythink.basead.exoplayer.b.f6382b) {
                bVar.f6350c = j14 + a9;
            }
            return bVar;
        }

        @Override // com.anythink.basead.exoplayer.h.p, com.anythink.basead.exoplayer.ae
        public final ae.a a(int i, ae.a aVar, boolean z3) {
            this.f7759b.a(0, aVar, z3);
            long b9 = aVar.b() - this.f7614c;
            long j6 = this.f7616e;
            long j9 = com.anythink.basead.exoplayer.b.f6382b;
            if (j6 != com.anythink.basead.exoplayer.b.f6382b) {
                j9 = j6 - b9;
            }
            return aVar.a(aVar.f6342a, aVar.f6343b, j9, b9);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.f
    public final /* synthetic */ long a(long j6) {
        if (j6 == com.anythink.basead.exoplayer.b.f6382b) {
            return com.anythink.basead.exoplayer.b.f6382b;
        }
        long a9 = com.anythink.basead.exoplayer.b.a(this.f7603b);
        long max = Math.max(0L, j6 - a9);
        long j9 = this.f7604c;
        return j9 != Long.MIN_VALUE ? Math.min(com.anythink.basead.exoplayer.b.a(j9) - a9, max) : max;
    }

    @Override // com.anythink.basead.exoplayer.h.f
    public final /* bridge */ /* synthetic */ void a(Void r12, s sVar, com.anythink.basead.exoplayer.ae aeVar, Object obj) {
        if (this.f7611k == null) {
            this.i = obj;
            a(aeVar);
        }
    }
}

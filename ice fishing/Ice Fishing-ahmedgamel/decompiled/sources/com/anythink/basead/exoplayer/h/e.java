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
    private final s f8388a;

    /* renamed from: b, reason: collision with root package name */
    private final long f8389b;

    /* renamed from: c, reason: collision with root package name */
    private final long f8390c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f8391d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f8392e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f8393f;

    /* renamed from: g, reason: collision with root package name */
    private final ArrayList<d> f8394g;

    /* renamed from: h, reason: collision with root package name */
    private final ae.b f8395h;
    private Object i;

    /* renamed from: j, reason: collision with root package name */
    private a f8396j;

    /* renamed from: k, reason: collision with root package name */
    private b f8397k;

    /* renamed from: l, reason: collision with root package name */
    private long f8398l;

    /* renamed from: m, reason: collision with root package name */
    private long f8399m;

    public static final class b extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public static final int f8404a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f8405b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f8406c = 2;

        /* renamed from: d, reason: collision with root package name */
        public final int f8407d;

        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public b(int i) {
            super("Illegal clipping: ".concat(i != 0 ? i != 1 ? i != 2 ? com.anythink.core.common.v.m.f17596e : "start exceeds end" : "not seekable to start" : "invalid period count"));
            this.f8407d = i;
        }

        private static String a(int i) {
            return i != 0 ? i != 1 ? i != 2 ? com.anythink.core.common.v.m.f17596e : "start exceeds end" : "not seekable to start" : "invalid period count";
        }
    }

    private e(s sVar, long j6, long j9) {
        this(sVar, j6, j9, true, false);
    }

    @Override // com.anythink.basead.exoplayer.h.f, com.anythink.basead.exoplayer.h.c
    public final void a(com.anythink.basead.exoplayer.h hVar, boolean z6) {
        super.a(hVar, z6);
        a((e) null, this.f8388a);
    }

    @Override // com.anythink.basead.exoplayer.h.f, com.anythink.basead.exoplayer.h.s
    public final void b() {
        b bVar = this.f8397k;
        if (bVar != null) {
            throw bVar;
        }
        super.b();
    }

    @Deprecated
    private e(s sVar, long j6, long j9, boolean z6) {
        this(sVar, j6, j9, z6, false);
    }

    private e(s sVar, long j6) {
        this(sVar, 0L, j6, true, true);
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final r a(s.a aVar, com.anythink.basead.exoplayer.j.b bVar) {
        d dVar = new d(this.f8388a.a(aVar, bVar), this.f8391d, this.f8398l, this.f8399m);
        this.f8394g.add(dVar);
        return dVar;
    }

    private e(s sVar, long j6, long j9, boolean z6, boolean z9) {
        com.anythink.basead.exoplayer.k.a.a(j6 >= 0);
        this.f8388a = (s) com.anythink.basead.exoplayer.k.a.a(sVar);
        this.f8389b = j6;
        this.f8390c = j9;
        this.f8391d = z6;
        this.f8392e = false;
        this.f8393f = z9;
        this.f8394g = new ArrayList<>();
        this.f8395h = new ae.b();
    }

    private void b(com.anythink.basead.exoplayer.ae aeVar, Object obj) {
        if (this.f8397k != null) {
            return;
        }
        this.i = obj;
        a(aeVar);
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final void a(r rVar) {
        com.anythink.basead.exoplayer.k.a.b(this.f8394g.remove(rVar));
        this.f8388a.a(((d) rVar).f8379a);
        if (!this.f8394g.isEmpty() || this.f8392e) {
            return;
        }
        a(this.f8396j.f8545b);
    }

    private long b(long j6) {
        if (j6 == com.anythink.basead.exoplayer.b.f7168b) {
            return com.anythink.basead.exoplayer.b.f7168b;
        }
        long a9 = com.anythink.basead.exoplayer.b.a(this.f8389b);
        long max = Math.max(0L, j6 - a9);
        long j9 = this.f8390c;
        return j9 != Long.MIN_VALUE ? Math.min(com.anythink.basead.exoplayer.b.a(j9) - a9, max) : max;
    }

    @Override // com.anythink.basead.exoplayer.h.f, com.anythink.basead.exoplayer.h.c
    public final void a() {
        super.a();
        this.f8397k = null;
        this.f8396j = null;
    }

    private void a(com.anythink.basead.exoplayer.ae aeVar) {
        long j6;
        long j9;
        long j10;
        aeVar.a(0, this.f8395h, false);
        long j11 = this.f8395h.f7142j;
        if (this.f8396j != null && !this.f8394g.isEmpty() && !this.f8392e) {
            long j12 = this.f8398l - j11;
            j10 = this.f8390c != Long.MIN_VALUE ? this.f8399m - j11 : Long.MIN_VALUE;
            j9 = j12;
        } else {
            long j13 = this.f8389b;
            long j14 = this.f8390c;
            if (this.f8393f) {
                long j15 = this.f8395h.f7141h;
                j13 += j15;
                j6 = j15 + j14;
            } else {
                j6 = j14;
            }
            this.f8398l = j11 + j13;
            this.f8399m = j14 != Long.MIN_VALUE ? j11 + j6 : Long.MIN_VALUE;
            int size = this.f8394g.size();
            for (int i = 0; i < size; i++) {
                this.f8394g.get(i).a(this.f8398l, this.f8399m);
            }
            j9 = j13;
            j10 = j6;
        }
        try {
            a aVar = new a(aeVar, j9, j10);
            this.f8396j = aVar;
            a(aVar, this.i);
        } catch (b e9) {
            this.f8397k = e9;
        }
    }

    public static final class a extends p {

        /* renamed from: c, reason: collision with root package name */
        private final long f8400c;

        /* renamed from: d, reason: collision with root package name */
        private final long f8401d;

        /* renamed from: e, reason: collision with root package name */
        private final long f8402e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f8403f;

        public a(com.anythink.basead.exoplayer.ae aeVar, long j6, long j9) {
            super(aeVar);
            boolean z6 = false;
            if (aeVar.c() != 1) {
                throw new b(0);
            }
            ae.b a9 = aeVar.a(0, new ae.b(), false);
            long max = Math.max(0L, j6);
            long max2 = j9 == Long.MIN_VALUE ? a9.i : Math.max(0L, j9);
            long j10 = a9.i;
            if (j10 != com.anythink.basead.exoplayer.b.f7168b) {
                max2 = max2 > j10 ? j10 : max2;
                if (max != 0 && !a9.f7137d) {
                    throw new b(1);
                }
                if (max > max2) {
                    throw new b(2);
                }
            }
            this.f8400c = max;
            this.f8401d = max2;
            this.f8402e = max2 == com.anythink.basead.exoplayer.b.f7168b ? -9223372036854775807L : max2 - max;
            if (a9.f7138e && (max2 == com.anythink.basead.exoplayer.b.f7168b || (j10 != com.anythink.basead.exoplayer.b.f7168b && max2 == j10))) {
                z6 = true;
            }
            this.f8403f = z6;
        }

        @Override // com.anythink.basead.exoplayer.h.p, com.anythink.basead.exoplayer.ae
        public final ae.b a(int i, ae.b bVar, boolean z6, long j6) {
            this.f8545b.a(0, bVar, z6, 0L);
            long j9 = bVar.f7142j;
            long j10 = this.f8400c;
            bVar.f7142j = j9 + j10;
            bVar.i = this.f8402e;
            bVar.f7138e = this.f8403f;
            long j11 = bVar.f7141h;
            if (j11 != com.anythink.basead.exoplayer.b.f7168b) {
                long max = Math.max(j11, j10);
                bVar.f7141h = max;
                long j12 = this.f8401d;
                if (j12 != com.anythink.basead.exoplayer.b.f7168b) {
                    max = Math.min(max, j12);
                }
                bVar.f7141h = max - this.f8400c;
            }
            long a9 = com.anythink.basead.exoplayer.b.a(this.f8400c);
            long j13 = bVar.f7135b;
            if (j13 != com.anythink.basead.exoplayer.b.f7168b) {
                bVar.f7135b = j13 + a9;
            }
            long j14 = bVar.f7136c;
            if (j14 != com.anythink.basead.exoplayer.b.f7168b) {
                bVar.f7136c = j14 + a9;
            }
            return bVar;
        }

        @Override // com.anythink.basead.exoplayer.h.p, com.anythink.basead.exoplayer.ae
        public final ae.a a(int i, ae.a aVar, boolean z6) {
            this.f8545b.a(0, aVar, z6);
            long b9 = aVar.b() - this.f8400c;
            long j6 = this.f8402e;
            long j9 = com.anythink.basead.exoplayer.b.f7168b;
            if (j6 != com.anythink.basead.exoplayer.b.f7168b) {
                j9 = j6 - b9;
            }
            return aVar.a(aVar.f7128a, aVar.f7129b, j9, b9);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.f
    public final /* synthetic */ long a(long j6) {
        if (j6 == com.anythink.basead.exoplayer.b.f7168b) {
            return com.anythink.basead.exoplayer.b.f7168b;
        }
        long a9 = com.anythink.basead.exoplayer.b.a(this.f8389b);
        long max = Math.max(0L, j6 - a9);
        long j9 = this.f8390c;
        return j9 != Long.MIN_VALUE ? Math.min(com.anythink.basead.exoplayer.b.a(j9) - a9, max) : max;
    }

    @Override // com.anythink.basead.exoplayer.h.f
    public final /* bridge */ /* synthetic */ void a(Void r1, s sVar, com.anythink.basead.exoplayer.ae aeVar, Object obj) {
        if (this.f8397k == null) {
            this.i = obj;
            a(aeVar);
        }
    }
}

package com.anythink.basead.exoplayer.h;

import com.anythink.basead.exoplayer.ae;
import com.anythink.basead.exoplayer.h.s;
import com.anythink.basead.exoplayer.k.C0544a;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e extends f<Void> {

    /* renamed from: a, reason: collision with root package name */
    private final s f7759a;

    /* renamed from: b, reason: collision with root package name */
    private final long f7760b;

    /* renamed from: c, reason: collision with root package name */
    private final long f7761c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f7762d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f7763e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f7764f;

    /* renamed from: g, reason: collision with root package name */
    private final ArrayList<d> f7765g;

    /* renamed from: h, reason: collision with root package name */
    private final ae.b f7766h;
    private Object i;

    /* renamed from: j, reason: collision with root package name */
    private a f7767j;

    /* renamed from: k, reason: collision with root package name */
    private b f7768k;

    /* renamed from: l, reason: collision with root package name */
    private long f7769l;

    /* renamed from: m, reason: collision with root package name */
    private long f7770m;

    public static final class b extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public static final int f7775a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f7776b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f7777c = 2;

        /* renamed from: d, reason: collision with root package name */
        public final int f7778d;

        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public b(int i) {
            super("Illegal clipping: ".concat(i != 0 ? i != 1 ? i != 2 ? com.anythink.core.common.v.m.f16967e : "start exceeds end" : "not seekable to start" : "invalid period count"));
            this.f7778d = i;
        }

        private static String a(int i) {
            return i != 0 ? i != 1 ? i != 2 ? com.anythink.core.common.v.m.f16967e : "start exceeds end" : "not seekable to start" : "invalid period count";
        }
    }

    private e(s sVar, long j9, long j10) {
        this(sVar, j9, j10, true, false);
    }

    @Override // com.anythink.basead.exoplayer.h.f, com.anythink.basead.exoplayer.h.c
    public final void a(com.anythink.basead.exoplayer.h hVar, boolean z8) {
        super.a(hVar, z8);
        a((e) null, this.f7759a);
    }

    @Override // com.anythink.basead.exoplayer.h.f, com.anythink.basead.exoplayer.h.s
    public final void b() {
        b bVar = this.f7768k;
        if (bVar != null) {
            throw bVar;
        }
        super.b();
    }

    @Deprecated
    private e(s sVar, long j9, long j10, boolean z8) {
        this(sVar, j9, j10, z8, false);
    }

    private e(s sVar, long j9) {
        this(sVar, 0L, j9, true, true);
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final r a(s.a aVar, com.anythink.basead.exoplayer.j.b bVar) {
        d dVar = new d(this.f7759a.a(aVar, bVar), this.f7762d, this.f7769l, this.f7770m);
        this.f7765g.add(dVar);
        return dVar;
    }

    private e(s sVar, long j9, long j10, boolean z8, boolean z9) {
        C0544a.a(j9 >= 0);
        this.f7759a = (s) C0544a.a(sVar);
        this.f7760b = j9;
        this.f7761c = j10;
        this.f7762d = z8;
        this.f7763e = false;
        this.f7764f = z9;
        this.f7765g = new ArrayList<>();
        this.f7766h = new ae.b();
    }

    private void b(com.anythink.basead.exoplayer.ae aeVar, Object obj) {
        if (this.f7768k != null) {
            return;
        }
        this.i = obj;
        a(aeVar);
    }

    @Override // com.anythink.basead.exoplayer.h.s
    public final void a(r rVar) {
        C0544a.b(this.f7765g.remove(rVar));
        this.f7759a.a(((d) rVar).f7750a);
        if (!this.f7765g.isEmpty() || this.f7763e) {
            return;
        }
        a(this.f7767j.f7916b);
    }

    private long b(long j9) {
        if (j9 == com.anythink.basead.exoplayer.b.f6539b) {
            return com.anythink.basead.exoplayer.b.f6539b;
        }
        long a9 = com.anythink.basead.exoplayer.b.a(this.f7760b);
        long max = Math.max(0L, j9 - a9);
        long j10 = this.f7761c;
        return j10 != Long.MIN_VALUE ? Math.min(com.anythink.basead.exoplayer.b.a(j10) - a9, max) : max;
    }

    @Override // com.anythink.basead.exoplayer.h.f, com.anythink.basead.exoplayer.h.c
    public final void a() {
        super.a();
        this.f7768k = null;
        this.f7767j = null;
    }

    private void a(com.anythink.basead.exoplayer.ae aeVar) {
        long j9;
        long j10;
        long j11;
        aeVar.a(0, this.f7766h, false);
        long j12 = this.f7766h.f6513j;
        if (this.f7767j != null && !this.f7765g.isEmpty() && !this.f7763e) {
            long j13 = this.f7769l - j12;
            j11 = this.f7761c != Long.MIN_VALUE ? this.f7770m - j12 : Long.MIN_VALUE;
            j10 = j13;
        } else {
            long j14 = this.f7760b;
            long j15 = this.f7761c;
            if (this.f7764f) {
                long j16 = this.f7766h.f6512h;
                j14 += j16;
                j9 = j16 + j15;
            } else {
                j9 = j15;
            }
            this.f7769l = j12 + j14;
            this.f7770m = j15 != Long.MIN_VALUE ? j12 + j9 : Long.MIN_VALUE;
            int size = this.f7765g.size();
            for (int i = 0; i < size; i++) {
                this.f7765g.get(i).a(this.f7769l, this.f7770m);
            }
            j10 = j14;
            j11 = j9;
        }
        try {
            a aVar = new a(aeVar, j10, j11);
            this.f7767j = aVar;
            a(aVar, this.i);
        } catch (b e6) {
            this.f7768k = e6;
        }
    }

    public static final class a extends p {

        /* renamed from: c, reason: collision with root package name */
        private final long f7771c;

        /* renamed from: d, reason: collision with root package name */
        private final long f7772d;

        /* renamed from: e, reason: collision with root package name */
        private final long f7773e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f7774f;

        public a(com.anythink.basead.exoplayer.ae aeVar, long j9, long j10) {
            super(aeVar);
            boolean z8 = false;
            if (aeVar.c() != 1) {
                throw new b(0);
            }
            ae.b a9 = aeVar.a(0, new ae.b(), false);
            long max = Math.max(0L, j9);
            long max2 = j10 == Long.MIN_VALUE ? a9.i : Math.max(0L, j10);
            long j11 = a9.i;
            if (j11 != com.anythink.basead.exoplayer.b.f6539b) {
                max2 = max2 > j11 ? j11 : max2;
                if (max != 0 && !a9.f6508d) {
                    throw new b(1);
                }
                if (max > max2) {
                    throw new b(2);
                }
            }
            this.f7771c = max;
            this.f7772d = max2;
            this.f7773e = max2 == com.anythink.basead.exoplayer.b.f6539b ? -9223372036854775807L : max2 - max;
            if (a9.f6509e && (max2 == com.anythink.basead.exoplayer.b.f6539b || (j11 != com.anythink.basead.exoplayer.b.f6539b && max2 == j11))) {
                z8 = true;
            }
            this.f7774f = z8;
        }

        @Override // com.anythink.basead.exoplayer.h.p, com.anythink.basead.exoplayer.ae
        public final ae.b a(int i, ae.b bVar, boolean z8, long j9) {
            this.f7916b.a(0, bVar, z8, 0L);
            long j10 = bVar.f6513j;
            long j11 = this.f7771c;
            bVar.f6513j = j10 + j11;
            bVar.i = this.f7773e;
            bVar.f6509e = this.f7774f;
            long j12 = bVar.f6512h;
            if (j12 != com.anythink.basead.exoplayer.b.f6539b) {
                long max = Math.max(j12, j11);
                bVar.f6512h = max;
                long j13 = this.f7772d;
                if (j13 != com.anythink.basead.exoplayer.b.f6539b) {
                    max = Math.min(max, j13);
                }
                bVar.f6512h = max - this.f7771c;
            }
            long a9 = com.anythink.basead.exoplayer.b.a(this.f7771c);
            long j14 = bVar.f6506b;
            if (j14 != com.anythink.basead.exoplayer.b.f6539b) {
                bVar.f6506b = j14 + a9;
            }
            long j15 = bVar.f6507c;
            if (j15 != com.anythink.basead.exoplayer.b.f6539b) {
                bVar.f6507c = j15 + a9;
            }
            return bVar;
        }

        @Override // com.anythink.basead.exoplayer.h.p, com.anythink.basead.exoplayer.ae
        public final ae.a a(int i, ae.a aVar, boolean z8) {
            this.f7916b.a(0, aVar, z8);
            long b9 = aVar.b() - this.f7771c;
            long j9 = this.f7773e;
            long j10 = com.anythink.basead.exoplayer.b.f6539b;
            if (j9 != com.anythink.basead.exoplayer.b.f6539b) {
                j10 = j9 - b9;
            }
            return aVar.a(aVar.f6499a, aVar.f6500b, j10, b9);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.f
    public final /* synthetic */ long a(long j9) {
        if (j9 == com.anythink.basead.exoplayer.b.f6539b) {
            return com.anythink.basead.exoplayer.b.f6539b;
        }
        long a9 = com.anythink.basead.exoplayer.b.a(this.f7760b);
        long max = Math.max(0L, j9 - a9);
        long j10 = this.f7761c;
        return j10 != Long.MIN_VALUE ? Math.min(com.anythink.basead.exoplayer.b.a(j10) - a9, max) : max;
    }

    @Override // com.anythink.basead.exoplayer.h.f
    public final /* bridge */ /* synthetic */ void a(Void r12, s sVar, com.anythink.basead.exoplayer.ae aeVar, Object obj) {
        if (this.f7768k == null) {
            this.i = obj;
            a(aeVar);
        }
    }
}

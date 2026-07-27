package com.anythink.basead.exoplayer.i;

import com.anythink.basead.exoplayer.h.ae;
import com.anythink.basead.exoplayer.i.f;
import com.anythink.basead.exoplayer.k.af;
import com.anythink.basead.exoplayer.m;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7878a = 10000;

    /* renamed from: b, reason: collision with root package name */
    public static final int f7879b = 25000;

    /* renamed from: c, reason: collision with root package name */
    public static final int f7880c = 25000;

    /* renamed from: d, reason: collision with root package name */
    public static final float f7881d = 0.75f;

    /* renamed from: e, reason: collision with root package name */
    public static final float f7882e = 0.75f;

    /* renamed from: f, reason: collision with root package name */
    public static final long f7883f = 2000;

    /* renamed from: j, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.j.d f7884j;

    /* renamed from: k, reason: collision with root package name */
    private final long f7885k;

    /* renamed from: l, reason: collision with root package name */
    private final long f7886l;

    /* renamed from: m, reason: collision with root package name */
    private final long f7887m;

    /* renamed from: n, reason: collision with root package name */
    private final float f7888n;

    /* renamed from: o, reason: collision with root package name */
    private final float f7889o;

    /* renamed from: p, reason: collision with root package name */
    private final long f7890p;

    /* renamed from: q, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.k.c f7891q;

    /* renamed from: r, reason: collision with root package name */
    private float f7892r;

    /* renamed from: s, reason: collision with root package name */
    private int f7893s;

    /* renamed from: t, reason: collision with root package name */
    private int f7894t;

    /* renamed from: u, reason: collision with root package name */
    private long f7895u;

    /* renamed from: com.anythink.basead.exoplayer.i.a$a, reason: collision with other inner class name */
    public static final class C0031a implements f.a {

        /* renamed from: a, reason: collision with root package name */
        private final com.anythink.basead.exoplayer.j.d f7896a;

        /* renamed from: b, reason: collision with root package name */
        private final int f7897b;

        /* renamed from: c, reason: collision with root package name */
        private final int f7898c;

        /* renamed from: d, reason: collision with root package name */
        private final int f7899d;

        /* renamed from: e, reason: collision with root package name */
        private final float f7900e;

        /* renamed from: f, reason: collision with root package name */
        private final float f7901f;

        /* renamed from: g, reason: collision with root package name */
        private final long f7902g;

        /* renamed from: h, reason: collision with root package name */
        private final com.anythink.basead.exoplayer.k.c f7903h;

        public C0031a(com.anythink.basead.exoplayer.j.d dVar) {
            this(dVar, 10000, 25000, 25000, 0.75f, com.anythink.basead.exoplayer.k.c.f8365a);
        }

        private a b(ae aeVar, int... iArr) {
            return new a(aeVar, iArr, this.f7896a, this.f7897b, this.f7898c, this.f7899d, this.f7900e, this.f7901f, this.f7902g, this.f7903h);
        }

        @Override // com.anythink.basead.exoplayer.i.f.a
        public final /* synthetic */ f a(ae aeVar, int[] iArr) {
            return new a(aeVar, iArr, this.f7896a, this.f7897b, this.f7898c, this.f7899d, this.f7900e, this.f7901f, this.f7902g, this.f7903h);
        }

        private C0031a(com.anythink.basead.exoplayer.j.d dVar, int i, int i6, int i9, float f3) {
            this(dVar, i, i6, i9, f3, com.anythink.basead.exoplayer.k.c.f8365a);
        }

        private C0031a(com.anythink.basead.exoplayer.j.d dVar, int i, int i6, int i9, float f3, com.anythink.basead.exoplayer.k.c cVar) {
            this.f7896a = dVar;
            this.f7897b = i;
            this.f7898c = i6;
            this.f7899d = i9;
            this.f7900e = f3;
            this.f7901f = 0.75f;
            this.f7902g = a.f7883f;
            this.f7903h = cVar;
        }
    }

    private a(ae aeVar, int[] iArr, com.anythink.basead.exoplayer.j.d dVar) {
        this(aeVar, iArr, dVar, 10000L, 25000L, 25000L, 0.75f, 0.75f, f7883f, com.anythink.basead.exoplayer.k.c.f8365a);
    }

    @Override // com.anythink.basead.exoplayer.i.b, com.anythink.basead.exoplayer.i.f
    public final void a() {
        this.f7895u = com.anythink.basead.exoplayer.b.f6382b;
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public final int b() {
        return this.f7893s;
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public final int c() {
        return this.f7894t;
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public final Object d() {
        return null;
    }

    public a(ae aeVar, int[] iArr, com.anythink.basead.exoplayer.j.d dVar, long j6, long j9, long j10, float f3, float f9, long j11, com.anythink.basead.exoplayer.k.c cVar) {
        super(aeVar, iArr);
        this.f7884j = dVar;
        this.f7885k = j6 * 1000;
        this.f7886l = j9 * 1000;
        this.f7887m = j10 * 1000;
        this.f7888n = f3;
        this.f7889o = f9;
        this.f7890p = j11;
        this.f7891q = cVar;
        this.f7892r = 1.0f;
        this.f7894t = 1;
        this.f7895u = com.anythink.basead.exoplayer.b.f6382b;
        this.f7893s = a(Long.MIN_VALUE);
    }

    private long b(long j6) {
        return (j6 == com.anythink.basead.exoplayer.b.f6382b || j6 > this.f7885k) ? this.f7885k : (long) (j6 * this.f7889o);
    }

    @Override // com.anythink.basead.exoplayer.i.b, com.anythink.basead.exoplayer.i.f
    public final void a(float f3) {
        this.f7892r = f3;
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public final void a(long j6, long j9) {
        long j10;
        long a9 = this.f7891q.a();
        int i = this.f7893s;
        int a10 = a(a9);
        this.f7893s = a10;
        if (a10 == i) {
            return;
        }
        if (!b(i, a9)) {
            m a11 = a(i);
            int i6 = a(this.f7893s).f8661d;
            int i9 = a11.f8661d;
            if (i6 > i9) {
                if (j9 != com.anythink.basead.exoplayer.b.f6382b && j9 <= this.f7885k) {
                    j10 = (long) (j9 * this.f7889o);
                } else {
                    j10 = this.f7885k;
                }
                if (j6 < j10) {
                    this.f7893s = i;
                }
            }
            if (i6 < i9 && j6 >= this.f7886l) {
                this.f7893s = i;
            }
        }
        if (this.f7893s != i) {
            this.f7894t = 3;
        }
    }

    @Override // com.anythink.basead.exoplayer.i.b, com.anythink.basead.exoplayer.i.f
    public final int a(long j6, List<? extends com.anythink.basead.exoplayer.h.b.i> list) {
        int i;
        int i6;
        long a9 = this.f7891q.a();
        long j9 = this.f7895u;
        if (j9 != com.anythink.basead.exoplayer.b.f6382b && a9 - j9 < this.f7890p) {
            return list.size();
        }
        this.f7895u = a9;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        if (af.b(list.get(size - 1).f7531g - j6, this.f7892r) >= this.f7887m) {
            m a10 = a(a(a9));
            for (int i9 = 0; i9 < size; i9++) {
                com.anythink.basead.exoplayer.h.b.i iVar = list.get(i9);
                m mVar = iVar.f7528d;
                if (af.b(iVar.f7531g - j6, this.f7892r) >= this.f7887m && mVar.f8661d < a10.f8661d && (i = mVar.f8670n) != -1 && i < 720 && (i6 = mVar.f8669m) != -1 && i6 < 1280 && i < a10.f8670n) {
                    return i9;
                }
            }
        }
        return size;
    }

    private int a(long j6) {
        long a9 = (long) (this.f7884j.a() * this.f7888n);
        int i = 0;
        for (int i6 = 0; i6 < this.f7908h; i6++) {
            if (j6 == Long.MIN_VALUE || !b(i6, j6)) {
                if (Math.round(a(i6).f8661d * this.f7892r) <= a9) {
                    return i6;
                }
                i = i6;
            }
        }
        return i;
    }
}

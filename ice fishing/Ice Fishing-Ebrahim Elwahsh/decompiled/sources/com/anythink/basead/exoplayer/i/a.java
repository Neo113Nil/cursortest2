package com.anythink.basead.exoplayer.i;

import com.anythink.basead.exoplayer.h.ae;
import com.anythink.basead.exoplayer.i.f;
import com.anythink.basead.exoplayer.k.af;
import com.anythink.basead.exoplayer.m;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f8035a = 10000;

    /* renamed from: b, reason: collision with root package name */
    public static final int f8036b = 25000;

    /* renamed from: c, reason: collision with root package name */
    public static final int f8037c = 25000;

    /* renamed from: d, reason: collision with root package name */
    public static final float f8038d = 0.75f;

    /* renamed from: e, reason: collision with root package name */
    public static final float f8039e = 0.75f;

    /* renamed from: f, reason: collision with root package name */
    public static final long f8040f = 2000;

    /* renamed from: j, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.j.d f8041j;

    /* renamed from: k, reason: collision with root package name */
    private final long f8042k;

    /* renamed from: l, reason: collision with root package name */
    private final long f8043l;

    /* renamed from: m, reason: collision with root package name */
    private final long f8044m;

    /* renamed from: n, reason: collision with root package name */
    private final float f8045n;

    /* renamed from: o, reason: collision with root package name */
    private final float f8046o;

    /* renamed from: p, reason: collision with root package name */
    private final long f8047p;

    /* renamed from: q, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.k.c f8048q;

    /* renamed from: r, reason: collision with root package name */
    private float f8049r;

    /* renamed from: s, reason: collision with root package name */
    private int f8050s;

    /* renamed from: t, reason: collision with root package name */
    private int f8051t;

    /* renamed from: u, reason: collision with root package name */
    private long f8052u;

    /* renamed from: com.anythink.basead.exoplayer.i.a$a, reason: collision with other inner class name */
    public static final class C0030a implements f.a {

        /* renamed from: a, reason: collision with root package name */
        private final com.anythink.basead.exoplayer.j.d f8053a;

        /* renamed from: b, reason: collision with root package name */
        private final int f8054b;

        /* renamed from: c, reason: collision with root package name */
        private final int f8055c;

        /* renamed from: d, reason: collision with root package name */
        private final int f8056d;

        /* renamed from: e, reason: collision with root package name */
        private final float f8057e;

        /* renamed from: f, reason: collision with root package name */
        private final float f8058f;

        /* renamed from: g, reason: collision with root package name */
        private final long f8059g;

        /* renamed from: h, reason: collision with root package name */
        private final com.anythink.basead.exoplayer.k.c f8060h;

        public C0030a(com.anythink.basead.exoplayer.j.d dVar) {
            this(dVar, 10000, 25000, 25000, 0.75f, com.anythink.basead.exoplayer.k.c.f8522a);
        }

        private a b(ae aeVar, int... iArr) {
            return new a(aeVar, iArr, this.f8053a, this.f8054b, this.f8055c, this.f8056d, this.f8057e, this.f8058f, this.f8059g, this.f8060h);
        }

        @Override // com.anythink.basead.exoplayer.i.f.a
        public final /* synthetic */ f a(ae aeVar, int[] iArr) {
            return new a(aeVar, iArr, this.f8053a, this.f8054b, this.f8055c, this.f8056d, this.f8057e, this.f8058f, this.f8059g, this.f8060h);
        }

        private C0030a(com.anythink.basead.exoplayer.j.d dVar, int i, int i4, int i9, float f6) {
            this(dVar, i, i4, i9, f6, com.anythink.basead.exoplayer.k.c.f8522a);
        }

        private C0030a(com.anythink.basead.exoplayer.j.d dVar, int i, int i4, int i9, float f6, com.anythink.basead.exoplayer.k.c cVar) {
            this.f8053a = dVar;
            this.f8054b = i;
            this.f8055c = i4;
            this.f8056d = i9;
            this.f8057e = f6;
            this.f8058f = 0.75f;
            this.f8059g = a.f8040f;
            this.f8060h = cVar;
        }
    }

    private a(ae aeVar, int[] iArr, com.anythink.basead.exoplayer.j.d dVar) {
        this(aeVar, iArr, dVar, 10000L, 25000L, 25000L, 0.75f, 0.75f, f8040f, com.anythink.basead.exoplayer.k.c.f8522a);
    }

    @Override // com.anythink.basead.exoplayer.i.b, com.anythink.basead.exoplayer.i.f
    public final void a() {
        this.f8052u = com.anythink.basead.exoplayer.b.f6539b;
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public final int b() {
        return this.f8050s;
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public final int c() {
        return this.f8051t;
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public final Object d() {
        return null;
    }

    public a(ae aeVar, int[] iArr, com.anythink.basead.exoplayer.j.d dVar, long j9, long j10, long j11, float f6, float f9, long j12, com.anythink.basead.exoplayer.k.c cVar) {
        super(aeVar, iArr);
        this.f8041j = dVar;
        this.f8042k = j9 * 1000;
        this.f8043l = j10 * 1000;
        this.f8044m = j11 * 1000;
        this.f8045n = f6;
        this.f8046o = f9;
        this.f8047p = j12;
        this.f8048q = cVar;
        this.f8049r = 1.0f;
        this.f8051t = 1;
        this.f8052u = com.anythink.basead.exoplayer.b.f6539b;
        this.f8050s = a(Long.MIN_VALUE);
    }

    private long b(long j9) {
        return (j9 == com.anythink.basead.exoplayer.b.f6539b || j9 > this.f8042k) ? this.f8042k : (long) (j9 * this.f8046o);
    }

    @Override // com.anythink.basead.exoplayer.i.b, com.anythink.basead.exoplayer.i.f
    public final void a(float f6) {
        this.f8049r = f6;
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public final void a(long j9, long j10) {
        long j11;
        long a9 = this.f8048q.a();
        int i = this.f8050s;
        int a10 = a(a9);
        this.f8050s = a10;
        if (a10 == i) {
            return;
        }
        if (!b(i, a9)) {
            m a11 = a(i);
            int i4 = a(this.f8050s).f8818d;
            int i9 = a11.f8818d;
            if (i4 > i9) {
                if (j10 != com.anythink.basead.exoplayer.b.f6539b && j10 <= this.f8042k) {
                    j11 = (long) (j10 * this.f8046o);
                } else {
                    j11 = this.f8042k;
                }
                if (j9 < j11) {
                    this.f8050s = i;
                }
            }
            if (i4 < i9 && j9 >= this.f8043l) {
                this.f8050s = i;
            }
        }
        if (this.f8050s != i) {
            this.f8051t = 3;
        }
    }

    @Override // com.anythink.basead.exoplayer.i.b, com.anythink.basead.exoplayer.i.f
    public final int a(long j9, List<? extends com.anythink.basead.exoplayer.h.b.i> list) {
        int i;
        int i4;
        long a9 = this.f8048q.a();
        long j10 = this.f8052u;
        if (j10 != com.anythink.basead.exoplayer.b.f6539b && a9 - j10 < this.f8047p) {
            return list.size();
        }
        this.f8052u = a9;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        if (af.b(list.get(size - 1).f7688g - j9, this.f8049r) >= this.f8044m) {
            m a10 = a(a(a9));
            for (int i9 = 0; i9 < size; i9++) {
                com.anythink.basead.exoplayer.h.b.i iVar = list.get(i9);
                m mVar = iVar.f7685d;
                if (af.b(iVar.f7688g - j9, this.f8049r) >= this.f8044m && mVar.f8818d < a10.f8818d && (i = mVar.f8827n) != -1 && i < 720 && (i4 = mVar.f8826m) != -1 && i4 < 1280 && i < a10.f8827n) {
                    return i9;
                }
            }
        }
        return size;
    }

    private int a(long j9) {
        long a9 = (long) (this.f8041j.a() * this.f8045n);
        int i = 0;
        for (int i4 = 0; i4 < this.f8065h; i4++) {
            if (j9 == Long.MIN_VALUE || !b(i4, j9)) {
                if (Math.round(a(i4).f8818d * this.f8049r) <= a9) {
                    return i4;
                }
                i = i4;
            }
        }
        return i;
    }
}

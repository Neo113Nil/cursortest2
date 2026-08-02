package com.anythink.basead.exoplayer.i;

import com.anythink.basead.exoplayer.h.ae;
import com.anythink.basead.exoplayer.i.f;
import com.anythink.basead.exoplayer.k.af;
import com.anythink.basead.exoplayer.m;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f8664a = 10000;

    /* renamed from: b, reason: collision with root package name */
    public static final int f8665b = 25000;

    /* renamed from: c, reason: collision with root package name */
    public static final int f8666c = 25000;

    /* renamed from: d, reason: collision with root package name */
    public static final float f8667d = 0.75f;

    /* renamed from: e, reason: collision with root package name */
    public static final float f8668e = 0.75f;

    /* renamed from: f, reason: collision with root package name */
    public static final long f8669f = 2000;

    /* renamed from: j, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.j.d f8670j;

    /* renamed from: k, reason: collision with root package name */
    private final long f8671k;

    /* renamed from: l, reason: collision with root package name */
    private final long f8672l;

    /* renamed from: m, reason: collision with root package name */
    private final long f8673m;

    /* renamed from: n, reason: collision with root package name */
    private final float f8674n;

    /* renamed from: o, reason: collision with root package name */
    private final float f8675o;

    /* renamed from: p, reason: collision with root package name */
    private final long f8676p;

    /* renamed from: q, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.k.c f8677q;

    /* renamed from: r, reason: collision with root package name */
    private float f8678r;

    /* renamed from: s, reason: collision with root package name */
    private int f8679s;

    /* renamed from: t, reason: collision with root package name */
    private int f8680t;

    /* renamed from: u, reason: collision with root package name */
    private long f8681u;

    /* renamed from: com.anythink.basead.exoplayer.i.a$a, reason: collision with other inner class name */
    public static final class C0031a implements f.a {

        /* renamed from: a, reason: collision with root package name */
        private final com.anythink.basead.exoplayer.j.d f8682a;

        /* renamed from: b, reason: collision with root package name */
        private final int f8683b;

        /* renamed from: c, reason: collision with root package name */
        private final int f8684c;

        /* renamed from: d, reason: collision with root package name */
        private final int f8685d;

        /* renamed from: e, reason: collision with root package name */
        private final float f8686e;

        /* renamed from: f, reason: collision with root package name */
        private final float f8687f;

        /* renamed from: g, reason: collision with root package name */
        private final long f8688g;

        /* renamed from: h, reason: collision with root package name */
        private final com.anythink.basead.exoplayer.k.c f8689h;

        public C0031a(com.anythink.basead.exoplayer.j.d dVar) {
            this(dVar, 10000, 25000, 25000, 0.75f, com.anythink.basead.exoplayer.k.c.f9151a);
        }

        private a b(ae aeVar, int... iArr) {
            return new a(aeVar, iArr, this.f8682a, this.f8683b, this.f8684c, this.f8685d, this.f8686e, this.f8687f, this.f8688g, this.f8689h);
        }

        @Override // com.anythink.basead.exoplayer.i.f.a
        public final /* synthetic */ f a(ae aeVar, int[] iArr) {
            return new a(aeVar, iArr, this.f8682a, this.f8683b, this.f8684c, this.f8685d, this.f8686e, this.f8687f, this.f8688g, this.f8689h);
        }

        private C0031a(com.anythink.basead.exoplayer.j.d dVar, int i, int i4, int i6, float f2) {
            this(dVar, i, i4, i6, f2, com.anythink.basead.exoplayer.k.c.f9151a);
        }

        private C0031a(com.anythink.basead.exoplayer.j.d dVar, int i, int i4, int i6, float f2, com.anythink.basead.exoplayer.k.c cVar) {
            this.f8682a = dVar;
            this.f8683b = i;
            this.f8684c = i4;
            this.f8685d = i6;
            this.f8686e = f2;
            this.f8687f = 0.75f;
            this.f8688g = a.f8669f;
            this.f8689h = cVar;
        }
    }

    private a(ae aeVar, int[] iArr, com.anythink.basead.exoplayer.j.d dVar) {
        this(aeVar, iArr, dVar, 10000L, 25000L, 25000L, 0.75f, 0.75f, f8669f, com.anythink.basead.exoplayer.k.c.f9151a);
    }

    @Override // com.anythink.basead.exoplayer.i.b, com.anythink.basead.exoplayer.i.f
    public final void a() {
        this.f8681u = com.anythink.basead.exoplayer.b.f7168b;
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public final int b() {
        return this.f8679s;
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public final int c() {
        return this.f8680t;
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public final Object d() {
        return null;
    }

    public a(ae aeVar, int[] iArr, com.anythink.basead.exoplayer.j.d dVar, long j6, long j9, long j10, float f2, float f9, long j11, com.anythink.basead.exoplayer.k.c cVar) {
        super(aeVar, iArr);
        this.f8670j = dVar;
        this.f8671k = j6 * 1000;
        this.f8672l = j9 * 1000;
        this.f8673m = j10 * 1000;
        this.f8674n = f2;
        this.f8675o = f9;
        this.f8676p = j11;
        this.f8677q = cVar;
        this.f8678r = 1.0f;
        this.f8680t = 1;
        this.f8681u = com.anythink.basead.exoplayer.b.f7168b;
        this.f8679s = a(Long.MIN_VALUE);
    }

    private long b(long j6) {
        return (j6 == com.anythink.basead.exoplayer.b.f7168b || j6 > this.f8671k) ? this.f8671k : (long) (j6 * this.f8675o);
    }

    @Override // com.anythink.basead.exoplayer.i.b, com.anythink.basead.exoplayer.i.f
    public final void a(float f2) {
        this.f8678r = f2;
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public final void a(long j6, long j9) {
        long j10;
        long a9 = this.f8677q.a();
        int i = this.f8679s;
        int a10 = a(a9);
        this.f8679s = a10;
        if (a10 == i) {
            return;
        }
        if (!b(i, a9)) {
            m a11 = a(i);
            int i4 = a(this.f8679s).f9447d;
            int i6 = a11.f9447d;
            if (i4 > i6) {
                if (j9 != com.anythink.basead.exoplayer.b.f7168b && j9 <= this.f8671k) {
                    j10 = (long) (j9 * this.f8675o);
                } else {
                    j10 = this.f8671k;
                }
                if (j6 < j10) {
                    this.f8679s = i;
                }
            }
            if (i4 < i6 && j6 >= this.f8672l) {
                this.f8679s = i;
            }
        }
        if (this.f8679s != i) {
            this.f8680t = 3;
        }
    }

    @Override // com.anythink.basead.exoplayer.i.b, com.anythink.basead.exoplayer.i.f
    public final int a(long j6, List<? extends com.anythink.basead.exoplayer.h.b.i> list) {
        int i;
        int i4;
        long a9 = this.f8677q.a();
        long j9 = this.f8681u;
        if (j9 != com.anythink.basead.exoplayer.b.f7168b && a9 - j9 < this.f8676p) {
            return list.size();
        }
        this.f8681u = a9;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        if (af.b(list.get(size - 1).f8317g - j6, this.f8678r) >= this.f8673m) {
            m a10 = a(a(a9));
            for (int i6 = 0; i6 < size; i6++) {
                com.anythink.basead.exoplayer.h.b.i iVar = list.get(i6);
                m mVar = iVar.f8314d;
                if (af.b(iVar.f8317g - j6, this.f8678r) >= this.f8673m && mVar.f9447d < a10.f9447d && (i = mVar.f9456n) != -1 && i < 720 && (i4 = mVar.f9455m) != -1 && i4 < 1280 && i < a10.f9456n) {
                    return i6;
                }
            }
        }
        return size;
    }

    private int a(long j6) {
        long a9 = (long) (this.f8670j.a() * this.f8674n);
        int i = 0;
        for (int i4 = 0; i4 < this.f8694h; i4++) {
            if (j6 == Long.MIN_VALUE || !b(i4, j6)) {
                if (Math.round(a(i4).f9447d * this.f8678r) <= a9) {
                    return i4;
                }
                i = i4;
            }
        }
        return i;
    }
}

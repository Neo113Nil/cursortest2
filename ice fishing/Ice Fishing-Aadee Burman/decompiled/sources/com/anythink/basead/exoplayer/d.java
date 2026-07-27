package com.anythink.basead.exoplayer;

import com.anythink.basead.exoplayer.k.af;

/* loaded from: classes.dex */
public final class d implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final int f6762a = 15000;

    /* renamed from: b, reason: collision with root package name */
    public static final int f6763b = 50000;

    /* renamed from: c, reason: collision with root package name */
    public static final int f6764c = 2500;

    /* renamed from: d, reason: collision with root package name */
    public static final int f6765d = 5000;

    /* renamed from: e, reason: collision with root package name */
    public static final int f6766e = -1;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f6767f = true;

    /* renamed from: g, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.j.l f6768g;

    /* renamed from: h, reason: collision with root package name */
    private final long f6769h;
    private final long i;

    /* renamed from: j, reason: collision with root package name */
    private final long f6770j;

    /* renamed from: k, reason: collision with root package name */
    private final long f6771k;

    /* renamed from: l, reason: collision with root package name */
    private final int f6772l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f6773m;

    /* renamed from: n, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.k.v f6774n;

    /* renamed from: o, reason: collision with root package name */
    private int f6775o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f6776p;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private com.anythink.basead.exoplayer.j.l f6777a = null;

        /* renamed from: b, reason: collision with root package name */
        private int f6778b = d.f6762a;

        /* renamed from: c, reason: collision with root package name */
        private int f6779c = d.f6763b;

        /* renamed from: d, reason: collision with root package name */
        private int f6780d = d.f6764c;

        /* renamed from: e, reason: collision with root package name */
        private int f6781e = 5000;

        /* renamed from: f, reason: collision with root package name */
        private int f6782f = -1;

        /* renamed from: g, reason: collision with root package name */
        private boolean f6783g = true;

        /* renamed from: h, reason: collision with root package name */
        private com.anythink.basead.exoplayer.k.v f6784h = null;

        private a a(com.anythink.basead.exoplayer.j.l lVar) {
            this.f6777a = lVar;
            return this;
        }

        private a a(int i, int i6, int i9, int i10) {
            this.f6778b = i;
            this.f6779c = i6;
            this.f6780d = i9;
            this.f6781e = i10;
            return this;
        }

        private a a(int i) {
            this.f6782f = i;
            return this;
        }

        private a a(boolean z3) {
            this.f6783g = z3;
            return this;
        }

        private a a(com.anythink.basead.exoplayer.k.v vVar) {
            this.f6784h = vVar;
            return this;
        }

        private d a() {
            if (this.f6777a == null) {
                this.f6777a = new com.anythink.basead.exoplayer.j.l((byte) 0);
            }
            return new d(this.f6777a, this.f6778b, this.f6779c, this.f6780d, this.f6781e, this.f6782f, this.f6783g, this.f6784h);
        }
    }

    public d() {
        this(new com.anythink.basead.exoplayer.j.l((byte) 0));
    }

    @Override // com.anythink.basead.exoplayer.p
    public final void a() {
        a(false);
    }

    @Override // com.anythink.basead.exoplayer.p
    public final void b() {
        a(true);
    }

    @Override // com.anythink.basead.exoplayer.p
    public final void c() {
        a(true);
    }

    @Override // com.anythink.basead.exoplayer.p
    public final com.anythink.basead.exoplayer.j.b d() {
        return this.f6768g;
    }

    @Override // com.anythink.basead.exoplayer.p
    public final long e() {
        return 0L;
    }

    @Override // com.anythink.basead.exoplayer.p
    public final boolean f() {
        return false;
    }

    @Deprecated
    private d(com.anythink.basead.exoplayer.j.l lVar) {
        this(lVar, (byte) 0);
    }

    private static int b(y[] yVarArr, com.anythink.basead.exoplayer.i.g gVar) {
        int i = 0;
        for (int i6 = 0; i6 < yVarArr.length; i6++) {
            if (gVar.a(i6) != null) {
                i = af.g(yVarArr[i6].a()) + i;
            }
        }
        return i;
    }

    @Override // com.anythink.basead.exoplayer.p
    public final void a(y[] yVarArr, com.anythink.basead.exoplayer.i.g gVar) {
        int i = this.f6772l;
        if (i == -1) {
            int i6 = 0;
            for (int i9 = 0; i9 < yVarArr.length; i9++) {
                if (gVar.a(i9) != null) {
                    i6 += af.g(yVarArr[i9].a());
                }
            }
            i = i6;
        }
        this.f6775o = i;
        this.f6768g.a(i);
    }

    @Deprecated
    private d(com.anythink.basead.exoplayer.j.l lVar, byte b9) {
        this(lVar, f6762a, f6763b, f6764c, 5000, -1, true, null);
    }

    @Deprecated
    public d(com.anythink.basead.exoplayer.j.l lVar, int i, int i6, int i9, int i10, int i11, boolean z3, com.anythink.basead.exoplayer.k.v vVar) {
        a(i9, 0, "bufferForPlaybackMs", "0");
        a(i10, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(i, i9, "minBufferMs", "bufferForPlaybackMs");
        a(i, i10, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(i6, i, "maxBufferMs", "minBufferMs");
        this.f6768g = lVar;
        this.f6769h = i * 1000;
        this.i = i6 * 1000;
        this.f6770j = i9 * 1000;
        this.f6771k = i10 * 1000;
        this.f6772l = i11;
        this.f6773m = z3;
        this.f6774n = vVar;
    }

    @Override // com.anythink.basead.exoplayer.p
    public final boolean a(long j6, float f3) {
        boolean z3;
        boolean z6 = true;
        boolean z9 = this.f6768g.c() >= this.f6775o;
        boolean z10 = this.f6776p;
        long j9 = this.f6769h;
        if (f3 > 1.0f) {
            j9 = Math.min(af.a(j9, f3), this.i);
        }
        if (j6 < j9) {
            if (!this.f6773m && z9) {
                z6 = false;
            }
            this.f6776p = z6;
        } else if (j6 > this.i || z9) {
            this.f6776p = false;
        }
        com.anythink.basead.exoplayer.k.v vVar = this.f6774n;
        if (vVar != null && (z3 = this.f6776p) != z10) {
            if (z3) {
                vVar.a();
            } else {
                vVar.c();
            }
        }
        return this.f6776p;
    }

    @Override // com.anythink.basead.exoplayer.p
    public final boolean a(long j6, float f3, boolean z3) {
        long b9 = af.b(j6, f3);
        long j9 = z3 ? this.f6771k : this.f6770j;
        if (j9 <= 0 || b9 >= j9) {
            return true;
        }
        return !this.f6773m && this.f6768g.c() >= this.f6775o;
    }

    private void a(boolean z3) {
        this.f6775o = 0;
        com.anythink.basead.exoplayer.k.v vVar = this.f6774n;
        if (vVar != null && this.f6776p) {
            vVar.c();
        }
        this.f6776p = false;
        if (z3) {
            this.f6768g.e();
        }
    }

    private static void a(int i, int i6, String str, String str2) {
        com.anythink.basead.exoplayer.k.a.a(i >= i6, str + " cannot be less than " + str2);
    }
}

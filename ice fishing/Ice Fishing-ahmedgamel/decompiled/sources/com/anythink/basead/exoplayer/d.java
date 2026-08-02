package com.anythink.basead.exoplayer;

import com.anythink.basead.exoplayer.k.af;

/* loaded from: classes.dex */
public final class d implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7548a = 15000;

    /* renamed from: b, reason: collision with root package name */
    public static final int f7549b = 50000;

    /* renamed from: c, reason: collision with root package name */
    public static final int f7550c = 2500;

    /* renamed from: d, reason: collision with root package name */
    public static final int f7551d = 5000;

    /* renamed from: e, reason: collision with root package name */
    public static final int f7552e = -1;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f7553f = true;

    /* renamed from: g, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.j.l f7554g;

    /* renamed from: h, reason: collision with root package name */
    private final long f7555h;
    private final long i;

    /* renamed from: j, reason: collision with root package name */
    private final long f7556j;

    /* renamed from: k, reason: collision with root package name */
    private final long f7557k;

    /* renamed from: l, reason: collision with root package name */
    private final int f7558l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f7559m;

    /* renamed from: n, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.k.v f7560n;

    /* renamed from: o, reason: collision with root package name */
    private int f7561o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f7562p;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private com.anythink.basead.exoplayer.j.l f7563a = null;

        /* renamed from: b, reason: collision with root package name */
        private int f7564b = d.f7548a;

        /* renamed from: c, reason: collision with root package name */
        private int f7565c = d.f7549b;

        /* renamed from: d, reason: collision with root package name */
        private int f7566d = d.f7550c;

        /* renamed from: e, reason: collision with root package name */
        private int f7567e = 5000;

        /* renamed from: f, reason: collision with root package name */
        private int f7568f = -1;

        /* renamed from: g, reason: collision with root package name */
        private boolean f7569g = true;

        /* renamed from: h, reason: collision with root package name */
        private com.anythink.basead.exoplayer.k.v f7570h = null;

        private a a(com.anythink.basead.exoplayer.j.l lVar) {
            this.f7563a = lVar;
            return this;
        }

        private a a(int i, int i4, int i6, int i9) {
            this.f7564b = i;
            this.f7565c = i4;
            this.f7566d = i6;
            this.f7567e = i9;
            return this;
        }

        private a a(int i) {
            this.f7568f = i;
            return this;
        }

        private a a(boolean z6) {
            this.f7569g = z6;
            return this;
        }

        private a a(com.anythink.basead.exoplayer.k.v vVar) {
            this.f7570h = vVar;
            return this;
        }

        private d a() {
            if (this.f7563a == null) {
                this.f7563a = new com.anythink.basead.exoplayer.j.l((byte) 0);
            }
            return new d(this.f7563a, this.f7564b, this.f7565c, this.f7566d, this.f7567e, this.f7568f, this.f7569g, this.f7570h);
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
        return this.f7554g;
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
        for (int i4 = 0; i4 < yVarArr.length; i4++) {
            if (gVar.a(i4) != null) {
                i = af.g(yVarArr[i4].a()) + i;
            }
        }
        return i;
    }

    @Override // com.anythink.basead.exoplayer.p
    public final void a(y[] yVarArr, com.anythink.basead.exoplayer.i.g gVar) {
        int i = this.f7558l;
        if (i == -1) {
            int i4 = 0;
            for (int i6 = 0; i6 < yVarArr.length; i6++) {
                if (gVar.a(i6) != null) {
                    i4 += af.g(yVarArr[i6].a());
                }
            }
            i = i4;
        }
        this.f7561o = i;
        this.f7554g.a(i);
    }

    @Deprecated
    private d(com.anythink.basead.exoplayer.j.l lVar, byte b9) {
        this(lVar, f7548a, f7549b, f7550c, 5000, -1, true, null);
    }

    @Deprecated
    public d(com.anythink.basead.exoplayer.j.l lVar, int i, int i4, int i6, int i9, int i10, boolean z6, com.anythink.basead.exoplayer.k.v vVar) {
        a(i6, 0, "bufferForPlaybackMs", "0");
        a(i9, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(i, i6, "minBufferMs", "bufferForPlaybackMs");
        a(i, i9, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(i4, i, "maxBufferMs", "minBufferMs");
        this.f7554g = lVar;
        this.f7555h = i * 1000;
        this.i = i4 * 1000;
        this.f7556j = i6 * 1000;
        this.f7557k = i9 * 1000;
        this.f7558l = i10;
        this.f7559m = z6;
        this.f7560n = vVar;
    }

    @Override // com.anythink.basead.exoplayer.p
    public final boolean a(long j6, float f2) {
        boolean z6;
        boolean z9 = true;
        boolean z10 = this.f7554g.c() >= this.f7561o;
        boolean z11 = this.f7562p;
        long j9 = this.f7555h;
        if (f2 > 1.0f) {
            j9 = Math.min(af.a(j9, f2), this.i);
        }
        if (j6 < j9) {
            if (!this.f7559m && z10) {
                z9 = false;
            }
            this.f7562p = z9;
        } else if (j6 > this.i || z10) {
            this.f7562p = false;
        }
        com.anythink.basead.exoplayer.k.v vVar = this.f7560n;
        if (vVar != null && (z6 = this.f7562p) != z11) {
            if (z6) {
                vVar.a();
            } else {
                vVar.c();
            }
        }
        return this.f7562p;
    }

    @Override // com.anythink.basead.exoplayer.p
    public final boolean a(long j6, float f2, boolean z6) {
        long b9 = af.b(j6, f2);
        long j9 = z6 ? this.f7557k : this.f7556j;
        if (j9 <= 0 || b9 >= j9) {
            return true;
        }
        return !this.f7559m && this.f7554g.c() >= this.f7561o;
    }

    private void a(boolean z6) {
        this.f7561o = 0;
        com.anythink.basead.exoplayer.k.v vVar = this.f7560n;
        if (vVar != null && this.f7562p) {
            vVar.c();
        }
        this.f7562p = false;
        if (z6) {
            this.f7554g.e();
        }
    }

    private static void a(int i, int i4, String str, String str2) {
        com.anythink.basead.exoplayer.k.a.a(i >= i4, str + " cannot be less than " + str2);
    }
}

package com.anythink.basead.exoplayer.h;

import com.anythink.basead.exoplayer.h.r;
import com.anythink.basead.exoplayer.k.C0544a;

/* loaded from: classes.dex */
public final class d implements r, r.a {

    /* renamed from: a, reason: collision with root package name */
    public final r f7750a;

    /* renamed from: b, reason: collision with root package name */
    long f7751b;

    /* renamed from: c, reason: collision with root package name */
    long f7752c;

    /* renamed from: d, reason: collision with root package name */
    private r.a f7753d;

    /* renamed from: e, reason: collision with root package name */
    private a[] f7754e = new a[0];

    /* renamed from: f, reason: collision with root package name */
    private long f7755f;

    public final class a implements y {

        /* renamed from: a, reason: collision with root package name */
        public final y f7756a;

        /* renamed from: c, reason: collision with root package name */
        private boolean f7758c;

        public a(y yVar) {
            this.f7756a = yVar;
        }

        public final void a() {
            this.f7758c = false;
        }

        @Override // com.anythink.basead.exoplayer.h.y
        public final boolean b() {
            return !d.this.f() && this.f7756a.b();
        }

        @Override // com.anythink.basead.exoplayer.h.y
        public final void c() {
            this.f7756a.c();
        }

        @Override // com.anythink.basead.exoplayer.h.y
        public final int a(com.anythink.basead.exoplayer.n nVar, com.anythink.basead.exoplayer.c.e eVar, boolean z8) {
            if (d.this.f()) {
                return -3;
            }
            if (this.f7758c) {
                eVar.a(4);
                return -4;
            }
            int a9 = this.f7756a.a(nVar, eVar, z8);
            if (a9 == -5) {
                com.anythink.basead.exoplayer.m mVar = nVar.f8840a;
                int i = mVar.f8837x;
                if (i != 0 || mVar.f8838y != 0) {
                    d dVar = d.this;
                    if (dVar.f7751b != 0) {
                        i = 0;
                    }
                    nVar.f8840a = mVar.a(i, dVar.f7752c == Long.MIN_VALUE ? mVar.f8838y : 0);
                }
                return -5;
            }
            d dVar2 = d.this;
            long j9 = dVar2.f7752c;
            if (j9 == Long.MIN_VALUE || ((a9 != -4 || eVar.f6900f < j9) && !(a9 == -3 && dVar2.d() == Long.MIN_VALUE))) {
                return a9;
            }
            eVar.a();
            eVar.a(4);
            this.f7758c = true;
            return -4;
        }

        @Override // com.anythink.basead.exoplayer.h.y
        public final int a(long j9) {
            if (d.this.f()) {
                return -3;
            }
            return this.f7756a.a(j9);
        }
    }

    public d(r rVar, boolean z8, long j9, long j10) {
        this.f7750a = rVar;
        this.f7755f = z8 ? j9 : com.anythink.basead.exoplayer.b.f6539b;
        this.f7751b = j9;
        this.f7752c = j10;
    }

    private void g() {
        this.f7753d.a((r.a) this);
    }

    public final void a(long j9, long j10) {
        this.f7751b = j9;
        this.f7752c = j10;
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final void a_(long j9) {
        this.f7750a.a_(j9);
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final af b() {
        return this.f7750a.b();
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long c() {
        if (f()) {
            long j9 = this.f7755f;
            this.f7755f = com.anythink.basead.exoplayer.b.f6539b;
            long c4 = c();
            return c4 != com.anythink.basead.exoplayer.b.f6539b ? c4 : j9;
        }
        long c9 = this.f7750a.c();
        if (c9 == com.anythink.basead.exoplayer.b.f6539b) {
            return com.anythink.basead.exoplayer.b.f6539b;
        }
        C0544a.b(c9 >= this.f7751b);
        long j10 = this.f7752c;
        C0544a.b(j10 == Long.MIN_VALUE || c9 <= j10);
        return c9;
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final long d() {
        long d2 = this.f7750a.d();
        if (d2 != Long.MIN_VALUE) {
            long j9 = this.f7752c;
            if (j9 == Long.MIN_VALUE || d2 < j9) {
                return d2;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final long e() {
        long e6 = this.f7750a.e();
        if (e6 != Long.MIN_VALUE) {
            long j9 = this.f7752c;
            if (j9 == Long.MIN_VALUE || e6 < j9) {
                return e6;
            }
        }
        return Long.MIN_VALUE;
    }

    public final boolean f() {
        return this.f7755f != com.anythink.basead.exoplayer.b.f6539b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r0 > r6) goto L17;
     */
    @Override // com.anythink.basead.exoplayer.h.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long b(long j9) {
        this.f7755f = com.anythink.basead.exoplayer.b.f6539b;
        boolean z8 = false;
        for (a aVar : this.f7754e) {
            if (aVar != null) {
                aVar.a();
            }
        }
        long b9 = this.f7750a.b(j9);
        if (b9 != j9) {
            if (b9 >= this.f7751b) {
                long j10 = this.f7752c;
                if (j10 != Long.MIN_VALUE) {
                }
            }
            C0544a.b(z8);
            return b9;
        }
        z8 = true;
        C0544a.b(z8);
        return b9;
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final void a(r.a aVar, long j9) {
        this.f7753d = aVar;
        this.f7750a.a(this, j9);
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final void a() {
        this.f7750a.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
    
        if (r10 > r2) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    @Override // com.anythink.basead.exoplayer.h.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(com.anythink.basead.exoplayer.i.f[] fVarArr, boolean[] zArr, y[] yVarArr, boolean[] zArr2, long j9) {
        long j10;
        boolean z8;
        this.f7754e = new a[yVarArr.length];
        y[] yVarArr2 = new y[yVarArr.length];
        int i = 0;
        while (true) {
            y yVar = null;
            if (i >= yVarArr.length) {
                break;
            }
            a[] aVarArr = this.f7754e;
            a aVar = (a) yVarArr[i];
            aVarArr[i] = aVar;
            if (aVar != null) {
                yVar = aVar.f7756a;
            }
            yVarArr2[i] = yVar;
            i++;
        }
        long a9 = this.f7750a.a(fVarArr, zArr, yVarArr2, zArr2, j9);
        if (f()) {
            long j11 = this.f7751b;
            if (j9 == j11 && j11 != 0) {
                for (com.anythink.basead.exoplayer.i.f fVar : fVarArr) {
                    if (fVar != null && !com.anythink.basead.exoplayer.k.o.a(fVar.h().f8822h)) {
                        j10 = a9;
                        break;
                    }
                }
            }
        }
        j10 = com.anythink.basead.exoplayer.b.f6539b;
        this.f7755f = j10;
        if (a9 != j9) {
            if (a9 >= this.f7751b) {
                long j12 = this.f7752c;
                if (j12 != Long.MIN_VALUE) {
                }
            }
            z8 = false;
            C0544a.b(z8);
            for (int i4 = 0; i4 < yVarArr.length; i4++) {
                y yVar2 = yVarArr2[i4];
                if (yVar2 == null) {
                    this.f7754e[i4] = null;
                } else if (yVarArr[i4] == null || this.f7754e[i4].f7756a != yVar2) {
                    this.f7754e[i4] = new a(yVar2);
                }
                yVarArr[i4] = this.f7754e[i4];
            }
            return a9;
        }
        z8 = true;
        C0544a.b(z8);
        while (i4 < yVarArr.length) {
        }
        return a9;
    }

    private com.anythink.basead.exoplayer.ac b(long j9, com.anythink.basead.exoplayer.ac acVar) {
        long a9 = com.anythink.basead.exoplayer.k.af.a(acVar.f6473f, j9 - this.f7751b);
        long j10 = acVar.f6474g;
        long j11 = this.f7752c;
        long a10 = com.anythink.basead.exoplayer.k.af.a(j10, j11 == Long.MIN_VALUE ? Long.MAX_VALUE : j11 - j9);
        return (a9 == acVar.f6473f && a10 == acVar.f6474g) ? acVar : new com.anythink.basead.exoplayer.ac(a9, a10);
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final boolean c(long j9) {
        return this.f7750a.c(j9);
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final void a(long j9, boolean z8) {
        this.f7750a.a(j9, z8);
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long a(long j9, com.anythink.basead.exoplayer.ac acVar) {
        long j10 = this.f7751b;
        if (j9 == j10) {
            return j10;
        }
        long a9 = com.anythink.basead.exoplayer.k.af.a(acVar.f6473f, j9 - j10);
        long j11 = acVar.f6474g;
        long j12 = this.f7752c;
        long a10 = com.anythink.basead.exoplayer.k.af.a(j11, j12 == Long.MIN_VALUE ? Long.MAX_VALUE : j12 - j9);
        if (a9 != acVar.f6473f || a10 != acVar.f6474g) {
            acVar = new com.anythink.basead.exoplayer.ac(a9, a10);
        }
        return this.f7750a.a(j9, acVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.anythink.basead.exoplayer.h.r.a
    public final void a(r rVar) {
        this.f7753d.a((r) this);
    }

    private static boolean a(long j9, com.anythink.basead.exoplayer.i.f[] fVarArr) {
        if (j9 != 0) {
            for (com.anythink.basead.exoplayer.i.f fVar : fVarArr) {
                if (fVar != null && !com.anythink.basead.exoplayer.k.o.a(fVar.h().f8822h)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.anythink.basead.exoplayer.h.z.a
    public final /* bridge */ /* synthetic */ void a(r rVar) {
        this.f7753d.a((r.a) this);
    }
}

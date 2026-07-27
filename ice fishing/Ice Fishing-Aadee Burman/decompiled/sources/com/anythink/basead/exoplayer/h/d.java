package com.anythink.basead.exoplayer.h;

import com.anythink.basead.exoplayer.h.r;

/* loaded from: classes.dex */
public final class d implements r, r.a {

    /* renamed from: a, reason: collision with root package name */
    public final r f7593a;

    /* renamed from: b, reason: collision with root package name */
    long f7594b;

    /* renamed from: c, reason: collision with root package name */
    long f7595c;

    /* renamed from: d, reason: collision with root package name */
    private r.a f7596d;

    /* renamed from: e, reason: collision with root package name */
    private a[] f7597e = new a[0];

    /* renamed from: f, reason: collision with root package name */
    private long f7598f;

    public final class a implements y {

        /* renamed from: a, reason: collision with root package name */
        public final y f7599a;

        /* renamed from: c, reason: collision with root package name */
        private boolean f7601c;

        public a(y yVar) {
            this.f7599a = yVar;
        }

        public final void a() {
            this.f7601c = false;
        }

        @Override // com.anythink.basead.exoplayer.h.y
        public final boolean b() {
            return !d.this.f() && this.f7599a.b();
        }

        @Override // com.anythink.basead.exoplayer.h.y
        public final void c() {
            this.f7599a.c();
        }

        @Override // com.anythink.basead.exoplayer.h.y
        public final int a(com.anythink.basead.exoplayer.n nVar, com.anythink.basead.exoplayer.c.e eVar, boolean z3) {
            if (d.this.f()) {
                return -3;
            }
            if (this.f7601c) {
                eVar.a(4);
                return -4;
            }
            int a9 = this.f7599a.a(nVar, eVar, z3);
            if (a9 == -5) {
                com.anythink.basead.exoplayer.m mVar = nVar.f8683a;
                int i = mVar.f8680x;
                if (i != 0 || mVar.f8681y != 0) {
                    d dVar = d.this;
                    if (dVar.f7594b != 0) {
                        i = 0;
                    }
                    nVar.f8683a = mVar.a(i, dVar.f7595c == Long.MIN_VALUE ? mVar.f8681y : 0);
                }
                return -5;
            }
            d dVar2 = d.this;
            long j6 = dVar2.f7595c;
            if (j6 == Long.MIN_VALUE || ((a9 != -4 || eVar.f6743f < j6) && !(a9 == -3 && dVar2.d() == Long.MIN_VALUE))) {
                return a9;
            }
            eVar.a();
            eVar.a(4);
            this.f7601c = true;
            return -4;
        }

        @Override // com.anythink.basead.exoplayer.h.y
        public final int a(long j6) {
            if (d.this.f()) {
                return -3;
            }
            return this.f7599a.a(j6);
        }
    }

    public d(r rVar, boolean z3, long j6, long j9) {
        this.f7593a = rVar;
        this.f7598f = z3 ? j6 : com.anythink.basead.exoplayer.b.f6382b;
        this.f7594b = j6;
        this.f7595c = j9;
    }

    private void g() {
        this.f7596d.a((r.a) this);
    }

    public final void a(long j6, long j9) {
        this.f7594b = j6;
        this.f7595c = j9;
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final void a_(long j6) {
        this.f7593a.a_(j6);
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final af b() {
        return this.f7593a.b();
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long c() {
        if (f()) {
            long j6 = this.f7598f;
            this.f7598f = com.anythink.basead.exoplayer.b.f6382b;
            long c9 = c();
            return c9 != com.anythink.basead.exoplayer.b.f6382b ? c9 : j6;
        }
        long c10 = this.f7593a.c();
        if (c10 == com.anythink.basead.exoplayer.b.f6382b) {
            return com.anythink.basead.exoplayer.b.f6382b;
        }
        com.anythink.basead.exoplayer.k.a.b(c10 >= this.f7594b);
        long j9 = this.f7595c;
        com.anythink.basead.exoplayer.k.a.b(j9 == Long.MIN_VALUE || c10 <= j9);
        return c10;
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final long d() {
        long d2 = this.f7593a.d();
        if (d2 != Long.MIN_VALUE) {
            long j6 = this.f7595c;
            if (j6 == Long.MIN_VALUE || d2 < j6) {
                return d2;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final long e() {
        long e9 = this.f7593a.e();
        if (e9 != Long.MIN_VALUE) {
            long j6 = this.f7595c;
            if (j6 == Long.MIN_VALUE || e9 < j6) {
                return e9;
            }
        }
        return Long.MIN_VALUE;
    }

    public final boolean f() {
        return this.f7598f != com.anythink.basead.exoplayer.b.f6382b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r0 > r6) goto L17;
     */
    @Override // com.anythink.basead.exoplayer.h.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long b(long j6) {
        this.f7598f = com.anythink.basead.exoplayer.b.f6382b;
        boolean z3 = false;
        for (a aVar : this.f7597e) {
            if (aVar != null) {
                aVar.a();
            }
        }
        long b9 = this.f7593a.b(j6);
        if (b9 != j6) {
            if (b9 >= this.f7594b) {
                long j9 = this.f7595c;
                if (j9 != Long.MIN_VALUE) {
                }
            }
            com.anythink.basead.exoplayer.k.a.b(z3);
            return b9;
        }
        z3 = true;
        com.anythink.basead.exoplayer.k.a.b(z3);
        return b9;
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final void a(r.a aVar, long j6) {
        this.f7596d = aVar;
        this.f7593a.a(this, j6);
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final void a() {
        this.f7593a.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
    
        if (r10 > r2) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    @Override // com.anythink.basead.exoplayer.h.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(com.anythink.basead.exoplayer.i.f[] fVarArr, boolean[] zArr, y[] yVarArr, boolean[] zArr2, long j6) {
        long j9;
        boolean z3;
        this.f7597e = new a[yVarArr.length];
        y[] yVarArr2 = new y[yVarArr.length];
        int i = 0;
        while (true) {
            y yVar = null;
            if (i >= yVarArr.length) {
                break;
            }
            a[] aVarArr = this.f7597e;
            a aVar = (a) yVarArr[i];
            aVarArr[i] = aVar;
            if (aVar != null) {
                yVar = aVar.f7599a;
            }
            yVarArr2[i] = yVar;
            i++;
        }
        long a9 = this.f7593a.a(fVarArr, zArr, yVarArr2, zArr2, j6);
        if (f()) {
            long j10 = this.f7594b;
            if (j6 == j10 && j10 != 0) {
                for (com.anythink.basead.exoplayer.i.f fVar : fVarArr) {
                    if (fVar != null && !com.anythink.basead.exoplayer.k.o.a(fVar.h().f8665h)) {
                        j9 = a9;
                        break;
                    }
                }
            }
        }
        j9 = com.anythink.basead.exoplayer.b.f6382b;
        this.f7598f = j9;
        if (a9 != j6) {
            if (a9 >= this.f7594b) {
                long j11 = this.f7595c;
                if (j11 != Long.MIN_VALUE) {
                }
            }
            z3 = false;
            com.anythink.basead.exoplayer.k.a.b(z3);
            for (int i6 = 0; i6 < yVarArr.length; i6++) {
                y yVar2 = yVarArr2[i6];
                if (yVar2 == null) {
                    this.f7597e[i6] = null;
                } else if (yVarArr[i6] == null || this.f7597e[i6].f7599a != yVar2) {
                    this.f7597e[i6] = new a(yVar2);
                }
                yVarArr[i6] = this.f7597e[i6];
            }
            return a9;
        }
        z3 = true;
        com.anythink.basead.exoplayer.k.a.b(z3);
        while (i6 < yVarArr.length) {
        }
        return a9;
    }

    private com.anythink.basead.exoplayer.ac b(long j6, com.anythink.basead.exoplayer.ac acVar) {
        long a9 = com.anythink.basead.exoplayer.k.af.a(acVar.f6316f, j6 - this.f7594b);
        long j9 = acVar.f6317g;
        long j10 = this.f7595c;
        long a10 = com.anythink.basead.exoplayer.k.af.a(j9, j10 == Long.MIN_VALUE ? Long.MAX_VALUE : j10 - j6);
        return (a9 == acVar.f6316f && a10 == acVar.f6317g) ? acVar : new com.anythink.basead.exoplayer.ac(a9, a10);
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final boolean c(long j6) {
        return this.f7593a.c(j6);
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final void a(long j6, boolean z3) {
        this.f7593a.a(j6, z3);
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long a(long j6, com.anythink.basead.exoplayer.ac acVar) {
        long j9 = this.f7594b;
        if (j6 == j9) {
            return j9;
        }
        long a9 = com.anythink.basead.exoplayer.k.af.a(acVar.f6316f, j6 - j9);
        long j10 = acVar.f6317g;
        long j11 = this.f7595c;
        long a10 = com.anythink.basead.exoplayer.k.af.a(j10, j11 == Long.MIN_VALUE ? Long.MAX_VALUE : j11 - j6);
        if (a9 != acVar.f6316f || a10 != acVar.f6317g) {
            acVar = new com.anythink.basead.exoplayer.ac(a9, a10);
        }
        return this.f7593a.a(j6, acVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.anythink.basead.exoplayer.h.r.a
    public final void a(r rVar) {
        this.f7596d.a((r) this);
    }

    private static boolean a(long j6, com.anythink.basead.exoplayer.i.f[] fVarArr) {
        if (j6 != 0) {
            for (com.anythink.basead.exoplayer.i.f fVar : fVarArr) {
                if (fVar != null && !com.anythink.basead.exoplayer.k.o.a(fVar.h().f8665h)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.anythink.basead.exoplayer.h.z.a
    public final /* bridge */ /* synthetic */ void a(r rVar) {
        this.f7596d.a((r.a) this);
    }
}

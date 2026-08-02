package com.anythink.basead.exoplayer.h;

import com.anythink.basead.exoplayer.h.r;

/* loaded from: classes.dex */
public final class d implements r, r.a {

    /* renamed from: a, reason: collision with root package name */
    public final r f8379a;

    /* renamed from: b, reason: collision with root package name */
    long f8380b;

    /* renamed from: c, reason: collision with root package name */
    long f8381c;

    /* renamed from: d, reason: collision with root package name */
    private r.a f8382d;

    /* renamed from: e, reason: collision with root package name */
    private a[] f8383e = new a[0];

    /* renamed from: f, reason: collision with root package name */
    private long f8384f;

    public final class a implements y {

        /* renamed from: a, reason: collision with root package name */
        public final y f8385a;

        /* renamed from: c, reason: collision with root package name */
        private boolean f8387c;

        public a(y yVar) {
            this.f8385a = yVar;
        }

        public final void a() {
            this.f8387c = false;
        }

        @Override // com.anythink.basead.exoplayer.h.y
        public final boolean b() {
            return !d.this.f() && this.f8385a.b();
        }

        @Override // com.anythink.basead.exoplayer.h.y
        public final void c() {
            this.f8385a.c();
        }

        @Override // com.anythink.basead.exoplayer.h.y
        public final int a(com.anythink.basead.exoplayer.n nVar, com.anythink.basead.exoplayer.c.e eVar, boolean z6) {
            if (d.this.f()) {
                return -3;
            }
            if (this.f8387c) {
                eVar.a(4);
                return -4;
            }
            int a9 = this.f8385a.a(nVar, eVar, z6);
            if (a9 == -5) {
                com.anythink.basead.exoplayer.m mVar = nVar.f9469a;
                int i = mVar.f9466x;
                if (i != 0 || mVar.f9467y != 0) {
                    d dVar = d.this;
                    if (dVar.f8380b != 0) {
                        i = 0;
                    }
                    nVar.f9469a = mVar.a(i, dVar.f8381c == Long.MIN_VALUE ? mVar.f9467y : 0);
                }
                return -5;
            }
            d dVar2 = d.this;
            long j6 = dVar2.f8381c;
            if (j6 == Long.MIN_VALUE || ((a9 != -4 || eVar.f7529f < j6) && !(a9 == -3 && dVar2.d() == Long.MIN_VALUE))) {
                return a9;
            }
            eVar.a();
            eVar.a(4);
            this.f8387c = true;
            return -4;
        }

        @Override // com.anythink.basead.exoplayer.h.y
        public final int a(long j6) {
            if (d.this.f()) {
                return -3;
            }
            return this.f8385a.a(j6);
        }
    }

    public d(r rVar, boolean z6, long j6, long j9) {
        this.f8379a = rVar;
        this.f8384f = z6 ? j6 : com.anythink.basead.exoplayer.b.f7168b;
        this.f8380b = j6;
        this.f8381c = j9;
    }

    private void g() {
        this.f8382d.a((r.a) this);
    }

    public final void a(long j6, long j9) {
        this.f8380b = j6;
        this.f8381c = j9;
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final void a_(long j6) {
        this.f8379a.a_(j6);
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final af b() {
        return this.f8379a.b();
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long c() {
        if (f()) {
            long j6 = this.f8384f;
            this.f8384f = com.anythink.basead.exoplayer.b.f7168b;
            long c9 = c();
            return c9 != com.anythink.basead.exoplayer.b.f7168b ? c9 : j6;
        }
        long c10 = this.f8379a.c();
        if (c10 == com.anythink.basead.exoplayer.b.f7168b) {
            return com.anythink.basead.exoplayer.b.f7168b;
        }
        com.anythink.basead.exoplayer.k.a.b(c10 >= this.f8380b);
        long j9 = this.f8381c;
        com.anythink.basead.exoplayer.k.a.b(j9 == Long.MIN_VALUE || c10 <= j9);
        return c10;
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final long d() {
        long d9 = this.f8379a.d();
        if (d9 != Long.MIN_VALUE) {
            long j6 = this.f8381c;
            if (j6 == Long.MIN_VALUE || d9 < j6) {
                return d9;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final long e() {
        long e9 = this.f8379a.e();
        if (e9 != Long.MIN_VALUE) {
            long j6 = this.f8381c;
            if (j6 == Long.MIN_VALUE || e9 < j6) {
                return e9;
            }
        }
        return Long.MIN_VALUE;
    }

    public final boolean f() {
        return this.f8384f != com.anythink.basead.exoplayer.b.f7168b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r0 > r6) goto L17;
     */
    @Override // com.anythink.basead.exoplayer.h.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long b(long j6) {
        this.f8384f = com.anythink.basead.exoplayer.b.f7168b;
        boolean z6 = false;
        for (a aVar : this.f8383e) {
            if (aVar != null) {
                aVar.a();
            }
        }
        long b9 = this.f8379a.b(j6);
        if (b9 != j6) {
            if (b9 >= this.f8380b) {
                long j9 = this.f8381c;
                if (j9 != Long.MIN_VALUE) {
                }
            }
            com.anythink.basead.exoplayer.k.a.b(z6);
            return b9;
        }
        z6 = true;
        com.anythink.basead.exoplayer.k.a.b(z6);
        return b9;
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final void a(r.a aVar, long j6) {
        this.f8382d = aVar;
        this.f8379a.a(this, j6);
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final void a() {
        this.f8379a.a();
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
        boolean z6;
        this.f8383e = new a[yVarArr.length];
        y[] yVarArr2 = new y[yVarArr.length];
        int i = 0;
        while (true) {
            y yVar = null;
            if (i >= yVarArr.length) {
                break;
            }
            a[] aVarArr = this.f8383e;
            a aVar = (a) yVarArr[i];
            aVarArr[i] = aVar;
            if (aVar != null) {
                yVar = aVar.f8385a;
            }
            yVarArr2[i] = yVar;
            i++;
        }
        long a9 = this.f8379a.a(fVarArr, zArr, yVarArr2, zArr2, j6);
        if (f()) {
            long j10 = this.f8380b;
            if (j6 == j10 && j10 != 0) {
                for (com.anythink.basead.exoplayer.i.f fVar : fVarArr) {
                    if (fVar != null && !com.anythink.basead.exoplayer.k.o.a(fVar.h().f9451h)) {
                        j9 = a9;
                        break;
                    }
                }
            }
        }
        j9 = com.anythink.basead.exoplayer.b.f7168b;
        this.f8384f = j9;
        if (a9 != j6) {
            if (a9 >= this.f8380b) {
                long j11 = this.f8381c;
                if (j11 != Long.MIN_VALUE) {
                }
            }
            z6 = false;
            com.anythink.basead.exoplayer.k.a.b(z6);
            for (int i4 = 0; i4 < yVarArr.length; i4++) {
                y yVar2 = yVarArr2[i4];
                if (yVar2 == null) {
                    this.f8383e[i4] = null;
                } else if (yVarArr[i4] == null || this.f8383e[i4].f8385a != yVar2) {
                    this.f8383e[i4] = new a(yVar2);
                }
                yVarArr[i4] = this.f8383e[i4];
            }
            return a9;
        }
        z6 = true;
        com.anythink.basead.exoplayer.k.a.b(z6);
        while (i4 < yVarArr.length) {
        }
        return a9;
    }

    private com.anythink.basead.exoplayer.ac b(long j6, com.anythink.basead.exoplayer.ac acVar) {
        long a9 = com.anythink.basead.exoplayer.k.af.a(acVar.f7102f, j6 - this.f8380b);
        long j9 = acVar.f7103g;
        long j10 = this.f8381c;
        long a10 = com.anythink.basead.exoplayer.k.af.a(j9, j10 == Long.MIN_VALUE ? Long.MAX_VALUE : j10 - j6);
        return (a9 == acVar.f7102f && a10 == acVar.f7103g) ? acVar : new com.anythink.basead.exoplayer.ac(a9, a10);
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final boolean c(long j6) {
        return this.f8379a.c(j6);
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final void a(long j6, boolean z6) {
        this.f8379a.a(j6, z6);
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long a(long j6, com.anythink.basead.exoplayer.ac acVar) {
        long j9 = this.f8380b;
        if (j6 == j9) {
            return j9;
        }
        long a9 = com.anythink.basead.exoplayer.k.af.a(acVar.f7102f, j6 - j9);
        long j10 = acVar.f7103g;
        long j11 = this.f8381c;
        long a10 = com.anythink.basead.exoplayer.k.af.a(j10, j11 == Long.MIN_VALUE ? Long.MAX_VALUE : j11 - j6);
        if (a9 != acVar.f7102f || a10 != acVar.f7103g) {
            acVar = new com.anythink.basead.exoplayer.ac(a9, a10);
        }
        return this.f8379a.a(j6, acVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.anythink.basead.exoplayer.h.r.a
    public final void a(r rVar) {
        this.f8382d.a((r) this);
    }

    private static boolean a(long j6, com.anythink.basead.exoplayer.i.f[] fVarArr) {
        if (j6 != 0) {
            for (com.anythink.basead.exoplayer.i.f fVar : fVarArr) {
                if (fVar != null && !com.anythink.basead.exoplayer.k.o.a(fVar.h().f9451h)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.anythink.basead.exoplayer.h.z.a
    public final /* bridge */ /* synthetic */ void a(r rVar) {
        this.f8382d.a((r.a) this);
    }
}

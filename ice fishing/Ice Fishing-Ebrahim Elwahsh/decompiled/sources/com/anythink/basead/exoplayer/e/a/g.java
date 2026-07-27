package com.anythink.basead.exoplayer.e.a;

import com.anythink.basead.exoplayer.e.a.a;
import com.anythink.basead.exoplayer.e.a.b;
import com.anythink.basead.exoplayer.e.k;
import com.anythink.basead.exoplayer.k.C0544a;
import com.anythink.basead.exoplayer.k.af;
import com.anythink.basead.exoplayer.k.p;
import com.anythink.basead.exoplayer.k.s;
import com.anythink.basead.exoplayer.t;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g implements com.anythink.basead.exoplayer.e.e, com.anythink.basead.exoplayer.e.k {

    /* renamed from: e, reason: collision with root package name */
    public static final int f7232e = 1;

    /* renamed from: f, reason: collision with root package name */
    private static final int f7233f = 0;

    /* renamed from: g, reason: collision with root package name */
    private static final int f7234g = 1;

    /* renamed from: h, reason: collision with root package name */
    private static final int f7235h = 2;

    /* renamed from: j, reason: collision with root package name */
    private static final long f7236j = 262144;

    /* renamed from: k, reason: collision with root package name */
    private static final long f7237k = 10485760;

    /* renamed from: A, reason: collision with root package name */
    private long[][] f7238A;

    /* renamed from: B, reason: collision with root package name */
    private int f7239B;

    /* renamed from: C, reason: collision with root package name */
    private long f7240C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f7241D;

    /* renamed from: l, reason: collision with root package name */
    private final int f7242l;

    /* renamed from: m, reason: collision with root package name */
    private final s f7243m;

    /* renamed from: n, reason: collision with root package name */
    private final s f7244n;

    /* renamed from: o, reason: collision with root package name */
    private final s f7245o;

    /* renamed from: p, reason: collision with root package name */
    private final ArrayDeque<a.C0020a> f7246p;

    /* renamed from: q, reason: collision with root package name */
    private int f7247q;

    /* renamed from: r, reason: collision with root package name */
    private int f7248r;

    /* renamed from: s, reason: collision with root package name */
    private long f7249s;

    /* renamed from: t, reason: collision with root package name */
    private int f7250t;

    /* renamed from: u, reason: collision with root package name */
    private s f7251u;

    /* renamed from: v, reason: collision with root package name */
    private int f7252v;

    /* renamed from: w, reason: collision with root package name */
    private int f7253w;

    /* renamed from: x, reason: collision with root package name */
    private int f7254x;

    /* renamed from: y, reason: collision with root package name */
    private com.anythink.basead.exoplayer.e.g f7255y;

    /* renamed from: z, reason: collision with root package name */
    private b[] f7256z;

    /* renamed from: d, reason: collision with root package name */
    public static final com.anythink.basead.exoplayer.e.h f7231d = new com.anythink.basead.exoplayer.e.h() { // from class: com.anythink.basead.exoplayer.e.a.g.1
        @Override // com.anythink.basead.exoplayer.e.h
        public final com.anythink.basead.exoplayer.e.e[] a() {
            return new com.anythink.basead.exoplayer.e.e[]{new g()};
        }
    };
    private static final int i = af.f("qt  ");

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final j f7257a;

        /* renamed from: b, reason: collision with root package name */
        public final m f7258b;

        /* renamed from: c, reason: collision with root package name */
        public final com.anythink.basead.exoplayer.e.m f7259c;

        /* renamed from: d, reason: collision with root package name */
        public int f7260d;

        public b(j jVar, m mVar, com.anythink.basead.exoplayer.e.m mVar2) {
            this.f7257a = jVar;
            this.f7258b = mVar;
            this.f7259c = mVar2;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public g() {
        this(0);
    }

    private void d() {
        this.f7247q = 0;
        this.f7250t = 0;
    }

    @Override // com.anythink.basead.exoplayer.e.k
    public final boolean a() {
        return true;
    }

    @Override // com.anythink.basead.exoplayer.e.k
    public final long b() {
        return this.f7240C;
    }

    @Override // com.anythink.basead.exoplayer.e.e
    public final void c() {
    }

    public g(int i4) {
        this.f7242l = i4;
        this.f7245o = new s(16);
        this.f7246p = new ArrayDeque<>();
        this.f7243m = new s(p.f8629a);
        this.f7244n = new s(4);
        this.f7252v = -1;
    }

    private boolean b(com.anythink.basead.exoplayer.e.f fVar) {
        if (this.f7250t == 0) {
            if (!fVar.a(this.f7245o.f8659a, 0, 8, true)) {
                return false;
            }
            this.f7250t = 8;
            this.f7245o.c(0);
            this.f7249s = this.f7245o.h();
            this.f7248r = this.f7245o.i();
        }
        long j9 = this.f7249s;
        if (j9 == 1) {
            fVar.b(this.f7245o.f8659a, 8, 8);
            this.f7250t += 8;
            this.f7249s = this.f7245o.n();
        } else if (j9 == 0) {
            long d2 = fVar.d();
            if (d2 == -1 && !this.f7246p.isEmpty()) {
                d2 = this.f7246p.peek().aV;
            }
            if (d2 != -1) {
                this.f7249s = (d2 - fVar.c()) + this.f7250t;
            }
        }
        long j10 = this.f7249s;
        int i4 = this.f7250t;
        if (j10 < i4) {
            throw new t("Atom size less than header length (unsupported).");
        }
        int i9 = this.f7248r;
        if (i9 == com.anythink.basead.exoplayer.e.a.a.f7058G || i9 == com.anythink.basead.exoplayer.e.a.a.f7060I || i9 == com.anythink.basead.exoplayer.e.a.a.J || i9 == com.anythink.basead.exoplayer.e.a.a.f7061K || i9 == com.anythink.basead.exoplayer.e.a.a.f7062L || i9 == com.anythink.basead.exoplayer.e.a.a.f7071U) {
            long c4 = (fVar.c() + this.f7249s) - this.f7250t;
            this.f7246p.push(new a.C0020a(this.f7248r, c4));
            if (this.f7249s == this.f7250t) {
                b(c4);
            } else {
                d();
            }
        } else if (i9 == com.anythink.basead.exoplayer.e.a.a.f7073W || i9 == com.anythink.basead.exoplayer.e.a.a.f7059H || i9 == com.anythink.basead.exoplayer.e.a.a.f7074X || i9 == com.anythink.basead.exoplayer.e.a.a.Y || i9 == com.anythink.basead.exoplayer.e.a.a.ar || i9 == com.anythink.basead.exoplayer.e.a.a.as || i9 == com.anythink.basead.exoplayer.e.a.a.at || i9 == com.anythink.basead.exoplayer.e.a.a.f7072V || i9 == com.anythink.basead.exoplayer.e.a.a.au || i9 == com.anythink.basead.exoplayer.e.a.a.av || i9 == com.anythink.basead.exoplayer.e.a.a.aw || i9 == com.anythink.basead.exoplayer.e.a.a.ax || i9 == com.anythink.basead.exoplayer.e.a.a.ay || i9 == com.anythink.basead.exoplayer.e.a.a.f7070T || i9 == com.anythink.basead.exoplayer.e.a.a.f7081f || i9 == com.anythink.basead.exoplayer.e.a.a.aF) {
            C0544a.b(i4 == 8);
            C0544a.b(this.f7249s <= 2147483647L);
            s sVar = new s((int) this.f7249s);
            this.f7251u = sVar;
            System.arraycopy(this.f7245o.f8659a, 0, sVar.f8659a, 0, 8);
            this.f7247q = 1;
        } else {
            this.f7251u = null;
            this.f7247q = 1;
        }
        return true;
    }

    private int c(com.anythink.basead.exoplayer.e.f fVar, com.anythink.basead.exoplayer.e.j jVar) {
        long j9;
        long j10;
        long c4 = fVar.c();
        if (this.f7252v == -1) {
            boolean z8 = true;
            boolean z9 = true;
            int i4 = 0;
            int i9 = -1;
            int i10 = -1;
            long j11 = Long.MAX_VALUE;
            long j12 = Long.MAX_VALUE;
            long j13 = Long.MAX_VALUE;
            j9 = f7236j;
            while (true) {
                b[] bVarArr = this.f7256z;
                j10 = 0;
                if (i4 >= bVarArr.length) {
                    break;
                }
                b bVar = bVarArr[i4];
                int i11 = bVar.f7260d;
                m mVar = bVar.f7258b;
                if (i11 != mVar.f7304b) {
                    long j14 = mVar.f7305c[i11];
                    long j15 = this.f7238A[i4][i11];
                    long j16 = j14 - c4;
                    boolean z10 = j16 < 0 || j16 >= f7236j;
                    if ((!z10 && z8) || (z10 == z8 && j16 < j13)) {
                        i10 = i4;
                        z8 = z10;
                        j12 = j15;
                        j13 = j16;
                    }
                    if (j15 < j11) {
                        i9 = i4;
                        z9 = z10;
                        j11 = j15;
                    }
                }
                i4++;
            }
            int i12 = (j11 == Long.MAX_VALUE || !z9 || j12 < j11 + f7237k) ? i10 : i9;
            this.f7252v = i12;
            if (i12 == -1) {
                return -1;
            }
        } else {
            j9 = f7236j;
            j10 = 0;
        }
        b bVar2 = this.f7256z[this.f7252v];
        com.anythink.basead.exoplayer.e.m mVar2 = bVar2.f7259c;
        int i13 = bVar2.f7260d;
        m mVar3 = bVar2.f7258b;
        long j17 = mVar3.f7305c[i13];
        int i14 = mVar3.f7306d[i13];
        long j18 = (j17 - c4) + this.f7253w;
        if (j18 < j10 || j18 >= j9) {
            jVar.f7332a = j17;
            return 1;
        }
        if (bVar2.f7257a.i == 1) {
            j18 += 8;
            i14 -= 8;
        }
        fVar.c((int) j18);
        int i15 = bVar2.f7257a.f7277l;
        if (i15 == 0) {
            while (true) {
                int i16 = this.f7253w;
                if (i16 >= i14) {
                    break;
                }
                int a9 = mVar2.a(fVar, i14 - i16, false);
                this.f7253w += a9;
                this.f7254x -= a9;
            }
        } else {
            byte[] bArr = this.f7244n.f8659a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i17 = 4 - i15;
            while (this.f7253w < i14) {
                int i18 = this.f7254x;
                if (i18 == 0) {
                    fVar.b(this.f7244n.f8659a, i17, i15);
                    this.f7244n.c(0);
                    this.f7254x = this.f7244n.m();
                    this.f7243m.c(0);
                    mVar2.a(this.f7243m, 4);
                    this.f7253w += 4;
                    i14 += i17;
                } else {
                    int a10 = mVar2.a(fVar, i18, false);
                    this.f7253w += a10;
                    this.f7254x -= a10;
                }
            }
        }
        int i19 = i14;
        m mVar4 = bVar2.f7258b;
        mVar2.a(mVar4.f7308f[i13], mVar4.f7309g[i13], i19, 0, null);
        bVar2.f7260d++;
        this.f7252v = -1;
        this.f7253w = 0;
        this.f7254x = 0;
        return 0;
    }

    @Override // com.anythink.basead.exoplayer.e.e
    public final boolean a(com.anythink.basead.exoplayer.e.f fVar) {
        return i.b(fVar);
    }

    private void d(long j9) {
        for (b bVar : this.f7256z) {
            m mVar = bVar.f7258b;
            int a9 = mVar.a(j9);
            if (a9 == -1) {
                a9 = mVar.b(j9);
            }
            bVar.f7260d = a9;
        }
    }

    @Override // com.anythink.basead.exoplayer.e.e
    public final void a(com.anythink.basead.exoplayer.e.g gVar) {
        this.f7255y = gVar;
    }

    @Override // com.anythink.basead.exoplayer.e.e
    public final void a(long j9, long j10) {
        this.f7246p.clear();
        this.f7250t = 0;
        this.f7252v = -1;
        this.f7253w = 0;
        this.f7254x = 0;
        if (j9 == 0) {
            d();
            return;
        }
        b[] bVarArr = this.f7256z;
        if (bVarArr != null) {
            for (b bVar : bVarArr) {
                m mVar = bVar.f7258b;
                int a9 = mVar.a(j10);
                if (a9 == -1) {
                    a9 = mVar.b(j10);
                }
                bVar.f7260d = a9;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x02c4, code lost:
    
        r3 = true;
     */
    @Override // com.anythink.basead.exoplayer.e.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(com.anythink.basead.exoplayer.e.f fVar, com.anythink.basead.exoplayer.e.j jVar) {
        long j9;
        long j10;
        boolean z8;
        while (true) {
            int i4 = this.f7247q;
            boolean z9 = false;
            if (i4 == 0) {
                if (this.f7250t == 0) {
                    if (!fVar.a(this.f7245o.f8659a, 0, 8, true)) {
                        return -1;
                    }
                    this.f7250t = 8;
                    this.f7245o.c(0);
                    this.f7249s = this.f7245o.h();
                    this.f7248r = this.f7245o.i();
                }
                long j11 = this.f7249s;
                if (j11 == 1) {
                    fVar.b(this.f7245o.f8659a, 8, 8);
                    this.f7250t += 8;
                    this.f7249s = this.f7245o.n();
                } else if (j11 == 0) {
                    long d2 = fVar.d();
                    if (d2 == -1 && !this.f7246p.isEmpty()) {
                        d2 = this.f7246p.peek().aV;
                    }
                    if (d2 != -1) {
                        this.f7249s = (d2 - fVar.c()) + this.f7250t;
                    }
                }
                long j12 = this.f7249s;
                int i9 = this.f7250t;
                if (j12 >= i9) {
                    int i10 = this.f7248r;
                    if (i10 != com.anythink.basead.exoplayer.e.a.a.f7058G && i10 != com.anythink.basead.exoplayer.e.a.a.f7060I && i10 != com.anythink.basead.exoplayer.e.a.a.J && i10 != com.anythink.basead.exoplayer.e.a.a.f7061K && i10 != com.anythink.basead.exoplayer.e.a.a.f7062L && i10 != com.anythink.basead.exoplayer.e.a.a.f7071U) {
                        if (i10 != com.anythink.basead.exoplayer.e.a.a.f7073W && i10 != com.anythink.basead.exoplayer.e.a.a.f7059H && i10 != com.anythink.basead.exoplayer.e.a.a.f7074X && i10 != com.anythink.basead.exoplayer.e.a.a.Y && i10 != com.anythink.basead.exoplayer.e.a.a.ar && i10 != com.anythink.basead.exoplayer.e.a.a.as && i10 != com.anythink.basead.exoplayer.e.a.a.at && i10 != com.anythink.basead.exoplayer.e.a.a.f7072V && i10 != com.anythink.basead.exoplayer.e.a.a.au && i10 != com.anythink.basead.exoplayer.e.a.a.av && i10 != com.anythink.basead.exoplayer.e.a.a.aw && i10 != com.anythink.basead.exoplayer.e.a.a.ax && i10 != com.anythink.basead.exoplayer.e.a.a.ay && i10 != com.anythink.basead.exoplayer.e.a.a.f7070T && i10 != com.anythink.basead.exoplayer.e.a.a.f7081f && i10 != com.anythink.basead.exoplayer.e.a.a.aF) {
                            this.f7251u = null;
                            this.f7247q = 1;
                        } else {
                            boolean z10 = false;
                            C0544a.b(z10);
                            C0544a.b(this.f7249s <= 2147483647L);
                            s sVar = new s((int) this.f7249s);
                            this.f7251u = sVar;
                            System.arraycopy(this.f7245o.f8659a, 0, sVar.f8659a, 0, 8);
                            this.f7247q = 1;
                        }
                    } else {
                        long c4 = (fVar.c() + this.f7249s) - this.f7250t;
                        this.f7246p.push(new a.C0020a(this.f7248r, c4));
                        if (this.f7249s == this.f7250t) {
                            b(c4);
                        } else {
                            d();
                        }
                    }
                } else {
                    throw new t("Atom size less than header length (unsupported).");
                }
            } else {
                if (i4 != 1) {
                    if (i4 == 2) {
                        long c9 = fVar.c();
                        if (this.f7252v == -1) {
                            int i11 = -1;
                            int i12 = -1;
                            boolean z11 = true;
                            boolean z12 = true;
                            int i13 = 0;
                            long j13 = Long.MAX_VALUE;
                            long j14 = Long.MAX_VALUE;
                            long j15 = Long.MAX_VALUE;
                            j9 = 0;
                            while (true) {
                                b[] bVarArr = this.f7256z;
                                j10 = f7236j;
                                if (i13 >= bVarArr.length) {
                                    break;
                                }
                                b bVar = bVarArr[i13];
                                int i14 = bVar.f7260d;
                                m mVar = bVar.f7258b;
                                if (i14 != mVar.f7304b) {
                                    long j16 = mVar.f7305c[i14];
                                    long j17 = this.f7238A[i13][i14];
                                    long j18 = j16 - c9;
                                    boolean z13 = j18 < 0 || j18 >= f7236j;
                                    if ((!z13 && z11) || (z13 == z11 && j18 < j15)) {
                                        i12 = i13;
                                        z11 = z13;
                                        j14 = j17;
                                        j15 = j18;
                                    }
                                    if (j17 < j13) {
                                        i11 = i13;
                                        z12 = z13;
                                        j13 = j17;
                                    }
                                }
                                i13++;
                            }
                            int i15 = (j13 == Long.MAX_VALUE || !z12 || j14 < j13 + f7237k) ? i12 : i11;
                            this.f7252v = i15;
                            if (i15 == -1) {
                                return -1;
                            }
                        } else {
                            j9 = 0;
                            j10 = f7236j;
                        }
                        b bVar2 = this.f7256z[this.f7252v];
                        com.anythink.basead.exoplayer.e.m mVar2 = bVar2.f7259c;
                        int i16 = bVar2.f7260d;
                        m mVar3 = bVar2.f7258b;
                        long j19 = mVar3.f7305c[i16];
                        int i17 = mVar3.f7306d[i16];
                        long j20 = (j19 - c9) + this.f7253w;
                        if (j20 >= j9 && j20 < j10) {
                            if (bVar2.f7257a.i == 1) {
                                j20 += 8;
                                i17 -= 8;
                            }
                            fVar.c((int) j20);
                            int i18 = bVar2.f7257a.f7277l;
                            if (i18 == 0) {
                                while (true) {
                                    int i19 = this.f7253w;
                                    if (i19 >= i17) {
                                        break;
                                    }
                                    int a9 = mVar2.a(fVar, i17 - i19, false);
                                    this.f7253w += a9;
                                    this.f7254x -= a9;
                                }
                            } else {
                                byte[] bArr = this.f7244n.f8659a;
                                bArr[0] = 0;
                                bArr[1] = 0;
                                bArr[2] = 0;
                                int i20 = 4 - i18;
                                while (this.f7253w < i17) {
                                    int i21 = this.f7254x;
                                    if (i21 == 0) {
                                        fVar.b(this.f7244n.f8659a, i20, i18);
                                        this.f7244n.c(0);
                                        this.f7254x = this.f7244n.m();
                                        this.f7243m.c(0);
                                        mVar2.a(this.f7243m, 4);
                                        this.f7253w += 4;
                                        i17 += i20;
                                    } else {
                                        int a10 = mVar2.a(fVar, i21, false);
                                        this.f7253w += a10;
                                        this.f7254x -= a10;
                                    }
                                }
                            }
                            int i22 = i17;
                            m mVar4 = bVar2.f7258b;
                            mVar2.a(mVar4.f7308f[i16], mVar4.f7309g[i16], i22, 0, null);
                            bVar2.f7260d++;
                            this.f7252v = -1;
                            this.f7253w = 0;
                            this.f7254x = 0;
                            return 0;
                        }
                        jVar.f7332a = j19;
                        return 1;
                    }
                    throw new IllegalStateException();
                }
                long j21 = this.f7249s - this.f7250t;
                long c10 = fVar.c() + j21;
                s sVar2 = this.f7251u;
                if (sVar2 != null) {
                    fVar.b(sVar2.f8659a, this.f7250t, (int) j21);
                    if (this.f7248r == com.anythink.basead.exoplayer.e.a.a.f7081f) {
                        s sVar3 = this.f7251u;
                        sVar3.c(8);
                        if (sVar3.i() != i) {
                            sVar3.d(4);
                            while (sVar3.a() > 0) {
                                if (sVar3.i() == i) {
                                }
                            }
                            z8 = false;
                            this.f7241D = z8;
                        }
                        z8 = true;
                        this.f7241D = z8;
                    } else if (!this.f7246p.isEmpty()) {
                        this.f7246p.peek().a(new a.b(this.f7248r, this.f7251u));
                    }
                } else if (j21 < f7236j) {
                    fVar.c((int) j21);
                } else {
                    jVar.f7332a = fVar.c() + j21;
                    z9 = true;
                }
                b(c10);
                if (z9 && this.f7247q != 2) {
                    return 1;
                }
            }
        }
    }

    private boolean b(com.anythink.basead.exoplayer.e.f fVar, com.anythink.basead.exoplayer.e.j jVar) {
        boolean z8;
        boolean z9;
        long j9 = this.f7249s - this.f7250t;
        long c4 = fVar.c() + j9;
        s sVar = this.f7251u;
        if (sVar != null) {
            fVar.b(sVar.f8659a, this.f7250t, (int) j9);
            if (this.f7248r == com.anythink.basead.exoplayer.e.a.a.f7081f) {
                s sVar2 = this.f7251u;
                sVar2.c(8);
                if (sVar2.i() != i) {
                    sVar2.d(4);
                    while (sVar2.a() > 0) {
                        if (sVar2.i() == i) {
                        }
                    }
                    z9 = false;
                    this.f7241D = z9;
                }
                z9 = true;
                this.f7241D = z9;
            } else if (!this.f7246p.isEmpty()) {
                this.f7246p.peek().a(new a.b(this.f7248r, this.f7251u));
            }
        } else if (j9 < f7236j) {
            fVar.c((int) j9);
        } else {
            jVar.f7332a = fVar.c() + j9;
            z8 = true;
            b(c4);
            return (z8 || this.f7247q == 2) ? false : true;
        }
        z8 = false;
        b(c4);
        if (z8) {
        }
    }

    private int c(long j9) {
        int i4 = -1;
        int i9 = -1;
        int i10 = 0;
        long j10 = Long.MAX_VALUE;
        boolean z8 = true;
        long j11 = Long.MAX_VALUE;
        boolean z9 = true;
        long j12 = Long.MAX_VALUE;
        while (true) {
            b[] bVarArr = this.f7256z;
            if (i10 >= bVarArr.length) {
                break;
            }
            b bVar = bVarArr[i10];
            int i11 = bVar.f7260d;
            m mVar = bVar.f7258b;
            if (i11 != mVar.f7304b) {
                long j13 = mVar.f7305c[i11];
                long j14 = this.f7238A[i10][i11];
                long j15 = j13 - j9;
                boolean z10 = j15 < 0 || j15 >= f7236j;
                if ((!z10 && z9) || (z10 == z9 && j15 < j12)) {
                    z9 = z10;
                    j11 = j14;
                    i9 = i10;
                    j12 = j15;
                }
                if (j14 < j10) {
                    z8 = z10;
                    j10 = j14;
                    i4 = i10;
                }
            }
            i10++;
        }
        return (j10 == Long.MAX_VALUE || !z8 || j11 < j10 + f7237k) ? i9 : i4;
    }

    private void b(long j9) {
        while (!this.f7246p.isEmpty() && this.f7246p.peek().aV == j9) {
            a.C0020a pop = this.f7246p.pop();
            if (pop.aU == com.anythink.basead.exoplayer.e.a.a.f7058G) {
                a(pop);
                this.f7246p.clear();
                this.f7247q = 2;
            } else if (!this.f7246p.isEmpty()) {
                this.f7246p.peek().a(pop);
            }
        }
        if (this.f7247q != 2) {
            d();
        }
    }

    private static boolean b(int i4) {
        return i4 == com.anythink.basead.exoplayer.e.a.a.f7058G || i4 == com.anythink.basead.exoplayer.e.a.a.f7060I || i4 == com.anythink.basead.exoplayer.e.a.a.J || i4 == com.anythink.basead.exoplayer.e.a.a.f7061K || i4 == com.anythink.basead.exoplayer.e.a.a.f7062L || i4 == com.anythink.basead.exoplayer.e.a.a.f7071U;
    }

    @Override // com.anythink.basead.exoplayer.e.k
    public final k.a a(long j9) {
        long j10;
        long j11;
        int b9;
        b[] bVarArr = this.f7256z;
        if (bVarArr.length == 0) {
            return new k.a(com.anythink.basead.exoplayer.e.l.f7337a);
        }
        int i4 = this.f7239B;
        long j12 = -1;
        if (i4 != -1) {
            m mVar = bVarArr[i4].f7258b;
            int a9 = a(mVar, j9);
            if (a9 == -1) {
                return new k.a(com.anythink.basead.exoplayer.e.l.f7337a);
            }
            long j13 = mVar.f7308f[a9];
            j10 = mVar.f7305c[a9];
            if (j13 >= j9 || a9 >= mVar.f7304b - 1 || (b9 = mVar.b(j9)) == -1 || b9 == a9) {
                j11 = -9223372036854775807L;
            } else {
                j11 = mVar.f7308f[b9];
                j12 = mVar.f7305c[b9];
            }
            j9 = j13;
        } else {
            j10 = Long.MAX_VALUE;
            j11 = -9223372036854775807L;
        }
        int i9 = 0;
        while (true) {
            b[] bVarArr2 = this.f7256z;
            if (i9 >= bVarArr2.length) {
                break;
            }
            if (i9 != this.f7239B) {
                m mVar2 = bVarArr2[i9].f7258b;
                long a10 = a(mVar2, j9, j10);
                if (j11 != com.anythink.basead.exoplayer.b.f6539b) {
                    j12 = a(mVar2, j11, j12);
                }
                j10 = a10;
            }
            i9++;
        }
        com.anythink.basead.exoplayer.e.l lVar = new com.anythink.basead.exoplayer.e.l(j9, j10);
        if (j11 == com.anythink.basead.exoplayer.b.f6539b) {
            return new k.a(lVar);
        }
        return new k.a(lVar, new com.anythink.basead.exoplayer.e.l(j11, j12));
    }

    private void a(a.C0020a c0020a) {
        com.anythink.basead.exoplayer.g.a aVar;
        ArrayList<m> a9;
        ArrayList arrayList = new ArrayList();
        com.anythink.basead.exoplayer.e.i iVar = new com.anythink.basead.exoplayer.e.i();
        a.b d2 = c0020a.d(com.anythink.basead.exoplayer.e.a.a.aF);
        if (d2 != null) {
            aVar = com.anythink.basead.exoplayer.e.a.b.a(d2, this.f7241D);
            if (aVar != null) {
                iVar.a(aVar);
            }
        } else {
            aVar = null;
        }
        int i4 = 1;
        int i9 = 0;
        try {
            a9 = a(c0020a, iVar, (this.f7242l & 1) != 0);
        } catch (b.g unused) {
            iVar = new com.anythink.basead.exoplayer.e.i();
            a9 = a(c0020a, iVar, true);
        }
        int size = a9.size();
        int i10 = -1;
        long j9 = com.anythink.basead.exoplayer.b.f6539b;
        while (i9 < size) {
            m mVar = a9.get(i9);
            j jVar = mVar.f7303a;
            b bVar = new b(jVar, mVar, this.f7255y.a(i9, jVar.f7270d));
            com.anythink.basead.exoplayer.m a10 = jVar.f7274h.a(mVar.f7307e + 30);
            if (jVar.f7270d == i4) {
                if (iVar.a()) {
                    a10 = a10.a(iVar.f7330b, iVar.f7331c);
                }
                if (aVar != null) {
                    a10 = a10.a(aVar);
                }
            }
            bVar.f7259c.a(a10);
            com.anythink.basead.exoplayer.e.i iVar2 = iVar;
            com.anythink.basead.exoplayer.g.a aVar2 = aVar;
            long j10 = jVar.f7273g;
            if (j10 == com.anythink.basead.exoplayer.b.f6539b) {
                j10 = mVar.f7310h;
            }
            j9 = Math.max(j9, j10);
            if (jVar.f7270d == 2 && i10 == -1) {
                i10 = arrayList.size();
            }
            arrayList.add(bVar);
            i9++;
            aVar = aVar2;
            iVar = iVar2;
            i4 = 1;
        }
        this.f7239B = i10;
        this.f7240C = j9;
        b[] bVarArr = (b[]) arrayList.toArray(new b[arrayList.size()]);
        this.f7256z = bVarArr;
        this.f7238A = a(bVarArr);
        this.f7255y.c_();
        this.f7255y.a(this);
    }

    private ArrayList<m> a(a.C0020a c0020a, com.anythink.basead.exoplayer.e.i iVar, boolean z8) {
        boolean z9;
        ArrayList<m> arrayList = new ArrayList<>();
        int i4 = 0;
        while (i4 < c0020a.aX.size()) {
            a.C0020a c0020a2 = c0020a.aX.get(i4);
            if (c0020a2.aU == com.anythink.basead.exoplayer.e.a.a.f7060I) {
                z9 = z8;
                j a9 = com.anythink.basead.exoplayer.e.a.b.a(c0020a2, c0020a.d(com.anythink.basead.exoplayer.e.a.a.f7059H), com.anythink.basead.exoplayer.b.f6539b, (com.anythink.basead.exoplayer.d.e) null, z9, this.f7241D);
                if (a9 != null) {
                    m a10 = com.anythink.basead.exoplayer.e.a.b.a(a9, c0020a2.e(com.anythink.basead.exoplayer.e.a.a.J).e(com.anythink.basead.exoplayer.e.a.a.f7061K).e(com.anythink.basead.exoplayer.e.a.a.f7062L), iVar);
                    if (a10.f7304b != 0) {
                        arrayList.add(a10);
                    }
                }
            } else {
                z9 = z8;
            }
            i4++;
            z8 = z9;
        }
        return arrayList;
    }

    private static long[][] a(b[] bVarArr) {
        long[][] jArr = new long[bVarArr.length][];
        int[] iArr = new int[bVarArr.length];
        long[] jArr2 = new long[bVarArr.length];
        boolean[] zArr = new boolean[bVarArr.length];
        for (int i4 = 0; i4 < bVarArr.length; i4++) {
            jArr[i4] = new long[bVarArr[i4].f7258b.f7304b];
            jArr2[i4] = bVarArr[i4].f7258b.f7308f[0];
        }
        long j9 = 0;
        int i9 = 0;
        while (i9 < bVarArr.length) {
            long j10 = Long.MAX_VALUE;
            int i10 = -1;
            for (int i11 = 0; i11 < bVarArr.length; i11++) {
                if (!zArr[i11]) {
                    long j11 = jArr2[i11];
                    if (j11 <= j10) {
                        i10 = i11;
                        j10 = j11;
                    }
                }
            }
            int i12 = iArr[i10];
            long[] jArr3 = jArr[i10];
            jArr3[i12] = j9;
            m mVar = bVarArr[i10].f7258b;
            j9 += mVar.f7306d[i12];
            int i13 = i12 + 1;
            iArr[i10] = i13;
            if (i13 < jArr3.length) {
                jArr2[i10] = mVar.f7308f[i13];
            } else {
                zArr[i10] = true;
                i9++;
            }
        }
        return jArr;
    }

    private static long a(m mVar, long j9, long j10) {
        int a9 = a(mVar, j9);
        return a9 == -1 ? j10 : Math.min(mVar.f7305c[a9], j10);
    }

    private static int a(m mVar, long j9) {
        int a9 = mVar.a(j9);
        return a9 == -1 ? mVar.b(j9) : a9;
    }

    private static boolean a(s sVar) {
        sVar.c(8);
        if (sVar.i() == i) {
            return true;
        }
        sVar.d(4);
        while (sVar.a() > 0) {
            if (sVar.i() == i) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(int i4) {
        return i4 == com.anythink.basead.exoplayer.e.a.a.f7073W || i4 == com.anythink.basead.exoplayer.e.a.a.f7059H || i4 == com.anythink.basead.exoplayer.e.a.a.f7074X || i4 == com.anythink.basead.exoplayer.e.a.a.Y || i4 == com.anythink.basead.exoplayer.e.a.a.ar || i4 == com.anythink.basead.exoplayer.e.a.a.as || i4 == com.anythink.basead.exoplayer.e.a.a.at || i4 == com.anythink.basead.exoplayer.e.a.a.f7072V || i4 == com.anythink.basead.exoplayer.e.a.a.au || i4 == com.anythink.basead.exoplayer.e.a.a.av || i4 == com.anythink.basead.exoplayer.e.a.a.aw || i4 == com.anythink.basead.exoplayer.e.a.a.ax || i4 == com.anythink.basead.exoplayer.e.a.a.ay || i4 == com.anythink.basead.exoplayer.e.a.a.f7070T || i4 == com.anythink.basead.exoplayer.e.a.a.f7081f || i4 == com.anythink.basead.exoplayer.e.a.a.aF;
    }
}

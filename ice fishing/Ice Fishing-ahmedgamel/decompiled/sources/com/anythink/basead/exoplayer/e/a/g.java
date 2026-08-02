package com.anythink.basead.exoplayer.e.a;

import com.anythink.basead.exoplayer.e.a.a;
import com.anythink.basead.exoplayer.e.a.b;
import com.anythink.basead.exoplayer.e.k;
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
    public static final int f7861e = 1;

    /* renamed from: f, reason: collision with root package name */
    private static final int f7862f = 0;

    /* renamed from: g, reason: collision with root package name */
    private static final int f7863g = 1;

    /* renamed from: h, reason: collision with root package name */
    private static final int f7864h = 2;

    /* renamed from: j, reason: collision with root package name */
    private static final long f7865j = 262144;

    /* renamed from: k, reason: collision with root package name */
    private static final long f7866k = 10485760;

    /* renamed from: A, reason: collision with root package name */
    private long[][] f7867A;

    /* renamed from: B, reason: collision with root package name */
    private int f7868B;

    /* renamed from: C, reason: collision with root package name */
    private long f7869C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f7870D;

    /* renamed from: l, reason: collision with root package name */
    private final int f7871l;

    /* renamed from: m, reason: collision with root package name */
    private final s f7872m;

    /* renamed from: n, reason: collision with root package name */
    private final s f7873n;

    /* renamed from: o, reason: collision with root package name */
    private final s f7874o;

    /* renamed from: p, reason: collision with root package name */
    private final ArrayDeque<a.C0021a> f7875p;

    /* renamed from: q, reason: collision with root package name */
    private int f7876q;

    /* renamed from: r, reason: collision with root package name */
    private int f7877r;

    /* renamed from: s, reason: collision with root package name */
    private long f7878s;

    /* renamed from: t, reason: collision with root package name */
    private int f7879t;

    /* renamed from: u, reason: collision with root package name */
    private s f7880u;

    /* renamed from: v, reason: collision with root package name */
    private int f7881v;

    /* renamed from: w, reason: collision with root package name */
    private int f7882w;

    /* renamed from: x, reason: collision with root package name */
    private int f7883x;

    /* renamed from: y, reason: collision with root package name */
    private com.anythink.basead.exoplayer.e.g f7884y;

    /* renamed from: z, reason: collision with root package name */
    private b[] f7885z;

    /* renamed from: d, reason: collision with root package name */
    public static final com.anythink.basead.exoplayer.e.h f7860d = new com.anythink.basead.exoplayer.e.h() { // from class: com.anythink.basead.exoplayer.e.a.g.1
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
        public final j f7886a;

        /* renamed from: b, reason: collision with root package name */
        public final m f7887b;

        /* renamed from: c, reason: collision with root package name */
        public final com.anythink.basead.exoplayer.e.m f7888c;

        /* renamed from: d, reason: collision with root package name */
        public int f7889d;

        public b(j jVar, m mVar, com.anythink.basead.exoplayer.e.m mVar2) {
            this.f7886a = jVar;
            this.f7887b = mVar;
            this.f7888c = mVar2;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public g() {
        this(0);
    }

    private void d() {
        this.f7876q = 0;
        this.f7879t = 0;
    }

    @Override // com.anythink.basead.exoplayer.e.k
    public final boolean a() {
        return true;
    }

    @Override // com.anythink.basead.exoplayer.e.k
    public final long b() {
        return this.f7869C;
    }

    @Override // com.anythink.basead.exoplayer.e.e
    public final void c() {
    }

    public g(int i4) {
        this.f7871l = i4;
        this.f7874o = new s(16);
        this.f7875p = new ArrayDeque<>();
        this.f7872m = new s(p.f9258a);
        this.f7873n = new s(4);
        this.f7881v = -1;
    }

    private boolean b(com.anythink.basead.exoplayer.e.f fVar) {
        if (this.f7879t == 0) {
            if (!fVar.a(this.f7874o.f9288a, 0, 8, true)) {
                return false;
            }
            this.f7879t = 8;
            this.f7874o.c(0);
            this.f7878s = this.f7874o.h();
            this.f7877r = this.f7874o.i();
        }
        long j6 = this.f7878s;
        if (j6 == 1) {
            fVar.b(this.f7874o.f9288a, 8, 8);
            this.f7879t += 8;
            this.f7878s = this.f7874o.n();
        } else if (j6 == 0) {
            long d9 = fVar.d();
            if (d9 == -1 && !this.f7875p.isEmpty()) {
                d9 = this.f7875p.peek().aV;
            }
            if (d9 != -1) {
                this.f7878s = (d9 - fVar.c()) + this.f7879t;
            }
        }
        long j9 = this.f7878s;
        int i4 = this.f7879t;
        if (j9 < i4) {
            throw new t("Atom size less than header length (unsupported).");
        }
        int i6 = this.f7877r;
        if (i6 == com.anythink.basead.exoplayer.e.a.a.f7687G || i6 == com.anythink.basead.exoplayer.e.a.a.f7689I || i6 == com.anythink.basead.exoplayer.e.a.a.J || i6 == com.anythink.basead.exoplayer.e.a.a.f7690K || i6 == com.anythink.basead.exoplayer.e.a.a.f7691L || i6 == com.anythink.basead.exoplayer.e.a.a.f7700U) {
            long c9 = (fVar.c() + this.f7878s) - this.f7879t;
            this.f7875p.push(new a.C0021a(this.f7877r, c9));
            if (this.f7878s == this.f7879t) {
                b(c9);
            } else {
                d();
            }
        } else if (i6 == com.anythink.basead.exoplayer.e.a.a.f7702W || i6 == com.anythink.basead.exoplayer.e.a.a.f7688H || i6 == com.anythink.basead.exoplayer.e.a.a.f7703X || i6 == com.anythink.basead.exoplayer.e.a.a.Y || i6 == com.anythink.basead.exoplayer.e.a.a.ar || i6 == com.anythink.basead.exoplayer.e.a.a.as || i6 == com.anythink.basead.exoplayer.e.a.a.at || i6 == com.anythink.basead.exoplayer.e.a.a.f7701V || i6 == com.anythink.basead.exoplayer.e.a.a.au || i6 == com.anythink.basead.exoplayer.e.a.a.av || i6 == com.anythink.basead.exoplayer.e.a.a.aw || i6 == com.anythink.basead.exoplayer.e.a.a.ax || i6 == com.anythink.basead.exoplayer.e.a.a.ay || i6 == com.anythink.basead.exoplayer.e.a.a.f7699T || i6 == com.anythink.basead.exoplayer.e.a.a.f7710f || i6 == com.anythink.basead.exoplayer.e.a.a.aF) {
            com.anythink.basead.exoplayer.k.a.b(i4 == 8);
            com.anythink.basead.exoplayer.k.a.b(this.f7878s <= 2147483647L);
            s sVar = new s((int) this.f7878s);
            this.f7880u = sVar;
            System.arraycopy(this.f7874o.f9288a, 0, sVar.f9288a, 0, 8);
            this.f7876q = 1;
        } else {
            this.f7880u = null;
            this.f7876q = 1;
        }
        return true;
    }

    private int c(com.anythink.basead.exoplayer.e.f fVar, com.anythink.basead.exoplayer.e.j jVar) {
        long j6;
        long j9;
        long c9 = fVar.c();
        if (this.f7881v == -1) {
            boolean z6 = true;
            boolean z9 = true;
            int i4 = 0;
            int i6 = -1;
            int i9 = -1;
            long j10 = Long.MAX_VALUE;
            long j11 = Long.MAX_VALUE;
            long j12 = Long.MAX_VALUE;
            j6 = f7865j;
            while (true) {
                b[] bVarArr = this.f7885z;
                j9 = 0;
                if (i4 >= bVarArr.length) {
                    break;
                }
                b bVar = bVarArr[i4];
                int i10 = bVar.f7889d;
                m mVar = bVar.f7887b;
                if (i10 != mVar.f7933b) {
                    long j13 = mVar.f7934c[i10];
                    long j14 = this.f7867A[i4][i10];
                    long j15 = j13 - c9;
                    boolean z10 = j15 < 0 || j15 >= f7865j;
                    if ((!z10 && z6) || (z10 == z6 && j15 < j12)) {
                        i9 = i4;
                        z6 = z10;
                        j11 = j14;
                        j12 = j15;
                    }
                    if (j14 < j10) {
                        i6 = i4;
                        z9 = z10;
                        j10 = j14;
                    }
                }
                i4++;
            }
            int i11 = (j10 == Long.MAX_VALUE || !z9 || j11 < j10 + f7866k) ? i9 : i6;
            this.f7881v = i11;
            if (i11 == -1) {
                return -1;
            }
        } else {
            j6 = f7865j;
            j9 = 0;
        }
        b bVar2 = this.f7885z[this.f7881v];
        com.anythink.basead.exoplayer.e.m mVar2 = bVar2.f7888c;
        int i12 = bVar2.f7889d;
        m mVar3 = bVar2.f7887b;
        long j16 = mVar3.f7934c[i12];
        int i13 = mVar3.f7935d[i12];
        long j17 = (j16 - c9) + this.f7882w;
        if (j17 < j9 || j17 >= j6) {
            jVar.f7961a = j16;
            return 1;
        }
        if (bVar2.f7886a.i == 1) {
            j17 += 8;
            i13 -= 8;
        }
        fVar.c((int) j17);
        int i14 = bVar2.f7886a.f7906l;
        if (i14 == 0) {
            while (true) {
                int i15 = this.f7882w;
                if (i15 >= i13) {
                    break;
                }
                int a9 = mVar2.a(fVar, i13 - i15, false);
                this.f7882w += a9;
                this.f7883x -= a9;
            }
        } else {
            byte[] bArr = this.f7873n.f9288a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i16 = 4 - i14;
            while (this.f7882w < i13) {
                int i17 = this.f7883x;
                if (i17 == 0) {
                    fVar.b(this.f7873n.f9288a, i16, i14);
                    this.f7873n.c(0);
                    this.f7883x = this.f7873n.m();
                    this.f7872m.c(0);
                    mVar2.a(this.f7872m, 4);
                    this.f7882w += 4;
                    i13 += i16;
                } else {
                    int a10 = mVar2.a(fVar, i17, false);
                    this.f7882w += a10;
                    this.f7883x -= a10;
                }
            }
        }
        int i18 = i13;
        m mVar4 = bVar2.f7887b;
        mVar2.a(mVar4.f7937f[i12], mVar4.f7938g[i12], i18, 0, null);
        bVar2.f7889d++;
        this.f7881v = -1;
        this.f7882w = 0;
        this.f7883x = 0;
        return 0;
    }

    @Override // com.anythink.basead.exoplayer.e.e
    public final boolean a(com.anythink.basead.exoplayer.e.f fVar) {
        return i.b(fVar);
    }

    private void d(long j6) {
        for (b bVar : this.f7885z) {
            m mVar = bVar.f7887b;
            int a9 = mVar.a(j6);
            if (a9 == -1) {
                a9 = mVar.b(j6);
            }
            bVar.f7889d = a9;
        }
    }

    @Override // com.anythink.basead.exoplayer.e.e
    public final void a(com.anythink.basead.exoplayer.e.g gVar) {
        this.f7884y = gVar;
    }

    @Override // com.anythink.basead.exoplayer.e.e
    public final void a(long j6, long j9) {
        this.f7875p.clear();
        this.f7879t = 0;
        this.f7881v = -1;
        this.f7882w = 0;
        this.f7883x = 0;
        if (j6 == 0) {
            d();
            return;
        }
        b[] bVarArr = this.f7885z;
        if (bVarArr != null) {
            for (b bVar : bVarArr) {
                m mVar = bVar.f7887b;
                int a9 = mVar.a(j9);
                if (a9 == -1) {
                    a9 = mVar.b(j9);
                }
                bVar.f7889d = a9;
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
        long j6;
        long j9;
        boolean z6;
        while (true) {
            int i4 = this.f7876q;
            boolean z9 = false;
            if (i4 == 0) {
                if (this.f7879t == 0) {
                    if (!fVar.a(this.f7874o.f9288a, 0, 8, true)) {
                        return -1;
                    }
                    this.f7879t = 8;
                    this.f7874o.c(0);
                    this.f7878s = this.f7874o.h();
                    this.f7877r = this.f7874o.i();
                }
                long j10 = this.f7878s;
                if (j10 == 1) {
                    fVar.b(this.f7874o.f9288a, 8, 8);
                    this.f7879t += 8;
                    this.f7878s = this.f7874o.n();
                } else if (j10 == 0) {
                    long d9 = fVar.d();
                    if (d9 == -1 && !this.f7875p.isEmpty()) {
                        d9 = this.f7875p.peek().aV;
                    }
                    if (d9 != -1) {
                        this.f7878s = (d9 - fVar.c()) + this.f7879t;
                    }
                }
                long j11 = this.f7878s;
                int i6 = this.f7879t;
                if (j11 >= i6) {
                    int i9 = this.f7877r;
                    if (i9 != com.anythink.basead.exoplayer.e.a.a.f7687G && i9 != com.anythink.basead.exoplayer.e.a.a.f7689I && i9 != com.anythink.basead.exoplayer.e.a.a.J && i9 != com.anythink.basead.exoplayer.e.a.a.f7690K && i9 != com.anythink.basead.exoplayer.e.a.a.f7691L && i9 != com.anythink.basead.exoplayer.e.a.a.f7700U) {
                        if (i9 != com.anythink.basead.exoplayer.e.a.a.f7702W && i9 != com.anythink.basead.exoplayer.e.a.a.f7688H && i9 != com.anythink.basead.exoplayer.e.a.a.f7703X && i9 != com.anythink.basead.exoplayer.e.a.a.Y && i9 != com.anythink.basead.exoplayer.e.a.a.ar && i9 != com.anythink.basead.exoplayer.e.a.a.as && i9 != com.anythink.basead.exoplayer.e.a.a.at && i9 != com.anythink.basead.exoplayer.e.a.a.f7701V && i9 != com.anythink.basead.exoplayer.e.a.a.au && i9 != com.anythink.basead.exoplayer.e.a.a.av && i9 != com.anythink.basead.exoplayer.e.a.a.aw && i9 != com.anythink.basead.exoplayer.e.a.a.ax && i9 != com.anythink.basead.exoplayer.e.a.a.ay && i9 != com.anythink.basead.exoplayer.e.a.a.f7699T && i9 != com.anythink.basead.exoplayer.e.a.a.f7710f && i9 != com.anythink.basead.exoplayer.e.a.a.aF) {
                            this.f7880u = null;
                            this.f7876q = 1;
                        } else {
                            boolean z10 = false;
                            com.anythink.basead.exoplayer.k.a.b(z10);
                            com.anythink.basead.exoplayer.k.a.b(this.f7878s <= 2147483647L);
                            s sVar = new s((int) this.f7878s);
                            this.f7880u = sVar;
                            System.arraycopy(this.f7874o.f9288a, 0, sVar.f9288a, 0, 8);
                            this.f7876q = 1;
                        }
                    } else {
                        long c9 = (fVar.c() + this.f7878s) - this.f7879t;
                        this.f7875p.push(new a.C0021a(this.f7877r, c9));
                        if (this.f7878s == this.f7879t) {
                            b(c9);
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
                        long c10 = fVar.c();
                        if (this.f7881v == -1) {
                            int i10 = -1;
                            int i11 = -1;
                            boolean z11 = true;
                            boolean z12 = true;
                            int i12 = 0;
                            long j12 = Long.MAX_VALUE;
                            long j13 = Long.MAX_VALUE;
                            long j14 = Long.MAX_VALUE;
                            j6 = 0;
                            while (true) {
                                b[] bVarArr = this.f7885z;
                                j9 = f7865j;
                                if (i12 >= bVarArr.length) {
                                    break;
                                }
                                b bVar = bVarArr[i12];
                                int i13 = bVar.f7889d;
                                m mVar = bVar.f7887b;
                                if (i13 != mVar.f7933b) {
                                    long j15 = mVar.f7934c[i13];
                                    long j16 = this.f7867A[i12][i13];
                                    long j17 = j15 - c10;
                                    boolean z13 = j17 < 0 || j17 >= f7865j;
                                    if ((!z13 && z11) || (z13 == z11 && j17 < j14)) {
                                        i11 = i12;
                                        z11 = z13;
                                        j13 = j16;
                                        j14 = j17;
                                    }
                                    if (j16 < j12) {
                                        i10 = i12;
                                        z12 = z13;
                                        j12 = j16;
                                    }
                                }
                                i12++;
                            }
                            int i14 = (j12 == Long.MAX_VALUE || !z12 || j13 < j12 + f7866k) ? i11 : i10;
                            this.f7881v = i14;
                            if (i14 == -1) {
                                return -1;
                            }
                        } else {
                            j6 = 0;
                            j9 = f7865j;
                        }
                        b bVar2 = this.f7885z[this.f7881v];
                        com.anythink.basead.exoplayer.e.m mVar2 = bVar2.f7888c;
                        int i15 = bVar2.f7889d;
                        m mVar3 = bVar2.f7887b;
                        long j18 = mVar3.f7934c[i15];
                        int i16 = mVar3.f7935d[i15];
                        long j19 = (j18 - c10) + this.f7882w;
                        if (j19 >= j6 && j19 < j9) {
                            if (bVar2.f7886a.i == 1) {
                                j19 += 8;
                                i16 -= 8;
                            }
                            fVar.c((int) j19);
                            int i17 = bVar2.f7886a.f7906l;
                            if (i17 == 0) {
                                while (true) {
                                    int i18 = this.f7882w;
                                    if (i18 >= i16) {
                                        break;
                                    }
                                    int a9 = mVar2.a(fVar, i16 - i18, false);
                                    this.f7882w += a9;
                                    this.f7883x -= a9;
                                }
                            } else {
                                byte[] bArr = this.f7873n.f9288a;
                                bArr[0] = 0;
                                bArr[1] = 0;
                                bArr[2] = 0;
                                int i19 = 4 - i17;
                                while (this.f7882w < i16) {
                                    int i20 = this.f7883x;
                                    if (i20 == 0) {
                                        fVar.b(this.f7873n.f9288a, i19, i17);
                                        this.f7873n.c(0);
                                        this.f7883x = this.f7873n.m();
                                        this.f7872m.c(0);
                                        mVar2.a(this.f7872m, 4);
                                        this.f7882w += 4;
                                        i16 += i19;
                                    } else {
                                        int a10 = mVar2.a(fVar, i20, false);
                                        this.f7882w += a10;
                                        this.f7883x -= a10;
                                    }
                                }
                            }
                            int i21 = i16;
                            m mVar4 = bVar2.f7887b;
                            mVar2.a(mVar4.f7937f[i15], mVar4.f7938g[i15], i21, 0, null);
                            bVar2.f7889d++;
                            this.f7881v = -1;
                            this.f7882w = 0;
                            this.f7883x = 0;
                            return 0;
                        }
                        jVar.f7961a = j18;
                        return 1;
                    }
                    throw new IllegalStateException();
                }
                long j20 = this.f7878s - this.f7879t;
                long c11 = fVar.c() + j20;
                s sVar2 = this.f7880u;
                if (sVar2 != null) {
                    fVar.b(sVar2.f9288a, this.f7879t, (int) j20);
                    if (this.f7877r == com.anythink.basead.exoplayer.e.a.a.f7710f) {
                        s sVar3 = this.f7880u;
                        sVar3.c(8);
                        if (sVar3.i() != i) {
                            sVar3.d(4);
                            while (sVar3.a() > 0) {
                                if (sVar3.i() == i) {
                                }
                            }
                            z6 = false;
                            this.f7870D = z6;
                        }
                        z6 = true;
                        this.f7870D = z6;
                    } else if (!this.f7875p.isEmpty()) {
                        this.f7875p.peek().a(new a.b(this.f7877r, this.f7880u));
                    }
                } else if (j20 < f7865j) {
                    fVar.c((int) j20);
                } else {
                    jVar.f7961a = fVar.c() + j20;
                    z9 = true;
                }
                b(c11);
                if (z9 && this.f7876q != 2) {
                    return 1;
                }
            }
        }
    }

    private boolean b(com.anythink.basead.exoplayer.e.f fVar, com.anythink.basead.exoplayer.e.j jVar) {
        boolean z6;
        boolean z9;
        long j6 = this.f7878s - this.f7879t;
        long c9 = fVar.c() + j6;
        s sVar = this.f7880u;
        if (sVar != null) {
            fVar.b(sVar.f9288a, this.f7879t, (int) j6);
            if (this.f7877r == com.anythink.basead.exoplayer.e.a.a.f7710f) {
                s sVar2 = this.f7880u;
                sVar2.c(8);
                if (sVar2.i() != i) {
                    sVar2.d(4);
                    while (sVar2.a() > 0) {
                        if (sVar2.i() == i) {
                        }
                    }
                    z9 = false;
                    this.f7870D = z9;
                }
                z9 = true;
                this.f7870D = z9;
            } else if (!this.f7875p.isEmpty()) {
                this.f7875p.peek().a(new a.b(this.f7877r, this.f7880u));
            }
        } else if (j6 < f7865j) {
            fVar.c((int) j6);
        } else {
            jVar.f7961a = fVar.c() + j6;
            z6 = true;
            b(c9);
            return (z6 || this.f7876q == 2) ? false : true;
        }
        z6 = false;
        b(c9);
        if (z6) {
        }
    }

    private int c(long j6) {
        int i4 = -1;
        int i6 = -1;
        int i9 = 0;
        long j9 = Long.MAX_VALUE;
        boolean z6 = true;
        long j10 = Long.MAX_VALUE;
        boolean z9 = true;
        long j11 = Long.MAX_VALUE;
        while (true) {
            b[] bVarArr = this.f7885z;
            if (i9 >= bVarArr.length) {
                break;
            }
            b bVar = bVarArr[i9];
            int i10 = bVar.f7889d;
            m mVar = bVar.f7887b;
            if (i10 != mVar.f7933b) {
                long j12 = mVar.f7934c[i10];
                long j13 = this.f7867A[i9][i10];
                long j14 = j12 - j6;
                boolean z10 = j14 < 0 || j14 >= f7865j;
                if ((!z10 && z9) || (z10 == z9 && j14 < j11)) {
                    z9 = z10;
                    j10 = j13;
                    i6 = i9;
                    j11 = j14;
                }
                if (j13 < j9) {
                    z6 = z10;
                    j9 = j13;
                    i4 = i9;
                }
            }
            i9++;
        }
        return (j9 == Long.MAX_VALUE || !z6 || j10 < j9 + f7866k) ? i6 : i4;
    }

    private void b(long j6) {
        while (!this.f7875p.isEmpty() && this.f7875p.peek().aV == j6) {
            a.C0021a pop = this.f7875p.pop();
            if (pop.aU == com.anythink.basead.exoplayer.e.a.a.f7687G) {
                a(pop);
                this.f7875p.clear();
                this.f7876q = 2;
            } else if (!this.f7875p.isEmpty()) {
                this.f7875p.peek().a(pop);
            }
        }
        if (this.f7876q != 2) {
            d();
        }
    }

    private static boolean b(int i4) {
        return i4 == com.anythink.basead.exoplayer.e.a.a.f7687G || i4 == com.anythink.basead.exoplayer.e.a.a.f7689I || i4 == com.anythink.basead.exoplayer.e.a.a.J || i4 == com.anythink.basead.exoplayer.e.a.a.f7690K || i4 == com.anythink.basead.exoplayer.e.a.a.f7691L || i4 == com.anythink.basead.exoplayer.e.a.a.f7700U;
    }

    @Override // com.anythink.basead.exoplayer.e.k
    public final k.a a(long j6) {
        long j9;
        long j10;
        int b9;
        b[] bVarArr = this.f7885z;
        if (bVarArr.length == 0) {
            return new k.a(com.anythink.basead.exoplayer.e.l.f7966a);
        }
        int i4 = this.f7868B;
        long j11 = -1;
        if (i4 != -1) {
            m mVar = bVarArr[i4].f7887b;
            int a9 = a(mVar, j6);
            if (a9 == -1) {
                return new k.a(com.anythink.basead.exoplayer.e.l.f7966a);
            }
            long j12 = mVar.f7937f[a9];
            j9 = mVar.f7934c[a9];
            if (j12 >= j6 || a9 >= mVar.f7933b - 1 || (b9 = mVar.b(j6)) == -1 || b9 == a9) {
                j10 = -9223372036854775807L;
            } else {
                j10 = mVar.f7937f[b9];
                j11 = mVar.f7934c[b9];
            }
            j6 = j12;
        } else {
            j9 = Long.MAX_VALUE;
            j10 = -9223372036854775807L;
        }
        int i6 = 0;
        while (true) {
            b[] bVarArr2 = this.f7885z;
            if (i6 >= bVarArr2.length) {
                break;
            }
            if (i6 != this.f7868B) {
                m mVar2 = bVarArr2[i6].f7887b;
                long a10 = a(mVar2, j6, j9);
                if (j10 != com.anythink.basead.exoplayer.b.f7168b) {
                    j11 = a(mVar2, j10, j11);
                }
                j9 = a10;
            }
            i6++;
        }
        com.anythink.basead.exoplayer.e.l lVar = new com.anythink.basead.exoplayer.e.l(j6, j9);
        if (j10 == com.anythink.basead.exoplayer.b.f7168b) {
            return new k.a(lVar);
        }
        return new k.a(lVar, new com.anythink.basead.exoplayer.e.l(j10, j11));
    }

    private void a(a.C0021a c0021a) {
        com.anythink.basead.exoplayer.g.a aVar;
        ArrayList<m> a9;
        ArrayList arrayList = new ArrayList();
        com.anythink.basead.exoplayer.e.i iVar = new com.anythink.basead.exoplayer.e.i();
        a.b d9 = c0021a.d(com.anythink.basead.exoplayer.e.a.a.aF);
        if (d9 != null) {
            aVar = com.anythink.basead.exoplayer.e.a.b.a(d9, this.f7870D);
            if (aVar != null) {
                iVar.a(aVar);
            }
        } else {
            aVar = null;
        }
        int i4 = 1;
        int i6 = 0;
        try {
            a9 = a(c0021a, iVar, (this.f7871l & 1) != 0);
        } catch (b.g unused) {
            iVar = new com.anythink.basead.exoplayer.e.i();
            a9 = a(c0021a, iVar, true);
        }
        int size = a9.size();
        int i9 = -1;
        long j6 = com.anythink.basead.exoplayer.b.f7168b;
        while (i6 < size) {
            m mVar = a9.get(i6);
            j jVar = mVar.f7932a;
            b bVar = new b(jVar, mVar, this.f7884y.a(i6, jVar.f7899d));
            com.anythink.basead.exoplayer.m a10 = jVar.f7903h.a(mVar.f7936e + 30);
            if (jVar.f7899d == i4) {
                if (iVar.a()) {
                    a10 = a10.a(iVar.f7959b, iVar.f7960c);
                }
                if (aVar != null) {
                    a10 = a10.a(aVar);
                }
            }
            bVar.f7888c.a(a10);
            com.anythink.basead.exoplayer.e.i iVar2 = iVar;
            com.anythink.basead.exoplayer.g.a aVar2 = aVar;
            long j9 = jVar.f7902g;
            if (j9 == com.anythink.basead.exoplayer.b.f7168b) {
                j9 = mVar.f7939h;
            }
            j6 = Math.max(j6, j9);
            if (jVar.f7899d == 2 && i9 == -1) {
                i9 = arrayList.size();
            }
            arrayList.add(bVar);
            i6++;
            aVar = aVar2;
            iVar = iVar2;
            i4 = 1;
        }
        this.f7868B = i9;
        this.f7869C = j6;
        b[] bVarArr = (b[]) arrayList.toArray(new b[arrayList.size()]);
        this.f7885z = bVarArr;
        this.f7867A = a(bVarArr);
        this.f7884y.c_();
        this.f7884y.a(this);
    }

    private ArrayList<m> a(a.C0021a c0021a, com.anythink.basead.exoplayer.e.i iVar, boolean z6) {
        boolean z9;
        ArrayList<m> arrayList = new ArrayList<>();
        int i4 = 0;
        while (i4 < c0021a.aX.size()) {
            a.C0021a c0021a2 = c0021a.aX.get(i4);
            if (c0021a2.aU == com.anythink.basead.exoplayer.e.a.a.f7689I) {
                z9 = z6;
                j a9 = com.anythink.basead.exoplayer.e.a.b.a(c0021a2, c0021a.d(com.anythink.basead.exoplayer.e.a.a.f7688H), com.anythink.basead.exoplayer.b.f7168b, (com.anythink.basead.exoplayer.d.e) null, z9, this.f7870D);
                if (a9 != null) {
                    m a10 = com.anythink.basead.exoplayer.e.a.b.a(a9, c0021a2.e(com.anythink.basead.exoplayer.e.a.a.J).e(com.anythink.basead.exoplayer.e.a.a.f7690K).e(com.anythink.basead.exoplayer.e.a.a.f7691L), iVar);
                    if (a10.f7933b != 0) {
                        arrayList.add(a10);
                    }
                }
            } else {
                z9 = z6;
            }
            i4++;
            z6 = z9;
        }
        return arrayList;
    }

    private static long[][] a(b[] bVarArr) {
        long[][] jArr = new long[bVarArr.length][];
        int[] iArr = new int[bVarArr.length];
        long[] jArr2 = new long[bVarArr.length];
        boolean[] zArr = new boolean[bVarArr.length];
        for (int i4 = 0; i4 < bVarArr.length; i4++) {
            jArr[i4] = new long[bVarArr[i4].f7887b.f7933b];
            jArr2[i4] = bVarArr[i4].f7887b.f7937f[0];
        }
        long j6 = 0;
        int i6 = 0;
        while (i6 < bVarArr.length) {
            long j9 = Long.MAX_VALUE;
            int i9 = -1;
            for (int i10 = 0; i10 < bVarArr.length; i10++) {
                if (!zArr[i10]) {
                    long j10 = jArr2[i10];
                    if (j10 <= j9) {
                        i9 = i10;
                        j9 = j10;
                    }
                }
            }
            int i11 = iArr[i9];
            long[] jArr3 = jArr[i9];
            jArr3[i11] = j6;
            m mVar = bVarArr[i9].f7887b;
            j6 += mVar.f7935d[i11];
            int i12 = i11 + 1;
            iArr[i9] = i12;
            if (i12 < jArr3.length) {
                jArr2[i9] = mVar.f7937f[i12];
            } else {
                zArr[i9] = true;
                i6++;
            }
        }
        return jArr;
    }

    private static long a(m mVar, long j6, long j9) {
        int a9 = a(mVar, j6);
        return a9 == -1 ? j9 : Math.min(mVar.f7934c[a9], j9);
    }

    private static int a(m mVar, long j6) {
        int a9 = mVar.a(j6);
        return a9 == -1 ? mVar.b(j6) : a9;
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
        return i4 == com.anythink.basead.exoplayer.e.a.a.f7702W || i4 == com.anythink.basead.exoplayer.e.a.a.f7688H || i4 == com.anythink.basead.exoplayer.e.a.a.f7703X || i4 == com.anythink.basead.exoplayer.e.a.a.Y || i4 == com.anythink.basead.exoplayer.e.a.a.ar || i4 == com.anythink.basead.exoplayer.e.a.a.as || i4 == com.anythink.basead.exoplayer.e.a.a.at || i4 == com.anythink.basead.exoplayer.e.a.a.f7701V || i4 == com.anythink.basead.exoplayer.e.a.a.au || i4 == com.anythink.basead.exoplayer.e.a.a.av || i4 == com.anythink.basead.exoplayer.e.a.a.aw || i4 == com.anythink.basead.exoplayer.e.a.a.ax || i4 == com.anythink.basead.exoplayer.e.a.a.ay || i4 == com.anythink.basead.exoplayer.e.a.a.f7699T || i4 == com.anythink.basead.exoplayer.e.a.a.f7710f || i4 == com.anythink.basead.exoplayer.e.a.a.aF;
    }
}

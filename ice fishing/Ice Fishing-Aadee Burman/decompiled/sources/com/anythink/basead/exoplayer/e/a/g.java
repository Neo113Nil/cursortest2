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
    public static final int f7075e = 1;

    /* renamed from: f, reason: collision with root package name */
    private static final int f7076f = 0;

    /* renamed from: g, reason: collision with root package name */
    private static final int f7077g = 1;

    /* renamed from: h, reason: collision with root package name */
    private static final int f7078h = 2;

    /* renamed from: j, reason: collision with root package name */
    private static final long f7079j = 262144;

    /* renamed from: k, reason: collision with root package name */
    private static final long f7080k = 10485760;

    /* renamed from: A, reason: collision with root package name */
    private long[][] f7081A;

    /* renamed from: B, reason: collision with root package name */
    private int f7082B;

    /* renamed from: C, reason: collision with root package name */
    private long f7083C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f7084D;

    /* renamed from: l, reason: collision with root package name */
    private final int f7085l;

    /* renamed from: m, reason: collision with root package name */
    private final s f7086m;

    /* renamed from: n, reason: collision with root package name */
    private final s f7087n;

    /* renamed from: o, reason: collision with root package name */
    private final s f7088o;

    /* renamed from: p, reason: collision with root package name */
    private final ArrayDeque<a.C0021a> f7089p;

    /* renamed from: q, reason: collision with root package name */
    private int f7090q;

    /* renamed from: r, reason: collision with root package name */
    private int f7091r;

    /* renamed from: s, reason: collision with root package name */
    private long f7092s;

    /* renamed from: t, reason: collision with root package name */
    private int f7093t;

    /* renamed from: u, reason: collision with root package name */
    private s f7094u;

    /* renamed from: v, reason: collision with root package name */
    private int f7095v;

    /* renamed from: w, reason: collision with root package name */
    private int f7096w;

    /* renamed from: x, reason: collision with root package name */
    private int f7097x;

    /* renamed from: y, reason: collision with root package name */
    private com.anythink.basead.exoplayer.e.g f7098y;

    /* renamed from: z, reason: collision with root package name */
    private b[] f7099z;

    /* renamed from: d, reason: collision with root package name */
    public static final com.anythink.basead.exoplayer.e.h f7074d = new com.anythink.basead.exoplayer.e.h() { // from class: com.anythink.basead.exoplayer.e.a.g.1
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
        public final j f7100a;

        /* renamed from: b, reason: collision with root package name */
        public final m f7101b;

        /* renamed from: c, reason: collision with root package name */
        public final com.anythink.basead.exoplayer.e.m f7102c;

        /* renamed from: d, reason: collision with root package name */
        public int f7103d;

        public b(j jVar, m mVar, com.anythink.basead.exoplayer.e.m mVar2) {
            this.f7100a = jVar;
            this.f7101b = mVar;
            this.f7102c = mVar2;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public g() {
        this(0);
    }

    private void d() {
        this.f7090q = 0;
        this.f7093t = 0;
    }

    @Override // com.anythink.basead.exoplayer.e.k
    public final boolean a() {
        return true;
    }

    @Override // com.anythink.basead.exoplayer.e.k
    public final long b() {
        return this.f7083C;
    }

    @Override // com.anythink.basead.exoplayer.e.e
    public final void c() {
    }

    public g(int i6) {
        this.f7085l = i6;
        this.f7088o = new s(16);
        this.f7089p = new ArrayDeque<>();
        this.f7086m = new s(p.f8472a);
        this.f7087n = new s(4);
        this.f7095v = -1;
    }

    private boolean b(com.anythink.basead.exoplayer.e.f fVar) {
        if (this.f7093t == 0) {
            if (!fVar.a(this.f7088o.f8502a, 0, 8, true)) {
                return false;
            }
            this.f7093t = 8;
            this.f7088o.c(0);
            this.f7092s = this.f7088o.h();
            this.f7091r = this.f7088o.i();
        }
        long j6 = this.f7092s;
        if (j6 == 1) {
            fVar.b(this.f7088o.f8502a, 8, 8);
            this.f7093t += 8;
            this.f7092s = this.f7088o.n();
        } else if (j6 == 0) {
            long d2 = fVar.d();
            if (d2 == -1 && !this.f7089p.isEmpty()) {
                d2 = this.f7089p.peek().aV;
            }
            if (d2 != -1) {
                this.f7092s = (d2 - fVar.c()) + this.f7093t;
            }
        }
        long j9 = this.f7092s;
        int i6 = this.f7093t;
        if (j9 < i6) {
            throw new t("Atom size less than header length (unsupported).");
        }
        int i9 = this.f7091r;
        if (i9 == com.anythink.basead.exoplayer.e.a.a.f6901G || i9 == com.anythink.basead.exoplayer.e.a.a.f6903I || i9 == com.anythink.basead.exoplayer.e.a.a.J || i9 == com.anythink.basead.exoplayer.e.a.a.f6904K || i9 == com.anythink.basead.exoplayer.e.a.a.f6905L || i9 == com.anythink.basead.exoplayer.e.a.a.f6914U) {
            long c9 = (fVar.c() + this.f7092s) - this.f7093t;
            this.f7089p.push(new a.C0021a(this.f7091r, c9));
            if (this.f7092s == this.f7093t) {
                b(c9);
            } else {
                d();
            }
        } else if (i9 == com.anythink.basead.exoplayer.e.a.a.f6916W || i9 == com.anythink.basead.exoplayer.e.a.a.f6902H || i9 == com.anythink.basead.exoplayer.e.a.a.f6917X || i9 == com.anythink.basead.exoplayer.e.a.a.Y || i9 == com.anythink.basead.exoplayer.e.a.a.ar || i9 == com.anythink.basead.exoplayer.e.a.a.as || i9 == com.anythink.basead.exoplayer.e.a.a.at || i9 == com.anythink.basead.exoplayer.e.a.a.f6915V || i9 == com.anythink.basead.exoplayer.e.a.a.au || i9 == com.anythink.basead.exoplayer.e.a.a.av || i9 == com.anythink.basead.exoplayer.e.a.a.aw || i9 == com.anythink.basead.exoplayer.e.a.a.ax || i9 == com.anythink.basead.exoplayer.e.a.a.ay || i9 == com.anythink.basead.exoplayer.e.a.a.f6913T || i9 == com.anythink.basead.exoplayer.e.a.a.f6924f || i9 == com.anythink.basead.exoplayer.e.a.a.aF) {
            com.anythink.basead.exoplayer.k.a.b(i6 == 8);
            com.anythink.basead.exoplayer.k.a.b(this.f7092s <= 2147483647L);
            s sVar = new s((int) this.f7092s);
            this.f7094u = sVar;
            System.arraycopy(this.f7088o.f8502a, 0, sVar.f8502a, 0, 8);
            this.f7090q = 1;
        } else {
            this.f7094u = null;
            this.f7090q = 1;
        }
        return true;
    }

    private int c(com.anythink.basead.exoplayer.e.f fVar, com.anythink.basead.exoplayer.e.j jVar) {
        long j6;
        long j9;
        long c9 = fVar.c();
        if (this.f7095v == -1) {
            boolean z3 = true;
            boolean z6 = true;
            int i6 = 0;
            int i9 = -1;
            int i10 = -1;
            long j10 = Long.MAX_VALUE;
            long j11 = Long.MAX_VALUE;
            long j12 = Long.MAX_VALUE;
            j6 = f7079j;
            while (true) {
                b[] bVarArr = this.f7099z;
                j9 = 0;
                if (i6 >= bVarArr.length) {
                    break;
                }
                b bVar = bVarArr[i6];
                int i11 = bVar.f7103d;
                m mVar = bVar.f7101b;
                if (i11 != mVar.f7147b) {
                    long j13 = mVar.f7148c[i11];
                    long j14 = this.f7081A[i6][i11];
                    long j15 = j13 - c9;
                    boolean z9 = j15 < 0 || j15 >= f7079j;
                    if ((!z9 && z3) || (z9 == z3 && j15 < j12)) {
                        i10 = i6;
                        z3 = z9;
                        j11 = j14;
                        j12 = j15;
                    }
                    if (j14 < j10) {
                        i9 = i6;
                        z6 = z9;
                        j10 = j14;
                    }
                }
                i6++;
            }
            int i12 = (j10 == Long.MAX_VALUE || !z6 || j11 < j10 + f7080k) ? i10 : i9;
            this.f7095v = i12;
            if (i12 == -1) {
                return -1;
            }
        } else {
            j6 = f7079j;
            j9 = 0;
        }
        b bVar2 = this.f7099z[this.f7095v];
        com.anythink.basead.exoplayer.e.m mVar2 = bVar2.f7102c;
        int i13 = bVar2.f7103d;
        m mVar3 = bVar2.f7101b;
        long j16 = mVar3.f7148c[i13];
        int i14 = mVar3.f7149d[i13];
        long j17 = (j16 - c9) + this.f7096w;
        if (j17 < j9 || j17 >= j6) {
            jVar.f7175a = j16;
            return 1;
        }
        if (bVar2.f7100a.i == 1) {
            j17 += 8;
            i14 -= 8;
        }
        fVar.c((int) j17);
        int i15 = bVar2.f7100a.f7120l;
        if (i15 == 0) {
            while (true) {
                int i16 = this.f7096w;
                if (i16 >= i14) {
                    break;
                }
                int a9 = mVar2.a(fVar, i14 - i16, false);
                this.f7096w += a9;
                this.f7097x -= a9;
            }
        } else {
            byte[] bArr = this.f7087n.f8502a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i17 = 4 - i15;
            while (this.f7096w < i14) {
                int i18 = this.f7097x;
                if (i18 == 0) {
                    fVar.b(this.f7087n.f8502a, i17, i15);
                    this.f7087n.c(0);
                    this.f7097x = this.f7087n.m();
                    this.f7086m.c(0);
                    mVar2.a(this.f7086m, 4);
                    this.f7096w += 4;
                    i14 += i17;
                } else {
                    int a10 = mVar2.a(fVar, i18, false);
                    this.f7096w += a10;
                    this.f7097x -= a10;
                }
            }
        }
        int i19 = i14;
        m mVar4 = bVar2.f7101b;
        mVar2.a(mVar4.f7151f[i13], mVar4.f7152g[i13], i19, 0, null);
        bVar2.f7103d++;
        this.f7095v = -1;
        this.f7096w = 0;
        this.f7097x = 0;
        return 0;
    }

    @Override // com.anythink.basead.exoplayer.e.e
    public final boolean a(com.anythink.basead.exoplayer.e.f fVar) {
        return i.b(fVar);
    }

    private void d(long j6) {
        for (b bVar : this.f7099z) {
            m mVar = bVar.f7101b;
            int a9 = mVar.a(j6);
            if (a9 == -1) {
                a9 = mVar.b(j6);
            }
            bVar.f7103d = a9;
        }
    }

    @Override // com.anythink.basead.exoplayer.e.e
    public final void a(com.anythink.basead.exoplayer.e.g gVar) {
        this.f7098y = gVar;
    }

    @Override // com.anythink.basead.exoplayer.e.e
    public final void a(long j6, long j9) {
        this.f7089p.clear();
        this.f7093t = 0;
        this.f7095v = -1;
        this.f7096w = 0;
        this.f7097x = 0;
        if (j6 == 0) {
            d();
            return;
        }
        b[] bVarArr = this.f7099z;
        if (bVarArr != null) {
            for (b bVar : bVarArr) {
                m mVar = bVar.f7101b;
                int a9 = mVar.a(j9);
                if (a9 == -1) {
                    a9 = mVar.b(j9);
                }
                bVar.f7103d = a9;
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
        boolean z3;
        while (true) {
            int i6 = this.f7090q;
            boolean z6 = false;
            if (i6 == 0) {
                if (this.f7093t == 0) {
                    if (!fVar.a(this.f7088o.f8502a, 0, 8, true)) {
                        return -1;
                    }
                    this.f7093t = 8;
                    this.f7088o.c(0);
                    this.f7092s = this.f7088o.h();
                    this.f7091r = this.f7088o.i();
                }
                long j10 = this.f7092s;
                if (j10 == 1) {
                    fVar.b(this.f7088o.f8502a, 8, 8);
                    this.f7093t += 8;
                    this.f7092s = this.f7088o.n();
                } else if (j10 == 0) {
                    long d2 = fVar.d();
                    if (d2 == -1 && !this.f7089p.isEmpty()) {
                        d2 = this.f7089p.peek().aV;
                    }
                    if (d2 != -1) {
                        this.f7092s = (d2 - fVar.c()) + this.f7093t;
                    }
                }
                long j11 = this.f7092s;
                int i9 = this.f7093t;
                if (j11 >= i9) {
                    int i10 = this.f7091r;
                    if (i10 != com.anythink.basead.exoplayer.e.a.a.f6901G && i10 != com.anythink.basead.exoplayer.e.a.a.f6903I && i10 != com.anythink.basead.exoplayer.e.a.a.J && i10 != com.anythink.basead.exoplayer.e.a.a.f6904K && i10 != com.anythink.basead.exoplayer.e.a.a.f6905L && i10 != com.anythink.basead.exoplayer.e.a.a.f6914U) {
                        if (i10 != com.anythink.basead.exoplayer.e.a.a.f6916W && i10 != com.anythink.basead.exoplayer.e.a.a.f6902H && i10 != com.anythink.basead.exoplayer.e.a.a.f6917X && i10 != com.anythink.basead.exoplayer.e.a.a.Y && i10 != com.anythink.basead.exoplayer.e.a.a.ar && i10 != com.anythink.basead.exoplayer.e.a.a.as && i10 != com.anythink.basead.exoplayer.e.a.a.at && i10 != com.anythink.basead.exoplayer.e.a.a.f6915V && i10 != com.anythink.basead.exoplayer.e.a.a.au && i10 != com.anythink.basead.exoplayer.e.a.a.av && i10 != com.anythink.basead.exoplayer.e.a.a.aw && i10 != com.anythink.basead.exoplayer.e.a.a.ax && i10 != com.anythink.basead.exoplayer.e.a.a.ay && i10 != com.anythink.basead.exoplayer.e.a.a.f6913T && i10 != com.anythink.basead.exoplayer.e.a.a.f6924f && i10 != com.anythink.basead.exoplayer.e.a.a.aF) {
                            this.f7094u = null;
                            this.f7090q = 1;
                        } else {
                            boolean z9 = false;
                            com.anythink.basead.exoplayer.k.a.b(z9);
                            com.anythink.basead.exoplayer.k.a.b(this.f7092s <= 2147483647L);
                            s sVar = new s((int) this.f7092s);
                            this.f7094u = sVar;
                            System.arraycopy(this.f7088o.f8502a, 0, sVar.f8502a, 0, 8);
                            this.f7090q = 1;
                        }
                    } else {
                        long c9 = (fVar.c() + this.f7092s) - this.f7093t;
                        this.f7089p.push(new a.C0021a(this.f7091r, c9));
                        if (this.f7092s == this.f7093t) {
                            b(c9);
                        } else {
                            d();
                        }
                    }
                } else {
                    throw new t("Atom size less than header length (unsupported).");
                }
            } else {
                if (i6 != 1) {
                    if (i6 == 2) {
                        long c10 = fVar.c();
                        if (this.f7095v == -1) {
                            int i11 = -1;
                            int i12 = -1;
                            boolean z10 = true;
                            boolean z11 = true;
                            int i13 = 0;
                            long j12 = Long.MAX_VALUE;
                            long j13 = Long.MAX_VALUE;
                            long j14 = Long.MAX_VALUE;
                            j6 = 0;
                            while (true) {
                                b[] bVarArr = this.f7099z;
                                j9 = f7079j;
                                if (i13 >= bVarArr.length) {
                                    break;
                                }
                                b bVar = bVarArr[i13];
                                int i14 = bVar.f7103d;
                                m mVar = bVar.f7101b;
                                if (i14 != mVar.f7147b) {
                                    long j15 = mVar.f7148c[i14];
                                    long j16 = this.f7081A[i13][i14];
                                    long j17 = j15 - c10;
                                    boolean z12 = j17 < 0 || j17 >= f7079j;
                                    if ((!z12 && z10) || (z12 == z10 && j17 < j14)) {
                                        i12 = i13;
                                        z10 = z12;
                                        j13 = j16;
                                        j14 = j17;
                                    }
                                    if (j16 < j12) {
                                        i11 = i13;
                                        z11 = z12;
                                        j12 = j16;
                                    }
                                }
                                i13++;
                            }
                            int i15 = (j12 == Long.MAX_VALUE || !z11 || j13 < j12 + f7080k) ? i12 : i11;
                            this.f7095v = i15;
                            if (i15 == -1) {
                                return -1;
                            }
                        } else {
                            j6 = 0;
                            j9 = f7079j;
                        }
                        b bVar2 = this.f7099z[this.f7095v];
                        com.anythink.basead.exoplayer.e.m mVar2 = bVar2.f7102c;
                        int i16 = bVar2.f7103d;
                        m mVar3 = bVar2.f7101b;
                        long j18 = mVar3.f7148c[i16];
                        int i17 = mVar3.f7149d[i16];
                        long j19 = (j18 - c10) + this.f7096w;
                        if (j19 >= j6 && j19 < j9) {
                            if (bVar2.f7100a.i == 1) {
                                j19 += 8;
                                i17 -= 8;
                            }
                            fVar.c((int) j19);
                            int i18 = bVar2.f7100a.f7120l;
                            if (i18 == 0) {
                                while (true) {
                                    int i19 = this.f7096w;
                                    if (i19 >= i17) {
                                        break;
                                    }
                                    int a9 = mVar2.a(fVar, i17 - i19, false);
                                    this.f7096w += a9;
                                    this.f7097x -= a9;
                                }
                            } else {
                                byte[] bArr = this.f7087n.f8502a;
                                bArr[0] = 0;
                                bArr[1] = 0;
                                bArr[2] = 0;
                                int i20 = 4 - i18;
                                while (this.f7096w < i17) {
                                    int i21 = this.f7097x;
                                    if (i21 == 0) {
                                        fVar.b(this.f7087n.f8502a, i20, i18);
                                        this.f7087n.c(0);
                                        this.f7097x = this.f7087n.m();
                                        this.f7086m.c(0);
                                        mVar2.a(this.f7086m, 4);
                                        this.f7096w += 4;
                                        i17 += i20;
                                    } else {
                                        int a10 = mVar2.a(fVar, i21, false);
                                        this.f7096w += a10;
                                        this.f7097x -= a10;
                                    }
                                }
                            }
                            int i22 = i17;
                            m mVar4 = bVar2.f7101b;
                            mVar2.a(mVar4.f7151f[i16], mVar4.f7152g[i16], i22, 0, null);
                            bVar2.f7103d++;
                            this.f7095v = -1;
                            this.f7096w = 0;
                            this.f7097x = 0;
                            return 0;
                        }
                        jVar.f7175a = j18;
                        return 1;
                    }
                    throw new IllegalStateException();
                }
                long j20 = this.f7092s - this.f7093t;
                long c11 = fVar.c() + j20;
                s sVar2 = this.f7094u;
                if (sVar2 != null) {
                    fVar.b(sVar2.f8502a, this.f7093t, (int) j20);
                    if (this.f7091r == com.anythink.basead.exoplayer.e.a.a.f6924f) {
                        s sVar3 = this.f7094u;
                        sVar3.c(8);
                        if (sVar3.i() != i) {
                            sVar3.d(4);
                            while (sVar3.a() > 0) {
                                if (sVar3.i() == i) {
                                }
                            }
                            z3 = false;
                            this.f7084D = z3;
                        }
                        z3 = true;
                        this.f7084D = z3;
                    } else if (!this.f7089p.isEmpty()) {
                        this.f7089p.peek().a(new a.b(this.f7091r, this.f7094u));
                    }
                } else if (j20 < f7079j) {
                    fVar.c((int) j20);
                } else {
                    jVar.f7175a = fVar.c() + j20;
                    z6 = true;
                }
                b(c11);
                if (z6 && this.f7090q != 2) {
                    return 1;
                }
            }
        }
    }

    private boolean b(com.anythink.basead.exoplayer.e.f fVar, com.anythink.basead.exoplayer.e.j jVar) {
        boolean z3;
        boolean z6;
        long j6 = this.f7092s - this.f7093t;
        long c9 = fVar.c() + j6;
        s sVar = this.f7094u;
        if (sVar != null) {
            fVar.b(sVar.f8502a, this.f7093t, (int) j6);
            if (this.f7091r == com.anythink.basead.exoplayer.e.a.a.f6924f) {
                s sVar2 = this.f7094u;
                sVar2.c(8);
                if (sVar2.i() != i) {
                    sVar2.d(4);
                    while (sVar2.a() > 0) {
                        if (sVar2.i() == i) {
                        }
                    }
                    z6 = false;
                    this.f7084D = z6;
                }
                z6 = true;
                this.f7084D = z6;
            } else if (!this.f7089p.isEmpty()) {
                this.f7089p.peek().a(new a.b(this.f7091r, this.f7094u));
            }
        } else if (j6 < f7079j) {
            fVar.c((int) j6);
        } else {
            jVar.f7175a = fVar.c() + j6;
            z3 = true;
            b(c9);
            return (z3 || this.f7090q == 2) ? false : true;
        }
        z3 = false;
        b(c9);
        if (z3) {
        }
    }

    private int c(long j6) {
        int i6 = -1;
        int i9 = -1;
        int i10 = 0;
        long j9 = Long.MAX_VALUE;
        boolean z3 = true;
        long j10 = Long.MAX_VALUE;
        boolean z6 = true;
        long j11 = Long.MAX_VALUE;
        while (true) {
            b[] bVarArr = this.f7099z;
            if (i10 >= bVarArr.length) {
                break;
            }
            b bVar = bVarArr[i10];
            int i11 = bVar.f7103d;
            m mVar = bVar.f7101b;
            if (i11 != mVar.f7147b) {
                long j12 = mVar.f7148c[i11];
                long j13 = this.f7081A[i10][i11];
                long j14 = j12 - j6;
                boolean z9 = j14 < 0 || j14 >= f7079j;
                if ((!z9 && z6) || (z9 == z6 && j14 < j11)) {
                    z6 = z9;
                    j10 = j13;
                    i9 = i10;
                    j11 = j14;
                }
                if (j13 < j9) {
                    z3 = z9;
                    j9 = j13;
                    i6 = i10;
                }
            }
            i10++;
        }
        return (j9 == Long.MAX_VALUE || !z3 || j10 < j9 + f7080k) ? i9 : i6;
    }

    private void b(long j6) {
        while (!this.f7089p.isEmpty() && this.f7089p.peek().aV == j6) {
            a.C0021a pop = this.f7089p.pop();
            if (pop.aU == com.anythink.basead.exoplayer.e.a.a.f6901G) {
                a(pop);
                this.f7089p.clear();
                this.f7090q = 2;
            } else if (!this.f7089p.isEmpty()) {
                this.f7089p.peek().a(pop);
            }
        }
        if (this.f7090q != 2) {
            d();
        }
    }

    private static boolean b(int i6) {
        return i6 == com.anythink.basead.exoplayer.e.a.a.f6901G || i6 == com.anythink.basead.exoplayer.e.a.a.f6903I || i6 == com.anythink.basead.exoplayer.e.a.a.J || i6 == com.anythink.basead.exoplayer.e.a.a.f6904K || i6 == com.anythink.basead.exoplayer.e.a.a.f6905L || i6 == com.anythink.basead.exoplayer.e.a.a.f6914U;
    }

    @Override // com.anythink.basead.exoplayer.e.k
    public final k.a a(long j6) {
        long j9;
        long j10;
        int b9;
        b[] bVarArr = this.f7099z;
        if (bVarArr.length == 0) {
            return new k.a(com.anythink.basead.exoplayer.e.l.f7180a);
        }
        int i6 = this.f7082B;
        long j11 = -1;
        if (i6 != -1) {
            m mVar = bVarArr[i6].f7101b;
            int a9 = a(mVar, j6);
            if (a9 == -1) {
                return new k.a(com.anythink.basead.exoplayer.e.l.f7180a);
            }
            long j12 = mVar.f7151f[a9];
            j9 = mVar.f7148c[a9];
            if (j12 >= j6 || a9 >= mVar.f7147b - 1 || (b9 = mVar.b(j6)) == -1 || b9 == a9) {
                j10 = -9223372036854775807L;
            } else {
                j10 = mVar.f7151f[b9];
                j11 = mVar.f7148c[b9];
            }
            j6 = j12;
        } else {
            j9 = Long.MAX_VALUE;
            j10 = -9223372036854775807L;
        }
        int i9 = 0;
        while (true) {
            b[] bVarArr2 = this.f7099z;
            if (i9 >= bVarArr2.length) {
                break;
            }
            if (i9 != this.f7082B) {
                m mVar2 = bVarArr2[i9].f7101b;
                long a10 = a(mVar2, j6, j9);
                if (j10 != com.anythink.basead.exoplayer.b.f6382b) {
                    j11 = a(mVar2, j10, j11);
                }
                j9 = a10;
            }
            i9++;
        }
        com.anythink.basead.exoplayer.e.l lVar = new com.anythink.basead.exoplayer.e.l(j6, j9);
        if (j10 == com.anythink.basead.exoplayer.b.f6382b) {
            return new k.a(lVar);
        }
        return new k.a(lVar, new com.anythink.basead.exoplayer.e.l(j10, j11));
    }

    private void a(a.C0021a c0021a) {
        com.anythink.basead.exoplayer.g.a aVar;
        ArrayList<m> a9;
        ArrayList arrayList = new ArrayList();
        com.anythink.basead.exoplayer.e.i iVar = new com.anythink.basead.exoplayer.e.i();
        a.b d2 = c0021a.d(com.anythink.basead.exoplayer.e.a.a.aF);
        if (d2 != null) {
            aVar = com.anythink.basead.exoplayer.e.a.b.a(d2, this.f7084D);
            if (aVar != null) {
                iVar.a(aVar);
            }
        } else {
            aVar = null;
        }
        int i6 = 1;
        int i9 = 0;
        try {
            a9 = a(c0021a, iVar, (this.f7085l & 1) != 0);
        } catch (b.g unused) {
            iVar = new com.anythink.basead.exoplayer.e.i();
            a9 = a(c0021a, iVar, true);
        }
        int size = a9.size();
        int i10 = -1;
        long j6 = com.anythink.basead.exoplayer.b.f6382b;
        while (i9 < size) {
            m mVar = a9.get(i9);
            j jVar = mVar.f7146a;
            b bVar = new b(jVar, mVar, this.f7098y.a(i9, jVar.f7113d));
            com.anythink.basead.exoplayer.m a10 = jVar.f7117h.a(mVar.f7150e + 30);
            if (jVar.f7113d == i6) {
                if (iVar.a()) {
                    a10 = a10.a(iVar.f7173b, iVar.f7174c);
                }
                if (aVar != null) {
                    a10 = a10.a(aVar);
                }
            }
            bVar.f7102c.a(a10);
            com.anythink.basead.exoplayer.e.i iVar2 = iVar;
            com.anythink.basead.exoplayer.g.a aVar2 = aVar;
            long j9 = jVar.f7116g;
            if (j9 == com.anythink.basead.exoplayer.b.f6382b) {
                j9 = mVar.f7153h;
            }
            j6 = Math.max(j6, j9);
            if (jVar.f7113d == 2 && i10 == -1) {
                i10 = arrayList.size();
            }
            arrayList.add(bVar);
            i9++;
            aVar = aVar2;
            iVar = iVar2;
            i6 = 1;
        }
        this.f7082B = i10;
        this.f7083C = j6;
        b[] bVarArr = (b[]) arrayList.toArray(new b[arrayList.size()]);
        this.f7099z = bVarArr;
        this.f7081A = a(bVarArr);
        this.f7098y.c_();
        this.f7098y.a(this);
    }

    private ArrayList<m> a(a.C0021a c0021a, com.anythink.basead.exoplayer.e.i iVar, boolean z3) {
        boolean z6;
        ArrayList<m> arrayList = new ArrayList<>();
        int i6 = 0;
        while (i6 < c0021a.aX.size()) {
            a.C0021a c0021a2 = c0021a.aX.get(i6);
            if (c0021a2.aU == com.anythink.basead.exoplayer.e.a.a.f6903I) {
                z6 = z3;
                j a9 = com.anythink.basead.exoplayer.e.a.b.a(c0021a2, c0021a.d(com.anythink.basead.exoplayer.e.a.a.f6902H), com.anythink.basead.exoplayer.b.f6382b, (com.anythink.basead.exoplayer.d.e) null, z6, this.f7084D);
                if (a9 != null) {
                    m a10 = com.anythink.basead.exoplayer.e.a.b.a(a9, c0021a2.e(com.anythink.basead.exoplayer.e.a.a.J).e(com.anythink.basead.exoplayer.e.a.a.f6904K).e(com.anythink.basead.exoplayer.e.a.a.f6905L), iVar);
                    if (a10.f7147b != 0) {
                        arrayList.add(a10);
                    }
                }
            } else {
                z6 = z3;
            }
            i6++;
            z3 = z6;
        }
        return arrayList;
    }

    private static long[][] a(b[] bVarArr) {
        long[][] jArr = new long[bVarArr.length][];
        int[] iArr = new int[bVarArr.length];
        long[] jArr2 = new long[bVarArr.length];
        boolean[] zArr = new boolean[bVarArr.length];
        for (int i6 = 0; i6 < bVarArr.length; i6++) {
            jArr[i6] = new long[bVarArr[i6].f7101b.f7147b];
            jArr2[i6] = bVarArr[i6].f7101b.f7151f[0];
        }
        long j6 = 0;
        int i9 = 0;
        while (i9 < bVarArr.length) {
            long j9 = Long.MAX_VALUE;
            int i10 = -1;
            for (int i11 = 0; i11 < bVarArr.length; i11++) {
                if (!zArr[i11]) {
                    long j10 = jArr2[i11];
                    if (j10 <= j9) {
                        i10 = i11;
                        j9 = j10;
                    }
                }
            }
            int i12 = iArr[i10];
            long[] jArr3 = jArr[i10];
            jArr3[i12] = j6;
            m mVar = bVarArr[i10].f7101b;
            j6 += mVar.f7149d[i12];
            int i13 = i12 + 1;
            iArr[i10] = i13;
            if (i13 < jArr3.length) {
                jArr2[i10] = mVar.f7151f[i13];
            } else {
                zArr[i10] = true;
                i9++;
            }
        }
        return jArr;
    }

    private static long a(m mVar, long j6, long j9) {
        int a9 = a(mVar, j6);
        return a9 == -1 ? j9 : Math.min(mVar.f7148c[a9], j9);
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

    private static boolean a(int i6) {
        return i6 == com.anythink.basead.exoplayer.e.a.a.f6916W || i6 == com.anythink.basead.exoplayer.e.a.a.f6902H || i6 == com.anythink.basead.exoplayer.e.a.a.f6917X || i6 == com.anythink.basead.exoplayer.e.a.a.Y || i6 == com.anythink.basead.exoplayer.e.a.a.ar || i6 == com.anythink.basead.exoplayer.e.a.a.as || i6 == com.anythink.basead.exoplayer.e.a.a.at || i6 == com.anythink.basead.exoplayer.e.a.a.f6915V || i6 == com.anythink.basead.exoplayer.e.a.a.au || i6 == com.anythink.basead.exoplayer.e.a.a.av || i6 == com.anythink.basead.exoplayer.e.a.a.aw || i6 == com.anythink.basead.exoplayer.e.a.a.ax || i6 == com.anythink.basead.exoplayer.e.a.a.ay || i6 == com.anythink.basead.exoplayer.e.a.a.f6913T || i6 == com.anythink.basead.exoplayer.e.a.a.f6924f || i6 == com.anythink.basead.exoplayer.e.a.a.aF;
    }
}

package com.anythink.basead.exoplayer.e.a;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.anythink.basead.exoplayer.d.e;
import com.anythink.basead.exoplayer.e.a.a;
import com.anythink.basead.exoplayer.e.k;
import com.anythink.basead.exoplayer.e.m;
import com.anythink.basead.exoplayer.k.ac;
import com.anythink.basead.exoplayer.k.af;
import com.anythink.basead.exoplayer.k.o;
import com.anythink.basead.exoplayer.k.p;
import com.anythink.basead.exoplayer.k.s;
import com.anythink.basead.exoplayer.t;
import com.google.android.gms.internal.ads.Wv;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class e implements com.anythink.basead.exoplayer.e.e {

    /* renamed from: e, reason: collision with root package name */
    public static final int f7774e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f7775f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final int f7776g = 4;

    /* renamed from: h, reason: collision with root package name */
    public static final int f7777h = 16;
    private static final int i = 8;

    /* renamed from: j, reason: collision with root package name */
    private static final String f7778j = "FragmentedMp4Extractor";

    /* renamed from: n, reason: collision with root package name */
    private static final int f7782n = 0;

    /* renamed from: o, reason: collision with root package name */
    private static final int f7783o = 1;

    /* renamed from: p, reason: collision with root package name */
    private static final int f7784p = 2;

    /* renamed from: q, reason: collision with root package name */
    private static final int f7785q = 3;

    /* renamed from: r, reason: collision with root package name */
    private static final int f7786r = 4;

    /* renamed from: A, reason: collision with root package name */
    private final ac f7787A;

    /* renamed from: B, reason: collision with root package name */
    private final s f7788B;

    /* renamed from: C, reason: collision with root package name */
    private final byte[] f7789C;

    /* renamed from: D, reason: collision with root package name */
    private final ArrayDeque<a.C0021a> f7790D;

    /* renamed from: E, reason: collision with root package name */
    private final ArrayDeque<b> f7791E;

    /* renamed from: F, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.e.m f7792F;

    /* renamed from: G, reason: collision with root package name */
    private int f7793G;

    /* renamed from: H, reason: collision with root package name */
    private int f7794H;

    /* renamed from: I, reason: collision with root package name */
    private long f7795I;
    private int J;

    /* renamed from: K, reason: collision with root package name */
    private s f7796K;

    /* renamed from: L, reason: collision with root package name */
    private long f7797L;

    /* renamed from: M, reason: collision with root package name */
    private int f7798M;

    /* renamed from: N, reason: collision with root package name */
    private long f7799N;

    /* renamed from: O, reason: collision with root package name */
    private long f7800O;

    /* renamed from: P, reason: collision with root package name */
    private long f7801P;

    /* renamed from: Q, reason: collision with root package name */
    private c f7802Q;

    /* renamed from: R, reason: collision with root package name */
    private int f7803R;

    /* renamed from: S, reason: collision with root package name */
    private int f7804S;

    /* renamed from: T, reason: collision with root package name */
    private int f7805T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f7806U;

    /* renamed from: V, reason: collision with root package name */
    private com.anythink.basead.exoplayer.e.g f7807V;

    /* renamed from: W, reason: collision with root package name */
    private com.anythink.basead.exoplayer.e.m[] f7808W;

    /* renamed from: X, reason: collision with root package name */
    private com.anythink.basead.exoplayer.e.m[] f7809X;
    private boolean Y;

    /* renamed from: s, reason: collision with root package name */
    private final int f7810s;

    /* renamed from: t, reason: collision with root package name */
    private final j f7811t;

    /* renamed from: u, reason: collision with root package name */
    private final List<com.anythink.basead.exoplayer.m> f7812u;

    /* renamed from: v, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.d.e f7813v;

    /* renamed from: w, reason: collision with root package name */
    private final SparseArray<c> f7814w;

    /* renamed from: x, reason: collision with root package name */
    private final s f7815x;

    /* renamed from: y, reason: collision with root package name */
    private final s f7816y;

    /* renamed from: z, reason: collision with root package name */
    private final s f7817z;

    /* renamed from: d, reason: collision with root package name */
    public static final com.anythink.basead.exoplayer.e.h f7773d = new com.anythink.basead.exoplayer.e.h() { // from class: com.anythink.basead.exoplayer.e.a.e.1
        @Override // com.anythink.basead.exoplayer.e.h
        public final com.anythink.basead.exoplayer.e.e[] a() {
            return new com.anythink.basead.exoplayer.e.e[]{new e()};
        }
    };

    /* renamed from: k, reason: collision with root package name */
    private static final int f7779k = af.f("seig");

    /* renamed from: l, reason: collision with root package name */
    private static final byte[] f7780l = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: m, reason: collision with root package name */
    private static final com.anythink.basead.exoplayer.m f7781m = com.anythink.basead.exoplayer.m.a((String) null, o.ai);

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final long f7818a;

        /* renamed from: b, reason: collision with root package name */
        public final int f7819b;

        public b(long j6, int i) {
            this.f7818a = j6;
            this.f7819b = i;
        }
    }

    public e() {
        this(0);
    }

    private boolean b(com.anythink.basead.exoplayer.e.f fVar) {
        if (this.J == 0) {
            if (!fVar.a(this.f7788B.f9288a, 0, 8, true)) {
                return false;
            }
            this.J = 8;
            this.f7788B.c(0);
            this.f7795I = this.f7788B.h();
            this.f7794H = this.f7788B.i();
        }
        long j6 = this.f7795I;
        if (j6 == 1) {
            fVar.b(this.f7788B.f9288a, 8, 8);
            this.J += 8;
            this.f7795I = this.f7788B.n();
        } else if (j6 == 0) {
            long d9 = fVar.d();
            if (d9 == -1 && !this.f7790D.isEmpty()) {
                d9 = this.f7790D.peek().aV;
            }
            if (d9 != -1) {
                this.f7795I = (d9 - fVar.c()) + this.J;
            }
        }
        if (this.f7795I < this.J) {
            throw new t("Atom size less than header length (unsupported).");
        }
        long c9 = fVar.c() - this.J;
        if (this.f7794H == com.anythink.basead.exoplayer.e.a.a.f7695P) {
            int size = this.f7814w.size();
            for (int i4 = 0; i4 < size; i4++) {
                l lVar = this.f7814w.valueAt(i4).f7821b;
                lVar.f7915b = c9;
                lVar.f7917d = c9;
                lVar.f7916c = c9;
            }
        }
        int i6 = this.f7794H;
        if (i6 == com.anythink.basead.exoplayer.e.a.a.f7716m) {
            this.f7802Q = null;
            this.f7797L = this.f7795I + c9;
            if (!this.Y) {
                this.f7807V.a(new k.b(this.f7800O, c9));
                this.Y = true;
            }
            this.f7793G = 2;
            return true;
        }
        if (i6 == com.anythink.basead.exoplayer.e.a.a.f7687G || i6 == com.anythink.basead.exoplayer.e.a.a.f7689I || i6 == com.anythink.basead.exoplayer.e.a.a.J || i6 == com.anythink.basead.exoplayer.e.a.a.f7690K || i6 == com.anythink.basead.exoplayer.e.a.a.f7691L || i6 == com.anythink.basead.exoplayer.e.a.a.f7695P || i6 == com.anythink.basead.exoplayer.e.a.a.f7696Q || i6 == com.anythink.basead.exoplayer.e.a.a.f7697R || i6 == com.anythink.basead.exoplayer.e.a.a.f7700U) {
            long c10 = (fVar.c() + this.f7795I) - 8;
            this.f7790D.push(new a.C0021a(this.f7794H, c10));
            if (this.f7795I == this.J) {
                a(c10);
            } else {
                a();
            }
        } else if (i6 == com.anythink.basead.exoplayer.e.a.a.f7703X || i6 == com.anythink.basead.exoplayer.e.a.a.f7702W || i6 == com.anythink.basead.exoplayer.e.a.a.f7688H || i6 == com.anythink.basead.exoplayer.e.a.a.f7686F || i6 == com.anythink.basead.exoplayer.e.a.a.Y || i6 == com.anythink.basead.exoplayer.e.a.a.f7682B || i6 == com.anythink.basead.exoplayer.e.a.a.f7683C || i6 == com.anythink.basead.exoplayer.e.a.a.f7699T || i6 == com.anythink.basead.exoplayer.e.a.a.f7684D || i6 == com.anythink.basead.exoplayer.e.a.a.f7685E || i6 == com.anythink.basead.exoplayer.e.a.a.f7704Z || i6 == com.anythink.basead.exoplayer.e.a.a.ah || i6 == com.anythink.basead.exoplayer.e.a.a.ai || i6 == com.anythink.basead.exoplayer.e.a.a.am || i6 == com.anythink.basead.exoplayer.e.a.a.al || i6 == com.anythink.basead.exoplayer.e.a.a.aj || i6 == com.anythink.basead.exoplayer.e.a.a.ak || i6 == com.anythink.basead.exoplayer.e.a.a.f7701V || i6 == com.anythink.basead.exoplayer.e.a.a.f7698S || i6 == com.anythink.basead.exoplayer.e.a.a.aL) {
            if (this.J != 8) {
                throw new t("Leaf atom defines extended atom size (unsupported).");
            }
            long j9 = this.f7795I;
            if (j9 > 2147483647L) {
                throw new t("Leaf atom with length > 2147483647 (unsupported).");
            }
            s sVar = new s((int) j9);
            this.f7796K = sVar;
            System.arraycopy(this.f7788B.f9288a, 0, sVar.f9288a, 0, 8);
            this.f7793G = 1;
        } else {
            if (this.f7795I > 2147483647L) {
                throw new t("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.f7796K = null;
            this.f7793G = 1;
        }
        return true;
    }

    private static long d(s sVar) {
        sVar.c(8);
        return com.anythink.basead.exoplayer.e.a.a.a(sVar.i()) == 1 ? sVar.n() : sVar.h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [int] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.anythink.basead.exoplayer.e.m] */
    private boolean e(com.anythink.basead.exoplayer.e.f fVar) {
        ?? r17;
        m.a aVar;
        boolean z6;
        int i4;
        int a9;
        int i6;
        int i9 = 4;
        int i10 = 1;
        if (this.f7793G == 3) {
            if (this.f7802Q == null) {
                SparseArray<c> sparseArray = this.f7814w;
                int size = sparseArray.size();
                long j6 = Long.MAX_VALUE;
                c cVar = null;
                for (int i11 = 0; i11 < size; i11++) {
                    c valueAt = sparseArray.valueAt(i11);
                    int i12 = valueAt.f7826g;
                    l lVar = valueAt.f7821b;
                    if (i12 != lVar.f7918e) {
                        long j9 = lVar.f7920g[i12];
                        if (j9 < j6) {
                            cVar = valueAt;
                            j6 = j9;
                        }
                    }
                }
                i6 = 0;
                if (cVar == null) {
                    int c9 = (int) (this.f7797L - fVar.c());
                    if (c9 < 0) {
                        throw new t("Offset to end of mdat was negative.");
                    }
                    fVar.c(c9);
                    a();
                    return false;
                }
                int c10 = (int) (cVar.f7821b.f7920g[cVar.f7826g] - fVar.c());
                if (c10 < 0) {
                    Log.w(f7778j, "Ignoring negative offset to sample data.");
                    c10 = 0;
                }
                fVar.c(c10);
                this.f7802Q = cVar;
            } else {
                i6 = 0;
            }
            c cVar2 = this.f7802Q;
            int[] iArr = cVar2.f7821b.i;
            int i13 = cVar2.f7824e;
            int i14 = iArr[i13];
            this.f7803R = i14;
            if (i13 < cVar2.f7827h) {
                fVar.c(i14);
                c.a(this.f7802Q);
                if (!this.f7802Q.b()) {
                    this.f7802Q = null;
                }
                this.f7793G = 3;
                return true;
            }
            if (cVar2.f7822c.i == 1) {
                this.f7803R = i14 - 8;
                fVar.c(8);
            }
            int c11 = this.f7802Q.c();
            this.f7804S = c11;
            this.f7803R += c11;
            this.f7793G = 4;
            this.f7805T = i6;
        }
        c cVar3 = this.f7802Q;
        l lVar2 = cVar3.f7821b;
        j jVar = cVar3.f7822c;
        ?? r9 = cVar3.f7820a;
        int i15 = cVar3.f7824e;
        long b9 = lVar2.b(i15) * 1000;
        ac acVar = this.f7787A;
        if (acVar != null) {
            b9 = acVar.b(b9);
        }
        int i16 = jVar.f7906l;
        if (i16 == 0) {
            r17 = 1;
            while (true) {
                int i17 = this.f7804S;
                int i18 = this.f7803R;
                if (i17 >= i18) {
                    break;
                }
                this.f7804S += r9.a(fVar, i18 - i17, false);
            }
        } else {
            byte[] bArr = this.f7816y.f9288a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i19 = i16 + 1;
            int i20 = 4 - i16;
            while (this.f7804S < this.f7803R) {
                int i21 = this.f7805T;
                if (i21 == 0) {
                    fVar.b(bArr, i20, i19);
                    this.f7816y.c(0);
                    this.f7805T = this.f7816y.m() - i10;
                    this.f7815x.c(0);
                    r9.a(this.f7815x, i9);
                    r9.a(this.f7816y, i10);
                    this.f7806U = (this.f7809X.length <= 0 || !p.a(jVar.f7903h.f9451h, bArr[i9])) ? 0 : i10;
                    this.f7804S += 5;
                    this.f7803R += i20;
                } else {
                    if (this.f7806U) {
                        this.f7817z.a(i21);
                        fVar.b(this.f7817z.f9288a, 0, this.f7805T);
                        r9.a(this.f7817z, this.f7805T);
                        a9 = this.f7805T;
                        s sVar = this.f7817z;
                        int a10 = p.a(sVar.f9288a, sVar.b());
                        i4 = i10;
                        this.f7817z.c(o.i.equals(jVar.f7903h.f9451h) ? 1 : 0);
                        this.f7817z.b(a10);
                    } else {
                        i4 = i10;
                        a9 = r9.a(fVar, i21, false);
                    }
                    this.f7804S += a9;
                    this.f7805T -= a9;
                    i10 = i4;
                    i9 = 4;
                }
            }
            r17 = i10;
        }
        boolean z9 = lVar2.f7924l[i15];
        if (lVar2.f7925m) {
            ?? r1 = (z9 ? 1 : 0) | 0;
            k kVar = lVar2.f7927o;
            if (kVar == null) {
                kVar = jVar.a(lVar2.f7914a.f7762a);
            }
            aVar = kVar.f7911c;
            z6 = r1;
        } else {
            aVar = null;
            z6 = z9;
        }
        r9.a(b9, z6, this.f7803R, 0, aVar);
        while (!this.f7791E.isEmpty()) {
            b removeFirst = this.f7791E.removeFirst();
            this.f7798M -= removeFirst.f7819b;
            long j10 = removeFirst.f7818a + b9;
            ac acVar2 = this.f7787A;
            if (acVar2 != null) {
                j10 = acVar2.b(j10);
            }
            long j11 = j10;
            for (com.anythink.basead.exoplayer.e.m mVar : this.f7808W) {
                mVar.a(j11, 1, removeFirst.f7819b, this.f7798M, null);
            }
        }
        if (!this.f7802Q.b()) {
            this.f7802Q = null;
        }
        this.f7793G = 3;
        return r17;
    }

    @Override // com.anythink.basead.exoplayer.e.e
    public final boolean a(com.anythink.basead.exoplayer.e.f fVar) {
        return i.a(fVar);
    }

    @Override // com.anythink.basead.exoplayer.e.e
    public final void c() {
    }

    public e(int i4) {
        this(i4, null);
    }

    private void c(com.anythink.basead.exoplayer.e.f fVar) {
        long n9;
        long n10;
        int i4 = ((int) this.f7795I) - this.J;
        s sVar = this.f7796K;
        if (sVar != null) {
            fVar.b(sVar.f9288a, 8, i4);
            a.b bVar = new a.b(this.f7794H, this.f7796K);
            long c9 = fVar.c();
            if (this.f7790D.isEmpty()) {
                int i6 = bVar.aU;
                if (i6 == com.anythink.basead.exoplayer.e.a.a.f7686F) {
                    s sVar2 = bVar.aV;
                    sVar2.c(8);
                    int a9 = com.anythink.basead.exoplayer.e.a.a.a(sVar2.i());
                    sVar2.d(4);
                    long h3 = sVar2.h();
                    if (a9 == 0) {
                        n9 = sVar2.h();
                        n10 = sVar2.h();
                    } else {
                        n9 = sVar2.n();
                        n10 = sVar2.n();
                    }
                    long j6 = n10 + c9;
                    long a10 = af.a(n9, 1000000L, h3);
                    sVar2.d(2);
                    int e9 = sVar2.e();
                    int[] iArr = new int[e9];
                    long[] jArr = new long[e9];
                    long[] jArr2 = new long[e9];
                    long[] jArr3 = new long[e9];
                    long j9 = n9;
                    long j10 = a10;
                    int i9 = 0;
                    while (i9 < e9) {
                        int i10 = sVar2.i();
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            throw new t("Unhandled indirect reference");
                        }
                        long h9 = sVar2.h();
                        iArr[i9] = i10 & Integer.MAX_VALUE;
                        jArr[i9] = j6;
                        jArr3[i9] = j10;
                        long j11 = j9 + h9;
                        long[] jArr4 = jArr;
                        long[] jArr5 = jArr2;
                        int i11 = i9;
                        j10 = af.a(j11, 1000000L, h3);
                        jArr5[i11] = j10 - jArr3[i11];
                        sVar2.d(4);
                        j6 += iArr[i11];
                        int i12 = i11 + 1;
                        jArr2 = jArr5;
                        j9 = j11;
                        i9 = i12;
                        jArr = jArr4;
                    }
                    Pair create = Pair.create(Long.valueOf(a10), new com.anythink.basead.exoplayer.e.a(iArr, jArr, jArr2, jArr3));
                    this.f7801P = ((Long) create.first).longValue();
                    this.f7807V.a((com.anythink.basead.exoplayer.e.k) create.second);
                    this.Y = true;
                } else if (i6 == com.anythink.basead.exoplayer.e.a.a.aL) {
                    s sVar3 = bVar.aV;
                    com.anythink.basead.exoplayer.e.m[] mVarArr = this.f7808W;
                    if (mVarArr != null && mVarArr.length != 0) {
                        sVar3.c(12);
                        int a11 = sVar3.a();
                        sVar3.p();
                        sVar3.p();
                        long a12 = af.a(sVar3.h(), 1000000L, sVar3.h());
                        for (com.anythink.basead.exoplayer.e.m mVar : this.f7808W) {
                            sVar3.c(12);
                            mVar.a(sVar3, a11);
                        }
                        long j12 = this.f7801P;
                        if (j12 != com.anythink.basead.exoplayer.b.f7168b) {
                            long j13 = j12 + a12;
                            ac acVar = this.f7787A;
                            if (acVar != null) {
                                j13 = acVar.b(j13);
                            }
                            long j14 = j13;
                            for (com.anythink.basead.exoplayer.e.m mVar2 : this.f7808W) {
                                mVar2.a(j14, 1, a11, 0, null);
                            }
                        } else {
                            this.f7791E.addLast(new b(a12, a11));
                            this.f7798M += a11;
                        }
                    }
                }
            } else {
                this.f7790D.peek().a(bVar);
            }
        } else {
            fVar.c(i4);
        }
        a(fVar.c());
    }

    @Override // com.anythink.basead.exoplayer.e.e
    public final void a(com.anythink.basead.exoplayer.e.g gVar) {
        this.f7807V = gVar;
        j jVar = this.f7811t;
        if (jVar != null) {
            c cVar = new c(gVar.a(0, jVar.f7899d));
            cVar.a(this.f7811t, new com.anythink.basead.exoplayer.e.a.c(0, 0, 0, 0));
            this.f7814w.put(0, cVar);
            b();
            this.f7807V.c_();
        }
    }

    private e(int i4, ac acVar) {
        this(i4, acVar, null, null);
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final com.anythink.basead.exoplayer.e.m f7820a;

        /* renamed from: c, reason: collision with root package name */
        public j f7822c;

        /* renamed from: d, reason: collision with root package name */
        public com.anythink.basead.exoplayer.e.a.c f7823d;

        /* renamed from: e, reason: collision with root package name */
        public int f7824e;

        /* renamed from: f, reason: collision with root package name */
        public int f7825f;

        /* renamed from: g, reason: collision with root package name */
        public int f7826g;

        /* renamed from: h, reason: collision with root package name */
        public int f7827h;

        /* renamed from: b, reason: collision with root package name */
        public final l f7821b = new l();
        private final s i = new s(1);

        /* renamed from: j, reason: collision with root package name */
        private final s f7828j = new s();

        public c(com.anythink.basead.exoplayer.e.m mVar) {
            this.f7820a = mVar;
        }

        private void d() {
            l lVar = this.f7821b;
            if (lVar.f7925m) {
                s sVar = lVar.f7929q;
                int i = e().f7912d;
                if (i != 0) {
                    sVar.d(i);
                }
                if (this.f7821b.f7926n[this.f7824e]) {
                    sVar.d(sVar.e() * 6);
                }
            }
        }

        private k e() {
            l lVar = this.f7821b;
            int i = lVar.f7914a.f7762a;
            k kVar = lVar.f7927o;
            return kVar != null ? kVar : this.f7822c.a(i);
        }

        public final void a(j jVar, com.anythink.basead.exoplayer.e.a.c cVar) {
            this.f7822c = (j) com.anythink.basead.exoplayer.k.a.a(jVar);
            this.f7823d = (com.anythink.basead.exoplayer.e.a.c) com.anythink.basead.exoplayer.k.a.a(cVar);
            this.f7820a.a(jVar.f7903h);
            a();
        }

        public final boolean b() {
            this.f7824e++;
            int i = this.f7825f + 1;
            this.f7825f = i;
            int[] iArr = this.f7821b.f7921h;
            int i4 = this.f7826g;
            if (i != iArr[i4]) {
                return true;
            }
            this.f7826g = i4 + 1;
            this.f7825f = 0;
            return false;
        }

        public final int c() {
            s sVar;
            if (!this.f7821b.f7925m) {
                return 0;
            }
            k e9 = e();
            int i = e9.f7912d;
            if (i != 0) {
                sVar = this.f7821b.f7929q;
            } else {
                byte[] bArr = e9.f7913e;
                this.f7828j.a(bArr, bArr.length);
                s sVar2 = this.f7828j;
                i = bArr.length;
                sVar = sVar2;
            }
            boolean z6 = this.f7821b.f7926n[this.f7824e];
            s sVar3 = this.i;
            sVar3.f9288a[0] = (byte) ((z6 ? 128 : 0) | i);
            sVar3.c(0);
            this.f7820a.a(this.i, 1);
            this.f7820a.a(sVar, i);
            if (!z6) {
                return i + 1;
            }
            s sVar4 = this.f7821b.f7929q;
            int e10 = sVar4.e();
            sVar4.d(-2);
            int i4 = (e10 * 6) + 2;
            this.f7820a.a(sVar4, i4);
            return i + 1 + i4;
        }

        public final void a(com.anythink.basead.exoplayer.d.e eVar) {
            k a9 = this.f7822c.a(this.f7821b.f7914a.f7762a);
            this.f7820a.a(this.f7822c.f7903h.a(eVar.a(a9 != null ? a9.f7910b : null)));
        }

        public final void a() {
            this.f7821b.a();
            this.f7824e = 0;
            this.f7826g = 0;
            this.f7825f = 0;
            this.f7827h = 0;
        }

        public final void a(long j6) {
            long a9 = com.anythink.basead.exoplayer.b.a(j6);
            int i = this.f7824e;
            while (true) {
                l lVar = this.f7821b;
                if (i >= lVar.f7919f || lVar.b(i) >= a9) {
                    return;
                }
                if (this.f7821b.f7924l[i]) {
                    this.f7827h = i;
                }
                i++;
            }
        }

        public static /* synthetic */ void a(c cVar) {
            l lVar = cVar.f7821b;
            if (lVar.f7925m) {
                s sVar = lVar.f7929q;
                int i = cVar.e().f7912d;
                if (i != 0) {
                    sVar.d(i);
                }
                if (cVar.f7821b.f7926n[cVar.f7824e]) {
                    sVar.d(sVar.e() * 6);
                }
            }
        }
    }

    private e(int i4, ac acVar, j jVar, com.anythink.basead.exoplayer.d.e eVar) {
        this(i4, acVar, jVar, eVar, Collections.EMPTY_LIST);
    }

    private void d(com.anythink.basead.exoplayer.e.f fVar) {
        int size = this.f7814w.size();
        c cVar = null;
        long j6 = Long.MAX_VALUE;
        for (int i4 = 0; i4 < size; i4++) {
            l lVar = this.f7814w.valueAt(i4).f7821b;
            if (lVar.f7930r) {
                long j9 = lVar.f7917d;
                if (j9 < j6) {
                    cVar = this.f7814w.valueAt(i4);
                    j6 = j9;
                }
            }
        }
        if (cVar == null) {
            this.f7793G = 3;
            return;
        }
        int c9 = (int) (j6 - fVar.c());
        if (c9 >= 0) {
            fVar.c(c9);
            l lVar2 = cVar.f7821b;
            fVar.b(lVar2.f7929q.f9288a, 0, lVar2.f7928p);
            lVar2.f7929q.c(0);
            lVar2.f7930r = false;
            return;
        }
        throw new t("Offset to encryption data was negative.");
    }

    private e(int i4, ac acVar, j jVar, com.anythink.basead.exoplayer.d.e eVar, List<com.anythink.basead.exoplayer.m> list) {
        this(i4, acVar, jVar, eVar, list, null);
    }

    private e(int i4, ac acVar, j jVar, com.anythink.basead.exoplayer.d.e eVar, List<com.anythink.basead.exoplayer.m> list, com.anythink.basead.exoplayer.e.m mVar) {
        this.f7810s = i4 | (jVar != null ? 8 : 0);
        this.f7787A = acVar;
        this.f7811t = jVar;
        this.f7813v = eVar;
        this.f7812u = Collections.unmodifiableList(list);
        this.f7792F = mVar;
        this.f7788B = new s(16);
        this.f7815x = new s(p.f9258a);
        this.f7816y = new s(5);
        this.f7817z = new s();
        this.f7789C = new byte[16];
        this.f7790D = new ArrayDeque<>();
        this.f7791E = new ArrayDeque<>();
        this.f7814w = new SparseArray<>();
        this.f7800O = com.anythink.basead.exoplayer.b.f7168b;
        this.f7799N = com.anythink.basead.exoplayer.b.f7168b;
        this.f7801P = com.anythink.basead.exoplayer.b.f7168b;
        a();
    }

    @Override // com.anythink.basead.exoplayer.e.e
    public final void a(long j6, long j9) {
        int size = this.f7814w.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f7814w.valueAt(i4).a();
        }
        this.f7791E.clear();
        this.f7798M = 0;
        this.f7799N = j9;
        this.f7790D.clear();
        a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:269:0x0084, code lost:
    
        r2 = r28.f7802Q;
        r3 = r2.f7821b.i;
        r7 = r2.f7824e;
        r3 = r3[r7];
        r28.f7803R = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0092, code lost:
    
        if (r7 >= r2.f7827h) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0094, code lost:
    
        r29.c(r3);
        com.anythink.basead.exoplayer.e.a.e.c.a(r28.f7802Q);
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x00a2, code lost:
    
        if (r28.f7802Q.b() != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x00a4, code lost:
    
        r28.f7802Q = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x00a6, code lost:
    
        r28.f7793G = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x00a8, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x00b0, code lost:
    
        if (r2.f7822c.i != 1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x00b2, code lost:
    
        r28.f7803R = r3 - 8;
        r29.c(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x00b8, code lost:
    
        r2 = r28.f7802Q.c();
        r28.f7804S = r2;
        r28.f7803R += r2;
        r28.f7793G = 4;
        r28.f7805T = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x00ce, code lost:
    
        r2 = r28.f7802Q;
        r3 = r2.f7821b;
        r5 = r2.f7822c;
        r7 = r2.f7820a;
        r2 = r2.f7824e;
        r8 = r3.b(r2) * 1000;
        r10 = r28.f7787A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x00e1, code lost:
    
        if (r10 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x00e3, code lost:
    
        r8 = r10.b(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x00e7, code lost:
    
        r19 = r8;
        r8 = r5.f7906l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x00eb, code lost:
    
        if (r8 == 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x00ed, code lost:
    
        r9 = r28.f7816y.f9288a;
        r9[0] = 0;
        r9[1] = 0;
        r9[r30] = 0;
        r10 = r8 + 1;
        r8 = 4 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0103, code lost:
    
        if (r28.f7804S >= r28.f7803R) goto L336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0105, code lost:
    
        r12 = r28.f7805T;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0107, code lost:
    
        if (r12 != 0) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x014f, code lost:
    
        if (r28.f7806U == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0151, code lost:
    
        r28.f7817z.a(r12);
        r29.b(r28.f7817z.f9288a, 0, r28.f7805T);
        r7.a(r28.f7817z, r28.f7805T);
        r12 = r28.f7805T;
        r13 = r28.f7817z;
        r13 = com.anythink.basead.exoplayer.k.p.a(r13.f9288a, r13.b());
        r28.f7817z.c(com.anythink.basead.exoplayer.k.o.i.equals(r5.f7903h.f9451h) ? 1 : 0);
        r28.f7817z.b(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x018f, code lost:
    
        r28.f7804S += r12;
        r28.f7805T -= r12;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x018a, code lost:
    
        r12 = r7.a(r29, r12, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0109, code lost:
    
        r29.b(r9, r8, r10);
        r28.f7816y.c(0);
        r28.f7805T = r28.f7816y.m() - r6;
        r28.f7815x.c(0);
        r7.a(r28.f7815x, 4);
        r7.a(r28.f7816y, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x012e, code lost:
    
        if (r28.f7809X.length <= 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x013a, code lost:
    
        if (com.anythink.basead.exoplayer.k.p.a(r5.f7903h.f9451h, r9[4]) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x013c, code lost:
    
        r12 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x013f, code lost:
    
        r28.f7806U = r12;
        r28.f7804S += 5;
        r28.f7803R += r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x013e, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x01ae, code lost:
    
        r1 = r3.f7924l[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x01b4, code lost:
    
        if (r3.f7925m == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x01b6, code lost:
    
        r1 = (r1 ? 1 : 0) | 0;
        r2 = r3.f7927o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x01bb, code lost:
    
        if (r2 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x01be, code lost:
    
        r2 = r5.a(r3.f7914a.f7762a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x01c6, code lost:
    
        r24 = r2.f7911c;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x01d0, code lost:
    
        r7.a(r19, r1, r28.f7803R, 0, r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x01e1, code lost:
    
        if (r28.f7791E.isEmpty() != false) goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x01e3, code lost:
    
        r1 = r28.f7791E.removeFirst();
        r28.f7798M -= r1.f7819b;
        r2 = r19 + r1.f7818a;
        r5 = r28.f7787A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x01f8, code lost:
    
        if (r5 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x01fa, code lost:
    
        r2 = r5.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x01fe, code lost:
    
        r22 = r2;
        r2 = r28.f7808W;
        r3 = r2.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0204, code lost:
    
        if (r5 >= r3) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0206, code lost:
    
        r2[r5].a(r22, 1, r1.f7819b, r28.f7798M, null);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0220, code lost:
    
        if (r28.f7802Q.b() != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0222, code lost:
    
        r28.f7802Q = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0224, code lost:
    
        r28.f7793G = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x01cd, code lost:
    
        r24 = null;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x019c, code lost:
    
        r6 = r28.f7804S;
        r8 = r28.f7803R;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x01a0, code lost:
    
        if (r6 >= r8) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x01a2, code lost:
    
        r28.f7804S += r7.a(r29, r8 - r6, false);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r21v0, types: [int] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.anythink.basead.exoplayer.e.m] */
    @Override // com.anythink.basead.exoplayer.e.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(com.anythink.basead.exoplayer.e.f fVar, com.anythink.basead.exoplayer.e.j jVar) {
        char c9;
        long n9;
        long n10;
        while (true) {
            int i4 = this.f7793G;
            char c10 = 2;
            c cVar = null;
            int i6 = 1;
            if (i4 == 0) {
                if (this.J == 0) {
                    if (!fVar.a(this.f7788B.f9288a, 0, 8, true)) {
                        return -1;
                    }
                    this.J = 8;
                    this.f7788B.c(0);
                    this.f7795I = this.f7788B.h();
                    this.f7794H = this.f7788B.i();
                }
                long j6 = this.f7795I;
                if (j6 == 1) {
                    fVar.b(this.f7788B.f9288a, 8, 8);
                    this.J += 8;
                    this.f7795I = this.f7788B.n();
                } else if (j6 == 0) {
                    long d9 = fVar.d();
                    if (d9 == -1 && !this.f7790D.isEmpty()) {
                        d9 = this.f7790D.peek().aV;
                    }
                    if (d9 != -1) {
                        this.f7795I = (d9 - fVar.c()) + this.J;
                    }
                }
                if (this.f7795I >= this.J) {
                    long c11 = fVar.c() - this.J;
                    if (this.f7794H == com.anythink.basead.exoplayer.e.a.a.f7695P) {
                        int size = this.f7814w.size();
                        for (int i9 = 0; i9 < size; i9++) {
                            l lVar = this.f7814w.valueAt(i9).f7821b;
                            lVar.f7915b = c11;
                            lVar.f7917d = c11;
                            lVar.f7916c = c11;
                        }
                    }
                    int i10 = this.f7794H;
                    if (i10 == com.anythink.basead.exoplayer.e.a.a.f7716m) {
                        this.f7802Q = null;
                        this.f7797L = this.f7795I + c11;
                        if (!this.Y) {
                            this.f7807V.a(new k.b(this.f7800O, c11));
                            this.Y = true;
                        }
                        this.f7793G = 2;
                    } else if (i10 != com.anythink.basead.exoplayer.e.a.a.f7687G && i10 != com.anythink.basead.exoplayer.e.a.a.f7689I && i10 != com.anythink.basead.exoplayer.e.a.a.J && i10 != com.anythink.basead.exoplayer.e.a.a.f7690K && i10 != com.anythink.basead.exoplayer.e.a.a.f7691L && i10 != com.anythink.basead.exoplayer.e.a.a.f7695P && i10 != com.anythink.basead.exoplayer.e.a.a.f7696Q && i10 != com.anythink.basead.exoplayer.e.a.a.f7697R && i10 != com.anythink.basead.exoplayer.e.a.a.f7700U) {
                        if (i10 == com.anythink.basead.exoplayer.e.a.a.f7703X || i10 == com.anythink.basead.exoplayer.e.a.a.f7702W || i10 == com.anythink.basead.exoplayer.e.a.a.f7688H || i10 == com.anythink.basead.exoplayer.e.a.a.f7686F || i10 == com.anythink.basead.exoplayer.e.a.a.Y || i10 == com.anythink.basead.exoplayer.e.a.a.f7682B || i10 == com.anythink.basead.exoplayer.e.a.a.f7683C || i10 == com.anythink.basead.exoplayer.e.a.a.f7699T || i10 == com.anythink.basead.exoplayer.e.a.a.f7684D || i10 == com.anythink.basead.exoplayer.e.a.a.f7685E || i10 == com.anythink.basead.exoplayer.e.a.a.f7704Z || i10 == com.anythink.basead.exoplayer.e.a.a.ah || i10 == com.anythink.basead.exoplayer.e.a.a.ai || i10 == com.anythink.basead.exoplayer.e.a.a.am || i10 == com.anythink.basead.exoplayer.e.a.a.al || i10 == com.anythink.basead.exoplayer.e.a.a.aj || i10 == com.anythink.basead.exoplayer.e.a.a.ak || i10 == com.anythink.basead.exoplayer.e.a.a.f7701V || i10 == com.anythink.basead.exoplayer.e.a.a.f7698S || i10 == com.anythink.basead.exoplayer.e.a.a.aL) {
                            if (this.J == 8) {
                                long j9 = this.f7795I;
                                if (j9 <= 2147483647L) {
                                    s sVar = new s((int) j9);
                                    this.f7796K = sVar;
                                    System.arraycopy(this.f7788B.f9288a, 0, sVar.f9288a, 0, 8);
                                    this.f7793G = 1;
                                } else {
                                    throw new t("Leaf atom with length > 2147483647 (unsupported).");
                                }
                            } else {
                                throw new t("Leaf atom defines extended atom size (unsupported).");
                            }
                        } else if (this.f7795I <= 2147483647L) {
                            this.f7796K = null;
                            this.f7793G = 1;
                        } else {
                            throw new t("Skipping atom with length > 2147483647 (unsupported).");
                        }
                    } else {
                        long c12 = (fVar.c() + this.f7795I) - 8;
                        this.f7790D.push(new a.C0021a(this.f7794H, c12));
                        if (this.f7795I == this.J) {
                            a(c12);
                        } else {
                            a();
                        }
                    }
                } else {
                    throw new t("Atom size less than header length (unsupported).");
                }
            } else if (i4 != 1) {
                long j10 = Long.MAX_VALUE;
                if (i4 != 2) {
                    if (i4 != 3) {
                        c9 = 2;
                        break;
                    }
                    if (this.f7802Q != null) {
                        c9 = 2;
                        break;
                    }
                    SparseArray<c> sparseArray = this.f7814w;
                    int size2 = sparseArray.size();
                    c cVar2 = null;
                    int i11 = 0;
                    while (i11 < size2) {
                        c valueAt = sparseArray.valueAt(i11);
                        char c13 = c10;
                        int i12 = valueAt.f7826g;
                        l lVar2 = valueAt.f7821b;
                        if (i12 != lVar2.f7918e) {
                            long j11 = lVar2.f7920g[i12];
                            if (j11 < j10) {
                                cVar2 = valueAt;
                                j10 = j11;
                            }
                        }
                        i11++;
                        c10 = c13;
                    }
                    c9 = c10;
                    if (cVar2 == null) {
                        int c14 = (int) (this.f7797L - fVar.c());
                        if (c14 >= 0) {
                            fVar.c(c14);
                            a();
                        } else {
                            throw new t("Offset to end of mdat was negative.");
                        }
                    } else {
                        int c15 = (int) (cVar2.f7821b.f7920g[cVar2.f7826g] - fVar.c());
                        if (c15 < 0) {
                            Log.w(f7778j, "Ignoring negative offset to sample data.");
                            c15 = 0;
                        }
                        fVar.c(c15);
                        this.f7802Q = cVar2;
                    }
                } else {
                    int size3 = this.f7814w.size();
                    for (int i13 = 0; i13 < size3; i13++) {
                        l lVar3 = this.f7814w.valueAt(i13).f7821b;
                        if (lVar3.f7930r) {
                            long j12 = lVar3.f7917d;
                            if (j12 < j10) {
                                cVar = this.f7814w.valueAt(i13);
                                j10 = j12;
                            }
                        }
                    }
                    if (cVar == null) {
                        this.f7793G = 3;
                    } else {
                        int c16 = (int) (j10 - fVar.c());
                        if (c16 >= 0) {
                            fVar.c(c16);
                            l lVar4 = cVar.f7821b;
                            fVar.b(lVar4.f7929q.f9288a, 0, lVar4.f7928p);
                            lVar4.f7929q.c(0);
                            lVar4.f7930r = false;
                        } else {
                            throw new t("Offset to encryption data was negative.");
                        }
                    }
                }
            } else {
                int i14 = ((int) this.f7795I) - this.J;
                s sVar2 = this.f7796K;
                if (sVar2 != null) {
                    fVar.b(sVar2.f9288a, 8, i14);
                    a.b bVar = new a.b(this.f7794H, this.f7796K);
                    long c17 = fVar.c();
                    if (!this.f7790D.isEmpty()) {
                        this.f7790D.peek().a(bVar);
                    } else {
                        int i15 = bVar.aU;
                        if (i15 == com.anythink.basead.exoplayer.e.a.a.f7686F) {
                            s sVar3 = bVar.aV;
                            sVar3.c(8);
                            int a9 = com.anythink.basead.exoplayer.e.a.a.a(sVar3.i());
                            sVar3.d(4);
                            long h3 = sVar3.h();
                            if (a9 == 0) {
                                n9 = sVar3.h();
                                n10 = sVar3.h();
                            } else {
                                n9 = sVar3.n();
                                n10 = sVar3.n();
                            }
                            long j13 = n10 + c17;
                            long j14 = n9;
                            long a10 = af.a(j14, 1000000L, h3);
                            sVar3.d(2);
                            int e9 = sVar3.e();
                            int[] iArr = new int[e9];
                            long[] jArr = new long[e9];
                            long[] jArr2 = new long[e9];
                            long[] jArr3 = new long[e9];
                            long j15 = a10;
                            int i16 = 0;
                            while (i16 < e9) {
                                int i17 = sVar3.i();
                                if ((i17 & Integer.MIN_VALUE) == 0) {
                                    long h9 = sVar3.h();
                                    iArr[i16] = i17 & Integer.MAX_VALUE;
                                    jArr[i16] = j13;
                                    jArr3[i16] = j15;
                                    long j16 = j14 + h9;
                                    int i18 = i16;
                                    long[] jArr4 = jArr3;
                                    long a11 = af.a(j16, 1000000L, h3);
                                    jArr2[i18] = a11 - jArr4[i18];
                                    int i19 = e9;
                                    sVar3.d(4);
                                    long j17 = j13 + iArr[i18];
                                    int i20 = i18 + 1;
                                    j15 = a11;
                                    jArr3 = jArr4;
                                    j13 = j17;
                                    i16 = i20;
                                    j14 = j16;
                                    e9 = i19;
                                } else {
                                    throw new t("Unhandled indirect reference");
                                }
                            }
                            Pair create = Pair.create(Long.valueOf(a10), new com.anythink.basead.exoplayer.e.a(iArr, jArr, jArr2, jArr3));
                            this.f7801P = ((Long) create.first).longValue();
                            this.f7807V.a((com.anythink.basead.exoplayer.e.k) create.second);
                            this.Y = true;
                        } else if (i15 == com.anythink.basead.exoplayer.e.a.a.aL) {
                            s sVar4 = bVar.aV;
                            com.anythink.basead.exoplayer.e.m[] mVarArr = this.f7808W;
                            if (mVarArr != null && mVarArr.length != 0) {
                                sVar4.c(12);
                                int a12 = sVar4.a();
                                sVar4.p();
                                sVar4.p();
                                long a13 = af.a(sVar4.h(), 1000000L, sVar4.h());
                                for (com.anythink.basead.exoplayer.e.m mVar : this.f7808W) {
                                    sVar4.c(12);
                                    mVar.a(sVar4, a12);
                                }
                                long j18 = this.f7801P;
                                if (j18 != com.anythink.basead.exoplayer.b.f7168b) {
                                    long j19 = j18 + a13;
                                    ac acVar = this.f7787A;
                                    if (acVar != null) {
                                        j19 = acVar.b(j19);
                                    }
                                    long j20 = j19;
                                    for (com.anythink.basead.exoplayer.e.m mVar2 : this.f7808W) {
                                        mVar2.a(j20, 1, a12, 0, null);
                                    }
                                } else {
                                    this.f7791E.addLast(new b(a13, a12));
                                    this.f7798M += a12;
                                }
                            }
                        }
                    }
                } else {
                    fVar.c(i14);
                }
                a(fVar.c());
            }
        }
    }

    private void b(a.C0021a c0021a) {
        int i4 = 0;
        com.anythink.basead.exoplayer.k.a.b(this.f7811t == null, "Unexpected moov box.");
        com.anythink.basead.exoplayer.d.e eVar = this.f7813v;
        if (eVar == null) {
            eVar = a(c0021a.aW);
        }
        com.anythink.basead.exoplayer.d.e eVar2 = eVar;
        a.C0021a e9 = c0021a.e(com.anythink.basead.exoplayer.e.a.a.f7697R);
        SparseArray sparseArray = new SparseArray();
        int size = e9.aW.size();
        long j6 = -9223372036854775807L;
        for (int i6 = 0; i6 < size; i6++) {
            a.b bVar = e9.aW.get(i6);
            int i9 = bVar.aU;
            if (i9 == com.anythink.basead.exoplayer.e.a.a.f7684D) {
                Pair<Integer, com.anythink.basead.exoplayer.e.a.c> b9 = b(bVar.aV);
                sparseArray.put(((Integer) b9.first).intValue(), (com.anythink.basead.exoplayer.e.a.c) b9.second);
            } else if (i9 == com.anythink.basead.exoplayer.e.a.a.f7698S) {
                j6 = c(bVar.aV);
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        int size2 = c0021a.aX.size();
        for (int i10 = 0; i10 < size2; i10++) {
            a.C0021a c0021a2 = c0021a.aX.get(i10);
            if (c0021a2.aU == com.anythink.basead.exoplayer.e.a.a.f7689I) {
                j a9 = com.anythink.basead.exoplayer.e.a.b.a(c0021a2, c0021a.d(com.anythink.basead.exoplayer.e.a.a.f7688H), j6, eVar2, (this.f7810s & 16) != 0, false);
                if (a9 != null) {
                    sparseArray2.put(a9.f7898c, a9);
                }
            }
        }
        int size3 = sparseArray2.size();
        if (this.f7814w.size() == 0) {
            while (i4 < size3) {
                j jVar = (j) sparseArray2.valueAt(i4);
                c cVar = new c(this.f7807V.a(i4, jVar.f7899d));
                cVar.a(jVar, a((SparseArray<com.anythink.basead.exoplayer.e.a.c>) sparseArray, jVar.f7898c));
                this.f7814w.put(jVar.f7898c, cVar);
                this.f7800O = Math.max(this.f7800O, jVar.f7902g);
                i4++;
            }
            b();
            this.f7807V.c_();
            return;
        }
        com.anythink.basead.exoplayer.k.a.b(this.f7814w.size() == size3);
        while (i4 < size3) {
            j jVar2 = (j) sparseArray2.valueAt(i4);
            this.f7814w.get(jVar2.f7898c).a(jVar2, a((SparseArray<com.anythink.basead.exoplayer.e.a.c>) sparseArray, jVar2.f7898c));
            i4++;
        }
    }

    private void c(a.C0021a c0021a) {
        a(c0021a, this.f7814w, this.f7810s, this.f7789C);
        com.anythink.basead.exoplayer.d.e a9 = this.f7813v != null ? null : a(c0021a.aW);
        if (a9 != null) {
            int size = this.f7814w.size();
            for (int i4 = 0; i4 < size; i4++) {
                this.f7814w.valueAt(i4).a(a9);
            }
        }
        if (this.f7799N != com.anythink.basead.exoplayer.b.f7168b) {
            int size2 = this.f7814w.size();
            for (int i6 = 0; i6 < size2; i6++) {
                this.f7814w.valueAt(i6).a(this.f7799N);
            }
            this.f7799N = com.anythink.basead.exoplayer.b.f7168b;
        }
    }

    private static long c(s sVar) {
        sVar.c(8);
        return com.anythink.basead.exoplayer.e.a.a.a(sVar.i()) == 0 ? sVar.h() : sVar.n();
    }

    private void b() {
        int i4;
        if (this.f7808W == null) {
            com.anythink.basead.exoplayer.e.m[] mVarArr = new com.anythink.basead.exoplayer.e.m[2];
            this.f7808W = mVarArr;
            com.anythink.basead.exoplayer.e.m mVar = this.f7792F;
            if (mVar != null) {
                mVarArr[0] = mVar;
                i4 = 1;
            } else {
                i4 = 0;
            }
            if ((this.f7810s & 4) != 0) {
                mVarArr[i4] = this.f7807V.a(this.f7814w.size(), 4);
                i4++;
            }
            com.anythink.basead.exoplayer.e.m[] mVarArr2 = (com.anythink.basead.exoplayer.e.m[]) Arrays.copyOf(this.f7808W, i4);
            this.f7808W = mVarArr2;
            for (com.anythink.basead.exoplayer.e.m mVar2 : mVarArr2) {
                mVar2.a(f7781m);
            }
        }
        if (this.f7809X == null) {
            this.f7809X = new com.anythink.basead.exoplayer.e.m[this.f7812u.size()];
            for (int i6 = 0; i6 < this.f7809X.length; i6++) {
                com.anythink.basead.exoplayer.e.m a9 = this.f7807V.a(this.f7814w.size() + 1 + i6, 3);
                a9.a(this.f7812u.get(i6));
                this.f7809X[i6] = a9;
            }
        }
    }

    private static Pair<Integer, com.anythink.basead.exoplayer.e.a.c> b(s sVar) {
        sVar.c(12);
        return Pair.create(Integer.valueOf(sVar.i()), new com.anythink.basead.exoplayer.e.a.c(sVar.m() - 1, sVar.m(), sVar.m(), sVar.i()));
    }

    private static void b(a.C0021a c0021a, SparseArray<c> sparseArray, int i4, byte[] bArr) {
        c a9 = a(c0021a.d(com.anythink.basead.exoplayer.e.a.a.f7683C).aV, sparseArray);
        if (a9 == null) {
            return;
        }
        l lVar = a9.f7821b;
        long j6 = lVar.f7931s;
        a9.a();
        int i6 = com.anythink.basead.exoplayer.e.a.a.f7682B;
        if (c0021a.d(i6) != null && (i4 & 2) == 0) {
            j6 = d(c0021a.d(i6).aV);
        }
        a(c0021a, a9, j6, i4);
        k a10 = a9.f7822c.a(lVar.f7914a.f7762a);
        a.b d9 = c0021a.d(com.anythink.basead.exoplayer.e.a.a.ah);
        if (d9 != null) {
            a(a10, d9.aV, lVar);
        }
        a.b d10 = c0021a.d(com.anythink.basead.exoplayer.e.a.a.ai);
        if (d10 != null) {
            a(d10.aV, lVar);
        }
        a.b d11 = c0021a.d(com.anythink.basead.exoplayer.e.a.a.am);
        if (d11 != null) {
            a(d11.aV, 0, lVar);
        }
        a.b d12 = c0021a.d(com.anythink.basead.exoplayer.e.a.a.aj);
        a.b d13 = c0021a.d(com.anythink.basead.exoplayer.e.a.a.ak);
        if (d12 != null && d13 != null) {
            a(d12.aV, d13.aV, a10 != null ? a10.f7910b : null, lVar);
        }
        int size = c0021a.aW.size();
        for (int i9 = 0; i9 < size; i9++) {
            a.b bVar = c0021a.aW.get(i9);
            if (bVar.aU == com.anythink.basead.exoplayer.e.a.a.al) {
                a(bVar.aV, lVar, bArr);
            }
        }
    }

    private static c b(SparseArray<c> sparseArray, int i4) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return sparseArray.get(i4);
    }

    private static void b(s sVar, l lVar) {
        a(sVar, 0, lVar);
    }

    private void b(long j6) {
        while (!this.f7791E.isEmpty()) {
            b removeFirst = this.f7791E.removeFirst();
            this.f7798M -= removeFirst.f7819b;
            long j9 = removeFirst.f7818a + j6;
            ac acVar = this.f7787A;
            if (acVar != null) {
                j9 = acVar.b(j9);
            }
            long j10 = j9;
            for (com.anythink.basead.exoplayer.e.m mVar : this.f7808W) {
                mVar.a(j10, 1, removeFirst.f7819b, this.f7798M, null);
            }
        }
    }

    private static boolean b(int i4) {
        return i4 == com.anythink.basead.exoplayer.e.a.a.f7687G || i4 == com.anythink.basead.exoplayer.e.a.a.f7689I || i4 == com.anythink.basead.exoplayer.e.a.a.J || i4 == com.anythink.basead.exoplayer.e.a.a.f7690K || i4 == com.anythink.basead.exoplayer.e.a.a.f7691L || i4 == com.anythink.basead.exoplayer.e.a.a.f7695P || i4 == com.anythink.basead.exoplayer.e.a.a.f7696Q || i4 == com.anythink.basead.exoplayer.e.a.a.f7697R || i4 == com.anythink.basead.exoplayer.e.a.a.f7700U;
    }

    private void a() {
        this.f7793G = 0;
        this.J = 0;
    }

    private void a(long j6) {
        while (!this.f7790D.isEmpty() && this.f7790D.peek().aV == j6) {
            a(this.f7790D.pop());
        }
        a();
    }

    private void a(a.b bVar, long j6) {
        long n9;
        long n10;
        if (!this.f7790D.isEmpty()) {
            this.f7790D.peek().a(bVar);
            return;
        }
        int i4 = bVar.aU;
        if (i4 == com.anythink.basead.exoplayer.e.a.a.f7686F) {
            s sVar = bVar.aV;
            sVar.c(8);
            int a9 = com.anythink.basead.exoplayer.e.a.a.a(sVar.i());
            sVar.d(4);
            long h3 = sVar.h();
            if (a9 == 0) {
                n9 = sVar.h();
                n10 = sVar.h();
            } else {
                n9 = sVar.n();
                n10 = sVar.n();
            }
            long j9 = n10 + j6;
            long a10 = af.a(n9, 1000000L, h3);
            sVar.d(2);
            int e9 = sVar.e();
            int[] iArr = new int[e9];
            long[] jArr = new long[e9];
            long[] jArr2 = new long[e9];
            long[] jArr3 = new long[e9];
            long j10 = j9;
            long j11 = a10;
            int i6 = 0;
            while (i6 < e9) {
                int i9 = sVar.i();
                if ((i9 & Integer.MIN_VALUE) == 0) {
                    long h9 = sVar.h();
                    iArr[i6] = i9 & Integer.MAX_VALUE;
                    jArr[i6] = j10;
                    jArr3[i6] = j11;
                    n9 += h9;
                    long[] jArr4 = jArr2;
                    j11 = af.a(n9, 1000000L, h3);
                    jArr4[i6] = j11 - jArr3[i6];
                    sVar.d(4);
                    j10 += iArr[i6];
                    i6++;
                    jArr2 = jArr4;
                    jArr = jArr;
                } else {
                    throw new t("Unhandled indirect reference");
                }
            }
            Pair create = Pair.create(Long.valueOf(a10), new com.anythink.basead.exoplayer.e.a(iArr, jArr, jArr2, jArr3));
            this.f7801P = ((Long) create.first).longValue();
            this.f7807V.a((com.anythink.basead.exoplayer.e.k) create.second);
            this.Y = true;
            return;
        }
        if (i4 == com.anythink.basead.exoplayer.e.a.a.aL) {
            s sVar2 = bVar.aV;
            com.anythink.basead.exoplayer.e.m[] mVarArr = this.f7808W;
            if (mVarArr == null || mVarArr.length == 0) {
                return;
            }
            sVar2.c(12);
            int a11 = sVar2.a();
            sVar2.p();
            sVar2.p();
            long a12 = af.a(sVar2.h(), 1000000L, sVar2.h());
            for (com.anythink.basead.exoplayer.e.m mVar : this.f7808W) {
                sVar2.c(12);
                mVar.a(sVar2, a11);
            }
            long j12 = this.f7801P;
            if (j12 != com.anythink.basead.exoplayer.b.f7168b) {
                long j13 = j12 + a12;
                ac acVar = this.f7787A;
                if (acVar != null) {
                    j13 = acVar.b(j13);
                }
                long j14 = j13;
                for (com.anythink.basead.exoplayer.e.m mVar2 : this.f7808W) {
                    mVar2.a(j14, 1, a11, 0, null);
                }
                return;
            }
            this.f7791E.addLast(new b(a12, a11));
            this.f7798M += a11;
        }
    }

    private void a(a.C0021a c0021a) {
        int i4 = c0021a.aU;
        if (i4 == com.anythink.basead.exoplayer.e.a.a.f7687G) {
            b(c0021a);
        } else if (i4 == com.anythink.basead.exoplayer.e.a.a.f7695P) {
            c(c0021a);
        } else {
            if (this.f7790D.isEmpty()) {
                return;
            }
            this.f7790D.peek().a(c0021a);
        }
    }

    private static com.anythink.basead.exoplayer.e.a.c a(SparseArray<com.anythink.basead.exoplayer.e.a.c> sparseArray, int i4) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (com.anythink.basead.exoplayer.e.a.c) com.anythink.basead.exoplayer.k.a.a(sparseArray.get(i4));
    }

    private void a(s sVar) {
        com.anythink.basead.exoplayer.e.m[] mVarArr = this.f7808W;
        if (mVarArr == null || mVarArr.length == 0) {
            return;
        }
        sVar.c(12);
        int a9 = sVar.a();
        sVar.p();
        sVar.p();
        long a10 = af.a(sVar.h(), 1000000L, sVar.h());
        for (com.anythink.basead.exoplayer.e.m mVar : this.f7808W) {
            sVar.c(12);
            mVar.a(sVar, a9);
        }
        long j6 = this.f7801P;
        if (j6 != com.anythink.basead.exoplayer.b.f7168b) {
            long j9 = j6 + a10;
            ac acVar = this.f7787A;
            if (acVar != null) {
                j9 = acVar.b(j9);
            }
            long j10 = j9;
            for (com.anythink.basead.exoplayer.e.m mVar2 : this.f7808W) {
                mVar2.a(j10, 1, a9, 0, null);
            }
            return;
        }
        this.f7791E.addLast(new b(a10, a9));
        this.f7798M += a9;
    }

    private static void a(a.C0021a c0021a, SparseArray<c> sparseArray, int i4, byte[] bArr) {
        int size = c0021a.aX.size();
        for (int i6 = 0; i6 < size; i6++) {
            a.C0021a c0021a2 = c0021a.aX.get(i6);
            if (c0021a2.aU == com.anythink.basead.exoplayer.e.a.a.f7696Q) {
                b(c0021a2, sparseArray, i4, bArr);
            }
        }
    }

    private static void a(a.C0021a c0021a, c cVar, long j6, int i4) {
        c cVar2;
        long j9;
        int i6;
        List<a.b> list = c0021a.aW;
        int size = list.size();
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            a.b bVar = list.get(i12);
            if (bVar.aU == com.anythink.basead.exoplayer.e.a.a.f7685E) {
                s sVar = bVar.aV;
                sVar.c(12);
                int m9 = sVar.m();
                if (m9 > 0) {
                    i11 += m9;
                    i10++;
                }
            }
        }
        cVar.f7826g = 0;
        cVar.f7825f = 0;
        cVar.f7824e = 0;
        cVar.f7821b.a(i10, i11);
        int i13 = 0;
        int i14 = 0;
        while (i9 < size) {
            a.b bVar2 = list.get(i9);
            if (bVar2.aU == com.anythink.basead.exoplayer.e.a.a.f7685E) {
                s sVar2 = bVar2.aV;
                cVar2 = cVar;
                j9 = j6;
                i6 = i4;
                i14 = a(cVar2, i13, j9, i6, sVar2, i14);
                i13++;
            } else {
                cVar2 = cVar;
                j9 = j6;
                i6 = i4;
            }
            i9++;
            cVar = cVar2;
            j6 = j9;
            i4 = i6;
        }
    }

    private static void a(k kVar, s sVar, l lVar) {
        int i4;
        int i6 = kVar.f7912d;
        sVar.c(8);
        if ((com.anythink.basead.exoplayer.e.a.a.b(sVar.i()) & 1) == 1) {
            sVar.d(8);
        }
        int d9 = sVar.d();
        int m9 = sVar.m();
        if (m9 == lVar.f7919f) {
            if (d9 == 0) {
                boolean[] zArr = lVar.f7926n;
                i4 = 0;
                for (int i9 = 0; i9 < m9; i9++) {
                    int d10 = sVar.d();
                    i4 += d10;
                    zArr[i9] = d10 > i6;
                }
            } else {
                i4 = d9 * m9;
                Arrays.fill(lVar.f7926n, 0, m9, d9 > i6);
            }
            lVar.a(i4);
            return;
        }
        StringBuilder k9 = Wv.k(m9, "Length mismatch: ", ", ");
        k9.append(lVar.f7919f);
        throw new t(k9.toString());
    }

    private static void a(s sVar, l lVar) {
        sVar.c(8);
        int i4 = sVar.i();
        if ((com.anythink.basead.exoplayer.e.a.a.b(i4) & 1) == 1) {
            sVar.d(8);
        }
        int m9 = sVar.m();
        if (m9 == 1) {
            lVar.f7917d += com.anythink.basead.exoplayer.e.a.a.a(i4) == 0 ? sVar.h() : sVar.n();
            return;
        }
        throw new t("Unexpected saio entry count: ".concat(String.valueOf(m9)));
    }

    private static c a(s sVar, SparseArray<c> sparseArray) {
        sVar.c(8);
        int b9 = com.anythink.basead.exoplayer.e.a.a.b(sVar.i());
        c b10 = b(sparseArray, sVar.i());
        if (b10 == null) {
            return null;
        }
        if ((b9 & 1) != 0) {
            long n9 = sVar.n();
            l lVar = b10.f7821b;
            lVar.f7916c = n9;
            lVar.f7917d = n9;
        }
        com.anythink.basead.exoplayer.e.a.c cVar = b10.f7823d;
        b10.f7821b.f7914a = new com.anythink.basead.exoplayer.e.a.c((b9 & 2) != 0 ? sVar.m() - 1 : cVar.f7762a, (b9 & 8) != 0 ? sVar.m() : cVar.f7763b, (b9 & 16) != 0 ? sVar.m() : cVar.f7764c, (b9 & 32) != 0 ? sVar.m() : cVar.f7765d);
        return b10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int[]] */
    private static int a(c cVar, int i4, long j6, int i6, s sVar, int i9) {
        ?? r27;
        boolean z6;
        int i10;
        boolean z9;
        int i11;
        int i12;
        int i13;
        sVar.c(8);
        int b9 = com.anythink.basead.exoplayer.e.a.a.b(sVar.i());
        j jVar = cVar.f7822c;
        l lVar = cVar.f7821b;
        com.anythink.basead.exoplayer.e.a.c cVar2 = lVar.f7914a;
        lVar.f7921h[i4] = sVar.m();
        long[] jArr = lVar.f7920g;
        long j9 = lVar.f7916c;
        jArr[i4] = j9;
        if ((b9 & 1) != 0) {
            jArr[i4] = j9 + sVar.i();
        }
        boolean z10 = (b9 & 4) != 0;
        int i14 = cVar2.f7765d;
        if (z10) {
            i14 = sVar.m();
        }
        boolean z11 = (b9 & 256) != 0;
        boolean z12 = (b9 & 512) != 0;
        boolean z13 = (b9 & 1024) != 0;
        boolean z14 = (b9 & 2048) != 0;
        long[] jArr2 = jVar.f7904j;
        long j10 = 0;
        if (jArr2 != null && jArr2.length == 1 && jArr2[0] == 0) {
            r27 = 0;
            z6 = true;
            j10 = af.a(jVar.f7905k[0], 1000L, jVar.f7900e);
        } else {
            r27 = 0;
            z6 = true;
        }
        int[] iArr = lVar.i;
        ?? r72 = lVar.f7922j;
        long[] jArr3 = lVar.f7923k;
        boolean z15 = z6;
        boolean[] zArr = lVar.f7924l;
        boolean z16 = z14;
        boolean z17 = (jVar.f7899d != 2 || (i6 & 1) == 0) ? r27 : z15;
        int i15 = i9 + lVar.f7921h[i4];
        boolean z18 = z10;
        long j11 = jVar.f7900e;
        int i16 = i9;
        long j12 = i4 > 0 ? lVar.f7931s : j6;
        while (i16 < i15) {
            if (z11) {
                i10 = sVar.m();
            } else {
                i10 = cVar2.f7763b;
            }
            int m9 = z12 ? sVar.m() : cVar2.f7764c;
            if (i16 == 0 && z18) {
                z9 = z17;
                i11 = i14;
            } else if (z13) {
                z9 = z17;
                i11 = sVar.i();
            } else {
                z9 = z17;
                i11 = cVar2.f7765d;
            }
            if (z16) {
                i12 = i11;
                i13 = i15;
                r72[i16] = (int) ((sVar.i() * 1000) / j11);
            } else {
                i12 = i11;
                i13 = i15;
                r72[i16] = r27;
            }
            long j13 = j12;
            jArr3[i16] = af.a(j12, 1000L, j11) - j10;
            iArr[i16] = m9;
            zArr[i16] = (((i12 >> 16) & 1) != 0 || (z9 && i16 != 0)) ? r27 : z15;
            j12 = j13 + i10;
            i16++;
            z17 = z9;
            i15 = i13;
        }
        int i17 = i15;
        lVar.f7931s = j12;
        return i17;
    }

    private static void a(s sVar, l lVar, byte[] bArr) {
        sVar.c(8);
        sVar.a(bArr, 0, 16);
        if (Arrays.equals(bArr, f7780l)) {
            a(sVar, 16, lVar);
        }
    }

    private static void a(s sVar, int i4, l lVar) {
        sVar.c(i4 + 8);
        int b9 = com.anythink.basead.exoplayer.e.a.a.b(sVar.i());
        if ((b9 & 1) == 0) {
            boolean z6 = (b9 & 2) != 0;
            int m9 = sVar.m();
            if (m9 == lVar.f7919f) {
                Arrays.fill(lVar.f7926n, 0, m9, z6);
                lVar.a(sVar.a());
                lVar.a(sVar);
                return;
            } else {
                StringBuilder k9 = Wv.k(m9, "Length mismatch: ", ", ");
                k9.append(lVar.f7919f);
                throw new t(k9.toString());
            }
        }
        throw new t("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    private static void a(s sVar, s sVar2, String str, l lVar) {
        byte[] bArr;
        sVar.c(8);
        int i4 = sVar.i();
        int i6 = sVar.i();
        int i9 = f7779k;
        if (i6 != i9) {
            return;
        }
        if (com.anythink.basead.exoplayer.e.a.a.a(i4) == 1) {
            sVar.d(4);
        }
        if (sVar.i() == 1) {
            sVar2.c(8);
            int i10 = sVar2.i();
            if (sVar2.i() != i9) {
                return;
            }
            int a9 = com.anythink.basead.exoplayer.e.a.a.a(i10);
            if (a9 == 1) {
                if (sVar2.h() == 0) {
                    throw new t("Variable length description in sgpd found (unsupported)");
                }
            } else if (a9 >= 2) {
                sVar2.d(4);
            }
            if (sVar2.h() == 1) {
                sVar2.d(1);
                int d9 = sVar2.d();
                int i11 = (d9 & 240) >> 4;
                int i12 = d9 & 15;
                if (sVar2.d() == 1) {
                    int d10 = sVar2.d();
                    byte[] bArr2 = new byte[16];
                    sVar2.a(bArr2, 0, 16);
                    if (d10 == 0) {
                        int d11 = sVar2.d();
                        bArr = new byte[d11];
                        sVar2.a(bArr, 0, d11);
                    } else {
                        bArr = null;
                    }
                    byte[] bArr3 = bArr;
                    lVar.f7925m = true;
                    lVar.f7927o = new k(true, str, d10, bArr2, i11, i12, bArr3);
                    return;
                }
                return;
            }
            throw new t("Entry count in sgpd != 1 (unsupported).");
        }
        throw new t("Entry count in sbgp != 1 (unsupported).");
    }

    private static Pair<Long, com.anythink.basead.exoplayer.e.a> a(s sVar, long j6) {
        long n9;
        long n10;
        sVar.c(8);
        int a9 = com.anythink.basead.exoplayer.e.a.a.a(sVar.i());
        sVar.d(4);
        long h3 = sVar.h();
        if (a9 == 0) {
            n9 = sVar.h();
            n10 = sVar.h();
        } else {
            n9 = sVar.n();
            n10 = sVar.n();
        }
        long j9 = n10 + j6;
        long a10 = af.a(n9, 1000000L, h3);
        sVar.d(2);
        int e9 = sVar.e();
        int[] iArr = new int[e9];
        long[] jArr = new long[e9];
        long[] jArr2 = new long[e9];
        long[] jArr3 = new long[e9];
        long j10 = j9;
        long j11 = a10;
        int i4 = 0;
        while (i4 < e9) {
            int i6 = sVar.i();
            if ((Integer.MIN_VALUE & i6) == 0) {
                long h9 = sVar.h();
                iArr[i4] = i6 & Integer.MAX_VALUE;
                jArr[i4] = j10;
                jArr3[i4] = j11;
                n9 += h9;
                long[] jArr4 = jArr3;
                j11 = af.a(n9, 1000000L, h3);
                jArr2[i4] = j11 - jArr4[i4];
                sVar.d(4);
                j10 += iArr[i4];
                i4++;
                jArr3 = jArr4;
            } else {
                throw new t("Unhandled indirect reference");
            }
        }
        return Pair.create(Long.valueOf(a10), new com.anythink.basead.exoplayer.e.a(iArr, jArr, jArr2, jArr3));
    }

    private static c a(SparseArray<c> sparseArray) {
        int size = sparseArray.size();
        c cVar = null;
        long j6 = Long.MAX_VALUE;
        for (int i4 = 0; i4 < size; i4++) {
            c valueAt = sparseArray.valueAt(i4);
            int i6 = valueAt.f7826g;
            l lVar = valueAt.f7821b;
            if (i6 != lVar.f7918e) {
                long j9 = lVar.f7920g[i6];
                if (j9 < j6) {
                    cVar = valueAt;
                    j6 = j9;
                }
            }
        }
        return cVar;
    }

    private static com.anythink.basead.exoplayer.d.e a(List<a.b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i4 = 0; i4 < size; i4++) {
            a.b bVar = list.get(i4);
            if (bVar.aU == com.anythink.basead.exoplayer.e.a.a.f7704Z) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = bVar.aV.f9288a;
                UUID a9 = h.a(bArr);
                if (a9 == null) {
                    Log.w(f7778j, "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new e.a(a9, o.f9234e, bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new com.anythink.basead.exoplayer.d.e(arrayList);
    }

    private static boolean a(int i4) {
        return i4 == com.anythink.basead.exoplayer.e.a.a.f7703X || i4 == com.anythink.basead.exoplayer.e.a.a.f7702W || i4 == com.anythink.basead.exoplayer.e.a.a.f7688H || i4 == com.anythink.basead.exoplayer.e.a.a.f7686F || i4 == com.anythink.basead.exoplayer.e.a.a.Y || i4 == com.anythink.basead.exoplayer.e.a.a.f7682B || i4 == com.anythink.basead.exoplayer.e.a.a.f7683C || i4 == com.anythink.basead.exoplayer.e.a.a.f7699T || i4 == com.anythink.basead.exoplayer.e.a.a.f7684D || i4 == com.anythink.basead.exoplayer.e.a.a.f7685E || i4 == com.anythink.basead.exoplayer.e.a.a.f7704Z || i4 == com.anythink.basead.exoplayer.e.a.a.ah || i4 == com.anythink.basead.exoplayer.e.a.a.ai || i4 == com.anythink.basead.exoplayer.e.a.a.am || i4 == com.anythink.basead.exoplayer.e.a.a.al || i4 == com.anythink.basead.exoplayer.e.a.a.aj || i4 == com.anythink.basead.exoplayer.e.a.a.ak || i4 == com.anythink.basead.exoplayer.e.a.a.f7701V || i4 == com.anythink.basead.exoplayer.e.a.a.f7698S || i4 == com.anythink.basead.exoplayer.e.a.a.aL;
    }
}

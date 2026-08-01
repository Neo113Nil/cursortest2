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
import com.icefishinggame.icefishinggamemultigames.AbstractC4404f;
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
    public static final int f6988e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f6989f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final int f6990g = 4;

    /* renamed from: h, reason: collision with root package name */
    public static final int f6991h = 16;
    private static final int i = 8;

    /* renamed from: j, reason: collision with root package name */
    private static final String f6992j = "FragmentedMp4Extractor";

    /* renamed from: n, reason: collision with root package name */
    private static final int f6996n = 0;

    /* renamed from: o, reason: collision with root package name */
    private static final int f6997o = 1;

    /* renamed from: p, reason: collision with root package name */
    private static final int f6998p = 2;

    /* renamed from: q, reason: collision with root package name */
    private static final int f6999q = 3;

    /* renamed from: r, reason: collision with root package name */
    private static final int f7000r = 4;

    /* renamed from: A, reason: collision with root package name */
    private final ac f7001A;

    /* renamed from: B, reason: collision with root package name */
    private final s f7002B;

    /* renamed from: C, reason: collision with root package name */
    private final byte[] f7003C;

    /* renamed from: D, reason: collision with root package name */
    private final ArrayDeque<a.C0021a> f7004D;

    /* renamed from: E, reason: collision with root package name */
    private final ArrayDeque<b> f7005E;

    /* renamed from: F, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.e.m f7006F;

    /* renamed from: G, reason: collision with root package name */
    private int f7007G;

    /* renamed from: H, reason: collision with root package name */
    private int f7008H;

    /* renamed from: I, reason: collision with root package name */
    private long f7009I;
    private int J;

    /* renamed from: K, reason: collision with root package name */
    private s f7010K;

    /* renamed from: L, reason: collision with root package name */
    private long f7011L;

    /* renamed from: M, reason: collision with root package name */
    private int f7012M;

    /* renamed from: N, reason: collision with root package name */
    private long f7013N;

    /* renamed from: O, reason: collision with root package name */
    private long f7014O;

    /* renamed from: P, reason: collision with root package name */
    private long f7015P;

    /* renamed from: Q, reason: collision with root package name */
    private c f7016Q;

    /* renamed from: R, reason: collision with root package name */
    private int f7017R;

    /* renamed from: S, reason: collision with root package name */
    private int f7018S;

    /* renamed from: T, reason: collision with root package name */
    private int f7019T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f7020U;

    /* renamed from: V, reason: collision with root package name */
    private com.anythink.basead.exoplayer.e.g f7021V;

    /* renamed from: W, reason: collision with root package name */
    private com.anythink.basead.exoplayer.e.m[] f7022W;

    /* renamed from: X, reason: collision with root package name */
    private com.anythink.basead.exoplayer.e.m[] f7023X;
    private boolean Y;

    /* renamed from: s, reason: collision with root package name */
    private final int f7024s;

    /* renamed from: t, reason: collision with root package name */
    private final j f7025t;

    /* renamed from: u, reason: collision with root package name */
    private final List<com.anythink.basead.exoplayer.m> f7026u;

    /* renamed from: v, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.d.e f7027v;

    /* renamed from: w, reason: collision with root package name */
    private final SparseArray<c> f7028w;

    /* renamed from: x, reason: collision with root package name */
    private final s f7029x;

    /* renamed from: y, reason: collision with root package name */
    private final s f7030y;

    /* renamed from: z, reason: collision with root package name */
    private final s f7031z;

    /* renamed from: d, reason: collision with root package name */
    public static final com.anythink.basead.exoplayer.e.h f6987d = new com.anythink.basead.exoplayer.e.h() { // from class: com.anythink.basead.exoplayer.e.a.e.1
        @Override // com.anythink.basead.exoplayer.e.h
        public final com.anythink.basead.exoplayer.e.e[] a() {
            return new com.anythink.basead.exoplayer.e.e[]{new e()};
        }
    };

    /* renamed from: k, reason: collision with root package name */
    private static final int f6993k = af.f("seig");

    /* renamed from: l, reason: collision with root package name */
    private static final byte[] f6994l = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: m, reason: collision with root package name */
    private static final com.anythink.basead.exoplayer.m f6995m = com.anythink.basead.exoplayer.m.a((String) null, o.ai);

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final long f7032a;

        /* renamed from: b, reason: collision with root package name */
        public final int f7033b;

        public b(long j6, int i) {
            this.f7032a = j6;
            this.f7033b = i;
        }
    }

    public e() {
        this(0);
    }

    private boolean b(com.anythink.basead.exoplayer.e.f fVar) {
        if (this.J == 0) {
            if (!fVar.a(this.f7002B.f8502a, 0, 8, true)) {
                return false;
            }
            this.J = 8;
            this.f7002B.c(0);
            this.f7009I = this.f7002B.h();
            this.f7008H = this.f7002B.i();
        }
        long j6 = this.f7009I;
        if (j6 == 1) {
            fVar.b(this.f7002B.f8502a, 8, 8);
            this.J += 8;
            this.f7009I = this.f7002B.n();
        } else if (j6 == 0) {
            long d2 = fVar.d();
            if (d2 == -1 && !this.f7004D.isEmpty()) {
                d2 = this.f7004D.peek().aV;
            }
            if (d2 != -1) {
                this.f7009I = (d2 - fVar.c()) + this.J;
            }
        }
        if (this.f7009I < this.J) {
            throw new t("Atom size less than header length (unsupported).");
        }
        long c9 = fVar.c() - this.J;
        if (this.f7008H == com.anythink.basead.exoplayer.e.a.a.f6909P) {
            int size = this.f7028w.size();
            for (int i6 = 0; i6 < size; i6++) {
                l lVar = this.f7028w.valueAt(i6).f7035b;
                lVar.f7129b = c9;
                lVar.f7131d = c9;
                lVar.f7130c = c9;
            }
        }
        int i9 = this.f7008H;
        if (i9 == com.anythink.basead.exoplayer.e.a.a.f6930m) {
            this.f7016Q = null;
            this.f7011L = this.f7009I + c9;
            if (!this.Y) {
                this.f7021V.a(new k.b(this.f7014O, c9));
                this.Y = true;
            }
            this.f7007G = 2;
            return true;
        }
        if (i9 == com.anythink.basead.exoplayer.e.a.a.f6901G || i9 == com.anythink.basead.exoplayer.e.a.a.f6903I || i9 == com.anythink.basead.exoplayer.e.a.a.J || i9 == com.anythink.basead.exoplayer.e.a.a.f6904K || i9 == com.anythink.basead.exoplayer.e.a.a.f6905L || i9 == com.anythink.basead.exoplayer.e.a.a.f6909P || i9 == com.anythink.basead.exoplayer.e.a.a.f6910Q || i9 == com.anythink.basead.exoplayer.e.a.a.f6911R || i9 == com.anythink.basead.exoplayer.e.a.a.f6914U) {
            long c10 = (fVar.c() + this.f7009I) - 8;
            this.f7004D.push(new a.C0021a(this.f7008H, c10));
            if (this.f7009I == this.J) {
                a(c10);
            } else {
                a();
            }
        } else if (i9 == com.anythink.basead.exoplayer.e.a.a.f6917X || i9 == com.anythink.basead.exoplayer.e.a.a.f6916W || i9 == com.anythink.basead.exoplayer.e.a.a.f6902H || i9 == com.anythink.basead.exoplayer.e.a.a.f6900F || i9 == com.anythink.basead.exoplayer.e.a.a.Y || i9 == com.anythink.basead.exoplayer.e.a.a.f6896B || i9 == com.anythink.basead.exoplayer.e.a.a.f6897C || i9 == com.anythink.basead.exoplayer.e.a.a.f6913T || i9 == com.anythink.basead.exoplayer.e.a.a.f6898D || i9 == com.anythink.basead.exoplayer.e.a.a.f6899E || i9 == com.anythink.basead.exoplayer.e.a.a.f6918Z || i9 == com.anythink.basead.exoplayer.e.a.a.ah || i9 == com.anythink.basead.exoplayer.e.a.a.ai || i9 == com.anythink.basead.exoplayer.e.a.a.am || i9 == com.anythink.basead.exoplayer.e.a.a.al || i9 == com.anythink.basead.exoplayer.e.a.a.aj || i9 == com.anythink.basead.exoplayer.e.a.a.ak || i9 == com.anythink.basead.exoplayer.e.a.a.f6915V || i9 == com.anythink.basead.exoplayer.e.a.a.f6912S || i9 == com.anythink.basead.exoplayer.e.a.a.aL) {
            if (this.J != 8) {
                throw new t("Leaf atom defines extended atom size (unsupported).");
            }
            long j9 = this.f7009I;
            if (j9 > 2147483647L) {
                throw new t("Leaf atom with length > 2147483647 (unsupported).");
            }
            s sVar = new s((int) j9);
            this.f7010K = sVar;
            System.arraycopy(this.f7002B.f8502a, 0, sVar.f8502a, 0, 8);
            this.f7007G = 1;
        } else {
            if (this.f7009I > 2147483647L) {
                throw new t("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.f7010K = null;
            this.f7007G = 1;
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
        boolean z3;
        int i6;
        int a9;
        int i9;
        int i10 = 4;
        int i11 = 1;
        if (this.f7007G == 3) {
            if (this.f7016Q == null) {
                SparseArray<c> sparseArray = this.f7028w;
                int size = sparseArray.size();
                long j6 = Long.MAX_VALUE;
                c cVar = null;
                for (int i12 = 0; i12 < size; i12++) {
                    c valueAt = sparseArray.valueAt(i12);
                    int i13 = valueAt.f7040g;
                    l lVar = valueAt.f7035b;
                    if (i13 != lVar.f7132e) {
                        long j9 = lVar.f7134g[i13];
                        if (j9 < j6) {
                            cVar = valueAt;
                            j6 = j9;
                        }
                    }
                }
                i9 = 0;
                if (cVar == null) {
                    int c9 = (int) (this.f7011L - fVar.c());
                    if (c9 < 0) {
                        throw new t("Offset to end of mdat was negative.");
                    }
                    fVar.c(c9);
                    a();
                    return false;
                }
                int c10 = (int) (cVar.f7035b.f7134g[cVar.f7040g] - fVar.c());
                if (c10 < 0) {
                    Log.w(f6992j, "Ignoring negative offset to sample data.");
                    c10 = 0;
                }
                fVar.c(c10);
                this.f7016Q = cVar;
            } else {
                i9 = 0;
            }
            c cVar2 = this.f7016Q;
            int[] iArr = cVar2.f7035b.i;
            int i14 = cVar2.f7038e;
            int i15 = iArr[i14];
            this.f7017R = i15;
            if (i14 < cVar2.f7041h) {
                fVar.c(i15);
                c.a(this.f7016Q);
                if (!this.f7016Q.b()) {
                    this.f7016Q = null;
                }
                this.f7007G = 3;
                return true;
            }
            if (cVar2.f7036c.i == 1) {
                this.f7017R = i15 - 8;
                fVar.c(8);
            }
            int c11 = this.f7016Q.c();
            this.f7018S = c11;
            this.f7017R += c11;
            this.f7007G = 4;
            this.f7019T = i9;
        }
        c cVar3 = this.f7016Q;
        l lVar2 = cVar3.f7035b;
        j jVar = cVar3.f7036c;
        ?? r9 = cVar3.f7034a;
        int i16 = cVar3.f7038e;
        long b9 = lVar2.b(i16) * 1000;
        ac acVar = this.f7001A;
        if (acVar != null) {
            b9 = acVar.b(b9);
        }
        int i17 = jVar.f7120l;
        if (i17 == 0) {
            r17 = 1;
            while (true) {
                int i18 = this.f7018S;
                int i19 = this.f7017R;
                if (i18 >= i19) {
                    break;
                }
                this.f7018S += r9.a(fVar, i19 - i18, false);
            }
        } else {
            byte[] bArr = this.f7030y.f8502a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i20 = i17 + 1;
            int i21 = 4 - i17;
            while (this.f7018S < this.f7017R) {
                int i22 = this.f7019T;
                if (i22 == 0) {
                    fVar.b(bArr, i21, i20);
                    this.f7030y.c(0);
                    this.f7019T = this.f7030y.m() - i11;
                    this.f7029x.c(0);
                    r9.a(this.f7029x, i10);
                    r9.a(this.f7030y, i11);
                    this.f7020U = (this.f7023X.length <= 0 || !p.a(jVar.f7117h.f8665h, bArr[i10])) ? 0 : i11;
                    this.f7018S += 5;
                    this.f7017R += i21;
                } else {
                    if (this.f7020U) {
                        this.f7031z.a(i22);
                        fVar.b(this.f7031z.f8502a, 0, this.f7019T);
                        r9.a(this.f7031z, this.f7019T);
                        a9 = this.f7019T;
                        s sVar = this.f7031z;
                        int a10 = p.a(sVar.f8502a, sVar.b());
                        i6 = i11;
                        this.f7031z.c(o.i.equals(jVar.f7117h.f8665h) ? 1 : 0);
                        this.f7031z.b(a10);
                    } else {
                        i6 = i11;
                        a9 = r9.a(fVar, i22, false);
                    }
                    this.f7018S += a9;
                    this.f7019T -= a9;
                    i11 = i6;
                    i10 = 4;
                }
            }
            r17 = i11;
        }
        boolean z6 = lVar2.f7138l[i16];
        if (lVar2.f7139m) {
            ?? r12 = (z6 ? 1 : 0) | 0;
            k kVar = lVar2.f7141o;
            if (kVar == null) {
                kVar = jVar.a(lVar2.f7128a.f6976a);
            }
            aVar = kVar.f7125c;
            z3 = r12;
        } else {
            aVar = null;
            z3 = z6;
        }
        r9.a(b9, z3, this.f7017R, 0, aVar);
        while (!this.f7005E.isEmpty()) {
            b removeFirst = this.f7005E.removeFirst();
            this.f7012M -= removeFirst.f7033b;
            long j10 = removeFirst.f7032a + b9;
            ac acVar2 = this.f7001A;
            if (acVar2 != null) {
                j10 = acVar2.b(j10);
            }
            long j11 = j10;
            for (com.anythink.basead.exoplayer.e.m mVar : this.f7022W) {
                mVar.a(j11, 1, removeFirst.f7033b, this.f7012M, null);
            }
        }
        if (!this.f7016Q.b()) {
            this.f7016Q = null;
        }
        this.f7007G = 3;
        return r17;
    }

    @Override // com.anythink.basead.exoplayer.e.e
    public final boolean a(com.anythink.basead.exoplayer.e.f fVar) {
        return i.a(fVar);
    }

    @Override // com.anythink.basead.exoplayer.e.e
    public final void c() {
    }

    public e(int i6) {
        this(i6, null);
    }

    private void c(com.anythink.basead.exoplayer.e.f fVar) {
        long n9;
        long n10;
        int i6 = ((int) this.f7009I) - this.J;
        s sVar = this.f7010K;
        if (sVar != null) {
            fVar.b(sVar.f8502a, 8, i6);
            a.b bVar = new a.b(this.f7008H, this.f7010K);
            long c9 = fVar.c();
            if (this.f7004D.isEmpty()) {
                int i9 = bVar.aU;
                if (i9 == com.anythink.basead.exoplayer.e.a.a.f6900F) {
                    s sVar2 = bVar.aV;
                    sVar2.c(8);
                    int a9 = com.anythink.basead.exoplayer.e.a.a.a(sVar2.i());
                    sVar2.d(4);
                    long h9 = sVar2.h();
                    if (a9 == 0) {
                        n9 = sVar2.h();
                        n10 = sVar2.h();
                    } else {
                        n9 = sVar2.n();
                        n10 = sVar2.n();
                    }
                    long j6 = n10 + c9;
                    long a10 = af.a(n9, 1000000L, h9);
                    sVar2.d(2);
                    int e9 = sVar2.e();
                    int[] iArr = new int[e9];
                    long[] jArr = new long[e9];
                    long[] jArr2 = new long[e9];
                    long[] jArr3 = new long[e9];
                    long j9 = n9;
                    long j10 = a10;
                    int i10 = 0;
                    while (i10 < e9) {
                        int i11 = sVar2.i();
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            throw new t("Unhandled indirect reference");
                        }
                        long h10 = sVar2.h();
                        iArr[i10] = i11 & Integer.MAX_VALUE;
                        jArr[i10] = j6;
                        jArr3[i10] = j10;
                        long j11 = j9 + h10;
                        long[] jArr4 = jArr;
                        long[] jArr5 = jArr2;
                        int i12 = i10;
                        j10 = af.a(j11, 1000000L, h9);
                        jArr5[i12] = j10 - jArr3[i12];
                        sVar2.d(4);
                        j6 += iArr[i12];
                        int i13 = i12 + 1;
                        jArr2 = jArr5;
                        j9 = j11;
                        i10 = i13;
                        jArr = jArr4;
                    }
                    Pair create = Pair.create(Long.valueOf(a10), new com.anythink.basead.exoplayer.e.a(iArr, jArr, jArr2, jArr3));
                    this.f7015P = ((Long) create.first).longValue();
                    this.f7021V.a((com.anythink.basead.exoplayer.e.k) create.second);
                    this.Y = true;
                } else if (i9 == com.anythink.basead.exoplayer.e.a.a.aL) {
                    s sVar3 = bVar.aV;
                    com.anythink.basead.exoplayer.e.m[] mVarArr = this.f7022W;
                    if (mVarArr != null && mVarArr.length != 0) {
                        sVar3.c(12);
                        int a11 = sVar3.a();
                        sVar3.p();
                        sVar3.p();
                        long a12 = af.a(sVar3.h(), 1000000L, sVar3.h());
                        for (com.anythink.basead.exoplayer.e.m mVar : this.f7022W) {
                            sVar3.c(12);
                            mVar.a(sVar3, a11);
                        }
                        long j12 = this.f7015P;
                        if (j12 != com.anythink.basead.exoplayer.b.f6382b) {
                            long j13 = j12 + a12;
                            ac acVar = this.f7001A;
                            if (acVar != null) {
                                j13 = acVar.b(j13);
                            }
                            long j14 = j13;
                            for (com.anythink.basead.exoplayer.e.m mVar2 : this.f7022W) {
                                mVar2.a(j14, 1, a11, 0, null);
                            }
                        } else {
                            this.f7005E.addLast(new b(a12, a11));
                            this.f7012M += a11;
                        }
                    }
                }
            } else {
                this.f7004D.peek().a(bVar);
            }
        } else {
            fVar.c(i6);
        }
        a(fVar.c());
    }

    @Override // com.anythink.basead.exoplayer.e.e
    public final void a(com.anythink.basead.exoplayer.e.g gVar) {
        this.f7021V = gVar;
        j jVar = this.f7025t;
        if (jVar != null) {
            c cVar = new c(gVar.a(0, jVar.f7113d));
            cVar.a(this.f7025t, new com.anythink.basead.exoplayer.e.a.c(0, 0, 0, 0));
            this.f7028w.put(0, cVar);
            b();
            this.f7021V.c_();
        }
    }

    private e(int i6, ac acVar) {
        this(i6, acVar, null, null);
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final com.anythink.basead.exoplayer.e.m f7034a;

        /* renamed from: c, reason: collision with root package name */
        public j f7036c;

        /* renamed from: d, reason: collision with root package name */
        public com.anythink.basead.exoplayer.e.a.c f7037d;

        /* renamed from: e, reason: collision with root package name */
        public int f7038e;

        /* renamed from: f, reason: collision with root package name */
        public int f7039f;

        /* renamed from: g, reason: collision with root package name */
        public int f7040g;

        /* renamed from: h, reason: collision with root package name */
        public int f7041h;

        /* renamed from: b, reason: collision with root package name */
        public final l f7035b = new l();
        private final s i = new s(1);

        /* renamed from: j, reason: collision with root package name */
        private final s f7042j = new s();

        public c(com.anythink.basead.exoplayer.e.m mVar) {
            this.f7034a = mVar;
        }

        private void d() {
            l lVar = this.f7035b;
            if (lVar.f7139m) {
                s sVar = lVar.f7143q;
                int i = e().f7126d;
                if (i != 0) {
                    sVar.d(i);
                }
                if (this.f7035b.f7140n[this.f7038e]) {
                    sVar.d(sVar.e() * 6);
                }
            }
        }

        private k e() {
            l lVar = this.f7035b;
            int i = lVar.f7128a.f6976a;
            k kVar = lVar.f7141o;
            return kVar != null ? kVar : this.f7036c.a(i);
        }

        public final void a(j jVar, com.anythink.basead.exoplayer.e.a.c cVar) {
            this.f7036c = (j) com.anythink.basead.exoplayer.k.a.a(jVar);
            this.f7037d = (com.anythink.basead.exoplayer.e.a.c) com.anythink.basead.exoplayer.k.a.a(cVar);
            this.f7034a.a(jVar.f7117h);
            a();
        }

        public final boolean b() {
            this.f7038e++;
            int i = this.f7039f + 1;
            this.f7039f = i;
            int[] iArr = this.f7035b.f7135h;
            int i6 = this.f7040g;
            if (i != iArr[i6]) {
                return true;
            }
            this.f7040g = i6 + 1;
            this.f7039f = 0;
            return false;
        }

        public final int c() {
            s sVar;
            if (!this.f7035b.f7139m) {
                return 0;
            }
            k e9 = e();
            int i = e9.f7126d;
            if (i != 0) {
                sVar = this.f7035b.f7143q;
            } else {
                byte[] bArr = e9.f7127e;
                this.f7042j.a(bArr, bArr.length);
                s sVar2 = this.f7042j;
                i = bArr.length;
                sVar = sVar2;
            }
            boolean z3 = this.f7035b.f7140n[this.f7038e];
            s sVar3 = this.i;
            sVar3.f8502a[0] = (byte) ((z3 ? 128 : 0) | i);
            sVar3.c(0);
            this.f7034a.a(this.i, 1);
            this.f7034a.a(sVar, i);
            if (!z3) {
                return i + 1;
            }
            s sVar4 = this.f7035b.f7143q;
            int e10 = sVar4.e();
            sVar4.d(-2);
            int i6 = (e10 * 6) + 2;
            this.f7034a.a(sVar4, i6);
            return i + 1 + i6;
        }

        public final void a(com.anythink.basead.exoplayer.d.e eVar) {
            k a9 = this.f7036c.a(this.f7035b.f7128a.f6976a);
            this.f7034a.a(this.f7036c.f7117h.a(eVar.a(a9 != null ? a9.f7124b : null)));
        }

        public final void a() {
            this.f7035b.a();
            this.f7038e = 0;
            this.f7040g = 0;
            this.f7039f = 0;
            this.f7041h = 0;
        }

        public final void a(long j6) {
            long a9 = com.anythink.basead.exoplayer.b.a(j6);
            int i = this.f7038e;
            while (true) {
                l lVar = this.f7035b;
                if (i >= lVar.f7133f || lVar.b(i) >= a9) {
                    return;
                }
                if (this.f7035b.f7138l[i]) {
                    this.f7041h = i;
                }
                i++;
            }
        }

        public static /* synthetic */ void a(c cVar) {
            l lVar = cVar.f7035b;
            if (lVar.f7139m) {
                s sVar = lVar.f7143q;
                int i = cVar.e().f7126d;
                if (i != 0) {
                    sVar.d(i);
                }
                if (cVar.f7035b.f7140n[cVar.f7038e]) {
                    sVar.d(sVar.e() * 6);
                }
            }
        }
    }

    private e(int i6, ac acVar, j jVar, com.anythink.basead.exoplayer.d.e eVar) {
        this(i6, acVar, jVar, eVar, Collections.EMPTY_LIST);
    }

    private void d(com.anythink.basead.exoplayer.e.f fVar) {
        int size = this.f7028w.size();
        c cVar = null;
        long j6 = Long.MAX_VALUE;
        for (int i6 = 0; i6 < size; i6++) {
            l lVar = this.f7028w.valueAt(i6).f7035b;
            if (lVar.f7144r) {
                long j9 = lVar.f7131d;
                if (j9 < j6) {
                    cVar = this.f7028w.valueAt(i6);
                    j6 = j9;
                }
            }
        }
        if (cVar == null) {
            this.f7007G = 3;
            return;
        }
        int c9 = (int) (j6 - fVar.c());
        if (c9 >= 0) {
            fVar.c(c9);
            l lVar2 = cVar.f7035b;
            fVar.b(lVar2.f7143q.f8502a, 0, lVar2.f7142p);
            lVar2.f7143q.c(0);
            lVar2.f7144r = false;
            return;
        }
        throw new t("Offset to encryption data was negative.");
    }

    private e(int i6, ac acVar, j jVar, com.anythink.basead.exoplayer.d.e eVar, List<com.anythink.basead.exoplayer.m> list) {
        this(i6, acVar, jVar, eVar, list, null);
    }

    private e(int i6, ac acVar, j jVar, com.anythink.basead.exoplayer.d.e eVar, List<com.anythink.basead.exoplayer.m> list, com.anythink.basead.exoplayer.e.m mVar) {
        this.f7024s = i6 | (jVar != null ? 8 : 0);
        this.f7001A = acVar;
        this.f7025t = jVar;
        this.f7027v = eVar;
        this.f7026u = Collections.unmodifiableList(list);
        this.f7006F = mVar;
        this.f7002B = new s(16);
        this.f7029x = new s(p.f8472a);
        this.f7030y = new s(5);
        this.f7031z = new s();
        this.f7003C = new byte[16];
        this.f7004D = new ArrayDeque<>();
        this.f7005E = new ArrayDeque<>();
        this.f7028w = new SparseArray<>();
        this.f7014O = com.anythink.basead.exoplayer.b.f6382b;
        this.f7013N = com.anythink.basead.exoplayer.b.f6382b;
        this.f7015P = com.anythink.basead.exoplayer.b.f6382b;
        a();
    }

    @Override // com.anythink.basead.exoplayer.e.e
    public final void a(long j6, long j9) {
        int size = this.f7028w.size();
        for (int i6 = 0; i6 < size; i6++) {
            this.f7028w.valueAt(i6).a();
        }
        this.f7005E.clear();
        this.f7012M = 0;
        this.f7013N = j9;
        this.f7004D.clear();
        a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:269:0x0084, code lost:
    
        r2 = r28.f7016Q;
        r3 = r2.f7035b.i;
        r7 = r2.f7038e;
        r3 = r3[r7];
        r28.f7017R = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0092, code lost:
    
        if (r7 >= r2.f7041h) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0094, code lost:
    
        r29.c(r3);
        com.anythink.basead.exoplayer.e.a.e.c.a(r28.f7016Q);
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x00a2, code lost:
    
        if (r28.f7016Q.b() != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x00a4, code lost:
    
        r28.f7016Q = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x00a6, code lost:
    
        r28.f7007G = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x00a8, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x00b0, code lost:
    
        if (r2.f7036c.i != 1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x00b2, code lost:
    
        r28.f7017R = r3 - 8;
        r29.c(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x00b8, code lost:
    
        r2 = r28.f7016Q.c();
        r28.f7018S = r2;
        r28.f7017R += r2;
        r28.f7007G = 4;
        r28.f7019T = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x00ce, code lost:
    
        r2 = r28.f7016Q;
        r3 = r2.f7035b;
        r5 = r2.f7036c;
        r7 = r2.f7034a;
        r2 = r2.f7038e;
        r8 = r3.b(r2) * 1000;
        r10 = r28.f7001A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x00e1, code lost:
    
        if (r10 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x00e3, code lost:
    
        r8 = r10.b(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x00e7, code lost:
    
        r19 = r8;
        r8 = r5.f7120l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x00eb, code lost:
    
        if (r8 == 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x00ed, code lost:
    
        r9 = r28.f7030y.f8502a;
        r9[0] = 0;
        r9[1] = 0;
        r9[r30] = 0;
        r10 = r8 + 1;
        r8 = 4 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0103, code lost:
    
        if (r28.f7018S >= r28.f7017R) goto L336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0105, code lost:
    
        r12 = r28.f7019T;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0107, code lost:
    
        if (r12 != 0) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x014f, code lost:
    
        if (r28.f7020U == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0151, code lost:
    
        r28.f7031z.a(r12);
        r29.b(r28.f7031z.f8502a, 0, r28.f7019T);
        r7.a(r28.f7031z, r28.f7019T);
        r12 = r28.f7019T;
        r13 = r28.f7031z;
        r13 = com.anythink.basead.exoplayer.k.p.a(r13.f8502a, r13.b());
        r28.f7031z.c(com.anythink.basead.exoplayer.k.o.i.equals(r5.f7117h.f8665h) ? 1 : 0);
        r28.f7031z.b(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x018f, code lost:
    
        r28.f7018S += r12;
        r28.f7019T -= r12;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x018a, code lost:
    
        r12 = r7.a(r29, r12, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0109, code lost:
    
        r29.b(r9, r8, r10);
        r28.f7030y.c(0);
        r28.f7019T = r28.f7030y.m() - r6;
        r28.f7029x.c(0);
        r7.a(r28.f7029x, 4);
        r7.a(r28.f7030y, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x012e, code lost:
    
        if (r28.f7023X.length <= 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x013a, code lost:
    
        if (com.anythink.basead.exoplayer.k.p.a(r5.f7117h.f8665h, r9[4]) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x013c, code lost:
    
        r12 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x013f, code lost:
    
        r28.f7020U = r12;
        r28.f7018S += 5;
        r28.f7017R += r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x013e, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x01ae, code lost:
    
        r1 = r3.f7138l[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x01b4, code lost:
    
        if (r3.f7139m == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x01b6, code lost:
    
        r1 = (r1 ? 1 : 0) | 0;
        r2 = r3.f7141o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x01bb, code lost:
    
        if (r2 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x01be, code lost:
    
        r2 = r5.a(r3.f7128a.f6976a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x01c6, code lost:
    
        r24 = r2.f7125c;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x01d0, code lost:
    
        r7.a(r19, r1, r28.f7017R, 0, r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x01e1, code lost:
    
        if (r28.f7005E.isEmpty() != false) goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x01e3, code lost:
    
        r1 = r28.f7005E.removeFirst();
        r28.f7012M -= r1.f7033b;
        r2 = r19 + r1.f7032a;
        r5 = r28.f7001A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x01f8, code lost:
    
        if (r5 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x01fa, code lost:
    
        r2 = r5.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x01fe, code lost:
    
        r22 = r2;
        r2 = r28.f7022W;
        r3 = r2.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0204, code lost:
    
        if (r5 >= r3) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0206, code lost:
    
        r2[r5].a(r22, 1, r1.f7033b, r28.f7012M, null);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0220, code lost:
    
        if (r28.f7016Q.b() != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0222, code lost:
    
        r28.f7016Q = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0224, code lost:
    
        r28.f7007G = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x01cd, code lost:
    
        r24 = null;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x019c, code lost:
    
        r6 = r28.f7018S;
        r8 = r28.f7017R;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x01a0, code lost:
    
        if (r6 >= r8) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x01a2, code lost:
    
        r28.f7018S += r7.a(r29, r8 - r6, false);
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
            int i6 = this.f7007G;
            char c10 = 2;
            c cVar = null;
            int i9 = 1;
            if (i6 == 0) {
                if (this.J == 0) {
                    if (!fVar.a(this.f7002B.f8502a, 0, 8, true)) {
                        return -1;
                    }
                    this.J = 8;
                    this.f7002B.c(0);
                    this.f7009I = this.f7002B.h();
                    this.f7008H = this.f7002B.i();
                }
                long j6 = this.f7009I;
                if (j6 == 1) {
                    fVar.b(this.f7002B.f8502a, 8, 8);
                    this.J += 8;
                    this.f7009I = this.f7002B.n();
                } else if (j6 == 0) {
                    long d2 = fVar.d();
                    if (d2 == -1 && !this.f7004D.isEmpty()) {
                        d2 = this.f7004D.peek().aV;
                    }
                    if (d2 != -1) {
                        this.f7009I = (d2 - fVar.c()) + this.J;
                    }
                }
                if (this.f7009I >= this.J) {
                    long c11 = fVar.c() - this.J;
                    if (this.f7008H == com.anythink.basead.exoplayer.e.a.a.f6909P) {
                        int size = this.f7028w.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            l lVar = this.f7028w.valueAt(i10).f7035b;
                            lVar.f7129b = c11;
                            lVar.f7131d = c11;
                            lVar.f7130c = c11;
                        }
                    }
                    int i11 = this.f7008H;
                    if (i11 == com.anythink.basead.exoplayer.e.a.a.f6930m) {
                        this.f7016Q = null;
                        this.f7011L = this.f7009I + c11;
                        if (!this.Y) {
                            this.f7021V.a(new k.b(this.f7014O, c11));
                            this.Y = true;
                        }
                        this.f7007G = 2;
                    } else if (i11 != com.anythink.basead.exoplayer.e.a.a.f6901G && i11 != com.anythink.basead.exoplayer.e.a.a.f6903I && i11 != com.anythink.basead.exoplayer.e.a.a.J && i11 != com.anythink.basead.exoplayer.e.a.a.f6904K && i11 != com.anythink.basead.exoplayer.e.a.a.f6905L && i11 != com.anythink.basead.exoplayer.e.a.a.f6909P && i11 != com.anythink.basead.exoplayer.e.a.a.f6910Q && i11 != com.anythink.basead.exoplayer.e.a.a.f6911R && i11 != com.anythink.basead.exoplayer.e.a.a.f6914U) {
                        if (i11 == com.anythink.basead.exoplayer.e.a.a.f6917X || i11 == com.anythink.basead.exoplayer.e.a.a.f6916W || i11 == com.anythink.basead.exoplayer.e.a.a.f6902H || i11 == com.anythink.basead.exoplayer.e.a.a.f6900F || i11 == com.anythink.basead.exoplayer.e.a.a.Y || i11 == com.anythink.basead.exoplayer.e.a.a.f6896B || i11 == com.anythink.basead.exoplayer.e.a.a.f6897C || i11 == com.anythink.basead.exoplayer.e.a.a.f6913T || i11 == com.anythink.basead.exoplayer.e.a.a.f6898D || i11 == com.anythink.basead.exoplayer.e.a.a.f6899E || i11 == com.anythink.basead.exoplayer.e.a.a.f6918Z || i11 == com.anythink.basead.exoplayer.e.a.a.ah || i11 == com.anythink.basead.exoplayer.e.a.a.ai || i11 == com.anythink.basead.exoplayer.e.a.a.am || i11 == com.anythink.basead.exoplayer.e.a.a.al || i11 == com.anythink.basead.exoplayer.e.a.a.aj || i11 == com.anythink.basead.exoplayer.e.a.a.ak || i11 == com.anythink.basead.exoplayer.e.a.a.f6915V || i11 == com.anythink.basead.exoplayer.e.a.a.f6912S || i11 == com.anythink.basead.exoplayer.e.a.a.aL) {
                            if (this.J == 8) {
                                long j9 = this.f7009I;
                                if (j9 <= 2147483647L) {
                                    s sVar = new s((int) j9);
                                    this.f7010K = sVar;
                                    System.arraycopy(this.f7002B.f8502a, 0, sVar.f8502a, 0, 8);
                                    this.f7007G = 1;
                                } else {
                                    throw new t("Leaf atom with length > 2147483647 (unsupported).");
                                }
                            } else {
                                throw new t("Leaf atom defines extended atom size (unsupported).");
                            }
                        } else if (this.f7009I <= 2147483647L) {
                            this.f7010K = null;
                            this.f7007G = 1;
                        } else {
                            throw new t("Skipping atom with length > 2147483647 (unsupported).");
                        }
                    } else {
                        long c12 = (fVar.c() + this.f7009I) - 8;
                        this.f7004D.push(new a.C0021a(this.f7008H, c12));
                        if (this.f7009I == this.J) {
                            a(c12);
                        } else {
                            a();
                        }
                    }
                } else {
                    throw new t("Atom size less than header length (unsupported).");
                }
            } else if (i6 != 1) {
                long j10 = Long.MAX_VALUE;
                if (i6 != 2) {
                    if (i6 != 3) {
                        c9 = 2;
                        break;
                    }
                    if (this.f7016Q != null) {
                        c9 = 2;
                        break;
                    }
                    SparseArray<c> sparseArray = this.f7028w;
                    int size2 = sparseArray.size();
                    c cVar2 = null;
                    int i12 = 0;
                    while (i12 < size2) {
                        c valueAt = sparseArray.valueAt(i12);
                        char c13 = c10;
                        int i13 = valueAt.f7040g;
                        l lVar2 = valueAt.f7035b;
                        if (i13 != lVar2.f7132e) {
                            long j11 = lVar2.f7134g[i13];
                            if (j11 < j10) {
                                cVar2 = valueAt;
                                j10 = j11;
                            }
                        }
                        i12++;
                        c10 = c13;
                    }
                    c9 = c10;
                    if (cVar2 == null) {
                        int c14 = (int) (this.f7011L - fVar.c());
                        if (c14 >= 0) {
                            fVar.c(c14);
                            a();
                        } else {
                            throw new t("Offset to end of mdat was negative.");
                        }
                    } else {
                        int c15 = (int) (cVar2.f7035b.f7134g[cVar2.f7040g] - fVar.c());
                        if (c15 < 0) {
                            Log.w(f6992j, "Ignoring negative offset to sample data.");
                            c15 = 0;
                        }
                        fVar.c(c15);
                        this.f7016Q = cVar2;
                    }
                } else {
                    int size3 = this.f7028w.size();
                    for (int i14 = 0; i14 < size3; i14++) {
                        l lVar3 = this.f7028w.valueAt(i14).f7035b;
                        if (lVar3.f7144r) {
                            long j12 = lVar3.f7131d;
                            if (j12 < j10) {
                                cVar = this.f7028w.valueAt(i14);
                                j10 = j12;
                            }
                        }
                    }
                    if (cVar == null) {
                        this.f7007G = 3;
                    } else {
                        int c16 = (int) (j10 - fVar.c());
                        if (c16 >= 0) {
                            fVar.c(c16);
                            l lVar4 = cVar.f7035b;
                            fVar.b(lVar4.f7143q.f8502a, 0, lVar4.f7142p);
                            lVar4.f7143q.c(0);
                            lVar4.f7144r = false;
                        } else {
                            throw new t("Offset to encryption data was negative.");
                        }
                    }
                }
            } else {
                int i15 = ((int) this.f7009I) - this.J;
                s sVar2 = this.f7010K;
                if (sVar2 != null) {
                    fVar.b(sVar2.f8502a, 8, i15);
                    a.b bVar = new a.b(this.f7008H, this.f7010K);
                    long c17 = fVar.c();
                    if (!this.f7004D.isEmpty()) {
                        this.f7004D.peek().a(bVar);
                    } else {
                        int i16 = bVar.aU;
                        if (i16 == com.anythink.basead.exoplayer.e.a.a.f6900F) {
                            s sVar3 = bVar.aV;
                            sVar3.c(8);
                            int a9 = com.anythink.basead.exoplayer.e.a.a.a(sVar3.i());
                            sVar3.d(4);
                            long h9 = sVar3.h();
                            if (a9 == 0) {
                                n9 = sVar3.h();
                                n10 = sVar3.h();
                            } else {
                                n9 = sVar3.n();
                                n10 = sVar3.n();
                            }
                            long j13 = n10 + c17;
                            long j14 = n9;
                            long a10 = af.a(j14, 1000000L, h9);
                            sVar3.d(2);
                            int e9 = sVar3.e();
                            int[] iArr = new int[e9];
                            long[] jArr = new long[e9];
                            long[] jArr2 = new long[e9];
                            long[] jArr3 = new long[e9];
                            long j15 = a10;
                            int i17 = 0;
                            while (i17 < e9) {
                                int i18 = sVar3.i();
                                if ((i18 & Integer.MIN_VALUE) == 0) {
                                    long h10 = sVar3.h();
                                    iArr[i17] = i18 & Integer.MAX_VALUE;
                                    jArr[i17] = j13;
                                    jArr3[i17] = j15;
                                    long j16 = j14 + h10;
                                    int i19 = i17;
                                    long[] jArr4 = jArr3;
                                    long a11 = af.a(j16, 1000000L, h9);
                                    jArr2[i19] = a11 - jArr4[i19];
                                    int i20 = e9;
                                    sVar3.d(4);
                                    long j17 = j13 + iArr[i19];
                                    int i21 = i19 + 1;
                                    j15 = a11;
                                    jArr3 = jArr4;
                                    j13 = j17;
                                    i17 = i21;
                                    j14 = j16;
                                    e9 = i20;
                                } else {
                                    throw new t("Unhandled indirect reference");
                                }
                            }
                            Pair create = Pair.create(Long.valueOf(a10), new com.anythink.basead.exoplayer.e.a(iArr, jArr, jArr2, jArr3));
                            this.f7015P = ((Long) create.first).longValue();
                            this.f7021V.a((com.anythink.basead.exoplayer.e.k) create.second);
                            this.Y = true;
                        } else if (i16 == com.anythink.basead.exoplayer.e.a.a.aL) {
                            s sVar4 = bVar.aV;
                            com.anythink.basead.exoplayer.e.m[] mVarArr = this.f7022W;
                            if (mVarArr != null && mVarArr.length != 0) {
                                sVar4.c(12);
                                int a12 = sVar4.a();
                                sVar4.p();
                                sVar4.p();
                                long a13 = af.a(sVar4.h(), 1000000L, sVar4.h());
                                for (com.anythink.basead.exoplayer.e.m mVar : this.f7022W) {
                                    sVar4.c(12);
                                    mVar.a(sVar4, a12);
                                }
                                long j18 = this.f7015P;
                                if (j18 != com.anythink.basead.exoplayer.b.f6382b) {
                                    long j19 = j18 + a13;
                                    ac acVar = this.f7001A;
                                    if (acVar != null) {
                                        j19 = acVar.b(j19);
                                    }
                                    long j20 = j19;
                                    for (com.anythink.basead.exoplayer.e.m mVar2 : this.f7022W) {
                                        mVar2.a(j20, 1, a12, 0, null);
                                    }
                                } else {
                                    this.f7005E.addLast(new b(a13, a12));
                                    this.f7012M += a12;
                                }
                            }
                        }
                    }
                } else {
                    fVar.c(i15);
                }
                a(fVar.c());
            }
        }
    }

    private void b(a.C0021a c0021a) {
        int i6 = 0;
        com.anythink.basead.exoplayer.k.a.b(this.f7025t == null, "Unexpected moov box.");
        com.anythink.basead.exoplayer.d.e eVar = this.f7027v;
        if (eVar == null) {
            eVar = a(c0021a.aW);
        }
        com.anythink.basead.exoplayer.d.e eVar2 = eVar;
        a.C0021a e9 = c0021a.e(com.anythink.basead.exoplayer.e.a.a.f6911R);
        SparseArray sparseArray = new SparseArray();
        int size = e9.aW.size();
        long j6 = -9223372036854775807L;
        for (int i9 = 0; i9 < size; i9++) {
            a.b bVar = e9.aW.get(i9);
            int i10 = bVar.aU;
            if (i10 == com.anythink.basead.exoplayer.e.a.a.f6898D) {
                Pair<Integer, com.anythink.basead.exoplayer.e.a.c> b9 = b(bVar.aV);
                sparseArray.put(((Integer) b9.first).intValue(), (com.anythink.basead.exoplayer.e.a.c) b9.second);
            } else if (i10 == com.anythink.basead.exoplayer.e.a.a.f6912S) {
                j6 = c(bVar.aV);
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        int size2 = c0021a.aX.size();
        for (int i11 = 0; i11 < size2; i11++) {
            a.C0021a c0021a2 = c0021a.aX.get(i11);
            if (c0021a2.aU == com.anythink.basead.exoplayer.e.a.a.f6903I) {
                j a9 = com.anythink.basead.exoplayer.e.a.b.a(c0021a2, c0021a.d(com.anythink.basead.exoplayer.e.a.a.f6902H), j6, eVar2, (this.f7024s & 16) != 0, false);
                if (a9 != null) {
                    sparseArray2.put(a9.f7112c, a9);
                }
            }
        }
        int size3 = sparseArray2.size();
        if (this.f7028w.size() == 0) {
            while (i6 < size3) {
                j jVar = (j) sparseArray2.valueAt(i6);
                c cVar = new c(this.f7021V.a(i6, jVar.f7113d));
                cVar.a(jVar, a((SparseArray<com.anythink.basead.exoplayer.e.a.c>) sparseArray, jVar.f7112c));
                this.f7028w.put(jVar.f7112c, cVar);
                this.f7014O = Math.max(this.f7014O, jVar.f7116g);
                i6++;
            }
            b();
            this.f7021V.c_();
            return;
        }
        com.anythink.basead.exoplayer.k.a.b(this.f7028w.size() == size3);
        while (i6 < size3) {
            j jVar2 = (j) sparseArray2.valueAt(i6);
            this.f7028w.get(jVar2.f7112c).a(jVar2, a((SparseArray<com.anythink.basead.exoplayer.e.a.c>) sparseArray, jVar2.f7112c));
            i6++;
        }
    }

    private void c(a.C0021a c0021a) {
        a(c0021a, this.f7028w, this.f7024s, this.f7003C);
        com.anythink.basead.exoplayer.d.e a9 = this.f7027v != null ? null : a(c0021a.aW);
        if (a9 != null) {
            int size = this.f7028w.size();
            for (int i6 = 0; i6 < size; i6++) {
                this.f7028w.valueAt(i6).a(a9);
            }
        }
        if (this.f7013N != com.anythink.basead.exoplayer.b.f6382b) {
            int size2 = this.f7028w.size();
            for (int i9 = 0; i9 < size2; i9++) {
                this.f7028w.valueAt(i9).a(this.f7013N);
            }
            this.f7013N = com.anythink.basead.exoplayer.b.f6382b;
        }
    }

    private static long c(s sVar) {
        sVar.c(8);
        return com.anythink.basead.exoplayer.e.a.a.a(sVar.i()) == 0 ? sVar.h() : sVar.n();
    }

    private void b() {
        int i6;
        if (this.f7022W == null) {
            com.anythink.basead.exoplayer.e.m[] mVarArr = new com.anythink.basead.exoplayer.e.m[2];
            this.f7022W = mVarArr;
            com.anythink.basead.exoplayer.e.m mVar = this.f7006F;
            if (mVar != null) {
                mVarArr[0] = mVar;
                i6 = 1;
            } else {
                i6 = 0;
            }
            if ((this.f7024s & 4) != 0) {
                mVarArr[i6] = this.f7021V.a(this.f7028w.size(), 4);
                i6++;
            }
            com.anythink.basead.exoplayer.e.m[] mVarArr2 = (com.anythink.basead.exoplayer.e.m[]) Arrays.copyOf(this.f7022W, i6);
            this.f7022W = mVarArr2;
            for (com.anythink.basead.exoplayer.e.m mVar2 : mVarArr2) {
                mVar2.a(f6995m);
            }
        }
        if (this.f7023X == null) {
            this.f7023X = new com.anythink.basead.exoplayer.e.m[this.f7026u.size()];
            for (int i9 = 0; i9 < this.f7023X.length; i9++) {
                com.anythink.basead.exoplayer.e.m a9 = this.f7021V.a(this.f7028w.size() + 1 + i9, 3);
                a9.a(this.f7026u.get(i9));
                this.f7023X[i9] = a9;
            }
        }
    }

    private static Pair<Integer, com.anythink.basead.exoplayer.e.a.c> b(s sVar) {
        sVar.c(12);
        return Pair.create(Integer.valueOf(sVar.i()), new com.anythink.basead.exoplayer.e.a.c(sVar.m() - 1, sVar.m(), sVar.m(), sVar.i()));
    }

    private static void b(a.C0021a c0021a, SparseArray<c> sparseArray, int i6, byte[] bArr) {
        c a9 = a(c0021a.d(com.anythink.basead.exoplayer.e.a.a.f6897C).aV, sparseArray);
        if (a9 == null) {
            return;
        }
        l lVar = a9.f7035b;
        long j6 = lVar.f7145s;
        a9.a();
        int i9 = com.anythink.basead.exoplayer.e.a.a.f6896B;
        if (c0021a.d(i9) != null && (i6 & 2) == 0) {
            j6 = d(c0021a.d(i9).aV);
        }
        a(c0021a, a9, j6, i6);
        k a10 = a9.f7036c.a(lVar.f7128a.f6976a);
        a.b d2 = c0021a.d(com.anythink.basead.exoplayer.e.a.a.ah);
        if (d2 != null) {
            a(a10, d2.aV, lVar);
        }
        a.b d9 = c0021a.d(com.anythink.basead.exoplayer.e.a.a.ai);
        if (d9 != null) {
            a(d9.aV, lVar);
        }
        a.b d10 = c0021a.d(com.anythink.basead.exoplayer.e.a.a.am);
        if (d10 != null) {
            a(d10.aV, 0, lVar);
        }
        a.b d11 = c0021a.d(com.anythink.basead.exoplayer.e.a.a.aj);
        a.b d12 = c0021a.d(com.anythink.basead.exoplayer.e.a.a.ak);
        if (d11 != null && d12 != null) {
            a(d11.aV, d12.aV, a10 != null ? a10.f7124b : null, lVar);
        }
        int size = c0021a.aW.size();
        for (int i10 = 0; i10 < size; i10++) {
            a.b bVar = c0021a.aW.get(i10);
            if (bVar.aU == com.anythink.basead.exoplayer.e.a.a.al) {
                a(bVar.aV, lVar, bArr);
            }
        }
    }

    private static c b(SparseArray<c> sparseArray, int i6) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return sparseArray.get(i6);
    }

    private static void b(s sVar, l lVar) {
        a(sVar, 0, lVar);
    }

    private void b(long j6) {
        while (!this.f7005E.isEmpty()) {
            b removeFirst = this.f7005E.removeFirst();
            this.f7012M -= removeFirst.f7033b;
            long j9 = removeFirst.f7032a + j6;
            ac acVar = this.f7001A;
            if (acVar != null) {
                j9 = acVar.b(j9);
            }
            long j10 = j9;
            for (com.anythink.basead.exoplayer.e.m mVar : this.f7022W) {
                mVar.a(j10, 1, removeFirst.f7033b, this.f7012M, null);
            }
        }
    }

    private static boolean b(int i6) {
        return i6 == com.anythink.basead.exoplayer.e.a.a.f6901G || i6 == com.anythink.basead.exoplayer.e.a.a.f6903I || i6 == com.anythink.basead.exoplayer.e.a.a.J || i6 == com.anythink.basead.exoplayer.e.a.a.f6904K || i6 == com.anythink.basead.exoplayer.e.a.a.f6905L || i6 == com.anythink.basead.exoplayer.e.a.a.f6909P || i6 == com.anythink.basead.exoplayer.e.a.a.f6910Q || i6 == com.anythink.basead.exoplayer.e.a.a.f6911R || i6 == com.anythink.basead.exoplayer.e.a.a.f6914U;
    }

    private void a() {
        this.f7007G = 0;
        this.J = 0;
    }

    private void a(long j6) {
        while (!this.f7004D.isEmpty() && this.f7004D.peek().aV == j6) {
            a(this.f7004D.pop());
        }
        a();
    }

    private void a(a.b bVar, long j6) {
        long n9;
        long n10;
        if (!this.f7004D.isEmpty()) {
            this.f7004D.peek().a(bVar);
            return;
        }
        int i6 = bVar.aU;
        if (i6 == com.anythink.basead.exoplayer.e.a.a.f6900F) {
            s sVar = bVar.aV;
            sVar.c(8);
            int a9 = com.anythink.basead.exoplayer.e.a.a.a(sVar.i());
            sVar.d(4);
            long h9 = sVar.h();
            if (a9 == 0) {
                n9 = sVar.h();
                n10 = sVar.h();
            } else {
                n9 = sVar.n();
                n10 = sVar.n();
            }
            long j9 = n10 + j6;
            long a10 = af.a(n9, 1000000L, h9);
            sVar.d(2);
            int e9 = sVar.e();
            int[] iArr = new int[e9];
            long[] jArr = new long[e9];
            long[] jArr2 = new long[e9];
            long[] jArr3 = new long[e9];
            long j10 = j9;
            long j11 = a10;
            int i9 = 0;
            while (i9 < e9) {
                int i10 = sVar.i();
                if ((i10 & Integer.MIN_VALUE) == 0) {
                    long h10 = sVar.h();
                    iArr[i9] = i10 & Integer.MAX_VALUE;
                    jArr[i9] = j10;
                    jArr3[i9] = j11;
                    n9 += h10;
                    long[] jArr4 = jArr2;
                    j11 = af.a(n9, 1000000L, h9);
                    jArr4[i9] = j11 - jArr3[i9];
                    sVar.d(4);
                    j10 += iArr[i9];
                    i9++;
                    jArr2 = jArr4;
                    jArr = jArr;
                } else {
                    throw new t("Unhandled indirect reference");
                }
            }
            Pair create = Pair.create(Long.valueOf(a10), new com.anythink.basead.exoplayer.e.a(iArr, jArr, jArr2, jArr3));
            this.f7015P = ((Long) create.first).longValue();
            this.f7021V.a((com.anythink.basead.exoplayer.e.k) create.second);
            this.Y = true;
            return;
        }
        if (i6 == com.anythink.basead.exoplayer.e.a.a.aL) {
            s sVar2 = bVar.aV;
            com.anythink.basead.exoplayer.e.m[] mVarArr = this.f7022W;
            if (mVarArr == null || mVarArr.length == 0) {
                return;
            }
            sVar2.c(12);
            int a11 = sVar2.a();
            sVar2.p();
            sVar2.p();
            long a12 = af.a(sVar2.h(), 1000000L, sVar2.h());
            for (com.anythink.basead.exoplayer.e.m mVar : this.f7022W) {
                sVar2.c(12);
                mVar.a(sVar2, a11);
            }
            long j12 = this.f7015P;
            if (j12 != com.anythink.basead.exoplayer.b.f6382b) {
                long j13 = j12 + a12;
                ac acVar = this.f7001A;
                if (acVar != null) {
                    j13 = acVar.b(j13);
                }
                long j14 = j13;
                for (com.anythink.basead.exoplayer.e.m mVar2 : this.f7022W) {
                    mVar2.a(j14, 1, a11, 0, null);
                }
                return;
            }
            this.f7005E.addLast(new b(a12, a11));
            this.f7012M += a11;
        }
    }

    private void a(a.C0021a c0021a) {
        int i6 = c0021a.aU;
        if (i6 == com.anythink.basead.exoplayer.e.a.a.f6901G) {
            b(c0021a);
        } else if (i6 == com.anythink.basead.exoplayer.e.a.a.f6909P) {
            c(c0021a);
        } else {
            if (this.f7004D.isEmpty()) {
                return;
            }
            this.f7004D.peek().a(c0021a);
        }
    }

    private static com.anythink.basead.exoplayer.e.a.c a(SparseArray<com.anythink.basead.exoplayer.e.a.c> sparseArray, int i6) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (com.anythink.basead.exoplayer.e.a.c) com.anythink.basead.exoplayer.k.a.a(sparseArray.get(i6));
    }

    private void a(s sVar) {
        com.anythink.basead.exoplayer.e.m[] mVarArr = this.f7022W;
        if (mVarArr == null || mVarArr.length == 0) {
            return;
        }
        sVar.c(12);
        int a9 = sVar.a();
        sVar.p();
        sVar.p();
        long a10 = af.a(sVar.h(), 1000000L, sVar.h());
        for (com.anythink.basead.exoplayer.e.m mVar : this.f7022W) {
            sVar.c(12);
            mVar.a(sVar, a9);
        }
        long j6 = this.f7015P;
        if (j6 != com.anythink.basead.exoplayer.b.f6382b) {
            long j9 = j6 + a10;
            ac acVar = this.f7001A;
            if (acVar != null) {
                j9 = acVar.b(j9);
            }
            long j10 = j9;
            for (com.anythink.basead.exoplayer.e.m mVar2 : this.f7022W) {
                mVar2.a(j10, 1, a9, 0, null);
            }
            return;
        }
        this.f7005E.addLast(new b(a10, a9));
        this.f7012M += a9;
    }

    private static void a(a.C0021a c0021a, SparseArray<c> sparseArray, int i6, byte[] bArr) {
        int size = c0021a.aX.size();
        for (int i9 = 0; i9 < size; i9++) {
            a.C0021a c0021a2 = c0021a.aX.get(i9);
            if (c0021a2.aU == com.anythink.basead.exoplayer.e.a.a.f6910Q) {
                b(c0021a2, sparseArray, i6, bArr);
            }
        }
    }

    private static void a(a.C0021a c0021a, c cVar, long j6, int i6) {
        c cVar2;
        long j9;
        int i9;
        List<a.b> list = c0021a.aW;
        int size = list.size();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            a.b bVar = list.get(i13);
            if (bVar.aU == com.anythink.basead.exoplayer.e.a.a.f6899E) {
                s sVar = bVar.aV;
                sVar.c(12);
                int m4 = sVar.m();
                if (m4 > 0) {
                    i12 += m4;
                    i11++;
                }
            }
        }
        cVar.f7040g = 0;
        cVar.f7039f = 0;
        cVar.f7038e = 0;
        cVar.f7035b.a(i11, i12);
        int i14 = 0;
        int i15 = 0;
        while (i10 < size) {
            a.b bVar2 = list.get(i10);
            if (bVar2.aU == com.anythink.basead.exoplayer.e.a.a.f6899E) {
                s sVar2 = bVar2.aV;
                cVar2 = cVar;
                j9 = j6;
                i9 = i6;
                i15 = a(cVar2, i14, j9, i9, sVar2, i15);
                i14++;
            } else {
                cVar2 = cVar;
                j9 = j6;
                i9 = i6;
            }
            i10++;
            cVar = cVar2;
            j6 = j9;
            i6 = i9;
        }
    }

    private static void a(k kVar, s sVar, l lVar) {
        int i6;
        int i9 = kVar.f7126d;
        sVar.c(8);
        if ((com.anythink.basead.exoplayer.e.a.a.b(sVar.i()) & 1) == 1) {
            sVar.d(8);
        }
        int d2 = sVar.d();
        int m4 = sVar.m();
        if (m4 == lVar.f7133f) {
            if (d2 == 0) {
                boolean[] zArr = lVar.f7140n;
                i6 = 0;
                for (int i10 = 0; i10 < m4; i10++) {
                    int d9 = sVar.d();
                    i6 += d9;
                    zArr[i10] = d9 > i9;
                }
            } else {
                i6 = d2 * m4;
                Arrays.fill(lVar.f7140n, 0, m4, d2 > i9);
            }
            lVar.a(i6);
            return;
        }
        StringBuilder i11 = AbstractC4404f.i(m4, "Length mismatch: ", ", ");
        i11.append(lVar.f7133f);
        throw new t(i11.toString());
    }

    private static void a(s sVar, l lVar) {
        sVar.c(8);
        int i6 = sVar.i();
        if ((com.anythink.basead.exoplayer.e.a.a.b(i6) & 1) == 1) {
            sVar.d(8);
        }
        int m4 = sVar.m();
        if (m4 == 1) {
            lVar.f7131d += com.anythink.basead.exoplayer.e.a.a.a(i6) == 0 ? sVar.h() : sVar.n();
            return;
        }
        throw new t("Unexpected saio entry count: ".concat(String.valueOf(m4)));
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
            l lVar = b10.f7035b;
            lVar.f7130c = n9;
            lVar.f7131d = n9;
        }
        com.anythink.basead.exoplayer.e.a.c cVar = b10.f7037d;
        b10.f7035b.f7128a = new com.anythink.basead.exoplayer.e.a.c((b9 & 2) != 0 ? sVar.m() - 1 : cVar.f6976a, (b9 & 8) != 0 ? sVar.m() : cVar.f6977b, (b9 & 16) != 0 ? sVar.m() : cVar.f6978c, (b9 & 32) != 0 ? sVar.m() : cVar.f6979d);
        return b10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int[]] */
    private static int a(c cVar, int i6, long j6, int i9, s sVar, int i10) {
        ?? r27;
        boolean z3;
        int i11;
        boolean z6;
        int i12;
        int i13;
        int i14;
        sVar.c(8);
        int b9 = com.anythink.basead.exoplayer.e.a.a.b(sVar.i());
        j jVar = cVar.f7036c;
        l lVar = cVar.f7035b;
        com.anythink.basead.exoplayer.e.a.c cVar2 = lVar.f7128a;
        lVar.f7135h[i6] = sVar.m();
        long[] jArr = lVar.f7134g;
        long j9 = lVar.f7130c;
        jArr[i6] = j9;
        if ((b9 & 1) != 0) {
            jArr[i6] = j9 + sVar.i();
        }
        boolean z9 = (b9 & 4) != 0;
        int i15 = cVar2.f6979d;
        if (z9) {
            i15 = sVar.m();
        }
        boolean z10 = (b9 & 256) != 0;
        boolean z11 = (b9 & 512) != 0;
        boolean z12 = (b9 & 1024) != 0;
        boolean z13 = (b9 & 2048) != 0;
        long[] jArr2 = jVar.f7118j;
        long j10 = 0;
        if (jArr2 != null && jArr2.length == 1 && jArr2[0] == 0) {
            r27 = 0;
            z3 = true;
            j10 = af.a(jVar.f7119k[0], 1000L, jVar.f7114e);
        } else {
            r27 = 0;
            z3 = true;
        }
        int[] iArr = lVar.i;
        ?? r72 = lVar.f7136j;
        long[] jArr3 = lVar.f7137k;
        boolean z14 = z3;
        boolean[] zArr = lVar.f7138l;
        boolean z15 = z13;
        boolean z16 = (jVar.f7113d != 2 || (i9 & 1) == 0) ? r27 : z14;
        int i16 = i10 + lVar.f7135h[i6];
        boolean z17 = z9;
        long j11 = jVar.f7114e;
        int i17 = i10;
        long j12 = i6 > 0 ? lVar.f7145s : j6;
        while (i17 < i16) {
            if (z10) {
                i11 = sVar.m();
            } else {
                i11 = cVar2.f6977b;
            }
            int m4 = z11 ? sVar.m() : cVar2.f6978c;
            if (i17 == 0 && z17) {
                z6 = z16;
                i12 = i15;
            } else if (z12) {
                z6 = z16;
                i12 = sVar.i();
            } else {
                z6 = z16;
                i12 = cVar2.f6979d;
            }
            if (z15) {
                i13 = i12;
                i14 = i16;
                r72[i17] = (int) ((sVar.i() * 1000) / j11);
            } else {
                i13 = i12;
                i14 = i16;
                r72[i17] = r27;
            }
            long j13 = j12;
            jArr3[i17] = af.a(j12, 1000L, j11) - j10;
            iArr[i17] = m4;
            zArr[i17] = (((i13 >> 16) & 1) != 0 || (z6 && i17 != 0)) ? r27 : z14;
            j12 = j13 + i11;
            i17++;
            z16 = z6;
            i16 = i14;
        }
        int i18 = i16;
        lVar.f7145s = j12;
        return i18;
    }

    private static void a(s sVar, l lVar, byte[] bArr) {
        sVar.c(8);
        sVar.a(bArr, 0, 16);
        if (Arrays.equals(bArr, f6994l)) {
            a(sVar, 16, lVar);
        }
    }

    private static void a(s sVar, int i6, l lVar) {
        sVar.c(i6 + 8);
        int b9 = com.anythink.basead.exoplayer.e.a.a.b(sVar.i());
        if ((b9 & 1) == 0) {
            boolean z3 = (b9 & 2) != 0;
            int m4 = sVar.m();
            if (m4 == lVar.f7133f) {
                Arrays.fill(lVar.f7140n, 0, m4, z3);
                lVar.a(sVar.a());
                lVar.a(sVar);
                return;
            } else {
                StringBuilder i9 = AbstractC4404f.i(m4, "Length mismatch: ", ", ");
                i9.append(lVar.f7133f);
                throw new t(i9.toString());
            }
        }
        throw new t("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    private static void a(s sVar, s sVar2, String str, l lVar) {
        byte[] bArr;
        sVar.c(8);
        int i6 = sVar.i();
        int i9 = sVar.i();
        int i10 = f6993k;
        if (i9 != i10) {
            return;
        }
        if (com.anythink.basead.exoplayer.e.a.a.a(i6) == 1) {
            sVar.d(4);
        }
        if (sVar.i() == 1) {
            sVar2.c(8);
            int i11 = sVar2.i();
            if (sVar2.i() != i10) {
                return;
            }
            int a9 = com.anythink.basead.exoplayer.e.a.a.a(i11);
            if (a9 == 1) {
                if (sVar2.h() == 0) {
                    throw new t("Variable length description in sgpd found (unsupported)");
                }
            } else if (a9 >= 2) {
                sVar2.d(4);
            }
            if (sVar2.h() == 1) {
                sVar2.d(1);
                int d2 = sVar2.d();
                int i12 = (d2 & 240) >> 4;
                int i13 = d2 & 15;
                if (sVar2.d() == 1) {
                    int d9 = sVar2.d();
                    byte[] bArr2 = new byte[16];
                    sVar2.a(bArr2, 0, 16);
                    if (d9 == 0) {
                        int d10 = sVar2.d();
                        bArr = new byte[d10];
                        sVar2.a(bArr, 0, d10);
                    } else {
                        bArr = null;
                    }
                    byte[] bArr3 = bArr;
                    lVar.f7139m = true;
                    lVar.f7141o = new k(true, str, d9, bArr2, i12, i13, bArr3);
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
        long h9 = sVar.h();
        if (a9 == 0) {
            n9 = sVar.h();
            n10 = sVar.h();
        } else {
            n9 = sVar.n();
            n10 = sVar.n();
        }
        long j9 = n10 + j6;
        long a10 = af.a(n9, 1000000L, h9);
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
            if ((Integer.MIN_VALUE & i9) == 0) {
                long h10 = sVar.h();
                iArr[i6] = i9 & Integer.MAX_VALUE;
                jArr[i6] = j10;
                jArr3[i6] = j11;
                n9 += h10;
                long[] jArr4 = jArr3;
                j11 = af.a(n9, 1000000L, h9);
                jArr2[i6] = j11 - jArr4[i6];
                sVar.d(4);
                j10 += iArr[i6];
                i6++;
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
        for (int i6 = 0; i6 < size; i6++) {
            c valueAt = sparseArray.valueAt(i6);
            int i9 = valueAt.f7040g;
            l lVar = valueAt.f7035b;
            if (i9 != lVar.f7132e) {
                long j9 = lVar.f7134g[i9];
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
        for (int i6 = 0; i6 < size; i6++) {
            a.b bVar = list.get(i6);
            if (bVar.aU == com.anythink.basead.exoplayer.e.a.a.f6918Z) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = bVar.aV.f8502a;
                UUID a9 = h.a(bArr);
                if (a9 == null) {
                    Log.w(f6992j, "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new e.a(a9, o.f8448e, bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new com.anythink.basead.exoplayer.d.e(arrayList);
    }

    private static boolean a(int i6) {
        return i6 == com.anythink.basead.exoplayer.e.a.a.f6917X || i6 == com.anythink.basead.exoplayer.e.a.a.f6916W || i6 == com.anythink.basead.exoplayer.e.a.a.f6902H || i6 == com.anythink.basead.exoplayer.e.a.a.f6900F || i6 == com.anythink.basead.exoplayer.e.a.a.Y || i6 == com.anythink.basead.exoplayer.e.a.a.f6896B || i6 == com.anythink.basead.exoplayer.e.a.a.f6897C || i6 == com.anythink.basead.exoplayer.e.a.a.f6913T || i6 == com.anythink.basead.exoplayer.e.a.a.f6898D || i6 == com.anythink.basead.exoplayer.e.a.a.f6899E || i6 == com.anythink.basead.exoplayer.e.a.a.f6918Z || i6 == com.anythink.basead.exoplayer.e.a.a.ah || i6 == com.anythink.basead.exoplayer.e.a.a.ai || i6 == com.anythink.basead.exoplayer.e.a.a.am || i6 == com.anythink.basead.exoplayer.e.a.a.al || i6 == com.anythink.basead.exoplayer.e.a.a.aj || i6 == com.anythink.basead.exoplayer.e.a.a.ak || i6 == com.anythink.basead.exoplayer.e.a.a.f6915V || i6 == com.anythink.basead.exoplayer.e.a.a.f6912S || i6 == com.anythink.basead.exoplayer.e.a.a.aL;
    }
}

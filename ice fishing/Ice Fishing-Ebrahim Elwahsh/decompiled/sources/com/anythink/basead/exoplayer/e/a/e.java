package com.anythink.basead.exoplayer.e.a;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.anythink.basead.exoplayer.d.e;
import com.anythink.basead.exoplayer.e.a.a;
import com.anythink.basead.exoplayer.e.k;
import com.anythink.basead.exoplayer.e.m;
import com.anythink.basead.exoplayer.k.C0544a;
import com.anythink.basead.exoplayer.k.ac;
import com.anythink.basead.exoplayer.k.af;
import com.anythink.basead.exoplayer.k.o;
import com.anythink.basead.exoplayer.k.p;
import com.anythink.basead.exoplayer.k.s;
import com.anythink.basead.exoplayer.t;
import com.google.android.gms.internal.ads.CL;
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
    public static final int f7145e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f7146f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final int f7147g = 4;

    /* renamed from: h, reason: collision with root package name */
    public static final int f7148h = 16;
    private static final int i = 8;

    /* renamed from: j, reason: collision with root package name */
    private static final String f7149j = "FragmentedMp4Extractor";

    /* renamed from: n, reason: collision with root package name */
    private static final int f7153n = 0;

    /* renamed from: o, reason: collision with root package name */
    private static final int f7154o = 1;

    /* renamed from: p, reason: collision with root package name */
    private static final int f7155p = 2;

    /* renamed from: q, reason: collision with root package name */
    private static final int f7156q = 3;

    /* renamed from: r, reason: collision with root package name */
    private static final int f7157r = 4;

    /* renamed from: A, reason: collision with root package name */
    private final ac f7158A;

    /* renamed from: B, reason: collision with root package name */
    private final s f7159B;

    /* renamed from: C, reason: collision with root package name */
    private final byte[] f7160C;

    /* renamed from: D, reason: collision with root package name */
    private final ArrayDeque<a.C0020a> f7161D;

    /* renamed from: E, reason: collision with root package name */
    private final ArrayDeque<b> f7162E;

    /* renamed from: F, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.e.m f7163F;

    /* renamed from: G, reason: collision with root package name */
    private int f7164G;

    /* renamed from: H, reason: collision with root package name */
    private int f7165H;

    /* renamed from: I, reason: collision with root package name */
    private long f7166I;
    private int J;

    /* renamed from: K, reason: collision with root package name */
    private s f7167K;

    /* renamed from: L, reason: collision with root package name */
    private long f7168L;

    /* renamed from: M, reason: collision with root package name */
    private int f7169M;

    /* renamed from: N, reason: collision with root package name */
    private long f7170N;

    /* renamed from: O, reason: collision with root package name */
    private long f7171O;

    /* renamed from: P, reason: collision with root package name */
    private long f7172P;

    /* renamed from: Q, reason: collision with root package name */
    private c f7173Q;

    /* renamed from: R, reason: collision with root package name */
    private int f7174R;

    /* renamed from: S, reason: collision with root package name */
    private int f7175S;

    /* renamed from: T, reason: collision with root package name */
    private int f7176T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f7177U;

    /* renamed from: V, reason: collision with root package name */
    private com.anythink.basead.exoplayer.e.g f7178V;

    /* renamed from: W, reason: collision with root package name */
    private com.anythink.basead.exoplayer.e.m[] f7179W;

    /* renamed from: X, reason: collision with root package name */
    private com.anythink.basead.exoplayer.e.m[] f7180X;
    private boolean Y;

    /* renamed from: s, reason: collision with root package name */
    private final int f7181s;

    /* renamed from: t, reason: collision with root package name */
    private final j f7182t;

    /* renamed from: u, reason: collision with root package name */
    private final List<com.anythink.basead.exoplayer.m> f7183u;

    /* renamed from: v, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.d.e f7184v;

    /* renamed from: w, reason: collision with root package name */
    private final SparseArray<c> f7185w;

    /* renamed from: x, reason: collision with root package name */
    private final s f7186x;

    /* renamed from: y, reason: collision with root package name */
    private final s f7187y;

    /* renamed from: z, reason: collision with root package name */
    private final s f7188z;

    /* renamed from: d, reason: collision with root package name */
    public static final com.anythink.basead.exoplayer.e.h f7144d = new com.anythink.basead.exoplayer.e.h() { // from class: com.anythink.basead.exoplayer.e.a.e.1
        @Override // com.anythink.basead.exoplayer.e.h
        public final com.anythink.basead.exoplayer.e.e[] a() {
            return new com.anythink.basead.exoplayer.e.e[]{new e()};
        }
    };

    /* renamed from: k, reason: collision with root package name */
    private static final int f7150k = af.f("seig");

    /* renamed from: l, reason: collision with root package name */
    private static final byte[] f7151l = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: m, reason: collision with root package name */
    private static final com.anythink.basead.exoplayer.m f7152m = com.anythink.basead.exoplayer.m.a((String) null, o.ai);

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final long f7189a;

        /* renamed from: b, reason: collision with root package name */
        public final int f7190b;

        public b(long j9, int i) {
            this.f7189a = j9;
            this.f7190b = i;
        }
    }

    public e() {
        this(0);
    }

    private boolean b(com.anythink.basead.exoplayer.e.f fVar) {
        if (this.J == 0) {
            if (!fVar.a(this.f7159B.f8659a, 0, 8, true)) {
                return false;
            }
            this.J = 8;
            this.f7159B.c(0);
            this.f7166I = this.f7159B.h();
            this.f7165H = this.f7159B.i();
        }
        long j9 = this.f7166I;
        if (j9 == 1) {
            fVar.b(this.f7159B.f8659a, 8, 8);
            this.J += 8;
            this.f7166I = this.f7159B.n();
        } else if (j9 == 0) {
            long d2 = fVar.d();
            if (d2 == -1 && !this.f7161D.isEmpty()) {
                d2 = this.f7161D.peek().aV;
            }
            if (d2 != -1) {
                this.f7166I = (d2 - fVar.c()) + this.J;
            }
        }
        if (this.f7166I < this.J) {
            throw new t("Atom size less than header length (unsupported).");
        }
        long c4 = fVar.c() - this.J;
        if (this.f7165H == com.anythink.basead.exoplayer.e.a.a.f7066P) {
            int size = this.f7185w.size();
            for (int i4 = 0; i4 < size; i4++) {
                l lVar = this.f7185w.valueAt(i4).f7192b;
                lVar.f7286b = c4;
                lVar.f7288d = c4;
                lVar.f7287c = c4;
            }
        }
        int i9 = this.f7165H;
        if (i9 == com.anythink.basead.exoplayer.e.a.a.f7087m) {
            this.f7173Q = null;
            this.f7168L = this.f7166I + c4;
            if (!this.Y) {
                this.f7178V.a(new k.b(this.f7171O, c4));
                this.Y = true;
            }
            this.f7164G = 2;
            return true;
        }
        if (i9 == com.anythink.basead.exoplayer.e.a.a.f7058G || i9 == com.anythink.basead.exoplayer.e.a.a.f7060I || i9 == com.anythink.basead.exoplayer.e.a.a.J || i9 == com.anythink.basead.exoplayer.e.a.a.f7061K || i9 == com.anythink.basead.exoplayer.e.a.a.f7062L || i9 == com.anythink.basead.exoplayer.e.a.a.f7066P || i9 == com.anythink.basead.exoplayer.e.a.a.f7067Q || i9 == com.anythink.basead.exoplayer.e.a.a.f7068R || i9 == com.anythink.basead.exoplayer.e.a.a.f7071U) {
            long c9 = (fVar.c() + this.f7166I) - 8;
            this.f7161D.push(new a.C0020a(this.f7165H, c9));
            if (this.f7166I == this.J) {
                a(c9);
            } else {
                a();
            }
        } else if (i9 == com.anythink.basead.exoplayer.e.a.a.f7074X || i9 == com.anythink.basead.exoplayer.e.a.a.f7073W || i9 == com.anythink.basead.exoplayer.e.a.a.f7059H || i9 == com.anythink.basead.exoplayer.e.a.a.f7057F || i9 == com.anythink.basead.exoplayer.e.a.a.Y || i9 == com.anythink.basead.exoplayer.e.a.a.f7053B || i9 == com.anythink.basead.exoplayer.e.a.a.f7054C || i9 == com.anythink.basead.exoplayer.e.a.a.f7070T || i9 == com.anythink.basead.exoplayer.e.a.a.f7055D || i9 == com.anythink.basead.exoplayer.e.a.a.f7056E || i9 == com.anythink.basead.exoplayer.e.a.a.f7075Z || i9 == com.anythink.basead.exoplayer.e.a.a.ah || i9 == com.anythink.basead.exoplayer.e.a.a.ai || i9 == com.anythink.basead.exoplayer.e.a.a.am || i9 == com.anythink.basead.exoplayer.e.a.a.al || i9 == com.anythink.basead.exoplayer.e.a.a.aj || i9 == com.anythink.basead.exoplayer.e.a.a.ak || i9 == com.anythink.basead.exoplayer.e.a.a.f7072V || i9 == com.anythink.basead.exoplayer.e.a.a.f7069S || i9 == com.anythink.basead.exoplayer.e.a.a.aL) {
            if (this.J != 8) {
                throw new t("Leaf atom defines extended atom size (unsupported).");
            }
            long j10 = this.f7166I;
            if (j10 > 2147483647L) {
                throw new t("Leaf atom with length > 2147483647 (unsupported).");
            }
            s sVar = new s((int) j10);
            this.f7167K = sVar;
            System.arraycopy(this.f7159B.f8659a, 0, sVar.f8659a, 0, 8);
            this.f7164G = 1;
        } else {
            if (this.f7166I > 2147483647L) {
                throw new t("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.f7167K = null;
            this.f7164G = 1;
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
        boolean z8;
        int i4;
        int a9;
        int i9;
        int i10 = 4;
        int i11 = 1;
        if (this.f7164G == 3) {
            if (this.f7173Q == null) {
                SparseArray<c> sparseArray = this.f7185w;
                int size = sparseArray.size();
                long j9 = Long.MAX_VALUE;
                c cVar = null;
                for (int i12 = 0; i12 < size; i12++) {
                    c valueAt = sparseArray.valueAt(i12);
                    int i13 = valueAt.f7197g;
                    l lVar = valueAt.f7192b;
                    if (i13 != lVar.f7289e) {
                        long j10 = lVar.f7291g[i13];
                        if (j10 < j9) {
                            cVar = valueAt;
                            j9 = j10;
                        }
                    }
                }
                i9 = 0;
                if (cVar == null) {
                    int c4 = (int) (this.f7168L - fVar.c());
                    if (c4 < 0) {
                        throw new t("Offset to end of mdat was negative.");
                    }
                    fVar.c(c4);
                    a();
                    return false;
                }
                int c9 = (int) (cVar.f7192b.f7291g[cVar.f7197g] - fVar.c());
                if (c9 < 0) {
                    Log.w(f7149j, "Ignoring negative offset to sample data.");
                    c9 = 0;
                }
                fVar.c(c9);
                this.f7173Q = cVar;
            } else {
                i9 = 0;
            }
            c cVar2 = this.f7173Q;
            int[] iArr = cVar2.f7192b.i;
            int i14 = cVar2.f7195e;
            int i15 = iArr[i14];
            this.f7174R = i15;
            if (i14 < cVar2.f7198h) {
                fVar.c(i15);
                c.a(this.f7173Q);
                if (!this.f7173Q.b()) {
                    this.f7173Q = null;
                }
                this.f7164G = 3;
                return true;
            }
            if (cVar2.f7193c.i == 1) {
                this.f7174R = i15 - 8;
                fVar.c(8);
            }
            int c10 = this.f7173Q.c();
            this.f7175S = c10;
            this.f7174R += c10;
            this.f7164G = 4;
            this.f7176T = i9;
        }
        c cVar3 = this.f7173Q;
        l lVar2 = cVar3.f7192b;
        j jVar = cVar3.f7193c;
        ?? r9 = cVar3.f7191a;
        int i16 = cVar3.f7195e;
        long b9 = lVar2.b(i16) * 1000;
        ac acVar = this.f7158A;
        if (acVar != null) {
            b9 = acVar.b(b9);
        }
        int i17 = jVar.f7277l;
        if (i17 == 0) {
            r17 = 1;
            while (true) {
                int i18 = this.f7175S;
                int i19 = this.f7174R;
                if (i18 >= i19) {
                    break;
                }
                this.f7175S += r9.a(fVar, i19 - i18, false);
            }
        } else {
            byte[] bArr = this.f7187y.f8659a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i20 = i17 + 1;
            int i21 = 4 - i17;
            while (this.f7175S < this.f7174R) {
                int i22 = this.f7176T;
                if (i22 == 0) {
                    fVar.b(bArr, i21, i20);
                    this.f7187y.c(0);
                    this.f7176T = this.f7187y.m() - i11;
                    this.f7186x.c(0);
                    r9.a(this.f7186x, i10);
                    r9.a(this.f7187y, i11);
                    this.f7177U = (this.f7180X.length <= 0 || !p.a(jVar.f7274h.f8822h, bArr[i10])) ? 0 : i11;
                    this.f7175S += 5;
                    this.f7174R += i21;
                } else {
                    if (this.f7177U) {
                        this.f7188z.a(i22);
                        fVar.b(this.f7188z.f8659a, 0, this.f7176T);
                        r9.a(this.f7188z, this.f7176T);
                        a9 = this.f7176T;
                        s sVar = this.f7188z;
                        int a10 = p.a(sVar.f8659a, sVar.b());
                        i4 = i11;
                        this.f7188z.c(o.i.equals(jVar.f7274h.f8822h) ? 1 : 0);
                        this.f7188z.b(a10);
                    } else {
                        i4 = i11;
                        a9 = r9.a(fVar, i22, false);
                    }
                    this.f7175S += a9;
                    this.f7176T -= a9;
                    i11 = i4;
                    i10 = 4;
                }
            }
            r17 = i11;
        }
        boolean z9 = lVar2.f7295l[i16];
        if (lVar2.f7296m) {
            ?? r12 = (z9 ? 1 : 0) | 0;
            k kVar = lVar2.f7298o;
            if (kVar == null) {
                kVar = jVar.a(lVar2.f7285a.f7133a);
            }
            aVar = kVar.f7282c;
            z8 = r12;
        } else {
            aVar = null;
            z8 = z9;
        }
        r9.a(b9, z8, this.f7174R, 0, aVar);
        while (!this.f7162E.isEmpty()) {
            b removeFirst = this.f7162E.removeFirst();
            this.f7169M -= removeFirst.f7190b;
            long j11 = removeFirst.f7189a + b9;
            ac acVar2 = this.f7158A;
            if (acVar2 != null) {
                j11 = acVar2.b(j11);
            }
            long j12 = j11;
            for (com.anythink.basead.exoplayer.e.m mVar : this.f7179W) {
                mVar.a(j12, 1, removeFirst.f7190b, this.f7169M, null);
            }
        }
        if (!this.f7173Q.b()) {
            this.f7173Q = null;
        }
        this.f7164G = 3;
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
        int i4 = ((int) this.f7166I) - this.J;
        s sVar = this.f7167K;
        if (sVar != null) {
            fVar.b(sVar.f8659a, 8, i4);
            a.b bVar = new a.b(this.f7165H, this.f7167K);
            long c4 = fVar.c();
            if (this.f7161D.isEmpty()) {
                int i9 = bVar.aU;
                if (i9 == com.anythink.basead.exoplayer.e.a.a.f7057F) {
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
                    long j9 = n10 + c4;
                    long a10 = af.a(n9, 1000000L, h9);
                    sVar2.d(2);
                    int e6 = sVar2.e();
                    int[] iArr = new int[e6];
                    long[] jArr = new long[e6];
                    long[] jArr2 = new long[e6];
                    long[] jArr3 = new long[e6];
                    long j10 = n9;
                    long j11 = a10;
                    int i10 = 0;
                    while (i10 < e6) {
                        int i11 = sVar2.i();
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            throw new t("Unhandled indirect reference");
                        }
                        long h10 = sVar2.h();
                        iArr[i10] = i11 & Integer.MAX_VALUE;
                        jArr[i10] = j9;
                        jArr3[i10] = j11;
                        long j12 = j10 + h10;
                        long[] jArr4 = jArr;
                        long[] jArr5 = jArr2;
                        int i12 = i10;
                        j11 = af.a(j12, 1000000L, h9);
                        jArr5[i12] = j11 - jArr3[i12];
                        sVar2.d(4);
                        j9 += iArr[i12];
                        int i13 = i12 + 1;
                        jArr2 = jArr5;
                        j10 = j12;
                        i10 = i13;
                        jArr = jArr4;
                    }
                    Pair create = Pair.create(Long.valueOf(a10), new com.anythink.basead.exoplayer.e.a(iArr, jArr, jArr2, jArr3));
                    this.f7172P = ((Long) create.first).longValue();
                    this.f7178V.a((com.anythink.basead.exoplayer.e.k) create.second);
                    this.Y = true;
                } else if (i9 == com.anythink.basead.exoplayer.e.a.a.aL) {
                    s sVar3 = bVar.aV;
                    com.anythink.basead.exoplayer.e.m[] mVarArr = this.f7179W;
                    if (mVarArr != null && mVarArr.length != 0) {
                        sVar3.c(12);
                        int a11 = sVar3.a();
                        sVar3.p();
                        sVar3.p();
                        long a12 = af.a(sVar3.h(), 1000000L, sVar3.h());
                        for (com.anythink.basead.exoplayer.e.m mVar : this.f7179W) {
                            sVar3.c(12);
                            mVar.a(sVar3, a11);
                        }
                        long j13 = this.f7172P;
                        if (j13 != com.anythink.basead.exoplayer.b.f6539b) {
                            long j14 = j13 + a12;
                            ac acVar = this.f7158A;
                            if (acVar != null) {
                                j14 = acVar.b(j14);
                            }
                            long j15 = j14;
                            for (com.anythink.basead.exoplayer.e.m mVar2 : this.f7179W) {
                                mVar2.a(j15, 1, a11, 0, null);
                            }
                        } else {
                            this.f7162E.addLast(new b(a12, a11));
                            this.f7169M += a11;
                        }
                    }
                }
            } else {
                this.f7161D.peek().a(bVar);
            }
        } else {
            fVar.c(i4);
        }
        a(fVar.c());
    }

    @Override // com.anythink.basead.exoplayer.e.e
    public final void a(com.anythink.basead.exoplayer.e.g gVar) {
        this.f7178V = gVar;
        j jVar = this.f7182t;
        if (jVar != null) {
            c cVar = new c(gVar.a(0, jVar.f7270d));
            cVar.a(this.f7182t, new com.anythink.basead.exoplayer.e.a.c(0, 0, 0, 0));
            this.f7185w.put(0, cVar);
            b();
            this.f7178V.c_();
        }
    }

    private e(int i4, ac acVar) {
        this(i4, acVar, null, null);
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final com.anythink.basead.exoplayer.e.m f7191a;

        /* renamed from: c, reason: collision with root package name */
        public j f7193c;

        /* renamed from: d, reason: collision with root package name */
        public com.anythink.basead.exoplayer.e.a.c f7194d;

        /* renamed from: e, reason: collision with root package name */
        public int f7195e;

        /* renamed from: f, reason: collision with root package name */
        public int f7196f;

        /* renamed from: g, reason: collision with root package name */
        public int f7197g;

        /* renamed from: h, reason: collision with root package name */
        public int f7198h;

        /* renamed from: b, reason: collision with root package name */
        public final l f7192b = new l();
        private final s i = new s(1);

        /* renamed from: j, reason: collision with root package name */
        private final s f7199j = new s();

        public c(com.anythink.basead.exoplayer.e.m mVar) {
            this.f7191a = mVar;
        }

        private void d() {
            l lVar = this.f7192b;
            if (lVar.f7296m) {
                s sVar = lVar.f7300q;
                int i = e().f7283d;
                if (i != 0) {
                    sVar.d(i);
                }
                if (this.f7192b.f7297n[this.f7195e]) {
                    sVar.d(sVar.e() * 6);
                }
            }
        }

        private k e() {
            l lVar = this.f7192b;
            int i = lVar.f7285a.f7133a;
            k kVar = lVar.f7298o;
            return kVar != null ? kVar : this.f7193c.a(i);
        }

        public final void a(j jVar, com.anythink.basead.exoplayer.e.a.c cVar) {
            this.f7193c = (j) C0544a.a(jVar);
            this.f7194d = (com.anythink.basead.exoplayer.e.a.c) C0544a.a(cVar);
            this.f7191a.a(jVar.f7274h);
            a();
        }

        public final boolean b() {
            this.f7195e++;
            int i = this.f7196f + 1;
            this.f7196f = i;
            int[] iArr = this.f7192b.f7292h;
            int i4 = this.f7197g;
            if (i != iArr[i4]) {
                return true;
            }
            this.f7197g = i4 + 1;
            this.f7196f = 0;
            return false;
        }

        public final int c() {
            s sVar;
            if (!this.f7192b.f7296m) {
                return 0;
            }
            k e6 = e();
            int i = e6.f7283d;
            if (i != 0) {
                sVar = this.f7192b.f7300q;
            } else {
                byte[] bArr = e6.f7284e;
                this.f7199j.a(bArr, bArr.length);
                s sVar2 = this.f7199j;
                i = bArr.length;
                sVar = sVar2;
            }
            boolean z8 = this.f7192b.f7297n[this.f7195e];
            s sVar3 = this.i;
            sVar3.f8659a[0] = (byte) ((z8 ? 128 : 0) | i);
            sVar3.c(0);
            this.f7191a.a(this.i, 1);
            this.f7191a.a(sVar, i);
            if (!z8) {
                return i + 1;
            }
            s sVar4 = this.f7192b.f7300q;
            int e9 = sVar4.e();
            sVar4.d(-2);
            int i4 = (e9 * 6) + 2;
            this.f7191a.a(sVar4, i4);
            return i + 1 + i4;
        }

        public final void a(com.anythink.basead.exoplayer.d.e eVar) {
            k a9 = this.f7193c.a(this.f7192b.f7285a.f7133a);
            this.f7191a.a(this.f7193c.f7274h.a(eVar.a(a9 != null ? a9.f7281b : null)));
        }

        public final void a() {
            this.f7192b.a();
            this.f7195e = 0;
            this.f7197g = 0;
            this.f7196f = 0;
            this.f7198h = 0;
        }

        public final void a(long j9) {
            long a9 = com.anythink.basead.exoplayer.b.a(j9);
            int i = this.f7195e;
            while (true) {
                l lVar = this.f7192b;
                if (i >= lVar.f7290f || lVar.b(i) >= a9) {
                    return;
                }
                if (this.f7192b.f7295l[i]) {
                    this.f7198h = i;
                }
                i++;
            }
        }

        public static /* synthetic */ void a(c cVar) {
            l lVar = cVar.f7192b;
            if (lVar.f7296m) {
                s sVar = lVar.f7300q;
                int i = cVar.e().f7283d;
                if (i != 0) {
                    sVar.d(i);
                }
                if (cVar.f7192b.f7297n[cVar.f7195e]) {
                    sVar.d(sVar.e() * 6);
                }
            }
        }
    }

    private e(int i4, ac acVar, j jVar, com.anythink.basead.exoplayer.d.e eVar) {
        this(i4, acVar, jVar, eVar, Collections.EMPTY_LIST);
    }

    private void d(com.anythink.basead.exoplayer.e.f fVar) {
        int size = this.f7185w.size();
        c cVar = null;
        long j9 = Long.MAX_VALUE;
        for (int i4 = 0; i4 < size; i4++) {
            l lVar = this.f7185w.valueAt(i4).f7192b;
            if (lVar.f7301r) {
                long j10 = lVar.f7288d;
                if (j10 < j9) {
                    cVar = this.f7185w.valueAt(i4);
                    j9 = j10;
                }
            }
        }
        if (cVar == null) {
            this.f7164G = 3;
            return;
        }
        int c4 = (int) (j9 - fVar.c());
        if (c4 >= 0) {
            fVar.c(c4);
            l lVar2 = cVar.f7192b;
            fVar.b(lVar2.f7300q.f8659a, 0, lVar2.f7299p);
            lVar2.f7300q.c(0);
            lVar2.f7301r = false;
            return;
        }
        throw new t("Offset to encryption data was negative.");
    }

    private e(int i4, ac acVar, j jVar, com.anythink.basead.exoplayer.d.e eVar, List<com.anythink.basead.exoplayer.m> list) {
        this(i4, acVar, jVar, eVar, list, null);
    }

    private e(int i4, ac acVar, j jVar, com.anythink.basead.exoplayer.d.e eVar, List<com.anythink.basead.exoplayer.m> list, com.anythink.basead.exoplayer.e.m mVar) {
        this.f7181s = i4 | (jVar != null ? 8 : 0);
        this.f7158A = acVar;
        this.f7182t = jVar;
        this.f7184v = eVar;
        this.f7183u = Collections.unmodifiableList(list);
        this.f7163F = mVar;
        this.f7159B = new s(16);
        this.f7186x = new s(p.f8629a);
        this.f7187y = new s(5);
        this.f7188z = new s();
        this.f7160C = new byte[16];
        this.f7161D = new ArrayDeque<>();
        this.f7162E = new ArrayDeque<>();
        this.f7185w = new SparseArray<>();
        this.f7171O = com.anythink.basead.exoplayer.b.f6539b;
        this.f7170N = com.anythink.basead.exoplayer.b.f6539b;
        this.f7172P = com.anythink.basead.exoplayer.b.f6539b;
        a();
    }

    @Override // com.anythink.basead.exoplayer.e.e
    public final void a(long j9, long j10) {
        int size = this.f7185w.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f7185w.valueAt(i4).a();
        }
        this.f7162E.clear();
        this.f7169M = 0;
        this.f7170N = j10;
        this.f7161D.clear();
        a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:269:0x0084, code lost:
    
        r2 = r28.f7173Q;
        r3 = r2.f7192b.i;
        r7 = r2.f7195e;
        r3 = r3[r7];
        r28.f7174R = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0092, code lost:
    
        if (r7 >= r2.f7198h) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0094, code lost:
    
        r29.c(r3);
        com.anythink.basead.exoplayer.e.a.e.c.a(r28.f7173Q);
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x00a2, code lost:
    
        if (r28.f7173Q.b() != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x00a4, code lost:
    
        r28.f7173Q = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x00a6, code lost:
    
        r28.f7164G = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x00a8, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x00b0, code lost:
    
        if (r2.f7193c.i != 1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x00b2, code lost:
    
        r28.f7174R = r3 - 8;
        r29.c(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x00b8, code lost:
    
        r2 = r28.f7173Q.c();
        r28.f7175S = r2;
        r28.f7174R += r2;
        r28.f7164G = 4;
        r28.f7176T = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x00ce, code lost:
    
        r2 = r28.f7173Q;
        r3 = r2.f7192b;
        r5 = r2.f7193c;
        r7 = r2.f7191a;
        r2 = r2.f7195e;
        r8 = r3.b(r2) * 1000;
        r10 = r28.f7158A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x00e1, code lost:
    
        if (r10 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x00e3, code lost:
    
        r8 = r10.b(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x00e7, code lost:
    
        r19 = r8;
        r8 = r5.f7277l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x00eb, code lost:
    
        if (r8 == 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x00ed, code lost:
    
        r9 = r28.f7187y.f8659a;
        r9[0] = 0;
        r9[1] = 0;
        r9[r30] = 0;
        r10 = r8 + 1;
        r8 = 4 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0103, code lost:
    
        if (r28.f7175S >= r28.f7174R) goto L336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0105, code lost:
    
        r12 = r28.f7176T;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0107, code lost:
    
        if (r12 != 0) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x014f, code lost:
    
        if (r28.f7177U == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0151, code lost:
    
        r28.f7188z.a(r12);
        r29.b(r28.f7188z.f8659a, 0, r28.f7176T);
        r7.a(r28.f7188z, r28.f7176T);
        r12 = r28.f7176T;
        r13 = r28.f7188z;
        r13 = com.anythink.basead.exoplayer.k.p.a(r13.f8659a, r13.b());
        r28.f7188z.c(com.anythink.basead.exoplayer.k.o.i.equals(r5.f7274h.f8822h) ? 1 : 0);
        r28.f7188z.b(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x018f, code lost:
    
        r28.f7175S += r12;
        r28.f7176T -= r12;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x018a, code lost:
    
        r12 = r7.a(r29, r12, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0109, code lost:
    
        r29.b(r9, r8, r10);
        r28.f7187y.c(0);
        r28.f7176T = r28.f7187y.m() - r6;
        r28.f7186x.c(0);
        r7.a(r28.f7186x, 4);
        r7.a(r28.f7187y, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x012e, code lost:
    
        if (r28.f7180X.length <= 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x013a, code lost:
    
        if (com.anythink.basead.exoplayer.k.p.a(r5.f7274h.f8822h, r9[4]) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x013c, code lost:
    
        r12 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x013f, code lost:
    
        r28.f7177U = r12;
        r28.f7175S += 5;
        r28.f7174R += r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x013e, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x01ae, code lost:
    
        r1 = r3.f7295l[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x01b4, code lost:
    
        if (r3.f7296m == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x01b6, code lost:
    
        r1 = (r1 ? 1 : 0) | 0;
        r2 = r3.f7298o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x01bb, code lost:
    
        if (r2 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x01be, code lost:
    
        r2 = r5.a(r3.f7285a.f7133a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x01c6, code lost:
    
        r24 = r2.f7282c;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x01d0, code lost:
    
        r7.a(r19, r1, r28.f7174R, 0, r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x01e1, code lost:
    
        if (r28.f7162E.isEmpty() != false) goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x01e3, code lost:
    
        r1 = r28.f7162E.removeFirst();
        r28.f7169M -= r1.f7190b;
        r2 = r19 + r1.f7189a;
        r5 = r28.f7158A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x01f8, code lost:
    
        if (r5 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x01fa, code lost:
    
        r2 = r5.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x01fe, code lost:
    
        r22 = r2;
        r2 = r28.f7179W;
        r3 = r2.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0204, code lost:
    
        if (r5 >= r3) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0206, code lost:
    
        r2[r5].a(r22, 1, r1.f7190b, r28.f7169M, null);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0220, code lost:
    
        if (r28.f7173Q.b() != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0222, code lost:
    
        r28.f7173Q = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0224, code lost:
    
        r28.f7164G = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x01cd, code lost:
    
        r24 = null;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x019c, code lost:
    
        r6 = r28.f7175S;
        r8 = r28.f7174R;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x01a0, code lost:
    
        if (r6 >= r8) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x01a2, code lost:
    
        r28.f7175S += r7.a(r29, r8 - r6, false);
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
        char c4;
        long n9;
        long n10;
        while (true) {
            int i4 = this.f7164G;
            char c9 = 2;
            c cVar = null;
            int i9 = 1;
            if (i4 == 0) {
                if (this.J == 0) {
                    if (!fVar.a(this.f7159B.f8659a, 0, 8, true)) {
                        return -1;
                    }
                    this.J = 8;
                    this.f7159B.c(0);
                    this.f7166I = this.f7159B.h();
                    this.f7165H = this.f7159B.i();
                }
                long j9 = this.f7166I;
                if (j9 == 1) {
                    fVar.b(this.f7159B.f8659a, 8, 8);
                    this.J += 8;
                    this.f7166I = this.f7159B.n();
                } else if (j9 == 0) {
                    long d2 = fVar.d();
                    if (d2 == -1 && !this.f7161D.isEmpty()) {
                        d2 = this.f7161D.peek().aV;
                    }
                    if (d2 != -1) {
                        this.f7166I = (d2 - fVar.c()) + this.J;
                    }
                }
                if (this.f7166I >= this.J) {
                    long c10 = fVar.c() - this.J;
                    if (this.f7165H == com.anythink.basead.exoplayer.e.a.a.f7066P) {
                        int size = this.f7185w.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            l lVar = this.f7185w.valueAt(i10).f7192b;
                            lVar.f7286b = c10;
                            lVar.f7288d = c10;
                            lVar.f7287c = c10;
                        }
                    }
                    int i11 = this.f7165H;
                    if (i11 == com.anythink.basead.exoplayer.e.a.a.f7087m) {
                        this.f7173Q = null;
                        this.f7168L = this.f7166I + c10;
                        if (!this.Y) {
                            this.f7178V.a(new k.b(this.f7171O, c10));
                            this.Y = true;
                        }
                        this.f7164G = 2;
                    } else if (i11 != com.anythink.basead.exoplayer.e.a.a.f7058G && i11 != com.anythink.basead.exoplayer.e.a.a.f7060I && i11 != com.anythink.basead.exoplayer.e.a.a.J && i11 != com.anythink.basead.exoplayer.e.a.a.f7061K && i11 != com.anythink.basead.exoplayer.e.a.a.f7062L && i11 != com.anythink.basead.exoplayer.e.a.a.f7066P && i11 != com.anythink.basead.exoplayer.e.a.a.f7067Q && i11 != com.anythink.basead.exoplayer.e.a.a.f7068R && i11 != com.anythink.basead.exoplayer.e.a.a.f7071U) {
                        if (i11 == com.anythink.basead.exoplayer.e.a.a.f7074X || i11 == com.anythink.basead.exoplayer.e.a.a.f7073W || i11 == com.anythink.basead.exoplayer.e.a.a.f7059H || i11 == com.anythink.basead.exoplayer.e.a.a.f7057F || i11 == com.anythink.basead.exoplayer.e.a.a.Y || i11 == com.anythink.basead.exoplayer.e.a.a.f7053B || i11 == com.anythink.basead.exoplayer.e.a.a.f7054C || i11 == com.anythink.basead.exoplayer.e.a.a.f7070T || i11 == com.anythink.basead.exoplayer.e.a.a.f7055D || i11 == com.anythink.basead.exoplayer.e.a.a.f7056E || i11 == com.anythink.basead.exoplayer.e.a.a.f7075Z || i11 == com.anythink.basead.exoplayer.e.a.a.ah || i11 == com.anythink.basead.exoplayer.e.a.a.ai || i11 == com.anythink.basead.exoplayer.e.a.a.am || i11 == com.anythink.basead.exoplayer.e.a.a.al || i11 == com.anythink.basead.exoplayer.e.a.a.aj || i11 == com.anythink.basead.exoplayer.e.a.a.ak || i11 == com.anythink.basead.exoplayer.e.a.a.f7072V || i11 == com.anythink.basead.exoplayer.e.a.a.f7069S || i11 == com.anythink.basead.exoplayer.e.a.a.aL) {
                            if (this.J == 8) {
                                long j10 = this.f7166I;
                                if (j10 <= 2147483647L) {
                                    s sVar = new s((int) j10);
                                    this.f7167K = sVar;
                                    System.arraycopy(this.f7159B.f8659a, 0, sVar.f8659a, 0, 8);
                                    this.f7164G = 1;
                                } else {
                                    throw new t("Leaf atom with length > 2147483647 (unsupported).");
                                }
                            } else {
                                throw new t("Leaf atom defines extended atom size (unsupported).");
                            }
                        } else if (this.f7166I <= 2147483647L) {
                            this.f7167K = null;
                            this.f7164G = 1;
                        } else {
                            throw new t("Skipping atom with length > 2147483647 (unsupported).");
                        }
                    } else {
                        long c11 = (fVar.c() + this.f7166I) - 8;
                        this.f7161D.push(new a.C0020a(this.f7165H, c11));
                        if (this.f7166I == this.J) {
                            a(c11);
                        } else {
                            a();
                        }
                    }
                } else {
                    throw new t("Atom size less than header length (unsupported).");
                }
            } else if (i4 != 1) {
                long j11 = Long.MAX_VALUE;
                if (i4 != 2) {
                    if (i4 != 3) {
                        c4 = 2;
                        break;
                    }
                    if (this.f7173Q != null) {
                        c4 = 2;
                        break;
                    }
                    SparseArray<c> sparseArray = this.f7185w;
                    int size2 = sparseArray.size();
                    c cVar2 = null;
                    int i12 = 0;
                    while (i12 < size2) {
                        c valueAt = sparseArray.valueAt(i12);
                        char c12 = c9;
                        int i13 = valueAt.f7197g;
                        l lVar2 = valueAt.f7192b;
                        if (i13 != lVar2.f7289e) {
                            long j12 = lVar2.f7291g[i13];
                            if (j12 < j11) {
                                cVar2 = valueAt;
                                j11 = j12;
                            }
                        }
                        i12++;
                        c9 = c12;
                    }
                    c4 = c9;
                    if (cVar2 == null) {
                        int c13 = (int) (this.f7168L - fVar.c());
                        if (c13 >= 0) {
                            fVar.c(c13);
                            a();
                        } else {
                            throw new t("Offset to end of mdat was negative.");
                        }
                    } else {
                        int c14 = (int) (cVar2.f7192b.f7291g[cVar2.f7197g] - fVar.c());
                        if (c14 < 0) {
                            Log.w(f7149j, "Ignoring negative offset to sample data.");
                            c14 = 0;
                        }
                        fVar.c(c14);
                        this.f7173Q = cVar2;
                    }
                } else {
                    int size3 = this.f7185w.size();
                    for (int i14 = 0; i14 < size3; i14++) {
                        l lVar3 = this.f7185w.valueAt(i14).f7192b;
                        if (lVar3.f7301r) {
                            long j13 = lVar3.f7288d;
                            if (j13 < j11) {
                                cVar = this.f7185w.valueAt(i14);
                                j11 = j13;
                            }
                        }
                    }
                    if (cVar == null) {
                        this.f7164G = 3;
                    } else {
                        int c15 = (int) (j11 - fVar.c());
                        if (c15 >= 0) {
                            fVar.c(c15);
                            l lVar4 = cVar.f7192b;
                            fVar.b(lVar4.f7300q.f8659a, 0, lVar4.f7299p);
                            lVar4.f7300q.c(0);
                            lVar4.f7301r = false;
                        } else {
                            throw new t("Offset to encryption data was negative.");
                        }
                    }
                }
            } else {
                int i15 = ((int) this.f7166I) - this.J;
                s sVar2 = this.f7167K;
                if (sVar2 != null) {
                    fVar.b(sVar2.f8659a, 8, i15);
                    a.b bVar = new a.b(this.f7165H, this.f7167K);
                    long c16 = fVar.c();
                    if (!this.f7161D.isEmpty()) {
                        this.f7161D.peek().a(bVar);
                    } else {
                        int i16 = bVar.aU;
                        if (i16 == com.anythink.basead.exoplayer.e.a.a.f7057F) {
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
                            long j14 = n10 + c16;
                            long j15 = n9;
                            long a10 = af.a(j15, 1000000L, h9);
                            sVar3.d(2);
                            int e6 = sVar3.e();
                            int[] iArr = new int[e6];
                            long[] jArr = new long[e6];
                            long[] jArr2 = new long[e6];
                            long[] jArr3 = new long[e6];
                            long j16 = a10;
                            int i17 = 0;
                            while (i17 < e6) {
                                int i18 = sVar3.i();
                                if ((i18 & Integer.MIN_VALUE) == 0) {
                                    long h10 = sVar3.h();
                                    iArr[i17] = i18 & Integer.MAX_VALUE;
                                    jArr[i17] = j14;
                                    jArr3[i17] = j16;
                                    long j17 = j15 + h10;
                                    int i19 = i17;
                                    long[] jArr4 = jArr3;
                                    long a11 = af.a(j17, 1000000L, h9);
                                    jArr2[i19] = a11 - jArr4[i19];
                                    int i20 = e6;
                                    sVar3.d(4);
                                    long j18 = j14 + iArr[i19];
                                    int i21 = i19 + 1;
                                    j16 = a11;
                                    jArr3 = jArr4;
                                    j14 = j18;
                                    i17 = i21;
                                    j15 = j17;
                                    e6 = i20;
                                } else {
                                    throw new t("Unhandled indirect reference");
                                }
                            }
                            Pair create = Pair.create(Long.valueOf(a10), new com.anythink.basead.exoplayer.e.a(iArr, jArr, jArr2, jArr3));
                            this.f7172P = ((Long) create.first).longValue();
                            this.f7178V.a((com.anythink.basead.exoplayer.e.k) create.second);
                            this.Y = true;
                        } else if (i16 == com.anythink.basead.exoplayer.e.a.a.aL) {
                            s sVar4 = bVar.aV;
                            com.anythink.basead.exoplayer.e.m[] mVarArr = this.f7179W;
                            if (mVarArr != null && mVarArr.length != 0) {
                                sVar4.c(12);
                                int a12 = sVar4.a();
                                sVar4.p();
                                sVar4.p();
                                long a13 = af.a(sVar4.h(), 1000000L, sVar4.h());
                                for (com.anythink.basead.exoplayer.e.m mVar : this.f7179W) {
                                    sVar4.c(12);
                                    mVar.a(sVar4, a12);
                                }
                                long j19 = this.f7172P;
                                if (j19 != com.anythink.basead.exoplayer.b.f6539b) {
                                    long j20 = j19 + a13;
                                    ac acVar = this.f7158A;
                                    if (acVar != null) {
                                        j20 = acVar.b(j20);
                                    }
                                    long j21 = j20;
                                    for (com.anythink.basead.exoplayer.e.m mVar2 : this.f7179W) {
                                        mVar2.a(j21, 1, a12, 0, null);
                                    }
                                } else {
                                    this.f7162E.addLast(new b(a13, a12));
                                    this.f7169M += a12;
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

    private void b(a.C0020a c0020a) {
        int i4 = 0;
        C0544a.b(this.f7182t == null, "Unexpected moov box.");
        com.anythink.basead.exoplayer.d.e eVar = this.f7184v;
        if (eVar == null) {
            eVar = a(c0020a.aW);
        }
        com.anythink.basead.exoplayer.d.e eVar2 = eVar;
        a.C0020a e6 = c0020a.e(com.anythink.basead.exoplayer.e.a.a.f7068R);
        SparseArray sparseArray = new SparseArray();
        int size = e6.aW.size();
        long j9 = -9223372036854775807L;
        for (int i9 = 0; i9 < size; i9++) {
            a.b bVar = e6.aW.get(i9);
            int i10 = bVar.aU;
            if (i10 == com.anythink.basead.exoplayer.e.a.a.f7055D) {
                Pair<Integer, com.anythink.basead.exoplayer.e.a.c> b9 = b(bVar.aV);
                sparseArray.put(((Integer) b9.first).intValue(), (com.anythink.basead.exoplayer.e.a.c) b9.second);
            } else if (i10 == com.anythink.basead.exoplayer.e.a.a.f7069S) {
                j9 = c(bVar.aV);
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        int size2 = c0020a.aX.size();
        for (int i11 = 0; i11 < size2; i11++) {
            a.C0020a c0020a2 = c0020a.aX.get(i11);
            if (c0020a2.aU == com.anythink.basead.exoplayer.e.a.a.f7060I) {
                j a9 = com.anythink.basead.exoplayer.e.a.b.a(c0020a2, c0020a.d(com.anythink.basead.exoplayer.e.a.a.f7059H), j9, eVar2, (this.f7181s & 16) != 0, false);
                if (a9 != null) {
                    sparseArray2.put(a9.f7269c, a9);
                }
            }
        }
        int size3 = sparseArray2.size();
        if (this.f7185w.size() == 0) {
            while (i4 < size3) {
                j jVar = (j) sparseArray2.valueAt(i4);
                c cVar = new c(this.f7178V.a(i4, jVar.f7270d));
                cVar.a(jVar, a((SparseArray<com.anythink.basead.exoplayer.e.a.c>) sparseArray, jVar.f7269c));
                this.f7185w.put(jVar.f7269c, cVar);
                this.f7171O = Math.max(this.f7171O, jVar.f7273g);
                i4++;
            }
            b();
            this.f7178V.c_();
            return;
        }
        C0544a.b(this.f7185w.size() == size3);
        while (i4 < size3) {
            j jVar2 = (j) sparseArray2.valueAt(i4);
            this.f7185w.get(jVar2.f7269c).a(jVar2, a((SparseArray<com.anythink.basead.exoplayer.e.a.c>) sparseArray, jVar2.f7269c));
            i4++;
        }
    }

    private void c(a.C0020a c0020a) {
        a(c0020a, this.f7185w, this.f7181s, this.f7160C);
        com.anythink.basead.exoplayer.d.e a9 = this.f7184v != null ? null : a(c0020a.aW);
        if (a9 != null) {
            int size = this.f7185w.size();
            for (int i4 = 0; i4 < size; i4++) {
                this.f7185w.valueAt(i4).a(a9);
            }
        }
        if (this.f7170N != com.anythink.basead.exoplayer.b.f6539b) {
            int size2 = this.f7185w.size();
            for (int i9 = 0; i9 < size2; i9++) {
                this.f7185w.valueAt(i9).a(this.f7170N);
            }
            this.f7170N = com.anythink.basead.exoplayer.b.f6539b;
        }
    }

    private static long c(s sVar) {
        sVar.c(8);
        return com.anythink.basead.exoplayer.e.a.a.a(sVar.i()) == 0 ? sVar.h() : sVar.n();
    }

    private void b() {
        int i4;
        if (this.f7179W == null) {
            com.anythink.basead.exoplayer.e.m[] mVarArr = new com.anythink.basead.exoplayer.e.m[2];
            this.f7179W = mVarArr;
            com.anythink.basead.exoplayer.e.m mVar = this.f7163F;
            if (mVar != null) {
                mVarArr[0] = mVar;
                i4 = 1;
            } else {
                i4 = 0;
            }
            if ((this.f7181s & 4) != 0) {
                mVarArr[i4] = this.f7178V.a(this.f7185w.size(), 4);
                i4++;
            }
            com.anythink.basead.exoplayer.e.m[] mVarArr2 = (com.anythink.basead.exoplayer.e.m[]) Arrays.copyOf(this.f7179W, i4);
            this.f7179W = mVarArr2;
            for (com.anythink.basead.exoplayer.e.m mVar2 : mVarArr2) {
                mVar2.a(f7152m);
            }
        }
        if (this.f7180X == null) {
            this.f7180X = new com.anythink.basead.exoplayer.e.m[this.f7183u.size()];
            for (int i9 = 0; i9 < this.f7180X.length; i9++) {
                com.anythink.basead.exoplayer.e.m a9 = this.f7178V.a(this.f7185w.size() + 1 + i9, 3);
                a9.a(this.f7183u.get(i9));
                this.f7180X[i9] = a9;
            }
        }
    }

    private static Pair<Integer, com.anythink.basead.exoplayer.e.a.c> b(s sVar) {
        sVar.c(12);
        return Pair.create(Integer.valueOf(sVar.i()), new com.anythink.basead.exoplayer.e.a.c(sVar.m() - 1, sVar.m(), sVar.m(), sVar.i()));
    }

    private static void b(a.C0020a c0020a, SparseArray<c> sparseArray, int i4, byte[] bArr) {
        c a9 = a(c0020a.d(com.anythink.basead.exoplayer.e.a.a.f7054C).aV, sparseArray);
        if (a9 == null) {
            return;
        }
        l lVar = a9.f7192b;
        long j9 = lVar.f7302s;
        a9.a();
        int i9 = com.anythink.basead.exoplayer.e.a.a.f7053B;
        if (c0020a.d(i9) != null && (i4 & 2) == 0) {
            j9 = d(c0020a.d(i9).aV);
        }
        a(c0020a, a9, j9, i4);
        k a10 = a9.f7193c.a(lVar.f7285a.f7133a);
        a.b d2 = c0020a.d(com.anythink.basead.exoplayer.e.a.a.ah);
        if (d2 != null) {
            a(a10, d2.aV, lVar);
        }
        a.b d3 = c0020a.d(com.anythink.basead.exoplayer.e.a.a.ai);
        if (d3 != null) {
            a(d3.aV, lVar);
        }
        a.b d9 = c0020a.d(com.anythink.basead.exoplayer.e.a.a.am);
        if (d9 != null) {
            a(d9.aV, 0, lVar);
        }
        a.b d10 = c0020a.d(com.anythink.basead.exoplayer.e.a.a.aj);
        a.b d11 = c0020a.d(com.anythink.basead.exoplayer.e.a.a.ak);
        if (d10 != null && d11 != null) {
            a(d10.aV, d11.aV, a10 != null ? a10.f7281b : null, lVar);
        }
        int size = c0020a.aW.size();
        for (int i10 = 0; i10 < size; i10++) {
            a.b bVar = c0020a.aW.get(i10);
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

    private void b(long j9) {
        while (!this.f7162E.isEmpty()) {
            b removeFirst = this.f7162E.removeFirst();
            this.f7169M -= removeFirst.f7190b;
            long j10 = removeFirst.f7189a + j9;
            ac acVar = this.f7158A;
            if (acVar != null) {
                j10 = acVar.b(j10);
            }
            long j11 = j10;
            for (com.anythink.basead.exoplayer.e.m mVar : this.f7179W) {
                mVar.a(j11, 1, removeFirst.f7190b, this.f7169M, null);
            }
        }
    }

    private static boolean b(int i4) {
        return i4 == com.anythink.basead.exoplayer.e.a.a.f7058G || i4 == com.anythink.basead.exoplayer.e.a.a.f7060I || i4 == com.anythink.basead.exoplayer.e.a.a.J || i4 == com.anythink.basead.exoplayer.e.a.a.f7061K || i4 == com.anythink.basead.exoplayer.e.a.a.f7062L || i4 == com.anythink.basead.exoplayer.e.a.a.f7066P || i4 == com.anythink.basead.exoplayer.e.a.a.f7067Q || i4 == com.anythink.basead.exoplayer.e.a.a.f7068R || i4 == com.anythink.basead.exoplayer.e.a.a.f7071U;
    }

    private void a() {
        this.f7164G = 0;
        this.J = 0;
    }

    private void a(long j9) {
        while (!this.f7161D.isEmpty() && this.f7161D.peek().aV == j9) {
            a(this.f7161D.pop());
        }
        a();
    }

    private void a(a.b bVar, long j9) {
        long n9;
        long n10;
        if (!this.f7161D.isEmpty()) {
            this.f7161D.peek().a(bVar);
            return;
        }
        int i4 = bVar.aU;
        if (i4 == com.anythink.basead.exoplayer.e.a.a.f7057F) {
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
            long j10 = n10 + j9;
            long a10 = af.a(n9, 1000000L, h9);
            sVar.d(2);
            int e6 = sVar.e();
            int[] iArr = new int[e6];
            long[] jArr = new long[e6];
            long[] jArr2 = new long[e6];
            long[] jArr3 = new long[e6];
            long j11 = j10;
            long j12 = a10;
            int i9 = 0;
            while (i9 < e6) {
                int i10 = sVar.i();
                if ((i10 & Integer.MIN_VALUE) == 0) {
                    long h10 = sVar.h();
                    iArr[i9] = i10 & Integer.MAX_VALUE;
                    jArr[i9] = j11;
                    jArr3[i9] = j12;
                    n9 += h10;
                    long[] jArr4 = jArr2;
                    j12 = af.a(n9, 1000000L, h9);
                    jArr4[i9] = j12 - jArr3[i9];
                    sVar.d(4);
                    j11 += iArr[i9];
                    i9++;
                    jArr2 = jArr4;
                    jArr = jArr;
                } else {
                    throw new t("Unhandled indirect reference");
                }
            }
            Pair create = Pair.create(Long.valueOf(a10), new com.anythink.basead.exoplayer.e.a(iArr, jArr, jArr2, jArr3));
            this.f7172P = ((Long) create.first).longValue();
            this.f7178V.a((com.anythink.basead.exoplayer.e.k) create.second);
            this.Y = true;
            return;
        }
        if (i4 == com.anythink.basead.exoplayer.e.a.a.aL) {
            s sVar2 = bVar.aV;
            com.anythink.basead.exoplayer.e.m[] mVarArr = this.f7179W;
            if (mVarArr == null || mVarArr.length == 0) {
                return;
            }
            sVar2.c(12);
            int a11 = sVar2.a();
            sVar2.p();
            sVar2.p();
            long a12 = af.a(sVar2.h(), 1000000L, sVar2.h());
            for (com.anythink.basead.exoplayer.e.m mVar : this.f7179W) {
                sVar2.c(12);
                mVar.a(sVar2, a11);
            }
            long j13 = this.f7172P;
            if (j13 != com.anythink.basead.exoplayer.b.f6539b) {
                long j14 = j13 + a12;
                ac acVar = this.f7158A;
                if (acVar != null) {
                    j14 = acVar.b(j14);
                }
                long j15 = j14;
                for (com.anythink.basead.exoplayer.e.m mVar2 : this.f7179W) {
                    mVar2.a(j15, 1, a11, 0, null);
                }
                return;
            }
            this.f7162E.addLast(new b(a12, a11));
            this.f7169M += a11;
        }
    }

    private void a(a.C0020a c0020a) {
        int i4 = c0020a.aU;
        if (i4 == com.anythink.basead.exoplayer.e.a.a.f7058G) {
            b(c0020a);
        } else if (i4 == com.anythink.basead.exoplayer.e.a.a.f7066P) {
            c(c0020a);
        } else {
            if (this.f7161D.isEmpty()) {
                return;
            }
            this.f7161D.peek().a(c0020a);
        }
    }

    private static com.anythink.basead.exoplayer.e.a.c a(SparseArray<com.anythink.basead.exoplayer.e.a.c> sparseArray, int i4) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (com.anythink.basead.exoplayer.e.a.c) C0544a.a(sparseArray.get(i4));
    }

    private void a(s sVar) {
        com.anythink.basead.exoplayer.e.m[] mVarArr = this.f7179W;
        if (mVarArr == null || mVarArr.length == 0) {
            return;
        }
        sVar.c(12);
        int a9 = sVar.a();
        sVar.p();
        sVar.p();
        long a10 = af.a(sVar.h(), 1000000L, sVar.h());
        for (com.anythink.basead.exoplayer.e.m mVar : this.f7179W) {
            sVar.c(12);
            mVar.a(sVar, a9);
        }
        long j9 = this.f7172P;
        if (j9 != com.anythink.basead.exoplayer.b.f6539b) {
            long j10 = j9 + a10;
            ac acVar = this.f7158A;
            if (acVar != null) {
                j10 = acVar.b(j10);
            }
            long j11 = j10;
            for (com.anythink.basead.exoplayer.e.m mVar2 : this.f7179W) {
                mVar2.a(j11, 1, a9, 0, null);
            }
            return;
        }
        this.f7162E.addLast(new b(a10, a9));
        this.f7169M += a9;
    }

    private static void a(a.C0020a c0020a, SparseArray<c> sparseArray, int i4, byte[] bArr) {
        int size = c0020a.aX.size();
        for (int i9 = 0; i9 < size; i9++) {
            a.C0020a c0020a2 = c0020a.aX.get(i9);
            if (c0020a2.aU == com.anythink.basead.exoplayer.e.a.a.f7067Q) {
                b(c0020a2, sparseArray, i4, bArr);
            }
        }
    }

    private static void a(a.C0020a c0020a, c cVar, long j9, int i4) {
        c cVar2;
        long j10;
        int i9;
        List<a.b> list = c0020a.aW;
        int size = list.size();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            a.b bVar = list.get(i13);
            if (bVar.aU == com.anythink.basead.exoplayer.e.a.a.f7056E) {
                s sVar = bVar.aV;
                sVar.c(12);
                int m8 = sVar.m();
                if (m8 > 0) {
                    i12 += m8;
                    i11++;
                }
            }
        }
        cVar.f7197g = 0;
        cVar.f7196f = 0;
        cVar.f7195e = 0;
        cVar.f7192b.a(i11, i12);
        int i14 = 0;
        int i15 = 0;
        while (i10 < size) {
            a.b bVar2 = list.get(i10);
            if (bVar2.aU == com.anythink.basead.exoplayer.e.a.a.f7056E) {
                s sVar2 = bVar2.aV;
                cVar2 = cVar;
                j10 = j9;
                i9 = i4;
                i15 = a(cVar2, i14, j10, i9, sVar2, i15);
                i14++;
            } else {
                cVar2 = cVar;
                j10 = j9;
                i9 = i4;
            }
            i10++;
            cVar = cVar2;
            j9 = j10;
            i4 = i9;
        }
    }

    private static void a(k kVar, s sVar, l lVar) {
        int i4;
        int i9 = kVar.f7283d;
        sVar.c(8);
        if ((com.anythink.basead.exoplayer.e.a.a.b(sVar.i()) & 1) == 1) {
            sVar.d(8);
        }
        int d2 = sVar.d();
        int m8 = sVar.m();
        if (m8 == lVar.f7290f) {
            if (d2 == 0) {
                boolean[] zArr = lVar.f7297n;
                i4 = 0;
                for (int i10 = 0; i10 < m8; i10++) {
                    int d3 = sVar.d();
                    i4 += d3;
                    zArr[i10] = d3 > i9;
                }
            } else {
                i4 = d2 * m8;
                Arrays.fill(lVar.f7297n, 0, m8, d2 > i9);
            }
            lVar.a(i4);
            return;
        }
        StringBuilder l9 = CL.l(m8, "Length mismatch: ", ", ");
        l9.append(lVar.f7290f);
        throw new t(l9.toString());
    }

    private static void a(s sVar, l lVar) {
        sVar.c(8);
        int i4 = sVar.i();
        if ((com.anythink.basead.exoplayer.e.a.a.b(i4) & 1) == 1) {
            sVar.d(8);
        }
        int m8 = sVar.m();
        if (m8 == 1) {
            lVar.f7288d += com.anythink.basead.exoplayer.e.a.a.a(i4) == 0 ? sVar.h() : sVar.n();
            return;
        }
        throw new t("Unexpected saio entry count: ".concat(String.valueOf(m8)));
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
            l lVar = b10.f7192b;
            lVar.f7287c = n9;
            lVar.f7288d = n9;
        }
        com.anythink.basead.exoplayer.e.a.c cVar = b10.f7194d;
        b10.f7192b.f7285a = new com.anythink.basead.exoplayer.e.a.c((b9 & 2) != 0 ? sVar.m() - 1 : cVar.f7133a, (b9 & 8) != 0 ? sVar.m() : cVar.f7134b, (b9 & 16) != 0 ? sVar.m() : cVar.f7135c, (b9 & 32) != 0 ? sVar.m() : cVar.f7136d);
        return b10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int[]] */
    private static int a(c cVar, int i4, long j9, int i9, s sVar, int i10) {
        ?? r27;
        boolean z8;
        int i11;
        boolean z9;
        int i12;
        int i13;
        int i14;
        sVar.c(8);
        int b9 = com.anythink.basead.exoplayer.e.a.a.b(sVar.i());
        j jVar = cVar.f7193c;
        l lVar = cVar.f7192b;
        com.anythink.basead.exoplayer.e.a.c cVar2 = lVar.f7285a;
        lVar.f7292h[i4] = sVar.m();
        long[] jArr = lVar.f7291g;
        long j10 = lVar.f7287c;
        jArr[i4] = j10;
        if ((b9 & 1) != 0) {
            jArr[i4] = j10 + sVar.i();
        }
        boolean z10 = (b9 & 4) != 0;
        int i15 = cVar2.f7136d;
        if (z10) {
            i15 = sVar.m();
        }
        boolean z11 = (b9 & 256) != 0;
        boolean z12 = (b9 & 512) != 0;
        boolean z13 = (b9 & 1024) != 0;
        boolean z14 = (b9 & 2048) != 0;
        long[] jArr2 = jVar.f7275j;
        long j11 = 0;
        if (jArr2 != null && jArr2.length == 1 && jArr2[0] == 0) {
            r27 = 0;
            z8 = true;
            j11 = af.a(jVar.f7276k[0], 1000L, jVar.f7271e);
        } else {
            r27 = 0;
            z8 = true;
        }
        int[] iArr = lVar.i;
        ?? r72 = lVar.f7293j;
        long[] jArr3 = lVar.f7294k;
        boolean z15 = z8;
        boolean[] zArr = lVar.f7295l;
        boolean z16 = z14;
        boolean z17 = (jVar.f7270d != 2 || (i9 & 1) == 0) ? r27 : z15;
        int i16 = i10 + lVar.f7292h[i4];
        boolean z18 = z10;
        long j12 = jVar.f7271e;
        int i17 = i10;
        long j13 = i4 > 0 ? lVar.f7302s : j9;
        while (i17 < i16) {
            if (z11) {
                i11 = sVar.m();
            } else {
                i11 = cVar2.f7134b;
            }
            int m8 = z12 ? sVar.m() : cVar2.f7135c;
            if (i17 == 0 && z18) {
                z9 = z17;
                i12 = i15;
            } else if (z13) {
                z9 = z17;
                i12 = sVar.i();
            } else {
                z9 = z17;
                i12 = cVar2.f7136d;
            }
            if (z16) {
                i13 = i12;
                i14 = i16;
                r72[i17] = (int) ((sVar.i() * 1000) / j12);
            } else {
                i13 = i12;
                i14 = i16;
                r72[i17] = r27;
            }
            long j14 = j13;
            jArr3[i17] = af.a(j13, 1000L, j12) - j11;
            iArr[i17] = m8;
            zArr[i17] = (((i13 >> 16) & 1) != 0 || (z9 && i17 != 0)) ? r27 : z15;
            j13 = j14 + i11;
            i17++;
            z17 = z9;
            i16 = i14;
        }
        int i18 = i16;
        lVar.f7302s = j13;
        return i18;
    }

    private static void a(s sVar, l lVar, byte[] bArr) {
        sVar.c(8);
        sVar.a(bArr, 0, 16);
        if (Arrays.equals(bArr, f7151l)) {
            a(sVar, 16, lVar);
        }
    }

    private static void a(s sVar, int i4, l lVar) {
        sVar.c(i4 + 8);
        int b9 = com.anythink.basead.exoplayer.e.a.a.b(sVar.i());
        if ((b9 & 1) == 0) {
            boolean z8 = (b9 & 2) != 0;
            int m8 = sVar.m();
            if (m8 == lVar.f7290f) {
                Arrays.fill(lVar.f7297n, 0, m8, z8);
                lVar.a(sVar.a());
                lVar.a(sVar);
                return;
            } else {
                StringBuilder l9 = CL.l(m8, "Length mismatch: ", ", ");
                l9.append(lVar.f7290f);
                throw new t(l9.toString());
            }
        }
        throw new t("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    private static void a(s sVar, s sVar2, String str, l lVar) {
        byte[] bArr;
        sVar.c(8);
        int i4 = sVar.i();
        int i9 = sVar.i();
        int i10 = f7150k;
        if (i9 != i10) {
            return;
        }
        if (com.anythink.basead.exoplayer.e.a.a.a(i4) == 1) {
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
                    int d3 = sVar2.d();
                    byte[] bArr2 = new byte[16];
                    sVar2.a(bArr2, 0, 16);
                    if (d3 == 0) {
                        int d9 = sVar2.d();
                        bArr = new byte[d9];
                        sVar2.a(bArr, 0, d9);
                    } else {
                        bArr = null;
                    }
                    byte[] bArr3 = bArr;
                    lVar.f7296m = true;
                    lVar.f7298o = new k(true, str, d3, bArr2, i12, i13, bArr3);
                    return;
                }
                return;
            }
            throw new t("Entry count in sgpd != 1 (unsupported).");
        }
        throw new t("Entry count in sbgp != 1 (unsupported).");
    }

    private static Pair<Long, com.anythink.basead.exoplayer.e.a> a(s sVar, long j9) {
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
        long j10 = n10 + j9;
        long a10 = af.a(n9, 1000000L, h9);
        sVar.d(2);
        int e6 = sVar.e();
        int[] iArr = new int[e6];
        long[] jArr = new long[e6];
        long[] jArr2 = new long[e6];
        long[] jArr3 = new long[e6];
        long j11 = j10;
        long j12 = a10;
        int i4 = 0;
        while (i4 < e6) {
            int i9 = sVar.i();
            if ((Integer.MIN_VALUE & i9) == 0) {
                long h10 = sVar.h();
                iArr[i4] = i9 & Integer.MAX_VALUE;
                jArr[i4] = j11;
                jArr3[i4] = j12;
                n9 += h10;
                long[] jArr4 = jArr3;
                j12 = af.a(n9, 1000000L, h9);
                jArr2[i4] = j12 - jArr4[i4];
                sVar.d(4);
                j11 += iArr[i4];
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
        long j9 = Long.MAX_VALUE;
        for (int i4 = 0; i4 < size; i4++) {
            c valueAt = sparseArray.valueAt(i4);
            int i9 = valueAt.f7197g;
            l lVar = valueAt.f7192b;
            if (i9 != lVar.f7289e) {
                long j10 = lVar.f7291g[i9];
                if (j10 < j9) {
                    cVar = valueAt;
                    j9 = j10;
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
            if (bVar.aU == com.anythink.basead.exoplayer.e.a.a.f7075Z) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = bVar.aV.f8659a;
                UUID a9 = h.a(bArr);
                if (a9 == null) {
                    Log.w(f7149j, "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new e.a(a9, o.f8605e, bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new com.anythink.basead.exoplayer.d.e(arrayList);
    }

    private static boolean a(int i4) {
        return i4 == com.anythink.basead.exoplayer.e.a.a.f7074X || i4 == com.anythink.basead.exoplayer.e.a.a.f7073W || i4 == com.anythink.basead.exoplayer.e.a.a.f7059H || i4 == com.anythink.basead.exoplayer.e.a.a.f7057F || i4 == com.anythink.basead.exoplayer.e.a.a.Y || i4 == com.anythink.basead.exoplayer.e.a.a.f7053B || i4 == com.anythink.basead.exoplayer.e.a.a.f7054C || i4 == com.anythink.basead.exoplayer.e.a.a.f7070T || i4 == com.anythink.basead.exoplayer.e.a.a.f7055D || i4 == com.anythink.basead.exoplayer.e.a.a.f7056E || i4 == com.anythink.basead.exoplayer.e.a.a.f7075Z || i4 == com.anythink.basead.exoplayer.e.a.a.ah || i4 == com.anythink.basead.exoplayer.e.a.a.ai || i4 == com.anythink.basead.exoplayer.e.a.a.am || i4 == com.anythink.basead.exoplayer.e.a.a.al || i4 == com.anythink.basead.exoplayer.e.a.a.aj || i4 == com.anythink.basead.exoplayer.e.a.a.ak || i4 == com.anythink.basead.exoplayer.e.a.a.f7072V || i4 == com.anythink.basead.exoplayer.e.a.a.f7069S || i4 == com.anythink.basead.exoplayer.e.a.a.aL;
    }
}

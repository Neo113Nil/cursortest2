package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class FQ implements InterfaceC3807qQ, S0 {

    /* renamed from: p0, reason: collision with root package name */
    public static final Map f25555p0;

    /* renamed from: q0, reason: collision with root package name */
    public static final DP f25556q0;

    /* renamed from: A, reason: collision with root package name */
    public final long f25557A;

    /* renamed from: B, reason: collision with root package name */
    public final long f25558B;

    /* renamed from: D, reason: collision with root package name */
    public final C4297ze f25560D;

    /* renamed from: I, reason: collision with root package name */
    public Object f25565I;
    public T1 J;

    /* renamed from: N, reason: collision with root package name */
    public boolean f25569N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f25570O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f25571P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f25572Q;

    /* renamed from: R, reason: collision with root package name */
    public ME f25573R;

    /* renamed from: S, reason: collision with root package name */
    public InterfaceC3136e1 f25574S;

    /* renamed from: T, reason: collision with root package name */
    public long f25575T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f25576U;

    /* renamed from: W, reason: collision with root package name */
    public boolean f25578W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f25579X;
    public boolean Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f25580Z;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f25581i0;

    /* renamed from: j0, reason: collision with root package name */
    public long f25582j0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f25584l0;
    public int m0;

    /* renamed from: n, reason: collision with root package name */
    public final Uri f25585n;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f25586n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f25587o0;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC3636nH f25588u;

    /* renamed from: v, reason: collision with root package name */
    public final V2 f25589v;

    /* renamed from: w, reason: collision with root package name */
    public final AP f25590w;

    /* renamed from: x, reason: collision with root package name */
    public final AP f25591x;

    /* renamed from: y, reason: collision with root package name */
    public final HQ f25592y;

    /* renamed from: z, reason: collision with root package name */
    public final InterfaceC4049v f25593z;

    /* renamed from: C, reason: collision with root package name */
    public final C4297ze f25559C = new C4297ze(1);

    /* renamed from: E, reason: collision with root package name */
    public final C2818Tm f25561E = new C2818Tm();

    /* renamed from: F, reason: collision with root package name */
    public final F f25562F = new F(this, 3);

    /* renamed from: G, reason: collision with root package name */
    public final F f25563G = new F(this, 1);

    /* renamed from: H, reason: collision with root package name */
    public final Handler f25564H = AbstractC3182eu.p();

    /* renamed from: M, reason: collision with root package name */
    public EQ[] f25568M = new EQ[0];

    /* renamed from: L, reason: collision with root package name */
    public KQ[] f25567L = new KQ[0];

    /* renamed from: K, reason: collision with root package name */
    public BQ[] f25566K = new BQ[0];

    /* renamed from: k0, reason: collision with root package name */
    public long f25583k0 = com.anythink.basead.exoplayer.b.f7168b;

    /* renamed from: V, reason: collision with root package name */
    public int f25577V = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f25555p0 = Collections.unmodifiableMap(hashMap);
        C3322hP c3322hP = new C3322hP();
        c3322hP.f31546a = "icy";
        c3322hP.e("application/x-icy");
        f25556q0 = new DP(c3322hP);
    }

    public FQ(Uri uri, InterfaceC3636nH interfaceC3636nH, C4297ze c4297ze, V2 v22, AP ap, AP ap2, HQ hq, InterfaceC4049v interfaceC4049v, int i, long j6) {
        this.f25585n = uri;
        this.f25588u = interfaceC3636nH;
        this.f25589v = v22;
        this.f25591x = ap;
        this.f25590w = ap2;
        this.f25592y = hq;
        this.f25593z = interfaceC4049v;
        this.f25557A = i;
        this.f25560D = c4297ze;
        this.f25558B = j6;
    }

    @Override // com.google.android.gms.internal.ads.S0
    public final void B() {
        this.f25569N = true;
        this.f25564H.post(this.f25562F);
    }

    @Override // com.google.android.gms.internal.ads.S0
    public final InterfaceC3566m1 C(int i, int i4) {
        return o(new EQ(i, false));
    }

    @Override // com.google.android.gms.internal.ads.S0
    public final void D(InterfaceC3136e1 interfaceC3136e1) {
        this.f25564H.post(new RunnableC3214fP(4, this, interfaceC3136e1));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3807qQ
    public final void X(long j6) {
        long j9;
        long i;
        int i4;
        if (this.f25572Q) {
            return;
        }
        x();
        if (v()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.f25573R.f27063d;
        int length = this.f25567L.length;
        int i6 = 0;
        while (i6 < length) {
            KQ kq = this.f25567L[i6];
            boolean z6 = zArr[i6];
            IQ iq = kq.f26679a;
            synchronized (kq) {
                try {
                    int i9 = kq.f26692o;
                    if (i9 != 0) {
                        long[] jArr = kq.f26690m;
                        int i10 = kq.f26694q;
                        if (j6 >= jArr[i10]) {
                            j9 = j6;
                            int h3 = kq.h(i10, (!z6 || (i4 = kq.f26695r) == i9) ? i9 : i4 + 1, j9, false);
                            i = h3 != -1 ? kq.i(h3) : -1L;
                        }
                    }
                    j9 = j6;
                } finally {
                }
            }
            iq.a(i);
            i6++;
            j6 = j9;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3807qQ
    public final long a(long j6) {
        boolean n9;
        int i;
        int i4;
        x();
        boolean[] zArr = (boolean[]) this.f25573R.f27062c;
        if (true != this.f25574S.f()) {
            j6 = 0;
        }
        this.f25579X = false;
        long j9 = this.f25582j0;
        this.f25582j0 = j6;
        if (v()) {
            this.f25583k0 = j6;
            return j6;
        }
        if (this.f25577V != 7 && (this.f25586n0 || ((E) this.f25559C.f36134v) != null)) {
            int length = this.f25567L.length;
            for (int i6 = 0; i6 < length; i6++) {
                KQ kq = this.f25567L[i6];
                if (this.f25566K[i6].f24677d.get() == AQ.f24457n) {
                    int i9 = kq.f26693p;
                    if (kq.f26695r + i9 != 0 || j9 != j6) {
                        if (this.f25572Q) {
                            synchronized (kq) {
                                synchronized (kq) {
                                    kq.f26695r = 0;
                                    IQ iq = kq.f26679a;
                                    iq.f26261d = iq.f26260c;
                                }
                            }
                            int i10 = kq.f26693p;
                            if (i9 >= i10 && i9 <= kq.f26692o + i10 && (((i = kq.f26700w) == -1 || i9 < i) && ((i4 = kq.f26701x) == -1 || i9 < i4))) {
                                kq.f26696s = Long.MIN_VALUE;
                                kq.f26695r = i9 - i10;
                                n9 = true;
                            }
                            n9 = false;
                        } else {
                            n9 = kq.n(j6, this.f25586n0);
                        }
                        if (n9) {
                            continue;
                        } else if (!zArr[i6] && this.f25571P) {
                        }
                    }
                }
            }
            return j6;
        }
        this.f25584l0 = false;
        this.f25583k0 = j6;
        this.f25586n0 = false;
        this.Y = false;
        C4297ze c4297ze = this.f25559C;
        if (!(((E) c4297ze.f36134v) != null)) {
            c4297ze.f36135w = null;
            for (KQ kq2 : this.f25567L) {
                kq2.k(false);
            }
            return j6;
        }
        for (KQ kq3 : this.f25567L) {
            kq3.o();
        }
        E e9 = (E) c4297ze.f36134v;
        e9.getClass();
        e9.a(false);
        return j6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3807qQ
    public final void b(InterfaceC3753pQ interfaceC3753pQ, long j6) {
        this.f25565I = interfaceC3753pQ;
        this.f25561E.a();
        s();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        if (r13 == Long.MIN_VALUE) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0065  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3807qQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long c(long j6, C4020uO c4020uO) {
        long j9;
        boolean z6;
        x();
        if (!this.f25574S.f()) {
            return 0L;
        }
        C3083d1 b9 = this.f25574S.b(j6);
        C3190f1 c3190f1 = b9.f30432a;
        long j10 = c4020uO.f35308a;
        if (j10 == 0) {
            return j6;
        }
        String str = AbstractC3182eu.f30782a;
        long j11 = j6 - j10;
        long j12 = Long.MAX_VALUE;
        long j13 = (((j6 ^ j11) > 0L ? 1 : ((j6 ^ j11) == 0L ? 0 : -1)) >= 0) | (((j10 ^ j6) > 0L ? 1 : ((j10 ^ j6) == 0L ? 0 : -1)) >= 0) ? j11 : ((j11 >>> 63) ^ 1) + Long.MAX_VALUE;
        long j14 = Long.MIN_VALUE;
        if (j13 == Long.MIN_VALUE) {
            if (j11 == Long.MIN_VALUE) {
                j11 = Long.MIN_VALUE;
            }
            j13 = Long.MIN_VALUE;
            if (j6 == Long.MIN_VALUE) {
                j14 = j6;
            }
            if (j6 != Long.MAX_VALUE) {
                int i = (j14 > Long.MAX_VALUE ? 1 : (j14 == Long.MAX_VALUE ? 0 : -1));
            } else {
                j12 = j6;
            }
            j9 = c3190f1.f30800a;
            z6 = j13 > j9 && j9 <= j12;
            long j15 = b9.f30433b.f30800a;
            boolean z9 = j13 > j15 && j15 <= j12;
            if (z6 || !z9) {
                if (!z6) {
                    return z9 ? j15 : j13;
                }
                return j9;
            }
            if (Math.abs(j9 - j6) <= Math.abs(j15 - j6)) {
                return j9;
            }
        }
        if (j13 == Long.MAX_VALUE) {
            if (j11 == Long.MAX_VALUE) {
                j13 = Long.MAX_VALUE;
            }
            j13 = Long.MIN_VALUE;
        }
        if (j6 == Long.MIN_VALUE) {
        }
        if (j6 != Long.MAX_VALUE) {
        }
        j9 = c3190f1.f30800a;
        if (j13 > j9) {
        }
        long j152 = b9.f30433b.f30800a;
        if (j13 > j152) {
        }
        if (z6) {
        }
        if (!z6) {
        }
        return j9;
    }

    @Override // com.google.android.gms.internal.ads.MQ
    public final boolean d() {
        boolean z6;
        if (this.f25586n0 || ((E) this.f25559C.f36134v) == null) {
            return false;
        }
        C2818Tm c2818Tm = this.f25561E;
        synchronized (c2818Tm) {
            z6 = c2818Tm.f28577a;
        }
        return z6;
    }

    @Override // com.google.android.gms.internal.ads.MQ
    public final boolean e(C2945aO c2945aO) {
        if (this.f25586n0) {
            return false;
        }
        C4297ze c4297ze = this.f25559C;
        if (((IOException) c4297ze.f36135w) != null || this.f25584l0) {
            return false;
        }
        if (this.f25570O && this.f25580Z == 0) {
            return false;
        }
        boolean a9 = this.f25561E.a();
        if (((E) c4297ze.f36134v) != null) {
            return a9;
        }
        s();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.MQ
    public final long f() {
        long j6;
        boolean z6;
        long j9;
        x();
        if (this.f25586n0 || this.f25580Z == 0) {
            return Long.MIN_VALUE;
        }
        if (v()) {
            return this.f25583k0;
        }
        if (this.f25571P) {
            int length = this.f25567L.length;
            j6 = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                ME me = this.f25573R;
                if (((boolean[]) me.f27062c)[i] && ((boolean[]) me.f27063d)[i]) {
                    KQ kq = this.f25567L[i];
                    synchronized (kq) {
                        z6 = kq.f26702y;
                    }
                    if (z6) {
                        continue;
                    } else {
                        KQ kq2 = this.f25567L[i];
                        synchronized (kq2) {
                            j9 = kq2.f26699v;
                        }
                        j6 = Math.min(j6, j9);
                    }
                }
            }
        } else {
            j6 = Long.MAX_VALUE;
        }
        if (j6 == Long.MAX_VALUE) {
            j6 = u(false);
        }
        return j6 == Long.MIN_VALUE ? this.f25582j0 : j6;
    }

    /* JADX WARN: Type inference failed for: r14v4, types: [com.google.android.gms.internal.ads.pQ, java.lang.Object] */
    public final void g(CQ cq, boolean z6) {
        Object obj = cq.f24880b.f30366v;
        C3429jQ c3429jQ = new C3429jQ();
        C3699oQ c3699oQ = new C3699oQ(-1, null, AbstractC3182eu.t(cq.i), AbstractC3182eu.t(this.f25575T));
        AP ap = this.f25590w;
        ap.a(new C4297ze(28, ap, c3429jQ, c3699oQ));
        if (z6) {
            return;
        }
        for (KQ kq : this.f25567L) {
            kq.k(false);
        }
        if (this.f25580Z > 0) {
            ?? r14 = this.f25565I;
            r14.getClass();
            r14.j(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3807qQ
    public final long h(InterfaceC3780q[] interfaceC3780qArr, boolean[] zArr, LQ[] lqArr, boolean[] zArr2, long j6) {
        boolean[] zArr3;
        InterfaceC3780q interfaceC3780q;
        x();
        ME me = this.f25573R;
        SQ sq = (SQ) me.f27061b;
        int i = this.f25580Z;
        int i4 = 0;
        while (true) {
            int length = interfaceC3780qArr.length;
            zArr3 = (boolean[]) me.f27063d;
            if (i4 >= length) {
                break;
            }
            LQ lq = lqArr[i4];
            if (lq != null && (interfaceC3780qArr[i4] == null || !zArr[i4])) {
                int i6 = ((DQ) lq).f25188a;
                AbstractC2792Sd.H(zArr3[i6]);
                this.f25580Z--;
                zArr3[i6] = false;
                lqArr[i4] = null;
            }
            i4++;
        }
        boolean z6 = !this.f25578W ? j6 == 0 || this.f25572Q : i != 0;
        for (int i9 = 0; i9 < interfaceC3780qArr.length; i9++) {
            if (lqArr[i9] == null && (interfaceC3780q = interfaceC3780qArr[i9]) != null) {
                AbstractC2792Sd.H(interfaceC3780q.d() == 1);
                AbstractC2792Sd.H(interfaceC3780q.v(0) == 0);
                int indexOf = sq.f28275b.indexOf(interfaceC3780q.c());
                if (indexOf < 0) {
                    indexOf = -1;
                }
                AbstractC2792Sd.H(!zArr3[indexOf]);
                this.f25580Z++;
                zArr3[indexOf] = true;
                this.Y = interfaceC3780q.i().f25182u | this.Y;
                lqArr[i9] = new DQ(this, indexOf);
                zArr2[i9] = true;
                if (!z6) {
                    KQ kq = this.f25567L[indexOf];
                    z6 = (kq.f26693p + kq.f26695r == 0 || kq.n(j6, true)) ? false : true;
                }
            }
        }
        if (this.f25580Z == 0) {
            this.f25584l0 = false;
            this.f25579X = false;
            this.Y = false;
            C4297ze c4297ze = this.f25559C;
            if (((E) c4297ze.f36134v) != null) {
                for (KQ kq2 : this.f25567L) {
                    kq2.o();
                }
                E e9 = (E) c4297ze.f36134v;
                e9.getClass();
                e9.a(false);
            } else {
                this.f25586n0 = false;
                for (KQ kq3 : this.f25567L) {
                    kq3.k(false);
                }
            }
        } else if (z6) {
            j6 = a(j6);
            for (int i10 = 0; i10 < lqArr.length; i10++) {
                if (lqArr[i10] != null) {
                    zArr2[i10] = true;
                }
            }
        }
        this.f25578W = true;
        return j6;
    }

    @Override // com.google.android.gms.internal.ads.MQ
    public final long i() {
        return f();
    }

    /* JADX WARN: Type inference failed for: r15v2, types: [com.google.android.gms.internal.ads.pQ, java.lang.Object] */
    public final void j(CQ cq) {
        if (this.f25575T == com.anythink.basead.exoplayer.b.f7168b && this.f25574S != null) {
            long u6 = u(true);
            long j6 = u6 == Long.MIN_VALUE ? 0L : u6 + 10000;
            this.f25575T = j6;
            this.f25592y.s(j6, this.f25574S, this.f25576U);
        }
        Object obj = cq.f24880b.f30366v;
        C3429jQ c3429jQ = new C3429jQ();
        C3699oQ c3699oQ = new C3699oQ(-1, null, AbstractC3182eu.t(cq.i), AbstractC3182eu.t(this.f25575T));
        AP ap = this.f25590w;
        ap.a(new C3504ku(27, ap, c3429jQ, c3699oQ));
        this.f25586n0 = true;
        ?? r15 = this.f25565I;
        r15.getClass();
        r15.j(this);
    }

    @Override // com.google.android.gms.internal.ads.MQ
    public final void k(long j6) {
    }

    public final void l(int i) {
        x();
        ME me = this.f25573R;
        boolean[] zArr = (boolean[]) me.f27064e;
        if (zArr[i]) {
            return;
        }
        DP dp = ((SQ) me.f27061b).a(i).f24418d[0];
        C3699oQ c3699oQ = new C3699oQ(H4.f(dp.f25176o), dp, AbstractC3182eu.t(this.f25582j0), com.anythink.basead.exoplayer.b.f7168b);
        AP ap = this.f25590w;
        ap.a(new S0.s(28, ap, c3699oQ));
        zArr[i] = true;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [com.google.android.gms.internal.ads.pQ, java.lang.Object] */
    public final void m(int i) {
        x();
        if (this.f25584l0) {
            if ((!this.f25571P || ((boolean[]) this.f25573R.f27062c)[i]) && !this.f25567L[i].m(false)) {
                this.f25583k0 = 0L;
                this.f25584l0 = false;
                this.f25579X = true;
                this.f25582j0 = 0L;
                this.m0 = 0;
                for (KQ kq : this.f25567L) {
                    kq.k(false);
                }
                ?? r52 = this.f25565I;
                r52.getClass();
                r52.j(this);
            }
        }
    }

    public final boolean n() {
        return this.f25579X || v();
    }

    public final InterfaceC3566m1 o(EQ eq) {
        int length = this.f25567L.length;
        for (int i = 0; i < length; i++) {
            if (eq.equals(this.f25568M[i])) {
                return this.f25567L[i];
            }
        }
        if (this.f25569N) {
            int i4 = eq.f25380a;
            StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 55);
            sb.append("Extractor added new track (id=");
            sb.append(i4);
            sb.append(") after finishing tracks.");
            AbstractC2991bG.y("ProgressiveMediaPeriod", sb.toString());
            return new O0();
        }
        KQ kq = new KQ(this.f25593z, this.f25589v, this.f25591x);
        BQ bq = new BQ(kq);
        kq.f26683e = this;
        int i6 = length + 1;
        EQ[] eqArr = (EQ[]) Arrays.copyOf(this.f25568M, i6);
        eqArr[length] = eq;
        String str = AbstractC3182eu.f30782a;
        this.f25568M = eqArr;
        KQ[] kqArr = (KQ[]) Arrays.copyOf(this.f25567L, i6);
        kqArr[length] = kq;
        this.f25567L = kqArr;
        BQ[] bqArr = (BQ[]) Arrays.copyOf(this.f25566K, i6);
        bqArr[length] = bq;
        this.f25566K = bqArr;
        return bq;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3807qQ
    public final SQ p() {
        x();
        return (SQ) this.f25573R.f27061b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3807qQ
    public final void q() {
        IOException iOException;
        int i = this.f25577V == 7 ? 6 : 3;
        C4297ze c4297ze = this.f25559C;
        IOException iOException2 = (IOException) c4297ze.f36135w;
        if (iOException2 != null) {
            throw iOException2;
        }
        E e9 = (E) c4297ze.f36134v;
        if (e9 != null && (iOException = e9.f25273v) != null && e9.f25274w > i) {
            throw iOException;
        }
        if (this.f25586n0 && !this.f25570O) {
            throw U4.a(null, "Loading finished before preparation is complete.");
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.android.gms.internal.ads.pQ, java.lang.Object] */
    public final void r() {
        int i;
        if (this.f25587o0 || this.f25570O || !this.f25569N || this.f25574S == null) {
            return;
        }
        for (KQ kq : this.f25567L) {
            if (kq.l() == null) {
                return;
            }
        }
        C2818Tm c2818Tm = this.f25561E;
        synchronized (c2818Tm) {
            c2818Tm.f28577a = false;
        }
        int length = this.f25567L.length;
        int i4 = 0;
        int i6 = -1;
        for (int i9 = 0; i9 < length; i9++) {
            DP l9 = this.f25567L[i9].l();
            l9.getClass();
            int f2 = H4.f(l9.f25176o);
            char c9 = 2;
            char c10 = f2 != 1 ? f2 != 2 ? f2 != 3 ? f2 != 4 ? (char) 0 : (char) 2 : (char) 1 : (char) 4 : (char) 3;
            if (i6 == 1) {
                c9 = 3;
            } else if (i6 == 2) {
                c9 = 4;
            } else if (i6 == 3) {
                c9 = 1;
            } else if (i6 != 4) {
                c9 = 0;
            }
            if (c10 > c9) {
                i6 = f2;
            }
            if (c10 > c9) {
                i4 = i9;
            }
        }
        A8[] a8Arr = new A8[length];
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            DP l10 = this.f25567L[i10].l();
            l10.getClass();
            String str = l10.f25176o;
            boolean a9 = H4.a(str);
            boolean z6 = a9 || H4.b(str);
            zArr[i10] = z6;
            this.f25571P = z6 | this.f25571P;
            this.f25572Q = this.f25558B != com.anythink.basead.exoplayer.b.f7168b && length == 1 && H4.c(str);
            T1 t12 = this.J;
            if (t12 != null) {
                if (a9 || this.f25568M[i10].f25381b) {
                    O3 o32 = l10.f25173l;
                    O3 o33 = o32 == null ? new O3(t12) : o32.c(t12);
                    C3322hP c3322hP = new C3322hP(l10);
                    c3322hP.f31555k = o33;
                    l10 = new DP(c3322hP);
                }
                if (a9 && l10.f25170h == -1 && l10.i == -1 && (i = t12.f28455a) != -1) {
                    C3322hP c3322hP2 = new C3322hP(l10);
                    c3322hP2.f31553h = i;
                    l10 = new DP(c3322hP2);
                }
            }
            this.f25589v.getClass();
            int i11 = l10.f25180s != null ? 1 : 0;
            C3322hP c3322hP3 = new C3322hP(l10);
            c3322hP3.f31545O = i11;
            DP dp = new DP(c3322hP3);
            if (i10 != i4) {
                C3322hP c3322hP4 = new C3322hP(dp);
                c3322hP4.f31556l = Integer.toString(i4);
                dp = new DP(c3322hP4);
            }
            a8Arr[i10] = new A8(Integer.toString(i10), dp);
            this.Y = dp.f25182u | this.Y;
            KQ kq2 = this.f25567L[i10];
            synchronized (kq2) {
                if (kq2.f26697t != Long.MIN_VALUE) {
                    kq2.f26697t = Long.MIN_VALUE;
                    kq2.f26700w = -1;
                    kq2.f26701x = -1;
                }
            }
        }
        this.f25573R = new ME(new SQ(a8Arr), zArr);
        if (this.f25572Q && this.f25575T == com.anythink.basead.exoplayer.b.f7168b) {
            this.f25575T = this.f25558B;
            this.f25574S = new C4292zQ(this, this.f25574S);
        }
        this.f25592y.s(this.f25575T, this.f25574S, this.f25576U);
        this.f25570O = true;
        ?? r02 = this.f25565I;
        r02.getClass();
        r02.g(this);
    }

    public final void s() {
        CQ cq = new CQ(this, this.f25585n, this.f25588u, this.f25560D, this, this.f25561E);
        if (this.f25570O) {
            AbstractC2792Sd.H(v());
            long j6 = this.f25575T;
            if (j6 != com.anythink.basead.exoplayer.b.f7168b && this.f25583k0 > j6) {
                this.f25586n0 = true;
                this.f25583k0 = com.anythink.basead.exoplayer.b.f7168b;
                return;
            }
            InterfaceC3136e1 interfaceC3136e1 = this.f25574S;
            interfaceC3136e1.getClass();
            C3190f1 c3190f1 = interfaceC3136e1.b(this.f25583k0).f30432a;
            long j9 = this.f25583k0;
            cq.f24884f.f28641n = c3190f1.f30801b;
            cq.i = j9;
            cq.f24886h = true;
            cq.f24889l = false;
            for (KQ kq : this.f25567L) {
                kq.f26696s = this.f25583k0;
            }
            this.f25583k0 = com.anythink.basead.exoplayer.b.f7168b;
        }
        this.m0 = t();
        C4297ze c4297ze = this.f25559C;
        c4297ze.getClass();
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        c4297ze.f36135w = null;
        E e9 = new E(c4297ze, myLooper, cq, this, SystemClock.elapsedRealtime());
        C4297ze c4297ze2 = e9.f25270A;
        AbstractC2792Sd.H(((E) c4297ze2.f36134v) == null);
        c4297ze2.f36134v = e9;
        e9.b();
    }

    public final int t() {
        int i = 0;
        for (KQ kq : this.f25567L) {
            i += kq.f26693p + kq.f26692o;
        }
        return i;
    }

    public final long u(boolean z6) {
        long j6;
        int i = 0;
        long j9 = Long.MIN_VALUE;
        while (true) {
            KQ[] kqArr = this.f25567L;
            if (i >= kqArr.length) {
                return j9;
            }
            if (!z6) {
                ME me = this.f25573R;
                me.getClass();
                if (!((boolean[]) me.f27063d)[i]) {
                    continue;
                    i++;
                }
            }
            KQ kq = kqArr[i];
            synchronized (kq) {
                j6 = kq.f26699v;
            }
            j9 = Math.max(j9, j6);
            i++;
        }
    }

    public final boolean v() {
        return this.f25583k0 != com.anythink.basead.exoplayer.b.f7168b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3807qQ
    public final long w() {
        if (this.Y) {
            this.Y = false;
        } else {
            if (!this.f25579X) {
                return com.anythink.basead.exoplayer.b.f7168b;
            }
            if (!this.f25586n0 && t() <= this.m0) {
                return com.anythink.basead.exoplayer.b.f7168b;
            }
            this.f25579X = false;
        }
        return this.f25582j0;
    }

    public final void x() {
        AbstractC2792Sd.H(this.f25570O);
        this.f25573R.getClass();
        this.f25574S.getClass();
    }
}

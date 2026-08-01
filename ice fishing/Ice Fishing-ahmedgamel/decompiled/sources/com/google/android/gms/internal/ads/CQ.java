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
public final class CQ implements InterfaceC3622nQ, S0 {

    /* renamed from: u0, reason: collision with root package name */
    public static final Map f24116u0;

    /* renamed from: v0, reason: collision with root package name */
    public static final DP f24117v0;

    /* renamed from: A, reason: collision with root package name */
    public final long f24118A;

    /* renamed from: B, reason: collision with root package name */
    public final long f24119B;

    /* renamed from: D, reason: collision with root package name */
    public final C4274ze f24121D;

    /* renamed from: I, reason: collision with root package name */
    public Object f24126I;
    public T1 J;

    /* renamed from: N, reason: collision with root package name */
    public boolean f24130N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f24131O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f24132P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f24133Q;

    /* renamed from: R, reason: collision with root package name */
    public ME f24134R;

    /* renamed from: S, reason: collision with root package name */
    public InterfaceC3113e1 f24135S;

    /* renamed from: T, reason: collision with root package name */
    public long f24136T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f24137U;

    /* renamed from: W, reason: collision with root package name */
    public boolean f24139W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f24140X;
    public boolean Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f24141Z;

    /* renamed from: n, reason: collision with root package name */
    public final Uri f24142n;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f24143n0;

    /* renamed from: o0, reason: collision with root package name */
    public long f24144o0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f24146q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f24147r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f24148s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f24149t0;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC3613nH f24150u;

    /* renamed from: v, reason: collision with root package name */
    public final V2 f24151v;

    /* renamed from: w, reason: collision with root package name */
    public final AP f24152w;

    /* renamed from: x, reason: collision with root package name */
    public final AP f24153x;

    /* renamed from: y, reason: collision with root package name */
    public final EQ f24154y;

    /* renamed from: z, reason: collision with root package name */
    public final InterfaceC4026v f24155z;

    /* renamed from: C, reason: collision with root package name */
    public final C4274ze f24120C = new C4274ze(1);

    /* renamed from: E, reason: collision with root package name */
    public final C2781Sm f24122E = new C2781Sm();

    /* renamed from: F, reason: collision with root package name */
    public final F f24123F = new F(this, 3);

    /* renamed from: G, reason: collision with root package name */
    public final F f24124G = new F(this, 1);

    /* renamed from: H, reason: collision with root package name */
    public final Handler f24125H = AbstractC3159eu.p();

    /* renamed from: M, reason: collision with root package name */
    public BQ[] f24129M = new BQ[0];

    /* renamed from: L, reason: collision with root package name */
    public HQ[] f24128L = new HQ[0];

    /* renamed from: K, reason: collision with root package name */
    public C4215yQ[] f24127K = new C4215yQ[0];

    /* renamed from: p0, reason: collision with root package name */
    public long f24145p0 = com.anythink.basead.exoplayer.b.f6382b;

    /* renamed from: V, reason: collision with root package name */
    public int f24138V = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f24116u0 = Collections.unmodifiableMap(hashMap);
        C3299hP c3299hP = new C3299hP();
        c3299hP.f30780a = "icy";
        c3299hP.e("application/x-icy");
        f24117v0 = new DP(c3299hP);
    }

    public CQ(Uri uri, InterfaceC3613nH interfaceC3613nH, C4274ze c4274ze, V2 v22, AP ap, AP ap2, EQ eq, InterfaceC4026v interfaceC4026v, int i, long j6) {
        this.f24142n = uri;
        this.f24150u = interfaceC3613nH;
        this.f24151v = v22;
        this.f24153x = ap;
        this.f24152w = ap2;
        this.f24154y = eq;
        this.f24155z = interfaceC4026v;
        this.f24118A = i;
        this.f24121D = c4274ze;
        this.f24119B = j6;
    }

    @Override // com.google.android.gms.internal.ads.S0
    public final void B() {
        this.f24130N = true;
        this.f24125H.post(this.f24123F);
    }

    @Override // com.google.android.gms.internal.ads.S0
    public final InterfaceC3543m1 C(int i, int i6) {
        return o(new BQ(i, false));
    }

    @Override // com.google.android.gms.internal.ads.S0
    public final void D(InterfaceC3113e1 interfaceC3113e1) {
        this.f24125H.post(new RunnableC3191fP(4, this, interfaceC3113e1));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3622nQ
    public final void X(long j6) {
        long j9;
        long i;
        int i6;
        if (this.f24133Q) {
            return;
        }
        x();
        if (v()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.f24134R.f26272d;
        int length = this.f24128L.length;
        int i9 = 0;
        while (i9 < length) {
            HQ hq = this.f24128L[i9];
            boolean z3 = zArr[i9];
            FQ fq = hq.f25302a;
            synchronized (hq) {
                try {
                    int i10 = hq.f25315o;
                    if (i10 != 0) {
                        long[] jArr = hq.f25313m;
                        int i11 = hq.f25317q;
                        if (j6 >= jArr[i11]) {
                            j9 = j6;
                            int h9 = hq.h(i11, (!z3 || (i6 = hq.f25318r) == i10) ? i10 : i6 + 1, j9, false);
                            i = h9 != -1 ? hq.i(h9) : -1L;
                        }
                    }
                    j9 = j6;
                } finally {
                }
            }
            fq.a(i);
            i9++;
            j6 = j9;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3622nQ
    public final long a(long j6) {
        boolean n9;
        int i;
        int i6;
        x();
        boolean[] zArr = (boolean[]) this.f24134R.f26271c;
        if (true != this.f24135S.f()) {
            j6 = 0;
        }
        this.f24140X = false;
        long j9 = this.f24144o0;
        this.f24144o0 = j6;
        if (v()) {
            this.f24145p0 = j6;
            return j6;
        }
        if (this.f24138V != 7 && (this.f24148s0 || ((E) this.f24120C.f35361v) != null)) {
            int length = this.f24128L.length;
            for (int i9 = 0; i9 < length; i9++) {
                HQ hq = this.f24128L[i9];
                if (this.f24127K[i9].f35161d.get() == EnumC4161xQ.f35019n) {
                    int i10 = hq.f25316p;
                    if (hq.f25318r + i10 != 0 || j9 != j6) {
                        if (this.f24133Q) {
                            synchronized (hq) {
                                synchronized (hq) {
                                    hq.f25318r = 0;
                                    FQ fq = hq.f25302a;
                                    fq.f24802d = fq.f24801c;
                                }
                            }
                            int i11 = hq.f25316p;
                            if (i10 >= i11 && i10 <= hq.f25315o + i11 && (((i = hq.f25323w) == -1 || i10 < i) && ((i6 = hq.f25324x) == -1 || i10 < i6))) {
                                hq.f25319s = Long.MIN_VALUE;
                                hq.f25318r = i10 - i11;
                                n9 = true;
                            }
                            n9 = false;
                        } else {
                            n9 = hq.n(j6, this.f24148s0);
                        }
                        if (n9) {
                            continue;
                        } else if (!zArr[i9] && this.f24132P) {
                        }
                    }
                }
            }
            return j6;
        }
        this.f24146q0 = false;
        this.f24145p0 = j6;
        this.f24148s0 = false;
        this.Y = false;
        C4274ze c4274ze = this.f24120C;
        if (!(((E) c4274ze.f35361v) != null)) {
            c4274ze.f35362w = null;
            for (HQ hq2 : this.f24128L) {
                hq2.k(false);
            }
            return j6;
        }
        for (HQ hq3 : this.f24128L) {
            hq3.o();
        }
        E e9 = (E) c4274ze.f35361v;
        e9.getClass();
        e9.a(false);
        return j6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3622nQ
    public final void b(InterfaceC3568mQ interfaceC3568mQ, long j6) {
        this.f24126I = interfaceC3568mQ;
        this.f24122E.a();
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
    @Override // com.google.android.gms.internal.ads.InterfaceC3622nQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long c(long j6, C3997uO c3997uO) {
        long j9;
        boolean z3;
        x();
        if (!this.f24135S.f()) {
            return 0L;
        }
        C3060d1 b9 = this.f24135S.b(j6);
        C3167f1 c3167f1 = b9.f29660a;
        long j10 = c3997uO.f34534a;
        if (j10 == 0) {
            return j6;
        }
        String str = AbstractC3159eu.f29993a;
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
            j9 = c3167f1.f30013a;
            z3 = j13 > j9 && j9 <= j12;
            long j15 = b9.f29661b.f30013a;
            boolean z6 = j13 > j15 && j15 <= j12;
            if (z3 || !z6) {
                if (!z3) {
                    return z6 ? j15 : j13;
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
        j9 = c3167f1.f30013a;
        if (j13 > j9) {
        }
        long j152 = b9.f29661b.f30013a;
        if (j13 > j152) {
        }
        if (z3) {
        }
        if (!z3) {
        }
        return j9;
    }

    @Override // com.google.android.gms.internal.ads.JQ
    public final boolean d() {
        boolean z3;
        if (this.f24148s0 || ((E) this.f24120C.f35361v) == null) {
            return false;
        }
        C2781Sm c2781Sm = this.f24122E;
        synchronized (c2781Sm) {
            z3 = c2781Sm.f27548a;
        }
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.JQ
    public final boolean e(C2922aO c2922aO) {
        if (this.f24148s0) {
            return false;
        }
        C4274ze c4274ze = this.f24120C;
        if (((IOException) c4274ze.f35362w) != null || this.f24146q0) {
            return false;
        }
        if (this.f24131O && this.f24141Z == 0) {
            return false;
        }
        boolean a9 = this.f24122E.a();
        if (((E) c4274ze.f35361v) != null) {
            return a9;
        }
        s();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.JQ
    public final long f() {
        long j6;
        boolean z3;
        long j9;
        x();
        if (this.f24148s0 || this.f24141Z == 0) {
            return Long.MIN_VALUE;
        }
        if (v()) {
            return this.f24145p0;
        }
        if (this.f24132P) {
            int length = this.f24128L.length;
            j6 = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                ME me = this.f24134R;
                if (((boolean[]) me.f26271c)[i] && ((boolean[]) me.f26272d)[i]) {
                    HQ hq = this.f24128L[i];
                    synchronized (hq) {
                        z3 = hq.f25325y;
                    }
                    if (z3) {
                        continue;
                    } else {
                        HQ hq2 = this.f24128L[i];
                        synchronized (hq2) {
                            j9 = hq2.f25322v;
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
        return j6 == Long.MIN_VALUE ? this.f24144o0 : j6;
    }

    /* JADX WARN: Type inference failed for: r14v4, types: [com.google.android.gms.internal.ads.mQ, java.lang.Object] */
    public final void g(C4269zQ c4269zQ, boolean z3) {
        Object obj = c4269zQ.f35333b.f29324v;
        C3246gQ c3246gQ = new C3246gQ();
        C3514lQ c3514lQ = new C3514lQ(-1, null, AbstractC3159eu.t(c4269zQ.i), AbstractC3159eu.t(this.f24136T));
        AP ap = this.f24152w;
        ap.a(new C4274ze(28, ap, c3246gQ, c3514lQ));
        if (z3) {
            return;
        }
        for (HQ hq : this.f24128L) {
            hq.k(false);
        }
        if (this.f24141Z > 0) {
            ?? r14 = this.f24126I;
            r14.getClass();
            r14.j(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3622nQ
    public final long h(InterfaceC3757q[] interfaceC3757qArr, boolean[] zArr, IQ[] iqArr, boolean[] zArr2, long j6) {
        boolean[] zArr3;
        InterfaceC3757q interfaceC3757q;
        x();
        ME me = this.f24134R;
        PQ pq = (PQ) me.f26270b;
        int i = this.f24141Z;
        int i6 = 0;
        while (true) {
            int length = interfaceC3757qArr.length;
            zArr3 = (boolean[]) me.f26272d;
            if (i6 >= length) {
                break;
            }
            IQ iq = iqArr[i6];
            if (iq != null && (interfaceC3757qArr[i6] == null || !zArr[i6])) {
                int i9 = ((AQ) iq).f23677a;
                AbstractC2772Sd.H(zArr3[i9]);
                this.f24141Z--;
                zArr3[i9] = false;
                iqArr[i6] = null;
            }
            i6++;
        }
        boolean z3 = !this.f24139W ? j6 == 0 || this.f24133Q : i != 0;
        for (int i10 = 0; i10 < interfaceC3757qArr.length; i10++) {
            if (iqArr[i10] == null && (interfaceC3757q = interfaceC3757qArr[i10]) != null) {
                AbstractC2772Sd.H(interfaceC3757q.d() == 1);
                AbstractC2772Sd.H(interfaceC3757q.v(0) == 0);
                int indexOf = pq.f26820b.indexOf(interfaceC3757q.c());
                if (indexOf < 0) {
                    indexOf = -1;
                }
                AbstractC2772Sd.H(!zArr3[indexOf]);
                this.f24141Z++;
                zArr3[indexOf] = true;
                this.Y = interfaceC3757q.i().f24437u | this.Y;
                iqArr[i10] = new AQ(this, indexOf);
                zArr2[i10] = true;
                if (!z3) {
                    HQ hq = this.f24128L[indexOf];
                    z3 = (hq.f25316p + hq.f25318r == 0 || hq.n(j6, true)) ? false : true;
                }
            }
        }
        if (this.f24141Z == 0) {
            this.f24146q0 = false;
            this.f24140X = false;
            this.Y = false;
            C4274ze c4274ze = this.f24120C;
            if (((E) c4274ze.f35361v) != null) {
                for (HQ hq2 : this.f24128L) {
                    hq2.o();
                }
                E e9 = (E) c4274ze.f35361v;
                e9.getClass();
                e9.a(false);
            } else {
                this.f24148s0 = false;
                for (HQ hq3 : this.f24128L) {
                    hq3.k(false);
                }
            }
        } else if (z3) {
            j6 = a(j6);
            for (int i11 = 0; i11 < iqArr.length; i11++) {
                if (iqArr[i11] != null) {
                    zArr2[i11] = true;
                }
            }
        }
        this.f24139W = true;
        return j6;
    }

    @Override // com.google.android.gms.internal.ads.JQ
    public final long i() {
        return f();
    }

    /* JADX WARN: Type inference failed for: r15v2, types: [com.google.android.gms.internal.ads.mQ, java.lang.Object] */
    public final void j(C4269zQ c4269zQ) {
        if (this.f24136T == com.anythink.basead.exoplayer.b.f6382b && this.f24135S != null) {
            long u3 = u(true);
            long j6 = u3 == Long.MIN_VALUE ? 0L : u3 + 10000;
            this.f24136T = j6;
            this.f24154y.s(j6, this.f24135S, this.f24137U);
        }
        Object obj = c4269zQ.f35333b.f29324v;
        C3246gQ c3246gQ = new C3246gQ();
        C3514lQ c3514lQ = new C3514lQ(-1, null, AbstractC3159eu.t(c4269zQ.i), AbstractC3159eu.t(this.f24136T));
        AP ap = this.f24152w;
        ap.a(new C3481ku(27, ap, c3246gQ, c3514lQ));
        this.f24148s0 = true;
        ?? r15 = this.f24126I;
        r15.getClass();
        r15.j(this);
    }

    @Override // com.google.android.gms.internal.ads.JQ
    public final void k(long j6) {
    }

    public final void l(int i) {
        x();
        ME me = this.f24134R;
        boolean[] zArr = (boolean[]) me.f26273e;
        if (zArr[i]) {
            return;
        }
        DP dp = ((PQ) me.f26270b).a(i).f23638d[0];
        C3514lQ c3514lQ = new C3514lQ(H4.f(dp.f24431o), dp, AbstractC3159eu.t(this.f24144o0), com.anythink.basead.exoplayer.b.f6382b);
        AP ap = this.f24152w;
        ap.a(new S0.s(26, ap, c3514lQ));
        zArr[i] = true;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [com.google.android.gms.internal.ads.mQ, java.lang.Object] */
    public final void m(int i) {
        x();
        if (this.f24146q0) {
            if ((!this.f24132P || ((boolean[]) this.f24134R.f26271c)[i]) && !this.f24128L[i].m(false)) {
                this.f24145p0 = 0L;
                this.f24146q0 = false;
                this.f24140X = true;
                this.f24144o0 = 0L;
                this.f24147r0 = 0;
                for (HQ hq : this.f24128L) {
                    hq.k(false);
                }
                ?? r52 = this.f24126I;
                r52.getClass();
                r52.j(this);
            }
        }
    }

    public final boolean n() {
        return this.f24140X || v();
    }

    public final InterfaceC3543m1 o(BQ bq) {
        int length = this.f24128L.length;
        for (int i = 0; i < length; i++) {
            if (bq.equals(this.f24129M[i])) {
                return this.f24128L[i];
            }
        }
        if (this.f24130N) {
            int i6 = bq.f23903a;
            StringBuilder sb = new StringBuilder(String.valueOf(i6).length() + 55);
            sb.append("Extractor added new track (id=");
            sb.append(i6);
            sb.append(") after finishing tracks.");
            AbstractC2968bG.y("ProgressiveMediaPeriod", sb.toString());
            return new O0();
        }
        HQ hq = new HQ(this.f24155z, this.f24151v, this.f24153x);
        C4215yQ c4215yQ = new C4215yQ(hq);
        hq.f25306e = this;
        int i9 = length + 1;
        BQ[] bqArr = (BQ[]) Arrays.copyOf(this.f24129M, i9);
        bqArr[length] = bq;
        String str = AbstractC3159eu.f29993a;
        this.f24129M = bqArr;
        HQ[] hqArr = (HQ[]) Arrays.copyOf(this.f24128L, i9);
        hqArr[length] = hq;
        this.f24128L = hqArr;
        C4215yQ[] c4215yQArr = (C4215yQ[]) Arrays.copyOf(this.f24127K, i9);
        c4215yQArr[length] = c4215yQ;
        this.f24127K = c4215yQArr;
        return c4215yQ;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3622nQ
    public final PQ p() {
        x();
        return (PQ) this.f24134R.f26270b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3622nQ
    public final void q() {
        IOException iOException;
        int i = this.f24138V == 7 ? 6 : 3;
        C4274ze c4274ze = this.f24120C;
        IOException iOException2 = (IOException) c4274ze.f35362w;
        if (iOException2 != null) {
            throw iOException2;
        }
        E e9 = (E) c4274ze.f35361v;
        if (e9 != null && (iOException = e9.f24512v) != null && e9.f24513w > i) {
            throw iOException;
        }
        if (this.f24148s0 && !this.f24131O) {
            throw U4.a(null, "Loading finished before preparation is complete.");
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.android.gms.internal.ads.mQ, java.lang.Object] */
    public final void r() {
        int i;
        if (this.f24149t0 || this.f24131O || !this.f24130N || this.f24135S == null) {
            return;
        }
        for (HQ hq : this.f24128L) {
            if (hq.l() == null) {
                return;
            }
        }
        C2781Sm c2781Sm = this.f24122E;
        synchronized (c2781Sm) {
            c2781Sm.f27548a = false;
        }
        int length = this.f24128L.length;
        int i6 = 0;
        int i9 = -1;
        for (int i10 = 0; i10 < length; i10++) {
            DP l9 = this.f24128L[i10].l();
            l9.getClass();
            int f3 = H4.f(l9.f24431o);
            char c9 = 2;
            char c10 = f3 != 1 ? f3 != 2 ? f3 != 3 ? f3 != 4 ? (char) 0 : (char) 2 : (char) 1 : (char) 4 : (char) 3;
            if (i9 == 1) {
                c9 = 3;
            } else if (i9 == 2) {
                c9 = 4;
            } else if (i9 == 3) {
                c9 = 1;
            } else if (i9 != 4) {
                c9 = 0;
            }
            if (c10 > c9) {
                i9 = f3;
            }
            if (c10 > c9) {
                i6 = i10;
            }
        }
        A8[] a8Arr = new A8[length];
        boolean[] zArr = new boolean[length];
        for (int i11 = 0; i11 < length; i11++) {
            DP l10 = this.f24128L[i11].l();
            l10.getClass();
            String str = l10.f24431o;
            boolean a9 = H4.a(str);
            boolean z3 = a9 || H4.b(str);
            zArr[i11] = z3;
            this.f24132P = z3 | this.f24132P;
            this.f24133Q = this.f24119B != com.anythink.basead.exoplayer.b.f6382b && length == 1 && H4.c(str);
            T1 t12 = this.J;
            if (t12 != null) {
                if (a9 || this.f24129M[i11].f23904b) {
                    O3 o32 = l10.f24428l;
                    O3 o33 = o32 == null ? new O3(t12) : o32.c(t12);
                    C3299hP c3299hP = new C3299hP(l10);
                    c3299hP.f30789k = o33;
                    l10 = new DP(c3299hP);
                }
                if (a9 && l10.f24425h == -1 && l10.i == -1 && (i = t12.f27672a) != -1) {
                    C3299hP c3299hP2 = new C3299hP(l10);
                    c3299hP2.f30787h = i;
                    l10 = new DP(c3299hP2);
                }
            }
            this.f24151v.getClass();
            int i12 = l10.f24435s != null ? 1 : 0;
            C3299hP c3299hP3 = new C3299hP(l10);
            c3299hP3.f30779O = i12;
            DP dp = new DP(c3299hP3);
            if (i11 != i6) {
                C3299hP c3299hP4 = new C3299hP(dp);
                c3299hP4.f30790l = Integer.toString(i6);
                dp = new DP(c3299hP4);
            }
            a8Arr[i11] = new A8(Integer.toString(i11), dp);
            this.Y = dp.f24437u | this.Y;
            HQ hq2 = this.f24128L[i11];
            synchronized (hq2) {
                if (hq2.f25320t != Long.MIN_VALUE) {
                    hq2.f25320t = Long.MIN_VALUE;
                    hq2.f25323w = -1;
                    hq2.f25324x = -1;
                }
            }
        }
        this.f24134R = new ME(new PQ(a8Arr), zArr);
        if (this.f24133Q && this.f24136T == com.anythink.basead.exoplayer.b.f6382b) {
            this.f24136T = this.f24119B;
            this.f24135S = new C4107wQ(this, this.f24135S);
        }
        this.f24154y.s(this.f24136T, this.f24135S, this.f24137U);
        this.f24131O = true;
        ?? r02 = this.f24126I;
        r02.getClass();
        r02.g(this);
    }

    public final void s() {
        C4269zQ c4269zQ = new C4269zQ(this, this.f24142n, this.f24150u, this.f24121D, this, this.f24122E);
        if (this.f24131O) {
            AbstractC2772Sd.H(v());
            long j6 = this.f24136T;
            if (j6 != com.anythink.basead.exoplayer.b.f6382b && this.f24145p0 > j6) {
                this.f24148s0 = true;
                this.f24145p0 = com.anythink.basead.exoplayer.b.f6382b;
                return;
            }
            InterfaceC3113e1 interfaceC3113e1 = this.f24135S;
            interfaceC3113e1.getClass();
            C3167f1 c3167f1 = interfaceC3113e1.b(this.f24145p0).f29660a;
            long j9 = this.f24145p0;
            c4269zQ.f35337f.f27844n = c3167f1.f30014b;
            c4269zQ.i = j9;
            c4269zQ.f35339h = true;
            c4269zQ.f35342l = false;
            for (HQ hq : this.f24128L) {
                hq.f25319s = this.f24145p0;
            }
            this.f24145p0 = com.anythink.basead.exoplayer.b.f6382b;
        }
        this.f24147r0 = t();
        C4274ze c4274ze = this.f24120C;
        c4274ze.getClass();
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        c4274ze.f35362w = null;
        E e9 = new E(c4274ze, myLooper, c4269zQ, this, SystemClock.elapsedRealtime());
        C4274ze c4274ze2 = e9.f24509A;
        AbstractC2772Sd.H(((E) c4274ze2.f35361v) == null);
        c4274ze2.f35361v = e9;
        e9.b();
    }

    public final int t() {
        int i = 0;
        for (HQ hq : this.f24128L) {
            i += hq.f25316p + hq.f25315o;
        }
        return i;
    }

    public final long u(boolean z3) {
        long j6;
        int i = 0;
        long j9 = Long.MIN_VALUE;
        while (true) {
            HQ[] hqArr = this.f24128L;
            if (i >= hqArr.length) {
                return j9;
            }
            if (!z3) {
                ME me = this.f24134R;
                me.getClass();
                if (!((boolean[]) me.f26272d)[i]) {
                    continue;
                    i++;
                }
            }
            HQ hq = hqArr[i];
            synchronized (hq) {
                j6 = hq.f25322v;
            }
            j9 = Math.max(j9, j6);
            i++;
        }
    }

    public final boolean v() {
        return this.f24145p0 != com.anythink.basead.exoplayer.b.f6382b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3622nQ
    public final long w() {
        if (this.Y) {
            this.Y = false;
        } else {
            if (!this.f24140X) {
                return com.anythink.basead.exoplayer.b.f6382b;
            }
            if (!this.f24148s0 && t() <= this.f24147r0) {
                return com.anythink.basead.exoplayer.b.f6382b;
            }
            this.f24140X = false;
        }
        return this.f24144o0;
    }

    public final void x() {
        AbstractC2772Sd.H(this.f24131O);
        this.f24134R.getClass();
        this.f24135S.getClass();
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class VN implements Handler.Callback, InterfaceC3568mQ, InterfaceC3620nO, InterfaceC3328i0 {

    /* renamed from: K0, reason: collision with root package name */
    public static final long f28137K0 = AbstractC3159eu.t(10000);

    /* renamed from: A, reason: collision with root package name */
    public final R5 f28138A;

    /* renamed from: A0, reason: collision with root package name */
    public long f28139A0;

    /* renamed from: B, reason: collision with root package name */
    public final Looper f28140B;

    /* renamed from: B0, reason: collision with root package name */
    public int f28141B0;

    /* renamed from: C, reason: collision with root package name */
    public final U7 f28142C;
    public boolean C0;

    /* renamed from: D, reason: collision with root package name */
    public final K7 f28143D;

    /* renamed from: D0, reason: collision with root package name */
    public DN f28144D0;

    /* renamed from: E, reason: collision with root package name */
    public final long f28145E;

    /* renamed from: E0, reason: collision with root package name */
    public long f28146E0;

    /* renamed from: F, reason: collision with root package name */
    public final Is f28147F;

    /* renamed from: F0, reason: collision with root package name */
    public FN f28148F0;

    /* renamed from: G, reason: collision with root package name */
    public final ArrayList f28149G;

    /* renamed from: G0, reason: collision with root package name */
    public long f28150G0;

    /* renamed from: H, reason: collision with root package name */
    public final V2 f28151H;

    /* renamed from: H0, reason: collision with root package name */
    public boolean f28152H0;

    /* renamed from: I, reason: collision with root package name */
    public final C3534lt f28153I;

    /* renamed from: I0, reason: collision with root package name */
    public float f28154I0;
    public final C3136eO J;

    /* renamed from: J0, reason: collision with root package name */
    public final C4266zN f28155J0;

    /* renamed from: K, reason: collision with root package name */
    public final E3.m f28156K;

    /* renamed from: L, reason: collision with root package name */
    public final long f28157L;

    /* renamed from: M, reason: collision with root package name */
    public final IO f28158M;

    /* renamed from: N, reason: collision with root package name */
    public final boolean f28159N;

    /* renamed from: O, reason: collision with root package name */
    public final BO f28160O;

    /* renamed from: P, reason: collision with root package name */
    public final C3212ft f28161P;

    /* renamed from: Q, reason: collision with root package name */
    public final boolean f28162Q;

    /* renamed from: R, reason: collision with root package name */
    public final Cif f28163R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f28164S;

    /* renamed from: T, reason: collision with root package name */
    public C3997uO f28165T;

    /* renamed from: U, reason: collision with root package name */
    public C3943tO f28166U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f28167V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f28168W;

    /* renamed from: X, reason: collision with root package name */
    public UN f28169X;
    public int Y;

    /* renamed from: Z, reason: collision with root package name */
    public C3566mO f28170Z;

    /* renamed from: n, reason: collision with root package name */
    public final D0.H[] f28171n;

    /* renamed from: n0, reason: collision with root package name */
    public C4085w4 f28172n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f28173o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f28174p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f28175q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f28176r0;

    /* renamed from: s0, reason: collision with root package name */
    public long f28177s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f28178t0;

    /* renamed from: u, reason: collision with root package name */
    public final RP[] f28179u;

    /* renamed from: u0, reason: collision with root package name */
    public int f28180u0;

    /* renamed from: v, reason: collision with root package name */
    public final boolean[] f28181v;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f28182v0;

    /* renamed from: w, reason: collision with root package name */
    public final C3649o f28183w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f28184w0;

    /* renamed from: x, reason: collision with root package name */
    public final C3918t f28185x;

    /* renamed from: x0, reason: collision with root package name */
    public int f28186x0;

    /* renamed from: y, reason: collision with root package name */
    public final YN f28187y;

    /* renamed from: y0, reason: collision with root package name */
    public UN f28188y0;

    /* renamed from: z, reason: collision with root package name */
    public final C3212ft f28189z;

    /* renamed from: z0, reason: collision with root package name */
    public long f28190z0;

    public VN(Context context, RP[] rpArr, RP[] rpArr2, C3649o c3649o, C3918t c3918t, YN yn, InterfaceC4188y interfaceC4188y, BO bo, C3997uO c3997uO, C4266zN c4266zN, long j6, boolean z3, Looper looper, V2 v22, C3534lt c3534lt, IO io, boolean z6) {
        Looper looper2;
        FN fn = FN.f24796a;
        this.f28150G0 = com.anythink.basead.exoplayer.b.f6382b;
        this.f28153I = c3534lt;
        this.f28183w = c3649o;
        this.f28185x = c3918t;
        this.f28187y = yn;
        boolean z9 = false;
        this.f28180u0 = 0;
        this.f28182v0 = false;
        this.f28165T = c3997uO;
        this.f28155J0 = c4266zN;
        this.f28157L = j6;
        this.f28174p0 = false;
        this.f28159N = z3;
        this.f28151H = v22;
        this.f28158M = io;
        this.f28148F0 = fn;
        this.f28160O = bo;
        this.f28154I0 = 1.0f;
        this.f28166U = C3943tO.f34276b;
        this.f28164S = z6;
        this.f28146E0 = com.anythink.basead.exoplayer.b.f6382b;
        this.f28177s0 = com.anythink.basead.exoplayer.b.f6382b;
        this.f28145E = yn.e();
        C3980u7 c3980u7 = AbstractC3604n8.f32690a;
        C3566mO a9 = C3566mO.a(c3918t);
        this.f28170Z = a9;
        this.f28172n0 = new C4085w4(a9);
        int length = rpArr.length;
        this.f28179u = new RP[2];
        this.f28181v = new boolean[2];
        c3649o.getClass();
        this.f28171n = new D0.H[2];
        boolean z10 = false;
        for (int i = 0; i < 2; i++) {
            RP rp = rpArr[i];
            rp.f27278x = i;
            rp.f27280y = io;
            rp.f27282z = v22;
            RP[] rpArr3 = this.f28179u;
            rp.getClass();
            rpArr3[i] = rp;
            RP rp2 = this.f28179u[i];
            synchronized (rp2.f27264n) {
                rp2.f27226L = c3649o;
            }
            RP rp3 = rpArr2[i];
            if (rp3 != null) {
                rp3.f27278x = i;
                rp3.f27280y = io;
                rp3.f27282z = v22;
                z10 = true;
            }
            D0.H[] hArr = this.f28171n;
            RP rp4 = rpArr[i];
            D0.H h9 = new D0.H();
            h9.f539e = rp4;
            h9.f535a = i;
            h9.f540f = rp3;
            h9.f536b = 0;
            h9.f537c = false;
            h9.f538d = false;
            hArr[i] = h9;
        }
        this.f28162Q = z10;
        this.f28147F = new Is(this);
        this.f28149G = new ArrayList();
        this.f28142C = new U7();
        this.f28143D = new K7();
        AbstractC2772Sd.H(c3649o.f32823a == null);
        c3649o.f32823a = this;
        c3649o.f32824b = interfaceC4188y;
        this.C0 = true;
        C3212ft x9 = v22.x(looper, null);
        this.f28161P = x9;
        this.J = new C3136eO(bo, x9, new C4019ut(11, this));
        this.f28156K = new E3.m(this, bo, x9, io, interfaceC4188y);
        R5 r52 = new R5();
        r52.f27173u = new Object();
        r52.f27174v = null;
        r52.f27175w = null;
        r52.f27172n = 0;
        this.f28138A = r52;
        synchronized (r52.f27173u) {
            try {
                if (((Looper) r52.f27174v) == null) {
                    if (r52.f27172n == 0 && ((HandlerThread) r52.f27175w) == null) {
                        z9 = true;
                    }
                    AbstractC2772Sd.H(z9);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    r52.f27175w = handlerThread;
                    handlerThread.start();
                    r52.f27174v = ((HandlerThread) r52.f27175w).getLooper();
                }
                r52.f27172n++;
                looper2 = (Looper) r52.f27174v;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f28140B = looper2;
        C3212ft x10 = v22.x(looper2, this);
        this.f28189z = x10;
        this.f28163R = new Cif(context, looper2, this);
        x10.b(35, new InterfaceC3328i0() { // from class: com.google.android.gms.internal.ads.RN
            @Override // com.google.android.gms.internal.ads.InterfaceC3328i0
            public final /* synthetic */ void a(long j9, long j10, DP dp, MediaFormat mediaFormat) {
                VN.this.a(j9, j10, dp, mediaFormat);
            }
        }).a();
        x10.b(39, new SN()).a();
    }

    public static final boolean A(C3029cO c3029cO) {
        if (c3029cO != null) {
            try {
                C3300hQ c3300hQ = c3029cO.f29473a;
                if (c3029cO.f29477e) {
                    IQ[] iqArr = c3029cO.f29475c;
                    for (int i = 0; i < 2; i++) {
                        IQ iq = iqArr[i];
                        if (iq != null) {
                            iq.f();
                        }
                    }
                } else {
                    c3300hQ.q();
                }
                if ((!c3029cO.f29477e ? 0L : c3300hQ.i()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public static int W(U7 u72, K7 k72, int i, boolean z3, Object obj, AbstractC3604n8 abstractC3604n8, AbstractC3604n8 abstractC3604n82) {
        U7 u73 = u72;
        AbstractC3604n8 abstractC3604n83 = abstractC3604n8;
        Object obj2 = abstractC3604n83.b(abstractC3604n83.o(obj, k72).f25867c, u72, 0L).f27893a;
        for (int i6 = 0; i6 < abstractC3604n82.a(); i6++) {
            if (abstractC3604n82.b(i6, u72, 0L).f27893a.equals(obj2)) {
                return i6;
            }
        }
        int e9 = abstractC3604n83.e(obj);
        int c9 = abstractC3604n83.c();
        int i9 = -1;
        int i10 = 0;
        while (true) {
            if (i10 >= c9 || i9 != -1) {
                break;
            }
            AbstractC3604n8 abstractC3604n84 = abstractC3604n83;
            int l9 = abstractC3604n84.l(e9, k72, u73, i, z3);
            if (l9 == -1) {
                i9 = -1;
                break;
            }
            i9 = abstractC3604n82.e(abstractC3604n84.f(l9));
            i10++;
            abstractC3604n83 = abstractC3604n84;
            e9 = l9;
            u73 = u72;
        }
        if (i9 == -1) {
            return -1;
        }
        return abstractC3604n82.d(i9, k72, false).f25867c;
    }

    public static Pair z(AbstractC3604n8 abstractC3604n8, UN un, int i, boolean z3, U7 u72, K7 k72) {
        AbstractC3604n8 abstractC3604n82 = un.f27921a;
        if (abstractC3604n8.g()) {
            return null;
        }
        AbstractC3604n8 abstractC3604n83 = true == abstractC3604n82.g() ? abstractC3604n8 : abstractC3604n82;
        try {
            Pair m4 = abstractC3604n83.m(u72, k72, un.f27922b, un.f27923c);
            if (!abstractC3604n8.equals(abstractC3604n83)) {
                if (abstractC3604n8.e(m4.first) == -1) {
                    int W8 = W(u72, k72, i, z3, m4.first, abstractC3604n83, abstractC3604n8);
                    if (W8 != -1) {
                        return abstractC3604n8.m(u72, k72, W8, com.anythink.basead.exoplayer.b.f6382b);
                    }
                    return null;
                }
                if (abstractC3604n83.o(m4.first, k72).f25869e && abstractC3604n83.b(k72.f25867c, u72, 0L).f27902k == abstractC3604n83.e(m4.first)) {
                    return abstractC3604n8.m(u72, k72, abstractC3604n8.o(m4.first, k72).f25867c, un.f27923c);
                }
            }
            return m4;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public final void B() {
        for (int i = 0; i < 2; i++) {
            D0.H[] hArr = this.f28171n;
            int r9 = hArr[i].r();
            D0.H h9 = hArr[i];
            RP rp = (RP) h9.f539e;
            Is is = this.f28147F;
            h9.i(rp, is);
            RP rp2 = (RP) h9.f540f;
            if (rp2 != null) {
                boolean z3 = (rp2.f27206A == 0 || h9.f536b == 3) ? false : true;
                h9.i(rp2, is);
                h9.j(false);
                if (z3) {
                    rp2.getClass();
                    rp2.b(17, (RP) h9.f539e);
                }
            }
            h9.f536b = 0;
            m(i, false);
            this.f28186x0 -= r9;
        }
        this.f28150G0 = com.anythink.basead.exoplayer.b.f6382b;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a A[Catch: RuntimeException -> 0x0044, TryCatch #1 {RuntimeException -> 0x0044, blocks: (B:38:0x0035, B:18:0x0040, B:16:0x003a, B:30:0x0047), top: B:37:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0035 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C() {
        boolean z3;
        RP rp;
        if (!this.f28162Q || !V()) {
            return;
        }
        int i = 0;
        while (true) {
            int i6 = 2;
            if (i >= 2) {
                this.f28150G0 = com.anythink.basead.exoplayer.b.f6382b;
                return;
            }
            D0.H h9 = this.f28171n[i];
            int r9 = h9.r();
            Is is = this.f28147F;
            if (h9.q()) {
                int i9 = h9.f536b;
                if (i9 == 4) {
                    i6 = i9;
                } else if (i9 != 2) {
                    i6 = i9;
                    z3 = false;
                    if (z3) {
                        rp = (RP) h9.f540f;
                        if (rp == null) {
                            throw null;
                        }
                        h9.i(rp, is);
                        h9.j(z3);
                        h9.f536b = i6 != 4 ? 0 : 1;
                    } else {
                        try {
                            rp = (RP) h9.f539e;
                            h9.i(rp, is);
                        } catch (RuntimeException e9) {
                            AbstractC2968bG.J("RendererHolder", "Disable prewarming failed.", e9);
                        }
                        try {
                            h9.j(z3);
                        } catch (RuntimeException e10) {
                            AbstractC2968bG.J("RendererHolder", "Reset prewarming failed.", e10);
                        }
                        h9.f536b = i6 != 4 ? 0 : 1;
                    }
                }
                z3 = true;
                if (z3) {
                }
            }
            this.f28186x0 -= r9 - h9.r();
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D() {
        int i;
        int i6;
        int i9;
        Is is = this.f28147F;
        float f3 = is.j().f34216a;
        C3136eO c3136eO = this.J;
        C3029cO c3029cO = c3136eO.f29921h;
        C3029cO c3029cO2 = c3136eO.i;
        C3918t c3918t = null;
        C3029cO c3029cO3 = c3029cO;
        boolean z3 = true;
        while (c3029cO3 != null && c3029cO3.f29477e) {
            C3918t f9 = c3029cO3.f(this.f28170Z.f31948a);
            C3918t c3918t2 = c3029cO3 == c3136eO.f29921h ? f9 : c3918t;
            C3918t c3918t3 = c3029cO3.f29486o;
            boolean z6 = false;
            if (c3918t3 != null) {
                InterfaceC3757q[] interfaceC3757qArr = (InterfaceC3757q[]) f9.f34179v;
                if (((InterfaceC3757q[]) c3918t3.f34179v).length == interfaceC3757qArr.length) {
                    for (int i10 = 0; i10 < interfaceC3757qArr.length; i10++) {
                        if (f9.d(c3918t3, i10)) {
                        }
                    }
                    if (c3029cO3 != c3029cO2) {
                        z6 = true;
                    }
                    z3 &= z6;
                    c3029cO3 = c3029cO3.f29484m;
                    c3918t = c3918t2;
                }
            }
            if (z3) {
                C3029cO c3029cO4 = c3136eO.f29921h;
                int y7 = c3136eO.y(c3029cO4) & 1;
                D0.H[] hArr = this.f28171n;
                boolean[] zArr = new boolean[2];
                c3918t2.getClass();
                long g4 = c3029cO4.g(c3918t2, this.f28170Z.f31964r, 1 == y7, zArr);
                C3566mO c3566mO = this.f28170Z;
                boolean z9 = (c3566mO.f31952e == 4 || g4 == c3566mO.f31964r) ? false : true;
                C3566mO c3566mO2 = this.f28170Z;
                boolean z10 = z9;
                i = 4;
                this.f28170Z = N(c3566mO2.f31949b, g4, c3566mO2.f31950c, c3566mO2.f31951d, z10, 5);
                if (z10) {
                    s(g4, true);
                }
                C();
                boolean[] zArr2 = new boolean[2];
                int i11 = 0;
                for (int i12 = 2; i11 < i12; i12 = 2) {
                    int r9 = hArr[i11].r();
                    zArr2[i11] = hArr[i11].g();
                    D0.H h9 = hArr[i11];
                    IQ iq = c3029cO4.f29475c[i11];
                    long j6 = this.f28190z0;
                    boolean z11 = zArr[i11];
                    RP rp = (RP) h9.f539e;
                    if (D0.H.l(rp)) {
                        if (iq != rp.f27208B) {
                            h9.i(rp, is);
                        } else if (z11) {
                            rp.N(j6, false, true);
                        }
                    }
                    RP rp2 = (RP) h9.f540f;
                    if (rp2 != null && D0.H.l(rp2)) {
                        if (iq != rp2.f27208B) {
                            h9.i(rp2, is);
                        } else if (z11) {
                            rp2.N(j6, false, true);
                        }
                    }
                    if (r9 - hArr[i11].r() > 0) {
                        m(i11, false);
                    }
                    this.f28186x0 -= r9 - hArr[i11].r();
                    i11++;
                }
                O(zArr2, this.f28190z0);
                c3029cO4.f29480h = true;
            } else {
                i = 4;
                c3136eO.y(c3029cO3);
                if (c3029cO3.f29477e) {
                    long max = Math.max(c3029cO3.f29479g.f29761b, this.f28190z0 - c3029cO3.f29487p);
                    if (this.f28162Q && V() && c3136eO.f29922j == c3029cO3) {
                        C();
                    }
                    i6 = 2;
                    i9 = 4;
                    c3029cO3.g(f9, max, false, new boolean[2]);
                    Q(true);
                    if (this.f28170Z.f31952e == i9) {
                        L();
                        l();
                        this.f28189z.c(i6);
                        return;
                    }
                    return;
                }
            }
            i9 = i;
            i6 = 2;
            Q(true);
            if (this.f28170Z.f31952e == i9) {
            }
        }
    }

    public final boolean E() {
        C3029cO c3029cO = this.J.f29921h;
        long j6 = c3029cO.f29479g.f29764e;
        if (c3029cO.f29477e) {
            return j6 == com.anythink.basead.exoplayer.b.f6382b || this.f28170Z.f31964r < j6 || !T();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:250:0x0262, code lost:
    
        r13.f25870f.getClass();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03bd A[Catch: all -> 0x03c3, TRY_ENTER, TryCatch #3 {all -> 0x03c3, blocks: (B:118:0x03bd, B:119:0x03cb, B:121:0x03d1, B:59:0x03e5, B:83:0x03f4, B:85:0x03fe, B:87:0x0406), top: B:57:0x037b }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03cb A[Catch: all -> 0x03c3, TryCatch #3 {all -> 0x03c3, blocks: (B:118:0x03bd, B:119:0x03cb, B:121:0x03d1, B:59:0x03e5, B:83:0x03f4, B:85:0x03fe, B:87:0x0406), top: B:57:0x037b }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0432  */
    /* JADX WARN: Type inference failed for: r12v3, types: [int] */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r4v78 */
    /* JADX WARN: Type inference failed for: r4v79 */
    /* JADX WARN: Type inference failed for: r4v81 */
    /* JADX WARN: Type inference failed for: r4v82 */
    /* JADX WARN: Type inference failed for: r4v83 */
    /* JADX WARN: Type inference failed for: r4v86 */
    /* JADX WARN: Type inference failed for: r8v23, types: [com.google.android.gms.internal.ads.RP] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(AbstractC3604n8 abstractC3604n8, boolean z3) {
        long j6;
        boolean z6;
        boolean z9;
        long j9;
        K7 k72;
        C3676oQ c3676oQ;
        AbstractC3604n8 abstractC3604n82;
        int i;
        Object obj;
        long j10;
        int i6;
        long j11;
        boolean z10;
        int i9;
        boolean z11;
        boolean z12;
        boolean z13;
        K7 k73;
        Object obj2;
        long j12;
        C3676oQ E8;
        AbstractC3604n8 abstractC3604n83;
        int i10;
        C3676oQ c3676oQ2;
        int i11;
        int i12;
        boolean z14;
        boolean z15;
        long j13;
        long j14;
        boolean z16;
        int i13;
        Object obj3;
        K7 k74;
        boolean z17;
        C3676oQ c3676oQ3;
        long j15;
        boolean z18;
        boolean z19;
        boolean z20;
        ?? r82;
        boolean z21;
        int i14;
        AbstractC3604n8 abstractC3604n84;
        int i15;
        int i16;
        int[] iArr;
        int i17;
        Object obj4;
        long longValue;
        int i18;
        boolean z22;
        boolean z23;
        long j16;
        boolean z24;
        boolean z25;
        ?? r42;
        boolean z26;
        AbstractC3604n8 abstractC3604n85;
        C3676oQ c3676oQ4;
        UN un;
        boolean z27;
        int i19;
        boolean z28;
        long j17;
        long j18;
        UN un2;
        boolean z29;
        ?? r13;
        long H8;
        boolean z30;
        int C8;
        UN un3;
        boolean z31;
        long j19;
        long j20;
        UN un4;
        boolean z32;
        C3136eO c3136eO;
        long j21;
        boolean z33;
        C3566mO c3566mO = this.f28170Z;
        UN un5 = this.f28188y0;
        K7 k75 = this.f28143D;
        int i20 = this.f28180u0;
        boolean z34 = this.f28182v0;
        boolean z35 = this.f28164S;
        if (abstractC3604n8.g()) {
            C3676oQ c3676oQ5 = C3566mO.f31947t;
            C3676oQ c3676oQ6 = c3566mO.f31949b;
            boolean z36 = (c3676oQ5.equals(c3676oQ6) && c3566mO.f31964r == 0) ? false : true;
            if (z36 && z3) {
                AbstractC3604n8 abstractC3604n86 = c3566mO.f31948a;
                if (!abstractC3604n86.g() && !abstractC3604n86.o(c3676oQ6.f32905a, k75).f25869e) {
                    z33 = true;
                    c3676oQ3 = c3676oQ5;
                    i14 = 4;
                    j15 = 0;
                    j13 = 0;
                    z19 = false;
                    r82 = 1;
                    z21 = false;
                    j6 = com.anythink.basead.exoplayer.b.f6382b;
                    j12 = com.anythink.basead.exoplayer.b.f6382b;
                    abstractC3604n83 = abstractC3604n8;
                    z20 = z33;
                    z18 = z36;
                }
            }
            z33 = false;
            c3676oQ3 = c3676oQ5;
            i14 = 4;
            j15 = 0;
            j13 = 0;
            z19 = false;
            r82 = 1;
            z21 = false;
            j6 = com.anythink.basead.exoplayer.b.f6382b;
            j12 = com.anythink.basead.exoplayer.b.f6382b;
            abstractC3604n83 = abstractC3604n8;
            z20 = z33;
            z18 = z36;
        } else {
            C3676oQ c3676oQ7 = c3566mO.f31949b;
            Object obj5 = c3676oQ7.f32905a;
            AbstractC3604n8 abstractC3604n87 = c3566mO.f31948a;
            if (abstractC3604n87.g()) {
                j6 = com.anythink.basead.exoplayer.b.f6382b;
            } else {
                j6 = com.anythink.basead.exoplayer.b.f6382b;
                if (!abstractC3604n87.o(c3676oQ7.f32905a, k75).f25869e) {
                    z6 = false;
                    if (!c3676oQ7.b() || z6) {
                        z9 = z6;
                        j9 = c3566mO.f31950c;
                    } else {
                        z9 = z6;
                        j9 = c3566mO.f31964r;
                    }
                    U7 u72 = this.f28142C;
                    if (un5 == null) {
                        c3676oQ = c3676oQ7;
                        abstractC3604n82 = abstractC3604n8;
                        Pair z37 = z(abstractC3604n82, un5, i20, z34, u72, k75);
                        if (z37 == null) {
                            i18 = abstractC3604n82.k(z34);
                            obj4 = obj5;
                            j16 = j9;
                            z25 = true;
                            z23 = false;
                            z24 = false;
                        } else {
                            if (un5.f27923c == j6) {
                                i18 = abstractC3604n82.o(z37.first, k75).f25867c;
                                obj4 = obj5;
                                longValue = j9;
                                z22 = false;
                            } else {
                                obj4 = z37.first;
                                longValue = ((Long) z37.second).longValue();
                                i18 = -1;
                                z22 = true;
                            }
                            z23 = c3566mO.f31952e == 4;
                            j16 = longValue;
                            z24 = z22;
                            z25 = false;
                        }
                        z12 = z25;
                        j10 = j16;
                        i = 1;
                        i6 = i18;
                        z10 = z24;
                        obj = obj4;
                        k72 = k75;
                        z11 = z23;
                        i9 = -1;
                    } else {
                        k72 = k75;
                        c3676oQ = c3676oQ7;
                        abstractC3604n82 = abstractC3604n8;
                        AbstractC3604n8 abstractC3604n88 = c3566mO.f31948a;
                        if (abstractC3604n88.g()) {
                            i6 = abstractC3604n82.k(z34);
                            obj = obj5;
                            j10 = j9;
                            i9 = -1;
                            z11 = false;
                            i = 1;
                        } else if (abstractC3604n82.e(obj5) == -1) {
                            i = 1;
                            int W8 = W(u72, k72, i20, z34, obj5, abstractC3604n88, abstractC3604n82);
                            u72 = u72;
                            abstractC3604n82 = abstractC3604n82;
                            obj5 = obj5;
                            if (W8 == -1) {
                                i6 = abstractC3604n82.k(z34);
                                z13 = true;
                            } else {
                                i6 = W8;
                                z13 = false;
                            }
                            z12 = z13;
                            obj = obj5;
                            j10 = j9;
                            i9 = -1;
                            z11 = false;
                            z10 = false;
                        } else {
                            i = 1;
                            if (j9 == j6) {
                                i6 = abstractC3604n82.o(obj5, k72).f25867c;
                                obj = obj5;
                                j10 = j9;
                            } else if (z9) {
                                abstractC3604n88.o(obj5, k72);
                                if (abstractC3604n88.b(k72.f25867c, u72, 0L).f27902k == abstractC3604n88.e(obj5)) {
                                    Pair m4 = abstractC3604n82.m(u72, k72, abstractC3604n82.o(obj5, k72).f25867c, j9);
                                    u72 = u72;
                                    k72 = k72;
                                    obj = m4.first;
                                    j11 = ((Long) m4.second).longValue();
                                } else if (abstractC3604n82.o(obj5, k72).f25868d != j6) {
                                    long j22 = k72.f25868d - 1;
                                    String str = AbstractC3159eu.f29993a;
                                    j11 = Math.max(0L, Math.min(j9, j22));
                                    obj = obj5;
                                } else {
                                    obj = obj5;
                                    j11 = j9;
                                }
                                j10 = j11;
                                z10 = true;
                                i6 = -1;
                                i9 = -1;
                                z11 = false;
                                z12 = false;
                            } else {
                                obj = obj5;
                                j10 = j9;
                                i6 = -1;
                            }
                            i9 = -1;
                            z11 = false;
                        }
                        z12 = false;
                        z10 = false;
                    }
                    if (i6 == i9) {
                        K7 k76 = k72;
                        Pair m9 = abstractC3604n82.m(u72, k76, i6, com.anythink.basead.exoplayer.b.f6382b);
                        k73 = k76;
                        Object obj6 = m9.first;
                        j10 = ((Long) m9.second).longValue();
                        obj2 = obj6;
                        j12 = j6;
                    } else {
                        k73 = k72;
                        obj2 = obj;
                        j12 = j10;
                    }
                    long j23 = j9;
                    long j24 = j10;
                    E8 = this.J.E(c3566mO, abstractC3604n8, obj2, z35, z9);
                    abstractC3604n83 = abstractC3604n8;
                    i10 = E8.f32909e;
                    if (i10 == -1) {
                        c3676oQ2 = c3676oQ;
                        int i21 = c3676oQ2.f32909e;
                        if (i21 == -1 || i10 < i21) {
                            i11 = 0;
                            boolean equals = obj5.equals(obj2);
                            i12 = (equals || c3676oQ2.b() || E8.b() || i11 == 0) ? 0 : i;
                            K7 o6 = abstractC3604n83.o(obj2, k73);
                            z14 = z6;
                            if (!z9) {
                                ?? r12 = (j23 > j12 ? 1 : (j23 == j12 ? 0 : -1));
                                z14 = r12;
                                if (r12 == 0) {
                                    boolean equals2 = obj5.equals(E8.f32905a);
                                    z14 = equals2;
                                    if (equals2) {
                                        if (c3676oQ2.b()) {
                                            o6.c(c3676oQ2.f32906b);
                                        }
                                        boolean b9 = E8.b();
                                        z14 = b9;
                                        if (b9) {
                                            int i22 = E8.f32906b;
                                            o6.c(i22);
                                            z14 = i22;
                                        }
                                    }
                                }
                            }
                            if (i == i12) {
                                E8 = c3676oQ2;
                            }
                            if (E8.b()) {
                                if (E8.equals(c3676oQ2)) {
                                    j14 = c3566mO.f31964r;
                                    z15 = z11;
                                } else {
                                    abstractC3604n83.o(E8.f32905a, k73);
                                    int i23 = E8.f32907c;
                                    C2897a a9 = k73.f25870f.a(E8.f32906b);
                                    int i24 = 0;
                                    while (true) {
                                        int[] iArr2 = a9.f28986d;
                                        if (i24 >= iArr2.length || (i17 = iArr2[i24]) == 0 || i17 == i) {
                                            break;
                                        } else {
                                            i24 += i;
                                        }
                                    }
                                    z15 = z11;
                                    j14 = 0;
                                }
                                j13 = 0;
                            } else {
                                if (equals && c3676oQ2.b()) {
                                    C2897a a10 = abstractC3604n83.o(obj2, k73).f25870f.a(c3676oQ2.f32906b);
                                    a10.getClass();
                                    z15 = z11;
                                    long j25 = c3566mO.f31950c;
                                    j13 = 0;
                                    if (j25 == j6 || j25 < 0) {
                                        int i25 = a10.f28983a;
                                        int i26 = c3676oQ2.f32907c;
                                        if (i25 > i26 && a10.f28986d[i26] == 2) {
                                            long j26 = abstractC3604n83.o(obj2, k73).f25868d;
                                            j14 = j26 != j6 ? Math.min(j26 - 1, j24) : j24;
                                            j12 = j14;
                                        }
                                    }
                                } else {
                                    z15 = z11;
                                    j13 = 0;
                                }
                                j14 = j24;
                            }
                            z16 = E8.equals(c3676oQ2) || j14 != c3566mO.f31964r;
                            i13 = abstractC3604n83.e(obj5) == -1 ? 4 : 3;
                            obj3 = E8.f32905a;
                            if (obj3.equals(obj5) && (i15 = E8.f32906b) != -1) {
                                C2897a a11 = abstractC3604n83.o(obj3, k73).f25870f.a(i15);
                                i16 = E8.f32907c;
                                iArr = a11.f28986d;
                                if (i16 < iArr.length || iArr[i16] != 2) {
                                    k74 = k73;
                                    i13 = 0;
                                    if (z16 && z3) {
                                        abstractC3604n84 = c3566mO.f31948a;
                                        if (!abstractC3604n84.g() && !abstractC3604n84.o(obj5, k74).f25869e) {
                                            z17 = true;
                                            c3676oQ3 = E8;
                                            j15 = j14;
                                            z18 = z16;
                                            z19 = z15;
                                            z20 = z17;
                                            r82 = z12;
                                            z21 = z10;
                                            i14 = i13;
                                        }
                                    }
                                    z17 = false;
                                    c3676oQ3 = E8;
                                    j15 = j14;
                                    z18 = z16;
                                    z19 = z15;
                                    z20 = z17;
                                    r82 = z12;
                                    z21 = z10;
                                    i14 = i13;
                                }
                            }
                            k74 = k73;
                            if (z16) {
                                abstractC3604n84 = c3566mO.f31948a;
                                if (!abstractC3604n84.g()) {
                                    z17 = true;
                                    c3676oQ3 = E8;
                                    j15 = j14;
                                    z18 = z16;
                                    z19 = z15;
                                    z20 = z17;
                                    r82 = z12;
                                    z21 = z10;
                                    i14 = i13;
                                }
                            }
                            z17 = false;
                            c3676oQ3 = E8;
                            j15 = j14;
                            z18 = z16;
                            z19 = z15;
                            z20 = z17;
                            r82 = z12;
                            z21 = z10;
                            i14 = i13;
                        }
                    } else {
                        c3676oQ2 = c3676oQ;
                    }
                    i11 = i;
                    boolean equals3 = obj5.equals(obj2);
                    if (equals3) {
                    }
                    K7 o62 = abstractC3604n83.o(obj2, k73);
                    z14 = z6;
                    if (!z9) {
                    }
                    if (i == i12) {
                    }
                    if (E8.b()) {
                    }
                    if (E8.equals(c3676oQ2)) {
                    }
                    if (abstractC3604n83.e(obj5) == -1) {
                    }
                    obj3 = E8.f32905a;
                    if (obj3.equals(obj5)) {
                        C2897a a112 = abstractC3604n83.o(obj3, k73).f25870f.a(i15);
                        i16 = E8.f32907c;
                        iArr = a112.f28986d;
                        if (i16 < iArr.length) {
                        }
                        k74 = k73;
                        i13 = 0;
                        if (z16) {
                        }
                        z17 = false;
                        c3676oQ3 = E8;
                        j15 = j14;
                        z18 = z16;
                        z19 = z15;
                        z20 = z17;
                        r82 = z12;
                        z21 = z10;
                        i14 = i13;
                    }
                    k74 = k73;
                    if (z16) {
                    }
                    z17 = false;
                    c3676oQ3 = E8;
                    j15 = j14;
                    z18 = z16;
                    z19 = z15;
                    z20 = z17;
                    r82 = z12;
                    z21 = z10;
                    i14 = i13;
                }
            }
            z6 = true;
            if (c3676oQ7.b()) {
            }
            z9 = z6;
            j9 = c3566mO.f31950c;
            U7 u722 = this.f28142C;
            if (un5 == null) {
            }
            if (i6 == i9) {
            }
            long j232 = j9;
            long j242 = j10;
            E8 = this.J.E(c3566mO, abstractC3604n8, obj2, z35, z9);
            abstractC3604n83 = abstractC3604n8;
            i10 = E8.f32909e;
            if (i10 == -1) {
            }
            i11 = i;
            boolean equals32 = obj5.equals(obj2);
            if (equals32) {
            }
            K7 o622 = abstractC3604n83.o(obj2, k73);
            z14 = z6;
            if (!z9) {
            }
            if (i == i12) {
            }
            if (E8.b()) {
            }
            if (E8.equals(c3676oQ2)) {
            }
            if (abstractC3604n83.e(obj5) == -1) {
            }
            obj3 = E8.f32905a;
            if (obj3.equals(obj5)) {
            }
            k74 = k73;
            if (z16) {
            }
            z17 = false;
            c3676oQ3 = E8;
            j15 = j14;
            z18 = z16;
            z19 = z15;
            z20 = z17;
            r82 = z12;
            z21 = z10;
            i14 = i13;
        }
        if (r82 != 0) {
            try {
                z26 = true;
                if (this.f28170Z.f31952e != 1) {
                    try {
                        c(4);
                    } catch (Throwable th) {
                        th = th;
                        C3676oQ c3676oQ8 = c3676oQ3;
                        abstractC3604n85 = abstractC3604n83;
                        c3676oQ4 = c3676oQ8;
                        un = null;
                        z27 = z20;
                        i19 = i14;
                        z28 = false;
                        C3566mO c3566mO2 = this.f28170Z;
                        AbstractC3604n8 abstractC3604n89 = c3566mO2.f31948a;
                        C3676oQ c3676oQ9 = c3566mO2.f31949b;
                        C3676oQ c3676oQ10 = c3676oQ4;
                        G(abstractC3604n85, c3676oQ10, abstractC3604n89, c3676oQ9, true == z21 ? j6 : j15, false);
                        if (!z18) {
                        }
                        if (z27) {
                        }
                        this.f28170Z = N(c3676oQ10, j18, j12, j17, z27, i19);
                        J();
                        x(abstractC3604n85, this.f28170Z.f31948a);
                        this.f28170Z = this.f28170Z.c(abstractC3604n85);
                        if (!abstractC3604n85.g()) {
                        }
                        Q(z28);
                        this.f28189z.c(2);
                        throw th;
                    }
                }
                r42 = 0;
            } catch (Throwable th2) {
                th = th2;
                r42 = 0;
                C3676oQ c3676oQ11 = c3676oQ3;
                abstractC3604n85 = abstractC3604n83;
                c3676oQ4 = c3676oQ11;
                un2 = null;
                z29 = r42;
                z27 = z20;
                i19 = i14;
                z28 = z29;
                un = un2;
                C3566mO c3566mO22 = this.f28170Z;
                AbstractC3604n8 abstractC3604n892 = c3566mO22.f31948a;
                C3676oQ c3676oQ92 = c3566mO22.f31949b;
                C3676oQ c3676oQ102 = c3676oQ4;
                G(abstractC3604n85, c3676oQ102, abstractC3604n892, c3676oQ92, true == z21 ? j6 : j15, false);
                if (!z18) {
                }
                if (z27) {
                }
                this.f28170Z = N(c3676oQ102, j18, j12, j17, z27, i19);
                J();
                x(abstractC3604n85, this.f28170Z.f31948a);
                this.f28170Z = this.f28170Z.c(abstractC3604n85);
                if (!abstractC3604n85.g()) {
                }
                Q(z28);
                this.f28189z.c(2);
                throw th;
            }
            try {
                v(false, false, false, true);
            } catch (Throwable th3) {
                th = th3;
                C3676oQ c3676oQ112 = c3676oQ3;
                abstractC3604n85 = abstractC3604n83;
                c3676oQ4 = c3676oQ112;
                un2 = null;
                z29 = r42;
                z27 = z20;
                i19 = i14;
                z28 = z29;
                un = un2;
                C3566mO c3566mO222 = this.f28170Z;
                AbstractC3604n8 abstractC3604n8922 = c3566mO222.f31948a;
                C3676oQ c3676oQ922 = c3566mO222.f31949b;
                C3676oQ c3676oQ1022 = c3676oQ4;
                G(abstractC3604n85, c3676oQ1022, abstractC3604n8922, c3676oQ922, true == z21 ? j6 : j15, false);
                if (!z18) {
                }
                if (z27) {
                }
                this.f28170Z = N(c3676oQ1022, j18, j12, j17, z27, i19);
                J();
                x(abstractC3604n85, this.f28170Z.f31948a);
                this.f28170Z = this.f28170Z.c(abstractC3604n85);
                if (!abstractC3604n85.g()) {
                }
                Q(z28);
                this.f28189z.c(2);
                throw th;
            }
        } else {
            r42 = 0;
            z26 = z14;
        }
        D0.H[] hArr = this.f28171n;
        int i27 = r42;
        AbstractC3604n8 abstractC3604n810 = r82;
        boolean z38 = z26;
        while (true) {
            r13 = 2;
            if (i27 < 2) {
                D0.H h9 = hArr[i27];
                ?? r83 = (RP) h9.f539e;
                if (!Objects.equals(r83.f27221I, abstractC3604n83)) {
                    r83.f27221I = abstractC3604n83;
                    r83.P();
                    r83.n0();
                }
                RP rp = (RP) h9.f540f;
                if (rp != null && (r83 = Objects.equals(rp.f27221I, abstractC3604n83)) == 0) {
                    rp.f27221I = abstractC3604n83;
                    rp.P();
                    rp.n0();
                }
                z38 = true;
                i27++;
                abstractC3604n810 = r83;
            } else {
                try {
                    break;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        if (z18) {
            AbstractC3604n8 abstractC3604n811 = abstractC3604n83;
            UN un6 = null;
            boolean z39 = r42;
            z32 = z39;
            un4 = un6;
            if (!abstractC3604n811.g()) {
                try {
                    C3136eO c3136eO2 = this.J;
                    for (C3029cO c3029cO = c3136eO2.f29921h; c3029cO != null; c3029cO = c3029cO.f29484m) {
                        if (c3029cO.f29479g.f29760a.equals(c3676oQ3)) {
                            c3029cO.f29479g = c3136eO2.D(abstractC3604n811, c3029cO.f29479g);
                        }
                    }
                    c3136eO = this.J;
                    c3676oQ4 = c3676oQ3;
                    j21 = j15;
                } catch (Throwable th5) {
                    th = th5;
                    c3676oQ4 = c3676oQ3;
                }
                try {
                    j15 = r(c3676oQ4, j21, c3136eO.f29921h != c3136eO.i ? true : z39 ? 1 : 0, z19);
                    z31 = z39;
                    un3 = un6;
                    C3566mO c3566mO3 = this.f28170Z;
                    C3676oQ c3676oQ12 = c3676oQ4;
                    G(abstractC3604n8, c3676oQ12, c3566mO3.f31948a, c3566mO3.f31949b, true == z21 ? j6 : j15, false);
                    if (!z18 || j12 != this.f28170Z.f31950c) {
                        if (z20) {
                            j19 = this.f28170Z.f31951d;
                            j20 = j15;
                        } else {
                            j20 = j15;
                            j19 = j20;
                        }
                        this.f28170Z = N(c3676oQ12, j20, j12, j19, z20, i14);
                    }
                    J();
                    x(abstractC3604n8, this.f28170Z.f31948a);
                    this.f28170Z = this.f28170Z.c(abstractC3604n8);
                    if (!abstractC3604n8.g()) {
                        this.f28188y0 = un3;
                    }
                    Q(z31);
                    this.f28189z.c(2);
                } catch (Throwable th6) {
                    th = th6;
                    j15 = j21;
                    abstractC3604n85 = abstractC3604n811;
                    z29 = z39;
                    un2 = un6;
                    z27 = z20;
                    i19 = i14;
                    z28 = z29;
                    un = un2;
                    C3566mO c3566mO2222 = this.f28170Z;
                    AbstractC3604n8 abstractC3604n89222 = c3566mO2222.f31948a;
                    C3676oQ c3676oQ9222 = c3566mO2222.f31949b;
                    C3676oQ c3676oQ10222 = c3676oQ4;
                    G(abstractC3604n85, c3676oQ10222, abstractC3604n89222, c3676oQ9222, true == z21 ? j6 : j15, false);
                    if (!z18) {
                    }
                    if (z27) {
                    }
                    this.f28170Z = N(c3676oQ10222, j18, j12, j17, z27, i19);
                    J();
                    x(abstractC3604n85, this.f28170Z.f31948a);
                    this.f28170Z = this.f28170Z.c(abstractC3604n85);
                    if (!abstractC3604n85.g()) {
                    }
                    Q(z28);
                    this.f28189z.c(2);
                    throw th;
                }
            }
        } else {
            try {
                C3136eO c3136eO3 = this.J;
                C3029cO c3029cO2 = c3136eO3.i;
                long H9 = c3029cO2 == null ? j13 : H(c3029cO2);
                try {
                    try {
                        if (V()) {
                            try {
                                C3029cO c3029cO3 = c3136eO3.f29922j;
                                if (c3029cO3 != null) {
                                    H8 = H(c3029cO3);
                                    z30 = r42;
                                    r13 = 0;
                                    z38 = z30;
                                    C8 = c3136eO3.C(abstractC3604n8, this.f28190z0, H9, H8);
                                    if ((C8 & 1) == 0) {
                                        h(z38);
                                        z32 = z38;
                                        un4 = r13;
                                    } else {
                                        z32 = z38;
                                        un4 = r13;
                                        if ((C8 & 2) != 0) {
                                            C();
                                            z32 = z38;
                                            un4 = r13;
                                        }
                                    }
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                un = null;
                                z28 = r42;
                                z27 = z20;
                                c3676oQ4 = c3676oQ3;
                                i19 = i14;
                                abstractC3604n85 = abstractC3604n8;
                                C3566mO c3566mO22222 = this.f28170Z;
                                AbstractC3604n8 abstractC3604n892222 = c3566mO22222.f31948a;
                                C3676oQ c3676oQ92222 = c3566mO22222.f31949b;
                                C3676oQ c3676oQ102222 = c3676oQ4;
                                G(abstractC3604n85, c3676oQ102222, abstractC3604n892222, c3676oQ92222, true == z21 ? j6 : j15, false);
                                if (!z18 || j12 != this.f28170Z.f31950c) {
                                    if (z27) {
                                        j17 = this.f28170Z.f31951d;
                                        j18 = j15;
                                    } else {
                                        j18 = j15;
                                        j17 = j18;
                                    }
                                    this.f28170Z = N(c3676oQ102222, j18, j12, j17, z27, i19);
                                }
                                J();
                                x(abstractC3604n85, this.f28170Z.f31948a);
                                this.f28170Z = this.f28170Z.c(abstractC3604n85);
                                if (!abstractC3604n85.g()) {
                                    this.f28188y0 = un;
                                }
                                Q(z28);
                                this.f28189z.c(2);
                                throw th;
                            }
                        }
                        C8 = c3136eO3.C(abstractC3604n8, this.f28190z0, H9, H8);
                        if ((C8 & 1) == 0) {
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        abstractC3604n810 = abstractC3604n8;
                        z27 = z20;
                        c3676oQ4 = c3676oQ3;
                        i19 = i14;
                        abstractC3604n85 = abstractC3604n810;
                        z28 = z38;
                        un = r13;
                        C3566mO c3566mO222222 = this.f28170Z;
                        AbstractC3604n8 abstractC3604n8922222 = c3566mO222222.f31948a;
                        C3676oQ c3676oQ922222 = c3566mO222222.f31949b;
                        C3676oQ c3676oQ1022222 = c3676oQ4;
                        G(abstractC3604n85, c3676oQ1022222, abstractC3604n8922222, c3676oQ922222, true == z21 ? j6 : j15, false);
                        if (!z18) {
                        }
                        if (z27) {
                        }
                        this.f28170Z = N(c3676oQ1022222, j18, j12, j17, z27, i19);
                        J();
                        x(abstractC3604n85, this.f28170Z.f31948a);
                        this.f28170Z = this.f28170Z.c(abstractC3604n85);
                        if (!abstractC3604n85.g()) {
                        }
                        Q(z28);
                        this.f28189z.c(2);
                        throw th;
                    }
                    r13 = 0;
                    z38 = z30;
                } catch (Throwable th9) {
                    th = th9;
                    abstractC3604n810 = abstractC3604n8;
                    r13 = 0;
                    z38 = z30;
                }
                z30 = r42;
                H8 = j13;
            } catch (Throwable th10) {
                th = th10;
                abstractC3604n810 = abstractC3604n8;
                r13 = 0;
                z38 = r42;
            }
        }
        c3676oQ4 = c3676oQ3;
        z31 = z32;
        un3 = un4;
        C3566mO c3566mO32 = this.f28170Z;
        C3676oQ c3676oQ122 = c3676oQ4;
        G(abstractC3604n8, c3676oQ122, c3566mO32.f31948a, c3566mO32.f31949b, true == z21 ? j6 : j15, false);
        if (!z18) {
        }
        if (z20) {
        }
        this.f28170Z = N(c3676oQ122, j20, j12, j19, z20, i14);
        J();
        x(abstractC3604n8, this.f28170Z.f31948a);
        this.f28170Z = this.f28170Z.c(abstractC3604n8);
        if (!abstractC3604n8.g()) {
        }
        Q(z31);
        this.f28189z.c(2);
    }

    public final void G(AbstractC3604n8 abstractC3604n8, C3676oQ c3676oQ, AbstractC3604n8 abstractC3604n82, C3676oQ c3676oQ2, long j6, boolean z3) {
        if (!o(abstractC3604n8, c3676oQ)) {
            C3924t5 c3924t5 = c3676oQ.b() ? C3924t5.f34215d : this.f28170Z.f31961o;
            Is is = this.f28147F;
            if (is.j().equals(c3924t5)) {
                return;
            }
            this.f28189z.d(16);
            is.a(c3924t5);
            K(this.f28170Z.f31961o, c3924t5.f34216a, false, false);
            return;
        }
        Object obj = c3676oQ.f32905a;
        K7 k72 = this.f28143D;
        int i = abstractC3604n8.o(obj, k72).f25867c;
        U7 u72 = this.f28142C;
        abstractC3604n8.b(i, u72, 0L);
        C4135x0 c4135x0 = u72.f27900h;
        String str = AbstractC3159eu.f29993a;
        C4266zN c4266zN = this.f28155J0;
        c4266zN.getClass();
        c4135x0.getClass();
        long u3 = AbstractC3159eu.u(com.anythink.basead.exoplayer.b.f6382b);
        c4266zN.f35320c = u3;
        c4266zN.f35323f = u3;
        c4266zN.f35324g = u3;
        c4266zN.c();
        if (j6 != com.anythink.basead.exoplayer.b.f6382b) {
            c4266zN.f35321d = n(abstractC3604n8, obj, j6);
            c4266zN.c();
            return;
        }
        if (!Objects.equals(!abstractC3604n82.g() ? abstractC3604n82.b(abstractC3604n82.o(c3676oQ2.f32905a, k72).f25867c, u72, 0L).f27893a : null, u72.f27893a) || z3) {
            c4266zN.f35321d = com.anythink.basead.exoplayer.b.f6382b;
            c4266zN.c();
        }
    }

    public final long H(C3029cO c3029cO) {
        if (c3029cO == null) {
            return 0L;
        }
        long j6 = c3029cO.f29487p;
        if (c3029cO.f29477e) {
            for (int i = 0; i < 2; i++) {
                D0.H[] hArr = this.f28171n;
                if (hArr[i].m(c3029cO) != null) {
                    RP m4 = hArr[i].m(c3029cO);
                    Objects.requireNonNull(m4);
                    long j9 = m4.f27215F;
                    if (j9 == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    j6 = Math.max(j9, j6);
                }
            }
        }
        return j6;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I() {
        boolean z3;
        C3136eO c3136eO = this.J;
        c3136eO.z();
        C3029cO c3029cO = c3136eO.f29924l;
        if (c3029cO != null) {
            if (!c3029cO.f29476d || c3029cO.f29477e) {
                C3300hQ c3300hQ = c3029cO.f29473a;
                if (c3300hQ.d()) {
                    return;
                }
                AbstractC3604n8 abstractC3604n8 = this.f28170Z.f31948a;
                if (c3029cO.f29477e) {
                    c3300hQ.f();
                }
                if (this.f28187y.j()) {
                    if (!c3029cO.f29476d) {
                        C3083dO c3083dO = c3029cO.f29479g;
                        c3029cO.f29476d = true;
                        c3300hQ.b(this, c3083dO.f29761b);
                        return;
                    }
                    ZN zn = new ZN();
                    zn.f28881a = this.f28190z0 - c3029cO.f29487p;
                    float f3 = this.f28147F.j().f34216a;
                    AbstractC2772Sd.i(f3 > 0.0f || f3 == -3.4028235E38f);
                    zn.f28882b = f3;
                    long j6 = this.f28177s0;
                    if (j6 < 0) {
                        if (j6 != com.anythink.basead.exoplayer.b.f6382b) {
                            z3 = false;
                            AbstractC2772Sd.i(z3);
                            zn.f28883c = j6;
                            C2922aO c2922aO = new C2922aO(zn);
                            AbstractC2772Sd.H(c3029cO.f29484m == null);
                            c3300hQ.e(c2922aO);
                        }
                        j6 = -9223372036854775807L;
                    }
                    z3 = true;
                    AbstractC2772Sd.i(z3);
                    zn.f28883c = j6;
                    C2922aO c2922aO2 = new C2922aO(zn);
                    AbstractC2772Sd.H(c3029cO.f29484m == null);
                    c3300hQ.e(c2922aO2);
                }
            }
        }
    }

    public final void J() {
        C3029cO c3029cO = this.J.f29921h;
        boolean z3 = false;
        if (c3029cO != null && c3029cO.f29479g.f29766g && this.f28174p0) {
            z3 = true;
        }
        this.f28175q0 = z3;
    }

    public final void K(C3924t5 c3924t5, float f3, boolean z3, boolean z6) {
        int i;
        if (z3) {
            if (z6) {
                this.f28172n0.f(1);
            }
            C3566mO c3566mO = this.f28170Z;
            this.f28170Z = new C3566mO(c3566mO.f31948a, c3566mO.f31949b, c3566mO.f31950c, c3566mO.f31951d, c3566mO.f31952e, c3566mO.f31953f, c3566mO.f31954g, c3566mO.f31955h, c3566mO.i, c3566mO.f31956j, c3566mO.f31957k, c3566mO.f31958l, c3566mO.f31959m, c3566mO.f31960n, c3924t5, c3566mO.f31962p, c3566mO.f31963q, c3566mO.f31964r, c3566mO.f31965s);
        }
        float f9 = c3924t5.f34216a;
        C3029cO c3029cO = this.J.f29921h;
        while (true) {
            i = 0;
            if (c3029cO == null) {
                break;
            }
            InterfaceC3757q[] interfaceC3757qArr = (InterfaceC3757q[]) c3029cO.f29486o.f34179v;
            int length = interfaceC3757qArr.length;
            while (i < length) {
                InterfaceC3757q interfaceC3757q = interfaceC3757qArr[i];
                i++;
            }
            c3029cO = c3029cO.f29484m;
        }
        D0.H[] hArr = this.f28171n;
        while (i < 2) {
            D0.H h9 = hArr[i];
            ((RP) h9.f539e).r(f3, f9);
            RP rp = (RP) h9.f540f;
            if (rp != null) {
                rp.r(f3, f9);
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L() {
        boolean c9;
        boolean z3;
        C3136eO c3136eO = this.J;
        boolean A9 = A(c3136eO.f29923k);
        long j6 = com.anythink.basead.exoplayer.b.f6382b;
        if (A9) {
            C3029cO c3029cO = c3136eO.f29923k;
            long R8 = R(!c3029cO.f29477e ? 0L : c3029cO.f29473a.i());
            long j9 = o(this.f28170Z.f31948a, c3029cO.f29479g.f29760a) ? this.f28155J0.f35325h : -9223372036854775807L;
            IO io = this.f28158M;
            AbstractC3604n8 abstractC3604n8 = this.f28170Z.f31948a;
            C3676oQ c3676oQ = c3029cO.f29479g.f29760a;
            float f3 = this.f28147F.j().f34216a;
            boolean z6 = this.f28170Z.f31958l;
            XN xn = new XN(io, abstractC3604n8, c3676oQ, R8, f3, this.f28176r0, j9);
            YN yn = this.f28187y;
            c9 = yn.c(xn);
            C3029cO c3029cO2 = c3136eO.f29921h;
            if (!c9 && c3029cO2.f29477e && R8 < 500000 && this.f28145E > 0) {
                c3029cO2.f29473a.X(this.f28170Z.f31964r);
                c9 = yn.c(xn);
            }
        } else {
            c9 = false;
        }
        this.f28178t0 = c9;
        if (c9) {
            C3029cO c3029cO3 = c3136eO.f29923k;
            c3029cO3.getClass();
            ZN zn = new ZN();
            zn.f28881a = this.f28190z0 - c3029cO3.f29487p;
            float f9 = this.f28147F.j().f34216a;
            AbstractC2772Sd.i(f9 > 0.0f || f9 == -3.4028235E38f);
            zn.f28882b = f9;
            long j10 = this.f28177s0;
            if (j10 >= 0) {
                j6 = j10;
            } else if (j10 != com.anythink.basead.exoplayer.b.f6382b) {
                z3 = false;
                j6 = j10;
                AbstractC2772Sd.i(z3);
                zn.f28883c = j6;
                C2922aO c2922aO = new C2922aO(zn);
                AbstractC2772Sd.H(c3029cO3.f29484m == null);
                c3029cO3.f29473a.e(c2922aO);
            }
            z3 = true;
            AbstractC2772Sd.i(z3);
            zn.f28883c = j6;
            C2922aO c2922aO2 = new C2922aO(zn);
            AbstractC2772Sd.H(c3029cO3.f29484m == null);
            c3029cO3.f29473a.e(c2922aO2);
        }
        M();
    }

    public final void M() {
        C3029cO c3029cO = this.J.f29923k;
        boolean z3 = true;
        if (!this.f28178t0 && (c3029cO == null || !c3029cO.f29473a.d())) {
            z3 = false;
        }
        C3566mO c3566mO = this.f28170Z;
        if (z3 != c3566mO.f31954g) {
            this.f28170Z = c3566mO.f(z3);
        }
    }

    public final C3566mO N(C3676oQ c3676oQ, long j6, long j9, long j10, boolean z3, int i) {
        PQ pq;
        C3918t c3918t;
        List list;
        C3500lC c3500lC;
        int i6;
        this.C0 = (!this.C0 && j6 == this.f28170Z.f31964r && c3676oQ.equals(this.f28170Z.f31949b)) ? false : true;
        J();
        C3566mO c3566mO = this.f28170Z;
        PQ pq2 = c3566mO.f31955h;
        C3918t c3918t2 = c3566mO.i;
        List list2 = c3566mO.f31956j;
        if (this.f28156K.f802n) {
            C3136eO c3136eO = this.J;
            C3029cO c3029cO = c3136eO.f29921h;
            PQ pq3 = c3029cO == null ? PQ.f26818d : c3029cO.f29485n;
            C3918t c3918t3 = c3029cO == null ? this.f28185x : c3029cO.f29486o;
            InterfaceC3757q[] interfaceC3757qArr = (InterfaceC3757q[]) c3918t3.f34179v;
            OB ob = new OB(4);
            boolean z6 = false;
            for (InterfaceC3757q interfaceC3757q : interfaceC3757qArr) {
                if (interfaceC3757q != null) {
                    O3 o32 = interfaceC3757q.x(0).f24428l;
                    if (o32 == null) {
                        ob.a(new O3(new InterfaceC3922t3[0]));
                    } else {
                        ob.a(o32);
                        z6 = true;
                    }
                }
            }
            if (z6) {
                c3500lC = ob.f();
            } else {
                PB pb = RB.f27177u;
                c3500lC = C3500lC.f31745x;
            }
            if (c3029cO != null) {
                C3083dO c3083dO = c3029cO.f29479g;
                long j11 = c3083dO.f29763d;
                if (j11 != j9) {
                    if (j9 != j11) {
                        c3083dO = new C3083dO(c3083dO.f29760a, c3083dO.f29761b, c3083dO.f29762c, j9, c3083dO.f29764e, c3083dO.f29765f, c3083dO.f29766g, c3083dO.f29767h);
                    }
                    c3029cO.f29479g = c3083dO;
                }
            }
            C3029cO c3029cO2 = c3136eO.f29921h;
            if (c3029cO2 == c3136eO.i && c3029cO2 != null) {
                C3918t c3918t4 = c3029cO2.f29486o;
                int i9 = 0;
                while (true) {
                    D0.H[] hArr = this.f28171n;
                    if (i9 >= 2) {
                        break;
                    }
                    if (c3918t4.c(i9)) {
                        i6 = 1;
                        if (((RP) hArr[i9].f539e).f27272u != 1) {
                            break;
                        }
                        ((C3889sO[]) c3918t4.f34178u)[i9].getClass();
                    } else {
                        i6 = 1;
                    }
                    i9 += i6;
                }
            }
            pq = pq3;
            c3918t = c3918t3;
            list = c3500lC;
        } else {
            if (!c3676oQ.equals(c3566mO.f31949b)) {
                c3918t2 = this.f28185x;
                pq2 = PQ.f26818d;
                list2 = C3500lC.f31745x;
            }
            pq = pq2;
            c3918t = c3918t2;
            list = list2;
        }
        if (z3) {
            C4085w4 c4085w4 = this.f28172n0;
            if (!c4085w4.f34797d || c4085w4.f34798e == 5) {
                c4085w4.f34795b = true;
                c4085w4.f34797d = true;
                c4085w4.f34798e = i;
            } else {
                AbstractC2772Sd.i(i == 5);
            }
        }
        C3566mO c3566mO2 = this.f28170Z;
        return c3566mO2.b(c3676oQ, j6, j9, j10, R(c3566mO2.f31962p), pq, c3918t, list);
    }

    public final void O(boolean[] zArr, long j6) {
        D0.H[] hArr;
        long j9;
        C3029cO c3029cO = this.J.i;
        C3918t c3918t = c3029cO.f29486o;
        int i = 0;
        while (true) {
            hArr = this.f28171n;
            if (i >= 2) {
                break;
            }
            if (!c3918t.c(i)) {
                hArr[i].b();
            }
            i++;
        }
        int i6 = 0;
        while (i6 < 2) {
            if (c3918t.c(i6) && hArr[i6].m(c3029cO) == null) {
                j9 = j6;
                P(c3029cO, i6, zArr[i6], j9);
            } else {
                j9 = j6;
            }
            i6++;
            j6 = j9;
        }
    }

    public final void P(C3029cO c3029cO, int i, boolean z3, long j6) {
        int i6;
        int i9;
        D0.H h9 = this.f28171n[i];
        if (h9.g()) {
            return;
        }
        boolean z6 = c3029cO == this.J.f29921h;
        C3918t c3918t = c3029cO.f29486o;
        C3889sO c3889sO = ((C3889sO[]) c3918t.f34178u)[i];
        InterfaceC3757q interfaceC3757q = ((InterfaceC3757q[]) c3918t.f34179v)[i];
        boolean z9 = T() && this.f28170Z.f31952e == 3;
        boolean z10 = !z3 && z9;
        this.f28186x0++;
        IQ iq = c3029cO.f29475c[i];
        long j9 = c3029cO.f29487p;
        C3083dO c3083dO = c3029cO.f29479g;
        if (interfaceC3757q != null) {
            i6 = interfaceC3757q.d();
            i9 = 0;
        } else {
            i6 = 0;
            i9 = 0;
        }
        DP[] dpArr = new DP[i6];
        while (i9 < i6) {
            interfaceC3757q.getClass();
            dpArr[i9] = interfaceC3757q.x(i9);
            i9++;
        }
        int i10 = h9.f536b;
        C3676oQ c3676oQ = c3083dO.f29760a;
        Is is = this.f28147F;
        if (i10 == 0 || i10 == 2 || i10 == 4) {
            h9.f537c = true;
            RP rp = (RP) h9.f539e;
            AbstractC2772Sd.H(rp.f27206A == 0);
            rp.f27276w = c3889sO;
            rp.J = c3676oQ;
            rp.f27206A = 1;
            rp.u0(z10, z6);
            rp.p0(dpArr, iq, j6, j9, c3676oQ);
            rp.N(j6, z10, true);
            is.b(rp);
        } else {
            h9.f538d = true;
            RP rp2 = (RP) h9.f540f;
            rp2.getClass();
            AbstractC2772Sd.H(rp2.f27206A == 0);
            rp2.f27276w = c3889sO;
            rp2.J = c3676oQ;
            rp2.f27206A = 1;
            rp2.u0(z10, z6);
            rp2.p0(dpArr, iq, j6, j9, c3676oQ);
            rp2.N(j6, z10, true);
            is.b(rp2);
        }
        QN qn = new QN(this);
        RP m4 = h9.m(c3029cO);
        m4.getClass();
        m4.b(11, qn);
        if (z9 && z6) {
            h9.C();
        }
    }

    public final void Q(boolean z3) {
        C3029cO c3029cO = this.J.f29923k;
        C3676oQ c3676oQ = c3029cO == null ? this.f28170Z.f31949b : c3029cO.f29479g.f29760a;
        boolean equals = this.f28170Z.f31957k.equals(c3676oQ);
        if (!equals) {
            this.f28170Z = this.f28170Z.g(c3676oQ);
        }
        C3566mO c3566mO = this.f28170Z;
        c3566mO.f31962p = c3029cO == null ? c3566mO.f31964r : c3029cO.d();
        C3566mO c3566mO2 = this.f28170Z;
        c3566mO2.f31963q = R(c3566mO2.f31962p);
        if ((!equals || z3) && c3029cO != null && c3029cO.f29477e) {
            S(c3029cO.f29479g.f29760a, c3029cO.f29485n, c3029cO.f29486o);
        }
    }

    public final long R(long j6) {
        C3029cO c3029cO = this.J.f29923k;
        if (c3029cO == null) {
            return 0L;
        }
        return Math.max(0L, j6 - (this.f28190z0 - c3029cO.f29487p));
    }

    public final void S(C3676oQ c3676oQ, PQ pq, C3918t c3918t) {
        C3029cO c3029cO = this.J.f29923k;
        c3029cO.getClass();
        long R8 = R(c3029cO.d());
        long j6 = o(this.f28170Z.f31948a, c3029cO.f29479g.f29760a) ? this.f28155J0.f35325h : com.anythink.basead.exoplayer.b.f6382b;
        AbstractC3604n8 abstractC3604n8 = this.f28170Z.f31948a;
        float f3 = this.f28147F.j().f34216a;
        boolean z3 = this.f28170Z.f31958l;
        this.f28187y.a(new XN(this.f28158M, abstractC3604n8, c3676oQ, R8, f3, this.f28176r0, j6), (InterfaceC3757q[]) c3918t.f34179v);
    }

    public final boolean T() {
        C3566mO c3566mO = this.f28170Z;
        return c3566mO.f31958l && c3566mO.f31960n == 0;
    }

    public final void U(int i) {
        D0.H h9 = this.f28171n[i];
        try {
            C3029cO c3029cO = this.J.f29921h;
            if (c3029cO == null) {
                throw null;
            }
            RP m4 = h9.m(c3029cO);
            m4.getClass();
            IQ iq = m4.f27208B;
            iq.getClass();
            iq.f();
        } catch (IOException | RuntimeException e9) {
            int i6 = ((RP) h9.f539e).f27272u;
            throw e9;
        }
    }

    public final boolean V() {
        if (!this.f28162Q) {
            return false;
        }
        for (int i = 0; i < 2; i++) {
            if (this.f28171n[i].q()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3328i0
    public final void a(long j6, long j9, DP dp, MediaFormat mediaFormat) {
        if (this.f28168W) {
            C3212ft c3212ft = this.f28189z;
            c3212ft.getClass();
            C3104dt g4 = C3212ft.g();
            g4.f29857a = c3212ft.f30468a.obtainMessage(37);
            g4.a();
        }
    }

    public final void b(IOException iOException, int i) {
        DN dn = new DN(0, iOException, i);
        C3029cO c3029cO = this.J.f29921h;
        if (c3029cO != null) {
            dn = dn.a(c3029cO.f29479g.f29760a);
        }
        AbstractC2968bG.J("ExoPlayerImplInternal", "Playback error", dn);
        u(false, false);
        this.f28170Z = this.f28170Z.e(dn);
    }

    public final void c(int i) {
        C3566mO c3566mO = this.f28170Z;
        if (c3566mO.f31952e != i) {
            if (i != 2) {
                this.f28146E0 = com.anythink.basead.exoplayer.b.f6382b;
            }
            this.f28170Z = c3566mO.d(i);
        }
    }

    public final void d(int i) {
        C4085w4 c4085w4 = this.f28172n0;
        C3566mO c3566mO = this.f28170Z;
        boolean z3 = c4085w4.f34795b | (((C3566mO) c4085w4.f34799f) != c3566mO);
        c4085w4.f34795b = z3;
        c4085w4.f34799f = c3566mO;
        if (z3) {
            if (!c3566mO.f31948a.g()) {
                C3566mO c3566mO2 = this.f28170Z;
                boolean z6 = c3566mO2.f31948a.e(c3566mO2.f31949b.f32905a) != -1;
                Locale locale = Locale.US;
                C3566mO c3566mO3 = this.f28170Z;
                AbstractC2772Sd.I(String.format(locale, "periodUid %s not found in timeline %s with size %d triggered by msg %d", c3566mO3.f31949b.f32905a, c3566mO3.f31948a.getClass().getName(), Integer.valueOf(this.f28170Z.f31948a.a()), Integer.valueOf(i)), z6);
            }
            C3534lt c3534lt = this.f28153I;
            C4085w4 c4085w42 = this.f28172n0;
            PN pn = (PN) c3534lt.f31863u;
            pn.getClass();
            pn.f26770D.e(new RunnableC3048cq(21, pn, c4085w42));
            this.f28172n0 = new C4085w4(this.f28170Z);
        }
    }

    public final void e(float f3) {
        this.f28154I0 = f3;
        float f9 = f3 * this.f28163R.f31067g;
        for (int i = 0; i < 2; i++) {
            D0.H h9 = this.f28171n[i];
            RP rp = (RP) h9.f539e;
            if (rp.f27272u == 1) {
                Float valueOf = Float.valueOf(f9);
                rp.b(2, valueOf);
                RP rp2 = (RP) h9.f540f;
                if (rp2 != null) {
                    rp2.b(2, valueOf);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0010  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(int i, int i6, int i9, boolean z3) {
        boolean z6;
        C3566mO c3566mO;
        C3029cO c3029cO;
        if (z3) {
            if (i != -1) {
                z6 = true;
                if (i != -1) {
                    i9 = 2;
                } else if (i9 == 2) {
                    i9 = 1;
                }
                boolean z9 = this.f28167V;
                if (i != 0) {
                    i6 = 1;
                } else if (i6 == 1) {
                    i6 = z9 ? 4 : 0;
                }
                c3566mO = this.f28170Z;
                if (c3566mO.f31958l != z6 && c3566mO.f31960n == i6 && c3566mO.f31959m == i9) {
                    return;
                }
                this.f28170Z = c3566mO.h(i9, i6, z6);
                y(false, false);
                C3136eO c3136eO = this.J;
                for (c3029cO = c3136eO.f29921h; c3029cO != null; c3029cO = c3029cO.f29484m) {
                    for (InterfaceC3757q interfaceC3757q : (InterfaceC3757q[]) c3029cO.f29486o.f34179v) {
                    }
                }
                if (T()) {
                    k();
                    l();
                    this.f28170Z.getClass();
                    c3136eO.n(this.f28190z0);
                    return;
                }
                int i10 = this.f28170Z.f31952e;
                C3212ft c3212ft = this.f28189z;
                if (i10 != 3) {
                    if (i10 == 2) {
                        c3212ft.c(2);
                        return;
                    }
                    return;
                }
                Is is = this.f28147F;
                is.f25608u = true;
                C4105wO c4105wO = (C4105wO) is.f25609v;
                if (!c4105wO.f34832n) {
                    c4105wO.f34834v = SystemClock.elapsedRealtime();
                    c4105wO.f34832n = true;
                }
                i();
                c3212ft.c(2);
                return;
            }
            i = -1;
        }
        z6 = false;
        if (i != -1) {
        }
        boolean z92 = this.f28167V;
        if (i != 0) {
        }
        c3566mO = this.f28170Z;
        if (c3566mO.f31958l != z6) {
        }
        this.f28170Z = c3566mO.h(i9, i6, z6);
        y(false, false);
        C3136eO c3136eO2 = this.J;
        while (c3029cO != null) {
        }
        if (T()) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3568mQ
    public final void g(InterfaceC3622nQ interfaceC3622nQ) {
        this.f28189z.b(8, interfaceC3622nQ).a();
    }

    public final void h(boolean z3) {
        C3676oQ c3676oQ = this.J.f29921h.f29479g.f29760a;
        long r9 = r(c3676oQ, this.f28170Z.f31964r, true, false);
        if (r9 != this.f28170Z.f31964r) {
            C3566mO c3566mO = this.f28170Z;
            this.f28170Z = N(c3676oQ, r9, c3566mO.f31950c, c3566mO.f31951d, z3, 5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:310:0x0acc, code lost:
    
        if (r7 == false) goto L575;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0931 A[Catch: RuntimeException -> 0x05f0, IOException -> 0x05f5, NH -> 0x05fa, U4 -> 0x05ff, yP -> 0x0604, DN -> 0x0609, TryCatch #26 {DN -> 0x0609, blocks: (B:182:0x04dc, B:187:0x04f1, B:366:0x0569, B:368:0x056d, B:370:0x0571, B:372:0x0577, B:374:0x057d, B:376:0x0583, B:378:0x0589, B:380:0x0591, B:382:0x05b0, B:384:0x05ba, B:385:0x05bf, B:387:0x05c4, B:389:0x05ca, B:391:0x05d2, B:393:0x05da, B:395:0x0616, B:399:0x061e, B:401:0x0629, B:403:0x0637, B:407:0x07e0, B:409:0x07e6, B:411:0x07ec, B:414:0x07f1, B:415:0x07fc, B:417:0x0801, B:423:0x0827, B:425:0x082d, B:429:0x083b, B:431:0x0843, B:436:0x0846, B:438:0x084f, B:492:0x091e, B:190:0x0929, B:192:0x0931, B:195:0x093b, B:197:0x0949, B:198:0x0962, B:200:0x0967, B:202:0x096f, B:204:0x0999, B:205:0x0974, B:207:0x097d, B:210:0x0986, B:215:0x0996, B:221:0x09a3, B:223:0x09a9, B:227:0x09b6, B:229:0x09f2, B:231:0x09f9, B:233:0x09fd, B:236:0x0a90, B:238:0x0a9d, B:240:0x0aae, B:241:0x0ab7, B:242:0x0b02, B:245:0x0b0a, B:247:0x0b0e, B:251:0x0b1b, B:253:0x0b1e, B:257:0x0b22, B:259:0x0b28, B:261:0x0b31, B:263:0x0b39, B:265:0x0b3f, B:267:0x0b45, B:268:0x0b67, B:270:0x0b6d, B:273:0x0b76, B:276:0x0b91, B:281:0x0b8a, B:283:0x0b8e, B:285:0x0b4c, B:288:0x0b5a, B:289:0x0b62, B:290:0x0b63, B:291:0x0abb, B:293:0x0ac1, B:295:0x0ac5, B:298:0x0ace, B:300:0x0ade, B:302:0x0ae4, B:304:0x0af0, B:306:0x0af5, B:308:0x0afa, B:309:0x0aff, B:312:0x0a0b, B:314:0x0a0f, B:316:0x0a21, B:317:0x0a2c, B:319:0x0a34, B:322:0x0a3d, B:324:0x0a47, B:329:0x0a52, B:335:0x09be, B:337:0x09c2, B:338:0x09dc, B:340:0x09e2, B:342:0x099c, B:440:0x0858, B:442:0x085c, B:444:0x0862, B:446:0x0868, B:448:0x0872, B:451:0x0878, B:452:0x087c, B:454:0x0885, B:456:0x0897, B:458:0x08a0, B:460:0x08a8, B:463:0x08b4, B:465:0x08dc, B:467:0x08e2, B:470:0x08e8, B:472:0x08f0, B:474:0x08f6, B:475:0x08f9, B:476:0x0902, B:478:0x0907, B:480:0x090d, B:482:0x0912, B:489:0x091d, B:531:0x0678, B:538:0x0689, B:542:0x069b, B:549:0x06c2, B:552:0x06fd, B:554:0x0730, B:556:0x0734, B:558:0x0744, B:560:0x0748, B:565:0x0750, B:567:0x0756, B:569:0x0778, B:574:0x0781, B:581:0x07aa, B:584:0x0786, B:587:0x078d, B:589:0x0795, B:591:0x079b, B:592:0x073a, B:501:0x07b5, B:503:0x07bb, B:505:0x07bf, B:508:0x07c5, B:514:0x07dd, B:515:0x07d4, B:517:0x07da), top: B:181:0x04dc }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x093b A[Catch: RuntimeException -> 0x05f0, IOException -> 0x05f5, NH -> 0x05fa, U4 -> 0x05ff, yP -> 0x0604, DN -> 0x0609, TryCatch #26 {DN -> 0x0609, blocks: (B:182:0x04dc, B:187:0x04f1, B:366:0x0569, B:368:0x056d, B:370:0x0571, B:372:0x0577, B:374:0x057d, B:376:0x0583, B:378:0x0589, B:380:0x0591, B:382:0x05b0, B:384:0x05ba, B:385:0x05bf, B:387:0x05c4, B:389:0x05ca, B:391:0x05d2, B:393:0x05da, B:395:0x0616, B:399:0x061e, B:401:0x0629, B:403:0x0637, B:407:0x07e0, B:409:0x07e6, B:411:0x07ec, B:414:0x07f1, B:415:0x07fc, B:417:0x0801, B:423:0x0827, B:425:0x082d, B:429:0x083b, B:431:0x0843, B:436:0x0846, B:438:0x084f, B:492:0x091e, B:190:0x0929, B:192:0x0931, B:195:0x093b, B:197:0x0949, B:198:0x0962, B:200:0x0967, B:202:0x096f, B:204:0x0999, B:205:0x0974, B:207:0x097d, B:210:0x0986, B:215:0x0996, B:221:0x09a3, B:223:0x09a9, B:227:0x09b6, B:229:0x09f2, B:231:0x09f9, B:233:0x09fd, B:236:0x0a90, B:238:0x0a9d, B:240:0x0aae, B:241:0x0ab7, B:242:0x0b02, B:245:0x0b0a, B:247:0x0b0e, B:251:0x0b1b, B:253:0x0b1e, B:257:0x0b22, B:259:0x0b28, B:261:0x0b31, B:263:0x0b39, B:265:0x0b3f, B:267:0x0b45, B:268:0x0b67, B:270:0x0b6d, B:273:0x0b76, B:276:0x0b91, B:281:0x0b8a, B:283:0x0b8e, B:285:0x0b4c, B:288:0x0b5a, B:289:0x0b62, B:290:0x0b63, B:291:0x0abb, B:293:0x0ac1, B:295:0x0ac5, B:298:0x0ace, B:300:0x0ade, B:302:0x0ae4, B:304:0x0af0, B:306:0x0af5, B:308:0x0afa, B:309:0x0aff, B:312:0x0a0b, B:314:0x0a0f, B:316:0x0a21, B:317:0x0a2c, B:319:0x0a34, B:322:0x0a3d, B:324:0x0a47, B:329:0x0a52, B:335:0x09be, B:337:0x09c2, B:338:0x09dc, B:340:0x09e2, B:342:0x099c, B:440:0x0858, B:442:0x085c, B:444:0x0862, B:446:0x0868, B:448:0x0872, B:451:0x0878, B:452:0x087c, B:454:0x0885, B:456:0x0897, B:458:0x08a0, B:460:0x08a8, B:463:0x08b4, B:465:0x08dc, B:467:0x08e2, B:470:0x08e8, B:472:0x08f0, B:474:0x08f6, B:475:0x08f9, B:476:0x0902, B:478:0x0907, B:480:0x090d, B:482:0x0912, B:489:0x091d, B:531:0x0678, B:538:0x0689, B:542:0x069b, B:549:0x06c2, B:552:0x06fd, B:554:0x0730, B:556:0x0734, B:558:0x0744, B:560:0x0748, B:565:0x0750, B:567:0x0756, B:569:0x0778, B:574:0x0781, B:581:0x07aa, B:584:0x0786, B:587:0x078d, B:589:0x0795, B:591:0x079b, B:592:0x073a, B:501:0x07b5, B:503:0x07bb, B:505:0x07bf, B:508:0x07c5, B:514:0x07dd, B:515:0x07d4, B:517:0x07da), top: B:181:0x04dc }] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0a9d A[Catch: RuntimeException -> 0x05f0, IOException -> 0x05f5, NH -> 0x05fa, U4 -> 0x05ff, yP -> 0x0604, DN -> 0x0609, TryCatch #26 {DN -> 0x0609, blocks: (B:182:0x04dc, B:187:0x04f1, B:366:0x0569, B:368:0x056d, B:370:0x0571, B:372:0x0577, B:374:0x057d, B:376:0x0583, B:378:0x0589, B:380:0x0591, B:382:0x05b0, B:384:0x05ba, B:385:0x05bf, B:387:0x05c4, B:389:0x05ca, B:391:0x05d2, B:393:0x05da, B:395:0x0616, B:399:0x061e, B:401:0x0629, B:403:0x0637, B:407:0x07e0, B:409:0x07e6, B:411:0x07ec, B:414:0x07f1, B:415:0x07fc, B:417:0x0801, B:423:0x0827, B:425:0x082d, B:429:0x083b, B:431:0x0843, B:436:0x0846, B:438:0x084f, B:492:0x091e, B:190:0x0929, B:192:0x0931, B:195:0x093b, B:197:0x0949, B:198:0x0962, B:200:0x0967, B:202:0x096f, B:204:0x0999, B:205:0x0974, B:207:0x097d, B:210:0x0986, B:215:0x0996, B:221:0x09a3, B:223:0x09a9, B:227:0x09b6, B:229:0x09f2, B:231:0x09f9, B:233:0x09fd, B:236:0x0a90, B:238:0x0a9d, B:240:0x0aae, B:241:0x0ab7, B:242:0x0b02, B:245:0x0b0a, B:247:0x0b0e, B:251:0x0b1b, B:253:0x0b1e, B:257:0x0b22, B:259:0x0b28, B:261:0x0b31, B:263:0x0b39, B:265:0x0b3f, B:267:0x0b45, B:268:0x0b67, B:270:0x0b6d, B:273:0x0b76, B:276:0x0b91, B:281:0x0b8a, B:283:0x0b8e, B:285:0x0b4c, B:288:0x0b5a, B:289:0x0b62, B:290:0x0b63, B:291:0x0abb, B:293:0x0ac1, B:295:0x0ac5, B:298:0x0ace, B:300:0x0ade, B:302:0x0ae4, B:304:0x0af0, B:306:0x0af5, B:308:0x0afa, B:309:0x0aff, B:312:0x0a0b, B:314:0x0a0f, B:316:0x0a21, B:317:0x0a2c, B:319:0x0a34, B:322:0x0a3d, B:324:0x0a47, B:329:0x0a52, B:335:0x09be, B:337:0x09c2, B:338:0x09dc, B:340:0x09e2, B:342:0x099c, B:440:0x0858, B:442:0x085c, B:444:0x0862, B:446:0x0868, B:448:0x0872, B:451:0x0878, B:452:0x087c, B:454:0x0885, B:456:0x0897, B:458:0x08a0, B:460:0x08a8, B:463:0x08b4, B:465:0x08dc, B:467:0x08e2, B:470:0x08e8, B:472:0x08f0, B:474:0x08f6, B:475:0x08f9, B:476:0x0902, B:478:0x0907, B:480:0x090d, B:482:0x0912, B:489:0x091d, B:531:0x0678, B:538:0x0689, B:542:0x069b, B:549:0x06c2, B:552:0x06fd, B:554:0x0730, B:556:0x0734, B:558:0x0744, B:560:0x0748, B:565:0x0750, B:567:0x0756, B:569:0x0778, B:574:0x0781, B:581:0x07aa, B:584:0x0786, B:587:0x078d, B:589:0x0795, B:591:0x079b, B:592:0x073a, B:501:0x07b5, B:503:0x07bb, B:505:0x07bf, B:508:0x07c5, B:514:0x07dd, B:515:0x07d4, B:517:0x07da), top: B:181:0x04dc }] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0b09  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0b6d A[Catch: RuntimeException -> 0x05f0, IOException -> 0x05f5, NH -> 0x05fa, U4 -> 0x05ff, yP -> 0x0604, DN -> 0x0609, TryCatch #26 {DN -> 0x0609, blocks: (B:182:0x04dc, B:187:0x04f1, B:366:0x0569, B:368:0x056d, B:370:0x0571, B:372:0x0577, B:374:0x057d, B:376:0x0583, B:378:0x0589, B:380:0x0591, B:382:0x05b0, B:384:0x05ba, B:385:0x05bf, B:387:0x05c4, B:389:0x05ca, B:391:0x05d2, B:393:0x05da, B:395:0x0616, B:399:0x061e, B:401:0x0629, B:403:0x0637, B:407:0x07e0, B:409:0x07e6, B:411:0x07ec, B:414:0x07f1, B:415:0x07fc, B:417:0x0801, B:423:0x0827, B:425:0x082d, B:429:0x083b, B:431:0x0843, B:436:0x0846, B:438:0x084f, B:492:0x091e, B:190:0x0929, B:192:0x0931, B:195:0x093b, B:197:0x0949, B:198:0x0962, B:200:0x0967, B:202:0x096f, B:204:0x0999, B:205:0x0974, B:207:0x097d, B:210:0x0986, B:215:0x0996, B:221:0x09a3, B:223:0x09a9, B:227:0x09b6, B:229:0x09f2, B:231:0x09f9, B:233:0x09fd, B:236:0x0a90, B:238:0x0a9d, B:240:0x0aae, B:241:0x0ab7, B:242:0x0b02, B:245:0x0b0a, B:247:0x0b0e, B:251:0x0b1b, B:253:0x0b1e, B:257:0x0b22, B:259:0x0b28, B:261:0x0b31, B:263:0x0b39, B:265:0x0b3f, B:267:0x0b45, B:268:0x0b67, B:270:0x0b6d, B:273:0x0b76, B:276:0x0b91, B:281:0x0b8a, B:283:0x0b8e, B:285:0x0b4c, B:288:0x0b5a, B:289:0x0b62, B:290:0x0b63, B:291:0x0abb, B:293:0x0ac1, B:295:0x0ac5, B:298:0x0ace, B:300:0x0ade, B:302:0x0ae4, B:304:0x0af0, B:306:0x0af5, B:308:0x0afa, B:309:0x0aff, B:312:0x0a0b, B:314:0x0a0f, B:316:0x0a21, B:317:0x0a2c, B:319:0x0a34, B:322:0x0a3d, B:324:0x0a47, B:329:0x0a52, B:335:0x09be, B:337:0x09c2, B:338:0x09dc, B:340:0x09e2, B:342:0x099c, B:440:0x0858, B:442:0x085c, B:444:0x0862, B:446:0x0868, B:448:0x0872, B:451:0x0878, B:452:0x087c, B:454:0x0885, B:456:0x0897, B:458:0x08a0, B:460:0x08a8, B:463:0x08b4, B:465:0x08dc, B:467:0x08e2, B:470:0x08e8, B:472:0x08f0, B:474:0x08f6, B:475:0x08f9, B:476:0x0902, B:478:0x0907, B:480:0x090d, B:482:0x0912, B:489:0x091d, B:531:0x0678, B:538:0x0689, B:542:0x069b, B:549:0x06c2, B:552:0x06fd, B:554:0x0730, B:556:0x0734, B:558:0x0744, B:560:0x0748, B:565:0x0750, B:567:0x0756, B:569:0x0778, B:574:0x0781, B:581:0x07aa, B:584:0x0786, B:587:0x078d, B:589:0x0795, B:591:0x079b, B:592:0x073a, B:501:0x07b5, B:503:0x07bb, B:505:0x07bf, B:508:0x07c5, B:514:0x07dd, B:515:0x07d4, B:517:0x07da), top: B:181:0x04dc }] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0b82 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0b83 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0ac1 A[Catch: RuntimeException -> 0x05f0, IOException -> 0x05f5, NH -> 0x05fa, U4 -> 0x05ff, yP -> 0x0604, DN -> 0x0609, TryCatch #26 {DN -> 0x0609, blocks: (B:182:0x04dc, B:187:0x04f1, B:366:0x0569, B:368:0x056d, B:370:0x0571, B:372:0x0577, B:374:0x057d, B:376:0x0583, B:378:0x0589, B:380:0x0591, B:382:0x05b0, B:384:0x05ba, B:385:0x05bf, B:387:0x05c4, B:389:0x05ca, B:391:0x05d2, B:393:0x05da, B:395:0x0616, B:399:0x061e, B:401:0x0629, B:403:0x0637, B:407:0x07e0, B:409:0x07e6, B:411:0x07ec, B:414:0x07f1, B:415:0x07fc, B:417:0x0801, B:423:0x0827, B:425:0x082d, B:429:0x083b, B:431:0x0843, B:436:0x0846, B:438:0x084f, B:492:0x091e, B:190:0x0929, B:192:0x0931, B:195:0x093b, B:197:0x0949, B:198:0x0962, B:200:0x0967, B:202:0x096f, B:204:0x0999, B:205:0x0974, B:207:0x097d, B:210:0x0986, B:215:0x0996, B:221:0x09a3, B:223:0x09a9, B:227:0x09b6, B:229:0x09f2, B:231:0x09f9, B:233:0x09fd, B:236:0x0a90, B:238:0x0a9d, B:240:0x0aae, B:241:0x0ab7, B:242:0x0b02, B:245:0x0b0a, B:247:0x0b0e, B:251:0x0b1b, B:253:0x0b1e, B:257:0x0b22, B:259:0x0b28, B:261:0x0b31, B:263:0x0b39, B:265:0x0b3f, B:267:0x0b45, B:268:0x0b67, B:270:0x0b6d, B:273:0x0b76, B:276:0x0b91, B:281:0x0b8a, B:283:0x0b8e, B:285:0x0b4c, B:288:0x0b5a, B:289:0x0b62, B:290:0x0b63, B:291:0x0abb, B:293:0x0ac1, B:295:0x0ac5, B:298:0x0ace, B:300:0x0ade, B:302:0x0ae4, B:304:0x0af0, B:306:0x0af5, B:308:0x0afa, B:309:0x0aff, B:312:0x0a0b, B:314:0x0a0f, B:316:0x0a21, B:317:0x0a2c, B:319:0x0a34, B:322:0x0a3d, B:324:0x0a47, B:329:0x0a52, B:335:0x09be, B:337:0x09c2, B:338:0x09dc, B:340:0x09e2, B:342:0x099c, B:440:0x0858, B:442:0x085c, B:444:0x0862, B:446:0x0868, B:448:0x0872, B:451:0x0878, B:452:0x087c, B:454:0x0885, B:456:0x0897, B:458:0x08a0, B:460:0x08a8, B:463:0x08b4, B:465:0x08dc, B:467:0x08e2, B:470:0x08e8, B:472:0x08f0, B:474:0x08f6, B:475:0x08f9, B:476:0x0902, B:478:0x0907, B:480:0x090d, B:482:0x0912, B:489:0x091d, B:531:0x0678, B:538:0x0689, B:542:0x069b, B:549:0x06c2, B:552:0x06fd, B:554:0x0730, B:556:0x0734, B:558:0x0744, B:560:0x0748, B:565:0x0750, B:567:0x0756, B:569:0x0778, B:574:0x0781, B:581:0x07aa, B:584:0x0786, B:587:0x078d, B:589:0x0795, B:591:0x079b, B:592:0x073a, B:501:0x07b5, B:503:0x07bb, B:505:0x07bf, B:508:0x07c5, B:514:0x07dd, B:515:0x07d4, B:517:0x07da), top: B:181:0x04dc }] */
    /* JADX WARN: Removed duplicated region for block: B:409:0x07e6 A[Catch: RuntimeException -> 0x05f0, IOException -> 0x05f5, NH -> 0x05fa, U4 -> 0x05ff, yP -> 0x0604, DN -> 0x0609, TryCatch #26 {DN -> 0x0609, blocks: (B:182:0x04dc, B:187:0x04f1, B:366:0x0569, B:368:0x056d, B:370:0x0571, B:372:0x0577, B:374:0x057d, B:376:0x0583, B:378:0x0589, B:380:0x0591, B:382:0x05b0, B:384:0x05ba, B:385:0x05bf, B:387:0x05c4, B:389:0x05ca, B:391:0x05d2, B:393:0x05da, B:395:0x0616, B:399:0x061e, B:401:0x0629, B:403:0x0637, B:407:0x07e0, B:409:0x07e6, B:411:0x07ec, B:414:0x07f1, B:415:0x07fc, B:417:0x0801, B:423:0x0827, B:425:0x082d, B:429:0x083b, B:431:0x0843, B:436:0x0846, B:438:0x084f, B:492:0x091e, B:190:0x0929, B:192:0x0931, B:195:0x093b, B:197:0x0949, B:198:0x0962, B:200:0x0967, B:202:0x096f, B:204:0x0999, B:205:0x0974, B:207:0x097d, B:210:0x0986, B:215:0x0996, B:221:0x09a3, B:223:0x09a9, B:227:0x09b6, B:229:0x09f2, B:231:0x09f9, B:233:0x09fd, B:236:0x0a90, B:238:0x0a9d, B:240:0x0aae, B:241:0x0ab7, B:242:0x0b02, B:245:0x0b0a, B:247:0x0b0e, B:251:0x0b1b, B:253:0x0b1e, B:257:0x0b22, B:259:0x0b28, B:261:0x0b31, B:263:0x0b39, B:265:0x0b3f, B:267:0x0b45, B:268:0x0b67, B:270:0x0b6d, B:273:0x0b76, B:276:0x0b91, B:281:0x0b8a, B:283:0x0b8e, B:285:0x0b4c, B:288:0x0b5a, B:289:0x0b62, B:290:0x0b63, B:291:0x0abb, B:293:0x0ac1, B:295:0x0ac5, B:298:0x0ace, B:300:0x0ade, B:302:0x0ae4, B:304:0x0af0, B:306:0x0af5, B:308:0x0afa, B:309:0x0aff, B:312:0x0a0b, B:314:0x0a0f, B:316:0x0a21, B:317:0x0a2c, B:319:0x0a34, B:322:0x0a3d, B:324:0x0a47, B:329:0x0a52, B:335:0x09be, B:337:0x09c2, B:338:0x09dc, B:340:0x09e2, B:342:0x099c, B:440:0x0858, B:442:0x085c, B:444:0x0862, B:446:0x0868, B:448:0x0872, B:451:0x0878, B:452:0x087c, B:454:0x0885, B:456:0x0897, B:458:0x08a0, B:460:0x08a8, B:463:0x08b4, B:465:0x08dc, B:467:0x08e2, B:470:0x08e8, B:472:0x08f0, B:474:0x08f6, B:475:0x08f9, B:476:0x0902, B:478:0x0907, B:480:0x090d, B:482:0x0912, B:489:0x091d, B:531:0x0678, B:538:0x0689, B:542:0x069b, B:549:0x06c2, B:552:0x06fd, B:554:0x0730, B:556:0x0734, B:558:0x0744, B:560:0x0748, B:565:0x0750, B:567:0x0756, B:569:0x0778, B:574:0x0781, B:581:0x07aa, B:584:0x0786, B:587:0x078d, B:589:0x0795, B:591:0x079b, B:592:0x073a, B:501:0x07b5, B:503:0x07bb, B:505:0x07bf, B:508:0x07c5, B:514:0x07dd, B:515:0x07d4, B:517:0x07da), top: B:181:0x04dc }] */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0801 A[Catch: RuntimeException -> 0x05f0, IOException -> 0x05f5, NH -> 0x05fa, U4 -> 0x05ff, yP -> 0x0604, DN -> 0x0609, LOOP:10: B:415:0x07fc->B:417:0x0801, LOOP_END, TryCatch #26 {DN -> 0x0609, blocks: (B:182:0x04dc, B:187:0x04f1, B:366:0x0569, B:368:0x056d, B:370:0x0571, B:372:0x0577, B:374:0x057d, B:376:0x0583, B:378:0x0589, B:380:0x0591, B:382:0x05b0, B:384:0x05ba, B:385:0x05bf, B:387:0x05c4, B:389:0x05ca, B:391:0x05d2, B:393:0x05da, B:395:0x0616, B:399:0x061e, B:401:0x0629, B:403:0x0637, B:407:0x07e0, B:409:0x07e6, B:411:0x07ec, B:414:0x07f1, B:415:0x07fc, B:417:0x0801, B:423:0x0827, B:425:0x082d, B:429:0x083b, B:431:0x0843, B:436:0x0846, B:438:0x084f, B:492:0x091e, B:190:0x0929, B:192:0x0931, B:195:0x093b, B:197:0x0949, B:198:0x0962, B:200:0x0967, B:202:0x096f, B:204:0x0999, B:205:0x0974, B:207:0x097d, B:210:0x0986, B:215:0x0996, B:221:0x09a3, B:223:0x09a9, B:227:0x09b6, B:229:0x09f2, B:231:0x09f9, B:233:0x09fd, B:236:0x0a90, B:238:0x0a9d, B:240:0x0aae, B:241:0x0ab7, B:242:0x0b02, B:245:0x0b0a, B:247:0x0b0e, B:251:0x0b1b, B:253:0x0b1e, B:257:0x0b22, B:259:0x0b28, B:261:0x0b31, B:263:0x0b39, B:265:0x0b3f, B:267:0x0b45, B:268:0x0b67, B:270:0x0b6d, B:273:0x0b76, B:276:0x0b91, B:281:0x0b8a, B:283:0x0b8e, B:285:0x0b4c, B:288:0x0b5a, B:289:0x0b62, B:290:0x0b63, B:291:0x0abb, B:293:0x0ac1, B:295:0x0ac5, B:298:0x0ace, B:300:0x0ade, B:302:0x0ae4, B:304:0x0af0, B:306:0x0af5, B:308:0x0afa, B:309:0x0aff, B:312:0x0a0b, B:314:0x0a0f, B:316:0x0a21, B:317:0x0a2c, B:319:0x0a34, B:322:0x0a3d, B:324:0x0a47, B:329:0x0a52, B:335:0x09be, B:337:0x09c2, B:338:0x09dc, B:340:0x09e2, B:342:0x099c, B:440:0x0858, B:442:0x085c, B:444:0x0862, B:446:0x0868, B:448:0x0872, B:451:0x0878, B:452:0x087c, B:454:0x0885, B:456:0x0897, B:458:0x08a0, B:460:0x08a8, B:463:0x08b4, B:465:0x08dc, B:467:0x08e2, B:470:0x08e8, B:472:0x08f0, B:474:0x08f6, B:475:0x08f9, B:476:0x0902, B:478:0x0907, B:480:0x090d, B:482:0x0912, B:489:0x091d, B:531:0x0678, B:538:0x0689, B:542:0x069b, B:549:0x06c2, B:552:0x06fd, B:554:0x0730, B:556:0x0734, B:558:0x0744, B:560:0x0748, B:565:0x0750, B:567:0x0756, B:569:0x0778, B:574:0x0781, B:581:0x07aa, B:584:0x0786, B:587:0x078d, B:589:0x0795, B:591:0x079b, B:592:0x073a, B:501:0x07b5, B:503:0x07bb, B:505:0x07bf, B:508:0x07c5, B:514:0x07dd, B:515:0x07d4, B:517:0x07da), top: B:181:0x04dc }] */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0821 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0858 A[Catch: RuntimeException -> 0x05f0, IOException -> 0x05f5, NH -> 0x05fa, U4 -> 0x05ff, yP -> 0x0604, DN -> 0x0609, TryCatch #26 {DN -> 0x0609, blocks: (B:182:0x04dc, B:187:0x04f1, B:366:0x0569, B:368:0x056d, B:370:0x0571, B:372:0x0577, B:374:0x057d, B:376:0x0583, B:378:0x0589, B:380:0x0591, B:382:0x05b0, B:384:0x05ba, B:385:0x05bf, B:387:0x05c4, B:389:0x05ca, B:391:0x05d2, B:393:0x05da, B:395:0x0616, B:399:0x061e, B:401:0x0629, B:403:0x0637, B:407:0x07e0, B:409:0x07e6, B:411:0x07ec, B:414:0x07f1, B:415:0x07fc, B:417:0x0801, B:423:0x0827, B:425:0x082d, B:429:0x083b, B:431:0x0843, B:436:0x0846, B:438:0x084f, B:492:0x091e, B:190:0x0929, B:192:0x0931, B:195:0x093b, B:197:0x0949, B:198:0x0962, B:200:0x0967, B:202:0x096f, B:204:0x0999, B:205:0x0974, B:207:0x097d, B:210:0x0986, B:215:0x0996, B:221:0x09a3, B:223:0x09a9, B:227:0x09b6, B:229:0x09f2, B:231:0x09f9, B:233:0x09fd, B:236:0x0a90, B:238:0x0a9d, B:240:0x0aae, B:241:0x0ab7, B:242:0x0b02, B:245:0x0b0a, B:247:0x0b0e, B:251:0x0b1b, B:253:0x0b1e, B:257:0x0b22, B:259:0x0b28, B:261:0x0b31, B:263:0x0b39, B:265:0x0b3f, B:267:0x0b45, B:268:0x0b67, B:270:0x0b6d, B:273:0x0b76, B:276:0x0b91, B:281:0x0b8a, B:283:0x0b8e, B:285:0x0b4c, B:288:0x0b5a, B:289:0x0b62, B:290:0x0b63, B:291:0x0abb, B:293:0x0ac1, B:295:0x0ac5, B:298:0x0ace, B:300:0x0ade, B:302:0x0ae4, B:304:0x0af0, B:306:0x0af5, B:308:0x0afa, B:309:0x0aff, B:312:0x0a0b, B:314:0x0a0f, B:316:0x0a21, B:317:0x0a2c, B:319:0x0a34, B:322:0x0a3d, B:324:0x0a47, B:329:0x0a52, B:335:0x09be, B:337:0x09c2, B:338:0x09dc, B:340:0x09e2, B:342:0x099c, B:440:0x0858, B:442:0x085c, B:444:0x0862, B:446:0x0868, B:448:0x0872, B:451:0x0878, B:452:0x087c, B:454:0x0885, B:456:0x0897, B:458:0x08a0, B:460:0x08a8, B:463:0x08b4, B:465:0x08dc, B:467:0x08e2, B:470:0x08e8, B:472:0x08f0, B:474:0x08f6, B:475:0x08f9, B:476:0x0902, B:478:0x0907, B:480:0x090d, B:482:0x0912, B:489:0x091d, B:531:0x0678, B:538:0x0689, B:542:0x069b, B:549:0x06c2, B:552:0x06fd, B:554:0x0730, B:556:0x0734, B:558:0x0744, B:560:0x0748, B:565:0x0750, B:567:0x0756, B:569:0x0778, B:574:0x0781, B:581:0x07aa, B:584:0x0786, B:587:0x078d, B:589:0x0795, B:591:0x079b, B:592:0x073a, B:501:0x07b5, B:503:0x07bb, B:505:0x07bf, B:508:0x07c5, B:514:0x07dd, B:515:0x07d4, B:517:0x07da), top: B:181:0x04dc }] */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0878 A[Catch: RuntimeException -> 0x05f0, IOException -> 0x05f5, NH -> 0x05fa, U4 -> 0x05ff, yP -> 0x0604, DN -> 0x0609, TryCatch #26 {DN -> 0x0609, blocks: (B:182:0x04dc, B:187:0x04f1, B:366:0x0569, B:368:0x056d, B:370:0x0571, B:372:0x0577, B:374:0x057d, B:376:0x0583, B:378:0x0589, B:380:0x0591, B:382:0x05b0, B:384:0x05ba, B:385:0x05bf, B:387:0x05c4, B:389:0x05ca, B:391:0x05d2, B:393:0x05da, B:395:0x0616, B:399:0x061e, B:401:0x0629, B:403:0x0637, B:407:0x07e0, B:409:0x07e6, B:411:0x07ec, B:414:0x07f1, B:415:0x07fc, B:417:0x0801, B:423:0x0827, B:425:0x082d, B:429:0x083b, B:431:0x0843, B:436:0x0846, B:438:0x084f, B:492:0x091e, B:190:0x0929, B:192:0x0931, B:195:0x093b, B:197:0x0949, B:198:0x0962, B:200:0x0967, B:202:0x096f, B:204:0x0999, B:205:0x0974, B:207:0x097d, B:210:0x0986, B:215:0x0996, B:221:0x09a3, B:223:0x09a9, B:227:0x09b6, B:229:0x09f2, B:231:0x09f9, B:233:0x09fd, B:236:0x0a90, B:238:0x0a9d, B:240:0x0aae, B:241:0x0ab7, B:242:0x0b02, B:245:0x0b0a, B:247:0x0b0e, B:251:0x0b1b, B:253:0x0b1e, B:257:0x0b22, B:259:0x0b28, B:261:0x0b31, B:263:0x0b39, B:265:0x0b3f, B:267:0x0b45, B:268:0x0b67, B:270:0x0b6d, B:273:0x0b76, B:276:0x0b91, B:281:0x0b8a, B:283:0x0b8e, B:285:0x0b4c, B:288:0x0b5a, B:289:0x0b62, B:290:0x0b63, B:291:0x0abb, B:293:0x0ac1, B:295:0x0ac5, B:298:0x0ace, B:300:0x0ade, B:302:0x0ae4, B:304:0x0af0, B:306:0x0af5, B:308:0x0afa, B:309:0x0aff, B:312:0x0a0b, B:314:0x0a0f, B:316:0x0a21, B:317:0x0a2c, B:319:0x0a34, B:322:0x0a3d, B:324:0x0a47, B:329:0x0a52, B:335:0x09be, B:337:0x09c2, B:338:0x09dc, B:340:0x09e2, B:342:0x099c, B:440:0x0858, B:442:0x085c, B:444:0x0862, B:446:0x0868, B:448:0x0872, B:451:0x0878, B:452:0x087c, B:454:0x0885, B:456:0x0897, B:458:0x08a0, B:460:0x08a8, B:463:0x08b4, B:465:0x08dc, B:467:0x08e2, B:470:0x08e8, B:472:0x08f0, B:474:0x08f6, B:475:0x08f9, B:476:0x0902, B:478:0x0907, B:480:0x090d, B:482:0x0912, B:489:0x091d, B:531:0x0678, B:538:0x0689, B:542:0x069b, B:549:0x06c2, B:552:0x06fd, B:554:0x0730, B:556:0x0734, B:558:0x0744, B:560:0x0748, B:565:0x0750, B:567:0x0756, B:569:0x0778, B:574:0x0781, B:581:0x07aa, B:584:0x0786, B:587:0x078d, B:589:0x0795, B:591:0x079b, B:592:0x073a, B:501:0x07b5, B:503:0x07bb, B:505:0x07bf, B:508:0x07c5, B:514:0x07dd, B:515:0x07d4, B:517:0x07da), top: B:181:0x04dc }] */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0885 A[Catch: RuntimeException -> 0x05f0, IOException -> 0x05f5, NH -> 0x05fa, U4 -> 0x05ff, yP -> 0x0604, DN -> 0x0609, TryCatch #26 {DN -> 0x0609, blocks: (B:182:0x04dc, B:187:0x04f1, B:366:0x0569, B:368:0x056d, B:370:0x0571, B:372:0x0577, B:374:0x057d, B:376:0x0583, B:378:0x0589, B:380:0x0591, B:382:0x05b0, B:384:0x05ba, B:385:0x05bf, B:387:0x05c4, B:389:0x05ca, B:391:0x05d2, B:393:0x05da, B:395:0x0616, B:399:0x061e, B:401:0x0629, B:403:0x0637, B:407:0x07e0, B:409:0x07e6, B:411:0x07ec, B:414:0x07f1, B:415:0x07fc, B:417:0x0801, B:423:0x0827, B:425:0x082d, B:429:0x083b, B:431:0x0843, B:436:0x0846, B:438:0x084f, B:492:0x091e, B:190:0x0929, B:192:0x0931, B:195:0x093b, B:197:0x0949, B:198:0x0962, B:200:0x0967, B:202:0x096f, B:204:0x0999, B:205:0x0974, B:207:0x097d, B:210:0x0986, B:215:0x0996, B:221:0x09a3, B:223:0x09a9, B:227:0x09b6, B:229:0x09f2, B:231:0x09f9, B:233:0x09fd, B:236:0x0a90, B:238:0x0a9d, B:240:0x0aae, B:241:0x0ab7, B:242:0x0b02, B:245:0x0b0a, B:247:0x0b0e, B:251:0x0b1b, B:253:0x0b1e, B:257:0x0b22, B:259:0x0b28, B:261:0x0b31, B:263:0x0b39, B:265:0x0b3f, B:267:0x0b45, B:268:0x0b67, B:270:0x0b6d, B:273:0x0b76, B:276:0x0b91, B:281:0x0b8a, B:283:0x0b8e, B:285:0x0b4c, B:288:0x0b5a, B:289:0x0b62, B:290:0x0b63, B:291:0x0abb, B:293:0x0ac1, B:295:0x0ac5, B:298:0x0ace, B:300:0x0ade, B:302:0x0ae4, B:304:0x0af0, B:306:0x0af5, B:308:0x0afa, B:309:0x0aff, B:312:0x0a0b, B:314:0x0a0f, B:316:0x0a21, B:317:0x0a2c, B:319:0x0a34, B:322:0x0a3d, B:324:0x0a47, B:329:0x0a52, B:335:0x09be, B:337:0x09c2, B:338:0x09dc, B:340:0x09e2, B:342:0x099c, B:440:0x0858, B:442:0x085c, B:444:0x0862, B:446:0x0868, B:448:0x0872, B:451:0x0878, B:452:0x087c, B:454:0x0885, B:456:0x0897, B:458:0x08a0, B:460:0x08a8, B:463:0x08b4, B:465:0x08dc, B:467:0x08e2, B:470:0x08e8, B:472:0x08f0, B:474:0x08f6, B:475:0x08f9, B:476:0x0902, B:478:0x0907, B:480:0x090d, B:482:0x0912, B:489:0x091d, B:531:0x0678, B:538:0x0689, B:542:0x069b, B:549:0x06c2, B:552:0x06fd, B:554:0x0730, B:556:0x0734, B:558:0x0744, B:560:0x0748, B:565:0x0750, B:567:0x0756, B:569:0x0778, B:574:0x0781, B:581:0x07aa, B:584:0x0786, B:587:0x078d, B:589:0x0795, B:591:0x079b, B:592:0x073a, B:501:0x07b5, B:503:0x07bb, B:505:0x07bf, B:508:0x07c5, B:514:0x07dd, B:515:0x07d4, B:517:0x07da), top: B:181:0x04dc }] */
    /* JADX WARN: Removed duplicated region for block: B:470:0x08e8 A[Catch: RuntimeException -> 0x05f0, IOException -> 0x05f5, NH -> 0x05fa, U4 -> 0x05ff, yP -> 0x0604, DN -> 0x0609, LOOP:13: B:468:0x08e5->B:470:0x08e8, LOOP_END, TryCatch #26 {DN -> 0x0609, blocks: (B:182:0x04dc, B:187:0x04f1, B:366:0x0569, B:368:0x056d, B:370:0x0571, B:372:0x0577, B:374:0x057d, B:376:0x0583, B:378:0x0589, B:380:0x0591, B:382:0x05b0, B:384:0x05ba, B:385:0x05bf, B:387:0x05c4, B:389:0x05ca, B:391:0x05d2, B:393:0x05da, B:395:0x0616, B:399:0x061e, B:401:0x0629, B:403:0x0637, B:407:0x07e0, B:409:0x07e6, B:411:0x07ec, B:414:0x07f1, B:415:0x07fc, B:417:0x0801, B:423:0x0827, B:425:0x082d, B:429:0x083b, B:431:0x0843, B:436:0x0846, B:438:0x084f, B:492:0x091e, B:190:0x0929, B:192:0x0931, B:195:0x093b, B:197:0x0949, B:198:0x0962, B:200:0x0967, B:202:0x096f, B:204:0x0999, B:205:0x0974, B:207:0x097d, B:210:0x0986, B:215:0x0996, B:221:0x09a3, B:223:0x09a9, B:227:0x09b6, B:229:0x09f2, B:231:0x09f9, B:233:0x09fd, B:236:0x0a90, B:238:0x0a9d, B:240:0x0aae, B:241:0x0ab7, B:242:0x0b02, B:245:0x0b0a, B:247:0x0b0e, B:251:0x0b1b, B:253:0x0b1e, B:257:0x0b22, B:259:0x0b28, B:261:0x0b31, B:263:0x0b39, B:265:0x0b3f, B:267:0x0b45, B:268:0x0b67, B:270:0x0b6d, B:273:0x0b76, B:276:0x0b91, B:281:0x0b8a, B:283:0x0b8e, B:285:0x0b4c, B:288:0x0b5a, B:289:0x0b62, B:290:0x0b63, B:291:0x0abb, B:293:0x0ac1, B:295:0x0ac5, B:298:0x0ace, B:300:0x0ade, B:302:0x0ae4, B:304:0x0af0, B:306:0x0af5, B:308:0x0afa, B:309:0x0aff, B:312:0x0a0b, B:314:0x0a0f, B:316:0x0a21, B:317:0x0a2c, B:319:0x0a34, B:322:0x0a3d, B:324:0x0a47, B:329:0x0a52, B:335:0x09be, B:337:0x09c2, B:338:0x09dc, B:340:0x09e2, B:342:0x099c, B:440:0x0858, B:442:0x085c, B:444:0x0862, B:446:0x0868, B:448:0x0872, B:451:0x0878, B:452:0x087c, B:454:0x0885, B:456:0x0897, B:458:0x08a0, B:460:0x08a8, B:463:0x08b4, B:465:0x08dc, B:467:0x08e2, B:470:0x08e8, B:472:0x08f0, B:474:0x08f6, B:475:0x08f9, B:476:0x0902, B:478:0x0907, B:480:0x090d, B:482:0x0912, B:489:0x091d, B:531:0x0678, B:538:0x0689, B:542:0x069b, B:549:0x06c2, B:552:0x06fd, B:554:0x0730, B:556:0x0734, B:558:0x0744, B:560:0x0748, B:565:0x0750, B:567:0x0756, B:569:0x0778, B:574:0x0781, B:581:0x07aa, B:584:0x0786, B:587:0x078d, B:589:0x0795, B:591:0x079b, B:592:0x073a, B:501:0x07b5, B:503:0x07bb, B:505:0x07bf, B:508:0x07c5, B:514:0x07dd, B:515:0x07d4, B:517:0x07da), top: B:181:0x04dc }] */
    /* JADX WARN: Removed duplicated region for block: B:474:0x08f6 A[Catch: RuntimeException -> 0x05f0, IOException -> 0x05f5, NH -> 0x05fa, U4 -> 0x05ff, yP -> 0x0604, DN -> 0x0609, TryCatch #26 {DN -> 0x0609, blocks: (B:182:0x04dc, B:187:0x04f1, B:366:0x0569, B:368:0x056d, B:370:0x0571, B:372:0x0577, B:374:0x057d, B:376:0x0583, B:378:0x0589, B:380:0x0591, B:382:0x05b0, B:384:0x05ba, B:385:0x05bf, B:387:0x05c4, B:389:0x05ca, B:391:0x05d2, B:393:0x05da, B:395:0x0616, B:399:0x061e, B:401:0x0629, B:403:0x0637, B:407:0x07e0, B:409:0x07e6, B:411:0x07ec, B:414:0x07f1, B:415:0x07fc, B:417:0x0801, B:423:0x0827, B:425:0x082d, B:429:0x083b, B:431:0x0843, B:436:0x0846, B:438:0x084f, B:492:0x091e, B:190:0x0929, B:192:0x0931, B:195:0x093b, B:197:0x0949, B:198:0x0962, B:200:0x0967, B:202:0x096f, B:204:0x0999, B:205:0x0974, B:207:0x097d, B:210:0x0986, B:215:0x0996, B:221:0x09a3, B:223:0x09a9, B:227:0x09b6, B:229:0x09f2, B:231:0x09f9, B:233:0x09fd, B:236:0x0a90, B:238:0x0a9d, B:240:0x0aae, B:241:0x0ab7, B:242:0x0b02, B:245:0x0b0a, B:247:0x0b0e, B:251:0x0b1b, B:253:0x0b1e, B:257:0x0b22, B:259:0x0b28, B:261:0x0b31, B:263:0x0b39, B:265:0x0b3f, B:267:0x0b45, B:268:0x0b67, B:270:0x0b6d, B:273:0x0b76, B:276:0x0b91, B:281:0x0b8a, B:283:0x0b8e, B:285:0x0b4c, B:288:0x0b5a, B:289:0x0b62, B:290:0x0b63, B:291:0x0abb, B:293:0x0ac1, B:295:0x0ac5, B:298:0x0ace, B:300:0x0ade, B:302:0x0ae4, B:304:0x0af0, B:306:0x0af5, B:308:0x0afa, B:309:0x0aff, B:312:0x0a0b, B:314:0x0a0f, B:316:0x0a21, B:317:0x0a2c, B:319:0x0a34, B:322:0x0a3d, B:324:0x0a47, B:329:0x0a52, B:335:0x09be, B:337:0x09c2, B:338:0x09dc, B:340:0x09e2, B:342:0x099c, B:440:0x0858, B:442:0x085c, B:444:0x0862, B:446:0x0868, B:448:0x0872, B:451:0x0878, B:452:0x087c, B:454:0x0885, B:456:0x0897, B:458:0x08a0, B:460:0x08a8, B:463:0x08b4, B:465:0x08dc, B:467:0x08e2, B:470:0x08e8, B:472:0x08f0, B:474:0x08f6, B:475:0x08f9, B:476:0x0902, B:478:0x0907, B:480:0x090d, B:482:0x0912, B:489:0x091d, B:531:0x0678, B:538:0x0689, B:542:0x069b, B:549:0x06c2, B:552:0x06fd, B:554:0x0730, B:556:0x0734, B:558:0x0744, B:560:0x0748, B:565:0x0750, B:567:0x0756, B:569:0x0778, B:574:0x0781, B:581:0x07aa, B:584:0x0786, B:587:0x078d, B:589:0x0795, B:591:0x079b, B:592:0x073a, B:501:0x07b5, B:503:0x07bb, B:505:0x07bf, B:508:0x07c5, B:514:0x07dd, B:515:0x07d4, B:517:0x07da), top: B:181:0x04dc }] */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0907 A[Catch: RuntimeException -> 0x05f0, IOException -> 0x05f5, NH -> 0x05fa, U4 -> 0x05ff, yP -> 0x0604, DN -> 0x0609, TryCatch #26 {DN -> 0x0609, blocks: (B:182:0x04dc, B:187:0x04f1, B:366:0x0569, B:368:0x056d, B:370:0x0571, B:372:0x0577, B:374:0x057d, B:376:0x0583, B:378:0x0589, B:380:0x0591, B:382:0x05b0, B:384:0x05ba, B:385:0x05bf, B:387:0x05c4, B:389:0x05ca, B:391:0x05d2, B:393:0x05da, B:395:0x0616, B:399:0x061e, B:401:0x0629, B:403:0x0637, B:407:0x07e0, B:409:0x07e6, B:411:0x07ec, B:414:0x07f1, B:415:0x07fc, B:417:0x0801, B:423:0x0827, B:425:0x082d, B:429:0x083b, B:431:0x0843, B:436:0x0846, B:438:0x084f, B:492:0x091e, B:190:0x0929, B:192:0x0931, B:195:0x093b, B:197:0x0949, B:198:0x0962, B:200:0x0967, B:202:0x096f, B:204:0x0999, B:205:0x0974, B:207:0x097d, B:210:0x0986, B:215:0x0996, B:221:0x09a3, B:223:0x09a9, B:227:0x09b6, B:229:0x09f2, B:231:0x09f9, B:233:0x09fd, B:236:0x0a90, B:238:0x0a9d, B:240:0x0aae, B:241:0x0ab7, B:242:0x0b02, B:245:0x0b0a, B:247:0x0b0e, B:251:0x0b1b, B:253:0x0b1e, B:257:0x0b22, B:259:0x0b28, B:261:0x0b31, B:263:0x0b39, B:265:0x0b3f, B:267:0x0b45, B:268:0x0b67, B:270:0x0b6d, B:273:0x0b76, B:276:0x0b91, B:281:0x0b8a, B:283:0x0b8e, B:285:0x0b4c, B:288:0x0b5a, B:289:0x0b62, B:290:0x0b63, B:291:0x0abb, B:293:0x0ac1, B:295:0x0ac5, B:298:0x0ace, B:300:0x0ade, B:302:0x0ae4, B:304:0x0af0, B:306:0x0af5, B:308:0x0afa, B:309:0x0aff, B:312:0x0a0b, B:314:0x0a0f, B:316:0x0a21, B:317:0x0a2c, B:319:0x0a34, B:322:0x0a3d, B:324:0x0a47, B:329:0x0a52, B:335:0x09be, B:337:0x09c2, B:338:0x09dc, B:340:0x09e2, B:342:0x099c, B:440:0x0858, B:442:0x085c, B:444:0x0862, B:446:0x0868, B:448:0x0872, B:451:0x0878, B:452:0x087c, B:454:0x0885, B:456:0x0897, B:458:0x08a0, B:460:0x08a8, B:463:0x08b4, B:465:0x08dc, B:467:0x08e2, B:470:0x08e8, B:472:0x08f0, B:474:0x08f6, B:475:0x08f9, B:476:0x0902, B:478:0x0907, B:480:0x090d, B:482:0x0912, B:489:0x091d, B:531:0x0678, B:538:0x0689, B:542:0x069b, B:549:0x06c2, B:552:0x06fd, B:554:0x0730, B:556:0x0734, B:558:0x0744, B:560:0x0748, B:565:0x0750, B:567:0x0756, B:569:0x0778, B:574:0x0781, B:581:0x07aa, B:584:0x0786, B:587:0x078d, B:589:0x0795, B:591:0x079b, B:592:0x073a, B:501:0x07b5, B:503:0x07bb, B:505:0x07bf, B:508:0x07c5, B:514:0x07dd, B:515:0x07d4, B:517:0x07da), top: B:181:0x04dc }] */
    /* JADX WARN: Removed duplicated region for block: B:488:0x091d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:498:0x0658 A[Catch: RuntimeException -> 0x05f0, IOException -> 0x05f5, NH -> 0x05fa, U4 -> 0x05ff, yP -> 0x0604, DN -> 0x0924, TRY_LEAVE, TryCatch #5 {DN -> 0x0924, blocks: (B:344:0x04f9, B:346:0x0508, B:360:0x054f, B:363:0x0562, B:404:0x064a, B:498:0x0658, B:690:0x055f), top: B:343:0x04f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:621:0x0c69 A[ADDED_TO_REGION, LOOP:20: B:621:0x0c69->B:624:0x0c71, LOOP_START, PHI: r2
      0x0c69: PHI (r2v34 com.google.android.gms.internal.ads.cO) = (r2v32 com.google.android.gms.internal.ads.cO), (r2v35 com.google.android.gms.internal.ads.cO) binds: [B:620:0x0c66, B:624:0x0c71] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:629:0x0c80  */
    /* JADX WARN: Removed duplicated region for block: B:632:0x0c8f  */
    /* JADX WARN: Removed duplicated region for block: B:635:0x0c99  */
    /* JADX WARN: Removed duplicated region for block: B:664:0x0bf3  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        int i;
        DN dn;
        boolean z3;
        int i6;
        C3676oQ c3676oQ;
        C3136eO c3136eO;
        C3029cO u3;
        C3029cO t6;
        long uptimeMillis;
        C3212ft c3212ft;
        C3566mO c3566mO;
        int i9;
        C3136eO c3136eO2;
        long j6;
        C3029cO t9;
        DN dn2;
        int i10;
        long j9;
        int i11;
        int i12;
        boolean z6;
        C3029cO t10;
        boolean z9;
        int i13;
        C3029cO s9;
        C3029cO i14;
        C3029cO x9;
        char c9;
        boolean z10;
        int i15;
        int i16;
        C3029cO t11;
        C3918t k9;
        int i17;
        int i18;
        D0.H[] hArr;
        C3029cO u6;
        C3918t c3918t;
        int i19;
        C3083dO p9;
        C3029cO s10;
        boolean z11;
        boolean z12;
        long j10;
        long j11;
        int i20;
        boolean g4;
        Message message2 = message;
        try {
            try {
            } catch (RuntimeException e9) {
                e = e9;
            }
        } catch (DN e10) {
            e = e10;
        } catch (NH e11) {
            e = e11;
        } catch (U4 e12) {
            e = e12;
        } catch (C4214yP e13) {
            e = e13;
        } catch (IOException e14) {
            e = e14;
        }
        switch (message2.what) {
            case 1:
                boolean z13 = message2.arg1 != 0;
                int i21 = message2.arg2;
                this.f28172n0.f(1);
                f(this.f28163R.b(this.f28170Z.f31952e, z13), i21 >> 4, i21 & 15, z13);
                z3 = true;
                d(message2.what);
                return z3;
            case 2:
                z3 = true;
                try {
                    try {
                        uptimeMillis = SystemClock.uptimeMillis();
                        c3212ft = this.f28189z;
                        c3212ft.d(2);
                        c3566mO = this.f28170Z;
                        i9 = c3566mO.f31952e;
                    } catch (DN e15) {
                        e = e15;
                    }
                } catch (NH e16) {
                    e = e16;
                } catch (U4 e17) {
                    e = e17;
                } catch (C4214yP e18) {
                    e = e18;
                } catch (IOException e19) {
                    e = e19;
                } catch (RuntimeException e20) {
                    e = e20;
                }
                if (i9 == 1) {
                    message2 = message;
                } else if (i9 != 4) {
                    if (!c3566mO.f31948a.g()) {
                        try {
                        } catch (DN e21) {
                            e = e21;
                        }
                        if (this.f28156K.d()) {
                            C3136eO c3136eO3 = this.J;
                            c3136eO3.n(this.f28190z0);
                            if (c3136eO3.o() && (p9 = c3136eO3.p(this.f28190z0, this.f28170Z)) != null) {
                                C3029cO q8 = c3136eO3.q(p9);
                                if (!q8.f29476d) {
                                    long j12 = p9.f29761b;
                                    q8.f29476d = true;
                                    q8.f29473a.b(this, j12);
                                } else if (q8.f29477e) {
                                    c3212ft.b(8, q8.f29473a).a();
                                }
                                if (c3136eO3.s() == q8) {
                                    s(p9.f29761b, true);
                                }
                                Q(false);
                            }
                            if (this.f28178t0) {
                                this.f28178t0 = A(c3136eO3.f29923k);
                                M();
                            } else {
                                L();
                            }
                            if (!this.f28175q0 && this.f28162Q && !this.f28152H0 && !V() && (u6 = c3136eO3.u()) != null && u6 == c3136eO3.t() && u6.i() != null && u6.i().f29477e) {
                                AbstractC2772Sd.H(u6.i().f29477e);
                                if (((long) ((r0.a() - this.f28190z0) / this.f28147F.j().f34216a)) <= 10000000) {
                                    c3136eO3.w();
                                    c3136eO2 = c3136eO3;
                                    C3029cO u9 = c3136eO2.u();
                                    if (u9 != null) {
                                        C3918t k10 = u9.k();
                                        int i22 = 0;
                                        while (true) {
                                            D0.H[] hArr2 = this.f28171n;
                                            if (i22 < 2) {
                                                if (k10.c(i22) && hArr2[i22].o() && !hArr2[i22].q()) {
                                                    hArr2[i22].p();
                                                    c3918t = k10;
                                                    i19 = i22;
                                                    P(u9, i19, false, u9.a());
                                                } else {
                                                    c3918t = k10;
                                                    i19 = i22;
                                                }
                                                i22 = i19 + 1;
                                                k10 = c3918t;
                                            } else {
                                                j6 = com.anythink.basead.exoplayer.b.f6382b;
                                                if (V()) {
                                                    this.f28150G0 = u9.f29473a.w();
                                                    if (!u9.b()) {
                                                        c3136eO2.y(u9);
                                                        Q(false);
                                                        L();
                                                    }
                                                }
                                                t9 = c3136eO2.t();
                                                if (t9 != null) {
                                                    if (t9.i() != null) {
                                                        try {
                                                            if (!this.f28175q0) {
                                                                C3029cO t12 = c3136eO2.t();
                                                                if (t12.f29477e) {
                                                                    int i23 = 0;
                                                                    while (true) {
                                                                        D0.H[] hArr3 = this.f28171n;
                                                                        if (i23 < 2) {
                                                                            if (hArr3[i23].z(t12)) {
                                                                                i23++;
                                                                            }
                                                                        } else if ((!V() || c3136eO2.u() != c3136eO2.t()) && (t9.i().f29477e || this.f28190z0 >= t9.i().a())) {
                                                                            if (t9.i().f29477e) {
                                                                                AbstractC2772Sd.H(t9.i().f29477e);
                                                                                dn2 = null;
                                                                                i10 = 1;
                                                                                if (((long) ((r3.a() - this.f28190z0) / this.f28147F.j().f34216a)) > 10000000) {
                                                                                    j9 = uptimeMillis;
                                                                                }
                                                                            } else {
                                                                                dn2 = null;
                                                                                i10 = 1;
                                                                            }
                                                                            C3918t k11 = t9.k();
                                                                            C3029cO v9 = c3136eO2.v();
                                                                            C3918t k12 = v9.k();
                                                                            AbstractC3604n8 abstractC3604n8 = this.f28170Z.f31948a;
                                                                            j9 = uptimeMillis;
                                                                            G(abstractC3604n8, v9.f29479g.f29760a, abstractC3604n8, t9.f29479g.f29760a, com.anythink.basead.exoplayer.b.f6382b, false);
                                                                            if (!v9.f29477e || ((!(z6 = this.f28162Q) || this.f28150G0 == j6) && v9.f29473a.w() == j6)) {
                                                                                i11 = 0;
                                                                                i12 = 2;
                                                                            } else {
                                                                                this.f28150G0 = j6;
                                                                                if (z6 && !this.f28152H0) {
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        i12 = 2;
                                                                                        if (i24 < 2) {
                                                                                            if (k12.c(i24)) {
                                                                                                int i25 = ((RP) hArr3[i24].f539e).f27272u;
                                                                                                InterfaceC3757q[] interfaceC3757qArr = (InterfaceC3757q[]) k12.f34179v;
                                                                                                if (!H4.d(interfaceC3757qArr[i24].i().f24431o, interfaceC3757qArr[i24].i().f24427k) && !hArr3[i24].q()) {
                                                                                                }
                                                                                            }
                                                                                            i24++;
                                                                                        } else {
                                                                                            i11 = 0;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v9.a();
                                                                                for (int i26 = 0; i26 < 2; i26++) {
                                                                                    hArr3[i26].v();
                                                                                }
                                                                                if (!v9.b()) {
                                                                                    c3136eO2.y(v9);
                                                                                    Q(false);
                                                                                    L();
                                                                                }
                                                                            }
                                                                            while (i11 < i12) {
                                                                                D0.H h9 = hArr3[i11];
                                                                                v9.a();
                                                                                h9.u(k11, k12);
                                                                                i11++;
                                                                                i12 = 2;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } catch (DN e22) {
                                                            e = e22;
                                                            message2 = message;
                                                            if (e.f24388v == 1) {
                                                                e = e.a(t6.f29479g.f29760a);
                                                                break;
                                                            }
                                                            if (e.f24388v == 1) {
                                                                int i27 = e.f24390x;
                                                                c3136eO = this.J;
                                                                if (c3136eO.u() != null) {
                                                                    this.f28152H0 = true;
                                                                    C();
                                                                    u3 = c3136eO.u();
                                                                    C3029cO s11 = c3136eO.s();
                                                                    if (c3136eO.s() != u3) {
                                                                    }
                                                                    c3136eO.y(s11);
                                                                    if (this.f28170Z.f31952e != 4) {
                                                                    }
                                                                    z3 = true;
                                                                    d(message2.what);
                                                                    return z3;
                                                                }
                                                                break;
                                                            }
                                                            dn = this.f28144D0;
                                                            if (dn != null) {
                                                            }
                                                            if (e.f24388v == 1) {
                                                            }
                                                            if (e.f24385B) {
                                                                break;
                                                            }
                                                            AbstractC2968bG.J("ExoPlayerImplInternal", "Playback error", e);
                                                            z3 = true;
                                                            u(true, false);
                                                            this.f28170Z = this.f28170Z.e(e);
                                                            d(message2.what);
                                                            return z3;
                                                        } catch (NH e23) {
                                                            e = e23;
                                                            message2 = message;
                                                            b(e, e.f26478n);
                                                            z3 = true;
                                                            d(message2.what);
                                                            return z3;
                                                        } catch (U4 e24) {
                                                            e = e24;
                                                            message2 = message;
                                                            b(e, e.f27886u == 1 ? true != e.f27885n ? 3003 : AdError.MEDIATION_ERROR_CODE : 1000);
                                                            z3 = true;
                                                            d(message2.what);
                                                            return z3;
                                                        } catch (C4214yP e25) {
                                                            e = e25;
                                                            message2 = message;
                                                            b(e, e.f35157n);
                                                            z3 = true;
                                                            d(message2.what);
                                                            return z3;
                                                        } catch (IOException e26) {
                                                            e = e26;
                                                            message2 = message;
                                                            b(e, 2000);
                                                            z3 = true;
                                                            d(message2.what);
                                                            return z3;
                                                        } catch (RuntimeException e27) {
                                                            e = e27;
                                                            message2 = message;
                                                            i = 1004;
                                                            if (!(e instanceof IllegalStateException) && !(e instanceof IllegalArgumentException)) {
                                                                i = 1000;
                                                            }
                                                            DN dn3 = new DN(2, e, i);
                                                            AbstractC2968bG.J("ExoPlayerImplInternal", "Playback error", dn3);
                                                            u(true, false);
                                                            this.f28170Z = this.f28170Z.e(dn3);
                                                            z3 = true;
                                                            d(message2.what);
                                                            return z3;
                                                        }
                                                    }
                                                    j9 = uptimeMillis;
                                                    dn2 = null;
                                                    i10 = 1;
                                                    if (t9.f29479g.f29767h || this.f28175q0) {
                                                        D0.H[] hArr4 = this.f28171n;
                                                        for (int i28 = 0; i28 < 2; i28++) {
                                                            D0.H h10 = hArr4[i28];
                                                            if ((h10.m(t9) != null) && h10.s(t9)) {
                                                                h10.t(t9);
                                                            }
                                                        }
                                                    }
                                                    t10 = c3136eO2.t();
                                                    if (t10 != null && c3136eO2.s() != t10 && !t10.f29480h) {
                                                        t11 = c3136eO2.t();
                                                        k9 = t11.k();
                                                        i17 = i10;
                                                        i18 = 0;
                                                        while (true) {
                                                            hArr = this.f28171n;
                                                            if (i18 >= 2) {
                                                                int r9 = hArr[i18].r();
                                                                int c10 = hArr[i18].c(t11, k9, this.f28147F);
                                                                this.f28186x0 -= r9 - hArr[i18].r();
                                                                i17 &= c10 & 1;
                                                                i18++;
                                                            } else if (i17 != 0) {
                                                                for (int i29 = 0; i29 < 2; i29++) {
                                                                    if (k9.c(i29)) {
                                                                        if ((hArr[i29].m(t11) != null ? i10 : 0) == 0) {
                                                                            P(t11, i29, false, t11.a());
                                                                        }
                                                                    }
                                                                }
                                                                c3136eO2.t().f29480h = i10;
                                                            }
                                                        }
                                                    }
                                                    z9 = false;
                                                    while (T() && !this.f28175q0 && (s9 = c3136eO2.s()) != null && (i14 = s9.i()) != null && this.f28190z0 >= i14.a() && i14.f29480h) {
                                                        if (z9) {
                                                            d(-1);
                                                        }
                                                        this.f28152H0 = false;
                                                        x9 = c3136eO2.x();
                                                        if (x9 != null) {
                                                            throw dn2;
                                                        }
                                                        if (this.f28170Z.f31949b.f32905a.equals(x9.f29479g.f29760a.f32905a)) {
                                                            C3676oQ c3676oQ2 = this.f28170Z.f31949b;
                                                            c9 = 65535;
                                                            if (c3676oQ2.f32906b == -1) {
                                                                C3676oQ c3676oQ3 = x9.f29479g.f29760a;
                                                                if (c3676oQ3.f32906b == -1 && c3676oQ2.f32909e != c3676oQ3.f32909e) {
                                                                    z10 = true;
                                                                    C3083dO c3083dO = x9.f29479g;
                                                                    C3676oQ c3676oQ4 = c3083dO.f29760a;
                                                                    boolean z14 = z10;
                                                                    long j13 = c3083dO.f29761b;
                                                                    this.f28170Z = N(c3676oQ4, j13, c3083dO.f29763d, j13, !z14, 0);
                                                                    J();
                                                                    l();
                                                                    if (V() && x9 == c3136eO2.u()) {
                                                                        D0.H[] hArr5 = this.f28171n;
                                                                        for (i16 = 0; i16 < 2; i16++) {
                                                                            hArr5[i16].a();
                                                                        }
                                                                    }
                                                                    if (this.f28170Z.f31952e == 3) {
                                                                        i();
                                                                    }
                                                                    C3918t k13 = c3136eO2.s().k();
                                                                    i15 = 0;
                                                                    while (true) {
                                                                        D0.H[] hArr6 = this.f28171n;
                                                                        if (i15 >= 2) {
                                                                            if (k13.c(i15)) {
                                                                                hArr6[i15].w();
                                                                            }
                                                                            i15++;
                                                                        }
                                                                    }
                                                                    z9 = true;
                                                                    j6 = com.anythink.basead.exoplayer.b.f6382b;
                                                                }
                                                            }
                                                        } else {
                                                            c9 = 65535;
                                                        }
                                                        z10 = false;
                                                        C3083dO c3083dO2 = x9.f29479g;
                                                        C3676oQ c3676oQ42 = c3083dO2.f29760a;
                                                        boolean z142 = z10;
                                                        long j132 = c3083dO2.f29761b;
                                                        this.f28170Z = N(c3676oQ42, j132, c3083dO2.f29763d, j132, !z142, 0);
                                                        J();
                                                        l();
                                                        if (V()) {
                                                            D0.H[] hArr52 = this.f28171n;
                                                            while (i16 < 2) {
                                                            }
                                                        }
                                                        if (this.f28170Z.f31952e == 3) {
                                                        }
                                                        C3918t k132 = c3136eO2.s().k();
                                                        i15 = 0;
                                                        while (true) {
                                                            D0.H[] hArr62 = this.f28171n;
                                                            if (i15 >= 2) {
                                                                break;
                                                            }
                                                            i15++;
                                                        }
                                                        z9 = true;
                                                        j6 = com.anythink.basead.exoplayer.b.f6382b;
                                                    }
                                                    i13 = 3;
                                                    this.f28148F0.getClass();
                                                    C3136eO c3136eO4 = this.J;
                                                    s10 = c3136eO4.s();
                                                    if (s10 == null) {
                                                        p(j9);
                                                    } else {
                                                        long j14 = j9;
                                                        Trace.beginSection("doSomeWork");
                                                        l();
                                                        if (s10.f29477e) {
                                                            this.f28139A0 = AbstractC3159eu.u(SystemClock.elapsedRealtime());
                                                            s10.f29473a.X(this.f28170Z.f31964r - this.f28145E);
                                                            int i30 = 0;
                                                            z11 = true;
                                                            z12 = true;
                                                            while (true) {
                                                                D0.H[] hArr7 = this.f28171n;
                                                                if (i30 < 2) {
                                                                    D0.H h11 = hArr7[i30];
                                                                    if (h11.r() == 0) {
                                                                        m(i30, false);
                                                                    } else {
                                                                        h11.A(this.f28190z0, this.f28139A0);
                                                                        z11 = z11 && h11.x();
                                                                        boolean B9 = h11.B(s10);
                                                                        m(i30, B9);
                                                                        z12 = z12 && B9;
                                                                        if (!B9) {
                                                                            U(i30);
                                                                        }
                                                                    }
                                                                    i30++;
                                                                }
                                                            }
                                                        } else {
                                                            s10.f29473a.q();
                                                            z11 = true;
                                                            z12 = true;
                                                        }
                                                        long j15 = s10.f29479g.f29764e;
                                                        if (z11 && s10.f29477e) {
                                                            j10 = com.anythink.basead.exoplayer.b.f6382b;
                                                            if (j15 == com.anythink.basead.exoplayer.b.f6382b || j15 <= this.f28170Z.f31964r) {
                                                                if (this.f28175q0) {
                                                                    this.f28175q0 = false;
                                                                    int i31 = this.f28170Z.f31960n;
                                                                    this.f28172n0.f(0);
                                                                    f(this.f28163R.b(this.f28170Z.f31952e, false), i31, 5, false);
                                                                }
                                                                if (s10.f29479g.f29767h) {
                                                                    c(4);
                                                                    k();
                                                                    j11 = -9223372036854775807L;
                                                                    int i32 = 2;
                                                                    if (this.f28170Z.f31952e == 2) {
                                                                        int i33 = 0;
                                                                        while (true) {
                                                                            D0.H[] hArr8 = this.f28171n;
                                                                            if (i33 < i32) {
                                                                                if (hArr8[i33].m(s10) != null) {
                                                                                    U(i33);
                                                                                }
                                                                                i33++;
                                                                                i32 = 2;
                                                                            } else {
                                                                                C3566mO c3566mO2 = this.f28170Z;
                                                                                if (!c3566mO2.f31954g && c3566mO2.f31963q < 500000 && A(c3136eO4.f29923k) && T()) {
                                                                                    if (this.f28146E0 == j11) {
                                                                                        this.f28146E0 = SystemClock.elapsedRealtime();
                                                                                    } else if (SystemClock.elapsedRealtime() - this.f28146E0 >= 4000) {
                                                                                        throw new Us(0, 4000);
                                                                                    }
                                                                                    boolean z15 = !T() && this.f28170Z.f31952e == i13;
                                                                                    this.f28170Z.getClass();
                                                                                    i20 = this.f28170Z.f31952e;
                                                                                    if (i20 != 4 && (z15 || i20 == 2 || (i20 == i13 && this.f28186x0 != 0))) {
                                                                                        p(j14);
                                                                                    }
                                                                                    Trace.endSection();
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    this.f28146E0 = j11;
                                                                    if (T()) {
                                                                    }
                                                                    this.f28170Z.getClass();
                                                                    i20 = this.f28170Z.f31952e;
                                                                    if (i20 != 4) {
                                                                        p(j14);
                                                                    }
                                                                    Trace.endSection();
                                                                }
                                                            }
                                                        } else {
                                                            j10 = com.anythink.basead.exoplayer.b.f6382b;
                                                        }
                                                        C3566mO c3566mO3 = this.f28170Z;
                                                        if (c3566mO3.f31952e == 2) {
                                                            if (this.f28186x0 == 0) {
                                                                g4 = E();
                                                                j11 = j10;
                                                            } else if (z12) {
                                                                if (c3566mO3.f31954g) {
                                                                    C3029cO s12 = c3136eO4.s();
                                                                    long b9 = o(this.f28170Z.f31948a, s12.f29479g.f29760a) ? this.f28155J0.b() : j10;
                                                                    C3029cO c3029cO = c3136eO4.f29923k;
                                                                    boolean z16 = c3029cO.b() && c3029cO.f29479g.f29767h;
                                                                    boolean z17 = c3029cO.f29479g.f29760a.b() && !c3029cO.f29477e;
                                                                    if (!z16 && !z17) {
                                                                        long R8 = R(c3029cO.d());
                                                                        YN yn = this.f28187y;
                                                                        IO io = this.f28158M;
                                                                        AbstractC3604n8 abstractC3604n82 = this.f28170Z.f31948a;
                                                                        C3676oQ c3676oQ5 = s12.f29479g.f29760a;
                                                                        float f3 = this.f28147F.j().f34216a;
                                                                        j11 = j10;
                                                                        boolean z18 = this.f28170Z.f31958l;
                                                                        g4 = yn.g(new XN(io, abstractC3604n82, c3676oQ5, R8, f3, this.f28176r0, b9));
                                                                    }
                                                                }
                                                                j11 = j10;
                                                                c(i13);
                                                                this.f28144D0 = dn2;
                                                                if (T()) {
                                                                    y(false, false);
                                                                    Is is = this.f28147F;
                                                                    is.f25608u = true;
                                                                    C4105wO c4105wO = (C4105wO) is.f25609v;
                                                                    if (!c4105wO.f34832n) {
                                                                        c4105wO.f34834v = SystemClock.elapsedRealtime();
                                                                        c4105wO.f34832n = true;
                                                                    }
                                                                    i();
                                                                }
                                                                int i322 = 2;
                                                                if (this.f28170Z.f31952e == 2) {
                                                                }
                                                                this.f28146E0 = j11;
                                                                if (T()) {
                                                                }
                                                                this.f28170Z.getClass();
                                                                i20 = this.f28170Z.f31952e;
                                                                if (i20 != 4) {
                                                                }
                                                                Trace.endSection();
                                                            }
                                                            if (g4) {
                                                                c(i13);
                                                                this.f28144D0 = dn2;
                                                                if (T()) {
                                                                }
                                                                int i3222 = 2;
                                                                if (this.f28170Z.f31952e == 2) {
                                                                }
                                                                this.f28146E0 = j11;
                                                                if (T()) {
                                                                }
                                                                this.f28170Z.getClass();
                                                                i20 = this.f28170Z.f31952e;
                                                                if (i20 != 4) {
                                                                }
                                                                Trace.endSection();
                                                            }
                                                            if (this.f28170Z.f31952e == i13) {
                                                                if (this.f28186x0 == 0) {
                                                                    if (!E()) {
                                                                        y(T(), false);
                                                                        c(2);
                                                                        if (this.f28176r0) {
                                                                            for (C3029cO s13 = c3136eO4.s(); s13 != null; s13 = s13.i()) {
                                                                                for (InterfaceC3757q interfaceC3757q : (InterfaceC3757q[]) s13.k().f34179v) {
                                                                                }
                                                                            }
                                                                            this.f28155J0.a();
                                                                        }
                                                                        k();
                                                                    }
                                                                }
                                                            }
                                                            int i32222 = 2;
                                                            if (this.f28170Z.f31952e == 2) {
                                                            }
                                                            this.f28146E0 = j11;
                                                            if (T()) {
                                                            }
                                                            this.f28170Z.getClass();
                                                            i20 = this.f28170Z.f31952e;
                                                            if (i20 != 4) {
                                                            }
                                                            Trace.endSection();
                                                        }
                                                        j11 = j10;
                                                        if (this.f28170Z.f31952e == i13) {
                                                        }
                                                        int i322222 = 2;
                                                        if (this.f28170Z.f31952e == 2) {
                                                        }
                                                        this.f28146E0 = j11;
                                                        if (T()) {
                                                        }
                                                        this.f28170Z.getClass();
                                                        i20 = this.f28170Z.f31952e;
                                                        if (i20 != 4) {
                                                        }
                                                        Trace.endSection();
                                                    }
                                                    message2 = message;
                                                    z3 = true;
                                                }
                                                j9 = uptimeMillis;
                                                dn2 = null;
                                                i10 = 1;
                                                t10 = c3136eO2.t();
                                                if (t10 != null) {
                                                    t11 = c3136eO2.t();
                                                    k9 = t11.k();
                                                    i17 = i10;
                                                    i18 = 0;
                                                    while (true) {
                                                        hArr = this.f28171n;
                                                        if (i18 >= 2) {
                                                        }
                                                        int r92 = hArr[i18].r();
                                                        int c102 = hArr[i18].c(t11, k9, this.f28147F);
                                                        this.f28186x0 -= r92 - hArr[i18].r();
                                                        i17 &= c102 & 1;
                                                        i18++;
                                                    }
                                                }
                                                z9 = false;
                                                while (T()) {
                                                    if (z9) {
                                                    }
                                                    this.f28152H0 = false;
                                                    x9 = c3136eO2.x();
                                                    if (x9 != null) {
                                                    }
                                                }
                                                i13 = 3;
                                                this.f28148F0.getClass();
                                                C3136eO c3136eO42 = this.J;
                                                s10 = c3136eO42.s();
                                                if (s10 == null) {
                                                }
                                                message2 = message;
                                                z3 = true;
                                            }
                                        }
                                    }
                                    j6 = com.anythink.basead.exoplayer.b.f6382b;
                                    t9 = c3136eO2.t();
                                    if (t9 != null) {
                                    }
                                    j9 = uptimeMillis;
                                    dn2 = null;
                                    i10 = 1;
                                    t10 = c3136eO2.t();
                                    if (t10 != null) {
                                    }
                                    z9 = false;
                                    while (T()) {
                                    }
                                    i13 = 3;
                                    this.f28148F0.getClass();
                                    C3136eO c3136eO422 = this.J;
                                    s10 = c3136eO422.s();
                                    if (s10 == null) {
                                    }
                                    message2 = message;
                                    z3 = true;
                                }
                            }
                            c3136eO2 = c3136eO3;
                            j6 = com.anythink.basead.exoplayer.b.f6382b;
                            t9 = c3136eO2.t();
                            if (t9 != null) {
                            }
                            j9 = uptimeMillis;
                            dn2 = null;
                            i10 = 1;
                            t10 = c3136eO2.t();
                            if (t10 != null) {
                            }
                            z9 = false;
                            while (T()) {
                            }
                            i13 = 3;
                            this.f28148F0.getClass();
                            C3136eO c3136eO4222 = this.J;
                            s10 = c3136eO4222.s();
                            if (s10 == null) {
                            }
                            message2 = message;
                            z3 = true;
                        }
                    }
                    j9 = uptimeMillis;
                    i13 = 3;
                    dn2 = null;
                    C3136eO c3136eO42222 = this.J;
                    s10 = c3136eO42222.s();
                    if (s10 == null) {
                    }
                    message2 = message;
                    z3 = true;
                }
                d(message2.what);
                return z3;
            case 3:
                z3 = true;
                q((UN) message2.obj);
                d(message2.what);
                return z3;
            case 4:
                z3 = true;
                C3924t5 c3924t5 = (C3924t5) message2.obj;
                this.f28189z.d(16);
                this.f28147F.a(c3924t5);
                C3924t5 j16 = this.f28147F.j();
                K(j16, j16.f34216a, true, true);
                d(message2.what);
                return z3;
            case 5:
                z3 = true;
                this.f28165T = (C3997uO) message2.obj;
                d(message2.what);
                return z3;
            case 6:
                z3 = true;
                u(false, true);
                d(message2.what);
                return z3;
            case 7:
                C2781Sm c2781Sm = (C2781Sm) message2.obj;
                try {
                    v(true, false, true, false);
                    int i34 = 0;
                    while (true) {
                        D0.H[] hArr9 = this.f28171n;
                        if (i34 >= 2) {
                            this.f28187y.d(this.f28158M);
                            this.f28163R.c();
                            this.f28183w.c();
                            c(1);
                            this.f28189z.f30468a.removeCallbacksAndMessages(null);
                            this.f28138A.e();
                            c2781Sm.a();
                            return true;
                        }
                        this.f28179u[i34].t0();
                        hArr9[i34].d();
                        i34++;
                    }
                } finally {
                    this.f28189z.f30468a.removeCallbacksAndMessages(null);
                    this.f28138A.e();
                    c2781Sm.a();
                }
            case 8:
                try {
                    try {
                        InterfaceC3622nQ interfaceC3622nQ = (InterfaceC3622nQ) message2.obj;
                        C3136eO c3136eO5 = this.J;
                        C3029cO c3029cO2 = c3136eO5.f29923k;
                        if (!(c3029cO2 != null && c3029cO2.f29473a == interfaceC3622nQ)) {
                            z3 = true;
                            C3029cO A9 = c3136eO5.A(interfaceC3622nQ);
                            if (A9 != null) {
                                AbstractC2772Sd.H(!A9.f29477e);
                                float f9 = this.f28147F.j().f34216a;
                                A9.e(this.f28170Z.f31948a);
                                C3029cO c3029cO3 = c3136eO5.f29924l;
                                if (c3029cO3 != null && c3029cO3.f29473a == interfaceC3622nQ) {
                                    I();
                                }
                            }
                        } else {
                            if (c3029cO2 == null) {
                                throw null;
                            }
                            if (!c3029cO2.f29477e) {
                                float f10 = this.f28147F.j().f34216a;
                                c3029cO2.e(this.f28170Z.f31948a);
                            }
                            S(c3029cO2.f29479g.f29760a, c3029cO2.j(), c3029cO2.k());
                            if (c3029cO2 == c3136eO5.s()) {
                                s(c3029cO2.f29479g.f29761b, true);
                                O(new boolean[2], this.J.i.a());
                                c3029cO2.f29480h = true;
                                C3566mO c3566mO4 = this.f28170Z;
                                try {
                                    C3676oQ c3676oQ6 = c3566mO4.f31949b;
                                    long j17 = c3029cO2.f29479g.f29761b;
                                    z3 = true;
                                    this.f28170Z = N(c3676oQ6, j17, c3566mO4.f31950c, j17, false, 5);
                                } catch (DN e28) {
                                    e = e28;
                                    if (e.f24388v == 1 && (t6 = this.J.t()) != null && e.f24384A == null) {
                                        e = e.a(t6.f29479g.f29760a);
                                    }
                                    if (e.f24388v == 1 && (c3676oQ = e.f24384A) != null) {
                                        int i272 = e.f24390x;
                                        c3136eO = this.J;
                                        if (c3136eO.u() != null && c3136eO.u().f29479g.f29760a.equals(c3676oQ) && this.f28171n[i272].y(c3136eO.u())) {
                                            this.f28152H0 = true;
                                            C();
                                            u3 = c3136eO.u();
                                            C3029cO s112 = c3136eO.s();
                                            if (c3136eO.s() != u3) {
                                                while (s112 != null && s112.i() != u3) {
                                                    s112 = s112.i();
                                                }
                                            }
                                            c3136eO.y(s112);
                                            if (this.f28170Z.f31952e != 4) {
                                                L();
                                                this.f28189z.c(2);
                                            }
                                            z3 = true;
                                            d(message2.what);
                                            return z3;
                                        }
                                    }
                                    dn = this.f28144D0;
                                    if (dn != null) {
                                        dn.addSuppressed(e);
                                        e = this.f28144D0;
                                    }
                                    if (e.f24388v == 1) {
                                        C3136eO c3136eO6 = this.J;
                                        if (c3136eO6.s() != c3136eO6.t()) {
                                            while (c3136eO6.s() != c3136eO6.t()) {
                                                c3136eO6.x();
                                            }
                                            C3029cO s14 = c3136eO6.s();
                                            s14.getClass();
                                            d(message2.what);
                                            C3083dO c3083dO3 = s14.f29479g;
                                            C3676oQ c3676oQ7 = c3083dO3.f29760a;
                                            long j18 = c3083dO3.f29761b;
                                            this.f28170Z = N(c3676oQ7, j18, c3083dO3.f29763d, j18, true, 0);
                                        }
                                    }
                                    if (e.f24385B || !(this.f28144D0 == null || (i6 = e.f24386n) == 5004 || i6 == 5003)) {
                                        AbstractC2968bG.J("ExoPlayerImplInternal", "Playback error", e);
                                        z3 = true;
                                        u(true, false);
                                        this.f28170Z = this.f28170Z.e(e);
                                        d(message2.what);
                                        return z3;
                                    }
                                    AbstractC2968bG.C("ExoPlayerImplInternal", "Recoverable renderer error", e);
                                    if (this.f28144D0 == null) {
                                        this.f28144D0 = e;
                                    }
                                    C3212ft c3212ft2 = this.f28189z;
                                    C3104dt b10 = c3212ft2.b(25, e);
                                    Message message3 = b10.f29857a;
                                    message3.getClass();
                                    c3212ft2.f30468a.sendMessageAtFrontOfQueue(message3);
                                    b10.f29857a = null;
                                    C3212ft.f(b10);
                                    z3 = true;
                                    d(message2.what);
                                    return z3;
                                }
                            } else {
                                z3 = true;
                            }
                            L();
                        }
                    } catch (DN e29) {
                        e = e29;
                    }
                } catch (NH e30) {
                    e = e30;
                    b(e, e.f26478n);
                    z3 = true;
                    d(message2.what);
                    return z3;
                } catch (U4 e31) {
                    e = e31;
                    b(e, e.f27886u == 1 ? true != e.f27885n ? 3003 : AdError.MEDIATION_ERROR_CODE : 1000);
                    z3 = true;
                    d(message2.what);
                    return z3;
                } catch (C4214yP e32) {
                    e = e32;
                    b(e, e.f35157n);
                    z3 = true;
                    d(message2.what);
                    return z3;
                } catch (IOException e33) {
                    e = e33;
                    b(e, 2000);
                    z3 = true;
                    d(message2.what);
                    return z3;
                } catch (RuntimeException e34) {
                    e = e34;
                    i = 1004;
                    if (!(e instanceof IllegalStateException)) {
                        i = 1000;
                        break;
                    }
                    DN dn32 = new DN(2, e, i);
                    AbstractC2968bG.J("ExoPlayerImplInternal", "Playback error", dn32);
                    u(true, false);
                    this.f28170Z = this.f28170Z.e(dn32);
                    z3 = true;
                    d(message2.what);
                    return z3;
                }
                d(message2.what);
                return z3;
            case 9:
                InterfaceC3622nQ interfaceC3622nQ2 = (InterfaceC3622nQ) message2.obj;
                C3136eO c3136eO7 = this.J;
                C3029cO c3029cO4 = c3136eO7.f29923k;
                if (c3029cO4 != null && c3029cO4.f29473a == interfaceC3622nQ2) {
                    c3136eO7.n(this.f28190z0);
                    L();
                } else {
                    C3029cO c3029cO5 = c3136eO7.f29924l;
                    if (c3029cO5 != null && c3029cO5.f29473a == interfaceC3622nQ2) {
                        I();
                    }
                }
                z3 = true;
                d(message2.what);
                return z3;
            case 10:
                D();
                z3 = true;
                d(message2.what);
                return z3;
            case 11:
                int i35 = message2.arg1;
                this.f28180u0 = i35;
                int k14 = this.J.k(this.f28170Z.f31948a, i35);
                if ((k14 & 1) != 0) {
                    h(true);
                } else if ((k14 & 2) != 0) {
                    C();
                }
                Q(false);
                z3 = true;
                d(message2.what);
                return z3;
            case 12:
                boolean z19 = message2.arg1 != 0;
                this.f28182v0 = z19;
                int l9 = this.J.l(this.f28170Z.f31948a, z19);
                if ((l9 & 1) != 0) {
                    h(true);
                } else if ((l9 & 2) != 0) {
                    C();
                }
                Q(false);
                z3 = true;
                d(message2.what);
                return z3;
            case 13:
                boolean z20 = message2.arg1 != 0;
                C2781Sm c2781Sm2 = (C2781Sm) message2.obj;
                if (this.f28184w0 != z20) {
                    this.f28184w0 = z20;
                    if (!z20) {
                        D0.H[] hArr10 = this.f28171n;
                        for (int i36 = 0; i36 < 2; i36++) {
                            hArr10[i36].b();
                        }
                    }
                }
                if (c2781Sm2 != null) {
                    c2781Sm2.a();
                }
                z3 = true;
                d(message2.what);
                return z3;
            case 14:
                C3728pO c3728pO = (C3728pO) message2.obj;
                if (c3728pO.f33068e == this.f28140B) {
                    synchronized (c3728pO) {
                    }
                    try {
                        c3728pO.f33064a.b(c3728pO.f33066c, c3728pO.f33067d);
                        c3728pO.b(true);
                        int i37 = this.f28170Z.f31952e;
                        if (i37 == 3 || i37 == 2) {
                            this.f28189z.c(2);
                        }
                    } catch (Throwable th) {
                        c3728pO.b(true);
                        throw th;
                    }
                } else {
                    this.f28189z.b(15, c3728pO).a();
                }
                z3 = true;
                d(message2.what);
                return z3;
            case 15:
                C3728pO c3728pO2 = (C3728pO) message2.obj;
                Looper looper = c3728pO2.f33068e;
                if (looper.getThread().isAlive()) {
                    this.f28151H.x(looper, null).e(new RunnableC3807qw(14, c3728pO2));
                } else {
                    AbstractC2968bG.y("TAG", "Trying to send message on a dead thread.");
                    c3728pO2.b(false);
                }
                z3 = true;
                d(message2.what);
                return z3;
            case 16:
                C3924t5 c3924t52 = (C3924t5) message2.obj;
                K(c3924t52, c3924t52.f34216a, true, false);
                z3 = true;
                d(message2.what);
                return z3;
            case 17:
                TN tn = (TN) message2.obj;
                this.f28172n0.f(1);
                if (tn.f27733b != -1) {
                    this.f28188y0 = new UN(new C3835rO(tn.f27732a, tn.f27735d), tn.f27733b, tn.a());
                }
                F(this.f28156K.i(tn.f27732a, tn.f27735d), false);
                z3 = true;
                d(message2.what);
                return z3;
            case 18:
                TN tn2 = (TN) message2.obj;
                int i38 = message2.arg1;
                this.f28172n0.f(1);
                E3.m mVar = this.f28156K;
                if (i38 == -1) {
                    i38 = ((ArrayList) mVar.f805w).size();
                }
                F(mVar.j(i38, tn2.f27732a, tn2.f27735d), false);
                z3 = true;
                d(message2.what);
                return z3;
            case 19:
                D.y.v(message2.obj);
                this.f28172n0.f(1);
                throw null;
            case 20:
                int i39 = message2.arg1;
                int i40 = message2.arg2;
                KQ kq = (KQ) message2.obj;
                this.f28172n0.f(1);
                F(this.f28156K.k(i39, i40, kq), false);
                z3 = true;
                d(message2.what);
                return z3;
            case 21:
                KQ kq2 = (KQ) message2.obj;
                this.f28172n0.f(1);
                F(this.f28156K.l(kq2), false);
                z3 = true;
                d(message2.what);
                return z3;
            case 22:
                F(this.f28156K.h(), true);
                z3 = true;
                d(message2.what);
                return z3;
            case 23:
                this.f28174p0 = message2.arg1 != 0;
                J();
                if (this.f28175q0) {
                    C3136eO c3136eO8 = this.J;
                    if (c3136eO8.t() != c3136eO8.s()) {
                        h(true);
                        Q(false);
                    }
                }
                z3 = true;
                d(message2.what);
                return z3;
            case 24:
                this.f28164S = message2.arg1 != 0;
                z3 = true;
                d(message2.what);
                return z3;
            case 25:
                D();
                h(true);
                z3 = true;
                d(message2.what);
                return z3;
            case 26:
                D();
                h(true);
                z3 = true;
                d(message2.what);
                return z3;
            case 27:
                int i41 = message2.arg1;
                int i42 = message2.arg2;
                List list = (List) message2.obj;
                this.f28172n0.f(1);
                F(this.f28156K.c(i41, i42, list), false);
                z3 = true;
                d(message2.what);
                return z3;
            case 28:
                FN fn = (FN) message2.obj;
                this.f28148F0 = fn;
                C3136eO c3136eO9 = this.J;
                AbstractC3604n8 abstractC3604n83 = this.f28170Z.f31948a;
                c3136eO9.m(fn);
                z3 = true;
                d(message2.what);
                return z3;
            case 29:
                this.f28172n0.f(1);
                v(false, false, false, true);
                this.f28187y.b(this.f28158M);
                c(true != this.f28170Z.f31948a.g() ? 2 : 4);
                C3566mO c3566mO5 = this.f28170Z;
                boolean z21 = c3566mO5.f31958l;
                f(this.f28163R.b(c3566mO5.f31952e, z21), c3566mO5.f31960n, c3566mO5.f31959m, z21);
                this.f28156K.g();
                this.f28189z.c(2);
                z3 = true;
                d(message2.what);
                return z3;
            case 30:
                Pair pair = (Pair) message2.obj;
                Object obj = pair.first;
                C2781Sm c2781Sm3 = (C2781Sm) pair.second;
                D0.H[] hArr11 = this.f28171n;
                for (int i43 = 0; i43 < 2; i43++) {
                    hArr11[i43].e(obj);
                }
                int i44 = this.f28170Z.f31952e;
                if (i44 == 3 || i44 == 2) {
                    this.f28189z.c(2);
                }
                if (c2781Sm3 != null) {
                    c2781Sm3.a();
                }
                z3 = true;
                d(message2.what);
                return z3;
            case 31:
                C2744Qj c2744Qj = (C2744Qj) message2.obj;
                int i45 = message2.arg1;
                this.f28183w.d(c2744Qj);
                Cif cif = this.f28163R;
                if (i45 == 0) {
                    c2744Qj = null;
                }
                cif.a(c2744Qj);
                C3566mO c3566mO6 = this.f28170Z;
                boolean z22 = c3566mO6.f31958l;
                f(this.f28163R.b(c3566mO6.f31952e, z22), c3566mO6.f31960n, c3566mO6.f31959m, z22);
                z3 = true;
                d(message2.what);
                return z3;
            case 32:
                e(((Float) message2.obj).floatValue());
                z3 = true;
                d(message2.what);
                return z3;
            case 33:
                int i46 = message2.arg1;
                C3566mO c3566mO7 = this.f28170Z;
                f(i46, c3566mO7.f31960n, c3566mO7.f31959m, c3566mO7.f31958l);
                z3 = true;
                d(message2.what);
                return z3;
            case 34:
                e(this.f28154I0);
                z3 = true;
                d(message2.what);
                return z3;
            case 35:
                InterfaceC3328i0 interfaceC3328i0 = (InterfaceC3328i0) message2.obj;
                D0.H[] hArr12 = this.f28171n;
                for (int i47 = 0; i47 < 2; i47++) {
                    hArr12[i47].f(interfaceC3328i0);
                }
                z3 = true;
                d(message2.what);
                return z3;
            case 36:
                boolean booleanValue = ((Boolean) message2.obj).booleanValue();
                if (!booleanValue) {
                    if (this.f28169X != null && this.f28168W && !this.f28189z.a()) {
                        this.Y++;
                    }
                    int i48 = this.Y;
                    if (i48 > 0) {
                        this.f28161P.e(new RunnableC3807qw(this, i48));
                    }
                    this.Y = 0;
                    this.f28168W = false;
                    this.f28189z.d(37);
                    UN un = this.f28169X;
                    if (un != null) {
                        q(un);
                        this.f28169X = null;
                        this.f28168W = false;
                    }
                }
                this.f28167V = booleanValue;
                t();
                z3 = true;
                d(message2.what);
                return z3;
            case 37:
                this.f28168W = false;
                UN un2 = this.f28169X;
                if (un2 != null) {
                    q(un2);
                    this.f28169X = null;
                }
                z3 = true;
                d(message2.what);
                return z3;
            case com.anythink.basead.b.b.j.f5806M /* 38 */:
                this.f28166U = (C3943tO) message2.obj;
                t();
                z3 = true;
                d(message2.what);
                return z3;
            case 39:
                D0.H[] hArr13 = this.f28171n;
                for (int i49 = 0; i49 < 2; i49++) {
                    int i50 = ((RP) hArr13[i49].f539e).f27272u;
                }
                z3 = true;
                d(message2.what);
                return z3;
            default:
                return false;
        }
    }

    public final void i() {
        C3029cO c3029cO = this.J.f29921h;
        if (c3029cO == null) {
            return;
        }
        C3918t c3918t = c3029cO.f29486o;
        for (int i = 0; i < 2; i++) {
            if (c3918t.c(i)) {
                this.f28171n[i].C();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3568mQ
    public final /* bridge */ /* synthetic */ void j(JQ jq) {
        this.f28189z.b(9, (InterfaceC3622nQ) jq).a();
    }

    public final void k() {
        Is is = this.f28147F;
        is.f25608u = false;
        C4105wO c4105wO = (C4105wO) is.f25609v;
        if (c4105wO.f34832n) {
            c4105wO.b(c4105wO.h());
            c4105wO.f34832n = false;
        }
        for (int i = 0; i < 2; i++) {
            D0.H h9 = this.f28171n[i];
            RP rp = (RP) h9.f539e;
            if (D0.H.l(rp)) {
                D0.H.n(rp);
            }
            RP rp2 = (RP) h9.f540f;
            if (rp2 != null && rp2.f27206A != 0) {
                D0.H.n(rp2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l() {
        long j6;
        int i;
        boolean z3;
        float f3;
        Is is;
        int i6;
        long j9;
        long j10;
        long max;
        C3136eO c3136eO = this.J;
        C3029cO c3029cO = c3136eO.f29921h;
        if (c3029cO == null) {
            return;
        }
        long w6 = c3029cO.f29477e ? c3029cO.f29473a.w() : -9223372036854775807L;
        if (w6 != com.anythink.basead.exoplayer.b.f6382b) {
            if (!c3029cO.b()) {
                c3136eO.y(c3029cO);
                C();
                Q(false);
                L();
            }
            s(w6, true);
            if (w6 != this.f28170Z.f31964r) {
                C3566mO c3566mO = this.f28170Z;
                j6 = -9223372036854775807L;
                i = 16;
                this.f28170Z = N(c3566mO.f31949b, w6, c3566mO.f31950c, w6, true, 5);
            } else {
                j6 = -9223372036854775807L;
                i = 16;
            }
        } else {
            j6 = -9223372036854775807L;
            i = 16;
            Is is2 = this.f28147F;
            boolean z6 = c3029cO != c3136eO.i;
            RP rp = (RP) is2.f25611x;
            C4105wO c4105wO = (C4105wO) is2.f25609v;
            if (rp == null || rp.J() || ((z6 && ((RP) is2.f25611x).f27206A != 2) || (!((RP) is2.f25611x).I() && (z6 || ((RP) is2.f25611x).r0())))) {
                is2.f25607n = true;
                if (is2.f25608u && !c4105wO.f34832n) {
                    c4105wO.f34834v = SystemClock.elapsedRealtime();
                    c4105wO.f34832n = true;
                }
            } else {
                InterfaceC2976bO interfaceC2976bO = (InterfaceC2976bO) is2.f25612y;
                interfaceC2976bO.getClass();
                long h9 = interfaceC2976bO.h();
                if (is2.f25607n) {
                    if (h9 >= c4105wO.h()) {
                        is2.f25607n = false;
                        if (is2.f25608u && !c4105wO.f34832n) {
                            c4105wO.f34834v = SystemClock.elapsedRealtime();
                            c4105wO.f34832n = true;
                        }
                    } else if (c4105wO.f34832n) {
                        c4105wO.b(c4105wO.h());
                        c4105wO.f34832n = false;
                    }
                }
                c4105wO.b(h9);
                C3924t5 j11 = interfaceC2976bO.j();
                if (!j11.equals(c4105wO.f34835w)) {
                    c4105wO.a(j11);
                    ((VN) is2.f25610w).f28189z.b(16, j11).a();
                }
            }
            long h10 = is2.h();
            this.f28190z0 = h10;
            long j12 = h10 - c3029cO.f29487p;
            long j13 = this.f28170Z.f31964r;
            ArrayList arrayList = this.f28149G;
            if (!arrayList.isEmpty() && !this.f28170Z.f31949b.b()) {
                if (this.C0) {
                    this.C0 = false;
                }
                C3566mO c3566mO2 = this.f28170Z;
                c3566mO2.f31948a.e(c3566mO2.f31949b.f32905a);
                int min = Math.min(this.f28141B0, arrayList.size());
                if (min > 0 && arrayList.get(min - 1) != null) {
                    throw new ClassCastException();
                }
                if (min < arrayList.size() && arrayList.get(min) != null) {
                    throw new ClassCastException();
                }
                this.f28141B0 = min;
            }
            if (is2.g()) {
                boolean z9 = !this.f28172n0.f34797d;
                C3566mO c3566mO3 = this.f28170Z;
                this.f28170Z = N(c3566mO3.f31949b, j12, c3566mO3.f31950c, j12, z9, 6);
            } else {
                C3566mO c3566mO4 = this.f28170Z;
                c3566mO4.f31964r = j12;
                c3566mO4.f31965s = SystemClock.elapsedRealtime();
            }
        }
        this.f28170Z.f31962p = c3136eO.f29923k.d();
        C3566mO c3566mO5 = this.f28170Z;
        c3566mO5.f31963q = R(c3566mO5.f31962p);
        C3566mO c3566mO6 = this.f28170Z;
        if (!c3566mO6.f31958l || c3566mO6.f31952e != 3 || !o(c3566mO6.f31948a, c3566mO6.f31949b)) {
            return;
        }
        C3566mO c3566mO7 = this.f28170Z;
        if (c3566mO7.f31961o.f34216a != 1.0f) {
            return;
        }
        C4266zN c4266zN = this.f28155J0;
        long n9 = n(c3566mO7.f31948a, c3566mO7.f31949b.f32905a, c3566mO7.f31964r);
        long j14 = this.f28170Z.f31963q;
        if (c4266zN.f35320c != j6) {
            long j15 = n9 - j14;
            long j16 = c4266zN.f35327k;
            if (j16 == j6) {
                c4266zN.f35327k = j15;
                c4266zN.f35328l = 0L;
                i6 = 1;
            } else {
                i6 = 1;
                c4266zN.f35327k = Math.max(j15, (long) ((j15 * 9.999871E-4f) + (j16 * 0.999f)));
                c4266zN.f35328l = (long) ((Math.abs(j15 - r13) * 9.999871E-4f) + (c4266zN.f35328l * 0.999f));
            }
            if (c4266zN.f35326j != j6) {
                j9 = 1000;
                f3 = SystemClock.elapsedRealtime() - c4266zN.f35326j < 1000 ? c4266zN.i : 1.0f;
            } else {
                j9 = 1000;
            }
            c4266zN.f35326j = SystemClock.elapsedRealtime();
            long j17 = (c4266zN.f35328l * 3) + c4266zN.f35327k;
            if (c4266zN.f35325h > j17) {
                long u3 = AbstractC3159eu.u(j9);
                int i9 = i6;
                float f9 = c4266zN.i - 1.0f;
                z3 = false;
                long j18 = c4266zN.f35322e;
                j10 = n9;
                float f10 = u3;
                long j19 = c4266zN.f35325h - (((long) (f9 * f10)) + ((long) (0.029999971f * f10)));
                long[] jArr = new long[3];
                jArr[0] = j17;
                jArr[i9] = j18;
                jArr[2] = j19;
                max = jArr[0];
                for (int i10 = i9; i10 < 3; i10++) {
                    long j20 = jArr[i10];
                    if (j20 > max) {
                        max = j20;
                    }
                }
                c4266zN.f35325h = max;
            } else {
                j10 = n9;
                z3 = false;
                long max2 = j10 - ((long) (Math.max(0.0f, c4266zN.i - 1.0f) / 1.0E-7f));
                long j21 = c4266zN.f35325h;
                String str = AbstractC3159eu.f29993a;
                max = Math.max(j21, Math.min(max2, j17));
                c4266zN.f35325h = max;
                long j22 = c4266zN.f35324g;
                if (j22 != j6 && max > j22) {
                    c4266zN.f35325h = j22;
                    max = j22;
                }
            }
            long j23 = j10 - max;
            if (Math.abs(j23) < c4266zN.f35318a) {
                c4266zN.i = 1.0f;
                f3 = 1.0f;
            } else {
                f3 = Math.max(0.97f, Math.min((j23 * 1.0E-7f) + 1.0f, 1.03f));
                c4266zN.i = f3;
            }
            is = this.f28147F;
            if (is.j().f34216a == f3) {
                C3924t5 c3924t5 = new C3924t5(f3, this.f28170Z.f31961o.f34217b);
                this.f28189z.d(i);
                this.f28147F.a(c3924t5);
                boolean z10 = z3;
                K(this.f28170Z.f31961o, is.j().f34216a, z10, z10);
                return;
            }
            return;
        }
        z3 = false;
        is = this.f28147F;
        if (is.j().f34216a == f3) {
        }
    }

    public final void m(int i, boolean z3) {
        boolean[] zArr = this.f28181v;
        if (zArr[i] != z3) {
            zArr[i] = z3;
            this.f28161P.e(new L.a(this, i, z3));
        }
    }

    public final long n(AbstractC3604n8 abstractC3604n8, Object obj, long j6) {
        int i = abstractC3604n8.o(obj, this.f28143D).f25867c;
        U7 u72 = this.f28142C;
        abstractC3604n8.b(i, u72, 0L);
        if (u72.f27896d == com.anythink.basead.exoplayer.b.f6382b || !u72.b() || !u72.f27899g) {
            return com.anythink.basead.exoplayer.b.f6382b;
        }
        long j9 = u72.f27897e;
        String str = AbstractC3159eu.f29993a;
        return AbstractC3159eu.u((j9 == com.anythink.basead.exoplayer.b.f6382b ? System.currentTimeMillis() : j9 + SystemClock.elapsedRealtime()) - u72.f27896d) - j6;
    }

    public final boolean o(AbstractC3604n8 abstractC3604n8, C3676oQ c3676oQ) {
        if (c3676oQ.b() || abstractC3604n8.g()) {
            return false;
        }
        int i = abstractC3604n8.o(c3676oQ.f32905a, this.f28143D).f25867c;
        U7 u72 = this.f28142C;
        abstractC3604n8.b(i, u72, 0L);
        return u72.b() && u72.f27899g && u72.f27896d != com.anythink.basead.exoplayer.b.f6382b;
    }

    public final void p(long j6) {
        boolean z3 = true;
        if (!this.f28159N) {
            if (this.f28167V) {
                this.f28166U.getClass();
            } else {
                z3 = false;
            }
        }
        long j9 = f28137K0;
        if (z3) {
            r3 = this.f28170Z.f31952e != 3 ? j9 : 1000L;
            for (int i = 0; i < 2; i++) {
                D0.H h9 = this.f28171n[i];
                long j10 = this.f28190z0;
                RP rp = (RP) h9.f539e;
                long T8 = D0.H.l(rp) ? rp.T(j10) : Long.MAX_VALUE;
                RP rp2 = (RP) h9.f540f;
                if (rp2 != null && rp2.f27206A != 0) {
                    T8 = Math.min(T8, rp2.T(j10));
                }
                r3 = Math.min(r3, AbstractC3159eu.t(T8));
            }
            if (this.f28170Z.i()) {
                C3029cO c3029cO = this.J.f29921h;
                if ((c3029cO != null ? c3029cO.f29484m : null) != null) {
                    if (this.f28190z0 + (AbstractC3159eu.u(r3) * this.f28170Z.f31961o.f34216a) >= r1.a()) {
                        r3 = Math.min(r3, j9);
                    }
                }
            }
        } else if (this.f28170Z.f31952e != 3 || T()) {
            r3 = j9;
        }
        this.f28189z.f30468a.sendEmptyMessageAtTime(2, j6 + r3);
    }

    public final void q(UN un) {
        long longValue;
        long j6;
        long j9;
        C3676oQ E8;
        boolean z3;
        long j10;
        int i;
        long j11;
        boolean z6;
        long j12;
        long j13;
        long j14;
        boolean z9;
        C3566mO c3566mO;
        C3676oQ c3676oQ;
        long j15;
        long j16;
        boolean z10;
        C3566mO c3566mO2;
        int i6;
        if (this.f28168W) {
            if (this.f28169X != null) {
                this.Y++;
                this.f28172n0.f(1);
            }
            this.f28169X = un;
            return;
        }
        this.f28172n0.f(1);
        AbstractC3604n8 abstractC3604n8 = this.f28170Z.f31948a;
        int i9 = this.f28180u0;
        boolean z11 = this.f28182v0;
        U7 u72 = this.f28142C;
        K7 k72 = this.f28143D;
        Pair z12 = z(abstractC3604n8, un, i9, z11, u72, k72);
        if (z12 == null) {
            Pair w6 = w(this.f28170Z.f31948a);
            C3676oQ c3676oQ2 = (C3676oQ) w6.first;
            longValue = ((Long) w6.second).longValue();
            z3 = !this.f28170Z.f31948a.g();
            E8 = c3676oQ2;
            j10 = -9223372036854775807L;
            j6 = -9223372036854775807L;
        } else {
            Object obj = z12.first;
            longValue = ((Long) z12.second).longValue();
            long j17 = un.f27923c;
            if (j17 == com.anythink.basead.exoplayer.b.f6382b) {
                j9 = -9223372036854775807L;
                j6 = -9223372036854775807L;
            } else {
                j6 = -9223372036854775807L;
                j9 = longValue;
            }
            C3136eO c3136eO = this.J;
            long j18 = j9;
            C3566mO c3566mO3 = this.f28170Z;
            E8 = c3136eO.E(c3566mO3, c3566mO3.f31948a, obj, true, false);
            if (E8.b()) {
                this.f28170Z.f31948a.o(E8.f32905a, k72);
                int i10 = E8.f32906b;
                C2897a a9 = k72.f25870f.a(i10);
                int i11 = 0;
                while (true) {
                    int[] iArr = a9.f28986d;
                    if (i11 >= iArr.length || (i = iArr[i11]) == 0 || i == 1) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i11 == E8.f32907c) {
                    k72.f25870f.getClass();
                }
                k72.f25870f.a(i10).getClass();
                j10 = Math.max(j18, 0L);
                longValue = 0;
                z3 = true;
            } else {
                z3 = j17 == com.anythink.basead.exoplayer.b.f6382b;
                j10 = j18;
            }
        }
        try {
            if (this.f28170Z.f31948a.g()) {
                this.f28188y0 = un;
            } else {
                if (z12 != null) {
                    if (E8.equals(this.f28170Z.f31949b)) {
                        C3029cO c3029cO = this.J.f29921h;
                        if (c3029cO == null || !c3029cO.f29477e || longValue == 0) {
                            j13 = longValue;
                        } else {
                            C3300hQ c3300hQ = c3029cO.f29473a;
                            long j19 = u72.f27901j;
                            if (this.f28167V && j19 != j6) {
                                this.f28166U.getClass();
                            }
                            j13 = c3300hQ.c(longValue, this.f28165T);
                        }
                        if (AbstractC3159eu.t(j13) == AbstractC3159eu.t(this.f28170Z.f31964r) && ((i6 = (c3566mO2 = this.f28170Z).f31952e) == 2 || i6 == 3)) {
                            longValue = c3566mO2.f31964r;
                        }
                    } else {
                        j13 = longValue;
                    }
                    boolean z13 = this.f28170Z.f31952e == 4;
                    C3136eO c3136eO2 = this.J;
                    if (c3136eO2.f29921h != c3136eO2.i) {
                        j14 = j13;
                        z9 = true;
                    } else {
                        j14 = j13;
                        z9 = false;
                    }
                    long r9 = r(E8, j14, z9, z13);
                    boolean z14 = z3 | (longValue != r9);
                    try {
                        c3566mO = this.f28170Z;
                        c3676oQ = E8;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        AbstractC3604n8 abstractC3604n82 = c3566mO.f31948a;
                        long j20 = j10;
                        try {
                            G(abstractC3604n82, c3676oQ, abstractC3604n82, c3566mO.f31949b, j20, true);
                            E8 = c3676oQ;
                            j15 = j20;
                            j16 = r9;
                            z10 = z14;
                            this.f28170Z = N(E8, j16, j15, j16, z10, 2);
                        } catch (Throwable th2) {
                            th = th2;
                            E8 = c3676oQ;
                            j11 = j20;
                            j12 = r9;
                            z6 = z14;
                            this.f28170Z = N(E8, j12, j11, j12, z6, 2);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        E8 = c3676oQ;
                        j11 = j10;
                        j12 = r9;
                        z6 = z14;
                        this.f28170Z = N(E8, j12, j11, j12, z6, 2);
                        throw th;
                    }
                }
                if (this.f28170Z.f31952e != 1) {
                    c(4);
                }
                v(false, true, false, true);
            }
            z10 = z3;
            j16 = longValue;
            j15 = j10;
            this.f28170Z = N(E8, j16, j15, j16, z10, 2);
        } catch (Throwable th4) {
            th = th4;
            j11 = j10;
            z6 = z3;
            j12 = longValue;
        }
    }

    public final long r(C3676oQ c3676oQ, long j6, boolean z3, boolean z6) {
        k();
        boolean z9 = true;
        y(false, true);
        if (z6 || this.f28170Z.f31952e == 3) {
            c(2);
        }
        C3136eO c3136eO = this.J;
        C3029cO c3029cO = c3136eO.f29921h;
        C3029cO c3029cO2 = c3029cO;
        while (c3029cO2 != null && !c3676oQ.equals(c3029cO2.f29479g.f29760a)) {
            c3029cO2 = c3029cO2.f29484m;
        }
        if (z3 || c3029cO != c3029cO2 || (c3029cO2 != null && c3029cO2.f29487p + j6 < 0)) {
            B();
            if (c3029cO2 != null) {
                while (c3136eO.f29921h != c3029cO2) {
                    c3136eO.x();
                }
                c3136eO.y(c3029cO2);
                c3029cO2.f29487p = 1000000000000L;
                O(new boolean[2], this.J.i.a());
                c3029cO2.f29480h = true;
            }
        }
        C();
        if (this.f28167V) {
            D0.H[] hArr = this.f28171n;
            int i = 0;
            while (true) {
                if (i >= 2) {
                    break;
                }
                D0.H h9 = hArr[i];
                if (h9.g() && ((RP) h9.f539e).f27272u == 2) {
                    this.f28168W = true;
                    break;
                }
                i++;
            }
        }
        if (c3029cO2 != null) {
            c3136eO.y(c3029cO2);
            if (!c3029cO2.f29477e) {
                c3029cO2.f29479g = c3029cO2.f29479g.a(j6, com.anythink.basead.exoplayer.b.f6382b);
            } else if (c3029cO2.f29478f) {
                if (this.f28167V) {
                    this.f28166U.getClass();
                    if (!this.f28170Z.f31948a.g() && c3029cO2.f29479g.f29760a.equals(this.f28170Z.f31949b)) {
                        long j9 = c3029cO2.f29487p + j6;
                        D0.H[] hArr2 = this.f28171n;
                        boolean z10 = true;
                        for (int i6 = 0; i6 < 2; i6++) {
                            D0.H h10 = hArr2[i6];
                            if (h10.g()) {
                                RP m4 = h10.m(c3029cO2);
                                z10 &= m4 != null && m4.q(j9);
                            }
                        }
                        if (z10) {
                            C3300hQ c3300hQ = c3029cO2.f29473a;
                            long j10 = this.f28170Z.f31964r;
                            C3997uO c3997uO = C3997uO.f34532b;
                            if (c3300hQ.c(j10, c3997uO) == c3300hQ.c(j6, c3997uO)) {
                                z9 = false;
                            }
                        }
                    }
                }
                C3300hQ c3300hQ2 = c3029cO2.f29473a;
                j6 = c3300hQ2.a(j6);
                c3300hQ2.X(j6 - this.f28145E);
            }
            s(j6, z9);
            L();
        } else {
            c3136eO.B();
            s(j6, true);
        }
        Q(false);
        this.f28189z.c(2);
        return j6;
    }

    public final void s(long j6, boolean z3) {
        C3029cO c3029cO = this.J.f29921h;
        long j9 = j6 + (c3029cO == null ? 1000000000000L : c3029cO.f29487p);
        this.f28190z0 = j9;
        ((C4105wO) this.f28147F.f25609v).b(j9);
        for (int i = 0; i < 2; i++) {
            D0.H h9 = this.f28171n[i];
            long j10 = this.f28190z0;
            RP m4 = h9.m(c3029cO);
            if (m4 != null) {
                m4.N(j10, false, z3);
            }
        }
        for (C3029cO c3029cO2 = r0.f29921h; c3029cO2 != null; c3029cO2 = c3029cO2.f29484m) {
            for (InterfaceC3757q interfaceC3757q : (InterfaceC3757q[]) c3029cO2.f29486o.f34179v) {
            }
        }
    }

    public final void t() {
        for (int i = 0; i < 2; i++) {
            D0.H h9 = this.f28171n[i];
            C3943tO c3943tO = this.f28167V ? this.f28166U : null;
            ((RP) h9.f539e).b(18, c3943tO);
            RP rp = (RP) h9.f540f;
            if (rp != null) {
                rp.b(18, c3943tO);
            }
        }
    }

    public final void u(boolean z3, boolean z6) {
        v(z3 || !this.f28184w0, false, true, false);
        this.f28172n0.f(z6 ? 1 : 0);
        this.f28187y.f(this.f28158M);
        this.f28163R.b(1, this.f28170Z.f31958l);
        c(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(boolean z3, boolean z6, boolean z9, boolean z10) {
        long j6;
        boolean z11;
        AbstractC3604n8 abstractC3604n8;
        C3676oQ c3676oQ;
        AbstractC3604n8 abstractC3604n82;
        List list;
        this.f28189z.d(2);
        this.f28168W = false;
        boolean z12 = true;
        if (this.f28169X != null) {
            this.f28172n0.f(1);
            this.f28169X = null;
        }
        this.f28144D0 = null;
        y(false, true);
        Is is = this.f28147F;
        is.f25608u = false;
        C4105wO c4105wO = (C4105wO) is.f25609v;
        if (c4105wO.f34832n) {
            c4105wO.b(c4105wO.h());
            c4105wO.f34832n = false;
        }
        this.f28190z0 = 1000000000000L;
        try {
            B();
        } catch (DN | RuntimeException e9) {
            AbstractC2968bG.J("ExoPlayerImplInternal", "Disable failed.", e9);
        }
        if (z3) {
            D0.H[] hArr = this.f28171n;
            for (int i = 0; i < 2; i++) {
                try {
                    hArr[i].b();
                } catch (RuntimeException e10) {
                    AbstractC2968bG.J("ExoPlayerImplInternal", "Reset failed.", e10);
                }
            }
        }
        this.f28186x0 = 0;
        C3566mO c3566mO = this.f28170Z;
        C3676oQ c3676oQ2 = c3566mO.f31949b;
        long j9 = c3566mO.f31964r;
        if (!this.f28170Z.f31949b.b()) {
            C3566mO c3566mO2 = this.f28170Z;
            K7 k72 = this.f28143D;
            C3676oQ c3676oQ3 = c3566mO2.f31949b;
            AbstractC3604n8 abstractC3604n83 = c3566mO2.f31948a;
            if (!abstractC3604n83.g() && !abstractC3604n83.o(c3676oQ3.f32905a, k72).f25869e) {
                j6 = this.f28170Z.f31964r;
                if (z6) {
                    this.f28188y0 = null;
                    Pair w6 = w(this.f28170Z.f31948a);
                    c3676oQ2 = (C3676oQ) w6.first;
                    j9 = ((Long) w6.second).longValue();
                    boolean equals = c3676oQ2.equals(this.f28170Z.f31949b);
                    j6 = com.anythink.basead.exoplayer.b.f6382b;
                    if (!equals) {
                        z11 = true;
                        long j10 = j9;
                        long j11 = j6;
                        C3136eO c3136eO = this.J;
                        c3136eO.B();
                        this.f28178t0 = false;
                        abstractC3604n8 = this.f28170Z.f31948a;
                        if (z9 || !(abstractC3604n8 instanceof C3835rO)) {
                            c3676oQ = c3676oQ2;
                            abstractC3604n82 = abstractC3604n8;
                        } else {
                            C3835rO c3835rO = (C3835rO) abstractC3604n8;
                            KQ kq = (KQ) this.f28156K.f801E;
                            AbstractC3604n8[] abstractC3604n8Arr = c3835rO.f33588h;
                            AbstractC3604n8[] abstractC3604n8Arr2 = new AbstractC3604n8[abstractC3604n8Arr.length];
                            int i6 = 0;
                            while (i6 < abstractC3604n8Arr.length) {
                                abstractC3604n8Arr2[i6] = new C3782qO(c3835rO, abstractC3604n8Arr[i6]);
                                i6++;
                                z12 = z12;
                            }
                            C3835rO c3835rO2 = new C3835rO(abstractC3604n8Arr2, c3835rO.i, kq);
                            if (c3676oQ2.f32906b != -1) {
                                Object obj = c3676oQ2.f32905a;
                                K7 k73 = this.f28143D;
                                c3835rO2.o(obj, k73);
                                U7 u72 = this.f28142C;
                                c3835rO2.b(k73.f25867c, u72, 0L);
                                if (u72.b()) {
                                    abstractC3604n82 = c3835rO2;
                                    c3676oQ = new C3676oQ(c3676oQ2.f32908d, obj);
                                }
                            }
                            c3676oQ = c3676oQ2;
                            abstractC3604n82 = c3835rO2;
                        }
                        C3566mO c3566mO3 = this.f28170Z;
                        int i9 = c3566mO3.f31952e;
                        DN dn = z10 ? null : c3566mO3.f31953f;
                        PQ pq = z11 ? PQ.f26818d : c3566mO3.f31955h;
                        C3918t c3918t = z11 ? this.f28185x : c3566mO3.i;
                        if (z11) {
                            PB pb = RB.f27177u;
                            list = C3500lC.f31745x;
                        } else {
                            list = c3566mO3.f31956j;
                        }
                        this.f28170Z = new C3566mO(abstractC3604n82, c3676oQ, j11, j10, i9, dn, false, pq, c3918t, list, c3676oQ, c3566mO3.f31958l, c3566mO3.f31959m, c3566mO3.f31960n, c3566mO3.f31961o, j10, 0L, j10, 0L);
                        if (z9) {
                            c3136eO.r();
                            E3.m mVar = this.f28156K;
                            HashMap hashMap = (HashMap) mVar.f797A;
                            for (C3404jO c3404jO : hashMap.values()) {
                                try {
                                    c3404jO.f31242a.q(c3404jO.f31243b);
                                } catch (RuntimeException e11) {
                                    AbstractC2968bG.J("MediaSourceList", "Failed to release child source.", e11);
                                }
                                XP xp = c3404jO.f31242a;
                                C3352iO c3352iO = c3404jO.f31244c;
                                xp.l(c3352iO);
                                xp.m(c3352iO);
                            }
                            hashMap.clear();
                            ((HashSet) mVar.f798B).clear();
                            mVar.f802n = false;
                            return;
                        }
                        return;
                    }
                }
                z11 = false;
                long j102 = j9;
                long j112 = j6;
                C3136eO c3136eO2 = this.J;
                c3136eO2.B();
                this.f28178t0 = false;
                abstractC3604n8 = this.f28170Z.f31948a;
                if (z9) {
                }
                c3676oQ = c3676oQ2;
                abstractC3604n82 = abstractC3604n8;
                C3566mO c3566mO32 = this.f28170Z;
                int i92 = c3566mO32.f31952e;
                if (z10) {
                }
                PQ pq2 = z11 ? PQ.f26818d : c3566mO32.f31955h;
                C3918t c3918t2 = z11 ? this.f28185x : c3566mO32.i;
                if (z11) {
                }
                this.f28170Z = new C3566mO(abstractC3604n82, c3676oQ, j112, j102, i92, dn, false, pq2, c3918t2, list, c3676oQ, c3566mO32.f31958l, c3566mO32.f31959m, c3566mO32.f31960n, c3566mO32.f31961o, j102, 0L, j102, 0L);
                if (z9) {
                }
            }
        }
        j6 = this.f28170Z.f31950c;
        if (z6) {
        }
        z11 = false;
        long j1022 = j9;
        long j1122 = j6;
        C3136eO c3136eO22 = this.J;
        c3136eO22.B();
        this.f28178t0 = false;
        abstractC3604n8 = this.f28170Z.f31948a;
        if (z9) {
        }
        c3676oQ = c3676oQ2;
        abstractC3604n82 = abstractC3604n8;
        C3566mO c3566mO322 = this.f28170Z;
        int i922 = c3566mO322.f31952e;
        if (z10) {
        }
        PQ pq22 = z11 ? PQ.f26818d : c3566mO322.f31955h;
        C3918t c3918t22 = z11 ? this.f28185x : c3566mO322.i;
        if (z11) {
        }
        this.f28170Z = new C3566mO(abstractC3604n82, c3676oQ, j1122, j1022, i922, dn, false, pq22, c3918t22, list, c3676oQ, c3566mO322.f31958l, c3566mO322.f31959m, c3566mO322.f31960n, c3566mO322.f31961o, j1022, 0L, j1022, 0L);
        if (z9) {
        }
    }

    public final Pair w(AbstractC3604n8 abstractC3604n8) {
        int i;
        long j6 = 0;
        if (abstractC3604n8.g()) {
            return Pair.create(C3566mO.f31947t, 0L);
        }
        int k9 = abstractC3604n8.k(this.f28182v0);
        U7 u72 = this.f28142C;
        K7 k72 = this.f28143D;
        Pair m4 = abstractC3604n8.m(u72, k72, k9, com.anythink.basead.exoplayer.b.f6382b);
        C3676oQ E8 = this.J.E(this.f28170Z, abstractC3604n8, m4.first, true, false);
        long longValue = ((Long) m4.second).longValue();
        if (E8.b()) {
            abstractC3604n8.o(E8.f32905a, k72);
            C2897a a9 = k72.f25870f.a(E8.f32906b);
            int i6 = 0;
            while (true) {
                int[] iArr = a9.f28986d;
                if (i6 >= iArr.length || (i = iArr[i6]) == 0 || i == 1) {
                    break;
                }
                i6++;
            }
            if (E8.f32907c == i6) {
                k72.f25870f.getClass();
            }
        } else {
            j6 = longValue;
        }
        return Pair.create(E8, Long.valueOf(j6));
    }

    public final void x(AbstractC3604n8 abstractC3604n8, AbstractC3604n8 abstractC3604n82) {
        if (abstractC3604n8.g() && abstractC3604n82.g()) {
            return;
        }
        ArrayList arrayList = this.f28149G;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            arrayList.get(size).getClass();
            throw new ClassCastException();
        }
    }

    public final void y(boolean z3, boolean z6) {
        this.f28176r0 = z3;
        long j6 = com.anythink.basead.exoplayer.b.f6382b;
        if (z3 && !z6) {
            j6 = SystemClock.elapsedRealtime();
        }
        this.f28177s0 = j6;
    }
}

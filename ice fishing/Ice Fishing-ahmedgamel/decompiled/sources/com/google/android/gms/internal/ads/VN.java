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
public final class VN implements Handler.Callback, InterfaceC3753pQ, InterfaceC3643nO, InterfaceC3351i0 {

    /* renamed from: F0, reason: collision with root package name */
    public static final long f28934F0 = AbstractC3182eu.t(10000);

    /* renamed from: A, reason: collision with root package name */
    public final R5 f28935A;

    /* renamed from: A0, reason: collision with root package name */
    public FN f28936A0;

    /* renamed from: B, reason: collision with root package name */
    public final Looper f28937B;

    /* renamed from: B0, reason: collision with root package name */
    public long f28938B0;

    /* renamed from: C, reason: collision with root package name */
    public final U7 f28939C;
    public boolean C0;

    /* renamed from: D, reason: collision with root package name */
    public final K7 f28940D;

    /* renamed from: D0, reason: collision with root package name */
    public float f28941D0;

    /* renamed from: E, reason: collision with root package name */
    public final long f28942E;

    /* renamed from: E0, reason: collision with root package name */
    public final C4289zN f28943E0;

    /* renamed from: F, reason: collision with root package name */
    public final Is f28944F;

    /* renamed from: G, reason: collision with root package name */
    public final ArrayList f28945G;

    /* renamed from: H, reason: collision with root package name */
    public final V2 f28946H;

    /* renamed from: I, reason: collision with root package name */
    public final C3557lt f28947I;
    public final C3159eO J;

    /* renamed from: K, reason: collision with root package name */
    public final G3.m f28948K;

    /* renamed from: L, reason: collision with root package name */
    public final long f28949L;

    /* renamed from: M, reason: collision with root package name */
    public final IO f28950M;

    /* renamed from: N, reason: collision with root package name */
    public final boolean f28951N;

    /* renamed from: O, reason: collision with root package name */
    public final BO f28952O;

    /* renamed from: P, reason: collision with root package name */
    public final C3235ft f28953P;

    /* renamed from: Q, reason: collision with root package name */
    public final boolean f28954Q;

    /* renamed from: R, reason: collision with root package name */
    public final Cif f28955R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f28956S;

    /* renamed from: T, reason: collision with root package name */
    public C4020uO f28957T;

    /* renamed from: U, reason: collision with root package name */
    public C3966tO f28958U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f28959V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f28960W;

    /* renamed from: X, reason: collision with root package name */
    public UN f28961X;
    public int Y;

    /* renamed from: Z, reason: collision with root package name */
    public C3589mO f28962Z;

    /* renamed from: i0, reason: collision with root package name */
    public C4108w4 f28963i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f28964j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f28965k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f28966l0;
    public boolean m0;

    /* renamed from: n, reason: collision with root package name */
    public final D0.H[] f28967n;

    /* renamed from: n0, reason: collision with root package name */
    public long f28968n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f28969o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f28970p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f28971q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f28972r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f28973s0;

    /* renamed from: t0, reason: collision with root package name */
    public UN f28974t0;

    /* renamed from: u, reason: collision with root package name */
    public final SP[] f28975u;

    /* renamed from: u0, reason: collision with root package name */
    public long f28976u0;

    /* renamed from: v, reason: collision with root package name */
    public final boolean[] f28977v;

    /* renamed from: v0, reason: collision with root package name */
    public long f28978v0;

    /* renamed from: w, reason: collision with root package name */
    public final C3672o f28979w;

    /* renamed from: w0, reason: collision with root package name */
    public int f28980w0;

    /* renamed from: x, reason: collision with root package name */
    public final C3941t f28981x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f28982x0;

    /* renamed from: y, reason: collision with root package name */
    public final YN f28983y;

    /* renamed from: y0, reason: collision with root package name */
    public DN f28984y0;

    /* renamed from: z, reason: collision with root package name */
    public final C3235ft f28985z;

    /* renamed from: z0, reason: collision with root package name */
    public long f28986z0;

    public VN(Context context, SP[] spArr, SP[] spArr2, C3672o c3672o, C3941t c3941t, YN yn, InterfaceC4211y interfaceC4211y, BO bo, C4020uO c4020uO, C4289zN c4289zN, long j6, boolean z6, Looper looper, V2 v22, C3557lt c3557lt, IO io, boolean z9) {
        Looper looper2;
        FN fn = FN.f25552a;
        this.f28938B0 = com.anythink.basead.exoplayer.b.f7168b;
        this.f28947I = c3557lt;
        this.f28979w = c3672o;
        this.f28981x = c3941t;
        this.f28983y = yn;
        boolean z10 = false;
        this.f28970p0 = 0;
        this.f28971q0 = false;
        this.f28957T = c4020uO;
        this.f28943E0 = c4289zN;
        this.f28949L = j6;
        this.f28965k0 = false;
        this.f28951N = z6;
        this.f28946H = v22;
        this.f28950M = io;
        this.f28936A0 = fn;
        this.f28952O = bo;
        this.f28941D0 = 1.0f;
        this.f28958U = C3966tO.f35062b;
        this.f28956S = z9;
        this.f28986z0 = com.anythink.basead.exoplayer.b.f7168b;
        this.f28968n0 = com.anythink.basead.exoplayer.b.f7168b;
        this.f28942E = yn.e();
        C4003u7 c4003u7 = AbstractC3627n8.f33468a;
        C3589mO a9 = C3589mO.a(c3941t);
        this.f28962Z = a9;
        this.f28963i0 = new C4108w4(a9);
        int length = spArr.length;
        this.f28975u = new SP[2];
        this.f28977v = new boolean[2];
        c3672o.getClass();
        this.f28967n = new D0.H[2];
        boolean z11 = false;
        for (int i = 0; i < 2; i++) {
            SP sp = spArr[i];
            sp.f28267x = i;
            sp.f28269y = io;
            sp.f28271z = v22;
            SP[] spArr3 = this.f28975u;
            sp.getClass();
            spArr3[i] = sp;
            SP sp2 = this.f28975u[i];
            synchronized (sp2.f28253n) {
                sp2.f28216L = c3672o;
            }
            SP sp3 = spArr2[i];
            if (sp3 != null) {
                sp3.f28267x = i;
                sp3.f28269y = io;
                sp3.f28271z = v22;
                z11 = true;
            }
            D0.H[] hArr = this.f28967n;
            SP sp4 = spArr[i];
            D0.H h3 = new D0.H();
            h3.f434e = sp4;
            h3.f430a = i;
            h3.f435f = sp3;
            h3.f431b = 0;
            h3.f432c = false;
            h3.f433d = false;
            hArr[i] = h3;
        }
        this.f28954Q = z11;
        this.f28944F = new Is(this);
        this.f28945G = new ArrayList();
        this.f28939C = new U7();
        this.f28940D = new K7();
        AbstractC2792Sd.H(c3672o.f33610a == null);
        c3672o.f33610a = this;
        c3672o.f33611b = interfaceC4211y;
        this.f28982x0 = true;
        C3235ft x9 = v22.x(looper, null);
        this.f28953P = x9;
        this.J = new C3159eO(bo, x9, new C4042ut(11, this));
        this.f28948K = new G3.m(this, bo, x9, io, interfaceC4211y);
        R5 r52 = new R5();
        r52.f27929u = new Object();
        r52.f27930v = null;
        r52.f27931w = null;
        r52.f27928n = 0;
        this.f28935A = r52;
        synchronized (r52.f27929u) {
            try {
                if (((Looper) r52.f27930v) == null) {
                    if (r52.f27928n == 0 && ((HandlerThread) r52.f27931w) == null) {
                        z10 = true;
                    }
                    AbstractC2792Sd.H(z10);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    r52.f27931w = handlerThread;
                    handlerThread.start();
                    r52.f27930v = ((HandlerThread) r52.f27931w).getLooper();
                }
                r52.f27928n++;
                looper2 = (Looper) r52.f27930v;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f28937B = looper2;
        C3235ft x10 = v22.x(looper2, this);
        this.f28985z = x10;
        this.f28955R = new Cif(context, looper2, this);
        x10.b(35, new InterfaceC3351i0() { // from class: com.google.android.gms.internal.ads.RN
            @Override // com.google.android.gms.internal.ads.InterfaceC3351i0
            public final /* synthetic */ void a(long j9, long j10, DP dp, MediaFormat mediaFormat) {
                VN.this.a(j9, j10, dp, mediaFormat);
            }
        }).a();
        x10.b(39, new SN()).a();
    }

    public static final boolean A(C3052cO c3052cO) {
        if (c3052cO != null) {
            try {
                C3483kQ c3483kQ = c3052cO.f30256a;
                if (c3052cO.f30260e) {
                    LQ[] lqArr = c3052cO.f30258c;
                    for (int i = 0; i < 2; i++) {
                        LQ lq = lqArr[i];
                        if (lq != null) {
                            lq.f();
                        }
                    }
                } else {
                    c3483kQ.q();
                }
                if ((!c3052cO.f30260e ? 0L : c3483kQ.i()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public static int W(U7 u72, K7 k72, int i, boolean z6, Object obj, AbstractC3627n8 abstractC3627n8, AbstractC3627n8 abstractC3627n82) {
        U7 u73 = u72;
        AbstractC3627n8 abstractC3627n83 = abstractC3627n8;
        Object obj2 = abstractC3627n83.b(abstractC3627n83.o(obj, k72).f26619c, u72, 0L).f28690a;
        for (int i4 = 0; i4 < abstractC3627n82.a(); i4++) {
            if (abstractC3627n82.b(i4, u72, 0L).f28690a.equals(obj2)) {
                return i4;
            }
        }
        int e9 = abstractC3627n83.e(obj);
        int c9 = abstractC3627n83.c();
        int i6 = -1;
        int i9 = 0;
        while (true) {
            if (i9 >= c9 || i6 != -1) {
                break;
            }
            AbstractC3627n8 abstractC3627n84 = abstractC3627n83;
            int l9 = abstractC3627n84.l(e9, k72, u73, i, z6);
            if (l9 == -1) {
                i6 = -1;
                break;
            }
            i6 = abstractC3627n82.e(abstractC3627n84.f(l9));
            i9++;
            abstractC3627n83 = abstractC3627n84;
            e9 = l9;
            u73 = u72;
        }
        if (i6 == -1) {
            return -1;
        }
        return abstractC3627n82.d(i6, k72, false).f26619c;
    }

    public static Pair z(AbstractC3627n8 abstractC3627n8, UN un, int i, boolean z6, U7 u72, K7 k72) {
        AbstractC3627n8 abstractC3627n82 = un.f28718a;
        if (abstractC3627n8.g()) {
            return null;
        }
        AbstractC3627n8 abstractC3627n83 = true == abstractC3627n82.g() ? abstractC3627n8 : abstractC3627n82;
        try {
            Pair m9 = abstractC3627n83.m(u72, k72, un.f28719b, un.f28720c);
            if (!abstractC3627n8.equals(abstractC3627n83)) {
                if (abstractC3627n8.e(m9.first) == -1) {
                    int W3 = W(u72, k72, i, z6, m9.first, abstractC3627n83, abstractC3627n8);
                    if (W3 != -1) {
                        return abstractC3627n8.m(u72, k72, W3, com.anythink.basead.exoplayer.b.f7168b);
                    }
                    return null;
                }
                if (abstractC3627n83.o(m9.first, k72).f26621e && abstractC3627n83.b(k72.f26619c, u72, 0L).f28699k == abstractC3627n83.e(m9.first)) {
                    return abstractC3627n8.m(u72, k72, abstractC3627n8.o(m9.first, k72).f26619c, un.f28720c);
                }
            }
            return m9;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public final void B() {
        for (int i = 0; i < 2; i++) {
            D0.H[] hArr = this.f28967n;
            int r9 = hArr[i].r();
            D0.H h3 = hArr[i];
            SP sp = (SP) h3.f434e;
            Is is = this.f28944F;
            h3.i(sp, is);
            SP sp2 = (SP) h3.f435f;
            if (sp2 != null) {
                boolean z6 = (sp2.f28196A == 0 || h3.f431b == 3) ? false : true;
                h3.i(sp2, is);
                h3.j(false);
                if (z6) {
                    sp2.getClass();
                    sp2.b(17, (SP) h3.f434e);
                }
            }
            h3.f431b = 0;
            m(i, false);
            this.f28973s0 -= r9;
        }
        this.f28938B0 = com.anythink.basead.exoplayer.b.f7168b;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a A[Catch: RuntimeException -> 0x0044, TryCatch #1 {RuntimeException -> 0x0044, blocks: (B:38:0x0035, B:18:0x0040, B:16:0x003a, B:30:0x0047), top: B:37:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0035 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C() {
        boolean z6;
        SP sp;
        if (!this.f28954Q || !V()) {
            return;
        }
        int i = 0;
        while (true) {
            int i4 = 2;
            if (i >= 2) {
                this.f28938B0 = com.anythink.basead.exoplayer.b.f7168b;
                return;
            }
            D0.H h3 = this.f28967n[i];
            int r9 = h3.r();
            Is is = this.f28944F;
            if (h3.q()) {
                int i6 = h3.f431b;
                if (i6 == 4) {
                    i4 = i6;
                } else if (i6 != 2) {
                    i4 = i6;
                    z6 = false;
                    if (z6) {
                        sp = (SP) h3.f435f;
                        if (sp == null) {
                            throw null;
                        }
                        h3.i(sp, is);
                        h3.j(z6);
                        h3.f431b = i4 != 4 ? 0 : 1;
                    } else {
                        try {
                            sp = (SP) h3.f434e;
                            h3.i(sp, is);
                        } catch (RuntimeException e9) {
                            AbstractC2991bG.J("RendererHolder", "Disable prewarming failed.", e9);
                        }
                        try {
                            h3.j(z6);
                        } catch (RuntimeException e10) {
                            AbstractC2991bG.J("RendererHolder", "Reset prewarming failed.", e10);
                        }
                        h3.f431b = i4 != 4 ? 0 : 1;
                    }
                }
                z6 = true;
                if (z6) {
                }
            }
            this.f28973s0 -= r9 - h3.r();
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
        int i4;
        int i6;
        Is is = this.f28944F;
        float f2 = is.j().f35002a;
        C3159eO c3159eO = this.J;
        C3052cO c3052cO = c3159eO.f30713h;
        C3052cO c3052cO2 = c3159eO.i;
        C3941t c3941t = null;
        C3052cO c3052cO3 = c3052cO;
        boolean z6 = true;
        while (c3052cO3 != null && c3052cO3.f30260e) {
            C3941t f9 = c3052cO3.f(this.f28962Z.f32728a);
            C3941t c3941t2 = c3052cO3 == c3159eO.f30713h ? f9 : c3941t;
            C3941t c3941t3 = c3052cO3.f30269o;
            boolean z9 = false;
            if (c3941t3 != null) {
                InterfaceC3780q[] interfaceC3780qArr = (InterfaceC3780q[]) f9.f34965v;
                if (((InterfaceC3780q[]) c3941t3.f34965v).length == interfaceC3780qArr.length) {
                    for (int i9 = 0; i9 < interfaceC3780qArr.length; i9++) {
                        if (f9.d(c3941t3, i9)) {
                        }
                    }
                    if (c3052cO3 != c3052cO2) {
                        z9 = true;
                    }
                    z6 &= z9;
                    c3052cO3 = c3052cO3.f30267m;
                    c3941t = c3941t2;
                }
            }
            if (z6) {
                C3052cO c3052cO4 = c3159eO.f30713h;
                int y7 = c3159eO.y(c3052cO4) & 1;
                D0.H[] hArr = this.f28967n;
                boolean[] zArr = new boolean[2];
                c3941t2.getClass();
                long g9 = c3052cO4.g(c3941t2, this.f28962Z.f32744r, 1 == y7, zArr);
                C3589mO c3589mO = this.f28962Z;
                boolean z10 = (c3589mO.f32732e == 4 || g9 == c3589mO.f32744r) ? false : true;
                C3589mO c3589mO2 = this.f28962Z;
                boolean z11 = z10;
                i = 4;
                this.f28962Z = N(c3589mO2.f32729b, g9, c3589mO2.f32730c, c3589mO2.f32731d, z11, 5);
                if (z11) {
                    s(g9, true);
                }
                C();
                boolean[] zArr2 = new boolean[2];
                int i10 = 0;
                for (int i11 = 2; i10 < i11; i11 = 2) {
                    int r9 = hArr[i10].r();
                    zArr2[i10] = hArr[i10].g();
                    D0.H h3 = hArr[i10];
                    LQ lq = c3052cO4.f30258c[i10];
                    long j6 = this.f28976u0;
                    boolean z12 = zArr[i10];
                    SP sp = (SP) h3.f434e;
                    if (D0.H.l(sp)) {
                        if (lq != sp.f28198B) {
                            h3.i(sp, is);
                        } else if (z12) {
                            sp.N(j6, false, true);
                        }
                    }
                    SP sp2 = (SP) h3.f435f;
                    if (sp2 != null && D0.H.l(sp2)) {
                        if (lq != sp2.f28198B) {
                            h3.i(sp2, is);
                        } else if (z12) {
                            sp2.N(j6, false, true);
                        }
                    }
                    if (r9 - hArr[i10].r() > 0) {
                        m(i10, false);
                    }
                    this.f28973s0 -= r9 - hArr[i10].r();
                    i10++;
                }
                O(zArr2, this.f28976u0);
                c3052cO4.f30263h = true;
            } else {
                i = 4;
                c3159eO.y(c3052cO3);
                if (c3052cO3.f30260e) {
                    long max = Math.max(c3052cO3.f30262g.f30533b, this.f28976u0 - c3052cO3.f30270p);
                    if (this.f28954Q && V() && c3159eO.f30714j == c3052cO3) {
                        C();
                    }
                    i4 = 2;
                    i6 = 4;
                    c3052cO3.g(f9, max, false, new boolean[2]);
                    Q(true);
                    if (this.f28962Z.f32732e == i6) {
                        L();
                        l();
                        this.f28985z.c(i4);
                        return;
                    }
                    return;
                }
            }
            i6 = i;
            i4 = 2;
            Q(true);
            if (this.f28962Z.f32732e == i6) {
            }
        }
    }

    public final boolean E() {
        C3052cO c3052cO = this.J.f30713h;
        long j6 = c3052cO.f30262g.f30536e;
        if (c3052cO.f30260e) {
            return j6 == com.anythink.basead.exoplayer.b.f7168b || this.f28962Z.f32744r < j6 || !T();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:250:0x0262, code lost:
    
        r13.f26622f.getClass();
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
    /* JADX WARN: Type inference failed for: r8v23, types: [com.google.android.gms.internal.ads.SP] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(AbstractC3627n8 abstractC3627n8, boolean z6) {
        long j6;
        boolean z9;
        boolean z10;
        long j9;
        K7 k72;
        C3860rQ c3860rQ;
        AbstractC3627n8 abstractC3627n82;
        int i;
        Object obj;
        long j10;
        int i4;
        long j11;
        boolean z11;
        int i6;
        boolean z12;
        boolean z13;
        boolean z14;
        K7 k73;
        Object obj2;
        long j12;
        C3860rQ E8;
        AbstractC3627n8 abstractC3627n83;
        int i9;
        C3860rQ c3860rQ2;
        int i10;
        int i11;
        boolean z15;
        boolean z16;
        long j13;
        long j14;
        boolean z17;
        int i12;
        Object obj3;
        K7 k74;
        boolean z18;
        C3860rQ c3860rQ3;
        long j15;
        boolean z19;
        boolean z20;
        boolean z21;
        ?? r82;
        boolean z22;
        int i13;
        AbstractC3627n8 abstractC3627n84;
        int i14;
        int i15;
        int[] iArr;
        int i16;
        Object obj4;
        long longValue;
        int i17;
        boolean z23;
        boolean z24;
        long j16;
        boolean z25;
        boolean z26;
        ?? r42;
        boolean z27;
        AbstractC3627n8 abstractC3627n85;
        C3860rQ c3860rQ4;
        UN un;
        boolean z28;
        int i18;
        boolean z29;
        long j17;
        long j18;
        UN un2;
        boolean z30;
        ?? r13;
        long H8;
        boolean z31;
        int C8;
        UN un3;
        boolean z32;
        long j19;
        long j20;
        UN un4;
        boolean z33;
        C3159eO c3159eO;
        long j21;
        boolean z34;
        C3589mO c3589mO = this.f28962Z;
        UN un5 = this.f28974t0;
        K7 k75 = this.f28940D;
        int i19 = this.f28970p0;
        boolean z35 = this.f28971q0;
        boolean z36 = this.f28956S;
        if (abstractC3627n8.g()) {
            C3860rQ c3860rQ5 = C3589mO.f32727t;
            C3860rQ c3860rQ6 = c3589mO.f32729b;
            boolean z37 = (c3860rQ5.equals(c3860rQ6) && c3589mO.f32744r == 0) ? false : true;
            if (z37 && z6) {
                AbstractC3627n8 abstractC3627n86 = c3589mO.f32728a;
                if (!abstractC3627n86.g() && !abstractC3627n86.o(c3860rQ6.f34406a, k75).f26621e) {
                    z34 = true;
                    c3860rQ3 = c3860rQ5;
                    i13 = 4;
                    j15 = 0;
                    j13 = 0;
                    z20 = false;
                    r82 = 1;
                    z22 = false;
                    j6 = com.anythink.basead.exoplayer.b.f7168b;
                    j12 = com.anythink.basead.exoplayer.b.f7168b;
                    abstractC3627n83 = abstractC3627n8;
                    z21 = z34;
                    z19 = z37;
                }
            }
            z34 = false;
            c3860rQ3 = c3860rQ5;
            i13 = 4;
            j15 = 0;
            j13 = 0;
            z20 = false;
            r82 = 1;
            z22 = false;
            j6 = com.anythink.basead.exoplayer.b.f7168b;
            j12 = com.anythink.basead.exoplayer.b.f7168b;
            abstractC3627n83 = abstractC3627n8;
            z21 = z34;
            z19 = z37;
        } else {
            C3860rQ c3860rQ7 = c3589mO.f32729b;
            Object obj5 = c3860rQ7.f34406a;
            AbstractC3627n8 abstractC3627n87 = c3589mO.f32728a;
            if (abstractC3627n87.g()) {
                j6 = com.anythink.basead.exoplayer.b.f7168b;
            } else {
                j6 = com.anythink.basead.exoplayer.b.f7168b;
                if (!abstractC3627n87.o(c3860rQ7.f34406a, k75).f26621e) {
                    z9 = false;
                    if (!c3860rQ7.b() || z9) {
                        z10 = z9;
                        j9 = c3589mO.f32730c;
                    } else {
                        z10 = z9;
                        j9 = c3589mO.f32744r;
                    }
                    U7 u72 = this.f28939C;
                    if (un5 == null) {
                        c3860rQ = c3860rQ7;
                        abstractC3627n82 = abstractC3627n8;
                        Pair z38 = z(abstractC3627n82, un5, i19, z35, u72, k75);
                        if (z38 == null) {
                            i17 = abstractC3627n82.k(z35);
                            obj4 = obj5;
                            j16 = j9;
                            z26 = true;
                            z24 = false;
                            z25 = false;
                        } else {
                            if (un5.f28720c == j6) {
                                i17 = abstractC3627n82.o(z38.first, k75).f26619c;
                                obj4 = obj5;
                                longValue = j9;
                                z23 = false;
                            } else {
                                obj4 = z38.first;
                                longValue = ((Long) z38.second).longValue();
                                i17 = -1;
                                z23 = true;
                            }
                            z24 = c3589mO.f32732e == 4;
                            j16 = longValue;
                            z25 = z23;
                            z26 = false;
                        }
                        z13 = z26;
                        j10 = j16;
                        i = 1;
                        i4 = i17;
                        z11 = z25;
                        obj = obj4;
                        k72 = k75;
                        z12 = z24;
                        i6 = -1;
                    } else {
                        k72 = k75;
                        c3860rQ = c3860rQ7;
                        abstractC3627n82 = abstractC3627n8;
                        AbstractC3627n8 abstractC3627n88 = c3589mO.f32728a;
                        if (abstractC3627n88.g()) {
                            i4 = abstractC3627n82.k(z35);
                            obj = obj5;
                            j10 = j9;
                            i6 = -1;
                            z12 = false;
                            i = 1;
                        } else if (abstractC3627n82.e(obj5) == -1) {
                            i = 1;
                            int W3 = W(u72, k72, i19, z35, obj5, abstractC3627n88, abstractC3627n82);
                            u72 = u72;
                            abstractC3627n82 = abstractC3627n82;
                            obj5 = obj5;
                            if (W3 == -1) {
                                i4 = abstractC3627n82.k(z35);
                                z14 = true;
                            } else {
                                i4 = W3;
                                z14 = false;
                            }
                            z13 = z14;
                            obj = obj5;
                            j10 = j9;
                            i6 = -1;
                            z12 = false;
                            z11 = false;
                        } else {
                            i = 1;
                            if (j9 == j6) {
                                i4 = abstractC3627n82.o(obj5, k72).f26619c;
                                obj = obj5;
                                j10 = j9;
                            } else if (z10) {
                                abstractC3627n88.o(obj5, k72);
                                if (abstractC3627n88.b(k72.f26619c, u72, 0L).f28699k == abstractC3627n88.e(obj5)) {
                                    Pair m9 = abstractC3627n82.m(u72, k72, abstractC3627n82.o(obj5, k72).f26619c, j9);
                                    u72 = u72;
                                    k72 = k72;
                                    obj = m9.first;
                                    j11 = ((Long) m9.second).longValue();
                                } else if (abstractC3627n82.o(obj5, k72).f26620d != j6) {
                                    long j22 = k72.f26620d - 1;
                                    String str = AbstractC3182eu.f30782a;
                                    j11 = Math.max(0L, Math.min(j9, j22));
                                    obj = obj5;
                                } else {
                                    obj = obj5;
                                    j11 = j9;
                                }
                                j10 = j11;
                                z11 = true;
                                i4 = -1;
                                i6 = -1;
                                z12 = false;
                                z13 = false;
                            } else {
                                obj = obj5;
                                j10 = j9;
                                i4 = -1;
                            }
                            i6 = -1;
                            z12 = false;
                        }
                        z13 = false;
                        z11 = false;
                    }
                    if (i4 == i6) {
                        K7 k76 = k72;
                        Pair m10 = abstractC3627n82.m(u72, k76, i4, com.anythink.basead.exoplayer.b.f7168b);
                        k73 = k76;
                        Object obj6 = m10.first;
                        j10 = ((Long) m10.second).longValue();
                        obj2 = obj6;
                        j12 = j6;
                    } else {
                        k73 = k72;
                        obj2 = obj;
                        j12 = j10;
                    }
                    long j23 = j9;
                    long j24 = j10;
                    E8 = this.J.E(c3589mO, abstractC3627n8, obj2, z36, z10);
                    abstractC3627n83 = abstractC3627n8;
                    i9 = E8.f34410e;
                    if (i9 == -1) {
                        c3860rQ2 = c3860rQ;
                        int i20 = c3860rQ2.f34410e;
                        if (i20 == -1 || i9 < i20) {
                            i10 = 0;
                            boolean equals = obj5.equals(obj2);
                            i11 = (equals || c3860rQ2.b() || E8.b() || i10 == 0) ? 0 : i;
                            K7 o4 = abstractC3627n83.o(obj2, k73);
                            z15 = z9;
                            if (!z10) {
                                ?? r12 = (j23 > j12 ? 1 : (j23 == j12 ? 0 : -1));
                                z15 = r12;
                                if (r12 == 0) {
                                    boolean equals2 = obj5.equals(E8.f34406a);
                                    z15 = equals2;
                                    if (equals2) {
                                        if (c3860rQ2.b()) {
                                            o4.c(c3860rQ2.f34407b);
                                        }
                                        boolean b9 = E8.b();
                                        z15 = b9;
                                        if (b9) {
                                            int i21 = E8.f34407b;
                                            o4.c(i21);
                                            z15 = i21;
                                        }
                                    }
                                }
                            }
                            if (i == i11) {
                                E8 = c3860rQ2;
                            }
                            if (E8.b()) {
                                if (E8.equals(c3860rQ2)) {
                                    j14 = c3589mO.f32744r;
                                    z16 = z12;
                                } else {
                                    abstractC3627n83.o(E8.f34406a, k73);
                                    int i22 = E8.f34408c;
                                    C2920a a9 = k73.f26622f.a(E8.f34407b);
                                    int i23 = 0;
                                    while (true) {
                                        int[] iArr2 = a9.f29756d;
                                        if (i23 >= iArr2.length || (i16 = iArr2[i23]) == 0 || i16 == i) {
                                            break;
                                        } else {
                                            i23 += i;
                                        }
                                    }
                                    z16 = z12;
                                    j14 = 0;
                                }
                                j13 = 0;
                            } else {
                                if (equals && c3860rQ2.b()) {
                                    C2920a a10 = abstractC3627n83.o(obj2, k73).f26622f.a(c3860rQ2.f34407b);
                                    a10.getClass();
                                    z16 = z12;
                                    long j25 = c3589mO.f32730c;
                                    j13 = 0;
                                    if (j25 == j6 || j25 < 0) {
                                        int i24 = a10.f29753a;
                                        int i25 = c3860rQ2.f34408c;
                                        if (i24 > i25 && a10.f29756d[i25] == 2) {
                                            long j26 = abstractC3627n83.o(obj2, k73).f26620d;
                                            j14 = j26 != j6 ? Math.min(j26 - 1, j24) : j24;
                                            j12 = j14;
                                        }
                                    }
                                } else {
                                    z16 = z12;
                                    j13 = 0;
                                }
                                j14 = j24;
                            }
                            z17 = E8.equals(c3860rQ2) || j14 != c3589mO.f32744r;
                            i12 = abstractC3627n83.e(obj5) == -1 ? 4 : 3;
                            obj3 = E8.f34406a;
                            if (obj3.equals(obj5) && (i14 = E8.f34407b) != -1) {
                                C2920a a11 = abstractC3627n83.o(obj3, k73).f26622f.a(i14);
                                i15 = E8.f34408c;
                                iArr = a11.f29756d;
                                if (i15 < iArr.length || iArr[i15] != 2) {
                                    k74 = k73;
                                    i12 = 0;
                                    if (z17 && z6) {
                                        abstractC3627n84 = c3589mO.f32728a;
                                        if (!abstractC3627n84.g() && !abstractC3627n84.o(obj5, k74).f26621e) {
                                            z18 = true;
                                            c3860rQ3 = E8;
                                            j15 = j14;
                                            z19 = z17;
                                            z20 = z16;
                                            z21 = z18;
                                            r82 = z13;
                                            z22 = z11;
                                            i13 = i12;
                                        }
                                    }
                                    z18 = false;
                                    c3860rQ3 = E8;
                                    j15 = j14;
                                    z19 = z17;
                                    z20 = z16;
                                    z21 = z18;
                                    r82 = z13;
                                    z22 = z11;
                                    i13 = i12;
                                }
                            }
                            k74 = k73;
                            if (z17) {
                                abstractC3627n84 = c3589mO.f32728a;
                                if (!abstractC3627n84.g()) {
                                    z18 = true;
                                    c3860rQ3 = E8;
                                    j15 = j14;
                                    z19 = z17;
                                    z20 = z16;
                                    z21 = z18;
                                    r82 = z13;
                                    z22 = z11;
                                    i13 = i12;
                                }
                            }
                            z18 = false;
                            c3860rQ3 = E8;
                            j15 = j14;
                            z19 = z17;
                            z20 = z16;
                            z21 = z18;
                            r82 = z13;
                            z22 = z11;
                            i13 = i12;
                        }
                    } else {
                        c3860rQ2 = c3860rQ;
                    }
                    i10 = i;
                    boolean equals3 = obj5.equals(obj2);
                    if (equals3) {
                    }
                    K7 o42 = abstractC3627n83.o(obj2, k73);
                    z15 = z9;
                    if (!z10) {
                    }
                    if (i == i11) {
                    }
                    if (E8.b()) {
                    }
                    if (E8.equals(c3860rQ2)) {
                    }
                    if (abstractC3627n83.e(obj5) == -1) {
                    }
                    obj3 = E8.f34406a;
                    if (obj3.equals(obj5)) {
                        C2920a a112 = abstractC3627n83.o(obj3, k73).f26622f.a(i14);
                        i15 = E8.f34408c;
                        iArr = a112.f29756d;
                        if (i15 < iArr.length) {
                        }
                        k74 = k73;
                        i12 = 0;
                        if (z17) {
                        }
                        z18 = false;
                        c3860rQ3 = E8;
                        j15 = j14;
                        z19 = z17;
                        z20 = z16;
                        z21 = z18;
                        r82 = z13;
                        z22 = z11;
                        i13 = i12;
                    }
                    k74 = k73;
                    if (z17) {
                    }
                    z18 = false;
                    c3860rQ3 = E8;
                    j15 = j14;
                    z19 = z17;
                    z20 = z16;
                    z21 = z18;
                    r82 = z13;
                    z22 = z11;
                    i13 = i12;
                }
            }
            z9 = true;
            if (c3860rQ7.b()) {
            }
            z10 = z9;
            j9 = c3589mO.f32730c;
            U7 u722 = this.f28939C;
            if (un5 == null) {
            }
            if (i4 == i6) {
            }
            long j232 = j9;
            long j242 = j10;
            E8 = this.J.E(c3589mO, abstractC3627n8, obj2, z36, z10);
            abstractC3627n83 = abstractC3627n8;
            i9 = E8.f34410e;
            if (i9 == -1) {
            }
            i10 = i;
            boolean equals32 = obj5.equals(obj2);
            if (equals32) {
            }
            K7 o422 = abstractC3627n83.o(obj2, k73);
            z15 = z9;
            if (!z10) {
            }
            if (i == i11) {
            }
            if (E8.b()) {
            }
            if (E8.equals(c3860rQ2)) {
            }
            if (abstractC3627n83.e(obj5) == -1) {
            }
            obj3 = E8.f34406a;
            if (obj3.equals(obj5)) {
            }
            k74 = k73;
            if (z17) {
            }
            z18 = false;
            c3860rQ3 = E8;
            j15 = j14;
            z19 = z17;
            z20 = z16;
            z21 = z18;
            r82 = z13;
            z22 = z11;
            i13 = i12;
        }
        if (r82 != 0) {
            try {
                z27 = true;
                if (this.f28962Z.f32732e != 1) {
                    try {
                        c(4);
                    } catch (Throwable th) {
                        th = th;
                        C3860rQ c3860rQ8 = c3860rQ3;
                        abstractC3627n85 = abstractC3627n83;
                        c3860rQ4 = c3860rQ8;
                        un = null;
                        z28 = z21;
                        i18 = i13;
                        z29 = false;
                        C3589mO c3589mO2 = this.f28962Z;
                        AbstractC3627n8 abstractC3627n89 = c3589mO2.f32728a;
                        C3860rQ c3860rQ9 = c3589mO2.f32729b;
                        C3860rQ c3860rQ10 = c3860rQ4;
                        G(abstractC3627n85, c3860rQ10, abstractC3627n89, c3860rQ9, true == z22 ? j6 : j15, false);
                        if (!z19) {
                        }
                        if (z28) {
                        }
                        this.f28962Z = N(c3860rQ10, j18, j12, j17, z28, i18);
                        J();
                        x(abstractC3627n85, this.f28962Z.f32728a);
                        this.f28962Z = this.f28962Z.c(abstractC3627n85);
                        if (!abstractC3627n85.g()) {
                        }
                        Q(z29);
                        this.f28985z.c(2);
                        throw th;
                    }
                }
                r42 = 0;
            } catch (Throwable th2) {
                th = th2;
                r42 = 0;
                C3860rQ c3860rQ11 = c3860rQ3;
                abstractC3627n85 = abstractC3627n83;
                c3860rQ4 = c3860rQ11;
                un2 = null;
                z30 = r42;
                z28 = z21;
                i18 = i13;
                z29 = z30;
                un = un2;
                C3589mO c3589mO22 = this.f28962Z;
                AbstractC3627n8 abstractC3627n892 = c3589mO22.f32728a;
                C3860rQ c3860rQ92 = c3589mO22.f32729b;
                C3860rQ c3860rQ102 = c3860rQ4;
                G(abstractC3627n85, c3860rQ102, abstractC3627n892, c3860rQ92, true == z22 ? j6 : j15, false);
                if (!z19) {
                }
                if (z28) {
                }
                this.f28962Z = N(c3860rQ102, j18, j12, j17, z28, i18);
                J();
                x(abstractC3627n85, this.f28962Z.f32728a);
                this.f28962Z = this.f28962Z.c(abstractC3627n85);
                if (!abstractC3627n85.g()) {
                }
                Q(z29);
                this.f28985z.c(2);
                throw th;
            }
            try {
                v(false, false, false, true);
            } catch (Throwable th3) {
                th = th3;
                C3860rQ c3860rQ112 = c3860rQ3;
                abstractC3627n85 = abstractC3627n83;
                c3860rQ4 = c3860rQ112;
                un2 = null;
                z30 = r42;
                z28 = z21;
                i18 = i13;
                z29 = z30;
                un = un2;
                C3589mO c3589mO222 = this.f28962Z;
                AbstractC3627n8 abstractC3627n8922 = c3589mO222.f32728a;
                C3860rQ c3860rQ922 = c3589mO222.f32729b;
                C3860rQ c3860rQ1022 = c3860rQ4;
                G(abstractC3627n85, c3860rQ1022, abstractC3627n8922, c3860rQ922, true == z22 ? j6 : j15, false);
                if (!z19) {
                }
                if (z28) {
                }
                this.f28962Z = N(c3860rQ1022, j18, j12, j17, z28, i18);
                J();
                x(abstractC3627n85, this.f28962Z.f32728a);
                this.f28962Z = this.f28962Z.c(abstractC3627n85);
                if (!abstractC3627n85.g()) {
                }
                Q(z29);
                this.f28985z.c(2);
                throw th;
            }
        } else {
            r42 = 0;
            z27 = z15;
        }
        D0.H[] hArr = this.f28967n;
        int i26 = r42;
        AbstractC3627n8 abstractC3627n810 = r82;
        boolean z39 = z27;
        while (true) {
            r13 = 2;
            if (i26 < 2) {
                D0.H h3 = hArr[i26];
                ?? r83 = (SP) h3.f434e;
                if (!Objects.equals(r83.f28211I, abstractC3627n83)) {
                    r83.f28211I = abstractC3627n83;
                    r83.P();
                    r83.n0();
                }
                SP sp = (SP) h3.f435f;
                if (sp != null && (r83 = Objects.equals(sp.f28211I, abstractC3627n83)) == 0) {
                    sp.f28211I = abstractC3627n83;
                    sp.P();
                    sp.n0();
                }
                z39 = true;
                i26++;
                abstractC3627n810 = r83;
            } else {
                try {
                    break;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        if (z19) {
            AbstractC3627n8 abstractC3627n811 = abstractC3627n83;
            UN un6 = null;
            boolean z40 = r42;
            z33 = z40;
            un4 = un6;
            if (!abstractC3627n811.g()) {
                try {
                    C3159eO c3159eO2 = this.J;
                    for (C3052cO c3052cO = c3159eO2.f30713h; c3052cO != null; c3052cO = c3052cO.f30267m) {
                        if (c3052cO.f30262g.f30532a.equals(c3860rQ3)) {
                            c3052cO.f30262g = c3159eO2.D(abstractC3627n811, c3052cO.f30262g);
                        }
                    }
                    c3159eO = this.J;
                    c3860rQ4 = c3860rQ3;
                    j21 = j15;
                } catch (Throwable th5) {
                    th = th5;
                    c3860rQ4 = c3860rQ3;
                }
                try {
                    j15 = r(c3860rQ4, j21, c3159eO.f30713h != c3159eO.i ? true : z40 ? 1 : 0, z20);
                    z32 = z40;
                    un3 = un6;
                    C3589mO c3589mO3 = this.f28962Z;
                    C3860rQ c3860rQ12 = c3860rQ4;
                    G(abstractC3627n8, c3860rQ12, c3589mO3.f32728a, c3589mO3.f32729b, true == z22 ? j6 : j15, false);
                    if (!z19 || j12 != this.f28962Z.f32730c) {
                        if (z21) {
                            j19 = this.f28962Z.f32731d;
                            j20 = j15;
                        } else {
                            j20 = j15;
                            j19 = j20;
                        }
                        this.f28962Z = N(c3860rQ12, j20, j12, j19, z21, i13);
                    }
                    J();
                    x(abstractC3627n8, this.f28962Z.f32728a);
                    this.f28962Z = this.f28962Z.c(abstractC3627n8);
                    if (!abstractC3627n8.g()) {
                        this.f28974t0 = un3;
                    }
                    Q(z32);
                    this.f28985z.c(2);
                } catch (Throwable th6) {
                    th = th6;
                    j15 = j21;
                    abstractC3627n85 = abstractC3627n811;
                    z30 = z40;
                    un2 = un6;
                    z28 = z21;
                    i18 = i13;
                    z29 = z30;
                    un = un2;
                    C3589mO c3589mO2222 = this.f28962Z;
                    AbstractC3627n8 abstractC3627n89222 = c3589mO2222.f32728a;
                    C3860rQ c3860rQ9222 = c3589mO2222.f32729b;
                    C3860rQ c3860rQ10222 = c3860rQ4;
                    G(abstractC3627n85, c3860rQ10222, abstractC3627n89222, c3860rQ9222, true == z22 ? j6 : j15, false);
                    if (!z19) {
                    }
                    if (z28) {
                    }
                    this.f28962Z = N(c3860rQ10222, j18, j12, j17, z28, i18);
                    J();
                    x(abstractC3627n85, this.f28962Z.f32728a);
                    this.f28962Z = this.f28962Z.c(abstractC3627n85);
                    if (!abstractC3627n85.g()) {
                    }
                    Q(z29);
                    this.f28985z.c(2);
                    throw th;
                }
            }
        } else {
            try {
                C3159eO c3159eO3 = this.J;
                C3052cO c3052cO2 = c3159eO3.i;
                long H9 = c3052cO2 == null ? j13 : H(c3052cO2);
                try {
                    try {
                        if (V()) {
                            try {
                                C3052cO c3052cO3 = c3159eO3.f30714j;
                                if (c3052cO3 != null) {
                                    H8 = H(c3052cO3);
                                    z31 = r42;
                                    r13 = 0;
                                    z39 = z31;
                                    C8 = c3159eO3.C(abstractC3627n8, this.f28976u0, H9, H8);
                                    if ((C8 & 1) == 0) {
                                        h(z39);
                                        z33 = z39;
                                        un4 = r13;
                                    } else {
                                        z33 = z39;
                                        un4 = r13;
                                        if ((C8 & 2) != 0) {
                                            C();
                                            z33 = z39;
                                            un4 = r13;
                                        }
                                    }
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                un = null;
                                z29 = r42;
                                z28 = z21;
                                c3860rQ4 = c3860rQ3;
                                i18 = i13;
                                abstractC3627n85 = abstractC3627n8;
                                C3589mO c3589mO22222 = this.f28962Z;
                                AbstractC3627n8 abstractC3627n892222 = c3589mO22222.f32728a;
                                C3860rQ c3860rQ92222 = c3589mO22222.f32729b;
                                C3860rQ c3860rQ102222 = c3860rQ4;
                                G(abstractC3627n85, c3860rQ102222, abstractC3627n892222, c3860rQ92222, true == z22 ? j6 : j15, false);
                                if (!z19 || j12 != this.f28962Z.f32730c) {
                                    if (z28) {
                                        j17 = this.f28962Z.f32731d;
                                        j18 = j15;
                                    } else {
                                        j18 = j15;
                                        j17 = j18;
                                    }
                                    this.f28962Z = N(c3860rQ102222, j18, j12, j17, z28, i18);
                                }
                                J();
                                x(abstractC3627n85, this.f28962Z.f32728a);
                                this.f28962Z = this.f28962Z.c(abstractC3627n85);
                                if (!abstractC3627n85.g()) {
                                    this.f28974t0 = un;
                                }
                                Q(z29);
                                this.f28985z.c(2);
                                throw th;
                            }
                        }
                        C8 = c3159eO3.C(abstractC3627n8, this.f28976u0, H9, H8);
                        if ((C8 & 1) == 0) {
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        abstractC3627n810 = abstractC3627n8;
                        z28 = z21;
                        c3860rQ4 = c3860rQ3;
                        i18 = i13;
                        abstractC3627n85 = abstractC3627n810;
                        z29 = z39;
                        un = r13;
                        C3589mO c3589mO222222 = this.f28962Z;
                        AbstractC3627n8 abstractC3627n8922222 = c3589mO222222.f32728a;
                        C3860rQ c3860rQ922222 = c3589mO222222.f32729b;
                        C3860rQ c3860rQ1022222 = c3860rQ4;
                        G(abstractC3627n85, c3860rQ1022222, abstractC3627n8922222, c3860rQ922222, true == z22 ? j6 : j15, false);
                        if (!z19) {
                        }
                        if (z28) {
                        }
                        this.f28962Z = N(c3860rQ1022222, j18, j12, j17, z28, i18);
                        J();
                        x(abstractC3627n85, this.f28962Z.f32728a);
                        this.f28962Z = this.f28962Z.c(abstractC3627n85);
                        if (!abstractC3627n85.g()) {
                        }
                        Q(z29);
                        this.f28985z.c(2);
                        throw th;
                    }
                    r13 = 0;
                    z39 = z31;
                } catch (Throwable th9) {
                    th = th9;
                    abstractC3627n810 = abstractC3627n8;
                    r13 = 0;
                    z39 = z31;
                }
                z31 = r42;
                H8 = j13;
            } catch (Throwable th10) {
                th = th10;
                abstractC3627n810 = abstractC3627n8;
                r13 = 0;
                z39 = r42;
            }
        }
        c3860rQ4 = c3860rQ3;
        z32 = z33;
        un3 = un4;
        C3589mO c3589mO32 = this.f28962Z;
        C3860rQ c3860rQ122 = c3860rQ4;
        G(abstractC3627n8, c3860rQ122, c3589mO32.f32728a, c3589mO32.f32729b, true == z22 ? j6 : j15, false);
        if (!z19) {
        }
        if (z21) {
        }
        this.f28962Z = N(c3860rQ122, j20, j12, j19, z21, i13);
        J();
        x(abstractC3627n8, this.f28962Z.f32728a);
        this.f28962Z = this.f28962Z.c(abstractC3627n8);
        if (!abstractC3627n8.g()) {
        }
        Q(z32);
        this.f28985z.c(2);
    }

    public final void G(AbstractC3627n8 abstractC3627n8, C3860rQ c3860rQ, AbstractC3627n8 abstractC3627n82, C3860rQ c3860rQ2, long j6, boolean z6) {
        if (!o(abstractC3627n8, c3860rQ)) {
            C3947t5 c3947t5 = c3860rQ.b() ? C3947t5.f35001d : this.f28962Z.f32741o;
            Is is = this.f28944F;
            if (is.j().equals(c3947t5)) {
                return;
            }
            this.f28985z.d(16);
            is.a(c3947t5);
            K(this.f28962Z.f32741o, c3947t5.f35002a, false, false);
            return;
        }
        Object obj = c3860rQ.f34406a;
        K7 k72 = this.f28940D;
        int i = abstractC3627n8.o(obj, k72).f26619c;
        U7 u72 = this.f28939C;
        abstractC3627n8.b(i, u72, 0L);
        C4158x0 c4158x0 = u72.f28697h;
        String str = AbstractC3182eu.f30782a;
        C4289zN c4289zN = this.f28943E0;
        c4289zN.getClass();
        c4158x0.getClass();
        long u6 = AbstractC3182eu.u(com.anythink.basead.exoplayer.b.f7168b);
        c4289zN.f36104c = u6;
        c4289zN.f36107f = u6;
        c4289zN.f36108g = u6;
        c4289zN.c();
        if (j6 != com.anythink.basead.exoplayer.b.f7168b) {
            c4289zN.f36105d = n(abstractC3627n8, obj, j6);
            c4289zN.c();
            return;
        }
        if (!Objects.equals(!abstractC3627n82.g() ? abstractC3627n82.b(abstractC3627n82.o(c3860rQ2.f34406a, k72).f26619c, u72, 0L).f28690a : null, u72.f28690a) || z6) {
            c4289zN.f36105d = com.anythink.basead.exoplayer.b.f7168b;
            c4289zN.c();
        }
    }

    public final long H(C3052cO c3052cO) {
        if (c3052cO == null) {
            return 0L;
        }
        long j6 = c3052cO.f30270p;
        if (c3052cO.f30260e) {
            for (int i = 0; i < 2; i++) {
                D0.H[] hArr = this.f28967n;
                if (hArr[i].m(c3052cO) != null) {
                    SP m9 = hArr[i].m(c3052cO);
                    Objects.requireNonNull(m9);
                    long j9 = m9.f28205F;
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
        boolean z6;
        C3159eO c3159eO = this.J;
        c3159eO.z();
        C3052cO c3052cO = c3159eO.f30716l;
        if (c3052cO != null) {
            if (!c3052cO.f30259d || c3052cO.f30260e) {
                C3483kQ c3483kQ = c3052cO.f30256a;
                if (c3483kQ.d()) {
                    return;
                }
                AbstractC3627n8 abstractC3627n8 = this.f28962Z.f32728a;
                if (c3052cO.f30260e) {
                    c3483kQ.f();
                }
                if (this.f28983y.j()) {
                    if (!c3052cO.f30259d) {
                        C3106dO c3106dO = c3052cO.f30262g;
                        c3052cO.f30259d = true;
                        c3483kQ.b(this, c3106dO.f30533b);
                        return;
                    }
                    ZN zn = new ZN();
                    zn.f29661a = this.f28976u0 - c3052cO.f30270p;
                    float f2 = this.f28944F.j().f35002a;
                    AbstractC2792Sd.i(f2 > 0.0f || f2 == -3.4028235E38f);
                    zn.f29662b = f2;
                    long j6 = this.f28968n0;
                    if (j6 < 0) {
                        if (j6 != com.anythink.basead.exoplayer.b.f7168b) {
                            z6 = false;
                            AbstractC2792Sd.i(z6);
                            zn.f29663c = j6;
                            C2945aO c2945aO = new C2945aO(zn);
                            AbstractC2792Sd.H(c3052cO.f30267m == null);
                            c3483kQ.e(c2945aO);
                        }
                        j6 = -9223372036854775807L;
                    }
                    z6 = true;
                    AbstractC2792Sd.i(z6);
                    zn.f29663c = j6;
                    C2945aO c2945aO2 = new C2945aO(zn);
                    AbstractC2792Sd.H(c3052cO.f30267m == null);
                    c3483kQ.e(c2945aO2);
                }
            }
        }
    }

    public final void J() {
        C3052cO c3052cO = this.J.f30713h;
        boolean z6 = false;
        if (c3052cO != null && c3052cO.f30262g.f30538g && this.f28965k0) {
            z6 = true;
        }
        this.f28966l0 = z6;
    }

    public final void K(C3947t5 c3947t5, float f2, boolean z6, boolean z9) {
        int i;
        if (z6) {
            if (z9) {
                this.f28963i0.f(1);
            }
            C3589mO c3589mO = this.f28962Z;
            this.f28962Z = new C3589mO(c3589mO.f32728a, c3589mO.f32729b, c3589mO.f32730c, c3589mO.f32731d, c3589mO.f32732e, c3589mO.f32733f, c3589mO.f32734g, c3589mO.f32735h, c3589mO.i, c3589mO.f32736j, c3589mO.f32737k, c3589mO.f32738l, c3589mO.f32739m, c3589mO.f32740n, c3947t5, c3589mO.f32742p, c3589mO.f32743q, c3589mO.f32744r, c3589mO.f32745s);
        }
        float f9 = c3947t5.f35002a;
        C3052cO c3052cO = this.J.f30713h;
        while (true) {
            i = 0;
            if (c3052cO == null) {
                break;
            }
            InterfaceC3780q[] interfaceC3780qArr = (InterfaceC3780q[]) c3052cO.f30269o.f34965v;
            int length = interfaceC3780qArr.length;
            while (i < length) {
                InterfaceC3780q interfaceC3780q = interfaceC3780qArr[i];
                i++;
            }
            c3052cO = c3052cO.f30267m;
        }
        D0.H[] hArr = this.f28967n;
        while (i < 2) {
            D0.H h3 = hArr[i];
            ((SP) h3.f434e).r(f2, f9);
            SP sp = (SP) h3.f435f;
            if (sp != null) {
                sp.r(f2, f9);
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
        boolean z6;
        C3159eO c3159eO = this.J;
        boolean A9 = A(c3159eO.f30715k);
        long j6 = com.anythink.basead.exoplayer.b.f7168b;
        if (A9) {
            C3052cO c3052cO = c3159eO.f30715k;
            long R8 = R(!c3052cO.f30260e ? 0L : c3052cO.f30256a.i());
            long j9 = o(this.f28962Z.f32728a, c3052cO.f30262g.f30532a) ? this.f28943E0.f36109h : -9223372036854775807L;
            IO io = this.f28950M;
            AbstractC3627n8 abstractC3627n8 = this.f28962Z.f32728a;
            C3860rQ c3860rQ = c3052cO.f30262g.f30532a;
            float f2 = this.f28944F.j().f35002a;
            boolean z9 = this.f28962Z.f32738l;
            XN xn = new XN(io, abstractC3627n8, c3860rQ, R8, f2, this.m0, j9);
            YN yn = this.f28983y;
            c9 = yn.c(xn);
            C3052cO c3052cO2 = c3159eO.f30713h;
            if (!c9 && c3052cO2.f30260e && R8 < 500000 && this.f28942E > 0) {
                c3052cO2.f30256a.X(this.f28962Z.f32744r);
                c9 = yn.c(xn);
            }
        } else {
            c9 = false;
        }
        this.f28969o0 = c9;
        if (c9) {
            C3052cO c3052cO3 = c3159eO.f30715k;
            c3052cO3.getClass();
            ZN zn = new ZN();
            zn.f29661a = this.f28976u0 - c3052cO3.f30270p;
            float f9 = this.f28944F.j().f35002a;
            AbstractC2792Sd.i(f9 > 0.0f || f9 == -3.4028235E38f);
            zn.f29662b = f9;
            long j10 = this.f28968n0;
            if (j10 >= 0) {
                j6 = j10;
            } else if (j10 != com.anythink.basead.exoplayer.b.f7168b) {
                z6 = false;
                j6 = j10;
                AbstractC2792Sd.i(z6);
                zn.f29663c = j6;
                C2945aO c2945aO = new C2945aO(zn);
                AbstractC2792Sd.H(c3052cO3.f30267m == null);
                c3052cO3.f30256a.e(c2945aO);
            }
            z6 = true;
            AbstractC2792Sd.i(z6);
            zn.f29663c = j6;
            C2945aO c2945aO2 = new C2945aO(zn);
            AbstractC2792Sd.H(c3052cO3.f30267m == null);
            c3052cO3.f30256a.e(c2945aO2);
        }
        M();
    }

    public final void M() {
        C3052cO c3052cO = this.J.f30715k;
        boolean z6 = true;
        if (!this.f28969o0 && (c3052cO == null || !c3052cO.f30256a.d())) {
            z6 = false;
        }
        C3589mO c3589mO = this.f28962Z;
        if (z6 != c3589mO.f32734g) {
            this.f28962Z = c3589mO.f(z6);
        }
    }

    public final C3589mO N(C3860rQ c3860rQ, long j6, long j9, long j10, boolean z6, int i) {
        SQ sq;
        C3941t c3941t;
        List list;
        C3523lC c3523lC;
        int i4;
        this.f28982x0 = (!this.f28982x0 && j6 == this.f28962Z.f32744r && c3860rQ.equals(this.f28962Z.f32729b)) ? false : true;
        J();
        C3589mO c3589mO = this.f28962Z;
        SQ sq2 = c3589mO.f32735h;
        C3941t c3941t2 = c3589mO.i;
        List list2 = c3589mO.f32736j;
        if (this.f28948K.f1144n) {
            C3159eO c3159eO = this.J;
            C3052cO c3052cO = c3159eO.f30713h;
            SQ sq3 = c3052cO == null ? SQ.f28273d : c3052cO.f30268n;
            C3941t c3941t3 = c3052cO == null ? this.f28981x : c3052cO.f30269o;
            InterfaceC3780q[] interfaceC3780qArr = (InterfaceC3780q[]) c3941t3.f34965v;
            OB ob = new OB(4);
            boolean z9 = false;
            for (InterfaceC3780q interfaceC3780q : interfaceC3780qArr) {
                if (interfaceC3780q != null) {
                    O3 o32 = interfaceC3780q.x(0).f25173l;
                    if (o32 == null) {
                        ob.a(new O3(new InterfaceC3945t3[0]));
                    } else {
                        ob.a(o32);
                        z9 = true;
                    }
                }
            }
            if (z9) {
                c3523lC = ob.f();
            } else {
                PB pb = RB.f27933u;
                c3523lC = C3523lC.f32525x;
            }
            if (c3052cO != null) {
                C3106dO c3106dO = c3052cO.f30262g;
                long j11 = c3106dO.f30535d;
                if (j11 != j9) {
                    if (j9 != j11) {
                        c3106dO = new C3106dO(c3106dO.f30532a, c3106dO.f30533b, c3106dO.f30534c, j9, c3106dO.f30536e, c3106dO.f30537f, c3106dO.f30538g, c3106dO.f30539h);
                    }
                    c3052cO.f30262g = c3106dO;
                }
            }
            C3052cO c3052cO2 = c3159eO.f30713h;
            if (c3052cO2 == c3159eO.i && c3052cO2 != null) {
                C3941t c3941t4 = c3052cO2.f30269o;
                int i6 = 0;
                while (true) {
                    D0.H[] hArr = this.f28967n;
                    if (i6 >= 2) {
                        break;
                    }
                    if (c3941t4.c(i6)) {
                        i4 = 1;
                        if (((SP) hArr[i6].f434e).f28261u != 1) {
                            break;
                        }
                        ((C3912sO[]) c3941t4.f34964u)[i6].getClass();
                    } else {
                        i4 = 1;
                    }
                    i6 += i4;
                }
            }
            sq = sq3;
            c3941t = c3941t3;
            list = c3523lC;
        } else {
            if (!c3860rQ.equals(c3589mO.f32729b)) {
                c3941t2 = this.f28981x;
                sq2 = SQ.f28273d;
                list2 = C3523lC.f32525x;
            }
            sq = sq2;
            c3941t = c3941t2;
            list = list2;
        }
        if (z6) {
            C4108w4 c4108w4 = this.f28963i0;
            if (!c4108w4.f35566d || c4108w4.f35567e == 5) {
                c4108w4.f35564b = true;
                c4108w4.f35566d = true;
                c4108w4.f35567e = i;
            } else {
                AbstractC2792Sd.i(i == 5);
            }
        }
        C3589mO c3589mO2 = this.f28962Z;
        return c3589mO2.b(c3860rQ, j6, j9, j10, R(c3589mO2.f32742p), sq, c3941t, list);
    }

    public final void O(boolean[] zArr, long j6) {
        D0.H[] hArr;
        long j9;
        C3052cO c3052cO = this.J.i;
        C3941t c3941t = c3052cO.f30269o;
        int i = 0;
        while (true) {
            hArr = this.f28967n;
            if (i >= 2) {
                break;
            }
            if (!c3941t.c(i)) {
                hArr[i].b();
            }
            i++;
        }
        int i4 = 0;
        while (i4 < 2) {
            if (c3941t.c(i4) && hArr[i4].m(c3052cO) == null) {
                j9 = j6;
                P(c3052cO, i4, zArr[i4], j9);
            } else {
                j9 = j6;
            }
            i4++;
            j6 = j9;
        }
    }

    public final void P(C3052cO c3052cO, int i, boolean z6, long j6) {
        int i4;
        int i6;
        D0.H h3 = this.f28967n[i];
        if (h3.g()) {
            return;
        }
        boolean z9 = c3052cO == this.J.f30713h;
        C3941t c3941t = c3052cO.f30269o;
        C3912sO c3912sO = ((C3912sO[]) c3941t.f34964u)[i];
        InterfaceC3780q interfaceC3780q = ((InterfaceC3780q[]) c3941t.f34965v)[i];
        boolean z10 = T() && this.f28962Z.f32732e == 3;
        boolean z11 = !z6 && z10;
        this.f28973s0++;
        LQ lq = c3052cO.f30258c[i];
        long j9 = c3052cO.f30270p;
        C3106dO c3106dO = c3052cO.f30262g;
        if (interfaceC3780q != null) {
            i4 = interfaceC3780q.d();
            i6 = 0;
        } else {
            i4 = 0;
            i6 = 0;
        }
        DP[] dpArr = new DP[i4];
        while (i6 < i4) {
            interfaceC3780q.getClass();
            dpArr[i6] = interfaceC3780q.x(i6);
            i6++;
        }
        int i9 = h3.f431b;
        C3860rQ c3860rQ = c3106dO.f30532a;
        Is is = this.f28944F;
        if (i9 == 0 || i9 == 2 || i9 == 4) {
            h3.f432c = true;
            SP sp = (SP) h3.f434e;
            AbstractC2792Sd.H(sp.f28196A == 0);
            sp.f28265w = c3912sO;
            sp.J = c3860rQ;
            sp.f28196A = 1;
            sp.u0(z11, z9);
            sp.p0(dpArr, lq, j6, j9, c3860rQ);
            sp.N(j6, z11, true);
            is.b(sp);
        } else {
            h3.f433d = true;
            SP sp2 = (SP) h3.f435f;
            sp2.getClass();
            AbstractC2792Sd.H(sp2.f28196A == 0);
            sp2.f28265w = c3912sO;
            sp2.J = c3860rQ;
            sp2.f28196A = 1;
            sp2.u0(z11, z9);
            sp2.p0(dpArr, lq, j6, j9, c3860rQ);
            sp2.N(j6, z11, true);
            is.b(sp2);
        }
        QN qn = new QN(this);
        SP m9 = h3.m(c3052cO);
        m9.getClass();
        m9.b(11, qn);
        if (z10 && z9) {
            h3.C();
        }
    }

    public final void Q(boolean z6) {
        C3052cO c3052cO = this.J.f30715k;
        C3860rQ c3860rQ = c3052cO == null ? this.f28962Z.f32729b : c3052cO.f30262g.f30532a;
        boolean equals = this.f28962Z.f32737k.equals(c3860rQ);
        if (!equals) {
            this.f28962Z = this.f28962Z.g(c3860rQ);
        }
        C3589mO c3589mO = this.f28962Z;
        c3589mO.f32742p = c3052cO == null ? c3589mO.f32744r : c3052cO.d();
        C3589mO c3589mO2 = this.f28962Z;
        c3589mO2.f32743q = R(c3589mO2.f32742p);
        if ((!equals || z6) && c3052cO != null && c3052cO.f30260e) {
            S(c3052cO.f30262g.f30532a, c3052cO.f30268n, c3052cO.f30269o);
        }
    }

    public final long R(long j6) {
        C3052cO c3052cO = this.J.f30715k;
        if (c3052cO == null) {
            return 0L;
        }
        return Math.max(0L, j6 - (this.f28976u0 - c3052cO.f30270p));
    }

    public final void S(C3860rQ c3860rQ, SQ sq, C3941t c3941t) {
        C3052cO c3052cO = this.J.f30715k;
        c3052cO.getClass();
        long R8 = R(c3052cO.d());
        long j6 = o(this.f28962Z.f32728a, c3052cO.f30262g.f30532a) ? this.f28943E0.f36109h : com.anythink.basead.exoplayer.b.f7168b;
        AbstractC3627n8 abstractC3627n8 = this.f28962Z.f32728a;
        float f2 = this.f28944F.j().f35002a;
        boolean z6 = this.f28962Z.f32738l;
        this.f28983y.a(new XN(this.f28950M, abstractC3627n8, c3860rQ, R8, f2, this.m0, j6), (InterfaceC3780q[]) c3941t.f34965v);
    }

    public final boolean T() {
        C3589mO c3589mO = this.f28962Z;
        return c3589mO.f32738l && c3589mO.f32740n == 0;
    }

    public final void U(int i) {
        D0.H h3 = this.f28967n[i];
        try {
            C3052cO c3052cO = this.J.f30713h;
            if (c3052cO == null) {
                throw null;
            }
            SP m9 = h3.m(c3052cO);
            m9.getClass();
            LQ lq = m9.f28198B;
            lq.getClass();
            lq.f();
        } catch (IOException | RuntimeException e9) {
            int i4 = ((SP) h3.f434e).f28261u;
            throw e9;
        }
    }

    public final boolean V() {
        if (!this.f28954Q) {
            return false;
        }
        for (int i = 0; i < 2; i++) {
            if (this.f28967n[i].q()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3351i0
    public final void a(long j6, long j9, DP dp, MediaFormat mediaFormat) {
        if (this.f28960W) {
            C3235ft c3235ft = this.f28985z;
            c3235ft.getClass();
            C3127dt g9 = C3235ft.g();
            g9.f30645a = c3235ft.f31231a.obtainMessage(37);
            g9.a();
        }
    }

    public final void b(IOException iOException, int i) {
        DN dn = new DN(0, iOException, i);
        C3052cO c3052cO = this.J.f30713h;
        if (c3052cO != null) {
            dn = dn.a(c3052cO.f30262g.f30532a);
        }
        AbstractC2991bG.J("ExoPlayerImplInternal", "Playback error", dn);
        u(false, false);
        this.f28962Z = this.f28962Z.e(dn);
    }

    public final void c(int i) {
        C3589mO c3589mO = this.f28962Z;
        if (c3589mO.f32732e != i) {
            if (i != 2) {
                this.f28986z0 = com.anythink.basead.exoplayer.b.f7168b;
            }
            this.f28962Z = c3589mO.d(i);
        }
    }

    public final void d(int i) {
        C4108w4 c4108w4 = this.f28963i0;
        C3589mO c3589mO = this.f28962Z;
        boolean z6 = c4108w4.f35564b | (((C3589mO) c4108w4.f35568f) != c3589mO);
        c4108w4.f35564b = z6;
        c4108w4.f35568f = c3589mO;
        if (z6) {
            if (!c3589mO.f32728a.g()) {
                C3589mO c3589mO2 = this.f28962Z;
                boolean z9 = c3589mO2.f32728a.e(c3589mO2.f32729b.f34406a) != -1;
                Locale locale = Locale.US;
                C3589mO c3589mO3 = this.f28962Z;
                AbstractC2792Sd.I(String.format(locale, "periodUid %s not found in timeline %s with size %d triggered by msg %d", c3589mO3.f32729b.f34406a, c3589mO3.f32728a.getClass().getName(), Integer.valueOf(this.f28962Z.f32728a.a()), Integer.valueOf(i)), z9);
            }
            C3557lt c3557lt = this.f28947I;
            C4108w4 c4108w42 = this.f28963i0;
            PN pn = (PN) c3557lt.f32643u;
            pn.getClass();
            pn.f27552D.e(new RunnableC3071cq(21, pn, c4108w42));
            this.f28963i0 = new C4108w4(this.f28962Z);
        }
    }

    public final void e(float f2) {
        this.f28941D0 = f2;
        float f9 = f2 * this.f28955R.f31838g;
        for (int i = 0; i < 2; i++) {
            D0.H h3 = this.f28967n[i];
            SP sp = (SP) h3.f434e;
            if (sp.f28261u == 1) {
                Float valueOf = Float.valueOf(f9);
                sp.b(2, valueOf);
                SP sp2 = (SP) h3.f435f;
                if (sp2 != null) {
                    sp2.b(2, valueOf);
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
    public final void f(int i, int i4, int i6, boolean z6) {
        boolean z9;
        C3589mO c3589mO;
        C3052cO c3052cO;
        if (z6) {
            if (i != -1) {
                z9 = true;
                if (i != -1) {
                    i6 = 2;
                } else if (i6 == 2) {
                    i6 = 1;
                }
                boolean z10 = this.f28959V;
                if (i != 0) {
                    i4 = 1;
                } else if (i4 == 1) {
                    i4 = z10 ? 4 : 0;
                }
                c3589mO = this.f28962Z;
                if (c3589mO.f32738l != z9 && c3589mO.f32740n == i4 && c3589mO.f32739m == i6) {
                    return;
                }
                this.f28962Z = c3589mO.h(i6, i4, z9);
                y(false, false);
                C3159eO c3159eO = this.J;
                for (c3052cO = c3159eO.f30713h; c3052cO != null; c3052cO = c3052cO.f30267m) {
                    for (InterfaceC3780q interfaceC3780q : (InterfaceC3780q[]) c3052cO.f30269o.f34965v) {
                    }
                }
                if (T()) {
                    k();
                    l();
                    this.f28962Z.getClass();
                    c3159eO.n(this.f28976u0);
                    return;
                }
                int i9 = this.f28962Z.f32732e;
                C3235ft c3235ft = this.f28985z;
                if (i9 != 3) {
                    if (i9 == 2) {
                        c3235ft.c(2);
                        return;
                    }
                    return;
                }
                Is is = this.f28944F;
                is.f26361u = true;
                C4128wO c4128wO = (C4128wO) is.f26362v;
                if (!c4128wO.f35601n) {
                    c4128wO.f35603v = SystemClock.elapsedRealtime();
                    c4128wO.f35601n = true;
                }
                i();
                c3235ft.c(2);
                return;
            }
            i = -1;
        }
        z9 = false;
        if (i != -1) {
        }
        boolean z102 = this.f28959V;
        if (i != 0) {
        }
        c3589mO = this.f28962Z;
        if (c3589mO.f32738l != z9) {
        }
        this.f28962Z = c3589mO.h(i6, i4, z9);
        y(false, false);
        C3159eO c3159eO2 = this.J;
        while (c3052cO != null) {
        }
        if (T()) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3753pQ
    public final void g(InterfaceC3807qQ interfaceC3807qQ) {
        this.f28985z.b(8, interfaceC3807qQ).a();
    }

    public final void h(boolean z6) {
        C3860rQ c3860rQ = this.J.f30713h.f30262g.f30532a;
        long r9 = r(c3860rQ, this.f28962Z.f32744r, true, false);
        if (r9 != this.f28962Z.f32744r) {
            C3589mO c3589mO = this.f28962Z;
            this.f28962Z = N(c3860rQ, r9, c3589mO.f32730c, c3589mO.f32731d, z6, 5);
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
        boolean z6;
        int i4;
        C3860rQ c3860rQ;
        C3159eO c3159eO;
        C3052cO u6;
        C3052cO t6;
        long uptimeMillis;
        C3235ft c3235ft;
        C3589mO c3589mO;
        int i6;
        C3159eO c3159eO2;
        long j6;
        C3052cO t9;
        DN dn2;
        int i9;
        long j9;
        int i10;
        int i11;
        boolean z9;
        C3052cO t10;
        boolean z10;
        int i12;
        C3052cO s9;
        C3052cO i13;
        C3052cO x9;
        char c9;
        boolean z11;
        int i14;
        int i15;
        C3052cO t11;
        C3941t k9;
        int i16;
        int i17;
        D0.H[] hArr;
        C3052cO u9;
        C3941t c3941t;
        int i18;
        C3106dO p9;
        C3052cO s10;
        boolean z12;
        boolean z13;
        long j10;
        long j11;
        int i19;
        boolean g9;
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
        } catch (C4237yP e13) {
            e = e13;
        } catch (IOException e14) {
            e = e14;
        }
        switch (message2.what) {
            case 1:
                boolean z14 = message2.arg1 != 0;
                int i20 = message2.arg2;
                this.f28963i0.f(1);
                f(this.f28955R.b(this.f28962Z.f32732e, z14), i20 >> 4, i20 & 15, z14);
                z6 = true;
                d(message2.what);
                return z6;
            case 2:
                z6 = true;
                try {
                    try {
                        uptimeMillis = SystemClock.uptimeMillis();
                        c3235ft = this.f28985z;
                        c3235ft.d(2);
                        c3589mO = this.f28962Z;
                        i6 = c3589mO.f32732e;
                    } catch (DN e15) {
                        e = e15;
                    }
                } catch (NH e16) {
                    e = e16;
                } catch (U4 e17) {
                    e = e17;
                } catch (C4237yP e18) {
                    e = e18;
                } catch (IOException e19) {
                    e = e19;
                } catch (RuntimeException e20) {
                    e = e20;
                }
                if (i6 == 1) {
                    message2 = message;
                } else if (i6 != 4) {
                    if (!c3589mO.f32728a.g()) {
                        try {
                        } catch (DN e21) {
                            e = e21;
                        }
                        if (this.f28948K.d()) {
                            C3159eO c3159eO3 = this.J;
                            c3159eO3.n(this.f28976u0);
                            if (c3159eO3.o() && (p9 = c3159eO3.p(this.f28976u0, this.f28962Z)) != null) {
                                C3052cO q8 = c3159eO3.q(p9);
                                if (!q8.f30259d) {
                                    long j12 = p9.f30533b;
                                    q8.f30259d = true;
                                    q8.f30256a.b(this, j12);
                                } else if (q8.f30260e) {
                                    c3235ft.b(8, q8.f30256a).a();
                                }
                                if (c3159eO3.s() == q8) {
                                    s(p9.f30533b, true);
                                }
                                Q(false);
                            }
                            if (this.f28969o0) {
                                this.f28969o0 = A(c3159eO3.f30715k);
                                M();
                            } else {
                                L();
                            }
                            if (!this.f28966l0 && this.f28954Q && !this.C0 && !V() && (u9 = c3159eO3.u()) != null && u9 == c3159eO3.t() && u9.i() != null && u9.i().f30260e) {
                                AbstractC2792Sd.H(u9.i().f30260e);
                                if (((long) ((r0.a() - this.f28976u0) / this.f28944F.j().f35002a)) <= 10000000) {
                                    c3159eO3.w();
                                    c3159eO2 = c3159eO3;
                                    C3052cO u10 = c3159eO2.u();
                                    if (u10 != null) {
                                        C3941t k10 = u10.k();
                                        int i21 = 0;
                                        while (true) {
                                            D0.H[] hArr2 = this.f28967n;
                                            if (i21 < 2) {
                                                if (k10.c(i21) && hArr2[i21].o() && !hArr2[i21].q()) {
                                                    hArr2[i21].p();
                                                    c3941t = k10;
                                                    i18 = i21;
                                                    P(u10, i18, false, u10.a());
                                                } else {
                                                    c3941t = k10;
                                                    i18 = i21;
                                                }
                                                i21 = i18 + 1;
                                                k10 = c3941t;
                                            } else {
                                                j6 = com.anythink.basead.exoplayer.b.f7168b;
                                                if (V()) {
                                                    this.f28938B0 = u10.f30256a.w();
                                                    if (!u10.b()) {
                                                        c3159eO2.y(u10);
                                                        Q(false);
                                                        L();
                                                    }
                                                }
                                                t9 = c3159eO2.t();
                                                if (t9 != null) {
                                                    if (t9.i() != null) {
                                                        try {
                                                            if (!this.f28966l0) {
                                                                C3052cO t12 = c3159eO2.t();
                                                                if (t12.f30260e) {
                                                                    int i22 = 0;
                                                                    while (true) {
                                                                        D0.H[] hArr3 = this.f28967n;
                                                                        if (i22 < 2) {
                                                                            if (hArr3[i22].z(t12)) {
                                                                                i22++;
                                                                            }
                                                                        } else if ((!V() || c3159eO2.u() != c3159eO2.t()) && (t9.i().f30260e || this.f28976u0 >= t9.i().a())) {
                                                                            if (t9.i().f30260e) {
                                                                                AbstractC2792Sd.H(t9.i().f30260e);
                                                                                dn2 = null;
                                                                                i9 = 1;
                                                                                if (((long) ((r3.a() - this.f28976u0) / this.f28944F.j().f35002a)) > 10000000) {
                                                                                    j9 = uptimeMillis;
                                                                                }
                                                                            } else {
                                                                                dn2 = null;
                                                                                i9 = 1;
                                                                            }
                                                                            C3941t k11 = t9.k();
                                                                            C3052cO v9 = c3159eO2.v();
                                                                            C3941t k12 = v9.k();
                                                                            AbstractC3627n8 abstractC3627n8 = this.f28962Z.f32728a;
                                                                            j9 = uptimeMillis;
                                                                            G(abstractC3627n8, v9.f30262g.f30532a, abstractC3627n8, t9.f30262g.f30532a, com.anythink.basead.exoplayer.b.f7168b, false);
                                                                            if (!v9.f30260e || ((!(z9 = this.f28954Q) || this.f28938B0 == j6) && v9.f30256a.w() == j6)) {
                                                                                i10 = 0;
                                                                                i11 = 2;
                                                                            } else {
                                                                                this.f28938B0 = j6;
                                                                                if (z9 && !this.C0) {
                                                                                    int i23 = 0;
                                                                                    while (true) {
                                                                                        i11 = 2;
                                                                                        if (i23 < 2) {
                                                                                            if (k12.c(i23)) {
                                                                                                int i24 = ((SP) hArr3[i23].f434e).f28261u;
                                                                                                InterfaceC3780q[] interfaceC3780qArr = (InterfaceC3780q[]) k12.f34965v;
                                                                                                if (!H4.d(interfaceC3780qArr[i23].i().f25176o, interfaceC3780qArr[i23].i().f25172k) && !hArr3[i23].q()) {
                                                                                                }
                                                                                            }
                                                                                            i23++;
                                                                                        } else {
                                                                                            i10 = 0;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v9.a();
                                                                                for (int i25 = 0; i25 < 2; i25++) {
                                                                                    hArr3[i25].v();
                                                                                }
                                                                                if (!v9.b()) {
                                                                                    c3159eO2.y(v9);
                                                                                    Q(false);
                                                                                    L();
                                                                                }
                                                                            }
                                                                            while (i10 < i11) {
                                                                                D0.H h3 = hArr3[i10];
                                                                                v9.a();
                                                                                h3.u(k11, k12);
                                                                                i10++;
                                                                                i11 = 2;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } catch (DN e22) {
                                                            e = e22;
                                                            message2 = message;
                                                            if (e.f25133v == 1) {
                                                                e = e.a(t6.f30262g.f30532a);
                                                                break;
                                                            }
                                                            if (e.f25133v == 1) {
                                                                int i26 = e.f25135x;
                                                                c3159eO = this.J;
                                                                if (c3159eO.u() != null) {
                                                                    this.C0 = true;
                                                                    C();
                                                                    u6 = c3159eO.u();
                                                                    C3052cO s11 = c3159eO.s();
                                                                    if (c3159eO.s() != u6) {
                                                                    }
                                                                    c3159eO.y(s11);
                                                                    if (this.f28962Z.f32732e != 4) {
                                                                    }
                                                                    z6 = true;
                                                                    d(message2.what);
                                                                    return z6;
                                                                }
                                                                break;
                                                            }
                                                            dn = this.f28984y0;
                                                            if (dn != null) {
                                                            }
                                                            if (e.f25133v == 1) {
                                                            }
                                                            if (e.f25130B) {
                                                                break;
                                                            }
                                                            AbstractC2991bG.J("ExoPlayerImplInternal", "Playback error", e);
                                                            z6 = true;
                                                            u(true, false);
                                                            this.f28962Z = this.f28962Z.e(e);
                                                            d(message2.what);
                                                            return z6;
                                                        } catch (NH e23) {
                                                            e = e23;
                                                            message2 = message;
                                                            b(e, e.f27262n);
                                                            z6 = true;
                                                            d(message2.what);
                                                            return z6;
                                                        } catch (U4 e24) {
                                                            e = e24;
                                                            message2 = message;
                                                            b(e, e.f28683u == 1 ? true != e.f28682n ? 3003 : AdError.MEDIATION_ERROR_CODE : 1000);
                                                            z6 = true;
                                                            d(message2.what);
                                                            return z6;
                                                        } catch (C4237yP e25) {
                                                            e = e25;
                                                            message2 = message;
                                                            b(e, e.f35943n);
                                                            z6 = true;
                                                            d(message2.what);
                                                            return z6;
                                                        } catch (IOException e26) {
                                                            e = e26;
                                                            message2 = message;
                                                            b(e, 2000);
                                                            z6 = true;
                                                            d(message2.what);
                                                            return z6;
                                                        } catch (RuntimeException e27) {
                                                            e = e27;
                                                            message2 = message;
                                                            i = 1004;
                                                            if (!(e instanceof IllegalStateException) && !(e instanceof IllegalArgumentException)) {
                                                                i = 1000;
                                                            }
                                                            DN dn3 = new DN(2, e, i);
                                                            AbstractC2991bG.J("ExoPlayerImplInternal", "Playback error", dn3);
                                                            u(true, false);
                                                            this.f28962Z = this.f28962Z.e(dn3);
                                                            z6 = true;
                                                            d(message2.what);
                                                            return z6;
                                                        }
                                                    }
                                                    j9 = uptimeMillis;
                                                    dn2 = null;
                                                    i9 = 1;
                                                    if (t9.f30262g.f30539h || this.f28966l0) {
                                                        D0.H[] hArr4 = this.f28967n;
                                                        for (int i27 = 0; i27 < 2; i27++) {
                                                            D0.H h9 = hArr4[i27];
                                                            if ((h9.m(t9) != null) && h9.s(t9)) {
                                                                h9.t(t9);
                                                            }
                                                        }
                                                    }
                                                    t10 = c3159eO2.t();
                                                    if (t10 != null && c3159eO2.s() != t10 && !t10.f30263h) {
                                                        t11 = c3159eO2.t();
                                                        k9 = t11.k();
                                                        i16 = i9;
                                                        i17 = 0;
                                                        while (true) {
                                                            hArr = this.f28967n;
                                                            if (i17 >= 2) {
                                                                int r9 = hArr[i17].r();
                                                                int c10 = hArr[i17].c(t11, k9, this.f28944F);
                                                                this.f28973s0 -= r9 - hArr[i17].r();
                                                                i16 &= c10 & 1;
                                                                i17++;
                                                            } else if (i16 != 0) {
                                                                for (int i28 = 0; i28 < 2; i28++) {
                                                                    if (k9.c(i28)) {
                                                                        if ((hArr[i28].m(t11) != null ? i9 : 0) == 0) {
                                                                            P(t11, i28, false, t11.a());
                                                                        }
                                                                    }
                                                                }
                                                                c3159eO2.t().f30263h = i9;
                                                            }
                                                        }
                                                    }
                                                    z10 = false;
                                                    while (T() && !this.f28966l0 && (s9 = c3159eO2.s()) != null && (i13 = s9.i()) != null && this.f28976u0 >= i13.a() && i13.f30263h) {
                                                        if (z10) {
                                                            d(-1);
                                                        }
                                                        this.C0 = false;
                                                        x9 = c3159eO2.x();
                                                        if (x9 != null) {
                                                            throw dn2;
                                                        }
                                                        if (this.f28962Z.f32729b.f34406a.equals(x9.f30262g.f30532a.f34406a)) {
                                                            C3860rQ c3860rQ2 = this.f28962Z.f32729b;
                                                            c9 = 65535;
                                                            if (c3860rQ2.f34407b == -1) {
                                                                C3860rQ c3860rQ3 = x9.f30262g.f30532a;
                                                                if (c3860rQ3.f34407b == -1 && c3860rQ2.f34410e != c3860rQ3.f34410e) {
                                                                    z11 = true;
                                                                    C3106dO c3106dO = x9.f30262g;
                                                                    C3860rQ c3860rQ4 = c3106dO.f30532a;
                                                                    boolean z15 = z11;
                                                                    long j13 = c3106dO.f30533b;
                                                                    this.f28962Z = N(c3860rQ4, j13, c3106dO.f30535d, j13, !z15, 0);
                                                                    J();
                                                                    l();
                                                                    if (V() && x9 == c3159eO2.u()) {
                                                                        D0.H[] hArr5 = this.f28967n;
                                                                        for (i15 = 0; i15 < 2; i15++) {
                                                                            hArr5[i15].a();
                                                                        }
                                                                    }
                                                                    if (this.f28962Z.f32732e == 3) {
                                                                        i();
                                                                    }
                                                                    C3941t k13 = c3159eO2.s().k();
                                                                    i14 = 0;
                                                                    while (true) {
                                                                        D0.H[] hArr6 = this.f28967n;
                                                                        if (i14 >= 2) {
                                                                            if (k13.c(i14)) {
                                                                                hArr6[i14].w();
                                                                            }
                                                                            i14++;
                                                                        }
                                                                    }
                                                                    z10 = true;
                                                                    j6 = com.anythink.basead.exoplayer.b.f7168b;
                                                                }
                                                            }
                                                        } else {
                                                            c9 = 65535;
                                                        }
                                                        z11 = false;
                                                        C3106dO c3106dO2 = x9.f30262g;
                                                        C3860rQ c3860rQ42 = c3106dO2.f30532a;
                                                        boolean z152 = z11;
                                                        long j132 = c3106dO2.f30533b;
                                                        this.f28962Z = N(c3860rQ42, j132, c3106dO2.f30535d, j132, !z152, 0);
                                                        J();
                                                        l();
                                                        if (V()) {
                                                            D0.H[] hArr52 = this.f28967n;
                                                            while (i15 < 2) {
                                                            }
                                                        }
                                                        if (this.f28962Z.f32732e == 3) {
                                                        }
                                                        C3941t k132 = c3159eO2.s().k();
                                                        i14 = 0;
                                                        while (true) {
                                                            D0.H[] hArr62 = this.f28967n;
                                                            if (i14 >= 2) {
                                                                break;
                                                            }
                                                            i14++;
                                                        }
                                                        z10 = true;
                                                        j6 = com.anythink.basead.exoplayer.b.f7168b;
                                                    }
                                                    i12 = 3;
                                                    this.f28936A0.getClass();
                                                    C3159eO c3159eO4 = this.J;
                                                    s10 = c3159eO4.s();
                                                    if (s10 == null) {
                                                        p(j9);
                                                    } else {
                                                        long j14 = j9;
                                                        Trace.beginSection("doSomeWork");
                                                        l();
                                                        if (s10.f30260e) {
                                                            this.f28978v0 = AbstractC3182eu.u(SystemClock.elapsedRealtime());
                                                            s10.f30256a.X(this.f28962Z.f32744r - this.f28942E);
                                                            int i29 = 0;
                                                            z12 = true;
                                                            z13 = true;
                                                            while (true) {
                                                                D0.H[] hArr7 = this.f28967n;
                                                                if (i29 < 2) {
                                                                    D0.H h10 = hArr7[i29];
                                                                    if (h10.r() == 0) {
                                                                        m(i29, false);
                                                                    } else {
                                                                        h10.A(this.f28976u0, this.f28978v0);
                                                                        z12 = z12 && h10.x();
                                                                        boolean B3 = h10.B(s10);
                                                                        m(i29, B3);
                                                                        z13 = z13 && B3;
                                                                        if (!B3) {
                                                                            U(i29);
                                                                        }
                                                                    }
                                                                    i29++;
                                                                }
                                                            }
                                                        } else {
                                                            s10.f30256a.q();
                                                            z12 = true;
                                                            z13 = true;
                                                        }
                                                        long j15 = s10.f30262g.f30536e;
                                                        if (z12 && s10.f30260e) {
                                                            j10 = com.anythink.basead.exoplayer.b.f7168b;
                                                            if (j15 == com.anythink.basead.exoplayer.b.f7168b || j15 <= this.f28962Z.f32744r) {
                                                                if (this.f28966l0) {
                                                                    this.f28966l0 = false;
                                                                    int i30 = this.f28962Z.f32740n;
                                                                    this.f28963i0.f(0);
                                                                    f(this.f28955R.b(this.f28962Z.f32732e, false), i30, 5, false);
                                                                }
                                                                if (s10.f30262g.f30539h) {
                                                                    c(4);
                                                                    k();
                                                                    j11 = -9223372036854775807L;
                                                                    int i31 = 2;
                                                                    if (this.f28962Z.f32732e == 2) {
                                                                        int i32 = 0;
                                                                        while (true) {
                                                                            D0.H[] hArr8 = this.f28967n;
                                                                            if (i32 < i31) {
                                                                                if (hArr8[i32].m(s10) != null) {
                                                                                    U(i32);
                                                                                }
                                                                                i32++;
                                                                                i31 = 2;
                                                                            } else {
                                                                                C3589mO c3589mO2 = this.f28962Z;
                                                                                if (!c3589mO2.f32734g && c3589mO2.f32743q < 500000 && A(c3159eO4.f30715k) && T()) {
                                                                                    if (this.f28986z0 == j11) {
                                                                                        this.f28986z0 = SystemClock.elapsedRealtime();
                                                                                    } else if (SystemClock.elapsedRealtime() - this.f28986z0 >= 4000) {
                                                                                        throw new Us(0, 4000);
                                                                                    }
                                                                                    boolean z16 = !T() && this.f28962Z.f32732e == i12;
                                                                                    this.f28962Z.getClass();
                                                                                    i19 = this.f28962Z.f32732e;
                                                                                    if (i19 != 4 && (z16 || i19 == 2 || (i19 == i12 && this.f28973s0 != 0))) {
                                                                                        p(j14);
                                                                                    }
                                                                                    Trace.endSection();
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    this.f28986z0 = j11;
                                                                    if (T()) {
                                                                    }
                                                                    this.f28962Z.getClass();
                                                                    i19 = this.f28962Z.f32732e;
                                                                    if (i19 != 4) {
                                                                        p(j14);
                                                                    }
                                                                    Trace.endSection();
                                                                }
                                                            }
                                                        } else {
                                                            j10 = com.anythink.basead.exoplayer.b.f7168b;
                                                        }
                                                        C3589mO c3589mO3 = this.f28962Z;
                                                        if (c3589mO3.f32732e == 2) {
                                                            if (this.f28973s0 == 0) {
                                                                g9 = E();
                                                                j11 = j10;
                                                            } else if (z13) {
                                                                if (c3589mO3.f32734g) {
                                                                    C3052cO s12 = c3159eO4.s();
                                                                    long b9 = o(this.f28962Z.f32728a, s12.f30262g.f30532a) ? this.f28943E0.b() : j10;
                                                                    C3052cO c3052cO = c3159eO4.f30715k;
                                                                    boolean z17 = c3052cO.b() && c3052cO.f30262g.f30539h;
                                                                    boolean z18 = c3052cO.f30262g.f30532a.b() && !c3052cO.f30260e;
                                                                    if (!z17 && !z18) {
                                                                        long R8 = R(c3052cO.d());
                                                                        YN yn = this.f28983y;
                                                                        IO io = this.f28950M;
                                                                        AbstractC3627n8 abstractC3627n82 = this.f28962Z.f32728a;
                                                                        C3860rQ c3860rQ5 = s12.f30262g.f30532a;
                                                                        float f2 = this.f28944F.j().f35002a;
                                                                        j11 = j10;
                                                                        boolean z19 = this.f28962Z.f32738l;
                                                                        g9 = yn.g(new XN(io, abstractC3627n82, c3860rQ5, R8, f2, this.m0, b9));
                                                                    }
                                                                }
                                                                j11 = j10;
                                                                c(i12);
                                                                this.f28984y0 = dn2;
                                                                if (T()) {
                                                                    y(false, false);
                                                                    Is is = this.f28944F;
                                                                    is.f26361u = true;
                                                                    C4128wO c4128wO = (C4128wO) is.f26362v;
                                                                    if (!c4128wO.f35601n) {
                                                                        c4128wO.f35603v = SystemClock.elapsedRealtime();
                                                                        c4128wO.f35601n = true;
                                                                    }
                                                                    i();
                                                                }
                                                                int i312 = 2;
                                                                if (this.f28962Z.f32732e == 2) {
                                                                }
                                                                this.f28986z0 = j11;
                                                                if (T()) {
                                                                }
                                                                this.f28962Z.getClass();
                                                                i19 = this.f28962Z.f32732e;
                                                                if (i19 != 4) {
                                                                }
                                                                Trace.endSection();
                                                            }
                                                            if (g9) {
                                                                c(i12);
                                                                this.f28984y0 = dn2;
                                                                if (T()) {
                                                                }
                                                                int i3122 = 2;
                                                                if (this.f28962Z.f32732e == 2) {
                                                                }
                                                                this.f28986z0 = j11;
                                                                if (T()) {
                                                                }
                                                                this.f28962Z.getClass();
                                                                i19 = this.f28962Z.f32732e;
                                                                if (i19 != 4) {
                                                                }
                                                                Trace.endSection();
                                                            }
                                                            if (this.f28962Z.f32732e == i12) {
                                                                if (this.f28973s0 == 0) {
                                                                    if (!E()) {
                                                                        y(T(), false);
                                                                        c(2);
                                                                        if (this.m0) {
                                                                            for (C3052cO s13 = c3159eO4.s(); s13 != null; s13 = s13.i()) {
                                                                                for (InterfaceC3780q interfaceC3780q : (InterfaceC3780q[]) s13.k().f34965v) {
                                                                                }
                                                                            }
                                                                            this.f28943E0.a();
                                                                        }
                                                                        k();
                                                                    }
                                                                }
                                                            }
                                                            int i31222 = 2;
                                                            if (this.f28962Z.f32732e == 2) {
                                                            }
                                                            this.f28986z0 = j11;
                                                            if (T()) {
                                                            }
                                                            this.f28962Z.getClass();
                                                            i19 = this.f28962Z.f32732e;
                                                            if (i19 != 4) {
                                                            }
                                                            Trace.endSection();
                                                        }
                                                        j11 = j10;
                                                        if (this.f28962Z.f32732e == i12) {
                                                        }
                                                        int i312222 = 2;
                                                        if (this.f28962Z.f32732e == 2) {
                                                        }
                                                        this.f28986z0 = j11;
                                                        if (T()) {
                                                        }
                                                        this.f28962Z.getClass();
                                                        i19 = this.f28962Z.f32732e;
                                                        if (i19 != 4) {
                                                        }
                                                        Trace.endSection();
                                                    }
                                                    message2 = message;
                                                    z6 = true;
                                                }
                                                j9 = uptimeMillis;
                                                dn2 = null;
                                                i9 = 1;
                                                t10 = c3159eO2.t();
                                                if (t10 != null) {
                                                    t11 = c3159eO2.t();
                                                    k9 = t11.k();
                                                    i16 = i9;
                                                    i17 = 0;
                                                    while (true) {
                                                        hArr = this.f28967n;
                                                        if (i17 >= 2) {
                                                        }
                                                        int r92 = hArr[i17].r();
                                                        int c102 = hArr[i17].c(t11, k9, this.f28944F);
                                                        this.f28973s0 -= r92 - hArr[i17].r();
                                                        i16 &= c102 & 1;
                                                        i17++;
                                                    }
                                                }
                                                z10 = false;
                                                while (T()) {
                                                    if (z10) {
                                                    }
                                                    this.C0 = false;
                                                    x9 = c3159eO2.x();
                                                    if (x9 != null) {
                                                    }
                                                }
                                                i12 = 3;
                                                this.f28936A0.getClass();
                                                C3159eO c3159eO42 = this.J;
                                                s10 = c3159eO42.s();
                                                if (s10 == null) {
                                                }
                                                message2 = message;
                                                z6 = true;
                                            }
                                        }
                                    }
                                    j6 = com.anythink.basead.exoplayer.b.f7168b;
                                    t9 = c3159eO2.t();
                                    if (t9 != null) {
                                    }
                                    j9 = uptimeMillis;
                                    dn2 = null;
                                    i9 = 1;
                                    t10 = c3159eO2.t();
                                    if (t10 != null) {
                                    }
                                    z10 = false;
                                    while (T()) {
                                    }
                                    i12 = 3;
                                    this.f28936A0.getClass();
                                    C3159eO c3159eO422 = this.J;
                                    s10 = c3159eO422.s();
                                    if (s10 == null) {
                                    }
                                    message2 = message;
                                    z6 = true;
                                }
                            }
                            c3159eO2 = c3159eO3;
                            j6 = com.anythink.basead.exoplayer.b.f7168b;
                            t9 = c3159eO2.t();
                            if (t9 != null) {
                            }
                            j9 = uptimeMillis;
                            dn2 = null;
                            i9 = 1;
                            t10 = c3159eO2.t();
                            if (t10 != null) {
                            }
                            z10 = false;
                            while (T()) {
                            }
                            i12 = 3;
                            this.f28936A0.getClass();
                            C3159eO c3159eO4222 = this.J;
                            s10 = c3159eO4222.s();
                            if (s10 == null) {
                            }
                            message2 = message;
                            z6 = true;
                        }
                    }
                    j9 = uptimeMillis;
                    i12 = 3;
                    dn2 = null;
                    C3159eO c3159eO42222 = this.J;
                    s10 = c3159eO42222.s();
                    if (s10 == null) {
                    }
                    message2 = message;
                    z6 = true;
                }
                d(message2.what);
                return z6;
            case 3:
                z6 = true;
                q((UN) message2.obj);
                d(message2.what);
                return z6;
            case 4:
                z6 = true;
                C3947t5 c3947t5 = (C3947t5) message2.obj;
                this.f28985z.d(16);
                this.f28944F.a(c3947t5);
                C3947t5 j16 = this.f28944F.j();
                K(j16, j16.f35002a, true, true);
                d(message2.what);
                return z6;
            case 5:
                z6 = true;
                this.f28957T = (C4020uO) message2.obj;
                d(message2.what);
                return z6;
            case 6:
                z6 = true;
                u(false, true);
                d(message2.what);
                return z6;
            case 7:
                C2818Tm c2818Tm = (C2818Tm) message2.obj;
                try {
                    v(true, false, true, false);
                    int i33 = 0;
                    while (true) {
                        D0.H[] hArr9 = this.f28967n;
                        if (i33 >= 2) {
                            this.f28983y.d(this.f28950M);
                            this.f28955R.c();
                            this.f28979w.c();
                            c(1);
                            this.f28985z.f31231a.removeCallbacksAndMessages(null);
                            this.f28935A.e();
                            c2818Tm.a();
                            return true;
                        }
                        this.f28975u[i33].t0();
                        hArr9[i33].d();
                        i33++;
                    }
                } finally {
                    this.f28985z.f31231a.removeCallbacksAndMessages(null);
                    this.f28935A.e();
                    c2818Tm.a();
                }
            case 8:
                try {
                    try {
                        InterfaceC3807qQ interfaceC3807qQ = (InterfaceC3807qQ) message2.obj;
                        C3159eO c3159eO5 = this.J;
                        C3052cO c3052cO2 = c3159eO5.f30715k;
                        if (!(c3052cO2 != null && c3052cO2.f30256a == interfaceC3807qQ)) {
                            z6 = true;
                            C3052cO A9 = c3159eO5.A(interfaceC3807qQ);
                            if (A9 != null) {
                                AbstractC2792Sd.H(!A9.f30260e);
                                float f9 = this.f28944F.j().f35002a;
                                A9.e(this.f28962Z.f32728a);
                                C3052cO c3052cO3 = c3159eO5.f30716l;
                                if (c3052cO3 != null && c3052cO3.f30256a == interfaceC3807qQ) {
                                    I();
                                }
                            }
                        } else {
                            if (c3052cO2 == null) {
                                throw null;
                            }
                            if (!c3052cO2.f30260e) {
                                float f10 = this.f28944F.j().f35002a;
                                c3052cO2.e(this.f28962Z.f32728a);
                            }
                            S(c3052cO2.f30262g.f30532a, c3052cO2.j(), c3052cO2.k());
                            if (c3052cO2 == c3159eO5.s()) {
                                s(c3052cO2.f30262g.f30533b, true);
                                O(new boolean[2], this.J.i.a());
                                c3052cO2.f30263h = true;
                                C3589mO c3589mO4 = this.f28962Z;
                                try {
                                    C3860rQ c3860rQ6 = c3589mO4.f32729b;
                                    long j17 = c3052cO2.f30262g.f30533b;
                                    z6 = true;
                                    this.f28962Z = N(c3860rQ6, j17, c3589mO4.f32730c, j17, false, 5);
                                } catch (DN e28) {
                                    e = e28;
                                    if (e.f25133v == 1 && (t6 = this.J.t()) != null && e.f25129A == null) {
                                        e = e.a(t6.f30262g.f30532a);
                                    }
                                    if (e.f25133v == 1 && (c3860rQ = e.f25129A) != null) {
                                        int i262 = e.f25135x;
                                        c3159eO = this.J;
                                        if (c3159eO.u() != null && c3159eO.u().f30262g.f30532a.equals(c3860rQ) && this.f28967n[i262].y(c3159eO.u())) {
                                            this.C0 = true;
                                            C();
                                            u6 = c3159eO.u();
                                            C3052cO s112 = c3159eO.s();
                                            if (c3159eO.s() != u6) {
                                                while (s112 != null && s112.i() != u6) {
                                                    s112 = s112.i();
                                                }
                                            }
                                            c3159eO.y(s112);
                                            if (this.f28962Z.f32732e != 4) {
                                                L();
                                                this.f28985z.c(2);
                                            }
                                            z6 = true;
                                            d(message2.what);
                                            return z6;
                                        }
                                    }
                                    dn = this.f28984y0;
                                    if (dn != null) {
                                        dn.addSuppressed(e);
                                        e = this.f28984y0;
                                    }
                                    if (e.f25133v == 1) {
                                        C3159eO c3159eO6 = this.J;
                                        if (c3159eO6.s() != c3159eO6.t()) {
                                            while (c3159eO6.s() != c3159eO6.t()) {
                                                c3159eO6.x();
                                            }
                                            C3052cO s14 = c3159eO6.s();
                                            s14.getClass();
                                            d(message2.what);
                                            C3106dO c3106dO3 = s14.f30262g;
                                            C3860rQ c3860rQ7 = c3106dO3.f30532a;
                                            long j18 = c3106dO3.f30533b;
                                            this.f28962Z = N(c3860rQ7, j18, c3106dO3.f30535d, j18, true, 0);
                                        }
                                    }
                                    if (e.f25130B || !(this.f28984y0 == null || (i4 = e.f25131n) == 5004 || i4 == 5003)) {
                                        AbstractC2991bG.J("ExoPlayerImplInternal", "Playback error", e);
                                        z6 = true;
                                        u(true, false);
                                        this.f28962Z = this.f28962Z.e(e);
                                        d(message2.what);
                                        return z6;
                                    }
                                    AbstractC2991bG.C("ExoPlayerImplInternal", "Recoverable renderer error", e);
                                    if (this.f28984y0 == null) {
                                        this.f28984y0 = e;
                                    }
                                    C3235ft c3235ft2 = this.f28985z;
                                    C3127dt b10 = c3235ft2.b(25, e);
                                    Message message3 = b10.f30645a;
                                    message3.getClass();
                                    c3235ft2.f31231a.sendMessageAtFrontOfQueue(message3);
                                    b10.f30645a = null;
                                    C3235ft.f(b10);
                                    z6 = true;
                                    d(message2.what);
                                    return z6;
                                }
                            } else {
                                z6 = true;
                            }
                            L();
                        }
                    } catch (DN e29) {
                        e = e29;
                    }
                } catch (NH e30) {
                    e = e30;
                    b(e, e.f27262n);
                    z6 = true;
                    d(message2.what);
                    return z6;
                } catch (U4 e31) {
                    e = e31;
                    b(e, e.f28683u == 1 ? true != e.f28682n ? 3003 : AdError.MEDIATION_ERROR_CODE : 1000);
                    z6 = true;
                    d(message2.what);
                    return z6;
                } catch (C4237yP e32) {
                    e = e32;
                    b(e, e.f35943n);
                    z6 = true;
                    d(message2.what);
                    return z6;
                } catch (IOException e33) {
                    e = e33;
                    b(e, 2000);
                    z6 = true;
                    d(message2.what);
                    return z6;
                } catch (RuntimeException e34) {
                    e = e34;
                    i = 1004;
                    if (!(e instanceof IllegalStateException)) {
                        i = 1000;
                        break;
                    }
                    DN dn32 = new DN(2, e, i);
                    AbstractC2991bG.J("ExoPlayerImplInternal", "Playback error", dn32);
                    u(true, false);
                    this.f28962Z = this.f28962Z.e(dn32);
                    z6 = true;
                    d(message2.what);
                    return z6;
                }
                d(message2.what);
                return z6;
            case 9:
                InterfaceC3807qQ interfaceC3807qQ2 = (InterfaceC3807qQ) message2.obj;
                C3159eO c3159eO7 = this.J;
                C3052cO c3052cO4 = c3159eO7.f30715k;
                if (c3052cO4 != null && c3052cO4.f30256a == interfaceC3807qQ2) {
                    c3159eO7.n(this.f28976u0);
                    L();
                } else {
                    C3052cO c3052cO5 = c3159eO7.f30716l;
                    if (c3052cO5 != null && c3052cO5.f30256a == interfaceC3807qQ2) {
                        I();
                    }
                }
                z6 = true;
                d(message2.what);
                return z6;
            case 10:
                D();
                z6 = true;
                d(message2.what);
                return z6;
            case 11:
                int i34 = message2.arg1;
                this.f28970p0 = i34;
                int k14 = this.J.k(this.f28962Z.f32728a, i34);
                if ((k14 & 1) != 0) {
                    h(true);
                } else if ((k14 & 2) != 0) {
                    C();
                }
                Q(false);
                z6 = true;
                d(message2.what);
                return z6;
            case 12:
                boolean z20 = message2.arg1 != 0;
                this.f28971q0 = z20;
                int l9 = this.J.l(this.f28962Z.f32728a, z20);
                if ((l9 & 1) != 0) {
                    h(true);
                } else if ((l9 & 2) != 0) {
                    C();
                }
                Q(false);
                z6 = true;
                d(message2.what);
                return z6;
            case 13:
                boolean z21 = message2.arg1 != 0;
                C2818Tm c2818Tm2 = (C2818Tm) message2.obj;
                if (this.f28972r0 != z21) {
                    this.f28972r0 = z21;
                    if (!z21) {
                        D0.H[] hArr10 = this.f28967n;
                        for (int i35 = 0; i35 < 2; i35++) {
                            hArr10[i35].b();
                        }
                    }
                }
                if (c2818Tm2 != null) {
                    c2818Tm2.a();
                }
                z6 = true;
                d(message2.what);
                return z6;
            case 14:
                C3751pO c3751pO = (C3751pO) message2.obj;
                if (c3751pO.f33858e == this.f28937B) {
                    synchronized (c3751pO) {
                    }
                    try {
                        c3751pO.f33854a.b(c3751pO.f33856c, c3751pO.f33857d);
                        c3751pO.b(true);
                        int i36 = this.f28962Z.f32732e;
                        if (i36 == 3 || i36 == 2) {
                            this.f28985z.c(2);
                        }
                    } catch (Throwable th) {
                        c3751pO.b(true);
                        throw th;
                    }
                } else {
                    this.f28985z.b(15, c3751pO).a();
                }
                z6 = true;
                d(message2.what);
                return z6;
            case 15:
                C3751pO c3751pO2 = (C3751pO) message2.obj;
                Looper looper = c3751pO2.f33858e;
                if (looper.getThread().isAlive()) {
                    this.f28946H.x(looper, null).e(new RunnableC3830qw(14, c3751pO2));
                } else {
                    AbstractC2991bG.y("TAG", "Trying to send message on a dead thread.");
                    c3751pO2.b(false);
                }
                z6 = true;
                d(message2.what);
                return z6;
            case 16:
                C3947t5 c3947t52 = (C3947t5) message2.obj;
                K(c3947t52, c3947t52.f35002a, true, false);
                z6 = true;
                d(message2.what);
                return z6;
            case 17:
                TN tn = (TN) message2.obj;
                this.f28963i0.f(1);
                if (tn.f28516b != -1) {
                    this.f28974t0 = new UN(new C3858rO(tn.f28515a, tn.f28518d), tn.f28516b, tn.a());
                }
                F(this.f28948K.i(tn.f28515a, tn.f28518d), false);
                z6 = true;
                d(message2.what);
                return z6;
            case 18:
                TN tn2 = (TN) message2.obj;
                int i37 = message2.arg1;
                this.f28963i0.f(1);
                G3.m mVar = this.f28948K;
                if (i37 == -1) {
                    i37 = ((ArrayList) mVar.f1147w).size();
                }
                F(mVar.j(i37, tn2.f28515a, tn2.f28518d), false);
                z6 = true;
                d(message2.what);
                return z6;
            case 19:
                D.x.x(message2.obj);
                this.f28963i0.f(1);
                throw null;
            case 20:
                int i38 = message2.arg1;
                int i39 = message2.arg2;
                NQ nq = (NQ) message2.obj;
                this.f28963i0.f(1);
                F(this.f28948K.k(i38, i39, nq), false);
                z6 = true;
                d(message2.what);
                return z6;
            case 21:
                NQ nq2 = (NQ) message2.obj;
                this.f28963i0.f(1);
                F(this.f28948K.l(nq2), false);
                z6 = true;
                d(message2.what);
                return z6;
            case 22:
                F(this.f28948K.h(), true);
                z6 = true;
                d(message2.what);
                return z6;
            case 23:
                this.f28965k0 = message2.arg1 != 0;
                J();
                if (this.f28966l0) {
                    C3159eO c3159eO8 = this.J;
                    if (c3159eO8.t() != c3159eO8.s()) {
                        h(true);
                        Q(false);
                    }
                }
                z6 = true;
                d(message2.what);
                return z6;
            case 24:
                this.f28956S = message2.arg1 != 0;
                z6 = true;
                d(message2.what);
                return z6;
            case 25:
                D();
                h(true);
                z6 = true;
                d(message2.what);
                return z6;
            case 26:
                D();
                h(true);
                z6 = true;
                d(message2.what);
                return z6;
            case 27:
                int i40 = message2.arg1;
                int i41 = message2.arg2;
                List list = (List) message2.obj;
                this.f28963i0.f(1);
                F(this.f28948K.c(i40, i41, list), false);
                z6 = true;
                d(message2.what);
                return z6;
            case 28:
                FN fn = (FN) message2.obj;
                this.f28936A0 = fn;
                C3159eO c3159eO9 = this.J;
                AbstractC3627n8 abstractC3627n83 = this.f28962Z.f32728a;
                c3159eO9.m(fn);
                z6 = true;
                d(message2.what);
                return z6;
            case 29:
                this.f28963i0.f(1);
                v(false, false, false, true);
                this.f28983y.b(this.f28950M);
                c(true != this.f28962Z.f32728a.g() ? 2 : 4);
                C3589mO c3589mO5 = this.f28962Z;
                boolean z22 = c3589mO5.f32738l;
                f(this.f28955R.b(c3589mO5.f32732e, z22), c3589mO5.f32740n, c3589mO5.f32739m, z22);
                this.f28948K.g();
                this.f28985z.c(2);
                z6 = true;
                d(message2.what);
                return z6;
            case 30:
                Pair pair = (Pair) message2.obj;
                Object obj = pair.first;
                C2818Tm c2818Tm3 = (C2818Tm) pair.second;
                D0.H[] hArr11 = this.f28967n;
                for (int i42 = 0; i42 < 2; i42++) {
                    hArr11[i42].e(obj);
                }
                int i43 = this.f28962Z.f32732e;
                if (i43 == 3 || i43 == 2) {
                    this.f28985z.c(2);
                }
                if (c2818Tm3 != null) {
                    c2818Tm3.a();
                }
                z6 = true;
                d(message2.what);
                return z6;
            case 31:
                C2764Qj c2764Qj = (C2764Qj) message2.obj;
                int i44 = message2.arg1;
                this.f28979w.d(c2764Qj);
                Cif cif = this.f28955R;
                if (i44 == 0) {
                    c2764Qj = null;
                }
                cif.a(c2764Qj);
                C3589mO c3589mO6 = this.f28962Z;
                boolean z23 = c3589mO6.f32738l;
                f(this.f28955R.b(c3589mO6.f32732e, z23), c3589mO6.f32740n, c3589mO6.f32739m, z23);
                z6 = true;
                d(message2.what);
                return z6;
            case 32:
                e(((Float) message2.obj).floatValue());
                z6 = true;
                d(message2.what);
                return z6;
            case 33:
                int i45 = message2.arg1;
                C3589mO c3589mO7 = this.f28962Z;
                f(i45, c3589mO7.f32740n, c3589mO7.f32739m, c3589mO7.f32738l);
                z6 = true;
                d(message2.what);
                return z6;
            case 34:
                e(this.f28941D0);
                z6 = true;
                d(message2.what);
                return z6;
            case 35:
                InterfaceC3351i0 interfaceC3351i0 = (InterfaceC3351i0) message2.obj;
                D0.H[] hArr12 = this.f28967n;
                for (int i46 = 0; i46 < 2; i46++) {
                    hArr12[i46].f(interfaceC3351i0);
                }
                z6 = true;
                d(message2.what);
                return z6;
            case 36:
                boolean booleanValue = ((Boolean) message2.obj).booleanValue();
                if (!booleanValue) {
                    if (this.f28961X != null && this.f28960W && !this.f28985z.a()) {
                        this.Y++;
                    }
                    int i47 = this.Y;
                    if (i47 > 0) {
                        this.f28953P.e(new RunnableC3830qw(this, i47));
                    }
                    this.Y = 0;
                    this.f28960W = false;
                    this.f28985z.d(37);
                    UN un = this.f28961X;
                    if (un != null) {
                        q(un);
                        this.f28961X = null;
                        this.f28960W = false;
                    }
                }
                this.f28959V = booleanValue;
                t();
                z6 = true;
                d(message2.what);
                return z6;
            case 37:
                this.f28960W = false;
                UN un2 = this.f28961X;
                if (un2 != null) {
                    q(un2);
                    this.f28961X = null;
                }
                z6 = true;
                d(message2.what);
                return z6;
            case com.anythink.basead.b.b.j.f6592M /* 38 */:
                this.f28958U = (C3966tO) message2.obj;
                t();
                z6 = true;
                d(message2.what);
                return z6;
            case 39:
                D0.H[] hArr13 = this.f28967n;
                for (int i48 = 0; i48 < 2; i48++) {
                    int i49 = ((SP) hArr13[i48].f434e).f28261u;
                }
                z6 = true;
                d(message2.what);
                return z6;
            default:
                return false;
        }
    }

    public final void i() {
        C3052cO c3052cO = this.J.f30713h;
        if (c3052cO == null) {
            return;
        }
        C3941t c3941t = c3052cO.f30269o;
        for (int i = 0; i < 2; i++) {
            if (c3941t.c(i)) {
                this.f28967n[i].C();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3753pQ
    public final /* bridge */ /* synthetic */ void j(MQ mq) {
        this.f28985z.b(9, (InterfaceC3807qQ) mq).a();
    }

    public final void k() {
        Is is = this.f28944F;
        is.f26361u = false;
        C4128wO c4128wO = (C4128wO) is.f26362v;
        if (c4128wO.f35601n) {
            c4128wO.b(c4128wO.h());
            c4128wO.f35601n = false;
        }
        for (int i = 0; i < 2; i++) {
            D0.H h3 = this.f28967n[i];
            SP sp = (SP) h3.f434e;
            if (D0.H.l(sp)) {
                D0.H.n(sp);
            }
            SP sp2 = (SP) h3.f435f;
            if (sp2 != null && sp2.f28196A != 0) {
                D0.H.n(sp2);
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
        boolean z6;
        float f2;
        Is is;
        int i4;
        long j9;
        long j10;
        long max;
        C3159eO c3159eO = this.J;
        C3052cO c3052cO = c3159eO.f30713h;
        if (c3052cO == null) {
            return;
        }
        long w3 = c3052cO.f30260e ? c3052cO.f30256a.w() : -9223372036854775807L;
        if (w3 != com.anythink.basead.exoplayer.b.f7168b) {
            if (!c3052cO.b()) {
                c3159eO.y(c3052cO);
                C();
                Q(false);
                L();
            }
            s(w3, true);
            if (w3 != this.f28962Z.f32744r) {
                C3589mO c3589mO = this.f28962Z;
                j6 = -9223372036854775807L;
                i = 16;
                this.f28962Z = N(c3589mO.f32729b, w3, c3589mO.f32730c, w3, true, 5);
            } else {
                j6 = -9223372036854775807L;
                i = 16;
            }
        } else {
            j6 = -9223372036854775807L;
            i = 16;
            Is is2 = this.f28944F;
            boolean z9 = c3052cO != c3159eO.i;
            SP sp = (SP) is2.f26364x;
            C4128wO c4128wO = (C4128wO) is2.f26362v;
            if (sp == null || sp.J() || ((z9 && ((SP) is2.f26364x).f28196A != 2) || (!((SP) is2.f26364x).I() && (z9 || ((SP) is2.f26364x).r0())))) {
                is2.f26360n = true;
                if (is2.f26361u && !c4128wO.f35601n) {
                    c4128wO.f35603v = SystemClock.elapsedRealtime();
                    c4128wO.f35601n = true;
                }
            } else {
                InterfaceC2999bO interfaceC2999bO = (InterfaceC2999bO) is2.f26365y;
                interfaceC2999bO.getClass();
                long h3 = interfaceC2999bO.h();
                if (is2.f26360n) {
                    if (h3 >= c4128wO.h()) {
                        is2.f26360n = false;
                        if (is2.f26361u && !c4128wO.f35601n) {
                            c4128wO.f35603v = SystemClock.elapsedRealtime();
                            c4128wO.f35601n = true;
                        }
                    } else if (c4128wO.f35601n) {
                        c4128wO.b(c4128wO.h());
                        c4128wO.f35601n = false;
                    }
                }
                c4128wO.b(h3);
                C3947t5 j11 = interfaceC2999bO.j();
                if (!j11.equals(c4128wO.f35604w)) {
                    c4128wO.a(j11);
                    ((VN) is2.f26363w).f28985z.b(16, j11).a();
                }
            }
            long h9 = is2.h();
            this.f28976u0 = h9;
            long j12 = h9 - c3052cO.f30270p;
            long j13 = this.f28962Z.f32744r;
            ArrayList arrayList = this.f28945G;
            if (!arrayList.isEmpty() && !this.f28962Z.f32729b.b()) {
                if (this.f28982x0) {
                    this.f28982x0 = false;
                }
                C3589mO c3589mO2 = this.f28962Z;
                c3589mO2.f32728a.e(c3589mO2.f32729b.f34406a);
                int min = Math.min(this.f28980w0, arrayList.size());
                if (min > 0 && arrayList.get(min - 1) != null) {
                    throw new ClassCastException();
                }
                if (min < arrayList.size() && arrayList.get(min) != null) {
                    throw new ClassCastException();
                }
                this.f28980w0 = min;
            }
            if (is2.g()) {
                boolean z10 = !this.f28963i0.f35566d;
                C3589mO c3589mO3 = this.f28962Z;
                this.f28962Z = N(c3589mO3.f32729b, j12, c3589mO3.f32730c, j12, z10, 6);
            } else {
                C3589mO c3589mO4 = this.f28962Z;
                c3589mO4.f32744r = j12;
                c3589mO4.f32745s = SystemClock.elapsedRealtime();
            }
        }
        this.f28962Z.f32742p = c3159eO.f30715k.d();
        C3589mO c3589mO5 = this.f28962Z;
        c3589mO5.f32743q = R(c3589mO5.f32742p);
        C3589mO c3589mO6 = this.f28962Z;
        if (!c3589mO6.f32738l || c3589mO6.f32732e != 3 || !o(c3589mO6.f32728a, c3589mO6.f32729b)) {
            return;
        }
        C3589mO c3589mO7 = this.f28962Z;
        if (c3589mO7.f32741o.f35002a != 1.0f) {
            return;
        }
        C4289zN c4289zN = this.f28943E0;
        long n9 = n(c3589mO7.f32728a, c3589mO7.f32729b.f34406a, c3589mO7.f32744r);
        long j14 = this.f28962Z.f32743q;
        if (c4289zN.f36104c != j6) {
            long j15 = n9 - j14;
            long j16 = c4289zN.f36111k;
            if (j16 == j6) {
                c4289zN.f36111k = j15;
                c4289zN.f36112l = 0L;
                i4 = 1;
            } else {
                i4 = 1;
                c4289zN.f36111k = Math.max(j15, (long) ((j15 * 9.999871E-4f) + (j16 * 0.999f)));
                c4289zN.f36112l = (long) ((Math.abs(j15 - r13) * 9.999871E-4f) + (c4289zN.f36112l * 0.999f));
            }
            if (c4289zN.f36110j != j6) {
                j9 = 1000;
                f2 = SystemClock.elapsedRealtime() - c4289zN.f36110j < 1000 ? c4289zN.i : 1.0f;
            } else {
                j9 = 1000;
            }
            c4289zN.f36110j = SystemClock.elapsedRealtime();
            long j17 = (c4289zN.f36112l * 3) + c4289zN.f36111k;
            if (c4289zN.f36109h > j17) {
                long u6 = AbstractC3182eu.u(j9);
                int i6 = i4;
                float f9 = c4289zN.i - 1.0f;
                z6 = false;
                long j18 = c4289zN.f36106e;
                j10 = n9;
                float f10 = u6;
                long j19 = c4289zN.f36109h - (((long) (f9 * f10)) + ((long) (0.029999971f * f10)));
                long[] jArr = new long[3];
                jArr[0] = j17;
                jArr[i6] = j18;
                jArr[2] = j19;
                max = jArr[0];
                for (int i9 = i6; i9 < 3; i9++) {
                    long j20 = jArr[i9];
                    if (j20 > max) {
                        max = j20;
                    }
                }
                c4289zN.f36109h = max;
            } else {
                j10 = n9;
                z6 = false;
                long max2 = j10 - ((long) (Math.max(0.0f, c4289zN.i - 1.0f) / 1.0E-7f));
                long j21 = c4289zN.f36109h;
                String str = AbstractC3182eu.f30782a;
                max = Math.max(j21, Math.min(max2, j17));
                c4289zN.f36109h = max;
                long j22 = c4289zN.f36108g;
                if (j22 != j6 && max > j22) {
                    c4289zN.f36109h = j22;
                    max = j22;
                }
            }
            long j23 = j10 - max;
            if (Math.abs(j23) < c4289zN.f36102a) {
                c4289zN.i = 1.0f;
                f2 = 1.0f;
            } else {
                f2 = Math.max(0.97f, Math.min((j23 * 1.0E-7f) + 1.0f, 1.03f));
                c4289zN.i = f2;
            }
            is = this.f28944F;
            if (is.j().f35002a == f2) {
                C3947t5 c3947t5 = new C3947t5(f2, this.f28962Z.f32741o.f35003b);
                this.f28985z.d(i);
                this.f28944F.a(c3947t5);
                boolean z11 = z6;
                K(this.f28962Z.f32741o, is.j().f35002a, z11, z11);
                return;
            }
            return;
        }
        z6 = false;
        is = this.f28944F;
        if (is.j().f35002a == f2) {
        }
    }

    public final void m(int i, boolean z6) {
        boolean[] zArr = this.f28977v;
        if (zArr[i] != z6) {
            zArr[i] = z6;
            this.f28953P.e(new L.a(this, i, z6));
        }
    }

    public final long n(AbstractC3627n8 abstractC3627n8, Object obj, long j6) {
        int i = abstractC3627n8.o(obj, this.f28940D).f26619c;
        U7 u72 = this.f28939C;
        abstractC3627n8.b(i, u72, 0L);
        if (u72.f28693d == com.anythink.basead.exoplayer.b.f7168b || !u72.b() || !u72.f28696g) {
            return com.anythink.basead.exoplayer.b.f7168b;
        }
        long j9 = u72.f28694e;
        String str = AbstractC3182eu.f30782a;
        return AbstractC3182eu.u((j9 == com.anythink.basead.exoplayer.b.f7168b ? System.currentTimeMillis() : j9 + SystemClock.elapsedRealtime()) - u72.f28693d) - j6;
    }

    public final boolean o(AbstractC3627n8 abstractC3627n8, C3860rQ c3860rQ) {
        if (c3860rQ.b() || abstractC3627n8.g()) {
            return false;
        }
        int i = abstractC3627n8.o(c3860rQ.f34406a, this.f28940D).f26619c;
        U7 u72 = this.f28939C;
        abstractC3627n8.b(i, u72, 0L);
        return u72.b() && u72.f28696g && u72.f28693d != com.anythink.basead.exoplayer.b.f7168b;
    }

    public final void p(long j6) {
        boolean z6 = true;
        if (!this.f28951N) {
            if (this.f28959V) {
                this.f28958U.getClass();
            } else {
                z6 = false;
            }
        }
        long j9 = f28934F0;
        if (z6) {
            r3 = this.f28962Z.f32732e != 3 ? j9 : 1000L;
            for (int i = 0; i < 2; i++) {
                D0.H h3 = this.f28967n[i];
                long j10 = this.f28976u0;
                SP sp = (SP) h3.f434e;
                long T8 = D0.H.l(sp) ? sp.T(j10) : Long.MAX_VALUE;
                SP sp2 = (SP) h3.f435f;
                if (sp2 != null && sp2.f28196A != 0) {
                    T8 = Math.min(T8, sp2.T(j10));
                }
                r3 = Math.min(r3, AbstractC3182eu.t(T8));
            }
            if (this.f28962Z.i()) {
                C3052cO c3052cO = this.J.f30713h;
                if ((c3052cO != null ? c3052cO.f30267m : null) != null) {
                    if (this.f28976u0 + (AbstractC3182eu.u(r3) * this.f28962Z.f32741o.f35002a) >= r1.a()) {
                        r3 = Math.min(r3, j9);
                    }
                }
            }
        } else if (this.f28962Z.f32732e != 3 || T()) {
            r3 = j9;
        }
        this.f28985z.f31231a.sendEmptyMessageAtTime(2, j6 + r3);
    }

    public final void q(UN un) {
        long longValue;
        long j6;
        long j9;
        C3860rQ E8;
        boolean z6;
        long j10;
        int i;
        long j11;
        boolean z9;
        long j12;
        long j13;
        long j14;
        boolean z10;
        C3589mO c3589mO;
        C3860rQ c3860rQ;
        long j15;
        long j16;
        boolean z11;
        C3589mO c3589mO2;
        int i4;
        if (this.f28960W) {
            if (this.f28961X != null) {
                this.Y++;
                this.f28963i0.f(1);
            }
            this.f28961X = un;
            return;
        }
        this.f28963i0.f(1);
        AbstractC3627n8 abstractC3627n8 = this.f28962Z.f32728a;
        int i6 = this.f28970p0;
        boolean z12 = this.f28971q0;
        U7 u72 = this.f28939C;
        K7 k72 = this.f28940D;
        Pair z13 = z(abstractC3627n8, un, i6, z12, u72, k72);
        if (z13 == null) {
            Pair w3 = w(this.f28962Z.f32728a);
            C3860rQ c3860rQ2 = (C3860rQ) w3.first;
            longValue = ((Long) w3.second).longValue();
            z6 = !this.f28962Z.f32728a.g();
            E8 = c3860rQ2;
            j10 = -9223372036854775807L;
            j6 = -9223372036854775807L;
        } else {
            Object obj = z13.first;
            longValue = ((Long) z13.second).longValue();
            long j17 = un.f28720c;
            if (j17 == com.anythink.basead.exoplayer.b.f7168b) {
                j9 = -9223372036854775807L;
                j6 = -9223372036854775807L;
            } else {
                j6 = -9223372036854775807L;
                j9 = longValue;
            }
            C3159eO c3159eO = this.J;
            long j18 = j9;
            C3589mO c3589mO3 = this.f28962Z;
            E8 = c3159eO.E(c3589mO3, c3589mO3.f32728a, obj, true, false);
            if (E8.b()) {
                this.f28962Z.f32728a.o(E8.f34406a, k72);
                int i9 = E8.f34407b;
                C2920a a9 = k72.f26622f.a(i9);
                int i10 = 0;
                while (true) {
                    int[] iArr = a9.f29756d;
                    if (i10 >= iArr.length || (i = iArr[i10]) == 0 || i == 1) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 == E8.f34408c) {
                    k72.f26622f.getClass();
                }
                k72.f26622f.a(i9).getClass();
                j10 = Math.max(j18, 0L);
                longValue = 0;
                z6 = true;
            } else {
                z6 = j17 == com.anythink.basead.exoplayer.b.f7168b;
                j10 = j18;
            }
        }
        try {
            if (this.f28962Z.f32728a.g()) {
                this.f28974t0 = un;
            } else {
                if (z13 != null) {
                    if (E8.equals(this.f28962Z.f32729b)) {
                        C3052cO c3052cO = this.J.f30713h;
                        if (c3052cO == null || !c3052cO.f30260e || longValue == 0) {
                            j13 = longValue;
                        } else {
                            C3483kQ c3483kQ = c3052cO.f30256a;
                            long j19 = u72.f28698j;
                            if (this.f28959V && j19 != j6) {
                                this.f28958U.getClass();
                            }
                            j13 = c3483kQ.c(longValue, this.f28957T);
                        }
                        if (AbstractC3182eu.t(j13) == AbstractC3182eu.t(this.f28962Z.f32744r) && ((i4 = (c3589mO2 = this.f28962Z).f32732e) == 2 || i4 == 3)) {
                            longValue = c3589mO2.f32744r;
                        }
                    } else {
                        j13 = longValue;
                    }
                    boolean z14 = this.f28962Z.f32732e == 4;
                    C3159eO c3159eO2 = this.J;
                    if (c3159eO2.f30713h != c3159eO2.i) {
                        j14 = j13;
                        z10 = true;
                    } else {
                        j14 = j13;
                        z10 = false;
                    }
                    long r9 = r(E8, j14, z10, z14);
                    boolean z15 = z6 | (longValue != r9);
                    try {
                        c3589mO = this.f28962Z;
                        c3860rQ = E8;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        AbstractC3627n8 abstractC3627n82 = c3589mO.f32728a;
                        long j20 = j10;
                        try {
                            G(abstractC3627n82, c3860rQ, abstractC3627n82, c3589mO.f32729b, j20, true);
                            E8 = c3860rQ;
                            j15 = j20;
                            j16 = r9;
                            z11 = z15;
                            this.f28962Z = N(E8, j16, j15, j16, z11, 2);
                        } catch (Throwable th2) {
                            th = th2;
                            E8 = c3860rQ;
                            j11 = j20;
                            j12 = r9;
                            z9 = z15;
                            this.f28962Z = N(E8, j12, j11, j12, z9, 2);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        E8 = c3860rQ;
                        j11 = j10;
                        j12 = r9;
                        z9 = z15;
                        this.f28962Z = N(E8, j12, j11, j12, z9, 2);
                        throw th;
                    }
                }
                if (this.f28962Z.f32732e != 1) {
                    c(4);
                }
                v(false, true, false, true);
            }
            z11 = z6;
            j16 = longValue;
            j15 = j10;
            this.f28962Z = N(E8, j16, j15, j16, z11, 2);
        } catch (Throwable th4) {
            th = th4;
            j11 = j10;
            z9 = z6;
            j12 = longValue;
        }
    }

    public final long r(C3860rQ c3860rQ, long j6, boolean z6, boolean z9) {
        k();
        boolean z10 = true;
        y(false, true);
        if (z9 || this.f28962Z.f32732e == 3) {
            c(2);
        }
        C3159eO c3159eO = this.J;
        C3052cO c3052cO = c3159eO.f30713h;
        C3052cO c3052cO2 = c3052cO;
        while (c3052cO2 != null && !c3860rQ.equals(c3052cO2.f30262g.f30532a)) {
            c3052cO2 = c3052cO2.f30267m;
        }
        if (z6 || c3052cO != c3052cO2 || (c3052cO2 != null && c3052cO2.f30270p + j6 < 0)) {
            B();
            if (c3052cO2 != null) {
                while (c3159eO.f30713h != c3052cO2) {
                    c3159eO.x();
                }
                c3159eO.y(c3052cO2);
                c3052cO2.f30270p = 1000000000000L;
                O(new boolean[2], this.J.i.a());
                c3052cO2.f30263h = true;
            }
        }
        C();
        if (this.f28959V) {
            D0.H[] hArr = this.f28967n;
            int i = 0;
            while (true) {
                if (i >= 2) {
                    break;
                }
                D0.H h3 = hArr[i];
                if (h3.g() && ((SP) h3.f434e).f28261u == 2) {
                    this.f28960W = true;
                    break;
                }
                i++;
            }
        }
        if (c3052cO2 != null) {
            c3159eO.y(c3052cO2);
            if (!c3052cO2.f30260e) {
                c3052cO2.f30262g = c3052cO2.f30262g.a(j6, com.anythink.basead.exoplayer.b.f7168b);
            } else if (c3052cO2.f30261f) {
                if (this.f28959V) {
                    this.f28958U.getClass();
                    if (!this.f28962Z.f32728a.g() && c3052cO2.f30262g.f30532a.equals(this.f28962Z.f32729b)) {
                        long j9 = c3052cO2.f30270p + j6;
                        D0.H[] hArr2 = this.f28967n;
                        boolean z11 = true;
                        for (int i4 = 0; i4 < 2; i4++) {
                            D0.H h9 = hArr2[i4];
                            if (h9.g()) {
                                SP m9 = h9.m(c3052cO2);
                                z11 &= m9 != null && m9.q(j9);
                            }
                        }
                        if (z11) {
                            C3483kQ c3483kQ = c3052cO2.f30256a;
                            long j10 = this.f28962Z.f32744r;
                            C4020uO c4020uO = C4020uO.f35306b;
                            if (c3483kQ.c(j10, c4020uO) == c3483kQ.c(j6, c4020uO)) {
                                z10 = false;
                            }
                        }
                    }
                }
                C3483kQ c3483kQ2 = c3052cO2.f30256a;
                j6 = c3483kQ2.a(j6);
                c3483kQ2.X(j6 - this.f28942E);
            }
            s(j6, z10);
            L();
        } else {
            c3159eO.B();
            s(j6, true);
        }
        Q(false);
        this.f28985z.c(2);
        return j6;
    }

    public final void s(long j6, boolean z6) {
        C3052cO c3052cO = this.J.f30713h;
        long j9 = j6 + (c3052cO == null ? 1000000000000L : c3052cO.f30270p);
        this.f28976u0 = j9;
        ((C4128wO) this.f28944F.f26362v).b(j9);
        for (int i = 0; i < 2; i++) {
            D0.H h3 = this.f28967n[i];
            long j10 = this.f28976u0;
            SP m9 = h3.m(c3052cO);
            if (m9 != null) {
                m9.N(j10, false, z6);
            }
        }
        for (C3052cO c3052cO2 = r0.f30713h; c3052cO2 != null; c3052cO2 = c3052cO2.f30267m) {
            for (InterfaceC3780q interfaceC3780q : (InterfaceC3780q[]) c3052cO2.f30269o.f34965v) {
            }
        }
    }

    public final void t() {
        for (int i = 0; i < 2; i++) {
            D0.H h3 = this.f28967n[i];
            C3966tO c3966tO = this.f28959V ? this.f28958U : null;
            ((SP) h3.f434e).b(18, c3966tO);
            SP sp = (SP) h3.f435f;
            if (sp != null) {
                sp.b(18, c3966tO);
            }
        }
    }

    public final void u(boolean z6, boolean z9) {
        v(z6 || !this.f28972r0, false, true, false);
        this.f28963i0.f(z9 ? 1 : 0);
        this.f28983y.f(this.f28950M);
        this.f28955R.b(1, this.f28962Z.f32738l);
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
    public final void v(boolean z6, boolean z9, boolean z10, boolean z11) {
        long j6;
        boolean z12;
        AbstractC3627n8 abstractC3627n8;
        C3860rQ c3860rQ;
        AbstractC3627n8 abstractC3627n82;
        List list;
        this.f28985z.d(2);
        this.f28960W = false;
        boolean z13 = true;
        if (this.f28961X != null) {
            this.f28963i0.f(1);
            this.f28961X = null;
        }
        this.f28984y0 = null;
        y(false, true);
        Is is = this.f28944F;
        is.f26361u = false;
        C4128wO c4128wO = (C4128wO) is.f26362v;
        if (c4128wO.f35601n) {
            c4128wO.b(c4128wO.h());
            c4128wO.f35601n = false;
        }
        this.f28976u0 = 1000000000000L;
        try {
            B();
        } catch (DN | RuntimeException e9) {
            AbstractC2991bG.J("ExoPlayerImplInternal", "Disable failed.", e9);
        }
        if (z6) {
            D0.H[] hArr = this.f28967n;
            for (int i = 0; i < 2; i++) {
                try {
                    hArr[i].b();
                } catch (RuntimeException e10) {
                    AbstractC2991bG.J("ExoPlayerImplInternal", "Reset failed.", e10);
                }
            }
        }
        this.f28973s0 = 0;
        C3589mO c3589mO = this.f28962Z;
        C3860rQ c3860rQ2 = c3589mO.f32729b;
        long j9 = c3589mO.f32744r;
        if (!this.f28962Z.f32729b.b()) {
            C3589mO c3589mO2 = this.f28962Z;
            K7 k72 = this.f28940D;
            C3860rQ c3860rQ3 = c3589mO2.f32729b;
            AbstractC3627n8 abstractC3627n83 = c3589mO2.f32728a;
            if (!abstractC3627n83.g() && !abstractC3627n83.o(c3860rQ3.f34406a, k72).f26621e) {
                j6 = this.f28962Z.f32744r;
                if (z9) {
                    this.f28974t0 = null;
                    Pair w3 = w(this.f28962Z.f32728a);
                    c3860rQ2 = (C3860rQ) w3.first;
                    j9 = ((Long) w3.second).longValue();
                    boolean equals = c3860rQ2.equals(this.f28962Z.f32729b);
                    j6 = com.anythink.basead.exoplayer.b.f7168b;
                    if (!equals) {
                        z12 = true;
                        long j10 = j9;
                        long j11 = j6;
                        C3159eO c3159eO = this.J;
                        c3159eO.B();
                        this.f28969o0 = false;
                        abstractC3627n8 = this.f28962Z.f32728a;
                        if (z10 || !(abstractC3627n8 instanceof C3858rO)) {
                            c3860rQ = c3860rQ2;
                            abstractC3627n82 = abstractC3627n8;
                        } else {
                            C3858rO c3858rO = (C3858rO) abstractC3627n8;
                            NQ nq = (NQ) this.f28948K.f1143E;
                            AbstractC3627n8[] abstractC3627n8Arr = c3858rO.f34356h;
                            AbstractC3627n8[] abstractC3627n8Arr2 = new AbstractC3627n8[abstractC3627n8Arr.length];
                            int i4 = 0;
                            while (i4 < abstractC3627n8Arr.length) {
                                abstractC3627n8Arr2[i4] = new C3805qO(c3858rO, abstractC3627n8Arr[i4]);
                                i4++;
                                z13 = z13;
                            }
                            C3858rO c3858rO2 = new C3858rO(abstractC3627n8Arr2, c3858rO.i, nq);
                            if (c3860rQ2.f34407b != -1) {
                                Object obj = c3860rQ2.f34406a;
                                K7 k73 = this.f28940D;
                                c3858rO2.o(obj, k73);
                                U7 u72 = this.f28939C;
                                c3858rO2.b(k73.f26619c, u72, 0L);
                                if (u72.b()) {
                                    abstractC3627n82 = c3858rO2;
                                    c3860rQ = new C3860rQ(c3860rQ2.f34409d, obj);
                                }
                            }
                            c3860rQ = c3860rQ2;
                            abstractC3627n82 = c3858rO2;
                        }
                        C3589mO c3589mO3 = this.f28962Z;
                        int i6 = c3589mO3.f32732e;
                        DN dn = z11 ? null : c3589mO3.f32733f;
                        SQ sq = z12 ? SQ.f28273d : c3589mO3.f32735h;
                        C3941t c3941t = z12 ? this.f28981x : c3589mO3.i;
                        if (z12) {
                            PB pb = RB.f27933u;
                            list = C3523lC.f32525x;
                        } else {
                            list = c3589mO3.f32736j;
                        }
                        this.f28962Z = new C3589mO(abstractC3627n82, c3860rQ, j11, j10, i6, dn, false, sq, c3941t, list, c3860rQ, c3589mO3.f32738l, c3589mO3.f32739m, c3589mO3.f32740n, c3589mO3.f32741o, j10, 0L, j10, 0L);
                        if (z10) {
                            c3159eO.r();
                            G3.m mVar = this.f28948K;
                            HashMap hashMap = (HashMap) mVar.f1139A;
                            for (C3427jO c3427jO : hashMap.values()) {
                                try {
                                    c3427jO.f32029a.q(c3427jO.f32030b);
                                } catch (RuntimeException e11) {
                                    AbstractC2991bG.J("MediaSourceList", "Failed to release child source.", e11);
                                }
                                AbstractC2947aQ abstractC2947aQ = c3427jO.f32029a;
                                C3375iO c3375iO = c3427jO.f32031c;
                                abstractC2947aQ.l(c3375iO);
                                abstractC2947aQ.m(c3375iO);
                            }
                            hashMap.clear();
                            ((HashSet) mVar.f1140B).clear();
                            mVar.f1144n = false;
                            return;
                        }
                        return;
                    }
                }
                z12 = false;
                long j102 = j9;
                long j112 = j6;
                C3159eO c3159eO2 = this.J;
                c3159eO2.B();
                this.f28969o0 = false;
                abstractC3627n8 = this.f28962Z.f32728a;
                if (z10) {
                }
                c3860rQ = c3860rQ2;
                abstractC3627n82 = abstractC3627n8;
                C3589mO c3589mO32 = this.f28962Z;
                int i62 = c3589mO32.f32732e;
                if (z11) {
                }
                SQ sq2 = z12 ? SQ.f28273d : c3589mO32.f32735h;
                C3941t c3941t2 = z12 ? this.f28981x : c3589mO32.i;
                if (z12) {
                }
                this.f28962Z = new C3589mO(abstractC3627n82, c3860rQ, j112, j102, i62, dn, false, sq2, c3941t2, list, c3860rQ, c3589mO32.f32738l, c3589mO32.f32739m, c3589mO32.f32740n, c3589mO32.f32741o, j102, 0L, j102, 0L);
                if (z10) {
                }
            }
        }
        j6 = this.f28962Z.f32730c;
        if (z9) {
        }
        z12 = false;
        long j1022 = j9;
        long j1122 = j6;
        C3159eO c3159eO22 = this.J;
        c3159eO22.B();
        this.f28969o0 = false;
        abstractC3627n8 = this.f28962Z.f32728a;
        if (z10) {
        }
        c3860rQ = c3860rQ2;
        abstractC3627n82 = abstractC3627n8;
        C3589mO c3589mO322 = this.f28962Z;
        int i622 = c3589mO322.f32732e;
        if (z11) {
        }
        SQ sq22 = z12 ? SQ.f28273d : c3589mO322.f32735h;
        C3941t c3941t22 = z12 ? this.f28981x : c3589mO322.i;
        if (z12) {
        }
        this.f28962Z = new C3589mO(abstractC3627n82, c3860rQ, j1122, j1022, i622, dn, false, sq22, c3941t22, list, c3860rQ, c3589mO322.f32738l, c3589mO322.f32739m, c3589mO322.f32740n, c3589mO322.f32741o, j1022, 0L, j1022, 0L);
        if (z10) {
        }
    }

    public final Pair w(AbstractC3627n8 abstractC3627n8) {
        int i;
        long j6 = 0;
        if (abstractC3627n8.g()) {
            return Pair.create(C3589mO.f32727t, 0L);
        }
        int k9 = abstractC3627n8.k(this.f28971q0);
        U7 u72 = this.f28939C;
        K7 k72 = this.f28940D;
        Pair m9 = abstractC3627n8.m(u72, k72, k9, com.anythink.basead.exoplayer.b.f7168b);
        C3860rQ E8 = this.J.E(this.f28962Z, abstractC3627n8, m9.first, true, false);
        long longValue = ((Long) m9.second).longValue();
        if (E8.b()) {
            abstractC3627n8.o(E8.f34406a, k72);
            C2920a a9 = k72.f26622f.a(E8.f34407b);
            int i4 = 0;
            while (true) {
                int[] iArr = a9.f29756d;
                if (i4 >= iArr.length || (i = iArr[i4]) == 0 || i == 1) {
                    break;
                }
                i4++;
            }
            if (E8.f34408c == i4) {
                k72.f26622f.getClass();
            }
        } else {
            j6 = longValue;
        }
        return Pair.create(E8, Long.valueOf(j6));
    }

    public final void x(AbstractC3627n8 abstractC3627n8, AbstractC3627n8 abstractC3627n82) {
        if (abstractC3627n8.g() && abstractC3627n82.g()) {
            return;
        }
        ArrayList arrayList = this.f28945G;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            arrayList.get(size).getClass();
            throw new ClassCastException();
        }
    }

    public final void y(boolean z6, boolean z9) {
        this.m0 = z6;
        long j6 = com.anythink.basead.exoplayer.b.f7168b;
        if (z6 && !z9) {
            j6 = SystemClock.elapsedRealtime();
        }
        this.f28968n0 = j6;
    }
}

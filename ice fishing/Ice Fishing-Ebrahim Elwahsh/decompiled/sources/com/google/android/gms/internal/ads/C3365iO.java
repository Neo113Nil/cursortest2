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

/* renamed from: com.google.android.gms.internal.ads.iO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3365iO implements Handler.Callback, InterfaceC4282zQ, AO, InterfaceC3233g0 {

    /* renamed from: J0, reason: collision with root package name */
    public static final long f31331J0 = AbstractC3548lu.t(10000);

    /* renamed from: A, reason: collision with root package name */
    public final O5 f31332A;

    /* renamed from: A0, reason: collision with root package name */
    public int f31333A0;

    /* renamed from: B, reason: collision with root package name */
    public final Looper f31334B;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f31335B0;

    /* renamed from: C, reason: collision with root package name */
    public final Y7 f31336C;
    public RN C0;

    /* renamed from: D, reason: collision with root package name */
    public final L7 f31337D;

    /* renamed from: E, reason: collision with root package name */
    public final long f31339E;

    /* renamed from: E0, reason: collision with root package name */
    public TN f31340E0;

    /* renamed from: F, reason: collision with root package name */
    public final Js f31341F;

    /* renamed from: G, reason: collision with root package name */
    public final ArrayList f31343G;

    /* renamed from: G0, reason: collision with root package name */
    public boolean f31344G0;

    /* renamed from: H, reason: collision with root package name */
    public final T2 f31345H;

    /* renamed from: I, reason: collision with root package name */
    public final Mt f31347I;

    /* renamed from: I0, reason: collision with root package name */
    public final NN f31348I0;
    public final C3848rO J;

    /* renamed from: K, reason: collision with root package name */
    public final C3.m f31349K;

    /* renamed from: L, reason: collision with root package name */
    public final long f31350L;

    /* renamed from: M, reason: collision with root package name */
    public final VO f31351M;

    /* renamed from: N, reason: collision with root package name */
    public final boolean f31352N;

    /* renamed from: O, reason: collision with root package name */
    public final OO f31353O;

    /* renamed from: P, reason: collision with root package name */
    public final C3709ot f31354P;

    /* renamed from: Q, reason: collision with root package name */
    public final boolean f31355Q;

    /* renamed from: R, reason: collision with root package name */
    public final C3749pf f31356R;

    /* renamed from: S, reason: collision with root package name */
    public HO f31357S;

    /* renamed from: U, reason: collision with root package name */
    public boolean f31359U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f31360V;

    /* renamed from: W, reason: collision with root package name */
    public C3311hO f31361W;

    /* renamed from: X, reason: collision with root package name */
    public int f31362X;
    public C4280zO Y;

    /* renamed from: Z, reason: collision with root package name */
    public C3990u4 f31363Z;

    /* renamed from: n, reason: collision with root package name */
    public final D0.H[] f31364n;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f31365n0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f31367p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f31368q0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f31370s0;

    /* renamed from: u, reason: collision with root package name */
    public final AbstractC3149eQ[] f31372u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean[] f31374v;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f31375v0;

    /* renamed from: w, reason: collision with root package name */
    public final C3554m f31376w;

    /* renamed from: w0, reason: collision with root package name */
    public int f31377w0;

    /* renamed from: x, reason: collision with root package name */
    public final C3877s f31378x;

    /* renamed from: x0, reason: collision with root package name */
    public C3311hO f31379x0;

    /* renamed from: y, reason: collision with root package name */
    public final InterfaceC3525lO f31380y;

    /* renamed from: y0, reason: collision with root package name */
    public long f31381y0;

    /* renamed from: z, reason: collision with root package name */
    public final C3709ot f31382z;

    /* renamed from: z0, reason: collision with root package name */
    public long f31383z0;

    /* renamed from: F0, reason: collision with root package name */
    public long f31342F0 = com.anythink.basead.exoplayer.b.f6539b;

    /* renamed from: t0, reason: collision with root package name */
    public int f31371t0 = 0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f31373u0 = false;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f31366o0 = false;

    /* renamed from: H0, reason: collision with root package name */
    public float f31346H0 = 1.0f;

    /* renamed from: T, reason: collision with root package name */
    public GO f31358T = GO.f25152b;

    /* renamed from: D0, reason: collision with root package name */
    public long f31338D0 = com.anythink.basead.exoplayer.b.f6539b;

    /* renamed from: r0, reason: collision with root package name */
    public long f31369r0 = com.anythink.basead.exoplayer.b.f6539b;

    public C3365iO(Context context, AbstractC3149eQ[] abstractC3149eQArr, AbstractC3149eQ[] abstractC3149eQArr2, C3554m c3554m, C3877s c3877s, InterfaceC3525lO interfaceC3525lO, InterfaceC4147x interfaceC4147x, OO oo, HO ho, NN nn, long j9, boolean z8, Looper looper, T2 t22, Mt mt, VO vo, TN tn) {
        Looper looper2;
        this.f31347I = mt;
        this.f31376w = c3554m;
        this.f31378x = c3877s;
        this.f31380y = interfaceC3525lO;
        boolean z9 = false;
        this.f31357S = ho;
        this.f31348I0 = nn;
        this.f31350L = j9;
        this.f31352N = z8;
        this.f31345H = t22;
        this.f31351M = vo;
        this.f31340E0 = tn;
        this.f31353O = oo;
        this.f31339E = interfaceC3525lO.f();
        C4155x7 c4155x7 = AbstractC3832r8.f33969a;
        C4280zO a9 = C4280zO.a(c3877s);
        this.Y = a9;
        this.f31363Z = new C3990u4(a9);
        int length = abstractC3149eQArr.length;
        this.f31372u = new AbstractC3149eQ[2];
        this.f31374v = new boolean[2];
        c3554m.getClass();
        this.f31364n = new D0.H[2];
        int i = 0;
        boolean z10 = false;
        for (int i4 = 2; i < i4; i4 = 2) {
            AbstractC3149eQ abstractC3149eQ = abstractC3149eQArr[i];
            abstractC3149eQ.f30428x = i;
            abstractC3149eQ.f30430y = vo;
            abstractC3149eQ.f30432z = t22;
            AbstractC3149eQ[] abstractC3149eQArr3 = this.f31372u;
            abstractC3149eQ.getClass();
            abstractC3149eQArr3[i] = abstractC3149eQ;
            AbstractC3149eQ abstractC3149eQ2 = this.f31372u[i];
            synchronized (abstractC3149eQ2.f30414n) {
                abstractC3149eQ2.f30375L = c3554m;
            }
            AbstractC3149eQ abstractC3149eQ3 = abstractC3149eQArr2[i];
            if (abstractC3149eQ3 != null) {
                abstractC3149eQ3.f30428x = i;
                abstractC3149eQ3.f30430y = vo;
                abstractC3149eQ3.f30432z = t22;
                z10 = true;
            }
            D0.H[] hArr = this.f31364n;
            AbstractC3149eQ abstractC3149eQ4 = abstractC3149eQArr[i];
            D0.H h9 = new D0.H();
            h9.f594e = abstractC3149eQ4;
            h9.f590a = i;
            h9.f595f = abstractC3149eQ3;
            h9.f591b = 0;
            h9.f592c = false;
            h9.f593d = false;
            hArr[i] = h9;
            i++;
        }
        this.f31355Q = z10;
        this.f31341F = new Js(this);
        this.f31343G = new ArrayList();
        this.f31336C = new Y7();
        this.f31337D = new L7();
        PA.T(c3554m.f32630a == null);
        c3554m.f32630a = this;
        c3554m.f32631b = interfaceC4147x;
        this.f31335B0 = true;
        C3709ot A8 = t22.A(looper, null);
        this.f31354P = A8;
        this.J = new C3848rO(oo, A8, new C4086vt(11, this), tn);
        this.f31349K = new C3.m(this, oo, A8, vo, interfaceC4147x);
        O5 o52 = new O5();
        o52.f26649u = new Object();
        o52.f26650v = null;
        o52.f26651w = null;
        o52.f26648n = 0;
        this.f31332A = o52;
        synchronized (o52.f26649u) {
            try {
                if (((Looper) o52.f26650v) == null) {
                    if (o52.f26648n == 0 && ((HandlerThread) o52.f26651w) == null) {
                        z9 = true;
                    }
                    PA.T(z9);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    o52.f26651w = handlerThread;
                    handlerThread.start();
                    o52.f26650v = ((HandlerThread) o52.f26651w).getLooper();
                }
                o52.f26648n++;
                looper2 = (Looper) o52.f26650v;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f31334B = looper2;
        C3709ot A9 = t22.A(looper2, this);
        this.f31382z = A9;
        this.f31356R = new C3749pf(context, looper2, this);
        A9.b(35, new InterfaceC3233g0() { // from class: com.google.android.gms.internal.ads.fO
            @Override // com.google.android.gms.internal.ads.InterfaceC3233g0
            public final /* synthetic */ void a(long j10, long j11, TP tp, MediaFormat mediaFormat) {
                C3365iO.this.a(j10, j11, tp, mediaFormat);
            }
        }).a();
    }

    public static final boolean A(C3741pO c3741pO) {
        if (c3741pO != null) {
            try {
                C4012uQ c4012uQ = c3741pO.f33385a;
                if (c3741pO.f33389e) {
                    VQ[] vqArr = c3741pO.f33387c;
                    for (int i = 0; i < 2; i++) {
                        VQ vq = vqArr[i];
                        if (vq != null) {
                            vq.d();
                        }
                    }
                } else {
                    c4012uQ.m();
                }
                if ((!c3741pO.f33389e ? 0L : c4012uQ.i()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public static int W(Y7 y72, L7 l72, int i, boolean z8, Object obj, AbstractC3832r8 abstractC3832r8, AbstractC3832r8 abstractC3832r82) {
        Y7 y73 = y72;
        AbstractC3832r8 abstractC3832r83 = abstractC3832r8;
        Object obj2 = abstractC3832r83.b(abstractC3832r83.o(obj, l72).f26108c, y72, 0L).f28794a;
        for (int i4 = 0; i4 < abstractC3832r82.a(); i4++) {
            if (abstractC3832r82.b(i4, y72, 0L).f28794a.equals(obj2)) {
                return i4;
            }
        }
        int e6 = abstractC3832r83.e(obj);
        int c4 = abstractC3832r83.c();
        int i9 = -1;
        int i10 = 0;
        while (true) {
            if (i10 >= c4 || i9 != -1) {
                break;
            }
            AbstractC3832r8 abstractC3832r84 = abstractC3832r83;
            int l9 = abstractC3832r84.l(e6, l72, y73, i, z8);
            if (l9 == -1) {
                i9 = -1;
                break;
            }
            i9 = abstractC3832r82.e(abstractC3832r84.f(l9));
            i10++;
            abstractC3832r83 = abstractC3832r84;
            e6 = l9;
            y73 = y72;
        }
        if (i9 == -1) {
            return -1;
        }
        return abstractC3832r82.d(i9, l72, false).f26108c;
    }

    public static Pair z(AbstractC3832r8 abstractC3832r8, C3311hO c3311hO, int i, boolean z8, Y7 y72, L7 l72) {
        AbstractC3832r8 abstractC3832r82 = c3311hO.f31231a;
        if (abstractC3832r8.g()) {
            return null;
        }
        AbstractC3832r8 abstractC3832r83 = true == abstractC3832r82.g() ? abstractC3832r8 : abstractC3832r82;
        try {
            Pair m8 = abstractC3832r83.m(y72, l72, c3311hO.f31232b, c3311hO.f31233c);
            if (!abstractC3832r8.equals(abstractC3832r83)) {
                if (abstractC3832r8.e(m8.first) == -1) {
                    int W8 = W(y72, l72, i, z8, m8.first, abstractC3832r83, abstractC3832r8);
                    if (W8 != -1) {
                        return abstractC3832r8.m(y72, l72, W8, com.anythink.basead.exoplayer.b.f6539b);
                    }
                    return null;
                }
                if (abstractC3832r83.o(m8.first, l72).f26110e && abstractC3832r83.b(l72.f26108c, y72, 0L).f28803k == abstractC3832r83.e(m8.first)) {
                    return abstractC3832r8.m(y72, l72, abstractC3832r8.o(m8.first, l72).f26108c, c3311hO.f31233c);
                }
            }
            return m8;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public final void B() {
        for (int i = 0; i < 2; i++) {
            D0.H[] hArr = this.f31364n;
            int r9 = hArr[i].r();
            D0.H h9 = hArr[i];
            AbstractC3149eQ abstractC3149eQ = (AbstractC3149eQ) h9.f594e;
            Js js = this.f31341F;
            h9.i(abstractC3149eQ, js);
            AbstractC3149eQ abstractC3149eQ2 = (AbstractC3149eQ) h9.f595f;
            if (abstractC3149eQ2 != null) {
                boolean z8 = (abstractC3149eQ2.f30355A == 0 || h9.f591b == 3) ? false : true;
                h9.i(abstractC3149eQ2, js);
                h9.j(false);
                if (z8) {
                    abstractC3149eQ2.getClass();
                    abstractC3149eQ2.c(17, (AbstractC3149eQ) h9.f594e);
                }
            }
            h9.f591b = 0;
            m(i, false);
            this.f31377w0 -= r9;
        }
        this.f31342F0 = com.anythink.basead.exoplayer.b.f6539b;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a A[Catch: RuntimeException -> 0x0044, TryCatch #1 {RuntimeException -> 0x0044, blocks: (B:38:0x0035, B:18:0x0040, B:16:0x003a, B:30:0x0047), top: B:37:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0035 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C() {
        boolean z8;
        AbstractC3149eQ abstractC3149eQ;
        if (!this.f31355Q || !V()) {
            return;
        }
        int i = 0;
        while (true) {
            int i4 = 2;
            if (i >= 2) {
                this.f31342F0 = com.anythink.basead.exoplayer.b.f6539b;
                return;
            }
            D0.H h9 = this.f31364n[i];
            int r9 = h9.r();
            Js js = this.f31341F;
            if (h9.q()) {
                int i9 = h9.f591b;
                if (i9 == 4) {
                    i4 = i9;
                } else if (i9 != 2) {
                    i4 = i9;
                    z8 = false;
                    if (z8) {
                        abstractC3149eQ = (AbstractC3149eQ) h9.f595f;
                        if (abstractC3149eQ == null) {
                            throw null;
                        }
                        h9.i(abstractC3149eQ, js);
                        h9.j(z8);
                        h9.f591b = i4 != 4 ? 0 : 1;
                    } else {
                        try {
                            abstractC3149eQ = (AbstractC3149eQ) h9.f594e;
                            h9.i(abstractC3149eQ, js);
                        } catch (RuntimeException e6) {
                            AbstractC3217fl.X("RendererHolder", "Disable prewarming failed.", e6);
                        }
                        try {
                            h9.j(z8);
                        } catch (RuntimeException e9) {
                            AbstractC3217fl.X("RendererHolder", "Reset prewarming failed.", e9);
                        }
                        h9.f591b = i4 != 4 ? 0 : 1;
                    }
                }
                z8 = true;
                if (z8) {
                }
            }
            this.f31377w0 -= r9 - h9.r();
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
        int i9;
        Js js = this.f31341F;
        float f6 = js.h().f34712a;
        C3848rO c3848rO = this.J;
        C3741pO c3741pO = c3848rO.f34029h;
        C3741pO c3741pO2 = c3848rO.i;
        C3877s c3877s = null;
        C3741pO c3741pO3 = c3741pO;
        boolean z8 = true;
        while (c3741pO3 != null && c3741pO3.f33389e) {
            C3877s f9 = c3741pO3.f(this.Y.f35530a);
            C3877s c3877s2 = c3741pO3 == c3848rO.f34029h ? f9 : c3877s;
            C3877s c3877s3 = c3741pO3.f33398o;
            boolean z9 = false;
            if (c3877s3 != null) {
                InterfaceC3716p[] interfaceC3716pArr = (InterfaceC3716p[]) f9.f34151v;
                if (((InterfaceC3716p[]) c3877s3.f34151v).length == interfaceC3716pArr.length) {
                    for (int i10 = 0; i10 < interfaceC3716pArr.length; i10++) {
                        if (f9.d(c3877s3, i10)) {
                        }
                    }
                    if (c3741pO3 != c3741pO2) {
                        z9 = true;
                    }
                    z8 &= z9;
                    c3741pO3 = c3741pO3.f33396m;
                    c3877s = c3877s2;
                }
            }
            if (z8) {
                C3741pO c3741pO4 = c3848rO.f34029h;
                int y6 = c3848rO.y(c3741pO4) & 1;
                D0.H[] hArr = this.f31364n;
                boolean[] zArr = new boolean[2];
                c3877s2.getClass();
                long g9 = c3741pO4.g(c3877s2, this.Y.f35546r, 1 == y6, zArr);
                C4280zO c4280zO = this.Y;
                boolean z10 = (c4280zO.f35534e == 4 || g9 == c4280zO.f35546r) ? false : true;
                C4280zO c4280zO2 = this.Y;
                boolean z11 = z10;
                i = 4;
                this.Y = N(c4280zO2.f35531b, g9, c4280zO2.f35532c, c4280zO2.f35533d, z11, 5);
                if (z11) {
                    s(g9, true);
                }
                C();
                boolean[] zArr2 = new boolean[2];
                int i11 = 0;
                for (int i12 = 2; i11 < i12; i12 = 2) {
                    int r9 = hArr[i11].r();
                    zArr2[i11] = hArr[i11].g();
                    D0.H h9 = hArr[i11];
                    VQ vq = c3741pO4.f33387c[i11];
                    long j9 = this.f31381y0;
                    boolean z12 = zArr[i11];
                    AbstractC3149eQ abstractC3149eQ = (AbstractC3149eQ) h9.f594e;
                    if (D0.H.l(abstractC3149eQ)) {
                        if (vq != abstractC3149eQ.f30357B) {
                            h9.i(abstractC3149eQ, js);
                        } else if (z12) {
                            abstractC3149eQ.M(j9, false, true);
                        }
                    }
                    AbstractC3149eQ abstractC3149eQ2 = (AbstractC3149eQ) h9.f595f;
                    if (abstractC3149eQ2 != null && D0.H.l(abstractC3149eQ2)) {
                        if (vq != abstractC3149eQ2.f30357B) {
                            h9.i(abstractC3149eQ2, js);
                        } else if (z12) {
                            abstractC3149eQ2.M(j9, false, true);
                        }
                    }
                    if (r9 - hArr[i11].r() > 0) {
                        m(i11, false);
                    }
                    this.f31377w0 -= r9 - hArr[i11].r();
                    i11++;
                }
                O(zArr2, this.f31381y0);
                c3741pO4.f33392h = true;
            } else {
                i = 4;
                c3848rO.y(c3741pO3);
                if (c3741pO3.f33389e) {
                    long max = Math.max(c3741pO3.f33391g.f33714b, this.f31381y0 - c3741pO3.f33399p);
                    if (this.f31355Q && V() && c3848rO.f34030j == c3741pO3) {
                        C();
                    }
                    i4 = 2;
                    i9 = 4;
                    c3741pO3.g(f9, max, false, new boolean[2]);
                    Q(true);
                    if (this.Y.f35534e == i9) {
                        L();
                        l();
                        this.f31382z.c(i4);
                        return;
                    }
                    return;
                }
            }
            i9 = i;
            i4 = 2;
            Q(true);
            if (this.Y.f35534e == i9) {
            }
        }
    }

    public final boolean E() {
        C3741pO c3741pO = this.J.f34029h;
        long j9 = c3741pO.f33391g.f33717e;
        if (c3741pO.f33389e) {
            return j9 == com.anythink.basead.exoplayer.b.f6539b || this.Y.f35546r < j9 || !T();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:229:0x0259, code lost:
    
        r4.f26111f.getClass();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x040c  */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(AbstractC3832r8 abstractC3832r8, boolean z8) {
        long j9;
        boolean z9;
        boolean z10;
        long j10;
        BQ bq;
        long j11;
        Object obj;
        boolean z11;
        AbstractC3832r8 abstractC3832r82;
        L7 l72;
        long j12;
        Object obj2;
        int i;
        ?? r12;
        boolean z12;
        long j13;
        AbstractC3832r8 abstractC3832r83;
        boolean z13;
        AbstractC3832r8 abstractC3832r84;
        long j14;
        AbstractC3832r8 abstractC3832r85;
        L7 l73;
        long j15;
        BQ E8;
        boolean equals;
        long j16;
        boolean z14;
        BQ bq2;
        boolean z15;
        Object obj3;
        boolean z16;
        boolean z17;
        boolean z18;
        AbstractC3832r8 abstractC3832r86;
        BQ bq3;
        ?? r122;
        AbstractC3832r8 abstractC3832r87;
        int i4;
        int i9;
        int[] iArr;
        int i10;
        long j17;
        long longValue;
        int i11;
        ?? r11;
        boolean z19;
        ?? r13;
        C3311hO c3311hO;
        AbstractC3832r8 abstractC3832r88;
        int i12;
        boolean z20;
        BQ bq4;
        Throwable th;
        long j18;
        long j19;
        AbstractC3832r8 abstractC3832r89;
        ?? r132;
        ?? r133;
        C3311hO c3311hO2;
        long j20;
        long j21;
        AbstractC3832r8 abstractC3832r810;
        C3311hO c3311hO3;
        boolean z21;
        C4280zO c4280zO = this.Y;
        C3311hO c3311hO4 = this.f31379x0;
        L7 l74 = this.f31337D;
        int i13 = this.f31371t0;
        boolean z22 = this.f31373u0;
        int i14 = 4;
        long j22 = 0;
        if (abstractC3832r8.g()) {
            BQ bq5 = C4280zO.f35529t;
            BQ bq6 = c4280zO.f35531b;
            boolean z23 = (bq5.equals(bq6) && c4280zO.f35546r == 0) ? false : true;
            if (z23 && z8) {
                AbstractC3832r8 abstractC3832r811 = c4280zO.f35530a;
                if (!abstractC3832r811.g() && !abstractC3832r811.o(bq6.f24043a, l74).f26110e) {
                    z21 = true;
                    z17 = z21;
                    bq3 = bq5;
                    r122 = z23;
                    j16 = 0;
                    z18 = false;
                    abstractC3832r86 = null;
                    j9 = com.anythink.basead.exoplayer.b.f6539b;
                    j11 = com.anythink.basead.exoplayer.b.f6539b;
                    z12 = true;
                    abstractC3832r85 = abstractC3832r8;
                }
            }
            z21 = false;
            z17 = z21;
            bq3 = bq5;
            r122 = z23;
            j16 = 0;
            z18 = false;
            abstractC3832r86 = null;
            j9 = com.anythink.basead.exoplayer.b.f6539b;
            j11 = com.anythink.basead.exoplayer.b.f6539b;
            z12 = true;
            abstractC3832r85 = abstractC3832r8;
        } else {
            BQ bq7 = c4280zO.f35531b;
            Object obj4 = bq7.f24043a;
            AbstractC3832r8 abstractC3832r812 = c4280zO.f35530a;
            if (abstractC3832r812.g()) {
                j9 = com.anythink.basead.exoplayer.b.f6539b;
            } else {
                j9 = com.anythink.basead.exoplayer.b.f6539b;
                if (!abstractC3832r812.o(bq7.f24043a, l74).f26110e) {
                    z9 = false;
                    if (!bq7.b() || z9) {
                        z10 = z9;
                        j10 = c4280zO.f35532c;
                    } else {
                        z10 = z9;
                        j10 = c4280zO.f35546r;
                    }
                    Y7 y72 = this.f31336C;
                    if (c3311hO4 == null) {
                        bq = bq7;
                        obj = obj4;
                        l72 = l74;
                        Pair z24 = z(abstractC3832r8, c3311hO4, i13, z22, y72, l72);
                        if (z24 == null) {
                            i11 = abstractC3832r8.k(z22);
                            obj2 = obj;
                            longValue = j10;
                            j17 = longValue;
                            r11 = false;
                            z19 = false;
                            z12 = true;
                        } else {
                            j17 = j10;
                            if (c3311hO4.f31233c == j9) {
                                i11 = abstractC3832r8.o(z24.first, l72).f26108c;
                                obj2 = obj;
                                longValue = j17;
                                r11 = false;
                            } else {
                                Object obj5 = z24.first;
                                longValue = ((Long) z24.second).longValue();
                                obj2 = obj5;
                                i11 = -1;
                                r11 = true;
                            }
                            z19 = c4280zO.f35534e == 4;
                            z12 = false;
                        }
                        boolean z25 = z19;
                        abstractC3832r84 = r11;
                        z11 = z25;
                        long j23 = longValue;
                        abstractC3832r82 = abstractC3832r8;
                        i = i11;
                        j12 = j17;
                        j11 = j23;
                    } else {
                        bq = bq7;
                        j11 = j10;
                        obj = obj4;
                        AbstractC3832r8 abstractC3832r813 = abstractC3832r8;
                        AbstractC3832r8 abstractC3832r814 = c4280zO.f35530a;
                        if (abstractC3832r814.g()) {
                            l72 = l74;
                            i = abstractC3832r813.k(z22);
                            obj2 = obj;
                            z11 = false;
                            abstractC3832r83 = null;
                            z12 = false;
                        } else if (abstractC3832r813.e(obj) == -1) {
                            z11 = false;
                            int W8 = W(y72, l74, i13, z22, obj, abstractC3832r814, abstractC3832r813);
                            y72 = y72;
                            abstractC3832r813 = abstractC3832r813;
                            obj = obj;
                            if (W8 == -1) {
                                W8 = abstractC3832r813.k(z22);
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            l72 = l74;
                            z12 = z13;
                            obj2 = obj;
                            abstractC3832r83 = null;
                            i = W8;
                        } else {
                            z11 = false;
                            if (j11 == j9) {
                                l72 = l74;
                                i = abstractC3832r813.o(obj, l74).f26108c;
                                obj2 = obj;
                                abstractC3832r83 = null;
                                z12 = false;
                            } else {
                                if (z10) {
                                    abstractC3832r814.o(obj, l74);
                                    if (abstractC3832r814.b(l74.f26108c, y72, 0L).f28803k == abstractC3832r814.e(obj)) {
                                        Pair m8 = abstractC3832r813.m(y72, l74, abstractC3832r813.o(obj, l74).f26108c, j11);
                                        abstractC3832r82 = abstractC3832r813;
                                        y72 = y72;
                                        l72 = l74;
                                        j12 = j11;
                                        obj2 = m8.first;
                                        j13 = ((Long) m8.second).longValue();
                                    } else {
                                        abstractC3832r82 = abstractC3832r813;
                                        l72 = l74;
                                        j12 = j11;
                                        if (abstractC3832r82.o(obj, l72).f26109d != j9) {
                                            long j24 = l72.f26109d - 1;
                                            String str = AbstractC3548lu.f32613a;
                                            j13 = Math.max(0L, Math.min(j12, j24));
                                        } else {
                                            j13 = j12;
                                        }
                                        obj2 = obj;
                                    }
                                    j11 = j13;
                                    i = -1;
                                    z11 = false;
                                    r12 = 1;
                                } else {
                                    abstractC3832r82 = abstractC3832r813;
                                    l72 = l74;
                                    j12 = j11;
                                    obj2 = obj;
                                    i = -1;
                                    z11 = false;
                                    r12 = 0;
                                }
                                z12 = false;
                                abstractC3832r84 = r12;
                            }
                        }
                        abstractC3832r82 = abstractC3832r813;
                        j12 = j11;
                        abstractC3832r84 = abstractC3832r83;
                    }
                    if (i == -1) {
                        j14 = j12;
                        l73 = l72;
                        abstractC3832r85 = abstractC3832r8;
                        Pair m9 = abstractC3832r85.m(y72, l73, i, com.anythink.basead.exoplayer.b.f6539b);
                        obj2 = m9.first;
                        j15 = ((Long) m9.second).longValue();
                        j11 = j9;
                    } else {
                        j14 = j12;
                        abstractC3832r85 = abstractC3832r82;
                        l73 = l72;
                        j15 = j11;
                    }
                    E8 = this.J.E(abstractC3832r85, obj2);
                    equals = obj.equals(obj2);
                    if (equals || bq.b() || E8.b()) {
                        j16 = 0;
                        z14 = false;
                    } else {
                        j16 = 0;
                        z14 = true;
                    }
                    L7 o9 = abstractC3832r85.o(obj2, l73);
                    if (z10 && j14 == j11 && obj.equals(E8.f24043a)) {
                        if (bq.b()) {
                            bq2 = bq;
                            o9.c(bq2.f24044b);
                        } else {
                            bq2 = bq;
                        }
                        if (E8.b()) {
                            o9.c(-1);
                        }
                    } else {
                        bq2 = bq;
                    }
                    if (true == z14) {
                        E8 = bq2;
                    }
                    if (E8.b()) {
                        if (equals && bq2.b()) {
                            C2904a a9 = abstractC3832r85.o(obj2, l73).f26111f.a(bq2.f24044b);
                            a9.getClass();
                            long j25 = c4280zO.f35532c;
                            if (j25 == j9 || j25 < j16) {
                                int i15 = a9.f29138a;
                                int i16 = bq2.f24045c;
                                if (i15 > i16 && a9.f29141d[i16] == 2) {
                                    long j26 = abstractC3832r85.o(obj2, l73).f26109d;
                                    if (j26 != j9) {
                                        j15 = Math.min(j26 - 1, j15);
                                    }
                                    j11 = j15;
                                }
                            }
                        }
                    } else if (E8.equals(bq2)) {
                        j15 = c4280zO.f35546r;
                    } else {
                        abstractC3832r85.o(E8.f24043a, l73);
                        int i17 = E8.f24045c;
                        C2904a a10 = l73.f26111f.a(E8.f24044b);
                        int i18 = 0;
                        while (true) {
                            int[] iArr2 = a10.f29141d;
                            if (i18 >= iArr2.length || (i10 = iArr2[i18]) == 0 || i10 == 1) {
                                break;
                            } else {
                                i18++;
                            }
                        }
                        j15 = j16;
                    }
                    z15 = E8.equals(bq2) || j15 != c4280zO.f35546r;
                    i14 = abstractC3832r85.e(obj) != -1 ? 4 : 3;
                    obj3 = E8.f24043a;
                    if (obj3.equals(obj) && (i4 = E8.f24044b) != -1) {
                        C2904a a11 = abstractC3832r85.o(obj3, l73).f26111f.a(i4);
                        i9 = E8.f24045c;
                        iArr = a11.f29141d;
                        if (i9 < iArr.length || iArr[i9] != 2) {
                            i14 = 0;
                        }
                    }
                    if (z15 && z8) {
                        abstractC3832r87 = c4280zO.f35530a;
                        if (!abstractC3832r87.g() && !abstractC3832r87.o(obj, l73).f26110e) {
                            z16 = true;
                            j22 = j15;
                            z17 = z16;
                            z18 = z11;
                            abstractC3832r86 = abstractC3832r84;
                            bq3 = E8;
                            r122 = z15;
                        }
                    }
                    z16 = false;
                    j22 = j15;
                    z17 = z16;
                    z18 = z11;
                    abstractC3832r86 = abstractC3832r84;
                    bq3 = E8;
                    r122 = z15;
                }
            }
            z9 = true;
            if (bq7.b()) {
            }
            z10 = z9;
            j10 = c4280zO.f35532c;
            Y7 y722 = this.f31336C;
            if (c3311hO4 == null) {
            }
            if (i == -1) {
            }
            E8 = this.J.E(abstractC3832r85, obj2);
            equals = obj.equals(obj2);
            if (equals) {
            }
            j16 = 0;
            z14 = false;
            L7 o92 = abstractC3832r85.o(obj2, l73);
            if (z10) {
            }
            bq2 = bq;
            if (true == z14) {
            }
            if (E8.b()) {
            }
            if (E8.equals(bq2)) {
            }
            if (abstractC3832r85.e(obj) != -1) {
            }
            obj3 = E8.f24043a;
            if (obj3.equals(obj)) {
                C2904a a112 = abstractC3832r85.o(obj3, l73).f26111f.a(i4);
                i9 = E8.f24045c;
                iArr = a112.f29141d;
                if (i9 < iArr.length) {
                }
                i14 = 0;
            }
            if (z15) {
                abstractC3832r87 = c4280zO.f35530a;
                if (!abstractC3832r87.g()) {
                    z16 = true;
                    j22 = j15;
                    z17 = z16;
                    z18 = z11;
                    abstractC3832r86 = abstractC3832r84;
                    bq3 = E8;
                    r122 = z15;
                }
            }
            z16 = false;
            j22 = j15;
            z17 = z16;
            z18 = z11;
            abstractC3832r86 = abstractC3832r84;
            bq3 = E8;
            r122 = z15;
        }
        int i19 = i14;
        if (z12) {
            try {
                if (this.Y.f35534e != 1) {
                    c(4);
                }
                v(false, false, false, true);
            } catch (Throwable th2) {
                th = th2;
                BQ bq8 = bq3;
                abstractC3832r88 = abstractC3832r85;
                bq4 = bq8;
                abstractC3832r89 = abstractC3832r86;
                z20 = z17;
                z8 = r122;
                i12 = i19;
                c3311hO = null;
                r13 = abstractC3832r89;
                C4280zO c4280zO2 = this.Y;
                AbstractC3832r8 abstractC3832r815 = c4280zO2.f35530a;
                BQ bq9 = c4280zO2.f35531b;
                BQ bq10 = bq4;
                G(abstractC3832r88, bq10, abstractC3832r815, bq9, 1 == r13 ? j9 : j22, false);
                if (!z8) {
                }
                if (z20) {
                }
                this.Y = N(bq10, j19, j11, j18, z20, i12);
                J();
                x(abstractC3832r88, this.Y.f35530a);
                this.Y = this.Y.c(abstractC3832r88);
                if (!abstractC3832r88.g()) {
                }
                Q(false);
                this.f31382z.c(2);
                throw th;
            }
        }
        D0.H[] hArr = this.f31364n;
        int i20 = 0;
        while (true) {
            r132 = 2;
            if (i20 < 2) {
                D0.H h9 = hArr[i20];
                AbstractC3149eQ abstractC3149eQ = (AbstractC3149eQ) h9.f594e;
                if (!Objects.equals(abstractC3149eQ.f30370I, abstractC3832r85)) {
                    abstractC3149eQ.f30370I = abstractC3832r85;
                    abstractC3149eQ.O();
                    abstractC3149eQ.n0();
                }
                AbstractC3149eQ abstractC3149eQ2 = (AbstractC3149eQ) h9.f595f;
                if (abstractC3149eQ2 != null && !Objects.equals(abstractC3149eQ2.f30370I, abstractC3832r85)) {
                    abstractC3149eQ2.f30370I = abstractC3832r85;
                    abstractC3149eQ2.O();
                    abstractC3149eQ2.n0();
                }
                i20++;
            } else {
                try {
                    break;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }
        if (r122 == 0) {
            try {
                C3848rO c3848rO = this.J;
                C3741pO c3741pO = c3848rO.i;
                long H6 = c3741pO == null ? j16 : H(c3741pO);
                if (V()) {
                    try {
                        C3741pO c3741pO2 = c3848rO.f34030j;
                        if (c3741pO2 != null) {
                            j16 = H(c3741pO2);
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        abstractC3832r89 = abstractC3832r86;
                        z20 = z17;
                        bq4 = bq3;
                        z8 = r122;
                        i12 = i19;
                        abstractC3832r88 = abstractC3832r8;
                        c3311hO = null;
                        r13 = abstractC3832r89;
                        C4280zO c4280zO22 = this.Y;
                        AbstractC3832r8 abstractC3832r8152 = c4280zO22.f35530a;
                        BQ bq92 = c4280zO22.f35531b;
                        BQ bq102 = bq4;
                        G(abstractC3832r88, bq102, abstractC3832r8152, bq92, 1 == r13 ? j9 : j22, false);
                        if (!z8) {
                        }
                        if (z20) {
                        }
                        this.Y = N(bq102, j19, j11, j18, z20, i12);
                        J();
                        x(abstractC3832r88, this.Y.f35530a);
                        this.Y = this.Y.c(abstractC3832r88);
                        if (!abstractC3832r88.g()) {
                        }
                        Q(false);
                        this.f31382z.c(2);
                        throw th;
                    }
                }
                r132 = abstractC3832r86;
                z8 = r122;
                r122 = 0;
                try {
                    int C7 = c3848rO.C(abstractC3832r8, this.f31381y0, H6, j16);
                    if ((C7 & 1) != 0) {
                        h(false);
                        c3311hO3 = r122;
                        abstractC3832r810 = r132;
                    } else {
                        c3311hO3 = r122;
                        abstractC3832r810 = r132;
                        if ((C7 & 2) != 0) {
                            C();
                            c3311hO3 = r122;
                            abstractC3832r810 = r132;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    abstractC3832r86 = abstractC3832r8;
                    z20 = z17;
                    bq4 = bq3;
                    i12 = i19;
                    abstractC3832r88 = abstractC3832r86;
                    c3311hO = r122;
                    r13 = r132;
                    C4280zO c4280zO222 = this.Y;
                    AbstractC3832r8 abstractC3832r81522 = c4280zO222.f35530a;
                    BQ bq922 = c4280zO222.f35531b;
                    BQ bq1022 = bq4;
                    G(abstractC3832r88, bq1022, abstractC3832r81522, bq922, 1 == r13 ? j9 : j22, false);
                    if (!z8 || j11 != this.Y.f35532c) {
                        if (z20) {
                            j18 = this.Y.f35533d;
                            j19 = j22;
                        } else {
                            j19 = j22;
                            j18 = j19;
                        }
                        this.Y = N(bq1022, j19, j11, j18, z20, i12);
                    }
                    J();
                    x(abstractC3832r88, this.Y.f35530a);
                    this.Y = this.Y.c(abstractC3832r88);
                    if (!abstractC3832r88.g()) {
                        this.f31379x0 = c3311hO;
                    }
                    Q(false);
                    this.f31382z.c(2);
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                r132 = abstractC3832r86;
                z8 = r122;
                abstractC3832r86 = abstractC3832r8;
                r122 = 0;
            }
        } else {
            AbstractC3832r8 abstractC3832r816 = abstractC3832r86;
            z8 = r122;
            AbstractC3832r8 abstractC3832r817 = abstractC3832r85;
            C3311hO c3311hO5 = null;
            c3311hO3 = c3311hO5;
            abstractC3832r810 = abstractC3832r816;
            if (!abstractC3832r817.g()) {
                try {
                    C3848rO c3848rO2 = this.J;
                    for (C3741pO c3741pO3 = c3848rO2.f34029h; c3741pO3 != null; c3741pO3 = c3741pO3.f33396m) {
                        if (c3741pO3.f33391g.f33713a.equals(bq3)) {
                            c3741pO3.f33391g = c3848rO2.D(abstractC3832r817, c3741pO3.f33391g);
                        }
                    }
                    C3848rO c3848rO3 = this.J;
                    bq4 = bq3;
                    long j27 = j22;
                    try {
                        j22 = r(bq4, j27, c3848rO3.f34029h != c3848rO3.i, z18);
                        c3311hO2 = c3311hO5;
                        r133 = abstractC3832r816;
                        C4280zO c4280zO3 = this.Y;
                        BQ bq11 = bq4;
                        G(abstractC3832r8, bq11, c4280zO3.f35530a, c4280zO3.f35531b, 1 == r133 ? j9 : j22, false);
                        if (!z8 || j11 != this.Y.f35532c) {
                            if (z17) {
                                j20 = this.Y.f35533d;
                                j21 = j22;
                            } else {
                                j21 = j22;
                                j20 = j21;
                            }
                            this.Y = N(bq11, j21, j11, j20, z17, i19);
                        }
                        J();
                        x(abstractC3832r8, this.Y.f35530a);
                        this.Y = this.Y.c(abstractC3832r8);
                        if (!abstractC3832r8.g()) {
                            this.f31379x0 = c3311hO2;
                        }
                        Q(false);
                        this.f31382z.c(2);
                    } catch (Throwable th7) {
                        th = th7;
                        j22 = j27;
                        abstractC3832r88 = abstractC3832r817;
                        z20 = z17;
                        i12 = i19;
                        c3311hO = c3311hO5;
                        r13 = abstractC3832r816;
                        C4280zO c4280zO2222 = this.Y;
                        AbstractC3832r8 abstractC3832r815222 = c4280zO2222.f35530a;
                        BQ bq9222 = c4280zO2222.f35531b;
                        BQ bq10222 = bq4;
                        G(abstractC3832r88, bq10222, abstractC3832r815222, bq9222, 1 == r13 ? j9 : j22, false);
                        if (!z8) {
                        }
                        if (z20) {
                        }
                        this.Y = N(bq10222, j19, j11, j18, z20, i12);
                        J();
                        x(abstractC3832r88, this.Y.f35530a);
                        this.Y = this.Y.c(abstractC3832r88);
                        if (!abstractC3832r88.g()) {
                        }
                        Q(false);
                        this.f31382z.c(2);
                        throw th;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    bq4 = bq3;
                }
            }
        }
        bq4 = bq3;
        c3311hO2 = c3311hO3;
        r133 = abstractC3832r810;
        C4280zO c4280zO32 = this.Y;
        BQ bq112 = bq4;
        G(abstractC3832r8, bq112, c4280zO32.f35530a, c4280zO32.f35531b, 1 == r133 ? j9 : j22, false);
        if (!z8) {
        }
        if (z17) {
        }
        this.Y = N(bq112, j21, j11, j20, z17, i19);
        J();
        x(abstractC3832r8, this.Y.f35530a);
        this.Y = this.Y.c(abstractC3832r8);
        if (!abstractC3832r8.g()) {
        }
        Q(false);
        this.f31382z.c(2);
    }

    public final void G(AbstractC3832r8 abstractC3832r8, BQ bq, AbstractC3832r8 abstractC3832r82, BQ bq2, long j9, boolean z8) {
        if (!o(abstractC3832r8, bq)) {
            C4045v5 c4045v5 = bq.b() ? C4045v5.f34711d : this.Y.f35543o;
            Js js = this.f31341F;
            if (js.h().equals(c4045v5)) {
                return;
            }
            this.f31382z.d(16);
            js.b(c4045v5);
            K(this.Y.f35543o, c4045v5.f34712a, false, false);
            return;
        }
        Object obj = bq.f24043a;
        L7 l72 = this.f31337D;
        int i = abstractC3832r8.o(obj, l72).f26108c;
        Y7 y72 = this.f31336C;
        abstractC3832r8.b(i, y72, 0L);
        C4256z0 c4256z0 = y72.f28801h;
        String str = AbstractC3548lu.f32613a;
        NN nn = this.f31348I0;
        nn.getClass();
        c4256z0.getClass();
        long u7 = AbstractC3548lu.u(com.anythink.basead.exoplayer.b.f6539b);
        nn.f26529c = u7;
        nn.f26532f = u7;
        nn.f26533g = u7;
        nn.c();
        if (j9 != com.anythink.basead.exoplayer.b.f6539b) {
            nn.f26530d = n(abstractC3832r8, obj, j9);
            nn.c();
            return;
        }
        if (!Objects.equals(!abstractC3832r82.g() ? abstractC3832r82.b(abstractC3832r82.o(bq2.f24043a, l72).f26108c, y72, 0L).f28794a : null, y72.f28794a) || z8) {
            nn.f26530d = com.anythink.basead.exoplayer.b.f6539b;
            nn.c();
        }
    }

    public final long H(C3741pO c3741pO) {
        if (c3741pO == null) {
            return 0L;
        }
        long j9 = c3741pO.f33399p;
        if (c3741pO.f33389e) {
            for (int i = 0; i < 2; i++) {
                D0.H[] hArr = this.f31364n;
                if (hArr[i].m(c3741pO) != null) {
                    AbstractC3149eQ m8 = hArr[i].m(c3741pO);
                    Objects.requireNonNull(m8);
                    long j10 = m8.f30364F;
                    if (j10 == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    j9 = Math.max(j10, j9);
                }
            }
        }
        return j9;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I() {
        boolean z8;
        C3848rO c3848rO = this.J;
        c3848rO.z();
        C3741pO c3741pO = c3848rO.f34032l;
        if (c3741pO != null) {
            if (!c3741pO.f33388d || c3741pO.f33389e) {
                C4012uQ c4012uQ = c3741pO.f33385a;
                if (c4012uQ.c()) {
                    return;
                }
                AbstractC3832r8 abstractC3832r8 = this.Y.f35530a;
                if (c3741pO.f33389e) {
                    c4012uQ.d();
                }
                if (this.f31380y.h()) {
                    if (!c3741pO.f33388d) {
                        C3795qO c3795qO = c3741pO.f33391g;
                        c3741pO.f33388d = true;
                        c4012uQ.g(this, c3795qO.f33714b);
                        return;
                    }
                    C3579mO c3579mO = new C3579mO();
                    c3579mO.f32691a = this.f31381y0 - c3741pO.f33399p;
                    float f6 = this.f31341F.h().f34712a;
                    PA.n(f6 > 0.0f || f6 == -3.4028235E38f);
                    c3579mO.f32692b = f6;
                    long j9 = this.f31369r0;
                    if (j9 < 0) {
                        if (j9 != com.anythink.basead.exoplayer.b.f6539b) {
                            z8 = false;
                            PA.n(z8);
                            c3579mO.f32693c = j9;
                            C3633nO c3633nO = new C3633nO(c3579mO);
                            PA.T(c3741pO.f33396m == null);
                            c4012uQ.b(c3633nO);
                        }
                        j9 = -9223372036854775807L;
                    }
                    z8 = true;
                    PA.n(z8);
                    c3579mO.f32693c = j9;
                    C3633nO c3633nO2 = new C3633nO(c3579mO);
                    PA.T(c3741pO.f33396m == null);
                    c4012uQ.b(c3633nO2);
                }
            }
        }
    }

    public final void J() {
        C3741pO c3741pO = this.J.f34029h;
        boolean z8 = false;
        if (c3741pO != null && c3741pO.f33391g.f33719g && this.f31366o0) {
            z8 = true;
        }
        this.f31367p0 = z8;
    }

    public final void K(C4045v5 c4045v5, float f6, boolean z8, boolean z9) {
        int i;
        if (z8) {
            if (z9) {
                this.f31363Z.f(1);
            }
            C4280zO c4280zO = this.Y;
            this.Y = new C4280zO(c4280zO.f35530a, c4280zO.f35531b, c4280zO.f35532c, c4280zO.f35533d, c4280zO.f35534e, c4280zO.f35535f, c4280zO.f35536g, c4280zO.f35537h, c4280zO.i, c4280zO.f35538j, c4280zO.f35539k, c4280zO.f35540l, c4280zO.f35541m, c4280zO.f35542n, c4045v5, c4280zO.f35544p, c4280zO.f35545q, c4280zO.f35546r, c4280zO.f35547s);
        }
        float f9 = c4045v5.f34712a;
        C3741pO c3741pO = this.J.f34029h;
        while (true) {
            i = 0;
            if (c3741pO == null) {
                break;
            }
            InterfaceC3716p[] interfaceC3716pArr = (InterfaceC3716p[]) c3741pO.f33398o.f34151v;
            int length = interfaceC3716pArr.length;
            while (i < length) {
                InterfaceC3716p interfaceC3716p = interfaceC3716pArr[i];
                i++;
            }
            c3741pO = c3741pO.f33396m;
        }
        D0.H[] hArr = this.f31364n;
        while (i < 2) {
            D0.H h9 = hArr[i];
            ((AbstractC3149eQ) h9.f594e).q(f6, f9);
            AbstractC3149eQ abstractC3149eQ = (AbstractC3149eQ) h9.f595f;
            if (abstractC3149eQ != null) {
                abstractC3149eQ.q(f6, f9);
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L() {
        boolean g9;
        boolean z8;
        C3848rO c3848rO = this.J;
        boolean A8 = A(c3848rO.f34031k);
        long j9 = com.anythink.basead.exoplayer.b.f6539b;
        if (A8) {
            C3741pO c3741pO = c3848rO.f34031k;
            long R8 = R(!c3741pO.f33389e ? 0L : c3741pO.f33385a.i());
            long j10 = o(this.Y.f35530a, c3741pO.f33391g.f33713a) ? this.f31348I0.f26534h : -9223372036854775807L;
            VO vo = this.f31351M;
            AbstractC3832r8 abstractC3832r8 = this.Y.f35530a;
            BQ bq = c3741pO.f33391g.f33713a;
            float f6 = this.f31341F.h().f34712a;
            boolean z9 = this.Y.f35540l;
            C3417jO c3417jO = new C3417jO(vo, abstractC3832r8, bq, R8, f6, this.f31368q0, j10);
            InterfaceC3525lO interfaceC3525lO = this.f31380y;
            g9 = interfaceC3525lO.g(c3417jO);
            C3741pO c3741pO2 = c3848rO.f34029h;
            if (!g9 && c3741pO2.f33389e && R8 < 500000 && this.f31339E > 0) {
                c3741pO2.f33385a.l(this.Y.f35546r);
                g9 = interfaceC3525lO.g(c3417jO);
            }
        } else {
            g9 = false;
        }
        this.f31370s0 = g9;
        if (g9) {
            C3741pO c3741pO3 = c3848rO.f34031k;
            c3741pO3.getClass();
            C3579mO c3579mO = new C3579mO();
            c3579mO.f32691a = this.f31381y0 - c3741pO3.f33399p;
            float f9 = this.f31341F.h().f34712a;
            PA.n(f9 > 0.0f || f9 == -3.4028235E38f);
            c3579mO.f32692b = f9;
            long j11 = this.f31369r0;
            if (j11 >= 0) {
                j9 = j11;
            } else if (j11 != com.anythink.basead.exoplayer.b.f6539b) {
                z8 = false;
                j9 = j11;
                PA.n(z8);
                c3579mO.f32693c = j9;
                C3633nO c3633nO = new C3633nO(c3579mO);
                PA.T(c3741pO3.f33396m == null);
                c3741pO3.f33385a.b(c3633nO);
            }
            z8 = true;
            PA.n(z8);
            c3579mO.f32693c = j9;
            C3633nO c3633nO2 = new C3633nO(c3579mO);
            PA.T(c3741pO3.f33396m == null);
            c3741pO3.f33385a.b(c3633nO2);
        }
        M();
    }

    public final void M() {
        C3741pO c3741pO = this.J.f34031k;
        boolean z8 = true;
        if (!this.f31370s0 && (c3741pO == null || !c3741pO.f33385a.c())) {
            z8 = false;
        }
        C4280zO c4280zO = this.Y;
        if (z8 != c4280zO.f35536g) {
            this.Y = c4280zO.f(z8);
        }
    }

    public final C4280zO N(BQ bq, long j9, long j10, long j11, boolean z8, int i) {
        C3041cR c3041cR;
        C3877s c3877s;
        List list;
        C3675oC c3675oC;
        int i4;
        this.f31335B0 = (!this.f31335B0 && j9 == this.Y.f35546r && bq.equals(this.Y.f35531b)) ? false : true;
        J();
        C4280zO c4280zO = this.Y;
        C3041cR c3041cR2 = c4280zO.f35537h;
        C3877s c3877s2 = c4280zO.i;
        List list2 = c4280zO.f35538j;
        if (this.f31349K.f449n) {
            C3848rO c3848rO = this.J;
            C3741pO c3741pO = c3848rO.f34029h;
            C3041cR c3041cR3 = c3741pO == null ? C3041cR.f29709d : c3741pO.f33397n;
            C3877s c3877s3 = c3741pO == null ? this.f31378x : c3741pO.f33398o;
            InterfaceC3716p[] interfaceC3716pArr = (InterfaceC3716p[]) c3877s3.f34151v;
            RB rb = new RB(4);
            boolean z9 = false;
            for (InterfaceC3716p interfaceC3716p : interfaceC3716pArr) {
                if (interfaceC3716p != null) {
                    R3 r32 = interfaceC3716p.t(0).f27773l;
                    if (r32 == null) {
                        rb.a(new R3(new InterfaceC4043v3[0]));
                    } else {
                        rb.a(r32);
                        z9 = true;
                    }
                }
            }
            if (z9) {
                c3675oC = rb.f();
            } else {
                SB sb = UB.f27942u;
                c3675oC = C3675oC.f33115x;
            }
            if (c3741pO != null) {
                C3795qO c3795qO = c3741pO.f33391g;
                long j12 = c3795qO.f33716d;
                if (j12 != j10) {
                    if (j10 != j12) {
                        c3795qO = new C3795qO(c3795qO.f33713a, c3795qO.f33714b, c3795qO.f33715c, j10, c3795qO.f33717e, c3795qO.f33718f, c3795qO.f33719g, c3795qO.f33720h);
                    }
                    c3741pO.f33391g = c3795qO;
                }
            }
            C3741pO c3741pO2 = c3848rO.f34029h;
            if (c3741pO2 == c3848rO.i && c3741pO2 != null) {
                C3877s c3877s4 = c3741pO2.f33398o;
                int i9 = 0;
                while (true) {
                    D0.H[] hArr = this.f31364n;
                    if (i9 >= 2) {
                        break;
                    }
                    if (c3877s4.b(i9)) {
                        i4 = 1;
                        if (((AbstractC3149eQ) hArr[i9].f594e).f30422u != 1) {
                            break;
                        }
                        ((FO[]) c3877s4.f34150u)[i9].getClass();
                    } else {
                        i4 = 1;
                    }
                    i9 += i4;
                }
            }
            c3041cR = c3041cR3;
            c3877s = c3877s3;
            list = c3675oC;
        } else {
            if (!bq.equals(c4280zO.f35531b)) {
                c3877s2 = this.f31378x;
                c3041cR2 = C3041cR.f29709d;
                list2 = C3675oC.f33115x;
            }
            c3041cR = c3041cR2;
            c3877s = c3877s2;
            list = list2;
        }
        if (z8) {
            C3990u4 c3990u4 = this.f31363Z;
            if (!c3990u4.f34531d || c3990u4.f34532e == 5) {
                c3990u4.f34529b = true;
                c3990u4.f34531d = true;
                c3990u4.f34532e = i;
            } else {
                PA.n(i == 5);
            }
        }
        C4280zO c4280zO2 = this.Y;
        return c4280zO2.b(bq, j9, j10, j11, R(c4280zO2.f35544p), c3041cR, c3877s, list);
    }

    public final void O(boolean[] zArr, long j9) {
        D0.H[] hArr;
        long j10;
        C3741pO c3741pO = this.J.i;
        C3877s c3877s = c3741pO.f33398o;
        int i = 0;
        while (true) {
            hArr = this.f31364n;
            if (i >= 2) {
                break;
            }
            if (!c3877s.b(i)) {
                hArr[i].b();
            }
            i++;
        }
        int i4 = 0;
        while (i4 < 2) {
            if (c3877s.b(i4) && hArr[i4].m(c3741pO) == null) {
                j10 = j9;
                P(c3741pO, i4, zArr[i4], j10);
            } else {
                j10 = j9;
            }
            i4++;
            j9 = j10;
        }
    }

    public final void P(C3741pO c3741pO, int i, boolean z8, long j9) {
        int i4;
        int i9;
        D0.H h9 = this.f31364n[i];
        if (h9.g()) {
            return;
        }
        boolean z9 = c3741pO == this.J.f34029h;
        C3877s c3877s = c3741pO.f33398o;
        FO fo = ((FO[]) c3877s.f34150u)[i];
        InterfaceC3716p interfaceC3716p = ((InterfaceC3716p[]) c3877s.f34151v)[i];
        boolean z10 = T() && this.Y.f35534e == 3;
        boolean z11 = !z8 && z10;
        this.f31377w0++;
        VQ vq = c3741pO.f33387c[i];
        long j10 = c3741pO.f33399p;
        C3795qO c3795qO = c3741pO.f33391g;
        if (interfaceC3716p != null) {
            i4 = interfaceC3716p.c();
            i9 = 0;
        } else {
            i4 = 0;
            i9 = 0;
        }
        TP[] tpArr = new TP[i4];
        while (i9 < i4) {
            interfaceC3716p.getClass();
            tpArr[i9] = interfaceC3716p.t(i9);
            i9++;
        }
        int i10 = h9.f591b;
        BQ bq = c3795qO.f33713a;
        Js js = this.f31341F;
        if (i10 == 0 || i10 == 2 || i10 == 4) {
            h9.f592c = true;
            AbstractC3149eQ abstractC3149eQ = (AbstractC3149eQ) h9.f594e;
            PA.T(abstractC3149eQ.f30355A == 0);
            abstractC3149eQ.f30426w = fo;
            abstractC3149eQ.J = bq;
            abstractC3149eQ.f30355A = 1;
            abstractC3149eQ.t0(z11, z9);
            abstractC3149eQ.p0(tpArr, vq, j9, j10, bq);
            abstractC3149eQ.M(j9, z11, true);
            js.c(abstractC3149eQ);
        } else {
            h9.f593d = true;
            AbstractC3149eQ abstractC3149eQ2 = (AbstractC3149eQ) h9.f595f;
            abstractC3149eQ2.getClass();
            PA.T(abstractC3149eQ2.f30355A == 0);
            abstractC3149eQ2.f30426w = fo;
            abstractC3149eQ2.J = bq;
            abstractC3149eQ2.f30355A = 1;
            abstractC3149eQ2.t0(z11, z9);
            abstractC3149eQ2.p0(tpArr, vq, j9, j10, bq);
            abstractC3149eQ2.M(j9, z11, true);
            js.c(abstractC3149eQ2);
        }
        C3147eO c3147eO = new C3147eO(this);
        AbstractC3149eQ m8 = h9.m(c3741pO);
        m8.getClass();
        m8.c(11, c3147eO);
        if (z10 && z9) {
            h9.D();
        }
    }

    public final void Q(boolean z8) {
        C3741pO c3741pO = this.J.f34031k;
        BQ bq = c3741pO == null ? this.Y.f35531b : c3741pO.f33391g.f33713a;
        boolean equals = this.Y.f35539k.equals(bq);
        if (!equals) {
            this.Y = this.Y.g(bq);
        }
        C4280zO c4280zO = this.Y;
        c4280zO.f35544p = c3741pO == null ? c4280zO.f35546r : c3741pO.d();
        C4280zO c4280zO2 = this.Y;
        c4280zO2.f35545q = R(c4280zO2.f35544p);
        if ((!equals || z8) && c3741pO != null && c3741pO.f33389e) {
            S(c3741pO.f33391g.f33713a, c3741pO.f33397n, c3741pO.f33398o);
        }
    }

    public final long R(long j9) {
        C3741pO c3741pO = this.J.f34031k;
        if (c3741pO == null) {
            return 0L;
        }
        return Math.max(0L, j9 - (this.f31381y0 - c3741pO.f33399p));
    }

    public final void S(BQ bq, C3041cR c3041cR, C3877s c3877s) {
        C3741pO c3741pO = this.J.f34031k;
        c3741pO.getClass();
        long R8 = R(c3741pO.d());
        long j9 = o(this.Y.f35530a, c3741pO.f33391g.f33713a) ? this.f31348I0.f26534h : com.anythink.basead.exoplayer.b.f6539b;
        AbstractC3832r8 abstractC3832r8 = this.Y.f35530a;
        float f6 = this.f31341F.h().f34712a;
        boolean z8 = this.Y.f35540l;
        this.f31380y.c(new C3417jO(this.f31351M, abstractC3832r8, bq, R8, f6, this.f31368q0, j9), (InterfaceC3716p[]) c3877s.f34151v);
    }

    public final boolean T() {
        C4280zO c4280zO = this.Y;
        return c4280zO.f35540l && c4280zO.f35542n == 0;
    }

    public final void U(int i) {
        D0.H h9 = this.f31364n[i];
        try {
            C3741pO c3741pO = this.J.f34029h;
            if (c3741pO == null) {
                throw null;
            }
            AbstractC3149eQ m8 = h9.m(c3741pO);
            m8.getClass();
            VQ vq = m8.f30357B;
            vq.getClass();
            vq.d();
        } catch (IOException | RuntimeException e6) {
            int i4 = ((AbstractC3149eQ) h9.f594e).f30422u;
            throw e6;
        }
    }

    public final boolean V() {
        if (!this.f31355Q) {
            return false;
        }
        for (int i = 0; i < 2; i++) {
            if (this.f31364n[i].q()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3233g0
    public final void a(long j9, long j10, TP tp, MediaFormat mediaFormat) {
        if (this.f31360V) {
            C3709ot c3709ot = this.f31382z;
            c3709ot.getClass();
            C3333ht g9 = C3709ot.g();
            g9.f31278a = c3709ot.f33230a.obtainMessage(37);
            g9.a();
        }
    }

    public final void b(IOException iOException, int i) {
        RN rn = new RN(0, iOException, i);
        C3741pO c3741pO = this.J.f34029h;
        if (c3741pO != null) {
            rn = rn.a(c3741pO.f33391g.f33713a);
        }
        AbstractC3217fl.X("ExoPlayerImplInternal", "Playback error", rn);
        u(false, false);
        this.Y = this.Y.e(rn);
    }

    public final void c(int i) {
        C4280zO c4280zO = this.Y;
        if (c4280zO.f35534e != i) {
            if (i != 2) {
                this.f31338D0 = com.anythink.basead.exoplayer.b.f6539b;
            }
            this.Y = c4280zO.d(i);
        }
    }

    public final void d(int i) {
        C3990u4 c3990u4 = this.f31363Z;
        C4280zO c4280zO = this.Y;
        boolean z8 = c3990u4.f34529b | (((C4280zO) c3990u4.f34533f) != c4280zO);
        c3990u4.f34529b = z8;
        c3990u4.f34533f = c4280zO;
        if (z8) {
            if (!c4280zO.f35530a.g()) {
                C4280zO c4280zO2 = this.Y;
                boolean z9 = c4280zO2.f35530a.e(c4280zO2.f35531b.f24043a) != -1;
                Locale locale = Locale.US;
                C4280zO c4280zO3 = this.Y;
                PA.U(String.format(locale, "periodUid %s not found in timeline %s with size %d triggered by msg %d", c4280zO3.f35531b.f24043a, c4280zO3.f35530a.getClass().getName(), Integer.valueOf(this.Y.f35530a.a()), Integer.valueOf(i)), z9);
            }
            Mt mt = this.f31347I;
            C3990u4 c3990u42 = this.f31363Z;
            C3093dO c3093dO = (C3093dO) mt.f26393u;
            c3093dO.getClass();
            c3093dO.f30007D.e(new RunnableC3329hp(22, c3093dO, c3990u42));
            this.f31363Z = new C3990u4(this.Y);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282zQ
    public final /* bridge */ /* synthetic */ void e(WQ wq) {
        this.f31382z.b(9, (AQ) wq).a();
    }

    public final void f(float f6) {
        this.f31346H0 = f6;
        float f9 = f6 * this.f31356R.f33424g;
        for (int i = 0; i < 2; i++) {
            D0.H h9 = this.f31364n[i];
            AbstractC3149eQ abstractC3149eQ = (AbstractC3149eQ) h9.f594e;
            if (abstractC3149eQ.f30422u == 1) {
                Float valueOf = Float.valueOf(f9);
                abstractC3149eQ.c(2, valueOf);
                AbstractC3149eQ abstractC3149eQ2 = (AbstractC3149eQ) h9.f595f;
                if (abstractC3149eQ2 != null) {
                    abstractC3149eQ2.c(2, valueOf);
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
    public final void g(int i, int i4, int i9, boolean z8) {
        boolean z9;
        C4280zO c4280zO;
        C3741pO c3741pO;
        if (z8) {
            if (i != -1) {
                z9 = true;
                if (i != -1) {
                    i9 = 2;
                } else if (i9 == 2) {
                    i9 = 1;
                }
                boolean z10 = this.f31359U;
                if (i != 0) {
                    i4 = 1;
                } else if (i4 == 1) {
                    i4 = z10 ? 4 : 0;
                }
                c4280zO = this.Y;
                if (c4280zO.f35540l != z9 && c4280zO.f35542n == i4 && c4280zO.f35541m == i9) {
                    return;
                }
                this.Y = c4280zO.h(i9, i4, z9);
                y(false, false);
                C3848rO c3848rO = this.J;
                for (c3741pO = c3848rO.f34029h; c3741pO != null; c3741pO = c3741pO.f33396m) {
                    for (InterfaceC3716p interfaceC3716p : (InterfaceC3716p[]) c3741pO.f33398o.f34151v) {
                    }
                }
                if (T()) {
                    j();
                    l();
                    this.Y.getClass();
                    c3848rO.n(this.f31381y0);
                    return;
                }
                int i10 = this.Y.f35534e;
                C3709ot c3709ot = this.f31382z;
                if (i10 != 3) {
                    if (i10 == 2) {
                        c3709ot.c(2);
                        return;
                    }
                    return;
                }
                Js js = this.f31341F;
                js.f25832u = true;
                JO jo = (JO) js.f25833v;
                if (!jo.f25764n) {
                    jo.f25766v = SystemClock.elapsedRealtime();
                    jo.f25764n = true;
                }
                i();
                c3709ot.c(2);
                return;
            }
            i = -1;
        }
        z9 = false;
        if (i != -1) {
        }
        boolean z102 = this.f31359U;
        if (i != 0) {
        }
        c4280zO = this.Y;
        if (c4280zO.f35540l != z9) {
        }
        this.Y = c4280zO.h(i9, i4, z9);
        y(false, false);
        C3848rO c3848rO2 = this.J;
        while (c3741pO != null) {
        }
        if (T()) {
        }
    }

    public final void h(boolean z8) {
        BQ bq = this.J.f34029h.f33391g.f33713a;
        long r9 = r(bq, this.Y.f35546r, true, false);
        if (r9 != this.Y.f35546r) {
            C4280zO c4280zO = this.Y;
            this.Y = N(bq, r9, c4280zO.f35532c, c4280zO.f35533d, z8, 5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:301:0x0aaa, code lost:
    
        if (r7 == false) goto L567;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:183:0x090f A[Catch: RuntimeException -> 0x05d1, IOException -> 0x05d6, NH -> 0x05db, W4 -> 0x05e0, LP -> 0x05e5, RN -> 0x05ea, TryCatch #22 {RN -> 0x05ea, blocks: (B:173:0x04bd, B:178:0x04d2, B:357:0x054a, B:359:0x054e, B:361:0x0552, B:363:0x0558, B:365:0x055e, B:367:0x0564, B:369:0x056a, B:371:0x0572, B:373:0x0591, B:375:0x059b, B:376:0x05a0, B:378:0x05a5, B:380:0x05ab, B:382:0x05b3, B:384:0x05bb, B:386:0x05f7, B:390:0x05ff, B:392:0x060a, B:394:0x0618, B:398:0x07be, B:400:0x07c4, B:402:0x07ca, B:405:0x07cf, B:406:0x07da, B:408:0x07df, B:414:0x0805, B:416:0x080b, B:420:0x0819, B:422:0x0821, B:427:0x0824, B:429:0x082d, B:483:0x08fc, B:181:0x0907, B:183:0x090f, B:186:0x0919, B:188:0x0927, B:189:0x0940, B:191:0x0945, B:193:0x094d, B:195:0x0977, B:196:0x0952, B:198:0x095b, B:201:0x0964, B:206:0x0974, B:212:0x0981, B:214:0x0987, B:218:0x0994, B:220:0x09d0, B:222:0x09d7, B:224:0x09db, B:227:0x0a6e, B:229:0x0a7b, B:231:0x0a8c, B:232:0x0a95, B:233:0x0ae0, B:236:0x0ae8, B:238:0x0aec, B:242:0x0af9, B:244:0x0afc, B:248:0x0b00, B:250:0x0b06, B:252:0x0b0f, B:254:0x0b17, B:256:0x0b1d, B:258:0x0b23, B:259:0x0b45, B:261:0x0b4b, B:264:0x0b54, B:267:0x0b6f, B:272:0x0b68, B:274:0x0b6c, B:276:0x0b2a, B:279:0x0b38, B:280:0x0b40, B:281:0x0b41, B:282:0x0a99, B:284:0x0a9f, B:286:0x0aa3, B:289:0x0aac, B:291:0x0abc, B:293:0x0ac2, B:295:0x0ace, B:297:0x0ad3, B:299:0x0ad8, B:300:0x0add, B:303:0x09e9, B:305:0x09ed, B:307:0x09ff, B:308:0x0a0a, B:310:0x0a12, B:313:0x0a1b, B:315:0x0a25, B:320:0x0a30, B:326:0x099c, B:328:0x09a0, B:329:0x09ba, B:331:0x09c0, B:333:0x097a, B:431:0x0836, B:433:0x083a, B:435:0x0840, B:437:0x0846, B:439:0x0850, B:442:0x0856, B:443:0x085a, B:445:0x0863, B:447:0x0875, B:449:0x087e, B:451:0x0886, B:454:0x0892, B:456:0x08ba, B:458:0x08c0, B:461:0x08c6, B:463:0x08ce, B:465:0x08d4, B:466:0x08d7, B:467:0x08e0, B:469:0x08e5, B:471:0x08eb, B:473:0x08f0, B:480:0x08fb, B:522:0x0659, B:529:0x066a, B:533:0x067c, B:540:0x06a3, B:543:0x06de, B:545:0x0711, B:547:0x0715, B:549:0x0725, B:551:0x0729, B:556:0x0731, B:558:0x0737, B:560:0x0756, B:565:0x075f, B:572:0x0788, B:575:0x0764, B:578:0x076b, B:580:0x0773, B:582:0x0779, B:583:0x071b, B:492:0x0793, B:494:0x0799, B:496:0x079d, B:499:0x07a3, B:505:0x07bb, B:506:0x07b2, B:508:0x07b8), top: B:172:0x04bd }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0919 A[Catch: RuntimeException -> 0x05d1, IOException -> 0x05d6, NH -> 0x05db, W4 -> 0x05e0, LP -> 0x05e5, RN -> 0x05ea, TryCatch #22 {RN -> 0x05ea, blocks: (B:173:0x04bd, B:178:0x04d2, B:357:0x054a, B:359:0x054e, B:361:0x0552, B:363:0x0558, B:365:0x055e, B:367:0x0564, B:369:0x056a, B:371:0x0572, B:373:0x0591, B:375:0x059b, B:376:0x05a0, B:378:0x05a5, B:380:0x05ab, B:382:0x05b3, B:384:0x05bb, B:386:0x05f7, B:390:0x05ff, B:392:0x060a, B:394:0x0618, B:398:0x07be, B:400:0x07c4, B:402:0x07ca, B:405:0x07cf, B:406:0x07da, B:408:0x07df, B:414:0x0805, B:416:0x080b, B:420:0x0819, B:422:0x0821, B:427:0x0824, B:429:0x082d, B:483:0x08fc, B:181:0x0907, B:183:0x090f, B:186:0x0919, B:188:0x0927, B:189:0x0940, B:191:0x0945, B:193:0x094d, B:195:0x0977, B:196:0x0952, B:198:0x095b, B:201:0x0964, B:206:0x0974, B:212:0x0981, B:214:0x0987, B:218:0x0994, B:220:0x09d0, B:222:0x09d7, B:224:0x09db, B:227:0x0a6e, B:229:0x0a7b, B:231:0x0a8c, B:232:0x0a95, B:233:0x0ae0, B:236:0x0ae8, B:238:0x0aec, B:242:0x0af9, B:244:0x0afc, B:248:0x0b00, B:250:0x0b06, B:252:0x0b0f, B:254:0x0b17, B:256:0x0b1d, B:258:0x0b23, B:259:0x0b45, B:261:0x0b4b, B:264:0x0b54, B:267:0x0b6f, B:272:0x0b68, B:274:0x0b6c, B:276:0x0b2a, B:279:0x0b38, B:280:0x0b40, B:281:0x0b41, B:282:0x0a99, B:284:0x0a9f, B:286:0x0aa3, B:289:0x0aac, B:291:0x0abc, B:293:0x0ac2, B:295:0x0ace, B:297:0x0ad3, B:299:0x0ad8, B:300:0x0add, B:303:0x09e9, B:305:0x09ed, B:307:0x09ff, B:308:0x0a0a, B:310:0x0a12, B:313:0x0a1b, B:315:0x0a25, B:320:0x0a30, B:326:0x099c, B:328:0x09a0, B:329:0x09ba, B:331:0x09c0, B:333:0x097a, B:431:0x0836, B:433:0x083a, B:435:0x0840, B:437:0x0846, B:439:0x0850, B:442:0x0856, B:443:0x085a, B:445:0x0863, B:447:0x0875, B:449:0x087e, B:451:0x0886, B:454:0x0892, B:456:0x08ba, B:458:0x08c0, B:461:0x08c6, B:463:0x08ce, B:465:0x08d4, B:466:0x08d7, B:467:0x08e0, B:469:0x08e5, B:471:0x08eb, B:473:0x08f0, B:480:0x08fb, B:522:0x0659, B:529:0x066a, B:533:0x067c, B:540:0x06a3, B:543:0x06de, B:545:0x0711, B:547:0x0715, B:549:0x0725, B:551:0x0729, B:556:0x0731, B:558:0x0737, B:560:0x0756, B:565:0x075f, B:572:0x0788, B:575:0x0764, B:578:0x076b, B:580:0x0773, B:582:0x0779, B:583:0x071b, B:492:0x0793, B:494:0x0799, B:496:0x079d, B:499:0x07a3, B:505:0x07bb, B:506:0x07b2, B:508:0x07b8), top: B:172:0x04bd }] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0a7b A[Catch: RuntimeException -> 0x05d1, IOException -> 0x05d6, NH -> 0x05db, W4 -> 0x05e0, LP -> 0x05e5, RN -> 0x05ea, TryCatch #22 {RN -> 0x05ea, blocks: (B:173:0x04bd, B:178:0x04d2, B:357:0x054a, B:359:0x054e, B:361:0x0552, B:363:0x0558, B:365:0x055e, B:367:0x0564, B:369:0x056a, B:371:0x0572, B:373:0x0591, B:375:0x059b, B:376:0x05a0, B:378:0x05a5, B:380:0x05ab, B:382:0x05b3, B:384:0x05bb, B:386:0x05f7, B:390:0x05ff, B:392:0x060a, B:394:0x0618, B:398:0x07be, B:400:0x07c4, B:402:0x07ca, B:405:0x07cf, B:406:0x07da, B:408:0x07df, B:414:0x0805, B:416:0x080b, B:420:0x0819, B:422:0x0821, B:427:0x0824, B:429:0x082d, B:483:0x08fc, B:181:0x0907, B:183:0x090f, B:186:0x0919, B:188:0x0927, B:189:0x0940, B:191:0x0945, B:193:0x094d, B:195:0x0977, B:196:0x0952, B:198:0x095b, B:201:0x0964, B:206:0x0974, B:212:0x0981, B:214:0x0987, B:218:0x0994, B:220:0x09d0, B:222:0x09d7, B:224:0x09db, B:227:0x0a6e, B:229:0x0a7b, B:231:0x0a8c, B:232:0x0a95, B:233:0x0ae0, B:236:0x0ae8, B:238:0x0aec, B:242:0x0af9, B:244:0x0afc, B:248:0x0b00, B:250:0x0b06, B:252:0x0b0f, B:254:0x0b17, B:256:0x0b1d, B:258:0x0b23, B:259:0x0b45, B:261:0x0b4b, B:264:0x0b54, B:267:0x0b6f, B:272:0x0b68, B:274:0x0b6c, B:276:0x0b2a, B:279:0x0b38, B:280:0x0b40, B:281:0x0b41, B:282:0x0a99, B:284:0x0a9f, B:286:0x0aa3, B:289:0x0aac, B:291:0x0abc, B:293:0x0ac2, B:295:0x0ace, B:297:0x0ad3, B:299:0x0ad8, B:300:0x0add, B:303:0x09e9, B:305:0x09ed, B:307:0x09ff, B:308:0x0a0a, B:310:0x0a12, B:313:0x0a1b, B:315:0x0a25, B:320:0x0a30, B:326:0x099c, B:328:0x09a0, B:329:0x09ba, B:331:0x09c0, B:333:0x097a, B:431:0x0836, B:433:0x083a, B:435:0x0840, B:437:0x0846, B:439:0x0850, B:442:0x0856, B:443:0x085a, B:445:0x0863, B:447:0x0875, B:449:0x087e, B:451:0x0886, B:454:0x0892, B:456:0x08ba, B:458:0x08c0, B:461:0x08c6, B:463:0x08ce, B:465:0x08d4, B:466:0x08d7, B:467:0x08e0, B:469:0x08e5, B:471:0x08eb, B:473:0x08f0, B:480:0x08fb, B:522:0x0659, B:529:0x066a, B:533:0x067c, B:540:0x06a3, B:543:0x06de, B:545:0x0711, B:547:0x0715, B:549:0x0725, B:551:0x0729, B:556:0x0731, B:558:0x0737, B:560:0x0756, B:565:0x075f, B:572:0x0788, B:575:0x0764, B:578:0x076b, B:580:0x0773, B:582:0x0779, B:583:0x071b, B:492:0x0793, B:494:0x0799, B:496:0x079d, B:499:0x07a3, B:505:0x07bb, B:506:0x07b2, B:508:0x07b8), top: B:172:0x04bd }] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0ae7  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0b4b A[Catch: RuntimeException -> 0x05d1, IOException -> 0x05d6, NH -> 0x05db, W4 -> 0x05e0, LP -> 0x05e5, RN -> 0x05ea, TryCatch #22 {RN -> 0x05ea, blocks: (B:173:0x04bd, B:178:0x04d2, B:357:0x054a, B:359:0x054e, B:361:0x0552, B:363:0x0558, B:365:0x055e, B:367:0x0564, B:369:0x056a, B:371:0x0572, B:373:0x0591, B:375:0x059b, B:376:0x05a0, B:378:0x05a5, B:380:0x05ab, B:382:0x05b3, B:384:0x05bb, B:386:0x05f7, B:390:0x05ff, B:392:0x060a, B:394:0x0618, B:398:0x07be, B:400:0x07c4, B:402:0x07ca, B:405:0x07cf, B:406:0x07da, B:408:0x07df, B:414:0x0805, B:416:0x080b, B:420:0x0819, B:422:0x0821, B:427:0x0824, B:429:0x082d, B:483:0x08fc, B:181:0x0907, B:183:0x090f, B:186:0x0919, B:188:0x0927, B:189:0x0940, B:191:0x0945, B:193:0x094d, B:195:0x0977, B:196:0x0952, B:198:0x095b, B:201:0x0964, B:206:0x0974, B:212:0x0981, B:214:0x0987, B:218:0x0994, B:220:0x09d0, B:222:0x09d7, B:224:0x09db, B:227:0x0a6e, B:229:0x0a7b, B:231:0x0a8c, B:232:0x0a95, B:233:0x0ae0, B:236:0x0ae8, B:238:0x0aec, B:242:0x0af9, B:244:0x0afc, B:248:0x0b00, B:250:0x0b06, B:252:0x0b0f, B:254:0x0b17, B:256:0x0b1d, B:258:0x0b23, B:259:0x0b45, B:261:0x0b4b, B:264:0x0b54, B:267:0x0b6f, B:272:0x0b68, B:274:0x0b6c, B:276:0x0b2a, B:279:0x0b38, B:280:0x0b40, B:281:0x0b41, B:282:0x0a99, B:284:0x0a9f, B:286:0x0aa3, B:289:0x0aac, B:291:0x0abc, B:293:0x0ac2, B:295:0x0ace, B:297:0x0ad3, B:299:0x0ad8, B:300:0x0add, B:303:0x09e9, B:305:0x09ed, B:307:0x09ff, B:308:0x0a0a, B:310:0x0a12, B:313:0x0a1b, B:315:0x0a25, B:320:0x0a30, B:326:0x099c, B:328:0x09a0, B:329:0x09ba, B:331:0x09c0, B:333:0x097a, B:431:0x0836, B:433:0x083a, B:435:0x0840, B:437:0x0846, B:439:0x0850, B:442:0x0856, B:443:0x085a, B:445:0x0863, B:447:0x0875, B:449:0x087e, B:451:0x0886, B:454:0x0892, B:456:0x08ba, B:458:0x08c0, B:461:0x08c6, B:463:0x08ce, B:465:0x08d4, B:466:0x08d7, B:467:0x08e0, B:469:0x08e5, B:471:0x08eb, B:473:0x08f0, B:480:0x08fb, B:522:0x0659, B:529:0x066a, B:533:0x067c, B:540:0x06a3, B:543:0x06de, B:545:0x0711, B:547:0x0715, B:549:0x0725, B:551:0x0729, B:556:0x0731, B:558:0x0737, B:560:0x0756, B:565:0x075f, B:572:0x0788, B:575:0x0764, B:578:0x076b, B:580:0x0773, B:582:0x0779, B:583:0x071b, B:492:0x0793, B:494:0x0799, B:496:0x079d, B:499:0x07a3, B:505:0x07bb, B:506:0x07b2, B:508:0x07b8), top: B:172:0x04bd }] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0b60 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0b61 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0a9f A[Catch: RuntimeException -> 0x05d1, IOException -> 0x05d6, NH -> 0x05db, W4 -> 0x05e0, LP -> 0x05e5, RN -> 0x05ea, TryCatch #22 {RN -> 0x05ea, blocks: (B:173:0x04bd, B:178:0x04d2, B:357:0x054a, B:359:0x054e, B:361:0x0552, B:363:0x0558, B:365:0x055e, B:367:0x0564, B:369:0x056a, B:371:0x0572, B:373:0x0591, B:375:0x059b, B:376:0x05a0, B:378:0x05a5, B:380:0x05ab, B:382:0x05b3, B:384:0x05bb, B:386:0x05f7, B:390:0x05ff, B:392:0x060a, B:394:0x0618, B:398:0x07be, B:400:0x07c4, B:402:0x07ca, B:405:0x07cf, B:406:0x07da, B:408:0x07df, B:414:0x0805, B:416:0x080b, B:420:0x0819, B:422:0x0821, B:427:0x0824, B:429:0x082d, B:483:0x08fc, B:181:0x0907, B:183:0x090f, B:186:0x0919, B:188:0x0927, B:189:0x0940, B:191:0x0945, B:193:0x094d, B:195:0x0977, B:196:0x0952, B:198:0x095b, B:201:0x0964, B:206:0x0974, B:212:0x0981, B:214:0x0987, B:218:0x0994, B:220:0x09d0, B:222:0x09d7, B:224:0x09db, B:227:0x0a6e, B:229:0x0a7b, B:231:0x0a8c, B:232:0x0a95, B:233:0x0ae0, B:236:0x0ae8, B:238:0x0aec, B:242:0x0af9, B:244:0x0afc, B:248:0x0b00, B:250:0x0b06, B:252:0x0b0f, B:254:0x0b17, B:256:0x0b1d, B:258:0x0b23, B:259:0x0b45, B:261:0x0b4b, B:264:0x0b54, B:267:0x0b6f, B:272:0x0b68, B:274:0x0b6c, B:276:0x0b2a, B:279:0x0b38, B:280:0x0b40, B:281:0x0b41, B:282:0x0a99, B:284:0x0a9f, B:286:0x0aa3, B:289:0x0aac, B:291:0x0abc, B:293:0x0ac2, B:295:0x0ace, B:297:0x0ad3, B:299:0x0ad8, B:300:0x0add, B:303:0x09e9, B:305:0x09ed, B:307:0x09ff, B:308:0x0a0a, B:310:0x0a12, B:313:0x0a1b, B:315:0x0a25, B:320:0x0a30, B:326:0x099c, B:328:0x09a0, B:329:0x09ba, B:331:0x09c0, B:333:0x097a, B:431:0x0836, B:433:0x083a, B:435:0x0840, B:437:0x0846, B:439:0x0850, B:442:0x0856, B:443:0x085a, B:445:0x0863, B:447:0x0875, B:449:0x087e, B:451:0x0886, B:454:0x0892, B:456:0x08ba, B:458:0x08c0, B:461:0x08c6, B:463:0x08ce, B:465:0x08d4, B:466:0x08d7, B:467:0x08e0, B:469:0x08e5, B:471:0x08eb, B:473:0x08f0, B:480:0x08fb, B:522:0x0659, B:529:0x066a, B:533:0x067c, B:540:0x06a3, B:543:0x06de, B:545:0x0711, B:547:0x0715, B:549:0x0725, B:551:0x0729, B:556:0x0731, B:558:0x0737, B:560:0x0756, B:565:0x075f, B:572:0x0788, B:575:0x0764, B:578:0x076b, B:580:0x0773, B:582:0x0779, B:583:0x071b, B:492:0x0793, B:494:0x0799, B:496:0x079d, B:499:0x07a3, B:505:0x07bb, B:506:0x07b2, B:508:0x07b8), top: B:172:0x04bd }] */
    /* JADX WARN: Removed duplicated region for block: B:400:0x07c4 A[Catch: RuntimeException -> 0x05d1, IOException -> 0x05d6, NH -> 0x05db, W4 -> 0x05e0, LP -> 0x05e5, RN -> 0x05ea, TryCatch #22 {RN -> 0x05ea, blocks: (B:173:0x04bd, B:178:0x04d2, B:357:0x054a, B:359:0x054e, B:361:0x0552, B:363:0x0558, B:365:0x055e, B:367:0x0564, B:369:0x056a, B:371:0x0572, B:373:0x0591, B:375:0x059b, B:376:0x05a0, B:378:0x05a5, B:380:0x05ab, B:382:0x05b3, B:384:0x05bb, B:386:0x05f7, B:390:0x05ff, B:392:0x060a, B:394:0x0618, B:398:0x07be, B:400:0x07c4, B:402:0x07ca, B:405:0x07cf, B:406:0x07da, B:408:0x07df, B:414:0x0805, B:416:0x080b, B:420:0x0819, B:422:0x0821, B:427:0x0824, B:429:0x082d, B:483:0x08fc, B:181:0x0907, B:183:0x090f, B:186:0x0919, B:188:0x0927, B:189:0x0940, B:191:0x0945, B:193:0x094d, B:195:0x0977, B:196:0x0952, B:198:0x095b, B:201:0x0964, B:206:0x0974, B:212:0x0981, B:214:0x0987, B:218:0x0994, B:220:0x09d0, B:222:0x09d7, B:224:0x09db, B:227:0x0a6e, B:229:0x0a7b, B:231:0x0a8c, B:232:0x0a95, B:233:0x0ae0, B:236:0x0ae8, B:238:0x0aec, B:242:0x0af9, B:244:0x0afc, B:248:0x0b00, B:250:0x0b06, B:252:0x0b0f, B:254:0x0b17, B:256:0x0b1d, B:258:0x0b23, B:259:0x0b45, B:261:0x0b4b, B:264:0x0b54, B:267:0x0b6f, B:272:0x0b68, B:274:0x0b6c, B:276:0x0b2a, B:279:0x0b38, B:280:0x0b40, B:281:0x0b41, B:282:0x0a99, B:284:0x0a9f, B:286:0x0aa3, B:289:0x0aac, B:291:0x0abc, B:293:0x0ac2, B:295:0x0ace, B:297:0x0ad3, B:299:0x0ad8, B:300:0x0add, B:303:0x09e9, B:305:0x09ed, B:307:0x09ff, B:308:0x0a0a, B:310:0x0a12, B:313:0x0a1b, B:315:0x0a25, B:320:0x0a30, B:326:0x099c, B:328:0x09a0, B:329:0x09ba, B:331:0x09c0, B:333:0x097a, B:431:0x0836, B:433:0x083a, B:435:0x0840, B:437:0x0846, B:439:0x0850, B:442:0x0856, B:443:0x085a, B:445:0x0863, B:447:0x0875, B:449:0x087e, B:451:0x0886, B:454:0x0892, B:456:0x08ba, B:458:0x08c0, B:461:0x08c6, B:463:0x08ce, B:465:0x08d4, B:466:0x08d7, B:467:0x08e0, B:469:0x08e5, B:471:0x08eb, B:473:0x08f0, B:480:0x08fb, B:522:0x0659, B:529:0x066a, B:533:0x067c, B:540:0x06a3, B:543:0x06de, B:545:0x0711, B:547:0x0715, B:549:0x0725, B:551:0x0729, B:556:0x0731, B:558:0x0737, B:560:0x0756, B:565:0x075f, B:572:0x0788, B:575:0x0764, B:578:0x076b, B:580:0x0773, B:582:0x0779, B:583:0x071b, B:492:0x0793, B:494:0x0799, B:496:0x079d, B:499:0x07a3, B:505:0x07bb, B:506:0x07b2, B:508:0x07b8), top: B:172:0x04bd }] */
    /* JADX WARN: Removed duplicated region for block: B:408:0x07df A[Catch: RuntimeException -> 0x05d1, IOException -> 0x05d6, NH -> 0x05db, W4 -> 0x05e0, LP -> 0x05e5, RN -> 0x05ea, LOOP:9: B:406:0x07da->B:408:0x07df, LOOP_END, TryCatch #22 {RN -> 0x05ea, blocks: (B:173:0x04bd, B:178:0x04d2, B:357:0x054a, B:359:0x054e, B:361:0x0552, B:363:0x0558, B:365:0x055e, B:367:0x0564, B:369:0x056a, B:371:0x0572, B:373:0x0591, B:375:0x059b, B:376:0x05a0, B:378:0x05a5, B:380:0x05ab, B:382:0x05b3, B:384:0x05bb, B:386:0x05f7, B:390:0x05ff, B:392:0x060a, B:394:0x0618, B:398:0x07be, B:400:0x07c4, B:402:0x07ca, B:405:0x07cf, B:406:0x07da, B:408:0x07df, B:414:0x0805, B:416:0x080b, B:420:0x0819, B:422:0x0821, B:427:0x0824, B:429:0x082d, B:483:0x08fc, B:181:0x0907, B:183:0x090f, B:186:0x0919, B:188:0x0927, B:189:0x0940, B:191:0x0945, B:193:0x094d, B:195:0x0977, B:196:0x0952, B:198:0x095b, B:201:0x0964, B:206:0x0974, B:212:0x0981, B:214:0x0987, B:218:0x0994, B:220:0x09d0, B:222:0x09d7, B:224:0x09db, B:227:0x0a6e, B:229:0x0a7b, B:231:0x0a8c, B:232:0x0a95, B:233:0x0ae0, B:236:0x0ae8, B:238:0x0aec, B:242:0x0af9, B:244:0x0afc, B:248:0x0b00, B:250:0x0b06, B:252:0x0b0f, B:254:0x0b17, B:256:0x0b1d, B:258:0x0b23, B:259:0x0b45, B:261:0x0b4b, B:264:0x0b54, B:267:0x0b6f, B:272:0x0b68, B:274:0x0b6c, B:276:0x0b2a, B:279:0x0b38, B:280:0x0b40, B:281:0x0b41, B:282:0x0a99, B:284:0x0a9f, B:286:0x0aa3, B:289:0x0aac, B:291:0x0abc, B:293:0x0ac2, B:295:0x0ace, B:297:0x0ad3, B:299:0x0ad8, B:300:0x0add, B:303:0x09e9, B:305:0x09ed, B:307:0x09ff, B:308:0x0a0a, B:310:0x0a12, B:313:0x0a1b, B:315:0x0a25, B:320:0x0a30, B:326:0x099c, B:328:0x09a0, B:329:0x09ba, B:331:0x09c0, B:333:0x097a, B:431:0x0836, B:433:0x083a, B:435:0x0840, B:437:0x0846, B:439:0x0850, B:442:0x0856, B:443:0x085a, B:445:0x0863, B:447:0x0875, B:449:0x087e, B:451:0x0886, B:454:0x0892, B:456:0x08ba, B:458:0x08c0, B:461:0x08c6, B:463:0x08ce, B:465:0x08d4, B:466:0x08d7, B:467:0x08e0, B:469:0x08e5, B:471:0x08eb, B:473:0x08f0, B:480:0x08fb, B:522:0x0659, B:529:0x066a, B:533:0x067c, B:540:0x06a3, B:543:0x06de, B:545:0x0711, B:547:0x0715, B:549:0x0725, B:551:0x0729, B:556:0x0731, B:558:0x0737, B:560:0x0756, B:565:0x075f, B:572:0x0788, B:575:0x0764, B:578:0x076b, B:580:0x0773, B:582:0x0779, B:583:0x071b, B:492:0x0793, B:494:0x0799, B:496:0x079d, B:499:0x07a3, B:505:0x07bb, B:506:0x07b2, B:508:0x07b8), top: B:172:0x04bd }] */
    /* JADX WARN: Removed duplicated region for block: B:409:0x07ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0836 A[Catch: RuntimeException -> 0x05d1, IOException -> 0x05d6, NH -> 0x05db, W4 -> 0x05e0, LP -> 0x05e5, RN -> 0x05ea, TryCatch #22 {RN -> 0x05ea, blocks: (B:173:0x04bd, B:178:0x04d2, B:357:0x054a, B:359:0x054e, B:361:0x0552, B:363:0x0558, B:365:0x055e, B:367:0x0564, B:369:0x056a, B:371:0x0572, B:373:0x0591, B:375:0x059b, B:376:0x05a0, B:378:0x05a5, B:380:0x05ab, B:382:0x05b3, B:384:0x05bb, B:386:0x05f7, B:390:0x05ff, B:392:0x060a, B:394:0x0618, B:398:0x07be, B:400:0x07c4, B:402:0x07ca, B:405:0x07cf, B:406:0x07da, B:408:0x07df, B:414:0x0805, B:416:0x080b, B:420:0x0819, B:422:0x0821, B:427:0x0824, B:429:0x082d, B:483:0x08fc, B:181:0x0907, B:183:0x090f, B:186:0x0919, B:188:0x0927, B:189:0x0940, B:191:0x0945, B:193:0x094d, B:195:0x0977, B:196:0x0952, B:198:0x095b, B:201:0x0964, B:206:0x0974, B:212:0x0981, B:214:0x0987, B:218:0x0994, B:220:0x09d0, B:222:0x09d7, B:224:0x09db, B:227:0x0a6e, B:229:0x0a7b, B:231:0x0a8c, B:232:0x0a95, B:233:0x0ae0, B:236:0x0ae8, B:238:0x0aec, B:242:0x0af9, B:244:0x0afc, B:248:0x0b00, B:250:0x0b06, B:252:0x0b0f, B:254:0x0b17, B:256:0x0b1d, B:258:0x0b23, B:259:0x0b45, B:261:0x0b4b, B:264:0x0b54, B:267:0x0b6f, B:272:0x0b68, B:274:0x0b6c, B:276:0x0b2a, B:279:0x0b38, B:280:0x0b40, B:281:0x0b41, B:282:0x0a99, B:284:0x0a9f, B:286:0x0aa3, B:289:0x0aac, B:291:0x0abc, B:293:0x0ac2, B:295:0x0ace, B:297:0x0ad3, B:299:0x0ad8, B:300:0x0add, B:303:0x09e9, B:305:0x09ed, B:307:0x09ff, B:308:0x0a0a, B:310:0x0a12, B:313:0x0a1b, B:315:0x0a25, B:320:0x0a30, B:326:0x099c, B:328:0x09a0, B:329:0x09ba, B:331:0x09c0, B:333:0x097a, B:431:0x0836, B:433:0x083a, B:435:0x0840, B:437:0x0846, B:439:0x0850, B:442:0x0856, B:443:0x085a, B:445:0x0863, B:447:0x0875, B:449:0x087e, B:451:0x0886, B:454:0x0892, B:456:0x08ba, B:458:0x08c0, B:461:0x08c6, B:463:0x08ce, B:465:0x08d4, B:466:0x08d7, B:467:0x08e0, B:469:0x08e5, B:471:0x08eb, B:473:0x08f0, B:480:0x08fb, B:522:0x0659, B:529:0x066a, B:533:0x067c, B:540:0x06a3, B:543:0x06de, B:545:0x0711, B:547:0x0715, B:549:0x0725, B:551:0x0729, B:556:0x0731, B:558:0x0737, B:560:0x0756, B:565:0x075f, B:572:0x0788, B:575:0x0764, B:578:0x076b, B:580:0x0773, B:582:0x0779, B:583:0x071b, B:492:0x0793, B:494:0x0799, B:496:0x079d, B:499:0x07a3, B:505:0x07bb, B:506:0x07b2, B:508:0x07b8), top: B:172:0x04bd }] */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0856 A[Catch: RuntimeException -> 0x05d1, IOException -> 0x05d6, NH -> 0x05db, W4 -> 0x05e0, LP -> 0x05e5, RN -> 0x05ea, TryCatch #22 {RN -> 0x05ea, blocks: (B:173:0x04bd, B:178:0x04d2, B:357:0x054a, B:359:0x054e, B:361:0x0552, B:363:0x0558, B:365:0x055e, B:367:0x0564, B:369:0x056a, B:371:0x0572, B:373:0x0591, B:375:0x059b, B:376:0x05a0, B:378:0x05a5, B:380:0x05ab, B:382:0x05b3, B:384:0x05bb, B:386:0x05f7, B:390:0x05ff, B:392:0x060a, B:394:0x0618, B:398:0x07be, B:400:0x07c4, B:402:0x07ca, B:405:0x07cf, B:406:0x07da, B:408:0x07df, B:414:0x0805, B:416:0x080b, B:420:0x0819, B:422:0x0821, B:427:0x0824, B:429:0x082d, B:483:0x08fc, B:181:0x0907, B:183:0x090f, B:186:0x0919, B:188:0x0927, B:189:0x0940, B:191:0x0945, B:193:0x094d, B:195:0x0977, B:196:0x0952, B:198:0x095b, B:201:0x0964, B:206:0x0974, B:212:0x0981, B:214:0x0987, B:218:0x0994, B:220:0x09d0, B:222:0x09d7, B:224:0x09db, B:227:0x0a6e, B:229:0x0a7b, B:231:0x0a8c, B:232:0x0a95, B:233:0x0ae0, B:236:0x0ae8, B:238:0x0aec, B:242:0x0af9, B:244:0x0afc, B:248:0x0b00, B:250:0x0b06, B:252:0x0b0f, B:254:0x0b17, B:256:0x0b1d, B:258:0x0b23, B:259:0x0b45, B:261:0x0b4b, B:264:0x0b54, B:267:0x0b6f, B:272:0x0b68, B:274:0x0b6c, B:276:0x0b2a, B:279:0x0b38, B:280:0x0b40, B:281:0x0b41, B:282:0x0a99, B:284:0x0a9f, B:286:0x0aa3, B:289:0x0aac, B:291:0x0abc, B:293:0x0ac2, B:295:0x0ace, B:297:0x0ad3, B:299:0x0ad8, B:300:0x0add, B:303:0x09e9, B:305:0x09ed, B:307:0x09ff, B:308:0x0a0a, B:310:0x0a12, B:313:0x0a1b, B:315:0x0a25, B:320:0x0a30, B:326:0x099c, B:328:0x09a0, B:329:0x09ba, B:331:0x09c0, B:333:0x097a, B:431:0x0836, B:433:0x083a, B:435:0x0840, B:437:0x0846, B:439:0x0850, B:442:0x0856, B:443:0x085a, B:445:0x0863, B:447:0x0875, B:449:0x087e, B:451:0x0886, B:454:0x0892, B:456:0x08ba, B:458:0x08c0, B:461:0x08c6, B:463:0x08ce, B:465:0x08d4, B:466:0x08d7, B:467:0x08e0, B:469:0x08e5, B:471:0x08eb, B:473:0x08f0, B:480:0x08fb, B:522:0x0659, B:529:0x066a, B:533:0x067c, B:540:0x06a3, B:543:0x06de, B:545:0x0711, B:547:0x0715, B:549:0x0725, B:551:0x0729, B:556:0x0731, B:558:0x0737, B:560:0x0756, B:565:0x075f, B:572:0x0788, B:575:0x0764, B:578:0x076b, B:580:0x0773, B:582:0x0779, B:583:0x071b, B:492:0x0793, B:494:0x0799, B:496:0x079d, B:499:0x07a3, B:505:0x07bb, B:506:0x07b2, B:508:0x07b8), top: B:172:0x04bd }] */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0863 A[Catch: RuntimeException -> 0x05d1, IOException -> 0x05d6, NH -> 0x05db, W4 -> 0x05e0, LP -> 0x05e5, RN -> 0x05ea, TryCatch #22 {RN -> 0x05ea, blocks: (B:173:0x04bd, B:178:0x04d2, B:357:0x054a, B:359:0x054e, B:361:0x0552, B:363:0x0558, B:365:0x055e, B:367:0x0564, B:369:0x056a, B:371:0x0572, B:373:0x0591, B:375:0x059b, B:376:0x05a0, B:378:0x05a5, B:380:0x05ab, B:382:0x05b3, B:384:0x05bb, B:386:0x05f7, B:390:0x05ff, B:392:0x060a, B:394:0x0618, B:398:0x07be, B:400:0x07c4, B:402:0x07ca, B:405:0x07cf, B:406:0x07da, B:408:0x07df, B:414:0x0805, B:416:0x080b, B:420:0x0819, B:422:0x0821, B:427:0x0824, B:429:0x082d, B:483:0x08fc, B:181:0x0907, B:183:0x090f, B:186:0x0919, B:188:0x0927, B:189:0x0940, B:191:0x0945, B:193:0x094d, B:195:0x0977, B:196:0x0952, B:198:0x095b, B:201:0x0964, B:206:0x0974, B:212:0x0981, B:214:0x0987, B:218:0x0994, B:220:0x09d0, B:222:0x09d7, B:224:0x09db, B:227:0x0a6e, B:229:0x0a7b, B:231:0x0a8c, B:232:0x0a95, B:233:0x0ae0, B:236:0x0ae8, B:238:0x0aec, B:242:0x0af9, B:244:0x0afc, B:248:0x0b00, B:250:0x0b06, B:252:0x0b0f, B:254:0x0b17, B:256:0x0b1d, B:258:0x0b23, B:259:0x0b45, B:261:0x0b4b, B:264:0x0b54, B:267:0x0b6f, B:272:0x0b68, B:274:0x0b6c, B:276:0x0b2a, B:279:0x0b38, B:280:0x0b40, B:281:0x0b41, B:282:0x0a99, B:284:0x0a9f, B:286:0x0aa3, B:289:0x0aac, B:291:0x0abc, B:293:0x0ac2, B:295:0x0ace, B:297:0x0ad3, B:299:0x0ad8, B:300:0x0add, B:303:0x09e9, B:305:0x09ed, B:307:0x09ff, B:308:0x0a0a, B:310:0x0a12, B:313:0x0a1b, B:315:0x0a25, B:320:0x0a30, B:326:0x099c, B:328:0x09a0, B:329:0x09ba, B:331:0x09c0, B:333:0x097a, B:431:0x0836, B:433:0x083a, B:435:0x0840, B:437:0x0846, B:439:0x0850, B:442:0x0856, B:443:0x085a, B:445:0x0863, B:447:0x0875, B:449:0x087e, B:451:0x0886, B:454:0x0892, B:456:0x08ba, B:458:0x08c0, B:461:0x08c6, B:463:0x08ce, B:465:0x08d4, B:466:0x08d7, B:467:0x08e0, B:469:0x08e5, B:471:0x08eb, B:473:0x08f0, B:480:0x08fb, B:522:0x0659, B:529:0x066a, B:533:0x067c, B:540:0x06a3, B:543:0x06de, B:545:0x0711, B:547:0x0715, B:549:0x0725, B:551:0x0729, B:556:0x0731, B:558:0x0737, B:560:0x0756, B:565:0x075f, B:572:0x0788, B:575:0x0764, B:578:0x076b, B:580:0x0773, B:582:0x0779, B:583:0x071b, B:492:0x0793, B:494:0x0799, B:496:0x079d, B:499:0x07a3, B:505:0x07bb, B:506:0x07b2, B:508:0x07b8), top: B:172:0x04bd }] */
    /* JADX WARN: Removed duplicated region for block: B:461:0x08c6 A[Catch: RuntimeException -> 0x05d1, IOException -> 0x05d6, NH -> 0x05db, W4 -> 0x05e0, LP -> 0x05e5, RN -> 0x05ea, LOOP:12: B:459:0x08c3->B:461:0x08c6, LOOP_END, TryCatch #22 {RN -> 0x05ea, blocks: (B:173:0x04bd, B:178:0x04d2, B:357:0x054a, B:359:0x054e, B:361:0x0552, B:363:0x0558, B:365:0x055e, B:367:0x0564, B:369:0x056a, B:371:0x0572, B:373:0x0591, B:375:0x059b, B:376:0x05a0, B:378:0x05a5, B:380:0x05ab, B:382:0x05b3, B:384:0x05bb, B:386:0x05f7, B:390:0x05ff, B:392:0x060a, B:394:0x0618, B:398:0x07be, B:400:0x07c4, B:402:0x07ca, B:405:0x07cf, B:406:0x07da, B:408:0x07df, B:414:0x0805, B:416:0x080b, B:420:0x0819, B:422:0x0821, B:427:0x0824, B:429:0x082d, B:483:0x08fc, B:181:0x0907, B:183:0x090f, B:186:0x0919, B:188:0x0927, B:189:0x0940, B:191:0x0945, B:193:0x094d, B:195:0x0977, B:196:0x0952, B:198:0x095b, B:201:0x0964, B:206:0x0974, B:212:0x0981, B:214:0x0987, B:218:0x0994, B:220:0x09d0, B:222:0x09d7, B:224:0x09db, B:227:0x0a6e, B:229:0x0a7b, B:231:0x0a8c, B:232:0x0a95, B:233:0x0ae0, B:236:0x0ae8, B:238:0x0aec, B:242:0x0af9, B:244:0x0afc, B:248:0x0b00, B:250:0x0b06, B:252:0x0b0f, B:254:0x0b17, B:256:0x0b1d, B:258:0x0b23, B:259:0x0b45, B:261:0x0b4b, B:264:0x0b54, B:267:0x0b6f, B:272:0x0b68, B:274:0x0b6c, B:276:0x0b2a, B:279:0x0b38, B:280:0x0b40, B:281:0x0b41, B:282:0x0a99, B:284:0x0a9f, B:286:0x0aa3, B:289:0x0aac, B:291:0x0abc, B:293:0x0ac2, B:295:0x0ace, B:297:0x0ad3, B:299:0x0ad8, B:300:0x0add, B:303:0x09e9, B:305:0x09ed, B:307:0x09ff, B:308:0x0a0a, B:310:0x0a12, B:313:0x0a1b, B:315:0x0a25, B:320:0x0a30, B:326:0x099c, B:328:0x09a0, B:329:0x09ba, B:331:0x09c0, B:333:0x097a, B:431:0x0836, B:433:0x083a, B:435:0x0840, B:437:0x0846, B:439:0x0850, B:442:0x0856, B:443:0x085a, B:445:0x0863, B:447:0x0875, B:449:0x087e, B:451:0x0886, B:454:0x0892, B:456:0x08ba, B:458:0x08c0, B:461:0x08c6, B:463:0x08ce, B:465:0x08d4, B:466:0x08d7, B:467:0x08e0, B:469:0x08e5, B:471:0x08eb, B:473:0x08f0, B:480:0x08fb, B:522:0x0659, B:529:0x066a, B:533:0x067c, B:540:0x06a3, B:543:0x06de, B:545:0x0711, B:547:0x0715, B:549:0x0725, B:551:0x0729, B:556:0x0731, B:558:0x0737, B:560:0x0756, B:565:0x075f, B:572:0x0788, B:575:0x0764, B:578:0x076b, B:580:0x0773, B:582:0x0779, B:583:0x071b, B:492:0x0793, B:494:0x0799, B:496:0x079d, B:499:0x07a3, B:505:0x07bb, B:506:0x07b2, B:508:0x07b8), top: B:172:0x04bd }] */
    /* JADX WARN: Removed duplicated region for block: B:465:0x08d4 A[Catch: RuntimeException -> 0x05d1, IOException -> 0x05d6, NH -> 0x05db, W4 -> 0x05e0, LP -> 0x05e5, RN -> 0x05ea, TryCatch #22 {RN -> 0x05ea, blocks: (B:173:0x04bd, B:178:0x04d2, B:357:0x054a, B:359:0x054e, B:361:0x0552, B:363:0x0558, B:365:0x055e, B:367:0x0564, B:369:0x056a, B:371:0x0572, B:373:0x0591, B:375:0x059b, B:376:0x05a0, B:378:0x05a5, B:380:0x05ab, B:382:0x05b3, B:384:0x05bb, B:386:0x05f7, B:390:0x05ff, B:392:0x060a, B:394:0x0618, B:398:0x07be, B:400:0x07c4, B:402:0x07ca, B:405:0x07cf, B:406:0x07da, B:408:0x07df, B:414:0x0805, B:416:0x080b, B:420:0x0819, B:422:0x0821, B:427:0x0824, B:429:0x082d, B:483:0x08fc, B:181:0x0907, B:183:0x090f, B:186:0x0919, B:188:0x0927, B:189:0x0940, B:191:0x0945, B:193:0x094d, B:195:0x0977, B:196:0x0952, B:198:0x095b, B:201:0x0964, B:206:0x0974, B:212:0x0981, B:214:0x0987, B:218:0x0994, B:220:0x09d0, B:222:0x09d7, B:224:0x09db, B:227:0x0a6e, B:229:0x0a7b, B:231:0x0a8c, B:232:0x0a95, B:233:0x0ae0, B:236:0x0ae8, B:238:0x0aec, B:242:0x0af9, B:244:0x0afc, B:248:0x0b00, B:250:0x0b06, B:252:0x0b0f, B:254:0x0b17, B:256:0x0b1d, B:258:0x0b23, B:259:0x0b45, B:261:0x0b4b, B:264:0x0b54, B:267:0x0b6f, B:272:0x0b68, B:274:0x0b6c, B:276:0x0b2a, B:279:0x0b38, B:280:0x0b40, B:281:0x0b41, B:282:0x0a99, B:284:0x0a9f, B:286:0x0aa3, B:289:0x0aac, B:291:0x0abc, B:293:0x0ac2, B:295:0x0ace, B:297:0x0ad3, B:299:0x0ad8, B:300:0x0add, B:303:0x09e9, B:305:0x09ed, B:307:0x09ff, B:308:0x0a0a, B:310:0x0a12, B:313:0x0a1b, B:315:0x0a25, B:320:0x0a30, B:326:0x099c, B:328:0x09a0, B:329:0x09ba, B:331:0x09c0, B:333:0x097a, B:431:0x0836, B:433:0x083a, B:435:0x0840, B:437:0x0846, B:439:0x0850, B:442:0x0856, B:443:0x085a, B:445:0x0863, B:447:0x0875, B:449:0x087e, B:451:0x0886, B:454:0x0892, B:456:0x08ba, B:458:0x08c0, B:461:0x08c6, B:463:0x08ce, B:465:0x08d4, B:466:0x08d7, B:467:0x08e0, B:469:0x08e5, B:471:0x08eb, B:473:0x08f0, B:480:0x08fb, B:522:0x0659, B:529:0x066a, B:533:0x067c, B:540:0x06a3, B:543:0x06de, B:545:0x0711, B:547:0x0715, B:549:0x0725, B:551:0x0729, B:556:0x0731, B:558:0x0737, B:560:0x0756, B:565:0x075f, B:572:0x0788, B:575:0x0764, B:578:0x076b, B:580:0x0773, B:582:0x0779, B:583:0x071b, B:492:0x0793, B:494:0x0799, B:496:0x079d, B:499:0x07a3, B:505:0x07bb, B:506:0x07b2, B:508:0x07b8), top: B:172:0x04bd }] */
    /* JADX WARN: Removed duplicated region for block: B:469:0x08e5 A[Catch: RuntimeException -> 0x05d1, IOException -> 0x05d6, NH -> 0x05db, W4 -> 0x05e0, LP -> 0x05e5, RN -> 0x05ea, TryCatch #22 {RN -> 0x05ea, blocks: (B:173:0x04bd, B:178:0x04d2, B:357:0x054a, B:359:0x054e, B:361:0x0552, B:363:0x0558, B:365:0x055e, B:367:0x0564, B:369:0x056a, B:371:0x0572, B:373:0x0591, B:375:0x059b, B:376:0x05a0, B:378:0x05a5, B:380:0x05ab, B:382:0x05b3, B:384:0x05bb, B:386:0x05f7, B:390:0x05ff, B:392:0x060a, B:394:0x0618, B:398:0x07be, B:400:0x07c4, B:402:0x07ca, B:405:0x07cf, B:406:0x07da, B:408:0x07df, B:414:0x0805, B:416:0x080b, B:420:0x0819, B:422:0x0821, B:427:0x0824, B:429:0x082d, B:483:0x08fc, B:181:0x0907, B:183:0x090f, B:186:0x0919, B:188:0x0927, B:189:0x0940, B:191:0x0945, B:193:0x094d, B:195:0x0977, B:196:0x0952, B:198:0x095b, B:201:0x0964, B:206:0x0974, B:212:0x0981, B:214:0x0987, B:218:0x0994, B:220:0x09d0, B:222:0x09d7, B:224:0x09db, B:227:0x0a6e, B:229:0x0a7b, B:231:0x0a8c, B:232:0x0a95, B:233:0x0ae0, B:236:0x0ae8, B:238:0x0aec, B:242:0x0af9, B:244:0x0afc, B:248:0x0b00, B:250:0x0b06, B:252:0x0b0f, B:254:0x0b17, B:256:0x0b1d, B:258:0x0b23, B:259:0x0b45, B:261:0x0b4b, B:264:0x0b54, B:267:0x0b6f, B:272:0x0b68, B:274:0x0b6c, B:276:0x0b2a, B:279:0x0b38, B:280:0x0b40, B:281:0x0b41, B:282:0x0a99, B:284:0x0a9f, B:286:0x0aa3, B:289:0x0aac, B:291:0x0abc, B:293:0x0ac2, B:295:0x0ace, B:297:0x0ad3, B:299:0x0ad8, B:300:0x0add, B:303:0x09e9, B:305:0x09ed, B:307:0x09ff, B:308:0x0a0a, B:310:0x0a12, B:313:0x0a1b, B:315:0x0a25, B:320:0x0a30, B:326:0x099c, B:328:0x09a0, B:329:0x09ba, B:331:0x09c0, B:333:0x097a, B:431:0x0836, B:433:0x083a, B:435:0x0840, B:437:0x0846, B:439:0x0850, B:442:0x0856, B:443:0x085a, B:445:0x0863, B:447:0x0875, B:449:0x087e, B:451:0x0886, B:454:0x0892, B:456:0x08ba, B:458:0x08c0, B:461:0x08c6, B:463:0x08ce, B:465:0x08d4, B:466:0x08d7, B:467:0x08e0, B:469:0x08e5, B:471:0x08eb, B:473:0x08f0, B:480:0x08fb, B:522:0x0659, B:529:0x066a, B:533:0x067c, B:540:0x06a3, B:543:0x06de, B:545:0x0711, B:547:0x0715, B:549:0x0725, B:551:0x0729, B:556:0x0731, B:558:0x0737, B:560:0x0756, B:565:0x075f, B:572:0x0788, B:575:0x0764, B:578:0x076b, B:580:0x0773, B:582:0x0779, B:583:0x071b, B:492:0x0793, B:494:0x0799, B:496:0x079d, B:499:0x07a3, B:505:0x07bb, B:506:0x07b2, B:508:0x07b8), top: B:172:0x04bd }] */
    /* JADX WARN: Removed duplicated region for block: B:479:0x08fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0639 A[Catch: RuntimeException -> 0x05d1, IOException -> 0x05d6, NH -> 0x05db, W4 -> 0x05e0, LP -> 0x05e5, RN -> 0x0902, TRY_LEAVE, TryCatch #4 {RN -> 0x0902, blocks: (B:335:0x04da, B:337:0x04e9, B:351:0x0530, B:354:0x0543, B:395:0x062b, B:489:0x0639, B:681:0x0540), top: B:334:0x04da }] */
    /* JADX WARN: Removed duplicated region for block: B:620:0x0c47 A[ADDED_TO_REGION, LOOP:19: B:620:0x0c47->B:623:0x0c4f, LOOP_START, PHI: r2
      0x0c47: PHI (r2v32 com.google.android.gms.internal.ads.pO) = (r2v30 com.google.android.gms.internal.ads.pO), (r2v33 com.google.android.gms.internal.ads.pO) binds: [B:619:0x0c44, B:623:0x0c4f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:628:0x0c5e  */
    /* JADX WARN: Removed duplicated region for block: B:631:0x0c6d  */
    /* JADX WARN: Removed duplicated region for block: B:634:0x0c77  */
    /* JADX WARN: Removed duplicated region for block: B:659:0x0bd1  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        int i;
        RN rn;
        boolean z8;
        int i4;
        BQ bq;
        C3848rO c3848rO;
        C3741pO u7;
        C3741pO t9;
        long uptimeMillis;
        C3709ot c3709ot;
        C4280zO c4280zO;
        int i9;
        C3848rO c3848rO2;
        long j9;
        C3741pO t10;
        RN rn2;
        int i10;
        long j10;
        int i11;
        int i12;
        boolean z9;
        C3741pO t11;
        boolean z10;
        int i13;
        C3741pO s3;
        C3741pO i14;
        C3741pO x3;
        char c4;
        boolean z11;
        int i15;
        int i16;
        C3741pO t12;
        C3877s k6;
        int i17;
        int i18;
        D0.H[] hArr;
        C3741pO u9;
        C3877s c3877s;
        int i19;
        C3795qO p6;
        C3741pO s6;
        boolean z12;
        boolean z13;
        long j11;
        long j12;
        int i20;
        boolean e6;
        Message message2 = message;
        try {
            try {
            } catch (RuntimeException e9) {
                e = e9;
            }
        } catch (LP e10) {
            e = e10;
        } catch (NH e11) {
            e = e11;
        } catch (RN e12) {
            e = e12;
        } catch (W4 e13) {
            e = e13;
        } catch (IOException e14) {
            e = e14;
        }
        switch (message2.what) {
            case 1:
                boolean z14 = message2.arg1 != 0;
                int i21 = message2.arg2;
                this.f31363Z.f(1);
                g(this.f31356R.b(this.Y.f35534e, z14), i21 >> 4, i21 & 15, z14);
                z8 = true;
                d(message2.what);
                return z8;
            case 2:
                z8 = true;
                try {
                    try {
                        uptimeMillis = SystemClock.uptimeMillis();
                        c3709ot = this.f31382z;
                        c3709ot.d(2);
                        c4280zO = this.Y;
                        i9 = c4280zO.f35534e;
                    } catch (RN e15) {
                        e = e15;
                    }
                } catch (LP e16) {
                    e = e16;
                } catch (NH e17) {
                    e = e17;
                } catch (W4 e18) {
                    e = e18;
                } catch (IOException e19) {
                    e = e19;
                } catch (RuntimeException e20) {
                    e = e20;
                }
                if (i9 == 1) {
                    message2 = message;
                } else if (i9 != 4) {
                    if (!c4280zO.f35530a.g()) {
                        try {
                        } catch (RN e21) {
                            e = e21;
                        }
                        if (this.f31349K.e()) {
                            C3848rO c3848rO3 = this.J;
                            c3848rO3.n(this.f31381y0);
                            if (c3848rO3.o() && (p6 = c3848rO3.p(this.f31381y0, this.Y)) != null) {
                                C3741pO q6 = c3848rO3.q(p6);
                                if (!q6.f33388d) {
                                    long j13 = p6.f33714b;
                                    q6.f33388d = true;
                                    q6.f33385a.g(this, j13);
                                } else if (q6.f33389e) {
                                    c3709ot.b(8, q6.f33385a).a();
                                }
                                if (c3848rO3.s() == q6) {
                                    s(p6.f33714b, true);
                                }
                                Q(false);
                            }
                            if (this.f31370s0) {
                                this.f31370s0 = A(c3848rO3.f34031k);
                                M();
                            } else {
                                L();
                            }
                            if (!this.f31367p0 && this.f31355Q && !this.f31344G0 && !V() && (u9 = c3848rO3.u()) != null && u9 == c3848rO3.t() && u9.i() != null && u9.i().f33389e) {
                                PA.T(u9.i().f33389e);
                                if (((long) ((r0.a() - this.f31381y0) / this.f31341F.h().f34712a)) <= 10000000) {
                                    c3848rO3.w();
                                    c3848rO2 = c3848rO3;
                                    C3741pO u10 = c3848rO2.u();
                                    if (u10 != null) {
                                        C3877s k9 = u10.k();
                                        int i22 = 0;
                                        while (true) {
                                            D0.H[] hArr2 = this.f31364n;
                                            if (i22 < 2) {
                                                if (k9.b(i22) && hArr2[i22].o() && !hArr2[i22].q()) {
                                                    hArr2[i22].p();
                                                    c3877s = k9;
                                                    i19 = i22;
                                                    P(u10, i19, false, u10.a());
                                                } else {
                                                    c3877s = k9;
                                                    i19 = i22;
                                                }
                                                i22 = i19 + 1;
                                                k9 = c3877s;
                                            } else {
                                                j9 = com.anythink.basead.exoplayer.b.f6539b;
                                                if (V()) {
                                                    this.f31342F0 = u10.f33385a.t();
                                                    if (!u10.b()) {
                                                        c3848rO2.y(u10);
                                                        Q(false);
                                                        L();
                                                    }
                                                }
                                                t10 = c3848rO2.t();
                                                if (t10 != null) {
                                                    if (t10.i() != null) {
                                                        try {
                                                            if (!this.f31367p0) {
                                                                C3741pO t13 = c3848rO2.t();
                                                                if (t13.f33389e) {
                                                                    int i23 = 0;
                                                                    while (true) {
                                                                        D0.H[] hArr3 = this.f31364n;
                                                                        if (i23 < 2) {
                                                                            if (hArr3[i23].A(t13)) {
                                                                                i23++;
                                                                            }
                                                                        } else if ((!V() || c3848rO2.u() != c3848rO2.t()) && (t10.i().f33389e || this.f31381y0 >= t10.i().a())) {
                                                                            if (t10.i().f33389e) {
                                                                                PA.T(t10.i().f33389e);
                                                                                rn2 = null;
                                                                                i10 = 1;
                                                                                if (((long) ((r3.a() - this.f31381y0) / this.f31341F.h().f34712a)) > 10000000) {
                                                                                    j10 = uptimeMillis;
                                                                                }
                                                                            } else {
                                                                                rn2 = null;
                                                                                i10 = 1;
                                                                            }
                                                                            C3877s k10 = t10.k();
                                                                            C3741pO v6 = c3848rO2.v();
                                                                            C3877s k11 = v6.k();
                                                                            AbstractC3832r8 abstractC3832r8 = this.Y.f35530a;
                                                                            j10 = uptimeMillis;
                                                                            G(abstractC3832r8, v6.f33391g.f33713a, abstractC3832r8, t10.f33391g.f33713a, com.anythink.basead.exoplayer.b.f6539b, false);
                                                                            if (!v6.f33389e || ((!(z9 = this.f31355Q) || this.f31342F0 == j9) && v6.f33385a.t() == j9)) {
                                                                                i11 = 0;
                                                                                i12 = 2;
                                                                            } else {
                                                                                this.f31342F0 = j9;
                                                                                if (z9 && !this.f31344G0) {
                                                                                    int i24 = 0;
                                                                                    while (true) {
                                                                                        i12 = 2;
                                                                                        if (i24 < 2) {
                                                                                            if (k11.b(i24)) {
                                                                                                hArr3[i24].s();
                                                                                                InterfaceC3716p[] interfaceC3716pArr = (InterfaceC3716p[]) k11.f34151v;
                                                                                                if (!K4.d(interfaceC3716pArr[i24].i().f27776o, interfaceC3716pArr[i24].i().f27772k) && !hArr3[i24].q()) {
                                                                                                }
                                                                                            }
                                                                                            i24++;
                                                                                        } else {
                                                                                            i11 = 0;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v6.a();
                                                                                for (int i25 = 0; i25 < 2; i25++) {
                                                                                    hArr3[i25].w();
                                                                                }
                                                                                if (!v6.b()) {
                                                                                    c3848rO2.y(v6);
                                                                                    Q(false);
                                                                                    L();
                                                                                }
                                                                            }
                                                                            while (i11 < i12) {
                                                                                D0.H h9 = hArr3[i11];
                                                                                v6.a();
                                                                                h9.v(k10, k11);
                                                                                i11++;
                                                                                i12 = 2;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } catch (LP e22) {
                                                            e = e22;
                                                            message2 = message;
                                                            b(e, e.f26158n);
                                                            z8 = true;
                                                            d(message2.what);
                                                            return z8;
                                                        } catch (NH e23) {
                                                            e = e23;
                                                            message2 = message;
                                                            b(e, e.f26510n);
                                                            z8 = true;
                                                            d(message2.what);
                                                            return z8;
                                                        } catch (RN e24) {
                                                            e = e24;
                                                            message2 = message;
                                                            if (e.f27352v == 1) {
                                                                e = e.a(t9.f33391g.f33713a);
                                                                break;
                                                            }
                                                            if (e.f27352v == 1) {
                                                                int i26 = e.f27354x;
                                                                c3848rO = this.J;
                                                                if (c3848rO.u() != null) {
                                                                    this.f31344G0 = true;
                                                                    C();
                                                                    u7 = c3848rO.u();
                                                                    C3741pO s9 = c3848rO.s();
                                                                    if (c3848rO.s() != u7) {
                                                                    }
                                                                    c3848rO.y(s9);
                                                                    if (this.Y.f35534e != 4) {
                                                                    }
                                                                    z8 = true;
                                                                    d(message2.what);
                                                                    return z8;
                                                                }
                                                                break;
                                                            }
                                                            rn = this.C0;
                                                            if (rn != null) {
                                                            }
                                                            if (e.f27352v == 1) {
                                                            }
                                                            if (e.f27349B) {
                                                                break;
                                                            }
                                                            AbstractC3217fl.X("ExoPlayerImplInternal", "Playback error", e);
                                                            z8 = true;
                                                            u(true, false);
                                                            this.Y = this.Y.e(e);
                                                            d(message2.what);
                                                            return z8;
                                                        } catch (W4 e25) {
                                                            e = e25;
                                                            message2 = message;
                                                            b(e, e.f28365u == 1 ? true != e.f28364n ? 3003 : AdError.MEDIATION_ERROR_CODE : 1000);
                                                            z8 = true;
                                                            d(message2.what);
                                                            return z8;
                                                        } catch (IOException e26) {
                                                            e = e26;
                                                            message2 = message;
                                                            b(e, 2000);
                                                            z8 = true;
                                                            d(message2.what);
                                                            return z8;
                                                        } catch (RuntimeException e27) {
                                                            e = e27;
                                                            message2 = message;
                                                            i = 1004;
                                                            if (!(e instanceof IllegalStateException)) {
                                                                i = 1000;
                                                                break;
                                                            }
                                                            RN rn3 = new RN(2, e, i);
                                                            AbstractC3217fl.X("ExoPlayerImplInternal", "Playback error", rn3);
                                                            u(true, false);
                                                            this.Y = this.Y.e(rn3);
                                                            z8 = true;
                                                            d(message2.what);
                                                            return z8;
                                                        }
                                                    }
                                                    j10 = uptimeMillis;
                                                    rn2 = null;
                                                    i10 = 1;
                                                    if (t10.f33391g.f33720h || this.f31367p0) {
                                                        D0.H[] hArr4 = this.f31364n;
                                                        for (int i27 = 0; i27 < 2; i27++) {
                                                            D0.H h10 = hArr4[i27];
                                                            if ((h10.m(t10) != null) && h10.t(t10)) {
                                                                h10.u(t10);
                                                            }
                                                        }
                                                    }
                                                    t11 = c3848rO2.t();
                                                    if (t11 != null && c3848rO2.s() != t11 && !t11.f33392h) {
                                                        t12 = c3848rO2.t();
                                                        k6 = t12.k();
                                                        i17 = i10;
                                                        i18 = 0;
                                                        while (true) {
                                                            hArr = this.f31364n;
                                                            if (i18 >= 2) {
                                                                int r9 = hArr[i18].r();
                                                                int c9 = hArr[i18].c(t12, k6, this.f31341F);
                                                                this.f31377w0 -= r9 - hArr[i18].r();
                                                                i17 &= c9 & 1;
                                                                i18++;
                                                            } else if (i17 != 0) {
                                                                for (int i28 = 0; i28 < 2; i28++) {
                                                                    if (k6.b(i28)) {
                                                                        if ((hArr[i28].m(t12) != null ? i10 : 0) == 0) {
                                                                            P(t12, i28, false, t12.a());
                                                                        }
                                                                    }
                                                                }
                                                                c3848rO2.t().f33392h = i10;
                                                            }
                                                        }
                                                    }
                                                    z10 = false;
                                                    while (T() && !this.f31367p0 && (s3 = c3848rO2.s()) != null && (i14 = s3.i()) != null && this.f31381y0 >= i14.a() && i14.f33392h) {
                                                        if (z10) {
                                                            d(-1);
                                                        }
                                                        this.f31344G0 = false;
                                                        x3 = c3848rO2.x();
                                                        if (x3 != null) {
                                                            throw rn2;
                                                        }
                                                        if (this.Y.f35531b.f24043a.equals(x3.f33391g.f33713a.f24043a)) {
                                                            BQ bq2 = this.Y.f35531b;
                                                            c4 = 65535;
                                                            if (bq2.f24044b == -1) {
                                                                BQ bq3 = x3.f33391g.f33713a;
                                                                if (bq3.f24044b == -1 && bq2.f24047e != bq3.f24047e) {
                                                                    z11 = true;
                                                                    C3795qO c3795qO = x3.f33391g;
                                                                    BQ bq4 = c3795qO.f33713a;
                                                                    boolean z15 = z11;
                                                                    long j14 = c3795qO.f33714b;
                                                                    this.Y = N(bq4, j14, c3795qO.f33716d, j14, !z15, 0);
                                                                    J();
                                                                    l();
                                                                    if (V() && x3 == c3848rO2.u()) {
                                                                        D0.H[] hArr5 = this.f31364n;
                                                                        for (i16 = 0; i16 < 2; i16++) {
                                                                            hArr5[i16].a();
                                                                        }
                                                                    }
                                                                    if (this.Y.f35534e == 3) {
                                                                        i();
                                                                    }
                                                                    C3877s k12 = c3848rO2.s().k();
                                                                    i15 = 0;
                                                                    while (true) {
                                                                        D0.H[] hArr6 = this.f31364n;
                                                                        if (i15 >= 2) {
                                                                            if (k12.b(i15)) {
                                                                                hArr6[i15].x();
                                                                            }
                                                                            i15++;
                                                                        }
                                                                    }
                                                                    z10 = true;
                                                                    j9 = com.anythink.basead.exoplayer.b.f6539b;
                                                                }
                                                            }
                                                        } else {
                                                            c4 = 65535;
                                                        }
                                                        z11 = false;
                                                        C3795qO c3795qO2 = x3.f33391g;
                                                        BQ bq42 = c3795qO2.f33713a;
                                                        boolean z152 = z11;
                                                        long j142 = c3795qO2.f33714b;
                                                        this.Y = N(bq42, j142, c3795qO2.f33716d, j142, !z152, 0);
                                                        J();
                                                        l();
                                                        if (V()) {
                                                            D0.H[] hArr52 = this.f31364n;
                                                            while (i16 < 2) {
                                                            }
                                                        }
                                                        if (this.Y.f35534e == 3) {
                                                        }
                                                        C3877s k122 = c3848rO2.s().k();
                                                        i15 = 0;
                                                        while (true) {
                                                            D0.H[] hArr62 = this.f31364n;
                                                            if (i15 >= 2) {
                                                                break;
                                                            }
                                                            i15++;
                                                        }
                                                        z10 = true;
                                                        j9 = com.anythink.basead.exoplayer.b.f6539b;
                                                    }
                                                    i13 = 3;
                                                    this.f31340E0.getClass();
                                                    C3848rO c3848rO4 = this.J;
                                                    s6 = c3848rO4.s();
                                                    if (s6 == null) {
                                                        p(j10);
                                                    } else {
                                                        long j15 = j10;
                                                        Trace.beginSection("doSomeWork");
                                                        l();
                                                        if (s6.f33389e) {
                                                            this.f31383z0 = AbstractC3548lu.u(SystemClock.elapsedRealtime());
                                                            s6.f33385a.l(this.Y.f35546r - this.f31339E);
                                                            int i29 = 0;
                                                            z12 = true;
                                                            z13 = true;
                                                            while (true) {
                                                                D0.H[] hArr7 = this.f31364n;
                                                                if (i29 < 2) {
                                                                    D0.H h11 = hArr7[i29];
                                                                    if (h11.r() == 0) {
                                                                        m(i29, false);
                                                                    } else {
                                                                        h11.B(this.f31381y0, this.f31383z0);
                                                                        z12 = z12 && h11.y();
                                                                        boolean C7 = h11.C(s6);
                                                                        m(i29, C7);
                                                                        z13 = z13 && C7;
                                                                        if (!C7) {
                                                                            U(i29);
                                                                        }
                                                                    }
                                                                    i29++;
                                                                }
                                                            }
                                                        } else {
                                                            s6.f33385a.m();
                                                            z12 = true;
                                                            z13 = true;
                                                        }
                                                        long j16 = s6.f33391g.f33717e;
                                                        if (z12 && s6.f33389e) {
                                                            j11 = com.anythink.basead.exoplayer.b.f6539b;
                                                            if (j16 == com.anythink.basead.exoplayer.b.f6539b || j16 <= this.Y.f35546r) {
                                                                if (this.f31367p0) {
                                                                    this.f31367p0 = false;
                                                                    int i30 = this.Y.f35542n;
                                                                    this.f31363Z.f(0);
                                                                    g(this.f31356R.b(this.Y.f35534e, false), i30, 5, false);
                                                                }
                                                                if (s6.f33391g.f33720h) {
                                                                    c(4);
                                                                    j();
                                                                    j12 = -9223372036854775807L;
                                                                    int i31 = 2;
                                                                    if (this.Y.f35534e == 2) {
                                                                        int i32 = 0;
                                                                        while (true) {
                                                                            D0.H[] hArr8 = this.f31364n;
                                                                            if (i32 < i31) {
                                                                                if (hArr8[i32].m(s6) != null) {
                                                                                    U(i32);
                                                                                }
                                                                                i32++;
                                                                                i31 = 2;
                                                                            } else {
                                                                                C4280zO c4280zO2 = this.Y;
                                                                                if (!c4280zO2.f35536g && c4280zO2.f35545q < 500000 && A(c3848rO4.f34031k) && T()) {
                                                                                    if (this.f31338D0 == j12) {
                                                                                        this.f31338D0 = SystemClock.elapsedRealtime();
                                                                                    } else if (SystemClock.elapsedRealtime() - this.f31338D0 >= 4000) {
                                                                                        throw new Zs(0, 4000);
                                                                                    }
                                                                                    boolean z16 = !T() && this.Y.f35534e == i13;
                                                                                    this.Y.getClass();
                                                                                    i20 = this.Y.f35534e;
                                                                                    if (i20 != 4 && (z16 || i20 == 2 || (i20 == i13 && this.f31377w0 != 0))) {
                                                                                        p(j15);
                                                                                    }
                                                                                    Trace.endSection();
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    this.f31338D0 = j12;
                                                                    if (T()) {
                                                                    }
                                                                    this.Y.getClass();
                                                                    i20 = this.Y.f35534e;
                                                                    if (i20 != 4) {
                                                                        p(j15);
                                                                    }
                                                                    Trace.endSection();
                                                                }
                                                            }
                                                        } else {
                                                            j11 = com.anythink.basead.exoplayer.b.f6539b;
                                                        }
                                                        C4280zO c4280zO3 = this.Y;
                                                        if (c4280zO3.f35534e == 2) {
                                                            if (this.f31377w0 == 0) {
                                                                e6 = E();
                                                                j12 = j11;
                                                            } else if (z13) {
                                                                if (c4280zO3.f35536g) {
                                                                    C3741pO s10 = c3848rO4.s();
                                                                    long b9 = o(this.Y.f35530a, s10.f33391g.f33713a) ? this.f31348I0.b() : j11;
                                                                    C3741pO c3741pO = c3848rO4.f34031k;
                                                                    boolean z17 = c3741pO.b() && c3741pO.f33391g.f33720h;
                                                                    boolean z18 = c3741pO.f33391g.f33713a.b() && !c3741pO.f33389e;
                                                                    if (!z17 && !z18) {
                                                                        long R8 = R(c3741pO.d());
                                                                        InterfaceC3525lO interfaceC3525lO = this.f31380y;
                                                                        VO vo = this.f31351M;
                                                                        AbstractC3832r8 abstractC3832r82 = this.Y.f35530a;
                                                                        BQ bq5 = s10.f33391g.f33713a;
                                                                        float f6 = this.f31341F.h().f34712a;
                                                                        j12 = j11;
                                                                        boolean z19 = this.Y.f35540l;
                                                                        e6 = interfaceC3525lO.e(new C3417jO(vo, abstractC3832r82, bq5, R8, f6, this.f31368q0, b9));
                                                                    }
                                                                }
                                                                j12 = j11;
                                                                c(i13);
                                                                this.C0 = rn2;
                                                                if (T()) {
                                                                    y(false, false);
                                                                    Js js = this.f31341F;
                                                                    js.f25832u = true;
                                                                    JO jo = (JO) js.f25833v;
                                                                    if (!jo.f25764n) {
                                                                        jo.f25766v = SystemClock.elapsedRealtime();
                                                                        jo.f25764n = true;
                                                                    }
                                                                    i();
                                                                }
                                                                int i312 = 2;
                                                                if (this.Y.f35534e == 2) {
                                                                }
                                                                this.f31338D0 = j12;
                                                                if (T()) {
                                                                }
                                                                this.Y.getClass();
                                                                i20 = this.Y.f35534e;
                                                                if (i20 != 4) {
                                                                }
                                                                Trace.endSection();
                                                            }
                                                            if (e6) {
                                                                c(i13);
                                                                this.C0 = rn2;
                                                                if (T()) {
                                                                }
                                                                int i3122 = 2;
                                                                if (this.Y.f35534e == 2) {
                                                                }
                                                                this.f31338D0 = j12;
                                                                if (T()) {
                                                                }
                                                                this.Y.getClass();
                                                                i20 = this.Y.f35534e;
                                                                if (i20 != 4) {
                                                                }
                                                                Trace.endSection();
                                                            }
                                                            if (this.Y.f35534e == i13) {
                                                                if (this.f31377w0 == 0) {
                                                                    if (!E()) {
                                                                        y(T(), false);
                                                                        c(2);
                                                                        if (this.f31368q0) {
                                                                            for (C3741pO s11 = c3848rO4.s(); s11 != null; s11 = s11.i()) {
                                                                                for (InterfaceC3716p interfaceC3716p : (InterfaceC3716p[]) s11.k().f34151v) {
                                                                                }
                                                                            }
                                                                            this.f31348I0.a();
                                                                        }
                                                                        j();
                                                                    }
                                                                }
                                                            }
                                                            int i31222 = 2;
                                                            if (this.Y.f35534e == 2) {
                                                            }
                                                            this.f31338D0 = j12;
                                                            if (T()) {
                                                            }
                                                            this.Y.getClass();
                                                            i20 = this.Y.f35534e;
                                                            if (i20 != 4) {
                                                            }
                                                            Trace.endSection();
                                                        }
                                                        j12 = j11;
                                                        if (this.Y.f35534e == i13) {
                                                        }
                                                        int i312222 = 2;
                                                        if (this.Y.f35534e == 2) {
                                                        }
                                                        this.f31338D0 = j12;
                                                        if (T()) {
                                                        }
                                                        this.Y.getClass();
                                                        i20 = this.Y.f35534e;
                                                        if (i20 != 4) {
                                                        }
                                                        Trace.endSection();
                                                    }
                                                    message2 = message;
                                                    z8 = true;
                                                }
                                                j10 = uptimeMillis;
                                                rn2 = null;
                                                i10 = 1;
                                                t11 = c3848rO2.t();
                                                if (t11 != null) {
                                                    t12 = c3848rO2.t();
                                                    k6 = t12.k();
                                                    i17 = i10;
                                                    i18 = 0;
                                                    while (true) {
                                                        hArr = this.f31364n;
                                                        if (i18 >= 2) {
                                                        }
                                                        int r92 = hArr[i18].r();
                                                        int c92 = hArr[i18].c(t12, k6, this.f31341F);
                                                        this.f31377w0 -= r92 - hArr[i18].r();
                                                        i17 &= c92 & 1;
                                                        i18++;
                                                    }
                                                }
                                                z10 = false;
                                                while (T()) {
                                                    if (z10) {
                                                    }
                                                    this.f31344G0 = false;
                                                    x3 = c3848rO2.x();
                                                    if (x3 != null) {
                                                    }
                                                }
                                                i13 = 3;
                                                this.f31340E0.getClass();
                                                C3848rO c3848rO42 = this.J;
                                                s6 = c3848rO42.s();
                                                if (s6 == null) {
                                                }
                                                message2 = message;
                                                z8 = true;
                                            }
                                        }
                                    }
                                    j9 = com.anythink.basead.exoplayer.b.f6539b;
                                    t10 = c3848rO2.t();
                                    if (t10 != null) {
                                    }
                                    j10 = uptimeMillis;
                                    rn2 = null;
                                    i10 = 1;
                                    t11 = c3848rO2.t();
                                    if (t11 != null) {
                                    }
                                    z10 = false;
                                    while (T()) {
                                    }
                                    i13 = 3;
                                    this.f31340E0.getClass();
                                    C3848rO c3848rO422 = this.J;
                                    s6 = c3848rO422.s();
                                    if (s6 == null) {
                                    }
                                    message2 = message;
                                    z8 = true;
                                }
                            }
                            c3848rO2 = c3848rO3;
                            j9 = com.anythink.basead.exoplayer.b.f6539b;
                            t10 = c3848rO2.t();
                            if (t10 != null) {
                            }
                            j10 = uptimeMillis;
                            rn2 = null;
                            i10 = 1;
                            t11 = c3848rO2.t();
                            if (t11 != null) {
                            }
                            z10 = false;
                            while (T()) {
                            }
                            i13 = 3;
                            this.f31340E0.getClass();
                            C3848rO c3848rO4222 = this.J;
                            s6 = c3848rO4222.s();
                            if (s6 == null) {
                            }
                            message2 = message;
                            z8 = true;
                        }
                    }
                    j10 = uptimeMillis;
                    i13 = 3;
                    rn2 = null;
                    C3848rO c3848rO42222 = this.J;
                    s6 = c3848rO42222.s();
                    if (s6 == null) {
                    }
                    message2 = message;
                    z8 = true;
                }
                d(message2.what);
                return z8;
            case 3:
                z8 = true;
                q((C3311hO) message2.obj);
                d(message2.what);
                return z8;
            case 4:
                z8 = true;
                C4045v5 c4045v5 = (C4045v5) message2.obj;
                this.f31382z.d(16);
                this.f31341F.b(c4045v5);
                C4045v5 h12 = this.f31341F.h();
                K(h12, h12.f34712a, true, true);
                d(message2.what);
                return z8;
            case 5:
                z8 = true;
                this.f31357S = (HO) message2.obj;
                d(message2.what);
                return z8;
            case 6:
                z8 = true;
                u(false, true);
                d(message2.what);
                return z8;
            case 7:
                C2865Xm c2865Xm = (C2865Xm) message2.obj;
                try {
                    v(true, false, true, false);
                    int i33 = 0;
                    while (true) {
                        D0.H[] hArr9 = this.f31364n;
                        if (i33 >= 2) {
                            this.f31380y.a(this.f31351M);
                            this.f31356R.c();
                            this.f31376w.c();
                            c(1);
                            this.f31382z.f33230a.removeCallbacksAndMessages(null);
                            this.f31332A.d();
                            c2865Xm.a();
                            return true;
                        }
                        this.f31372u[i33].s0();
                        hArr9[i33].d();
                        i33++;
                    }
                } finally {
                    this.f31382z.f33230a.removeCallbacksAndMessages(null);
                    this.f31332A.d();
                    c2865Xm.a();
                }
            case 8:
                try {
                    try {
                        AQ aq = (AQ) message2.obj;
                        C3848rO c3848rO5 = this.J;
                        C3741pO c3741pO2 = c3848rO5.f34031k;
                        if (!(c3741pO2 != null && c3741pO2.f33385a == aq)) {
                            z8 = true;
                            C3741pO A8 = c3848rO5.A(aq);
                            if (A8 != null) {
                                PA.T(!A8.f33389e);
                                float f9 = this.f31341F.h().f34712a;
                                A8.e(this.Y.f35530a);
                                C3741pO c3741pO3 = c3848rO5.f34032l;
                                if (c3741pO3 != null && c3741pO3.f33385a == aq) {
                                    I();
                                }
                            }
                        } else {
                            if (c3741pO2 == null) {
                                throw null;
                            }
                            if (!c3741pO2.f33389e) {
                                float f10 = this.f31341F.h().f34712a;
                                c3741pO2.e(this.Y.f35530a);
                            }
                            S(c3741pO2.f33391g.f33713a, c3741pO2.j(), c3741pO2.k());
                            if (c3741pO2 == c3848rO5.s()) {
                                s(c3741pO2.f33391g.f33714b, true);
                                O(new boolean[2], this.J.i.a());
                                c3741pO2.f33392h = true;
                                C4280zO c4280zO4 = this.Y;
                                try {
                                    BQ bq6 = c4280zO4.f35531b;
                                    long j17 = c3741pO2.f33391g.f33714b;
                                    z8 = true;
                                    this.Y = N(bq6, j17, c4280zO4.f35532c, j17, false, 5);
                                } catch (RN e28) {
                                    e = e28;
                                    if (e.f27352v == 1 && (t9 = this.J.t()) != null && e.f27348A == null) {
                                        e = e.a(t9.f33391g.f33713a);
                                    }
                                    if (e.f27352v == 1 && (bq = e.f27348A) != null) {
                                        int i262 = e.f27354x;
                                        c3848rO = this.J;
                                        if (c3848rO.u() != null && c3848rO.u().f33391g.f33713a.equals(bq) && this.f31364n[i262].z(c3848rO.u())) {
                                            this.f31344G0 = true;
                                            C();
                                            u7 = c3848rO.u();
                                            C3741pO s92 = c3848rO.s();
                                            if (c3848rO.s() != u7) {
                                                while (s92 != null && s92.i() != u7) {
                                                    s92 = s92.i();
                                                }
                                            }
                                            c3848rO.y(s92);
                                            if (this.Y.f35534e != 4) {
                                                L();
                                                this.f31382z.c(2);
                                            }
                                            z8 = true;
                                            d(message2.what);
                                            return z8;
                                        }
                                    }
                                    rn = this.C0;
                                    if (rn != null) {
                                        rn.addSuppressed(e);
                                        e = this.C0;
                                    }
                                    if (e.f27352v == 1) {
                                        C3848rO c3848rO6 = this.J;
                                        if (c3848rO6.s() != c3848rO6.t()) {
                                            while (c3848rO6.s() != c3848rO6.t()) {
                                                c3848rO6.x();
                                            }
                                            C3741pO s12 = c3848rO6.s();
                                            s12.getClass();
                                            d(message2.what);
                                            C3795qO c3795qO3 = s12.f33391g;
                                            BQ bq7 = c3795qO3.f33713a;
                                            long j18 = c3795qO3.f33714b;
                                            this.Y = N(bq7, j18, c3795qO3.f33716d, j18, true, 0);
                                        }
                                    }
                                    if (e.f27349B || !(this.C0 == null || (i4 = e.f27350n) == 5004 || i4 == 5003)) {
                                        AbstractC3217fl.X("ExoPlayerImplInternal", "Playback error", e);
                                        z8 = true;
                                        u(true, false);
                                        this.Y = this.Y.e(e);
                                        d(message2.what);
                                        return z8;
                                    }
                                    AbstractC3217fl.O("ExoPlayerImplInternal", "Recoverable renderer error", e);
                                    if (this.C0 == null) {
                                        this.C0 = e;
                                    }
                                    C3709ot c3709ot2 = this.f31382z;
                                    C3333ht b10 = c3709ot2.b(25, e);
                                    Message message3 = b10.f31278a;
                                    message3.getClass();
                                    c3709ot2.f33230a.sendMessageAtFrontOfQueue(message3);
                                    b10.f31278a = null;
                                    C3709ot.f(b10);
                                    z8 = true;
                                    d(message2.what);
                                    return z8;
                                }
                            } else {
                                z8 = true;
                            }
                            L();
                        }
                    } catch (RN e29) {
                        e = e29;
                    }
                } catch (LP e30) {
                    e = e30;
                    b(e, e.f26158n);
                    z8 = true;
                    d(message2.what);
                    return z8;
                } catch (NH e31) {
                    e = e31;
                    b(e, e.f26510n);
                    z8 = true;
                    d(message2.what);
                    return z8;
                } catch (W4 e32) {
                    e = e32;
                    b(e, e.f28365u == 1 ? true != e.f28364n ? 3003 : AdError.MEDIATION_ERROR_CODE : 1000);
                    z8 = true;
                    d(message2.what);
                    return z8;
                } catch (IOException e33) {
                    e = e33;
                    b(e, 2000);
                    z8 = true;
                    d(message2.what);
                    return z8;
                } catch (RuntimeException e34) {
                    e = e34;
                    i = 1004;
                    if (!(e instanceof IllegalStateException) && !(e instanceof IllegalArgumentException)) {
                        i = 1000;
                    }
                    RN rn32 = new RN(2, e, i);
                    AbstractC3217fl.X("ExoPlayerImplInternal", "Playback error", rn32);
                    u(true, false);
                    this.Y = this.Y.e(rn32);
                    z8 = true;
                    d(message2.what);
                    return z8;
                }
                d(message2.what);
                return z8;
            case 9:
                AQ aq2 = (AQ) message2.obj;
                C3848rO c3848rO7 = this.J;
                C3741pO c3741pO4 = c3848rO7.f34031k;
                if (c3741pO4 != null && c3741pO4.f33385a == aq2) {
                    c3848rO7.n(this.f31381y0);
                    L();
                } else {
                    C3741pO c3741pO5 = c3848rO7.f34032l;
                    if (c3741pO5 != null && c3741pO5.f33385a == aq2) {
                        I();
                    }
                }
                z8 = true;
                d(message2.what);
                return z8;
            case 10:
                D();
                z8 = true;
                d(message2.what);
                return z8;
            case 11:
                int i34 = message2.arg1;
                this.f31371t0 = i34;
                int k13 = this.J.k(this.Y.f35530a, i34);
                if ((k13 & 1) != 0) {
                    h(true);
                } else if ((k13 & 2) != 0) {
                    C();
                }
                Q(false);
                z8 = true;
                d(message2.what);
                return z8;
            case 12:
                boolean z20 = message2.arg1 != 0;
                this.f31373u0 = z20;
                int l9 = this.J.l(this.Y.f35530a, z20);
                if ((l9 & 1) != 0) {
                    h(true);
                } else if ((l9 & 2) != 0) {
                    C();
                }
                Q(false);
                z8 = true;
                d(message2.what);
                return z8;
            case 13:
                boolean z21 = message2.arg1 != 0;
                C2865Xm c2865Xm2 = (C2865Xm) message2.obj;
                if (this.f31375v0 != z21) {
                    this.f31375v0 = z21;
                    if (!z21) {
                        D0.H[] hArr10 = this.f31364n;
                        for (int i35 = 0; i35 < 2; i35++) {
                            hArr10[i35].b();
                        }
                    }
                }
                if (c2865Xm2 != null) {
                    c2865Xm2.a();
                }
                z8 = true;
                d(message2.what);
                return z8;
            case 14:
                CO co = (CO) message2.obj;
                if (co.f24171e == this.f31334B) {
                    synchronized (co) {
                    }
                    try {
                        co.f24167a.c(co.f24169c, co.f24170d);
                        co.b(true);
                        int i36 = this.Y.f35534e;
                        if (i36 == 3 || i36 == 2) {
                            this.f31382z.c(2);
                        }
                    } catch (Throwable th) {
                        co.b(true);
                        throw th;
                    }
                } else {
                    this.f31382z.b(15, co).a();
                }
                z8 = true;
                d(message2.what);
                return z8;
            case 15:
                CO co2 = (CO) message2.obj;
                Looper looper = co2.f24171e;
                if (looper.getThread().isAlive()) {
                    this.f31345H.A(looper, null).e(new RunnableC3873rw(14, co2));
                } else {
                    AbstractC3217fl.I("TAG", "Trying to send message on a dead thread.");
                    co2.b(false);
                }
                z8 = true;
                d(message2.what);
                return z8;
            case 16:
                C4045v5 c4045v52 = (C4045v5) message2.obj;
                K(c4045v52, c4045v52.f34712a, true, false);
                z8 = true;
                d(message2.what);
                return z8;
            case 17:
                C3257gO c3257gO = (C3257gO) message2.obj;
                this.f31363Z.f(1);
                if (c3257gO.f31003b != -1) {
                    this.f31379x0 = new C3311hO(new EO(c3257gO.f31002a, c3257gO.f31005d), c3257gO.f31003b, c3257gO.a());
                }
                F(this.f31349K.i(c3257gO.f31002a, c3257gO.f31005d), false);
                z8 = true;
                d(message2.what);
                return z8;
            case 18:
                C3257gO c3257gO2 = (C3257gO) message2.obj;
                int i37 = message2.arg1;
                this.f31363Z.f(1);
                C3.m mVar = this.f31349K;
                if (i37 == -1) {
                    i37 = ((ArrayList) mVar.f452w).size();
                }
                F(mVar.j(i37, c3257gO2.f31002a, c3257gO2.f31005d), false);
                z8 = true;
                d(message2.what);
                return z8;
            case 19:
                D.y.r(message2.obj);
                this.f31363Z.f(1);
                throw null;
            case 20:
                int i38 = message2.arg1;
                int i39 = message2.arg2;
                XQ xq = (XQ) message2.obj;
                this.f31363Z.f(1);
                F(this.f31349K.k(i38, i39, xq), false);
                z8 = true;
                d(message2.what);
                return z8;
            case 21:
                XQ xq2 = (XQ) message2.obj;
                this.f31363Z.f(1);
                F(this.f31349K.l(xq2), false);
                z8 = true;
                d(message2.what);
                return z8;
            case 22:
                F(this.f31349K.g(), true);
                z8 = true;
                d(message2.what);
                return z8;
            case 23:
                this.f31366o0 = message2.arg1 != 0;
                J();
                if (this.f31367p0) {
                    C3848rO c3848rO8 = this.J;
                    if (c3848rO8.t() != c3848rO8.s()) {
                        h(true);
                        Q(false);
                    }
                }
                z8 = true;
                d(message2.what);
                return z8;
            case 24:
            default:
                return false;
            case 25:
                D();
                h(true);
                z8 = true;
                d(message2.what);
                return z8;
            case 26:
                D();
                h(true);
                z8 = true;
                d(message2.what);
                return z8;
            case 27:
                int i40 = message2.arg1;
                int i41 = message2.arg2;
                List list = (List) message2.obj;
                this.f31363Z.f(1);
                F(this.f31349K.c(i40, i41, list), false);
                z8 = true;
                d(message2.what);
                return z8;
            case 28:
                TN tn = (TN) message2.obj;
                this.f31340E0 = tn;
                C3848rO c3848rO9 = this.J;
                AbstractC3832r8 abstractC3832r83 = this.Y.f35530a;
                c3848rO9.m(tn);
                z8 = true;
                d(message2.what);
                return z8;
            case 29:
                this.f31363Z.f(1);
                v(false, false, false, true);
                this.f31380y.i(this.f31351M);
                c(true != this.Y.f35530a.g() ? 2 : 4);
                C4280zO c4280zO5 = this.Y;
                boolean z22 = c4280zO5.f35540l;
                g(this.f31356R.b(c4280zO5.f35534e, z22), c4280zO5.f35542n, c4280zO5.f35541m, z22);
                this.f31349K.f();
                this.f31382z.c(2);
                z8 = true;
                d(message2.what);
                return z8;
            case 30:
                Pair pair = (Pair) message2.obj;
                Object obj = pair.first;
                C2865Xm c2865Xm3 = (C2865Xm) pair.second;
                D0.H[] hArr11 = this.f31364n;
                for (int i42 = 0; i42 < 2; i42++) {
                    hArr11[i42].e(obj);
                }
                int i43 = this.Y.f35534e;
                if (i43 == 3 || i43 == 2) {
                    this.f31382z.c(2);
                }
                if (c2865Xm3 != null) {
                    c2865Xm3.a();
                }
                z8 = true;
                d(message2.what);
                return z8;
            case 31:
                C2777Sj c2777Sj = (C2777Sj) message2.obj;
                int i44 = message2.arg1;
                this.f31376w.d(c2777Sj);
                C3749pf c3749pf = this.f31356R;
                if (i44 == 0) {
                    c2777Sj = null;
                }
                c3749pf.a(c2777Sj);
                C4280zO c4280zO6 = this.Y;
                boolean z23 = c4280zO6.f35540l;
                g(this.f31356R.b(c4280zO6.f35534e, z23), c4280zO6.f35542n, c4280zO6.f35541m, z23);
                z8 = true;
                d(message2.what);
                return z8;
            case 32:
                f(((Float) message2.obj).floatValue());
                z8 = true;
                d(message2.what);
                return z8;
            case 33:
                int i45 = message2.arg1;
                C4280zO c4280zO7 = this.Y;
                g(i45, c4280zO7.f35542n, c4280zO7.f35541m, c4280zO7.f35540l);
                z8 = true;
                d(message2.what);
                return z8;
            case 34:
                f(this.f31346H0);
                z8 = true;
                d(message2.what);
                return z8;
            case 35:
                InterfaceC3233g0 interfaceC3233g0 = (InterfaceC3233g0) message2.obj;
                D0.H[] hArr12 = this.f31364n;
                for (int i46 = 0; i46 < 2; i46++) {
                    hArr12[i46].f(interfaceC3233g0);
                }
                z8 = true;
                d(message2.what);
                return z8;
            case 36:
                boolean booleanValue = ((Boolean) message2.obj).booleanValue();
                if (!booleanValue) {
                    if (this.f31361W != null && this.f31360V && !this.f31382z.a()) {
                        this.f31362X++;
                    }
                    int i47 = this.f31362X;
                    if (i47 > 0) {
                        this.f31354P.e(new RunnableC3873rw(this, i47));
                    }
                    this.f31362X = 0;
                    this.f31360V = false;
                    this.f31382z.d(37);
                    C3311hO c3311hO = this.f31361W;
                    if (c3311hO != null) {
                        q(c3311hO);
                        this.f31361W = null;
                        this.f31360V = false;
                    }
                }
                this.f31359U = booleanValue;
                t();
                z8 = true;
                d(message2.what);
                return z8;
            case 37:
                this.f31360V = false;
                C3311hO c3311hO2 = this.f31361W;
                if (c3311hO2 != null) {
                    q(c3311hO2);
                    this.f31361W = null;
                }
                z8 = true;
                d(message2.what);
                return z8;
            case com.anythink.basead.b.b.j.f5963M /* 38 */:
                this.f31358T = (GO) message2.obj;
                t();
                z8 = true;
                d(message2.what);
                return z8;
        }
    }

    public final void i() {
        C3741pO c3741pO = this.J.f34029h;
        if (c3741pO == null) {
            return;
        }
        C3877s c3877s = c3741pO.f33398o;
        for (int i = 0; i < 2; i++) {
            if (c3877s.b(i)) {
                this.f31364n[i].D();
            }
        }
    }

    public final void j() {
        Js js = this.f31341F;
        js.f25832u = false;
        JO jo = (JO) js.f25833v;
        if (jo.f25764n) {
            jo.a(jo.e());
            jo.f25764n = false;
        }
        for (int i = 0; i < 2; i++) {
            D0.H h9 = this.f31364n[i];
            AbstractC3149eQ abstractC3149eQ = (AbstractC3149eQ) h9.f594e;
            if (D0.H.l(abstractC3149eQ)) {
                D0.H.n(abstractC3149eQ);
            }
            AbstractC3149eQ abstractC3149eQ2 = (AbstractC3149eQ) h9.f595f;
            if (abstractC3149eQ2 != null && abstractC3149eQ2.f30355A != 0) {
                D0.H.n(abstractC3149eQ2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4282zQ
    public final void k(AQ aq) {
        this.f31382z.b(8, aq).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l() {
        long j9;
        int i;
        boolean z8;
        float f6;
        Js js;
        int i4;
        long j10;
        long j11;
        long max;
        C3848rO c3848rO = this.J;
        C3741pO c3741pO = c3848rO.f34029h;
        if (c3741pO == null) {
            return;
        }
        long t9 = c3741pO.f33389e ? c3741pO.f33385a.t() : -9223372036854775807L;
        if (t9 != com.anythink.basead.exoplayer.b.f6539b) {
            if (!c3741pO.b()) {
                c3848rO.y(c3741pO);
                Q(false);
                L();
            }
            s(t9, true);
            if (t9 != this.Y.f35546r) {
                C4280zO c4280zO = this.Y;
                j9 = -9223372036854775807L;
                i = 16;
                this.Y = N(c4280zO.f35531b, t9, c4280zO.f35532c, t9, true, 5);
            } else {
                j9 = -9223372036854775807L;
                i = 16;
            }
        } else {
            j9 = -9223372036854775807L;
            i = 16;
            Js js2 = this.f31341F;
            boolean z9 = c3741pO != c3848rO.i;
            AbstractC3149eQ abstractC3149eQ = (AbstractC3149eQ) js2.f25835x;
            JO jo = (JO) js2.f25833v;
            if (abstractC3149eQ == null || abstractC3149eQ.I() || ((z9 && ((AbstractC3149eQ) js2.f25835x).f30355A != 2) || (!((AbstractC3149eQ) js2.f25835x).H() && (z9 || ((AbstractC3149eQ) js2.f25835x).q0())))) {
                js2.f25831n = true;
                if (js2.f25832u && !jo.f25764n) {
                    jo.f25766v = SystemClock.elapsedRealtime();
                    jo.f25764n = true;
                }
            } else {
                InterfaceC3687oO interfaceC3687oO = (InterfaceC3687oO) js2.f25836y;
                interfaceC3687oO.getClass();
                long e6 = interfaceC3687oO.e();
                if (js2.f25831n) {
                    if (e6 >= jo.e()) {
                        js2.f25831n = false;
                        if (js2.f25832u && !jo.f25764n) {
                            jo.f25766v = SystemClock.elapsedRealtime();
                            jo.f25764n = true;
                        }
                    } else if (jo.f25764n) {
                        jo.a(jo.e());
                        jo.f25764n = false;
                    }
                }
                jo.a(e6);
                C4045v5 h9 = interfaceC3687oO.h();
                if (!h9.equals(jo.f25767w)) {
                    jo.b(h9);
                    ((C3365iO) js2.f25834w).f31382z.b(16, h9).a();
                }
            }
            long e9 = js2.e();
            this.f31381y0 = e9;
            long j12 = e9 - c3741pO.f33399p;
            long j13 = this.Y.f35546r;
            ArrayList arrayList = this.f31343G;
            if (!arrayList.isEmpty() && !this.Y.f35531b.b()) {
                if (this.f31335B0) {
                    this.f31335B0 = false;
                }
                C4280zO c4280zO2 = this.Y;
                c4280zO2.f35530a.e(c4280zO2.f35531b.f24043a);
                int min = Math.min(this.f31333A0, arrayList.size());
                if (min > 0 && arrayList.get(min - 1) != null) {
                    throw new ClassCastException();
                }
                if (min < arrayList.size() && arrayList.get(min) != null) {
                    throw new ClassCastException();
                }
                this.f31333A0 = min;
            }
            if (js2.g()) {
                boolean z10 = !this.f31363Z.f34531d;
                C4280zO c4280zO3 = this.Y;
                this.Y = N(c4280zO3.f35531b, j12, c4280zO3.f35532c, j12, z10, 6);
            } else {
                C4280zO c4280zO4 = this.Y;
                c4280zO4.f35546r = j12;
                c4280zO4.f35547s = SystemClock.elapsedRealtime();
            }
        }
        this.Y.f35544p = c3848rO.f34031k.d();
        C4280zO c4280zO5 = this.Y;
        c4280zO5.f35545q = R(c4280zO5.f35544p);
        C4280zO c4280zO6 = this.Y;
        if (!c4280zO6.f35540l || c4280zO6.f35534e != 3 || !o(c4280zO6.f35530a, c4280zO6.f35531b)) {
            return;
        }
        C4280zO c4280zO7 = this.Y;
        if (c4280zO7.f35543o.f34712a != 1.0f) {
            return;
        }
        NN nn = this.f31348I0;
        long n9 = n(c4280zO7.f35530a, c4280zO7.f35531b.f24043a, c4280zO7.f35546r);
        long j14 = this.Y.f35545q;
        if (nn.f26529c != j9) {
            long j15 = n9 - j14;
            long j16 = nn.f26536k;
            if (j16 == j9) {
                nn.f26536k = j15;
                nn.f26537l = 0L;
                i4 = 1;
            } else {
                i4 = 1;
                nn.f26536k = Math.max(j15, (long) ((j15 * 9.999871E-4f) + (j16 * 0.999f)));
                nn.f26537l = (long) ((Math.abs(j15 - r13) * 9.999871E-4f) + (nn.f26537l * 0.999f));
            }
            if (nn.f26535j != j9) {
                j10 = 1000;
                f6 = SystemClock.elapsedRealtime() - nn.f26535j < 1000 ? nn.i : 1.0f;
            } else {
                j10 = 1000;
            }
            nn.f26535j = SystemClock.elapsedRealtime();
            long j17 = (nn.f26537l * 3) + nn.f26536k;
            if (nn.f26534h > j17) {
                long u7 = AbstractC3548lu.u(j10);
                int i9 = i4;
                float f9 = nn.i - 1.0f;
                z8 = false;
                long j18 = nn.f26531e;
                j11 = n9;
                float f10 = u7;
                long j19 = nn.f26534h - (((long) (f9 * f10)) + ((long) (0.029999971f * f10)));
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
                nn.f26534h = max;
            } else {
                j11 = n9;
                z8 = false;
                long max2 = j11 - ((long) (Math.max(0.0f, nn.i - 1.0f) / 1.0E-7f));
                long j21 = nn.f26534h;
                String str = AbstractC3548lu.f32613a;
                max = Math.max(j21, Math.min(max2, j17));
                nn.f26534h = max;
                long j22 = nn.f26533g;
                if (j22 != j9 && max > j22) {
                    nn.f26534h = j22;
                    max = j22;
                }
            }
            long j23 = j11 - max;
            if (Math.abs(j23) < nn.f26527a) {
                nn.i = 1.0f;
                f6 = 1.0f;
            } else {
                f6 = Math.max(0.97f, Math.min((j23 * 1.0E-7f) + 1.0f, 1.03f));
                nn.i = f6;
            }
            js = this.f31341F;
            if (js.h().f34712a == f6) {
                C4045v5 c4045v5 = new C4045v5(f6, this.Y.f35543o.f34713b);
                this.f31382z.d(i);
                this.f31341F.b(c4045v5);
                boolean z11 = z8;
                K(this.Y.f35543o, js.h().f34712a, z11, z11);
                return;
            }
            return;
        }
        z8 = false;
        js = this.f31341F;
        if (js.h().f34712a == f6) {
        }
    }

    public final void m(int i, boolean z8) {
        boolean[] zArr = this.f31374v;
        if (zArr[i] != z8) {
            zArr[i] = z8;
            this.f31354P.e(new L.a(this, i, z8));
        }
    }

    public final long n(AbstractC3832r8 abstractC3832r8, Object obj, long j9) {
        int i = abstractC3832r8.o(obj, this.f31337D).f26108c;
        Y7 y72 = this.f31336C;
        abstractC3832r8.b(i, y72, 0L);
        if (y72.f28797d == com.anythink.basead.exoplayer.b.f6539b || !y72.b() || !y72.f28800g) {
            return com.anythink.basead.exoplayer.b.f6539b;
        }
        long j10 = y72.f28798e;
        String str = AbstractC3548lu.f32613a;
        return AbstractC3548lu.u((j10 == com.anythink.basead.exoplayer.b.f6539b ? System.currentTimeMillis() : j10 + SystemClock.elapsedRealtime()) - y72.f28797d) - j9;
    }

    public final boolean o(AbstractC3832r8 abstractC3832r8, BQ bq) {
        if (bq.b() || abstractC3832r8.g()) {
            return false;
        }
        int i = abstractC3832r8.o(bq.f24043a, this.f31337D).f26108c;
        Y7 y72 = this.f31336C;
        abstractC3832r8.b(i, y72, 0L);
        return y72.b() && y72.f28800g && y72.f28797d != com.anythink.basead.exoplayer.b.f6539b;
    }

    public final void p(long j9) {
        boolean z8 = true;
        if (!this.f31352N) {
            if (this.f31359U) {
                this.f31358T.getClass();
            } else {
                z8 = false;
            }
        }
        long j10 = f31331J0;
        if (z8) {
            r3 = this.Y.f35534e != 3 ? j10 : 1000L;
            for (int i = 0; i < 2; i++) {
                D0.H h9 = this.f31364n[i];
                long j11 = this.f31381y0;
                AbstractC3149eQ abstractC3149eQ = (AbstractC3149eQ) h9.f594e;
                long S8 = D0.H.l(abstractC3149eQ) ? abstractC3149eQ.S(j11) : Long.MAX_VALUE;
                AbstractC3149eQ abstractC3149eQ2 = (AbstractC3149eQ) h9.f595f;
                if (abstractC3149eQ2 != null && abstractC3149eQ2.f30355A != 0) {
                    S8 = Math.min(S8, abstractC3149eQ2.S(j11));
                }
                r3 = Math.min(r3, AbstractC3548lu.t(S8));
            }
            if (this.Y.i()) {
                C3741pO c3741pO = this.J.f34029h;
                if ((c3741pO != null ? c3741pO.f33396m : null) != null) {
                    if (this.f31381y0 + (AbstractC3548lu.u(r3) * this.Y.f35543o.f34712a) >= r1.a()) {
                        r3 = Math.min(r3, j10);
                    }
                }
            }
        } else if (this.Y.f35534e != 3 || T()) {
            r3 = j10;
        }
        this.f31382z.f33230a.sendEmptyMessageAtTime(2, j9 + r3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x00a5, code lost:
    
        r7.f26111f.getClass();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(C3311hO c3311hO) {
        long longValue;
        long j9;
        BQ E8;
        boolean z8;
        int i;
        long j10;
        boolean z9;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        C4280zO c4280zO;
        int i4;
        if (this.f31360V) {
            if (this.f31361W != null) {
                this.f31362X++;
                this.f31363Z.f(1);
            }
            this.f31361W = c3311hO;
            return;
        }
        this.f31363Z.f(1);
        AbstractC3832r8 abstractC3832r8 = this.Y.f35530a;
        int i9 = this.f31371t0;
        boolean z10 = this.f31373u0;
        Y7 y72 = this.f31336C;
        L7 l72 = this.f31337D;
        Pair z11 = z(abstractC3832r8, c3311hO, i9, z10, y72, l72);
        long j16 = com.anythink.basead.exoplayer.b.f6539b;
        if (z11 == null) {
            Pair w9 = w(this.Y.f35530a);
            BQ bq = (BQ) w9.first;
            longValue = ((Long) w9.second).longValue();
            z8 = !this.Y.f35530a.g();
            E8 = bq;
            j9 = -9223372036854775807L;
        } else {
            Object obj = z11.first;
            longValue = ((Long) z11.second).longValue();
            long j17 = c3311hO.f31233c;
            if (j17 == com.anythink.basead.exoplayer.b.f6539b) {
                j9 = -9223372036854775807L;
            } else {
                j9 = -9223372036854775807L;
                j16 = longValue;
            }
            E8 = this.J.E(this.Y.f35530a, obj);
            if (E8.b()) {
                this.Y.f35530a.o(E8.f24043a, l72);
                C2904a a9 = l72.f26111f.a(-1);
                int i10 = 0;
                while (true) {
                    int[] iArr = a9.f29141d;
                    if (i10 >= iArr.length || (i = iArr[i10]) == 0 || i == 1) {
                        break;
                    } else {
                        i10++;
                    }
                }
                l72.f26111f.a(-1).getClass();
                j16 = Math.max(j16, 0L);
                longValue = 0;
            } else if (j17 != com.anythink.basead.exoplayer.b.f6539b) {
                z8 = false;
            }
            z8 = true;
        }
        try {
            if (this.Y.f35530a.g()) {
                this.f31379x0 = c3311hO;
            } else if (z11 == null) {
                if (this.Y.f35534e != 1) {
                    c(4);
                }
                v(false, true, false, true);
            } else {
                if (E8.equals(this.Y.f35531b)) {
                    C3741pO c3741pO = this.J.f34029h;
                    if (c3741pO == null || !c3741pO.f33389e || longValue == 0) {
                        j15 = longValue;
                    } else {
                        C4012uQ c4012uQ = c3741pO.f33385a;
                        long j18 = y72.f28802j;
                        if (this.f31359U && j18 != j9) {
                            this.f31358T.getClass();
                        }
                        j15 = c4012uQ.a(longValue, this.f31357S);
                    }
                    long j19 = j15;
                    if (AbstractC3548lu.t(j15) == AbstractC3548lu.t(this.Y.f35546r) && ((i4 = (c4280zO = this.Y).f35534e) == 2 || i4 == 3)) {
                        longValue = c4280zO.f35546r;
                    } else {
                        j12 = j19;
                    }
                } else {
                    j12 = longValue;
                }
                if (this.f31359U) {
                    D0.H[] hArr = this.f31364n;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= 2) {
                            break;
                        }
                        D0.H h9 = hArr[i11];
                        if (h9.g() && ((AbstractC3149eQ) h9.f594e).f30422u == 2) {
                            this.f31360V = true;
                            break;
                        }
                        i11++;
                    }
                }
                boolean z12 = this.Y.f35534e == 4;
                C3848rO c3848rO = this.J;
                long r9 = r(E8, j12, c3848rO.f34029h != c3848rO.i, z12);
                z9 = z8 | (longValue != r9);
                try {
                    C4280zO c4280zO2 = this.Y;
                    BQ bq2 = E8;
                    try {
                        AbstractC3832r8 abstractC3832r82 = c4280zO2.f35530a;
                        long j20 = j16;
                        try {
                            G(abstractC3832r82, bq2, abstractC3832r82, c4280zO2.f35531b, j20, true);
                            E8 = bq2;
                            j13 = j20;
                            j14 = r9;
                            this.Y = N(E8, j14, j13, j14, z9, 2);
                        } catch (Throwable th) {
                            th = th;
                            E8 = bq2;
                            j10 = j20;
                            j11 = r9;
                            this.Y = N(E8, j11, j10, j11, z9, 2);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        E8 = bq2;
                        j10 = j16;
                        j11 = r9;
                        this.Y = N(E8, j11, j10, j11, z9, 2);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            z9 = z8;
            j13 = j16;
            j14 = longValue;
            this.Y = N(E8, j14, j13, j14, z9, 2);
        } catch (Throwable th4) {
            th = th4;
            j10 = j16;
            z9 = z8;
            j11 = longValue;
        }
    }

    public final long r(BQ bq, long j9, boolean z8, boolean z9) {
        j();
        boolean z10 = true;
        y(false, true);
        if (z9 || this.Y.f35534e == 3) {
            c(2);
        }
        C3848rO c3848rO = this.J;
        C3741pO c3741pO = c3848rO.f34029h;
        C3741pO c3741pO2 = c3741pO;
        while (c3741pO2 != null && !bq.equals(c3741pO2.f33391g.f33713a)) {
            c3741pO2 = c3741pO2.f33396m;
        }
        if (z8 || c3741pO != c3741pO2 || (c3741pO2 != null && c3741pO2.f33399p + j9 < 0)) {
            B();
            if (c3741pO2 != null) {
                while (c3848rO.f34029h != c3741pO2) {
                    c3848rO.x();
                }
                c3848rO.y(c3741pO2);
                c3741pO2.f33399p = 1000000000000L;
                O(new boolean[2], this.J.i.a());
                c3741pO2.f33392h = true;
            }
        }
        C();
        if (c3741pO2 != null) {
            c3848rO.y(c3741pO2);
            if (!c3741pO2.f33389e) {
                c3741pO2.f33391g = c3741pO2.f33391g.a(j9, com.anythink.basead.exoplayer.b.f6539b);
            } else if (c3741pO2.f33390f) {
                if (this.f31359U) {
                    this.f31358T.getClass();
                    if (!this.Y.f35530a.g() && c3741pO2.f33391g.f33713a.equals(this.Y.f35531b)) {
                        long j10 = c3741pO2.f33399p + j9;
                        D0.H[] hArr = this.f31364n;
                        boolean z11 = true;
                        for (int i = 0; i < 2; i++) {
                            D0.H h9 = hArr[i];
                            if (h9.g()) {
                                AbstractC3149eQ m8 = h9.m(c3741pO2);
                                z11 &= m8 != null && m8.p(j10);
                            }
                        }
                        if (z11) {
                            C4012uQ c4012uQ = c3741pO2.f33385a;
                            long j11 = this.Y.f35546r;
                            HO ho = HO.f25361b;
                            if (c4012uQ.a(j11, ho) == c4012uQ.a(j9, ho)) {
                                z10 = false;
                            }
                        }
                    }
                }
                C4012uQ c4012uQ2 = c3741pO2.f33385a;
                j9 = c4012uQ2.h(j9);
                c4012uQ2.l(j9 - this.f31339E);
            }
            s(j9, z10);
            L();
        } else {
            c3848rO.B();
            s(j9, true);
        }
        Q(false);
        this.f31382z.c(2);
        return j9;
    }

    public final void s(long j9, boolean z8) {
        C3741pO c3741pO = this.J.f34029h;
        long j10 = j9 + (c3741pO == null ? 1000000000000L : c3741pO.f33399p);
        this.f31381y0 = j10;
        ((JO) this.f31341F.f25833v).a(j10);
        for (int i = 0; i < 2; i++) {
            D0.H h9 = this.f31364n[i];
            long j11 = this.f31381y0;
            AbstractC3149eQ m8 = h9.m(c3741pO);
            if (m8 != null) {
                m8.M(j11, false, z8);
            }
        }
        for (C3741pO c3741pO2 = r0.f34029h; c3741pO2 != null; c3741pO2 = c3741pO2.f33396m) {
            for (InterfaceC3716p interfaceC3716p : (InterfaceC3716p[]) c3741pO2.f33398o.f34151v) {
            }
        }
    }

    public final void t() {
        for (int i = 0; i < 2; i++) {
            D0.H h9 = this.f31364n[i];
            GO go = this.f31359U ? this.f31358T : null;
            ((AbstractC3149eQ) h9.f594e).c(18, go);
            AbstractC3149eQ abstractC3149eQ = (AbstractC3149eQ) h9.f595f;
            if (abstractC3149eQ != null) {
                abstractC3149eQ.c(18, go);
            }
        }
    }

    public final void u(boolean z8, boolean z9) {
        v(z8 || !this.f31375v0, false, true, false);
        this.f31363Z.f(z9 ? 1 : 0);
        this.f31380y.b(this.f31351M);
        this.f31356R.b(1, this.Y.f35540l);
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
    public final void v(boolean z8, boolean z9, boolean z10, boolean z11) {
        long j9;
        boolean z12;
        AbstractC3832r8 abstractC3832r8;
        BQ bq;
        AbstractC3832r8 abstractC3832r82;
        List list;
        this.f31382z.d(2);
        this.f31360V = false;
        boolean z13 = true;
        if (this.f31361W != null) {
            this.f31363Z.f(1);
            this.f31361W = null;
        }
        this.C0 = null;
        y(false, true);
        Js js = this.f31341F;
        js.f25832u = false;
        JO jo = (JO) js.f25833v;
        if (jo.f25764n) {
            jo.a(jo.e());
            jo.f25764n = false;
        }
        this.f31381y0 = 1000000000000L;
        try {
            B();
        } catch (RN | RuntimeException e6) {
            AbstractC3217fl.X("ExoPlayerImplInternal", "Disable failed.", e6);
        }
        if (z8) {
            D0.H[] hArr = this.f31364n;
            for (int i = 0; i < 2; i++) {
                try {
                    hArr[i].b();
                } catch (RuntimeException e9) {
                    AbstractC3217fl.X("ExoPlayerImplInternal", "Reset failed.", e9);
                }
            }
        }
        this.f31377w0 = 0;
        C4280zO c4280zO = this.Y;
        BQ bq2 = c4280zO.f35531b;
        long j10 = c4280zO.f35546r;
        if (!this.Y.f35531b.b()) {
            C4280zO c4280zO2 = this.Y;
            L7 l72 = this.f31337D;
            BQ bq3 = c4280zO2.f35531b;
            AbstractC3832r8 abstractC3832r83 = c4280zO2.f35530a;
            if (!abstractC3832r83.g() && !abstractC3832r83.o(bq3.f24043a, l72).f26110e) {
                j9 = this.Y.f35546r;
                if (z9) {
                    this.f31379x0 = null;
                    Pair w9 = w(this.Y.f35530a);
                    bq2 = (BQ) w9.first;
                    j10 = ((Long) w9.second).longValue();
                    boolean equals = bq2.equals(this.Y.f35531b);
                    j9 = com.anythink.basead.exoplayer.b.f6539b;
                    if (!equals) {
                        z12 = true;
                        long j11 = j10;
                        long j12 = j9;
                        C3848rO c3848rO = this.J;
                        c3848rO.B();
                        this.f31370s0 = false;
                        abstractC3832r8 = this.Y.f35530a;
                        if (z10 || !(abstractC3832r8 instanceof EO)) {
                            bq = bq2;
                            abstractC3832r82 = abstractC3832r8;
                        } else {
                            EO eo = (EO) abstractC3832r8;
                            XQ xq = (XQ) this.f31349K.f448E;
                            AbstractC3832r8[] abstractC3832r8Arr = eo.f24717h;
                            AbstractC3832r8[] abstractC3832r8Arr2 = new AbstractC3832r8[abstractC3832r8Arr.length];
                            int i4 = 0;
                            while (i4 < abstractC3832r8Arr.length) {
                                abstractC3832r8Arr2[i4] = new DO(eo, abstractC3832r8Arr[i4]);
                                i4++;
                                z13 = z13;
                            }
                            EO eo2 = new EO(abstractC3832r8Arr2, eo.i, xq);
                            if (bq2.f24044b != -1) {
                                Object obj = bq2.f24043a;
                                L7 l73 = this.f31337D;
                                eo2.o(obj, l73);
                                Y7 y72 = this.f31336C;
                                eo2.b(l73.f26108c, y72, 0L);
                                if (y72.b()) {
                                    abstractC3832r82 = eo2;
                                    bq = new BQ(bq2.f24046d, obj);
                                }
                            }
                            bq = bq2;
                            abstractC3832r82 = eo2;
                        }
                        C4280zO c4280zO3 = this.Y;
                        int i9 = c4280zO3.f35534e;
                        RN rn = z11 ? null : c4280zO3.f35535f;
                        C3041cR c3041cR = z12 ? C3041cR.f29709d : c4280zO3.f35537h;
                        C3877s c3877s = z12 ? this.f31378x : c4280zO3.i;
                        if (z12) {
                            SB sb = UB.f27942u;
                            list = C3675oC.f33115x;
                        } else {
                            list = c4280zO3.f35538j;
                        }
                        this.Y = new C4280zO(abstractC3832r82, bq, j12, j11, i9, rn, false, c3041cR, c3877s, list, bq, c4280zO3.f35540l, c4280zO3.f35541m, c4280zO3.f35542n, c4280zO3.f35543o, j11, 0L, j11, 0L);
                        if (z10) {
                            c3848rO.r();
                            C3.m mVar = this.f31349K;
                            HashMap hashMap = (HashMap) mVar.f444A;
                            for (C4118wO c4118wO : hashMap.values()) {
                                try {
                                    c4118wO.f34978a.q(c4118wO.f34979b);
                                } catch (RuntimeException e10) {
                                    AbstractC3217fl.X("MediaSourceList", "Failed to release child source.", e10);
                                }
                                AbstractC3473kQ abstractC3473kQ = c4118wO.f34978a;
                                C4064vO c4064vO = c4118wO.f34980c;
                                abstractC3473kQ.l(c4064vO);
                                abstractC3473kQ.m(c4064vO);
                            }
                            hashMap.clear();
                            ((HashSet) mVar.f445B).clear();
                            mVar.f449n = false;
                            return;
                        }
                        return;
                    }
                }
                z12 = false;
                long j112 = j10;
                long j122 = j9;
                C3848rO c3848rO2 = this.J;
                c3848rO2.B();
                this.f31370s0 = false;
                abstractC3832r8 = this.Y.f35530a;
                if (z10) {
                }
                bq = bq2;
                abstractC3832r82 = abstractC3832r8;
                C4280zO c4280zO32 = this.Y;
                int i92 = c4280zO32.f35534e;
                if (z11) {
                }
                C3041cR c3041cR2 = z12 ? C3041cR.f29709d : c4280zO32.f35537h;
                C3877s c3877s2 = z12 ? this.f31378x : c4280zO32.i;
                if (z12) {
                }
                this.Y = new C4280zO(abstractC3832r82, bq, j122, j112, i92, rn, false, c3041cR2, c3877s2, list, bq, c4280zO32.f35540l, c4280zO32.f35541m, c4280zO32.f35542n, c4280zO32.f35543o, j112, 0L, j112, 0L);
                if (z10) {
                }
            }
        }
        j9 = this.Y.f35532c;
        if (z9) {
        }
        z12 = false;
        long j1122 = j10;
        long j1222 = j9;
        C3848rO c3848rO22 = this.J;
        c3848rO22.B();
        this.f31370s0 = false;
        abstractC3832r8 = this.Y.f35530a;
        if (z10) {
        }
        bq = bq2;
        abstractC3832r82 = abstractC3832r8;
        C4280zO c4280zO322 = this.Y;
        int i922 = c4280zO322.f35534e;
        if (z11) {
        }
        C3041cR c3041cR22 = z12 ? C3041cR.f29709d : c4280zO322.f35537h;
        C3877s c3877s22 = z12 ? this.f31378x : c4280zO322.i;
        if (z12) {
        }
        this.Y = new C4280zO(abstractC3832r82, bq, j1222, j1122, i922, rn, false, c3041cR22, c3877s22, list, bq, c4280zO322.f35540l, c4280zO322.f35541m, c4280zO322.f35542n, c4280zO322.f35543o, j1122, 0L, j1122, 0L);
        if (z10) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        r5.f26111f.getClass();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair w(AbstractC3832r8 abstractC3832r8) {
        int i;
        long j9 = 0;
        if (abstractC3832r8.g()) {
            return Pair.create(C4280zO.f35529t, 0L);
        }
        int k6 = abstractC3832r8.k(this.f31373u0);
        Y7 y72 = this.f31336C;
        L7 l72 = this.f31337D;
        Pair m8 = abstractC3832r8.m(y72, l72, k6, com.anythink.basead.exoplayer.b.f6539b);
        BQ E8 = this.J.E(abstractC3832r8, m8.first);
        long longValue = ((Long) m8.second).longValue();
        if (E8.b()) {
            abstractC3832r8.o(E8.f24043a, l72);
            C2904a a9 = l72.f26111f.a(-1);
            int i4 = 0;
            while (true) {
                int[] iArr = a9.f29141d;
                if (i4 >= iArr.length || (i = iArr[i4]) == 0 || i == 1) {
                    break;
                }
                i4++;
            }
        } else {
            j9 = longValue;
        }
        return Pair.create(E8, Long.valueOf(j9));
    }

    public final void x(AbstractC3832r8 abstractC3832r8, AbstractC3832r8 abstractC3832r82) {
        if (abstractC3832r8.g() && abstractC3832r82.g()) {
            return;
        }
        ArrayList arrayList = this.f31343G;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            arrayList.get(size).getClass();
            throw new ClassCastException();
        }
    }

    public final void y(boolean z8, boolean z9) {
        this.f31368q0 = z8;
        long j9 = com.anythink.basead.exoplayer.b.f6539b;
        if (z8 && !z9) {
            j9 = SystemClock.elapsedRealtime();
        }
        this.f31369r0 = j9;
    }
}

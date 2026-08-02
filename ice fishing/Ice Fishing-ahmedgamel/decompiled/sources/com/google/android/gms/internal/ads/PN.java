package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import com.google.android.gms.internal.consent_sdk.C4323b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class PN extends OK {
    public static final /* synthetic */ int C0 = 0;

    /* renamed from: A, reason: collision with root package name */
    public final SP[] f27547A;

    /* renamed from: A0, reason: collision with root package name */
    public long f27548A0;

    /* renamed from: B, reason: collision with root package name */
    public final SP[] f27549B;

    /* renamed from: B0, reason: collision with root package name */
    public NQ f27550B0;

    /* renamed from: C, reason: collision with root package name */
    public final C3672o f27551C;

    /* renamed from: D, reason: collision with root package name */
    public final C3235ft f27552D;

    /* renamed from: E, reason: collision with root package name */
    public final C3557lt f27553E;

    /* renamed from: F, reason: collision with root package name */
    public final VN f27554F;

    /* renamed from: G, reason: collision with root package name */
    public final C3553lp f27555G;

    /* renamed from: H, reason: collision with root package name */
    public final K7 f27556H;

    /* renamed from: I, reason: collision with root package name */
    public final ArrayList f27557I;
    public final boolean J;

    /* renamed from: K, reason: collision with root package name */
    public final BO f27558K;

    /* renamed from: L, reason: collision with root package name */
    public final Looper f27559L;

    /* renamed from: M, reason: collision with root package name */
    public final InterfaceC4211y f27560M;

    /* renamed from: N, reason: collision with root package name */
    public final V2 f27561N;

    /* renamed from: O, reason: collision with root package name */
    public final HN f27562O;

    /* renamed from: P, reason: collision with root package name */
    public final O f27563P;

    /* renamed from: Q, reason: collision with root package name */
    public final C3451jv f27564Q;

    /* renamed from: R, reason: collision with root package name */
    public final R2 f27565R;

    /* renamed from: S, reason: collision with root package name */
    public final long f27566S;

    /* renamed from: T, reason: collision with root package name */
    public final C2749Pl f27567T;

    /* renamed from: U, reason: collision with root package name */
    public final C4323b f27568U;

    /* renamed from: V, reason: collision with root package name */
    public final C4297ze f27569V;

    /* renamed from: W, reason: collision with root package name */
    public final S0.e f27570W;

    /* renamed from: X, reason: collision with root package name */
    public final S0.e f27571X;
    public int Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f27572Z;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f27573i0;

    /* renamed from: j0, reason: collision with root package name */
    public final C3966tO f27574j0;

    /* renamed from: k0, reason: collision with root package name */
    public C3195f6 f27575k0;

    /* renamed from: l0, reason: collision with root package name */
    public C3085d3 f27576l0;
    public Surface m0;

    /* renamed from: n0, reason: collision with root package name */
    public Surface f27577n0;

    /* renamed from: o0, reason: collision with root package name */
    public final int f27578o0;

    /* renamed from: p0, reason: collision with root package name */
    public Nr f27579p0;

    /* renamed from: q0, reason: collision with root package name */
    public final C2764Qj f27580q0;

    /* renamed from: r0, reason: collision with root package name */
    public float f27581r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f27582s0;

    /* renamed from: t0, reason: collision with root package name */
    public final boolean f27583t0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f27584u0;

    /* renamed from: v, reason: collision with root package name */
    public final C3941t f27585v;

    /* renamed from: v0, reason: collision with root package name */
    public final int f27586v0;

    /* renamed from: w, reason: collision with root package name */
    public final C3195f6 f27587w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f27588w0;

    /* renamed from: x, reason: collision with root package name */
    public final C2818Tm f27589x;

    /* renamed from: x0, reason: collision with root package name */
    public C3085d3 f27590x0;

    /* renamed from: y, reason: collision with root package name */
    public final Context f27591y;

    /* renamed from: y0, reason: collision with root package name */
    public C3589mO f27592y0;

    /* renamed from: z, reason: collision with root package name */
    public final C4074vO f27593z;

    /* renamed from: z0, reason: collision with root package name */
    public int f27594z0;

    static {
        AbstractC4106w2.a("media3.exoplayer");
    }

    public PN(EN en, C4074vO c4074vO) {
        super(6);
        this.f27589x = new C2818Tm();
        try {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String str = AbstractC3182eu.f30782a;
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 31 + String.valueOf(str).length() + 1);
            sb.append("Init ");
            sb.append(hexString);
            sb.append(" [AndroidXMedia3/1.10.1] [");
            sb.append(str);
            sb.append("]");
            AbstractC2991bG.t("ExoPlayerImpl", sb.toString());
            Context context = en.f25345a;
            Looper looper = en.f25352h;
            this.f27591y = context.getApplicationContext();
            V2 v22 = en.f25346b;
            this.f27558K = new BO(v22);
            this.f27586v0 = en.i;
            this.f27580q0 = en.f25353j;
            this.f27578o0 = en.f25354k;
            this.f27582s0 = false;
            this.f27566S = en.f25359p;
            HN hn = new HN(this);
            this.f27562O = hn;
            this.f27563P = new O(1);
            Handler handler = new Handler(looper);
            C4201xq c4201xq = en.f25347c;
            int i = EN.f25344A;
            this.f27547A = ((Qx) c4201xq.f35841u).g(handler, hn, hn);
            this.f27549B = new SP[2];
            int i4 = 0;
            while (true) {
                SP[] spArr = this.f27549B;
                int length = spArr.length;
                if (i4 >= 2) {
                    break;
                }
                SP sp = this.f27547A[i4];
                spArr[i4] = null;
                i4++;
            }
            C3672o c3672o = (C3672o) en.f25349e.mo14c();
            this.f27551C = c3672o;
            en.f25348d.mo14c();
            InterfaceC4211y interfaceC4211y = (InterfaceC4211y) en.f25351g.mo14c();
            this.f27560M = interfaceC4211y;
            this.J = en.f25355l;
            C4020uO c4020uO = en.f25356m;
            this.f27574j0 = en.f25357n;
            Looper looper2 = en.f25352h;
            this.f27559L = looper2;
            this.f27561N = v22;
            this.f27593z = c4074vO;
            this.f27555G = new C3553lp(new CopyOnWriteArraySet(), looper2, looper2.getThread(), v22, new MN(this), true);
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.f27557I = new ArrayList();
            this.f27550B0 = new NQ();
            int length2 = this.f27547A.length;
            C3941t c3941t = new C3941t(new C3912sO[2], new InterfaceC3780q[2], C4132wb.f35619b, null);
            this.f27585v = c3941t;
            this.f27556H = new K7();
            J5 j52 = new J5();
            M.h hVar = j52.f26401a;
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            hVar.getClass();
            int i6 = 0;
            for (int i9 = 20; i6 < i9; i9 = 20) {
                hVar.t(iArr[i6]);
                i6++;
            }
            c3672o.getClass();
            j52.a(29, true);
            XO u6 = hVar.u();
            this.f27587w = new C3195f6(u6);
            M.h hVar2 = new J5().f26401a;
            int i10 = 0;
            while (true) {
                SparseBooleanArray sparseBooleanArray = u6.f29303a;
                if (i10 >= sparseBooleanArray.size()) {
                    break;
                }
                AbstractC2792Sd.K(i10, sparseBooleanArray.size());
                hVar2.t(sparseBooleanArray.keyAt(i10));
                i10++;
            }
            hVar2.t(4);
            hVar2.t(10);
            this.f27575k0 = new C3195f6(hVar2.u());
            this.f27552D = v22.x(looper2, null);
            C3557lt c3557lt = new C3557lt(12, this);
            this.f27553E = c3557lt;
            this.f27592y0 = C3589mO.a(c3941t);
            this.f27558K.A(c4074vO, looper2);
            IO io = new IO(en.f25366w);
            VN vn = new VN(this.f27591y, this.f27547A, this.f27549B, c3672o, c3941t, (YN) en.f25350f.mo14c(), interfaceC4211y, this.f27558K, c4020uO, en.f25369z, en.f25358o, en.f25367x, looper2, v22, c3557lt, io, en.f25368y);
            Looper looper3 = vn.f28937B;
            C3235ft c3235ft = vn.f28985z;
            this.f27554F = vn;
            this.f27581r0 = 1.0f;
            C3085d3 c3085d3 = C3085d3.f30437C;
            this.f27576l0 = c3085d3;
            this.f27590x0 = c3085d3;
            this.f27594z0 = -1;
            CB cb = C2781Rj.f28005a;
            this.f27583t0 = true;
            BO bo = this.f27558K;
            bo.getClass();
            this.f27555G.a(bo);
            Handler handler2 = new Handler(looper2);
            BO bo2 = this.f27558K;
            B b9 = (B) interfaceC4211y;
            b9.getClass();
            bo2.getClass();
            Qx qx = b9.f24563v;
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) qx.f27895u;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C4157x c4157x = (C4157x) it.next();
                Iterator it2 = it;
                if (c4157x.f35698b == bo2) {
                    c4157x.f35699c = true;
                    copyOnWriteArrayList.remove(c4157x);
                }
                it = it2;
            }
            ((CopyOnWriteArrayList) qx.f27895u).add(new C4157x(handler2, bo2));
            copyOnWriteArraySet.add(this.f27562O);
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 31) {
                v22.x(looper3, null).e(new N2.j(this.f27591y, en.f25364u, this, io));
            }
            C2749Pl c2749Pl = new C2749Pl(looper3, looper2, v22, new MN(this));
            this.f27567T = c2749Pl;
            RunnableC3830qw runnableC3830qw = new RunnableC3830qw(12, this);
            C3235ft c3235ft2 = (C3235ft) c2749Pl.f27643b;
            if (c3235ft2.f31231a.getLooper().getThread().isAlive()) {
                c3235ft2.e(runnableC3830qw);
            }
            C2889Yb c2889Yb = new C2889Yb(13);
            context.getApplicationContext();
            v22.x(looper3, null);
            new Q0.d(c2889Yb, v22.x(looper, null));
            boolean z6 = (en.f25361r == Integer.MAX_VALUE || en.f25362s == Integer.MAX_VALUE) ? false : true;
            C3451jv c3451jv = new C3451jv(context, looper3, v22);
            this.f27564Q = c3451jv;
            if (c3451jv.f32124n != z6) {
                c3451jv.f32124n = z6;
                c3451jv.j(z6, c3451jv.f32125u);
            }
            R2 r22 = new R2(3);
            context.getApplicationContext();
            v22.x(looper3, null);
            v22.x(Looper.getMainLooper(), null);
            this.f27565R = r22;
            int i12 = WN.f29149a;
            C3058cd c3058cd = C3058cd.f30285d;
            this.f27579p0 = Nr.f27339c;
            this.f27569V = i11 >= 34 ? new C4297ze(this, context) : null;
            this.f27570W = new S0.e(this);
            this.f27571X = new S0.e(this);
            this.f27568U = new C4323b(this, this.f27562O, v22, en.f25360q, en.f25361r, en.f25362s, en.f25363t);
            c3235ft.b(38, this.f27574j0).a();
            C2764Qj c2764Qj = this.f27580q0;
            c3235ft.getClass();
            C3127dt g9 = C3235ft.g();
            g9.f30645a = c3235ft.f31231a.obtainMessage(31, 0, 0, c2764Qj);
            g9.a();
            h2(1, 3, this.f27580q0);
            h2(2, 4, Integer.valueOf(this.f27578o0));
            h2(2, 5, 0);
            h2(1, 9, Boolean.valueOf(this.f27582s0));
            h2(6, 8, this.f27563P);
            h2(-1, 16, Integer.valueOf(this.f27586v0));
            this.f27589x.a();
        } catch (Throwable th) {
            this.f27589x.a();
            throw th;
        }
    }

    public static long b2(C3589mO c3589mO) {
        U7 u72 = new U7();
        K7 k72 = new K7();
        AbstractC3627n8 abstractC3627n8 = c3589mO.f32728a;
        abstractC3627n8.o(c3589mO.f32729b.f34406a, k72);
        long j6 = c3589mO.f32730c;
        if (j6 != com.anythink.basead.exoplayer.b.f7168b) {
            return j6;
        }
        abstractC3627n8.b(k72.f26619c, u72, 0L).getClass();
        return 0L;
    }

    public static C3589mO d2(C3589mO c3589mO, int i) {
        C3589mO d9 = c3589mO.d(i);
        return (i == 1 || i == 4) ? d9.f(false) : d9;
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final boolean A1() {
        O0();
        return this.f27592y0.f32738l;
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void C1() {
        O0();
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final AbstractC3627n8 F1() {
        O0();
        return this.f27592y0.f32728a;
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final int K1() {
        O0();
        int X12 = X1(this.f27592y0);
        if (X12 == -1) {
            return 0;
        }
        return X12;
    }

    public final void O0() {
        this.f27589x.b();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f27559L;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = AbstractC3182eu.f30782a;
            Locale locale = Locale.US;
            String m9 = D.x.m("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.f27583t0) {
                throw new IllegalStateException(m9);
            }
            AbstractC2991bG.C("ExoPlayerImpl", m9, this.f27584u0 ? null : new IllegalStateException());
            this.f27584u0 = true;
        }
    }

    public final void R1(float f2) {
        O0();
        String str = AbstractC3182eu.f30782a;
        float max = Math.max(0.0f, Math.min(f2, 1.0f));
        if (this.f27581r0 == max) {
            return;
        }
        this.f27581r0 = max;
        this.f27554F.f28985z.b(32, Float.valueOf(max)).a();
        XJ xj = new XJ(max);
        C3553lp c3553lp = this.f27555G;
        c3553lp.c(22, xj);
        c3553lp.d();
    }

    public final void T1(InterfaceC4236yO interfaceC4236yO) {
        this.f27558K.f24671f.a(interfaceC4236yO);
    }

    public final void U1(C3437jh c3437jh) {
        O0();
        this.f27558K.f24671f.b(c3437jh);
    }

    public final void V1() {
        String str;
        boolean z6;
        Context context;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str2 = AbstractC3182eu.f30782a;
        HashSet hashSet = AbstractC4106w2.f35555a;
        synchronized (AbstractC4106w2.class) {
            str = AbstractC4106w2.f35556b;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 34 + String.valueOf(str2).length() + 3 + String.valueOf(str).length() + 1);
        AbstractC5128c.h(sb, "Release ", hexString, " [AndroidXMedia3/1.10.1] [", str2);
        sb.append("] [");
        sb.append(str);
        sb.append("]");
        AbstractC2991bG.t("ExoPlayerImpl", sb.toString());
        O0();
        this.f27564Q.g(false);
        R2 r22 = this.f27565R;
        if (r22.f27915u) {
            r22.f27915u = false;
        }
        C4297ze c4297ze = this.f27569V;
        if (c4297ze != null && Build.VERSION.SDK_INT >= 34 && (context = (Context) ((WeakReference) c4297ze.f36133u).get()) != null) {
            context.unregisterDeviceIdChangeListener((ON) c4297ze.f36134v);
        }
        C4323b c4323b = this.f27568U;
        ((C3235ft) c4323b.f36421e).f31231a.removeCallbacksAndMessages(null);
        Zr zr = (Zr) c4323b.f36418b;
        PN pn = (PN) c4323b.f36417a;
        pn.O0();
        zr.getClass();
        pn.f27555G.b(zr);
        VN vn = this.f27554F;
        if (vn.f28964j0 || !vn.f28937B.getThread().isAlive()) {
            z6 = true;
        } else {
            vn.f28964j0 = true;
            C2818Tm c2818Tm = new C2818Tm();
            vn.f28985z.b(7, c2818Tm).a();
            z6 = c2818Tm.c(vn.f28949L);
        }
        if (!z6) {
            C3553lp c3553lp = this.f27555G;
            c3553lp.c(10, XJ.f29294w);
            c3553lp.d();
        }
        this.f27555G.e();
        this.f27552D.f31231a.removeCallbacksAndMessages(null);
        InterfaceC4211y interfaceC4211y = this.f27560M;
        BO bo = this.f27558K;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((B) interfaceC4211y).f24563v.f27895u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C4157x c4157x = (C4157x) it.next();
            if (c4157x.f35698b == bo) {
                c4157x.f35699c = true;
                copyOnWriteArrayList.remove(c4157x);
            }
        }
        this.f27592y0.getClass();
        C3589mO d22 = d2(this.f27592y0, 1);
        this.f27592y0 = d22;
        C3589mO g9 = d22.g(d22.f32729b);
        this.f27592y0 = g9;
        g9.f32742p = g9.f32744r;
        this.f27592y0.f32743q = 0L;
        C3235ft c3235ft = bo.f24673h;
        c3235ft.getClass();
        c3235ft.e(new RunnableC3830qw(15, bo));
        Surface surface = this.f27577n0;
        if (surface != null) {
            surface.release();
            this.f27577n0 = null;
        }
        CB cb = C2781Rj.f28005a;
        this.f27588w0 = true;
        if (this.f27592y0.f32728a.g()) {
            return;
        }
        C3589mO c3589mO = this.f27592y0;
        boolean z9 = c3589mO.f32728a.e(c3589mO.f32729b.f34406a) != -1;
        Locale locale = Locale.US;
        C3589mO c3589mO2 = this.f27592y0;
        AbstractC2792Sd.I(String.format(locale, "periodUid %s not found in timeline %s with size %d", c3589mO2.f32729b.f34406a, c3589mO2.f32728a.getClass().getName(), Integer.valueOf(this.f27592y0.f32728a.a())), z9);
    }

    public final void W1(DN dn) {
        C3589mO c3589mO = this.f27592y0;
        C3589mO g9 = c3589mO.g(c3589mO.f32729b);
        g9.f32742p = g9.f32744r;
        g9.f32743q = 0L;
        C3589mO d22 = d2(g9, 1);
        if (dn != null) {
            d22 = d22.e(dn);
        }
        C3589mO c3589mO2 = d22;
        this.Y++;
        C3235ft c3235ft = this.f27554F.f28985z;
        c3235ft.getClass();
        C3127dt g10 = C3235ft.g();
        g10.f30645a = c3235ft.f31231a.obtainMessage(6);
        g10.a();
        a2(c3589mO2, 0, false, 5, com.anythink.basead.exoplayer.b.f7168b, -1);
    }

    public final int X1(C3589mO c3589mO) {
        AbstractC3627n8 abstractC3627n8 = c3589mO.f32728a;
        return abstractC3627n8.g() ? this.f27594z0 : abstractC3627n8.o(c3589mO.f32729b.f34406a, this.f27556H).f26619c;
    }

    public final long Y1(C3589mO c3589mO) {
        C3860rQ c3860rQ = c3589mO.f32729b;
        if (!c3860rQ.b()) {
            return AbstractC3182eu.t(Z1(c3589mO));
        }
        Object obj = c3860rQ.f34406a;
        K7 k72 = this.f27556H;
        AbstractC3627n8 abstractC3627n8 = c3589mO.f32728a;
        abstractC3627n8.o(obj, k72);
        long j6 = c3589mO.f32730c;
        if (j6 == com.anythink.basead.exoplayer.b.f7168b) {
            abstractC3627n8.b(X1(c3589mO), (U7) this.f27380n, 0L).getClass();
            return AbstractC3182eu.t(0L);
        }
        return AbstractC3182eu.t(j6) + AbstractC3182eu.t(0L);
    }

    public final long Z1(C3589mO c3589mO) {
        AbstractC3627n8 abstractC3627n8 = c3589mO.f32728a;
        if (abstractC3627n8.g()) {
            return AbstractC3182eu.u(this.f27548A0);
        }
        long j6 = c3589mO.f32744r;
        C3860rQ c3860rQ = c3589mO.f32729b;
        if (c3860rQ.b()) {
            return j6;
        }
        abstractC3627n8.o(c3860rQ.f34406a, this.f27556H);
        return j6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x05ae A[LOOP:0: B:110:0x05a6->B:112:0x05ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x05c3 A[EDGE_INSN: B:113:0x05c3->B:114:0x05c3 BREAK  A[LOOP:0: B:110:0x05a6->B:112:0x05ae], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x05cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x05d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x05e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x05f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0605 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x061e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x062c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0530  */
    /* JADX WARN: Type inference failed for: r10v15, types: [android.util.SparseBooleanArray] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19, types: [int] */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v5, types: [com.google.android.gms.internal.ads.jv] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a2(final C3589mO c3589mO, int i, boolean z6, int i4, long j6, int i6) {
        int i9;
        int i10;
        boolean z9;
        Pair pair;
        boolean z10;
        boolean z11;
        int i11;
        boolean booleanValue;
        C2977b2 c2977b2;
        List list;
        int i12;
        boolean z12;
        boolean z13;
        AbstractC3627n8 F12;
        C3085d3 c3085d3;
        int i13;
        int i14;
        int u12;
        R2 r22;
        ?? r14;
        boolean A12;
        boolean z14;
        boolean z15;
        int i15;
        DN dn;
        DN dn2;
        C3941t c3941t;
        C3941t c3941t2;
        final byte b9;
        final int i16;
        C3195f6 c3195f6;
        AbstractC3627n8 F13;
        int i17;
        boolean z16;
        AbstractC3627n8 F14;
        boolean z17;
        boolean z18;
        AbstractC3627n8 F15;
        boolean z19;
        boolean z20;
        AbstractC3627n8 F16;
        boolean z21;
        boolean z22;
        J5 j52;
        XO xo;
        ?? r12;
        ?? r10;
        C3195f6 c3195f62;
        int i18;
        int i19;
        Object obj;
        C2977b2 c2977b22;
        Object obj2;
        long j9;
        long b22;
        int i20;
        Object obj3;
        C2977b2 c2977b23;
        Object obj4;
        int i21 = i4;
        C3589mO c3589mO2 = this.f27592y0;
        this.f27592y0 = c3589mO;
        AbstractC3627n8 abstractC3627n8 = c3589mO.f32728a;
        if (!abstractC3627n8.g()) {
            Object obj5 = c3589mO.f32729b.f34406a;
            AbstractC2792Sd.I(String.format(Locale.US, "periodUid %s not found in timeline %s with size %d", obj5, abstractC3627n8.getClass().getName(), Integer.valueOf(abstractC3627n8.a())), abstractC3627n8.e(obj5) != -1);
        }
        AbstractC3627n8 abstractC3627n82 = c3589mO2.f32728a;
        boolean equals = abstractC3627n82.equals(abstractC3627n8);
        if (abstractC3627n8.g() && abstractC3627n82.g()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else {
            if (abstractC3627n8.g() == abstractC3627n82.g()) {
                C3860rQ c3860rQ = c3589mO2.f32729b;
                Object obj6 = c3860rQ.f34406a;
                i9 = 0;
                K7 k72 = this.f27556H;
                int i22 = abstractC3627n82.o(obj6, k72).f26619c;
                U7 u72 = (U7) this.f27380n;
                Object obj7 = abstractC3627n82.b(i22, u72, 0L).f28690a;
                C3860rQ c3860rQ2 = c3589mO.f32729b;
                if (obj7.equals(abstractC3627n8.b(abstractC3627n8.o(c3860rQ2.f34406a, k72).f26619c, u72, 0L).f28690a)) {
                    if (z6) {
                        if (i21 != 0) {
                            i10 = i21;
                        } else if (c3860rQ.f34409d < c3860rQ2.f34409d) {
                            pair = new Pair(Boolean.TRUE, 0);
                            i10 = 0;
                            z9 = true;
                        } else {
                            i10 = 0;
                        }
                        z9 = true;
                    } else {
                        i10 = i21;
                        z9 = false;
                    }
                    pair = new Pair(Boolean.FALSE, -1);
                } else {
                    if (!z6) {
                        z10 = false;
                        z11 = false;
                    } else if (i21 == 0) {
                        i21 = 0;
                        i11 = 1;
                        z11 = true;
                        pair = new Pair(Boolean.TRUE, Integer.valueOf(i11));
                        i10 = i21;
                        z9 = z11;
                    } else {
                        z10 = true;
                        z11 = true;
                    }
                    if (z10 && i21 == 1) {
                        i11 = 2;
                    } else {
                        if (equals) {
                            throw new IllegalStateException();
                        }
                        i11 = 3;
                    }
                    pair = new Pair(Boolean.TRUE, Integer.valueOf(i11));
                    i10 = i21;
                    z9 = z11;
                }
                booleanValue = ((Boolean) pair.first).booleanValue();
                int intValue = ((Integer) pair.second).intValue();
                if (booleanValue) {
                    c2977b2 = null;
                } else {
                    c2977b2 = !abstractC3627n8.g() ? abstractC3627n8.b(abstractC3627n8.o(c3589mO.f32729b.f34406a, this.f27556H).f26619c, (U7) this.f27380n, 0L).f28691b : null;
                    this.f27590x0 = C3085d3.f30437C;
                }
                if (booleanValue && c3589mO2.f32736j.equals(c3589mO.f32736j)) {
                    z12 = z9;
                } else {
                    M2 a9 = this.f27590x0.a();
                    list = c3589mO.f32736j;
                    i12 = i9;
                    while (i12 < list.size()) {
                        O3 o32 = (O3) list.get(i12);
                        int i23 = i9;
                        while (true) {
                            InterfaceC3945t3[] interfaceC3945t3Arr = o32.f27368a;
                            z13 = z9;
                            if (i23 < interfaceC3945t3Arr.length) {
                                interfaceC3945t3Arr[i23].a(a9);
                                i23++;
                                z9 = z13;
                            }
                        }
                        i12++;
                        z9 = z13;
                    }
                    z12 = z9;
                    this.f27590x0 = new C3085d3(a9);
                }
                F12 = F1();
                if (F12.g()) {
                    C2977b2 c2977b24 = F12.b(K1(), (U7) this.f27380n, 0L).f28691b;
                    M2 a10 = this.f27590x0.a();
                    C3085d3 c3085d32 = c2977b24.f29975d;
                    if (c3085d32 != null) {
                        CharSequence charSequence = c3085d32.f30440a;
                        if (charSequence != null) {
                            a10.f27002a = charSequence;
                        }
                        CharSequence charSequence2 = c3085d32.f30441b;
                        if (charSequence2 != null) {
                            a10.f27003b = charSequence2;
                        }
                        CharSequence charSequence3 = c3085d32.f30442c;
                        if (charSequence3 != null) {
                            a10.f27004c = charSequence3;
                        }
                        CharSequence charSequence4 = c3085d32.f30443d;
                        if (charSequence4 != null) {
                            a10.f27005d = charSequence4;
                        }
                        CharSequence charSequence5 = c3085d32.f30444e;
                        if (charSequence5 != null) {
                            a10.f27006e = charSequence5;
                        }
                        byte[] bArr = c3085d32.f30445f;
                        if (bArr != null) {
                            a10.f27007f = (byte[]) bArr.clone();
                            a10.f27008g = c3085d32.f30446g;
                        }
                        Integer num = c3085d32.f30447h;
                        if (num != null) {
                            a10.f27009h = num;
                        }
                        Integer num2 = c3085d32.i;
                        if (num2 != null) {
                            a10.i = num2;
                        }
                        Integer num3 = c3085d32.f30448j;
                        if (num3 != null) {
                            a10.f27010j = num3;
                        }
                        Boolean bool = c3085d32.f30449k;
                        if (bool != null) {
                            a10.f27011k = bool;
                        }
                        Integer num4 = c3085d32.f30450l;
                        if (num4 != null) {
                            a10.f27012l = num4;
                        }
                        Integer num5 = c3085d32.f30451m;
                        if (num5 != null) {
                            a10.f27012l = num5;
                        }
                        Integer num6 = c3085d32.f30452n;
                        if (num6 != null) {
                            a10.f27013m = num6;
                        }
                        Integer num7 = c3085d32.f30453o;
                        if (num7 != null) {
                            a10.f27014n = num7;
                        }
                        Integer num8 = c3085d32.f30454p;
                        if (num8 != null) {
                            a10.f27015o = num8;
                        }
                        Integer num9 = c3085d32.f30455q;
                        if (num9 != null) {
                            a10.f27016p = num9;
                        }
                        Integer num10 = c3085d32.f30456r;
                        if (num10 != null) {
                            a10.f27017q = num10;
                        }
                        CharSequence charSequence6 = c3085d32.f30457s;
                        if (charSequence6 != null) {
                            a10.f27018r = charSequence6;
                        }
                        CharSequence charSequence7 = c3085d32.f30458t;
                        if (charSequence7 != null) {
                            a10.f27019s = charSequence7;
                        }
                        CharSequence charSequence8 = c3085d32.f30459u;
                        if (charSequence8 != null) {
                            a10.f27020t = charSequence8;
                        }
                        CharSequence charSequence9 = c3085d32.f30460v;
                        if (charSequence9 != null) {
                            a10.f27021u = charSequence9;
                        }
                        Integer num11 = c3085d32.f30461w;
                        if (num11 != null) {
                            a10.f27022v = num11;
                        }
                        Integer num12 = c3085d32.f30462x;
                        if (num12 != null) {
                            a10.f27023w = num12;
                        }
                        CharSequence charSequence10 = c3085d32.f30463y;
                        if (charSequence10 != null) {
                            a10.f27024x = charSequence10;
                        }
                        CharSequence charSequence11 = c3085d32.f30464z;
                        if (charSequence11 != null) {
                            a10.f27025y = charSequence11;
                        }
                        Integer num13 = c3085d32.f30438A;
                        if (num13 != null) {
                            a10.f27026z = num13;
                        }
                        RB rb = c3085d32.f30439B;
                        if (!rb.isEmpty()) {
                            a10.f27001A = RB.n(rb);
                        }
                    }
                    c3085d3 = new C3085d3(a10);
                } else {
                    c3085d3 = this.f27590x0;
                }
                boolean equals2 = c3085d3.equals(this.f27576l0);
                this.f27576l0 = c3085d3;
                i13 = c3589mO2.f32738l == c3589mO.f32738l ? 1 : i9;
                i14 = c3589mO2.f32732e == c3589mO.f32732e ? 1 : i9;
                if (i14 == 0 || i13 != 0) {
                    u12 = u1();
                    r22 = this.f27565R;
                    r14 = this.f27564Q;
                    if (u12 != 2 || u12 == 3) {
                        O0();
                        this.f27592y0.getClass();
                        r14.g(A1());
                        A12 = A1();
                        if (r22.f27915u != A12) {
                            r22.f27915u = A12;
                        }
                    } else {
                        ?? r122 = i9;
                        r14.g(r122);
                        if (r22.f27915u) {
                            r22.f27915u = r122;
                        }
                    }
                }
                z14 = c3589mO2.f32734g == c3589mO.f32734g;
                if (!equals) {
                    this.f27555G.c(0, new LN(c3589mO, i));
                }
                if (z12) {
                    z15 = equals2;
                    i15 = i14;
                } else {
                    K7 k73 = new K7();
                    if (abstractC3627n82.g()) {
                        z15 = equals2;
                        i15 = i14;
                        i18 = i6;
                        i19 = i18;
                        obj = null;
                        c2977b22 = null;
                        obj2 = null;
                    } else {
                        Object obj8 = c3589mO2.f32729b.f34406a;
                        abstractC3627n82.o(obj8, k73);
                        int i24 = k73.f26619c;
                        int e9 = abstractC3627n82.e(obj8);
                        U7 u73 = (U7) this.f27380n;
                        z15 = equals2;
                        i15 = i14;
                        obj = abstractC3627n82.b(i24, u73, 0L).f28690a;
                        c2977b22 = u73.f28691b;
                        obj2 = obj8;
                        i18 = i24;
                        i19 = e9;
                    }
                    if (i10 == 0) {
                        C3860rQ c3860rQ3 = c3589mO2.f32729b;
                        if (c3860rQ3.b()) {
                            j9 = k73.b(c3860rQ3.f34407b, c3860rQ3.f34408c);
                            b22 = b2(c3589mO2);
                            String str = AbstractC3182eu.f30782a;
                            C3860rQ c3860rQ4 = c3589mO2.f32729b;
                            X6 x62 = new X6(obj, i18, c2977b22, obj2, i19, AbstractC3182eu.t(j9), AbstractC3182eu.t(b22), c3860rQ4.f34407b, c3860rQ4.f34408c);
                            int K12 = K1();
                            int k22 = k2();
                            if (this.f27592y0.f32728a.g()) {
                                C3589mO c3589mO3 = this.f27592y0;
                                Object obj9 = c3589mO3.f32729b.f34406a;
                                c3589mO3.f32728a.o(obj9, this.f27556H);
                                int e10 = this.f27592y0.f32728a.e(obj9);
                                AbstractC3627n8 abstractC3627n83 = this.f27592y0.f32728a;
                                U7 u74 = (U7) this.f27380n;
                                i20 = e10;
                                obj3 = abstractC3627n83.b(K12, u74, 0L).f28690a;
                                c2977b23 = u74.f28691b;
                                obj4 = obj9;
                            } else {
                                i20 = k22;
                                obj3 = null;
                                c2977b23 = null;
                                obj4 = null;
                            }
                            long t6 = AbstractC3182eu.t(j6);
                            long t9 = !this.f27592y0.f32729b.b() ? AbstractC3182eu.t(b2(this.f27592y0)) : t6;
                            C3860rQ c3860rQ5 = this.f27592y0.f32729b;
                            X6 x63 = new X6(obj3, K12, c2977b23, obj4, i20, t6, t9, c3860rQ5.f34407b, c3860rQ5.f34408c);
                            C3553lp c3553lp = this.f27555G;
                            C3516l5 c3516l5 = new C3516l5();
                            c3516l5.f32487n = i10;
                            c3516l5.f32488u = x62;
                            c3516l5.f32489v = x63;
                            c3553lp.c(11, c3516l5);
                        } else {
                            j9 = c3860rQ3.f34410e != -1 ? b2(this.f27592y0) : k73.f26620d;
                            b22 = j9;
                            String str2 = AbstractC3182eu.f30782a;
                            C3860rQ c3860rQ42 = c3589mO2.f32729b;
                            X6 x622 = new X6(obj, i18, c2977b22, obj2, i19, AbstractC3182eu.t(j9), AbstractC3182eu.t(b22), c3860rQ42.f34407b, c3860rQ42.f34408c);
                            int K122 = K1();
                            int k222 = k2();
                            if (this.f27592y0.f32728a.g()) {
                            }
                            long t62 = AbstractC3182eu.t(j6);
                            if (!this.f27592y0.f32729b.b()) {
                            }
                            C3860rQ c3860rQ52 = this.f27592y0.f32729b;
                            X6 x632 = new X6(obj3, K122, c2977b23, obj4, i20, t62, t9, c3860rQ52.f34407b, c3860rQ52.f34408c);
                            C3553lp c3553lp2 = this.f27555G;
                            C3516l5 c3516l52 = new C3516l5();
                            c3516l52.f32487n = i10;
                            c3516l52.f32488u = x622;
                            c3516l52.f32489v = x632;
                            c3553lp2.c(11, c3516l52);
                        }
                    } else if (c3589mO2.f32729b.b()) {
                        j9 = c3589mO2.f32744r;
                        b22 = b2(c3589mO2);
                        String str22 = AbstractC3182eu.f30782a;
                        C3860rQ c3860rQ422 = c3589mO2.f32729b;
                        X6 x6222 = new X6(obj, i18, c2977b22, obj2, i19, AbstractC3182eu.t(j9), AbstractC3182eu.t(b22), c3860rQ422.f34407b, c3860rQ422.f34408c);
                        int K1222 = K1();
                        int k2222 = k2();
                        if (this.f27592y0.f32728a.g()) {
                        }
                        long t622 = AbstractC3182eu.t(j6);
                        if (!this.f27592y0.f32729b.b()) {
                        }
                        C3860rQ c3860rQ522 = this.f27592y0.f32729b;
                        X6 x6322 = new X6(obj3, K1222, c2977b23, obj4, i20, t622, t9, c3860rQ522.f34407b, c3860rQ522.f34408c);
                        C3553lp c3553lp22 = this.f27555G;
                        C3516l5 c3516l522 = new C3516l5();
                        c3516l522.f32487n = i10;
                        c3516l522.f32488u = x6222;
                        c3516l522.f32489v = x6322;
                        c3553lp22.c(11, c3516l522);
                    } else {
                        j9 = c3589mO2.f32744r;
                        b22 = j9;
                        String str222 = AbstractC3182eu.f30782a;
                        C3860rQ c3860rQ4222 = c3589mO2.f32729b;
                        X6 x62222 = new X6(obj, i18, c2977b22, obj2, i19, AbstractC3182eu.t(j9), AbstractC3182eu.t(b22), c3860rQ4222.f34407b, c3860rQ4222.f34408c);
                        int K12222 = K1();
                        int k22222 = k2();
                        if (this.f27592y0.f32728a.g()) {
                        }
                        long t6222 = AbstractC3182eu.t(j6);
                        if (!this.f27592y0.f32729b.b()) {
                        }
                        C3860rQ c3860rQ5222 = this.f27592y0.f32729b;
                        X6 x63222 = new X6(obj3, K12222, c2977b23, obj4, i20, t6222, t9, c3860rQ5222.f34407b, c3860rQ5222.f34408c);
                        C3553lp c3553lp222 = this.f27555G;
                        C3516l5 c3516l5222 = new C3516l5();
                        c3516l5222.f32487n = i10;
                        c3516l5222.f32488u = x62222;
                        c3516l5222.f32489v = x63222;
                        c3553lp222.c(11, c3516l5222);
                    }
                }
                if (booleanValue) {
                    this.f27555G.c(1, new XJ(c2977b2, intValue));
                }
                dn = c3589mO2.f32733f;
                dn2 = c3589mO.f32733f;
                if (dn != dn2) {
                    C3553lp c3553lp3 = this.f27555G;
                    final int i25 = 3;
                    c3553lp3.c(10, new InterfaceC3606mo() { // from class: com.google.android.gms.internal.ads.IN
                        @Override // com.google.android.gms.internal.ads.InterfaceC3606mo
                        /* renamed from: a */
                        public final /* synthetic */ void mo5a(Object obj10) {
                            C3589mO c3589mO4 = c3589mO;
                            G6 g62 = (G6) obj10;
                            switch (i25) {
                                case 0:
                                    int i26 = PN.C0;
                                    g62.e0(c3589mO4.f32733f);
                                    break;
                                case 1:
                                    int i27 = PN.C0;
                                    g62.a0(c3589mO4.f32732e);
                                    break;
                                case 2:
                                    int i28 = PN.C0;
                                    C3947t5 c3947t5 = c3589mO4.f32741o;
                                    g62.r();
                                    break;
                                default:
                                    int i29 = PN.C0;
                                    g62.d0(c3589mO4.f32733f);
                                    break;
                            }
                        }
                    });
                    if (dn2 != null) {
                        final int i26 = 0;
                        c3553lp3.c(10, new InterfaceC3606mo() { // from class: com.google.android.gms.internal.ads.IN
                            @Override // com.google.android.gms.internal.ads.InterfaceC3606mo
                            /* renamed from: a */
                            public final /* synthetic */ void mo5a(Object obj10) {
                                C3589mO c3589mO4 = c3589mO;
                                G6 g62 = (G6) obj10;
                                switch (i26) {
                                    case 0:
                                        int i262 = PN.C0;
                                        g62.e0(c3589mO4.f32733f);
                                        break;
                                    case 1:
                                        int i27 = PN.C0;
                                        g62.a0(c3589mO4.f32732e);
                                        break;
                                    case 2:
                                        int i28 = PN.C0;
                                        C3947t5 c3947t5 = c3589mO4.f32741o;
                                        g62.r();
                                        break;
                                    default:
                                        int i29 = PN.C0;
                                        g62.d0(c3589mO4.f32733f);
                                        break;
                                }
                            }
                        });
                    }
                }
                c3941t = c3589mO2.i;
                c3941t2 = c3589mO.i;
                if (c3941t != c3941t2) {
                    C3672o c3672o = this.f27551C;
                    Object obj10 = c3941t2.f34967x;
                    c3672o.getClass();
                    final int i27 = 0;
                    this.f27555G.c(2, new InterfaceC3606mo() { // from class: com.google.android.gms.internal.ads.JN
                        @Override // com.google.android.gms.internal.ads.InterfaceC3606mo
                        /* renamed from: a */
                        public final /* synthetic */ void mo5a(Object obj11) {
                            C3589mO c3589mO4 = c3589mO;
                            G6 g62 = (G6) obj11;
                            switch (i27) {
                                case 0:
                                    int i28 = PN.C0;
                                    Object obj12 = c3589mO4.i.f34966w;
                                    g62.o();
                                    break;
                                default:
                                    int i29 = PN.C0;
                                    boolean z23 = c3589mO4.f32738l;
                                    g62.j();
                                    break;
                            }
                        }
                    });
                }
                if (!z15) {
                    this.f27555G.c(14, new XJ(this.f27576l0));
                }
                if (z14) {
                    b9 = 0;
                } else {
                    b9 = 0;
                    this.f27555G.c(3, new InterfaceC3606mo() { // from class: com.google.android.gms.internal.ads.KN
                        @Override // com.google.android.gms.internal.ads.InterfaceC3606mo
                        /* renamed from: a */
                        public final /* synthetic */ void mo5a(Object obj11) {
                            C3589mO c3589mO4 = c3589mO;
                            G6 g62 = (G6) obj11;
                            switch (b9) {
                                case 0:
                                    int i28 = PN.C0;
                                    boolean z23 = c3589mO4.f32734g;
                                    g62.e();
                                    break;
                                default:
                                    int i29 = PN.C0;
                                    int i30 = c3589mO4.f32740n;
                                    g62.k();
                                    break;
                            }
                        }
                    });
                }
                if (i15 == 0 || i13 != 0) {
                    this.f27555G.c(-1, new LN(c3589mO, b9, b9));
                }
                if (i15 != 0) {
                    final int i28 = 1;
                    this.f27555G.c(4, new InterfaceC3606mo() { // from class: com.google.android.gms.internal.ads.IN
                        @Override // com.google.android.gms.internal.ads.InterfaceC3606mo
                        /* renamed from: a */
                        public final /* synthetic */ void mo5a(Object obj102) {
                            C3589mO c3589mO4 = c3589mO;
                            G6 g62 = (G6) obj102;
                            switch (i28) {
                                case 0:
                                    int i262 = PN.C0;
                                    g62.e0(c3589mO4.f32733f);
                                    break;
                                case 1:
                                    int i272 = PN.C0;
                                    g62.a0(c3589mO4.f32732e);
                                    break;
                                case 2:
                                    int i282 = PN.C0;
                                    C3947t5 c3947t5 = c3589mO4.f32741o;
                                    g62.r();
                                    break;
                                default:
                                    int i29 = PN.C0;
                                    g62.d0(c3589mO4.f32733f);
                                    break;
                            }
                        }
                    });
                }
                if (i13 == 0 || c3589mO2.f32739m != c3589mO.f32739m) {
                    i16 = 1;
                    this.f27555G.c(5, new InterfaceC3606mo() { // from class: com.google.android.gms.internal.ads.JN
                        @Override // com.google.android.gms.internal.ads.InterfaceC3606mo
                        /* renamed from: a */
                        public final /* synthetic */ void mo5a(Object obj11) {
                            C3589mO c3589mO4 = c3589mO;
                            G6 g62 = (G6) obj11;
                            switch (i16) {
                                case 0:
                                    int i282 = PN.C0;
                                    Object obj12 = c3589mO4.i.f34966w;
                                    g62.o();
                                    break;
                                default:
                                    int i29 = PN.C0;
                                    boolean z23 = c3589mO4.f32738l;
                                    g62.j();
                                    break;
                            }
                        }
                    });
                } else {
                    i16 = 1;
                }
                if (c3589mO2.f32740n != c3589mO.f32740n) {
                    this.f27555G.c(6, new InterfaceC3606mo() { // from class: com.google.android.gms.internal.ads.KN
                        @Override // com.google.android.gms.internal.ads.InterfaceC3606mo
                        /* renamed from: a */
                        public final /* synthetic */ void mo5a(Object obj11) {
                            C3589mO c3589mO4 = c3589mO;
                            G6 g62 = (G6) obj11;
                            switch (i16) {
                                case 0:
                                    int i282 = PN.C0;
                                    boolean z23 = c3589mO4.f32734g;
                                    g62.e();
                                    break;
                                default:
                                    int i29 = PN.C0;
                                    int i30 = c3589mO4.f32740n;
                                    g62.k();
                                    break;
                            }
                        }
                    });
                }
                if (c3589mO2.i() != c3589mO.i()) {
                    this.f27555G.c(7, new LN(c3589mO, i16, (byte) 0));
                }
                if (!c3589mO2.f32741o.equals(c3589mO.f32741o)) {
                    final int i29 = 2;
                    this.f27555G.c(12, new InterfaceC3606mo() { // from class: com.google.android.gms.internal.ads.IN
                        @Override // com.google.android.gms.internal.ads.InterfaceC3606mo
                        /* renamed from: a */
                        public final /* synthetic */ void mo5a(Object obj102) {
                            C3589mO c3589mO4 = c3589mO;
                            G6 g62 = (G6) obj102;
                            switch (i29) {
                                case 0:
                                    int i262 = PN.C0;
                                    g62.e0(c3589mO4.f32733f);
                                    break;
                                case 1:
                                    int i272 = PN.C0;
                                    g62.a0(c3589mO4.f32732e);
                                    break;
                                case 2:
                                    int i282 = PN.C0;
                                    C3947t5 c3947t5 = c3589mO4.f32741o;
                                    g62.r();
                                    break;
                                default:
                                    int i292 = PN.C0;
                                    g62.d0(c3589mO4.f32733f);
                                    break;
                            }
                        }
                    });
                }
                c3195f6 = this.f27575k0;
                C4074vO c4074vO = this.f27593z;
                C3195f6 c3195f63 = this.f27587w;
                String str3 = AbstractC3182eu.f30782a;
                boolean W12 = c4074vO.W1();
                AbstractC3627n8 F17 = c4074vO.F1();
                boolean z23 = F17.g() && F17.b(c4074vO.K1(), (U7) c4074vO.f27380n, 0L).f28695f;
                F13 = c4074vO.F1();
                if (F13.g()) {
                    int K13 = c4074vO.K1();
                    c4074vO.l();
                    c4074vO.C1();
                    int i30 = F13.i(K13);
                    i17 = -1;
                    z16 = i30 != -1;
                } else {
                    z16 = false;
                    i17 = -1;
                }
                F14 = c4074vO.F1();
                if (F14.g()) {
                    int K14 = c4074vO.K1();
                    c4074vO.l();
                    c4074vO.C1();
                    z17 = false;
                    z18 = F14.h(K14, 0, false) != i17;
                } else {
                    z17 = false;
                    z18 = false;
                }
                F15 = c4074vO.F1();
                if (F15.g()) {
                    z19 = z23;
                    if (F15.b(c4074vO.K1(), (U7) c4074vO.f27380n, 0L).b()) {
                        z20 = true;
                        F16 = c4074vO.F1();
                        if (F16.g()) {
                            z21 = z20;
                        } else {
                            z21 = z20;
                            if (F16.b(c4074vO.K1(), (U7) c4074vO.f27380n, 0L).f28696g) {
                                z22 = true;
                                boolean g9 = c4074vO.F1().g();
                                j52 = new J5();
                                xo = c3195f63.f30836a;
                                r12 = z17;
                                while (true) {
                                    r10 = xo.f29303a;
                                    if (r12 < r10.size()) {
                                        break;
                                    }
                                    AbstractC2792Sd.K(r12, r10.size());
                                    j52.f26401a.t(r10.keyAt(r12));
                                    r12++;
                                }
                                boolean z24 = !W12;
                                j52.a(4, z24);
                                j52.a(5, (z19 || W12) ? z17 : true);
                                j52.a(6, (z16 || W12) ? z17 : true);
                                j52.a(7, (!g9 || !(z16 || !z21 || z19) || W12) ? z17 : true);
                                j52.a(8, (z18 || W12) ? z17 : true);
                                j52.a(9, (!g9 || !(z18 || (z21 && z22)) || W12) ? z17 : true);
                                j52.a(10, z24);
                                j52.a(11, (z19 || W12) ? z17 : true);
                                j52.a(12, (z19 || W12) ? z17 : true);
                                c3195f62 = new C3195f6(j52.f26401a.u());
                                this.f27575k0 = c3195f62;
                                if (!c3195f62.equals(c3195f6)) {
                                    this.f27555G.c(13, new C4042ut(10, this));
                                }
                                this.f27555G.d();
                            }
                        }
                        z22 = z17;
                        boolean g92 = c4074vO.F1().g();
                        j52 = new J5();
                        xo = c3195f63.f30836a;
                        r12 = z17;
                        while (true) {
                            r10 = xo.f29303a;
                            if (r12 < r10.size()) {
                            }
                            AbstractC2792Sd.K(r12, r10.size());
                            j52.f26401a.t(r10.keyAt(r12));
                            r12++;
                        }
                        boolean z242 = !W12;
                        j52.a(4, z242);
                        j52.a(5, (z19 || W12) ? z17 : true);
                        j52.a(6, (z16 || W12) ? z17 : true);
                        j52.a(7, (!g92 || !(z16 || !z21 || z19) || W12) ? z17 : true);
                        j52.a(8, (z18 || W12) ? z17 : true);
                        j52.a(9, (!g92 || !(z18 || (z21 && z22)) || W12) ? z17 : true);
                        j52.a(10, z242);
                        j52.a(11, (z19 || W12) ? z17 : true);
                        j52.a(12, (z19 || W12) ? z17 : true);
                        c3195f62 = new C3195f6(j52.f26401a.u());
                        this.f27575k0 = c3195f62;
                        if (!c3195f62.equals(c3195f6)) {
                        }
                        this.f27555G.d();
                    }
                } else {
                    z19 = z23;
                }
                z20 = z17;
                F16 = c4074vO.F1();
                if (F16.g()) {
                }
                z22 = z17;
                boolean g922 = c4074vO.F1().g();
                j52 = new J5();
                xo = c3195f63.f30836a;
                r12 = z17;
                while (true) {
                    r10 = xo.f29303a;
                    if (r12 < r10.size()) {
                    }
                    AbstractC2792Sd.K(r12, r10.size());
                    j52.f26401a.t(r10.keyAt(r12));
                    r12++;
                }
                boolean z2422 = !W12;
                j52.a(4, z2422);
                j52.a(5, (z19 || W12) ? z17 : true);
                j52.a(6, (z16 || W12) ? z17 : true);
                j52.a(7, (!g922 || !(z16 || !z21 || z19) || W12) ? z17 : true);
                j52.a(8, (z18 || W12) ? z17 : true);
                j52.a(9, (!g922 || !(z18 || (z21 && z22)) || W12) ? z17 : true);
                j52.a(10, z2422);
                j52.a(11, (z19 || W12) ? z17 : true);
                j52.a(12, (z19 || W12) ? z17 : true);
                c3195f62 = new C3195f6(j52.f26401a.u());
                this.f27575k0 = c3195f62;
                if (!c3195f62.equals(c3195f6)) {
                }
                this.f27555G.d();
            }
            pair = new Pair(Boolean.TRUE, 3);
        }
        i10 = i21;
        i9 = 0;
        z9 = z6;
        booleanValue = ((Boolean) pair.first).booleanValue();
        int intValue2 = ((Integer) pair.second).intValue();
        if (booleanValue) {
        }
        if (booleanValue) {
        }
        M2 a92 = this.f27590x0.a();
        list = c3589mO.f32736j;
        i12 = i9;
        while (i12 < list.size()) {
        }
        z12 = z9;
        this.f27590x0 = new C3085d3(a92);
        F12 = F1();
        if (F12.g()) {
        }
        boolean equals22 = c3085d3.equals(this.f27576l0);
        this.f27576l0 = c3085d3;
        if (c3589mO2.f32738l == c3589mO.f32738l) {
        }
        if (c3589mO2.f32732e == c3589mO.f32732e) {
        }
        if (i14 == 0) {
        }
        u12 = u1();
        r22 = this.f27565R;
        r14 = this.f27564Q;
        if (u12 != 2) {
        }
        O0();
        this.f27592y0.getClass();
        r14.g(A1());
        A12 = A1();
        if (r22.f27915u != A12) {
        }
        if (c3589mO2.f32734g == c3589mO.f32734g) {
        }
        if (!equals) {
        }
        if (z12) {
        }
        if (booleanValue) {
        }
        dn = c3589mO2.f32733f;
        dn2 = c3589mO.f32733f;
        if (dn != dn2) {
        }
        c3941t = c3589mO2.i;
        c3941t2 = c3589mO.i;
        if (c3941t != c3941t2) {
        }
        if (!z15) {
        }
        if (z14) {
        }
        if (i15 == 0) {
        }
        this.f27555G.c(-1, new LN(c3589mO, b9, b9));
        if (i15 != 0) {
        }
        if (i13 == 0) {
        }
        i16 = 1;
        this.f27555G.c(5, new InterfaceC3606mo() { // from class: com.google.android.gms.internal.ads.JN
            @Override // com.google.android.gms.internal.ads.InterfaceC3606mo
            /* renamed from: a */
            public final /* synthetic */ void mo5a(Object obj11) {
                C3589mO c3589mO4 = c3589mO;
                G6 g62 = (G6) obj11;
                switch (i16) {
                    case 0:
                        int i282 = PN.C0;
                        Object obj12 = c3589mO4.i.f34966w;
                        g62.o();
                        break;
                    default:
                        int i292 = PN.C0;
                        boolean z232 = c3589mO4.f32738l;
                        g62.j();
                        break;
                }
            }
        });
        if (c3589mO2.f32740n != c3589mO.f32740n) {
        }
        if (c3589mO2.i() != c3589mO.i()) {
        }
        if (!c3589mO2.f32741o.equals(c3589mO.f32741o)) {
        }
        c3195f6 = this.f27575k0;
        C4074vO c4074vO2 = this.f27593z;
        C3195f6 c3195f632 = this.f27587w;
        String str32 = AbstractC3182eu.f30782a;
        boolean W122 = c4074vO2.W1();
        AbstractC3627n8 F172 = c4074vO2.F1();
        if (F172.g()) {
        }
        F13 = c4074vO2.F1();
        if (F13.g()) {
        }
        F14 = c4074vO2.F1();
        if (F14.g()) {
        }
        F15 = c4074vO2.F1();
        if (F15.g()) {
        }
        z20 = z17;
        F16 = c4074vO2.F1();
        if (F16.g()) {
        }
        z22 = z17;
        boolean g9222 = c4074vO2.F1().g();
        j52 = new J5();
        xo = c3195f632.f30836a;
        r12 = z17;
        while (true) {
            r10 = xo.f29303a;
            if (r12 < r10.size()) {
            }
            AbstractC2792Sd.K(r12, r10.size());
            j52.f26401a.t(r10.keyAt(r12));
            r12++;
        }
        boolean z24222 = !W122;
        j52.a(4, z24222);
        j52.a(5, (z19 || W122) ? z17 : true);
        j52.a(6, (z16 || W122) ? z17 : true);
        j52.a(7, (!g9222 || !(z16 || !z21 || z19) || W122) ? z17 : true);
        j52.a(8, (z18 || W122) ? z17 : true);
        j52.a(9, (!g9222 || !(z18 || (z21 && z22)) || W122) ? z17 : true);
        j52.a(10, z24222);
        j52.a(11, (z19 || W122) ? z17 : true);
        j52.a(12, (z19 || W122) ? z17 : true);
        c3195f62 = new C3195f6(j52.f26401a.u());
        this.f27575k0 = c3195f62;
        if (!c3195f62.equals(c3195f6)) {
        }
        this.f27555G.d();
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void c0(int i, long j6) {
        O0();
        if (i == -1) {
            return;
        }
        AbstractC2792Sd.i(i >= 0);
        AbstractC3627n8 abstractC3627n8 = this.f27592y0.f32728a;
        if (abstractC3627n8.g() || i < abstractC3627n8.a()) {
            BO bo = this.f27558K;
            if (!bo.i) {
                C4182xO t6 = bo.t();
                bo.i = true;
                bo.s(t6, -1, new XJ((byte) 0, 28));
            }
            this.Y++;
            if (p2()) {
                AbstractC2991bG.y("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                C4108w4 c4108w4 = new C4108w4(this.f27592y0);
                c4108w4.f(1);
                PN pn = (PN) this.f27553E.f32643u;
                pn.getClass();
                pn.f27552D.e(new RunnableC3071cq(21, pn, c4108w4));
                return;
            }
            C3589mO c3589mO = this.f27592y0;
            int i4 = c3589mO.f32732e;
            if (i4 == 3 || (i4 == 4 && !abstractC3627n8.g())) {
                c3589mO = this.f27592y0.d(2);
            }
            int K12 = K1();
            C3589mO c22 = c2(c3589mO, abstractC3627n8, e2(abstractC3627n8, i, j6));
            long u6 = AbstractC3182eu.u(j6);
            VN vn = this.f27554F;
            vn.getClass();
            vn.f28985z.b(3, new UN(abstractC3627n8, i, u6)).a();
            a2(c22, 0, true, 1, Z1(c22), K12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3589mO c2(C3589mO c3589mO, AbstractC3627n8 abstractC3627n8, Pair pair) {
        boolean z6;
        List list;
        AbstractC2792Sd.i(abstractC3627n8.g() || pair != null);
        AbstractC3627n8 abstractC3627n82 = c3589mO.f32728a;
        long Y12 = Y1(c3589mO);
        C3589mO c9 = c3589mO.c(abstractC3627n8);
        if (abstractC3627n8.g()) {
            C3860rQ c3860rQ = C3589mO.f32727t;
            long u6 = AbstractC3182eu.u(this.f27548A0);
            C3589mO g9 = c9.b(c3860rQ, u6, u6, u6, 0L, SQ.f28273d, this.f27585v, C3523lC.f32525x).g(c3860rQ);
            g9.f32742p = g9.f32744r;
            return g9;
        }
        C3860rQ c3860rQ2 = c9.f32729b;
        Object obj = c3860rQ2.f34406a;
        String str = AbstractC3182eu.f30782a;
        boolean equals = obj.equals(pair.first);
        C3860rQ c3860rQ3 = !equals ? new C3860rQ(-1L, pair.first) : c3860rQ2;
        long longValue = ((Long) pair.second).longValue();
        long u9 = AbstractC3182eu.u(Y12);
        if (!abstractC3627n82.g()) {
            K7 k72 = this.f27556H;
            abstractC3627n82.o(obj, k72);
            if (equals && u9 - longValue == 1) {
                K7 o4 = abstractC3627n82.o(obj, k72);
                z6 = true;
                if (u9 == o4.f26620d) {
                    u9--;
                }
                if (equals || longValue < u9) {
                    AbstractC2792Sd.H(c3860rQ3.b() ^ z6);
                    SQ sq = equals ? SQ.f28273d : c9.f32735h;
                    C3941t c3941t = equals ? this.f27585v : c9.i;
                    if (equals) {
                        PB pb = RB.f27933u;
                        list = C3523lC.f32525x;
                    } else {
                        list = c9.f32736j;
                    }
                    C3860rQ c3860rQ4 = c3860rQ3;
                    C3589mO g10 = c9.b(c3860rQ4, longValue, longValue, longValue, 0L, sq, c3941t, list).g(c3860rQ4);
                    g10.f32742p = longValue;
                    return g10;
                }
                if (longValue != u9) {
                    AbstractC2792Sd.H(c3860rQ3.b() ^ z6);
                    long max = Math.max(0L, c9.f32743q - (longValue - u9));
                    long j6 = c9.f32742p;
                    if (c9.f32737k.equals(c3860rQ2)) {
                        j6 = longValue + max;
                    }
                    C3589mO b9 = c9.b(c3860rQ3, longValue, longValue, longValue, max, c9.f32735h, c9.i, c9.f32736j);
                    b9.f32742p = j6;
                    return b9;
                }
                int e9 = abstractC3627n8.e(c9.f32737k.f34406a);
                if (e9 != -1) {
                    K7 k73 = this.f27556H;
                    if (abstractC3627n8.d(e9, k73, false).f26619c == abstractC3627n8.o(c3860rQ3.f34406a, k73).f26619c) {
                        return c9;
                    }
                }
                Object obj2 = c3860rQ3.f34406a;
                K7 k74 = this.f27556H;
                abstractC3627n8.o(obj2, k74);
                long b10 = c3860rQ3.b() ? k74.b(c3860rQ3.f34407b, c3860rQ3.f34408c) : k74.f26620d;
                C3860rQ c3860rQ5 = c3860rQ3;
                C3589mO g11 = c9.b(c3860rQ5, c9.f32744r, c9.f32744r, c9.f32731d, b10 - c9.f32744r, c9.f32735h, c9.i, c9.f32736j).g(c3860rQ5);
                g11.f32742p = b10;
                return g11;
            }
        }
        z6 = true;
        if (equals) {
        }
        AbstractC2792Sd.H(c3860rQ3.b() ^ z6);
        SQ sq2 = equals ? SQ.f28273d : c9.f32735h;
        C3941t c3941t2 = equals ? this.f27585v : c9.i;
        if (equals) {
        }
        C3860rQ c3860rQ42 = c3860rQ3;
        C3589mO g102 = c9.b(c3860rQ42, longValue, longValue, longValue, 0L, sq2, c3941t2, list).g(c3860rQ42);
        g102.f32742p = longValue;
        return g102;
    }

    public final Pair e2(AbstractC3627n8 abstractC3627n8, int i, long j6) {
        if (abstractC3627n8.g()) {
            this.f27594z0 = i;
            if (j6 == com.anythink.basead.exoplayer.b.f7168b) {
                j6 = 0;
            }
            this.f27548A0 = j6;
            return null;
        }
        if (i == -1 || i >= abstractC3627n8.a()) {
            i = abstractC3627n8.k(false);
            abstractC3627n8.b(i, (U7) this.f27380n, 0L).getClass();
            j6 = AbstractC3182eu.t(0L);
        }
        return abstractC3627n8.m((U7) this.f27380n, this.f27556H, i, AbstractC3182eu.u(j6));
    }

    public final void f2(Surface surface) {
        Surface surface2 = this.m0;
        boolean z6 = false;
        boolean z9 = true;
        if (surface2 != null && surface2 != surface) {
            z6 = true;
        }
        long j6 = z6 ? this.f27566S : -9223372036854775807L;
        VN vn = this.f27554F;
        if (!vn.f28964j0 && vn.f28937B.getThread().isAlive()) {
            C2818Tm c2818Tm = new C2818Tm();
            vn.f28985z.b(30, new Pair(surface, c2818Tm)).a();
            if (j6 != com.anythink.basead.exoplayer.b.f7168b) {
                z9 = c2818Tm.c(j6);
            }
        }
        if (z6) {
            Surface surface3 = this.m0;
            Surface surface4 = this.f27577n0;
            if (surface3 == surface4) {
                surface4.release();
                this.f27577n0 = null;
            }
        }
        this.m0 = surface;
        if (z9) {
            return;
        }
        W1(new DN(2, new B0.c("Detaching surface timed out."), 1003));
    }

    public final void g2(int i, int i4) {
        Nr nr = this.f27579p0;
        if (i == nr.f27340a && i4 == nr.f27341b) {
            return;
        }
        this.f27579p0 = new Nr(i, i4);
        XJ xj = new XJ(i, i4);
        C3553lp c3553lp = this.f27555G;
        c3553lp.c(24, xj);
        c3553lp.d();
        h2(2, 14, new Nr(i, i4));
    }

    public final void h2(int i, int i4, Object obj) {
        VN vn;
        SP[] spArr = this.f27547A;
        int length = spArr.length;
        int i6 = 0;
        while (true) {
            vn = this.f27554F;
            if (i6 >= 2) {
                break;
            }
            SP sp = spArr[i6];
            if (i == -1 || sp.f28261u == i) {
                X1(this.f27592y0);
                AbstractC3627n8 abstractC3627n8 = this.f27592y0.f32728a;
                C3751pO c3751pO = new C3751pO(vn, sp, vn.f28937B);
                AbstractC2792Sd.H(!c3751pO.f33859f);
                c3751pO.f33856c = i4;
                AbstractC2792Sd.H(!c3751pO.f33859f);
                c3751pO.f33857d = obj;
                c3751pO.a();
            }
            i6++;
        }
        SP[] spArr2 = this.f27549B;
        int length2 = spArr2.length;
        for (int i9 = 0; i9 < 2; i9++) {
            SP sp2 = spArr2[i9];
            if (sp2 != null && (i == -1 || sp2.f28261u == i)) {
                X1(this.f27592y0);
                AbstractC3627n8 abstractC3627n82 = this.f27592y0.f32728a;
                C3751pO c3751pO2 = new C3751pO(vn, sp2, vn.f28937B);
                AbstractC2792Sd.H(!c3751pO2.f33859f);
                c3751pO2.f33856c = i4;
                AbstractC2792Sd.H(!c3751pO2.f33859f);
                c3751pO2.f33857d = obj;
                c3751pO2.a();
            }
        }
    }

    public final void i2(boolean z6) {
        O0();
        C3589mO c3589mO = this.f27592y0;
        int i = c3589mO.f32740n;
        int i4 = 0;
        if (i == 1) {
            if (z6) {
                i = 1;
            } else {
                i = 1;
                i4 = 1;
            }
        }
        if (c3589mO.f32738l == z6 && i == i4 && c3589mO.f32739m == 1) {
            return;
        }
        this.Y++;
        C3589mO h3 = c3589mO.h(1, i4, z6);
        C3235ft c3235ft = this.f27554F.f28985z;
        int i6 = (i4 << 4) | 1;
        c3235ft.getClass();
        C3127dt g9 = C3235ft.g();
        g9.f30645a = c3235ft.f31231a.obtainMessage(1, z6 ? 1 : 0, i6);
        g9.a();
        a2(h3, 0, false, 5, com.anythink.basead.exoplayer.b.f7168b, -1);
    }

    public final void j2() {
        O0();
        W1(null);
        C3523lC c3523lC = C3523lC.f32525x;
        long j6 = this.f27592y0.f32744r;
        new C2781Rj(c3523lC);
    }

    public final int k2() {
        O0();
        if (!this.f27592y0.f32728a.g()) {
            C3589mO c3589mO = this.f27592y0;
            return c3589mO.f32728a.e(c3589mO.f32729b.f34406a);
        }
        int i = this.f27594z0;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void l() {
        O0();
    }

    public final long l2() {
        O0();
        if (!p2()) {
            AbstractC3627n8 F12 = F1();
            return F12.g() ? com.anythink.basead.exoplayer.b.f7168b : AbstractC3182eu.t(F12.b(K1(), (U7) this.f27380n, 0L).f28698j);
        }
        C3589mO c3589mO = this.f27592y0;
        C3860rQ c3860rQ = c3589mO.f32729b;
        Object obj = c3860rQ.f34406a;
        AbstractC3627n8 abstractC3627n8 = c3589mO.f32728a;
        K7 k72 = this.f27556H;
        abstractC3627n8.o(obj, k72);
        return AbstractC3182eu.t(k72.b(c3860rQ.f34407b, c3860rQ.f34408c));
    }

    public final long m2() {
        O0();
        return AbstractC3182eu.t(Z1(this.f27592y0));
    }

    public final long n2() {
        O0();
        if (p2()) {
            C3589mO c3589mO = this.f27592y0;
            return c3589mO.f32737k.equals(c3589mO.f32729b) ? AbstractC3182eu.t(this.f27592y0.f32742p) : l2();
        }
        O0();
        if (this.f27592y0.f32728a.g()) {
            return this.f27548A0;
        }
        C3589mO c3589mO2 = this.f27592y0;
        long j6 = 0;
        if (c3589mO2.f32737k.f34409d != c3589mO2.f32729b.f34409d) {
            return AbstractC3182eu.t(c3589mO2.f32728a.b(K1(), (U7) this.f27380n, 0L).f28698j);
        }
        long j9 = c3589mO2.f32742p;
        if (this.f27592y0.f32737k.b()) {
            C3589mO c3589mO3 = this.f27592y0;
            c3589mO3.f32728a.o(c3589mO3.f32737k.f34406a, this.f27556H).f26622f.a(this.f27592y0.f32737k.f34407b).getClass();
        } else {
            j6 = j9;
        }
        C3589mO c3589mO4 = this.f27592y0;
        c3589mO4.f32728a.o(c3589mO4.f32737k.f34406a, this.f27556H);
        return AbstractC3182eu.t(j6);
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final int o0() {
        O0();
        if (p2()) {
            return this.f27592y0.f32729b.f34407b;
        }
        return -1;
    }

    public final long o2() {
        O0();
        return AbstractC3182eu.t(this.f27592y0.f32743q);
    }

    public final boolean p2() {
        O0();
        return this.f27592y0.f32729b.b();
    }

    public final int q2() {
        O0();
        if (p2()) {
            return this.f27592y0.f32729b.f34408c;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final int u1() {
        O0();
        return this.f27592y0.f32732e;
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final int w1() {
        O0();
        return this.f27592y0.f32740n;
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import com.google.android.gms.internal.consent_sdk.C4300b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class PN extends OK {

    /* renamed from: H0, reason: collision with root package name */
    public static final /* synthetic */ int f26764H0 = 0;

    /* renamed from: A, reason: collision with root package name */
    public final RP[] f26765A;

    /* renamed from: A0, reason: collision with root package name */
    public final int f26766A0;

    /* renamed from: B, reason: collision with root package name */
    public final RP[] f26767B;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f26768B0;

    /* renamed from: C, reason: collision with root package name */
    public final C3649o f26769C;
    public C3062d3 C0;

    /* renamed from: D, reason: collision with root package name */
    public final C3212ft f26770D;

    /* renamed from: D0, reason: collision with root package name */
    public C3566mO f26771D0;

    /* renamed from: E, reason: collision with root package name */
    public final C3534lt f26772E;

    /* renamed from: E0, reason: collision with root package name */
    public int f26773E0;

    /* renamed from: F, reason: collision with root package name */
    public final VN f26774F;

    /* renamed from: F0, reason: collision with root package name */
    public long f26775F0;

    /* renamed from: G, reason: collision with root package name */
    public final C3530lp f26776G;

    /* renamed from: G0, reason: collision with root package name */
    public KQ f26777G0;

    /* renamed from: H, reason: collision with root package name */
    public final K7 f26778H;

    /* renamed from: I, reason: collision with root package name */
    public final ArrayList f26779I;
    public final boolean J;

    /* renamed from: K, reason: collision with root package name */
    public final BO f26780K;

    /* renamed from: L, reason: collision with root package name */
    public final Looper f26781L;

    /* renamed from: M, reason: collision with root package name */
    public final InterfaceC4188y f26782M;

    /* renamed from: N, reason: collision with root package name */
    public final V2 f26783N;

    /* renamed from: O, reason: collision with root package name */
    public final HN f26784O;

    /* renamed from: P, reason: collision with root package name */
    public final O f26785P;

    /* renamed from: Q, reason: collision with root package name */
    public final C3428jv f26786Q;

    /* renamed from: R, reason: collision with root package name */
    public final R2 f26787R;

    /* renamed from: S, reason: collision with root package name */
    public final long f26788S;

    /* renamed from: T, reason: collision with root package name */
    public final C2712Ol f26789T;

    /* renamed from: U, reason: collision with root package name */
    public final C4300b f26790U;

    /* renamed from: V, reason: collision with root package name */
    public final C4274ze f26791V;

    /* renamed from: W, reason: collision with root package name */
    public final S0.e f26792W;

    /* renamed from: X, reason: collision with root package name */
    public final S0.e f26793X;
    public int Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f26794Z;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f26795n0;

    /* renamed from: o0, reason: collision with root package name */
    public final C3943tO f26796o0;

    /* renamed from: p0, reason: collision with root package name */
    public C3172f6 f26797p0;

    /* renamed from: q0, reason: collision with root package name */
    public C3062d3 f26798q0;

    /* renamed from: r0, reason: collision with root package name */
    public Surface f26799r0;

    /* renamed from: s0, reason: collision with root package name */
    public Surface f26800s0;

    /* renamed from: t0, reason: collision with root package name */
    public final int f26801t0;

    /* renamed from: u0, reason: collision with root package name */
    public Nr f26802u0;

    /* renamed from: v, reason: collision with root package name */
    public final C3918t f26803v;

    /* renamed from: v0, reason: collision with root package name */
    public final C2744Qj f26804v0;

    /* renamed from: w, reason: collision with root package name */
    public final C3172f6 f26805w;

    /* renamed from: w0, reason: collision with root package name */
    public float f26806w0;

    /* renamed from: x, reason: collision with root package name */
    public final C2781Sm f26807x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f26808x0;

    /* renamed from: y, reason: collision with root package name */
    public final Context f26809y;

    /* renamed from: y0, reason: collision with root package name */
    public final boolean f26810y0;

    /* renamed from: z, reason: collision with root package name */
    public final C4051vO f26811z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f26812z0;

    static {
        AbstractC4083w2.a("media3.exoplayer");
    }

    public PN(EN en, C4051vO c4051vO) {
        super(6);
        this.f26807x = new C2781Sm();
        try {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String str = AbstractC3159eu.f29993a;
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 31 + String.valueOf(str).length() + 1);
            sb.append("Init ");
            sb.append(hexString);
            sb.append(" [AndroidXMedia3/1.10.1] [");
            sb.append(str);
            sb.append("]");
            AbstractC2968bG.t("ExoPlayerImpl", sb.toString());
            Context context = en.f24584a;
            Looper looper = en.f24591h;
            this.f26809y = context.getApplicationContext();
            V2 v22 = en.f24585b;
            this.f26780K = new BO(v22);
            this.f26766A0 = en.i;
            this.f26804v0 = en.f24592j;
            this.f26801t0 = en.f24593k;
            this.f26808x0 = false;
            this.f26788S = en.f24598p;
            HN hn = new HN(this);
            this.f26784O = hn;
            this.f26785P = new O(1);
            Handler handler = new Handler(looper);
            C4178xq c4178xq = en.f24586c;
            int i = EN.f24583A;
            this.f26765A = ((Qx) c4178xq.f35055u).g(handler, hn, hn);
            this.f26767B = new RP[2];
            int i6 = 0;
            while (true) {
                RP[] rpArr = this.f26767B;
                int length = rpArr.length;
                if (i6 >= 2) {
                    break;
                }
                RP rp = this.f26765A[i6];
                rpArr[i6] = null;
                i6++;
            }
            C3649o c3649o = (C3649o) en.f24588e.mo15c();
            this.f26769C = c3649o;
            en.f24587d.mo15c();
            InterfaceC4188y interfaceC4188y = (InterfaceC4188y) en.f24590g.mo15c();
            this.f26782M = interfaceC4188y;
            this.J = en.f24594l;
            C3997uO c3997uO = en.f24595m;
            this.f26796o0 = en.f24596n;
            Looper looper2 = en.f24591h;
            this.f26781L = looper2;
            this.f26783N = v22;
            this.f26811z = c4051vO;
            this.f26776G = new C3530lp(new CopyOnWriteArraySet(), looper2, looper2.getThread(), v22, new MN(this), true);
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.f26779I = new ArrayList();
            this.f26777G0 = new KQ();
            int length2 = this.f26765A.length;
            C3918t c3918t = new C3918t(new C3889sO[2], new InterfaceC3757q[2], C4109wb.f34842b, null);
            this.f26803v = c3918t;
            this.f26778H = new K7();
            J5 j52 = new J5();
            L3.h hVar = j52.f25648a;
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            hVar.getClass();
            int i9 = 0;
            for (int i10 = 20; i9 < i10; i10 = 20) {
                hVar.t(iArr[i9]);
                i9++;
            }
            c3649o.getClass();
            j52.a(29, true);
            XO u3 = hVar.u();
            this.f26805w = new C3172f6(u3);
            L3.h hVar2 = new J5().f25648a;
            int i11 = 0;
            while (true) {
                SparseBooleanArray sparseBooleanArray = u3.f28523a;
                if (i11 >= sparseBooleanArray.size()) {
                    break;
                }
                AbstractC2772Sd.K(i11, sparseBooleanArray.size());
                hVar2.t(sparseBooleanArray.keyAt(i11));
                i11++;
            }
            hVar2.t(4);
            hVar2.t(10);
            this.f26797p0 = new C3172f6(hVar2.u());
            this.f26770D = v22.x(looper2, null);
            C3534lt c3534lt = new C3534lt(12, this);
            this.f26772E = c3534lt;
            this.f26771D0 = C3566mO.a(c3918t);
            this.f26780K.A(c4051vO, looper2);
            IO io = new IO(en.f24605w);
            VN vn = new VN(this.f26809y, this.f26765A, this.f26767B, c3649o, c3918t, (YN) en.f24589f.mo15c(), interfaceC4188y, this.f26780K, c3997uO, en.f24608z, en.f24597o, en.f24606x, looper2, v22, c3534lt, io, en.f24607y);
            Looper looper3 = vn.f28140B;
            C3212ft c3212ft = vn.f28189z;
            this.f26774F = vn;
            this.f26806w0 = 1.0f;
            C3062d3 c3062d3 = C3062d3.f29665C;
            this.f26798q0 = c3062d3;
            this.C0 = c3062d3;
            this.f26773E0 = -1;
            CB cb = C2761Rj.f27321a;
            this.f26810y0 = true;
            BO bo = this.f26780K;
            bo.getClass();
            this.f26776G.a(bo);
            Handler handler2 = new Handler(looper2);
            BO bo2 = this.f26780K;
            B b9 = (B) interfaceC4188y;
            b9.getClass();
            bo2.getClass();
            Qx qx = b9.f23791v;
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) qx.f27139u;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C4134x c4134x = (C4134x) it.next();
                Iterator it2 = it;
                if (c4134x.f34917b == bo2) {
                    c4134x.f34918c = true;
                    copyOnWriteArrayList.remove(c4134x);
                }
                it = it2;
            }
            ((CopyOnWriteArrayList) qx.f27139u).add(new C4134x(handler2, bo2));
            copyOnWriteArraySet.add(this.f26784O);
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 31) {
                v22.x(looper3, null).e(new L2.i(this.f26809y, en.f24603u, this, io));
            }
            C2712Ol c2712Ol = new C2712Ol(looper3, looper2, v22, new MN(this));
            this.f26789T = c2712Ol;
            RunnableC3807qw runnableC3807qw = new RunnableC3807qw(12, this);
            C3212ft c3212ft2 = (C3212ft) c2712Ol.f26651b;
            if (c3212ft2.f30468a.getLooper().getThread().isAlive()) {
                c3212ft2.e(runnableC3807qw);
            }
            C2866Yb c2866Yb = new C2866Yb(13);
            context.getApplicationContext();
            v22.x(looper3, null);
            new Q0.d(c2866Yb, v22.x(looper, null));
            boolean z3 = (en.f24600r == Integer.MAX_VALUE || en.f24601s == Integer.MAX_VALUE) ? false : true;
            C3428jv c3428jv = new C3428jv(context, looper3, v22);
            this.f26786Q = c3428jv;
            if (c3428jv.f31345n != z3) {
                c3428jv.f31345n = z3;
                c3428jv.j(z3, c3428jv.f31346u);
            }
            R2 r22 = new R2(3);
            context.getApplicationContext();
            v22.x(looper3, null);
            v22.x(Looper.getMainLooper(), null);
            this.f26787R = r22;
            int i13 = WN.f28351a;
            C3035cd c3035cd = C3035cd.f29500d;
            this.f26802u0 = Nr.f26557c;
            this.f26791V = i12 >= 34 ? new C4274ze(this, context) : null;
            this.f26792W = new S0.e(this);
            this.f26793X = new S0.e(this);
            this.f26790U = new C4300b(this, this.f26784O, v22, en.f24599q, en.f24600r, en.f24601s, en.f24602t);
            c3212ft.b(38, this.f26796o0).a();
            C2744Qj c2744Qj = this.f26804v0;
            c3212ft.getClass();
            C3104dt g4 = C3212ft.g();
            g4.f29857a = c3212ft.f30468a.obtainMessage(31, 0, 0, c2744Qj);
            g4.a();
            h2(1, 3, this.f26804v0);
            h2(2, 4, Integer.valueOf(this.f26801t0));
            h2(2, 5, 0);
            h2(1, 9, Boolean.valueOf(this.f26808x0));
            h2(6, 8, this.f26785P);
            h2(-1, 16, Integer.valueOf(this.f26766A0));
            this.f26807x.a();
        } catch (Throwable th) {
            this.f26807x.a();
            throw th;
        }
    }

    public static long b2(C3566mO c3566mO) {
        U7 u72 = new U7();
        K7 k72 = new K7();
        AbstractC3604n8 abstractC3604n8 = c3566mO.f31948a;
        abstractC3604n8.o(c3566mO.f31949b.f32905a, k72);
        long j6 = c3566mO.f31950c;
        if (j6 != com.anythink.basead.exoplayer.b.f6382b) {
            return j6;
        }
        abstractC3604n8.b(k72.f25867c, u72, 0L).getClass();
        return 0L;
    }

    public static C3566mO d2(C3566mO c3566mO, int i) {
        C3566mO d2 = c3566mO.d(i);
        return (i == 1 || i == 4) ? d2.f(false) : d2;
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final boolean A1() {
        P0();
        return this.f26771D0.f31958l;
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void C1() {
        P0();
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final AbstractC3604n8 F1() {
        P0();
        return this.f26771D0.f31948a;
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final int J1() {
        P0();
        int X12 = X1(this.f26771D0);
        if (X12 == -1) {
            return 0;
        }
        return X12;
    }

    public final void P0() {
        this.f26807x.b();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f26781L;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = AbstractC3159eu.f29993a;
            Locale locale = Locale.US;
            String p9 = D.y.p("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.f26810y0) {
                throw new IllegalStateException(p9);
            }
            AbstractC2968bG.C("ExoPlayerImpl", p9, this.f26812z0 ? null : new IllegalStateException());
            this.f26812z0 = true;
        }
    }

    public final void Q1(float f3) {
        P0();
        String str = AbstractC3159eu.f29993a;
        float max = Math.max(0.0f, Math.min(f3, 1.0f));
        if (this.f26806w0 == max) {
            return;
        }
        this.f26806w0 = max;
        this.f26774F.f28189z.b(32, Float.valueOf(max)).a();
        XJ xj = new XJ(max);
        C3530lp c3530lp = this.f26776G;
        c3530lp.c(22, xj);
        c3530lp.d();
    }

    public final void T1(InterfaceC4213yO interfaceC4213yO) {
        this.f26780K.f23900f.a(interfaceC4213yO);
    }

    public final void U1(C3414jh c3414jh) {
        P0();
        this.f26780K.f23900f.b(c3414jh);
    }

    public final void V1() {
        String str;
        boolean z3;
        Context context;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str2 = AbstractC3159eu.f29993a;
        HashSet hashSet = AbstractC4083w2.f34786a;
        synchronized (AbstractC4083w2.class) {
            str = AbstractC4083w2.f34787b;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 34 + String.valueOf(str2).length() + 3 + String.valueOf(str).length() + 1);
        u1.h.i(sb, "Release ", hexString, " [AndroidXMedia3/1.10.1] [", str2);
        sb.append("] [");
        sb.append(str);
        sb.append("]");
        AbstractC2968bG.t("ExoPlayerImpl", sb.toString());
        P0();
        this.f26786Q.g(false);
        R2 r22 = this.f26787R;
        if (r22.f27159u) {
            r22.f27159u = false;
        }
        C4274ze c4274ze = this.f26791V;
        if (c4274ze != null && Build.VERSION.SDK_INT >= 34 && (context = (Context) ((WeakReference) c4274ze.f35360u).get()) != null) {
            context.unregisterDeviceIdChangeListener((ON) c4274ze.f35361v);
        }
        C4300b c4300b = this.f26790U;
        ((C3212ft) c4300b.f35652e).f30468a.removeCallbacksAndMessages(null);
        Zr zr = (Zr) c4300b.f35649b;
        PN pn = (PN) c4300b.f35648a;
        pn.P0();
        zr.getClass();
        pn.f26776G.b(zr);
        VN vn = this.f26774F;
        if (vn.f28173o0 || !vn.f28140B.getThread().isAlive()) {
            z3 = true;
        } else {
            vn.f28173o0 = true;
            C2781Sm c2781Sm = new C2781Sm();
            vn.f28189z.b(7, c2781Sm).a();
            z3 = c2781Sm.c(vn.f28157L);
        }
        if (!z3) {
            C3530lp c3530lp = this.f26776G;
            c3530lp.c(10, XJ.f28514w);
            c3530lp.d();
        }
        this.f26776G.e();
        this.f26770D.f30468a.removeCallbacksAndMessages(null);
        InterfaceC4188y interfaceC4188y = this.f26782M;
        BO bo = this.f26780K;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((B) interfaceC4188y).f23791v.f27139u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C4134x c4134x = (C4134x) it.next();
            if (c4134x.f34917b == bo) {
                c4134x.f34918c = true;
                copyOnWriteArrayList.remove(c4134x);
            }
        }
        this.f26771D0.getClass();
        C3566mO d2 = d2(this.f26771D0, 1);
        this.f26771D0 = d2;
        C3566mO g4 = d2.g(d2.f31949b);
        this.f26771D0 = g4;
        g4.f31962p = g4.f31964r;
        this.f26771D0.f31963q = 0L;
        C3212ft c3212ft = bo.f23902h;
        c3212ft.getClass();
        c3212ft.e(new RunnableC3807qw(15, bo));
        Surface surface = this.f26800s0;
        if (surface != null) {
            surface.release();
            this.f26800s0 = null;
        }
        CB cb = C2761Rj.f27321a;
        this.f26768B0 = true;
        if (this.f26771D0.f31948a.g()) {
            return;
        }
        C3566mO c3566mO = this.f26771D0;
        boolean z6 = c3566mO.f31948a.e(c3566mO.f31949b.f32905a) != -1;
        Locale locale = Locale.US;
        C3566mO c3566mO2 = this.f26771D0;
        AbstractC2772Sd.I(String.format(locale, "periodUid %s not found in timeline %s with size %d", c3566mO2.f31949b.f32905a, c3566mO2.f31948a.getClass().getName(), Integer.valueOf(this.f26771D0.f31948a.a())), z6);
    }

    public final void W1(DN dn) {
        C3566mO c3566mO = this.f26771D0;
        C3566mO g4 = c3566mO.g(c3566mO.f31949b);
        g4.f31962p = g4.f31964r;
        g4.f31963q = 0L;
        C3566mO d2 = d2(g4, 1);
        if (dn != null) {
            d2 = d2.e(dn);
        }
        C3566mO c3566mO2 = d2;
        this.Y++;
        C3212ft c3212ft = this.f26774F.f28189z;
        c3212ft.getClass();
        C3104dt g9 = C3212ft.g();
        g9.f29857a = c3212ft.f30468a.obtainMessage(6);
        g9.a();
        a2(c3566mO2, 0, false, 5, com.anythink.basead.exoplayer.b.f6382b, -1);
    }

    public final int X1(C3566mO c3566mO) {
        AbstractC3604n8 abstractC3604n8 = c3566mO.f31948a;
        return abstractC3604n8.g() ? this.f26773E0 : abstractC3604n8.o(c3566mO.f31949b.f32905a, this.f26778H).f25867c;
    }

    public final long Y1(C3566mO c3566mO) {
        C3676oQ c3676oQ = c3566mO.f31949b;
        if (!c3676oQ.b()) {
            return AbstractC3159eu.t(Z1(c3566mO));
        }
        Object obj = c3676oQ.f32905a;
        K7 k72 = this.f26778H;
        AbstractC3604n8 abstractC3604n8 = c3566mO.f31948a;
        abstractC3604n8.o(obj, k72);
        long j6 = c3566mO.f31950c;
        if (j6 == com.anythink.basead.exoplayer.b.f6382b) {
            abstractC3604n8.b(X1(c3566mO), (U7) this.f26598n, 0L).getClass();
            return AbstractC3159eu.t(0L);
        }
        return AbstractC3159eu.t(j6) + AbstractC3159eu.t(0L);
    }

    public final long Z1(C3566mO c3566mO) {
        AbstractC3604n8 abstractC3604n8 = c3566mO.f31948a;
        if (abstractC3604n8.g()) {
            return AbstractC3159eu.u(this.f26775F0);
        }
        long j6 = c3566mO.f31964r;
        C3676oQ c3676oQ = c3566mO.f31949b;
        if (c3676oQ.b()) {
            return j6;
        }
        abstractC3604n8.o(c3676oQ.f32905a, this.f26778H);
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
    public final void a2(final C3566mO c3566mO, int i, boolean z3, int i6, long j6, int i9) {
        int i10;
        int i11;
        boolean z6;
        Pair pair;
        boolean z9;
        boolean z10;
        int i12;
        boolean booleanValue;
        C2954b2 c2954b2;
        List list;
        int i13;
        boolean z11;
        boolean z12;
        AbstractC3604n8 F12;
        C3062d3 c3062d3;
        int i14;
        int i15;
        int u12;
        R2 r22;
        ?? r14;
        boolean A12;
        boolean z13;
        boolean z14;
        int i16;
        DN dn;
        DN dn2;
        C3918t c3918t;
        C3918t c3918t2;
        final byte b9;
        final int i17;
        C3172f6 c3172f6;
        AbstractC3604n8 F13;
        int i18;
        boolean z15;
        AbstractC3604n8 F14;
        boolean z16;
        boolean z17;
        AbstractC3604n8 F15;
        boolean z18;
        boolean z19;
        AbstractC3604n8 F16;
        boolean z20;
        boolean z21;
        J5 j52;
        XO xo;
        ?? r12;
        ?? r10;
        C3172f6 c3172f62;
        int i19;
        int i20;
        Object obj;
        C2954b2 c2954b22;
        Object obj2;
        long j9;
        long b22;
        int i21;
        Object obj3;
        C2954b2 c2954b23;
        Object obj4;
        int i22 = i6;
        C3566mO c3566mO2 = this.f26771D0;
        this.f26771D0 = c3566mO;
        AbstractC3604n8 abstractC3604n8 = c3566mO.f31948a;
        if (!abstractC3604n8.g()) {
            Object obj5 = c3566mO.f31949b.f32905a;
            AbstractC2772Sd.I(String.format(Locale.US, "periodUid %s not found in timeline %s with size %d", obj5, abstractC3604n8.getClass().getName(), Integer.valueOf(abstractC3604n8.a())), abstractC3604n8.e(obj5) != -1);
        }
        AbstractC3604n8 abstractC3604n82 = c3566mO2.f31948a;
        boolean equals = abstractC3604n82.equals(abstractC3604n8);
        if (abstractC3604n8.g() && abstractC3604n82.g()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else {
            if (abstractC3604n8.g() == abstractC3604n82.g()) {
                C3676oQ c3676oQ = c3566mO2.f31949b;
                Object obj6 = c3676oQ.f32905a;
                i10 = 0;
                K7 k72 = this.f26778H;
                int i23 = abstractC3604n82.o(obj6, k72).f25867c;
                U7 u72 = (U7) this.f26598n;
                Object obj7 = abstractC3604n82.b(i23, u72, 0L).f27893a;
                C3676oQ c3676oQ2 = c3566mO.f31949b;
                if (obj7.equals(abstractC3604n8.b(abstractC3604n8.o(c3676oQ2.f32905a, k72).f25867c, u72, 0L).f27893a)) {
                    if (z3) {
                        if (i22 != 0) {
                            i11 = i22;
                        } else if (c3676oQ.f32908d < c3676oQ2.f32908d) {
                            pair = new Pair(Boolean.TRUE, 0);
                            i11 = 0;
                            z6 = true;
                        } else {
                            i11 = 0;
                        }
                        z6 = true;
                    } else {
                        i11 = i22;
                        z6 = false;
                    }
                    pair = new Pair(Boolean.FALSE, -1);
                } else {
                    if (!z3) {
                        z9 = false;
                        z10 = false;
                    } else if (i22 == 0) {
                        i22 = 0;
                        i12 = 1;
                        z10 = true;
                        pair = new Pair(Boolean.TRUE, Integer.valueOf(i12));
                        i11 = i22;
                        z6 = z10;
                    } else {
                        z9 = true;
                        z10 = true;
                    }
                    if (z9 && i22 == 1) {
                        i12 = 2;
                    } else {
                        if (equals) {
                            throw new IllegalStateException();
                        }
                        i12 = 3;
                    }
                    pair = new Pair(Boolean.TRUE, Integer.valueOf(i12));
                    i11 = i22;
                    z6 = z10;
                }
                booleanValue = ((Boolean) pair.first).booleanValue();
                int intValue = ((Integer) pair.second).intValue();
                if (booleanValue) {
                    c2954b2 = null;
                } else {
                    c2954b2 = !abstractC3604n8.g() ? abstractC3604n8.b(abstractC3604n8.o(c3566mO.f31949b.f32905a, this.f26778H).f25867c, (U7) this.f26598n, 0L).f27894b : null;
                    this.C0 = C3062d3.f29665C;
                }
                if (booleanValue && c3566mO2.f31956j.equals(c3566mO.f31956j)) {
                    z11 = z6;
                } else {
                    M2 a9 = this.C0.a();
                    list = c3566mO.f31956j;
                    i13 = i10;
                    while (i13 < list.size()) {
                        O3 o32 = (O3) list.get(i13);
                        int i24 = i10;
                        while (true) {
                            InterfaceC3922t3[] interfaceC3922t3Arr = o32.f26586a;
                            z12 = z6;
                            if (i24 < interfaceC3922t3Arr.length) {
                                interfaceC3922t3Arr[i24].a(a9);
                                i24++;
                                z6 = z12;
                            }
                        }
                        i13++;
                        z6 = z12;
                    }
                    z11 = z6;
                    this.C0 = new C3062d3(a9);
                }
                F12 = F1();
                if (F12.g()) {
                    C2954b2 c2954b24 = F12.b(J1(), (U7) this.f26598n, 0L).f27894b;
                    M2 a10 = this.C0.a();
                    C3062d3 c3062d32 = c2954b24.f29187d;
                    if (c3062d32 != null) {
                        CharSequence charSequence = c3062d32.f29668a;
                        if (charSequence != null) {
                            a10.f26211a = charSequence;
                        }
                        CharSequence charSequence2 = c3062d32.f29669b;
                        if (charSequence2 != null) {
                            a10.f26212b = charSequence2;
                        }
                        CharSequence charSequence3 = c3062d32.f29670c;
                        if (charSequence3 != null) {
                            a10.f26213c = charSequence3;
                        }
                        CharSequence charSequence4 = c3062d32.f29671d;
                        if (charSequence4 != null) {
                            a10.f26214d = charSequence4;
                        }
                        CharSequence charSequence5 = c3062d32.f29672e;
                        if (charSequence5 != null) {
                            a10.f26215e = charSequence5;
                        }
                        byte[] bArr = c3062d32.f29673f;
                        if (bArr != null) {
                            a10.f26216f = (byte[]) bArr.clone();
                            a10.f26217g = c3062d32.f29674g;
                        }
                        Integer num = c3062d32.f29675h;
                        if (num != null) {
                            a10.f26218h = num;
                        }
                        Integer num2 = c3062d32.i;
                        if (num2 != null) {
                            a10.i = num2;
                        }
                        Integer num3 = c3062d32.f29676j;
                        if (num3 != null) {
                            a10.f26219j = num3;
                        }
                        Boolean bool = c3062d32.f29677k;
                        if (bool != null) {
                            a10.f26220k = bool;
                        }
                        Integer num4 = c3062d32.f29678l;
                        if (num4 != null) {
                            a10.f26221l = num4;
                        }
                        Integer num5 = c3062d32.f29679m;
                        if (num5 != null) {
                            a10.f26221l = num5;
                        }
                        Integer num6 = c3062d32.f29680n;
                        if (num6 != null) {
                            a10.f26222m = num6;
                        }
                        Integer num7 = c3062d32.f29681o;
                        if (num7 != null) {
                            a10.f26223n = num7;
                        }
                        Integer num8 = c3062d32.f29682p;
                        if (num8 != null) {
                            a10.f26224o = num8;
                        }
                        Integer num9 = c3062d32.f29683q;
                        if (num9 != null) {
                            a10.f26225p = num9;
                        }
                        Integer num10 = c3062d32.f29684r;
                        if (num10 != null) {
                            a10.f26226q = num10;
                        }
                        CharSequence charSequence6 = c3062d32.f29685s;
                        if (charSequence6 != null) {
                            a10.f26227r = charSequence6;
                        }
                        CharSequence charSequence7 = c3062d32.f29686t;
                        if (charSequence7 != null) {
                            a10.f26228s = charSequence7;
                        }
                        CharSequence charSequence8 = c3062d32.f29687u;
                        if (charSequence8 != null) {
                            a10.f26229t = charSequence8;
                        }
                        CharSequence charSequence9 = c3062d32.f29688v;
                        if (charSequence9 != null) {
                            a10.f26230u = charSequence9;
                        }
                        Integer num11 = c3062d32.f29689w;
                        if (num11 != null) {
                            a10.f26231v = num11;
                        }
                        Integer num12 = c3062d32.f29690x;
                        if (num12 != null) {
                            a10.f26232w = num12;
                        }
                        CharSequence charSequence10 = c3062d32.f29691y;
                        if (charSequence10 != null) {
                            a10.f26233x = charSequence10;
                        }
                        CharSequence charSequence11 = c3062d32.f29692z;
                        if (charSequence11 != null) {
                            a10.f26234y = charSequence11;
                        }
                        Integer num13 = c3062d32.f29666A;
                        if (num13 != null) {
                            a10.f26235z = num13;
                        }
                        RB rb = c3062d32.f29667B;
                        if (!rb.isEmpty()) {
                            a10.f26210A = RB.n(rb);
                        }
                    }
                    c3062d3 = new C3062d3(a10);
                } else {
                    c3062d3 = this.C0;
                }
                boolean equals2 = c3062d3.equals(this.f26798q0);
                this.f26798q0 = c3062d3;
                i14 = c3566mO2.f31958l == c3566mO.f31958l ? 1 : i10;
                i15 = c3566mO2.f31952e == c3566mO.f31952e ? 1 : i10;
                if (i15 == 0 || i14 != 0) {
                    u12 = u1();
                    r22 = this.f26787R;
                    r14 = this.f26786Q;
                    if (u12 != 2 || u12 == 3) {
                        P0();
                        this.f26771D0.getClass();
                        r14.g(A1());
                        A12 = A1();
                        if (r22.f27159u != A12) {
                            r22.f27159u = A12;
                        }
                    } else {
                        ?? r122 = i10;
                        r14.g(r122);
                        if (r22.f27159u) {
                            r22.f27159u = r122;
                        }
                    }
                }
                z13 = c3566mO2.f31954g == c3566mO.f31954g;
                if (!equals) {
                    this.f26776G.c(0, new LN(c3566mO, i));
                }
                if (z11) {
                    z14 = equals2;
                    i16 = i15;
                } else {
                    K7 k73 = new K7();
                    if (abstractC3604n82.g()) {
                        z14 = equals2;
                        i16 = i15;
                        i19 = i9;
                        i20 = i19;
                        obj = null;
                        c2954b22 = null;
                        obj2 = null;
                    } else {
                        Object obj8 = c3566mO2.f31949b.f32905a;
                        abstractC3604n82.o(obj8, k73);
                        int i25 = k73.f25867c;
                        int e9 = abstractC3604n82.e(obj8);
                        U7 u73 = (U7) this.f26598n;
                        z14 = equals2;
                        i16 = i15;
                        obj = abstractC3604n82.b(i25, u73, 0L).f27893a;
                        c2954b22 = u73.f27894b;
                        obj2 = obj8;
                        i19 = i25;
                        i20 = e9;
                    }
                    if (i11 == 0) {
                        C3676oQ c3676oQ3 = c3566mO2.f31949b;
                        if (c3676oQ3.b()) {
                            j9 = k73.b(c3676oQ3.f32906b, c3676oQ3.f32907c);
                            b22 = b2(c3566mO2);
                            String str = AbstractC3159eu.f29993a;
                            C3676oQ c3676oQ4 = c3566mO2.f31949b;
                            X6 x62 = new X6(obj, i19, c2954b22, obj2, i20, AbstractC3159eu.t(j9), AbstractC3159eu.t(b22), c3676oQ4.f32906b, c3676oQ4.f32907c);
                            int J12 = J1();
                            int k22 = k2();
                            if (this.f26771D0.f31948a.g()) {
                                C3566mO c3566mO3 = this.f26771D0;
                                Object obj9 = c3566mO3.f31949b.f32905a;
                                c3566mO3.f31948a.o(obj9, this.f26778H);
                                int e10 = this.f26771D0.f31948a.e(obj9);
                                AbstractC3604n8 abstractC3604n83 = this.f26771D0.f31948a;
                                U7 u74 = (U7) this.f26598n;
                                i21 = e10;
                                obj3 = abstractC3604n83.b(J12, u74, 0L).f27893a;
                                c2954b23 = u74.f27894b;
                                obj4 = obj9;
                            } else {
                                i21 = k22;
                                obj3 = null;
                                c2954b23 = null;
                                obj4 = null;
                            }
                            long t6 = AbstractC3159eu.t(j6);
                            long t9 = !this.f26771D0.f31949b.b() ? AbstractC3159eu.t(b2(this.f26771D0)) : t6;
                            C3676oQ c3676oQ5 = this.f26771D0.f31949b;
                            X6 x63 = new X6(obj3, J12, c2954b23, obj4, i21, t6, t9, c3676oQ5.f32906b, c3676oQ5.f32907c);
                            C3530lp c3530lp = this.f26776G;
                            C3493l5 c3493l5 = new C3493l5();
                            c3493l5.f31707n = i11;
                            c3493l5.f31708u = x62;
                            c3493l5.f31709v = x63;
                            c3530lp.c(11, c3493l5);
                        } else {
                            j9 = c3676oQ3.f32909e != -1 ? b2(this.f26771D0) : k73.f25868d;
                            b22 = j9;
                            String str2 = AbstractC3159eu.f29993a;
                            C3676oQ c3676oQ42 = c3566mO2.f31949b;
                            X6 x622 = new X6(obj, i19, c2954b22, obj2, i20, AbstractC3159eu.t(j9), AbstractC3159eu.t(b22), c3676oQ42.f32906b, c3676oQ42.f32907c);
                            int J122 = J1();
                            int k222 = k2();
                            if (this.f26771D0.f31948a.g()) {
                            }
                            long t62 = AbstractC3159eu.t(j6);
                            if (!this.f26771D0.f31949b.b()) {
                            }
                            C3676oQ c3676oQ52 = this.f26771D0.f31949b;
                            X6 x632 = new X6(obj3, J122, c2954b23, obj4, i21, t62, t9, c3676oQ52.f32906b, c3676oQ52.f32907c);
                            C3530lp c3530lp2 = this.f26776G;
                            C3493l5 c3493l52 = new C3493l5();
                            c3493l52.f31707n = i11;
                            c3493l52.f31708u = x622;
                            c3493l52.f31709v = x632;
                            c3530lp2.c(11, c3493l52);
                        }
                    } else if (c3566mO2.f31949b.b()) {
                        j9 = c3566mO2.f31964r;
                        b22 = b2(c3566mO2);
                        String str22 = AbstractC3159eu.f29993a;
                        C3676oQ c3676oQ422 = c3566mO2.f31949b;
                        X6 x6222 = new X6(obj, i19, c2954b22, obj2, i20, AbstractC3159eu.t(j9), AbstractC3159eu.t(b22), c3676oQ422.f32906b, c3676oQ422.f32907c);
                        int J1222 = J1();
                        int k2222 = k2();
                        if (this.f26771D0.f31948a.g()) {
                        }
                        long t622 = AbstractC3159eu.t(j6);
                        if (!this.f26771D0.f31949b.b()) {
                        }
                        C3676oQ c3676oQ522 = this.f26771D0.f31949b;
                        X6 x6322 = new X6(obj3, J1222, c2954b23, obj4, i21, t622, t9, c3676oQ522.f32906b, c3676oQ522.f32907c);
                        C3530lp c3530lp22 = this.f26776G;
                        C3493l5 c3493l522 = new C3493l5();
                        c3493l522.f31707n = i11;
                        c3493l522.f31708u = x6222;
                        c3493l522.f31709v = x6322;
                        c3530lp22.c(11, c3493l522);
                    } else {
                        j9 = c3566mO2.f31964r;
                        b22 = j9;
                        String str222 = AbstractC3159eu.f29993a;
                        C3676oQ c3676oQ4222 = c3566mO2.f31949b;
                        X6 x62222 = new X6(obj, i19, c2954b22, obj2, i20, AbstractC3159eu.t(j9), AbstractC3159eu.t(b22), c3676oQ4222.f32906b, c3676oQ4222.f32907c);
                        int J12222 = J1();
                        int k22222 = k2();
                        if (this.f26771D0.f31948a.g()) {
                        }
                        long t6222 = AbstractC3159eu.t(j6);
                        if (!this.f26771D0.f31949b.b()) {
                        }
                        C3676oQ c3676oQ5222 = this.f26771D0.f31949b;
                        X6 x63222 = new X6(obj3, J12222, c2954b23, obj4, i21, t6222, t9, c3676oQ5222.f32906b, c3676oQ5222.f32907c);
                        C3530lp c3530lp222 = this.f26776G;
                        C3493l5 c3493l5222 = new C3493l5();
                        c3493l5222.f31707n = i11;
                        c3493l5222.f31708u = x62222;
                        c3493l5222.f31709v = x63222;
                        c3530lp222.c(11, c3493l5222);
                    }
                }
                if (booleanValue) {
                    this.f26776G.c(1, new XJ(c2954b2, intValue));
                }
                dn = c3566mO2.f31953f;
                dn2 = c3566mO.f31953f;
                if (dn != dn2) {
                    C3530lp c3530lp3 = this.f26776G;
                    final int i26 = 3;
                    c3530lp3.c(10, new InterfaceC3529lo() { // from class: com.google.android.gms.internal.ads.IN
                        @Override // com.google.android.gms.internal.ads.InterfaceC3529lo
                        /* renamed from: a */
                        public final /* synthetic */ void mo1a(Object obj10) {
                            C3566mO c3566mO4 = c3566mO;
                            G6 g62 = (G6) obj10;
                            switch (i26) {
                                case 0:
                                    int i27 = PN.f26764H0;
                                    g62.e0(c3566mO4.f31953f);
                                    break;
                                case 1:
                                    int i28 = PN.f26764H0;
                                    g62.a0(c3566mO4.f31952e);
                                    break;
                                case 2:
                                    int i29 = PN.f26764H0;
                                    C3924t5 c3924t5 = c3566mO4.f31961o;
                                    g62.r();
                                    break;
                                default:
                                    int i30 = PN.f26764H0;
                                    g62.d0(c3566mO4.f31953f);
                                    break;
                            }
                        }
                    });
                    if (dn2 != null) {
                        final int i27 = 0;
                        c3530lp3.c(10, new InterfaceC3529lo() { // from class: com.google.android.gms.internal.ads.IN
                            @Override // com.google.android.gms.internal.ads.InterfaceC3529lo
                            /* renamed from: a */
                            public final /* synthetic */ void mo1a(Object obj10) {
                                C3566mO c3566mO4 = c3566mO;
                                G6 g62 = (G6) obj10;
                                switch (i27) {
                                    case 0:
                                        int i272 = PN.f26764H0;
                                        g62.e0(c3566mO4.f31953f);
                                        break;
                                    case 1:
                                        int i28 = PN.f26764H0;
                                        g62.a0(c3566mO4.f31952e);
                                        break;
                                    case 2:
                                        int i29 = PN.f26764H0;
                                        C3924t5 c3924t5 = c3566mO4.f31961o;
                                        g62.r();
                                        break;
                                    default:
                                        int i30 = PN.f26764H0;
                                        g62.d0(c3566mO4.f31953f);
                                        break;
                                }
                            }
                        });
                    }
                }
                c3918t = c3566mO2.i;
                c3918t2 = c3566mO.i;
                if (c3918t != c3918t2) {
                    C3649o c3649o = this.f26769C;
                    Object obj10 = c3918t2.f34181x;
                    c3649o.getClass();
                    final int i28 = 0;
                    this.f26776G.c(2, new InterfaceC3529lo() { // from class: com.google.android.gms.internal.ads.JN
                        @Override // com.google.android.gms.internal.ads.InterfaceC3529lo
                        /* renamed from: a */
                        public final /* synthetic */ void mo1a(Object obj11) {
                            C3566mO c3566mO4 = c3566mO;
                            G6 g62 = (G6) obj11;
                            switch (i28) {
                                case 0:
                                    int i29 = PN.f26764H0;
                                    Object obj12 = c3566mO4.i.f34180w;
                                    g62.o();
                                    break;
                                default:
                                    int i30 = PN.f26764H0;
                                    boolean z22 = c3566mO4.f31958l;
                                    g62.j();
                                    break;
                            }
                        }
                    });
                }
                if (!z14) {
                    this.f26776G.c(14, new XJ(this.f26798q0));
                }
                if (z13) {
                    b9 = 0;
                } else {
                    b9 = 0;
                    this.f26776G.c(3, new InterfaceC3529lo() { // from class: com.google.android.gms.internal.ads.KN
                        @Override // com.google.android.gms.internal.ads.InterfaceC3529lo
                        /* renamed from: a */
                        public final /* synthetic */ void mo1a(Object obj11) {
                            C3566mO c3566mO4 = c3566mO;
                            G6 g62 = (G6) obj11;
                            switch (b9) {
                                case 0:
                                    int i29 = PN.f26764H0;
                                    boolean z22 = c3566mO4.f31954g;
                                    g62.e();
                                    break;
                                default:
                                    int i30 = PN.f26764H0;
                                    int i31 = c3566mO4.f31960n;
                                    g62.k();
                                    break;
                            }
                        }
                    });
                }
                if (i16 == 0 || i14 != 0) {
                    this.f26776G.c(-1, new LN(c3566mO, b9, b9));
                }
                if (i16 != 0) {
                    final int i29 = 1;
                    this.f26776G.c(4, new InterfaceC3529lo() { // from class: com.google.android.gms.internal.ads.IN
                        @Override // com.google.android.gms.internal.ads.InterfaceC3529lo
                        /* renamed from: a */
                        public final /* synthetic */ void mo1a(Object obj102) {
                            C3566mO c3566mO4 = c3566mO;
                            G6 g62 = (G6) obj102;
                            switch (i29) {
                                case 0:
                                    int i272 = PN.f26764H0;
                                    g62.e0(c3566mO4.f31953f);
                                    break;
                                case 1:
                                    int i282 = PN.f26764H0;
                                    g62.a0(c3566mO4.f31952e);
                                    break;
                                case 2:
                                    int i292 = PN.f26764H0;
                                    C3924t5 c3924t5 = c3566mO4.f31961o;
                                    g62.r();
                                    break;
                                default:
                                    int i30 = PN.f26764H0;
                                    g62.d0(c3566mO4.f31953f);
                                    break;
                            }
                        }
                    });
                }
                if (i14 == 0 || c3566mO2.f31959m != c3566mO.f31959m) {
                    i17 = 1;
                    this.f26776G.c(5, new InterfaceC3529lo() { // from class: com.google.android.gms.internal.ads.JN
                        @Override // com.google.android.gms.internal.ads.InterfaceC3529lo
                        /* renamed from: a */
                        public final /* synthetic */ void mo1a(Object obj11) {
                            C3566mO c3566mO4 = c3566mO;
                            G6 g62 = (G6) obj11;
                            switch (i17) {
                                case 0:
                                    int i292 = PN.f26764H0;
                                    Object obj12 = c3566mO4.i.f34180w;
                                    g62.o();
                                    break;
                                default:
                                    int i30 = PN.f26764H0;
                                    boolean z22 = c3566mO4.f31958l;
                                    g62.j();
                                    break;
                            }
                        }
                    });
                } else {
                    i17 = 1;
                }
                if (c3566mO2.f31960n != c3566mO.f31960n) {
                    this.f26776G.c(6, new InterfaceC3529lo() { // from class: com.google.android.gms.internal.ads.KN
                        @Override // com.google.android.gms.internal.ads.InterfaceC3529lo
                        /* renamed from: a */
                        public final /* synthetic */ void mo1a(Object obj11) {
                            C3566mO c3566mO4 = c3566mO;
                            G6 g62 = (G6) obj11;
                            switch (i17) {
                                case 0:
                                    int i292 = PN.f26764H0;
                                    boolean z22 = c3566mO4.f31954g;
                                    g62.e();
                                    break;
                                default:
                                    int i30 = PN.f26764H0;
                                    int i31 = c3566mO4.f31960n;
                                    g62.k();
                                    break;
                            }
                        }
                    });
                }
                if (c3566mO2.i() != c3566mO.i()) {
                    this.f26776G.c(7, new LN(c3566mO, i17, (byte) 0));
                }
                if (!c3566mO2.f31961o.equals(c3566mO.f31961o)) {
                    final int i30 = 2;
                    this.f26776G.c(12, new InterfaceC3529lo() { // from class: com.google.android.gms.internal.ads.IN
                        @Override // com.google.android.gms.internal.ads.InterfaceC3529lo
                        /* renamed from: a */
                        public final /* synthetic */ void mo1a(Object obj102) {
                            C3566mO c3566mO4 = c3566mO;
                            G6 g62 = (G6) obj102;
                            switch (i30) {
                                case 0:
                                    int i272 = PN.f26764H0;
                                    g62.e0(c3566mO4.f31953f);
                                    break;
                                case 1:
                                    int i282 = PN.f26764H0;
                                    g62.a0(c3566mO4.f31952e);
                                    break;
                                case 2:
                                    int i292 = PN.f26764H0;
                                    C3924t5 c3924t5 = c3566mO4.f31961o;
                                    g62.r();
                                    break;
                                default:
                                    int i302 = PN.f26764H0;
                                    g62.d0(c3566mO4.f31953f);
                                    break;
                            }
                        }
                    });
                }
                c3172f6 = this.f26797p0;
                C4051vO c4051vO = this.f26811z;
                C3172f6 c3172f63 = this.f26805w;
                String str3 = AbstractC3159eu.f29993a;
                boolean W12 = c4051vO.W1();
                AbstractC3604n8 F17 = c4051vO.F1();
                boolean z22 = F17.g() && F17.b(c4051vO.J1(), (U7) c4051vO.f26598n, 0L).f27898f;
                F13 = c4051vO.F1();
                if (F13.g()) {
                    int J13 = c4051vO.J1();
                    c4051vO.l();
                    c4051vO.C1();
                    int i31 = F13.i(J13);
                    i18 = -1;
                    z15 = i31 != -1;
                } else {
                    z15 = false;
                    i18 = -1;
                }
                F14 = c4051vO.F1();
                if (F14.g()) {
                    int J14 = c4051vO.J1();
                    c4051vO.l();
                    c4051vO.C1();
                    z16 = false;
                    z17 = F14.h(J14, 0, false) != i18;
                } else {
                    z16 = false;
                    z17 = false;
                }
                F15 = c4051vO.F1();
                if (F15.g()) {
                    z18 = z22;
                    if (F15.b(c4051vO.J1(), (U7) c4051vO.f26598n, 0L).b()) {
                        z19 = true;
                        F16 = c4051vO.F1();
                        if (F16.g()) {
                            z20 = z19;
                        } else {
                            z20 = z19;
                            if (F16.b(c4051vO.J1(), (U7) c4051vO.f26598n, 0L).f27899g) {
                                z21 = true;
                                boolean g4 = c4051vO.F1().g();
                                j52 = new J5();
                                xo = c3172f63.f30049a;
                                r12 = z16;
                                while (true) {
                                    r10 = xo.f28523a;
                                    if (r12 < r10.size()) {
                                        break;
                                    }
                                    AbstractC2772Sd.K(r12, r10.size());
                                    j52.f25648a.t(r10.keyAt(r12));
                                    r12++;
                                }
                                boolean z23 = !W12;
                                j52.a(4, z23);
                                j52.a(5, (z18 || W12) ? z16 : true);
                                j52.a(6, (z15 || W12) ? z16 : true);
                                j52.a(7, (!g4 || !(z15 || !z20 || z18) || W12) ? z16 : true);
                                j52.a(8, (z17 || W12) ? z16 : true);
                                j52.a(9, (!g4 || !(z17 || (z20 && z21)) || W12) ? z16 : true);
                                j52.a(10, z23);
                                j52.a(11, (z18 || W12) ? z16 : true);
                                j52.a(12, (z18 || W12) ? z16 : true);
                                c3172f62 = new C3172f6(j52.f25648a.u());
                                this.f26797p0 = c3172f62;
                                if (!c3172f62.equals(c3172f6)) {
                                    this.f26776G.c(13, new C4019ut(10, this));
                                }
                                this.f26776G.d();
                            }
                        }
                        z21 = z16;
                        boolean g42 = c4051vO.F1().g();
                        j52 = new J5();
                        xo = c3172f63.f30049a;
                        r12 = z16;
                        while (true) {
                            r10 = xo.f28523a;
                            if (r12 < r10.size()) {
                            }
                            AbstractC2772Sd.K(r12, r10.size());
                            j52.f25648a.t(r10.keyAt(r12));
                            r12++;
                        }
                        boolean z232 = !W12;
                        j52.a(4, z232);
                        j52.a(5, (z18 || W12) ? z16 : true);
                        j52.a(6, (z15 || W12) ? z16 : true);
                        j52.a(7, (!g42 || !(z15 || !z20 || z18) || W12) ? z16 : true);
                        j52.a(8, (z17 || W12) ? z16 : true);
                        j52.a(9, (!g42 || !(z17 || (z20 && z21)) || W12) ? z16 : true);
                        j52.a(10, z232);
                        j52.a(11, (z18 || W12) ? z16 : true);
                        j52.a(12, (z18 || W12) ? z16 : true);
                        c3172f62 = new C3172f6(j52.f25648a.u());
                        this.f26797p0 = c3172f62;
                        if (!c3172f62.equals(c3172f6)) {
                        }
                        this.f26776G.d();
                    }
                } else {
                    z18 = z22;
                }
                z19 = z16;
                F16 = c4051vO.F1();
                if (F16.g()) {
                }
                z21 = z16;
                boolean g422 = c4051vO.F1().g();
                j52 = new J5();
                xo = c3172f63.f30049a;
                r12 = z16;
                while (true) {
                    r10 = xo.f28523a;
                    if (r12 < r10.size()) {
                    }
                    AbstractC2772Sd.K(r12, r10.size());
                    j52.f25648a.t(r10.keyAt(r12));
                    r12++;
                }
                boolean z2322 = !W12;
                j52.a(4, z2322);
                j52.a(5, (z18 || W12) ? z16 : true);
                j52.a(6, (z15 || W12) ? z16 : true);
                j52.a(7, (!g422 || !(z15 || !z20 || z18) || W12) ? z16 : true);
                j52.a(8, (z17 || W12) ? z16 : true);
                j52.a(9, (!g422 || !(z17 || (z20 && z21)) || W12) ? z16 : true);
                j52.a(10, z2322);
                j52.a(11, (z18 || W12) ? z16 : true);
                j52.a(12, (z18 || W12) ? z16 : true);
                c3172f62 = new C3172f6(j52.f25648a.u());
                this.f26797p0 = c3172f62;
                if (!c3172f62.equals(c3172f6)) {
                }
                this.f26776G.d();
            }
            pair = new Pair(Boolean.TRUE, 3);
        }
        i11 = i22;
        i10 = 0;
        z6 = z3;
        booleanValue = ((Boolean) pair.first).booleanValue();
        int intValue2 = ((Integer) pair.second).intValue();
        if (booleanValue) {
        }
        if (booleanValue) {
        }
        M2 a92 = this.C0.a();
        list = c3566mO.f31956j;
        i13 = i10;
        while (i13 < list.size()) {
        }
        z11 = z6;
        this.C0 = new C3062d3(a92);
        F12 = F1();
        if (F12.g()) {
        }
        boolean equals22 = c3062d3.equals(this.f26798q0);
        this.f26798q0 = c3062d3;
        if (c3566mO2.f31958l == c3566mO.f31958l) {
        }
        if (c3566mO2.f31952e == c3566mO.f31952e) {
        }
        if (i15 == 0) {
        }
        u12 = u1();
        r22 = this.f26787R;
        r14 = this.f26786Q;
        if (u12 != 2) {
        }
        P0();
        this.f26771D0.getClass();
        r14.g(A1());
        A12 = A1();
        if (r22.f27159u != A12) {
        }
        if (c3566mO2.f31954g == c3566mO.f31954g) {
        }
        if (!equals) {
        }
        if (z11) {
        }
        if (booleanValue) {
        }
        dn = c3566mO2.f31953f;
        dn2 = c3566mO.f31953f;
        if (dn != dn2) {
        }
        c3918t = c3566mO2.i;
        c3918t2 = c3566mO.i;
        if (c3918t != c3918t2) {
        }
        if (!z14) {
        }
        if (z13) {
        }
        if (i16 == 0) {
        }
        this.f26776G.c(-1, new LN(c3566mO, b9, b9));
        if (i16 != 0) {
        }
        if (i14 == 0) {
        }
        i17 = 1;
        this.f26776G.c(5, new InterfaceC3529lo() { // from class: com.google.android.gms.internal.ads.JN
            @Override // com.google.android.gms.internal.ads.InterfaceC3529lo
            /* renamed from: a */
            public final /* synthetic */ void mo1a(Object obj11) {
                C3566mO c3566mO4 = c3566mO;
                G6 g62 = (G6) obj11;
                switch (i17) {
                    case 0:
                        int i292 = PN.f26764H0;
                        Object obj12 = c3566mO4.i.f34180w;
                        g62.o();
                        break;
                    default:
                        int i302 = PN.f26764H0;
                        boolean z222 = c3566mO4.f31958l;
                        g62.j();
                        break;
                }
            }
        });
        if (c3566mO2.f31960n != c3566mO.f31960n) {
        }
        if (c3566mO2.i() != c3566mO.i()) {
        }
        if (!c3566mO2.f31961o.equals(c3566mO.f31961o)) {
        }
        c3172f6 = this.f26797p0;
        C4051vO c4051vO2 = this.f26811z;
        C3172f6 c3172f632 = this.f26805w;
        String str32 = AbstractC3159eu.f29993a;
        boolean W122 = c4051vO2.W1();
        AbstractC3604n8 F172 = c4051vO2.F1();
        if (F172.g()) {
        }
        F13 = c4051vO2.F1();
        if (F13.g()) {
        }
        F14 = c4051vO2.F1();
        if (F14.g()) {
        }
        F15 = c4051vO2.F1();
        if (F15.g()) {
        }
        z19 = z16;
        F16 = c4051vO2.F1();
        if (F16.g()) {
        }
        z21 = z16;
        boolean g4222 = c4051vO2.F1().g();
        j52 = new J5();
        xo = c3172f632.f30049a;
        r12 = z16;
        while (true) {
            r10 = xo.f28523a;
            if (r12 < r10.size()) {
            }
            AbstractC2772Sd.K(r12, r10.size());
            j52.f25648a.t(r10.keyAt(r12));
            r12++;
        }
        boolean z23222 = !W122;
        j52.a(4, z23222);
        j52.a(5, (z18 || W122) ? z16 : true);
        j52.a(6, (z15 || W122) ? z16 : true);
        j52.a(7, (!g4222 || !(z15 || !z20 || z18) || W122) ? z16 : true);
        j52.a(8, (z17 || W122) ? z16 : true);
        j52.a(9, (!g4222 || !(z17 || (z20 && z21)) || W122) ? z16 : true);
        j52.a(10, z23222);
        j52.a(11, (z18 || W122) ? z16 : true);
        j52.a(12, (z18 || W122) ? z16 : true);
        c3172f62 = new C3172f6(j52.f25648a.u());
        this.f26797p0 = c3172f62;
        if (!c3172f62.equals(c3172f6)) {
        }
        this.f26776G.d();
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void c0(int i, long j6) {
        P0();
        if (i == -1) {
            return;
        }
        AbstractC2772Sd.i(i >= 0);
        AbstractC3604n8 abstractC3604n8 = this.f26771D0.f31948a;
        if (abstractC3604n8.g() || i < abstractC3604n8.a()) {
            BO bo = this.f26780K;
            if (!bo.i) {
                C4159xO t6 = bo.t();
                bo.i = true;
                bo.s(t6, -1, new XJ((byte) 0, 28));
            }
            this.Y++;
            if (p2()) {
                AbstractC2968bG.y("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                C4085w4 c4085w4 = new C4085w4(this.f26771D0);
                c4085w4.f(1);
                PN pn = (PN) this.f26772E.f31863u;
                pn.getClass();
                pn.f26770D.e(new RunnableC3048cq(21, pn, c4085w4));
                return;
            }
            C3566mO c3566mO = this.f26771D0;
            int i6 = c3566mO.f31952e;
            if (i6 == 3 || (i6 == 4 && !abstractC3604n8.g())) {
                c3566mO = this.f26771D0.d(2);
            }
            int J12 = J1();
            C3566mO c22 = c2(c3566mO, abstractC3604n8, e2(abstractC3604n8, i, j6));
            long u3 = AbstractC3159eu.u(j6);
            VN vn = this.f26774F;
            vn.getClass();
            vn.f28189z.b(3, new UN(abstractC3604n8, i, u3)).a();
            a2(c22, 0, true, 1, Z1(c22), J12);
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
    public final C3566mO c2(C3566mO c3566mO, AbstractC3604n8 abstractC3604n8, Pair pair) {
        boolean z3;
        List list;
        AbstractC2772Sd.i(abstractC3604n8.g() || pair != null);
        AbstractC3604n8 abstractC3604n82 = c3566mO.f31948a;
        long Y12 = Y1(c3566mO);
        C3566mO c9 = c3566mO.c(abstractC3604n8);
        if (abstractC3604n8.g()) {
            C3676oQ c3676oQ = C3566mO.f31947t;
            long u3 = AbstractC3159eu.u(this.f26775F0);
            C3566mO g4 = c9.b(c3676oQ, u3, u3, u3, 0L, PQ.f26818d, this.f26803v, C3500lC.f31745x).g(c3676oQ);
            g4.f31962p = g4.f31964r;
            return g4;
        }
        C3676oQ c3676oQ2 = c9.f31949b;
        Object obj = c3676oQ2.f32905a;
        String str = AbstractC3159eu.f29993a;
        boolean equals = obj.equals(pair.first);
        C3676oQ c3676oQ3 = !equals ? new C3676oQ(-1L, pair.first) : c3676oQ2;
        long longValue = ((Long) pair.second).longValue();
        long u6 = AbstractC3159eu.u(Y12);
        if (!abstractC3604n82.g()) {
            K7 k72 = this.f26778H;
            abstractC3604n82.o(obj, k72);
            if (equals && u6 - longValue == 1) {
                K7 o6 = abstractC3604n82.o(obj, k72);
                z3 = true;
                if (u6 == o6.f25868d) {
                    u6--;
                }
                if (equals || longValue < u6) {
                    AbstractC2772Sd.H(c3676oQ3.b() ^ z3);
                    PQ pq = equals ? PQ.f26818d : c9.f31955h;
                    C3918t c3918t = equals ? this.f26803v : c9.i;
                    if (equals) {
                        PB pb = RB.f27177u;
                        list = C3500lC.f31745x;
                    } else {
                        list = c9.f31956j;
                    }
                    C3676oQ c3676oQ4 = c3676oQ3;
                    C3566mO g9 = c9.b(c3676oQ4, longValue, longValue, longValue, 0L, pq, c3918t, list).g(c3676oQ4);
                    g9.f31962p = longValue;
                    return g9;
                }
                if (longValue != u6) {
                    AbstractC2772Sd.H(c3676oQ3.b() ^ z3);
                    long max = Math.max(0L, c9.f31963q - (longValue - u6));
                    long j6 = c9.f31962p;
                    if (c9.f31957k.equals(c3676oQ2)) {
                        j6 = longValue + max;
                    }
                    C3566mO b9 = c9.b(c3676oQ3, longValue, longValue, longValue, max, c9.f31955h, c9.i, c9.f31956j);
                    b9.f31962p = j6;
                    return b9;
                }
                int e9 = abstractC3604n8.e(c9.f31957k.f32905a);
                if (e9 != -1) {
                    K7 k73 = this.f26778H;
                    if (abstractC3604n8.d(e9, k73, false).f25867c == abstractC3604n8.o(c3676oQ3.f32905a, k73).f25867c) {
                        return c9;
                    }
                }
                Object obj2 = c3676oQ3.f32905a;
                K7 k74 = this.f26778H;
                abstractC3604n8.o(obj2, k74);
                long b10 = c3676oQ3.b() ? k74.b(c3676oQ3.f32906b, c3676oQ3.f32907c) : k74.f25868d;
                C3676oQ c3676oQ5 = c3676oQ3;
                C3566mO g10 = c9.b(c3676oQ5, c9.f31964r, c9.f31964r, c9.f31951d, b10 - c9.f31964r, c9.f31955h, c9.i, c9.f31956j).g(c3676oQ5);
                g10.f31962p = b10;
                return g10;
            }
        }
        z3 = true;
        if (equals) {
        }
        AbstractC2772Sd.H(c3676oQ3.b() ^ z3);
        PQ pq2 = equals ? PQ.f26818d : c9.f31955h;
        C3918t c3918t2 = equals ? this.f26803v : c9.i;
        if (equals) {
        }
        C3676oQ c3676oQ42 = c3676oQ3;
        C3566mO g92 = c9.b(c3676oQ42, longValue, longValue, longValue, 0L, pq2, c3918t2, list).g(c3676oQ42);
        g92.f31962p = longValue;
        return g92;
    }

    public final Pair e2(AbstractC3604n8 abstractC3604n8, int i, long j6) {
        if (abstractC3604n8.g()) {
            this.f26773E0 = i;
            if (j6 == com.anythink.basead.exoplayer.b.f6382b) {
                j6 = 0;
            }
            this.f26775F0 = j6;
            return null;
        }
        if (i == -1 || i >= abstractC3604n8.a()) {
            i = abstractC3604n8.k(false);
            abstractC3604n8.b(i, (U7) this.f26598n, 0L).getClass();
            j6 = AbstractC3159eu.t(0L);
        }
        return abstractC3604n8.m((U7) this.f26598n, this.f26778H, i, AbstractC3159eu.u(j6));
    }

    public final void f2(Surface surface) {
        Surface surface2 = this.f26799r0;
        boolean z3 = false;
        boolean z6 = true;
        if (surface2 != null && surface2 != surface) {
            z3 = true;
        }
        long j6 = z3 ? this.f26788S : -9223372036854775807L;
        VN vn = this.f26774F;
        if (!vn.f28173o0 && vn.f28140B.getThread().isAlive()) {
            C2781Sm c2781Sm = new C2781Sm();
            vn.f28189z.b(30, new Pair(surface, c2781Sm)).a();
            if (j6 != com.anythink.basead.exoplayer.b.f6382b) {
                z6 = c2781Sm.c(j6);
            }
        }
        if (z3) {
            Surface surface3 = this.f26799r0;
            Surface surface4 = this.f26800s0;
            if (surface3 == surface4) {
                surface4.release();
                this.f26800s0 = null;
            }
        }
        this.f26799r0 = surface;
        if (z6) {
            return;
        }
        W1(new DN(2, new B0.c("Detaching surface timed out."), 1003));
    }

    public final void g2(int i, int i6) {
        Nr nr = this.f26802u0;
        if (i == nr.f26558a && i6 == nr.f26559b) {
            return;
        }
        this.f26802u0 = new Nr(i, i6);
        XJ xj = new XJ(i, i6);
        C3530lp c3530lp = this.f26776G;
        c3530lp.c(24, xj);
        c3530lp.d();
        h2(2, 14, new Nr(i, i6));
    }

    public final void h2(int i, int i6, Object obj) {
        VN vn;
        RP[] rpArr = this.f26765A;
        int length = rpArr.length;
        int i9 = 0;
        while (true) {
            vn = this.f26774F;
            if (i9 >= 2) {
                break;
            }
            RP rp = rpArr[i9];
            if (i == -1 || rp.f27272u == i) {
                X1(this.f26771D0);
                AbstractC3604n8 abstractC3604n8 = this.f26771D0.f31948a;
                C3728pO c3728pO = new C3728pO(vn, rp, vn.f28140B);
                AbstractC2772Sd.H(!c3728pO.f33069f);
                c3728pO.f33066c = i6;
                AbstractC2772Sd.H(!c3728pO.f33069f);
                c3728pO.f33067d = obj;
                c3728pO.a();
            }
            i9++;
        }
        RP[] rpArr2 = this.f26767B;
        int length2 = rpArr2.length;
        for (int i10 = 0; i10 < 2; i10++) {
            RP rp2 = rpArr2[i10];
            if (rp2 != null && (i == -1 || rp2.f27272u == i)) {
                X1(this.f26771D0);
                AbstractC3604n8 abstractC3604n82 = this.f26771D0.f31948a;
                C3728pO c3728pO2 = new C3728pO(vn, rp2, vn.f28140B);
                AbstractC2772Sd.H(!c3728pO2.f33069f);
                c3728pO2.f33066c = i6;
                AbstractC2772Sd.H(!c3728pO2.f33069f);
                c3728pO2.f33067d = obj;
                c3728pO2.a();
            }
        }
    }

    public final void i2(boolean z3) {
        P0();
        C3566mO c3566mO = this.f26771D0;
        int i = c3566mO.f31960n;
        int i6 = 0;
        if (i == 1) {
            if (z3) {
                i = 1;
            } else {
                i = 1;
                i6 = 1;
            }
        }
        if (c3566mO.f31958l == z3 && i == i6 && c3566mO.f31959m == 1) {
            return;
        }
        this.Y++;
        C3566mO h9 = c3566mO.h(1, i6, z3);
        C3212ft c3212ft = this.f26774F.f28189z;
        int i9 = (i6 << 4) | 1;
        c3212ft.getClass();
        C3104dt g4 = C3212ft.g();
        g4.f29857a = c3212ft.f30468a.obtainMessage(1, z3 ? 1 : 0, i9);
        g4.a();
        a2(h9, 0, false, 5, com.anythink.basead.exoplayer.b.f6382b, -1);
    }

    public final void j2() {
        P0();
        W1(null);
        C3500lC c3500lC = C3500lC.f31745x;
        long j6 = this.f26771D0.f31964r;
        new C2761Rj(c3500lC);
    }

    public final int k2() {
        P0();
        if (!this.f26771D0.f31948a.g()) {
            C3566mO c3566mO = this.f26771D0;
            return c3566mO.f31948a.e(c3566mO.f31949b.f32905a);
        }
        int i = this.f26773E0;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void l() {
        P0();
    }

    public final long l2() {
        P0();
        if (!p2()) {
            AbstractC3604n8 F12 = F1();
            return F12.g() ? com.anythink.basead.exoplayer.b.f6382b : AbstractC3159eu.t(F12.b(J1(), (U7) this.f26598n, 0L).f27901j);
        }
        C3566mO c3566mO = this.f26771D0;
        C3676oQ c3676oQ = c3566mO.f31949b;
        Object obj = c3676oQ.f32905a;
        AbstractC3604n8 abstractC3604n8 = c3566mO.f31948a;
        K7 k72 = this.f26778H;
        abstractC3604n8.o(obj, k72);
        return AbstractC3159eu.t(k72.b(c3676oQ.f32906b, c3676oQ.f32907c));
    }

    public final long m2() {
        P0();
        return AbstractC3159eu.t(Z1(this.f26771D0));
    }

    public final long n2() {
        P0();
        if (p2()) {
            C3566mO c3566mO = this.f26771D0;
            return c3566mO.f31957k.equals(c3566mO.f31949b) ? AbstractC3159eu.t(this.f26771D0.f31962p) : l2();
        }
        P0();
        if (this.f26771D0.f31948a.g()) {
            return this.f26775F0;
        }
        C3566mO c3566mO2 = this.f26771D0;
        long j6 = 0;
        if (c3566mO2.f31957k.f32908d != c3566mO2.f31949b.f32908d) {
            return AbstractC3159eu.t(c3566mO2.f31948a.b(J1(), (U7) this.f26598n, 0L).f27901j);
        }
        long j9 = c3566mO2.f31962p;
        if (this.f26771D0.f31957k.b()) {
            C3566mO c3566mO3 = this.f26771D0;
            c3566mO3.f31948a.o(c3566mO3.f31957k.f32905a, this.f26778H).f25870f.a(this.f26771D0.f31957k.f32906b).getClass();
        } else {
            j6 = j9;
        }
        C3566mO c3566mO4 = this.f26771D0;
        c3566mO4.f31948a.o(c3566mO4.f31957k.f32905a, this.f26778H);
        return AbstractC3159eu.t(j6);
    }

    public final long o2() {
        P0();
        return AbstractC3159eu.t(this.f26771D0.f31963q);
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final int p0() {
        P0();
        if (p2()) {
            return this.f26771D0.f31949b.f32906b;
        }
        return -1;
    }

    public final boolean p2() {
        P0();
        return this.f26771D0.f31949b.b();
    }

    public final int q2() {
        P0();
        if (p2()) {
            return this.f26771D0.f31949b.f32907c;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final int u1() {
        P0();
        return this.f26771D0.f31952e;
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final int w1() {
        P0();
        return this.f26771D0.f31960n;
    }
}

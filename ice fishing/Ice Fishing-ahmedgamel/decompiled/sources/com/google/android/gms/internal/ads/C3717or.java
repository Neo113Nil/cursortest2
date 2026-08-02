package com.google.android.gms.internal.ads;

import R2.InterfaceC0377c;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m2.C4741a;
import r2.C4906k;
import r2.InterfaceC4899d;
import r2.InterfaceC4903h;
import z2.InterfaceC5226c;

/* renamed from: com.google.android.gms.internal.ads.or, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3717or implements InterfaceC3456k, InterfaceC3891s3, InterfaceC0377c, InterfaceC2745Ph, InterfaceC3544lg, InterfaceC3598mg, InterfaceC5226c, KD, InterfaceC3765pl, InterfaceC4903h, InterfaceC2498Ap, InterfaceC4899d, Ir, At {

    /* renamed from: v, reason: collision with root package name */
    public static final Object f33737v = new Object();

    /* renamed from: w, reason: collision with root package name */
    public static C3717or f33738w;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f33739n;

    /* renamed from: u, reason: collision with root package name */
    public Object f33740u;

    public /* synthetic */ C3717or(int i, Object obj) {
        this.f33739n = i;
        this.f33740u = obj;
    }

    public void A(J0 j02) {
        long[] jArr = j02.f26389e;
        if (jArr.length > 0) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f33740u;
            if (linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
                return;
            }
            linkedHashMap.put(Long.valueOf(jArr[0]), j02);
        }
    }

    public P3.a B(S0.e eVar, InterfaceC4312zt interfaceC4312zt, InterfaceC3656nk interfaceC3656nk) {
        C3438ji k9 = interfaceC4312zt.k((InterfaceC4258yt) eVar.f2909v);
        Bt bt = new Bt();
        switch (k9.f32084a) {
            case 0:
                k9.f32086c = bt;
                break;
            default:
                k9.f32086c = bt;
                break;
        }
        InterfaceC3656nk interfaceC3656nk2 = (InterfaceC3656nk) k9.c();
        this.f33740u = interfaceC3656nk2;
        C2730Oj c9 = interfaceC3656nk2.c();
        C4043uu c4043uu = new C4043uu();
        ID s9 = ID.s(c9.b());
        E2.r rVar = new E2.r(13, c4043uu, c9);
        GD gd = GD.f25742n;
        return QC.u(QC.t(s9, rVar, gd), new C2742Pe(7, c4043uu), gd);
    }

    public J0 D() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (J0 j02 : ((LinkedHashMap) this.f33740u).values()) {
            arrayList.add(j02.f26386b);
            arrayList2.add(j02.f26387c);
            arrayList3.add(j02.f26388d);
            arrayList4.add(j02.f26389e);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
        long j6 = 0;
        for (int[] iArr2 : iArr) {
            j6 += iArr2.length;
        }
        int i = (int) j6;
        AbstractC2792Sd.A(j6 == ((long) i), "the total number of elements (%s) in the arrays must fit in an int", j6);
        int[] iArr3 = new int[i];
        int i4 = 0;
        for (int[] iArr4 : iArr) {
            int length = iArr4.length;
            System.arraycopy(iArr4, 0, iArr3, i4, length);
            i4 += length;
        }
        return new J0(iArr3, C2944aN.g((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), C2944aN.g((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), C2944aN.g((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }

    public T5 E() {
        return (T5) Optional.ofNullable((T5) ((ArrayDeque) this.f33740u).peek()).orElseThrow(S5.f28127u);
    }

    public void F(RemoteException remoteException) {
        ((C3504ku) this.f33740u).A();
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.If)).booleanValue()) {
            C4906k.f40186C.f40196h.d("Preconnect Remote", remoteException);
        }
    }

    public String G(Context context) {
        String num;
        C3955tD c3955tD;
        Yx yx = (Yx) this.f33740u;
        InterfaceC3832qy interfaceC3832qy = yx.f29549e;
        boolean z6 = yx.f29553j;
        long j6 = yx.i;
        boolean z9 = false;
        if (z6 && System.currentTimeMillis() - j6 <= yx.f29554k) {
            z9 = true;
        }
        C4006uA c4006uA = yx.f29548d;
        C3952tA a9 = c4006uA.a(3);
        try {
            try {
                try {
                    try {
                        a9.a();
                        By by = yx.f29545a;
                        synchronized (by) {
                            c3955tD = by.f24757e;
                            if (c3955tD == null) {
                                throw null;
                            }
                        }
                        num = (String) QC.t(c3955tD, new E2.r(15, yx, context), GD.f25742n).get(z9 ? yx.f29552h : yx.f29550f, TimeUnit.MILLISECONDS);
                    } catch (ExecutionException e9) {
                        e = e9;
                        Throwable cause = e.getCause();
                        if (cause != null) {
                            e = cause;
                        }
                        a9.b(e);
                        num = Integer.toString(3);
                    }
                } catch (Throwable th) {
                    a9.b(th);
                    throw th;
                }
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                a9.b(e10);
                num = "";
            } catch (TimeoutException unused) {
                if (z9) {
                    num = ((C3886rz) yx.f29551g.f()).a(j6);
                } else {
                    c4006uA.b(56);
                    num = Integer.toString(17);
                }
            }
            a9.c();
            interfaceC3832qy.f();
            return num;
        } catch (Throwable th2) {
            a9.c();
            interfaceC3832qy.f();
            throw th2;
        }
    }

    public String I(Context context, String str, View view) {
        String num;
        C3955tD c3955tD;
        Yx yx = (Yx) this.f33740u;
        InterfaceC3832qy interfaceC3832qy = yx.f29549e;
        C4006uA c4006uA = yx.f29548d;
        C3952tA a9 = c4006uA.a(5);
        try {
            try {
                try {
                    a9.a();
                    By by = yx.f29545a;
                    synchronized (by) {
                        c3955tD = by.f24757e;
                        if (c3955tD == null) {
                            throw null;
                        }
                    }
                    num = (String) QC.t(c3955tD, new C3219fd((Object) yx, (Object) context, str, (Object) view, 7), GD.f25742n).get(yx.f29550f, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e9) {
                    Thread.currentThread().interrupt();
                    a9.b(e9);
                    num = "";
                } catch (Throwable th) {
                    a9.b(th);
                    throw th;
                }
            } catch (ExecutionException e10) {
                Throwable th2 = e10;
                Throwable cause = th2.getCause();
                if (cause != null) {
                    th2 = cause;
                }
                a9.b(th2);
                num = Integer.toString(3);
            } catch (TimeoutException unused) {
                c4006uA.b(58);
                num = Integer.toString(17);
            }
            a9.c();
            interfaceC3832qy.f();
            return num;
        } catch (Throwable th3) {
            a9.c();
            interfaceC3832qy.f();
            throw th3;
        }
    }

    public void K(MotionEvent motionEvent) {
        Py py = ((Yx) this.f33740u).f29546b;
        Ly ly = (Ly) py.f27682f.get();
        if (ly == null) {
            py.f27681e.b(54);
        } else {
            ly.b(motionEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3598mg
    /* renamed from: a */
    public /* synthetic */ void mo6a(Object obj) {
        switch (this.f33739n) {
            case 13:
                ((C3490kg) this.f33740u).b((InterfaceC2890Yc) obj);
                break;
            case 17:
                InterfaceC2510Bk interfaceC2510Bk = (InterfaceC2510Bk) obj;
                String message = ((C2867Wl) this.f33740u).getMessage();
                if (message == null) {
                    message = "Internal show error.";
                }
                interfaceC2510Bk.c(SK.F(12, message, null));
                break;
            default:
                ((InterfaceC2816Tk) obj).b((s2.g1) this.f33740u);
                break;
        }
    }

    public void b(long j6, long j9, long j10) {
        int[] iArr = {1857962504, 67802545, 822753858, 1178641841, 1658857550, -1514359837, 393474692, 1520223205, 452867621};
        int i = iArr[0];
        int i4 = iArr[1];
        int i6 = iArr[2];
        int i9 = iArr[3];
        int i10 = iArr[4];
        int i11 = iArr[5];
        int i12 = iArr[6];
        int i13 = iArr[7];
        T5 t52 = new T5(j6, j9, j10);
        ArrayDeque arrayDeque = (ArrayDeque) this.f33740u;
        if (arrayDeque.size() >= (com.IceFishing.LiveIceFishing.k.f((i4 & (~i)) | i6, (i & i9) | i10, i11, i12) ^ (i13 % 452867621))) {
            throw new U5();
        }
        arrayDeque.push(t52);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2745Ph
    /* renamed from: c */
    public void mo7c() {
        switch (this.f33739n) {
            case 11:
                C2842Vc c2842Vc = (C2842Vc) this.f33740u;
                C4906k.f40186C.f40198k.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                long j6 = c2842Vc.f29005a;
                Long valueOf = Long.valueOf(currentTimeMillis - j6);
                ArrayList arrayList = (ArrayList) c2842Vc.f29007c;
                arrayList.add(valueOf);
                String valueOf2 = String.valueOf(arrayList.get(0));
                StringBuilder sb = new StringBuilder(valueOf2.length() + 52);
                sb.append("LoadNewJavascriptEngine(onEngLoaded) latency is ");
                sb.append(valueOf2);
                sb.append(" ms.");
                w2.z.k(sb.toString());
                w2.D.f41627l.postDelayed(new RunnableC2825Uc((g7.m) c2842Vc.f29006b, (C2874Xc) c2842Vc.f29008d, (C2740Pc) c2842Vc.f29009e, arrayList, j6, 1), ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33001d)).intValue());
                return;
            case 12:
                ((C2858Wc) this.f33740u).f29157x.t();
                return;
            case 25:
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Hf)).booleanValue()) {
                    S0.e a9 = ((C3230fo) ((C3504ku) this.f33740u).f32447w).a();
                    a9.M(NativeAdvancedJsUtils.f18693p, "ptard");
                    a9.M("ptard", com.anythink.expressad.foundation.d.d.bv);
                    a9.N();
                    return;
                }
                return;
            case 27:
                synchronized (((C4297ze) this.f33740u)) {
                }
                return;
            default:
                Ot ot = (Ot) this.f33740u;
                synchronized (ot) {
                    ot.f27453C = null;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2498Ap
    public P3.a d(C2759Qe c2759Qe) {
        C4038up c4038up = (C4038up) this.f33740u;
        synchronized (c4038up.f34933u) {
            try {
                int i = c4038up.f35354A;
                if (i != 1 && i != 2) {
                    return QC.k(new C4254yp(2));
                }
                if (c4038up.f34934v) {
                    return c4038up.f34932n;
                }
                c4038up.f35354A = 2;
                c4038up.f34934v = true;
                c4038up.f34936x = c2759Qe;
                c4038up.f34937y.o();
                C3490kg c3490kg = c4038up.f34932n;
                c3490kg.f32256n.a(new RunnableC3984tp(c4038up, 1), AbstractC3436jg.f32062h);
                return c3490kg;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // r2.InterfaceC4899d
    public void f() {
        ((C3925sk) ((C3762pi) this.f33740u).f33871E0.f()).onAdClicked();
    }

    @Override // z2.InterfaceC5226c
    public void h(C4741a c4741a) {
        try {
            ((InterfaceC2673Ld) this.f33740u).a(c4741a.a());
        } catch (RemoteException e9) {
            x2.i.d("", e9);
        }
    }

    @Override // r2.InterfaceC4899d
    public void i() {
        C3762pi c3762pi = (C3762pi) this.f33740u;
        ((C2527Ck) c3762pi.f33906z0.f()).t();
        C2596Gl c2596Gl = (C2596Gl) c3762pi.f33873G0.f();
        synchronized (c2596Gl) {
            c2596Gl.M1(C3495kl.f32384F);
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public void mo10n(Object obj) {
        switch (this.f33739n) {
            case 16:
                ((C2730Oj) this.f33740u).f27420f.w(true);
                return;
            case 20:
                try {
                    InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) ((List) obj).get(0);
                    if (interfaceC4084vh != null) {
                        C2767Qm c2767Qm = (C2767Qm) this.f33740u;
                        c2767Qm.getClass();
                        c2767Qm.f27851v.execute(new RunnableC4032uj(interfaceC4084vh, 3));
                        return;
                    }
                    return;
                } catch (ClassCastException | IndexOutOfBoundsException e9) {
                    if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33118p6)).booleanValue()) {
                        C4906k.f40186C.f40196h.d("omid native display exp", e9);
                        return;
                    }
                    return;
                }
            case 22:
                String str = (String) obj;
                synchronized (this) {
                    C2531Co c2531Co = (C2531Co) this.f33740u;
                    c2531Co.f24968c = true;
                    C4906k.f40186C.f40198k.getClass();
                    c2531Co.d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - c2531Co.f24969d), "", true);
                    c2531Co.i.execute(new RunnableC3996u0(26, this, str));
                }
                return;
            default:
                Yt yt = (Yt) obj;
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33019e7)).booleanValue()) {
                    C3607mp c3607mp = (C3607mp) this.f33740u;
                    Ut ut = (Ut) yt.f29533b.f25831v;
                    C2719Np c2719Np = c3607mp.f33366e;
                    int i = ut.f28805f;
                    synchronized (c2719Np.f27328g) {
                        c2719Np.f27323b = i;
                    }
                    C2719Np c2719Np2 = c3607mp.f33366e;
                    long j6 = ut.f28806g;
                    synchronized (c2719Np2.f27329h) {
                        c2719Np2.f27324c = j6;
                    }
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.At
    public /* synthetic */ Object o() {
        return (InterfaceC3656nk) this.f33740u;
    }

    @Override // R2.InterfaceC0377c
    public void onConnectionFailed(O2.b bVar) {
        T8 t82 = (T8) this.f33740u;
        synchronized (t82.f28480v) {
            t82.f28483y = null;
            if (((W8) t82.f28481w) != null) {
                t82.f28481w = null;
            }
            t82.f28480v.notifyAll();
        }
    }

    @Override // com.google.android.gms.internal.ads.Ir
    public void s(AbstractC2577Fj abstractC2577Fj) {
        switch (this.f33739n) {
            case 27:
                C4297ze c4297ze = (C4297ze) this.f33740u;
                synchronized (c4297ze) {
                    c4297ze.f36135w = abstractC2577Fj.f25627f;
                    abstractC2577Fj.a();
                }
                return;
            default:
                Ot ot = (Ot) this.f33740u;
                C2513Bn c2513Bn = (C2513Bn) abstractC2577Fj;
                synchronized (ot) {
                    try {
                        ot.f27453C = c2513Bn;
                        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33154t4)).booleanValue()) {
                            c2513Bn.f24723u.f29936a = ot.f27458x;
                        }
                        ot.f27453C.a();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3456k
    public C3523lC t(int i, A8 a82, int[] iArr) {
        PB pb = RB.f27933u;
        MA.q(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i4 = 0;
        int i6 = 0;
        while (i4 < a82.f24415a) {
            int i9 = i;
            A8 a83 = a82;
            C3188f c3188f = new C3188f(i9, a83, i4, (C3350i) this.f33740u, iArr[i4]);
            int length = objArr.length;
            int i10 = i6 + 1;
            int d9 = MB.d(length, i10);
            if (d9 > length) {
                objArr = Arrays.copyOf(objArr, d9);
            }
            objArr[i6] = c3188f;
            i4++;
            i6 = i10;
            i = i9;
            a82 = a83;
        }
        return RB.p(objArr, i6);
    }

    @Override // r2.InterfaceC4903h
    public void v() {
        ScheduledFuture scheduledFuture;
        ScheduledFuture scheduledFuture2;
        C2898Yk c2898Yk = ((C2649Jn) this.f33740u).f26497g;
        synchronized (c2898Yk) {
            try {
                if (c2898Yk.f29498C) {
                    if (c2898Yk.f29496A > 0 && (scheduledFuture2 = c2898Yk.f29499D) != null && scheduledFuture2.isCancelled()) {
                        c2898Yk.U1(c2898Yk.f29496A);
                    }
                    if (c2898Yk.f29497B > 0 && (scheduledFuture = c2898Yk.f29500E) != null && scheduledFuture.isCancelled()) {
                        c2898Yk.V1(c2898Yk.f29497B);
                    }
                    c2898Yk.f29498C = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
        switch (this.f33739n) {
            case 16:
                ((C2730Oj) this.f33740u).f27420f.w(false);
                return;
            case 20:
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33118p6)).booleanValue()) {
                    C4906k.f40186C.f40196h.d("omid native display exp", th);
                    return;
                }
                return;
            case 22:
                synchronized (this) {
                    C2531Co c2531Co = (C2531Co) this.f33740u;
                    c2531Co.f24968c = true;
                    C4906k.f40186C.f40198k.getClass();
                    c2531Co.d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - c2531Co.f24969d), "Internal Error.", false);
                    c2531Co.f24970e.c(new Exception());
                }
                return;
            default:
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33019e7)).booleanValue()) {
                    Matcher matcher = C3607mp.f33361h.matcher(th.getMessage());
                    if (matcher.matches()) {
                        int parseInt = Integer.parseInt(matcher.group(1));
                        C2719Np c2719Np = ((C3607mp) this.f33740u).f33366e;
                        synchronized (c2719Np.f27328g) {
                            c2719Np.f27323b = parseInt;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3891s3
    public void x(byte[] bArr, int i, int i4, Z1.b bVar) {
        C4302zj a9;
        Cr cr = (Cr) this.f33740u;
        cr.z(i + i4, bArr);
        cr.E(i);
        ArrayList arrayList = new ArrayList();
        while (cr.B() > 0) {
            AbstractC2792Sd.q("Incomplete Mp4Webvtt Top Level box header found.", cr.B() >= 8);
            int b9 = cr.b() - 8;
            if (cr.b() == 1987343459) {
                CharSequence charSequence = null;
                C3924sj c3924sj = null;
                while (b9 > 0) {
                    AbstractC2792Sd.q("Incomplete vtt cue box header found.", b9 >= 8);
                    int b10 = cr.b();
                    int b11 = cr.b();
                    int i6 = b9 - 8;
                    int i9 = b10 - 8;
                    byte[] bArr2 = cr.f24997a;
                    int i10 = cr.f24998b;
                    String str = AbstractC3182eu.f30782a;
                    String str2 = new String(bArr2, i10, i9, StandardCharsets.UTF_8);
                    cr.G(i9);
                    if (b11 == 1937011815) {
                        C2925a4 c2925a4 = new C2925a4();
                        AbstractC2979b4.c(str2, c2925a4);
                        c3924sj = c2925a4.a();
                    } else if (b11 == 1885436268) {
                        charSequence = AbstractC2979b4.a(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                    b9 = i6 - i9;
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (c3924sj != null) {
                    c3924sj.f34886a = charSequence;
                    c3924sj.f34887b = null;
                    a9 = c3924sj.a();
                } else {
                    Pattern pattern = AbstractC2979b4.f29993a;
                    C2925a4 c2925a42 = new C2925a4();
                    c2925a42.f29787c = charSequence;
                    a9 = c2925a42.a().a();
                }
                arrayList.add(a9);
            } else {
                cr.G(b9);
            }
        }
        bVar.mo9a(new C3676o3(arrayList, com.anythink.basead.exoplayer.b.f7168b, com.anythink.basead.exoplayer.b.f7168b));
    }

    @Override // com.google.android.gms.internal.ads.At
    public /* bridge */ /* synthetic */ P3.a y(S0.e eVar, InterfaceC4312zt interfaceC4312zt) {
        return B(eVar, interfaceC4312zt, null);
    }

    @Override // r2.InterfaceC4903h
    public void z() {
        C2898Yk c2898Yk = ((C2649Jn) this.f33740u).f26497g;
        synchronized (c2898Yk) {
            try {
                if (c2898Yk.f29498C) {
                    return;
                }
                ScheduledFuture scheduledFuture = c2898Yk.f29499D;
                if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                    c2898Yk.f29496A = -1L;
                } else {
                    c2898Yk.f29499D.cancel(false);
                    long j6 = c2898Yk.f29504y;
                    c2898Yk.f29502w.getClass();
                    c2898Yk.f29496A = j6 - SystemClock.elapsedRealtime();
                }
                ScheduledFuture scheduledFuture2 = c2898Yk.f29500E;
                if (scheduledFuture2 == null || scheduledFuture2.isCancelled()) {
                    c2898Yk.f29497B = -1L;
                } else {
                    c2898Yk.f29500E.cancel(false);
                    long j9 = c2898Yk.f29505z;
                    c2898Yk.f29502w.getClass();
                    c2898Yk.f29497B = j9 - SystemClock.elapsedRealtime();
                }
                c2898Yk.f29498C = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C3717or(C3332hi c3332hi) {
        this.f33739n = 15;
        this.f33740u = new C2729Oi(c3332hi.f31645g, c3332hi.f31636b0, new C4031ui(22, c3332hi.f31638c0), c3332hi.f31640d0, c3332hi.f31590A, c3332hi.f31681z, 4);
    }

    public C3717or(int i) {
        this.f33739n = i;
        switch (i) {
            case 5:
                this.f33740u = new Cr();
                break;
            case 7:
                this.f33740u = new ArrayDeque();
                break;
            case 28:
                break;
            default:
                this.f33740u = new LinkedHashMap();
                break;
        }
    }

    public C3717or(Context context, Executor executor) {
        this.f33739n = 8;
        this.f33740u = QC.o(new CallableC3572m7(0, context), executor);
    }

    public C3717or(T8 t82) {
        this.f33739n = 9;
        Objects.requireNonNull(t82);
        this.f33740u = t82;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        ((java.util.ArrayList) r4.f33740u).add(new com.google.android.gms.internal.ads.C3916sb(r3));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3717or(InterfaceC3647nb interfaceC3647nb) {
        IBinder iBinder;
        this.f33739n = 10;
        this.f33740u = new ArrayList();
        try {
            interfaceC3647nb.c();
        } catch (RemoteException e9) {
            x2.i.d("", e9);
        }
        try {
            for (Object obj : interfaceC3647nb.f()) {
                InterfaceC3862rb interfaceC3862rb = null;
                if ((obj instanceof IBinder) && (iBinder = (IBinder) obj) != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    interfaceC3862rb = queryLocalInterface instanceof InterfaceC3862rb ? (InterfaceC3862rb) queryLocalInterface : new C3809qb(iBinder);
                }
            }
        } catch (RemoteException e10) {
            x2.i.d("", e10);
        }
    }

    public C3717or(C2858Wc c2858Wc) {
        this.f33739n = 12;
        Objects.requireNonNull(c2858Wc);
        this.f33740u = c2858Wc;
    }

    public C3717or(BinderC2809Td binderC2809Td, InterfaceC2673Ld interfaceC2673Ld) {
        this.f33739n = 14;
        this.f33740u = interfaceC2673Ld;
        Objects.requireNonNull(binderC2809Td);
    }

    public C3717or(C4297ze c4297ze) {
        this.f33739n = 27;
        Objects.requireNonNull(c4297ze);
        this.f33740u = c4297ze;
    }

    public C3717or(C2767Qm c2767Qm) {
        this.f33739n = 20;
        Objects.requireNonNull(c2767Qm);
        this.f33740u = c2767Qm;
    }

    public C3717or(C2649Jn c2649Jn) {
        this.f33739n = 21;
        Objects.requireNonNull(c2649Jn);
        this.f33740u = c2649Jn;
    }

    public C3717or(C2531Co c2531Co) {
        this.f33739n = 22;
        Objects.requireNonNull(c2531Co);
        this.f33740u = c2531Co;
    }

    public C3717or(C3607mp c3607mp) {
        this.f33739n = 23;
        Objects.requireNonNull(c3607mp);
        this.f33740u = c3607mp;
    }

    public C3717or(C4201xq c4201xq, C3762pi c3762pi) {
        this.f33739n = 26;
        this.f33740u = c3762pi;
    }

    public C3717or(Ot ot) {
        this.f33739n = 29;
        Objects.requireNonNull(ot);
        this.f33740u = ot;
    }

    public C3717or(Context context, C2972ay c2972ay, RD rd) {
        this.f33739n = 1;
        context.getClass();
        rd.getClass();
        this.f33740u = (Yx) ((C3266gN) new C3819ql(context, c2972ay, rd).f34171m).f();
    }

    @Override // r2.InterfaceC4899d
    public void e(View view) {
    }
}

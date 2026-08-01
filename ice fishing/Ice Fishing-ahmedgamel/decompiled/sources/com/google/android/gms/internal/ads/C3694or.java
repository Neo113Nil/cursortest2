package com.google.android.gms.internal.ads;

import P2.InterfaceC0373c;
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
import k2.C4631a;
import p2.C4835j;
import p2.InterfaceC4829d;
import p2.InterfaceC4832g;
import x2.InterfaceC5189c;

/* renamed from: com.google.android.gms.internal.ads.or, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3694or implements InterfaceC3433k, InterfaceC3868s3, InterfaceC0373c, InterfaceC2725Ph, InterfaceC3521lg, InterfaceC3575mg, InterfaceC5189c, KD, InterfaceC3742pl, InterfaceC4832g, InterfaceC2478Ap, InterfaceC4829d, Ir, At {

    /* renamed from: v, reason: collision with root package name */
    public static final Object f32951v = new Object();

    /* renamed from: w, reason: collision with root package name */
    public static C3694or f32952w;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f32953n;

    /* renamed from: u, reason: collision with root package name */
    public Object f32954u;

    public /* synthetic */ C3694or(int i, Object obj) {
        this.f32953n = i;
        this.f32954u = obj;
    }

    public void A(J0 j02) {
        long[] jArr = j02.f25636e;
        if (jArr.length > 0) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f32954u;
            if (linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
                return;
            }
            linkedHashMap.put(Long.valueOf(jArr[0]), j02);
        }
    }

    public N3.a B(S0.e eVar, InterfaceC4289zt interfaceC4289zt, InterfaceC3633nk interfaceC3633nk) {
        C3415ji k9 = interfaceC4289zt.k((InterfaceC4235yt) eVar.f2782v);
        Bt bt = new Bt();
        switch (k9.f31297a) {
            case 0:
                k9.f31299c = bt;
                break;
            default:
                k9.f31299c = bt;
                break;
        }
        InterfaceC3633nk interfaceC3633nk2 = (InterfaceC3633nk) k9.c();
        this.f32954u = interfaceC3633nk2;
        C2710Oj c9 = interfaceC3633nk2.c();
        C4020uu c4020uu = new C4020uu();
        ID s9 = ID.s(c9.b());
        C2.s sVar = new C2.s(13, c4020uu, c9);
        GD gd = GD.f24952n;
        return QC.u(QC.t(s9, sVar, gd), new C2722Pe(7, c4020uu), gd);
    }

    public J0 D() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (J0 j02 : ((LinkedHashMap) this.f32954u).values()) {
            arrayList.add(j02.f25633b);
            arrayList2.add(j02.f25634c);
            arrayList3.add(j02.f25635d);
            arrayList4.add(j02.f25636e);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
        long j6 = 0;
        for (int[] iArr2 : iArr) {
            j6 += iArr2.length;
        }
        int i = (int) j6;
        AbstractC2772Sd.A(j6 == ((long) i), "the total number of elements (%s) in the arrays must fit in an int", j6);
        int[] iArr3 = new int[i];
        int i6 = 0;
        for (int[] iArr4 : iArr) {
            int length = iArr4.length;
            System.arraycopy(iArr4, 0, iArr3, i6, length);
            i6 += length;
        }
        return new J0(iArr3, C2921aN.g((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), C2921aN.g((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), C2921aN.g((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }

    public T5 E() {
        return (T5) Optional.ofNullable((T5) ((ArrayDeque) this.f32954u).peek()).orElseThrow(S5.f27413u);
    }

    public void F(RemoteException remoteException) {
        ((C3481ku) this.f32954u).B();
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.If)).booleanValue()) {
            C4835j.f39733C.f39743h.d("Preconnect Remote", remoteException);
        }
    }

    public String G(Context context) {
        String num;
        C3932tD c3932tD;
        Yx yx = (Yx) this.f32954u;
        InterfaceC3809qy interfaceC3809qy = yx.f28769e;
        boolean z3 = yx.f28773j;
        long j6 = yx.i;
        boolean z6 = false;
        if (z3 && System.currentTimeMillis() - j6 <= yx.f28774k) {
            z6 = true;
        }
        C3983uA c3983uA = yx.f28768d;
        C3929tA a9 = c3983uA.a(3);
        try {
            try {
                try {
                    try {
                        a9.a();
                        By by = yx.f28765a;
                        synchronized (by) {
                            c3932tD = by.f23994e;
                            if (c3932tD == null) {
                                throw null;
                            }
                        }
                        num = (String) QC.t(c3932tD, new C2.s(15, yx, context), GD.f24952n).get(z6 ? yx.f28772h : yx.f28770f, TimeUnit.MILLISECONDS);
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
                if (z6) {
                    num = ((C3863rz) yx.f28771g.f()).a(j6);
                } else {
                    c3983uA.b(56);
                    num = Integer.toString(17);
                }
            }
            a9.c();
            interfaceC3809qy.f();
            return num;
        } catch (Throwable th2) {
            a9.c();
            interfaceC3809qy.f();
            throw th2;
        }
    }

    public String H(Context context, String str, View view) {
        String num;
        C3932tD c3932tD;
        Yx yx = (Yx) this.f32954u;
        InterfaceC3809qy interfaceC3809qy = yx.f28769e;
        C3983uA c3983uA = yx.f28768d;
        C3929tA a9 = c3983uA.a(5);
        try {
            try {
                try {
                    a9.a();
                    By by = yx.f28765a;
                    synchronized (by) {
                        c3932tD = by.f23994e;
                        if (c3932tD == null) {
                            throw null;
                        }
                    }
                    num = (String) QC.t(c3932tD, new C3196fd((Object) yx, (Object) context, str, (Object) view, 7), GD.f24952n).get(yx.f28770f, TimeUnit.MILLISECONDS);
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
                c3983uA.b(58);
                num = Integer.toString(17);
            }
            a9.c();
            interfaceC3809qy.f();
            return num;
        } catch (Throwable th3) {
            a9.c();
            interfaceC3809qy.f();
            throw th3;
        }
    }

    public void J(MotionEvent motionEvent) {
        Py py = ((Yx) this.f32954u).f28766b;
        Ly ly = (Ly) py.f26895f.get();
        if (ly == null) {
            py.f26894e.b(54);
        } else {
            ly.b(motionEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3575mg
    /* renamed from: a */
    public /* synthetic */ void mo7a(Object obj) {
        switch (this.f32953n) {
            case 13:
                ((C3467kg) this.f32954u).b((InterfaceC2867Yc) obj);
                break;
            case 17:
                InterfaceC2490Bk interfaceC2490Bk = (InterfaceC2490Bk) obj;
                String message = ((C2828Vl) this.f32954u).getMessage();
                if (message == null) {
                    message = "Internal show error.";
                }
                interfaceC2490Bk.b(SK.F(12, message, null));
                break;
            default:
                ((InterfaceC2795Tk) obj).a((q2.g1) this.f32954u);
                break;
        }
    }

    public void b(long j6, long j9, long j10) {
        int[] iArr = {1857962504, 67802545, 822753858, 1178641841, 1658857550, -1514359837, 393474692, 1520223205, 452867621};
        int i = iArr[0];
        int i6 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        int i12 = iArr[5];
        int i13 = iArr[6];
        int i14 = iArr[7];
        T5 t52 = new T5(j6, j9, j10);
        ArrayDeque arrayDeque = (ArrayDeque) this.f32954u;
        if (arrayDeque.size() >= (com.anythink.basead.exoplayer.f.f.g((i6 & (~i)) | i9, (i & i10) | i11, i12, i13) ^ (i14 % 452867621))) {
            throw new U5();
        }
        arrayDeque.push(t52);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2725Ph
    /* renamed from: c */
    public void mo8c() {
        switch (this.f32953n) {
            case 11:
                C2819Vc c2819Vc = (C2819Vc) this.f32954u;
                C4835j.f39733C.f39745k.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                long j6 = c2819Vc.f28208n;
                Long valueOf = Long.valueOf(currentTimeMillis - j6);
                ArrayList arrayList = (ArrayList) c2819Vc.f28210v;
                arrayList.add(valueOf);
                String valueOf2 = String.valueOf(arrayList.get(0));
                StringBuilder sb = new StringBuilder(valueOf2.length() + 52);
                sb.append("LoadNewJavascriptEngine(onEngLoaded) latency is ");
                sb.append(valueOf2);
                sb.append(" ms.");
                u2.z.k(sb.toString());
                u2.D.f41237l.postDelayed(new RunnableC2803Uc((g7.m) c2819Vc.f28209u, (C2851Xc) c2819Vc.f28211w, (C2720Pc) c2819Vc.f28212x, arrayList, j6, 1), ((Integer) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32222d)).intValue());
                return;
            case 12:
                ((C2835Wc) this.f32954u).f28358x.t();
                return;
            case 25:
                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.Hf)).booleanValue()) {
                    S0.e a9 = ((C3153eo) ((C3481ku) this.f32954u).f31665w).a();
                    a9.v(NativeAdvancedJsUtils.f17906p, "ptard");
                    a9.v("ptard", com.anythink.expressad.foundation.d.d.bv);
                    a9.y();
                    return;
                }
                return;
            case 27:
                synchronized (((C4274ze) this.f32954u)) {
                }
                return;
            default:
                Ot ot = (Ot) this.f32954u;
                synchronized (ot) {
                    ot.f26670C = null;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2478Ap
    public N3.a d(C2739Qe c2739Qe) {
        C4015up c4015up = (C4015up) this.f32954u;
        synchronized (c4015up.f34147u) {
            try {
                int i = c4015up.f34591A;
                if (i != 1 && i != 2) {
                    return QC.k(new C4231yp(2));
                }
                if (c4015up.f34148v) {
                    return c4015up.f34146n;
                }
                c4015up.f34591A = 2;
                c4015up.f34148v = true;
                c4015up.f34150x = c2739Qe;
                c4015up.f34151y.o();
                C3467kg c3467kg = c4015up.f34146n;
                c3467kg.f31479n.a(new RunnableC3961tp(c4015up, 1), AbstractC3413jg.f31275h);
                return c3467kg;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p2.InterfaceC4829d
    public void f() {
        ((C3902sk) ((C3739pi) this.f32954u).f33086J0.f()).onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3868s3
    public void h(byte[] bArr, int i, int i6, X1.b bVar) {
        C4279zj a9;
        Cr cr = (Cr) this.f32954u;
        cr.z(i + i6, bArr);
        cr.E(i);
        ArrayList arrayList = new ArrayList();
        while (cr.B() > 0) {
            AbstractC2772Sd.q("Incomplete Mp4Webvtt Top Level box header found.", cr.B() >= 8);
            int b9 = cr.b() - 8;
            if (cr.b() == 1987343459) {
                CharSequence charSequence = null;
                C3901sj c3901sj = null;
                while (b9 > 0) {
                    AbstractC2772Sd.q("Incomplete vtt cue box header found.", b9 >= 8);
                    int b10 = cr.b();
                    int b11 = cr.b();
                    int i9 = b9 - 8;
                    int i10 = b10 - 8;
                    byte[] bArr2 = cr.f24252a;
                    int i11 = cr.f24253b;
                    String str = AbstractC3159eu.f29993a;
                    String str2 = new String(bArr2, i11, i10, StandardCharsets.UTF_8);
                    cr.G(i10);
                    if (b11 == 1937011815) {
                        C2902a4 c2902a4 = new C2902a4();
                        AbstractC2956b4.c(str2, c2902a4);
                        c3901sj = c2902a4.a();
                    } else if (b11 == 1885436268) {
                        charSequence = AbstractC2956b4.a(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                    b9 = i9 - i10;
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (c3901sj != null) {
                    c3901sj.f34119a = charSequence;
                    c3901sj.f34120b = null;
                    a9 = c3901sj.a();
                } else {
                    Pattern pattern = AbstractC2956b4.f29205a;
                    C2902a4 c2902a42 = new C2902a4();
                    c2902a42.f29017c = charSequence;
                    a9 = c2902a42.a().a();
                }
                arrayList.add(a9);
            } else {
                cr.G(b9);
            }
        }
        bVar.mo10a(new C3653o3(arrayList, com.anythink.basead.exoplayer.b.f6382b, com.anythink.basead.exoplayer.b.f6382b));
    }

    @Override // p2.InterfaceC4829d
    public void i() {
        C3739pi c3739pi = (C3739pi) this.f32954u;
        ((C2507Ck) c3739pi.f33081E0.f()).t();
        C2559Fl c2559Fl = (C2559Fl) c3739pi.f33088L0.f();
        synchronized (c2559Fl) {
            c2559Fl.M1(C3472kl.f31607F);
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public void mo11n(Object obj) {
        switch (this.f32953n) {
            case 16:
                ((C2710Oj) this.f32954u).f26644f.x(true);
                return;
            case 20:
                try {
                    InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) ((List) obj).get(0);
                    if (interfaceC4061vh != null) {
                        C2730Pm c2730Pm = (C2730Pm) this.f32954u;
                        c2730Pm.getClass();
                        c2730Pm.f26858v.execute(new RunnableC4009uj(interfaceC4061vh, 3));
                        return;
                    }
                    return;
                } catch (ClassCastException | IndexOutOfBoundsException e9) {
                    if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32338p6)).booleanValue()) {
                        C4835j.f39733C.f39743h.d("omid native display exp", e9);
                        return;
                    }
                    return;
                }
            case 22:
                String str = (String) obj;
                synchronized (this) {
                    C2494Bo c2494Bo = (C2494Bo) this.f32954u;
                    c2494Bo.f23955c = true;
                    C4835j.f39733C.f39745k.getClass();
                    c2494Bo.d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - c2494Bo.f23956d), "", true);
                    c2494Bo.i.execute(new RunnableC3973u0(26, this, str));
                }
                return;
            default:
                Yt yt = (Yt) obj;
                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32239e7)).booleanValue()) {
                    C3584mp c3584mp = (C3584mp) this.f32954u;
                    Ut ut = (Ut) yt.f28754b.f25043v;
                    C2699Np c2699Np = c3584mp.f32588e;
                    int i = ut.f28008f;
                    synchronized (c2699Np.f26546g) {
                        c2699Np.f26541b = i;
                    }
                    C2699Np c2699Np2 = c3584mp.f32588e;
                    long j6 = ut.f28009g;
                    synchronized (c2699Np2.f26547h) {
                        c2699Np2.f26542c = j6;
                    }
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.At
    public /* synthetic */ Object o() {
        return (InterfaceC3633nk) this.f32954u;
    }

    @Override // P2.InterfaceC0373c
    public void onConnectionFailed(M2.b bVar) {
        T8 t82 = (T8) this.f32954u;
        synchronized (t82.f27697v) {
            t82.f27700y = null;
            if (((W8) t82.f27698w) != null) {
                t82.f27698w = null;
            }
            t82.f27697v.notifyAll();
        }
    }

    @Override // com.google.android.gms.internal.ads.Ir
    public void s(AbstractC2557Fj abstractC2557Fj) {
        switch (this.f32953n) {
            case 27:
                C4274ze c4274ze = (C4274ze) this.f32954u;
                synchronized (c4274ze) {
                    c4274ze.f35362w = abstractC2557Fj.f24838f;
                    abstractC2557Fj.a();
                }
                return;
            default:
                Ot ot = (Ot) this.f32954u;
                C2476An c2476An = (C2476An) abstractC2557Fj;
                synchronized (ot) {
                    try {
                        ot.f26670C = c2476An;
                        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32375t4)).booleanValue()) {
                            c2476An.f23742u.f29151a = ot.f26675x;
                        }
                        ot.f26670C.a();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3433k
    public C3500lC t(int i, A8 a82, int[] iArr) {
        PB pb = RB.f27177u;
        MA.q(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i6 = 0;
        int i9 = 0;
        while (i6 < a82.f23635a) {
            int i10 = i;
            A8 a83 = a82;
            C3165f c3165f = new C3165f(i10, a83, i6, (C3327i) this.f32954u, iArr[i6]);
            int length = objArr.length;
            int i11 = i9 + 1;
            int d2 = MB.d(length, i11);
            if (d2 > length) {
                objArr = Arrays.copyOf(objArr, d2);
            }
            objArr[i9] = c3165f;
            i6++;
            i9 = i11;
            i = i10;
            a82 = a83;
        }
        return RB.p(objArr, i9);
    }

    @Override // p2.InterfaceC4832g
    public void v() {
        ScheduledFuture scheduledFuture;
        ScheduledFuture scheduledFuture2;
        C2875Yk c2875Yk = ((C2612In) this.f32954u).f25573g;
        synchronized (c2875Yk) {
            try {
                if (c2875Yk.f28723C) {
                    if (c2875Yk.f28721A > 0 && (scheduledFuture2 = c2875Yk.f28724D) != null && scheduledFuture2.isCancelled()) {
                        c2875Yk.U1(c2875Yk.f28721A);
                    }
                    if (c2875Yk.f28722B > 0 && (scheduledFuture = c2875Yk.f28725E) != null && scheduledFuture.isCancelled()) {
                        c2875Yk.V1(c2875Yk.f28722B);
                    }
                    c2875Yk.f28723C = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
        switch (this.f32953n) {
            case 16:
                ((C2710Oj) this.f32954u).f26644f.x(false);
                return;
            case 20:
                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32338p6)).booleanValue()) {
                    C4835j.f39733C.f39743h.d("omid native display exp", th);
                    return;
                }
                return;
            case 22:
                synchronized (this) {
                    C2494Bo c2494Bo = (C2494Bo) this.f32954u;
                    c2494Bo.f23955c = true;
                    C4835j.f39733C.f39745k.getClass();
                    c2494Bo.d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - c2494Bo.f23956d), "Internal Error.", false);
                    c2494Bo.f23957e.c(new Exception());
                }
                return;
            default:
                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32239e7)).booleanValue()) {
                    Matcher matcher = C3584mp.f32583h.matcher(th.getMessage());
                    if (matcher.matches()) {
                        int parseInt = Integer.parseInt(matcher.group(1));
                        C2699Np c2699Np = ((C3584mp) this.f32954u).f32588e;
                        synchronized (c2699Np.f26546g) {
                            c2699Np.f26541b = parseInt;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // x2.InterfaceC5189c
    public void x(C4631a c4631a) {
        try {
            ((InterfaceC2653Ld) this.f32954u).a(c4631a.a());
        } catch (RemoteException e9) {
            v2.i.d("", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.At
    public /* bridge */ /* synthetic */ N3.a y(S0.e eVar, InterfaceC4289zt interfaceC4289zt) {
        return B(eVar, interfaceC4289zt, null);
    }

    @Override // p2.InterfaceC4832g
    public void z() {
        C2875Yk c2875Yk = ((C2612In) this.f32954u).f25573g;
        synchronized (c2875Yk) {
            try {
                if (c2875Yk.f28723C) {
                    return;
                }
                ScheduledFuture scheduledFuture = c2875Yk.f28724D;
                if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                    c2875Yk.f28721A = -1L;
                } else {
                    c2875Yk.f28724D.cancel(false);
                    long j6 = c2875Yk.f28729y;
                    c2875Yk.f28727w.getClass();
                    c2875Yk.f28721A = j6 - SystemClock.elapsedRealtime();
                }
                ScheduledFuture scheduledFuture2 = c2875Yk.f28725E;
                if (scheduledFuture2 == null || scheduledFuture2.isCancelled()) {
                    c2875Yk.f28722B = -1L;
                } else {
                    c2875Yk.f28725E.cancel(false);
                    long j9 = c2875Yk.f28730z;
                    c2875Yk.f28727w.getClass();
                    c2875Yk.f28722B = j9 - SystemClock.elapsedRealtime();
                }
                c2875Yk.f28723C = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C3694or(C3309hi c3309hi) {
        this.f32953n = 15;
        this.f32954u = new C2709Oi(c3309hi.f30884g, c3309hi.f30875b0, new C4008ui(22, c3309hi.f30877c0), c3309hi.f30879d0, c3309hi.f30829A, c3309hi.f30920z, 4);
    }

    public C3694or(int i) {
        this.f32953n = i;
        switch (i) {
            case 5:
                this.f32954u = new Cr();
                break;
            case 7:
                this.f32954u = new ArrayDeque();
                break;
            case 28:
                break;
            default:
                this.f32954u = new LinkedHashMap();
                break;
        }
    }

    public C3694or(Context context, Executor executor) {
        this.f32953n = 8;
        this.f32954u = QC.o(new CallableC3549m7(0, context), executor);
    }

    public C3694or(T8 t82) {
        this.f32953n = 9;
        Objects.requireNonNull(t82);
        this.f32954u = t82;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        ((java.util.ArrayList) r4.f32954u).add(new com.google.android.gms.internal.ads.C3893sb(r3));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3694or(InterfaceC3624nb interfaceC3624nb) {
        IBinder iBinder;
        this.f32953n = 10;
        this.f32954u = new ArrayList();
        try {
            interfaceC3624nb.c();
        } catch (RemoteException e9) {
            v2.i.d("", e9);
        }
        try {
            for (Object obj : interfaceC3624nb.f()) {
                InterfaceC3839rb interfaceC3839rb = null;
                if ((obj instanceof IBinder) && (iBinder = (IBinder) obj) != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    interfaceC3839rb = queryLocalInterface instanceof InterfaceC3839rb ? (InterfaceC3839rb) queryLocalInterface : new C3786qb(iBinder);
                }
            }
        } catch (RemoteException e10) {
            v2.i.d("", e10);
        }
    }

    public C3694or(C2835Wc c2835Wc) {
        this.f32953n = 12;
        Objects.requireNonNull(c2835Wc);
        this.f32954u = c2835Wc;
    }

    public C3694or(BinderC2788Td binderC2788Td, InterfaceC2653Ld interfaceC2653Ld) {
        this.f32953n = 14;
        this.f32954u = interfaceC2653Ld;
        Objects.requireNonNull(binderC2788Td);
    }

    public C3694or(C4274ze c4274ze) {
        this.f32953n = 27;
        Objects.requireNonNull(c4274ze);
        this.f32954u = c4274ze;
    }

    public C3694or(C2730Pm c2730Pm) {
        this.f32953n = 20;
        Objects.requireNonNull(c2730Pm);
        this.f32954u = c2730Pm;
    }

    public C3694or(C2612In c2612In) {
        this.f32953n = 21;
        Objects.requireNonNull(c2612In);
        this.f32954u = c2612In;
    }

    public C3694or(C2494Bo c2494Bo) {
        this.f32953n = 22;
        Objects.requireNonNull(c2494Bo);
        this.f32954u = c2494Bo;
    }

    public C3694or(C3584mp c3584mp) {
        this.f32953n = 23;
        Objects.requireNonNull(c3584mp);
        this.f32954u = c3584mp;
    }

    public C3694or(C4178xq c4178xq, C3739pi c3739pi) {
        this.f32953n = 26;
        this.f32954u = c3739pi;
    }

    public C3694or(Ot ot) {
        this.f32953n = 29;
        Objects.requireNonNull(ot);
        this.f32954u = ot;
    }

    public C3694or(Context context, C2949ay c2949ay, RD rd) {
        this.f32953n = 1;
        context.getClass();
        rd.getClass();
        this.f32954u = (Yx) ((C3243gN) new C3796ql(context, c2949ay, rd).f33389m).f();
    }

    @Override // p2.InterfaceC4829d
    public void e(View view) {
    }
}

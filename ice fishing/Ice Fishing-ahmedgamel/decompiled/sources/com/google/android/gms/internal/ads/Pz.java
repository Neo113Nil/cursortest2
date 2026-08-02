package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class Pz implements Jz {

    /* renamed from: a, reason: collision with root package name */
    public final My f27683a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3307hA f27684b;

    /* renamed from: c, reason: collision with root package name */
    public final C3253gA f27685c;

    /* renamed from: d, reason: collision with root package name */
    public final ExecutorService f27686d;

    /* renamed from: e, reason: collision with root package name */
    public final C3521lA f27687e;

    /* renamed from: f, reason: collision with root package name */
    public final C4006uA f27688f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f27689g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final String f27690h;
    public final long i;

    /* renamed from: j, reason: collision with root package name */
    public final long f27691j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f27692k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f27693l;

    /* renamed from: m, reason: collision with root package name */
    public G2 f27694m;

    public Pz(My my, InterfaceC3307hA interfaceC3307hA, C3253gA c3253gA, C3521lA c3521lA, C4006uA c4006uA, C2972ay c2972ay, ExecutorService executorService) {
        this.f27683a = my;
        this.f27684b = interfaceC3307hA;
        this.f27685c = c3253gA;
        this.f27686d = executorService;
        this.f27687e = c3521lA;
        this.f27688f = c4006uA;
        this.f27690h = c2972ay.R();
        this.i = c2972ay.Z();
        this.f27691j = c2972ay.Y();
        this.f27692k = c2972ay.P();
        this.f27693l = c2972ay.Q();
    }

    @Override // com.google.android.gms.internal.ads.Jz
    public final RunnableFutureC2989bE a(Context context) {
        return QC.o(new E2.w(14, this, context), this.f27686d);
    }

    @Override // com.google.android.gms.internal.ads.Jz
    public final void b(MotionEvent motionEvent) {
        try {
            synchronized (this.f27689g) {
                try {
                    G2 g22 = this.f27694m;
                    if (g22 != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("evt", motionEvent);
                        ((M.h) g22.f25700w).x(g22.f25698u, Optional.of(hashMap));
                    } else {
                        this.f27688f.b(20105);
                    }
                } finally {
                }
            }
        } catch (A5 | D5 e9) {
            this.f27688f.d(20104, e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.Jz
    public final String c() {
        synchronized (this.f27689g) {
            try {
                G2 g22 = this.f27694m;
                if (g22 == null) {
                    return "3.904631200.-1";
                }
                return (String) g22.f25699v;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Jz
    public final RunnableFutureC2989bE d(Context context, View view, Activity activity) {
        return QC.o(new CallableC2900Ym(this, context, view, activity, 5), this.f27686d);
    }

    @Override // com.google.android.gms.internal.ads.Jz
    public final RunnableFutureC2989bE e(Context context, String str, View view) {
        return QC.o(new CallableC2900Ym(this, context, str, view, 6), this.f27686d);
    }

    @Override // com.google.android.gms.internal.ads.Jz
    public final ID f() {
        boolean z6 = this.f27693l;
        GD gd = GD.f25742n;
        C3253gA c3253gA = this.f27685c;
        if (z6) {
            RunnableFutureC2989bE o4 = QC.o(CallableC3162ea.f30730g, c3253gA.f31312e);
            c3253gA.f31311d.e(20312, o4);
            return QC.u(o4, new Nz(this, 1), gd);
        }
        ID s9 = ID.s(c3253gA.f());
        Oz oz = Oz.f27480b;
        ExecutorService executorService = this.f27686d;
        final int i = 0;
        C3901sD t6 = QC.t(QC.q(s9, Throwable.class, oz, executorService), new BD(this) { // from class: com.google.android.gms.internal.ads.Mz

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Pz f27167b;

            {
                this.f27167b = this;
            }

            @Override // com.google.android.gms.internal.ads.BD
            public final P3.a a(Object obj) {
                switch (i) {
                    case 0:
                        Pz pz = this.f27167b;
                        Ky ky = (Ky) obj;
                        if (ky != null) {
                            My my = pz.f27683a;
                            List D8 = ky.D();
                            Gy gy = (Gy) my;
                            synchronized (gy.f25958m) {
                                C3409j6 c3409j6 = gy.f25961p;
                                c3409j6.h();
                                ((C3463k6) c3409j6.f28504u).N((ZK) D8);
                            }
                        }
                        if (!pz.f27684b.b(ky)) {
                            pz.f27688f.b(20103);
                            throw new B0.c(1);
                        }
                        C3253gA c3253gA2 = pz.f27685c;
                        C4263yy c4263yy = c3253gA2.f31309b;
                        c4263yy.getClass();
                        RunnableFutureC2989bE o6 = QC.o(new Ts(5, c4263yy), c4263yy.f36038b);
                        c3253gA2.f31311d.e(20304, o6);
                        return QC.u(o6, new Nz(pz, 0), GD.f25742n);
                    default:
                        Throwable th = (Throwable) obj;
                        Pz pz2 = this.f27167b;
                        if (!pz2.f27692k) {
                            return QC.k(th);
                        }
                        CallableC3162ea callableC3162ea = CallableC3162ea.f30730g;
                        C3253gA c3253gA3 = pz2.f27685c;
                        RunnableFutureC2989bE o9 = QC.o(callableC3162ea, c3253gA3.f31312e);
                        c3253gA3.f31311d.e(20312, o9);
                        return QC.u(o9, new Nz(pz2, 1), GD.f25742n);
                }
            }
        }, executorService);
        final int i4 = 1;
        return QC.r(t6, Throwable.class, new BD(this) { // from class: com.google.android.gms.internal.ads.Mz

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Pz f27167b;

            {
                this.f27167b = this;
            }

            @Override // com.google.android.gms.internal.ads.BD
            public final P3.a a(Object obj) {
                switch (i4) {
                    case 0:
                        Pz pz = this.f27167b;
                        Ky ky = (Ky) obj;
                        if (ky != null) {
                            My my = pz.f27683a;
                            List D8 = ky.D();
                            Gy gy = (Gy) my;
                            synchronized (gy.f25958m) {
                                C3409j6 c3409j6 = gy.f25961p;
                                c3409j6.h();
                                ((C3463k6) c3409j6.f28504u).N((ZK) D8);
                            }
                        }
                        if (!pz.f27684b.b(ky)) {
                            pz.f27688f.b(20103);
                            throw new B0.c(1);
                        }
                        C3253gA c3253gA2 = pz.f27685c;
                        C4263yy c4263yy = c3253gA2.f31309b;
                        c4263yy.getClass();
                        RunnableFutureC2989bE o6 = QC.o(new Ts(5, c4263yy), c4263yy.f36038b);
                        c3253gA2.f31311d.e(20304, o6);
                        return QC.u(o6, new Nz(pz, 0), GD.f25742n);
                    default:
                        Throwable th = (Throwable) obj;
                        Pz pz2 = this.f27167b;
                        if (!pz2.f27692k) {
                            return QC.k(th);
                        }
                        CallableC3162ea callableC3162ea = CallableC3162ea.f30730g;
                        C3253gA c3253gA3 = pz2.f27685c;
                        RunnableFutureC2989bE o9 = QC.o(callableC3162ea, c3253gA3.f31312e);
                        c3253gA3.f31311d.e(20312, o9);
                        return QC.u(o9, new Nz(pz2, 1), GD.f25742n);
                }
            }
        }, gd);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(HashMap hashMap) {
        String str;
        C3952tA a9;
        String str2;
        hashMap.put("v", this.f27690h);
        P3.a aVar = (P3.a) hashMap.get("gs");
        P3.a aVar2 = (P3.a) hashMap.get(com.anythink.expressad.f.a.b.da);
        C4006uA c4006uA = this.f27688f;
        byte[] bArr = null;
        long j6 = -1;
        if (aVar != null) {
            a9 = c4006uA.a(20107);
            try {
                try {
                    a9.a();
                    H6 h62 = (H6) aVar.get(this.f27691j, TimeUnit.MILLISECONDS);
                    if (h62 != null) {
                        bArr = h62.A0().b();
                        str = h62.v0().length() > 1 ? h62.v0() : "E";
                        try {
                            if (h62.w0()) {
                                j6 = h62.x0();
                            }
                        } catch (ClassCastException e9) {
                            e = e9;
                            a9.b(e);
                            a9.c();
                            if (str.equals("E")) {
                            }
                            hashMap.put("int", str);
                            if (bArr != null) {
                            }
                            hashMap.put("gv", Long.valueOf(j6));
                        } catch (InterruptedException e10) {
                            e = e10;
                            a9.b(e);
                            a9.c();
                            if (str.equals("E")) {
                            }
                            hashMap.put("int", str);
                            if (bArr != null) {
                            }
                            hashMap.put("gv", Long.valueOf(j6));
                        } catch (ExecutionException e11) {
                            e = e11;
                            Throwable cause = e.getCause();
                            if (cause != null) {
                                e = cause;
                            }
                            a9.b(e);
                            a9.c();
                            if (str.equals("E")) {
                            }
                            hashMap.put("int", str);
                            if (bArr != null) {
                            }
                            hashMap.put("gv", Long.valueOf(j6));
                        } catch (TimeoutException e12) {
                            e = e12;
                            a9.b(e);
                            a9.c();
                            if (str.equals("E")) {
                            }
                            hashMap.put("int", str);
                            if (bArr != null) {
                            }
                            hashMap.put("gv", Long.valueOf(j6));
                        }
                    } else {
                        str = "E";
                    }
                } finally {
                }
            } catch (ClassCastException e13) {
                e = e13;
                str = "E";
                a9.b(e);
                a9.c();
                if (str.equals("E")) {
                    a9 = c4006uA.a(20108);
                    try {
                        try {
                            a9.a();
                            str2 = (String) aVar2.get(this.i, TimeUnit.MILLISECONDS);
                            if (true != SK.n(str2)) {
                            }
                        } catch (ClassCastException e14) {
                            e = e14;
                            a9.b(e);
                        } catch (InterruptedException e15) {
                            e = e15;
                            a9.b(e);
                        } catch (ExecutionException e16) {
                            e = e16;
                            Throwable cause2 = e.getCause();
                            if (cause2 != null) {
                                e = cause2;
                            }
                            a9.b(e);
                        } catch (TimeoutException e17) {
                            e = e17;
                            a9.b(e);
                        }
                    } finally {
                    }
                }
                hashMap.put("int", str);
                if (bArr != null) {
                }
                hashMap.put("gv", Long.valueOf(j6));
            } catch (InterruptedException e18) {
                e = e18;
                str = "E";
                a9.b(e);
                a9.c();
                if (str.equals("E")) {
                }
                hashMap.put("int", str);
                if (bArr != null) {
                }
                hashMap.put("gv", Long.valueOf(j6));
            } catch (ExecutionException e19) {
                e = e19;
                str = "E";
            } catch (TimeoutException e20) {
                e = e20;
                str = "E";
                a9.b(e);
                a9.c();
                if (str.equals("E")) {
                }
                hashMap.put("int", str);
                if (bArr != null) {
                }
                hashMap.put("gv", Long.valueOf(j6));
            }
            a9.c();
        } else {
            str = "E";
        }
        if (str.equals("E") && aVar2 != null) {
            a9 = c4006uA.a(20108);
            a9.a();
            str2 = (String) aVar2.get(this.i, TimeUnit.MILLISECONDS);
            if (true != SK.n(str2)) {
                str = str2;
            }
        }
        hashMap.put("int", str);
        if (bArr != null) {
            hashMap.put("att", bArr);
        }
        hashMap.put("gv", Long.valueOf(j6));
    }

    @Override // com.google.android.gms.internal.ads.Jz
    public final int h() {
        return 4;
    }

    public final void i(M.h hVar, byte[] bArr, boolean z6) {
        C3952tA a9 = this.f27688f.a(20102);
        try {
            try {
                a9.a();
                synchronized (this.f27689g) {
                    this.f27694m = G2.b(hVar, bArr, z6);
                }
                a9.c();
            } catch (A5 e9) {
                e = e9;
                a9.b(e);
                throw new B0.c("r: 2", e);
            } catch (D5 e10) {
                e = e10;
                a9.b(e);
                throw new B0.c("r: 2", e);
            } catch (Throwable th) {
                a9.b(th);
                throw th;
            }
        } catch (Throwable th2) {
            a9.c();
            throw th2;
        }
    }

    public final String j(HashMap hashMap) {
        String g9;
        C4006uA c4006uA = this.f27688f;
        try {
            c4006uA.a(20110).a();
            synchronized (this.f27689g) {
                try {
                    G2 g22 = this.f27694m;
                    if (g22 == null) {
                        c4006uA.b(20109);
                        g9 = "";
                    } else {
                        byte[] bArr = (byte[]) ((M.h) g22.f25700w).x(g22.f25697n, Optional.of(hashMap));
                        CC cc = EC.f25317e;
                        if (cc.f25320b != null) {
                            cc = new CC(cc.f25319a, (Character) null);
                        }
                        g9 = cc.g(bArr.length, bArr);
                    }
                } finally {
                }
            }
            return g9;
        } finally {
        }
    }
}

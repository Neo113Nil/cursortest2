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
    public final My f26896a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3284hA f26897b;

    /* renamed from: c, reason: collision with root package name */
    public final C3230gA f26898c;

    /* renamed from: d, reason: collision with root package name */
    public final ExecutorService f26899d;

    /* renamed from: e, reason: collision with root package name */
    public final C3498lA f26900e;

    /* renamed from: f, reason: collision with root package name */
    public final C3983uA f26901f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f26902g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final String f26903h;
    public final long i;

    /* renamed from: j, reason: collision with root package name */
    public final long f26904j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f26905k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f26906l;

    /* renamed from: m, reason: collision with root package name */
    public G2 f26907m;

    public Pz(My my, InterfaceC3284hA interfaceC3284hA, C3230gA c3230gA, C3498lA c3498lA, C3983uA c3983uA, C2949ay c2949ay, ExecutorService executorService) {
        this.f26896a = my;
        this.f26897b = interfaceC3284hA;
        this.f26898c = c3230gA;
        this.f26899d = executorService;
        this.f26900e = c3498lA;
        this.f26901f = c3983uA;
        this.f26903h = c2949ay.R();
        this.i = c2949ay.Z();
        this.f26904j = c2949ay.Y();
        this.f26905k = c2949ay.P();
        this.f26906l = c2949ay.Q();
    }

    @Override // com.google.android.gms.internal.ads.Jz
    public final RunnableFutureC2966bE a(Context context) {
        return QC.o(new C2.x(14, this, context), this.f26899d);
    }

    @Override // com.google.android.gms.internal.ads.Jz
    public final void b(MotionEvent motionEvent) {
        try {
            synchronized (this.f26902g) {
                try {
                    G2 g22 = this.f26907m;
                    if (g22 != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("evt", motionEvent);
                        ((L3.h) g22.f24910w).x(g22.f24908u, Optional.of(hashMap));
                    } else {
                        this.f26901f.b(20105);
                    }
                } finally {
                }
            }
        } catch (A5 | D5 e9) {
            this.f26901f.d(20104, e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.Jz
    public final String c() {
        synchronized (this.f26902g) {
            try {
                G2 g22 = this.f26907m;
                if (g22 == null) {
                    return "3.904631200.-1";
                }
                return (String) g22.f24909v;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Jz
    public final RunnableFutureC2966bE d(Context context, View view, Activity activity) {
        return QC.o(new CallableC2861Xm(this, context, view, activity, 5), this.f26899d);
    }

    @Override // com.google.android.gms.internal.ads.Jz
    public final RunnableFutureC2966bE e(Context context, String str, View view) {
        return QC.o(new CallableC2861Xm(this, context, str, view, 6), this.f26899d);
    }

    @Override // com.google.android.gms.internal.ads.Jz
    public final ID f() {
        boolean z3 = this.f26906l;
        GD gd = GD.f24952n;
        C3230gA c3230gA = this.f26898c;
        if (z3) {
            RunnableFutureC2966bE o6 = QC.o(CallableC3139ea.f29939g, c3230gA.f30546e);
            c3230gA.f30545d.e(20312, o6);
            return QC.u(o6, new Nz(this, 1), gd);
        }
        ID s9 = ID.s(c3230gA.f());
        Oz oz = Oz.f26697b;
        ExecutorService executorService = this.f26899d;
        final int i = 0;
        C3878sD t6 = QC.t(QC.q(s9, Throwable.class, oz, executorService), new BD(this) { // from class: com.google.android.gms.internal.ads.Mz

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Pz f26382b;

            {
                this.f26382b = this;
            }

            @Override // com.google.android.gms.internal.ads.BD
            public final N3.a a(Object obj) {
                switch (i) {
                    case 0:
                        Pz pz = this.f26382b;
                        Ky ky = (Ky) obj;
                        if (ky != null) {
                            My my = pz.f26896a;
                            List D8 = ky.D();
                            Gy gy = (Gy) my;
                            synchronized (gy.f25186m) {
                                C3386j6 c3386j6 = gy.f25189p;
                                c3386j6.h();
                                ((C3440k6) c3386j6.f27721u).N((ZK) D8);
                            }
                        }
                        if (!pz.f26897b.b(ky)) {
                            pz.f26901f.b(20103);
                            throw new B0.c(1);
                        }
                        C3230gA c3230gA2 = pz.f26898c;
                        C4240yy c4240yy = c3230gA2.f30543b;
                        c4240yy.getClass();
                        RunnableFutureC2966bE o9 = QC.o(new Ts(5, c4240yy), c4240yy.f35254b);
                        c3230gA2.f30545d.e(20304, o9);
                        return QC.u(o9, new Nz(pz, 0), GD.f24952n);
                    default:
                        Throwable th = (Throwable) obj;
                        Pz pz2 = this.f26382b;
                        if (!pz2.f26905k) {
                            return QC.k(th);
                        }
                        CallableC3139ea callableC3139ea = CallableC3139ea.f29939g;
                        C3230gA c3230gA3 = pz2.f26898c;
                        RunnableFutureC2966bE o10 = QC.o(callableC3139ea, c3230gA3.f30546e);
                        c3230gA3.f30545d.e(20312, o10);
                        return QC.u(o10, new Nz(pz2, 1), GD.f24952n);
                }
            }
        }, executorService);
        final int i6 = 1;
        return QC.r(t6, Throwable.class, new BD(this) { // from class: com.google.android.gms.internal.ads.Mz

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Pz f26382b;

            {
                this.f26382b = this;
            }

            @Override // com.google.android.gms.internal.ads.BD
            public final N3.a a(Object obj) {
                switch (i6) {
                    case 0:
                        Pz pz = this.f26382b;
                        Ky ky = (Ky) obj;
                        if (ky != null) {
                            My my = pz.f26896a;
                            List D8 = ky.D();
                            Gy gy = (Gy) my;
                            synchronized (gy.f25186m) {
                                C3386j6 c3386j6 = gy.f25189p;
                                c3386j6.h();
                                ((C3440k6) c3386j6.f27721u).N((ZK) D8);
                            }
                        }
                        if (!pz.f26897b.b(ky)) {
                            pz.f26901f.b(20103);
                            throw new B0.c(1);
                        }
                        C3230gA c3230gA2 = pz.f26898c;
                        C4240yy c4240yy = c3230gA2.f30543b;
                        c4240yy.getClass();
                        RunnableFutureC2966bE o9 = QC.o(new Ts(5, c4240yy), c4240yy.f35254b);
                        c3230gA2.f30545d.e(20304, o9);
                        return QC.u(o9, new Nz(pz, 0), GD.f24952n);
                    default:
                        Throwable th = (Throwable) obj;
                        Pz pz2 = this.f26382b;
                        if (!pz2.f26905k) {
                            return QC.k(th);
                        }
                        CallableC3139ea callableC3139ea = CallableC3139ea.f29939g;
                        C3230gA c3230gA3 = pz2.f26898c;
                        RunnableFutureC2966bE o10 = QC.o(callableC3139ea, c3230gA3.f30546e);
                        c3230gA3.f30545d.e(20312, o10);
                        return QC.u(o10, new Nz(pz2, 1), GD.f24952n);
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
        C3929tA a9;
        String str2;
        hashMap.put("v", this.f26903h);
        N3.a aVar = (N3.a) hashMap.get("gs");
        N3.a aVar2 = (N3.a) hashMap.get(com.anythink.expressad.f.a.b.da);
        C3983uA c3983uA = this.f26901f;
        byte[] bArr = null;
        long j6 = -1;
        if (aVar != null) {
            a9 = c3983uA.a(20107);
            try {
                try {
                    a9.a();
                    H6 h62 = (H6) aVar.get(this.f26904j, TimeUnit.MILLISECONDS);
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
                    a9 = c3983uA.a(20108);
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
            a9 = c3983uA.a(20108);
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

    public final void i(L3.h hVar, byte[] bArr, boolean z3) {
        C3929tA a9 = this.f26901f.a(20102);
        try {
            try {
                a9.a();
                synchronized (this.f26902g) {
                    this.f26907m = G2.b(hVar, bArr, z3);
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
        String g4;
        C3983uA c3983uA = this.f26901f;
        try {
            c3983uA.a(20110).a();
            synchronized (this.f26902g) {
                try {
                    G2 g22 = this.f26907m;
                    if (g22 == null) {
                        c3983uA.b(20109);
                        g4 = "";
                    } else {
                        byte[] bArr = (byte[]) ((L3.h) g22.f24910w).x(g22.f24907n, Optional.of(hashMap));
                        CC cc = EC.f24556e;
                        if (cc.f24559b != null) {
                            cc = new CC(cc.f24558a, (Character) null);
                        }
                        g4 = cc.g(bArr.length, bArr);
                    }
                } finally {
                }
            }
            return g4;
        } finally {
        }
    }
}

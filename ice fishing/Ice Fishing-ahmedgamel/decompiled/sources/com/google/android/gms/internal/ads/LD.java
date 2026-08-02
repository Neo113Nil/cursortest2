package com.google.android.gms.internal.ads;

import D.AbstractC0278h;
import D.C0277g;
import E2.BinderC0314k;
import E2.C0304a;
import R2.AbstractBinderC0375a;
import R2.InterfaceC0384j;
import S7.AbstractC0406u;
import S7.AbstractC0410y;
import S7.C0393g;
import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebView;
import androidx.work.Worker;
import f3.AbstractC4518a;
import i1.C4585b;
import j3.C4619h;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import r2.C4906k;
import z7.C5246j;

/* loaded from: classes2.dex */
public final class LD implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f26875n;

    /* renamed from: u, reason: collision with root package name */
    public Object f26876u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f26877v;

    public /* synthetic */ LD(int i, Object obj, Object obj2) {
        this.f26875n = i;
        this.f26876u = obj;
        this.f26877v = obj2;
    }

    private final void a() {
        N3.v vVar = (N3.v) this.f26876u;
        Runnable runnable = (Runnable) this.f26877v;
        if (vVar.f2023k != null || vVar.f2019f) {
            if (!vVar.f2019f) {
                runnable.run();
                return;
            }
            if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
                Log.i("ServiceConnMgrImpl", "Waiting to bind to the service.");
            }
            ArrayList arrayList = vVar.f2017d;
            synchronized (arrayList) {
                arrayList.add(runnable);
            }
            return;
        }
        if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
            Log.i("ServiceConnMgrImpl", "Initiate binding to the service.");
        }
        ArrayList arrayList2 = vVar.f2017d;
        synchronized (arrayList2) {
            arrayList2.add(runnable);
        }
        N3.u uVar = new N3.u(vVar);
        vVar.f2022j = uVar;
        vVar.f2019f = true;
        if (vVar.f2015b.bindService(vVar.f2020g, uVar, 65)) {
            return;
        }
        if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
            Log.i("ServiceConnMgrImpl", "Failed to bind to the service.");
        }
        vVar.f2019f = false;
        ArrayList arrayList3 = vVar.f2017d;
        synchronized (arrayList3) {
            arrayList3.clear();
        }
    }

    private final void b() {
        S0.p pVar;
        K0.f fVar = ((R0.a) this.f26877v).f2728n.f1646f;
        String str = (String) this.f26876u;
        synchronized (fVar.f1615E) {
            try {
                K0.q qVar = (K0.q) fVar.f1621y.get(str);
                if (qVar == null) {
                    qVar = (K0.q) fVar.f1622z.get(str);
                }
                pVar = qVar != null ? qVar.f1665x : null;
            } finally {
            }
        }
        if (pVar == null || !pVar.b()) {
            return;
        }
        synchronized (((R0.a) this.f26877v).f2730v) {
            ((R0.a) this.f26877v).f2733y.put(Z2.d.k(pVar), pVar);
            ((R0.a) this.f26877v).f2734z.add(pVar);
            R0.a aVar = (R0.a) this.f26877v;
            aVar.f2726A.E(aVar.f2734z);
        }
    }

    private final void c() {
        try {
            ((Runnable) this.f26877v).run();
            synchronized (((T0.l) this.f26876u).f3127u) {
                ((T0.l) this.f26876u).a();
            }
        } catch (Throwable th) {
            synchronized (((T0.l) this.f26876u).f3127u) {
                ((T0.l) this.f26876u).a();
                throw th;
            }
        }
    }

    private final void d() {
        try {
            f();
        } catch (Error e9) {
            synchronized (((U3.i) this.f26877v).f3321u) {
                ((U3.i) this.f26877v).f3322v = 1;
                throw e9;
            }
        }
    }

    private final void e() {
        b3.e eVar = (b3.e) this.f26876u;
        Context context = (Context) eVar.f5557u;
        String string = b3.e.N(context).getString("app_set_id", null);
        long j6 = b3.e.N((Context) eVar.f5557u).getLong("app_set_id_last_used_time", -1L);
        long j9 = j6 != -1 ? 33696000000L + j6 : -1L;
        l3.h hVar = (l3.h) this.f26877v;
        if (string == null || System.currentTimeMillis() > j9) {
            string = UUID.randomUUID().toString();
            try {
                if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putString("app_set_id", string).commit()) {
                    String valueOf = String.valueOf(context.getPackageName());
                    Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID generated for App ".concat(valueOf) : new String("Failed to store app set ID generated for App "));
                    throw new b3.d("Failed to store the app set ID.");
                }
                b3.e.O(context);
                if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putLong("app_set_id_creation_time", System.currentTimeMillis()).commit()) {
                    String valueOf2 = String.valueOf(context.getPackageName());
                    Log.e("AppSet", valueOf2.length() != 0 ? "Failed to store app set ID creation time for App ".concat(valueOf2) : new String("Failed to store app set ID creation time for App "));
                    throw new b3.d("Failed to store the app set ID creation time.");
                }
            } catch (b3.d e9) {
                hVar.a(e9);
                return;
            }
        } else {
            try {
                b3.e.O(context);
            } catch (b3.d e10) {
                hVar.a(e10);
                return;
            }
        }
        hVar.b(new K2.b(string, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        ((java.lang.Runnable) r10.f26876u).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        r10.f26876u = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        U3.i.f3319y.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.f26876u), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f() {
        boolean z6 = false;
        boolean z9 = false;
        while (true) {
            try {
                synchronized (((U3.i) this.f26877v).f3321u) {
                    if (!z6) {
                        U3.i iVar = (U3.i) this.f26877v;
                        if (iVar.f3322v != 4) {
                            iVar.f3323w++;
                            iVar.f3322v = 4;
                            z6 = true;
                        }
                    }
                    Runnable runnable = (Runnable) ((U3.i) this.f26877v).f3321u.poll();
                    this.f26876u = runnable;
                    if (runnable == null) {
                        ((U3.i) this.f26877v).f3322v = 1;
                    }
                }
                if (!z9) {
                    return;
                }
            } finally {
                if (z9) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable b9;
        C3236fu c3236fu;
        IInterface iInterface;
        InterfaceC0384j interfaceC0384j;
        InterfaceC0384j k9;
        Set set;
        int i = 0;
        switch (this.f26875n) {
            case 0:
                P3.a aVar = (P3.a) this.f26876u;
                boolean z6 = aVar instanceof AbstractC3042cE;
                KD kd = (KD) this.f26877v;
                if (z6 && (b9 = ((AbstractC3042cE) aVar).b()) != null) {
                    kd.w(b9);
                    return;
                }
                try {
                    kd.mo10n(QC.v(aVar));
                    return;
                } catch (ExecutionException e9) {
                    kd.w(e9.getCause());
                    return;
                } catch (Throwable th) {
                    kd.w(th);
                    return;
                }
            case 1:
                ((C0277g) this.f26876u).f362n = this.f26877v;
                return;
            case 2:
                ((Application) this.f26876u).unregisterActivityLifecycleCallbacks((C0277g) this.f26877v);
                return;
            case 3:
                try {
                    Method method = AbstractC0278h.f371d;
                    Object obj = this.f26877v;
                    Object obj2 = this.f26876u;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        AbstractC0278h.f372e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e10) {
                    if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                        throw e10;
                    }
                    return;
                } catch (Throwable th2) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th2);
                    return;
                }
            case 4:
                BinderC0314k binderC0314k = (BinderC0314k) this.f26876u;
                binderC0314k.getClass();
                C4036un c4036un = ((C4036un[]) this.f26877v)[0];
                if (c4036un != null) {
                    ND c9 = QC.c(c4036un);
                    C3612mu c3612mu = binderC0314k.f836y;
                    synchronized (c3612mu) {
                        c3612mu.f33402a.addFirst(c9);
                    }
                    return;
                }
                return;
            case 5:
                C0304a c0304a = (C0304a) this.f26876u;
                Uri parse = Uri.parse((String) this.f26877v);
                try {
                    boolean booleanValue = ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.vd)).booleanValue();
                    WebView webView = c0304a.f767b;
                    Context context = c0304a.f766a;
                    parse = (!booleanValue || (c3236fu = c0304a.f769d) == null) ? c0304a.f768c.b(parse, context, webView, null) : c3236fu.a(parse, context, webView, null);
                } catch (C3518l7 e11) {
                    int i4 = w2.z.f41712b;
                    x2.i.b("Failed to append the click signal to URL: ", e11);
                    C4906k.f40186C.f40196h.d("TaggingLibraryJsInterface.recordClick", e11);
                }
                c0304a.i.b(parse.toString(), null, null, null);
                return;
            case 6:
                C0393g c0393g = (C0393g) this.f26877v;
                try {
                    c0393g.resumeWith(((P3.a) this.f26876u).get());
                    return;
                } catch (Throwable th3) {
                    Throwable cause = th3.getCause();
                    if (cause == null) {
                        cause = th3;
                    }
                    if (th3 instanceof CancellationException) {
                        c0393g.m(cause);
                        return;
                    } else {
                        c0393g.resumeWith(Q3.b.b(cause));
                        return;
                    }
                }
            case 7:
                U0.k kVar = (U0.k) this.f26876u;
                try {
                    kVar.j(((Worker) this.f26877v).getForegroundInfo());
                    return;
                } catch (Throwable th4) {
                    kVar.k(th4);
                    return;
                }
            case 8:
                if (((K0.q) this.f26877v).J.f3276n instanceof U0.a) {
                    return;
                }
                try {
                    ((U0.k) this.f26876u).get();
                    J0.r.d().a(K0.q.f1650L, "Starting work for " + ((K0.q) this.f26877v).f1665x.f2939c);
                    K0.q qVar = (K0.q) this.f26877v;
                    qVar.J.l(qVar.f1666y.startWork());
                    return;
                } catch (Throwable th5) {
                    ((K0.q) this.f26877v).J.k(th5);
                    return;
                }
            case 9:
                String str = (String) this.f26876u;
                K0.q qVar2 = (K0.q) this.f26877v;
                try {
                    try {
                        J0.p pVar = (J0.p) qVar2.J.get();
                        if (pVar == null) {
                            J0.r.d().b(K0.q.f1650L, qVar2.f1665x.f2939c + " returned a null result. Treating it as a failure.");
                        } else {
                            J0.r.d().a(K0.q.f1650L, qVar2.f1665x.f2939c + " returned a " + pVar + com.anythink.core.common.d.j.f13164z);
                            qVar2.f1651A = pVar;
                        }
                    } finally {
                        qVar2.b();
                    }
                } catch (InterruptedException e12) {
                    e = e12;
                    J0.r.d().c(K0.q.f1650L, str + " failed because it threw an exception/error", e);
                } catch (CancellationException e13) {
                    J0.r d9 = J0.r.d();
                    String str2 = K0.q.f1650L;
                    String str3 = str + " was cancelled";
                    if (d9.f1433a <= 4) {
                        Log.i(str2, str3, e13);
                    }
                } catch (ExecutionException e14) {
                    e = e14;
                    J0.r.d().c(K0.q.f1650L, str + " failed because it threw an exception/error", e);
                }
                qVar2.b();
                return;
            case 10:
                F.b bVar = (F.b) ((C4585b) this.f26876u).f38152u;
                if (bVar != null) {
                    bVar.h((Typeface) this.f26877v);
                    return;
                }
                return;
            case 11:
                ((L.e) this.f26876u).accept(this.f26877v);
                return;
            case 12:
                J0.r d10 = J0.r.d();
                String str4 = L0.a.f1714d;
                StringBuilder sb = new StringBuilder("Scheduling work ");
                S0.p pVar2 = (S0.p) this.f26876u;
                sb.append(pVar2.f2937a);
                d10.a(str4, sb.toString());
                ((L0.a) this.f26877v).f1715a.a(pVar2);
                return;
            case 13:
                N2.l lVar = (N2.l) this.f26876u;
                IBinder iBinder = (IBinder) this.f26877v;
                synchronized (lVar) {
                    if (iBinder == null) {
                        lVar.a("Null service connection");
                    } else {
                        try {
                            lVar.f1939v = new S0.s(iBinder);
                            lVar.f1937n = 2;
                            ((ScheduledExecutorService) lVar.f1942y.f1951c).execute(new N2.k(lVar, i));
                        } catch (RemoteException e15) {
                            lVar.a(e15.getMessage());
                        }
                    }
                }
                return;
            case 14:
                N2.l lVar2 = (N2.l) this.f26876u;
                int i6 = ((N2.m) this.f26877v).f1943a;
                synchronized (lVar2) {
                    N2.m mVar = (N2.m) lVar2.f1941x.get(i6);
                    if (mVar != null) {
                        Log.w("MessengerIpcClient", "Timing out request: " + i6);
                        lVar2.f1941x.remove(i6);
                        mVar.b(new N2.n("Timed out waiting for response", null));
                        lVar2.c();
                    }
                }
                return;
            case 15:
                b3.e eVar = (b3.e) this.f26876u;
                View view = (View) this.f26877v;
                Log.i("HsdpLoadingPanel", "hideLoading");
                try {
                    if (view.getParent() != null) {
                        ((WindowManager) eVar.f5558v).removeView(view);
                    }
                } catch (RuntimeException e16) {
                    Log.e("HsdpLoadingPanel", "Error removing view from WindowManager", e16);
                }
                eVar.f5559w = null;
                return;
            case 16:
                a();
                return;
            case 17:
                N3.u uVar = (N3.u) this.f26876u;
                N3.v vVar = uVar.f2013n;
                vVar.f2023k = (IInterface) vVar.f2021h.c((IBinder) this.f26877v);
                Log.i("ServiceConnMgrImpl", "notifyOnConnected");
                Iterator it = vVar.f2018e.iterator();
                while (it.hasNext()) {
                    ((N3.g) it.next()).getClass();
                    Log.i("HsdpClientImpl", "HSDP bound service connected");
                }
                if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
                    Log.i("ServiceConnMgrImpl", "linkToDeath");
                }
                try {
                    iInterface = vVar.f2023k;
                } catch (RemoteException e17) {
                    Log.e("ServiceConnMgrImpl", "linkToDeath failed", e17);
                }
                if (iInterface == null) {
                    throw null;
                }
                iInterface.asBinder().linkToDeath(vVar.i, 0);
                N3.v vVar2 = uVar.f2013n;
                vVar2.f2019f = false;
                synchronized (vVar2.f2017d) {
                    try {
                        Iterator it2 = vVar2.f2017d.iterator();
                        while (it2.hasNext()) {
                            ((Runnable) it2.next()).run();
                        }
                        vVar2.f2017d.clear();
                    } finally {
                    }
                }
                return;
            case 18:
                Bundle bundle = (Bundle) this.f26877v;
                N3.g gVar = (N3.g) this.f26876u;
                try {
                    M3.g gVar2 = (M3.g) gVar.f1972b.f2023k;
                    if (gVar2 == null) {
                        return;
                    }
                    N3.f fVar = gVar.f1974d;
                    M3.e eVar2 = (M3.e) gVar2;
                    Parcel t02 = eVar2.t0();
                    int i9 = AbstractC4518a.f37439a;
                    t02.writeInt(1);
                    bundle.writeToParcel(t02, 0);
                    if (fVar == null) {
                        t02.writeStrongBinder(null);
                    } else {
                        t02.writeStrongBinder(fVar);
                    }
                    eVar2.D0(t02, 4);
                    return;
                } catch (DeadObjectException e18) {
                    Log.e("HsdpClientImpl", "hsdpService is dead", e18);
                    return;
                } catch (RemoteException e19) {
                    Log.e("HsdpClientImpl", "Failed to call hsdpService.endSession", e19);
                    return;
                }
            case 19:
                Q2.E e20 = (Q2.E) this.f26877v;
                Q2.C c10 = (Q2.C) e20.f2503f.f2550C.get(e20.f2499b);
                if (c10 == null) {
                    return;
                }
                O2.b bVar2 = (O2.b) this.f26876u;
                if (!bVar2.b()) {
                    c10.l(bVar2, null);
                    return;
                }
                e20.f2502e = true;
                P2.c cVar = e20.f2498a;
                if (cVar.m()) {
                    if (!e20.f2502e || (interfaceC0384j = e20.f2500c) == null) {
                        return;
                    }
                    cVar.c(interfaceC0384j, e20.f2501d);
                    return;
                }
                try {
                    cVar.c(null, cVar.a());
                    return;
                } catch (SecurityException e21) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e21);
                    cVar.b("Failed to get service from broker.");
                    c10.l(new O2.b(10, null, null), null);
                    return;
                }
            case 20:
                C4619h c4619h = (C4619h) this.f26876u;
                O2.b bVar3 = c4619h.f38485u;
                boolean b10 = bVar3.b();
                Q2.N n9 = (Q2.N) this.f26877v;
                if (b10) {
                    R2.t tVar = c4619h.f38486v;
                    R2.w.h(tVar);
                    O2.b bVar4 = tVar.f2865v;
                    if (!bVar4.b()) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(bVar4)), new Exception());
                        n9.f2526z.b(bVar4);
                        n9.f2525y.g();
                        return;
                    }
                    Q2.E e22 = n9.f2526z;
                    IBinder iBinder2 = tVar.f2864u;
                    if (iBinder2 == null) {
                        k9 = null;
                    } else {
                        int i10 = AbstractBinderC0375a.f2772u;
                        IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        k9 = queryLocalInterface instanceof InterfaceC0384j ? (InterfaceC0384j) queryLocalInterface : new R2.K(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 2);
                    }
                    e22.getClass();
                    if (k9 == null || (set = n9.f2523w) == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        e22.b(new O2.b(4, null, null));
                    } else {
                        e22.f2500c = k9;
                        e22.f2501d = set;
                        if (e22.f2502e) {
                            e22.f2498a.c(k9, set);
                        }
                    }
                } else {
                    n9.f2526z.b(bVar3);
                }
                n9.f2525y.g();
                return;
            case 21:
                b();
                return;
            case 22:
                ((C0393g) this.f26877v).B((S7.S) this.f26876u);
                return;
            case 23:
                c();
                return;
            case 24:
                if (((T0.p) this.f26877v).f3139n.f3276n instanceof U0.a) {
                    return;
                }
                try {
                    J0.i iVar = (J0.i) ((U0.k) this.f26876u).get();
                    if (iVar == null) {
                        throw new IllegalStateException("Worker was marked important (" + ((T0.p) this.f26877v).f3141v.f2939c + ") but did not provide ForegroundInfo");
                    }
                    J0.r.d().a(T0.p.f3138z, "Updating notification for " + ((T0.p) this.f26877v).f3141v.f2939c);
                    T0.p pVar3 = (T0.p) this.f26877v;
                    U0.k kVar2 = pVar3.f3139n;
                    T0.q qVar3 = pVar3.f3143x;
                    Context context2 = pVar3.f3140u;
                    UUID id = pVar3.f3142w.getId();
                    qVar3.getClass();
                    U0.k kVar3 = new U0.k();
                    qVar3.f3145a.h(new N3.j(qVar3, kVar3, id, iVar, context2));
                    kVar2.l(kVar3);
                    return;
                } catch (Throwable th6) {
                    ((T0.p) this.f26877v).f3139n.k(th6);
                    return;
                }
            case 25:
                ((C0393g) this.f26876u).B((T7.e) this.f26877v);
                return;
            case 26:
                d();
                return;
            case 27:
                break;
            case 28:
                e();
                return;
            default:
                D1.x a9 = D1.x.a();
                a9.getClass();
                P1.p.a();
                a9.f582d.set(true);
                ((com.bumptech.glide.manager.d) this.f26877v).f24238u.f24240u = true;
                ((com.bumptech.glide.manager.d) this.f26877v).f24237n.getViewTreeObserver().removeOnDrawListener((com.bumptech.glide.manager.d) this.f26876u);
                ((com.bumptech.glide.manager.d) this.f26877v).f24238u.f24239n.clear();
                return;
        }
        while (true) {
            try {
                ((Runnable) this.f26876u).run();
            } catch (Throwable th7) {
                AbstractC0410y.l(th7, C5246j.f42241n);
            }
            X7.i iVar2 = (X7.i) this.f26877v;
            Runnable B3 = iVar2.B();
            if (B3 == null) {
                return;
            }
            this.f26876u = B3;
            i++;
            if (i >= 16) {
                AbstractC0406u abstractC0406u = iVar2.f3794v;
                if (abstractC0406u.z()) {
                    abstractC0406u.p(iVar2, this);
                    return;
                }
            }
        }
    }

    public String toString() {
        switch (this.f26875n) {
            case 0:
                C3504ku c3504ku = new C3504ku(LD.class.getSimpleName(), 18);
                S0.e eVar = new S0.e(25);
                ((S0.e) c3504ku.f32447w).f2909v = eVar;
                c3504ku.f32447w = eVar;
                eVar.f2908u = (KD) this.f26877v;
                return c3504ku.toString();
            case 26:
                Runnable runnable = (Runnable) this.f26876u;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i = ((U3.i) this.f26877v).f3322v;
                sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ LD(Object obj, Object obj2, int i, boolean z6) {
        this.f26875n = i;
        this.f26877v = obj;
        this.f26876u = obj2;
    }

    public LD(U3.i iVar) {
        this.f26875n = 26;
        this.f26877v = iVar;
    }
}

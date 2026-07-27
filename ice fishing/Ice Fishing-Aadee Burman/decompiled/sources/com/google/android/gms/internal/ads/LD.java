package com.google.android.gms.internal.ads;

import C2.BinderC0278k;
import C2.C0268a;
import D.AbstractC0290i;
import D.C0289h;
import L3.BinderC0320f;
import P2.AbstractBinderC0371a;
import P2.InterfaceC0380j;
import S7.AbstractC0402u;
import S7.AbstractC0406y;
import S7.C0389g;
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
import d3.AbstractC4446a;
import h3.C4571h;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import p2.C4835j;
import z7.C5273j;

/* loaded from: classes2.dex */
public final class LD implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f26075n;

    /* renamed from: u, reason: collision with root package name */
    public Object f26076u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f26077v;

    public /* synthetic */ LD(int i, Object obj, Object obj2) {
        this.f26075n = i;
        this.f26076u = obj;
        this.f26077v = obj2;
    }

    private final void a() {
        L3.y yVar = (L3.y) this.f26076u;
        Runnable runnable = (Runnable) this.f26077v;
        if (yVar.f1751k != null || yVar.f1747f) {
            if (!yVar.f1747f) {
                runnable.run();
                return;
            }
            if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
                Log.i("ServiceConnMgrImpl", "Waiting to bind to the service.");
            }
            ArrayList arrayList = yVar.f1745d;
            synchronized (arrayList) {
                arrayList.add(runnable);
            }
            return;
        }
        if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
            Log.i("ServiceConnMgrImpl", "Initiate binding to the service.");
        }
        ArrayList arrayList2 = yVar.f1745d;
        synchronized (arrayList2) {
            arrayList2.add(runnable);
        }
        L3.x xVar = new L3.x(yVar);
        yVar.f1750j = xVar;
        yVar.f1747f = true;
        if (yVar.f1743b.bindService(yVar.f1748g, xVar, 65)) {
            return;
        }
        if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
            Log.i("ServiceConnMgrImpl", "Failed to bind to the service.");
        }
        yVar.f1747f = false;
        ArrayList arrayList3 = yVar.f1745d;
        synchronized (arrayList3) {
            arrayList3.clear();
        }
    }

    private final void b() {
        S0.p pVar;
        K0.f fVar = ((R0.a) this.f26077v).f2691n.f1537f;
        String str = (String) this.f26076u;
        synchronized (fVar.f1506E) {
            try {
                K0.q qVar = (K0.q) fVar.f1512y.get(str);
                if (qVar == null) {
                    qVar = (K0.q) fVar.f1513z.get(str);
                }
                pVar = qVar != null ? qVar.f1556x : null;
            } finally {
            }
        }
        if (pVar == null || !pVar.b()) {
            return;
        }
        synchronized (((R0.a) this.f26077v).f2693v) {
            ((R0.a) this.f26077v).f2696y.put(com.bumptech.glide.e.c(pVar), pVar);
            ((R0.a) this.f26077v).f2697z.add(pVar);
            R0.a aVar = (R0.a) this.f26077v;
            aVar.f2689A.E(aVar.f2697z);
        }
    }

    private final void c() {
        try {
            f();
        } catch (Error e9) {
            synchronized (((S3.j) this.f26077v).f2882u) {
                ((S3.j) this.f26077v).f2883v = 1;
                throw e9;
            }
        }
    }

    private final void d() {
        try {
            ((Runnable) this.f26077v).run();
            synchronized (((T0.l) this.f26076u).f3044u) {
                ((T0.l) this.f26076u).a();
            }
        } catch (Throwable th) {
            synchronized (((T0.l) this.f26076u).f3044u) {
                ((T0.l) this.f26076u).a();
                throw th;
            }
        }
    }

    private final void e() {
        Z2.e eVar = (Z2.e) this.f26076u;
        Context context = (Context) eVar.f4170u;
        String string = Z2.e.N(context).getString("app_set_id", null);
        long j6 = Z2.e.N((Context) eVar.f4170u).getLong("app_set_id_last_used_time", -1L);
        long j9 = j6 != -1 ? 33696000000L + j6 : -1L;
        j3.h hVar = (j3.h) this.f26077v;
        if (string == null || System.currentTimeMillis() > j9) {
            string = UUID.randomUUID().toString();
            try {
                if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putString("app_set_id", string).commit()) {
                    String valueOf = String.valueOf(context.getPackageName());
                    Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID generated for App ".concat(valueOf) : new String("Failed to store app set ID generated for App "));
                    throw new Z2.d("Failed to store the app set ID.");
                }
                Z2.e.O(context);
                if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putLong("app_set_id_creation_time", System.currentTimeMillis()).commit()) {
                    String valueOf2 = String.valueOf(context.getPackageName());
                    Log.e("AppSet", valueOf2.length() != 0 ? "Failed to store app set ID creation time for App ".concat(valueOf2) : new String("Failed to store app set ID creation time for App "));
                    throw new Z2.d("Failed to store the app set ID creation time.");
                }
            } catch (Z2.d e9) {
                hVar.a(e9);
                return;
            }
        } else {
            try {
                Z2.e.O(context);
            } catch (Z2.d e10) {
                hVar.a(e10);
                return;
            }
        }
        hVar.b(new I2.b(string, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        ((java.lang.Runnable) r10.f26076u).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        r10.f26076u = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        S3.j.f2880y.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.f26076u), (java.lang.Throwable) r3);
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
        boolean z3 = false;
        boolean z6 = false;
        while (true) {
            try {
                synchronized (((S3.j) this.f26077v).f2882u) {
                    if (!z3) {
                        S3.j jVar = (S3.j) this.f26077v;
                        if (jVar.f2883v != 4) {
                            jVar.f2884w++;
                            jVar.f2883v = 4;
                            z3 = true;
                        }
                    }
                    Runnable runnable = (Runnable) ((S3.j) this.f26077v).f2882u.poll();
                    this.f26076u = runnable;
                    if (runnable == null) {
                        ((S3.j) this.f26077v).f2883v = 1;
                    }
                }
                if (!z6) {
                    return;
                }
            } finally {
                if (z6) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable b9;
        C3213fu c3213fu;
        IInterface iInterface;
        InterfaceC0380j interfaceC0380j;
        InterfaceC0380j k9;
        Set set;
        int i = 0;
        switch (this.f26075n) {
            case 0:
                N3.a aVar = (N3.a) this.f26076u;
                boolean z3 = aVar instanceof AbstractC3019cE;
                KD kd = (KD) this.f26077v;
                if (z3 && (b9 = ((AbstractC3019cE) aVar).b()) != null) {
                    kd.w(b9);
                    return;
                }
                try {
                    kd.mo11n(QC.v(aVar));
                    return;
                } catch (ExecutionException e9) {
                    kd.w(e9.getCause());
                    return;
                } catch (Throwable th) {
                    kd.w(th);
                    return;
                }
            case 1:
                BinderC0278k binderC0278k = (BinderC0278k) this.f26076u;
                binderC0278k.getClass();
                C3959tn c3959tn = ((C3959tn[]) this.f26077v)[0];
                if (c3959tn != null) {
                    ND c9 = QC.c(c3959tn);
                    C3589mu c3589mu = binderC0278k.f376y;
                    synchronized (c3589mu) {
                        c3589mu.f32624a.addFirst(c9);
                    }
                    return;
                }
                return;
            case 2:
                C0268a c0268a = (C0268a) this.f26076u;
                Uri parse = Uri.parse((String) this.f26077v);
                try {
                    boolean booleanValue = ((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.vd)).booleanValue();
                    WebView webView = c0268a.f307b;
                    Context context = c0268a.f306a;
                    parse = (!booleanValue || (c3213fu = c0268a.f309d) == null) ? c0268a.f308c.b(parse, context, webView, null) : c3213fu.a(parse, context, webView, null);
                } catch (C3495l7 e10) {
                    int i6 = u2.z.f41319b;
                    v2.i.b("Failed to append the click signal to URL: ", e10);
                    C4835j.f39730C.f39740h.d("TaggingLibraryJsInterface.recordClick", e10);
                }
                c0268a.i.b(parse.toString(), null, null, null);
                return;
            case 3:
                ((C0289h) this.f26076u).f467n = this.f26077v;
                return;
            case 4:
                ((Application) this.f26076u).unregisterActivityLifecycleCallbacks((C0289h) this.f26077v);
                return;
            case 5:
                try {
                    Method method = AbstractC0290i.f476d;
                    Object obj = this.f26077v;
                    Object obj2 = this.f26076u;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        AbstractC0290i.f477e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e11) {
                    if (e11.getClass() == RuntimeException.class && e11.getMessage() != null && e11.getMessage().startsWith("Unable to stop")) {
                        throw e11;
                    }
                    return;
                } catch (Throwable th2) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th2);
                    return;
                }
            case 6:
                C0389g c0389g = (C0389g) this.f26077v;
                try {
                    c0389g.resumeWith(((N3.a) this.f26076u).get());
                    return;
                } catch (Throwable th3) {
                    Throwable cause = th3.getCause();
                    if (cause == null) {
                        cause = th3;
                    }
                    if (th3 instanceof CancellationException) {
                        c0389g.m(cause);
                        return;
                    } else {
                        c0389g.resumeWith(com.bumptech.glide.d.f(cause));
                        return;
                    }
                }
            case 7:
                U0.k kVar = (U0.k) this.f26076u;
                try {
                    kVar.j(((Worker) this.f26077v).getForegroundInfo());
                    return;
                } catch (Throwable th4) {
                    kVar.k(th4);
                    return;
                }
            case 8:
                if (((K0.q) this.f26077v).J.f3159n instanceof U0.a) {
                    return;
                }
                try {
                    ((U0.k) this.f26076u).get();
                    J0.s.d().a(K0.q.f1541L, "Starting work for " + ((K0.q) this.f26077v).f1556x.f2810c);
                    K0.q qVar = (K0.q) this.f26077v;
                    qVar.J.l(qVar.f1557y.startWork());
                    return;
                } catch (Throwable th5) {
                    ((K0.q) this.f26077v).J.k(th5);
                    return;
                }
            case 9:
                String str = (String) this.f26076u;
                K0.q qVar2 = (K0.q) this.f26077v;
                try {
                    try {
                        J0.q qVar3 = (J0.q) qVar2.J.get();
                        if (qVar3 == null) {
                            J0.s.d().b(K0.q.f1541L, qVar2.f1556x.f2810c + " returned a null result. Treating it as a failure.");
                        } else {
                            J0.s.d().a(K0.q.f1541L, qVar2.f1556x.f2810c + " returned a " + qVar3 + com.anythink.core.common.d.j.f12378z);
                            qVar2.f1542A = qVar3;
                        }
                    } finally {
                        qVar2.b();
                    }
                } catch (InterruptedException e12) {
                    e = e12;
                    J0.s.d().c(K0.q.f1541L, str + " failed because it threw an exception/error", e);
                } catch (CancellationException e13) {
                    J0.s d2 = J0.s.d();
                    String str2 = K0.q.f1541L;
                    String str3 = str + " was cancelled";
                    if (d2.f1405a <= 4) {
                        Log.i(str2, str3, e13);
                    }
                } catch (ExecutionException e14) {
                    e = e14;
                    J0.s.d().c(K0.q.f1541L, str + " failed because it threw an exception/error", e);
                }
                qVar2.b();
                return;
            case 10:
                F.b bVar = (F.b) ((I0.j) this.f26076u).f1264u;
                if (bVar != null) {
                    bVar.h((Typeface) this.f26077v);
                    return;
                }
                return;
            case 11:
                ((L.e) this.f26076u).accept(this.f26077v);
                return;
            case 12:
                J0.s d9 = J0.s.d();
                String str4 = L0.a.f1605d;
                StringBuilder sb = new StringBuilder("Scheduling work ");
                S0.p pVar = (S0.p) this.f26076u;
                sb.append(pVar.f2808a);
                d9.a(str4, sb.toString());
                ((L0.a) this.f26077v).f1606a.a(pVar);
                return;
            case 13:
                L2.k kVar2 = (L2.k) this.f26076u;
                IBinder iBinder = (IBinder) this.f26077v;
                synchronized (kVar2) {
                    if (iBinder == null) {
                        kVar2.a("Null service connection");
                    } else {
                        try {
                            kVar2.f1649v = new S0.l(iBinder);
                            kVar2.f1647n = 2;
                            ((ScheduledExecutorService) kVar2.f1652y.f1661c).execute(new L2.j(kVar2, i));
                        } catch (RemoteException e15) {
                            kVar2.a(e15.getMessage());
                        }
                    }
                }
                return;
            case 14:
                L2.k kVar3 = (L2.k) this.f26076u;
                int i9 = ((L2.l) this.f26077v).f1653a;
                synchronized (kVar3) {
                    L2.l lVar = (L2.l) kVar3.f1651x.get(i9);
                    if (lVar != null) {
                        Log.w("MessengerIpcClient", "Timing out request: " + i9);
                        kVar3.f1651x.remove(i9);
                        lVar.b(new L2.m("Timed out waiting for response", null));
                        kVar3.c();
                    }
                }
                return;
            case 15:
                Z2.e eVar = (Z2.e) this.f26076u;
                View view = (View) this.f26077v;
                Log.i("HsdpLoadingPanel", "hideLoading");
                try {
                    if (view.getParent() != null) {
                        ((WindowManager) eVar.f4171v).removeView(view);
                    }
                } catch (RuntimeException e16) {
                    Log.e("HsdpLoadingPanel", "Error removing view from WindowManager", e16);
                }
                eVar.f4172w = null;
                return;
            case 16:
                a();
                return;
            case 17:
                L3.x xVar = (L3.x) this.f26076u;
                L3.y yVar = xVar.f1741n;
                yVar.f1751k = (IInterface) yVar.f1749h.e((IBinder) this.f26077v);
                Log.i("ServiceConnMgrImpl", "notifyOnConnected");
                Iterator it = yVar.f1746e.iterator();
                while (it.hasNext()) {
                    ((L3.g) it.next()).getClass();
                    Log.i("HsdpClientImpl", "HSDP bound service connected");
                }
                if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
                    Log.i("ServiceConnMgrImpl", "linkToDeath");
                }
                try {
                    iInterface = yVar.f1751k;
                } catch (RemoteException e17) {
                    Log.e("ServiceConnMgrImpl", "linkToDeath failed", e17);
                }
                if (iInterface == null) {
                    throw null;
                }
                iInterface.asBinder().linkToDeath(yVar.i, 0);
                L3.y yVar2 = xVar.f1741n;
                yVar2.f1747f = false;
                synchronized (yVar2.f1745d) {
                    try {
                        Iterator it2 = yVar2.f1745d.iterator();
                        while (it2.hasNext()) {
                            ((Runnable) it2.next()).run();
                        }
                        yVar2.f1745d.clear();
                    } finally {
                    }
                }
                return;
            case 18:
                Bundle bundle = (Bundle) this.f26077v;
                L3.g gVar = (L3.g) this.f26076u;
                try {
                    K3.g gVar2 = (K3.g) gVar.f1693b.f1751k;
                    if (gVar2 == null) {
                        return;
                    }
                    BinderC0320f binderC0320f = gVar.f1695d;
                    K3.e eVar2 = (K3.e) gVar2;
                    Parcel w02 = eVar2.w0();
                    int i10 = AbstractC4446a.f37037a;
                    w02.writeInt(1);
                    bundle.writeToParcel(w02, 0);
                    if (binderC0320f == null) {
                        w02.writeStrongBinder(null);
                    } else {
                        w02.writeStrongBinder(binderC0320f);
                    }
                    eVar2.F0(w02, 4);
                    return;
                } catch (DeadObjectException e18) {
                    Log.e("HsdpClientImpl", "hsdpService is dead", e18);
                    return;
                } catch (RemoteException e19) {
                    Log.e("HsdpClientImpl", "Failed to call hsdpService.endSession", e19);
                    return;
                }
            case 19:
                O2.F f3 = (O2.F) this.f26077v;
                O2.D d10 = (O2.D) f3.f2185f.f2232C.get(f3.f2181b);
                if (d10 == null) {
                    return;
                }
                M2.b bVar2 = (M2.b) this.f26076u;
                if (!bVar2.b()) {
                    d10.l(bVar2, null);
                    return;
                }
                f3.f2184e = true;
                N2.c cVar = f3.f2180a;
                if (cVar.m()) {
                    if (!f3.f2184e || (interfaceC0380j = f3.f2182c) == null) {
                        return;
                    }
                    cVar.a(interfaceC0380j, f3.f2183d);
                    return;
                }
                try {
                    cVar.a(null, cVar.b());
                    return;
                } catch (SecurityException e20) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e20);
                    cVar.d("Failed to get service from broker.");
                    d10.l(new M2.b(10, null, null), null);
                    return;
                }
            case 20:
                C4571h c4571h = (C4571h) this.f26076u;
                M2.b bVar3 = c4571h.f38016u;
                boolean b10 = bVar3.b();
                O2.O o6 = (O2.O) this.f26077v;
                if (b10) {
                    P2.t tVar = c4571h.f38017v;
                    P2.w.h(tVar);
                    M2.b bVar4 = tVar.f2544v;
                    if (!bVar4.b()) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(bVar4)), new Exception());
                        o6.f2208z.b(bVar4);
                        o6.f2207y.h();
                        return;
                    }
                    O2.F f9 = o6.f2208z;
                    IBinder iBinder2 = tVar.f2543u;
                    if (iBinder2 == null) {
                        k9 = null;
                    } else {
                        int i11 = AbstractBinderC0371a.f2451u;
                        IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        k9 = queryLocalInterface instanceof InterfaceC0380j ? (InterfaceC0380j) queryLocalInterface : new P2.K(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 1);
                    }
                    f9.getClass();
                    if (k9 == null || (set = o6.f2205w) == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        f9.b(new M2.b(4, null, null));
                    } else {
                        f9.f2182c = k9;
                        f9.f2183d = set;
                        if (f9.f2184e) {
                            f9.f2180a.a(k9, set);
                        }
                    }
                } else {
                    o6.f2208z.b(bVar3);
                }
                o6.f2207y.h();
                return;
            case 21:
                b();
                return;
            case 22:
                c();
                return;
            case 23:
                ((C0389g) this.f26077v).B((S7.S) this.f26076u);
                return;
            case 24:
                d();
                return;
            case 25:
                if (((T0.p) this.f26077v).f3056n.f3159n instanceof U0.a) {
                    return;
                }
                try {
                    J0.j jVar = (J0.j) ((U0.k) this.f26076u).get();
                    if (jVar == null) {
                        throw new IllegalStateException("Worker was marked important (" + ((T0.p) this.f26077v).f3058v.f2810c + ") but did not provide ForegroundInfo");
                    }
                    J0.s.d().a(T0.p.f3055z, "Updating notification for " + ((T0.p) this.f26077v).f3058v.f2810c);
                    T0.p pVar2 = (T0.p) this.f26077v;
                    U0.k kVar4 = pVar2.f3056n;
                    T0.q qVar4 = pVar2.f3060x;
                    Context context2 = pVar2.f3057u;
                    UUID id = pVar2.f3059w.getId();
                    qVar4.getClass();
                    U0.k kVar5 = new U0.k();
                    qVar4.f3062a.i(new L3.l(qVar4, kVar5, id, jVar, context2));
                    kVar4.l(kVar5);
                    return;
                } catch (Throwable th6) {
                    ((T0.p) this.f26077v).f3056n.k(th6);
                    return;
                }
            case 26:
                ((C0389g) this.f26076u).B((T7.e) this.f26077v);
                return;
            case 27:
                break;
            case 28:
                e();
                return;
            default:
                B1.y a9 = B1.y.a();
                a9.getClass();
                N1.p.a();
                a9.f169d.set(true);
                ((com.bumptech.glide.manager.d) this.f26077v).f23451u.f23453u = true;
                ((com.bumptech.glide.manager.d) this.f26077v).f23450n.getViewTreeObserver().removeOnDrawListener((com.bumptech.glide.manager.d) this.f26076u);
                ((com.bumptech.glide.manager.d) this.f26077v).f23451u.f23452n.clear();
                return;
        }
        while (true) {
            try {
                ((Runnable) this.f26076u).run();
            } catch (Throwable th7) {
                AbstractC0406y.l(th7, C5273j.f42269n);
            }
            X7.i iVar = (X7.i) this.f26077v;
            Runnable B9 = iVar.B();
            if (B9 == null) {
                return;
            }
            this.f26076u = B9;
            i++;
            if (i >= 16) {
                AbstractC0402u abstractC0402u = iVar.f3839v;
                if (abstractC0402u.z()) {
                    abstractC0402u.p(iVar, this);
                    return;
                }
            }
        }
    }

    public String toString() {
        switch (this.f26075n) {
            case 0:
                C3481ku c3481ku = new C3481ku(LD.class.getSimpleName(), 18);
                S0.e eVar = new S0.e(22, false);
                ((S0.e) c3481ku.f31665w).f2782v = eVar;
                c3481ku.f31665w = eVar;
                eVar.f2781u = (KD) this.f26077v;
                return c3481ku.toString();
            case 22:
                Runnable runnable = (Runnable) this.f26076u;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i = ((S3.j) this.f26077v).f2883v;
                sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ LD(Object obj, Object obj2, int i, boolean z3) {
        this.f26075n = i;
        this.f26077v = obj;
        this.f26076u = obj2;
    }

    public LD(S3.j jVar) {
        this.f26075n = 22;
        this.f26077v = jVar;
    }
}

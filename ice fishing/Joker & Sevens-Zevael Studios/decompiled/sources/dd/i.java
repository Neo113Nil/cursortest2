package dd;

import android.content.Context;
import android.graphics.Typeface;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.appcompat.widget.ActionMenuView;
import androidx.work.Worker;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import o6.b0;
import o6.d0;
import o6.l0;
import p6.e0;
import yc.u0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1859g;

    /* renamed from: h, reason: collision with root package name */
    public Object f1860h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f1861i;

    public /* synthetic */ i(int i10, Object obj, Object obj2) {
        this.f1859g = i10;
        this.f1861i = obj;
        this.f1860h = obj2;
    }

    private final void a() {
        l6.j jVar = (l6.j) this.f1860h;
        int i10 = ((l6.k) this.f1861i).f4192a;
        synchronized (jVar) {
            l6.k kVar = (l6.k) jVar.f4190e.get(i10);
            if (kVar != null) {
                Log.w("MessengerIpcClient", "Timing out request: " + i10);
                jVar.f4190e.remove(i10);
                kVar.b(new d8.r("Timed out waiting for response", null));
                jVar.c();
            }
        }
    }

    private final void b() {
        try {
            e();
        } catch (Error e10) {
            synchronized (((m7.k) this.f1861i).f4963h) {
                ((m7.k) this.f1861i).f4964i = 1;
                throw e10;
            }
        }
    }

    private final void c() {
        x4.p pVar;
        p4.e eVar = ((w4.b) this.f1861i).f7648g.f5498f;
        String str = (String) this.f1860h;
        synchronized (eVar.f5474r) {
            try {
                p4.o oVar = (p4.o) eVar.f5468l.get(str);
                if (oVar == null) {
                    oVar = (p4.o) eVar.f5469m.get(str);
                }
                pVar = oVar != null ? oVar.f5508k : null;
            } finally {
            }
        }
        if (pVar == null || !pVar.b()) {
            return;
        }
        synchronized (((w4.b) this.f1861i).f7650i) {
            ((w4.b) this.f1861i).f7653l.put(ud.g.h(pVar), pVar);
            ((w4.b) this.f1861i).f7654m.add(pVar);
            w4.b bVar = (w4.b) this.f1861i;
            bVar.f7655n.G(bVar.f7654m);
        }
    }

    private final void d() {
        try {
            ((Runnable) this.f1860h).run();
            synchronized (((y4.l) this.f1861i).f8754j) {
                ((y4.l) this.f1861i).a();
            }
        } catch (Throwable th) {
            synchronized (((y4.l) this.f1861i).f8754j) {
                ((y4.l) this.f1861i).a();
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        ((java.lang.Runnable) r10.f1860h).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        r10.f1860h = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        m7.k.f4961l.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.f1860h), (java.lang.Throwable) r3);
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
    public void e() {
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            try {
                synchronized (((m7.k) this.f1861i).f4963h) {
                    if (!z10) {
                        m7.k kVar = (m7.k) this.f1861i;
                        if (kVar.f4964i != 4) {
                            kVar.f4965j++;
                            kVar.f4964i = 4;
                            z10 = true;
                        }
                    }
                    Runnable runnable = (Runnable) ((m7.k) this.f1861i).f4963h.poll();
                    this.f1860h = runnable;
                    if (runnable == null) {
                        ((m7.k) this.f1861i).f4964i = 1;
                    }
                }
                if (!z11) {
                    return;
                }
            } finally {
                if (z11) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        p6.g gVar;
        int i10 = 0;
        p6.g gVar2 = null;
        switch (this.f1859g) {
            case 0:
                j jVar = (j) this.f1861i;
                yc.u uVar = jVar.f1863i;
                while (true) {
                    try {
                        ((Runnable) this.f1860h).run();
                    } catch (Throwable th) {
                        yc.a0.m(fc.j.f2348g, th);
                    }
                    Runnable z10 = jVar.z();
                    if (z10 == null) {
                        return;
                    }
                    this.f1860h = z10;
                    i10++;
                    if (i10 >= 16 && uVar.y()) {
                        uVar.w(jVar, this);
                        return;
                    }
                }
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                f8.c cVar = (f8.c) this.f1860h;
                Typeface typeface = (Typeface) this.f1861i;
                m.s sVar = (m.s) cVar.f2340h;
                if (sVar != null) {
                    sVar.c(typeface);
                    return;
                }
                return;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                ((e3.g) this.f1860h).accept(this.f1861i);
                return;
            case 3:
                if (((g7.o) this.f1860h).f2555d) {
                    ((g7.j) this.f1861i).f2543j.m();
                    return;
                }
                try {
                    ((g7.j) this.f1861i).f2543j.l(((g7.j) this.f1861i).f2542i.b((g7.o) this.f1860h));
                    return;
                } catch (g7.f e10) {
                    if (e10.getCause() instanceof Exception) {
                        ((g7.j) this.f1861i).f2543j.k((Exception) e10.getCause());
                        return;
                    } else {
                        ((g7.j) this.f1861i).f2543j.k(e10);
                        return;
                    }
                } catch (Exception e11) {
                    ((g7.j) this.f1861i).f2543j.k(e11);
                    return;
                }
            case 4:
                g7.j jVar2 = (g7.j) this.f1861i;
                g7.o oVar = jVar2.f2543j;
                try {
                    g7.o oVar2 = (g7.o) jVar2.f2542i.b((g7.o) this.f1860h);
                    if (oVar2 == null) {
                        jVar2.j(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    g7.n nVar = g7.i.f2539b;
                    oVar2.c(nVar, jVar2);
                    oVar2.b(nVar, jVar2);
                    oVar2.f2553b.b(new g7.k((Executor) nVar, (g7.b) jVar2));
                    oVar2.o();
                    return;
                } catch (g7.f e12) {
                    if (e12.getCause() instanceof Exception) {
                        oVar.k((Exception) e12.getCause());
                        return;
                    } else {
                        oVar.k(e12);
                        return;
                    }
                } catch (Exception e13) {
                    oVar.k(e13);
                    return;
                }
            case 5:
                synchronized (((g7.k) this.f1861i).f2546i) {
                    ((g7.c) ((g7.k) this.f1861i).f2547j).k((g7.o) this.f1860h);
                }
                return;
            case 6:
                synchronized (((g7.k) this.f1861i).f2546i) {
                    g7.d dVar = (g7.d) ((g7.k) this.f1861i).f2547j;
                    Exception f10 = ((g7.o) this.f1860h).f();
                    p6.u.g(f10);
                    dVar.j(f10);
                }
                return;
            case 7:
                synchronized (((g7.k) this.f1861i).f2546i) {
                    ((g7.e) ((g7.k) this.f1861i).f2547j).d(((g7.o) this.f1860h).g());
                }
                return;
            case 8:
                g7.k kVar = (g7.k) this.f1861i;
                try {
                    g7.o c3 = ((g7.g) kVar.f2546i).c(((g7.o) this.f1860h).g());
                    g7.n nVar2 = g7.i.f2539b;
                    c3.c(nVar2, kVar);
                    c3.b(nVar2, kVar);
                    c3.f2553b.b(new g7.k((Executor) nVar2, (g7.b) kVar));
                    c3.o();
                    return;
                } catch (g7.f e14) {
                    if (e14.getCause() instanceof Exception) {
                        kVar.j((Exception) e14.getCause());
                        return;
                    } else {
                        kVar.j(e14);
                        return;
                    }
                } catch (CancellationException unused) {
                    kVar.b();
                    return;
                } catch (Exception e15) {
                    kVar.j(e15);
                    return;
                }
            case 9:
                g7.o oVar3 = (g7.o) this.f1860h;
                try {
                    oVar3.l(((Callable) this.f1861i).call());
                    return;
                } catch (Exception e16) {
                    oVar3.k(e16);
                    return;
                } catch (Throwable th2) {
                    oVar3.k(new RuntimeException(th2));
                    return;
                }
            case com.onesignal.core.internal.config.d.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                l6.j jVar3 = (l6.j) this.f1860h;
                IBinder iBinder = (IBinder) this.f1861i;
                synchronized (jVar3) {
                    if (iBinder == null) {
                        jVar3.a("Null service connection");
                    } else {
                        try {
                            jVar3.f4188c = new x4.c(iBinder);
                            jVar3.f4186a = 2;
                            ((ScheduledExecutorService) jVar3.f4191f.f4200c).execute(new l6.h(jVar3, i10));
                        } catch (RemoteException e17) {
                            jVar3.a(e17.getMessage());
                        }
                    }
                }
                return;
            case 11:
                a();
                return;
            case 12:
                m.f fVar = (m.f) this.f1860h;
                m.i iVar = (m.i) this.f1861i;
                ActionMenuView actionMenuView = iVar.f4318m;
                if (actionMenuView != null && actionMenuView.getWindowToken() != null) {
                    if (!fVar.b()) {
                        if (fVar.f3742e != null) {
                            fVar.d(0, 0, false, false);
                        }
                    }
                    iVar.f4329x = fVar;
                }
                iVar.f4331z = null;
                return;
            case 13:
                b();
                return;
            case 14:
                yc.g gVar3 = (yc.g) this.f1860h;
                try {
                    gVar3.resumeWith(((h7.a) this.f1861i).get());
                    return;
                } catch (Throwable th3) {
                    Throwable cause = th3.getCause();
                    if (cause == null) {
                        cause = th3;
                    }
                    if (th3 instanceof CancellationException) {
                        gVar3.n(cause);
                        return;
                    } else {
                        gVar3.resumeWith(v6.a.s(cause));
                        return;
                    }
                }
            case 15:
                try {
                    ((Worker) this.f1861i).getClass();
                    throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
                } catch (Throwable th4) {
                    ((z4.j) this.f1860h).j(th4);
                    return;
                }
            case 16:
                m6.b bVar = (m6.b) this.f1860h;
                d0 d0Var = (d0) this.f1861i;
                n6.a aVar = d0Var.f5269a;
                b0 b0Var = (b0) d0Var.f5274f.f5264j.get(d0Var.f5270b);
                if (b0Var == null) {
                    return;
                }
                if (!bVar.b()) {
                    b0Var.l(bVar, null);
                    return;
                }
                d0Var.f5273e = true;
                if (aVar.n()) {
                    if (!d0Var.f5273e || (gVar = d0Var.f5271c) == null) {
                        return;
                    }
                    aVar.k(gVar, d0Var.f5272d);
                    return;
                }
                try {
                    aVar.k(null, aVar.b());
                    return;
                } catch (SecurityException e18) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e18);
                    aVar.c("Failed to get service from broker.");
                    b0Var.l(new m6.b(10), null);
                    return;
                }
            case 17:
                l0 l0Var = (l0) this.f1861i;
                e7.h hVar = (e7.h) this.f1860h;
                m6.b bVar2 = hVar.f2129h;
                if (bVar2.b()) {
                    p6.q qVar = hVar.f2130i;
                    p6.u.g(qVar);
                    m6.b bVar3 = qVar.f5633i;
                    if (!bVar3.b()) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(bVar3)), new Exception());
                        l0Var.f5303j.b(bVar3);
                        l0Var.f5302i.m();
                        return;
                    }
                    d0 d0Var2 = l0Var.f5303j;
                    IBinder iBinder2 = qVar.f5632h;
                    if (iBinder2 != null) {
                        int i11 = p6.a.f5538d;
                        IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        gVar2 = queryLocalInterface instanceof p6.g ? (p6.g) queryLocalInterface : new e0(iBinder2);
                    }
                    Set set = l0Var.f5300g;
                    d0Var2.getClass();
                    if (gVar2 == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        d0Var2.b(new m6.b(4));
                    } else {
                        d0Var2.f5271c = gVar2;
                        d0Var2.f5272d = set;
                        if (d0Var2.f5273e) {
                            d0Var2.f5269a.k(gVar2, set);
                        }
                    }
                } else {
                    l0Var.f5303j.b(bVar2);
                }
                l0Var.f5302i.m();
                return;
            case 18:
                if (((p4.o) this.f1861i).f5520w.f9129g instanceof z4.a) {
                    return;
                }
                try {
                    ((h7.a) this.f1860h).get();
                    o4.o.d().a(p4.o.f5503y, "Starting work for " + ((p4.o) this.f1861i).f5508k.f8324c);
                    p4.o oVar4 = (p4.o) this.f1861i;
                    oVar4.f5520w.k(oVar4.f5509l.startWork());
                    return;
                } catch (Throwable th5) {
                    ((p4.o) this.f1861i).f5520w.j(th5);
                    return;
                }
            case 19:
                String str = (String) this.f1860h;
                p4.o oVar5 = (p4.o) this.f1861i;
                x4.p pVar = oVar5.f5508k;
                try {
                    try {
                        o4.m mVar = (o4.m) oVar5.f5520w.get();
                        if (mVar == null) {
                            o4.o.d().b(p4.o.f5503y, pVar.f8324c + " returned a null result. Treating it as a failure.");
                        } else {
                            o4.o.d().a(p4.o.f5503y, pVar.f8324c + " returned a " + mVar + ".");
                            oVar5.f5511n = mVar;
                        }
                    } catch (Throwable th6) {
                        oVar5.b();
                        throw th6;
                    }
                } catch (InterruptedException e19) {
                    e = e19;
                    o4.o.d().c(p4.o.f5503y, str + " failed because it threw an exception/error", e);
                } catch (CancellationException e20) {
                    o4.o d10 = o4.o.d();
                    String str2 = p4.o.f5503y;
                    String str3 = str + " was cancelled";
                    if (d10.f5218a <= 4) {
                        Log.i(str2, str3, e20);
                    }
                } catch (ExecutionException e21) {
                    e = e21;
                    o4.o.d().c(p4.o.f5503y, str + " failed because it threw an exception/error", e);
                }
                oVar5.b();
                return;
            case 20:
                o4.o d11 = o4.o.d();
                String str4 = q4.a.f5803d;
                StringBuilder sb = new StringBuilder("Scheduling work ");
                x4.p pVar2 = (x4.p) this.f1860h;
                sb.append(pVar2.f8322a);
                d11.a(str4, sb.toString());
                ((q4.a) this.f1861i).f5804a.a(pVar2);
                return;
            case 21:
                c();
                return;
            case 22:
                d();
                return;
            case 23:
                if (((y4.p) this.f1861i).f8763g.f9129g instanceof z4.a) {
                    return;
                }
                try {
                    o4.g gVar4 = (o4.g) ((z4.j) this.f1860h).get();
                    if (gVar4 == null) {
                        throw new IllegalStateException("Worker was marked important (" + ((y4.p) this.f1861i).f8765i.f8324c + ") but did not provide ForegroundInfo");
                    }
                    o4.o.d().a(y4.p.f8762m, "Updating notification for " + ((y4.p) this.f1861i).f8765i.f8324c);
                    y4.p pVar3 = (y4.p) this.f1861i;
                    z4.j jVar4 = pVar3.f8763g;
                    y4.r rVar = pVar3.f8767k;
                    Context context = pVar3.f8764h;
                    UUID id2 = pVar3.f8766j.getId();
                    rVar.getClass();
                    z4.j jVar5 = new z4.j();
                    rVar.f8774a.a(new y4.q(rVar, jVar5, id2, gVar4, context));
                    jVar4.k(jVar5);
                    return;
                } catch (Throwable th7) {
                    ((y4.p) this.f1861i).f8763g.j(th7);
                    return;
                }
            case 24:
                ((yc.g) this.f1861i).C((u0) this.f1860h);
                return;
            default:
                ((yc.g) this.f1860h).C((zc.d) this.f1861i);
                return;
        }
    }

    public String toString() {
        switch (this.f1859g) {
            case 13:
                Runnable runnable = (Runnable) this.f1860h;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i10 = ((m7.k) this.f1861i).f4964i;
                sb.append(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ i(int i10, Object obj, Object obj2, boolean z10) {
        this.f1859g = i10;
        this.f1860h = obj;
        this.f1861i = obj2;
    }

    public i(m7.k kVar) {
        this.f1859g = 13;
        this.f1861i = kVar;
    }
}

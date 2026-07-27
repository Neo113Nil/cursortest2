package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import android.util.Log;
import com.bumptech.glide.manager.q;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import s1.InterfaceC4970e;

/* loaded from: classes.dex */
public final class p implements ComponentCallbacks2, com.bumptech.glide.manager.h {

    /* renamed from: D, reason: collision with root package name */
    public static final J1.e f23487D;

    /* renamed from: A, reason: collision with root package name */
    public final com.bumptech.glide.manager.b f23488A;

    /* renamed from: B, reason: collision with root package name */
    public final CopyOnWriteArrayList f23489B;

    /* renamed from: C, reason: collision with root package name */
    public final J1.e f23490C;

    /* renamed from: n, reason: collision with root package name */
    public final c f23491n;

    /* renamed from: u, reason: collision with root package name */
    public final Context f23492u;

    /* renamed from: v, reason: collision with root package name */
    public final com.bumptech.glide.manager.g f23493v;

    /* renamed from: w, reason: collision with root package name */
    public final com.bumptech.glide.manager.p f23494w;

    /* renamed from: x, reason: collision with root package name */
    public final com.bumptech.glide.manager.l f23495x;

    /* renamed from: y, reason: collision with root package name */
    public final q f23496y;

    /* renamed from: z, reason: collision with root package name */
    public final G0.c f23497z;

    static {
        J1.e eVar = (J1.e) new J1.e().i(Bitmap.class);
        eVar.f1417F = true;
        f23487D = eVar;
        ((J1.e) new J1.e().i(F1.c.class)).f1417F = true;
    }

    public p(c cVar, com.bumptech.glide.manager.g gVar, com.bumptech.glide.manager.l lVar, Context context) {
        J1.e eVar;
        com.bumptech.glide.manager.p pVar = new com.bumptech.glide.manager.p(2);
        a4.e eVar2 = cVar.f23377y;
        this.f23496y = new q();
        G0.c cVar2 = new G0.c(20, this);
        this.f23497z = cVar2;
        this.f23491n = cVar;
        this.f23493v = gVar;
        this.f23495x = lVar;
        this.f23494w = pVar;
        this.f23492u = context;
        Context applicationContext = context.getApplicationContext();
        o oVar = new o(this, pVar);
        eVar2.getClass();
        boolean z3 = E.e.a(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z3 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        com.bumptech.glide.manager.b cVar3 = z3 ? new com.bumptech.glide.manager.c(applicationContext, oVar) : new com.bumptech.glide.manager.j();
        this.f23488A = cVar3;
        synchronized (cVar.f23378z) {
            if (cVar.f23378z.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            cVar.f23378z.add(this);
        }
        char[] cArr = N1.p.f1932a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            gVar.c(this);
        } else {
            N1.p.f().post(cVar2);
        }
        gVar.c(cVar3);
        this.f23489B = new CopyOnWriteArrayList(cVar.f23374v.f23396e);
        i iVar = cVar.f23374v;
        synchronized (iVar) {
            try {
                if (iVar.f23400j == null) {
                    iVar.f23395d.getClass();
                    J1.e eVar3 = new J1.e();
                    eVar3.f1417F = true;
                    iVar.f23400j = eVar3;
                }
                eVar = iVar.f23400j;
            } finally {
            }
        }
        synchronized (this) {
            J1.e eVar4 = (J1.e) eVar.h();
            if (eVar4.f1417F && !eVar4.f1419H) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            eVar4.f1419H = true;
            eVar4.f1417F = true;
            this.f23490C = eVar4;
        }
    }

    public final void i(K1.c cVar) {
        if (cVar == null) {
            return;
        }
        boolean n9 = n(cVar);
        J1.c g4 = cVar.g();
        if (n9) {
            return;
        }
        c cVar2 = this.f23491n;
        synchronized (cVar2.f23378z) {
            try {
                Iterator it = cVar2.f23378z.iterator();
                while (it.hasNext()) {
                    if (((p) it.next()).n(cVar)) {
                        return;
                    }
                }
                if (g4 != null) {
                    cVar.b(null);
                    g4.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void j() {
        try {
            Iterator it = N1.p.e(this.f23496y.f23472n).iterator();
            while (it.hasNext()) {
                i((K1.c) it.next());
            }
            this.f23496y.f23472n.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final n k(Uri uri) {
        PackageInfo packageInfo;
        n nVar = new n(this.f23491n, this, Drawable.class, this.f23492u);
        n F8 = nVar.F(uri);
        if (uri == null || !"android.resource".equals(uri.getScheme())) {
            return F8;
        }
        Context context = nVar.f23473K;
        n nVar2 = (n) F8.v(context.getTheme());
        ConcurrentHashMap concurrentHashMap = M1.b.f1823a;
        String packageName = context.getPackageName();
        ConcurrentHashMap concurrentHashMap2 = M1.b.f1823a;
        InterfaceC4970e interfaceC4970e = (InterfaceC4970e) concurrentHashMap2.get(packageName);
        if (interfaceC4970e == null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e9) {
                Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e9);
                packageInfo = null;
            }
            M1.d dVar = new M1.d(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
            InterfaceC4970e interfaceC4970e2 = (InterfaceC4970e) concurrentHashMap2.putIfAbsent(packageName, dVar);
            interfaceC4970e = interfaceC4970e2 == null ? dVar : interfaceC4970e2;
        }
        return (n) nVar2.t(new M1.a(context.getResources().getConfiguration().uiMode & 48, interfaceC4970e));
    }

    public final synchronized void l() {
        com.bumptech.glide.manager.p pVar = this.f23494w;
        pVar.f23469u = true;
        Iterator it = N1.p.e((Set) pVar.f23470v).iterator();
        while (it.hasNext()) {
            J1.c cVar = (J1.c) it.next();
            if (cVar.isRunning()) {
                cVar.pause();
                ((HashSet) pVar.f23471w).add(cVar);
            }
        }
    }

    public final synchronized void m() {
        com.bumptech.glide.manager.p pVar = this.f23494w;
        pVar.f23469u = false;
        Iterator it = N1.p.e((Set) pVar.f23470v).iterator();
        while (it.hasNext()) {
            J1.c cVar = (J1.c) it.next();
            if (!cVar.j() && !cVar.isRunning()) {
                cVar.i();
            }
        }
        ((HashSet) pVar.f23471w).clear();
    }

    public final synchronized boolean n(K1.c cVar) {
        J1.c g4 = cVar.g();
        if (g4 == null) {
            return true;
        }
        if (!this.f23494w.a(g4)) {
            return false;
        }
        this.f23496y.f23472n.remove(cVar);
        cVar.b(null);
        return true;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // com.bumptech.glide.manager.h
    public final synchronized void onDestroy() {
        this.f23496y.onDestroy();
        j();
        com.bumptech.glide.manager.p pVar = this.f23494w;
        Iterator it = N1.p.e((Set) pVar.f23470v).iterator();
        while (it.hasNext()) {
            pVar.a((J1.c) it.next());
        }
        ((HashSet) pVar.f23471w).clear();
        this.f23493v.g(this);
        this.f23493v.g(this.f23488A);
        N1.p.f().removeCallbacks(this.f23497z);
        c cVar = this.f23491n;
        synchronized (cVar.f23378z) {
            if (!cVar.f23378z.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            cVar.f23378z.remove(this);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // com.bumptech.glide.manager.h
    public final synchronized void onStart() {
        m();
        this.f23496y.onStart();
    }

    @Override // com.bumptech.glide.manager.h
    public final synchronized void onStop() {
        this.f23496y.onStop();
        l();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f23494w + ", treeNode=" + this.f23495x + "}";
    }
}

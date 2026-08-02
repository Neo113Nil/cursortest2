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
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import u1.InterfaceC5066e;

/* loaded from: classes.dex */
public final class p implements ComponentCallbacks2, com.bumptech.glide.manager.h {

    /* renamed from: D, reason: collision with root package name */
    public static final L1.e f24272D;

    /* renamed from: A, reason: collision with root package name */
    public final com.bumptech.glide.manager.b f24273A;

    /* renamed from: B, reason: collision with root package name */
    public final CopyOnWriteArrayList f24274B;

    /* renamed from: C, reason: collision with root package name */
    public final L1.e f24275C;

    /* renamed from: n, reason: collision with root package name */
    public final c f24276n;

    /* renamed from: u, reason: collision with root package name */
    public final Context f24277u;

    /* renamed from: v, reason: collision with root package name */
    public final com.bumptech.glide.manager.g f24278v;

    /* renamed from: w, reason: collision with root package name */
    public final com.bumptech.glide.manager.o f24279w;

    /* renamed from: x, reason: collision with root package name */
    public final com.bumptech.glide.manager.l f24280x;

    /* renamed from: y, reason: collision with root package name */
    public final com.bumptech.glide.manager.p f24281y;

    /* renamed from: z, reason: collision with root package name */
    public final G0.c f24282z;

    static {
        L1.e eVar = (L1.e) new L1.e().i(Bitmap.class);
        eVar.f1733F = true;
        f24272D = eVar;
        ((L1.e) new L1.e().i(H1.c.class)).f1733F = true;
    }

    public p(c cVar, com.bumptech.glide.manager.g gVar, com.bumptech.glide.manager.l lVar, Context context) {
        L1.e eVar;
        com.bumptech.glide.manager.o oVar = new com.bumptech.glide.manager.o(2);
        O2.i iVar = cVar.f24164y;
        this.f24281y = new com.bumptech.glide.manager.p();
        G0.c cVar2 = new G0.c(22, this);
        this.f24282z = cVar2;
        this.f24276n = cVar;
        this.f24278v = gVar;
        this.f24280x = lVar;
        this.f24279w = oVar;
        this.f24277u = context;
        Context applicationContext = context.getApplicationContext();
        o oVar2 = new o(this, oVar);
        iVar.getClass();
        boolean z6 = E.e.a(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z6 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        com.bumptech.glide.manager.b cVar3 = z6 ? new com.bumptech.glide.manager.c(applicationContext, oVar2) : new com.bumptech.glide.manager.j();
        this.f24273A = cVar3;
        synchronized (cVar.f24165z) {
            if (cVar.f24165z.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            cVar.f24165z.add(this);
        }
        char[] cArr = P1.p.f2376a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            gVar.h(this);
        } else {
            P1.p.f().post(cVar2);
        }
        gVar.h(cVar3);
        this.f24274B = new CopyOnWriteArrayList(cVar.f24161v.f24183e);
        i iVar2 = cVar.f24161v;
        synchronized (iVar2) {
            try {
                if (iVar2.f24187j == null) {
                    iVar2.f24182d.getClass();
                    L1.e eVar2 = new L1.e();
                    eVar2.f1733F = true;
                    iVar2.f24187j = eVar2;
                }
                eVar = iVar2.f24187j;
            } finally {
            }
        }
        synchronized (this) {
            L1.e eVar3 = (L1.e) eVar.clone();
            if (eVar3.f1733F && !eVar3.f1735H) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            eVar3.f1735H = true;
            eVar3.f1733F = true;
            this.f24275C = eVar3;
        }
    }

    public final void i(M1.c cVar) {
        if (cVar == null) {
            return;
        }
        boolean n9 = n(cVar);
        L1.c g9 = cVar.g();
        if (n9) {
            return;
        }
        c cVar2 = this.f24276n;
        synchronized (cVar2.f24165z) {
            try {
                Iterator it = cVar2.f24165z.iterator();
                while (it.hasNext()) {
                    if (((p) it.next()).n(cVar)) {
                        return;
                    }
                }
                if (g9 != null) {
                    cVar.c(null);
                    g9.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void j() {
        try {
            Iterator it = P1.p.e(this.f24281y.f24257n).iterator();
            while (it.hasNext()) {
                i((M1.c) it.next());
            }
            this.f24281y.f24257n.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final n k(Uri uri) {
        PackageInfo packageInfo;
        n nVar = new n(this.f24276n, this, Drawable.class, this.f24277u);
        n F8 = nVar.F(uri);
        if (uri == null || !"android.resource".equals(uri.getScheme())) {
            return F8;
        }
        Context context = nVar.f24258K;
        n nVar2 = (n) F8.v(context.getTheme());
        ConcurrentHashMap concurrentHashMap = O1.b.f2249a;
        String packageName = context.getPackageName();
        ConcurrentHashMap concurrentHashMap2 = O1.b.f2249a;
        InterfaceC5066e interfaceC5066e = (InterfaceC5066e) concurrentHashMap2.get(packageName);
        if (interfaceC5066e == null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e9) {
                Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e9);
                packageInfo = null;
            }
            O1.d dVar = new O1.d(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
            InterfaceC5066e interfaceC5066e2 = (InterfaceC5066e) concurrentHashMap2.putIfAbsent(packageName, dVar);
            interfaceC5066e = interfaceC5066e2 == null ? dVar : interfaceC5066e2;
        }
        return (n) nVar2.t(new O1.a(context.getResources().getConfiguration().uiMode & 48, interfaceC5066e));
    }

    public final synchronized void l() {
        com.bumptech.glide.manager.o oVar = this.f24279w;
        oVar.f24254u = true;
        Iterator it = P1.p.e((Set) oVar.f24255v).iterator();
        while (it.hasNext()) {
            L1.c cVar = (L1.c) it.next();
            if (cVar.isRunning()) {
                cVar.pause();
                ((HashSet) oVar.f24256w).add(cVar);
            }
        }
    }

    public final synchronized void m() {
        com.bumptech.glide.manager.o oVar = this.f24279w;
        oVar.f24254u = false;
        Iterator it = P1.p.e((Set) oVar.f24255v).iterator();
        while (it.hasNext()) {
            L1.c cVar = (L1.c) it.next();
            if (!cVar.j() && !cVar.isRunning()) {
                cVar.i();
            }
        }
        ((HashSet) oVar.f24256w).clear();
    }

    public final synchronized boolean n(M1.c cVar) {
        L1.c g9 = cVar.g();
        if (g9 == null) {
            return true;
        }
        if (!this.f24279w.a(g9)) {
            return false;
        }
        this.f24281y.f24257n.remove(cVar);
        cVar.c(null);
        return true;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // com.bumptech.glide.manager.h
    public final synchronized void onDestroy() {
        this.f24281y.onDestroy();
        j();
        com.bumptech.glide.manager.o oVar = this.f24279w;
        Iterator it = P1.p.e((Set) oVar.f24255v).iterator();
        while (it.hasNext()) {
            oVar.a((L1.c) it.next());
        }
        ((HashSet) oVar.f24256w).clear();
        this.f24278v.i(this);
        this.f24278v.i(this.f24273A);
        P1.p.f().removeCallbacks(this.f24282z);
        c cVar = this.f24276n;
        synchronized (cVar.f24165z) {
            if (!cVar.f24165z.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            cVar.f24165z.remove(this);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // com.bumptech.glide.manager.h
    public final synchronized void onStart() {
        m();
        this.f24281y.onStart();
    }

    @Override // com.bumptech.glide.manager.h
    public final synchronized void onStop() {
        this.f24281y.onStop();
        l();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f24279w + ", treeNode=" + this.f24280x + "}";
    }
}

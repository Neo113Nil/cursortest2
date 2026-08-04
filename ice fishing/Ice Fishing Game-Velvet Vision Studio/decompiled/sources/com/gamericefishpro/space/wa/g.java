package com.gamericefishpro.space.wa;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.os.UserManager;
import android.util.Base64;
import android.util.Log;
import com.gamericefishpro.space.bb.i;
import com.gamericefishpro.space.bb.q;
import com.gamericefishpro.space.cb.k;
import com.gamericefishpro.space.u6.s;
import com.gamericefishpro.space.v8.c0;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final Object j = new Object();
    public static final com.gamericefishpro.space.t.e k = new com.gamericefishpro.space.t.e(0);
    public final Context a;
    public final String b;
    public final h c;
    public final i d;
    public final q g;
    public final com.gamericefishpro.space.nb.a h;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    public g(Context context, h hVar, String str) {
        ?? arrayList;
        int i = 0;
        new CopyOnWriteArrayList();
        this.a = context;
        c0.d(str);
        this.b = str;
        this.c = hVar;
        a aVar = FirebaseInitProvider.d;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new com.gamericefishpro.space.bb.d(i, (String) it.next()));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        k kVar = k.d;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        int i2 = 1;
        arrayList3.add(new com.gamericefishpro.space.bb.d(i2, new FirebaseCommonRegistrar()));
        arrayList3.add(new com.gamericefishpro.space.bb.d(i2, new ExecutorsRegistrar()));
        arrayList4.add(com.gamericefishpro.space.bb.b.c(context, Context.class, new Class[0]));
        arrayList4.add(com.gamericefishpro.space.bb.b.c(this, g.class, new Class[0]));
        arrayList4.add(com.gamericefishpro.space.bb.b.c(hVar, h.class, new Class[0]));
        com.gamericefishpro.space.u3.k kVar2 = new com.gamericefishpro.space.u3.k();
        if (((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked() && FirebaseInitProvider.e.get()) {
            arrayList4.add(com.gamericefishpro.space.bb.b.c(aVar, a.class, new Class[0]));
        }
        i iVar = new i(arrayList3, arrayList4, kVar2);
        this.d = iVar;
        Trace.endSection();
        this.g = new q(new com.gamericefishpro.space.bb.g(2, this, context));
        this.h = iVar.e(com.gamericefishpro.space.lb.d.class);
        d dVar = new d(this);
        a();
        if (this.e.get()) {
            com.gamericefishpro.space.u8.c.w.d.get();
        }
        this.i.add(dVar);
        Trace.endSection();
    }

    public static g c() {
        g gVar;
        synchronized (j) {
            try {
                gVar = (g) k.get("[DEFAULT]");
                if (gVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + com.gamericefishpro.space.z8.b.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((com.gamericefishpro.space.lb.d) gVar.h.get()).b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    public static g f(Context context, h hVar, String str) {
        g gVar;
        AtomicReference atomicReference = e.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = e.a;
            if (atomicReference2.get() == null) {
                e eVar = new e();
                do {
                    if (atomicReference2.compareAndSet(null, eVar)) {
                        com.gamericefishpro.space.u8.c.a(application);
                        com.gamericefishpro.space.u8.c cVar = com.gamericefishpro.space.u8.c.w;
                        cVar.getClass();
                        synchronized (cVar) {
                            cVar.i.add(eVar);
                        }
                        break;
                    }
                } while (atomicReference2.get() == null);
            }
        }
        String strTrim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (j) {
            com.gamericefishpro.space.t.e eVar2 = k;
            c0.i("FirebaseApp name " + strTrim + " already exists!", !eVar2.containsKey(strTrim));
            c0.h(context, "Application context cannot be null.");
            gVar = new g(context, hVar, strTrim);
            eVar2.put(strTrim, gVar);
        }
        gVar.e();
        return gVar;
    }

    public static void g(Context context) {
        synchronized (j) {
            try {
                if (k.containsKey("[DEFAULT]")) {
                    c();
                    return;
                }
                h hVarA = h.a(context);
                if (hVarA == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                } else {
                    f(context, hVarA, "[DEFAULT]");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        c0.i("FirebaseApp was deleted", !this.f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.d.b(cls);
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        a();
        byte[] bytes = this.b.getBytes(Charset.defaultCharset());
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        a();
        byte[] bytes2 = this.c.b.getBytes(Charset.defaultCharset());
        sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb.toString();
    }

    public final void e() {
        HashMap map;
        if (!((UserManager) this.a.getSystemService(UserManager.class)).isUserUnlocked()) {
            a();
            Context context = this.a;
            AtomicReference atomicReference = f.b;
            if (atomicReference.get() == null) {
                f fVar = new f(context);
                while (!atomicReference.compareAndSet(null, fVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(fVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        a();
        i iVar = this.d;
        a();
        boolean zEquals = "[DEFAULT]".equals(this.b);
        AtomicReference atomicReference2 = iVar.y;
        Boolean boolValueOf = Boolean.valueOf(zEquals);
        while (!atomicReference2.compareAndSet(null, boolValueOf)) {
            if (atomicReference2.get() != null) {
                ((com.gamericefishpro.space.lb.d) this.h.get()).b();
            }
        }
        synchronized (iVar) {
            map = new HashMap(iVar.d);
        }
        iVar.a(map, zEquals);
        ((com.gamericefishpro.space.lb.d) this.h.get()).b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.a();
        return this.b.equals(gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        s sVar = new s(this);
        sVar.c(this.b, "name");
        sVar.c(this.c, "options");
        return sVar.toString();
    }
}

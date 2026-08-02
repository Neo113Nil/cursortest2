package Q3;

import K.o;
import Q2.ComponentCallbacks2C0358c;
import R2.w;
import T3.n;
import U3.j;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.util.Base64;
import android.util.Log;
import c4.C0553d;
import com.google.android.gms.internal.ads.C3067cm;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import e4.InterfaceC4481a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f2659j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static final s.b f2660k = new s.b();

    /* renamed from: a, reason: collision with root package name */
    public final Context f2661a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2662b;

    /* renamed from: c, reason: collision with root package name */
    public final i f2663c;

    /* renamed from: d, reason: collision with root package name */
    public final T3.g f2664d;

    /* renamed from: g, reason: collision with root package name */
    public final n f2667g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC4481a f2668h;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f2665e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f2666f = new AtomicBoolean();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    public g(i iVar, Context context, String str) {
        ?? arrayList;
        int i = 1;
        int i4 = 0;
        new CopyOnWriteArrayList();
        this.f2661a = context;
        w.e(str);
        this.f2662b = str;
        this.f2663c = iVar;
        a aVar = FirebaseInitProvider.f36970n;
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
            arrayList2.add(new T3.d(i4, (String) it.next()));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        j jVar = j.f3325n;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        arrayList3.add(new T3.d(i, new FirebaseCommonRegistrar()));
        arrayList3.add(new T3.d(i, new ExecutorsRegistrar()));
        arrayList4.add(T3.b.b(context, Context.class, new Class[0]));
        arrayList4.add(T3.b.b(this, g.class, new Class[0]));
        arrayList4.add(T3.b.b(iVar, i.class, new Class[0]));
        O2.i iVar2 = new O2.i(22);
        if (o.a(context) && FirebaseInitProvider.f36971u.get()) {
            arrayList4.add(T3.b.b(aVar, a.class, new Class[0]));
        }
        T3.g gVar = new T3.g(arrayList3, arrayList4, iVar2);
        this.f2664d = gVar;
        Trace.endSection();
        this.f2667g = new n(new c(0, this, context));
        this.f2668h = gVar.e(C0553d.class);
        d dVar = new d(this);
        a();
        if (this.f2665e.get()) {
            ComponentCallbacks2C0358c.f2540x.f2541n.get();
        }
        this.i.add(dVar);
        Trace.endSection();
    }

    public static g c() {
        g gVar;
        synchronized (f2659j) {
            try {
                gVar = (g) f2660k.getOrDefault("[DEFAULT]", null);
                if (gVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + V2.b.e() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((C0553d) gVar.f2668h.get()).b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    public static g f(i iVar, Context context, String str) {
        g gVar;
        AtomicReference atomicReference = e.f2656a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = e.f2656a;
            if (atomicReference2.get() == null) {
                e eVar = new e();
                while (true) {
                    if (atomicReference2.compareAndSet(null, eVar)) {
                        ComponentCallbacks2C0358c.a(application);
                        ComponentCallbacks2C0358c componentCallbacks2C0358c = ComponentCallbacks2C0358c.f2540x;
                        componentCallbacks2C0358c.getClass();
                        synchronized (componentCallbacks2C0358c) {
                            componentCallbacks2C0358c.f2543v.add(eVar);
                        }
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        String trim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f2659j) {
            s.b bVar = f2660k;
            w.j("FirebaseApp name " + trim + " already exists!", !bVar.containsKey(trim));
            w.i(context, "Application context cannot be null.");
            gVar = new g(iVar, context, trim);
            bVar.put(trim, gVar);
        }
        gVar.e();
        return gVar;
    }

    public static g g(Context context) {
        synchronized (f2659j) {
            try {
                if (f2660k.containsKey("[DEFAULT]")) {
                    return c();
                }
                i a9 = i.a(context);
                if (a9 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return f(a9, context, "[DEFAULT]");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        w.j("FirebaseApp was deleted", !this.f2666f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.f2664d.a(cls);
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        a();
        byte[] bytes = this.f2662b.getBytes(Charset.defaultCharset());
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        a();
        byte[] bytes2 = this.f2663c.f2675b.getBytes(Charset.defaultCharset());
        sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb.toString();
    }

    public final void e() {
        HashMap hashMap;
        if (!o.a(this.f2661a)) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(this.f2662b);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.f2661a;
            AtomicReference atomicReference = f.f2657b;
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
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb2.append(this.f2662b);
        Log.i("FirebaseApp", sb2.toString());
        T3.g gVar = this.f2664d;
        a();
        boolean equals = "[DEFAULT]".equals(this.f2662b);
        AtomicReference atomicReference2 = gVar.f3185y;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (atomicReference2.compareAndSet(null, valueOf)) {
                synchronized (gVar) {
                    hashMap = new HashMap(gVar.f3180n);
                }
                gVar.g(hashMap, equals);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        ((C0553d) this.f2668h.get()).b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.a();
        return this.f2662b.equals(gVar.f2662b);
    }

    public final int hashCode() {
        return this.f2662b.hashCode();
    }

    public final String toString() {
        C3067cm c3067cm = new C3067cm(this);
        c3067cm.B(this.f2662b, "name");
        c3067cm.B(this.f2663c, "options");
        return c3067cm.toString();
    }
}

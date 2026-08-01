package O3;

import K.o;
import O2.ComponentCallbacks2C0353c;
import P2.w;
import R3.n;
import S0.s;
import S3.k;
import a4.C0436d;
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
import c4.InterfaceC0542a;
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

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f2343j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static final s.b f2344k = new s.b();

    /* renamed from: a, reason: collision with root package name */
    public final Context f2345a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2346b;

    /* renamed from: c, reason: collision with root package name */
    public final i f2347c;

    /* renamed from: d, reason: collision with root package name */
    public final R3.g f2348d;

    /* renamed from: g, reason: collision with root package name */
    public final n f2351g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC0542a f2352h;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f2349e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f2350f = new AtomicBoolean();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    public g(i iVar, Context context, String str) {
        ?? arrayList;
        int i = 1;
        int i6 = 0;
        new CopyOnWriteArrayList();
        this.f2345a = context;
        w.e(str);
        this.f2346b = str;
        this.f2347c = iVar;
        a aVar = FirebaseInitProvider.f36203n;
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
            arrayList2.add(new R3.d(i6, (String) it.next()));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        k kVar = k.f2886n;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        arrayList3.add(new R3.d(i, new FirebaseCommonRegistrar()));
        arrayList3.add(new R3.d(i, new ExecutorsRegistrar()));
        arrayList4.add(R3.b.b(context, Context.class, new Class[0]));
        arrayList4.add(R3.b.b(this, g.class, new Class[0]));
        arrayList4.add(R3.b.b(iVar, i.class, new Class[0]));
        E3.e eVar = new E3.e();
        if (o.a(context) && FirebaseInitProvider.f36204u.get()) {
            arrayList4.add(R3.b.b(aVar, a.class, new Class[0]));
        }
        R3.g gVar = new R3.g(arrayList3, arrayList4, eVar);
        this.f2348d = gVar;
        Trace.endSection();
        this.f2351g = new n(new c(i6, this, context));
        this.f2352h = gVar.b(C0436d.class);
        d dVar = new d(this);
        a();
        if (this.f2349e.get()) {
            ComponentCallbacks2C0353c.f2222x.f2223n.get();
        }
        this.i.add(dVar);
        Trace.endSection();
    }

    public static g c() {
        g gVar;
        synchronized (f2343j) {
            try {
                gVar = (g) f2344k.getOrDefault("[DEFAULT]", null);
                if (gVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + T2.b.e() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((C0436d) gVar.f2352h.get()).b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    public static g f(i iVar, Context context, String str) {
        g gVar;
        AtomicReference atomicReference = e.f2340a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = e.f2340a;
            if (atomicReference2.get() == null) {
                e eVar = new e();
                while (true) {
                    if (atomicReference2.compareAndSet(null, eVar)) {
                        ComponentCallbacks2C0353c.a(application);
                        ComponentCallbacks2C0353c componentCallbacks2C0353c = ComponentCallbacks2C0353c.f2222x;
                        componentCallbacks2C0353c.getClass();
                        synchronized (componentCallbacks2C0353c) {
                            componentCallbacks2C0353c.f2225v.add(eVar);
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
        synchronized (f2343j) {
            s.b bVar = f2344k;
            w.j("FirebaseApp name " + trim + " already exists!", !bVar.containsKey(trim));
            w.i(context, "Application context cannot be null.");
            gVar = new g(iVar, context, trim);
            bVar.put(trim, gVar);
        }
        gVar.e();
        return gVar;
    }

    public static g g(Context context) {
        synchronized (f2343j) {
            try {
                if (f2344k.containsKey("[DEFAULT]")) {
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
        w.j("FirebaseApp was deleted", !this.f2350f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.f2348d.a(cls);
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        a();
        byte[] bytes = this.f2346b.getBytes(Charset.defaultCharset());
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        a();
        byte[] bytes2 = this.f2347c.f2359b.getBytes(Charset.defaultCharset());
        sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb.toString();
    }

    public final void e() {
        HashMap hashMap;
        if (!o.a(this.f2345a)) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(this.f2346b);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.f2345a;
            AtomicReference atomicReference = f.f2341b;
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
        sb2.append(this.f2346b);
        Log.i("FirebaseApp", sb2.toString());
        R3.g gVar = this.f2348d;
        a();
        boolean equals = "[DEFAULT]".equals(this.f2346b);
        AtomicReference atomicReference2 = gVar.f2730y;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (atomicReference2.compareAndSet(null, valueOf)) {
                synchronized (gVar) {
                    hashMap = new HashMap(gVar.f2725n);
                }
                gVar.g(hashMap, equals);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        ((C0436d) this.f2352h.get()).b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.a();
        return this.f2346b.equals(gVar.f2346b);
    }

    public final int hashCode() {
        return this.f2346b.hashCode();
    }

    public final String toString() {
        s sVar = new s((Object) this);
        sVar.f(this.f2346b, "name");
        sVar.f(this.f2347c, "options");
        return sVar.toString();
    }
}

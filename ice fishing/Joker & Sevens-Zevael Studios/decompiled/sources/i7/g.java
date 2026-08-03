package i7;

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
import l7.n;
import m7.l;
import p6.u;
import x4.s;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f3229j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static final s.f f3230k = new s.f(0);

    /* renamed from: a, reason: collision with root package name */
    public final Context f3231a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3232b;

    /* renamed from: c, reason: collision with root package name */
    public final i f3233c;

    /* renamed from: d, reason: collision with root package name */
    public final l7.g f3234d;

    /* renamed from: g, reason: collision with root package name */
    public final n f3237g;

    /* renamed from: h, reason: collision with root package name */
    public final w7.a f3238h;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f3235e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f3236f = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f3239i = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    public g(Context context, i iVar, String str) {
        ?? arrayList;
        int i10 = 0;
        new CopyOnWriteArrayList();
        this.f3231a = context;
        u.c(str);
        this.f3232b = str;
        this.f3233c = iVar;
        a aVar = FirebaseInitProvider.f1471g;
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
            arrayList2.add(new l7.d(i10, (String) it.next()));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        l lVar = l.f4967g;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        int i11 = 1;
        arrayList3.add(new l7.d(i11, new FirebaseCommonRegistrar()));
        arrayList3.add(new l7.d(i11, new ExecutorsRegistrar()));
        arrayList4.add(l7.b.b(context, Context.class, new Class[0]));
        arrayList4.add(l7.b.b(this, g.class, new Class[0]));
        arrayList4.add(l7.b.b(iVar, i.class, new Class[0]));
        m6.i iVar2 = new m6.i(7);
        if (((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked() && FirebaseInitProvider.f1472h.get()) {
            arrayList4.add(l7.b.b(aVar, a.class, new Class[0]));
        }
        l7.g gVar = new l7.g(arrayList3, arrayList4, iVar2);
        this.f3234d = gVar;
        Trace.endSection();
        this.f3237g = new n(new c(i10, this, context));
        this.f3238h = gVar.d(u7.c.class);
        d dVar = new d(this);
        a();
        if (this.f3235e.get()) {
            o6.c.f5244k.f5245g.get();
        }
        this.f3239i.add(dVar);
        Trace.endSection();
    }

    public static g b() {
        g gVar;
        synchronized (f3229j) {
            try {
                gVar = (g) f3230k.get("[DEFAULT]");
                if (gVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + t6.b.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((u7.c) gVar.f3238h.get()).b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    public static g e(Context context) {
        synchronized (f3229j) {
            try {
                if (f3230k.containsKey("[DEFAULT]")) {
                    return b();
                }
                i a6 = i.a(context);
                if (a6 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return f(context, a6, "[DEFAULT]");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static g f(Context context, i iVar, String str) {
        g gVar;
        AtomicReference atomicReference = e.f3226a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = e.f3226a;
            if (atomicReference2.get() == null) {
                e eVar = new e();
                while (true) {
                    if (atomicReference2.compareAndSet(null, eVar)) {
                        o6.c.a(application);
                        o6.c cVar = o6.c.f5244k;
                        cVar.getClass();
                        synchronized (cVar) {
                            cVar.f5247i.add(eVar);
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
        synchronized (f3229j) {
            s.f fVar = f3230k;
            u.i("FirebaseApp name " + trim + " already exists!", !fVar.containsKey(trim));
            u.h(context, "Application context cannot be null.");
            gVar = new g(context, iVar, trim);
            fVar.put(trim, gVar);
        }
        gVar.d();
        return gVar;
    }

    public final void a() {
        u.i("FirebaseApp was deleted", !this.f3236f.get());
    }

    public final String c() {
        StringBuilder sb = new StringBuilder();
        a();
        byte[] bytes = this.f3232b.getBytes(Charset.defaultCharset());
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        a();
        byte[] bytes2 = this.f3233c.f3246b.getBytes(Charset.defaultCharset());
        sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb.toString();
    }

    public final void d() {
        HashMap hashMap;
        if (!((UserManager) this.f3231a.getSystemService(UserManager.class)).isUserUnlocked()) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(this.f3232b);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.f3231a;
            AtomicReference atomicReference = f.f3227b;
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
        sb2.append(this.f3232b);
        Log.i("FirebaseApp", sb2.toString());
        l7.g gVar = this.f3234d;
        a();
        boolean equals = "[DEFAULT]".equals(this.f3232b);
        AtomicReference atomicReference2 = gVar.f4229f;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (atomicReference2.compareAndSet(null, valueOf)) {
                synchronized (gVar) {
                    hashMap = new HashMap(gVar.f4224a);
                }
                gVar.c(hashMap, equals);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        ((u7.c) this.f3238h.get()).b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.a();
        return this.f3232b.equals(gVar.f3232b);
    }

    public final int hashCode() {
        return this.f3232b.hashCode();
    }

    public final String toString() {
        s sVar = new s(this);
        sVar.b(this.f3232b, "name");
        sVar.b(this.f3233c, "options");
        return sVar.toString();
    }
}

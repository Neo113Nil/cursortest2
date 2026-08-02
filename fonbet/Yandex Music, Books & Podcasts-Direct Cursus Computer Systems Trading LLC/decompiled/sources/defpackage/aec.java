package defpackage;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
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

/* loaded from: classes3.dex */
public final class aec {
    public static final Object k = new Object();
    public static final xy0 l = new xy0(0);
    public final Context a;
    public final String b;
    public final nec c;
    public final rn5 d;
    public final brf g;
    public final uzm h;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList j = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    public aec(nec necVar, Context context, String str) {
        ?? arrayList;
        int i = 0;
        this.a = context;
        y1g.C(str);
        this.b = str;
        y1g.G(necVar);
        this.c = necVar;
        xd2 xd2Var = FirebaseInitProvider.a;
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
            arrayList2.add(new mn5(i, (String) it.next()));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        sft sftVar = sft.a;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        int i2 = 1;
        arrayList3.add(new mn5(i2, new FirebaseCommonRegistrar()));
        arrayList3.add(new mn5(i2, new ExecutorsRegistrar()));
        arrayList4.add(vm5.c(context, Context.class, new Class[0]));
        arrayList4.add(vm5.c(this, aec.class, new Class[0]));
        arrayList4.add(vm5.c(necVar, nec.class, new Class[0]));
        rwd rwdVar = new rwd(17);
        if (a4g.I(context) && FirebaseInitProvider.b.get()) {
            arrayList4.add(vm5.c(xd2Var, xd2.class, new Class[0]));
        }
        rn5 rn5Var = new rn5(arrayList3, arrayList4, rwdVar);
        this.d = rn5Var;
        Trace.endSection();
        this.g = new brf(new qn5(2, this, context));
        this.h = rn5Var.n(um7.class);
        xdc xdcVar = new xdc(this);
        a();
        if (this.e.get()) {
            rj2.e.a.get();
        }
        this.i.add(xdcVar);
        Trace.endSection();
    }

    public static ArrayList c() {
        ArrayList arrayList = new ArrayList();
        synchronized (k) {
            try {
                Iterator it = ((wy0) l.values()).iterator();
                while (it.hasNext()) {
                    aec aecVar = (aec) it.next();
                    aecVar.a();
                    arrayList.add(aecVar.b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static aec d() {
        aec aecVar;
        synchronized (k) {
            try {
                aecVar = (aec) l.get("[DEFAULT]");
                if (aecVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + jo0.n() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((um7) aecVar.h.get()).b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return aecVar;
    }

    public static aec e(String str) {
        aec aecVar;
        String str2;
        synchronized (k) {
            try {
                aecVar = (aec) l.get(str.trim());
                if (aecVar == null) {
                    ArrayList c = c();
                    if (c.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", c);
                    }
                    throw new IllegalStateException("FirebaseApp with name " + str + " doesn't exist. " + str2);
                }
                ((um7) aecVar.h.get()).b();
            } finally {
            }
        }
        return aecVar;
    }

    public static aec h(nec necVar, Context context, String str) {
        aec aecVar;
        AtomicReference atomicReference = ydc.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = ydc.a;
            if (atomicReference2.get() == null) {
                ydc ydcVar = new ydc();
                while (true) {
                    if (atomicReference2.compareAndSet(null, ydcVar)) {
                        rj2.a(application);
                        rj2 rj2Var = rj2.e;
                        rj2Var.getClass();
                        synchronized (rj2Var) {
                            rj2Var.c.add(ydcVar);
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
        synchronized (k) {
            xy0 xy0Var = l;
            y1g.I("FirebaseApp name " + trim + " already exists!", !xy0Var.containsKey(trim));
            y1g.H(context, "Application context cannot be null.");
            aecVar = new aec(necVar, context, trim);
            xy0Var.put(trim, aecVar);
        }
        aecVar.g();
        return aecVar;
    }

    public static aec i(Context context) {
        synchronized (k) {
            try {
                if (l.containsKey("[DEFAULT]")) {
                    return d();
                }
                nec a = nec.a(context);
                if (a == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return h(a, context, "[DEFAULT]");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        y1g.I("FirebaseApp was deleted", !this.f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.d.b(cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aec)) {
            return false;
        }
        aec aecVar = (aec) obj;
        aecVar.a();
        return this.b.equals(aecVar.b);
    }

    public final String f() {
        StringBuilder sb = new StringBuilder();
        a();
        sb.append(vq1.M(this.b.getBytes(Charset.defaultCharset())));
        sb.append("+");
        a();
        sb.append(vq1.M(this.c.b.getBytes(Charset.defaultCharset())));
        return sb.toString();
    }

    public final void g() {
        HashMap hashMap;
        if (!a4g.I(this.a)) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(this.b);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.a;
            AtomicReference atomicReference = zdc.b;
            if (atomicReference.get() == null) {
                zdc zdcVar = new zdc(context);
                while (!atomicReference.compareAndSet(null, zdcVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(zdcVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb2.append(this.b);
        Log.i("FirebaseApp", sb2.toString());
        rn5 rn5Var = this.d;
        a();
        boolean equals = "[DEFAULT]".equals(this.b);
        AtomicReference atomicReference2 = (AtomicReference) rn5Var.g;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (atomicReference2.compareAndSet(null, valueOf)) {
                synchronized (rn5Var) {
                    hashMap = new HashMap((HashMap) rn5Var.b);
                }
                rn5Var.z(hashMap, equals);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        ((um7) this.h.get()).b();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        md7 md7Var = new md7(this);
        md7Var.a(this.b, "name");
        md7Var.a(this.c, "options");
        return md7Var.toString();
    }
}

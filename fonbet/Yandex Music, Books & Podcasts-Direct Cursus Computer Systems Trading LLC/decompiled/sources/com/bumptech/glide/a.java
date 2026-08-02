package com.bumptech.glide;

import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import defpackage.aa;
import defpackage.b1o;
import defpackage.b6e;
import defpackage.c0h;
import defpackage.cib;
import defpackage.cxh;
import defpackage.d1o;
import defpackage.d51;
import defpackage.e3s;
import defpackage.g0h;
import defpackage.hrg;
import defpackage.ih;
import defpackage.jld;
import defpackage.kac;
import defpackage.kg5;
import defpackage.kjn;
import defpackage.mld;
import defpackage.o8g;
import defpackage.ovn;
import defpackage.pa7;
import defpackage.q7b;
import defpackage.qzc;
import defpackage.r0o;
import defpackage.r33;
import defpackage.rdc;
import defpackage.w1g;
import defpackage.xq0;
import defpackage.xut;
import defpackage.xy0;
import defpackage.z98;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class a implements ComponentCallbacks2 {
    public static volatile a h;
    public static volatile boolean i;
    public final r33 a;
    public final g0h b;
    public final jld c;
    public final z98 d;
    public final d1o e;
    public final kjn f;
    public final ArrayList g = new ArrayList();

    public a(Context context, q7b q7bVar, g0h g0hVar, r33 r33Var, z98 z98Var, d1o d1oVar, kjn kjnVar, d51 d51Var, xy0 xy0Var, List list, ArrayList arrayList, kg5 kg5Var, qzc qzcVar) {
        this.a = r33Var;
        this.d = z98Var;
        this.b = g0hVar;
        this.e = d1oVar;
        this.f = kjnVar;
        this.c = new jld(context, z98Var, new r0o(this, arrayList, kg5Var), new ovn(), d51Var, xy0Var, list, q7bVar, qzcVar);
    }

    public static a a(Context context) {
        if (h == null) {
            GeneratedAppGlideModule generatedAppGlideModule = null;
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
            } catch (IllegalAccessException e) {
                b6e.o("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
                return null;
            } catch (InstantiationException e2) {
                b6e.o("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e2);
                return null;
            } catch (NoSuchMethodException e3) {
                b6e.o("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e3);
                return null;
            } catch (InvocationTargetException e4) {
                b6e.o("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e4);
                return null;
            }
            synchronized (a.class) {
                if (h == null) {
                    if (i) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    i = true;
                    try {
                        b(context, generatedAppGlideModule);
                        i = false;
                    } catch (Throwable th) {
                        i = false;
                        throw th;
                    }
                }
            }
        }
        return h;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0319  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        Iterator it;
        d51 d51Var;
        xy0 xy0Var;
        Iterator it2;
        xy0 xy0Var2 = new xy0(0);
        pa7 pa7Var = new pa7(2);
        d51 d51Var2 = new d51(24);
        Context applicationContext = context.getApplicationContext();
        List list = Collections.EMPTY_LIST;
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                }
                for (String str : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        o8g.D(str);
                        throw null;
                    }
                }
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Finished loading Glide modules");
                }
                if (generatedAppGlideModule != null && !new HashSet().isEmpty()) {
                    new HashSet();
                    it2 = arrayList.iterator();
                    if (it2.hasNext()) {
                        throw hrg.j(it2);
                    }
                }
                if (Log.isLoggable("Glide", 3)) {
                    Iterator it3 = arrayList.iterator();
                    if (it3.hasNext()) {
                        throw hrg.j(it3);
                    }
                }
                it = arrayList.iterator();
                if (!it.hasNext()) {
                    throw hrg.j(it);
                }
                ih ihVar = new ih(1);
                if (rdc.c == 0) {
                    rdc.c = Math.min(4, Runtime.getRuntime().availableProcessors());
                }
                int i2 = rdc.c;
                if (TextUtils.isEmpty("source")) {
                    xq0.x("Name must be non-null and non-empty, but given: source");
                    return;
                }
                PriorityBlockingQueue priorityBlockingQueue = new PriorityBlockingQueue();
                mld mldVar = new mld(ihVar, "source", false);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                rdc rdcVar = new rdc(new ThreadPoolExecutor(i2, i2, 0L, timeUnit, priorityBlockingQueue, mldVar), 1);
                ih ihVar2 = new ih(1);
                if (TextUtils.isEmpty("disk-cache")) {
                    xq0.x("Name must be non-null and non-empty, but given: disk-cache");
                    return;
                }
                rdc rdcVar2 = new rdc(new ThreadPoolExecutor(1, 1, 0L, timeUnit, new PriorityBlockingQueue(), new mld(ihVar2, "disk-cache", true)), 1);
                if (rdc.c == 0) {
                    rdc.c = Math.min(4, Runtime.getRuntime().availableProcessors());
                }
                int i3 = rdc.c >= 4 ? 2 : 1;
                ih ihVar3 = new ih(1);
                if (TextUtils.isEmpty("animation")) {
                    xq0.x("Name must be non-null and non-empty, but given: animation");
                    return;
                }
                rdc rdcVar3 = new rdc(new ThreadPoolExecutor(i3, i3, 0L, timeUnit, new PriorityBlockingQueue(), new mld(ihVar3, "animation", true)), 1);
                cxh cxhVar = new cxh(applicationContext);
                aa aaVar = new aa();
                Context context2 = cxhVar.a;
                float f = cxhVar.d;
                ActivityManager activityManager = cxhVar.b;
                int i4 = activityManager.isLowRamDevice() ? 2097152 : RemoteCameraConfig.Camera.BITRATE;
                aaVar.c = i4;
                int round = Math.round(activityManager.getMemoryClass() * 1048576 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
                DisplayMetrics displayMetrics = (DisplayMetrics) cxhVar.c.b;
                float f2 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
                int round2 = Math.round(f2 * f);
                int round3 = Math.round(f2 * 2.0f);
                int i5 = round - i4;
                int i6 = round3 + round2;
                if (i6 <= i5) {
                    aaVar.b = round3;
                    aaVar.a = round2;
                } else {
                    float f3 = i5 / (f + 2.0f);
                    aaVar.b = Math.round(2.0f * f3);
                    aaVar.a = Math.round(f3 * f);
                }
                if (Log.isLoggable("MemorySizeCalculator", 3)) {
                    StringBuilder sb = new StringBuilder("Calculation complete, Calculated memory cache size: ");
                    d51Var = d51Var2;
                    xy0Var = xy0Var2;
                    sb.append(Formatter.formatFileSize(context2, aaVar.b));
                    sb.append(", pool size: ");
                    sb.append(Formatter.formatFileSize(context2, aaVar.a));
                    sb.append(", byte array size: ");
                    sb.append(Formatter.formatFileSize(context2, i4));
                    sb.append(", memory class limited? ");
                    sb.append(i6 > round);
                    sb.append(", max size: ");
                    sb.append(Formatter.formatFileSize(context2, round));
                    sb.append(", memoryClass: ");
                    sb.append(activityManager.getMemoryClass());
                    sb.append(", isLowMemoryDevice: ");
                    sb.append(activityManager.isLowRamDevice());
                    Log.d("MemorySizeCalculator", sb.toString());
                } else {
                    d51Var = d51Var2;
                    xy0Var = xy0Var2;
                }
                kjn kjnVar = new kjn(19);
                int i7 = aaVar.a;
                r33 c0hVar = i7 > 0 ? new c0h(i7) : new e3s(15);
                z98 z98Var = new z98(aaVar.c);
                g0h g0hVar = new g0h(aaVar.b);
                q7b q7bVar = new q7b(g0hVar, new cib(applicationContext), rdcVar2, rdcVar, new rdc(new ThreadPoolExecutor(0, Integer.MAX_VALUE, 10000L, timeUnit, new SynchronousQueue(), new mld(new ih(1), "source-unlimited", false)), 1), rdcVar3);
                List list2 = Collections.EMPTY_LIST;
                qzc qzcVar = new qzc(pa7Var);
                a aVar = new a(applicationContext, q7bVar, g0hVar, c0hVar, z98Var, new d1o(qzcVar), kjnVar, d51Var, xy0Var, list2, arrayList, generatedAppGlideModule, qzcVar);
                applicationContext.registerComponentCallbacks(aVar);
                h = aVar;
                return;
            }
            if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Got null app info metadata");
            }
            if (generatedAppGlideModule != null) {
                new HashSet();
                it2 = arrayList.iterator();
                if (it2.hasNext()) {
                }
            }
            if (Log.isLoggable("Glide", 3)) {
            }
            it = arrayList.iterator();
            if (!it.hasNext()) {
            }
        } catch (PackageManager.NameNotFoundException e) {
            kac.k("Unable to find metadata to parse GlideModules", e);
        }
    }

    public static b1o c(Context context) {
        w1g.s(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return a(context).e.f(context);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        xut.a();
        this.b.f(0L);
        this.a.q();
        z98 z98Var = this.d;
        synchronized (z98Var) {
            z98Var.c(0);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        long j;
        xut.a();
        synchronized (this.g) {
            try {
                Iterator it = this.g.iterator();
                while (it.hasNext()) {
                    ((b1o) it.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        g0h g0hVar = this.b;
        g0hVar.getClass();
        if (i2 >= 40) {
            g0hVar.f(0L);
        } else if (i2 >= 20 || i2 == 15) {
            synchronized (g0hVar) {
                j = g0hVar.a;
            }
            g0hVar.f(j / 2);
        }
        this.a.m(i2);
        z98 z98Var = this.d;
        synchronized (z98Var) {
            if (i2 >= 40) {
                synchronized (z98Var) {
                    z98Var.c(0);
                }
            } else if (i2 >= 20 || i2 == 15) {
                z98Var.c(z98Var.a / 2);
            }
        }
    }
}

package com.bumptech.glide;

import A1.A;
import A3.r;
import D.x;
import a.AbstractC0426a;
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
import com.google.android.gms.internal.ads.C2964aq;
import h.C4543G;
import i1.C4585b;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import x1.C5184b;
import x1.InterfaceC5183a;
import y1.C5202c;
import y1.C5203d;
import z1.ThreadFactoryC5221a;
import z1.ThreadFactoryC5222b;

/* loaded from: classes.dex */
public final class c implements ComponentCallbacks2 {

    /* renamed from: A, reason: collision with root package name */
    public static volatile c f24157A;

    /* renamed from: B, reason: collision with root package name */
    public static volatile boolean f24158B;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC5183a f24159n;

    /* renamed from: u, reason: collision with root package name */
    public final C5202c f24160u;

    /* renamed from: v, reason: collision with root package name */
    public final i f24161v;

    /* renamed from: w, reason: collision with root package name */
    public final C2964aq f24162w;

    /* renamed from: x, reason: collision with root package name */
    public final com.bumptech.glide.manager.k f24163x;

    /* renamed from: y, reason: collision with root package name */
    public final O2.i f24164y;

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f24165z = new ArrayList();

    public c(Context context, w1.k kVar, C5202c c5202c, InterfaceC5183a interfaceC5183a, C2964aq c2964aq, com.bumptech.glide.manager.k kVar2, O2.i iVar, O2.i iVar2, s.b bVar, List list, ArrayList arrayList, AbstractC0426a abstractC0426a, C4585b c4585b) {
        new P1.h(new J3.l(5, this));
        this.f24159n = interfaceC5183a;
        this.f24162w = c2964aq;
        this.f24160u = c5202c;
        this.f24163x = kVar2;
        this.f24164y = iVar;
        if (((Map) c4585b.f38152u).get(f.class) != null) {
            throw new ClassCastException();
        }
        this.f24161v = new i(context, c2964aq, new com.bumptech.glide.manager.o(this, arrayList, abstractC0426a), new G3.e(7), iVar2, bVar, list, kVar, c4585b);
    }

    public static c a(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (f24157A == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e9) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e9);
            } catch (InstantiationException e10) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e10);
            } catch (NoSuchMethodException e11) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e11);
            } catch (InvocationTargetException e12) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e12);
            }
            synchronized (c.class) {
                if (f24157A == null) {
                    if (f24158B) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    f24158B = true;
                    try {
                        b(context, generatedAppGlideModule);
                        f24158B = false;
                    } catch (Throwable th) {
                        f24158B = false;
                        throw th;
                    }
                }
            }
        }
        return f24157A;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0325  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        Iterator it;
        O2.i iVar;
        Iterator it2;
        ApplicationInfo applicationInfo;
        s.b bVar = new s.b();
        A a9 = new A(1);
        O2.i iVar2 = new O2.i(16);
        Context applicationContext = context.getApplicationContext();
        List list = Collections.EMPTY_LIST;
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e9) {
            if (Log.isLoggable("ManifestParser", 6)) {
                Log.e("ManifestParser", "Failed to parse glide modules", e9);
            }
        }
        if (applicationInfo != null && applicationInfo.metaData != null) {
            if (Log.isLoggable("ManifestParser", 2)) {
                Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
            }
            for (String str : applicationInfo.metaData.keySet()) {
                if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                    d.y(str);
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
                    throw x.i(it2);
                }
            }
            if (Log.isLoggable("Glide", 3)) {
                Iterator it3 = arrayList.iterator();
                if (it3.hasNext()) {
                    throw x.i(it3);
                }
            }
            it = arrayList.iterator();
            if (!it.hasNext()) {
                throw x.i(it);
            }
            ThreadFactoryC5221a threadFactoryC5221a = new ThreadFactoryC5221a();
            if (z1.d.f42228v == 0) {
                z1.d.f42228v = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i = z1.d.f42228v;
            if (TextUtils.isEmpty("source")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
            }
            ThreadFactoryC5222b threadFactoryC5222b = new ThreadFactoryC5222b(threadFactoryC5221a, "source", false);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            z1.d dVar = new z1.d(new ThreadPoolExecutor(i, i, 0L, timeUnit, new PriorityBlockingQueue(), threadFactoryC5222b));
            ThreadFactoryC5221a threadFactoryC5221a2 = new ThreadFactoryC5221a();
            if (TextUtils.isEmpty("disk-cache")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
            }
            z1.d dVar2 = new z1.d(new ThreadPoolExecutor(1, 1, 0L, timeUnit, new PriorityBlockingQueue(), new ThreadFactoryC5222b(threadFactoryC5221a2, "disk-cache", true)));
            if (z1.d.f42228v == 0) {
                z1.d.f42228v = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i4 = z1.d.f42228v >= 4 ? 2 : 1;
            ThreadFactoryC5221a threadFactoryC5221a3 = new ThreadFactoryC5221a();
            if (TextUtils.isEmpty("animation")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
            }
            z1.d dVar3 = new z1.d(new ThreadPoolExecutor(i4, i4, 0L, timeUnit, new PriorityBlockingQueue(), new ThreadFactoryC5222b(threadFactoryC5221a3, "animation", true)));
            C5203d c5203d = new C5203d(applicationContext);
            r rVar = new r();
            Context context2 = c5203d.f41893a;
            ActivityManager activityManager = c5203d.f41894b;
            int i6 = activityManager.isLowRamDevice() ? 2097152 : 4194304;
            rVar.f186c = i6;
            int round = Math.round(activityManager.getMemoryClass() * com.anythink.basead.exoplayer.h.o.f8528d * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
            DisplayMetrics displayMetrics = (DisplayMetrics) c5203d.f41895c.f39127n;
            float f2 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
            float f9 = c5203d.f41896d;
            int round2 = Math.round(f2 * f9);
            int round3 = Math.round(f2 * 2.0f);
            int i9 = round - i6;
            int i10 = round3 + round2;
            if (i10 <= i9) {
                rVar.f185b = round3;
                rVar.f184a = round2;
            } else {
                float f10 = i9 / (f9 + 2.0f);
                rVar.f185b = Math.round(2.0f * f10);
                rVar.f184a = Math.round(f10 * f9);
            }
            if (Log.isLoggable("MemorySizeCalculator", 3)) {
                StringBuilder sb = new StringBuilder("Calculation complete, Calculated memory cache size: ");
                iVar = iVar2;
                sb.append(Formatter.formatFileSize(context2, rVar.f185b));
                sb.append(", pool size: ");
                sb.append(Formatter.formatFileSize(context2, rVar.f184a));
                sb.append(", byte array size: ");
                sb.append(Formatter.formatFileSize(context2, i6));
                sb.append(", memory class limited? ");
                sb.append(i10 > round);
                sb.append(", max size: ");
                sb.append(Formatter.formatFileSize(context2, round));
                sb.append(", memoryClass: ");
                sb.append(activityManager.getMemoryClass());
                sb.append(", isLowMemoryDevice: ");
                sb.append(activityManager.isLowRamDevice());
                Log.d("MemorySizeCalculator", sb.toString());
            } else {
                iVar = iVar2;
            }
            O2.i iVar3 = new O2.i(17);
            int i11 = rVar.f184a;
            InterfaceC5183a hVar = i11 > 0 ? new x1.h(i11) : new C5184b();
            C2964aq c2964aq = new C2964aq(rVar.f186c);
            C5202c c5202c = new C5202c(rVar.f185b, 0);
            A1.r rVar2 = new A1.r(applicationContext, 3);
            C4543G c4543g = new C4543G();
            c4543g.f37843n = rVar2;
            c cVar = new c(applicationContext, new w1.k(c5202c, c4543g, dVar2, dVar, new z1.d(new ThreadPoolExecutor(0, Integer.MAX_VALUE, z1.d.f42227u, timeUnit, new SynchronousQueue(), new ThreadFactoryC5222b(new ThreadFactoryC5221a(), "source-unlimited", false))), dVar3), c5202c, hVar, c2964aq, new com.bumptech.glide.manager.k(), iVar3, iVar, bVar, Collections.EMPTY_LIST, arrayList, generatedAppGlideModule, new C4585b(a9));
            applicationContext.registerComponentCallbacks(cVar);
            f24157A = cVar;
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
    }

    public static p c(Context context) {
        P1.g.c(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return a(context).f24163x.b(context);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        P1.p.a();
        this.f24160u.g(0L);
        this.f24159n.g();
        C2964aq c2964aq = this.f24162w;
        synchronized (c2964aq) {
            c2964aq.b(0);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        long j6;
        P1.p.a();
        synchronized (this.f24165z) {
            try {
                Iterator it = this.f24165z.iterator();
                while (it.hasNext()) {
                    ((p) it.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C5202c c5202c = this.f24160u;
        c5202c.getClass();
        if (i >= 40) {
            c5202c.g(0L);
        } else if (i >= 20 || i == 15) {
            synchronized (c5202c) {
                j6 = c5202c.f2368n;
            }
            c5202c.g(j6 / 2);
        }
        this.f24159n.f(i);
        C2964aq c2964aq = this.f24162w;
        synchronized (c2964aq) {
            if (i >= 40) {
                synchronized (c2964aq) {
                    c2964aq.b(0);
                }
            } else if (i >= 20 || i == 15) {
                c2964aq.b(c2964aq.f29916n / 2);
            }
        }
    }
}

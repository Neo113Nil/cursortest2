package com.bumptech.glide;

import D.y;
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
import com.google.android.gms.internal.ads.C2941aq;
import g1.C4522b;
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
import t0.C4988C;
import v1.C5109f;
import v1.InterfaceC5104a;
import w1.C5145c;
import w1.C5146d;
import x1.ThreadFactoryC5184a;
import x1.ThreadFactoryC5185b;

/* loaded from: classes.dex */
public final class c implements ComponentCallbacks2 {

    /* renamed from: A, reason: collision with root package name */
    public static volatile c f23370A;

    /* renamed from: B, reason: collision with root package name */
    public static volatile boolean f23371B;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC5104a f23372n;

    /* renamed from: u, reason: collision with root package name */
    public final C5145c f23373u;

    /* renamed from: v, reason: collision with root package name */
    public final i f23374v;

    /* renamed from: w, reason: collision with root package name */
    public final C2941aq f23375w;

    /* renamed from: x, reason: collision with root package name */
    public final com.bumptech.glide.manager.k f23376x;

    /* renamed from: y, reason: collision with root package name */
    public final a4.e f23377y;

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f23378z = new ArrayList();

    public c(Context context, u1.l lVar, C5145c c5145c, InterfaceC5104a interfaceC5104a, C2941aq c2941aq, com.bumptech.glide.manager.k kVar, a4.e eVar, a4.e eVar2, s.b bVar, List list, ArrayList arrayList, g gVar, C4522b c4522b) {
        new N1.h(new H3.l(5, this));
        this.f23372n = interfaceC5104a;
        this.f23375w = c2941aq;
        this.f23373u = c5145c;
        this.f23376x = kVar;
        this.f23377y = eVar;
        if (((Map) c4522b.f37625u).get(f.class) != null) {
            throw new ClassCastException();
        }
        this.f23374v = new i(context, c2941aq, new com.bumptech.glide.manager.p(this, arrayList, gVar), new M2.i(5), eVar2, bVar, list, lVar, c4522b);
    }

    public static c a(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (f23370A == null) {
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
                if (f23370A == null) {
                    if (f23371B) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    f23371B = true;
                    try {
                        b(context, generatedAppGlideModule);
                        f23371B = false;
                    } catch (Throwable th) {
                        f23371B = false;
                        throw th;
                    }
                }
            }
        }
        return f23370A;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x031a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        Iterator it;
        a4.e eVar;
        Iterator it2;
        ApplicationInfo applicationInfo;
        s.b bVar = new s.b();
        I0.j jVar = new I0.j(17);
        a4.e eVar2 = new a4.e();
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
                    h.j(str);
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
                    throw y.j(it2);
                }
            }
            if (Log.isLoggable("Glide", 3)) {
                Iterator it3 = arrayList.iterator();
                if (it3.hasNext()) {
                    throw y.j(it3);
                }
            }
            it = arrayList.iterator();
            if (!it.hasNext()) {
                throw y.j(it);
            }
            ThreadFactoryC5184a threadFactoryC5184a = new ThreadFactoryC5184a();
            if (x1.d.f41763v == 0) {
                x1.d.f41763v = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i = x1.d.f41763v;
            if (TextUtils.isEmpty("source")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
            }
            ThreadFactoryC5185b threadFactoryC5185b = new ThreadFactoryC5185b(threadFactoryC5184a, "source", false);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            x1.d dVar = new x1.d(new ThreadPoolExecutor(i, i, 0L, timeUnit, new PriorityBlockingQueue(), threadFactoryC5185b));
            ThreadFactoryC5184a threadFactoryC5184a2 = new ThreadFactoryC5184a();
            if (TextUtils.isEmpty("disk-cache")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
            }
            x1.d dVar2 = new x1.d(new ThreadPoolExecutor(1, 1, 0L, timeUnit, new PriorityBlockingQueue(), new ThreadFactoryC5185b(threadFactoryC5184a2, "disk-cache", true)));
            if (x1.d.f41763v == 0) {
                x1.d.f41763v = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i6 = x1.d.f41763v >= 4 ? 2 : 1;
            ThreadFactoryC5184a threadFactoryC5184a3 = new ThreadFactoryC5184a();
            if (TextUtils.isEmpty("animation")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
            }
            x1.d dVar3 = new x1.d(new ThreadPoolExecutor(i6, i6, 0L, timeUnit, new PriorityBlockingQueue(), new ThreadFactoryC5185b(threadFactoryC5184a3, "animation", true)));
            C5146d c5146d = new C5146d(applicationContext);
            X2.b bVar2 = new X2.b();
            Context context2 = c5146d.f41650a;
            ActivityManager activityManager = c5146d.f41651b;
            int i9 = activityManager.isLowRamDevice() ? 2097152 : 4194304;
            bVar2.f3773c = i9;
            int round = Math.round(activityManager.getMemoryClass() * com.anythink.basead.exoplayer.h.o.f7742d * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
            DisplayMetrics displayMetrics = (DisplayMetrics) c5146d.f41652c.f38761u;
            float f3 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
            float f9 = c5146d.f41653d;
            int round2 = Math.round(f3 * f9);
            int round3 = Math.round(f3 * 2.0f);
            int i10 = round - i9;
            int i11 = round3 + round2;
            if (i11 <= i10) {
                bVar2.f3772b = round3;
                bVar2.f3771a = round2;
            } else {
                float f10 = i10 / (f9 + 2.0f);
                bVar2.f3772b = Math.round(2.0f * f10);
                bVar2.f3771a = Math.round(f10 * f9);
            }
            if (Log.isLoggable("MemorySizeCalculator", 3)) {
                StringBuilder sb = new StringBuilder("Calculation complete, Calculated memory cache size: ");
                eVar = eVar2;
                sb.append(Formatter.formatFileSize(context2, bVar2.f3772b));
                sb.append(", pool size: ");
                sb.append(Formatter.formatFileSize(context2, bVar2.f3771a));
                sb.append(", byte array size: ");
                sb.append(Formatter.formatFileSize(context2, i9));
                sb.append(", memory class limited? ");
                sb.append(i11 > round);
                sb.append(", max size: ");
                sb.append(Formatter.formatFileSize(context2, round));
                sb.append(", memoryClass: ");
                sb.append(activityManager.getMemoryClass());
                sb.append(", isLowMemoryDevice: ");
                sb.append(activityManager.isLowRamDevice());
                Log.d("MemorySizeCalculator", sb.toString());
            } else {
                eVar = eVar2;
            }
            a4.e eVar3 = new a4.e();
            int i12 = bVar2.f3771a;
            InterfaceC5104a c5109f = i12 > 0 ? new C5109f(i12) : new E3.e();
            C2941aq c2941aq = new C2941aq(bVar2.f3773c);
            C5145c c5145c = new C5145c(bVar2.f3772b, 0);
            c cVar = new c(applicationContext, new u1.l(c5145c, new C4988C(applicationContext), dVar2, dVar, new x1.d(new ThreadPoolExecutor(0, Integer.MAX_VALUE, x1.d.f41762u, timeUnit, new SynchronousQueue(), new ThreadFactoryC5185b(new ThreadFactoryC5184a(), "source-unlimited", false))), dVar3), c5145c, c5109f, c2941aq, new com.bumptech.glide.manager.k(), eVar3, eVar, bVar, Collections.EMPTY_LIST, arrayList, generatedAppGlideModule, new C4522b(jVar));
            applicationContext.registerComponentCallbacks(cVar);
            f23370A = cVar;
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
        N1.g.c(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return a(context).f23376x.b(context);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        N1.p.a();
        this.f23373u.g(0L);
        this.f23372n.t();
        C2941aq c2941aq = this.f23375w;
        synchronized (c2941aq) {
            c2941aq.b(0);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        long j6;
        N1.p.a();
        synchronized (this.f23378z) {
            try {
                Iterator it = this.f23378z.iterator();
                while (it.hasNext()) {
                    ((p) it.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C5145c c5145c = this.f23373u;
        c5145c.getClass();
        if (i >= 40) {
            c5145c.g(0L);
        } else if (i >= 20 || i == 15) {
            synchronized (c5145c) {
                j6 = c5145c.f1924n;
            }
            c5145c.g(j6 / 2);
        }
        this.f23372n.s(i);
        C2941aq c2941aq = this.f23375w;
        synchronized (c2941aq) {
            if (i >= 40) {
                synchronized (c2941aq) {
                    c2941aq.b(0);
                }
            } else if (i >= 20 || i == 15) {
                c2941aq.b(c2941aq.f29131n / 2);
            }
        }
    }
}

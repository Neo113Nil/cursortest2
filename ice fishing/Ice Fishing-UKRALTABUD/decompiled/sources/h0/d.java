package h0;

import a.AbstractC0069a;
import android.app.ActivityManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.DisplayMetrics;
import android.util.Log;
import c0.C;
import d0.AbstractC0116f;
import d0.C0115e;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.s;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import s0.AbstractC0257a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2324a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2325b;

    /* renamed from: c, reason: collision with root package name */
    public E.a f2326c;

    /* renamed from: d, reason: collision with root package name */
    public long f2327d;

    /* renamed from: e, reason: collision with root package name */
    public C0182a f2328e;

    /* renamed from: f, reason: collision with root package name */
    public FlutterJNI f2329f;

    /* renamed from: g, reason: collision with root package name */
    public ExecutorService f2330g;

    /* renamed from: h, reason: collision with root package name */
    public Future f2331h;

    public static String b(Context context, String str) {
        File file = new File(str);
        try {
            String canonicalPath = file.getCanonicalPath();
            boolean startsWith = canonicalPath.startsWith(context.getApplicationContext().getFilesDir().getCanonicalPath() + File.separator);
            boolean endsWith = canonicalPath.endsWith(".so");
            if (startsWith && endsWith) {
                return canonicalPath;
            }
            Log.e("FlutterLoader", "External path " + canonicalPath + " rejected; not overriding aot-shared-library-name.");
            return null;
        } catch (IOException unused) {
            Log.e("FlutterLoader", "External path " + file.getPath() + " is not a valid path. Please ensure this shared AOT library exists.");
            return null;
        }
    }

    public static void c(Context context, String str, ArrayList arrayList) {
        String str2;
        try {
            str2 = b(context, str);
        } catch (IOException e2) {
            Log.e("FlutterLoader", "Error while validating AOT shared library name flag: " + str, e2);
            str2 = null;
        }
        if (str2 != null) {
            arrayList.add(0, AbstractC0116f.f1808a.f1805a + str2);
            return;
        }
        Log.e("FlutterLoader", "Skipping unsafe AOT shared library name flag: " + str + ". Please ensure that the library is vetted and placed in your application's internal storage.");
    }

    public final void a(Context context, String[] strArr) {
        boolean z2;
        boolean z3;
        Iterator it;
        if (this.f2325b) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (this.f2326c == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        try {
            AbstractC0257a.b("FlutterLoader#ensureInitializationComplete");
            try {
                C0184c c0184c = (C0184c) this.f2331h.get();
                ArrayList arrayList = new ArrayList();
                arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                arrayList.add("--icu-native-lib-path=" + this.f2328e.f2318d + File.separator + "libflutter.so");
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle != null) {
                    z2 = false;
                    z3 = false;
                    for (Iterator it2 = AbstractC0116f.f1818k.iterator(); it2.hasNext(); it2 = it) {
                        C0115e c0115e = (C0115e) it2.next();
                        String str = c0115e.f1806b;
                        if (bundle.containsKey(str)) {
                            if (c0115e == AbstractC0116f.f1816i) {
                                Log.w("FlutterLoader", "For testing purposes only: test flag specified in the manifest was loaded by the FlutterLoader.");
                            } else {
                                if (AbstractC0116f.f1819l.contains(c0115e)) {
                                    throw new IllegalArgumentException(str + " is disabled and no longer allowed. Please remove this flag from your application manifest.");
                                }
                                C c2 = AbstractC0116f.f1820m;
                                if (((C0115e) c2.get(c0115e)) != null) {
                                    StringBuilder sb = new StringBuilder();
                                    it = it2;
                                    sb.append("If you are trying to specify ");
                                    sb.append(str);
                                    sb.append(" in your application manifest, please make sure to use the new metadata key name: ");
                                    sb.append(((C0115e) c2.get(c0115e)).f1806b);
                                    Log.w("FlutterLoader", sb.toString());
                                } else {
                                    it = it2;
                                    if (!c0115e.f1807c) {
                                        Log.e("FlutterLoader", "Flag with metadata key " + str + " is not allowed in release builds and will be ignored if specified in the application manifest or via the command line.");
                                    }
                                }
                                if (c0115e == AbstractC0116f.f1812e) {
                                    z2 = true;
                                } else if (c0115e == AbstractC0116f.f1817j) {
                                    z3 = true;
                                } else {
                                    C0115e c0115e2 = AbstractC0116f.f1815h;
                                    if (c0115e == c0115e2) {
                                        this.f2324a = bundle.getBoolean(c0115e2.f1806b, false);
                                    } else {
                                        if (c0115e != AbstractC0116f.f1808a) {
                                            if (c0115e == AbstractC0116f.f1809b) {
                                            }
                                        }
                                        String string = bundle.getString(str);
                                        if (string == null) {
                                            Log.e("FlutterLoader", "Flag " + str + " was specified with an empty path. Please specify a path to the desired AOT shared library.");
                                        } else {
                                            c(context, string, arrayList);
                                        }
                                    }
                                }
                                String str2 = c0115e.f1805a;
                                if (str2.endsWith("=")) {
                                    Object obj = bundle.get(str);
                                    String obj2 = obj != null ? obj.toString() : null;
                                    if (obj2 == null) {
                                        Log.e("FlutterLoader", "Flag with metadata key " + str + " requires a value, but no value was found. Please specify a value.");
                                    } else {
                                        arrayList.add(str2 + obj2);
                                    }
                                } else if (bundle.getBoolean(str, false)) {
                                    arrayList.add(str2);
                                }
                            }
                        }
                        it = it2;
                    }
                } else {
                    z2 = false;
                    z3 = false;
                }
                if (strArr != null) {
                    for (String str3 : strArr) {
                        C0115e a2 = AbstractC0116f.a(str3);
                        if (a2 == null) {
                            arrayList.add(str3);
                        } else if (a2.equals(AbstractC0116f.f1816i)) {
                            Log.w("FlutterLoader", "For testing purposes only: test flag specified on the command line was loaded by the FlutterLoader.");
                        } else {
                            C0115e c0115e3 = AbstractC0116f.f1808a;
                            if (!a2.equals(c0115e3) && !a2.equals(AbstractC0116f.f1809b)) {
                                if (a2.f1807c) {
                                    arrayList.add(str3);
                                } else {
                                    Log.e("FlutterLoader", "Command line argument " + str3 + " is not allowed in release builds and will be ignored if specified in the application manifest or via the command line.");
                                }
                            }
                            c(context, str3.substring(c0115e3.f1805a.length()), arrayList);
                        }
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                C0115e c0115e4 = AbstractC0116f.f1808a;
                sb2.append(c0115e4.f1805a);
                sb2.append(this.f2328e.f2315a);
                arrayList.add(sb2.toString());
                arrayList.add(c0115e4.f1805a + this.f2328e.f2318d + File.separator + this.f2328e.f2315a);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("--cache-dir-path=");
                sb3.append(c0184c.f2323b);
                arrayList.add(sb3.toString());
                String str4 = this.f2328e.f2317c;
                arrayList.add("--domain-network-policy=" + this.f2328e.f2317c);
                this.f2326c.getClass();
                if (!z2) {
                    ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(new ActivityManager.MemoryInfo());
                    arrayList.add(AbstractC0116f.f1812e.f1805a + String.valueOf((int) ((r3.totalMem / 1000000.0d) / 2.0d)));
                }
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 48));
                arrayList.add("--prefetched-default-font-manager");
                if (!z3) {
                    arrayList.add(AbstractC0116f.f1817j.f1805a + "true");
                }
                this.f2329f.init(context, (String[]) arrayList.toArray(new String[0]), null, c0184c.f2322a, c0184c.f2323b, SystemClock.uptimeMillis() - this.f2327d, Build.VERSION.SDK_INT);
                this.f2325b = true;
                Trace.endSection();
            } finally {
            }
        } catch (Exception e2) {
            Log.e("FlutterLoader", "Flutter initialization failed.", e2);
            throw new RuntimeException(e2);
        }
    }

    public final void d(Context context) {
        E.a aVar = new E.a(18);
        if (this.f2326c != null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("startInitialization must be called on the main thread");
        }
        AbstractC0257a.b("FlutterLoader#startInitialization");
        try {
            Context applicationContext = context.getApplicationContext();
            this.f2326c = aVar;
            this.f2327d = SystemClock.uptimeMillis();
            this.f2328e = AbstractC0069a.u(applicationContext);
            s a2 = s.a((DisplayManager) applicationContext.getSystemService("display"), this.f2329f);
            a2.f2626b.setAsyncWaitForVsyncDelegate(a2.f2628d);
            this.f2331h = this.f2330g.submit(new CallableC0183b(this, applicationContext));
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}

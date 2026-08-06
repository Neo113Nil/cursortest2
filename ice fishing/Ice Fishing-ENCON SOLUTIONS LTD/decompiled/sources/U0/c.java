package U0;

import N1.e;
import N1.l;
import P0.C;
import Q0.d;
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
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import m0.j;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1818a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1819b;

    /* renamed from: c, reason: collision with root package name */
    public j f1820c;

    /* renamed from: d, reason: collision with root package name */
    public long f1821d;

    /* renamed from: e, reason: collision with root package name */
    public e f1822e;

    /* renamed from: f, reason: collision with root package name */
    public FlutterJNI f1823f;

    /* renamed from: g, reason: collision with root package name */
    public ExecutorService f1824g;

    /* renamed from: h, reason: collision with root package name */
    public Future f1825h;

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
            arrayList.add(0, Q0.e.f1527a.f1524a + str2);
            return;
        }
        Log.e("FlutterLoader", "Skipping unsafe AOT shared library name flag: " + str + ". Please ensure that the library is vetted and placed in your application's internal storage.");
    }

    public final void a(Context context, String[] strArr) {
        boolean z2;
        boolean z3;
        Iterator it;
        if (this.f1819b) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (this.f1820c == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        try {
            g1.a.b("FlutterLoader#ensureInitializationComplete");
            try {
                b bVar = (b) this.f1825h.get();
                ArrayList arrayList = new ArrayList();
                arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                arrayList.add("--icu-native-lib-path=" + ((String) this.f1822e.f1171e) + File.separator + "libflutter.so");
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle != null) {
                    z2 = false;
                    z3 = false;
                    for (Iterator it2 = Q0.e.f1537k.iterator(); it2.hasNext(); it2 = it) {
                        d dVar = (d) it2.next();
                        String str = dVar.f1525b;
                        if (bundle.containsKey(str)) {
                            if (dVar == Q0.e.f1535i) {
                                Log.w("FlutterLoader", "For testing purposes only: test flag specified in the manifest was loaded by the FlutterLoader.");
                            } else {
                                if (Q0.e.f1538l.contains(dVar)) {
                                    throw new IllegalArgumentException(str + " is disabled and no longer allowed. Please remove this flag from your application manifest.");
                                }
                                C c2 = Q0.e.f1539m;
                                if (((d) c2.get(dVar)) != null) {
                                    StringBuilder sb = new StringBuilder();
                                    it = it2;
                                    sb.append("If you are trying to specify ");
                                    sb.append(str);
                                    sb.append(" in your application manifest, please make sure to use the new metadata key name: ");
                                    sb.append(((d) c2.get(dVar)).f1525b);
                                    Log.w("FlutterLoader", sb.toString());
                                } else {
                                    it = it2;
                                    if (!dVar.f1526c) {
                                        Log.e("FlutterLoader", "Flag with metadata key " + str + " is not allowed in release builds and will be ignored if specified in the application manifest or via the command line.");
                                    }
                                }
                                if (dVar == Q0.e.f1531e) {
                                    z2 = true;
                                } else if (dVar == Q0.e.f1536j) {
                                    z3 = true;
                                } else {
                                    d dVar2 = Q0.e.f1534h;
                                    if (dVar == dVar2) {
                                        this.f1818a = bundle.getBoolean(dVar2.f1525b, false);
                                    } else {
                                        if (dVar != Q0.e.f1527a) {
                                            if (dVar == Q0.e.f1528b) {
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
                                String str2 = dVar.f1524a;
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
                        d a2 = Q0.e.a(str3);
                        if (a2 == null) {
                            arrayList.add(str3);
                        } else if (a2.equals(Q0.e.f1535i)) {
                            Log.w("FlutterLoader", "For testing purposes only: test flag specified on the command line was loaded by the FlutterLoader.");
                        } else {
                            d dVar3 = Q0.e.f1527a;
                            if (!a2.equals(dVar3) && !a2.equals(Q0.e.f1528b)) {
                                if (a2.f1526c) {
                                    arrayList.add(str3);
                                } else {
                                    Log.e("FlutterLoader", "Command line argument " + str3 + " is not allowed in release builds and will be ignored if specified in the application manifest or via the command line.");
                                }
                            }
                            c(context, str3.substring(dVar3.f1524a.length()), arrayList);
                        }
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                d dVar4 = Q0.e.f1527a;
                sb2.append(dVar4.f1524a);
                sb2.append((String) this.f1822e.f1168b);
                arrayList.add(sb2.toString());
                arrayList.add(dVar4.f1524a + ((String) this.f1822e.f1171e) + File.separator + ((String) this.f1822e.f1168b));
                StringBuilder sb3 = new StringBuilder();
                sb3.append("--cache-dir-path=");
                sb3.append(bVar.f1817b);
                arrayList.add(sb3.toString());
                Object obj3 = this.f1822e.f1170d;
                arrayList.add("--domain-network-policy=" + ((String) this.f1822e.f1170d));
                this.f1820c.getClass();
                if (!z2) {
                    ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(new ActivityManager.MemoryInfo());
                    arrayList.add(Q0.e.f1531e.f1524a + String.valueOf((int) ((r3.totalMem / 1000000.0d) / 2.0d)));
                }
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 48));
                arrayList.add("--prefetched-default-font-manager");
                if (!z3) {
                    arrayList.add(Q0.e.f1536j.f1524a + "true");
                }
                this.f1823f.init(context, (String[]) arrayList.toArray(new String[0]), null, bVar.f1816a, bVar.f1817b, SystemClock.uptimeMillis() - this.f1821d, Build.VERSION.SDK_INT);
                this.f1819b = true;
                Trace.endSection();
            } finally {
            }
        } catch (Exception e2) {
            Log.e("FlutterLoader", "Flutter initialization failed.", e2);
            throw new RuntimeException(e2);
        }
    }

    public final void d(Context context) {
        j jVar = new j(21, false);
        if (this.f1820c != null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("startInitialization must be called on the main thread");
        }
        g1.a.b("FlutterLoader#startInitialization");
        try {
            Context applicationContext = context.getApplicationContext();
            this.f1820c = jVar;
            this.f1821d = SystemClock.uptimeMillis();
            this.f1822e = R1.d.z(applicationContext);
            l b2 = l.b((DisplayManager) applicationContext.getSystemService("display"), this.f1823f);
            ((FlutterJNI) b2.f1218b).setAsyncWaitForVsyncDelegate((io.flutter.view.b) b2.f1220d);
            this.f1825h = this.f1824g.submit(new a(this, applicationContext));
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

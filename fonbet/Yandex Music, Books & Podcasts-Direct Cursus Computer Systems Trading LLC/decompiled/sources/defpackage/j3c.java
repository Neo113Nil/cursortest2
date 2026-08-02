package defpackage;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.util.Log;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j3c {
    public static Executor b;
    public static volatile String c;
    public static volatile String d;
    public static volatile String e;
    public static volatile Boolean f;
    public static Context g;
    public static int h;
    public static final ReentrantLock i;
    public static final String j;
    public static boolean k;
    public static boolean l;
    public static boolean m;
    public static final AtomicBoolean n;
    public static volatile String o;
    public static volatile String p;
    public static final ovn q;
    public static boolean r;
    public static final j3c s = new j3c();
    public static final HashSet a = vop.c(tsg.c);

    static {
        new AtomicLong(65536L);
        h = 64206;
        i = new ReentrantLock();
        Collection collection = qjp.a;
        j = "v12.0";
        n = new AtomicBoolean(false);
        o = "instagram.com";
        p = "facebook.com";
        q = ovn.d;
    }

    public static final void a(Context context, String str) {
        Set set = bp6.a;
        j3c j3cVar = s;
        if (set.contains(j3cVar)) {
            return;
        }
        try {
            av1 C = etn.C(context);
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
            String concat = str.concat("ping");
            long j2 = sharedPreferences.getLong(concat, 0L);
            try {
                JSONObject a2 = rt0.a(qt0.a, C, c3x.F(context), g(context), context);
                String format = String.format("%s/activities", Arrays.copyOf(new Object[]{str}, 1));
                q.getClass();
                String str2 = ood.j;
                ood S = h1b.S(null, format, a2, null);
                if (j2 == 0 && S.c().d == null) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putLong(concat, System.currentTimeMillis());
                    edit.apply();
                }
            } catch (JSONException e2) {
                throw new c3c("An error occurred while publishing install.", e2);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            bp6.a(j3cVar, th);
        }
    }

    public static final Context b() {
        wxf.J();
        Context context = g;
        if (context != null) {
            return context;
        }
        Intrinsics.j("applicationContext");
        throw null;
    }

    public static final String c() {
        wxf.J();
        String str = c;
        if (str != null) {
            return str;
        }
        throw new c3c("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    public static final Executor d() {
        ReentrantLock reentrantLock = i;
        reentrantLock.lock();
        try {
            if (b == null) {
                b = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            reentrantLock.unlock();
            Executor executor = b;
            if (executor != null) {
                return executor;
            }
            xq0.q("Required value was null.");
            return null;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String e() {
        String str = j;
        String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{str}, 1));
        return str;
    }

    public static final String f() {
        Date date = ja.l;
        ja N = n7w.N();
        String str = N != null ? N.k : null;
        String str2 = p;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1253231569) {
                if (hashCode == 28903346 && str.equals("instagram")) {
                    return c.r(str2, "facebook.com", "instagram.com", false);
                }
            } else if (str.equals("gaming")) {
                return c.r(str2, "facebook.com", "fb.gg", false);
            }
        }
        return str2;
    }

    public static final boolean g(Context context) {
        context.getClass();
        wxf.J();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    public static final synchronized boolean h() {
        boolean z;
        synchronized (j3c.class) {
            z = r;
        }
        return z;
    }

    public static final void i(Context context) {
        if (context == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                return;
            }
            if (c == null) {
                Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                if (obj instanceof String) {
                    String str = (String) obj;
                    Locale locale = Locale.ROOT;
                    locale.getClass();
                    String lowerCase = str.toLowerCase(locale);
                    lowerCase.getClass();
                    if (c.v(lowerCase, "fb", false)) {
                        c = str.substring(2);
                    } else {
                        c = str;
                    }
                } else if (obj instanceof Number) {
                    throw new c3c("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                }
            }
            if (d == null) {
                d = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
            }
            if (e == null) {
                e = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
            }
            if (h == 64206) {
                h = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
            }
            if (f == null) {
                f = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static final synchronized void j(Context context) {
        synchronized (j3c.class) {
            context.getClass();
            k(context);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0081, TRY_ENTER, TryCatch #0 {all -> 0x0081, blocks: (B:4:0x0003, B:9:0x0010, B:11:0x001a, B:13:0x0021, B:15:0x0029, B:16:0x002e, B:18:0x0039, B:19:0x003e, B:21:0x004e, B:23:0x0059, B:28:0x007e, B:29:0x0084, B:31:0x0088, B:33:0x008c, B:35:0x0092, B:37:0x0096, B:38:0x009e, B:39:0x00a3, B:40:0x00a4, B:42:0x00b0, B:45:0x0107, B:46:0x010c, B:47:0x010d, B:48:0x0112, B:53:0x0078, B:54:0x0113, B:55:0x011a, B:56:0x011b, B:57:0x0120, B:50:0x006b), top: B:3:0x0003, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039 A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:4:0x0003, B:9:0x0010, B:11:0x001a, B:13:0x0021, B:15:0x0029, B:16:0x002e, B:18:0x0039, B:19:0x003e, B:21:0x004e, B:23:0x0059, B:28:0x007e, B:29:0x0084, B:31:0x0088, B:33:0x008c, B:35:0x0092, B:37:0x0096, B:38:0x009e, B:39:0x00a3, B:40:0x00a4, B:42:0x00b0, B:45:0x0107, B:46:0x010c, B:47:0x010d, B:48:0x0112, B:53:0x0078, B:54:0x0113, B:55:0x011a, B:56:0x011b, B:57:0x0120, B:50:0x006b), top: B:3:0x0003, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004e A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:4:0x0003, B:9:0x0010, B:11:0x001a, B:13:0x0021, B:15:0x0029, B:16:0x002e, B:18:0x0039, B:19:0x003e, B:21:0x004e, B:23:0x0059, B:28:0x007e, B:29:0x0084, B:31:0x0088, B:33:0x008c, B:35:0x0092, B:37:0x0096, B:38:0x009e, B:39:0x00a3, B:40:0x00a4, B:42:0x00b0, B:45:0x0107, B:46:0x010c, B:47:0x010d, B:48:0x0112, B:53:0x0078, B:54:0x0113, B:55:0x011a, B:56:0x011b, B:57:0x0120, B:50:0x006b), top: B:3:0x0003, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:4:0x0003, B:9:0x0010, B:11:0x001a, B:13:0x0021, B:15:0x0029, B:16:0x002e, B:18:0x0039, B:19:0x003e, B:21:0x004e, B:23:0x0059, B:28:0x007e, B:29:0x0084, B:31:0x0088, B:33:0x008c, B:35:0x0092, B:37:0x0096, B:38:0x009e, B:39:0x00a3, B:40:0x00a4, B:42:0x00b0, B:45:0x0107, B:46:0x010c, B:47:0x010d, B:48:0x0112, B:53:0x0078, B:54:0x0113, B:55:0x011a, B:56:0x011b, B:57:0x0120, B:50:0x006b), top: B:3:0x0003, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088 A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:4:0x0003, B:9:0x0010, B:11:0x001a, B:13:0x0021, B:15:0x0029, B:16:0x002e, B:18:0x0039, B:19:0x003e, B:21:0x004e, B:23:0x0059, B:28:0x007e, B:29:0x0084, B:31:0x0088, B:33:0x008c, B:35:0x0092, B:37:0x0096, B:38:0x009e, B:39:0x00a3, B:40:0x00a4, B:42:0x00b0, B:45:0x0107, B:46:0x010c, B:47:0x010d, B:48:0x0112, B:53:0x0078, B:54:0x0113, B:55:0x011a, B:56:0x011b, B:57:0x0120, B:50:0x006b), top: B:3:0x0003, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010d A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:4:0x0003, B:9:0x0010, B:11:0x001a, B:13:0x0021, B:15:0x0029, B:16:0x002e, B:18:0x0039, B:19:0x003e, B:21:0x004e, B:23:0x0059, B:28:0x007e, B:29:0x0084, B:31:0x0088, B:33:0x008c, B:35:0x0092, B:37:0x0096, B:38:0x009e, B:39:0x00a3, B:40:0x00a4, B:42:0x00b0, B:45:0x0107, B:46:0x010c, B:47:0x010d, B:48:0x0112, B:53:0x0078, B:54:0x0113, B:55:0x011a, B:56:0x011b, B:57:0x0120, B:50:0x006b), top: B:3:0x0003, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011b A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:4:0x0003, B:9:0x0010, B:11:0x001a, B:13:0x0021, B:15:0x0029, B:16:0x002e, B:18:0x0039, B:19:0x003e, B:21:0x004e, B:23:0x0059, B:28:0x007e, B:29:0x0084, B:31:0x0088, B:33:0x008c, B:35:0x0092, B:37:0x0096, B:38:0x009e, B:39:0x00a3, B:40:0x00a4, B:42:0x00b0, B:45:0x0107, B:46:0x010c, B:47:0x010d, B:48:0x0112, B:53:0x0078, B:54:0x0113, B:55:0x011a, B:56:0x011b, B:57:0x0120, B:50:0x006b), top: B:3:0x0003, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final synchronized void k(Context context) {
        ActivityInfo activityInfo;
        Context context2;
        boolean a2;
        Context context3;
        synchronized (j3c.class) {
            try {
                context.getClass();
                AtomicBoolean atomicBoolean = n;
                if (atomicBoolean.get()) {
                    return;
                }
                PackageManager packageManager = context.getPackageManager();
                int i2 = 1;
                if (packageManager != null) {
                    try {
                        activityInfo = packageManager.getActivityInfo(new ComponentName(context, "com.facebook.FacebookActivity"), 1);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    if (activityInfo == null) {
                        Log.w("wxf", "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
                    }
                    if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1) {
                        Log.w("wxf", "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
                    }
                    Context applicationContext = context.getApplicationContext();
                    applicationContext.getClass();
                    g = applicationContext;
                    c3x.F(context);
                    context2 = g;
                    if (context2 != null) {
                        Intrinsics.j("applicationContext");
                        throw null;
                    }
                    i(context2);
                    if (gvt.D(c)) {
                        throw new c3c("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
                    }
                    atomicBoolean.set(true);
                    AtomicBoolean atomicBoolean2 = gtt.a;
                    boolean z = false;
                    Object[] objArr = 0;
                    if (!bp6.a.contains(gtt.class)) {
                        try {
                            gtt.i.e();
                            a2 = gtt.c.a();
                        } catch (Throwable th) {
                            bp6.a(gtt.class, th);
                        }
                        if (a2) {
                            r = true;
                        }
                        context3 = g;
                        if (context3 != null) {
                            Intrinsics.j("applicationContext");
                            throw null;
                        }
                        if ((context3 instanceof Application) && gtt.c()) {
                            Context context4 = g;
                            if (context4 == null) {
                                Intrinsics.j("applicationContext");
                                throw null;
                            }
                            oh.c((Application) context4, c);
                        }
                        q8c.c();
                        xwi.l();
                        l83 l83Var = l83.c;
                        Context context5 = g;
                        if (context5 == null) {
                            Intrinsics.j("applicationContext");
                            throw null;
                        }
                        weo.x(context5);
                        aqd aqdVar = new aqd(5, z);
                        aqdVar.c = new CountDownLatch(1);
                        d().execute(new FutureTask(new z68(i2, aqdVar)));
                        x6c.a(ogp.e, v6c.Instrument);
                        x6c.a(imp.e, v6c.AppEvents);
                        x6c.a(mvt.e, v6c.ChromeCustomTabsPrefetching);
                        x6c.a(d51.f, v6c.IgnoreAppSwitchToLoggedOut);
                        x6c.a(fs7.d, v6c.BypassAppSwitch);
                        d().execute(new FutureTask(new i3c(objArr == true ? 1 : 0)));
                        return;
                    }
                    a2 = false;
                    if (a2) {
                    }
                    context3 = g;
                    if (context3 != null) {
                    }
                }
                activityInfo = null;
                if (activityInfo == null) {
                }
                if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1) {
                }
                Context applicationContext2 = context.getApplicationContext();
                applicationContext2.getClass();
                g = applicationContext2;
                c3x.F(context);
                context2 = g;
                if (context2 != null) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

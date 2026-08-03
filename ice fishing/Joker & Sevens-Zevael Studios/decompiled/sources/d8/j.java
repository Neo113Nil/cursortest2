package d8;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Base64;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f1790c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static h0 f1791d;

    /* renamed from: a, reason: collision with root package name */
    public final Object f1792a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1793b;

    public j(ExecutorService executorService) {
        this.f1793b = new s.f(0);
        this.f1792a = executorService;
    }

    public static g7.o a(Context context, Intent intent, boolean z10) {
        h0 h0Var;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f1790c) {
            try {
                if (f1791d == null) {
                    f1791d = new h0(context);
                }
                h0Var = f1791d;
            } finally {
            }
        }
        if (!z10) {
            return h0Var.b(intent).d(new a4.e(0), new d6.f(2));
        }
        if (s.c().e(context)) {
            synchronized (e0.f1768b) {
                try {
                    e0.a(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        e0.f1769c.a(e0.f1767a);
                    }
                    g7.o b2 = h0Var.b(intent);
                    c6.f fVar = new c6.f(5, intent);
                    b2.getClass();
                    b2.f2553b.b(new g7.k((Executor) g7.i.f2538a, (g7.c) fVar));
                    b2.o();
                } finally {
                }
            }
        } else {
            h0Var.b(intent);
        }
        return i7.b.u(-1);
    }

    public g7.o b(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final Context context = (Context) this.f1792a;
        a4.e eVar = (a4.e) this.f1793b;
        boolean z10 = context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z11 = (intent.getFlags() & 268435456) != 0;
        return (!z10 || z11) ? i7.b.o(eVar, new Callable() { // from class: d8.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                ServiceInfo serviceInfo;
                String str2;
                int i10;
                ComponentName startService;
                Context context2 = context;
                Intent intent2 = intent;
                s c3 = s.c();
                c3.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ArrayDeque) c3.f1815j).offer(intent2);
                Intent intent3 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent3.setPackage(context2.getPackageName());
                synchronized (c3) {
                    try {
                        str = (String) c3.f1812g;
                        if (str == null) {
                            ResolveInfo resolveService = context2.getPackageManager().resolveService(intent3, 0);
                            if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                                if (context2.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                                    if (str2.startsWith(".")) {
                                        c3.f1812g = context2.getPackageName() + serviceInfo.name;
                                    } else {
                                        c3.f1812g = serviceInfo.name;
                                    }
                                    str = (String) c3.f1812g;
                                }
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                                str = null;
                            }
                            Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                            str = null;
                        }
                    } finally {
                    }
                }
                if (str != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str));
                    }
                    intent3.setClassName(context2.getPackageName(), str);
                }
                try {
                    if (c3.e(context2)) {
                        startService = e0.c(context2, intent3);
                    } else {
                        startService = context2.startService(intent3);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (startService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i10 = 404;
                    } else {
                        i10 = -1;
                    }
                } catch (IllegalStateException e10) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e10);
                    i10 = 402;
                } catch (SecurityException e11) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e11);
                    i10 = 401;
                }
                return Integer.valueOf(i10);
            }
        }).e(eVar, new g7.a() { // from class: d8.i
            @Override // g7.a
            public final Object b(g7.o oVar) {
                return ((Integer) oVar.g()).intValue() != 402 ? oVar : j.a(context, intent, z11).d(new a4.e(0), new d6.f(1));
            }
        }) : a(context, intent, z11);
    }

    public j(Context context) {
        this.f1792a = context;
        this.f1793b = new a4.e(0);
    }
}

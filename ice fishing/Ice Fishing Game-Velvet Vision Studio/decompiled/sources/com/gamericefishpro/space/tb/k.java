package com.gamericefishpro.space.tb;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    public static final Object c = new Object();
    public static g0 d;
    public final Object a;
    public final Object b;

    public k(ExecutorService executorService) {
        this.b = new com.gamericefishpro.space.t.e(0);
        this.a = executorService;
    }

    public static Task a(Context context, Intent intent, boolean z) {
        g0 g0Var;
        Log.isLoggable("FirebaseMessaging", 3);
        synchronized (c) {
            try {
                if (d == null) {
                    d = new g0(context);
                }
                g0Var = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z) {
            return g0Var.b(intent).f(new com.gamericefishpro.space.o.a(1), new j(0));
        }
        if (s.f().i(context)) {
            synchronized (d0.b) {
                try {
                    d0.a(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        d0.c.a(d0.a);
                    }
                    g0Var.b(intent).addOnCompleteListener(new com.gamericefishpro.space.a8.b(12, intent));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            g0Var.b(intent);
        }
        return com.gamericefishpro.space.d9.h.w(-1);
    }

    public Task b(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final Context context = (Context) this.a;
        com.gamericefishpro.space.o.a aVar = (com.gamericefishpro.space.o.a) this.b;
        boolean z = context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z2 = (intent.getFlags() & 268435456) != 0;
        return (!z || z2) ? com.gamericefishpro.space.d9.h.l(aVar, new Callable() { // from class: com.gamericefishpro.space.tb.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                ServiceInfo serviceInfo;
                String str2;
                int i;
                Context context2 = context;
                Intent intent2 = intent;
                s sVarF = s.f();
                sVarF.getClass();
                Log.isLoggable("FirebaseMessaging", 3);
                ((ArrayDeque) sVarF.v).offer(intent2);
                Intent intent3 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent3.setPackage(context2.getPackageName());
                synchronized (sVarF) {
                    try {
                        str = (String) sVarF.d;
                        if (str == null) {
                            ResolveInfo resolveInfoResolveService = context2.getPackageManager().resolveService(intent3, 0);
                            if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) {
                                Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                            } else if (!context2.getPackageName().equals(serviceInfo.packageName) || (str2 = serviceInfo.name) == null) {
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                            } else {
                                if (str2.startsWith(".")) {
                                    sVarF.d = context2.getPackageName() + serviceInfo.name;
                                } else {
                                    sVarF.d = serviceInfo.name;
                                }
                                str = (String) sVarF.d;
                            }
                            str = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (str != null) {
                    Log.isLoggable("FirebaseMessaging", 3);
                    intent3.setClassName(context2.getPackageName(), str);
                }
                try {
                    if ((sVarF.i(context2) ? d0.c(context2, intent3) : context2.startService(intent3)) == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i = 404;
                    } else {
                        i = -1;
                    }
                } catch (IllegalStateException e) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e);
                    i = 402;
                } catch (SecurityException e2) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e2);
                    i = 401;
                }
                return Integer.valueOf(i);
            }
        }).g(aVar, new com.gamericefishpro.space.r9.a() { // from class: com.gamericefishpro.space.tb.i
            @Override // com.gamericefishpro.space.r9.a
            public final Object e(Task task) {
                return ((Integer) task.getResult()).intValue() != 402 ? task : k.a(context, intent, z2).f(new com.gamericefishpro.space.o.a(1), new com.gamericefishpro.space.bb.s(29));
            }
        }) : a(context, intent, z2);
    }

    public k(Context context) {
        this.a = context;
        this.b = new com.gamericefishpro.space.o.a(1);
    }
}

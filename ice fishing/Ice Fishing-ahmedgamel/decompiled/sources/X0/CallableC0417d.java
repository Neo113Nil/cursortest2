package X0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.airbnb.lottie.LottieAnimationView;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: X0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC0417d implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3594a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3595b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3596c;

    public /* synthetic */ CallableC0417d(int i, Object obj, Object obj2) {
        this.f3594a = i;
        this.f3595b = obj;
        this.f3596c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ServiceInfo serviceInfo;
        String str;
        int i;
        ComponentName startService;
        String str2 = null;
        switch (this.f3594a) {
            case 0:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f3595b;
                boolean z3 = lottieAnimationView.f5660F;
                String str3 = (String) this.f3596c;
                if (!z3) {
                    return m.b(lottieAnimationView.getContext(), str3, null);
                }
                Context context = lottieAnimationView.getContext();
                HashMap hashMap = m.f3639a;
                return m.b(context, str3, "asset_" + str3);
            default:
                Context context2 = (Context) this.f3595b;
                Intent intent = (Intent) this.f3596c;
                j4.q b9 = j4.q.b();
                b9.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ArrayDeque) b9.f38436w).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context2.getPackageName());
                synchronized (b9) {
                    try {
                        String str4 = (String) b9.f38433n;
                        if (str4 != null) {
                            str2 = str4;
                        } else {
                            ResolveInfo resolveService = context2.getPackageManager().resolveService(intent2, 0);
                            if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                                if (context2.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                                    if (str.startsWith(com.anythink.core.common.d.j.f12378z)) {
                                        b9.f38433n = context2.getPackageName() + serviceInfo.name;
                                    } else {
                                        b9.f38433n = serviceInfo.name;
                                    }
                                    str2 = (String) b9.f38433n;
                                }
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                            }
                            Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                        }
                    } finally {
                    }
                }
                if (str2 != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str2));
                    }
                    intent2.setClassName(context2.getPackageName(), str2);
                }
                try {
                    if (b9.d(context2)) {
                        startService = j4.y.c(context2, intent2);
                    } else {
                        startService = context2.startService(intent2);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (startService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i = 404;
                    } else {
                        i = -1;
                    }
                } catch (IllegalStateException e9) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e9);
                    i = 402;
                } catch (SecurityException e10) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e10);
                    i = 401;
                }
                return Integer.valueOf(i);
        }
    }
}

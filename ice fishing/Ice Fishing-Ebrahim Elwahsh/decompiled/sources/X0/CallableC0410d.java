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
public final /* synthetic */ class CallableC0410d implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3650a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3651b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3652c;

    public /* synthetic */ CallableC0410d(int i, Object obj, Object obj2) {
        this.f3650a = i;
        this.f3651b = obj;
        this.f3652c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ServiceInfo serviceInfo;
        String str;
        int i;
        ComponentName startService;
        String str2 = null;
        switch (this.f3650a) {
            case 0:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f3651b;
                boolean z8 = lottieAnimationView.f5817F;
                String str3 = (String) this.f3652c;
                if (!z8) {
                    return m.b(lottieAnimationView.getContext(), str3, null);
                }
                Context context = lottieAnimationView.getContext();
                HashMap hashMap = m.f3695a;
                return m.b(context, str3, "asset_" + str3);
            default:
                Context context2 = (Context) this.f3651b;
                Intent intent = (Intent) this.f3652c;
                f4.p f6 = f4.p.f();
                f6.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ArrayDeque) f6.f37766x).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context2.getPackageName());
                synchronized (f6) {
                    try {
                        String str4 = (String) f6.f37763u;
                        if (str4 != null) {
                            str2 = str4;
                        } else {
                            ResolveInfo resolveService = context2.getPackageManager().resolveService(intent2, 0);
                            if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                                if (context2.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                                    if (str.startsWith(com.anythink.core.common.d.j.f12535z)) {
                                        f6.f37763u = context2.getPackageName() + serviceInfo.name;
                                    } else {
                                        f6.f37763u = serviceInfo.name;
                                    }
                                    str2 = (String) f6.f37763u;
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
                    if (f6.j(context2)) {
                        startService = f4.x.c(context2, intent2);
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
                } catch (IllegalStateException e6) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e6);
                    i = 402;
                } catch (SecurityException e9) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e9);
                    i = 401;
                }
                return Integer.valueOf(i);
        }
    }
}

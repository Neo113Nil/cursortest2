package Z0;

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

/* renamed from: Z0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC0421d implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3946a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3947b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3948c;

    public /* synthetic */ CallableC0421d(int i, Object obj, Object obj2) {
        this.f3946a = i;
        this.f3947b = obj;
        this.f3948c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ServiceInfo serviceInfo;
        String str;
        int i;
        ComponentName startService;
        String str2 = null;
        switch (this.f3946a) {
            case 0:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f3947b;
                boolean z6 = lottieAnimationView.f6446F;
                String str3 = (String) this.f3948c;
                if (!z6) {
                    return m.b(lottieAnimationView.getContext(), str3, null);
                }
                Context context = lottieAnimationView.getContext();
                HashMap hashMap = m.f3991a;
                return m.b(context, str3, "asset_" + str3);
            default:
                Context context2 = (Context) this.f3947b;
                Intent intent = (Intent) this.f3948c;
                l4.q g9 = l4.q.g();
                g9.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ArrayDeque) g9.f38948w).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context2.getPackageName());
                synchronized (g9) {
                    try {
                        String str4 = (String) g9.f38945n;
                        if (str4 != null) {
                            str2 = str4;
                        } else {
                            ResolveInfo resolveService = context2.getPackageManager().resolveService(intent2, 0);
                            if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                                if (context2.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                                    if (str.startsWith(com.anythink.core.common.d.j.f13164z)) {
                                        g9.f38945n = context2.getPackageName() + serviceInfo.name;
                                    } else {
                                        g9.f38945n = serviceInfo.name;
                                    }
                                    str2 = (String) g9.f38945n;
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
                    if (g9.i(context2)) {
                        startService = l4.y.c(context2, intent2);
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

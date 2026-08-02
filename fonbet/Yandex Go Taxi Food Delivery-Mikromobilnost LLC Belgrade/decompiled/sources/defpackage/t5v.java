package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.util.Log;
import io.appmetrica.analytics.impl.Id;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;

/* loaded from: classes9.dex */
public final /* synthetic */ class t5v implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ t5v(Context context, boolean z, atx0 atx0Var) {
        this.c = context;
        this.b = z;
        this.w = atx0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.w;
        boolean z = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                Id.a((Id) obj2, (LocationControllerObserver) obj, z);
                return;
            default:
                Context context = (Context) obj2;
                atx0 atx0Var = (atx0) obj;
                try {
                    if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                        SharedPreferences.Editor edit = sb2.v(context).edit();
                        edit.putBoolean("proxy_notification_initialized", true);
                        edit.apply();
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                        if (z) {
                            notificationManager.setNotificationDelegate("com.google.android.gms");
                        } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                            notificationManager.setNotificationDelegate(null);
                        }
                    } else {
                        Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                    }
                    return;
                } finally {
                    atx0Var.c(null);
                }
        }
    }

    public /* synthetic */ t5v(Id id, LocationControllerObserver locationControllerObserver, boolean z) {
        this.c = id;
        this.w = locationControllerObserver;
        this.b = z;
    }
}

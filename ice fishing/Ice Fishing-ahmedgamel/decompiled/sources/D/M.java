package D;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: d, reason: collision with root package name */
    public static String f353d;

    /* renamed from: g, reason: collision with root package name */
    public static L f356g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f357a;

    /* renamed from: b, reason: collision with root package name */
    public final NotificationManager f358b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f352c = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static HashSet f354e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public static final Object f355f = new Object();

    public M(Context context) {
        this.f357a = context;
        this.f358b = (NotificationManager) context.getSystemService("notification");
    }

    public final void a(int i, Notification notification) {
        Bundle bundle = notification.extras;
        NotificationManager notificationManager = this.f358b;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            notificationManager.notify(null, i, notification);
            return;
        }
        I i4 = new I(this.f357a.getPackageName(), i, notification);
        synchronized (f355f) {
            try {
                if (f356g == null) {
                    f356g = new L(this.f357a.getApplicationContext());
                }
                f356g.f349u.obtainMessage(0, i4).sendToTarget();
            } catch (Throwable th) {
                throw th;
            }
        }
        notificationManager.cancel(null, i);
    }
}

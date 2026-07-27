package D;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: d, reason: collision with root package name */
    public static String f456d;

    /* renamed from: g, reason: collision with root package name */
    public static M f459g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f460a;

    /* renamed from: b, reason: collision with root package name */
    public final NotificationManager f461b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f455c = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static HashSet f457e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public static final Object f458f = new Object();

    public N(Context context) {
        this.f460a = context;
        this.f461b = (NotificationManager) context.getSystemService("notification");
    }

    public final void a(int i, Notification notification) {
        Bundle bundle = notification.extras;
        NotificationManager notificationManager = this.f461b;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            notificationManager.notify(null, i, notification);
            return;
        }
        J j6 = new J(this.f460a.getPackageName(), i, notification);
        synchronized (f458f) {
            try {
                if (f459g == null) {
                    f459g = new M(this.f460a.getApplicationContext());
                }
                f459g.f452u.obtainMessage(0, j6).sendToTarget();
            } catch (Throwable th) {
                throw th;
            }
        }
        notificationManager.cancel(null, i);
    }
}

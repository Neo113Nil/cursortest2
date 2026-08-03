package x2;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: d, reason: collision with root package name */
    public static String f8278d;

    /* renamed from: g, reason: collision with root package name */
    public static p f8281g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f8282a;

    /* renamed from: b, reason: collision with root package name */
    public final NotificationManager f8283b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f8277c = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static HashSet f8279e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public static final Object f8280f = new Object();

    public q(Context context) {
        this.f8282a = context;
        this.f8283b = (NotificationManager) context.getSystemService("notification");
    }

    public final void a(int i10, Notification notification) {
        NotificationManager notificationManager = this.f8283b;
        Bundle bundle = notification.extras;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            notificationManager.notify(null, i10, notification);
            return;
        }
        m mVar = new m(this.f8282a.getPackageName(), i10, notification);
        synchronized (f8280f) {
            try {
                if (f8281g == null) {
                    f8281g = new p(this.f8282a.getApplicationContext());
                }
                f8281g.f8274b.obtainMessage(0, mVar).sendToTarget();
            } catch (Throwable th) {
                throw th;
            }
        }
        notificationManager.cancel(null, i10);
    }
}

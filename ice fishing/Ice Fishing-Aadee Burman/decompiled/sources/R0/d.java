package R0;

import J0.s;
import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;
import android.util.Log;
import androidx.work.impl.foreground.SystemForegroundService;

/* loaded from: classes.dex */
public abstract class d {
    public static void a(Service service, int i, Notification notification, int i6) {
        try {
            service.startForeground(i, notification, i6);
        } catch (ForegroundServiceStartNotAllowedException e9) {
            s d2 = s.d();
            String str = SystemForegroundService.f5392y;
            if (d2.f1405a <= 5) {
                Log.w(str, "Unable to start foreground service", e9);
            }
        }
    }
}

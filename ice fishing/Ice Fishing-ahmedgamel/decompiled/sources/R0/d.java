package R0;

import J0.r;
import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;
import android.util.Log;
import androidx.work.impl.foreground.SystemForegroundService;

/* loaded from: classes.dex */
public abstract class d {
    public static void a(Service service, int i, Notification notification, int i4) {
        try {
            service.startForeground(i, notification, i4);
        } catch (ForegroundServiceStartNotAllowedException e9) {
            r d9 = r.d();
            String str = SystemForegroundService.f5357y;
            if (d9.f1433a <= 5) {
                Log.w(str, "Unable to start foreground service", e9);
            }
        }
    }
}

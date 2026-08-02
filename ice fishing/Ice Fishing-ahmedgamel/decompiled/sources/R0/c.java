package R0;

import android.app.Notification;
import android.app.Service;

/* loaded from: classes.dex */
public abstract class c {
    public static void a(Service service, int i, Notification notification, int i4) {
        service.startForeground(i, notification, i4);
    }
}

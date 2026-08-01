package R0;

import android.app.Notification;
import android.app.Service;

/* loaded from: classes.dex */
public abstract class c {
    public static void a(Service service, int i, Notification notification, int i6) {
        service.startForeground(i, notification, i6);
    }
}

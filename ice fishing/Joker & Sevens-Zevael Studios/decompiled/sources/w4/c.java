package w4;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7657g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Notification f7658h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7659i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f7660j;

    public c(SystemForegroundService systemForegroundService, int i10, Notification notification, int i11) {
        this.f7660j = systemForegroundService;
        this.f7657g = i10;
        this.f7658h = notification;
        this.f7659i = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = Build.VERSION.SDK_INT;
        int i11 = this.f7659i;
        Notification notification = this.f7658h;
        int i12 = this.f7657g;
        SystemForegroundService systemForegroundService = this.f7660j;
        if (i10 >= 31) {
            e.a(systemForegroundService, i12, notification, i11);
        } else if (i10 >= 29) {
            d.a(systemForegroundService, i12, notification, i11);
        } else {
            systemForegroundService.startForeground(i12, notification);
        }
    }
}

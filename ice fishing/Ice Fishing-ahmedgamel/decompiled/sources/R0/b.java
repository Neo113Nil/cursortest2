package R0;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.work.impl.foreground.SystemForegroundService;
import p.BinderC4819e;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2735n = 0;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2736u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f2737v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Parcelable f2738w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f2739x;

    public b(SystemForegroundService systemForegroundService, int i, Notification notification, int i4) {
        this.f2739x = systemForegroundService;
        this.f2736u = i;
        this.f2738w = notification;
        this.f2737v = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2735n) {
            case 0:
                int i = Build.VERSION.SDK_INT;
                int i4 = this.f2737v;
                Notification notification = (Notification) this.f2738w;
                int i6 = this.f2736u;
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.f2739x;
                if (i < 31) {
                    if (i < 29) {
                        systemForegroundService.startForeground(i6, notification);
                        break;
                    } else {
                        c.a(systemForegroundService, i6, notification, i4);
                        break;
                    }
                } else {
                    d.a(systemForegroundService, i6, notification, i4);
                    break;
                }
            default:
                ((BinderC4819e) this.f2739x).f39796u.c(this.f2736u, this.f2737v, (Bundle) this.f2738w);
                break;
        }
    }

    public b(BinderC4819e binderC4819e, int i, int i4, Bundle bundle) {
        this.f2739x = binderC4819e;
        this.f2736u = i;
        this.f2737v = i4;
        this.f2738w = bundle;
    }
}

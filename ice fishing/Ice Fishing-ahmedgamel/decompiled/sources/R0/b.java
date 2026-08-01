package R0;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.work.impl.foreground.SystemForegroundService;
import p.BinderC4815e;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2698n = 0;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2699u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f2700v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Parcelable f2701w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f2702x;

    public b(SystemForegroundService systemForegroundService, int i, Notification notification, int i6) {
        this.f2702x = systemForegroundService;
        this.f2699u = i;
        this.f2701w = notification;
        this.f2700v = i6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2698n) {
            case 0:
                int i = Build.VERSION.SDK_INT;
                int i6 = this.f2700v;
                Notification notification = (Notification) this.f2701w;
                int i9 = this.f2699u;
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.f2702x;
                if (i < 31) {
                    if (i < 29) {
                        systemForegroundService.startForeground(i9, notification);
                        break;
                    } else {
                        c.a(systemForegroundService, i9, notification, i6);
                        break;
                    }
                } else {
                    d.a(systemForegroundService, i9, notification, i6);
                    break;
                }
            default:
                ((BinderC4815e) this.f2702x).f39688u.c(this.f2699u, this.f2700v, (Bundle) this.f2701w);
                break;
        }
    }

    public b(BinderC4815e binderC4815e, int i, int i6, Bundle bundle) {
        this.f2702x = binderC4815e;
        this.f2699u = i;
        this.f2700v = i6;
        this.f2701w = bundle;
    }
}

package androidx.work.impl.background.systemalarm;

import J0.s;
import K0.p;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5383a = s.f("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        s.d().a(f5383a, "Received intent " + intent);
        try {
            p b9 = p.b(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            synchronized (p.f1531m) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = b9.i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    b9.i = goAsync;
                    if (b9.f1539h) {
                        goAsync.finish();
                        b9.i = null;
                    }
                } finally {
                }
            }
        } catch (IllegalStateException e9) {
            s.d().c(f5383a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e9);
        }
    }
}

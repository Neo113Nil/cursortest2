package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import o4.o;
import p4.n;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f772a = o.f("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        o.d().a(f772a, "Received intent " + intent);
        try {
            n a6 = n.a(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            synchronized (n.f5492m) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = a6.f5501i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    a6.f5501i = goAsync;
                    if (a6.f5500h) {
                        goAsync.finish();
                        a6.f5501i = null;
                    }
                } finally {
                }
            }
        } catch (IllegalStateException e10) {
            o.d().c(f772a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
        }
    }
}

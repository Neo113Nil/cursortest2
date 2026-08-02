package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.g4w;
import defpackage.jsg;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    public static final String a = jsg.n("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        jsg.j().e(a, "Received intent " + intent);
        try {
            g4w d = g4w.d(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            d.getClass();
            synchronized (g4w.m) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = d.i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    d.i = goAsync;
                    if (d.h) {
                        goAsync.finish();
                        d.i = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e) {
            jsg.j().h(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}

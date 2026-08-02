package androidx.work.impl.utils;

import J0.r;
import T0.e;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* loaded from: classes.dex */
public class ForceStopRunnable$BroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5362a = r.f("ForceStopRunnable$Rcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
            return;
        }
        if (r.d().f1433a <= 2) {
            Log.v(f5362a, "Rescheduling alarm that keeps track of force-stops.");
        }
        e.c(context);
    }
}

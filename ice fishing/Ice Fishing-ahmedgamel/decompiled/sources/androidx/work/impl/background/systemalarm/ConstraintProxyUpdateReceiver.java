package androidx.work.impl.background.systemalarm;

import E2.x;
import J0.r;
import K0.p;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import w.AbstractC5128c;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5347a = r.f("ConstrntProxyUpdtRecvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            p.b(context).f1644d.h(new x(5, intent, context, goAsync()));
        } else {
            r.d().a(f5347a, AbstractC5128c.f("Ignoring unknown action ", action));
        }
    }
}

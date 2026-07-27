package androidx.work.impl.background.systemalarm;

import C2.y;
import J0.s;
import K0.p;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import u1.h;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5382a = s.f("ConstrntProxyUpdtRecvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            p.b(context).f1535d.i(new y(8, intent, context, goAsync()));
        } else {
            s.d().a(f5382a, h.f("Ignoring unknown action ", action));
        }
    }
}

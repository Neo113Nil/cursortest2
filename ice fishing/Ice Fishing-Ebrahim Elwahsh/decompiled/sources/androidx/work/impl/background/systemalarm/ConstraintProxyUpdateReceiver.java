package androidx.work.impl.background.systemalarm;

import B2.z;
import J0.s;
import K0.p;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5494a = s.f("ConstrntProxyUpdtRecvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            p.b(context).f1533d.i(new z(intent, context, goAsync(), 6));
        } else {
            s.d().a(f5494a, AbstractC5051n.f("Ignoring unknown action ", action));
        }
    }
}

package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import defpackage.g4w;
import defpackage.jsg;
import defpackage.trj;
import defpackage.urj;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String a = jsg.n("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        jsg j = jsg.j();
        String str = a;
        j.e(str, "Requesting diagnostics");
        try {
            context.getClass();
            g4w d = g4w.d(context);
            d.getClass();
            d.a((urj) new trj(DiagnosticsWorker.class).a());
        } catch (IllegalStateException e) {
            jsg.j().h(str, "WorkManager is not initialized", e);
        }
    }
}

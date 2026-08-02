package androidx.work.impl.diagnostics;

import J0.r;
import K0.p;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import b3.e;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5356a = r.f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        r d9 = r.d();
        String str = f5356a;
        d9.a(str, "Requesting diagnostics");
        try {
            p.b(context).a(new e(DiagnosticsWorker.class).m());
        } catch (IllegalStateException e9) {
            r.d().c(str, "WorkManager is not initialized", e9);
        }
    }
}

package androidx.work.impl.diagnostics;

import a5.c;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import java.util.Collections;
import java.util.List;
import o4.o;
import p4.j;
import p4.n;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f780a = o.f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        o d10 = o.d();
        String str = f780a;
        d10.a(str, "Requesting diagnostics");
        try {
            n a6 = n.a(context);
            List singletonList = Collections.singletonList(new c(DiagnosticsWorker.class).m());
            if (singletonList.isEmpty()) {
                throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
            }
            new j(a6, null, singletonList).N();
        } catch (IllegalStateException e10) {
            o.d().c(str, "WorkManager is not initialized", e10);
        }
    }
}

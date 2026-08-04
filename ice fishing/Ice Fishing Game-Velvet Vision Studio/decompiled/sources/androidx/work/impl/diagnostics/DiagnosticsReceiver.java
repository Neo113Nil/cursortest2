package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import com.gamericefishpro.space.a8.c;
import com.gamericefishpro.space.l6.q;
import com.gamericefishpro.space.m6.k;
import com.gamericefishpro.space.m6.o;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String a = q.d("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        q.c().getClass();
        try {
            o oVarA = o.a(context);
            Intrinsics.checkNotNullParameter(DiagnosticsWorker.class, "workerClass");
            List listSingletonList = Collections.singletonList(new c(DiagnosticsWorker.class).f());
            if (listSingletonList.isEmpty()) {
                throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
            }
            new k(oVarA, null, listSingletonList).d0();
        } catch (IllegalStateException e) {
            q.c().b(a, "WorkManager is not initialized", e);
        }
    }
}

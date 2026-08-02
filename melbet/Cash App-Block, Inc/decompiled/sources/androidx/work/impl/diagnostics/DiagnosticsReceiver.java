package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.Logger$LogcatLogger;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.workers.DiagnosticsWorker;
import com.squareup.wire.GrpcMethod;

/* loaded from: classes3.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String TAG = Logger$LogcatLogger.tagWithPrefix("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Logger$LogcatLogger logger$LogcatLogger = Logger$LogcatLogger.get();
        String str = TAG;
        logger$LogcatLogger.debug(str, "Requesting diagnostics");
        try {
            context.getClass();
            WorkManagerImpl.getInstance$1(context).enqueue(new GrpcMethod(DiagnosticsWorker.class).build());
        } catch (IllegalStateException e) {
            Logger$LogcatLogger.get().error(str, "WorkManager is not initialized", e);
        }
    }
}

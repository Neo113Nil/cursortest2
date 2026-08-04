package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.gamericefishpro.space.l6.q;
import com.gamericefishpro.space.m6.o;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    public static final String a = q.d("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        q qVarC = q.c();
        Objects.toString(intent);
        qVarC.getClass();
        try {
            o oVarA = o.a(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            synchronized (o.m) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = oVarA.i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    oVarA.i = pendingResultGoAsync;
                    if (oVarA.h) {
                        pendingResultGoAsync.finish();
                        oVarA.i = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e) {
            q.c().b(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}

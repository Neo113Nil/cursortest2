package io.appmetrica.analytics.push.internal.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import io.appmetrica.analytics.push.coreutils.internal.commands.Commands;
import io.appmetrica.analytics.push.coreutils.internal.utils.TrackersHub;
import io.appmetrica.analytics.push.impl.D;
import io.appmetrica.analytics.push.impl.E;
import io.appmetrica.analytics.push.impl.G;
import io.appmetrica.analytics.push.impl.H2;
import io.appmetrica.analytics.push.impl.RunnableC1014b2;
import io.appmetrica.analytics.push.logger.internal.PublicLogger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes4.dex */
public class PushService extends Service {
    private final E a = new E();
    private final ExecutorService b = Executors.newSingleThreadExecutor();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        try {
            String stringExtra = intent.getStringExtra(Commands.EXTRA_COMMAND);
            G.a(stringExtra, intent.getLongExtra(Commands.EXTRA_COMMAND_RECEIVED_TIME, -1L), H2.a(intent.getExtras()), "PushService");
            D d = (D) this.a.a.get(stringExtra);
            if (d == null) {
                return 2;
            }
            this.b.execute(new RunnableC1014b2(this, d, intent));
            return 2;
        } catch (Throwable th) {
            TrackersHub.getInstance().reportError("Failed to handle command ", th);
            PublicLogger.INSTANCE.error(th, "An unexpected error occurred while running the AppMetrica Push SDK. You can report it via https://appmetrica.io/docs/troubleshooting/other.html", new Object[0]);
            return 2;
        }
    }
}

package io.appmetrica.analytics.push.internal.service;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Bundle;
import io.appmetrica.analytics.push.coreutils.internal.commands.Commands;
import io.appmetrica.analytics.push.coreutils.internal.utils.TrackersHub;
import io.appmetrica.analytics.push.impl.D;
import io.appmetrica.analytics.push.impl.E;
import io.appmetrica.analytics.push.impl.G;
import io.appmetrica.analytics.push.impl.H2;
import io.appmetrica.analytics.push.impl.V1;
import io.appmetrica.analytics.push.logger.internal.PublicLogger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes9.dex */
public class PushJobService extends JobService {
    private final E a = new E();
    private final ExecutorService b = Executors.newSingleThreadExecutor();

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        if (jobParameters == null) {
            return false;
        }
        try {
            Bundle transientExtras = jobParameters.getTransientExtras();
            String string = transientExtras.getString(Commands.EXTRA_COMMAND);
            G.a(string, transientExtras.getLong(Commands.EXTRA_COMMAND_RECEIVED_TIME, -1L), H2.a(transientExtras), "PushJobService");
            D d = (D) this.a.a.get(string);
            if (d == null) {
                return false;
            }
            this.b.execute(new V1(this, d, transientExtras, jobParameters));
            return true;
        } catch (Throwable th) {
            TrackersHub.getInstance().reportError("Failed to handle command ", th);
            PublicLogger.INSTANCE.error(th, "An unexpected error occurred while running the AppMetrica Push SDK. You can report it via https://appmetrica.io/docs/troubleshooting/other.html", new Object[0]);
            return false;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}

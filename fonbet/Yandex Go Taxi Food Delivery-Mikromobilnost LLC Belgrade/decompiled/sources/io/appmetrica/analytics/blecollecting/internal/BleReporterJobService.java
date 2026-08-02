package io.appmetrica.analytics.blecollecting.internal;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import defpackage.mh3;
import io.appmetrica.analytics.blecollecting.impl.C0148c;
import io.appmetrica.analytics.blecollecting.impl.C0149d;
import io.appmetrica.analytics.blecollecting.impl.C0159n;
import io.appmetrica.analytics.blecollecting.impl.G;
import io.appmetrica.analytics.blecollecting.internal.config.RemoteBleCollectingConfig;
import io.appmetrica.analytics.blewrapper.internal.BleScanResultProvider;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"Lio/appmetrica/analytics/blecollecting/internal/BleReporterJobService;", "Landroid/app/job/JobService;", "Landroid/app/job/JobParameters;", "jobParameters", "", "onStartJob", "onStopJob", "<init>", "()V", "ble-collecting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class BleReporterJobService extends JobService {
    private final Handler a = new Handler(Looper.getMainLooper());
    private final C0149d b = new C0149d();
    private final BleScanResultProvider c = new BleScanResultProvider();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(BleReporterJobService bleReporterJobService, JobParameters jobParameters) {
        bleReporterJobService.jobFinished(jobParameters, false);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        RemoteBleCollectingConfig model;
        if (jobParameters != null) {
            try {
                Bundle transientExtras = jobParameters.getTransientExtras();
                if (transientExtras != null) {
                    C0149d c0149d = this.b;
                    c0149d.getClass();
                    byte[] byteArray = transientExtras.getByteArray("io.appmetrica.analytics.blecollecting.REMOTE_BLE_COLLECTING_CONFIG_PROTO_KEY");
                    C0148c config = (byteArray == null || (model = c0149d.a.toModel(byteArray)) == null) ? null : model.getConfig();
                    if (config == null) {
                        jobFinished(jobParameters, false);
                        return false;
                    }
                    long j = transientExtras.getLong("io.appmetrica.analytics.blecollecting.BLE_TIMESTAMP_KEY", 0L);
                    for (G g : config.b) {
                        new C0159n(this, g).a(this.c.getFilteredScanResult(transientExtras, g.a), j);
                    }
                    this.a.postDelayed(new mh3(14, this, jobParameters), config.c);
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}

package io.appmetrica.analytics.blecollecting.internal;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import defpackage.t26;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0011"}, d2 = {"Lio/appmetrica/analytics/blecollecting/internal/BleScanReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/os/Bundle;", "a", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lzy11;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "", "Ljava/lang/String;", "tag", "ble-collecting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class BleScanReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: from kotlin metadata */
    private final String tag = "[BleScanReceiver]";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer a(BleScanReceiver bleScanReceiver, Intent intent, Context context, JobScheduler jobScheduler) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        return Integer.valueOf(jobScheduler.schedule(new JobInfo.Builder(1998341, new ComponentName(context, (Class<?>) BleReporterJobService.class)).setTransientExtras(bleScanReceiver.a(extras)).build()));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        SystemServiceUtils.accessSystemServiceByNameSafely(context, "jobscheduler", "scheduling report", "JobScheduler", new t26(0, this, intent, context));
    }

    private final Bundle a(Bundle bundle) {
        bundle.putLong("io.appmetrica.analytics.blecollecting.BLE_TIMESTAMP_KEY", new SystemTimeProvider().currentTimeMillis());
        return bundle;
    }
}

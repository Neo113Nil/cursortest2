package org.altbeacon.bluetooth;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import defpackage.kbs;

/* loaded from: classes4.dex */
public class BluetoothTestJob extends JobService {
    private static final String TAG = "BluetoothTestJob";
    public static final /* synthetic */ int a = 0;
    private static int sOverrideJobId = -1;
    private Handler mHandler = null;
    private HandlerThread mHandlerThread = null;

    public static int getJobId(Context context) {
        ServiceInfo serviceInfo;
        Bundle bundle;
        int i = sOverrideJobId;
        if (i >= 0) {
            return i;
        }
        try {
            serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) BluetoothTestJob.class), 128);
        } catch (PackageManager.NameNotFoundException unused) {
            serviceInfo = null;
        }
        if (serviceInfo != null && (bundle = ((PackageItemInfo) serviceInfo).metaData) != null && bundle.get("jobId") != null) {
            return ((PackageItemInfo) serviceInfo).metaData.getInt("jobId");
        }
        kbs.g("Cannot get job id from manifest.  Make sure that the BluetoothTestJob is configured in the manifest.");
        return 0;
    }

    public static void setOverrideJobId(int i) {
        sOverrideJobId = i;
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        if (this.mHandlerThread == null) {
            HandlerThread handlerThread = new HandlerThread("BluetoothTestThread");
            this.mHandlerThread = handlerThread;
            handlerThread.start();
        }
        if (this.mHandler == null) {
            this.mHandler = new Handler(this.mHandlerThread.getLooper());
        }
        this.mHandler.post(new a(this, jobParameters));
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}

package org.altbeacon.beacon.service;

import android.app.ActivityManager;
import android.app.PendingIntent;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanSettings;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import defpackage.i630;
import defpackage.kbs;
import defpackage.kzo;
import defpackage.llm0;
import defpackage.mlm0;
import defpackage.oyr;
import defpackage.uqs;
import defpackage.xof;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.altbeacon.beacon.BeaconParser;
import org.altbeacon.beacon.Region;
import org.altbeacon.beacon.b;
import org.altbeacon.beacon.startup.StartupBroadcastReceiver;

/* loaded from: classes4.dex */
public class ScanJob extends JobService {
    private static final String TAG = "ScanJob";
    public static final /* synthetic */ int a = 0;
    private static int sOverrideImmediateScanJobId = -1;
    private static int sOverridePeriodicScanJobId = -1;
    private mlm0 mScanHelper;
    private ScanState mScanState = null;
    private Handler mStopHandler = new Handler();
    private boolean mInitialized = false;
    private boolean mStopCalled = false;

    public static int getImmediateScanJobId(Context context) {
        int i = sOverrideImmediateScanJobId;
        return i >= 0 ? i : getJobIdFromManifest(context, "immediateScanJobId");
    }

    private static int getJobIdFromManifest(Context context, String str) {
        ServiceInfo serviceInfo;
        Bundle bundle;
        try {
            serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) ScanJob.class), 128);
        } catch (PackageManager.NameNotFoundException unused) {
            serviceInfo = null;
        }
        if (serviceInfo != null && (bundle = ((PackageItemInfo) serviceInfo).metaData) != null && bundle.get(str) != null) {
            return ((PackageItemInfo) serviceInfo).metaData.getInt(str);
        }
        kbs.g(oyr.p("Cannot get job id from manifest.  Make sure that the ", str, " is configured in the manifest for the ScanJob."));
        return 0;
    }

    public static int getPeriodicScanJobId(Context context) {
        return sOverrideImmediateScanJobId >= 0 ? sOverridePeriodicScanJobId : getJobIdFromManifest(context, "periodicScanJobId");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean initialzeScanHelper() {
        this.mScanState = ScanState.n(this);
        mlm0 mlm0Var = new mlm0(this);
        this.mScanState.q(System.currentTimeMillis());
        ScanState scanState = this.mScanState;
        mlm0Var.d = scanState.a;
        mlm0Var.d(scanState.k());
        Set g = this.mScanState.g();
        g.size();
        if (g.size() > 0) {
            ((BeaconParser) g.iterator().next()).getClass();
        }
        mlm0Var.h = g;
        mlm0Var.g = this.mScanState.h();
        if (mlm0Var.c == null) {
            try {
                mlm0Var.c = new xof(mlm0Var.i, this.mScanState.c().booleanValue(), mlm0Var.j);
            } catch (OutOfMemoryError unused) {
                return false;
            }
        }
        this.mScanHelper = mlm0Var;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean restartScanning() {
        mlm0 mlm0Var;
        if (this.mScanState != null && (mlm0Var = this.mScanHelper) != null) {
            mlm0Var.e();
            boolean booleanValue = this.mScanState.c().booleanValue();
            ScanState scanState = this.mScanState;
            long longValue = (booleanValue ? scanState.f() : scanState.j()).longValue();
            boolean booleanValue2 = this.mScanState.c().booleanValue();
            ScanState scanState2 = this.mScanState;
            long longValue2 = (booleanValue2 ? scanState2.b() : scanState2.i()).longValue();
            xof xofVar = this.mScanHelper.c;
            if (xofVar != null) {
                xofVar.j(longValue, longValue2, this.mScanState.c().booleanValue());
            }
            this.mInitialized = true;
            mlm0 mlm0Var2 = this.mScanHelper;
            if (longValue <= 0) {
                xof xofVar2 = mlm0Var2.c;
                if (xofVar2 != null) {
                    xofVar2.n();
                    return false;
                }
            } else {
                if (mlm0Var2.e.size() > 0 || this.mScanHelper.d.e().size() > 0) {
                    xof xofVar3 = this.mScanHelper.c;
                    if (xofVar3 != null) {
                        xofVar3.k = true;
                        if (!xofVar3.j) {
                            xofVar3.h(Boolean.TRUE);
                        }
                    }
                    return true;
                }
                xof xofVar4 = this.mScanHelper.c;
                if (xofVar4 != null) {
                    xofVar4.n();
                    return false;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scheduleNextScan() {
        ScanState scanState = this.mScanState;
        if (scanState != null) {
            if (scanState.c().booleanValue()) {
                startPassiveScanIfNeeded();
            } else {
                kzo.s().x(this, ScanState.n(this), false);
            }
        }
    }

    public static void setOverrideImmediateScanJobId(int i) {
        sOverrideImmediateScanJobId = i;
    }

    public static void setOverridePeriodicScanJobId(int i) {
        sOverridePeriodicScanJobId = i;
    }

    private void startPassiveScanIfNeeded() {
        ScanState scanState = this.mScanState;
        if (scanState != null) {
            i630 i630Var = scanState.a;
            synchronized (i630Var) {
                Iterator it = i630Var.e().iterator();
                while (it.hasNext()) {
                    RegionMonitoringState j = i630Var.j((Region) it.next());
                    if (j != null && j.b()) {
                        return;
                    }
                }
                mlm0 mlm0Var = this.mScanHelper;
                if (mlm0Var != null) {
                    Set g = this.mScanState.g();
                    ScanSettings build = new ScanSettings.Builder().setScanMode(0).build();
                    new llm0();
                    ArrayList a2 = llm0.a(new ArrayList(g));
                    try {
                        BluetoothAdapter adapter = ((BluetoothManager) mlm0Var.i.getApplicationContext().getSystemService("bluetooth")).getAdapter();
                        if (adapter == null) {
                            return;
                        }
                        adapter.isEnabled();
                        BluetoothLeScanner bluetoothLeScanner = adapter.getBluetoothLeScanner();
                        if (bluetoothLeScanner != null) {
                            Context context = mlm0Var.i;
                            Intent intent = new Intent(context, (Class<?>) StartupBroadcastReceiver.class);
                            intent.putExtra("o-scan", true);
                            bluetoothLeScanner.startScan(a2, build, PendingIntent.getBroadcast(context, 0, intent, 167772160));
                        }
                    } catch (NullPointerException | SecurityException | RuntimeException unused) {
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean startScanning() {
        b j = b.j(getApplicationContext());
        j.n = Boolean.TRUE;
        if (!j.m) {
            Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (it.hasNext() && it.next().pid != Process.myPid()) {
                }
            }
        }
        return restartScanning();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopScanning() {
        this.mInitialized = false;
        mlm0 mlm0Var = this.mScanHelper;
        if (mlm0Var != null) {
            mlm0Var.e();
            xof xofVar = this.mScanHelper.c;
            if (xofVar != null) {
                xofVar.n();
                this.mScanHelper.c.d();
            }
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        toString();
        this.mStopCalled = false;
        new Thread(new uqs(this, jobParameters, false, 12)).start();
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        synchronized (this) {
            try {
                this.mStopCalled = true;
                if (jobParameters.getJobId() == getPeriodicScanJobId(this)) {
                    toString();
                } else {
                    toString();
                }
                toString();
                this.mStopHandler.removeCallbacksAndMessages(null);
                b.j(this);
                stopScanning();
                startPassiveScanIfNeeded();
                mlm0 mlm0Var = this.mScanHelper;
                if (mlm0Var != null) {
                    mlm0Var.f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return false;
    }
}

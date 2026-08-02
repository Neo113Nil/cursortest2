package org.altbeacon.beacon.service;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import defpackage.a66;
import defpackage.i630;
import defpackage.mlm0;
import defpackage.ni5;
import defpackage.vof;
import defpackage.xof;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.altbeacon.beacon.Beacon;
import org.altbeacon.beacon.BeaconParser;
import org.altbeacon.beacon.Region;
import org.altbeacon.beacon.b;
import org.altbeacon.beacon.startup.StartupBroadcastReceiver;
import org.altbeacon.beacon.utils.ChangeAwareCopyOnWriteArrayList;

/* loaded from: classes4.dex */
public class BeaconService extends Service {
    public static final int MSG_SET_SCAN_PERIODS = 6;
    public static final int MSG_START_MONITORING = 4;
    public static final int MSG_START_RANGING = 2;
    public static final int MSG_STOP_MONITORING = 5;
    public static final int MSG_STOP_RANGING = 3;
    public static final int MSG_SYNC_SETTINGS = 7;
    public static final String TAG = "BeaconService";
    private a66 bluetoothCrashResolver;
    private ni5 mBeaconNotificationProcessor;
    private mlm0 mScanHelper;
    private final Handler handler = new Handler();
    final Messenger mMessenger = new Messenger(new IncomingHandler(this));

    public class BeaconBinder extends Binder {
        public BeaconBinder() {
        }

        public BeaconService getService() {
            return BeaconService.this;
        }
    }

    public static class IncomingHandler extends Handler {
        private final WeakReference<BeaconService> mService;

        public IncomingHandler(BeaconService beaconService) {
            super(Looper.getMainLooper());
            this.mService = new WeakReference<>(beaconService);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0158  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0167  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x013a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void handleMessage(Message message) {
            i630 b;
            b bVar;
            b bVar2;
            BeaconService beaconService = this.mService.get();
            if (beaconService != null) {
                StartRMData fromBundle = StartRMData.fromBundle(message.getData());
                int i = message.what;
                if (fromBundle != null) {
                    if (i == 2) {
                        Region regionData = fromBundle.getRegionData();
                        fromBundle.getCallbackPackageName();
                        beaconService.startRangingBeaconsInRegion(regionData, new Callback());
                        beaconService.setScanPeriods(fromBundle.getScanPeriod(), fromBundle.getBetweenScanPeriod(), fromBundle.getBackgroundFlag());
                        return;
                    }
                    if (i == 3) {
                        beaconService.stopRangingBeaconsInRegion(fromBundle.getRegionData());
                        beaconService.setScanPeriods(fromBundle.getScanPeriod(), fromBundle.getBetweenScanPeriod(), fromBundle.getBackgroundFlag());
                        return;
                    }
                    if (i == 4) {
                        Region regionData2 = fromBundle.getRegionData();
                        fromBundle.getCallbackPackageName();
                        beaconService.startMonitoringBeaconsInRegion(regionData2, new Callback());
                        beaconService.setScanPeriods(fromBundle.getScanPeriod(), fromBundle.getBetweenScanPeriod(), fromBundle.getBackgroundFlag());
                        return;
                    }
                    if (i == 5) {
                        beaconService.stopMonitoringBeaconsInRegion(fromBundle.getRegionData());
                        beaconService.setScanPeriods(fromBundle.getScanPeriod(), fromBundle.getBetweenScanPeriod(), fromBundle.getBackgroundFlag());
                        return;
                    } else if (i != 6) {
                        super.handleMessage(message);
                        return;
                    } else {
                        beaconService.setScanPeriods(fromBundle.getScanPeriod(), fromBundle.getBetweenScanPeriod(), fromBundle.getBackgroundFlag());
                        return;
                    }
                }
                if (i == 7) {
                    Bundle data = message.getData();
                    data.setClassLoader(Region.class.getClassLoader());
                    SettingsData settingsData = data.get("SettingsData") != null ? (SettingsData) data.getSerializable("SettingsData") : null;
                    if (settingsData != null) {
                        b j = b.j(beaconService);
                        if (j.m) {
                            beaconService.reloadParsers();
                            return;
                        }
                        ChangeAwareCopyOnWriteArrayList changeAwareCopyOnWriteArrayList = j.i;
                        if (changeAwareCopyOnWriteArrayList.size() == settingsData.mBeaconParsers.size()) {
                            for (int i2 = 0; i2 < changeAwareCopyOnWriteArrayList.size(); i2++) {
                                if (!((BeaconParser) changeAwareCopyOnWriteArrayList.get(i2)).equals(settingsData.mBeaconParsers.get(i2))) {
                                    settingsData.mBeaconParsers.get(i2).getClass();
                                }
                            }
                            b = i630.b(beaconService);
                            if (!b.c && !settingsData.mRegionStatePersistenceEnabled.booleanValue()) {
                                b.k();
                            } else if (!b.c && settingsData.mRegionStatePersistenceEnabled.booleanValue()) {
                                synchronized (b) {
                                    if (!b.c) {
                                        b.c = true;
                                        b.g();
                                    }
                                }
                            }
                            b.C = settingsData.mAndroidLScanningDisabled.booleanValue();
                            bVar = b.B;
                            if (bVar != null) {
                                bVar.c();
                            }
                            b.E = settingsData.mRegionExitPeriod.longValue();
                            bVar2 = b.B;
                            if (bVar2 != null) {
                                bVar2.c();
                            }
                            RangeState.a = settingsData.mUseTrackingCache.booleanValue();
                            Beacon.setHardwareEqualityEnforced(settingsData.mHardwareEqualityEnforced.booleanValue());
                        }
                        j.i.clear();
                        j.i.addAll(settingsData.mBeaconParsers);
                        beaconService.reloadParsers();
                        b = i630.b(beaconService);
                        if (!b.c) {
                        }
                        if (!b.c) {
                            synchronized (b) {
                            }
                        }
                        b.C = settingsData.mAndroidLScanningDisabled.booleanValue();
                        bVar = b.B;
                        if (bVar != null) {
                        }
                        b.E = settingsData.mRegionExitPeriod.longValue();
                        bVar2 = b.B;
                        if (bVar2 != null) {
                        }
                        RangeState.a = settingsData.mUseTrackingCache.booleanValue();
                        Beacon.setHardwareEqualityEnforced(settingsData.mHardwareEqualityEnforced.booleanValue());
                    }
                }
            }
        }
    }

    private void ensureNotificationProcessorSetup() {
        if (this.mBeaconNotificationProcessor == null) {
            ni5 a = ni5.a();
            this.mBeaconNotificationProcessor = a;
            a.getClass();
        }
    }

    private String getManifestMetadataValue(String str) {
        Bundle bundle;
        try {
            ServiceInfo serviceInfo = getPackageManager().getServiceInfo(new ComponentName(this, (Class<?>) BeaconService.class), 128);
            if (serviceInfo == null || (bundle = ((PackageItemInfo) serviceInfo).metaData) == null || bundle.get(str) == null) {
                return null;
            }
            return ((PackageItemInfo) serviceInfo).metaData.get(str).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private PendingIntent getRestartIntent() {
        return PendingIntent.getBroadcast(getApplicationContext(), 1, new Intent(getApplicationContext(), (Class<?>) StartupBroadcastReceiver.class), 1140850688);
    }

    private void startForegroundIfConfigured() {
        b j = b.j(getApplicationContext());
        Notification notification = j.q;
        int i = j.r;
        if (notification != null) {
            try {
                startForeground(i, notification);
            } catch (SecurityException unused) {
            }
        }
    }

    public vof getCycledLeScanCallback() {
        return this.mScanHelper.j;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.mMessenger.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        xof xofVar;
        startForegroundIfConfigured();
        mlm0 mlm0Var = new mlm0(this);
        this.mScanHelper = mlm0Var;
        if (mlm0Var.c == null) {
            mlm0Var.c = new xof(mlm0Var.i, false, mlm0Var.j);
        }
        this.mScanHelper.d = i630.b(this);
        this.mScanHelper.d(new HashMap());
        mlm0 mlm0Var2 = this.mScanHelper;
        HashSet hashSet = new HashSet();
        mlm0Var2.getClass();
        hashSet.size();
        if (hashSet.size() > 0) {
            ((BeaconParser) hashSet.iterator().next()).getClass();
        }
        mlm0Var2.h = hashSet;
        this.mScanHelper.g = new ExtraDataBeaconTracker();
        b j = b.j(getApplicationContext());
        j.n = Boolean.TRUE;
        if (j.m) {
            ensureNotificationProcessorSetup();
        } else {
            Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (it.hasNext() && it.next().pid != Process.myPid()) {
                }
            }
        }
        String manifestMetadataValue = getManifestMetadataValue("longScanForcingEnabled");
        if (manifestMetadataValue != null && manifestMetadataValue.equals("true") && (xofVar = this.mScanHelper.c) != null) {
            xofVar.g = true;
        }
        this.mScanHelper.c();
        try {
            Field field = Class.forName("org.altbeacon.beacon.SimulatedScanData").getField("beacons");
            mlm0 mlm0Var3 = this.mScanHelper;
            mlm0Var3.getClass();
        } catch (ClassNotFoundException | Exception unused) {
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.handler.removeCallbacksAndMessages(null);
        xof xofVar = this.mScanHelper.c;
        if (xofVar != null) {
            xofVar.n();
            this.mScanHelper.c.d();
        }
        this.mScanHelper.d.k();
        this.mScanHelper.f();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            intent.toString();
        }
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        String str = Build.VERSION.RELEASE;
        if (str.contains("4.4.1") || str.contains("4.4.2") || str.contains("4.4.3")) {
            ((AlarmManager) getApplicationContext().getSystemService("alarm")).set(0, System.currentTimeMillis() + 1000, getRestartIntent());
        }
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        stopForeground(true);
        stopSelf();
        return false;
    }

    public void reloadParsers() {
        this.mScanHelper.c();
    }

    public void setScanPeriods(long j, long j2, boolean z) {
        xof xofVar = this.mScanHelper.c;
        if (xofVar != null) {
            xofVar.j(j, j2, z);
        }
    }

    public void startMonitoringBeaconsInRegion(Region region, Callback callback) {
        i630 i630Var = this.mScanHelper.d;
        synchronized (i630Var) {
            i630Var.a(region, callback);
            i630Var.g();
        }
        this.mScanHelper.d.f();
        xof xofVar = this.mScanHelper.c;
        if (xofVar != null) {
            xofVar.k = true;
            if (xofVar.j) {
                return;
            }
            xofVar.h(Boolean.TRUE);
        }
    }

    public void startRangingBeaconsInRegion(Region region, Callback callback) {
        synchronized (this.mScanHelper.e) {
            try {
                if (this.mScanHelper.e.containsKey(region)) {
                    this.mScanHelper.e.remove(region);
                }
                this.mScanHelper.e.put(region, new RangeState(callback));
                this.mScanHelper.e.size();
            } catch (Throwable th) {
                throw th;
            }
        }
        xof xofVar = this.mScanHelper.c;
        if (xofVar != null) {
            xofVar.k = true;
            if (xofVar.j) {
                return;
            }
            xofVar.h(Boolean.TRUE);
        }
    }

    public void stopMonitoringBeaconsInRegion(Region region) {
        xof xofVar;
        i630 i630Var = this.mScanHelper.d;
        synchronized (i630Var) {
            i630Var.c().remove(region);
            i630Var.g();
        }
        this.mScanHelper.d.f();
        if (this.mScanHelper.d.f() == 0 && this.mScanHelper.e.size() == 0 && (xofVar = this.mScanHelper.c) != null) {
            xofVar.n();
        }
    }

    public void stopRangingBeaconsInRegion(Region region) {
        int size;
        xof xofVar;
        synchronized (this.mScanHelper.e) {
            this.mScanHelper.e.remove(region);
            size = this.mScanHelper.e.size();
            this.mScanHelper.e.size();
        }
        if (size == 0 && this.mScanHelper.d.f() == 0 && (xofVar = this.mScanHelper.c) != null) {
            xofVar.n();
        }
    }
}

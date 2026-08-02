package com.bugsnag.android;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.location.LocationManager;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import android.util.DisplayMetrics;
import coil3.Extras;
import com.bugsnag.android.DeviceIdStore;
import com.bugsnag.android.internal.BackgroundTaskService;
import com.bugsnag.android.internal.TaskType;
import com.bugsnag.android.internal.dag.Provider;
import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Result;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes.dex */
public final class DeviceDataCollector {
    public final Context appContext;
    public final BackgroundTaskService bgTaskService;
    public final DeviceBuildInfo buildInfo;
    public final Extras.Key connectivity;
    public final String[] cpuAbi;
    public final File dataDirectory;
    public final Provider deviceIdStore;
    public final Integer dpi;
    public final boolean emulator;
    public final String locale;
    public final Logger logger;
    public final AtomicInteger orientation;
    public final Provider rootedFuture;
    public final LinkedHashMap runtimeVersions;
    public final Float screenDensity;
    public final String screenResolution;
    public final BackgroundTaskService.SafeFuture totalMemoryFuture;

    public DeviceDataCollector(Extras.Key key, Context context, Resources resources, Provider provider, DeviceBuildInfo deviceBuildInfo, File file, Provider provider2, BackgroundTaskService backgroundTaskService, Logger logger) {
        String str;
        this.connectivity = key;
        this.appContext = context;
        this.deviceIdStore = provider;
        this.buildInfo = deviceBuildInfo;
        this.dataDirectory = file;
        this.rootedFuture = provider2;
        this.bgTaskService = backgroundTaskService;
        this.logger = logger;
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        String str2 = (String) deviceBuildInfo.fingerprint;
        this.emulator = str2 != null && (StringsKt__StringsJVMKt.startsWith(str2, "unknown", false) || StringsKt.contains((CharSequence) str2, (CharSequence) "generic", false) || StringsKt.contains((CharSequence) str2, (CharSequence) "vbox", false));
        BackgroundTaskService.SafeFuture safeFuture = null;
        this.screenDensity = displayMetrics != null ? Float.valueOf(displayMetrics.density) : null;
        this.dpi = displayMetrics != null ? Integer.valueOf(displayMetrics.densityDpi) : null;
        if (displayMetrics != null) {
            int max = Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
            int min = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
            StringBuilder sb = new StringBuilder();
            sb.append(max);
            sb.append('x');
            sb.append(min);
            str = sb.toString();
        } else {
            str = null;
        }
        this.screenResolution = str;
        this.locale = Locale.getDefault().toString();
        String[] strArr = (String[]) deviceBuildInfo.cpuAbis;
        this.cpuAbi = strArr == null ? new String[0] : strArr;
        try {
            safeFuture = backgroundTaskService.submitTask(TaskType.DEFAULT, new DeviceDataCollector$$ExternalSyntheticLambda0(this, 0));
        } catch (RejectedExecutionException e) {
            this.logger.w("Failed to lookup available device memory", e);
        }
        this.totalMemoryFuture = safeFuture;
        this.orientation = new AtomicInteger(resources.getConfiguration().orientation);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Integer num = (Integer) this.buildInfo.apiLevel;
        if (num != null) {
            linkedHashMap.put("androidApiLevel", Integer.valueOf(num.intValue()));
        }
        String str3 = (String) this.buildInfo.osBuild;
        if (str3 != null) {
            linkedHashMap.put("osBuild", str3);
        }
        this.runtimeVersions = linkedHashMap;
    }

    public final boolean checkIsRooted() {
        Provider provider = this.rootedFuture;
        if (provider == null) {
            return false;
        }
        try {
            if (provider.isComplete()) {
                if (((Boolean) provider.get()).booleanValue()) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public final Device generateDevice() {
        Object failure;
        Boolean valueOf = Boolean.valueOf(checkIsRooted());
        DeviceIdStore.DeviceIds deviceIds = (DeviceIdStore.DeviceIds) this.deviceIdStore.get();
        String str = deviceIds != null ? deviceIds.deviceId : null;
        try {
            Result.Companion companion = Result.Companion;
            BackgroundTaskService.SafeFuture safeFuture = this.totalMemoryFuture;
            failure = safeFuture != null ? (Long) safeFuture.get() : null;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        Object obj = failure instanceof Result.Failure ? null : failure;
        return new Device(this.buildInfo, this.cpuAbi, valueOf, str, this.locale, (Long) obj, MapsKt__MapsKt.toMutableMap(this.runtimeVersions));
    }

    public final DeviceWithState generateDeviceWithState(long j) {
        Object failure;
        Object failure2;
        Long l;
        Long l2;
        Boolean valueOf = Boolean.valueOf(checkIsRooted());
        DeviceIdStore.DeviceIds deviceIds = (DeviceIdStore.DeviceIds) this.deviceIdStore.get();
        String str = deviceIds != null ? deviceIds.deviceId : null;
        try {
            Result.Companion companion = Result.Companion;
            BackgroundTaskService.SafeFuture safeFuture = this.totalMemoryFuture;
            failure = safeFuture != null ? (Long) safeFuture.get() : null;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        Long l3 = (Long) failure;
        LinkedHashMap mutableMap = MapsKt__MapsKt.toMutableMap(this.runtimeVersions);
        try {
            failure2 = (Long) this.bgTaskService.submitTask(TaskType.IO, new DeviceDataCollector$$ExternalSyntheticLambda0(this, 1)).get();
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.Companion;
            failure2 = new Result.Failure(th2);
        }
        if (failure2 instanceof Result.Failure) {
            failure2 = 0L;
        }
        Long valueOf2 = Long.valueOf(((Number) failure2).longValue());
        try {
            ActivityManager activityManagerFrom = Bugsnag.getActivityManagerFrom(this.appContext);
            if (activityManagerFrom != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManagerFrom.getMemoryInfo(memoryInfo);
                l2 = Long.valueOf(memoryInfo.availMem);
            } else {
                l2 = null;
            }
            if (l2 == null) {
                l2 = (Long) Process.class.getDeclaredMethod("getFreeMemory", null).invoke(null, null);
            }
            l = l2;
        } catch (Throwable unused) {
            l = null;
        }
        return new DeviceWithState(this.buildInfo, valueOf, str, this.locale, l3, mutableMap, valueOf2, l, getOrientationAsString$bugsnag_android_core_release(), new Date(j));
    }

    public final DeviceWithState generateHistoricDeviceWithState(long j) {
        Boolean valueOf = Boolean.valueOf(checkIsRooted());
        DeviceIdStore.DeviceIds deviceIds = (DeviceIdStore.DeviceIds) this.deviceIdStore.get();
        return new DeviceWithState(this.buildInfo, valueOf, deviceIds != null ? deviceIds.deviceId : null, this.locale, null, MapsKt__MapsKt.toMutableMap(this.runtimeVersions), null, null, getOrientationAsString$bugsnag_android_core_release(), new Date(j));
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0084, code lost:
    
        if (r0.length() > 0) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HashMap getDeviceMetadata() {
        String str;
        LocationManager locationManager;
        boolean z;
        Context context = this.appContext;
        HashMap hashMap = new HashMap();
        Logger logger = this.logger;
        String str2 = null;
        try {
            Intent registerReceiverSafe = Bugsnag.registerReceiverSafe(context, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"), logger);
            if (registerReceiverSafe != null) {
                int intExtra = registerReceiverSafe.getIntExtra("level", -1);
                int intExtra2 = registerReceiverSafe.getIntExtra("scale", -1);
                if (intExtra != -1 || intExtra2 != -1) {
                    hashMap.put("batteryLevel", Float.valueOf(intExtra / intExtra2));
                }
                int intExtra3 = registerReceiverSafe.getIntExtra("status", -1);
                if (intExtra3 != 2 && intExtra3 != 5) {
                    z = false;
                    hashMap.put("charging", Boolean.valueOf(z));
                }
                z = true;
                hashMap.put("charging", Boolean.valueOf(z));
            }
        } catch (Exception unused) {
            logger.w("Could not get battery status");
        }
        try {
            if (Build.VERSION.SDK_INT >= 31) {
                try {
                    Object systemService = context.getSystemService("location");
                    if (!(systemService instanceof LocationManager)) {
                        systemService = null;
                    }
                    locationManager = (LocationManager) systemService;
                } catch (RuntimeException unused2) {
                    locationManager = null;
                }
                str = (locationManager != null && locationManager.isLocationEnabled()) ? "allowed" : "disallowed";
            } else {
                String string2 = Settings.Secure.getString(context.getContentResolver(), "location_providers_allowed");
                if (string2 != null) {
                }
            }
            str2 = str;
        } catch (Exception unused3) {
            logger.w("Could not get locationStatus");
        }
        hashMap.put("locationStatus", str2);
        hashMap.put("networkAccess", this.connectivity.retrieveNetworkAccessState());
        hashMap.put("brand", (String) this.buildInfo.brand);
        hashMap.put("screenDensity", this.screenDensity);
        hashMap.put("dpi", this.dpi);
        hashMap.put("emulator", Boolean.valueOf(this.emulator));
        hashMap.put("screenResolution", this.screenResolution);
        hashMap.put("securityPatch", Build.VERSION.SECURITY_PATCH);
        return hashMap;
    }

    public final String getOrientationAsString$bugsnag_android_core_release() {
        int i = this.orientation.get();
        if (i == 1) {
            return "portrait";
        }
        if (i != 2) {
            return null;
        }
        return "landscape";
    }
}

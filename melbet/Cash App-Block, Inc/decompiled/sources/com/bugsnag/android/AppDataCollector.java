package com.bugsnag.android;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.SystemClock;
import com.bugsnag.android.internal.ForegroundDetector;
import com.bugsnag.android.internal.ImmutableConfig;
import com.bugsnag.android.internal.dag.Provider;
import java.util.HashMap;
import kotlin.Result;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes.dex */
public final class AppDataCollector {
    public static final long startTimeMs = SystemClock.elapsedRealtime();
    public final String appName;
    public final Boolean bgWorkRestricted;
    public String binaryArch;
    public final ImmutableConfig config;
    public final String installerPackage;
    public final LaunchCrashTracker launchCrashTracker;
    public final MemoryTrimState memoryTrimState;
    public final PackageManager packageManager;
    public final String packageName;
    public final String processName;
    public final String releaseStage;
    public final Provider sessionTracker;
    public final String versionName;

    public AppDataCollector(Context context, PackageManager packageManager, ImmutableConfig immutableConfig, TrackerModule$special$$inlined$provider$1 trackerModule$special$$inlined$provider$1, ActivityManager activityManager, LaunchCrashTracker launchCrashTracker, MemoryTrimState memoryTrimState) {
        Object failure;
        InstallSourceInfo installSourceInfo;
        this.packageManager = packageManager;
        this.config = immutableConfig;
        this.sessionTracker = trackerModule$special$$inlined$provider$1;
        this.launchCrashTracker = launchCrashTracker;
        this.memoryTrimState = memoryTrimState;
        this.packageName = context.getPackageName();
        String str = null;
        this.bgWorkRestricted = (activityManager == null || !activityManager.isBackgroundRestricted()) ? null : Boolean.TRUE;
        ApplicationInfo applicationInfo = immutableConfig.appInfo;
        this.appName = (packageManager == null || applicationInfo == null) ? null : packageManager.getApplicationLabel(applicationInfo).toString();
        try {
            Result.Companion companion = Result.Companion;
            failure = Application.getProcessName();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        this.processName = (String) (failure instanceof Result.Failure ? null : failure);
        ImmutableConfig immutableConfig2 = this.config;
        this.releaseStage = immutableConfig2.releaseStage;
        PackageInfo packageInfo = immutableConfig2.packageInfo;
        this.versionName = packageInfo != null ? packageInfo.versionName : null;
        String str2 = this.packageName;
        try {
            int i = Build.VERSION.SDK_INT;
            PackageManager packageManager2 = this.packageManager;
            if (i >= 30) {
                if (packageManager2 != null && (installSourceInfo = packageManager2.getInstallSourceInfo(str2)) != null) {
                    str = installSourceInfo.getInstallingPackageName();
                }
            } else if (packageManager2 != null) {
                str = packageManager2.getInstallerPackageName(str2);
            }
        } catch (Exception unused) {
        }
        this.installerPackage = str;
    }

    public final AppWithState generateAppWithState() {
        ((SessionTracker) this.sessionTracker.get()).getClass();
        boolean z = ForegroundDetector.isInForeground;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ((SessionTracker) this.sessionTracker.get()).getClass();
        long j = ForegroundDetector.lastEnteredForegroundMs;
        long j2 = (!z || j == 0) ? 0L : elapsedRealtime - j;
        return new AppWithState(this.config, this.binaryArch, this.packageName, this.releaseStage, this.versionName, Long.valueOf(SystemClock.elapsedRealtime() - startTimeMs), j2 > 0 ? Long.valueOf(j2) : 0L, Boolean.valueOf(z), Boolean.valueOf(this.launchCrashTracker.launching.get()));
    }

    public final HashMap getAppDataMetadata() {
        HashMap hashMap = new HashMap();
        hashMap.put("name", this.appName);
        hashMap.put("activeScreen", ((SessionTracker) this.sessionTracker.get()).getContextActivity());
        String str = null;
        try {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.pid != 0) {
                int i = runningAppProcessInfo.importance;
                if (i == 1) {
                    str = "provider in use";
                } else if (i != 2) {
                    switch (i) {
                        case 100:
                            str = "foreground";
                            break;
                        case 125:
                            str = "foreground service";
                            break;
                        case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
                        case SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE:
                            str = "perceptible";
                            break;
                        case 150:
                        case SDK_ASSET_ICON_REPORT_VALUE:
                            str = "top sleeping";
                            break;
                        case SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE:
                        case 350:
                            str = "can't save state";
                            break;
                        case 200:
                            str = "visible";
                            break;
                        case SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE:
                            str = "service";
                            break;
                        case 400:
                            str = "cached/background";
                            break;
                        case 500:
                            str = "empty";
                            break;
                        case IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO /* 1000 */:
                            str = "gone";
                            break;
                        default:
                            str = "unknown importance (" + runningAppProcessInfo.importance + ')';
                            break;
                    }
                } else {
                    str = "service in use";
                }
            }
        } catch (Exception unused) {
        }
        hashMap.put("processImportance", str);
        MemoryTrimState memoryTrimState = this.memoryTrimState;
        if (memoryTrimState.memoryTrimLevel != null) {
            hashMap.put("lowMemory", Boolean.valueOf(memoryTrimState.isLowMemory));
            hashMap.put("memoryTrimLevel", memoryTrimState.getTrimLevelDescription());
        }
        Runtime runtime = Runtime.getRuntime();
        long j = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        hashMap.put("memoryUsage", Long.valueOf(j - freeMemory));
        hashMap.put("totalMemory", Long.valueOf(j));
        hashMap.put("freeMemory", Long.valueOf(freeMemory));
        hashMap.put("memoryLimit", Long.valueOf(runtime.maxMemory()));
        hashMap.put("installerPackage", this.installerPackage);
        Boolean bool = this.bgWorkRestricted;
        if (bool != null) {
            hashMap.put("backgroundWorkRestricted", bool);
        }
        String str2 = this.processName;
        if (str2 != null) {
            hashMap.put("processName", str2);
        }
        return hashMap;
    }
}

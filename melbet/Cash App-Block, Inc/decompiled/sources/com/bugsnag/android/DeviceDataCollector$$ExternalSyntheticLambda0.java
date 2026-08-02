package com.bugsnag.android;

import android.app.ActivityManager;
import android.os.Process;
import java.util.concurrent.Callable;
import kotlin.Result;

/* loaded from: classes.dex */
public final /* synthetic */ class DeviceDataCollector$$ExternalSyntheticLambda0 implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DeviceDataCollector f$0;

    public /* synthetic */ DeviceDataCollector$$ExternalSyntheticLambda0(DeviceDataCollector deviceDataCollector, int i) {
        this.$r8$classId = i;
        this.f$0 = deviceDataCollector;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Long l;
        Object failure;
        int i = this.$r8$classId;
        DeviceDataCollector deviceDataCollector = this.f$0;
        switch (i) {
            case 0:
                ActivityManager activityManagerFrom = Bugsnag.getActivityManagerFrom(deviceDataCollector.appContext);
                if (activityManagerFrom != null) {
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    activityManagerFrom.getMemoryInfo(memoryInfo);
                    l = Long.valueOf(memoryInfo.totalMem);
                } else {
                    l = null;
                }
                if (l != null) {
                    return l;
                }
                try {
                    Result.Companion companion = Result.Companion;
                    failure = (Long) Process.class.getDeclaredMethod("getTotalMemory", null).invoke(null, null);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    failure = new Result.Failure(th);
                }
                return (Long) (failure instanceof Result.Failure ? null : failure);
            default:
                return Long.valueOf(deviceDataCollector.dataDirectory.getUsableSpace());
        }
    }
}

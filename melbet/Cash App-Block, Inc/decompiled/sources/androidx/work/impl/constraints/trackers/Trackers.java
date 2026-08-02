package androidx.work.impl.constraints.trackers;

import android.content.Context;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;

/* loaded from: classes.dex */
public final class Trackers {
    public final BatteryNotLowTracker batteryChargingTracker;
    public final BatteryNotLowTracker batteryNotLowTracker;
    public final Context context;
    public final BatteryNotLowTracker storageNotLowTracker;

    public Trackers(Context context, WorkManagerTaskExecutor workManagerTaskExecutor) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        BatteryNotLowTracker batteryNotLowTracker = new BatteryNotLowTracker(applicationContext, workManagerTaskExecutor, 1);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        BatteryNotLowTracker batteryNotLowTracker2 = new BatteryNotLowTracker(applicationContext2, workManagerTaskExecutor, 0);
        Context applicationContext3 = context.getApplicationContext();
        applicationContext3.getClass();
        BatteryNotLowTracker batteryNotLowTracker3 = new BatteryNotLowTracker(applicationContext3, workManagerTaskExecutor, 2);
        context.getClass();
        this.context = context;
        this.batteryChargingTracker = batteryNotLowTracker;
        this.batteryNotLowTracker = batteryNotLowTracker2;
        this.storageNotLowTracker = batteryNotLowTracker3;
    }
}

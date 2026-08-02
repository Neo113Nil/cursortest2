package androidx.work.impl.constraints.trackers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.Logger$LogcatLogger;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import bo.app.q4$$ExternalSyntheticLambda0;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class BatteryNotLowTracker {
    public final /* synthetic */ int $r8$classId;
    public final Context appContext;
    public final BroadcastReceiverConstraintTracker$broadcastReceiver$1 broadcastReceiver;
    public Object currentState;
    public final LinkedHashSet listeners;
    public final Object lock;
    public final WorkManagerTaskExecutor taskExecutor;

    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker$broadcastReceiver$1] */
    public BatteryNotLowTracker(Context context, WorkManagerTaskExecutor workManagerTaskExecutor, int i) {
        this.$r8$classId = i;
        this.taskExecutor = workManagerTaskExecutor;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.appContext = applicationContext;
        this.lock = new Object();
        this.listeners = new LinkedHashSet();
        this.broadcastReceiver = new BroadcastReceiver() { // from class: androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker$broadcastReceiver$1
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
            java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
            	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
            	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
             */
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context2, Intent intent) {
                String str;
                String str2;
                String str3;
                context2.getClass();
                intent.getClass();
                BatteryNotLowTracker batteryNotLowTracker = BatteryNotLowTracker.this;
                int i2 = batteryNotLowTracker.$r8$classId;
                intent.getClass();
                switch (i2) {
                    case 0:
                        if (intent.getAction() != null) {
                            Logger$LogcatLogger logger$LogcatLogger = Logger$LogcatLogger.get();
                            str = BatteryNotLowTrackerKt.TAG;
                            logger$LogcatLogger.debug(str, "Received " + intent.getAction());
                            String action = intent.getAction();
                            if (action != null) {
                                int hashCode = action.hashCode();
                                if (hashCode == -1980154005) {
                                    if (action.equals("android.intent.action.BATTERY_OKAY")) {
                                        batteryNotLowTracker.setState(Boolean.TRUE);
                                        break;
                                    }
                                } else if (hashCode == 490310653 && action.equals("android.intent.action.BATTERY_LOW")) {
                                    batteryNotLowTracker.setState(Boolean.FALSE);
                                    break;
                                }
                            }
                        }
                        break;
                    case 1:
                        String action2 = intent.getAction();
                        if (action2 != null) {
                            Logger$LogcatLogger logger$LogcatLogger2 = Logger$LogcatLogger.get();
                            str2 = BatteryChargingTrackerKt.TAG;
                            logger$LogcatLogger2.debug(str2, "Received ".concat(action2));
                            switch (action2.hashCode()) {
                                case -1886648615:
                                    if (action2.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                        batteryNotLowTracker.setState(Boolean.FALSE);
                                        break;
                                    }
                                    break;
                                case -54942926:
                                    if (action2.equals("android.os.action.DISCHARGING")) {
                                        batteryNotLowTracker.setState(Boolean.FALSE);
                                        break;
                                    }
                                    break;
                                case 948344062:
                                    if (action2.equals("android.os.action.CHARGING")) {
                                        batteryNotLowTracker.setState(Boolean.TRUE);
                                        break;
                                    }
                                    break;
                                case 1019184907:
                                    if (action2.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                        batteryNotLowTracker.setState(Boolean.TRUE);
                                        break;
                                    }
                                    break;
                            }
                        }
                        break;
                    default:
                        if (intent.getAction() != null) {
                            Logger$LogcatLogger logger$LogcatLogger3 = Logger$LogcatLogger.get();
                            str3 = StorageNotLowTrackerKt.TAG;
                            logger$LogcatLogger3.debug(str3, "Received " + intent.getAction());
                            String action3 = intent.getAction();
                            if (action3 != null) {
                                int hashCode2 = action3.hashCode();
                                if (hashCode2 == -1181163412) {
                                    if (action3.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                                        batteryNotLowTracker.setState(Boolean.FALSE);
                                        break;
                                    }
                                } else if (hashCode2 == -730838620 && action3.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                    batteryNotLowTracker.setState(Boolean.TRUE);
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        };
    }

    public final IntentFilter getIntentFilter() {
        switch (this.$r8$classId) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter;
            case 1:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.os.action.CHARGING");
                intentFilter2.addAction("android.os.action.DISCHARGING");
                return intentFilter2;
            default:
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r9.equals("android.intent.action.DEVICE_STORAGE_OK") == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean readSystemState$1() {
        String str;
        String str2;
        int i = this.$r8$classId;
        Context context = this.appContext;
        boolean z = true;
        switch (i) {
            case 0:
                Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver == null) {
                    Logger$LogcatLogger logger$LogcatLogger = Logger$LogcatLogger.get();
                    str = BatteryNotLowTrackerKt.TAG;
                    logger$LogcatLogger.error(str, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                float intExtra = registerReceiver.getIntExtra("level", -1) / registerReceiver.getIntExtra("scale", -1);
                if (registerReceiver.getIntExtra("status", -1) != 1 && intExtra <= 0.15f) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                Intent registerReceiver2 = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver2 == null) {
                    Logger$LogcatLogger logger$LogcatLogger2 = Logger$LogcatLogger.get();
                    str2 = BatteryChargingTrackerKt.TAG;
                    logger$LogcatLogger2.error(str2, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra2 = registerReceiver2.getIntExtra("status", -1);
                if (intExtra2 != 2 && intExtra2 != 5) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                Intent registerReceiver3 = context.registerReceiver(null, getIntentFilter());
                if (registerReceiver3 != null && registerReceiver3.getAction() != null) {
                    String action = registerReceiver3.getAction();
                    if (action != null) {
                        int hashCode = action.hashCode();
                        if (hashCode == -1181163412) {
                            action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                        } else if (hashCode == -730838620) {
                            break;
                        }
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }

    public final void setState(Boolean bool) {
        synchronized (this.lock) {
            Object obj = this.currentState;
            if (obj == null || !obj.equals(bool)) {
                this.currentState = bool;
                this.taskExecutor.mMainThreadExecutor.execute(new q4$$ExternalSyntheticLambda0(10, CollectionsKt.toList(this.listeners), this));
            }
        }
    }
}

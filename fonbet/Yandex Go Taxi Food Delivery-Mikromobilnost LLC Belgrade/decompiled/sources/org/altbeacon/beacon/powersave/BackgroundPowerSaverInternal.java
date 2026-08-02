package org.altbeacon.beacon.powersave;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.PowerManager;
import org.altbeacon.beacon.b;

/* loaded from: classes4.dex */
public class BackgroundPowerSaverInternal implements Application.ActivityLifecycleCallbacks {
    private static final String TAG = "BackgroundPowerSaver";
    private final Context applicationContext;
    private final b beaconManager;
    private int activeActivityCount = 0;
    private BroadcastReceiver screenOffReceiver = new BroadcastReceiver() { // from class: org.altbeacon.beacon.powersave.BackgroundPowerSaverInternal.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            BackgroundPowerSaverInternal.this.inferBackground("the screen going off");
            BackgroundPowerSaverInternal.this.applicationContext.getApplicationContext().unregisterReceiver(BackgroundPowerSaverInternal.this.screenOffReceiver);
        }
    };

    public BackgroundPowerSaverInternal(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.applicationContext = applicationContext;
        this.beaconManager = b.j(applicationContext);
        ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void inferBackground(String str) {
        b bVar = this.beaconManager;
        if (bVar.l) {
            bVar.t(true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean methodCalledByApplicationOnCreate() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String canonicalName = Application.class.getCanonicalName();
        for (StackTraceElement stackTraceElement : stackTrace) {
            if ("onCreate".equals(stackTraceElement.getMethodName())) {
                if (canonicalName.equals(stackTraceElement.getClassName())) {
                    return true;
                }
                if (stackTraceElement.getClassName() != null) {
                    try {
                        Class<?> cls = Class.forName(stackTraceElement.getClassName());
                        do {
                            cls = cls.getSuperclass();
                            if (cls != null) {
                            }
                        } while (!canonicalName.equals(cls.getCanonicalName()));
                        return true;
                    } catch (ClassNotFoundException unused) {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    public void enableDefaultBackgroundStateInference() {
        if (this.beaconManager.l) {
            if (methodCalledByApplicationOnCreate()) {
                inferBackground("application.onCreate in the call stack");
            } else if (((PowerManager) this.applicationContext.getSystemService("power")).isInteractive()) {
                this.applicationContext.getApplicationContext().registerReceiver(this.screenOffReceiver, new IntentFilter("android.intent.action.SCREEN_OFF"));
            } else {
                inferBackground("the screen being off");
            }
        }
        boolean z = this.beaconManager.l;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.activeActivityCount--;
        if (this.activeActivityCount < 1) {
            this.beaconManager.t(true);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        int i = this.activeActivityCount + 1;
        this.activeActivityCount = i;
        if (i < 1) {
            this.activeActivityCount = 1;
        }
        this.beaconManager.t(false);
        b.j(this.applicationContext).r();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}

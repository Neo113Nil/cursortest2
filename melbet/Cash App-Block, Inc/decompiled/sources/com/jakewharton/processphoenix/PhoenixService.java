package com.jakewharton.processphoenix;

import android.app.IntentService;
import android.content.Intent;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;

/* loaded from: classes4.dex */
public final class PhoenixService extends IntentService {
    public PhoenixService() {
        super("PhoenixService");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            return;
        }
        Process.killProcess(intent.getIntExtra("phoenix_main_process_pid", -1));
        int i = Build.VERSION.SDK_INT;
        Intent intent2 = i >= 33 ? (Intent) intent.getParcelableExtra("phoenix_restart_intent", Intent.class) : (Intent) intent.getParcelableExtra("phoenix_restart_intent");
        if (i > 31) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(StrictMode.getVmPolicy()).permitUnsafeIntentLaunch().build());
        }
        startForegroundService(intent2);
        Runtime.getRuntime().exit(0);
    }
}

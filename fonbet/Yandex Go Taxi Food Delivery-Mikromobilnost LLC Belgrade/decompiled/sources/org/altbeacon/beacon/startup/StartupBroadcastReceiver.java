package org.altbeacon.beacon.startup;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.kzo;
import java.util.ArrayList;
import org.altbeacon.beacon.b;
import org.altbeacon.beacon.service.ScanState;

/* loaded from: classes4.dex */
public class StartupBroadcastReceiver extends BroadcastReceiver {
    private static final String TAG = "StartupBroadcastReceiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent != null && intent.getAction() != null && intent.getAction().equals("android.intent.action.BOOT_COMPLETED")) {
            b j = b.j(context.getApplicationContext());
            if (j.p) {
                j.r();
            }
        }
        b j2 = b.j(context.getApplicationContext());
        if (j2.n() || j2.o) {
            if (intent.getIntExtra("android.bluetooth.le.extra.CALLBACK_TYPE", -1) == -1) {
                if (intent.getBooleanExtra("wakeup", false)) {
                    return;
                }
                intent.getStringExtra("wakeup");
                return;
            }
            intent.getIntExtra("android.bluetooth.le.extra.ERROR_CODE", -1);
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.bluetooth.le.extra.LIST_SCAN_RESULT");
            if (j2.o) {
                kzo s = kzo.s();
                if (parcelableArrayListExtra != null) {
                    ((ArrayList) s.w).addAll(parcelableArrayListExtra);
                }
                synchronized (s) {
                    if (System.currentTimeMillis() - ((Long) s.c).longValue() > 10000) {
                        ((Long) s.c).getClass();
                        s.c = Long.valueOf(System.currentTimeMillis());
                        s.x(context, ScanState.n(context), true);
                    }
                }
            }
        }
    }
}

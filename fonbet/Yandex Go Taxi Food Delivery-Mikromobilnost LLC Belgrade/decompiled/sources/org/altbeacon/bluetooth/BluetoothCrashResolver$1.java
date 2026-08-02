package org.altbeacon.bluetooth;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import defpackage.a66;

/* loaded from: classes4.dex */
class BluetoothCrashResolver$1 extends BroadcastReceiver {
    final /* synthetic */ a66 this$0;

    public BluetoothCrashResolver$1(a66 a66Var) {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action.equals("android.bluetooth.adapter.action.DISCOVERY_FINISHED")) {
            throw null;
        }
        if (action.equals("android.bluetooth.adapter.action.DISCOVERY_STARTED")) {
            throw null;
        }
        if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
            switch (intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE)) {
                case 10:
                    SystemClock.elapsedRealtime();
                    throw null;
                case 11:
                    SystemClock.elapsedRealtime();
                    throw null;
                case 12:
                    throw null;
                default:
                    return;
            }
        }
    }
}

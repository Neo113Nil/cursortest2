package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.SyncTask;
import com.squareup.cash.nearby.backend.ble.BleDeviceState;
import com.squareup.cash.nearby.backend.ble.RealBleManager;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.channels.ProducerScope;

/* loaded from: classes4.dex */
public final class zabs extends BroadcastReceiver {
    public final /* synthetic */ int $r8$classId = 1;
    public Object zaa;
    public Object zab;

    public zabs(ProducerScope producerScope, RealBleManager realBleManager) {
        this.zaa = producerScope;
        this.zab = realBleManager;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.$r8$classId) {
            case 0:
                Uri data = intent.getData();
                if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
                    ((zabr) this.zab).zaa();
                    zab();
                    break;
                }
                break;
            case 1:
                SyncTask syncTask = (SyncTask) this.zab;
                if (syncTask != null && syncTask.isDeviceConnected()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    SyncTask syncTask2 = (SyncTask) this.zab;
                    ((FirebaseMessaging) syncTask2.firebaseMessaging).enqueueTaskWithDelaySeconds(syncTask2, 0L);
                    Context context2 = (Context) this.zaa;
                    if (context2 != null) {
                        context2.unregisterReceiver(this);
                    }
                    this.zab = null;
                    break;
                }
                break;
            default:
                context.getClass();
                intent.getClass();
                String action = intent.getAction();
                if (action != null && action.hashCode() == -1530327060 && action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                    ((ProducerCoroutine) ((ProducerScope) this.zaa)).mo1159trySendJP2dKIU(((RealBleManager) this.zab).btAdapter.isEnabled() ? BleDeviceState.ENABLED : BleDeviceState.DISABLED);
                    break;
                }
                break;
        }
    }

    public void registerReceiver() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        SyncTask syncTask = (SyncTask) this.zab;
        if (syncTask != null) {
            Context applicationContext = ((FirebaseMessaging) syncTask.firebaseMessaging).getApplicationContext();
            this.zaa = applicationContext;
            applicationContext.registerReceiver(this, intentFilter);
        }
    }

    public void zaa(Context context) {
        this.zaa = context;
    }

    public synchronized void zab() {
        try {
            Context context = (Context) this.zaa;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.zaa = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public zabs(zabr zabrVar) {
        this.zab = zabrVar;
    }

    public /* synthetic */ zabs() {
    }
}

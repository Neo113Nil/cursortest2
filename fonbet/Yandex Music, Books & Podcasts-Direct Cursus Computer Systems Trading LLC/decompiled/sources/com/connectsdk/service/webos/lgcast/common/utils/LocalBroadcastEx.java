package com.connectsdk.service.webos.lgcast.common.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import defpackage.phg;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class LocalBroadcastEx {
    private HashMap<String, BroadcastReceiver> mReceiverMap = new HashMap<>();

    public interface BroadcastListener {
        void onReceive(Intent intent);
    }

    public void register(Context context, String str, final BroadcastListener broadcastListener) {
        if (context == null || str == null) {
            return;
        }
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.connectsdk.service.webos.lgcast.common.utils.LocalBroadcastEx.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                BroadcastListener broadcastListener2 = broadcastListener;
                if (broadcastListener2 != null) {
                    broadcastListener2.onReceive(intent);
                }
            }
        };
        phg.a(context).b(broadcastReceiver, new IntentFilter(str));
        unregister(context, str);
        this.mReceiverMap.put(str, broadcastReceiver);
    }

    public void registerOnce(Context context, final String str, final BroadcastListener broadcastListener) {
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.connectsdk.service.webos.lgcast.common.utils.LocalBroadcastEx.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                BroadcastListener broadcastListener2 = broadcastListener;
                if (broadcastListener2 != null) {
                    broadcastListener2.onReceive(intent);
                }
                LocalBroadcastEx.this.unregister(context2, str);
            }
        };
        if (context == null || str == null) {
            return;
        }
        if (registered(str)) {
            unregister(context, str);
        }
        phg.a(context).b(broadcastReceiver, new IntentFilter(str));
        this.mReceiverMap.put(str, broadcastReceiver);
    }

    public boolean registered(String str) {
        return this.mReceiverMap.get(str) != null;
    }

    public void unregister(Context context, String str) {
        BroadcastReceiver remove;
        if (context == null || str == null || (remove = this.mReceiverMap.remove(str)) == null) {
            return;
        }
        phg.a(context).d(remove);
    }

    public void unregisterAll(Context context) {
        if (context == null) {
            return;
        }
        Iterator<BroadcastReceiver> it = this.mReceiverMap.values().iterator();
        while (it.hasNext()) {
            phg.a(context).d(it.next());
        }
        this.mReceiverMap.clear();
    }
}

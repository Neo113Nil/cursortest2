package com.google.android.gms.internal.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class zzql extends BroadcastReceiver {
    public static volatile zzxs zzb;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra == null) {
            return;
        }
        if (stringExtra.contains("../") || stringExtra.contains("/..")) {
            StringBuilder sb = new StringBuilder(stringExtra.length() + 68);
            sb.append("Got an invalid config package for P/H that includes '..': ");
            sb.append(stringExtra);
            sb.append(". Exiting.");
            Log.w("PhUpdateBroadcastRecv", sb.toString());
            return;
        }
        zzxs zzxsVar = zzb;
        if (zzxsVar == null) {
            Log.w("PhUpdateBroadcastRecv", "No callback registered for P/H UPDATE broadcast. Exiting.");
            return;
        }
        zzoo zzooVar = (zzoo) ((ConcurrentHashMap) ((zzxs) zzxsVar.zza$1).zza$1).get(stringExtra);
        if (zzooVar != null) {
            zzooVar.zza.zzr();
        }
    }
}

package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.common.internal.zzr;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class ConnectionTracker {
    public static final Object zzb = new Object();
    public static volatile ConnectionTracker zzc;
    public final ConcurrentHashMap zza = new ConcurrentHashMap();

    public static ConnectionTracker getInstance() {
        if (zzc == null) {
            synchronized (zzb) {
                try {
                    if (zzc == null) {
                        zzc = new ConnectionTracker();
                    }
                } finally {
                }
            }
        }
        ConnectionTracker connectionTracker = zzc;
        zzae.checkNotNull(connectionTracker);
        return connectionTracker;
    }

    public final boolean bindService(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return zzc(context, context.getClass().getName(), intent, serviceConnection, i, null);
    }

    public final void unbindService(Context context, ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof zzr)) {
            ConcurrentHashMap concurrentHashMap = this.zza;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    try {
                        context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                    } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                    }
                    return;
                } finally {
                    concurrentHashMap.remove(serviceConnection);
                }
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzc(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        boolean z;
        ComponentName component = intent.getComponent();
        if (component != null) {
            if ((Wrappers.packageManager(context).getApplicationInfo(0, component.getPackageName()).flags & PKIFailureInfo.badSenderNonce) != 0) {
                z = true;
                if (!z) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
                if (serviceConnection instanceof zzr) {
                    if (executor == null) {
                        executor = null;
                    }
                    return executor != null ? context.bindService(intent, i, executor, serviceConnection) : context.bindService(intent, serviceConnection, i);
                }
                ConcurrentHashMap concurrentHashMap = this.zza;
                ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
                if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
                    Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
                }
                if (executor == null) {
                    executor = null;
                }
                try {
                    boolean bindService = executor != null ? context.bindService(intent, i, executor, serviceConnection) : context.bindService(intent, serviceConnection, i);
                    if (bindService) {
                        return bindService;
                    }
                    concurrentHashMap.remove(serviceConnection, serviceConnection);
                    return false;
                } catch (Throwable th) {
                    concurrentHashMap.remove(serviceConnection, serviceConnection);
                    throw th;
                }
            }
        }
        z = false;
        if (!z) {
        }
    }
}

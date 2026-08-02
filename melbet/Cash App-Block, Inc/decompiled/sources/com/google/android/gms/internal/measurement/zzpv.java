package com.google.android.gms.internal.measurement;

import android.os.Process;
import android.util.Log;
import com.google.common.util.concurrent.FluentFuture;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzpv implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object zza;

    public /* synthetic */ zzpv(Object obj, int i) {
        this.$r8$classId = i;
        this.zza = obj;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.$r8$classId;
        int i2 = 0;
        Object obj = this.zza;
        switch (i) {
            case 0:
                throw new RuntimeException(((ExecutionException) obj).getCause());
            case 1:
                try {
                    Futures.getDone((ListenableFuture) obj);
                    return;
                } catch (ExecutionException e) {
                    zzlf.zzb().post(new zzpv(e, i2));
                    return;
                }
            case 2:
                try {
                    Futures.getDone((FluentFuture.TrustedFuture) obj);
                    return;
                } catch (Exception e2) {
                    Log.w("PhFlagUpdateRegistry", "Failed to register flag update listener which may lead to stale flags.", e2);
                    return;
                }
            case 3:
                if (((Boolean) ((zzqi) obj).zzd.get()).booleanValue()) {
                    Log.i("PhenotypeProcessReaper", "Killing process to refresh experiment configuration");
                    Process.killProcess(Process.myPid());
                    System.exit(0);
                    return;
                }
                return;
            default:
                try {
                    Futures.getDone((FluentFuture) obj);
                    return;
                } catch (Exception e3) {
                    if (Log.isLoggable("StorageInfoHandler", 3)) {
                        Log.d("StorageInfoHandler", "Failed to get storage info from GMS", e3);
                        return;
                    }
                    return;
                }
        }
    }
}

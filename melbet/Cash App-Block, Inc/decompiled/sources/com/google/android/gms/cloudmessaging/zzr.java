package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
public final class zzr {
    public final /* synthetic */ int $r8$classId;
    public final int zza;
    public final TaskCompletionSource zzb = new TaskCompletionSource();
    public final int zzc;
    public final Bundle zzd;

    public zzr(int i, int i2, Bundle bundle, int i3) {
        this.$r8$classId = i3;
        this.zza = i;
        this.zzc = i2;
        this.zzd = bundle;
    }

    public final String toString() {
        return "Request { what=" + this.zzc + " id=" + this.zza + " oneWay=" + zzb() + "}";
    }

    public final boolean zzb() {
        switch (this.$r8$classId) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void zzc(zzt zztVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + zztVar.toString());
        }
        this.zzb.setException(zztVar);
    }

    public final void zzd(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(bundle));
        }
        this.zzb.setResult(bundle);
    }
}

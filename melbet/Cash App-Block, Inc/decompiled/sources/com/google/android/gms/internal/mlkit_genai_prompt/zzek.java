package com.google.android.gms.internal.mlkit_genai_prompt;

import android.os.RemoteException;
import android.util.Log;
import androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzek implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object zza;

    public /* synthetic */ zzek(Object obj, int i) {
        this.$r8$classId = i;
        this.zza = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.zza;
        switch (i) {
            case 0:
                try {
                    ((zzal) obj).zzd$1();
                    break;
                } catch (RemoteException e) {
                    Log.w("zzer", "Failed to cancel inference", e);
                    return;
                }
            case 1:
                Log.i("zzfn", "Cleaning up due to autoUnbind.");
                ((zzfn) obj).zzq();
                break;
            default:
                ((CallbackToFutureAdapter$SafeFuture) obj).cancel(false);
                break;
        }
    }
}

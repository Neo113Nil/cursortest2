package com.google.android.gms.wallet;

import android.os.Looper;
import android.util.SparseArray;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class zzc implements OnCompleteListener, Runnable {
    public static final com.google.android.gms.internal.wallet.zzd zza;
    public static final SparseArray zzb;
    public static final AtomicInteger zzd;
    public int zzc;
    public zzd zze;
    public Task zzf;

    static {
        com.google.android.gms.internal.wallet.zzd zzdVar = new com.google.android.gms.internal.wallet.zzd(Looper.getMainLooper());
        Looper.getMainLooper();
        zza = zzdVar;
        zzb = new SparseArray(2);
        zzd = new AtomicInteger();
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        this.zzf = task;
        zzd();
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzb.delete(this.zzc);
    }

    public final void zzd() {
        if (this.zzf == null || this.zze == null) {
            return;
        }
        zzb.delete(this.zzc);
        zza.removeCallbacks(this);
        zzd zzdVar = this.zze;
        if (zzdVar != null) {
            zzdVar.zzc(this.zzf);
        }
    }
}

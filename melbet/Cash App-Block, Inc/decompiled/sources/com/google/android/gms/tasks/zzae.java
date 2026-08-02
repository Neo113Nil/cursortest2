package com.google.android.gms.tasks;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import java.util.concurrent.ExecutionException;

/* loaded from: classes4.dex */
public final class zzae implements OnSuccessListener, OnFailureListener, OnCanceledListener {
    public final Object zza = new Object();
    public final int zzb;
    public final zzw zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public Exception zzg;
    public boolean zzh;

    public zzae(int i, zzw zzwVar) {
        this.zzb = i;
        this.zzc = zzwVar;
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        synchronized (this.zza) {
            this.zzf++;
            this.zzh = true;
            zza$1();
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        synchronized (this.zza) {
            this.zze++;
            this.zzg = exc;
            zza$1();
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        synchronized (this.zza) {
            this.zzd++;
            zza$1();
        }
    }

    public final void zza$1() {
        int i = this.zzd;
        int i2 = this.zze;
        int i3 = i + i2 + this.zzf;
        int i4 = this.zzb;
        if (i3 == i4) {
            Exception exc = this.zzg;
            zzw zzwVar = this.zzc;
            if (exc != null) {
                int length = String.valueOf(i2).length();
                zzwVar.zzc(new ExecutionException(Recorder$$ExternalSyntheticOutline1.m(i2, i4, " out of ", " underlying tasks failed", new StringBuilder(String.valueOf(i4).length() + length + 8 + 24)), this.zzg));
            } else if (this.zzh) {
                zzwVar.zze();
            } else {
                zzwVar.zza(null);
            }
        }
    }
}

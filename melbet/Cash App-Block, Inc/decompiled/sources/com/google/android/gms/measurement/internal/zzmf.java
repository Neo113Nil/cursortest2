package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbm;
import com.google.android.gms.internal.measurement.zzbn;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class zzmf extends zzbm implements zzgh {
    public final /* synthetic */ AtomicReference zza;
    public final /* synthetic */ zznl zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzmf(zznl zznlVar, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
        this.zza = atomicReference;
        this.zzb = zznlVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean zza(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        zzoq zzoqVar = (zzoq) zzbn.zzb(parcel, zzoq.CREATOR);
        zzbn.zzf(parcel);
        zze(zzoqVar);
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzgh
    public final void zze(zzoq zzoqVar) {
        AtomicReference atomicReference = this.zza;
        synchronized (atomicReference) {
            zzgu zzguVar = ((zzic) this.zzb.$$delegate_0).zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzl.zzb(Integer.valueOf(zzoqVar.zza.size()), "[sgtm] Got upload batches from service. count");
            atomicReference.set(zzoqVar);
            atomicReference.notifyAll();
        }
    }
}

package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final /* synthetic */ class zza implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object zza;

    public /* synthetic */ zza(Object obj, int i) {
        this.$r8$classId = i;
        this.zza = obj;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        switch (this.$r8$classId) {
            case 0:
                return new zzk(((zzc) this.zza).zzc);
            case 1:
                return new zzk(((zzc) this.zza).zzd);
            default:
                zzz zzzVar = (zzz) this.zza;
                synchronized (((zztp) zzzVar.zzb).zzg) {
                    zzzVar.zza = null;
                }
                return null;
        }
    }
}

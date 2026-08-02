package com.google.android.libraries.places.internal;

import com.google.android.filament.Box;

/* loaded from: classes4.dex */
public final class zzcfe implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Box zza;

    public /* synthetic */ zzcfe(Box box, int i) {
        this.$r8$classId = i;
        this.zza = box;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Box box = this.zza;
        switch (i) {
            case 0:
                zzcax zzcaxVar = (zzcax) box.mHalfExtent;
                zzcaxVar.zzC = true;
                com.google.android.gms.maps.zzah zzahVar = zzcaxVar.zzv;
                zzcaxVar.zzx.zzc((zzbtx) zzahVar.f68zza, (zzbvs) zzahVar.zzb, (zzbsn) zzahVar.zzc);
                break;
            default:
                zzcax zzcaxVar2 = (zzcax) box.mHalfExtent;
                if (!zzcaxVar2.zzC) {
                    zzcaxVar2.zzx.zzd();
                    break;
                }
                break;
        }
    }
}

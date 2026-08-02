package com.google.android.gms.internal.time;

import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class zzew {
    public static final zzeu zza;
    public static final zzev zzb;
    public final HashMap zzc;
    public final HashMap zzd;
    public final zzeu zze;
    public zzev zzf;

    static {
        int i = 0;
        zza = new zzeu(i);
        zzb = new zzev(i);
    }

    public zzew(zzew zzewVar) {
        HashMap hashMap = new HashMap();
        this.zzc = hashMap;
        HashMap hashMap2 = new HashMap();
        this.zzd = hashMap2;
        hashMap.putAll(zzewVar.zzc);
        hashMap2.putAll(zzewVar.zzd);
        this.zze = zzewVar.zze;
        this.zzf = zzewVar.zzf;
    }

    public void zza(zzdq zzdqVar, Object obj, zzem zzemVar) {
        zzeu zzeuVar = (zzeu) this.zzc.get(zzdqVar);
        if (zzeuVar != null) {
            zzeuVar.zza(zzdqVar, obj, zzemVar);
        } else {
            this.zze.zza(zzdqVar, obj, zzemVar);
        }
    }

    public void zzb(zzdq zzdqVar, Iterator it, zzem zzemVar) {
        zzev zzevVar = this.zzf;
        zzev zzevVar2 = (zzev) this.zzd.get(zzdqVar);
        if (zzevVar2 != null) {
            zzevVar2.zza(zzdqVar, it, zzemVar);
        } else if (zzevVar != null && !this.zzc.containsKey(zzdqVar)) {
            zzevVar.zza(zzdqVar, it, zzemVar);
        } else {
            while (it.hasNext()) {
                zza(zzdqVar, it.next(), zzemVar);
            }
        }
    }

    public /* synthetic */ zzew() {
        this.zzc = new HashMap();
        this.zzd = new HashMap();
        this.zzf = null;
        this.zze = zzcw.zza;
    }
}

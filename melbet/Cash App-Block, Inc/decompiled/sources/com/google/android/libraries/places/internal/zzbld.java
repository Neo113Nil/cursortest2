package com.google.android.libraries.places.internal;

import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;
import com.squareup.moshi.LinkedHashTreeMap;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzbld implements zzbln {
    public final zzbhz zza;
    public final zzgc zzb;
    public final boolean zzc;

    public zzbld(zzgc zzgcVar, zzbhz zzbhzVar) {
        zzgc zzgcVar2 = zzbjf.zza;
        this.zzb = zzgcVar;
        this.zzc = zzbhzVar instanceof zzbjo;
        this.zza = zzbhzVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbln
    public final Object zza() {
        zzbhz zzbhzVar = this.zza;
        return zzbhzVar instanceof zzbjr ? (zzbjr) ((zzbjr) zzbhzVar).zzb(4, null) : ((zzbjl) ((zzbjr) zzbhzVar).zzb(5, null)).zzF();
    }

    @Override // com.google.android.libraries.places.internal.zzbln
    public final boolean zzb(zzbjr zzbjrVar, zzbjr zzbjrVar2) {
        if (!zzbjrVar.zzc.equals(zzbjrVar2.zzc)) {
            return false;
        }
        if (this.zzc) {
            return ((zzbjo) zzbjrVar).zzb.equals(((zzbjo) zzbjrVar2).zzb);
        }
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzbln
    public final int zzc(zzbjr zzbjrVar) {
        int hashCode = zzbjrVar.zzc.hashCode();
        if (!this.zzc) {
            return hashCode;
        }
        return ((zzbjo) zzbjrVar).zzb.zza.hashCode() + (hashCode * 53);
    }

    @Override // com.google.android.libraries.places.internal.zzbln
    public final void zzd(Object obj, Object obj2) {
        zzblo.zzD(obj, obj2);
        if (this.zzc) {
            zzblo.zzC(zzbjf.zza, obj, obj2);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbln
    public final int zze(zzbhz zzbhzVar) {
        zzbma zzbmaVar = ((zzbjr) zzbhzVar).zzc;
        int i = zzbmaVar.zze;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < zzbmaVar.zzb; i2++) {
                int i3 = zzbmaVar.zzc[i2] >>> 3;
                zzbim zzbimVar = (zzbim) zzbmaVar.zzd[i2];
                int zzG = zzbiv.zzG(8);
                int zzG2 = zzbiv.zzG(i3) + zzbiv.zzG(16);
                int zzG3 = zzbiv.zzG(24);
                int zzb = zzbimVar.zzb();
                i = JsonLogicResult$Success$$ExternalSyntheticOutline0.m$1(zzG + zzG, zzG2, zzel$EnumUnboxingLocalUtility.m(zzb, zzb, zzG3), i);
            }
            zzbmaVar.zze = i;
        }
        if (this.zzc) {
            zzblp zzblpVar = ((zzbjo) zzbhzVar).zzb.zza;
            if (zzblpVar.zzb > 0) {
                zzbjh.zzp(zzblpVar.zzd(0));
                throw null;
            }
            Iterator it = zzblpVar.zze().iterator();
            if (it.hasNext()) {
                zzbjh.zzp((Map.Entry) it.next());
                throw null;
            }
        }
        return i;
    }

    @Override // com.google.android.libraries.places.internal.zzbln
    public final void zzf(Object obj, zzfv zzfvVar) {
        Iterator zzd = ((zzbjo) obj).zzb.zzd();
        if (zzd.hasNext()) {
            throw null;
        }
        zzbma zzbmaVar = ((zzbjr) obj).zzc;
        for (int i = 0; i < zzbmaVar.zzb; i++) {
            int i2 = zzbmaVar.zzc[i] >>> 3;
            Object obj2 = zzbmaVar.zzd[i];
            boolean z = obj2 instanceof zzbim;
            zzbiv zzbivVar = (zzbiv) zzfvVar.zza;
            if (z) {
                zzbivVar.zzo(i2, (zzbim) obj2);
            } else {
                zzbivVar.zzn(i2, (zzbhz) obj2);
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbln
    public final void zzg(Object obj, LinkedHashTreeMap.AvlBuilder avlBuilder, zzbjc zzbjcVar) {
        boolean z;
        zzgc zzgcVar = zzbjf.zza;
        this.zzb.getClass();
        zzbma zzh = zzgc.zzh(obj);
        zzgc.zza(obj);
        do {
            try {
                if (avlBuilder.zzb() != Integer.MAX_VALUE) {
                    int i = avlBuilder.leavesToSkip;
                    zzbhz zzbhzVar = this.zza;
                    zzbim zzbimVar = null;
                    if (i == 11) {
                        int i2 = 0;
                        while (avlBuilder.zzb() != Integer.MAX_VALUE) {
                            int i3 = avlBuilder.leavesToSkip;
                            if (i3 != 16) {
                                if (i3 != 26) {
                                    if (i3 == 12 || !avlBuilder.zzd()) {
                                        break;
                                    }
                                } else {
                                    zzbimVar = avlBuilder.zzs();
                                }
                            } else {
                                avlBuilder.zzS(0);
                                i2 = ((zzbiq) avlBuilder.stack).zzo();
                                zzbjcVar.getClass();
                            }
                        }
                        if (avlBuilder.leavesToSkip != 12) {
                            throw new zzbke("Protocol message end-group tag did not match expected tag.");
                        }
                        if (zzbimVar != null) {
                            zzh.zzk((i2 << 3) | 2, zzbimVar);
                        }
                        z = true;
                    } else if ((i & 7) == 2) {
                        int i4 = i >>> 3;
                        zzbjcVar.getClass();
                        z = zzgc.zzk(0, avlBuilder, zzh);
                    } else {
                        z = avlBuilder.zzd();
                    }
                }
            } finally {
                ((zzbjr) obj).zzc = zzh;
            }
        } while (z);
    }

    @Override // com.google.android.libraries.places.internal.zzbln
    public final void zzh(Object obj) {
        this.zzb.getClass();
        zzbma zzbmaVar = ((zzbjr) obj).zzc;
        if (zzbmaVar.zzf) {
            zzbmaVar.zzf = false;
        }
        zzgc zzgcVar = zzbjf.zza;
        ((zzbjo) obj).zzb.zzb();
    }

    @Override // com.google.android.libraries.places.internal.zzbln
    public final boolean zzi(Object obj) {
        return ((zzbjo) obj).zzb.zzg();
    }
}

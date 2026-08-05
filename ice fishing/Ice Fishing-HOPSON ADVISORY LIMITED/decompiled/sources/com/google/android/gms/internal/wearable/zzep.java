package com.google.android.gms.internal.wearable;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzep implements zzey {
    private final zzel zza;
    private final zzfi zzb;
    private final boolean zzc;
    private final zzct zzd;

    private zzep(zzfi zzfiVar, zzct zzctVar, zzel zzelVar) {
        this.zzb = zzfiVar;
        this.zzc = zzelVar instanceof zzdd;
        this.zzd = zzctVar;
        this.zza = zzelVar;
    }

    static zzep zzh(zzfi zzfiVar, zzct zzctVar, zzel zzelVar) {
        return new zzep(zzfiVar, zzctVar, zzelVar);
    }

    @Override // com.google.android.gms.internal.wearable.zzey
    public final Object zza() {
        zzel zzelVar = this.zza;
        return zzelVar instanceof zzdg ? ((zzdg) zzelVar).zzO() : zzelVar.zzah().zzw();
    }

    @Override // com.google.android.gms.internal.wearable.zzey
    public final boolean zzb(Object obj, Object obj2) {
        if (!((zzdg) obj).zzc.equals(((zzdg) obj2).zzc)) {
            return false;
        }
        if (this.zzc) {
            return ((zzdd) obj).zzb.equals(((zzdd) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.wearable.zzey
    public final int zzc(Object obj) {
        int hashCode = ((zzdg) obj).zzc.hashCode();
        return this.zzc ? (hashCode * 53) + ((zzdd) obj).zzb.zza.hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.wearable.zzey
    public final void zzd(Object obj, Object obj2) {
        zzez.zzD(this.zzb, obj, obj2);
        if (this.zzc) {
            zzez.zzC(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.wearable.zzey
    public final int zze(Object obj) {
        int zzh = ((zzdg) obj).zzc.zzh();
        return this.zzc ? zzh + ((zzdd) obj).zzb.zzf() : zzh;
    }

    @Override // com.google.android.gms.internal.wearable.zzey
    public final void zzf(Object obj, zzfx zzfxVar) throws IOException {
        Iterator zzc = ((zzdd) obj).zzb.zzc();
        while (zzc.hasNext()) {
            Map.Entry entry = (Map.Entry) zzc.next();
            zzcw zzcwVar = (zzcw) entry.getKey();
            if (zzcwVar.zzc() != zzfw.MESSAGE || zzcwVar.zzd() || zzcwVar.zze()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof zzdr) {
                zzfxVar.zzv(zzcwVar.zza(), ((zzdr) entry).zza().zzb());
            } else {
                zzfxVar.zzv(zzcwVar.zza(), entry.getValue());
            }
        }
        ((zzdg) obj).zzc.zzf(zzfxVar);
    }

    @Override // com.google.android.gms.internal.wearable.zzey
    public final void zzg(Object obj, zzex zzexVar, zzcs zzcsVar) throws IOException {
        this.zzb.zzh(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.wearable.zzey
    public final void zzj(Object obj, byte[] bArr, int i, int i2, zzbw zzbwVar) throws IOException {
        zzdg zzdgVar = (zzdg) obj;
        if (zzdgVar.zzc == zzfj.zza()) {
            zzdgVar.zzc = zzfj.zzb();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.wearable.zzey
    public final void zzk(Object obj) {
        this.zzb.zzj(obj);
        this.zzd.zza(obj);
    }

    @Override // com.google.android.gms.internal.wearable.zzey
    public final boolean zzl(Object obj) {
        return ((zzdd) obj).zzb.zze();
    }
}

package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzdt {
    protected volatile zzel zza;
    private final zzel zzb;
    private final zzcs zzc;
    private volatile zzcg zzd;
    private volatile boolean zze;

    zzdt(zzel zzelVar) {
        if (zzelVar == null) {
            throw new IllegalArgumentException("message cannot be null");
        }
        this.zza = zzelVar;
        this.zzb = zzelVar.zzai();
        int i = zzcs.zzb;
        int i2 = zzbv.zza;
        this.zzc = zzcs.zza;
        this.zzd = null;
        this.zze = false;
    }

    public final boolean equals(Object obj) {
        return zza().equals(obj);
    }

    public final int hashCode() {
        return zza().hashCode();
    }

    public final String toString() {
        return zza().toString();
    }

    final zzel zza() {
        try {
            if (this.zza == null) {
                synchronized (this) {
                    if (this.zze) {
                        throw new zzdv("Repeat access to corrupted lazy field");
                    }
                    try {
                        this.zza = (zzel) this.zzb.zzN().zza(this.zzd, this.zzc);
                    } catch (zzdv e) {
                        this.zze = true;
                        throw e;
                    }
                }
            }
            return this.zza;
        } catch (zzdv unused) {
            zzcs.zza();
            return this.zzb;
        }
    }

    final zzcg zzb() {
        if (this.zzd != null) {
            return this.zzd;
        }
        synchronized (this) {
            if (this.zzd != null) {
                return this.zzd;
            }
            this.zzd = this.zza.zzH();
            return this.zzd;
        }
    }

    final int zzc(int i) {
        int zzu = zzcn.zzu(8);
        int i2 = zzu + zzu;
        int zzu2 = zzcn.zzu(16) + zzcn.zzu(i);
        int zzu3 = zzcn.zzu(24);
        int zzb = this.zzd != null ? this.zzd.zzb() : this.zza.zzT();
        return i2 + zzu2 + zzu3 + zzcn.zzu(zzb) + zzb;
    }
}

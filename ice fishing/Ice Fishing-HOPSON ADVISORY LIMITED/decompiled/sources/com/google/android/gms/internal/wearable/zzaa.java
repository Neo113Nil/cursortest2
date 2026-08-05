package com.google.android.gms.internal.wearable;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzaa extends zzdg implements zzem {
    private static final zzaa zzt;
    private static volatile zzes zzu;
    private int zzb;
    private double zzg;
    private float zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private long zzr;
    private byte zzs = 2;
    private zzcg zze = zzcg.zza;
    private String zzf = "";
    private zzdp zzm = zzaa();
    private zzdp zzn = zzaa();
    private zzdp zzo = zzaa();
    private zzdo zzp = zzY();
    private zzdm zzq = zzZ();

    static {
        zzaa zzaaVar = new zzaa();
        zzt = zzaaVar;
        zzdg.zzV(zzaa.class, zzaaVar);
    }

    private zzaa() {
    }

    public static zzz zzp() {
        return (zzz) zzt.zzR();
    }

    public static zzaa zzq() {
        return zzt;
    }

    final /* synthetic */ void zzA(zzab zzabVar) {
        zzabVar.getClass();
        zzdp zzdpVar = this.zzn;
        if (!zzdpVar.zza()) {
            this.zzn = zzdg.zzab(zzdpVar);
        }
        this.zzn.add(zzabVar);
    }

    final /* synthetic */ void zzB(Iterable iterable) {
        zzdp zzdpVar = this.zzo;
        if (!zzdpVar.zza()) {
            this.zzo = zzdg.zzab(zzdpVar);
        }
        zzbr.zzK(iterable, this.zzo);
    }

    final /* synthetic */ void zzC(Iterable iterable) {
        zzdo zzdoVar = this.zzp;
        if (!zzdoVar.zza()) {
            int size = zzdoVar.size();
            this.zzp = zzdoVar.zzg(size + size);
        }
        zzbr.zzK(iterable, this.zzp);
    }

    final /* synthetic */ void zzD(Iterable iterable) {
        zzdm zzdmVar = this.zzq;
        if (!zzdmVar.zza()) {
            int size = zzdmVar.size();
            this.zzq = zzdmVar.zzg(size + size);
        }
        zzbr.zzK(iterable, this.zzq);
    }

    final /* synthetic */ void zzE(long j) {
        this.zzb |= 256;
        this.zzr = j;
    }

    public final zzcg zza() {
        return this.zze;
    }

    public final String zzb() {
        return this.zzf;
    }

    public final double zzc() {
        return this.zzg;
    }

    public final float zzd() {
        return this.zzh;
    }

    public final long zze() {
        return this.zzi;
    }

    public final int zzf() {
        return this.zzj;
    }

    public final int zzg() {
        return this.zzk;
    }

    public final boolean zzh() {
        return this.zzl;
    }

    public final List zzi() {
        return this.zzm;
    }

    public final List zzj() {
        return this.zzn;
    }

    public final int zzk() {
        return this.zzn.size();
    }

    public final List zzl() {
        return this.zzo;
    }

    public final List zzm() {
        return this.zzp;
    }

    public final List zzn() {
        return this.zzq;
    }

    public final long zzo() {
        return this.zzr;
    }

    final /* synthetic */ void zzr(zzcg zzcgVar) {
        zzcgVar.getClass();
        this.zzb |= 1;
        this.zze = zzcgVar;
    }

    final /* synthetic */ void zzs(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    final /* synthetic */ void zzt(double d) {
        this.zzb |= 4;
        this.zzg = d;
    }

    final /* synthetic */ void zzu(float f) {
        this.zzb |= 8;
        this.zzh = f;
    }

    final /* synthetic */ void zzv(long j) {
        this.zzb |= 16;
        this.zzi = j;
    }

    final /* synthetic */ void zzw(int i) {
        this.zzb |= 32;
        this.zzj = i;
    }

    final /* synthetic */ void zzx(int i) {
        this.zzb |= 64;
        this.zzk = i;
    }

    final /* synthetic */ void zzy(boolean z) {
        this.zzb |= 128;
        this.zzl = z;
    }

    final /* synthetic */ void zzz(Iterable iterable) {
        zzdp zzdpVar = this.zzm;
        if (!zzdpVar.zza()) {
            this.zzm = zzdg.zzab(zzdpVar);
        }
        zzbr.zzK(iterable, this.zzm);
    }

    @Override // com.google.android.gms.internal.wearable.zzdg
    protected final Object zzG(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzs);
        }
        if (i2 == 2) {
            return zzW(zzt, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0005\u0002\u0001ည\u0000\u0002ဈ\u0001\u0003က\u0002\u0004ခ\u0003\u0005ဂ\u0004\u0006င\u0005\u0007ဏ\u0006\bဇ\u0007\tЛ\nЛ\u000b\u001a\f\u0014\rဂ\b\u000e\u0013", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", zzac.class, "zzn", zzab.class, "zzo", "zzp", "zzr", "zzq"});
        }
        if (i2 == 3) {
            return new zzaa();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new zzz(bArr);
        }
        if (i2 == 5) {
            return zzt;
        }
        if (i2 != 6) {
            this.zzs = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzes zzesVar = zzu;
        if (zzesVar == null) {
            synchronized (zzaa.class) {
                zzesVar = zzu;
                if (zzesVar == null) {
                    zzesVar = new zzdc(zzt);
                    zzu = zzesVar;
                }
            }
        }
        return zzesVar;
    }
}

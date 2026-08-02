package com.google.android.gms.internal.measurement;

/* loaded from: classes4.dex */
public final class zznk extends zzadu {
    private static final zznk zzo;
    private static volatile zzafj zzp;
    private int zzb;
    private boolean zzf;
    private zzaef zzh;
    private zzaef zzi;
    private zzaeb zzj;
    private zznm zzk;
    private boolean zzl;
    private boolean zzm;
    private zznf zzn;
    private zzacr zze = zzacr.zza;
    private String zzg = "";

    static {
        zznk zznkVar = new zznk();
        zzo = zznkVar;
        zzadu.zzcs(zznk.class, zznkVar);
    }

    public zznk() {
        zzafm zzafmVar = zzafm.zzb;
        this.zzh = zzafmVar;
        this.zzi = zzafmVar;
        this.zzj = zzadv.zzb;
    }

    public static zznk zza() {
        return zzo;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object zzg(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzafn(zzo, "\u0004\n\u0000\u0001\u0001\f\n\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005\u001a\u0007ࠬ\bဉ\u0003\nဇ\u0004\u000bဇ\u0005\fဉ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzfj.zza$1, "zzk", "zzl", "zzm", "zzn"});
        }
        if (i2 == 3) {
            return new zznk();
        }
        if (i2 == 4) {
            return new zzfi(zzo);
        }
        if (i2 == 5) {
            return zzo;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar2 = zzp;
        if (zzafjVar2 != null) {
            return zzafjVar2;
        }
        synchronized (zznk.class) {
            try {
                zzafjVar = zzp;
                if (zzafjVar == null) {
                    zzafjVar = new zzadq(zzo);
                    zzp = zzafjVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzafjVar;
    }
}

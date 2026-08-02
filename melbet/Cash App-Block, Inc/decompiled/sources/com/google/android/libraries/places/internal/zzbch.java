package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbch extends zzbjr {
    private static final zzbch zzr;
    private static volatile zzblh zzs;
    private int zzb;
    private String zze = "";
    private zzbce zzf;
    private zzbcg zzg;
    private zzbkb zzh;
    private zzbkb zzi;
    private String zzj;
    private String zzk;
    private zzbnw zzl;
    private int zzm;
    private boolean zzn;
    private String zzo;
    private boolean zzp;
    private boolean zzq;

    static {
        zzbch zzbchVar = new zzbch();
        zzr = zzbchVar;
        zzbjr.zzbF(zzbch.class, zzbchVar);
    }

    public zzbch() {
        zzblk zzblkVar = zzblk.zzb;
        this.zzh = zzblkVar;
        this.zzi = zzblkVar;
        this.zzj = "";
        this.zzk = "";
        this.zzo = "";
    }

    public static zzbcc zza$1() {
        return (zzbcc) zzr.zzbB();
    }

    public static zzbch zzc() {
        return zzr;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzr, "\u0000\r\u0000\u0001\u0001\r\r\u0000\u0002\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004Ț\u0005Ț\u0006Ȉ\u0007Ȉ\bဉ\u0002\t\u0004\n\u0007\u000bȈ\f\u0007\r\u0007", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq"});
        }
        if (i2 == 3) {
            return new zzbch();
        }
        if (i2 == 4) {
            return new zzbcc(zzr);
        }
        if (i2 == 5) {
            return zzr;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzs;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzbch.class) {
            try {
                zzblhVar = zzs;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzr);
                    zzs = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }

    public final /* synthetic */ void zzd(String str) {
        str.getClass();
        this.zze = str;
    }

    public final void zzg(String str) {
        str.getClass();
        zzbkb zzbkbVar = this.zzh;
        if (!((zzbic) zzbkbVar).zza) {
            int size = zzbkbVar.size();
            this.zzh = zzbkbVar.zzg(size + size);
        }
        this.zzh.add(str);
    }

    public final void zzh$1(String str) {
        str.getClass();
        zzbkb zzbkbVar = this.zzi;
        if (!((zzbic) zzbkbVar).zza) {
            int size = zzbkbVar.size();
            this.zzi = zzbkbVar.zzg(size + size);
        }
        this.zzi.add(str);
    }

    public final /* synthetic */ void zzi(String str) {
        str.getClass();
        this.zzj = str;
    }

    public final /* synthetic */ void zzm(String str) {
        str.getClass();
        this.zzo = str;
    }
}

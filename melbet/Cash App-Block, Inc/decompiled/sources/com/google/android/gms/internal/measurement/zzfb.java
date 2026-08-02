package com.google.android.gms.internal.measurement;

/* loaded from: classes4.dex */
public final class zzfb extends zzadu {
    private static final zzfb zzi;
    private static volatile zzafj zzj;
    private int zzb;
    private boolean zzf;
    private long zzh;
    private String zze = "";
    private String zzg = "";

    static {
        zzfb zzfbVar = new zzfb();
        zzi = zzfbVar;
        zzadu.zzcs(zzfb.class, zzfbVar);
    }

    public static zzfa zza() {
        return (zzfa) zzi.zzcn();
    }

    public final /* synthetic */ void zzb(String str) {
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void zzc() {
        this.zzb |= 2;
        this.zzf = true;
    }

    public final /* synthetic */ void zzd(String str) {
        this.zzb |= 4;
        this.zzg = str;
    }

    public final /* synthetic */ void zze(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object zzg(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzafn(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzfb();
        }
        if (i2 == 4) {
            return new zzfa(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar2 = zzj;
        if (zzafjVar2 != null) {
            return zzafjVar2;
        }
        synchronized (zzfb.class) {
            try {
                zzafjVar = zzj;
                if (zzafjVar == null) {
                    zzafjVar = new zzadq(zzi);
                    zzj = zzafjVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzafjVar;
    }
}

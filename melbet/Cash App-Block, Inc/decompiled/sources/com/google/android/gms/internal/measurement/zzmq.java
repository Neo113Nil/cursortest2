package com.google.android.gms.internal.measurement;

import com.squareup.moshi.LinkedHashTreeMap;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzmq extends zzadu {
    private static final zzmq zzj;
    private static volatile zzafj zzk;
    private int zzb;
    private long zzh;
    private zzaew zzi = zzaew.zzb;
    private String zze = "";
    private zzacr zzf = zzacr.zza;
    private String zzg = "";

    static {
        zzmq zzmqVar = new zzmq();
        zzj = zzmqVar;
        zzadu.zzcs(zzmq.class, zzmqVar);
    }

    public static zzmq zzh(zzacv zzacvVar, zzadf zzadfVar) {
        zzadu zzck = zzj.zzck();
        try {
            zzafp zzb = zzafl.zza.zzb(zzck.getClass());
            LinkedHashTreeMap.AvlBuilder avlBuilder = (LinkedHashTreeMap.AvlBuilder) zzacvVar.zzd;
            if (avlBuilder == null) {
                avlBuilder = new LinkedHashTreeMap.AvlBuilder(zzacvVar);
            }
            zzb.zzg(zzck, avlBuilder, zzadfVar);
            zzb.zzk(zzck);
            zzadu.zzf(zzck);
            return (zzmq) zzck;
        } catch (zzaeh e) {
            if (e.zza) {
                throw new zzaeh(e.getMessage(), e);
            }
            throw e;
        } catch (zzafy e2) {
            throw e2.zza();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzaeh) {
                throw ((zzaeh) e3.getCause());
            }
            throw new zzaeh(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzaeh) {
                throw ((zzaeh) e4.getCause());
            }
            throw e4;
        }
    }

    public static zzmq zzi() {
        return zzj;
    }

    public final String zza() {
        return this.zze;
    }

    public final zzacr zzb() {
        return this.zzf;
    }

    public final String zzc() {
        return this.zzg;
    }

    public final long zzd() {
        return this.zzh;
    }

    public final int zze() {
        return this.zzi.size();
    }

    public final Map zzf() {
        return Collections.unmodifiableMap(this.zzi);
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object zzg(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzafn(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u00052", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", zzmp.zza});
        }
        if (i2 == 3) {
            return new zzmq();
        }
        if (i2 == 4) {
            return new zzfi(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar2 = zzk;
        if (zzafjVar2 != null) {
            return zzafjVar2;
        }
        synchronized (zzmq.class) {
            try {
                zzafjVar = zzk;
                if (zzafjVar == null) {
                    zzafjVar = new zzadq(zzj);
                    zzk = zzafjVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzafjVar;
    }
}

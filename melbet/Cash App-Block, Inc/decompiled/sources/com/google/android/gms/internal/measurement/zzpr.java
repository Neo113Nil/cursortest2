package com.google.android.gms.internal.measurement;

import com.squareup.moshi.LinkedHashTreeMap;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public final class zzpr extends zzadu {
    private static final zzpr zzl;
    private static volatile zzafj zzm;
    private int zzb;
    private boolean zzf;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = "";
    private zzaef zzg = zzafm.zzb;

    static {
        zzpr zzprVar = new zzpr();
        zzl = zzprVar;
        zzadu.zzcs(zzpr.class, zzprVar);
    }

    public static zzpr zzh(InputStream inputStream, zzadf zzadfVar) {
        zzpr zzprVar = zzl;
        zzacv zzM = zzacv.zzM(inputStream, 4096);
        zzadu zzck = zzprVar.zzck();
        try {
            zzafp zzb = zzafl.zza.zzb(zzck.getClass());
            LinkedHashTreeMap.AvlBuilder avlBuilder = (LinkedHashTreeMap.AvlBuilder) zzM.zzd;
            if (avlBuilder == null) {
                avlBuilder = new LinkedHashTreeMap.AvlBuilder(zzM);
            }
            zzb.zzg(zzck, avlBuilder, zzadfVar);
            zzb.zzk(zzck);
            zzadu.zzf(zzck);
            return (zzpr) zzck;
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

    public final String zza() {
        return this.zze;
    }

    public final boolean zzb() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object zzg(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzafn(zzl, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003\u001a\u0004᠌\u0002\u0005ဇ\u0003\u0006ဇ\u0005\u0007ဇ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", zzfj.zza$1, "zzi", "zzk", "zzj"});
        }
        if (i2 == 3) {
            return new zzpr();
        }
        if (i2 == 4) {
            return new zzfi(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar2 = zzm;
        if (zzafjVar2 != null) {
            return zzafjVar2;
        }
        synchronized (zzpr.class) {
            try {
                zzafjVar = zzm;
                if (zzafjVar == null) {
                    zzafjVar = new zzadq(zzl);
                    zzm = zzafjVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzafjVar;
    }
}

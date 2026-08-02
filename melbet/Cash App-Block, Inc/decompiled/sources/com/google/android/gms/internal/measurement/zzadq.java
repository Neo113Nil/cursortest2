package com.google.android.gms.internal.measurement;

import com.squareup.moshi.LinkedHashTreeMap;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class zzadq implements zzafj {
    public final zzadu zza;

    static {
        zzadf zzadfVar = zzadf.zzd;
        int i = zzacf.$r8$clinit;
    }

    public zzadq(zzadu zzaduVar) {
        this.zza = zzaduVar;
    }

    public final zzadu zza(InputStream inputStream, zzadf zzadfVar) {
        zzacv zzM = zzacv.zzM(inputStream, 4096);
        int i = zzadu.zzd;
        zzadu zzck = this.zza.zzck();
        try {
            zzafp zzb = zzafl.zza().zzb(zzck.getClass());
            zzb.zzg(zzck, LinkedHashTreeMap.AvlBuilder.zza(zzM), zzadfVar);
            zzb.zzk(zzck);
            zzM.zzb(0);
            if (zzadu.zzd(zzck, true)) {
                return zzck;
            }
            throw new zzafy().zza();
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
}

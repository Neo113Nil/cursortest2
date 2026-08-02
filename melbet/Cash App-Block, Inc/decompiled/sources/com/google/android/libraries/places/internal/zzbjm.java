package com.google.android.libraries.places.internal;

import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.squareup.moshi.LinkedHashTreeMap;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class zzbjm implements zzblh {
    public final zzbjr zza;

    static {
        zzbjc zzbjcVar = zzbjc.zza;
        int i = zzbid.$r8$clinit;
    }

    public zzbjm(zzbjr zzbjrVar) {
        this.zza = zzbjrVar;
    }

    public final zzbjr zza(zzbiq zzbiqVar, zzbjc zzbjcVar) {
        int i = zzbjr.zzd;
        zzbjr zzbjrVar = (zzbjr) this.zza.zzb(4, null);
        try {
            zzbln zzb = zzblj.zza.zzb(zzbjrVar.getClass());
            LinkedHashTreeMap.AvlBuilder avlBuilder = zzbiqVar.zze;
            if (avlBuilder == null) {
                avlBuilder = new LinkedHashTreeMap.AvlBuilder(zzbiqVar);
            }
            zzb.zzg(zzbjrVar, avlBuilder, zzbjcVar);
            zzb.zzh(zzbjrVar);
            if (zzbjr.zze(zzbjrVar, true)) {
                return zzbjrVar;
            }
            AesGcmSiv$$ExternalSyntheticLambda0.m(new zzbly().getMessage());
            return null;
        } catch (zzbke e) {
            if (e.zza) {
                throw new zzbke(e.getMessage(), e);
            }
            throw e;
        } catch (zzbly e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m(e2.getMessage());
            return null;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzbke) {
                throw ((zzbke) e3.getCause());
            }
            throw new zzbke(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzbke) {
                throw ((zzbke) e4.getCause());
            }
            throw e4;
        }
    }
}

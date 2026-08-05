package com.google.android.gms.internal.wearable;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzdc extends zzbt {
    private final zzdg zza;

    public zzdc(zzdg zzdgVar) {
        this.zza = zzdgVar;
    }

    @Override // com.google.android.gms.internal.wearable.zzes
    public final /* synthetic */ Object zzb(zzcj zzcjVar, zzcs zzcsVar) throws zzdv {
        int i = zzdg.zzd;
        zzdg zzO = this.zza.zzO();
        try {
            zzey zzb = zzeu.zza().zzb(zzO.getClass());
            zzb.zzg(zzO, zzck.zza(zzcjVar), zzcsVar);
            zzb.zzk(zzO);
            return zzO;
        } catch (zzdv e) {
            throw e;
        } catch (zzfh e2) {
            throw e2.zza();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzdv) {
                throw ((zzdv) e3.getCause());
            }
            throw new zzdv(e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzdv) {
                throw ((zzdv) e4.getCause());
            }
            throw e4;
        }
    }
}

package com.google.android.gms.internal.measurement;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.featuretoggle.UnleashContext;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class zzw extends zzai {
    public final HashMap zza;
    public final zzj zzb;

    public zzw(zzj zzjVar) {
        super("require");
        this.zza = new HashMap();
        this.zzb = zzjVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzao zza(UnleashContext unleashContext, List list) {
        zzao zzaoVar;
        zzh.zza("require", list, 1);
        String zzc = ((zzz) unleashContext.sessionId).zzb(unleashContext, (zzao) list.get(0)).zzc();
        HashMap hashMap = this.zza;
        if (hashMap.containsKey(zzc)) {
            return (zzao) hashMap.get(zzc);
        }
        HashMap hashMap2 = (HashMap) this.zzb.f64zza;
        if (hashMap2.containsKey(zzc)) {
            try {
                zzaoVar = (zzao) ((Callable) hashMap2.get(zzc)).call();
            } catch (Exception unused) {
                a$$ExternalSyntheticBUOutline0.m$1("Failed to create API implementation: ".concat(String.valueOf(zzc)));
                return null;
            }
        } else {
            zzaoVar = zzao.zzf;
        }
        if (zzaoVar instanceof zzai) {
            hashMap.put(zzc, (zzai) zzaoVar);
        }
        return zzaoVar;
    }
}

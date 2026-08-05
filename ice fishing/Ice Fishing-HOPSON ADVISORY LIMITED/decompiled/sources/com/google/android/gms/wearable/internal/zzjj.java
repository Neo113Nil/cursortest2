package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import java.util.HashMap;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzjj extends zzjf {
    public zzjj(BaseImplementation.ResultHolder resultHolder) {
        super(resultHolder);
    }

    @Override // com.google.android.gms.wearable.internal.zza, com.google.android.gms.wearable.internal.zzgm
    public final void zzB(zzeh zzehVar) {
        Status zza = zziy.zza(zzehVar.zza);
        List<zzao> list = zzehVar.zzb;
        HashMap hashMap = new HashMap();
        if (list != null) {
            for (zzao zzaoVar : list) {
                hashMap.put(zzaoVar.getName(), new zzad(zzaoVar));
            }
        }
        zzS(new zzae(zza, hashMap));
    }
}

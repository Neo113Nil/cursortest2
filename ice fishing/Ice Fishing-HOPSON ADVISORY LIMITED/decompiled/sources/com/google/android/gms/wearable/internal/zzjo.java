package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.internal.BaseImplementation;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzjo extends zzjf {
    public zzjo(BaseImplementation.ResultHolder resultHolder) {
        super(resultHolder);
    }

    @Override // com.google.android.gms.wearable.internal.zza, com.google.android.gms.wearable.internal.zzgm
    public final void zzp(zzfh zzfhVar) {
        ArrayList arrayList = new ArrayList();
        List list = zzfhVar.zzb;
        if (list != null) {
            arrayList.addAll(list);
        }
        zzS(new zzho(zziy.zza(zzfhVar.zza), arrayList));
    }
}

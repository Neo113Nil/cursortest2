package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.internal.BaseImplementation;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.FutureTask;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzjv extends zzjf {
    private final List zza;

    zzjv(BaseImplementation.ResultHolder resultHolder, List list) {
        super(resultHolder);
        this.zza = list;
    }

    @Override // com.google.android.gms.wearable.internal.zza, com.google.android.gms.wearable.internal.zzgm
    public final void zzh(zzil zzilVar) {
        int i = zzilVar.zza;
        zzS(new zzdd(zziy.zza(i), zzilVar.zzb));
        if (i != 0) {
            Iterator it = this.zza.iterator();
            while (it.hasNext()) {
                ((FutureTask) it.next()).cancel(true);
            }
        }
    }
}

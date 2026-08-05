package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzgt extends zzjf {
    private final WeakReference zza;
    private final WeakReference zzb;

    zzgt(Map map, Object obj, BaseImplementation.ResultHolder resultHolder) {
        super(resultHolder);
        this.zza = new WeakReference(map);
        this.zzb = new WeakReference(obj);
    }

    @Override // com.google.android.gms.wearable.internal.zza, com.google.android.gms.wearable.internal.zzgm
    public final void zzy(Status status) {
        Map map = (Map) this.zza.get();
        Object obj = this.zzb.get();
        if (status.getStatus().getStatusCode() == 4002 && map != null && obj != null) {
            synchronized (map) {
                zzko zzkoVar = (zzko) map.remove(obj);
                if (zzkoVar != null) {
                    zzkoVar.zzu();
                }
            }
        }
        zzS(status);
    }
}

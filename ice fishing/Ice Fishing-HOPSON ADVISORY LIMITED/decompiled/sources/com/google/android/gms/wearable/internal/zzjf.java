package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.internal.BaseImplementation;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
class zzjf extends zza {
    private BaseImplementation.ResultHolder zza;

    public zzjf(BaseImplementation.ResultHolder resultHolder) {
        this.zza = resultHolder;
    }

    public final void zzS(Object obj) {
        BaseImplementation.ResultHolder resultHolder = this.zza;
        if (resultHolder != null) {
            resultHolder.setResult(obj);
            this.zza = null;
        }
    }
}

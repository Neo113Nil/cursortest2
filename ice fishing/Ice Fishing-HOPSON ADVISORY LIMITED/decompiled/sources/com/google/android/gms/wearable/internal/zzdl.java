package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.wearable.DataApi;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final /* synthetic */ class zzdl implements PendingResultUtil.ResultConverter {
    static final /* synthetic */ zzdl zza = new zzdl();

    private /* synthetic */ zzdl() {
    }

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final /* synthetic */ Object convert(Result result) {
        return new zzdp((DataApi.GetFdForAssetResult) result);
    }
}

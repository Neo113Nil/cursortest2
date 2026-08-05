package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.wearable.CapabilityApi;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final /* synthetic */ class zzak implements PendingResultUtil.ResultConverter {
    static final /* synthetic */ zzak zza = new zzak();

    private /* synthetic */ zzak() {
    }

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final /* synthetic */ Object convert(Result result) {
        return ((CapabilityApi.GetCapabilityResult) result).getCapability();
    }
}

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.wearable.Channel;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final /* synthetic */ class zzaz implements PendingResultUtil.ResultConverter {
    static final /* synthetic */ zzaz zza = new zzaz();

    private /* synthetic */ zzaz() {
    }

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final /* synthetic */ Object convert(Result result) {
        return ((Channel.GetInputStreamResult) result).getInputStream();
    }
}

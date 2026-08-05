package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wearable.ChannelApi;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzav implements BaseImplementation.ResultHolder {
    final /* synthetic */ TaskCompletionSource zza;

    zzav(zzbo zzboVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
        Objects.requireNonNull(zzboVar);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final void setFailedResult(Status status) {
        this.zza.setException(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        ChannelApi.OpenChannelResult openChannelResult = (ChannelApi.OpenChannelResult) obj;
        TaskUtil.setResultOrApiException(openChannelResult.getStatus(), openChannelResult.getStatus().isSuccess() ? zzbo.zzc(openChannelResult.getChannel()) : null, this.zza);
    }
}

package com.google.android.gms.internal.p000authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback$Stub;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
public final class zban extends IStatusCallback$Stub {
    public final /* synthetic */ TaskCompletionSource zba;

    public zban(TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback$Stub
    public final void onResult(Status status) {
        TaskUtil.setResultOrApiException(status, null, this.zba);
    }
}

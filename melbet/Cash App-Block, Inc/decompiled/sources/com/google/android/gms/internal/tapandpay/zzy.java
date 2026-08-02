package com.google.android.gms.internal.tapandpay;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
public final class zzy extends zzah {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TaskCompletionSource zza;

    public /* synthetic */ zzy(int i, TaskCompletionSource taskCompletionSource) {
        this.$r8$classId = i;
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzah
    public void zzN(Status status, String str) {
        switch (this.$r8$classId) {
            case 1:
                TaskUtil.trySetResultOrApiException(status, str, this.zza);
                break;
            default:
                super.zzN(status, str);
                break;
        }
    }

    @Override // com.google.android.gms.internal.tapandpay.zzah
    public void zzg(Status status, String str) {
        switch (this.$r8$classId) {
            case 0:
                TaskUtil.trySetResultOrApiException(status, str, this.zza);
                break;
            default:
                super.zzg(status, str);
                break;
        }
    }
}

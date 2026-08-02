package com.google.android.gms.wallet.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wallet.AutoResolveHelper;
import com.google.android.gms.wallet.PaymentData;

/* loaded from: classes4.dex */
public final class zze extends zzb {
    public final /* synthetic */ int $r8$classId;
    public final TaskCompletionSource zza;

    public /* synthetic */ zze(int i, TaskCompletionSource taskCompletionSource) {
        this.$r8$classId = i;
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public void onIsReadyToPayDetermined(Status status, boolean z) {
        switch (this.$r8$classId) {
            case 0:
                TaskUtil.setResultOrApiException(status, Boolean.valueOf(z), this.zza);
                break;
        }
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public void onPaymentDataLoaded(Status status, PaymentData paymentData) {
        switch (this.$r8$classId) {
            case 1:
                int i = AutoResolveHelper.$r8$clinit;
                boolean isSuccess = status.isSuccess();
                TaskCompletionSource taskCompletionSource = this.zza;
                if (!isSuccess) {
                    taskCompletionSource.setException(zzae.fromStatus(status));
                    break;
                } else {
                    taskCompletionSource.setResult(paymentData);
                    break;
                }
        }
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public void onPreAuthorizationDetermined(int i, boolean z) {
        switch (this.$r8$classId) {
            case 0:
                TaskUtil.setResultOrApiException(new Status(i, null, null, null), Boolean.valueOf(z), this.zza);
                break;
        }
    }
}

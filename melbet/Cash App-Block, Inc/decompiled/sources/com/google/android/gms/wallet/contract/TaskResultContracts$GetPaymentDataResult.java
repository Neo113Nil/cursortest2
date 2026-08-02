package com.google.android.gms.wallet.contract;

import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.AutoResolveHelper;
import com.google.android.gms.wallet.PaymentData;
import com.stripe.android.financialconnections.utils.ErrorsKt;

/* loaded from: classes4.dex */
public final class TaskResultContracts$GetPaymentDataResult extends TaskResultContracts$GetApiTaskResult<PaymentData> {
    @Override // com.google.android.gms.wallet.contract.TaskResultContracts$GetApiTaskResult, androidx.activity.result.contract.ActivityResultContract
    public final ApiTaskResult parseResult(int i, Intent intent) {
        if (i != 1) {
            return super.parseResult(i, intent);
        }
        int i2 = AutoResolveHelper.$r8$clinit;
        Status status = intent == null ? null : (Status) intent.getParcelableExtra("com.google.android.gms.common.api.AutoResolveHelper.status");
        if (status == null) {
            status = Status.RESULT_INTERNAL_ERROR;
        }
        return new ApiTaskResult(null, status);
    }

    @Override // com.google.android.gms.wallet.contract.TaskResultContracts$GetApiTaskResult
    public final PaymentData taskResultFromIntent(Intent intent) {
        Parcelable.Creator<PaymentData> creator = PaymentData.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.PaymentData");
        return (PaymentData) (byteArrayExtra == null ? null : ErrorsKt.deserializeFromBytes(byteArrayExtra, creator));
    }
}

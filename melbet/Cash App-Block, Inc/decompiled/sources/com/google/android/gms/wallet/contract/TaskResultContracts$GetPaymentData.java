package com.google.android.gms.wallet.contract;

import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.wallet.PaymentData;
import com.stripe.android.financialconnections.utils.ErrorsKt;

/* loaded from: classes4.dex */
public final class TaskResultContracts$GetPaymentData extends TaskResultContracts$UnpackApiTaskResult<PaymentData> {
    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Object parseResult(int i, Intent intent) {
        if (intent == null) {
            return null;
        }
        Parcelable.Creator<PaymentData> creator = PaymentData.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.PaymentData");
        return (PaymentData) (byteArrayExtra != null ? ErrorsKt.deserializeFromBytes(byteArrayExtra, creator) : null);
    }
}

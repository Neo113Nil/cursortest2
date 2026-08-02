package com.google.android.gms.wallet;

import com.fillr.m1;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.zacn;
import com.google.android.gms.tasks.zzw;

/* loaded from: classes4.dex */
public final class PaymentsClient extends GoogleApi {
    public final zzw isReadyToPay(IsReadyToPayRequest isReadyToPayRequest) {
        zacn builder = zacn.builder();
        builder.zac = 23705;
        builder.zaa = new com.google.android.gms.tasks.zzb(isReadyToPayRequest, 25);
        return zae(0, builder.build());
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [com.google.android.gms.common.Feature[], java.io.Serializable] */
    public final zzw loadPaymentData(PaymentDataRequest paymentDataRequest) {
        zacn builder = zacn.builder();
        builder.zaa = new m1(paymentDataRequest, 28);
        builder.zaa$1 = new Feature[]{zzk.zzc};
        builder.zab = true;
        builder.zac = 23707;
        return zae(1, builder.build());
    }
}

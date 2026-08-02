package com.squareup.cash.google.pay;

import app.cash.api.ApiResult;
import com.squareup.cash.blockers.analytics.BlockerResponse;
import com.squareup.protos.cash.cashliteflow.api.v1.PushProvisionGooglePayResponse;
import com.squareup.protos.cash.cashliteflow.api.v1.PushProvisionStatus;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class CashLiteGooglePayProvisioningGateway$provision$2$result$1 implements Function1 {
    public static final CashLiteGooglePayProvisioningGateway$provision$2$result$1 INSTANCE = new CashLiteGooglePayProvisioningGateway$provision$2$result$1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ApiResult.Success success = (ApiResult.Success) obj;
        success.getClass();
        PushProvisionGooglePayResponse pushProvisionGooglePayResponse = (PushProvisionGooglePayResponse) success.response;
        PushProvisionStatus pushProvisionStatus = pushProvisionGooglePayResponse.status;
        if (pushProvisionStatus != PushProvisionStatus.PUSH_PROVISION_STATUS_SUCCESS) {
            return new BlockerResponse.Error(pushProvisionStatus != null ? pushProvisionStatus.name() : null, (String) null, 6);
        }
        if (pushProvisionGooglePayResponse.opaque_payment_card == null) {
            return new BlockerResponse.Error("MISSING_OPAQUE_PAYMENT_CARD", (String) null, 6);
        }
        return null;
    }
}

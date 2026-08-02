package com.fidesmo.sec.delivery;

import com.google.gson.JsonObject;
import io.reactivex.rxjava3.functions.Function;

/* loaded from: classes4.dex */
public final /* synthetic */ class ExternalDeliverySecClient$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ExternalDeliverySecClient f$0;

    public /* synthetic */ ExternalDeliverySecClient$$ExternalSyntheticLambda0(ExternalDeliverySecClient externalDeliverySecClient, int i) {
        this.$r8$classId = i;
        this.f$0 = externalDeliverySecClient;
    }

    @Override // io.reactivex.rxjava3.functions.Function, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    /* renamed from: apply */
    public final Object mo39apply(Object obj) {
        ServiceDeliveryResponse lambda$serviceDeliver$1;
        SecResponse lambda$serviceError$3;
        FetchOperationResponse lambda$serviceFetch$2;
        SecResponse lambda$connector$0;
        int i = this.$r8$classId;
        ExternalDeliverySecClient externalDeliverySecClient = this.f$0;
        JsonObject jsonObject = (JsonObject) obj;
        switch (i) {
            case 0:
                lambda$serviceDeliver$1 = externalDeliverySecClient.lambda$serviceDeliver$1(jsonObject);
                return lambda$serviceDeliver$1;
            case 1:
                lambda$serviceError$3 = externalDeliverySecClient.lambda$serviceError$3(jsonObject);
                return lambda$serviceError$3;
            case 2:
                lambda$serviceFetch$2 = externalDeliverySecClient.lambda$serviceFetch$2(jsonObject);
                return lambda$serviceFetch$2;
            default:
                lambda$connector$0 = externalDeliverySecClient.lambda$connector$0(jsonObject);
                return lambda$connector$0;
        }
    }
}

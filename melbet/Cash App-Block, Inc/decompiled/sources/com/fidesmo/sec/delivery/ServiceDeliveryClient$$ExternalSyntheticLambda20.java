package com.fidesmo.sec.delivery;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.functions.Function;

/* loaded from: classes4.dex */
public final /* synthetic */ class ServiceDeliveryClient$$ExternalSyntheticLambda20 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ServiceDeliveryClient f$0;
    public final /* synthetic */ FetchOperationRequest f$1;
    public final /* synthetic */ Integer f$2;

    public /* synthetic */ ServiceDeliveryClient$$ExternalSyntheticLambda20(ServiceDeliveryClient serviceDeliveryClient, FetchOperationRequest fetchOperationRequest, Integer num, int i) {
        this.$r8$classId = i;
        this.f$0 = serviceDeliveryClient;
        this.f$1 = fetchOperationRequest;
        this.f$2 = num;
    }

    @Override // io.reactivex.rxjava3.functions.Function, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    /* renamed from: apply */
    public final Object mo39apply(Object obj) {
        ObservableSource lambda$handleNoContentResponse$28;
        ObservableSource lambda$handleNoContentResponse$27;
        int i = this.$r8$classId;
        Integer num = this.f$2;
        FetchOperationRequest fetchOperationRequest = this.f$1;
        ServiceDeliveryClient serviceDeliveryClient = this.f$0;
        switch (i) {
            case 0:
                lambda$handleNoContentResponse$28 = serviceDeliveryClient.lambda$handleNoContentResponse$28(fetchOperationRequest, num, (Long) obj);
                return lambda$handleNoContentResponse$28;
            default:
                lambda$handleNoContentResponse$27 = serviceDeliveryClient.lambda$handleNoContentResponse$27(fetchOperationRequest, num, (FetchOperationResponse) obj);
                return lambda$handleNoContentResponse$27;
        }
    }
}

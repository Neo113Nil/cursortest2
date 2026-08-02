package com.fidesmo.sec.delivery;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.functions.Function;

/* loaded from: classes4.dex */
public final /* synthetic */ class ServiceDeliveryClient$$ExternalSyntheticLambda4 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ServiceDeliveryClient f$0;
    public final /* synthetic */ FetchOperationRequest f$1;

    public /* synthetic */ ServiceDeliveryClient$$ExternalSyntheticLambda4(ServiceDeliveryClient serviceDeliveryClient, FetchOperationRequest fetchOperationRequest, int i) {
        this.$r8$classId = i;
        this.f$0 = serviceDeliveryClient;
        this.f$1 = fetchOperationRequest;
    }

    @Override // io.reactivex.rxjava3.functions.Function, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    /* renamed from: apply */
    public final Object mo39apply(Object obj) {
        ObservableSource lambda$getFetchOperationCall$14;
        ObservableSource lambda$getSendActionCall$16;
        ObservableSource lambda$getSendUserDataCall$15;
        int i = this.$r8$classId;
        FetchOperationRequest fetchOperationRequest = this.f$1;
        ServiceDeliveryClient serviceDeliveryClient = this.f$0;
        FetchOperationResponse fetchOperationResponse = (FetchOperationResponse) obj;
        switch (i) {
            case 0:
                lambda$getFetchOperationCall$14 = serviceDeliveryClient.lambda$getFetchOperationCall$14(fetchOperationRequest, fetchOperationResponse);
                return lambda$getFetchOperationCall$14;
            case 1:
                lambda$getSendActionCall$16 = serviceDeliveryClient.lambda$getSendActionCall$16(fetchOperationRequest, fetchOperationResponse);
                return lambda$getSendActionCall$16;
            default:
                lambda$getSendUserDataCall$15 = serviceDeliveryClient.lambda$getSendUserDataCall$15(fetchOperationRequest, fetchOperationResponse);
                return lambda$getSendUserDataCall$15;
        }
    }
}

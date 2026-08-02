package com.fidesmo.sec.delivery;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import java.util.List;

/* loaded from: classes4.dex */
public final /* synthetic */ class ServiceDeliveryClient$$ExternalSyntheticLambda5 implements Function, Consumer, BiFunction {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ServiceDeliveryClient f$0;

    public /* synthetic */ ServiceDeliveryClient$$ExternalSyntheticLambda5(ServiceDeliveryClient serviceDeliveryClient, int i) {
        this.$r8$classId = i;
        this.f$0 = serviceDeliveryClient;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public void accept(Object obj) {
        int i = this.$r8$classId;
        ServiceDeliveryClient serviceDeliveryClient = this.f$0;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 0:
                serviceDeliveryClient.lambda$retryCall$18(th);
                break;
            case 4:
                serviceDeliveryClient.lambda$retryCall$23(th);
                break;
            default:
                serviceDeliveryClient.lambda$serviceError$26(th);
                break;
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    /* renamed from: apply */
    public Object mo39apply(Object obj) {
        TransceiveResult lambda$getTransceiveCall$9;
        ObservableSource lambda$getTransceiveCall$10;
        TransceiveResult lambda$getTransceiveCall$13;
        int i = this.$r8$classId;
        ServiceDeliveryClient serviceDeliveryClient = this.f$0;
        switch (i) {
            case 1:
                lambda$getTransceiveCall$9 = serviceDeliveryClient.lambda$getTransceiveCall$9((List) obj);
                return lambda$getTransceiveCall$9;
            case 2:
                lambda$getTransceiveCall$10 = serviceDeliveryClient.lambda$getTransceiveCall$10((Throwable) obj);
                return lambda$getTransceiveCall$10;
            default:
                lambda$getTransceiveCall$13 = serviceDeliveryClient.lambda$getTransceiveCall$13((List) obj);
                return lambda$getTransceiveCall$13;
        }
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Observable apply(Object obj, Object obj2) {
        Observable lambda$retryCall$19;
        lambda$retryCall$19 = this.f$0.lambda$retryCall$19((Throwable) obj, (Integer) obj2);
        return lambda$retryCall$19;
    }
}

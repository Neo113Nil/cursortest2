package com.fidesmo.sec.delivery;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;

/* loaded from: classes4.dex */
public final /* synthetic */ class ServiceDeliveryClient$$ExternalSyntheticLambda8 implements ObservableTransformer, Function, Consumer {
    public final /* synthetic */ ServiceDeliveryClient f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ ServiceDeliveryClient$$ExternalSyntheticLambda8(ServiceDeliveryClient serviceDeliveryClient, String str, String str2) {
        this.f$0 = serviceDeliveryClient;
        this.f$1 = str;
        this.f$2 = str2;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public void accept(Object obj) {
        this.f$0.lambda$retryCall$21(this.f$1, this.f$2, obj);
    }

    @Override // io.reactivex.rxjava3.functions.Function, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    /* renamed from: apply */
    public Object mo39apply(Object obj) {
        ObservableSource lambda$retryCall$22;
        lambda$retryCall$22 = this.f$0.lambda$retryCall$22(this.f$1, this.f$2, (Observable) obj);
        return lambda$retryCall$22;
    }
}

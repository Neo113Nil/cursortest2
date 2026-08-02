package ru.yandex.taxi.delivery.impl.paid_insurance;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.delivery.impl.paid_insurance.DeliveryPaidInsurancePresenter", f = "DeliveryPaidInsurancePresenter.kt", l = {32, 35, 36, 59, 60, 64, 65, HProv.ALG_SID_GR3410_12_256, 74, HProv.ALG_SID_SHA3_256, HProv.ALG_SID_SHA3_384}, m = "getArgs", v = 2)
/* loaded from: classes5.dex */
final class DeliveryPaidInsurancePresenter$getArgs$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryPaidInsurancePresenter$getArgs$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}

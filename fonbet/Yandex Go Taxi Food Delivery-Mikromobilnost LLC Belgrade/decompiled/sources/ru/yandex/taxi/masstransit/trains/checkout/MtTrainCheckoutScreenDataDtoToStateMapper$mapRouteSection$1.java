package ru.yandex.taxi.masstransit.trains.checkout;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.masstransit.trains.checkout.MtTrainCheckoutScreenDataDtoToStateMapper", f = "MtTrainCheckoutScreenDataDtoToStateMapper.kt", l = {HProv.PP_SAME_MEDIA, HProv.PP_DELETE_KEYSET}, m = "mapRouteSection", v = 2)
/* loaded from: classes6.dex */
final class MtTrainCheckoutScreenDataDtoToStateMapper$mapRouteSection$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtTrainCheckoutScreenDataDtoToStateMapper$mapRouteSection$1(k kVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return k.e(this.this$0, null, this);
    }
}

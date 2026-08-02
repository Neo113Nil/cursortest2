package ru.yandex.taxi.masstransit.stop.interactor;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.masstransit.stop.interactor.MtStopAddressUpdateInteractor", f = "MtStopAddressUpdateInteractor.kt", l = {82, HProv.ALG_SID_NO_HASH}, m = "requestSource", v = 2)
/* loaded from: classes6.dex */
final class MtStopAddressUpdateInteractor$requestSource$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtStopAddressUpdateInteractor$requestSource$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return b.a(this.this$0, null, null, this);
    }
}
